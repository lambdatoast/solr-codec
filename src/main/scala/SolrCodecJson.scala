package solrcodec
import argonaut._, Argonaut._

trait SolrCodecJson {
  type Doc
  case class QueryResponse(numFound: Int, docs: List[Doc])
  case class HttpResponse(response: QueryResponse)

  implicit def DocCodec: CodecJson[Doc]
  implicit def QueryResponseCodec = casecodec2(QueryResponse.apply, QueryResponse.unapply)("numFound", "docs")
  implicit def HttpResponseCodec = casecodec1(HttpResponse.apply, HttpResponse.unapply)("response")

  def decode(s: String) = s.decodeValidation[HttpResponse]
  def encode(o: Doc): Json = o.asJson
  def encodeToString(o: Doc): String = encode(o).spaces2

}

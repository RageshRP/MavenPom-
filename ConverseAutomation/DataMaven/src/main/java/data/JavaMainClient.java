package data;

import java.io.IOException;
import java.time.LocalDate;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaMainClient {

	public static void main(String[] args) throws IOException {
//		RestHighLevelClient client = new RestHighLevelClient(
//				RestClient.builder(new HttpHost("localhost", 9200, "http")));
//		CreateIndexRequest request = new CreateIndexRequest("message_historyy");
//        request.settings(Settings.builder().put("index.number_of_shards", 3).put("index.number_of_replicas", 2));
//CreateIndexResponse createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
//System.out.println("response id: " + createIndexResponse.index());
		messagehist mh = new messagehist("Elon", "Musk",  LocalDate.now() );
		 
		IndexRequest indexRequest = new IndexRequest("sampleIndex");
		indexRequest.id("003");
		indexRequest.source(new ObjectMapper().writeValueAsString(mh), XContentType.JSON);
		IndexResponse indexResponse = client.index(indexRequest, RequestOptions.DEFAULT);
		System.out.println("response id: "+indexResponse.getId());
		System.out.println("response name: "+indexResponse.getResult().name());


	}

}

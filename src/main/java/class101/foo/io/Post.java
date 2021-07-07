package class101.foo.io;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "post")
public class Post {
    private String id;
    private String content;
}

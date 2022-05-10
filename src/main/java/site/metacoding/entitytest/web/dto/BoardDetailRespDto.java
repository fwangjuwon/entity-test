package site.metacoding.entitytest.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDetailRespDto {
    //    private Board board; //이렇게하면 결국 entity가 들어온거다
    private Integer id;
    private String title;
    private String content;  //이 세개를 보드라고 안하고 따로 만드는거다.
    private boolean isLove; //이걸 여기에 넣어주는거다. 

}

package site.metacoding.entitytest.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.entitytest.domain.Board;
import site.metacoding.entitytest.domain.BoardImplRepository;
import site.metacoding.entitytest.domain.BoardRepository;
import site.metacoding.entitytest.web.dto.BoardDetailRespDto;
import site.metacoding.entitytest.web.dto.BoardRespDto;

@RequiredArgsConstructor
@Service
public class BoardService {
    
    private final BoardRepository boardRepository; //api
    private final BoardImplRepository boardImplRepository; //jpql

    public BoardRespDto 상세보기(Integer id) {
        Board boardEntity = boardRepository.findById(id).get();
       
        //서비스단에서 필요한 데이터를 다 만들어가는 것 
        //영속상태로 만들면 땡겨쓸때 문제가 된다. 
        BoardRespDto dto = new BoardRespDto(
            boardEntity.getId(),
            boardEntity.getTitle(),
            boardEntity.getContent()
        );
       
        return dto;
    }

    public BoardDetailRespDto 좋아요포함상세보기(Integer id) {
        return boardImplRepository.mFindDetail(id);
    }

}

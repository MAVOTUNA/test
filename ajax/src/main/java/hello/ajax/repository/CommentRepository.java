package hello.ajax.repository;

import hello.ajax.domain.CommentDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    List<CommentDto> repository = new ArrayList<>();

    public int insertComment(CommentDto commentDto) {

        repository.add(commentDto);

        return 1;
    }

    public CommentDto selectCommentDetail(int idx) {

        for (CommentDto commentDto : repository) {
            if(commentDto.getIdx() == idx) return commentDto;
        }

        return null;
    }

    public int updateComment(CommentDto params) {
        return 1;
    }

    public int deleteComment(int idx) {
        for (CommentDto commentDto : repository) {
            if(commentDto.getIdx() == idx) {
                repository.remove(commentDto);
                return 1;
            }
        }
        return 0;
    }

    public List<CommentDto> selectCommentList() {
        return repository;
    }

    public int selectCommentTotalCount() {
        return repository.size();
    }


}

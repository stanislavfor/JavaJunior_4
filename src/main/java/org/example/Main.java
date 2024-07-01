package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostDAO postDAO = new PostDAO();
        PostCommentDAO postCommentDAO = new PostCommentDAO();


        Post post = new Post();
        post.setTitle("'Публикации'");
        postDAO.savePost(post);


        PostComment comment = new PostComment();
        comment.setText("'Комментарий'");
        comment.setPost(post);
        postCommentDAO.savePostComment(comment);


        Post loadedPost = postDAO.getPost(post.getId());
        System.out.println("Загружена публикация : " + loadedPost.getTitle());


        PostComment loadedComment = postCommentDAO.getPostComment(comment.getId());
        System.out.println("Загружен комментарий : " + loadedComment.getText());


        loadedPost.setTitle("'Обновлен заголовок публикации'");
        postDAO.updatePost(loadedPost);
        System.out.println("Обновленная  публикация : " + loadedPost.getTitle());


        loadedComment.setText("'Обновлен текст комментария'");
        postCommentDAO.updatePostComment(loadedComment);
        System.out.println("Обновленный комментарий : " + loadedComment.getText());


        List<Post> allPosts = postDAO.getPosts();
        System.out.println("Все публикации : ");
        allPosts.forEach(p -> System.out.println(p.getTitle()));


        List<PostComment> allComments = postCommentDAO.getPostComments();
        System.out.println("Все комментарии : ");
        allComments.forEach(c -> System.out.println(c.getText()));


        postCommentDAO.deletePostComment(loadedComment.getId());
        System.out.println("Удален комментарий с ID : " + loadedComment.getId());


        postDAO.deletePost(loadedPost.getId());
        System.out.println("Удалена публикация с ID : " + loadedPost.getId());
    }
}

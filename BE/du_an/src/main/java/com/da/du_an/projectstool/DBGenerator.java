package com.da.du_an.projectstool;

import com.da.du_an.democode.enity.*;
import com.da.du_an.democode.infrastructure.contain.MovieRank;
import com.da.du_an.democode.infrastructure.contain.Role;
import com.da.du_an.democode.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.da.du_an.democode.repository"
)
public class DBGenerator implements CommandLineRunner {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private DetailMovieRepository detailMovieRepository;

    @Autowired
    private ImgCommentRepository imgCommentRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private PlayListMovieRepository playListMovieRepository;

    @Autowired
    private PlayListRepository playListRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private ViewHistoryRepository viewHistoryRepository;


    public void run(String... args) throws Exception {

        //category
        Category category=new Category();
        category.setName("Kinh dị");
        category.setDesc("Thể loại phim mang yếu tố máu me, ghê dợn, không dành cho những người yếu tim");
        categoryRepository.save(category);

        Category category1=new Category();
        category1.setName("lãng mạn");
        category1.setDesc("Thể loại phim mang yếu tố yêu đương, tình cảm");
        categoryRepository.save(category1);

        Category category2=new Category();
        category2.setName("Võ thuật");
        category2.setDesc("Thể loại phim mang lại những cảnh đánh nhau, solo thể hiện các loại võ qua màn ảnh");
        categoryRepository.save(category2);

        Category category4=new Category();
        category4.setName("Phiêu lưu");
        category4.setDesc("Thể loại phim mang yếu tố kì bí, thám hiểm qua các vùng đất hoặc khám phá thế giới");
        categoryRepository.save(category4);

        Category category5=new Category();
        category5.setName("Khoa học viến tưởng");
        category5.setDesc("Thể loại phim mang yếu tố khoa học và những điều không thực tế hay không có thật trên thế giới");
        categoryRepository.save(category5);

        Category category6=new Category();
        category6.setName("Hài");
        category6.setDesc("Thể loại phim mang yếu tố gây cười");
        categoryRepository.save(category6);

        Category category7=new Category();
        category7.setName("Trinh thám");
        category7.setDesc("Thể loại phim có yếu tố li kì, kích thích");
        categoryRepository.save(category7);

        //movie
        Movie movie=new Movie();
        movie.setName("Naruto");
        movie.setAnotherName("...");
        movie.setAuthor("None");
        movie.setBroadcastTime(1996);
        movie.setEndTime(2018);
        movieRepository.save(movie);

        Movie movie4=new Movie();
        movie.setName("movie Doraemon2024");
        movie.setAnotherName("...");
        movie.setAuthor("None");
        movie.setBroadcastTime(2024);
        movie.setEndTime(2024);
        movieRepository.save(movie);

        Movie movie1=new Movie();
        movie1.setName("One Piece");
        movie1.setAnotherName("...");
        movie1.setAuthor("None");
        movie1.setBroadcastTime(1996);
        movie1.setEndTime(2018);
        movieRepository.save(movie1);

        Movie movie2=new Movie();
        movie2.setName("Conan");
        movie2.setAnotherName("...");
        movie2.setAuthor("None");
        movie2.setBroadcastTime(1996);
        movie2.setEndTime(2018);
        movieRepository.save(movie2);

        //detail movie
        DetailMovie detailMovie=new DetailMovie();
        detailMovie.setMovie(movie);
        detailMovie.setMovieType(MovieRank.NORMAL);
        detailMovie.setPoint(9.0);
        detailMovie.setDesc("Một bộ phim hay đầy hấp dẫn với các tình tiết hay của cuộc đời nhân vật Naruto");
        detailMovieRepository.save(detailMovie);

        DetailMovie detailMovie1=new DetailMovie();
        detailMovie1.setMovie(movie1);
        detailMovie1.setMovieType(MovieRank.NORMAL);
        detailMovie1.setPoint(9.0);
        detailMovie1.setDesc("Một bộ phim hay đầy hấp dẫn với các tình tiết hay của cuộc đời nhân vật luffy");
        detailMovieRepository.save(detailMovie1);

        DetailMovie detailMovie2=new DetailMovie();
        detailMovie2.setMovie(movie4);
        detailMovie2.setMovieType(MovieRank.VIP);
        detailMovie2.setPoint(9.0);
        detailMovie2.setDesc("Một bộ phim hay về tình bạn");
        detailMovieRepository.save(detailMovie2);

        //video
        Video video=new Video();
        video.setVideoUrl("1");
        videoRepository.save(video);

        Video video1=new Video();
        video1.setVideoUrl("2");
        videoRepository.save(video1);

        //User
        User user=new User();
        user.setName("dung");
        user.setUsername("hieu");
        user.setEmail("dungvk10@gmail.com");
        user.setPassword("dungcuongx3");
        user.setPhoneNumber("0860569125");
        user.setRole(Role.CUSTOMER);
        userRepository.save(user);

        User user1=new User();
        user1.setName("hoan");
        user1.setUsername("hoan");
        user1.setEmail("hoanvk10@gmail.com");
        user1.setPassword("dungcuongx3");
        user1.setPhoneNumber("0860569126");
        user1.setRole(Role.ADMIN);
        userRepository.save(user1);

        User user2=new User();
        user2.setName("hieu");
        user2.setUsername("hieu");
        user2.setEmail("hieuvk10@gmail.com");
        user2.setPassword("dungcuongx3");
        user2.setPhoneNumber("0860569127");
        user2.setRole(Role.ADMIN);
        userRepository.save(user2);

        //PlayList
        PlayList playList=new PlayList();
        playList.setPlaylistName("Danh sách yêu thích");
        playList.setFavoriteOrder(1);
        playList.setUser(user);
        playListRepository.save(playList);

        PlayList playList1=new PlayList();
        playList1.setPlaylistName("Danh sách yêu thích");
        playList1.setFavoriteOrder(1);
        playList1.setUser(user);
        playListRepository.save(playList1);

        PlayList playList2=new PlayList();
        playList2.setPlaylistName("Danh sách yêu thích");
        playList2.setFavoriteOrder(1);
        playList2.setUser(user);
        playListRepository.save(playList);

        //playlistmovie
        PlayListMovie playListMovie=new PlayListMovie();
        playListMovie.setDetailMovie(detailMovie);
        playListMovie.setPlayList(playList);
        playListMovieRepository.save(playListMovie);

        PlayListMovie playListMovie1=new PlayListMovie();
        playListMovie1.setDetailMovie(detailMovie1);
        playListMovie1.setPlayList(playList1);
        playListMovieRepository.save(playListMovie1);

        //comment
        Comment comment=new Comment();
        comment.setComment("Vo dich thien ha");
        comment.setDetailMovie(detailMovie);
        comment.setUser(user);
        commentRepository.save(comment);

        Comment comment1=new Comment();
        comment1.setComment("ai cha");
        comment1.setDetailMovie(detailMovie1);
        comment1.setUser(user);
        commentRepository.save(comment1);

        //img comment
        ImgComment imgComment=new ImgComment();
        imgComment.setComment(comment);
        imgComment.setImgUrl("ss");
        imgCommentRepository.save(imgComment);

        //view history
        ViewHistory viewHistory=new ViewHistory();
        viewHistory.setUser(user);
        viewHistory.setDate(1697987691L);
        viewHistory.setDetailMovie(detailMovie);
        viewHistoryRepository.save(viewHistory);

        //booking
        Booking booking=new Booking();
        booking.setDetailMovie(detailMovie2);
        booking.setUser(user);
        booking.setStartDate(1701771648L);
        booking.setEndDate(1701778848L);
        booking.setNote("");
        booking.setTotalPrice(new BigDecimal(100));
        bookingRepository.save(booking);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }

}
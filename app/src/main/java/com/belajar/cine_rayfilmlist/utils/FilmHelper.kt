package com.belajar.cine_rayfilmlist.utils

import com.belajar.cine_rayfilmlist.model.Movie
import com.belajar.cine_rayfilmlist.model.TVShow

class FilmHelper {

    fun generateMovieList() : List<Movie> {
        val movie = ArrayList<Movie>()

        movie.add(Movie(
            title = "Cold Pursuit",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.56,
            overview = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            genre = "Action, Crime, Thriller",
            duration = 119,
            forAdult = false,
            yearReleased = 2019
        ))
        movie.add(Movie(
            title = "A Star Is Born",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.75,
            overview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            genre = "Drama, Romance, Music",
            duration = 136,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "Alita: Battle Angel",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.72,
            overview = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            genre = "Action, Science Fiction, Adventure",
            duration = 122,
            forAdult = false,
            yearReleased = 2019
        ))
        movie.add(Movie(
            title = "Aquaman",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.69,
            overview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            genre = "Action, Adventure, Fantasy",
            duration = 143,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "Bohemian Rhapsody",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.80,
            overview = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            genre = "Music, Drama, History",
            duration = 135,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "Master Z: Ip Man Legacy",
            originalTitle = "葉問外傳：張天志",
            originalLang = "Cantonese",
            userScore = 0.58,
            overview = "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            genre = "Action",
            duration = 107,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "Spider-Man: Into the Spider-Verse",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.84,
            overview = "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            genre = "Action, Adventure, Animation, Science Fiction, Comedy",
            duration =  117,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "Glass",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.67,
            overview = "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            genre = "Thriller, Drama, Science Fiction",
            duration =  129,
            forAdult = false,
            yearReleased = 2019
        ))
        movie.add(Movie(
            title = "Ralph Breaks the Internet",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.72,
            overview = "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            genre = "Family, Animation, Comedy, Adventure",
            duration =  112,
            forAdult = false,
            yearReleased = 2018
        ))
        movie.add(Movie(
            title = "How to Train Your Dragon",
            originalTitle = "",
            originalLang = "English",
            userScore = 0.78,
            overview = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            genre = "Animation, Family, Adventure",
            duration =  104,
            forAdult = false,
            yearReleased = 2019
        ))

        return movie
    }

    fun generateTVShowList() : List<TVShow> {
        val tvShow = ArrayList<TVShow>()

        tvShow.add(TVShow(
            name = "Naruto Shippūden",
            originalLang = "Japanese",
            originalName = "ナルト 疾風伝",
            userScore = 0.86,
            overview = "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            genre = "Animation, Action, Adventure",
            duration = 25,
            forAdult = false,
            yearReleased = 2007
        ))
        tvShow.add(TVShow(
            name = "Doom Patrol",
            originalLang = "English",
            originalName = "",
            userScore = 0.76,
            overview = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            genre = "Sci-Fi & Fantasy, Comedy, Drama",
            duration = 49,
            forAdult = true,
            yearReleased = 2019
        ))
        tvShow.add(TVShow(
            name = "The Umbrella Academy",
            originalLang = "English",
            originalName = "",
            userScore = 0.88,
            overview = "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
            genre = "Action & Adventure, Sci-Fi & Fantasy, Drama",
            duration = 55,
            forAdult = true,
            yearReleased = 2019
        ))
        tvShow.add(TVShow(
            name = "NCIS",
            originalLang = "English",
            originalName = "",
            userScore = 0.74,
            overview = "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            genre = "Crime, Action & Adventure, Drama",
            duration = 45,
            forAdult = false,
            yearReleased = 2003
        ))
        tvShow.add(TVShow(
            name = "Family Guy",
            originalLang = "English",
            originalName = "",
            userScore = 0.7,
            overview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            genre = "Animation, Comedy",
            duration = 22,
            forAdult = true,
            yearReleased = 1999
        ))
        tvShow.add(TVShow(
            name = "Arrow",
            originalLang = "English",
            originalName = "",
            userScore = 0.66,
            overview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            genre = "Crime, Drama, Mystery, Action & Adventure",
            duration = 42,
            forAdult = false,
            yearReleased = 2012
        ))
        tvShow.add(TVShow(
            name = "Supernatural",
            originalLang = "English",
            originalName = "",
            userScore = 0.82,
            overview = "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            genre = "Drama, Mystery, Sci-Fi & Fantasy",
            duration = 45,
            forAdult = false,
            yearReleased = 2005
        ))
        tvShow.add(TVShow(
            name = "The Simpsons",
            originalLang = "English",
            originalName = "",
            userScore = 0.78,
            overview = "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            genre = "Family, Animation, Comedy",
            duration = 22,
            forAdult = true,
            yearReleased = 1989
        ))
        tvShow.add(TVShow(
            name = "The Walking Dead",
            originalLang = "English",
            originalName = "",
            userScore = 0.8,
            overview = "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            genre = "Action & Adventure, Drama, Sci-Fi & Fantasy",
            duration = 42,
            forAdult = true,
            yearReleased = 2010
        ))
        tvShow.add(TVShow(
            name = "Gotham",
            originalLang = "English",
            originalName = "",
            userScore = 0.75,
            overview = "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            genre = "Drama, Crime, Sci-Fi & Fantasy",
            duration = 43,
            forAdult = false,
            yearReleased = 2014
        ))

        return tvShow
    }
}
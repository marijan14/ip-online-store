var filmovi = [{ime : "Blow",cena : 2365,kosnicka : false ,wishlist : false},
{ime : "Lucky Number Slevin",cena : 738,kosnicka : false ,wishlist : false},
{ime : "The Social Network",cena : 1854,kosnicka : false ,wishlist : false},
{ime : "Lord of War",cena : 1957,kosnicka : false ,wishlist : false},
{ime : "Law Abiding Citizen",cena : 574,kosnicka : false ,wishlist : false},
{ime : "Remember the Titans",cena : 1392,kosnicka : false ,wishlist : false},
{ime : "Wanted",cena : 1281,kosnicka : false ,wishlist : false},
{ime : "The Matrix",cena : 2421,kosnicka : false ,wishlist : false},
{ime : "The Wolf of Wall Street",cena : 1080,kosnicka : false ,wishlist : false},
{ime : "The Godfather",cena : 2478,kosnicka : false ,wishlist : false},
{ime : "Transcendence",cena : 2137,kosnicka : false ,wishlist : false},
{ime : "Valkyrie",cena : 609,kosnicka : false ,wishlist : false},
{ime : "21",cena : 2342,kosnicka : false ,wishlist : false},
{ime : "Moneyball",cena : 637,kosnicka : false ,wishlist : false}];

var laptopi = [{ime : "ASUS X552CL",cena : 48724,kosnicka : false ,wishlist : false},
{ime : "ASUS X750LN-T4046",cena : 68215,kosnicka : false ,wishlist : false},
{ime : "TOSHIBA L50A-1D9",cena : 52098,kosnicka : false ,wishlist : false},
{ime : "ACER E5-511-C0JF",cena : 23074,kosnicka : false ,wishlist : false},
{ime : "ACER E1-570G",cena : 22773,kosnicka : false ,wishlist : false},
{ime : "HP 250 G2 N2810",cena : 61568,kosnicka : false ,wishlist : false},
{ime : "LENOVO G50-30",cena : 54084,kosnicka : false ,wishlist : false},
{ime : "ACER V5-431",cena : 67217,kosnicka : false ,wishlist : false},
{ime : "ACER V5-561",cena : 50170,kosnicka : false ,wishlist : false}];

var tableti = [{ime : "ASUS Memo Pad",cena : 19155,kosnicka : false ,wishlist : false},
{ime : "ASUS  NEXUS 7",cena : 39751,kosnicka : false ,wishlist : false},
{ime : "LENOVO A7600 3G",cena : 44350,kosnicka : false ,wishlist : false},
{ime : "LENOVO IdeaTab",cena : 35361,kosnicka : false ,wishlist : false},
{ime : "NEXTBOOK M1010FP",cena : 20682,kosnicka : false ,wishlist : false}];

var softver = [{ime : "Windows 7",cena : 517,kosnicka : false ,wishlist : false},
{ime : "Windows 8",cena : 528,kosnicka : false ,wishlist : false},
{ime : "Windows XP",cena : 774,kosnicka : false ,wishlist : false},
{ime : "Windows Vista",cena : 855,kosnicka : false ,wishlist : false}];

var knigi = [{ime : "Introduction to Python",cena : 500,kosnicka : false ,wishlist : false},
{ime : "Practical Programming",cena : 706,kosnicka : false ,wishlist : false},
{ime : "Programming Groovy 2",cena : 807,kosnicka : false ,wishlist : false},
{ime : "Programming Pearls",cena : 1086,kosnicka : false ,wishlist : false},
{ime : "The C++ Programming",cena : 484,kosnicka : false ,wishlist : false},
{ime : "The Ruby Programming",cena : 892,kosnicka : false ,wishlist : false},
{ime : "Miramont's Ghost",cena : 169,kosnicka : false ,wishlist : false},
{ime : "Heart Collector",cena : 689,kosnicka : false ,wishlist : false},
{ime : "Everything Burns",cena : 1073,kosnicka : false ,wishlist : false},
{ime : "First to Kill",cena : 187,kosnicka : false ,wishlist : false}];

var sport = [{ime : "Фудбалски дрес на Манчестер Јунајтед",cena : 9282,kosnicka : false ,wishlist : false},
{ime : "Фудбалски дрес на Баерн Минхен",cena : 8998,kosnicka : false ,wishlist : false},
{ime : "Фудбалски дрес на Челзи",cena : 8835,kosnicka : false ,wishlist : false},
{ime : "Фудбалски дрес на Манчестер Сити",cena : 8784,kosnicka : false ,wishlist : false},
{ime : "Фудбалски дрес на Барселона",cena : 8751,kosnicka : false ,wishlist : false},
{ime : "Фудбалски дрес на Реал Мадрид",cena : 8798,kosnicka : false ,wishlist : false}];


var videoIgri = [{ime : "Destiny Expansion Pass",cena : 1545,kosnicka : false ,wishlist : false},
{ime : "Call of Duty  Advanced",cena : 1477,kosnicka : false ,wishlist : false},
{ime : "WWE 2K15",cena : 609,kosnicka : false ,wishlist : false},
{ime : "NBA 2K15",cena : 2042,kosnicka : false ,wishlist : false},
{ime : "Grand Theft Auto V",cena : 2472,kosnicka : false ,wishlist : false}];


var kosnicka = [];
var wishlist = [];


function najdiIndeks(niza,tekst) {
	var i = -1;
	$(niza).each(function(index,item) {
		if(item.ime == tekst)
			i = index;
	});
	return i;
}

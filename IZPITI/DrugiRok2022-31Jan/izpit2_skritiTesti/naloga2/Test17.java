
import java.util.*;

public class Test17 {

    private static final int[][][] SLIKA = {
        {{ 86,  31,   8}, { 34,  23,  25}, { 81, 100, 240}, {119,  47, 101}, {165, 146,  13}, {103,  36, 251}, {133,   1,  95}, { 45,   1,  11}, {107, 175, 220}, {  1,  10,  12}, {  7,  22,  94}, { 11, 197, 221}, { 21,  21,   4}, {123,  87, 141}, {234, 156,   5}, {175,  23,  53}, { 87,  87,  83}, {128,  96,  70}, {100,  99,  25}, {135, 111,  56}, {105,  85, 214}, {180, 125, 204}, {136,  93,  55}, {171,  67,  71}, {212,   9,  39}, {139,  90,  14}, {151, 132,  28}, { 27,  49,  67}, { 10, 119, 183}, {169, 154,  44}, {253, 244, 249}, {132, 120, 137}, {183,  36,  21}, {188,  76, 125}, {163, 213, 233}, {114,  52, 205}, { 91, 127, 179}, {222, 112, 154}, { 90,  39, 138}, {123,  37,  59}, { 27,  20,  41}, { 84,  23, 180}, { 82,  80,   3}, {211, 188,  19}, {174,  48, 237}, { 13,   4,  14}, {245, 165, 220}, {146, 122, 163}, {247,  43, 131}, { 80,  51,  18}, {243, 131, 178}, {119, 115,  76}, {238, 109,  25}, { 12, 111, 114}, { 78,  73,  64}, {205,  70,  91}, {251, 144,  82}, {100,   0,   9}, {  1,  12, 112}, {248, 120, 129}, {210, 124, 195}, { 35,  32,  38}, { 49,  70, 128}, { 48,  64, 229}, {189, 139,  26}, { 90,  15, 214}, {  6,  44,  99}, {102,  87,   2}, {  2,  39, 140}, { 56,  44, 215}, {166,  70,   2}, { 17,   0, 100}, { 65,  98, 228}, { 94, 117, 177}, { 65,  23,  21}, { 60,  25, 179}, { 53, 108, 121}, {102,  29, 212}, {208, 140, 229}, {231,  98,   1}, { 83, 103, 147}, {102,  85, 191}, {106,  24,  69}, {238, 191, 243}, {193, 136, 221}, { 86,   1, 128}, {227,  27,  70}, { 98,  65,  19}, {106,  46,  47}, { 64,   8,  90}, {208,  60, 196}, { 66, 114, 202}, {235,  82,  46}, {126, 188, 195}, {189, 115,   3}, { 69,  52, 118}, {116,  63, 136}, {  7,  26,  55}, { 81,   7, 174}, { 68, 130, 189}, { 84,  98, 167}, {  0,  84, 137}, {115, 104,  29}, {116,   2, 145}, {188,  75,  93}, { 28, 144, 159}},
        {{  5,  76,  83}, {102,  66,  56}, {198, 101, 113}, {192, 121, 187}, {125, 222, 225}, {212,  94, 150}, {104, 132, 147}, {146,  76,   7}, {151,   2, 159}, { 85, 155, 246}, {120,  96, 159}, { 10,  27, 189}, {225,  13, 107}, {119,  13,  58}, { 15,   2,   9}, {246,  14,  16}, {117,  92,  51}, {231, 143,  30}, {171,  33,  85}, {170,  26, 101}, { 80, 177, 193}, { 73,  81, 213}, {150, 148,  27}, {178,  93,   2}, {169,  98, 114}, {234,  37,   7}, { 24, 116, 133}, {190,  26, 150}, { 53,   8,   5}, {247, 169, 212}, {185, 114,  16}, { 57,  75,  86}, {188, 181, 204}, { 90, 163, 236}, { 79, 186, 224}, {250, 243,  56}, {234, 232, 111}, {218, 151, 163}, {177,  47, 194}, {143, 171, 249}, {246,   9, 137}, {170, 109, 217}, { 84,  19, 145}, {145, 143,  83}, {111,  91,  78}, { 44,  33, 204}, {211, 211,  68}, {180,  96, 135}, { 18,   1,  44}, { 41,  90, 126}, { 41, 102, 177}, {213,  12, 213}, {210,  69,  13}, {233,  68, 129}, {101,  72,  98}, {248, 117, 110}, { 44,  50, 111}, { 19,  40,  76}, { 90,  37, 113}, {  0,  23, 213}, { 54,  16,  61}, {208,  37, 151}, { 45,  96, 232}, { 58, 156, 213}, {245, 204, 169}, { 92, 100, 103}, {253,  31,  40}, {187,  29, 182}, {  8, 184, 185}, { 29,   5,  14}, {157,  70,  88}, {113,  56,  87}, {114, 100,   6}, {  7, 141, 158}, { 19, 142, 238}, {231, 205, 169}, { 42,  23, 212}, {215, 166, 218}, {191, 128,   9}, {178,  18, 143}, {156,  99, 240}, {190, 187,  16}, {146,  86, 197}, {120,  62,  43}, { 72, 105, 123}, { 23,  18,  19}, {112,  34, 173}, { 48,  26,   0}, { 45, 122, 219}, {220, 101,  93}, { 83,  75,  61}, {208, 170,  80}, { 34,  22,  64}, { 44,   2,  24}, {  4,  14,  41}, {126, 123,  37}, {222,  90, 161}, {233, 117, 129}, {188, 121,   9}, {110,  72,  36}, {235, 208, 176}, {126, 159, 232}, { 28,  18,  29}, {227, 211,  54}, { 61,  14,  87}, { 50, 101, 208}},
        {{107,  32, 137}, {161, 142, 235}, { 44,  98, 117}, {236, 233, 151}, { 57, 117, 176}, {199, 180,  58}, {101,  60, 196}, {186,  48, 233}, {216,  28, 160}, {190,  81,  89}, { 91, 115, 161}, {118,  22,  81}, {152, 161, 190}, {121,  79, 190}, {249,  28, 221}, {167, 159, 105}, {226, 167, 207}, { 45,   6, 102}, {202,   9, 154}, {250, 235,  79}, {108, 103,  77}, {220,  31,  57}, {191, 119,  26}, {138,   1,  72}, {117, 121, 148}, {216,  49,  43}, { 35,   7,  81}, {105,  12,  10}, {132, 108, 244}, { 89,  63,  57}, {218, 198,  68}, { 66,  62, 148}, {133, 115,   6}, {217,  41, 191}, {124,  93,  40}, { 40,   2,  21}, {110,  60, 253}, {109,  44,  39}, {229,  72, 142}, {  3,   4,  16}, { 93,  80, 255}, { 54,  79, 151}, {152,  73, 151}, { 66,  54, 196}, {210,  45, 151}, {176,  98, 129}, { 67,   3, 211}, {121,  97,  62}, {253, 231, 243}, {201, 137, 233}, {103,  59,  93}, {208,   0,  26}, {234,  63, 156}, { 30,  66, 213}, { 26, 139, 145}, {109,  42,  84}, { 85, 145, 254}, { 14,  31,  78}, {239,  39,  62}, {168, 140,  64}, {189,  82, 169}, { 88, 145, 181}, {228,  20, 218}, {129,  89,  10}, {219, 122, 251}, { 69,  43,  34}, {154, 128, 220}, { 35,  32,  62}, {143, 133, 153}, {133, 164, 195}, {238,  82,  76}, {122,  98,  45}, { 14, 159, 191}, { 61,  47, 116}, { 63, 135, 215}, { 31, 129, 223}, {121,  38, 121}, {170, 148,  30}, {194, 133,   6}, {  3,   8, 104}, { 81,  49, 126}, {131,  86, 240}, { 30,  59,  97}, {217, 105, 135}, {205,  85, 237}, { 31, 134, 197}, {135, 124, 197}, {126,  45, 166}, { 89,  79, 190}, {135,  42,  61}, {217, 194, 159}, { 71,  28,  21}, {184,  82, 110}, {198, 158, 121}, { 85,  31,  27}, {196, 187, 177}, {  6,  36,  70}, {136,  31,  69}, { 11,  24, 115}, {124,  46, 206}, { 91,  90,  91}, {200, 131, 107}, { 19,   6,  58}, {242, 110,  84}, { 43,  66, 156}, {188, 121, 215}},
        {{108, 167, 170}, {226, 108, 135}, {133,  94,  35}, { 24,  51, 194}, { 59, 107, 166}, { 98,  38,  57}, {103,  75,  81}, {129,  59, 148}, {122,  85, 143}, {  5,  29, 129}, {103,  35, 103}, { 30,  13,  41}, {102,  37, 119}, {147, 124, 162}, {151, 100,  59}, {102,  87, 123}, { 87, 141, 160}, { 10,  24,  64}, {  9, 102, 139}, { 36,  55, 110}, {231, 162,  34}, {206, 119,  98}, { 54,  84, 128}, {168, 100,  39}, { 15, 116, 128}, {160,  42,  42}, { 25, 100, 107}, { 33, 117, 195}, {164,  97, 117}, { 35, 152, 172}, {242,   4, 237}, {204, 163,  82}, { 36, 127, 212}, {141,  58,  88}, {  6,  76, 219}, {190,  57,  74}, { 47,  21,  61}, {152, 203, 247}, {205,  89, 116}, {160,  74,  74}, {133, 160, 194}, {164,  71, 172}, {115, 102,  74}, {203, 185,   3}, {231, 227, 252}, {142,  40,  89}, {199, 239, 241}, {244, 105, 118}, { 12,  34, 192}, { 30,  65,  73}, {135, 124,   6}, {140, 106,  83}, {158,   9, 139}, { 47,  48, 115}, {177,  17, 131}, {160, 105, 150}, { 33,   9,  51}, {158, 154, 163}, { 53, 110, 237}, { 80,  23, 124}, {213, 178, 129}, {195, 191,  59}, { 58,   0,  93}, { 67,  34,  15}, {  1, 172, 252}, {  2,  91, 179}, {136,  81, 110}, {137,  30,  55}, {112,  65, 107}, { 19, 107, 156}, {104,  84,  12}, {239, 159, 132}, {232,  97, 182}, {220,  99, 207}, { 40,   3,  56}, { 56,  53,  26}, { 99,  36, 127}, { 35,  25,  10}, { 33,  17,  43}, {195, 150, 227}, {119,  99,  62}, {125,  35, 203}, { 27,  32,  65}, { 51, 136, 188}, {133,  50, 156}, {182,  16, 147}, { 77, 164, 239}, { 49,  89, 217}, {183, 191, 205}, {189,   3,  61}, {115,  55, 122}, {176,   8, 112}, {111,  97,  94}, {243, 224,   2}, {110,  60,  26}, { 64,  50, 123}, {185,  38, 166}, {222,  27,  49}, {244, 143, 228}, {116,  67, 180}, {130,  83, 223}, {239, 172, 126}, { 27,   7,  27}, {155, 221, 238}, { 46, 169, 202}, { 86,  66, 145}},
        {{ 42,  39,   2}, {241, 117,  75}, {180,  30,  39}, {187, 164,  18}, { 54, 152, 217}, {133,  18,   6}, {146,  86, 244}, {106,   7,  75}, { 59, 204, 249}, {169, 167, 217}, { 36, 189, 254}, { 98,  26, 211}, { 40, 113, 114}, {196,  21,  99}, {159,  90, 173}, {168,  58, 254}, {116, 153, 242}, {172,  10, 189}, {171,  44, 195}, {124, 111, 117}, {216, 140, 135}, {102,   7, 207}, {207,  81,  55}, {128,  94, 182}, {225,  54,  97}, { 29,  31,  90}, { 32,  82, 115}, {  3, 130, 139}, {104,  67,   6}, {105,  71, 182}, { 85,  74,  40}, {104,   7, 135}, {165,  57, 120}, { 21,  39,  63}, { 91,  86, 117}, {200,  15, 195}, {219, 127,  97}, {206, 154, 189}, { 48,  17, 164}, {153, 109,  93}, {253,   3,  61}, { 80,  56,  26}, {225, 181, 159}, {198, 122, 218}, {209, 180,  79}, { 20,  48, 242}, {  9,  45,  52}, { 11, 191, 221}, {128, 150, 203}, {100,  78, 233}, {140,  77,  90}, {109, 222, 246}, { 32,  14,  43}, { 10, 134, 139}, { 75,  32,  58}, {164,  13,  45}, { 32,  77, 197}, {250, 181, 147}, {143,   2, 133}, {  6, 237, 136}, {173,  34,  24}, {225, 140, 223}, {150,  45,  24}, {183, 161,  67}, {101,   2,  92}, {184,  19,  66}, {162, 146, 211}, { 61, 107, 119}, { 58, 170, 178}, {161,  73, 150}, {251, 187,   0}, { 58, 138, 207}, { 56,  25, 167}, {100, 134, 216}, { 91, 123, 158}, {128,  30, 140}, { 81,  68,  49}, { 66,  33,  56}, {118, 110, 186}, {123, 151, 182}, { 50,   9,   7}, {189, 162, 122}, {246, 226,  63}, {251, 237, 194}, {164, 157, 217}, {252,  88, 116}, {186,  38,  53}, {242,  47,  11}, {114,   1,  64}, {236,  93, 128}, {248, 191, 136}, {203,  15, 175}, { 75, 105, 165}, { 79,  20, 105}, { 83,  64,  50}, {224,  73, 213}, { 12,  61,  83}, {106, 129, 225}, {147, 104, 114}, {154,  68, 226}, { 96, 118, 144}, {  2,   0,  27}, {137, 165, 204}, { 15,  39,  73}, {200,  28,  74}, {191, 127,  60}},
        {{144,  15,  77}, { 36,  25,   4}, { 50, 156, 248}, {108,  84, 174}, {113, 107,  92}, { 89,  85, 104}, {126,  87,  61}, {119,  95, 130}, {221,  56, 161}, {  4,  77, 237}, {193,  89, 174}, {139,  97, 155}, {180, 121, 173}, {146,  56,  45}, { 28,  34,  38}, {149, 120,  29}, {182,  73,  57}, {220, 155, 179}, {123,  88,  26}, {247, 230,  82}, {173,  31, 114}, {202, 189,  98}, {195,  68,  72}, { 50,  21,  62}, { 65,  34,  98}, { 27,  87, 116}, {166, 161,  90}, { 46, 104, 187}, {165, 141,  41}, {237, 195, 167}, { 73, 119, 121}, {129,  12, 156}, {236, 231,  10}, {251,  85, 205}, {105,  94, 149}, { 87,  60,  58}, {191,  65,  34}, {217,  95, 249}, { 14,  21,  90}, {217, 130, 178}, {  4,  12,  26}, {218,  19, 111}, {  9,  39,  71}, { 13,  10,  78}, {179, 120, 216}, { 78,   1, 119}, {229,  86,  85}, {147, 195, 253}, {141,  43, 246}, {250, 112, 250}, {254, 201,  78}, {232, 131, 150}, {156, 152, 183}, {231, 161,  44}, {153,   8,   7}, {239,  56, 253}, { 69,   5,  95}, { 91, 142, 232}, { 27, 193, 252}, {128,  85,  45}, {197,  67, 100}, {111,  23,  50}, {121,  22, 232}, { 77,  37, 152}, {129,  97, 116}, {  1, 153, 180}, {210,  61, 184}, {158,  28, 225}, { 94,  50,   5}, {168, 141, 147}, {  7,  10, 170}, {167, 114, 145}, {197,  31, 238}, {170, 124, 195}, {125,  88,  56}, {220, 104,  74}, { 93, 118, 158}, {116, 197, 245}, {  4,  32,  38}, {110, 104, 174}, {240, 148, 171}, { 24, 150, 152}, {173,  35,  15}, {238,  71, 249}, {218, 186, 118}, { 63,  42,  30}, { 49,  46, 107}, {199, 166,  76}, { 98,  60,  74}, {126,  31, 151}, { 36,  35,  98}, {132, 106, 167}, {133,  84, 105}, {161,   1,  58}, {150,  12, 182}, {149,  69, 108}, {185,   2, 228}, { 82, 105, 168}, {248,  20, 149}, {216,  43,  75}, {232,  31, 225}, {125, 189, 225}, { 92, 108, 199}, { 57,  75, 195}, {148, 160, 172}, { 46,  81, 192}},
        {{188,   8, 188}, { 85,  29, 234}, {  1,  22, 107}, {116, 174, 175}, {126, 104, 228}, {248, 206, 101}, {209, 160, 183}, {199, 134, 244}, { 15,  39,  97}, {187,  10, 182}, { 30, 156, 158}, { 35,  61, 236}, {231,  97, 210}, {106, 113, 126}, {149,  29, 116}, {250,  79, 103}, { 40, 111, 116}, {221, 137, 238}, {155,   9, 181}, { 38, 102, 224}, { 96,  71,  31}, {109, 129, 187}, {132,  58, 220}, { 69,  64,  20}, {187, 153, 100}, { 16,  92, 113}, {234, 209, 137}, {122,  84, 109}, { 82,  72,  79}, { 43,  22,  31}, {249,  77, 101}, { 54,  59, 171}, {141,  10,  13}, {112,   1,   4}, {228, 151,  37}, { 41,  35, 128}, {102,  37, 135}, { 67,  42,  37}, {201,  60,  61}, {135,  47,  44}, {157, 105,  11}, {249, 230,   2}, {220,  72,  85}, {233, 215, 254}, { 21,  25, 121}, { 71,  52,   8}, {215,  73, 181}, {196, 148, 140}, { 90,  74, 253}, {100,  42, 183}, {136,  18, 146}, {109,  70,  11}, {196,  47,  97}, {125,  32, 214}, {169, 208, 250}, { 51,  40,  40}, { 46,  24,  13}, { 94, 219, 252}, {233, 182, 153}, {255, 222,  17}, {122, 202, 222}, { 57,  69,  84}, {186, 206, 209}, {216, 115, 171}, {226, 141, 173}, { 51,  16, 170}, {213, 202, 190}, {190,   4, 154}, {238, 217, 232}, {201,  81, 149}, {124, 110,  72}, { 90,   9, 140}, {144,  79, 149}, { 24,  37,  69}, {225, 202, 209}, { 43, 107, 252}, {  8,  70,  71}, { 85,  46, 170}, { 38,   1,  50}, {220,  21,  66}, {175, 160, 137}, {162, 137, 228}, {172,  17,  67}, {165, 149, 103}, { 77,  28,  46}, {173,   1,  34}, {171,  30, 101}, {145,  96,  26}, {220,   5,  77}, {131, 156, 184}, { 16,  11,  20}, { 72, 125, 130}, {  1, 189, 213}, {146,  80,  56}, {217, 179, 151}, {210, 122, 224}, { 93,  93,   5}, {184, 179, 167}, {183, 114,  29}, {218,  87,   1}, {178, 112, 243}, {  6,  31,  37}, { 37,  25,  45}, { 76,  48, 202}, {134,  74,   2}, { 47,  53,  94}},
        {{224,  38, 202}, {  4,  17,  27}, { 22,  81, 209}, { 32,  31, 193}, { 41, 165, 227}, {146, 125,  58}, { 51,  16, 142}, { 39,   3,  19}, {137, 158, 224}, { 12,  15,  66}, { 81, 166, 186}, { 35,  93, 244}, {211, 131,  17}, { 63,   4,  10}, { 59,  46,   6}, { 99,  56,  48}, {223, 113, 204}, { 61, 196, 253}, {122,  93, 120}, {100, 149, 193}, {197,  16, 226}, { 62,   2, 108}, {210,  81, 119}, {230,  88,   5}, { 45,  47,  67}, { 44, 115, 216}, {151,  57, 160}, { 64,   1, 106}, {183, 108, 105}, {121, 114, 164}, {252,  94,  67}, {  2,   1,   3}, {253,  23,  62}, {169,  13, 201}, { 69,  64,  32}, { 18,  44,  64}, {185, 155, 251}, {  1, 146, 192}, { 65,  52, 121}, {111,  18,  50}, {251, 230,  24}, {180,  61, 161}, {187, 187, 244}, {223, 149, 178}, {202, 206, 231}, {  1,   7,  80}, {109,  43, 101}, {166, 154,  82}, { 53,  25, 103}, {135,  62, 244}, {152, 168, 247}, {254, 222, 162}, {241,  52, 131}, {174,  94, 192}, {220,   8, 166}, { 18,   4,  17}, {171, 138,  50}, {139,  15,   5}, {131,  20,  29}, { 45,  99, 224}, {205, 125, 226}, { 40,  32,  95}, {204, 138, 186}, {175, 159,   9}, { 19,  79, 124}, { 41, 155, 171}, { 66,   4, 201}, {216, 211, 120}, { 77,  18, 129}, {  7,  28, 226}, {254, 242, 182}, {  4,  61, 124}, {184,  75, 251}, { 39, 143, 152}, { 19,  74, 232}, {162,  77, 231}, {147,  92, 103}, { 63, 160, 186}, {110, 124, 161}, {232,  21, 215}, { 56,   9,  90}, {240, 126,  36}, { 86,  12,  43}, {191, 116, 139}, {105,  57,  42}, {146,  48, 157}, { 14,  64, 198}, {189,  61, 114}, {141,  84, 221}, {248,  45,  95}, { 97,  40, 142}, {126,  14,  30}, { 78,  59, 170}, { 49,   9,  31}, {116, 117, 174}, {186, 186, 133}, {141,  43,  31}, { 34, 243, 246}, {227, 218, 209}, { 42,   5,  25}, {103,  54, 190}, {183,  23,  66}, { 46,  54,  85}, {220,  52, 178}, {139,   5,  57}, { 72,  17,  50}},
        {{ 65,  77, 142}, { 18,  25, 241}, { 46,  49,  82}, {183,  14, 225}, {244,  19,  19}, {201,  84,  97}, { 30,  41, 112}, {126,  55, 137}, {239, 124,  61}, {108,  20, 186}, {239, 158, 145}, {156, 134, 130}, {161,  49,   6}, { 38,  38,   6}, {218, 217, 102}, { 10,  28,  44}, { 67,  11,   1}, { 91, 101, 169}, {218, 215, 239}, {106, 118, 153}, {135,  39, 254}, { 50,  14, 211}, {176,  12, 235}, {152, 103, 210}, {149, 136,  31}, {219,  46,  92}, {172,  27,  19}, {224,   5,  24}, {248,  26,   0}, {126,  45, 147}, {106,  61, 187}, { 13,  86, 167}, {236, 108, 165}, { 59,  56,  50}, {229, 224, 239}, {127,  41, 142}, { 53,  44,  72}, {  6,  16, 233}, {164, 211, 211}, {197,  29, 224}, {232, 144, 227}, {177, 143,  47}, {147,  45,  81}, {169,  70, 178}, {179,  49, 233}, { 74,  65,  14}, {146, 145, 128}, { 55, 127, 223}, { 35, 148, 162}, {194,  13,  75}, {215,  30,  11}, {225, 174,   2}, { 91,  87, 152}, {231, 212,   7}, {135,  71,  97}, {128,  90, 170}, {119,  54, 124}, {196,  24,  85}, {214, 127, 234}, {115, 147, 177}, {154,  41,  90}, {135,  48,  33}, { 83,  49, 164}, {  5,   1, 182}, { 12,  71, 127}, { 12,   4,  33}, {219,   5,  73}, {184,  52, 141}, { 57,  72, 115}, { 12,  13,  24}, {  2,  18,  56}, {233,  65, 143}, { 69, 188, 250}, {159, 126, 102}, {142,  79,  77}, { 61,  69,  88}, { 87,  42, 229}, {194,   3, 101}, { 28,  79, 123}, { 41, 109, 110}, {238,  41, 200}, {  0,  33, 136}, { 18,  31, 145}, { 73,   8,  18}, { 73,  58, 103}, {247, 107, 190}, {179,  99, 153}, {141, 131, 252}, {132,  37,  60}, { 86,  76,  59}, {194, 151,  36}, { 91, 145, 165}, { 28, 165, 211}, {169, 129, 116}, {  9, 178, 251}, {189, 212, 214}, {  1,  29, 101}, {208, 117,  25}, {  4,  49, 117}, { 44, 195, 236}, {116,  92, 237}, {185, 137, 179}, { 90,  39, 219}, {237, 172,  25}, { 10,  94, 149}, {161,  31,  65}},
        {{231,  63,  59}, {196,  90,  94}, {195,  64, 117}, {124,  46, 100}, { 50,  84, 249}, {102,  24, 158}, {133,  72,  57}, {187,  98, 165}, {206, 201,  86}, {199,  18, 162}, { 89, 147, 157}, {204,   2,  22}, {218,  10, 123}, {245,  15,  65}, {184,  98,  39}, {142,  53, 150}, { 93,  87, 167}, {206,   4, 215}, { 52,  33,  48}, {  6,  14,  42}, { 72,  64,  31}, {176,  75, 245}, {204, 129,  46}, {209,  96, 253}, {116,  50,  13}, { 75, 154, 221}, {143,  92, 152}, {253, 150, 161}, {124, 104,  22}, {199, 100,  76}, { 64,  43, 158}, {249, 108,  23}, { 10, 113, 218}, { 53,  52, 141}, {219,  52, 199}, {229,  88, 112}, {  0,   9, 168}, { 60,  21, 111}, {104,  59, 111}, {251,  56, 219}, { 50,  72, 167}, { 95, 196, 216}, {201, 201,   9}, {203,   4, 211}, {251, 178, 183}, { 58,  75, 121}, {229, 223, 232}, {176, 164,  16}, { 88,  37,   3}, { 87,  41, 108}, {144, 218, 253}, {254,  30, 251}, {242, 110, 228}, {  4,  23,  75}, {234,  13,  94}, {230, 167, 174}, { 12,  49, 236}, { 29,   2,  67}, {  4,  61, 176}, { 73,  28,  49}, {221, 207,  52}, {138,   7, 191}, { 95,  57, 138}, {184, 116,  67}, {231, 227,  61}, {164, 171, 215}, { 45, 111, 177}, {223,  89, 188}, {216,  25,  61}, {  5,  76,  93}, {165,  89, 249}, { 67,  84, 197}, { 19,  43,  50}, {148,  79,  47}, {198,  87,  42}, {235, 153, 243}, {193, 211, 254}, {219,  54,  69}, {102,  86, 235}, { 18,  56, 177}, { 68,  39,  28}, { 80,  53,  65}, {  1,  86, 111}, {175, 100,   9}, {255, 223,  70}, {174,  34,  11}, {222, 223, 245}, {185,  91,  70}, {139,  96, 133}, { 98,  45, 163}, { 70,  52,  59}, {181,   4,  73}, { 20,  91, 161}, {226,  38, 146}, { 81,  51,  66}, { 63,  23, 216}, {184,  86,  99}, {  5,   0, 152}, { 11, 109, 247}, {130,  50,  32}, {243, 216, 148}, {  8, 121, 182}, {255,  50,  42}, {221, 110,  48}, { 65,   1,  64}, {156,  74, 185}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}
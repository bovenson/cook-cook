```shell
bovenson@MBP:~/Git/CppDemo/map-benchmark/sparsehash$ ./time_hash_map
======
Darwin MBP.local 18.2.0 Darwin Kernel Version 18.2.0: Fri Oct  5 19:41:49 PDT 2018; root:xnu-4903.221.2~2/RELEASE_X86_64 x86_64
Average over 10000000 iterations
Current time (GMT): Thu Nov 29 03:18:14 2018

SPARSE_HASH_MAP (4 byte objects, 10000000 iterations):
map_grow              220.3 ns  (23421757 hashes, 43421814 copies)
map_predict/grow      102.7 ns  (10000000 hashes, 30000000 copies)
map_replace            25.6 ns  (10000000 hashes,        0 copies)
map_fetch_random      161.8 ns  (10000000 hashes,        0 copies)
map_fetch_sequential   33.3 ns  (10000000 hashes,        0 copies)
map_fetch_empty         9.2 ns  (       0 hashes,        0 copies)
map_remove             45.5 ns  (10000000 hashes, 10000000 copies)
map_toggle            184.0 ns  (20399999 hashes, 41599996 copies)
map_iterate             6.2 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 352.7ns/insertion
stresshashfunction map_size=256 stride=256: 297.3ns/insertion
stresshashfunction map_size=1024 stride=1: 553.9ns/insertion
stresshashfunction map_size=1024 stride=1024: 617.3ns/insertion

DENSE_HASH_MAP (4 byte objects, 10000000 iterations):
map_grow               35.3 ns  (26777220 hashes, 113886160 copies)
map_predict/grow       12.1 ns  (10000000 hashes, 30000000 copies)
map_replace             6.3 ns  (10000000 hashes,        0 copies)
map_fetch_random       27.6 ns  (10000000 hashes,        0 copies)
map_fetch_sequential    4.6 ns  (10000000 hashes,        0 copies)
map_fetch_empty         1.1 ns  (       0 hashes,        0 copies)
map_remove              8.0 ns  (10000000 hashes, 10000000 copies)
map_toggle             37.7 ns  (20624999 hashes, 64999960 copies)
map_iterate             3.7 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 34.9ns/insertion
stresshashfunction map_size=256 stride=256: 20.8ns/insertion
stresshashfunction map_size=1024 stride=1: 57.0ns/insertion
stresshashfunction map_size=1024 stride=1024: 41.2ns/insertion

STANDARD HASH_MAP (4 byte objects, 10000000 iterations):
map_grow               81.7 ns  (10000000 hashes, 10000000 copies)
map_predict/grow       70.8 ns  (10000000 hashes, 10000000 copies)
map_replace             5.9 ns  (10000000 hashes,        0 copies)
map_fetch_random       49.7 ns  (10000000 hashes,        0 copies)
map_fetch_sequential    3.3 ns  (10000000 hashes,        0 copies)
map_fetch_empty         0.0 ns  (10000000 hashes,        0 copies)
map_remove             80.2 ns  (10000000 hashes,        0 copies)
map_toggle             94.2 ns  (20000000 hashes, 10000000 copies)
map_iterate             4.8 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 69.8ns/insertion
stresshashfunction map_size=256 stride=256: 308.4ns/insertion
stresshashfunction map_size=1024 stride=1: 67.8ns/insertion
stresshashfunction map_size=1024 stride=1024: 1030.5ns/insertion

STANDARD MAP (4 byte objects, 10000000 iterations):
map_grow              223.7 ns  (       0 hashes, 10000000 copies)
map_predict/grow      224.4 ns  (       0 hashes, 10000000 copies)
map_replace            64.8 ns  (       0 hashes,        0 copies)
map_fetch_random     1102.6 ns  (       0 hashes,        0 copies)
map_fetch_sequential   72.3 ns  (       0 hashes,        0 copies)
map_fetch_empty         0.6 ns  (       0 hashes,        0 copies)
map_remove            128.1 ns  (       0 hashes,        0 copies)
map_toggle             90.0 ns  (       0 hashes, 10000000 copies)
map_iterate            16.1 ns  (       0 hashes,        0 copies)

NARK MAP (4 byte objects, 10000000 iterations):
map_grow               32.1 ns  (20066444 hashes, 36777215 copies)
map_predict/grow       31.9 ns  (20066444 hashes, 36777215 copies)
map_replace            11.5 ns  (10000000 hashes, 10000000 copies)
map_fetch_random       64.2 ns  (10000000 hashes,        0 copies)
map_fetch_sequential    9.3 ns  (10000000 hashes,        0 copies)
map_fetch_empty         0.0 ns  (10000000 hashes,        0 copies)
map_remove             18.2 ns  (15000000 hashes,  5000000 copies)
map_toggle             30.0 ns  (20000000 hashes, 20000000 copies)
map_iterate             1.8 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 45.2ns/insertion
stresshashfunction map_size=256 stride=256: 46.5ns/insertion
stresshashfunction map_size=1024 stride=1: 31.3ns/insertion
stresshashfunction map_size=1024 stride=1024: 31.2ns/insertion

SPARSE_HASH_MAP (8 byte objects, 5000000 iterations):
map_grow              356.3 ns  (11710870 hashes, 21710924 copies)
map_predict/grow      181.0 ns  ( 5000000 hashes, 15000000 copies)
map_replace            26.5 ns  ( 5000000 hashes,        0 copies)
map_fetch_random      139.4 ns  ( 5000000 hashes,        0 copies)
map_fetch_sequential   34.7 ns  ( 5000000 hashes,        0 copies)
map_fetch_empty         9.5 ns  (       0 hashes,        0 copies)
map_remove             48.3 ns  ( 5000000 hashes,  5000000 copies)
map_toggle            214.9 ns  (10199999 hashes, 20799996 copies)
map_iterate             7.3 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 356.3ns/insertion
stresshashfunction map_size=256 stride=256: 302.8ns/insertion
stresshashfunction map_size=1024 stride=1: 551.2ns/insertion
stresshashfunction map_size=1024 stride=1024: 631.3ns/insertion

DENSE_HASH_MAP (8 byte objects, 5000000 iterations):
map_grow               45.4 ns  (13388611 hashes, 56943112 copies)
map_predict/grow       14.4 ns  ( 5000000 hashes, 15000000 copies)
map_replace             7.4 ns  ( 5000000 hashes,        0 copies)
map_fetch_random       39.5 ns  ( 5000000 hashes,        0 copies)
map_fetch_sequential    5.7 ns  ( 5000000 hashes,        0 copies)
map_fetch_empty         1.6 ns  (       0 hashes,        0 copies)
map_remove              9.3 ns  ( 5000000 hashes,  5000000 copies)
map_toggle             43.3 ns  (10312499 hashes, 32499960 copies)
map_iterate             4.0 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 35.4ns/insertion
stresshashfunction map_size=256 stride=256: 21.1ns/insertion
stresshashfunction map_size=1024 stride=1: 57.4ns/insertion
stresshashfunction map_size=1024 stride=1024: 43.0ns/insertion

STANDARD HASH_MAP (8 byte objects, 5000000 iterations):
map_grow               82.5 ns  ( 5000000 hashes,  5000000 copies)
map_predict/grow       72.7 ns  ( 5000000 hashes,  5000000 copies)
map_replace             6.0 ns  ( 5000000 hashes,        0 copies)
map_fetch_random       49.2 ns  ( 5000000 hashes,        0 copies)
map_fetch_sequential    3.3 ns  ( 5000000 hashes,        0 copies)
map_fetch_empty         0.0 ns  ( 5000000 hashes,        0 copies)
map_remove             80.5 ns  ( 5000000 hashes,        0 copies)
map_toggle             93.1 ns  (10000000 hashes,  5000000 copies)
map_iterate             3.3 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 71.0ns/insertion
stresshashfunction map_size=256 stride=256: 311.5ns/insertion
stresshashfunction map_size=1024 stride=1: 71.3ns/insertion
stresshashfunction map_size=1024 stride=1024: 1029.5ns/insertion

STANDARD MAP (8 byte objects, 5000000 iterations):
map_grow              208.2 ns  (       0 hashes,  5000000 copies)
map_predict/grow      207.4 ns  (       0 hashes,  5000000 copies)
map_replace            58.4 ns  (       0 hashes,        0 copies)
map_fetch_random      897.5 ns  (       0 hashes,        0 copies)
map_fetch_sequential   58.1 ns  (       0 hashes,        0 copies)
map_fetch_empty         0.6 ns  (       0 hashes,        0 copies)
map_remove            128.8 ns  (       0 hashes,        0 copies)
map_toggle             89.6 ns  (       0 hashes,  5000000 copies)
map_iterate            16.1 ns  (       0 hashes,        0 copies)

NARK MAP (8 byte objects, 5000000 iterations):
map_grow               37.5 ns  ( 5000000 hashes, 18388607 copies)
map_predict/grow       38.2 ns  ( 5000000 hashes, 18388607 copies)
map_replace            14.9 ns  ( 5000000 hashes,  5000000 copies)
map_fetch_random       56.4 ns  ( 5000000 hashes,        0 copies)
map_fetch_sequential   11.8 ns  ( 5000000 hashes,        0 copies)
map_fetch_empty         0.0 ns  ( 5000000 hashes,        0 copies)
map_remove             21.7 ns  ( 5000000 hashes,  2500000 copies)
map_toggle             32.7 ns  (10000000 hashes, 10000000 copies)
map_iterate             2.1 ns  (       0 hashes,        0 copies)

stresshashfunction map_size=256 stride=1: 47.5ns/insertion
stresshashfunction map_size=256 stride=256: 47.0ns/insertion
stresshashfunction map_size=1024 stride=1: 32.7ns/insertion
stresshashfunction map_size=1024 stride=1024: 31.5ns/insertion

SPARSE_HASH_MAP (16 byte objects, 2500000 iterations):
map_grow              454.5 ns  ( 5855426 hashes, 10855477 copies)
map_predict/grow      244.7 ns  ( 2500000 hashes,  7500000 copies)
map_replace            31.0 ns  ( 2500000 hashes,        0 copies)
map_fetch_random      135.5 ns  ( 2500000 hashes,        0 copies)
map_fetch_sequential   39.4 ns  ( 2500000 hashes,        0 copies)
map_fetch_empty         9.4 ns  (       0 hashes,        0 copies)
map_remove             52.6 ns  ( 2500000 hashes,  2500000 copies)
map_toggle            237.1 ns  ( 5099999 hashes, 10399996 copies)
map_iterate             6.5 ns  (       0 hashes,        0 copies)

DENSE_HASH_MAP (16 byte objects, 2500000 iterations):
map_grow               74.7 ns  ( 6694306 hashes, 28471584 copies)
map_predict/grow       21.0 ns  ( 2500000 hashes,  7500000 copies)
map_replace            12.0 ns  ( 2500000 hashes,        0 copies)
map_fetch_random       42.8 ns  ( 2500000 hashes,        0 copies)
map_fetch_sequential   10.6 ns  ( 2500000 hashes,        0 copies)
map_fetch_empty         1.5 ns  (       0 hashes,        0 copies)
map_remove             15.1 ns  ( 2500000 hashes,  2500000 copies)
map_toggle             47.2 ns  ( 5156249 hashes, 16249960 copies)
map_iterate             6.2 ns  (       0 hashes,        0 copies)

STANDARD HASH_MAP (16 byte objects, 2500000 iterations):
map_grow               88.5 ns  ( 2500000 hashes,  2500000 copies)
map_predict/grow       76.3 ns  ( 2500000 hashes,  2500000 copies)
map_replace            12.9 ns  ( 2500000 hashes,        0 copies)
map_fetch_random       86.6 ns  ( 2500000 hashes,        0 copies)
map_fetch_sequential    8.9 ns  ( 2500000 hashes,        0 copies)
map_fetch_empty         2.5 ns  ( 2500000 hashes,        0 copies)
map_remove             86.4 ns  ( 2500000 hashes,        0 copies)
map_toggle             97.2 ns  ( 5000000 hashes,  2500000 copies)
map_iterate             4.8 ns  (       0 hashes,        0 copies)

STANDARD MAP (16 byte objects, 2500000 iterations):
map_grow              198.1 ns  (       0 hashes,  2500000 copies)
map_predict/grow      199.8 ns  (       0 hashes,  2500000 copies)
map_replace            62.0 ns  (       0 hashes,        0 copies)
map_fetch_random      693.6 ns  (       0 hashes,        0 copies)
map_fetch_sequential   53.8 ns  (       0 hashes,        0 copies)
map_fetch_empty         0.6 ns  (       0 hashes,        0 copies)
map_remove            130.5 ns  (       0 hashes,        0 copies)
map_toggle             90.2 ns  (       0 hashes,  2500000 copies)
map_iterate            16.8 ns  (       0 hashes,        0 copies)

NARK MAP (16 byte objects, 2500000 iterations):
map_grow               44.4 ns  ( 2500000 hashes,  9194303 copies)
map_predict/grow       44.8 ns  ( 2500000 hashes,  9194303 copies)
map_replace            14.6 ns  ( 2500000 hashes,  2500000 copies)
map_fetch_random       93.5 ns  ( 2500000 hashes,        0 copies)
map_fetch_sequential   13.0 ns  ( 2500000 hashes,        0 copies)
map_fetch_empty        12.0 ns  ( 2500000 hashes,        0 copies)
map_remove             26.1 ns  ( 2500000 hashes,  1250000 copies)
map_toggle             35.7 ns  ( 5000000 hashes,  5000000 copies)
map_iterate             2.2 ns  (       0 hashes,        0 copies)

SPARSE_HASH_MAP (256 byte objects, 312500 iterations):
map_grow              777.4 ns  (  731912 hashes,  1356954 copies)
map_predict/grow      549.6 ns  (  312500 hashes,   937500 copies)
map_replace           113.5 ns  (  312500 hashes,        0 copies)
map_fetch_random      137.1 ns  (  312500 hashes,        0 copies)
map_fetch_sequential  132.8 ns  (  312500 hashes,        0 copies)
map_fetch_empty        13.9 ns  (       0 hashes,        0 copies)
map_remove            143.6 ns  (  312500 hashes,   312500 copies)
map_toggle            300.9 ns  (  637499 hashes,  1299996 copies)
map_iterate            19.1 ns  (       0 hashes,        0 copies)

DENSE_HASH_MAP (256 byte objects, 312500 iterations):
map_grow              598.2 ns  (  836787 hashes,  3558980 copies)
map_predict/grow      104.5 ns  (  312500 hashes,   937500 copies)
map_replace            78.4 ns  (  312500 hashes,        0 copies)
map_fetch_random       60.8 ns  (  312500 hashes,        0 copies)
map_fetch_sequential   60.8 ns  (  312500 hashes,        0 copies)
map_fetch_empty         5.9 ns  (       0 hashes,        0 copies)
map_remove             90.9 ns  (  312500 hashes,   312500 copies)
map_toggle             94.8 ns  (  644531 hashes,  2031240 copies)
map_iterate            51.2 ns  (       0 hashes,        0 copies)

STANDARD HASH_MAP (256 byte objects, 312500 iterations):
map_grow              172.3 ns  (  312500 hashes,   312500 copies)
map_predict/grow      115.7 ns  (  312500 hashes,   312500 copies)
map_replace            41.6 ns  (  312500 hashes,        0 copies)
map_fetch_random       54.3 ns  (  312500 hashes,        0 copies)
map_fetch_sequential   14.5 ns  (  312500 hashes,        0 copies)
map_fetch_empty         0.0 ns  (  312500 hashes,        0 copies)
map_remove            122.1 ns  (  312500 hashes,        0 copies)
map_toggle            152.8 ns  (  625000 hashes,   312500 copies)
map_iterate            42.8 ns  (       0 hashes,        0 copies)

STANDARD MAP (256 byte objects, 312500 iterations):
map_grow              245.2 ns  (       0 hashes,   312500 copies)
map_predict/grow      250.5 ns  (       0 hashes,   312500 copies)
map_replace            87.2 ns  (       0 hashes,        0 copies)
map_fetch_random      708.9 ns  (       0 hashes,        0 copies)
map_fetch_sequential  101.7 ns  (       0 hashes,        0 copies)
map_fetch_empty         0.6 ns  (       0 hashes,        0 copies)
map_remove            166.4 ns  (       0 hashes,        0 copies)
map_toggle            136.7 ns  (       0 hashes,   312500 copies)
map_iterate            43.2 ns  (       0 hashes,        0 copies)

NARK MAP (256 byte objects, 312500 iterations):
map_grow              194.4 ns  (  312500 hashes,   836787 copies)
map_predict/grow      199.4 ns  (  312500 hashes,   836787 copies)
map_replace            56.8 ns  (  312500 hashes,        0 copies)
map_fetch_random       49.0 ns  (  312500 hashes,        0 copies)
map_fetch_sequential   22.3 ns  (  312500 hashes,        0 copies)
map_fetch_empty         0.0 ns  (  312500 hashes,        0 copies)
map_remove             54.5 ns  (  312500 hashes,   156250 copies)
map_toggle             45.9 ns  (  625000 hashes,   312500 copies)
map_iterate            14.1 ns  (       0 hashes,        0 copies)
```
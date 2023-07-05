# Mus know distributed system algorithms

# 1. Bloom filter
A Bloom filter is a space-efficient probabilistic data structure used to test whether an element is a member of a set or not. It was introduced by Burton Howard Bloom in 1970. The primary goal of a Bloom filter is to provide a fast and memory-efficient membership test for large sets of data.

The basic idea behind a Bloom filter is to use multiple hash functions and an array of bits. When an element is inserted into the Bloom filter, it is hashed by each of the hash functions, and the corresponding bits in the array are set to 1. To check if an element is present in the filter, the element is hashed again using the same hash functions, and the bits at those positions are checked. If all the corresponding bits are set to 1, the element is likely to be in the set. However, if any of the bits are 0, then the element is definitely not in the set.

One important characteristic of a Bloom filter is that it may produce false positives but not false negatives. This means that a Bloom filter can incorrectly indicate that an element is in the set, even if it is not, but it will never indicate that an element is not in the set if it actually is. The probability of false positives can be controlled by adjusting the size of the Bloom filter and the number of hash functions used.

Bloom filters are commonly used in various scenarios, such as caching systems, network routers, spell checkers, and data synchronization applications. They offer a trade-off between memory usage and query efficiency, making them useful in situations where approximate membership queries are acceptable and memory is a constraint.

# 2. Consistent Hashing for web pages.

# 3. count-min sketch

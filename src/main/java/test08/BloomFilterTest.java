package test08;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author hyp
 * Project name is LeedCodeLearn
 * Include in test08
 * hyp create at 20-2-28
 **/
public class BloomFilterTest {

    public static void main(String[] args) {
        long expectedInsertions = 10000000;
        double fpp = 0.00001;

        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), expectedInsertions, fpp);

        bloomFilter.put("aaa");
        bloomFilter.put("bbb");
        boolean containsString = bloomFilter.mightContain("aaa");
        System.out.println(containsString);

        BloomFilter<Email> emailBloomFilter = BloomFilter
                .create((Funnel<Email>) (from, into) -> into.putString(from.getDomain(), Charsets.UTF_8),
                        expectedInsertions, fpp);

        emailBloomFilter.put(new Email("sage.wang", "quanr.com"));
        boolean containsEmail = emailBloomFilter.mightContain(new Email("sage.wangaaa", "quanr.com"));
        System.out.println(containsEmail);
    }

    @Data
    @Builder
    @ToString
    @AllArgsConstructor
    public static class Email {
        private String userName;
        private String domain;
    }

}

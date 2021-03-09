package com.huazhao.demo;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.Arrays;

public class ToPinYin {
    public static void main(String[] args) throws BadHanyuPinyinOutputFormatCombination {
        HanyuPinyinOutputFormat format;
        format = new HanyuPinyinOutputFormat();
        format.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);
        //format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);

        /*String[] s1 = PinyinHelper.toHanyuPinyinStringArray('乐', format);
        String[] s2 = PinyinHelper.toHanyuPinyinStringArray('驴', format);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));*/
        String s ="我好中意你";
        for(char ch : s.toCharArray()){
            String[] str = PinyinHelper.toHanyuPinyinStringArray(ch,format);
            System.out.println(Arrays.toString(str));
        }
    }
}

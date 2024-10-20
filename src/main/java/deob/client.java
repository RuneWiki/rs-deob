package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class63 implements class290 {

    @ObfuscatedName("client.w")
    public static class182[] field732 = new class182[4];

    @ObfuscatedName("client.aj")
    public static boolean field670 = true;

    @ObfuscatedName("client.bk")
    public static int field729 = 1;

    @ObfuscatedName("client.bh")
    public static int field864 = 0;

    @ObfuscatedName("client.be")
    public static int field863 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field896 = false;

    @ObfuscatedName("client.bb")
    public static boolean field675 = false;

    @ObfuscatedName("client.bo")
    public static int field677 = -1;

    @ObfuscatedName("client.bp")
    public static boolean field724 = false;

    @ObfuscatedName("client.bm")
    public static int field714 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field681 = true;

    @ObfuscatedName("client.cv")
    public static int field671 = 0;

    @ObfuscatedName("client.cp")
    public static long field683 = -1L;

    @ObfuscatedName("client.cu")
    public static int field684 = -1;

    @ObfuscatedName("client.cq")
    public static int field685 = -1;

    @ObfuscatedName("client.co")
    public static long field739 = -1L;

    @ObfuscatedName("client.ca")
    public static boolean field687 = true;

    @ObfuscatedName("client.cm")
    public static boolean field841 = false;

    @ObfuscatedName("client.cf")
    public static int field689 = 0;

    @ObfuscatedName("client.ct")
    public static int field690 = 0;

    @ObfuscatedName("client.cd")
    public static int field927 = 0;

    @ObfuscatedName("client.cy")
    public static int field868 = 0;

    @ObfuscatedName("client.cx")
    public static int field780 = 0;

    @ObfuscatedName("client.cs")
    public static int field762 = 0;

    @ObfuscatedName("client.cr")
    public static int field798 = 0;

    @ObfuscatedName("client.cl")
    public static int field674 = 0;

    @ObfuscatedName("client.dx")
    public static int field710 = 0;

    @ObfuscatedName("client.dm")
    public static class94 field698 = class94.field1193;

    @ObfuscatedName("client.dd")
    public static class94 field699 = class94.field1193;

    @ObfuscatedName("client.dl")
    public static int field700 = 0;

    @ObfuscatedName("client.dp")
    public static int field905 = 0;

    @ObfuscatedName("client.dc")
    public static int field816 = 0;

    @ObfuscatedName("client.ea")
    public static int field704 = 0;

    @ObfuscatedName("client.ei")
    public static int field705 = 0;

    @ObfuscatedName("client.et")
    public static int field706 = 0;

    @ObfuscatedName("client.eq")
    public static int field707 = 0;

    @ObfuscatedName("client.ex")
    public static int field676 = 0;

    @ObfuscatedName("client.er")
    public static class170 field709 = class170.field2025;

    @ObfuscatedName("client.ep")
    public static boolean field711 = false;

    @ObfuscatedName("client.ev")
    public static class98 field712 = new class98();

    @ObfuscatedName("client.ec")
    public class310 field930;

    @ObfuscatedName("client.ee")
    public class10 field852;

    @ObfuscatedName("client.fe")
    public static byte[] field715 = null;

    @ObfuscatedName("client.fc")
    public static class89[] field716 = new class89[32768];

    @ObfuscatedName("client.ft")
    public static int field717 = 0;

    @ObfuscatedName("client.fp")
    public static int[] field875 = new int[32768];

    @ObfuscatedName("client.fq")
    public static int field719 = 0;

    @ObfuscatedName("client.fk")
    public static int[] field720 = new int[250];

    @ObfuscatedName("client.fn")
    public static final class105 field721 = new class105();

    @ObfuscatedName("client.fg")
    public static int field722 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field723 = false;

    @ObfuscatedName("client.ff")
    public static boolean field940 = true;

    @ObfuscatedName("client.fs")
    public static class282 field725 = new class282();

    @ObfuscatedName("client.fl")
    public static HashMap field726 = new HashMap();

    @ObfuscatedName("client.gq")
    public static int field823 = 0;

    @ObfuscatedName("client.gb")
    public static int field760 = 1;

    @ObfuscatedName("client.gd")
    public static int field691 = 0;

    @ObfuscatedName("client.gc")
    public static int field730 = 1;

    @ObfuscatedName("client.gr")
    public static int field810 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field733 = false;

    @ObfuscatedName("client.gh")
    public static int[][][] field734 = new int[4][13][13];

    @ObfuscatedName("client.gz")
    public static final int[] field735 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gy")
    public static int field748 = 0;

    @ObfuscatedName("client.hq")
    public static int field737 = 2301979;

    @ObfuscatedName("client.hk")
    public static int field738 = 5063219;

    @ObfuscatedName("client.hy")
    public static int field695 = 3353893;

    @ObfuscatedName("client.hn")
    public static int field740 = 7759444;

    @ObfuscatedName("client.he")
    public static boolean field741 = false;

    @ObfuscatedName("client.hr")
    public static int field817 = 0;

    @ObfuscatedName("client.hu")
    public static int field743 = 128;

    @ObfuscatedName("client.ho")
    public static int field926 = 0;

    @ObfuscatedName("client.hp")
    public static int field745 = 0;

    @ObfuscatedName("client.hf")
    public static int field746 = 0;

    @ObfuscatedName("client.hb")
    public static int field697 = 0;

    @ObfuscatedName("client.hs")
    public static int field947 = 0;

    @ObfuscatedName("client.hc")
    public static int field749 = 0;

    @ObfuscatedName("client.ia")
    public static int field750 = 50;

    @ObfuscatedName("client.is")
    public static int field718 = 0;

    @ObfuscatedName("client.ij")
    public static int field752 = 0;

    @ObfuscatedName("client.ib")
    public static int field753 = 0;

    @ObfuscatedName("client.iq")
    public static int field754 = 12;

    @ObfuscatedName("client.ic")
    public static int field755 = 6;

    @ObfuscatedName("client.ip")
    public static int field837 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field757 = false;

    @ObfuscatedName("client.it")
    public static String field828 = null;

    @ObfuscatedName("client.if")
    public static int field758 = 0;

    @ObfuscatedName("client.il")
    public static boolean field759 = false;

    @ObfuscatedName("client.iy")
    public static int field882 = 0;

    @ObfuscatedName("client.ih")
    public static int field761 = 0;

    @ObfuscatedName("client.iu")
    public static int field680 = 50;

    @ObfuscatedName("client.ie")
    public static int[] field763 = new int[field680];

    @ObfuscatedName("client.iw")
    public static int[] field899 = new int[field680];

    @ObfuscatedName("client.ir")
    public static int[] field713 = new int[field680];

    @ObfuscatedName("client.ik")
    public static int[] field766 = new int[field680];

    @ObfuscatedName("client.iv")
    public static int[] field767 = new int[field680];

    @ObfuscatedName("client.ii")
    public static int[] field768 = new int[field680];

    @ObfuscatedName("client.je")
    public static int[] field765 = new int[field680];

    @ObfuscatedName("client.jr")
    public static String[] field770 = new String[field680];

    @ObfuscatedName("client.js")
    public static int[][] field771 = new int[104][104];

    @ObfuscatedName("client.jg")
    public static int field772 = 0;

    @ObfuscatedName("client.jo")
    public static int field773 = -1;

    @ObfuscatedName("client.jc")
    public static int field774 = -1;

    @ObfuscatedName("client.jz")
    public static int field845 = 0;

    @ObfuscatedName("client.jt")
    public static int field694 = 0;

    @ObfuscatedName("client.jm")
    public static int field678 = 0;

    @ObfuscatedName("client.jd")
    public static int field778 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field937 = true;

    @ObfuscatedName("client.jn")
    public static int field809 = 0;

    @ObfuscatedName("client.jl")
    public static int field669 = 0;

    @ObfuscatedName("client.ja")
    public static int field782 = 0;

    @ObfuscatedName("client.jv")
    public static int field783 = 0;

    @ObfuscatedName("client.jj")
    public static int field784 = 0;

    @ObfuscatedName("client.jh")
    public static int field785 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field786 = false;

    @ObfuscatedName("client.jy")
    public static int field787 = 0;

    @ObfuscatedName("client.ji")
    public static int field788 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field789 = true;

    @ObfuscatedName("client.ku")
    public static class76[] field790 = new class76[2048];

    @ObfuscatedName("client.kx")
    public static int field791 = -1;

    @ObfuscatedName("client.kp")
    public static int field792 = 0;

    @ObfuscatedName("client.ki")
    public static boolean field793 = true;

    @ObfuscatedName("client.ks")
    public static int field794 = 0;

    @ObfuscatedName("client.km")
    public static int field688 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field908 = new int[1000];

    @ObfuscatedName("client.kj")
    public static final int[] field797 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ke")
    public static String[] field764 = new String[8];

    @ObfuscatedName("client.kv")
    public static boolean[] field799 = new boolean[8];

    @ObfuscatedName("client.kw")
    public static int[] field800 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ko")
    public static int field781 = -1;

    @ObfuscatedName("client.ka")
    public static class272[][][] field802 = new class272[4][104][104];

    @ObfuscatedName("client.kg")
    public static class272 field803 = new class272();

    @ObfuscatedName("client.ky")
    public static class272 field804 = new class272();

    @ObfuscatedName("client.kb")
    public static class272 field805 = new class272();

    @ObfuscatedName("client.kn")
    public static int[] field806 = new int[25];

    @ObfuscatedName("client.kz")
    public static int[] field807 = new int[25];

    @ObfuscatedName("client.kh")
    public static int[] field808 = new int[25];

    @ObfuscatedName("client.lk")
    public static int field673 = 0;

    @ObfuscatedName("client.ly")
    public static boolean field703 = false;

    @ObfuscatedName("client.ls")
    public static int field811 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field812 = new int[500];

    @ObfuscatedName("client.lq")
    public static int[] field813 = new int[500];

    @ObfuscatedName("client.lx")
    public static int[] field775 = new int[500];

    @ObfuscatedName("client.la")
    public static int[] field815 = new int[500];

    @ObfuscatedName("client.lt")
    public static String[] field822 = new String[500];

    @ObfuscatedName("client.lf")
    public static String[] field924 = new String[500];

    @ObfuscatedName("client.ln")
    public static boolean[] field818 = new boolean[500];

    @ObfuscatedName("client.le")
    public static boolean field885 = false;

    @ObfuscatedName("client.lr")
    public static boolean field820 = false;

    @ObfuscatedName("client.ld")
    public static boolean field821 = false;

    @ObfuscatedName("client.lo")
    public static boolean field932 = true;

    @ObfuscatedName("client.lw")
    public static int field747 = -1;

    @ObfuscatedName("client.lh")
    public static int field824 = -1;

    @ObfuscatedName("client.lb")
    public static int field825 = 0;

    @ObfuscatedName("client.ms")
    public static int field826 = 50;

    @ObfuscatedName("client.mk")
    public static int field827 = 0;

    @ObfuscatedName("client.ml")
    public static boolean field829 = false;

    @ObfuscatedName("client.mu")
    public static int field830 = -1;

    @ObfuscatedName("client.mh")
    public static int field831 = -1;

    @ObfuscatedName("client.mi")
    public static String field679 = null;

    @ObfuscatedName("client.mo")
    public static String field922 = null;

    @ObfuscatedName("client.mj")
    public static int field834 = -1;

    @ObfuscatedName("client.md")
    public static class328 field835 = new class328(8);

    @ObfuscatedName("client.mw")
    public static int field836 = 0;

    @ObfuscatedName("client.mm")
    public static int field672 = -1;

    @ObfuscatedName("client.mf")
    public static int field838 = 0;

    @ObfuscatedName("client.mt")
    public static int field839 = 0;

    @ObfuscatedName("client.mq")
    public static class227 field840 = null;

    @ObfuscatedName("client.mg")
    public static int field742 = 0;

    @ObfuscatedName("client.mz")
    public static int field842 = 0;

    @ObfuscatedName("client.mv")
    public static int field843 = 0;

    @ObfuscatedName("client.mp")
    public static int field844 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field795 = false;

    @ObfuscatedName("client.nk")
    public static class227 field846 = null;

    @ObfuscatedName("client.na")
    public static class227 field847 = null;

    @ObfuscatedName("client.ng")
    public static class227 field848 = null;

    @ObfuscatedName("client.nn")
    public static int field849 = 0;

    @ObfuscatedName("client.nb")
    public static int field850 = 0;

    @ObfuscatedName("client.ni")
    public static class227 field851 = null;

    @ObfuscatedName("client.ne")
    public static boolean field693 = false;

    @ObfuscatedName("client.nl")
    public static int field853 = -1;

    @ObfuscatedName("client.np")
    public static int field854 = -1;

    @ObfuscatedName("client.no")
    public static boolean field855 = false;

    @ObfuscatedName("client.nw")
    public static int field856 = -1;

    @ObfuscatedName("client.nv")
    public static int field857 = -1;

    @ObfuscatedName("client.nu")
    public static boolean field858 = false;

    @ObfuscatedName("client.nm")
    public static int field859 = 1;

    @ObfuscatedName("client.nh")
    public static int[] field860 = new int[32];

    @ObfuscatedName("client.nc")
    public static int field861 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field914 = new int[32];

    @ObfuscatedName("client.nd")
    public static int field879 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field736 = new int[32];

    @ObfuscatedName("client.nx")
    public static int field832 = 0;

    @ObfuscatedName("client.oh")
    public static int field866 = 0;

    @ObfuscatedName("client.op")
    public static int field867 = 0;

    @ObfuscatedName("client.ou")
    public static int field944 = 0;

    @ObfuscatedName("client.ov")
    public static int field819 = 0;

    @ObfuscatedName("client.or")
    public static int field870 = 0;

    @ObfuscatedName("client.oq")
    public static int field871 = 0;

    @ObfuscatedName("client.oy")
    public static int field833 = 0;

    @ObfuscatedName("client.ow")
    public static class272 field873 = new class272();

    @ObfuscatedName("client.oj")
    public static class272 field892 = new class272();

    @ObfuscatedName("client.ot")
    public static class272 field692 = new class272();

    @ObfuscatedName("client.oi")
    public static class328 field876 = new class328(512);

    @ObfuscatedName("client.ob")
    public static int field727 = 0;

    @ObfuscatedName("client.oe")
    public static int field878 = -2;

    @ObfuscatedName("client.oo")
    public static boolean[] field814 = new boolean[100];

    @ObfuscatedName("client.od")
    public static boolean[] field880 = new boolean[100];

    @ObfuscatedName("client.oa")
    public static boolean[] field881 = new boolean[100];

    @ObfuscatedName("client.om")
    public static int[] field888 = new int[100];

    @ObfuscatedName("client.os")
    public static int[] field883 = new int[100];

    @ObfuscatedName("client.oc")
    public static int[] field909 = new int[100];

    @ObfuscatedName("client.ok")
    public static int[] field801 = new int[100];

    @ObfuscatedName("client.oz")
    public static int field696 = 0;

    @ObfuscatedName("client.og")
    public static long field887 = 0L;

    @ObfuscatedName("client.on")
    public static boolean field935 = true;

    @ObfuscatedName("client.pn")
    public static int[] field889 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pa")
    public static int field894 = 0;

    @ObfuscatedName("client.pm")
    public static int field903 = 0;

    @ObfuscatedName("client.pg")
    public static String field756 = "";

    @ObfuscatedName("client.ph")
    public static long[] field893 = new long[100];

    @ObfuscatedName("client.pz")
    public static int field731 = 0;

    @ObfuscatedName("client.pr")
    public static int field895 = 0;

    @ObfuscatedName("client.pf")
    public static int[] field921 = new int[128];

    @ObfuscatedName("client.pq")
    public static int[] field897 = new int[128];

    @ObfuscatedName("client.pu")
    public static long field898 = -1L;

    @ObfuscatedName("client.pd")
    public static int field938 = -1;

    @ObfuscatedName("client.pt")
    public static int field900 = 0;

    @ObfuscatedName("client.pj")
    public static int[] field891 = new int[1000];

    @ObfuscatedName("client.pi")
    public static int[] field902 = new int[1000];

    @ObfuscatedName("client.pw")
    public static class335[] field702 = new class335[1000];

    @ObfuscatedName("client.qb")
    public static int field904 = 0;

    @ObfuscatedName("client.qe")
    public static int field769 = 0;

    @ObfuscatedName("client.qu")
    public static int field751 = 0;

    @ObfuscatedName("client.qw")
    public static int field907 = 255;

    @ObfuscatedName("client.qx")
    public static int field682 = -1;

    @ObfuscatedName("client.qi")
    public static boolean field744 = false;

    @ObfuscatedName("client.qp")
    public static int field910 = 127;

    @ObfuscatedName("client.qg")
    public static int field911 = 127;

    @ObfuscatedName("client.qk")
    public static int field912 = 0;

    @ObfuscatedName("client.qf")
    public static int[] field913 = new int[50];

    @ObfuscatedName("client.ql")
    public static int[] field777 = new int[50];

    @ObfuscatedName("client.qz")
    public static int[] field877 = new int[50];

    @ObfuscatedName("client.qv")
    public static int[] field916 = new int[50];

    @ObfuscatedName("client.qm")
    public static class111[] field917 = new class111[50];

    @ObfuscatedName("client.rg")
    public static boolean field918 = false;

    @ObfuscatedName("client.rp")
    public static boolean[] field919 = new boolean[5];

    @ObfuscatedName("client.ru")
    public static int[] field920 = new int[5];

    @ObfuscatedName("client.rb")
    public static int[] field776 = new int[5];

    @ObfuscatedName("client.ry")
    public static int[] field779 = new int[5];

    @ObfuscatedName("client.rf")
    public static int[] field923 = new int[5];

    @ObfuscatedName("client.rv")
    public static short field728 = 256;

    @ObfuscatedName("client.rw")
    public static short field925 = 205;

    @ObfuscatedName("client.rl")
    public static short field708 = 256;

    @ObfuscatedName("client.rm")
    public static short field890 = 320;

    @ObfuscatedName("client.rh")
    public static short field928 = 1;

    @ObfuscatedName("client.rx")
    public static short field929 = 32767;

    @ObfuscatedName("client.rt")
    public static short field686 = 1;

    @ObfuscatedName("client.rj")
    public static short field862 = 32767;

    @ObfuscatedName("client.ro")
    public static int field884 = 0;

    @ObfuscatedName("client.sp")
    public static int field933 = 0;

    @ObfuscatedName("client.so")
    public static int field934 = 0;

    @ObfuscatedName("client.ss")
    public static int field796 = 0;

    @ObfuscatedName("client.sj")
    public static int field936 = 0;

    @ObfuscatedName("client.sk")
    public static class224 field931 = new class224();

    @ObfuscatedName("client.sr")
    public static int field869 = -1;

    @ObfuscatedName("client.sv")
    public static int field939 = -1;

    @ObfuscatedName("client.sf")
    public static class340 field886 = new class339();

    @ObfuscatedName("client.sd")
    public static class19[] field941 = new class19[8];

    @ObfuscatedName("client.sx")
    public static class77 field942 = new class77();

    @ObfuscatedName("client.su")
    public static int field943 = -1;

    @ObfuscatedName("client.sl")
    public static ArrayList field865 = new ArrayList(10);

    @ObfuscatedName("client.sc")
    public static int field945 = 0;

    @ObfuscatedName("client.sn")
    public static int field946 = 0;

    @ObfuscatedName("client.tt")
    public static final class75 field906 = new class75();

    @ObfuscatedName("client.ta")
    public static int[] field948 = new int[50];

    @ObfuscatedName("client.tr")
    public static int[] field949 = new int[50];

    @ObfuscatedName("kk.el(B)Lma;")
    public static class343 method4953() {
        return Statics.field2754;
    }

    @ObfuscatedName("client.av(I)V")
    public final void method840() {
    }

    public final void init() {
        if (!this.method830()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field940 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1177)) {
                            field896 = true;
                        } else {
                            field896 = false;
                        }
                        break;
                    case 4:
                        if (field677 == -1) {
                            field677 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field864 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1992 = class200.method3445(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class240[] var4 = new class240[] { class240.field3135, class240.field3136, class240.field3133, class240.field3134 };
                        class240[] var5 = var4;
                        int var6 = 0;
                        class240 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class240 var7 = var5[var6];
                            if (var7.field3138 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field3131 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1177)) {
                        }
                        break;
                    case 9:
                        Statics.field872 = var2;
                        break;
                    case 10:
                        Statics.field55 = (class241) class205.method3095(class241.method3864(), Integer.parseInt(var2));
                        if (Statics.field55 == class241.field3142) {
                            Statics.field2368 = class348.field4058;
                        } else {
                            Statics.field2368 = class348.field4060;
                        }
                        break;
                    case 12:
                        field729 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field2755 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field863 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3490 = var2;
                }
            }
        }
        class143.field1852 = false;
        field675 = false;
        Statics.field2032 = this.getCodeBase().getHost();
        String var9 = Statics.field3131.field3137;
        byte var10 = 0;
        try {
            class177.method1938("oldschool", var9, var10, 21);
        } catch (Exception var12) {
            class351.method3425((String) null, var12);
        }
        Statics.field170 = this;
        Statics.field4072 = field677;
        this.method833(765, 503, 190);
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method941() {
        class312.method4721(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1181 = field863 == 0 ? 43594 : field729 + 40000;
        Statics.field915 = field863 == 0 ? 443 : field729 + 50000;
        Statics.field277 = Statics.field1181;
        Statics.field2575 = class225.field2580;
        Statics.field2576 = class225.field2581;
        Statics.field2570 = class225.field2585;
        Statics.field1309 = class225.field2583;
        Statics.field136 = new class153();
        this.method887();
        this.method826();
        Statics.field30 = this.method858();
        Statics.field3294 = new class318(255, class177.field2079, class177.field2069, 500000);
        class353 var1 = null;
        class83 var2 = new class83();
        try {
            var1 = class177.method958("", Statics.field55.field3146, false);
            byte[] var3 = new byte[(int) var1.method6227()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6228(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class83(new class310(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6232();
            }
        } catch (Exception var9) {
        }
        Statics.field2108 = var2;
        this.method823();
        class61.method3273(this, Statics.field1574);
        if (field863 != 0) {
            field841 = true;
        }
        method1076(Statics.field2108.field1082);
        Statics.field2418 = new class84(Statics.field2368);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method845() {
        field671++;
        this.method1208();
        class245.method3401();
        try {
            if (class207.field2440 == 1) {
                int var1 = Statics.field257.method3474();
                if (var1 > 0 && Statics.field257.method3480()) {
                    int var2 = var1 - Statics.field2443;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field257.method3473(var2);
                } else {
                    Statics.field257.method3504();
                    Statics.field257.method3477();
                    if (Statics.field2544 == null) {
                        class207.field2440 = 0;
                    } else {
                        class207.field2440 = 2;
                    }
                    Statics.field434 = null;
                    Statics.field2095 = null;
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
            Statics.field257.method3504();
            class207.field2440 = 0;
            Statics.field434 = null;
            Statics.field2095 = null;
            Statics.field2544 = null;
        }
        method4752();
        class55.method3540();
        class64 var4 = class64.field501;
        synchronized (class64.field501) {
            class64.field507 = class64.field519;
            class64.field508 = class64.field516;
            class64.field498 = class64.field512;
            class64.field510 = class64.field506;
            class64.field515 = class64.field511;
            class64.field505 = class64.field503;
            class64.field504 = class64.field520;
            class64.field518 = class64.field514;
            class64.field511 = 0;
        }
        if (Statics.field30 != null) {
            int var6 = Statics.field30.method712();
            field833 = var6;
        }
        if (field714 == 0) {
            method1936();
            class63.method3528();
        } else if (field714 == 5) {
            class95.method125(this);
            method1936();
            Statics.field3667.method3247();
            for (int var7 = 0; var7 < 32; var7++) {
                field475[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field474[var8] = 0L;
            }
            Statics.field479 = 0;
        } else if (field714 == 10 || field714 == 11) {
            class95.method125(this);
        } else if (field714 == 20) {
            class95.method125(this);
            this.method1192();
        } else if (field714 == 25) {
            method200();
        }
        if (field714 == 30) {
            this.method1193();
        } else if (field714 == 40 || field714 == 45) {
            this.method1192();
        }
    }

    @ObfuscatedName("client.am(ZS)V")
    public final void method846(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class207.field2440 == 2) {
                    if (Statics.field434 == null) {
                        Statics.field434 = class213.method3663(Statics.field2544, Statics.field2437, Statics.field2040);
                        if (Statics.field434 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2095 == null) {
                        Statics.field2095 = new class118(Statics.field2445, Statics.field2438);
                    }
                    if (Statics.field257.method3564(Statics.field434, Statics.field2439, Statics.field2095, 22050)) {
                        Statics.field257.method3476();
                        Statics.field257.method3473(Statics.field2442);
                        Statics.field257.method3478(Statics.field434, Statics.field3914);
                        class207.field2440 = 0;
                        Statics.field434 = null;
                        Statics.field2095 = null;
                        Statics.field2544 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field257.method3504();
                class207.field2440 = 0;
                Statics.field434 = null;
                Statics.field2095 = null;
                Statics.field2544 = null;
            }
            var2 = false;
        }
        if (var2 && field744 && Statics.field4 != null) {
            Statics.field4.method2335();
        }
        if ((field714 == 10 || field714 == 20 || field714 == 30) && field887 != 0L && class307.method3253() > field887) {
            method1076(method765());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field814[var5] = true;
            }
        }
        if (field714 == 0) {
            this.method848(class95.field1211, class95.field1234, arg0);
        } else if (field714 == 5) {
            class95.method1656(Statics.field94, Statics.field271, Statics.field2435);
        } else if (field714 == 10 || field714 == 11) {
            class95.method1656(Statics.field94, Statics.field271, Statics.field2435);
        } else if (field714 == 20) {
            class95.method1656(Statics.field94, Statics.field271, Statics.field2435);
        } else if (field714 == 25) {
            if (field810 == 1) {
                if (field823 > field760) {
                    field760 = field823;
                }
                int var6 = (field760 * 50 - field823 * 50) / field760;
                method4010(class234.field2802 + class91.field1176 + class91.field1178 + var6 + "%" + class91.field1174, false);
            } else if (field810 == 2) {
                if (field691 > field730) {
                    field730 = field691;
                }
                int var7 = (field730 * 50 - field691 * 50) / field730 + 50;
                method4010(class234.field2802 + class91.field1176 + class91.field1178 + var7 + "%" + class91.field1174, false);
            } else {
                method4010(class234.field2802, false);
            }
        } else if (field714 == 30) {
            this.method1195();
        } else if (field714 == 40) {
            method4010(class234.field2798 + class91.field1176 + class234.field2804, false);
        } else if (field714 == 45) {
            method4010(class234.field2953, false);
        }
        if (field714 == 30 && field696 == 0 && !arg0 && !field935) {
            for (int var8 = 0; var8 < field727; var8++) {
                if (field880[var8]) {
                    Statics.field554.method811(field888[var8], field883[var8], field909[var8], field801[var8]);
                    field880[var8] = false;
                }
            }
        } else if (field714 > 0) {
            Statics.field554.method807(0, 0);
            for (int var9 = 0; var9 < field727; var9++) {
                field880[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method883() {
        if (Statics.field1201.method2080()) {
            Statics.field1201.method2077();
        }
        if (Statics.field2550 != null) {
            Statics.field2550.field614 = false;
        }
        Statics.field2550 = null;
        field721.method2163();
        class55.method2900();
        class64.method3188();
        Statics.field30 = null;
        if (Statics.field4 != null) {
            Statics.field4.method2330();
        }
        if (Statics.field445 != null) {
            Statics.field445.method2330();
        }
        class247.method278();
        class245.method570();
        if (Statics.field136 != null) {
            Statics.field136.method3113();
            Statics.field136 = null;
        }
        class177.method2376();
    }

    @ObfuscatedName("cz.ed(IB)V")
    public static void method1727(int arg0) {
        if (field714 == arg0) {
            return;
        }
        if (field714 == 0) {
            Statics.field170.method849();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field705 = 0;
            field706 = 0;
            field707 = 0;
            field725.method4748(arg0);
            if (arg0 != 20) {
                method4537(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field36 != null) {
            Statics.field36.method3322();
            Statics.field36 = null;
        }
        if (field714 == 25) {
            field810 = 0;
            field823 = 0;
            field760 = 1;
            field691 = 0;
            field730 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method464(Statics.field1137, Statics.field77, true, 0);
        } else if (arg0 == 20) {
            class95.method464(Statics.field1137, Statics.field77, true, field714 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method464(Statics.field1137, Statics.field77, false, 4);
        } else if (Statics.field104) {
            Statics.field1148 = null;
            Statics.field3694 = null;
            Statics.field1204 = null;
            Statics.field1209 = null;
            Statics.field565 = null;
            Statics.field1220 = null;
            Statics.field1490 = null;
            Statics.field1207 = null;
            Statics.field497 = null;
            Statics.field1175 = null;
            Statics.field3271 = null;
            Statics.field78 = null;
            Statics.field2750 = null;
            Statics.field207 = null;
            Statics.field1208.method1684();
            class207.field2440 = 1;
            Statics.field2544 = null;
            Statics.field2437 = -1;
            Statics.field2040 = -1;
            Statics.field2442 = 0;
            Statics.field3914 = false;
            Statics.field2443 = 2;
            class247.method547(true);
            Statics.field104 = false;
        }
        field714 = arg0;
    }

    @ObfuscatedName("client.eg(B)V")
    public void method1208() {
        if (field714 == 1000) {
            return;
        }
        long var1 = class307.method3253();
        int var3 = (int) (var1 - Statics.field1094);
        Statics.field1094 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class247.field3198 += var3;
        boolean var4;
        if (class247.field3206 == 0 && class247.field3203 == 0 && class247.field3200 == 0 && class247.field3201 == 0) {
            var4 = true;
        } else if (Statics.field3211 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class247.field3198 > 30000) {
                        throw new IOException();
                    }
                    while (class247.field3203 < 200 && class247.field3201 > 0) {
                        class243 var5 = (class243) class247.field3199.method5644();
                        class310 var6 = new class310(4);
                        var6.method5437(1);
                        var6.method5402((int) var5.field2152);
                        Statics.field3211.method3304(var6.field3736, 0, 4);
                        class247.field3202.method5643(var5, var5.field2152);
                        class247.field3201--;
                        class247.field3203++;
                    }
                    while (class247.field3206 < 200 && class247.field3200 > 0) {
                        class243 var7 = (class243) class247.field3204.method4556();
                        class310 var8 = new class310(4);
                        var8.method5437(0);
                        var8.method5402((int) var7.field2152);
                        Statics.field3211.method3304(var8.field3736, 0, 4);
                        var7.method3379();
                        class247.field3207.method5643(var7, var7.field2152);
                        class247.field3200--;
                        class247.field3206++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3211.method3299();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class247.field3198 = 0;
                        byte var11 = 0;
                        if (Statics.field3126 == null) {
                            var11 = 8;
                        } else if (class247.field3215 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class247.field3210.field3734;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3211.method3302(class247.field3210.field3736, class247.field3210.field3734, var12);
                            if (class247.field3214 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class247.field3210.field3736[class247.field3210.field3734 + var13] ^= class247.field3214;
                                }
                            }
                            class247.field3210.field3734 += var12;
                            if (class247.field3210.field3734 < var11) {
                                break;
                            }
                            if (Statics.field3126 == null) {
                                class247.field3210.field3734 = 0;
                                int var14 = class247.field3210.method5227();
                                int var15 = class247.field3210.method5283();
                                int var16 = class247.field3210.method5227();
                                int var17 = class247.field3210.method5209();
                                long var18 = (long) ((var14 << 16) + var15);
                                class243 var20 = (class243) class247.field3202.method5641(var18);
                                Statics.field3209 = true;
                                if (var20 == null) {
                                    var20 = (class243) class247.field3207.method5641(var18);
                                    Statics.field3209 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3126 = var20;
                                Statics.field2126 = new class310(var17 + var21 + Statics.field3126.field3157);
                                Statics.field2126.method5437(var16);
                                Statics.field2126.method5213(var17);
                                class247.field3215 = 8;
                                class247.field3210.field3734 = 0;
                            } else if (class247.field3215 == 0) {
                                if (class247.field3210.field3736[0] == -1) {
                                    class247.field3215 = 1;
                                    class247.field3210.field3734 = 0;
                                } else {
                                    Statics.field3126 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2126.field3736.length - Statics.field3126.field3157;
                            int var23 = 512 - class247.field3215;
                            if (var23 > var22 - Statics.field2126.field3734) {
                                var23 = var22 - Statics.field2126.field3734;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3211.method3302(Statics.field2126.field3736, Statics.field2126.field3734, var23);
                            if (class247.field3214 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2126.field3736[Statics.field2126.field3734 + var24] ^= class247.field3214;
                                }
                            }
                            Statics.field2126.field3734 += var23;
                            class247.field3215 += var23;
                            if (Statics.field2126.field3734 == var22) {
                                if (Statics.field3126.field2152 == 16711935L) {
                                    Statics.field1994 = Statics.field2126;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class246 var26 = class247.field3213[var25];
                                        if (var26 != null) {
                                            Statics.field1994.field3734 = var25 * 8 + 5;
                                            int var27 = Statics.field1994.method5209();
                                            int var28 = Statics.field1994.method5209();
                                            var26.method4017(var27, var28);
                                        }
                                    }
                                } else {
                                    class247.field3212.reset();
                                    class247.field3212.update(Statics.field2126.field3736, 0, var22);
                                    int var29 = (int) class247.field3212.getValue();
                                    if (Statics.field3126.field3158 != var29) {
                                        try {
                                            Statics.field3211.method3322();
                                        } catch (Exception var35) {
                                        }
                                        class247.field3208++;
                                        Statics.field3211 = null;
                                        class247.field3214 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class247.field3208 = 0;
                                    class247.field3216 = 0;
                                    Statics.field3126.field3155.method4037((int) (Statics.field3126.field2152 & 0xFFFFL), Statics.field2126.field3736, (Statics.field3126.field2152 & 0xFF0000L) == 16711680L, Statics.field3209);
                                }
                                Statics.field3126.method3388();
                                if (Statics.field3209) {
                                    class247.field3203--;
                                } else {
                                    class247.field3206--;
                                }
                                class247.field3215 = 0;
                                Statics.field3126 = null;
                                Statics.field2126 = null;
                            } else {
                                if (class247.field3215 != 512) {
                                    break;
                                }
                                class247.field3215 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3211.method3322();
                } catch (Exception var34) {
                }
                class247.field3216++;
                Statics.field3211 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1190();
        }
    }

    @ObfuscatedName("client.ey(B)V")
    public void method1190() {
        if (class247.field3208 >= 4) {
            this.method842("js5crc");
            field714 = 1000;
            return;
        }
        if (class247.field3216 >= 4) {
            if (field714 <= 5) {
                this.method842("js5io");
                field714 = 1000;
                return;
            }
            field816 = 3000;
            class247.field3216 = 3;
        }
        if (--field816 + 1 > 0) {
            return;
        }
        try {
            if (field905 == 0) {
                Statics.field701 = Statics.field99.method3258(Statics.field2032, Statics.field277);
                field905++;
            }
            if (field905 == 1) {
                if (Statics.field701.field2051 == 2) {
                    this.method1191(-1);
                    return;
                }
                if (Statics.field701.field2051 == 1) {
                    field905++;
                }
            }
            if (field905 == 2) {
                if (field940) {
                    Statics.field1964 = class315.method4963((Socket) Statics.field701.field2056, 40000, 5000);
                } else {
                    Statics.field1964 = new class181((Socket) Statics.field701.field2056, Statics.field99, 5000);
                }
                class310 var1 = new class310(5);
                var1.method5437(15);
                var1.method5213(190);
                Statics.field1964.method3304(var1.field3736, 0, 5);
                field905++;
                Statics.field262 = class307.method3253();
            }
            if (field905 == 3) {
                if (Statics.field1964.method3299() > 0 || !field940 && field714 <= 5) {
                    int var2 = Statics.field1964.method3300();
                    if (var2 != 0) {
                        this.method1191(var2);
                        return;
                    }
                    field905++;
                } else if (class307.method3253() - Statics.field262 > 30000L) {
                    this.method1191(-2);
                    return;
                }
            }
            if (field905 == 4) {
                class315 var3 = Statics.field1964;
                boolean var4 = field714 > 20;
                if (Statics.field3211 != null) {
                    try {
                        Statics.field3211.method3322();
                    } catch (Exception var14) {
                    }
                    Statics.field3211 = null;
                }
                Statics.field3211 = var3;
                class247.method547(var4);
                class247.field3210.field3734 = 0;
                Statics.field3126 = null;
                Statics.field2126 = null;
                class247.field3215 = 0;
                while (true) {
                    class243 var6 = (class243) class247.field3202.method5644();
                    if (var6 == null) {
                        while (true) {
                            class243 var7 = (class243) class247.field3207.method5644();
                            if (var7 == null) {
                                if (class247.field3214 != 0) {
                                    try {
                                        class310 var8 = new class310(4);
                                        var8.method5437(4);
                                        var8.method5437(class247.field3214);
                                        var8.method5387(0);
                                        Statics.field3211.method3304(var8.field3736, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3211.method3322();
                                        } catch (Exception var12) {
                                        }
                                        class247.field3216++;
                                        Statics.field3211 = null;
                                    }
                                }
                                class247.field3198 = 0;
                                Statics.field1094 = class307.method3253();
                                Statics.field701 = null;
                                Statics.field1964 = null;
                                field905 = 0;
                                field704 = 0;
                                return;
                            }
                            class247.field3204.method4555(var7);
                            class247.field3205.method5643(var7, var7.field2152);
                            class247.field3200++;
                            class247.field3206--;
                        }
                    }
                    class247.field3199.method5643(var6, var6.field2152);
                    class247.field3201++;
                    class247.field3203--;
                }
            }
        } catch (IOException var15) {
            this.method1191(-3);
        }
    }

    @ObfuscatedName("client.ew(IB)V")
    public void method1191(int arg0) {
        Statics.field701 = null;
        Statics.field1964 = null;
        field905 = 0;
        if (Statics.field277 == Statics.field1181) {
            Statics.field277 = Statics.field915;
        } else {
            Statics.field277 = Statics.field1181;
        }
        field704++;
        if (field704 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field714 <= 5) {
                this.method842("js5connect_full");
                field714 = 1000;
            } else {
                field816 = 3000;
            }
        } else if (field704 >= 2 && arg0 == 6) {
            this.method842("js5connect_outofdate");
            field714 = 1000;
        } else if (field704 >= 4) {
            if (field714 <= 5) {
                this.method842("js5connect");
                field714 = 1000;
            } else {
                field816 = 3000;
            }
        }
    }

    @ObfuscatedName("as.ep(Lig;Ljava/lang/String;I)V")
    public static void method404(class246 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field865.add(var2);
        field946 += var2.field550;
    }

    @ObfuscatedName("gp.ev(B)I")
    public static int method3457() {
        if (field865 == null || field945 >= field865.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field945; var1++) {
            var0 += ((class68) field865.get(var1)).field558;
        }
        return var0 * 10000 / field946;
    }

    @ObfuscatedName("b.eh(III)V")
    public static void method201(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class140.field1812[var4];
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (field890 - field708) * var8 / 100 + field708;
            int var10 = var5 * var9 / 256;
            var2[var3] = var7 * var10 >> 16;
        }
        class143.method2940(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ck.eb(B)V")
    public static void method1936() {
        if (field700 == 0) {
            Statics.field2011 = new class143(4, 104, 104, class65.field533);
            for (int var0 = 0; var0 < 4; var0++) {
                field732[var0] = new class182(104, 104);
            }
            Statics.field12 = new class335(512, 512);
            class95.field1234 = class234.field2805;
            class95.field1211 = 5;
            field700 = 20;
        } else if (field700 == 20) {
            class95.field1234 = class234.field2947;
            class95.field1211 = 10;
            field700 = 30;
        } else if (field700 == 30) {
            Statics.field2046 = method704(0, false, true, true);
            Statics.field616 = method704(1, false, true, true);
            Statics.field2091 = method704(2, true, false, true);
            Statics.field1357 = method704(3, false, true, true);
            Statics.field82 = method704(4, false, true, true);
            Statics.field200 = method704(5, true, true, true);
            Statics.field2005 = method704(6, true, true, true);
            Statics.field1262 = method704(7, false, true, true);
            Statics.field77 = method704(8, false, true, true);
            Statics.field1683 = method704(9, false, true, true);
            Statics.field1137 = method704(10, false, true, true);
            Statics.field117 = method704(11, false, true, true);
            Statics.field626 = method704(12, false, true, true);
            Statics.field3139 = method704(13, true, false, true);
            Statics.field212 = method704(14, false, true, true);
            Statics.field275 = method704(15, false, true, true);
            Statics.field317 = method704(17, true, true, true);
            Statics.field3268 = method704(18, false, true, true);
            Statics.field116 = method704(19, false, true, true);
            Statics.field2247 = method704(20, false, true, true);
            class95.field1234 = class234.field2807;
            class95.field1211 = 20;
            field700 = 40;
        } else if (field700 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field2046.method4014() * 4 / 100;
            int var3 = var2 + Statics.field616.method4014() * 4 / 100;
            int var4 = var3 + Statics.field2091.method4014() * 2 / 100;
            int var5 = var4 + Statics.field1357.method4014() * 2 / 100;
            int var6 = var5 + Statics.field82.method4014() * 6 / 100;
            int var7 = var6 + Statics.field200.method4014() * 4 / 100;
            int var8 = var7 + Statics.field2005.method4014() * 2 / 100;
            int var9 = var8 + Statics.field1262.method4014() * 56 / 100;
            int var10 = var9 + Statics.field77.method4014() * 2 / 100;
            int var11 = var10 + Statics.field1683.method4014() * 2 / 100;
            int var12 = var11 + Statics.field1137.method4014() * 2 / 100;
            int var13 = var12 + Statics.field117.method4014() * 2 / 100;
            int var14 = var13 + Statics.field626.method4014() * 2 / 100;
            int var15 = var14 + Statics.field3139.method4014() * 2 / 100;
            int var16 = var15 + Statics.field212.method4014() * 2 / 100;
            int var17 = var16 + Statics.field275.method4014() * 2 / 100;
            int var18 = var17 + Statics.field116.method4014() / 100;
            int var19 = var18 + Statics.field3268.method4014() / 100;
            int var20 = var19 + Statics.field2247.method4014() / 100;
            int var21 = var20 + (Statics.field317.method4031() && Statics.field317.method3970() ? 1 : 0);
            if (var21 == 100) {
                method404(Statics.field2046, "Animations");
                method404(Statics.field616, "Skeletons");
                method404(Statics.field82, "Sound FX");
                method404(Statics.field200, "Maps");
                method404(Statics.field2005, "Music Tracks");
                method404(Statics.field1262, "Models");
                method404(Statics.field77, "Sprites");
                method404(Statics.field117, "Music Jingles");
                method404(Statics.field212, "Music Samples");
                method404(Statics.field275, "Music Patches");
                method404(Statics.field116, "World Map");
                method404(Statics.field3268, "World Map Geography");
                method404(Statics.field2247, "World Map Ground");
                Statics.field1998 = new class322();
                Statics.field1998.method5593(Statics.field317);
                class95.field1234 = class234.field2809;
                class95.field1211 = 30;
                field700 = 45;
            } else {
                if (var21 != 0) {
                    class95.field1234 = class234.field2808 + var21 + "%";
                }
                class95.field1211 = 30;
            }
        } else if (field700 == 45) {
            class115.method3450(22050, !field675, 2);
            class208 var22 = new class208();
            var22.method3557(9, 128);
            Statics.field4 = class115.method5040(Statics.field99, 0, 22050);
            Statics.field4.method2329(var22);
            class246 var23 = Statics.field275;
            class246 var24 = Statics.field212;
            class246 var25 = Statics.field82;
            Statics.field2439 = var23;
            Statics.field2438 = var24;
            Statics.field2445 = var25;
            Statics.field257 = var22;
            Statics.field445 = class115.method5040(Statics.field99, 1, 2048);
            Statics.field450 = new class108();
            Statics.field445.method2329(Statics.field450);
            Statics.field2382 = new class122(22050, Statics.field3114);
            class95.field1234 = class234.field2810;
            class95.field1211 = 35;
            field700 = 50;
            Statics.field163 = new class303(Statics.field77, Statics.field3139);
        } else if (field700 == 50) {
            class302[] var26 = new class302[] { class302.field3681, class302.field3684, class302.field3682, class302.field3688, class302.field3683, class302.field3689 };
            int var27 = var26.length;
            class303 var28 = Statics.field163;
            class302[] var29 = new class302[] { class302.field3681, class302.field3684, class302.field3682, class302.field3688, class302.field3683, class302.field3689 };
            field726 = var28.method5043(var29);
            if (field726.size() < var27) {
                class95.field1234 = class234.field2990 + field726.size() * 100 / var27 + "%";
                class95.field1211 = 40;
            } else {
                Statics.field271 = (class305) field726.get(class302.field3689);
                Statics.field2435 = (class305) field726.get(class302.field3681);
                Statics.field94 = (class305) field726.get(class302.field3682);
                Statics.field51 = field886.method5934();
                class95.field1234 = class234.field2812;
                class95.field1211 = 40;
                field700 = 60;
            }
        } else if (field700 == 60) {
            int var30 = class95.method4011(Statics.field1137, Statics.field77);
            byte var31 = 12;
            if (var30 < var31) {
                class95.field1234 = class234.field2813 + var30 * 100 / var31 + "%";
                class95.field1211 = 50;
            } else {
                class95.field1234 = class234.field2814;
                class95.field1211 = 50;
                method1727(5);
                field700 = 70;
            }
        } else if (field700 == 70) {
            if (Statics.field2091.method3970()) {
                class246 var33 = Statics.field2091;
                Statics.field3535 = var33;
                class255.method1805(Statics.field2091);
                class256.method166(Statics.field2091, Statics.field1262);
                class246 var34 = Statics.field2091;
                class246 var35 = Statics.field1262;
                boolean var36 = field675;
                Statics.field3398 = var34;
                Statics.field3404 = var35;
                class264.field3391 = var36;
                class246 var37 = Statics.field2091;
                class246 var38 = Statics.field1262;
                Statics.field3525 = var37;
                Statics.field3495 = var38;
                class261.method3423(Statics.field2091);
                class265.method3227(Statics.field2091, Statics.field1262, field896, Statics.field271);
                class246 var39 = Statics.field2091;
                class246 var40 = Statics.field2046;
                class246 var41 = Statics.field616;
                Statics.field3549 = var39;
                Statics.field3545 = var40;
                Statics.field3546 = var41;
                class254.method1964(Statics.field2091, Statics.field1262);
                class246 var42 = Statics.field2091;
                Statics.field3333 = var42;
                class251.method2036(Statics.field2091);
                class227.method3174(Statics.field1357, Statics.field1262, Statics.field77, Statics.field3139);
                class246 var43 = Statics.field2091;
                Statics.field3234 = var43;
                Statics.method3199(Statics.field2091);
                class246 var44 = Statics.field2091;
                Statics.field3264 = var44;
                class260.method78(Statics.field2091);
                Statics.field1201 = new class100();
                class246 var45 = Statics.field2091;
                class246 var46 = Statics.field77;
                class246 var47 = Statics.field3139;
                Statics.field3377 = var45;
                Statics.field3357 = var46;
                Statics.field3372 = var47;
                class246 var48 = Statics.field2091;
                class246 var49 = Statics.field77;
                Statics.field3310 = var48;
                Statics.field3326 = var49;
                class246 var50 = Statics.field2091;
                class246 var51 = Statics.field77;
                Statics.field3254 = var51;
                if (var50.method3970()) {
                    Statics.field3242 = var50.method3903(35);
                    Statics.field3328 = new class252[Statics.field3242];
                    for (int var52 = 0; var52 < Statics.field3242; var52++) {
                        byte[] var53 = var50.method3891(35, var52);
                        Statics.field3328[var52] = new class252(var52);
                        if (var53 != null) {
                            Statics.field3328[var52].method4122(new class310(var53));
                            Statics.field3328[var52].method4117();
                        }
                    }
                }
                class95.field1234 = class234.field2944;
                class95.field1211 = 60;
                field700 = 80;
            } else {
                class95.field1234 = class234.field2815 + Statics.field2091.method4022() + "%";
                class95.field1211 = 60;
            }
        } else if (field700 == 80) {
            int var54 = 0;
            if (Statics.field96 == null) {
                Statics.field96 = class336.method837(Statics.field77, Statics.field1998.field3834, 0);
            } else {
                var54++;
            }
            if (Statics.field1971 == null) {
                Statics.field1971 = class336.method837(Statics.field77, Statics.field1998.field3826, 0);
            } else {
                var54++;
            }
            if (Statics.field2022 == null) {
                Statics.field2022 = class336.method1926(Statics.field77, Statics.field1998.field3827, 0);
            } else {
                var54++;
            }
            if (Statics.field2111 == null) {
                Statics.field2111 = class336.method3688(Statics.field77, Statics.field1998.field3828, 0);
            } else {
                var54++;
            }
            if (Statics.field424 == null) {
                Statics.field424 = class336.method3688(Statics.field77, Statics.field1998.field3829, 0);
            } else {
                var54++;
            }
            if (Statics.field1468 == null) {
                Statics.field1468 = class336.method3688(Statics.field77, Statics.field1998.field3830, 0);
            } else {
                var54++;
            }
            if (Statics.field44 == null) {
                Statics.field44 = class336.method3688(Statics.field77, Statics.field1998.field3831, 0);
            } else {
                var54++;
            }
            if (Statics.field3609 == null) {
                Statics.field3609 = class336.method3688(Statics.field77, Statics.field1998.field3832, 0);
            } else {
                var54++;
            }
            if (Statics.field1200 == null) {
                Statics.field1200 = class336.method3688(Statics.field77, Statics.field1998.field3835, 0);
            } else {
                var54++;
            }
            if (Statics.field3262 == null) {
                Statics.field3262 = class336.method1926(Statics.field77, Statics.field1998.field3825, 0);
            } else {
                var54++;
            }
            if (Statics.field18 == null) {
                Statics.field18 = class336.method1926(Statics.field77, Statics.field1998.field3833, 0);
            } else {
                var54++;
            }
            if (var54 < 11) {
                class95.field1234 = class234.field2892 + var54 * 100 / 12 + "%";
                class95.field1211 = 70;
            } else {
                Statics.field3708 = Statics.field18;
                Statics.field1971.method5793();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2022[0].method5770(var55 + var58, var56 + var58, var57 + var58);
                class95.field1234 = class234.field2818;
                class95.field1211 = 70;
                field700 = 90;
            }
        } else if (field700 == 90) {
            if (Statics.field1683.method3970()) {
                Statics.field2009 = new class129(Statics.field1683, Statics.field77, 20, 0.8D, field675 ? 64 : 128);
                class140.method2892(Statics.field2009);
                class140.method2897(0.8D);
                field700 = 100;
            } else {
                class95.field1234 = class234.field3039 + "0%";
                class95.field1211 = 90;
            }
        } else if (field700 == 100) {
            int var59 = Statics.field2009.method2610();
            if (var59 < 100) {
                class95.field1234 = class234.field3039 + var59 + "%";
                class95.field1211 = 90;
            } else {
                class95.field1234 = class234.field2973;
                class95.field1211 = 90;
                field700 = 110;
            }
        } else if (field700 == 110) {
            Statics.field2550 = new class73();
            Statics.field99.method3274(Statics.field2550, 10);
            class95.field1234 = class234.field3048;
            class95.field1211 = 92;
            field700 = 120;
        } else if (field700 == 120) {
            if (Statics.field1137.method3939("huffman", "")) {
                class219 var60 = new class219(Statics.field1137.method3951("huffman", ""));
                Statics.field2553 = var60;
                class95.field1234 = class234.field2958;
                class95.field1211 = 94;
                field700 = 130;
            } else {
                class95.field1234 = class234.field3077 + "%";
                class95.field1211 = 94;
            }
        } else if (field700 == 130) {
            if (!Statics.field1357.method3970()) {
                class95.field1234 = class234.field2824 + Statics.field1357.method4022() * 4 / 5 + "%";
                class95.field1211 = 96;
            } else if (!Statics.field626.method3970()) {
                class95.field1234 = class234.field2824 + (80 + Statics.field626.method4022() / 6) + "%";
                class95.field1211 = 96;
            } else if (Statics.field3139.method3970()) {
                class95.field1234 = class234.field2886;
                class95.field1211 = 98;
                field700 = 140;
            } else {
                class95.field1234 = class234.field2824 + (96 + Statics.field3139.method4022() / 50) + "%";
                class95.field1211 = 96;
            }
        } else if (field700 == 140) {
            class95.field1211 = 100;
            if (Statics.field116.method3898(class45.field323.field328)) {
                if (Statics.field2754 == null) {
                    Statics.field2754 = new class343();
                    Statics.field2754.method5987(Statics.field116, Statics.field3268, Statics.field2247, Statics.field94, field726, Statics.field2022);
                }
                class95.field1234 = class234.field2827;
                field700 = 150;
            } else {
                class95.field1234 = class234.field2826 + Statics.field116.method3915(class45.field323.field328) / 10 + "%";
            }
        } else if (field700 == 150) {
            method1727(10);
        }
    }

    @ObfuscatedName("aj.ec(IZZZB)Lig;")
    public static class246 method704(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class318 var4 = null;
        if (class177.field2079 != null) {
            var4 = new class318(arg0, class177.field2079, Statics.field2068[arg0], 1000000);
        }
        return new class246(var4, Statics.field3294, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ee(I)V")
    public final void method1192() {
        class315 var1 = field721.method2165();
        class309 var2 = field721.field1345;
        try {
            if (field705 == 0) {
                if (Statics.field1339 == null && (field712.method2040() || field706 > 250)) {
                    Statics.field1339 = field712.method2039();
                    field712.method2041();
                    field712 = null;
                }
                if (Statics.field1339 != null) {
                    if (var1 != null) {
                        var1.method3322();
                        var1 = null;
                    }
                    Statics.field557 = null;
                    field723 = false;
                    field706 = 0;
                    field705 = 1;
                }
            }
            if (field705 == 1) {
                if (Statics.field557 == null) {
                    Statics.field557 = Statics.field99.method3258(Statics.field2032, Statics.field277);
                }
                if (Statics.field557.field2051 == 2) {
                    throw new IOException();
                }
                if (Statics.field557.field2051 == 1) {
                    if (field940) {
                        var1 = class315.method4963((Socket) Statics.field557.field2056, 40000, 5000);
                    } else {
                        var1 = new class181((Socket) Statics.field557.field2056, Statics.field99, 5000);
                    }
                    field721.method2174(var1);
                    Statics.field557 = null;
                    field705 = 2;
                }
            }
            if (field705 == 2) {
                field721.method2160();
                class197 var3 = class197.method2704();
                var3.field2375.method5437(class194.field2353.field2352);
                field721.method2161(var3);
                field721.method2159();
                var2.field3734 = 0;
                field705 = 3;
            }
            if (field705 == 3) {
                if (Statics.field4 != null) {
                    Statics.field4.method2328();
                }
                if (Statics.field445 != null) {
                    Statics.field445.method2328();
                }
                boolean var4 = true;
                if (field940 && !var1.method3301(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3300();
                    if (Statics.field4 != null) {
                        Statics.field4.method2328();
                    }
                    if (Statics.field445 != null) {
                        Statics.field445.method2328();
                    }
                    if (var5 != 0) {
                        method197(var5);
                        return;
                    }
                    var2.field3734 = 0;
                    field705 = 4;
                }
            }
            if (field705 == 4) {
                if (var2.field3734 < 8) {
                    int var6 = var1.method3299();
                    if (var6 > 8 - var2.field3734) {
                        var6 = 8 - var2.field3734;
                    }
                    if (var6 > 0) {
                        var1.method3302(var2.field3736, var2.field3734, var6);
                        var2.field3734 += var6;
                    }
                }
                if (var2.field3734 == 8) {
                    var2.field3734 = 0;
                    Statics.field2047 = var2.method5233();
                    field705 = 5;
                }
            }
            if (field705 == 5) {
                field721.field1345.field3734 = 0;
                field721.method2160();
                class309 var7 = new class309(500);
                int[] var8 = new int[] { Statics.field1339.nextInt(), Statics.field1339.nextInt(), Statics.field1339.nextInt(), Statics.field1339.nextInt() };
                var7.field3734 = 0;
                var7.method5437(1);
                var7.method5213(var8[0]);
                var7.method5213(var8[1]);
                var7.method5213(var8[2]);
                var7.method5213(var8[3]);
                var7.method5310(Statics.field2047);
                if (field714 == 40) {
                    var7.method5213(Statics.field29[0]);
                    var7.method5213(Statics.field29[1]);
                    var7.method5213(Statics.field29[2]);
                    var7.method5213(Statics.field29[3]);
                } else {
                    var7.method5437(field709.method21());
                    switch(field709.field2027) {
                        case 0:
                            var7.method5213((Integer) Statics.field2108.field1081.get(class301.method618(class95.field1222)));
                            break;
                        case 1:
                        case 3:
                            var7.method5402(Statics.field265);
                            var7.field3734++;
                            break;
                        case 2:
                            var7.field3734 += 4;
                    }
                    var7.method5437(class323.field3842.method21());
                    var7.method5217(class95.field1221);
                }
                var7.method5429(class93.field1189, class93.field1190);
                Statics.field29 = var8;
                class197 var9 = class197.method2704();
                var9.field2375.field3734 = 0;
                if (field714 == 40) {
                    var9.field2375.method5437(class194.field2349.field2352);
                } else {
                    var9.field2375.method5437(class194.field2348.field2352);
                }
                var9.field2375.method5387(0);
                int var10 = var9.field2375.field3734;
                var9.field2375.method5213(190);
                var9.field2375.method5213(1);
                var9.field2375.method5437(field677);
                var9.field2375.method5220(var7.field3736, 0, var7.field3734);
                int var11 = var9.field2375.field3734;
                var9.field2375.method5217(class95.field1222);
                var9.field2375.method5437((field935 ? 1 : 0) << 1 | (field675 ? 1 : 0));
                var9.field2375.method5387(Statics.field1299);
                var9.field2375.method5387(Statics.field397);
                class309 var12 = var9.field2375;
                if (field715 == null) {
                    byte[] var13 = new byte[24];
                    try {
                        class177.field2072.method6200(0L);
                        class177.field2072.method6199(var13);
                        int var14;
                        for (var14 = 0; var14 < 24 && var13[var14] == 0; var14++) {
                        }
                        if (var14 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var64) {
                        for (int var16 = 0; var16 < 24; var16++) {
                            var13[var16] = -1;
                        }
                    }
                    var12.method5220(var13, 0, var13.length);
                } else {
                    var12.method5220(field715, 0, field715.length);
                }
                var9.field2375.method5217(Statics.field872);
                var9.field2375.method5213(Statics.field2755);
                class310 var19 = new class310(Statics.field51.method5952());
                Statics.field51.method5950(var19);
                var9.field2375.method5220(var19.field3736, 0, var19.field3736.length);
                var9.field2375.method5437(field677);
                var9.field2375.method5213(0);
                var9.field2375.method5274(Statics.field2005.field3171);
                var9.field2375.method5272(Statics.field2091.field3171);
                var9.field2375.method5373(Statics.field117.field3171);
                var9.field2375.method5274(Statics.field1262.field3171);
                var9.field2375.method5373(Statics.field77.field3171);
                var9.field2375.method5373(Statics.field626.field3171);
                var9.field2375.method5274(Statics.field116.field3171);
                var9.field2375.method5272(Statics.field3139.field3171);
                var9.field2375.method5373(Statics.field3268.field3171);
                var9.field2375.method5274(Statics.field212.field3171);
                var9.field2375.method5272(Statics.field317.field3171);
                var9.field2375.method5373(Statics.field1683.field3171);
                var9.field2375.method5272(Statics.field200.field3171);
                var9.field2375.method5373(Statics.field616.field3171);
                var9.field2375.method5272(Statics.field2247.field3171);
                var9.field2375.method5272(0);
                var9.field2375.method5213(Statics.field275.field3171);
                var9.field2375.method5272(Statics.field1137.field3171);
                var9.field2375.method5272(Statics.field1357.field3171);
                var9.field2375.method5213(Statics.field82.field3171);
                var9.field2375.method5272(Statics.field2046.field3171);
                var9.field2375.method5248(var8, var11, var9.field2375.field3734);
                var9.field2375.method5447(var9.field2375.field3734 - var10);
                field721.method2161(var9);
                field721.method2159();
                field721.field1340 = new class338(var8);
                int[] var20 = new int[4];
                for (int var21 = 0; var21 < 4; var21++) {
                    var20[var21] = var8[var21] + 50;
                }
                var2.method5163(var20);
                field705 = 6;
            }
            if (field705 == 6 && var1.method3299() > 0) {
                int var22 = var1.method3300();
                if (var22 == 21 && field714 == 20) {
                    field705 = 12;
                } else if (var22 == 2) {
                    field705 = 14;
                } else if (var22 == 15 && field714 == 40) {
                    field721.field1347 = -1;
                    field705 = 19;
                } else if (var22 == 64) {
                    field705 = 10;
                } else if (var22 == 23 && field707 < 1) {
                    field707++;
                    field705 = 0;
                } else if (var22 == 29) {
                    field705 = 17;
                } else if (var22 == 69) {
                    field705 = 7;
                } else {
                    method197(var22);
                    return;
                }
            }
            if (field705 == 7 && var1.method3299() >= 2) {
                var1.method3302(var2.field3736, 0, 2);
                var2.field3734 = 0;
                Statics.field175 = var2.method5283();
                field705 = 8;
            }
            if (field705 == 8 && var1.method3299() >= Statics.field175) {
                var2.field3734 = 0;
                var1.method3302(var2.field3736, var2.field3734, Statics.field175);
                class8 var23 = class8.method28()[var2.method5227()];
                try {
                    switch(var23.field27) {
                        case 0:
                            class6 var24 = new class6();
                            this.field852 = new class10(var2, var24);
                            field705 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var63) {
                    method197(22);
                    return;
                }
            }
            if (field705 == 9 && this.field852.method81()) {
                this.field930 = this.field852.method83();
                this.field852.method82();
                this.field852 = null;
                if (this.field930 == null) {
                    method197(22);
                    return;
                }
                field721.method2160();
                class197 var27 = class197.method2704();
                var27.field2375.method5437(class194.field2346.field2352);
                var27.field2375.method5387(this.field930.field3734);
                var27.field2375.method5221(this.field930);
                field721.method2161(var27);
                field721.method2159();
                this.field930 = null;
                field705 = 6;
            }
            if (field705 == 10 && var1.method3299() > 0) {
                Statics.field239 = var1.method3300();
                field705 = 11;
            }
            if (field705 == 11 && var1.method3299() >= Statics.field239) {
                var1.method3302(var2.field3736, 0, Statics.field239);
                var2.field3734 = 0;
                field705 = 6;
            }
            if (field705 == 12 && var1.method3299() > 0) {
                field676 = (var1.method3300() + 3) * 60;
                field705 = 13;
            }
            if (field705 == 13) {
                field706 = 0;
                class95.method3662(class234.field2833, class234.field2834, field676 / 60 + class234.field2835);
                if (--field676 <= 0) {
                    field705 = 0;
                }
            } else {
                if (field705 == 14 && var1.method3299() >= 1) {
                    Statics.field255 = var1.method3300();
                    field705 = 15;
                }
                if (field705 == 15 && var1.method3299() >= Statics.field255) {
                    boolean var28 = var1.method3300() == 1;
                    var1.method3302(var2.field3736, 0, 4);
                    var2.field3734 = 0;
                    boolean var29 = false;
                    if (var28) {
                        int var30 = var2.method5166() << 24;
                        int var31 = var30 | var2.method5166() << 16;
                        int var32 = var31 | var2.method5166() << 8;
                        int var33 = var32 | var2.method5166();
                        int var34 = class301.method618(class95.field1222);
                        if (Statics.field2108.field1081.size() >= 10 && !Statics.field2108.field1081.containsKey(var34)) {
                            Iterator var35 = Statics.field2108.field1081.entrySet().iterator();
                            var35.next();
                            var35.remove();
                        }
                        Statics.field2108.field1081.put(var34, var33);
                    }
                    if (field711) {
                        Statics.field2108.field1083 = class95.field1222;
                    } else {
                        Statics.field2108.field1083 = null;
                    }
                    class83.method3709();
                    field843 = var1.method3300();
                    field795 = var1.method3300() == 1;
                    field791 = var1.method3300();
                    field791 <<= 0x8;
                    field791 += var1.method3300();
                    field792 = var1.method3300();
                    var1.method3302(var2.field3736, 0, 1);
                    var2.field3734 = 0;
                    class192[] var36 = class192.method4286();
                    int var37 = var2.method5168();
                    if (var37 < 0 || var37 >= var36.length) {
                        throw new IOException(var37 + " " + var2.field3734);
                    }
                    field721.field1346 = var36[var37];
                    field721.field1347 = field721.field1346.field2193;
                    var1.method3302(var2.field3736, 0, 2);
                    var2.field3734 = 0;
                    field721.field1347 = var2.method5283();
                    try {
                        client var38 = Statics.field170;
                        JSObject.getWindow(var38).call("zap", (Object[]) null);
                    } catch (Throwable var62) {
                    }
                    field705 = 16;
                }
                if (field705 != 16) {
                    if (field705 == 17 && var1.method3299() >= 2) {
                        var2.field3734 = 0;
                        var1.method3302(var2.field3736, 0, 2);
                        var2.field3734 = 0;
                        Statics.field135 = var2.method5283();
                        field705 = 18;
                    }
                    if (field705 == 18 && var1.method3299() >= Statics.field135) {
                        var2.field3734 = 0;
                        var1.method3302(var2.field3736, 0, Statics.field135);
                        var2.field3734 = 0;
                        String var52 = var2.method5236();
                        String var53 = var2.method5236();
                        String var54 = var2.method5236();
                        class95.method3662(var52, var53, var54);
                        method1727(10);
                    }
                    if (field705 == 19) {
                        if (field721.field1347 == -1) {
                            if (var1.method3299() < 2) {
                                return;
                            }
                            var1.method3302(var2.field3736, 0, 2);
                            var2.field3734 = 0;
                            field721.field1347 = var2.method5283();
                        }
                        if (var1.method3299() >= field721.field1347) {
                            var1.method3302(var2.field3736, 0, field721.field1347);
                            var2.field3734 = 0;
                            int var55 = field721.field1347;
                            field725.method4730();
                            field721.method2160();
                            field721.field1345.field3734 = 0;
                            field721.field1346 = null;
                            field721.field1351 = null;
                            field721.field1352 = null;
                            field721.field1343 = null;
                            field721.field1347 = 0;
                            field721.field1349 = 0;
                            field689 = 0;
                            field811 = 0;
                            field703 = false;
                            field751 = 0;
                            field904 = 0;
                            for (int var56 = 0; var56 < 2048; var56++) {
                                field790[var56] = null;
                            }
                            Statics.field455 = null;
                            for (int var57 = 0; var57 < field716.length; var57++) {
                                class89 var58 = field716[var57];
                                if (var58 != null) {
                                    var58.field991 = -1;
                                    var58.field1003 = false;
                                }
                            }
                            class69.field564 = new class328(32);
                            method1727(30);
                            for (int var59 = 0; var59 < 100; var59++) {
                                field814[var59] = true;
                            }
                            class197 var60 = class197.method3184(class193.field2280, field721.field1340);
                            var60.field2375.method5437(method765());
                            var60.field2375.method5387(Statics.field1299);
                            var60.field2375.method5387(Statics.field397);
                            field721.method2161(var60);
                            class99.method4350(var2);
                            if (var2.field3734 != var55) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field706++;
                        if (field706 > 2000) {
                            if (field707 < 1) {
                                if (Statics.field277 == Statics.field1181) {
                                    Statics.field277 = Statics.field915;
                                } else {
                                    Statics.field277 = Statics.field1181;
                                }
                                field707++;
                                field705 = 0;
                            } else {
                                method197(-3);
                            }
                        }
                    }
                } else if (var1.method3299() >= field721.field1347) {
                    var2.field3734 = 0;
                    var1.method3302(var2.field3736, 0, field721.field1347);
                    field725.method4742();
                    field683 = -1L;
                    Statics.field2550.field611 = 0;
                    Statics.field250 = true;
                    field687 = true;
                    field898 = -1L;
                    class106.method1957();
                    field721.method2160();
                    field721.field1345.field3734 = 0;
                    field721.field1346 = null;
                    field721.field1351 = null;
                    field721.field1352 = null;
                    field721.field1343 = null;
                    field721.field1347 = 0;
                    field721.field1349 = 0;
                    field689 = 0;
                    field722 = 0;
                    field690 = 0;
                    field811 = 0;
                    field703 = false;
                    class64.field502 = 0;
                    class101.method1712();
                    field827 = 0;
                    field829 = false;
                    field912 = 0;
                    field926 = 0;
                    field749 = 0;
                    Statics.field3586 = null;
                    field751 = 0;
                    field938 = -1;
                    field904 = 0;
                    field769 = 0;
                    field698 = class94.field1193;
                    field699 = class94.field1193;
                    field717 = 0;
                    class99.method1949();
                    for (int var40 = 0; var40 < 2048; var40++) {
                        field790[var40] = null;
                    }
                    for (int var41 = 0; var41 < 32768; var41++) {
                        field716[var41] = null;
                    }
                    field781 = -1;
                    field804.method4671();
                    field805.method4671();
                    for (int var42 = 0; var42 < 4; var42++) {
                        for (int var43 = 0; var43 < 104; var43++) {
                            for (int var44 = 0; var44 < 104; var44++) {
                                field802[var42][var43][var44] = null;
                            }
                        }
                    }
                    field803 = new class272();
                    Statics.field2418.method1733();
                    for (int var45 = 0; var45 < Statics.field3240; var45++) {
                        class251 var46 = class251.method3701(var45);
                        if (var46 != null) {
                            class222.field2561[var45] = 0;
                            class222.field2562[var45] = 0;
                        }
                    }
                    Statics.field1201.method2075();
                    field844 = -1;
                    if (field834 != -1) {
                        class227.method1032(field834);
                    }
                    for (class71 var47 = (class71) field835.method5644(); var47 != null; var47 = (class71) field835.method5642()) {
                        Statics.method543(var47, true);
                    }
                    field834 = -1;
                    field835 = new class328(8);
                    field840 = null;
                    field811 = 0;
                    field703 = false;
                    field931.method3763((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var48 = 0; var48 < 8; var48++) {
                        field764[var48] = null;
                        field799[var48] = false;
                    }
                    class69.field564 = new class328(32);
                    field681 = true;
                    for (int var49 = 0; var49 < 100; var49++) {
                        field814[var49] = true;
                    }
                    class197 var50 = class197.method3184(class193.field2280, field721.field1340);
                    var50.field2375.method5437(method765());
                    var50.field2375.method5387(Statics.field1299);
                    var50.field2375.method5387(Statics.field397);
                    field721.method2161(var50);
                    Statics.field1085 = null;
                    for (int var51 = 0; var51 < 8; var51++) {
                        field941[var51] = new class19();
                    }
                    Statics.field144 = null;
                    class99.method4350(var2);
                    Statics.field329 = -1;
                    method77(false, var2);
                    field721.field1346 = null;
                }
            }
        } catch (IOException var65) {
            if (field707 < 1) {
                if (Statics.field277 == Statics.field1181) {
                    Statics.field277 = Statics.field915;
                } else {
                    Statics.field277 = Statics.field1181;
                }
                field707++;
                field705 = 0;
            } else {
                method197(-2);
            }
        }
    }

    @ObfuscatedName("x.fe(IB)V")
    public static void method197(int arg0) {
        if (arg0 == -3) {
            class95.method3662(class234.field2836, class234.field2837, class234.field2838);
        } else if (arg0 == -2) {
            class95.method3662(class234.field2980, class234.field2840, class234.field2910);
        } else if (arg0 == -1) {
            class95.method3662(class234.field2842, class234.field2843, class234.field2941);
        } else if (arg0 == 3) {
            class95.field1215 = 3;
            class95.field1214 = 1;
        } else if (arg0 == 4) {
            class95.method4898(0);
        } else if (arg0 == 5) {
            class95.field1214 = 2;
            class95.method3662(class234.field2848, class234.field2849, class234.field2850);
        } else if (arg0 == 68 || !(field724 || arg0 != 6)) {
            class95.method3662(class234.field3006, class234.field2852, class234.field2853);
        } else if (arg0 == 7) {
            class95.method3662(class234.field2854, class234.field2855, class234.field3068);
        } else if (arg0 == 8) {
            class95.method3662(class234.field2868, class234.field2970, class234.field2859);
        } else if (arg0 == 9) {
            class95.method3662(class234.field3029, class234.field2861, class234.field2960);
        } else if (arg0 == 10) {
            class95.method3662(class234.field2863, class234.field2864, class234.field2865);
        } else if (arg0 == 11) {
            class95.method3662(class234.field2866, class234.field2867, class234.field2908);
        } else if (arg0 == 12) {
            class95.method3662(class234.field2839, class234.field2793, class234.field2969);
        } else if (arg0 == 13) {
            class95.method3662(class234.field2872, class234.field2873, class234.field2874);
        } else if (arg0 == 14) {
            class95.method3662(class234.field2875, class234.field2876, class234.field2984);
        } else if (arg0 == 16) {
            class95.method3662(class234.field3043, class234.field2879, class234.field3035);
        } else if (arg0 == 17) {
            class95.method3662(class234.field2881, class234.field2921, class234.field2883);
        } else if (arg0 == 18) {
            class95.method4898(1);
        } else if (arg0 == 19) {
            class95.method3662(class234.field2888, class234.field3010, class234.field2889);
        } else if (arg0 == 20) {
            class95.method3662(class234.field2890, class234.field3016, class234.field2828);
        } else if (arg0 == 22) {
            class95.method3662(class234.field2893, class234.field2894, class234.field2899);
        } else if (arg0 == 23) {
            class95.method3662(class234.field2896, class234.field2911, class234.field2898);
        } else if (arg0 == 24) {
            class95.method3662(class234.field3008, class234.field2900, class234.field3038);
        } else if (arg0 == 25) {
            class95.method3662(class234.field2902, class234.field2816, class234.field2904);
        } else if (arg0 == 26) {
            class95.method3662(class234.field2905, class234.field2906, class234.field2907);
        } else if (arg0 == 27) {
            class95.method3662(class234.field2912, class234.field2909, class234.field2877);
        } else if (arg0 == 31) {
            class95.method3662(class234.field2917, class234.field2869, class234.field2919);
        } else if (arg0 == 32) {
            class95.method3662(class234.field2920, class234.field2952, class234.field2922);
        } else if (arg0 == 37) {
            class95.method3662(class234.field2923, class234.field2924, class234.field2925);
        } else if (arg0 == 38) {
            class95.method3662(class234.field2926, class234.field2927, class234.field2928);
        } else if (arg0 == 55) {
            class95.field1215 = 8;
        } else if (arg0 == 56) {
            class95.method3662(class234.field2933, class234.field2934, class234.field2935);
            method1727(11);
            return;
        } else if (arg0 == 57) {
            class95.method3662(class234.field2936, class234.field3070, class234.field2938);
            method1727(11);
            return;
        } else if (arg0 == 61) {
            class95.field1215 = 7;
        } else {
            class95.method3662(class234.field2939, class234.field2940, class234.field2841);
        }
        method1727(10);
    }

    @ObfuscatedName("bx.fi(I)V")
    public static final void method1085() {
        field721.method2163();
        class268.field3533.method3130();
        class255.field3288.method3130();
        class256.method3091();
        class264.field3383.method3130();
        class264.field3407.method3130();
        class264.field3387.method3130();
        class264.field3380.method3130();
        class267.field3530.method3130();
        class267.field3511.method3130();
        class265.field3437.method3130();
        class265.field3438.method3130();
        class265.field3435.method3130();
        class269.method1969();
        class254.method804();
        class259.method4193();
        class251.method1934();
        class263.field3359.method3130();
        class263.field3360.method3130();
        class263.field3361.method3130();
        class257.method306();
        class261.field3344.method3130();
        class260.field3340.method3130();
        class252.field3258.method3130();
        class224.method1813();
        class227.method1814();
        ((class129) Statics.field1804).method2591();
        class102.field1321.method3130();
        Statics.field2046.method3907();
        Statics.field616.method3907();
        Statics.field1357.method3907();
        Statics.field82.method3907();
        Statics.field200.method3907();
        Statics.field2005.method3907();
        Statics.field1262.method3907();
        Statics.field77.method3907();
        Statics.field1683.method3907();
        Statics.field1137.method3907();
        Statics.field117.method3907();
        Statics.field626.method3907();
        Statics.field2011.method2906();
        for (int var0 = 0; var0 < 4; var0++) {
            field732[var0].method3345();
        }
        System.gc();
        class207.field2440 = 1;
        Statics.field2544 = null;
        Statics.field2437 = -1;
        Statics.field2040 = -1;
        Statics.field2442 = 0;
        Statics.field3914 = false;
        Statics.field2443 = 2;
        field682 = -1;
        field744 = false;
        for (class85 var1 = (class85) class85.field1107.method4651(); var1 != null; var1 = (class85) class85.field1107.method4656()) {
            if (var1.field1110 != null) {
                Statics.field450.method2194(var1.field1110);
                var1.field1110 = null;
            }
            if (var1.field1113 != null) {
                Statics.field450.method2194(var1.field1113);
                var1.field1113 = null;
            }
        }
        class85.field1107.method4671();
        method1727(10);
    }

    @ObfuscatedName("gw.fr(II)V")
    public static final void method3584(int arg0) {
        method1085();
        switch(arg0) {
            case 1:
                class95.field1215 = 24;
                class95.method3662(class234.field3030, class234.field3067, class234.field2803);
                break;
            case 2:
                class95.method184();
        }
    }

    @ObfuscatedName("fz.fd(I)V")
    public static final void method3362() {
        if (field722 > 0) {
            method1085();
        } else {
            field725.method4725();
            method1727(40);
            Statics.field36 = field721.method2165();
            field721.method2164();
        }
    }

    @ObfuscatedName("jm.fc(ZI)V")
    public static final void method4537(boolean arg0) {
        if (arg0) {
            field709 = class95.field1224 ? class170.field2024 : class170.field2026;
        } else {
            field709 = Statics.field2108.field1081.containsKey(class301.method618(class95.field1222)) ? class170.field2029 : class170.field2025;
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1193() {
        if (field689 > 1) {
            field689--;
        }
        if (field722 > 0) {
            field722--;
        }
        if (field723) {
            field723 = false;
            method3362();
            return;
        }
        if (!field703) {
            method5039();
        }
        for (int var1 = 0; var1 < 100 && this.method1578(field721); var1++) {
        }
        if (field714 != 30) {
            return;
        }
        while (class106.method3588()) {
            class197 var2 = class197.method3184(class193.field2287, field721.field1340);
            var2.field2375.method5437(0);
            int var3 = var2.field2375.field3734;
            class106.method4913(var2.field2375);
            var2.field2375.method5224(var2.field2375.field3734 - var3);
            field721.method2161(var2);
        }
        if (field725.field3619) {
            class197 var4 = class197.method3184(class193.field2311, field721.field1340);
            var4.field2375.method5437(0);
            int var5 = var4.field2375.field3734;
            field725.method4727(var4.field2375);
            var4.field2375.method5224(var4.field2375.field3734 - var5);
            field721.method2161(var4);
            field725.method4729();
        }
        Object var6 = Statics.field2550.field610;
        synchronized (Statics.field2550.field610) {
            if (!field670) {
                Statics.field2550.field611 = 0;
            } else if (class64.field515 != 0 || Statics.field2550.field611 >= 40) {
                class197 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2550.field611 && (var7 == null || var7.field2375.field3734 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2550.field613[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2550.field609[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field684 != var14 || field685 != var13) {
                        if (var7 == null) {
                            var7 = class197.method3184(class193.field2254, field721.field1340);
                            var7.field2375.method5437(0);
                            var8 = var7.field2375.field3734;
                            var7.field2375.field3734 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field739 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field684;
                            var16 = var13 - field685;
                            var17 = (int) ((Statics.field2550.field615[var12] - field739) / 20L);
                            var10 = (int) ((Statics.field2550.field615[var12] - field739) % 20L + (long) var10);
                        }
                        field684 = var14;
                        field685 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2375.method5387((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2375.method5437(var17 + 128);
                            var7.field2375.method5387((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2375.method5437(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2375.method5213(Integer.MIN_VALUE);
                            } else {
                                var7.field2375.method5213(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2375.method5387((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2375.method5213(Integer.MIN_VALUE);
                            } else {
                                var7.field2375.method5213(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field739 = Statics.field2550.field615[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2375.method5224(var7.field2375.field3734 - var8);
                    int var18 = var7.field2375.field3734;
                    var7.field2375.field3734 = var8;
                    var7.field2375.method5437(var10 / var11);
                    var7.field2375.method5437(var10 % var11);
                    var7.field2375.field3734 = var18;
                    field721.method2161(var7);
                }
                if (var9 >= Statics.field2550.field611) {
                    Statics.field2550.field611 = 0;
                } else {
                    Statics.field2550.field611 -= var9;
                    System.arraycopy(Statics.field2550.field609, var9, Statics.field2550.field609, 0, Statics.field2550.field611);
                    System.arraycopy(Statics.field2550.field613, var9, Statics.field2550.field613, 0, Statics.field2550.field611);
                    System.arraycopy(Statics.field2550.field615, var9, Statics.field2550.field615, 0, Statics.field2550.field611);
                }
            }
        }
        if (class64.field515 == 1 || !Statics.field556 && class64.field515 == 4 || class64.field515 == 2) {
            long var20 = class64.field518 - field683;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field683 = class64.field518;
            int var22 = class64.field504;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field397) {
                var22 = Statics.field397;
            }
            int var23 = class64.field505;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1299) {
                var23 = Statics.field1299;
            }
            int var24 = (int) var20;
            class197 var25 = class197.method3184(class193.field2245, field721.field1340);
            var25.field2375.method5387((var24 << 1) + (class64.field515 == 2 ? 1 : 0));
            var25.field2375.method5387(var23);
            var25.field2375.method5387(var22);
            field721.method2161(var25);
        }
        if (class55.field426 > 0) {
            class197 var26 = class197.method3184(class193.field2331, field721.field1340);
            var26.field2375.method5387(0);
            int var27 = var26.field2375.field3734;
            long var28 = class307.method3253();
            for (int var30 = 0; var30 < class55.field426; var30++) {
                long var31 = var28 - field898;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field898 = var28;
                var26.field2375.method5253(class55.field430[var30]);
                var26.field2375.method5308((int) var31);
            }
            var26.field2375.method5447(var26.field2375.field3734 - var27);
            field721.method2161(var26);
        }
        if (field758 > 0) {
            field758--;
        }
        if (class55.field409[96] || class55.field409[97] || class55.field409[98] || class55.field409[99]) {
            field759 = true;
        }
        if (field759 && field758 <= 0) {
            field758 = 20;
            field759 = false;
            class197 var33 = class197.method3184(class193.field2259, field721.field1340);
            var33.field2375.method5387(field926);
            var33.field2375.method5387(field743);
            field721.method2161(var33);
        }
        if (Statics.field250 && !field687) {
            field687 = true;
            class197 var34 = class197.method3184(class193.field2291, field721.field1340);
            var34.field2375.method5437(1);
            field721.method2161(var34);
        }
        if (!Statics.field250 && field687) {
            field687 = false;
            class197 var35 = class197.method3184(class193.field2291, field721.field1340);
            var35.field2375.method5437(0);
            field721.method2161(var35);
        }
        if (Statics.field2754 != null) {
            Statics.field2754.method6143();
        }
        if (Statics.field21) {
            if (Statics.field1085 != null) {
                Statics.field1085.method4828();
            }
            method69();
            Statics.field21 = false;
        }
        method3292();
        if (field714 != 30) {
            return;
        }
        method3100();
        int var10002;
        for (int var36 = 0; var36 < field912; var36++) {
            var10002 = field877[var36]--;
            if (field877[var36] >= -10) {
                class111 var38 = field917[var36];
                if (var38 == null) {
                    class111 var10000 = (class111) null;
                    var38 = class111.method2253(Statics.field82, field913[var36], 0);
                    if (var38 == null) {
                        continue;
                    }
                    field877[var36] += var38.method2250();
                    field917[var36] = var38;
                }
                if (field877[var36] < 0) {
                    int var45;
                    if (field916[var36] == 0) {
                        var45 = field910;
                    } else {
                        int var39 = (field916[var36] & 0xFF) * 128;
                        int var40 = field916[var36] >> 16 & 0xFF;
                        int var41 = var40 * 128 + 64 - Statics.field455.field983;
                        if (var41 < 0) {
                            var41 = -var41;
                        }
                        int var42 = field916[var36] >> 8 & 0xFF;
                        int var43 = var42 * 128 + 64 - Statics.field455.field965;
                        if (var43 < 0) {
                            var43 = -var43;
                        }
                        int var44 = var41 + var43 - 128;
                        if (var44 > var39) {
                            field877[var36] = -100;
                            continue;
                        }
                        if (var44 < 0) {
                            var44 = 0;
                        }
                        var45 = field911 * (var39 - var44) / var39;
                    }
                    if (var45 > 0) {
                        class113 var46 = var38.method2248().method2296(Statics.field2382);
                        class123 var47 = class123.method2419(var46, 100, var45);
                        var47.method2422(field777[var36] - 1);
                        Statics.field450.method2193(var47);
                    }
                    field877[var36] = -100;
                }
            } else {
                field912--;
                for (int var37 = var36; var37 < field912; var37++) {
                    field913[var37] = field913[var37 + 1];
                    field917[var37] = field917[var37 + 1];
                    field777[var37] = field777[var37 + 1];
                    field877[var37] = field877[var37 + 1];
                    field916[var37] = field916[var37 + 1];
                }
                var36--;
            }
        }
        if (field744 && !class207.method222()) {
            if (field907 != 0 && field682 != -1) {
                class207.method3192(Statics.field2005, field682, 0, field907, false);
            }
            field744 = false;
        }
        field721.field1349++;
        if (field721.field1349 > 750) {
            method3362();
            return;
        }
        method2038();
        method4070();
        method20();
        field748++;
        if (field778 != 0) {
            field678 += 20;
            if (field678 >= 400) {
                field778 = 0;
            }
        }
        if (Statics.field2357 != null) {
            field809++;
            if (field809 >= 15) {
                method3872(Statics.field2357);
                Statics.field2357 = null;
            }
        }
        class227 var48 = Statics.field315;
        class227 var49 = Statics.field543;
        Statics.field315 = null;
        Statics.field543 = null;
        field851 = null;
        field855 = false;
        field693 = false;
        field895 = 0;
        while (class55.method610() && field895 < 128) {
            if (field843 >= 2 && class55.field409[82] && Statics.field547 == 66) {
                String var50 = "";
                Iterator var51 = class101.field1302.iterator();
                while (var51.hasNext()) {
                    class74 var52 = (class74) var51.next();
                    var50 = var50 + var52.field619 + ':' + var52.field622 + '\n';
                }
                Statics.field170.method957(var50);
            } else if (field749 != 1 || Statics.field443 <= 0) {
                field897[field895] = Statics.field547;
                field921[field895] = Statics.field443;
                field895++;
            }
        }
        boolean var55 = field843 >= 2;
        if (var55 && class55.field409[82] && class55.field409[81] && field833 != 0) {
            int var56 = Statics.field455.field656 - field833;
            if (var56 < 0) {
                var56 = 0;
            } else if (var56 > 3) {
                var56 = 3;
            }
            if (Statics.field455.field656 != var56) {
                method162(Statics.field2130 + Statics.field455.field1020[0], Statics.field1275 + Statics.field455.field1021[0], var56, false);
            }
            field833 = 0;
        }
        if (field834 != -1) {
            method3589(field834, 0, 0, Statics.field1299, Statics.field397, 0, 0);
        }
        field859++;
        while (true) {
            class72 var57;
            class227 var58;
            class227 var59;
            do {
                var57 = (class72) field892.method4653();
                if (var57 == null) {
                    while (true) {
                        class72 var60;
                        class227 var61;
                        class227 var62;
                        do {
                            var60 = (class72) field692.method4653();
                            if (var60 == null) {
                                while (true) {
                                    class72 var63;
                                    class227 var64;
                                    class227 var65;
                                    do {
                                        var63 = (class72) field873.method4653();
                                        if (var63 == null) {
                                            this.method1197();
                                            if (Statics.field2754 != null) {
                                                Statics.field2754.method5979(Statics.field1576, (Statics.field455.field983 >> 7) + Statics.field2130, (Statics.field455.field965 >> 7) + Statics.field1275, false);
                                                Statics.field2754.method6092();
                                            }
                                            if (field847 != null) {
                                                this.method1202();
                                            }
                                            if (Statics.field403 != null) {
                                                method3872(Statics.field403);
                                                field787++;
                                                if (class64.field507 == 0) {
                                                    if (field786) {
                                                        if (Statics.field403 == Statics.field2067 && field785 != field782) {
                                                            class227 var66 = Statics.field403;
                                                            byte var67 = 0;
                                                            if (field839 == 1 && var66.field2607 == 206) {
                                                                var67 = 1;
                                                            }
                                                            if (var66.field2707[field785] <= 0) {
                                                                var67 = 0;
                                                            }
                                                            if (class228.method2032(method728(var66))) {
                                                                int var68 = field782;
                                                                int var69 = field785;
                                                                var66.field2707[var69] = var66.field2707[var68];
                                                                var66.field2728[var69] = var66.field2728[var68];
                                                                var66.field2707[var68] = -1;
                                                                var66.field2728[var68] = 0;
                                                            } else if (var67 == 1) {
                                                                int var70 = field782;
                                                                int var71 = field785;
                                                                while (var70 != var71) {
                                                                    if (var70 > var71) {
                                                                        var66.method3786(var70 - 1, var70);
                                                                        var70--;
                                                                    } else if (var70 < var71) {
                                                                        var66.method3786(var70 + 1, var70);
                                                                        var70++;
                                                                    }
                                                                }
                                                            } else {
                                                                var66.method3786(field785, field782);
                                                            }
                                                            class197 var72 = class197.method3184(class193.field2257, field721.field1340);
                                                            var72.field2375.method5347(var67);
                                                            var72.field2375.method5213(Statics.field403.field2617);
                                                            var72.field2375.method5408(field785);
                                                            var72.field2375.method5408(field782);
                                                            field721.method2161(var72);
                                                        }
                                                    } else if (this.method1216()) {
                                                        this.method1540(field783, field784);
                                                    } else if (field811 > 0) {
                                                        method160(field783, field784);
                                                    }
                                                    field809 = 10;
                                                    class64.field515 = 0;
                                                    Statics.field403 = null;
                                                } else if (field787 >= 5 && (class64.field508 > field783 + 5 || class64.field508 < field783 - 5 || class64.field498 > field784 + 5 || class64.field498 < field784 - 5)) {
                                                    field786 = true;
                                                }
                                            }
                                            if (class143.method2944()) {
                                                int var73 = class143.field1878;
                                                int var74 = class143.field1865;
                                                class197 var75 = class197.method3184(class193.field2312, field721.field1340);
                                                var75.field2375.method5437(5);
                                                var75.field2375.method5387(Statics.field1275 + var74);
                                                var75.field2375.method5387(Statics.field2130 + var73);
                                                var75.field2375.method5254(class55.field409[82] ? (class55.field409[81] ? 2 : 1) : 0);
                                                field721.method2161(var75);
                                                class143.method3060();
                                                field845 = class64.field505;
                                                field694 = class64.field504;
                                                field778 = 1;
                                                field678 = 0;
                                                field904 = var73;
                                                field769 = var74;
                                            }
                                            if (Statics.field315 != var48) {
                                                if (var48 != null) {
                                                    method3872(var48);
                                                }
                                                if (Statics.field315 != null) {
                                                    method3872(Statics.field315);
                                                }
                                            }
                                            if (Statics.field543 != var49 && field826 == field825) {
                                                if (var49 != null) {
                                                    method3872(var49);
                                                }
                                                if (Statics.field543 != null) {
                                                    method3872(Statics.field543);
                                                }
                                            }
                                            if (Statics.field543 == null) {
                                                if (field825 > 0) {
                                                    field825--;
                                                }
                                            } else if (field825 < field826) {
                                                field825++;
                                                if (field826 == field825) {
                                                    method3872(Statics.field543);
                                                }
                                            }
                                            if (field749 == 0) {
                                                int var76 = Statics.field455.field983;
                                                int var77 = Statics.field455.field965;
                                                if (Statics.field2589 - var76 < -500 || Statics.field2589 - var76 > 500 || Statics.field3315 - var77 < -500 || Statics.field3315 - var77 > 500) {
                                                    Statics.field2589 = var76;
                                                    Statics.field3315 = var77;
                                                }
                                                if (Statics.field2589 != var76) {
                                                    Statics.field2589 += (var76 - Statics.field2589) / 16;
                                                }
                                                if (Statics.field3315 != var77) {
                                                    Statics.field3315 += (var77 - Statics.field3315) / 16;
                                                }
                                                int var78 = Statics.field2589 >> 7;
                                                int var79 = Statics.field3315 >> 7;
                                                int var80 = method3439(Statics.field2589, Statics.field3315, Statics.field1576);
                                                int var81 = 0;
                                                if (var78 > 3 && var79 > 3 && var78 < 100 && var79 < 100) {
                                                    for (int var82 = var78 - 4; var82 <= var78 + 4; var82++) {
                                                        for (int var83 = var79 - 4; var83 <= var79 + 4; var83++) {
                                                            int var84 = Statics.field1576;
                                                            if (var84 < 3 && (class65.field522[1][var82][var83] & 0x2) == 2) {
                                                                var84++;
                                                            }
                                                            int var85 = var80 - class65.field533[var84][var82][var83];
                                                            if (var85 > var81) {
                                                                var81 = var85;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var86 = var81 * 192;
                                                if (var86 > 98048) {
                                                    var86 = 98048;
                                                }
                                                if (var86 < 32768) {
                                                    var86 = 32768;
                                                }
                                                if (var86 > field882) {
                                                    field882 += (var86 - field882) / 24;
                                                } else if (var86 < field882) {
                                                    field882 += (var86 - field882) / 80;
                                                }
                                                Statics.field235 = method3439(Statics.field455.field983, Statics.field455.field965, Statics.field1576) - field750;
                                            } else if (field749 == 1) {
                                                method3329();
                                                short var87 = -1;
                                                if (class55.field409[33]) {
                                                    var87 = 0;
                                                } else if (class55.field409[49]) {
                                                    var87 = 1024;
                                                }
                                                if (class55.field409[48]) {
                                                    if (var87 == 0) {
                                                        var87 = 1792;
                                                    } else if (var87 == 1024) {
                                                        var87 = 1280;
                                                    } else {
                                                        var87 = 1536;
                                                    }
                                                } else if (class55.field409[50]) {
                                                    if (var87 == 0) {
                                                        var87 = 256;
                                                    } else if (var87 == 1024) {
                                                        var87 = 768;
                                                    } else {
                                                        var87 = 512;
                                                    }
                                                }
                                                byte var88 = 0;
                                                if (class55.field409[35]) {
                                                    var88 = -1;
                                                } else if (class55.field409[51]) {
                                                    var88 = 1;
                                                }
                                                int var89 = 0;
                                                if (var87 >= 0 || var88 != 0) {
                                                    int var90 = class55.field409[81] ? field755 : field754;
                                                    var89 = var90 * 16;
                                                    field752 = var87;
                                                    field753 = var88;
                                                }
                                                if (field718 < var89) {
                                                    field718 += var89 / 8;
                                                    if (field718 > var89) {
                                                        field718 = var89;
                                                    }
                                                } else if (field718 > var89) {
                                                    field718 = field718 * 9 / 10;
                                                }
                                                if (field718 > 0) {
                                                    int var91 = field718 / 16;
                                                    if (field752 >= 0) {
                                                        int var92 = field752 - Statics.field439 & 0x7FF;
                                                        int var93 = class140.field1812[var92];
                                                        int var94 = class140.field1813[var92];
                                                        Statics.field2589 += var91 * var93 / 65536;
                                                        Statics.field3315 += var91 * var94 / 65536;
                                                    }
                                                    if (field753 != 0) {
                                                        Statics.field235 += field753 * var91;
                                                        if (Statics.field235 > 0) {
                                                            Statics.field235 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field752 = -1;
                                                    field753 = -1;
                                                }
                                                if (class55.field409[13]) {
                                                    method177();
                                                }
                                            }
                                            if (class64.field507 == 4 && Statics.field556) {
                                                int var95 = class64.field498 - field947;
                                                field746 = var95 * 2;
                                                field947 = var95 == -1 || var95 == 1 ? class64.field498 : (field947 + class64.field498) / 2;
                                                int var96 = field697 - class64.field508;
                                                field745 = var96 * 2;
                                                field697 = var96 == -1 || var96 == 1 ? class64.field508 : (field697 + class64.field508) / 2;
                                            } else {
                                                if (class55.field409[96]) {
                                                    field745 += (-24 - field745) / 2;
                                                } else if (class55.field409[97]) {
                                                    field745 += (24 - field745) / 2;
                                                } else {
                                                    field745 /= 2;
                                                }
                                                if (class55.field409[98]) {
                                                    field746 += (12 - field746) / 2;
                                                } else if (class55.field409[99]) {
                                                    field746 += (-12 - field746) / 2;
                                                } else {
                                                    field746 /= 2;
                                                }
                                                field947 = class64.field498;
                                                field697 = class64.field508;
                                            }
                                            field926 = field745 / 2 + field926 & 0x7FF;
                                            field743 += field746 / 2;
                                            if (field743 < 128) {
                                                field743 = 128;
                                            }
                                            if (field743 > 383) {
                                                field743 = 383;
                                            }
                                            if (field918) {
                                                method411();
                                            }
                                            for (int var97 = 0; var97 < 5; var97++) {
                                                var10002 = field923[var97]++;
                                            }
                                            Statics.field1201.method2102();
                                            int var98 = Statics.method3863();
                                            int var99 = class55.field420;
                                            if (var98 > 15000 && var99 > 15000) {
                                                field722 = 250;
                                                class64.field502 = 14500;
                                                class197 var101 = class197.method3184(class193.field2244, field721.field1340);
                                                field721.method2161(var101);
                                            }
                                            Statics.field2418.method1732();
                                            field721.field1350++;
                                            if (field721.field1350 > 50) {
                                                class197 var102 = class197.method3184(class193.field2286, field721.field1340);
                                                field721.method2161(var102);
                                            }
                                            try {
                                                field721.method2159();
                                            } catch (IOException var104) {
                                                method3362();
                                            }
                                            return;
                                        }
                                        var64 = var63.field593;
                                        if (var64.field2691 < 0) {
                                            break;
                                        }
                                        var65 = class227.method403(var64.field2622);
                                    } while (var65 == null || var65.field2733 == null || var64.field2691 >= var65.field2733.length || var65.field2733[var64.field2691] != var64);
                                    class86.method1066(var63);
                                }
                            }
                            var61 = var60.field593;
                            if (var61.field2691 < 0) {
                                break;
                            }
                            var62 = class227.method403(var61.field2622);
                        } while (var62 == null || var62.field2733 == null || var61.field2691 >= var62.field2733.length || var62.field2733[var61.field2691] != var61);
                        class86.method1066(var60);
                    }
                }
                var58 = var57.field593;
                if (var58.field2691 < 0) {
                    break;
                }
                var59 = class227.method403(var58.field2622);
            } while (var59 == null || var59.field2733 == null || var58.field2691 >= var59.field2733.length || var59.field2733[var58.field2691] != var58);
            class86.method1066(var57);
        }
    }

    @ObfuscatedName("jy.fp(I)V")
    public static final void method4752() {
        if (Statics.field445 != null) {
            Statics.field445.method2358();
        }
        if (Statics.field4 != null) {
            Statics.field4.method2358();
        }
    }

    @ObfuscatedName("bj.fq(Ljm;IIII)V")
    public static void method1179(class269 arg0, int arg1, int arg2, int arg3) {
        if (field912 >= 50 || field911 == 0 || arg0.field3555 == null || arg1 >= arg0.field3555.length) {
            return;
        }
        int var4 = arg0.field3555[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field913[field912] = var5;
        field777[field912] = var6;
        field877[field912] = 0;
        field917[field912] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field916[field912] = (var8 << 16) + (var9 << 8) + var7;
        field912++;
    }

    @ObfuscatedName("af.fk(IIII)V")
    public static void method569(int arg0, int arg1, int arg2) {
        if (field910 == 0 || arg1 == 0 || field912 >= 50) {
            return;
        }
        field913[field912] = arg0;
        field777[field912] = arg1;
        field877[field912] = arg2;
        field917[field912] = null;
        field916[field912] = 0;
        field912++;
    }

    @ObfuscatedName("ft.fx(IB)V")
    public static void method3193(int arg0) {
        if (arg0 == -1 && !field744) {
            class207.method1954();
        } else if (arg0 != -1 && field682 != arg0 && field907 != 0 && !field744) {
            class207.method1963(2, Statics.field2005, arg0, 0, field907, false);
        }
        field682 = arg0;
    }

    @ObfuscatedName("bx.fy(IIB)V")
    public static void method1081(int arg0, int arg1) {
        if (field907 != 0 && arg0 != -1) {
            class207.method3192(Statics.field117, arg0, 0, field907, false);
            field744 = true;
        }
    }

    @ObfuscatedName("fj.fn(I)V")
    public static final void method3292() {
        if (Statics.field1576 == field938) {
            return;
        }
        field938 = Statics.field1576;
        int var0 = Statics.field1576;
        int[] var1 = Statics.field12.field3896;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class65.field522[var0][var6][var4] & 0x18) == 0) {
                    Statics.field2011.method3078(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class65.field522[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2011.method3078(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field12.method5792();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class65.field522[var0][var10][var9] & 0x18) == 0) {
                    method5156(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class65.field522[var0 + 1][var10][var9] & 0x8) != 0) {
                    method5156(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field900 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field2011.method2931(Statics.field1576, var11, var12);
                if (var13 != 0L) {
                    int var15 = class138.method3443(var13);
                    int var16 = class264.method752(var15).field3394;
                    if (var16 >= 0) {
                        field702[field900] = class252.method1412(var16).method4132(false);
                        field891[field900] = var11;
                        field902[field900] = var12;
                        field900++;
                    }
                }
            }
        }
        Statics.field554.method5760();
    }

    @ObfuscatedName("o.fo(Lhd;III)V")
    public static final void method13(class227 arg0, int arg1, int arg2) {
        if (field751 != 0 && field751 != 3 || field703 || !(class64.field515 == 1 || !Statics.field556 && class64.field515 == 4)) {
            return;
        }
        class221 var3 = arg0.method3810(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field505 - arg1;
        int var5 = class64.field504 - arg2;
        if (!var3.method3704(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2557 / 2;
        int var7 = var5 - var3.field2555 / 2;
        int var8 = field926 & 0x7FF;
        int var9 = class140.field1812[var8];
        int var10 = class140.field1813[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field455.field983 + var11 >> 7;
        int var14 = Statics.field455.field965 - var12 >> 7;
        class197 var15 = class197.method3184(class193.field2290, field721.field1340);
        var15.field2375.method5437(18);
        var15.field2375.method5387(Statics.field1275 + var14);
        var15.field2375.method5387(Statics.field2130 + var13);
        var15.field2375.method5254(class55.field409[82] ? (class55.field409[81] ? 2 : 1) : 0);
        var15.field2375.method5437(var6);
        var15.field2375.method5437(var7);
        var15.field2375.method5387(field926);
        var15.field2375.method5437(57);
        var15.field2375.method5437(0);
        var15.field2375.method5437(0);
        var15.field2375.method5437(89);
        var15.field2375.method5387(Statics.field455.field983);
        var15.field2375.method5387(Statics.field455.field965);
        var15.field2375.method5437(63);
        field721.method2161(var15);
        field904 = var13;
        field769 = var14;
    }

    @ObfuscatedName("j.fg(I)V")
    public static final void method20() {
        int[] var0 = class99.field1282;
        for (int var1 = 0; var1 < class99.field1281; var1++) {
            class76 var2 = field790[var0[var1]];
            if (var2 != null && var2.field981 > 0) {
                var2.field981--;
                if (var2.field981 == 0) {
                    var2.field972 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field717; var3++) {
            int var4 = field875[var3];
            class89 var5 = field716[var4];
            if (var5 != null && var5.field981 > 0) {
                var5.field981--;
                if (var5.field981 == 0) {
                    var5.field972 = null;
                }
            }
        }
    }

    @ObfuscatedName("ep.fu(Ljava/lang/String;I)V")
    public static final void method3104(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2108.field1080 = !Statics.field2108.field1080;
            class83.method3709();
            if (Statics.field2108.field1080) {
                class101.method1815(99, "", "Roofs are now all hidden");
            } else {
                class101.method1815(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field841 = !field841;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field793 = !field793;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field932 = !field932;
        }
        if (field843 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field2754.field4023 = !Statics.field2754.field4023;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field841 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field841 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3362();
            }
        }
        class197 var1 = class197.method3184(class193.field2269, field721.field1340);
        var1.field2375.method5437(arg0.length() + 1);
        var1.field2375.method5217(arg0);
        field721.method2161(var1);
    }

    @ObfuscatedName("ar.ff(I)V")
    public static final void method411() {
        int var0 = Statics.field2421 * 128 + 64;
        int var1 = Statics.field349 * 128 + 64;
        int var2 = method3439(var0, var1, Statics.field1576) - Statics.field276;
        if (Statics.field513 < var0) {
            Statics.field513 += Statics.field605 * (var0 - Statics.field513) / 1000 + Statics.field123;
            if (Statics.field513 > var0) {
                Statics.field513 = var0;
            }
        }
        if (Statics.field513 > var0) {
            Statics.field513 -= Statics.field605 * (Statics.field513 - var0) / 1000 + Statics.field123;
            if (Statics.field513 < var0) {
                Statics.field513 = var0;
            }
        }
        if (Statics.field390 < var2) {
            Statics.field390 += Statics.field605 * (var2 - Statics.field390) / 1000 + Statics.field123;
            if (Statics.field390 > var2) {
                Statics.field390 = var2;
            }
        }
        if (Statics.field390 > var2) {
            Statics.field390 -= Statics.field605 * (Statics.field390 - var2) / 1000 + Statics.field123;
            if (Statics.field390 < var2) {
                Statics.field390 = var2;
            }
        }
        if (Statics.field1118 < var1) {
            Statics.field1118 += Statics.field605 * (var1 - Statics.field1118) / 1000 + Statics.field123;
            if (Statics.field1118 > var1) {
                Statics.field1118 = var1;
            }
        }
        if (Statics.field1118 > var1) {
            Statics.field1118 -= Statics.field605 * (Statics.field1118 - var1) / 1000 + Statics.field123;
            if (Statics.field1118 < var1) {
                Statics.field1118 = var1;
            }
        }
        int var3 = Statics.field436 * 128 + 64;
        int var4 = Statics.field43 * 128 + 64;
        int var5 = method3439(var3, var4, Statics.field1576) - Statics.field2447;
        int var6 = var3 - Statics.field513;
        int var7 = var5 - Statics.field390;
        int var8 = var4 - Statics.field1118;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1819 < var10) {
            Statics.field1819 += Statics.field330 * (var10 - Statics.field1819) / 1000 + Statics.field3868;
            if (Statics.field1819 > var10) {
                Statics.field1819 = var10;
            }
        }
        if (Statics.field1819 > var10) {
            Statics.field1819 -= Statics.field330 * (Statics.field1819 - var10) / 1000 + Statics.field3868;
            if (Statics.field1819 < var10) {
                Statics.field1819 = var10;
            }
        }
        int var12 = var11 - Statics.field439;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field439 += Statics.field330 * var12 / 1000 + Statics.field3868;
            Statics.field439 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field439 -= Statics.field330 * -var12 / 1000 + Statics.field3868;
            Statics.field439 &= 0x7FF;
        }
        int var13 = var11 - Statics.field439;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field439 = var11;
        }
    }

    @ObfuscatedName("cf.fs(I)V")
    public static final void method2038() {
        int var0 = class99.field1281;
        int[] var1 = class99.field1282;
        for (int var2 = 0; var2 < var0; var2++) {
            class76 var3 = field790[var1[var2]];
            if (var3 != null) {
                method3264(var3, 1);
            }
        }
    }

    @ObfuscatedName("ix.fw(I)V")
    public static final void method4070() {
        for (int var0 = 0; var0 < field717; var0++) {
            int var1 = field875[var0];
            class89 var2 = field716[var1];
            if (var2 != null) {
                method3264(var2, var2.field1158.field3500);
            }
        }
    }

    @ObfuscatedName("fm.fa(Lcc;IB)V")
    public static final void method3264(class79 arg0, int arg1) {
        if (arg0.field967 >= field671) {
            int var2 = Math.max(1, arg0.field967 - field671);
            int var3 = arg0.field996 * 128 + arg0.field968 * 64;
            int var4 = arg0.field968 * 64 + arg0.field1009 * 128;
            arg0.field983 += (var3 - arg0.field983) / var2;
            arg0.field965 += (var4 - arg0.field965) / var2;
            arg0.field1023 = 0;
            arg0.field1016 = arg0.field1007;
        } else if (arg0.field1012 >= field671) {
            if (field671 == arg0.field1012 || arg0.field992 == -1 || arg0.field1000 != 0 || arg0.field999 + 1 > class269.method3330(arg0.field992).field3551[arg0.field998]) {
                int var5 = arg0.field1012 - arg0.field967;
                int var6 = field671 - arg0.field967;
                int var7 = arg0.field996 * 128 + arg0.field968 * 64;
                int var8 = arg0.field968 * 64 + arg0.field1009 * 128;
                int var9 = arg0.field968 * 64 + arg0.field1008 * 128;
                int var10 = arg0.field968 * 64 + arg0.field1010 * 128;
                arg0.field983 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field965 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1023 = 0;
            arg0.field1016 = arg0.field1007;
            arg0.field966 = arg0.field1016;
        } else {
            arg0.field1019 = arg0.field970;
            if (arg0.field976 == 0) {
                arg0.field1023 = 0;
            } else {
                label430: {
                    if (arg0.field992 != -1 && arg0.field1000 == 0) {
                        class269 var11 = class269.method3330(arg0.field992);
                        if (arg0.field1024 > 0 && var11.field3560 == 0) {
                            arg0.field1023++;
                            break label430;
                        }
                        if (arg0.field1024 <= 0 && var11.field3561 == 0) {
                            arg0.field1023++;
                            break label430;
                        }
                    }
                    int var12 = arg0.field983;
                    int var13 = arg0.field965;
                    int var14 = arg0.field1020[arg0.field976 - 1] * 128 + arg0.field968 * 64;
                    int var15 = arg0.field1021[arg0.field976 - 1] * 128 + arg0.field968 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field1016 = 1280;
                        } else if (var13 > var15) {
                            arg0.field1016 = 1792;
                        } else {
                            arg0.field1016 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field1016 = 768;
                        } else if (var13 > var15) {
                            arg0.field1016 = 256;
                        } else {
                            arg0.field1016 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field1016 = 1024;
                    } else if (var13 > var15) {
                        arg0.field1016 = 0;
                    }
                    byte var16 = arg0.field1022[arg0.field976 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field1016 - arg0.field966 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field1013;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field973;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field978;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field975;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field973;
                        }
                        arg0.field1019 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class89) {
                            var20 = ((class89) arg0).field1158.field3528;
                        }
                        if (var20) {
                            if (arg0.field966 != arg0.field1016 && arg0.field991 == -1 && arg0.field1018 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field976 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field976 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field1023 > 0 && arg0.field976 > 1) {
                                var19 = 8;
                                arg0.field1023--;
                            }
                        } else {
                            if (arg0.field976 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field976 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field1023 > 0 && arg0.field976 > 1) {
                                var19 = 8;
                                arg0.field1023--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field973 == arg0.field1019 && arg0.field982 != -1) {
                            arg0.field1019 = arg0.field982;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field983 += var19;
                                if (arg0.field983 > var14) {
                                    arg0.field983 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field983 -= var19;
                                if (arg0.field983 < var14) {
                                    arg0.field983 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field965 += var19;
                                if (arg0.field965 > var15) {
                                    arg0.field965 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field965 -= var19;
                                if (arg0.field965 < var15) {
                                    arg0.field965 = var15;
                                }
                            }
                        }
                        if (arg0.field983 == var14 && arg0.field965 == var15) {
                            arg0.field976--;
                            if (arg0.field1024 > 0) {
                                arg0.field1024--;
                            }
                        }
                    } else {
                        arg0.field983 = var14;
                        arg0.field965 = var15;
                        arg0.field976--;
                        if (arg0.field1024 > 0) {
                            arg0.field1024--;
                        }
                    }
                }
            }
        }
        if (arg0.field983 < 128 || arg0.field965 < 128 || arg0.field983 >= 13184 || arg0.field965 >= 13184) {
            arg0.field992 = -1;
            arg0.field1002 = -1;
            arg0.field967 = 0;
            arg0.field1012 = 0;
            arg0.field983 = arg0.field1020[0] * 128 + arg0.field968 * 64;
            arg0.field965 = arg0.field1021[0] * 128 + arg0.field968 * 64;
            arg0.method1619();
        }
        if (Statics.field455 == arg0 && (arg0.field983 < 1536 || arg0.field965 < 1536 || arg0.field983 >= 11776 || arg0.field965 >= 11776)) {
            arg0.field992 = -1;
            arg0.field1002 = -1;
            arg0.field967 = 0;
            arg0.field1012 = 0;
            arg0.field983 = arg0.field1020[0] * 128 + arg0.field968 * 64;
            arg0.field965 = arg0.field1021[0] * 128 + arg0.field968 * 64;
            arg0.method1619();
        }
        if (arg0.field1018 != 0) {
            if (arg0.field991 != -1) {
                class79 var21 = null;
                if (arg0.field991 < 32768) {
                    var21 = field716[arg0.field991];
                } else if (arg0.field991 >= 32768) {
                    var21 = field790[arg0.field991 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field983 - var21.field983;
                    int var23 = arg0.field965 - var21.field965;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field1016 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1003) {
                    arg0.field991 = -1;
                    arg0.field1003 = false;
                }
            }
            if (arg0.field993 != -1 && (arg0.field976 == 0 || arg0.field1023 > 0)) {
                arg0.field1016 = arg0.field993;
                arg0.field993 = -1;
            }
            int var24 = arg0.field1016 - arg0.field966 & 0x7FF;
            if (var24 == 0 && arg0.field1003) {
                arg0.field991 = -1;
                arg0.field1003 = false;
            }
            if (var24 == 0) {
                arg0.field1017 = 0;
            } else {
                arg0.field1017++;
                if (var24 > 1024) {
                    arg0.field966 -= arg0.field1018;
                    boolean var25 = true;
                    if (var24 < arg0.field1018 || var24 > 2048 - arg0.field1018) {
                        arg0.field966 = arg0.field1016;
                        var25 = false;
                    }
                    if (arg0.field970 == arg0.field1019 && (arg0.field1017 > 25 || var25)) {
                        if (arg0.field971 == -1) {
                            arg0.field1019 = arg0.field973;
                        } else {
                            arg0.field1019 = arg0.field971;
                        }
                    }
                } else {
                    arg0.field966 += arg0.field1018;
                    boolean var26 = true;
                    if (var24 < arg0.field1018 || var24 > 2048 - arg0.field1018) {
                        arg0.field966 = arg0.field1016;
                        var26 = false;
                    }
                    if (arg0.field970 == arg0.field1019 && (arg0.field1017 > 25 || var26)) {
                        if (arg0.field964 == -1) {
                            arg0.field1019 = arg0.field973;
                        } else {
                            arg0.field1019 = arg0.field964;
                        }
                    }
                }
                arg0.field966 &= 0x7FF;
            }
        }
        arg0.field1011 = false;
        if (arg0.field1019 != -1) {
            class269 var28 = class269.method3330(arg0.field1019);
            if (var28 == null || var28.field3552 == null) {
                arg0.field1019 = -1;
            } else {
                arg0.field994++;
                if (arg0.field995 < var28.field3552.length && arg0.field994 > var28.field3551[arg0.field995]) {
                    arg0.field994 = 1;
                    arg0.field995++;
                    method1179(var28, arg0.field995, arg0.field983, arg0.field965);
                }
                if (arg0.field995 >= var28.field3552.length) {
                    arg0.field994 = 0;
                    arg0.field995 = 0;
                    method1179(var28, arg0.field995, arg0.field983, arg0.field965);
                }
            }
        }
        if (arg0.field1002 != -1 && field671 >= arg0.field988) {
            if (arg0.field974 < 0) {
                arg0.field974 = 0;
            }
            int var29 = class254.method41(arg0.field1002).field3274;
            if (var29 == -1) {
                arg0.field1002 = -1;
            } else {
                class269 var30 = class269.method3330(var29);
                if (var30 == null || var30.field3552 == null) {
                    arg0.field1002 = -1;
                } else {
                    arg0.field1004++;
                    if (arg0.field974 < var30.field3552.length && arg0.field1004 > var30.field3551[arg0.field974]) {
                        arg0.field1004 = 1;
                        arg0.field974++;
                        method1179(var30, arg0.field974, arg0.field983, arg0.field965);
                    }
                    if (arg0.field974 >= var30.field3552.length && (arg0.field974 < 0 || arg0.field974 >= var30.field3552.length)) {
                        arg0.field1002 = -1;
                    }
                }
            }
        }
        if (arg0.field992 != -1 && arg0.field1000 <= 1) {
            class269 var31 = class269.method3330(arg0.field992);
            if (var31.field3560 == 1 && arg0.field1024 > 0 && arg0.field967 <= field671 && arg0.field1012 < field671) {
                arg0.field1000 = 1;
                return;
            }
        }
        if (arg0.field992 != -1 && arg0.field1000 == 0) {
            class269 var32 = class269.method3330(arg0.field992);
            if (var32 == null || var32.field3552 == null) {
                arg0.field992 = -1;
            } else {
                arg0.field999++;
                if (arg0.field998 < var32.field3552.length && arg0.field999 > var32.field3551[arg0.field998]) {
                    arg0.field999 = 1;
                    arg0.field998++;
                    method1179(var32, arg0.field998, arg0.field983, arg0.field965);
                }
                if (arg0.field998 >= var32.field3552.length) {
                    arg0.field998 -= var32.field3553;
                    arg0.field1001++;
                    if (arg0.field1001 >= var32.field3563) {
                        arg0.field992 = -1;
                    } else if (arg0.field998 >= 0 && arg0.field998 < var32.field3552.length) {
                        method1179(var32, arg0.field998, arg0.field983, arg0.field965);
                    } else {
                        arg0.field992 = -1;
                    }
                }
                arg0.field1011 = var32.field3559;
            }
        }
        if (arg0.field1000 > 0) {
            arg0.field1000--;
        }
    }

    @ObfuscatedName("bm.fm(Lby;IIB)V")
    public static void method1038(class76 arg0, int arg1, int arg2) {
        if (arg0.field992 == arg1 && arg1 != -1) {
            int var3 = class269.method3330(arg1).field3562;
            if (var3 == 1) {
                arg0.field998 = 0;
                arg0.field999 = 0;
                arg0.field1000 = arg2;
                arg0.field1001 = 0;
            }
            if (var3 == 2) {
                arg0.field1001 = 0;
            }
        } else if (arg1 == -1 || arg0.field992 == -1 || class269.method3330(arg1).field3544 >= class269.method3330(arg0.field992).field3544) {
            arg0.field992 = arg1;
            arg0.field998 = 0;
            arg0.field999 = 0;
            arg0.field1000 = arg2;
            arg0.field1001 = 0;
            arg0.field1024 = arg0.field976;
        }
    }

    @ObfuscatedName("bd.fj(I)I")
    public static int method765() {
        return field935 ? 2 : 1;
    }

    @ObfuscatedName("bu.fv(II)V")
    public static void method1076(int arg0) {
        field887 = 0L;
        if (arg0 >= 2) {
            field935 = true;
        } else {
            field935 = false;
        }
        if (method765() == 1) {
            Statics.field170.method821(765, 503);
        } else {
            Statics.field170.method821(7680, 2160);
        }
        if (field714 < 25) {
            return;
        }
        class197 var1 = class197.method3184(class193.field2280, field721.field1340);
        var1.field2375.method5437(method765());
        var1.field2375.method5387(Statics.field1299);
        var1.field2375.method5387(Statics.field397);
        field721.method2161(var1);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method937() {
        field887 = class307.method3253() + 500L;
        this.method1194();
        if (field834 != -1) {
            this.method1200(true);
        }
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1194() {
        int var1 = Statics.field1299;
        int var2 = Statics.field397;
        if (this.field476 < var1) {
            int var3 = this.field476;
        }
        if (this.field496 < var2) {
            int var4 = this.field496;
        }
        if (Statics.field2108 == null) {
            return;
        }
        try {
            client var5 = Statics.field170;
            Object[] var6 = new Object[] { method765() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fb(I)V")
    public final void method1195() {
        if (field834 != -1) {
            int var1 = field834;
            if (class227.method3182(var1)) {
                method324(Statics.field2595[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field727; var2++) {
            if (field814[var2]) {
                field880[var2] = true;
            }
            field881[var2] = field814[var2];
            field814[var2] = false;
        }
        field878 = field671;
        field747 = -1;
        field824 = -1;
        Statics.field2067 = null;
        if (field834 != -1) {
            field727 = 0;
            method3887(field834, 0, 0, Statics.field1299, Statics.field397, 0, 0, -1);
        }
        class331.method5695();
        if (field937) {
            if (field778 == 1) {
                Statics.field3609[field678 / 100].method5855(field845 - 8, field694 - 8);
            }
            if (field778 == 2) {
                Statics.field3609[field678 / 100 + 4].method5855(field845 - 8, field694 - 8);
            }
        }
        if (field703) {
            method697();
        } else if (field747 != -1) {
            int var3 = field747;
            int var4 = field824;
            if ((field811 >= 2 || field827 != 0 || field829) && field932) {
                int var5 = method3114();
                String var6;
                if (field827 == 1 && field811 < 2) {
                    var6 = class234.field2945 + class234.field2955 + field828 + " " + class91.field1179;
                } else if (field829 && field811 < 2) {
                    var6 = field679 + class234.field2955 + field922 + " " + class91.field1179;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field924[var5].length() > 0) {
                        var7 = field822[var5] + class234.field2955 + field924[var5];
                    } else {
                        var7 = field822[var5];
                    }
                    var6 = var7;
                }
                if (field811 > 2) {
                    var6 = var6 + class91.method1063(16777215) + " " + '/' + " " + (field811 - 2) + class234.field2820;
                }
                Statics.field94.method5078(var6, var3 + 4, var4 + 15, 16777215, 0, field671 / 1000);
            }
        }
        if (field696 == 3) {
            for (int var8 = 0; var8 < field727; var8++) {
                if (field881[var8]) {
                    class331.method5685(field888[var8], field883[var8], field909[var8], field801[var8], 16711935, 128);
                } else if (field880[var8]) {
                    class331.method5685(field888[var8], field883[var8], field909[var8], field801[var8], 16711680, 128);
                }
            }
        }
        class85.method11(Statics.field1576, Statics.field455.field983, Statics.field455.field965, field748);
        field748 = 0;
    }

    @ObfuscatedName("ip.fh(Ljava/lang/String;ZB)V")
    public static final void method4010(String arg0, boolean arg1) {
        if (!field789) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2435.method5067(arg0, 250);
        int var6 = Statics.field2435.method5087(arg0, 250) * 13;
        class331.method5686(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class331.method5690(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2435.method5074(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method8(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field554.method807(0, 0);
        } else {
            method214(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bg.fz(IIIIB)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3) {
        field772++;
        method757();
        method3243();
        method668();
        method226(true);
        method1033();
        method226(false);
        for (class96 var4 = (class96) field804.method4651(); var4 != null; var4 = (class96) field804.method4656()) {
            if (Statics.field1576 != var4.field1257 || field671 > var4.field1243) {
                var4.method3388();
            } else if (field671 >= var4.field1242) {
                if (var4.field1246 > 0) {
                    class89 var5 = field716[var4.field1246 - 1];
                    if (var5 != null && var5.field983 >= 0 && var5.field983 < 13312 && var5.field965 >= 0 && var5.field965 < 13312) {
                        var4.method2024(var5.field983, var5.field965, method3439(var5.field983, var5.field965, var4.field1257) - var4.field1241, field671);
                    }
                }
                if (var4.field1246 < 0) {
                    int var6 = -var4.field1246 - 1;
                    class76 var7;
                    if (field791 == var6) {
                        var7 = Statics.field455;
                    } else {
                        var7 = field790[var6];
                    }
                    if (var7 != null && var7.field983 >= 0 && var7.field983 < 13312 && var7.field965 >= 0 && var7.field965 < 13312) {
                        var4.method2024(var7.field983, var7.field965, method3439(var7.field983, var7.field965, var4.field1257) - var4.field1241, field671);
                    }
                }
                var4.method2031(field748);
                Statics.field2011.method2917(Statics.field1576, (int) var4.field1248, (int) var4.field1258, (int) var4.field1250, 60, var4, var4.field1256, -1L, false);
            }
        }
        for (class87 var8 = (class87) field805.method4651(); var8 != null; var8 = (class87) field805.method4656()) {
            if (Statics.field1576 != var8.field1135 || var8.field1145) {
                var8.method3388();
            } else if (field671 >= var8.field1136) {
                var8.method1919(field748);
                if (var8.field1145) {
                    var8.method3388();
                } else {
                    Statics.field2011.method2917(var8.field1135, var8.field1147, var8.field1139, var8.field1144, 60, var8, 0, -1L, false);
                }
            }
        }
        method542(arg0, arg1, arg2, arg3, true);
        int var9 = field884;
        int var10 = field933;
        int var11 = field934;
        int var12 = field796;
        class331.method5691(var9, var10, var9 + var11, var10 + var12);
        class140.method2827();
        if (!field918) {
            int var13 = field743;
            if (field882 / 256 > var13) {
                var13 = field882 / 256;
            }
            if (field919[4] && field776[4] + 128 > var13) {
                var13 = field776[4] + 128;
            }
            int var14 = field926 & 0x7FF;
            int var15 = Statics.field2589;
            int var16 = Statics.field235;
            int var17 = Statics.field3315;
            int var20 = var13 * 3 + 600;
            method195(var15, var16, var17, var13, var14, var20, var12);
        }
        int var33;
        if (field918) {
            var33 = method3993();
        } else {
            int var21;
            if (Statics.field2108.field1080) {
                var21 = Statics.field1576;
            } else {
                label502: {
                    int var22 = 3;
                    if (Statics.field1819 < 310) {
                        label494: {
                            int var23;
                            int var24;
                            if (field749 == 1) {
                                var23 = Statics.field2589 >> 7;
                                var24 = Statics.field3315 >> 7;
                            } else {
                                var23 = Statics.field455.field983 >> 7;
                                var24 = Statics.field455.field965 >> 7;
                            }
                            int var25 = Statics.field513 >> 7;
                            int var26 = Statics.field1118 >> 7;
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                                    if ((class65.field522[Statics.field1576][var25][var26] & 0x4) != 0) {
                                        var22 = Statics.field1576;
                                    }
                                    int var27;
                                    if (var23 > var25) {
                                        var27 = var23 - var25;
                                    } else {
                                        var27 = var25 - var23;
                                    }
                                    int var28;
                                    if (var24 > var26) {
                                        var28 = var24 - var26;
                                    } else {
                                        var28 = var26 - var24;
                                    }
                                    if (var27 > var28) {
                                        int var29 = var28 * 65536 / var27;
                                        int var30 = 32768;
                                        while (true) {
                                            if (var23 == var25) {
                                                break label494;
                                            }
                                            if (var25 < var23) {
                                                var25++;
                                            } else if (var25 > var23) {
                                                var25--;
                                            }
                                            if ((class65.field522[Statics.field1576][var25][var26] & 0x4) != 0) {
                                                var22 = Statics.field1576;
                                            }
                                            var30 += var29;
                                            if (var30 >= 65536) {
                                                var30 -= 65536;
                                                if (var26 < var24) {
                                                    var26++;
                                                } else if (var26 > var24) {
                                                    var26--;
                                                }
                                                if ((class65.field522[Statics.field1576][var25][var26] & 0x4) != 0) {
                                                    var22 = Statics.field1576;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var28 > 0) {
                                            int var31 = var27 * 65536 / var28;
                                            int var32 = 32768;
                                            while (var24 != var26) {
                                                if (var26 < var24) {
                                                    var26++;
                                                } else if (var26 > var24) {
                                                    var26--;
                                                }
                                                if ((class65.field522[Statics.field1576][var25][var26] & 0x4) != 0) {
                                                    var22 = Statics.field1576;
                                                }
                                                var32 += var31;
                                                if (var32 >= 65536) {
                                                    var32 -= 65536;
                                                    if (var25 < var23) {
                                                        var25++;
                                                    } else if (var25 > var23) {
                                                        var25--;
                                                    }
                                                    if ((class65.field522[Statics.field1576][var25][var26] & 0x4) != 0) {
                                                        var22 = Statics.field1576;
                                                    }
                                                }
                                            }
                                        }
                                        break label494;
                                    }
                                }
                                var21 = Statics.field1576;
                                break label502;
                            }
                            var21 = Statics.field1576;
                            break label502;
                        }
                    }
                    if (Statics.field455.field983 >= 0 && Statics.field455.field965 >= 0 && Statics.field455.field983 < 13312 && Statics.field455.field965 < 13312) {
                        if ((class65.field522[Statics.field1576][Statics.field455.field983 >> 7][Statics.field455.field965 >> 7] & 0x4) != 0) {
                            var22 = Statics.field1576;
                        }
                        var21 = var22;
                    } else {
                        var21 = Statics.field1576;
                    }
                }
            }
            var33 = var21;
        }
        int var34 = Statics.field513;
        int var35 = Statics.field390;
        int var36 = Statics.field1118;
        int var37 = Statics.field1819;
        int var38 = Statics.field439;
        for (int var39 = 0; var39 < 5; var39++) {
            if (field919[var39]) {
                int var40 = (int) (Math.random() * (double) (field920[var39] * 2 + 1) - (double) field920[var39] + Math.sin((double) field779[var39] / 100.0D * (double) field923[var39]) * (double) field776[var39]);
                if (var39 == 0) {
                    Statics.field513 += var40;
                }
                if (var39 == 1) {
                    Statics.field390 += var40;
                }
                if (var39 == 2) {
                    Statics.field1118 += var40;
                }
                if (var39 == 3) {
                    Statics.field439 = Statics.field439 + var40 & 0x7FF;
                }
                if (var39 == 4) {
                    Statics.field1819 += var40;
                    if (Statics.field1819 < 128) {
                        Statics.field1819 = 128;
                    }
                    if (Statics.field1819 > 383) {
                        Statics.field1819 = 383;
                    }
                }
            }
        }
        int var41 = class64.field508;
        int var42 = class64.field498;
        if (class64.field515 != 0) {
            var41 = class64.field505;
            var42 = class64.field504;
        }
        if (var41 >= var9 && var41 < var9 + var11 && var42 >= var10 && var42 < var10 + var12) {
            int var43 = var41 - var9;
            int var44 = var42 - var10;
            class138.field1770 = var43;
            class138.field1769 = var44;
            class138.field1767 = true;
            class138.field1775 = 0;
            class138.field1773 = false;
        } else {
            class138.method270();
        }
        method4752();
        class331.method5686(var9, var10, var11, var12, 0);
        method4752();
        int var45 = class140.field1798;
        class140.field1798 = field936;
        Statics.field2011.method2946(Statics.field513, Statics.field390, Statics.field1118, Statics.field1819, Statics.field439, var33);
        class140.field1798 = var45;
        method4752();
        Statics.field2011.method2920();
        field761 = 0;
        boolean var46 = false;
        int var47 = -1;
        int var48 = -1;
        int var49 = class99.field1281;
        int[] var50 = class99.field1282;
        for (int var51 = 0; var51 < field717 + var49; var51++) {
            class79 var52;
            if (var51 < var49) {
                var52 = field790[var50[var51]];
                if (field781 == var50[var51]) {
                    var46 = true;
                    var47 = var51;
                    continue;
                }
                if (Statics.field455 == var52) {
                    var48 = var51;
                    continue;
                }
            } else {
                var52 = field716[field875[var51 - var49]];
            }
            method4753(var52, var51, var9, var10, var11, var12);
        }
        if (field793 && var48 != -1) {
            method4753(Statics.field455, var48, var9, var10, var11, var12);
        }
        if (var46) {
            method4753(field790[field781], var47, var9, var10, var11, var12);
        }
        for (int var53 = 0; var53 < field761; var53++) {
            int var54 = field763[var53];
            int var55 = field899[var53];
            int var56 = field766[var53];
            int var57 = field713[var53];
            boolean var58 = true;
            while (var58) {
                var58 = false;
                for (int var59 = 0; var59 < var53; var59++) {
                    if (var55 + 2 > field899[var59] - field713[var59] && var55 - var57 < field899[var59] + 2 && var54 - var56 < field766[var59] + field763[var59] && var54 + var56 > field763[var59] - field766[var59] && field899[var59] - field713[var59] < var55) {
                        var55 = field899[var59] - field713[var59];
                        var58 = true;
                    }
                }
            }
            field773 = field763[var53];
            field774 = field899[var53] = var55;
            String var60 = field770[var53];
            if (field838 == 0) {
                int var61 = 16776960;
                if (field767[var53] < 6) {
                    var61 = field889[field767[var53]];
                }
                if (field767[var53] == 6) {
                    var61 = field772 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field767[var53] == 7) {
                    var61 = field772 % 20 < 10 ? 255 : 65535;
                }
                if (field767[var53] == 8) {
                    var61 = field772 % 20 < 10 ? 45056 : 8454016;
                }
                if (field767[var53] == 9) {
                    int var62 = 150 - field765[var53];
                    if (var62 < 50) {
                        var61 = var62 * 1280 + 16711680;
                    } else if (var62 < 100) {
                        var61 = 16776960 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var61 = (var62 - 100) * 5 + 65280;
                    }
                }
                if (field767[var53] == 10) {
                    int var63 = 150 - field765[var53];
                    if (var63 < 50) {
                        var61 = var63 * 5 + 16711680;
                    } else if (var63 < 100) {
                        var61 = 16711935 - (var63 - 50) * 327680;
                    } else if (var63 < 150) {
                        var61 = (var63 - 100) * 327680 + 255 - (var63 - 100) * 5;
                    }
                }
                if (field767[var53] == 11) {
                    int var64 = 150 - field765[var53];
                    if (var64 < 50) {
                        var61 = 16777215 - var64 * 327685;
                    } else if (var64 < 100) {
                        var61 = (var64 - 50) * 327685 + 65280;
                    } else if (var64 < 150) {
                        var61 = 16777215 - (var64 - 100) * 327680;
                    }
                }
                if (field768[var53] == 0) {
                    Statics.field94.method5073(var60, field773 + var9, field774 + var10, var61, 0);
                }
                if (field768[var53] == 1) {
                    Statics.field94.method5063(var60, field773 + var9, field774 + var10, var61, 0, field772);
                }
                if (field768[var53] == 2) {
                    Statics.field94.method5076(var60, field773 + var9, field774 + var10, var61, 0, field772);
                }
                if (field768[var53] == 3) {
                    Statics.field94.method5077(var60, field773 + var9, field774 + var10, var61, 0, field772, 150 - field765[var53]);
                }
                if (field768[var53] == 4) {
                    int var65 = (150 - field765[var53]) * (Statics.field94.method5065(var60) + 100) / 150;
                    class331.method5679(field773 + var9 - 50, var10, field773 + var9 + 50, var10 + var12);
                    Statics.field94.method5070(var60, field773 + var9 + 50 - var65, field774 + var10, var61, 0);
                    class331.method5691(var9, var10, var9 + var11, var10 + var12);
                }
                if (field768[var53] == 5) {
                    int var66 = 150 - field765[var53];
                    int var67 = 0;
                    if (var66 < 25) {
                        var67 = var66 - 25;
                    } else if (var66 > 125) {
                        var67 = var66 - 125;
                    }
                    class331.method5679(var9, field774 + var10 - Statics.field94.field3720 - 1, var9 + var11, field774 + var10 + 5);
                    Statics.field94.method5073(var60, field773 + var9, field774 + var10 + var67, var61, 0);
                    class331.method5691(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field94.method5073(var60, field773 + var9, field774 + var10, 16776960, 0);
            }
        }
        if (field690 == 2) {
            method1939((field780 - Statics.field2130 << 7) + field674, (field762 - Statics.field1275 << 7) + field710, field798 * 2);
            if (field773 > -1 && field671 % 20 < 10) {
                Statics.field1468[0].method5855(field773 + var9 - 12, field774 + var10 - 28);
            }
        }
        ((class129) Statics.field1804).method2584(field748);
        method3125(var9, var10, var11, var12);
        Statics.field513 = var34;
        Statics.field390 = var35;
        Statics.field1118 = var36;
        Statics.field1819 = var37;
        Statics.field439 = var38;
        if (field681 && class247.method3451(true, false) == 0) {
            field681 = false;
        }
        if (field681) {
            class331.method5686(var9, var10, var11, var12, 0);
            method4010(class234.field2802, false);
        }
    }

    @ObfuscatedName("an.gv(IIIIZI)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field728;
        } else if (var5 >= 100) {
            var6 = field925;
        } else {
            var6 = (field925 - field728) * var5 / 100 + field728;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field686) {
            short var8 = field686;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field929) {
                var6 = field929;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class331.method5695();
                    class331.method5686(arg0, arg1, var10, arg3, -16777216);
                    class331.method5686(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field862) {
            short var11 = field862;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field928) {
                var6 = field928;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class331.method5695();
                    class331.method5686(arg0, arg1, arg2, var13, -16777216);
                    class331.method5686(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field936 = arg3 * var6 / 334;
        if (field934 != arg2 || field796 != arg3) {
            method201(arg2, arg3);
        }
        field884 = arg0;
        field933 = arg1;
        field934 = arg2;
        field796 = arg3;
    }

    @ObfuscatedName("ba.ga(I)V")
    public static void method757() {
        if (Statics.field455.field983 >> 7 == field904 && Statics.field455.field965 >> 7 == field769) {
            field904 = 0;
        }
    }

    @ObfuscatedName("fo.gf(B)V")
    public static void method3243() {
        if (field793) {
            method93(Statics.field455, false);
        }
    }

    @ObfuscatedName("ay.gq(I)V")
    public static void method668() {
        if (field781 >= 0 && field790[field781] != null) {
            method93(field790[field781], false);
        }
    }

    @ObfuscatedName("bp.gb(B)V")
    public static void method1033() {
        int var0 = class99.field1281;
        int[] var1 = class99.field1282;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field781 != var1[var2] && field791 != var1[var2]) {
                method93(field790[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("z.gd(Lby;ZI)V")
    public static void method93(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1124() || arg0.field655) {
            return;
        }
        arg0.field647 = false;
        if ((field675 && class99.field1281 > 50 || class99.field1281 > 200) && arg1 && arg0.field970 == arg0.field1019) {
            arg0.field647 = true;
        }
        int var2 = arg0.field983 >> 7;
        int var3 = arg0.field965 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method3462(0, 0, 0, false, arg0.field657);
        if (arg0.field659 != null && field671 >= arg0.field643 && field671 < arg0.field644) {
            arg0.field647 = false;
            arg0.field642 = method3439(arg0.field983, arg0.field965, Statics.field1576);
            arg0.field969 = field671;
            Statics.field2011.method2918(Statics.field1576, arg0.field983, arg0.field965, arg0.field642, 60, arg0, arg0.field966, var4, arg0.field649, arg0.field650, arg0.field651, arg0.field652);
            return;
        }
        if ((arg0.field983 & 0x7F) == 64 && (arg0.field965 & 0x7F) == 64) {
            if (field772 == field771[var2][var3]) {
                return;
            }
            field771[var2][var3] = field772;
        }
        arg0.field642 = method3439(arg0.field983, arg0.field965, Statics.field1576);
        arg0.field969 = field671;
        Statics.field2011.method2917(Statics.field1576, arg0.field983, arg0.field965, arg0.field642, 60, arg0, arg0.field966, var4, arg0.field1011);
    }

    @ObfuscatedName("ai.gc(ZI)V")
    public static final void method226(boolean arg0) {
        for (int var1 = 0; var1 < field717; var1++) {
            class89 var2 = field716[field875[var1]];
            if (var2 != null && var2.method1124() && var2.field1158.field3519 == arg0 && var2.field1158.method4473()) {
                int var3 = var2.field983 >> 7;
                int var4 = var2.field965 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field968 == 1 && (var2.field983 & 0x7F) == 64 && (var2.field965 & 0x7F) == 64) {
                        if (field772 == field771[var3][var4]) {
                            continue;
                        }
                        field771[var3][var4] = field772;
                    }
                    long var5 = class138.method3462(0, 0, 1, !var2.field1158.field3527, field875[var1]);
                    var2.field969 = field671;
                    Statics.field2011.method2917(Statics.field1576, var2.field983, var2.field965, method3439(var2.field983 + (var2.field968 * 64 - 64), var2.field965 + (var2.field968 * 64 - 64), Statics.field1576), var2.field968 * 64 - 64 + 60, var2, var2.field966, var5, var2.field1011);
                }
            }
        }
    }

    @ObfuscatedName("ic.gr(I)I")
    public static final int method3993() {
        if (Statics.field2108.field1080) {
            return Statics.field1576;
        } else {
            int var0 = method3439(Statics.field513, Statics.field1118, Statics.field1576);
            return var0 - Statics.field390 >= 800 || (class65.field522[Statics.field1576][Statics.field513 >> 7][Statics.field1118 >> 7] & 0x4) == 0 ? 3 : Statics.field1576;
        }
    }

    @ObfuscatedName("u.gm(S)Z")
    public static boolean method74() {
        return (field794 & 0x4) != 0;
    }

    @ObfuscatedName("jy.gu(Lcc;IIIIIB)V")
    public static final void method4753(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1124()) {
            return;
        }
        if (arg0 instanceof class89) {
            class267 var6 = ((class89) arg0).field1158;
            if (var6.field3508 != null) {
                var6 = var6.method4472();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1281;
        int[] var8 = class99.field1282;
        byte var9 = 0;
        if (arg1 < var7 && field671 == arg0.field969) {
            class76 var10 = (class76) arg0;
            boolean var11;
            if (field794 == 0) {
                var11 = false;
            } else if (Statics.field455 == var10) {
                boolean var16 = (field794 & 0x8) != 0;
                var11 = var16;
            } else {
                boolean var12 = method74();
                if (!var12) {
                    boolean var13 = (field794 & 0x1) != 0;
                    var12 = var13 && var10.method1128();
                }
                boolean var14 = var12;
                if (!var12) {
                    boolean var15 = (field794 & 0x2) != 0;
                    var14 = var15 && var10.method1127();
                }
                var11 = var14;
            }
            if (var11) {
                class76 var17 = (class76) arg0;
                if (arg1 < var7) {
                    int var18 = arg0.field1015 + 15;
                    method1939(arg0.field983, arg0.field965, var18);
                    class306 var19 = (class306) field726.get(class302.field3681);
                    byte var20 = 9;
                    var19.method5073(var17.field658.method4925(), field773 + arg2, field774 + arg3 - var20, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var21 = -2;
        if (!arg0.field990.method4578()) {
            method3687(arg0, arg0.field1015 + 15);
            for (class88 var22 = (class88) arg0.field990.method4569(); var22 != null; var22 = (class88) arg0.field990.method4588()) {
                class80 var23 = var22.method1925(field671);
                if (var23 != null) {
                    class257 var24 = var22.field1149;
                    class335 var25 = var24.method4224();
                    class335 var26 = var24.method4223();
                    int var27 = 0;
                    int var28;
                    if (var25 == null || var26 == null) {
                        var28 = var24.field3322;
                    } else {
                        if (var24.field3323 * 2 < var26.field3897) {
                            var27 = var24.field3323;
                        }
                        var28 = var26.field3897 - var27 * 2;
                    }
                    int var29 = 255;
                    boolean var30 = true;
                    int var31 = field671 - var23.field1031;
                    int var32 = var23.field1029 * var28 / var24.field3322;
                    int var35;
                    if (var23.field1030 > var31) {
                        int var33 = var24.field3318 == 0 ? 0 : var31 / var24.field3318 * var24.field3318;
                        int var34 = var23.field1028 * var28 / var24.field3322;
                        var35 = (var32 - var34) * var33 / var23.field1030 + var34;
                    } else {
                        var35 = var32;
                        int var36 = var23.field1030 + var24.field3319 - var31;
                        if (var24.field3317 >= 0) {
                            var29 = (var36 << 8) / (var24.field3319 - var24.field3317);
                        }
                    }
                    if (var23.field1029 > 0 && var35 < 1) {
                        var35 = 1;
                    }
                    if (var25 == null || var26 == null) {
                        var21 += 5;
                        if (field773 > -1) {
                            int var42 = field773 + arg2 - (var28 >> 1);
                            int var43 = field774 + arg3 - var21;
                            class331.method5686(var42, var43, var35, 5, 65280);
                            class331.method5686(var35 + var42, var43, var28 - var35, 5, 16711680);
                        }
                        var21 += 2;
                    } else {
                        int var37;
                        if (var28 == var35) {
                            var37 = var27 * 2 + var35;
                        } else {
                            var37 = var27 + var35;
                        }
                        int var38 = var25.field3895;
                        var21 += var38;
                        int var39 = field773 + arg2 - (var28 >> 1);
                        int var40 = field774 + arg3 - var21;
                        int var41 = var39 - var27;
                        if (var29 >= 0 && var29 < 255) {
                            var25.method5807(var41, var40, var29);
                            class331.method5679(var41, var40, var37 + var41, var38 + var40);
                            var26.method5807(var41, var40, var29);
                        } else {
                            var25.method5855(var41, var40);
                            class331.method5679(var41, var40, var37 + var41, var38 + var40);
                            var26.method5855(var41, var40);
                        }
                        class331.method5691(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var21 += 2;
                    }
                } else if (var22.method1940()) {
                    var22.method3388();
                }
            }
        }
        if (var21 == -2) {
            var21 += 7;
        }
        int var44 = var9 + var21;
        if (arg1 < var7) {
            class76 var45 = (class76) arg0;
            if (var45.field655) {
                return;
            }
            if (var45.field636 != -1 || var45.field637 != -1) {
                method3687(arg0, arg0.field1015 + 15);
                if (field773 > -1) {
                    if (var45.field636 != -1) {
                        var44 += 25;
                        Statics.field2111[var45.field636].method5855(field773 + arg2 - 12, field774 + arg3 - var44);
                    }
                    if (var45.field637 != -1) {
                        var44 += 25;
                        Statics.field424[var45.field637].method5855(field773 + arg2 - 12, field774 + arg3 - var44);
                    }
                }
            }
            if (arg1 >= 0 && field690 == 10 && field868 == var8[arg1]) {
                method3687(arg0, arg0.field1015 + 15);
                if (field773 > -1) {
                    int var46 = Statics.field1468[1].field3895 + var44;
                    Statics.field1468[1].method5855(field773 + arg2 - 12, field774 + arg3 - var46);
                }
            }
        } else {
            class267 var47 = ((class89) arg0).field1158;
            if (var47.field3508 != null) {
                var47 = var47.method4472();
            }
            if (var47.field3522 >= 0 && var47.field3522 < Statics.field424.length) {
                method3687(arg0, arg0.field1015 + 15);
                if (field773 > -1) {
                    Statics.field424[var47.field3522].method5855(field773 + arg2 - 12, field774 + arg3 - 30);
                }
            }
            if (field690 == 1 && field927 == field875[arg1 - var7] && field671 % 20 < 10) {
                int var48 = arg0.field1015 + 15;
                method1939(arg0.field983, arg0.field965, var48);
                if (field773 > -1) {
                    Statics.field1468[0].method5855(field773 + arg2 - 12, field774 + arg3 - 28);
                }
            }
        }
        if (arg0.field972 != null && (arg1 >= var7 || !arg0.field980 && (field894 == 4 || !arg0.field979 && (field894 == 0 || field894 == 3 || field894 == 1 && ((class76) arg0).method1128())))) {
            method3687(arg0, arg0.field1015);
            if (field773 > -1 && field761 < field680) {
                field766[field761] = Statics.field94.method5065(arg0.field972) / 2;
                field713[field761] = Statics.field94.field3720;
                field763[field761] = field773;
                field899[field761] = field774;
                field767[field761] = arg0.field997;
                field768[field761] = arg0.field977;
                field765[field761] = arg0.field981;
                field770[field761] = arg0.field972;
                field761++;
            }
        }
        for (int var49 = 0; var49 < 4; var49++) {
            int var50 = arg0.field1025[var49];
            int var51 = arg0.field985[var49];
            class263 var52 = null;
            int var53 = 0;
            if (var51 >= 0) {
                if (var50 <= field671) {
                    continue;
                }
                int var54 = arg0.field985[var49];
                class263 var55 = (class263) class263.field3359.method3127((long) var54);
                class263 var56;
                if (var55 == null) {
                    byte[] var57 = Statics.field3377.method3891(32, var54);
                    class263 var58 = new class263();
                    if (var57 != null) {
                        var58.method4345(new class310(var57));
                    }
                    class263.field3359.method3137(var58, (long) var54);
                    var56 = var58;
                } else {
                    var56 = var55;
                }
                var52 = var56;
                var53 = var56.field3365;
                if (var56 != null && var56.field3362 != null) {
                    var52 = var56.method4323();
                    if (var52 == null) {
                        arg0.field1025[var49] = -1;
                        continue;
                    }
                }
            } else if (var50 < 0) {
                continue;
            }
            int var59 = arg0.field1026[var49];
            class263 var60 = null;
            if (var59 >= 0) {
                class263 var61 = (class263) class263.field3359.method3127((long) var59);
                class263 var62;
                if (var61 == null) {
                    byte[] var63 = Statics.field3377.method3891(32, var59);
                    class263 var64 = new class263();
                    if (var63 != null) {
                        var64.method4345(new class310(var63));
                    }
                    class263.field3359.method3137(var64, (long) var59);
                    var62 = var64;
                } else {
                    var62 = var61;
                }
                var60 = var62;
                if (var62 != null && var62.field3362 != null) {
                    var60 = var62.method4323();
                }
            }
            if (var50 - var53 <= field671) {
                if (var52 == null) {
                    arg0.field1025[var49] = -1;
                } else {
                    method3687(arg0, arg0.field1015 / 2);
                    if (field773 > -1) {
                        if (var49 == 1) {
                            field774 -= 20;
                        }
                        if (var49 == 2) {
                            field773 -= 15;
                            field774 -= 10;
                        }
                        if (var49 == 3) {
                            field773 += 15;
                            field774 -= 10;
                        }
                        Object var65 = null;
                        Object var66 = null;
                        Object var67 = null;
                        Object var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        class335 var77 = null;
                        class335 var78 = null;
                        class335 var79 = null;
                        class335 var80 = null;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        int var86 = 0;
                        int var87 = 0;
                        int var88 = 0;
                        int var89 = 0;
                        class335 var90 = var52.method4324();
                        if (var90 != null) {
                            var69 = var90.field3897;
                            int var91 = var90.field3895;
                            if (var91 > var89) {
                                var89 = var91;
                            }
                            var73 = var90.field3894;
                        }
                        class335 var92 = var52.method4325();
                        if (var92 != null) {
                            var70 = var92.field3897;
                            int var93 = var92.field3895;
                            if (var93 > var89) {
                                var89 = var93;
                            }
                            var74 = var92.field3894;
                        }
                        class335 var94 = var52.method4321();
                        if (var94 != null) {
                            var71 = var94.field3897;
                            int var95 = var94.field3895;
                            if (var95 > var89) {
                                var89 = var95;
                            }
                            var75 = var94.field3894;
                        }
                        class335 var96 = var52.method4332();
                        if (var96 != null) {
                            var72 = var96.field3897;
                            int var97 = var96.field3895;
                            if (var97 > var89) {
                                var89 = var97;
                            }
                            var76 = var96.field3894;
                        }
                        if (var60 != null) {
                            var77 = var60.method4324();
                            if (var77 != null) {
                                var81 = var77.field3897;
                                int var98 = var77.field3895;
                                if (var98 > var89) {
                                    var89 = var98;
                                }
                                var85 = var77.field3894;
                            }
                            var78 = var60.method4325();
                            if (var78 != null) {
                                var82 = var78.field3897;
                                int var99 = var78.field3895;
                                if (var99 > var89) {
                                    var89 = var99;
                                }
                                var86 = var78.field3894;
                            }
                            var79 = var60.method4321();
                            if (var79 != null) {
                                var83 = var79.field3897;
                                int var100 = var79.field3895;
                                if (var100 > var89) {
                                    var89 = var100;
                                }
                                var87 = var79.field3894;
                            }
                            var80 = var60.method4332();
                            if (var80 != null) {
                                var84 = var80.field3897;
                                int var101 = var80.field3895;
                                if (var101 > var89) {
                                    var89 = var101;
                                }
                                var88 = var80.field3894;
                            }
                        }
                        class305 var102 = var52.method4340();
                        if (var102 == null) {
                            var102 = Statics.field271;
                        }
                        class305 var103;
                        if (var60 == null) {
                            var103 = Statics.field271;
                        } else {
                            var103 = var60.method4340();
                            if (var103 == null) {
                                var103 = Statics.field271;
                            }
                        }
                        Object var104 = null;
                        String var105 = null;
                        boolean var106 = false;
                        int var107 = 0;
                        String var108 = var52.method4326(arg0.field986[var49]);
                        int var109 = var102.method5065(var108);
                        if (var60 != null) {
                            var105 = var60.method4326(arg0.field989[var49]);
                            var107 = var103.method5065(var105);
                        }
                        int var110 = 0;
                        int var111 = 0;
                        if (var70 > 0) {
                            if (var94 == null && var96 == null) {
                                var110 = 1;
                            } else {
                                var110 = var109 / var70 + 1;
                            }
                        }
                        if (var60 != null && var82 > 0) {
                            if (var79 == null && var80 == null) {
                                var111 = 1;
                            } else {
                                var111 = var107 / var82 + 1;
                            }
                        }
                        int var112 = 0;
                        int var113 = var112;
                        if (var69 > 0) {
                            var112 += var69;
                        }
                        var112 += 2;
                        int var114 = var112;
                        if (var71 > 0) {
                            var112 += var71;
                        }
                        int var115 = var112;
                        int var116 = var112;
                        int var118;
                        if (var70 > 0) {
                            int var117 = var70 * var110;
                            var118 = var112 + var117;
                            var116 = (var117 - var109) / 2 + var112;
                        } else {
                            var118 = var109 + var112;
                        }
                        int var119 = var118;
                        if (var72 > 0) {
                            var118 += var72;
                        }
                        int var120 = 0;
                        int var121 = 0;
                        int var122 = 0;
                        int var123 = 0;
                        int var124 = 0;
                        if (var60 != null) {
                            var118 += 2;
                            var120 = var118;
                            if (var81 > 0) {
                                var118 += var81;
                            }
                            var118 += 2;
                            var121 = var118;
                            if (var83 > 0) {
                                var118 += var83;
                            }
                            var122 = var118;
                            var124 = var118;
                            if (var82 > 0) {
                                int var125 = var82 * var111;
                                var118 += var125;
                                var124 += (var125 - var107) / 2;
                            } else {
                                var118 += var107;
                            }
                            var123 = var118;
                            if (var84 > 0) {
                                var118 += var84;
                            }
                        }
                        int var126 = arg0.field1025[var49] - field671;
                        int var127 = var52.field3370 - var52.field3370 * var126 / var52.field3365;
                        int var128 = var52.field3371 * var126 / var52.field3365 + -var52.field3371;
                        int var129 = field773 + arg2 - (var118 >> 1) + var127;
                        int var130 = field774 + arg3 - 12 + var128;
                        int var131 = var130;
                        int var132 = var89 + var130;
                        int var133 = var52.field3375 + var130 + 15;
                        int var134 = var133 - var102.field3709;
                        int var135 = var102.field3710 + var133;
                        if (var134 < var130) {
                            var131 = var134;
                        }
                        if (var135 > var132) {
                            var132 = var135;
                        }
                        int var136 = 0;
                        if (var60 != null) {
                            var136 = var60.field3375 + var130 + 15;
                            int var137 = var136 - var103.field3709;
                            int var138 = var103.field3710 + var136;
                            if (var137 < var131) {
                                ;
                            }
                            if (var138 > var132) {
                                ;
                            }
                        }
                        int var141 = 255;
                        if (var52.field3364 >= 0) {
                            var141 = (var126 << 8) / (var52.field3365 - var52.field3364);
                        }
                        if (var141 >= 0 && var141 < 255) {
                            if (var90 != null) {
                                var90.method5807(var113 + var129 - var73, var130, var141);
                            }
                            if (var94 != null) {
                                var94.method5807(var114 + var129 - var75, var130, var141);
                            }
                            if (var92 != null) {
                                for (int var142 = 0; var142 < var110; var142++) {
                                    var92.method5807(var70 * var142 + (var115 + var129 - var74), var130, var141);
                                }
                            }
                            if (var96 != null) {
                                var96.method5807(var119 + var129 - var76, var130, var141);
                            }
                            var102.method5071(var108, var116 + var129, var133, var52.field3358, 0, var141);
                            if (var60 != null) {
                                if (var77 != null) {
                                    var77.method5807(var120 + var129 - var85, var130, var141);
                                }
                                if (var79 != null) {
                                    var79.method5807(var121 + var129 - var87, var130, var141);
                                }
                                if (var78 != null) {
                                    for (int var143 = 0; var143 < var111; var143++) {
                                        var78.method5807(var82 * var143 + (var122 + var129 - var86), var130, var141);
                                    }
                                }
                                if (var80 != null) {
                                    var80.method5807(var123 + var129 - var88, var130, var141);
                                }
                                var103.method5071(var105, var124 + var129, var136, var60.field3358, 0, var141);
                            }
                        } else {
                            if (var90 != null) {
                                var90.method5855(var113 + var129 - var73, var130);
                            }
                            if (var94 != null) {
                                var94.method5855(var114 + var129 - var75, var130);
                            }
                            if (var92 != null) {
                                for (int var144 = 0; var144 < var110; var144++) {
                                    var92.method5855(var70 * var144 + (var115 + var129 - var74), var130);
                                }
                            }
                            if (var96 != null) {
                                var96.method5855(var119 + var129 - var76, var130);
                            }
                            var102.method5070(var108, var116 + var129, var133, var52.field3358 | 0xFF000000, 0);
                            if (var60 != null) {
                                if (var77 != null) {
                                    var77.method5855(var120 + var129 - var85, var130);
                                }
                                if (var79 != null) {
                                    var79.method5855(var121 + var129 - var87, var130);
                                }
                                if (var78 != null) {
                                    for (int var145 = 0; var145 < var111; var145++) {
                                        var78.method5855(var82 * var145 + (var122 + var129 - var86), var130);
                                    }
                                }
                                if (var80 != null) {
                                    var80.method5855(var123 + var129 - var88, var130);
                                }
                                var103.method5070(var105, var124 + var129, var136, var60.field3358 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.gn(I)V")
    public static final void method2615() {
        field788 = 0;
        int var0 = (Statics.field455.field983 >> 7) + Statics.field2130;
        int var1 = (Statics.field455.field965 >> 7) + Statics.field1275;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field788 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field788 = 1;
        }
        if (field788 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field788 = 0;
        }
    }

    @ObfuscatedName("eb.gx(IIIIB)V")
    public static final void method3125(int arg0, int arg1, int arg2, int arg3) {
        method2615();
    }

    @ObfuscatedName("hk.gl(Lcc;II)V")
    public static final void method3687(class79 arg0, int arg1) {
        method1939(arg0.field983, arg0.field965, arg1);
    }

    @ObfuscatedName("ck.go(IIIS)V")
    public static final void method1939(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field773 = -1;
            field774 = -1;
            return;
        }
        int var3 = method3439(arg0, arg1, Statics.field1576) - arg2;
        int var4 = arg0 - Statics.field513;
        int var5 = var3 - Statics.field390;
        int var6 = arg1 - Statics.field1118;
        int var7 = class140.field1812[Statics.field1819];
        int var8 = class140.field1813[Statics.field1819];
        int var9 = class140.field1812[Statics.field439];
        int var10 = class140.field1813[Statics.field439];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field773 = field936 * var11 / var15 + field934 / 2;
            field774 = field936 * var14 / var15 + field796 / 2;
        } else {
            field773 = -1;
            field774 = -1;
        }
    }

    @ObfuscatedName("gz.gj(IIII)I")
    public static final int method3439(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field522[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field533[var5][var3][var4] + class65.field533[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field533[var5][var3][var4 + 1] + class65.field533[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("t.gg(IIIIIIII)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field890 - field708) * var7 / 100 + field708;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class140.field1812[var11];
            int var17 = class140.field1813[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class140.field1812[var12];
            int var20 = class140.field1813[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field513 = arg0 - var13;
        Statics.field390 = arg1 - var14;
        Statics.field1118 = arg2 - var15;
        Statics.field1819 = arg3;
        Statics.field439 = arg4;
        if (field749 == 1 && field843 >= 2 && field671 % 50 == 0 && (Statics.field2589 >> 7 != Statics.field455.field983 >> 7 || Statics.field3315 >> 7 != Statics.field455.field965 >> 7)) {
            int var22 = Statics.field455.field656;
            int var23 = (Statics.field2589 >> 7) + Statics.field2130;
            int var24 = (Statics.field3315 >> 7) + Statics.field1275;
            method162(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("a.gh(ZLkb;I)V")
    public static final void method77(boolean arg0, class309 arg1) {
        field733 = arg0;
        if (!field733) {
            int var2 = arg1.method5267();
            int var3 = arg1.method5267();
            int var4 = arg1.method5283();
            Statics.field360 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field360[var5][var6] = arg1.method5209();
                }
            }
            Statics.field307 = new int[var4];
            Statics.field3148 = new int[var4];
            Statics.field394 = new int[var4];
            Statics.field1170 = new byte[var4][];
            Statics.field1 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field307[var8] = var11;
                        Statics.field3148[var8] = Statics.field200.method3909("m" + var9 + "_" + var10);
                        Statics.field394[var8] = Statics.field200.method3909("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2614(var3, var2, true);
            return;
        }
        int var12 = arg1.method5377();
        boolean var13 = arg1.method5227() == 1;
        int var14 = arg1.method5267();
        int var15 = arg1.method5283();
        arg1.method5170();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5171(1);
                    if (var19 == 1) {
                        field734[var16][var17][var18] = arg1.method5171(26);
                    } else {
                        field734[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5172();
        Statics.field360 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field360[var20][var21] = arg1.method5209();
            }
        }
        Statics.field307 = new int[var15];
        Statics.field3148 = new int[var15];
        Statics.field394 = new int[var15];
        Statics.field1170 = new byte[var15][];
        Statics.field1 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field734[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field307[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field307[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3148[var22] = Statics.field200.method3909("m" + var31 + "_" + var32);
                            Statics.field394[var22] = Statics.field200.method3909("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2614(var14, var12, !var13);
    }

    @ObfuscatedName("du.gz(IIZB)V")
    public static final void method2614(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field329 == arg0 && Statics.field105 == arg1) {
            return;
        }
        Statics.field329 = arg0;
        Statics.field105 = arg1;
        method1727(25);
        method4010(class234.field2802, true);
        int var3 = Statics.field2130;
        int var4 = Statics.field1275;
        Statics.field2130 = (arg0 - 6) * 8;
        Statics.field1275 = (arg1 - 6) * 8;
        int var5 = Statics.field2130 - var3;
        int var6 = Statics.field1275 - var4;
        int var7 = Statics.field2130;
        int var8 = Statics.field1275;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field716[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1020[var11] -= var5;
                    var10.field1021[var11] -= var6;
                }
                var10.field983 -= var5 * 128;
                var10.field965 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field790[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1020[var14] -= var5;
                    var13.field1021[var14] -= var6;
                }
                var13.field983 -= var5 * 128;
                var13.field965 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field802[var25][var21][var22] = field802[var25][var23][var24];
                    } else {
                        field802[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field803.method4651(); var26 != null; var26 = (class78) field803.method4656()) {
            var26.field953 -= var5;
            var26.field955 -= var6;
            if (var26.field953 < 0 || var26.field955 < 0 || var26.field953 >= 104 || var26.field955 >= 104) {
                var26.method3388();
            }
        }
        if (field904 != 0) {
            field904 -= var5;
            field769 -= var6;
        }
        field912 = 0;
        field918 = false;
        Statics.field513 -= var5 << 7;
        Statics.field1118 -= var6 << 7;
        Statics.field2589 -= var5 << 7;
        Statics.field3315 -= var6 << 7;
        field938 = -1;
        field805.method4671();
        field804.method4671();
        for (int var27 = 0; var27 < 4; var27++) {
            field732[var27].method3345();
        }
    }

    @ObfuscatedName("kw.gi(ZI)V")
    public static final void method5049(boolean arg0) {
        method4752();
        field721.field1350++;
        if (field721.field1350 < 50 && !arg0) {
            return;
        }
        field721.field1350 = 0;
        if (field723 || field721.method2165() == null) {
            return;
        }
        class197 var1 = class197.method3184(class193.field2286, field721.field1340);
        field721.method2161(var1);
        try {
            field721.method2159();
        } catch (IOException var3) {
            field723 = true;
        }
    }

    @ObfuscatedName("b.ge(I)V")
    public static final void method200() {
        method5049(false);
        field823 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1170.length; var1++) {
            if (Statics.field3148[var1] != -1 && Statics.field1170[var1] == null) {
                Statics.field1170[var1] = Statics.field200.method3891(Statics.field3148[var1], 0);
                if (Statics.field1170[var1] == null) {
                    var0 = false;
                    field823++;
                }
            }
            if (Statics.field394[var1] != -1 && Statics.field1[var1] == null) {
                Statics.field1[var1] = Statics.field200.method3892(Statics.field394[var1], 0, Statics.field360[var1]);
                if (Statics.field1[var1] == null) {
                    var0 = false;
                    field823++;
                }
            }
        }
        if (!var0) {
            field810 = 1;
            return;
        }
        field691 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1170.length; var3++) {
            byte[] var4 = Statics.field1[var3];
            if (var4 != null) {
                int var5 = (Statics.field307[var3] >> 8) * 64 - Statics.field2130;
                int var6 = (Statics.field307[var3] & 0xFF) * 64 - Statics.field1275;
                if (field733) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class65.method3873(var4, var5, var6);
            }
        }
        if (!var2) {
            field810 = 2;
            return;
        }
        if (field810 != 0) {
            method4010(class234.field2802 + class91.field1176 + class91.field1178 + 100 + "%" + class91.field1174, true);
        }
        method4752();
        Statics.field2011.method2906();
        for (int var7 = 0; var7 < 4; var7++) {
            field732[var7].method3345();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class65.field522[var8][var9][var10] = 0;
                }
            }
        }
        method4752();
        class65.field523 = 99;
        Statics.field531 = new byte[4][104][104];
        Statics.field525 = new byte[4][104][104];
        Statics.field526 = new byte[4][104][104];
        Statics.field270 = new byte[4][104][104];
        Statics.field1032 = new int[4][105][105];
        Statics.field2037 = new byte[4][105][105];
        Statics.field527 = new int[105][105];
        Statics.field2015 = new int[104];
        Statics.field103 = new int[104];
        Statics.field1562 = new int[104];
        Statics.field3118 = new int[104];
        Statics.field199 = new int[104];
        int var11 = Statics.field1170.length;
        for (class85 var12 = (class85) class85.field1107.method4651(); var12 != null; var12 = (class85) class85.field1107.method4656()) {
            if (var12.field1110 != null) {
                Statics.field450.method2194(var12.field1110);
                var12.field1110 = null;
            }
            if (var12.field1113 != null) {
                Statics.field450.method2194(var12.field1113);
                var12.field1113 = null;
            }
        }
        class85.field1107.method4671();
        method5049(true);
        if (!field733) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field307[var13] >> 8) * 64 - Statics.field2130;
                int var15 = (Statics.field307[var13] & 0xFF) * 64 - Statics.field1275;
                byte[] var16 = Statics.field1170[var13];
                if (var16 != null) {
                    method4752();
                    int var17 = Statics.field329 * 8 - 48;
                    int var18 = Statics.field105 * 8 - 48;
                    class182[] var19 = field732;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2123[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class310 var23 = new class310(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class65.method3913(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field307[var27] >> 8) * 64 - Statics.field2130;
                int var29 = (Statics.field307[var27] & 0xFF) * 64 - Statics.field1275;
                byte[] var30 = Statics.field1170[var27];
                if (var30 == null && Statics.field105 < 800) {
                    method4752();
                    class65.method124(var28, var29, 64, 64);
                }
            }
            method5049(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field1[var31];
                if (var32 != null) {
                    int var33 = (Statics.field307[var31] >> 8) * 64 - Statics.field2130;
                    int var34 = (Statics.field307[var31] & 0xFF) * 64 - Statics.field1275;
                    method4752();
                    class65.method443(var32, var33, var34, Statics.field2011, field732);
                }
            }
        }
        if (field733) {
            for (int var35 = 0; var35 < 4; var35++) {
                method4752();
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        boolean var38 = false;
                        int var39 = field734[var35][var36][var37];
                        if (var39 != -1) {
                            int var40 = var39 >> 24 & 0x3;
                            int var41 = var39 >> 1 & 0x3;
                            int var42 = var39 >> 14 & 0x3FF;
                            int var43 = var39 >> 3 & 0x7FF;
                            int var44 = (var42 / 8 << 8) + var43 / 8;
                            for (int var45 = 0; var45 < Statics.field307.length; var45++) {
                                if (Statics.field307[var45] == var44 && Statics.field1170[var45] != null) {
                                    class65.method1685(Statics.field1170[var45], var35, var36 * 8, var37 * 8, var40, (var42 & 0x7) * 8, (var43 & 0x7) * 8, var41, field732);
                                    var38 = true;
                                    break;
                                }
                            }
                        }
                        if (!var38) {
                            int var46 = var35;
                            int var47 = var36 * 8;
                            int var48 = var37 * 8;
                            for (int var49 = 0; var49 < 8; var49++) {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    class65.field533[var46][var47 + var49][var48 + var50] = 0;
                                }
                            }
                            if (var47 > 0) {
                                for (int var51 = 1; var51 < 8; var51++) {
                                    class65.field533[var46][var47][var48 + var51] = class65.field533[var46][var47 - 1][var48 + var51];
                                }
                            }
                            if (var48 > 0) {
                                for (int var52 = 1; var52 < 8; var52++) {
                                    class65.field533[var46][var47 + var52][var48] = class65.field533[var46][var47 + var52][var48 - 1];
                                }
                            }
                            if (var47 > 0 && class65.field533[var46][var47 - 1][var48] != 0) {
                                class65.field533[var46][var47][var48] = class65.field533[var46][var47 - 1][var48];
                            } else if (var48 > 0 && class65.field533[var46][var47][var48 - 1] != 0) {
                                class65.field533[var46][var47][var48] = class65.field533[var46][var47][var48 - 1];
                            } else if (var47 > 0 && var48 > 0 && class65.field533[var46][var47 - 1][var48 - 1] != 0) {
                                class65.field533[var46][var47][var48] = class65.field533[var46][var47 - 1][var48 - 1];
                            }
                        }
                    }
                }
            }
            for (int var53 = 0; var53 < 13; var53++) {
                for (int var54 = 0; var54 < 13; var54++) {
                    int var55 = field734[0][var53][var54];
                    if (var55 == -1) {
                        class65.method124(var53 * 8, var54 * 8, 8, 8);
                    }
                }
            }
            method5049(true);
            for (int var56 = 0; var56 < 4; var56++) {
                method4752();
                for (int var57 = 0; var57 < 13; var57++) {
                    for (int var58 = 0; var58 < 13; var58++) {
                        int var59 = field734[var56][var57][var58];
                        if (var59 != -1) {
                            int var60 = var59 >> 24 & 0x3;
                            int var61 = var59 >> 1 & 0x3;
                            int var62 = var59 >> 14 & 0x3FF;
                            int var63 = var59 >> 3 & 0x7FF;
                            int var64 = (var62 / 8 << 8) + var63 / 8;
                            for (int var65 = 0; var65 < Statics.field307.length; var65++) {
                                if (Statics.field307[var65] == var64 && Statics.field1[var65] != null) {
                                    class65.method314(Statics.field1[var65], var56, var57 * 8, var58 * 8, var60, (var62 & 0x7) * 8, (var63 & 0x7) * 8, var61, Statics.field2011, field732);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method5049(true);
        method4752();
        class143 var66 = Statics.field2011;
        class182[] var67 = field732;
        for (int var68 = 0; var68 < 4; var68++) {
            for (int var69 = 0; var69 < 104; var69++) {
                for (int var70 = 0; var70 < 104; var70++) {
                    if ((class65.field522[var68][var69][var70] & 0x1) == 1) {
                        int var71 = var68;
                        if ((class65.field522[1][var69][var70] & 0x2) == 2) {
                            var71 = var68 - 1;
                        }
                        if (var71 >= 0) {
                            var67[var71].method3337(var69, var70);
                        }
                    }
                }
            }
        }
        class65.field536 += (int) (Math.random() * 5.0D) - 2;
        if (class65.field536 < -8) {
            class65.field536 = -8;
        }
        if (class65.field536 > 8) {
            class65.field536 = 8;
        }
        class65.field521 += (int) (Math.random() * 5.0D) - 2;
        if (class65.field521 < -16) {
            class65.field521 = -16;
        }
        if (class65.field521 > 16) {
            class65.field521 = 16;
        }
        for (int var72 = 0; var72 < 4; var72++) {
            byte[][] var73 = Statics.field2037[var72];
            int var74 = (int) Math.sqrt(5100.0D);
            int var75 = var74 * 768 >> 8;
            for (int var76 = 1; var76 < 103; var76++) {
                for (int var77 = 1; var77 < 103; var77++) {
                    int var78 = class65.field533[var72][var77 + 1][var76] - class65.field533[var72][var77 - 1][var76];
                    int var79 = class65.field533[var72][var77][var76 + 1] - class65.field533[var72][var77][var76 - 1];
                    int var80 = (int) Math.sqrt((double) (var79 * var79 + var78 * var78 + 65536));
                    int var81 = (var78 << 8) / var80;
                    int var82 = 65536 / var80;
                    int var83 = (var79 << 8) / var80;
                    int var84 = (var83 * -50 + var81 * -50 + var82 * -10) / var75 + 96;
                    int var85 = (var73[var77][var76] >> 1) + (var73[var77][var76 + 1] >> 3) + (var73[var77][var76 - 1] >> 2) + (var73[var77 - 1][var76] >> 2) + (var73[var77 + 1][var76] >> 3);
                    Statics.field527[var77][var76] = var84 - var85;
                }
            }
            for (int var86 = 0; var86 < 104; var86++) {
                Statics.field2015[var86] = 0;
                Statics.field103[var86] = 0;
                Statics.field1562[var86] = 0;
                Statics.field3118[var86] = 0;
                Statics.field199[var86] = 0;
            }
            for (int var87 = -5; var87 < 109; var87++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var89 = var87 + 5;
                    int var10002;
                    if (var89 >= 0 && var89 < 104) {
                        int var90 = Statics.field531[var72][var89][var88] & 0xFF;
                        if (var90 > 0) {
                            int var91 = var90 - 1;
                            class255 var92 = (class255) class255.field3288.method3127((long) var91);
                            class255 var93;
                            if (var92 == null) {
                                byte[] var94 = Statics.field3287.method3891(1, var91);
                                class255 var95 = new class255();
                                if (var94 != null) {
                                    var95.method4167(new class310(var94), var91);
                                }
                                var95.method4166();
                                class255.field3288.method3137(var95, (long) var91);
                                var93 = var95;
                            } else {
                                var93 = var92;
                            }
                            Statics.field2015[var88] += var93.field3291;
                            Statics.field103[var88] += var93.field3292;
                            Statics.field1562[var88] += var93.field3289;
                            Statics.field3118[var88] += var93.field3293;
                            var10002 = Statics.field199[var88]++;
                        }
                    }
                    int var97 = var87 - 5;
                    if (var97 >= 0 && var97 < 104) {
                        int var98 = Statics.field531[var72][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            int var99 = var98 - 1;
                            class255 var100 = (class255) class255.field3288.method3127((long) var99);
                            class255 var101;
                            if (var100 == null) {
                                byte[] var102 = Statics.field3287.method3891(1, var99);
                                class255 var103 = new class255();
                                if (var102 != null) {
                                    var103.method4167(new class310(var102), var99);
                                }
                                var103.method4166();
                                class255.field3288.method3137(var103, (long) var99);
                                var101 = var103;
                            } else {
                                var101 = var100;
                            }
                            Statics.field2015[var88] -= var101.field3291;
                            Statics.field103[var88] -= var101.field3292;
                            Statics.field1562[var88] -= var101.field3289;
                            Statics.field3118[var88] -= var101.field3293;
                            var10002 = Statics.field199[var88]--;
                        }
                    }
                }
                if (var87 >= 1 && var87 < 103) {
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = 0;
                    int var108 = 0;
                    int var109 = 0;
                    for (int var110 = -5; var110 < 109; var110++) {
                        int var111 = var110 + 5;
                        if (var111 >= 0 && var111 < 104) {
                            var105 += Statics.field2015[var111];
                            var106 += Statics.field103[var111];
                            var107 += Statics.field1562[var111];
                            var108 += Statics.field3118[var111];
                            var109 += Statics.field199[var111];
                        }
                        int var112 = var110 - 5;
                        if (var112 >= 0 && var112 < 104) {
                            var105 -= Statics.field2015[var112];
                            var106 -= Statics.field103[var112];
                            var107 -= Statics.field1562[var112];
                            var108 -= Statics.field3118[var112];
                            var109 -= Statics.field199[var112];
                        }
                        if (var110 >= 1 && var110 < 103 && (!field675 || (class65.field522[0][var87][var110] & 0x2) != 0 || (class65.field522[var72][var87][var110] & 0x10) == 0)) {
                            if (var72 < class65.field523) {
                                class65.field523 = var72;
                            }
                            int var113 = Statics.field531[var72][var87][var110] & 0xFF;
                            int var114 = Statics.field525[var72][var87][var110] & 0xFF;
                            if (var113 > 0 || var114 > 0) {
                                int var115 = class65.field533[var72][var87][var110];
                                int var116 = class65.field533[var72][var87 + 1][var110];
                                int var117 = class65.field533[var72][var87 + 1][var110 + 1];
                                int var118 = class65.field533[var72][var87][var110 + 1];
                                int var119 = Statics.field527[var87][var110];
                                int var120 = Statics.field527[var87 + 1][var110];
                                int var121 = Statics.field527[var87 + 1][var110 + 1];
                                int var122 = Statics.field527[var87][var110 + 1];
                                int var123 = -1;
                                int var124 = -1;
                                if (var113 > 0) {
                                    int var125 = var105 * 256 / var108;
                                    int var126 = var106 / var109;
                                    int var127 = var107 / var109;
                                    var123 = class65.method748(var125, var126, var127);
                                    int var128 = class65.field536 + var125 & 0xFF;
                                    int var129 = class65.field521 + var127;
                                    if (var129 < 0) {
                                        var129 = 0;
                                    } else if (var129 > 255) {
                                        var129 = 255;
                                    }
                                    var124 = class65.method748(var128, var126, var129);
                                }
                                if (var72 > 0) {
                                    boolean var130 = true;
                                    if (var113 == 0 && Statics.field526[var72][var87][var110] != 0) {
                                        var130 = false;
                                    }
                                    if (var114 > 0) {
                                        int var131 = var114 - 1;
                                        class268 var132 = (class268) class268.field3533.method3127((long) var131);
                                        class268 var133;
                                        if (var132 == null) {
                                            byte[] var134 = Statics.field3535.method3891(4, var131);
                                            class268 var135 = new class268();
                                            if (var134 != null) {
                                                var135.method4501(new class310(var134), var131);
                                            }
                                            var135.method4512();
                                            class268.field3533.method3137(var135, (long) var131);
                                            var133 = var135;
                                        } else {
                                            var133 = var132;
                                        }
                                        if (!var133.field3542) {
                                            var130 = false;
                                        }
                                    }
                                    if (var130 && var115 == var116 && var115 == var117 && var115 == var118) {
                                        Statics.field1032[var72][var87][var110] |= 0x924;
                                    }
                                }
                                int var136 = 0;
                                if (var124 != -1) {
                                    var136 = class140.field1789[class65.method3874(var124, 96)];
                                }
                                if (var114 == 0) {
                                    var66.method2911(var72, var87, var110, 0, 0, -1, var115, var116, var117, var118, class65.method3874(var123, var119), class65.method3874(var123, var120), class65.method3874(var123, var121), class65.method3874(var123, var122), 0, 0, 0, 0, var136, 0);
                                } else {
                                    int var137 = Statics.field526[var72][var87][var110] + 1;
                                    byte var138 = Statics.field270[var72][var87][var110];
                                    int var139 = var114 - 1;
                                    class268 var140 = (class268) class268.field3533.method3127((long) var139);
                                    class268 var141;
                                    if (var140 == null) {
                                        byte[] var142 = Statics.field3535.method3891(4, var139);
                                        class268 var143 = new class268();
                                        if (var142 != null) {
                                            var143.method4501(new class310(var142), var139);
                                        }
                                        var143.method4512();
                                        class268.field3533.method3137(var143, (long) var139);
                                        var141 = var143;
                                    } else {
                                        var141 = var140;
                                    }
                                    int var145 = var141.field3541;
                                    int var146;
                                    int var147;
                                    if (var145 >= 0) {
                                        var146 = Statics.field1804.method2588(var145);
                                        var147 = -1;
                                    } else if (var141.field3536 == 16711935) {
                                        var147 = -2;
                                        var145 = -1;
                                        var146 = -2;
                                    } else {
                                        var147 = class65.method748(var141.field3538, var141.field3539, var141.field3540);
                                        int var148 = class65.field536 + var141.field3538 & 0xFF;
                                        int var149 = class65.field521 + var141.field3540;
                                        if (var149 < 0) {
                                            var149 = 0;
                                        } else if (var149 > 255) {
                                            var149 = 255;
                                        }
                                        var146 = class65.method748(var148, var141.field3539, var149);
                                    }
                                    int var150 = 0;
                                    if (var146 != -2) {
                                        var150 = class140.field1789[class65.method2187(var146, 96)];
                                    }
                                    if (var141.field3537 != -1) {
                                        int var151 = class65.field536 + var141.field3532 & 0xFF;
                                        int var152 = class65.field521 + var141.field3543;
                                        if (var152 < 0) {
                                            var152 = 0;
                                        } else if (var152 > 255) {
                                            var152 = 255;
                                        }
                                        int var153 = class65.method748(var151, var141.field3534, var152);
                                        var150 = class140.field1789[class65.method2187(var153, 96)];
                                    }
                                    var66.method2911(var72, var87, var110, var137, var138, var145, var115, var116, var117, var118, class65.method3874(var123, var119), class65.method3874(var123, var120), class65.method3874(var123, var121), class65.method3874(var123, var122), class65.method2187(var147, var119), class65.method2187(var147, var120), class65.method2187(var147, var121), class65.method2187(var147, var122), var136, var150);
                                }
                            }
                        }
                    }
                }
            }
            for (int var154 = 1; var154 < 103; var154++) {
                for (int var155 = 1; var155 < 103; var155++) {
                    int var160;
                    if ((class65.field522[var72][var155][var154] & 0x8) != 0) {
                        var160 = 0;
                    } else if (var72 <= 0 || (class65.field522[1][var155][var154] & 0x2) == 0) {
                        var160 = var72;
                    } else {
                        var160 = var72 - 1;
                    }
                    var66.method3026(var72, var155, var154, var160);
                }
            }
            Statics.field531[var72] = (byte[][]) null;
            Statics.field525[var72] = (byte[][]) null;
            Statics.field526[var72] = (byte[][]) null;
            Statics.field270[var72] = (byte[][]) null;
            Statics.field2037[var72] = (byte[][]) null;
        }
        var66.method2936(-50, -10, -50);
        for (int var161 = 0; var161 < 104; var161++) {
            for (int var162 = 0; var162 < 104; var162++) {
                if ((class65.field522[1][var161][var162] & 0x2) == 2) {
                    var66.method2908(var161, var162);
                }
            }
        }
        int var163 = 1;
        int var164 = 2;
        int var165 = 4;
        for (int var166 = 0; var166 < 4; var166++) {
            if (var166 > 0) {
                var163 <<= 0x3;
                var164 <<= 0x3;
                var165 <<= 0x3;
            }
            for (int var167 = 0; var167 <= var166; var167++) {
                for (int var168 = 0; var168 <= 104; var168++) {
                    for (int var169 = 0; var169 <= 104; var169++) {
                        if ((Statics.field1032[var167][var169][var168] & var163) != 0) {
                            int var170 = var168;
                            int var171 = var168;
                            int var172 = var167;
                            int var173 = var167;
                            while (var170 > 0 && (Statics.field1032[var167][var169][var170 - 1] & var163) != 0) {
                                var170--;
                            }
                            while (var171 < 104 && (Statics.field1032[var167][var169][var171 + 1] & var163) != 0) {
                                var171++;
                            }
                            label644: while (var172 > 0) {
                                for (int var174 = var170; var174 <= var171; var174++) {
                                    if ((Statics.field1032[var172 - 1][var169][var174] & var163) == 0) {
                                        break label644;
                                    }
                                }
                                var172--;
                            }
                            label633: while (var173 < var166) {
                                for (int var175 = var170; var175 <= var171; var175++) {
                                    if ((Statics.field1032[var173 + 1][var169][var175] & var163) == 0) {
                                        break label633;
                                    }
                                }
                                var173++;
                            }
                            int var176 = (var173 + 1 - var172) * (var171 - var170 + 1);
                            if (var176 >= 8) {
                                short var177 = 240;
                                int var178 = class65.field533[var173][var169][var170] - var177;
                                int var179 = class65.field533[var172][var169][var170];
                                class143.method2909(var166, 1, var169 * 128, var169 * 128, var170 * 128, var171 * 128 + 128, var178, var179);
                                for (int var180 = var172; var180 <= var173; var180++) {
                                    for (int var181 = var170; var181 <= var171; var181++) {
                                        Statics.field1032[var180][var169][var181] &= ~var163;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1032[var167][var169][var168] & var164) != 0) {
                            int var182 = var169;
                            int var183 = var169;
                            int var184 = var167;
                            int var185 = var167;
                            while (var182 > 0 && (Statics.field1032[var167][var182 - 1][var168] & var164) != 0) {
                                var182--;
                            }
                            while (var183 < 104 && (Statics.field1032[var167][var183 + 1][var168] & var164) != 0) {
                                var183++;
                            }
                            label697: while (var184 > 0) {
                                for (int var186 = var182; var186 <= var183; var186++) {
                                    if ((Statics.field1032[var184 - 1][var186][var168] & var164) == 0) {
                                        break label697;
                                    }
                                }
                                var184--;
                            }
                            label686: while (var185 < var166) {
                                for (int var187 = var182; var187 <= var183; var187++) {
                                    if ((Statics.field1032[var185 + 1][var187][var168] & var164) == 0) {
                                        break label686;
                                    }
                                }
                                var185++;
                            }
                            int var188 = (var185 + 1 - var184) * (var183 - var182 + 1);
                            if (var188 >= 8) {
                                short var189 = 240;
                                int var190 = class65.field533[var185][var182][var168] - var189;
                                int var191 = class65.field533[var184][var182][var168];
                                class143.method2909(var166, 2, var182 * 128, var183 * 128 + 128, var168 * 128, var168 * 128, var190, var191);
                                for (int var192 = var184; var192 <= var185; var192++) {
                                    for (int var193 = var182; var193 <= var183; var193++) {
                                        Statics.field1032[var192][var193][var168] &= ~var164;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1032[var167][var169][var168] & var165) != 0) {
                            int var194 = var169;
                            int var195 = var169;
                            int var196 = var168;
                            int var197 = var168;
                            while (var196 > 0 && (Statics.field1032[var167][var169][var196 - 1] & var165) != 0) {
                                var196--;
                            }
                            while (var197 < 104 && (Statics.field1032[var167][var169][var197 + 1] & var165) != 0) {
                                var197++;
                            }
                            label750: while (var194 > 0) {
                                for (int var198 = var196; var198 <= var197; var198++) {
                                    if ((Statics.field1032[var167][var194 - 1][var198] & var165) == 0) {
                                        break label750;
                                    }
                                }
                                var194--;
                            }
                            label739: while (var195 < 104) {
                                for (int var199 = var196; var199 <= var197; var199++) {
                                    if ((Statics.field1032[var167][var195 + 1][var199] & var165) == 0) {
                                        break label739;
                                    }
                                }
                                var195++;
                            }
                            if ((var195 - var194 + 1) * (var197 - var196 + 1) >= 4) {
                                int var200 = class65.field533[var167][var194][var196];
                                class143.method2909(var166, 4, var194 * 128, var195 * 128 + 128, var196 * 128, var197 * 128 + 128, var200, var200);
                                for (int var201 = var194; var201 <= var195; var201++) {
                                    for (int var202 = var196; var202 <= var197; var202++) {
                                        Statics.field1032[var167][var201][var202] &= ~var165;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method5049(true);
        int var203 = class65.field523;
        if (var203 > Statics.field1576) {
            var203 = Statics.field1576;
        }
        if (var203 < Statics.field1576 - 1) {
            int var204 = Statics.field1576 - 1;
        }
        if (field675) {
            Statics.field2011.method2983(class65.field523);
        } else {
            Statics.field2011.method2983(0);
        }
        for (int var205 = 0; var205 < 104; var205++) {
            for (int var206 = 0; var206 < 104; var206++) {
                Statics.method548(var205, var206);
            }
        }
        method4752();
        for (class78 var207 = (class78) field803.method4651(); var207 != null; var207 = (class78) field803.method4656()) {
            if (var207.field954 == -1) {
                var207.field962 = 0;
                method3456(var207);
            } else {
                var207.method3388();
            }
        }
        class264.field3407.method3130();
        if (Statics.field170.method853()) {
            class197 var208 = class197.method3184(class193.field2298, field721.field1340);
            var208.field2375.method5213(1057001181);
            field721.method2161(var208);
        }
        if (!field733) {
            int var209 = (Statics.field329 - 6) / 8;
            int var210 = (Statics.field329 + 6) / 8;
            int var211 = (Statics.field105 - 6) / 8;
            int var212 = (Statics.field105 + 6) / 8;
            for (int var213 = var209 - 1; var213 <= var210 + 1; var213++) {
                for (int var214 = var211 - 1; var214 <= var212 + 1; var214++) {
                    if (var213 < var209 || var213 > var210 || var214 < var211 || var214 > var212) {
                        Statics.field200.method3901("m" + var213 + "_" + var214);
                        Statics.field200.method3901("l" + var213 + "_" + var214);
                    }
                }
            }
        }
        method1727(30);
        method4752();
        class65.method3094();
        class197 var215 = class197.method3184(class193.field2327, field721.field1340);
        field721.method2161(var215);
        class63.method3528();
    }

    @ObfuscatedName("ky.gy(IIIIIB)V")
    public static final void method5156(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field2011.method3084(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field2011.method2935(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L;
            if (var11) {
                boolean var12 = (int) (var5 >>> 16 & 0x1L) == 1;
                var11 = !var12;
            }
            if (var11) {
                var10 = arg4;
            }
            int[] var14 = Statics.field12.field3896;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class138.method3443(var5);
            class264 var17 = class264.method752(var16);
            if (var17.field3410 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 1) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
            } else {
                class334 var18 = Statics.field2022[var17.field3410];
                if (var18 != null) {
                    int var19 = (var17.field3396 * 4 - var18.field3886) / 2;
                    int var20 = (var17.field3397 * 4 - var18.field3888) / 2;
                    var18.method5771(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3397) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field2011.method2933(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field2011.method2935(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class138.method3443(var21);
            class264 var27 = class264.method752(var26);
            if (var27.field3410 != -1) {
                class334 var28 = Statics.field2022[var27.field3410];
                if (var28 != null) {
                    int var29 = (var27.field3396 * 4 - var28.field3886) / 2;
                    int var30 = (var27.field3397 * 4 - var28.field3888) / 2;
                    var28.method5771(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3397) * 4 + 48 + var30);
                }
            } else if (var25 == 9) {
                int var31 = 15658734;
                boolean var32 = var21 != 0L;
                if (var32) {
                    boolean var33 = (int) (var21 >>> 16 & 0x1L) == 1;
                    var32 = !var33;
                }
                if (var32) {
                    var31 = 15597568;
                }
                int[] var35 = Statics.field12.field3896;
                int var36 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var24 == 0 || var24 == 2) {
                    var35[var36 + 1536] = var31;
                    var35[var36 + 1024 + 1] = var31;
                    var35[var36 + 512 + 2] = var31;
                    var35[var36 + 3] = var31;
                } else {
                    var35[var36] = var31;
                    var35[var36 + 512 + 1] = var31;
                    var35[var36 + 1024 + 2] = var31;
                    var35[var36 + 1536 + 3] = var31;
                }
            }
        }
        long var37 = Statics.field2011.method2931(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class138.method3443(var37);
        class264 var40 = class264.method752(var39);
        if (var40.field3410 == -1) {
            return;
        }
        class334 var41 = Statics.field2022[var40.field3410];
        if (var41 != null) {
            int var42 = (var40.field3396 * 4 - var41.field3886) / 2;
            int var43 = (var40.field3397 * 4 - var41.field3888) / 2;
            var41.method5771(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3397) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.gt(Ldx;B)Z")
    public final boolean method1578(class105 arg0) {
        class315 var2 = arg0.method2165();
        class309 var3 = arg0.field1345;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1346 == null) {
                if (arg0.field1348) {
                    if (!var2.method3301(1)) {
                        return false;
                    }
                    var2.method3302(arg0.field1345.field3736, 0, 1);
                    arg0.field1349 = 0;
                    arg0.field1348 = false;
                }
                var3.field3734 = 0;
                if (var3.method5167()) {
                    if (!var2.method3301(1)) {
                        return false;
                    }
                    var2.method3302(arg0.field1345.field3736, 1, 1);
                    arg0.field1349 = 0;
                }
                arg0.field1348 = true;
                class192[] var4 = class192.method4286();
                int var5 = var3.method5168();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3734);
                }
                arg0.field1346 = var4[var5];
                arg0.field1347 = arg0.field1346.field2193;
            }
            if (arg0.field1347 == -1) {
                if (!var2.method3301(1)) {
                    return false;
                }
                arg0.method2165().method3302(var3.field3736, 0, 1);
                arg0.field1347 = var3.field3736[0] & 0xFF;
            }
            if (arg0.field1347 == -2) {
                if (!var2.method3301(2)) {
                    return false;
                }
                arg0.method2165().method3302(var3.field3736, 0, 2);
                var3.field3734 = 0;
                arg0.field1347 = var3.method5283();
            }
            if (!var2.method3301(arg0.field1347)) {
                return false;
            }
            var3.field3734 = 0;
            var2.method3302(var3.field3736, 0, arg0.field1347);
            arg0.field1349 = 0;
            field725.method4726();
            arg0.field1343 = arg0.field1352;
            arg0.field1352 = arg0.field1351;
            arg0.field1351 = arg0.field1346;
            if (class192.field2164 == arg0.field1346) {
                field918 = false;
                for (int var6 = 0; var6 < 5; var6++) {
                    field919[var6] = false;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2215 == arg0.field1346) {
                Statics.field2418.method1730(var3, arg0.field1347);
                field867 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1346) {
                String var7 = var3.method5236();
                long var8 = (long) var3.method5283();
                long var10 = (long) var3.method5231();
                class239 var12 = (class239) class205.method3095(Statics.method4263(), var3.method5227());
                long var13 = (var8 << 32) + var10;
                boolean var15 = false;
                for (int var16 = 0; var16 < 100; var16++) {
                    if (field893[var16] == var13) {
                        var15 = true;
                        break;
                    }
                }
                if (Statics.field2418.method1735(new class293(var7, Statics.field2368))) {
                    var15 = true;
                }
                if (!var15 && field788 == 0) {
                    field893[field731] = var13;
                    field731 = (field731 + 1) % 100;
                    String var17 = class306.method5069(class301.method2617(class220.method1950(var3)));
                    byte var18;
                    if (var12.field3119) {
                        var18 = 7;
                    } else {
                        var18 = 3;
                    }
                    if (var12.field3123 == -1) {
                        class101.method1815(var18, var7, var17);
                    } else {
                        class101.method1815(var18, class91.method534(var12.field3123) + var7, var17);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2154 == arg0.field1346) {
                Statics.field1056 = class320.method1064(var3.method5227());
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2207 == arg0.field1346) {
                for (int var19 = 0; var19 < class222.field2562.length; var19++) {
                    if (class222.field2562[var19] != class222.field2561[var19]) {
                        class222.field2562[var19] = class222.field2561[var19];
                        method273(var19);
                        field860[++field861 - 1 & 0x1F] = var19;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1346) {
                method18(true, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2236 == arg0.field1346) {
                String var20 = var3.method5236();
                String var21 = class306.method5069(class301.method2617(class220.method1950(var3)));
                class101.method1815(6, var20, var21);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1346) {
                int var22 = var3.method5276();
                int var23 = var3.method5377();
                class227 var24 = class227.method403(var22);
                if (var24.field2646 != 2 || var24.field2594 != var23) {
                    var24.field2646 = 2;
                    var24.field2594 = var23;
                    method3872(var24);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2158 == arg0.field1346) {
                String var25 = var3.method5236();
                Object[] var26 = new Object[var25.length() + 1];
                for (int var27 = var25.length() - 1; var27 >= 0; var27--) {
                    if (var25.charAt(var27) == 's') {
                        var26[var27 + 1] = var3.method5236();
                    } else {
                        var26[var27 + 1] = Integer.valueOf(var3.method5209());
                    }
                }
                var26[0] = Integer.valueOf(var3.method5209());
                class72 var28 = new class72();
                var28.field600 = var26;
                class86.method1066(var28);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2183 == arg0.field1346) {
                Statics.field2418.field1090.method4807(var3, arg0.field1347);
                method398();
                field867 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2205 == arg0.field1346) {
                int var29 = var3.method5265();
                if (var29 == 65535) {
                    var29 = -1;
                }
                method3193(var29);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1346) {
                int var30 = var3.method5267();
                if (var30 == 65535) {
                    var30 = -1;
                }
                int var31 = var3.method5271();
                method1081(var30, var31);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1346) {
                int var32 = var3.method5227();
                method3584(var32);
                arg0.field1346 = null;
                return false;
            }
            if (class192.field2210 == arg0.field1346) {
                for (int var33 = 0; var33 < Statics.field3240; var33++) {
                    class251 var34 = class251.method3701(var33);
                    if (var34 != null) {
                        class222.field2561[var33] = 0;
                        class222.field2562[var33] = 0;
                    }
                }
                method5460();
                field861 += 32;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1346) {
                field689 = var3.method5283() * 30;
                field871 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2156 == arg0.field1346) {
                method5460();
                int var35 = var3.method5258();
                int var36 = var3.method5275();
                int var37 = var3.method5446();
                field808[var37] = var36;
                field806[var37] = var35;
                field807[var37] = 1;
                for (int var38 = 0; var38 < 98; var38++) {
                    if (var36 >= class231.field2782[var38]) {
                        field807[var37] = var38 + 2;
                    }
                }
                field736[++field832 - 1 & 0x1F] = var37;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1346) {
                method1085();
                arg0.field1346 = null;
                return false;
            }
            if (class192.field2218 == arg0.field1346) {
                String var39 = var3.method5236();
                long var40 = var3.method5233();
                long var42 = (long) var3.method5283();
                long var44 = (long) var3.method5231();
                class239 var46 = (class239) class205.method3095(Statics.method4263(), var3.method5227());
                long var47 = (var42 << 32) + var44;
                boolean var49 = false;
                for (int var50 = 0; var50 < 100; var50++) {
                    if (field893[var50] == var47) {
                        var49 = true;
                        break;
                    }
                }
                if (var46.field3128 && Statics.field2418.method1735(new class293(var39, Statics.field2368))) {
                    var49 = true;
                }
                if (!var49 && field788 == 0) {
                    field893[field731] = var47;
                    field731 = (field731 + 1) % 100;
                    String var51 = class306.method5069(class301.method2617(class220.method1950(var3)));
                    if (var46.field3123 == -1) {
                        class101.method541(9, var39, var51, class299.method205(var40));
                    } else {
                        class101.method541(9, class91.method534(var46.field3123) + var39, var51, class299.method205(var40));
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2206 == arg0.field1346) {
                method539(class195.field2363);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1346) {
                int var52 = var3.method5377();
                int var53 = var3.method5276();
                int var54 = var3.method5283();
                class227 var55 = class227.method403(var53);
                var55.field2659 = (var54 << 16) + var52;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2199 == arg0.field1346) {
                class81 var56 = new class81();
                var56.field1055 = var3.method5236();
                var56.field1047 = var3.method5283();
                int var57 = var3.method5209();
                var56.field1048 = var57;
                method1727(45);
                var2.method3322();
                Object var58 = null;
                class95.method4946(var56);
                arg0.field1346 = null;
                return false;
            }
            if (class192.field2202 == arg0.field1346) {
                int var59 = var3.method5277();
                int var60 = var3.method5283();
                class227 var61 = class227.method403(var59);
                if (var61 != null && var61.field2605 == 0) {
                    if (var60 > var61.field2627 - var61.field2619) {
                        var60 = var61.field2627 - var61.field2619;
                    }
                    if (var60 < 0) {
                        var60 = 0;
                    }
                    if (var61.field2625 != var60) {
                        var61.field2625 = var60;
                        method3872(var61);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2239 == arg0.field1346) {
                if (Statics.field1085 != null) {
                    Statics.field1085.method4949(var3);
                }
                Statics.method3103();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1346) {
                method5460();
                field742 = var3.method5227();
                field871 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1346) {
                int var62 = var3.method5227();
                int var63 = var3.method5377();
                int var64 = var3.method5277();
                class71 var65 = (class71) field835.method5641((long) var64);
                if (var65 != null) {
                    Statics.method543(var65, var65.field585 != var63);
                }
                method409(var64, var63, var62);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2162 == arg0.field1346) {
                int var66 = var3.method5227();
                if (var3.method5227() == 0) {
                    field941[var66] = new class19();
                    var3.field3734 += 18;
                } else {
                    var3.field3734--;
                    field941[var66] = new class19(var3, false);
                }
                field819 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2238 == arg0.field1346) {
                int var67 = var3.method5395();
                boolean var68 = var3.method5227() == 1;
                String var69 = "";
                boolean var70 = false;
                if (var68) {
                    var69 = var3.method5236();
                    if (Statics.field2418.method1735(new class293(var69, Statics.field2368))) {
                        var70 = true;
                    }
                }
                String var71 = var3.method5236();
                if (!var70) {
                    class101.method1815(var67, var69, var71);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2197 == arg0.field1346) {
                int var72 = var3.method5277();
                int var73 = var3.method5267();
                class222.field2561[var73] = var72;
                if (class222.field2562[var73] != var72) {
                    class222.field2562[var73] = var72;
                }
                method273(var73);
                field860[++field861 - 1 & 0x1F] = var73;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1346) {
                int var74 = var3.method5377();
                class69.method1714(var74);
                field914[++field879 - 1 & 0x1F] = var74 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2155 == arg0.field1346) {
                int var75 = var3.method5283();
                int var76 = var3.method5227();
                int var77 = var3.method5283();
                method569(var75, var76, var77);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2235 == arg0.field1346) {
                int var78 = var3.method5227();
                int var79 = var3.method5227();
                int var80 = var3.method5227();
                int var81 = var3.method5227();
                field919[var78] = true;
                field920[var78] = var79;
                field776[var78] = var80;
                field779[var78] = var81;
                field923[var78] = 0;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2229 == arg0.field1346) {
                int var82 = var3.method5277();
                int var83 = var3.method5265();
                class227 var84 = class227.method403(var82);
                if (var84.field2646 != 1 || var84.field2594 != var83) {
                    var84.field2646 = 1;
                    var84.field2594 = var83;
                    method3872(var84);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2224 == arg0.field1346) {
                method77(true, arg0.field1345);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2233 == arg0.field1346) {
                int var85 = var3.method5276();
                int var86 = var3.method5283();
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = var3.method5265();
                if (var87 == 65535) {
                    var87 = -1;
                }
                int var88 = var3.method5275();
                for (int var89 = var86; var89 <= var87; var89++) {
                    long var90 = ((long) var85 << 32) + (long) var89;
                    class190 var92 = field876.method5641(var90);
                    if (var92 != null) {
                        var92.method3388();
                    }
                    field876.method5643(new class189(var88), var90);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2225 == arg0.field1346) {
                field918 = true;
                Statics.field436 = var3.method5227();
                Statics.field43 = var3.method5227();
                Statics.field2447 = var3.method5283();
                Statics.field3868 = var3.method5227();
                Statics.field330 = var3.method5227();
                if (Statics.field330 >= 100) {
                    int var93 = Statics.field436 * 128 + 64;
                    int var94 = Statics.field43 * 128 + 64;
                    int var95 = method3439(var93, var94, Statics.field1576) - Statics.field2447;
                    int var96 = var93 - Statics.field513;
                    int var97 = var95 - Statics.field390;
                    int var98 = var94 - Statics.field1118;
                    int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                    Statics.field1819 = (int) (Math.atan2((double) var97, (double) var99) * 325.949D) & 0x7FF;
                    Statics.field439 = (int) (Math.atan2((double) var96, (double) var98) * -325.949D) & 0x7FF;
                    if (Statics.field1819 < 128) {
                        Statics.field1819 = 128;
                    }
                    if (Statics.field1819 > 383) {
                        Statics.field1819 = 383;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1346) {
                boolean var100 = var3.method5234();
                if (!var100) {
                    Statics.field3586 = null;
                } else if (Statics.field3586 == null) {
                    Statics.field3586 = new class248();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2219 == arg0.field1346) {
                int var101 = var3.method5209();
                int var102 = var3.method5377();
                if (var102 == 65535) {
                    var102 = -1;
                }
                int var103 = var3.method5276();
                class227 var104 = class227.method403(var101);
                if (var104.field2602) {
                    var104.field2729 = var102;
                    var104.field2726 = var103;
                    class265 var106 = class265.method4218(var102);
                    var104.field2654 = var106.field3448;
                    var104.field2655 = var106.field3461;
                    var104.field2656 = var106.field3449;
                    var104.field2652 = var106.field3451;
                    var104.field2647 = var106.field3452;
                    var104.field2739 = var106.field3447;
                    if (var106.field3439 == 1) {
                        var104.field2662 = 1;
                    } else {
                        var104.field2662 = 2;
                    }
                    if (var104.field2658 > 0) {
                        var104.field2739 = var104.field2739 * 32 / var104.field2658;
                    } else if (var104.field2614 > 0) {
                        var104.field2739 = var104.field2739 * 32 / var104.field2614;
                    }
                    method3872(var104);
                } else if (var102 == -1) {
                    var104.field2646 = 0;
                    arg0.field1346 = null;
                    return true;
                } else {
                    class265 var105 = class265.method4218(var102);
                    var104.field2646 = 4;
                    var104.field2594 = var102;
                    var104.field2654 = var105.field3448;
                    var104.field2655 = var105.field3461;
                    var104.field2739 = var105.field3447 * 100 / var103;
                    method3872(var104);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1346) {
                int var107 = var3.method5227();
                String var108 = var3.method5236();
                int var109 = var3.method5227();
                if (var109 >= 1 && var109 <= 8) {
                    if (var108.equalsIgnoreCase(class234.field2799)) {
                        var108 = null;
                    }
                    field764[var109 - 1] = var108;
                    field799[var109 - 1] = var107 == 0;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2230 == arg0.field1346) {
                int var110 = arg0.field1347 + var3.field3734;
                int var111 = var3.method5283();
                int var112 = var3.method5283();
                if (field834 != var111) {
                    field834 = var111;
                    this.method1200(false);
                    method700(field834);
                    class86.method3183(field834);
                    for (int var113 = 0; var113 < 100; var113++) {
                        field814[var113] = true;
                    }
                }
                while (var112-- > 0) {
                    int var114 = var3.method5209();
                    int var115 = var3.method5283();
                    int var116 = var3.method5227();
                    class71 var117 = (class71) field835.method5641((long) var114);
                    if (var117 != null && var117.field585 != var115) {
                        Statics.method543(var117, true);
                        var117 = null;
                    }
                    if (var117 == null) {
                        var117 = method409(var114, var115, var116);
                    }
                    var117.field588 = true;
                }
                for (class71 var118 = (class71) field835.method5644(); var118 != null; var118 = (class71) field835.method5642()) {
                    if (var118.field588) {
                        var118.field588 = false;
                    } else {
                        Statics.method543(var118, true);
                    }
                }
                field876 = new class328(512);
                while (var3.field3734 < var110) {
                    int var119 = var3.method5209();
                    int var120 = var3.method5283();
                    int var121 = var3.method5283();
                    int var122 = var3.method5209();
                    for (int var123 = var120; var123 <= var121; var123++) {
                        long var124 = ((long) var119 << 32) + (long) var123;
                        field876.method5643(new class189(var122), var124);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1346) {
                int var126 = var3.method5275();
                int var127 = var3.method5269();
                int var128 = var3.method5268();
                class227 var129 = class227.method403(var126);
                if (var129.field2612 != var127 || var129.field2613 != var128 || var129.field2608 != 0 || var129.field2609 != 0) {
                    var129.field2612 = var127;
                    var129.field2613 = var128;
                    var129.field2608 = 0;
                    var129.field2609 = 0;
                    method3872(var129);
                    this.method1201(var129);
                    if (var129.field2605 == 0) {
                        method240(Statics.field2595[var126 >> 16], var129, false);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2169 == arg0.field1346) {
                method539(class195.field2362);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2221 == arg0.field1346) {
                Statics.field2418.method1787();
                field867 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2214 == arg0.field1346) {
                method539(class195.field2360);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1346) {
                int var130 = var3.method5209();
                if (field837 != var130) {
                    field837 = var130;
                    method218();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2217 == arg0.field1346) {
                method539(class195.field2355);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1346) {
                method5460();
                field842 = var3.method5241();
                field871 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2223 == arg0.field1346) {
                int var131 = var3.method5209();
                int var132 = var3.method5209();
                int var133 = class63.method4091();
                class197 var134 = class197.method3184(class193.field2324, field721.field1340);
                var134.field2375.method5254(field471);
                var134.field2375.method5347(var133);
                var134.field2375.method5272(var131);
                var134.field2375.method5274(var132);
                field721.method2161(var134);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2157 == arg0.field1346) {
                method539(class195.field2356);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1346) {
                int var135 = var3.method5209();
                int var136 = var3.method5283();
                if (var135 < -70000) {
                    var136 += 32768;
                }
                class227 var137;
                if (var135 >= 0) {
                    var137 = class227.method403(var135);
                } else {
                    var137 = null;
                }
                if (var137 != null) {
                    for (int var138 = 0; var138 < var137.field2707.length; var138++) {
                        var137.field2707[var138] = 0;
                        var137.field2728[var138] = 0;
                    }
                }
                class69.method2393(var136);
                int var139 = var3.method5283();
                for (int var140 = 0; var140 < var139; var140++) {
                    int var141 = var3.method5227();
                    if (var141 == 255) {
                        var141 = var3.method5275();
                    }
                    int var142 = var3.method5265();
                    if (var137 != null && var140 < var137.field2707.length) {
                        var137.field2707[var140] = var142;
                        var137.field2728[var140] = var141;
                    }
                    class69.method401(var136, var140, var142 - 1, var141);
                }
                if (var137 != null) {
                    method3872(var137);
                }
                method5460();
                field914[++field879 - 1 & 0x1F] = var136 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1346) {
                byte[] var143 = new byte[arg0.field1347];
                var3.method5190(var143, 0, var143.length);
                class310 var144 = new class310(var143);
                String var145 = var144.method5236();
                class61.method279(var145, true, false);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1346) {
                method539(class195.field2359);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1346) {
                if (arg0.field1347 == 0) {
                    Statics.field1085 = null;
                } else {
                    if (Statics.field1085 == null) {
                        Statics.field1085 = new class295(Statics.field2368, Statics.field170);
                    }
                    Statics.field1085.method4952(var3);
                }
                Statics.method3103();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1346) {
                Statics.field639 = var3.method5258();
                Statics.field303 = var3.method5258();
                for (int var146 = Statics.field639; var146 < Statics.field639 + 8; var146++) {
                    for (int var147 = Statics.field303; var147 < Statics.field303 + 8; var147++) {
                        if (field802[Statics.field1576][var146][var147] != null) {
                            field802[Statics.field1576][var146][var147] = null;
                            Statics.method548(var146, var147);
                        }
                    }
                }
                for (class78 var148 = (class78) field803.method4651(); var148 != null; var148 = (class78) field803.method4656()) {
                    if (var148.field953 >= Statics.field639 && var148.field953 < Statics.field639 + 8 && var148.field955 >= Statics.field303 && var148.field955 < Statics.field303 + 8 && Statics.field1576 == var148.field956) {
                        var148.field954 = 0;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2212 == arg0.field1346) {
                int var149 = var3.method5275();
                class227 var150 = class227.method403(var149);
                for (int var151 = 0; var151 < var150.field2707.length; var151++) {
                    var150.field2707[var151] = -1;
                    var150.field2707[var151] = 0;
                }
                method3872(var150);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2213 == arg0.field1346) {
                class99.method801(var3, arg0.field1347);
                method5046();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2241 == arg0.field1346) {
                field690 = var3.method5227();
                if (field690 == 1) {
                    field927 = var3.method5283();
                }
                if (field690 >= 2 && field690 <= 6) {
                    if (field690 == 2) {
                        field674 = 64;
                        field710 = 64;
                    }
                    if (field690 == 3) {
                        field674 = 0;
                        field710 = 64;
                    }
                    if (field690 == 4) {
                        field674 = 128;
                        field710 = 64;
                    }
                    if (field690 == 5) {
                        field674 = 64;
                        field710 = 0;
                    }
                    if (field690 == 6) {
                        field674 = 64;
                        field710 = 128;
                    }
                    field690 = 2;
                    field780 = var3.method5283();
                    field762 = var3.method5283();
                    field798 = var3.method5227();
                }
                if (field690 == 10) {
                    field868 = var3.method5283();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2231 == arg0.field1346) {
                int var152 = var3.method5209();
                int var153 = var3.method5265();
                int var154 = var153 >> 10 & 0x1F;
                int var155 = var153 >> 5 & 0x1F;
                int var156 = var153 & 0x1F;
                int var157 = (var156 << 3) + (var154 << 19) + (var155 << 11);
                class227 var158 = class227.method403(var152);
                if (var158.field2628 != var157) {
                    var158.field2628 = var157;
                    method3872(var158);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2216 == arg0.field1346) {
                int var159 = var3.method5209();
                int var160 = var3.method5275();
                class71 var161 = (class71) field835.method5641((long) var160);
                class71 var162 = (class71) field835.method5641((long) var159);
                if (var162 != null) {
                    Statics.method543(var162, var161 == null || var161.field585 != var162.field585);
                }
                if (var161 != null) {
                    var161.method3388();
                    field835.method5643(var161, (long) var159);
                }
                class227 var163 = class227.method403(var160);
                if (var163 != null) {
                    method3872(var163);
                }
                class227 var164 = class227.method403(var159);
                if (var164 != null) {
                    method3872(var164);
                    method240(Statics.field2595[var164.field2617 >>> 16], var164, true);
                }
                if (field834 != -1) {
                    method3447(field834, 1);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2232 == arg0.field1346) {
                method539(class195.field2364);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2227 == arg0.field1346) {
                int var165 = var3.method5277();
                int var166 = var3.method5241();
                class227 var167 = class227.method403(var165);
                if (var167.field2650 != var166 || var166 == -1) {
                    var167.field2650 = var166;
                    var167.field2731 = 0;
                    var167.field2732 = 0;
                    method3872(var167);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1346) {
                int var168 = var3.method5209();
                class71 var169 = (class71) field835.method5641((long) var168);
                if (var169 != null) {
                    Statics.method543(var169, true);
                }
                if (field840 != null) {
                    method3872(field840);
                    field840 = null;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1346) {
                byte var170 = var3.method5261();
                int var171 = var3.method5283();
                class222.field2561[var171] = var170;
                if (class222.field2562[var171] != var170) {
                    class222.field2562[var171] = var170;
                }
                method273(var171);
                field860[++field861 - 1 & 0x1F] = var171;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2220 == arg0.field1346) {
                int var172 = var3.method5267();
                field834 = var172;
                this.method1200(false);
                method700(var172);
                class86.method3183(field834);
                for (int var173 = 0; var173 < 100; var173++) {
                    field814[var173] = true;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1346) {
                int var174 = var3.method5227();
                method216(var174);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1346) {
                Statics.field303 = var3.method5446();
                Statics.field639 = var3.method5227();
                while (var3.field3734 < arg0.field1347) {
                    int var175 = var3.method5227();
                    class195 var176 = class195.method3878()[var175];
                    method539(var176);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1346) {
                class106.method5613(var3, arg0.field1347);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1346) {
                method3201(var3.method5236());
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1346) {
                method539(class195.field2358);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2222 == arg0.field1346) {
                field894 = var3.method5227();
                field903 = var3.method5256();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1346) {
                method539(class195.field2354);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2211 == arg0.field1346) {
                boolean var177 = var3.method5256() == 1;
                int var178 = var3.method5275();
                class227 var179 = class227.method403(var178);
                if (var179.field2721 != var177) {
                    var179.field2721 = var177;
                    method3872(var179);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1346) {
                field751 = var3.method5227();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2165 == arg0.field1346) {
                method539(class195.field2361);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2228 == arg0.field1346) {
                for (int var180 = 0; var180 < field790.length; var180++) {
                    if (field790[var180] != null) {
                        field790[var180].field992 = -1;
                    }
                }
                for (int var181 = 0; var181 < field716.length; var181++) {
                    if (field716[var181] != null) {
                        field716[var181].field992 = -1;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1346) {
                field904 = var3.method5227();
                if (field904 == 255) {
                    field904 = 0;
                }
                field769 = var3.method5227();
                if (field769 == 255) {
                    field769 = 0;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2226 == arg0.field1346) {
                if (field834 != -1) {
                    method3447(field834, 0);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1346) {
                var3.field3734 += 28;
                if (var3.method5252()) {
                    method185(var3, var3.field3734 - 28);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2209 == arg0.field1346) {
                int var182 = var3.method5276();
                String var183 = var3.method5236();
                class227 var184 = class227.method403(var182);
                if (!var183.equals(var184.field2687)) {
                    var184.field2687 = var183;
                    method3872(var184);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2208 == arg0.field1346) {
                int var185 = var3.method5283();
                int var186 = var3.method5377();
                int var187 = var3.method5377();
                int var188 = var3.method5277();
                class227 var189 = class227.method403(var188);
                if (var189.field2654 != var186 || var189.field2655 != var187 || var189.field2739 != var185) {
                    var189.field2654 = var186;
                    var189.field2655 = var187;
                    var189.field2739 = var185;
                    method3872(var189);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2234 == arg0.field1346) {
                boolean var190 = var3.method5227() == 1;
                if (var190) {
                    Statics.field1140 = class307.method3253() - var3.method5233();
                    Statics.field144 = new class16(var3, true);
                } else {
                    Statics.field144 = null;
                }
                field870 = field859;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1346) {
                Statics.field639 = var3.method5446();
                Statics.field303 = var3.method5256();
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2237 == arg0.field1346) {
                method18(false, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2203 == arg0.field1346) {
                field918 = true;
                Statics.field2421 = var3.method5227();
                Statics.field349 = var3.method5227();
                Statics.field276 = var3.method5283();
                Statics.field123 = var3.method5227();
                Statics.field605 = var3.method5227();
                if (Statics.field605 >= 100) {
                    Statics.field513 = Statics.field2421 * 128 + 64;
                    Statics.field1118 = Statics.field349 * 128 + 64;
                    Statics.field390 = method3439(Statics.field513, Statics.field1118, Statics.field1576) - Statics.field276;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2198 == arg0.field1346) {
                int var191 = var3.method5276();
                class227 var192 = class227.method403(var191);
                var192.field2646 = 3;
                var192.field2594 = Statics.field455.field635.method3742();
                method3872(var192);
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1346) {
                int var193 = var3.method5209();
                int var194 = var3.method5283();
                if (var193 < -70000) {
                    var194 += 32768;
                }
                class227 var195;
                if (var193 >= 0) {
                    var195 = class227.method403(var193);
                } else {
                    var195 = null;
                }
                while (var3.field3734 < arg0.field1347) {
                    int var196 = var3.method5395();
                    int var197 = var3.method5283();
                    int var198 = 0;
                    if (var197 != 0) {
                        var198 = var3.method5227();
                        if (var198 == 255) {
                            var198 = var3.method5209();
                        }
                    }
                    if (var195 != null && var196 >= 0 && var196 < var195.field2707.length) {
                        var195.field2707[var196] = var197;
                        var195.field2728[var196] = var198;
                    }
                    class69.method401(var194, var196, var197 - 1, var198);
                }
                if (var195 != null) {
                    method3872(var195);
                }
                method5460();
                field914[++field879 - 1 & 0x1F] = var194 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1346) {
                method77(false, arg0.field1345);
                arg0.field1346 = null;
                return true;
            }
            class351.method3425("" + (arg0.field1346 == null ? -1 : arg0.field1346.field2240) + class91.field1171 + (arg0.field1352 == null ? -1 : arg0.field1352.field2240) + class91.field1171 + (arg0.field1343 == null ? -1 : arg0.field1343.field2240) + class91.field1171 + arg0.field1347, (Throwable) null);
            method1085();
        } catch (IOException var203) {
            method3362();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1346 == null ? -1 : arg0.field1346.field2240) + class91.field1171 + (arg0.field1352 == null ? -1 : arg0.field1352.field2240) + class91.field1171 + (arg0.field1343 == null ? -1 : arg0.field1343.field2240) + class91.field1171 + arg0.field1347 + class91.field1171 + (Statics.field2130 + Statics.field455.field1020[0]) + class91.field1171 + (Statics.field1275 + Statics.field455.field1021[0]) + class91.field1171;
            for (int var202 = 0; var202 < arg0.field1347 && var202 < 50; var202++) {
                var201 = var201 + var3.field3736[var202] + class91.field1171;
            }
            class351.method3425(var201, var204);
            method1085();
        }
        return true;
    }

    @ObfuscatedName("al.gk(Lgl;I)V")
    public static final void method539(class195 arg0) {
        class309 var1 = field721.field1345;
        if (class195.field2359 == arg0) {
            int var2 = var1.method5267();
            byte var3 = var1.method5261();
            int var4 = var1.method5265();
            int var5 = var1.method5258();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field735[var6];
            int var9 = var1.method5446();
            int var10 = (var9 >> 4 & 0x7) + Statics.field639;
            int var11 = (var9 & 0x7) + Statics.field303;
            byte var12 = var1.method5261();
            int var13 = var1.method5267();
            byte var14 = var1.method5240();
            int var15 = var1.method5377();
            byte var16 = var1.method5260();
            class76 var17;
            if (field791 == var2) {
                var17 = Statics.field455;
            } else {
                var17 = field790[var2];
            }
            if (var17 != null) {
                class264 var18 = class264.method752(var15);
                int var19;
                int var20;
                if (var7 == 1 || var7 == 3) {
                    var19 = var18.field3397;
                    var20 = var18.field3396;
                } else {
                    var19 = var18.field3396;
                    var20 = var18.field3397;
                }
                int var21 = (var19 >> 1) + var10;
                int var22 = (var19 + 1 >> 1) + var10;
                int var23 = (var20 >> 1) + var11;
                int var24 = (var20 + 1 >> 1) + var11;
                int[][] var25 = class65.field533[Statics.field1576];
                int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
                int var27 = (var10 << 7) + (var19 << 6);
                int var28 = (var11 << 7) + (var20 << 6);
                class137 var29 = var18.method4358(var6, var7, var25, var27, var26, var28);
                if (var29 != null) {
                    method2033(Statics.field1576, var10, var11, var8, -1, 0, 0, var13 + 1, var4 + 1);
                    var17.field643 = field671 + var13;
                    var17.field644 = field671 + var4;
                    var17.field659 = var29;
                    var17.field662 = var10 * 128 + var19 * 64;
                    var17.field654 = var11 * 128 + var20 * 64;
                    var17.field648 = var26;
                    if (var16 > var3) {
                        byte var30 = var16;
                        var16 = var3;
                        var3 = var30;
                    }
                    if (var12 > var14) {
                        byte var31 = var12;
                        var12 = var14;
                        var14 = var31;
                    }
                    var17.field649 = var10 + var16;
                    var17.field651 = var3 + var10;
                    var17.field650 = var11 + var12;
                    var17.field652 = var11 + var14;
                }
            }
        }
        if (class195.field2358 == arg0) {
            int var32 = var1.method5265();
            int var33 = var1.method5265();
            int var34 = var1.method5446();
            int var35 = (var34 >> 4 & 0x7) + Statics.field639;
            int var36 = (var34 & 0x7) + Statics.field303;
            int var37 = var1.method5256();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                int var38 = var35 * 128 + 64;
                int var39 = var36 * 128 + 64;
                class87 var40 = new class87(var33, Statics.field1576, var38, var39, method3439(var38, var39, Statics.field1576) - var37, var32, field671);
                field805.method4644(var40);
            }
        } else if (class195.field2356 == arg0) {
            int var41 = var1.method5227();
            int var42 = (var41 >> 4 & 0x7) + Statics.field639;
            int var43 = (var41 & 0x7) + Statics.field303;
            int var44 = var1.method5377();
            int var45 = var1.method5256();
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = field735[var46];
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                method2033(Statics.field1576, var42, var43, var48, var44, var46, var47, 0, -1);
            }
        } else if (class195.field2362 == arg0) {
            int var49 = var1.method5258();
            int var50 = (var49 >> 4 & 0x7) + Statics.field639;
            int var51 = (var49 & 0x7) + Statics.field303;
            int var52 = var1.method5265();
            int var53 = var1.method5227();
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = field735[var54];
            if (var50 >= 0 && var51 >= 0 && var50 < 103 && var51 < 103) {
                if (var56 == 0) {
                    class146 var57 = Statics.field2011.method2927(Statics.field1576, var50, var51);
                    if (var57 != null) {
                        int var58 = class138.method3443(var57.field1906);
                        if (var54 == 2) {
                            var57.field1904 = new class103(var58, 2, var55 + 4, Statics.field1576, var50, var51, var52, false, var57.field1904);
                            var57.field1901 = new class103(var58, 2, var55 + 1 & 0x3, Statics.field1576, var50, var51, var52, false, var57.field1901);
                        } else {
                            var57.field1904 = new class103(var58, var54, var55, Statics.field1576, var50, var51, var52, false, var57.field1904);
                        }
                    }
                }
                if (var56 == 1) {
                    class151 var59 = Statics.field2011.method2928(Statics.field1576, var50, var51);
                    if (var59 != null) {
                        int var60 = class138.method3443(var59.field1947);
                        if (var54 == 4 || var54 == 5) {
                            var59.field1945 = new class103(var60, 4, var55, Statics.field1576, var50, var51, var52, false, var59.field1945);
                        } else if (var54 == 6) {
                            var59.field1945 = new class103(var60, 4, var55 + 4, Statics.field1576, var50, var51, var52, false, var59.field1945);
                        } else if (var54 == 7) {
                            var59.field1945 = new class103(var60, 4, (var55 + 2 & 0x3) + 4, Statics.field1576, var50, var51, var52, false, var59.field1945);
                        } else if (var54 == 8) {
                            var59.field1945 = new class103(var60, 4, var55 + 4, Statics.field1576, var50, var51, var52, false, var59.field1945);
                            var59.field1946 = new class103(var60, 4, (var55 + 2 & 0x3) + 4, Statics.field1576, var50, var51, var52, false, var59.field1946);
                        }
                    }
                }
                if (var56 == 2) {
                    class152 var61 = Statics.field2011.method2929(Statics.field1576, var50, var51);
                    if (var54 == 11) {
                        var54 = 10;
                    }
                    if (var61 != null) {
                        var61.field1954 = new class103(class138.method3443(var61.field1962), var54, var55, Statics.field1576, var50, var51, var52, false, var61.field1954);
                    }
                }
                if (var56 == 3) {
                    class133 var62 = Statics.field2011.method2930(Statics.field1576, var50, var51);
                    if (var62 != null) {
                        var62.field1643 = new class103(class138.method3443(var62.field1644), 22, var55, Statics.field1576, var50, var51, var52, false, var62.field1643);
                    }
                }
            }
        } else if (class195.field2354 == arg0) {
            int var63 = var1.method5256();
            int var64 = (var63 >> 4 & 0x7) + Statics.field639;
            int var65 = (var63 & 0x7) + Statics.field303;
            int var66 = var1.method5256();
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = field735[var67];
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                method2033(Statics.field1576, var64, var65, var69, -1, var67, var68, 0, -1);
            }
        } else if (class195.field2355 == arg0) {
            int var70 = var1.method5227();
            int var71 = (var70 >> 4 & 0x7) + Statics.field639;
            int var72 = (var70 & 0x7) + Statics.field303;
            int var73 = var1.method5283();
            int var74 = var1.method5377();
            int var75 = var1.method5377();
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                class272 var76 = field802[Statics.field1576][var71][var72];
                if (var76 != null) {
                    for (class97 var77 = (class97) var76.method4651(); var77 != null; var77 = (class97) var76.method4656()) {
                        if ((var75 & 0x7FFF) == var77.field1267 && var77.field1265 == var74) {
                            var77.field1265 = var73;
                            break;
                        }
                    }
                    Statics.method548(var71, var72);
                }
            }
        } else if (class195.field2360 == arg0) {
            int var78 = var1.method5267();
            int var79 = var1.method5227();
            int var80 = (var79 >> 4 & 0x7) + Statics.field639;
            int var81 = (var79 & 0x7) + Statics.field303;
            int var82 = var1.method5283();
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                class97 var83 = new class97();
                var83.field1267 = var82;
                var83.field1265 = var78;
                if (field802[Statics.field1576][var80][var81] == null) {
                    field802[Statics.field1576][var80][var81] = new class272();
                }
                field802[Statics.field1576][var80][var81].method4644(var83);
                Statics.method548(var80, var81);
            }
        } else if (class195.field2361 == arg0) {
            int var84 = var1.method5256();
            int var85 = (var84 >> 4 & 0x7) + Statics.field639;
            int var86 = (var84 & 0x7) + Statics.field303;
            byte var87 = var1.method5240();
            int var88 = var1.method5256() * 4;
            int var89 = var1.method5269();
            int var90 = var1.method5265();
            int var91 = var1.method5283();
            int var92 = var1.method5283();
            int var93 = var1.method5258();
            int var94 = var1.method5227() * 4;
            int var95 = var1.method5258();
            byte var96 = var1.method5228();
            int var97 = var85 + var96;
            int var98 = var86 + var87;
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var92 != 65535) {
                int var99 = var85 * 128 + 64;
                int var100 = var86 * 128 + 64;
                int var101 = var97 * 128 + 64;
                int var102 = var98 * 128 + 64;
                class96 var103 = new class96(var92, Statics.field1576, var99, var100, method3439(var99, var100, Statics.field1576) - var94, field671 + var91, field671 + var90, var95, var93, var89, var88);
                var103.method2024(var101, var102, method3439(var101, var102, Statics.field1576) - var88, field671 + var91);
                field804.method4644(var103);
            }
        } else if (class195.field2364 == arg0) {
            int var104 = var1.method5227();
            int var105 = (var104 >> 4 & 0x7) + Statics.field639;
            int var106 = (var104 & 0x7) + Statics.field303;
            int var107 = var1.method5265();
            if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                class272 var108 = field802[Statics.field1576][var105][var106];
                if (var108 != null) {
                    for (class97 var109 = (class97) var108.method4651(); var109 != null; var109 = (class97) var108.method4656()) {
                        if ((var107 & 0x7FFF) == var109.field1267) {
                            var109.method3388();
                            break;
                        }
                    }
                    if (var108.method4651() == null) {
                        field802[Statics.field1576][var105][var106] = null;
                    }
                    Statics.method548(var105, var106);
                }
            }
        } else if (class195.field2363 == arg0) {
            int var110 = var1.method5256();
            int var111 = var110 >> 4 & 0xF;
            int var112 = var110 & 0x7;
            int var113 = var1.method5377();
            int var114 = var1.method5258();
            int var115 = (var114 >> 4 & 0x7) + Statics.field639;
            int var116 = (var114 & 0x7) + Statics.field303;
            int var117 = var1.method5256();
            if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                int var118 = var111 + 1;
                if (Statics.field455.field1020[0] >= var115 - var118 && Statics.field455.field1020[0] <= var115 + var118 && Statics.field455.field1021[0] >= var116 - var118 && Statics.field455.field1021[0] <= var116 + var118 && field911 != 0 && var112 > 0 && field912 < 50) {
                    field913[field912] = var113;
                    field777[field912] = var112;
                    field877[field912] = var117;
                    field917[field912] = null;
                    field916[field912] = (var115 << 16) + (var116 << 8) + var111;
                    field912++;
                }
            }
        }
    }

    @ObfuscatedName("cf.gp(IIIIIIIIII)V")
    public static final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field803.method4651(); var10 != null; var10 = (class78) field803.method4656()) {
            if (var10.field956 == arg0 && var10.field953 == arg1 && var10.field955 == arg2 && var10.field952 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field956 = arg0;
            var9.field952 = arg3;
            var9.field953 = arg1;
            var9.field955 = arg2;
            method3456(var9);
            field803.method4644(var9);
        }
        var9.field959 = arg4;
        var9.field963 = arg5;
        var9.field960 = arg6;
        var9.field962 = arg7;
        var9.field954 = arg8;
    }

    @ObfuscatedName("gp.gs(Lbt;I)V")
    public static final void method3456(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field952 == 0) {
            var1 = Statics.field2011.method3084(arg0.field956, arg0.field953, arg0.field955);
        }
        if (arg0.field952 == 1) {
            var1 = Statics.field2011.method2932(arg0.field956, arg0.field953, arg0.field955);
        }
        if (arg0.field952 == 2) {
            var1 = Statics.field2011.method2933(arg0.field956, arg0.field953, arg0.field955);
        }
        if (arg0.field952 == 3) {
            var1 = Statics.field2011.method2931(arg0.field956, arg0.field953, arg0.field955);
        }
        if (var1 != 0L) {
            int var6 = Statics.field2011.method2935(arg0.field956, arg0.field953, arg0.field955, var1);
            var3 = class138.method3443(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field961 = var3;
        arg0.field958 = var4;
        arg0.field957 = var5;
    }

    @ObfuscatedName("eg.gw(I)V")
    public static final void method3100() {
        for (class78 var0 = (class78) field803.method4651(); var0 != null; var0 = (class78) field803.method4656()) {
            if (var0.field954 > 0) {
                var0.field954--;
            }
            if (var0.field954 == 0) {
                if (var0.field961 >= 0) {
                    int var1 = var0.field961;
                    int var2 = var0.field958;
                    class264 var3 = class264.method752(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4355(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method10(var0.field956, var0.field952, var0.field953, var0.field955, var0.field961, var0.field957, var0.field958);
                var0.method3388();
            } else {
                if (var0.field962 > 0) {
                    var0.field962--;
                }
                if (var0.field962 == 0 && var0.field953 >= 1 && var0.field955 >= 1 && var0.field953 <= 102 && var0.field955 <= 102 && (var0.field959 < 0 || class65.method73(var0.field959, var0.field963))) {
                    method10(var0.field956, var0.field952, var0.field953, var0.field955, var0.field959, var0.field960, var0.field963);
                    var0.field962 = -1;
                    if (var0.field961 == var0.field959 && var0.field961 == -1) {
                        var0.method3388();
                    } else if (var0.field961 == var0.field959 && var0.field960 == var0.field957 && var0.field963 == var0.field958) {
                        var0.method3388();
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.hm(IIIIIIII)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field675 && Statics.field1576 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field2011.method3084(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2011.method2932(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2011.method2933(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2011.method2931(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field2011.method2935(arg0, arg2, arg3, var7);
            int var13 = class138.method3443(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2011.method2923(arg0, arg2, arg3);
                class264 var16 = class264.method752(var13);
                if (var16.field3386 != 0) {
                    field732[arg0].method3357(arg2, arg3, var14, var15, var16.field3399);
                }
            }
            if (arg1 == 1) {
                Statics.field2011.method2924(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2011.method3062(arg0, arg2, arg3);
                class264 var17 = class264.method752(var13);
                if (var17.field3396 + arg2 > 103 || var17.field3396 + arg3 > 103 || var17.field3397 + arg2 > 103 || var17.field3397 + arg3 > 103) {
                    return;
                }
                if (var17.field3386 != 0) {
                    field732[arg0].method3356(arg2, arg3, var17.field3396, var17.field3397, var15, var17.field3399);
                }
            }
            if (arg1 == 3) {
                Statics.field2011.method2926(arg0, arg2, arg3);
                class264 var18 = class264.method752(var13);
                if (var18.field3386 == 1) {
                    field732[arg0].method3344(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field522[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class143 var20 = Statics.field2011;
        class182 var21 = field732[arg0];
        class264 var22 = class264.method752(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3397;
            var24 = var22.field3396;
        } else {
            var23 = var22.field3396;
            var24 = var22.field3397;
        }
        int var25;
        int var26;
        if (arg2 + var23 <= 104) {
            var25 = (var23 >> 1) + arg2;
            var26 = (var23 + 1 >> 1) + arg2;
        } else {
            var25 = arg2;
            var26 = arg2 + 1;
        }
        int var27;
        int var28;
        if (arg3 + var24 <= 104) {
            var27 = (var24 >> 1) + arg3;
            var28 = (var24 + 1 >> 1) + arg3;
        } else {
            var27 = arg3;
            var28 = arg3 + 1;
        }
        int[][] var29 = class65.field533[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class138.method3462(arg2, arg3, 2, var22.field3400 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3421 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class145 var36;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var36 = var22.method4358(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class103(arg4, 22, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method2912(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3386 == 1) {
                var21.method3347(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var62;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var62 = var22.method4358(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class103(arg4, 10, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            if (var62 != null) {
                var20.method3070(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3386 != 0) {
                var21.method3336(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 >= 12) {
            class145 var37;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var37 = var22.method4358(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3070(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3386 != 0) {
                var21.method3336(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 == 0) {
            class145 var38;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var38 = var22.method4358(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class103(arg4, 0, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var38, (class145) null, class65.field528[arg5], 0, var33, var35);
            if (var22.field3386 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 1) {
            class145 var39;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var39 = var22.method4358(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class103(arg4, 1, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var39, (class145) null, class65.field529[arg5], 0, var33, var35);
            if (var22.field3386 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class145 var41;
            class145 var42;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var41 = var22.method4358(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4358(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class103(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3384, true, (class145) null);
                var42 = new class103(arg4, 2, var40, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var41, var42, class65.field528[arg5], class65.field528[var40], var33, var35);
            if (var22.field3386 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 3) {
            class145 var43;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var43 = var22.method4358(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class103(arg4, 3, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var43, (class145) null, class65.field529[arg5], 0, var33, var35);
            if (var22.field3386 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 9) {
            class145 var44;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var44 = var22.method4358(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3070(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3386 != 0) {
                var21.method3336(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 == 4) {
            class145 var45;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var45 = var22.method4358(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3068(arg0, arg2, arg3, var30, var45, (class145) null, class65.field528[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3084(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class264.method752(class138.method3443(var47)).field3405;
            }
            class145 var49;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var49 = var22.method4358(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3068(arg0, arg2, arg3, var30, var49, (class145) null, class65.field528[arg5], 0, class65.field524[arg5] * var46, class65.field530[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3084(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class264.method752(class138.method3443(var51)).field3405 / 2;
            }
            class145 var53;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var53 = var22.method4358(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3068(arg0, arg2, arg3, var30, var53, (class145) null, 256, arg5, class65.field532[arg5] * var50, class65.field534[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class145 var55;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var55 = var22.method4358(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class103(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3068(arg0, arg2, arg3, var30, var55, (class145) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3084(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class264.method752(class138.method3443(var57)).field3405 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class145 var60;
            class145 var61;
            if (var22.field3384 == -1 && var22.field3422 == null) {
                var60 = var22.method4358(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4358(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3384, true, (class145) null);
                var61 = new class103(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3384, true, (class145) null);
            }
            var20.method3068(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class65.field532[arg5] * var56, class65.field534[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("q.hi(ZLkb;I)V")
    public static final void method18(boolean arg0, class309 arg1) {
        field688 = 0;
        field719 = 0;
        method4890();
        while (arg1.method5195(field721.field1347) >= 27) {
            int var2 = arg1.method5171(15);
            if (var2 == 32767) {
                break;
            }
            boolean var6 = false;
            if (field716[var2] == null) {
                field716[var2] = new class89();
                var6 = true;
            }
            class89 var7 = field716[var2];
            field875[++field717 - 1] = var2;
            var7.field1014 = field671;
            int var8 = field800[arg1.method5171(3)];
            if (var6) {
                var7.field1016 = var7.field966 = var8;
            }
            int var9 = arg1.method5171(1);
            int var10 = arg1.method5171(1);
            if (var10 == 1) {
                field720[++field719 - 1] = var2;
            }
            var7.field1158 = class267.method3880(arg1.method5171(14));
            int var11;
            if (arg0) {
                var11 = arg1.method5171(8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = arg1.method5171(5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12;
            if (arg0) {
                var12 = arg1.method5171(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = arg1.method5171(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var7.field968 = var7.field1158.field3500;
            var7.field1018 = var7.field1158.field3523;
            if (var7.field1018 == 0) {
                var7.field966 = 0;
            }
            var7.field973 = var7.field1158.field3506;
            var7.field1013 = var7.field1158.field3494;
            var7.field975 = var7.field1158.field3502;
            var7.field978 = var7.field1158.field3509;
            var7.field970 = var7.field1158.field3503;
            var7.field971 = var7.field1158.field3504;
            var7.field964 = var7.field1158.field3496;
            var7.method1942(Statics.field455.field1020[0] + var12, Statics.field455.field1021[0] + var11, var9 == 1);
        }
        arg1.method5172();
        method3093(arg1);
        for (int var3 = 0; var3 < field688; var3++) {
            int var4 = field908[var3];
            if (field671 != field716[var4].field1014) {
                field716[var4].field1158 = null;
                field716[var4] = null;
            }
        }
        if (field721.field1347 != arg1.field3734) {
            throw new RuntimeException(arg1.field3734 + class91.field1171 + field721.field1347);
        }
        for (int var5 = 0; var5 < field717; var5++) {
            if (field716[field875[var5]] == null) {
                throw new RuntimeException(var5 + class91.field1171 + field717);
            }
        }
    }

    @ObfuscatedName("ku.hj(I)V")
    public static final void method4890() {
        class309 var0 = field721.field1345;
        var0.method5170();
        int var1 = var0.method5171(8);
        if (var1 < field717) {
            for (int var2 = var1; var2 < field717; var2++) {
                field908[++field688 - 1] = field875[var2];
            }
        }
        if (var1 > field717) {
            throw new RuntimeException("");
        }
        field717 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field875[var3];
            class89 var5 = field716[var4];
            int var6 = var0.method5171(1);
            if (var6 == 0) {
                field875[++field717 - 1] = var4;
                var5.field1014 = field671;
            } else {
                int var7 = var0.method5171(2);
                if (var7 == 0) {
                    field875[++field717 - 1] = var4;
                    var5.field1014 = field671;
                    field720[++field719 - 1] = var4;
                } else if (var7 == 1) {
                    field875[++field717 - 1] = var4;
                    var5.field1014 = field671;
                    int var8 = var0.method5171(3);
                    var5.method1944(var8, (byte) 1);
                    int var9 = var0.method5171(1);
                    if (var9 == 1) {
                        field720[++field719 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field875[++field717 - 1] = var4;
                    var5.field1014 = field671;
                    int var10 = var0.method5171(3);
                    var5.method1944(var10, (byte) 2);
                    int var11 = var0.method5171(3);
                    var5.method1944(var11, (byte) 2);
                    int var12 = var0.method5171(1);
                    if (var12 == 1) {
                        field720[++field719 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field908[++field688 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ez.hz(Lkb;I)V")
    public static final void method3093(class309 arg0) {
        for (int var1 = 0; var1 < field719; var1++) {
            int var2 = field720[var1];
            class89 var3 = field716[var2];
            int var4 = arg0.method5227();
            if ((var4 & 0x80) != 0) {
                int var5 = arg0.method5265();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method5256();
                if (var3.field992 == var5 && var5 != -1) {
                    int var7 = class269.method3330(var5).field3562;
                    if (var7 == 1) {
                        var3.field998 = 0;
                        var3.field999 = 0;
                        var3.field1000 = var6;
                        var3.field1001 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1001 = 0;
                    }
                } else if (var5 == -1 || var3.field992 == -1 || class269.method3330(var5).field3544 >= class269.method3330(var3.field992).field3544) {
                    var3.field992 = var5;
                    var3.field998 = 0;
                    var3.field999 = 0;
                    var3.field1000 = var6;
                    var3.field1001 = 0;
                    var3.field1024 = var3.field976;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var8 = arg0.method5283();
                int var9 = arg0.method5265();
                int var10 = var3.field983 - (var8 - Statics.field2130 - Statics.field2130) * 64;
                int var11 = var3.field965 - (var9 - Statics.field1275 - Statics.field1275) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field993 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field996 = arg0.method5261();
                var3.field1009 = arg0.method5228();
                var3.field1008 = arg0.method5228();
                var3.field1010 = arg0.method5261();
                var3.field967 = arg0.method5267() + field671;
                var3.field1012 = arg0.method5265() + field671;
                var3.field1007 = arg0.method5283();
                var3.field976 = 1;
                var3.field1024 = 0;
                var3.field996 += var3.field1020[0];
                var3.field1009 += var3.field1021[0];
                var3.field1008 += var3.field1020[0];
                var3.field1010 += var3.field1021[0];
            }
            if ((var4 & 0x1) != 0) {
                int var12 = arg0.method5258();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method5395();
                        if (var17 == 32767) {
                            var17 = arg0.method5395();
                            var15 = arg0.method5395();
                            var14 = arg0.method5395();
                            var16 = arg0.method5395();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method5395();
                        }
                        int var18 = arg0.method5395();
                        var3.method1620(var17, var15, var14, var16, field671, var18);
                    }
                }
                int var19 = arg0.method5227();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method5395();
                        int var22 = arg0.method5395();
                        if (var22 == 32767) {
                            var3.method1618(var21);
                        } else {
                            int var23 = arg0.method5395();
                            int var24 = arg0.method5227();
                            int var25 = var22 > 0 ? arg0.method5227() : var24;
                            var3.method1631(var21, field671, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field972 = arg0.method5236();
                var3.field981 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1158 = class267.method3880(arg0.method5267());
                var3.field968 = var3.field1158.field3500;
                var3.field1018 = var3.field1158.field3523;
                var3.field973 = var3.field1158.field3506;
                var3.field1013 = var3.field1158.field3494;
                var3.field975 = var3.field1158.field3502;
                var3.field978 = var3.field1158.field3509;
                var3.field970 = var3.field1158.field3503;
                var3.field971 = var3.field1158.field3504;
                var3.field964 = var3.field1158.field3496;
            }
            if ((var4 & 0x8) != 0) {
                var3.field991 = arg0.method5283();
                if (var3.field991 == 65535) {
                    var3.field991 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1002 = arg0.method5267();
                int var26 = arg0.method5277();
                var3.field1006 = var26 >> 16;
                var3.field988 = (var26 & 0xFFFF) + field671;
                var3.field974 = 0;
                var3.field1004 = 0;
                if (var3.field988 > field671) {
                    var3.field974 = -1;
                }
                if (var3.field1002 == 65535) {
                    var3.field1002 = -1;
                }
            }
        }
    }

    @ObfuscatedName("bs.ha(Lby;IIBI)V")
    public static final void method1116(class76 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1020[0];
        int var5 = arg0.field1021[0];
        int var6 = arg0.method1130();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class183.method2023(var4, var5, arg0.method1130(), Statics.method709(arg1, arg2), field732[arg0.field656], true, field948, field949);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1134(field948[var8], field949[var8], arg3);
            }
        }
    }

    @ObfuscatedName("ke.hk(I)V")
    public static void method5039() {
        field811 = 0;
        field703 = false;
        field822[0] = class234.field3040;
        field924[0] = "";
        field775[0] = 1006;
        field818[0] = false;
        field811 = 1;
    }

    @ObfuscatedName("aj.hy(B)V")
    public static final void method697() {
        int var0 = Statics.field204;
        int var1 = Statics.field1916;
        int var2 = Statics.field580;
        int var3 = Statics.field630;
        int var4 = 6116423;
        class331.method5686(var0, var1, var2, var3, var4);
        class331.method5686(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class331.method5690(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field94.method5070(class234.field2948, var0 + 3, var1 + 14, var4, -1);
        int var5 = class64.field508;
        int var6 = class64.field498;
        for (int var7 = 0; var7 < field811; var7++) {
            int var8 = (field811 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class305 var10 = Statics.field94;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field924[var7].length() > 0) {
                var11 = field822[var7] + class234.field2955 + field924[var7];
            } else {
                var11 = field822[var7];
            }
            var10.method5070(var11, var0 + 3, var8, var9, 0);
        }
        method214(Statics.field204, Statics.field1916, Statics.field580, Statics.field630);
    }

    @ObfuscatedName("o.hn(IIIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field727; var4++) {
            if (field909[var4] + field888[var4] > arg0 && field888[var4] < arg0 + arg2 && field883[var4] + field801[var4] > arg1 && field883[var4] < arg1 + arg3) {
                field814[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.he(IIIII)V")
    public static final void method214(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field727; var4++) {
            if (field909[var4] + field888[var4] > arg0 && field888[var4] < arg0 + arg2 && field883[var4] + field801[var4] > arg1 && field883[var4] < arg1 + arg3) {
                field880[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hr(I)V")
    public final void method1197() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field811 - 1; var2++) {
                if (field775[var2] < 1000 && field775[var2 + 1] > 1000) {
                    String var3 = field924[var2];
                    field924[var2] = field924[var2 + 1];
                    field924[var2 + 1] = var3;
                    String var4 = field822[var2];
                    field822[var2] = field822[var2 + 1];
                    field822[var2 + 1] = var4;
                    int var5 = field775[var2];
                    field775[var2] = field775[var2 + 1];
                    field775[var2 + 1] = var5;
                    int var6 = field812[var2];
                    field812[var2] = field812[var2 + 1];
                    field812[var2 + 1] = var6;
                    int var7 = field813[var2];
                    field813[var2] = field813[var2 + 1];
                    field813[var2 + 1] = var7;
                    int var8 = field815[var2];
                    field815[var2] = field815[var2 + 1];
                    field815[var2 + 1] = var8;
                    boolean var9 = field818[var2];
                    field818[var2] = field818[var2 + 1];
                    field818[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field403 != null || field847 != null) {
            return;
        }
        int var10 = class64.field515;
        if (field703) {
            if (var10 != 1 && (Statics.field556 || var10 != 4)) {
                int var11 = class64.field508;
                int var12 = class64.field498;
                if (var11 < Statics.field204 - 10 || var11 > Statics.field580 + Statics.field204 + 10 || var12 < Statics.field1916 - 10 || var12 > Statics.field630 + Statics.field1916 + 10) {
                    field703 = false;
                    method8(Statics.field204, Statics.field1916, Statics.field580, Statics.field630);
                }
            }
            if (var10 == 1 || !Statics.field556 && var10 == 4) {
                int var13 = Statics.field204;
                int var14 = Statics.field1916;
                int var15 = Statics.field580;
                int var16 = class64.field505;
                int var17 = class64.field504;
                int var18 = -1;
                for (int var19 = 0; var19 < field811; var19++) {
                    int var20 = (field811 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    Statics.method126(var18);
                }
                field703 = false;
                method8(Statics.field204, Statics.field1916, Statics.field580, Statics.field630);
            }
            return;
        }
        int var21 = method3114();
        if ((var10 == 1 || !Statics.field556 && var10 == 4) && var21 >= 0) {
            int var22 = field775[var21];
            if (var22 == 39 || var22 == 40 || var22 == 41 || var22 == 42 || var22 == 43 || var22 == 33 || var22 == 34 || var22 == 35 || var22 == 36 || var22 == 37 || var22 == 38 || var22 == 1005) {
                label208: {
                    int var23 = field812[var21];
                    int var24 = field813[var21];
                    class227 var25 = class227.method403(var24);
                    int var26 = method728(var25);
                    boolean var27 = (var26 >> 28 & 0x1) != 0;
                    if (!var27) {
                        class228 var10000 = (class228) null;
                        if (!class228.method2032(method728(var25))) {
                            break label208;
                        }
                    }
                    if (Statics.field403 != null && !field786 && field811 > 0 && !this.method1216()) {
                        int var28 = field783;
                        int var29 = field784;
                        method1037(Statics.field2028, var28, var29);
                        Statics.field2028 = null;
                    }
                    field786 = false;
                    field787 = 0;
                    if (Statics.field403 != null) {
                        method3872(Statics.field403);
                    }
                    Statics.field403 = class227.method403(var24);
                    field782 = var23;
                    field783 = class64.field505;
                    field784 = class64.field504;
                    if (var21 >= 0) {
                        method551(var21);
                    }
                    method3872(Statics.field403);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field556 && var10 == 4) && this.method1216()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field556 && var10 == 4) && field811 > 0) {
            Statics.method126(var21);
        }
        if (var10 == 2 && field811 > 0) {
            this.method1540(class64.field505, class64.field504);
        }
    }

    @ObfuscatedName("client.hh(I)Z")
    public final boolean method1216() {
        int var1 = method3114();
        return (field673 == 1 && field811 > 2 || method70(var1)) && !field818[var1];
    }

    @ObfuscatedName("client.ht(IIB)V")
    public final void method1540(int arg0, int arg1) {
        method696(arg0, arg1);
        Statics.field2011.method3043(Statics.field1576, arg0, arg1, false);
        field703 = true;
    }

    @ObfuscatedName("au.hg(III)V")
    public static void method696(int arg0, int arg1) {
        int var2 = Statics.field94.method5065(class234.field2948);
        for (int var3 = 0; var3 < field811; var3++) {
            class305 var4 = Statics.field94;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field924[var3].length() > 0) {
                var5 = field822[var3] + class234.field2955 + field924[var3];
            } else {
                var5 = field822[var3];
            }
            int var6 = var4.method5065(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field811 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1299) {
            var8 = Statics.field1299 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field397) {
            var9 = Statics.field397 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field204 = var8;
        Statics.field1916 = var9;
        Statics.field580 = var2;
        Statics.field630 = field811 * 15 + 22;
    }

    @ObfuscatedName("u.hv(II)Z")
    public static final boolean method70(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field775[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bm.hw(Lcu;III)V")
    public static final void method1037(class92 arg0, int arg1, int arg2) {
        method257(arg0.field1183, arg0.field1185, arg0.field1182, arg0.field1184, arg0.field1186, arg0.field1186, arg1, arg2);
    }

    @ObfuscatedName("ao.hd(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1004) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            class197 var8 = class197.method3184(class193.field2250, field721.field1340);
            var8.field2375.method5263(arg3);
            field721.method2161(var8);
        }
        if (arg2 == 23) {
            if (field703) {
                Statics.field2011.method3033();
            } else {
                Statics.field2011.method3043(Statics.field1576, arg0, arg1, true);
            }
        }
        if (arg2 == 35) {
            class197 var9 = class197.method3184(class193.field2320, field721.field1340);
            var9.field2375.method5272(arg1);
            var9.field2375.method5387(arg0);
            var9.field2375.method5408(arg3);
            field721.method2161(var9);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 5) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var10 = class197.method3184(class193.field2314, field721.field1340);
            var10.field2375.method5262(Statics.field2130 + arg0);
            var10.field2375.method5262(Statics.field1275 + arg1);
            var10.field2375.method5387(arg3);
            var10.field2375.method5253(class55.field409[82] ? 1 : 0);
            field721.method2161(var10);
        }
        if (arg2 == 51) {
            class76 var11 = field790[arg3];
            if (var11 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var12 = class197.method3184(class193.field2288, field721.field1340);
                var12.field2375.method5254(class55.field409[82] ? 1 : 0);
                var12.field2375.method5387(arg3);
                field721.method2161(var12);
            }
        }
        if (arg2 == 1003) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            class89 var13 = field716[arg3];
            if (var13 != null) {
                class267 var14 = var13.field1158;
                if (var14.field3508 != null) {
                    var14 = var14.method4472();
                }
                if (var14 != null) {
                    class197 var15 = class197.method3184(class193.field2268, field721.field1340);
                    var15.field2375.method5263(var14.field3505);
                    field721.method2161(var15);
                }
            }
        }
        if (arg2 == 6) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var16 = class197.method3184(class193.field2263, field721.field1340);
            var16.field2375.method5263(Statics.field2130 + arg0);
            var16.field2375.method5347(class55.field409[82] ? 1 : 0);
            var16.field2375.method5408(arg3);
            var16.field2375.method5262(Statics.field1275 + arg1);
            field721.method2161(var16);
        }
        if (arg2 == 1005) {
            class227 var17 = class227.method403(arg1);
            if (var17 == null || var17.field2728[arg0] < 100000) {
                class197 var18 = class197.method3184(class193.field2250, field721.field1340);
                var18.field2375.method5263(arg3);
                field721.method2161(var18);
            } else {
                class101.method1815(27, "", var17.field2728[arg0] + " x " + class265.method4218(arg3).field3442);
            }
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 1001) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var19 = class197.method3184(class193.field2341, field721.field1340);
            var19.field2375.method5262(arg3);
            var19.field2375.method5263(Statics.field1275 + arg1);
            var19.field2375.method5387(Statics.field2130 + arg0);
            var19.field2375.method5253(class55.field409[82] ? 1 : 0);
            field721.method2161(var19);
        }
        if (arg2 == 11) {
            class89 var20 = field716[arg3];
            if (var20 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var21 = class197.method3184(class193.field2261, field721.field1340);
                var21.field2375.method5347(class55.field409[82] ? 1 : 0);
                var21.field2375.method5263(arg3);
                field721.method2161(var21);
            }
        }
        if (arg2 == 36) {
            class197 var22 = class197.method3184(class193.field2335, field721.field1340);
            var22.field2375.method5387(arg3);
            var22.field2375.method5373(arg1);
            var22.field2375.method5262(arg0);
            field721.method2161(var22);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 7) {
            class89 var23 = field716[arg3];
            if (var23 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var24 = class197.method3184(class193.field2323, field721.field1340);
                var24.field2375.method5347(class55.field409[82] ? 1 : 0);
                var24.field2375.method5274(Statics.field3628);
                var24.field2375.method5262(arg3);
                var24.field2375.method5263(Statics.field1073);
                var24.field2375.method5263(Statics.field169);
                field721.method2161(var24);
            }
        }
        if (arg2 == 39) {
            class197 var25 = class197.method3184(class193.field2306, field721.field1340);
            var25.field2375.method5373(arg1);
            var25.field2375.method5263(arg3);
            var25.field2375.method5387(arg0);
            field721.method2161(var25);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 15) {
            class76 var26 = field790[arg3];
            if (var26 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var27 = class197.method3184(class193.field2328, field721.field1340);
                var27.field2375.method5263(field830);
                var27.field2375.method5274(Statics.field561);
                var27.field2375.method5408(arg3);
                var27.field2375.method5253(class55.field409[82] ? 1 : 0);
                field721.method2161(var27);
            }
        }
        if (arg2 == 38) {
            method139();
            class227 var28 = class227.method403(arg1);
            field827 = 1;
            Statics.field1073 = arg0;
            Statics.field3628 = arg1;
            Statics.field169 = arg3;
            method3872(var28);
            field828 = class91.method1063(16748608) + class265.method4218(arg3).field3442 + class91.method1063(16777215);
            if (field828 == null) {
                field828 = class234.field2799;
            }
            return;
        }
        if (arg2 == 47) {
            class76 var29 = field790[arg3];
            if (var29 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var30 = class197.method3184(class193.field2262, field721.field1340);
                var30.field2375.method5387(arg3);
                var30.field2375.method5254(class55.field409[82] ? 1 : 0);
                field721.method2161(var30);
            }
        }
        if (arg2 == 8) {
            class89 var31 = field716[arg3];
            if (var31 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var32 = class197.method3184(class193.field2296, field721.field1340);
                var32.field2375.method5253(class55.field409[82] ? 1 : 0);
                var32.field2375.method5213(Statics.field561);
                var32.field2375.method5408(arg3);
                var32.field2375.method5262(field830);
                field721.method2161(var32);
            }
        }
        if (arg2 == 49) {
            class76 var33 = field790[arg3];
            if (var33 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var34 = class197.method3184(class193.field2302, field721.field1340);
                var34.field2375.method5262(arg3);
                var34.field2375.method5254(class55.field409[82] ? 1 : 0);
                field721.method2161(var34);
            }
        }
        if (arg2 == 50) {
            class76 var35 = field790[arg3];
            if (var35 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var36 = class197.method3184(class193.field2338, field721.field1340);
                var36.field2375.method5253(class55.field409[82] ? 1 : 0);
                var36.field2375.method5263(arg3);
                field721.method2161(var36);
            }
        }
        if (arg2 == 17) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var37 = class197.method3184(class193.field2277, field721.field1340);
            var37.field2375.method5263(Statics.field2130 + arg0);
            var37.field2375.method5262(field830);
            var37.field2375.method5437(class55.field409[82] ? 1 : 0);
            var37.field2375.method5408(arg3);
            var37.field2375.method5373(Statics.field561);
            var37.field2375.method5387(Statics.field1275 + arg1);
            field721.method2161(var37);
        }
        if (arg2 == 12) {
            class89 var38 = field716[arg3];
            if (var38 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var39 = class197.method3184(class193.field2318, field721.field1340);
                var39.field2375.method5408(arg3);
                var39.field2375.method5437(class55.field409[82] ? 1 : 0);
                field721.method2161(var39);
            }
        }
        if (arg2 == 1) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var40 = class197.method3184(class193.field2295, field721.field1340);
            var40.field2375.method5262(Statics.field2130 + arg0);
            var40.field2375.method5347(class55.field409[82] ? 1 : 0);
            var40.field2375.method5373(Statics.field3628);
            var40.field2375.method5262(Statics.field1275 + arg1);
            var40.field2375.method5387(Statics.field1073);
            var40.field2375.method5387(Statics.field169);
            var40.field2375.method5263(arg3);
            field721.method2161(var40);
        }
        if (arg2 == 37) {
            class197 var41 = class197.method3184(class193.field2329, field721.field1340);
            var41.field2375.method5263(arg3);
            var41.field2375.method5387(arg0);
            var41.field2375.method5213(arg1);
            field721.method2161(var41);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 3) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var42 = class197.method3184(class193.field2308, field721.field1340);
            var42.field2375.method5263(Statics.field1275 + arg1);
            var42.field2375.method5253(class55.field409[82] ? 1 : 0);
            var42.field2375.method5387(Statics.field2130 + arg0);
            var42.field2375.method5408(arg3);
            field721.method2161(var42);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var43 = class227.method221(arg1, arg0);
            if (var43 != null) {
                method4087(arg3, arg1, arg0, var43.field2729, arg5);
            }
        }
        if (arg2 == 4) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var44 = class197.method3184(class193.field2283, field721.field1340);
            var44.field2375.method5347(class55.field409[82] ? 1 : 0);
            var44.field2375.method5408(Statics.field1275 + arg1);
            var44.field2375.method5263(arg3);
            var44.field2375.method5408(Statics.field2130 + arg0);
            field721.method2161(var44);
        }
        if (arg2 == 30 && field840 == null) {
            method395(arg1, arg0);
            field840 = class227.method221(arg1, arg0);
            method3872(field840);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2754.method6112(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 46) {
            class76 var45 = field790[arg3];
            if (var45 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var46 = class197.method3184(class193.field2251, field721.field1340);
                var46.field2375.method5253(class55.field409[82] ? 1 : 0);
                var46.field2375.method5262(arg3);
                field721.method2161(var46);
            }
        }
        if (arg2 == 26) {
            method3689();
        }
        if (arg2 == 48) {
            class76 var47 = field790[arg3];
            if (var47 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var48 = class197.method3184(class193.field2273, field721.field1340);
                var48.field2375.method5253(class55.field409[82] ? 1 : 0);
                var48.field2375.method5387(arg3);
                field721.method2161(var48);
            }
        }
        if (arg2 == 9) {
            class89 var49 = field716[arg3];
            if (var49 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var50 = class197.method3184(class193.field2275, field721.field1340);
                var50.field2375.method5347(class55.field409[82] ? 1 : 0);
                var50.field2375.method5262(arg3);
                field721.method2161(var50);
            }
        }
        if (arg2 == 40) {
            class197 var51 = class197.method3184(class193.field2345, field721.field1340);
            var51.field2375.method5387(arg3);
            var51.field2375.method5213(arg1);
            var51.field2375.method5408(arg0);
            field721.method2161(var51);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 2) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var52 = class197.method3184(class193.field2260, field721.field1340);
            var52.field2375.method5387(Statics.field2130 + arg0);
            var52.field2375.method5274(Statics.field561);
            var52.field2375.method5437(class55.field409[82] ? 1 : 0);
            var52.field2375.method5263(arg3);
            var52.field2375.method5387(Statics.field1275 + arg1);
            var52.field2375.method5263(field830);
            field721.method2161(var52);
        }
        if (arg2 == 41) {
            class197 var53 = class197.method3184(class193.field2294, field721.field1340);
            var53.field2375.method5213(arg1);
            var53.field2375.method5408(arg3);
            var53.field2375.method5263(arg0);
            field721.method2161(var53);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 33) {
            class197 var54 = class197.method3184(class193.field2249, field721.field1340);
            var54.field2375.method5263(arg3);
            var54.field2375.method5274(arg1);
            var54.field2375.method5387(arg0);
            field721.method2161(var54);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 32) {
            class197 var55 = class197.method3184(class193.field2267, field721.field1340);
            var55.field2375.method5387(arg0);
            var55.field2375.method5274(Statics.field561);
            var55.field2375.method5387(field830);
            var55.field2375.method5262(arg3);
            var55.field2375.method5274(arg1);
            field721.method2161(var55);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 18) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var56 = class197.method3184(class193.field2285, field721.field1340);
            var56.field2375.method5263(Statics.field2130 + arg0);
            var56.field2375.method5387(Statics.field1275 + arg1);
            var56.field2375.method5254(class55.field409[82] ? 1 : 0);
            var56.field2375.method5387(arg3);
            field721.method2161(var56);
        }
        if (arg2 == 10) {
            class89 var57 = field716[arg3];
            if (var57 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var58 = class197.method3184(class193.field2252, field721.field1340);
                var58.field2375.method5254(class55.field409[82] ? 1 : 0);
                var58.field2375.method5387(arg3);
                field721.method2161(var58);
            }
        }
        if (arg2 == 45) {
            class76 var59 = field790[arg3];
            if (var59 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var60 = class197.method3184(class193.field2339, field721.field1340);
                var60.field2375.method5253(class55.field409[82] ? 1 : 0);
                var60.field2375.method5262(arg3);
                field721.method2161(var60);
            }
        }
        if (arg2 == 16) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var61 = class197.method3184(class193.field2242, field721.field1340);
            var61.field2375.method5408(Statics.field169);
            var61.field2375.method5263(arg3);
            var61.field2375.method5263(Statics.field2130 + arg0);
            var61.field2375.method5254(class55.field409[82] ? 1 : 0);
            var61.field2375.method5387(Statics.field1275 + arg1);
            var61.field2375.method5272(Statics.field3628);
            var61.field2375.method5387(Statics.field1073);
            field721.method2161(var61);
        }
        if (arg2 == 24) {
            class227 var62 = class227.method403(arg1);
            boolean var63 = true;
            if (var62.field2607 > 0) {
                var63 = method3254(var62);
            }
            if (var63) {
                class197 var64 = class197.method3184(class193.field2264, field721.field1340);
                var64.field2375.method5213(arg1);
                field721.method2161(var64);
            }
        }
        if (arg2 == 58) {
            class227 var65 = class227.method221(arg1, arg0);
            if (var65 != null) {
                class197 var66 = class197.method3184(class193.field2282, field721.field1340);
                var66.field2375.method5387(field830);
                var66.field2375.method5262(arg0);
                var66.field2375.method5274(arg1);
                var66.field2375.method5373(Statics.field561);
                var66.field2375.method5263(var65.field2729);
                var66.field2375.method5262(field831);
                field721.method2161(var66);
            }
        }
        if (arg2 == 34) {
            class197 var67 = class197.method3184(class193.field2316, field721.field1340);
            var67.field2375.method5373(arg1);
            var67.field2375.method5408(arg0);
            var67.field2375.method5262(arg3);
            field721.method2161(var67);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 14) {
            class76 var68 = field790[arg3];
            if (var68 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var69 = class197.method3184(class193.field2258, field721.field1340);
                var69.field2375.method5437(class55.field409[82] ? 1 : 0);
                var69.field2375.method5262(arg3);
                var69.field2375.method5263(Statics.field169);
                var69.field2375.method5272(Statics.field3628);
                var69.field2375.method5263(Statics.field1073);
                field721.method2161(var69);
            }
        }
        if (arg2 == 1002) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            class197 var70 = class197.method3184(class193.field2303, field721.field1340);
            var70.field2375.method5263(arg3);
            field721.method2161(var70);
        }
        if (arg2 == 43) {
            class197 var71 = class197.method3184(class193.field2253, field721.field1340);
            var71.field2375.method5262(arg3);
            var71.field2375.method5213(arg1);
            var71.field2375.method5408(arg0);
            field721.method2161(var71);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 42) {
            class197 var72 = class197.method3184(class193.field2309, field721.field1340);
            var72.field2375.method5213(arg1);
            var72.field2375.method5263(arg3);
            var72.field2375.method5387(arg0);
            field721.method2161(var72);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 29) {
            class197 var73 = class197.method3184(class193.field2264, field721.field1340);
            var73.field2375.method5213(arg1);
            field721.method2161(var73);
            class227 var74 = class227.method403(arg1);
            if (var74.field2684 != null && var74.field2684[0][0] == 5) {
                int var75 = var74.field2684[0][1];
                if (class222.field2562[var75] != var74.field2621[0]) {
                    class222.field2562[var75] = var74.field2621[0];
                    method273(var75);
                }
            }
        }
        if (arg2 == 25) {
            class227 var76 = class227.method221(arg1, arg0);
            if (var76 != null) {
                method139();
                method1967(arg1, arg0, class228.method540(method728(var76)), var76.field2729);
                field827 = 0;
                field679 = method621(var76);
                if (field679 == null) {
                    field679 = class234.field2799;
                }
                if (var76.field2602) {
                    field922 = var76.field2603 + class91.method1063(16777215);
                } else {
                    field922 = class91.method1063(65280) + var76.field2725 + class91.method1063(16777215);
                }
            }
            return;
        }
        if (arg2 == 22) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var77 = class197.method3184(class193.field2243, field721.field1340);
            var77.field2375.method5347(class55.field409[82] ? 1 : 0);
            var77.field2375.method5262(Statics.field2130 + arg0);
            var77.field2375.method5262(Statics.field1275 + arg1);
            var77.field2375.method5408(arg3);
            field721.method2161(var77);
        }
        if (arg2 == 44) {
            class76 var78 = field790[arg3];
            if (var78 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var79 = class197.method3184(class193.field2272, field721.field1340);
                var79.field2375.method5437(class55.field409[82] ? 1 : 0);
                var79.field2375.method5387(arg3);
                field721.method2161(var79);
            }
        }
        if (arg2 == 19) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var80 = class197.method3184(class193.field2281, field721.field1340);
            var80.field2375.method5408(Statics.field2130 + arg0);
            var80.field2375.method5254(class55.field409[82] ? 1 : 0);
            var80.field2375.method5262(Statics.field1275 + arg1);
            var80.field2375.method5262(arg3);
            field721.method2161(var80);
        }
        if (arg2 == 31) {
            class197 var81 = class197.method3184(class193.field2336, field721.field1340);
            var81.field2375.method5213(arg1);
            var81.field2375.method5263(arg3);
            var81.field2375.method5213(Statics.field3628);
            var81.field2375.method5387(arg0);
            var81.field2375.method5263(Statics.field1073);
            var81.field2375.method5263(Statics.field169);
            field721.method2161(var81);
            field809 = 0;
            Statics.field2357 = class227.method403(arg1);
            field669 = arg0;
        }
        if (arg2 == 28) {
            class197 var82 = class197.method3184(class193.field2264, field721.field1340);
            var82.field2375.method5213(arg1);
            field721.method2161(var82);
            class227 var83 = class227.method403(arg1);
            if (var83.field2684 != null && var83.field2684[0][0] == 5) {
                int var84 = var83.field2684[0][1];
                class222.field2562[var84] = 1 - class222.field2562[var84];
                method273(var84);
            }
        }
        if (arg2 == 20) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var85 = class197.method3184(class193.field2301, field721.field1340);
            var85.field2375.method5262(arg3);
            var85.field2375.method5253(class55.field409[82] ? 1 : 0);
            var85.field2375.method5387(Statics.field1275 + arg1);
            var85.field2375.method5408(Statics.field2130 + arg0);
            field721.method2161(var85);
        }
        if (arg2 == 21) {
            field845 = arg6;
            field694 = arg7;
            field778 = 2;
            field678 = 0;
            field904 = arg0;
            field769 = arg1;
            class197 var86 = class197.method3184(class193.field2297, field721.field1340);
            var86.field2375.method5408(Statics.field2130 + arg0);
            var86.field2375.method5253(class55.field409[82] ? 1 : 0);
            var86.field2375.method5408(Statics.field1275 + arg1);
            var86.field2375.method5263(arg3);
            field721.method2161(var86);
        }
        if (arg2 == 13) {
            class89 var87 = field716[arg3];
            if (var87 != null) {
                field845 = arg6;
                field694 = arg7;
                field778 = 2;
                field678 = 0;
                field904 = arg0;
                field769 = arg1;
                class197 var88 = class197.method3184(class193.field2279, field721.field1340);
                var88.field2375.method5263(arg3);
                var88.field2375.method5437(class55.field409[82] ? 1 : 0);
                field721.method2161(var88);
            }
        }
        if (field827 != 0) {
            field827 = 0;
            method3872(class227.method403(Statics.field3628));
        }
        if (field829) {
            method139();
        }
        if (Statics.field2357 != null && field809 == 0) {
            method3872(Statics.field2357);
        }
    }

    @ObfuscatedName("do.hu(ILjava/lang/String;I)V")
    public static void method2394(int arg0, String arg1) {
        int var2 = class99.field1281;
        int[] var3 = class99.field1282;
        boolean var4 = false;
        class293 var5 = new class293(arg1, Statics.field2368);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field790[var3[var6]];
            if (var7 != null && Statics.field455 != var7 && var7.field658 != null && var7.field658.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method3184(class193.field2272, field721.field1340);
                    var8.field2375.method5437(0);
                    var8.field2375.method5387(var3[var6]);
                    field721.method2161(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method3184(class193.field2262, field721.field1340);
                    var9.field2375.method5387(var3[var6]);
                    var9.field2375.method5254(0);
                    field721.method2161(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method3184(class193.field2302, field721.field1340);
                    var10.field2375.method5262(var3[var6]);
                    var10.field2375.method5254(0);
                    field721.method2161(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method3184(class193.field2338, field721.field1340);
                    var11.field2375.method5253(0);
                    var11.field2375.method5263(var3[var6]);
                    field721.method2161(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class101.method1815(4, "", class234.field3034 + arg1);
        }
    }

    @ObfuscatedName("co.ho(IIIIB)V")
    public static void method1967(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method221(arg0, arg1);
        if (var4 != null && var4.field2700 != null) {
            class72 var5 = new class72();
            var5.field593 = var4;
            var5.field600 = var4.field2700;
            class86.method1066(var5);
        }
        field831 = arg3;
        field829 = true;
        Statics.field561 = arg0;
        field830 = arg1;
        Statics.field261 = arg2;
        method3872(var4);
    }

    @ObfuscatedName("d.hp(I)V")
    public static void method139() {
        if (!field829) {
            return;
        }
        class227 var0 = class227.method221(Statics.field561, field830);
        if (var0 != null && var0.field2701 != null) {
            class72 var1 = new class72();
            var1.field593 = var0;
            var1.field600 = var0.field2701;
            class86.method1066(var1);
        }
        field829 = false;
        method3872(var0);
    }

    @ObfuscatedName("ad.hf(III)V")
    public static void method395(int arg0, int arg1) {
        class197 var2 = class197.method3184(class193.field2289, field721.field1340);
        var2.field2375.method5213(arg0);
        var2.field2375.method5408(arg1);
        field721.method2161(var2);
    }

    @ObfuscatedName("ix.hb(IIIILjava/lang/String;I)V")
    public static void method4087(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method221(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2620 != null) {
            class72 var6 = new class72();
            var6.field593 = var5;
            var6.field597 = arg0;
            var6.field602 = arg4;
            var6.field600 = var5.field2620;
            class86.method1066(var6);
        }
        boolean var7 = true;
        if (var5.field2607 > 0) {
            var7 = method3254(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method728(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class197 var11 = class197.method3184(class193.field2255, field721.field1340);
            var11.field2375.method5213(arg1);
            var11.field2375.method5387(arg2);
            var11.field2375.method5387(arg3);
            field721.method2161(var11);
        }
        if (arg0 == 2) {
            class197 var12 = class197.method3184(class193.field2319, field721.field1340);
            var12.field2375.method5213(arg1);
            var12.field2375.method5387(arg2);
            var12.field2375.method5387(arg3);
            field721.method2161(var12);
        }
        if (arg0 == 3) {
            class197 var13 = class197.method3184(class193.field2276, field721.field1340);
            var13.field2375.method5213(arg1);
            var13.field2375.method5387(arg2);
            var13.field2375.method5387(arg3);
            field721.method2161(var13);
        }
        if (arg0 == 4) {
            class197 var14 = class197.method3184(class193.field2333, field721.field1340);
            var14.field2375.method5213(arg1);
            var14.field2375.method5387(arg2);
            var14.field2375.method5387(arg3);
            field721.method2161(var14);
        }
        if (arg0 == 5) {
            class197 var15 = class197.method3184(class193.field2292, field721.field1340);
            var15.field2375.method5213(arg1);
            var15.field2375.method5387(arg2);
            var15.field2375.method5387(arg3);
            field721.method2161(var15);
        }
        if (arg0 == 6) {
            class197 var16 = class197.method3184(class193.field2321, field721.field1340);
            var16.field2375.method5213(arg1);
            var16.field2375.method5387(arg2);
            var16.field2375.method5387(arg3);
            field721.method2161(var16);
        }
        if (arg0 == 7) {
            class197 var17 = class197.method3184(class193.field2304, field721.field1340);
            var17.field2375.method5213(arg1);
            var17.field2375.method5387(arg2);
            var17.field2375.method5387(arg3);
            field721.method2161(var17);
        }
        if (arg0 == 8) {
            class197 var18 = class197.method3184(class193.field2265, field721.field1340);
            var18.field2375.method5213(arg1);
            var18.field2375.method5387(arg2);
            var18.field2375.method5387(arg3);
            field721.method2161(var18);
        }
        if (arg0 == 9) {
            class197 var19 = class197.method3184(class193.field2310, field721.field1340);
            var19.field2375.method5213(arg1);
            var19.field2375.method5387(arg2);
            var19.field2375.method5387(arg3);
            field721.method2161(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var20 = class197.method3184(class193.field2246, field721.field1340);
        var20.field2375.method5213(arg1);
        var20.field2375.method5387(arg2);
        var20.field2375.method5387(arg3);
        field721.method2161(var20);
    }

    @ObfuscatedName("bs.hc(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method1119(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field703 || field811 >= 500) {
            return;
        }
        field822[field811] = arg0;
        field924[field811] = arg1;
        field775[field811] = arg2;
        field815[field811] = arg3;
        field812[field811] = arg4;
        field813[field811] = arg5;
        field818[field811] = arg6;
        field811++;
    }

    @ObfuscatedName("eh.ia(S)I")
    public static final int method3114() {
        return field811 - 1;
    }

    @ObfuscatedName("aq.im(IIIIB)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3) {
        if (field827 == 0 && !field829) {
            Statics.method1069(class234.field2950, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class138.method317(); var8++) {
            long var9 = class138.method405(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class138.method2375(var8);
                long var12 = class138.field1768[var8];
                int var14 = (int) (var12 >>> 7 & 0x7FL);
                int var16 = var14;
                int var17 = class138.method3245(class138.field1768[var8]);
                int var19 = class138.method19(var8);
                if (var17 == 2 && Statics.field2011.method2935(Statics.field1576, var11, var14, var9) >= 0) {
                    class264 var20 = class264.method752(var19);
                    if (var20.field3422 != null) {
                        var20 = var20.method4361();
                    }
                    if (var20 == null) {
                        continue;
                    }
                    if (field827 == 1) {
                        Statics.method1069(class234.field2945, field828 + " " + class91.field1179 + " " + class91.method1063(65535) + var20.field3418, 1, var19, var11, var14);
                    } else if (!field829) {
                        String[] var21 = var20.field3408;
                        if (var21 != null) {
                            for (int var22 = 4; var22 >= 0; var22--) {
                                if (var21[var22] != null) {
                                    short var23 = 0;
                                    if (var22 == 0) {
                                        var23 = 3;
                                    }
                                    if (var22 == 1) {
                                        var23 = 4;
                                    }
                                    if (var22 == 2) {
                                        var23 = 5;
                                    }
                                    if (var22 == 3) {
                                        var23 = 6;
                                    }
                                    if (var22 == 4) {
                                        var23 = 1001;
                                    }
                                    Statics.method1069(var21[var22], class91.method1063(65535) + var20.field3418, var23, var19, var11, var16);
                                }
                            }
                        }
                        Statics.method1069(class234.field2946, class91.method1063(65535) + var20.field3418, 1002, var20.field3385, var11, var16);
                    } else if ((Statics.field261 & 0x4) == 4) {
                        Statics.method1069(field679, field922 + " " + class91.field1179 + " " + class91.method1063(65535) + var20.field3418, 2, var19, var11, var14);
                    }
                }
                if (var17 == 1) {
                    class89 var24 = field716[var19];
                    if (var24 == null) {
                        continue;
                    }
                    if (var24.field1158.field3500 == 1 && (var24.field983 & 0x7F) == 64 && (var24.field965 & 0x7F) == 64) {
                        for (int var25 = 0; var25 < field717; var25++) {
                            class89 var26 = field716[field875[var25]];
                            if (var26 != null && var24 != var26 && var26.field1158.field3500 == 1 && var24.field983 == var26.field983 && var24.field965 == var26.field965) {
                                method1120(var26.field1158, field875[var25], var11, var16);
                            }
                        }
                        int var27 = class99.field1281;
                        int[] var28 = class99.field1282;
                        for (int var29 = 0; var29 < var27; var29++) {
                            class76 var30 = field790[var28[var29]];
                            if (var30 != null && var24.field983 == var30.field983 && var24.field965 == var30.field965) {
                                method1152(var30, var28[var29], var11, var16);
                            }
                        }
                    }
                    method1120(var24.field1158, var19, var11, var16);
                }
                if (var17 == 0) {
                    class76 var31 = field790[var19];
                    if (var31 == null) {
                        continue;
                    }
                    if ((var31.field983 & 0x7F) == 64 && (var31.field965 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < field717; var32++) {
                            class89 var33 = field716[field875[var32]];
                            if (var33 != null && var33.field1158.field3500 == 1 && var31.field983 == var33.field983 && var31.field965 == var33.field965) {
                                method1120(var33.field1158, field875[var32], var11, var16);
                            }
                        }
                        int var34 = class99.field1281;
                        int[] var35 = class99.field1282;
                        for (int var36 = 0; var36 < var34; var36++) {
                            class76 var37 = field790[var35[var36]];
                            if (var37 != null && var31 != var37 && var31.field983 == var37.field983 && var31.field965 == var37.field965) {
                                method1152(var37, var35[var36], var11, var16);
                            }
                        }
                    }
                    if (field781 == var19) {
                        var4 = var9;
                    } else {
                        method1152(var31, var19, var11, var16);
                    }
                }
                if (var17 == 3) {
                    class272 var38 = field802[Statics.field1576][var11][var16];
                    if (var38 != null) {
                        for (class97 var39 = (class97) var38.method4652(); var39 != null; var39 = (class97) var38.method4654()) {
                            class265 var40 = class265.method4218(var39.field1267);
                            if (field827 == 1) {
                                Statics.method1069(class234.field2945, field828 + " " + class91.field1179 + " " + class91.method1063(16748608) + var40.field3442, 16, var39.field1267, var11, var16);
                            } else if (!field829) {
                                String[] var41 = var40.field3456;
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 18;
                                        }
                                        if (var42 == 1) {
                                            var43 = 19;
                                        }
                                        if (var42 == 2) {
                                            var43 = 20;
                                        }
                                        if (var42 == 3) {
                                            var43 = 21;
                                        }
                                        if (var42 == 4) {
                                            var43 = 22;
                                        }
                                        Statics.method1069(var41[var42], class91.method1063(16748608) + var40.field3442, var43, var39.field1267, var11, var16);
                                    } else if (var42 == 2) {
                                        Statics.method1069(class234.field2792, class91.method1063(16748608) + var40.field3442, 20, var39.field1267, var11, var16);
                                    }
                                }
                                Statics.method1069(class234.field2946, class91.method1063(16748608) + var40.field3442, 1004, var39.field1267, var11, var16);
                            } else if ((Statics.field261 & 0x1) == 1) {
                                Statics.method1069(field679, field922 + " " + class91.field1179 + " " + class91.method1063(16748608) + var40.field3442, 17, var39.field1267, var11, var16);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var44 = class138.method4723(var4);
            int var45 = (int) (var4 >>> 7 & 0x7FL);
            class76 var47 = field790[field781];
            method1152(var47, field781, var44, var45);
        }
    }

    @ObfuscatedName("bs.id(Ljz;IIII)V")
    public static final void method1120(class267 arg0, int arg1, int arg2, int arg3) {
        if (field811 >= 400) {
            return;
        }
        if (arg0.field3508 != null) {
            arg0 = arg0.method4472();
        }
        if (arg0 == null || !arg0.field3527 || arg0.field3529 && field844 != arg1) {
            return;
        }
        String var4 = arg0.field3499;
        if (arg0.field3516 != 0) {
            var4 = var4 + method756(arg0.field3516, Statics.field455.field640) + " " + class91.field1178 + class234.field2951 + arg0.field3516 + class91.field1174;
        }
        if (arg0.field3529 && field885) {
            Statics.method1069(class234.field2946, class91.method1063(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field827 == 1) {
            Statics.method1069(class234.field2945, field828 + " " + class91.field1179 + " " + class91.method1063(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field829) {
            int var5 = arg0.field3529 && field885 ? 2000 : 0;
            String[] var6 = arg0.field3514;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class234.field3015)) {
                        int var8 = 0;
                        if (var7 == 0) {
                            var8 = var5 + 9;
                        }
                        if (var7 == 1) {
                            var8 = var5 + 10;
                        }
                        if (var7 == 2) {
                            var8 = var5 + 11;
                        }
                        if (var7 == 3) {
                            var8 = var5 + 12;
                        }
                        if (var7 == 4) {
                            var8 = var5 + 13;
                        }
                        Statics.method1069(var6[var7], class91.method1063(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class234.field3015)) {
                        short var10 = 0;
                        if (field699 != class94.field1193) {
                            if (field699 == class94.field1194 || field699 == class94.field1195 && arg0.field3516 > Statics.field455.field640) {
                                var10 = 2000;
                            }
                            int var11 = 0;
                            if (var9 == 0) {
                                var11 = var10 + 9;
                            }
                            if (var9 == 1) {
                                var11 = var10 + 10;
                            }
                            if (var9 == 2) {
                                var11 = var10 + 11;
                            }
                            if (var9 == 3) {
                                var11 = var10 + 12;
                            }
                            if (var9 == 4) {
                                var11 = var10 + 13;
                            }
                            Statics.method1069(var6[var9], class91.method1063(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3529 || !field885) {
                Statics.method1069(class234.field2946, class91.method1063(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field261 & 0x2) == 2) {
            Statics.method1069(field679, field922 + " " + class91.field1179 + " " + class91.method1063(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("by.io(Lby;IIIS)V")
    public static final void method1152(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field455 == arg0 || field811 >= 400) {
            return;
        }
        String var4;
        if (arg0.field641 == 0) {
            var4 = arg0.field645[0] + arg0.field658 + arg0.field645[1] + method756(arg0.field640, Statics.field455.field640) + " " + class91.field1178 + class234.field2951 + arg0.field640 + class91.field1174 + arg0.field645[2];
        } else {
            var4 = arg0.field645[0] + arg0.field658 + arg0.field645[1] + " " + class91.field1178 + class234.field3082 + arg0.field641 + class91.field1174 + arg0.field645[2];
        }
        if (field827 == 1) {
            Statics.method1069(class234.field2945, field828 + " " + class91.field1179 + " " + class91.method1063(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field829) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field764[var5] != null) {
                    short var6 = 0;
                    if (field764[var5].equalsIgnoreCase(class234.field3015)) {
                        if (field698 == class94.field1193) {
                            continue;
                        }
                        if (field698 == class94.field1194 || field698 == class94.field1195 && arg0.field640 > Statics.field455.field640) {
                            var6 = 2000;
                        }
                        if (Statics.field455.field653 != 0 && arg0.field653 != 0) {
                            if (Statics.field455.field653 == arg0.field653) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field799[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field797[var5] + var6;
                    Statics.method1069(field764[var5], class91.method1063(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field261 & 0x8) == 8) {
            Statics.method1069(field679, field922 + " " + class91.field1179 + " " + class91.method1063(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field811; var9++) {
            if (field775[var9] == 23) {
                field924[var9] = class91.method1063(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ba.is(III)Ljava/lang/String;")
    public static final String method756(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class91.method1063(16711680);
        } else if (var2 < -6) {
            return class91.method1063(16723968);
        } else if (var2 < -3) {
            return class91.method1063(16740352);
        } else if (var2 < 0) {
            return class91.method1063(16756736);
        } else if (var2 > 9) {
            return class91.method1063(65280);
        } else if (var2 > 6) {
            return class91.method1063(4259584);
        } else if (var2 > 3) {
            return class91.method1063(8453888);
        } else if (var2 > 0) {
            return class91.method1063(12648192);
        } else {
            return class91.method1063(16776960);
        }
    }

    @ObfuscatedName("iq.ij(IIIIIIIII)V")
    public static final void method3887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method3182(arg0)) {
            Statics.field125 = null;
            method1028(Statics.field2595[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field125 != null) {
                method1028(Statics.field125, -1412584499, arg1, arg2, arg3, arg4, Statics.field2093, Statics.field951, arg7);
                Statics.field125 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field814[var8] = true;
            }
        } else {
            field814[arg7] = true;
        }
    }

    @ObfuscatedName("bo.ib([Lhd;IIIIIIIII)V")
    public static final void method1028(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class331.method5691(arg2, arg3, arg4, arg5);
        class140.method2827();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2622 == arg1 || arg1 == -1412584499 && field847 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field888[field727] = var10.field2616 + arg6;
                    field883[field727] = var10.field2678 + arg7;
                    field909[field727] = var10.field2618;
                    field801[field727] = var10.field2619;
                    var11 = ++field727 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2740 = var11;
                var10.field2635 = field671;
                if (!var10.field2602 || !method3092(var10)) {
                    if (var10.field2607 > 0) {
                        method39(var10);
                    }
                    int var12 = var10.field2616 + arg6;
                    int var13 = var10.field2678 + arg7;
                    int var14 = var10.field2593;
                    if (field847 == var10) {
                        if (arg1 != -1412584499 && !var10.field2606) {
                            Statics.field125 = arg0;
                            Statics.field2093 = arg6;
                            Statics.field951 = arg7;
                            continue;
                        }
                        if (field858 && field693) {
                            int var15 = class64.field508;
                            int var16 = class64.field498;
                            int var17 = var15 - field849;
                            int var18 = var16 - field850;
                            if (var17 < field853) {
                                var17 = field853;
                            }
                            if (var10.field2618 + var17 > field853 + field848.field2618) {
                                var17 = field853 + field848.field2618 - var10.field2618;
                            }
                            if (var18 < field854) {
                                var18 = field854;
                            }
                            if (var10.field2619 + var18 > field854 + field848.field2619) {
                                var18 = field854 + field848.field2619 - var10.field2619;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2606) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2605 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2605 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2618 + var12;
                        int var26 = var10.field2619 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field2618 + var12;
                        int var30 = var10.field2619 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2602 || var19 < var21 && var20 < var22) {
                        if (var10.field2607 != 0) {
                            if (var10.field2607 == 1336) {
                                if (field841) {
                                    var13 += 15;
                                    Statics.field2435.method5072("Fps:" + field471, var10.field2618 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field675) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2435.method5072("Mem:" + var32 + "k", var10.field2618 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2607 == 1337) {
                                field747 = var12;
                                field824 = var13;
                                method729(var12, var13, var10.field2618, var10.field2619);
                                field814[var10.field2740] = true;
                                class331.method5691(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2607 == 1338) {
                                method4309(var10, var12, var13, var11);
                                class331.method5691(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2607 == 1339) {
                                method4986(var10, var12, var13, var11);
                                class331.method5691(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2607 == 1400) {
                                Statics.field2754.method6000(var12, var13, var10.field2618, var10.field2619, field671);
                            }
                            if (var10.field2607 == 1401) {
                                Statics.field2754.method5989(var12, var13, var10.field2618, var10.field2619);
                            }
                            if (var10.field2607 == 1402) {
                                Statics.field1208.method1715(var12, field671);
                            }
                        }
                        if (var10.field2605 == 0) {
                            if (!var10.field2602 && method3092(var10) && Statics.field315 != var10) {
                                continue;
                            }
                            if (!var10.field2602) {
                                if (var10.field2625 > var10.field2627 - var10.field2619) {
                                    var10.field2625 = var10.field2627 - var10.field2619;
                                }
                                if (var10.field2625 < 0) {
                                    var10.field2625 = 0;
                                }
                            }
                            method1028(arg0, var10.field2617, var19, var20, var21, var22, var12 - var10.field2624, var13 - var10.field2625, var11);
                            if (var10.field2733 != null) {
                                method1028(var10.field2733, var10.field2617, var19, var20, var21, var22, var12 - var10.field2624, var13 - var10.field2625, var11);
                            }
                            class71 var34 = (class71) field835.method5641((long) var10.field2617);
                            if (var34 != null) {
                                method3887(var34.field585, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class331.method5691(arg2, arg3, arg4, arg5);
                            class140.method2827();
                        }
                        if (field935 || field881[var11] || field696 > 1) {
                            if (var10.field2605 == 0 && !var10.field2602 && var10.field2627 > var10.field2619) {
                                method3883(var10.field2618 + var12, var13, var10.field2625, var10.field2619, var10.field2627);
                            }
                            if (var10.field2605 != 1) {
                                if (var10.field2605 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2653; var36++) {
                                        for (int var37 = 0; var37 < var10.field2614; var37++) {
                                            int var38 = (var10.field2670 + 32) * var37 + var12;
                                            int var39 = (var10.field2671 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2672[var35];
                                                var39 += var10.field2673[var35];
                                            }
                                            if (var10.field2707[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2707[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field403 == var10 && field782 == var35) {
                                                    class335 var43;
                                                    if (field827 == 1 && Statics.field1073 == var35 && Statics.field3628 == var10.field2617) {
                                                        var43 = class265.method2049(var42, var10.field2728[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class265.method2049(var42, var10.field2728[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3872(var10);
                                                    } else if (Statics.field403 == var10 && field782 == var35) {
                                                        int var44 = class64.field508 - field783;
                                                        int var45 = class64.field498 - field784;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field787 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5807(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class331.field3873 && var46.field2625 > 0) {
                                                                int var47 = field748 * (class331.field3873 - var39 - var45) / 3;
                                                                if (var47 > field748 * 10) {
                                                                    var47 = field748 * 10;
                                                                }
                                                                if (var47 > var46.field2625) {
                                                                    var47 = var46.field2625;
                                                                }
                                                                var46.field2625 -= var47;
                                                                field784 += var47;
                                                                method3872(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class331.field3874 && var46.field2625 < var46.field2627 - var46.field2619) {
                                                                int var48 = field748 * (var39 + var45 + 32 - class331.field3874) / 3;
                                                                if (var48 > field748 * 10) {
                                                                    var48 = field748 * 10;
                                                                }
                                                                if (var48 > var46.field2627 - var46.field2619 - var46.field2625) {
                                                                    var48 = var46.field2627 - var46.field2619 - var46.field2625;
                                                                }
                                                                var46.field2625 += var48;
                                                                field784 -= var48;
                                                                method3872(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2357 == var10 && field669 == var35) {
                                                        var43.method5807(var38, var39, 128);
                                                    } else {
                                                        var43.method5855(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2674 != null && var35 < 20) {
                                                class335 var49 = var10.method3791(var35);
                                                if (var49 != null) {
                                                    var49.method5855(var38, var39);
                                                } else if (class227.field2601) {
                                                    method3872(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2605 == 3) {
                                    int var50;
                                    if (method742(var10)) {
                                        var50 = var10.field2629;
                                        if (Statics.field315 == var10 && var10.field2631 != 0) {
                                            var50 = var10.field2631;
                                        }
                                    } else {
                                        var50 = var10.field2628;
                                        if (Statics.field315 == var10 && var10.field2630 != 0) {
                                            var50 = var10.field2630;
                                        }
                                    }
                                    if (var10.field2727) {
                                        switch(var10.field2633.field3883) {
                                            case 1:
                                                class331.method5722(var12, var13, var10.field2618, var10.field2619, var10.field2628, var10.field2629);
                                                break;
                                            case 2:
                                                class331.method5688(var12, var13, var10.field2618, var10.field2619, var10.field2628, var10.field2629, 255 - (var10.field2593 & 0xFF), 255 - (var10.field2743 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class331.method5686(var12, var13, var10.field2618, var10.field2619, var50);
                                                } else {
                                                    class331.method5685(var12, var13, var10.field2618, var10.field2619, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class331.method5690(var12, var13, var10.field2618, var10.field2619, var50);
                                    } else {
                                        class331.method5726(var12, var13, var10.field2618, var10.field2619, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2605 == 4) {
                                    class305 var51 = var10.method3788();
                                    if (var51 != null) {
                                        String var52 = var10.field2687;
                                        int var53;
                                        if (method742(var10)) {
                                            var53 = var10.field2629;
                                            if (Statics.field315 == var10 && var10.field2631 != 0) {
                                                var53 = var10.field2631;
                                            }
                                            if (var10.field2665.length() > 0) {
                                                var52 = var10.field2665;
                                            }
                                        } else {
                                            var53 = var10.field2628;
                                            if (Statics.field315 == var10 && var10.field2630 != 0) {
                                                var53 = var10.field2630;
                                            }
                                        }
                                        if (var10.field2602 && var10.field2729 != -1) {
                                            class265 var54 = class265.method4218(var10.field2729);
                                            var52 = var54.field3442;
                                            if (var52 == null) {
                                                var52 = class234.field2799;
                                            }
                                            if ((var54.field3439 == 1 || var10.field2726 != 1) && var10.field2726 != -1) {
                                                var52 = class91.method1063(16748608) + var52 + class91.field1173 + " " + 'x' + method622(var10.field2726);
                                            }
                                        }
                                        if (field840 == var10) {
                                            var52 = class234.field2953;
                                            var53 = var10.field2628;
                                        }
                                        if (!var10.field2602) {
                                            var52 = method5511(var52, var10);
                                        }
                                        var51.method5074(var52, var12, var13, var10.field2618, var10.field2619, var53, var10.field2669 ? 0 : -1, var10.field2667, var10.field2668, var10.field2694);
                                    } else if (class227.field2601) {
                                        method3872(var10);
                                    }
                                } else if (var10.field2605 == 5) {
                                    if (var10.field2602) {
                                        class335 var56;
                                        if (var10.field2729 == -1) {
                                            var56 = var10.method3787(false);
                                        } else {
                                            var56 = class265.method2049(var10.field2729, var10.field2726, var10.field2632, var10.field2623, var10.field2662, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3893;
                                            int var58 = var56.field3898;
                                            if (var10.field2641) {
                                                class331.method5679(var12, var13, var10.field2618 + var12, var10.field2619 + var13);
                                                int var59 = (var10.field2618 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2619 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2640 != 0) {
                                                            var56.method5820(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2640, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5855(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5807(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class331.method5691(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2618 * 4096 / var57;
                                                if (var10.field2640 != 0) {
                                                    var56.method5820(var10.field2618 / 2 + var12, var10.field2619 / 2 + var13, var10.field2640, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5828(var12, var13, var10.field2618, var10.field2619, 256 - (var14 & 0xFF));
                                                } else if (var10.field2618 == var57 && var10.field2619 == var58) {
                                                    var56.method5855(var12, var13);
                                                } else {
                                                    var56.method5803(var12, var13, var10.field2618, var10.field2619);
                                                }
                                            }
                                        } else if (class227.field2601) {
                                            method3872(var10);
                                        }
                                    } else {
                                        class335 var55 = var10.method3787(method742(var10));
                                        if (var55 != null) {
                                            var55.method5855(var12, var13);
                                        } else if (class227.field2601) {
                                            method3872(var10);
                                        }
                                    }
                                } else if (var10.field2605 == 6) {
                                    boolean var64 = method742(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2651;
                                    } else {
                                        var65 = var10.field2650;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2729 != -1) {
                                        class265 var68 = class265.method4218(var10.field2729);
                                        if (var68 != null) {
                                            class265 var69 = var68.method4406(var10.field2726);
                                            var66 = var69.method4454(1);
                                            if (var66 == null) {
                                                method3872(var10);
                                            } else {
                                                var66.method2711();
                                                var67 = var66.field1898 / 2;
                                            }
                                        }
                                    } else if (var10.field2646 == 5) {
                                        if (var10.field2594 == 0) {
                                            var66 = field931.method3740((class269) null, -1, (class269) null, -1);
                                        } else {
                                            var66 = Statics.field455.method1131();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3790((class269) null, -1, var64, Statics.field455.field635);
                                        if (var66 == null && class227.field2601) {
                                            method3872(var10);
                                        }
                                    } else {
                                        class269 var70 = class269.method3330(var65);
                                        var66 = var10.method3790(var70, var10.field2731, var64, Statics.field455.field635);
                                        if (var66 == null && class227.field2601) {
                                            method3872(var10);
                                        }
                                    }
                                    class140.method2861(var10.field2618 / 2 + var12, var10.field2619 / 2 + var13);
                                    int var71 = var10.field2739 * class140.field1812[var10.field2654] >> 16;
                                    int var72 = var10.field2739 * class140.field1813[var10.field2654] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2602) {
                                            var66.method2711();
                                            if (var10.field2730) {
                                                var66.method2725(0, var10.field2655, var10.field2656, var10.field2654, var10.field2652, var10.field2647 + var67 + var71, var10.field2647 + var72, var10.field2739);
                                            } else {
                                                var66.method2724(0, var10.field2655, var10.field2656, var10.field2654, var10.field2652, var10.field2647 + var67 + var71, var10.field2647 + var72);
                                            }
                                        } else {
                                            var66.method2724(0, var10.field2655, 0, var10.field2654, 0, var71, var72);
                                        }
                                    }
                                    class140.method2878();
                                } else {
                                    if (var10.field2605 == 7) {
                                        class305 var73 = var10.method3788();
                                        if (var73 == null) {
                                            if (class227.field2601) {
                                                method3872(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2653; var75++) {
                                            for (int var76 = 0; var76 < var10.field2614; var76++) {
                                                if (var10.field2707[var74] > 0) {
                                                    class265 var77 = class265.method4218(var10.field2707[var74] - 1);
                                                    String var78;
                                                    if (var77.field3439 != 1 && var10.field2728[var74] == 1) {
                                                        var78 = class91.method1063(16748608) + var77.field3442 + class91.field1173;
                                                    } else {
                                                        var78 = class91.method1063(16748608) + var77.field3442 + class91.field1173 + " " + 'x' + method622(var10.field2728[var74]);
                                                    }
                                                    int var79 = (var10.field2670 + 115) * var76 + var12;
                                                    int var80 = (var10.field2671 + 12) * var75 + var13;
                                                    if (var10.field2667 == 0) {
                                                        var73.method5070(var78, var79, var80, var10.field2628, var10.field2669 ? 0 : -1);
                                                    } else if (var10.field2667 == 1) {
                                                        var73.method5073(var78, var10.field2618 / 2 + var79, var80, var10.field2628, var10.field2669 ? 0 : -1);
                                                    } else {
                                                        var73.method5072(var78, var10.field2618 + var79 - 1, var80, var10.field2628, var10.field2669 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2605 == 8 && Statics.field543 == var10 && field826 == field825) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class305 var83 = Statics.field2435;
                                        String var84 = var10.field2687;
                                        String var85 = method5511(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class91.field1176);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5065(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3720 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2618 + var12 - 5 - var81;
                                        int var90 = var10.field2619 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class331.method5686(var89, var90, var81, var82, 16777120);
                                        class331.method5690(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2687;
                                        int var92 = var83.field3720 + var90 + 2;
                                        String var93 = method5511(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class91.field1176);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5070(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3720 + 1;
                                        }
                                    }
                                    if (var10.field2605 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2634) {
                                            var96 = var12;
                                            var97 = var10.field2619 + var13;
                                            var98 = var10.field2618 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2618 + var12;
                                            var99 = var10.field2619 + var13;
                                        }
                                        if (var10.field2636 == 1) {
                                            class331.method5675(var96, var97, var98, var99, var10.field2628);
                                        } else {
                                            method3219(var96, var97, var98, var99, var10.field2628, var10.field2636);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.in(IIIIIIS)V")
    public static final void method3219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class331.field3875;
        int var18 = arg1 - class331.field3873;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2858(var19, var20, var21);
        class140.method2838(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2858(var19, var21, var22);
        class140.method2838(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("lk.iq(Ljava/lang/String;Lhd;I)Ljava/lang/String;")
    public static String method5511(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3779(method755(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("az.ic(II)Ljava/lang/String;")
    public static final String method622(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1171 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method1063(65408) + var1.substring(0, var1.length() - 8) + class234.field2870 + " " + class91.field1178 + var1 + class91.field1174 + class91.field1173;
        } else if (var1.length() > 6) {
            return " " + class91.method1063(16777215) + var1.substring(0, var1.length() - 4) + class234.field2974 + " " + class91.field1178 + var1 + class91.field1174 + class91.field1173;
        } else {
            return " " + class91.method1063(16776960) + var1 + class91.field1173;
        }
    }

    @ObfuscatedName("client.ip(ZI)V")
    public final void method1200(boolean arg0) {
        int var2 = field834;
        int var3 = Statics.field1299;
        int var4 = Statics.field397;
        if (class227.method3182(var2)) {
            method169(Statics.field2595[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ig(Lhd;I)V")
    public void method1201(class227 arg0) {
        class227 var2 = arg0.field2622 == -1 ? null : class227.method403(arg0.field2622);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1299;
            var4 = Statics.field397;
        } else {
            var3 = var2.field2618;
            var4 = var2.field2619;
        }
        method3222(arg0, var3, var4, false);
        method407(arg0, var3, var4);
    }

    @ObfuscatedName("ai.it([Lhd;Lhd;ZS)V")
    public static void method240(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2626 == 0 ? arg1.field2618 : arg1.field2626;
        int var4 = arg1.field2627 == 0 ? arg1.field2619 : arg1.field2627;
        method169(arg0, arg1.field2617, var3, var4, arg2);
        if (arg1.field2733 != null) {
            method169(arg1.field2733, arg1.field2617, var3, var4, arg2);
        }
        class71 var5 = (class71) field835.method5641((long) arg1.field2617);
        if (var5 != null) {
            int var6 = var5.field585;
            if (class227.method3182(var6)) {
                method169(Statics.field2595[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2607 == 1337) {
        }
    }

    @ObfuscatedName("e.ix([Lhd;IIIZB)V")
    public static void method169(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2622 == arg1) {
                method3222(var6, arg2, arg3, arg4);
                method407(var6, arg2, arg3);
                if (var6.field2624 > var6.field2626 - var6.field2618) {
                    var6.field2624 = var6.field2626 - var6.field2618;
                }
                if (var6.field2624 < 0) {
                    var6.field2624 = 0;
                }
                if (var6.field2625 > var6.field2627 - var6.field2619) {
                    var6.field2625 = var6.field2627 - var6.field2619;
                }
                if (var6.field2625 < 0) {
                    var6.field2625 = 0;
                }
                if (var6.field2605 == 0) {
                    method240(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fy.if(Lhd;IIZS)V")
    public static void method3222(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2618;
        int var5 = arg0.field2619;
        if (arg0.field2610 == 0) {
            arg0.field2618 = arg0.field2614;
        } else if (arg0.field2610 == 1) {
            arg0.field2618 = arg1 - arg0.field2614;
        } else if (arg0.field2610 == 2) {
            arg0.field2618 = arg0.field2614 * arg1 >> 14;
        }
        if (arg0.field2597 == 0) {
            arg0.field2619 = arg0.field2653;
        } else if (arg0.field2597 == 1) {
            arg0.field2619 = arg2 - arg0.field2653;
        } else if (arg0.field2597 == 2) {
            arg0.field2619 = arg0.field2653 * arg2 >> 14;
        }
        if (arg0.field2610 == 4) {
            arg0.field2618 = arg0.field2742 * arg0.field2619 / arg0.field2642;
        }
        if (arg0.field2597 == 4) {
            arg0.field2619 = arg0.field2642 * arg0.field2618 / arg0.field2742;
        }
        if (arg0.field2607 == 1337) {
            field846 = arg0;
        }
        if (arg3 && arg0.field2718 != null && (arg0.field2618 != var4 || arg0.field2619 != var5)) {
            class72 var6 = new class72();
            var6.field593 = arg0;
            var6.field600 = arg0.field2718;
            field873.method4644(var6);
        }
    }

    @ObfuscatedName("ar.il(Lhd;III)V")
    public static void method407(class227 arg0, int arg1, int arg2) {
        if (arg0.field2608 == 0) {
            arg0.field2616 = arg0.field2612;
        } else if (arg0.field2608 == 1) {
            arg0.field2616 = (arg1 - arg0.field2618) / 2 + arg0.field2612;
        } else if (arg0.field2608 == 2) {
            arg0.field2616 = arg1 - arg0.field2618 - arg0.field2612;
        } else if (arg0.field2608 == 3) {
            arg0.field2616 = arg0.field2612 * arg1 >> 14;
        } else if (arg0.field2608 == 4) {
            arg0.field2616 = (arg0.field2612 * arg1 >> 14) + (arg1 - arg0.field2618) / 2;
        } else {
            arg0.field2616 = arg1 - arg0.field2618 - (arg0.field2612 * arg1 >> 14);
        }
        if (arg0.field2609 == 0) {
            arg0.field2678 = arg0.field2613;
        } else if (arg0.field2609 == 1) {
            arg0.field2678 = (arg2 - arg0.field2619) / 2 + arg0.field2613;
        } else if (arg0.field2609 == 2) {
            arg0.field2678 = arg2 - arg0.field2619 - arg0.field2613;
        } else if (arg0.field2609 == 3) {
            arg0.field2678 = arg0.field2613 * arg2 >> 14;
        } else if (arg0.field2609 == 4) {
            arg0.field2678 = (arg0.field2613 * arg2 >> 14) + (arg2 - arg0.field2619) / 2;
        } else {
            arg0.field2678 = arg2 - arg0.field2619 - (arg0.field2613 * arg2 >> 14);
        }
    }

    @ObfuscatedName("hg.iy(Lhd;IIIIIIB)V")
    public static final void method3732(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field741) {
            field817 = 32;
        } else {
            field817 = 0;
        }
        field741 = false;
        if (class64.field507 == 1 || !Statics.field556 && class64.field507 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2625 -= 4;
                method3872(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2625 += 4;
                method3872(arg0);
            } else if (arg5 >= arg1 - field817 && arg5 < field817 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2625 = (arg4 - arg3) * var8 / var9;
                method3872(arg0);
                field741 = true;
            }
        }
        if (field833 == 0) {
            return;
        }
        int var10 = arg0.field2618;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2625 += field833 * 45;
            method3872(arg0);
        }
    }

    @ObfuscatedName("ib.ih(IIIIII)V")
    public static final void method3883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3262[0].method5771(arg0, arg1);
        Statics.field3262[1].method5771(arg0, arg1 + arg3 - 16);
        class331.method5686(arg0, arg1 + 16, 16, arg3 - 32, field737);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class331.method5686(arg0, arg1 + 16 + var6, 16, var5, field738);
        class331.method5694(arg0, arg1 + 16 + var6, var5, field740);
        class331.method5694(arg0 + 1, arg1 + 16 + var6, var5, field740);
        class331.method5724(arg0, arg1 + 16 + var6, 16, field740);
        class331.method5724(arg0, arg1 + 17 + var6, 16, field740);
        class331.method5694(arg0 + 15, arg1 + 16 + var6, var5, field695);
        class331.method5694(arg0 + 14, arg1 + 17 + var6, var5 - 1, field695);
        class331.method5724(arg0, arg1 + 15 + var6 + var5, 16, field695);
        class331.method5724(arg0 + 1, arg1 + 14 + var6 + var5, 15, field695);
    }

    @ObfuscatedName("hw.iu(II)Ljava/lang/String;")
    public static final String method3779(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("be.ie(Lhd;B)Z")
    public static final boolean method742(class227 arg0) {
        if (arg0.field2677 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2677.length; var1++) {
            int var2 = method755(arg0, var1);
            int var3 = arg0.field2621[var1];
            if (arg0.field2677[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2677[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2677[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ba.iw(Lhd;II)I")
    public static final int method755(class227 arg0, int arg1) {
        if (arg0.field2684 == null || arg1 >= arg0.field2684.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2684[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = field806[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field807[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field808[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method403(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class265.method4218(var12).field3480 || field896)) {
                        for (int var13 = 0; var13 < var11.field2707.length; var13++) {
                            if (var12 + 1 == var11.field2707[var13]) {
                                var7 += var11.field2728[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2562[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2782[field807[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2562[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field455.field640;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2780[var14]) {
                            var7 += field807[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method403(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class265.method4218(var18).field3480 || field896)) {
                        for (int var19 = 0; var19 < var17.field2707.length; var19++) {
                            if (var18 + 1 == var17.field2707[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field742;
                }
                if (var6 == 12) {
                    var7 = field842;
                }
                if (var6 == 13) {
                    int var20 = class222.field2562[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method3842(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (Statics.field455.field983 >> 7) + Statics.field2130;
                }
                if (var6 == 19) {
                    var7 = (Statics.field455.field965 >> 7) + Statics.field1275;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("ep.ir(Lhd;Ljo;IIZI)V")
    public static final void method3105(class227 arg0, class265 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3457;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class234.field2891;
        }
        if (var6 != -1 && var7 != null) {
            method1119(var7, class91.method1063(16748608) + arg1.field3442, var6, arg1.field3467, arg2, arg0.field2617, arg4);
        }
    }

    @ObfuscatedName("br.ik(Lhd;III)V")
    public static final void method1115(class227 arg0, int arg1, int arg2) {
        if (arg0.field2657 == 1) {
            Statics.method1069(arg0.field2615, "", 24, 0, 0, arg0.field2617);
        }
        if (arg0.field2657 == 2 && !field829) {
            String var3 = method621(arg0);
            if (var3 != null) {
                Statics.method1069(var3, class91.method1063(65280) + arg0.field2725, 25, 0, -1, arg0.field2617);
            }
        }
        if (arg0.field2657 == 3) {
            Statics.method1069(class234.field2954, "", 26, 0, 0, arg0.field2617);
        }
        if (arg0.field2657 == 4) {
            Statics.method1069(arg0.field2615, "", 28, 0, 0, arg0.field2617);
        }
        if (arg0.field2657 == 5) {
            Statics.method1069(arg0.field2615, "", 29, 0, 0, arg0.field2617);
        }
        if (arg0.field2657 == 6 && field840 == null) {
            Statics.method1069(arg0.field2615, "", 30, 0, -1, arg0.field2617);
        }
        if (arg0.field2605 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2619; var5++) {
                for (int var6 = 0; var6 < arg0.field2618; var6++) {
                    int var7 = (arg0.field2670 + 32) * var6;
                    int var8 = (arg0.field2671 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2672[var4];
                        var8 += arg0.field2673[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field785 = var4;
                        Statics.field2067 = arg0;
                        if (arg0.field2707[var4] > 0) {
                            class265 var9 = class265.method4218(arg0.field2707[var4] - 1);
                            if (field827 == 1 && class228.method4184(method728(arg0))) {
                                if (Statics.field3628 != arg0.field2617 || Statics.field1073 != var4) {
                                    Statics.method1069(class234.field2945, field828 + " " + class91.field1179 + " " + class91.method1063(16748608) + var9.field3442, 31, var9.field3467, var4, arg0.field2617);
                                }
                            } else if (!field829 || !class228.method4184(method728(arg0))) {
                                String[] var10 = var9.field3457;
                                int var11 = -1;
                                if (field820 && method3089()) {
                                    var11 = var9.method4413();
                                }
                                if (class228.method4184(method728(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method3105(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class228.method3426(method728(arg0))) {
                                    Statics.method1069(class234.field2945, class91.method1063(16748608) + var9.field3442, 38, var9.field3467, var4, arg0.field2617);
                                }
                                if (class228.method4184(method728(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            method3105(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method3105(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field2675;
                                if (var14 != null) {
                                    for (int var15 = 4; var15 >= 0; var15--) {
                                        if (var14[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 39;
                                            }
                                            if (var15 == 1) {
                                                var16 = 40;
                                            }
                                            if (var15 == 2) {
                                                var16 = 41;
                                            }
                                            if (var15 == 3) {
                                                var16 = 42;
                                            }
                                            if (var15 == 4) {
                                                var16 = 43;
                                            }
                                            Statics.method1069(var14[var15], class91.method1063(16748608) + var9.field3442, var16, var9.field3467, var4, arg0.field2617);
                                        }
                                    }
                                }
                                Statics.method1069(class234.field2946, class91.method1063(16748608) + var9.field3442, 1005, var9.field3467, var4, arg0.field2617);
                            } else if ((Statics.field261 & 0x10) == 16) {
                                Statics.method1069(field679, field922 + " " + class91.field1179 + " " + class91.method1063(16748608) + var9.field3442, 32, var9.field3467, var4, arg0.field2617);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2602) {
            return;
        }
        if (field829) {
            int var17 = method728(arg0);
            boolean var18 = (var17 >> 21 & 0x1) != 0;
            if (var18 && (Statics.field261 & 0x20) == 32) {
                Statics.method1069(field679, field922 + " " + class91.field1179 + " " + arg0.field2603, 58, 0, arg0.field2691, arg0.field2617);
            }
            return;
        }
        for (int var19 = 9; var19 >= 5; var19--) {
            int var20 = method728(arg0);
            boolean var21 = (var20 >> var19 + 1 & 0x1) != 0;
            String var22;
            if (!var21 && arg0.field2620 == null) {
                var22 = null;
            } else if (arg0.field2695 == null || arg0.field2695.length <= var19 || arg0.field2695[var19] == null || arg0.field2695[var19].trim().length() == 0) {
                var22 = null;
            } else {
                var22 = arg0.field2695[var19];
            }
            if (var22 != null) {
                Statics.method1069(var22, arg0.field2603, 1007, var19 + 1, arg0.field2691, arg0.field2617);
            }
        }
        String var24 = method621(arg0);
        if (var24 != null) {
            Statics.method1069(var24, arg0.field2603, 25, 0, arg0.field2691, arg0.field2617);
        }
        for (int var25 = 4; var25 >= 0; var25--) {
            int var26 = method728(arg0);
            boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
            String var28;
            if (!var27 && arg0.field2620 == null) {
                var28 = null;
            } else if (arg0.field2695 == null || arg0.field2695.length <= var25 || arg0.field2695[var25] == null || arg0.field2695[var25].trim().length() == 0) {
                var28 = null;
            } else {
                var28 = arg0.field2695[var25];
            }
            if (var28 != null) {
                method1119(var28, arg0.field2603, 57, var25 + 1, arg0.field2691, arg0.field2617, arg0.field2745);
            }
        }
        if (Statics.method410(method728(arg0))) {
            Statics.method1069(class234.field2797, "", 30, 0, arg0.field2691, arg0.field2617);
        }
    }

    @ObfuscatedName("er.iz(ZB)V")
    public static void method2904(boolean arg0) {
        field821 = arg0;
    }

    @ObfuscatedName("by.iv(I)Z")
    public static boolean method1129() {
        return field821;
    }

    @ObfuscatedName("en.ii(I)Z")
    public static boolean method3089() {
        return field821 || class55.field409[81];
    }

    @ObfuscatedName("hm.je(IIIIIIII)V")
    public static final void method3589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method3182(arg0)) {
            method89(Statics.field2595[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("z.jr([Lhd;IIIIIIII)V")
    public static final void method89(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2622 == arg1 && (!var9.field2602 || var9.field2605 == 0 || var9.field2689 || method728(var9) != 0 || field848 == var9 || var9.field2607 == 1338)) {
                if (var9.field2602) {
                    if (method3092(var9)) {
                        continue;
                    }
                } else if (var9.field2605 == 0 && Statics.field315 != var9 && method3092(var9)) {
                    continue;
                }
                int var10 = var9.field2616 + arg6;
                int var11 = var9.field2678 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2605 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2605 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2618 + var10;
                    int var19 = var9.field2619 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field2618 + var10;
                    int var23 = var9.field2619 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field847 == var9) {
                    field855 = true;
                    field856 = var10;
                    field857 = var11;
                }
                boolean var24 = false;
                if (var9.field2710) {
                    switch(field836) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2617 >>> 16 == field672) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field672 == var9.field2617) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2602 || var12 < var14 && var13 < var15) {
                    if (var9.field2602) {
                        if (var9.field2637) {
                            if (class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15) {
                                for (class72 var25 = (class72) field873.method4651(); var25 != null; var25 = (class72) field873.method4656()) {
                                    if (var25.field594) {
                                        var25.method3388();
                                        var25.field593.field2734 = false;
                                    }
                                }
                                if (Statics.field100 == 0) {
                                    field847 = null;
                                    field848 = null;
                                }
                                if (!field703) {
                                    method5039();
                                }
                            }
                        } else if (var9.field2744 && class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15) {
                            for (class72 var26 = (class72) field873.method4651(); var26 != null; var26 = (class72) field873.method4656()) {
                                if (var26.field594 && var26.field593.field2643 == var26.field600) {
                                    var26.method3388();
                                }
                            }
                        }
                    }
                    int var27 = class64.field508;
                    int var28 = class64.field498;
                    if (class64.field515 != 0) {
                        var27 = class64.field505;
                        var28 = class64.field504;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2607 == 1337) {
                        if (!field681 && !field703 && var29) {
                            method639(var27, var28, var12, var13);
                        }
                    } else if (var9.field2607 == 1338) {
                        method13(var9, var10, var11);
                    } else {
                        if (var9.field2607 == 1400) {
                            Statics.field2754.method5970(class64.field508, class64.field498, var29, var10, var11, var9.field2618, var9.field2619);
                        }
                        if (!field703 && var29) {
                            if (var9.field2607 == 1400) {
                                Statics.field2754.method6139(var10, var11, var9.field2618, var9.field2619, var27, var28);
                            } else {
                                method1115(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2648.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2648[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2648[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2724 != null) {
                                            var34 = class55.field409[var9.field2648[var30][var33]];
                                        }
                                        if (method3884(var9.field2648[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2724 != null && var9.field2724[var30] > field671) {
                                                break;
                                            }
                                            byte var35 = var9.field2679[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field409[86] && !class55.field409[82] && !class55.field409[81]) && ((var35 & 0x2) == 0 || class55.field409[86]) && ((var35 & 0x1) == 0 || class55.field409[82]) && ((var35 & 0x4) == 0 || class55.field409[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method4087(var30 + 1, var9.field2617, var9.field2691, var9.field2729, "");
                                    } else if (var30 == 10) {
                                        method139();
                                        method1967(var9.field2617, var9.field2691, class228.method540(method728(var9)), var9.field2729);
                                        field679 = method621(var9);
                                        if (field679 == null) {
                                            field679 = class234.field2799;
                                        }
                                        field922 = var9.field2603 + class91.method1063(16777215);
                                    }
                                    int var36 = var9.field2680[var30];
                                    if (var9.field2724 == null) {
                                        var9.field2724 = new int[var9.field2648.length];
                                    }
                                    if (var9.field2681 == null) {
                                        var9.field2681 = new int[var9.field2648.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2724[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2724[var30] == 0) {
                                        var9.field2724[var30] = field671 + var36 + var9.field2681[var30];
                                    } else {
                                        var9.field2724[var30] = field671 + var36;
                                    }
                                }
                                if (!var31 && var9.field2724 != null) {
                                    var9.field2724[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2602) {
                            boolean var37;
                            if (class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field507 == 1 || !Statics.field556 && class64.field507 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field515 == 1 || !Statics.field556 && class64.field515 == 4) && class64.field505 >= var12 && class64.field504 >= var13 && class64.field505 < var14 && class64.field504 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method797(var9, class64.field505 - var10, class64.field504 - var11);
                            }
                            if (var9.field2607 == 1400) {
                                Statics.field2754.method6140(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field847 != null && field847 != var9 && var37 && class228.method675(method728(var9))) {
                                field851 = var9;
                            }
                            if (field848 == var9) {
                                field693 = true;
                                field853 = var10;
                                field854 = var11;
                            }
                            if (var9.field2689) {
                                if (var37 && field833 != 0 && var9.field2643 != null) {
                                    class72 var40 = new class72();
                                    var40.field594 = true;
                                    var40.field593 = var9;
                                    var40.field603 = field833;
                                    var40.field600 = var9.field2643;
                                    field873.method4644(var40);
                                }
                                if (field847 != null || Statics.field403 != null || field703) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2735 && var39) {
                                    var9.field2735 = true;
                                    if (var9.field2706 != null) {
                                        class72 var41 = new class72();
                                        var41.field594 = true;
                                        var41.field593 = var9;
                                        var41.field596 = class64.field505 - var10;
                                        var41.field603 = class64.field504 - var11;
                                        var41.field600 = var9.field2706;
                                        field873.method4644(var41);
                                    }
                                }
                                if (var9.field2735 && var38 && var9.field2692 != null) {
                                    class72 var42 = new class72();
                                    var42.field594 = true;
                                    var42.field593 = var9;
                                    var42.field596 = class64.field508 - var10;
                                    var42.field603 = class64.field498 - var11;
                                    var42.field600 = var9.field2692;
                                    field873.method4644(var42);
                                }
                                if (var9.field2735 && !var38) {
                                    var9.field2735 = false;
                                    if (var9.field2741 != null) {
                                        class72 var43 = new class72();
                                        var43.field594 = true;
                                        var43.field593 = var9;
                                        var43.field596 = class64.field508 - var10;
                                        var43.field603 = class64.field498 - var11;
                                        var43.field600 = var9.field2741;
                                        field692.method4644(var43);
                                    }
                                }
                                if (var38 && var9.field2719 != null) {
                                    class72 var44 = new class72();
                                    var44.field594 = true;
                                    var44.field593 = var9;
                                    var44.field596 = class64.field508 - var10;
                                    var44.field603 = class64.field498 - var11;
                                    var44.field600 = var9.field2719;
                                    field873.method4644(var44);
                                }
                                if (!var9.field2734 && var37) {
                                    var9.field2734 = true;
                                    if (var9.field2738 != null) {
                                        class72 var45 = new class72();
                                        var45.field594 = true;
                                        var45.field593 = var9;
                                        var45.field596 = class64.field508 - var10;
                                        var45.field603 = class64.field498 - var11;
                                        var45.field600 = var9.field2738;
                                        field873.method4644(var45);
                                    }
                                }
                                if (var9.field2734 && var37 && var9.field2696 != null) {
                                    class72 var46 = new class72();
                                    var46.field594 = true;
                                    var46.field593 = var9;
                                    var46.field596 = class64.field508 - var10;
                                    var46.field603 = class64.field498 - var11;
                                    var46.field600 = var9.field2696;
                                    field873.method4644(var46);
                                }
                                if (var9.field2734 && !var37) {
                                    var9.field2734 = false;
                                    if (var9.field2697 != null) {
                                        class72 var47 = new class72();
                                        var47.field594 = true;
                                        var47.field593 = var9;
                                        var47.field596 = class64.field508 - var10;
                                        var47.field603 = class64.field498 - var11;
                                        var47.field600 = var9.field2697;
                                        field692.method4644(var47);
                                    }
                                }
                                if (var9.field2708 != null) {
                                    class72 var48 = new class72();
                                    var48.field593 = var9;
                                    var48.field600 = var9.field2708;
                                    field892.method4644(var48);
                                }
                                if (var9.field2660 != null && field861 > var9.field2737) {
                                    if (var9.field2703 == null || field861 - var9.field2737 > 32) {
                                        class72 var53 = new class72();
                                        var53.field593 = var9;
                                        var53.field600 = var9.field2660;
                                        field873.method4644(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2737; var49 < field861; var49++) {
                                            int var50 = field860[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2703.length; var51++) {
                                                if (var9.field2703[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field593 = var9;
                                                    var52.field600 = var9.field2660;
                                                    field873.method4644(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2737 = field861;
                                }
                                if (var9.field2704 != null && field879 > var9.field2644) {
                                    if (var9.field2705 == null || field879 - var9.field2644 > 32) {
                                        class72 var58 = new class72();
                                        var58.field593 = var9;
                                        var58.field600 = var9.field2704;
                                        field873.method4644(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2644; var54 < field879; var54++) {
                                            int var55 = field914[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2705.length; var56++) {
                                                if (var9.field2705[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field593 = var9;
                                                    var57.field600 = var9.field2704;
                                                    field873.method4644(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2644 = field879;
                                }
                                if (var9.field2715 != null && field832 > var9.field2722) {
                                    if (var9.field2611 == null || field832 - var9.field2722 > 32) {
                                        class72 var63 = new class72();
                                        var63.field593 = var9;
                                        var63.field600 = var9.field2715;
                                        field873.method4644(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2722; var59 < field832; var59++) {
                                            int var60 = field736[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2611.length; var61++) {
                                                if (var9.field2611[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field593 = var9;
                                                    var62.field600 = var9.field2715;
                                                    field873.method4644(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2722 = field832;
                                }
                                if (field866 > var9.field2736 && var9.field2711 != null) {
                                    class72 var64 = new class72();
                                    var64.field593 = var9;
                                    var64.field600 = var9.field2711;
                                    field873.method4644(var64);
                                }
                                if (field867 > var9.field2736 && var9.field2713 != null) {
                                    class72 var65 = new class72();
                                    var65.field593 = var9;
                                    var65.field600 = var9.field2713;
                                    field873.method4644(var65);
                                }
                                if (field944 > var9.field2736 && var9.field2714 != null) {
                                    class72 var66 = new class72();
                                    var66.field593 = var9;
                                    var66.field600 = var9.field2714;
                                    field873.method4644(var66);
                                }
                                if (field819 > var9.field2736 && var9.field2604 != null) {
                                    class72 var67 = new class72();
                                    var67.field593 = var9;
                                    var67.field600 = var9.field2604;
                                    field873.method4644(var67);
                                }
                                if (field870 > var9.field2736 && var9.field2720 != null) {
                                    class72 var68 = new class72();
                                    var68.field593 = var9;
                                    var68.field600 = var9.field2720;
                                    field873.method4644(var68);
                                }
                                if (field871 > var9.field2736 && var9.field2693 != null) {
                                    class72 var69 = new class72();
                                    var69.field593 = var9;
                                    var69.field600 = var9.field2693;
                                    field873.method4644(var69);
                                }
                                var9.field2736 = field859;
                                if (var9.field2712 != null) {
                                    for (int var70 = 0; var70 < field895; var70++) {
                                        class72 var71 = new class72();
                                        var71.field593 = var9;
                                        var71.field606 = field897[var70];
                                        var71.field608 = field921[var70];
                                        var71.field600 = var9.field2712;
                                        field873.method4644(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2602) {
                            if (field847 != null || Statics.field403 != null || field703) {
                                continue;
                            }
                            if ((var9.field2639 >= 0 || var9.field2630 != 0) && class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15) {
                                if (var9.field2639 >= 0) {
                                    Statics.field315 = arg0[var9.field2639];
                                } else {
                                    Statics.field315 = var9;
                                }
                            }
                            if (var9.field2605 == 8 && class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15) {
                                Statics.field543 = var9;
                            }
                            if (var9.field2627 > var9.field2619) {
                                method3732(var9, var9.field2618 + var10, var11, var9.field2619, var9.field2627, class64.field508, class64.field498);
                            }
                        }
                        if (var9.field2605 == 0) {
                            method89(arg0, var9.field2617, var12, var13, var14, var15, var10 - var9.field2624, var11 - var9.field2625);
                            if (var9.field2733 != null) {
                                method89(var9.field2733, var9.field2617, var12, var13, var14, var15, var10 - var9.field2624, var11 - var9.field2625);
                            }
                            class71 var72 = (class71) field835.method5641((long) var9.field2617);
                            if (var72 != null) {
                                if (var72.field586 == 0 && class64.field508 >= var12 && class64.field498 >= var13 && class64.field508 < var14 && class64.field498 < var15 && !field703) {
                                    for (class72 var73 = (class72) field873.method4651(); var73 != null; var73 = (class72) field873.method4656()) {
                                        if (var73.field594) {
                                            var73.method3388();
                                            var73.field593.field2734 = false;
                                        }
                                    }
                                    if (Statics.field100 == 0) {
                                        field847 = null;
                                        field848 = null;
                                    }
                                    if (!field703) {
                                        method5039();
                                    }
                                }
                                method3589(var72.field585, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("in.js(II)Z")
    public static boolean method3884(int arg0) {
        for (int var1 = 0; var1 < field895; var1++) {
            if (field897[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gz.jg(III)V")
    public static final void method3447(int arg0, int arg1) {
        if (class227.method3182(arg0)) {
            method2903(Statics.field2595[arg0], arg1);
        }
    }

    @ObfuscatedName("er.jo([Lhd;IB)V")
    public static final void method2903(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2605 == 0) {
                    if (var3.field2733 != null) {
                        method2903(var3.field2733, arg1);
                    }
                    class71 var4 = (class71) field835.method5641((long) var3.field2617);
                    if (var4 != null) {
                        method3447(var4.field585, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2716 != null) {
                    class72 var5 = new class72();
                    var5.field593 = var3;
                    var5.field600 = var3.field2716;
                    class86.method1066(var5);
                }
                if (arg1 == 1 && var3.field2666 != null) {
                    if (var3.field2691 >= 0) {
                        class227 var6 = class227.method403(var3.field2617);
                        if (var6 == null || var6.field2733 == null || var3.field2691 >= var6.field2733.length || var6.field2733[var3.field2691] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field593 = var3;
                    var7.field600 = var3.field2666;
                    class86.method1066(var7);
                }
            }
        }
    }

    @ObfuscatedName("bw.jc(Lhd;IIS)V")
    public static final void method797(class227 arg0, int arg1, int arg2) {
        if (field847 != null || field703 || arg0 == null || method128(arg0) == null) {
            return;
        }
        field847 = arg0;
        class227 var3 = method1800(arg0);
        if (var3 == null) {
            var3 = arg0.field2683;
        }
        field848 = var3;
        field849 = arg1;
        field850 = arg2;
        Statics.field100 = 0;
        field858 = false;
        int var5 = method3114();
        if (var5 != -1) {
            method551(var5);
        }
    }

    @ObfuscatedName("client.jz(I)V")
    public final void method1202() {
        method3872(field847);
        Statics.field100++;
        if (field855 && field693) {
            int var1 = class64.field508;
            int var2 = class64.field498;
            int var3 = var1 - field849;
            int var4 = var2 - field850;
            if (var3 < field853) {
                var3 = field853;
            }
            if (field847.field2618 + var3 > field853 + field848.field2618) {
                var3 = field853 + field848.field2618 - field847.field2618;
            }
            if (var4 < field854) {
                var4 = field854;
            }
            if (field847.field2619 + var4 > field854 + field848.field2619) {
                var4 = field854 + field848.field2619 - field847.field2619;
            }
            int var5 = var3 - field856;
            int var6 = var4 - field857;
            int var7 = field847.field2685;
            if (Statics.field100 > field847.field2686 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field858 = true;
            }
            int var8 = field848.field2624 + (var3 - field853);
            int var9 = field848.field2625 + (var4 - field854);
            if (field847.field2698 != null && field858) {
                class72 var10 = new class72();
                var10.field593 = field847;
                var10.field596 = var8;
                var10.field603 = var9;
                var10.field600 = field847.field2698;
                class86.method1066(var10);
            }
            if (class64.field507 == 0) {
                if (field858) {
                    if (field847.field2699 != null) {
                        class72 var11 = new class72();
                        var11.field593 = field847;
                        var11.field596 = var8;
                        var11.field603 = var9;
                        var11.field599 = field851;
                        var11.field600 = field847.field2699;
                        class86.method1066(var11);
                    }
                    if (field851 != null && method1800(field847) != null) {
                        class197 var12 = class197.method3184(class193.field2300, field721.field1340);
                        var12.field2375.method5387(field851.field2729);
                        var12.field2375.method5263(field851.field2691);
                        var12.field2375.method5408(field847.field2729);
                        var12.field2375.method5262(field847.field2691);
                        var12.field2375.method5274(field847.field2617);
                        var12.field2375.method5373(field851.field2617);
                        field721.method2161(var12);
                    }
                } else if (this.method1216()) {
                    this.method1540(field856 + field849, field857 + field850);
                } else if (field811 > 0) {
                    method160(field856 + field849, field857 + field850);
                }
                field847 = null;
            }
        } else if (Statics.field100 > 1) {
            field847 = null;
        }
    }

    @ObfuscatedName("av.jt(IB)V")
    public static void method551(int arg0) {
        Statics.field2028 = new class92();
        Statics.field2028.field1183 = field812[arg0];
        Statics.field2028.field1185 = field813[arg0];
        Statics.field2028.field1182 = field775[arg0];
        Statics.field2028.field1184 = field815[arg0];
        Statics.field2028.field1186 = field822[arg0];
    }

    @ObfuscatedName("d.jm(III)V")
    public static void method160(int arg0, int arg1) {
        method1037(Statics.field2028, arg0, arg1);
        Statics.field2028 = null;
    }

    @ObfuscatedName("ia.jd(Lhd;I)V")
    public static void method3872(class227 arg0) {
        if (field878 == arg0.field2635) {
            field814[arg0.field2740] = true;
        }
    }

    @ObfuscatedName("kn.jx(I)V")
    public static void method5460() {
        for (class71 var0 = (class71) field835.method5644(); var0 != null; var0 = (class71) field835.method5642()) {
            int var1 = var0.field585;
            if (class227.method3182(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field2595[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2602;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2152;
                    class227 var6 = class227.method403(var5);
                    if (var6 != null) {
                        method3872(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.jp(Lhd;I)Lhd;")
    public static class227 method128(class227 arg0) {
        class227 var1 = method1800(arg0);
        if (var1 == null) {
            var1 = arg0.field2683;
        }
        return var1;
    }

    @ObfuscatedName("aj.jn(IB)V")
    public static final void method700(int arg0) {
        if (!class227.method3182(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2731 = 0;
                var3.field2732 = 0;
            }
        }
    }

    @ObfuscatedName("ak.jl([Lhd;IB)V")
    public static final void method324(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2622 == arg1 && (!var3.field2602 || !method3092(var3))) {
                if (var3.field2605 == 0) {
                    if (!var3.field2602 && method3092(var3) && Statics.field315 != var3) {
                        continue;
                    }
                    method324(arg0, var3.field2617);
                    if (var3.field2733 != null) {
                        method324(var3.field2733, var3.field2617);
                    }
                    class71 var4 = (class71) field835.method5641((long) var3.field2617);
                    if (var4 != null) {
                        int var5 = var4.field585;
                        if (class227.method3182(var5)) {
                            method324(Statics.field2595[var5], -1);
                        }
                    }
                }
                if (var3.field2605 == 6) {
                    if (var3.field2650 != -1 || var3.field2651 != -1) {
                        boolean var6 = method742(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2651;
                        } else {
                            var7 = var3.field2650;
                        }
                        if (var7 != -1) {
                            class269 var8 = class269.method3330(var7);
                            var3.field2732 += field748;
                            while (var3.field2732 > var8.field3551[var3.field2731]) {
                                var3.field2732 -= var8.field3551[var3.field2731];
                                var3.field2731++;
                                if (var3.field2731 >= var8.field3552.length) {
                                    var3.field2731 -= var8.field3553;
                                    if (var3.field2731 < 0 || var3.field2731 >= var8.field3552.length) {
                                        var3.field2731 = 0;
                                    }
                                }
                                method3872(var3);
                            }
                        }
                    }
                    if (var3.field2659 != 0 && !var3.field2602) {
                        int var9 = var3.field2659 >> 16;
                        int var10 = var3.field2659 << 16 >> 16;
                        int var11 = field748 * var9;
                        int var12 = field748 * var10;
                        var3.field2654 = var3.field2654 + var11 & 0x7FF;
                        var3.field2655 = var3.field2655 + var12 & 0x7FF;
                        method3872(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ju(II)V")
    public static final void method273(int arg0) {
        method5460();
        class85.method2030();
        int var1 = class251.method3701(arg0).field3239;
        if (var1 == 0) {
            return;
        }
        int var2 = class222.field2562[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class140.method2897(0.9D);
                ((class129) Statics.field1804).method2586(0.9D);
            }
            if (var2 == 2) {
                class140.method2897(0.8D);
                ((class129) Statics.field1804).method2586(0.8D);
            }
            if (var2 == 3) {
                class140.method2897(0.7D);
                ((class129) Statics.field1804).method2586(0.7D);
            }
            if (var2 == 4) {
                class140.method2897(0.6D);
                ((class129) Statics.field1804).method2586(0.6D);
            }
            class265.method1083();
        }
        if (var1 == 3) {
            short var3 = 0;
            if (var2 == 0) {
                var3 = 255;
            }
            if (var2 == 1) {
                var3 = 192;
            }
            if (var2 == 2) {
                var3 = 128;
            }
            if (var2 == 3) {
                var3 = 64;
            }
            if (var2 == 4) {
                var3 = 0;
            }
            if (field907 != var3) {
                if (field907 == 0 && field682 != -1) {
                    class207.method3192(Statics.field2005, field682, 0, var3, false);
                    field744 = false;
                } else if (var3 == 0) {
                    class207.method1954();
                    field744 = false;
                } else if (class207.field2440 == 0) {
                    Statics.field257.method3473(var3);
                } else {
                    Statics.field2442 = var3;
                }
                field907 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field910 = 127;
            }
            if (var2 == 1) {
                field910 = 96;
            }
            if (var2 == 2) {
                field910 = 64;
            }
            if (var2 == 3) {
                field910 = 32;
            }
            if (var2 == 4) {
                field910 = 0;
            }
        }
        if (var1 == 5) {
            field673 = var2;
        }
        if (var1 == 6) {
            field838 = var2;
        }
        if (var1 == 9) {
            field839 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field911 = 127;
            }
            if (var2 == 1) {
                field911 = 96;
            }
            if (var2 == 2) {
                field911 = 64;
            }
            if (var2 == 3) {
                field911 = 32;
            }
            if (var2 == 4) {
                field911 = 0;
            }
        }
        if (var1 == 17) {
            field844 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class94[] var4 = new class94[] { class94.field1194, class94.field1193, class94.field1198, class94.field1195 };
            field698 = (class94) class205.method3095(var4, var2);
            if (field698 == null) {
                field698 = class94.field1195;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field781 = -1;
            } else {
                field781 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class94[] var5 = new class94[] { class94.field1194, class94.field1193, class94.field1198, class94.field1195 };
        field699 = (class94) class205.method3095(var5, var2);
        if (field699 == null) {
            field699 = class94.field1195;
        }
    }

    @ObfuscatedName("p.jq(Lhd;I)V")
    public static final void method39(class227 arg0) {
        int var1 = arg0.field2607;
        if (var1 == 324) {
            if (field869 == -1) {
                field869 = arg0.field2638;
                field939 = arg0.field2599;
            }
            if (field931.field2578) {
                arg0.field2638 = field869;
            } else {
                arg0.field2638 = field939;
            }
        } else if (var1 == 325) {
            if (field869 == -1) {
                field869 = arg0.field2638;
                field939 = arg0.field2599;
            }
            if (field931.field2578) {
                arg0.field2638 = field939;
            } else {
                arg0.field2638 = field869;
            }
        } else if (var1 == 327) {
            arg0.field2654 = 150;
            arg0.field2655 = (int) (Math.sin((double) field671 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2646 = 5;
            arg0.field2594 = 0;
        } else if (var1 == 328) {
            arg0.field2654 = 150;
            arg0.field2655 = (int) (Math.sin((double) field671 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2646 = 5;
            arg0.field2594 = 1;
        }
    }

    @ObfuscatedName("hn.ja(I)V")
    public static final void method3689() {
        class197 var0 = class197.method3184(class193.field2266, field721.field1340);
        field721.method2161(var0);
        for (class71 var1 = (class71) field835.method5644(); var1 != null; var1 = (class71) field835.method5642()) {
            if (var1.field586 == 0 || var1.field586 == 3) {
                Statics.method543(var1, true);
            }
        }
        if (field840 != null) {
            method3872(field840);
            field840 = null;
        }
    }

    @ObfuscatedName("ar.jv(IIII)Lbz;")
    public static final class71 method409(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field585 = arg1;
        var3.field586 = arg2;
        field835.method5643(var3, (long) arg0);
        method700(arg1);
        class227 var4 = class227.method403(arg0);
        method3872(var4);
        if (field840 != null) {
            method3872(field840);
            field840 = null;
        }
        for (int var5 = 0; var5 < field811; var5++) {
            int var6 = field775[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field811 - 1) {
                    for (int var8 = var5; var8 < field811 - 1; var8++) {
                        field822[var8] = field822[var8 + 1];
                        field924[var8] = field924[var8 + 1];
                        field775[var8] = field775[var8 + 1];
                        field815[var8] = field815[var8 + 1];
                        field812[var8] = field812[var8 + 1];
                        field813[var8] = field813[var8 + 1];
                        field818[var8] = field818[var8 + 1];
                    }
                }
                var5--;
                field811--;
            }
        }
        method696(Statics.field580 / 2 + Statics.field204, Statics.field1916);
        method240(Statics.field2595[arg0 >> 16], var4, false);
        class86.method3183(arg1);
        if (field834 != -1) {
            method3447(field834, 1);
        }
        return var3;
    }

    @ObfuscatedName("fw.jh(Lhd;S)Z")
    public static final boolean method3254(class227 arg0) {
        int var1 = arg0.field2607;
        if (var1 == 205) {
            field722 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field931.method3735(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field931.method3736(var4, var5 == 1);
        }
        if (var1 == 324) {
            field931.method3737(false);
        }
        if (var1 == 325) {
            field931.method3737(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method3184(class193.field2284, field721.field1340);
            field931.method3738(var6.field2375);
            field721.method2161(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("je.jb(Lhd;IIII)V")
    public static final void method4309(class227 arg0, int arg1, int arg2, int arg3) {
        method4752();
        class221 var4 = arg0.method3810(false);
        if (var4 == null) {
            return;
        }
        class331.method5691(arg1, arg2, var4.field2557 + arg1, var4.field2555 + arg2);
        if (field751 == 2 || field751 == 5) {
            class331.method5676(arg1, arg2, 0, var4.field2559, var4.field2556);
        } else {
            int var5 = field926 & 0x7FF;
            int var6 = Statics.field455.field983 / 32 + 48;
            int var7 = 464 - Statics.field455.field965 / 32;
            Statics.field12.method5878(arg1, arg2, var4.field2557, var4.field2555, var6, var7, var5, 256, var4.field2559, var4.field2556);
            for (int var8 = 0; var8 < field900; var8++) {
                int var9 = field891[var8] * 4 + 2 - Statics.field455.field983 / 32;
                int var10 = field902[var8] * 4 + 2 - Statics.field455.field965 / 32;
                method161(arg1, arg2, var9, var10, field702[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class272 var13 = field802[Statics.field1576][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field455.field983 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field455.field965 / 32;
                        method161(arg1, arg2, var14, var15, Statics.field1200[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field717; var16++) {
                class89 var17 = field716[field875[var16]];
                if (var17 != null && var17.method1124()) {
                    class267 var18 = var17.field1158;
                    if (var18 != null && var18.field3508 != null) {
                        var18 = var18.method4472();
                    }
                    if (var18 != null && var18.field3515 && var18.field3527) {
                        int var19 = var17.field983 / 32 - Statics.field455.field983 / 32;
                        int var20 = var17.field965 / 32 - Statics.field455.field965 / 32;
                        method161(arg1, arg2, var19, var20, Statics.field1200[1], var4);
                    }
                }
            }
            int var21 = class99.field1281;
            int[] var22 = class99.field1282;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field790[var22[var23]];
                if (var24 != null && var24.method1124() && !var24.field655 && Statics.field455 != var24) {
                    int var25 = var24.field983 / 32 - Statics.field455.field983 / 32;
                    int var26 = var24.field965 / 32 - Statics.field455.field965 / 32;
                    boolean var27 = false;
                    if (Statics.field455.field653 != 0 && var24.field653 != 0 && Statics.field455.field653 == var24.field653) {
                        var27 = true;
                    }
                    if (var24.method1128()) {
                        method161(arg1, arg2, var25, var26, Statics.field1200[3], var4);
                    } else if (var27) {
                        method161(arg1, arg2, var25, var26, Statics.field1200[4], var4);
                    } else if (var24.method1127()) {
                        method161(arg1, arg2, var25, var26, Statics.field1200[5], var4);
                    } else {
                        method161(arg1, arg2, var25, var26, Statics.field1200[2], var4);
                    }
                }
            }
            if (field690 != 0 && field671 % 20 < 10) {
                if (field690 == 1 && field927 >= 0 && field927 < field716.length) {
                    class89 var28 = field716[field927];
                    if (var28 != null) {
                        int var29 = var28.field983 / 32 - Statics.field455.field983 / 32;
                        int var30 = var28.field965 / 32 - Statics.field455.field965 / 32;
                        method307(arg1, arg2, var29, var30, Statics.field44[1], var4);
                    }
                }
                if (field690 == 2) {
                    int var31 = field780 * 4 - Statics.field2130 * 4 + 2 - Statics.field455.field983 / 32;
                    int var32 = field762 * 4 - Statics.field1275 * 4 + 2 - Statics.field455.field965 / 32;
                    method307(arg1, arg2, var31, var32, Statics.field44[1], var4);
                }
                if (field690 == 10 && field868 >= 0 && field868 < field790.length) {
                    class76 var33 = field790[field868];
                    if (var33 != null) {
                        int var34 = var33.field983 / 32 - Statics.field455.field983 / 32;
                        int var35 = var33.field965 / 32 - Statics.field455.field965 / 32;
                        method307(arg1, arg2, var34, var35, Statics.field44[1], var4);
                    }
                }
            }
            if (field904 != 0) {
                int var36 = field904 * 4 + 2 - Statics.field455.field983 / 32;
                int var37 = field769 * 4 + 2 - Statics.field455.field965 / 32;
                method161(arg1, arg2, var36, var37, Statics.field44[0], var4);
            }
            if (!Statics.field455.field655) {
                class331.method5686(var4.field2557 / 2 + arg1 - 1, var4.field2555 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field880[arg3] = true;
    }

    @ObfuscatedName("ks.jy(Lhd;IIII)V")
    public static final void method4986(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3810(false);
        if (var4 == null) {
            return;
        }
        if (field751 < 3) {
            Statics.field96.method5878(arg1, arg2, var4.field2557, var4.field2555, 25, 25, field926, 256, var4.field2559, var4.field2556);
        } else {
            class331.method5676(arg1, arg2, 0, var4.field2559, var4.field2556);
        }
    }

    @ObfuscatedName("ag.ji(IIIILlz;Lhh;I)V")
    public static final void method307(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method161(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field926 & 0x7FF;
        int var8 = class140.field1812[var7];
        int var9 = class140.field1813[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2557 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1971.method5886(arg5.field2557 / 2 + arg0 - var17 / 2 + var15, arg5.field2555 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("d.jf(IIIILlz;Lhh;B)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field926 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1812[var6];
        int var9 = class140.field1813[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5859(arg5.field2557 / 2 + var10 - arg4.field3893 / 2, arg5.field2555 / 2 - var11 - arg4.field3898 / 2, arg0, arg1, arg5.field2557, arg5.field2555, arg5.field2559, arg5.field2556);
        } else {
            arg4.method5855(arg5.field2557 / 2 + arg0 + var10 - arg4.field3893 / 2, arg5.field2555 / 2 + arg1 - var11 - arg4.field3898 / 2);
        }
    }

    @ObfuscatedName("as.jk(I)V")
    public static final void method398() {
        class101.method2902();
        if (Statics.field1085 != null) {
            Statics.field1085.method4968();
        }
    }

    @ObfuscatedName("u.jw(B)V")
    public static final void method69() {
        for (int var0 = 0; var0 < class99.field1281; var0++) {
            class76 var1 = field790[class99.field1282[var0]];
            var1.method1157();
        }
    }

    @ObfuscatedName("z.kc(Ljava/lang/String;I)V")
    public static final void method94(String arg0) {
        if (Statics.field1085 != null) {
            class197 var1 = class197.method3184(class193.field2326, field721.field1340);
            var1.field2375.method5437(Statics.method2147(arg0));
            var1.field2375.method5217(arg0);
            field721.method2161(var1);
        }
    }

    @ObfuscatedName("ba.kx(Ljava/lang/String;B)V")
    public static final void method758(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method3184(class193.field2293, field721.field1340);
            var1.field2375.method5437(Statics.method2147(arg0));
            var1.field2375.method5217(arg0);
            field721.method2161(var1);
        }
    }

    @ObfuscatedName("d.kp(I)V")
    public static final void method142() {
        class197 var0 = class197.method3184(class193.field2293, field721.field1340);
        var0.field2375.method5437(0);
        field721.method2161(var0);
    }

    @ObfuscatedName("hv.kf(II)V")
    public static void method3774(int arg0) {
        for (class189 var1 = (class189) field876.method5644(); var1 != null; var1 = (class189) field876.method5642()) {
            if ((long) arg0 == (var1.field2152 >> 48 & 0xFFFFL)) {
                var1.method3388();
            }
        }
    }

    @ObfuscatedName("bg.ki(Lhd;I)I")
    public static int method728(class227 arg0) {
        class189 var1 = (class189) field876.method5641(((long) arg0.field2617 << 32) + (long) arg0.field2691);
        return var1 == null ? arg0.field2676 : var1.field2150;
    }

    @ObfuscatedName("cg.kq(Lhd;B)Lhd;")
    public static class227 method1800(class227 arg0) {
        int var1 = class228.method325(method728(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class227.method403(arg0.field2622);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("el.kl(Lhd;I)Z")
    public static boolean method3092(class227 arg0) {
        return arg0.field2721;
    }

    @ObfuscatedName("az.kk(Lhd;B)Ljava/lang/String;")
    public static String method621(class227 arg0) {
        if (class228.method540(method728(arg0)) == 0) {
            return null;
        } else if (arg0.field2688 == null || arg0.field2688.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2688;
        }
    }

    @ObfuscatedName("ik.kd(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method4238(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field863 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field863 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field863 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field863 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field863 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field872 != null) {
            var3 = "/p=" + Statics.field872;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1992 + "/a=" + Statics.field2755 + var3 + "/";
    }

    @ObfuscatedName("fq.ks(Ljava/lang/String;I)V")
    public static void method3201(String arg0) {
        Statics.field872 = arg0;
        try {
            String var1 = Statics.field170.getParameter(Integer.toString(18));
            String var2 = Statics.field170.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class307.method3253() + 94608000000L;
                class217.field2538.setTime(new Date(var6));
                int var8 = class217.field2538.get(7);
                int var9 = class217.field2538.get(5);
                int var10 = class217.field2538.get(2);
                int var11 = class217.field2538.get(1);
                int var12 = class217.field2538.get(11);
                int var13 = class217.field2538.get(12);
                int var14 = class217.field2538.get(13);
                String var15 = class217.field2537[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class217.field2539[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class57.method751(Statics.field170, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("hh.km(Ljava/lang/String;ZI)V")
    public static void method3707(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3376; var5++) {
            class265 var6 = class265.method4218(var5);
            if ((!arg1 || var6.field3482) && var6.field3431 == -1 && var6.field3442.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1577 = -1;
                    Statics.field371 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        Statics.field371 = var3;
        Statics.field559 = 0;
        Statics.field1577 = var4;
        String[] var9 = new String[Statics.field1577];
        for (int var10 = 0; var10 < Statics.field1577; var10++) {
            var9[var10] = class265.method4218(var3[var10]).field3442;
        }
        class199.method323(var9, Statics.field371);
    }

    @ObfuscatedName("l.kt(Lkn;II)V")
    public static void method185(class310 arg0, int arg1) {
        byte[] var2 = arg0.field3736;
        if (field715 == null) {
            field715 = new byte[24];
        }
        class311.method5462(var2, arg1, field715, 0, 24);
        class177.method746(arg0, arg1);
    }

    @ObfuscatedName("client.kr(B)Lkq;")
    public class293 method1203() {
        return Statics.field455 == null ? null : Statics.field455.field658;
    }

    @ObfuscatedName("d.kj(IIIZB)V")
    public static void method162(int arg0, int arg1, int arg2, boolean arg3) {
        class197 var4 = class197.method3184(class193.field2278, field721.field1340);
        var4.field2375.method5263(arg1);
        var4.field2375.method5213(arg3 ? field837 : 0);
        var4.field2375.method5408(arg0);
        var4.field2375.method5253(arg2);
        field721.method2161(var4);
    }

    @ObfuscatedName("f.ke(II)V")
    public static void method216(int arg0) {
        field749 = arg0;
    }

    @ObfuscatedName("l.kv(I)V")
    public static void method177() {
        field721.method2161(class197.method3184(class193.field2340, field721.field1340));
        field749 = 0;
    }

    @ObfuscatedName("ah.kw(I)V")
    public static void method218() {
        if (field749 == 1) {
            field757 = true;
        }
    }

    @ObfuscatedName("fh.ko(I)V")
    public static void method3329() {
        if (!field757 || Statics.field455 == null) {
            return;
        }
        int var0 = Statics.field455.field1020[0];
        int var1 = Statics.field455.field1021[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field2589 = Statics.field455.field983;
        int var2 = method3439(Statics.field455.field983, Statics.field455.field965, Statics.field1576) - field750;
        if (var2 < Statics.field235) {
            Statics.field235 = var2;
        }
        Statics.field3315 = Statics.field455.field965;
        field757 = false;
    }

    @ObfuscatedName("fn.ka(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3235(String arg0) {
        class239[] var1 = Statics.method4263();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field3123 != -1 && arg0.startsWith(class91.method534(var3.field3123))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3123).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("kw.kg(B)V")
    public static void method5046() {
        if (Statics.field3586 == null) {
            return;
        }
        field943 = field671;
        Statics.field3586.method4063();
        for (int var0 = 0; var0 < field790.length; var0++) {
            if (field790[var0] != null) {
                Statics.field3586.method4078((field790[var0].field983 >> 7) + Statics.field2130, (field790[var0].field965 >> 7) + Statics.field1275);
            }
        }
    }
}

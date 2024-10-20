package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class63 implements class291 {

    @ObfuscatedName("client.w")
    public static class182[] field740 = new class182[4];

    @ObfuscatedName("client.ad")
    public static boolean field773 = true;

    @ObfuscatedName("client.bb")
    public static int field817 = 1;

    @ObfuscatedName("client.bf")
    public static int field682 = 0;

    @ObfuscatedName("client.bg")
    public static int field871 = 0;

    @ObfuscatedName("client.bl")
    public static boolean field684 = false;

    @ObfuscatedName("client.bn")
    public static boolean field685 = false;

    @ObfuscatedName("client.bw")
    public static int field686 = -1;

    @ObfuscatedName("client.bm")
    public static int field687 = -1;

    @ObfuscatedName("client.by")
    public static boolean field688 = false;

    @ObfuscatedName("client.bq")
    public static int field689 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field690 = true;

    @ObfuscatedName("client.cn")
    public static int field863 = 0;

    @ObfuscatedName("client.cw")
    public static long field894 = -1L;

    @ObfuscatedName("client.cq")
    public static int field720 = -1;

    @ObfuscatedName("client.cd")
    public static int field694 = -1;

    @ObfuscatedName("client.cj")
    public static long field695 = -1L;

    @ObfuscatedName("client.cm")
    public static boolean field895 = true;

    @ObfuscatedName("client.cb")
    public static boolean field705 = false;

    @ObfuscatedName("client.ct")
    public static int field698 = 0;

    @ObfuscatedName("client.cv")
    public static int field699 = 0;

    @ObfuscatedName("client.cz")
    public static int field700 = 0;

    @ObfuscatedName("client.ch")
    public static int field701 = 0;

    @ObfuscatedName("client.co")
    public static int field730 = 0;

    @ObfuscatedName("client.ck")
    public static int field703 = 0;

    @ObfuscatedName("client.cr")
    public static int field704 = 0;

    @ObfuscatedName("client.dg")
    public static int field953 = 0;

    @ObfuscatedName("client.db")
    public static int field752 = 0;

    @ObfuscatedName("client.df")
    public static class94 field945 = class94.field1204;

    @ObfuscatedName("client.dd")
    public static class94 field681 = class94.field1204;

    @ObfuscatedName("client.dq")
    public static int field709 = 0;

    @ObfuscatedName("client.dm")
    public static int field710 = 0;

    @ObfuscatedName("client.dh")
    public static int field795 = 0;

    @ObfuscatedName("client.eh")
    public static int field713 = 0;

    @ObfuscatedName("client.ep")
    public static int field714 = 0;

    @ObfuscatedName("client.et")
    public static int field948 = 0;

    @ObfuscatedName("client.eu")
    public static int field716 = 0;

    @ObfuscatedName("client.ei")
    public static int field717 = 0;

    @ObfuscatedName("client.ef")
    public static class170 field718 = class170.field2029;

    @ObfuscatedName("client.el")
    public static boolean field719 = false;

    @ObfuscatedName("client.es")
    public static class98 field807 = new class98();

    @ObfuscatedName("client.ee")
    public class311 field721;

    @ObfuscatedName("client.fs")
    public class10 field722;

    @ObfuscatedName("client.fw")
    public static byte[] field909 = null;

    @ObfuscatedName("client.fo")
    public static class89[] field872 = new class89[32768];

    @ObfuscatedName("client.fy")
    public static int field725 = 0;

    @ObfuscatedName("client.ff")
    public static int[] field801 = new int[32768];

    @ObfuscatedName("client.fb")
    public static int field727 = 0;

    @ObfuscatedName("client.fv")
    public static int[] field728 = new int[250];

    @ObfuscatedName("client.fg")
    public static final class105 field729 = new class105();

    @ObfuscatedName("client.fd")
    public static int field939 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field731 = false;

    @ObfuscatedName("client.fx")
    public static boolean field732 = true;

    @ObfuscatedName("client.fc")
    public static class283 field733 = new class283();

    @ObfuscatedName("client.ft")
    public static HashMap field734 = new HashMap();

    @ObfuscatedName("client.gf")
    public static int field735 = 0;

    @ObfuscatedName("client.gq")
    public static int field736 = 1;

    @ObfuscatedName("client.gh")
    public static int field849 = 0;

    @ObfuscatedName("client.gn")
    public static int field738 = 1;

    @ObfuscatedName("client.gt")
    public static int field723 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field741 = false;

    @ObfuscatedName("client.gb")
    public static int[][][] field742 = new int[4][13][13];

    @ObfuscatedName("client.gj")
    public static final int[] field955 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ga")
    public static int field744 = 0;

    @ObfuscatedName("client.hv")
    public static int field926 = 2301979;

    @ObfuscatedName("client.hn")
    public static int field766 = 5063219;

    @ObfuscatedName("client.hq")
    public static int field747 = 3353893;

    @ObfuscatedName("client.hi")
    public static int field748 = 7759444;

    @ObfuscatedName("client.hp")
    public static boolean field691 = false;

    @ObfuscatedName("client.ho")
    public static int field750 = 0;

    @ObfuscatedName("client.hc")
    public static int field802 = 128;

    @ObfuscatedName("client.ha")
    public static int field708 = 0;

    @ObfuscatedName("client.hf")
    public static int field753 = 0;

    @ObfuscatedName("client.hd")
    public static int field812 = 0;

    @ObfuscatedName("client.hg")
    public static int field755 = 0;

    @ObfuscatedName("client.he")
    public static int field756 = 0;

    @ObfuscatedName("client.is")
    public static int field757 = 0;

    @ObfuscatedName("client.ic")
    public static int field758 = 50;

    @ObfuscatedName("client.in")
    public static int field693 = 0;

    @ObfuscatedName("client.io")
    public static int field760 = 0;

    @ObfuscatedName("client.ik")
    public static int field761 = 0;

    @ObfuscatedName("client.iw")
    public static int field743 = 12;

    @ObfuscatedName("client.il")
    public static int field680 = 6;

    @ObfuscatedName("client.id")
    public static int field764 = 0;

    @ObfuscatedName("client.ib")
    public static boolean field726 = false;

    @ObfuscatedName("client.iq")
    public static int field883 = 0;

    @ObfuscatedName("client.ir")
    public static boolean field751 = false;

    @ObfuscatedName("client.it")
    public static String field836 = null;

    @ObfuscatedName("client.ig")
    public static int field811 = 0;

    @ObfuscatedName("client.ij")
    public static int field769 = 0;

    @ObfuscatedName("client.if")
    public static int field956 = 50;

    @ObfuscatedName("client.ie")
    public static int[] field771 = new int[field956];

    @ObfuscatedName("client.ia")
    public static int[] field772 = new int[field956];

    @ObfuscatedName("client.ii")
    public static int[] field715 = new int[field956];

    @ObfuscatedName("client.iu")
    public static int[] field774 = new int[field956];

    @ObfuscatedName("client.iy")
    public static int[] field775 = new int[field956];

    @ObfuscatedName("client.ju")
    public static int[] field794 = new int[field956];

    @ObfuscatedName("client.jo")
    public static int[] field777 = new int[field956];

    @ObfuscatedName("client.jd")
    public static String[] field778 = new String[field956];

    @ObfuscatedName("client.jx")
    public static int[][] field779 = new int[104][104];

    @ObfuscatedName("client.je")
    public static int field780 = 0;

    @ObfuscatedName("client.jk")
    public static int field781 = -1;

    @ObfuscatedName("client.jy")
    public static int field889 = -1;

    @ObfuscatedName("client.jn")
    public static int field783 = 0;

    @ObfuscatedName("client.jp")
    public static int field784 = 0;

    @ObfuscatedName("client.jg")
    public static int field785 = 0;

    @ObfuscatedName("client.jv")
    public static int field786 = 0;

    @ObfuscatedName("client.js")
    public static boolean field787 = true;

    @ObfuscatedName("client.jj")
    public static int field829 = 0;

    @ObfuscatedName("client.jb")
    public static int field789 = 0;

    @ObfuscatedName("client.ji")
    public static int field790 = 0;

    @ObfuscatedName("client.jq")
    public static int field791 = 0;

    @ObfuscatedName("client.jm")
    public static int field830 = 0;

    @ObfuscatedName("client.jl")
    public static int field793 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field831 = false;

    @ObfuscatedName("client.jr")
    public static int field739 = 0;

    @ObfuscatedName("client.jf")
    public static int field796 = 0;

    @ObfuscatedName("client.jz")
    public static boolean field810 = true;

    @ObfuscatedName("client.ku")
    public static class76[] field798 = new class76[2048];

    @ObfuscatedName("client.kl")
    public static int field799 = -1;

    @ObfuscatedName("client.ka")
    public static int field800 = 0;

    @ObfuscatedName("client.kd")
    public static boolean field887 = true;

    @ObfuscatedName("client.kx")
    public static int field768 = 0;

    @ObfuscatedName("client.kg")
    public static int field803 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field804 = new int[1000];

    @ObfuscatedName("client.kr")
    public static final int[] field842 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ko")
    public static String[] field806 = new String[8];

    @ObfuscatedName("client.kn")
    public static boolean[] field815 = new boolean[8];

    @ObfuscatedName("client.kc")
    public static int[] field808 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kq")
    public static int field809 = -1;

    @ObfuscatedName("client.ky")
    public static class273[][][] field914 = new class273[4][104][104];

    @ObfuscatedName("client.kp")
    public static class273 field864 = new class273();

    @ObfuscatedName("client.kj")
    public static class273 field854 = new class273();

    @ObfuscatedName("client.ks")
    public static class273 field913 = new class273();

    @ObfuscatedName("client.kb")
    public static int[] field814 = new int[25];

    @ObfuscatedName("client.kh")
    public static int[] field813 = new int[25];

    @ObfuscatedName("client.ln")
    public static int[] field816 = new int[25];

    @ObfuscatedName("client.lj")
    public static int field888 = 0;

    @ObfuscatedName("client.lg")
    public static boolean field818 = false;

    @ObfuscatedName("client.lb")
    public static int field819 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field820 = new int[500];

    @ObfuscatedName("client.lo")
    public static int[] field821 = new int[500];

    @ObfuscatedName("client.lh")
    public static int[] field822 = new int[500];

    @ObfuscatedName("client.lr")
    public static int[] field823 = new int[500];

    @ObfuscatedName("client.la")
    public static String[] field824 = new String[500];

    @ObfuscatedName("client.ll")
    public static String[] field825 = new String[500];

    @ObfuscatedName("client.ls")
    public static boolean[] field826 = new boolean[500];

    @ObfuscatedName("client.lp")
    public static boolean field827 = false;

    @ObfuscatedName("client.lf")
    public static boolean field898 = false;

    @ObfuscatedName("client.lm")
    public static boolean field770 = false;

    @ObfuscatedName("client.ly")
    public static boolean field930 = true;

    @ObfuscatedName("client.lu")
    public static int field828 = -1;

    @ObfuscatedName("client.le")
    public static int field832 = -1;

    @ObfuscatedName("client.mh")
    public static int field833 = 0;

    @ObfuscatedName("client.mx")
    public static int field834 = 50;

    @ObfuscatedName("client.my")
    public static int field767 = 0;

    @ObfuscatedName("client.ma")
    public static boolean field856 = false;

    @ObfuscatedName("client.mw")
    public static int field838 = -1;

    @ObfuscatedName("client.mj")
    public static int field839 = -1;

    @ObfuscatedName("client.mo")
    public static String field840 = null;

    @ObfuscatedName("client.mc")
    public static String field841 = null;

    @ObfuscatedName("client.mn")
    public static int field707 = -1;

    @ObfuscatedName("client.mm")
    public static class329 field843 = new class329(8);

    @ObfuscatedName("client.mv")
    public static int field844 = 0;

    @ObfuscatedName("client.ml")
    public static int field845 = -1;

    @ObfuscatedName("client.mb")
    public static int field846 = 0;

    @ObfuscatedName("client.mf")
    public static int field847 = 0;

    @ObfuscatedName("client.mg")
    public static class227 field848 = null;

    @ObfuscatedName("client.mq")
    public static int field712 = 0;

    @ObfuscatedName("client.mt")
    public static int field850 = 0;

    @ObfuscatedName("client.ms")
    public static int field851 = 0;

    @ObfuscatedName("client.mk")
    public static int field852 = -1;

    @ObfuscatedName("client.ns")
    public static boolean field865 = false;

    @ObfuscatedName("client.nr")
    public static class227 field916 = null;

    @ObfuscatedName("client.nt")
    public static class227 field855 = null;

    @ObfuscatedName("client.ni")
    public static class227 field765 = null;

    @ObfuscatedName("client.nj")
    public static int field857 = 0;

    @ObfuscatedName("client.nh")
    public static int field858 = 0;

    @ObfuscatedName("client.nb")
    public static class227 field859 = null;

    @ObfuscatedName("client.nx")
    public static boolean field860 = false;

    @ObfuscatedName("client.nd")
    public static int field861 = -1;

    @ObfuscatedName("client.ng")
    public static int field862 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field706 = false;

    @ObfuscatedName("client.ne")
    public static int field932 = -1;

    @ObfuscatedName("client.nz")
    public static int field702 = -1;

    @ObfuscatedName("client.np")
    public static boolean field931 = false;

    @ObfuscatedName("client.no")
    public static int field867 = 1;

    @ObfuscatedName("client.nk")
    public static int[] field868 = new int[32];

    @ObfuscatedName("client.ny")
    public static int field869 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field870 = new int[32];

    @ObfuscatedName("client.nq")
    public static int field942 = 0;

    @ObfuscatedName("client.na")
    public static int[] field952 = new int[32];

    @ObfuscatedName("client.ox")
    public static int field873 = 0;

    @ObfuscatedName("client.ok")
    public static int field762 = 0;

    @ObfuscatedName("client.oy")
    public static int field875 = 0;

    @ObfuscatedName("client.oe")
    public static int field876 = 0;

    @ObfuscatedName("client.oc")
    public static int field886 = 0;

    @ObfuscatedName("client.or")
    public static int field853 = 0;

    @ObfuscatedName("client.oo")
    public static int field879 = 0;

    @ObfuscatedName("client.oq")
    public static int field923 = 0;

    @ObfuscatedName("client.og")
    public static class273 field683 = new class273();

    @ObfuscatedName("client.oz")
    public static class273 field882 = new class273();

    @ObfuscatedName("client.om")
    public static class273 field940 = new class273();

    @ObfuscatedName("client.ov")
    public static class329 field884 = new class329(512);

    @ObfuscatedName("client.od")
    public static int field885 = 0;

    @ObfuscatedName("client.of")
    public static int field749 = -2;

    @ObfuscatedName("client.ou")
    public static boolean[] field835 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static boolean[] field759 = new boolean[100];

    @ObfuscatedName("client.ot")
    public static boolean[] field746 = new boolean[100];

    @ObfuscatedName("client.ol")
    public static int[] field890 = new int[100];

    @ObfuscatedName("client.oh")
    public static int[] field891 = new int[100];

    @ObfuscatedName("client.ob")
    public static int[] field892 = new int[100];

    @ObfuscatedName("client.on")
    public static int[] field893 = new int[100];

    @ObfuscatedName("client.oa")
    public static int field792 = 0;

    @ObfuscatedName("client.op")
    public static long field880 = 0L;

    @ObfuscatedName("client.pz")
    public static boolean field745 = true;

    @ObfuscatedName("client.pq")
    public static int[] field897 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.po")
    public static int field788 = 0;

    @ObfuscatedName("client.px")
    public static int field881 = 0;

    @ObfuscatedName("client.ps")
    public static String field711 = "";

    @ObfuscatedName("client.pb")
    public static long[] field901 = new long[100];

    @ObfuscatedName("client.pa")
    public static int field902 = 0;

    @ObfuscatedName("client.pn")
    public static int field903 = 0;

    @ObfuscatedName("client.pu")
    public static int[] field904 = new int[128];

    @ObfuscatedName("client.pm")
    public static int[] field905 = new int[128];

    @ObfuscatedName("client.pk")
    public static long field906 = -1L;

    @ObfuscatedName("client.pc")
    public static int field907 = -1;

    @ObfuscatedName("client.pe")
    public static int field908 = 0;

    @ObfuscatedName("client.py")
    public static int[] field724 = new int[1000];

    @ObfuscatedName("client.pd")
    public static int[] field910 = new int[1000];

    @ObfuscatedName("client.qt")
    public static class336[] field911 = new class336[1000];

    @ObfuscatedName("client.qy")
    public static int field912 = 0;

    @ObfuscatedName("client.qb")
    public static int field877 = 0;

    @ObfuscatedName("client.qn")
    public static int field900 = 0;

    @ObfuscatedName("client.qj")
    public static int field915 = 255;

    @ObfuscatedName("client.qc")
    public static int field947 = -1;

    @ObfuscatedName("client.qq")
    public static boolean field917 = false;

    @ObfuscatedName("client.qd")
    public static int field918 = 127;

    @ObfuscatedName("client.qh")
    public static int field837 = 127;

    @ObfuscatedName("client.qo")
    public static int field920 = 0;

    @ObfuscatedName("client.qv")
    public static int[] field921 = new int[50];

    @ObfuscatedName("client.qf")
    public static int[] field922 = new int[50];

    @ObfuscatedName("client.qw")
    public static int[] field805 = new int[50];

    @ObfuscatedName("client.qg")
    public static int[] field924 = new int[50];

    @ObfuscatedName("client.qs")
    public static class111[] field925 = new class111[50];

    @ObfuscatedName("client.rj")
    public static boolean field776 = false;

    @ObfuscatedName("client.rg")
    public static boolean[] field927 = new boolean[5];

    @ObfuscatedName("client.rw")
    public static int[] field928 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field929 = new int[5];

    @ObfuscatedName("client.ru")
    public static int[] field899 = new int[5];

    @ObfuscatedName("client.rp")
    public static int[] field919 = new int[5];

    @ObfuscatedName("client.rt")
    public static short field874 = 256;

    @ObfuscatedName("client.rc")
    public static short field933 = 205;

    @ObfuscatedName("client.ry")
    public static short field934 = 256;

    @ObfuscatedName("client.rm")
    public static short field935 = 320;

    @ObfuscatedName("client.rs")
    public static short field866 = 1;

    @ObfuscatedName("client.ra")
    public static short field754 = 32767;

    @ObfuscatedName("client.rd")
    public static short field938 = 1;

    @ObfuscatedName("client.rz")
    public static short field936 = 32767;

    @ObfuscatedName("client.ss")
    public static int field763 = 0;

    @ObfuscatedName("client.sr")
    public static int field941 = 0;

    @ObfuscatedName("client.sm")
    public static int field937 = 0;

    @ObfuscatedName("client.sq")
    public static int field943 = 0;

    @ObfuscatedName("client.sl")
    public static int field944 = 0;

    @ObfuscatedName("client.sa")
    public static class224 field797 = new class224();

    @ObfuscatedName("client.sy")
    public static int field946 = -1;

    @ObfuscatedName("client.so")
    public static int field896 = -1;

    @ObfuscatedName("client.sw")
    public static class341 field737 = new class340();

    @ObfuscatedName("client.sn")
    public static class19[] field949 = new class19[8];

    @ObfuscatedName("client.su")
    public static class77 field950 = new class77();

    @ObfuscatedName("client.sp")
    public static int field951 = -1;

    @ObfuscatedName("client.sb")
    public static ArrayList field782 = new ArrayList(10);

    @ObfuscatedName("client.sh")
    public static int field692 = 0;

    @ObfuscatedName("client.sd")
    public static int field954 = 0;

    @ObfuscatedName("client.tz")
    public static final class75 field878 = new class75();

    @ObfuscatedName("client.tl")
    public static int[] field696 = new int[50];

    @ObfuscatedName("client.tj")
    public static int[] field957 = new int[50];

    @ObfuscatedName("bj.ep(I)Lmi;")
    public static class344 method794() {
        return Statics.field419;
    }

    @ObfuscatedName("client.aa(B)V")
    public final void method883() {
    }

    public final void init() {
        if (!this.method860()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field732 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1184)) {
                            field684 = true;
                        } else {
                            field684 = false;
                        }
                        break;
                    case 4:
                        if (field686 == -1) {
                            field686 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field682 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3691 = class200.method3472(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class241[] var4 = new class241[] { class241.field3133, class241.field3137, class241.field3132, class241.field3135 };
                        class241[] var5 = var4;
                        int var6 = 0;
                        class241 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class241 var7 = var5[var6];
                            if (var7.field3134 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field1335 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1184)) {
                        }
                        break;
                    case 9:
                        Statics.field282 = var2;
                        break;
                    case 10:
                        Statics.field59 = (class242) class205.method3432(class242.method2033(), Integer.parseInt(var2));
                        if (Statics.field59 == class242.field3145) {
                            Statics.field1990 = class349.field4073;
                        } else {
                            Statics.field1990 = class349.field4062;
                        }
                        break;
                    case 12:
                        field817 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1562 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field871 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1437 = var2;
                }
            }
        }
        class143.field1878 = false;
        field685 = false;
        Statics.field2027 = this.getCodeBase().getHost();
        String var9 = Statics.field1335.field3136;
        byte var10 = 0;
        try {
            class177.method3686("oldschool", var9, var10, 21);
        } catch (Exception var12) {
            class352.method2205((String) null, var12);
        }
        Statics.field3753 = this;
        Statics.field3152 = field686;
        if (field687 == -1) {
            field687 = 0;
        }
        this.method858(765, 503, 192);
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method873() {
        class313.method3120(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2559 = field871 == 0 ? 43594 : field817 + 40000;
        Statics.field2552 = field871 == 0 ? 443 : field817 + 50000;
        Statics.field301 = Statics.field2559;
        Statics.field2560 = class225.field2571;
        Statics.field629 = class225.field2574;
        Statics.field3672 = class225.field2572;
        Statics.field2517 = class225.field2573;
        Statics.field402 = new class153();
        this.method852();
        this.method939();
        Statics.field37 = this.method902();
        Statics.field58 = new class319(255, class177.field2080, class177.field2079, 500000);
        class354 var1 = null;
        class83 var2 = new class83();
        try {
            var1 = class177.method592("", Statics.field59.field3142, false);
            byte[] var3 = new byte[(int) var1.method6195()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6190(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class83(new class311(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method6181();
            }
        } catch (Exception var11) {
        }
        Statics.field108 = var2;
        this.method850();
        String var10 = Statics.field972;
        class61.field455 = this;
        if (var10 != null) {
            class61.field454 = var10;
        }
        if (field871 != 0) {
            field705 = true;
        }
        method4717(Statics.field108.field1091);
        Statics.field150 = new class84(Statics.field1990);
    }

    @ObfuscatedName("client.az(I)V")
    public final void method874() {
        field863++;
        this.method1228();
        while (true) {
            class273 var1 = class246.field3179;
            class243 var2;
            synchronized (class246.field3179) {
                var2 = (class243) class246.field3175.method4636();
            }
            if (var2 == null) {
                try {
                    if (class207.field2435 == 1) {
                        int var4 = Statics.field54.method3518();
                        if (var4 > 0 && Statics.field54.method3524()) {
                            int var5 = var4 - Statics.field2512;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field54.method3517(var5);
                        } else {
                            Statics.field54.method3523();
                            Statics.field54.method3521();
                            if (Statics.field126 == null) {
                                class207.field2435 = 0;
                            } else {
                                class207.field2435 = 2;
                            }
                            Statics.field598 = null;
                            Statics.field4063 = null;
                        }
                    }
                } catch (Exception var257) {
                    var257.printStackTrace();
                    Statics.field54.method3523();
                    class207.field2435 = 0;
                    Statics.field598 = null;
                    Statics.field4063 = null;
                    Statics.field126 = null;
                }
                method1837();
                class55.method1834();
                class64 var7 = class64.field527;
                synchronized (class64.field527) {
                    class64.field512 = class64.field508;
                    class64.field510 = class64.field519;
                    class64.field514 = class64.field503;
                    class64.field515 = class64.field511;
                    class64.field520 = class64.field516;
                    class64.field525 = class64.field517;
                    class64.field522 = class64.field518;
                    class64.field523 = class64.field506;
                    class64.field516 = 0;
                }
                if (Statics.field37 != null) {
                    int var9 = Statics.field37.method745();
                    field923 = var9;
                }
                if (field689 == 0) {
                    method5886();
                    class63.method443();
                } else if (field689 == 5) {
                    Statics.method795(this);
                    method5886();
                    class63.method443();
                } else if (field689 == 10 || field689 == 11) {
                    Statics.method795(this);
                } else if (field689 == 20) {
                    Statics.method795(this);
                    this.method1449();
                } else if (field689 == 25) {
                    method211(false);
                    field735 = 0;
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field86.length; var11++) {
                        if (Statics.field110[var11] != -1 && Statics.field86[var11] == null) {
                            Statics.field86[var11] = Statics.field1303.method3905(Statics.field110[var11], 0);
                            if (Statics.field86[var11] == null) {
                                var10 = false;
                                field735++;
                            }
                        }
                        if (Statics.field1943[var11] != -1 && Statics.field502[var11] == null) {
                            Statics.field502[var11] = Statics.field1303.method3917(Statics.field1943[var11], 0, Statics.field379[var11]);
                            if (Statics.field502[var11] == null) {
                                var10 = false;
                                field735++;
                            }
                        }
                    }
                    if (var10) {
                        field849 = 0;
                        boolean var12 = true;
                        for (int var13 = 0; var13 < Statics.field86.length; var13++) {
                            byte[] var14 = Statics.field502[var13];
                            if (var14 != null) {
                                int var15 = (Statics.field403[var13] >> 8) * 64 - Statics.field1641;
                                int var16 = (Statics.field403[var13] & 0xFF) * 64 - Statics.field132;
                                if (field741) {
                                    var15 = 10;
                                    var16 = 10;
                                }
                                boolean var18 = true;
                                class311 var19 = new class311(var14);
                                int var20 = -1;
                                label1191: while (true) {
                                    int var21 = var19.method5286();
                                    if (var21 == 0) {
                                        var12 &= var18;
                                        break;
                                    }
                                    var20 += var21;
                                    int var22 = 0;
                                    boolean var23 = false;
                                    while (true) {
                                        while (!var23) {
                                            int var25 = var19.method5194();
                                            if (var25 == 0) {
                                                continue label1191;
                                            }
                                            var22 += var25 - 1;
                                            int var26 = var22 & 0x3F;
                                            int var27 = var22 >> 6 & 0x3F;
                                            int var28 = var19.method5276() >> 2;
                                            int var29 = var15 + var27;
                                            int var30 = var16 + var26;
                                            if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                                                class265 var31 = class265.method1122(var20);
                                                if (var28 != 22 || !field685 || var31.field3401 != 0 || var31.field3391 == 1 || var31.field3421) {
                                                    if (!var31.method4356()) {
                                                        field849++;
                                                        var18 = false;
                                                    }
                                                    var23 = true;
                                                }
                                            }
                                        }
                                        int var24 = var19.method5194();
                                        if (var24 == 0) {
                                            break;
                                        }
                                        var19.method5276();
                                    }
                                }
                            }
                        }
                        if (var12) {
                            if (field723 != 0) {
                                method326(class234.field3069 + class91.field1183 + class91.field1180 + 100 + "%" + class91.field1181, true);
                            }
                            method1837();
                            Statics.field2412.method2952();
                            for (int var33 = 0; var33 < 4; var33++) {
                                field740[var33].method3363();
                            }
                            for (int var34 = 0; var34 < 4; var34++) {
                                for (int var35 = 0; var35 < 104; var35++) {
                                    for (int var36 = 0; var36 < 104; var36++) {
                                        class65.field538[var34][var35][var36] = 0;
                                    }
                                }
                            }
                            method1837();
                            class65.method4004();
                            int var37 = Statics.field86.length;
                            for (class85 var38 = (class85) class85.field1106.method4638(); var38 != null; var38 = (class85) class85.field1106.method4640()) {
                                if (var38.field1107 != null) {
                                    Statics.field70.method2225(var38.field1107);
                                    var38.field1107 = null;
                                }
                                if (var38.field1100 != null) {
                                    Statics.field70.method2225(var38.field1100);
                                    var38.field1100 = null;
                                }
                            }
                            class85.field1106.method4633();
                            method211(true);
                            if (!field741) {
                                int var39 = 0;
                                label1123: while (true) {
                                    if (var39 >= var37) {
                                        for (int var53 = 0; var53 < var37; var53++) {
                                            int var54 = (Statics.field403[var53] >> 8) * 64 - Statics.field1641;
                                            int var55 = (Statics.field403[var53] & 0xFF) * 64 - Statics.field132;
                                            byte[] var56 = Statics.field86[var53];
                                            if (var56 == null && Statics.field199 < 800) {
                                                method1837();
                                                class65.method1659(var54, var55, 64, 64);
                                            }
                                        }
                                        method211(true);
                                        int var57 = 0;
                                        while (true) {
                                            if (var57 >= var37) {
                                                break label1123;
                                            }
                                            byte[] var58 = Statics.field502[var57];
                                            if (var58 != null) {
                                                int var59 = (Statics.field403[var57] >> 8) * 64 - Statics.field1641;
                                                int var60 = (Statics.field403[var57] & 0xFF) * 64 - Statics.field132;
                                                method1837();
                                                class143 var61 = Statics.field2412;
                                                class182[] var62 = field740;
                                                class311 var63 = new class311(var58);
                                                int var64 = -1;
                                                while (true) {
                                                    int var65 = var63.method5286();
                                                    if (var65 == 0) {
                                                        break;
                                                    }
                                                    var64 += var65;
                                                    int var66 = 0;
                                                    while (true) {
                                                        int var67 = var63.method5194();
                                                        if (var67 == 0) {
                                                            break;
                                                        }
                                                        var66 += var67 - 1;
                                                        int var68 = var66 & 0x3F;
                                                        int var69 = var66 >> 6 & 0x3F;
                                                        int var70 = var66 >> 12;
                                                        int var71 = var63.method5276();
                                                        int var72 = var71 >> 2;
                                                        int var73 = var71 & 0x3;
                                                        int var74 = var59 + var69;
                                                        int var75 = var60 + var68;
                                                        if (var74 > 0 && var75 > 0 && var74 < 103 && var75 < 103) {
                                                            int var76 = var70;
                                                            if ((class65.field538[1][var74][var75] & 0x2) == 2) {
                                                                var76 = var70 - 1;
                                                            }
                                                            class182 var77 = null;
                                                            if (var76 >= 0) {
                                                                var77 = var62[var76];
                                                            }
                                                            class65.method1967(var70, var74, var75, var64, var73, var72, var61, var77);
                                                        }
                                                    }
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                    int var40 = (Statics.field403[var39] >> 8) * 64 - Statics.field1641;
                                    int var41 = (Statics.field403[var39] & 0xFF) * 64 - Statics.field132;
                                    byte[] var42 = Statics.field86[var39];
                                    if (var42 != null) {
                                        method1837();
                                        int var43 = Statics.field79 * 8 - 48;
                                        int var44 = Statics.field199 * 8 - 48;
                                        class182[] var45 = field740;
                                        int var46 = 0;
                                        label1120: while (true) {
                                            if (var46 >= 4) {
                                                class311 var49 = new class311(var42);
                                                int var50 = 0;
                                                while (true) {
                                                    if (var50 >= 4) {
                                                        break label1120;
                                                    }
                                                    for (int var51 = 0; var51 < 64; var51++) {
                                                        for (int var52 = 0; var52 < 64; var52++) {
                                                            class65.method1689(var49, var50, var40 + var51, var41 + var52, var43, var44, 0);
                                                        }
                                                    }
                                                    var50++;
                                                }
                                            }
                                            for (int var47 = 0; var47 < 64; var47++) {
                                                for (int var48 = 0; var48 < 64; var48++) {
                                                    if (var40 + var47 > 0 && var40 + var47 < 103 && var41 + var48 > 0 && var41 + var48 < 103) {
                                                        var45[var46].field2119[var40 + var47][var41 + var48] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var46++;
                                        }
                                    }
                                    var39++;
                                }
                            }
                            if (field741) {
                                int var78 = 0;
                                label1056: while (true) {
                                    if (var78 >= 4) {
                                        for (int var89 = 0; var89 < 13; var89++) {
                                            for (int var90 = 0; var90 < 13; var90++) {
                                                int var91 = field742[0][var89][var90];
                                                if (var91 == -1) {
                                                    class65.method1659(var89 * 8, var90 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method211(true);
                                        int var92 = 0;
                                        while (true) {
                                            if (var92 >= 4) {
                                                break label1056;
                                            }
                                            method1837();
                                            for (int var93 = 0; var93 < 13; var93++) {
                                                label1013: for (int var94 = 0; var94 < 13; var94++) {
                                                    int var95 = field742[var92][var93][var94];
                                                    if (var95 != -1) {
                                                        int var96 = var95 >> 24 & 0x3;
                                                        int var97 = var95 >> 1 & 0x3;
                                                        int var98 = var95 >> 14 & 0x3FF;
                                                        int var99 = var95 >> 3 & 0x7FF;
                                                        int var100 = (var98 / 8 << 8) + var99 / 8;
                                                        for (int var101 = 0; var101 < Statics.field403.length; var101++) {
                                                            if (Statics.field403[var101] == var100 && Statics.field502[var101] != null) {
                                                                byte[] var102 = Statics.field502[var101];
                                                                int var103 = var93 * 8;
                                                                int var104 = var94 * 8;
                                                                int var105 = (var98 & 0x7) * 8;
                                                                int var106 = (var99 & 0x7) * 8;
                                                                class143 var107 = Statics.field2412;
                                                                class182[] var108 = field740;
                                                                class311 var109 = new class311(var102);
                                                                int var110 = -1;
                                                                while (true) {
                                                                    int var111 = var109.method5286();
                                                                    if (var111 == 0) {
                                                                        continue label1013;
                                                                    }
                                                                    var110 += var111;
                                                                    int var112 = 0;
                                                                    while (true) {
                                                                        int var113 = var109.method5194();
                                                                        if (var113 == 0) {
                                                                            break;
                                                                        }
                                                                        var112 += var113 - 1;
                                                                        int var114 = var112 & 0x3F;
                                                                        int var115 = var112 >> 6 & 0x3F;
                                                                        int var116 = var112 >> 12;
                                                                        int var117 = var109.method5276();
                                                                        int var118 = var117 >> 2;
                                                                        int var119 = var117 & 0x3;
                                                                        if (var96 == var116 && var115 >= var105 && var115 < var105 + 8 && var114 >= var106 && var114 < var106 + 8) {
                                                                            class265 var120 = class265.method1122(var110);
                                                                            int var121 = var103 + class226.method2641(var115 & 0x7, var114 & 0x7, var97, var120.field3389, var120.field3390, var119);
                                                                            int var122 = var104 + class226.method1113(var115 & 0x7, var114 & 0x7, var97, var120.field3389, var120.field3390, var119);
                                                                            if (var121 > 0 && var122 > 0 && var121 < 103 && var122 < 103) {
                                                                                int var123 = var92;
                                                                                if ((class65.field538[1][var121][var122] & 0x2) == 2) {
                                                                                    var123 = var92 - 1;
                                                                                }
                                                                                class182 var124 = null;
                                                                                if (var123 >= 0) {
                                                                                    var124 = var108[var123];
                                                                                }
                                                                                class65.method1967(var92, var121, var122, var110, var97 + var119 & 0x3, var118, var107, var124);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var92++;
                                        }
                                    }
                                    method1837();
                                    for (int var79 = 0; var79 < 13; var79++) {
                                        for (int var80 = 0; var80 < 13; var80++) {
                                            boolean var81 = false;
                                            int var82 = field742[var78][var79][var80];
                                            if (var82 != -1) {
                                                int var83 = var82 >> 24 & 0x3;
                                                int var84 = var82 >> 1 & 0x3;
                                                int var85 = var82 >> 14 & 0x3FF;
                                                int var86 = var82 >> 3 & 0x7FF;
                                                int var87 = (var85 / 8 << 8) + var86 / 8;
                                                for (int var88 = 0; var88 < Statics.field403.length; var88++) {
                                                    if (Statics.field403[var88] == var87 && Statics.field86[var88] != null) {
                                                        class65.method1015(Statics.field86[var88], var78, var79 * 8, var80 * 8, var83, (var85 & 0x7) * 8, (var86 & 0x7) * 8, var84, field740);
                                                        var81 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var81) {
                                                class65.method3900(var78, var79 * 8, var80 * 8);
                                            }
                                        }
                                    }
                                    var78++;
                                }
                            }
                            method211(true);
                            method1837();
                            class143 var125 = Statics.field2412;
                            class182[] var126 = field740;
                            for (int var127 = 0; var127 < 4; var127++) {
                                for (int var128 = 0; var128 < 104; var128++) {
                                    for (int var129 = 0; var129 < 104; var129++) {
                                        if ((class65.field538[var127][var128][var129] & 0x1) == 1) {
                                            int var130 = var127;
                                            if ((class65.field538[1][var128][var129] & 0x2) == 2) {
                                                var130 = var127 - 1;
                                            }
                                            if (var130 >= 0) {
                                                var126[var130].method3366(var128, var129);
                                            }
                                        }
                                    }
                                }
                            }
                            class65.field540 += (int) (Math.random() * 5.0D) - 2;
                            if (class65.field540 < -8) {
                                class65.field540 = -8;
                            }
                            if (class65.field540 > 8) {
                                class65.field540 = 8;
                            }
                            class65.field541 += (int) (Math.random() * 5.0D) - 2;
                            if (class65.field541 < -16) {
                                class65.field541 = -16;
                            }
                            if (class65.field541 > 16) {
                                class65.field541 = 16;
                            }
                            for (int var131 = 0; var131 < 4; var131++) {
                                byte[][] var132 = Statics.field3680[var131];
                                int var133 = (int) Math.sqrt(5100.0D);
                                int var134 = var133 * 768 >> 8;
                                for (int var135 = 1; var135 < 103; var135++) {
                                    for (int var136 = 1; var136 < 103; var136++) {
                                        int var137 = class65.field531[var131][var136 + 1][var135] - class65.field531[var131][var136 - 1][var135];
                                        int var138 = class65.field531[var131][var136][var135 + 1] - class65.field531[var131][var136][var135 - 1];
                                        int var139 = (int) Math.sqrt((double) (var138 * var138 + var137 * var137 + 65536));
                                        int var140 = (var137 << 8) / var139;
                                        int var141 = 65536 / var139;
                                        int var142 = (var138 << 8) / var139;
                                        int var143 = (var142 * -50 + var140 * -50 + var141 * -10) / var134 + 96;
                                        int var144 = (var132[var136][var135] >> 1) + (var132[var136][var135 + 1] >> 3) + (var132[var136][var135 - 1] >> 2) + (var132[var136 - 1][var135] >> 2) + (var132[var136 + 1][var135] >> 3);
                                        Statics.field2000[var136][var135] = var143 - var144;
                                    }
                                }
                                for (int var145 = 0; var145 < 104; var145++) {
                                    Statics.field679[var145] = 0;
                                    Statics.field3116[var145] = 0;
                                    Statics.field1565[var145] = 0;
                                    Statics.field3218[var145] = 0;
                                    Statics.field2[var145] = 0;
                                }
                                for (int var146 = -5; var146 < 109; var146++) {
                                    for (int var147 = 0; var147 < 104; var147++) {
                                        int var148 = var146 + 5;
                                        int var10002;
                                        if (var148 >= 0 && var148 < 104) {
                                            int var149 = Statics.field1274[var131][var148][var147] & 0xFF;
                                            if (var149 > 0) {
                                                class256 var150 = class256.method3877(var149 - 1);
                                                Statics.field679[var147] += var150.field3287;
                                                Statics.field3116[var147] += var150.field3288;
                                                Statics.field1565[var147] += var150.field3289;
                                                Statics.field3218[var147] += var150.field3290;
                                                var10002 = Statics.field2[var147]++;
                                            }
                                        }
                                        int var151 = var146 - 5;
                                        if (var151 >= 0 && var151 < 104) {
                                            int var152 = Statics.field1274[var131][var151][var147] & 0xFF;
                                            if (var152 > 0) {
                                                class256 var153 = class256.method3877(var152 - 1);
                                                Statics.field679[var147] -= var153.field3287;
                                                Statics.field3116[var147] -= var153.field3288;
                                                Statics.field1565[var147] -= var153.field3289;
                                                Statics.field3218[var147] -= var153.field3290;
                                                var10002 = Statics.field2[var147]--;
                                            }
                                        }
                                    }
                                    if (var146 >= 1 && var146 < 103) {
                                        int var154 = 0;
                                        int var155 = 0;
                                        int var156 = 0;
                                        int var157 = 0;
                                        int var158 = 0;
                                        for (int var159 = -5; var159 < 109; var159++) {
                                            int var160 = var159 + 5;
                                            if (var160 >= 0 && var160 < 104) {
                                                var154 += Statics.field679[var160];
                                                var155 += Statics.field3116[var160];
                                                var156 += Statics.field1565[var160];
                                                var157 += Statics.field3218[var160];
                                                var158 += Statics.field2[var160];
                                            }
                                            int var161 = var159 - 5;
                                            if (var161 >= 0 && var161 < 104) {
                                                var154 -= Statics.field679[var161];
                                                var155 -= Statics.field3116[var161];
                                                var156 -= Statics.field1565[var161];
                                                var157 -= Statics.field3218[var161];
                                                var158 -= Statics.field2[var161];
                                            }
                                            if (var159 >= 1 && var159 < 103 && (!field685 || (class65.field538[0][var146][var159] & 0x2) != 0 || (class65.field538[var131][var146][var159] & 0x10) == 0)) {
                                                if (var131 < class65.field539) {
                                                    class65.field539 = var131;
                                                }
                                                int var162 = Statics.field1274[var131][var146][var159] & 0xFF;
                                                int var163 = Statics.field1162[var131][var146][var159] & 0xFF;
                                                if (var162 > 0 || var163 > 0) {
                                                    int var164 = class65.field531[var131][var146][var159];
                                                    int var165 = class65.field531[var131][var146 + 1][var159];
                                                    int var166 = class65.field531[var131][var146 + 1][var159 + 1];
                                                    int var167 = class65.field531[var131][var146][var159 + 1];
                                                    int var168 = Statics.field2000[var146][var159];
                                                    int var169 = Statics.field2000[var146 + 1][var159];
                                                    int var170 = Statics.field2000[var146 + 1][var159 + 1];
                                                    int var171 = Statics.field2000[var146][var159 + 1];
                                                    int var172 = -1;
                                                    int var173 = -1;
                                                    if (var162 > 0) {
                                                        int var174 = var154 * 256 / var157;
                                                        int var175 = var155 / var158;
                                                        int var176 = var156 / var158;
                                                        var172 = class65.method729(var174, var175, var176);
                                                        int var177 = class65.field540 + var174 & 0xFF;
                                                        int var178 = class65.field541 + var176;
                                                        if (var178 < 0) {
                                                            var178 = 0;
                                                        } else if (var178 > 255) {
                                                            var178 = 255;
                                                        }
                                                        var173 = class65.method729(var177, var175, var178);
                                                    }
                                                    if (var131 > 0) {
                                                        boolean var179 = true;
                                                        if (var162 == 0 && Statics.field532[var131][var146][var159] != 0) {
                                                            var179 = false;
                                                        }
                                                        if (var163 > 0 && !class269.method1660(var163 - 1).field3527) {
                                                            var179 = false;
                                                        }
                                                        if (var179 && var164 == var165 && var164 == var166 && var164 == var167) {
                                                            Statics.field2001[var131][var146][var159] |= 0x924;
                                                        }
                                                    }
                                                    int var180 = 0;
                                                    if (var173 != -1) {
                                                        var180 = class140.field1811[class65.method4146(var173, 96)];
                                                    }
                                                    if (var163 == 0) {
                                                        var125.method2957(var131, var146, var159, 0, 0, -1, var164, var165, var166, var167, class65.method4146(var172, var168), class65.method4146(var172, var169), class65.method4146(var172, var170), class65.method4146(var172, var171), 0, 0, 0, 0, var180, 0);
                                                    } else {
                                                        int var181 = Statics.field532[var131][var146][var159] + 1;
                                                        byte var182 = Statics.field3860[var131][var146][var159];
                                                        class269 var183 = class269.method1660(var163 - 1);
                                                        int var184 = var183.field3525;
                                                        int var185;
                                                        int var186;
                                                        if (var184 >= 0) {
                                                            var185 = Statics.field1802.method2620(var184);
                                                            var186 = -1;
                                                        } else if (var183.field3528 == 16711935) {
                                                            var186 = -2;
                                                            var184 = -1;
                                                            var185 = -2;
                                                        } else {
                                                            var186 = class65.method729(var183.field3526, var183.field3529, var183.field3530);
                                                            int var187 = class65.field540 + var183.field3526 & 0xFF;
                                                            int var188 = class65.field541 + var183.field3530;
                                                            if (var188 < 0) {
                                                                var188 = 0;
                                                            } else if (var188 > 255) {
                                                                var188 = 255;
                                                            }
                                                            var185 = class65.method729(var187, var183.field3529, var188);
                                                        }
                                                        int var189 = 0;
                                                        if (var185 != -2) {
                                                            var189 = class140.field1811[class65.method15(var185, 96)];
                                                        }
                                                        if (var183.field3533 != -1) {
                                                            int var190 = class65.field540 + var183.field3531 & 0xFF;
                                                            int var191 = class65.field541 + var183.field3524;
                                                            if (var191 < 0) {
                                                                var191 = 0;
                                                            } else if (var191 > 255) {
                                                                var191 = 255;
                                                            }
                                                            int var192 = class65.method729(var190, var183.field3532, var191);
                                                            var189 = class140.field1811[class65.method15(var192, 96)];
                                                        }
                                                        var125.method2957(var131, var146, var159, var181, var182, var184, var164, var165, var166, var167, class65.method4146(var172, var168), class65.method4146(var172, var169), class65.method4146(var172, var170), class65.method4146(var172, var171), class65.method15(var186, var168), class65.method15(var186, var169), class65.method15(var186, var170), class65.method15(var186, var171), var180, var189);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var193 = 1; var193 < 103; var193++) {
                                    for (int var194 = 1; var194 < 103; var194++) {
                                        int var199;
                                        if ((class65.field538[var131][var194][var193] & 0x8) != 0) {
                                            var199 = 0;
                                        } else if (var131 <= 0 || (class65.field538[1][var194][var193] & 0x2) == 0) {
                                            var199 = var131;
                                        } else {
                                            var199 = var131 - 1;
                                        }
                                        var125.method2956(var131, var194, var193, var199);
                                    }
                                }
                                Statics.field1274[var131] = (byte[][]) null;
                                Statics.field1162[var131] = (byte[][]) null;
                                Statics.field532[var131] = (byte[][]) null;
                                Statics.field3860[var131] = (byte[][]) null;
                                Statics.field3680[var131] = (byte[][]) null;
                            }
                            var125.method2983(-50, -10, -50);
                            for (int var200 = 0; var200 < 104; var200++) {
                                for (int var201 = 0; var201 < 104; var201++) {
                                    if ((class65.field538[1][var200][var201] & 0x2) == 2) {
                                        var125.method2954(var200, var201);
                                    }
                                }
                            }
                            int var202 = 1;
                            int var203 = 2;
                            int var204 = 4;
                            for (int var205 = 0; var205 < 4; var205++) {
                                if (var205 > 0) {
                                    var202 <<= 0x3;
                                    var203 <<= 0x3;
                                    var204 <<= 0x3;
                                }
                                for (int var206 = 0; var206 <= var205; var206++) {
                                    for (int var207 = 0; var207 <= 104; var207++) {
                                        for (int var208 = 0; var208 <= 104; var208++) {
                                            if ((Statics.field2001[var206][var208][var207] & var202) != 0) {
                                                int var209 = var207;
                                                int var210 = var207;
                                                int var211 = var206;
                                                int var212 = var206;
                                                while (var209 > 0 && (Statics.field2001[var206][var208][var209 - 1] & var202) != 0) {
                                                    var209--;
                                                }
                                                while (var210 < 104 && (Statics.field2001[var206][var208][var210 + 1] & var202) != 0) {
                                                    var210++;
                                                }
                                                label732: while (var211 > 0) {
                                                    for (int var213 = var209; var213 <= var210; var213++) {
                                                        if ((Statics.field2001[var211 - 1][var208][var213] & var202) == 0) {
                                                            break label732;
                                                        }
                                                    }
                                                    var211--;
                                                }
                                                label721: while (var212 < var205) {
                                                    for (int var214 = var209; var214 <= var210; var214++) {
                                                        if ((Statics.field2001[var212 + 1][var208][var214] & var202) == 0) {
                                                            break label721;
                                                        }
                                                    }
                                                    var212++;
                                                }
                                                int var215 = (var212 + 1 - var211) * (var210 - var209 + 1);
                                                if (var215 >= 8) {
                                                    short var216 = 240;
                                                    int var217 = class65.field531[var212][var208][var209] - var216;
                                                    int var218 = class65.field531[var211][var208][var209];
                                                    class143.method2955(var205, 1, var208 * 128, var208 * 128, var209 * 128, var210 * 128 + 128, var217, var218);
                                                    for (int var219 = var211; var219 <= var212; var219++) {
                                                        for (int var220 = var209; var220 <= var210; var220++) {
                                                            Statics.field2001[var219][var208][var220] &= ~var202;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2001[var206][var208][var207] & var203) != 0) {
                                                int var221 = var208;
                                                int var222 = var208;
                                                int var223 = var206;
                                                int var224 = var206;
                                                while (var221 > 0 && (Statics.field2001[var206][var221 - 1][var207] & var203) != 0) {
                                                    var221--;
                                                }
                                                while (var222 < 104 && (Statics.field2001[var206][var222 + 1][var207] & var203) != 0) {
                                                    var222++;
                                                }
                                                label785: while (var223 > 0) {
                                                    for (int var225 = var221; var225 <= var222; var225++) {
                                                        if ((Statics.field2001[var223 - 1][var225][var207] & var203) == 0) {
                                                            break label785;
                                                        }
                                                    }
                                                    var223--;
                                                }
                                                label774: while (var224 < var205) {
                                                    for (int var226 = var221; var226 <= var222; var226++) {
                                                        if ((Statics.field2001[var224 + 1][var226][var207] & var203) == 0) {
                                                            break label774;
                                                        }
                                                    }
                                                    var224++;
                                                }
                                                int var227 = (var224 + 1 - var223) * (var222 - var221 + 1);
                                                if (var227 >= 8) {
                                                    short var228 = 240;
                                                    int var229 = class65.field531[var224][var221][var207] - var228;
                                                    int var230 = class65.field531[var223][var221][var207];
                                                    class143.method2955(var205, 2, var221 * 128, var222 * 128 + 128, var207 * 128, var207 * 128, var229, var230);
                                                    for (int var231 = var223; var231 <= var224; var231++) {
                                                        for (int var232 = var221; var232 <= var222; var232++) {
                                                            Statics.field2001[var231][var232][var207] &= ~var203;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2001[var206][var208][var207] & var204) != 0) {
                                                int var233 = var208;
                                                int var234 = var208;
                                                int var235 = var207;
                                                int var236 = var207;
                                                while (var235 > 0 && (Statics.field2001[var206][var208][var235 - 1] & var204) != 0) {
                                                    var235--;
                                                }
                                                while (var236 < 104 && (Statics.field2001[var206][var208][var236 + 1] & var204) != 0) {
                                                    var236++;
                                                }
                                                label838: while (var233 > 0) {
                                                    for (int var237 = var235; var237 <= var236; var237++) {
                                                        if ((Statics.field2001[var206][var233 - 1][var237] & var204) == 0) {
                                                            break label838;
                                                        }
                                                    }
                                                    var233--;
                                                }
                                                label827: while (var234 < 104) {
                                                    for (int var238 = var235; var238 <= var236; var238++) {
                                                        if ((Statics.field2001[var206][var234 + 1][var238] & var204) == 0) {
                                                            break label827;
                                                        }
                                                    }
                                                    var234++;
                                                }
                                                if ((var234 - var233 + 1) * (var236 - var235 + 1) >= 4) {
                                                    int var239 = class65.field531[var206][var233][var235];
                                                    class143.method2955(var205, 4, var233 * 128, var234 * 128 + 128, var235 * 128, var236 * 128 + 128, var239, var239);
                                                    for (int var240 = var233; var240 <= var234; var240++) {
                                                        for (int var241 = var235; var241 <= var236; var241++) {
                                                            Statics.field2001[var206][var240][var241] &= ~var204;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method211(true);
                            int var242 = class65.field539;
                            if (var242 > Statics.field99) {
                                var242 = Statics.field99;
                            }
                            if (var242 < Statics.field99 - 1) {
                                int var243 = Statics.field99 - 1;
                            }
                            if (field685) {
                                Statics.field2412.method3005(class65.field539);
                            } else {
                                Statics.field2412.method3005(0);
                            }
                            for (int var244 = 0; var244 < 104; var244++) {
                                for (int var245 = 0; var245 < 104; var245++) {
                                    method593(var244, var245);
                                }
                            }
                            method1837();
                            for (class78 var246 = (class78) field864.method4638(); var246 != null; var246 = (class78) field864.method4640()) {
                                if (var246.field970 == -1) {
                                    var246.field969 = 0;
                                    Statics.method3310(var246);
                                } else {
                                    var246.method3407();
                                }
                            }
                            class265.field3377.method3158();
                            if (Statics.field3753.method882()) {
                                class197 var247 = class197.method57(class193.field2331, field729.field1347);
                                var247.field2371.method5166(1057001181);
                                field729.method2178(var247);
                            }
                            if (!field741) {
                                int var248 = (Statics.field79 - 6) / 8;
                                int var249 = (Statics.field79 + 6) / 8;
                                int var250 = (Statics.field199 - 6) / 8;
                                int var251 = (Statics.field199 + 6) / 8;
                                for (int var252 = var248 - 1; var252 <= var249 + 1; var252++) {
                                    for (int var253 = var250 - 1; var253 <= var251 + 1; var253++) {
                                        if (var252 < var248 || var252 > var249 || var253 < var250 || var253 > var251) {
                                            Statics.field1303.method3922("m" + var252 + "_" + var253);
                                            Statics.field1303.method3922("l" + var252 + "_" + var253);
                                        }
                                    }
                                }
                            }
                            method3258(30);
                            method1837();
                            Statics.field1274 = (byte[][][]) null;
                            Statics.field1162 = (byte[][][]) null;
                            Statics.field532 = (byte[][][]) null;
                            Statics.field3860 = (byte[][][]) null;
                            Statics.field2001 = (int[][][]) null;
                            Statics.field3680 = (byte[][][]) null;
                            Statics.field2000 = (int[][]) null;
                            Statics.field679 = null;
                            Statics.field3116 = null;
                            Statics.field1565 = null;
                            Statics.field3218 = null;
                            Statics.field2 = null;
                            class197 var254 = class197.method57(class193.field2320, field729.field1347);
                            field729.method2178(var254);
                            class63.method443();
                        } else {
                            field723 = 2;
                        }
                    } else {
                        field723 = 1;
                    }
                }
                if (field689 == 30) {
                    this.method1232();
                } else if (field689 == 40 || field689 == 45) {
                    this.method1449();
                }
                return;
            }
            var2.field3148.method4016(var2.field3151, (int) var2.field2140, var2.field3149, false);
        }
    }

    @ObfuscatedName("client.ak(ZI)V")
    public final void method943(boolean arg0) {
        boolean var2 = class207.method142();
        if (var2 && field917 && Statics.field2365 != null) {
            Statics.field2365.method2350();
        }
        if ((field689 == 10 || field689 == 20 || field689 == 30) && field880 != 0L && class308.method4786() > field880) {
            method4717(method3139());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field835[var3] = true;
            }
        }
        if (field689 == 0) {
            this.method877(class95.field1241, class95.field1234, arg0);
        } else if (field689 == 5) {
            class95.method817(Statics.field1360, Statics.field441, Statics.field328);
        } else if (field689 == 10 || field689 == 11) {
            class95.method817(Statics.field1360, Statics.field441, Statics.field328);
        } else if (field689 == 20) {
            class95.method817(Statics.field1360, Statics.field441, Statics.field328);
        } else if (field689 == 25) {
            if (field723 == 1) {
                if (field735 > field736) {
                    field736 = field735;
                }
                int var4 = (field736 * 50 - field735 * 50) / field736;
                method326(class234.field3069 + class91.field1183 + class91.field1180 + var4 + "%" + class91.field1181, false);
            } else if (field723 == 2) {
                if (field849 > field738) {
                    field738 = field849;
                }
                int var5 = (field738 * 50 - field849 * 50) / field738 + 50;
                method326(class234.field3069 + class91.field1183 + class91.field1180 + var5 + "%" + class91.field1181, false);
            } else {
                method326(class234.field3069, false);
            }
        } else if (field689 == 30) {
            this.method1235();
        } else if (field689 == 40) {
            method326(class234.field2797 + class91.field1183 + class234.field2824, false);
        } else if (field689 == 45) {
            method326(class234.field2841, false);
        }
        if (field689 == 30 && field792 == 0 && !arg0 && !field745) {
            for (int var6 = 0; var6 < field885; var6++) {
                if (field759[var6]) {
                    Statics.field119.method829(field890[var6], field891[var6], field892[var6], field893[var6]);
                    field759[var6] = false;
                }
            }
        } else if (field689 > 0) {
            Statics.field119.method828(0, 0);
            for (int var7 = 0; var7 < field885; var7++) {
                field759[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.au(B)V")
    public final void method876() {
        if (Statics.field1092.method2076()) {
            Statics.field1092.method2107();
        }
        if (Statics.field2414 != null) {
            Statics.field2414.field617 = false;
        }
        Statics.field2414 = null;
        field729.method2180();
        if (class55.field413 != null) {
            class55 var1 = class55.field413;
            synchronized (class55.field413) {
                class55.field413 = null;
            }
        }
        class64.method1958();
        Statics.field37 = null;
        if (Statics.field2365 != null) {
            Statics.field2365.method2351();
        }
        if (Statics.field125 != null) {
            Statics.field125.method2351();
        }
        if (Statics.field3198 != null) {
            Statics.field3198.method3334();
        }
        Object var3 = class246.field3176;
        synchronized (class246.field3176) {
            if (class246.field3177 != 0) {
                class246.field3177 = 1;
                try {
                    class246.field3176.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field402 != null) {
            Statics.field402.method3135();
            Statics.field402 = null;
        }
        class177.method1111();
    }

    @ObfuscatedName("fm.eu(II)V")
    public static void method3258(int arg0) {
        if (field689 == arg0) {
            return;
        }
        if (field689 == 0) {
            Statics.field3753.method953();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field714 = 0;
            field948 = 0;
            field716 = 0;
            field733.method4739(arg0);
            if (arg0 != 20) {
                method1155(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field616 != null) {
            Statics.field616.method3334();
            Statics.field616 = null;
        }
        if (field689 == 25) {
            field723 = 0;
            field735 = 0;
            field736 = 1;
            field849 = 0;
            field738 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method1955(Statics.field3604, Statics.field96, true, 0);
        } else if (arg0 == 20) {
            class95.method1955(Statics.field3604, Statics.field96, true, field689 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method1955(Statics.field3604, Statics.field96, false, 4);
        } else if (Statics.field1208) {
            Statics.field545 = null;
            Statics.field1210 = null;
            Statics.field3577 = null;
            Statics.field1211 = null;
            Statics.field1212 = null;
            Statics.field1280 = null;
            Statics.field3832 = null;
            Statics.field1213 = null;
            Statics.field1214 = null;
            Statics.field3349 = null;
            Statics.field1915 = null;
            Statics.field3688 = null;
            Statics.field1967 = null;
            Statics.field524 = null;
            Statics.field1215.method1734();
            class207.method2868(2);
            class248.method291(true);
            Statics.field1208 = false;
        }
        field689 = arg0;
    }

    @ObfuscatedName("client.ei(I)V")
    public void method1228() {
        if (field689 != 1000) {
            boolean var1 = class248.method3127();
            if (!var1) {
                this.method1229();
            }
        }
    }

    @ObfuscatedName("client.ef(B)V")
    public void method1229() {
        if (class248.field3209 >= 4) {
            this.method879("js5crc");
            field689 = 1000;
            return;
        }
        if (class248.field3205 >= 4) {
            if (field689 <= 5) {
                this.method879("js5io");
                field689 = 1000;
                return;
            }
            field795 = 3000;
            class248.field3205 = 3;
        }
        if (--field795 + 1 > 0) {
            return;
        }
        try {
            if (field710 == 0) {
                Statics.field2002 = Statics.field501.method3286(Statics.field2027, Statics.field301);
                field710++;
            }
            if (field710 == 1) {
                if (Statics.field2002.field2054 == 2) {
                    this.method1517(-1);
                    return;
                }
                if (Statics.field2002.field2054 == 1) {
                    field710++;
                }
            }
            if (field710 == 2) {
                if (field732) {
                    Socket var1 = (Socket) Statics.field2002.field2058;
                    class317 var2 = new class317(var1, 40000, 5000);
                    Statics.field434 = var2;
                } else {
                    Statics.field434 = new class181((Socket) Statics.field2002.field2058, Statics.field501, 5000);
                }
                class311 var3 = new class311(5);
                var3.method5203(15);
                var3.method5166(192);
                Statics.field434.method3341(var3.field3742, 0, 5);
                field710++;
                Statics.field697 = class308.method4786();
            }
            if (field710 == 3) {
                if (Statics.field434.method3337() > 0 || !field732 && field689 <= 5) {
                    int var4 = Statics.field434.method3336();
                    if (var4 != 0) {
                        this.method1517(var4);
                        return;
                    }
                    field710++;
                } else if (class308.method4786() - Statics.field697 > 30000L) {
                    this.method1517(-2);
                    return;
                }
            }
            if (field710 == 4) {
                class316 var5 = Statics.field434;
                boolean var6 = field689 > 20;
                if (Statics.field3198 != null) {
                    try {
                        Statics.field3198.method3334();
                    } catch (Exception var16) {
                    }
                    Statics.field3198 = null;
                }
                Statics.field3198 = var5;
                class248.method291(var6);
                class248.field3203.field3741 = 0;
                Statics.field3202 = null;
                Statics.field3204 = null;
                class248.field3191 = 0;
                while (true) {
                    class244 var8 = (class244) class248.field3210.method5601();
                    if (var8 == null) {
                        while (true) {
                            class244 var9 = (class244) class248.field3199.method5601();
                            if (var9 == null) {
                                if (class248.field3208 != 0) {
                                    try {
                                        class311 var10 = new class311(4);
                                        var10.method5203(4);
                                        var10.method5203(class248.field3208);
                                        var10.method5164(0);
                                        Statics.field3198.method3341(var10.field3742, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3198.method3334();
                                        } catch (Exception var14) {
                                        }
                                        class248.field3205++;
                                        Statics.field3198 = null;
                                    }
                                }
                                class248.field3194 = 0;
                                Statics.field2082 = class308.method4786();
                                Statics.field2002 = null;
                                Statics.field434 = null;
                                field710 = 0;
                                field713 = 0;
                                return;
                            }
                            class248.field3196.method4555(var9);
                            class248.field3197.method5596(var9, var9.field2140);
                            class248.field3190++;
                            class248.field3200--;
                        }
                    }
                    class248.field3192.method5596(var8, var8.field2140);
                    class248.field3193++;
                    class248.field3195--;
                }
            }
        } catch (IOException var17) {
            this.method1517(-3);
        }
    }

    @ObfuscatedName("client.ec(II)V")
    public void method1517(int arg0) {
        Statics.field2002 = null;
        Statics.field434 = null;
        field710 = 0;
        if (Statics.field301 == Statics.field2559) {
            Statics.field301 = Statics.field2552;
        } else {
            Statics.field301 = Statics.field2559;
        }
        field713++;
        if (field713 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field689 <= 5) {
                this.method879("js5connect_full");
                field689 = 1000;
            } else {
                field795 = 3000;
            }
        } else if (field713 >= 2 && arg0 == 6) {
            this.method879("js5connect_outofdate");
            field689 = 1000;
        } else if (field713 >= 4) {
            if (field689 <= 5) {
                this.method879("js5connect");
                field689 = 1000;
            } else {
                field795 = 3000;
            }
        }
    }

    @ObfuscatedName("il.ej(Lid;Ljava/lang/String;B)V")
    public static void method4011(class247 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field782.add(var2);
        field954 += var2.field563;
    }

    @ObfuscatedName("bb.em(I)Z")
    public static boolean method738() {
        if (field782 == null || field692 >= field782.size()) {
            return true;
        }
        while (field692 < field782.size()) {
            class68 var0 = (class68) field782.get(field692);
            if (!var0.method1080()) {
                return false;
            }
            field692++;
        }
        return true;
    }

    @ObfuscatedName("cy.eb(I)I")
    public static int method1938() {
        if (field782 == null || field692 >= field782.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field692; var1++) {
            var0 += ((class68) field782.get(var1)).field565;
        }
        return var0 * 10000 / field954;
    }

    @ObfuscatedName("fc.ex(IS)I")
    public static int method3281(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("li.ea(I)V")
    public static void method5886() {
        if (field709 == 0) {
            Statics.field2412 = new class143(4, 104, 104, class65.field531);
            for (int var0 = 0; var0 < 4; var0++) {
                field740[var0] = new class182(104, 104);
            }
            Statics.field600 = new class336(512, 512);
            class95.field1234 = class234.field2799;
            class95.field1241 = 5;
            field709 = 20;
        } else if (field709 == 20) {
            class95.field1234 = class234.field2800;
            class95.field1241 = 10;
            field709 = 30;
        } else if (field709 == 30) {
            Statics.field1189 = method2220(0, false, true, true);
            Statics.field330 = method2220(1, false, true, true);
            Statics.field393 = method2220(2, true, false, true);
            Statics.field1917 = method2220(3, false, true, true);
            Statics.field3657 = method2220(4, false, true, true);
            Statics.field1303 = method2220(5, true, true, true);
            Statics.field644 = method2220(6, true, true, true);
            Statics.field3100 = method2220(7, false, true, true);
            Statics.field96 = method2220(8, false, true, true);
            Statics.field362 = method2220(9, false, true, true);
            Statics.field3604 = method2220(10, false, true, true);
            Statics.field2521 = method2220(11, false, true, true);
            Statics.field1780 = method2220(12, false, true, true);
            Statics.field35 = method2220(13, true, false, true);
            Statics.field2524 = method2220(14, false, true, true);
            Statics.field1 = method2220(15, false, true, true);
            Statics.field124 = method2220(17, true, true, true);
            Statics.field1898 = method2220(18, false, true, true);
            Statics.field461 = method2220(19, false, true, true);
            Statics.field542 = method2220(20, false, true, true);
            class95.field1234 = class234.field2801;
            class95.field1241 = 20;
            field709 = 40;
        } else if (field709 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1189.method4013() * 4 / 100;
            int var3 = var2 + Statics.field330.method4013() * 4 / 100;
            int var4 = var3 + Statics.field393.method4013() * 2 / 100;
            int var5 = var4 + Statics.field1917.method4013() * 2 / 100;
            int var6 = var5 + Statics.field3657.method4013() * 6 / 100;
            int var7 = var6 + Statics.field1303.method4013() * 4 / 100;
            int var8 = var7 + Statics.field644.method4013() * 2 / 100;
            int var9 = var8 + Statics.field3100.method4013() * 56 / 100;
            int var10 = var9 + Statics.field96.method4013() * 2 / 100;
            int var11 = var10 + Statics.field362.method4013() * 2 / 100;
            int var12 = var11 + Statics.field3604.method4013() * 2 / 100;
            int var13 = var12 + Statics.field2521.method4013() * 2 / 100;
            int var14 = var13 + Statics.field1780.method4013() * 2 / 100;
            int var15 = var14 + Statics.field35.method4013() * 2 / 100;
            int var16 = var15 + Statics.field2524.method4013() * 2 / 100;
            int var17 = var16 + Statics.field1.method4013() * 2 / 100;
            int var18 = var17 + Statics.field461.method4013() / 100;
            int var19 = var18 + Statics.field1898.method4013() / 100;
            int var20 = var19 + Statics.field542.method4013() / 100;
            int var21 = var20 + (Statics.field124.method4021() && Statics.field124.method3910() ? 1 : 0);
            if (var21 == 100) {
                method4011(Statics.field1189, "Animations");
                method4011(Statics.field330, "Skeletons");
                method4011(Statics.field3657, "Sound FX");
                method4011(Statics.field1303, "Maps");
                method4011(Statics.field644, "Music Tracks");
                method4011(Statics.field3100, "Models");
                method4011(Statics.field96, "Sprites");
                method4011(Statics.field2521, "Music Jingles");
                method4011(Statics.field2524, "Music Samples");
                method4011(Statics.field1, "Music Patches");
                method4011(Statics.field461, "World Map");
                method4011(Statics.field1898, "World Map Geography");
                method4011(Statics.field542, "World Map Ground");
                Statics.field3700 = new class323();
                Statics.field3700.method5535(Statics.field124);
                class95.field1234 = class234.field2985;
                class95.field1241 = 30;
                field709 = 45;
            } else {
                if (var21 != 0) {
                    class95.field1234 = class234.field2802 + var21 + "%";
                }
                class95.field1241 = 30;
            }
        } else if (field709 == 45) {
            boolean var22 = !field685;
            Statics.field1443 = 22050;
            Statics.field1434 = var22;
            Statics.field3695 = 2;
            class208 var23 = new class208();
            var23.method3525(9, 128);
            Statics.field2365 = class115.method114(Statics.field501, 0, 22050);
            Statics.field2365.method2347(var23);
            class207.method2644(Statics.field1, Statics.field2524, Statics.field3657, var23);
            Statics.field125 = class115.method114(Statics.field501, 1, 2048);
            Statics.field70 = new class108();
            Statics.field125.method2347(Statics.field70);
            Statics.field2092 = new class122(22050, Statics.field1443);
            class95.field1234 = class234.field2804;
            class95.field1241 = 35;
            field709 = 50;
            Statics.field353 = new class304(Statics.field96, Statics.field35);
        } else if (field709 == 50) {
            int var24 = Statics.method5005().length;
            field734 = Statics.field353.method5009(Statics.method5005());
            if (field734.size() < var24) {
                class95.field1234 = class234.field3043 + field734.size() * 100 / var24 + "%";
                class95.field1241 = 40;
            } else {
                Statics.field441 = (class306) field734.get(class303.field3689);
                Statics.field328 = (class306) field734.get(class303.field3690);
                Statics.field1360 = (class306) field734.get(class303.field3696);
                Statics.field2771 = field737.method5902();
                class95.field1234 = class234.field2806;
                class95.field1241 = 40;
                field709 = 60;
            }
        } else if (field709 == 60) {
            class247 var25 = Statics.field3604;
            class247 var26 = Statics.field96;
            int var27 = 0;
            if (var25.method3927("title.jpg", "")) {
                var27++;
            }
            if (var26.method3927("logo", "")) {
                var27++;
            }
            if (var26.method3927("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method3927("logo_seasonal_mode", "")) {
                var27++;
            }
            if (var26.method3927("titlebox", "")) {
                var27++;
            }
            if (var26.method3927("titlebutton", "")) {
                var27++;
            }
            if (var26.method3927("runes", "")) {
                var27++;
            }
            if (var26.method3927("title_mute", "")) {
                var27++;
            }
            if (var26.method3927("options_radio_buttons,0", "")) {
                var27++;
            }
            if (var26.method3927("options_radio_buttons,2", "")) {
                var27++;
            }
            if (var26.method3927("options_radio_buttons,4", "")) {
                var27++;
            }
            if (var26.method3927("options_radio_buttons,6", "")) {
                var27++;
            }
            var26.method3927("sl_back", "");
            var26.method3927("sl_flags", "");
            var26.method3927("sl_arrows", "");
            var26.method3927("sl_stars", "");
            var26.method3927("sl_button", "");
            int var30 = class95.method1975();
            if (var27 < var30) {
                class95.field1234 = class234.field2922 + var27 * 100 / var30 + "%";
                class95.field1241 = 50;
            } else {
                class95.field1234 = class234.field2808;
                class95.field1241 = 50;
                method3258(5);
                field709 = 70;
            }
        } else if (field709 == 70) {
            if (Statics.field393.method3910()) {
                class247 var31 = Statics.field393;
                Statics.field3522 = var31;
                class256.method1065(Statics.field393);
                class257.method3319(Statics.field393, Statics.field3100);
                class247 var32 = Statics.field393;
                class247 var33 = Statics.field3100;
                boolean var34 = field685;
                Statics.field3375 = var32;
                Statics.field109 = var33;
                class265.field3388 = var34;
                class247 var35 = Statics.field393;
                class247 var36 = Statics.field3100;
                Statics.field3504 = var35;
                Statics.field3486 = var36;
                class262.method659(Statics.field393);
                class247 var37 = Statics.field393;
                class247 var38 = Statics.field3100;
                boolean var39 = field684;
                class306 var40 = Statics.field441;
                Statics.field3456 = var37;
                Statics.field1994 = var38;
                Statics.field1473 = var39;
                Statics.field1155 = Statics.field3456.method3963(10);
                Statics.field3221 = var40;
                class247 var41 = Statics.field393;
                class247 var42 = Statics.field1189;
                class247 var43 = Statics.field330;
                Statics.field3536 = var41;
                Statics.field3549 = var42;
                Statics.field3833 = var43;
                class255.method3397(Statics.field393, Statics.field3100);
                class247 var44 = Statics.field393;
                Statics.field3321 = var44;
                class252.method3121(Statics.field393);
                class227.method3748(Statics.field1917, Statics.field3100, Statics.field96, Statics.field35);
                class251.method179(Statics.field393);
                class263.method2124(Statics.field393);
                class254.method2135(Statics.field393);
                class247 var45 = Statics.field393;
                Statics.field3329 = var45;
                Statics.field1092 = new class100();
                class247 var46 = Statics.field393;
                class247 var47 = Statics.field96;
                class247 var48 = Statics.field35;
                Statics.field3360 = var46;
                Statics.field3351 = var47;
                Statics.field3369 = var48;
                class247 var49 = Statics.field393;
                class247 var50 = Statics.field96;
                Statics.field3310 = var49;
                Statics.field3307 = var50;
                class253.method3208(Statics.field393, Statics.field96);
                class95.field1234 = class234.field2810;
                class95.field1241 = 60;
                field709 = 80;
            } else {
                class95.field1234 = class234.field2790 + Statics.field393.method4038() + "%";
                class95.field1241 = 60;
            }
        } else if (field709 == 80) {
            int var51 = 0;
            if (Statics.field2013 == null) {
                Statics.field2013 = class337.method2722(Statics.field96, Statics.field3700.field3839, 0);
            } else {
                var51++;
            }
            if (Statics.field2541 == null) {
                Statics.field2541 = class337.method2722(Statics.field96, Statics.field3700.field3836, 0);
            } else {
                var51++;
            }
            if (Statics.field318 == null) {
                Statics.field318 = class337.method3244(Statics.field96, Statics.field3700.field3841, 0);
            } else {
                var51++;
            }
            if (Statics.field1060 == null) {
                Statics.field1060 = class337.method4468(Statics.field96, Statics.field3700.field3844, 0);
            } else {
                var51++;
            }
            if (Statics.field2068 == null) {
                Statics.field2068 = class337.method4468(Statics.field96, Statics.field3700.field3837, 0);
            } else {
                var51++;
            }
            if (Statics.field3928 == null) {
                Statics.field3928 = class337.method4468(Statics.field96, Statics.field3700.field3840, 0);
            } else {
                var51++;
            }
            if (Statics.field613 == null) {
                Statics.field613 = class337.method4468(Statics.field96, Statics.field3700.field3842, 0);
            } else {
                var51++;
            }
            if (Statics.field462 == null) {
                Statics.field462 = class337.method4468(Statics.field96, Statics.field3700.field3838, 0);
            } else {
                var51++;
            }
            if (Statics.field1901 == null) {
                Statics.field1901 = class337.method4468(Statics.field96, Statics.field3700.field3835, 0);
            } else {
                var51++;
            }
            if (Statics.field177 == null) {
                Statics.field177 = class337.method3244(Statics.field96, Statics.field3700.field3843, 0);
            } else {
                var51++;
            }
            if (Statics.field2544 == null) {
                Statics.field2544 = class337.method3244(Statics.field96, Statics.field3700.field3845, 0);
            } else {
                var51++;
            }
            if (var51 < 11) {
                class95.field1234 = class234.field2811 + var51 * 100 / 12 + "%";
                class95.field1241 = 70;
            } else {
                Statics.field3726 = Statics.field2544;
                Statics.field2541.method5751();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                Statics.field318[0].method5742(var52 + var55, var53 + var55, var54 + var55);
                class95.field1234 = class234.field2867;
                class95.field1241 = 70;
                field709 = 90;
            }
        } else if (field709 == 90) {
            if (Statics.field362.method3910()) {
                Statics.field3578 = new class129(Statics.field362, Statics.field96, 20, 0.8D, field685 ? 64 : 128);
                class140.method2877(Statics.field3578);
                class140.method2878(0.8D);
                field709 = 100;
            } else {
                class95.field1234 = class234.field2947 + "0%";
                class95.field1241 = 90;
            }
        } else if (field709 == 100) {
            int var56 = Statics.field3578.method2624();
            if (var56 < 100) {
                class95.field1234 = class234.field2947 + var56 + "%";
                class95.field1241 = 90;
            } else {
                class95.field1234 = class234.field2814;
                class95.field1241 = 90;
                field709 = 110;
            }
        } else if (field709 == 110) {
            Statics.field2414 = new class73();
            Statics.field501.method3287(Statics.field2414, 10);
            class95.field1234 = class234.field2815;
            class95.field1241 = 92;
            field709 = 120;
        } else if (field709 == 120) {
            if (Statics.field3604.method3927("huffman", "")) {
                class219 var57 = new class219(Statics.field3604.method3938("huffman", ""));
                class220.method54(var57);
                class95.field1234 = class234.field3002;
                class95.field1241 = 94;
                field709 = 130;
            } else {
                class95.field1234 = class234.field2983 + "%";
                class95.field1241 = 94;
            }
        } else if (field709 == 130) {
            if (!Statics.field1917.method3910()) {
                class95.field1234 = class234.field2818 + Statics.field1917.method4038() * 4 / 5 + "%";
                class95.field1241 = 96;
            } else if (!Statics.field1780.method3910()) {
                class95.field1234 = class234.field2818 + (80 + Statics.field1780.method4038() / 6) + "%";
                class95.field1241 = 96;
            } else if (Statics.field35.method3910()) {
                class95.field1234 = class234.field3061;
                class95.field1241 = 98;
                field709 = 140;
            } else {
                class95.field1234 = class234.field2818 + (96 + Statics.field35.method4038() / 50) + "%";
                class95.field1241 = 96;
            }
        } else if (field709 == 140) {
            class95.field1241 = 100;
            if (Statics.field461.method3928(class45.field321.field325)) {
                if (Statics.field419 == null) {
                    Statics.field419 = new class344();
                    Statics.field419.method5927(Statics.field461, Statics.field1898, Statics.field542, Statics.field1360, field734, Statics.field318);
                }
                class95.field1234 = class234.field2821;
                field709 = 150;
            } else {
                class95.field1234 = class234.field2995 + Statics.field461.method3951(class45.field321.field325) / 10 + "%";
            }
        } else if (field709 == 150) {
            method3258(10);
        }
    }

    @ObfuscatedName("dv.ed(IZZZS)Lid;")
    public static class247 method2220(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class319 var4 = null;
        if (class177.field2080 != null) {
            var4 = new class319(arg0, class177.field2080, Statics.field2081[arg0], 1000000);
        }
        return new class247(var4, Statics.field58, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ey(I)V")
    public final void method1449() {
        class316 var1 = field729.method2182();
        class310 var2 = field729.field1343;
        try {
            if (field714 == 0) {
                if (Statics.field2363 == null && (field807.method2037() || field948 > 250)) {
                    Statics.field2363 = field807.method2039();
                    field807.method2044();
                    field807 = null;
                }
                if (Statics.field2363 != null) {
                    if (var1 != null) {
                        var1.method3334();
                        var1 = null;
                    }
                    Statics.field2014 = null;
                    field731 = false;
                    field948 = 0;
                    field714 = 1;
                }
            }
            if (field714 == 1) {
                if (Statics.field2014 == null) {
                    Statics.field2014 = Statics.field501.method3286(Statics.field2027, Statics.field301);
                }
                if (Statics.field2014.field2054 == 2) {
                    throw new IOException();
                }
                if (Statics.field2014.field2054 == 1) {
                    if (field732) {
                        Socket var3 = (Socket) Statics.field2014.field2058;
                        class317 var4 = new class317(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class181((Socket) Statics.field2014.field2058, Statics.field501, 5000);
                    }
                    field729.method2187(var1);
                    Statics.field2014 = null;
                    field714 = 2;
                }
            }
            if (field714 == 2) {
                field729.method2176();
                class197 var5 = class197.method3515();
                var5.field2371.method5203(class194.field2341.field2344);
                field729.method2178(var5);
                field729.method2175();
                var2.field3741 = 0;
                field714 = 3;
            }
            if (field714 == 3) {
                if (Statics.field2365 != null) {
                    Statics.field2365.method2349();
                }
                if (Statics.field125 != null) {
                    Statics.field125.method2349();
                }
                boolean var6 = true;
                if (field732 && !var1.method3338(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3336();
                    if (Statics.field2365 != null) {
                        Statics.field2365.method2349();
                    }
                    if (Statics.field125 != null) {
                        Statics.field125.method2349();
                    }
                    if (var7 != 0) {
                        method238(var7);
                        return;
                    }
                    var2.field3741 = 0;
                    field714 = 4;
                }
            }
            if (field714 == 4) {
                if (var2.field3741 < 8) {
                    int var8 = var1.method3337();
                    if (var8 > 8 - var2.field3741) {
                        var8 = 8 - var2.field3741;
                    }
                    if (var8 > 0) {
                        var1.method3339(var2.field3742, var2.field3741, var8);
                        var2.field3741 += var8;
                    }
                }
                if (var2.field3741 == 8) {
                    var2.field3741 = 0;
                    Statics.field3223 = var2.method5186();
                    field714 = 5;
                }
            }
            if (field714 == 5) {
                field729.field1343.field3741 = 0;
                field729.method2176();
                class310 var9 = new class310(500);
                int[] var10 = new int[] { Statics.field2363.nextInt(), Statics.field2363.nextInt(), Statics.field2363.nextInt(), Statics.field2363.nextInt() };
                var9.field3741 = 0;
                var9.method5203(1);
                var9.method5166(var10[0]);
                var9.method5166(var10[1]);
                var9.method5166(var10[2]);
                var9.method5166(var10[3]);
                var9.method5168(Statics.field3223);
                if (field689 == 40) {
                    var9.method5166(Statics.field78[0]);
                    var9.method5166(Statics.field78[1]);
                    var9.method5166(Statics.field78[2]);
                    var9.method5166(Statics.field78[3]);
                } else {
                    var9.method5203(field718.method31());
                    switch(field718.field2033) {
                        case 0:
                        case 3:
                            var9.method5165(Statics.field2036);
                            var9.field3741++;
                            break;
                        case 1:
                            var9.field3741 += 4;
                            break;
                        case 2:
                            LinkedHashMap var12 = Statics.field108.field1089;
                            String var13 = class95.field1226;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5166((Integer) var12.get(var15));
                    }
                    var9.method5203(class324.field3850.method31());
                    var9.method5355(class95.field1233);
                }
                var9.method5220(class93.field1199, class93.field1198);
                Statics.field78 = var10;
                class197 var18 = class197.method3515();
                var18.field2371.field3741 = 0;
                if (field689 == 40) {
                    var18.field2371.method5203(class194.field2342.field2344);
                } else {
                    var18.field2371.method5203(class194.field2340.field2344);
                }
                var18.field2371.method5164(0);
                int var19 = var18.field2371.field3741;
                var18.field2371.method5166(192);
                var18.field2371.method5166(1);
                var18.field2371.method5203(field686);
                var18.field2371.method5203(field687);
                var18.field2371.method5161(var9.field3742, 0, var9.field3741);
                int var20 = var18.field2371.field3741;
                var18.field2371.method5355(class95.field1226);
                var18.field2371.method5203((field745 ? 1 : 0) << 1 | (field685 ? 1 : 0));
                var18.field2371.method5164(Statics.field567);
                var18.field2371.method5164(Statics.field1150);
                method3473(var18.field2371);
                var18.field2371.method5355(Statics.field282);
                var18.field2371.method5166(Statics.field1562);
                class311 var21 = new class311(Statics.field2771.method5918());
                Statics.field2771.method5915(var21);
                var18.field2371.method5161(var21.field3742, 0, var21.field3742.length);
                var18.field2371.method5203(field686);
                var18.field2371.method5166(0);
                var18.field2371.method5166(Statics.field3657.field3171);
                var18.field2371.method5166(Statics.field1.field3171);
                var18.field2371.method5166(Statics.field1917.field3171);
                var18.field2371.method5227(Statics.field542.field3171);
                var18.field2371.method5166(Statics.field3604.field3171);
                var18.field2371.method5227(Statics.field1189.field3171);
                var18.field2371.method5225(Statics.field3100.field3171);
                var18.field2371.method5226(Statics.field2521.field3171);
                var18.field2371.method5225(Statics.field2524.field3171);
                var18.field2371.method5225(Statics.field96.field3171);
                var18.field2371.method5226(Statics.field1780.field3171);
                var18.field2371.method5226(Statics.field1898.field3171);
                var18.field2371.method5225(Statics.field35.field3171);
                var18.field2371.method5166(Statics.field644.field3171);
                var18.field2371.method5166(Statics.field461.field3171);
                var18.field2371.method5166(Statics.field124.field3171);
                var18.field2371.method5226(Statics.field330.field3171);
                var18.field2371.method5225(0);
                var18.field2371.method5166(Statics.field393.field3171);
                var18.field2371.method5225(Statics.field362.field3171);
                var18.field2371.method5227(Statics.field1303.field3171);
                var18.field2371.method5201(var10, var20, var18.field2371.field3741);
                var18.field2371.method5176(var18.field2371.field3741 - var19);
                field729.method2178(var18);
                field729.method2175();
                field729.field1347 = new class339(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method5152(var22);
                field714 = 6;
            }
            if (field714 == 6 && var1.method3337() > 0) {
                int var24 = var1.method3336();
                if (var24 == 21 && field689 == 20) {
                    field714 = 12;
                } else if (var24 == 2) {
                    field714 = 14;
                } else if (var24 == 15 && field689 == 40) {
                    field729.field1345 = -1;
                    field714 = 19;
                } else if (var24 == 64) {
                    field714 = 10;
                } else if (var24 == 23 && field716 < 1) {
                    field716++;
                    field714 = 0;
                } else if (var24 == 29) {
                    field714 = 17;
                } else if (var24 == 69) {
                    field714 = 7;
                } else {
                    method238(var24);
                    return;
                }
            }
            if (field714 == 7 && var1.method3337() >= 2) {
                var1.method3339(var2.field3742, 0, 2);
                var2.field3741 = 0;
                Statics.field446 = var2.method5163();
                field714 = 8;
            }
            if (field714 == 8 && var1.method3337() >= Statics.field446) {
                var2.field3741 = 0;
                var1.method3339(var2.field3742, var2.field3741, Statics.field446);
                class8[] var25 = new class8[] { class8.field27 };
                class8 var26 = var25[var2.method5276()];
                try {
                    class13 var27 = class14.method3419(var26);
                    this.field722 = new class10(var2, var27);
                    field714 = 9;
                } catch (Exception var64) {
                    method238(22);
                    return;
                }
            }
            if (field714 == 9 && this.field722.method92()) {
                this.field721 = this.field722.method94();
                this.field722.method93();
                this.field722 = null;
                if (this.field721 == null) {
                    method238(22);
                    return;
                }
                field729.method2176();
                class197 var29 = class197.method3515();
                var29.field2371.method5203(class194.field2343.field2344);
                var29.field2371.method5164(this.field721.field3741);
                var29.field2371.method5256(this.field721);
                field729.method2178(var29);
                field729.method2175();
                this.field721 = null;
                field714 = 6;
            }
            if (field714 == 10 && var1.method3337() > 0) {
                Statics.field553 = var1.method3336();
                field714 = 11;
            }
            if (field714 == 11 && var1.method3337() >= Statics.field553) {
                var1.method3339(var2.field3742, 0, Statics.field553);
                var2.field3741 = 0;
                field714 = 6;
            }
            if (field714 == 12 && var1.method3337() > 0) {
                field717 = (var1.method3336() + 3) * 60;
                field714 = 13;
            }
            if (field714 == 13) {
                field948 = 0;
                class95.method197(class234.field2827, class234.field2828, field717 / 60 + class234.field2829);
                if (--field717 <= 0) {
                    field714 = 0;
                }
            } else {
                if (field714 == 14 && var1.method3337() >= 1) {
                    Statics.field3283 = var1.method3336();
                    field714 = 15;
                }
                if (field714 == 15 && var1.method3337() >= Statics.field3283) {
                    boolean var30 = var1.method3336() == 1;
                    var1.method3339(var2.field3742, 0, 4);
                    var2.field3741 = 0;
                    boolean var31 = false;
                    if (var30) {
                        int var32 = var2.method5124() << 24;
                        int var33 = var32 | var2.method5124() << 16;
                        int var34 = var33 | var2.method5124() << 8;
                        int var35 = var34 | var2.method5124();
                        String var36 = class95.field1226;
                        int var37 = var36.length();
                        int var38 = 0;
                        int var39 = 0;
                        while (true) {
                            if (var39 >= var37) {
                                if (Statics.field108.field1089.size() >= 10 && !Statics.field108.field1089.containsKey(var38)) {
                                    Iterator var42 = Statics.field108.field1089.entrySet().iterator();
                                    var42.next();
                                    var42.remove();
                                }
                                Statics.field108.field1089.put(var38, var35);
                                break;
                            }
                            var38 = (var38 << 5) - var38 + var36.charAt(var39);
                            var39++;
                        }
                    }
                    if (field719) {
                        Statics.field108.field1087 = class95.field1226;
                    } else {
                        Statics.field108.field1087 = null;
                    }
                    class83.method2738();
                    field851 = var1.method3336();
                    field865 = var1.method3336() == 1;
                    field799 = var1.method3336();
                    field799 <<= 0x8;
                    field799 += var1.method3336();
                    field800 = var1.method3336();
                    var1.method3339(var2.field3742, 0, 1);
                    var2.field3741 = 0;
                    class192[] var43 = class192.method4006();
                    int var44 = var2.method5134();
                    if (var44 < 0 || var44 >= var43.length) {
                        throw new IOException(var44 + " " + var2.field3741);
                    }
                    field729.field1344 = var43[var44];
                    field729.field1345 = field729.field1344.field2230;
                    var1.method3339(var2.field3742, 0, 2);
                    var2.field3741 = 0;
                    field729.field1345 = var2.method5163();
                    try {
                        client var45 = Statics.field3753;
                        JSObject.getWindow(var45).call("zap", (Object[]) null);
                    } catch (Throwable var63) {
                    }
                    field714 = 16;
                }
                if (field714 != 16) {
                    if (field714 == 17 && var1.method3337() >= 2) {
                        var2.field3741 = 0;
                        var1.method3339(var2.field3742, 0, 2);
                        var2.field3741 = 0;
                        Statics.field3298 = var2.method5163();
                        field714 = 18;
                    }
                    if (field714 == 18 && var1.method3337() >= Statics.field3298) {
                        var2.field3741 = 0;
                        var1.method3339(var2.field3742, 0, Statics.field3298);
                        var2.field3741 = 0;
                        String var58 = var2.method5189();
                        String var59 = var2.method5189();
                        String var60 = var2.method5189();
                        class95.method197(var58, var59, var60);
                        method3258(10);
                    }
                    if (field714 == 19) {
                        if (field729.field1345 == -1) {
                            if (var1.method3337() < 2) {
                                return;
                            }
                            var1.method3339(var2.field3742, 0, 2);
                            var2.field3741 = 0;
                            field729.field1345 = var2.method5163();
                        }
                        if (var1.method3337() >= field729.field1345) {
                            var1.method3339(var2.field3742, 0, field729.field1345);
                            var2.field3741 = 0;
                            int var61 = field729.field1345;
                            field733.method4725();
                            method3466();
                            class99.method2030(var2);
                            if (var2.field3741 != var61) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field948++;
                        if (field948 > 2000) {
                            if (field716 < 1) {
                                if (Statics.field301 == Statics.field2559) {
                                    Statics.field301 = Statics.field2552;
                                } else {
                                    Statics.field301 = Statics.field2559;
                                }
                                field716++;
                                field714 = 0;
                            } else {
                                method238(-3);
                            }
                        }
                    }
                } else if (var1.method3337() >= field729.field1345) {
                    var2.field3741 = 0;
                    var1.method3339(var2.field3742, 0, field729.field1345);
                    field733.method4723();
                    field894 = -1L;
                    Statics.field2414.field623 = 0;
                    Statics.field39 = true;
                    field895 = true;
                    field906 = -1L;
                    class106.field1354 = new class272();
                    field729.method2176();
                    field729.field1343.field3741 = 0;
                    field729.field1344 = null;
                    field729.field1349 = null;
                    field729.field1340 = null;
                    field729.field1351 = null;
                    field729.field1345 = 0;
                    field729.field1338 = 0;
                    field698 = 0;
                    field939 = 0;
                    field699 = 0;
                    Statics.method333();
                    class64.method3868(0);
                    class101.method3152();
                    field767 = 0;
                    field856 = false;
                    field920 = 0;
                    field708 = 0;
                    field757 = 0;
                    Statics.field1896 = null;
                    field900 = 0;
                    field907 = -1;
                    field912 = 0;
                    field877 = 0;
                    field945 = class94.field1204;
                    field681 = class94.field1204;
                    field725 = 0;
                    class99.method1970();
                    for (int var47 = 0; var47 < 2048; var47++) {
                        field798[var47] = null;
                    }
                    for (int var48 = 0; var48 < 32768; var48++) {
                        field872[var48] = null;
                    }
                    field809 = -1;
                    field854.method4633();
                    field913.method4633();
                    for (int var49 = 0; var49 < 4; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            for (int var51 = 0; var51 < 104; var51++) {
                                field914[var49][var50][var51] = null;
                            }
                        }
                    }
                    field864 = new class273();
                    Statics.field150.method1779();
                    for (int var52 = 0; var52 < Statics.field3234; var52++) {
                        class252 var53 = class252.method1663(var52);
                        if (var53 != null) {
                            class222.field2550[var52] = 0;
                            class222.field2551[var52] = 0;
                        }
                    }
                    Statics.field1092.method2071();
                    field852 = -1;
                    if (field707 != -1) {
                        class227.method3514(field707);
                    }
                    for (class71 var54 = (class71) field843.method5601(); var54 != null; var54 = (class71) field843.method5598()) {
                        method1209(var54, true);
                    }
                    field707 = -1;
                    field843 = new class329(8);
                    field848 = null;
                    Statics.method333();
                    field797.method3768((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var55 = 0; var55 < 8; var55++) {
                        field806[var55] = null;
                        field815[var55] = false;
                    }
                    class69.method55();
                    field690 = true;
                    for (int var56 = 0; var56 < 100; var56++) {
                        field835[var56] = true;
                    }
                    method1674();
                    Statics.field438 = null;
                    for (int var57 = 0; var57 < 8; var57++) {
                        field949[var57] = new class19();
                    }
                    Statics.field236 = null;
                    class99.method2030(var2);
                    Statics.field79 = -1;
                    method2196(false, var2);
                    field729.field1344 = null;
                }
            }
        } catch (IOException var65) {
            if (field716 < 1) {
                if (Statics.field301 == Statics.field2559) {
                    Statics.field301 = Statics.field2552;
                } else {
                    Statics.field301 = Statics.field2559;
                }
                field716++;
                field714 = 0;
            } else {
                method238(-2);
            }
        }
    }

    @ObfuscatedName("gb.el(I)V")
    public static void method3466() {
        field729.method2176();
        field729.field1343.field3741 = 0;
        field729.field1344 = null;
        field729.field1349 = null;
        field729.field1340 = null;
        field729.field1351 = null;
        field729.field1345 = 0;
        field729.field1338 = 0;
        field698 = 0;
        Statics.method333();
        field900 = 0;
        field912 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field798[var0] = null;
        }
        Statics.field3130 = null;
        for (int var1 = 0; var1 < field872.length; var1++) {
            class89 var2 = field872[var1];
            if (var2 != null) {
                var2.field1002 = -1;
                var2.field1003 = false;
            }
        }
        class69.field578 = new class329(32);
        method3258(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field835[var3] = true;
        }
        method1674();
    }

    @ObfuscatedName("h.es(IB)V")
    public static void method238(int arg0) {
        if (arg0 == -3) {
            class95.method197(class234.field3074, class234.field2852, class234.field2904);
        } else if (arg0 == -2) {
            class95.method197(class234.field2803, class234.field2834, class234.field2835);
        } else if (arg0 == -1) {
            class95.method197(class234.field2836, class234.field2812, class234.field2882);
        } else if (arg0 == 3) {
            class95.field1221 = 3;
            class95.field1218 = 1;
        } else if (arg0 == 4) {
            class95.method352(0);
        } else if (arg0 == 5) {
            class95.field1218 = 2;
            class95.method197(class234.field2842, class234.field2843, class234.field2844);
        } else if (arg0 == 68 || !(field688 || arg0 != 6)) {
            class95.method197(class234.field2845, class234.field2846, class234.field2847);
        } else if (arg0 == 7) {
            class95.method197(class234.field2848, class234.field2849, class234.field2850);
        } else if (arg0 == 8) {
            class95.method197(class234.field2851, class234.field2918, class234.field2853);
        } else if (arg0 == 9) {
            class95.method197(class234.field2907, class234.field3049, class234.field2856);
        } else if (arg0 == 10) {
            class95.method197(class234.field2857, class234.field2858, class234.field2859);
        } else if (arg0 == 11) {
            class95.method197(class234.field2796, class234.field2861, class234.field2992);
        } else if (arg0 == 12) {
            class95.method197(class234.field3077, class234.field2864, class234.field2906);
        } else if (arg0 == 13) {
            class95.method197(class234.field2866, class234.field2792, class234.field2868);
        } else if (arg0 == 14) {
            class95.method197(class234.field2869, class234.field2870, class234.field2871);
        } else if (arg0 == 16) {
            class95.method197(class234.field2872, class234.field2860, class234.field2876);
        } else if (arg0 == 17) {
            class95.method197(class234.field2875, class234.field2936, class234.field2908);
        } else if (arg0 == 18) {
            class95.method352(1);
        } else if (arg0 == 19) {
            class95.method197(class234.field2881, class234.field3034, class234.field2883);
        } else if (arg0 == 20) {
            class95.method197(class234.field2884, class234.field2921, class234.field2997);
        } else if (arg0 == 22) {
            class95.method197(class234.field3007, class234.field2888, class234.field2889);
        } else if (arg0 == 23) {
            class95.method197(class234.field2890, class234.field2891, class234.field3066);
        } else if (arg0 == 24) {
            class95.method197(class234.field3019, class234.field3039, class234.field3032);
        } else if (arg0 == 25) {
            class95.method197(class234.field2839, class234.field2832, class234.field2898);
        } else if (arg0 == 26) {
            class95.method197(class234.field3068, class234.field2900, class234.field2901);
        } else if (arg0 == 27) {
            class95.method197(class234.field2902, class234.field3041, class234.field2966);
        } else if (arg0 == 31) {
            class95.method197(class234.field2911, class234.field3078, class234.field2913);
        } else if (arg0 == 32) {
            class95.method197(class234.field2914, class234.field2915, class234.field2916);
        } else if (arg0 == 37) {
            class95.method197(class234.field2978, class234.field2939, class234.field2919);
        } else if (arg0 == 38) {
            class95.method197(class234.field2920, class234.field2862, class234.field2899);
        } else if (arg0 == 55) {
            class95.field1221 = 8;
        } else if (arg0 == 56) {
            class95.method197(class234.field2927, class234.field2928, class234.field2929);
            method3258(11);
            return;
        } else if (arg0 == 57) {
            class95.method197(class234.field2930, class234.field2931, class234.field2932);
            method3258(11);
            return;
        } else if (arg0 == 61) {
            class95.field1221 = 7;
        } else {
            class95.method197(class234.field2897, class234.field2991, class234.field2935);
        }
        method3258(10);
    }

    @ObfuscatedName("cn.eg(I)V")
    public static final void method1969() {
        field729.method2180();
        Statics.method3899();
        class256.method3616();
        class257.field3296.method3158();
        class265.field3403.method3158();
        class265.field3377.method3158();
        class265.field3378.method3158();
        class265.field3379.method3158();
        class268.method2035();
        class266.method3475();
        class270.field3537.method3158();
        class270.field3538.method3158();
        class255.method2028();
        class260.method3878();
        class252.method1124();
        class264.method210();
        class258.method265();
        class262.method4290();
        class261.field3330.method3158();
        class253.method118();
        class224.method344();
        class227.field2732.method3158();
        class227.field2589.method3158();
        class227.field2590.method3158();
        class227.field2688.method3158();
        ((class129) Statics.field1802).method2623();
        class102.field1316.method3158();
        Statics.field1189.method3935();
        Statics.field330.method3935();
        Statics.field1917.method3935();
        Statics.field3657.method3935();
        Statics.field1303.method3935();
        Statics.field644.method3935();
        Statics.field3100.method3935();
        Statics.field96.method3935();
        Statics.field362.method3935();
        Statics.field3604.method3935();
        Statics.field2521.method3935();
        Statics.field1780.method3935();
        Statics.field2412.method2952();
        for (int var0 = 0; var0 < 4; var0++) {
            field740[var0].method3363();
        }
        System.gc();
        class207.method2868(2);
        field947 = -1;
        field917 = false;
        for (class85 var1 = (class85) class85.field1106.method4638(); var1 != null; var1 = (class85) class85.field1106.method4640()) {
            if (var1.field1107 != null) {
                Statics.field70.method2225(var1.field1107);
                var1.field1107 = null;
            }
            if (var1.field1100 != null) {
                Statics.field70.method2225(var1.field1100);
                var1.field1100 = null;
            }
        }
        class85.field1106.method4633();
        method3258(10);
    }

    @ObfuscatedName("ak.ev(II)V")
    public static final void method380(int arg0) {
        method1969();
        switch(arg0) {
            case 1:
                class95.field1221 = 24;
                class95.method197(class234.field2813, class234.field3071, class234.field3026);
                break;
            case 2:
                class95.method1978();
        }
    }

    @ObfuscatedName("ek.ee(I)V")
    public static final void method2721() {
        if (field939 > 0) {
            method1969();
        } else {
            field733.method4733();
            method3258(40);
            Statics.field616 = field729.method2182();
            field729.method2181();
        }
    }

    @ObfuscatedName("bk.fs(ZB)V")
    public static final void method1155(boolean arg0) {
        if (arg0) {
            field718 = class95.field1228 ? class170.field2030 : class170.field2035;
            return;
        }
        LinkedHashMap var1 = Statics.field108.field1089;
        String var2 = class95.field1226;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field718 = var1.containsKey(var4) ? class170.field2034 : class170.field2029;
    }

    @ObfuscatedName("client.fw(I)V")
    public final void method1232() {
        if (field698 > 1) {
            field698--;
        }
        if (field939 > 0) {
            field939--;
        }
        if (field731) {
            field731 = false;
            method2721();
            return;
        }
        if (!field818) {
            method351();
        }
        for (int var1 = 0; var1 < 100 && this.method1442(field729); var1++) {
        }
        if (field689 != 30) {
            return;
        }
        while (class106.method3513()) {
            class197 var2 = class197.method57(class193.field2304, field729.field1347);
            var2.field2371.method5203(0);
            int var3 = var2.field2371.field3741;
            class106.method2645(var2.field2371);
            var2.field2371.method5177(var2.field2371.field3741 - var3);
            field729.method2178(var2);
        }
        if (field733.field3607) {
            class197 var4 = class197.method57(class193.field2288, field729.field1347);
            var4.field2371.method5203(0);
            int var5 = var4.field2371.field3741;
            field733.method4734(var4.field2371);
            var4.field2371.method5177(var4.field2371.field3741 - var5);
            field729.method2178(var4);
            field733.method4728();
        }
        Object var6 = Statics.field2414.field630;
        synchronized (Statics.field2414.field630) {
            if (!field773) {
                Statics.field2414.field623 = 0;
            } else if (class64.field520 != 0 || Statics.field2414.field623 >= 40) {
                class197 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2414.field623 && (var7 == null || var7.field2371.field3741 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2414.field620[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2414.field619[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field720 != var14 || field694 != var13) {
                        if (var7 == null) {
                            var7 = class197.method57(class193.field2315, field729.field1347);
                            var7.field2371.method5203(0);
                            var8 = var7.field2371.field3741;
                            var7.field2371.field3741 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field695 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field720;
                            var16 = var13 - field694;
                            var17 = (int) ((Statics.field2414.field621[var12] - field695) / 20L);
                            var10 = (int) ((Statics.field2414.field621[var12] - field695) % 20L + (long) var10);
                        }
                        field720 = var14;
                        field694 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2371.method5164((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2371.method5203(var17 + 128);
                            var7.field2371.method5164((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2371.method5203(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2371.method5166(Integer.MIN_VALUE);
                            } else {
                                var7.field2371.method5166(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2371.method5164((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2371.method5166(Integer.MIN_VALUE);
                            } else {
                                var7.field2371.method5166(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field695 = Statics.field2414.field621[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2371.method5177(var7.field2371.field3741 - var8);
                    int var18 = var7.field2371.field3741;
                    var7.field2371.field3741 = var8;
                    var7.field2371.method5203(var10 / var11);
                    var7.field2371.method5203(var10 % var11);
                    var7.field2371.field3741 = var18;
                    field729.method2178(var7);
                }
                if (var9 >= Statics.field2414.field623) {
                    Statics.field2414.field623 = 0;
                } else {
                    Statics.field2414.field623 -= var9;
                    System.arraycopy(Statics.field2414.field619, var9, Statics.field2414.field619, 0, Statics.field2414.field623);
                    System.arraycopy(Statics.field2414.field620, var9, Statics.field2414.field620, 0, Statics.field2414.field623);
                    System.arraycopy(Statics.field2414.field621, var9, Statics.field2414.field621, 0, Statics.field2414.field623);
                }
            }
        }
        if (class64.field520 == 1 || !Statics.field2487 && class64.field520 == 4 || class64.field520 == 2) {
            long var20 = class64.field523 - field894;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field894 = class64.field523;
            int var22 = class64.field522;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1150) {
                var22 = Statics.field1150;
            }
            int var23 = class64.field525;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field567) {
                var23 = Statics.field567;
            }
            int var24 = (int) var20;
            class197 var25 = class197.method57(class193.field2323, field729.field1347);
            var25.field2371.method5164((class64.field520 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2371.method5164(var23);
            var25.field2371.method5164(var22);
            field729.method2178(var25);
        }
        if (class55.field428 > 0) {
            class197 var26 = class197.method57(class193.field2256, field729.field1347);
            var26.field2371.method5164(0);
            int var27 = var26.field2371.field3741;
            long var28 = class308.method4786();
            for (int var30 = 0; var30 < class55.field428; var30++) {
                long var31 = var28 - field906;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field906 = var28;
                var26.field2371.method5223((int) var31);
                var26.field2371.method5207(class55.field431[var30]);
            }
            var26.field2371.method5176(var26.field2371.field3741 - var27);
            field729.method2178(var26);
        }
        if (field883 > 0) {
            field883--;
        }
        if (class55.field421[96] || class55.field421[97] || class55.field421[98] || class55.field421[99]) {
            field751 = true;
        }
        if (field751 && field883 <= 0) {
            field883 = 20;
            field751 = false;
            class197 var33 = class197.method57(class193.field2322, field729.field1347);
            var33.field2371.method5217(field802);
            var33.field2371.method5216(field708);
            field729.method2178(var33);
        }
        if (Statics.field39 && !field895) {
            field895 = true;
            class197 var34 = class197.method57(class193.field2313, field729.field1347);
            var34.field2371.method5203(1);
            field729.method2178(var34);
        }
        if (!Statics.field39 && field895) {
            field895 = false;
            class197 var35 = class197.method57(class193.field2313, field729.field1347);
            var35.field2371.method5203(0);
            field729.method2178(var35);
        }
        if (Statics.field419 != null) {
            Statics.field419.method5928();
        }
        method20();
        if (Statics.field99 != field907) {
            field907 = Statics.field99;
            method2418(Statics.field99);
        }
        if (field689 != 30) {
            return;
        }
        method2723();
        method2174();
        field729.field1338++;
        if (field729.field1338 > 750) {
            method2721();
            return;
        }
        method26();
        for (int var36 = 0; var36 < field725; var36++) {
            int var37 = field801[var36];
            class89 var38 = field872[var37];
            if (var38 != null) {
                method119(var38, var38.field1158.field3485);
            }
        }
        method1158();
        field744++;
        if (field786 != 0) {
            field785 += 20;
            if (field785 >= 400) {
                field786 = 0;
            }
        }
        if (Statics.field526 != null) {
            field829++;
            if (field829 >= 15) {
                method1219(Statics.field526);
                Statics.field526 = null;
            }
        }
        class227 var39 = Statics.field75;
        class227 var40 = Statics.field678;
        Statics.field75 = null;
        Statics.field678 = null;
        field859 = null;
        field706 = false;
        field860 = false;
        field903 = 0;
        while (class55.method3331() && field903 < 128) {
            if (field851 >= 2 && class55.field421[82] && Statics.field556 == 66) {
                String var41 = class101.method3879();
                Statics.field3753.method957(var41);
            } else if (field757 != 1 || Statics.field336 <= 0) {
                field905[field903] = Statics.field556;
                field904[field903] = Statics.field336;
                field903++;
            }
        }
        if (method3282() && class55.field421[82] && class55.field421[81] && field923 != 0) {
            int var42 = Statics.field3130.field666 - field923;
            if (var42 < 0) {
                var42 = 0;
            } else if (var42 > 3) {
                var42 = 3;
            }
            if (Statics.field3130.field666 != var42) {
                method27(Statics.field1641 + Statics.field3130.field1031[0], Statics.field132 + Statics.field3130.field1032[0], var42, false);
            }
            field923 = 0;
        }
        if (field707 != -1) {
            Statics.method2154(field707, 0, 0, Statics.field567, Statics.field1150, 0, 0);
        }
        field867++;
        while (true) {
            class72 var43;
            class227 var44;
            class227 var45;
            do {
                var43 = (class72) field882.method4636();
                if (var43 == null) {
                    while (true) {
                        class72 var46;
                        class227 var47;
                        class227 var48;
                        do {
                            var46 = (class72) field940.method4636();
                            if (var46 == null) {
                                while (true) {
                                    class72 var49;
                                    class227 var50;
                                    class227 var51;
                                    do {
                                        var49 = (class72) field683.method4636();
                                        if (var49 == null) {
                                            this.method1448();
                                            if (Statics.field419 != null) {
                                                Statics.field419.method5938(Statics.field99, (Statics.field3130.field1000 >> 7) + Statics.field1641, (Statics.field3130.field976 >> 7) + Statics.field132, false);
                                                Statics.field419.method5954();
                                            }
                                            if (field855 != null) {
                                                this.method1242();
                                            }
                                            if (Statics.field3139 != null) {
                                                method1219(Statics.field3139);
                                                field739++;
                                                if (class64.field512 == 0) {
                                                    if (field831) {
                                                        if (Statics.field3139 == Statics.field2533 && field793 != field790) {
                                                            class227 var52 = Statics.field3139;
                                                            byte var53 = 0;
                                                            if (field847 == 1 && var52.field2683 == 206) {
                                                                var53 = 1;
                                                            }
                                                            if (var52.field2718[field793] <= 0) {
                                                                var53 = 0;
                                                            }
                                                            int var54 = method222(var52);
                                                            boolean var55 = (var54 >> 29 & 0x1) != 0;
                                                            if (var55) {
                                                                int var56 = field790;
                                                                int var57 = field793;
                                                                var52.field2718[var57] = var52.field2718[var56];
                                                                var52.field2719[var57] = var52.field2719[var56];
                                                                var52.field2718[var56] = -1;
                                                                var52.field2719[var56] = 0;
                                                            } else if (var53 == 1) {
                                                                int var58 = field790;
                                                                int var59 = field793;
                                                                while (var58 != var59) {
                                                                    if (var58 > var59) {
                                                                        var52.method3816(var58 - 1, var58);
                                                                        var58--;
                                                                    } else if (var58 < var59) {
                                                                        var52.method3816(var58 + 1, var58);
                                                                        var58++;
                                                                    }
                                                                }
                                                            } else {
                                                                var52.method3816(field793, field790);
                                                            }
                                                            class197 var60 = class197.method57(class193.field2268, field729.field1347);
                                                            var60.field2371.method5164(field793);
                                                            var60.field2371.method5217(field790);
                                                            var60.field2371.method5203(var53);
                                                            var60.field2371.method5226(Statics.field3139.field2594);
                                                            field729.method2178(var60);
                                                        }
                                                    } else if (this.method1238()) {
                                                        this.method1239(field791, field830);
                                                    } else if (field819 > 0) {
                                                        int var61 = field791;
                                                        int var62 = field830;
                                                        class92 var63 = Statics.field92;
                                                        method3718(var63.field1192, var63.field1195, var63.field1188, var63.field1190, var63.field1191, var63.field1191, var61, var62);
                                                        Statics.field92 = null;
                                                    }
                                                    field829 = 10;
                                                    class64.field520 = 0;
                                                    Statics.field3139 = null;
                                                } else if (field739 >= 5 && (class64.field510 > field791 + 5 || class64.field510 < field791 - 5 || class64.field514 > field830 + 5 || class64.field514 < field830 - 5)) {
                                                    field831 = true;
                                                }
                                            }
                                            if (class143.method2991()) {
                                                int var64 = class143.field1841;
                                                int var65 = class143.field1865;
                                                class197 var66 = class197.method57(class193.field2261, field729.field1347);
                                                var66.field2371.method5203(5);
                                                var66.field2371.method5217(Statics.field1641 + var64);
                                                var66.field2371.method5203(class55.field421[82] ? (class55.field421[81] ? 2 : 1) : 0);
                                                var66.field2371.method5215(Statics.field132 + var65);
                                                field729.method2178(var66);
                                                class143.method2988();
                                                field783 = class64.field525;
                                                field784 = class64.field522;
                                                field786 = 1;
                                                field785 = 0;
                                                field912 = var64;
                                                field877 = var65;
                                            }
                                            if (Statics.field75 != var39) {
                                                if (var39 != null) {
                                                    method1219(var39);
                                                }
                                                if (Statics.field75 != null) {
                                                    method1219(Statics.field75);
                                                }
                                            }
                                            if (Statics.field678 != var40 && field834 == field833) {
                                                if (var40 != null) {
                                                    method1219(var40);
                                                }
                                                if (Statics.field678 != null) {
                                                    method1219(Statics.field678);
                                                }
                                            }
                                            if (Statics.field678 == null) {
                                                if (field833 > 0) {
                                                    field833--;
                                                }
                                            } else if (field833 < field834) {
                                                field833++;
                                                if (field834 == field833) {
                                                    method1219(Statics.field678);
                                                }
                                            }
                                            method1110();
                                            if (field776) {
                                                method339();
                                            }
                                            for (int var67 = 0; var67 < 5; var67++) {
                                                int var10002 = field919[var67]++;
                                            }
                                            Statics.field1092.method2072();
                                            int var68 = ++class64.field507 - 1;
                                            int var70 = class55.method3881();
                                            if (var68 > 15000 && var70 > 15000) {
                                                field939 = 250;
                                                class64.method3868(14500);
                                                class197 var71 = class197.method57(class193.field2272, field729.field1347);
                                                field729.method2178(var71);
                                            }
                                            Statics.field150.method1833();
                                            field729.field1348++;
                                            if (field729.field1348 > 50) {
                                                class197 var72 = class197.method57(class193.field2248, field729.field1347);
                                                field729.method2178(var72);
                                            }
                                            try {
                                                field729.method2175();
                                            } catch (IOException var74) {
                                                method2721();
                                            }
                                            return;
                                        }
                                        var50 = var49.field611;
                                        if (var50.field2725 < 0) {
                                            break;
                                        }
                                        var51 = class227.method3203(var50.field2613);
                                    } while (var51 == null || var51.field2724 == null || var50.field2725 >= var51.field2724.length || var51.field2724[var50.field2725] != var50);
                                    class86.method3119(var49);
                                }
                            }
                            var47 = var46.field611;
                            if (var47.field2725 < 0) {
                                break;
                            }
                            var48 = class227.method3203(var47.field2613);
                        } while (var48 == null || var48.field2724 == null || var47.field2725 >= var48.field2724.length || var48.field2724[var47.field2725] != var47);
                        class86.method3119(var46);
                    }
                }
                var44 = var43.field611;
                if (var44.field2725 < 0) {
                    break;
                }
                var45 = class227.method3203(var44.field2613);
            } while (var45 == null || var45.field2724 == null || var44.field2725 >= var45.field2724.length || var45.field2724[var44.field2725] != var44);
            class86.method3119(var43);
        }
    }

    @ObfuscatedName("cc.fi(I)V")
    public static final void method1837() {
        if (Statics.field125 != null) {
            Statics.field125.method2367();
        }
        if (Statics.field2365 != null) {
            Statics.field2365.method2367();
        }
    }

    @ObfuscatedName("cr.fj(B)V")
    public static final void method2174() {
        for (int var0 = 0; var0 < field920; var0++) {
            int var10002 = field805[var0]--;
            if (field805[var0] >= -10) {
                class111 var2 = field925[var0];
                if (var2 == null) {
                    class111 var10000 = (class111) null;
                    var2 = class111.method2285(Statics.field3657, field921[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field805[var0] += var2.method2274();
                    field925[var0] = var2;
                }
                if (field805[var0] < 0) {
                    int var9;
                    if (field924[var0] == 0) {
                        var9 = field918;
                    } else {
                        int var3 = (field924[var0] & 0xFF) * 128;
                        int var4 = field924[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field3130.field1000;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field924[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field3130.field976;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field805[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field837 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class113 var10 = var2.method2279().method2317(Statics.field2092);
                        class123 var11 = class123.method2445(var10, 100, var9);
                        var11.method2553(field922[var0] - 1);
                        Statics.field70.method2222(var11);
                    }
                    field805[var0] = -100;
                }
            } else {
                field920--;
                for (int var1 = var0; var1 < field920; var1++) {
                    field921[var1] = field921[var1 + 1];
                    field925[var1] = field925[var1 + 1];
                    field922[var1] = field922[var1 + 1];
                    field805[var1] = field805[var1 + 1];
                    field924[var1] = field924[var1 + 1];
                }
                var0--;
            }
        }
        if (field917 && !class207.method798()) {
            if (field915 != 0 && field947 != -1) {
                class207.method793(Statics.field644, field947, 0, field915, false);
            }
            field917 = false;
        }
    }

    @ObfuscatedName("fg.fr(Ljg;IIIB)V")
    public static void method3268(class270 arg0, int arg1, int arg2, int arg3) {
        if (field920 >= 50 || field837 == 0 || arg0.field3542 == null || arg1 >= arg0.field3542.length) {
            return;
        }
        int var4 = arg0.field3542[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field921[field920] = var5;
        field922[field920] = var6;
        field805[field920] = 0;
        field925[field920] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field924[field920] = (var8 << 16) + (var9 << 8) + var7;
        field920++;
    }

    @ObfuscatedName("ii.fo(IIII)V")
    public static void method4224(int arg0, int arg1, int arg2) {
        if (field918 == 0 || arg1 == 0 || field920 >= 50) {
            return;
        }
        field921[field920] = arg0;
        field922[field920] = arg1;
        field805[field920] = arg2;
        field925[field920] = null;
        field924[field920] = 0;
        field920++;
    }

    @ObfuscatedName("ch.fy(IB)V")
    public static void method2136(int arg0) {
        if (arg0 == -1 && !field917) {
            class207.method3250();
        } else if (arg0 != -1 && field947 != arg0 && field915 != 0 && !field917) {
            class247 var1 = Statics.field644;
            int var2 = field915;
            class207.field2435 = 1;
            Statics.field126 = var1;
            Statics.field1272 = arg0;
            Statics.field2433 = 0;
            Statics.field2434 = var2;
            Statics.field2366 = false;
            Statics.field2512 = 2;
        }
        field947 = arg0;
    }

    @ObfuscatedName("cm.ff(IIB)V")
    public static void method2027(int arg0, int arg1) {
        if (field915 != 0 && arg0 != -1) {
            class207.method793(Statics.field2521, arg0, 0, field915, false);
            field917 = true;
        }
    }

    @ObfuscatedName("l.fb(I)V")
    public static final void method20() {
        if (!Statics.field2274) {
            return;
        }
        if (Statics.field438 != null) {
            Statics.field438.method4841();
        }
        for (int var0 = 0; var0 < class99.field1286; var0++) {
            class76 var1 = field798[class99.field1287[var0]];
            var1.method1172();
        }
        Statics.field2274 = false;
    }

    @ObfuscatedName("t.fv(Lht;III)V")
    public static final void method102(class227 arg0, int arg1, int arg2) {
        if (field900 != 0 && field900 != 3 || field818 || !(class64.field520 == 1 || !Statics.field2487 && class64.field520 == 4)) {
            return;
        }
        class221 var3 = arg0.method3821(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field525 - arg1;
        int var5 = class64.field522 - arg2;
        if (!var3.method3737(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2548 / 2;
        int var7 = var5 - var3.field2547 / 2;
        int var8 = field708 & 0x7FF;
        int var9 = class140.field1815[var8];
        int var10 = class140.field1800[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3130.field1000 + var11 >> 7;
        int var14 = Statics.field3130.field976 - var12 >> 7;
        class197 var15 = class197.method57(class193.field2319, field729.field1347);
        var15.field2371.method5203(18);
        var15.field2371.method5217(Statics.field1641 + var13);
        var15.field2371.method5203(class55.field421[82] ? (class55.field421[81] ? 2 : 1) : 0);
        var15.field2371.method5215(Statics.field132 + var14);
        var15.field2371.method5203(var6);
        var15.field2371.method5203(var7);
        var15.field2371.method5164(field708);
        var15.field2371.method5203(57);
        var15.field2371.method5203(0);
        var15.field2371.method5203(0);
        var15.field2371.method5203(89);
        var15.field2371.method5164(Statics.field3130.field1000);
        var15.field2371.method5164(Statics.field3130.field976);
        var15.field2371.method5203(63);
        field729.method2178(var15);
        field912 = var13;
        field877 = var14;
    }

    @ObfuscatedName("bx.fk(B)V")
    public static final void method1158() {
        int[] var0 = class99.field1287;
        for (int var1 = 0; var1 < class99.field1286; var1++) {
            class76 var2 = field798[var0[var1]];
            if (var2 != null && var2.field992 > 0) {
                var2.field992--;
                if (var2.field992 == 0) {
                    var2.field989 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field725; var3++) {
            int var4 = field801[var3];
            class89 var5 = field872[var4];
            if (var5 != null && var5.field992 > 0) {
                var5.field992--;
                if (var5.field992 == 0) {
                    var5.field989 = null;
                }
            }
        }
    }

    @ObfuscatedName("kj.fm(Ljava/lang/String;B)V")
    public static final void method5119(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field108.field1084 = !Statics.field108.field1084;
            class83.method2738();
            if (Statics.field108.field1084) {
                class101.method783(99, "", "Roofs are now all hidden");
            } else {
                class101.method783(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field705 = !field705;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field887 = !field887;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field930 = !field930;
        }
        if (field851 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field419.field4023 = !Statics.field419.field4023;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field705 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field705 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2721();
            }
        }
        class197 var1 = class197.method57(class193.field2332, field729.field1347);
        var1.field2371.method5203(arg0.length() + 1);
        var1.field2371.method5355(arg0);
        field729.method2178(var1);
    }

    @ObfuscatedName("ay.fg(I)V")
    public static final void method339() {
        int var0 = Statics.field226 * 128 + 64;
        int var1 = Statics.field153 * 128 + 64;
        int var2 = method124(var0, var1, Statics.field99) - Statics.field2543;
        if (Statics.field577 < var0) {
            Statics.field577 += Statics.field1365 * (var0 - Statics.field577) / 1000 + Statics.field675;
            if (Statics.field577 > var0) {
                Statics.field577 = var0;
            }
        }
        if (Statics.field577 > var0) {
            Statics.field577 -= Statics.field1365 * (Statics.field577 - var0) / 1000 + Statics.field675;
            if (Statics.field577 < var0) {
                Statics.field577 = var0;
            }
        }
        if (Statics.field1334 < var2) {
            Statics.field1334 += Statics.field1365 * (var2 - Statics.field1334) / 1000 + Statics.field675;
            if (Statics.field1334 > var2) {
                Statics.field1334 = var2;
            }
        }
        if (Statics.field1334 > var2) {
            Statics.field1334 -= Statics.field1365 * (Statics.field1334 - var2) / 1000 + Statics.field675;
            if (Statics.field1334 < var2) {
                Statics.field1334 = var2;
            }
        }
        if (Statics.field347 < var1) {
            Statics.field347 += Statics.field1365 * (var1 - Statics.field347) / 1000 + Statics.field675;
            if (Statics.field347 > var1) {
                Statics.field347 = var1;
            }
        }
        if (Statics.field347 > var1) {
            Statics.field347 -= Statics.field1365 * (Statics.field347 - var1) / 1000 + Statics.field675;
            if (Statics.field347 < var1) {
                Statics.field347 = var1;
            }
        }
        int var3 = Statics.field2049 * 128 + 64;
        int var4 = Statics.field1450 * 128 + 64;
        int var5 = method124(var3, var4, Statics.field99) - Statics.field3891;
        int var6 = var3 - Statics.field577;
        int var7 = var5 - Statics.field1334;
        int var8 = var4 - Statics.field347;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1058 < var10) {
            Statics.field1058 += Statics.field453 * (var10 - Statics.field1058) / 1000 + Statics.field327;
            if (Statics.field1058 > var10) {
                Statics.field1058 = var10;
            }
        }
        if (Statics.field1058 > var10) {
            Statics.field1058 -= Statics.field453 * (Statics.field1058 - var10) / 1000 + Statics.field327;
            if (Statics.field1058 < var10) {
                Statics.field1058 = var10;
            }
        }
        int var12 = var11 - Statics.field1781;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1781 += Statics.field453 * var12 / 1000 + Statics.field327;
            Statics.field1781 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1781 -= Statics.field453 * -var12 / 1000 + Statics.field327;
            Statics.field1781 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1781;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1781 = var11;
        }
    }

    @ObfuscatedName("bs.fz(I)V")
    public static final void method1110() {
        if (field757 == 0) {
            int var0 = Statics.field3130.field1000;
            int var1 = Statics.field3130.field976;
            if (Statics.field1271 - var0 < -500 || Statics.field1271 - var0 > 500 || Statics.field1133 - var1 < -500 || Statics.field1133 - var1 > 500) {
                Statics.field1271 = var0;
                Statics.field1133 = var1;
            }
            if (Statics.field1271 != var0) {
                Statics.field1271 += (var0 - Statics.field1271) / 16;
            }
            if (Statics.field1133 != var1) {
                Statics.field1133 += (var1 - Statics.field1133) / 16;
            }
            int var2 = Statics.field1271 >> 7;
            int var3 = Statics.field1133 >> 7;
            int var4 = method124(Statics.field1271, Statics.field1133, Statics.field99);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field99;
                        if (var8 < 3 && (class65.field538[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class65.field531[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > field811) {
                field811 += (var10 - field811) / 24;
            } else if (var10 < field811) {
                field811 += (var10 - field811) / 80;
            }
            Statics.field543 = method124(Statics.field3130.field1000, Statics.field3130.field976, Statics.field99) - field758;
        } else if (field757 == 1) {
            if (field726 && Statics.field3130 != null) {
                int var11 = Statics.field3130.field1031[0];
                int var12 = Statics.field3130.field1032[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field1271 = Statics.field3130.field1000;
                    int var13 = method124(Statics.field3130.field1000, Statics.field3130.field976, Statics.field99) - field758;
                    if (var13 < Statics.field543) {
                        Statics.field543 = var13;
                    }
                    Statics.field1133 = Statics.field3130.field976;
                    field726 = false;
                }
            }
            short var14 = -1;
            if (class55.field421[33]) {
                var14 = 0;
            } else if (class55.field421[49]) {
                var14 = 1024;
            }
            if (class55.field421[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class55.field421[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class55.field421[35]) {
                var15 = -1;
            } else if (class55.field421[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class55.field421[81] ? field680 : field743;
                var16 = var17 * 16;
                field760 = var14;
                field761 = var15;
            }
            if (field693 < var16) {
                field693 += var16 / 8;
                if (field693 > var16) {
                    field693 = var16;
                }
            } else if (field693 > var16) {
                field693 = field693 * 9 / 10;
            }
            if (field693 > 0) {
                int var18 = field693 / 16;
                if (field760 >= 0) {
                    int var19 = field760 - Statics.field1781 & 0x7FF;
                    int var20 = class140.field1815[var19];
                    int var21 = class140.field1800[var19];
                    Statics.field1271 += var18 * var20 / 65536;
                    Statics.field1133 += var18 * var21 / 65536;
                }
                if (field761 != 0) {
                    Statics.field543 += field761 * var18;
                    if (Statics.field543 > 0) {
                        Statics.field543 = 0;
                    }
                }
            } else {
                field760 = -1;
                field761 = -1;
            }
            if (class55.field421[13]) {
                method1762();
            }
        }
        if (class64.field512 == 4 && Statics.field2487) {
            int var22 = class64.field514 - field756;
            field812 = var22 * 2;
            field756 = var22 == -1 || var22 == 1 ? class64.field514 : (field756 + class64.field514) / 2;
            int var23 = field755 - class64.field510;
            field753 = var23 * 2;
            field755 = var23 == -1 || var23 == 1 ? class64.field510 : (field755 + class64.field510) / 2;
        } else {
            if (class55.field421[96]) {
                field753 += (-24 - field753) / 2;
            } else if (class55.field421[97]) {
                field753 += (24 - field753) / 2;
            } else {
                field753 /= 2;
            }
            if (class55.field421[98]) {
                field812 += (12 - field812) / 2;
            } else if (class55.field421[99]) {
                field812 += (-12 - field812) / 2;
            } else {
                field812 /= 2;
            }
            field756 = class64.field514;
            field755 = class64.field510;
        }
        field708 = field753 / 2 + field708 & 0x7FF;
        field802 += field812 / 2;
        if (field802 < 128) {
            field802 = 128;
        }
        if (field802 > 383) {
            field802 = 383;
        }
    }

    @ObfuscatedName("l.fd(I)V")
    public static final void method26() {
        int var0 = class99.field1286;
        int[] var1 = class99.field1287;
        for (int var2 = 0; var2 < var0; var2++) {
            class76 var3 = field798[var1[var2]];
            if (var3 != null) {
                method119(var3, 1);
            }
        }
    }

    @ObfuscatedName("x.fe(Lcs;IB)V")
    public static final void method119(class79 arg0, int arg1) {
        if (arg0.field1010 >= field863) {
            method3882(arg0);
        } else if (arg0.field1025 >= field863) {
            method590(arg0);
        } else {
            arg0.field1005 = arg0.field998;
            if (arg0.field999 == 0) {
                arg0.field979 = 0;
            } else {
                label322: {
                    if (arg0.field1008 != -1 && arg0.field981 == 0) {
                        class270 var2 = class270.method2219(arg0.field1008);
                        if (arg0.field1035 > 0 && var2.field3550 == 0) {
                            arg0.field979++;
                            break label322;
                        }
                        if (arg0.field1035 <= 0 && var2.field3551 == 0) {
                            arg0.field979++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field1000;
                    int var4 = arg0.field976;
                    int var5 = arg0.field1031[arg0.field999 - 1] * 128 + arg0.field1012 * 64;
                    int var6 = arg0.field1032[arg0.field999 - 1] * 128 + arg0.field1012 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1027 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1027 = 1792;
                        } else {
                            arg0.field1027 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1027 = 768;
                        } else if (var4 > var6) {
                            arg0.field1027 = 256;
                        } else {
                            arg0.field1027 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1027 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1027 = 0;
                    }
                    byte var7 = arg0.field1033[arg0.field999 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1027 - arg0.field977 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field985;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field991;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field984;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field986;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field991;
                        }
                        arg0.field1005 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class89) {
                            var11 = ((class89) arg0).field1158.field3519;
                        }
                        if (var11) {
                            if (arg0.field977 != arg0.field1027 && arg0.field1002 == -1 && arg0.field1029 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field999 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field999 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field979 > 0 && arg0.field999 > 1) {
                                var10 = 8;
                                arg0.field979--;
                            }
                        } else {
                            if (arg0.field999 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field999 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field979 > 0 && arg0.field999 > 1) {
                                var10 = 8;
                                arg0.field979--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field991 == arg0.field1005 && arg0.field988 != -1) {
                            arg0.field1005 = arg0.field988;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1000 += var10;
                                if (arg0.field1000 > var5) {
                                    arg0.field1000 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1000 -= var10;
                                if (arg0.field1000 < var5) {
                                    arg0.field1000 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field976 += var10;
                                if (arg0.field976 > var6) {
                                    arg0.field976 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field976 -= var10;
                                if (arg0.field976 < var6) {
                                    arg0.field976 = var6;
                                }
                            }
                        }
                        if (arg0.field1000 == var5 && arg0.field976 == var6) {
                            arg0.field999--;
                            if (arg0.field1035 > 0) {
                                arg0.field1035--;
                            }
                        }
                    } else {
                        arg0.field1000 = var5;
                        arg0.field976 = var6;
                        arg0.field999--;
                        if (arg0.field1035 > 0) {
                            arg0.field1035--;
                        }
                    }
                }
            }
        }
        if (arg0.field1000 < 128 || arg0.field976 < 128 || arg0.field1000 >= 13184 || arg0.field976 >= 13184) {
            arg0.field1008 = -1;
            arg0.field1013 = -1;
            arg0.field1010 = 0;
            arg0.field1025 = 0;
            arg0.field1000 = arg0.field1031[0] * 128 + arg0.field1012 * 64;
            arg0.field976 = arg0.field1032[0] * 128 + arg0.field1012 * 64;
            arg0.method1666();
        }
        if (Statics.field3130 == arg0 && (arg0.field1000 < 1536 || arg0.field976 < 1536 || arg0.field1000 >= 11776 || arg0.field976 >= 11776)) {
            arg0.field1008 = -1;
            arg0.field1013 = -1;
            arg0.field1010 = 0;
            arg0.field1025 = 0;
            arg0.field1000 = arg0.field1031[0] * 128 + arg0.field1012 * 64;
            arg0.field976 = arg0.field1032[0] * 128 + arg0.field1012 * 64;
            arg0.method1666();
        }
        method3131(arg0);
        arg0.field978 = false;
        if (arg0.field1005 != -1) {
            class270 var12 = class270.method2219(arg0.field1005);
            if (var12 == null || var12.field3539 == null) {
                arg0.field1005 = -1;
            } else {
                arg0.field1034++;
                if (arg0.field1006 < var12.field3539.length && arg0.field1034 > var12.field3541[arg0.field1006]) {
                    arg0.field1034 = 1;
                    arg0.field1006++;
                    method3268(var12, arg0.field1006, arg0.field1000, arg0.field976);
                }
                if (arg0.field1006 >= var12.field3539.length) {
                    arg0.field1034 = 0;
                    arg0.field1006 = 0;
                    method3268(var12, arg0.field1006, arg0.field1000, arg0.field976);
                }
            }
        }
        if (arg0.field1013 != -1 && field863 >= arg0.field1016) {
            if (arg0.field1014 < 0) {
                arg0.field1014 = 0;
            }
            int var13 = class255.method1685(arg0.field1013).field3272;
            if (var13 == -1) {
                arg0.field1013 = -1;
            } else {
                class270 var14 = class270.method2219(var13);
                if (var14 == null || var14.field3539 == null) {
                    arg0.field1013 = -1;
                } else {
                    arg0.field1015++;
                    if (arg0.field1014 < var14.field3539.length && arg0.field1015 > var14.field3541[arg0.field1014]) {
                        arg0.field1015 = 1;
                        arg0.field1014++;
                        method3268(var14, arg0.field1014, arg0.field1000, arg0.field976);
                    }
                    if (arg0.field1014 >= var14.field3539.length && (arg0.field1014 < 0 || arg0.field1014 >= var14.field3539.length)) {
                        arg0.field1013 = -1;
                    }
                }
            }
        }
        if (arg0.field1008 != -1 && arg0.field981 <= 1) {
            class270 var15 = class270.method2219(arg0.field1008);
            if (var15.field3550 == 1 && arg0.field1035 > 0 && arg0.field1010 <= field863 && arg0.field1025 < field863) {
                arg0.field981 = 1;
                return;
            }
        }
        if (arg0.field1008 != -1 && arg0.field981 == 0) {
            class270 var16 = class270.method2219(arg0.field1008);
            if (var16 == null || var16.field3539 == null) {
                arg0.field1008 = -1;
            } else {
                arg0.field990++;
                if (arg0.field1007 < var16.field3539.length && arg0.field990 > var16.field3541[arg0.field1007]) {
                    arg0.field990 = 1;
                    arg0.field1007++;
                    method3268(var16, arg0.field1007, arg0.field1000, arg0.field976);
                }
                if (arg0.field1007 >= var16.field3539.length) {
                    arg0.field1007 -= var16.field3543;
                    arg0.field1023++;
                    if (arg0.field1023 >= var16.field3548) {
                        arg0.field1008 = -1;
                    } else if (arg0.field1007 >= 0 && arg0.field1007 < var16.field3539.length) {
                        method3268(var16, arg0.field1007, arg0.field1000, arg0.field976);
                    } else {
                        arg0.field1008 = -1;
                    }
                }
                arg0.field978 = var16.field3545;
            }
        }
        if (arg0.field981 > 0) {
            arg0.field981--;
        }
    }

    @ObfuscatedName("ip.fx(Lcs;B)V")
    public static final void method3882(class79 arg0) {
        int var1 = Math.max(1, arg0.field1010 - field863);
        int var2 = arg0.field1018 * 128 + arg0.field1012 * 64;
        int var3 = arg0.field1020 * 128 + arg0.field1012 * 64;
        arg0.field1000 += (var2 - arg0.field1000) / var1;
        arg0.field976 += (var3 - arg0.field976) / var1;
        arg0.field979 = 0;
        arg0.field1027 = arg0.field1024;
    }

    @ObfuscatedName("aq.fc(Lcs;I)V")
    public static final void method590(class79 arg0) {
        if (field863 == arg0.field1025 || arg0.field1008 == -1 || arg0.field981 != 0 || arg0.field990 + 1 > class270.method2219(arg0.field1008).field3541[arg0.field1007]) {
            int var1 = arg0.field1025 - arg0.field1010;
            int var2 = field863 - arg0.field1010;
            int var3 = arg0.field1018 * 128 + arg0.field1012 * 64;
            int var4 = arg0.field1020 * 128 + arg0.field1012 * 64;
            int var5 = arg0.field1019 * 128 + arg0.field1012 * 64;
            int var6 = arg0.field1021 * 128 + arg0.field1012 * 64;
            arg0.field1000 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field976 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field979 = 0;
        arg0.field1027 = arg0.field1024;
        arg0.field977 = arg0.field1027;
    }

    @ObfuscatedName("el.fu(Lcs;I)V")
    public static final void method3131(class79 arg0) {
        if (arg0.field1029 == 0) {
            return;
        }
        if (arg0.field1002 != -1) {
            class79 var1 = null;
            if (arg0.field1002 < 32768) {
                var1 = field872[arg0.field1002];
            } else if (arg0.field1002 >= 32768) {
                var1 = field798[arg0.field1002 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1000 - var1.field1000;
                int var3 = arg0.field976 - var1.field976;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1027 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1003) {
                arg0.field1002 = -1;
                arg0.field1003 = false;
            }
        }
        if (arg0.field1004 != -1 && (arg0.field999 == 0 || arg0.field979 > 0)) {
            arg0.field1027 = arg0.field1004;
            arg0.field1004 = -1;
        }
        int var4 = arg0.field1027 - arg0.field977 & 0x7FF;
        if (var4 == 0 && arg0.field1003) {
            arg0.field1002 = -1;
            arg0.field1003 = false;
        }
        if (var4 == 0) {
            arg0.field1028 = 0;
            return;
        }
        arg0.field1028++;
        if (var4 > 1024) {
            arg0.field977 -= arg0.field1029;
            boolean var5 = true;
            if (var4 < arg0.field1029 || var4 > 2048 - arg0.field1029) {
                arg0.field977 = arg0.field1027;
                var5 = false;
            }
            if (arg0.field998 == arg0.field1005 && (arg0.field1028 > 25 || var5)) {
                if (arg0.field982 == -1) {
                    arg0.field1005 = arg0.field991;
                } else {
                    arg0.field1005 = arg0.field982;
                }
            }
        } else {
            arg0.field977 += arg0.field1029;
            boolean var6 = true;
            if (var4 < arg0.field1029 || var4 > 2048 - arg0.field1029) {
                arg0.field977 = arg0.field1027;
                var6 = false;
            }
            if (arg0.field998 == arg0.field1005 && (arg0.field1028 > 25 || var6)) {
                if (arg0.field983 == -1) {
                    arg0.field1005 = arg0.field991;
                } else {
                    arg0.field1005 = arg0.field983;
                }
            }
        }
        arg0.field977 &= 0x7FF;
    }

    @ObfuscatedName("hs.fl(Lbi;III)V")
    public static void method3749(class76 arg0, int arg1, int arg2) {
        if (arg0.field1008 == arg1 && arg1 != -1) {
            int var3 = class270.method2219(arg1).field3552;
            if (var3 == 1) {
                arg0.field1007 = 0;
                arg0.field990 = 0;
                arg0.field981 = arg2;
                arg0.field1023 = 0;
            }
            if (var3 == 2) {
                arg0.field1023 = 0;
            }
        } else if (arg1 == -1 || arg0.field1008 == -1 || class270.method2219(arg1).field3546 >= class270.method2219(arg0.field1008).field3546) {
            arg0.field1008 = arg1;
            arg0.field1007 = 0;
            arg0.field990 = 0;
            arg0.field981 = arg2;
            arg0.field1023 = 0;
            arg0.field1035 = arg0.field999;
        }
    }

    @ObfuscatedName("es.fp(B)I")
    public static int method3139() {
        return field745 ? 2 : 1;
    }

    @ObfuscatedName("ji.fq(II)V")
    public static void method4717(int arg0) {
        field880 = 0L;
        if (arg0 >= 2) {
            field745 = true;
        } else {
            field745 = false;
        }
        if (method3139() == 1) {
            Statics.field3753.method847(765, 503);
        } else {
            Statics.field3753.method847(7680, 2160);
        }
        if (field689 >= 25) {
            method1674();
        }
    }

    @ObfuscatedName("cs.fn(I)V")
    public static void method1674() {
        class197 var0 = class197.method57(class193.field2273, field729.field1347);
        var0.field2371.method5203(method3139());
        var0.field2371.method5164(Statics.field567);
        var0.field2371.method5164(Statics.field1150);
        field729.method2178(var0);
    }

    @ObfuscatedName("client.n(I)V")
    public final void method900() {
        field880 = class308.method4786() + 500L;
        this.method1472();
        if (field707 != -1) {
            this.method1272(true);
        }
    }

    @ObfuscatedName("client.ft(B)V")
    public void method1472() {
        int var1 = Statics.field567;
        int var2 = Statics.field1150;
        if (this.field479 < var1) {
            int var3 = this.field479;
        }
        if (this.field472 < var2) {
            int var4 = this.field472;
        }
        if (Statics.field108 != null) {
            try {
                class57.method785(Statics.field3753, "resize", new Object[] { method3139() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fa(I)V")
    public final void method1235() {
        if (field707 != -1) {
            int var1 = field707;
            if (class227.method1068(var1)) {
                method3126(Statics.field2584[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field885; var2++) {
            if (field835[var2]) {
                field759[var2] = true;
            }
            field746[var2] = field835[var2];
            field835[var2] = false;
        }
        field749 = field863;
        field828 = -1;
        field832 = -1;
        Statics.field2533 = null;
        if (field707 != -1) {
            field885 = 0;
            method4937(field707, 0, 0, Statics.field567, Statics.field1150, 0, 0, -1);
        }
        class332.method5643();
        if (field787) {
            if (field786 == 1) {
                Statics.field462[field785 / 100].method5773(field783 - 8, field784 - 8);
            }
            if (field786 == 2) {
                Statics.field462[field785 / 100 + 4].method5773(field783 - 8, field784 - 8);
            }
        }
        if (field818) {
            int var8 = Statics.field2558;
            int var9 = Statics.field252;
            int var10 = Statics.field422;
            int var11 = Statics.field2209;
            int var12 = 6116423;
            class332.method5652(var8, var9, var10, var11, var12);
            class332.method5652(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class332.method5656(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field1360.method5060(class234.field2942, var8 + 3, var9 + 14, var12, -1);
            int var13 = class64.field510;
            int var14 = class64.field514;
            for (int var15 = 0; var15 < field819; var15++) {
                int var16 = (field819 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class306 var18 = Statics.field1360;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field825[var15].length() > 0) {
                    var19 = field824[var15] + class234.field2949 + field825[var15];
                } else {
                    var19 = field824[var15];
                }
                var18.method5060(var19, var8 + 3, var16, var17, 0);
            }
            int var20 = Statics.field2558;
            int var21 = Statics.field252;
            int var22 = Statics.field422;
            int var23 = Statics.field2209;
            for (int var24 = 0; var24 < field885; var24++) {
                if (field892[var24] + field890[var24] > var20 && field890[var24] < var20 + var22 && field893[var24] + field891[var24] > var21 && field891[var24] < var21 + var23) {
                    field759[var24] = true;
                }
            }
        } else if (field828 != -1) {
            int var3 = field828;
            int var4 = field832;
            if ((field819 >= 2 || field767 != 0 || field856) && field930) {
                int var5 = method3327();
                String var6;
                if (field767 == 1 && field819 < 2) {
                    var6 = class234.field2816 + class234.field2949 + field836 + " " + class91.field1182;
                } else if (field856 && field819 < 2) {
                    var6 = field840 + class234.field2949 + field841 + " " + class91.field1182;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field825[var5].length() > 0) {
                        var7 = field824[var5] + class234.field2949 + field825[var5];
                    } else {
                        var7 = field824[var5];
                    }
                    var6 = var7;
                }
                if (field819 > 2) {
                    var6 = var6 + class91.method1479(16777215) + " " + '/' + " " + (field819 - 2) + class234.field3070;
                }
                Statics.field1360.method5040(var6, var3 + 4, var4 + 15, 16777215, 0, field863 / 1000);
            }
        }
        if (field792 == 3) {
            for (int var25 = 0; var25 < field885; var25++) {
                if (field746[var25]) {
                    class332.method5691(field890[var25], field891[var25], field892[var25], field893[var25], 16711935, 128);
                } else if (field759[var25]) {
                    class332.method5691(field890[var25], field891[var25], field892[var25], field893[var25], 16711680, 128);
                }
            }
        }
        int var26 = Statics.field99;
        int var27 = Statics.field3130.field1000;
        int var28 = Statics.field3130.field976;
        int var29 = field744;
        for (class85 var30 = (class85) class85.field1106.method4638(); var30 != null; var30 = (class85) class85.field1106.method4640()) {
            if (var30.field1112 != -1 || var30.field1111 != null) {
                int var31 = 0;
                if (var27 > var30.field1104) {
                    var31 += var27 - var30.field1104;
                } else if (var27 < var30.field1102) {
                    var31 += var30.field1102 - var27;
                }
                if (var28 > var30.field1113) {
                    var31 += var28 - var30.field1113;
                } else if (var28 < var30.field1103) {
                    var31 += var30.field1103 - var28;
                }
                if (var31 - 64 > var30.field1105 || field837 == 0 || var30.field1101 != var26) {
                    if (var30.field1107 != null) {
                        Statics.field70.method2225(var30.field1107);
                        var30.field1107 = null;
                    }
                    if (var30.field1100 != null) {
                        Statics.field70.method2225(var30.field1100);
                        var30.field1100 = null;
                    }
                } else {
                    var31 -= 64;
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    int var32 = field837 * (var30.field1105 - var31) / var30.field1105;
                    class111 var10000;
                    if (var30.field1107 != null) {
                        var30.field1107.method2449(var32);
                    } else if (var30.field1112 >= 0) {
                        var10000 = (class111) null;
                        class111 var33 = class111.method2285(Statics.field3657, var30.field1112, 0);
                        if (var33 != null) {
                            class113 var34 = var33.method2279().method2317(Statics.field2092);
                            class123 var35 = class123.method2445(var34, 100, var32);
                            var35.method2553(-1);
                            Statics.field70.method2222(var35);
                            var30.field1107 = var35;
                        }
                    }
                    if (var30.field1100 != null) {
                        var30.field1100.method2449(var32);
                        if (!var30.field1100.method3411()) {
                            var30.field1100 = null;
                        }
                    } else if (var30.field1111 != null && (var30.field1109 -= var29) <= 0) {
                        int var36 = (int) (Math.random() * (double) var30.field1111.length);
                        var10000 = (class111) null;
                        class111 var37 = class111.method2285(Statics.field3657, var30.field1111[var36], 0);
                        if (var37 != null) {
                            class113 var38 = var37.method2279().method2317(Statics.field2092);
                            class123 var39 = class123.method2445(var38, 100, var32);
                            var39.method2553(0);
                            Statics.field70.method2222(var39);
                            var30.field1100 = var39;
                            var30.field1109 = var30.field1108 + (int) (Math.random() * (double) (var30.field1110 - var30.field1108));
                        }
                    }
                }
            }
        }
        field744 = 0;
    }

    @ObfuscatedName("av.fh(Ljava/lang/String;ZI)V")
    public static final void method326(String arg0, boolean arg1) {
        if (!field810) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field328.method5030(arg0, 250);
        int var6 = Statics.field328.method5031(arg0, 250) * 13;
        class332.method5652(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class332.method5656(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field328.method5037(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field885; var11++) {
            if (field892[var11] + field890[var11] > var7 && field890[var11] < var7 + var9 && field893[var11] + field891[var11] > var8 && field891[var11] < var8 + var10) {
                field835[var11] = true;
            }
        }
        if (arg1) {
            Statics.field119.method828(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field885; var16++) {
            if (field892[var16] + field890[var16] > var12 && field890[var16] < var12 + var14 && field893[var16] + field891[var16] > var13 && field891[var16] < var13 + var15) {
                field759[var16] = true;
            }
        }
    }

    @ObfuscatedName("bv.gs(IIIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3) {
        field780++;
        method3476();
        if (field887) {
            method1083(Statics.field3130, false);
        }
        method2026();
        method189(true);
        method3619();
        method189(false);
        method2002();
        method1126();
        method3766(arg0, arg1, arg2, arg3, true);
        int var4 = field763;
        int var5 = field941;
        int var6 = field937;
        int var7 = field943;
        class332.method5644(var4, var5, var4 + var6, var5 + var7);
        class140.method2873();
        if (!field776) {
            int var8 = field802;
            if (field811 / 256 > var8) {
                var8 = field811 / 256;
            }
            if (field927[4] && field929[4] + 128 > var8) {
                var8 = field929[4] + 128;
            }
            int var9 = field708 & 0x7FF;
            method84(Statics.field1271, Statics.field543, Statics.field1133, var8, var9, method3281(var8), var7);
        }
        int var22;
        if (field776) {
            int var23;
            if (Statics.field108.field1084) {
                var23 = Statics.field99;
            } else {
                int var24 = method124(Statics.field577, Statics.field347, Statics.field99);
                if (var24 - Statics.field1334 >= 800 || (class65.field538[Statics.field99][Statics.field577 >> 7][Statics.field347 >> 7] & 0x4) == 0) {
                    var23 = 3;
                } else {
                    var23 = Statics.field99;
                }
            }
            var22 = var23;
        } else {
            int var10;
            if (Statics.field108.field1084) {
                var10 = Statics.field99;
            } else {
                label459: {
                    int var11 = 3;
                    if (Statics.field1058 < 310) {
                        int var12;
                        int var13;
                        if (field757 == 1) {
                            var12 = Statics.field1271 >> 7;
                            var13 = Statics.field1133 >> 7;
                        } else {
                            var12 = Statics.field3130.field1000 >> 7;
                            var13 = Statics.field3130.field976 >> 7;
                        }
                        int var14 = Statics.field577 >> 7;
                        int var15 = Statics.field347 >> 7;
                        if (var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
                            var10 = Statics.field99;
                            break label459;
                        }
                        if (var12 < 0 || var13 < 0 || var12 >= 104 || var13 >= 104) {
                            var10 = Statics.field99;
                            break label459;
                        }
                        if ((class65.field538[Statics.field99][var14][var15] & 0x4) != 0) {
                            var11 = Statics.field99;
                        }
                        int var16;
                        if (var12 > var14) {
                            var16 = var12 - var14;
                        } else {
                            var16 = var14 - var12;
                        }
                        int var17;
                        if (var13 > var15) {
                            var17 = var13 - var15;
                        } else {
                            var17 = var15 - var13;
                        }
                        if (var16 > var17) {
                            int var18 = var17 * 65536 / var16;
                            int var19 = 32768;
                            while (var12 != var14) {
                                if (var14 < var12) {
                                    var14++;
                                } else if (var14 > var12) {
                                    var14--;
                                }
                                if ((class65.field538[Statics.field99][var14][var15] & 0x4) != 0) {
                                    var11 = Statics.field99;
                                }
                                var19 += var18;
                                if (var19 >= 65536) {
                                    var19 -= 65536;
                                    if (var15 < var13) {
                                        var15++;
                                    } else if (var15 > var13) {
                                        var15--;
                                    }
                                    if ((class65.field538[Statics.field99][var14][var15] & 0x4) != 0) {
                                        var11 = Statics.field99;
                                    }
                                }
                            }
                        } else if (var17 > 0) {
                            int var20 = var16 * 65536 / var17;
                            int var21 = 32768;
                            while (var13 != var15) {
                                if (var15 < var13) {
                                    var15++;
                                } else if (var15 > var13) {
                                    var15--;
                                }
                                if ((class65.field538[Statics.field99][var14][var15] & 0x4) != 0) {
                                    var11 = Statics.field99;
                                }
                                var21 += var20;
                                if (var21 >= 65536) {
                                    var21 -= 65536;
                                    if (var14 < var12) {
                                        var14++;
                                    } else if (var14 > var12) {
                                        var14--;
                                    }
                                    if ((class65.field538[Statics.field99][var14][var15] & 0x4) != 0) {
                                        var11 = Statics.field99;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field3130.field1000 >= 0 && Statics.field3130.field976 >= 0 && Statics.field3130.field1000 < 13312 && Statics.field3130.field976 < 13312) {
                        if ((class65.field538[Statics.field99][Statics.field3130.field1000 >> 7][Statics.field3130.field976 >> 7] & 0x4) != 0) {
                            var11 = Statics.field99;
                        }
                        var10 = var11;
                    } else {
                        var10 = Statics.field99;
                    }
                }
            }
            var22 = var10;
        }
        int var25 = Statics.field577;
        int var26 = Statics.field1334;
        int var27 = Statics.field347;
        int var28 = Statics.field1058;
        int var29 = Statics.field1781;
        for (int var30 = 0; var30 < 5; var30++) {
            if (field927[var30]) {
                int var31 = (int) (Math.random() * (double) (field928[var30] * 2 + 1) - (double) field928[var30] + Math.sin((double) field899[var30] / 100.0D * (double) field919[var30]) * (double) field929[var30]);
                if (var30 == 0) {
                    Statics.field577 += var31;
                }
                if (var30 == 1) {
                    Statics.field1334 += var31;
                }
                if (var30 == 2) {
                    Statics.field347 += var31;
                }
                if (var30 == 3) {
                    Statics.field1781 = Statics.field1781 + var31 & 0x7FF;
                }
                if (var30 == 4) {
                    Statics.field1058 += var31;
                    if (Statics.field1058 < 128) {
                        Statics.field1058 = 128;
                    }
                    if (Statics.field1058 > 383) {
                        Statics.field1058 = 383;
                    }
                }
            }
        }
        int var32 = class64.field510;
        int var33 = class64.field514;
        if (class64.field520 != 0) {
            var32 = class64.field525;
            var33 = class64.field522;
        }
        if (var32 >= var4 && var32 < var4 + var6 && var33 >= var5 && var33 < var5 + var7) {
            int var34 = var32 - var4;
            int var35 = var33 - var5;
            class138.field1767 = var34;
            class138.field1768 = var35;
            class138.field1770 = true;
            class138.field1774 = 0;
            class138.field1766 = false;
        } else {
            class138.method220();
        }
        method1837();
        class332.method5652(var4, var5, var6, var7, 0);
        method1837();
        int var36 = class140.field1792;
        class140.field1792 = field944;
        Statics.field2412.method2993(Statics.field577, Statics.field1334, Statics.field347, Statics.field1058, Statics.field1781, var22);
        class140.field1792 = var36;
        method1837();
        Statics.field2412.method2966();
        field769 = 0;
        boolean var37 = false;
        int var38 = -1;
        int var39 = -1;
        int var40 = class99.field1286;
        int[] var41 = class99.field1287;
        for (int var42 = 0; var42 < field725 + var40; var42++) {
            class79 var43;
            if (var42 < var40) {
                var43 = field798[var41[var42]];
                if (field809 == var41[var42]) {
                    var37 = true;
                    var38 = var42;
                    continue;
                }
                if (Statics.field3130 == var43) {
                    var39 = var42;
                    continue;
                }
            } else {
                var43 = field872[field801[var42 - var40]];
            }
            method12(var43, var42, var4, var5, var6, var7);
        }
        if (field887 && var39 != -1) {
            method12(Statics.field3130, var39, var4, var5, var6, var7);
        }
        if (var37) {
            method12(field798[field809], var38, var4, var5, var6, var7);
        }
        for (int var44 = 0; var44 < field769; var44++) {
            int var45 = field771[var44];
            int var46 = field772[var44];
            int var47 = field774[var44];
            int var48 = field715[var44];
            boolean var49 = true;
            while (var49) {
                var49 = false;
                for (int var50 = 0; var50 < var44; var50++) {
                    if (var46 + 2 > field772[var50] - field715[var50] && var46 - var48 < field772[var50] + 2 && var45 - var47 < field774[var50] + field771[var50] && var45 + var47 > field771[var50] - field774[var50] && field772[var50] - field715[var50] < var46) {
                        var46 = field772[var50] - field715[var50];
                        var49 = true;
                    }
                }
            }
            field781 = field771[var44];
            field889 = field772[var44] = var46;
            String var51 = field778[var44];
            if (field846 == 0) {
                int var52 = 16776960;
                if (field775[var44] < 6) {
                    var52 = field897[field775[var44]];
                }
                if (field775[var44] == 6) {
                    var52 = field780 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field775[var44] == 7) {
                    var52 = field780 % 20 < 10 ? 255 : 65535;
                }
                if (field775[var44] == 8) {
                    var52 = field780 % 20 < 10 ? 45056 : 8454016;
                }
                if (field775[var44] == 9) {
                    int var53 = 150 - field777[var44];
                    if (var53 < 50) {
                        var52 = var53 * 1280 + 16711680;
                    } else if (var53 < 100) {
                        var52 = 16776960 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var52 = (var53 - 100) * 5 + 65280;
                    }
                }
                if (field775[var44] == 10) {
                    int var54 = 150 - field777[var44];
                    if (var54 < 50) {
                        var52 = var54 * 5 + 16711680;
                    } else if (var54 < 100) {
                        var52 = 16711935 - (var54 - 50) * 327680;
                    } else if (var54 < 150) {
                        var52 = (var54 - 100) * 327680 + 255 - (var54 - 100) * 5;
                    }
                }
                if (field775[var44] == 11) {
                    int var55 = 150 - field777[var44];
                    if (var55 < 50) {
                        var52 = 16777215 - var55 * 327685;
                    } else if (var55 < 100) {
                        var52 = (var55 - 50) * 327685 + 65280;
                    } else if (var55 < 150) {
                        var52 = 16777215 - (var55 - 100) * 327680;
                    }
                }
                if (field794[var44] == 0) {
                    Statics.field1360.method5036(var51, field781 + var4, field889 + var5, var52, 0);
                }
                if (field794[var44] == 1) {
                    Statics.field1360.method5050(var51, field781 + var4, field889 + var5, var52, 0, field780);
                }
                if (field794[var44] == 2) {
                    Statics.field1360.method5038(var51, field781 + var4, field889 + var5, var52, 0, field780);
                }
                if (field794[var44] == 3) {
                    Statics.field1360.method5039(var51, field781 + var4, field889 + var5, var52, 0, field780, 150 - field777[var44]);
                }
                if (field794[var44] == 4) {
                    int var56 = (150 - field777[var44]) * (Statics.field1360.method5028(var51) + 100) / 150;
                    class332.method5651(field781 + var4 - 50, var5, field781 + var4 + 50, var5 + var7);
                    Statics.field1360.method5060(var51, field781 + var4 + 50 - var56, field889 + var5, var52, 0);
                    class332.method5644(var4, var5, var4 + var6, var5 + var7);
                }
                if (field794[var44] == 5) {
                    int var57 = 150 - field777[var44];
                    int var58 = 0;
                    if (var57 < 25) {
                        var58 = var57 - 25;
                    } else if (var57 > 125) {
                        var58 = var57 - 125;
                    }
                    class332.method5651(var4, field889 + var5 - Statics.field1360.field3714 - 1, var4 + var6, field889 + var5 + 5);
                    Statics.field1360.method5036(var51, field781 + var4, field889 + var5 + var58, var52, 0);
                    class332.method5644(var4, var5, var4 + var6, var5 + var7);
                }
            } else {
                Statics.field1360.method5036(var51, field781 + var4, field889 + var5, 16776960, 0);
            }
        }
        if (field699 == 2) {
            method117((field730 - Statics.field1641 << 7) + field953, (field703 - Statics.field132 << 7) + field752, field704 * 2);
            if (field781 > -1 && field863 % 20 < 10) {
                Statics.field3928[0].method5773(field781 + var4 - 12, field889 + var5 - 28);
            }
        }
        ((class129) Statics.field1802).method2642(field744);
        method727(var4, var5, var6, var7);
        Statics.field577 = var25;
        Statics.field1334 = var26;
        Statics.field347 = var27;
        Statics.field1058 = var28;
        Statics.field1781 = var29;
        if (field690) {
            byte var59 = 0;
            int var60 = class248.field3195 + class248.field3193 + var59;
            if (var60 == 0) {
                field690 = false;
            }
        }
        if (field690) {
            class332.method5652(var4, var5, var6, var7, 0);
            method326(class234.field3069, false);
        }
    }

    @ObfuscatedName("hw.gm(IIIIZI)V")
    public static final void method3766(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field874;
        } else if (var5 >= 100) {
            var6 = field933;
        } else {
            var6 = (field933 - field874) * var5 / 100 + field874;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field938) {
            short var8 = field938;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field754) {
                var6 = field754;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class332.method5643();
                    class332.method5652(arg0, arg1, var10, arg3, -16777216);
                    class332.method5652(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field936) {
            short var11 = field936;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field866) {
                var6 = field866;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class332.method5643();
                    class332.method5652(arg0, arg1, arg2, var13, -16777216);
                    class332.method5652(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field944 = arg3 * var6 / 334;
        if (field937 != arg2 || field943 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method3281(var16);
                int var18 = class140.field1815[var16];
                int var19 = method4466(var17, arg3);
                var14[var15] = var18 * var19 >> 16;
            }
            class143.method2987(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field763 = arg0;
        field941 = arg1;
        field937 = arg2;
        field943 = arg3;
    }

    @ObfuscatedName("gj.gp(I)V")
    public static void method3476() {
        if (Statics.field3130.field1000 >> 7 == field912 && Statics.field3130.field976 >> 7 == field877) {
            field912 = 0;
        }
    }

    @ObfuscatedName("cm.ge(I)V")
    public static void method2026() {
        if (field809 >= 0 && field798[field809] != null) {
            method1083(field798[field809], false);
        }
    }

    @ObfuscatedName("hl.gf(I)V")
    public static void method3619() {
        int var0 = class99.field1286;
        int[] var1 = class99.field1287;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field809 != var1[var2] && field799 != var1[var2]) {
                method1083(field798[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bq.gq(Lbi;ZI)V")
    public static void method1083(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1179() || arg0.field659) {
            return;
        }
        arg0.field663 = false;
        if ((field685 && class99.field1286 > 50 || class99.field1286 > 200) && arg1 && arg0.field998 == arg0.field1005) {
            arg0.field663 = true;
        }
        int var2 = arg0.field1000 >> 7;
        int var3 = arg0.field976 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method1223(0, 0, 0, false, arg0.field667);
        if (arg0.field658 != null && field863 >= arg0.field671 && field863 < arg0.field649) {
            arg0.field663 = false;
            arg0.field652 = method124(arg0.field1000, arg0.field976, Statics.field99);
            arg0.field980 = field863;
            Statics.field2412.method2964(Statics.field99, arg0.field1000, arg0.field976, arg0.field652, 60, arg0, arg0.field977, var4, arg0.field647, arg0.field670, arg0.field661, arg0.field662);
            return;
        }
        if ((arg0.field1000 & 0x7F) == 64 && (arg0.field976 & 0x7F) == 64) {
            if (field780 == field779[var2][var3]) {
                return;
            }
            field779[var2][var3] = field780;
        }
        arg0.field652 = method124(arg0.field1000, arg0.field976, Statics.field99);
        arg0.field980 = field863;
        Statics.field2412.method2963(Statics.field99, arg0.field1000, arg0.field976, arg0.field652, 60, arg0, arg0.field977, var4, arg0.field978);
    }

    @ObfuscatedName("v.gh(ZB)V")
    public static final void method189(boolean arg0) {
        for (int var1 = 0; var1 < field725; var1++) {
            class89 var2 = field872[field801[var1]];
            if (var2 != null && var2.method1179() && var2.field1158.field3518 == arg0 && var2.field1158.method4471()) {
                int var3 = var2.field1000 >> 7;
                int var4 = var2.field976 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1012 == 1 && (var2.field1000 & 0x7F) == 64 && (var2.field976 & 0x7F) == 64) {
                        if (field780 == field779[var3][var4]) {
                            continue;
                        }
                        field779[var3][var4] = field780;
                    }
                    long var5 = class138.method1223(0, 0, 1, !var2.field1158.field3515, field801[var1]);
                    var2.field980 = field863;
                    Statics.field2412.method2963(Statics.field99, var2.field1000, var2.field976, method124(var2.field1000 + (var2.field1012 * 64 - 64), var2.field976 + (var2.field1012 * 64 - 64), Statics.field99), var2.field1012 * 64 - 64 + 60, var2, var2.field977, var5, var2.field978);
                }
            }
        }
    }

    @ObfuscatedName("cj.gn(I)V")
    public static final void method2002() {
        for (class96 var0 = (class96) field854.method4638(); var0 != null; var0 = (class96) field854.method4640()) {
            if (Statics.field99 != var0.field1262 || field863 > var0.field1251) {
                var0.method3407();
            } else if (field863 >= var0.field1253) {
                if (var0.field1254 > 0) {
                    class89 var1 = field872[var0.field1254 - 1];
                    if (var1 != null && var1.field1000 >= 0 && var1.field1000 < 13312 && var1.field976 >= 0 && var1.field976 < 13312) {
                        var0.method2024(var1.field1000, var1.field976, method124(var1.field1000, var1.field976, var0.field1262) - var0.field1249, field863);
                    }
                }
                if (var0.field1254 < 0) {
                    int var2 = -var0.field1254 - 1;
                    class76 var3;
                    if (field799 == var2) {
                        var3 = Statics.field3130;
                    } else {
                        var3 = field798[var2];
                    }
                    if (var3 != null && var3.field1000 >= 0 && var3.field1000 < 13312 && var3.field976 >= 0 && var3.field976 < 13312) {
                        var0.method2024(var3.field1000, var3.field976, method124(var3.field1000, var3.field976, var0.field1262) - var0.field1249, field863);
                    }
                }
                var0.method2022(field744);
                Statics.field2412.method2963(Statics.field99, (int) var0.field1256, (int) var0.field1257, (int) var0.field1244, 60, var0, var0.field1264, -1L, false);
            }
        }
    }

    @ObfuscatedName("bh.gt(I)V")
    public static final void method1126() {
        for (class87 var0 = (class87) field913.method4638(); var0 != null; var0 = (class87) field913.method4640()) {
            if (Statics.field99 != var0.field1138 || var0.field1136) {
                var0.method3407();
            } else if (field863 >= var0.field1137) {
                var0.method1942(field744);
                if (var0.field1136) {
                    var0.method3407();
                } else {
                    Statics.field2412.method2963(var0.field1138, var0.field1143, var0.field1140, var0.field1141, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("an.gw(I)Z")
    public static boolean method597() {
        return (field768 & 0x4) != 0;
    }

    @ObfuscatedName("l.gz(I)Z")
    public static boolean method19() {
        return (field768 & 0x1) != 0;
    }

    @ObfuscatedName("ht.gd(B)Z")
    public static boolean method3861() {
        return (field768 & 0x2) != 0;
    }

    @ObfuscatedName("aj.gg(I)Z")
    public static boolean method654() {
        return (field768 & 0x8) != 0;
    }

    @ObfuscatedName("b.gr(Lcs;IIIIII)V")
    public static final void method12(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1179()) {
            return;
        }
        if (arg0 instanceof class89) {
            class268 var6 = ((class89) arg0).field1158;
            if (var6.field3488 != null) {
                var6 = var6.method4492();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1286;
        int[] var8 = class99.field1287;
        byte var9 = 0;
        if (arg1 < var7 && field863 == arg0.field980) {
            class76 var10 = (class76) arg0;
            boolean var11;
            if (field768 == 0) {
                var11 = false;
            } else if (Statics.field3130 == var10) {
                var11 = method654();
            } else {
                var11 = method597() || method19() && var10.method1182() || method3861() && var10.method1171();
            }
            if (var11) {
                class76 var12 = (class76) arg0;
                if (arg1 < var7) {
                    int var13 = arg0.field1026 + 15;
                    method117(arg0.field1000, arg0.field976, var13);
                    class307 var14 = (class307) field734.get(class303.field3690);
                    byte var15 = 9;
                    var14.method5036(var12.field660.method4912(), field781 + arg2, field889 + arg3 - var15, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var16 = -2;
        if (!arg0.field1001.method4576()) {
            int var17 = arg0.field1026 + 15;
            method117(arg0.field1000, arg0.field976, var17);
            for (class88 var18 = (class88) arg0.field1001.method4572(); var18 != null; var18 = (class88) arg0.field1001.method4574()) {
                class80 var19 = var18.method1952(field863);
                if (var19 != null) {
                    class258 var20 = var18.field1149;
                    class336 var21 = var20.method4229();
                    class336 var22 = var20.method4228();
                    int var23 = 0;
                    int var24;
                    if (var21 == null || var22 == null) {
                        var24 = var20.field3319;
                    } else {
                        if (var20.field3320 * 2 < var22.field3909) {
                            var23 = var20.field3320;
                        }
                        var24 = var22.field3909 - var23 * 2;
                    }
                    int var25 = 255;
                    boolean var26 = true;
                    int var27 = field863 - var19.field1043;
                    int var28 = var19.field1038 * var24 / var20.field3319;
                    int var31;
                    if (var19.field1039 > var27) {
                        int var29 = var20.field3315 == 0 ? 0 : var27 / var20.field3315 * var20.field3315;
                        int var30 = var19.field1037 * var24 / var20.field3319;
                        var31 = (var28 - var30) * var29 / var19.field1039 + var30;
                    } else {
                        var31 = var28;
                        int var32 = var19.field1039 + var20.field3314 - var27;
                        if (var20.field3309 >= 0) {
                            var25 = (var32 << 8) / (var20.field3314 - var20.field3309);
                        }
                    }
                    if (var19.field1038 > 0 && var31 < 1) {
                        var31 = 1;
                    }
                    if (var21 == null || var22 == null) {
                        var16 += 5;
                        if (field781 > -1) {
                            int var38 = field781 + arg2 - (var24 >> 1);
                            int var39 = field889 + arg3 - var16;
                            class332.method5652(var38, var39, var31, 5, 65280);
                            class332.method5652(var31 + var38, var39, var24 - var31, 5, 16711680);
                        }
                        var16 += 2;
                    } else {
                        int var33;
                        if (var24 == var31) {
                            var33 = var23 * 2 + var31;
                        } else {
                            var33 = var23 + var31;
                        }
                        int var34 = var21.field3915;
                        var16 += var34;
                        int var35 = field781 + arg2 - (var24 >> 1);
                        int var36 = field889 + arg3 - var16;
                        int var37 = var35 - var23;
                        if (var25 >= 0 && var25 < 255) {
                            var21.method5764(var37, var36, var25);
                            class332.method5651(var37, var36, var33 + var37, var34 + var36);
                            var22.method5764(var37, var36, var25);
                        } else {
                            var21.method5773(var37, var36);
                            class332.method5651(var37, var36, var33 + var37, var34 + var36);
                            var22.method5773(var37, var36);
                        }
                        class332.method5644(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var16 += 2;
                    }
                } else if (var18.method1947()) {
                    var18.method3407();
                }
            }
        }
        if (var16 == -2) {
            var16 += 7;
        }
        int var40 = var9 + var16;
        if (arg1 < var7) {
            class76 var41 = (class76) arg0;
            if (var41.field659) {
                return;
            }
            if (var41.field654 != -1 || var41.field648 != -1) {
                int var42 = arg0.field1026 + 15;
                method117(arg0.field1000, arg0.field976, var42);
                if (field781 > -1) {
                    if (var41.field654 != -1) {
                        var40 += 25;
                        Statics.field1060[var41.field654].method5773(field781 + arg2 - 12, field889 + arg3 - var40);
                    }
                    if (var41.field648 != -1) {
                        var40 += 25;
                        Statics.field2068[var41.field648].method5773(field781 + arg2 - 12, field889 + arg3 - var40);
                    }
                }
            }
            if (arg1 >= 0 && field699 == 10 && field701 == var8[arg1]) {
                int var43 = arg0.field1026 + 15;
                method117(arg0.field1000, arg0.field976, var43);
                if (field781 > -1) {
                    int var44 = Statics.field3928[1].field3915 + var40;
                    Statics.field3928[1].method5773(field781 + arg2 - 12, field889 + arg3 - var44);
                }
            }
        } else {
            class268 var45 = ((class89) arg0).field1158;
            if (var45.field3488 != null) {
                var45 = var45.method4492();
            }
            if (var45.field3513 >= 0 && var45.field3513 < Statics.field2068.length) {
                int var46 = arg0.field1026 + 15;
                method117(arg0.field1000, arg0.field976, var46);
                if (field781 > -1) {
                    Statics.field2068[var45.field3513].method5773(field781 + arg2 - 12, field889 + arg3 - 30);
                }
            }
            if (field699 == 1 && field700 == field801[arg1 - var7] && field863 % 20 < 10) {
                int var47 = arg0.field1026 + 15;
                method117(arg0.field1000, arg0.field976, var47);
                if (field781 > -1) {
                    Statics.field3928[0].method5773(field781 + arg2 - 12, field889 + arg3 - 28);
                }
            }
        }
        if (arg0.field989 != null && (arg1 >= var7 || !arg0.field975 && (field788 == 4 || !arg0.field1030 && (field788 == 0 || field788 == 3 || field788 == 1 && ((class76) arg0).method1182())))) {
            int var48 = arg0.field1026;
            method117(arg0.field1000, arg0.field976, var48);
            if (field781 > -1 && field769 < field956) {
                field774[field769] = Statics.field1360.method5028(arg0.field989) / 2;
                field715[field769] = Statics.field1360.field3714;
                field771[field769] = field781;
                field772[field769] = field889;
                field775[field769] = arg0.field993;
                field794[field769] = arg0.field994;
                field777[field769] = arg0.field992;
                field778[field769] = arg0.field989;
                field769++;
            }
        }
        for (int var49 = 0; var49 < 4; var49++) {
            int var50 = arg0.field1022[var49];
            int var51 = arg0.field1009[var49];
            class264 var52 = null;
            int var53 = 0;
            if (var51 >= 0) {
                if (var50 <= field863) {
                    continue;
                }
                var52 = class264.method4245(arg0.field1009[var49]);
                var53 = var52.field3371;
                if (var52 != null && var52.field3358 != null) {
                    var52 = var52.method4321();
                    if (var52 == null) {
                        arg0.field1022[var49] = -1;
                        continue;
                    }
                }
            } else if (var50 < 0) {
                continue;
            }
            int var54 = arg0.field996[var49];
            class264 var55 = null;
            if (var54 >= 0) {
                var55 = class264.method4245(var54);
                if (var55 != null && var55.field3358 != null) {
                    var55 = var55.method4321();
                }
            }
            if (var50 - var53 <= field863) {
                if (var52 == null) {
                    arg0.field1022[var49] = -1;
                } else {
                    int var56 = arg0.field1026 / 2;
                    method117(arg0.field1000, arg0.field976, var56);
                    if (field781 > -1) {
                        if (var49 == 1) {
                            field889 -= 20;
                        }
                        if (var49 == 2) {
                            field781 -= 15;
                            field889 -= 10;
                        }
                        if (var49 == 3) {
                            field781 += 15;
                            field889 -= 10;
                        }
                        Object var57 = null;
                        Object var58 = null;
                        Object var59 = null;
                        Object var60 = null;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        class336 var69 = null;
                        class336 var70 = null;
                        class336 var71 = null;
                        class336 var72 = null;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        class336 var82 = var52.method4339();
                        if (var82 != null) {
                            var61 = var82.field3909;
                            int var83 = var82.field3915;
                            if (var83 > var81) {
                                var81 = var83;
                            }
                            var65 = var82.field3911;
                        }
                        class336 var84 = var52.method4324();
                        if (var84 != null) {
                            var62 = var84.field3909;
                            int var85 = var84.field3915;
                            if (var85 > var81) {
                                var81 = var85;
                            }
                            var66 = var84.field3911;
                        }
                        class336 var86 = var52.method4322();
                        if (var86 != null) {
                            var63 = var86.field3909;
                            int var87 = var86.field3915;
                            if (var87 > var81) {
                                var81 = var87;
                            }
                            var67 = var86.field3911;
                        }
                        class336 var88 = var52.method4318();
                        if (var88 != null) {
                            var64 = var88.field3909;
                            int var89 = var88.field3915;
                            if (var89 > var81) {
                                var81 = var89;
                            }
                            var68 = var88.field3911;
                        }
                        if (var55 != null) {
                            var69 = var55.method4339();
                            if (var69 != null) {
                                var73 = var69.field3909;
                                int var90 = var69.field3915;
                                if (var90 > var81) {
                                    var81 = var90;
                                }
                                var77 = var69.field3911;
                            }
                            var70 = var55.method4324();
                            if (var70 != null) {
                                var74 = var70.field3909;
                                int var91 = var70.field3915;
                                if (var91 > var81) {
                                    var81 = var91;
                                }
                                var78 = var70.field3911;
                            }
                            var71 = var55.method4322();
                            if (var71 != null) {
                                var75 = var71.field3909;
                                int var92 = var71.field3915;
                                if (var92 > var81) {
                                    var81 = var92;
                                }
                                var79 = var71.field3911;
                            }
                            var72 = var55.method4318();
                            if (var72 != null) {
                                var76 = var72.field3909;
                                int var93 = var72.field3915;
                                if (var93 > var81) {
                                    var81 = var93;
                                }
                                var80 = var72.field3911;
                            }
                        }
                        class306 var94 = var52.method4341();
                        if (var94 == null) {
                            var94 = Statics.field441;
                        }
                        class306 var95;
                        if (var55 == null) {
                            var95 = Statics.field441;
                        } else {
                            var95 = var55.method4341();
                            if (var95 == null) {
                                var95 = Statics.field441;
                            }
                        }
                        Object var96 = null;
                        String var97 = null;
                        boolean var98 = false;
                        int var99 = 0;
                        String var100 = var52.method4328(arg0.field997[var49]);
                        int var101 = var94.method5028(var100);
                        if (var55 != null) {
                            var97 = var55.method4328(arg0.field987[var49]);
                            var99 = var95.method5028(var97);
                        }
                        int var102 = 0;
                        int var103 = 0;
                        if (var62 > 0) {
                            if (var86 == null && var88 == null) {
                                var102 = 1;
                            } else {
                                var102 = var101 / var62 + 1;
                            }
                        }
                        if (var55 != null && var74 > 0) {
                            if (var71 == null && var72 == null) {
                                var103 = 1;
                            } else {
                                var103 = var99 / var74 + 1;
                            }
                        }
                        int var104 = 0;
                        int var105 = var104;
                        if (var61 > 0) {
                            var104 += var61;
                        }
                        var104 += 2;
                        int var106 = var104;
                        if (var63 > 0) {
                            var104 += var63;
                        }
                        int var107 = var104;
                        int var108 = var104;
                        int var110;
                        if (var62 > 0) {
                            int var109 = var62 * var102;
                            var110 = var104 + var109;
                            var108 = (var109 - var101) / 2 + var104;
                        } else {
                            var110 = var101 + var104;
                        }
                        int var111 = var110;
                        if (var64 > 0) {
                            var110 += var64;
                        }
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        if (var55 != null) {
                            var110 += 2;
                            var112 = var110;
                            if (var73 > 0) {
                                var110 += var73;
                            }
                            var110 += 2;
                            var113 = var110;
                            if (var75 > 0) {
                                var110 += var75;
                            }
                            var114 = var110;
                            var116 = var110;
                            if (var74 > 0) {
                                int var117 = var74 * var103;
                                var110 += var117;
                                var116 += (var117 - var99) / 2;
                            } else {
                                var110 += var99;
                            }
                            var115 = var110;
                            if (var76 > 0) {
                                var110 += var76;
                            }
                        }
                        int var118 = arg0.field1022[var49] - field863;
                        int var119 = var52.field3365 - var52.field3365 * var118 / var52.field3371;
                        int var120 = var52.field3366 * var118 / var52.field3371 + -var52.field3366;
                        int var121 = field781 + arg2 - (var110 >> 1) + var119;
                        int var122 = field889 + arg3 - 12 + var120;
                        int var123 = var122;
                        int var124 = var81 + var122;
                        int var125 = var52.field3352 + var122 + 15;
                        int var126 = var125 - var94.field3715;
                        int var127 = var94.field3716 + var125;
                        if (var126 < var122) {
                            var123 = var126;
                        }
                        if (var127 > var124) {
                            var124 = var127;
                        }
                        int var128 = 0;
                        if (var55 != null) {
                            var128 = var55.field3352 + var122 + 15;
                            int var129 = var128 - var95.field3715;
                            int var130 = var95.field3716 + var128;
                            if (var129 < var123) {
                                ;
                            }
                            if (var130 > var124) {
                                ;
                            }
                        }
                        int var133 = 255;
                        if (var52.field3367 >= 0) {
                            var133 = (var118 << 8) / (var52.field3371 - var52.field3367);
                        }
                        if (var133 >= 0 && var133 < 255) {
                            if (var82 != null) {
                                var82.method5764(var105 + var121 - var65, var122, var133);
                            }
                            if (var86 != null) {
                                var86.method5764(var106 + var121 - var67, var122, var133);
                            }
                            if (var84 != null) {
                                for (int var134 = 0; var134 < var102; var134++) {
                                    var84.method5764(var62 * var134 + (var107 + var121 - var66), var122, var133);
                                }
                            }
                            if (var88 != null) {
                                var88.method5764(var111 + var121 - var68, var122, var133);
                            }
                            var94.method5034(var100, var108 + var121, var125, var52.field3359, 0, var133);
                            if (var55 != null) {
                                if (var69 != null) {
                                    var69.method5764(var112 + var121 - var77, var122, var133);
                                }
                                if (var71 != null) {
                                    var71.method5764(var113 + var121 - var79, var122, var133);
                                }
                                if (var70 != null) {
                                    for (int var135 = 0; var135 < var103; var135++) {
                                        var70.method5764(var74 * var135 + (var114 + var121 - var78), var122, var133);
                                    }
                                }
                                if (var72 != null) {
                                    var72.method5764(var115 + var121 - var80, var122, var133);
                                }
                                var95.method5034(var97, var116 + var121, var128, var55.field3359, 0, var133);
                            }
                        } else {
                            if (var82 != null) {
                                var82.method5773(var105 + var121 - var65, var122);
                            }
                            if (var86 != null) {
                                var86.method5773(var106 + var121 - var67, var122);
                            }
                            if (var84 != null) {
                                for (int var136 = 0; var136 < var102; var136++) {
                                    var84.method5773(var62 * var136 + (var107 + var121 - var66), var122);
                                }
                            }
                            if (var88 != null) {
                                var88.method5773(var111 + var121 - var68, var122);
                            }
                            var94.method5060(var100, var108 + var121, var125, var52.field3359 | 0xFF000000, 0);
                            if (var55 != null) {
                                if (var69 != null) {
                                    var69.method5773(var112 + var121 - var77, var122);
                                }
                                if (var71 != null) {
                                    var71.method5773(var113 + var121 - var79, var122);
                                }
                                if (var70 != null) {
                                    for (int var137 = 0; var137 < var103; var137++) {
                                        var70.method5773(var74 * var137 + (var114 + var121 - var78), var122);
                                    }
                                }
                                if (var72 != null) {
                                    var72.method5773(var115 + var121 - var80, var122);
                                }
                                var95.method5060(var97, var116 + var121, var128, var55.field3359 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.gk(I)V")
    public static final void method772() {
        field796 = 0;
        int var0 = (Statics.field3130.field1000 >> 7) + Statics.field1641;
        int var1 = (Statics.field3130.field976 >> 7) + Statics.field132;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field796 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field796 = 1;
        }
        if (field796 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field796 = 0;
        }
    }

    @ObfuscatedName("al.gy(IIIII)V")
    public static final void method727(int arg0, int arg1, int arg2, int arg3) {
        method772();
    }

    @ObfuscatedName("x.gu(IIII)V")
    public static final void method117(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field781 = -1;
            field889 = -1;
            return;
        }
        int var3 = method124(arg0, arg1, Statics.field99) - arg2;
        int var4 = arg0 - Statics.field577;
        int var5 = var3 - Statics.field1334;
        int var6 = arg1 - Statics.field347;
        int var7 = class140.field1815[Statics.field1058];
        int var8 = class140.field1800[Statics.field1058];
        int var9 = class140.field1815[Statics.field1781];
        int var10 = class140.field1800[Statics.field1781];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field781 = field944 * var11 / var15 + field937 / 2;
            field889 = field944 * var14 / var15 + field943 / 2;
        } else {
            field781 = -1;
            field889 = -1;
        }
    }

    @ObfuscatedName("p.gb(IIII)I")
    public static final int method124(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field538[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field531[var5][var3][var4] + class65.field531[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field531[var5][var3][var4 + 1] + class65.field531[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("jy.gj(III)I")
    public static int method4466(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field935 - field934) * var2 / 100 + field934;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("c.gc(IIIIIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method4466(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class140.field1815[var8];
            int var14 = class140.field1800[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class140.field1815[var9];
            int var17 = class140.field1800[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field577 = arg0 - var10;
        Statics.field1334 = arg1 - var11;
        Statics.field347 = arg2 - var12;
        Statics.field1058 = arg3;
        Statics.field1781 = arg4;
        if (field757 == 1 && field851 >= 2 && field863 % 50 == 0 && (Statics.field1271 >> 7 != Statics.field3130.field1000 >> 7 || Statics.field1133 >> 7 != Statics.field3130.field976 >> 7)) {
            int var19 = Statics.field3130.field666;
            int var20 = (Statics.field1271 >> 7) + Statics.field1641;
            int var21 = (Statics.field1133 >> 7) + Statics.field132;
            method27(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("dg.go(ZLks;I)V")
    public static final void method2196(boolean arg0, class310 arg1) {
        field741 = arg0;
        if (!field741) {
            int var2 = arg1.method5340();
            int var3 = arg1.method5340();
            int var4 = arg1.method5163();
            Statics.field379 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field379[var5][var6] = arg1.method5330();
                }
            }
            Statics.field403 = new int[var4];
            Statics.field110 = new int[var4];
            Statics.field1943 = new int[var4];
            Statics.field86 = new byte[var4][];
            Statics.field502 = new byte[var4][];
            boolean var7 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                var7 = true;
            }
            if (var2 / 8 == 48 && var3 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field403[var8] = var11;
                        Statics.field110[var8] = Statics.field1303.method3923("m" + var9 + "_" + var10);
                        Statics.field1943[var8] = Statics.field1303.method3923("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2023(var2, var3, true);
            return;
        }
        int var12 = arg1.method5202();
        int var13 = arg1.method5202();
        boolean var14 = arg1.method5211() == 1;
        int var15 = arg1.method5163();
        arg1.method5128();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5129(1);
                    if (var19 == 1) {
                        field742[var16][var17][var18] = arg1.method5129(26);
                    } else {
                        field742[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5153();
        Statics.field379 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field379[var20][var21] = arg1.method5330();
            }
        }
        Statics.field403 = new int[var15];
        Statics.field110 = new int[var15];
        Statics.field1943 = new int[var15];
        Statics.field86 = new byte[var15][];
        Statics.field502 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field742[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field403[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field403[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field110[var22] = Statics.field1303.method3923("m" + var31 + "_" + var32);
                            Statics.field1943[var22] = Statics.field1303.method3923("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2023(var13, var12, !var14);
    }

    @ObfuscatedName("cm.ga(IIZI)V")
    public static final void method2023(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field79 == arg0 && Statics.field199 == arg1) {
            return;
        }
        Statics.field79 = arg0;
        Statics.field199 = arg1;
        method3258(25);
        method326(class234.field3069, true);
        int var3 = Statics.field1641;
        int var4 = Statics.field132;
        Statics.field1641 = (arg0 - 6) * 8;
        Statics.field132 = (arg1 - 6) * 8;
        int var5 = Statics.field1641 - var3;
        int var6 = Statics.field132 - var4;
        int var7 = Statics.field1641;
        int var8 = Statics.field132;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field872[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1031[var11] -= var5;
                    var10.field1032[var11] -= var6;
                }
                var10.field1000 -= var5 * 128;
                var10.field976 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field798[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1031[var14] -= var5;
                    var13.field1032[var14] -= var6;
                }
                var13.field1000 -= var5 * 128;
                var13.field976 -= var6 * 128;
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
                        field914[var25][var21][var22] = field914[var25][var23][var24];
                    } else {
                        field914[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field864.method4638(); var26 != null; var26 = (class78) field864.method4640()) {
            var26.field961 -= var5;
            var26.field962 -= var6;
            if (var26.field961 < 0 || var26.field962 < 0 || var26.field961 >= 104 || var26.field962 >= 104) {
                var26.method3407();
            }
        }
        if (field912 != 0) {
            field912 -= var5;
            field877 -= var6;
        }
        field920 = 0;
        field776 = false;
        Statics.field577 -= var5 << 7;
        Statics.field347 -= var6 << 7;
        Statics.field1271 -= var5 << 7;
        Statics.field1133 -= var6 << 7;
        field907 = -1;
        field913.method4633();
        field854.method4633();
        for (int var27 = 0; var27 < 4; var27++) {
            field740[var27].method3363();
        }
    }

    @ObfuscatedName("d.gl(ZI)V")
    public static final void method211(boolean arg0) {
        method1837();
        field729.field1348++;
        if (field729.field1348 < 50 && !arg0) {
            return;
        }
        field729.field1348 = 0;
        if (field731 || field729.method2182() == null) {
            return;
        }
        class197 var1 = class197.method57(class193.field2248, field729.field1347);
        field729.method2178(var1);
        try {
            field729.method2175();
        } catch (IOException var3) {
            field731 = true;
        }
    }

    @ObfuscatedName("ds.gi(IB)V")
    public static final void method2418(int arg0) {
        int[] var1 = Statics.field600.field3910;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class65.field538[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2412.method2986(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class65.field538[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2412.method2986(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field600.method5843();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class65.field538[arg0][var10][var9] & 0x18) == 0) {
                    method796(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class65.field538[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method796(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field908 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field2412.method2981(Statics.field99, var11, var12);
                if (var13 != 0L) {
                    int var15 = class138.method1840(var13);
                    int var16 = class265.method1122(var15).field3420;
                    if (var16 >= 0 && class253.method3431(var16).field3249) {
                        field911[field908] = class253.method3431(var16).method4137(false);
                        field724[field908] = var11;
                        field910[field908] = var12;
                        field908++;
                    }
                }
            }
        }
        Statics.field119.method5716();
    }

    @ObfuscatedName("bj.gx(IIIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field2412.method2978(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field2412.method2982(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class138.method782(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field600.field3910;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class138.method1840(var5);
            class265 var14 = class265.method1122(var13);
            if (var14.field3398 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class335 var15 = Statics.field318[var14.field3398];
                if (var15 != null) {
                    int var16 = (var14.field3389 * 4 - var15.field3902) / 2;
                    int var17 = (var14.field3390 * 4 - var15.field3903) / 2;
                    var15.method5734(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3390) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field2412.method2980(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field2412.method2982(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class138.method1840(var18);
            class265 var24 = class265.method1122(var23);
            if (var24.field3398 != -1) {
                class335 var25 = Statics.field318[var24.field3398];
                if (var25 != null) {
                    int var26 = (var24.field3389 * 4 - var25.field3902) / 2;
                    int var27 = (var24.field3390 * 4 - var25.field3903) / 2;
                    var25.method5734(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3390) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class138.method782(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field600.field3910;
                int var30 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 + 3] = var28;
                } else {
                    var29[var30] = var28;
                    var29[var30 + 512 + 1] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                }
            }
        }
        long var31 = Statics.field2412.method2981(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class138.method1840(var31);
        class265 var34 = class265.method1122(var33);
        if (var34.field3398 == -1) {
            return;
        }
        class335 var35 = Statics.field318[var34.field3398];
        if (var35 != null) {
            int var36 = (var34.field3389 * 4 - var35.field3902) / 2;
            int var37 = (var34.field3390 * 4 - var35.field3903) / 2;
            var35.method5734(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3390) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.gv(Ldg;I)Z")
    public final boolean method1442(class105 arg0) {
        class316 var2 = arg0.method2182();
        class310 var3 = arg0.field1343;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1344 == null) {
                if (arg0.field1341) {
                    if (!var2.method3338(1)) {
                        return false;
                    }
                    var2.method3339(arg0.field1343.field3742, 0, 1);
                    arg0.field1338 = 0;
                    arg0.field1341 = false;
                }
                var3.field3741 = 0;
                if (var3.method5125()) {
                    if (!var2.method3338(1)) {
                        return false;
                    }
                    var2.method3339(arg0.field1343.field3742, 1, 1);
                    arg0.field1338 = 0;
                }
                arg0.field1341 = true;
                class192[] var4 = class192.method4006();
                int var5 = var3.method5134();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3741);
                }
                arg0.field1344 = var4[var5];
                arg0.field1345 = arg0.field1344.field2230;
            }
            if (arg0.field1345 == -1) {
                if (!var2.method3338(1)) {
                    return false;
                }
                arg0.method2182().method3339(var3.field3742, 0, 1);
                arg0.field1345 = var3.field3742[0] & 0xFF;
            }
            if (arg0.field1345 == -2) {
                if (!var2.method3338(2)) {
                    return false;
                }
                arg0.method2182().method3339(var3.field3742, 0, 2);
                var3.field3741 = 0;
                arg0.field1345 = var3.method5163();
            }
            if (!var2.method3338(arg0.field1345)) {
                return false;
            }
            var3.field3741 = 0;
            var2.method3339(var3.field3742, 0, arg0.field1345);
            arg0.field1338 = 0;
            field733.method4721();
            arg0.field1351 = arg0.field1340;
            arg0.field1340 = arg0.field1349;
            arg0.field1349 = arg0.field1344;
            if (class192.field2208 == arg0.field1344) {
                int var6 = var3.method5230();
                int var7 = var3.method5163();
                int var8 = var3.method5193();
                class71 var9 = (class71) field843.method5597((long) var6);
                if (var9 != null) {
                    method1209(var9, var9.field596 != var7);
                }
                method3116(var6, var7, var8);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2203 == arg0.field1344) {
                for (int var10 = 0; var10 < Statics.field3234; var10++) {
                    class252 var11 = class252.method1663(var10);
                    if (var11 != null) {
                        class222.field2550[var10] = 0;
                        class222.field2551[var10] = 0;
                    }
                }
                method4465();
                field869 += 32;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2158 == arg0.field1344) {
                String var12 = var3.method5189();
                int var13 = var3.method5193();
                int var14 = var3.method5193();
                if (var13 >= 1 && var13 <= 8) {
                    if (var12.equalsIgnoreCase(class234.field2793)) {
                        var12 = null;
                    }
                    field806[var13 - 1] = var12;
                    field815[var13 - 1] = var14 == 0;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2225 == arg0.field1344) {
                String var15 = var3.method5189();
                long var16 = (long) var3.method5163();
                long var18 = (long) var3.method5184();
                class240 var20 = (class240) class205.method3432(class240.method249(), var3.method5276());
                long var21 = (var16 << 32) + var18;
                boolean var23 = false;
                for (int var24 = 0; var24 < 100; var24++) {
                    if (field901[var24] == var21) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field150.method1781(new class294(var15, Statics.field1990))) {
                    var23 = true;
                }
                if (!var23 && field796 == 0) {
                    field901[field902] = var21;
                    field902 = (field902 + 1) % 100;
                    String var25 = class307.method5032(class302.method296(class220.method2739(var3)));
                    byte var26;
                    if (var20.field3129) {
                        var26 = 7;
                    } else {
                        var26 = 3;
                    }
                    if (var20.field3128 == -1) {
                        class101.method783(var26, var15, var25);
                    } else {
                        class101.method783(var26, Statics.method5531(var20.field3128) + var15, var25);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1344) {
                field776 = true;
                Statics.field2049 = var3.method5276();
                Statics.field1450 = var3.method5276();
                Statics.field3891 = var3.method5163();
                Statics.field327 = var3.method5276();
                Statics.field453 = var3.method5276();
                if (Statics.field453 >= 100) {
                    int var27 = Statics.field2049 * 128 + 64;
                    int var28 = Statics.field1450 * 128 + 64;
                    int var29 = method124(var27, var28, Statics.field99) - Statics.field3891;
                    int var30 = var27 - Statics.field577;
                    int var31 = var29 - Statics.field1334;
                    int var32 = var28 - Statics.field347;
                    int var33 = (int) Math.sqrt((double) (var30 * var30 + var32 * var32));
                    Statics.field1058 = (int) (Math.atan2((double) var31, (double) var33) * 325.949D) & 0x7FF;
                    Statics.field1781 = (int) (Math.atan2((double) var30, (double) var32) * -325.949D) & 0x7FF;
                    if (Statics.field1058 < 128) {
                        Statics.field1058 = 128;
                    }
                    if (Statics.field1058 > 383) {
                        Statics.field1058 = 383;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1344) {
                field788 = var3.method5162();
                field881 = var3.method5276();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2154 == arg0.field1344) {
                method658(var3.method5189());
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2146 == arg0.field1344) {
                Statics.field290 = class321.method1128(var3.method5276());
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2221 == arg0.field1344) {
                int var34 = var3.method5330();
                class71 var35 = (class71) field843.method5597((long) var34);
                if (var35 != null) {
                    method1209(var35, true);
                }
                if (field848 != null) {
                    method1219(field848);
                    field848 = null;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1344) {
                int var36 = var3.method5229();
                class227 var37 = class227.method3203(var36);
                for (int var38 = 0; var38 < var37.field2718.length; var38++) {
                    var37.field2718[var38] = -1;
                    var37.field2718[var38] = 0;
                }
                method1219(var37);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1344) {
                int var39 = var3.method5340();
                if (var39 == 65535) {
                    var39 = -1;
                }
                int var40 = var3.method5228();
                int var41 = var3.method5330();
                class227 var42 = class227.method3203(var41);
                if (var42.field2696) {
                    var42.field2720 = var39;
                    var42.field2623 = var40;
                    class266 var44 = class266.method335(var39);
                    var42.field2645 = var44.field3473;
                    var42.field2686 = var44.field3441;
                    var42.field2711 = var44.field3442;
                    var42.field2643 = var44.field3438;
                    var42.field2644 = var44.field3464;
                    var42.field2648 = var44.field3443;
                    if (var44.field3458 == 1) {
                        var42.field2684 = 1;
                    } else {
                        var42.field2684 = 2;
                    }
                    if (var42.field2679 > 0) {
                        var42.field2648 = var42.field2648 * 32 / var42.field2679;
                    } else if (var42.field2605 > 0) {
                        var42.field2648 = var42.field2648 * 32 / var42.field2605;
                    }
                    method1219(var42);
                } else if (var39 == -1) {
                    var42.field2597 = 0;
                    arg0.field1344 = null;
                    return true;
                } else {
                    class266 var43 = class266.method335(var39);
                    var42.field2597 = 4;
                    var42.field2606 = var39;
                    var42.field2645 = var43.field3473;
                    var42.field2686 = var43.field3441;
                    var42.field2648 = var43.field3443 * 100 / var40;
                    method1219(var42);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1344) {
                if (field707 != -1) {
                    method657(field707, 0);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2219 == arg0.field1344) {
                int var45 = var3.method5276();
                int var46 = var3.method5276();
                int var47 = var3.method5276();
                int var48 = var3.method5276();
                field927[var45] = true;
                field928[var45] = var46;
                field929[var45] = var47;
                field899[var45] = var48;
                field919[var45] = 0;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1344) {
                int var49 = var3.method5330();
                int var50 = var3.method5330();
                int var51 = class63.method3889();
                class197 var52 = class197.method57(class193.field2297, field729.field1347);
                var52.field2371.method5203(var51);
                var52.field2371.method5208(field476);
                var52.field2371.method5227(var49);
                var52.field2371.method5166(var50);
                field729.method2178(var52);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1344) {
                int var53 = var3.method5228();
                String var54 = var3.method5189();
                class227 var55 = class227.method3203(var53);
                if (!var54.equals(var55.field2655)) {
                    var55.field2655 = var54;
                    method1219(var55);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2205 == arg0.field1344) {
                Statics.field150.field1097.method4798(var3, arg0.field1345);
                method739();
                field875 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1344) {
                method728(class195.field2352);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2217 == arg0.field1344) {
                field900 = var3.method5276();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1344) {
                int var56 = arg0.field1345 + var3.field3741;
                int var57 = var3.method5163();
                int var58 = var3.method5163();
                if (field707 != var57) {
                    field707 = var57;
                    this.method1272(false);
                    method5006(field707);
                    class86.method1066(field707);
                    for (int var59 = 0; var59 < 100; var59++) {
                        field835[var59] = true;
                    }
                }
                while (var58-- > 0) {
                    int var60 = var3.method5330();
                    int var61 = var3.method5163();
                    int var62 = var3.method5276();
                    class71 var63 = (class71) field843.method5597((long) var60);
                    if (var63 != null && var63.field596 != var61) {
                        method1209(var63, true);
                        var63 = null;
                    }
                    if (var63 == null) {
                        var63 = method3116(var60, var61, var62);
                    }
                    var63.field597 = true;
                }
                for (class71 var64 = (class71) field843.method5601(); var64 != null; var64 = (class71) field843.method5598()) {
                    if (var64.field597) {
                        var64.field597 = false;
                    } else {
                        method1209(var64, true);
                    }
                }
                field884 = new class329(512);
                while (var3.field3741 < var56) {
                    int var65 = var3.method5330();
                    int var66 = var3.method5163();
                    int var67 = var3.method5163();
                    int var68 = var3.method5330();
                    for (int var69 = var66; var69 <= var67; var69++) {
                        long var70 = ((long) var65 << 32) + (long) var69;
                        field884.method5596(new class189(var68), var70);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2145 == arg0.field1344) {
                int var72 = var3.method5276();
                if (var3.method5276() == 0) {
                    field949[var72] = new class19();
                    var3.field3741 += 18;
                } else {
                    var3.field3741--;
                    field949[var72] = new class19(var3, false);
                }
                field886 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2222 == arg0.field1344) {
                int var73 = var3.method5163();
                byte var74 = var3.method5212();
                class222.field2550[var73] = var74;
                if (class222.field2551[var73] != var74) {
                    class222.field2551[var73] = var74;
                }
                method218(var73);
                field868[++field869 - 1 & 0x1F] = var73;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2183 == arg0.field1344) {
                class99.method585(var3, arg0.field1345);
                method3460();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1344) {
                method4465();
                int var75 = var3.method5276();
                int var76 = var3.method5193();
                int var77 = var3.method5330();
                field816[var76] = var77;
                field814[var76] = var75;
                field813[var76] = 1;
                for (int var78 = 0; var78 < 98; var78++) {
                    if (var77 >= class231.field2773[var78]) {
                        field813[var76] = var78 + 2;
                    }
                }
                field952[++field873 - 1 & 0x1F] = var76;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2197 == arg0.field1344) {
                int var79 = var3.method5330();
                int var80 = var3.method5163();
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = var3.method5218();
                if (var81 == 65535) {
                    var81 = -1;
                }
                int var82 = var3.method5330();
                for (int var83 = var81; var83 <= var80; var83++) {
                    long var84 = ((long) var82 << 32) + (long) var83;
                    class190 var86 = field884.method5597(var84);
                    if (var86 != null) {
                        var86.method3407();
                    }
                    field884.method5596(new class189(var79), var84);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1344) {
                method4465();
                field712 = var3.method5276();
                field879 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2151 == arg0.field1344) {
                field776 = true;
                Statics.field226 = var3.method5276();
                Statics.field153 = var3.method5276();
                Statics.field2543 = var3.method5163();
                Statics.field675 = var3.method5276();
                Statics.field1365 = var3.method5276();
                if (Statics.field1365 >= 100) {
                    Statics.field577 = Statics.field226 * 128 + 64;
                    Statics.field347 = Statics.field153 * 128 + 64;
                    Statics.field1334 = method124(Statics.field577, Statics.field347, Statics.field99) - Statics.field2543;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1344) {
                if (Statics.field438 != null) {
                    Statics.field438.method4925(var3);
                }
                method3421();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2169 == arg0.field1344) {
                Statics.field65 = var3.method5276();
                Statics.field467 = var3.method5193();
                while (var3.field3741 < arg0.field1345) {
                    int var87 = var3.method5276();
                    class195 var88 = class195.method176()[var87];
                    method728(var88);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1344) {
                int var89 = var3.method5330();
                int var90 = var3.method5163();
                if (var89 < -70000) {
                    var90 += 32768;
                }
                class227 var91;
                if (var89 >= 0) {
                    var91 = class227.method3203(var89);
                } else {
                    var91 = null;
                }
                while (var3.field3741 < arg0.field1345) {
                    int var92 = var3.method5194();
                    int var93 = var3.method5163();
                    int var94 = 0;
                    if (var93 != 0) {
                        var94 = var3.method5276();
                        if (var94 == 255) {
                            var94 = var3.method5330();
                        }
                    }
                    if (var91 != null && var92 >= 0 && var92 < var91.field2718.length) {
                        var91.field2718[var92] = var93;
                        var91.field2719[var92] = var94;
                    }
                    class69.method132(var90, var92, var93 - 1, var94);
                }
                if (var91 != null) {
                    method1219(var91);
                }
                method4465();
                field870[++field942 - 1 & 0x1F] = var90 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2220 == arg0.field1344) {
                int var95 = var3.method5340();
                int var96 = var3.method5229();
                int var97 = var3.method5202();
                int var98 = var3.method5340();
                class227 var99 = class227.method3203(var96);
                if (var99.field2645 != var97 || var99.field2686 != var95 || var99.field2648 != var98) {
                    var99.field2645 = var97;
                    var99.field2686 = var95;
                    var99.field2648 = var98;
                    method1219(var99);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2228 == arg0.field1344) {
                method728(class195.field2349);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1344) {
                method4465();
                field850 = var3.method5183();
                field879 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2144 == arg0.field1344) {
                int var100 = var3.method5340();
                int var101 = var3.method5330();
                int var102 = var100 >> 10 & 0x1F;
                int var103 = var100 >> 5 & 0x1F;
                int var104 = var100 & 0x1F;
                int var105 = (var104 << 3) + (var102 << 19) + (var103 << 11);
                class227 var106 = class227.method3203(var101);
                if (var106.field2580 != var105) {
                    var106.field2580 = var105;
                    method1219(var106);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1344) {
                method2196(false, arg0.field1343);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1344) {
                Statics.field65 = var3.method5211();
                Statics.field467 = var3.method5193();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1344) {
                boolean var107 = var3.method5276() == 1;
                int var108 = var3.method5228();
                class227 var109 = class227.method3203(var108);
                if (var109.field2591 != var107) {
                    var109.field2591 = var107;
                    method1219(var109);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2215 == arg0.field1344) {
                String var110 = var3.method5189();
                long var111 = var3.method5186();
                long var113 = (long) var3.method5163();
                long var115 = (long) var3.method5184();
                class240 var117 = (class240) class205.method3432(class240.method249(), var3.method5276());
                long var118 = (var113 << 32) + var115;
                boolean var120 = false;
                for (int var121 = 0; var121 < 100; var121++) {
                    if (field901[var121] == var118) {
                        var120 = true;
                        break;
                    }
                }
                if (var117.field3123 && Statics.field150.method1781(new class294(var110, Statics.field1990))) {
                    var120 = true;
                }
                if (!var120 && field796 == 0) {
                    field901[field902] = var118;
                    field902 = (field902 + 1) % 100;
                    String var122 = class307.method5032(class302.method296(class220.method2739(var3)));
                    if (var117.field3128 == -1) {
                        class101.method50(9, var110, var122, class300.method1105(var111));
                    } else {
                        class101.method50(9, Statics.method5531(var117.field3128) + var110, var122, class300.method1105(var111));
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2211 == arg0.field1344) {
                method1969();
                arg0.field1344 = null;
                return false;
            }
            if (class192.field2157 == arg0.field1344) {
                boolean var123 = var3.method5187();
                if (!var123) {
                    Statics.field1896 = null;
                } else if (Statics.field1896 == null) {
                    Statics.field1896 = new class249();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1344) {
                int var124 = var3.method5202();
                int var125 = var3.method5228();
                class222.field2550[var124] = var125;
                if (class222.field2551[var124] != var125) {
                    class222.field2551[var124] = var125;
                }
                method218(var124);
                field868[++field869 - 1 & 0x1F] = var124;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1344) {
                int var126 = var3.method5229();
                int var127 = var3.method5222();
                class227 var128 = class227.method3203(var126);
                if (var128.field2641 != var127 || var127 == -1) {
                    var128.field2641 = var127;
                    var128.field2722 = 0;
                    var128.field2723 = 0;
                    method1219(var128);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1344) {
                method3683(true, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1344) {
                boolean var129 = var3.method5276() == 1;
                if (var129) {
                    Statics.field445 = class308.method4786() - var3.method5186();
                    Statics.field236 = new class16(var3, true);
                } else {
                    Statics.field236 = null;
                }
                field853 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2223 == arg0.field1344) {
                String var130 = var3.method5189();
                Object[] var131 = new Object[var130.length() + 1];
                for (int var132 = var130.length() - 1; var132 >= 0; var132--) {
                    if (var130.charAt(var132) == 's') {
                        var131[var132 + 1] = var3.method5189();
                    } else {
                        var131[var132 + 1] = Integer.valueOf(var3.method5330());
                    }
                }
                var131[0] = Integer.valueOf(var3.method5330());
                class72 var133 = new class72();
                var133.field607 = var131;
                class86.method3119(var133);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2143 == arg0.field1344) {
                int var134 = var3.method5228();
                class227 var135 = class227.method3203(var134);
                var135.field2597 = 3;
                var135.field2606 = Statics.field3130.field646.method3775();
                method1219(var135);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1344) {
                method728(class195.field2356);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2165 == arg0.field1344) {
                byte[] var136 = new byte[arg0.field1345];
                var3.method5127(var136, 0, var136.length);
                class311 var137 = new class311(var136);
                String var138 = var137.method5189();
                class61.method2948(var138, true, false);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1344) {
                int var139 = var3.method5330();
                int var140 = var3.method5163();
                if (var139 < -70000) {
                    var140 += 32768;
                }
                class227 var141;
                if (var139 >= 0) {
                    var141 = class227.method3203(var139);
                } else {
                    var141 = null;
                }
                if (var141 != null) {
                    for (int var142 = 0; var142 < var141.field2718.length; var142++) {
                        var141.field2718[var142] = 0;
                        var141.field2719[var142] = 0;
                    }
                }
                class69.method47(var140);
                int var143 = var3.method5163();
                for (int var144 = 0; var144 < var143; var144++) {
                    int var145 = var3.method5193();
                    if (var145 == 255) {
                        var145 = var3.method5330();
                    }
                    int var146 = var3.method5163();
                    if (var141 != null && var144 < var141.field2718.length) {
                        var141.field2718[var144] = var146;
                        var141.field2719[var144] = var145;
                    }
                    class69.method132(var140, var144, var146 - 1, var145);
                }
                if (var141 != null) {
                    method1219(var141);
                }
                method4465();
                field870[++field942 - 1 & 0x1F] = var140 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2224 == arg0.field1344) {
                field699 = var3.method5276();
                if (field699 == 1) {
                    field700 = var3.method5163();
                }
                if (field699 >= 2 && field699 <= 6) {
                    if (field699 == 2) {
                        field953 = 64;
                        field752 = 64;
                    }
                    if (field699 == 3) {
                        field953 = 0;
                        field752 = 64;
                    }
                    if (field699 == 4) {
                        field953 = 128;
                        field752 = 64;
                    }
                    if (field699 == 5) {
                        field953 = 64;
                        field752 = 0;
                    }
                    if (field699 == 6) {
                        field953 = 64;
                        field752 = 128;
                    }
                    field699 = 2;
                    field730 = var3.method5163();
                    field703 = var3.method5163();
                    field704 = var3.method5276();
                }
                if (field699 == 10) {
                    field701 = var3.method5163();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2231 == arg0.field1344) {
                method728(class195.field2350);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2153 == arg0.field1344) {
                int var147 = var3.method5218();
                if (var147 == 65535) {
                    var147 = -1;
                }
                method2136(var147);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1344) {
                int var148 = var3.method5218();
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = var3.method5395();
                method2027(var148, var149);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2207 == arg0.field1344) {
                int var150 = var3.method5229();
                int var151 = var3.method5228();
                class71 var152 = (class71) field843.method5597((long) var151);
                class71 var153 = (class71) field843.method5597((long) var150);
                if (var153 != null) {
                    method1209(var153, var152 == null || var152.field596 != var153.field596);
                }
                if (var152 != null) {
                    var152.method3407();
                    field843.method5596(var152, (long) var150);
                }
                class227 var154 = class227.method3203(var151);
                if (var154 != null) {
                    method1219(var154);
                }
                class227 var155 = class227.method3203(var150);
                if (var155 != null) {
                    method1219(var155);
                    method3216(Statics.field2584[var155.field2594 >>> 16], var155, true);
                }
                if (field707 != -1) {
                    method657(field707, 1);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2212 == arg0.field1344) {
                int var156 = var3.method5163();
                field707 = var156;
                this.method1272(false);
                method5006(var156);
                class86.method1066(field707);
                for (int var157 = 0; var157 < 100; var157++) {
                    field835[var157] = true;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1344) {
                var3.field3741 += 28;
                if (var3.method5205()) {
                    method3269(var3, var3.field3741 - 28);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1344) {
                method728(class195.field2357);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1344) {
                method728(class195.field2353);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1344) {
                int var158 = var3.method5194();
                boolean var159 = var3.method5276() == 1;
                String var160 = "";
                boolean var161 = false;
                if (var159) {
                    var160 = var3.method5189();
                    if (Statics.field150.method1781(new class294(var160, Statics.field1990))) {
                        var161 = true;
                    }
                }
                String var162 = var3.method5189();
                if (!var161) {
                    class101.method783(var158, var160, var162);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2218 == arg0.field1344) {
                method728(class195.field2358);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2226 == arg0.field1344) {
                int var163 = var3.method5330();
                int var164 = var3.method5340();
                class227 var165 = class227.method3203(var163);
                if (var165.field2597 != 1 || var165.field2606 != var164) {
                    var165.field2597 = 1;
                    var165.field2606 = var164;
                    method1219(var165);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2155 == arg0.field1344) {
                for (int var166 = 0; var166 < class222.field2551.length; var166++) {
                    if (class222.field2551[var166] != class222.field2550[var166]) {
                        class222.field2551[var166] = class222.field2550[var166];
                        method218(var166);
                        field868[++field869 - 1 & 0x1F] = var166;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1344) {
                method728(class195.field2360);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2164 == arg0.field1344) {
                if (arg0.field1345 == 0) {
                    Statics.field438 = null;
                } else {
                    if (Statics.field438 == null) {
                        Statics.field438 = new class296(Statics.field1990, Statics.field3753);
                    }
                    Statics.field438.method4924(var3);
                }
                method3421();
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1344) {
                field698 = var3.method5202() * 30;
                field879 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2206 == arg0.field1344) {
                method728(class195.field2354);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2214 == arg0.field1344) {
                int var167 = var3.method5330();
                if (field764 != var167) {
                    field764 = var167;
                    method1123();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2198 == arg0.field1344) {
                int var168 = var3.method5202();
                int var169 = var3.method5330();
                int var170 = var3.method5202();
                class227 var171 = class227.method3203(var169);
                var171.field2735 = (var170 << 16) + var168;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1344) {
                class81 var172 = new class81();
                var172.field1055 = var3.method5189();
                var172.field1049 = var3.method5163();
                int var173 = var3.method5330();
                var172.field1051 = var173;
                method3258(45);
                var2.method3334();
                Object var174 = null;
                class95.method3703(var172);
                arg0.field1344 = null;
                return false;
            }
            if (class192.field2213 == arg0.field1344) {
                String var175 = var3.method5189();
                String var176 = class307.method5032(class302.method296(class220.method2739(var3)));
                class101.method783(6, var175, var176);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2152 == arg0.field1344) {
                Statics.field150.method1774();
                field875 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2210 == arg0.field1344) {
                method2196(true, arg0.field1343);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2162 == arg0.field1344) {
                field776 = false;
                for (int var177 = 0; var177 < 5; var177++) {
                    field927[var177] = false;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2202 == arg0.field1344) {
                int var178 = var3.method5221();
                int var179 = var3.method5183();
                int var180 = var3.method5228();
                class227 var181 = class227.method3203(var180);
                if (var181.field2603 != var178 || var181.field2646 != var179 || var181.field2599 != 0 || var181.field2600 != 0) {
                    var181.field2603 = var178;
                    var181.field2646 = var179;
                    var181.field2599 = 0;
                    var181.field2600 = 0;
                    method1219(var181);
                    this.method1241(var181);
                    if (var181.field2596 == 0) {
                        method3216(Statics.field2584[var180 >> 16], var181, false);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1344) {
                Statics.field150.method1803(var3, arg0.field1345);
                field875 = field867;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2199 == arg0.field1344) {
                for (int var182 = 0; var182 < field798.length; var182++) {
                    if (field798[var182] != null) {
                        field798[var182].field1008 = -1;
                    }
                }
                for (int var183 = 0; var183 < field872.length; var183++) {
                    if (field872[var183] != null) {
                        field872[var183].field1008 = -1;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1344) {
                int var184 = var3.method5276();
                method380(var184);
                arg0.field1344 = null;
                return false;
            }
            if (class192.field2149 == arg0.field1344) {
                class106.method678(var3, arg0.field1345);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2150 == arg0.field1344) {
                method728(class195.field2355);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1344) {
                method3683(false, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1344) {
                field912 = var3.method5276();
                if (field912 == 255) {
                    field912 = 0;
                }
                field877 = var3.method5276();
                if (field877 == 255) {
                    field877 = 0;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2216 == arg0.field1344) {
                int var185 = var3.method5163();
                int var186 = var3.method5276();
                int var187 = var3.method5163();
                method4224(var185, var186, var187);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2227 == arg0.field1344) {
                int var188 = var3.method5218();
                class69.method681(var188);
                field870[++field942 - 1 & 0x1F] = var188 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2193 == arg0.field1344) {
                int var189 = var3.method5276();
                method2440(var189);
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2156 == arg0.field1344) {
                Statics.field467 = var3.method5193();
                Statics.field65 = var3.method5276();
                for (int var190 = Statics.field467; var190 < Statics.field467 + 8; var190++) {
                    for (int var191 = Statics.field65; var191 < Statics.field65 + 8; var191++) {
                        if (field914[Statics.field99][var190][var191] != null) {
                            field914[Statics.field99][var190][var191] = null;
                            method593(var190, var191);
                        }
                    }
                }
                for (class78 var192 = (class78) field864.method4638(); var192 != null; var192 = (class78) field864.method4640()) {
                    if (var192.field961 >= Statics.field467 && var192.field961 < Statics.field467 + 8 && var192.field962 >= Statics.field65 && var192.field962 < Statics.field65 + 8 && Statics.field99 == var192.field959) {
                        var192.field970 = 0;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2147 == arg0.field1344) {
                int var193 = var3.method5163();
                int var194 = var3.method5229();
                class227 var195 = class227.method3203(var194);
                if (var195 != null && var195.field2596 == 0) {
                    if (var193 > var195.field2733 - var195.field2610) {
                        var193 = var195.field2733 - var195.field2610;
                    }
                    if (var193 < 0) {
                        var193 = 0;
                    }
                    if (var195.field2616 != var193) {
                        var195.field2616 = var193;
                        method1219(var195);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class192.field2148 == arg0.field1344) {
                int var196 = var3.method5163();
                int var197 = var3.method5330();
                class227 var198 = class227.method3203(var197);
                if (var198.field2597 != 2 || var198.field2606 != var196) {
                    var198.field2597 = 2;
                    var198.field2606 = var196;
                    method1219(var198);
                }
                arg0.field1344 = null;
                return true;
            }
            class352.method2205("" + (arg0.field1344 == null ? -1 : arg0.field1344.field2229) + class91.field1178 + (arg0.field1340 == null ? -1 : arg0.field1340.field2229) + class91.field1178 + (arg0.field1351 == null ? -1 : arg0.field1351.field2229) + class91.field1178 + arg0.field1345, (Throwable) null);
            method1969();
        } catch (IOException var203) {
            method2721();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1344 == null ? -1 : arg0.field1344.field2229) + class91.field1178 + (arg0.field1340 == null ? -1 : arg0.field1340.field2229) + class91.field1178 + (arg0.field1351 == null ? -1 : arg0.field1351.field2229) + class91.field1178 + arg0.field1345 + class91.field1178 + (Statics.field1641 + Statics.field3130.field1031[0]) + class91.field1178 + (Statics.field132 + Statics.field3130.field1032[0]) + class91.field1178;
            for (int var202 = 0; var202 < arg0.field1345 && var202 < 50; var202++) {
                var201 = var201 + var3.field3742[var202] + class91.field1178;
            }
            class352.method2205(var201, var204);
            method1969();
        }
        return true;
    }

    @ObfuscatedName("ap.hl(Lgg;I)V")
    public static final void method728(class195 arg0) {
        class310 var1 = field729.field1343;
        if (class195.field2356 == arg0) {
            byte var2 = var1.method5380();
            int var3 = var1.method5202();
            byte var4 = var1.method5380();
            int var5 = var1.method5193();
            int var6 = (var5 >> 4 & 0x7) + Statics.field467;
            int var7 = (var5 & 0x7) + Statics.field65;
            int var8 = var1.method5202();
            int var9 = var1.method5163();
            int var10 = var1.method5163();
            int var11 = var1.method5162();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field955[var12];
            byte var15 = var1.method5380();
            byte var16 = var1.method5380();
            class76 var17;
            if (field799 == var9) {
                var17 = Statics.field3130;
            } else {
                var17 = field798[var9];
            }
            if (var17 != null) {
                class265 var18 = class265.method1122(var10);
                int var19;
                int var20;
                if (var13 == 1 || var13 == 3) {
                    var19 = var18.field3390;
                    var20 = var18.field3389;
                } else {
                    var19 = var18.field3389;
                    var20 = var18.field3390;
                }
                int var21 = (var19 >> 1) + var6;
                int var22 = (var19 + 1 >> 1) + var6;
                int var23 = (var20 >> 1) + var7;
                int var24 = (var20 + 1 >> 1) + var7;
                int[][] var25 = class65.field531[Statics.field99];
                int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
                int var27 = (var6 << 7) + (var19 << 6);
                int var28 = (var7 << 7) + (var20 << 6);
                class137 var29 = var18.method4358(var12, var13, var25, var27, var26, var28);
                if (var29 != null) {
                    method175(Statics.field99, var6, var7, var14, -1, 0, 0, var8 + 1, var3 + 1);
                    var17.field671 = field863 + var8;
                    var17.field649 = field863 + var3;
                    var17.field658 = var29;
                    var17.field655 = var6 * 128 + var19 * 64;
                    var17.field657 = var7 * 128 + var20 * 64;
                    var17.field656 = var26;
                    if (var2 > var15) {
                        byte var30 = var2;
                        var2 = var15;
                        var15 = var30;
                    }
                    if (var4 > var16) {
                        byte var31 = var4;
                        var4 = var16;
                        var16 = var31;
                    }
                    var17.field647 = var2 + var6;
                    var17.field661 = var6 + var15;
                    var17.field670 = var4 + var7;
                    var17.field662 = var7 + var16;
                }
            }
        }
        if (class195.field2354 == arg0) {
            int var32 = var1.method5276();
            int var33 = (var32 >> 4 & 0x7) + Statics.field467;
            int var34 = (var32 & 0x7) + Statics.field65;
            int var35 = var1.method5202();
            int var36 = var1.method5202();
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                class97 var37 = new class97();
                var37.field1270 = var35;
                var37.field1269 = var36;
                if (field914[Statics.field99][var33][var34] == null) {
                    field914[Statics.field99][var33][var34] = new class273();
                }
                field914[Statics.field99][var33][var34].method4639(var37);
                method593(var33, var34);
            }
        } else if (class195.field2349 == arg0) {
            int var38 = var1.method5162();
            int var39 = (var38 >> 4 & 0x7) + Statics.field467;
            int var40 = (var38 & 0x7) + Statics.field65;
            int var41 = var1.method5162();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field955[var42];
            int var45 = var1.method5202();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                method175(Statics.field99, var39, var40, var44, var45, var42, var43, 0, -1);
            }
        } else if (class195.field2350 == arg0) {
            int var46 = var1.method5340();
            int var47 = var1.method5218();
            int var48 = var1.method5276();
            int var49 = (var48 >> 4 & 0x7) + Statics.field467;
            int var50 = (var48 & 0x7) + Statics.field65;
            int var51 = var1.method5193();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                int var52 = var49 * 128 + 64;
                int var53 = var50 * 128 + 64;
                class87 var54 = new class87(var47, Statics.field99, var52, var53, method124(var52, var53, Statics.field99) - var51, var46, field863);
                field913.method4639(var54);
            }
        } else if (class195.field2353 == arg0) {
            int var55 = var1.method5211();
            int var56 = var1.method5163();
            int var57 = var1.method5211();
            int var58 = (var57 >> 4 & 0x7) + Statics.field467;
            int var59 = (var57 & 0x7) + Statics.field65;
            byte var60 = var1.method5212();
            byte var61 = var1.method5231();
            int var62 = var1.method5211() * 4;
            int var63 = var1.method5193();
            int var64 = var1.method5163();
            int var65 = var1.method5163();
            int var66 = var1.method5222();
            int var67 = var1.method5162() * 4;
            int var68 = var58 + var61;
            int var69 = var59 + var60;
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var65 != 65535) {
                int var70 = var58 * 128 + 64;
                int var71 = var59 * 128 + 64;
                int var72 = var68 * 128 + 64;
                int var73 = var69 * 128 + 64;
                class96 var74 = new class96(var65, Statics.field99, var70, var71, method124(var70, var71, Statics.field99) - var67, field863 + var64, field863 + var56, var55, var63, var66, var62);
                var74.method2024(var72, var73, method124(var72, var73, Statics.field99) - var62, field863 + var64);
                field854.method4639(var74);
            }
        } else if (class195.field2358 == arg0) {
            int var75 = var1.method5202();
            int var76 = var1.method5202();
            int var77 = var1.method5211();
            int var78 = (var77 >> 4 & 0x7) + Statics.field467;
            int var79 = (var77 & 0x7) + Statics.field65;
            int var80 = var1.method5340();
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                class273 var81 = field914[Statics.field99][var78][var79];
                if (var81 != null) {
                    for (class97 var82 = (class97) var81.method4638(); var82 != null; var82 = (class97) var81.method4640()) {
                        if ((var75 & 0x7FFF) == var82.field1270 && var82.field1269 == var80) {
                            var82.field1269 = var76;
                            break;
                        }
                    }
                    method593(var78, var79);
                }
            }
        } else {
            if (class195.field2352 == arg0) {
                int var83 = var1.method5162();
                int var84 = var1.method5276();
                int var85 = var84 >> 4 & 0xF;
                int var86 = var84 & 0x7;
                int var87 = var1.method5211();
                int var88 = (var87 >> 4 & 0x7) + Statics.field467;
                int var89 = (var87 & 0x7) + Statics.field65;
                int var90 = var1.method5202();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    int var91 = var85 + 1;
                    if (Statics.field3130.field1031[0] >= var88 - var91 && Statics.field3130.field1031[0] <= var88 + var91 && Statics.field3130.field1032[0] >= var89 - var91 && Statics.field3130.field1032[0] <= var89 + var91 && field837 != 0 && var86 > 0 && field920 < 50) {
                        field921[field920] = var90;
                        field922[field920] = var86;
                        field805[field920] = var83;
                        field925[field920] = null;
                        field924[field920] = (var88 << 16) + (var89 << 8) + var85;
                        field920++;
                    }
                }
            }
            if (class195.field2357 == arg0) {
                int var92 = var1.method5193();
                int var93 = (var92 >> 4 & 0x7) + Statics.field467;
                int var94 = (var92 & 0x7) + Statics.field65;
                int var95 = var1.method5202();
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    class273 var96 = field914[Statics.field99][var93][var94];
                    if (var96 != null) {
                        for (class97 var97 = (class97) var96.method4638(); var97 != null; var97 = (class97) var96.method4640()) {
                            if ((var95 & 0x7FFF) == var97.field1270) {
                                var97.method3407();
                                break;
                            }
                        }
                        if (var96.method4638() == null) {
                            field914[Statics.field99][var93][var94] = null;
                        }
                        method593(var93, var94);
                    }
                }
            } else if (class195.field2355 == arg0) {
                int var98 = var1.method5211();
                int var99 = var98 >> 2;
                int var100 = var98 & 0x3;
                int var101 = field955[var99];
                int var102 = var1.method5218();
                int var103 = var1.method5162();
                int var104 = (var103 >> 4 & 0x7) + Statics.field467;
                int var105 = (var103 & 0x7) + Statics.field65;
                if (var104 >= 0 && var105 >= 0 && var104 < 103 && var105 < 103) {
                    if (var101 == 0) {
                        class146 var106 = Statics.field2412.method3012(Statics.field99, var104, var105);
                        if (var106 != null) {
                            int var107 = class138.method1840(var106.field1906);
                            if (var99 == 2) {
                                var106.field1904 = new class103(var107, 2, var100 + 4, Statics.field99, var104, var105, var102, false, var106.field1904);
                                var106.field1908 = new class103(var107, 2, var100 + 1 & 0x3, Statics.field99, var104, var105, var102, false, var106.field1908);
                            } else {
                                var106.field1904 = new class103(var107, var99, var100, Statics.field99, var104, var105, var102, false, var106.field1904);
                            }
                        }
                    }
                    if (var101 == 1) {
                        class151 var108 = Statics.field2412.method3011(Statics.field99, var104, var105);
                        if (var108 != null) {
                            int var109 = class138.method1840(var108.field1949);
                            if (var99 == 4 || var99 == 5) {
                                var108.field1947 = new class103(var109, 4, var100, Statics.field99, var104, var105, var102, false, var108.field1947);
                            } else if (var99 == 6) {
                                var108.field1947 = new class103(var109, 4, var100 + 4, Statics.field99, var104, var105, var102, false, var108.field1947);
                            } else if (var99 == 7) {
                                var108.field1947 = new class103(var109, 4, (var100 + 2 & 0x3) + 4, Statics.field99, var104, var105, var102, false, var108.field1947);
                            } else if (var99 == 8) {
                                var108.field1947 = new class103(var109, 4, var100 + 4, Statics.field99, var104, var105, var102, false, var108.field1947);
                                var108.field1948 = new class103(var109, 4, (var100 + 2 & 0x3) + 4, Statics.field99, var104, var105, var102, false, var108.field1948);
                            }
                        }
                    }
                    if (var101 == 2) {
                        class152 var110 = Statics.field2412.method2976(Statics.field99, var104, var105);
                        if (var99 == 11) {
                            var99 = 10;
                        }
                        if (var110 != null) {
                            var110.field1957 = new class103(class138.method1840(var110.field1955), var99, var100, Statics.field99, var104, var105, var102, false, var110.field1957);
                        }
                    }
                    if (var101 == 3) {
                        class133 var111 = Statics.field2412.method2977(Statics.field99, var104, var105);
                        if (var111 != null) {
                            var111.field1639 = new class103(class138.method1840(var111.field1640), 22, var100, Statics.field99, var104, var105, var102, false, var111.field1639);
                        }
                    }
                }
            } else if (class195.field2360 == arg0) {
                int var112 = var1.method5193();
                int var113 = (var112 >> 4 & 0x7) + Statics.field467;
                int var114 = (var112 & 0x7) + Statics.field65;
                int var115 = var1.method5193();
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = field955[var116];
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method175(Statics.field99, var113, var114, var118, -1, var116, var117, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("j.hy(IIIIIIIIIB)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field864.method4638(); var10 != null; var10 = (class78) field864.method4640()) {
            if (var10.field959 == arg0 && var10.field961 == arg1 && var10.field962 == arg2 && var10.field968 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field959 = arg0;
            var9.field968 = arg3;
            var9.field961 = arg1;
            var9.field962 = arg2;
            Statics.method3310(var9);
            field864.method4639(var9);
        }
        var9.field966 = arg4;
        var9.field963 = arg5;
        var9.field967 = arg6;
        var9.field969 = arg7;
        var9.field970 = arg8;
    }

    @ObfuscatedName("ek.hz(I)V")
    public static final void method2723() {
        for (class78 var0 = (class78) field864.method4638(); var0 != null; var0 = (class78) field864.method4640()) {
            if (var0.field970 > 0) {
                var0.field970--;
            }
            if (var0.field970 != 0) {
                if (var0.field969 > 0) {
                    var0.field969--;
                }
                if (var0.field969 == 0 && var0.field961 >= 1 && var0.field962 >= 1 && var0.field961 <= 102 && var0.field962 <= 102 && (var0.field966 < 0 || class65.method3153(var0.field966, var0.field963))) {
                    method250(var0.field959, var0.field968, var0.field961, var0.field962, var0.field966, var0.field967, var0.field963);
                    var0.field969 = -1;
                    if (var0.field966 == var0.field965 && var0.field965 == -1) {
                        var0.method3407();
                    } else if (var0.field966 == var0.field965 && var0.field967 == var0.field964 && var0.field963 == var0.field960) {
                        var0.method3407();
                    }
                }
            } else if (var0.field965 < 0 || class65.method3153(var0.field965, var0.field960)) {
                method250(var0.field959, var0.field968, var0.field961, var0.field962, var0.field965, var0.field964, var0.field960);
                var0.method3407();
            }
        }
    }

    @ObfuscatedName("ac.hj(IIIIIIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field685 && Statics.field99 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field2412.method2978(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2412.method3067(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2412.method2980(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2412.method2981(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field2412.method2982(arg0, arg2, arg3, var7);
            int var13 = class138.method1840(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2412.method3025(arg0, arg2, arg3);
                class265 var16 = class265.method1122(var13);
                if (var16.field3391 != 0) {
                    field740[arg0].method3369(arg2, arg3, var14, var15, var16.field3381);
                }
            }
            if (arg1 == 1) {
                Statics.field2412.method3090(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2412.method3017(arg0, arg2, arg3);
                class265 var17 = class265.method1122(var13);
                if (var17.field3389 + arg2 > 103 || var17.field3389 + arg3 > 103 || var17.field3390 + arg2 > 103 || var17.field3390 + arg3 > 103) {
                    return;
                }
                if (var17.field3391 != 0) {
                    field740[arg0].method3370(arg2, arg3, var17.field3389, var17.field3390, var15, var17.field3381);
                }
            }
            if (arg1 == 3) {
                Statics.field2412.method2972(arg0, arg2, arg3);
                class265 var18 = class265.method1122(var13);
                if (var18.field3391 == 1) {
                    field740[arg0].method3372(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field538[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class143 var20 = Statics.field2412;
        class182 var21 = field740[arg0];
        class265 var22 = class265.method1122(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3390;
            var24 = var22.field3389;
        } else {
            var23 = var22.field3389;
            var24 = var22.field3390;
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
        int[][] var29 = class65.field531[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class138.method1223(arg2, arg3, 2, var22.field3401 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3392 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class145 var36;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var36 = var22.method4358(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class103(arg4, 22, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method3074(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3391 == 1) {
                var21.method3367(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var62;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var62 = var22.method4358(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class103(arg4, 10, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            if (var62 != null) {
                var20.method2962(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3391 != 0) {
                var21.method3365(arg2, arg3, var23, var24, var22.field3381);
            }
        } else if (arg6 >= 12) {
            class145 var37;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var37 = var22.method4358(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2962(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3391 != 0) {
                var21.method3365(arg2, arg3, var23, var24, var22.field3381);
            }
        } else if (arg6 == 0) {
            class145 var38;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var38 = var22.method4358(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class103(arg4, 0, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2960(arg0, arg2, arg3, var30, var38, (class145) null, class65.field534[arg5], 0, var33, var35);
            if (var22.field3391 != 0) {
                var21.method3364(arg2, arg3, arg6, arg5, var22.field3381);
            }
        } else if (arg6 == 1) {
            class145 var39;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var39 = var22.method4358(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class103(arg4, 1, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2960(arg0, arg2, arg3, var30, var39, (class145) null, class65.field535[arg5], 0, var33, var35);
            if (var22.field3391 != 0) {
                var21.method3364(arg2, arg3, arg6, arg5, var22.field3381);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class145 var41;
            class145 var42;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var41 = var22.method4358(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4358(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class103(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3397, true, (class145) null);
                var42 = new class103(arg4, 2, var40, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2960(arg0, arg2, arg3, var30, var41, var42, class65.field534[arg5], class65.field534[var40], var33, var35);
            if (var22.field3391 != 0) {
                var21.method3364(arg2, arg3, arg6, arg5, var22.field3381);
            }
        } else if (arg6 == 3) {
            class145 var43;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var43 = var22.method4358(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class103(arg4, 3, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2960(arg0, arg2, arg3, var30, var43, (class145) null, class65.field535[arg5], 0, var33, var35);
            if (var22.field3391 != 0) {
                var21.method3364(arg2, arg3, arg6, arg5, var22.field3381);
            }
        } else if (arg6 == 9) {
            class145 var44;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var44 = var22.method4358(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2962(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3391 != 0) {
                var21.method3365(arg2, arg3, var23, var24, var22.field3381);
            }
        } else if (arg6 == 4) {
            class145 var45;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var45 = var22.method4358(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2961(arg0, arg2, arg3, var30, var45, (class145) null, class65.field534[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2978(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class265.method1122(class138.method1840(var47)).field3412;
            }
            class145 var49;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var49 = var22.method4358(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2961(arg0, arg2, arg3, var30, var49, (class145) null, class65.field534[arg5], 0, class65.field529[arg5] * var46, class65.field537[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2978(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class265.method1122(class138.method1840(var51)).field3412 / 2;
            }
            class145 var53;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var53 = var22.method4358(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2961(arg0, arg2, arg3, var30, var53, (class145) null, 256, arg5, class65.field536[arg5] * var50, class65.field530[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class145 var55;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var55 = var22.method4358(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class103(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2961(arg0, arg2, arg3, var30, var55, (class145) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2978(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class265.method1122(class138.method1840(var57)).field3412 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class145 var60;
            class145 var61;
            if (var22.field3397 == -1 && var22.field3414 == null) {
                var60 = var22.method4358(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4358(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3397, true, (class145) null);
                var61 = new class103(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3397, true, (class145) null);
            }
            var20.method2961(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class65.field536[arg5] * var56, class65.field530[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("aw.hb(IIB)V")
    public static final void method593(int arg0, int arg1) {
        class273 var2 = field914[Statics.field99][arg0][arg1];
        if (var2 == null) {
            Statics.field2412.method2973(Statics.field99, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class97 var5 = null;
        for (class97 var6 = (class97) var2.method4638(); var6 != null; var6 = (class97) var2.method4640()) {
            class266 var7 = class266.method335(var6.field1270);
            long var8 = (long) var7.field3446;
            if (var7.field3458 == 1) {
                var8 = (long) (var6.field1269 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2412.method2973(Statics.field99, arg0, arg1);
            return;
        }
        var2.method4652(var5);
        class97 var10 = null;
        class97 var11 = null;
        for (class97 var12 = (class97) var2.method4638(); var12 != null; var12 = (class97) var2.method4640()) {
            if (var5.field1270 != var12.field1270) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1270 != var12.field1270 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class138.method1223(arg0, arg1, 3, false, 0);
        Statics.field2412.method3077(Statics.field99, arg0, arg1, method124(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field99), var5, var13, var10, var11);
    }

    @ObfuscatedName("hk.hh(ZLks;B)V")
    public static final void method3683(boolean arg0, class310 arg1) {
        field803 = 0;
        field727 = 0;
        class310 var2 = field729.field1343;
        var2.method5128();
        int var3 = var2.method5129(8);
        if (var3 < field725) {
            for (int var4 = var3; var4 < field725; var4++) {
                field804[++field803 - 1] = field801[var4];
            }
        }
        if (var3 > field725) {
            throw new RuntimeException("");
        }
        field725 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field801[var5];
            class89 var7 = field872[var6];
            int var8 = var2.method5129(1);
            if (var8 == 0) {
                field801[++field725 - 1] = var6;
                var7.field1011 = field863;
            } else {
                int var9 = var2.method5129(2);
                if (var9 == 0) {
                    field801[++field725 - 1] = var6;
                    var7.field1011 = field863;
                    field728[++field727 - 1] = var6;
                } else if (var9 == 1) {
                    field801[++field725 - 1] = var6;
                    var7.field1011 = field863;
                    int var10 = var2.method5129(3);
                    var7.method1959(var10, (byte) 1);
                    int var11 = var2.method5129(1);
                    if (var11 == 1) {
                        field728[++field727 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field801[++field725 - 1] = var6;
                    var7.field1011 = field863;
                    int var12 = var2.method5129(3);
                    var7.method1959(var12, (byte) 2);
                    int var13 = var2.method5129(3);
                    var7.method1959(var13, (byte) 2);
                    int var14 = var2.method5129(1);
                    if (var14 == 1) {
                        field728[++field727 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field804[++field803 - 1] = var6;
                }
            }
        }
        method614(arg0, arg1);
        method2404(arg1);
        for (int var15 = 0; var15 < field803; var15++) {
            int var16 = field804[var15];
            if (field863 != field872[var16].field1011) {
                field872[var16].field1158 = null;
                field872[var16] = null;
            }
        }
        if (field729.field1345 != arg1.field3741) {
            throw new RuntimeException(arg1.field3741 + class91.field1178 + field729.field1345);
        }
        for (int var17 = 0; var17 < field725; var17++) {
            if (field872[field801[var17]] == null) {
                throw new RuntimeException(var17 + class91.field1178 + field725);
            }
        }
    }

    @ObfuscatedName("aa.hv(ZLks;B)V")
    public static final void method614(boolean arg0, class310 arg1) {
        while (true) {
            if (arg1.method5131(field729.field1345) >= 27) {
                int var2 = arg1.method5129(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field872[var2] == null) {
                        field872[var2] = new class89();
                        var3 = true;
                    }
                    class89 var4 = field872[var2];
                    field801[++field725 - 1] = var2;
                    var4.field1011 = field863;
                    int var5 = arg1.method5129(1);
                    int var6 = arg1.method5129(1);
                    if (var6 == 1) {
                        field728[++field727 - 1] = var2;
                    }
                    int var7 = field808[arg1.method5129(3)];
                    if (var3) {
                        var4.field1027 = var4.field977 = var7;
                    }
                    int var8;
                    if (arg0) {
                        var8 = arg1.method5129(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method5129(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5129(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5129(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1158 = class268.method3332(arg1.method5129(14));
                    var4.field1012 = var4.field1158.field3485;
                    var4.field1029 = var4.field1158.field3514;
                    if (var4.field1029 == 0) {
                        var4.field977 = 0;
                    }
                    var4.field991 = var4.field1158.field3497;
                    var4.field985 = var4.field1158.field3510;
                    var4.field986 = var4.field1158.field3509;
                    var4.field984 = var4.field1158.field3502;
                    var4.field998 = var4.field1158.field3494;
                    var4.field982 = var4.field1158.field3495;
                    var4.field983 = var4.field1158.field3496;
                    var4.method1957(Statics.field3130.field1031[0] + var9, Statics.field3130.field1032[0] + var8, var5 == 1);
                    continue;
                }
            }
            arg1.method5153();
            return;
        }
    }

    @ObfuscatedName("dz.hn(Lks;I)V")
    public static final void method2404(class310 arg0) {
        for (int var1 = 0; var1 < field727; var1++) {
            int var2 = field728[var1];
            class89 var3 = field872[var2];
            int var4 = arg0.method5276();
            if ((var4 & 0x10) != 0) {
                var3.field1002 = arg0.method5202();
                if (var3.field1002 == 65535) {
                    var3.field1002 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var5 = arg0.method5340();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method5193();
                if (var3.field1008 == var5 && var5 != -1) {
                    int var7 = class270.method2219(var5).field3552;
                    if (var7 == 1) {
                        var3.field1007 = 0;
                        var3.field990 = 0;
                        var3.field981 = var6;
                        var3.field1023 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1023 = 0;
                    }
                } else if (var5 == -1 || var3.field1008 == -1 || class270.method2219(var5).field3546 >= class270.method2219(var3.field1008).field3546) {
                    var3.field1008 = var5;
                    var3.field1007 = 0;
                    var3.field990 = 0;
                    var3.field981 = var6;
                    var3.field1023 = 0;
                    var3.field1035 = var3.field999;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = arg0.method5202();
                int var9 = arg0.method5202();
                int var10 = var3.field1000 - (var8 - Statics.field1641 - Statics.field1641) * 64;
                int var11 = var3.field976 - (var9 - Statics.field132 - Statics.field132) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1004 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field989 = arg0.method5189();
                var3.field992 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1018 = arg0.method5181();
                var3.field1020 = arg0.method5380();
                var3.field1019 = arg0.method5181();
                var3.field1021 = arg0.method5380();
                var3.field1010 = arg0.method5163() + field863;
                var3.field1025 = arg0.method5163() + field863;
                var3.field1024 = arg0.method5218();
                var3.field999 = 1;
                var3.field1035 = 0;
                var3.field1018 += var3.field1031[0];
                var3.field1020 += var3.field1032[0];
                var3.field1019 += var3.field1031[0];
                var3.field1021 += var3.field1032[0];
            }
            if ((var4 & 0x80) != 0) {
                int var12 = arg0.method5211();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method5194();
                        if (var17 == 32767) {
                            var17 = arg0.method5194();
                            var15 = arg0.method5194();
                            var14 = arg0.method5194();
                            var16 = arg0.method5194();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method5194();
                        }
                        int var18 = arg0.method5194();
                        var3.method1667(var17, var15, var14, var16, field863, var18);
                    }
                }
                int var19 = arg0.method5211();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method5194();
                        int var22 = arg0.method5194();
                        if (var22 == 32767) {
                            var3.method1669(var21);
                        } else {
                            int var23 = arg0.method5194();
                            int var24 = arg0.method5193();
                            int var25 = var22 > 0 ? arg0.method5276() : var24;
                            var3.method1665(var21, field863, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1158 = class268.method3332(arg0.method5340());
                var3.field1012 = var3.field1158.field3485;
                var3.field1029 = var3.field1158.field3514;
                var3.field991 = var3.field1158.field3497;
                var3.field985 = var3.field1158.field3510;
                var3.field986 = var3.field1158.field3509;
                var3.field984 = var3.field1158.field3502;
                var3.field998 = var3.field1158.field3494;
                var3.field982 = var3.field1158.field3495;
                var3.field983 = var3.field1158.field3496;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1013 = arg0.method5163();
                int var26 = arg0.method5330();
                var3.field1017 = var26 >> 16;
                var3.field1016 = (var26 & 0xFFFF) + field863;
                var3.field1014 = 0;
                var3.field1015 = 0;
                if (var3.field1016 > field863) {
                    var3.field1014 = -1;
                }
                if (var3.field1013 == 65535) {
                    var3.field1013 = -1;
                }
            }
        }
    }

    @ObfuscatedName("jw.hq(Lbi;IIBB)V")
    public static final void method4719(class76 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1031[0];
        int var5 = arg0.field1032[0];
        int var6 = arg0.method1174();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1174();
        field878.field2129 = arg1;
        field878.field2127 = arg2;
        field878.field2130 = 1;
        field878.field2128 = 1;
        class75 var10 = field878;
        int var11 = class183.method1162(var4, var5, var9, var10, field740[arg0.field666], true, field696, field957);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1178(field696[var12], field957[var12], arg3);
            }
        }
    }

    @ObfuscatedName("ah.hp(B)V")
    public static void method351() {
        Statics.method333();
        field824[0] = class234.field2954;
        field825[0] = "";
        field822[0] = 1006;
        field826[0] = false;
        field819 = 1;
    }

    @ObfuscatedName("client.ho(I)V")
    public final void method1448() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field819 - 1; var2++) {
                if (field822[var2] < 1000 && field822[var2 + 1] > 1000) {
                    String var3 = field825[var2];
                    field825[var2] = field825[var2 + 1];
                    field825[var2 + 1] = var3;
                    String var4 = field824[var2];
                    field824[var2] = field824[var2 + 1];
                    field824[var2 + 1] = var4;
                    int var5 = field822[var2];
                    field822[var2] = field822[var2 + 1];
                    field822[var2 + 1] = var5;
                    int var6 = field820[var2];
                    field820[var2] = field820[var2 + 1];
                    field820[var2 + 1] = var6;
                    int var7 = field821[var2];
                    field821[var2] = field821[var2 + 1];
                    field821[var2 + 1] = var7;
                    int var8 = field823[var2];
                    field823[var2] = field823[var2 + 1];
                    field823[var2 + 1] = var8;
                    boolean var9 = field826[var2];
                    field826[var2] = field826[var2 + 1];
                    field826[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field3139 != null || field855 != null) {
            return;
        }
        int var31;
        int var33;
        int var34;
        label250: {
            int var10 = class64.field520;
            if (field818) {
                if (var10 != 1 && (Statics.field2487 || var10 != 4)) {
                    int var11 = class64.field510;
                    int var12 = class64.field514;
                    if (var11 < Statics.field2558 - 10 || var11 > Statics.field422 + Statics.field2558 + 10 || var12 < Statics.field252 - 10 || var12 > Statics.field252 + Statics.field2209 + 10) {
                        field818 = false;
                        int var13 = Statics.field2558;
                        int var14 = Statics.field252;
                        int var15 = Statics.field422;
                        int var16 = Statics.field2209;
                        for (int var17 = 0; var17 < field885; var17++) {
                            if (field892[var17] + field890[var17] > var13 && field890[var17] < var13 + var15 && field893[var17] + field891[var17] > var14 && field891[var17] < var14 + var16) {
                                field835[var17] = true;
                            }
                        }
                    }
                }
                if (var10 == 1 || !Statics.field2487 && var10 == 4) {
                    int var18 = Statics.field2558;
                    int var19 = Statics.field252;
                    int var20 = Statics.field422;
                    int var21 = class64.field525;
                    int var22 = class64.field522;
                    int var23 = -1;
                    for (int var24 = 0; var24 < field819; var24++) {
                        int var25 = (field819 - 1 - var24) * 15 + var19 + 31;
                        if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                            var23 = var24;
                        }
                    }
                    if (var23 != -1) {
                        Statics.method4312(var23);
                    }
                    field818 = false;
                    int var26 = Statics.field2558;
                    int var27 = Statics.field252;
                    int var28 = Statics.field422;
                    int var29 = Statics.field2209;
                    for (int var30 = 0; var30 < field885; var30++) {
                        if (field892[var30] + field890[var30] > var26 && field890[var30] < var26 + var28 && field893[var30] + field891[var30] > var27 && field891[var30] < var27 + var29) {
                            field835[var30] = true;
                        }
                    }
                }
            } else {
                var31 = method3327();
                if ((var10 == 1 || !Statics.field2487 && var10 == 4) && var31 >= 0) {
                    int var32 = field822[var31];
                    if (var32 == 39 || var32 == 40 || var32 == 41 || var32 == 42 || var32 == 43 || var32 == 33 || var32 == 34 || var32 == 35 || var32 == 36 || var32 == 37 || var32 == 38 || var32 == 1005) {
                        var33 = field820[var31];
                        var34 = field821[var31];
                        class227 var35 = class227.method3203(var34);
                        int var36 = method222(var35);
                        boolean var37 = (var36 >> 28 & 0x1) != 0;
                        if (var37) {
                            break label250;
                        }
                        int var38 = method222(var35);
                        boolean var39 = (var38 >> 29 & 0x1) != 0;
                        if (var39) {
                            break label250;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field2487 && var10 == 4) && this.method1238()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field2487 && var10 == 4) && field819 > 0) {
                    Statics.method4312(var31);
                }
                if (var10 == 2 && field819 > 0) {
                    this.method1239(class64.field525, class64.field522);
                }
            }
            return;
        }
        if (Statics.field3139 != null && !field831 && field819 > 0 && !this.method1238()) {
            int var40 = field791;
            int var41 = field830;
            class92 var42 = Statics.field92;
            method3718(var42.field1192, var42.field1195, var42.field1188, var42.field1190, var42.field1191, var42.field1191, var40, var41);
            Statics.field92 = null;
        }
        field831 = false;
        field739 = 0;
        if (Statics.field3139 != null) {
            method1219(Statics.field3139);
        }
        Statics.field3139 = class227.method3203(var34);
        field790 = var33;
        field791 = class64.field525;
        field830 = class64.field522;
        if (var31 >= 0) {
            method3717(var31);
        }
        method1219(Statics.field3139);
    }

    @ObfuscatedName("client.hs(I)Z")
    public final boolean method1238() {
        int var1 = method3327();
        return (field888 == 1 && field819 > 2 || method299(var1)) && !field826[var1];
    }

    @ObfuscatedName("client.hw(IIB)V")
    public final void method1239(int arg0, int arg1) {
        method4225(arg0, arg1);
        Statics.field2412.method2989(Statics.field99, arg0, arg1, false);
        field818 = true;
    }

    @ObfuscatedName("ii.hx(III)V")
    public static void method4225(int arg0, int arg1) {
        int var2 = Statics.field1360.method5028(class234.field2942);
        for (int var3 = 0; var3 < field819; var3++) {
            class306 var4 = Statics.field1360;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field825[var3].length() > 0) {
                var5 = field824[var3] + class234.field2949 + field825[var3];
            } else {
                var5 = field824[var3];
            }
            int var6 = var4.method5028(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field819 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field567) {
            var8 = Statics.field567 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1150) {
            var9 = Statics.field1150 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field2558 = var8;
        Statics.field252 = var9;
        Statics.field422 = var2;
        Statics.field2209 = field819 * 15 + 22;
    }

    @ObfuscatedName("af.hr(IB)Z")
    public static final boolean method299(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field822[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("hn.hm(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method3718(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 39) {
            class197 var8 = class197.method57(class193.field2244, field729.field1347);
            var8.field2371.method5217(arg3);
            var8.field2371.method5217(arg0);
            var8.field2371.method5166(arg1);
            field729.method2178(var8);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 58) {
            class227 var9 = class227.method1104(arg1, arg0);
            if (var9 != null) {
                class197 var10 = class197.method57(class193.field2239, field729.field1347);
                var10.field2371.method5216(arg0);
                var10.field2371.method5215(field839);
                var10.field2371.method5215(field838);
                var10.field2371.method5166(arg1);
                var10.field2371.method5227(Statics.field3731);
                var10.field2371.method5164(var9.field2720);
                field729.method2178(var10);
            }
        }
        if (arg2 == 1) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var11 = class197.method57(class193.field2294, field729.field1347);
            var11.field2371.method5217(Statics.field1641 + arg0);
            var11.field2371.method5227(Statics.field3282);
            var11.field2371.method5216(Statics.field1899);
            var11.field2371.method5207(class55.field421[82] ? 1 : 0);
            var11.field2371.method5215(Statics.field3232);
            var11.field2371.method5217(arg3);
            var11.field2371.method5215(Statics.field132 + arg1);
            field729.method2178(var11);
        }
        if (arg2 == 33) {
            class197 var12 = class197.method57(class193.field2251, field729.field1347);
            var12.field2371.method5216(arg0);
            var12.field2371.method5166(arg1);
            var12.field2371.method5217(arg3);
            field729.method2178(var12);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 37) {
            class197 var13 = class197.method57(class193.field2267, field729.field1347);
            var13.field2371.method5217(arg0);
            var13.field2371.method5225(arg1);
            var13.field2371.method5215(arg3);
            field729.method2178(var13);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 17) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var14 = class197.method57(class193.field2262, field729.field1347);
            var14.field2371.method5208(class55.field421[82] ? 1 : 0);
            var14.field2371.method5215(arg3);
            var14.field2371.method5216(Statics.field132 + arg1);
            var14.field2371.method5216(field838);
            var14.field2371.method5226(Statics.field3731);
            var14.field2371.method5215(Statics.field1641 + arg0);
            field729.method2178(var14);
        }
        if (arg2 == 16) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var15 = class197.method57(class193.field2300, field729.field1347);
            var15.field2371.method5215(arg3);
            var15.field2371.method5216(Statics.field3232);
            var15.field2371.method5166(Statics.field3282);
            var15.field2371.method5215(Statics.field132 + arg1);
            var15.field2371.method5217(Statics.field1899);
            var15.field2371.method5216(Statics.field1641 + arg0);
            var15.field2371.method5208(class55.field421[82] ? 1 : 0);
            field729.method2178(var15);
        }
        if (arg2 == 32) {
            class197 var16 = class197.method57(class193.field2237, field729.field1347);
            var16.field2371.method5227(Statics.field3731);
            var16.field2371.method5217(arg0);
            var16.field2371.method5226(arg1);
            var16.field2371.method5164(arg3);
            var16.field2371.method5217(field838);
            field729.method2178(var16);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 34) {
            class197 var17 = class197.method57(class193.field2290, field729.field1347);
            var17.field2371.method5164(arg3);
            var17.field2371.method5227(arg1);
            var17.field2371.method5215(arg0);
            field729.method2178(var17);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 7) {
            class89 var18 = field872[arg3];
            if (var18 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var19 = class197.method57(class193.field2333, field729.field1347);
                var19.field2371.method5166(Statics.field3282);
                var19.field2371.method5164(arg3);
                var19.field2371.method5215(Statics.field3232);
                var19.field2371.method5164(Statics.field1899);
                var19.field2371.method5208(class55.field421[82] ? 1 : 0);
                field729.method2178(var19);
            }
        }
        if (arg2 == 14) {
            class76 var20 = field798[arg3];
            if (var20 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var21 = class197.method57(class193.field2329, field729.field1347);
                var21.field2371.method5164(arg3);
                var21.field2371.method5208(class55.field421[82] ? 1 : 0);
                var21.field2371.method5217(Statics.field3232);
                var21.field2371.method5166(Statics.field3282);
                var21.field2371.method5217(Statics.field1899);
                field729.method2178(var21);
            }
        }
        if (arg2 == 36) {
            class197 var22 = class197.method57(class193.field2292, field729.field1347);
            var22.field2371.method5216(arg0);
            var22.field2371.method5216(arg3);
            var22.field2371.method5225(arg1);
            field729.method2178(var22);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 6) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var23 = class197.method57(class193.field2266, field729.field1347);
            var23.field2371.method5217(Statics.field132 + arg1);
            var23.field2371.method5203(class55.field421[82] ? 1 : 0);
            var23.field2371.method5217(arg3);
            var23.field2371.method5217(Statics.field1641 + arg0);
            field729.method2178(var23);
        }
        if (arg2 == 1005) {
            class227 var24 = class227.method3203(arg1);
            if (var24 == null || var24.field2719[arg0] < 100000) {
                class197 var25 = class197.method57(class193.field2318, field729.field1347);
                var25.field2371.method5215(arg3);
                field729.method2178(var25);
            } else {
                class101.method783(27, "", var24.field2719[arg0] + " x " + class266.method335(arg3).field3434);
            }
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 1003) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            class89 var26 = field872[arg3];
            if (var26 != null) {
                class268 var27 = var26.field1158;
                if (var27.field3488 != null) {
                    var27 = var27.method4492();
                }
                if (var27 != null) {
                    class197 var28 = class197.method57(class193.field2285, field729.field1347);
                    var28.field2371.method5215(var27.field3489);
                    field729.method2178(var28);
                }
            }
        }
        if (arg2 == 38) {
            method1108();
            class227 var29 = class227.method3203(arg1);
            field767 = 1;
            Statics.field3232 = arg0;
            Statics.field3282 = arg1;
            Statics.field1899 = arg3;
            method1219(var29);
            field836 = class91.method1479(16748608) + class266.method335(arg3).field3434 + class91.method1479(16777215);
            if (field836 == null) {
                field836 = class234.field2793;
            }
            return;
        }
        if (arg2 == 4) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var30 = class197.method57(class193.field2302, field729.field1347);
            var30.field2371.method5203(class55.field421[82] ? 1 : 0);
            var30.field2371.method5215(Statics.field1641 + arg0);
            var30.field2371.method5217(arg3);
            var30.field2371.method5164(Statics.field132 + arg1);
            field729.method2178(var30);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field419.method6096(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 5) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var31 = class197.method57(class193.field2307, field729.field1347);
            var31.field2371.method5217(Statics.field1641 + arg0);
            var31.field2371.method5206(class55.field421[82] ? 1 : 0);
            var31.field2371.method5164(Statics.field132 + arg1);
            var31.field2371.method5217(arg3);
            field729.method2178(var31);
        }
        if (arg2 == 40) {
            class197 var32 = class197.method57(class193.field2295, field729.field1347);
            var32.field2371.method5227(arg1);
            var32.field2371.method5216(arg0);
            var32.field2371.method5215(arg3);
            field729.method2178(var32);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 31) {
            class197 var33 = class197.method57(class193.field2233, field729.field1347);
            var33.field2371.method5215(Statics.field1899);
            var33.field2371.method5164(arg3);
            var33.field2371.method5217(Statics.field3232);
            var33.field2371.method5226(arg1);
            var33.field2371.method5166(Statics.field3282);
            var33.field2371.method5216(arg0);
            field729.method2178(var33);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 50) {
            class76 var34 = field798[arg3];
            if (var34 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var35 = class197.method57(class193.field2325, field729.field1347);
                var35.field2371.method5217(arg3);
                var35.field2371.method5206(class55.field421[82] ? 1 : 0);
                field729.method2178(var35);
            }
        }
        if (arg2 == 28) {
            class197 var36 = class197.method57(class193.field2287, field729.field1347);
            var36.field2371.method5166(arg1);
            field729.method2178(var36);
            class227 var37 = class227.method3203(arg1);
            if (var37.field2712 != null && var37.field2712[0][0] == 5) {
                int var38 = var37.field2712[0][1];
                class222.field2551[var38] = 1 - class222.field2551[var38];
                method218(var38);
            }
        }
        if (arg2 == 44) {
            class76 var39 = field798[arg3];
            if (var39 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var40 = class197.method57(class193.field2240, field729.field1347);
                var40.field2371.method5203(class55.field421[82] ? 1 : 0);
                var40.field2371.method5216(arg3);
                field729.method2178(var40);
            }
        }
        if (arg2 == 51) {
            class76 var41 = field798[arg3];
            if (var41 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var42 = class197.method57(class193.field2245, field729.field1347);
                var42.field2371.method5216(arg3);
                var42.field2371.method5206(class55.field421[82] ? 1 : 0);
                field729.method2178(var42);
            }
        }
        if (arg2 == 35) {
            class197 var43 = class197.method57(class193.field2264, field729.field1347);
            var43.field2371.method5166(arg1);
            var43.field2371.method5215(arg3);
            var43.field2371.method5216(arg0);
            field729.method2178(var43);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 48) {
            class76 var44 = field798[arg3];
            if (var44 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var45 = class197.method57(class193.field2309, field729.field1347);
                var45.field2371.method5206(class55.field421[82] ? 1 : 0);
                var45.field2371.method5215(arg3);
                field729.method2178(var45);
            }
        }
        if (arg2 == 41) {
            class197 var46 = class197.method57(class193.field2298, field729.field1347);
            var46.field2371.method5215(arg3);
            var46.field2371.method5215(arg0);
            var46.field2371.method5226(arg1);
            field729.method2178(var46);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 18) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var47 = class197.method57(class193.field2258, field729.field1347);
            var47.field2371.method5164(Statics.field132 + arg1);
            var47.field2371.method5164(Statics.field1641 + arg0);
            var47.field2371.method5216(arg3);
            var47.field2371.method5208(class55.field421[82] ? 1 : 0);
            field729.method2178(var47);
        }
        if (arg2 == 1001) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var48 = class197.method57(class193.field2260, field729.field1347);
            var48.field2371.method5207(class55.field421[82] ? 1 : 0);
            var48.field2371.method5217(arg3);
            var48.field2371.method5217(Statics.field132 + arg1);
            var48.field2371.method5215(Statics.field1641 + arg0);
            field729.method2178(var48);
        }
        if (arg2 == 24) {
            class227 var49 = class227.method3203(arg1);
            boolean var50 = true;
            if (var49.field2683 > 0) {
                var50 = method2109(var49);
            }
            if (var50) {
                class197 var51 = class197.method57(class193.field2287, field729.field1347);
                var51.field2371.method5166(arg1);
                field729.method2178(var51);
            }
        }
        if (arg2 == 10) {
            class89 var52 = field872[arg3];
            if (var52 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var53 = class197.method57(class193.field2326, field729.field1347);
                var53.field2371.method5215(arg3);
                var53.field2371.method5207(class55.field421[82] ? 1 : 0);
                field729.method2178(var53);
            }
        }
        if (arg2 == 43) {
            class197 var54 = class197.method57(class193.field2314, field729.field1347);
            var54.field2371.method5217(arg3);
            var54.field2371.method5166(arg1);
            var54.field2371.method5216(arg0);
            field729.method2178(var54);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 3) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var55 = class197.method57(class193.field2250, field729.field1347);
            var55.field2371.method5216(Statics.field1641 + arg0);
            var55.field2371.method5217(arg3);
            var55.field2371.method5164(Statics.field132 + arg1);
            var55.field2371.method5203(class55.field421[82] ? 1 : 0);
            field729.method2178(var55);
        }
        if (arg2 == 29) {
            class197 var56 = class197.method57(class193.field2287, field729.field1347);
            var56.field2371.method5166(arg1);
            field729.method2178(var56);
            class227 var57 = class227.method3203(arg1);
            if (var57.field2712 != null && var57.field2712[0][0] == 5) {
                int var58 = var57.field2712[0][1];
                if (class222.field2551[var58] != var57.field2698[0]) {
                    class222.field2551[var58] = var57.field2698[0];
                    method218(var58);
                }
            }
        }
        if (arg2 == 1002) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            class197 var59 = class197.method57(class193.field2234, field729.field1347);
            var59.field2371.method5164(arg3);
            field729.method2178(var59);
        }
        if (arg2 == 1004) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            class197 var60 = class197.method57(class193.field2318, field729.field1347);
            var60.field2371.method5215(arg3);
            field729.method2178(var60);
        }
        if (arg2 == 15) {
            class76 var61 = field798[arg3];
            if (var61 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var62 = class197.method57(class193.field2276, field729.field1347);
                var62.field2371.method5225(Statics.field3731);
                var62.field2371.method5164(field838);
                var62.field2371.method5215(arg3);
                var62.field2371.method5207(class55.field421[82] ? 1 : 0);
                field729.method2178(var62);
            }
        }
        if (arg2 == 22) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var63 = class197.method57(class193.field2247, field729.field1347);
            var63.field2371.method5216(Statics.field1641 + arg0);
            var63.field2371.method5207(class55.field421[82] ? 1 : 0);
            var63.field2371.method5216(arg3);
            var63.field2371.method5215(Statics.field132 + arg1);
            field729.method2178(var63);
        }
        if (arg2 == 20) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var64 = class197.method57(class193.field2306, field729.field1347);
            var64.field2371.method5216(arg3);
            var64.field2371.method5208(class55.field421[82] ? 1 : 0);
            var64.field2371.method5217(Statics.field1641 + arg0);
            var64.field2371.method5216(Statics.field132 + arg1);
            field729.method2178(var64);
        }
        if (arg2 == 9) {
            class89 var65 = field872[arg3];
            if (var65 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var66 = class197.method57(class193.field2265, field729.field1347);
                var66.field2371.method5203(class55.field421[82] ? 1 : 0);
                var66.field2371.method5217(arg3);
                field729.method2178(var66);
            }
        }
        if (arg2 == 45) {
            class76 var67 = field798[arg3];
            if (var67 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var68 = class197.method57(class193.field2255, field729.field1347);
                var68.field2371.method5207(class55.field421[82] ? 1 : 0);
                var68.field2371.method5217(arg3);
                field729.method2178(var68);
            }
        }
        if (arg2 == 26) {
            method3482();
        }
        if (arg2 == 42) {
            class197 var69 = class197.method57(class193.field2277, field729.field1347);
            var69.field2371.method5164(arg3);
            var69.field2371.method5217(arg0);
            var69.field2371.method5226(arg1);
            field729.method2178(var69);
            field829 = 0;
            Statics.field526 = class227.method3203(arg1);
            field789 = arg0;
        }
        if (arg2 == 21) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var70 = class197.method57(class193.field2289, field729.field1347);
            var70.field2371.method5215(arg3);
            var70.field2371.method5208(class55.field421[82] ? 1 : 0);
            var70.field2371.method5215(Statics.field1641 + arg0);
            var70.field2371.method5164(Statics.field132 + arg1);
            field729.method2178(var70);
        }
        if (arg2 == 49) {
            class76 var71 = field798[arg3];
            if (var71 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var72 = class197.method57(class193.field2324, field729.field1347);
                var72.field2371.method5164(arg3);
                var72.field2371.method5206(class55.field421[82] ? 1 : 0);
                field729.method2178(var72);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var73 = class227.method1104(arg1, arg0);
            if (var73 != null) {
                method2137(arg3, arg1, arg0, var73.field2720, arg5);
            }
        }
        if (arg2 == 23) {
            if (field818) {
                Statics.field2412.method2990();
            } else {
                Statics.field2412.method2989(Statics.field99, arg0, arg1, true);
            }
        }
        if (arg2 == 8) {
            class89 var74 = field872[arg3];
            if (var74 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var75 = class197.method57(class193.field2305, field729.field1347);
                var75.field2371.method5216(field838);
                var75.field2371.method5215(arg3);
                var75.field2371.method5208(class55.field421[82] ? 1 : 0);
                var75.field2371.method5227(Statics.field3731);
                field729.method2178(var75);
            }
        }
        if (arg2 == 19) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var76 = class197.method57(class193.field2259, field729.field1347);
            var76.field2371.method5217(Statics.field1641 + arg0);
            var76.field2371.method5217(arg3);
            var76.field2371.method5206(class55.field421[82] ? 1 : 0);
            var76.field2371.method5217(Statics.field132 + arg1);
            field729.method2178(var76);
        }
        if (arg2 == 11) {
            class89 var77 = field872[arg3];
            if (var77 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var78 = class197.method57(class193.field2291, field729.field1347);
                var78.field2371.method5164(arg3);
                var78.field2371.method5203(class55.field421[82] ? 1 : 0);
                field729.method2178(var78);
            }
        }
        if (arg2 == 46) {
            class76 var79 = field798[arg3];
            if (var79 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var80 = class197.method57(class193.field2281, field729.field1347);
                var80.field2371.method5207(class55.field421[82] ? 1 : 0);
                var80.field2371.method5216(arg3);
                field729.method2178(var80);
            }
        }
        if (arg2 == 30 && field848 == null) {
            method3272(arg1, arg0);
            field848 = class227.method1104(arg1, arg0);
            method1219(field848);
        }
        if (arg2 == 12) {
            class89 var81 = field872[arg3];
            if (var81 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var82 = class197.method57(class193.field2312, field729.field1347);
                var82.field2371.method5215(arg3);
                var82.field2371.method5208(class55.field421[82] ? 1 : 0);
                field729.method2178(var82);
            }
        }
        if (arg2 == 47) {
            class76 var83 = field798[arg3];
            if (var83 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var84 = class197.method57(class193.field2282, field729.field1347);
                var84.field2371.method5164(arg3);
                var84.field2371.method5203(class55.field421[82] ? 1 : 0);
                field729.method2178(var84);
            }
        }
        if (arg2 == 13) {
            class89 var85 = field872[arg3];
            if (var85 != null) {
                field783 = arg6;
                field784 = arg7;
                field786 = 2;
                field785 = 0;
                field912 = arg0;
                field877 = arg1;
                class197 var86 = class197.method57(class193.field2236, field729.field1347);
                var86.field2371.method5216(arg3);
                var86.field2371.method5207(class55.field421[82] ? 1 : 0);
                field729.method2178(var86);
            }
        }
        if (arg2 == 2) {
            field783 = arg6;
            field784 = arg7;
            field786 = 2;
            field785 = 0;
            field912 = arg0;
            field877 = arg1;
            class197 var87 = class197.method57(class193.field2283, field729.field1347);
            var87.field2371.method5164(Statics.field132 + arg1);
            var87.field2371.method5226(Statics.field3731);
            var87.field2371.method5217(field838);
            var87.field2371.method5203(class55.field421[82] ? 1 : 0);
            var87.field2371.method5164(Statics.field1641 + arg0);
            var87.field2371.method5217(arg3);
            field729.method2178(var87);
        }
        if (arg2 != 25) {
            if (field767 != 0) {
                field767 = 0;
                method1219(class227.method3203(Statics.field3282));
            }
            if (field856) {
                method1108();
            }
            if (Statics.field526 != null && field829 == 0) {
                method1219(Statics.field526);
            }
            return;
        }
        class227 var88 = class227.method1104(arg1, arg0);
        if (var88 == null) {
            return;
        }
        method1108();
        method48(arg1, arg0, class228.method3316(method222(var88)), var88.field2720);
        field767 = 0;
        field840 = method1664(var88);
        if (field840 == null) {
            field840 = class234.field2793;
        }
        if (var88.field2696) {
            field841 = var88.field2673 + class91.method1479(16777215);
        } else {
            field841 = class91.method1479(65280) + var88.field2716 + class91.method1479(16777215);
        }
    }

    @ObfuscatedName("ko.hc(ILjava/lang/String;B)V")
    public static void method5007(int arg0, String arg1) {
        int var2 = class99.field1286;
        int[] var3 = class99.field1287;
        boolean var4 = false;
        class294 var5 = new class294(arg1, Statics.field1990);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field798[var3[var6]];
            if (var7 != null && Statics.field3130 != var7 && var7.field660 != null && var7.field660.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method57(class193.field2240, field729.field1347);
                    var8.field2371.method5203(0);
                    var8.field2371.method5216(var3[var6]);
                    field729.method2178(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method57(class193.field2282, field729.field1347);
                    var9.field2371.method5164(var3[var6]);
                    var9.field2371.method5203(0);
                    field729.method2178(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method57(class193.field2324, field729.field1347);
                    var10.field2371.method5164(var3[var6]);
                    var10.field2371.method5206(0);
                    field729.method2178(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method57(class193.field2325, field729.field1347);
                    var11.field2371.method5217(var3[var6]);
                    var11.field2371.method5206(0);
                    field729.method2178(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class101.method783(4, "", class234.field2886 + arg1);
        }
    }

    @ObfuscatedName("m.ha(IIIII)V")
    public static void method48(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method1104(arg0, arg1);
        if (var4 != null && var4.field2691 != null) {
            class72 var5 = new class72();
            var5.field611 = var4;
            var5.field607 = var4.field2691;
            class86.method3119(var5);
        }
        field839 = arg3;
        field856 = true;
        Statics.field3731 = arg0;
        field838 = arg1;
        Statics.field1356 = arg2;
        method1219(var4);
    }

    @ObfuscatedName("br.hf(I)V")
    public static void method1108() {
        if (!field856) {
            return;
        }
        class227 var0 = class227.method1104(Statics.field3731, field838);
        if (var0 != null && var0.field2692 != null) {
            class72 var1 = new class72();
            var1.field611 = var0;
            var1.field607 = var0.field2692;
            class86.method3119(var1);
        }
        field856 = false;
        method1219(var0);
    }

    @ObfuscatedName("fe.hd(III)V")
    public static void method3272(int arg0, int arg1) {
        class197 var2 = class197.method57(class193.field2254, field729.field1347);
        var2.field2371.method5217(arg1);
        var2.field2371.method5227(arg0);
        field729.method2178(var2);
    }

    @ObfuscatedName("ch.hg(IIIILjava/lang/String;I)V")
    public static void method2137(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method1104(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2700 != null) {
            class72 var6 = new class72();
            var6.field611 = var5;
            var6.field603 = arg0;
            var6.field610 = arg4;
            var6.field607 = var5.field2700;
            class86.method3119(var6);
        }
        boolean var7 = true;
        if (var5.field2683 > 0) {
            var7 = method2109(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method222(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class197 var11 = class197.method57(class193.field2299, field729.field1347);
            var11.field2371.method5166(arg1);
            var11.field2371.method5164(arg2);
            var11.field2371.method5164(arg3);
            field729.method2178(var11);
        }
        if (arg0 == 2) {
            class197 var12 = class197.method57(class193.field2275, field729.field1347);
            var12.field2371.method5166(arg1);
            var12.field2371.method5164(arg2);
            var12.field2371.method5164(arg3);
            field729.method2178(var12);
        }
        if (arg0 == 3) {
            class197 var13 = class197.method57(class193.field2278, field729.field1347);
            var13.field2371.method5166(arg1);
            var13.field2371.method5164(arg2);
            var13.field2371.method5164(arg3);
            field729.method2178(var13);
        }
        if (arg0 == 4) {
            class197 var14 = class197.method57(class193.field2301, field729.field1347);
            var14.field2371.method5166(arg1);
            var14.field2371.method5164(arg2);
            var14.field2371.method5164(arg3);
            field729.method2178(var14);
        }
        if (arg0 == 5) {
            class197 var15 = class197.method57(class193.field2252, field729.field1347);
            var15.field2371.method5166(arg1);
            var15.field2371.method5164(arg2);
            var15.field2371.method5164(arg3);
            field729.method2178(var15);
        }
        if (arg0 == 6) {
            class197 var16 = class197.method57(class193.field2253, field729.field1347);
            var16.field2371.method5166(arg1);
            var16.field2371.method5164(arg2);
            var16.field2371.method5164(arg3);
            field729.method2178(var16);
        }
        if (arg0 == 7) {
            class197 var17 = class197.method57(class193.field2243, field729.field1347);
            var17.field2371.method5166(arg1);
            var17.field2371.method5164(arg2);
            var17.field2371.method5164(arg3);
            field729.method2178(var17);
        }
        if (arg0 == 8) {
            class197 var18 = class197.method57(class193.field2286, field729.field1347);
            var18.field2371.method5166(arg1);
            var18.field2371.method5164(arg2);
            var18.field2371.method5164(arg3);
            field729.method2178(var18);
        }
        if (arg0 == 9) {
            class197 var19 = class197.method57(class193.field2249, field729.field1347);
            var19.field2371.method5166(arg1);
            var19.field2371.method5164(arg2);
            var19.field2371.method5164(arg3);
            field729.method2178(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var20 = class197.method57(class193.field2257, field729.field1347);
        var20.field2371.method5166(arg1);
        var20.field2371.method5164(arg2);
        var20.field2371.method5164(arg3);
        field729.method2178(var20);
    }

    @ObfuscatedName("ec.he(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3117(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method773(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("bp.is(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method773(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field818 || field819 >= 500) {
            return;
        }
        field824[field819] = arg0;
        field825[field819] = arg1;
        field822[field819] = arg2;
        field823[field819] = arg3;
        field820[field819] = arg4;
        field821[field819] = arg5;
        field826[field819] = arg6;
        field819++;
    }

    @ObfuscatedName("fn.ic(B)I")
    public static final int method3327() {
        return field819 - 1;
    }

    @ObfuscatedName("ck.ip(IB)Z")
    public static boolean method2155(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bp.im(IIIII)V")
    public static final void method771(int arg0, int arg1, int arg2, int arg3) {
        if (field767 == 0 && !field856) {
            method3117(class234.field2944, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class138.field1774;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class138.method1069(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class76 var14 = field798[field809];
                    method3251(var14, field809, var11, var12);
                }
                return;
            }
            long var15 = class138.field1775[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class138.method1069(class138.field1775[var8]);
                    int var20 = var19;
                    long var21 = class138.field1775[var8];
                    int var23 = (int) (var21 >>> 7 & 0x7FL);
                    int var25 = var23;
                    int var26 = class138.method762(class138.field1775[var8]);
                    int var28 = class138.method4299(var8);
                    if (var26 == 2 && Statics.field2412.method2982(Statics.field99, var19, var23, var15) >= 0) {
                        class265 var29 = class265.method1122(var28);
                        if (var29.field3414 != null) {
                            var29 = var29.method4361();
                        }
                        if (var29 == null) {
                            break label277;
                        }
                        if (field767 == 1) {
                            method3117(class234.field2816, field836 + " " + class91.field1182 + " " + class91.method1479(65535) + var29.field3384, 1, var28, var19, var23);
                        } else if (!field856) {
                            String[] var30 = var29.field3395;
                            if (var30 != null) {
                                for (int var31 = 4; var31 >= 0; var31--) {
                                    if (var30[var31] != null) {
                                        short var32 = 0;
                                        if (var31 == 0) {
                                            var32 = 3;
                                        }
                                        if (var31 == 1) {
                                            var32 = 4;
                                        }
                                        if (var31 == 2) {
                                            var32 = 5;
                                        }
                                        if (var31 == 3) {
                                            var32 = 6;
                                        }
                                        if (var31 == 4) {
                                            var32 = 1001;
                                        }
                                        method3117(var30[var31], class91.method1479(65535) + var29.field3384, var32, var28, var20, var25);
                                    }
                                }
                            }
                            method3117(class234.field2940, class91.method1479(65535) + var29.field3384, 1002, var29.field3411, var20, var25);
                        } else if ((Statics.field1356 & 0x4) == 4) {
                            method3117(field840, field841 + " " + class91.field1182 + " " + class91.method1479(65535) + var29.field3384, 2, var28, var19, var23);
                        }
                    }
                    if (var26 == 1) {
                        class89 var33 = field872[var28];
                        if (var33 == null) {
                            break label277;
                        }
                        if (var33.field1158.field3485 == 1 && (var33.field1000 & 0x7F) == 64 && (var33.field976 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < field725; var34++) {
                                class89 var35 = field872[field801[var34]];
                                if (var35 != null && var33 != var35 && var35.field1158.field3485 == 1 && var33.field1000 == var35.field1000 && var33.field976 == var35.field976) {
                                    method240(var35.field1158, field801[var34], var20, var25);
                                }
                            }
                            int var36 = class99.field1286;
                            int[] var37 = class99.field1287;
                            for (int var38 = 0; var38 < var36; var38++) {
                                class76 var39 = field798[var37[var38]];
                                if (var39 != null && var33.field1000 == var39.field1000 && var33.field976 == var39.field976) {
                                    method3251(var39, var37[var38], var20, var25);
                                }
                            }
                        }
                        method240(var33.field1158, var28, var20, var25);
                    }
                    if (var26 == 0) {
                        class76 var40 = field798[var28];
                        if (var40 == null) {
                            break label277;
                        }
                        if ((var40.field1000 & 0x7F) == 64 && (var40.field976 & 0x7F) == 64) {
                            for (int var41 = 0; var41 < field725; var41++) {
                                class89 var42 = field872[field801[var41]];
                                if (var42 != null && var42.field1158.field3485 == 1 && var40.field1000 == var42.field1000 && var40.field976 == var42.field976) {
                                    method240(var42.field1158, field801[var41], var20, var25);
                                }
                            }
                            int var43 = class99.field1286;
                            int[] var44 = class99.field1287;
                            for (int var45 = 0; var45 < var43; var45++) {
                                class76 var46 = field798[var44[var45]];
                                if (var46 != null && var40 != var46 && var40.field1000 == var46.field1000 && var40.field976 == var46.field976) {
                                    method3251(var46, var44[var45], var20, var25);
                                }
                            }
                        }
                        if (field809 == var28) {
                            var4 = var15;
                        } else {
                            method3251(var40, var28, var20, var25);
                        }
                    }
                    if (var26 == 3) {
                        class273 var47 = field914[Statics.field99][var20][var25];
                        if (var47 != null) {
                            for (class97 var48 = (class97) var47.method4653(); var48 != null; var48 = (class97) var47.method4641()) {
                                class266 var49 = class266.method335(var48.field1270);
                                if (field767 == 1) {
                                    method3117(class234.field2816, field836 + " " + class91.field1182 + " " + class91.method1479(16748608) + var49.field3434, 16, var48.field1270, var20, var25);
                                } else if (!field856) {
                                    String[] var50 = var49.field3448;
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        if (var50 != null && var50[var51] != null) {
                                            byte var52 = 0;
                                            if (var51 == 0) {
                                                var52 = 18;
                                            }
                                            if (var51 == 1) {
                                                var52 = 19;
                                            }
                                            if (var51 == 2) {
                                                var52 = 20;
                                            }
                                            if (var51 == 3) {
                                                var52 = 21;
                                            }
                                            if (var51 == 4) {
                                                var52 = 22;
                                            }
                                            method3117(var50[var51], class91.method1479(16748608) + var49.field3434, var52, var48.field1270, var20, var25);
                                        } else if (var51 == 2) {
                                            method3117(class234.field2938, class91.method1479(16748608) + var49.field3434, 20, var48.field1270, var20, var25);
                                        }
                                    }
                                    method3117(class234.field2940, class91.method1479(16748608) + var49.field3434, 1004, var48.field1270, var20, var25);
                                } else if ((Statics.field1356 & 0x1) == 1) {
                                    method3117(field840, field841 + " " + class91.field1182 + " " + class91.method1479(16748608) + var49.field3434, 17, var48.field1270, var20, var25);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("i.ih(Ljn;IIII)V")
    public static final void method240(class268 arg0, int arg1, int arg2, int arg3) {
        if (field819 >= 400) {
            return;
        }
        if (arg0.field3488 != null) {
            arg0 = arg0.method4492();
        }
        if (arg0 == null || !arg0.field3515 || arg0.field3521 && field852 != arg1) {
            return;
        }
        String var4 = arg0.field3490;
        if (arg0.field3507 != 0) {
            int var6 = arg0.field3507;
            int var7 = Statics.field3130.field650;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class91.method1479(16711680);
            } else if (var8 < -6) {
                var9 = class91.method1479(16723968);
            } else if (var8 < -3) {
                var9 = class91.method1479(16740352);
            } else if (var8 < 0) {
                var9 = class91.method1479(16756736);
            } else if (var8 > 9) {
                var9 = class91.method1479(65280);
            } else if (var8 > 6) {
                var9 = class91.method1479(4259584);
            } else if (var8 > 3) {
                var9 = class91.method1479(8453888);
            } else if (var8 > 0) {
                var9 = class91.method1479(12648192);
            } else {
                var9 = class91.method1479(16776960);
            }
            var4 = var4 + var9 + " " + class91.field1180 + class234.field2945 + arg0.field3507 + class91.field1181;
        }
        if (arg0.field3521 && field827) {
            method3117(class234.field2940, class91.method1479(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field767 == 1) {
            method3117(class234.field2816, field836 + " " + class91.field1182 + " " + class91.method1479(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field856) {
            int var10 = arg0.field3521 && field827 ? 2000 : 0;
            String[] var11 = arg0.field3500;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class234.field2786)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method3117(var11[var12], class91.method1479(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class234.field2786)) {
                        short var15 = 0;
                        if (field681 != class94.field1204) {
                            if (field681 == class94.field1202 || field681 == class94.field1206 && arg0.field3507 > Statics.field3130.field650) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method3117(var11[var14], class91.method1479(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3521 || !field827) {
                method3117(class234.field2940, class91.method1479(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1356 & 0x2) == 2) {
            method3117(field840, field841 + " " + class91.field1182 + " " + class91.method1479(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fk.in(Lbi;IIII)V")
    public static final void method3251(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3130 == arg0 || field819 >= 400) {
            return;
        }
        String var9;
        if (arg0.field651 == 0) {
            String var4 = arg0.field673[0] + arg0.field660 + arg0.field673[1];
            int var5 = arg0.field650;
            int var6 = Statics.field3130.field650;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class91.method1479(16711680);
            } else if (var7 < -6) {
                var8 = class91.method1479(16723968);
            } else if (var7 < -3) {
                var8 = class91.method1479(16740352);
            } else if (var7 < 0) {
                var8 = class91.method1479(16756736);
            } else if (var7 > 9) {
                var8 = class91.method1479(65280);
            } else if (var7 > 6) {
                var8 = class91.method1479(4259584);
            } else if (var7 > 3) {
                var8 = class91.method1479(8453888);
            } else if (var7 > 0) {
                var8 = class91.method1479(12648192);
            } else {
                var8 = class91.method1479(16776960);
            }
            var9 = var4 + var8 + " " + class91.field1180 + class234.field2945 + arg0.field650 + class91.field1181 + arg0.field673[2];
        } else {
            var9 = arg0.field673[0] + arg0.field660 + arg0.field673[1] + " " + class91.field1180 + class234.field2946 + arg0.field651 + class91.field1181 + arg0.field673[2];
        }
        if (field767 == 1) {
            method3117(class234.field2816, field836 + " " + class91.field1182 + " " + class91.method1479(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field856) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field806[var10] != null) {
                    short var11 = 0;
                    if (field806[var10].equalsIgnoreCase(class234.field2786)) {
                        if (field945 == class94.field1204) {
                            continue;
                        }
                        if (field945 == class94.field1202 || field945 == class94.field1206 && arg0.field650 > Statics.field3130.field650) {
                            var11 = 2000;
                        }
                        if (Statics.field3130.field653 != 0 && arg0.field653 != 0) {
                            if (Statics.field3130.field653 == arg0.field653) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field815[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field842[var10] + var11;
                    method3117(field806[var10], class91.method1479(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1356 & 0x8) == 8) {
            method3117(field840, field841 + " " + class91.field1182 + " " + class91.method1479(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field819; var14++) {
            if (field822[var14] == 23) {
                field825[var14] = class91.method1479(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("kv.io(IIIIIIIII)V")
    public static final void method4937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method1068(arg0)) {
            Statics.field573 = null;
            method490(Statics.field2584[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field573 != null) {
                method490(Statics.field573, -1412584499, arg1, arg2, arg3, arg4, Statics.field257, Statics.field88, arg7);
                Statics.field573 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field835[var8] = true;
            }
        } else {
            field835[arg7] = true;
        }
    }

    @ObfuscatedName("ax.ik([Lht;IIIIIIIII)V")
    public static final void method490(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class332.method5644(arg2, arg3, arg4, arg5);
        class140.method2873();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2613 == arg1 || arg1 == -1412584499 && field855 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field890[field885] = var10.field2607 + arg6;
                    field891[field885] = var10.field2608 + arg7;
                    field892[field885] = var10.field2609;
                    field893[field885] = var10.field2610;
                    var11 = ++field885 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2714 = var11;
                var10.field2624 = field863;
                if (!var10.field2696 || !method2867(var10)) {
                    if (var10.field2683 > 0) {
                        method588(var10);
                    }
                    int var12 = var10.field2607 + arg6;
                    int var13 = var10.field2608 + arg7;
                    int var14 = var10.field2666;
                    if (field855 == var10) {
                        if (arg1 != -1412584499 && !var10.field2713) {
                            Statics.field573 = arg0;
                            Statics.field257 = arg6;
                            Statics.field88 = arg7;
                            continue;
                        }
                        if (field931 && field860) {
                            int var15 = class64.field510;
                            int var16 = class64.field514;
                            int var17 = var15 - field857;
                            int var18 = var16 - field858;
                            if (var17 < field861) {
                                var17 = field861;
                            }
                            if (var10.field2609 + var17 > field861 + field765.field2609) {
                                var17 = field861 + field765.field2609 - var10.field2609;
                            }
                            if (var18 < field862) {
                                var18 = field862;
                            }
                            if (var10.field2610 + var18 > field862 + field765.field2610) {
                                var18 = field862 + field765.field2610 - var10.field2610;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2713) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2596 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2596 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2609 + var12;
                        int var26 = var10.field2610 + var13;
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
                        int var29 = var10.field2609 + var12;
                        int var30 = var10.field2610 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2696 || var19 < var21 && var20 < var22) {
                        if (var10.field2683 != 0) {
                            if (var10.field2683 == 1336) {
                                if (field705) {
                                    var13 += 15;
                                    Statics.field328.method5056("Fps:" + field476, var10.field2609 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field685) {
                                        var33 = 16711680;
                                    }
                                    Statics.field328.method5056("Mem:" + var32 + "k", var10.field2609 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2683 == 1337) {
                                field828 = var12;
                                field832 = var13;
                                method1094(var12, var13, var10.field2609, var10.field2610);
                                field835[var10.field2714] = true;
                                class332.method5644(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2683 == 1338) {
                                method3231(var10, var12, var13, var11);
                                class332.method5644(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2683 == 1339) {
                                method297(var10, var12, var13, var11);
                                class332.method5644(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2683 == 1400) {
                                Statics.field419.method6112(var12, var13, var10.field2609, var10.field2610, field863);
                            }
                            if (var10.field2683 == 1401) {
                                Statics.field419.method5949(var12, var13, var10.field2609, var10.field2610);
                            }
                            if (var10.field2683 == 1402) {
                                Statics.field1215.method1735(var12, field863);
                            }
                        }
                        if (var10.field2596 == 0) {
                            if (!var10.field2696 && method2867(var10) && Statics.field75 != var10) {
                                continue;
                            }
                            if (!var10.field2696) {
                                if (var10.field2616 > var10.field2733 - var10.field2610) {
                                    var10.field2616 = var10.field2733 - var10.field2610;
                                }
                                if (var10.field2616 < 0) {
                                    var10.field2616 = 0;
                                }
                            }
                            method490(arg0, var10.field2594, var19, var20, var21, var22, var12 - var10.field2622, var13 - var10.field2616, var11);
                            if (var10.field2724 != null) {
                                method490(var10.field2724, var10.field2594, var19, var20, var21, var22, var12 - var10.field2622, var13 - var10.field2616, var11);
                            }
                            class71 var34 = (class71) field843.method5597((long) var10.field2594);
                            if (var34 != null) {
                                method4937(var34.field596, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class332.method5644(arg2, arg3, arg4, arg5);
                            class140.method2873();
                        }
                        if (field745 || field746[var11] || field792 > 1) {
                            if (var10.field2596 == 0 && !var10.field2696 && var10.field2733 > var10.field2610) {
                                method235(var10.field2609 + var12, var13, var10.field2616, var10.field2610, var10.field2733);
                            }
                            if (var10.field2596 != 1) {
                                if (var10.field2596 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2702; var36++) {
                                        for (int var37 = 0; var37 < var10.field2605; var37++) {
                                            int var38 = (var10.field2656 + 32) * var37 + var12;
                                            int var39 = (var10.field2662 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2663[var35];
                                                var39 += var10.field2664[var35];
                                            }
                                            if (var10.field2718[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2718[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field3139 == var10 && field790 == var35) {
                                                    class336 var43;
                                                    if (field767 == 1 && Statics.field3232 == var35 && Statics.field3282 == var10.field2594) {
                                                        var43 = class266.method2946(var42, var10.field2719[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class266.method2946(var42, var10.field2719[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1219(var10);
                                                    } else if (Statics.field3139 == var10 && field790 == var35) {
                                                        int var44 = class64.field510 - field791;
                                                        int var45 = class64.field514 - field830;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field739 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5764(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class332.field3887 && var46.field2616 > 0) {
                                                                int var47 = field744 * (class332.field3887 - var39 - var45) / 3;
                                                                if (var47 > field744 * 10) {
                                                                    var47 = field744 * 10;
                                                                }
                                                                if (var47 > var46.field2616) {
                                                                    var47 = var46.field2616;
                                                                }
                                                                var46.field2616 -= var47;
                                                                field830 += var47;
                                                                method1219(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class332.field3888 && var46.field2616 < var46.field2733 - var46.field2610) {
                                                                int var48 = field744 * (var39 + var45 + 32 - class332.field3888) / 3;
                                                                if (var48 > field744 * 10) {
                                                                    var48 = field744 * 10;
                                                                }
                                                                if (var48 > var46.field2733 - var46.field2610 - var46.field2616) {
                                                                    var48 = var46.field2733 - var46.field2610 - var46.field2616;
                                                                }
                                                                var46.field2616 += var48;
                                                                field830 -= var48;
                                                                method1219(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field526 == var10 && field789 == var35) {
                                                        var43.method5764(var38, var39, 128);
                                                    } else {
                                                        var43.method5773(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2665 != null && var35 < 20) {
                                                class336 var49 = var10.method3844(var35);
                                                if (var49 != null) {
                                                    var49.method5773(var38, var39);
                                                } else if (class227.field2678) {
                                                    method1219(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2596 == 3) {
                                    int var50;
                                    if (method5487(var10)) {
                                        var50 = var10.field2620;
                                        if (Statics.field75 == var10 && var10.field2654 != 0) {
                                            var50 = var10.field2654;
                                        }
                                    } else {
                                        var50 = var10.field2580;
                                        if (Statics.field75 == var10 && var10.field2621 != 0) {
                                            var50 = var10.field2621;
                                        }
                                    }
                                    if (var10.field2709) {
                                        switch(var10.field2619.field3898) {
                                            case 1:
                                                class332.method5653(var12, var13, var10.field2609, var10.field2610, var10.field2580, var10.field2620);
                                                break;
                                            case 2:
                                                class332.method5654(var12, var13, var10.field2609, var10.field2610, var10.field2580, var10.field2620, 255 - (var10.field2666 & 0xFF), 255 - (var10.field2626 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class332.method5652(var12, var13, var10.field2609, var10.field2610, var50);
                                                } else {
                                                    class332.method5691(var12, var13, var10.field2609, var10.field2610, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class332.method5656(var12, var13, var10.field2609, var10.field2610, var50);
                                    } else {
                                        class332.method5657(var12, var13, var10.field2609, var10.field2610, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2596 == 4) {
                                    class306 var51 = var10.method3818();
                                    if (var51 != null) {
                                        String var52 = var10.field2655;
                                        int var53;
                                        if (method5487(var10)) {
                                            var53 = var10.field2620;
                                            if (Statics.field75 == var10 && var10.field2654 != 0) {
                                                var53 = var10.field2654;
                                            }
                                            if (var10.field2592.length() > 0) {
                                                var52 = var10.field2592;
                                            }
                                        } else {
                                            var53 = var10.field2580;
                                            if (Statics.field75 == var10 && var10.field2621 != 0) {
                                                var53 = var10.field2621;
                                            }
                                        }
                                        if (var10.field2696 && var10.field2720 != -1) {
                                            class266 var54 = class266.method335(var10.field2720);
                                            var52 = var54.field3434;
                                            if (var52 == null) {
                                                var52 = class234.field2793;
                                            }
                                            if ((var54.field3458 == 1 || var10.field2623 != 1) && var10.field2623 != -1) {
                                                var52 = class91.method1479(16748608) + var52 + class91.field1177 + " " + 'x' + method1109(var10.field2623);
                                            }
                                        }
                                        if (field848 == var10) {
                                            var52 = class234.field2841;
                                            var53 = var10.field2580;
                                        }
                                        if (!var10.field2696) {
                                            var52 = method24(var52, var10);
                                        }
                                        var51.method5037(var52, var12, var13, var10.field2609, var10.field2610, var53, var10.field2660 ? 0 : -1, var10.field2658, var10.field2659, var10.field2615);
                                    } else if (class227.field2678) {
                                        method1219(var10);
                                    }
                                } else if (var10.field2596 == 5) {
                                    if (var10.field2696) {
                                        class336 var56;
                                        if (var10.field2720 == -1) {
                                            var56 = var10.method3834(false);
                                        } else {
                                            var56 = class266.method2946(var10.field2720, var10.field2623, var10.field2633, var10.field2634, var10.field2684, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3908;
                                            int var58 = var56.field3918;
                                            if (var10.field2632) {
                                                class332.method5651(var12, var13, var10.field2609 + var12, var10.field2610 + var13);
                                                int var59 = (var10.field2609 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2610 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2631 != 0) {
                                                            var56.method5777(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2631, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5773(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5764(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class332.method5644(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2609 * 4096 / var57;
                                                if (var10.field2631 != 0) {
                                                    var56.method5777(var10.field2609 / 2 + var12, var10.field2610 / 2 + var13, var10.field2631, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5766(var12, var13, var10.field2609, var10.field2610, 256 - (var14 & 0xFF));
                                                } else if (var10.field2609 == var57 && var10.field2610 == var58) {
                                                    var56.method5773(var12, var13);
                                                } else {
                                                    var56.method5760(var12, var13, var10.field2609, var10.field2610);
                                                }
                                            }
                                        } else if (class227.field2678) {
                                            method1219(var10);
                                        }
                                    } else {
                                        class336 var55 = var10.method3834(method5487(var10));
                                        if (var55 != null) {
                                            var55.method5773(var12, var13);
                                        } else if (class227.field2678) {
                                            method1219(var10);
                                        }
                                    }
                                } else if (var10.field2596 == 6) {
                                    boolean var64 = method5487(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2588;
                                    } else {
                                        var65 = var10.field2641;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2720 != -1) {
                                        class266 var68 = class266.method335(var10.field2720);
                                        if (var68 != null) {
                                            class266 var69 = var68.method4409(var10.field2623);
                                            var66 = var69.method4408(1);
                                            if (var66 == null) {
                                                method1219(var10);
                                            } else {
                                                var66.method2746();
                                                var67 = var66.field1900 / 2;
                                            }
                                        }
                                    } else if (var10.field2597 == 5) {
                                        if (var10.field2606 == 0) {
                                            var66 = field797.method3781((class270) null, -1, (class270) null, -1);
                                        } else {
                                            var66 = Statics.field3130.method1175();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3840((class270) null, -1, var64, Statics.field3130.field646);
                                        if (var66 == null && class227.field2678) {
                                            method1219(var10);
                                        }
                                    } else {
                                        class270 var70 = class270.method2219(var65);
                                        var66 = var10.method3840(var70, var10.field2722, var64, Statics.field3130.field646);
                                        if (var66 == null && class227.field2678) {
                                            method1219(var10);
                                        }
                                    }
                                    class140.method2909(var10.field2609 / 2 + var12, var10.field2610 / 2 + var13);
                                    int var71 = var10.field2648 * class140.field1815[var10.field2645] >> 16;
                                    int var72 = var10.field2648 * class140.field1800[var10.field2645] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2696) {
                                            var66.method2746();
                                            if (var10.field2674) {
                                                var66.method2760(0, var10.field2686, var10.field2711, var10.field2645, var10.field2643, var10.field2644 + var67 + var71, var10.field2644 + var72, var10.field2648);
                                            } else {
                                                var66.method2799(0, var10.field2686, var10.field2711, var10.field2645, var10.field2643, var10.field2644 + var67 + var71, var10.field2644 + var72);
                                            }
                                        } else {
                                            var66.method2799(0, var10.field2686, 0, var10.field2645, 0, var71, var72);
                                        }
                                    }
                                    class140.method2913();
                                } else {
                                    if (var10.field2596 == 7) {
                                        class306 var73 = var10.method3818();
                                        if (var73 == null) {
                                            if (class227.field2678) {
                                                method1219(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2702; var75++) {
                                            for (int var76 = 0; var76 < var10.field2605; var76++) {
                                                if (var10.field2718[var74] > 0) {
                                                    class266 var77 = class266.method335(var10.field2718[var74] - 1);
                                                    String var78;
                                                    if (var77.field3458 != 1 && var10.field2719[var74] == 1) {
                                                        var78 = class91.method1479(16748608) + var77.field3434 + class91.field1177;
                                                    } else {
                                                        var78 = class91.method1479(16748608) + var77.field3434 + class91.field1177 + " " + 'x' + method1109(var10.field2719[var74]);
                                                    }
                                                    int var79 = (var10.field2656 + 115) * var76 + var12;
                                                    int var80 = (var10.field2662 + 12) * var75 + var13;
                                                    if (var10.field2658 == 0) {
                                                        var73.method5060(var78, var79, var80, var10.field2580, var10.field2660 ? 0 : -1);
                                                    } else if (var10.field2658 == 1) {
                                                        var73.method5036(var78, var10.field2609 / 2 + var79, var80, var10.field2580, var10.field2660 ? 0 : -1);
                                                    } else {
                                                        var73.method5056(var78, var10.field2609 + var79 - 1, var80, var10.field2580, var10.field2660 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2596 == 8 && Statics.field678 == var10 && field834 == field833) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class306 var83 = Statics.field328;
                                        String var84 = var10.field2655;
                                        String var85 = method24(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class91.field1183);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5028(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3714 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2609 + var12 - 5 - var81;
                                        int var90 = var10.field2610 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class332.method5652(var89, var90, var81, var82, 16777120);
                                        class332.method5656(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2655;
                                        int var92 = var83.field3714 + var90 + 2;
                                        String var93 = method24(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class91.field1183);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5060(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3714 + 1;
                                        }
                                    }
                                    if (var10.field2596 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2628) {
                                            var96 = var12;
                                            var97 = var10.field2610 + var13;
                                            var98 = var10.field2609 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2609 + var12;
                                            var99 = var10.field2610 + var13;
                                        }
                                        if (var10.field2627 == 1) {
                                            class332.method5661(var96, var97, var98, var99, var10.field2580);
                                        } else {
                                            method4968(var96, var97, var98, var99, var10.field2580, var10.field2627);
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

    @ObfuscatedName("kw.iv(IIIIIII)V")
    public static final void method4968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class332.field3885;
        int var18 = arg1 - class332.field3887;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2872(var19, var20, var21);
        class140.method2884(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2872(var19, var21, var22);
        class140.method2884(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("l.iz(Ljava/lang/String;Lht;I)Ljava/lang/String;")
    public static String method24(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method4467(method587(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bs.iw(II)Ljava/lang/String;")
    public static final String method1109(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1178 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method1479(65408) + var1.substring(0, var1.length() - 8) + class234.field2950 + " " + class91.field1180 + var1 + class91.field1181 + class91.field1177;
        } else if (var1.length() > 6) {
            return " " + class91.method1479(16777215) + var1.substring(0, var1.length() - 4) + class234.field2952 + " " + class91.field1180 + var1 + class91.field1181 + class91.field1177;
        } else {
            return " " + class91.method1479(16776960) + var1 + class91.field1177;
        }
    }

    @ObfuscatedName("client.il(ZB)V")
    public final void method1272(boolean arg0) {
        method5012(field707, Statics.field567, Statics.field1150, arg0);
    }

    @ObfuscatedName("client.id(Lht;B)V")
    public void method1241(class227 arg0) {
        class227 var2 = arg0.field2613 == -1 ? null : class227.method3203(arg0.field2613);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field567;
            var4 = Statics.field1150;
        } else {
            var3 = var2.field2609;
            var4 = var2.field2610;
        }
        method262(arg0, var3, var4, false);
        method3326(arg0, var3, var4);
    }

    @ObfuscatedName("fo.ib([Lht;Lht;ZI)V")
    public static void method3216(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2617 == 0 ? arg1.field2609 : arg1.field2617;
        int var4 = arg1.field2733 == 0 ? arg1.field2610 : arg1.field2733;
        method2036(arg0, arg1.field2594, var3, var4, arg2);
        if (arg1.field2724 != null) {
            method2036(arg1.field2724, arg1.field2594, var3, var4, arg2);
        }
        class71 var5 = (class71) field843.method5597((long) arg1.field2594);
        if (var5 != null) {
            method5012(var5.field596, var3, var4, arg2);
        }
        if (arg1.field2683 == 1337) {
        }
    }

    @ObfuscatedName("kn.iq(IIIZI)V")
    public static final void method5012(int arg0, int arg1, int arg2, boolean arg3) {
        if (class227.method1068(arg0)) {
            method2036(Statics.field2584[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ct.ir([Lht;IIIZI)V")
    public static void method2036(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2613 == arg1) {
                method262(var6, arg2, arg3, arg4);
                method3326(var6, arg2, arg3);
                if (var6.field2622 > var6.field2617 - var6.field2609) {
                    var6.field2622 = var6.field2617 - var6.field2609;
                }
                if (var6.field2622 < 0) {
                    var6.field2622 = 0;
                }
                if (var6.field2616 > var6.field2733 - var6.field2610) {
                    var6.field2616 = var6.field2733 - var6.field2610;
                }
                if (var6.field2616 < 0) {
                    var6.field2616 = 0;
                }
                if (var6.field2596 == 0) {
                    method3216(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ac.it(Lht;IIZB)V")
    public static void method262(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2609;
        int var5 = arg0.field2610;
        if (arg0.field2601 == 0) {
            arg0.field2609 = arg0.field2605;
        } else if (arg0.field2601 == 1) {
            arg0.field2609 = arg1 - arg0.field2605;
        } else if (arg0.field2601 == 2) {
            arg0.field2609 = arg0.field2605 * arg1 >> 14;
        }
        if (arg0.field2602 == 0) {
            arg0.field2610 = arg0.field2702;
        } else if (arg0.field2602 == 1) {
            arg0.field2610 = arg2 - arg0.field2702;
        } else if (arg0.field2602 == 2) {
            arg0.field2610 = arg0.field2702 * arg2 >> 14;
        }
        if (arg0.field2601 == 4) {
            arg0.field2609 = arg0.field2611 * arg0.field2610 / arg0.field2612;
        }
        if (arg0.field2602 == 4) {
            arg0.field2610 = arg0.field2612 * arg0.field2609 / arg0.field2611;
        }
        if (arg0.field2683 == 1337) {
            field916 = arg0;
        }
        if (arg3 && arg0.field2618 != null && (arg0.field2609 != var4 || arg0.field2610 != var5)) {
            class72 var6 = new class72();
            var6.field611 = arg0;
            var6.field607 = arg0.field2618;
            field683.method4639(var6);
        }
    }

    @ObfuscatedName("fn.ig(Lht;IIS)V")
    public static void method3326(class227 arg0, int arg1, int arg2) {
        if (arg0.field2599 == 0) {
            arg0.field2607 = arg0.field2603;
        } else if (arg0.field2599 == 1) {
            arg0.field2607 = (arg1 - arg0.field2609) / 2 + arg0.field2603;
        } else if (arg0.field2599 == 2) {
            arg0.field2607 = arg1 - arg0.field2609 - arg0.field2603;
        } else if (arg0.field2599 == 3) {
            arg0.field2607 = arg0.field2603 * arg1 >> 14;
        } else if (arg0.field2599 == 4) {
            arg0.field2607 = (arg0.field2603 * arg1 >> 14) + (arg1 - arg0.field2609) / 2;
        } else {
            arg0.field2607 = arg1 - arg0.field2609 - (arg0.field2603 * arg1 >> 14);
        }
        if (arg0.field2600 == 0) {
            arg0.field2608 = arg0.field2646;
        } else if (arg0.field2600 == 1) {
            arg0.field2608 = (arg2 - arg0.field2610) / 2 + arg0.field2646;
        } else if (arg0.field2600 == 2) {
            arg0.field2608 = arg2 - arg0.field2610 - arg0.field2646;
        } else if (arg0.field2600 == 3) {
            arg0.field2608 = arg0.field2646 * arg2 >> 14;
        } else if (arg0.field2600 == 4) {
            arg0.field2608 = (arg0.field2646 * arg2 >> 14) + (arg2 - arg0.field2610) / 2;
        } else {
            arg0.field2608 = arg2 - arg0.field2610 - (arg0.field2646 * arg2 >> 14);
        }
    }

    @ObfuscatedName("gk.ij(Lht;IIIIIIB)V")
    public static final void method3436(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field691) {
            field750 = 32;
        } else {
            field750 = 0;
        }
        field691 = false;
        if (class64.field512 == 1 || !Statics.field2487 && class64.field512 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2616 -= 4;
                method1219(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2616 += 4;
                method1219(arg0);
            } else if (arg5 >= arg1 - field750 && arg5 < field750 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2616 = (arg4 - arg3) * var8 / var9;
                method1219(arg0);
                field691 = true;
            }
        }
        if (field923 == 0) {
            return;
        }
        int var10 = arg0.field2609;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2616 += field923 * 45;
            method1219(arg0);
        }
    }

    @ObfuscatedName("h.if(IIIIIB)V")
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field177[0].method5734(arg0, arg1);
        Statics.field177[1].method5734(arg0, arg1 + arg3 - 16);
        class332.method5652(arg0, arg1 + 16, 16, arg3 - 32, field926);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class332.method5652(arg0, arg1 + 16 + var6, 16, var5, field766);
        class332.method5659(arg0, arg1 + 16 + var6, var5, field748);
        class332.method5659(arg0 + 1, arg1 + 16 + var6, var5, field748);
        class332.method5709(arg0, arg1 + 16 + var6, 16, field748);
        class332.method5709(arg0, arg1 + 17 + var6, 16, field748);
        class332.method5659(arg0 + 15, arg1 + 16 + var6, var5, field747);
        class332.method5659(arg0 + 14, arg1 + 17 + var6, var5 - 1, field747);
        class332.method5709(arg0, arg1 + 15 + var6 + var5, 16, field747);
        class332.method5709(arg0 + 1, arg1 + 14 + var6 + var5, 15, field747);
    }

    @ObfuscatedName("jy.ie(II)Ljava/lang/String;")
    public static final String method4467(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("lx.ia(Lht;B)Z")
    public static final boolean method5487(class227 arg0) {
        if (arg0.field2657 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2657.length; var1++) {
            int var2 = method587(arg0, var1);
            int var3 = arg0.field2698[var1];
            if (arg0.field2657[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2657[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2657[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("aq.ii(Lht;II)I")
    public static final int method587(class227 arg0, int arg1) {
        if (arg0.field2712 == null || arg1 >= arg0.field2712.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2712[arg1];
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
                    var7 = field814[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field813[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field816[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method3203(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class266.method335(var12).field3447 || field684)) {
                        for (int var13 = 0; var13 < var11.field2718.length; var13++) {
                            if (var12 + 1 == var11.field2718[var13]) {
                                var7 += var11.field2719[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2551[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2773[field813[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2551[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3130.field650;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2772[var14]) {
                            var7 += field813[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method3203(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class266.method335(var18).field3447 || field684)) {
                        for (int var19 = 0; var19 < var17.field2718.length; var19++) {
                            if (var18 + 1 == var17.field2718[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field712;
                }
                if (var6 == 12) {
                    var7 = field850;
                }
                if (var6 == 13) {
                    int var20 = class222.field2551[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method1164(var22);
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
                    var7 = (Statics.field3130.field1000 >> 7) + Statics.field1641;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3130.field976 >> 7) + Statics.field132;
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

    @ObfuscatedName("by.ix(Lht;Ljk;IIZI)V")
    public static final void method1076(class227 arg0, class266 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3449;
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
            var7 = class234.field2787;
        }
        if (var6 != -1 && var7 != null) {
            method773(var7, class91.method1479(16748608) + arg1.field3434, var6, arg1.field3432, arg2, arg0.field2594, arg4);
        }
    }

    @ObfuscatedName("ih.iu(Lht;IIB)V")
    public static final void method3885(class227 arg0, int arg1, int arg2) {
        if (arg0.field2661 == 1) {
            method3117(arg0.field2717, "", 24, 0, 0, arg0.field2594);
        }
        if (arg0.field2661 == 2 && !field856) {
            String var3 = method1664(arg0);
            if (var3 != null) {
                method3117(var3, class91.method1479(65280) + arg0.field2716, 25, 0, -1, arg0.field2594);
            }
        }
        if (arg0.field2661 == 3) {
            method3117(class234.field2948, "", 26, 0, 0, arg0.field2594);
        }
        if (arg0.field2661 == 4) {
            method3117(arg0.field2717, "", 28, 0, 0, arg0.field2594);
        }
        if (arg0.field2661 == 5) {
            method3117(arg0.field2717, "", 29, 0, 0, arg0.field2594);
        }
        if (arg0.field2661 == 6 && field848 == null) {
            method3117(arg0.field2717, "", 30, 0, -1, arg0.field2594);
        }
        if (arg0.field2596 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2610; var5++) {
                for (int var6 = 0; var6 < arg0.field2609; var6++) {
                    int var7 = (arg0.field2656 + 32) * var6;
                    int var8 = (arg0.field2662 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2663[var4];
                        var8 += arg0.field2664[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field793 = var4;
                        Statics.field2533 = arg0;
                        if (arg0.field2718[var4] > 0) {
                            label328: {
                                class266 var9 = class266.method335(arg0.field2718[var4] - 1);
                                if (field767 == 1) {
                                    int var10 = method222(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field3282 != arg0.field2594 || Statics.field3232 != var4) {
                                            method3117(class234.field2816, field836 + " " + class91.field1182 + " " + class91.method1479(16748608) + var9.field3434, 31, var9.field3432, var4, arg0.field2594);
                                        }
                                        break label328;
                                    }
                                }
                                if (field856) {
                                    int var12 = method222(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1356 & 0x10) == 16) {
                                            method3117(field840, field841 + " " + class91.field1182 + " " + class91.method1479(16748608) + var9.field3434, 32, var9.field3432, var4, arg0.field2594);
                                        }
                                        break label328;
                                    }
                                }
                                String[] var14 = var9.field3449;
                                int var15 = -1;
                                if (field898) {
                                    boolean var16 = field770 || class55.field421[81];
                                    if (var16) {
                                        var15 = var9.method4416();
                                    }
                                }
                                int var17 = method222(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 4; var19 >= 3; var19--) {
                                        if (var15 != var19) {
                                            method1076(arg0, var9, var4, var19, false);
                                        }
                                    }
                                }
                                int var20 = method222(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method3117(class234.field2816, class91.method1479(16748608) + var9.field3434, 38, var9.field3432, var4, arg0.field2594);
                                }
                                int var22 = method222(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15 != var24) {
                                            method1076(arg0, var9, var4, var24, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method1076(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var25 = arg0.field2637;
                                if (var25 != null) {
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 39;
                                            }
                                            if (var26 == 1) {
                                                var27 = 40;
                                            }
                                            if (var26 == 2) {
                                                var27 = 41;
                                            }
                                            if (var26 == 3) {
                                                var27 = 42;
                                            }
                                            if (var26 == 4) {
                                                var27 = 43;
                                            }
                                            method3117(var25[var26], class91.method1479(16748608) + var9.field3434, var27, var9.field3432, var4, arg0.field2594);
                                        }
                                    }
                                }
                                method3117(class234.field2940, class91.method1479(16748608) + var9.field3434, 1005, var9.field3432, var4, arg0.field2594);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2696) {
            return;
        }
        if (field856) {
            int var28 = method222(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field1356 & 0x20) == 32) {
                method3117(field840, field841 + " " + class91.field1182 + " " + arg0.field2673, 58, 0, arg0.field2725, arg0.field2594);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            int var31 = method222(arg0);
            boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
            String var33;
            if (!var32 && arg0.field2700 == null) {
                var33 = null;
            } else if (arg0.field2693 == null || arg0.field2693.length <= var30 || arg0.field2693[var30] == null || arg0.field2693[var30].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field2693[var30];
            }
            if (var33 != null) {
                method3117(var33, arg0.field2673, 1007, var30 + 1, arg0.field2725, arg0.field2594);
            }
        }
        String var35 = method1664(arg0);
        if (var35 != null) {
            method3117(var35, arg0.field2673, 25, 0, arg0.field2725, arg0.field2594);
        }
        for (int var36 = 4; var36 >= 0; var36--) {
            int var37 = method222(arg0);
            boolean var38 = (var37 >> var36 + 1 & 0x1) != 0;
            String var39;
            if (!var38 && arg0.field2700 == null) {
                var39 = null;
            } else if (arg0.field2693 == null || arg0.field2693.length <= var36 || arg0.field2693[var36] == null || arg0.field2693[var36].trim().length() == 0) {
                var39 = null;
            } else {
                var39 = arg0.field2693[var36];
            }
            if (var39 != null) {
                method773(var39, arg0.field2673, 57, var36 + 1, arg0.field2725, arg0.field2594, arg0.field2736);
            }
        }
        if (class228.method3433(method222(arg0))) {
            method3117(class234.field3050, "", 30, 0, arg0.field2725, arg0.field2594);
        }
    }

    @ObfuscatedName("hi.iy(ZI)V")
    public static void method3725(boolean arg0) {
        field770 = arg0;
    }

    @ObfuscatedName("gc.ju(I)Z")
    public static boolean method3484() {
        return field770;
    }

    @ObfuscatedName("br.jd([Lht;IIIIIIIS)V")
    public static final void method1106(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2613 == arg1 && (!var9.field2696 || var9.field2596 == 0 || var9.field2680 || method222(var9) != 0 || field765 == var9 || var9.field2683 == 1338)) {
                if (var9.field2696) {
                    if (method2867(var9)) {
                        continue;
                    }
                } else if (var9.field2596 == 0 && Statics.field75 != var9 && method2867(var9)) {
                    continue;
                }
                int var10 = var9.field2607 + arg6;
                int var11 = var9.field2608 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2596 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2596 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2609 + var10;
                    int var19 = var9.field2610 + var11;
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
                    int var22 = var9.field2609 + var10;
                    int var23 = var9.field2610 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field855 == var9) {
                    field706 = true;
                    field932 = var10;
                    field702 = var11;
                }
                boolean var24 = false;
                if (var9.field2668) {
                    switch(field844) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2594 >>> 16 == field845) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field845 == var9.field2594) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2696 || var12 < var14 && var13 < var15) {
                    if (var9.field2696) {
                        if (var9.field2734) {
                            if (class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15) {
                                for (class72 var25 = (class72) field683.method4638(); var25 != null; var25 = (class72) field683.method4640()) {
                                    if (var25.field602) {
                                        var25.method3407();
                                        var25.field611.field2653 = false;
                                    }
                                }
                                if (Statics.field73 == 0) {
                                    field855 = null;
                                    field765 = null;
                                }
                                if (!field818) {
                                    method351();
                                }
                            }
                        } else if (var9.field2604 && class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15) {
                            for (class72 var26 = (class72) field683.method4638(); var26 != null; var26 = (class72) field683.method4640()) {
                                if (var26.field602 && var26.field611.field2701 == var26.field607) {
                                    var26.method3407();
                                }
                            }
                        }
                    }
                    int var27 = class64.field510;
                    int var28 = class64.field514;
                    if (class64.field520 != 0) {
                        var27 = class64.field525;
                        var28 = class64.field522;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2683 == 1337) {
                        if (!field690 && !field818 && var29) {
                            method771(var27, var28, var12, var13);
                        }
                    } else if (var9.field2683 == 1338) {
                        method102(var9, var10, var11);
                    } else {
                        if (var9.field2683 == 1400) {
                            Statics.field419.method5929(class64.field510, class64.field514, var29, var10, var11, var9.field2609, var9.field2610);
                        }
                        if (!field818 && var29) {
                            if (var9.field2683 == 1400) {
                                Statics.field419.method5981(var10, var11, var9.field2609, var9.field2610, var27, var28);
                            } else {
                                method3885(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2669.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2669[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2669[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2595 != null) {
                                            var34 = class55.field421[var9.field2669[var30][var33]];
                                        }
                                        if (method2031(var9.field2669[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2595 != null && var9.field2595[var30] > field863) {
                                                break;
                                            }
                                            byte var35 = var9.field2650[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field421[86] && !class55.field421[82] && !class55.field421[81]) && ((var35 & 0x2) == 0 || class55.field421[86]) && ((var35 & 0x1) == 0 || class55.field421[82]) && ((var35 & 0x4) == 0 || class55.field421[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method2137(var30 + 1, var9.field2594, var9.field2725, var9.field2720, "");
                                    } else if (var30 == 10) {
                                        method1108();
                                        method48(var9.field2594, var9.field2725, class228.method3316(method222(var9)), var9.field2720);
                                        field840 = method1664(var9);
                                        if (field840 == null) {
                                            field840 = class234.field2793;
                                        }
                                        field841 = var9.field2673 + class91.method1479(16777215);
                                    }
                                    int var36 = var9.field2671[var30];
                                    if (var9.field2595 == null) {
                                        var9.field2595 = new int[var9.field2669.length];
                                    }
                                    if (var9.field2672 == null) {
                                        var9.field2672 = new int[var9.field2669.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2595[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2595[var30] == 0) {
                                        var9.field2595[var30] = field863 + var36 + var9.field2672[var30];
                                    } else {
                                        var9.field2595[var30] = field863 + var36;
                                    }
                                }
                                if (!var31 && var9.field2595 != null) {
                                    var9.field2595[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2696) {
                            boolean var37;
                            if (class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field512 == 1 || !Statics.field2487 && class64.field512 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field520 == 1 || !Statics.field2487 && class64.field520 == 4) && class64.field525 >= var12 && class64.field522 >= var13 && class64.field525 < var14 && class64.field522 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method3869(var9, class64.field525 - var10, class64.field522 - var11);
                            }
                            if (var9.field2683 == 1400) {
                                Statics.field419.method5930(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field855 != null && field855 != var9 && var37 && class228.method3685(method222(var9))) {
                                field859 = var9;
                            }
                            if (field765 == var9) {
                                field860 = true;
                                field861 = var10;
                                field862 = var11;
                            }
                            if (var9.field2680) {
                                if (var37 && field923 != 0 && var9.field2701 != null) {
                                    class72 var40 = new class72();
                                    var40.field602 = true;
                                    var40.field611 = var9;
                                    var40.field605 = field923;
                                    var40.field607 = var9.field2701;
                                    field683.method4639(var40);
                                }
                                if (field855 != null || Statics.field3139 != null || field818) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2647 && var39) {
                                    var9.field2647 = true;
                                    if (var9.field2682 != null) {
                                        class72 var41 = new class72();
                                        var41.field602 = true;
                                        var41.field611 = var9;
                                        var41.field604 = class64.field525 - var10;
                                        var41.field605 = class64.field522 - var11;
                                        var41.field607 = var9.field2682;
                                        field683.method4639(var41);
                                    }
                                }
                                if (var9.field2647 && var38 && var9.field2721 != null) {
                                    class72 var42 = new class72();
                                    var42.field602 = true;
                                    var42.field611 = var9;
                                    var42.field604 = class64.field510 - var10;
                                    var42.field605 = class64.field514 - var11;
                                    var42.field607 = var9.field2721;
                                    field683.method4639(var42);
                                }
                                if (var9.field2647 && !var38) {
                                    var9.field2647 = false;
                                    if (var9.field2638 != null) {
                                        class72 var43 = new class72();
                                        var43.field602 = true;
                                        var43.field611 = var9;
                                        var43.field604 = class64.field510 - var10;
                                        var43.field605 = class64.field514 - var11;
                                        var43.field607 = var9.field2638;
                                        field940.method4639(var43);
                                    }
                                }
                                if (var38 && var9.field2685 != null) {
                                    class72 var44 = new class72();
                                    var44.field602 = true;
                                    var44.field611 = var9;
                                    var44.field604 = class64.field510 - var10;
                                    var44.field605 = class64.field514 - var11;
                                    var44.field607 = var9.field2685;
                                    field683.method4639(var44);
                                }
                                if (!var9.field2653 && var37) {
                                    var9.field2653 = true;
                                    if (var9.field2652 != null) {
                                        class72 var45 = new class72();
                                        var45.field602 = true;
                                        var45.field611 = var9;
                                        var45.field604 = class64.field510 - var10;
                                        var45.field605 = class64.field514 - var11;
                                        var45.field607 = var9.field2652;
                                        field683.method4639(var45);
                                    }
                                }
                                if (var9.field2653 && var37 && var9.field2687 != null) {
                                    class72 var46 = new class72();
                                    var46.field602 = true;
                                    var46.field611 = var9;
                                    var46.field604 = class64.field510 - var10;
                                    var46.field605 = class64.field514 - var11;
                                    var46.field607 = var9.field2687;
                                    field683.method4639(var46);
                                }
                                if (var9.field2653 && !var37) {
                                    var9.field2653 = false;
                                    if (var9.field2726 != null) {
                                        class72 var47 = new class72();
                                        var47.field602 = true;
                                        var47.field611 = var9;
                                        var47.field604 = class64.field510 - var10;
                                        var47.field605 = class64.field514 - var11;
                                        var47.field607 = var9.field2726;
                                        field940.method4639(var47);
                                    }
                                }
                                if (var9.field2699 != null) {
                                    class72 var48 = new class72();
                                    var48.field611 = var9;
                                    var48.field607 = var9.field2699;
                                    field882.method4639(var48);
                                }
                                if (var9.field2695 != null && field869 > var9.field2728) {
                                    if (var9.field2694 == null || field869 - var9.field2728 > 32) {
                                        class72 var53 = new class72();
                                        var53.field611 = var9;
                                        var53.field607 = var9.field2695;
                                        field683.method4639(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2728; var49 < field869; var49++) {
                                            int var50 = field868[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2694.length; var51++) {
                                                if (var9.field2694[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field611 = var9;
                                                    var52.field607 = var9.field2695;
                                                    field683.method4639(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2728 = field869;
                                }
                                if (var9.field2625 != null && field942 > var9.field2729) {
                                    if (var9.field2667 == null || field942 - var9.field2729 > 32) {
                                        class72 var58 = new class72();
                                        var58.field611 = var9;
                                        var58.field607 = var9.field2625;
                                        field683.method4639(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2729; var54 < field942; var54++) {
                                            int var55 = field870[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2667.length; var56++) {
                                                if (var9.field2667[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field611 = var9;
                                                    var57.field607 = var9.field2625;
                                                    field683.method4639(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2729 = field942;
                                }
                                if (var9.field2697 != null && field873 > var9.field2730) {
                                    if (var9.field2731 == null || field873 - var9.field2730 > 32) {
                                        class72 var63 = new class72();
                                        var63.field611 = var9;
                                        var63.field607 = var9.field2697;
                                        field683.method4639(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2730; var59 < field873; var59++) {
                                            int var60 = field952[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2731.length; var61++) {
                                                if (var9.field2731[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field611 = var9;
                                                    var62.field607 = var9.field2697;
                                                    field683.method4639(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2730 = field873;
                                }
                                if (field762 > var9.field2727 && var9.field2642 != null) {
                                    class72 var64 = new class72();
                                    var64.field611 = var9;
                                    var64.field607 = var9.field2642;
                                    field683.method4639(var64);
                                }
                                if (field875 > var9.field2727 && var9.field2704 != null) {
                                    class72 var65 = new class72();
                                    var65.field611 = var9;
                                    var65.field607 = var9.field2704;
                                    field683.method4639(var65);
                                }
                                if (field876 > var9.field2727 && var9.field2705 != null) {
                                    class72 var66 = new class72();
                                    var66.field611 = var9;
                                    var66.field607 = var9.field2705;
                                    field683.method4639(var66);
                                }
                                if (field886 > var9.field2727 && var9.field2710 != null) {
                                    class72 var67 = new class72();
                                    var67.field611 = var9;
                                    var67.field607 = var9.field2710;
                                    field683.method4639(var67);
                                }
                                if (field853 > var9.field2727 && var9.field2670 != null) {
                                    class72 var68 = new class72();
                                    var68.field611 = var9;
                                    var68.field607 = var9.field2670;
                                    field683.method4639(var68);
                                }
                                if (field879 > var9.field2727 && var9.field2706 != null) {
                                    class72 var69 = new class72();
                                    var69.field611 = var9;
                                    var69.field607 = var9.field2706;
                                    field683.method4639(var69);
                                }
                                var9.field2727 = field867;
                                if (var9.field2703 != null) {
                                    for (int var70 = 0; var70 < field903; var70++) {
                                        class72 var71 = new class72();
                                        var71.field611 = var9;
                                        var71.field608 = field905[var70];
                                        var71.field609 = field904[var70];
                                        var71.field607 = var9.field2703;
                                        field683.method4639(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2696) {
                            if (field855 != null || Statics.field3139 != null || field818) {
                                continue;
                            }
                            if ((var9.field2715 >= 0 || var9.field2621 != 0) && class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15) {
                                if (var9.field2715 >= 0) {
                                    Statics.field75 = arg0[var9.field2715];
                                } else {
                                    Statics.field75 = var9;
                                }
                            }
                            if (var9.field2596 == 8 && class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15) {
                                Statics.field678 = var9;
                            }
                            if (var9.field2733 > var9.field2610) {
                                method3436(var9, var9.field2609 + var10, var11, var9.field2610, var9.field2733, class64.field510, class64.field514);
                            }
                        }
                        if (var9.field2596 == 0) {
                            method1106(arg0, var9.field2594, var12, var13, var14, var15, var10 - var9.field2622, var11 - var9.field2616);
                            if (var9.field2724 != null) {
                                method1106(var9.field2724, var9.field2594, var12, var13, var14, var15, var10 - var9.field2622, var11 - var9.field2616);
                            }
                            class71 var72 = (class71) field843.method5597((long) var9.field2594);
                            if (var72 != null) {
                                if (var72.field595 == 0 && class64.field510 >= var12 && class64.field514 >= var13 && class64.field510 < var14 && class64.field514 < var15 && !field818) {
                                    for (class72 var73 = (class72) field683.method4638(); var73 != null; var73 = (class72) field683.method4640()) {
                                        if (var73.field602) {
                                            var73.method3407();
                                            var73.field611.field2653 = false;
                                        }
                                    }
                                    if (Statics.field73 == 0) {
                                        field855 = null;
                                        field765 = null;
                                    }
                                    if (!field818) {
                                        method351();
                                    }
                                }
                                Statics.method2154(var72.field596, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cb.jx(II)Z")
    public static boolean method2031(int arg0) {
        for (int var1 = 0; var1 < field903; var1++) {
            if (field905[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("aj.je(III)V")
    public static final void method657(int arg0, int arg1) {
        if (class227.method1068(arg0)) {
            method239(Statics.field2584[arg0], arg1);
        }
    }

    @ObfuscatedName("i.jk([Lht;IB)V")
    public static final void method239(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2596 == 0) {
                    if (var3.field2724 != null) {
                        method239(var3.field2724, arg1);
                    }
                    class71 var4 = (class71) field843.method5597((long) var3.field2594);
                    if (var4 != null) {
                        method657(var4.field596, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2707 != null) {
                    class72 var5 = new class72();
                    var5.field611 = var3;
                    var5.field607 = var3.field2707;
                    class86.method3119(var5);
                }
                if (arg1 == 1 && var3.field2708 != null) {
                    if (var3.field2725 >= 0) {
                        class227 var6 = class227.method3203(var3.field2594);
                        if (var6 == null || var6.field2724 == null || var3.field2725 >= var6.field2724.length || var6.field2724[var3.field2725] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field611 = var3;
                    var7.field607 = var3.field2708;
                    class86.method3119(var7);
                }
            }
        }
    }

    @ObfuscatedName("hc.jy(Lht;III)V")
    public static final void method3869(class227 arg0, int arg1, int arg2) {
        if (field855 != null || field818 || arg0 == null) {
            return;
        }
        class227 var3 = arg0;
        int var4 = method222(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class227 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class227.method3203(var3.field2613);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class227 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2675;
        }
        if (var9 == null) {
            return;
        }
        field855 = arg0;
        class227 var11 = arg0;
        int var12 = method222(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class227 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class227.method3203(var11.field2613);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class227 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2675;
        }
        field765 = var17;
        field857 = arg1;
        field858 = arg2;
        Statics.field73 = 0;
        field931 = false;
        int var19 = method3327();
        if (var19 != -1) {
            method3717(var19);
        }
        return;
    }

    @ObfuscatedName("client.jn(I)V")
    public final void method1242() {
        method1219(field855);
        Statics.field73++;
        if (field706 && field860) {
            int var1 = class64.field510;
            int var2 = class64.field514;
            int var3 = var1 - field857;
            int var4 = var2 - field858;
            if (var3 < field861) {
                var3 = field861;
            }
            if (field855.field2609 + var3 > field861 + field765.field2609) {
                var3 = field861 + field765.field2609 - field855.field2609;
            }
            if (var4 < field862) {
                var4 = field862;
            }
            if (field855.field2610 + var4 > field862 + field765.field2610) {
                var4 = field862 + field765.field2610 - field855.field2610;
            }
            int var5 = var3 - field932;
            int var6 = var4 - field702;
            int var7 = field855.field2676;
            if (Statics.field73 > field855.field2593 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field931 = true;
            }
            int var8 = field765.field2622 + (var3 - field861);
            int var9 = field765.field2616 + (var4 - field862);
            if (field855.field2689 != null && field931) {
                class72 var10 = new class72();
                var10.field611 = field855;
                var10.field604 = var8;
                var10.field605 = var9;
                var10.field607 = field855.field2689;
                class86.method3119(var10);
            }
            if (class64.field512 == 0) {
                if (field931) {
                    if (field855.field2690 != null) {
                        class72 var11 = new class72();
                        var11.field611 = field855;
                        var11.field604 = var8;
                        var11.field605 = var9;
                        var11.field614 = field859;
                        var11.field607 = field855.field2690;
                        class86.method3119(var11);
                    }
                    if (field859 != null) {
                        class227 var12 = field855;
                        int var13 = method222(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class227 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class227.method3203(var12.field2613);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class197 var18 = class197.method57(class193.field2316, field729.field1347);
                            var18.field2371.method5225(field859.field2594);
                            var18.field2371.method5164(field859.field2720);
                            var18.field2371.method5216(field855.field2720);
                            var18.field2371.method5216(field855.field2725);
                            var18.field2371.method5217(field859.field2725);
                            var18.field2371.method5227(field855.field2594);
                            field729.method2178(var18);
                        }
                    }
                } else if (this.method1238()) {
                    this.method1239(field932 + field857, field858 + field702);
                } else if (field819 > 0) {
                    int var19 = field932 + field857;
                    int var20 = field858 + field702;
                    class92 var21 = Statics.field92;
                    method3718(var21.field1192, var21.field1195, var21.field1188, var21.field1190, var21.field1191, var21.field1191, var19, var20);
                    Statics.field92 = null;
                }
                field855 = null;
            }
        } else if (Statics.field73 > 1) {
            field855 = null;
        }
    }

    @ObfuscatedName("hh.jp(II)V")
    public static void method3717(int arg0) {
        Statics.field92 = new class92();
        Statics.field92.field1192 = field820[arg0];
        Statics.field92.field1195 = field821[arg0];
        Statics.field92.field1188 = field822[arg0];
        Statics.field92.field1190 = field823[arg0];
        Statics.field92.field1191 = field824[arg0];
    }

    @ObfuscatedName("bu.jg(Lht;I)V")
    public static void method1219(class227 arg0) {
        if (field749 == arg0.field2624) {
            field835[arg0.field2714] = true;
        }
    }

    @ObfuscatedName("jk.jv(I)V")
    public static void method4465() {
        for (class71 var0 = (class71) field843.method5601(); var0 != null; var0 = (class71) field843.method5598()) {
            int var1 = var0.field596;
            if (class227.method1068(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field2584[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2696;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2140;
                    class227 var6 = class227.method3203(var5);
                    if (var6 != null) {
                        method1219(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.js(IB)V")
    public static final void method5006(int arg0) {
        if (!class227.method1068(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2722 = 0;
                var3.field2723 = 0;
            }
        }
    }

    @ObfuscatedName("ex.ja([Lht;II)V")
    public static final void method3126(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2613 == arg1 && (!var3.field2696 || !method2867(var3))) {
                if (var3.field2596 == 0) {
                    if (!var3.field2696 && method2867(var3) && Statics.field75 != var3) {
                        continue;
                    }
                    method3126(arg0, var3.field2594);
                    if (var3.field2724 != null) {
                        method3126(var3.field2724, var3.field2594);
                    }
                    class71 var4 = (class71) field843.method5597((long) var3.field2594);
                    if (var4 != null) {
                        int var5 = var4.field596;
                        if (class227.method1068(var5)) {
                            method3126(Statics.field2584[var5], -1);
                        }
                    }
                }
                if (var3.field2596 == 6) {
                    if (var3.field2641 != -1 || var3.field2588 != -1) {
                        boolean var6 = method5487(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2588;
                        } else {
                            var7 = var3.field2641;
                        }
                        if (var7 != -1) {
                            class270 var8 = class270.method2219(var7);
                            var3.field2723 += field744;
                            while (var3.field2723 > var8.field3541[var3.field2722]) {
                                var3.field2723 -= var8.field3541[var3.field2722];
                                var3.field2722++;
                                if (var3.field2722 >= var8.field3539.length) {
                                    var3.field2722 -= var8.field3543;
                                    if (var3.field2722 < 0 || var3.field2722 >= var8.field3539.length) {
                                        var3.field2722 = 0;
                                    }
                                }
                                method1219(var3);
                            }
                        }
                    }
                    if (var3.field2735 != 0 && !var3.field2696) {
                        int var9 = var3.field2735 >> 16;
                        int var10 = var3.field2735 << 16 >> 16;
                        int var11 = field744 * var9;
                        int var12 = field744 * var10;
                        var3.field2645 = var3.field2645 + var11 & 0x7FF;
                        var3.field2686 = var3.field2686 + var12 & 0x7FF;
                        method1219(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.jj(II)V")
    public static final void method218(int arg0) {
        method4465();
        for (class85 var1 = (class85) class85.field1106.method4638(); var1 != null; var1 = (class85) class85.field1106.method4640()) {
            if (var1.field1114 != null) {
                var1.method1838();
            }
        }
        int var2 = class252.method1663(arg0).field3235;
        if (var2 == 0) {
            return;
        }
        int var3 = class222.field2551[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class140.method2878(0.9D);
                ((class129) Statics.field1802).method2618(0.9D);
            }
            if (var3 == 2) {
                class140.method2878(0.8D);
                ((class129) Statics.field1802).method2618(0.8D);
            }
            if (var3 == 3) {
                class140.method2878(0.7D);
                ((class129) Statics.field1802).method2618(0.7D);
            }
            if (var3 == 4) {
                class140.method2878(0.6D);
                ((class129) Statics.field1802).method2618(0.6D);
            }
            class266.field3444.method3158();
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (field915 != var4) {
                if (field915 == 0 && field947 != -1) {
                    class207.method793(Statics.field644, field947, 0, var4, false);
                    field917 = false;
                } else if (var4 == 0) {
                    Statics.field54.method3523();
                    class207.field2435 = 1;
                    Statics.field126 = null;
                    field917 = false;
                } else {
                    class207.method5008(var4);
                }
                field915 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field918 = 127;
            }
            if (var3 == 1) {
                field918 = 96;
            }
            if (var3 == 2) {
                field918 = 64;
            }
            if (var3 == 3) {
                field918 = 32;
            }
            if (var3 == 4) {
                field918 = 0;
            }
        }
        if (var2 == 5) {
            field888 = var3;
        }
        if (var2 == 6) {
            field846 = var3;
        }
        if (var2 == 9) {
            field847 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field837 = 127;
            }
            if (var3 == 1) {
                field837 = 96;
            }
            if (var3 == 2) {
                field837 = 64;
            }
            if (var3 == 3) {
                field837 = 32;
            }
            if (var3 == 4) {
                field837 = 0;
            }
        }
        if (var2 == 17) {
            field852 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field945 = (class94) class205.method3432(class94.method2403(), var3);
            if (field945 == null) {
                field945 = class94.field1206;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field809 = -1;
            } else {
                field809 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class94[] var5 = new class94[] { class94.field1203, class94.field1206, class94.field1204, class94.field1202 };
        field681 = (class94) class205.method3432(var5, var3);
        if (field681 == null) {
            field681 = class94.field1206;
        }
    }

    @ObfuscatedName("aq.jb(Lht;I)V")
    public static final void method588(class227 arg0) {
        int var1 = arg0.field2683;
        if (var1 == 324) {
            if (field946 == -1) {
                field946 = arg0.field2629;
                field896 = arg0.field2630;
            }
            if (field797.field2562) {
                arg0.field2629 = field946;
            } else {
                arg0.field2629 = field896;
            }
        } else if (var1 == 325) {
            if (field946 == -1) {
                field946 = arg0.field2629;
                field896 = arg0.field2630;
            }
            if (field797.field2562) {
                arg0.field2629 = field896;
            } else {
                arg0.field2629 = field946;
            }
        } else if (var1 == 327) {
            arg0.field2645 = 150;
            arg0.field2686 = (int) (Math.sin((double) field863 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2597 = 5;
            arg0.field2606 = 0;
        } else if (var1 == 328) {
            arg0.field2645 = 150;
            arg0.field2686 = (int) (Math.sin((double) field863 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2597 = 5;
            arg0.field2606 = 1;
        }
    }

    @ObfuscatedName("gc.jc(I)V")
    public static final void method3482() {
        class197 var0 = class197.method57(class193.field2263, field729.field1347);
        field729.method2178(var0);
        for (class71 var1 = (class71) field843.method5601(); var1 != null; var1 = (class71) field843.method5598()) {
            if (var1.field595 == 0 || var1.field595 == 3) {
                method1209(var1, true);
            }
        }
        if (field848 != null) {
            method1219(field848);
            field848 = null;
        }
    }

    @ObfuscatedName("ec.jt(IIII)Lbs;")
    public static final class71 method3116(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field596 = arg1;
        var3.field595 = arg2;
        field843.method5596(var3, (long) arg0);
        method5006(arg1);
        class227 var4 = class227.method3203(arg0);
        method1219(var4);
        if (field848 != null) {
            method1219(field848);
            field848 = null;
        }
        for (int var5 = 0; var5 < field819; var5++) {
            if (method2155(field822[var5])) {
                if (var5 < field819 - 1) {
                    for (int var6 = var5; var6 < field819 - 1; var6++) {
                        field824[var6] = field824[var6 + 1];
                        field825[var6] = field825[var6 + 1];
                        field822[var6] = field822[var6 + 1];
                        field823[var6] = field823[var6 + 1];
                        field820[var6] = field820[var6 + 1];
                        field821[var6] = field821[var6 + 1];
                        field826[var6] = field826[var6 + 1];
                    }
                }
                var5--;
                field819--;
            }
        }
        Statics.method2643();
        method3216(Statics.field2584[arg0 >> 16], var4, false);
        class86.method1066(arg1);
        if (field707 != -1) {
            method657(field707, 1);
        }
        return var3;
    }

    @ObfuscatedName("bi.ji(Lbs;ZI)V")
    public static final void method1209(class71 arg0, boolean arg1) {
        int var2 = arg0.field596;
        int var3 = (int) arg0.field2140;
        arg0.method3407();
        if (arg1) {
            class227.method3514(var2);
        }
        method5559(var2);
        class227 var4 = class227.method3203(var3);
        if (var4 != null) {
            method1219(var4);
        }
        for (int var5 = 0; var5 < field819; var5++) {
            if (method2155(field822[var5])) {
                if (var5 < field819 - 1) {
                    for (int var6 = var5; var6 < field819 - 1; var6++) {
                        field824[var6] = field824[var6 + 1];
                        field825[var6] = field825[var6 + 1];
                        field822[var6] = field822[var6 + 1];
                        field823[var6] = field823[var6 + 1];
                        field820[var6] = field820[var6 + 1];
                        field821[var6] = field821[var6 + 1];
                        field826[var6] = field826[var6 + 1];
                    }
                }
                var5--;
                field819--;
            }
        }
        Statics.method2643();
        if (field707 != -1) {
            method657(field707, 1);
        }
    }

    @ObfuscatedName("cz.jq(Lht;I)Z")
    public static final boolean method2109(class227 arg0) {
        int var1 = arg0.field2683;
        if (var1 == 205) {
            field939 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field797.method3769(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field797.method3770(var4, var5 == 1);
        }
        if (var1 == 324) {
            field797.method3771(false);
        }
        if (var1 == 325) {
            field797.method3771(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method57(class193.field2336, field729.field1347);
            field797.method3787(var6.field2371);
            field729.method2178(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ff.jm(Lht;IIIB)V")
    public static final void method3231(class227 arg0, int arg1, int arg2, int arg3) {
        method1837();
        class221 var4 = arg0.method3821(false);
        if (var4 == null) {
            return;
        }
        class332.method5644(arg1, arg2, var4.field2548 + arg1, var4.field2547 + arg2);
        if (field900 == 2 || field900 == 5) {
            class332.method5663(arg1, arg2, 0, var4.field2546, var4.field2545);
        } else {
            int var5 = field708 & 0x7FF;
            int var6 = Statics.field3130.field1000 / 32 + 48;
            int var7 = 464 - Statics.field3130.field976 / 32;
            Statics.field600.method5837(arg1, arg2, var4.field2548, var4.field2547, var6, var7, var5, 256, var4.field2546, var4.field2545);
            for (int var8 = 0; var8 < field908; var8++) {
                int var9 = field724[var8] * 4 + 2 - Statics.field3130.field1000 / 32;
                int var10 = field910[var8] * 4 + 2 - Statics.field3130.field976 / 32;
                method2032(arg1, arg2, var9, var10, field911[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class273 var13 = field914[Statics.field99][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3130.field1000 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3130.field976 / 32;
                        method2032(arg1, arg2, var14, var15, Statics.field1901[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field725; var16++) {
                class89 var17 = field872[field801[var16]];
                if (var17 != null && var17.method1179()) {
                    class268 var18 = var17.field1158;
                    if (var18 != null && var18.field3488 != null) {
                        var18 = var18.method4492();
                    }
                    if (var18 != null && var18.field3506 && var18.field3515) {
                        int var19 = var17.field1000 / 32 - Statics.field3130.field1000 / 32;
                        int var20 = var17.field976 / 32 - Statics.field3130.field976 / 32;
                        method2032(arg1, arg2, var19, var20, Statics.field1901[1], var4);
                    }
                }
            }
            int var21 = class99.field1286;
            int[] var22 = class99.field1287;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field798[var22[var23]];
                if (var24 != null && var24.method1179() && !var24.field659 && Statics.field3130 != var24) {
                    int var25 = var24.field1000 / 32 - Statics.field3130.field1000 / 32;
                    int var26 = var24.field976 / 32 - Statics.field3130.field976 / 32;
                    boolean var27 = false;
                    if (Statics.field3130.field653 != 0 && var24.field653 != 0 && Statics.field3130.field653 == var24.field653) {
                        var27 = true;
                    }
                    if (var24.method1182()) {
                        method2032(arg1, arg2, var25, var26, Statics.field1901[3], var4);
                    } else if (var27) {
                        method2032(arg1, arg2, var25, var26, Statics.field1901[4], var4);
                    } else if (var24.method1171()) {
                        method2032(arg1, arg2, var25, var26, Statics.field1901[5], var4);
                    } else {
                        method2032(arg1, arg2, var25, var26, Statics.field1901[2], var4);
                    }
                }
            }
            if (field699 != 0 && field863 % 20 < 10) {
                if (field699 == 1 && field700 >= 0 && field700 < field872.length) {
                    class89 var28 = field872[field700];
                    if (var28 != null) {
                        int var29 = var28.field1000 / 32 - Statics.field3130.field1000 / 32;
                        int var30 = var28.field976 / 32 - Statics.field3130.field976 / 32;
                        method3150(arg1, arg2, var29, var30, Statics.field613[1], var4);
                    }
                }
                if (field699 == 2) {
                    int var31 = field730 * 4 - Statics.field1641 * 4 + 2 - Statics.field3130.field1000 / 32;
                    int var32 = field703 * 4 - Statics.field132 * 4 + 2 - Statics.field3130.field976 / 32;
                    method3150(arg1, arg2, var31, var32, Statics.field613[1], var4);
                }
                if (field699 == 10 && field701 >= 0 && field701 < field798.length) {
                    class76 var33 = field798[field701];
                    if (var33 != null) {
                        int var34 = var33.field1000 / 32 - Statics.field3130.field1000 / 32;
                        int var35 = var33.field976 / 32 - Statics.field3130.field976 / 32;
                        method3150(arg1, arg2, var34, var35, Statics.field613[1], var4);
                    }
                }
            }
            if (field912 != 0) {
                int var36 = field912 * 4 + 2 - Statics.field3130.field1000 / 32;
                int var37 = field877 * 4 + 2 - Statics.field3130.field976 / 32;
                method2032(arg1, arg2, var36, var37, Statics.field613[0], var4);
            }
            if (!Statics.field3130.field659) {
                class332.method5652(var4.field2548 / 2 + arg1 - 1, var4.field2547 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field759[arg3] = true;
    }

    @ObfuscatedName("af.jl(Lht;IIIB)V")
    public static final void method297(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3821(false);
        if (var4 == null) {
            return;
        }
        if (field900 < 3) {
            Statics.field2013.method5837(arg1, arg2, var4.field2548, var4.field2547, 25, 25, field708, 256, var4.field2546, var4.field2545);
        } else {
            class332.method5663(arg1, arg2, 0, var4.field2546, var4.field2545);
        }
    }

    @ObfuscatedName("eg.jw(IIIILlc;Lho;I)V")
    public static final void method3150(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2032(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field708 & 0x7FF;
        int var8 = class140.field1815[var7];
        int var9 = class140.field1800[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2548 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2541.method5781(arg5.field2548 / 2 + arg0 - var17 / 2 + var15, arg5.field2547 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("cb.jr(IIIILlc;Lho;I)V")
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field708 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1815[var6];
        int var9 = class140.field1800[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5774(arg5.field2548 / 2 + var10 - arg4.field3908 / 2, arg5.field2547 / 2 - var11 - arg4.field3918 / 2, arg0, arg1, arg5.field2548, arg5.field2547, arg5.field2546, arg5.field2545);
        } else {
            arg4.method5773(arg5.field2548 / 2 + arg0 + var10 - arg4.field3908 / 2, arg5.field2547 / 2 + arg1 - var11 - arg4.field3918 / 2);
        }
    }

    @ObfuscatedName("bb.jf(I)V")
    public static final void method739() {
        class101.method104();
        if (Statics.field438 != null) {
            Statics.field438.method4927();
        }
    }

    @ObfuscatedName("gz.jh(I)V")
    public static final void method3421() {
        field876 = field867;
        Statics.field2274 = true;
    }

    @ObfuscatedName("bm.jz(Ljava/lang/String;I)V")
    public static final void method1067(String arg0) {
        if (Statics.field438 != null) {
            class197 var1 = class197.method57(class193.field2334, field729.field1347);
            var1.field2371.method5203(class311.method3740(arg0));
            var1.field2371.method5355(arg0);
            field729.method2178(var1);
        }
    }

    @ObfuscatedName("bk.ke(Ljava/lang/String;I)V")
    public static final void method1129(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method57(class193.field2330, field729.field1347);
            var1.field2371.method5203(class311.method3740(arg0));
            var1.field2371.method5355(arg0);
            field729.method2178(var1);
        }
    }

    @ObfuscatedName("b.ku(I)V")
    public static final void method17() {
        class197 var0 = class197.method57(class193.field2330, field729.field1347);
        var0.field2371.method5203(0);
        field729.method2178(var0);
    }

    @ObfuscatedName("la.kt(II)V")
    public static void method5559(int arg0) {
        for (class189 var1 = (class189) field884.method5601(); var1 != null; var1 = (class189) field884.method5598()) {
            if ((long) arg0 == (var1.field2140 >> 48 & 0xFFFFL)) {
                var1.method3407();
            }
        }
    }

    @ObfuscatedName("h.kl(Lht;I)I")
    public static int method222(class227 arg0) {
        class189 var1 = (class189) field884.method5597(((long) arg0.field2594 << 32) + (long) arg0.field2725);
        return var1 == null ? arg0.field2640 : var1.field2139;
    }

    @ObfuscatedName("ep.ka(Lht;B)Z")
    public static boolean method2867(class227 arg0) {
        return arg0.field2591;
    }

    @ObfuscatedName("bz.kz(Lht;B)Ljava/lang/String;")
    public static String method1664(class227 arg0) {
        if (class228.method3316(method222(arg0)) == 0) {
            return null;
        } else if (arg0.field2651 == null || arg0.field2651.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2651;
        }
    }

    @ObfuscatedName("ca.kd(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1965(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field871 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field871 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field871 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field871 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field871 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field282 != null) {
            var3 = "/p=" + Statics.field282;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3691 + "/a=" + Statics.field1562 + var3 + "/";
    }

    @ObfuscatedName("aj.km(Ljava/lang/String;B)V")
    public static void method658(String arg0) {
        Statics.field282 = arg0;
        try {
            String var1 = Statics.field3753.getParameter(Integer.toString(18));
            String var2 = Statics.field3753.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class308.method4786() + 94608000000L;
                class217.field2529.setTime(new Date(var6));
                int var8 = class217.field2529.get(7);
                int var9 = class217.field2529.get(5);
                int var10 = class217.field2529.get(2);
                int var11 = class217.field2529.get(1);
                int var12 = class217.field2529.get(11);
                int var13 = class217.field2529.get(12);
                int var14 = class217.field2529.get(13);
                String var15 = class217.field2528[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class217.field2527[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field3753;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("a.ki(Ljava/lang/String;ZI)V")
    public static void method213(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1155; var5++) {
            class266 var6 = class266.method335(var5);
            if ((!arg1 || var6.field3424) && var6.field3466 == -1 && var6.field3434.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field974 = -1;
                    Statics.field641 = null;
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
        Statics.field641 = var3;
        Statics.field314 = 0;
        Statics.field974 = var4;
        String[] var9 = new String[Statics.field974];
        for (int var10 = 0; var10 < Statics.field974; var10++) {
            var9[var10] = class266.method335(var3[var10]).field3434;
        }
        short[] var11 = Statics.field641;
        class199.method2029(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("fg.kk(Lkb;II)V")
    public static void method3269(class311 arg0, int arg1) {
        Statics.method214(arg0.field3742, arg1);
        class177.method3217(arg0, arg1);
    }

    @ObfuscatedName("gb.kx(Lkb;I)V")
    public static void method3473(class311 arg0) {
        if (field909 == null) {
            byte[] var1 = class177.method1979();
            arg0.method5161(var1, 0, var1.length);
        } else {
            arg0.method5161(field909, 0, field909.length);
        }
    }

    @ObfuscatedName("client.kg(B)Lkm;")
    public class294 method1243() {
        return Statics.field3130 == null ? null : Statics.field3130.field660;
    }

    @ObfuscatedName("l.kf(IIIZB)V")
    public static void method27(int arg0, int arg1, int arg2, boolean arg3) {
        class197 var4 = class197.method57(class193.field2310, field729.field1347);
        var4.field2371.method5164(arg1);
        var4.field2371.method5203(arg2);
        var4.field2371.method5217(arg0);
        var4.field2371.method5227(arg3 ? field764 : 0);
        field729.method2178(var4);
    }

    @ObfuscatedName("fc.kw(B)Z")
    public static boolean method3282() {
        return field851 >= 2;
    }

    @ObfuscatedName("dw.kr(II)V")
    public static void method2440(int arg0) {
        field757 = arg0;
    }

    @ObfuscatedName("cg.ko(B)V")
    public static void method1762() {
        field729.method2178(class197.method57(class193.field2321, field729.field1347));
        field757 = 0;
    }

    @ObfuscatedName("bd.kn(B)V")
    public static void method1123() {
        if (field757 == 1) {
            field726 = true;
        }
    }

    @ObfuscatedName("w.kc(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method186(String arg0) {
        class240[] var1 = class240.method249();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3128 != -1 && arg0.startsWith(Statics.method5531(var3.field3128))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3128).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("gy.kq(I)V")
    public static void method3460() {
        if (Statics.field1896 == null) {
            return;
        }
        field951 = field863;
        Statics.field1896.method4062();
        for (int var0 = 0; var0 < field798.length; var0++) {
            if (field798[var0] != null) {
                Statics.field1896.method4061((field798[var0].field1000 >> 7) + Statics.field1641, (field798[var0].field976 >> 7) + Statics.field132);
            }
        }
    }
}

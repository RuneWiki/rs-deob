package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class47 implements class317 {

    @ObfuscatedName("client.w")
    public static class159[] field769 = new class159[4];

    @ObfuscatedName("client.af")
    public static boolean field731 = true;

    @ObfuscatedName("client.bq")
    public static int field804 = 1;

    @ObfuscatedName("client.bx")
    public static int field621 = 0;

    @ObfuscatedName("client.bz")
    public static int field816 = 0;

    @ObfuscatedName("client.bc")
    public static boolean field623 = false;

    @ObfuscatedName("client.be")
    public static boolean field624 = false;

    @ObfuscatedName("client.by")
    public static int field625 = -1;

    @ObfuscatedName("client.bt")
    public static int field626 = -1;

    @ObfuscatedName("client.bg")
    public static boolean field627 = false;

    @ObfuscatedName("client.bm")
    public static int field628 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field884 = true;

    @ObfuscatedName("client.ca")
    public static int field631 = 0;

    @ObfuscatedName("client.cd")
    public static long field667 = -1L;

    @ObfuscatedName("client.cy")
    public static int field844 = -1;

    @ObfuscatedName("client.ct")
    public static int field634 = -1;

    @ObfuscatedName("client.ci")
    public static long field761 = -1L;

    @ObfuscatedName("client.cs")
    public static boolean field853 = true;

    @ObfuscatedName("client.co")
    public static boolean field729 = false;

    @ObfuscatedName("client.cj")
    public static int field638 = 0;

    @ObfuscatedName("client.cr")
    public static int field639 = 0;

    @ObfuscatedName("client.cl")
    public static int field763 = 0;

    @ObfuscatedName("client.cw")
    public static int field780 = 0;

    @ObfuscatedName("client.ck")
    public static int field829 = 0;

    @ObfuscatedName("client.cn")
    public static int field701 = 0;

    @ObfuscatedName("client.ch")
    public static int field644 = 0;

    @ObfuscatedName("client.du")
    public static int field645 = 0;

    @ObfuscatedName("client.db")
    public static int field646 = 0;

    @ObfuscatedName("client.dh")
    public static class108 field647 = class108.field1346;

    @ObfuscatedName("client.di")
    public static class108 field641 = class108.field1346;

    @ObfuscatedName("client.df")
    public static int field651 = 0;

    @ObfuscatedName("client.dz")
    public static int field650 = 0;

    @ObfuscatedName("client.dc")
    public static int field801 = 0;

    @ObfuscatedName("client.et")
    public static int field652 = 0;

    @ObfuscatedName("client.eb")
    public static int field653 = 0;

    @ObfuscatedName("client.ek")
    public static int field812 = 0;

    @ObfuscatedName("client.em")
    public static int field655 = 0;

    @ObfuscatedName("client.er")
    public static int field656 = 0;

    @ObfuscatedName("client.ey")
    public static class127 field657 = class127.field1476;

    @ObfuscatedName("client.ed")
    public static boolean field659 = false;

    @ObfuscatedName("client.eh")
    public static class86 field768 = new class86();

    @ObfuscatedName("client.ef")
    public class384 field661;

    @ObfuscatedName("client.fq")
    public class36 field662;

    @ObfuscatedName("client.fm")
    public static byte[] field663 = null;

    @ObfuscatedName("client.fo")
    public static class105[] field664 = new class105[32768];

    @ObfuscatedName("client.fc")
    public static int field665 = 0;

    @ObfuscatedName("client.fg")
    public static int[] field666 = new int[32768];

    @ObfuscatedName("client.fe")
    public static int field637 = 0;

    @ObfuscatedName("client.fs")
    public static int[] field764 = new int[250];

    @ObfuscatedName("client.ft")
    public static final class113 field669 = new class113();

    @ObfuscatedName("client.fb")
    public static int field670 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field671 = false;

    @ObfuscatedName("client.fi")
    public static boolean field672 = true;

    @ObfuscatedName("client.fr")
    public static class311 field673 = new class311();

    @ObfuscatedName("client.fd")
    public static HashMap field674 = new HashMap();

    @ObfuscatedName("client.ge")
    public static int field619 = 0;

    @ObfuscatedName("client.gg")
    public static int field790 = 1;

    @ObfuscatedName("client.gs")
    public static int field743 = 0;

    @ObfuscatedName("client.gu")
    public static int field678 = 1;

    @ObfuscatedName("client.gw")
    public static int field679 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field681 = false;

    @ObfuscatedName("client.gr")
    public static int[][][] field845 = new int[4][13][13];

    @ObfuscatedName("client.gy")
    public static final int[] field683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gj")
    public static int field684 = 0;

    @ObfuscatedName("client.hk")
    public static int field686 = 2301979;

    @ObfuscatedName("client.hx")
    public static int field687 = 5063219;

    @ObfuscatedName("client.hc")
    public static int field819 = 3353893;

    @ObfuscatedName("client.hm")
    public static int field689 = 7759444;

    @ObfuscatedName("client.hh")
    public static boolean field690 = false;

    @ObfuscatedName("client.hn")
    public static int field895 = 0;

    @ObfuscatedName("client.hs")
    public static int field692 = 128;

    @ObfuscatedName("client.hl")
    public static int field693 = 0;

    @ObfuscatedName("client.hq")
    public static int field897 = 0;

    @ObfuscatedName("client.hb")
    public static int field833 = 0;

    @ObfuscatedName("client.ho")
    public static int field696 = 0;

    @ObfuscatedName("client.hu")
    public static int field697 = 0;

    @ObfuscatedName("client.ie")
    public static int field698 = 0;

    @ObfuscatedName("client.il")
    public static int field699 = 50;

    @ObfuscatedName("client.it")
    public static String field777 = null;

    @ObfuscatedName("client.iy")
    public static int field700 = 0;

    @ObfuscatedName("client.iq")
    public static int field677 = 0;

    @ObfuscatedName("client.ir")
    public static int field858 = 0;

    @ObfuscatedName("client.ip")
    public static int field703 = 12;

    @ObfuscatedName("client.ih")
    public static int field704 = 6;

    @ObfuscatedName("client.in")
    public static int field705 = 0;

    @ObfuscatedName("client.iv")
    public static boolean field706 = false;

    @ObfuscatedName("client.ia")
    public static int field707 = 0;

    @ObfuscatedName("client.ii")
    public static boolean field708 = false;

    @ObfuscatedName("client.ic")
    public static int field709 = 0;

    @ObfuscatedName("client.iu")
    public static int field710 = 0;

    @ObfuscatedName("client.if")
    public static int field711 = 50;

    @ObfuscatedName("client.ik")
    public static int[] field648 = new int[field711];

    @ObfuscatedName("client.is")
    public static int[] field719 = new int[field711];

    @ObfuscatedName("client.ij")
    public static int[] field901 = new int[field711];

    @ObfuscatedName("client.ig")
    public static int[] field871 = new int[field711];

    @ObfuscatedName("client.im")
    public static int[] field716 = new int[field711];

    @ObfuscatedName("client.jc")
    public static int[] field675 = new int[field711];

    @ObfuscatedName("client.jj")
    public static int[] field718 = new int[field711];

    @ObfuscatedName("client.ji")
    public static String[] field737 = new String[field711];

    @ObfuscatedName("client.js")
    public static int[][] field827 = new int[104][104];

    @ObfuscatedName("client.jl")
    public static int field721 = 0;

    @ObfuscatedName("client.jg")
    public static int field722 = -1;

    @ObfuscatedName("client.jm")
    public static int field723 = -1;

    @ObfuscatedName("client.jd")
    public static int field724 = 0;

    @ObfuscatedName("client.jh")
    public static int field725 = 0;

    @ObfuscatedName("client.jo")
    public static int field736 = 0;

    @ObfuscatedName("client.ja")
    public static int field727 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field633 = true;

    @ObfuscatedName("client.jf")
    public static int field870 = 0;

    @ObfuscatedName("client.jq")
    public static int field730 = 0;

    @ObfuscatedName("client.jk")
    public static int field620 = 0;

    @ObfuscatedName("client.jr")
    public static int field744 = 0;

    @ObfuscatedName("client.je")
    public static int field733 = 0;

    @ObfuscatedName("client.jy")
    public static int field894 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field735 = false;

    @ObfuscatedName("client.jz")
    public static int field668 = 0;

    @ObfuscatedName("client.jt")
    public static int field630 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field875 = true;

    @ObfuscatedName("client.kc")
    public static class98[] field739 = new class98[2048];

    @ObfuscatedName("client.kx")
    public static int field720 = -1;

    @ObfuscatedName("client.kn")
    public static int field741 = 0;

    @ObfuscatedName("client.ka")
    public static boolean field742 = true;

    @ObfuscatedName("client.kd")
    public static int field685 = 0;

    @ObfuscatedName("client.kl")
    public static int field784 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field860 = new int[1000];

    @ObfuscatedName("client.kr")
    public static final int[] field715 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ko")
    public static String[] field747 = new String[8];

    @ObfuscatedName("client.kw")
    public static boolean[] field748 = new boolean[8];

    @ObfuscatedName("client.kt")
    public static int[] field749 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kp")
    public static int field836 = -1;

    @ObfuscatedName("client.kb")
    public static class295[][][] field751 = new class295[4][104][104];

    @ObfuscatedName("client.kh")
    public static class295 field752 = new class295();

    @ObfuscatedName("client.ky")
    public static class295 field753 = new class295();

    @ObfuscatedName("client.kf")
    public static class295 field717 = new class295();

    @ObfuscatedName("client.ki")
    public static int[] field755 = new int[25];

    @ObfuscatedName("client.kv")
    public static int[] field756 = new int[25];

    @ObfuscatedName("client.lg")
    public static int[] field788 = new int[25];

    @ObfuscatedName("client.ln")
    public static int field758 = 0;

    @ObfuscatedName("client.le")
    public static boolean field759 = false;

    @ObfuscatedName("client.lh")
    public static int field900 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field649 = new int[500];

    @ObfuscatedName("client.lf")
    public static int[] field762 = new int[500];

    @ObfuscatedName("client.lr")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.ld")
    public static int[] field857 = new int[500];

    @ObfuscatedName("client.lq")
    public static String[] field765 = new String[500];

    @ObfuscatedName("client.ly")
    public static String[] field766 = new String[500];

    @ObfuscatedName("client.lu")
    public static boolean[] field767 = new boolean[500];

    @ObfuscatedName("client.lc")
    public static boolean field835 = false;

    @ObfuscatedName("client.ll")
    public static boolean field640 = false;

    @ObfuscatedName("client.lx")
    public static boolean field770 = false;

    @ObfuscatedName("client.lv")
    public static boolean field771 = true;

    @ObfuscatedName("client.la")
    public static int field680 = -1;

    @ObfuscatedName("client.ls")
    public static int field893 = -1;

    @ObfuscatedName("client.mj")
    public static int field774 = 0;

    @ObfuscatedName("client.mw")
    public static int field694 = 50;

    @ObfuscatedName("client.mv")
    public static int field776 = 0;

    @ObfuscatedName("client.ma")
    public static boolean field778 = false;

    @ObfuscatedName("client.mu")
    public static int field779 = -1;

    @ObfuscatedName("client.ml")
    public static int field635 = -1;

    @ObfuscatedName("client.mm")
    public static String field781 = null;

    @ObfuscatedName("client.mh")
    public static String field782 = null;

    @ObfuscatedName("client.mi")
    public static int field783 = -1;

    @ObfuscatedName("client.my")
    public static class363 field796 = new class363(8);

    @ObfuscatedName("client.mz")
    public static int field785 = 0;

    @ObfuscatedName("client.mx")
    public static int field695 = -1;

    @ObfuscatedName("client.me")
    public static int field791 = 0;

    @ObfuscatedName("client.mk")
    public static int field892 = 0;

    @ObfuscatedName("client.mb")
    public static class248 field789 = null;

    @ObfuscatedName("client.mp")
    public static int field728 = 0;

    @ObfuscatedName("client.mo")
    public static int field682 = 0;

    @ObfuscatedName("client.mn")
    public static int field792 = 0;

    @ObfuscatedName("client.md")
    public static int field793 = -1;

    @ObfuscatedName("client.nv")
    public static boolean field794 = false;

    @ObfuscatedName("client.nb")
    public static class248 field795 = null;

    @ObfuscatedName("client.nc")
    public static class248 field842 = null;

    @ObfuscatedName("client.np")
    public static class248 field622 = null;

    @ObfuscatedName("client.na")
    public static int field798 = 0;

    @ObfuscatedName("client.nm")
    public static int field750 = 0;

    @ObfuscatedName("client.nz")
    public static class248 field800 = null;

    @ObfuscatedName("client.nq")
    public static boolean field822 = false;

    @ObfuscatedName("client.nj")
    public static int field802 = -1;

    @ObfuscatedName("client.nn")
    public static int field803 = -1;

    @ObfuscatedName("client.nk")
    public static boolean field732 = false;

    @ObfuscatedName("client.ne")
    public static int field805 = -1;

    @ObfuscatedName("client.nf")
    public static int field806 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field746 = false;

    @ObfuscatedName("client.ns")
    public static int field808 = 1;

    @ObfuscatedName("client.no")
    public static int[] field809 = new int[32];

    @ObfuscatedName("client.ni")
    public static int field810 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field811 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field712 = 0;

    @ObfuscatedName("client.nd")
    public static int[] field642 = new int[32];

    @ObfuscatedName("client.on")
    public static int field814 = 0;

    @ObfuscatedName("client.oo")
    public static int[] field815 = new int[32];

    @ObfuscatedName("client.og")
    public static int field760 = 0;

    @ObfuscatedName("client.om")
    public static int field817 = 0;

    @ObfuscatedName("client.oj")
    public static int field818 = 0;

    @ObfuscatedName("client.of")
    public static int field883 = 0;

    @ObfuscatedName("client.oa")
    public static int field820 = 0;

    @ObfuscatedName("client.ol")
    public static int field821 = 0;

    @ObfuscatedName("client.oy")
    public static int field828 = 0;

    @ObfuscatedName("client.od")
    public static int field823 = 0;

    @ObfuscatedName("client.or")
    public static int field824 = 0;

    @ObfuscatedName("client.oc")
    public static int field825 = 0;

    @ObfuscatedName("client.os")
    public static class295 field826 = new class295();

    @ObfuscatedName("client.oi")
    public static class295 field813 = new class295();

    @ObfuscatedName("client.op")
    public static class295 field861 = new class295();

    @ObfuscatedName("client.oh")
    public static class363 field867 = new class363(512);

    @ObfuscatedName("client.ok")
    public static int field714 = 0;

    @ObfuscatedName("client.ob")
    public static int field831 = -2;

    @ObfuscatedName("client.ov")
    public static boolean[] field832 = new boolean[100];

    @ObfuscatedName("client.oe")
    public static boolean[] field713 = new boolean[100];

    @ObfuscatedName("client.px")
    public static boolean[] field834 = new boolean[100];

    @ObfuscatedName("client.pj")
    public static int[] field772 = new int[100];

    @ObfuscatedName("client.pf")
    public static int[] field754 = new int[100];

    @ObfuscatedName("client.pr")
    public static int[] field837 = new int[100];

    @ObfuscatedName("client.po")
    public static int[] field838 = new int[100];

    @ObfuscatedName("client.ps")
    public static int field839 = 0;

    @ObfuscatedName("client.pu")
    public static long field840 = 0L;

    @ObfuscatedName("client.pa")
    public static boolean field841 = true;

    @ObfuscatedName("client.pv")
    public static int[] field726 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pk")
    public static int field843 = 0;

    @ObfuscatedName("client.pi")
    public static int field636 = 0;

    @ObfuscatedName("client.pq")
    public static String field643 = "";

    @ObfuscatedName("client.pn")
    public static long[] field846 = new long[100];

    @ObfuscatedName("client.pe")
    public static int field847 = 0;

    @ObfuscatedName("client.pz")
    public static int field848 = 0;

    @ObfuscatedName("client.pb")
    public static int[] field849 = new int[128];

    @ObfuscatedName("client.ph")
    public static int[] field787 = new int[128];

    @ObfuscatedName("client.qe")
    public static long field851 = -1L;

    @ObfuscatedName("client.qq")
    public static class12[] field852 = new class12[1];

    @ObfuscatedName("client.qi")
    public static class4[] field745 = new class4[1];

    @ObfuscatedName("client.qz")
    public static int field854 = -1;

    @ObfuscatedName("client.qh")
    public static int field855 = 0;

    @ObfuscatedName("client.qs")
    public static int[] field856 = new int[1000];

    @ObfuscatedName("client.qc")
    public static int[] field738 = new int[1000];

    @ObfuscatedName("client.qy")
    public static class397[] field797 = new class397[1000];

    @ObfuscatedName("client.qk")
    public static int field859 = 0;

    @ObfuscatedName("client.qp")
    public static int field676 = 0;

    @ObfuscatedName("client.qt")
    public static int field773 = 0;

    @ObfuscatedName("client.qb")
    public static int field862 = -1;

    @ObfuscatedName("client.qd")
    public static boolean field863 = false;

    @ObfuscatedName("client.rm")
    public static int field864 = 0;

    @ObfuscatedName("client.rd")
    public static int[] field688 = new int[50];

    @ObfuscatedName("client.rs")
    public static int[] field866 = new int[50];

    @ObfuscatedName("client.rk")
    public static int[] field830 = new int[50];

    @ObfuscatedName("client.rr")
    public static int[] field658 = new int[50];

    @ObfuscatedName("client.rw")
    public static class50[] field869 = new class50[50];

    @ObfuscatedName("client.rg")
    public static boolean field879 = false;

    @ObfuscatedName("client.rx")
    public static boolean[] field872 = new boolean[5];

    @ObfuscatedName("client.ry")
    public static int[] field873 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field874 = new int[5];

    @ObfuscatedName("client.rt")
    public static int[] field868 = new int[5];

    @ObfuscatedName("client.sa")
    public static int[] field876 = new int[5];

    @ObfuscatedName("client.sy")
    public static short field877 = 256;

    @ObfuscatedName("client.sv")
    public static short field878 = 205;

    @ObfuscatedName("client.sc")
    public static short field654 = 256;

    @ObfuscatedName("client.sl")
    public static short field880 = 320;

    @ObfuscatedName("client.sm")
    public static short field881 = 1;

    @ObfuscatedName("client.si")
    public static short field865 = 32767;

    @ObfuscatedName("client.so")
    public static short field882 = 1;

    @ObfuscatedName("client.sn")
    public static short field691 = 32767;

    @ObfuscatedName("client.sq")
    public static int field885 = 0;

    @ObfuscatedName("client.sk")
    public static int field886 = 0;

    @ObfuscatedName("client.sj")
    public static int field887 = 0;

    @ObfuscatedName("client.sf")
    public static int field888 = 0;

    @ObfuscatedName("client.st")
    public static int field889 = 0;

    @ObfuscatedName("client.sd")
    public static class246 field890 = new class246();

    @ObfuscatedName("client.sp")
    public static int field891 = -1;

    @ObfuscatedName("client.sh")
    public static int field903 = -1;

    @ObfuscatedName("client.ss")
    public static class356 field702 = new class354();

    @ObfuscatedName("client.su")
    public static class285[] field850 = new class285[8];

    @ObfuscatedName("client.sw")
    public static class75 field786 = new class75();

    @ObfuscatedName("client.tx")
    public static int field799 = -1;

    @ObfuscatedName("client.tv")
    public static ArrayList field757 = new ArrayList(10);

    @ObfuscatedName("client.tn")
    public static int field898 = 0;

    @ObfuscatedName("client.tp")
    public static int field899 = 0;

    @ObfuscatedName("client.ty")
    public static final class74 field734 = new class74();

    @ObfuscatedName("client.tk")
    public static int[] field740 = new int[50];

    @ObfuscatedName("client.ta")
    public static int[] field632 = new int[50];

    @ObfuscatedName("ny.ez(I)Lme;")
    public static class358 method6121() {
        return Statics.field989;
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method439() {
    }

    public final void init() {
        if (!this.method455()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field672 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class106.field1330)) {
                            field623 = true;
                        } else {
                            field623 = false;
                        }
                        break;
                    case 4:
                        if (field625 == -1) {
                            field625 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field621 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3594 = class291.method4689(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field2085 = class264.method999(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class106.field1330)) {
                        }
                        break;
                    case 9:
                        Statics.field1398 = var2;
                        break;
                    case 10:
                        class265[] var3 = new class265[] { class265.field3206, class265.field3207, class265.field3208, class265.field3209, class265.field3211, class265.field3210 };
                        Statics.field2115 = (class265) class290.method2391(var3, Integer.parseInt(var2));
                        if (Statics.field2115 == class265.field3210) {
                            Statics.field1311 = class366.field4086;
                        } else {
                            Statics.field1311 = class366.field4090;
                        }
                        break;
                    case 12:
                        field804 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1000 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field816 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1937 = var2;
                }
            }
        }
        class199.field2326 = false;
        field624 = false;
        Statics.field896 = this.getCodeBase().getHost();
        String var4 = Statics.field2085.field3198;
        byte var5 = 0;
        try {
            Statics.field194 = 21;
            Statics.field34 = var5;
            try {
                Statics.field192 = System.getProperty("os.name");
            } catch (Exception var30) {
                Statics.field192 = "Unknown";
            }
            Statics.field970 = Statics.field192.toLowerCase();
            try {
                Statics.field1499 = System.getProperty("user.home");
                if (Statics.field1499 != null) {
                    Statics.field1499 = Statics.field1499 + "/";
                }
            } catch (Exception var29) {
            }
            try {
                if (Statics.field970.startsWith("win")) {
                    if (Statics.field1499 == null) {
                        Statics.field1499 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1499 == null) {
                    Statics.field1499 = System.getenv("HOME");
                }
                if (Statics.field1499 != null) {
                    Statics.field1499 = Statics.field1499 + "/";
                }
            } catch (Exception var28) {
            }
            if (Statics.field1499 == null) {
                Statics.field1499 = "~/";
            }
            Statics.field1123 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1499, "/tmp/", "" };
            Statics.field1495 = new String[] { ".jagex_cache_" + Statics.field34, ".file_store_" + Statics.field34 };
            label174: for (int var9 = 0; var9 < 4; var9++) {
                Statics.field2086 = class130.method3786("oldschool", var4, var9);
                if (!Statics.field2086.exists()) {
                    Statics.field2086.mkdirs();
                }
                File[] var10 = Statics.field2086.listFiles();
                if (var10 == null) {
                    break;
                }
                File[] var11 = var10;
                int var12 = 0;
                while (true) {
                    if (var12 >= var11.length) {
                        break label174;
                    }
                    File var13 = var11[var12];
                    boolean var16;
                    try {
                        RandomAccessFile var14 = new RandomAccessFile(var13, "rw");
                        int var15 = var14.read();
                        var14.seek(0L);
                        var14.write(var15);
                        var14.seek(0L);
                        var14.close();
                        var16 = true;
                    } catch (Exception var27) {
                        var16 = false;
                    }
                    if (!var16) {
                        break;
                    }
                    var12++;
                }
            }
            class132.method199(Statics.field2086);
            try {
                File var18 = new File(Statics.field1499, "random.dat");
                if (var18.exists()) {
                    class130.field1492 = new class369(new class368(var18, "rw", 25L), 24, 0);
                } else {
                    label153: for (int var19 = 0; var19 < Statics.field1495.length; var19++) {
                        for (int var20 = 0; var20 < Statics.field1123.length; var20++) {
                            File var21 = new File(Statics.field1123[var20] + Statics.field1495[var19] + File.separatorChar + "random.dat");
                            if (var21.exists()) {
                                class130.field1492 = new class369(new class368(var21, "rw", 25L), 24, 0);
                                break label153;
                            }
                        }
                    }
                }
                if (class130.field1492 == null) {
                    RandomAccessFile var22 = new RandomAccessFile(var18, "rw");
                    int var23 = var22.read();
                    var22.seek(0L);
                    var22.write(var23);
                    var22.seek(0L);
                    var22.close();
                    class130.field1492 = new class369(new class368(var18, "rw", 25L), 24, 0);
                }
            } catch (IOException var31) {
            }
            class130.field1498 = new class369(new class368(class132.method2612("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class130.field1496 = new class369(new class368(class132.method2612("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field4114 = new class369[Statics.field194];
            for (int var25 = 0; var25 < Statics.field194; var25++) {
                Statics.field4114[var25] = new class369(new class368(class132.method2612("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var32) {
            class407.method5131((String) null, var32);
        }
        Statics.field11 = this;
        Statics.field4284 = field625;
        if (field626 == -1) {
            field626 = 0;
        }
        this.method413(765, 503, 197);
    }

    @ObfuscatedName("client.a(I)V")
    public final void method422() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4126 = null;
            Statics.field2146 = null;
            Statics.field1113 = (byte[][][]) null;
        } else {
            Statics.field4126 = var1;
            Statics.field2146 = new int[var1.length];
            Statics.field1113 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4126.length; var3++) {
                Statics.field1113[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field1441 = field816 == 0 ? 43594 : field804 + 40000;
        Statics.field1173 = field816 == 0 ? 443 : field804 + 50000;
        Statics.field4223 = Statics.field1441;
        Statics.field1582 = class247.field2946;
        Statics.field569 = class247.field2945;
        Statics.field2518 = class247.field2944;
        Statics.field3176 = class247.field2947;
        Statics.field3561 = new class114();
        this.method408();
        this.method409();
        Statics.field1063 = this.method483();
        Statics.field2108 = new class334(255, class130.field1498, class130.field1496, 500000);
        Statics.field40 = class103.method2412();
        this.method406();
        class45.method2265(this, Statics.field1546);
        if (field816 != 0) {
            field729 = true;
        }
        method4421(Statics.field40.field1316);
        Statics.field288 = new class77(Statics.field1311);
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method427() {
        field631++;
        this.method1070();
        Statics.method259();
        Statics.method3797();
        method4062();
        class39 var1 = class39.field280;
        synchronized (class39.field280) {
            class39.field279++;
            class39.field277 = class39.field278;
            class39.field272 = 0;
            class39.field275 = 0;
            Arrays.fill(class39.field265, false);
            Arrays.fill(class39.field266, false);
            if (class39.field269 < 0) {
                Arrays.fill(class39.field259, false);
                class39.field269 = class39.field268;
            } else {
                while (class39.field269 != class39.field268) {
                    int var2 = class39.field284[class39.field268];
                    class39.field268 = class39.field268 + 1 & 0x7F;
                    if (var2 < 0) {
                        int var3 = ~var2;
                        if (class39.field259[var3]) {
                            class39.field259[var3] = false;
                            class39.field266[var3] = true;
                            class39.field274[class39.field275] = var3;
                            class39.field275++;
                        }
                    } else {
                        if (!class39.field259[var2] && class39.field272 < class39.field258.length - 1) {
                            class39.field265[var2] = true;
                            class39.field258[++class39.field272 - 1] = var2;
                        }
                        class39.field259[var2] = true;
                    }
                }
            }
            if (class39.field272 > 0) {
                class39.field279 = 0;
            }
            class39.field278 = class39.field256;
        }
        class48.method243();
        if (Statics.field1063 != null) {
            int var5 = Statics.field1063.method271();
            field825 = var5;
        }
        if (field628 == 0) {
            method245();
            class47.method200();
        } else if (field628 == 5) {
            class84.method185(this);
            method245();
            class47.method200();
        } else if (field628 == 10 || field628 == 11) {
            class84.method185(this);
        } else if (field628 == 20) {
            class84.method185(this);
            this.method1053();
        } else if (field628 == 25) {
            method1839(false);
            field619 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field1431.length; var7++) {
                if (Statics.field1420[var7] != -1 && Statics.field1431[var7] == null) {
                    Statics.field1431[var7] = Statics.field37.method4504(Statics.field1420[var7], 0);
                    if (Statics.field1431[var7] == null) {
                        var6 = false;
                        field619++;
                    }
                }
                if (Statics.field3667[var7] != -1 && Statics.field3170[var7] == null) {
                    Statics.field3170[var7] = Statics.field37.method4505(Statics.field3667[var7], 0, Statics.field55[var7]);
                    if (Statics.field3170[var7] == null) {
                        var6 = false;
                        field619++;
                    }
                }
            }
            if (var6) {
                field743 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field1431.length; var9++) {
                    byte[] var10 = Statics.field3170[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field1433[var9] >> 8) * 64 - Statics.field127;
                        int var12 = (Statics.field1433[var9] & 0xFF) * 64 - Statics.field2092;
                        if (field681) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= class90.method993(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field679 != 0) {
                        method2509(class269.field3241 + class106.field1336 + class106.field1333 + 100 + "%" + class106.field1334, true);
                    }
                    method4062();
                    Statics.field292.method3578();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field769[var13].method2894();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class90.field1097[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method4062();
                    class90.field1105 = 99;
                    Statics.field4099 = new byte[4][104][104];
                    Statics.field1112 = new byte[4][104][104];
                    Statics.field187 = new byte[4][104][104];
                    Statics.field133 = new byte[4][104][104];
                    Statics.field1102 = new int[4][105][105];
                    Statics.field308 = new byte[4][105][105];
                    Statics.field1329 = new int[105][105];
                    Statics.field2814 = new int[104];
                    Statics.field1100 = new int[104];
                    Statics.field3117 = new int[104];
                    Statics.field2059 = new int[104];
                    Statics.field1096 = new int[104];
                    int var17 = Statics.field1431.length;
                    for (class78 var18 = (class78) class78.field939.method4721(); var18 != null; var18 = (class78) class78.field939.method4723()) {
                        if (var18.field935 != null) {
                            Statics.field1442.method620(var18.field935);
                            var18.field935 = null;
                        }
                        if (var18.field943 != null) {
                            Statics.field1442.method620(var18.field943);
                            var18.field943 = null;
                        }
                    }
                    class78.field939.method4715();
                    method1839(true);
                    if (!field681) {
                        int var19 = 0;
                        label493: while (true) {
                            if (var19 >= var17) {
                                for (int var33 = 0; var33 < var17; var33++) {
                                    int var34 = (Statics.field1433[var33] >> 8) * 64 - Statics.field127;
                                    int var35 = (Statics.field1433[var33] & 0xFF) * 64 - Statics.field2092;
                                    byte[] var36 = Statics.field1431[var33];
                                    if (var36 == null && Statics.field1920 < 800) {
                                        method4062();
                                        class90.method2242(var34, var35, 64, 64);
                                    }
                                }
                                method1839(true);
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var17) {
                                        break label493;
                                    }
                                    byte[] var38 = Statics.field3170[var37];
                                    if (var38 != null) {
                                        int var39 = (Statics.field1433[var37] >> 8) * 64 - Statics.field127;
                                        int var40 = (Statics.field1433[var37] & 0xFF) * 64 - Statics.field2092;
                                        method4062();
                                        class199 var41 = Statics.field292;
                                        class159[] var42 = field769;
                                        class384 var43 = new class384(var38);
                                        int var44 = -1;
                                        while (true) {
                                            int var45 = var43.method5912();
                                            if (var45 == 0) {
                                                break;
                                            }
                                            var44 += var45;
                                            int var46 = 0;
                                            while (true) {
                                                int var47 = var43.method5911();
                                                if (var47 == 0) {
                                                    break;
                                                }
                                                var46 += var47 - 1;
                                                int var48 = var46 & 0x3F;
                                                int var49 = var46 >> 6 & 0x3F;
                                                int var50 = var46 >> 12;
                                                int var51 = var43.method5902();
                                                int var52 = var51 >> 2;
                                                int var53 = var51 & 0x3;
                                                int var54 = var39 + var49;
                                                int var55 = var40 + var48;
                                                if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                                    int var56 = var50;
                                                    if ((class90.field1097[1][var54][var55] & 0x2) == 2) {
                                                        var56 = var50 - 1;
                                                    }
                                                    class159 var57 = null;
                                                    if (var56 >= 0) {
                                                        var57 = var42[var56];
                                                    }
                                                    class90.method1995(var50, var54, var55, var44, var53, var52, var41, var57);
                                                }
                                            }
                                        }
                                    }
                                    var37++;
                                }
                            }
                            int var20 = (Statics.field1433[var19] >> 8) * 64 - Statics.field127;
                            int var21 = (Statics.field1433[var19] & 0xFF) * 64 - Statics.field2092;
                            byte[] var22 = Statics.field1431[var19];
                            if (var22 != null) {
                                method4062();
                                int var23 = Statics.field112 * 8 - 48;
                                int var24 = Statics.field1920 * 8 - 48;
                                class159[] var25 = field769;
                                int var26 = 0;
                                label490: while (true) {
                                    if (var26 >= 4) {
                                        class384 var29 = new class384(var22);
                                        int var30 = 0;
                                        while (true) {
                                            if (var30 >= 4) {
                                                break label490;
                                            }
                                            for (int var31 = 0; var31 < 64; var31++) {
                                                for (int var32 = 0; var32 < 64; var32++) {
                                                    class90.method4393(var29, var30, var20 + var31, var21 + var32, var23, var24, 0);
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                    for (int var27 = 0; var27 < 64; var27++) {
                                        for (int var28 = 0; var28 < 64; var28++) {
                                            if (var20 + var27 > 0 && var20 + var27 < 103 && var21 + var28 > 0 && var21 + var28 < 103) {
                                                var25[var26].field1912[var20 + var27][var21 + var28] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var26++;
                                }
                            }
                            var19++;
                        }
                    }
                    if (field681) {
                        int var58 = 0;
                        label426: while (true) {
                            if (var58 >= 4) {
                                for (int var76 = 0; var76 < 13; var76++) {
                                    for (int var77 = 0; var77 < 13; var77++) {
                                        int var78 = field845[0][var76][var77];
                                        if (var78 == -1) {
                                            class90.method2242(var76 * 8, var77 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1839(true);
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= 4) {
                                        break label426;
                                    }
                                    method4062();
                                    for (int var80 = 0; var80 < 13; var80++) {
                                        for (int var81 = 0; var81 < 13; var81++) {
                                            int var82 = field845[var79][var80][var81];
                                            if (var82 != -1) {
                                                int var83 = var82 >> 24 & 0x3;
                                                int var84 = var82 >> 1 & 0x3;
                                                int var85 = var82 >> 14 & 0x3FF;
                                                int var86 = var82 >> 3 & 0x7FF;
                                                int var87 = (var85 / 8 << 8) + var86 / 8;
                                                for (int var88 = 0; var88 < Statics.field1433.length; var88++) {
                                                    if (Statics.field1433[var88] == var87 && Statics.field3170[var88] != null) {
                                                        class90.method196(Statics.field3170[var88], var79, var80 * 8, var81 * 8, var83, (var85 & 0x7) * 8, (var86 & 0x7) * 8, var84, Statics.field292, field769);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var79++;
                                }
                            }
                            method4062();
                            for (int var59 = 0; var59 < 13; var59++) {
                                for (int var60 = 0; var60 < 13; var60++) {
                                    boolean var61 = false;
                                    int var62 = field845[var58][var59][var60];
                                    if (var62 != -1) {
                                        int var63 = var62 >> 24 & 0x3;
                                        int var64 = var62 >> 1 & 0x3;
                                        int var65 = var62 >> 14 & 0x3FF;
                                        int var66 = var62 >> 3 & 0x7FF;
                                        int var67 = (var65 / 8 << 8) + var66 / 8;
                                        for (int var68 = 0; var68 < Statics.field1433.length; var68++) {
                                            if (Statics.field1433[var68] == var67 && Statics.field1431[var68] != null) {
                                                class90.method2302(Statics.field1431[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field769);
                                                var61 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var61) {
                                        int var69 = var58;
                                        int var70 = var59 * 8;
                                        int var71 = var60 * 8;
                                        for (int var72 = 0; var72 < 8; var72++) {
                                            for (int var73 = 0; var73 < 8; var73++) {
                                                class90.field1099[var69][var70 + var72][var71 + var73] = 0;
                                            }
                                        }
                                        if (var70 > 0) {
                                            for (int var74 = 1; var74 < 8; var74++) {
                                                class90.field1099[var69][var70][var71 + var74] = class90.field1099[var69][var70 - 1][var71 + var74];
                                            }
                                        }
                                        if (var71 > 0) {
                                            for (int var75 = 1; var75 < 8; var75++) {
                                                class90.field1099[var69][var70 + var75][var71] = class90.field1099[var69][var70 + var75][var71 - 1];
                                            }
                                        }
                                        if (var70 > 0 && class90.field1099[var69][var70 - 1][var71] != 0) {
                                            class90.field1099[var69][var70][var71] = class90.field1099[var69][var70 - 1][var71];
                                        } else if (var71 > 0 && class90.field1099[var69][var70][var71 - 1] != 0) {
                                            class90.field1099[var69][var70][var71] = class90.field1099[var69][var70][var71 - 1];
                                        } else if (var70 > 0 && var71 > 0 && class90.field1099[var69][var70 - 1][var71 - 1] != 0) {
                                            class90.field1099[var69][var70][var71] = class90.field1099[var69][var70 - 1][var71 - 1];
                                        }
                                    }
                                }
                            }
                            var58++;
                        }
                    }
                    method1839(true);
                    method4062();
                    class90.method996(Statics.field292, field769);
                    method1839(true);
                    int var89 = class90.field1105;
                    if (var89 > Statics.field438) {
                        var89 = Statics.field438;
                    }
                    if (var89 < Statics.field438 - 1) {
                        int var90 = Statics.field438 - 1;
                    }
                    if (field624) {
                        Statics.field292.method3594(class90.field1105);
                    } else {
                        Statics.field292.method3594(0);
                    }
                    for (int var91 = 0; var91 < 104; var91++) {
                        for (int var92 = 0; var92 < 104; var92++) {
                            method202(var91, var92);
                        }
                    }
                    method4062();
                    method1757();
                    class155.field1760.method3989();
                    if (Statics.field11.method438()) {
                        class228 var93 = class228.method1927(class226.field2575, field669.field1410);
                        var93.field2700.method5883(1057001181);
                        field669.method2200(var93);
                    }
                    if (!field681) {
                        int var94 = (Statics.field112 - 6) / 8;
                        int var95 = (Statics.field112 + 6) / 8;
                        int var96 = (Statics.field1920 - 6) / 8;
                        int var97 = (Statics.field1920 + 6) / 8;
                        for (int var98 = var94 - 1; var98 <= var95 + 1; var98++) {
                            for (int var99 = var96 - 1; var99 <= var97 + 1; var99++) {
                                if (var98 < var94 || var98 > var95 || var99 < var96 || var99 > var97) {
                                    Statics.field37.method4526("m" + var98 + "_" + var99);
                                    Statics.field37.method4526("l" + var98 + "_" + var99);
                                }
                            }
                        }
                    }
                    method1814(30);
                    method4062();
                    Statics.field4099 = (byte[][][]) null;
                    Statics.field1112 = (byte[][][]) null;
                    Statics.field187 = (byte[][][]) null;
                    Statics.field133 = (byte[][][]) null;
                    Statics.field1102 = (int[][][]) null;
                    Statics.field308 = (byte[][][]) null;
                    Statics.field1329 = (int[][]) null;
                    Statics.field2814 = null;
                    Statics.field1100 = null;
                    Statics.field3117 = null;
                    Statics.field2059 = null;
                    Statics.field1096 = null;
                    class228 var100 = class228.method1927(class226.field2586, field669.field1410);
                    field669.method2200(var100);
                    class47.method200();
                } else {
                    field679 = 2;
                }
            } else {
                field679 = 1;
            }
        }
        if (field628 == 30) {
            this.method1054();
        } else if (field628 == 40 || field628 == 45) {
            this.method1053();
        }
    }

    @ObfuscatedName("client.ak(ZB)V")
    public final void method431(boolean arg0) {
        boolean var2 = class234.method2935();
        if (var2 && field863 && Statics.field442 != null) {
            Statics.field442.method702();
        }
        if ((field628 == 10 || field628 == 20 || field628 == 30) && field840 != 0L && class381.method4000() > field840) {
            method4421(method4981());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field832[var3] = true;
            }
        }
        if (field628 == 0) {
            this.method433(class84.field1010, class84.field1026, arg0);
        } else if (field628 == 5) {
            class84.method4500(Statics.field3767, Statics.field1459, Statics.field3858);
        } else if (field628 == 10 || field628 == 11) {
            class84.method4500(Statics.field3767, Statics.field1459, Statics.field3858);
        } else if (field628 == 20) {
            class84.method4500(Statics.field3767, Statics.field1459, Statics.field3858);
        } else if (field628 == 25) {
            if (field679 == 1) {
                if (field619 > field790) {
                    field790 = field619;
                }
                int var4 = (field790 * 50 - field619 * 50) / field790;
                method2509(class269.field3241 + class106.field1336 + class106.field1333 + var4 + "%" + class106.field1334, false);
            } else if (field679 == 2) {
                if (field743 > field678) {
                    field678 = field743;
                }
                int var5 = (field678 * 50 - field743 * 50) / field678 + 50;
                method2509(class269.field3241 + class106.field1336 + class106.field1333 + var5 + "%" + class106.field1334, false);
            } else {
                method2509(class269.field3241, false);
            }
        } else if (field628 == 30) {
            this.method1375();
        } else if (field628 == 40) {
            method2509(class269.field3242 + class106.field1336 + class269.field3433, false);
        } else if (field628 == 45) {
            method2509(class269.field3496, false);
        }
        if (field628 == 30 && field839 == 0 && !arg0 && !field841) {
            for (int var6 = 0; var6 < field714; var6++) {
                if (field713[var6]) {
                    Statics.field2061.method379(field772[var6], field754[var6], field837[var6], field838[var6]);
                    field713[var6] = false;
                }
            }
        } else if (field628 > 0) {
            Statics.field2061.method380(0, 0);
            for (int var7 = 0; var7 < field714; var7++) {
                field713[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method531() {
        if (Statics.field170.method2125()) {
            Statics.field170.method2134();
        }
        if (Statics.field1418 != null) {
            Statics.field1418.field1172 = false;
        }
        Statics.field1418 = null;
        field669.method2203();
        if (class39.field280 != null) {
            class39 var1 = class39.field280;
            synchronized (class39.field280) {
                class39.field280 = null;
            }
        }
        if (class48.field354 != null) {
            class48 var3 = class48.field354;
            synchronized (class48.field354) {
                class48.field354 = null;
            }
        }
        Statics.field1063 = null;
        if (Statics.field442 != null) {
            Statics.field442.method674();
        }
        if (Statics.field1424 != null) {
            Statics.field1424.method674();
        }
        if (Statics.field3617 != null) {
            Statics.field3617.method2364();
        }
        class273.method3950();
        if (Statics.field3561 != null) {
            Statics.field3561.method2222();
            Statics.field3561 = null;
        }
        try {
            class130.field1498.method5747();
            for (int var5 = 0; var5 < Statics.field194; var5++) {
                Statics.field4114[var5].method5747();
            }
            class130.field1496.method5747();
            class130.field1492.method5747();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("cp.fq(IB)V")
    public static void method1814(int arg0) {
        if (field628 == arg0) {
            return;
        }
        if (field628 == 0) {
            Statics.field11.method509();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field653 = 0;
            field812 = 0;
            field655 = 0;
            field673.method5079(arg0);
            if (arg0 != 20) {
                method177(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3888 != null) {
            Statics.field3888.method2364();
            Statics.field3888 = null;
        }
        if (field628 == 25) {
            field679 = 0;
            field619 = 0;
            field790 = 1;
            field743 = 0;
            field678 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class84.method5428(Statics.field1500, Statics.field3706, true, 0);
        } else if (arg0 == 20) {
            class84.method5428(Statics.field1500, Statics.field3706, true, field628 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class84.method5428(Statics.field1500, Statics.field3706, false, 4);
        } else if (Statics.field4140) {
            Statics.field2930 = null;
            Statics.field3676 = null;
            Statics.field1004 = null;
            Statics.field3919 = null;
            Statics.field4141 = null;
            Statics.field1393 = null;
            Statics.field3626 = null;
            Statics.field1003 = null;
            Statics.field2129 = null;
            Statics.field1386 = null;
            Statics.field4079 = null;
            Statics.field78 = null;
            Statics.field3113 = null;
            Statics.field245 = null;
            Statics.field1205.method2030();
            class234.method682(2);
            class277.method2087(true);
            Statics.field4140 = false;
        }
        field628 = arg0;
    }

    @ObfuscatedName("client.fm(B)V")
    public void method1070() {
        if (field628 == 1000) {
            return;
        }
        long var1 = class381.method4000();
        int var3 = (int) (var1 - Statics.field3605);
        Statics.field3605 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class277.field3615 += var3;
        boolean var4;
        if (class277.field3614 == 0 && class277.field3609 == 0 && class277.field3612 == 0 && class277.field3604 == 0) {
            var4 = true;
        } else if (Statics.field3617 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class277.field3615 > 30000) {
                        throw new IOException();
                    }
                    while (class277.field3609 < 200 && class277.field3604 > 0) {
                        class275 var5 = (class275) class277.field3606.method5693();
                        class384 var6 = new class384(4);
                        var6.method5880(1);
                        var6.method5882((int) var5.field3937);
                        Statics.field3617.method2370(var6.field4160, 0, 4);
                        class277.field3621.method5692(var5, var5.field3937);
                        class277.field3604--;
                        class277.field3609++;
                    }
                    while (class277.field3614 < 200 && class277.field3612 > 0) {
                        class275 var7 = (class275) class277.field3610.method4706();
                        class384 var8 = new class384(4);
                        var8.method5880(0);
                        var8.method5882((int) var7.field3937);
                        Statics.field3617.method2370(var8.field4160, 0, 4);
                        var7.method5404();
                        class277.field3613.method5692(var7, var7.field3937);
                        class277.field3612--;
                        class277.field3614++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3617.method2366();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class277.field3615 = 0;
                        byte var11 = 0;
                        if (Statics.field236 == null) {
                            var11 = 8;
                        } else if (class277.field3616 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class277.field3607.field4161;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3617.method2368(class277.field3607.field4160, class277.field3607.field4161, var12);
                            if (class277.field3619 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class277.field3607.field4160[class277.field3607.field4161 + var13] ^= class277.field3619;
                                }
                            }
                            class277.field3607.field4161 += var12;
                            if (class277.field3607.field4161 < var11) {
                                break;
                            }
                            if (Statics.field236 == null) {
                                class277.field3607.field4161 = 0;
                                int var14 = class277.field3607.method5902();
                                int var15 = class277.field3607.method5899();
                                int var16 = class277.field3607.method5902();
                                int var17 = class277.field3607.method5965();
                                long var18 = (long) ((var14 << 16) + var15);
                                class275 var20 = (class275) class277.field3621.method5691(var18);
                                Statics.field3223 = true;
                                if (var20 == null) {
                                    var20 = (class275) class277.field3613.method5691(var18);
                                    Statics.field3223 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field236 = var20;
                                Statics.field3136 = new class384(var17 + var21 + Statics.field236.field3576);
                                Statics.field3136.method5880(var16);
                                Statics.field3136.method5883(var17);
                                class277.field3616 = 8;
                                class277.field3607.field4161 = 0;
                            } else if (class277.field3616 == 0) {
                                if (class277.field3607.field4160[0] == -1) {
                                    class277.field3616 = 1;
                                    class277.field3607.field4161 = 0;
                                } else {
                                    Statics.field236 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3136.field4160.length - Statics.field236.field3576;
                            int var23 = 512 - class277.field3616;
                            if (var23 > var22 - Statics.field3136.field4161) {
                                var23 = var22 - Statics.field3136.field4161;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3617.method2368(Statics.field3136.field4160, Statics.field3136.field4161, var23);
                            if (class277.field3619 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3136.field4160[Statics.field3136.field4161 + var24] ^= class277.field3619;
                                }
                            }
                            Statics.field3136.field4161 += var23;
                            class277.field3616 += var23;
                            if (Statics.field3136.field4161 == var22) {
                                if (Statics.field236.field3937 == 16711935L) {
                                    Statics.field1466 = Statics.field3136;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class274 var26 = class277.field3618[var25];
                                        if (var26 != null) {
                                            Statics.field1466.field4161 = var25 * 8 + 5;
                                            int var27 = Statics.field1466.method5965();
                                            int var28 = Statics.field1466.method5965();
                                            var26.method4462(var27, var28);
                                        }
                                    }
                                } else {
                                    class277.field3608.reset();
                                    class277.field3608.update(Statics.field3136.field4160, 0, var22);
                                    int var29 = (int) class277.field3608.getValue();
                                    if (Statics.field236.field3575 != var29) {
                                        try {
                                            Statics.field3617.method2364();
                                        } catch (Exception var35) {
                                        }
                                        class277.field3620++;
                                        Statics.field3617 = null;
                                        class277.field3619 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class277.field3620 = 0;
                                    class277.field3603 = 0;
                                    Statics.field236.field3577.method4486((int) (Statics.field236.field3937 & 0xFFFFL), Statics.field3136.field4160, (Statics.field236.field3937 & 0xFF0000L) == 16711680L, Statics.field3223);
                                }
                                Statics.field236.method5407();
                                if (Statics.field3223) {
                                    class277.field3609--;
                                } else {
                                    class277.field3614--;
                                }
                                class277.field3616 = 0;
                                Statics.field236 = null;
                                Statics.field3136 = null;
                            } else {
                                if (class277.field3616 != 512) {
                                    break;
                                }
                                class277.field3616 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3617.method2364();
                } catch (Exception var34) {
                }
                class277.field3603++;
                Statics.field3617 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1051();
        }
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1051() {
        if (class277.field3620 >= 4) {
            this.method435("js5crc");
            field628 = 1000;
            return;
        }
        if (class277.field3603 >= 4) {
            if (field628 <= 5) {
                this.method435("js5io");
                field628 = 1000;
                return;
            }
            field801 = 3000;
            class277.field3603 = 3;
        }
        if (--field801 + 1 > 0) {
            return;
        }
        try {
            if (field650 == 0) {
                Statics.field3850 = Statics.field345.method2327(Statics.field896, Statics.field4223);
                field650++;
            }
            if (field650 == 1) {
                if (Statics.field3850.field1533 == 2) {
                    this.method1052(-1);
                    return;
                }
                if (Statics.field3850.field1533 == 1) {
                    field650++;
                }
            }
            if (field650 == 2) {
                if (field672) {
                    Statics.field2531 = class330.method713((Socket) Statics.field3850.field1532, 40000, 5000);
                } else {
                    Statics.field2531 = new class133((Socket) Statics.field3850.field1532, Statics.field345, 5000);
                }
                class384 var1 = new class384(5);
                var1.method5880(15);
                var1.method5883(197);
                Statics.field2531.method2370(var1.field4160, 0, 5);
                field650++;
                Statics.field1587 = class381.method4000();
            }
            if (field650 == 3) {
                if (Statics.field2531.method2366() > 0 || !field672 && field628 <= 5) {
                    int var2 = Statics.field2531.method2363();
                    if (var2 != 0) {
                        this.method1052(var2);
                        return;
                    }
                    field650++;
                } else if (class381.method4000() - Statics.field1587 > 30000L) {
                    this.method1052(-2);
                    return;
                }
            }
            if (field650 == 4) {
                class277.method2615(Statics.field2531, field628 > 20);
                Statics.field3850 = null;
                Statics.field2531 = null;
                field650 = 0;
                field652 = 0;
            }
        } catch (IOException var4) {
            this.method1052(-3);
        }
    }

    @ObfuscatedName("client.fv(II)V")
    public void method1052(int arg0) {
        Statics.field3850 = null;
        Statics.field2531 = null;
        field650 = 0;
        if (Statics.field4223 == Statics.field1441) {
            Statics.field4223 = Statics.field1173;
        } else {
            Statics.field4223 = Statics.field1441;
        }
        field652++;
        if (field652 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field628 <= 5) {
                this.method435("js5connect_full");
                field628 = 1000;
            } else {
                field801 = 3000;
            }
        } else if (field652 >= 2 && arg0 == 6) {
            this.method435("js5connect_outofdate");
            field628 = 1000;
        } else if (field652 >= 4) {
            if (field628 <= 5) {
                this.method435("js5connect");
                field628 = 1000;
            } else {
                field801 = 3000;
            }
        }
    }

    @ObfuscatedName("ip.fx(Ljf;Ljava/lang/String;S)V")
    public static void method4283(class274 arg0, String arg1) {
        class92 var2 = new class92(arg0, arg1);
        field757.add(var2);
        field899 += var2.field1120;
    }

    @ObfuscatedName("mb.fo(I)I")
    public static int method5646() {
        if (field757 == null || field898 >= field757.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field898; var1++) {
            var0 += ((class92) field757.get(var1)).field1119;
        }
        return var0 * 10000 / field899;
    }

    @ObfuscatedName("ea.fc(II)I")
    public static int method2389(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("i.fg(III)V")
    public static void method155(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method2389(var4);
            int var6 = class197.field2271[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field880 - field654) * var7 / 100 + field654;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class199.method3602(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ab.fe(B)V")
    public static void method245() {
        if (field651 == 0) {
            Statics.field292 = new class199(4, 104, 104, class90.field1099);
            for (int var0 = 0; var0 < 4; var0++) {
                field769[var0] = new class159(104, 104);
            }
            Statics.field567 = new class397(512, 512);
            class84.field1026 = class269.field3244;
            class84.field1010 = 5;
            field651 = 20;
        } else if (field651 == 20) {
            class84.field1026 = class269.field3502;
            class84.field1010 = 10;
            field651 = 30;
        } else if (field651 == 30) {
            Statics.field30 = method2240(0, false, true, true);
            Statics.field1599 = method2240(1, false, true, true);
            Statics.field1068 = method2240(2, true, false, true);
            Statics.field148 = method2240(3, false, true, true);
            Statics.field212 = method2240(4, false, true, true);
            Statics.field37 = method2240(5, true, true, true);
            Statics.field1081 = method2240(6, true, true, true);
            Statics.field398 = method2240(7, false, true, true);
            Statics.field3706 = method2240(8, false, true, true);
            Statics.field135 = method2240(9, false, true, true);
            Statics.field1500 = method2240(10, false, true, true);
            Statics.field1932 = method2240(11, false, true, true);
            Statics.field1388 = method2240(12, false, true, true);
            Statics.field615 = method2240(13, true, false, true);
            Statics.field1415 = method2240(14, false, true, true);
            Statics.field3755 = method2240(15, false, true, true);
            Statics.field76 = method2240(17, true, true, true);
            Statics.field49 = method2240(18, false, true, true);
            Statics.field2150 = method2240(19, false, true, true);
            Statics.field2101 = method2240(20, false, true, true);
            class84.field1026 = class269.field3246;
            class84.field1010 = 20;
            field651 = 40;
        } else if (field651 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field30.method4460() * 4 / 100;
            int var3 = var2 + Statics.field1599.method4460() * 4 / 100;
            int var4 = var3 + Statics.field1068.method4460() * 2 / 100;
            int var5 = var4 + Statics.field148.method4460() * 2 / 100;
            int var6 = var5 + Statics.field212.method4460() * 6 / 100;
            int var7 = var6 + Statics.field37.method4460() * 4 / 100;
            int var8 = var7 + Statics.field1081.method4460() * 2 / 100;
            int var9 = var8 + Statics.field398.method4460() * 56 / 100;
            int var10 = var9 + Statics.field3706.method4460() * 2 / 100;
            int var11 = var10 + Statics.field135.method4460() * 2 / 100;
            int var12 = var11 + Statics.field1500.method4460() * 2 / 100;
            int var13 = var12 + Statics.field1932.method4460() * 2 / 100;
            int var14 = var13 + Statics.field1388.method4460() * 2 / 100;
            int var15 = var14 + Statics.field615.method4460() * 2 / 100;
            int var16 = var15 + Statics.field1415.method4460() * 2 / 100;
            int var17 = var16 + Statics.field3755.method4460() * 2 / 100;
            int var18 = var17 + Statics.field2150.method4460() / 100;
            int var19 = var18 + Statics.field49.method4460() / 100;
            int var20 = var19 + Statics.field2101.method4460() / 100;
            int var21 = var20 + (Statics.field76.method4481() && Statics.field76.method4543() ? 1 : 0);
            if (var21 == 100) {
                method4283(Statics.field30, "Animations");
                method4283(Statics.field1599, "Skeletons");
                method4283(Statics.field212, "Sound FX");
                method4283(Statics.field37, "Maps");
                method4283(Statics.field1081, "Music Tracks");
                method4283(Statics.field398, "Models");
                method4283(Statics.field3706, "Sprites");
                method4283(Statics.field1932, "Music Jingles");
                method4283(Statics.field1415, "Music Samples");
                method4283(Statics.field3755, "Music Patches");
                method4283(Statics.field2150, "World Map");
                method4283(Statics.field49, "World Map Geography");
                method4283(Statics.field2101, "World Map Ground");
                Statics.field23 = new class337();
                Statics.field23.method5328(Statics.field76);
                class84.field1026 = class269.field3248;
                class84.field1010 = 30;
                field651 = 45;
            } else {
                if (var21 != 0) {
                    class84.field1026 = class269.field3480 + var21 + "%";
                }
                class84.field1010 = 30;
            }
        } else if (field651 == 45) {
            boolean var22 = !field624;
            Statics.field3922 = 22050;
            Statics.field411 = var22;
            Statics.field4221 = 2;
            class235 var23 = new class235();
            var23.method4072(9, 128);
            Statics.field442 = Statics.method1926(Statics.field345, 0, 22050);
            Statics.field442.method672(var23);
            class234.method3402(Statics.field3755, Statics.field1415, Statics.field212, var23);
            Statics.field1424 = Statics.method1926(Statics.field345, 1, 2048);
            Statics.field1442 = new class49();
            Statics.field1424.method672(Statics.field1442);
            Statics.field2142 = new class66(22050, Statics.field3922);
            class84.field1026 = class269.field3249;
            class84.field1010 = 35;
            field651 = 50;
            Statics.field3803 = new class359(Statics.field3706, Statics.field615);
        } else if (field651 == 50) {
            int var24 = Statics.method5651().length;
            class359 var25 = Statics.field3803;
            class360[] var26 = new class360[] { class360.field4060, class360.field4064, class360.field4061, class360.field4058, class360.field4059, class360.field4056 };
            field674 = var25.method5642(var26);
            if (field674.size() < var24) {
                class84.field1026 = class269.field3250 + field674.size() * 100 / var24 + "%";
                class84.field1010 = 40;
            } else {
                Statics.field1459 = (class301) field674.get(class360.field4059);
                Statics.field3858 = (class301) field674.get(class360.field4056);
                Statics.field3767 = (class301) field674.get(class360.field4058);
                Statics.field105 = field702.method5417();
                class84.field1026 = class269.field3251;
                class84.field1010 = 40;
                field651 = 60;
            }
        } else if (field651 == 60) {
            class274 var27 = Statics.field1500;
            class274 var28 = Statics.field3706;
            int var29 = 0;
            if (var27.method4566("title.jpg", "")) {
                var29++;
            }
            if (var28.method4566("logo", "")) {
                var29++;
            }
            if (var28.method4566("logo_deadman_mode", "")) {
                var29++;
            }
            if (var28.method4566("logo_seasonal_mode", "")) {
                var29++;
            }
            if (var28.method4566("titlebox", "")) {
                var29++;
            }
            if (var28.method4566("titlebutton", "")) {
                var29++;
            }
            if (var28.method4566("runes", "")) {
                var29++;
            }
            if (var28.method4566("title_mute", "")) {
                var29++;
            }
            if (var28.method4566("options_radio_buttons,0", "")) {
                var29++;
            }
            if (var28.method4566("options_radio_buttons,2", "")) {
                var29++;
            }
            if (var28.method4566("options_radio_buttons,4", "")) {
                var29++;
            }
            if (var28.method4566("options_radio_buttons,6", "")) {
                var29++;
            }
            var28.method4566("sl_back", "");
            var28.method4566("sl_flags", "");
            var28.method4566("sl_arrows", "");
            var28.method4566("sl_stars", "");
            var28.method4566("sl_button", "");
            byte var32 = 12;
            if (var29 < var32) {
                class84.field1026 = class269.field3261 + var29 * 100 / var32 + "%";
                class84.field1010 = 50;
            } else {
                class84.field1026 = class269.field3442;
                class84.field1010 = 50;
                method1814(5);
                field651 = 70;
            }
        } else if (field651 == 70) {
            if (Statics.field1068.method4543()) {
                class157.method3792(Statics.field1068);
                class274 var34 = Statics.field1068;
                Statics.field1704 = var34;
                class274 var35 = Statics.field1068;
                class274 var36 = Statics.field398;
                Statics.field1470 = var35;
                Statics.field1598 = var36;
                Statics.field1355 = Statics.field1470.method4514(3);
                class155.method1999(Statics.field1068, Statics.field398, field624);
                class274 var37 = Statics.field1068;
                class274 var38 = Statics.field398;
                Statics.field1652 = var37;
                Statics.field1673 = var38;
                class274 var39 = Statics.field1068;
                Statics.field1728 = var39;
                class274 var40 = Statics.field1068;
                class274 var41 = Statics.field398;
                boolean var42 = field623;
                class301 var43 = Statics.field1459;
                Statics.field1811 = var40;
                Statics.field443 = var41;
                Statics.field1849 = var42;
                Statics.field1813 = Statics.field1811.method4514(10);
                Statics.field1817 = var43;
                class274 var44 = Statics.field1068;
                class274 var45 = Statics.field30;
                class274 var46 = Statics.field1599;
                Statics.field1891 = var44;
                Statics.field1878 = var45;
                Statics.field1879 = var46;
                class149.method2756(Statics.field1068, Statics.field398);
                class274 var47 = Statics.field1068;
                Statics.field1715 = var47;
                class139.method2309(Statics.field1068);
                class248.method2560(Statics.field148, Statics.field398, Statics.field3706, Statics.field615);
                class274 var48 = Statics.field1068;
                Statics.field1548 = var48;
                class145.method69(Statics.field1068);
                class274 var49 = Statics.field1068;
                Statics.field1583 = var49;
                class274 var50 = Statics.field1068;
                Statics.field1717 = var50;
                Statics.field216 = new class371(Statics.field2115, 54, Statics.field3594, Statics.field1068);
                Statics.field214 = new class371(Statics.field2115, 47, Statics.field3594, Statics.field1068);
                Statics.field170 = new class111();
                class154.method2046(Statics.field1068, Statics.field3706, Statics.field615);
                class143.method154(Statics.field1068, Statics.field3706);
                class274 var51 = Statics.field1068;
                class274 var52 = Statics.field3706;
                Statics.field2931 = var52;
                if (var51.method4543()) {
                    Statics.field1558 = var51.method4514(35);
                    Statics.field1560 = new class140[Statics.field1558];
                    for (int var53 = 0; var53 < Statics.field1558; var53++) {
                        byte[] var54 = var51.method4504(35, var53);
                        Statics.field1560[var53] = new class140(var53);
                        if (var54 != null) {
                            Statics.field1560[var53].method2422(new class384(var54));
                            Statics.field1560[var53].method2421();
                        }
                    }
                }
                class84.field1026 = class269.field3255;
                class84.field1010 = 60;
                field651 = 80;
            } else {
                class84.field1026 = class269.field3254 + Statics.field1068.method4469() + "%";
                class84.field1010 = 60;
            }
        } else if (field651 == 80) {
            int var55 = 0;
            if (Statics.field3827 == null) {
                Statics.field3827 = class398.method3491(Statics.field3706, Statics.field23.field3899, 0);
            } else {
                var55++;
            }
            if (Statics.field186 == null) {
                Statics.field186 = class398.method3491(Statics.field3706, Statics.field23.field3893, 0);
            } else {
                var55++;
            }
            if (Statics.field2203 == null) {
                class274 var56 = Statics.field3706;
                int var57 = Statics.field23.field3895;
                class396[] var58;
                if (class398.method1034(var56, var57, 0)) {
                    class396[] var59 = new class396[Statics.field4266];
                    for (int var60 = 0; var60 < Statics.field4266; var60++) {
                        class396 var61 = var59[var60] = new class396();
                        var61.field4252 = Statics.field4267;
                        var61.field4253 = Statics.field2933;
                        var61.field4248 = Statics.field4268[var60];
                        var61.field4251 = Statics.field208[var60];
                        var61.field4246 = Statics.field301[var60];
                        var61.field4249 = Statics.field1538[var60];
                        var61.field4250 = Statics.field4269;
                        var61.field4247 = Statics.field1480[var60];
                    }
                    class398.method5320();
                    var58 = var59;
                } else {
                    var58 = null;
                }
                Statics.field2203 = var58;
            } else {
                var55++;
            }
            if (Statics.field587 == null) {
                class274 var63 = Statics.field3706;
                int var64 = Statics.field23.field3896;
                class397[] var65;
                if (class398.method1034(var63, var64, 0)) {
                    class397[] var66 = new class397[Statics.field4266];
                    int var67 = 0;
                    while (true) {
                        if (var67 >= Statics.field4266) {
                            class398.method5320();
                            var65 = var66;
                            break;
                        }
                        class397 var68 = var66[var67] = new class397();
                        var68.field4259 = Statics.field4267;
                        var68.field4260 = Statics.field2933;
                        var68.field4257 = Statics.field4268[var67];
                        var68.field4258 = Statics.field208[var67];
                        var68.field4262 = Statics.field301[var67];
                        var68.field4254 = Statics.field1538[var67];
                        int var69 = var68.field4262 * var68.field4254;
                        byte[] var70 = Statics.field1480[var67];
                        var68.field4263 = new int[var69];
                        for (int var71 = 0; var71 < var69; var71++) {
                            var68.field4263[var71] = Statics.field4269[var70[var71] & 0xFF];
                        }
                        var67++;
                    }
                } else {
                    var65 = null;
                }
                Statics.field587 = var65;
            } else {
                var55++;
            }
            if (Statics.field171 == null) {
                class274 var73 = Statics.field3706;
                int var74 = Statics.field23.field3904;
                class397[] var75;
                if (class398.method1034(var73, var74, 0)) {
                    class397[] var76 = new class397[Statics.field4266];
                    int var77 = 0;
                    while (true) {
                        if (var77 >= Statics.field4266) {
                            class398.method5320();
                            var75 = var76;
                            break;
                        }
                        class397 var78 = var76[var77] = new class397();
                        var78.field4259 = Statics.field4267;
                        var78.field4260 = Statics.field2933;
                        var78.field4257 = Statics.field4268[var77];
                        var78.field4258 = Statics.field208[var77];
                        var78.field4262 = Statics.field301[var77];
                        var78.field4254 = Statics.field1538[var77];
                        int var79 = var78.field4262 * var78.field4254;
                        byte[] var80 = Statics.field1480[var77];
                        var78.field4263 = new int[var79];
                        for (int var81 = 0; var81 < var79; var81++) {
                            var78.field4263[var81] = Statics.field4269[var80[var81] & 0xFF];
                        }
                        var77++;
                    }
                } else {
                    var75 = null;
                }
                Statics.field171 = var75;
            } else {
                var55++;
            }
            if (Statics.field3172 == null) {
                class274 var83 = Statics.field3706;
                int var84 = Statics.field23.field3903;
                class397[] var85;
                if (class398.method1034(var83, var84, 0)) {
                    class397[] var86 = new class397[Statics.field4266];
                    int var87 = 0;
                    while (true) {
                        if (var87 >= Statics.field4266) {
                            class398.method5320();
                            var85 = var86;
                            break;
                        }
                        class397 var88 = var86[var87] = new class397();
                        var88.field4259 = Statics.field4267;
                        var88.field4260 = Statics.field2933;
                        var88.field4257 = Statics.field4268[var87];
                        var88.field4258 = Statics.field208[var87];
                        var88.field4262 = Statics.field301[var87];
                        var88.field4254 = Statics.field1538[var87];
                        int var89 = var88.field4262 * var88.field4254;
                        byte[] var90 = Statics.field1480[var87];
                        var88.field4263 = new int[var89];
                        for (int var91 = 0; var91 < var89; var91++) {
                            var88.field4263[var91] = Statics.field4269[var90[var91] & 0xFF];
                        }
                        var87++;
                    }
                } else {
                    var85 = null;
                }
                Statics.field3172 = var85;
            } else {
                var55++;
            }
            if (Statics.field1465 == null) {
                class274 var93 = Statics.field3706;
                int var94 = Statics.field23.field3898;
                class397[] var95;
                if (class398.method1034(var93, var94, 0)) {
                    class397[] var96 = new class397[Statics.field4266];
                    int var97 = 0;
                    while (true) {
                        if (var97 >= Statics.field4266) {
                            class398.method5320();
                            var95 = var96;
                            break;
                        }
                        class397 var98 = var96[var97] = new class397();
                        var98.field4259 = Statics.field4267;
                        var98.field4260 = Statics.field2933;
                        var98.field4257 = Statics.field4268[var97];
                        var98.field4258 = Statics.field208[var97];
                        var98.field4262 = Statics.field301[var97];
                        var98.field4254 = Statics.field1538[var97];
                        int var99 = var98.field4262 * var98.field4254;
                        byte[] var100 = Statics.field1480[var97];
                        var98.field4263 = new int[var99];
                        for (int var101 = 0; var101 < var99; var101++) {
                            var98.field4263[var101] = Statics.field4269[var100[var101] & 0xFF];
                        }
                        var97++;
                    }
                } else {
                    var95 = null;
                }
                Statics.field1465 = var95;
            } else {
                var55++;
            }
            if (Statics.field1646 == null) {
                class274 var103 = Statics.field3706;
                int var104 = Statics.field23.field3900;
                class397[] var105;
                if (class398.method1034(var103, var104, 0)) {
                    class397[] var106 = new class397[Statics.field4266];
                    int var107 = 0;
                    while (true) {
                        if (var107 >= Statics.field4266) {
                            class398.method5320();
                            var105 = var106;
                            break;
                        }
                        class397 var108 = var106[var107] = new class397();
                        var108.field4259 = Statics.field4267;
                        var108.field4260 = Statics.field2933;
                        var108.field4257 = Statics.field4268[var107];
                        var108.field4258 = Statics.field208[var107];
                        var108.field4262 = Statics.field301[var107];
                        var108.field4254 = Statics.field1538[var107];
                        int var109 = var108.field4262 * var108.field4254;
                        byte[] var110 = Statics.field1480[var107];
                        var108.field4263 = new int[var109];
                        for (int var111 = 0; var111 < var109; var111++) {
                            var108.field4263[var111] = Statics.field4269[var110[var111] & 0xFF];
                        }
                        var107++;
                    }
                } else {
                    var105 = null;
                }
                Statics.field1646 = var105;
            } else {
                var55++;
            }
            if (Statics.field2025 == null) {
                class274 var113 = Statics.field3706;
                int var114 = Statics.field23.field3901;
                class397[] var115;
                if (class398.method1034(var113, var114, 0)) {
                    class397[] var116 = new class397[Statics.field4266];
                    int var117 = 0;
                    while (true) {
                        if (var117 >= Statics.field4266) {
                            class398.method5320();
                            var115 = var116;
                            break;
                        }
                        class397 var118 = var116[var117] = new class397();
                        var118.field4259 = Statics.field4267;
                        var118.field4260 = Statics.field2933;
                        var118.field4257 = Statics.field4268[var117];
                        var118.field4258 = Statics.field208[var117];
                        var118.field4262 = Statics.field301[var117];
                        var118.field4254 = Statics.field1538[var117];
                        int var119 = var118.field4262 * var118.field4254;
                        byte[] var120 = Statics.field1480[var117];
                        var118.field4263 = new int[var119];
                        for (int var121 = 0; var121 < var119; var121++) {
                            var118.field4263[var121] = Statics.field4269[var120[var121] & 0xFF];
                        }
                        var117++;
                    }
                } else {
                    var115 = null;
                }
                Statics.field2025 = var115;
            } else {
                var55++;
            }
            if (Statics.field775 == null) {
                class274 var123 = Statics.field3706;
                int var124 = Statics.field23.field3902;
                class396[] var125;
                if (class398.method1034(var123, var124, 0)) {
                    class396[] var126 = new class396[Statics.field4266];
                    for (int var127 = 0; var127 < Statics.field4266; var127++) {
                        class396 var128 = var126[var127] = new class396();
                        var128.field4252 = Statics.field4267;
                        var128.field4253 = Statics.field2933;
                        var128.field4248 = Statics.field4268[var127];
                        var128.field4251 = Statics.field208[var127];
                        var128.field4246 = Statics.field301[var127];
                        var128.field4249 = Statics.field1538[var127];
                        var128.field4250 = Statics.field4269;
                        var128.field4247 = Statics.field1480[var127];
                    }
                    class398.method5320();
                    var125 = var126;
                } else {
                    var125 = null;
                }
                Statics.field775 = var125;
            } else {
                var55++;
            }
            if (Statics.field241 == null) {
                class274 var130 = Statics.field3706;
                int var131 = Statics.field23.field3897;
                class396[] var132;
                if (class398.method1034(var130, var131, 0)) {
                    class396[] var133 = new class396[Statics.field4266];
                    for (int var134 = 0; var134 < Statics.field4266; var134++) {
                        class396 var135 = var133[var134] = new class396();
                        var135.field4252 = Statics.field4267;
                        var135.field4253 = Statics.field2933;
                        var135.field4248 = Statics.field4268[var134];
                        var135.field4251 = Statics.field208[var134];
                        var135.field4246 = Statics.field301[var134];
                        var135.field4249 = Statics.field1538[var134];
                        var135.field4250 = Statics.field4269;
                        var135.field4247 = Statics.field1480[var134];
                    }
                    class398.method5320();
                    var132 = var133;
                } else {
                    var132 = null;
                }
                Statics.field241 = var132;
            } else {
                var55++;
            }
            if (var55 < 11) {
                class84.field1026 = class269.field3243 + var55 * 100 / 12 + "%";
                class84.field1010 = 70;
            } else {
                Statics.field3734 = Statics.field241;
                Statics.field186.method6278();
                int var137 = (int) (Math.random() * 21.0D) - 10;
                int var138 = (int) (Math.random() * 21.0D) - 10;
                int var139 = (int) (Math.random() * 21.0D) - 10;
                int var140 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2203[0].method6262(var137 + var140, var138 + var140, var139 + var140);
                class84.field1026 = class269.field3257;
                class84.field1010 = 70;
                field651 = 90;
            }
        } else if (field651 == 90) {
            if (Statics.field135.method4543()) {
                Statics.field2358 = new class204(Statics.field135, Statics.field3706, 20, Statics.field40.field1313, field624 ? 64 : 128);
                class197.method3497(Statics.field2358);
                class197.method3531(Statics.field40.field1313);
                field651 = 100;
            } else {
                class84.field1026 = class269.field3258 + "0%";
                class84.field1010 = 90;
            }
        } else if (field651 == 100) {
            int var141 = Statics.field2358.method3801();
            if (var141 < 100) {
                class84.field1026 = class269.field3258 + var141 + "%";
                class84.field1010 = 90;
            } else {
                class84.field1026 = class269.field3259;
                class84.field1010 = 90;
                field651 = 110;
            }
        } else if (field651 == 110) {
            Statics.field1418 = new class97();
            Statics.field345.method2330(Statics.field1418, 10);
            class84.field1026 = class269.field3260;
            class84.field1010 = 92;
            field651 = 120;
        } else if (field651 == 120) {
            if (Statics.field1500.method4566("huffman", "")) {
                class250 var142 = new class250(Statics.field1500.method4567("huffman", ""));
                class251.method3354(var142);
                class84.field1026 = class269.field3318;
                class84.field1010 = 94;
                field651 = 130;
            } else {
                class84.field1026 = class269.field3358 + "%";
                class84.field1010 = 94;
            }
        } else if (field651 == 130) {
            if (!Statics.field148.method4543()) {
                class84.field1026 = class269.field3497 + Statics.field148.method4469() * 4 / 5 + "%";
                class84.field1010 = 96;
            } else if (!Statics.field1388.method4543()) {
                class84.field1026 = class269.field3497 + (80 + Statics.field1388.method4469() / 6) + "%";
                class84.field1010 = 96;
            } else if (Statics.field615.method4543()) {
                class84.field1026 = class269.field3314;
                class84.field1010 = 98;
                field651 = 140;
            } else {
                class84.field1026 = class269.field3497 + (96 + Statics.field615.method4469() / 50) + "%";
                class84.field1010 = 96;
            }
        } else if (field651 == 140) {
            class84.field1010 = 100;
            if (Statics.field2150.method4525(class186.field2132.field2134)) {
                if (Statics.field989 == null) {
                    Statics.field989 = new class358();
                    Statics.field989.method5447(Statics.field2150, Statics.field49, Statics.field2101, Statics.field3767, field674, Statics.field2203);
                }
                class84.field1026 = class269.field3266;
                field651 = 150;
            } else {
                class84.field1026 = class269.field3396 + Statics.field2150.method4527(class186.field2132.field2134) / 10 + "%";
            }
        } else if (field651 == 150) {
            method1814(10);
        }
    }

    @ObfuscatedName("dc.fs(IZZZS)Ljf;")
    public static class274 method2240(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class334 var4 = null;
        if (class130.field1498 != null) {
            var4 = new class334(arg0, class130.field1498, Statics.field4114[arg0], 1000000);
        }
        return new class274(var4, Statics.field2108, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fa(S)V")
    public final void method1053() {
        class330 var1 = field669.method2206();
        class383 var2 = field669.field1405;
        try {
            if (field653 == 0) {
                if (Statics.field108 == null && (field768.method1819() || field812 > 250)) {
                    Statics.field108 = field768.method1823();
                    field768.method1818();
                    field768 = null;
                }
                if (Statics.field108 != null) {
                    if (var1 != null) {
                        var1.method2364();
                        var1 = null;
                    }
                    Statics.field3602 = null;
                    field671 = false;
                    field812 = 0;
                    field653 = 1;
                }
            }
            if (field653 == 1) {
                if (Statics.field3602 == null) {
                    Statics.field3602 = Statics.field345.method2327(Statics.field896, Statics.field4223);
                }
                if (Statics.field3602.field1533 == 2) {
                    throw new IOException();
                }
                if (Statics.field3602.field1533 == 1) {
                    if (field672) {
                        var1 = class330.method713((Socket) Statics.field3602.field1532, 40000, 5000);
                    } else {
                        var1 = new class133((Socket) Statics.field3602.field1532, Statics.field345, 5000);
                    }
                    field669.method2199(var1);
                    Statics.field3602 = null;
                    field653 = 2;
                }
            }
            if (field653 == 2) {
                field669.method2197();
                class228 var3 = class228.method3263();
                var3.field2698 = null;
                var3.field2697 = 0;
                var3.field2700 = new class383(5000);
                var3.field2700.method5880(class230.field2807.field2806);
                field669.method2200(var3);
                field669.method2201();
                var2.field4161 = 0;
                field653 = 3;
            }
            if (field653 == 3) {
                if (Statics.field442 != null) {
                    Statics.field442.method678();
                }
                if (Statics.field1424 != null) {
                    Statics.field1424.method678();
                }
                boolean var6 = true;
                if (field672 && !var1.method2384(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2363();
                    if (Statics.field442 != null) {
                        Statics.field442.method678();
                    }
                    if (Statics.field1424 != null) {
                        Statics.field1424.method678();
                    }
                    if (var7 != 0) {
                        method4420(var7);
                        return;
                    }
                    var2.field4161 = 0;
                    field653 = 4;
                }
            }
            if (field653 == 4) {
                if (var2.field4161 < 8) {
                    int var8 = var1.method2366();
                    if (var8 > 8 - var2.field4161) {
                        var8 = 8 - var2.field4161;
                    }
                    if (var8 > 0) {
                        var1.method2368(var2.field4160, var2.field4161, var8);
                        var2.field4161 += var8;
                    }
                }
                if (var2.field4161 == 8) {
                    var2.field4161 = 0;
                    Statics.field1930 = var2.method5896();
                    field653 = 5;
                }
            }
            if (field653 == 5) {
                field669.field1405.field4161 = 0;
                field669.method2197();
                class383 var9 = new class383(500);
                int[] var10 = new int[] { Statics.field108.nextInt(), Statics.field108.nextInt(), Statics.field108.nextInt(), Statics.field108.nextInt() };
                var9.field4161 = 0;
                var9.method5880(1);
                var9.method5883(var10[0]);
                var9.method5883(var10[1]);
                var9.method5883(var10[2]);
                var9.method5883(var10[3]);
                var9.method5885(Statics.field1930);
                if (field628 == 40) {
                    var9.method5883(Statics.field439[0]);
                    var9.method5883(Statics.field439[1]);
                    var9.method5883(Statics.field439[2]);
                    var9.method5883(Statics.field439[3]);
                } else {
                    var9.method5880(field657.method238());
                    switch(field657.field1477) {
                        case 0:
                            var9.field4161 += 4;
                            break;
                        case 1:
                        case 2:
                            var9.method5882(Statics.field3);
                            var9.field4161++;
                            break;
                        case 3:
                            var9.method5883((Integer) Statics.field40.field1323.get(class305.method2308(class84.field1019)));
                    }
                    var9.method5880(class388.field4212.method238());
                    var9.method6068(class84.field1028);
                }
                var9.method5920(class83.field1001, class83.field997);
                Statics.field439 = var10;
                class228 var11 = class228.method3263();
                var11.field2698 = null;
                var11.field2697 = 0;
                var11.field2700 = new class383(5000);
                var11.field2700.field4161 = 0;
                if (field628 == 40) {
                    var11.field2700.method5880(class230.field2804.field2806);
                } else {
                    var11.field2700.method5880(class230.field2803.field2806);
                }
                var11.field2700.method5881(0);
                int var14 = var11.field2700.field4161;
                var11.field2700.method5883(197);
                var11.field2700.method5883(1);
                var11.field2700.method5880(field625);
                var11.field2700.method5880(field626);
                var11.field2700.method5878(var9.field4160, 0, var9.field4161);
                int var15 = var11.field2700.field4161;
                var11.field2700.method6068(class84.field1019);
                var11.field2700.method5880((field841 ? 1 : 0) << 1 | (field624 ? 1 : 0));
                var11.field2700.method5881(Statics.field1350);
                var11.field2700.method5881(Statics.field5);
                class383 var16 = var11.field2700;
                if (field663 == null) {
                    byte[] var17 = class130.method5434();
                    var16.method5878(var17, 0, var17.length);
                } else {
                    var16.method5878(field663, 0, field663.length);
                }
                var11.field2700.method6068(Statics.field1398);
                var11.field2700.method5883(Statics.field1000);
                class384 var18 = new class384(Statics.field105.method5433());
                Statics.field105.method5430(var18);
                var11.field2700.method5878(var18.field4160, 0, var18.field4160.length);
                var11.field2700.method5880(field625);
                var11.field2700.method5883(0);
                var11.field2700.method5943(Statics.field1599.field3599);
                var11.field2700.method5942(Statics.field1388.field3599);
                var11.field2700.method5883(Statics.field37.field3599);
                var11.field2700.method5942(0);
                var11.field2700.method5941(Statics.field212.field3599);
                var11.field2700.method5942(Statics.field398.field3599);
                var11.field2700.method5942(Statics.field1932.field3599);
                var11.field2700.method5941(Statics.field148.field3599);
                var11.field2700.method5943(Statics.field1500.field3599);
                var11.field2700.method5883(Statics.field30.field3599);
                var11.field2700.method5942(Statics.field1415.field3599);
                var11.field2700.method5943(Statics.field1081.field3599);
                var11.field2700.method5883(Statics.field1068.field3599);
                var11.field2700.method5883(Statics.field2150.field3599);
                var11.field2700.method5883(Statics.field49.field3599);
                var11.field2700.method5943(Statics.field76.field3599);
                var11.field2700.method5941(Statics.field615.field3599);
                var11.field2700.method5942(Statics.field135.field3599);
                var11.field2700.method5941(Statics.field3755.field3599);
                var11.field2700.method5883(Statics.field3706.field3599);
                var11.field2700.method5943(Statics.field2101.field3599);
                var11.field2700.method5918(var10, var15, var11.field2700.field4161);
                var11.field2700.method5939(var11.field2700.field4161 - var14);
                field669.method2200(var11);
                field669.method2201();
                field669.field1410 = new class400(var10);
                int[] var19 = new int[4];
                for (int var20 = 0; var20 < 4; var20++) {
                    var19[var20] = var10[var20] + 50;
                }
                var2.method5843(var19);
                field653 = 6;
            }
            if (field653 == 6 && var1.method2366() > 0) {
                int var21 = var1.method2363();
                if (var21 == 21 && field628 == 20) {
                    field653 = 12;
                } else if (var21 == 2) {
                    field653 = 14;
                } else if (var21 == 15 && field628 == 40) {
                    field669.field1407 = -1;
                    field653 = 19;
                } else if (var21 == 64) {
                    field653 = 10;
                } else if (var21 == 23 && field655 < 1) {
                    field655++;
                    field653 = 0;
                } else if (var21 == 29) {
                    field653 = 17;
                } else if (var21 == 69) {
                    field653 = 7;
                } else {
                    method4420(var21);
                    return;
                }
            }
            if (field653 == 7 && var1.method2366() >= 2) {
                var1.method2368(var2.field4160, 0, 2);
                var2.field4161 = 0;
                Statics.field31 = var2.method5899();
                field653 = 8;
            }
            if (field653 == 8 && var1.method2366() >= Statics.field31) {
                var2.field4161 = 0;
                var1.method2368(var2.field4160, var2.field4161, Statics.field31);
                class35[] var22 = new class35[] { class35.field233 };
                class35 var23 = var22[var2.method5902()];
                try {
                    switch(var23.field234) {
                        case 0:
                            class29 var24 = new class29();
                            this.field662 = new class36(var2, var24);
                            field653 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var49) {
                    method4420(22);
                    return;
                }
            }
            if (field653 == 9 && this.field662.method257()) {
                this.field661 = this.field662.method253();
                this.field662.method247();
                this.field662 = null;
                if (this.field661 == null) {
                    method4420(22);
                    return;
                }
                field669.method2197();
                class228 var27 = class228.method1901();
                var27.field2700.method5880(class230.field2805.field2806);
                var27.field2700.method5881(this.field661.field4161);
                var27.field2700.method5891(this.field661);
                field669.method2200(var27);
                field669.method2201();
                this.field661 = null;
                field653 = 6;
            }
            if (field653 == 10 && var1.method2366() > 0) {
                Statics.field2153 = var1.method2363();
                field653 = 11;
            }
            if (field653 == 11 && var1.method2366() >= Statics.field2153) {
                var1.method2368(var2.field4160, 0, Statics.field2153);
                var2.field4161 = 0;
                field653 = 6;
            }
            if (field653 == 12 && var1.method2366() > 0) {
                field656 = (var1.method2363() + 3) * 60;
                field653 = 13;
            }
            if (field653 == 13) {
                field812 = 0;
                Statics.method2923(class269.field3521, class269.field3273, field656 / 60 + class269.field3340);
                if (--field656 <= 0) {
                    field653 = 0;
                }
            } else {
                if (field653 == 14 && var1.method2366() >= 1) {
                    Statics.field2039 = var1.method2363();
                    field653 = 15;
                }
                if (field653 == 15 && var1.method2366() >= Statics.field2039) {
                    boolean var28 = var1.method2363() == 1;
                    var1.method2368(var2.field4160, 0, 4);
                    var2.field4161 = 0;
                    boolean var29 = false;
                    if (var28) {
                        int var30 = var2.method5874() << 24;
                        int var31 = var30 | var2.method5874() << 16;
                        int var32 = var31 | var2.method5874() << 8;
                        int var33 = var32 | var2.method5874();
                        int var34 = class305.method2308(class84.field1019);
                        if (Statics.field40.field1323.size() >= 10 && !Statics.field40.field1323.containsKey(var34)) {
                            Iterator var35 = Statics.field40.field1323.entrySet().iterator();
                            var35.next();
                            var35.remove();
                        }
                        Statics.field40.field1323.put(var34, var33);
                    }
                    if (field659) {
                        Statics.field40.field1319 = class84.field1019;
                    } else {
                        Statics.field40.field1319 = null;
                    }
                    class103.method2003();
                    field792 = var1.method2363();
                    field794 = var1.method2363() == 1;
                    field720 = var1.method2363();
                    field720 <<= 0x8;
                    field720 += var1.method2363();
                    field741 = var1.method2363();
                    var1.method2368(var2.field4160, 0, 1);
                    var2.field4161 = 0;
                    class229[] var36 = class229.method3276();
                    int var37 = var2.method5854();
                    if (var37 < 0 || var37 >= var36.length) {
                        throw new IOException(var37 + " " + var2.field4161);
                    }
                    field669.field1406 = var36[var37];
                    field669.field1407 = field669.field1406.field2789;
                    var1.method2368(var2.field4160, 0, 2);
                    var2.field4161 = 0;
                    field669.field1407 = var2.method5899();
                    try {
                        class43.method358(Statics.field11, "zap");
                    } catch (Throwable var48) {
                    }
                    field653 = 16;
                }
                if (field653 != 16) {
                    if (field653 == 17 && var1.method2366() >= 2) {
                        var2.field4161 = 0;
                        var1.method2368(var2.field4160, 0, 2);
                        var2.field4161 = 0;
                        Statics.field39 = var2.method5899();
                        field653 = 18;
                    }
                    if (field653 == 18 && var1.method2366() >= Statics.field39) {
                        var2.field4161 = 0;
                        var1.method2368(var2.field4160, 0, Statics.field39);
                        var2.field4161 = 0;
                        String var39 = var2.method5906();
                        String var40 = var2.method5906();
                        String var41 = var2.method5906();
                        Statics.method2923(var39, var40, var41);
                        method1814(10);
                    }
                    if (field653 == 19) {
                        if (field669.field1407 == -1) {
                            if (var1.method2366() < 2) {
                                return;
                            }
                            var1.method2368(var2.field4160, 0, 2);
                            var2.field4161 = 0;
                            field669.field1407 = var2.method5899();
                        }
                        if (var1.method2366() >= field669.field1407) {
                            var1.method2368(var2.field4160, 0, field669.field1407);
                            var2.field4161 = 0;
                            int var42 = field669.field1407;
                            field673.method5082();
                            field669.method2197();
                            field669.field1405.field4161 = 0;
                            field669.field1406 = null;
                            field669.field1411 = null;
                            field669.field1412 = null;
                            field669.field1400 = null;
                            field669.field1407 = 0;
                            field669.field1409 = 0;
                            field638 = 0;
                            method244();
                            field773 = 0;
                            field859 = 0;
                            for (int var43 = 0; var43 < 2048; var43++) {
                                field739[var43] = null;
                            }
                            Statics.field3197 = null;
                            for (int var44 = 0; var44 < field664.length; var44++) {
                                class105 var45 = field664[var44];
                                if (var45 != null) {
                                    var45.field1231 = -1;
                                    var45.field1250 = false;
                                }
                            }
                            class93.field1125 = new class363(32);
                            method1814(30);
                            for (int var46 = 0; var46 < 100; var46++) {
                                field832[var46] = true;
                            }
                            method5319();
                            class110.method60(var2);
                            if (var2.field4161 != var42) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field812++;
                        if (field812 > 2000) {
                            if (field655 < 1) {
                                if (Statics.field4223 == Statics.field1441) {
                                    Statics.field4223 = Statics.field1173;
                                } else {
                                    Statics.field4223 = Statics.field1441;
                                }
                                field655++;
                                field653 = 0;
                            } else {
                                method4420(-3);
                            }
                        }
                    }
                } else if (var1.method2366() >= field669.field1407) {
                    var2.field4161 = 0;
                    var1.method2368(var2.field4160, 0, field669.field1407);
                    field673.method5080();
                    method711();
                    class110.method60(var2);
                    Statics.field112 = -1;
                    method284(false, var2);
                    field669.field1406 = null;
                }
            }
        } catch (IOException var50) {
            if (field655 < 1) {
                if (Statics.field4223 == Statics.field1441) {
                    Statics.field4223 = Statics.field1173;
                } else {
                    Statics.field4223 = Statics.field1441;
                }
                field655++;
                field653 = 0;
            } else {
                method4420(-2);
            }
        }
    }

    @ObfuscatedName("bq.fn(I)V")
    public static void method711() {
        field667 = -1L;
        Statics.field1418.field1169 = 0;
        Statics.field4270 = true;
        field853 = true;
        field851 = -1L;
        class70.method931();
        field669.method2197();
        field669.field1405.field4161 = 0;
        field669.field1406 = null;
        field669.field1411 = null;
        field669.field1412 = null;
        field669.field1400 = null;
        field669.field1407 = 0;
        field669.field1409 = 0;
        field638 = 0;
        field670 = 0;
        field639 = 0;
        method244();
        class48.field355 = 0;
        class112.method979();
        field776 = 0;
        field778 = false;
        field864 = 0;
        field693 = 0;
        field698 = 0;
        Statics.field2801 = null;
        field773 = 0;
        field854 = -1;
        field859 = 0;
        field676 = 0;
        field647 = class108.field1346;
        field641 = class108.field1346;
        field665 = 0;
        class110.method744();
        for (int var0 = 0; var0 < 2048; var0++) {
            field739[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field664[var1] = null;
        }
        field836 = -1;
        field753.method4715();
        field717.method4715();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field751[var2][var3][var4] = null;
                }
            }
        }
        field752 = new class295();
        Statics.field288.method1551();
        for (int var5 = 0; var5 < Statics.field431; var5++) {
            class139 var6 = class139.method14(var5);
            if (var6 != null) {
                class243.field2923[var5] = 0;
                class243.field2924[var5] = 0;
            }
        }
        Statics.field170.method2132();
        field793 = -1;
        if (field783 != -1) {
            class248.method377(field783);
        }
        for (class95 var7 = (class95) field796.method5693(); var7 != null; var7 = (class95) field796.method5694()) {
            method2402(var7, true);
        }
        field783 = -1;
        field796 = new class363(8);
        field789 = null;
        method244();
        field890.method4301((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field747[var8] = null;
            field748[var8] = false;
        }
        class93.field1125 = new class363(32);
        field884 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field832[var9] = true;
        }
        method5319();
        Statics.field3675 = null;
        Statics.field2008 = null;
        Arrays.fill(field852, (Object) null);
        Statics.field1347 = null;
        Arrays.fill(field745, (Object) null);
        for (int var10 = 0; var10 < 8; var10++) {
            field850[var10] = new class285();
        }
        Statics.field3228 = null;
    }

    @ObfuscatedName("is.ft(IB)V")
    public static void method4420(int arg0) {
        if (arg0 == -3) {
            Statics.method2923(class269.field3275, class269.field3362, class269.field3277);
        } else if (arg0 == -2) {
            Statics.method2923(class269.field3278, class269.field3279, class269.field3280);
        } else if (arg0 == -1) {
            Statics.method2923(class269.field3281, class269.field3282, class269.field3283);
        } else if (arg0 == 3) {
            class84.field1002 = 3;
            class84.field1013 = 1;
        } else if (arg0 == 4) {
            class84.field1002 = 12;
            class84.field1012 = 0;
        } else if (arg0 == 5) {
            class84.field1013 = 2;
            Statics.method2923(class269.field3359, class269.field3288, class269.field3289);
        } else if (arg0 == 68 || !(field627 || arg0 != 6)) {
            Statics.method2923(class269.field3290, class269.field3291, class269.field3292);
        } else if (arg0 == 7) {
            Statics.method2923(class269.field3293, class269.field3294, class269.field3295);
        } else if (arg0 == 8) {
            Statics.method2923(class269.field3296, class269.field3297, class269.field3352);
        } else if (arg0 == 9) {
            Statics.method2923(class269.field3299, class269.field3300, class269.field3301);
        } else if (arg0 == 10) {
            Statics.method2923(class269.field3412, class269.field3303, class269.field3374);
        } else if (arg0 == 11) {
            Statics.method2923(class269.field3510, class269.field3306, class269.field3307);
        } else if (arg0 == 12) {
            Statics.method2923(class269.field3411, class269.field3309, class269.field3274);
        } else if (arg0 == 13) {
            Statics.method2923(class269.field3514, class269.field3482, class269.field3313);
        } else if (arg0 == 14) {
            Statics.method2923(class269.field3376, class269.field3315, class269.field3316);
        } else if (arg0 == 16) {
            Statics.method2923(class269.field3483, class269.field3413, class269.field3319);
        } else if (arg0 == 17) {
            Statics.method2923(class269.field3320, class269.field3321, class269.field3449);
        } else if (arg0 == 18) {
            class84.field1002 = 12;
            class84.field1012 = 1;
        } else if (arg0 == 19) {
            Statics.method2923(class269.field3432, class269.field3327, class269.field3328);
        } else if (arg0 == 20) {
            Statics.method2923(class269.field3329, class269.field3330, class269.field3331);
        } else if (arg0 == 22) {
            Statics.method2923(class269.field3479, class269.field3333, class269.field3334);
        } else if (arg0 == 23) {
            Statics.method2923(class269.field3335, class269.field3336, class269.field3337);
        } else if (arg0 == 24) {
            Statics.method2923(class269.field3338, class269.field3339, class269.field3370);
        } else if (arg0 == 25) {
            Statics.method2923(class269.field3424, class269.field3342, class269.field3532);
        } else if (arg0 == 26) {
            Statics.method2923(class269.field3459, class269.field3408, class269.field3268);
        } else if (arg0 == 27) {
            Statics.method2923(class269.field3373, class269.field3348, class269.field3349);
        } else if (arg0 == 31) {
            Statics.method2923(class269.field3356, class269.field3357, class269.field3526);
        } else if (arg0 == 32) {
            Statics.method2923(class269.field3505, class269.field3439, class269.field3361);
        } else if (arg0 == 37) {
            Statics.method2923(class269.field3418, class269.field3363, class269.field3364);
        } else if (arg0 == 38) {
            Statics.method2923(class269.field3365, class269.field3366, class269.field3367);
        } else if (arg0 == 55) {
            class84.field1002 = 8;
        } else if (arg0 == 56) {
            Statics.method2923(class269.field3372, class269.field3400, class269.field3492);
            method1814(11);
            return;
        } else if (arg0 == 57) {
            Statics.method2923(class269.field3375, class269.field3312, class269.field3476);
            method1814(11);
            return;
        } else if (arg0 == 61) {
            class84.field1002 = 7;
        } else {
            Statics.method2923(class269.field3317, class269.field3379, class269.field3399);
        }
        method1814(10);
    }

    @ObfuscatedName("bq.fu(I)V")
    public static final void method708() {
        field669.method2203();
        class157.method1941();
        class150.method2261();
        class142.method709();
        class155.method2932();
        class147.method2508();
        class156.method1816();
        class158.field1880.method3989();
        class158.field1877.method3989();
        class149.method1771();
        class151.field1713.method3989();
        class139.method995();
        Statics.field216.method5782();
        Statics.field214.method5782();
        class154.method3270();
        class143.method939();
        class153.method732();
        class152.method2124();
        class140.field1566.method3989();
        class246.field2935.method3989();
        class248.field3015.method3989();
        class248.field3089.method3989();
        class248.field2971.method3989();
        class248.field2997.method3989();
        ((class204) Statics.field2284).method3807();
        class87.field1071.method3989();
        Statics.field30.method4518();
        Statics.field1599.method4518();
        Statics.field148.method4518();
        Statics.field212.method4518();
        Statics.field37.method4518();
        Statics.field1081.method4518();
        Statics.field398.method4518();
        Statics.field3706.method4518();
        Statics.field135.method4518();
        Statics.field1500.method4518();
        Statics.field1932.method4518();
        Statics.field1388.method4518();
        Statics.field292.method3578();
        for (int var0 = 0; var0 < 4; var0++) {
            field769[var0].method2894();
        }
        System.gc();
        class234.method682(2);
        field862 = -1;
        field863 = false;
        for (class78 var1 = (class78) class78.field939.method4721(); var1 != null; var1 = (class78) class78.field939.method4723()) {
            if (var1.field935 != null) {
                Statics.field1442.method620(var1.field935);
                var1.field935 = null;
            }
            if (var1.field943 != null) {
                Statics.field1442.method620(var1.field943);
                var1.field943 = null;
            }
        }
        class78.field939.method4715();
        method1814(10);
    }

    @ObfuscatedName("v.fb(IB)V")
    public static final void method20(int arg0) {
        method708();
        switch(arg0) {
            case 1:
                class84.field1002 = 24;
                Statics.method2923(class269.field3262, class269.field3470, class269.field3471);
                break;
            case 2:
                class84.method3951();
        }
    }

    @ObfuscatedName("bd.fp(I)V")
    public static final void method1039() {
        if (field670 > 0) {
            method708();
        } else {
            field673.method5076();
            method1814(40);
            Statics.field3888 = field669.method2206();
            field669.method2210();
        }
    }

    @ObfuscatedName("s.fi(ZI)V")
    public static final void method177(boolean arg0) {
        if (arg0) {
            field657 = class84.field1023 ? class127.field1473 : class127.field1472;
        } else {
            field657 = Statics.field40.field1323.containsKey(class305.method2308(class84.field1019)) ? class127.field1479 : class127.field1476;
        }
    }

    @ObfuscatedName("client.fr(I)V")
    public final void method1054() {
        if (field638 > 1) {
            field638--;
        }
        if (field670 > 0) {
            field670--;
        }
        if (field671) {
            field671 = false;
            method1039();
            return;
        }
        if (!field759) {
            method1838();
        }
        for (int var1 = 0; var1 < 100 && this.method1400(field669); var1++) {
        }
        if (field628 != 30) {
            return;
        }
        while (class70.method1842()) {
            class228 var2 = class228.method1927(class226.field2602, field669.field1410);
            var2.field2700.method5880(0);
            int var3 = var2.field2700.field4161;
            class70.method581(var2.field2700);
            var2.field2700.method5930(var2.field2700.field4161 - var3);
            field669.method2200(var2);
        }
        if (field673.field3773) {
            class228 var4 = class228.method1927(class226.field2662, field669.field1410);
            var4.field2700.method5880(0);
            int var5 = var4.field2700.field4161;
            field673.method5095(var4.field2700);
            var4.field2700.method5930(var4.field2700.field4161 - var5);
            field669.method2200(var4);
            field673.method5081();
        }
        Object var6 = Statics.field1418.field1168;
        synchronized (Statics.field1418.field1168) {
            if (!field731) {
                Statics.field1418.field1169 = 0;
            } else if (class48.field356 != 0 || Statics.field1418.field1169 >= 40) {
                class228 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field1418.field1169 && (var7 == null || var7.field2700.field4161 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field1418.field1174[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field1418.field1170[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field844 != var14 || field634 != var13) {
                        if (var7 == null) {
                            var7 = class228.method1927(class226.field2656, field669.field1410);
                            var7.field2700.method5880(0);
                            var8 = var7.field2700.field4161;
                            var7.field2700.field4161 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field761 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field844;
                            var16 = var13 - field634;
                            var17 = (int) ((Statics.field1418.field1171[var12] - field761) / 20L);
                            var10 = (int) ((Statics.field1418.field1171[var12] - field761) % 20L + (long) var10);
                        }
                        field844 = var14;
                        field634 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2700.method5881((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2700.method5880(var17 + 128);
                            var7.field2700.method5881((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2700.method5880(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2700.method5883(Integer.MIN_VALUE);
                            } else {
                                var7.field2700.method5883(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2700.method5881((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2700.method5883(Integer.MIN_VALUE);
                            } else {
                                var7.field2700.method5883(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field761 = Statics.field1418.field1171[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2700.method5930(var7.field2700.field4161 - var8);
                    int var18 = var7.field2700.field4161;
                    var7.field2700.field4161 = var8;
                    var7.field2700.method5880(var10 / var11);
                    var7.field2700.method5880(var10 % var11);
                    var7.field2700.field4161 = var18;
                    field669.method2200(var7);
                }
                if (var9 >= Statics.field1418.field1169) {
                    Statics.field1418.field1169 = 0;
                } else {
                    Statics.field1418.field1169 -= var9;
                    System.arraycopy(Statics.field1418.field1170, var9, Statics.field1418.field1170, 0, Statics.field1418.field1169);
                    System.arraycopy(Statics.field1418.field1174, var9, Statics.field1418.field1174, 0, Statics.field1418.field1169);
                    System.arraycopy(Statics.field1418.field1171, var9, Statics.field1418.field1171, 0, Statics.field1418.field1169);
                }
            }
        }
        if (class48.field356 == 1 || !Statics.field1450 && class48.field356 == 4 || class48.field356 == 2) {
            long var20 = class48.field371 - field667;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field667 = class48.field371;
            int var22 = class48.field352;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field5) {
                var22 = Statics.field5;
            }
            int var23 = class48.field361;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1350) {
                var23 = Statics.field1350;
            }
            int var24 = (int) var20;
            class228 var25 = class228.method1927(class226.field2587, field669.field1410);
            var25.field2700.method5881((var24 << 1) + (class48.field356 == 2 ? 1 : 0));
            var25.field2700.method5881(var23);
            var25.field2700.method5881(var22);
            field669.method2200(var25);
        }
        if (class39.field272 > 0) {
            class228 var26 = class228.method1927(class226.field2595, field669.field1410);
            var26.field2700.method5881(0);
            int var27 = var26.field2700.field4161;
            long var28 = class381.method4000();
            for (int var30 = 0; var30 < class39.field272; var30++) {
                long var31 = var28 - field851;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field851 = var28;
                var26.field2700.method5944((int) var31);
                var26.field2700.method5923(class39.field258[var30]);
            }
            var26.field2700.method5939(var26.field2700.field4161 - var27);
            field669.method2200(var26);
        }
        if (field707 > 0) {
            field707--;
        }
        if (class39.field259[96] || class39.field259[97] || class39.field259[98] || class39.field259[99]) {
            field708 = true;
        }
        if (field708 && field707 <= 0) {
            field707 = 20;
            field708 = false;
            class228 var33 = class228.method1927(class226.field2610, field669.field1410);
            var33.field2700.method5881(field693);
            var33.field2700.method5989(field692);
            field669.method2200(var33);
        }
        if (Statics.field4270 && !field853) {
            field853 = true;
            class228 var34 = class228.method1927(class226.field2582, field669.field1410);
            var34.field2700.method5880(1);
            field669.method2200(var34);
        }
        if (!Statics.field4270 && field853) {
            field853 = false;
            class228 var35 = class228.method1927(class226.field2582, field669.field1410);
            var35.field2700.method5880(0);
            field669.method2200(var35);
        }
        if (Statics.field989 != null) {
            Statics.field989.method5556();
        }
        method2301();
        if (Statics.field2017) {
            method2931();
            Statics.field2017 = false;
        }
        if (Statics.field438 != field854) {
            field854 = Statics.field438;
            int var36 = Statics.field438;
            int[] var37 = Statics.field567.field4263;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class90.field1097[var36][var42][var40] & 0x18) == 0) {
                        Statics.field292.method3612(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class90.field1097[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field292.method3612(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field567.method6277();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class90.field1097[var36][var46][var45] & 0x18) == 0) {
                        method3274(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class90.field1097[var36 + 1][var46][var45] & 0x8) != 0) {
                        method3274(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field855 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field292.method3607(Statics.field438, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class207.method1030(var49);
                        int var52 = class155.method1864(var51).field1788;
                        if (var52 >= 0 && class140.method4496(var52).field1568) {
                            field797[field855] = class140.method4496(var52).method2433(false);
                            field856[field855] = var47;
                            field738[field855] = var48;
                            field855++;
                        }
                    }
                }
            }
            Statics.field2061.method6249();
        }
        if (field628 != 30) {
            return;
        }
        method166();
        int var10002;
        for (int var53 = 0; var53 < field864; var53++) {
            var10002 = field830[var53]--;
            if (field830[var53] >= -10) {
                class50 var55 = field869[var53];
                if (var55 == null) {
                    class50 var10000 = (class50) null;
                    var55 = class50.method633(Statics.field212, field688[var53], 0);
                    if (var55 == null) {
                        continue;
                    }
                    field830[var53] += var55.method637();
                    field869[var53] = var55;
                }
                if (field830[var53] < 0) {
                    int var62;
                    if (field658[var53] == 0) {
                        var62 = Statics.field40.field1312;
                    } else {
                        int var56 = (field658[var53] & 0xFF) * 128;
                        int var57 = field658[var53] >> 16 & 0xFF;
                        int var58 = var57 * 128 + 64 - Statics.field3197.field1242;
                        if (var58 < 0) {
                            var58 = -var58;
                        }
                        int var59 = field658[var53] >> 8 & 0xFF;
                        int var60 = var59 * 128 + 64 - Statics.field3197.field1223;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var58 + var60 - 128;
                        if (var61 > var56) {
                            field830[var53] = -100;
                            continue;
                        }
                        if (var61 < 0) {
                            var61 = 0;
                        }
                        var62 = Statics.field40.field1322 * (var56 - var61) / var56;
                    }
                    if (var62 > 0) {
                        class51 var63 = var55.method639().method644(Statics.field2142);
                        class58 var64 = class58.method871(var63, 100, var62);
                        var64.method875(field866[var53] - 1);
                        Statics.field1442.method619(var64);
                    }
                    field830[var53] = -100;
                }
            } else {
                field864--;
                for (int var54 = var53; var54 < field864; var54++) {
                    field688[var54] = field688[var54 + 1];
                    field869[var54] = field869[var54 + 1];
                    field866[var54] = field866[var54 + 1];
                    field830[var54] = field830[var54 + 1];
                    field658[var54] = field658[var54 + 1];
                }
                var53--;
            }
        }
        if (field863 && !class234.method1040()) {
            if (Statics.field40.field1320 != 0 && field862 != -1) {
                class234.method2086(Statics.field1081, field862, 0, Statics.field40.field1320, false);
            }
            field863 = false;
        }
        field669.field1409++;
        if (field669.field1409 > 750) {
            method1039();
            return;
        }
        method2957();
        for (int var65 = 0; var65 < field665; var65++) {
            int var66 = field666[var65];
            class105 var67 = field664[var66];
            if (var67 != null) {
                method1544(var67, var67.field1328.field1666);
            }
        }
        method3240();
        field684++;
        if (field727 != 0) {
            field736 += 20;
            if (field736 >= 400) {
                field727 = 0;
            }
        }
        if (Statics.field1035 != null) {
            field870++;
            if (field870 >= 15) {
                method1837(Statics.field1035);
                Statics.field1035 = null;
            }
        }
        class248 var68 = Statics.field2916;
        class248 var69 = Statics.field43;
        Statics.field2916 = null;
        Statics.field43 = null;
        field800 = null;
        field732 = false;
        field822 = false;
        field848 = 0;
        while (class39.method1900() && field848 < 128) {
            if (field792 >= 2 && class39.field259[82] && Statics.field447 == 66) {
                String var70 = "";
                Iterator var71 = class112.field1390.iterator();
                while (var71.hasNext()) {
                    class73 var72 = (class73) var71.next();
                    var70 = var70 + var72.field597 + ':' + var72.field602 + '\n';
                }
                Statics.field11.method436(var70);
            } else if (field698 != 1 || Statics.field3781 <= 0) {
                field787[field848] = Statics.field447;
                field849[field848] = Statics.field3781;
                field848++;
            }
        }
        boolean var75 = field792 >= 2;
        if (var75 && class39.field259[82] && class39.field259[81] && field825 != 0) {
            int var76 = Statics.field3197.field1197 - field825;
            if (var76 < 0) {
                var76 = 0;
            } else if (var76 > 3) {
                var76 = 3;
            }
            if (Statics.field3197.field1197 != var76) {
                int var77 = Statics.field127 + Statics.field3197.field1278[0];
                int var78 = Statics.field2092 + Statics.field3197.field1279[0];
                class228 var79 = class228.method1927(class226.field2597, field669.field1410);
                var79.field2700.method5881(var77);
                var79.field2700.method5943(0);
                var79.field2700.method5924(var76);
                var79.field2700.method5932(var78);
                field669.method2200(var79);
            }
            field825 = 0;
        }
        if (field783 != -1) {
            method2217(field783, 0, 0, Statics.field1350, Statics.field5, 0, 0);
        }
        field808++;
        while (true) {
            class96 var80;
            class248 var81;
            class248 var82;
            do {
                var80 = (class96) field813.method4719();
                if (var80 == null) {
                    while (true) {
                        class96 var83;
                        class248 var84;
                        class248 var85;
                        do {
                            var83 = (class96) field861.method4719();
                            if (var83 == null) {
                                while (true) {
                                    class96 var86;
                                    class248 var87;
                                    class248 var88;
                                    do {
                                        var86 = (class96) field826.method4719();
                                        if (var86 == null) {
                                            this.method1415();
                                            method178();
                                            if (field842 != null) {
                                                this.method1063();
                                            }
                                            if (Statics.field1679 != null) {
                                                method1837(Statics.field1679);
                                                field668++;
                                                if (class48.field360 == 0) {
                                                    if (field735) {
                                                        if (Statics.field4225 == Statics.field1679 && field894 != field620) {
                                                            class248 var89 = Statics.field1679;
                                                            byte var90 = 0;
                                                            if (field892 == 1 && var89.field2965 == 206) {
                                                                var90 = 1;
                                                            }
                                                            if (var89.field3045[field894] <= 0) {
                                                                var90 = 0;
                                                            }
                                                            int var91 = method188(var89);
                                                            boolean var92 = (var91 >> 29 & 0x1) != 0;
                                                            if (var92) {
                                                                int var93 = field620;
                                                                int var94 = field894;
                                                                var89.field3045[var94] = var89.field3045[var93];
                                                                var89.field2957[var94] = var89.field2957[var93];
                                                                var89.field3045[var93] = -1;
                                                                var89.field2957[var93] = 0;
                                                            } else if (var90 == 1) {
                                                                int var95 = field620;
                                                                int var96 = field894;
                                                                while (var95 != var96) {
                                                                    if (var95 > var96) {
                                                                        var89.method4327(var95 - 1, var95);
                                                                        var95--;
                                                                    } else if (var95 < var96) {
                                                                        var89.method4327(var95 + 1, var95);
                                                                        var95++;
                                                                    }
                                                                }
                                                            } else {
                                                                var89.method4327(field894, field620);
                                                            }
                                                            class228 var97 = class228.method1927(class226.field2636, field669.field1410);
                                                            var97.field2700.method5941(Statics.field1679.field2960);
                                                            var97.field2700.method5881(field894);
                                                            var97.field2700.method5881(field620);
                                                            var97.field2700.method5923(var90);
                                                            field669.method2200(var97);
                                                        }
                                                    } else if (this.method1059()) {
                                                        this.method1060(field744, field733);
                                                    } else if (field900 > 0) {
                                                        int var98 = field744;
                                                        int var99 = field733;
                                                        method2342(Statics.field223, var98, var99);
                                                        Statics.field223 = null;
                                                    }
                                                    field870 = 10;
                                                    class48.field356 = 0;
                                                    Statics.field1679 = null;
                                                } else if (field668 >= 5 && (class48.field368 > field744 + 5 || class48.field368 < field744 - 5 || class48.field362 > field733 + 5 || class48.field362 < field733 - 5)) {
                                                    field735 = true;
                                                }
                                            }
                                            if (class199.method3674()) {
                                                int var100 = class199.field2298;
                                                int var101 = class199.field2294;
                                                class228 var102 = class228.method1927(class226.field2671, field669.field1410);
                                                var102.field2700.method5880(5);
                                                var102.field2700.method5881(Statics.field2092 + var101);
                                                var102.field2700.method5923(class39.field259[82] ? (class39.field259[81] ? 2 : 1) : 0);
                                                var102.field2700.method5933(Statics.field127 + var100);
                                                field669.method2200(var102);
                                                class199.method3611();
                                                field724 = class48.field361;
                                                field725 = class48.field352;
                                                field727 = 1;
                                                field736 = 0;
                                                field859 = var100;
                                                field676 = var101;
                                            }
                                            if (Statics.field2916 != var68) {
                                                if (var68 != null) {
                                                    method1837(var68);
                                                }
                                                if (Statics.field2916 != null) {
                                                    method1837(Statics.field2916);
                                                }
                                            }
                                            if (Statics.field43 != var69 && field774 == field694) {
                                                if (var69 != null) {
                                                    method1837(var69);
                                                }
                                                if (Statics.field43 != null) {
                                                    method1837(Statics.field43);
                                                }
                                            }
                                            if (Statics.field43 == null) {
                                                if (field774 > 0) {
                                                    field774--;
                                                }
                                            } else if (field774 < field694) {
                                                field774++;
                                                if (field774 == field694) {
                                                    method1837(Statics.field43);
                                                }
                                            }
                                            method4252();
                                            if (field879) {
                                                method4259();
                                            }
                                            for (int var103 = 0; var103 < 5; var103++) {
                                                var10002 = field876[var103]++;
                                            }
                                            Statics.field170.method2164();
                                            int var104 = class48.method151();
                                            int var105 = class39.field279;
                                            if (var104 > 15000 && var105 > 15000) {
                                                field670 = 250;
                                                class48.field355 = 14500;
                                                class228 var107 = class228.method1927(class226.field2645, field669.field1410);
                                                field669.method2200(var107);
                                            }
                                            Statics.field288.method1546();
                                            field669.field1401++;
                                            if (field669.field1401 > 50) {
                                                class228 var108 = class228.method1927(class226.field2648, field669.field1410);
                                                field669.method2200(var108);
                                            }
                                            try {
                                                field669.method2201();
                                            } catch (IOException var110) {
                                                method1039();
                                            }
                                            return;
                                        }
                                        var87 = var86.field1151;
                                        if (var87.field3100 < 0) {
                                            break;
                                        }
                                        var88 = class248.method3261(var87.field2980);
                                    } while (var88 == null || var88.field3096 == null || var87.field3100 >= var88.field3096.length || var88.field3096[var87.field3100] != var87);
                                    Statics.method3331(var86);
                                }
                            }
                            var84 = var83.field1151;
                            if (var84.field3100 < 0) {
                                break;
                            }
                            var85 = class248.method3261(var84.field2980);
                        } while (var85 == null || var85.field3096 == null || var84.field3100 >= var85.field3096.length || var85.field3096[var84.field3100] != var84);
                        Statics.method3331(var83);
                    }
                }
                var81 = var80.field1151;
                if (var81.field3100 < 0) {
                    break;
                }
                var82 = class248.method3261(var81.field2980);
            } while (var82 == null || var82.field3096 == null || var81.field3100 >= var82.field3096.length || var82.field3096[var81.field3100] != var81);
            Statics.method3331(var80);
        }
    }

    @ObfuscatedName("hu.fj(S)V")
    public static final void method4062() {
        if (Statics.field1424 != null) {
            Statics.field1424.method684();
        }
        if (Statics.field442 != null) {
            Statics.field442.method684();
        }
    }

    @ObfuscatedName("ly.fy(Lfm;IIIB)V")
    public static void method5259(class158 arg0, int arg1, int arg2, int arg3) {
        if (field864 >= 50 || Statics.field40.field1322 == 0 || arg0.field1885 == null || arg1 >= arg0.field1885.length) {
            return;
        }
        int var4 = arg0.field1885[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field688[field864] = var5;
        field866[field864] = var6;
        field830[field864] = 0;
        field869[field864] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field658[field864] = (var8 << 16) + (var9 << 8) + var7;
        field864++;
    }

    @ObfuscatedName("b.fh(IIII)V")
    public static void method153(int arg0, int arg1, int arg2) {
        if (Statics.field40.field1312 == 0 || arg1 == 0 || field864 >= 50) {
            return;
        }
        field688[field864] = arg0;
        field866[field864] = arg1;
        field830[field864] = arg2;
        field869[field864] = null;
        field658[field864] = 0;
        field864++;
    }

    @ObfuscatedName("m.fw(II)V")
    public static void method57(int arg0) {
        if (arg0 == -1 && !field863) {
            class234.method940();
        } else if (arg0 != -1 && field862 != arg0 && Statics.field40.field1320 != 0 && !field863) {
            class234.method2983(2, Statics.field1081, arg0, 0, Statics.field40.field1320, false);
        }
        field862 = arg0;
    }

    @ObfuscatedName("bn.fk(IIB)V")
    public static void method1001(int arg0, int arg1) {
        if (Statics.field40.field1320 != 0 && arg0 != -1) {
            class234.method2086(Statics.field1932, arg0, 0, Statics.field40.field1320, false);
            field863 = true;
        }
    }

    @ObfuscatedName("dk.fd(I)V")
    public static final void method2301() {
        if (!Statics.field206) {
            return;
        }
        if (Statics.field3675 != null) {
            Statics.field3675.method5229();
        }
        method3353();
        Statics.field206 = false;
    }

    @ObfuscatedName("gh.fz(Liv;III)V")
    public static final void method3351(class248 arg0, int arg1, int arg2) {
        if (field773 != 0 && field773 != 3 || field759 || !(class48.field356 == 1 || !Statics.field1450 && class48.field356 == 4)) {
            return;
        }
        class242 var3 = arg0.method4332(true);
        if (var3 == null) {
            return;
        }
        int var4 = class48.field361 - arg1;
        int var5 = class48.field352 - arg2;
        if (!var3.method4247(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2920 / 2;
        int var7 = var5 - var3.field2919 / 2;
        int var8 = field693 & 0x7FF;
        int var9 = class197.field2271[var8];
        int var10 = class197.field2285[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3197.field1242 + var11 >> 7;
        int var14 = Statics.field3197.field1223 - var12 >> 7;
        class228 var15 = class228.method1927(class226.field2616, field669.field1410);
        var15.field2700.method5880(18);
        var15.field2700.method5881(Statics.field2092 + var14);
        var15.field2700.method5923(class39.field259[82] ? (class39.field259[81] ? 2 : 1) : 0);
        var15.field2700.method5933(Statics.field127 + var13);
        var15.field2700.method5880(var6);
        var15.field2700.method5880(var7);
        var15.field2700.method5881(field693);
        var15.field2700.method5880(57);
        var15.field2700.method5880(0);
        var15.field2700.method5880(0);
        var15.field2700.method5880(89);
        var15.field2700.method5881(Statics.field3197.field1242);
        var15.field2700.method5881(Statics.field3197.field1223);
        var15.field2700.method5880(63);
        field669.method2200(var15);
        field859 = var13;
        field676 = var14;
    }

    @ObfuscatedName("ft.ff(I)V")
    public static final void method3240() {
        int[] var0 = class110.field1365;
        for (int var1 = 0; var1 < class110.field1359; var1++) {
            class98 var2 = field739[var0[var1]];
            if (var2 != null && var2.field1239 > 0) {
                var2.field1239--;
                if (var2.field1239 == 0) {
                    var2.field1232 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field665; var3++) {
            int var4 = field666[var3];
            class105 var5 = field664[var4];
            if (var5 != null && var5.field1239 > 0) {
                var5.field1239--;
                if (var5.field1239 == 0) {
                    var5.field1232 = null;
                }
            }
        }
    }

    @ObfuscatedName("aj.gl(Ljava/lang/String;I)V")
    public static final void method326(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field40.field1321 = !Statics.field40.field1321;
            class103.method2003();
            if (Statics.field40.field1321) {
                class112.method2289(99, "", "Roofs are now all hidden");
            } else {
                class112.method2289(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field729 = !field729;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field742 = !field742;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field771 = !field771;
        }
        if (field792 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field989.field4040 = !Statics.field989.field4040;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field729 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field729 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1039();
            }
        }
        class228 var1 = class228.method1927(class226.field2620, field669.field1410);
        var1.field2700.method5880(arg0.length() + 1);
        var1.field2700.method6068(arg0);
        field669.method2200(var1);
    }

    @ObfuscatedName("iw.gk(I)V")
    public static final void method4259() {
        int var0 = Statics.field449 * 128 + 64;
        int var1 = Statics.field1352 * 128 + 64;
        int var2 = method1921(var0, var1, Statics.field438) - Statics.field660;
        if (Statics.field949 < var0) {
            Statics.field949 += Statics.field1708 * (var0 - Statics.field949) / 1000 + Statics.field603;
            if (Statics.field949 > var0) {
                Statics.field949 = var0;
            }
        }
        if (Statics.field949 > var0) {
            Statics.field949 -= Statics.field1708 * (Statics.field949 - var0) / 1000 + Statics.field603;
            if (Statics.field949 < var0) {
                Statics.field949 = var0;
            }
        }
        if (Statics.field1923 < var2) {
            Statics.field1923 += Statics.field1708 * (var2 - Statics.field1923) / 1000 + Statics.field603;
            if (Statics.field1923 > var2) {
                Statics.field1923 = var2;
            }
        }
        if (Statics.field1923 > var2) {
            Statics.field1923 -= Statics.field1708 * (Statics.field1923 - var2) / 1000 + Statics.field603;
            if (Statics.field1923 < var2) {
                Statics.field1923 = var2;
            }
        }
        if (Statics.field293 < var1) {
            Statics.field293 += Statics.field1708 * (var1 - Statics.field293) / 1000 + Statics.field603;
            if (Statics.field293 > var1) {
                Statics.field293 = var1;
            }
        }
        if (Statics.field293 > var1) {
            Statics.field293 -= Statics.field1708 * (Statics.field293 - var1) / 1000 + Statics.field603;
            if (Statics.field293 < var1) {
                Statics.field293 = var1;
            }
        }
        int var3 = Statics.field2030 * 128 + 64;
        int var4 = Statics.field316 * 128 + 64;
        int var5 = method1921(var3, var4, Statics.field438) - Statics.field3816;
        int var6 = var3 - Statics.field949;
        int var7 = var5 - Statics.field1923;
        int var8 = var4 - Statics.field293;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field570 < var10) {
            Statics.field570 += Statics.field167 * (var10 - Statics.field570) / 1000 + Statics.field608;
            if (Statics.field570 > var10) {
                Statics.field570 = var10;
            }
        }
        if (Statics.field570 > var10) {
            Statics.field570 -= Statics.field167 * (Statics.field570 - var10) / 1000 + Statics.field608;
            if (Statics.field570 < var10) {
                Statics.field570 = var10;
            }
        }
        int var12 = var11 - Statics.field227;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field227 += Statics.field167 * var12 / 1000 + Statics.field608;
            Statics.field227 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field227 -= Statics.field167 * -var12 / 1000 + Statics.field608;
            Statics.field227 &= 0x7FF;
        }
        int var13 = var11 - Statics.field227;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field227 = var11;
        }
    }

    @ObfuscatedName("ir.gh(I)V")
    public static final void method4252() {
        if (field698 == 0) {
            int var0 = Statics.field3197.field1242;
            int var1 = Statics.field3197.field1223;
            if (Statics.field932 - var0 < -500 || Statics.field932 - var0 > 500 || Statics.field1716 - var1 < -500 || Statics.field1716 - var1 > 500) {
                Statics.field932 = var0;
                Statics.field1716 = var1;
            }
            if (Statics.field932 != var0) {
                Statics.field932 += (var0 - Statics.field932) / 16;
            }
            if (Statics.field1716 != var1) {
                Statics.field1716 += (var1 - Statics.field1716) / 16;
            }
            int var2 = Statics.field932 >> 7;
            int var3 = Statics.field1716 >> 7;
            int var4 = method1921(Statics.field932, Statics.field1716, Statics.field438);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field438;
                        if (var8 < 3 && (class90.field1097[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class90.field1099[var8][var6][var7];
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
            if (var10 > field709) {
                field709 += (var10 - field709) / 24;
            } else if (var10 < field709) {
                field709 += (var10 - field709) / 80;
            }
            Statics.field125 = method1921(Statics.field3197.field1242, Statics.field3197.field1223, Statics.field438) - field699;
        } else if (field698 == 1) {
            if (field706 && Statics.field3197 != null) {
                int var11 = Statics.field3197.field1278[0];
                int var12 = Statics.field3197.field1279[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field932 = Statics.field3197.field1242;
                    int var13 = method1921(Statics.field3197.field1242, Statics.field3197.field1223, Statics.field438) - field699;
                    if (var13 < Statics.field125) {
                        Statics.field125 = var13;
                    }
                    Statics.field1716 = Statics.field3197.field1223;
                    field706 = false;
                }
            }
            short var14 = -1;
            if (class39.field259[33]) {
                var14 = 0;
            } else if (class39.field259[49]) {
                var14 = 1024;
            }
            if (class39.field259[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class39.field259[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class39.field259[35]) {
                var15 = -1;
            } else if (class39.field259[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class39.field259[81] ? field704 : field703;
                var16 = var17 * 16;
                field677 = var14;
                field858 = var15;
            }
            if (field700 < var16) {
                field700 += var16 / 8;
                if (field700 > var16) {
                    field700 = var16;
                }
            } else if (field700 > var16) {
                field700 = field700 * 9 / 10;
            }
            if (field700 > 0) {
                int var18 = field700 / 16;
                if (field677 >= 0) {
                    int var19 = field677 - Statics.field227 & 0x7FF;
                    int var20 = class197.field2271[var19];
                    int var21 = class197.field2285[var19];
                    Statics.field932 += var18 * var20 / 65536;
                    Statics.field1716 += var18 * var21 / 65536;
                }
                if (field858 != 0) {
                    Statics.field125 += field858 * var18;
                    if (Statics.field125 > 0) {
                        Statics.field125 = 0;
                    }
                }
            } else {
                field677 = -1;
                field858 = -1;
            }
            if (class39.field259[13]) {
                method258();
            }
        }
        if (class48.field360 == 4 && Statics.field1450) {
            int var22 = class48.field362 - field697;
            field833 = var22 * 2;
            field697 = var22 == -1 || var22 == 1 ? class48.field362 : (field697 + class48.field362) / 2;
            int var23 = field696 - class48.field368;
            field897 = var23 * 2;
            field696 = var23 == -1 || var23 == 1 ? class48.field368 : (field696 + class48.field368) / 2;
        } else {
            if (class39.field259[96]) {
                field897 += (-24 - field897) / 2;
            } else if (class39.field259[97]) {
                field897 += (24 - field897) / 2;
            } else {
                field897 /= 2;
            }
            if (class39.field259[98]) {
                field833 += (12 - field833) / 2;
            } else if (class39.field259[99]) {
                field833 += (-12 - field833) / 2;
            } else {
                field833 /= 2;
            }
            field697 = class48.field362;
            field696 = class48.field368;
        }
        field693 = field897 / 2 + field693 & 0x7FF;
        field692 += field833 / 2;
        if (field692 < 128) {
            field692 = 128;
        }
        if (field692 > 383) {
            field692 = 383;
        }
    }

    @ObfuscatedName("fg.gt(I)V")
    public static final void method2957() {
        int var0 = class110.field1359;
        int[] var1 = class110.field1365;
        for (int var2 = 0; var2 < var0; var2++) {
            class98 var3 = field739[var1[var2]];
            if (var3 != null) {
                method1544(var3, 1);
            }
        }
    }

    @ObfuscatedName("bk.ge(Lcl;IS)V")
    public static final void method1544(class100 arg0, int arg1) {
        if (arg0.field1277 >= field631) {
            method2183(arg0);
        } else if (arg0.field1270 >= field631) {
            method2962(arg0);
        } else {
            method746(arg0);
        }
        if (arg0.field1242 < 128 || arg0.field1223 < 128 || arg0.field1242 >= 13184 || arg0.field1223 >= 13184) {
            arg0.field1255 = -1;
            arg0.field1260 = -1;
            arg0.field1277 = 0;
            arg0.field1270 = 0;
            arg0.field1242 = arg0.field1278[0] * 128 + arg0.field1226 * 64;
            arg0.field1223 = arg0.field1279[0] * 128 + arg0.field1226 * 64;
            arg0.method2000();
        }
        if (Statics.field3197 == arg0 && (arg0.field1242 < 1536 || arg0.field1223 < 1536 || arg0.field1242 >= 11776 || arg0.field1223 >= 11776)) {
            arg0.field1255 = -1;
            arg0.field1260 = -1;
            arg0.field1277 = 0;
            arg0.field1270 = 0;
            arg0.field1242 = arg0.field1278[0] * 128 + arg0.field1226 * 64;
            arg0.field1223 = arg0.field1279[0] * 128 + arg0.field1226 * 64;
            arg0.method2000();
        }
        if (arg0.field1276 != 0) {
            if (arg0.field1231 != -1) {
                class100 var2 = null;
                if (arg0.field1231 < 32768) {
                    var2 = field664[arg0.field1231];
                } else if (arg0.field1231 >= 32768) {
                    var2 = field739[arg0.field1231 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field1242 - var2.field1242;
                    int var4 = arg0.field1223 - var2.field1223;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field1274 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1250) {
                    arg0.field1231 = -1;
                    arg0.field1250 = false;
                }
            }
            if (arg0.field1281 != -1 && (arg0.field1228 == 0 || arg0.field1243 > 0)) {
                arg0.field1274 = arg0.field1281;
                arg0.field1281 = -1;
            }
            int var5 = arg0.field1274 - arg0.field1224 & 0x7FF;
            if (var5 == 0 && arg0.field1250) {
                arg0.field1231 = -1;
                arg0.field1250 = false;
            }
            if (var5 == 0) {
                arg0.field1275 = 0;
            } else {
                arg0.field1275++;
                if (var5 > 1024) {
                    arg0.field1224 -= arg0.field1276;
                    boolean var6 = true;
                    if (var5 < arg0.field1276 || var5 > 2048 - arg0.field1276) {
                        arg0.field1224 = arg0.field1274;
                        var6 = false;
                    }
                    if (arg0.field1252 == arg0.field1248 && (arg0.field1275 > 25 || var6)) {
                        if (arg0.field1229 == -1) {
                            arg0.field1252 = arg0.field1253;
                        } else {
                            arg0.field1252 = arg0.field1229;
                        }
                    }
                } else {
                    arg0.field1224 += arg0.field1276;
                    boolean var7 = true;
                    if (var5 < arg0.field1276 || var5 > 2048 - arg0.field1276) {
                        arg0.field1224 = arg0.field1274;
                        var7 = false;
                    }
                    if (arg0.field1252 == arg0.field1248 && (arg0.field1275 > 25 || var7)) {
                        if (arg0.field1230 == -1) {
                            arg0.field1252 = arg0.field1253;
                        } else {
                            arg0.field1252 = arg0.field1230;
                        }
                    }
                }
                arg0.field1224 &= 0x7FF;
            }
        }
        method12(arg0);
    }

    @ObfuscatedName("dg.gg(Lcl;I)V")
    public static final void method2183(class100 arg0) {
        int var1 = Math.max(1, arg0.field1277 - field631);
        int var2 = arg0.field1265 * 128 + arg0.field1226 * 64;
        int var3 = arg0.field1269 * 128 + arg0.field1226 * 64;
        arg0.field1242 += (var2 - arg0.field1242) / var1;
        arg0.field1223 += (var3 - arg0.field1223) / var1;
        arg0.field1243 = 0;
        arg0.field1274 = arg0.field1271;
    }

    @ObfuscatedName("fg.gs(Lcl;I)V")
    public static final void method2962(class100 arg0) {
        if (field631 == arg0.field1270 || arg0.field1255 == -1 || arg0.field1258 != 0 || arg0.field1257 + 1 > class158.method3363(arg0.field1255).field1884[arg0.field1272]) {
            int var1 = arg0.field1270 - arg0.field1277;
            int var2 = field631 - arg0.field1277;
            int var3 = arg0.field1265 * 128 + arg0.field1226 * 64;
            int var4 = arg0.field1269 * 128 + arg0.field1226 * 64;
            int var5 = arg0.field1266 * 128 + arg0.field1226 * 64;
            int var6 = arg0.field1268 * 128 + arg0.field1226 * 64;
            arg0.field1242 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1223 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1243 = 0;
        arg0.field1274 = arg0.field1271;
        arg0.field1224 = arg0.field1274;
    }

    @ObfuscatedName("bz.gu(Lcl;B)V")
    public static final void method746(class100 arg0) {
        arg0.field1252 = arg0.field1248;
        if (arg0.field1228 == 0) {
            arg0.field1243 = 0;
            return;
        }
        if (arg0.field1255 != -1 && arg0.field1258 == 0) {
            class158 var1 = class158.method3363(arg0.field1255);
            if (arg0.field1282 > 0 && var1.field1896 == 0) {
                arg0.field1243++;
                return;
            }
            if (arg0.field1282 <= 0 && var1.field1894 == 0) {
                arg0.field1243++;
                return;
            }
        }
        int var2 = arg0.field1242;
        int var3 = arg0.field1223;
        int var4 = arg0.field1278[arg0.field1228 - 1] * 128 + arg0.field1226 * 64;
        int var5 = arg0.field1279[arg0.field1228 - 1] * 128 + arg0.field1226 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1274 = 1280;
            } else if (var3 > var5) {
                arg0.field1274 = 1792;
            } else {
                arg0.field1274 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1274 = 768;
            } else if (var3 > var5) {
                arg0.field1274 = 256;
            } else {
                arg0.field1274 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1274 = 1024;
        } else if (var3 > var5) {
            arg0.field1274 = 0;
        }
        byte var6 = arg0.field1280[arg0.field1228 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1242 = var4;
            arg0.field1223 = var5;
            arg0.field1228--;
            if (arg0.field1282 > 0) {
                arg0.field1282--;
            }
            return;
        }
        int var7 = arg0.field1274 - arg0.field1224 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1267;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1253;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1234;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1256;
        }
        if (var8 == -1) {
            var8 = arg0.field1253;
        }
        arg0.field1252 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class105) {
            var10 = ((class105) arg0).field1328.field1671;
        }
        if (var10) {
            if (arg0.field1274 != arg0.field1224 && arg0.field1231 == -1 && arg0.field1276 != 0) {
                var9 = 2;
            }
            if (arg0.field1228 > 2) {
                var9 = 6;
            }
            if (arg0.field1228 > 3) {
                var9 = 8;
            }
            if (arg0.field1243 > 0 && arg0.field1228 > 1) {
                var9 = 8;
                arg0.field1243--;
            }
        } else {
            if (arg0.field1228 > 1) {
                var9 = 6;
            }
            if (arg0.field1228 > 2) {
                var9 = 8;
            }
            if (arg0.field1243 > 0 && arg0.field1228 > 1) {
                var9 = 8;
                arg0.field1243--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1253 == arg0.field1252 && arg0.field1235 != -1) {
            arg0.field1252 = arg0.field1235;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1242 += var9;
                if (arg0.field1242 > var4) {
                    arg0.field1242 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1242 -= var9;
                if (arg0.field1242 < var4) {
                    arg0.field1242 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1223 += var9;
                if (arg0.field1223 > var5) {
                    arg0.field1223 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1223 -= var9;
                if (arg0.field1223 < var5) {
                    arg0.field1223 = var5;
                }
            }
        }
        if (arg0.field1242 == var4 && arg0.field1223 == var5) {
            arg0.field1228--;
            if (arg0.field1282 > 0) {
                arg0.field1282--;
            }
        }
    }

    @ObfuscatedName("f.gw(Lcl;B)V")
    public static final void method12(class100 arg0) {
        arg0.field1225 = false;
        if (arg0.field1252 != -1) {
            class158 var1 = class158.method3363(arg0.field1252);
            if (var1 == null || var1.field1882 == null) {
                arg0.field1252 = -1;
            } else {
                arg0.field1249++;
                if (arg0.field1222 < var1.field1882.length && arg0.field1249 > var1.field1884[arg0.field1222]) {
                    arg0.field1249 = 1;
                    arg0.field1222++;
                    method5259(var1, arg0.field1222, arg0.field1242, arg0.field1223);
                }
                if (arg0.field1222 >= var1.field1882.length) {
                    arg0.field1249 = 0;
                    arg0.field1222 = 0;
                    method5259(var1, arg0.field1222, arg0.field1242, arg0.field1223);
                }
            }
        }
        if (arg0.field1260 != -1 && field631 >= arg0.field1263) {
            if (arg0.field1261 < 0) {
                arg0.field1261 = 0;
            }
            int var2 = class149.method1892(arg0.field1260).field1692;
            if (var2 == -1) {
                arg0.field1260 = -1;
            } else {
                class158 var3 = class158.method3363(var2);
                if (var3 == null || var3.field1882 == null) {
                    arg0.field1260 = -1;
                } else {
                    arg0.field1238++;
                    if (arg0.field1261 < var3.field1882.length && arg0.field1238 > var3.field1884[arg0.field1261]) {
                        arg0.field1238 = 1;
                        arg0.field1261++;
                        method5259(var3, arg0.field1261, arg0.field1242, arg0.field1223);
                    }
                    if (arg0.field1261 >= var3.field1882.length && (arg0.field1261 < 0 || arg0.field1261 >= var3.field1882.length)) {
                        arg0.field1260 = -1;
                    }
                }
            }
        }
        if (arg0.field1255 != -1 && arg0.field1258 <= 1) {
            class158 var4 = class158.method3363(arg0.field1255);
            if (var4.field1896 == 1 && arg0.field1282 > 0 && arg0.field1277 <= field631 && arg0.field1270 < field631) {
                arg0.field1258 = 1;
                return;
            }
        }
        if (arg0.field1255 != -1 && arg0.field1258 == 0) {
            class158 var5 = class158.method3363(arg0.field1255);
            if (var5 == null || var5.field1882 == null) {
                arg0.field1255 = -1;
            } else {
                arg0.field1257++;
                if (arg0.field1272 < var5.field1882.length && arg0.field1257 > var5.field1884[arg0.field1272]) {
                    arg0.field1257 = 1;
                    arg0.field1272++;
                    method5259(var5, arg0.field1272, arg0.field1242, arg0.field1223);
                }
                if (arg0.field1272 >= var5.field1882.length) {
                    arg0.field1272 -= var5.field1888;
                    arg0.field1259++;
                    if (arg0.field1259 >= var5.field1897) {
                        arg0.field1255 = -1;
                    } else if (arg0.field1272 >= 0 && arg0.field1272 < var5.field1882.length) {
                        method5259(var5, arg0.field1272, arg0.field1242, arg0.field1223);
                    } else {
                        arg0.field1255 = -1;
                    }
                }
                arg0.field1225 = var5.field1889;
            }
        }
        if (arg0.field1258 > 0) {
            arg0.field1258--;
        }
    }

    @ObfuscatedName("s.ga(I)V")
    public static void method178() {
        if (Statics.field989 != null) {
            Statics.field989.method5604(Statics.field438, (Statics.field3197.field1242 >> 7) + Statics.field127, (Statics.field3197.field1223 >> 7) + Statics.field2092, false);
            Statics.field989.method5474();
        }
    }

    @ObfuscatedName("bk.gq(Lcj;IIB)V")
    public static void method1542(class98 arg0, int arg1, int arg2) {
        if (arg0.field1255 == arg1 && arg1 != -1) {
            int var3 = class158.method3363(arg1).field1895;
            if (var3 == 1) {
                arg0.field1272 = 0;
                arg0.field1257 = 0;
                arg0.field1258 = arg2;
                arg0.field1259 = 0;
            }
            if (var3 == 2) {
                arg0.field1259 = 0;
            }
        } else if (arg1 == -1 || arg0.field1255 == -1 || class158.method3363(arg1).field1893 >= class158.method3363(arg0.field1255).field1893) {
            arg0.field1255 = arg1;
            arg0.field1272 = 0;
            arg0.field1257 = 0;
            arg0.field1258 = arg2;
            arg0.field1259 = 0;
            arg0.field1282 = arg0.field1228;
        }
    }

    @ObfuscatedName("ko.gm(B)I")
    public static int method4981() {
        return field841 ? 2 : 1;
    }

    @ObfuscatedName("is.gz(II)V")
    public static void method4421(int arg0) {
        field840 = 0L;
        if (arg0 >= 2) {
            field841 = true;
        } else {
            field841 = false;
        }
        if (method4981() == 1) {
            Statics.field11.method403(765, 503);
        } else {
            Statics.field11.method403(7680, 2160);
        }
        if (field628 >= 25) {
            method5319();
        }
    }

    @ObfuscatedName("lv.gf(I)V")
    public static void method5319() {
        class228 var0 = class228.method1927(class226.field2657, field669.field1410);
        var0.field2700.method5880(method4981());
        var0.field2700.method5881(Statics.field1350);
        var0.field2700.method5881(Statics.field5);
        field669.method2200(var0);
    }

    @ObfuscatedName("client.k(B)V")
    public final void method411() {
        field840 = class381.method4000() + 500L;
        this.method1155();
        if (field783 != -1) {
            this.method1156(true);
        }
    }

    @ObfuscatedName("client.gn(I)V")
    public void method1155() {
        int var1 = Statics.field1350;
        int var2 = Statics.field5;
        if (this.field336 < var1) {
            int var3 = this.field336;
        }
        if (this.field344 < var2) {
            int var4 = this.field344;
        }
        if (Statics.field40 == null) {
            return;
        }
        try {
            client var5 = Statics.field11;
            Object[] var6 = new Object[] { method4981() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gb(B)V")
    public final void method1375() {
        if (field783 != -1) {
            method194(field783);
        }
        for (int var1 = 0; var1 < field714; var1++) {
            if (field832[var1]) {
                field713[var1] = true;
            }
            field834[var1] = field832[var1];
            field832[var1] = false;
        }
        field831 = field631;
        field680 = -1;
        field893 = -1;
        Statics.field4225 = null;
        if (field783 != -1) {
            field714 = 0;
            method733(field783, 0, 0, Statics.field1350, Statics.field5, 0, 0, -1);
        }
        class393.method6234();
        if (field633) {
            if (field727 == 1) {
                Statics.field1646[field736 / 100].method6352(field724 - 8, field725 - 8);
            }
            if (field727 == 2) {
                Statics.field1646[field736 / 100 + 4].method6352(field724 - 8, field725 - 8);
            }
        }
        if (field759) {
            int var2 = Statics.field1729;
            int var3 = Statics.field1617;
            int var4 = Statics.field1451;
            int var5 = Statics.field1221;
            int var6 = 6116423;
            class393.method6184(var2, var3, var4, var5, var6);
            class393.method6184(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class393.method6192(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field3767.method4924(class269.field3385, var2 + 3, var3 + 14, var6, -1);
            int var7 = class48.field368;
            int var8 = class48.field362;
            for (int var9 = 0; var9 < field900; var9++) {
                int var10 = (field900 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field3767.method4924(method2(var9), var2 + 3, var10, var11, 0);
            }
            method1000(Statics.field1729, Statics.field1617, Statics.field1451, Statics.field1221);
        } else if (field680 != -1) {
            method160(field680, field893);
        }
        if (field839 == 3) {
            for (int var12 = 0; var12 < field714; var12++) {
                if (field834[var12]) {
                    class393.method6183(field772[var12], field754[var12], field837[var12], field838[var12], 16711935, 128);
                } else if (field713[var12]) {
                    class393.method6183(field772[var12], field754[var12], field837[var12], field838[var12], 16711680, 128);
                }
            }
        }
        class78.method2241(Statics.field438, Statics.field3197.field1242, Statics.field3197.field1223, field684);
        field684 = 0;
    }

    @ObfuscatedName("eg.gp(Ljava/lang/String;ZI)V")
    public static final void method2509(String arg0, boolean arg1) {
        if (!field875) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3858.method4935(arg0, 250);
        int var6 = Statics.field3858.method4892(arg0, 250) * 13;
        class393.method6184(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class393.method6192(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3858.method4897(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method5745(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2061.method380(0, 0);
        } else {
            method1000(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("dr.gr(IIIII)V")
    public static final void method2286(int arg0, int arg1, int arg2, int arg3) {
        field721++;
        if (Statics.field3197.field1242 >> 7 == field859 && Statics.field3197.field1223 >> 7 == field676) {
            field859 = 0;
        }
        method158();
        method578();
        method325(true);
        int var4 = class110.field1359;
        int[] var5 = class110.field1365;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field836 != var5[var6] && field720 != var5[var6]) {
                method2938(field739[var5[var6]], true);
            }
        }
        method325(false);
        method4233();
        for (class80 var7 = (class80) field717.method4721(); var7 != null; var7 = (class80) field717.method4723()) {
            if (Statics.field438 != var7.field972 || var7.field980) {
                var7.method5407();
            } else if (field631 >= var7.field971) {
                var7.method1755(field684);
                if (var7.field980) {
                    var7.method5407();
                } else {
                    Statics.field292.method3582(var7.field972, var7.field976, var7.field974, var7.field975, 60, var7, 0, -1L, false);
                }
            }
        }
        method1698(arg0, arg1, arg2, arg3, true);
        int var8 = field885;
        int var9 = field886;
        int var10 = field887;
        int var11 = field888;
        class393.method6217(var8, var9, var8 + var10, var9 + var11);
        class197.method3493();
        if (!field879) {
            int var12 = field692;
            if (field709 / 256 > var12) {
                var12 = field709 / 256;
            }
            if (field872[4] && field874[4] + 128 > var12) {
                var12 = field874[4] + 128;
            }
            int var13 = field693 & 0x7FF;
            method2576(Statics.field932, Statics.field125, Statics.field1716, var12, var13, method2389(var12), var11);
        }
        int var26;
        if (field879) {
            var26 = Statics.method2101();
        } else {
            int var14;
            if (Statics.field40.field1321) {
                var14 = Statics.field438;
            } else {
                label303: {
                    int var15 = 3;
                    if (Statics.field570 < 310) {
                        int var16;
                        int var17;
                        if (field698 == 1) {
                            var16 = Statics.field932 >> 7;
                            var17 = Statics.field1716 >> 7;
                        } else {
                            var16 = Statics.field3197.field1242 >> 7;
                            var17 = Statics.field3197.field1223 >> 7;
                        }
                        int var18 = Statics.field949 >> 7;
                        int var19 = Statics.field293 >> 7;
                        if (var18 < 0 || var19 < 0 || var18 >= 104 || var19 >= 104) {
                            var14 = Statics.field438;
                            break label303;
                        }
                        if (var16 < 0 || var17 < 0 || var16 >= 104 || var17 >= 104) {
                            var14 = Statics.field438;
                            break label303;
                        }
                        if ((class90.field1097[Statics.field438][var18][var19] & 0x4) != 0) {
                            var15 = Statics.field438;
                        }
                        int var20;
                        if (var16 > var18) {
                            var20 = var16 - var18;
                        } else {
                            var20 = var18 - var16;
                        }
                        int var21;
                        if (var17 > var19) {
                            var21 = var17 - var19;
                        } else {
                            var21 = var19 - var17;
                        }
                        if (var20 > var21) {
                            int var22 = var21 * 65536 / var20;
                            int var23 = 32768;
                            while (var16 != var18) {
                                if (var18 < var16) {
                                    var18++;
                                } else if (var18 > var16) {
                                    var18--;
                                }
                                if ((class90.field1097[Statics.field438][var18][var19] & 0x4) != 0) {
                                    var15 = Statics.field438;
                                }
                                var23 += var22;
                                if (var23 >= 65536) {
                                    var23 -= 65536;
                                    if (var19 < var17) {
                                        var19++;
                                    } else if (var19 > var17) {
                                        var19--;
                                    }
                                    if ((class90.field1097[Statics.field438][var18][var19] & 0x4) != 0) {
                                        var15 = Statics.field438;
                                    }
                                }
                            }
                        } else if (var21 > 0) {
                            int var24 = var20 * 65536 / var21;
                            int var25 = 32768;
                            while (var17 != var19) {
                                if (var19 < var17) {
                                    var19++;
                                } else if (var19 > var17) {
                                    var19--;
                                }
                                if ((class90.field1097[Statics.field438][var18][var19] & 0x4) != 0) {
                                    var15 = Statics.field438;
                                }
                                var25 += var24;
                                if (var25 >= 65536) {
                                    var25 -= 65536;
                                    if (var18 < var16) {
                                        var18++;
                                    } else if (var18 > var16) {
                                        var18--;
                                    }
                                    if ((class90.field1097[Statics.field438][var18][var19] & 0x4) != 0) {
                                        var15 = Statics.field438;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field3197.field1242 >= 0 && Statics.field3197.field1223 >= 0 && Statics.field3197.field1242 < 13312 && Statics.field3197.field1223 < 13312) {
                        if ((class90.field1097[Statics.field438][Statics.field3197.field1242 >> 7][Statics.field3197.field1223 >> 7] & 0x4) != 0) {
                            var15 = Statics.field438;
                        }
                        var14 = var15;
                    } else {
                        var14 = Statics.field438;
                    }
                }
            }
            var26 = var14;
        }
        int var27 = Statics.field949;
        int var28 = Statics.field1923;
        int var29 = Statics.field293;
        int var30 = Statics.field570;
        int var31 = Statics.field227;
        for (int var32 = 0; var32 < 5; var32++) {
            if (field872[var32]) {
                int var33 = (int) (Math.random() * (double) (field873[var32] * 2 + 1) - (double) field873[var32] + Math.sin((double) field868[var32] / 100.0D * (double) field876[var32]) * (double) field874[var32]);
                if (var32 == 0) {
                    Statics.field949 += var33;
                }
                if (var32 == 1) {
                    Statics.field1923 += var33;
                }
                if (var32 == 2) {
                    Statics.field293 += var33;
                }
                if (var32 == 3) {
                    Statics.field227 = Statics.field227 + var33 & 0x7FF;
                }
                if (var32 == 4) {
                    Statics.field570 += var33;
                    if (Statics.field570 < 128) {
                        Statics.field570 = 128;
                    }
                    if (Statics.field570 > 383) {
                        Statics.field570 = 383;
                    }
                }
            }
        }
        int var34 = class48.field368;
        int var35 = class48.field362;
        if (class48.field356 != 0) {
            var34 = class48.field361;
            var35 = class48.field352;
        }
        if (var34 >= var8 && var34 < var8 + var10 && var35 >= var9 && var35 < var9 + var11) {
            class207.method198(var34 - var8, var35 - var9);
        } else {
            class207.field2493 = false;
            class207.field2501 = 0;
        }
        method4062();
        class393.method6184(var8, var9, var10, var11, 0);
        method4062();
        int var36 = class197.field2270;
        class197.field2270 = field889;
        Statics.field292.method3616(Statics.field949, Statics.field1923, Statics.field293, Statics.field570, Statics.field227, var26);
        class197.field2270 = var36;
        method4062();
        Statics.field292.method3658();
        method3317(var8, var9, var10, var11);
        if (field639 == 2) {
            method45((field829 - Statics.field127 << 7) + field645, (field701 - Statics.field2092 << 7) + field646, field644 * 2);
            if (field722 > -1 && field631 % 20 < 10) {
                Statics.field3172[0].method6352(field722 + var8 - 12, field723 + var9 - 28);
            }
        }
        ((class204) Statics.field2284).method3808(field684);
        method5255();
        Statics.field949 = var27;
        Statics.field1923 = var28;
        Statics.field293 = var29;
        Statics.field570 = var30;
        Statics.field227 = var31;
        if (field884 && class277.method4498(true, false) == 0) {
            field884 = false;
        }
        if (field884) {
            class393.method6184(var8, var9, var10, var11, 0);
            method2509(class269.field3241, false);
        }
    }

    @ObfuscatedName("cm.gy(IIIIZB)V")
    public static final void method1698(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field877;
        } else if (var5 >= 100) {
            var6 = field878;
        } else {
            var6 = (field878 - field877) * var5 / 100 + field877;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field882) {
            short var8 = field882;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field865) {
                var6 = field865;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class393.method6234();
                    class393.method6184(arg0, arg1, var10, arg3, -16777216);
                    class393.method6184(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field691) {
            short var11 = field691;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field881) {
                var6 = field881;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class393.method6234();
                    class393.method6184(arg0, arg1, arg2, var13, -16777216);
                    class393.method6184(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field889 = arg3 * var6 / 334;
        if (field887 != arg2 || field888 != arg3) {
            method155(arg2, arg3);
        }
        field885 = arg0;
        field886 = arg1;
        field887 = arg2;
        field888 = arg3;
    }

    @ObfuscatedName("t.gi(I)V")
    public static void method158() {
        if (field742) {
            method2938(Statics.field3197, false);
        }
    }

    @ObfuscatedName("ai.gc(I)V")
    public static void method578() {
        if (field836 >= 0 && field739[field836] != null) {
            method2938(field739[field836], false);
        }
    }

    @ObfuscatedName("fx.gj(Lcj;ZI)V")
    public static void method2938(class98 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1987() || arg0.field1189) {
            return;
        }
        arg0.field1194 = false;
        if ((field624 && class110.field1359 > 50 || class110.field1359 > 200) && arg1 && arg0.field1252 == arg0.field1248) {
            arg0.field1194 = true;
        }
        int var2 = arg0.field1242 >> 7;
        int var3 = arg0.field1223 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class207.method2277(0, 0, 0, false, arg0.field1193);
        if (arg0.field1204 != null && field631 >= arg0.field1184 && field631 < arg0.field1185) {
            arg0.field1194 = false;
            arg0.field1183 = method1921(arg0.field1242, arg0.field1223, Statics.field438);
            arg0.field1227 = field631;
            Statics.field292.method3590(Statics.field438, arg0.field1242, arg0.field1223, arg0.field1183, 60, arg0, arg0.field1224, var4, arg0.field1190, arg0.field1191, arg0.field1192, arg0.field1196);
            return;
        }
        if ((arg0.field1242 & 0x7F) == 64 && (arg0.field1223 & 0x7F) == 64) {
            if (field721 == field827[var2][var3]) {
                return;
            }
            field827[var2][var3] = field721;
        }
        arg0.field1183 = method1921(arg0.field1242, arg0.field1223, Statics.field438);
        arg0.field1227 = field631;
        Statics.field292.method3582(Statics.field438, arg0.field1242, arg0.field1223, arg0.field1183, 60, arg0, arg0.field1224, var4, arg0.field1225);
    }

    @ObfuscatedName("al.go(ZI)V")
    public static final void method325(boolean arg0) {
        for (int var1 = 0; var1 < field665; var1++) {
            class105 var2 = field664[field666[var1]];
            if (var2 != null && var2.method1987() && var2.field1328.field1668 == arg0 && var2.field1328.method2539()) {
                int var3 = var2.field1242 >> 7;
                int var4 = var2.field1223 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1226 == 1 && (var2.field1242 & 0x7F) == 64 && (var2.field1223 & 0x7F) == 64) {
                        if (field721 == field827[var3][var4]) {
                            continue;
                        }
                        field827[var3][var4] = field721;
                    }
                    long var5 = class207.method2277(0, 0, 1, !var2.field1328.field1644, field666[var1]);
                    var2.field1227 = field631;
                    Statics.field292.method3582(Statics.field438, var2.field1242, var2.field1223, method1921(var2.field1242 + (var2.field1226 * 64 - 64), var2.field1223 + (var2.field1226 * 64 - 64), Statics.field438), var2.field1226 * 64 - 64 + 60, var2, var2.field1224, var5, var2.field1225);
                }
            }
        }
    }

    @ObfuscatedName("it.gd(I)V")
    public static final void method4233() {
        for (class85 var0 = (class85) field753.method4721(); var0 != null; var0 = (class85) field753.method4723()) {
            if (Statics.field438 != var0.field1048 || field631 > var0.field1045) {
                var0.method5407();
            } else if (field631 >= var0.field1044) {
                if (var0.field1038 > 0) {
                    class105 var1 = field664[var0.field1038 - 1];
                    if (var1 != null && var1.field1242 >= 0 && var1.field1242 < 13312 && var1.field1223 >= 0 && var1.field1223 < 13312) {
                        var0.method1806(var1.field1242, var1.field1223, method1921(var1.field1242, var1.field1223, var0.field1048) - var0.field1043, field631);
                    }
                }
                if (var0.field1038 < 0) {
                    int var2 = -var0.field1038 - 1;
                    class98 var3;
                    if (field720 == var2) {
                        var3 = Statics.field3197;
                    } else {
                        var3 = field739[var2];
                    }
                    if (var3 != null && var3.field1242 >= 0 && var3.field1242 < 13312 && var3.field1223 >= 0 && var3.field1223 < 13312) {
                        var0.method1806(var3.field1242, var3.field1223, method1921(var3.field1242, var3.field1223, var0.field1048) - var0.field1043, field631);
                    }
                }
                var0.method1807(field684);
                Statics.field292.method3582(Statics.field438, (int) var0.field1039, (int) var0.field1051, (int) var0.field1052, 60, var0, var0.field1049, -1L, false);
            }
        }
    }

    @ObfuscatedName("fp.gv(B)Z")
    public static boolean method3268() {
        return (field685 & 0x4) != 0;
    }

    @ObfuscatedName("y.hp(I)Z")
    public static boolean method46() {
        return (field685 & 0x2) != 0;
    }

    @ObfuscatedName("aj.he(Lcj;I)Z")
    public static boolean method329(class98 arg0) {
        if (field685 == 0) {
            return false;
        } else if (Statics.field3197 == arg0) {
            return (field685 & 0x8) != 0;
        } else {
            boolean var1 = method3268();
            if (!var1) {
                boolean var2 = (field685 & 0x1) != 0;
                var1 = var2 && arg0.method1945();
            }
            return var1 || method46() && arg0.method1948();
        }
    }

    @ObfuscatedName("dt.hr(Lcl;IIIIII)V")
    public static final void method2243(class100 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1987()) {
            return;
        }
        if (arg0 instanceof class105) {
            class147 var6 = ((class105) arg0).field1328;
            if (var6.field1667 != null) {
                var6 = var6.method2538();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class110.field1359;
        int[] var8 = class110.field1365;
        byte var9 = 0;
        if (arg1 < var7 && field631 == arg0.field1227 && method329((class98) arg0)) {
            class98 var10 = (class98) arg0;
            if (arg1 < var7) {
                int var11 = arg0.field1273 + 15;
                method45(arg0.field1242, arg0.field1223, var11);
                class302 var12 = (class302) field674.get(class360.field4056);
                byte var13 = 9;
                var12.method4884(var10.field1175.method5264(), field722 + arg2, field723 + arg3 - var13, 16777215, 0);
                var9 = 18;
            }
        }
        int var14 = -2;
        if (!arg0.field1251.method4775()) {
            int var15 = arg0.field1273 + 15;
            method45(arg0.field1242, arg0.field1223, var15);
            for (class104 var16 = (class104) arg0.field1251.method4771(); var16 != null; var16 = (class104) arg0.field1251.method4773()) {
                class101 var17 = var16.method2067(field631);
                if (var17 != null) {
                    class143 var18 = var16.field1326;
                    class397 var19 = var18.method2480();
                    class397 var20 = var18.method2490();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field1613;
                    } else {
                        if (var18.field1600 * 2 < var20.field4262) {
                            var21 = var18.field1600;
                        }
                        var22 = var20.field4262 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field631 - var17.field1288;
                    int var26 = var17.field1285 * var22 / var18.field1613;
                    int var29;
                    if (var17.field1290 > var25) {
                        int var27 = var18.field1608 == 0 ? 0 : var25 / var18.field1608 * var18.field1608;
                        int var28 = var17.field1284 * var22 / var18.field1613;
                        var29 = (var26 - var28) * var27 / var17.field1290 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1290 + var18.field1609 - var25;
                        if (var18.field1607 >= 0) {
                            var23 = (var30 << 8) / (var18.field1609 - var18.field1607);
                        }
                    }
                    if (var17.field1285 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var14 += 5;
                        if (field722 > -1) {
                            int var36 = field722 + arg2 - (var22 >> 1);
                            int var37 = field723 + arg3 - var14;
                            class393.method6184(var36, var37, var29, 5, 65280);
                            class393.method6184(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var14 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field4254;
                        var14 += var32;
                        int var33 = field722 + arg2 - (var22 >> 1);
                        int var34 = field723 + arg3 - var14;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method6292(var35, var34, var23);
                            class393.method6205(var35, var34, var31 + var35, var32 + var34);
                            var20.method6292(var35, var34, var23);
                        } else {
                            var19.method6352(var35, var34);
                            class393.method6205(var35, var34, var31 + var35, var32 + var34);
                            var20.method6352(var35, var34);
                        }
                        class393.method6217(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var14 += 2;
                    }
                } else if (var16.method2065()) {
                    var16.method5407();
                }
            }
        }
        if (var14 == -2) {
            var14 += 7;
        }
        int var38 = var9 + var14;
        if (arg1 < var7) {
            class98 var39 = (class98) arg0;
            if (var39.field1189) {
                return;
            }
            if (var39.field1182 != -1 || var39.field1177 != -1) {
                int var40 = arg0.field1273 + 15;
                method45(arg0.field1242, arg0.field1223, var40);
                if (field722 > -1) {
                    if (var39.field1182 != -1) {
                        var38 += 25;
                        Statics.field587[var39.field1182].method6352(field722 + arg2 - 12, field723 + arg3 - var38);
                    }
                    if (var39.field1177 != -1) {
                        var38 += 25;
                        Statics.field171[var39.field1177].method6352(field722 + arg2 - 12, field723 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field639 == 10 && field780 == var8[arg1]) {
                int var41 = arg0.field1273 + 15;
                method45(arg0.field1242, arg0.field1223, var41);
                if (field722 > -1) {
                    int var42 = Statics.field3172[1].field4254 + var38;
                    Statics.field3172[1].method6352(field722 + arg2 - 12, field723 + arg3 - var42);
                }
            }
        } else {
            class147 var43 = ((class105) arg0).field1328;
            if (var43.field1667 != null) {
                var43 = var43.method2538();
            }
            if (var43.field1665 >= 0 && var43.field1665 < Statics.field171.length) {
                int var44 = arg0.field1273 + 15;
                method45(arg0.field1242, arg0.field1223, var44);
                if (field722 > -1) {
                    Statics.field171[var43.field1665].method6352(field722 + arg2 - 12, field723 + arg3 - 30);
                }
            }
            if (field639 == 1 && field763 == field666[arg1 - var7] && field631 % 20 < 10) {
                int var45 = arg0.field1273 + 15;
                method45(arg0.field1242, arg0.field1223, var45);
                if (field722 > -1) {
                    Statics.field3172[0].method6352(field722 + arg2 - 12, field723 + arg3 - 28);
                }
            }
        }
        if (arg0.field1232 != null && (arg1 >= var7 || !arg0.field1254 && (field843 == 4 || !arg0.field1237 && (field843 == 0 || field843 == 3 || field843 == 1 && ((class98) arg0).method1945())))) {
            int var46 = arg0.field1273;
            method45(arg0.field1242, arg0.field1223, var46);
            if (field722 > -1 && field710 < field711) {
                field871[field710] = Statics.field3767.method4889(arg0.field1232) / 2;
                field901[field710] = Statics.field3767.field3728;
                field648[field710] = field722;
                field719[field710] = field723;
                field716[field710] = arg0.field1240;
                field675[field710] = arg0.field1241;
                field718[field710] = arg0.field1239;
                field737[field710] = arg0.field1232;
                field710++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field1245[var47];
            int var49 = arg0.field1262[var47];
            class154 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field631) {
                    continue;
                }
                var50 = class154.method942(arg0.field1262[var47]);
                var51 = var50.field1739;
                if (var50 != null && var50.field1750 != null) {
                    var50 = var50.method2663();
                    if (var50 == null) {
                        arg0.field1245[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var52 = arg0.field1246[var47];
            class154 var53 = null;
            if (var52 >= 0) {
                var53 = class154.method942(var52);
                if (var53 != null && var53.field1750 != null) {
                    var53 = var53.method2663();
                }
            }
            if (var48 - var51 <= field631) {
                if (var50 == null) {
                    arg0.field1245[var47] = -1;
                } else {
                    int var54 = arg0.field1273 / 2;
                    method45(arg0.field1242, arg0.field1223, var54);
                    if (field722 > -1) {
                        if (var47 == 1) {
                            field723 -= 20;
                        }
                        if (var47 == 2) {
                            field722 -= 15;
                            field723 -= 10;
                        }
                        if (var47 == 3) {
                            field722 += 15;
                            field723 -= 10;
                        }
                        Object var55 = null;
                        Object var56 = null;
                        Object var57 = null;
                        Object var58 = null;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        class397 var67 = null;
                        class397 var68 = null;
                        class397 var69 = null;
                        class397 var70 = null;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        class397 var80 = var50.method2665();
                        if (var80 != null) {
                            var59 = var80.field4262;
                            int var81 = var80.field4254;
                            if (var81 > var79) {
                                var79 = var81;
                            }
                            var63 = var80.field4257;
                        }
                        class397 var82 = var50.method2692();
                        if (var82 != null) {
                            var60 = var82.field4262;
                            int var83 = var82.field4254;
                            if (var83 > var79) {
                                var79 = var83;
                            }
                            var64 = var82.field4257;
                        }
                        class397 var84 = var50.method2667();
                        if (var84 != null) {
                            var61 = var84.field4262;
                            int var85 = var84.field4254;
                            if (var85 > var79) {
                                var79 = var85;
                            }
                            var65 = var84.field4257;
                        }
                        class397 var86 = var50.method2668();
                        if (var86 != null) {
                            var62 = var86.field4262;
                            int var87 = var86.field4254;
                            if (var87 > var79) {
                                var79 = var87;
                            }
                            var66 = var86.field4257;
                        }
                        if (var53 != null) {
                            var67 = var53.method2665();
                            if (var67 != null) {
                                var71 = var67.field4262;
                                int var88 = var67.field4254;
                                if (var88 > var79) {
                                    var79 = var88;
                                }
                                var75 = var67.field4257;
                            }
                            var68 = var53.method2692();
                            if (var68 != null) {
                                var72 = var68.field4262;
                                int var89 = var68.field4254;
                                if (var89 > var79) {
                                    var79 = var89;
                                }
                                var76 = var68.field4257;
                            }
                            var69 = var53.method2667();
                            if (var69 != null) {
                                var73 = var69.field4262;
                                int var90 = var69.field4254;
                                if (var90 > var79) {
                                    var79 = var90;
                                }
                                var77 = var69.field4257;
                            }
                            var70 = var53.method2668();
                            if (var70 != null) {
                                var74 = var70.field4262;
                                int var91 = var70.field4254;
                                if (var91 > var79) {
                                    var79 = var91;
                                }
                                var78 = var70.field4257;
                            }
                        }
                        class301 var92 = var50.method2669();
                        if (var92 == null) {
                            var92 = Statics.field1459;
                        }
                        class301 var93;
                        if (var53 == null) {
                            var93 = Statics.field1459;
                        } else {
                            var93 = var53.method2669();
                            if (var93 == null) {
                                var93 = Statics.field1459;
                            }
                        }
                        Object var94 = null;
                        String var95 = null;
                        boolean var96 = false;
                        int var97 = 0;
                        String var98 = var50.method2691(arg0.field1244[var47]);
                        int var99 = var92.method4889(var98);
                        if (var53 != null) {
                            var95 = var53.method2691(arg0.field1247[var47]);
                            var97 = var93.method4889(var95);
                        }
                        int var100 = 0;
                        int var101 = 0;
                        if (var60 > 0) {
                            if (var84 == null && var86 == null) {
                                var100 = 1;
                            } else {
                                var100 = var99 / var60 + 1;
                            }
                        }
                        if (var53 != null && var72 > 0) {
                            if (var69 == null && var70 == null) {
                                var101 = 1;
                            } else {
                                var101 = var97 / var72 + 1;
                            }
                        }
                        int var102 = 0;
                        int var103 = var102;
                        if (var59 > 0) {
                            var102 += var59;
                        }
                        var102 += 2;
                        int var104 = var102;
                        if (var61 > 0) {
                            var102 += var61;
                        }
                        int var105 = var102;
                        int var106 = var102;
                        int var108;
                        if (var60 > 0) {
                            int var107 = var60 * var100;
                            var108 = var102 + var107;
                            var106 = (var107 - var99) / 2 + var102;
                        } else {
                            var108 = var99 + var102;
                        }
                        int var109 = var108;
                        if (var62 > 0) {
                            var108 += var62;
                        }
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        if (var53 != null) {
                            var108 += 2;
                            var110 = var108;
                            if (var71 > 0) {
                                var108 += var71;
                            }
                            var108 += 2;
                            var111 = var108;
                            if (var73 > 0) {
                                var108 += var73;
                            }
                            var112 = var108;
                            var114 = var108;
                            if (var72 > 0) {
                                int var115 = var72 * var101;
                                var108 += var115;
                                var114 += (var115 - var97) / 2;
                            } else {
                                var108 += var97;
                            }
                            var113 = var108;
                            if (var74 > 0) {
                                var108 += var74;
                            }
                        }
                        int var116 = arg0.field1245[var47] - field631;
                        int var117 = var50.field1734 - var50.field1734 * var116 / var50.field1739;
                        int var118 = var50.field1745 * var116 / var50.field1739 + -var50.field1745;
                        int var119 = field722 + arg2 - (var108 >> 1) + var117;
                        int var120 = field723 + arg3 - 12 + var118;
                        int var121 = var120;
                        int var122 = var79 + var120;
                        int var123 = var50.field1749 + var120 + 15;
                        int var124 = var123 - var92.field3729;
                        int var125 = var92.field3730 + var123;
                        if (var124 < var120) {
                            var121 = var124;
                        }
                        if (var125 > var122) {
                            var122 = var125;
                        }
                        int var126 = 0;
                        if (var53 != null) {
                            var126 = var53.field1749 + var120 + 15;
                            int var127 = var126 - var93.field3729;
                            int var128 = var93.field3730 + var126;
                            if (var127 < var121) {
                                ;
                            }
                            if (var128 > var122) {
                                ;
                            }
                        }
                        int var131 = 255;
                        if (var50.field1746 >= 0) {
                            var131 = (var116 << 8) / (var50.field1739 - var50.field1746);
                        }
                        if (var131 >= 0 && var131 < 255) {
                            if (var80 != null) {
                                var80.method6292(var103 + var119 - var63, var120, var131);
                            }
                            if (var84 != null) {
                                var84.method6292(var104 + var119 - var65, var120, var131);
                            }
                            if (var82 != null) {
                                for (int var132 = 0; var132 < var100; var132++) {
                                    var82.method6292(var60 * var132 + (var105 + var119 - var64), var120, var131);
                                }
                            }
                            if (var86 != null) {
                                var86.method6292(var109 + var119 - var66, var120, var131);
                            }
                            var92.method4953(var98, var106 + var119, var123, var50.field1738, 0, var131);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6292(var110 + var119 - var75, var120, var131);
                                }
                                if (var69 != null) {
                                    var69.method6292(var111 + var119 - var77, var120, var131);
                                }
                                if (var68 != null) {
                                    for (int var133 = 0; var133 < var101; var133++) {
                                        var68.method6292(var72 * var133 + (var112 + var119 - var76), var120, var131);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6292(var113 + var119 - var78, var120, var131);
                                }
                                var93.method4953(var95, var114 + var119, var126, var53.field1738, 0, var131);
                            }
                        } else {
                            if (var80 != null) {
                                var80.method6352(var103 + var119 - var63, var120);
                            }
                            if (var84 != null) {
                                var84.method6352(var104 + var119 - var65, var120);
                            }
                            if (var82 != null) {
                                for (int var134 = 0; var134 < var100; var134++) {
                                    var82.method6352(var60 * var134 + (var105 + var119 - var64), var120);
                                }
                            }
                            if (var86 != null) {
                                var86.method6352(var109 + var119 - var66, var120);
                            }
                            var92.method4924(var98, var106 + var119, var123, var50.field1738 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6352(var110 + var119 - var75, var120);
                                }
                                if (var69 != null) {
                                    var69.method6352(var111 + var119 - var77, var120);
                                }
                                if (var68 != null) {
                                    for (int var135 = 0; var135 < var101; var135++) {
                                        var68.method6352(var72 * var135 + (var112 + var119 - var76), var120);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6352(var113 + var119 - var78, var120);
                                }
                                var93.method4924(var95, var114 + var119, var126, var53.field1738 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.hy(IIIII)V")
    public static final void method3317(int arg0, int arg1, int arg2, int arg3) {
        field710 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class110.field1359;
        int[] var8 = class110.field1365;
        for (int var9 = 0; var9 < field665 + var7; var9++) {
            class100 var10;
            if (var9 < var7) {
                var10 = field739[var8[var9]];
                if (field836 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field3197 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field664[field666[var9 - var7]];
            }
            method2243(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field742 && var6 != -1) {
            method2243(Statics.field3197, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2243(field739[field836], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field710; var11++) {
            int var12 = field648[var11];
            int var13 = field719[var11];
            int var14 = field871[var11];
            int var15 = field901[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field719[var17] - field901[var17] && var13 - var15 < field719[var17] + 2 && var12 - var14 < field871[var17] + field648[var17] && var12 + var14 > field648[var17] - field871[var17] && field719[var17] - field901[var17] < var13) {
                        var13 = field719[var17] - field901[var17];
                        var16 = true;
                    }
                }
            }
            field722 = field648[var11];
            field723 = field719[var11] = var13;
            String var18 = field737[var11];
            if (field791 == 0) {
                int var19 = 16776960;
                if (field716[var11] < 6) {
                    var19 = field726[field716[var11]];
                }
                if (field716[var11] == 6) {
                    var19 = field721 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field716[var11] == 7) {
                    var19 = field721 % 20 < 10 ? 255 : 65535;
                }
                if (field716[var11] == 8) {
                    var19 = field721 % 20 < 10 ? 45056 : 8454016;
                }
                if (field716[var11] == 9) {
                    int var20 = 150 - field718[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field716[var11] == 10) {
                    int var21 = 150 - field718[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field716[var11] == 11) {
                    int var22 = 150 - field718[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field675[var11] == 0) {
                    Statics.field3767.method4884(var18, field722 + arg0, field723 + arg1, var19, 0);
                }
                if (field675[var11] == 1) {
                    Statics.field3767.method4898(var18, field722 + arg0, field723 + arg1, var19, 0, field721);
                }
                if (field675[var11] == 2) {
                    Statics.field3767.method4945(var18, field722 + arg0, field723 + arg1, var19, 0, field721);
                }
                if (field675[var11] == 3) {
                    Statics.field3767.method4900(var18, field722 + arg0, field723 + arg1, var19, 0, field721, 150 - field718[var11]);
                }
                if (field675[var11] == 4) {
                    int var23 = (150 - field718[var11]) * (Statics.field3767.method4889(var18) + 100) / 150;
                    class393.method6205(field722 + arg0 - 50, arg1, field722 + arg0 + 50, arg1 + arg3);
                    Statics.field3767.method4924(var18, field722 + arg0 + 50 - var23, field723 + arg1, var19, 0);
                    class393.method6217(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field675[var11] == 5) {
                    int var24 = 150 - field718[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class393.method6205(arg0, field723 + arg1 - Statics.field3767.field3728 - 1, arg0 + arg2, field723 + arg1 + 5);
                    Statics.field3767.method4884(var18, field722 + arg0, field723 + arg1 + var25, var19, 0);
                    class393.method6217(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3767.method4884(var18, field722 + arg0, field723 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ly.hd(I)V")
    public static final void method5255() {
        field630 = 0;
        int var0 = (Statics.field3197.field1242 >> 7) + Statics.field127;
        int var1 = (Statics.field3197.field1223 >> 7) + Statics.field2092;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field630 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field630 = 1;
        }
        if (field630 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field630 = 0;
        }
    }

    @ObfuscatedName("y.hf(IIII)V")
    public static final void method45(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field722 = -1;
            field723 = -1;
            return;
        }
        int var3 = method1921(arg0, arg1, Statics.field438) - arg2;
        int var4 = arg0 - Statics.field949;
        int var5 = var3 - Statics.field1923;
        int var6 = arg1 - Statics.field293;
        int var7 = class197.field2271[Statics.field570];
        int var8 = class197.field2285[Statics.field570];
        int var9 = class197.field2271[Statics.field227];
        int var10 = class197.field2285[Statics.field227];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field722 = field889 * var11 / var15 + field887 / 2;
            field723 = field889 * var14 / var15 + field888 / 2;
        } else {
            field722 = -1;
            field723 = -1;
        }
    }

    @ObfuscatedName("cy.hi(IIIB)I")
    public static final int method1921(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class90.field1097[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class90.field1099[var5][var3][var4] + class90.field1099[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class90.field1099[var5][var3][var4 + 1] + class90.field1099[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ee.hk(IIIIIIII)V")
    public static final void method2576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field880 - field654) * var7 / 100 + field654;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class197.field2271[var11];
            int var17 = class197.field2285[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class197.field2271[var12];
            int var20 = class197.field2285[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field949 = arg0 - var13;
        Statics.field1923 = arg1 - var14;
        Statics.field293 = arg2 - var15;
        Statics.field570 = arg3;
        Statics.field227 = arg4;
        if (field698 != 1 || field792 < 2 || field631 % 50 != 0 || !(Statics.field932 >> 7 != Statics.field3197.field1242 >> 7 || Statics.field1716 >> 7 != Statics.field3197.field1223 >> 7)) {
            return;
        }
        int var22 = Statics.field3197.field1197;
        int var23 = (Statics.field932 >> 7) + Statics.field127;
        int var24 = (Statics.field1716 >> 7) + Statics.field2092;
        class228 var25 = class228.method1927(class226.field2597, field669.field1410);
        var25.field2700.method5881(var23);
        var25.field2700.method5943(field705);
        var25.field2700.method5924(var22);
        var25.field2700.method5932(var24);
        field669.method2200(var25);
    }

    @ObfuscatedName("an.hx(ZLns;I)V")
    public static final void method284(boolean arg0, class383 arg1) {
        field681 = arg0;
        if (!field681) {
            int var2 = arg1.method5935();
            int var3 = arg1.method5899();
            int var4 = arg1.method5899();
            Statics.field55 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field55[var5][var6] = arg1.method5965();
                }
            }
            Statics.field1433 = new int[var4];
            Statics.field1420 = new int[var4];
            Statics.field3667 = new int[var4];
            Statics.field1431 = new byte[var4][];
            Statics.field3170 = new byte[var4][];
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
                        Statics.field1433[var8] = var11;
                        Statics.field1420[var8] = Statics.field37.method4582("m" + var9 + "_" + var10);
                        Statics.field3667[var8] = Statics.field37.method4582("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4431(var2, var3, true);
            return;
        }
        int var12 = arg1.method5935();
        boolean var13 = arg1.method5902() == 1;
        int var14 = arg1.method5935();
        int var15 = arg1.method5899();
        arg1.method5842();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5850(1);
                    if (var19 == 1) {
                        field845[var16][var17][var18] = arg1.method5850(26);
                    } else {
                        field845[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5851();
        Statics.field55 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field55[var20][var21] = arg1.method5965();
            }
        }
        Statics.field1433 = new int[var15];
        Statics.field1420 = new int[var15];
        Statics.field3667 = new int[var15];
        Statics.field1431 = new byte[var15][];
        Statics.field3170 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field845[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1433[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1433[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1420[var22] = Statics.field37.method4582("m" + var31 + "_" + var32);
                            Statics.field3667[var22] = Statics.field37.method4582("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4431(var14, var12, !var13);
    }

    @ObfuscatedName("jg.hc(IIZI)V")
    public static final void method4431(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field112 == arg0 && Statics.field1920 == arg1) {
            return;
        }
        Statics.field112 = arg0;
        Statics.field1920 = arg1;
        method1814(25);
        method2509(class269.field3241, true);
        int var3 = Statics.field127;
        int var4 = Statics.field2092;
        Statics.field127 = (arg0 - 6) * 8;
        Statics.field2092 = (arg1 - 6) * 8;
        int var5 = Statics.field127 - var3;
        int var6 = Statics.field2092 - var4;
        int var7 = Statics.field127;
        int var8 = Statics.field2092;
        for (int var9 = 0; var9 < 32768; var9++) {
            class105 var10 = field664[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1278[var11] -= var5;
                    var10.field1279[var11] -= var6;
                }
                var10.field1242 -= var5 * 128;
                var10.field1223 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class98 var13 = field739[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1278[var14] -= var5;
                    var13.field1279[var14] -= var6;
                }
                var13.field1242 -= var5 * 128;
                var13.field1223 -= var6 * 128;
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
                        field751[var25][var21][var22] = field751[var25][var23][var24];
                    } else {
                        field751[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class99 var26 = (class99) field752.method4721(); var26 != null; var26 = (class99) field752.method4723()) {
            var26.field1220 -= var5;
            var26.field1213 -= var6;
            if (var26.field1220 < 0 || var26.field1213 < 0 || var26.field1220 >= 104 || var26.field1213 >= 104) {
                var26.method5407();
            }
        }
        if (field859 != 0) {
            field859 -= var5;
            field676 -= var6;
        }
        field864 = 0;
        field879 = false;
        Statics.field949 -= var5 << 7;
        Statics.field293 -= var6 << 7;
        Statics.field932 -= var5 << 7;
        Statics.field1716 -= var6 << 7;
        field854 = -1;
        field717.method4715();
        field753.method4715();
        for (int var27 = 0; var27 < 4; var27++) {
            field769[var27].method2894();
        }
    }

    @ObfuscatedName("cb.hm(ZI)V")
    public static final void method1839(boolean arg0) {
        method4062();
        field669.field1401++;
        if (field669.field1401 < 50 && !arg0) {
            return;
        }
        field669.field1401 = 0;
        if (field671 || field669.method2206() == null) {
            return;
        }
        class228 var1 = class228.method1927(class226.field2648, field669.field1410);
        field669.method2200(var1);
        try {
            field669.method2201();
        } catch (IOException var3) {
            field671 = true;
        }
    }

    @ObfuscatedName("fi.hh(IIIIIS)V")
    public static final void method3274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field292.method3686(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field292.method3619(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class207.method193(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field567.field4263;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class207.method1030(var5);
            class155 var15 = class155.method1864(var14);
            if (var15.field1757 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var13] = var10;
                        var12[var13 + 512] = var10;
                        var12[var13 + 1024] = var10;
                        var12[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var12[var13] = var10;
                        var12[var13 + 1] = var10;
                        var12[var13 + 2] = var10;
                        var12[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 3] = var10;
                        var12[var13 + 3 + 512] = var10;
                        var12[var13 + 3 + 1024] = var10;
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var13 + 1536] = var10;
                        var12[var13 + 1536 + 1] = var10;
                        var12[var13 + 1536 + 2] = var10;
                        var12[var13 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var13] = var10;
                    } else if (var8 == 1) {
                        var12[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var12[var13] = var10;
                        var12[var13 + 512] = var10;
                        var12[var13 + 1024] = var10;
                        var12[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var12[var13] = var10;
                        var12[var13 + 1] = var10;
                        var12[var13 + 2] = var10;
                        var12[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var12[var13 + 3] = var10;
                        var12[var13 + 3 + 512] = var10;
                        var12[var13 + 3 + 1024] = var10;
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 1536] = var10;
                        var12[var13 + 1536 + 1] = var10;
                        var12[var13 + 1536 + 2] = var10;
                        var12[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class396 var16 = Statics.field2203[var15.field1757];
                if (var16 != null) {
                    int var17 = (var15.field1772 * 4 - var16.field4246) / 2;
                    int var18 = (var15.field1773 * 4 - var16.field4249) / 2;
                    var16.method6257(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field1773) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field292.method3606(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field292.method3619(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class207.method1030(var19);
            class155 var25 = class155.method1864(var24);
            if (var25.field1757 != -1) {
                class396 var26 = Statics.field2203[var25.field1757];
                if (var26 != null) {
                    int var27 = (var25.field1772 * 4 - var26.field4246) / 2;
                    int var28 = (var25.field1773 * 4 - var26.field4249) / 2;
                    var26.method6257(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field1773) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class207.method193(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field567.field4263;
                int var32 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var31[var32 + 1536] = var29;
                    var31[var32 + 1024 + 1] = var29;
                    var31[var32 + 512 + 2] = var29;
                    var31[var32 + 3] = var29;
                } else {
                    var31[var32] = var29;
                    var31[var32 + 512 + 1] = var29;
                    var31[var32 + 1024 + 2] = var29;
                    var31[var32 + 1536 + 3] = var29;
                }
            }
        }
        long var33 = Statics.field292.method3607(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class207.method1030(var33);
        class155 var36 = class155.method1864(var35);
        if (var36.field1757 == -1) {
            return;
        }
        class396 var37 = Statics.field2203[var36.field1757];
        if (var37 != null) {
            int var38 = (var36.field1772 * 4 - var37.field4246) / 2;
            int var39 = (var36.field1773 * 4 - var37.field4249) / 2;
            var37.method6257(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field1773) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.hn(Ldq;I)Z")
    public final boolean method1400(class113 arg0) {
        class330 var2 = arg0.method2206();
        class383 var3 = arg0.field1405;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1406 == null) {
                if (arg0.field1413) {
                    if (!var2.method2384(1)) {
                        return false;
                    }
                    var2.method2368(arg0.field1405.field4160, 0, 1);
                    arg0.field1409 = 0;
                    arg0.field1413 = false;
                }
                var3.field4161 = 0;
                if (var3.method5853()) {
                    if (!var2.method2384(1)) {
                        return false;
                    }
                    var2.method2368(arg0.field1405.field4160, 1, 1);
                    arg0.field1409 = 0;
                }
                arg0.field1413 = true;
                class229[] var4 = class229.method3276();
                int var5 = var3.method5854();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4161);
                }
                arg0.field1406 = var4[var5];
                arg0.field1407 = arg0.field1406.field2789;
            }
            if (arg0.field1407 == -1) {
                if (!var2.method2384(1)) {
                    return false;
                }
                arg0.method2206().method2368(var3.field4160, 0, 1);
                arg0.field1407 = var3.field4160[0] & 0xFF;
            }
            if (arg0.field1407 == -2) {
                if (!var2.method2384(2)) {
                    return false;
                }
                arg0.method2206().method2368(var3.field4160, 0, 2);
                var3.field4161 = 0;
                arg0.field1407 = var3.method5899();
            }
            if (!var2.method2384(arg0.field1407)) {
                return false;
            }
            var3.field4161 = 0;
            var2.method2368(var3.field4160, 0, arg0.field1407);
            arg0.field1409 = 0;
            field673.method5094();
            arg0.field1400 = arg0.field1412;
            arg0.field1412 = arg0.field1411;
            arg0.field1411 = arg0.field1406;
            if (class229.field2777 == arg0.field1406) {
                Statics.field288.method1617(var3, arg0.field1407);
                field818 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2705 == arg0.field1406) {
                if (field783 != -1) {
                    method61(field783, 0);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2775 == arg0.field1406) {
                method3324();
                int var6 = var3.method6009();
                int var7 = var3.method5902();
                int var8 = var3.method5926();
                field788[var8] = var6;
                field755[var8] = var7;
                field756[var8] = 1;
                for (int var9 = 0; var9 < 98; var9++) {
                    if (var6 >= class258.field3174[var9]) {
                        field756[var8] = var9 + 2;
                    }
                }
                field642[++field814 - 1 & 0x1F] = var8;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2733 == arg0.field1406) {
                String var10 = var3.method5906();
                long var11 = (long) var3.method5899();
                long var13 = (long) var3.method5901();
                class271 var15 = (class271) class290.method2391(class271.method2098(), var3.method5902());
                long var16 = (var11 << 32) + var13;
                boolean var18 = false;
                for (int var19 = 0; var19 < 100; var19++) {
                    if (field846[var19] == var16) {
                        var18 = true;
                        break;
                    }
                }
                if (Statics.field288.method1553(new class329(var10, Statics.field1311))) {
                    var18 = true;
                }
                if (!var18 && field630 == 0) {
                    field846[field847] = var16;
                    field847 = (field847 + 1) % 100;
                    String var20 = class302.method4893(class305.method4608(class251.method2987(var3)));
                    byte var21;
                    if (var15.field3548) {
                        var21 = 7;
                    } else {
                        var21 = 3;
                    }
                    if (var15.field3547 == -1) {
                        class112.method2289(var21, var10, var20);
                    } else {
                        class112.method2289(var21, class106.method4226(var15.field3547) + var10, var20);
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2719 == arg0.field1406) {
                method2233(class227.field2687);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2759 == arg0.field1406) {
                Statics.field75 = new class341(Statics.field214);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2737 == arg0.field1406) {
                int var22 = var3.method5899();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = var3.method5965();
                int var24 = var3.method6009();
                int var25 = var3.method5937();
                if (var25 == 65535) {
                    var25 = -1;
                }
                for (int var26 = var22; var26 <= var25; var26++) {
                    long var27 = ((long) var23 << 32) + (long) var26;
                    class353 var29 = field867.method5691(var27);
                    if (var29 != null) {
                        var29.method5407();
                    }
                    field867.method5692(new class352(var24), var27);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2767 == arg0.field1406) {
                var3.field4161 += 28;
                if (var3.method5922()) {
                    method3316(var3, var3.field4161 - 28);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2725 == arg0.field1406) {
                int var30 = var3.method5965();
                int var31 = var3.method5965();
                int var32 = class47.method215();
                class228 var33 = class228.method1927(class226.field2577, field669.field1410);
                var33.field2700.method5925(field347);
                var33.field2700.method5943(var30);
                var33.field2700.method5942(var31);
                var33.field2700.method5880(var32);
                field669.method2200(var33);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2706 == arg0.field1406) {
                field879 = false;
                for (int var34 = 0; var34 < 5; var34++) {
                    field872[var34] = false;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2709 == arg0.field1406) {
                int var35 = var3.method5946();
                class248 var36 = class248.method3261(var35);
                var36.field3004 = 3;
                var36.field3005 = Statics.field3197.field1176.method4295();
                method1837(var36);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2772 == arg0.field1406) {
                int var37 = var3.method5902();
                int var38 = var3.method5902();
                int var39 = var3.method5902();
                int var40 = var3.method5902();
                field872[var37] = true;
                field873[var37] = var38;
                field874[var37] = var39;
                field868[var37] = var40;
                field876[var37] = 0;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2766 == arg0.field1406) {
                String var41 = var3.method5906();
                Object[] var42 = new Object[var41.length() + 1];
                for (int var43 = var41.length() - 1; var43 >= 0; var43--) {
                    if (var41.charAt(var43) == 's') {
                        var42[var43 + 1] = var3.method5906();
                    } else {
                        var42[var43 + 1] = Integer.valueOf(var3.method5965());
                    }
                }
                var42[0] = Integer.valueOf(var3.method5965());
                class96 var44 = new class96();
                var44.field1159 = var42;
                Statics.method3331(var44);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2780 == arg0.field1406) {
                String var45 = var3.method5906();
                String var46 = class302.method4893(class305.method4608(class251.method2987(var3)));
                class112.method2289(6, var45, var46);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2796 == arg0.field1406) {
                method1826();
                byte var47 = var3.method5968();
                if (arg0.field1407 == 1) {
                    if (var47 >= 0) {
                        field852[var47] = null;
                    } else {
                        Statics.field2008 = null;
                    }
                    arg0.field1406 = null;
                    return true;
                }
                if (var47 >= 0) {
                    field852[var47] = new class12(var3);
                } else {
                    Statics.field2008 = new class12(var3);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2754 == arg0.field1406) {
                int var48 = var3.method5902();
                if (var3.method5902() == 0) {
                    field850[var48] = new class285();
                    var3.field4161 += 18;
                } else {
                    var3.field4161--;
                    field850[var48] = new class285(var3, false);
                }
                field828 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2710 == arg0.field1406) {
                method3324();
                field682 = var3.method6109();
                field824 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2763 == arg0.field1406) {
                method2233(class227.field2688);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2723 == arg0.field1406) {
                method162(true, var3);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2800 == arg0.field1406) {
                int var49 = var3.method5937();
                if (var49 == 65535) {
                    var49 = -1;
                }
                int var50 = var3.method5946();
                int var51 = var3.method6009();
                class248 var52 = class248.method3261(var50);
                if (var52.field2955) {
                    var52.field3092 = var49;
                    var52.field3093 = var51;
                    class156 var54 = class156.method4403(var49);
                    var52.field3091 = var54.field1826;
                    var52.field3003 = var54.field1827;
                    var52.field3014 = var54.field1828;
                    var52.field3030 = var54.field1829;
                    var52.field3011 = var54.field1830;
                    var52.field3006 = var54.field1861;
                    if (var54.field1831 == 1) {
                        var52.field3020 = 1;
                    } else {
                        var52.field3020 = 2;
                    }
                    if (var52.field3012 > 0) {
                        var52.field3006 = var52.field3006 * 32 / var52.field3012;
                    } else if (var52.field3063 > 0) {
                        var52.field3006 = var52.field3006 * 32 / var52.field3063;
                    }
                    method1837(var52);
                } else if (var49 == -1) {
                    var52.field3004 = 0;
                    arg0.field1406 = null;
                    return true;
                } else {
                    class156 var53 = class156.method4403(var49);
                    var52.field3004 = 4;
                    var52.field3005 = var49;
                    var52.field3091 = var53.field1826;
                    var52.field3003 = var53.field1827;
                    var52.field3006 = var53.field1861 * 100 / var51;
                    method1837(var52);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2751 == arg0.field1406) {
                method1826();
                byte var55 = var3.method5968();
                class3 var56 = new class3(var3);
                class12 var57;
                if (var55 >= 0) {
                    var57 = field852[var55];
                } else {
                    var57 = Statics.field2008;
                }
                var56.method16(var57);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2708 == arg0.field1406) {
                boolean var58 = var3.method5902() == 1;
                if (var58) {
                    Statics.field2151 = class381.method4000() - var3.method5896();
                    Statics.field3228 = new class278(var3, true);
                } else {
                    Statics.field3228 = null;
                }
                field823 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2760 == arg0.field1406) {
                field879 = true;
                Statics.field449 = var3.method5902();
                Statics.field1352 = var3.method5902();
                Statics.field660 = var3.method5899();
                Statics.field603 = var3.method5902();
                Statics.field1708 = var3.method5902();
                if (Statics.field1708 >= 100) {
                    Statics.field949 = Statics.field449 * 128 + 64;
                    Statics.field293 = Statics.field1352 * 128 + 64;
                    Statics.field1923 = method1921(Statics.field949, Statics.field293, Statics.field438) - Statics.field660;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2707 == arg0.field1406) {
                method2233(class227.field2694);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2747 == arg0.field1406) {
                method2233(class227.field2690);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2741 == arg0.field1406) {
                class76 var59 = new class76();
                var59.field917 = var3.method5906();
                var59.field913 = var3.method5899();
                int var60 = var3.method5965();
                var59.field916 = var60;
                method1814(45);
                var2.method2364();
                Object var61 = null;
                class84.method4628(var59);
                arg0.field1406 = null;
                return false;
            }
            if (class229.field2793 == arg0.field1406) {
                int var62 = var3.method5965();
                int var63 = var3.method6041();
                int var64 = var3.method5938();
                class248 var65 = class248.method3261(var62);
                if (var65.field2970 != var63 || var65.field2954 != var64 || var65.field3010 != 0 || var65.field2967 != 0) {
                    var65.field2970 = var63;
                    var65.field2954 = var64;
                    var65.field3010 = 0;
                    var65.field2967 = 0;
                    method1837(var65);
                    this.method1064(var65);
                    if (var65.field2963 == 0) {
                        method2960(Statics.field613[var62 >> 16], var65, false);
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2778 == arg0.field1406) {
                method2233(class227.field2691);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2744 == arg0.field1406) {
                field879 = true;
                Statics.field2030 = var3.method5902();
                Statics.field316 = var3.method5902();
                Statics.field3816 = var3.method5899();
                Statics.field608 = var3.method5902();
                Statics.field167 = var3.method5902();
                if (Statics.field167 >= 100) {
                    int var66 = Statics.field2030 * 128 + 64;
                    int var67 = Statics.field316 * 128 + 64;
                    int var68 = method1921(var66, var67, Statics.field438) - Statics.field3816;
                    int var69 = var66 - Statics.field949;
                    int var70 = var68 - Statics.field1923;
                    int var71 = var67 - Statics.field293;
                    int var72 = (int) Math.sqrt((double) (var69 * var69 + var71 * var71));
                    Statics.field570 = (int) (Math.atan2((double) var70, (double) var72) * 325.949D) & 0x7FF;
                    Statics.field227 = (int) (Math.atan2((double) var69, (double) var71) * -325.949D) & 0x7FF;
                    if (Statics.field570 < 128) {
                        Statics.field570 = 128;
                    }
                    if (Statics.field570 > 383) {
                        Statics.field570 = 383;
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2727 == arg0.field1406) {
                class70.method2314(var3, arg0.field1407);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2787 == arg0.field1406) {
                method708();
                arg0.field1406 = null;
                return false;
            }
            if (class229.field2722 == arg0.field1406) {
                Statics.field288.field926.method5101(var3, arg0.field1407);
                method1543();
                field818 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2704 == arg0.field1406) {
                int var73 = var3.method5935();
                byte var74 = var3.method5966();
                class243.field2923[var73] = var74;
                if (class243.field2924[var73] != var74) {
                    class243.field2924[var73] = var74;
                }
                method58(var73);
                field809[++field810 - 1 & 0x1F] = var73;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2724 == arg0.field1406) {
                int var75 = var3.method5937();
                int var76 = var3.method5959();
                class243.field2923[var75] = var76;
                if (class243.field2924[var75] != var76) {
                    class243.field2924[var75] = var76;
                }
                method58(var75);
                field809[++field810 - 1 & 0x1F] = var75;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2752 == arg0.field1406) {
                int var77 = var3.method5928();
                int var78 = var3.method6009();
                int var79 = var3.method5935();
                class95 var80 = (class95) field796.method5691((long) var78);
                if (var80 != null) {
                    method2402(var80, var80.field1147 != var79);
                }
                method1610(var78, var79, var77);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2769 == arg0.field1406) {
                int var81 = var3.method5902();
                Statics.method3946(var81);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2758 == arg0.field1406) {
                method284(false, arg0.field1405);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2792 == arg0.field1406) {
                int var82 = var3.method5946();
                class248 var83 = class248.method3261(var82);
                for (int var84 = 0; var84 < var83.field3045.length; var84++) {
                    var83.field3045[var84] = -1;
                    var83.field3045[var84] = 0;
                }
                method1837(var83);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2776 == arg0.field1406) {
                int var85 = var3.method5938();
                int var86 = var3.method5959();
                class248 var87 = class248.method3261(var86);
                if (var87.field3008 != var85 || var85 == -1) {
                    var87.field3008 = var85;
                    var87.field3043 = 0;
                    var87.field3095 = 0;
                    method1837(var87);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2779 == arg0.field1406) {
                Statics.field75 = null;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2749 == arg0.field1406) {
                int var88 = var3.method5899();
                int var89 = var3.method5902();
                int var90 = var3.method5899();
                method153(var88, var89, var90);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2784 == arg0.field1406) {
                Statics.field129 = var3.method5927();
                Statics.field2048 = var3.method5926();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2711 == arg0.field1406) {
                int var91 = var3.method5927();
                int var92 = var3.method5902();
                String var93 = var3.method5906();
                if (var92 >= 1 && var92 <= 8) {
                    if (var93.equalsIgnoreCase(class269.field3238)) {
                        var93 = null;
                    }
                    field747[var92 - 1] = var93;
                    field748[var92 - 1] = var91 == 0;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2726 == arg0.field1406) {
                field639 = var3.method5902();
                if (field639 == 1) {
                    field763 = var3.method5899();
                }
                if (field639 >= 2 && field639 <= 6) {
                    if (field639 == 2) {
                        field645 = 64;
                        field646 = 64;
                    }
                    if (field639 == 3) {
                        field645 = 0;
                        field646 = 64;
                    }
                    if (field639 == 4) {
                        field645 = 128;
                        field646 = 64;
                    }
                    if (field639 == 5) {
                        field645 = 64;
                        field646 = 0;
                    }
                    if (field639 == 6) {
                        field645 = 64;
                        field646 = 128;
                    }
                    field639 = 2;
                    field829 = var3.method5899();
                    field701 = var3.method5899();
                    field644 = var3.method5902();
                }
                if (field639 == 10) {
                    field780 = var3.method5899();
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2783 == arg0.field1406) {
                for (int var94 = 0; var94 < class243.field2924.length; var94++) {
                    if (class243.field2924[var94] != class243.field2923[var94]) {
                        class243.field2924[var94] = class243.field2923[var94];
                        method58(var94);
                        field809[++field810 - 1 & 0x1F] = var94;
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2756 == arg0.field1406) {
                int var95 = var3.method5937();
                int var96 = var3.method5959();
                int var97 = var3.method5936();
                int var98 = var3.method5936();
                class248 var99 = class248.method3261(var96);
                if (var99.field3091 != var95 || var99.field3003 != var97 || var99.field3006 != var98) {
                    var99.field3091 = var95;
                    var99.field3003 = var97;
                    var99.field3006 = var98;
                    method1837(var99);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2738 == arg0.field1406) {
                int var100 = var3.method5911();
                boolean var101 = var3.method5902() == 1;
                String var102 = "";
                boolean var103 = false;
                if (var101) {
                    var102 = var3.method5906();
                    if (Statics.field288.method1553(new class329(var102, Statics.field1311))) {
                        var103 = true;
                    }
                }
                String var104 = var3.method5906();
                if (!var103) {
                    class112.method2289(var100, var102, var104);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2753 == arg0.field1406) {
                field821 = field808;
                byte var105 = var3.method5968();
                if (arg0.field1407 == 1) {
                    if (var105 >= 0) {
                        field745[var105] = null;
                    } else {
                        Statics.field1347 = null;
                    }
                    arg0.field1406 = null;
                    return true;
                }
                if (var105 >= 0) {
                    field745[var105] = new class4(var3);
                } else {
                    Statics.field1347 = new class4(var3);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2797 == arg0.field1406) {
                int var106 = var3.method5936();
                int var107 = var3.method6009();
                int var108 = var3.method5935();
                class248 var109 = class248.method3261(var107);
                var109.field2982 = (var108 << 16) + var106;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2739 == arg0.field1406) {
                int var110 = var3.method5959();
                int var111 = var3.method5937();
                class248 var112 = class248.method3261(var110);
                if (var112.field3004 != 1 || var112.field3005 != var111) {
                    var112.field3004 = 1;
                    var112.field3005 = var111;
                    method1837(var112);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2774 == arg0.field1406) {
                method3324();
                field728 = var3.method5902();
                field824 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2768 == arg0.field1406) {
                method162(false, var3);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2790 == arg0.field1406) {
                boolean var113 = var3.method5904();
                if (!var113) {
                    Statics.field2801 = null;
                } else if (Statics.field2801 == null) {
                    Statics.field2801 = new class287();
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2771 == arg0.field1406) {
                int var114 = var3.method5965();
                int var115 = var3.method5899();
                if (var114 < -70000) {
                    var115 += 32768;
                }
                class248 var116;
                if (var114 >= 0) {
                    var116 = class248.method3261(var114);
                } else {
                    var116 = null;
                }
                while (var3.field4161 < arg0.field1407) {
                    int var117 = var3.method5911();
                    int var118 = var3.method5899();
                    int var119 = 0;
                    if (var118 != 0) {
                        var119 = var3.method5902();
                        if (var119 == 255) {
                            var119 = var3.method5965();
                        }
                    }
                    if (var116 != null && var117 >= 0 && var117 < var116.field3045.length) {
                        var116.field3045[var117] = var118;
                        var116.field2957[var117] = var119;
                    }
                    class93.method5074(var115, var117, var118 - 1, var119);
                }
                if (var116 != null) {
                    method1837(var116);
                }
                method3324();
                field811[++field712 - 1 & 0x1F] = var115 & 0x7FFF;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2795 == arg0.field1406) {
                method2233(class227.field2692);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2746 == arg0.field1406) {
                int var120 = var3.method5946();
                int var121 = var3.method5936();
                class248 var122 = class248.method3261(var120);
                if (var122 != null && var122.field2963 == 0) {
                    if (var121 > var122.field2985 - var122.field2977) {
                        var121 = var122.field2985 - var122.field2977;
                    }
                    if (var121 < 0) {
                        var121 = 0;
                    }
                    if (var122.field2966 != var121) {
                        var122.field2966 = var121;
                        method1837(var122);
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2761 == arg0.field1406) {
                Statics.field288.method1560();
                field818 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2798 == arg0.field1406) {
                Statics.field27 = Statics.method4281(var3.method5902());
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2764 == arg0.field1406) {
                int var123 = var3.method5936();
                class93.method587(var123);
                field811[++field712 - 1 & 0x1F] = var123 & 0x7FFF;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2729 == arg0.field1406) {
                field859 = var3.method5902();
                if (field859 == 255) {
                    field859 = 0;
                }
                field676 = var3.method5902();
                if (field676 == 255) {
                    field676 = 0;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2785 == arg0.field1406) {
                int var124 = var3.method5965();
                class95 var125 = (class95) field796.method5691((long) var124);
                if (var125 != null) {
                    method2402(var125, true);
                }
                if (field789 != null) {
                    method1837(field789);
                    field789 = null;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2720 == arg0.field1406) {
                int var126 = var3.method5935();
                int var127 = var3.method5946();
                int var128 = var126 >> 10 & 0x1F;
                int var129 = var126 >> 5 & 0x1F;
                int var130 = var126 & 0x1F;
                int var131 = (var130 << 3) + (var128 << 19) + (var129 << 11);
                class248 var132 = class248.method3261(var127);
                if (var132.field2986 != var131) {
                    var132.field2986 = var131;
                    method1837(var132);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2748 == arg0.field1406) {
                method2233(class227.field2685);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2732 == arg0.field1406) {
                if (Statics.field3675 != null) {
                    Statics.field3675.method5135(var3);
                }
                method4385();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2712 == arg0.field1406) {
                Statics.field129 = var3.method5928();
                Statics.field2048 = var3.method5927();
                while (var3.field4161 < arg0.field1407) {
                    int var133 = var3.method5902();
                    class227 var134 = class227.method3262()[var133];
                    method2233(var134);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2791 == arg0.field1406) {
                byte var135 = var3.method5968();
                long var136 = (long) var3.method5899();
                long var138 = (long) var3.method5901();
                long var140 = (var136 << 32) + var138;
                boolean var142 = false;
                class4 var143 = var135 >= 0 ? field745[var135] : Statics.field1347;
                if (var143 == null) {
                    var142 = true;
                } else {
                    for (int var144 = 0; var144 < 100; var144++) {
                        if (field846[var144] == var140) {
                            var142 = true;
                            break;
                        }
                    }
                }
                if (!var142) {
                    field846[field847] = var140;
                    field847 = (field847 + 1) % 100;
                    String var145 = class251.method2987(var3);
                    int var146 = var135 >= 0 ? 43 : 46;
                    class112.method1894(var146, "", var145, var143.field25);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2750 == arg0.field1406) {
                byte[] var147 = new byte[arg0.field1407];
                var3.method5845(var147, 0, var147.length);
                class384 var148 = new class384(var147);
                String var149 = var148.method5906();
                class45.method2107(var149, true, false);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2728 == arg0.field1406) {
                method2332(var3.method5906());
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2773 == arg0.field1406) {
                method2233(class227.field2684);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2794 == arg0.field1406) {
                String var150 = var3.method5906();
                long var151 = var3.method5896();
                long var153 = (long) var3.method5899();
                long var155 = (long) var3.method5901();
                class271 var157 = (class271) class290.method2391(class271.method2098(), var3.method5902());
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                for (int var161 = 0; var161 < 100; var161++) {
                    if (field846[var161] == var158) {
                        var160 = true;
                        break;
                    }
                }
                if (var157.field3549 && Statics.field288.method1553(new class329(var150, Statics.field1311))) {
                    var160 = true;
                }
                if (!var160 && field630 == 0) {
                    field846[field847] = var158;
                    field847 = (field847 + 1) % 100;
                    String var162 = class302.method4893(class305.method4608(class251.method2987(var3)));
                    if (var157.field3547 == -1) {
                        class112.method1894(9, var150, var162, class307.method1768(var151));
                    } else {
                        class112.method1894(9, class106.method4226(var157.field3547) + var150, var162, class307.method1768(var151));
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2713 == arg0.field1406) {
                field773 = var3.method5902();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2736 == arg0.field1406) {
                if (Statics.field75 == null) {
                    Statics.field75 = new class341(Statics.field214);
                }
                class392 var163 = Statics.field214.method5374(var3);
                Statics.field75.field3920.method5705(var163.field4227, var163.field4228);
                field815[++field760 - 1 & 0x1F] = var163.field4227;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2740 == arg0.field1406) {
                byte var164 = var3.method5968();
                String var165 = var3.method5906();
                long var166 = (long) var3.method5899();
                long var168 = (long) var3.method5901();
                class271 var170 = (class271) class290.method2391(class271.method2098(), var3.method5902());
                long var171 = (var166 << 32) + var168;
                boolean var173 = false;
                Object var174 = null;
                class4 var175 = var164 >= 0 ? field745[var164] : Statics.field1347;
                if (var175 == null) {
                    var173 = true;
                } else {
                    int var176 = 0;
                    while (true) {
                        if (var176 >= 100) {
                            if (var170.field3549 && Statics.field288.method1553(new class329(var165, Statics.field1311))) {
                                var173 = true;
                            }
                            break;
                        }
                        if (field846[var176] == var171) {
                            var173 = true;
                            break;
                        }
                        var176++;
                    }
                }
                if (!var173) {
                    field846[field847] = var171;
                    field847 = (field847 + 1) % 100;
                    String var177 = class302.method4893(class251.method2987(var3));
                    int var178 = var164 >= 0 ? 41 : 44;
                    if (var170.field3547 == -1) {
                        class112.method1894(var178, var165, var177, var175.field25);
                    } else {
                        class112.method1894(var178, class106.method4226(var170.field3547) + var165, var177, var175.field25);
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2718 == arg0.field1406) {
                int var179 = var3.method5965();
                int var180 = var3.method5965();
                class95 var181 = (class95) field796.method5691((long) var180);
                class95 var182 = (class95) field796.method5691((long) var179);
                if (var182 != null) {
                    method2402(var182, var181 == null || var181.field1147 != var182.field1147);
                }
                if (var181 != null) {
                    var181.method5407();
                    field796.method5692(var181, (long) var179);
                }
                class248 var183 = class248.method3261(var180);
                if (var183 != null) {
                    method1837(var183);
                }
                class248 var184 = class248.method3261(var179);
                if (var184 != null) {
                    method1837(var184);
                    method2960(Statics.field613[var184.field2960 >>> 16], var184, true);
                }
                if (field783 != -1) {
                    method61(field783, 1);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2762 == arg0.field1406) {
                int var185 = var3.method5902();
                method20(var185);
                arg0.field1406 = null;
                return false;
            }
            if (class229.field2782 == arg0.field1406) {
                method2233(class227.field2693);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2721 == arg0.field1406) {
                for (int var186 = 0; var186 < field739.length; var186++) {
                    if (field739[var186] != null) {
                        field739[var186].field1255 = -1;
                    }
                }
                for (int var187 = 0; var187 < field664.length; var187++) {
                    if (field664[var187] != null) {
                        field664[var187].field1255 = -1;
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2734 == arg0.field1406) {
                field821 = field808;
                byte var188 = var3.method5968();
                class20 var189 = new class20(var3);
                class4 var190;
                if (var188 >= 0) {
                    var190 = field745[var188];
                } else {
                    var190 = Statics.field1347;
                }
                var189.method174(var190);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2715 == arg0.field1406) {
                Statics.field2048 = var3.method5927();
                Statics.field129 = var3.method5926();
                for (int var191 = Statics.field2048; var191 < Statics.field2048 + 8; var191++) {
                    for (int var192 = Statics.field129; var192 < Statics.field129 + 8; var192++) {
                        if (field751[Statics.field438][var191][var192] != null) {
                            field751[Statics.field438][var191][var192] = null;
                            method202(var191, var192);
                        }
                    }
                }
                for (class99 var193 = (class99) field752.method4721(); var193 != null; var193 = (class99) field752.method4723()) {
                    if (var193.field1220 >= Statics.field2048 && var193.field1220 < Statics.field2048 + 8 && var193.field1213 >= Statics.field129 && var193.field1213 < Statics.field129 + 8 && Statics.field438 == var193.field1212) {
                        var193.field1216 = 0;
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2716 == arg0.field1406) {
                method2233(class227.field2689);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2714 == arg0.field1406) {
                if (arg0.field1407 == 0) {
                    Statics.field3675 = null;
                } else {
                    if (Statics.field3675 == null) {
                        Statics.field3675 = new class319(Statics.field1311, Statics.field11);
                    }
                    Statics.field3675.method5134(var3);
                }
                method4385();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2745 == arg0.field1406) {
                int var194 = arg0.field1407 + var3.field4161;
                int var195 = var3.method5899();
                int var196 = var3.method5899();
                if (field783 != var195) {
                    field783 = var195;
                    this.method1156(false);
                    method3834(field783);
                    class79.method1006(field783);
                    for (int var197 = 0; var197 < 100; var197++) {
                        field832[var197] = true;
                    }
                }
                while (var196-- > 0) {
                    int var198 = var3.method5965();
                    int var199 = var3.method5899();
                    int var200 = var3.method5902();
                    class95 var201 = (class95) field796.method5691((long) var198);
                    if (var201 != null && var201.field1147 != var199) {
                        method2402(var201, true);
                        var201 = null;
                    }
                    if (var201 == null) {
                        var201 = method1610(var198, var199, var200);
                    }
                    var201.field1149 = true;
                }
                for (class95 var202 = (class95) field796.method5693(); var202 != null; var202 = (class95) field796.method5694()) {
                    if (var202.field1149) {
                        var202.field1149 = false;
                    } else {
                        method2402(var202, true);
                    }
                }
                field867 = new class363(512);
                while (var3.field4161 < var194) {
                    int var203 = var3.method5965();
                    int var204 = var3.method5899();
                    int var205 = var3.method5899();
                    int var206 = var3.method5965();
                    for (int var207 = var204; var207 <= var205; var207++) {
                        long var208 = ((long) var203 << 32) + (long) var207;
                        field867.method5692(new class352(var206), var208);
                    }
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2757 == arg0.field1406) {
                field638 = var3.method5899() * 30;
                field824 = field808;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2735 == arg0.field1406) {
                int var210 = var3.method5965();
                int var211 = var3.method5899();
                if (var210 < -70000) {
                    var211 += 32768;
                }
                class248 var212;
                if (var210 >= 0) {
                    var212 = class248.method3261(var210);
                } else {
                    var212 = null;
                }
                if (var212 != null) {
                    for (int var213 = 0; var213 < var212.field3045.length; var213++) {
                        var212.field3045[var213] = 0;
                        var212.field2957[var213] = 0;
                    }
                }
                class93.method2315(var211);
                int var214 = var3.method5899();
                for (int var215 = 0; var215 < var214; var215++) {
                    int var216 = var3.method5926();
                    if (var216 == 255) {
                        var216 = var3.method5959();
                    }
                    int var217 = var3.method5936();
                    if (var212 != null && var215 < var212.field3045.length) {
                        var212.field3045[var215] = var217;
                        var212.field2957[var215] = var216;
                    }
                    class93.method5074(var211, var215, var217 - 1, var216);
                }
                if (var212 != null) {
                    method1837(var212);
                }
                method3324();
                field811[++field712 - 1 & 0x1F] = var211 & 0x7FFF;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2731 == arg0.field1406) {
                method284(true, arg0.field1405);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2781 == arg0.field1406) {
                int var218 = var3.method5936();
                if (var218 == 65535) {
                    var218 = -1;
                }
                method57(var218);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2770 == arg0.field1406) {
                int var219 = var3.method5937();
                if (var219 == 65535) {
                    var219 = -1;
                }
                int var220 = var3.method5901();
                method1001(var219, var220);
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2765 == arg0.field1406) {
                class110.method2278(var3, arg0.field1407);
                method2524();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2786 == arg0.field1406) {
                int var221 = var3.method5965();
                if (field705 != var221) {
                    field705 = var221;
                    method5144();
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2743 == arg0.field1406) {
                int var222 = var3.method5959();
                boolean var223 = var3.method5927() == 1;
                class248 var224 = class248.method3261(var222);
                if (var224.field2981 != var223) {
                    var224.field2981 = var223;
                    method1837(var224);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2717 == arg0.field1406) {
                for (int var225 = 0; var225 < Statics.field431; var225++) {
                    class139 var226 = class139.method14(var225);
                    if (var226 != null) {
                        class243.field2923[var225] = 0;
                        class243.field2924[var225] = 0;
                    }
                }
                method3324();
                field810 += 32;
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2799 == arg0.field1406) {
                int var227 = var3.method5946();
                int var228 = var3.method5936();
                class248 var229 = class248.method3261(var227);
                if (var229.field3004 != 2 || var229.field3005 != var228) {
                    var229.field3004 = 2;
                    var229.field3005 = var228;
                    method1837(var229);
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2755 == arg0.field1406) {
                field636 = var3.method5928();
                field843 = var3.method5928();
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2742 == arg0.field1406) {
                int var230 = var3.method5935();
                field783 = var230;
                this.method1156(false);
                method3834(var230);
                class79.method1006(field783);
                for (int var231 = 0; var231 < 100; var231++) {
                    field832[var231] = true;
                }
                arg0.field1406 = null;
                return true;
            }
            if (class229.field2730 == arg0.field1406) {
                int var232 = var3.method5946();
                String var233 = var3.method5906();
                class248 var234 = class248.method3261(var232);
                if (!var233.equals(var234.field3022)) {
                    var234.field3022 = var233;
                    method1837(var234);
                }
                arg0.field1406 = null;
                return true;
            }
            class407.method5131("" + (arg0.field1406 == null ? -1 : arg0.field1406.field2788) + class106.field1331 + (arg0.field1412 == null ? -1 : arg0.field1412.field2788) + class106.field1331 + (arg0.field1400 == null ? -1 : arg0.field1400.field2788) + class106.field1331 + arg0.field1407, (Throwable) null);
            method708();
        } catch (IOException var239) {
            method1039();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1406 == null ? -1 : arg0.field1406.field2788) + class106.field1331 + (arg0.field1412 == null ? -1 : arg0.field1412.field2788) + class106.field1331 + (arg0.field1400 == null ? -1 : arg0.field1400.field2788) + class106.field1331 + arg0.field1407 + class106.field1331 + (Statics.field127 + Statics.field3197.field1278[0]) + class106.field1331 + (Statics.field2092 + Statics.field3197.field1279[0]) + class106.field1331;
            for (int var238 = 0; var238 < arg0.field1407 && var238 < 50; var238++) {
                var237 = var237 + var3.field4160[var238] + class106.field1331;
            }
            class407.method5131(var237, var240);
            method708();
        }
        return true;
    }

    @ObfuscatedName("dc.ht(Lhj;I)V")
    public static final void method2233(class227 arg0) {
        class383 var1 = field669.field1405;
        if (class227.field2688 == arg0) {
            int var2 = var1.method5927();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2048;
            int var4 = (var2 & 0x7) + Statics.field129;
            int var5 = var1.method5937();
            int var6 = var1.method5936();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class109 var7 = new class109();
                var7.field1356 = var5;
                var7.field1354 = var6;
                if (field751[Statics.field438][var3][var4] == null) {
                    field751[Statics.field438][var3][var4] = new class295();
                }
                field751[Statics.field438][var3][var4].method4716(var7);
                method202(var3, var4);
            }
        } else if (class227.field2694 == arg0) {
            int var8 = var1.method5899();
            int var9 = var1.method5936();
            int var10 = var1.method5937();
            int var11 = var1.method5927();
            int var12 = (var11 >> 4 & 0x7) + Statics.field2048;
            int var13 = (var11 & 0x7) + Statics.field129;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class295 var14 = field751[Statics.field438][var12][var13];
                if (var14 != null) {
                    for (class109 var15 = (class109) var14.method4721(); var15 != null; var15 = (class109) var14.method4723()) {
                        if ((var10 & 0x7FFF) == var15.field1356 && var15.field1354 == var8) {
                            var15.field1354 = var9;
                            break;
                        }
                    }
                    method202(var12, var13);
                }
            }
        } else if (class227.field2684 == arg0) {
            int var16 = var1.method5926();
            int var17 = (var16 >> 4 & 0x7) + Statics.field2048;
            int var18 = (var16 & 0x7) + Statics.field129;
            int var19 = var1.method5935();
            int var20 = var1.method5927();
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = field683[var21];
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                method5812(Statics.field438, var17, var18, var23, var19, var21, var22, 0, -1);
            }
        } else if (class227.field2685 == arg0) {
            int var24 = var1.method5926();
            int var25 = (var24 >> 4 & 0x7) + Statics.field2048;
            int var26 = (var24 & 0x7) + Statics.field129;
            int var27 = var1.method5937();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class295 var28 = field751[Statics.field438][var25][var26];
                if (var28 != null) {
                    for (class109 var29 = (class109) var28.method4721(); var29 != null; var29 = (class109) var28.method4723()) {
                        if ((var27 & 0x7FFF) == var29.field1356) {
                            var29.method5407();
                            break;
                        }
                    }
                    if (var28.method4721() == null) {
                        field751[Statics.field438][var25][var26] = null;
                    }
                    method202(var25, var26);
                }
            }
        } else if (class227.field2687 == arg0) {
            int var30 = var1.method5927();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2048;
            int var32 = (var30 & 0x7) + Statics.field129;
            int var33 = var1.method5902();
            int var34 = var33 >> 2;
            int var35 = var33 & 0x3;
            int var36 = field683[var34];
            int var37 = var1.method5936();
            if (var31 >= 0 && var32 >= 0 && var31 < 103 && var32 < 103) {
                if (var36 == 0) {
                    class211 var38 = Statics.field292.method3600(Statics.field438, var31, var32);
                    if (var38 != null) {
                        int var39 = class207.method1030(var38.field2530);
                        if (var34 == 2) {
                            var38.field2527 = new class88(var39, 2, var35 + 4, Statics.field438, var31, var32, var37, false, var38.field2527);
                            var38.field2528 = new class88(var39, 2, var35 + 1 & 0x3, Statics.field438, var31, var32, var37, false, var38.field2528);
                        } else {
                            var38.field2527 = new class88(var39, var34, var35, Statics.field438, var31, var32, var37, false, var38.field2527);
                        }
                    }
                }
                if (var36 == 1) {
                    class213 var40 = Statics.field292.method3601(Statics.field438, var31, var32);
                    if (var40 != null) {
                        int var41 = class207.method1030(var40.field2541);
                        if (var34 == 4 || var34 == 5) {
                            var40.field2539 = new class88(var41, 4, var35, Statics.field438, var31, var32, var37, false, var40.field2539);
                        } else if (var34 == 6) {
                            var40.field2539 = new class88(var41, 4, var35 + 4, Statics.field438, var31, var32, var37, false, var40.field2539);
                        } else if (var34 == 7) {
                            var40.field2539 = new class88(var41, 4, (var35 + 2 & 0x3) + 4, Statics.field438, var31, var32, var37, false, var40.field2539);
                        } else if (var34 == 8) {
                            var40.field2539 = new class88(var41, 4, var35 + 4, Statics.field438, var31, var32, var37, false, var40.field2539);
                            var40.field2532 = new class88(var41, 4, (var35 + 2 & 0x3) + 4, Statics.field438, var31, var32, var37, false, var40.field2532);
                        }
                    }
                }
                if (var36 == 2) {
                    class214 var42 = Statics.field292.method3636(Statics.field438, var31, var32);
                    if (var34 == 11) {
                        var34 = 10;
                    }
                    if (var42 != null) {
                        var42.field2547 = new class88(class207.method1030(var42.field2555), var34, var35, Statics.field438, var31, var32, var37, false, var42.field2547);
                    }
                }
                if (var36 == 3) {
                    class193 var43 = Statics.field292.method3758(Statics.field438, var31, var32);
                    if (var43 != null) {
                        var43.field2209 = new class88(class207.method1030(var43.field2205), 22, var35, Statics.field438, var31, var32, var37, false, var43.field2209);
                    }
                }
            }
        } else {
            if (class227.field2689 == arg0) {
                int var44 = var1.method5926();
                int var45 = var1.method5902();
                int var46 = (var45 >> 4 & 0x7) + Statics.field2048;
                int var47 = (var45 & 0x7) + Statics.field129;
                int var48 = var1.method5899();
                int var49 = var1.method5927();
                int var50 = var49 >> 4 & 0xF;
                int var51 = var49 & 0x7;
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    int var52 = var50 + 1;
                    if (Statics.field3197.field1278[0] >= var46 - var52 && Statics.field3197.field1278[0] <= var46 + var52 && Statics.field3197.field1279[0] >= var47 - var52 && Statics.field3197.field1279[0] <= var47 + var52 && Statics.field40.field1322 != 0 && var51 > 0 && field864 < 50) {
                        field688[field864] = var48;
                        field866[field864] = var51;
                        field830[field864] = var44;
                        field869[field864] = null;
                        field658[field864] = (var46 << 16) + (var47 << 8) + var50;
                        field864++;
                    }
                }
            }
            if (class227.field2691 == arg0) {
                int var53 = var1.method5927();
                int var54 = (var53 >> 4 & 0x7) + Statics.field2048;
                int var55 = (var53 & 0x7) + Statics.field129;
                int var56 = var1.method5902();
                int var57 = var56 >> 2;
                int var58 = var56 & 0x3;
                int var59 = field683[var57];
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    method5812(Statics.field438, var54, var55, var59, -1, var57, var58, 0, -1);
                }
            } else {
                if (class227.field2692 == arg0) {
                    int var60 = var1.method5899();
                    int var61 = var1.method5899();
                    int var62 = var1.method5926();
                    int var63 = (var62 >> 4 & 0x7) + Statics.field2048;
                    int var64 = (var62 & 0x7) + Statics.field129;
                    byte var65 = var1.method6034();
                    byte var66 = var1.method6034();
                    int var67 = var1.method5926();
                    int var68 = var67 >> 2;
                    int var69 = var67 & 0x3;
                    int var70 = field683[var68];
                    byte var71 = var1.method5968();
                    int var72 = var1.method5937();
                    byte var73 = var1.method5968();
                    int var74 = var1.method5935();
                    class98 var75;
                    if (field720 == var61) {
                        var75 = Statics.field3197;
                    } else {
                        var75 = field739[var61];
                    }
                    if (var75 != null) {
                        class155 var76 = class155.method1864(var60);
                        int var77;
                        int var78;
                        if (var69 == 1 || var69 == 3) {
                            var77 = var76.field1773;
                            var78 = var76.field1772;
                        } else {
                            var77 = var76.field1772;
                            var78 = var76.field1773;
                        }
                        int var79 = (var77 >> 1) + var63;
                        int var80 = (var77 + 1 >> 1) + var63;
                        int var81 = (var78 >> 1) + var64;
                        int var82 = (var78 + 1 >> 1) + var64;
                        int[][] var83 = class90.field1099[Statics.field438];
                        int var84 = var83[var79][var81] + var83[var80][var81] + var83[var79][var82] + var83[var80][var82] >> 2;
                        int var85 = (var63 << 7) + (var77 << 6);
                        int var86 = (var64 << 7) + (var78 << 6);
                        class206 var87 = var76.method2709(var68, var69, var83, var85, var84, var86);
                        if (var87 != null) {
                            method5812(Statics.field438, var63, var64, var70, -1, 0, 0, var72 + 1, var74 + 1);
                            var75.field1184 = field631 + var72;
                            var75.field1185 = field631 + var74;
                            var75.field1204 = var87;
                            var75.field1186 = var63 * 128 + var77 * 64;
                            var75.field1198 = var64 * 128 + var78 * 64;
                            var75.field1187 = var84;
                            if (var71 > var73) {
                                byte var88 = var71;
                                var71 = var73;
                                var73 = var88;
                            }
                            if (var66 > var65) {
                                byte var89 = var66;
                                var66 = var65;
                                var65 = var89;
                            }
                            var75.field1190 = var63 + var71;
                            var75.field1192 = var63 + var73;
                            var75.field1191 = var64 + var66;
                            var75.field1196 = var64 + var65;
                        }
                    }
                }
                if (class227.field2690 == arg0) {
                    int var90 = var1.method6041();
                    byte var91 = var1.method5903();
                    int var92 = var1.method5935();
                    int var93 = var1.method5937();
                    int var94 = var1.method5928();
                    int var95 = var1.method5936();
                    int var96 = var1.method5902();
                    int var97 = (var96 >> 4 & 0x7) + Statics.field2048;
                    int var98 = (var96 & 0x7) + Statics.field129;
                    int var99 = var1.method5927();
                    byte var100 = var1.method5968();
                    int var101 = var1.method5928() * 4;
                    int var102 = var1.method5927() * 4;
                    int var103 = var91 + var97;
                    int var104 = var98 + var100;
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var95 != 65535) {
                        int var105 = var97 * 128 + 64;
                        int var106 = var98 * 128 + 64;
                        int var107 = var103 * 128 + 64;
                        int var108 = var104 * 128 + 64;
                        class85 var109 = new class85(var95, Statics.field438, var105, var106, method1921(var105, var106, Statics.field438) - var102, field631 + var92, field631 + var93, var94, var99, var90, var101);
                        var109.method1806(var107, var108, method1921(var107, var108, Statics.field438) - var101, field631 + var92);
                        field753.method4716(var109);
                    }
                } else if (class227.field2693 == arg0) {
                    int var110 = var1.method5935();
                    int var111 = var1.method5926();
                    int var112 = (var111 >> 4 & 0x7) + Statics.field2048;
                    int var113 = (var111 & 0x7) + Statics.field129;
                    int var114 = var1.method5927();
                    int var115 = var1.method5936();
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                        int var116 = var112 * 128 + 64;
                        int var117 = var113 * 128 + 64;
                        class80 var118 = new class80(var115, Statics.field438, var116, var117, method1921(var116, var117, Statics.field438) - var114, var110, field631);
                        field717.method4716(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ne.hv(IIIIIIIIII)V")
    public static final void method5812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class99 var9 = null;
        for (class99 var10 = (class99) field752.method4721(); var10 != null; var10 = (class99) field752.method4723()) {
            if (var10.field1212 == arg0 && var10.field1220 == arg1 && var10.field1213 == arg2 && var10.field1206 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class99();
            var9.field1212 = arg0;
            var9.field1206 = arg3;
            var9.field1220 = arg1;
            var9.field1213 = arg2;
            method1618(var9);
            field752.method4716(var9);
        }
        var9.field1207 = arg4;
        var9.field1214 = arg5;
        var9.field1208 = arg6;
        var9.field1215 = arg7;
        var9.field1216 = arg8;
    }

    @ObfuscatedName("cx.ha(I)V")
    public static final void method1757() {
        for (class99 var0 = (class99) field752.method4721(); var0 != null; var0 = (class99) field752.method4723()) {
            if (var0.field1216 == -1) {
                var0.field1215 = 0;
                method1618(var0);
            } else {
                var0.method5407();
            }
        }
    }

    @ObfuscatedName("bh.hz(Lcr;I)V")
    public static final void method1618(class99 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1206 == 0) {
            var1 = Statics.field292.method3686(arg0.field1212, arg0.field1220, arg0.field1213);
        }
        if (arg0.field1206 == 1) {
            var1 = Statics.field292.method3605(arg0.field1212, arg0.field1220, arg0.field1213);
        }
        if (arg0.field1206 == 2) {
            var1 = Statics.field292.method3606(arg0.field1212, arg0.field1220, arg0.field1213);
        }
        if (arg0.field1206 == 3) {
            var1 = Statics.field292.method3607(arg0.field1212, arg0.field1220, arg0.field1213);
        }
        if (var1 != 0L) {
            int var6 = Statics.field292.method3619(arg0.field1212, arg0.field1220, arg0.field1213, var1);
            var3 = class207.method1030(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1209 = var3;
        arg0.field1211 = var4;
        arg0.field1210 = var5;
    }

    @ObfuscatedName("u.hw(I)V")
    public static final void method166() {
        for (class99 var0 = (class99) field752.method4721(); var0 != null; var0 = (class99) field752.method4723()) {
            if (var0.field1216 > 0) {
                var0.field1216--;
            }
            if (var0.field1216 == 0) {
                if (var0.field1209 >= 0) {
                    int var1 = var0.field1209;
                    int var2 = var0.field1211;
                    class155 var3 = class155.method1864(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method2706(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method3401(var0.field1212, var0.field1206, var0.field1220, var0.field1213, var0.field1209, var0.field1210, var0.field1211);
                var0.method5407();
            } else {
                if (var0.field1215 > 0) {
                    var0.field1215--;
                }
                if (var0.field1215 == 0 && var0.field1220 >= 1 && var0.field1213 >= 1 && var0.field1220 <= 102 && var0.field1213 <= 102) {
                    if (var0.field1207 >= 0) {
                        int var5 = var0.field1207;
                        int var6 = var0.field1214;
                        class155 var7 = class155.method1864(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method2706(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method3401(var0.field1212, var0.field1206, var0.field1220, var0.field1213, var0.field1207, var0.field1208, var0.field1214);
                    var0.field1215 = -1;
                    if (var0.field1209 == var0.field1207 && var0.field1209 == -1) {
                        var0.method5407();
                    } else if (var0.field1209 == var0.field1207 && var0.field1210 == var0.field1208 && var0.field1214 == var0.field1211) {
                        var0.method5407();
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.hj(IIIIIIII)V")
    public static final void method3401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field624 && Statics.field438 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field292.method3686(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field292.method3605(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field292.method3606(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field292.method3607(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field292.method3619(arg0, arg2, arg3, var7);
            int var13 = class207.method1030(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field292.method3595(arg0, arg2, arg3);
                class155 var16 = class155.method1864(var13);
                if (var16.field1774 != 0) {
                    field769[arg0].method2904(arg2, arg3, var14, var15, var16.field1775);
                }
            }
            if (arg1 == 1) {
                Statics.field292.method3596(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field292.method3597(arg0, arg2, arg3);
                class155 var17 = class155.method1864(var13);
                if (var17.field1772 + arg2 > 103 || var17.field1772 + arg3 > 103 || var17.field1773 + arg2 > 103 || var17.field1773 + arg3 > 103) {
                    return;
                }
                if (var17.field1774 != 0) {
                    field769[arg0].method2901(arg2, arg3, var17.field1772, var17.field1773, var15, var17.field1775);
                }
            }
            if (arg1 == 3) {
                Statics.field292.method3782(arg0, arg2, arg3);
                class155 var18 = class155.method1864(var13);
                if (var18.field1774 == 1) {
                    field769[arg0].method2893(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class90.field1097[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class90.method938(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field292, field769[arg0]);
    }

    @ObfuscatedName("aw.hg(IIB)V")
    public static final void method202(int arg0, int arg1) {
        class295 var2 = field751[Statics.field438][arg0][arg1];
        if (var2 == null) {
            Statics.field292.method3642(Statics.field438, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class109 var5 = null;
        for (class109 var6 = (class109) var2.method4721(); var6 != null; var6 = (class109) var2.method4723()) {
            class156 var7 = class156.method4403(var6.field1356);
            long var8 = (long) var7.field1832;
            if (var7.field1831 == 1) {
                var8 = (long) (var6.field1354 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field292.method3642(Statics.field438, arg0, arg1);
            return;
        }
        var2.method4748(var5);
        class109 var10 = null;
        class109 var11 = null;
        for (class109 var12 = (class109) var2.method4721(); var12 != null; var12 = (class109) var2.method4723()) {
            if (var5.field1356 != var12.field1356) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1356 != var12.field1356 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class207.method2277(arg0, arg1, 3, false, 0);
        Statics.field292.method3585(Statics.field438, arg0, arg1, method1921(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field438), var5, var13, var10, var11);
    }

    @ObfuscatedName("x.hs(ZLns;B)V")
    public static final void method162(boolean arg0, class383 arg1) {
        field784 = 0;
        field637 = 0;
        method3267();
        while (arg1.method5852(field669.field1407) >= 27) {
            int var2 = arg1.method5850(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field664[var2] == null) {
                field664[var2] = new class105();
                var32 = true;
            }
            class105 var33 = field664[var2];
            field666[++field665 - 1] = var2;
            var33.field1233 = field631;
            var33.field1328 = class147.method4374(arg1.method5850(14));
            int var34;
            if (arg0) {
                var34 = arg1.method5850(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = arg1.method5850(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35;
            if (arg0) {
                var35 = arg1.method5850(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = arg1.method5850(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = arg1.method5850(1);
            if (var36 == 1) {
                field764[++field637 - 1] = var2;
            }
            int var37 = arg1.method5850(1);
            boolean var38 = arg1.method5850(1) == 1;
            if (var38) {
                arg1.method5850(32);
            }
            int var39 = field749[arg1.method5850(3)];
            if (var32) {
                var33.field1274 = var33.field1224 = var39;
            }
            var33.field1226 = var33.field1328.field1666;
            var33.field1276 = var33.field1328.field1674;
            if (var33.field1276 == 0) {
                var33.field1224 = 0;
            }
            var33.field1253 = var33.field1328.field1649;
            var33.field1267 = var33.field1328.field1650;
            var33.field1256 = var33.field1328.field1651;
            var33.field1234 = var33.field1328.field1660;
            var33.field1248 = var33.field1328.field1637;
            var33.field1229 = var33.field1328.field1647;
            var33.field1230 = var33.field1328.field1648;
            var33.method2077(Statics.field3197.field1278[0] + var34, Statics.field3197.field1279[0] + var35, var37 == 1);
        }
        arg1.method5851();
        for (int var3 = 0; var3 < field637; var3++) {
            int var4 = field764[var3];
            class105 var5 = field664[var4];
            int var6 = arg1.method5902();
            if ((var6 & 0x80) != 0) {
                int var7 = arg1.method5899();
                int var8 = arg1.method5899();
                int var9 = var5.field1242 - (var7 - Statics.field127 - Statics.field127) * 64;
                int var10 = var5.field1223 - (var8 - Statics.field2092 - Statics.field2092) * 64;
                if (var9 != 0 || var10 != 0) {
                    var5.field1281 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field1328 = class147.method4374(arg1.method5936());
                var5.field1226 = var5.field1328.field1666;
                var5.field1276 = var5.field1328.field1674;
                var5.field1253 = var5.field1328.field1649;
                var5.field1267 = var5.field1328.field1650;
                var5.field1256 = var5.field1328.field1651;
                var5.field1234 = var5.field1328.field1660;
                var5.field1248 = var5.field1328.field1637;
                var5.field1229 = var5.field1328.field1647;
                var5.field1230 = var5.field1328.field1648;
            }
            if ((var6 & 0x10) != 0) {
                int var11 = arg1.method5899();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg1.method5926();
                if (var5.field1255 == var11 && var11 != -1) {
                    int var13 = class158.method3363(var11).field1895;
                    if (var13 == 1) {
                        var5.field1272 = 0;
                        var5.field1257 = 0;
                        var5.field1258 = var12;
                        var5.field1259 = 0;
                    }
                    if (var13 == 2) {
                        var5.field1259 = 0;
                    }
                } else if (var11 == -1 || var5.field1255 == -1 || class158.method3363(var11).field1893 >= class158.method3363(var5.field1255).field1893) {
                    var5.field1255 = var11;
                    var5.field1272 = 0;
                    var5.field1257 = 0;
                    var5.field1258 = var12;
                    var5.field1259 = 0;
                    var5.field1282 = var5.field1228;
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field1232 = arg1.method5906();
                var5.field1239 = 100;
            }
            if ((var6 & 0x1) != 0) {
                int var14 = arg1.method5902();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = arg1.method5911();
                        if (var19 == 32767) {
                            var19 = arg1.method5911();
                            var17 = arg1.method5911();
                            var16 = arg1.method5911();
                            var18 = arg1.method5911();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = arg1.method5911();
                        }
                        int var20 = arg1.method5911();
                        var5.method2001(var19, var17, var16, var18, field631, var20);
                    }
                }
                int var21 = arg1.method5927();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = arg1.method5911();
                        int var24 = arg1.method5911();
                        if (var24 == 32767) {
                            var5.method2012(var23);
                        } else {
                            int var25 = arg1.method5911();
                            int var26 = arg1.method5927();
                            int var27 = var24 > 0 ? arg1.method5926() : var26;
                            var5.method2002(var23, field631, var24, var25, var26, var27);
                        }
                    }
                }
            }
            if ((var6 & 0x20) != 0) {
                var5.field1265 = arg1.method5903();
                var5.field1269 = arg1.method5968();
                var5.field1266 = arg1.method5968();
                var5.field1268 = arg1.method5966();
                var5.field1277 = arg1.method5935() + field631;
                var5.field1270 = arg1.method5936() + field631;
                var5.field1271 = arg1.method5935();
                var5.field1228 = 1;
                var5.field1282 = 0;
                var5.field1265 += var5.field1278[0];
                var5.field1269 += var5.field1279[0];
                var5.field1266 += var5.field1278[0];
                var5.field1268 += var5.field1279[0];
            }
            if ((var6 & 0x4) != 0) {
                var5.field1231 = arg1.method5937();
                if (var5.field1231 == 65535) {
                    var5.field1231 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field1260 = arg1.method5935();
                int var28 = arg1.method6009();
                var5.field1264 = var28 >> 16;
                var5.field1263 = (var28 & 0xFFFF) + field631;
                var5.field1261 = 0;
                var5.field1238 = 0;
                if (var5.field1263 > field631) {
                    var5.field1261 = -1;
                }
                if (var5.field1260 == 65535) {
                    var5.field1260 = -1;
                }
            }
        }
        for (int var29 = 0; var29 < field784; var29++) {
            int var30 = field860[var29];
            if (field631 != field664[var30].field1233) {
                field664[var30].field1328 = null;
                field664[var30] = null;
            }
        }
        if (field669.field1407 != arg1.field4161) {
            throw new RuntimeException(arg1.field4161 + class106.field1331 + field669.field1407);
        }
        for (int var31 = 0; var31 < field665; var31++) {
            if (field664[field666[var31]] == null) {
                throw new RuntimeException(var31 + class106.field1331 + field665);
            }
        }
    }

    @ObfuscatedName("fp.hl(B)V")
    public static final void method3267() {
        class383 var0 = field669.field1405;
        var0.method5842();
        int var1 = var0.method5850(8);
        if (var1 < field665) {
            for (int var2 = var1; var2 < field665; var2++) {
                field860[++field784 - 1] = field666[var2];
            }
        }
        if (var1 > field665) {
            throw new RuntimeException("");
        }
        field665 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field666[var3];
            class105 var5 = field664[var4];
            int var6 = var0.method5850(1);
            if (var6 == 0) {
                field666[++field665 - 1] = var4;
                var5.field1233 = field631;
            } else {
                int var7 = var0.method5850(2);
                if (var7 == 0) {
                    field666[++field665 - 1] = var4;
                    var5.field1233 = field631;
                    field764[++field637 - 1] = var4;
                } else if (var7 == 1) {
                    field666[++field665 - 1] = var4;
                    var5.field1233 = field631;
                    int var8 = var0.method5850(3);
                    var5.method2076(var8, (byte) 1);
                    int var9 = var0.method5850(1);
                    if (var9 == 1) {
                        field764[++field637 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field666[++field665 - 1] = var4;
                    var5.field1233 = field631;
                    int var10 = var0.method5850(3);
                    var5.method2076(var10, (byte) 2);
                    int var11 = var0.method5850(3);
                    var5.method2076(var11, (byte) 2);
                    int var12 = var0.method5850(1);
                    if (var12 == 1) {
                        field764[++field637 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field860[++field784 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ab.hq(I)V")
    public static void method244() {
        field900 = 0;
        field759 = false;
    }

    @ObfuscatedName("cf.hb(I)V")
    public static void method1838() {
        method244();
        field765[0] = class269.field3397;
        field766[0] = "";
        field629[0] = 1006;
        field767[0] = false;
        field900 = 1;
    }

    @ObfuscatedName("t.ho(III)V")
    public static final void method160(int arg0, int arg1) {
        if (field900 < 2 && field776 == 0 && !field778 || !field771) {
            return;
        }
        int var2 = method2017();
        String var3;
        if (field776 == 1 && field900 < 2) {
            var3 = class269.field3384 + class269.field3394 + field777 + " " + class106.field1335;
        } else if (field778 && field900 < 2) {
            var3 = field781 + class269.field3394 + field782 + " " + class106.field1335;
        } else {
            var3 = method2(var2);
        }
        if (field900 > 2) {
            var3 = var3 + class106.method1825(16777215) + " " + '/' + " " + (field900 - 2) + class269.field3388;
        }
        Statics.field3767.method4901(var3, arg0 + 4, arg1 + 15, 16777215, 0, field631 / 1000);
    }

    @ObfuscatedName("aa.hu(I)Z")
    public static final boolean method554() {
        return field759;
    }

    @ObfuscatedName("np.ie(IIIII)V")
    public static final void method5745(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field714; var4++) {
            if (field837[var4] + field772[var4] > arg0 && field772[var4] < arg0 + arg2 && field838[var4] + field754[var4] > arg1 && field754[var4] < arg1 + arg3) {
                field832[var4] = true;
            }
        }
    }

    @ObfuscatedName("bn.il(IIIIB)V")
    public static final void method1000(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field714; var4++) {
            if (field837[var4] + field772[var4] > arg0 && field772[var4] < arg0 + arg2 && field838[var4] + field754[var4] > arg1 && field754[var4] < arg1 + arg3) {
                field713[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.id(I)V")
    public final void method1415() {
        method3576();
        if (Statics.field1679 != null || field842 != null) {
            return;
        }
        int var1 = class48.field356;
        if (field759) {
            if (var1 != 1 && (Statics.field1450 || var1 != 4)) {
                int var2 = class48.field368;
                int var3 = class48.field362;
                if (var2 < Statics.field1729 - 10 || var2 > Statics.field1729 + Statics.field1451 + 10 || var3 < Statics.field1617 - 10 || var3 > Statics.field1617 + Statics.field1221 + 10) {
                    field759 = false;
                    method5745(Statics.field1729, Statics.field1617, Statics.field1451, Statics.field1221);
                }
            }
            if (var1 == 1 || !Statics.field1450 && var1 == 4) {
                int var4 = Statics.field1729;
                int var5 = Statics.field1617;
                int var6 = Statics.field1451;
                int var7 = class48.field361;
                int var8 = class48.field352;
                int var9 = -1;
                for (int var10 = 0; var10 < field900; var10++) {
                    int var11 = (field900 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1 && var9 >= 0) {
                    int var12 = field649[var9];
                    int var13 = field762[var9];
                    int var14 = field629[var9];
                    int var15 = field857[var9];
                    String var16 = field765[var9];
                    String var17 = field766[var9];
                    method3949(var12, var13, var14, var15, var16, var17, class48.field361, class48.field352);
                }
                field759 = false;
                method5745(Statics.field1729, Statics.field1617, Statics.field1451, Statics.field1221);
            }
            return;
        }
        int var18 = method2017();
        if ((var1 == 1 || !Statics.field1450 && var1 == 4) && var18 >= 0) {
            int var19 = field629[var18];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                label201: {
                    int var20 = field649[var18];
                    int var21 = field762[var18];
                    class248 var22 = class248.method3261(var21);
                    int var23 = method188(var22);
                    boolean var24 = (var23 >> 28 & 0x1) != 0;
                    if (!var24) {
                        int var25 = method188(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (!var26) {
                            break label201;
                        }
                    }
                    if (Statics.field1679 != null && !field735 && field900 > 0 && !this.method1059()) {
                        int var27 = field744;
                        int var28 = field733;
                        method2342(Statics.field223, var27, var28);
                        Statics.field223 = null;
                    }
                    field735 = false;
                    field668 = 0;
                    if (Statics.field1679 != null) {
                        method1837(Statics.field1679);
                    }
                    Statics.field1679 = class248.method3261(var21);
                    field620 = var20;
                    field744 = class48.field361;
                    field733 = class48.field352;
                    if (var18 >= 0) {
                        method2988(var18);
                    }
                    method1837(Statics.field1679);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field1450 && var1 == 4) && this.method1059()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field1450 && var1 == 4) && field900 > 0 && var18 >= 0) {
            int var29 = field649[var18];
            int var30 = field762[var18];
            int var31 = field629[var18];
            int var32 = field857[var18];
            String var33 = field765[var18];
            String var34 = field766[var18];
            method3949(var29, var30, var31, var32, var33, var34, class48.field361, class48.field352);
        }
        if (var1 == 2 && field900 > 0) {
            this.method1060(class48.field361, class48.field352);
        }
    }

    @ObfuscatedName("client.it(B)Z")
    public final boolean method1059() {
        int var1 = method2017();
        boolean var2 = field758 == 1 && field900 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field629[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field767[var1];
    }

    @ObfuscatedName("client.io(III)V")
    public final void method1060(int arg0, int arg1) {
        method4648(arg0, arg1);
        Statics.field292.method3697(Statics.field438, arg0, arg1, false);
        field759 = true;
    }

    @ObfuscatedName("kn.ib(B)V")
    public static void method4690() {
        method4648(Statics.field1451 / 2 + Statics.field1729, Statics.field1617);
    }

    @ObfuscatedName("jt.iy(III)V")
    public static void method4648(int arg0, int arg1) {
        int var2 = Statics.field3767.method4889(class269.field3385);
        for (int var3 = 0; var3 < field900; var3++) {
            int var4 = Statics.field3767.method4889(method2(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field900 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1350) {
            var6 = Statics.field1350 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field5) {
            var7 = Statics.field5 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1729 = var6;
        Statics.field1617 = var7;
        Statics.field1451 = var2;
        Statics.field1221 = field900 * 15 + 22;
    }

    @ObfuscatedName("da.iq(Lcz;IIB)V")
    public static final void method2342(class82 arg0, int arg1, int arg2) {
        method3949(arg0.field994, arg0.field991, arg0.field992, arg0.field993, arg0.field990, arg0.field990, arg1, arg2);
    }

    @ObfuscatedName("hf.ir(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3949(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 46) {
            class98 var8 = field739[arg3];
            if (var8 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var9 = class228.method1927(class226.field2653, field669.field1410);
                var9.field2700.method5923(class39.field259[82] ? 1 : 0);
                var9.field2700.method5933(arg3);
                field669.method2200(var9);
            }
        }
        if (arg2 == 12) {
            class105 var10 = field664[arg3];
            if (var10 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var11 = class228.method1927(class226.field2682, field669.field1410);
                var11.field2700.method5924(class39.field259[82] ? 1 : 0);
                var11.field2700.method5989(arg3);
                field669.method2200(var11);
            }
        }
        if (arg2 == 45) {
            class98 var12 = field739[arg3];
            if (var12 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var13 = class228.method1927(class226.field2626, field669.field1410);
                var13.field2700.method5933(arg3);
                var13.field2700.method5925(class39.field259[82] ? 1 : 0);
                field669.method2200(var13);
            }
        }
        if (arg2 == 36) {
            class228 var14 = class228.method1927(class226.field2591, field669.field1410);
            var14.field2700.method5942(arg1);
            var14.field2700.method5933(arg0);
            var14.field2700.method5932(arg3);
            field669.method2200(var14);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 13) {
            class105 var15 = field664[arg3];
            if (var15 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var16 = class228.method1927(class226.field2596, field669.field1410);
                var16.field2700.method5925(class39.field259[82] ? 1 : 0);
                var16.field2700.method5989(arg3);
                field669.method2200(var16);
            }
        }
        if (arg2 == 23) {
            if (field759) {
                Statics.field292.method3581();
            } else {
                Statics.field292.method3697(Statics.field438, arg0, arg1, true);
            }
        }
        if (arg2 == 1) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var17 = class228.method1927(class226.field2643, field669.field1410);
            var17.field2700.method5933(Statics.field127 + arg0);
            var17.field2700.method5881(arg3);
            var17.field2700.method5933(Statics.field3783);
            var17.field2700.method5880(class39.field259[82] ? 1 : 0);
            var17.field2700.method5942(Statics.field2949);
            var17.field2700.method5881(Statics.field2092 + arg1);
            var17.field2700.method5932(Statics.field3846);
            field669.method2200(var17);
        }
        if (arg2 == 29) {
            class228 var18 = class228.method1927(class226.field2678, field669.field1410);
            var18.field2700.method5883(arg1);
            field669.method2200(var18);
            class248 var19 = class248.method3261(arg1);
            if (var19.field3084 != null && var19.field3084[0][0] == 5) {
                int var20 = var19.field3084[0][1];
                if (class243.field2924[var20] != var19.field3051[0]) {
                    class243.field2924[var20] = var19.field3051[0];
                    method58(var20);
                }
            }
        }
        if (arg2 == 8) {
            class105 var21 = field664[arg3];
            if (var21 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var22 = class228.method1927(class226.field2618, field669.field1410);
                var22.field2700.method5933(field779);
                var22.field2700.method5883(Statics.field131);
                var22.field2700.method5881(field635);
                var22.field2700.method5933(arg3);
                var22.field2700.method5923(class39.field259[82] ? 1 : 0);
                field669.method2200(var22);
            }
        }
        if (arg2 == 33) {
            class228 var23 = class228.method1927(class226.field2664, field669.field1410);
            var23.field2700.method5883(arg1);
            var23.field2700.method5881(arg0);
            var23.field2700.method5933(arg3);
            field669.method2200(var23);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 1001) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var24 = class228.method1927(class226.field2624, field669.field1410);
            var24.field2700.method5933(arg3);
            var24.field2700.method5925(class39.field259[82] ? 1 : 0);
            var24.field2700.method5989(Statics.field2092 + arg1);
            var24.field2700.method5932(Statics.field127 + arg0);
            field669.method2200(var24);
        }
        if (arg2 == 38) {
            method184();
            class248 var25 = class248.method3261(arg1);
            field776 = 1;
            Statics.field3783 = arg0;
            Statics.field2949 = arg1;
            Statics.field3846 = arg3;
            method1837(var25);
            field777 = class106.method1825(16748608) + class156.method4403(arg3).field1855 + class106.method1825(16777215);
            if (field777 == null) {
                field777 = class269.field3238;
            }
            return;
        }
        if (arg2 == 9) {
            class105 var26 = field664[arg3];
            if (var26 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var27 = class228.method1927(class226.field2672, field669.field1410);
                var27.field2700.method5932(arg3);
                var27.field2700.method5925(class39.field259[82] ? 1 : 0);
                field669.method2200(var27);
            }
        }
        if (arg2 == 1002) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            class228 var28 = class228.method1927(class226.field2627, field669.field1410);
            var28.field2700.method5881(arg3);
            field669.method2200(var28);
        }
        if (arg2 == 30 && field789 == null) {
            method67(arg1, arg0);
            field789 = class248.method165(arg1, arg0);
            method1837(field789);
        }
        if (arg2 == 51) {
            class98 var29 = field739[arg3];
            if (var29 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var30 = class228.method1927(class226.field2675, field669.field1410);
                var30.field2700.method5925(class39.field259[82] ? 1 : 0);
                var30.field2700.method5881(arg3);
                field669.method2200(var30);
            }
        }
        if (arg2 == 58) {
            class248 var31 = class248.method165(arg1, arg0);
            if (var31 != null) {
                class228 var32 = class228.method1927(class226.field2677, field669.field1410);
                var32.field2700.method5933(var31.field3092);
                var32.field2700.method5941(arg1);
                var32.field2700.method5989(field779);
                var32.field2700.method5932(arg0);
                var32.field2700.method5883(Statics.field131);
                var32.field2700.method5881(field635);
                field669.method2200(var32);
            }
        }
        if (arg2 == 1003) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            class105 var33 = field664[arg3];
            if (var33 != null) {
                class147 var34 = var33.field1328;
                if (var34.field1667 != null) {
                    var34 = var34.method2538();
                }
                if (var34 != null) {
                    class228 var35 = class228.method1927(class226.field2635, field669.field1410);
                    var35.field2700.method5933(var34.field1641);
                    field669.method2200(var35);
                }
            }
        }
        if (arg2 == 50) {
            class98 var36 = field739[arg3];
            if (var36 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var37 = class228.method1927(class226.field2674, field669.field1410);
                var37.field2700.method5880(class39.field259[82] ? 1 : 0);
                var37.field2700.method5989(arg3);
                field669.method2200(var37);
            }
        }
        if (arg2 == 25) {
            class248 var38 = class248.method165(arg1, arg0);
            if (var38 != null) {
                method184();
                method2832(arg1, arg0, class249.method3947(method188(var38)), var38.field3092);
                field776 = 0;
                field781 = method1899(var38);
                if (field781 == null) {
                    field781 = class269.field3238;
                }
                if (var38.field2955) {
                    field782 = var38.field3041 + class106.method1825(16777215);
                } else {
                    field782 = class106.method1825(65280) + var38.field3088 + class106.method1825(16777215);
                }
            }
            return;
        }
        if (arg2 == 26) {
            method183();
        }
        if (arg2 == 16) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var39 = class228.method1927(class226.field2655, field669.field1410);
            var39.field2700.method5923(class39.field259[82] ? 1 : 0);
            var39.field2700.method5943(Statics.field2949);
            var39.field2700.method5932(Statics.field3846);
            var39.field2700.method5881(Statics.field3783);
            var39.field2700.method5881(arg3);
            var39.field2700.method5933(Statics.field127 + arg0);
            var39.field2700.method5932(Statics.field2092 + arg1);
            field669.method2200(var39);
        }
        if (arg2 == 15) {
            class98 var40 = field739[arg3];
            if (var40 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var41 = class228.method1927(class226.field2612, field669.field1410);
                var41.field2700.method5881(field779);
                var41.field2700.method5942(Statics.field131);
                var41.field2700.method5933(arg3);
                var41.field2700.method5925(class39.field259[82] ? 1 : 0);
                var41.field2700.method5989(field635);
                field669.method2200(var41);
            }
        }
        if (arg2 == 47) {
            class98 var42 = field739[arg3];
            if (var42 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var43 = class228.method1927(class226.field2628, field669.field1410);
                var43.field2700.method5924(class39.field259[82] ? 1 : 0);
                var43.field2700.method5932(arg3);
                field669.method2200(var43);
            }
        }
        if (arg2 == 10) {
            class105 var44 = field664[arg3];
            if (var44 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var45 = class228.method1927(class226.field2650, field669.field1410);
                var45.field2700.method5933(arg3);
                var45.field2700.method5923(class39.field259[82] ? 1 : 0);
                field669.method2200(var45);
            }
        }
        if (arg2 == 20) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var46 = class228.method1927(class226.field2603, field669.field1410);
            var46.field2700.method5925(class39.field259[82] ? 1 : 0);
            var46.field2700.method5933(Statics.field2092 + arg1);
            var46.field2700.method5881(Statics.field127 + arg0);
            var46.field2700.method5933(arg3);
            field669.method2200(var46);
        }
        if (arg2 == 41) {
            class228 var47 = class228.method1927(class226.field2638, field669.field1410);
            var47.field2700.method5881(arg0);
            var47.field2700.method5933(arg3);
            var47.field2700.method5941(arg1);
            field669.method2200(var47);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 5) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var48 = class228.method1927(class226.field2658, field669.field1410);
            var48.field2700.method5881(Statics.field127 + arg0);
            var48.field2700.method5933(Statics.field2092 + arg1);
            var48.field2700.method5881(arg3);
            var48.field2700.method5925(class39.field259[82] ? 1 : 0);
            field669.method2200(var48);
        }
        if (arg2 == 42) {
            class228 var49 = class228.method1927(class226.field2673, field669.field1410);
            var49.field2700.method5932(arg3);
            var49.field2700.method5932(arg0);
            var49.field2700.method5883(arg1);
            field669.method2200(var49);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 18) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var50 = class228.method1927(class226.field2615, field669.field1410);
            var50.field2700.method5923(class39.field259[82] ? 1 : 0);
            var50.field2700.method5933(Statics.field2092 + arg1);
            var50.field2700.method5989(Statics.field127 + arg0);
            var50.field2700.method5933(arg3);
            field669.method2200(var50);
        }
        if (arg2 == 22) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var51 = class228.method1927(class226.field2605, field669.field1410);
            var51.field2700.method5924(class39.field259[82] ? 1 : 0);
            var51.field2700.method5989(Statics.field127 + arg0);
            var51.field2700.method5932(arg3);
            var51.field2700.method5989(Statics.field2092 + arg1);
            field669.method2200(var51);
        }
        if (arg2 == 49) {
            class98 var52 = field739[arg3];
            if (var52 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var53 = class228.method1927(class226.field2606, field669.field1410);
                var53.field2700.method5933(arg3);
                var53.field2700.method5923(class39.field259[82] ? 1 : 0);
                field669.method2200(var53);
            }
        }
        if (arg2 == 28) {
            class228 var54 = class228.method1927(class226.field2678, field669.field1410);
            var54.field2700.method5883(arg1);
            field669.method2200(var54);
            class248 var55 = class248.method3261(arg1);
            if (var55.field3084 != null && var55.field3084[0][0] == 5) {
                int var56 = var55.field3084[0][1];
                class243.field2924[var56] = 1 - class243.field2924[var56];
                method58(var56);
            }
        }
        if (arg2 == 32) {
            class228 var57 = class228.method1927(class226.field2633, field669.field1410);
            var57.field2700.method5932(arg0);
            var57.field2700.method5881(arg3);
            var57.field2700.method5933(field779);
            var57.field2700.method5883(arg1);
            var57.field2700.method5883(Statics.field131);
            field669.method2200(var57);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 48) {
            class98 var58 = field739[arg3];
            if (var58 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var59 = class228.method1927(class226.field2609, field669.field1410);
                var59.field2700.method5932(arg3);
                var59.field2700.method5925(class39.field259[82] ? 1 : 0);
                field669.method2200(var59);
            }
        }
        if (arg2 == 3) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var60 = class228.method1927(class226.field2579, field669.field1410);
            var60.field2700.method5881(Statics.field2092 + arg1);
            var60.field2700.method5923(class39.field259[82] ? 1 : 0);
            var60.field2700.method5932(Statics.field127 + arg0);
            var60.field2700.method5881(arg3);
            field669.method2200(var60);
        }
        if (arg2 == 11) {
            class105 var61 = field664[arg3];
            if (var61 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var62 = class228.method1927(class226.field2598, field669.field1410);
                var62.field2700.method5932(arg3);
                var62.field2700.method5924(class39.field259[82] ? 1 : 0);
                field669.method2200(var62);
            }
        }
        if (arg2 == 44) {
            class98 var63 = field739[arg3];
            if (var63 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var64 = class228.method1927(class226.field2619, field669.field1410);
                var64.field2700.method5989(arg3);
                var64.field2700.method5924(class39.field259[82] ? 1 : 0);
                field669.method2200(var64);
            }
        }
        if (arg2 == 21) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var65 = class228.method1927(class226.field2679, field669.field1410);
            var65.field2700.method5989(arg3);
            var65.field2700.method5989(Statics.field2092 + arg1);
            var65.field2700.method5932(Statics.field127 + arg0);
            var65.field2700.method5925(class39.field259[82] ? 1 : 0);
            field669.method2200(var65);
        }
        if (arg2 == 31) {
            class228 var66 = class228.method1927(class226.field2621, field669.field1410);
            var66.field2700.method5932(Statics.field3783);
            var66.field2700.method5942(arg1);
            var66.field2700.method5989(Statics.field3846);
            var66.field2700.method5941(Statics.field2949);
            var66.field2700.method5932(arg3);
            var66.field2700.method5989(arg0);
            field669.method2200(var66);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 39) {
            class228 var67 = class228.method1927(class226.field2641, field669.field1410);
            var67.field2700.method5941(arg1);
            var67.field2700.method5933(arg3);
            var67.field2700.method5932(arg0);
            field669.method2200(var67);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 35) {
            class228 var68 = class228.method1927(class226.field2629, field669.field1410);
            var68.field2700.method5932(arg0);
            var68.field2700.method5933(arg3);
            var68.field2700.method5943(arg1);
            field669.method2200(var68);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 40) {
            class228 var69 = class228.method1927(class226.field2642, field669.field1410);
            var69.field2700.method5881(arg0);
            var69.field2700.method5941(arg1);
            var69.field2700.method5881(arg3);
            field669.method2200(var69);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 37) {
            class228 var70 = class228.method1927(class226.field2581, field669.field1410);
            var70.field2700.method5989(arg3);
            var70.field2700.method5881(arg0);
            var70.field2700.method5942(arg1);
            field669.method2200(var70);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 34) {
            class228 var71 = class228.method1927(class226.field2639, field669.field1410);
            var71.field2700.method5883(arg1);
            var71.field2700.method5932(arg0);
            var71.field2700.method5933(arg3);
            field669.method2200(var71);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 7) {
            class105 var72 = field664[arg3];
            if (var72 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var73 = class228.method1927(class226.field2667, field669.field1410);
                var73.field2700.method5932(arg3);
                var73.field2700.method5932(Statics.field3846);
                var73.field2700.method5942(Statics.field2949);
                var73.field2700.method5925(class39.field259[82] ? 1 : 0);
                var73.field2700.method5881(Statics.field3783);
                field669.method2200(var73);
            }
        }
        if (arg2 == 1004) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            class228 var74 = class228.method1927(class226.field2630, field669.field1410);
            var74.field2700.method5881(arg3);
            field669.method2200(var74);
        }
        if (arg2 == 14) {
            class98 var75 = field739[arg3];
            if (var75 != null) {
                field724 = arg6;
                field725 = arg7;
                field727 = 2;
                field736 = 0;
                field859 = arg0;
                field676 = arg1;
                class228 var76 = class228.method1927(class226.field2651, field669.field1410);
                var76.field2700.method5925(class39.field259[82] ? 1 : 0);
                var76.field2700.method5881(arg3);
                var76.field2700.method5933(Statics.field3783);
                var76.field2700.method5933(Statics.field3846);
                var76.field2700.method5941(Statics.field2949);
                field669.method2200(var76);
            }
        }
        if (arg2 == 24) {
            class248 var77 = class248.method3261(arg1);
            boolean var78 = true;
            if (var77.field2965 > 0) {
                var78 = method5399(var77);
            }
            if (var78) {
                class228 var79 = class228.method1927(class226.field2678, field669.field1410);
                var79.field2700.method5883(arg1);
                field669.method2200(var79);
            }
        }
        if (arg2 == 6) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var80 = class228.method1927(class226.field2617, field669.field1410);
            var80.field2700.method5881(arg3);
            var80.field2700.method5933(Statics.field2092 + arg1);
            var80.field2700.method5923(class39.field259[82] ? 1 : 0);
            var80.field2700.method5933(Statics.field127 + arg0);
            field669.method2200(var80);
        }
        if (arg2 == 2) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var81 = class228.method1927(class226.field2640, field669.field1410);
            var81.field2700.method5932(field635);
            var81.field2700.method5933(Statics.field127 + arg0);
            var81.field2700.method5989(field779);
            var81.field2700.method5880(class39.field259[82] ? 1 : 0);
            var81.field2700.method5942(Statics.field131);
            var81.field2700.method5989(Statics.field2092 + arg1);
            var81.field2700.method5933(arg3);
            field669.method2200(var81);
        }
        if (arg2 == 17) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var82 = class228.method1927(class226.field2647, field669.field1410);
            var82.field2700.method5925(class39.field259[82] ? 1 : 0);
            var82.field2700.method5883(Statics.field131);
            var82.field2700.method5933(arg3);
            var82.field2700.method5932(field779);
            var82.field2700.method5933(Statics.field127 + arg0);
            var82.field2700.method5932(field635);
            var82.field2700.method5933(Statics.field2092 + arg1);
            field669.method2200(var82);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field989.method5502(arg2, arg3, new class244(arg0), new class244(arg1));
        }
        if (arg2 == 4) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var83 = class228.method1927(class226.field2590, field669.field1410);
            var83.field2700.method5932(Statics.field2092 + arg1);
            var83.field2700.method5933(Statics.field127 + arg0);
            var83.field2700.method5923(class39.field259[82] ? 1 : 0);
            var83.field2700.method5932(arg3);
            field669.method2200(var83);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class248 var84 = class248.method165(arg1, arg0);
            if (var84 != null) {
                Statics.method582(arg3, arg1, arg0, var84.field3092, arg5);
            }
        }
        if (arg2 == 43) {
            class228 var85 = class228.method1927(class226.field2646, field669.field1410);
            var85.field2700.method5941(arg1);
            var85.field2700.method5881(arg3);
            var85.field2700.method5989(arg0);
            field669.method2200(var85);
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (arg2 == 19) {
            field724 = arg6;
            field725 = arg7;
            field727 = 2;
            field736 = 0;
            field859 = arg0;
            field676 = arg1;
            class228 var86 = class228.method1927(class226.field2614, field669.field1410);
            var86.field2700.method5989(Statics.field127 + arg0);
            var86.field2700.method5881(arg3);
            var86.field2700.method5881(Statics.field2092 + arg1);
            var86.field2700.method5923(class39.field259[82] ? 1 : 0);
            field669.method2200(var86);
        }
        if (arg2 == 1005) {
            class248 var87 = class248.method3261(arg1);
            if (var87 == null || var87.field2957[arg0] < 100000) {
                class228 var88 = class228.method1927(class226.field2630, field669.field1410);
                var88.field2700.method5881(arg3);
                field669.method2200(var88);
            } else {
                class112.method2289(27, "", var87.field2957[arg0] + " x " + class156.method4403(arg3).field1855);
            }
            field870 = 0;
            Statics.field1035 = class248.method3261(arg1);
            field730 = arg0;
        }
        if (field776 != 0) {
            field776 = 0;
            method1837(class248.method3261(Statics.field2949));
        }
        if (field778) {
            method184();
        }
        if (Statics.field1035 != null && field870 == 0) {
            method1837(Statics.field1035);
        }
    }

    @ObfuscatedName("lo.iw(ILjava/lang/String;S)V")
    public static void method5110(int arg0, String arg1) {
        int var2 = class110.field1359;
        int[] var3 = class110.field1365;
        boolean var4 = false;
        class329 var5 = new class329(arg1, Statics.field1311);
        for (int var6 = 0; var6 < var2; var6++) {
            class98 var7 = field739[var3[var6]];
            if (var7 != null && Statics.field3197 != var7 && var7.field1175 != null && var7.field1175.equals(var5)) {
                if (arg0 == 1) {
                    class228 var8 = class228.method1927(class226.field2619, field669.field1410);
                    var8.field2700.method5989(var3[var6]);
                    var8.field2700.method5924(0);
                    field669.method2200(var8);
                } else if (arg0 == 4) {
                    class228 var9 = class228.method1927(class226.field2628, field669.field1410);
                    var9.field2700.method5924(0);
                    var9.field2700.method5932(var3[var6]);
                    field669.method2200(var9);
                } else if (arg0 == 6) {
                    class228 var10 = class228.method1927(class226.field2606, field669.field1410);
                    var10.field2700.method5933(var3[var6]);
                    var10.field2700.method5923(0);
                    field669.method2200(var10);
                } else if (arg0 == 7) {
                    class228 var11 = class228.method1927(class226.field2674, field669.field1410);
                    var11.field2700.method5880(0);
                    var11.field2700.method5989(var3[var6]);
                    field669.method2200(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class112.method2289(4, "", class269.field3383 + arg1);
        }
    }

    @ObfuscatedName("ef.ip(IIIII)V")
    public static void method2832(int arg0, int arg1, int arg2, int arg3) {
        class248 var4 = class248.method165(arg0, arg1);
        if (var4 != null && var4.field2964 != null) {
            class96 var5 = new class96();
            var5.field1151 = var4;
            var5.field1159 = var4.field2964;
            Statics.method3331(var5);
        }
        field635 = arg3;
        field778 = true;
        Statics.field131 = arg0;
        field779 = arg1;
        Statics.field2811 = arg2;
        method1837(var4);
    }

    @ObfuscatedName("p.ih(B)V")
    public static void method184() {
        if (!field778) {
            return;
        }
        class248 var0 = class248.method165(Statics.field131, field779);
        if (var0 != null && var0.field3060 != null) {
            class96 var1 = new class96();
            var1.field1151 = var0;
            var1.field1159 = var0.field3060;
            Statics.method3331(var1);
        }
        field635 = -1;
        field778 = false;
        method1837(var0);
    }

    @ObfuscatedName("d.in(III)V")
    public static void method67(int arg0, int arg1) {
        class228 var2 = class228.method1927(class226.field2663, field669.field1410);
        var2.field2700.method5932(arg1);
        var2.field2700.method5941(arg0);
        field669.method2200(var2);
    }

    @ObfuscatedName("gb.ia(I)V")
    public static final void method3576() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field900 - 1; var1++) {
                if (field629[var1] < 1000 && field629[var1 + 1] > 1000) {
                    String var2 = field766[var1];
                    field766[var1] = field766[var1 + 1];
                    field766[var1 + 1] = var2;
                    String var3 = field765[var1];
                    field765[var1] = field765[var1 + 1];
                    field765[var1 + 1] = var3;
                    int var4 = field629[var1];
                    field629[var1] = field629[var1 + 1];
                    field629[var1 + 1] = var4;
                    int var5 = field649[var1];
                    field649[var1] = field649[var1 + 1];
                    field649[var1 + 1] = var5;
                    int var6 = field762[var1];
                    field762[var1] = field762[var1 + 1];
                    field762[var1 + 1] = var6;
                    int var7 = field857[var1];
                    field857[var1] = field857[var1 + 1];
                    field857[var1 + 1] = var7;
                    boolean var8 = field767[var1];
                    field767[var1] = field767[var1 + 1];
                    field767[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("n.ix(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method186(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2219(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("dq.iz(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method2219(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field759 || field900 >= 500) {
            return;
        }
        field765[field900] = arg0;
        field766[field900] = arg1;
        field629[field900] = arg2;
        field857[field900] = arg3;
        field649[field900] = arg4;
        field762[field900] = arg5;
        field767[field900] = arg6;
        field900++;
    }

    @ObfuscatedName("cw.ii(I)I")
    public static final int method2017() {
        return field900 - 1;
    }

    @ObfuscatedName("gs.ic(I)V")
    public static void method3398() {
        for (int var0 = 0; var0 < field900; var0++) {
            if (method2936(field629[var0])) {
                if (var0 < field900 - 1) {
                    for (int var1 = var0; var1 < field900 - 1; var1++) {
                        field765[var1] = field765[var1 + 1];
                        field766[var1] = field766[var1 + 1];
                        field629[var1] = field629[var1 + 1];
                        field857[var1] = field857[var1 + 1];
                        field649[var1] = field649[var1 + 1];
                        field762[var1] = field762[var1 + 1];
                        field767[var1] = field767[var1 + 1];
                    }
                }
                var0--;
                field900--;
            }
        }
        method4690();
    }

    @ObfuscatedName("fx.iu(II)Z")
    public static boolean method2936(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("f.if(II)Ljava/lang/String;")
    public static String method2(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field766[arg0].length() > 0) {
            return field765[arg0] + class269.field3394 + field766[arg0];
        } else {
            return field765[arg0];
        }
    }

    @ObfuscatedName("oo.ik(IIIII)V")
    public static final void method6172(int arg0, int arg1, int arg2, int arg3) {
        if (field776 == 0 && !field778) {
            method186(class269.field3389, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class207.field2501;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class207.method3812(var4);
                    class98 var14 = field739[field836];
                    method2011(var14, field836, var11, var13);
                }
                return;
            }
            long var15 = class207.method2238(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    long var17 = class207.field2490[var8];
                    int var19 = (int) (var17 >>> 0 & 0x7FL);
                    int var21 = var19;
                    int var22 = class207.method3812(class207.field2490[var8]);
                    int var23 = var22;
                    long var24 = class207.field2490[var8];
                    int var26 = (int) (var24 >>> 14 & 0x3L);
                    int var29 = class207.method1030(class207.field2490[var8]);
                    int var30 = var29;
                    if (var26 == 2 && Statics.field292.method3619(Statics.field438, var19, var22, var15) >= 0) {
                        class155 var31 = class155.method1864(var29);
                        if (var31.field1798 != null) {
                            var31 = var31.method2712();
                        }
                        if (var31 == null) {
                            break label277;
                        }
                        if (field776 == 1) {
                            method186(class269.field3384, field777 + " " + class106.field1335 + " " + class106.method1825(65535) + var31.field1767, 1, var29, var19, var22);
                        } else if (!field778) {
                            String[] var32 = var31.field1794;
                            if (var32 != null) {
                                for (int var33 = 4; var33 >= 0; var33--) {
                                    if (var32[var33] != null) {
                                        short var34 = 0;
                                        if (var33 == 0) {
                                            var34 = 3;
                                        }
                                        if (var33 == 1) {
                                            var34 = 4;
                                        }
                                        if (var33 == 2) {
                                            var34 = 5;
                                        }
                                        if (var33 == 3) {
                                            var34 = 6;
                                        }
                                        if (var33 == 4) {
                                            var34 = 1001;
                                        }
                                        method186(var32[var33], class106.method1825(65535) + var31.field1767, var34, var30, var21, var23);
                                    }
                                }
                            }
                            method186(class269.field3298, class106.method1825(65535) + var31.field1767, 1002, var31.field1779, var21, var23);
                        } else if ((Statics.field2811 & 0x4) == 4) {
                            method186(field781, field782 + " " + class106.field1335 + " " + class106.method1825(65535) + var31.field1767, 2, var29, var19, var22);
                        }
                    }
                    if (var26 == 1) {
                        class105 var35 = field664[var30];
                        if (var35 == null) {
                            break label277;
                        }
                        if (var35.field1328.field1666 == 1 && (var35.field1242 & 0x7F) == 64 && (var35.field1223 & 0x7F) == 64) {
                            for (int var36 = 0; var36 < field665; var36++) {
                                class105 var37 = field664[field666[var36]];
                                if (var37 != null && var35 != var37 && var37.field1328.field1666 == 1 && var35.field1242 == var37.field1242 && var35.field1223 == var37.field1223) {
                                    method5649(var37.field1328, field666[var36], var21, var23);
                                }
                            }
                            int var38 = class110.field1359;
                            int[] var39 = class110.field1365;
                            for (int var40 = 0; var40 < var38; var40++) {
                                class98 var41 = field739[var39[var40]];
                                if (var41 != null && var35.field1242 == var41.field1242 && var35.field1223 == var41.field1223) {
                                    method2011(var41, var39[var40], var21, var23);
                                }
                            }
                        }
                        method5649(var35.field1328, var30, var21, var23);
                    }
                    if (var26 == 0) {
                        class98 var42 = field739[var30];
                        if (var42 == null) {
                            break label277;
                        }
                        if ((var42.field1242 & 0x7F) == 64 && (var42.field1223 & 0x7F) == 64) {
                            for (int var43 = 0; var43 < field665; var43++) {
                                class105 var44 = field664[field666[var43]];
                                if (var44 != null && var44.field1328.field1666 == 1 && var42.field1242 == var44.field1242 && var42.field1223 == var44.field1223) {
                                    method5649(var44.field1328, field666[var43], var21, var23);
                                }
                            }
                            int var45 = class110.field1359;
                            int[] var46 = class110.field1365;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class98 var48 = field739[var46[var47]];
                                if (var48 != null && var42 != var48 && var42.field1242 == var48.field1242 && var42.field1223 == var48.field1223) {
                                    method2011(var48, var46[var47], var21, var23);
                                }
                            }
                        }
                        if (field836 == var30) {
                            var4 = var15;
                        } else {
                            method2011(var42, var30, var21, var23);
                        }
                    }
                    if (var26 == 3) {
                        class295 var49 = field751[Statics.field438][var21][var23];
                        if (var49 != null) {
                            for (class109 var50 = (class109) var49.method4725(); var50 != null; var50 = (class109) var49.method4717()) {
                                class156 var51 = class156.method4403(var50.field1356);
                                if (field776 == 1) {
                                    method186(class269.field3384, field777 + " " + class106.field1335 + " " + class106.method1825(16748608) + var51.field1855, 16, var50.field1356, var21, var23);
                                } else if (!field778) {
                                    String[] var52 = var51.field1834;
                                    for (int var53 = 4; var53 >= 0; var53--) {
                                        if (var52 != null && var52[var53] != null) {
                                            byte var54 = 0;
                                            if (var53 == 0) {
                                                var54 = 18;
                                            }
                                            if (var53 == 1) {
                                                var54 = 19;
                                            }
                                            if (var53 == 2) {
                                                var54 = 20;
                                            }
                                            if (var53 == 3) {
                                                var54 = 21;
                                            }
                                            if (var53 == 4) {
                                                var54 = 22;
                                            }
                                            method186(var52[var53], class106.method1825(16748608) + var51.field1855, var54, var50.field1356, var21, var23);
                                        } else if (var53 == 2) {
                                            method186(class269.field3231, class106.method1825(16748608) + var51.field1855, 20, var50.field1356, var21, var23);
                                        }
                                    }
                                    method186(class269.field3298, class106.method1825(16748608) + var51.field1855, 1004, var50.field1356, var21, var23);
                                } else if ((Statics.field2811 & 0x1) == 1) {
                                    method186(field781, field782 + " " + class106.field1335 + " " + class106.method1825(16748608) + var51.field1855, 17, var50.field1356, var21, var23);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("mb.is(Lev;IIII)V")
    public static final void method5649(class147 arg0, int arg1, int arg2, int arg3) {
        if (field900 >= 400) {
            return;
        }
        if (arg0.field1667 != null) {
            arg0 = arg0.method2538();
        }
        if (arg0 == null || !arg0.field1644 || arg0.field1672 && field793 != arg1) {
            return;
        }
        String var4 = arg0.field1642;
        if (arg0.field1659 != 0) {
            int var6 = arg0.field1659;
            int var7 = Statics.field3197.field1201;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class106.method1825(16711680);
            } else if (var8 < -6) {
                var9 = class106.method1825(16723968);
            } else if (var8 < -3) {
                var9 = class106.method1825(16740352);
            } else if (var8 < 0) {
                var9 = class106.method1825(16756736);
            } else if (var8 > 9) {
                var9 = class106.method1825(65280);
            } else if (var8 > 6) {
                var9 = class106.method1825(4259584);
            } else if (var8 > 3) {
                var9 = class106.method1825(8453888);
            } else if (var8 > 0) {
                var9 = class106.method1825(12648192);
            } else {
                var9 = class106.method1825(16776960);
            }
            var4 = var4 + var9 + " " + class106.field1333 + class269.field3390 + arg0.field1659 + class106.field1334;
        }
        if (arg0.field1672 && field835) {
            method186(class269.field3298, class106.method1825(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field776 == 1) {
            method186(class269.field3384, field777 + " " + class106.field1335 + " " + class106.method1825(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field778) {
            int var10 = arg0.field1672 && field835 ? 2000 : 0;
            String[] var11 = arg0.field1657;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class269.field3386)) {
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
                        method186(var11[var12], class106.method1825(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class269.field3386)) {
                        short var15 = 0;
                        if (field641 != class108.field1346) {
                            if (field641 == class108.field1344 || field641 == class108.field1348 && arg0.field1659 > Statics.field3197.field1201) {
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
                            method186(var11[var14], class106.method1825(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field1672 || !field835) {
                method186(class269.field3298, class106.method1825(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2811 & 0x2) == 2) {
            method186(field781, field782 + " " + class106.field1335 + " " + class106.method1825(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cl.ij(Lcj;IIII)V")
    public static final void method2011(class98 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3197 == arg0 || field900 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1188 == 0) {
            String var4 = arg0.field1180[0] + arg0.field1175 + arg0.field1180[1];
            int var5 = arg0.field1201;
            int var6 = Statics.field3197.field1201;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class106.method1825(16711680);
            } else if (var7 < -6) {
                var8 = class106.method1825(16723968);
            } else if (var7 < -3) {
                var8 = class106.method1825(16740352);
            } else if (var7 < 0) {
                var8 = class106.method1825(16756736);
            } else if (var7 > 9) {
                var8 = class106.method1825(65280);
            } else if (var7 > 6) {
                var8 = class106.method1825(4259584);
            } else if (var7 > 3) {
                var8 = class106.method1825(8453888);
            } else if (var7 > 0) {
                var8 = class106.method1825(12648192);
            } else {
                var8 = class106.method1825(16776960);
            }
            var9 = var4 + var8 + " " + class106.field1333 + class269.field3390 + arg0.field1201 + class106.field1334 + arg0.field1180[2];
        } else {
            var9 = arg0.field1180[0] + arg0.field1175 + arg0.field1180[1] + " " + class106.field1333 + class269.field3391 + arg0.field1188 + class106.field1334 + arg0.field1180[2];
        }
        if (field776 == 1) {
            method186(class269.field3384, field777 + " " + class106.field1335 + " " + class106.method1825(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field778) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field747[var10] != null) {
                    short var11 = 0;
                    if (field747[var10].equalsIgnoreCase(class269.field3386)) {
                        if (field647 == class108.field1346) {
                            continue;
                        }
                        if (field647 == class108.field1344 || field647 == class108.field1348 && arg0.field1201 > Statics.field3197.field1201) {
                            var11 = 2000;
                        }
                        if (Statics.field3197.field1195 == 0 || arg0.field1195 == 0) {
                            if (arg0.method1953()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field3197.field1195 == arg0.field1195) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field748[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field715[var10] + var11;
                    method186(field747[var10], class106.method1825(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2811 & 0x8) == 8) {
            method186(field781, field782 + " " + class106.field1335 + " " + class106.method1825(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field900; var14++) {
            if (field629[var14] == 23) {
                field766[var14] = class106.method1825(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bi.ig(IIIIIIIIB)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class248.method182(arg0)) {
            Statics.field2136 = null;
            method712(Statics.field613[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2136 != null) {
                method712(Statics.field2136, -1412584499, arg1, arg2, arg3, arg4, Statics.field1539, Statics.field297, arg7);
                Statics.field2136 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field832[var8] = true;
            }
        } else {
            field832[arg7] = true;
        }
    }

    @ObfuscatedName("bq.im([Liv;IIIIIIIII)V")
    public static final void method712(class248[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class393.method6217(arg2, arg3, arg4, arg5);
        class197.method3493();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class248 var10 = arg0[var9];
            if (var10 != null && (var10.field2980 == arg1 || arg1 == -1412584499 && field842 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field772[field714] = var10.field2974 + arg6;
                    field754[field714] = var10.field3024 + arg7;
                    field837[field714] = var10.field3080;
                    field838[field714] = var10.field2977;
                    var11 = ++field714 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3103 = var11;
                var10.field3104 = field631;
                if (!var10.field2955 || !method261(var10)) {
                    if (var10.field2965 > 0) {
                        method5075(var10);
                    }
                    int var12 = var10.field2974 + arg6;
                    int var13 = var10.field3024 + arg7;
                    int var14 = var10.field2992;
                    if (field842 == var10) {
                        if (arg1 != -1412584499 && !var10.field3094) {
                            Statics.field2136 = arg0;
                            Statics.field1539 = arg6;
                            Statics.field297 = arg7;
                            continue;
                        }
                        if (field746 && field822) {
                            int var15 = class48.field368;
                            int var16 = class48.field362;
                            int var17 = var15 - field798;
                            int var18 = var16 - field750;
                            if (var17 < field802) {
                                var17 = field802;
                            }
                            if (var10.field3080 + var17 > field802 + field622.field3080) {
                                var17 = field802 + field622.field3080 - var10.field3080;
                            }
                            if (var18 < field803) {
                                var18 = field803;
                            }
                            if (var10.field2977 + var18 > field803 + field622.field2977) {
                                var18 = field803 + field622.field2977 - var10.field2977;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3094) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2963 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2963 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3080 + var12;
                        int var26 = var10.field2977 + var13;
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
                        int var29 = var10.field3080 + var12;
                        int var30 = var10.field2977 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2955 || var19 < var21 && var20 < var22) {
                        if (var10.field2965 != 0) {
                            if (var10.field2965 == 1336) {
                                if (field729) {
                                    var13 += 15;
                                    Statics.field3858.method4895("Fps:" + field347, var10.field3080 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field624) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3858.method4895("Mem:" + var32 + "k", var10.field3080 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2965 == 1337) {
                                field680 = var12;
                                field893 = var13;
                                method2286(var12, var13, var10.field3080, var10.field2977);
                                field832[var10.field3103] = true;
                                class393.method6217(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2965 == 1338) {
                                Statics.method2854(var10, var12, var13, var11);
                                class393.method6217(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2965 == 1339) {
                                method6442(var10, var12, var13, var11);
                                class393.method6217(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2965 == 1400) {
                                Statics.field989.method5508(var12, var13, var10.field3080, var10.field2977, field631);
                            }
                            if (var10.field2965 == 1401) {
                                Statics.field989.method5469(var12, var13, var10.field3080, var10.field2977);
                            }
                            if (var10.field2965 == 1402) {
                                Statics.field1205.method2038(var12, field631);
                            }
                        }
                        if (var10.field2963 == 0) {
                            if (!var10.field2955 && method261(var10) && Statics.field2916 != var10) {
                                continue;
                            }
                            if (!var10.field2955) {
                                if (var10.field2966 > var10.field2985 - var10.field2977) {
                                    var10.field2966 = var10.field2985 - var10.field2977;
                                }
                                if (var10.field2966 < 0) {
                                    var10.field2966 = 0;
                                }
                            }
                            method712(arg0, var10.field2960, var19, var20, var21, var22, var12 - var10.field3067, var13 - var10.field2966, var11);
                            if (var10.field3096 != null) {
                                method712(var10.field3096, var10.field2960, var19, var20, var21, var22, var12 - var10.field3067, var13 - var10.field2966, var11);
                            }
                            class95 var34 = (class95) field796.method5691((long) var10.field2960);
                            if (var34 != null) {
                                method733(var34.field1147, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class393.method6217(arg2, arg3, arg4, arg5);
                            class197.method3493();
                        }
                        if (field841 || field834[var11] || field839 > 1) {
                            if (var10.field2963 == 0 && !var10.field2955 && var10.field2985 > var10.field2977) {
                                method5288(var10.field3080 + var12, var13, var10.field2966, var10.field2977, var10.field2985);
                            }
                            if (var10.field2963 != 1) {
                                if (var10.field2963 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2979; var36++) {
                                        for (int var37 = 0; var37 < var10.field3063; var37++) {
                                            int var38 = (var10.field3028 + 32) * var37 + var12;
                                            int var39 = (var10.field3029 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2976[var35];
                                                var39 += var10.field3031[var35];
                                            }
                                            if (var10.field3045[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3045[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1679 == var10 && field620 == var35) {
                                                    class397 var43;
                                                    if (field776 == 1 && Statics.field3783 == var35 && Statics.field2949 == var10.field2960) {
                                                        var43 = class156.method2591(var42, var10.field2957[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class156.method2591(var42, var10.field2957[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1837(var10);
                                                    } else if (Statics.field1679 == var10 && field620 == var35) {
                                                        int var44 = class48.field368 - field744;
                                                        int var45 = class48.field362 - field733;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field668 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6292(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class248 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class393.field4229 && var46.field2966 > 0) {
                                                                int var47 = field684 * (class393.field4229 - var39 - var45) / 3;
                                                                if (var47 > field684 * 10) {
                                                                    var47 = field684 * 10;
                                                                }
                                                                if (var47 > var46.field2966) {
                                                                    var47 = var46.field2966;
                                                                }
                                                                var46.field2966 -= var47;
                                                                field733 += var47;
                                                                method1837(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class393.field4231 && var46.field2966 < var46.field2985 - var46.field2977) {
                                                                int var48 = field684 * (var39 + var45 + 32 - class393.field4231) / 3;
                                                                if (var48 > field684 * 10) {
                                                                    var48 = field684 * 10;
                                                                }
                                                                if (var48 > var46.field2985 - var46.field2977 - var46.field2966) {
                                                                    var48 = var46.field2985 - var46.field2977 - var46.field2966;
                                                                }
                                                                var46.field2966 += var48;
                                                                field733 -= var48;
                                                                method1837(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1035 == var10 && field730 == var35) {
                                                        var43.method6292(var38, var39, 128);
                                                    } else {
                                                        var43.method6352(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3032 != null && var35 < 20) {
                                                class397 var49 = var10.method4329(var35);
                                                if (var49 != null) {
                                                    var49.method6352(var38, var39);
                                                } else if (class248.field2959) {
                                                    method1837(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2963 == 3) {
                                    int var50;
                                    if (method5155(var10)) {
                                        var50 = var10.field2987;
                                        if (Statics.field2916 == var10 && var10.field2984 != 0) {
                                            var50 = var10.field2984;
                                        }
                                    } else {
                                        var50 = var10.field2986;
                                        if (Statics.field2916 == var10 && var10.field3085 != 0) {
                                            var50 = var10.field3085;
                                        }
                                    }
                                    if (var10.field2990) {
                                        switch(var10.field2991.field4243) {
                                            case 1:
                                                class393.method6200(var12, var13, var10.field3080, var10.field2977, var10.field2986, var10.field2987);
                                                break;
                                            case 2:
                                                class393.method6186(var12, var13, var10.field3080, var10.field2977, var10.field2986, var10.field2987, 255 - (var10.field2992 & 0xFF), 255 - (var10.field2993 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class393.method6184(var12, var13, var10.field3080, var10.field2977, var50);
                                                } else {
                                                    class393.method6183(var12, var13, var10.field3080, var10.field2977, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class393.method6192(var12, var13, var10.field3080, var10.field2977, var50);
                                    } else {
                                        class393.method6189(var12, var13, var10.field3080, var10.field2977, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2963 == 4) {
                                    class301 var51 = var10.method4346();
                                    if (var51 != null) {
                                        String var52 = var10.field3022;
                                        int var53;
                                        if (method5155(var10)) {
                                            var53 = var10.field2987;
                                            if (Statics.field2916 == var10 && var10.field2984 != 0) {
                                                var53 = var10.field2984;
                                            }
                                            if (var10.field3023.length() > 0) {
                                                var52 = var10.field3023;
                                            }
                                        } else {
                                            var53 = var10.field2986;
                                            if (Statics.field2916 == var10 && var10.field3085 != 0) {
                                                var53 = var10.field3085;
                                            }
                                        }
                                        if (var10.field2955 && var10.field3092 != -1) {
                                            class156 var54 = class156.method4403(var10.field3092);
                                            var52 = var54.field1855;
                                            if (var52 == null) {
                                                var52 = class269.field3238;
                                            }
                                            if ((var54.field1831 == 1 || var10.field3093 != 1) && var10.field3093 != -1) {
                                                var52 = class106.method1825(16748608) + var52 + class106.field1337 + " " + 'x' + method4244(var10.field3093);
                                            }
                                        }
                                        if (field789 == var10) {
                                            var52 = class269.field3496;
                                            var53 = var10.field2986;
                                        }
                                        if (!var10.field2955) {
                                            var52 = method1923(var52, var10);
                                        }
                                        var51.method4897(var52, var12, var13, var10.field3080, var10.field2977, var53, var10.field3027 ? 0 : -1, var10.field3025, var10.field3026, var10.field3102);
                                    } else if (class248.field2959) {
                                        method1837(var10);
                                    }
                                } else if (var10.field2963 == 5) {
                                    if (var10.field2955) {
                                        class397 var56;
                                        if (var10.field3092 == -1) {
                                            var56 = var10.method4328(false);
                                        } else {
                                            var56 = class156.method2591(var10.field3092, var10.field3093, var10.field3000, var10.field3017, var10.field3020, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4259;
                                            int var58 = var56.field4260;
                                            if (var10.field2999) {
                                                class393.method6205(var12, var13, var10.field3080 + var12, var10.field2977 + var13);
                                                int var59 = (var10.field3080 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2977 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3053 != 0) {
                                                            var56.method6358(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3053, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6352(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6292(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class393.method6217(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3080 * 4096 / var57;
                                                if (var10.field3053 != 0) {
                                                    var56.method6358(var10.field3080 / 2 + var12, var10.field2977 / 2 + var13, var10.field3053, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6294(var12, var13, var10.field3080, var10.field2977, 256 - (var14 & 0xFF));
                                                } else if (var10.field3080 == var57 && var10.field2977 == var58) {
                                                    var56.method6352(var12, var13);
                                                } else {
                                                    var56.method6394(var12, var13, var10.field3080, var10.field2977);
                                                }
                                            }
                                        } else if (class248.field2959) {
                                            method1837(var10);
                                        }
                                    } else {
                                        class397 var55 = var10.method4328(method5155(var10));
                                        if (var55 != null) {
                                            var55.method6352(var12, var13);
                                        } else if (class248.field2959) {
                                            method1837(var10);
                                        }
                                    }
                                } else if (var10.field2963 == 6) {
                                    boolean var64 = method5155(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3009;
                                    } else {
                                        var65 = var10.field3008;
                                    }
                                    class206 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3092 != -1) {
                                        class156 var68 = class156.method4403(var10.field3092);
                                        if (var68 != null) {
                                            class156 var69 = var68.method2765(var10.field3093);
                                            var66 = var69.method2764(1);
                                            if (var66 == null) {
                                                method1837(var10);
                                            } else {
                                                var66.method3842();
                                                var67 = var66.field2359 / 2;
                                            }
                                        }
                                    } else if (var10.field3004 == 5) {
                                        if (var10.field3005 == 0) {
                                            var66 = field890.method4288((class158) null, -1, (class158) null, -1);
                                        } else {
                                            var66 = Statics.field3197.method1758();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4331((class158) null, -1, var64, Statics.field3197.field1176);
                                        if (var66 == null && class248.field2959) {
                                            method1837(var10);
                                        }
                                    } else {
                                        class158 var70 = class158.method3363(var65);
                                        var66 = var10.method4331(var70, var10.field3043, var64, Statics.field3197.field1176);
                                        if (var66 == null && class248.field2959) {
                                            method1837(var10);
                                        }
                                    }
                                    class197.method3492(var10.field3080 / 2 + var12, var10.field2977 / 2 + var13);
                                    int var71 = var10.field3006 * class197.field2271[var10.field3091] >> 16;
                                    int var72 = var10.field3006 * class197.field2285[var10.field3091] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2955) {
                                            var66.method3842();
                                            if (var10.field3018) {
                                                var66.method3847(0, var10.field3003, var10.field3014, var10.field3091, var10.field3030, var10.field3011 + var67 + var71, var10.field3011 + var72, var10.field3006);
                                            } else {
                                                var66.method3883(0, var10.field3003, var10.field3014, var10.field3091, var10.field3030, var10.field3011 + var67 + var71, var10.field3011 + var72);
                                            }
                                        } else {
                                            var66.method3883(0, var10.field3003, 0, var10.field3091, 0, var71, var72);
                                        }
                                    }
                                    class197.method3495();
                                } else {
                                    if (var10.field2963 == 7) {
                                        class301 var73 = var10.method4346();
                                        if (var73 == null) {
                                            if (class248.field2959) {
                                                method1837(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2979; var75++) {
                                            for (int var76 = 0; var76 < var10.field3063; var76++) {
                                                if (var10.field3045[var74] > 0) {
                                                    class156 var77 = class156.method4403(var10.field3045[var74] - 1);
                                                    String var78;
                                                    if (var77.field1831 != 1 && var10.field2957[var74] == 1) {
                                                        var78 = class106.method1825(16748608) + var77.field1855 + class106.field1337;
                                                    } else {
                                                        var78 = class106.method1825(16748608) + var77.field1855 + class106.field1337 + " " + 'x' + method4244(var10.field2957[var74]);
                                                    }
                                                    int var79 = (var10.field3028 + 115) * var76 + var12;
                                                    int var80 = (var10.field3029 + 12) * var75 + var13;
                                                    if (var10.field3025 == 0) {
                                                        var73.method4924(var78, var79, var80, var10.field2986, var10.field3027 ? 0 : -1);
                                                    } else if (var10.field3025 == 1) {
                                                        var73.method4884(var78, var10.field3080 / 2 + var79, var80, var10.field2986, var10.field3027 ? 0 : -1);
                                                    } else {
                                                        var73.method4895(var78, var10.field3080 + var79 - 1, var80, var10.field2986, var10.field3027 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2963 == 8 && Statics.field43 == var10 && field774 == field694) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class301 var83 = Statics.field3858;
                                        String var84 = var10.field3022;
                                        String var85 = method1923(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class106.field1336);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4889(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3728 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3080 + var12 - 5 - var81;
                                        int var90 = var10.field2977 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class393.method6184(var89, var90, var81, var82, 16777120);
                                        class393.method6192(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3022;
                                        int var92 = var83.field3728 + var90 + 2;
                                        String var93 = method1923(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class106.field1336);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4924(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3728 + 1;
                                        }
                                    }
                                    if (var10.field2963 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2995) {
                                            var96 = var12;
                                            var97 = var10.field2977 + var13;
                                            var98 = var10.field3080 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3080 + var12;
                                            var99 = var10.field2977 + var13;
                                        }
                                        if (var10.field2994 == 1) {
                                            class393.method6194(var96, var97, var98, var99, var10.field2986);
                                        } else {
                                            method4319(var96, var97, var98, var99, var10.field2986, var10.field2994);
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

    @ObfuscatedName("ih.jc(IIIIIIS)V")
    public static final void method4319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class393.field4234;
        int var18 = arg1 - class393.field4229;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class197.method3501(var19, var20, var21);
        class197.method3504(var23, var24, var25, var19, var20, var21, arg4);
        class197.method3501(var19, var21, var22);
        class197.method3504(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("cy.jj(Ljava/lang/String;Liv;I)Ljava/lang/String;")
    public static String method1923(String arg0, class248 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method204(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ib.ji(IB)Ljava/lang/String;")
    public static final String method4244(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class106.field1331 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class106.method1825(65408) + var1.substring(0, var1.length() - 8) + class269.field3395 + " " + class106.field1333 + var1 + class106.field1334 + class106.field1337;
        } else if (var1.length() > 6) {
            return " " + class106.method1825(16777215) + var1.substring(0, var1.length() - 4) + class269.field3344 + " " + class106.field1333 + var1 + class106.field1334 + class106.field1337;
        } else {
            return " " + class106.method1825(16776960) + var1 + class106.field1337;
        }
    }

    @ObfuscatedName("client.js(ZI)V")
    public final void method1156(boolean arg0) {
        method2354(field783, Statics.field1350, Statics.field5, arg0);
    }

    @ObfuscatedName("client.jl(Liv;I)V")
    public void method1064(class248 arg0) {
        class248 var2 = arg0.field2980 == -1 ? null : class248.method3261(arg0.field2980);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1350;
            var4 = Statics.field5;
        } else {
            var3 = var2.field3080;
            var4 = var2.field2977;
        }
        method5650(arg0, var3, var4, false);
        method365(arg0, var3, var4);
    }

    @ObfuscatedName("fg.jg([Liv;Liv;ZI)V")
    public static void method2960(class248[] arg0, class248 arg1, boolean arg2) {
        int var3 = arg1.field3059 == 0 ? arg1.field3080 : arg1.field3059;
        int var4 = arg1.field2985 == 0 ? arg1.field2977 : arg1.field2985;
        method1841(arg0, arg1.field2960, var3, var4, arg2);
        if (arg1.field3096 != null) {
            method1841(arg1.field3096, arg1.field2960, var3, var4, arg2);
        }
        class95 var5 = (class95) field796.method5691((long) arg1.field2960);
        if (var5 != null) {
            method2354(var5.field1147, var3, var4, arg2);
        }
        if (arg1.field2965 == 1337) {
        }
    }

    @ObfuscatedName("dn.jm(IIIZI)V")
    public static final void method2354(int arg0, int arg1, int arg2, boolean arg3) {
        if (class248.method182(arg0)) {
            method1841(Statics.field613[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cb.jd([Liv;IIIZI)V")
    public static void method1841(class248[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class248 var6 = arg0[var5];
            if (var6 != null && var6.field2980 == arg1) {
                method5650(var6, arg2, arg3, arg4);
                method365(var6, arg2, arg3);
                if (var6.field3067 > var6.field3059 - var6.field3080) {
                    var6.field3067 = var6.field3059 - var6.field3080;
                }
                if (var6.field3067 < 0) {
                    var6.field3067 = 0;
                }
                if (var6.field2966 > var6.field2985 - var6.field2977) {
                    var6.field2966 = var6.field2985 - var6.field2977;
                }
                if (var6.field2966 < 0) {
                    var6.field2966 = 0;
                }
                if (var6.field2963 == 0) {
                    method2960(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("mb.jh(Liv;IIZS)V")
    public static void method5650(class248 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3080;
        int var5 = arg0.field2977;
        if (arg0.field2968 == 0) {
            arg0.field3080 = arg0.field3063;
        } else if (arg0.field2968 == 1) {
            arg0.field3080 = arg1 - arg0.field3063;
        } else if (arg0.field2968 == 2) {
            arg0.field3080 = arg0.field3063 * arg1 >> 14;
        }
        if (arg0.field2969 == 0) {
            arg0.field2977 = arg0.field2979;
        } else if (arg0.field2969 == 1) {
            arg0.field2977 = arg2 - arg0.field2979;
        } else if (arg0.field2969 == 2) {
            arg0.field2977 = arg0.field2979 * arg2 >> 14;
        }
        if (arg0.field2968 == 4) {
            arg0.field3080 = arg0.field2978 * arg0.field2977 / arg0.field2958;
        }
        if (arg0.field2969 == 4) {
            arg0.field2977 = arg0.field3080 * arg0.field2958 / arg0.field2978;
        }
        if (arg0.field2965 == 1337) {
            field795 = arg0;
        }
        if (arg3 && arg0.field3078 != null && (arg0.field3080 != var4 || arg0.field2977 != var5)) {
            class96 var6 = new class96();
            var6.field1151 = arg0;
            var6.field1159 = arg0.field3078;
            field826.method4716(var6);
        }
    }

    @ObfuscatedName("au.jo(Liv;IIB)V")
    public static void method365(class248 arg0, int arg1, int arg2) {
        if (arg0.field3010 == 0) {
            arg0.field2974 = arg0.field2970;
        } else if (arg0.field3010 == 1) {
            arg0.field2974 = (arg1 - arg0.field3080) / 2 + arg0.field2970;
        } else if (arg0.field3010 == 2) {
            arg0.field2974 = arg1 - arg0.field3080 - arg0.field2970;
        } else if (arg0.field3010 == 3) {
            arg0.field2974 = arg0.field2970 * arg1 >> 14;
        } else if (arg0.field3010 == 4) {
            arg0.field2974 = (arg0.field2970 * arg1 >> 14) + (arg1 - arg0.field3080) / 2;
        } else {
            arg0.field2974 = arg1 - arg0.field3080 - (arg0.field2970 * arg1 >> 14);
        }
        if (arg0.field2967 == 0) {
            arg0.field3024 = arg0.field2954;
        } else if (arg0.field2967 == 1) {
            arg0.field3024 = (arg2 - arg0.field2977) / 2 + arg0.field2954;
        } else if (arg0.field2967 == 2) {
            arg0.field3024 = arg2 - arg0.field2977 - arg0.field2954;
        } else if (arg0.field2967 == 3) {
            arg0.field3024 = arg0.field2954 * arg2 >> 14;
        } else if (arg0.field2967 == 4) {
            arg0.field3024 = (arg0.field2954 * arg2 >> 14) + (arg2 - arg0.field2977) / 2;
        } else {
            arg0.field3024 = arg2 - arg0.field2977 - (arg0.field2954 * arg2 >> 14);
        }
    }

    @ObfuscatedName("q.ja(Liv;IIIIIII)V")
    public static final void method170(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field690) {
            field895 = 32;
        } else {
            field895 = 0;
        }
        field690 = false;
        if (class48.field360 == 1 || !Statics.field1450 && class48.field360 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2966 -= 4;
                method1837(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2966 += 4;
                method1837(arg0);
            } else if (arg5 >= arg1 - field895 && arg5 < field895 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2966 = (arg4 - arg3) * var8 / var9;
                method1837(arg0);
                field690 = true;
            }
        }
        if (field825 == 0) {
            return;
        }
        int var10 = arg0.field3080;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2966 += field825 * 45;
            method1837(arg0);
        }
    }

    @ObfuscatedName("lx.jw(IIIIII)V")
    public static final void method5288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field775[0].method6257(arg0, arg1);
        Statics.field775[1].method6257(arg0, arg1 + arg3 - 16);
        class393.method6184(arg0, arg1 + 16, 16, arg3 - 32, field686);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class393.method6184(arg0, arg1 + 16 + var6, 16, var5, field687);
        class393.method6190(arg0, arg1 + 16 + var6, var5, field689);
        class393.method6190(arg0 + 1, arg1 + 16 + var6, var5, field689);
        class393.method6232(arg0, arg1 + 16 + var6, 16, field689);
        class393.method6232(arg0, arg1 + 17 + var6, 16, field689);
        class393.method6190(arg0 + 15, arg1 + 16 + var6, var5, field819);
        class393.method6190(arg0 + 14, arg1 + 17 + var6, var5 - 1, field819);
        class393.method6232(arg0, arg1 + 15 + var6 + var5, 16, field819);
        class393.method6232(arg0 + 1, arg1 + 14 + var6 + var5, 15, field819);
    }

    @ObfuscatedName("lp.jn(Liv;I)Z")
    public static final boolean method5155(class248 arg0) {
        if (arg0.field3007 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3007.length; var1++) {
            int var2 = method204(arg0, var1);
            int var3 = arg0.field3051[var1];
            if (arg0.field3007[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3007[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3007[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ak.jf(Liv;IB)I")
    public static final int method204(class248 arg0, int arg1) {
        if (arg0.field3084 == null || arg1 >= arg0.field3084.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3084[arg1];
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
                    var7 = field755[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field756[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field788[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class248 var11 = class248.method3261(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class156.method4403(var12).field1833 || field623)) {
                        for (int var13 = 0; var13 < var11.field3045.length; var13++) {
                            if (var12 + 1 == var11.field3045[var13]) {
                                var7 += var11.field2957[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class243.field2924[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class258.field3174[field756[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class243.field2924[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3197.field1201;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class258.field3173[var14]) {
                            var7 += field756[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class248 var17 = class248.method3261(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class156.method4403(var18).field1833 || field623)) {
                        for (int var19 = 0; var19 < var17.field3045.length; var19++) {
                            if (var18 + 1 == var17.field3045[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field728;
                }
                if (var6 == 12) {
                    var7 = field682;
                }
                if (var6 == 13) {
                    int var20 = class243.field2924[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class243.method1005(var22);
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
                    var7 = (Statics.field3197.field1242 >> 7) + Statics.field127;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3197.field1223 >> 7) + Statics.field2092;
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

    @ObfuscatedName("g.jq(Liv;Lef;IIZI)V")
    public static final void method156(class248 arg0, class156 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1853;
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
            var7 = class269.field3232;
        }
        if (var6 != -1 && var7 != null) {
            method2219(var7, class106.method1825(16748608) + arg1.field1855, var6, arg1.field1838, arg2, arg0.field2960, arg4);
        }
    }

    @ObfuscatedName("mk.jb(ZB)V")
    public static void method5643(boolean arg0) {
        field770 = arg0;
    }

    @ObfuscatedName("cr.jk(I)Z")
    public static boolean method1997() {
        return field770;
    }

    @ObfuscatedName("dq.jr(IIIIIIII)V")
    public static final void method2217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class248.method182(arg0)) {
            method1773(Statics.field613[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cz.je([Liv;IIIIIIII)V")
    public static final void method1773(class248[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class248 var9 = arg0[var8];
            if (var9 != null && var9.field2980 == arg1 && (!var9.field2955 || var9.field2963 == 0 || var9.field3048 || method188(var9) != 0 || field622 == var9 || var9.field2965 == 1338)) {
                if (var9.field2955) {
                    if (method261(var9)) {
                        continue;
                    }
                } else if (var9.field2963 == 0 && Statics.field2916 != var9 && method261(var9)) {
                    continue;
                }
                int var10 = var9.field2974 + arg6;
                int var11 = var9.field3024 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2963 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2963 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3080 + var10;
                    int var19 = var9.field2977 + var11;
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
                    int var22 = var9.field3080 + var10;
                    int var23 = var9.field2977 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field842 == var9) {
                    field732 = true;
                    field805 = var10;
                    field806 = var11;
                }
                boolean var24 = false;
                if (var9.field3035) {
                    switch(field785) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2960 >>> 16 == field695) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field695 == var9.field2960) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2955 || var12 < var14 && var13 < var15) {
                    if (var9.field2955) {
                        if (var9.field3106) {
                            if (class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15) {
                                for (class96 var25 = (class96) field826.method4721(); var25 != null; var25 = (class96) field826.method4723()) {
                                    if (var25.field1161) {
                                        var25.method5407();
                                        var25.field1151.field2950 = false;
                                    }
                                }
                                if (Statics.field1440 == 0) {
                                    field842 = null;
                                    field622 = null;
                                }
                                if (!field759) {
                                    method1838();
                                }
                            }
                        } else if (var9.field3107 && class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15) {
                            for (class96 var26 = (class96) field826.method4721(); var26 != null; var26 = (class96) field826.method4723()) {
                                if (var26.field1161 && var26.field1151.field3069 == var26.field1159) {
                                    var26.method5407();
                                }
                            }
                        }
                    }
                    int var27 = class48.field368;
                    int var28 = class48.field362;
                    if (class48.field356 != 0) {
                        var27 = class48.field361;
                        var28 = class48.field352;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2965 == 1337) {
                        if (!field884 && !field759 && var29) {
                            method6172(var27, var28, var12, var13);
                        }
                    } else if (var9.field2965 == 1338) {
                        method3351(var9, var10, var11);
                    } else {
                        if (var9.field2965 == 1400) {
                            Statics.field989.method5449(class48.field368, class48.field362, var29, var10, var11, var9.field3080, var9.field2977);
                        }
                        if (!field759 && var29) {
                            if (var9.field2965 == 1400) {
                                Statics.field989.method5500(var10, var11, var9.field3080, var9.field2977, var27, var28);
                            } else {
                                Statics.method4423(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3036.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3036[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3036[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3105 != null) {
                                            var34 = class39.field259[var9.field3036[var30][var33]];
                                        }
                                        if (method189(var9.field3036[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3105 != null && var9.field3105[var30] > field631) {
                                                break;
                                            }
                                            byte var35 = var9.field3037[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class39.field259[86] && !class39.field259[82] && !class39.field259[81]) && ((var35 & 0x2) == 0 || class39.field259[86]) && ((var35 & 0x1) == 0 || class39.field259[82]) && ((var35 & 0x4) == 0 || class39.field259[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        Statics.method582(var30 + 1, var9.field2960, var9.field3100, var9.field3092, "");
                                    } else if (var30 == 10) {
                                        method184();
                                        method2832(var9.field2960, var9.field3100, class249.method3947(method188(var9)), var9.field3092);
                                        field781 = method1899(var9);
                                        if (field781 == null) {
                                            field781 = class269.field3238;
                                        }
                                        field782 = var9.field3041 + class106.method1825(16777215);
                                    }
                                    int var36 = var9.field3038[var30];
                                    if (var9.field3105 == null) {
                                        var9.field3105 = new int[var9.field3036.length];
                                    }
                                    if (var9.field3039 == null) {
                                        var9.field3039 = new int[var9.field3036.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3105[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3105[var30] == 0) {
                                        var9.field3105[var30] = field631 + var36 + var9.field3039[var30];
                                    } else {
                                        var9.field3105[var30] = field631 + var36;
                                    }
                                }
                                if (!var31 && var9.field3105 != null) {
                                    var9.field3105[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2955) {
                            boolean var37;
                            if (class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class48.field360 == 1 || !Statics.field1450 && class48.field360 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class48.field356 == 1 || !Statics.field1450 && class48.field356 == 4) && class48.field361 >= var12 && class48.field352 >= var13 && class48.field361 < var14 && class48.field352 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method3404(var9, class48.field361 - var10, class48.field352 - var11);
                            }
                            if (var9.field2965 == 1400) {
                                Statics.field989.method5450(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field842 != null && field842 != var9 && var37 && class249.method56(method188(var9))) {
                                field800 = var9;
                            }
                            if (field622 == var9) {
                                field822 = true;
                                field802 = var10;
                                field803 = var11;
                            }
                            if (var9.field3048) {
                                if (var37 && field825 != 0 && var9.field3069 != null) {
                                    class96 var40 = new class96();
                                    var40.field1161 = true;
                                    var40.field1151 = var9;
                                    var40.field1160 = field825;
                                    var40.field1159 = var9.field3069;
                                    field826.method4716(var40);
                                }
                                if (field842 != null || Statics.field1679 != null || field759) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3098 && var39) {
                                    var9.field3098 = true;
                                    if (var9.field3050 != null) {
                                        class96 var41 = new class96();
                                        var41.field1161 = true;
                                        var41.field1151 = var9;
                                        var41.field1152 = class48.field361 - var10;
                                        var41.field1160 = class48.field352 - var11;
                                        var41.field1159 = var9.field3050;
                                        field826.method4716(var41);
                                    }
                                }
                                if (var9.field3098 && var38 && var9.field3081 != null) {
                                    class96 var42 = new class96();
                                    var42.field1161 = true;
                                    var42.field1151 = var9;
                                    var42.field1152 = class48.field368 - var10;
                                    var42.field1160 = class48.field362 - var11;
                                    var42.field1159 = var9.field3081;
                                    field826.method4716(var42);
                                }
                                if (var9.field3098 && !var38) {
                                    var9.field3098 = false;
                                    if (var9.field3052 != null) {
                                        class96 var43 = new class96();
                                        var43.field1161 = true;
                                        var43.field1151 = var9;
                                        var43.field1152 = class48.field368 - var10;
                                        var43.field1160 = class48.field362 - var11;
                                        var43.field1159 = var9.field3052;
                                        field861.method4716(var43);
                                    }
                                }
                                if (var38 && var9.field3002 != null) {
                                    class96 var44 = new class96();
                                    var44.field1161 = true;
                                    var44.field1151 = var9;
                                    var44.field1152 = class48.field368 - var10;
                                    var44.field1160 = class48.field362 - var11;
                                    var44.field1159 = var9.field3002;
                                    field826.method4716(var44);
                                }
                                if (!var9.field2950 && var37) {
                                    var9.field2950 = true;
                                    if (var9.field3064 != null) {
                                        class96 var45 = new class96();
                                        var45.field1161 = true;
                                        var45.field1151 = var9;
                                        var45.field1152 = class48.field368 - var10;
                                        var45.field1160 = class48.field362 - var11;
                                        var45.field1159 = var9.field3064;
                                        field826.method4716(var45);
                                    }
                                }
                                if (var9.field2950 && var37 && var9.field3055 != null) {
                                    class96 var46 = new class96();
                                    var46.field1161 = true;
                                    var46.field1151 = var9;
                                    var46.field1152 = class48.field368 - var10;
                                    var46.field1160 = class48.field362 - var11;
                                    var46.field1159 = var9.field3055;
                                    field826.method4716(var46);
                                }
                                if (var9.field2950 && !var37) {
                                    var9.field2950 = false;
                                    if (var9.field3056 != null) {
                                        class96 var47 = new class96();
                                        var47.field1161 = true;
                                        var47.field1151 = var9;
                                        var47.field1152 = class48.field368 - var10;
                                        var47.field1160 = class48.field362 - var11;
                                        var47.field1159 = var9.field3056;
                                        field861.method4716(var47);
                                    }
                                }
                                if (var9.field2989 != null) {
                                    class96 var48 = new class96();
                                    var48.field1151 = var9;
                                    var48.field1159 = var9.field2989;
                                    field813.method4716(var48);
                                }
                                if (var9.field3061 != null && field810 > var9.field3090) {
                                    if (var9.field3062 == null || field810 - var9.field3090 > 32) {
                                        class96 var53 = new class96();
                                        var53.field1151 = var9;
                                        var53.field1159 = var9.field3061;
                                        field826.method4716(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3090; var49 < field810; var49++) {
                                            int var50 = field809[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3062.length; var51++) {
                                                if (var9.field3062[var51] == var50) {
                                                    class96 var52 = new class96();
                                                    var52.field1151 = var9;
                                                    var52.field1159 = var9.field3061;
                                                    field826.method4716(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3090 = field810;
                                }
                                if (var9.field2983 != null && field712 > var9.field3101) {
                                    if (var9.field3021 == null || field712 - var9.field3101 > 32) {
                                        class96 var58 = new class96();
                                        var58.field1151 = var9;
                                        var58.field1159 = var9.field2983;
                                        field826.method4716(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3101; var54 < field712; var54++) {
                                            int var55 = field811[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3021.length; var56++) {
                                                if (var9.field3021[var56] == var55) {
                                                    class96 var57 = new class96();
                                                    var57.field1151 = var9;
                                                    var57.field1159 = var9.field2983;
                                                    field826.method4716(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3101 = field712;
                                }
                                if (var9.field3065 != null && field814 > var9.field2972) {
                                    if (var9.field3066 == null || field814 - var9.field2972 > 32) {
                                        class96 var63 = new class96();
                                        var63.field1151 = var9;
                                        var63.field1159 = var9.field3065;
                                        field826.method4716(var63);
                                    } else {
                                        label586: for (int var59 = var9.field2972; var59 < field814; var59++) {
                                            int var60 = field642[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3066.length; var61++) {
                                                if (var9.field3066[var61] == var60) {
                                                    class96 var62 = new class96();
                                                    var62.field1151 = var9;
                                                    var62.field1159 = var9.field3065;
                                                    field826.method4716(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2972 = field814;
                                }
                                if (field817 > var9.field3099 && var9.field3070 != null) {
                                    class96 var64 = new class96();
                                    var64.field1151 = var9;
                                    var64.field1159 = var9.field3070;
                                    field826.method4716(var64);
                                }
                                if (field818 > var9.field3099 && var9.field3074 != null) {
                                    class96 var65 = new class96();
                                    var65.field1151 = var9;
                                    var65.field1159 = var9.field3074;
                                    field826.method4716(var65);
                                }
                                if (field883 > var9.field3099 && var9.field3075 != null) {
                                    class96 var66 = new class96();
                                    var66.field1151 = var9;
                                    var66.field1159 = var9.field3075;
                                    field826.method4716(var66);
                                }
                                if (field820 > var9.field3099 && var9.field3076 != null) {
                                    class96 var67 = new class96();
                                    var67.field1151 = var9;
                                    var67.field1159 = var9.field3076;
                                    field826.method4716(var67);
                                }
                                if (field821 > var9.field3099 && var9.field3077 != null) {
                                    class96 var68 = new class96();
                                    var68.field1151 = var9;
                                    var68.field1159 = var9.field3077;
                                    field826.method4716(var68);
                                }
                                if (field828 > var9.field3099 && var9.field3082 != null) {
                                    class96 var69 = new class96();
                                    var69.field1151 = var9;
                                    var69.field1159 = var9.field3082;
                                    field826.method4716(var69);
                                }
                                if (field823 > var9.field3099 && var9.field3083 != null) {
                                    class96 var70 = new class96();
                                    var70.field1151 = var9;
                                    var70.field1159 = var9.field3083;
                                    field826.method4716(var70);
                                }
                                if (field824 > var9.field3099 && var9.field3016 != null) {
                                    class96 var71 = new class96();
                                    var71.field1151 = var9;
                                    var71.field1159 = var9.field3016;
                                    field826.method4716(var71);
                                }
                                var9.field3099 = field808;
                                if (var9.field3071 != null) {
                                    for (int var72 = 0; var72 < field848; var72++) {
                                        class96 var73 = new class96();
                                        var73.field1151 = var9;
                                        var73.field1158 = field787[var72];
                                        var73.field1154 = field849[var72];
                                        var73.field1159 = var9.field3071;
                                        field826.method4716(var73);
                                    }
                                }
                                if (var9.field3072 != null) {
                                    int[] var74 = class39.method3272();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class96 var76 = new class96();
                                        var76.field1151 = var9;
                                        var76.field1158 = var74[var75];
                                        var76.field1159 = var9.field3072;
                                        field826.method4716(var76);
                                    }
                                }
                                if (var9.field3001 != null) {
                                    int[] var77 = class39.method1893();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class96 var79 = new class96();
                                        var79.field1151 = var9;
                                        var79.field1158 = var77[var78];
                                        var79.field1159 = var9.field3001;
                                        field826.method4716(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2955) {
                            if (field842 != null || Statics.field1679 != null || field759) {
                                continue;
                            }
                            if ((var9.field3087 >= 0 || var9.field3085 != 0) && class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15) {
                                if (var9.field3087 >= 0) {
                                    Statics.field2916 = arg0[var9.field3087];
                                } else {
                                    Statics.field2916 = var9;
                                }
                            }
                            if (var9.field2963 == 8 && class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15) {
                                Statics.field43 = var9;
                            }
                            if (var9.field2985 > var9.field2977) {
                                method170(var9, var9.field3080 + var10, var11, var9.field2977, var9.field2985, class48.field368, class48.field362);
                            }
                        }
                        if (var9.field2963 == 0) {
                            method1773(arg0, var9.field2960, var12, var13, var14, var15, var10 - var9.field3067, var11 - var9.field2966);
                            if (var9.field3096 != null) {
                                method1773(var9.field3096, var9.field2960, var12, var13, var14, var15, var10 - var9.field3067, var11 - var9.field2966);
                            }
                            class95 var80 = (class95) field796.method5691((long) var9.field2960);
                            if (var80 != null) {
                                if (var80.field1148 == 0 && class48.field368 >= var12 && class48.field362 >= var13 && class48.field368 < var14 && class48.field362 < var15 && !field759) {
                                    for (class96 var81 = (class96) field826.method4721(); var81 != null; var81 = (class96) field826.method4723()) {
                                        if (var81.field1161) {
                                            var81.method5407();
                                            var81.field1151.field2950 = false;
                                        }
                                    }
                                    if (Statics.field1440 == 0) {
                                        field842 = null;
                                        field622 = null;
                                    }
                                    if (!field759) {
                                        method1838();
                                    }
                                }
                                method2217(var80.field1147, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.jy(II)Z")
    public static boolean method189(int arg0) {
        for (int var1 = 0; var1 < field848; var1++) {
            if (field787[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("h.jv(III)V")
    public static final void method61(int arg0, int arg1) {
        if (class248.method182(arg0)) {
            method2345(Statics.field613[arg0], arg1);
        }
    }

    @ObfuscatedName("dn.jz([Liv;II)V")
    public static final void method2345(class248[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class248 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2963 == 0) {
                    if (var3.field3096 != null) {
                        method2345(var3.field3096, arg1);
                    }
                    class95 var4 = (class95) field796.method5691((long) var3.field2960);
                    if (var4 != null) {
                        method61(var4.field1147, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3079 != null) {
                    class96 var5 = new class96();
                    var5.field1151 = var3;
                    var5.field1159 = var3.field3079;
                    Statics.method3331(var5);
                }
                if (arg1 == 1 && var3.field2956 != null) {
                    if (var3.field3100 >= 0) {
                        class248 var6 = class248.method3261(var3.field2960);
                        if (var6 == null || var6.field3096 == null || var3.field3100 >= var6.field3096.length || var6.field3096[var3.field3100] != var3) {
                            continue;
                        }
                    }
                    class96 var7 = new class96();
                    var7.field1151 = var3;
                    var7.field1159 = var3.field2956;
                    Statics.method3331(var7);
                }
            }
        }
    }

    @ObfuscatedName("gw.jt(Liv;III)V")
    public static final void method3404(class248 arg0, int arg1, int arg2) {
        if (field842 != null || field759 || arg0 == null) {
            return;
        }
        class248 var3 = method4320(arg0);
        if (var3 == null) {
            var3 = arg0.field2998;
        }
        if (var3 == null) {
            return;
        }
        field842 = arg0;
        class248 var5 = method4320(arg0);
        if (var5 == null) {
            var5 = arg0.field2998;
        }
        field622 = var5;
        field798 = arg1;
        field750 = arg2;
        Statics.field1440 = 0;
        field746 = false;
        int var7 = method2017();
        if (var7 != -1) {
            method2988(var7);
        }
        return;
    }

    @ObfuscatedName("client.ju(I)V")
    public final void method1063() {
        method1837(field842);
        Statics.field1440++;
        if (field732 && field822) {
            int var1 = class48.field368;
            int var2 = class48.field362;
            int var3 = var1 - field798;
            int var4 = var2 - field750;
            if (var3 < field802) {
                var3 = field802;
            }
            if (field842.field3080 + var3 > field802 + field622.field3080) {
                var3 = field802 + field622.field3080 - field842.field3080;
            }
            if (var4 < field803) {
                var4 = field803;
            }
            if (field842.field2977 + var4 > field803 + field622.field2977) {
                var4 = field803 + field622.field2977 - field842.field2977;
            }
            int var5 = var3 - field805;
            int var6 = var4 - field806;
            int var7 = field842.field3044;
            if (Statics.field1440 > field842.field2973 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field746 = true;
            }
            int var8 = field622.field3067 + (var3 - field802);
            int var9 = field622.field2966 + (var4 - field803);
            if (field842.field3057 != null && field746) {
                class96 var10 = new class96();
                var10.field1151 = field842;
                var10.field1152 = var8;
                var10.field1160 = var9;
                var10.field1159 = field842.field3057;
                Statics.method3331(var10);
            }
            if (class48.field360 == 0) {
                if (field746) {
                    if (field842.field3073 != null) {
                        class96 var11 = new class96();
                        var11.field1151 = field842;
                        var11.field1152 = var8;
                        var11.field1160 = var9;
                        var11.field1157 = field800;
                        var11.field1159 = field842.field3073;
                        Statics.method3331(var11);
                    }
                    if (field800 != null && method4320(field842) != null) {
                        class228 var12 = class228.method1927(class226.field2622, field669.field1410);
                        var12.field2700.method5943(field800.field2960);
                        var12.field2700.method5932(field800.field3100);
                        var12.field2700.method5989(field800.field3092);
                        var12.field2700.method5942(field842.field2960);
                        var12.field2700.method5933(field842.field3092);
                        var12.field2700.method5989(field842.field3100);
                        field669.method2200(var12);
                    }
                } else if (this.method1059()) {
                    this.method1060(field805 + field798, field806 + field750);
                } else if (field900 > 0) {
                    int var13 = field805 + field798;
                    int var14 = field806 + field750;
                    method2342(Statics.field223, var13, var14);
                    Statics.field223 = null;
                }
                field842 = null;
            }
        } else if (Statics.field1440 > 1) {
            field842 = null;
        }
    }

    @ObfuscatedName("fe.jx(II)V")
    public static void method2988(int arg0) {
        Statics.field223 = new class82();
        Statics.field223.field994 = field649[arg0];
        Statics.field223.field991 = field762[arg0];
        Statics.field223.field992 = field629[arg0];
        Statics.field223.field993 = field857[arg0];
        Statics.field223.field990 = field765[arg0];
    }

    @ObfuscatedName("cf.ku(Liv;I)V")
    public static void method1837(class248 arg0) {
        if (field831 == arg0.field3104) {
            field832[arg0.field3103] = true;
        }
    }

    @ObfuscatedName("ff.kc(I)V")
    public static void method3324() {
        for (class95 var0 = (class95) field796.method5693(); var0 != null; var0 = (class95) field796.method5694()) {
            int var1 = var0.field1147;
            if (class248.method182(var1)) {
                boolean var2 = true;
                class248[] var3 = Statics.field613[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2955;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3937;
                    class248 var6 = class248.method3261(var5);
                    if (var6 != null) {
                        method1837(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gj.km(II)V")
    public static final void method3834(int arg0) {
        if (!class248.method182(arg0)) {
            return;
        }
        class248[] var1 = Statics.field613[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class248 var3 = var1[var2];
            if (var3 != null) {
                var3.field3043 = 0;
                var3.field3095 = 0;
            }
        }
    }

    @ObfuscatedName("a.kx(II)V")
    public static final void method194(int arg0) {
        if (class248.method182(arg0)) {
            method4321(Statics.field613[arg0], -1);
        }
    }

    @ObfuscatedName("in.kn([Liv;IB)V")
    public static final void method4321(class248[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class248 var3 = arg0[var2];
            if (var3 != null && var3.field2980 == arg1 && (!var3.field2955 || !method261(var3))) {
                if (var3.field2963 == 0) {
                    if (!var3.field2955 && method261(var3) && Statics.field2916 != var3) {
                        continue;
                    }
                    method4321(arg0, var3.field2960);
                    if (var3.field3096 != null) {
                        method4321(var3.field3096, var3.field2960);
                    }
                    class95 var4 = (class95) field796.method5691((long) var3.field2960);
                    if (var4 != null) {
                        method194(var4.field1147);
                    }
                }
                if (var3.field2963 == 6) {
                    if (var3.field3008 != -1 || var3.field3009 != -1) {
                        boolean var5 = method5155(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3009;
                        } else {
                            var6 = var3.field3008;
                        }
                        if (var6 != -1) {
                            class158 var7 = class158.method3363(var6);
                            var3.field3095 += field684;
                            while (var3.field3095 > var7.field1884[var3.field3043]) {
                                var3.field3095 -= var7.field1884[var3.field3043];
                                var3.field3043++;
                                if (var3.field3043 >= var7.field1882.length) {
                                    var3.field3043 -= var7.field1888;
                                    if (var3.field3043 < 0 || var3.field3043 >= var7.field1882.length) {
                                        var3.field3043 = 0;
                                    }
                                }
                                method1837(var3);
                            }
                        }
                    }
                    if (var3.field2982 != 0 && !var3.field2955) {
                        int var8 = var3.field2982 >> 16;
                        int var9 = var3.field2982 << 16 >> 16;
                        int var10 = field684 * var8;
                        int var11 = field684 * var9;
                        var3.field3091 = var3.field3091 + var10 & 0x7FF;
                        var3.field3003 = var3.field3003 + var11 & 0x7FF;
                        method1837(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.kg(D)V")
    public static final void method2290(double arg0) {
        class197.method3531(arg0);
        ((class204) Statics.field2284).method3802(arg0);
        class156.field1816.method3989();
        Statics.field40.field1313 = arg0;
        class103.method2003();
    }

    @ObfuscatedName("f.ka(II)V")
    public static final void method1(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field40.field1320 == var1) {
            return;
        }
        if (Statics.field40.field1320 == 0 && field862 != -1) {
            class234.method2086(Statics.field1081, field862, 0, var1, false);
            field863 = false;
        } else if (var1 == 0) {
            class234.method940();
            field863 = false;
        } else if (class234.field2838 == 0) {
            Statics.field2834.method4064(var1);
        } else {
            Statics.field2832 = var1;
        }
        Statics.field40.field1320 = var1;
        class103.method2003();
    }

    @ObfuscatedName("hj.ke(II)V")
    public static final void method4002(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field40.field1312 = var1;
        class103.method2003();
    }

    @ObfuscatedName("ev.kq(IB)V")
    public static final void method2574(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field40.field1322 = var1;
        class103.method2003();
    }

    @ObfuscatedName("m.kk(IB)V")
    public static final void method58(int arg0) {
        method3324();
        class78.method332();
        int var1 = class139.method14(arg0).field1555;
        if (var1 == 0) {
            return;
        }
        int var2 = class243.field2924[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method2290(0.9D);
            }
            if (var2 == 2) {
                method2290(0.8D);
            }
            if (var2 == 3) {
                method2290(0.7D);
            }
            if (var2 == 4) {
                method2290(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method1(255);
            }
            if (var2 == 1) {
                method1(192);
            }
            if (var2 == 2) {
                method1(128);
            }
            if (var2 == 3) {
                method1(64);
            }
            if (var2 == 4) {
                method1(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method4002(127);
            }
            if (var2 == 1) {
                method4002(96);
            }
            if (var2 == 2) {
                method4002(64);
            }
            if (var2 == 3) {
                method4002(32);
            }
            if (var2 == 4) {
                method4002(0);
            }
        }
        if (var1 == 5) {
            field758 = var2;
        }
        if (var1 == 6) {
            field791 = var2;
        }
        if (var1 == 9) {
            field892 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method2574(127);
            }
            if (var2 == 1) {
                method2574(96);
            }
            if (var2 == 2) {
                method2574(64);
            }
            if (var2 == 3) {
                method2574(32);
            }
            if (var2 == 4) {
                method2574(0);
            }
        }
        if (var1 == 17) {
            field793 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class108[] var3 = new class108[] { class108.field1345, class108.field1344, class108.field1348, class108.field1346 };
            field647 = (class108) class290.method2391(var3, var2);
            if (field647 == null) {
                field647 = class108.field1348;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field836 = -1;
            } else {
                field836 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class108[] var4 = new class108[] { class108.field1345, class108.field1344, class108.field1348, class108.field1346 };
        field641 = (class108) class290.method2391(var4, var2);
        if (field641 == null) {
            field641 = class108.field1348;
        }
    }

    @ObfuscatedName("kf.kz(Liv;I)V")
    public static final void method5075(class248 arg0) {
        int var1 = arg0.field2965;
        if (var1 == 324) {
            if (field891 == -1) {
                field891 = arg0.field2996;
                field903 = arg0.field3054;
            }
            if (field890.field2936) {
                arg0.field2996 = field891;
            } else {
                arg0.field2996 = field903;
            }
        } else if (var1 == 325) {
            if (field891 == -1) {
                field891 = arg0.field2996;
                field903 = arg0.field3054;
            }
            if (field890.field2936) {
                arg0.field2996 = field903;
            } else {
                arg0.field2996 = field891;
            }
        } else if (var1 == 327) {
            arg0.field3091 = 150;
            arg0.field3003 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3004 = 5;
            arg0.field3005 = 0;
        } else if (var1 == 328) {
            arg0.field3091 = 150;
            arg0.field3003 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3004 = 5;
            arg0.field3005 = 1;
        }
    }

    @ObfuscatedName("p.kd(I)V")
    public static final void method183() {
        class228 var0 = class228.method1927(class226.field2594, field669.field1410);
        field669.method2200(var0);
        for (class95 var1 = (class95) field796.method5693(); var1 != null; var1 = (class95) field796.method5694()) {
            if (var1.field1148 == 0 || var1.field1148 == 3) {
                method2402(var1, true);
            }
        }
        if (field789 != null) {
            method1837(field789);
            field789 = null;
        }
    }

    @ObfuscatedName("bh.kl(IIIB)Lci;")
    public static final class95 method1610(int arg0, int arg1, int arg2) {
        class95 var3 = new class95();
        var3.field1147 = arg1;
        var3.field1148 = arg2;
        field796.method5692(var3, (long) arg0);
        method3834(arg1);
        class248 var4 = class248.method3261(arg0);
        method1837(var4);
        if (field789 != null) {
            method1837(field789);
            field789 = null;
        }
        method3398();
        method2960(Statics.field613[arg0 >> 16], var4, false);
        class79.method1006(arg1);
        if (field783 != -1) {
            method61(field783, 1);
        }
        return var3;
    }

    @ObfuscatedName("ex.ks(Lci;ZB)V")
    public static final void method2402(class95 arg0, boolean arg1) {
        int var2 = arg0.field1147;
        int var3 = (int) arg0.field3937;
        arg0.method5407();
        if (arg1) {
            class248.method377(var2);
        }
        method70(var2);
        class248 var4 = class248.method3261(var3);
        if (var4 != null) {
            method1837(var4);
        }
        method3398();
        if (field783 != -1) {
            method61(field783, 1);
        }
    }

    @ObfuscatedName("mq.kj(Liv;I)Z")
    public static final boolean method5399(class248 arg0) {
        int var1 = arg0.field2965;
        if (var1 == 205) {
            field670 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field890.method4286(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field890.method4289(var4, var5 == 1);
        }
        if (var1 == 324) {
            field890.method4285(false);
        }
        if (var1 == 325) {
            field890.method4285(true);
        }
        if (var1 == 326) {
            class228 var6 = class228.method1927(class226.field2649, field669.field1410);
            field890.method4291(var6.field2700);
            field669.method2200(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("od.ko(Liv;IIII)V")
    public static final void method6442(class248 arg0, int arg1, int arg2, int arg3) {
        class242 var4 = arg0.method4332(false);
        if (var4 == null) {
            return;
        }
        if (field773 < 3) {
            Statics.field3827.method6303(arg1, arg2, var4.field2920, var4.field2919, 25, 25, field693, 256, var4.field2918, var4.field2917);
        } else {
            class393.method6176(arg1, arg2, 0, var4.field2918, var4.field2917);
        }
    }

    @ObfuscatedName("bi.kw(IIIILoa;Liq;B)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, class397 arg4, class242 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method222(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field693 & 0x7FF;
        int var8 = class197.field2271[var7];
        int var9 = class197.field2285[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2920 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field186.method6304(arg5.field2920 / 2 + arg0 - var17 / 2 + var15, arg5.field2919 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ap.kt(IIIILoa;Liq;B)V")
    public static final void method222(int arg0, int arg1, int arg2, int arg3, class397 arg4, class242 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field693 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class197.field2271[var6];
        int var9 = class197.field2285[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6302(arg5.field2920 / 2 + var10 - arg4.field4259 / 2, arg5.field2919 / 2 - var11 - arg4.field4260 / 2, arg0, arg1, arg5.field2920, arg5.field2919, arg5.field2918, arg5.field2917);
        } else {
            arg4.method6352(arg5.field2920 / 2 + arg0 + var10 - arg4.field4259 / 2, arg5.field2919 / 2 + arg1 - var11 - arg4.field4260 / 2);
        }
    }

    @ObfuscatedName("bk.kp(I)V")
    public static final void method1543() {
        class112.method4050();
        if (Statics.field3675 != null) {
            Statics.field3675.method5123();
        }
    }

    @ObfuscatedName("gt.kb(S)V")
    public static final void method3353() {
        for (int var0 = 0; var0 < class110.field1359; var0++) {
            class98 var1 = field739[class110.field1365[var0]];
            var1.method1949();
        }
    }

    @ObfuscatedName("fl.kh(I)V")
    public static final void method2931() {
        for (int var0 = 0; var0 < class110.field1359; var0++) {
            class98 var1 = field739[class110.field1365[var0]];
            var1.method1952();
        }
    }

    @ObfuscatedName("iw.ky(I)V")
    public static final void method4270() {
        field818 = field808;
    }

    @ObfuscatedName("ia.kf(I)V")
    public static final void method4385() {
        field883 = field808;
        Statics.field206 = true;
    }

    @ObfuscatedName("cv.ki(I)V")
    public static final void method1826() {
        field820 = field808;
        Statics.field2017 = true;
    }

    @ObfuscatedName("e.kv(Ljava/lang/String;B)V")
    public static final void method13(String arg0) {
        if (Statics.field3675 != null) {
            class228 var1 = class228.method1927(class226.field2607, field669.field1410);
            var1.field2700.method5880(class384.method376(arg0));
            var1.field2700.method6068(arg0);
            field669.method2200(var1);
        }
    }

    @ObfuscatedName("iw.lg(Ljava/lang/String;I)V")
    public static final void method4268(String arg0) {
        if (!arg0.equals("")) {
            class228 var1 = class228.method1927(class226.field2668, field669.field1410);
            var1.field2700.method5880(class384.method376(arg0));
            var1.field2700.method6068(arg0);
            field669.method2200(var1);
        }
    }

    @ObfuscatedName("fi.ln(I)V")
    public static final void method3275() {
        class228 var0 = class228.method1927(class226.field2668, field669.field1410);
        var0.field2700.method5880(0);
        field669.method2200(var0);
    }

    @ObfuscatedName("at.le(III)V")
    public static final void method219(int arg0, int arg1) {
        class4 var2 = arg0 >= 0 ? field745[arg0] : Statics.field1347;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method41()) {
            return;
        }
        class10 var3 = (class10) var2.field24.get(arg1);
        if (var3.field71 != -1) {
            return;
        }
        String var4 = var3.field67;
        class113 var5 = field669;
        class228 var6 = class228.method1927(class226.field2584, var5.field1410);
        var6.field2700.method5880(3 + class384.method376(var4));
        var6.field2700.method5880(arg0);
        var6.field2700.method5881(arg1);
        var6.field2700.method6068(var4);
        var5.method2200(var6);
    }

    @ObfuscatedName("jy.lz(IIZB)V")
    public static final void method4629(int arg0, int arg1, boolean arg2) {
        if (field745[arg0] == null || arg1 < 0 || arg1 >= field745[arg0].method41()) {
            return;
        }
        class10 var3 = (class10) field745[arg0].field24.get(arg1);
        class113 var4 = field669;
        class228 var5 = class228.method1927(class226.field2676, var4.field1410);
        var5.field2700.method5880(4 + class384.method376(var3.field67));
        var5.field2700.method5880(arg0);
        var5.field2700.method5881(arg1);
        var5.field2700.method5886(arg2);
        var5.field2700.method6068(var3.field67);
        var4.method2200(var5);
    }

    @ObfuscatedName("z.lo(II)V")
    public static void method70(int arg0) {
        for (class352 var1 = (class352) field867.method5693(); var1 != null; var1 = (class352) field867.method5694()) {
            if ((var1.field3937 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method5407();
            }
        }
    }

    @ObfuscatedName("n.lj(Liv;I)I")
    public static int method188(class248 arg0) {
        class352 var1 = (class352) field867.method5691(((long) arg0.field2960 << 32) + (long) arg0.field3100);
        return var1 == null ? arg0.field3034 : var1.field3934;
    }

    @ObfuscatedName("ih.lp(Liv;B)Liv;")
    public static class248 method4320(class248 arg0) {
        int var1 = class249.method64(method188(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class248.method3261(arg0.field2980);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("aq.lh(Liv;I)Z")
    public static boolean method261(class248 arg0) {
        return arg0.field2981;
    }

    @ObfuscatedName("cd.lt(Liv;S)Ljava/lang/String;")
    public static String method1899(class248 arg0) {
        if (class249.method3947(method188(arg0)) == 0) {
            return null;
        } else if (arg0.field3047 == null || arg0.field3047.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3047;
        }
    }

    @ObfuscatedName("s.lf(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method179(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field816 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field816 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field816 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field816 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field816 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1398 != null) {
            var3 = "/p=" + Statics.field1398;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3594 + "/a=" + Statics.field1000 + var3 + "/";
    }

    @ObfuscatedName("da.lr(Ljava/lang/String;I)V")
    public static void method2332(String arg0) {
        Statics.field1398 = arg0;
        try {
            String var1 = Statics.field11.getParameter(Integer.toString(18));
            String var2 = Statics.field11.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class381.method4000() + 94608000000L;
                class253.field3127.setTime(new Date(var6));
                int var8 = class253.field3127.get(7);
                int var9 = class253.field3127.get(5);
                int var10 = class253.field3127.get(2);
                int var11 = class253.field3127.get(1);
                int var12 = class253.field3127.get(11);
                int var13 = class253.field3127.get(12);
                int var14 = class253.field3127.get(13);
                String var15 = class253.field3123[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class253.field3125[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class43.method362(Statics.field11, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("al.ld(Ljava/lang/String;ZI)V")
    public static void method323(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1813; var5++) {
            class156 var6 = class156.method4403(var5);
            if ((!arg1 || var6.field1860) && var6.field1854 == -1 && var6.field1855.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field607 = -1;
                    Statics.field33 = null;
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
        Statics.field33 = var3;
        Statics.field415 = 0;
        Statics.field607 = var4;
        String[] var9 = new String[Statics.field607];
        for (int var10 = 0; var10 < Statics.field607; var10++) {
            var9[var10] = class156.method4403(var3[var10]).field1855;
        }
        short[] var11 = Statics.field33;
        class379.method4631(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("fh.lq(Lnt;IB)V")
    public static void method3316(class384 arg0, int arg1) {
        byte[] var2 = arg0.field4160;
        if (field663 == null) {
            field663 = new byte[24];
        }
        class308.method5058(var2, arg1, field663, 0, 24);
        if (class130.field1492 == null) {
            return;
        }
        try {
            class130.field1492.method5758(0L);
            class130.field1492.method5751(arg0.field4160, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.ly(I)Llc;")
    public class329 method1331() {
        return Statics.field3197 == null ? null : Statics.field3197.field1175;
    }

    @ObfuscatedName("aq.lc(I)V")
    public static void method258() {
        field669.method2200(class228.method1927(class226.field2600, field669.field1410));
        field698 = 0;
    }

    @ObfuscatedName("lj.lk(B)V")
    public static void method5144() {
        if (field698 == 1) {
            field706 = true;
        }
    }

    @ObfuscatedName("bu.ll(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1003(String arg0) {
        class271[] var1 = class271.method2098();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class271 var3 = var1[var2];
            if (var3.field3547 != -1 && arg0.startsWith(class106.method4226(var3.field3547))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3547).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ep.lx(B)V")
    public static void method2524() {
        if (Statics.field2801 == null) {
            return;
        }
        field799 = field631;
        Statics.field2801.method4672();
        for (int var0 = 0; var0 < field739.length; var0++) {
            if (field739[var0] != null) {
                Statics.field2801.method4671((field739[var0].field1242 >> 7) + Statics.field127, (field739[var0].field1223 >> 7) + Statics.field2092);
            }
        }
    }
}

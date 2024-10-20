package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class54 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field701 = new class173[4];

    @ObfuscatedName("client.ah")
    public static boolean field832 = true;

    @ObfuscatedName("client.bi")
    public static int field645 = 1;

    @ObfuscatedName("client.bo")
    public static int field796 = 0;

    @ObfuscatedName("client.bu")
    public static int field647 = 0;

    @ObfuscatedName("client.bj")
    public static boolean field859 = false;

    @ObfuscatedName("client.bm")
    public static boolean field847 = false;

    @ObfuscatedName("client.ba")
    public static int field650 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field651 = false;

    @ObfuscatedName("client.bg")
    public static int field652 = 0;

    @ObfuscatedName("client.co")
    public static boolean field654 = true;

    @ObfuscatedName("client.cr")
    public static int field655 = 0;

    @ObfuscatedName("client.ck")
    public static long field656 = 1L;

    @ObfuscatedName("client.cy")
    public static int field878 = -1;

    @ObfuscatedName("client.cn")
    public static int field658 = -1;

    @ObfuscatedName("client.cj")
    public static long field659 = -1L;

    @ObfuscatedName("client.cq")
    public static boolean field660 = true;

    @ObfuscatedName("client.ci")
    public static boolean field661 = false;

    @ObfuscatedName("client.cu")
    public static int field662 = 0;

    @ObfuscatedName("client.cs")
    public static int field663 = 0;

    @ObfuscatedName("client.cc")
    public static int field664 = 0;

    @ObfuscatedName("client.cp")
    public static int field696 = 0;

    @ObfuscatedName("client.ce")
    public static int field666 = 0;

    @ObfuscatedName("client.ca")
    public static int field667 = 0;

    @ObfuscatedName("client.cf")
    public static int field736 = 0;

    @ObfuscatedName("client.cx")
    public static int field669 = 0;

    @ObfuscatedName("client.cz")
    public static int field670 = 0;

    @ObfuscatedName("client.cw")
    public static class85 field882 = class85.field1168;

    @ObfuscatedName("client.dw")
    public static class85 field731 = class85.field1168;

    @ObfuscatedName("client.dx")
    public static int field648 = 0;

    @ObfuscatedName("client.dj")
    public static int field674 = 0;

    @ObfuscatedName("client.dp")
    public static int field675 = 0;

    @ObfuscatedName("client.ec")
    public static int field676 = 0;

    @ObfuscatedName("client.em")
    public static int field791 = 0;

    @ObfuscatedName("client.ee")
    public static int field888 = 0;

    @ObfuscatedName("client.eu")
    public static int field679 = 0;

    @ObfuscatedName("client.ea")
    public static int field695 = 0;

    @ObfuscatedName("client.er")
    public static class161 field681 = class161.field2007;

    @ObfuscatedName("client.ex")
    public static boolean field682 = false;

    @ObfuscatedName("client.ep")
    public static class89 field683 = new class89();

    @ObfuscatedName("client.ei")
    public static byte[] field684 = null;

    @ObfuscatedName("client.ed")
    public static class80[] field685 = new class80[32768];

    @ObfuscatedName("client.eq")
    public static int field739 = 0;

    @ObfuscatedName("client.fe")
    public static int[] field764 = new int[32768];

    @ObfuscatedName("client.fl")
    public static int field688 = 0;

    @ObfuscatedName("client.fj")
    public static int[] field689 = new int[250];

    @ObfuscatedName("client.fm")
    public static final class96 field690 = new class96();

    @ObfuscatedName("client.fz")
    public static int field870 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field692 = false;

    @ObfuscatedName("client.fo")
    public static boolean field849 = true;

    @ObfuscatedName("client.fu")
    public static class272 field694 = new class272();

    @ObfuscatedName("client.fh")
    public static HashMap field883 = new HashMap();

    @ObfuscatedName("client.ft")
    public static int field677 = 0;

    @ObfuscatedName("client.fb")
    public static int field795 = 1;

    @ObfuscatedName("client.fw")
    public static int field851 = 0;

    @ObfuscatedName("client.gm")
    public static int field673 = 1;

    @ObfuscatedName("client.gj")
    public static int field700 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field711 = false;

    @ObfuscatedName("client.go")
    public static int[][][] field703 = new int[4][13][13];

    @ObfuscatedName("client.ga")
    public static final int[] field704 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gl")
    public static int field705 = 0;

    @ObfuscatedName("client.hr")
    public static int field706 = 2301979;

    @ObfuscatedName("client.hg")
    public static int field707 = 5063219;

    @ObfuscatedName("client.ha")
    public static int field708 = 3353893;

    @ObfuscatedName("client.hn")
    public static int field709 = 7759444;

    @ObfuscatedName("client.hm")
    public static boolean field909 = false;

    @ObfuscatedName("client.hx")
    public static int field872 = 0;

    @ObfuscatedName("client.hk")
    public static int field712 = 128;

    @ObfuscatedName("client.ht")
    public static int field713 = 0;

    @ObfuscatedName("client.hw")
    public static int field714 = 0;

    @ObfuscatedName("client.hy")
    public static int field715 = 0;

    @ObfuscatedName("client.hu")
    public static int field716 = 0;

    @ObfuscatedName("client.hq")
    public static int field717 = 0;

    @ObfuscatedName("client.hp")
    public static int field918 = 0;

    @ObfuscatedName("client.hb")
    public static int field758 = 50;

    @ObfuscatedName("client.hi")
    public static int field698 = 0;

    @ObfuscatedName("client.hf")
    public static int field721 = 0;

    @ObfuscatedName("client.ic")
    public static int field819 = 0;

    @ObfuscatedName("client.im")
    public static int field723 = 12;

    @ObfuscatedName("client.if")
    public static int field724 = 6;

    @ObfuscatedName("client.ik")
    public static int field749 = 0;

    @ObfuscatedName("client.it")
    public static String field687 = null;

    @ObfuscatedName("client.ib")
    public static boolean field827 = false;

    @ObfuscatedName("client.is")
    public static int field777 = 0;

    @ObfuscatedName("client.ia")
    public static boolean field728 = false;

    @ObfuscatedName("client.ir")
    public static int field729 = 0;

    @ObfuscatedName("client.ig")
    public static int field789 = 0;

    @ObfuscatedName("client.ie")
    public static int field730 = 50;

    @ObfuscatedName("client.iv")
    public static int[] field732 = new int[field730];

    @ObfuscatedName("client.iq")
    public static int[] field733 = new int[field730];

    @ObfuscatedName("client.io")
    public static int[] field734 = new int[field730];

    @ObfuscatedName("client.id")
    public static int[] field678 = new int[field730];

    @ObfuscatedName("client.in")
    public static int[] field839 = new int[field730];

    @ObfuscatedName("client.il")
    public static int[] field889 = new int[field730];

    @ObfuscatedName("client.iu")
    public static int[] field738 = new int[field730];

    @ObfuscatedName("client.ip")
    public static String[] field686 = new String[field730];

    @ObfuscatedName("client.ih")
    public static int[][] field740 = new int[104][104];

    @ObfuscatedName("client.ii")
    public static int field741 = 0;

    @ObfuscatedName("client.iy")
    public static int field742 = -1;

    @ObfuscatedName("client.iw")
    public static int field727 = -1;

    @ObfuscatedName("client.jm")
    public static int field744 = 0;

    @ObfuscatedName("client.jd")
    public static int field649 = 0;

    @ObfuscatedName("client.jj")
    public static int field746 = 0;

    @ObfuscatedName("client.jw")
    public static int field719 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field748 = true;

    @ObfuscatedName("client.jy")
    public static int field665 = 0;

    @ObfuscatedName("client.jc")
    public static int field750 = 0;

    @ObfuscatedName("client.jo")
    public static int field751 = 0;

    @ObfuscatedName("client.jl")
    public static int field752 = 0;

    @ObfuscatedName("client.js")
    public static int field753 = 0;

    @ObfuscatedName("client.jr")
    public static int field754 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field755 = false;

    @ObfuscatedName("client.ju")
    public static int field912 = 0;

    @ObfuscatedName("client.je")
    public static int field757 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field720 = true;

    @ObfuscatedName("client.ja")
    public static class67[] field759 = new class67[2048];

    @ObfuscatedName("client.jb")
    public static int field760 = -1;

    @ObfuscatedName("client.jn")
    public static int field790 = 0;

    @ObfuscatedName("client.jf")
    public static boolean field762 = true;

    @ObfuscatedName("client.kw")
    public static int field763 = 0;

    @ObfuscatedName("client.ka")
    public static int field815 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field765 = new int[1000];

    @ObfuscatedName("client.ky")
    public static final int[] field766 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kr")
    public static String[] field756 = new String[8];

    @ObfuscatedName("client.kk")
    public static boolean[] field768 = new boolean[8];

    @ObfuscatedName("client.kp")
    public static int[] field697 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kj")
    public static int field745 = -1;

    @ObfuscatedName("client.kg")
    public static class262[][][] field771 = new class262[4][104][104];

    @ObfuscatedName("client.kz")
    public static class262 field772 = new class262();

    @ObfuscatedName("client.kv")
    public static class262 field773 = new class262();

    @ObfuscatedName("client.ko")
    public static class262 field693 = new class262();

    @ObfuscatedName("client.kq")
    public static int[] field775 = new int[25];

    @ObfuscatedName("client.kn")
    public static int[] field776 = new int[25];

    @ObfuscatedName("client.ki")
    public static int[] field877 = new int[25];

    @ObfuscatedName("client.kb")
    public static int field671 = 0;

    @ObfuscatedName("client.ke")
    public static boolean field876 = false;

    @ObfuscatedName("client.lu")
    public static int field780 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field781 = new int[500];

    @ObfuscatedName("client.lb")
    public static int[] field782 = new int[500];

    @ObfuscatedName("client.ll")
    public static int[] field783 = new int[500];

    @ObfuscatedName("client.le")
    public static int[] field784 = new int[500];

    @ObfuscatedName("client.lw")
    public static String[] field785 = new String[500];

    @ObfuscatedName("client.ls")
    public static String[] field843 = new String[500];

    @ObfuscatedName("client.ly")
    public static boolean[] field787 = new boolean[500];

    @ObfuscatedName("client.lp")
    public static boolean field788 = false;

    @ObfuscatedName("client.lm")
    public static boolean field761 = false;

    @ObfuscatedName("client.ln")
    public static boolean field774 = false;

    @ObfuscatedName("client.lt")
    public static boolean field710 = true;

    @ObfuscatedName("client.lf")
    public static int field778 = -1;

    @ObfuscatedName("client.ld")
    public static int field793 = -1;

    @ObfuscatedName("client.lr")
    public static int field644 = 0;

    @ObfuscatedName("client.lo")
    public static int field769 = 50;

    @ObfuscatedName("client.lk")
    public static int field802 = 0;

    @ObfuscatedName("client.lc")
    public static boolean field798 = false;

    @ObfuscatedName("client.lg")
    public static int field799 = -1;

    @ObfuscatedName("client.mf")
    public static int field800 = -1;

    @ObfuscatedName("client.mr")
    public static String field801 = null;

    @ObfuscatedName("client.mb")
    public static String field718 = null;

    @ObfuscatedName("client.md")
    public static int field725 = -1;

    @ObfuscatedName("client.mq")
    public static class318 field804 = new class318(8);

    @ObfuscatedName("client.mk")
    public static int field805 = 0;

    @ObfuscatedName("client.mn")
    public static int field806 = -1;

    @ObfuscatedName("client.mm")
    public static int field807 = 0;

    @ObfuscatedName("client.mx")
    public static int field808 = 0;

    @ObfuscatedName("client.mg")
    public static class218 field779 = null;

    @ObfuscatedName("client.mv")
    public static int field810 = 0;

    @ObfuscatedName("client.my")
    public static int field811 = 0;

    @ObfuscatedName("client.ms")
    public static int field812 = 0;

    @ObfuscatedName("client.mt")
    public static int field813 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field814 = false;

    @ObfuscatedName("client.mc")
    public static class218 field825 = null;

    @ObfuscatedName("client.mw")
    public static class218 field816 = null;

    @ObfuscatedName("client.mp")
    public static class218 field817 = null;

    @ObfuscatedName("client.ml")
    public static int field818 = 0;

    @ObfuscatedName("client.me")
    public static int field722 = 0;

    @ObfuscatedName("client.mj")
    public static class218 field820 = null;

    @ObfuscatedName("client.nm")
    public static boolean field821 = false;

    @ObfuscatedName("client.nd")
    public static int field699 = -1;

    @ObfuscatedName("client.nh")
    public static int field823 = -1;

    @ObfuscatedName("client.ne")
    public static boolean field824 = false;

    @ObfuscatedName("client.ni")
    public static int field809 = -1;

    @ObfuscatedName("client.no")
    public static int field826 = -1;

    @ObfuscatedName("client.nv")
    public static boolean field672 = false;

    @ObfuscatedName("client.nl")
    public static int field828 = 1;

    @ObfuscatedName("client.na")
    public static int[] field829 = new int[32];

    @ObfuscatedName("client.nr")
    public static int field830 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field831 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field899 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field880 = new int[32];

    @ObfuscatedName("client.nz")
    public static int field840 = 0;

    @ObfuscatedName("client.nx")
    public static int field803 = 0;

    @ObfuscatedName("client.nc")
    public static int field834 = 0;

    @ObfuscatedName("client.nt")
    public static int field837 = 0;

    @ObfuscatedName("client.ny")
    public static int field646 = 0;

    @ObfuscatedName("client.nq")
    public static int field735 = 0;

    @ObfuscatedName("client.nb")
    public static int field835 = 0;

    @ObfuscatedName("client.op")
    public static int field841 = 0;

    @ObfuscatedName("client.or")
    public static class262 field842 = new class262();

    @ObfuscatedName("client.oo")
    public static class262 field901 = new class262();

    @ObfuscatedName("client.oq")
    public static class262 field844 = new class262();

    @ObfuscatedName("client.oy")
    public static class318 field845 = new class318(512);

    @ObfuscatedName("client.oj")
    public static int field846 = 0;

    @ObfuscatedName("client.ok")
    public static int field691 = -2;

    @ObfuscatedName("client.oa")
    public static boolean[] field848 = new boolean[100];

    @ObfuscatedName("client.ov")
    public static boolean[] field838 = new boolean[100];

    @ObfuscatedName("client.ob")
    public static boolean[] field850 = new boolean[100];

    @ObfuscatedName("client.on")
    public static int[] field747 = new int[100];

    @ObfuscatedName("client.ol")
    public static int[] field852 = new int[100];

    @ObfuscatedName("client.ow")
    public static int[] field853 = new int[100];

    @ObfuscatedName("client.oh")
    public static int[] field854 = new int[100];

    @ObfuscatedName("client.oe")
    public static int field794 = 0;

    @ObfuscatedName("client.os")
    public static long field653 = 0L;

    @ObfuscatedName("client.of")
    public static boolean field857 = true;

    @ObfuscatedName("client.pa")
    public static int[] field858 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pj")
    public static int field860 = 0;

    @ObfuscatedName("client.pk")
    public static int field855 = 0;

    @ObfuscatedName("client.ph")
    public static String field861 = "";

    @ObfuscatedName("client.pu")
    public static long[] field862 = new long[100];

    @ObfuscatedName("client.pb")
    public static int field856 = 0;

    @ObfuscatedName("client.pg")
    public static int field890 = 0;

    @ObfuscatedName("client.pt")
    public static int[] field865 = new int[128];

    @ObfuscatedName("client.pl")
    public static int[] field866 = new int[128];

    @ObfuscatedName("client.pv")
    public static long field867 = -1L;

    @ObfuscatedName("client.pp")
    public static int field868 = -1;

    @ObfuscatedName("client.py")
    public static int field869 = 0;

    @ObfuscatedName("client.pw")
    public static int[] field702 = new int[1000];

    @ObfuscatedName("client.pq")
    public static int[] field871 = new int[1000];

    @ObfuscatedName("client.pd")
    public static class325[] field797 = new class325[1000];

    @ObfuscatedName("client.px")
    public static int field873 = 0;

    @ObfuscatedName("client.pn")
    public static int field874 = 0;

    @ObfuscatedName("client.qn")
    public static int field875 = 0;

    @ObfuscatedName("client.qj")
    public static int field767 = 255;

    @ObfuscatedName("client.qq")
    public static int field886 = -1;

    @ObfuscatedName("client.qt")
    public static boolean field743 = false;

    @ObfuscatedName("client.qb")
    public static int field879 = 127;

    @ObfuscatedName("client.qr")
    public static int field792 = 127;

    @ObfuscatedName("client.ql")
    public static int field770 = 0;

    @ObfuscatedName("client.qs")
    public static int[] field893 = new int[50];

    @ObfuscatedName("client.qa")
    public static int[] field668 = new int[50];

    @ObfuscatedName("client.qv")
    public static int[] field884 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field885 = new int[50];

    @ObfuscatedName("client.qe")
    public static class102[] field900 = new class102[50];

    @ObfuscatedName("client.qw")
    public static boolean field887 = false;

    @ObfuscatedName("client.re")
    public static boolean[] field836 = new boolean[5];

    @ObfuscatedName("client.ra")
    public static int[] field737 = new int[5];

    @ObfuscatedName("client.rs")
    public static int[] field902 = new int[5];

    @ObfuscatedName("client.ri")
    public static int[] field891 = new int[5];

    @ObfuscatedName("client.rx")
    public static int[] field892 = new int[5];

    @ObfuscatedName("client.rw")
    public static short field881 = 256;

    @ObfuscatedName("client.rn")
    public static short field894 = 205;

    @ObfuscatedName("client.rb")
    public static short field895 = 256;

    @ObfuscatedName("client.rd")
    public static short field896 = 320;

    @ObfuscatedName("client.rz")
    public static short field897 = 1;

    @ObfuscatedName("client.rv")
    public static short field898 = 32767;

    @ObfuscatedName("client.rf")
    public static short field786 = 1;

    @ObfuscatedName("client.ru")
    public static short field680 = 32767;

    @ObfuscatedName("client.ry")
    public static int field657 = 0;

    @ObfuscatedName("client.rt")
    public static int field833 = 0;

    @ObfuscatedName("client.ro")
    public static int field903 = 0;

    @ObfuscatedName("client.rj")
    public static int field904 = 0;

    @ObfuscatedName("client.rr")
    public static int field905 = 0;

    @ObfuscatedName("client.rk")
    public static class215 field906 = new class215();

    @ObfuscatedName("client.sf")
    public static int field907 = -1;

    @ObfuscatedName("client.sm")
    public static int field908 = -1;

    @ObfuscatedName("client.sl")
    public static class330 field822 = new class329();

    @ObfuscatedName("client.sv")
    public static class10[] field910 = new class10[8];

    @ObfuscatedName("client.sh")
    public static class68 field911 = new class68();

    @ObfuscatedName("client.si")
    public static int field864 = -1;

    @ObfuscatedName("client.sq")
    public static ArrayList field913 = new ArrayList(10);

    @ObfuscatedName("client.sk")
    public static int field914 = 0;

    @ObfuscatedName("client.su")
    public static int field915 = 0;

    @ObfuscatedName("client.tp")
    public static final class66 field916 = new class66();

    @ObfuscatedName("client.tv")
    public static int[] field917 = new int[50];

    @ObfuscatedName("client.tx")
    public static int[] field863 = new int[50];

    @ObfuscatedName("fp.ex(I)Llo;")
    public static class333 method3240() {
        return Statics.field255;
    }

    @ObfuscatedName("client.an(I)V")
    public final void method875() {
    }

    public final void init() {
        if (!this.method792()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field849 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1147)) {
                            field859 = true;
                        } else {
                            field859 = false;
                        }
                        break;
                    case 4:
                        if (field650 == -1) {
                            field650 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field796 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var8 = Integer.parseInt(var2);
                        class191 var9;
                        if (var8 >= 0 && var8 < class191.field2368.length) {
                            var9 = class191.field2368[var8];
                        } else {
                            var9 = null;
                        }
                        Statics.field3299 = var9;
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class230[] var4 = class230.method225();
                        int var5 = 0;
                        class230 var7;
                        while (true) {
                            if (var5 >= var4.length) {
                                var7 = null;
                                break;
                            }
                            class230 var6 = var4[var5];
                            if (var6.field3110 == var3) {
                                var7 = var6;
                                break;
                            }
                            var5++;
                        }
                        Statics.field353 = var7;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1147)) {
                        }
                        break;
                    case 9:
                        Statics.field328 = var2;
                        break;
                    case 10:
                        Statics.field1974 = (class231) class196.method3304(class231.method585(), Integer.parseInt(var2));
                        if (Statics.field1974 == class231.field3115) {
                            Statics.field120 = class338.field4024;
                        } else {
                            Statics.field120 = class338.field4032;
                        }
                        break;
                    case 12:
                        field645 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field92 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field647 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1915 = var2;
                }
            }
        }
        method10();
        Statics.field413 = this.getCodeBase().getHost();
        String var10 = Statics.field353.field3109;
        byte var11 = 0;
        try {
            Statics.field2046 = 21;
            Statics.field933 = var11;
            try {
                Statics.field1948 = System.getProperty("os.name");
            } catch (Exception var79) {
                Statics.field1948 = "Unknown";
            }
            Statics.field132 = Statics.field1948.toLowerCase();
            try {
                Statics.field2043 = System.getProperty("user.home");
                if (Statics.field2043 != null) {
                    Statics.field2043 = Statics.field2043 + "/";
                }
            } catch (Exception var78) {
            }
            try {
                if (Statics.field132.startsWith("win")) {
                    if (Statics.field2043 == null) {
                        Statics.field2043 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2043 == null) {
                    Statics.field2043 = System.getenv("HOME");
                }
                if (Statics.field2043 != null) {
                    Statics.field2043 = Statics.field2043 + "/";
                }
            } catch (Exception var77) {
            }
            if (Statics.field2043 == null) {
                Statics.field2043 = "~/";
            }
            Statics.field2047 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2043, "/tmp/", "" };
            Statics.field3611 = new String[] { ".jagex_cache_" + Statics.field933, ".file_store_" + Statics.field933 };
            int var15 = 0;
            label337: while (var15 < 4) {
                String var16 = var15 == 0 ? "" : "" + var15;
                Statics.field2045 = new File(Statics.field2043, "jagex_cl_oldschool_" + var10 + var16 + ".dat");
                String var17 = null;
                String var18 = null;
                boolean var19 = false;
                if (Statics.field2045.exists()) {
                    try {
                        class343 var20 = new class343(Statics.field2045, "rw", 10000L);
                        class300 var21 = new class300((int) var20.method6118());
                        while (var21.field3707 < var21.field3708.length) {
                            int var22 = var20.method6119(var21.field3708, var21.field3707, var21.field3708.length - var21.field3707);
                            if (var22 == -1) {
                                throw new IOException();
                            }
                            var21.field3707 += var22;
                        }
                        var21.field3707 = 0;
                        int var23 = var21.method5138();
                        if (var23 < 1 || var23 > 3) {
                            throw new IOException("" + var23);
                        }
                        int var24 = 0;
                        if (var23 > 1) {
                            var24 = var21.method5138();
                        }
                        if (var23 <= 2) {
                            var17 = var21.method5148();
                            if (var24 == 1) {
                                var18 = var21.method5148();
                            }
                        } else {
                            var17 = var21.method5149();
                            if (var24 == 1) {
                                var18 = var21.method5149();
                            }
                        }
                        var20.method6116();
                    } catch (IOException var82) {
                        var82.printStackTrace();
                    }
                    if (var17 != null) {
                        File var26 = new File(var17);
                        if (!var26.exists()) {
                            var17 = null;
                        }
                    }
                    if (var17 != null) {
                        File var27 = new File(var17, "test.dat");
                        boolean var30;
                        try {
                            RandomAccessFile var28 = new RandomAccessFile(var27, "rw");
                            int var29 = var28.read();
                            var28.seek(0L);
                            var28.write(var29);
                            var28.seek(0L);
                            var28.close();
                            var27.delete();
                            var30 = true;
                        } catch (Exception var76) {
                            var30 = false;
                        }
                        if (!var30) {
                            var17 = null;
                        }
                    }
                }
                if (var17 == null && var15 == 0) {
                    label311: for (int var32 = 0; var32 < Statics.field3611.length; var32++) {
                        for (int var33 = 0; var33 < Statics.field2047.length; var33++) {
                            File var34 = new File(Statics.field2047[var33] + Statics.field3611[var32] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var34.exists()) {
                                File var35 = new File(var34, "test.dat");
                                boolean var38;
                                try {
                                    RandomAccessFile var36 = new RandomAccessFile(var35, "rw");
                                    int var37 = var36.read();
                                    var36.seek(0L);
                                    var36.write(var37);
                                    var36.seek(0L);
                                    var36.close();
                                    var35.delete();
                                    var38 = true;
                                } catch (Exception var75) {
                                    var38 = false;
                                }
                                if (var38) {
                                    var17 = var34.toString();
                                    var19 = true;
                                    break label311;
                                }
                            }
                        }
                    }
                }
                if (var17 == null) {
                    var17 = Statics.field2043 + File.separatorChar + "jagexcache" + var16 + File.separatorChar + "oldschool" + File.separatorChar + var10 + File.separatorChar;
                    var19 = true;
                }
                if (var18 != null) {
                    File var40 = new File(var18);
                    File var41 = new File(var17);
                    try {
                        File[] var42 = var40.listFiles();
                        File[] var43 = var42;
                        for (int var44 = 0; var44 < var43.length; var44++) {
                            File var45 = var43[var44];
                            File var46 = new File(var41, var45.getName());
                            boolean var47 = var45.renameTo(var46);
                            if (!var47) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var81) {
                        var81.printStackTrace();
                    }
                    var19 = true;
                }
                if (var19) {
                    File var49 = new File(var17);
                    Object var50 = null;
                    try {
                        class343 var51 = new class343(Statics.field2045, "rw", 10000L);
                        class300 var52 = new class300(500);
                        var52.method5290(3);
                        var52.method5290(var50 == null ? 0 : 1);
                        var52.method5131(var49.getPath());
                        if (var50 != null) {
                            var52.method5131(((File) var50).getPath());
                        }
                        var51.method6115(var52.field3708, 0, var52.field3707);
                        var51.method6116();
                    } catch (IOException var74) {
                        var74.printStackTrace();
                    }
                }
                File var54 = new File(var17);
                Statics.field3822 = var54;
                if (!Statics.field3822.exists()) {
                    Statics.field3822.mkdirs();
                }
                File[] var55 = Statics.field3822.listFiles();
                if (var55 != null) {
                    File[] var56 = var55;
                    for (int var57 = 0; var57 < var56.length; var57++) {
                        File var58 = var56[var57];
                        boolean var61;
                        try {
                            RandomAccessFile var59 = new RandomAccessFile(var58, "rw");
                            int var60 = var59.read();
                            var59.seek(0L);
                            var59.write(var60);
                            var59.seek(0L);
                            var59.close();
                            var61 = true;
                        } catch (Exception var73) {
                            var61 = false;
                        }
                        if (!var61) {
                            var15++;
                            continue label337;
                        }
                    }
                }
                break;
            }
            File var63 = Statics.field3822;
            Statics.field2060 = var63;
            if (!Statics.field2060.exists()) {
                throw new RuntimeException("");
            }
            class170.field2063 = true;
            try {
                File var64 = new File(Statics.field2043, "random.dat");
                if (var64.exists()) {
                    class168.field2049 = new class342(new class343(var64, "rw", 25L), 24, 0);
                } else {
                    label258: for (int var65 = 0; var65 < Statics.field3611.length; var65++) {
                        for (int var66 = 0; var66 < Statics.field2047.length; var66++) {
                            File var67 = new File(Statics.field2047[var66] + Statics.field3611[var65] + File.separatorChar + "random.dat");
                            if (var67.exists()) {
                                class168.field2049 = new class342(new class343(var67, "rw", 25L), 24, 0);
                                break label258;
                            }
                        }
                    }
                }
                if (class168.field2049 == null) {
                    RandomAccessFile var68 = new RandomAccessFile(var64, "rw");
                    int var69 = var68.read();
                    var68.seek(0L);
                    var68.write(var69);
                    var68.seek(0L);
                    var68.close();
                    class168.field2049 = new class342(new class343(var64, "rw", 25L), 24, 0);
                }
            } catch (IOException var80) {
            }
            class168.field2050 = new class342(new class343(class170.method1013("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2048 = new class342(new class343(class170.method1013("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field289 = new class342[Statics.field2046];
            for (int var71 = 0; var71 < Statics.field2046; var71++) {
                Statics.field289[var71] = new class342(new class343(class170.method1013("main_file_cache.idx" + var71), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var83) {
            class341.method3640((String) null, var83);
        }
        Statics.field302 = this;
        Statics.field4045 = field650;
        this.method790(765, 503, 186);
    }

    @ObfuscatedName("f.ev(I)V")
    public static final void method10() {
        class134.field1821 = false;
        field847 = false;
    }

    @ObfuscatedName("client.aa(B)V")
    public final void method803() {
        class302.method4897(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field525 = field647 == 0 ? 43594 : field645 + 40000;
        Statics.field416 = field647 == 0 ? 443 : field645 + 50000;
        Statics.field129 = Statics.field525;
        Statics.field2549 = class216.field2554;
        Statics.field534 = class216.field2555;
        Statics.field2543 = class216.field2556;
        Statics.field1538 = class216.field2557;
        Statics.field2527 = new class144();
        this.method785();
        this.method786();
        Statics.field538 = this.method834();
        Statics.field258 = new class308(255, class168.field2050, class168.field2048, 500000);
        Statics.field1978 = class74.method358();
        this.method872();
        String var2 = Statics.field1259;
        class52.field431 = this;
        if (var2 != null) {
            class52.field425 = var2;
        }
        if (field647 != 0) {
            field661 = true;
        }
        method961(Statics.field1978.field1050);
        Statics.field1745 = new class75(Statics.field120);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method804() {
        field655++;
        this.method1268();
        class235.method3999();
        class198.method1047();
        method1008();
        class46 var1 = class46.field391;
        synchronized (class46.field391) {
            class46.field392++;
            class46.field400 = class46.field385;
            class46.field399 = 0;
            if (class46.field398 >= 0) {
                while (class46.field398 != class46.field394) {
                    int var3 = class46.field395[class46.field394];
                    class46.field394 = class46.field394 + 1 & 0x7F;
                    if (var3 < 0) {
                        class46.field405[~var3] = false;
                    } else {
                        if (!class46.field405[var3] && class46.field399 < class46.field379.length - 1) {
                            class46.field379[++class46.field399 - 1] = var3;
                        }
                        class46.field405[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class46.field405[var2] = false;
                }
                class46.field398 = class46.field394;
            }
            if (class46.field399 > 0) {
                class46.field392 = 0;
            }
            class46.field385 = class46.field401;
        }
        class55 var5 = class55.field475;
        synchronized (class55.field475) {
            class55.field489 = class55.field477;
            class55.field473 = class55.field478;
            class55.field483 = class55.field479;
            class55.field480 = class55.field488;
            class55.field482 = class55.field485;
            class55.field490 = class55.field486;
            class55.field491 = class55.field487;
            class55.field492 = class55.field472;
            class55.field485 = 0;
        }
        if (Statics.field538 != null) {
            int var7 = Statics.field538.method677();
            field841 = var7;
        }
        if (field652 == 0) {
            method1144();
            Statics.field1998.method3196();
            for (int var8 = 0; var8 < 32; var8++) {
                field447[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field448[var9] = 0L;
            }
            Statics.field442 = 0;
        } else if (field652 == 5) {
            Statics.method4335(this);
            method1144();
            Statics.field1998.method3196();
            for (int var10 = 0; var10 < 32; var10++) {
                field447[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field448[var11] = 0L;
            }
            Statics.field442 = 0;
        } else if (field652 == 10 || field652 == 11) {
            Statics.method4335(this);
        } else if (field652 == 20) {
            Statics.method4335(this);
            this.method1159();
        } else if (field652 == 25) {
            method4658();
        }
        if (field652 == 30) {
            this.method1160();
        } else if (field652 == 40 || field652 == 45) {
            this.method1159();
        }
    }

    @ObfuscatedName("client.ar(ZB)V")
    public final void method805(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2412 == 2) {
                    if (Statics.field228 == null) {
                        Statics.field228 = class204.method3617(Statics.field2414, Statics.field1936, Statics.field1984);
                        if (Statics.field228 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field1122 == null) {
                        Statics.field1122 = new class109(Statics.field2416, Statics.field2411);
                    }
                    if (Statics.field1879.method3525(Statics.field228, Statics.field2410, Statics.field1122, 22050)) {
                        Statics.field1879.method3431();
                        Statics.field1879.method3516(Statics.field2415);
                        Statics.field1879.method3433(Statics.field228, Statics.field533);
                        class198.field2412 = 0;
                        Statics.field228 = null;
                        Statics.field1122 = null;
                        Statics.field2414 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1879.method3472();
                class198.field2412 = 0;
                Statics.field228 = null;
                Statics.field1122 = null;
                Statics.field2414 = null;
            }
            var2 = false;
        }
        if (var2 && field743 && Statics.field1155 != null) {
            Statics.field1155.method2238();
        }
        if ((field652 == 10 || field652 == 20 || field652 == 30) && field653 != 0L && class297.method3217() > field653) {
            method961(method673());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field848[var5] = true;
            }
        }
        if (field652 == 0) {
            this.method853(class86.field1183, class86.field1194, arg0);
        } else if (field652 == 5) {
            class86.method3337(Statics.field2059, Statics.field1172, Statics.field635);
        } else if (field652 == 10 || field652 == 11) {
            class86.method3337(Statics.field2059, Statics.field1172, Statics.field635);
        } else if (field652 == 20) {
            class86.method3337(Statics.field2059, Statics.field1172, Statics.field635);
        } else if (field652 == 25) {
            if (field700 == 1) {
                if (field677 > field795) {
                    field795 = field677;
                }
                int var6 = (field795 * 50 - field677 * 50) / field795;
                method283(class225.field2780 + class82.field1143 + class82.field1140 + var6 + "%" + class82.field1139, false);
            } else if (field700 == 2) {
                if (field851 > field673) {
                    field673 = field851;
                }
                int var7 = (field673 * 50 - field851 * 50) / field673 + 50;
                method283(class225.field2780 + class82.field1143 + class82.field1140 + var7 + "%" + class82.field1139, false);
            } else {
                method283(class225.field2780, false);
            }
        } else if (field652 == 30) {
            this.method1163();
        } else if (field652 == 40) {
            method283(class225.field2781 + class82.field1143 + class225.field2809, false);
        } else if (field652 == 45) {
            method283(class225.field3056, false);
        }
        if (field652 == 30 && field794 == 0 && !arg0 && !field857) {
            for (int var8 = 0; var8 < field846; var8++) {
                if (field838[var8]) {
                    Statics.field2507.method766(field747[var8], field852[var8], field853[var8], field854[var8]);
                    field838[var8] = false;
                }
            }
        } else if (field652 > 0) {
            Statics.field2507.method765(0, 0);
            for (int var9 = 0; var9 < field846; var9++) {
                field838[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.av(B)V")
    public final void method806() {
        if (Statics.field1167.method1989()) {
            Statics.field1167.method1982();
        }
        if (Statics.field10 != null) {
            Statics.field10.field590 = false;
        }
        Statics.field10 = null;
        field690.method2073();
        class46.method3411();
        class55.method3664();
        Statics.field538 = null;
        if (Statics.field1155 != null) {
            Statics.field1155.method2239();
        }
        if (Statics.field553 != null) {
            Statics.field553.method2239();
        }
        class237.method923();
        Object var1 = class235.field3154;
        synchronized (class235.field3154) {
            if (class235.field3156 != 0) {
                class235.field3156 = 1;
                try {
                    class235.field3154.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        if (Statics.field2527 != null) {
            Statics.field2527.method3057();
            Statics.field2527 = null;
        }
        Statics.method1930();
    }

    @ObfuscatedName("cl.eo(IB)V")
    public static void method1897(int arg0) {
        if (field652 == arg0) {
            return;
        }
        if (field652 == 0) {
            Statics.field302.method840();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field791 = 0;
            field888 = 0;
            field679 = 0;
            field694.method4663(arg0);
            if (arg0 != 20) {
                method721(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1414 != null) {
            Statics.field1414.method3243();
            Statics.field1414 = null;
        }
        if (field652 == 25) {
            field700 = 0;
            field677 = 0;
            field795 = 1;
            field851 = 0;
            field673 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method441(Statics.field1146, Statics.field244, true, 0);
        } else if (arg0 == 20) {
            class86.method441(Statics.field1146, Statics.field244, true, field652 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method441(Statics.field1146, Statics.field244, false, 4);
        } else if (Statics.field1195) {
            Statics.field1177 = null;
            Statics.field1189 = null;
            Statics.field3313 = null;
            Statics.field2502 = null;
            Statics.field3842 = null;
            Statics.field1455 = null;
            Statics.field1191 = null;
            Statics.field565 = null;
            Statics.field2533 = null;
            Statics.field361 = null;
            Statics.field544 = null;
            Statics.field350 = null;
            Statics.field1113 = null;
            Statics.field365 = null;
            Statics.field1296.method1648();
            class198.method3069(2);
            if (Statics.field3187 != null) {
                try {
                    class300 var1 = new class300(4);
                    var1.method5290(2);
                    var1.method5323(0);
                    Statics.field3187.method3250(var1.field3708, 0, 4);
                } catch (IOException var5) {
                    try {
                        Statics.field3187.method3243();
                    } catch (Exception var4) {
                    }
                    class237.field3190++;
                    Statics.field3187 = null;
                }
            }
            Statics.field1195 = false;
        }
        field652 = arg0;
    }

    @ObfuscatedName("client.ei(B)V")
    public void method1268() {
        if (field652 != 1000) {
            boolean var1 = class237.method501();
            if (!var1) {
                this.method1157();
            }
        }
    }

    @ObfuscatedName("client.en(I)V")
    public void method1157() {
        if (class237.field3181 >= 4) {
            this.method809("js5crc");
            field652 = 1000;
            return;
        }
        if (class237.field3190 >= 4) {
            if (field652 <= 5) {
                this.method809("js5io");
                field652 = 1000;
                return;
            }
            field675 = 3000;
            class237.field3190 = 3;
        }
        if (--field675 + 1 > 0) {
            return;
        }
        try {
            if (field674 == 0) {
                Statics.field408 = Statics.field454.method3205(Statics.field413, Statics.field129);
                field674++;
            }
            if (field674 == 1) {
                if (Statics.field408.field2027 == 2) {
                    this.method1531(-1);
                    return;
                }
                if (Statics.field408.field2027 == 1) {
                    field674++;
                }
            }
            if (field674 == 2) {
                if (field849) {
                    Statics.field1103 = class305.method656((Socket) Statics.field408.field2029, 40000, 5000);
                } else {
                    Statics.field1103 = new class172((Socket) Statics.field408.field2029, Statics.field454, 5000);
                }
                class300 var1 = new class300(5);
                var1.method5290(15);
                var1.method5231(186);
                Statics.field1103.method3250(var1.field3708, 0, 5);
                field674++;
                Statics.field2534 = class297.method3217();
            }
            if (field674 == 3) {
                if (Statics.field1103.method3249() > 0 || !field849 && field652 <= 5) {
                    int var2 = Statics.field1103.method3253();
                    if (var2 != 0) {
                        this.method1531(var2);
                        return;
                    }
                    field674++;
                } else if (class297.method3217() - Statics.field2534 > 30000L) {
                    this.method1531(-2);
                    return;
                }
            }
            if (field674 == 4) {
                class237.method3135(Statics.field1103, field652 > 20);
                Statics.field408 = null;
                Statics.field1103 = null;
                field674 = 0;
                field676 = 0;
            }
        } catch (IOException var4) {
            this.method1531(-3);
        }
    }

    @ObfuscatedName("client.eb(II)V")
    public void method1531(int arg0) {
        Statics.field408 = null;
        Statics.field1103 = null;
        field674 = 0;
        if (Statics.field525 == Statics.field129) {
            Statics.field129 = Statics.field416;
        } else {
            Statics.field129 = Statics.field525;
        }
        field676++;
        if (field676 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field652 <= 5) {
                this.method809("js5connect_full");
                field652 = 1000;
            } else {
                field675 = 3000;
            }
        } else if (field676 >= 2 && arg0 == 6) {
            this.method809("js5connect_outofdate");
            field652 = 1000;
        } else if (field676 >= 4) {
            if (field652 <= 5) {
                this.method809("js5connect");
                field652 = 1000;
            } else {
                field675 = 3000;
            }
        }
    }

    @ObfuscatedName("jy.es(Lij;Ljava/lang/String;I)V")
    public static void method4654(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field913.add(var2);
        field915 += var2.field530;
    }

    @ObfuscatedName("z.ed(I)Z")
    public static boolean method45() {
        if (field913 == null || field914 >= field913.size()) {
            return true;
        }
        while (field914 < field913.size()) {
            class59 var0 = (class59) field913.get(field914);
            if (!var0.method1023()) {
                return false;
            }
            field914++;
        }
        return true;
    }

    @ObfuscatedName("ir.eq(I)I")
    public static int method4104() {
        if (field913 == null || field914 >= field913.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field914; var1++) {
            var0 += ((class59) field913.get(var1)).field531;
        }
        return var0 * 10000 / field915;
    }

    @ObfuscatedName("du.fe(IB)I")
    public static int method2623(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("ar.fl(III)V")
    public static void method576(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method2623(var4);
            int var6 = class131.field1773[var4];
            int var7 = method156(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class134.method2877(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("bw.fj(I)V")
    public static void method1144() {
        if (field648 == 0) {
            Statics.field3 = new class134(4, 104, 104, class56.field496);
            for (int var0 = 0; var0 < 4; var0++) {
                field701[var0] = new class173(104, 104);
            }
            Statics.field1102 = new class325(512, 512);
            class86.field1194 = class225.field3016;
            class86.field1183 = 5;
            field648 = 20;
        } else if (field648 == 20) {
            class86.field1194 = class225.field2784;
            class86.field1183 = 10;
            field648 = 30;
        } else if (field648 == 30) {
            Statics.field82 = method922(0, false, true, true);
            Statics.field375 = method922(1, false, true, true);
            Statics.field3652 = method922(2, true, false, true);
            Statics.field266 = method922(3, false, true, true);
            Statics.field2526 = method922(4, false, true, true);
            Statics.field2504 = method922(5, true, true, true);
            Statics.field162 = method922(6, true, true, true);
            Statics.field2322 = method922(7, false, true, true);
            Statics.field244 = method922(8, false, true, true);
            Statics.field11 = method922(9, false, true, true);
            Statics.field1146 = method922(10, false, true, true);
            Statics.field519 = method922(11, false, true, true);
            Statics.field3558 = method922(12, false, true, true);
            Statics.field3565 = method922(13, true, false, true);
            Statics.field2014 = method922(14, false, true, true);
            Statics.field2518 = method922(15, false, true, true);
            Statics.field297 = method922(17, true, true, true);
            Statics.field1969 = method922(18, false, true, true);
            Statics.field87 = method922(19, false, true, true);
            Statics.field555 = method922(20, false, true, true);
            class86.field1194 = class225.field3031;
            class86.field1183 = 20;
            field648 = 40;
        } else if (field648 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field82.method3955() * 4 / 100;
            int var3 = var2 + Statics.field375.method3955() * 4 / 100;
            int var4 = var3 + Statics.field3652.method3955() * 2 / 100;
            int var5 = var4 + Statics.field266.method3955() * 2 / 100;
            int var6 = var5 + Statics.field2526.method3955() * 6 / 100;
            int var7 = var6 + Statics.field2504.method3955() * 4 / 100;
            int var8 = var7 + Statics.field162.method3955() * 2 / 100;
            int var9 = var8 + Statics.field2322.method3955() * 56 / 100;
            int var10 = var9 + Statics.field244.method3955() * 2 / 100;
            int var11 = var10 + Statics.field11.method3955() * 2 / 100;
            int var12 = var11 + Statics.field1146.method3955() * 2 / 100;
            int var13 = var12 + Statics.field519.method3955() * 2 / 100;
            int var14 = var13 + Statics.field3558.method3955() * 2 / 100;
            int var15 = var14 + Statics.field3565.method3955() * 2 / 100;
            int var16 = var15 + Statics.field2014.method3955() * 2 / 100;
            int var17 = var16 + Statics.field2518.method3955() * 2 / 100;
            int var18 = var17 + Statics.field87.method3955() / 100;
            int var19 = var18 + Statics.field1969.method3955() / 100;
            int var20 = var19 + Statics.field555.method3955() / 100;
            int var21 = var20 + (Statics.field297.method3954() && Statics.field297.method3848() ? 1 : 0);
            if (var21 == 100) {
                method4654(Statics.field82, "Animations");
                method4654(Statics.field375, "Skeletons");
                method4654(Statics.field2526, "Sound FX");
                method4654(Statics.field2504, "Maps");
                method4654(Statics.field162, "Music Tracks");
                method4654(Statics.field2322, "Models");
                method4654(Statics.field244, "Sprites");
                method4654(Statics.field519, "Music Jingles");
                method4654(Statics.field2014, "Music Samples");
                method4654(Statics.field2518, "Music Patches");
                method4654(Statics.field87, "World Map");
                method4654(Statics.field1969, "World Map Geography");
                method4654(Statics.field555, "World Map Ground");
                Statics.field960 = new class312();
                Statics.field960.method5497(Statics.field297);
                class86.field1194 = class225.field2870;
                class86.field1183 = 30;
                field648 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1194 = class225.field2786 + var21 + "%";
                }
                class86.field1183 = 30;
            }
        } else if (field648 == 45) {
            class106.method150(22050, !field847, 2);
            class199 var22 = new class199();
            var22.method3435(9, 128);
            Statics.field1155 = class106.method1596(Statics.field454, 0, 22050);
            Statics.field1155.method2235(var22);
            class198.method3182(Statics.field2518, Statics.field2014, Statics.field2526, var22);
            Statics.field553 = class106.method1596(Statics.field454, 1, 2048);
            Statics.field2240 = new class99();
            Statics.field553.method2235(Statics.field2240);
            Statics.field1023 = new class113(22050, Statics.field1275);
            class86.field1194 = class225.field2788;
            class86.field1183 = 35;
            field648 = 50;
            Statics.field267 = new class293(Statics.field244, Statics.field3565);
        } else if (field648 == 50) {
            class292[] var23 = new class292[] { class292.field3663, class292.field3660, class292.field3662, class292.field3667, class292.field3664, class292.field3661 };
            int var24 = var23.length;
            class293 var25 = Statics.field267;
            class292[] var26 = new class292[] { class292.field3663, class292.field3660, class292.field3662, class292.field3667, class292.field3664, class292.field3661 };
            field883 = var25.method4973(var26);
            if (field883.size() < var24) {
                class86.field1194 = class225.field2789 + field883.size() * 100 / var24 + "%";
                class86.field1183 = 40;
            } else {
                Statics.field1172 = (class295) field883.get(class292.field3661);
                Statics.field635 = (class295) field883.get(class292.field3667);
                Statics.field2059 = (class295) field883.get(class292.field3660);
                Statics.field1125 = field822.method5828();
                class86.field1194 = class225.field2858;
                class86.field1183 = 40;
                field648 = 60;
            }
        } else if (field648 == 60) {
            class236 var27 = Statics.field1146;
            class236 var28 = Statics.field244;
            int var29 = 0;
            if (var27.method3888("title.jpg", "")) {
                var29++;
            }
            if (var28.method3888("logo", "")) {
                var29++;
            }
            if (var28.method3888("logo_deadman_mode", "")) {
                var29++;
            }
            if (var28.method3888("logo_seasonal_mode", "")) {
                var29++;
            }
            if (var28.method3888("titlebox", "")) {
                var29++;
            }
            if (var28.method3888("titlebutton", "")) {
                var29++;
            }
            if (var28.method3888("runes", "")) {
                var29++;
            }
            if (var28.method3888("title_mute", "")) {
                var29++;
            }
            if (var28.method3888("options_radio_buttons,0", "")) {
                var29++;
            }
            if (var28.method3888("options_radio_buttons,2", "")) {
                var29++;
            }
            if (var28.method3888("options_radio_buttons,4", "")) {
                var29++;
            }
            if (var28.method3888("options_radio_buttons,6", "")) {
                var29++;
            }
            var28.method3888("sl_back", "");
            var28.method3888("sl_flags", "");
            var28.method3888("sl_arrows", "");
            var28.method3888("sl_stars", "");
            var28.method3888("sl_button", "");
            byte var32 = 12;
            if (var29 < var32) {
                class86.field1194 = class225.field2791 + var29 * 100 / var32 + "%";
                class86.field1183 = 50;
            } else {
                class86.field1194 = class225.field2792;
                class86.field1183 = 50;
                method1897(5);
                field648 = 70;
            }
        } else if (field648 == 70) {
            if (Statics.field3652.method3848()) {
                class236 var34 = Statics.field3652;
                Statics.field3511 = var34;
                class236 var35 = Statics.field3652;
                Statics.field3263 = var35;
                class246.method3294(Statics.field3652, Statics.field2322);
                class254.method529(Statics.field3652, Statics.field2322, field847);
                class236 var36 = Statics.field3652;
                class236 var37 = Statics.field2322;
                Statics.field3472 = var36;
                Statics.field3467 = var37;
                class251.method3839(Statics.field3652);
                Statics.method2299(Statics.field3652, Statics.field2322, field859, Statics.field1172);
                class259.method1900(Statics.field3652, Statics.field82, Statics.field375);
                class236 var38 = Statics.field3652;
                class236 var39 = Statics.field2322;
                Statics.field3259 = var38;
                Statics.field3250 = var39;
                class249.method3341(Statics.field3652);
                class236 var40 = Statics.field3652;
                Statics.field3215 = var40;
                Statics.field3214 = Statics.field3215.method3878(16);
                class236 var41 = Statics.field266;
                class236 var42 = Statics.field2322;
                class236 var43 = Statics.field244;
                class236 var44 = Statics.field3565;
                Statics.field3210 = var41;
                Statics.field3642 = var42;
                Statics.field2570 = var43;
                Statics.field2603 = var44;
                Statics.field1608 = new class218[Statics.field3210.method3856()][];
                Statics.field2569 = new boolean[Statics.field3210.method3856()];
                class236 var45 = Statics.field3652;
                Statics.field3209 = var45;
                class252.method3355(Statics.field3652);
                class236 var46 = Statics.field3652;
                Statics.field3245 = var46;
                class236 var47 = Statics.field3652;
                Statics.field3308 = var47;
                Statics.field1167 = new class91();
                class236 var48 = Statics.field3652;
                class236 var49 = Statics.field244;
                class236 var50 = Statics.field3565;
                Statics.field3351 = var48;
                Statics.field3329 = var49;
                Statics.field3345 = var50;
                class247.method1134(Statics.field3652, Statics.field244);
                class236 var51 = Statics.field3652;
                class236 var52 = Statics.field244;
                Statics.field2764 = var52;
                if (var51.method3848()) {
                    Statics.field3222 = var51.method3878(35);
                    Statics.field3230 = new class242[Statics.field3222];
                    for (int var53 = 0; var53 < Statics.field3222; var53++) {
                        byte[] var54 = var51.method3928(35, var53);
                        Statics.field3230[var53] = new class242(var53);
                        if (var54 != null) {
                            Statics.field3230[var53].method4054(new class300(var54));
                            Statics.field3230[var53].method4056();
                        }
                    }
                }
                class86.field1194 = class225.field2794;
                class86.field1183 = 60;
                field648 = 80;
            } else {
                class86.field1194 = class225.field2793 + Statics.field3652.method3964() + "%";
                class86.field1183 = 60;
            }
        } else if (field648 == 80) {
            int var55 = 0;
            if (Statics.field354 == null) {
                Statics.field354 = class326.method4926(Statics.field244, Statics.field960.field3804, 0);
            } else {
                var55++;
            }
            if (Statics.field3075 == null) {
                Statics.field3075 = class326.method4926(Statics.field244, Statics.field960.field3809, 0);
            } else {
                var55++;
            }
            if (Statics.field60 == null) {
                class236 var56 = Statics.field244;
                int var57 = Statics.field960.field3802;
                class324[] var58;
                if (class326.method1850(var56, var57, 0)) {
                    var58 = class326.method3052();
                } else {
                    var58 = null;
                }
                Statics.field60 = var58;
            } else {
                var55++;
            }
            if (Statics.field3666 == null) {
                Statics.field3666 = class326.method3167(Statics.field244, Statics.field960.field3803, 0);
            } else {
                var55++;
            }
            if (Statics.field1946 == null) {
                Statics.field1946 = class326.method3167(Statics.field244, Statics.field960.field3800, 0);
            } else {
                var55++;
            }
            if (Statics.field3535 == null) {
                Statics.field3535 = class326.method3167(Statics.field244, Statics.field960.field3805, 0);
            } else {
                var55++;
            }
            if (Statics.field1173 == null) {
                Statics.field1173 = class326.method3167(Statics.field244, Statics.field960.field3806, 0);
            } else {
                var55++;
            }
            if (Statics.field407 == null) {
                Statics.field407 = class326.method3167(Statics.field244, Statics.field960.field3807, 0);
            } else {
                var55++;
            }
            if (Statics.field105 == null) {
                Statics.field105 = class326.method3167(Statics.field244, Statics.field960.field3808, 0);
            } else {
                var55++;
            }
            if (Statics.field54 == null) {
                class236 var59 = Statics.field244;
                int var60 = Statics.field960.field3801;
                class324[] var61;
                if (class326.method1850(var59, var60, 0)) {
                    var61 = class326.method3052();
                } else {
                    var61 = null;
                }
                Statics.field54 = var61;
            } else {
                var55++;
            }
            if (Statics.field2394 == null) {
                class236 var62 = Statics.field244;
                int var63 = Statics.field960.field3810;
                class324[] var64;
                if (class326.method1850(var62, var63, 0)) {
                    var64 = class326.method3052();
                } else {
                    var64 = null;
                }
                Statics.field2394 = var64;
            } else {
                var55++;
            }
            if (var55 < 11) {
                class86.field1194 = class225.field2795 + var55 * 100 / 12 + "%";
                class86.field1183 = 70;
            } else {
                Statics.field3693 = Statics.field2394;
                Statics.field3075.method5683();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                Statics.field60[0].method5659(var65 + var68, var66 + var68, var67 + var68);
                class86.field1194 = class225.field2796;
                class86.field1183 = 70;
                field648 = 90;
            }
        } else if (field648 == 90) {
            if (Statics.field11.method3848()) {
                Statics.field2056 = new class120(Statics.field11, Statics.field244, 20, 0.8D, field847 ? 64 : 128);
                class131.method2806(Statics.field2056);
                class131.method2761(0.8D);
                field648 = 100;
            } else {
                class86.field1194 = class225.field2826 + "0%";
                class86.field1183 = 90;
            }
        } else if (field648 == 100) {
            int var69 = Statics.field2056.method2538();
            if (var69 < 100) {
                class86.field1194 = class225.field2826 + var69 + "%";
                class86.field1183 = 90;
            } else {
                class86.field1194 = class225.field2798;
                class86.field1183 = 90;
                field648 = 110;
            }
        } else if (field648 == 110) {
            Statics.field10 = new class64();
            Statics.field454.method3206(Statics.field10, 10);
            class86.field1194 = class225.field2869;
            class86.field1183 = 92;
            field648 = 120;
        } else if (field648 == 120) {
            if (Statics.field1146.method3888("huffman", "")) {
                class210 var70 = new class210(Statics.field1146.method3864("huffman", ""));
                class211.method2027(var70);
                class86.field1194 = class225.field3018;
                class86.field1183 = 94;
                field648 = 130;
            } else {
                class86.field1194 = class225.field2800 + "%";
                class86.field1183 = 94;
            }
        } else if (field648 == 130) {
            if (!Statics.field266.method3848()) {
                class86.field1194 = class225.field2840 + Statics.field266.method3964() * 4 / 5 + "%";
                class86.field1183 = 96;
            } else if (!Statics.field3558.method3848()) {
                class86.field1194 = class225.field2840 + (80 + Statics.field3558.method3964() / 6) + "%";
                class86.field1183 = 96;
            } else if (Statics.field3565.method3848()) {
                class86.field1194 = class225.field3044;
                class86.field1183 = 98;
                field648 = 140;
            } else {
                class86.field1194 = class225.field2840 + (96 + Statics.field3565.method3964() / 50) + "%";
                class86.field1183 = 96;
            }
        } else if (field648 == 140) {
            class86.field1183 = 100;
            if (Statics.field87.method3866(class36.field305.field303)) {
                if (Statics.field255 == null) {
                    Statics.field255 = new class333();
                    Statics.field255.method5901(Statics.field87, Statics.field1969, Statics.field555, Statics.field2059, field883, Statics.field60);
                }
                class86.field1194 = class225.field2805;
                field648 = 150;
            } else {
                class86.field1194 = class225.field2804 + Statics.field87.method3862(class36.field305.field303) / 10 + "%";
            }
        } else if (field648 == 150) {
            method1897(10);
        }
    }

    @ObfuscatedName("bo.fv(IZZZI)Lij;")
    public static class236 method922(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2050 != null) {
            var4 = new class308(arg0, class168.field2050, Statics.field289[arg0], 1000000);
        }
        return new class236(var4, Statics.field258, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1159() {
        class305 var1 = field690.method2075();
        class299 var2 = field690.field1305;
        try {
            if (field791 == 0) {
                if (Statics.field430 == null && (field683.method1945() || field888 > 250)) {
                    Statics.field430 = field683.method1946();
                    field683.method1949();
                    field683 = null;
                }
                if (Statics.field430 != null) {
                    if (var1 != null) {
                        var1.method3243();
                        var1 = null;
                    }
                    Statics.field1242 = null;
                    field692 = false;
                    field888 = 0;
                    field791 = 1;
                }
            }
            if (field791 == 1) {
                if (Statics.field1242 == null) {
                    Statics.field1242 = Statics.field454.method3205(Statics.field413, Statics.field129);
                }
                if (Statics.field1242.field2027 == 2) {
                    throw new IOException();
                }
                if (Statics.field1242.field2027 == 1) {
                    if (field849) {
                        var1 = class305.method656((Socket) Statics.field1242.field2029, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field1242.field2029, Statics.field454, 5000);
                    }
                    field690.method2072(var1);
                    Statics.field1242 = null;
                    field791 = 2;
                }
            }
            if (field791 == 2) {
                field690.method2069();
                class188 var3 = class188.method2018();
                var3.field2347.method5290(class185.field2325.field2330);
                field690.method2071(var3);
                field690.method2070();
                var2.field3707 = 0;
                field791 = 3;
            }
            if (field791 == 3) {
                if (Statics.field1155 != null) {
                    Statics.field1155.method2243();
                }
                if (Statics.field553 != null) {
                    Statics.field553.method2243();
                }
                boolean var4 = true;
                if (field849 && !var1.method3267(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3253();
                    if (Statics.field1155 != null) {
                        Statics.field1155.method2243();
                    }
                    if (Statics.field553 != null) {
                        Statics.field553.method2243();
                    }
                    if (var5 != 0) {
                        method3194(var5);
                        return;
                    }
                    var2.field3707 = 0;
                    field791 = 4;
                }
            }
            if (field791 == 4) {
                if (var2.field3707 < 8) {
                    int var6 = var1.method3249();
                    if (var6 > 8 - var2.field3707) {
                        var6 = 8 - var2.field3707;
                    }
                    if (var6 > 0) {
                        var1.method3247(var2.field3708, var2.field3707, var6);
                        var2.field3707 += var6;
                    }
                }
                if (var2.field3707 == 8) {
                    var2.field3707 = 0;
                    Statics.field2111 = var2.method5144();
                    field791 = 5;
                }
            }
            if (field791 == 5) {
                field690.field1305.field3707 = 0;
                field690.method2069();
                class299 var7 = new class299(500);
                int[] var8 = new int[] { Statics.field430.nextInt(), Statics.field430.nextInt(), Statics.field430.nextInt(), Statics.field430.nextInt() };
                var7.field3707 = 0;
                var7.method5290(1);
                var7.method5231(var8[0]);
                var7.method5231(var8[1]);
                var7.method5231(var8[2]);
                var7.method5231(var8[3]);
                var7.method5166(Statics.field2111);
                if (field652 == 40) {
                    var7.method5231(Statics.field2553[0]);
                    var7.method5231(Statics.field2553[1]);
                    var7.method5231(Statics.field2553[2]);
                    var7.method5231(Statics.field2553[3]);
                } else {
                    var7.method5290(field681.method26());
                    switch(field681.field2008) {
                        case 0:
                        case 2:
                            var7.method5323(Statics.field2396);
                            var7.field3707++;
                            break;
                        case 1:
                            LinkedHashMap var10 = Statics.field1978.field1052;
                            String var11 = class86.field1193;
                            int var12 = var11.length();
                            int var13 = 0;
                            for (int var14 = 0; var14 < var12; var14++) {
                                var13 = (var13 << 5) - var13 + var11.charAt(var14);
                            }
                            var7.method5231((Integer) var10.get(var13));
                            break;
                        case 3:
                            var7.field3707 += 4;
                    }
                    var7.method5290(class313.field3815.method26());
                    var7.method5129(class86.field1175);
                }
                var7.method5161(class84.field1159, class84.field1161);
                Statics.field2553 = var8;
                class188 var16 = class188.method2018();
                var16.field2347.field3707 = 0;
                if (field652 == 40) {
                    var16.field2347.method5290(class185.field2329.field2330);
                } else {
                    var16.field2347.method5290(class185.field2327.field2330);
                }
                var16.field2347.method5123(0);
                int var17 = var16.field2347.field3707;
                var16.field2347.method5231(186);
                var16.field2347.method5231(1);
                var16.field2347.method5290(field650);
                var16.field2347.method5132(var7.field3708, 0, var7.field3707);
                int var18 = var16.field2347.field3707;
                var16.field2347.method5129(class86.field1193);
                var16.field2347.method5290((field857 ? 1 : 0) << 1 | (field847 ? 1 : 0));
                var16.field2347.method5123(Statics.field1873);
                var16.field2347.method5123(Statics.field310);
                method84(var16.field2347);
                var16.field2347.method5129(Statics.field328);
                var16.field2347.method5231(Statics.field92);
                class300 var19 = new class300(Statics.field1125.method5838());
                Statics.field1125.method5836(var19);
                var16.field2347.method5132(var19.field3708, 0, var19.field3708.length);
                var16.field2347.method5290(field650);
                var16.field2347.method5231(0);
                var16.field2347.method5231(Statics.field82.field3150);
                var16.field2347.method5231(Statics.field375.field3150);
                var16.field2347.method5231(Statics.field3652.field3150);
                var16.field2347.method5231(Statics.field266.field3150);
                var16.field2347.method5231(Statics.field2526.field3150);
                var16.field2347.method5231(Statics.field2504.field3150);
                var16.field2347.method5231(Statics.field162.field3150);
                var16.field2347.method5231(Statics.field2322.field3150);
                var16.field2347.method5231(Statics.field244.field3150);
                var16.field2347.method5231(Statics.field11.field3150);
                var16.field2347.method5231(Statics.field1146.field3150);
                var16.field2347.method5231(Statics.field519.field3150);
                var16.field2347.method5231(Statics.field3558.field3150);
                var16.field2347.method5231(Statics.field3565.field3150);
                var16.field2347.method5231(Statics.field2014.field3150);
                var16.field2347.method5231(Statics.field2518.field3150);
                var16.field2347.method5231(0);
                var16.field2347.method5231(Statics.field297.field3150);
                var16.field2347.method5231(Statics.field1969.field3150);
                var16.field2347.method5231(Statics.field87.field3150);
                var16.field2347.method5231(Statics.field555.field3150);
                var16.field2347.method5159(var8, var18, var16.field2347.field3707);
                var16.field2347.method5134(var16.field2347.field3707 - var17);
                field690.method2071(var16);
                field690.method2070();
                field690.field1311 = new class328(var8);
                int[] var20 = new int[4];
                for (int var21 = 0; var21 < 4; var21++) {
                    var20[var21] = var8[var21] + 50;
                }
                var2.method5105(var20);
                field791 = 6;
            }
            if (field791 == 6 && var1.method3249() > 0) {
                int var22 = var1.method3253();
                if (var22 == 21 && field652 == 20) {
                    field791 = 9;
                } else if (var22 == 2) {
                    field791 = 11;
                } else if (var22 == 15 && field652 == 40) {
                    field690.field1307 = -1;
                    field791 = 16;
                } else if (var22 == 64) {
                    field791 = 7;
                } else if (var22 == 23 && field679 < 1) {
                    field679++;
                    field791 = 0;
                } else if (var22 == 29) {
                    field791 = 14;
                } else {
                    method3194(var22);
                    return;
                }
            }
            if (field791 == 7 && var1.method3249() > 0) {
                Statics.field1941 = var1.method3253();
                field791 = 8;
            }
            if (field791 == 8 && var1.method3249() >= Statics.field1941) {
                var1.method3247(var2.field3708, 0, Statics.field1941);
                var2.field3707 = 0;
                field791 = 6;
            }
            if (field791 == 9 && var1.method3249() > 0) {
                field695 = (var1.method3253() + 3) * 60;
                field791 = 10;
            }
            if (field791 == 10) {
                field888 = 0;
                class86.method2089(class225.field2832, class225.field2944, field695 / 60 + class225.field2905);
                if (--field695 <= 0) {
                    field791 = 0;
                }
            } else {
                if (field791 == 11 && var1.method3249() >= 1) {
                    Statics.field74 = var1.method3253();
                    field791 = 12;
                }
                if (field791 == 12 && var1.method3249() >= Statics.field74) {
                    boolean var23 = var1.method3253() == 1;
                    var1.method3247(var2.field3708, 0, 4);
                    var2.field3707 = 0;
                    boolean var24 = false;
                    if (var23) {
                        int var25 = var2.method5085() << 24;
                        int var26 = var25 | var2.method5085() << 16;
                        int var27 = var26 | var2.method5085() << 8;
                        int var28 = var27 | var2.method5085();
                        String var29 = class86.field1193;
                        int var30 = var29.length();
                        int var31 = 0;
                        int var32 = 0;
                        while (true) {
                            if (var32 >= var30) {
                                if (Statics.field1978.field1052.size() >= 10 && !Statics.field1978.field1052.containsKey(var31)) {
                                    Iterator var35 = Statics.field1978.field1052.entrySet().iterator();
                                    var35.next();
                                    var35.remove();
                                }
                                Statics.field1978.field1052.put(var31, var28);
                                break;
                            }
                            var31 = (var31 << 5) - var31 + var29.charAt(var32);
                            var32++;
                        }
                    }
                    if (field682) {
                        Statics.field1978.field1056 = class86.field1193;
                    } else {
                        Statics.field1978.field1056 = null;
                    }
                    class74.method650();
                    field812 = var1.method3253();
                    field814 = var1.method3253() == 1;
                    field760 = var1.method3253();
                    field760 <<= 0x8;
                    field760 += var1.method3253();
                    field790 = var1.method3253();
                    var1.method3247(var2.field3708, 0, 1);
                    var2.field3707 = 0;
                    class183[] var36 = class183.method183();
                    int var37 = var2.method5082();
                    if (var37 < 0 || var37 >= var36.length) {
                        throw new IOException(var37 + " " + var2.field3707);
                    }
                    field690.field1310 = var36[var37];
                    field690.field1307 = field690.field1310.field2216;
                    var1.method3247(var2.field3708, 0, 2);
                    var2.field3707 = 0;
                    field690.field1307 = var2.method5337();
                    try {
                        Statics.method713(Statics.field302, "zap");
                    } catch (Throwable var61) {
                    }
                    field791 = 13;
                }
                if (field791 != 13) {
                    if (field791 == 14 && var1.method3249() >= 2) {
                        var2.field3707 = 0;
                        var1.method3247(var2.field3708, 0, 2);
                        var2.field3707 = 0;
                        Statics.field293 = var2.method5337();
                        field791 = 15;
                    }
                    if (field791 == 15 && var1.method3249() >= Statics.field293) {
                        var2.field3707 = 0;
                        var1.method3247(var2.field3708, 0, Statics.field293);
                        var2.field3707 = 0;
                        String var51 = var2.method5147();
                        String var52 = var2.method5147();
                        String var53 = var2.method5147();
                        class86.method2089(var51, var52, var53);
                        method1897(10);
                    }
                    if (field791 == 16) {
                        if (field690.field1307 == -1) {
                            if (var1.method3249() < 2) {
                                return;
                            }
                            var1.method3247(var2.field3708, 0, 2);
                            var2.field3707 = 0;
                            field690.field1307 = var2.method5337();
                        }
                        if (var1.method3249() >= field690.field1307) {
                            var1.method3247(var2.field3708, 0, field690.field1307);
                            var2.field3707 = 0;
                            int var54 = field690.field1307;
                            field694.method4666();
                            field690.method2069();
                            field690.field1305.field3707 = 0;
                            field690.field1310 = null;
                            field690.field1300 = null;
                            field690.field1312 = null;
                            field690.field1313 = null;
                            field690.field1307 = 0;
                            field690.field1306 = 0;
                            field662 = 0;
                            method3317();
                            field875 = 0;
                            field873 = 0;
                            for (int var55 = 0; var55 < 2048; var55++) {
                                field759[var55] = null;
                            }
                            Statics.field2558 = null;
                            for (int var56 = 0; var56 < field685.length; var56++) {
                                class80 var57 = field685[var56];
                                if (var57 != null) {
                                    var57.field962 = -1;
                                    var57.field963 = false;
                                }
                            }
                            class60.field543 = new class318(32);
                            method1897(30);
                            for (int var58 = 0; var58 < 100; var58++) {
                                field848[var58] = true;
                            }
                            class188 var59 = class188.method3035(class184.field2219, field690.field1311);
                            var59.field2347.method5290(method673());
                            var59.field2347.method5123(Statics.field1873);
                            var59.field2347.method5123(Statics.field310);
                            field690.method2071(var59);
                            class90.method3183(var2);
                            if (var2.field3707 != var54) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field888++;
                        if (field888 > 2000) {
                            if (field679 < 1) {
                                if (Statics.field525 == Statics.field129) {
                                    Statics.field129 = Statics.field416;
                                } else {
                                    Statics.field129 = Statics.field525;
                                }
                                field679++;
                                field791 = 0;
                            } else {
                                method3194(-3);
                            }
                        }
                    }
                } else if (var1.method3249() >= field690.field1307) {
                    var2.field3707 = 0;
                    var1.method3247(var2.field3708, 0, field690.field1307);
                    field694.method4669();
                    field656 = 1L;
                    Statics.field10.field584 = 0;
                    Statics.field1524 = true;
                    field660 = true;
                    field867 = -1L;
                    class97.method1027();
                    field690.method2069();
                    field690.field1305.field3707 = 0;
                    field690.field1310 = null;
                    field690.field1300 = null;
                    field690.field1312 = null;
                    field690.field1313 = null;
                    field690.field1307 = 0;
                    field690.field1306 = 0;
                    field662 = 0;
                    field870 = 0;
                    field663 = 0;
                    method3317();
                    class55.method43(0);
                    class92.method528();
                    field802 = 0;
                    field798 = false;
                    field770 = 0;
                    field713 = 0;
                    field918 = 0;
                    Statics.field3211 = null;
                    field875 = 0;
                    field868 = -1;
                    field873 = 0;
                    field874 = 0;
                    field882 = class85.field1168;
                    field731 = class85.field1168;
                    field739 = 0;
                    class90.method658();
                    for (int var39 = 0; var39 < 2048; var39++) {
                        field759[var39] = null;
                    }
                    for (int var40 = 0; var40 < 32768; var40++) {
                        field685[var40] = null;
                    }
                    field745 = -1;
                    field773.method4578();
                    field693.method4578();
                    for (int var41 = 0; var41 < 4; var41++) {
                        for (int var42 = 0; var42 < 104; var42++) {
                            for (int var43 = 0; var43 < 104; var43++) {
                                field771[var41][var42][var43] = null;
                            }
                        }
                    }
                    field772 = new class262();
                    Statics.field1745.method1696();
                    for (int var44 = 0; var44 < Statics.field3214; var44++) {
                        class241 var45 = class241.method3998(var44);
                        if (var45 != null) {
                            class213.field2530[var44] = 0;
                            class213.field2531[var44] = 0;
                        }
                    }
                    Statics.field1167.method1980();
                    field813 = -1;
                    if (field725 != -1) {
                        class218.method2057(field725);
                    }
                    for (class62 var46 = (class62) field804.method5551(); var46 != null; var46 = (class62) field804.method5556()) {
                        method663(var46, true);
                    }
                    field725 = -1;
                    field804 = new class318(8);
                    field779 = null;
                    method3317();
                    field906.method3707((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var47 = 0; var47 < 8; var47++) {
                        field756[var47] = null;
                        field768[var47] = false;
                    }
                    class60.field543 = new class318(32);
                    field654 = true;
                    for (int var48 = 0; var48 < 100; var48++) {
                        field848[var48] = true;
                    }
                    class188 var49 = class188.method3035(class184.field2219, field690.field1311);
                    var49.field2347.method5290(method673());
                    var49.field2347.method5123(Statics.field1873);
                    var49.field2347.method5123(Statics.field310);
                    field690.method2071(var49);
                    Statics.field567 = null;
                    for (int var50 = 0; var50 < 8; var50++) {
                        field910[var50] = new class10();
                    }
                    Statics.field1436 = null;
                    class90.method3183(var2);
                    Statics.field2087 = -1;
                    method495(false, var2);
                    field690.field1310 = null;
                }
            }
        } catch (IOException var62) {
            if (field679 < 1) {
                if (Statics.field525 == Statics.field129) {
                    Statics.field129 = Statics.field416;
                } else {
                    Statics.field129 = Statics.field525;
                }
                field679++;
                field791 = 0;
            } else {
                method3194(-2);
            }
        }
    }

    @ObfuscatedName("fc.fm(IB)V")
    public static void method3194(int arg0) {
        if (arg0 == -3) {
            class86.method2089(class225.field2986, class225.field2815, class225.field2772);
        } else if (arg0 == -2) {
            class86.method2089(class225.field2927, class225.field2818, class225.field2819);
        } else if (arg0 == -1) {
            class86.method2089(class225.field2868, class225.field2821, class225.field2822);
        } else if (arg0 == 3) {
            class86.field1188 = 3;
            class86.field1187 = 1;
        } else if (arg0 == 4) {
            class86.field1188 = 12;
            class86.field1186 = 0;
        } else if (arg0 == 5) {
            class86.field1187 = 2;
            class86.method2089(class225.field2926, class225.field2827, class225.field2828);
        } else if (arg0 == 68 || !(field651 || arg0 != 6)) {
            class86.method2089(class225.field2790, class225.field2830, class225.field2831);
        } else if (arg0 == 7) {
            class86.method2089(class225.field2882, class225.field3053, class225.field2834);
        } else if (arg0 == 8) {
            class86.method2089(class225.field2936, class225.field2836, class225.field2837);
        } else if (arg0 == 9) {
            class86.method2089(class225.field2984, class225.field2816, class225.field2908);
        } else if (arg0 == 10) {
            class86.method2089(class225.field2841, class225.field2842, class225.field3014);
        } else if (arg0 == 11) {
            class86.method2089(class225.field2844, class225.field2879, class225.field2802);
        } else if (arg0 == 12) {
            class86.method2089(class225.field2847, class225.field3061, class225.field2801);
        } else if (arg0 == 13) {
            class86.method2089(class225.field2985, class225.field2943, class225.field2852);
        } else if (arg0 == 14) {
            class86.method2089(class225.field3039, class225.field2848, class225.field3042);
        } else if (arg0 == 16) {
            class86.method2089(class225.field2856, class225.field3069, class225.field3041);
        } else if (arg0 == 17) {
            class86.method2089(class225.field2941, class225.field2860, class225.field2861);
        } else if (arg0 == 18) {
            class86.field1188 = 12;
            class86.field1186 = 1;
        } else if (arg0 == 19) {
            class86.method2089(class225.field2865, class225.field2866, class225.field2867);
        } else if (arg0 == 20) {
            class86.method2089(class225.field2845, class225.field2835, class225.field2960);
        } else if (arg0 == 22) {
            class86.method2089(class225.field2871, class225.field2872, class225.field2873);
        } else if (arg0 == 23) {
            class86.method2089(class225.field2874, class225.field2851, class225.field2875);
        } else if (arg0 == 24) {
            class86.method2089(class225.field2980, class225.field2928, class225.field2854);
        } else if (arg0 == 25) {
            class86.method2089(class225.field2880, class225.field2933, class225.field2799);
        } else if (arg0 == 26) {
            class86.method2089(class225.field2813, class225.field2884, class225.field2885);
        } else if (arg0 == 27) {
            class86.method2089(class225.field2976, class225.field2887, class225.field2888);
        } else if (arg0 == 31) {
            class86.method2089(class225.field2895, class225.field2942, class225.field2934);
        } else if (arg0 == 32) {
            class86.method2089(class225.field2898, class225.field2899, class225.field2900);
        } else if (arg0 == 37) {
            class86.method2089(class225.field2901, class225.field2902, class225.field2903);
        } else if (arg0 == 38) {
            class86.method2089(class225.field2904, class225.field2771, class225.field2906);
        } else if (arg0 == 55) {
            class86.field1188 = 8;
        } else if (arg0 == 56) {
            class86.method2089(class225.field2911, class225.field2912, class225.field3064);
            method1897(11);
            return;
        } else if (arg0 == 57) {
            class86.method2089(class225.field2914, class225.field2896, class225.field2833);
            method1897(11);
            return;
        } else if (arg0 == 61) {
            class86.field1188 = 7;
        } else {
            class86.method2089(class225.field2917, class225.field2946, class225.field2919);
        }
        method1897(10);
    }

    @ObfuscatedName("az.fc(I)V")
    public static final void method633() {
        field690.method2073();
        class258.method134();
        class245.method3038();
        class246.method2055();
        class254.method1855();
        class257.method3814();
        class255.method579();
        class259.field3519.method3075();
        class259.field3520.method3075();
        class244.field3248.method3075();
        class244.field3247.method3075();
        class249.field3298.method3075();
        class241.method3407();
        class253.field3331.method3075();
        class253.field3332.method3075();
        class253.field3333.method3075();
        class247.method4021();
        class251.method2747();
        class250.method22();
        class242.method3047();
        class215.method3605();
        class218.method1870();
        ((class120) Statics.field1770).method2519();
        class93.field1278.method3075();
        Statics.field82.method3859();
        Statics.field375.method3859();
        Statics.field266.method3859();
        Statics.field2526.method3859();
        Statics.field2504.method3859();
        Statics.field162.method3859();
        Statics.field2322.method3859();
        Statics.field244.method3859();
        Statics.field11.method3859();
        Statics.field1146.method3859();
        Statics.field519.method3859();
        Statics.field3558.method3859();
        Statics.field3.method2844();
        for (int var0 = 0; var0 < 4; var0++) {
            field701[var0].method3281();
        }
        System.gc();
        class198.method3069(2);
        field886 = -1;
        field743 = false;
        for (class76 var1 = (class76) class76.field1074.method4568(); var1 != null; var1 = (class76) class76.field1074.method4561()) {
            if (var1.field1078 != null) {
                Statics.field2240.method2112(var1.field1078);
                var1.field1078 = null;
            }
            if (var1.field1080 != null) {
                Statics.field2240.method2112(var1.field1080);
                var1.field1080 = null;
            }
        }
        class76.field1074.method4578();
        method1897(10);
    }

    @ObfuscatedName("al.fz(II)V")
    public static final void method710(int arg0) {
        method633();
        switch(arg0) {
            case 1:
                class86.field1188 = 24;
                class86.method2089(class225.field3008, class225.field3009, class225.field3010);
                break;
            case 2:
                class86.field1188 = 24;
                class86.method2089(class225.field3005, class225.field3006, class225.field2797);
        }
    }

    @ObfuscatedName("ck.fi(I)V")
    public static final void method1938() {
        if (field870 > 0) {
            method633();
        } else {
            field694.method4662();
            method1897(40);
            Statics.field1414 = field690.method2075();
            field690.method2076();
        }
    }

    @ObfuscatedName("ax.fo(ZB)V")
    public static final void method721(boolean arg0) {
        if (arg0) {
            field681 = class86.field1197 ? class161.field2009 : class161.field2006;
            return;
        }
        LinkedHashMap var1 = Statics.field1978.field1052;
        String var2 = class86.field1193;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field681 = var1.containsKey(var4) ? class161.field2010 : class161.field2007;
    }

    @ObfuscatedName("client.fu(I)V")
    public final void method1160() {
        if (field662 > 1) {
            field662--;
        }
        if (field870 > 0) {
            field870--;
        }
        if (field692) {
            field692 = false;
            method1938();
            return;
        }
        if (!field876) {
            method20();
        }
        for (int var1 = 0; var1 < 100 && this.method1164(field690); var1++) {
        }
        if (field652 != 30) {
            return;
        }
        while (class97.method669()) {
            class188 var2 = class188.method3035(class184.field2284, field690.field1311);
            var2.field2347.method5290(0);
            int var3 = var2.field2347.field3707;
            class97.method3150(var2.field2347);
            var2.field2347.method5303(var2.field2347.field3707 - var3);
            field690.method2071(var2);
        }
        if (field694.field3582) {
            class188 var4 = class188.method3035(class184.field2303, field690.field1311);
            var4.field2347.method5290(0);
            int var5 = var4.field2347.field3707;
            field694.method4678(var4.field2347);
            var4.field2347.method5303(var4.field2347.field3707 - var5);
            field690.method2071(var4);
            field694.method4665();
        }
        Object var6 = Statics.field10.field583;
        synchronized (Statics.field10.field583) {
            if (!field832) {
                Statics.field10.field584 = 0;
            } else if (class55.field482 != 0 || Statics.field10.field584 >= 40) {
                class188 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field10.field584 && (var7 == null || var7.field2347.field3707 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field10.field582[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field10.field585[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field878 != var14 || field658 != var13) {
                        if (var7 == null) {
                            var7 = class188.method3035(class184.field2222, field690.field1311);
                            var7.field2347.method5290(0);
                            var8 = var7.field2347.field3707;
                            var7.field2347.field3707 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field659 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field878;
                            var16 = var13 - field658;
                            var17 = (int) ((Statics.field10.field587[var12] - field659) / 20L);
                            var10 = (int) ((Statics.field10.field587[var12] - field659) % 20L + (long) var10);
                        }
                        field878 = var14;
                        field658 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2347.method5123((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2347.method5290(var17 + 128);
                            var7.field2347.method5123((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2347.method5290(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2347.method5231(Integer.MIN_VALUE);
                            } else {
                                var7.field2347.method5231(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2347.method5123((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2347.method5231(Integer.MIN_VALUE);
                            } else {
                                var7.field2347.method5231(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field659 = Statics.field10.field587[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2347.method5303(var7.field2347.field3707 - var8);
                    int var18 = var7.field2347.field3707;
                    var7.field2347.field3707 = var8;
                    var7.field2347.method5290(var10 / var11);
                    var7.field2347.method5290(var10 % var11);
                    var7.field2347.field3707 = var18;
                    field690.method2071(var7);
                }
                if (var9 >= Statics.field10.field584) {
                    Statics.field10.field584 = 0;
                } else {
                    Statics.field10.field584 -= var9;
                    System.arraycopy(Statics.field10.field585, var9, Statics.field10.field585, 0, Statics.field10.field584);
                    System.arraycopy(Statics.field10.field582, var9, Statics.field10.field582, 0, Statics.field10.field584);
                    System.arraycopy(Statics.field10.field587, var9, Statics.field10.field587, 0, Statics.field10.field584);
                }
            }
        }
        if (class55.field482 == 1 || !Statics.field2055 && class55.field482 == 4 || class55.field482 == 2) {
            long var20 = (class55.field492 - field656 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field656 = class55.field492 * -1L;
            int var22 = class55.field491;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field310) {
                var22 = Statics.field310;
            }
            int var23 = class55.field490;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1873) {
                var23 = Statics.field1873;
            }
            int var24 = (int) var20;
            class188 var25 = class188.method3035(class184.field2225, field690.field1311);
            var25.field2347.method5123((class55.field482 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2347.method5123(var23);
            var25.field2347.method5123(var22);
            field690.method2071(var25);
        }
        if (class46.field399 > 0) {
            class188 var26 = class188.method3035(class184.field2282, field690.field1311);
            var26.field2347.method5123(0);
            int var27 = var26.field2347.field3707;
            long var28 = class297.method3217();
            for (int var30 = 0; var30 < class46.field399; var30++) {
                long var31 = var28 - field867;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field867 = var28;
                var26.field2347.method5164((int) var31);
                var26.field2347.method5311(class46.field379[var30]);
            }
            var26.field2347.method5134(var26.field2347.field3707 - var27);
            field690.method2071(var26);
        }
        if (field777 > 0) {
            field777--;
        }
        if (class46.field405[96] || class46.field405[97] || class46.field405[98] || class46.field405[99]) {
            field728 = true;
        }
        if (field728 && field777 <= 0) {
            field777 = 20;
            field728 = false;
            class188 var33 = class188.method3035(class184.field2296, field690.field1311);
            var33.field2347.method5175(field712);
            var33.field2347.method5123(field713);
            field690.method2071(var33);
        }
        if (Statics.field1524 && !field660) {
            field660 = true;
            class188 var34 = class188.method3035(class184.field2310, field690.field1311);
            var34.field2347.method5290(1);
            field690.method2071(var34);
        }
        if (!Statics.field1524 && field660) {
            field660 = false;
            class188 var35 = class188.method3035(class184.field2310, field690.field1311);
            var35.field2347.method5290(0);
            field690.method2071(var35);
        }
        if (Statics.field255 != null) {
            Statics.field255.method5856();
        }
        method3817();
        method137();
        if (field652 != 30) {
            return;
        }
        for (class69 var36 = (class69) field772.method4568(); var36 != null; var36 = (class69) field772.method4561()) {
            if (var36.field921 > 0) {
                var36.field921--;
            }
            if (var36.field921 == 0) {
                if (var36.field923 >= 0) {
                    int var37 = var36.field923;
                    int var38 = var36.field925;
                    class254 var39 = class254.method3048(var37);
                    if (var38 == 11) {
                        var38 = 10;
                    }
                    if (var38 >= 5 && var38 <= 8) {
                        var38 = 4;
                    }
                    boolean var40 = var39.method4286(var38);
                    if (!var40) {
                        continue;
                    }
                }
                method1591(var36.field922, var36.field920, var36.field919, var36.field932, var36.field923, var36.field930, var36.field925);
                var36.method3332();
            } else {
                if (var36.field929 > 0) {
                    var36.field929--;
                }
                if (var36.field929 == 0 && var36.field919 >= 1 && var36.field932 >= 1 && var36.field919 <= 102 && var36.field932 <= 102) {
                    if (var36.field924 >= 0) {
                        int var41 = var36.field924;
                        int var42 = var36.field928;
                        class254 var43 = class254.method3048(var41);
                        if (var42 == 11) {
                            var42 = 10;
                        }
                        if (var42 >= 5 && var42 <= 8) {
                            var42 = 4;
                        }
                        boolean var44 = var43.method4286(var42);
                        if (!var44) {
                            continue;
                        }
                    }
                    method1591(var36.field922, var36.field920, var36.field919, var36.field932, var36.field924, var36.field927, var36.field928);
                    var36.field929 = -1;
                    if (var36.field924 == var36.field923 && var36.field923 == -1) {
                        var36.method3332();
                    } else if (var36.field924 == var36.field923 && var36.field930 == var36.field927 && var36.field928 == var36.field925) {
                        var36.method3332();
                    }
                }
            }
        }
        method1894();
        field690.field1306++;
        if (field690.field1306 > 750) {
            method1938();
            return;
        }
        method1895();
        method63();
        int[] var45 = class90.field1251;
        for (int var46 = 0; var46 < class90.field1250; var46++) {
            class67 var47 = field759[var45[var46]];
            if (var47 != null && var47.field952 > 0) {
                var47.field952--;
                if (var47.field952 == 0) {
                    var47.field949 = null;
                }
            }
        }
        for (int var48 = 0; var48 < field739; var48++) {
            int var49 = field764[var48];
            class80 var50 = field685[var49];
            if (var50 != null && var50.field952 > 0) {
                var50.field952--;
                if (var50.field952 == 0) {
                    var50.field949 = null;
                }
            }
        }
        field705++;
        if (field719 != 0) {
            field746 += 20;
            if (field746 >= 400) {
                field719 = 0;
            }
        }
        if (Statics.field433 != null) {
            field665++;
            if (field665 >= 15) {
                method1052(Statics.field433);
                Statics.field433 = null;
            }
        }
        class218 var51 = Statics.field2339;
        class218 var52 = Statics.field32;
        Statics.field2339 = null;
        Statics.field32 = null;
        field820 = null;
        field824 = false;
        field821 = false;
        field890 = 0;
        while (class46.method4034() && field890 < 128) {
            if (field812 >= 2 && class46.field405[82] && Statics.field419 == 66) {
                String var53 = "";
                Iterator var54 = class92.field1269.iterator();
                while (var54.hasNext()) {
                    class65 var55 = (class65) var54.next();
                    var53 = var53 + var55.field603 + ':' + var55.field600 + '\n';
                }
                Statics.field302.method783(var53);
            } else if (field918 != 1 || Statics.field3700 <= 0) {
                field866[field890] = Statics.field419;
                field865[field890] = Statics.field3700;
                field890++;
            }
        }
        if (method234() && class46.field405[82] && class46.field405[81] && field841 != 0) {
            int var58 = Statics.field2558.field627 - field841;
            if (var58 < 0) {
                var58 = 0;
            } else if (var58 > 3) {
                var58 = 3;
            }
            if (Statics.field2558.field627 != var58) {
                method3239(Statics.field429 + Statics.field2558.field991[0], Statics.field3244 + Statics.field2558.field956[0], var58, false);
            }
            field841 = 0;
        }
        if (field725 != -1) {
            method2053(field725, 0, 0, Statics.field1873, Statics.field310, 0, 0);
        }
        field828++;
        while (true) {
            class63 var59;
            class218 var60;
            class218 var61;
            do {
                var59 = (class63) field901.method4566();
                if (var59 == null) {
                    while (true) {
                        class63 var62;
                        class218 var63;
                        class218 var64;
                        do {
                            var62 = (class63) field844.method4566();
                            if (var62 == null) {
                                while (true) {
                                    class63 var65;
                                    class218 var66;
                                    class218 var67;
                                    do {
                                        var65 = (class63) field842.method4566();
                                        if (var65 == null) {
                                            this.method1311();
                                            if (Statics.field255 != null) {
                                                Statics.field255.method5861(Statics.field2321, (Statics.field2558.field992 >> 7) + Statics.field429, (Statics.field2558.field936 >> 7) + Statics.field3244, false);
                                                Statics.field255.method5882();
                                            }
                                            if (field816 != null) {
                                                this.method1333();
                                            }
                                            if (Statics.field410 != null) {
                                                method1052(Statics.field410);
                                                field912++;
                                                if (class55.field489 == 0) {
                                                    if (field755) {
                                                        if (Statics.field410 == Statics.field3508 && field754 != field751) {
                                                            class218 var68 = Statics.field410;
                                                            byte var69 = 0;
                                                            if (field808 == 1 && var68.field2582 == 206) {
                                                                var69 = 1;
                                                            }
                                                            if (var68.field2630[field754] <= 0) {
                                                                var69 = 0;
                                                            }
                                                            int var70 = method1899(var68);
                                                            boolean var71 = (var70 >> 29 & 0x1) != 0;
                                                            if (var71) {
                                                                int var72 = field751;
                                                                int var73 = field754;
                                                                var68.field2630[var73] = var68.field2630[var72];
                                                                var68.field2703[var73] = var68.field2703[var72];
                                                                var68.field2630[var72] = -1;
                                                                var68.field2703[var72] = 0;
                                                            } else if (var69 == 1) {
                                                                int var74 = field751;
                                                                int var75 = field754;
                                                                while (var74 != var75) {
                                                                    if (var74 > var75) {
                                                                        var68.method3748(var74 - 1, var74);
                                                                        var74--;
                                                                    } else if (var74 < var75) {
                                                                        var68.method3748(var74 + 1, var74);
                                                                        var74++;
                                                                    }
                                                                }
                                                            } else {
                                                                var68.method3748(field754, field751);
                                                            }
                                                            class188 var76 = class188.method3035(class184.field2272, field690.field1311);
                                                            var76.field2347.method5184(Statics.field410.field2578);
                                                            var76.field2347.method5290(var69);
                                                            var76.field2347.method5175(field754);
                                                            var76.field2347.method5173(field751);
                                                            field690.method2071(var76);
                                                        }
                                                    } else if (this.method1166()) {
                                                        this.method1172(field752, field753);
                                                    } else if (field780 > 0) {
                                                        int var77 = field752;
                                                        int var78 = field753;
                                                        method3378(Statics.field503, var77, var78);
                                                        Statics.field503 = null;
                                                    }
                                                    field665 = 10;
                                                    class55.field482 = 0;
                                                    Statics.field410 = null;
                                                } else if (field912 >= 5 && (class55.field473 > field752 + 5 || class55.field473 < field752 - 5 || class55.field483 > field753 + 5 || class55.field483 < field753 - 5)) {
                                                    field755 = true;
                                                }
                                            }
                                            if (class134.method2881()) {
                                                int var79 = class134.field1827;
                                                int var80 = class134.field1798;
                                                class188 var81 = class188.method3035(class184.field2267, field690.field1311);
                                                var81.field2347.method5290(5);
                                                var81.field2347.method5173(Statics.field429 + var79);
                                                var81.field2347.method5165(class46.field405[82] ? (class46.field405[81] ? 2 : 1) : 0);
                                                var81.field2347.method5173(Statics.field3244 + var80);
                                                field690.method2071(var81);
                                                class134.method2882();
                                                field744 = class55.field490;
                                                field649 = class55.field491;
                                                field719 = 1;
                                                field746 = 0;
                                                field873 = var79;
                                                field874 = var80;
                                            }
                                            if (Statics.field2339 != var51) {
                                                if (var51 != null) {
                                                    method1052(var51);
                                                }
                                                if (Statics.field2339 != null) {
                                                    method1052(Statics.field2339);
                                                }
                                            }
                                            if (Statics.field32 != var52 && field769 == field644) {
                                                if (var52 != null) {
                                                    method1052(var52);
                                                }
                                                if (Statics.field32 != null) {
                                                    method1052(Statics.field32);
                                                }
                                            }
                                            if (Statics.field32 == null) {
                                                if (field644 > 0) {
                                                    field644--;
                                                }
                                            } else if (field644 < field769) {
                                                field644++;
                                                if (field769 == field644) {
                                                    method1052(Statics.field32);
                                                }
                                            }
                                            if (field918 == 0) {
                                                int var82 = Statics.field2558.field992;
                                                int var83 = Statics.field2558.field936;
                                                if (Statics.field1136 - var82 < -500 || Statics.field1136 - var82 > 500 || Statics.field1145 - var83 < -500 || Statics.field1145 - var83 > 500) {
                                                    Statics.field1136 = var82;
                                                    Statics.field1145 = var83;
                                                }
                                                if (Statics.field1136 != var82) {
                                                    Statics.field1136 += (var82 - Statics.field1136) / 16;
                                                }
                                                if (Statics.field1145 != var83) {
                                                    Statics.field1145 += (var83 - Statics.field1145) / 16;
                                                }
                                                int var84 = Statics.field1136 >> 7;
                                                int var85 = Statics.field1145 >> 7;
                                                int var86 = method3406(Statics.field1136, Statics.field1145, Statics.field2321);
                                                int var87 = 0;
                                                if (var84 > 3 && var85 > 3 && var84 < 100 && var85 < 100) {
                                                    for (int var88 = var84 - 4; var88 <= var84 + 4; var88++) {
                                                        for (int var89 = var85 - 4; var89 <= var85 + 4; var89++) {
                                                            int var90 = Statics.field2321;
                                                            if (var90 < 3 && (class56.field513[1][var88][var89] & 0x2) == 2) {
                                                                var90++;
                                                            }
                                                            int var91 = var86 - class56.field496[var90][var88][var89];
                                                            if (var91 > var87) {
                                                                var87 = var91;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var92 = var87 * 192;
                                                if (var92 > 98048) {
                                                    var92 = 98048;
                                                }
                                                if (var92 < 32768) {
                                                    var92 = 32768;
                                                }
                                                if (var92 > field729) {
                                                    field729 += (var92 - field729) / 24;
                                                } else if (var92 < field729) {
                                                    field729 += (var92 - field729) / 80;
                                                }
                                                Statics.field79 = method3406(Statics.field2558.field992, Statics.field2558.field936, Statics.field2321) - field758;
                                            } else if (field918 == 1) {
                                                method3227();
                                                short var93 = -1;
                                                if (class46.field405[33]) {
                                                    var93 = 0;
                                                } else if (class46.field405[49]) {
                                                    var93 = 1024;
                                                }
                                                if (class46.field405[48]) {
                                                    if (var93 == 0) {
                                                        var93 = 1792;
                                                    } else if (var93 == 1024) {
                                                        var93 = 1280;
                                                    } else {
                                                        var93 = 1536;
                                                    }
                                                } else if (class46.field405[50]) {
                                                    if (var93 == 0) {
                                                        var93 = 256;
                                                    } else if (var93 == 1024) {
                                                        var93 = 768;
                                                    } else {
                                                        var93 = 512;
                                                    }
                                                }
                                                byte var94 = 0;
                                                if (class46.field405[35]) {
                                                    var94 = -1;
                                                } else if (class46.field405[51]) {
                                                    var94 = 1;
                                                }
                                                int var95 = 0;
                                                if (var93 >= 0 || var94 != 0) {
                                                    int var96 = class46.field405[81] ? field724 : field723;
                                                    var95 = var96 * 16;
                                                    field721 = var93;
                                                    field819 = var94;
                                                }
                                                if (field698 < var95) {
                                                    field698 += var95 / 8;
                                                    if (field698 > var95) {
                                                        field698 = var95;
                                                    }
                                                } else if (field698 > var95) {
                                                    field698 = field698 * 9 / 10;
                                                }
                                                if (field698 > 0) {
                                                    int var97 = field698 / 16;
                                                    if (field721 >= 0) {
                                                        int var98 = field721 - Statics.field1456 & 0x7FF;
                                                        int var99 = class131.field1773[var98];
                                                        int var100 = class131.field1774[var98];
                                                        Statics.field1136 += var97 * var99 / 65536;
                                                        Statics.field1145 += var97 * var100 / 65536;
                                                    }
                                                    if (field819 != 0) {
                                                        Statics.field79 += field819 * var97;
                                                        if (Statics.field79 > 0) {
                                                            Statics.field79 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field721 = -1;
                                                    field819 = -1;
                                                }
                                                if (class46.field405[13]) {
                                                    method188();
                                                }
                                            }
                                            if (class55.field489 == 4 && Statics.field2055) {
                                                int var101 = class55.field483 - field717;
                                                field715 = var101 * 2;
                                                field717 = var101 == -1 || var101 == 1 ? class55.field483 : (field717 + class55.field483) / 2;
                                                int var102 = field716 - class55.field473;
                                                field714 = var102 * 2;
                                                field716 = var102 == -1 || var102 == 1 ? class55.field473 : (field716 + class55.field473) / 2;
                                            } else {
                                                if (class46.field405[96]) {
                                                    field714 += (-24 - field714) / 2;
                                                } else if (class46.field405[97]) {
                                                    field714 += (24 - field714) / 2;
                                                } else {
                                                    field714 /= 2;
                                                }
                                                if (class46.field405[98]) {
                                                    field715 += (12 - field715) / 2;
                                                } else if (class46.field405[99]) {
                                                    field715 += (-12 - field715) / 2;
                                                } else {
                                                    field715 /= 2;
                                                }
                                                field717 = class55.field483;
                                                field716 = class55.field473;
                                            }
                                            field713 = field714 / 2 + field713 & 0x7FF;
                                            field712 += field715 / 2;
                                            if (field712 < 128) {
                                                field712 = 128;
                                            }
                                            if (field712 > 383) {
                                                field712 = 383;
                                            }
                                            if (field887) {
                                                int var103 = Statics.field926 * 128 + 64;
                                                int var104 = Statics.field640 * 128 + 64;
                                                int var105 = method3406(var103, var104, Statics.field2321) - Statics.field300;
                                                if (Statics.field261 < var103) {
                                                    Statics.field261 += Statics.field1991 * (var103 - Statics.field261) / 1000 + Statics.field1934;
                                                    if (Statics.field261 > var103) {
                                                        Statics.field261 = var103;
                                                    }
                                                }
                                                if (Statics.field261 > var103) {
                                                    Statics.field261 -= Statics.field1991 * (Statics.field261 - var103) / 1000 + Statics.field1934;
                                                    if (Statics.field261 < var103) {
                                                        Statics.field261 = var103;
                                                    }
                                                }
                                                if (Statics.field1932 < var105) {
                                                    Statics.field1932 += Statics.field1991 * (var105 - Statics.field1932) / 1000 + Statics.field1934;
                                                    if (Statics.field1932 > var105) {
                                                        Statics.field1932 = var105;
                                                    }
                                                }
                                                if (Statics.field1932 > var105) {
                                                    Statics.field1932 -= Statics.field1991 * (Statics.field1932 - var105) / 1000 + Statics.field1934;
                                                    if (Statics.field1932 < var105) {
                                                        Statics.field1932 = var105;
                                                    }
                                                }
                                                if (Statics.field1610 < var104) {
                                                    Statics.field1610 += Statics.field1991 * (var104 - Statics.field1610) / 1000 + Statics.field1934;
                                                    if (Statics.field1610 > var104) {
                                                        Statics.field1610 = var104;
                                                    }
                                                }
                                                if (Statics.field1610 > var104) {
                                                    Statics.field1610 -= Statics.field1991 * (Statics.field1610 - var104) / 1000 + Statics.field1934;
                                                    if (Statics.field1610 < var104) {
                                                        Statics.field1610 = var104;
                                                    }
                                                }
                                                int var106 = Statics.field418 * 128 + 64;
                                                int var107 = Statics.field1243 * 128 + 64;
                                                int var108 = method3406(var106, var107, Statics.field2321) - Statics.field309;
                                                int var109 = var106 - Statics.field261;
                                                int var110 = var108 - Statics.field1932;
                                                int var111 = var107 - Statics.field1610;
                                                int var112 = (int) Math.sqrt((double) (var109 * var109 + var111 * var111));
                                                int var113 = (int) (Math.atan2((double) var110, (double) var112) * 325.949D) & 0x7FF;
                                                int var114 = (int) (Math.atan2((double) var109, (double) var111) * -325.949D) & 0x7FF;
                                                if (var113 < 128) {
                                                    var113 = 128;
                                                }
                                                if (var113 > 383) {
                                                    var113 = 383;
                                                }
                                                if (Statics.field542 < var113) {
                                                    Statics.field542 += Statics.field1999 * (var113 - Statics.field542) / 1000 + Statics.field3644;
                                                    if (Statics.field542 > var113) {
                                                        Statics.field542 = var113;
                                                    }
                                                }
                                                if (Statics.field542 > var113) {
                                                    Statics.field542 -= Statics.field1999 * (Statics.field542 - var113) / 1000 + Statics.field3644;
                                                    if (Statics.field542 < var113) {
                                                        Statics.field542 = var113;
                                                    }
                                                }
                                                int var115 = var114 - Statics.field1456;
                                                if (var115 > 1024) {
                                                    var115 -= 2048;
                                                }
                                                if (var115 < -1024) {
                                                    var115 += 2048;
                                                }
                                                if (var115 > 0) {
                                                    Statics.field1456 += Statics.field1999 * var115 / 1000 + Statics.field3644;
                                                    Statics.field1456 &= 0x7FF;
                                                }
                                                if (var115 < 0) {
                                                    Statics.field1456 -= Statics.field1999 * -var115 / 1000 + Statics.field3644;
                                                    Statics.field1456 &= 0x7FF;
                                                }
                                                int var116 = var114 - Statics.field1456;
                                                if (var116 > 1024) {
                                                    var116 -= 2048;
                                                }
                                                if (var116 < -1024) {
                                                    var116 += 2048;
                                                }
                                                if (var116 < 0 && var115 > 0 || var116 > 0 && var115 < 0) {
                                                    Statics.field1456 = var114;
                                                }
                                            }
                                            for (int var117 = 0; var117 < 5; var117++) {
                                                int var10002 = field892[var117]++;
                                            }
                                            Statics.field1167.method1984();
                                            int var118 = ++class55.field476 - 1;
                                            int var120 = class46.field392;
                                            if (var118 > 15000 && var120 > 15000) {
                                                field870 = 250;
                                                class55.method43(14500);
                                                class188 var122 = class188.method3035(class184.field2235, field690.field1311);
                                                field690.method2071(var122);
                                            }
                                            Statics.field1745.method1689();
                                            field690.field1303++;
                                            if (field690.field1303 > 50) {
                                                class188 var123 = class188.method3035(class184.field2279, field690.field1311);
                                                field690.method2071(var123);
                                            }
                                            try {
                                                field690.method2070();
                                            } catch (IOException var125) {
                                                method1938();
                                            }
                                            return;
                                        }
                                        var66 = var65.field570;
                                        if (var66.field2579 < 0) {
                                            break;
                                        }
                                        var67 = class218.method3387(var66.field2597);
                                    } while (var67 == null || var67.field2708 == null || var66.field2579 >= var67.field2708.length || var67.field2708[var66.field2579] != var66);
                                    class77.method371(var65);
                                }
                            }
                            var63 = var62.field570;
                            if (var63.field2579 < 0) {
                                break;
                            }
                            var64 = class218.method3387(var63.field2597);
                        } while (var64 == null || var64.field2708 == null || var63.field2579 >= var64.field2708.length || var64.field2708[var63.field2579] != var63);
                        class77.method371(var62);
                    }
                }
                var60 = var59.field570;
                if (var60.field2579 < 0) {
                    break;
                }
                var61 = class218.method3387(var60.field2597);
            } while (var61 == null || var61.field2708 == null || var60.field2579 >= var61.field2708.length || var61.field2708[var60.field2579] != var60);
            class77.method371(var59);
        }
    }

    @ObfuscatedName("bu.fs(I)V")
    public static final void method1008() {
        if (Statics.field553 != null) {
            Statics.field553.method2236();
        }
        if (Statics.field1155 != null) {
            Statics.field1155.method2236();
        }
    }

    @ObfuscatedName("cl.fk(I)V")
    public static final void method1894() {
        for (int var0 = 0; var0 < field770; var0++) {
            int var10002 = field884[var0]--;
            if (field884[var0] >= -10) {
                class102 var2 = field900[var0];
                if (var2 == null) {
                    class102 var10000 = (class102) null;
                    var2 = class102.method2165(Statics.field2526, field893[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field884[var0] += var2.method2164();
                    field900[var0] = var2;
                }
                if (field884[var0] < 0) {
                    int var9;
                    if (field885[var0] == 0) {
                        var9 = field879;
                    } else {
                        int var3 = (field885[var0] & 0xFF) * 128;
                        int var4 = field885[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2558.field992;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field885[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2558.field936;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field884[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field792 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class104 var10 = var2.method2163().method2209(Statics.field1023);
                        class114 var11 = class114.method2358(var10, 100, var9);
                        var11.method2341(field668[var0] - 1);
                        Statics.field2240.method2113(var11);
                    }
                    field884[var0] = -100;
                }
            } else {
                field770--;
                for (int var1 = var0; var1 < field770; var1++) {
                    field893[var1] = field893[var1 + 1];
                    field900[var1] = field900[var1 + 1];
                    field668[var1] = field668[var1 + 1];
                    field884[var1] = field884[var1 + 1];
                    field885[var1] = field885[var1 + 1];
                }
                var0--;
            }
        }
        if (!field743) {
            return;
        }
        boolean var12;
        if (class198.field2412 == 0) {
            var12 = Statics.field1879.method3524();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field767 != 0 && field886 != -1) {
                class198.method1088(Statics.field162, field886, 0, field767, false);
            }
            field743 = false;
        }
    }

    @ObfuscatedName("fr.fp(IIII)V")
    public static void method3229(int arg0, int arg1, int arg2) {
        if (field879 == 0 || arg1 == 0 || field770 >= 50) {
            return;
        }
        field893[field770] = arg0;
        field668[field770] = arg1;
        field884[field770] = arg2;
        field900[field770] = null;
        field885[field770] = 0;
        field770++;
    }

    @ObfuscatedName("co.fq(II)V")
    public static void method1902(int arg0) {
        if (arg0 == -1 && !field743) {
            class198.method2546();
        } else if (arg0 != -1 && field886 != arg0 && field767 != 0 && !field743) {
            class198.method1639(2, Statics.field162, arg0, 0, field767, false);
        }
        field886 = arg0;
    }

    @ObfuscatedName("bx.fh(III)V")
    public static void method959(int arg0, int arg1) {
        if (field767 != 0 && arg0 != -1) {
            class198.method1088(Statics.field519, arg0, 0, field767, false);
            field743 = true;
        }
    }

    @ObfuscatedName("ht.fy(B)V")
    public static final void method3817() {
        if (!Statics.field264) {
            return;
        }
        if (Statics.field567 != null) {
            Statics.field567.method4758();
        }
        for (int var0 = 0; var0 < class90.field1250; var0++) {
            class67 var1 = field759[class90.field1251[var0]];
            var1.method1125();
        }
        Statics.field264 = false;
    }

    @ObfuscatedName("x.fg(I)V")
    public static final void method137() {
        if (Statics.field2321 != field868) {
            field868 = Statics.field2321;
            method1568(Statics.field2321);
        }
    }

    @ObfuscatedName("ew.fn(Lhl;III)V")
    public static final void method3064(class218 arg0, int arg1, int arg2) {
        if (field875 != 0 && field875 != 3 || field876 || !(class55.field482 == 1 || !Statics.field2055 && class55.field482 == 4)) {
            return;
        }
        class212 var3 = arg0.method3745(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field490 - arg1;
        int var5 = class55.field491 - arg2;
        if (!var3.method3660(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2522 / 2;
        int var7 = var5 - var3.field2523 / 2;
        int var8 = field713 & 0x7FF;
        int var9 = class131.field1773[var8];
        int var10 = class131.field1774[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2558.field992 + var11 >> 7;
        int var14 = Statics.field2558.field936 - var12 >> 7;
        class188 var15 = class188.method3035(class184.field2283, field690.field1311);
        var15.field2347.method5290(18);
        var15.field2347.method5173(Statics.field429 + var13);
        var15.field2347.method5165(class46.field405[82] ? (class46.field405[81] ? 2 : 1) : 0);
        var15.field2347.method5173(Statics.field3244 + var14);
        var15.field2347.method5290(var6);
        var15.field2347.method5290(var7);
        var15.field2347.method5123(field713);
        var15.field2347.method5290(57);
        var15.field2347.method5290(0);
        var15.field2347.method5290(0);
        var15.field2347.method5290(89);
        var15.field2347.method5123(Statics.field2558.field992);
        var15.field2347.method5123(Statics.field2558.field936);
        var15.field2347.method5290(63);
        field690.method2071(var15);
        field873 = var13;
        field874 = var14;
    }

    @ObfuscatedName("e.fa(Ljava/lang/String;I)V")
    public static final void method155(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1978.field1055 = !Statics.field1978.field1055;
            class74.method650();
            if (Statics.field1978.field1055) {
                class92.method151(99, "", "Roofs are now all hidden");
            } else {
                class92.method151(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field661 = !field661;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field762 = !field762;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field710 = !field710;
        }
        if (field812 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field255.field3988 = !Statics.field255.field3988;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field661 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field661 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1938();
            }
        }
        class188 var1 = class188.method3035(class184.field2247, field690.field1311);
        var1.field2347.method5290(arg0.length() + 1);
        var1.field2347.method5129(arg0);
        field690.method2071(var1);
    }

    @ObfuscatedName("cl.ff(I)V")
    public static final void method1895() {
        int var0 = class90.field1250;
        int[] var1 = class90.field1251;
        for (int var2 = 0; var2 < var0; var2++) {
            class67 var3 = field759[var1[var2]];
            if (var3 != null) {
                method38(var3, 1);
            }
        }
    }

    @ObfuscatedName("h.fd(I)V")
    public static final void method63() {
        for (int var0 = 0; var0 < field739; var0++) {
            int var1 = field764[var0];
            class80 var2 = field685[var1];
            if (var2 != null) {
                method38(var2, var2.field1126.field3490);
            }
        }
    }

    @ObfuscatedName("g.ft(Lbt;II)V")
    public static final void method38(class70 arg0, int arg1) {
        if (arg0.field935 > field655) {
            method3160(arg0);
        } else if (arg0.field983 >= field655) {
            method583(arg0);
        } else {
            arg0.field985 = arg0.field986;
            if (arg0.field967 == 0) {
                arg0.field977 = 0;
            } else {
                label418: {
                    if (arg0.field990 != -1 && arg0.field971 == 0) {
                        class259 var2 = class259.method154(arg0.field990);
                        if (arg0.field995 > 0 && var2.field3532 == 0) {
                            arg0.field977++;
                            break label418;
                        }
                        if (arg0.field995 <= 0 && var2.field3516 == 0) {
                            arg0.field977++;
                            break label418;
                        }
                    }
                    int var3 = arg0.field992;
                    int var4 = arg0.field936;
                    int var5 = arg0.field991[arg0.field967 - 1] * 128 + arg0.field939 * 64;
                    int var6 = arg0.field956[arg0.field967 - 1] * 128 + arg0.field939 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field987 = 1280;
                        } else if (var4 > var6) {
                            arg0.field987 = 1792;
                        } else {
                            arg0.field987 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field987 = 768;
                        } else if (var4 > var6) {
                            arg0.field987 = 256;
                        } else {
                            arg0.field987 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field987 = 1024;
                    } else if (var4 > var6) {
                        arg0.field987 = 0;
                    }
                    byte var7 = arg0.field993[arg0.field967 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field987 - arg0.field937 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field945;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field944;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field964;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field946;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field944;
                        }
                        arg0.field985 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class80) {
                            var11 = ((class80) arg0).field1126.field3473;
                        }
                        if (var11) {
                            if (arg0.field987 != arg0.field937 && arg0.field962 == -1 && arg0.field989 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field967 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field967 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field977 > 0 && arg0.field967 > 1) {
                                var10 = 8;
                                arg0.field977--;
                            }
                        } else {
                            if (arg0.field967 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field967 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field977 > 0 && arg0.field967 > 1) {
                                var10 = 8;
                                arg0.field977--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field985 == arg0.field944 && arg0.field948 != -1) {
                            arg0.field985 = arg0.field948;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field992 += var10;
                                if (arg0.field992 > var5) {
                                    arg0.field992 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field992 -= var10;
                                if (arg0.field992 < var5) {
                                    arg0.field992 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field936 += var10;
                                if (arg0.field936 > var6) {
                                    arg0.field936 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field936 -= var10;
                                if (arg0.field936 < var6) {
                                    arg0.field936 = var6;
                                }
                            }
                        }
                        if (arg0.field992 == var5 && arg0.field936 == var6) {
                            arg0.field967--;
                            if (arg0.field995 > 0) {
                                arg0.field995--;
                            }
                        }
                    } else {
                        arg0.field992 = var5;
                        arg0.field936 = var6;
                        arg0.field967--;
                        if (arg0.field995 > 0) {
                            arg0.field995--;
                        }
                    }
                }
            }
        }
        if (arg0.field992 < 128 || arg0.field936 < 128 || arg0.field992 >= 13184 || arg0.field936 >= 13184) {
            arg0.field990 = -1;
            arg0.field973 = -1;
            arg0.field935 = 0;
            arg0.field983 = 0;
            arg0.field992 = arg0.field991[0] * 128 + arg0.field939 * 64;
            arg0.field936 = arg0.field956[0] * 128 + arg0.field939 * 64;
            arg0.method1579();
        }
        if (Statics.field2558 == arg0 && (arg0.field992 < 1536 || arg0.field936 < 1536 || arg0.field992 >= 11776 || arg0.field936 >= 11776)) {
            arg0.field990 = -1;
            arg0.field973 = -1;
            arg0.field935 = 0;
            arg0.field983 = 0;
            arg0.field992 = arg0.field991[0] * 128 + arg0.field939 * 64;
            arg0.field936 = arg0.field956[0] * 128 + arg0.field939 * 64;
            arg0.method1579();
        }
        if (arg0.field989 != 0) {
            if (arg0.field962 != -1) {
                class70 var12 = null;
                if (arg0.field962 < 32768) {
                    var12 = field685[arg0.field962];
                } else if (arg0.field962 >= 32768) {
                    var12 = field759[arg0.field962 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field992 - var12.field992;
                    int var14 = arg0.field936 - var12.field936;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field987 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field963) {
                    arg0.field962 = -1;
                    arg0.field963 = false;
                }
            }
            if (arg0.field966 != -1 && (arg0.field967 == 0 || arg0.field977 > 0)) {
                arg0.field987 = arg0.field966;
                arg0.field966 = -1;
            }
            int var15 = arg0.field987 - arg0.field937 & 0x7FF;
            if (var15 == 0 && arg0.field963) {
                arg0.field962 = -1;
                arg0.field963 = false;
            }
            if (var15 == 0) {
                arg0.field988 = 0;
            } else {
                arg0.field988++;
                if (var15 > 1024) {
                    arg0.field937 -= arg0.field989;
                    boolean var16 = true;
                    if (var15 < arg0.field989 || var15 > 2048 - arg0.field989) {
                        arg0.field937 = arg0.field987;
                        var16 = false;
                    }
                    if (arg0.field986 == arg0.field985 && (arg0.field988 > 25 || var16)) {
                        if (arg0.field942 == -1) {
                            arg0.field985 = arg0.field944;
                        } else {
                            arg0.field985 = arg0.field942;
                        }
                    }
                } else {
                    arg0.field937 += arg0.field989;
                    boolean var17 = true;
                    if (var15 < arg0.field989 || var15 > 2048 - arg0.field989) {
                        arg0.field937 = arg0.field987;
                        var17 = false;
                    }
                    if (arg0.field986 == arg0.field985 && (arg0.field988 > 25 || var17)) {
                        if (arg0.field943 == -1) {
                            arg0.field985 = arg0.field944;
                        } else {
                            arg0.field985 = arg0.field943;
                        }
                    }
                }
                arg0.field937 &= 0x7FF;
            }
        }
        arg0.field938 = false;
        if (arg0.field985 != -1) {
            class259 var19 = class259.method154(arg0.field985);
            if (var19 == null || var19.field3521 == null) {
                arg0.field985 = -1;
            } else {
                arg0.field978++;
                if (arg0.field996 < var19.field3521.length && arg0.field978 > var19.field3523[arg0.field996]) {
                    arg0.field978 = 1;
                    arg0.field996++;
                    Statics.method1045(var19, arg0.field996, arg0.field992, arg0.field936);
                }
                if (arg0.field996 >= var19.field3521.length) {
                    arg0.field978 = 0;
                    arg0.field996 = 0;
                    Statics.method1045(var19, arg0.field996, arg0.field992, arg0.field936);
                }
            }
        }
        if (arg0.field973 != -1 && field655 >= arg0.field976) {
            if (arg0.field974 < 0) {
                arg0.field974 = 0;
            }
            int var20 = class244.method420(arg0.field973).field3252;
            if (var20 == -1) {
                arg0.field973 = -1;
            } else {
                class259 var21 = class259.method154(var20);
                if (var21 == null || var21.field3521 == null) {
                    arg0.field973 = -1;
                } else {
                    arg0.field975++;
                    if (arg0.field974 < var21.field3521.length && arg0.field975 > var21.field3523[arg0.field974]) {
                        arg0.field975 = 1;
                        arg0.field974++;
                        Statics.method1045(var21, arg0.field974, arg0.field992, arg0.field936);
                    }
                    if (arg0.field974 >= var21.field3521.length && (arg0.field974 < 0 || arg0.field974 >= var21.field3521.length)) {
                        arg0.field973 = -1;
                    }
                }
            }
        }
        if (arg0.field990 != -1 && arg0.field971 <= 1) {
            class259 var22 = class259.method154(arg0.field990);
            if (var22.field3532 == 1 && arg0.field995 > 0 && arg0.field935 <= field655 && arg0.field983 < field655) {
                arg0.field971 = 1;
                return;
            }
        }
        if (arg0.field990 != -1 && arg0.field971 == 0) {
            class259 var23 = class259.method154(arg0.field990);
            if (var23 == null || var23.field3521 == null) {
                arg0.field990 = -1;
            } else {
                arg0.field970++;
                if (arg0.field969 < var23.field3521.length && arg0.field970 > var23.field3523[arg0.field969]) {
                    arg0.field970 = 1;
                    arg0.field969++;
                    Statics.method1045(var23, arg0.field969, arg0.field992, arg0.field936);
                }
                if (arg0.field969 >= var23.field3521.length) {
                    arg0.field969 -= var23.field3525;
                    arg0.field972++;
                    if (arg0.field972 >= var23.field3517) {
                        arg0.field990 = -1;
                    } else if (arg0.field969 >= 0 && arg0.field969 < var23.field3521.length) {
                        Statics.method1045(var23, arg0.field969, arg0.field992, arg0.field936);
                    } else {
                        arg0.field990 = -1;
                    }
                }
                arg0.field938 = var23.field3524;
            }
        }
        if (arg0.field971 > 0) {
            arg0.field971--;
        }
    }

    @ObfuscatedName("fe.fb(Lbt;B)V")
    public static final void method3160(class70 arg0) {
        int var1 = arg0.field935 - field655;
        int var2 = arg0.field947 * 128 + arg0.field939 * 64;
        int var3 = arg0.field980 * 128 + arg0.field939 * 64;
        arg0.field992 += (var2 - arg0.field992) / var1;
        arg0.field936 += (var3 - arg0.field936) / var1;
        arg0.field977 = 0;
        arg0.field987 = arg0.field984;
    }

    @ObfuscatedName("aq.fw(Lbt;I)V")
    public static final void method583(class70 arg0) {
        if (field655 == arg0.field983 || arg0.field990 == -1 || arg0.field971 != 0 || arg0.field970 + 1 > class259.method154(arg0.field990).field3523[arg0.field969]) {
            int var1 = arg0.field983 - arg0.field935;
            int var2 = field655 - arg0.field935;
            int var3 = arg0.field947 * 128 + arg0.field939 * 64;
            int var4 = arg0.field980 * 128 + arg0.field939 * 64;
            int var5 = arg0.field979 * 128 + arg0.field939 * 64;
            int var6 = arg0.field981 * 128 + arg0.field939 * 64;
            arg0.field992 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field936 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field977 = 0;
        arg0.field987 = arg0.field984;
        arg0.field937 = arg0.field987;
    }

    @ObfuscatedName("v.gm(Lbg;III)V")
    public static void method276(class67 arg0, int arg1, int arg2) {
        if (arg0.field990 == arg1 && arg1 != -1) {
            int var3 = class259.method154(arg1).field3534;
            if (var3 == 1) {
                arg0.field969 = 0;
                arg0.field970 = 0;
                arg0.field971 = arg2;
                arg0.field972 = 0;
            }
            if (var3 == 2) {
                arg0.field972 = 0;
            }
        } else if (arg1 == -1 || arg0.field990 == -1 || class259.method154(arg1).field3528 >= class259.method154(arg0.field990).field3528) {
            arg0.field990 = arg1;
            arg0.field969 = 0;
            arg0.field970 = 0;
            arg0.field971 = arg2;
            arg0.field972 = 0;
            arg0.field995 = arg0.field967;
        }
    }

    @ObfuscatedName("aj.gj(B)I")
    public static int method673() {
        return field857 ? 2 : 1;
    }

    @ObfuscatedName("bx.gn(II)V")
    public static void method961(int arg0) {
        field653 = 0L;
        if (arg0 >= 2) {
            field857 = true;
        } else {
            field857 = false;
        }
        if (method673() == 1) {
            Statics.field302.method780(765, 503);
        } else {
            Statics.field302.method780(7680, 2160);
        }
        if (field652 < 25) {
            return;
        }
        class188 var1 = class188.method3035(class184.field2219, field690.field1311);
        var1.field2347.method5290(method673());
        var1.field2347.method5123(Statics.field1873);
        var1.field2347.method5123(Statics.field310);
        field690.method2071(var1);
    }

    @ObfuscatedName("client.e(I)V")
    public final void method800() {
        field653 = class297.method3217() + 500L;
        this.method1162();
        if (field725 != -1) {
            this.method1168(true);
        }
    }

    @ObfuscatedName("client.gd(I)V")
    public void method1162() {
        int var1 = Statics.field1873;
        int var2 = Statics.field310;
        if (this.field446 < var1) {
            int var3 = this.field446;
        }
        if (this.field469 < var2) {
            int var4 = this.field469;
        }
        if (Statics.field1978 != null) {
            try {
                class48.method714(Statics.field302, "resize", new Object[] { method673() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gs(I)V")
    public final void method1163() {
        if (field725 != -1) {
            method3192(field725);
        }
        for (int var1 = 0; var1 < field846; var1++) {
            if (field848[var1]) {
                field838[var1] = true;
            }
            field850[var1] = field848[var1];
            field848[var1] = false;
        }
        field691 = field655;
        field778 = -1;
        field793 = -1;
        Statics.field3508 = null;
        if (field725 != -1) {
            field846 = 0;
            method1091(field725, 0, 0, Statics.field1873, Statics.field310, 0, 0, -1);
        }
        class321.method5587();
        if (field748) {
            if (field719 == 1) {
                Statics.field407[field746 / 100].method5691(field744 - 8, field649 - 8);
            }
            if (field719 == 2) {
                Statics.field407[field746 / 100 + 4].method5691(field744 - 8, field649 - 8);
            }
        }
        if (field876) {
            int var8 = Statics.field1121;
            int var9 = Statics.field2374;
            int var10 = Statics.field1536;
            int var11 = Statics.field1429;
            int var12 = 6116423;
            class321.method5595(var8, var9, var10, var11, var12);
            class321.method5595(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class321.method5596(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field2059.method4993(class225.field2930, var8 + 3, var9 + 14, var12, -1);
            int var13 = class55.field473;
            int var14 = class55.field483;
            for (int var15 = 0; var15 < field780; var15++) {
                int var16 = (field780 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class295 var18 = Statics.field2059;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field843[var15].length() > 0) {
                    var19 = field785[var15] + class225.field2921 + field843[var15];
                } else {
                    var19 = field785[var15];
                }
                var18.method4993(var19, var8 + 3, var16, var17, 0);
            }
            int var20 = Statics.field1121;
            int var21 = Statics.field2374;
            int var22 = Statics.field1536;
            int var23 = Statics.field1429;
            for (int var24 = 0; var24 < field846; var24++) {
                if (field853[var24] + field747[var24] > var20 && field747[var24] < var20 + var22 && field854[var24] + field852[var24] > var21 && field852[var24] < var21 + var23) {
                    field838[var24] = true;
                }
            }
        } else if (field778 != -1) {
            int var2 = field778;
            int var3 = field793;
            if ((field780 >= 2 || field802 != 0 || field798) && field710) {
                int var4 = field780 - 1;
                String var6;
                if (field802 == 1 && field780 < 2) {
                    var6 = class225.field2923 + class225.field2921 + field687 + " " + class82.field1142;
                } else if (field798 && field780 < 2) {
                    var6 = field801 + class225.field2921 + field718 + " " + class82.field1142;
                } else {
                    String var7;
                    if (var4 < 0) {
                        var7 = "";
                    } else if (field843[var4].length() > 0) {
                        var7 = field785[var4] + class225.field2921 + field843[var4];
                    } else {
                        var7 = field785[var4];
                    }
                    var6 = var7;
                }
                if (field780 > 2) {
                    var6 = var6 + class82.method3813(16777215) + " " + '/' + " " + (field780 - 2) + class225.field2812;
                }
                Statics.field2059.method5012(var6, var2 + 4, var3 + 15, 16777215, 0, field655 / 1000);
            }
        }
        if (field794 == 3) {
            for (int var25 = 0; var25 < field846; var25++) {
                if (field850[var25]) {
                    class321.method5594(field747[var25], field852[var25], field853[var25], field854[var25], 16711935, 128);
                } else if (field838[var25]) {
                    class321.method5594(field747[var25], field852[var25], field853[var25], field854[var25], 16711680, 128);
                }
            }
        }
        int var26 = Statics.field2321;
        int var27 = Statics.field2558.field992;
        int var28 = Statics.field2558.field936;
        int var29 = field705;
        for (class76 var30 = (class76) class76.field1074.method4568(); var30 != null; var30 = (class76) class76.field1074.method4561()) {
            if (var30.field1067 != -1 || var30.field1071 != null) {
                int var31 = 0;
                if (var27 > var30.field1075) {
                    var31 += var27 - var30.field1075;
                } else if (var27 < var30.field1081) {
                    var31 += var30.field1081 - var27;
                }
                if (var28 > var30.field1072) {
                    var31 += var28 - var30.field1072;
                } else if (var28 < var30.field1070) {
                    var31 += var30.field1070 - var28;
                }
                if (var31 - 64 > var30.field1073 || field792 == 0 || var30.field1069 != var26) {
                    if (var30.field1078 != null) {
                        Statics.field2240.method2112(var30.field1078);
                        var30.field1078 = null;
                    }
                    if (var30.field1080 != null) {
                        Statics.field2240.method2112(var30.field1080);
                        var30.field1080 = null;
                    }
                } else {
                    var31 -= 64;
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    int var32 = field792 * (var30.field1073 - var31) / var30.field1073;
                    class102 var10000;
                    if (var30.field1078 != null) {
                        var30.field1078.method2342(var32);
                    } else if (var30.field1067 >= 0) {
                        var10000 = (class102) null;
                        class102 var33 = class102.method2165(Statics.field2526, var30.field1067, 0);
                        if (var33 != null) {
                            class104 var34 = var33.method2163().method2209(Statics.field1023);
                            class114 var35 = class114.method2358(var34, 100, var32);
                            var35.method2341(-1);
                            Statics.field2240.method2113(var35);
                            var30.field1078 = var35;
                        }
                    }
                    if (var30.field1080 != null) {
                        var30.field1080.method2342(var32);
                        if (!var30.field1080.method3328()) {
                            var30.field1080 = null;
                        }
                    } else if (var30.field1071 != null && (var30.field1079 -= var29) <= 0) {
                        int var36 = (int) (Math.random() * (double) var30.field1071.length);
                        var10000 = (class102) null;
                        class102 var37 = class102.method2165(Statics.field2526, var30.field1071[var36], 0);
                        if (var37 != null) {
                            class104 var38 = var37.method2163().method2209(Statics.field1023);
                            class114 var39 = class114.method2358(var38, 100, var32);
                            var39.method2341(0);
                            Statics.field2240.method2113(var39);
                            var30.field1080 = var39;
                            var30.field1079 = var30.field1076 + (int) (Math.random() * (double) (var30.field1077 - var30.field1076));
                        }
                    }
                }
            }
        }
        field705 = 0;
    }

    @ObfuscatedName("q.gx(Ljava/lang/String;ZI)V")
    public static final void method283(String arg0, boolean arg1) {
        if (!field720) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field635.method4990(arg0, 250);
        int var6 = Statics.field635.method4991(arg0, 250) * 13;
        class321.method5595(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5596(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field635.method4997(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field846; var11++) {
            if (field853[var11] + field747[var11] > var7 && field747[var11] < var7 + var9 && field854[var11] + field852[var11] > var8 && field852[var11] < var8 + var10) {
                field848[var11] = true;
            }
        }
        if (arg1) {
            Statics.field2507.method765(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field846; var16++) {
            if (field853[var16] + field747[var16] > var12 && field747[var16] < var12 + var14 && field854[var16] + field852[var16] > var13 && field852[var16] < var13 + var15) {
                field838[var16] = true;
            }
        }
    }

    @ObfuscatedName("aj.gh(IIIII)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3) {
        field741++;
        if (Statics.field2558.field992 >> 7 == field873 && Statics.field2558.field936 >> 7 == field874) {
            field873 = 0;
        }
        method1010();
        method4971();
        method161(true);
        method1009();
        method161(false);
        method231();
        for (class78 var4 = (class78) field693.method4568(); var4 != null; var4 = (class78) field693.method4561()) {
            if (Statics.field2321 != var4.field1106 || var4.field1104) {
                var4.method3332();
            } else if (field655 >= var4.field1105) {
                var4.method1851(field705);
                if (var4.field1104) {
                    var4.method3332();
                } else {
                    Statics.field3.method2995(var4.field1106, var4.field1108, var4.field1114, var4.field1109, 60, var4, 0, -1L, false);
                }
            }
        }
        method3235(arg0, arg1, arg2, arg3, true);
        int var5 = field657;
        int var6 = field833;
        int var7 = field903;
        int var8 = field904;
        class321.method5588(var5, var6, var5 + var7, var6 + var8);
        class131.method2786();
        if (!field887) {
            int var9 = field712;
            if (field729 / 256 > var9) {
                var9 = field729 / 256;
            }
            if (field836[4] && field902[4] + 128 > var9) {
                var9 = field902[4] + 128;
            }
            int var10 = field713 & 0x7FF;
            int var11 = Statics.field1136;
            int var12 = Statics.field79;
            int var13 = Statics.field1145;
            int var14 = method2623(var9);
            int var15 = method156(var14, var8);
            int var16 = 2048 - var9 & 0x7FF;
            int var17 = 2048 - var10 & 0x7FF;
            int var18 = 0;
            int var19 = 0;
            int var20 = var15;
            if (var16 != 0) {
                int var21 = class131.field1773[var16];
                int var22 = class131.field1774[var16];
                int var23 = var19 * var22 - var15 * var21 >> 16;
                var20 = var19 * var21 + var15 * var22 >> 16;
                var19 = var23;
            }
            if (var17 != 0) {
                int var24 = class131.field1773[var17];
                int var25 = class131.field1774[var17];
                int var26 = var18 * var25 + var20 * var24 >> 16;
                var20 = var20 * var25 - var18 * var24 >> 16;
                var18 = var26;
            }
            Statics.field261 = var11 - var18;
            Statics.field1932 = var12 - var19;
            Statics.field1610 = var13 - var20;
            Statics.field542 = var9;
            Statics.field1456 = var10;
            if (field918 == 1 && field812 >= 2 && field655 % 50 == 0 && (Statics.field1136 >> 7 != Statics.field2558.field992 >> 7 || Statics.field1145 >> 7 != Statics.field2558.field936 >> 7)) {
                int var27 = Statics.field2558.field627;
                int var28 = (Statics.field1136 >> 7) + Statics.field429;
                int var29 = (Statics.field1145 >> 7) + Statics.field3244;
                method3239(var28, var29, var27, true);
            }
        }
        int var30;
        if (field887) {
            int var31;
            if (Statics.field1978.field1055) {
                var31 = Statics.field2321;
            } else {
                int var32 = method3406(Statics.field261, Statics.field1610, Statics.field2321);
                if (var32 - Statics.field1932 >= 800 || (class56.field513[Statics.field2321][Statics.field261 >> 7][Statics.field1610 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field2321;
                }
            }
            var30 = var31;
        } else {
            var30 = Statics.method3336();
        }
        int var33 = Statics.field261;
        int var34 = Statics.field1932;
        int var35 = Statics.field1610;
        int var36 = Statics.field542;
        int var37 = Statics.field1456;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field836[var38]) {
                int var39 = (int) (Math.random() * (double) (field737[var38] * 2 + 1) - (double) field737[var38] + Math.sin((double) field891[var38] / 100.0D * (double) field892[var38]) * (double) field902[var38]);
                if (var38 == 0) {
                    Statics.field261 += var39;
                }
                if (var38 == 1) {
                    Statics.field1932 += var39;
                }
                if (var38 == 2) {
                    Statics.field1610 += var39;
                }
                if (var38 == 3) {
                    Statics.field1456 = Statics.field1456 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field542 += var39;
                    if (Statics.field542 < 128) {
                        Statics.field542 = 128;
                    }
                    if (Statics.field542 > 383) {
                        Statics.field542 = 383;
                    }
                }
            }
        }
        int var40 = class55.field473;
        int var41 = class55.field483;
        if (class55.field482 != 0) {
            var40 = class55.field490;
            var41 = class55.field491;
        }
        if (var40 >= var5 && var40 < var5 + var7 && var41 >= var6 && var41 < var6 + var8) {
            class129.method3307(var40 - var5, var41 - var6);
        } else {
            class129.method4206();
        }
        method1008();
        class321.method5595(var5, var6, var7, var8, 0);
        method1008();
        int var42 = class131.field1748;
        class131.field1748 = field905;
        Statics.field3.method2958(Statics.field261, Statics.field1932, Statics.field1610, Statics.field542, Statics.field1456, var30);
        class131.field1748 = var42;
        method1008();
        Statics.field3.method2857();
        method4970(var5, var6, var7, var8);
        if (field663 == 2) {
            method2542((field666 - Statics.field429 << 7) + field669, (field667 - Statics.field3244 << 7) + field670, field736 * 2);
            if (field742 > -1 && field655 % 20 < 10) {
                Statics.field3535[0].method5691(field742 + var5 - 12, field727 + var6 - 28);
            }
        }
        ((class120) Statics.field1770).method2520(field705);
        method686(var5, var6, var7, var8);
        Statics.field261 = var33;
        Statics.field1932 = var34;
        Statics.field1610 = var35;
        Statics.field542 = var36;
        Statics.field1456 = var37;
        if (field654 && class237.method2750(true, false) == 0) {
            field654 = false;
        }
        if (field654) {
            class321.method5595(var5, var6, var7, var8, 0);
            method283(class225.field2780, false);
        }
    }

    @ObfuscatedName("fr.gb(IIIIZI)V")
    public static final void method3235(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field881;
        } else if (var5 >= 100) {
            var6 = field894;
        } else {
            var6 = (field894 - field881) * var5 / 100 + field881;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field786) {
            short var8 = field786;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field898) {
                var6 = field898;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class321.method5587();
                    class321.method5595(arg0, arg1, var10, arg3, -16777216);
                    class321.method5595(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field680) {
            short var11 = field680;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field897) {
                var6 = field897;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class321.method5587();
                    class321.method5595(arg0, arg1, arg2, var13, -16777216);
                    class321.method5595(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field905 = arg3 * var6 / 334;
        if (field903 != arg2 || field904 != arg3) {
            method576(arg2, arg3);
        }
        field657 = arg0;
        field833 = arg1;
        field903 = arg2;
        field904 = arg3;
    }

    @ObfuscatedName("bu.gc(I)V")
    public static void method1010() {
        if (field762) {
            Statics.method1973(Statics.field2558, false);
        }
    }

    @ObfuscatedName("ka.gw(I)V")
    public static void method4971() {
        if (field745 >= 0 && field759[field745] != null) {
            Statics.method1973(field759[field745], false);
        }
    }

    @ObfuscatedName("bu.go(I)V")
    public static void method1009() {
        int var0 = class90.field1250;
        int[] var1 = class90.field1251;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field745 != var1[var2] && field760 != var1[var2]) {
                Statics.method1973(field759[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("r.gy(ZI)V")
    public static final void method161(boolean arg0) {
        for (int var1 = 0; var1 < field739; var1++) {
            class80 var2 = field685[field764[var1]];
            if (var2 != null && var2.method1096() && var2.field1126.field3489 == arg0 && var2.field1126.method4400()) {
                int var3 = var2.field992 >> 7;
                int var4 = var2.field936 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field939 == 1 && (var2.field992 & 0x7F) == 64 && (var2.field936 & 0x7F) == 64) {
                        if (field741 == field740[var3][var4]) {
                            continue;
                        }
                        field740[var3][var4] = field741;
                    }
                    long var5 = class129.method960(0, 0, 1, !var2.field1126.field3499, field764[var1]);
                    var2.field940 = field655;
                    Statics.field3.method2995(Statics.field2321, var2.field992, var2.field936, method3406(var2.field992 + (var2.field939 * 64 - 64), var2.field936 + (var2.field939 * 64 - 64), Statics.field2321), var2.field939 * 64 - 64 + 60, var2, var2.field937, var5, var2.field938);
                }
            }
        }
    }

    @ObfuscatedName("s.gk(I)V")
    public static final void method231() {
        for (class87 var0 = (class87) field773.method4568(); var0 != null; var0 = (class87) field773.method4561()) {
            if (Statics.field2321 != var0.field1210 || field655 > var0.field1215) {
                var0.method3332();
            } else if (field655 >= var0.field1209) {
                if (var0.field1219 > 0) {
                    class80 var1 = field685[var0.field1219 - 1];
                    if (var1 != null && var1.field992 >= 0 && var1.field992 < 13312 && var1.field936 >= 0 && var1.field936 < 13312) {
                        var0.method1932(var1.field992, var1.field936, method3406(var1.field992, var1.field936, var0.field1210) - var0.field1214, field655);
                    }
                }
                if (var0.field1219 < 0) {
                    int var2 = -var0.field1219 - 1;
                    class67 var3;
                    if (field760 == var2) {
                        var3 = Statics.field2558;
                    } else {
                        var3 = field759[var2];
                    }
                    if (var3 != null && var3.field992 >= 0 && var3.field992 < 13312 && var3.field936 >= 0 && var3.field936 < 13312) {
                        var0.method1932(var3.field992, var3.field936, method3406(var3.field992, var3.field936, var0.field1210) - var0.field1214, field655);
                    }
                }
                var0.method1933(field705);
                Statics.field3.method2995(Statics.field2321, (int) var0.field1221, (int) var0.field1222, (int) var0.field1223, 60, var0, var0.field1220, -1L, false);
            }
        }
    }

    @ObfuscatedName("s.gq(I)Z")
    public static boolean method237() {
        return (field763 & 0x4) != 0;
    }

    @ObfuscatedName("f.gz(B)Z")
    public static boolean method11() {
        return (field763 & 0x1) != 0;
    }

    @ObfuscatedName("bz.ge(B)Z")
    public static boolean method1740() {
        return (field763 & 0x2) != 0;
    }

    @ObfuscatedName("ag.gg(Lbg;I)Z")
    public static boolean method499(class67 arg0) {
        if (field763 == 0) {
            return false;
        } else if (Statics.field2558 == arg0) {
            return (field763 & 0x8) != 0;
        } else {
            return method237() || method11() && arg0.method1098() || method1740() && arg0.method1102();
        }
    }

    @ObfuscatedName("cv.gv(Lbt;IIIIII)V")
    public static final void method1887(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1096()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1126;
            if (var6.field3496 != null) {
                var6 = var6.method4426();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1250;
        int[] var8 = class90.field1251;
        byte var9 = 0;
        if (arg1 < var7 && field655 == arg0.field940 && method499((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                int var11 = arg0.field950 + 15;
                method2542(arg0.field992, arg0.field936, var11);
                class296 var12 = (class296) field883.get(class292.field3667);
                byte var13 = 9;
                var12.method4996(var10.field607.method4837(), field742 + arg2, field727 + arg3 - var13, 16777215, 0);
                var9 = 18;
            }
        }
        int var14 = -2;
        if (!arg0.field965.method4501()) {
            method1041(arg0, arg0.field950 + 15);
            for (class79 var15 = (class79) arg0.field965.method4491(); var15 != null; var15 = (class79) arg0.field965.method4520()) {
                class71 var16 = var15.method1860(field655);
                if (var16 != null) {
                    class247 var17 = var15.field1120;
                    class325 var18 = var17.method4153();
                    class325 var19 = var17.method4155();
                    int var20 = 0;
                    int var21;
                    if (var18 == null || var19 == null) {
                        var21 = var17.field3294;
                    } else {
                        if (var17.field3286 * 2 < var19.field3869) {
                            var20 = var17.field3286;
                        }
                        var21 = var19.field3869 - var20 * 2;
                    }
                    int var22 = 255;
                    boolean var23 = true;
                    int var24 = field655 - var16.field998;
                    int var25 = var16.field1000 * var21 / var17.field3294;
                    int var28;
                    if (var16.field1003 > var24) {
                        int var26 = var17.field3290 == 0 ? 0 : var24 / var17.field3290 * var17.field3290;
                        int var27 = var16.field999 * var21 / var17.field3294;
                        var28 = (var25 - var27) * var26 / var16.field1003 + var27;
                    } else {
                        var28 = var25;
                        int var29 = var16.field1003 + var17.field3282 - var24;
                        if (var17.field3289 >= 0) {
                            var22 = (var29 << 8) / (var17.field3282 - var17.field3289);
                        }
                    }
                    if (var16.field1000 > 0 && var28 < 1) {
                        var28 = 1;
                    }
                    if (var18 == null || var19 == null) {
                        var14 += 5;
                        if (field742 > -1) {
                            int var35 = field742 + arg2 - (var21 >> 1);
                            int var36 = field727 + arg3 - var14;
                            class321.method5595(var35, var36, var28, 5, 65280);
                            class321.method5595(var28 + var35, var36, var21 - var28, 5, 16711680);
                        }
                        var14 += 2;
                    } else {
                        int var30;
                        if (var21 == var28) {
                            var30 = var20 * 2 + var28;
                        } else {
                            var30 = var20 + var28;
                        }
                        int var31 = var18.field3872;
                        var14 += var31;
                        int var32 = field742 + arg2 - (var21 >> 1);
                        int var33 = field727 + arg3 - var14;
                        int var34 = var32 - var20;
                        if (var22 >= 0 && var22 < 255) {
                            var18.method5697(var34, var33, var22);
                            class321.method5589(var34, var33, var30 + var34, var31 + var33);
                            var19.method5697(var34, var33, var22);
                        } else {
                            var18.method5691(var34, var33);
                            class321.method5589(var34, var33, var30 + var34, var31 + var33);
                            var19.method5691(var34, var33);
                        }
                        class321.method5588(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var14 += 2;
                    }
                } else if (var15.method1861()) {
                    var15.method3332();
                }
            }
        }
        if (var14 == -2) {
            var14 += 7;
        }
        int var37 = var9 + var14;
        if (arg1 < var7) {
            class67 var38 = (class67) arg0;
            if (var38.field626) {
                return;
            }
            if (var38.field608 != -1 || var38.field606 != -1) {
                method1041(arg0, arg0.field950 + 15);
                if (field742 > -1) {
                    if (var38.field608 != -1) {
                        var37 += 25;
                        Statics.field3666[var38.field608].method5691(field742 + arg2 - 12, field727 + arg3 - var37);
                    }
                    if (var38.field606 != -1) {
                        var37 += 25;
                        Statics.field1946[var38.field606].method5691(field742 + arg2 - 12, field727 + arg3 - var37);
                    }
                }
            }
            if (arg1 >= 0 && field663 == 10 && field696 == var8[arg1]) {
                int var39 = arg0.field950 + 15;
                method2542(arg0.field992, arg0.field936, var39);
                if (field742 > -1) {
                    int var40 = Statics.field3535[1].field3872 + var37;
                    Statics.field3535[1].method5691(field742 + arg2 - 12, field727 + arg3 - var40);
                }
            }
        } else {
            class257 var41 = ((class80) arg0).field1126;
            if (var41.field3496 != null) {
                var41 = var41.method4426();
            }
            if (var41.field3494 >= 0 && var41.field3494 < Statics.field1946.length) {
                method1041(arg0, arg0.field950 + 15);
                if (field742 > -1) {
                    Statics.field1946[var41.field3494].method5691(field742 + arg2 - 12, field727 + arg3 - 30);
                }
            }
            if (field663 == 1 && field664 == field764[arg1 - var7] && field655 % 20 < 10) {
                method1041(arg0, arg0.field950 + 15);
                if (field742 > -1) {
                    Statics.field3535[0].method5691(field742 + arg2 - 12, field727 + arg3 - 28);
                }
            }
        }
        if (arg0.field949 != null && (arg1 >= var7 || !arg0.field951 && (field860 == 4 || !arg0.field994 && (field860 == 0 || field860 == 3 || field860 == 1 && ((class67) arg0).method1098())))) {
            method1041(arg0, arg0.field950);
            if (field742 > -1 && field789 < field730) {
                field678[field789] = Statics.field2059.method5040(arg0.field949) / 2;
                field734[field789] = Statics.field2059.field3691;
                field732[field789] = field742;
                field733[field789] = field727;
                field839[field789] = arg0.field953;
                field889[field789] = arg0.field954;
                field738[field789] = arg0.field952;
                field686[field789] = arg0.field949;
                field789++;
            }
        }
        for (int var42 = 0; var42 < 4; var42++) {
            int var43 = arg0.field958[var42];
            int var44 = arg0.field961[var42];
            class253 var45 = null;
            int var46 = 0;
            if (var44 >= 0) {
                if (var43 <= field655) {
                    continue;
                }
                int var47 = arg0.field961[var42];
                class253 var48 = (class253) class253.field3331.method3076((long) var47);
                class253 var49;
                if (var48 == null) {
                    byte[] var50 = Statics.field3351.method3928(32, var47);
                    class253 var51 = new class253();
                    if (var50 != null) {
                        var51.method4261(new class300(var50));
                    }
                    class253.field3331.method3078(var51, (long) var47);
                    var49 = var51;
                } else {
                    var49 = var48;
                }
                var45 = var49;
                var46 = var49.field3339;
                if (var49 != null && var49.field3330 != null) {
                    var45 = var49.method4255();
                    if (var45 == null) {
                        arg0.field958[var42] = -1;
                        continue;
                    }
                }
            } else if (var43 < 0) {
                continue;
            }
            int var52 = arg0.field959[var42];
            class253 var53 = null;
            if (var52 >= 0) {
                class253 var54 = (class253) class253.field3331.method3076((long) var52);
                class253 var55;
                if (var54 == null) {
                    byte[] var56 = Statics.field3351.method3928(32, var52);
                    class253 var57 = new class253();
                    if (var56 != null) {
                        var57.method4261(new class300(var56));
                    }
                    class253.field3331.method3078(var57, (long) var52);
                    var55 = var57;
                } else {
                    var55 = var54;
                }
                var53 = var55;
                if (var55 != null && var55.field3330 != null) {
                    var53 = var55.method4255();
                }
            }
            if (var43 - var46 <= field655) {
                if (var45 == null) {
                    arg0.field958[var42] = -1;
                } else {
                    method1041(arg0, arg0.field950 / 2);
                    if (field742 > -1) {
                        if (var42 == 1) {
                            field727 -= 20;
                        }
                        if (var42 == 2) {
                            field742 -= 15;
                            field727 -= 10;
                        }
                        if (var42 == 3) {
                            field742 += 15;
                            field727 -= 10;
                        }
                        Object var58 = null;
                        Object var59 = null;
                        Object var60 = null;
                        Object var61 = null;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        class325 var70 = null;
                        class325 var71 = null;
                        class325 var72 = null;
                        class325 var73 = null;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        class325 var83 = var45.method4257();
                        if (var83 != null) {
                            var62 = var83.field3869;
                            int var84 = var83.field3872;
                            if (var84 > var82) {
                                var82 = var84;
                            }
                            var66 = var83.field3870;
                        }
                        class325 var85 = var45.method4258();
                        if (var85 != null) {
                            var63 = var85.field3869;
                            int var86 = var85.field3872;
                            if (var86 > var82) {
                                var82 = var86;
                            }
                            var67 = var85.field3870;
                        }
                        class325 var87 = var45.method4266();
                        if (var87 != null) {
                            var64 = var87.field3869;
                            int var88 = var87.field3872;
                            if (var88 > var82) {
                                var82 = var88;
                            }
                            var68 = var87.field3870;
                        }
                        class325 var89 = var45.method4252();
                        if (var89 != null) {
                            var65 = var89.field3869;
                            int var90 = var89.field3872;
                            if (var90 > var82) {
                                var82 = var90;
                            }
                            var69 = var89.field3870;
                        }
                        if (var53 != null) {
                            var70 = var53.method4257();
                            if (var70 != null) {
                                var74 = var70.field3869;
                                int var91 = var70.field3872;
                                if (var91 > var82) {
                                    var82 = var91;
                                }
                                var78 = var70.field3870;
                            }
                            var71 = var53.method4258();
                            if (var71 != null) {
                                var75 = var71.field3869;
                                int var92 = var71.field3872;
                                if (var92 > var82) {
                                    var82 = var92;
                                }
                                var79 = var71.field3870;
                            }
                            var72 = var53.method4266();
                            if (var72 != null) {
                                var76 = var72.field3869;
                                int var93 = var72.field3872;
                                if (var93 > var82) {
                                    var82 = var93;
                                }
                                var80 = var72.field3870;
                            }
                            var73 = var53.method4252();
                            if (var73 != null) {
                                var77 = var73.field3869;
                                int var94 = var73.field3872;
                                if (var94 > var82) {
                                    var82 = var94;
                                }
                                var81 = var73.field3870;
                            }
                        }
                        class295 var95 = var45.method4281();
                        if (var95 == null) {
                            var95 = Statics.field1172;
                        }
                        class295 var96;
                        if (var53 == null) {
                            var96 = Statics.field1172;
                        } else {
                            var96 = var53.method4281();
                            if (var96 == null) {
                                var96 = Statics.field1172;
                            }
                        }
                        Object var97 = null;
                        String var98 = null;
                        boolean var99 = false;
                        int var100 = 0;
                        String var101 = var45.method4271(arg0.field957[var42]);
                        int var102 = var95.method5040(var101);
                        if (var53 != null) {
                            var98 = var53.method4271(arg0.field968[var42]);
                            var100 = var96.method5040(var98);
                        }
                        int var103 = 0;
                        int var104 = 0;
                        if (var63 > 0) {
                            if (var87 == null && var89 == null) {
                                var103 = 1;
                            } else {
                                var103 = var102 / var63 + 1;
                            }
                        }
                        if (var53 != null && var75 > 0) {
                            if (var72 == null && var73 == null) {
                                var104 = 1;
                            } else {
                                var104 = var100 / var75 + 1;
                            }
                        }
                        int var105 = 0;
                        int var106 = var105;
                        if (var62 > 0) {
                            var105 += var62;
                        }
                        var105 += 2;
                        int var107 = var105;
                        if (var64 > 0) {
                            var105 += var64;
                        }
                        int var108 = var105;
                        int var109 = var105;
                        int var111;
                        if (var63 > 0) {
                            int var110 = var63 * var103;
                            var111 = var105 + var110;
                            var109 = (var110 - var102) / 2 + var105;
                        } else {
                            var111 = var102 + var105;
                        }
                        int var112 = var111;
                        if (var65 > 0) {
                            var111 += var65;
                        }
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        if (var53 != null) {
                            var111 += 2;
                            var113 = var111;
                            if (var74 > 0) {
                                var111 += var74;
                            }
                            var111 += 2;
                            var114 = var111;
                            if (var76 > 0) {
                                var111 += var76;
                            }
                            var115 = var111;
                            var117 = var111;
                            if (var75 > 0) {
                                int var118 = var75 * var104;
                                var111 += var118;
                                var117 += (var118 - var100) / 2;
                            } else {
                                var111 += var100;
                            }
                            var116 = var111;
                            if (var77 > 0) {
                                var111 += var77;
                            }
                        }
                        int var119 = arg0.field958[var42] - field655;
                        int var120 = var45.field3344 - var45.field3344 * var119 / var45.field3339;
                        int var121 = var45.field3328 * var119 / var45.field3339 + -var45.field3328;
                        int var122 = field742 + arg2 - (var111 >> 1) + var120;
                        int var123 = field727 + arg3 - 12 + var121;
                        int var124 = var123;
                        int var125 = var82 + var123;
                        int var126 = var45.field3334 + var123 + 15;
                        int var127 = var126 - var95.field3680;
                        int var128 = var95.field3686 + var126;
                        if (var127 < var123) {
                            var124 = var127;
                        }
                        if (var128 > var125) {
                            var125 = var128;
                        }
                        int var129 = 0;
                        if (var53 != null) {
                            var129 = var53.field3334 + var123 + 15;
                            int var130 = var129 - var96.field3680;
                            int var131 = var96.field3686 + var129;
                            if (var130 < var124) {
                                ;
                            }
                            if (var131 > var125) {
                                ;
                            }
                        }
                        int var134 = 255;
                        if (var45.field3349 >= 0) {
                            var134 = (var119 << 8) / (var45.field3339 - var45.field3349);
                        }
                        if (var134 >= 0 && var134 < 255) {
                            if (var83 != null) {
                                var83.method5697(var106 + var122 - var66, var123, var134);
                            }
                            if (var87 != null) {
                                var87.method5697(var107 + var122 - var68, var123, var134);
                            }
                            if (var85 != null) {
                                for (int var135 = 0; var135 < var103; var135++) {
                                    var85.method5697(var63 * var135 + (var108 + var122 - var67), var123, var134);
                                }
                            }
                            if (var89 != null) {
                                var89.method5697(var112 + var122 - var69, var123, var134);
                            }
                            var95.method5034(var101, var109 + var122, var126, var45.field3338, 0, var134);
                            if (var53 != null) {
                                if (var70 != null) {
                                    var70.method5697(var113 + var122 - var78, var123, var134);
                                }
                                if (var72 != null) {
                                    var72.method5697(var114 + var122 - var80, var123, var134);
                                }
                                if (var71 != null) {
                                    for (int var136 = 0; var136 < var104; var136++) {
                                        var71.method5697(var75 * var136 + (var115 + var122 - var79), var123, var134);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method5697(var116 + var122 - var81, var123, var134);
                                }
                                var96.method5034(var98, var117 + var122, var129, var53.field3338, 0, var134);
                            }
                        } else {
                            if (var83 != null) {
                                var83.method5691(var106 + var122 - var66, var123);
                            }
                            if (var87 != null) {
                                var87.method5691(var107 + var122 - var68, var123);
                            }
                            if (var85 != null) {
                                for (int var137 = 0; var137 < var103; var137++) {
                                    var85.method5691(var63 * var137 + (var108 + var122 - var67), var123);
                                }
                            }
                            if (var89 != null) {
                                var89.method5691(var112 + var122 - var69, var123);
                            }
                            var95.method4993(var101, var109 + var122, var126, var45.field3338 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var70 != null) {
                                    var70.method5691(var113 + var122 - var78, var123);
                                }
                                if (var72 != null) {
                                    var72.method5691(var114 + var122 - var80, var123);
                                }
                                if (var71 != null) {
                                    for (int var138 = 0; var138 < var104; var138++) {
                                        var71.method5691(var75 * var138 + (var115 + var122 - var79), var123);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method5691(var116 + var122 - var81, var123);
                                }
                                var96.method4993(var98, var117 + var122, var129, var53.field3338 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ka.gr(IIIII)V")
    public static final void method4970(int arg0, int arg1, int arg2, int arg3) {
        field789 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1250;
        int[] var8 = class90.field1251;
        for (int var9 = 0; var9 < field739 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = field759[var8[var9]];
                if (field745 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field2558 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field685[field764[var9 - var7]];
            }
            method1887(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field762 && var6 != -1) {
            method1887(Statics.field2558, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1887(field759[field745], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field789; var11++) {
            int var12 = field732[var11];
            int var13 = field733[var11];
            int var14 = field678[var11];
            int var15 = field734[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field733[var17] - field734[var17] && var13 - var15 < field733[var17] + 2 && var12 - var14 < field732[var17] + field678[var17] && var12 + var14 > field732[var17] - field678[var17] && field733[var17] - field734[var17] < var13) {
                        var13 = field733[var17] - field734[var17];
                        var16 = true;
                    }
                }
            }
            field742 = field732[var11];
            field727 = field733[var11] = var13;
            String var18 = field686[var11];
            if (field807 == 0) {
                int var19 = 16776960;
                if (field839[var11] < 6) {
                    var19 = field858[field839[var11]];
                }
                if (field839[var11] == 6) {
                    var19 = field741 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field839[var11] == 7) {
                    var19 = field741 % 20 < 10 ? 255 : 65535;
                }
                if (field839[var11] == 8) {
                    var19 = field741 % 20 < 10 ? 45056 : 8454016;
                }
                if (field839[var11] == 9) {
                    int var20 = 150 - field738[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field839[var11] == 10) {
                    int var21 = 150 - field738[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field839[var11] == 11) {
                    int var22 = 150 - field738[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field889[var11] == 0) {
                    Statics.field2059.method4996(var18, field742 + arg0, field727 + arg1, var19, 0);
                }
                if (field889[var11] == 1) {
                    Statics.field2059.method4998(var18, field742 + arg0, field727 + arg1, var19, 0, field741);
                }
                if (field889[var11] == 2) {
                    Statics.field2059.method4988(var18, field742 + arg0, field727 + arg1, var19, 0, field741);
                }
                if (field889[var11] == 3) {
                    Statics.field2059.method5000(var18, field742 + arg0, field727 + arg1, var19, 0, field741, 150 - field738[var11]);
                }
                if (field889[var11] == 4) {
                    int var23 = (150 - field738[var11]) * (Statics.field2059.method5040(var18) + 100) / 150;
                    class321.method5589(field742 + arg0 - 50, arg1, field742 + arg0 + 50, arg1 + arg3);
                    Statics.field2059.method4993(var18, field742 + arg0 + 50 - var23, field727 + arg1, var19, 0);
                    class321.method5588(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field889[var11] == 5) {
                    int var24 = 150 - field738[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class321.method5589(arg0, field727 + arg1 - Statics.field2059.field3691 - 1, arg0 + arg2, field727 + arg1 + 5);
                    Statics.field2059.method4996(var18, field742 + arg0, field727 + arg1 + var25, var19, 0);
                    class321.method5588(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2059.method4996(var18, field742 + arg0, field727 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("b.gt(B)V")
    public static final void method18() {
        field757 = 0;
        int var0 = (Statics.field2558.field992 >> 7) + Statics.field429;
        int var1 = (Statics.field2558.field936 >> 7) + Statics.field3244;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field757 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field757 = 1;
        }
        if (field757 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field757 = 0;
        }
    }

    @ObfuscatedName("an.gi(IIIII)V")
    public static final void method686(int arg0, int arg1, int arg2, int arg3) {
        method18();
    }

    @ObfuscatedName("bm.gp(Lbt;II)V")
    public static final void method1041(class70 arg0, int arg1) {
        method2542(arg0.field992, arg0.field936, arg1);
    }

    @ObfuscatedName("db.gu(IIIB)V")
    public static final void method2542(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field742 = -1;
            field727 = -1;
            return;
        }
        int var3 = method3406(arg0, arg1, Statics.field2321) - arg2;
        int var4 = arg0 - Statics.field261;
        int var5 = var3 - Statics.field1932;
        int var6 = arg1 - Statics.field1610;
        int var7 = class131.field1773[Statics.field542];
        int var8 = class131.field1774[Statics.field542];
        int var9 = class131.field1773[Statics.field1456];
        int var10 = class131.field1774[Statics.field1456];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field742 = field905 * var11 / var15 + field903 / 2;
            field727 = field905 * var14 / var15 + field904 / 2;
        } else {
            field742 = -1;
            field727 = -1;
        }
    }

    @ObfuscatedName("gk.gf(IIII)I")
    public static final int method3406(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field513[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field496[var5][var3][var4] + class56.field496[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field496[var5][var3][var4 + 1] + class56.field496[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("n.hr(IIB)I")
    public static int method156(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field896 - field895) * var2 / 100 + field895;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ai.hg(ZLkj;B)V")
    public static final void method495(boolean arg0, class299 arg1) {
        field711 = arg0;
        if (!field711) {
            int var2 = arg1.method5177();
            int var3 = arg1.method5178();
            int var4 = arg1.method5337();
            Statics.field125 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field125[var5][var6] = arg1.method5277();
                }
            }
            Statics.field3083 = new int[var4];
            Statics.field1997 = new int[var4];
            Statics.field81 = new int[var4];
            Statics.field3206 = new byte[var4][];
            Statics.field1947 = new byte[var4][];
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
                        Statics.field3083[var8] = var11;
                        Statics.field1997[var8] = Statics.field2504.method3917("m" + var9 + "_" + var10);
                        Statics.field81[var8] = Statics.field2504.method3917("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method239(var3, var2, true);
            return;
        }
        int var12 = arg1.method5256();
        boolean var13 = arg1.method5168() == 1;
        int var14 = arg1.method5256();
        int var15 = arg1.method5337();
        arg1.method5089();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5090(1);
                    if (var19 == 1) {
                        field703[var16][var17][var18] = arg1.method5090(26);
                    } else {
                        field703[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5091();
        Statics.field125 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field125[var20][var21] = arg1.method5277();
            }
        }
        Statics.field3083 = new int[var15];
        Statics.field1997 = new int[var15];
        Statics.field81 = new int[var15];
        Statics.field3206 = new byte[var15][];
        Statics.field1947 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field703[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3083[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3083[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1997[var22] = Statics.field2504.method3917("m" + var31 + "_" + var32);
                            Statics.field81[var22] = Statics.field2504.method3917("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method239(var14, var12, !var13);
    }

    @ObfuscatedName("s.ha(IIZB)V")
    public static final void method239(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2087 == arg0 && Statics.field1439 == arg1) {
            return;
        }
        Statics.field2087 = arg0;
        Statics.field1439 = arg1;
        method1897(25);
        method283(class225.field2780, true);
        int var3 = Statics.field429;
        int var4 = Statics.field3244;
        Statics.field429 = (arg0 - 6) * 8;
        Statics.field3244 = (arg1 - 6) * 8;
        int var5 = Statics.field429 - var3;
        int var6 = Statics.field3244 - var4;
        int var7 = Statics.field429;
        int var8 = Statics.field3244;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field685[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field991[var11] -= var5;
                    var10.field956[var11] -= var6;
                }
                var10.field992 -= var5 * 128;
                var10.field936 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field759[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field991[var14] -= var5;
                    var13.field956[var14] -= var6;
                }
                var13.field992 -= var5 * 128;
                var13.field936 -= var6 * 128;
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
                        field771[var25][var21][var22] = field771[var25][var23][var24];
                    } else {
                        field771[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field772.method4568(); var26 != null; var26 = (class69) field772.method4561()) {
            var26.field919 -= var5;
            var26.field932 -= var6;
            if (var26.field919 < 0 || var26.field932 < 0 || var26.field919 >= 104 || var26.field932 >= 104) {
                var26.method3332();
            }
        }
        if (field873 != 0) {
            field873 -= var5;
            field874 -= var6;
        }
        field770 = 0;
        field887 = false;
        Statics.field261 -= var5 << 7;
        Statics.field1610 -= var6 << 7;
        Statics.field1136 -= var5 << 7;
        Statics.field1145 -= var6 << 7;
        field868 = -1;
        field693.method4578();
        field773.method4578();
        for (int var27 = 0; var27 < 4; var27++) {
            field701[var27].method3281();
        }
    }

    @ObfuscatedName("bf.hn(ZI)V")
    public static final void method1046(boolean arg0) {
        method1008();
        field690.field1303++;
        if (field690.field1303 < 50 && !arg0) {
            return;
        }
        field690.field1303 = 0;
        if (field692 || field690.method2075() == null) {
            return;
        }
        class188 var1 = class188.method3035(class184.field2279, field690.field1311);
        field690.method2071(var1);
        try {
            field690.method2070();
        } catch (IOException var3) {
            field692 = true;
        }
    }

    @ObfuscatedName("jc.hm(B)V")
    public static final void method4658() {
        method1046(false);
        field677 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field3206.length; var1++) {
            if (Statics.field1997[var1] != -1 && Statics.field3206[var1] == null) {
                Statics.field3206[var1] = Statics.field2504.method3928(Statics.field1997[var1], 0);
                if (Statics.field3206[var1] == null) {
                    var0 = false;
                    field677++;
                }
            }
            if (Statics.field81[var1] != -1 && Statics.field1947[var1] == null) {
                Statics.field1947[var1] = Statics.field2504.method3844(Statics.field81[var1], 0, Statics.field125[var1]);
                if (Statics.field1947[var1] == null) {
                    var0 = false;
                    field677++;
                }
            }
        }
        if (!var0) {
            field700 = 1;
            return;
        }
        field851 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field3206.length; var3++) {
            byte[] var4 = Statics.field1947[var3];
            if (var4 != null) {
                int var5 = (Statics.field3083[var3] >> 8) * 64 - Statics.field429;
                int var6 = (Statics.field3083[var3] & 0xFF) * 64 - Statics.field3244;
                if (field711) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class56.method2054(var4, var5, var6);
            }
        }
        if (!var2) {
            field700 = 2;
            return;
        }
        if (field700 != 0) {
            method283(class225.field2780 + class82.field1143 + class82.field1140 + 100 + "%" + class82.field1139, true);
        }
        method1008();
        Statics.field3.method2844();
        for (int var7 = 0; var7 < 4; var7++) {
            field701[var7].method3281();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class56.field513[var8][var9][var10] = 0;
                }
            }
        }
        method1008();
        class56.field498 = 99;
        Statics.field499 = new byte[4][104][104];
        Statics.field500 = new byte[4][104][104];
        Statics.field501 = new byte[4][104][104];
        Statics.field502 = new byte[4][104][104];
        Statics.field234 = new int[4][105][105];
        Statics.field424 = new byte[4][105][105];
        Statics.field1208 = new int[105][105];
        Statics.field511 = new int[104];
        Statics.field497 = new int[104];
        Statics.field505 = new int[104];
        Statics.field3658 = new int[104];
        Statics.field589 = new int[104];
        int var11 = Statics.field3206.length;
        for (class76 var12 = (class76) class76.field1074.method4568(); var12 != null; var12 = (class76) class76.field1074.method4561()) {
            if (var12.field1078 != null) {
                Statics.field2240.method2112(var12.field1078);
                var12.field1078 = null;
            }
            if (var12.field1080 != null) {
                Statics.field2240.method2112(var12.field1080);
                var12.field1080 = null;
            }
        }
        class76.field1074.method4578();
        method1046(true);
        if (!field711) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field3083[var13] >> 8) * 64 - Statics.field429;
                int var15 = (Statics.field3083[var13] & 0xFF) * 64 - Statics.field3244;
                byte[] var16 = Statics.field3206[var13];
                if (var16 != null) {
                    method1008();
                    class56.method103(var16, var14, var15, Statics.field2087 * 8 - 48, Statics.field1439 * 8 - 48, field701);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field3083[var17] >> 8) * 64 - Statics.field429;
                int var19 = (Statics.field3083[var17] & 0xFF) * 64 - Statics.field3244;
                byte[] var20 = Statics.field3206[var17];
                if (var20 == null && Statics.field1439 < 800) {
                    method1008();
                    class56.method2109(var18, var19, 64, 64);
                }
            }
            method1046(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field1947[var21];
                if (var22 != null) {
                    int var23 = (Statics.field3083[var21] >> 8) * 64 - Statics.field429;
                    int var24 = (Statics.field3083[var21] & 0xFF) * 64 - Statics.field3244;
                    method1008();
                    class134 var25 = Statics.field3;
                    class173[] var26 = field701;
                    class300 var27 = new class300(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method5247();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method5246();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method5138();
                            int var36 = var35 >> 2;
                            int var37 = var35 & 0x3;
                            int var38 = var23 + var33;
                            int var39 = var24 + var32;
                            if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                int var40 = var34;
                                if ((class56.field513[1][var38][var39] & 0x2) == 2) {
                                    var40 = var34 - 1;
                                }
                                class173 var41 = null;
                                if (var40 >= 0) {
                                    var41 = var26[var40];
                                }
                                Statics.method4251(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field711) {
            for (int var42 = 0; var42 < 4; var42++) {
                method1008();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field703[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field3083.length; var52++) {
                                if (Statics.field3083[var52] == var51 && Statics.field3206[var52] != null) {
                                    byte[] var53 = Statics.field3206[var52];
                                    int var54 = var43 * 8;
                                    int var55 = var44 * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    int var57 = (var50 & 0x7) * 8;
                                    class173[] var58 = field701;
                                    for (int var59 = 0; var59 < 8; var59++) {
                                        for (int var60 = 0; var60 < 8; var60++) {
                                            if (var54 + var59 > 0 && var54 + var59 < 103 && var55 + var60 > 0 && var55 + var60 < 103) {
                                                var58[var42].field2089[var54 + var59][var55 + var60] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class300 var61 = new class300(var53);
                                    for (int var62 = 0; var62 < 4; var62++) {
                                        for (int var63 = 0; var63 < 64; var63++) {
                                            for (int var64 = 0; var64 < 64; var64++) {
                                                if (var47 == var62 && var63 >= var56 && var63 < var56 + 8 && var64 >= var57 && var64 < var57 + 8) {
                                                    int var67 = var54 + class217.method4655(var63 & 0x7, var64 & 0x7, var48);
                                                    int var69 = var63 & 0x7;
                                                    int var70 = var64 & 0x7;
                                                    int var72 = var48 & 0x3;
                                                    int var73;
                                                    if (var72 == 0) {
                                                        var73 = var70;
                                                    } else if (var72 == 1) {
                                                        var73 = 7 - var69;
                                                    } else if (var72 == 2) {
                                                        var73 = 7 - var70;
                                                    } else {
                                                        var73 = var69;
                                                    }
                                                    class56.method87(var61, var42, var67, var55 + var73, 0, 0, var48);
                                                } else {
                                                    class56.method87(var61, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            class56.method2840(var42, var43 * 8, var44 * 8);
                        }
                    }
                }
            }
            for (int var74 = 0; var74 < 13; var74++) {
                for (int var75 = 0; var75 < 13; var75++) {
                    int var76 = field703[0][var74][var75];
                    if (var76 == -1) {
                        class56.method2109(var74 * 8, var75 * 8, 8, 8);
                    }
                }
            }
            method1046(true);
            for (int var77 = 0; var77 < 4; var77++) {
                method1008();
                for (int var78 = 0; var78 < 13; var78++) {
                    for (int var79 = 0; var79 < 13; var79++) {
                        int var80 = field703[var77][var78][var79];
                        if (var80 != -1) {
                            int var81 = var80 >> 24 & 0x3;
                            int var82 = var80 >> 1 & 0x3;
                            int var83 = var80 >> 14 & 0x3FF;
                            int var84 = var80 >> 3 & 0x7FF;
                            int var85 = (var83 / 8 << 8) + var84 / 8;
                            for (int var86 = 0; var86 < Statics.field3083.length; var86++) {
                                if (Statics.field3083[var86] == var85 && Statics.field1947[var86] != null) {
                                    class56.method3237(Statics.field1947[var86], var77, var78 * 8, var79 * 8, var81, (var83 & 0x7) * 8, (var84 & 0x7) * 8, var82, Statics.field3, field701);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method1046(true);
        method1008();
        class56.method3046(Statics.field3, field701);
        method1046(true);
        int var87 = class56.field498;
        if (var87 > Statics.field2321) {
            var87 = Statics.field2321;
        }
        if (var87 < Statics.field2321 - 1) {
            int var88 = Statics.field2321 - 1;
        }
        if (field847) {
            Statics.field3.method2845(class56.field498);
        } else {
            Statics.field3.method2845(0);
        }
        for (int var89 = 0; var89 < 104; var89++) {
            for (int var90 = 0; var90 < 104; var90++) {
                method1871(var89, var90);
            }
        }
        method1008();
        for (class69 var91 = (class69) field772.method4568(); var91 != null; var91 = (class69) field772.method4561()) {
            if (var91.field921 == -1) {
                var91.field929 = 0;
                method3732(var91);
            } else {
                var91.method3332();
            }
        }
        class254.field3383.method3075();
        if (Statics.field302.method868()) {
            class188 var92 = class188.method3035(class184.field2261, field690.field1311);
            var92.field2347.method5231(1057001181);
            field690.method2071(var92);
        }
        if (!field711) {
            int var93 = (Statics.field2087 - 6) / 8;
            int var94 = (Statics.field2087 + 6) / 8;
            int var95 = (Statics.field1439 - 6) / 8;
            int var96 = (Statics.field1439 + 6) / 8;
            for (int var97 = var93 - 1; var97 <= var94 + 1; var97++) {
                for (int var98 = var95 - 1; var98 <= var96 + 1; var98++) {
                    if (var97 < var93 || var97 > var94 || var98 < var95 || var98 > var96) {
                        Statics.field2504.method3867("m" + var97 + "_" + var98);
                        Statics.field2504.method3867("l" + var97 + "_" + var98);
                    }
                }
            }
        }
        method1897(30);
        method1008();
        Statics.field499 = (byte[][][]) null;
        Statics.field500 = (byte[][][]) null;
        Statics.field501 = (byte[][][]) null;
        Statics.field502 = (byte[][][]) null;
        Statics.field234 = (int[][][]) null;
        Statics.field424 = (byte[][][]) null;
        Statics.field1208 = (int[][]) null;
        Statics.field511 = null;
        Statics.field497 = null;
        Statics.field505 = null;
        Statics.field3658 = null;
        Statics.field589 = null;
        class188 var99 = class188.method3035(class184.field2224, field690.field1311);
        field690.method2071(var99);
        Statics.field1998.method3196();
        for (int var100 = 0; var100 < 32; var100++) {
            field447[var100] = 0L;
        }
        for (int var101 = 0; var101 < 32; var101++) {
            field448[var101] = 0L;
        }
        Statics.field442 = 0;
    }

    @ObfuscatedName("client.hx(II)V")
    public static final void method1568(int arg0) {
        int[] var1 = Statics.field1102.field3877;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field513[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3.method3017(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class56.field513[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3.method3017(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1102.method5682();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field513[arg0][var10][var9] & 0x18) == 0) {
                    method1645(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class56.field513[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1645(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field869 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3.method2872(Statics.field2321, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method1028(var13);
                    int var16 = class254.method3048(var15).field3382;
                    if (var16 >= 0) {
                        field797[field869] = class242.method2014(var16).method4057(false);
                        field702[field869] = var11;
                        field871[field869] = var12;
                        field869++;
                    }
                }
            }
        }
        Statics.field2507.method5650();
    }

    @ObfuscatedName("bp.hd(IIIIII)V")
    public static final void method1645(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3.method2869(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3.method2873(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class129.method3051(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1102.field3877;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class129.method1028(var5);
            class254 var14 = class254.method3048(var13);
            if (var14.field3358 == -1) {
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
                class324 var15 = Statics.field60[var14.field3358];
                if (var15 != null) {
                    int var16 = (var14.field3369 * 4 - var15.field3863) / 2;
                    int var17 = (var14.field3370 * 4 - var15.field3862) / 2;
                    var15.method5660(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3370) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3.method3023(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3.method2873(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class129.method1028(var18);
            class254 var24 = class254.method3048(var23);
            if (var24.field3358 != -1) {
                class324 var25 = Statics.field60[var24.field3358];
                if (var25 != null) {
                    int var26 = (var24.field3369 * 4 - var25.field3863) / 2;
                    int var27 = (var24.field3370 * 4 - var25.field3862) / 2;
                    var25.method5660(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3370) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class129.method3051(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1102.field3877;
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
        long var31 = Statics.field3.method2872(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class129.method1028(var31);
        class254 var34 = class254.method3048(var33);
        if (var34.field3358 == -1) {
            return;
        }
        class324 var35 = Statics.field60[var34.field3358];
        if (var35 != null) {
            int var36 = (var34.field3369 * 4 - var35.field3863) / 2;
            int var37 = (var34.field3370 * 4 - var35.field3862) / 2;
            var35.method5660(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3370) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hc(Lcc;I)Z")
    public final boolean method1164(class96 arg0) {
        class305 var2 = arg0.method2075();
        class299 var3 = arg0.field1305;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1310 == null) {
                if (arg0.field1308) {
                    if (!var2.method3267(1)) {
                        return false;
                    }
                    var2.method3247(arg0.field1305.field3708, 0, 1);
                    arg0.field1306 = 0;
                    arg0.field1308 = false;
                }
                var3.field3707 = 0;
                if (var3.method5118()) {
                    if (!var2.method3267(1)) {
                        return false;
                    }
                    var2.method3247(arg0.field1305.field3708, 1, 1);
                    arg0.field1306 = 0;
                }
                arg0.field1308 = true;
                class183[] var4 = class183.method183();
                int var5 = var3.method5082();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3707);
                }
                arg0.field1310 = var4[var5];
                arg0.field1307 = arg0.field1310.field2216;
            }
            if (arg0.field1307 == -1) {
                if (!var2.method3267(1)) {
                    return false;
                }
                arg0.method2075().method3247(var3.field3708, 0, 1);
                arg0.field1307 = var3.field3708[0] & 0xFF;
            }
            if (arg0.field1307 == -2) {
                if (!var2.method3267(2)) {
                    return false;
                }
                arg0.method2075().method3247(var3.field3708, 0, 2);
                var3.field3707 = 0;
                arg0.field1307 = var3.method5337();
            }
            if (!var2.method3267(arg0.field1307)) {
                return false;
            }
            var3.field3707 = 0;
            var2.method3247(var3.field3708, 0, arg0.field1307);
            arg0.field1306 = 0;
            field694.method4661();
            arg0.field1313 = arg0.field1312;
            arg0.field1312 = arg0.field1300;
            arg0.field1300 = arg0.field1310;
            if (class183.field2212 == arg0.field1310) {
                method1599(class186.field2332);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2198 == arg0.field1310) {
                method1599(class186.field2338);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1310) {
                int var6 = var3.method5337();
                int var7 = var3.method5277();
                class213.field2530[var6] = var7;
                if (class213.field2531[var6] != var7) {
                    class213.field2531[var6] = var7;
                }
                method4282(var6);
                field829[++field830 - 1 & 0x1F] = var6;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1310) {
                int var8 = var3.method5337();
                int var9 = var3.method5138();
                int var10 = var3.method5186();
                class62 var11 = (class62) field804.method5549((long) var10);
                if (var11 != null) {
                    method663(var11, var11.field564 != var8);
                }
                method4858(var10, var8, var9);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1310) {
                class90.method3074(var3, arg0.field1307);
                method2067();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2204 == arg0.field1310) {
                int var12 = var3.method5277();
                int var13 = var3.method5337();
                if (var12 < -70000) {
                    var13 += 32768;
                }
                class218 var14;
                if (var12 >= 0) {
                    var14 = class218.method3387(var12);
                } else {
                    var14 = null;
                }
                while (var3.field3707 < arg0.field1307) {
                    int var15 = var3.method5246();
                    int var16 = var3.method5337();
                    int var17 = 0;
                    if (var16 != 0) {
                        var17 = var3.method5138();
                        if (var17 == 255) {
                            var17 = var3.method5277();
                        }
                    }
                    if (var14 != null && var15 >= 0 && var15 < var14.field2630.length) {
                        var14.field2630[var15] = var16;
                        var14.field2703[var15] = var17;
                    }
                    class60.method3806(var13, var15, var16 - 1, var17);
                }
                if (var14 != null) {
                    method1052(var14);
                }
                method5500();
                field831[++field899 - 1 & 0x1F] = var13 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1310) {
                method495(false, arg0.field1305);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1310) {
                field873 = var3.method5138();
                if (field873 == 255) {
                    field873 = 0;
                }
                field874 = var3.method5138();
                if (field874 == 255) {
                    field874 = 0;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2165 == arg0.field1310) {
                var3.field3707 += 28;
                if (var3.method5163()) {
                    method506(var3, var3.field3707 - 28);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2186 == arg0.field1310) {
                method5500();
                int var18 = var3.method5226();
                int var19 = var3.method5277();
                int var20 = var3.method5168();
                field877[var18] = var19;
                field775[var18] = var20;
                field776[var18] = 1;
                for (int var21 = 0; var21 < 98; var21++) {
                    if (var19 >= class222.field2753[var21]) {
                        field776[var18] = var21 + 2;
                    }
                }
                field880[++field840 - 1 & 0x1F] = var18;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1310) {
                if (field725 != -1) {
                    method59(field725, 0);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1310) {
                int var22 = var3.method5138();
                method3398(var22);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1310) {
                int var23 = var3.method5125();
                String var24 = var3.method5147();
                class218 var25 = class218.method3387(var23);
                if (!var24.equals(var25.field2646)) {
                    var25.field2646 = var24;
                    method1052(var25);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2184 == arg0.field1310) {
                Statics.field344 = var3.method5168();
                Statics.field3093 = var3.method5168();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1310) {
                int var26 = var3.method5265();
                String var27 = var3.method5147();
                int var28 = var3.method5226();
                if (var28 >= 1 && var28 <= 8) {
                    if (var27.equalsIgnoreCase(class225.field2777)) {
                        var27 = null;
                    }
                    field756[var28 - 1] = var27;
                    field768[var28 - 1] = var26 == 0;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1310) {
                int var29 = var3.method5277();
                int var30 = var3.method5125();
                class62 var31 = (class62) field804.method5549((long) var29);
                class62 var32 = (class62) field804.method5549((long) var30);
                if (var32 != null) {
                    method663(var32, var31 == null || var31.field564 != var32.field564);
                }
                if (var31 != null) {
                    var31.method3332();
                    field804.method5550(var31, (long) var30);
                }
                class218 var33 = class218.method3387(var29);
                if (var33 != null) {
                    method1052(var33);
                }
                class218 var34 = class218.method3387(var30);
                if (var34 != null) {
                    method1052(var34);
                    Statics.method3201(Statics.field1608[var34.field2578 >>> 16], var34, true);
                }
                if (field725 != -1) {
                    method59(field725, 1);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2208 == arg0.field1310) {
                for (int var35 = 0; var35 < class213.field2531.length; var35++) {
                    if (class213.field2531[var35] != class213.field2530[var35]) {
                        class213.field2531[var35] = class213.field2530[var35];
                        method4282(var35);
                        field829[++field830 - 1 & 0x1F] = var35;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1310) {
                String var36 = var3.method5147();
                long var37 = (long) var3.method5337();
                long var39 = (long) var3.method5287();
                class229 var41 = (class229) class196.method3304(class229.method21(), var3.method5138());
                long var42 = (var37 << 32) + var39;
                boolean var44 = false;
                for (int var45 = 0; var45 < 100; var45++) {
                    if (field862[var45] == var42) {
                        var44 = true;
                        break;
                    }
                }
                if (Statics.field1745.method1723(new class283(var36, Statics.field120))) {
                    var44 = true;
                }
                if (!var44 && field757 == 0) {
                    field862[field856] = var42;
                    field856 = (field856 + 1) % 100;
                    String var46 = class296.method4992(class291.method3391(class211.method122(var3)));
                    byte var47;
                    if (var41.field3103) {
                        var47 = 7;
                    } else {
                        var47 = 3;
                    }
                    if (var41.field3101 == -1) {
                        class92.method151(var47, var36, var46);
                    } else {
                        class92.method151(var47, class82.method1571(var41.field3101) + var36, var46);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2195 == arg0.field1310) {
                int var48 = var3.method5277();
                int var49 = var3.method5256();
                class218 var50 = class218.method3387(var48);
                if (var50.field2621 != 2 || var50.field2622 != var49) {
                    var50.field2621 = 2;
                    var50.field2622 = var49;
                    method1052(var50);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2200 == arg0.field1310) {
                for (int var51 = 0; var51 < field759.length; var51++) {
                    if (field759[var51] != null) {
                        field759[var51].field990 = -1;
                    }
                }
                for (int var52 = 0; var52 < field685.length; var52++) {
                    if (field685[var52] != null) {
                        field685[var52].field990 = -1;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2129 == arg0.field1310) {
                int var53 = var3.method5337();
                int var54 = var3.method5277();
                class218 var55 = class218.method3387(var54);
                if (var55 != null && var55.field2580 == 0) {
                    if (var53 > var55.field2688 - var55.field2594) {
                        var53 = var55.field2688 - var55.field2594;
                    }
                    if (var53 < 0) {
                        var53 = 0;
                    }
                    if (var55.field2568 != var53) {
                        var55.field2568 = var53;
                        method1052(var55);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1310) {
                Statics.field1745.method1688(var3, arg0.field1307);
                field834 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2182 == arg0.field1310) {
                method1599(class186.field2334);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2213 == arg0.field1310) {
                int var56 = var3.method5138();
                int var57 = var3.method5138();
                int var58 = var3.method5138();
                int var59 = var3.method5138();
                field836[var56] = true;
                field737[var56] = var57;
                field902[var56] = var58;
                field891[var56] = var59;
                field892[var56] = 0;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1310) {
                field887 = true;
                Statics.field926 = var3.method5138();
                Statics.field640 = var3.method5138();
                Statics.field300 = var3.method5337();
                Statics.field1934 = var3.method5138();
                Statics.field1991 = var3.method5138();
                if (Statics.field1991 >= 100) {
                    Statics.field261 = Statics.field926 * 128 + 64;
                    Statics.field1610 = Statics.field640 * 128 + 64;
                    Statics.field1932 = method3406(Statics.field261, Statics.field1610, Statics.field2321) - Statics.field300;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1310) {
                String var60 = var3.method5147();
                Object[] var61 = new Object[var60.length() + 1];
                for (int var62 = var60.length() - 1; var62 >= 0; var62--) {
                    if (var60.charAt(var62) == 's') {
                        var61[var62 + 1] = var3.method5147();
                    } else {
                        var61[var62 + 1] = Integer.valueOf(var3.method5277());
                    }
                }
                var61[0] = Integer.valueOf(var3.method5277());
                class63 var63 = new class63();
                var63.field568 = var61;
                class77.method371(var63);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1310) {
                int var64 = var3.method5178();
                if (var64 == 65535) {
                    var64 = -1;
                }
                int var65 = var3.method5277();
                int var66 = var3.method5187();
                int var67 = var3.method5178();
                if (var67 == 65535) {
                    var67 = -1;
                }
                for (int var68 = var67; var68 <= var64; var68++) {
                    long var69 = ((long) var66 << 32) + (long) var68;
                    class181 var71 = field845.method5549(var69);
                    if (var71 != null) {
                        var71.method3332();
                    }
                    field845.method5550(new class180(var65), var69);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1310) {
                int var72 = var3.method5138();
                method710(var72);
                arg0.field1310 = null;
                return false;
            }
            if (class183.field2189 == arg0.field1310) {
                String var73 = var3.method5147();
                long var74 = var3.method5144();
                long var76 = (long) var3.method5337();
                long var78 = (long) var3.method5287();
                class229 var80 = (class229) class196.method3304(class229.method21(), var3.method5138());
                long var81 = (var76 << 32) + var78;
                boolean var83 = false;
                for (int var84 = 0; var84 < 100; var84++) {
                    if (field862[var84] == var81) {
                        var83 = true;
                        break;
                    }
                }
                if (var80.field3096 && Statics.field1745.method1723(new class283(var73, Statics.field120))) {
                    var83 = true;
                }
                if (!var83 && field757 == 0) {
                    field862[field856] = var81;
                    field856 = (field856 + 1) % 100;
                    String var85 = class296.method4992(class291.method3391(class211.method122(var3)));
                    if (var80.field3101 == -1) {
                        class92.method1015(9, var73, var85, class289.method96(var74));
                    } else {
                        class92.method1015(9, class82.method1571(var80.field3101) + var73, var85, class289.method96(var74));
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2191 == arg0.field1310) {
                int var86 = var3.method5187();
                int var87 = var3.method5180();
                class218 var88 = class218.method3387(var86);
                if (var88.field2625 != var87 || var87 == -1) {
                    var88.field2625 = var87;
                    var88.field2706 = 0;
                    var88.field2707 = 0;
                    method1052(var88);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2151 == arg0.field1310) {
                int var89 = var3.method5177();
                byte var90 = var3.method5174();
                class213.field2530[var89] = var90;
                if (class213.field2531[var89] != var90) {
                    class213.field2531[var89] = var90;
                }
                method4282(var89);
                field829[++field830 - 1 & 0x1F] = var89;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2206 == arg0.field1310) {
                Statics.field1745.method1687();
                field834 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2202 == arg0.field1310) {
                int var91 = var3.method5256();
                int var92 = var3.method5125();
                class218 var93 = class218.method3387(var92);
                if (var93.field2621 != 1 || var93.field2622 != var91) {
                    var93.field2621 = 1;
                    var93.field2622 = var91;
                    method1052(var93);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1310) {
                int var94 = var3.method5337();
                field725 = var94;
                this.method1168(false);
                method302(var94);
                class77.method3136(field725);
                for (int var95 = 0; var95 < 100; var95++) {
                    field848[var95] = true;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1310) {
                method5500();
                field811 = var3.method5141();
                field835 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1310) {
                method5500();
                field810 = var3.method5138();
                field835 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2187 == arg0.field1310) {
                int var96 = arg0.field1307 + var3.field3707;
                int var97 = var3.method5337();
                int var98 = var3.method5337();
                if (field725 != var97) {
                    field725 = var97;
                    this.method1168(false);
                    method302(field725);
                    class77.method3136(field725);
                    for (int var99 = 0; var99 < 100; var99++) {
                        field848[var99] = true;
                    }
                }
                while (var98-- > 0) {
                    int var100 = var3.method5277();
                    int var101 = var3.method5337();
                    int var102 = var3.method5138();
                    class62 var103 = (class62) field804.method5549((long) var100);
                    if (var103 != null && var103.field564 != var101) {
                        method663(var103, true);
                        var103 = null;
                    }
                    if (var103 == null) {
                        var103 = method4858(var100, var101, var102);
                    }
                    var103.field562 = true;
                }
                for (class62 var104 = (class62) field804.method5551(); var104 != null; var104 = (class62) field804.method5556()) {
                    if (var104.field562) {
                        var104.field562 = false;
                    } else {
                        method663(var104, true);
                    }
                }
                field845 = new class318(512);
                while (var3.field3707 < var96) {
                    int var105 = var3.method5277();
                    int var106 = var3.method5337();
                    int var107 = var3.method5337();
                    int var108 = var3.method5277();
                    for (int var109 = var106; var109 <= var107; var109++) {
                        long var110 = ((long) var105 << 32) + (long) var109;
                        field845.method5550(new class180(var108), var110);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1310) {
                field887 = false;
                for (int var112 = 0; var112 < 5; var112++) {
                    field836[var112] = false;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1310) {
                method1599(class186.field2341);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1310) {
                Statics.field3093 = var3.method5168();
                Statics.field344 = var3.method5226();
                while (var3.field3707 < arg0.field1307) {
                    int var113 = var3.method5138();
                    class186 var114 = class186.method1747()[var113];
                    method1599(var114);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2211 == arg0.field1310) {
                int var115 = var3.method5277();
                class62 var116 = (class62) field804.method5549((long) var115);
                if (var116 != null) {
                    method663(var116, true);
                }
                if (field779 != null) {
                    method1052(field779);
                    field779 = null;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1310) {
                method1599(class186.field2333);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1310) {
                int var117 = var3.method5337();
                int var118 = var3.method5187();
                int var119 = var3.method5256();
                class218 var120 = class218.method3387(var118);
                var120.field2634 = (var117 << 16) + var119;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2196 == arg0.field1310) {
                int var121 = var3.method5277();
                int var122 = var3.method5178();
                if (var122 == 65535) {
                    var122 = -1;
                }
                int var123 = var3.method5187();
                class218 var124 = class218.method3387(var121);
                if (var124.field2659) {
                    var124.field2644 = var122;
                    var124.field2714 = var123;
                    class255 var126 = class255.method1847(var122);
                    var124.field2629 = var126.field3412;
                    var124.field2596 = var126.field3419;
                    var124.field2631 = var126.field3420;
                    var124.field2627 = var126.field3421;
                    var124.field2628 = var126.field3422;
                    var124.field2704 = var126.field3447;
                    if (var126.field3423 == 1) {
                        var124.field2637 = 1;
                    } else {
                        var124.field2637 = 2;
                    }
                    if (var124.field2712 > 0) {
                        var124.field2704 = var124.field2704 * 32 / var124.field2712;
                    } else if (var124.field2589 > 0) {
                        var124.field2704 = var124.field2704 * 32 / var124.field2589;
                    }
                    method1052(var124);
                } else if (var122 == -1) {
                    var124.field2621 = 0;
                    arg0.field1310 = null;
                    return true;
                } else {
                    class255 var125 = class255.method1847(var122);
                    var124.field2621 = 4;
                    var124.field2622 = var122;
                    var124.field2629 = var125.field3412;
                    var124.field2596 = var125.field3419;
                    var124.field2704 = var125.field3447 * 100 / var123;
                    method1052(var124);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1310) {
                int var127 = var3.method5277();
                int var128 = var3.method5337();
                if (var127 < -70000) {
                    var128 += 32768;
                }
                class218 var129;
                if (var127 >= 0) {
                    var129 = class218.method3387(var127);
                } else {
                    var129 = null;
                }
                if (var129 != null) {
                    for (int var130 = 0; var130 < var129.field2630.length; var130++) {
                        var129.field2630[var130] = 0;
                        var129.field2703[var130] = 0;
                    }
                }
                class60.method586(var128);
                int var131 = var3.method5337();
                for (int var132 = 0; var132 < var131; var132++) {
                    int var133 = var3.method5265();
                    if (var133 == 255) {
                        var133 = var3.method5277();
                    }
                    int var134 = var3.method5256();
                    if (var129 != null && var132 < var129.field2630.length) {
                        var129.field2630[var132] = var134;
                        var129.field2703[var132] = var133;
                    }
                    class60.method3806(var128, var132, var134 - 1, var133);
                }
                if (var129 != null) {
                    method1052(var129);
                }
                method5500();
                field831[++field899 - 1 & 0x1F] = var128 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1310) {
                field887 = true;
                Statics.field418 = var3.method5138();
                Statics.field1243 = var3.method5138();
                Statics.field309 = var3.method5337();
                Statics.field3644 = var3.method5138();
                Statics.field1999 = var3.method5138();
                if (Statics.field1999 >= 100) {
                    int var135 = Statics.field418 * 128 + 64;
                    int var136 = Statics.field1243 * 128 + 64;
                    int var137 = method3406(var135, var136, Statics.field2321) - Statics.field309;
                    int var138 = var135 - Statics.field261;
                    int var139 = var137 - Statics.field1932;
                    int var140 = var136 - Statics.field1610;
                    int var141 = (int) Math.sqrt((double) (var138 * var138 + var140 * var140));
                    Statics.field542 = (int) (Math.atan2((double) var139, (double) var141) * 325.949D) & 0x7FF;
                    Statics.field1456 = (int) (Math.atan2((double) var138, (double) var140) * -325.949D) & 0x7FF;
                    if (Statics.field542 < 128) {
                        Statics.field542 = 128;
                    }
                    if (Statics.field542 > 383) {
                        Statics.field542 = 383;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1310) {
                method495(true, arg0.field1305);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2194 == arg0.field1310) {
                byte[] var142 = new byte[arg0.field1307];
                var3.method5088(var142, 0, var142.length);
                class300 var143 = new class300(var142);
                String var144 = var143.method5147();
                class52.method582(var144, true, false);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2207 == arg0.field1310) {
                String var145 = var3.method5147();
                String var146 = class296.method4992(class291.method3391(class211.method122(var3)));
                class92.method151(6, var145, var146);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1310) {
                method1599(class186.field2335);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1310) {
                int var147 = var3.method5277();
                int var148 = var3.method5277();
                int var149 = class54.method1937();
                class188 var150 = class188.method3035(class184.field2229, field690.field1311);
                var150.field2347.method5184(var147);
                var150.field2347.method5348(var148);
                var150.field2347.method5311(field445);
                var150.field2347.method5135(var149);
                field690.method2071(var150);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1310) {
                class72 var151 = new class72();
                var151.field1014 = var3.method5147();
                var151.field1011 = var3.method5337();
                int var152 = var3.method5277();
                var151.field1005 = var152;
                method1897(45);
                var2.method3243();
                Object var153 = null;
                class86.method149(var151);
                arg0.field1310 = null;
                return false;
            }
            if (class183.field2159 == arg0.field1310) {
                int var154 = var3.method5178();
                int var155 = var3.method5187();
                int var156 = var3.method5256();
                int var157 = var3.method5337();
                class218 var158 = class218.method3387(var155);
                if (var158.field2629 != var156 || var158.field2596 != var154 || var158.field2704 != var157) {
                    var158.field2629 = var156;
                    var158.field2596 = var154;
                    var158.field2704 = var157;
                    method1052(var158);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2190 == arg0.field1310) {
                for (int var159 = 0; var159 < Statics.field3214; var159++) {
                    class241 var160 = class241.method3998(var159);
                    if (var160 != null) {
                        class213.field2530[var159] = 0;
                        class213.field2531[var159] = 0;
                    }
                }
                method5500();
                field830 += 32;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1310) {
                class97.method3394(var3, arg0.field1307);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2197 == arg0.field1310) {
                int var161 = var3.method5246();
                boolean var162 = var3.method5138() == 1;
                String var163 = "";
                boolean var164 = false;
                if (var162) {
                    var163 = var3.method5147();
                    if (Statics.field1745.method1723(new class283(var163, Statics.field120))) {
                        var164 = true;
                    }
                }
                String var165 = var3.method5147();
                if (!var164) {
                    class92.method151(var161, var163, var165);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2199 == arg0.field1310) {
                Statics.field1745.field1061.method4734(var3, arg0.field1307);
                method3389();
                field834 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1310) {
                if (Statics.field567 != null) {
                    Statics.field567.method4874(var3);
                }
                method1756();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2180 == arg0.field1310) {
                int var166 = var3.method5177();
                class60.method71(var166);
                field831[++field899 - 1 & 0x1F] = var166 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2193 == arg0.field1310) {
                int var167 = var3.method5337();
                int var168 = var3.method5138();
                int var169 = var3.method5337();
                method3229(var167, var168, var169);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1310) {
                method672(var3.method5147());
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1310) {
                field662 = var3.method5177() * 30;
                field835 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2201 == arg0.field1310) {
                method633();
                arg0.field1310 = null;
                return false;
            }
            if (class183.field2152 == arg0.field1310) {
                Statics.field2469 = class310.method4721(var3.method5138());
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1310) {
                Statics.field3093 = var3.method5138();
                Statics.field344 = var3.method5265();
                for (int var170 = Statics.field3093; var170 < Statics.field3093 + 8; var170++) {
                    for (int var171 = Statics.field344; var171 < Statics.field344 + 8; var171++) {
                        if (field771[Statics.field2321][var170][var171] != null) {
                            field771[Statics.field2321][var170][var171] = null;
                            method1871(var170, var171);
                        }
                    }
                }
                for (class69 var172 = (class69) field772.method4568(); var172 != null; var172 = (class69) field772.method4561()) {
                    if (var172.field919 >= Statics.field3093 && var172.field919 < Statics.field3093 + 8 && var172.field932 >= Statics.field344 && var172.field932 < Statics.field344 + 8 && Statics.field2321 == var172.field922) {
                        var172.field921 = 0;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2188 == arg0.field1310) {
                boolean var173 = var3.method5138() == 1;
                if (var173) {
                    Statics.field605 = class297.method3217() - var3.method5144();
                    Statics.field1436 = new class7(var3, true);
                } else {
                    Statics.field1436 = null;
                }
                field735 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2203 == arg0.field1310) {
                int var174 = var3.method5125();
                class218 var175 = class218.method3387(var174);
                for (int var176 = 0; var176 < var175.field2630.length; var176++) {
                    var175.field2630[var176] = -1;
                    var175.field2630[var176] = 0;
                }
                method1052(var175);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2192 == arg0.field1310) {
                method1599(class186.field2342);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1310) {
                if (arg0.field1307 == 0) {
                    Statics.field567 = null;
                } else {
                    if (Statics.field567 == null) {
                        Statics.field567 = new class285(Statics.field120, Statics.field302);
                    }
                    Statics.field567.method4863(var3);
                }
                method1756();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1310) {
                field663 = var3.method5138();
                if (field663 == 1) {
                    field664 = var3.method5337();
                }
                if (field663 >= 2 && field663 <= 6) {
                    if (field663 == 2) {
                        field669 = 64;
                        field670 = 64;
                    }
                    if (field663 == 3) {
                        field669 = 0;
                        field670 = 64;
                    }
                    if (field663 == 4) {
                        field669 = 128;
                        field670 = 64;
                    }
                    if (field663 == 5) {
                        field669 = 64;
                        field670 = 0;
                    }
                    if (field663 == 6) {
                        field669 = 64;
                        field670 = 128;
                    }
                    field663 = 2;
                    field666 = var3.method5337();
                    field667 = var3.method5337();
                    field736 = var3.method5138();
                }
                if (field663 == 10) {
                    field696 = var3.method5337();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2185 == arg0.field1310) {
                field875 = var3.method5138();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1310) {
                int var177 = var3.method5337();
                if (var177 == 65535) {
                    var177 = -1;
                }
                method1902(var177);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1310) {
                int var178 = var3.method5177();
                if (var178 == 65535) {
                    var178 = -1;
                }
                int var179 = var3.method5182();
                method959(var178, var179);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2214 == arg0.field1310) {
                boolean var180 = var3.method5176();
                if (!var180) {
                    Statics.field3211 = null;
                } else if (Statics.field3211 == null) {
                    Statics.field3211 = new class238();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1310) {
                int var181 = var3.method5256();
                int var182 = var3.method5277();
                int var183 = var181 >> 10 & 0x1F;
                int var184 = var181 >> 5 & 0x1F;
                int var185 = var181 & 0x1F;
                int var186 = (var185 << 3) + (var183 << 19) + (var184 << 11);
                class218 var187 = class218.method3387(var182);
                if (var187.field2664 != var186) {
                    var187.field2664 = var186;
                    method1052(var187);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1310) {
                int var188 = var3.method5187();
                int var189 = var3.method5302();
                int var190 = var3.method5141();
                class218 var191 = class218.method3387(var188);
                if (var191.field2619 != var189 || var191.field2588 != var190 || var191.field2583 != 0 || var191.field2680 != 0) {
                    var191.field2619 = var189;
                    var191.field2588 = var190;
                    var191.field2583 = 0;
                    var191.field2680 = 0;
                    method1052(var191);
                    this.method1290(var191);
                    if (var191.field2580 == 0) {
                        Statics.method3201(Statics.field1608[var188 >> 16], var191, false);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1310) {
                method1599(class186.field2337);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2209 == arg0.field1310) {
                int var192 = var3.method5277();
                if (field749 != var192) {
                    field749 = var192;
                    method28();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1310) {
                method1599(class186.field2340);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2205 == arg0.field1310) {
                field860 = var3.method5226();
                field855 = var3.method5226();
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1310) {
                method1599(class186.field2336);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2210 == arg0.field1310) {
                boolean var193 = var3.method5265() == 1;
                int var194 = var3.method5187();
                class218 var195 = class218.method3387(var194);
                if (var195.field2598 != var193) {
                    var195.field2598 = var193;
                    method1052(var195);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1310) {
                int var196 = var3.method5138();
                if (var3.method5138() == 0) {
                    field910[var196] = new class10();
                    var3.field3707 += 18;
                } else {
                    var3.field3707--;
                    field910[var196] = new class10(var3, false);
                }
                field646 = field828;
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1310) {
                method290(false, var3);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2181 == arg0.field1310) {
                method290(true, var3);
                arg0.field1310 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1310) {
                int var197 = var3.method5187();
                class218 var198 = class218.method3387(var197);
                var198.field2621 = 3;
                var198.field2622 = Statics.field2558.field617.method3700();
                method1052(var198);
                arg0.field1310 = null;
                return true;
            }
            class341.method3640("" + (arg0.field1310 == null ? -1 : arg0.field1310.field2215) + class82.field1138 + (arg0.field1312 == null ? -1 : arg0.field1312.field2215) + class82.field1138 + (arg0.field1313 == null ? -1 : arg0.field1313.field2215) + class82.field1138 + arg0.field1307, (Throwable) null);
            method633();
        } catch (IOException var203) {
            method1938();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1310 == null ? -1 : arg0.field1310.field2215) + class82.field1138 + (arg0.field1312 == null ? -1 : arg0.field1312.field2215) + class82.field1138 + (arg0.field1313 == null ? -1 : arg0.field1313.field2215) + class82.field1138 + arg0.field1307 + class82.field1138 + (Statics.field429 + Statics.field2558.field991[0]) + class82.field1138 + (Statics.field3244 + Statics.field2558.field956[0]) + class82.field1138;
            for (int var202 = 0; var202 < arg0.field1307 && var202 < 50; var202++) {
                var201 = var201 + var3.field3708[var202] + class82.field1138;
            }
            class341.method3640(var201, var204);
            method633();
        }
        return true;
    }

    @ObfuscatedName("bl.hv(Lgd;I)V")
    public static final void method1599(class186 arg0) {
        class299 var1 = field690.field1305;
        if (class186.field2341 == arg0) {
            int var2 = var1.method5138();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field704[var3];
            int var6 = var1.method5226();
            int var7 = (var6 >> 4 & 0x7) + Statics.field3093;
            int var8 = (var6 & 0x7) + Statics.field344;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method3666(Statics.field2321, var7, var8, var5, -1, var3, var4, 0, -1);
            }
        } else if (class186.field2338 == arg0) {
            int var9 = var1.method5265();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field704[var10];
            int var13 = var1.method5337();
            int var14 = var1.method5138();
            int var15 = (var14 >> 4 & 0x7) + Statics.field3093;
            int var16 = (var14 & 0x7) + Statics.field344;
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method3666(Statics.field2321, var15, var16, var12, var13, var10, var11, 0, -1);
            }
        } else if (class186.field2340 == arg0) {
            int var17 = var1.method5337();
            int var18 = var1.method5138();
            int var19 = (var18 >> 4 & 0x7) + Statics.field3093;
            int var20 = (var18 & 0x7) + Statics.field344;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class262 var21 = field771[Statics.field2321][var19][var20];
                if (var21 != null) {
                    for (class88 var22 = (class88) var21.method4568(); var22 != null; var22 = (class88) var21.method4561()) {
                        if ((var17 & 0x7FFF) == var22.field1236) {
                            var22.method3332();
                            break;
                        }
                    }
                    if (var21.method4568() == null) {
                        field771[Statics.field2321][var19][var20] = null;
                    }
                    method1871(var19, var20);
                }
            }
        } else {
            if (class186.field2335 == arg0) {
                int var23 = var1.method5138();
                int var24 = var23 >> 4 & 0xF;
                int var25 = var23 & 0x7;
                int var26 = var1.method5226();
                int var27 = (var26 >> 4 & 0x7) + Statics.field3093;
                int var28 = (var26 & 0x7) + Statics.field344;
                int var29 = var1.method5168();
                int var30 = var1.method5337();
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var31 = var24 + 1;
                    if (Statics.field2558.field991[0] >= var27 - var31 && Statics.field2558.field991[0] <= var27 + var31 && Statics.field2558.field956[0] >= var28 - var31 && Statics.field2558.field956[0] <= var28 + var31 && field792 != 0 && var25 > 0 && field770 < 50) {
                        field893[field770] = var30;
                        field668[field770] = var25;
                        field884[field770] = var29;
                        field900[field770] = null;
                        field885[field770] = (var27 << 16) + (var28 << 8) + var24;
                        field770++;
                    }
                }
            }
            if (class186.field2337 == arg0) {
                int var32 = var1.method5226();
                int var33 = var1.method5337();
                int var34 = var1.method5256();
                int var35 = var1.method5265();
                int var36 = (var35 >> 4 & 0x7) + Statics.field3093;
                int var37 = (var35 & 0x7) + Statics.field344;
                byte var38 = var1.method5139();
                int var39 = var1.method5226() * 4;
                int var40 = var1.method5256();
                int var41 = var1.method5226() * 4;
                int var42 = var1.method5180();
                byte var43 = var1.method5139();
                int var44 = var1.method5265();
                int var45 = var36 + var38;
                int var46 = var37 + var43;
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var34 != 65535) {
                    int var47 = var36 * 128 + 64;
                    int var48 = var37 * 128 + 64;
                    int var49 = var45 * 128 + 64;
                    int var50 = var46 * 128 + 64;
                    class87 var51 = new class87(var34, Statics.field2321, var47, var48, method3406(var47, var48, Statics.field2321) - var41, field655 + var33, field655 + var40, var44, var32, var42, var39);
                    var51.method1932(var49, var50, method3406(var49, var50, Statics.field2321) - var39, field655 + var33);
                    field773.method4563(var51);
                }
            } else if (class186.field2333 == arg0) {
                int var52 = var1.method5177();
                int var53 = var1.method5226();
                int var54 = (var53 >> 4 & 0x7) + Statics.field3093;
                int var55 = (var53 & 0x7) + Statics.field344;
                int var56 = var1.method5265();
                int var57 = var56 >> 2;
                int var58 = var56 & 0x3;
                int var59 = field704[var57];
                if (var54 >= 0 && var55 >= 0 && var54 < 103 && var55 < 103) {
                    if (var59 == 0) {
                        class137 var60 = Statics.field3.method2865(Statics.field2321, var54, var55);
                        if (var60 != null) {
                            int var61 = class129.method1028(var60.field1870);
                            if (var57 == 2) {
                                var60.field1869 = new class94(var61, 2, var58 + 4, Statics.field2321, var54, var55, var52, false, var60.field1869);
                                var60.field1865 = new class94(var61, 2, var58 + 1 & 0x3, Statics.field2321, var54, var55, var52, false, var60.field1865);
                            } else {
                                var60.field1869 = new class94(var61, var57, var58, Statics.field2321, var54, var55, var52, false, var60.field1869);
                            }
                        }
                    }
                    if (var59 == 1) {
                        class142 var62 = Statics.field3.method2866(Statics.field2321, var54, var55);
                        if (var62 != null) {
                            int var63 = class129.method1028(var62.field1904);
                            if (var57 == 4 || var57 == 5) {
                                var62.field1911 = new class94(var63, 4, var58, Statics.field2321, var54, var55, var52, false, var62.field1911);
                            } else if (var57 == 6) {
                                var62.field1911 = new class94(var63, 4, var58 + 4, Statics.field2321, var54, var55, var52, false, var62.field1911);
                            } else if (var57 == 7) {
                                var62.field1911 = new class94(var63, 4, (var58 + 2 & 0x3) + 4, Statics.field2321, var54, var55, var52, false, var62.field1911);
                            } else if (var57 == 8) {
                                var62.field1911 = new class94(var63, 4, var58 + 4, Statics.field2321, var54, var55, var52, false, var62.field1911);
                                var62.field1906 = new class94(var63, 4, (var58 + 2 & 0x3) + 4, Statics.field2321, var54, var55, var52, false, var62.field1906);
                            }
                        }
                    }
                    if (var59 == 2) {
                        class143 var64 = Statics.field3.method2988(Statics.field2321, var54, var55);
                        if (var57 == 11) {
                            var57 = 10;
                        }
                        if (var64 != null) {
                            var64.field1920 = new class94(class129.method1028(var64.field1917), var57, var58, Statics.field2321, var54, var55, var52, false, var64.field1920);
                        }
                    }
                    if (var59 == 3) {
                        class124 var65 = Statics.field3.method2868(Statics.field2321, var54, var55);
                        if (var65 != null) {
                            var65.field1604 = new class94(class129.method1028(var65.field1602), 22, var58, Statics.field2321, var54, var55, var52, false, var65.field1604);
                        }
                    }
                }
            } else if (class186.field2342 == arg0) {
                int var66 = var1.method5177();
                int var67 = var1.method5138();
                int var68 = var1.method5178();
                int var69 = var1.method5138();
                int var70 = (var69 >> 4 & 0x7) + Statics.field3093;
                int var71 = (var69 & 0x7) + Statics.field344;
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    int var72 = var70 * 128 + 64;
                    int var73 = var71 * 128 + 64;
                    class78 var74 = new class78(var66, Statics.field2321, var72, var73, method3406(var72, var73, Statics.field2321) - var67, var68, field655);
                    field693.method4563(var74);
                }
            } else if (class186.field2332 == arg0) {
                int var75 = var1.method5337();
                int var76 = var1.method5178();
                int var77 = var1.method5178();
                int var78 = var1.method5168();
                int var79 = (var78 >> 4 & 0x7) + Statics.field3093;
                int var80 = (var78 & 0x7) + Statics.field344;
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    class262 var81 = field771[Statics.field2321][var79][var80];
                    if (var81 != null) {
                        for (class88 var82 = (class88) var81.method4568(); var82 != null; var82 = (class88) var81.method4561()) {
                            if ((var75 & 0x7FFF) == var82.field1236 && var82.field1235 == var77) {
                                var82.field1235 = var76;
                                break;
                            }
                        }
                        method1871(var79, var80);
                    }
                }
            } else if (class186.field2336 == arg0) {
                int var83 = var1.method5337();
                int var84 = var1.method5138();
                int var85 = (var84 >> 4 & 0x7) + Statics.field3093;
                int var86 = (var84 & 0x7) + Statics.field344;
                int var87 = var1.method5177();
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    class88 var88 = new class88();
                    var88.field1236 = var87;
                    var88.field1235 = var83;
                    if (field771[Statics.field2321][var85][var86] == null) {
                        field771[Statics.field2321][var85][var86] = new class262();
                    }
                    field771[Statics.field2321][var85][var86].method4563(var88);
                    method1871(var85, var86);
                }
            } else if (class186.field2334 == arg0) {
                int var89 = var1.method5337();
                int var90 = var1.method5256();
                int var91 = var1.method5226();
                int var92 = var91 >> 2;
                int var93 = var91 & 0x3;
                int var94 = field704[var92];
                int var95 = var1.method5178();
                byte var96 = var1.method5309();
                byte var97 = var1.method5174();
                int var98 = var1.method5138();
                int var99 = (var98 >> 4 & 0x7) + Statics.field3093;
                int var100 = (var98 & 0x7) + Statics.field344;
                int var101 = var1.method5256();
                byte var102 = var1.method5170();
                byte var103 = var1.method5174();
                class67 var104;
                if (field760 == var90) {
                    var104 = Statics.field2558;
                } else {
                    var104 = field759[var90];
                }
                if (var104 != null) {
                    class254 var105 = class254.method3048(var89);
                    int var106;
                    int var107;
                    if (var93 == 1 || var93 == 3) {
                        var106 = var105.field3370;
                        var107 = var105.field3369;
                    } else {
                        var106 = var105.field3369;
                        var107 = var105.field3370;
                    }
                    int var108 = (var106 >> 1) + var99;
                    int var109 = (var106 + 1 >> 1) + var99;
                    int var110 = (var107 >> 1) + var100;
                    int var111 = (var107 + 1 >> 1) + var100;
                    int[][] var112 = class56.field496[Statics.field2321];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var99 << 7) + (var106 << 6);
                    int var115 = (var100 << 7) + (var107 << 6);
                    class128 var116 = var105.method4323(var92, var93, var112, var114, var113, var115);
                    if (var116 != null) {
                        method3666(Statics.field2321, var99, var100, var94, -1, 0, 0, var95 + 1, var101 + 1);
                        var104.field614 = field655 + var95;
                        var104.field620 = field655 + var101;
                        var104.field616 = var116;
                        var104.field624 = var99 * 128 + var106 * 64;
                        var104.field618 = var100 * 128 + var107 * 64;
                        var104.field633 = var113;
                        if (var96 > var103) {
                            byte var117 = var96;
                            var96 = var103;
                            var103 = var117;
                        }
                        if (var102 > var97) {
                            byte var118 = var102;
                            var102 = var97;
                            var97 = var118;
                        }
                        var104.field619 = var96 + var99;
                        var104.field622 = var99 + var103;
                        var104.field621 = var100 + var102;
                        var104.field623 = var97 + var100;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hm.hl(IIIIIIIIII)V")
    public static final void method3666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field772.method4568(); var10 != null; var10 = (class69) field772.method4561()) {
            if (var10.field922 == arg0 && var10.field919 == arg1 && var10.field932 == arg2 && var10.field920 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field922 = arg0;
            var9.field920 = arg3;
            var9.field919 = arg1;
            var9.field932 = arg2;
            method3732(var9);
            field772.method4563(var9);
        }
        var9.field924 = arg4;
        var9.field928 = arg5;
        var9.field927 = arg6;
        var9.field929 = arg7;
        var9.field921 = arg8;
    }

    @ObfuscatedName("hc.hj(Lbe;I)V")
    public static final void method3732(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field920 == 0) {
            var1 = Statics.field3.method2869(arg0.field922, arg0.field919, arg0.field932);
        }
        if (arg0.field920 == 1) {
            var1 = Statics.field3.method2870(arg0.field922, arg0.field919, arg0.field932);
        }
        if (arg0.field920 == 2) {
            var1 = Statics.field3.method3023(arg0.field922, arg0.field919, arg0.field932);
        }
        if (arg0.field920 == 3) {
            var1 = Statics.field3.method2872(arg0.field922, arg0.field919, arg0.field932);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3.method2873(arg0.field922, arg0.field919, arg0.field932, var1);
            var3 = class129.method1028(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field923 = var3;
        arg0.field925 = var4;
        arg0.field930 = var5;
    }

    @ObfuscatedName("bt.hs(IIIIIIIB)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field847 && Statics.field2321 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3.method2869(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3.method2870(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3.method3023(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3.method2872(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3.method2873(arg0, arg2, arg3, var7);
            int var13 = class129.method1028(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3.method2997(arg0, arg2, arg3);
                class254 var16 = class254.method3048(var13);
                if (var16.field3371 != 0) {
                    field701[arg0].method3277(arg2, arg3, var14, var15, var16.field3387);
                }
            }
            if (arg1 == 1) {
                Statics.field3.method2861(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3.method2862(arg0, arg2, arg3);
                class254 var17 = class254.method3048(var13);
                if (var17.field3369 + arg2 > 103 || var17.field3369 + arg3 > 103 || var17.field3370 + arg2 > 103 || var17.field3370 + arg3 > 103) {
                    return;
                }
                if (var17.field3371 != 0) {
                    field701[arg0].method3278(arg2, arg3, var17.field3369, var17.field3370, var15, var17.field3387);
                }
            }
            if (arg1 == 3) {
                Statics.field3.method2863(arg0, arg2, arg3);
                class254 var18 = class254.method3048(var13);
                if (var18.field3371 == 1) {
                    field701[arg0].method3280(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field513[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class56.method1898(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3, field701[arg0]);
    }

    @ObfuscatedName("cm.hh(III)V")
    public static final void method1871(int arg0, int arg1) {
        class262 var2 = field771[Statics.field2321][arg0][arg1];
        if (var2 == null) {
            Statics.field3.method2864(Statics.field2321, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4568(); var6 != null; var6 = (class88) var2.method4561()) {
            class255 var7 = class255.method1847(var6.field1236);
            long var8 = (long) var7.field3416;
            if (var7.field3423 == 1) {
                var8 = (long) (var6.field1235 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3.method2864(Statics.field2321, arg0, arg1);
            return;
        }
        var2.method4564(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4568(); var12 != null; var12 = (class88) var2.method4561()) {
            if (var5.field1236 != var12.field1236) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1236 != var12.field1236 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method960(arg0, arg1, 3, false, 0);
        Statics.field3.method2850(Statics.field2321, arg0, arg1, method3406(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2321), var5, var13, var10, var11);
    }

    @ObfuscatedName("l.hk(ZLkj;I)V")
    public static final void method290(boolean arg0, class299 arg1) {
        field815 = 0;
        field688 = 0;
        method360();
        method2056(arg0, arg1);
        for (int var2 = 0; var2 < field688; var2++) {
            int var3 = field689[var2];
            class80 var4 = field685[var3];
            int var5 = arg1.method5138();
            if ((var5 & 0x4) != 0) {
                int var6 = arg1.method5226();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg1.method5246();
                        if (var11 == 32767) {
                            var11 = arg1.method5246();
                            var9 = arg1.method5246();
                            var8 = arg1.method5246();
                            var10 = arg1.method5246();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg1.method5246();
                        }
                        int var12 = arg1.method5246();
                        var4.method1578(var11, var9, var8, var10, field655, var12);
                    }
                }
                int var13 = arg1.method5168();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg1.method5246();
                        int var16 = arg1.method5246();
                        if (var16 == 32767) {
                            var4.method1588(var15);
                        } else {
                            int var17 = arg1.method5246();
                            int var18 = arg1.method5138();
                            int var19 = var16 > 0 ? arg1.method5138() : var18;
                            var4.method1576(var15, field655, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field962 = arg1.method5337();
                if (var4.field962 == 65535) {
                    var4.field962 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field949 = arg1.method5147();
                var4.field952 = 100;
            }
            if ((var5 & 0x2) != 0) {
                int var20 = arg1.method5337();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = arg1.method5138();
                if (var4.field990 == var20 && var20 != -1) {
                    int var22 = class259.method154(var20).field3534;
                    if (var22 == 1) {
                        var4.field969 = 0;
                        var4.field970 = 0;
                        var4.field971 = var21;
                        var4.field972 = 0;
                    }
                    if (var22 == 2) {
                        var4.field972 = 0;
                    }
                } else if (var20 == -1 || var4.field990 == -1 || class259.method154(var20).field3528 >= class259.method154(var4.field990).field3528) {
                    var4.field990 = var20;
                    var4.field969 = 0;
                    var4.field970 = 0;
                    var4.field971 = var21;
                    var4.field972 = 0;
                    var4.field995 = var4.field967;
                }
            }
            if ((var5 & 0x1) != 0) {
                var4.field1126 = class257.method4083(arg1.method5177());
                var4.field939 = var4.field1126.field3490;
                var4.field989 = var4.field1126.field3495;
                var4.field944 = var4.field1126.field3478;
                var4.field945 = var4.field1126.field3466;
                var4.field946 = var4.field1126.field3480;
                var4.field964 = var4.field1126.field3487;
                var4.field986 = var4.field1126.field3475;
                var4.field942 = var4.field1126.field3476;
                var4.field943 = var4.field1126.field3500;
            }
            if ((var5 & 0x40) != 0) {
                var4.field973 = arg1.method5177();
                int var23 = arg1.method5277();
                var4.field997 = var23 >> 16;
                var4.field976 = (var23 & 0xFFFF) + field655;
                var4.field974 = 0;
                var4.field975 = 0;
                if (var4.field976 > field655) {
                    var4.field974 = -1;
                }
                if (var4.field973 == 65535) {
                    var4.field973 = -1;
                }
            }
            if ((var5 & 0x8) != 0) {
                int var24 = arg1.method5337();
                int var25 = arg1.method5337();
                int var26 = var4.field992 - (var24 - Statics.field429 - Statics.field429) * 64;
                int var27 = var4.field936 - (var25 - Statics.field3244 - Statics.field3244) * 64;
                if (var26 != 0 || var27 != 0) {
                    var4.field966 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var28 = 0; var28 < field815; var28++) {
            int var29 = field765[var28];
            if (field655 != field685[var29].field941) {
                field685[var29].field1126 = null;
                field685[var29] = null;
            }
        }
        if (field690.field1307 != arg1.field3707) {
            throw new RuntimeException(arg1.field3707 + class82.field1138 + field690.field1307);
        }
        for (int var30 = 0; var30 < field739; var30++) {
            if (field685[field764[var30]] == null) {
                throw new RuntimeException(var30 + class82.field1138 + field739);
            }
        }
    }

    @ObfuscatedName("af.ht(I)V")
    public static final void method360() {
        class299 var0 = field690.field1305;
        var0.method5089();
        int var1 = var0.method5090(8);
        if (var1 < field739) {
            for (int var2 = var1; var2 < field739; var2++) {
                field765[++field815 - 1] = field764[var2];
            }
        }
        if (var1 > field739) {
            throw new RuntimeException("");
        }
        field739 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field764[var3];
            class80 var5 = field685[var4];
            int var6 = var0.method5090(1);
            if (var6 == 0) {
                field764[++field739 - 1] = var4;
                var5.field941 = field655;
            } else {
                int var7 = var0.method5090(2);
                if (var7 == 0) {
                    field764[++field739 - 1] = var4;
                    var5.field941 = field655;
                    field689[++field688 - 1] = var4;
                } else if (var7 == 1) {
                    field764[++field739 - 1] = var4;
                    var5.field941 = field655;
                    int var8 = var0.method5090(3);
                    var5.method1873(var8, (byte) 1);
                    int var9 = var0.method5090(1);
                    if (var9 == 1) {
                        field689[++field688 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field764[++field739 - 1] = var4;
                    var5.field941 = field655;
                    int var10 = var0.method5090(3);
                    var5.method1873(var10, (byte) 2);
                    int var11 = var0.method5090(3);
                    var5.method1873(var11, (byte) 2);
                    int var12 = var0.method5090(1);
                    if (var12 == 1) {
                        field689[++field688 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field765[++field815 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("cu.hw(ZLkj;B)V")
    public static final void method2056(boolean arg0, class299 arg1) {
        while (true) {
            if (arg1.method5092(field690.field1307) >= 27) {
                int var2 = arg1.method5090(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field685[var2] == null) {
                        field685[var2] = new class80();
                        var3 = true;
                    }
                    class80 var4 = field685[var2];
                    field764[++field739 - 1] = var2;
                    var4.field941 = field655;
                    int var5 = field697[arg1.method5090(3)];
                    if (var3) {
                        var4.field987 = var4.field937 = var5;
                    }
                    int var6 = arg1.method5090(1);
                    var4.field1126 = class257.method4083(arg1.method5090(14));
                    int var7;
                    if (arg0) {
                        var7 = arg1.method5090(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method5090(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8;
                    if (arg0) {
                        var8 = arg1.method5090(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method5090(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method5090(1);
                    if (var9 == 1) {
                        field689[++field688 - 1] = var2;
                    }
                    var4.field939 = var4.field1126.field3490;
                    var4.field989 = var4.field1126.field3495;
                    if (var4.field989 == 0) {
                        var4.field937 = 0;
                    }
                    var4.field944 = var4.field1126.field3478;
                    var4.field945 = var4.field1126.field3466;
                    var4.field946 = var4.field1126.field3480;
                    var4.field964 = var4.field1126.field3487;
                    var4.field986 = var4.field1126.field3475;
                    var4.field942 = var4.field1126.field3476;
                    var4.field943 = var4.field1126.field3500;
                    var4.method1874(Statics.field2558.field991[0] + var7, Statics.field2558.field956[0] + var8, var6 == 1);
                    continue;
                }
            }
            arg1.method5091();
            return;
        }
    }

    @ObfuscatedName("q.hy(III)Lfg;")
    public static class175 method282(int arg0, int arg1) {
        field916.field2112 = arg0;
        field916.field2116 = arg1;
        field916.field2113 = 1;
        field916.field2114 = 1;
        return field916;
    }

    @ObfuscatedName("fg.hu(I)V")
    public static void method3317() {
        field780 = 0;
        field876 = false;
    }

    @ObfuscatedName("b.hq(I)V")
    public static void method20() {
        method3317();
        field785[0] = class225.field2975;
        field843[0] = "";
        field783[0] = 1006;
        field787[0] = false;
        field780 = 1;
    }

    @ObfuscatedName("client.hp(I)V")
    public final void method1311() {
        method2279();
        if (Statics.field410 != null || field816 != null) {
            return;
        }
        int var22;
        int var25;
        int var26;
        label222: {
            int var1 = class55.field482;
            if (field876) {
                if (var1 != 1 && (Statics.field2055 || var1 != 4)) {
                    int var2 = class55.field473;
                    int var3 = class55.field483;
                    if (var2 < Statics.field1121 - 10 || var2 > Statics.field1536 + Statics.field1121 + 10 || var3 < Statics.field2374 - 10 || var3 > Statics.field2374 + Statics.field1429 + 10) {
                        field876 = false;
                        int var4 = Statics.field1121;
                        int var5 = Statics.field2374;
                        int var6 = Statics.field1536;
                        int var7 = Statics.field1429;
                        for (int var8 = 0; var8 < field846; var8++) {
                            if (field853[var8] + field747[var8] > var4 && field747[var8] < var4 + var6 && field854[var8] + field852[var8] > var5 && field852[var8] < var5 + var7) {
                                field848[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field2055 && var1 == 4) {
                    int var9 = Statics.field1121;
                    int var10 = Statics.field2374;
                    int var11 = Statics.field1536;
                    int var12 = class55.field490;
                    int var13 = class55.field491;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field780; var15++) {
                        int var16 = (field780 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1) {
                        method1042(var14);
                    }
                    field876 = false;
                    int var17 = Statics.field1121;
                    int var18 = Statics.field2374;
                    int var19 = Statics.field1536;
                    int var20 = Statics.field1429;
                    for (int var21 = 0; var21 < field846; var21++) {
                        if (field853[var21] + field747[var21] > var17 && field747[var21] < var17 + var19 && field854[var21] + field852[var21] > var18 && field852[var21] < var18 + var20) {
                            field848[var21] = true;
                        }
                    }
                }
            } else {
                var22 = field780 - 1;
                if ((var1 == 1 || !Statics.field2055 && var1 == 4) && var22 >= 0) {
                    int var24 = field783[var22];
                    if (var24 == 39 || var24 == 40 || var24 == 41 || var24 == 42 || var24 == 43 || var24 == 33 || var24 == 34 || var24 == 35 || var24 == 36 || var24 == 37 || var24 == 38 || var24 == 1005) {
                        var25 = field781[var22];
                        var26 = field782[var22];
                        class218 var27 = class218.method3387(var26);
                        if (class219.method3733(method1899(var27))) {
                            break label222;
                        }
                        int var28 = method1899(var27);
                        boolean var29 = (var28 >> 29 & 0x1) != 0;
                        if (var29) {
                            break label222;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field2055 && var1 == 4) && this.method1166()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field2055 && var1 == 4) && field780 > 0) {
                    method1042(var22);
                }
                if (var1 == 2 && field780 > 0) {
                    this.method1172(class55.field490, class55.field491);
                }
            }
            return;
        }
        if (Statics.field410 != null && !field755 && field780 > 0 && !this.method1166()) {
            int var30 = field752;
            int var31 = field753;
            method3378(Statics.field503, var30, var31);
            Statics.field503 = null;
        }
        field755 = false;
        field912 = 0;
        if (Statics.field410 != null) {
            method1052(Statics.field410);
        }
        Statics.field410 = class218.method3387(var26);
        field751 = var25;
        field752 = class55.field490;
        field753 = class55.field491;
        if (var22 >= 0) {
            method3641(var22);
        }
        method1052(Statics.field410);
    }

    @ObfuscatedName("client.hb(I)Z")
    public final boolean method1166() {
        int var1 = field780 - 1;
        boolean var3 = field671 == 1 && field780 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field783[var1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 1007) {
                    var4 = true;
                } else {
                    var4 = false;
                }
            }
            var3 = var4;
        }
        return var3 && !field787[var1];
    }

    @ObfuscatedName("client.hz(III)V")
    public final void method1172(int arg0, int arg1) {
        method928(arg0, arg1);
        Statics.field3.method2879(Statics.field2321, arg0, arg1, false);
        field876 = true;
    }

    @ObfuscatedName("bx.he(III)V")
    public static void method928(int arg0, int arg1) {
        int var2 = Statics.field2059.method5040(class225.field2930);
        for (int var3 = 0; var3 < field780; var3++) {
            class295 var4 = Statics.field2059;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field843[var3].length() > 0) {
                var5 = field785[var3] + class225.field2921 + field843[var3];
            } else {
                var5 = field785[var3];
            }
            int var6 = var4.method5040(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field780 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1873) {
            var8 = Statics.field1873 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field310) {
            var9 = Statics.field310 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1121 = var8;
        Statics.field2374 = var9;
        Statics.field1536 = var2;
        Statics.field1429 = field780 * 15 + 22;
    }

    @ObfuscatedName("bq.ho(II)V")
    public static final void method1042(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field781[arg0];
        int var2 = field782[arg0];
        int var3 = field783[arg0];
        int var4 = field784[arg0];
        String var5 = field785[arg0];
        String var6 = field843[arg0];
        method514(var1, var2, var3, var4, var5, var6, class55.field490, class55.field491);
    }

    @ObfuscatedName("gc.hi(Lcg;IIB)V")
    public static final void method3378(class83 arg0, int arg1, int arg2) {
        method514(arg0.field1157, arg0.field1150, arg0.field1151, arg0.field1152, arg0.field1153, arg0.field1153, arg1, arg2);
    }

    @ObfuscatedName("aw.hf(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method514(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 7) {
            class80 var8 = field685[arg3];
            if (var8 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var9 = class188.method3035(class184.field2317, field690.field1311);
                var9.field2347.method5231(Statics.field2);
                var9.field2347.method5311(class46.field405[82] ? 1 : 0);
                var9.field2347.method5173(Statics.field1002);
                var9.field2347.method5150(arg3);
                var9.field2347.method5150(Statics.field373);
                field690.method2071(var9);
            }
        }
        if (arg2 == 8) {
            class80 var10 = field685[arg3];
            if (var10 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var11 = class188.method3035(class184.field2301, field690.field1311);
                var11.field2347.method5231(Statics.field331);
                var11.field2347.method5173(field799);
                var11.field2347.method5135(class46.field405[82] ? 1 : 0);
                var11.field2347.method5150(arg3);
                field690.method2071(var11);
            }
        }
        if (arg2 == 37) {
            class188 var12 = class188.method3035(class184.field2251, field690.field1311);
            var12.field2347.method5150(arg3);
            var12.field2347.method5185(arg1);
            var12.field2347.method5150(arg0);
            field690.method2071(var12);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 51) {
            class67 var13 = field759[arg3];
            if (var13 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var14 = class188.method3035(class184.field2243, field690.field1311);
                var14.field2347.method5290(class46.field405[82] ? 1 : 0);
                var14.field2347.method5123(arg3);
                field690.method2071(var14);
            }
        }
        if (arg2 == 40) {
            class188 var15 = class188.method3035(class184.field2311, field690.field1311);
            var15.field2347.method5150(arg3);
            var15.field2347.method5231(arg1);
            var15.field2347.method5175(arg0);
            field690.method2071(var15);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 1) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var16 = class188.method3035(class184.field2245, field690.field1311);
            var16.field2347.method5123(Statics.field429 + arg0);
            var16.field2347.method5165(class46.field405[82] ? 1 : 0);
            var16.field2347.method5175(Statics.field373);
            var16.field2347.method5173(Statics.field1002);
            var16.field2347.method5185(Statics.field2);
            var16.field2347.method5175(arg3);
            var16.field2347.method5123(Statics.field3244 + arg1);
            field690.method2071(var16);
        }
        if (arg2 == 24) {
            class218 var17 = class218.method3387(arg1);
            boolean var18 = true;
            if (var17.field2582 > 0) {
                var18 = method503(var17);
            }
            if (var18) {
                class188 var19 = class188.method3035(class184.field2275, field690.field1311);
                var19.field2347.method5231(arg1);
                field690.method2071(var19);
            }
        }
        if (arg2 == 1001) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var20 = class188.method3035(class184.field2293, field690.field1311);
            var20.field2347.method5135(class46.field405[82] ? 1 : 0);
            var20.field2347.method5150(Statics.field3244 + arg1);
            var20.field2347.method5173(Statics.field429 + arg0);
            var20.field2347.method5150(arg3);
            field690.method2071(var20);
        }
        if (arg2 == 3) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var21 = class188.method3035(class184.field2227, field690.field1311);
            var21.field2347.method5175(Statics.field3244 + arg1);
            var21.field2347.method5175(Statics.field429 + arg0);
            var21.field2347.method5135(class46.field405[82] ? 1 : 0);
            var21.field2347.method5175(arg3);
            field690.method2071(var21);
        }
        if (arg2 == 50) {
            class67 var22 = field759[arg3];
            if (var22 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var23 = class188.method3035(class184.field2252, field690.field1311);
                var23.field2347.method5123(arg3);
                var23.field2347.method5290(class46.field405[82] ? 1 : 0);
                field690.method2071(var23);
            }
        }
        if (arg2 == 31) {
            class188 var24 = class188.method3035(class184.field2249, field690.field1311);
            var24.field2347.method5175(arg3);
            var24.field2347.method5175(Statics.field373);
            var24.field2347.method5348(arg1);
            var24.field2347.method5231(Statics.field2);
            var24.field2347.method5150(Statics.field1002);
            var24.field2347.method5150(arg0);
            field690.method2071(var24);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 20) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var25 = class188.method3035(class184.field2234, field690.field1311);
            var25.field2347.method5290(class46.field405[82] ? 1 : 0);
            var25.field2347.method5150(arg3);
            var25.field2347.method5150(Statics.field3244 + arg1);
            var25.field2347.method5175(Statics.field429 + arg0);
            field690.method2071(var25);
        }
        if (arg2 == 13) {
            class80 var26 = field685[arg3];
            if (var26 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var27 = class188.method3035(class184.field2258, field690.field1311);
                var27.field2347.method5135(class46.field405[82] ? 1 : 0);
                var27.field2347.method5150(arg3);
                field690.method2071(var27);
            }
        }
        if (arg2 == 49) {
            class67 var28 = field759[arg3];
            if (var28 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var29 = class188.method3035(class184.field2242, field690.field1311);
                var29.field2347.method5165(class46.field405[82] ? 1 : 0);
                var29.field2347.method5173(arg3);
                field690.method2071(var29);
            }
        }
        if (arg2 == 43) {
            class188 var30 = class188.method3035(class184.field2318, field690.field1311);
            var30.field2347.method5150(arg3);
            var30.field2347.method5175(arg0);
            var30.field2347.method5348(arg1);
            field690.method2071(var30);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 58) {
            class218 var31 = Statics.method3176(arg1, arg0);
            if (var31 != null) {
                class188 var32 = class188.method3035(class184.field2233, field690.field1311);
                var32.field2347.method5175(field799);
                var32.field2347.method5123(field800);
                var32.field2347.method5173(var31.field2644);
                var32.field2347.method5184(Statics.field331);
                var32.field2347.method5173(arg0);
                var32.field2347.method5348(arg1);
                field690.method2071(var32);
            }
        }
        if (arg2 == 5) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var33 = class188.method3035(class184.field2238, field690.field1311);
            var33.field2347.method5150(Statics.field3244 + arg1);
            var33.field2347.method5150(arg3);
            var33.field2347.method5173(Statics.field429 + arg0);
            var33.field2347.method5135(class46.field405[82] ? 1 : 0);
            field690.method2071(var33);
        }
        if (arg2 == 18) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var34 = class188.method3035(class184.field2237, field690.field1311);
            var34.field2347.method5135(class46.field405[82] ? 1 : 0);
            var34.field2347.method5173(arg3);
            var34.field2347.method5123(Statics.field3244 + arg1);
            var34.field2347.method5173(Statics.field429 + arg0);
            field690.method2071(var34);
        }
        if (arg2 == 35) {
            class188 var35 = class188.method3035(class184.field2223, field690.field1311);
            var35.field2347.method5123(arg0);
            var35.field2347.method5123(arg3);
            var35.field2347.method5184(arg1);
            field690.method2071(var35);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 41) {
            class188 var36 = class188.method3035(class184.field2316, field690.field1311);
            var36.field2347.method5175(arg3);
            var36.field2347.method5123(arg0);
            var36.field2347.method5184(arg1);
            field690.method2071(var36);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 11) {
            class80 var37 = field685[arg3];
            if (var37 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var38 = class188.method3035(class184.field2309, field690.field1311);
                var38.field2347.method5150(arg3);
                var38.field2347.method5165(class46.field405[82] ? 1 : 0);
                field690.method2071(var38);
            }
        }
        if (arg2 == 16) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var39 = class188.method3035(class184.field2285, field690.field1311);
            var39.field2347.method5150(Statics.field373);
            var39.field2347.method5175(Statics.field429 + arg0);
            var39.field2347.method5348(Statics.field2);
            var39.field2347.method5123(Statics.field3244 + arg1);
            var39.field2347.method5165(class46.field405[82] ? 1 : 0);
            var39.field2347.method5175(Statics.field1002);
            var39.field2347.method5150(arg3);
            field690.method2071(var39);
        }
        if (arg2 == 30 && field779 == null) {
            method538(arg1, arg0);
            field779 = Statics.method3176(arg1, arg0);
            method1052(field779);
        }
        if (arg2 == 15) {
            class67 var40 = field759[arg3];
            if (var40 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var41 = class188.method3035(class184.field2226, field690.field1311);
                var41.field2347.method5150(arg3);
                var41.field2347.method5348(Statics.field331);
                var41.field2347.method5165(class46.field405[82] ? 1 : 0);
                var41.field2347.method5150(field799);
                field690.method2071(var41);
            }
        }
        if (arg2 == 1005) {
            class218 var42 = class218.method3387(arg1);
            if (var42 == null || var42.field2703[arg0] < 100000) {
                class188 var43 = class188.method3035(class184.field2294, field690.field1311);
                var43.field2347.method5173(arg3);
                field690.method2071(var43);
            } else {
                class92.method151(27, "", var42.field2703[arg0] + " x " + class255.method1847(arg3).field3450);
            }
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 25) {
            class218 var44 = Statics.method3176(arg1, arg0);
            if (var44 != null) {
                method1590();
                method2544(arg1, arg0, class219.method1480(method1899(var44)), var44.field2644);
                field802 = 0;
                field801 = method3338(var44);
                if (field801 == null) {
                    field801 = class225.field2777;
                }
                if (var44.field2659) {
                    field718 = var44.field2602 + class82.method3813(16777215);
                } else {
                    field718 = class82.method3813(65280) + var44.field2611 + class82.method3813(16777215);
                }
            }
            return;
        }
        if (arg2 == 4) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var45 = class188.method3035(class184.field2298, field690.field1311);
            var45.field2347.method5165(class46.field405[82] ? 1 : 0);
            var45.field2347.method5173(Statics.field3244 + arg1);
            var45.field2347.method5173(arg3);
            var45.field2347.method5123(Statics.field429 + arg0);
            field690.method2071(var45);
        }
        if (arg2 == 45) {
            class67 var46 = field759[arg3];
            if (var46 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var47 = class188.method3035(class184.field2239, field690.field1311);
                var47.field2347.method5135(class46.field405[82] ? 1 : 0);
                var47.field2347.method5175(arg3);
                field690.method2071(var47);
            }
        }
        if (arg2 == 2) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var48 = class188.method3035(class184.field2264, field690.field1311);
            var48.field2347.method5173(field799);
            var48.field2347.method5150(arg3);
            var48.field2347.method5150(Statics.field3244 + arg1);
            var48.field2347.method5231(Statics.field331);
            var48.field2347.method5165(class46.field405[82] ? 1 : 0);
            var48.field2347.method5175(Statics.field429 + arg0);
            field690.method2071(var48);
        }
        if (arg2 == 48) {
            class67 var49 = field759[arg3];
            if (var49 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var50 = class188.method3035(class184.field2266, field690.field1311);
                var50.field2347.method5175(arg3);
                var50.field2347.method5290(class46.field405[82] ? 1 : 0);
                field690.method2071(var50);
            }
        }
        if (arg2 == 33) {
            class188 var51 = class188.method3035(class184.field2280, field690.field1311);
            var51.field2347.method5173(arg3);
            var51.field2347.method5150(arg0);
            var51.field2347.method5184(arg1);
            field690.method2071(var51);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 36) {
            class188 var52 = class188.method3035(class184.field2236, field690.field1311);
            var52.field2347.method5348(arg1);
            var52.field2347.method5175(arg0);
            var52.field2347.method5175(arg3);
            field690.method2071(var52);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 1002) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            class188 var53 = class188.method3035(class184.field2305, field690.field1311);
            var53.field2347.method5123(arg3);
            field690.method2071(var53);
        }
        if (arg2 == 17) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var54 = class188.method3035(class184.field2255, field690.field1311);
            var54.field2347.method5150(Statics.field429 + arg0);
            var54.field2347.method5135(class46.field405[82] ? 1 : 0);
            var54.field2347.method5123(Statics.field3244 + arg1);
            var54.field2347.method5175(arg3);
            var54.field2347.method5185(Statics.field331);
            var54.field2347.method5173(field799);
            field690.method2071(var54);
        }
        if (arg2 == 38) {
            method1590();
            class218 var55 = class218.method3387(arg1);
            field802 = 1;
            Statics.field373 = arg0;
            Statics.field2 = arg1;
            Statics.field1002 = arg3;
            method1052(var55);
            field687 = class82.method3813(16748608) + class255.method1847(arg3).field3450 + class82.method3813(16777215);
            if (field687 == null) {
                field687 = class225.field2777;
            }
            return;
        }
        if (arg2 == 28) {
            class188 var56 = class188.method3035(class184.field2275, field690.field1311);
            var56.field2347.method5231(arg1);
            field690.method2071(var56);
            class218 var57 = class218.method3387(arg1);
            if (var57.field2571 != null && var57.field2571[0][0] == 5) {
                int var58 = var57.field2571[0][1];
                class213.field2531[var58] = 1 - class213.field2531[var58];
                method4282(var58);
            }
        }
        if (arg2 == 29) {
            class188 var59 = class188.method3035(class184.field2275, field690.field1311);
            var59.field2347.method5231(arg1);
            field690.method2071(var59);
            class218 var60 = class218.method3387(arg1);
            if (var60.field2571 != null && var60.field2571[0][0] == 5) {
                int var61 = var60.field2571[0][1];
                if (class213.field2531[var61] != var60.field2651[0]) {
                    class213.field2531[var61] = var60.field2651[0];
                    method4282(var61);
                }
            }
        }
        if (arg2 == 21) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var62 = class188.method3035(class184.field2265, field690.field1311);
            var62.field2347.method5150(Statics.field3244 + arg1);
            var62.field2347.method5311(class46.field405[82] ? 1 : 0);
            var62.field2347.method5123(arg3);
            var62.field2347.method5150(Statics.field429 + arg0);
            field690.method2071(var62);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field255.method5911(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 47) {
            class67 var63 = field759[arg3];
            if (var63 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var64 = class188.method3035(class184.field2268, field690.field1311);
                var64.field2347.method5150(arg3);
                var64.field2347.method5290(class46.field405[82] ? 1 : 0);
                field690.method2071(var64);
            }
        }
        if (arg2 == 34) {
            class188 var65 = class188.method3035(class184.field2295, field690.field1311);
            var65.field2347.method5123(arg0);
            var65.field2347.method5123(arg3);
            var65.field2347.method5185(arg1);
            field690.method2071(var65);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 1003) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            class80 var66 = field685[arg3];
            if (var66 != null) {
                class257 var67 = var66.field1126;
                if (var67.field3496 != null) {
                    var67 = var67.method4426();
                }
                if (var67 != null) {
                    class188 var68 = class188.method3035(class184.field2289, field690.field1311);
                    var68.field2347.method5123(var67.field3470);
                    field690.method2071(var68);
                }
            }
        }
        if (arg2 == 23) {
            if (field876) {
                Statics.field3.method2883();
            } else {
                Statics.field3.method2879(Statics.field2321, arg0, arg1, true);
            }
        }
        if (arg2 == 42) {
            class188 var69 = class188.method3035(class184.field2254, field690.field1311);
            var69.field2347.method5348(arg1);
            var69.field2347.method5173(arg0);
            var69.field2347.method5150(arg3);
            field690.method2071(var69);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 10) {
            class80 var70 = field685[arg3];
            if (var70 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var71 = class188.method3035(class184.field2246, field690.field1311);
                var71.field2347.method5175(arg3);
                var71.field2347.method5135(class46.field405[82] ? 1 : 0);
                field690.method2071(var71);
            }
        }
        if (arg2 == 32) {
            class188 var72 = class188.method3035(class184.field2270, field690.field1311);
            var72.field2347.method5231(arg1);
            var72.field2347.method5231(Statics.field331);
            var72.field2347.method5150(arg0);
            var72.field2347.method5150(arg3);
            var72.field2347.method5123(field799);
            field690.method2071(var72);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 46) {
            class67 var73 = field759[arg3];
            if (var73 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var74 = class188.method3035(class184.field2262, field690.field1311);
                var74.field2347.method5290(class46.field405[82] ? 1 : 0);
                var74.field2347.method5123(arg3);
                field690.method2071(var74);
            }
        }
        if (arg2 == 14) {
            class67 var75 = field759[arg3];
            if (var75 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var76 = class188.method3035(class184.field2287, field690.field1311);
                var76.field2347.method5173(Statics.field1002);
                var76.field2347.method5311(class46.field405[82] ? 1 : 0);
                var76.field2347.method5231(Statics.field2);
                var76.field2347.method5175(arg3);
                var76.field2347.method5150(Statics.field373);
                field690.method2071(var76);
            }
        }
        if (arg2 == 44) {
            class67 var77 = field759[arg3];
            if (var77 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var78 = class188.method3035(class184.field2232, field690.field1311);
                var78.field2347.method5135(class46.field405[82] ? 1 : 0);
                var78.field2347.method5150(arg3);
                field690.method2071(var78);
            }
        }
        if (arg2 == 12) {
            class80 var79 = field685[arg3];
            if (var79 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var80 = class188.method3035(class184.field2244, field690.field1311);
                var80.field2347.method5165(class46.field405[82] ? 1 : 0);
                var80.field2347.method5175(arg3);
                field690.method2071(var80);
            }
        }
        if (arg2 == 26) {
            method1577();
        }
        if (arg2 == 19) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var81 = class188.method3035(class184.field2228, field690.field1311);
            var81.field2347.method5175(Statics.field429 + arg0);
            var81.field2347.method5135(class46.field405[82] ? 1 : 0);
            var81.field2347.method5173(arg3);
            var81.field2347.method5123(Statics.field3244 + arg1);
            field690.method2071(var81);
        }
        if (arg2 == 39) {
            class188 var82 = class188.method3035(class184.field2304, field690.field1311);
            var82.field2347.method5175(arg0);
            var82.field2347.method5150(arg3);
            var82.field2347.method5348(arg1);
            field690.method2071(var82);
            field665 = 0;
            Statics.field433 = class218.method3387(arg1);
            field750 = arg0;
        }
        if (arg2 == 9) {
            class80 var83 = field685[arg3];
            if (var83 != null) {
                field744 = arg6;
                field649 = arg7;
                field719 = 2;
                field746 = 0;
                field873 = arg0;
                field874 = arg1;
                class188 var84 = class188.method3035(class184.field2256, field690.field1311);
                var84.field2347.method5173(arg3);
                var84.field2347.method5311(class46.field405[82] ? 1 : 0);
                field690.method2071(var84);
            }
        }
        if (arg2 == 22) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var85 = class188.method3035(class184.field2221, field690.field1311);
            var85.field2347.method5175(Statics.field3244 + arg1);
            var85.field2347.method5311(class46.field405[82] ? 1 : 0);
            var85.field2347.method5150(arg3);
            var85.field2347.method5123(Statics.field429 + arg0);
            field690.method2071(var85);
        }
        if (arg2 == 6) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            field873 = arg0;
            field874 = arg1;
            class188 var86 = class188.method3035(class184.field2253, field690.field1311);
            var86.field2347.method5311(class46.field405[82] ? 1 : 0);
            var86.field2347.method5175(Statics.field3244 + arg1);
            var86.field2347.method5173(arg3);
            var86.field2347.method5150(Statics.field429 + arg0);
            field690.method2071(var86);
        }
        if (arg2 == 1004) {
            field744 = arg6;
            field649 = arg7;
            field719 = 2;
            field746 = 0;
            class188 var87 = class188.method3035(class184.field2294, field690.field1311);
            var87.field2347.method5173(arg3);
            field690.method2071(var87);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var88 = Statics.method3176(arg1, arg0);
            if (var88 != null) {
                method590(arg3, arg1, arg0, var88.field2644, arg5);
            }
        }
        if (field802 != 0) {
            field802 = 0;
            method1052(class218.method3387(Statics.field2));
        }
        if (field798) {
            method1590();
        }
        if (Statics.field433 != null && field665 == 0) {
            method1052(Statics.field433);
        }
    }

    @ObfuscatedName("fe.ic(ILjava/lang/String;I)V")
    public static void method3165(int arg0, String arg1) {
        int var2 = class90.field1250;
        int[] var3 = class90.field1251;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field120);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field759[var3[var6]];
            if (var7 != null && Statics.field2558 != var7 && var7.field607 != null && var7.field607.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method3035(class184.field2232, field690.field1311);
                    var8.field2347.method5135(0);
                    var8.field2347.method5150(var3[var6]);
                    field690.method2071(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method3035(class184.field2268, field690.field1311);
                    var9.field2347.method5150(var3[var6]);
                    var9.field2347.method5290(0);
                    field690.method2071(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method3035(class184.field2242, field690.field1311);
                    var10.field2347.method5165(0);
                    var10.field2347.method5173(var3[var6]);
                    field690.method2071(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method3035(class184.field2252, field690.field1311);
                    var11.field2347.method5123(var3[var6]);
                    var11.field2347.method5290(0);
                    field690.method2071(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method151(4, "", class225.field2922 + arg1);
        }
    }

    @ObfuscatedName("db.ij(IIIIB)V")
    public static void method2544(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = Statics.method3176(arg0, arg1);
        if (var4 != null && var4.field2620 != null) {
            class63 var5 = new class63();
            var5.field570 = var4;
            var5.field568 = var4.field2620;
            class77.method371(var5);
        }
        field800 = arg3;
        field798 = true;
        Statics.field331 = arg0;
        field799 = arg1;
        Statics.field982 = arg2;
        method1052(var4);
    }

    @ObfuscatedName("bt.im(B)V")
    public static void method1590() {
        if (!field798) {
            return;
        }
        class218 var0 = Statics.method3176(Statics.field331, field799);
        if (var0 != null && var0.field2676 != null) {
            class63 var1 = new class63();
            var1.field570 = var0;
            var1.field568 = var0.field2676;
            class77.method371(var1);
        }
        field798 = false;
        method1052(var0);
    }

    @ObfuscatedName("ab.if(IIB)V")
    public static void method538(int arg0, int arg1) {
        class188 var2 = class188.method3035(class184.field2276, field690.field1311);
        var2.field2347.method5150(arg1);
        var2.field2347.method5231(arg0);
        field690.method2071(var2);
    }

    @ObfuscatedName("ac.ik(IIIILjava/lang/String;B)V")
    public static void method590(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = Statics.method3176(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2684 != null) {
            class63 var6 = new class63();
            var6.field570 = var5;
            var6.field573 = arg0;
            var6.field577 = arg4;
            var6.field568 = var5.field2684;
            class77.method371(var6);
        }
        boolean var7 = true;
        if (var5.field2582 > 0) {
            var7 = method503(var5);
        }
        if (!var7 || !class219.method551(method1899(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class188 var8 = class188.method3035(class184.field2300, field690.field1311);
            var8.field2347.method5231(arg1);
            var8.field2347.method5123(arg2);
            var8.field2347.method5123(arg3);
            field690.method2071(var8);
        }
        if (arg0 == 2) {
            class188 var9 = class188.method3035(class184.field2314, field690.field1311);
            var9.field2347.method5231(arg1);
            var9.field2347.method5123(arg2);
            var9.field2347.method5123(arg3);
            field690.method2071(var9);
        }
        if (arg0 == 3) {
            class188 var10 = class188.method3035(class184.field2299, field690.field1311);
            var10.field2347.method5231(arg1);
            var10.field2347.method5123(arg2);
            var10.field2347.method5123(arg3);
            field690.method2071(var10);
        }
        if (arg0 == 4) {
            class188 var11 = class188.method3035(class184.field2307, field690.field1311);
            var11.field2347.method5231(arg1);
            var11.field2347.method5123(arg2);
            var11.field2347.method5123(arg3);
            field690.method2071(var11);
        }
        if (arg0 == 5) {
            class188 var12 = class188.method3035(class184.field2288, field690.field1311);
            var12.field2347.method5231(arg1);
            var12.field2347.method5123(arg2);
            var12.field2347.method5123(arg3);
            field690.method2071(var12);
        }
        if (arg0 == 6) {
            class188 var13 = class188.method3035(class184.field2277, field690.field1311);
            var13.field2347.method5231(arg1);
            var13.field2347.method5123(arg2);
            var13.field2347.method5123(arg3);
            field690.method2071(var13);
        }
        if (arg0 == 7) {
            class188 var14 = class188.method3035(class184.field2248, field690.field1311);
            var14.field2347.method5231(arg1);
            var14.field2347.method5123(arg2);
            var14.field2347.method5123(arg3);
            field690.method2071(var14);
        }
        if (arg0 == 8) {
            class188 var15 = class188.method3035(class184.field2260, field690.field1311);
            var15.field2347.method5231(arg1);
            var15.field2347.method5123(arg2);
            var15.field2347.method5123(arg3);
            field690.method2071(var15);
        }
        if (arg0 == 9) {
            class188 var16 = class188.method3035(class184.field2241, field690.field1311);
            var16.field2347.method5231(arg1);
            var16.field2347.method5123(arg2);
            var16.field2347.method5123(arg3);
            field690.method2071(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var17 = class188.method3035(class184.field2274, field690.field1311);
        var17.field2347.method5231(arg1);
        var17.field2347.method5123(arg2);
        var17.field2347.method5123(arg3);
        field690.method2071(var17);
    }

    @ObfuscatedName("de.it(I)V")
    public static final void method2279() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field780 - 1; var1++) {
                if (field783[var1] < 1000 && field783[var1 + 1] > 1000) {
                    String var2 = field843[var1];
                    field843[var1] = field843[var1 + 1];
                    field843[var1 + 1] = var2;
                    String var3 = field785[var1];
                    field785[var1] = field785[var1 + 1];
                    field785[var1 + 1] = var3;
                    int var4 = field783[var1];
                    field783[var1] = field783[var1 + 1];
                    field783[var1 + 1] = var4;
                    int var5 = field781[var1];
                    field781[var1] = field781[var1 + 1];
                    field781[var1 + 1] = var5;
                    int var6 = field782[var1];
                    field782[var1] = field782[var1 + 1];
                    field782[var1 + 1] = var6;
                    int var7 = field784[var1];
                    field784[var1] = field784[var1 + 1];
                    field784[var1 + 1] = var7;
                    boolean var8 = field787[var1];
                    field787[var1] = field787[var1 + 1];
                    field787[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ad.ib(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method367(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("n.is(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method159(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field876 || field780 >= 500) {
            return;
        }
        field785[field780] = arg0;
        field843[field780] = arg1;
        field783[field780] = arg2;
        field784[field780] = arg3;
        field781[field780] = arg4;
        field782[field780] = arg5;
        field787[field780] = arg6;
        field780++;
    }

    @ObfuscatedName("hm.ia(B)V")
    public static void method3667() {
        for (int var0 = 0; var0 < field780; var0++) {
            if (method2108(field783[var0])) {
                if (var0 < field780 - 1) {
                    for (int var1 = var0; var1 < field780 - 1; var1++) {
                        field785[var1] = field785[var1 + 1];
                        field843[var1] = field843[var1 + 1];
                        field783[var1] = field783[var1 + 1];
                        field784[var1] = field784[var1 + 1];
                        field781[var1] = field781[var1 + 1];
                        field782[var1] = field782[var1 + 1];
                        field787[var1] = field787[var1 + 1];
                    }
                }
                var0--;
                field780--;
            }
        }
        method928(Statics.field1536 / 2 + Statics.field1121, Statics.field2374);
    }

    @ObfuscatedName("cp.ir(IB)Z")
    public static boolean method2108(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cj.ig(IIIIB)V")
    public static final void method2016(int arg0, int arg1, int arg2, int arg3) {
        if (field802 == 0 && !field798) {
            method367(class225.field2918, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1736;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class129.method246(var4);
                    class67 var14 = field759[field745];
                    method3037(var14, field745, var11, var13);
                }
                return;
            }
            long var15 = class129.method2301(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var17 = class129.method1600(var8);
                    int var18 = class129.method123(var8);
                    long var19 = class129.field1737[var8];
                    int var21 = (int) (var19 >>> 14 & 0x3L);
                    int var24 = class129.method1028(class129.field1737[var8]);
                    int var25 = var24;
                    if (var21 == 2 && Statics.field3.method2873(Statics.field2321, var17, var18, var15) >= 0) {
                        class254 var26 = class254.method3048(var24);
                        if (var26.field3395 != null) {
                            var26 = var26.method4321();
                        }
                        if (var26 == null) {
                            break label277;
                        }
                        if (field802 == 1) {
                            method367(class225.field2923, field687 + " " + class82.field1142 + " " + class82.method3813(65535) + var26.field3364, 1, var24, var17, var18);
                        } else if (!field798) {
                            String[] var27 = var26.field3381;
                            if (var27 != null) {
                                for (int var28 = 4; var28 >= 0; var28--) {
                                    if (var27[var28] != null) {
                                        short var29 = 0;
                                        if (var28 == 0) {
                                            var29 = 3;
                                        }
                                        if (var28 == 1) {
                                            var29 = 4;
                                        }
                                        if (var28 == 2) {
                                            var29 = 5;
                                        }
                                        if (var28 == 3) {
                                            var29 = 6;
                                        }
                                        if (var28 == 4) {
                                            var29 = 1001;
                                        }
                                        method367(var27[var28], class82.method3813(65535) + var26.field3364, var29, var25, var17, var18);
                                    }
                                }
                            }
                            method367(class225.field2937, class82.method3813(65535) + var26.field3364, 1002, var26.field3355, var17, var18);
                        } else if ((Statics.field982 & 0x4) == 4) {
                            method367(field801, field718 + " " + class82.field1142 + " " + class82.method3813(65535) + var26.field3364, 2, var24, var17, var18);
                        }
                    }
                    if (var21 == 1) {
                        class80 var30 = field685[var25];
                        if (var30 == null) {
                            break label277;
                        }
                        if (var30.field1126.field3490 == 1 && (var30.field992 & 0x7F) == 64 && (var30.field936 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field739; var31++) {
                                class80 var32 = field685[field764[var31]];
                                if (var32 != null && var30 != var32 && var32.field1126.field3490 == 1 && var30.field992 == var32.field992 && var30.field936 == var32.field936) {
                                    method3339(var32.field1126, field764[var31], var17, var18);
                                }
                            }
                            int var33 = class90.field1250;
                            int[] var34 = class90.field1251;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class67 var36 = field759[var34[var35]];
                                if (var36 != null && var30.field992 == var36.field992 && var30.field936 == var36.field936) {
                                    method3037(var36, var34[var35], var17, var18);
                                }
                            }
                        }
                        method3339(var30.field1126, var25, var17, var18);
                    }
                    if (var21 == 0) {
                        class67 var37 = field759[var25];
                        if (var37 == null) {
                            break label277;
                        }
                        if ((var37.field992 & 0x7F) == 64 && (var37.field936 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field739; var38++) {
                                class80 var39 = field685[field764[var38]];
                                if (var39 != null && var39.field1126.field3490 == 1 && var37.field992 == var39.field992 && var37.field936 == var39.field936) {
                                    method3339(var39.field1126, field764[var38], var17, var18);
                                }
                            }
                            int var40 = class90.field1250;
                            int[] var41 = class90.field1251;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class67 var43 = field759[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field992 == var43.field992 && var37.field936 == var43.field936) {
                                    method3037(var43, var41[var42], var17, var18);
                                }
                            }
                        }
                        if (field745 == var25) {
                            var4 = var15;
                        } else {
                            method3037(var37, var25, var17, var18);
                        }
                    }
                    if (var21 == 3) {
                        class262 var44 = field771[Statics.field2321][var17][var18];
                        if (var44 != null) {
                            for (class88 var45 = (class88) var44.method4569(); var45 != null; var45 = (class88) var44.method4597()) {
                                class255 var46 = class255.method1847(var45.field1236);
                                if (field802 == 1) {
                                    method367(class225.field2923, field687 + " " + class82.field1142 + " " + class82.method3813(16748608) + var46.field3450, 16, var45.field1236, var17, var18);
                                } else if (!field798) {
                                    String[] var47 = var46.field3426;
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        if (var47 != null && var47[var48] != null) {
                                            byte var49 = 0;
                                            if (var48 == 0) {
                                                var49 = 18;
                                            }
                                            if (var48 == 1) {
                                                var49 = 19;
                                            }
                                            if (var48 == 2) {
                                                var49 = 20;
                                            }
                                            if (var48 == 3) {
                                                var49 = 21;
                                            }
                                            if (var48 == 4) {
                                                var49 = 22;
                                            }
                                            method367(var47[var48], class82.method3813(16748608) + var46.field3450, var49, var45.field1236, var17, var18);
                                        } else if (var48 == 2) {
                                            method367(class225.field2770, class82.method3813(16748608) + var46.field3450, 20, var45.field1236, var17, var18);
                                        }
                                    }
                                    method367(class225.field2937, class82.method3813(16748608) + var46.field3450, 1004, var45.field1236, var17, var18);
                                } else if ((Statics.field982 & 0x1) == 1) {
                                    method367(field801, field718 + " " + class82.field1142 + " " + class82.method3813(16748608) + var46.field3450, 17, var45.field1236, var17, var18);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("gn.ie(Lih;IIII)V")
    public static final void method3339(class257 arg0, int arg1, int arg2, int arg3) {
        if (field780 >= 400) {
            return;
        }
        if (arg0.field3496 != null) {
            arg0 = arg0.method4426();
        }
        if (arg0 == null || !arg0.field3499 || arg0.field3501 && field813 != arg1) {
            return;
        }
        String var4 = arg0.field3481;
        if (arg0.field3479 != 0) {
            var4 = var4 + method57(arg0.field3479, Statics.field2558.field611) + " " + class82.field1140 + class225.field2929 + arg0.field3479 + class82.field1139;
        }
        if (arg0.field3501 && field788) {
            method367(class225.field2937, class82.method3813(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field802 == 1) {
            method367(class225.field2923, field687 + " " + class82.field1142 + " " + class82.method3813(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field798) {
            int var5 = arg0.field3501 && field788 ? 2000 : 0;
            String[] var6 = arg0.field3486;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class225.field2925)) {
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
                        method367(var6[var7], class82.method3813(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class225.field2925)) {
                        short var10 = 0;
                        if (field731 != class85.field1168) {
                            if (field731 == class85.field1165 || field731 == class85.field1171 && arg0.field3479 > Statics.field2558.field611) {
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
                            method367(var6[var9], class82.method3813(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3501 || !field788) {
                method367(class225.field2937, class82.method3813(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field982 & 0x2) == 2) {
            method367(field801, field718 + " " + class82.field1142 + " " + class82.method3813(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.iz(Lbg;IIIB)V")
    public static final void method3037(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2558 == arg0 || field780 >= 400) {
            return;
        }
        String var4;
        if (arg0.field612 == 0) {
            var4 = arg0.field610[0] + arg0.field607 + arg0.field610[1] + method57(arg0.field611, Statics.field2558.field611) + " " + class82.field1140 + class225.field2929 + arg0.field611 + class82.field1139 + arg0.field610[2];
        } else {
            var4 = arg0.field610[0] + arg0.field607 + arg0.field610[1] + " " + class82.field1140 + class225.field2782 + arg0.field612 + class82.field1139 + arg0.field610[2];
        }
        if (field802 == 1) {
            method367(class225.field2923, field687 + " " + class82.field1142 + " " + class82.method3813(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field798) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field756[var5] != null) {
                    short var6 = 0;
                    if (field756[var5].equalsIgnoreCase(class225.field2925)) {
                        if (field882 == class85.field1168) {
                            continue;
                        }
                        if (field882 == class85.field1165 || field882 == class85.field1171 && arg0.field611 > Statics.field2558.field611) {
                            var6 = 2000;
                        }
                        if (Statics.field2558.field625 != 0 && arg0.field625 != 0) {
                            if (Statics.field2558.field625 == arg0.field625) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field768[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field766[var5] + var6;
                    method367(field756[var5], class82.method3813(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field982 & 0x8) == 8) {
            method367(field801, field718 + " " + class82.field1142 + " " + class82.method3813(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field780; var9++) {
            if (field783[var9] == 23) {
                field843[var9] = class82.method3813(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("p.iv(III)Ljava/lang/String;")
    public static final String method57(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class82.method3813(16711680);
        } else if (var2 < -6) {
            return class82.method3813(16723968);
        } else if (var2 < -3) {
            return class82.method3813(16740352);
        } else if (var2 < 0) {
            return class82.method3813(16756736);
        } else if (var2 > 9) {
            return class82.method3813(65280);
        } else if (var2 > 6) {
            return class82.method3813(4259584);
        } else if (var2 > 3) {
            return class82.method3813(8453888);
        } else if (var2 > 0) {
            return class82.method3813(12648192);
        } else {
            return class82.method3813(16776960);
        }
    }

    @ObfuscatedName("bb.iq(IIIIIIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method3170(arg0)) {
            Statics.field23 = null;
            method643(Statics.field1608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field23 != null) {
                method643(Statics.field23, -1412584499, arg1, arg2, arg3, arg4, Statics.field201, Statics.field1783, arg7);
                Statics.field23 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field848[var8] = true;
            }
        } else {
            field848[arg7] = true;
        }
    }

    @ObfuscatedName("az.io([Lhl;IIIIIIIII)V")
    public static final void method643(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5588(arg2, arg3, arg4, arg5);
        class131.method2786();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2597 == arg1 || arg1 == -1412584499 && field816 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field747[field846] = var10.field2591 + arg6;
                    field852[field846] = var10.field2592 + arg7;
                    field853[field846] = var10.field2639;
                    field854[field846] = var10.field2594;
                    var11 = ++field846 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2705 = var11;
                var10.field2716 = field655;
                if (!var10.field2659 || !method3633(var10)) {
                    if (var10.field2582 > 0) {
                        method4812(var10);
                    }
                    int var12 = var10.field2591 + arg6;
                    int var13 = var10.field2592 + arg7;
                    int var14 = var10.field2609;
                    if (field816 == var10) {
                        if (arg1 != -1412584499 && !var10.field2626) {
                            Statics.field23 = arg0;
                            Statics.field201 = arg6;
                            Statics.field1783 = arg7;
                            continue;
                        }
                        if (field672 && field821) {
                            int var15 = class55.field473;
                            int var16 = class55.field483;
                            int var17 = var15 - field818;
                            int var18 = var16 - field722;
                            if (var17 < field699) {
                                var17 = field699;
                            }
                            if (var10.field2639 + var17 > field699 + field817.field2639) {
                                var17 = field699 + field817.field2639 - var10.field2639;
                            }
                            if (var18 < field823) {
                                var18 = field823;
                            }
                            if (var10.field2594 + var18 > field823 + field817.field2594) {
                                var18 = field823 + field817.field2594 - var10.field2594;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2626) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2580 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2580 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2639 + var12;
                        int var26 = var10.field2594 + var13;
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
                        int var29 = var10.field2639 + var12;
                        int var30 = var10.field2594 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2659 || var19 < var21 && var20 < var22) {
                        if (var10.field2582 != 0) {
                            if (var10.field2582 == 1336) {
                                if (field661) {
                                    var13 += 15;
                                    Statics.field635.method4995("Fps:" + field445, var10.field2639 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field847) {
                                        var33 = 16711680;
                                    }
                                    Statics.field635.method4995("Mem:" + var32 + "k", var10.field2639 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2582 == 1337) {
                                field778 = var12;
                                field793 = var13;
                                method670(var12, var13, var10.field2639, var10.field2594);
                                field848[var10.field2705] = true;
                                class321.method5588(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2582 == 1338) {
                                method3409(var10, var12, var13, var11);
                                class321.method5588(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2582 == 1339) {
                                method1941(var10, var12, var13, var11);
                                class321.method5588(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2582 == 1400) {
                                Statics.field255.method5907(var12, var13, var10.field2639, var10.field2594, field655);
                            }
                            if (var10.field2582 == 1401) {
                                Statics.field255.method5877(var12, var13, var10.field2639, var10.field2594);
                            }
                            if (var10.field2582 == 1402) {
                                Statics.field1296.method1647(var12, field655);
                            }
                        }
                        if (var10.field2580 == 0) {
                            if (!var10.field2659 && method3633(var10) && Statics.field2339 != var10) {
                                continue;
                            }
                            if (!var10.field2659) {
                                if (var10.field2568 > var10.field2688 - var10.field2594) {
                                    var10.field2568 = var10.field2688 - var10.field2594;
                                }
                                if (var10.field2568 < 0) {
                                    var10.field2568 = 0;
                                }
                            }
                            method643(arg0, var10.field2578, var19, var20, var21, var22, var12 - var10.field2711, var13 - var10.field2568, var11);
                            if (var10.field2708 != null) {
                                method643(var10.field2708, var10.field2578, var19, var20, var21, var22, var12 - var10.field2711, var13 - var10.field2568, var11);
                            }
                            class62 var34 = (class62) field804.method5549((long) var10.field2578);
                            if (var34 != null) {
                                method1091(var34.field564, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5588(arg2, arg3, arg4, arg5);
                            class131.method2786();
                        }
                        if (field857 || field850[var11] || field794 > 1) {
                            if (var10.field2580 == 0 && !var10.field2659 && var10.field2688 > var10.field2594) {
                                method3223(var10.field2639 + var12, var13, var10.field2568, var10.field2594, var10.field2688);
                            }
                            if (var10.field2580 != 1) {
                                if (var10.field2580 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2590; var36++) {
                                        for (int var37 = 0; var37 < var10.field2589; var37++) {
                                            int var38 = (var10.field2645 + 32) * var37 + var12;
                                            int var39 = (var10.field2584 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2647[var35];
                                                var39 += var10.field2666[var35];
                                            }
                                            if (var10.field2630[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2630[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field410 == var10 && field751 == var35) {
                                                    class325 var43;
                                                    if (field802 == 1 && Statics.field373 == var35 && Statics.field2 == var10.field2578) {
                                                        var43 = class255.method2753(var42, var10.field2703[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method2753(var42, var10.field2703[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1052(var10);
                                                    } else if (Statics.field410 == var10 && field751 == var35) {
                                                        int var44 = class55.field473 - field752;
                                                        int var45 = class55.field483 - field753;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field912 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5697(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3847 && var46.field2568 > 0) {
                                                                int var47 = field705 * (class321.field3847 - var39 - var45) / 3;
                                                                if (var47 > field705 * 10) {
                                                                    var47 = field705 * 10;
                                                                }
                                                                if (var47 > var46.field2568) {
                                                                    var47 = var46.field2568;
                                                                }
                                                                var46.field2568 -= var47;
                                                                field753 += var47;
                                                                method1052(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3849 && var46.field2568 < var46.field2688 - var46.field2594) {
                                                                int var48 = field705 * (var39 + var45 + 32 - class321.field3849) / 3;
                                                                if (var48 > field705 * 10) {
                                                                    var48 = field705 * 10;
                                                                }
                                                                if (var48 > var46.field2688 - var46.field2594 - var46.field2568) {
                                                                    var48 = var46.field2688 - var46.field2594 - var46.field2568;
                                                                }
                                                                var46.field2568 += var48;
                                                                field753 -= var48;
                                                                method1052(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field433 == var10 && field750 == var35) {
                                                        var43.method5697(var38, var39, 128);
                                                    } else {
                                                        var43.method5691(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2649 != null && var35 < 20) {
                                                class325 var49 = var10.method3751(var35);
                                                if (var49 != null) {
                                                    var49.method5691(var38, var39);
                                                } else if (class218.field2648) {
                                                    method1052(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2580 == 3) {
                                    int var50;
                                    if (method337(var10)) {
                                        var50 = var10.field2604;
                                        if (Statics.field2339 == var10 && var10.field2606 != 0) {
                                            var50 = var10.field2606;
                                        }
                                    } else {
                                        var50 = var10.field2664;
                                        if (Statics.field2339 == var10 && var10.field2605 != 0) {
                                            var50 = var10.field2605;
                                        }
                                    }
                                    if (var10.field2607) {
                                        switch(var10.field2616.field3860) {
                                            case 1:
                                                class321.method5590(var12, var13, var10.field2639, var10.field2594, var10.field2664, var10.field2604);
                                                break;
                                            case 2:
                                                class321.method5597(var12, var13, var10.field2639, var10.field2594, var10.field2664, var10.field2604, 255 - (var10.field2609 & 0xFF), 255 - (var10.field2610 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5595(var12, var13, var10.field2639, var10.field2594, var50);
                                                } else {
                                                    class321.method5594(var12, var13, var10.field2639, var10.field2594, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5596(var12, var13, var10.field2639, var10.field2594, var50);
                                    } else {
                                        class321.method5614(var12, var13, var10.field2639, var10.field2594, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2580 == 4) {
                                    class295 var51 = var10.method3750();
                                    if (var51 != null) {
                                        String var52 = var10.field2646;
                                        int var53;
                                        if (method337(var10)) {
                                            var53 = var10.field2604;
                                            if (Statics.field2339 == var10 && var10.field2606 != 0) {
                                                var53 = var10.field2606;
                                            }
                                            if (var10.field2599.length() > 0) {
                                                var52 = var10.field2599;
                                            }
                                        } else {
                                            var53 = var10.field2664;
                                            if (Statics.field2339 == var10 && var10.field2605 != 0) {
                                                var53 = var10.field2605;
                                            }
                                        }
                                        if (var10.field2659 && var10.field2644 != -1) {
                                            class255 var54 = class255.method1847(var10.field2644);
                                            var52 = var54.field3450;
                                            if (var52 == null) {
                                                var52 = class225.field2777;
                                            }
                                            if ((var54.field3423 == 1 || var10.field2714 != 1) && var10.field2714 != -1) {
                                                var52 = class82.method3813(16748608) + var52 + class82.field1141 + " " + 'x' + method4059(var10.field2714);
                                            }
                                        }
                                        if (field779 == var10) {
                                            var52 = class225.field3056;
                                            var53 = var10.field2664;
                                        }
                                        if (!var10.field2659) {
                                            var52 = method1854(var52, var10);
                                        }
                                        var51.method4997(var52, var12, var13, var10.field2639, var10.field2594, var53, var10.field2657 ? 0 : -1, var10.field2642, var10.field2643, var10.field2641);
                                    } else if (class218.field2648) {
                                        method1052(var10);
                                    }
                                } else if (var10.field2580 == 5) {
                                    if (var10.field2659) {
                                        class325 var56;
                                        if (var10.field2644 == -1) {
                                            var56 = var10.method3749(false);
                                        } else {
                                            var56 = class255.method2753(var10.field2644, var10.field2714, var10.field2617, var10.field2618, var10.field2637, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3874;
                                            int var58 = var56.field3871;
                                            if (var10.field2700) {
                                                class321.method5589(var12, var13, var10.field2639 + var12, var10.field2594 + var13);
                                                int var59 = (var10.field2639 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2594 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2600 != 0) {
                                                            var56.method5710(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2600, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5691(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5697(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5588(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2639 * 4096 / var57;
                                                if (var10.field2600 != 0) {
                                                    var56.method5710(var10.field2639 / 2 + var12, var10.field2594 / 2 + var13, var10.field2600, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5699(var12, var13, var10.field2639, var10.field2594, 256 - (var14 & 0xFF));
                                                } else if (var10.field2639 == var57 && var10.field2594 == var58) {
                                                    var56.method5691(var12, var13);
                                                } else {
                                                    var56.method5693(var12, var13, var10.field2639, var10.field2594);
                                                }
                                            }
                                        } else if (class218.field2648) {
                                            method1052(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3749(method337(var10));
                                        if (var55 != null) {
                                            var55.method5691(var12, var13);
                                        } else if (class218.field2648) {
                                            method1052(var10);
                                        }
                                    }
                                } else if (var10.field2580 == 6) {
                                    boolean var64 = method337(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2675;
                                    } else {
                                        var65 = var10.field2625;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2644 != -1) {
                                        class255 var68 = class255.method1847(var10.field2644);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4346(var10.field2714);
                                            var66 = var69.method4345(1);
                                            if (var66 == null) {
                                                method1052(var10);
                                            } else {
                                                var66.method2640();
                                                var67 = var66.field1863 / 2;
                                            }
                                        }
                                    } else if (var10.field2621 == 5) {
                                        if (var10.field2622 == 0) {
                                            var66 = field906.method3698((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field2558.method1103();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3752((class259) null, -1, var64, Statics.field2558.field617);
                                        if (var66 == null && class218.field2648) {
                                            method1052(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method154(var65);
                                        var66 = var10.method3752(var70, var10.field2706, var64, Statics.field2558.field617);
                                        if (var66 == null && class218.field2648) {
                                            method1052(var10);
                                        }
                                    }
                                    class131.method2759(var10.field2639 / 2 + var12, var10.field2594 / 2 + var13);
                                    int var71 = var10.field2704 * class131.field1773[var10.field2629] >> 16;
                                    int var72 = var10.field2704 * class131.field1774[var10.field2629] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2659) {
                                            var66.method2640();
                                            if (var10.field2635) {
                                                var66.method2653(0, var10.field2596, var10.field2631, var10.field2629, var10.field2627, var10.field2628 + var67 + var71, var10.field2628 + var72, var10.field2704);
                                            } else {
                                                var66.method2693(0, var10.field2596, var10.field2631, var10.field2629, var10.field2627, var10.field2628 + var67 + var71, var10.field2628 + var72);
                                            }
                                        } else {
                                            var66.method2693(0, var10.field2596, 0, var10.field2629, 0, var71, var72);
                                        }
                                    }
                                    class131.method2758();
                                } else {
                                    if (var10.field2580 == 7) {
                                        class295 var73 = var10.method3750();
                                        if (var73 == null) {
                                            if (class218.field2648) {
                                                method1052(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2590; var75++) {
                                            for (int var76 = 0; var76 < var10.field2589; var76++) {
                                                if (var10.field2630[var74] > 0) {
                                                    class255 var77 = class255.method1847(var10.field2630[var74] - 1);
                                                    String var78;
                                                    if (var77.field3423 != 1 && var10.field2703[var74] == 1) {
                                                        var78 = class82.method3813(16748608) + var77.field3450 + class82.field1141;
                                                    } else {
                                                        var78 = class82.method3813(16748608) + var77.field3450 + class82.field1141 + " " + 'x' + method4059(var10.field2703[var74]);
                                                    }
                                                    int var79 = (var10.field2645 + 115) * var76 + var12;
                                                    int var80 = (var10.field2584 + 12) * var75 + var13;
                                                    if (var10.field2642 == 0) {
                                                        var73.method4993(var78, var79, var80, var10.field2664, var10.field2657 ? 0 : -1);
                                                    } else if (var10.field2642 == 1) {
                                                        var73.method4996(var78, var10.field2639 / 2 + var79, var80, var10.field2664, var10.field2657 ? 0 : -1);
                                                    } else {
                                                        var73.method4995(var78, var10.field2639 + var79 - 1, var80, var10.field2664, var10.field2657 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2580 == 8 && Statics.field32 == var10 && field769 == field644) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class295 var83 = Statics.field635;
                                        String var84 = var10.field2646;
                                        String var85 = method1854(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1143);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5040(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3691 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2639 + var12 - 5 - var81;
                                        int var90 = var10.field2594 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5595(var89, var90, var81, var82, 16777120);
                                        class321.method5596(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2646;
                                        int var92 = var83.field3691 + var90 + 2;
                                        String var93 = method1854(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1143);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4993(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3691 + 1;
                                        }
                                    }
                                    if (var10.field2580 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2710) {
                                            var96 = var12;
                                            var97 = var10.field2594 + var13;
                                            var98 = var10.field2639 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2639 + var12;
                                            var99 = var10.field2594 + var13;
                                        }
                                        if (var10.field2691 == 1) {
                                            class321.method5605(var96, var97, var98, var99, var10.field2664);
                                        } else {
                                            method235(var96, var97, var98, var99, var10.field2664, var10.field2691);
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

    @ObfuscatedName("s.id(IIIIIIB)V")
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3844;
        int var18 = arg1 - class321.field3847;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2770(var19, var20, var21);
        class131.method2790(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2770(var19, var21, var22);
        class131.method2790(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bk.in(Ljava/lang/String;Lhl;S)Ljava/lang/String;")
    public static String method1854(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3390(arg1, var2 - 1);
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

    @ObfuscatedName("is.ix(II)Ljava/lang/String;")
    public static final String method4059(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1138 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method3813(65408) + var1.substring(0, var1.length() - 8) + class225.field2883 + " " + class82.field1140 + var1 + class82.field1139 + class82.field1141;
        } else if (var1.length() > 6) {
            return " " + class82.method3813(16777215) + var1.substring(0, var1.length() - 4) + class225.field2886 + " " + class82.field1140 + var1 + class82.field1139 + class82.field1141;
        } else {
            return " " + class82.method3813(16776960) + var1 + class82.field1141;
        }
    }

    @ObfuscatedName("client.il(ZI)V")
    public final void method1168(boolean arg0) {
        method247(field725, Statics.field1873, Statics.field310, arg0);
    }

    @ObfuscatedName("client.iu(Lhl;B)V")
    public void method1290(class218 arg0) {
        class218 var2 = arg0.field2597 == -1 ? null : class218.method3387(arg0.field2597);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1873;
            var4 = Statics.field310;
        } else {
            var3 = var2.field2639;
            var4 = var2.field2594;
        }
        method516(arg0, var3, var4, false);
        method1574(arg0, var3, var4);
    }

    @ObfuscatedName("t.ih(IIIZI)V")
    public static final void method247(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method3170(arg0)) {
            method3818(Statics.field1608[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hu.ii([Lhl;IIIZI)V")
    public static void method3818(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2597 == arg1) {
                method516(var6, arg2, arg3, arg4);
                method1574(var6, arg2, arg3);
                if (var6.field2711 > var6.field2601 - var6.field2639) {
                    var6.field2711 = var6.field2601 - var6.field2639;
                }
                if (var6.field2711 < 0) {
                    var6.field2711 = 0;
                }
                if (var6.field2568 > var6.field2688 - var6.field2594) {
                    var6.field2568 = var6.field2688 - var6.field2594;
                }
                if (var6.field2568 < 0) {
                    var6.field2568 = 0;
                }
                if (var6.field2580 == 0) {
                    Statics.method3201(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ak.iy(Lhl;IIZI)V")
    public static void method516(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2639;
        int var5 = arg0.field2594;
        if (arg0.field2585 == 0) {
            arg0.field2639 = arg0.field2589;
        } else if (arg0.field2585 == 1) {
            arg0.field2639 = arg1 - arg0.field2589;
        } else if (arg0.field2585 == 2) {
            arg0.field2639 = arg0.field2589 * arg1 >> 14;
        }
        if (arg0.field2623 == 0) {
            arg0.field2594 = arg0.field2590;
        } else if (arg0.field2623 == 1) {
            arg0.field2594 = arg2 - arg0.field2590;
        } else if (arg0.field2623 == 2) {
            arg0.field2594 = arg0.field2590 * arg2 >> 14;
        }
        if (arg0.field2585 == 4) {
            arg0.field2639 = arg0.field2595 * arg0.field2594 / arg0.field2695;
        }
        if (arg0.field2623 == 4) {
            arg0.field2594 = arg0.field2695 * arg0.field2639 / arg0.field2595;
        }
        if (arg0.field2582 == 1337) {
            field825 = arg0;
        }
        if (arg3 && arg0.field2693 != null && (arg0.field2639 != var4 || arg0.field2594 != var5)) {
            class63 var6 = new class63();
            var6.field570 = arg0;
            var6.field568 = arg0.field2693;
            field842.method4563(var6);
        }
    }

    @ObfuscatedName("be.iw(Lhl;III)V")
    public static void method1574(class218 arg0, int arg1, int arg2) {
        if (arg0.field2583 == 0) {
            arg0.field2591 = arg0.field2619;
        } else if (arg0.field2583 == 1) {
            arg0.field2591 = (arg1 - arg0.field2639) / 2 + arg0.field2619;
        } else if (arg0.field2583 == 2) {
            arg0.field2591 = arg1 - arg0.field2639 - arg0.field2619;
        } else if (arg0.field2583 == 3) {
            arg0.field2591 = arg0.field2619 * arg1 >> 14;
        } else if (arg0.field2583 == 4) {
            arg0.field2591 = (arg0.field2619 * arg1 >> 14) + (arg1 - arg0.field2639) / 2;
        } else {
            arg0.field2591 = arg1 - arg0.field2639 - (arg0.field2619 * arg1 >> 14);
        }
        if (arg0.field2680 == 0) {
            arg0.field2592 = arg0.field2588;
        } else if (arg0.field2680 == 1) {
            arg0.field2592 = (arg2 - arg0.field2594) / 2 + arg0.field2588;
        } else if (arg0.field2680 == 2) {
            arg0.field2592 = arg2 - arg0.field2594 - arg0.field2588;
        } else if (arg0.field2680 == 3) {
            arg0.field2592 = arg0.field2588 * arg2 >> 14;
        } else if (arg0.field2680 == 4) {
            arg0.field2592 = (arg0.field2588 * arg2 >> 14) + (arg2 - arg0.field2594) / 2;
        } else {
            arg0.field2592 = arg2 - arg0.field2594 - (arg0.field2588 * arg2 >> 14);
        }
    }

    @ObfuscatedName("h.jm(Lhl;IIIIIIS)V")
    public static final void method62(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field909) {
            field872 = 32;
        } else {
            field872 = 0;
        }
        field909 = false;
        if (class55.field489 == 1 || !Statics.field2055 && class55.field489 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2568 -= 4;
                method1052(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2568 += 4;
                method1052(arg0);
            } else if (arg5 >= arg1 - field872 && arg5 < field872 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2568 = (arg4 - arg3) * var8 / var9;
                method1052(arg0);
                field909 = true;
            }
        }
        if (field841 == 0) {
            return;
        }
        int var10 = arg0.field2639;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2568 += field841 * 45;
            method1052(arg0);
        }
    }

    @ObfuscatedName("fs.jd(IIIIIB)V")
    public static final void method3223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field54[0].method5660(arg0, arg1);
        Statics.field54[1].method5660(arg0, arg1 + arg3 - 16);
        class321.method5595(arg0, arg1 + 16, 16, arg3 - 32, field706);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class321.method5595(arg0, arg1 + 16 + var6, 16, var5, field707);
        class321.method5603(arg0, arg1 + 16 + var6, var5, field709);
        class321.method5603(arg0 + 1, arg1 + 16 + var6, var5, field709);
        class321.method5601(arg0, arg1 + 16 + var6, 16, field709);
        class321.method5601(arg0, arg1 + 17 + var6, 16, field709);
        class321.method5603(arg0 + 15, arg1 + 16 + var6, var5, field708);
        class321.method5603(arg0 + 14, arg1 + 17 + var6, var5 - 1, field708);
        class321.method5601(arg0, arg1 + 15 + var6 + var5, 16, field708);
        class321.method5601(arg0 + 1, arg1 + 14 + var6 + var5, 15, field708);
    }

    @ObfuscatedName("af.jj(Lhl;I)Z")
    public static final boolean method337(class218 arg0) {
        if (arg0.field2697 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2697.length; var1++) {
            int var2 = method3390(arg0, var1);
            int var3 = arg0.field2651[var1];
            if (arg0.field2697[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2697[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2697[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gc.jw(Lhl;II)I")
    public static final int method3390(class218 arg0, int arg1) {
        if (arg0.field2571 == null || arg1 >= arg0.field2571.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2571[arg1];
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
                    var7 = field775[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field776[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field877[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method3387(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method1847(var12).field3425 || field859)) {
                        for (int var13 = 0; var13 < var11.field2630.length; var13++) {
                            if (var12 + 1 == var11.field2630[var13]) {
                                var7 += var11.field2703[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2531[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2753[field776[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2531[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2558.field611;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2755[var14]) {
                            var7 += field776[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method3387(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method1847(var18).field3425 || field859)) {
                        for (int var19 = 0; var19 < var17.field2630.length; var19++) {
                            if (var18 + 1 == var17.field2630[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field810;
                }
                if (var6 == 12) {
                    var7 = field811;
                }
                if (var6 == 13) {
                    int var20 = class213.field2531[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method3238(var22);
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
                    var7 = (Statics.field2558.field992 >> 7) + Statics.field429;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2558.field936 >> 7) + Statics.field3244;
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

    @ObfuscatedName("ai.jp(Lhl;Liu;IIZI)V")
    public static final void method497(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3427;
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
            var7 = class225.field2990;
        }
        if (var6 != -1 && var7 != null) {
            method159(var7, class82.method3813(16748608) + arg1.field3450, var6, arg1.field3436, arg2, arg0.field2578, arg4);
        }
    }

    @ObfuscatedName("jn.jy(ZB)V")
    public static void method4859(boolean arg0) {
        field774 = arg0;
    }

    @ObfuscatedName("br.jc(B)Z")
    public static boolean method1057() {
        return field774;
    }

    @ObfuscatedName("be.jx(I)Z")
    public static boolean method1573() {
        return field774 || class46.field405[81];
    }

    @ObfuscatedName("ci.jk(IIIIIIII)V")
    public static final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method3170(arg0)) {
            method3138(Statics.field1608[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eb.jo([Lhl;IIIIIIIB)V")
    public static final void method3138(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2597 == arg1 && (!var9.field2659 || var9.field2580 == 0 || var9.field2567 || method1899(var9) != 0 || field817 == var9 || var9.field2582 == 1338)) {
                if (var9.field2659) {
                    if (method3633(var9)) {
                        continue;
                    }
                } else if (var9.field2580 == 0 && Statics.field2339 != var9 && method3633(var9)) {
                    continue;
                }
                int var10 = var9.field2591 + arg6;
                int var11 = var9.field2592 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2580 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2580 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2639 + var10;
                    int var19 = var9.field2594 + var11;
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
                    int var22 = var9.field2639 + var10;
                    int var23 = var9.field2594 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field816 == var9) {
                    field824 = true;
                    field809 = var10;
                    field826 = var11;
                }
                boolean var24 = false;
                if (var9.field2652) {
                    switch(field805) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2578 >>> 16 == field806) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field806 == var9.field2578) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2659 || var12 < var14 && var13 < var15) {
                    if (var9.field2659) {
                        if (var9.field2718) {
                            if (class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15) {
                                for (class63 var25 = (class63) field842.method4568(); var25 != null; var25 = (class63) field842.method4561()) {
                                    if (var25.field569) {
                                        var25.method3332();
                                        var25.field570.field2709 = false;
                                    }
                                }
                                if (Statics.field13 == 0) {
                                    field816 = null;
                                    field817 = null;
                                }
                                if (!field876) {
                                    method20();
                                }
                            }
                        } else if (var9.field2719 && class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15) {
                            for (class63 var26 = (class63) field842.method4568(); var26 != null; var26 = (class63) field842.method4561()) {
                                if (var26.field569 && var26.field570.field2685 == var26.field568) {
                                    var26.method3332();
                                }
                            }
                        }
                    }
                    int var27 = class55.field473;
                    int var28 = class55.field483;
                    if (class55.field482 != 0) {
                        var27 = class55.field490;
                        var28 = class55.field491;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2582 == 1337) {
                        if (!field654 && !field876 && var29) {
                            method2016(var27, var28, var12, var13);
                        }
                    } else if (var9.field2582 == 1338) {
                        method3064(var9, var10, var11);
                    } else {
                        if (var9.field2582 == 1400) {
                            Statics.field255.method5857(class55.field473, class55.field483, var29, var10, var11, var9.field2639, var9.field2594);
                        }
                        if (!field876 && var29) {
                            if (var9.field2582 == 1400) {
                                Statics.field255.method5992(var10, var11, var9.field2639, var9.field2594, var27, var28);
                            } else {
                                Statics.method3703(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2593.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2593[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2593[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2696 != null) {
                                            var34 = class46.field405[var9.field2593[var30][var33]];
                                        }
                                        if (method3175(var9.field2593[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2696 != null && var9.field2696[var30] > field655) {
                                                break;
                                            }
                                            byte var35 = var9.field2654[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field405[86] && !class46.field405[82] && !class46.field405[81]) && ((var35 & 0x2) == 0 || class46.field405[86]) && ((var35 & 0x1) == 0 || class46.field405[82]) && ((var35 & 0x4) == 0 || class46.field405[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method590(var30 + 1, var9.field2578, var9.field2579, var9.field2644, "");
                                    } else if (var30 == 10) {
                                        method1590();
                                        method2544(var9.field2578, var9.field2579, class219.method1480(method1899(var9)), var9.field2644);
                                        field801 = method3338(var9);
                                        if (field801 == null) {
                                            field801 = class225.field2777;
                                        }
                                        field718 = var9.field2602 + class82.method3813(16777215);
                                    }
                                    int var36 = var9.field2655[var30];
                                    if (var9.field2696 == null) {
                                        var9.field2696 = new int[var9.field2593.length];
                                    }
                                    if (var9.field2656 == null) {
                                        var9.field2656 = new int[var9.field2593.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2696[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2696[var30] == 0) {
                                        var9.field2696[var30] = field655 + var36 + var9.field2656[var30];
                                    } else {
                                        var9.field2696[var30] = field655 + var36;
                                    }
                                }
                                if (!var31 && var9.field2696 != null) {
                                    var9.field2696[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2659) {
                            boolean var37;
                            if (class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field489 == 1 || !Statics.field2055 && class55.field489 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field482 == 1 || !Statics.field2055 && class55.field482 == 4) && class55.field490 >= var12 && class55.field491 >= var13 && class55.field490 < var14 && class55.field491 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                Statics.method3177(var9, class55.field490 - var10, class55.field491 - var11);
                            }
                            if (var9.field2582 == 1400) {
                                Statics.field255.method5858(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field816 != null && field816 != var9 && var37 && class219.method172(method1899(var9))) {
                                field820 = var9;
                            }
                            if (field817 == var9) {
                                field821 = true;
                                field699 = var10;
                                field823 = var11;
                            }
                            if (var9.field2567) {
                                if (var37 && field841 != 0 && var9.field2685 != null) {
                                    class63 var40 = new class63();
                                    var40.field569 = true;
                                    var40.field570 = var9;
                                    var40.field572 = field841;
                                    var40.field568 = var9.field2685;
                                    field842.method4563(var40);
                                }
                                if (field816 != null || Statics.field410 != null || field876) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2577 && var39) {
                                    var9.field2577 = true;
                                    if (var9.field2640 != null) {
                                        class63 var41 = new class63();
                                        var41.field569 = true;
                                        var41.field570 = var9;
                                        var41.field571 = class55.field490 - var10;
                                        var41.field572 = class55.field491 - var11;
                                        var41.field568 = var9.field2640;
                                        field842.method4563(var41);
                                    }
                                }
                                if (var9.field2577 && var38 && var9.field2667 != null) {
                                    class63 var42 = new class63();
                                    var42.field569 = true;
                                    var42.field570 = var9;
                                    var42.field571 = class55.field473 - var10;
                                    var42.field572 = class55.field483 - var11;
                                    var42.field568 = var9.field2667;
                                    field842.method4563(var42);
                                }
                                if (var9.field2577 && !var38) {
                                    var9.field2577 = false;
                                    if (var9.field2668 != null) {
                                        class63 var43 = new class63();
                                        var43.field569 = true;
                                        var43.field570 = var9;
                                        var43.field571 = class55.field473 - var10;
                                        var43.field572 = class55.field483 - var11;
                                        var43.field568 = var9.field2668;
                                        field844.method4563(var43);
                                    }
                                }
                                if (var38 && var9.field2669 != null) {
                                    class63 var44 = new class63();
                                    var44.field569 = true;
                                    var44.field570 = var9;
                                    var44.field571 = class55.field473 - var10;
                                    var44.field572 = class55.field483 - var11;
                                    var44.field568 = var9.field2669;
                                    field842.method4563(var44);
                                }
                                if (!var9.field2709 && var37) {
                                    var9.field2709 = true;
                                    if (var9.field2713 != null) {
                                        class63 var45 = new class63();
                                        var45.field569 = true;
                                        var45.field570 = var9;
                                        var45.field571 = class55.field473 - var10;
                                        var45.field572 = class55.field483 - var11;
                                        var45.field568 = var9.field2713;
                                        field842.method4563(var45);
                                    }
                                }
                                if (var9.field2709 && var37 && var9.field2671 != null) {
                                    class63 var46 = new class63();
                                    var46.field569 = true;
                                    var46.field570 = var9;
                                    var46.field571 = class55.field473 - var10;
                                    var46.field572 = class55.field483 - var11;
                                    var46.field568 = var9.field2671;
                                    field842.method4563(var46);
                                }
                                if (var9.field2709 && !var37) {
                                    var9.field2709 = false;
                                    if (var9.field2672 != null) {
                                        class63 var47 = new class63();
                                        var47.field569 = true;
                                        var47.field570 = var9;
                                        var47.field571 = class55.field473 - var10;
                                        var47.field572 = class55.field483 - var11;
                                        var47.field568 = var9.field2672;
                                        field844.method4563(var47);
                                    }
                                }
                                if (var9.field2683 != null) {
                                    class63 var48 = new class63();
                                    var48.field570 = var9;
                                    var48.field568 = var9.field2683;
                                    field901.method4563(var48);
                                }
                                if (var9.field2677 != null && field830 > var9.field2653) {
                                    if (var9.field2678 == null || field830 - var9.field2653 > 32) {
                                        class63 var53 = new class63();
                                        var53.field570 = var9;
                                        var53.field568 = var9.field2677;
                                        field842.method4563(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2653; var49 < field830; var49++) {
                                            int var50 = field829[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2678.length; var51++) {
                                                if (var9.field2678[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field570 = var9;
                                                    var52.field568 = var9.field2677;
                                                    field842.method4563(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2653 = field830;
                                }
                                if (var9.field2679 != null && field899 > var9.field2586) {
                                    if (var9.field2587 == null || field899 - var9.field2586 > 32) {
                                        class63 var58 = new class63();
                                        var58.field570 = var9;
                                        var58.field568 = var9.field2679;
                                        field842.method4563(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2586; var54 < field899; var54++) {
                                            int var55 = field831[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2587.length; var56++) {
                                                if (var9.field2587[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field570 = var9;
                                                    var57.field568 = var9.field2679;
                                                    field842.method4563(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2586 = field899;
                                }
                                if (var9.field2681 != null && field840 > var9.field2566) {
                                    if (var9.field2682 == null || field840 - var9.field2566 > 32) {
                                        class63 var63 = new class63();
                                        var63.field570 = var9;
                                        var63.field568 = var9.field2681;
                                        field842.method4563(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2566; var59 < field840; var59++) {
                                            int var60 = field880[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2682.length; var61++) {
                                                if (var9.field2682[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field570 = var9;
                                                    var62.field568 = var9.field2681;
                                                    field842.method4563(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2566 = field840;
                                }
                                if (field803 > var9.field2632 && var9.field2686 != null) {
                                    class63 var64 = new class63();
                                    var64.field570 = var9;
                                    var64.field568 = var9.field2686;
                                    field842.method4563(var64);
                                }
                                if (field834 > var9.field2632 && var9.field2692 != null) {
                                    class63 var65 = new class63();
                                    var65.field570 = var9;
                                    var65.field568 = var9.field2692;
                                    field842.method4563(var65);
                                }
                                if (field837 > var9.field2632 && var9.field2689 != null) {
                                    class63 var66 = new class63();
                                    var66.field570 = var9;
                                    var66.field568 = var9.field2689;
                                    field842.method4563(var66);
                                }
                                if (field646 > var9.field2632 && var9.field2694 != null) {
                                    class63 var67 = new class63();
                                    var67.field570 = var9;
                                    var67.field568 = var9.field2694;
                                    field842.method4563(var67);
                                }
                                if (field735 > var9.field2632 && var9.field2690 != null) {
                                    class63 var68 = new class63();
                                    var68.field570 = var9;
                                    var68.field568 = var9.field2690;
                                    field842.method4563(var68);
                                }
                                if (field835 > var9.field2632 && var9.field2715 != null) {
                                    class63 var69 = new class63();
                                    var69.field570 = var9;
                                    var69.field568 = var9.field2715;
                                    field842.method4563(var69);
                                }
                                var9.field2632 = field828;
                                if (var9.field2687 != null) {
                                    for (int var70 = 0; var70 < field890; var70++) {
                                        class63 var71 = new class63();
                                        var71.field570 = var9;
                                        var71.field575 = field866[var70];
                                        var71.field581 = field865[var70];
                                        var71.field568 = var9.field2687;
                                        field842.method4563(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2659) {
                            if (field816 != null || Statics.field410 != null || field876) {
                                continue;
                            }
                            if ((var9.field2699 >= 0 || var9.field2605 != 0) && class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15) {
                                if (var9.field2699 >= 0) {
                                    Statics.field2339 = arg0[var9.field2699];
                                } else {
                                    Statics.field2339 = var9;
                                }
                            }
                            if (var9.field2580 == 8 && class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15) {
                                Statics.field32 = var9;
                            }
                            if (var9.field2688 > var9.field2594) {
                                method62(var9, var9.field2639 + var10, var11, var9.field2594, var9.field2688, class55.field473, class55.field483);
                            }
                        }
                        if (var9.field2580 == 0) {
                            method3138(arg0, var9.field2578, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2568);
                            if (var9.field2708 != null) {
                                method3138(var9.field2708, var9.field2578, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2568);
                            }
                            class62 var72 = (class62) field804.method5549((long) var9.field2578);
                            if (var72 != null) {
                                if (var72.field563 == 0 && class55.field473 >= var12 && class55.field483 >= var13 && class55.field473 < var14 && class55.field483 < var15 && !field876) {
                                    for (class63 var73 = (class63) field842.method4568(); var73 != null; var73 = (class63) field842.method4561()) {
                                        if (var73.field569) {
                                            var73.method3332();
                                            var73.field570.field2709 = false;
                                        }
                                    }
                                    if (Statics.field13 == 0) {
                                        field816 = null;
                                        field817 = null;
                                    }
                                    if (!field876) {
                                        method20();
                                    }
                                }
                                method2053(var72.field564, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.jl(II)Z")
    public static boolean method3175(int arg0) {
        for (int var1 = 0; var1 < field890; var1++) {
            if (field866[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("h.js(III)V")
    public static final void method59(int arg0, int arg1) {
        if (class218.method3170(arg0)) {
            method190(Statics.field1608[arg0], arg1);
        }
    }

    @ObfuscatedName("d.jr([Lhl;IB)V")
    public static final void method190(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2580 == 0) {
                    if (var3.field2708 != null) {
                        method190(var3.field2708, arg1);
                    }
                    class62 var4 = (class62) field804.method5549((long) var3.field2578);
                    if (var4 != null) {
                        method59(var4.field564, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2717 != null) {
                    class63 var5 = new class63();
                    var5.field570 = var3;
                    var5.field568 = var3.field2717;
                    class77.method371(var5);
                }
                if (arg1 == 1 && var3.field2665 != null) {
                    if (var3.field2579 >= 0) {
                        class218 var6 = class218.method3387(var3.field2578);
                        if (var6 == null || var6.field2708 == null || var3.field2579 >= var6.field2708.length || var6.field2708[var3.field2579] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field570 = var3;
                    var7.field568 = var3.field2665;
                    class77.method371(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.ju(I)V")
    public final void method1333() {
        method1052(field816);
        Statics.field13++;
        if (field824 && field821) {
            int var1 = class55.field473;
            int var2 = class55.field483;
            int var3 = var1 - field818;
            int var4 = var2 - field722;
            if (var3 < field699) {
                var3 = field699;
            }
            if (field816.field2639 + var3 > field699 + field817.field2639) {
                var3 = field699 + field817.field2639 - field816.field2639;
            }
            if (var4 < field823) {
                var4 = field823;
            }
            if (field816.field2594 + var4 > field823 + field817.field2594) {
                var4 = field823 + field817.field2594 - field816.field2594;
            }
            int var5 = var3 - field809;
            int var6 = var4 - field826;
            int var7 = field816.field2660;
            if (Statics.field13 > field816.field2661 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field672 = true;
            }
            int var8 = field817.field2711 + (var3 - field699);
            int var9 = field817.field2568 + (var4 - field823);
            if (field816.field2673 != null && field672) {
                class63 var10 = new class63();
                var10.field570 = field816;
                var10.field571 = var8;
                var10.field572 = var9;
                var10.field568 = field816.field2673;
                class77.method371(var10);
            }
            if (class55.field489 == 0) {
                if (field672) {
                    if (field816.field2674 != null) {
                        class63 var11 = new class63();
                        var11.field570 = field816;
                        var11.field571 = var8;
                        var11.field572 = var9;
                        var11.field574 = field820;
                        var11.field568 = field816.field2674;
                        class77.method371(var11);
                    }
                    if (field820 != null) {
                        class218 var12 = field816;
                        int var13 = method1899(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class218 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class218.method3387(var12.field2597);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class188 var18 = class188.method3035(class184.field2302, field690.field1311);
                            var18.field2347.method5231(field820.field2578);
                            var18.field2347.method5123(field820.field2644);
                            var18.field2347.method5175(field820.field2579);
                            var18.field2347.method5348(field816.field2578);
                            var18.field2347.method5123(field816.field2644);
                            var18.field2347.method5173(field816.field2579);
                            field690.method2071(var18);
                        }
                    }
                } else if (this.method1166()) {
                    this.method1172(field818 + field809, field826 + field722);
                } else if (field780 > 0) {
                    int var19 = field818 + field809;
                    int var20 = field826 + field722;
                    method3378(Statics.field503, var19, var20);
                    Statics.field503 = null;
                }
                field816 = null;
            }
        } else if (Statics.field13 > 1) {
            field816 = null;
        }
    }

    @ObfuscatedName("hr.je(II)V")
    public static void method3641(int arg0) {
        Statics.field503 = new class83();
        Statics.field503.field1157 = field781[arg0];
        Statics.field503.field1150 = field782[arg0];
        Statics.field503.field1151 = field783[arg0];
        Statics.field503.field1152 = field784[arg0];
        Statics.field503.field1153 = field785[arg0];
    }

    @ObfuscatedName("by.ji(Lhl;B)V")
    public static void method1052(class218 arg0) {
        if (field691 == arg0.field2716) {
            field848[arg0.field2705] = true;
        }
    }

    @ObfuscatedName("lx.jt(I)V")
    public static void method5500() {
        for (class62 var0 = (class62) field804.method5551(); var0 != null; var0 = (class62) field804.method5556()) {
            int var1 = var0.field564;
            if (class218.method3170(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field1608[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2659;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2126;
                    class218 var6 = class218.method3387(var5);
                    if (var6 != null) {
                        method1052(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.jv(IB)V")
    public static final void method302(int arg0) {
        if (!class218.method3170(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1608[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2706 = 0;
                var3.field2707 = 0;
            }
        }
    }

    @ObfuscatedName("fx.ja(IB)V")
    public static final void method3192(int arg0) {
        if (class218.method3170(arg0)) {
            method3604(Statics.field1608[arg0], -1);
        }
    }

    @ObfuscatedName("gr.jh([Lhl;II)V")
    public static final void method3604(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2597 == arg1 && (!var3.field2659 || !method3633(var3))) {
                if (var3.field2580 == 0) {
                    if (!var3.field2659 && method3633(var3) && Statics.field2339 != var3) {
                        continue;
                    }
                    method3604(arg0, var3.field2578);
                    if (var3.field2708 != null) {
                        method3604(var3.field2708, var3.field2578);
                    }
                    class62 var4 = (class62) field804.method5549((long) var3.field2578);
                    if (var4 != null) {
                        method3192(var4.field564);
                    }
                }
                if (var3.field2580 == 6) {
                    if (var3.field2625 != -1 || var3.field2675 != -1) {
                        boolean var5 = method337(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2675;
                        } else {
                            var6 = var3.field2625;
                        }
                        if (var6 != -1) {
                            class259 var7 = class259.method154(var6);
                            var3.field2707 += field705;
                            while (var3.field2707 > var7.field3523[var3.field2706]) {
                                var3.field2707 -= var7.field3523[var3.field2706];
                                var3.field2706++;
                                if (var3.field2706 >= var7.field3521.length) {
                                    var3.field2706 -= var7.field3525;
                                    if (var3.field2706 < 0 || var3.field2706 >= var7.field3521.length) {
                                        var3.field2706 = 0;
                                    }
                                }
                                method1052(var3);
                            }
                        }
                    }
                    if (var3.field2634 != 0 && !var3.field2659) {
                        int var8 = var3.field2634 >> 16;
                        int var9 = var3.field2634 << 16 >> 16;
                        int var10 = field705 * var8;
                        int var11 = field705 * var9;
                        var3.field2629 = var3.field2629 + var10 & 0x7FF;
                        var3.field2596 = var3.field2596 + var11 & 0x7FF;
                        method1052(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("il.jb(II)V")
    public static final void method4282(int arg0) {
        method5500();
        for (class76 var1 = (class76) class76.field1074.method4568(); var1 != null; var1 = (class76) class76.field1074.method4561()) {
            if (var1.field1068 != null) {
                var1.method1749();
            }
        }
        int var2 = class241.method3998(arg0).field3213;
        if (var2 == 0) {
            return;
        }
        int var3 = class213.field2531[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class131.method2761(0.9D);
                ((class120) Statics.field1770).method2527(0.9D);
            }
            if (var3 == 2) {
                class131.method2761(0.8D);
                ((class120) Statics.field1770).method2527(0.8D);
            }
            if (var3 == 3) {
                class131.method2761(0.7D);
                ((class120) Statics.field1770).method2527(0.7D);
            }
            if (var3 == 4) {
                class131.method2761(0.6D);
                ((class120) Statics.field1770).method2527(0.6D);
            }
            class255.method1043();
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
            if (field767 != var4) {
                if (field767 == 0 && field886 != -1) {
                    class198.method1088(Statics.field162, field886, 0, var4, false);
                    field743 = false;
                } else if (var4 == 0) {
                    class198.method2546();
                    field743 = false;
                } else {
                    class198.method2838(var4);
                }
                field767 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field879 = 127;
            }
            if (var3 == 1) {
                field879 = 96;
            }
            if (var3 == 2) {
                field879 = 64;
            }
            if (var3 == 3) {
                field879 = 32;
            }
            if (var3 == 4) {
                field879 = 0;
            }
        }
        if (var2 == 5) {
            field671 = var3;
        }
        if (var2 == 6) {
            field807 = var3;
        }
        if (var2 == 9) {
            field808 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field792 = 127;
            }
            if (var3 == 1) {
                field792 = 96;
            }
            if (var3 == 2) {
                field792 = 64;
            }
            if (var3 == 3) {
                field792 = 32;
            }
            if (var3 == 4) {
                field792 = 0;
            }
        }
        if (var2 == 17) {
            field813 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class85[] var5 = new class85[] { class85.field1171, class85.field1168, class85.field1165, class85.field1166 };
            field882 = (class85) class196.method3304(var5, var3);
            if (field882 == null) {
                field882 = class85.field1171;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field745 = -1;
            } else {
                field745 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class85[] var6 = new class85[] { class85.field1171, class85.field1168, class85.field1165, class85.field1166 };
        field731 = (class85) class196.method3304(var6, var3);
        if (field731 == null) {
            field731 = class85.field1171;
        }
    }

    @ObfuscatedName("je.jn(Lhl;I)V")
    public static final void method4812(class218 arg0) {
        int var1 = arg0.field2582;
        if (var1 == 324) {
            if (field907 == -1) {
                field907 = arg0.field2613;
                field908 = arg0.field2614;
            }
            if (field906.field2542) {
                arg0.field2613 = field907;
            } else {
                arg0.field2613 = field908;
            }
        } else if (var1 == 325) {
            if (field907 == -1) {
                field907 = arg0.field2613;
                field908 = arg0.field2614;
            }
            if (field906.field2542) {
                arg0.field2613 = field908;
            } else {
                arg0.field2613 = field907;
            }
        } else if (var1 == 327) {
            arg0.field2629 = 150;
            arg0.field2596 = (int) (Math.sin((double) field655 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2621 = 5;
            arg0.field2622 = 0;
        } else if (var1 == 328) {
            arg0.field2629 = 150;
            arg0.field2596 = (int) (Math.sin((double) field655 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2621 = 5;
            arg0.field2622 = 1;
        }
    }

    @ObfuscatedName("bt.jg(B)V")
    public static final void method1577() {
        class188 var0 = class188.method3035(class184.field2312, field690.field1311);
        field690.method2071(var0);
        for (class62 var1 = (class62) field804.method5551(); var1 != null; var1 = (class62) field804.method5556()) {
            if (var1.field563 == 0 || var1.field563 == 3) {
                method663(var1, true);
            }
        }
        if (field779 != null) {
            method1052(field779);
            field779 = null;
        }
    }

    @ObfuscatedName("jn.jf(IIII)Lbf;")
    public static final class62 method4858(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field564 = arg1;
        var3.field563 = arg2;
        field804.method5550(var3, (long) arg0);
        method302(arg1);
        class218 var4 = class218.method3387(arg0);
        method1052(var4);
        if (field779 != null) {
            method1052(field779);
            field779 = null;
        }
        method3667();
        Statics.method3201(Statics.field1608[arg0 >> 16], var4, false);
        class77.method3136(arg1);
        if (field725 != -1) {
            method59(field725, 1);
        }
        return var3;
    }

    @ObfuscatedName("aj.kx(Lbf;ZI)V")
    public static final void method663(class62 arg0, boolean arg1) {
        int var2 = arg0.field564;
        int var3 = (int) arg0.field2126;
        arg0.method3332();
        if (arg1) {
            class218.method2057(var2);
        }
        for (class180 var4 = (class180) field845.method5551(); var4 != null; var4 = (class180) field845.method5556()) {
            if ((long) var2 == (var4.field2126 >> 48 & 0xFFFFL)) {
                var4.method3332();
            }
        }
        class218 var5 = class218.method3387(var3);
        if (var5 != null) {
            method1052(var5);
        }
        method3667();
        if (field725 != -1) {
            method59(field725, 1);
        }
    }

    @ObfuscatedName("ao.kl(Lhl;I)Z")
    public static final boolean method503(class218 arg0) {
        int var1 = arg0.field2582;
        if (var1 == 205) {
            field870 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field906.method3693(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field906.method3692(var4, var5 == 1);
        }
        if (var1 == 324) {
            field906.method3705(false);
        }
        if (var1 == 325) {
            field906.method3705(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method3035(class184.field2323, field690.field1311);
            field906.method3720(var6.field2347);
            field690.method2071(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gl.kh(Lhl;IIII)V")
    public static final void method3409(class218 arg0, int arg1, int arg2, int arg3) {
        method1008();
        class212 var4 = arg0.method3745(false);
        if (var4 == null) {
            return;
        }
        class321.method5588(arg1, arg2, var4.field2522 + arg1, var4.field2523 + arg2);
        if (field875 == 2 || field875 == 5) {
            class321.method5607(arg1, arg2, 0, var4.field2524, var4.field2521);
        } else {
            int var5 = field713 & 0x7FF;
            int var6 = Statics.field2558.field992 / 32 + 48;
            int var7 = 464 - Statics.field2558.field936 / 32;
            Statics.field1102.method5764(arg1, arg2, var4.field2522, var4.field2523, var6, var7, var5, 256, var4.field2524, var4.field2521);
            for (int var8 = 0; var8 < field869; var8++) {
                int var9 = field702[var8] * 4 + 2 - Statics.field2558.field992 / 32;
                int var10 = field871[var8] * 4 + 2 - Statics.field2558.field936 / 32;
                method3343(arg1, arg2, var9, var10, field797[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field771[Statics.field2321][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2558.field992 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2558.field936 / 32;
                        method3343(arg1, arg2, var14, var15, Statics.field105[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field739; var16++) {
                class80 var17 = field685[field764[var16]];
                if (var17 != null && var17.method1096()) {
                    class257 var18 = var17.field1126;
                    if (var18 != null && var18.field3496 != null) {
                        var18 = var18.method4426();
                    }
                    if (var18 != null && var18.field3477 && var18.field3499) {
                        int var19 = var17.field992 / 32 - Statics.field2558.field992 / 32;
                        int var20 = var17.field936 / 32 - Statics.field2558.field936 / 32;
                        method3343(arg1, arg2, var19, var20, Statics.field105[1], var4);
                    }
                }
            }
            int var21 = class90.field1250;
            int[] var22 = class90.field1251;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field759[var22[var23]];
                if (var24 != null && var24.method1096() && !var24.field626 && Statics.field2558 != var24) {
                    int var25 = var24.field992 / 32 - Statics.field2558.field992 / 32;
                    int var26 = var24.field936 / 32 - Statics.field2558.field936 / 32;
                    boolean var27 = false;
                    if (Statics.field2558.field625 != 0 && var24.field625 != 0 && Statics.field2558.field625 == var24.field625) {
                        var27 = true;
                    }
                    if (var24.method1098()) {
                        method3343(arg1, arg2, var25, var26, Statics.field105[3], var4);
                    } else if (var27) {
                        method3343(arg1, arg2, var25, var26, Statics.field105[4], var4);
                    } else if (var24.method1102()) {
                        method3343(arg1, arg2, var25, var26, Statics.field105[5], var4);
                    } else {
                        method3343(arg1, arg2, var25, var26, Statics.field105[2], var4);
                    }
                }
            }
            if (field663 != 0 && field655 % 20 < 10) {
                if (field663 == 1 && field664 >= 0 && field664 < field685.length) {
                    class80 var28 = field685[field664];
                    if (var28 != null) {
                        int var29 = var28.field992 / 32 - Statics.field2558.field992 / 32;
                        int var30 = var28.field936 / 32 - Statics.field2558.field936 / 32;
                        method203(arg1, arg2, var29, var30, Statics.field1173[1], var4);
                    }
                }
                if (field663 == 2) {
                    int var31 = field666 * 4 - Statics.field429 * 4 + 2 - Statics.field2558.field992 / 32;
                    int var32 = field667 * 4 - Statics.field3244 * 4 + 2 - Statics.field2558.field936 / 32;
                    method203(arg1, arg2, var31, var32, Statics.field1173[1], var4);
                }
                if (field663 == 10 && field696 >= 0 && field696 < field759.length) {
                    class67 var33 = field759[field696];
                    if (var33 != null) {
                        int var34 = var33.field992 / 32 - Statics.field2558.field992 / 32;
                        int var35 = var33.field936 / 32 - Statics.field2558.field936 / 32;
                        method203(arg1, arg2, var34, var35, Statics.field1173[1], var4);
                    }
                }
            }
            if (field873 != 0) {
                int var36 = field873 * 4 + 2 - Statics.field2558.field992 / 32;
                int var37 = field874 * 4 + 2 - Statics.field2558.field936 / 32;
                method3343(arg1, arg2, var36, var37, Statics.field1173[0], var4);
            }
            if (!Statics.field2558.field626) {
                class321.method5595(var4.field2522 / 2 + arg1 - 1, var4.field2523 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field838[arg3] = true;
    }

    @ObfuscatedName("cb.km(Lhl;IIIB)V")
    public static final void method1941(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3745(false);
        if (var4 == null) {
            return;
        }
        if (field875 < 3) {
            Statics.field354.method5764(arg1, arg2, var4.field2522, var4.field2523, 25, 25, field713, 256, var4.field2524, var4.field2521);
        } else {
            class321.method5607(arg1, arg2, 0, var4.field2524, var4.field2521);
        }
    }

    @ObfuscatedName("d.kw(IIIILln;Lhn;B)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3343(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field713 & 0x7FF;
        int var8 = class131.field1773[var7];
        int var9 = class131.field1774[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2522 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3075.method5684(arg5.field2522 / 2 + arg0 - var17 / 2 + var15, arg5.field2523 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("gd.ka(IIIILln;Lhn;I)V")
    public static final void method3343(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field713 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1773[var6];
        int var9 = class131.field1774[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5707(arg5.field2522 / 2 + var10 - arg4.field3874 / 2, arg5.field2523 / 2 - var11 - arg4.field3871 / 2, arg0, arg1, arg5.field2522, arg5.field2523, arg5.field2524, arg5.field2521);
        } else {
            arg4.method5691(arg5.field2522 / 2 + arg0 + var10 - arg4.field3874 / 2, arg5.field2523 / 2 + arg1 - var11 - arg4.field3871 / 2);
        }
    }

    @ObfuscatedName("q.kf(I)V")
    public static final void method278() {
        for (int var0 = 0; var0 < class90.field1250; var0++) {
            class67 var1 = field759[class90.field1251[var0]];
            var1.method1119();
        }
        Iterator var2 = class92.field1269.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1066();
        }
        if (Statics.field567 != null) {
            Statics.field567.method4865();
        }
    }

    @ObfuscatedName("gc.ks(I)V")
    public static final void method3389() {
        Iterator var0 = class92.field1269.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1063();
        }
        if (Statics.field567 != null) {
            Statics.field567.method4866();
        }
    }

    @ObfuscatedName("bc.ky(B)V")
    public static final void method1756() {
        field837 = field828;
        Statics.field264 = true;
    }

    @ObfuscatedName("fl.kr(Ljava/lang/String;I)V")
    public static final void method3174(String arg0) {
        if (Statics.field567 != null) {
            class188 var1 = class188.method3035(class184.field2297, field690.field1311);
            var1.field2347.method5290(class300.method3313(arg0));
            var1.field2347.method5129(arg0);
            field690.method2071(var1);
        }
    }

    @ObfuscatedName("aq.kk(Ljava/lang/String;I)V")
    public static final void method581(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method3035(class184.field2315, field690.field1311);
            var1.field2347.method5290(class300.method3313(arg0));
            var1.field2347.method5129(arg0);
            field690.method2071(var1);
        }
    }

    @ObfuscatedName("kw.kp(I)V")
    public static final void method4968() {
        class188 var0 = class188.method3035(class184.field2315, field690.field1311);
        var0.field2347.method5290(0);
        field690.method2071(var0);
    }

    @ObfuscatedName("cg.kj(Lhl;I)I")
    public static int method1899(class218 arg0) {
        class180 var1 = (class180) field845.method5549(((long) arg0.field2578 << 32) + (long) arg0.field2579);
        return var1 == null ? arg0.field2670 : var1.field2125;
    }

    @ObfuscatedName("gp.kg(Lhl;B)Z")
    public static boolean method3633(class218 arg0) {
        return arg0.field2598;
    }

    @ObfuscatedName("ez.kz(Lhl;II)Ljava/lang/String;")
    public static String method3072(class218 arg0, int arg1) {
        if (!class219.method551(method1899(arg0), arg1) && arg0.field2684 == null) {
            return null;
        } else if (arg0.field2702 == null || arg0.field2702.length <= arg1 || arg0.field2702[arg1] == null || arg0.field2702[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2702[arg1];
        }
    }

    @ObfuscatedName("gn.kv(Lhl;I)Ljava/lang/String;")
    public static String method3338(class218 arg0) {
        if (class219.method1480(method1899(arg0)) == 0) {
            return null;
        } else if (arg0.field2663 == null || arg0.field2663.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2663;
        }
    }

    @ObfuscatedName("kj.ko(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method5119(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field647 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field647 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field647 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field647 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field647 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field328 != null) {
            var3 = "/p=" + Statics.field328;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3299 + "/a=" + Statics.field92 + var3 + "/";
    }

    @ObfuscatedName("aj.kq(Ljava/lang/String;B)V")
    public static void method672(String arg0) {
        Statics.field328 = arg0;
        try {
            String var1 = Statics.field302.getParameter(Integer.toString(18));
            String var2 = Statics.field302.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class208.method3731(class297.method3217() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field302;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ba.kn(Ljava/lang/String;ZI)V")
    public static void method1069(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1137; var5++) {
            class255 var6 = class255.method1847(var5);
            if ((!arg1 || var6.field3452) && var6.field3444 == -1 && var6.field3450.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1980 = -1;
                    Statics.field2495 = null;
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
        Statics.field2495 = var3;
        Statics.field78 = 0;
        Statics.field1980 = var4;
        String[] var9 = new String[Statics.field1980];
        for (int var10 = 0; var10 < Statics.field1980; var10++) {
            var9[var10] = class255.method1847(var3[var10]).field3450;
        }
        class190.method29(var9, Statics.field2495);
    }

    @ObfuscatedName("hq.ki([BIB)V")
    public static void method3819(byte[] arg0, int arg1) {
        if (field684 == null) {
            field684 = new byte[24];
        }
        class301.method5370(arg0, arg1, field684, 0, 24);
    }

    @ObfuscatedName("aw.kb(Lkg;II)V")
    public static void method506(class300 arg0, int arg1) {
        method3819(arg0.field3708, arg1);
        class168.method66(arg0, arg1);
    }

    @ObfuscatedName("w.ke(Lkg;I)V")
    public static void method84(class300 arg0) {
        if (field684 != null) {
            arg0.method5132(field684, 0, field684.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class168.field2049.method6094(0L);
            class168.field2049.method6086(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var7) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method5132(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kt(B)Ljb;")
    public class283 method1171() {
        return Statics.field2558 == null ? null : Statics.field2558.field607;
    }

    @ObfuscatedName("fp.kc(IIIZI)V")
    public static void method3239(int arg0, int arg1, int arg2, boolean arg3) {
        class188 var4 = class188.method3035(class184.field2286, field690.field1311);
        var4.field2347.method5311(arg2);
        var4.field2347.method5175(arg1);
        var4.field2347.method5185(arg3 ? field749 : 0);
        var4.field2347.method5175(arg0);
        field690.method2071(var4);
    }

    @ObfuscatedName("s.kd(B)Z")
    public static boolean method234() {
        return field812 >= 2;
    }

    @ObfuscatedName("go.ku(II)V")
    public static void method3398(int arg0) {
        field918 = arg0;
    }

    @ObfuscatedName("a.lx(I)V")
    public static void method188() {
        field690.method2071(class188.method3035(class184.field2273, field690.field1311));
        field918 = 0;
    }

    @ObfuscatedName("g.lu(B)V")
    public static void method28() {
        if (field918 == 1) {
            field827 = true;
        }
    }

    @ObfuscatedName("fs.lq(B)V")
    public static void method3227() {
        if (!field827 || Statics.field2558 == null) {
            return;
        }
        int var0 = Statics.field2558.field991[0];
        int var1 = Statics.field2558.field956[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1136 = Statics.field2558.field992;
        int var2 = method3406(Statics.field2558.field992, Statics.field2558.field936, Statics.field2321) - field758;
        if (var2 < Statics.field79) {
            Statics.field79 = var2;
        }
        Statics.field1145 = Statics.field2558.field936;
        field827 = false;
    }

    @ObfuscatedName("dy.lb(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2752(String arg0) {
        class229[] var1 = class229.method21();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3101 != -1 && arg0.startsWith(class82.method1571(var3.field3101))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3101).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cs.ll(I)V")
    public static void method2067() {
        if (Statics.field3211 == null) {
            return;
        }
        field864 = field655;
        Statics.field3211.method4003();
        for (int var0 = 0; var0 < field759.length; var0++) {
            if (field759[var0] != null) {
                Statics.field3211.method4006((field759[var0].field992 >> 7) + Statics.field429, (field759[var0].field936 >> 7) + Statics.field3244);
            }
        }
    }
}

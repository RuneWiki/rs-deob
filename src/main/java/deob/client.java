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

public final class client extends class54 implements class281 {

    @ObfuscatedName("client.w")
    public static class173[] field704 = new class173[4];

    @ObfuscatedName("client.ah")
    public static boolean field923 = true;

    @ObfuscatedName("client.bq")
    public static int field646 = 1;

    @ObfuscatedName("client.bf")
    public static int field774 = 0;

    @ObfuscatedName("client.bk")
    public static int field816 = 0;

    @ObfuscatedName("client.bp")
    public static boolean field695 = false;

    @ObfuscatedName("client.bl")
    public static boolean field844 = false;

    @ObfuscatedName("client.bn")
    public static int field652 = -1;

    @ObfuscatedName("client.bm")
    public static boolean field653 = false;

    @ObfuscatedName("client.ba")
    public static int field773 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field655 = true;

    @ObfuscatedName("client.ct")
    public static int field656 = 0;

    @ObfuscatedName("client.cb")
    public static long field657 = 1L;

    @ObfuscatedName("client.cm")
    public static int field658 = -1;

    @ObfuscatedName("client.cz")
    public static int field913 = -1;

    @ObfuscatedName("client.cu")
    public static long field746 = -1L;

    @ObfuscatedName("client.cy")
    public static boolean field661 = true;

    @ObfuscatedName("client.ce")
    public static boolean field709 = false;

    @ObfuscatedName("client.cw")
    public static int field663 = 0;

    @ObfuscatedName("client.cq")
    public static int field664 = 0;

    @ObfuscatedName("client.ci")
    public static int field687 = 0;

    @ObfuscatedName("client.ca")
    public static int field666 = 0;

    @ObfuscatedName("client.cc")
    public static int field667 = 0;

    @ObfuscatedName("client.ch")
    public static int field668 = 0;

    @ObfuscatedName("client.cx")
    public static int field669 = 0;

    @ObfuscatedName("client.cl")
    public static int field733 = 0;

    @ObfuscatedName("client.cs")
    public static int field784 = 0;

    @ObfuscatedName("client.cv")
    public static class85 field672 = class85.field1158;

    @ObfuscatedName("client.dm")
    public static class85 field902 = class85.field1158;

    @ObfuscatedName("client.ds")
    public static int field707 = 0;

    @ObfuscatedName("client.do")
    public static int field675 = 0;

    @ObfuscatedName("client.di")
    public static int field676 = 0;

    @ObfuscatedName("client.ec")
    public static int field678 = 0;

    @ObfuscatedName("client.el")
    public static int field679 = 0;

    @ObfuscatedName("client.eq")
    public static int field680 = 0;

    @ObfuscatedName("client.eu")
    public static int field681 = 0;

    @ObfuscatedName("client.et")
    public static int field682 = 0;

    @ObfuscatedName("client.es")
    public static class161 field683 = class161.field1994;

    @ObfuscatedName("client.ev")
    public static boolean field685 = false;

    @ObfuscatedName("client.eb")
    public static class89 field815 = new class89();

    @ObfuscatedName("client.ej")
    public static byte[] field894 = null;

    @ObfuscatedName("client.ew")
    public static class80[] field688 = new class80[32768];

    @ObfuscatedName("client.ed")
    public static int field880 = 0;

    @ObfuscatedName("client.fl")
    public static int[] field690 = new int[32768];

    @ObfuscatedName("client.fp")
    public static int field691 = 0;

    @ObfuscatedName("client.fx")
    public static int[] field868 = new int[250];

    @ObfuscatedName("client.fh")
    public static final class96 field693 = new class96();

    @ObfuscatedName("client.fz")
    public static int field694 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field801 = false;

    @ObfuscatedName("client.fw")
    public static boolean field892 = true;

    @ObfuscatedName("client.ff")
    public static class273 field697 = new class273();

    @ObfuscatedName("client.fv")
    public static HashMap field670 = new HashMap();

    @ObfuscatedName("client.fc")
    public static int field792 = 0;

    @ObfuscatedName("client.ft")
    public static int field885 = 1;

    @ObfuscatedName("client.fr")
    public static int field701 = 0;

    @ObfuscatedName("client.gb")
    public static int field734 = 1;

    @ObfuscatedName("client.gi")
    public static int field696 = 0;

    @ObfuscatedName("client.gx")
    public static boolean field714 = false;

    @ObfuscatedName("client.gp")
    public static int[][][] field706 = new int[4][13][13];

    @ObfuscatedName("client.go")
    public static final int[] field744 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gf")
    public static int field708 = 0;

    @ObfuscatedName("client.ht")
    public static int field871 = 2301979;

    @ObfuscatedName("client.hc")
    public static int field710 = 5063219;

    @ObfuscatedName("client.hi")
    public static int field711 = 3353893;

    @ObfuscatedName("client.hf")
    public static int field712 = 7759444;

    @ObfuscatedName("client.hb")
    public static boolean field713 = false;

    @ObfuscatedName("client.hj")
    public static int field722 = 0;

    @ObfuscatedName("client.hm")
    public static int field715 = 128;

    @ObfuscatedName("client.hg")
    public static int field717 = 0;

    @ObfuscatedName("client.hy")
    public static int field768 = 0;

    @ObfuscatedName("client.hk")
    public static int field718 = 0;

    @ObfuscatedName("client.hv")
    public static int field719 = 0;

    @ObfuscatedName("client.ho")
    public static int field720 = 0;

    @ObfuscatedName("client.hz")
    public static int field721 = 0;

    @ObfuscatedName("client.hh")
    public static int field777 = 50;

    @ObfuscatedName("client.hr")
    public static int field648 = 0;

    @ObfuscatedName("client.he")
    public static int field724 = 0;

    @ObfuscatedName("client.ii")
    public static int field725 = 0;

    @ObfuscatedName("client.ia")
    public static int field769 = 12;

    @ObfuscatedName("client.ib")
    public static int field727 = 6;

    @ObfuscatedName("client.in")
    public static int field728 = 0;

    @ObfuscatedName("client.ic")
    public static boolean field729 = false;

    @ObfuscatedName("client.id")
    public static int field730 = 0;

    @ObfuscatedName("client.ij")
    public static boolean field731 = false;

    @ObfuscatedName("client.im")
    public static int field819 = 0;

    @ObfuscatedName("client.ie")
    public static int field856 = 0;

    @ObfuscatedName("client.iu")
    public static int field788 = 50;

    @ObfuscatedName("client.io")
    public static int[] field699 = new int[field788];

    @ObfuscatedName("client.iy")
    public static int[] field736 = new int[field788];

    @ObfuscatedName("client.iv")
    public static int[] field723 = new int[field788];

    @ObfuscatedName("client.iq")
    public static int[] field738 = new int[field788];

    @ObfuscatedName("client.is")
    public static int[] field859 = new int[field788];

    @ObfuscatedName("client.it")
    public static String field841 = null;

    @ObfuscatedName("client.iw")
    public static int[] field740 = new int[field788];

    @ObfuscatedName("client.il")
    public static int[] field741 = new int[field788];

    @ObfuscatedName("client.ir")
    public static String[] field742 = new String[field788];

    @ObfuscatedName("client.if")
    public static int[][] field822 = new int[104][104];

    @ObfuscatedName("client.ih")
    public static int field702 = 0;

    @ObfuscatedName("client.ig")
    public static int field779 = -1;

    @ObfuscatedName("client.ip")
    public static int field886 = -1;

    @ObfuscatedName("client.jq")
    public static int field747 = 0;

    @ObfuscatedName("client.jj")
    public static int field802 = 0;

    @ObfuscatedName("client.jw")
    public static int field749 = 0;

    @ObfuscatedName("client.jr")
    public static int field750 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field751 = true;

    @ObfuscatedName("client.jb")
    public static int field752 = 0;

    @ObfuscatedName("client.jo")
    public static int field753 = 0;

    @ObfuscatedName("client.ji")
    public static int field754 = 0;

    @ObfuscatedName("client.jc")
    public static int field755 = 0;

    @ObfuscatedName("client.jn")
    public static int field756 = 0;

    @ObfuscatedName("client.jt")
    public static int field757 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field758 = false;

    @ObfuscatedName("client.jx")
    public static int field659 = 0;

    @ObfuscatedName("client.jf")
    public static int field760 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field745 = true;

    @ObfuscatedName("client.jh")
    public static class67[] field762 = new class67[2048];

    @ObfuscatedName("client.jd")
    public static int field739 = -1;

    @ObfuscatedName("client.jz")
    public static int field764 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field765 = true;

    @ObfuscatedName("client.kh")
    public static int field766 = 0;

    @ObfuscatedName("client.kj")
    public static int field767 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field829 = new int[1000];

    @ObfuscatedName("client.kb")
    public static final int[] field874 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ko")
    public static String[] field770 = new String[8];

    @ObfuscatedName("client.kc")
    public static boolean[] field771 = new boolean[8];

    @ObfuscatedName("client.kg")
    public static int[] field772 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kt")
    public static int field759 = -1;

    @ObfuscatedName("client.ks")
    public static class263[][][] field799 = new class263[4][104][104];

    @ObfuscatedName("client.kp")
    public static class263 field775 = new class263();

    @ObfuscatedName("client.kd")
    public static class263 field686 = new class263();

    @ObfuscatedName("client.ka")
    public static class263 field855 = new class263();

    @ObfuscatedName("client.ki")
    public static int[] field778 = new int[25];

    @ObfuscatedName("client.kf")
    public static int[] field800 = new int[25];

    @ObfuscatedName("client.kr")
    public static int[] field780 = new int[25];

    @ObfuscatedName("client.kw")
    public static int field743 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field782 = false;

    @ObfuscatedName("client.ld")
    public static int field649 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field761 = new int[500];

    @ObfuscatedName("client.lh")
    public static int[] field785 = new int[500];

    @ObfuscatedName("client.lp")
    public static int[] field786 = new int[500];

    @ObfuscatedName("client.lu")
    public static int[] field787 = new int[500];

    @ObfuscatedName("client.ln")
    public static String[] field654 = new String[500];

    @ObfuscatedName("client.ll")
    public static String[] field689 = new String[500];

    @ObfuscatedName("client.lq")
    public static boolean[] field790 = new boolean[500];

    @ObfuscatedName("client.lb")
    public static boolean field850 = false;

    @ObfuscatedName("client.lf")
    public static boolean field789 = false;

    @ObfuscatedName("client.li")
    public static boolean field793 = false;

    @ObfuscatedName("client.lt")
    public static boolean field794 = true;

    @ObfuscatedName("client.lx")
    public static int field795 = -1;

    @ObfuscatedName("client.lm")
    public static int field864 = -1;

    @ObfuscatedName("client.lv")
    public static int field797 = 0;

    @ObfuscatedName("client.le")
    public static int field798 = 50;

    @ObfuscatedName("client.ly")
    public static int field826 = 0;

    @ObfuscatedName("client.lk")
    public static boolean field650 = false;

    @ObfuscatedName("client.ls")
    public static int field662 = -1;

    @ObfuscatedName("client.mv")
    public static int field803 = -1;

    @ObfuscatedName("client.mn")
    public static String field804 = null;

    @ObfuscatedName("client.mo")
    public static String field805 = null;

    @ObfuscatedName("client.me")
    public static int field806 = -1;

    @ObfuscatedName("client.mx")
    public static class319 field807 = new class319(8);

    @ObfuscatedName("client.mu")
    public static int field809 = 0;

    @ObfuscatedName("client.ms")
    public static int field665 = -1;

    @ObfuscatedName("client.my")
    public static int field811 = 0;

    @ObfuscatedName("client.mp")
    public static int field812 = 0;

    @ObfuscatedName("client.mb")
    public static class218 field813 = null;

    @ObfuscatedName("client.mf")
    public static int field737 = 0;

    @ObfuscatedName("client.ma")
    public static int field903 = 0;

    @ObfuscatedName("client.mk")
    public static int field684 = 0;

    @ObfuscatedName("client.mz")
    public static int field817 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field818 = false;

    @ObfuscatedName("client.mq")
    public static class218 field660 = null;

    @ObfuscatedName("client.mg")
    public static class218 field651 = null;

    @ObfuscatedName("client.mw")
    public static class218 field821 = null;

    @ObfuscatedName("client.mi")
    public static int field838 = 0;

    @ObfuscatedName("client.mr")
    public static int field823 = 0;

    @ObfuscatedName("client.mc")
    public static class218 field726 = null;

    @ObfuscatedName("client.nd")
    public static boolean field825 = false;

    @ObfuscatedName("client.nz")
    public static int field920 = -1;

    @ObfuscatedName("client.nf")
    public static int field827 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field828 = false;

    @ObfuscatedName("client.nw")
    public static int field865 = -1;

    @ObfuscatedName("client.nn")
    public static int field830 = -1;

    @ObfuscatedName("client.na")
    public static boolean field831 = false;

    @ObfuscatedName("client.nh")
    public static int field832 = 1;

    @ObfuscatedName("client.nk")
    public static int[] field833 = new int[32];

    @ObfuscatedName("client.nv")
    public static int field834 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field835 = new int[32];

    @ObfuscatedName("client.nr")
    public static int field836 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field837 = new int[32];

    @ObfuscatedName("client.np")
    public static int field647 = 0;

    @ObfuscatedName("client.ny")
    public static int field839 = 0;

    @ObfuscatedName("client.nu")
    public static int field840 = 0;

    @ObfuscatedName("client.nm")
    public static int field824 = 0;

    @ObfuscatedName("client.nt")
    public static int field842 = 0;

    @ObfuscatedName("client.ne")
    public static int field843 = 0;

    @ObfuscatedName("client.nq")
    public static int field796 = 0;

    @ObfuscatedName("client.oq")
    public static int field897 = 0;

    @ObfuscatedName("client.ot")
    public static class263 field846 = new class263();

    @ObfuscatedName("client.om")
    public static class263 field847 = new class263();

    @ObfuscatedName("client.ol")
    public static class263 field848 = new class263();

    @ObfuscatedName("client.oe")
    public static class319 field849 = new class319(512);

    @ObfuscatedName("client.oh")
    public static int field791 = 0;

    @ObfuscatedName("client.of")
    public static int field851 = -2;

    @ObfuscatedName("client.ov")
    public static boolean[] field852 = new boolean[100];

    @ObfuscatedName("client.oc")
    public static boolean[] field853 = new boolean[100];

    @ObfuscatedName("client.oo")
    public static boolean[] field854 = new boolean[100];

    @ObfuscatedName("client.oi")
    public static int[] field748 = new int[100];

    @ObfuscatedName("client.os")
    public static int[] field645 = new int[100];

    @ObfuscatedName("client.oj")
    public static int[] field857 = new int[100];

    @ObfuscatedName("client.ox")
    public static int[] field858 = new int[100];

    @ObfuscatedName("client.on")
    public static int field910 = 0;

    @ObfuscatedName("client.od")
    public static long field860 = 0L;

    @ObfuscatedName("client.oz")
    public static boolean field735 = true;

    @ObfuscatedName("client.pd")
    public static int[] field862 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pn")
    public static int field863 = 0;

    @ObfuscatedName("client.py")
    public static int field891 = 0;

    @ObfuscatedName("client.pa")
    public static String field781 = "";

    @ObfuscatedName("client.pf")
    public static long[] field866 = new long[100];

    @ObfuscatedName("client.pi")
    public static int field716 = 0;

    @ObfuscatedName("client.pz")
    public static int field763 = 0;

    @ObfuscatedName("client.pr")
    public static int[] field869 = new int[128];

    @ObfuscatedName("client.pm")
    public static int[] field870 = new int[128];

    @ObfuscatedName("client.pp")
    public static long field703 = -1L;

    @ObfuscatedName("client.pj")
    public static int field705 = -1;

    @ObfuscatedName("client.pu")
    public static int field873 = 0;

    @ObfuscatedName("client.pw")
    public static int[] field872 = new int[1000];

    @ObfuscatedName("client.pt")
    public static int[] field875 = new int[1000];

    @ObfuscatedName("client.pg")
    public static class326[] field876 = new class326[1000];

    @ObfuscatedName("client.px")
    public static int field877 = 0;

    @ObfuscatedName("client.pl")
    public static int field878 = 0;

    @ObfuscatedName("client.qe")
    public static int field879 = 0;

    @ObfuscatedName("client.qu")
    public static int field861 = 255;

    @ObfuscatedName("client.qg")
    public static int field881 = -1;

    @ObfuscatedName("client.qa")
    public static boolean field882 = false;

    @ObfuscatedName("client.qt")
    public static int field883 = 127;

    @ObfuscatedName("client.qb")
    public static int field884 = 127;

    @ObfuscatedName("client.qh")
    public static int field845 = 0;

    @ObfuscatedName("client.qi")
    public static int[] field692 = new int[50];

    @ObfuscatedName("client.qc")
    public static int[] field887 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field888 = new int[50];

    @ObfuscatedName("client.qf")
    public static int[] field924 = new int[50];

    @ObfuscatedName("client.qy")
    public static class102[] field890 = new class102[50];

    @ObfuscatedName("client.qs")
    public static boolean field671 = false;

    @ObfuscatedName("client.rk")
    public static boolean[] field776 = new boolean[5];

    @ObfuscatedName("client.ry")
    public static int[] field893 = new int[5];

    @ObfuscatedName("client.ru")
    public static int[] field700 = new int[5];

    @ObfuscatedName("client.rx")
    public static int[] field895 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field896 = new int[5];

    @ObfuscatedName("client.rd")
    public static short field909 = 256;

    @ObfuscatedName("client.re")
    public static short field898 = 205;

    @ObfuscatedName("client.rq")
    public static short field899 = 256;

    @ObfuscatedName("client.rs")
    public static short field900 = 320;

    @ObfuscatedName("client.rf")
    public static short field901 = 1;

    @ObfuscatedName("client.rj")
    public static short field674 = 32767;

    @ObfuscatedName("client.rv")
    public static short field820 = 1;

    @ObfuscatedName("client.rr")
    public static short field904 = 32767;

    @ObfuscatedName("client.rt")
    public static int field905 = 0;

    @ObfuscatedName("client.rw")
    public static int field906 = 0;

    @ObfuscatedName("client.rz")
    public static int field907 = 0;

    @ObfuscatedName("client.ra")
    public static int field908 = 0;

    @ObfuscatedName("client.ri")
    public static int field732 = 0;

    @ObfuscatedName("client.rl")
    public static class215 field919 = new class215();

    @ObfuscatedName("client.sh")
    public static int field911 = -1;

    @ObfuscatedName("client.sw")
    public static int field912 = -1;

    @ObfuscatedName("client.si")
    public static class331 field867 = new class330();

    @ObfuscatedName("client.sl")
    public static class10[] field914 = new class10[8];

    @ObfuscatedName("client.sb")
    public static class68 field915 = new class68();

    @ObfuscatedName("client.sa")
    public static int field889 = -1;

    @ObfuscatedName("client.st")
    public static ArrayList field917 = new ArrayList(10);

    @ObfuscatedName("client.ss")
    public static int field918 = 0;

    @ObfuscatedName("client.sm")
    public static int field814 = 0;

    @ObfuscatedName("client.tc")
    public static final class66 field810 = new class66();

    @ObfuscatedName("client.tk")
    public static int[] field921 = new int[50];

    @ObfuscatedName("client.tn")
    public static int[] field922 = new int[50];

    @ObfuscatedName("p.ez(I)Lly;")
    public static class334 method111() {
        return Statics.field146;
    }

    @ObfuscatedName("client.an(B)V")
    public final void method847() {
    }

    public final void init() {
        if (!this.method874()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field892 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1141)) {
                            field695 = true;
                        } else {
                            field695 = false;
                        }
                        break;
                    case 4:
                        if (field652 == -1) {
                            field652 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field774 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3632 = class191.method3390(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field1988 = class231.method18(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1141)) {
                        }
                        break;
                    case 9:
                        Statics.field478 = var2;
                        break;
                    case 10:
                        Statics.field103 = (class232) class196.method222(class232.method3548(), Integer.parseInt(var2));
                        if (Statics.field103 == class232.field3121) {
                            Statics.field2390 = class339.field4037;
                        } else {
                            Statics.field2390 = class339.field4030;
                        }
                        break;
                    case 12:
                        field646 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field673 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field816 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3308 = var2;
                }
            }
        }
        class134.field1826 = false;
        field844 = false;
        Statics.field2072 = this.getCodeBase().getHost();
        String var3 = Statics.field1988.field3108;
        byte var4 = 0;
        try {
            Statics.field2042 = 21;
            Statics.field644 = var4;
            try {
                Statics.field2016 = System.getProperty("os.name");
            } catch (Exception var22) {
                Statics.field2016 = "Unknown";
            }
            Statics.field1999 = Statics.field2016.toLowerCase();
            try {
                Statics.field1960 = System.getProperty("user.home");
                if (Statics.field1960 != null) {
                    Statics.field1960 = Statics.field1960 + "/";
                }
            } catch (Exception var21) {
            }
            try {
                if (Statics.field1999.startsWith("win")) {
                    if (Statics.field1960 == null) {
                        Statics.field1960 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1960 == null) {
                    Statics.field1960 = System.getenv("HOME");
                }
                if (Statics.field1960 != null) {
                    Statics.field1960 = Statics.field1960 + "/";
                }
            } catch (Exception var20) {
            }
            if (Statics.field1960 == null) {
                Statics.field1960 = "~/";
            }
            Statics.field1292 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1960, "/tmp/", "" };
            Statics.field374 = new String[] { ".jagex_cache_" + Statics.field644, ".file_store_" + Statics.field644 };
            label134: for (int var8 = 0; var8 < 4; var8++) {
                Statics.field2041 = class168.method1164("oldschool", var3, var8);
                if (!Statics.field2041.exists()) {
                    Statics.field2041.mkdirs();
                }
                File[] var9 = Statics.field2041.listFiles();
                if (var9 == null) {
                    break;
                }
                File[] var10 = var9;
                int var11 = 0;
                while (true) {
                    if (var11 >= var10.length) {
                        break label134;
                    }
                    File var12 = var10[var11];
                    boolean var15;
                    try {
                        RandomAccessFile var13 = new RandomAccessFile(var12, "rw");
                        int var14 = var13.read();
                        var13.seek(0L);
                        var13.write(var14);
                        var13.seek(0L);
                        var13.close();
                        var15 = true;
                    } catch (Exception var19) {
                        var15 = false;
                    }
                    if (!var15) {
                        break;
                    }
                    var11++;
                }
            }
            class170.method3640(Statics.field2041);
            class168.method39();
            class168.field2046 = new class343(new class344(class170.method3201("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2047 = new class343(new class344(class170.method3201("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2011 = new class343[Statics.field2042];
            for (int var17 = 0; var17 < Statics.field2042; var17++) {
                Statics.field2011[var17] = new class343(new class344(class170.method3201("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var23) {
            Statics.method3817((String) null, var23);
        }
        Statics.field3618 = this;
        Statics.field4048 = field652;
        this.method831(765, 503, 188);
    }

    @ObfuscatedName("client.as(I)V")
    public final void method801() {
        class303.method3832(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field139 = field816 == 0 ? 43594 : field646 + 40000;
        Statics.field916 = field816 == 0 ? 443 : field646 + 50000;
        Statics.field209 = Statics.field139;
        Statics.field129 = class216.field2553;
        Statics.field2546 = class216.field2554;
        Statics.field2548 = class216.field2552;
        Statics.field2515 = class216.field2551;
        Statics.field114 = new class144();
        this.method779();
        this.method810();
        Statics.field1294 = this.method776();
        Statics.field1228 = new class309(255, class168.field2046, class168.field2047, 500000);
        class344 var1 = null;
        class74 var2 = new class74();
        try {
            var1 = class168.method264("", Statics.field103.field3119, false);
            byte[] var3 = new byte[(int) var1.method6131()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6132(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class74(new class301(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method6129();
            }
        } catch (Exception var11) {
        }
        Statics.field221 = var2;
        this.method912();
        String var10 = Statics.field73;
        class52.field434 = this;
        if (var10 != null) {
            class52.field432 = var10;
        }
        if (field816 != 0) {
            field709 = true;
        }
        method2798(Statics.field221.field1043);
        Statics.field415 = new class75(Statics.field2390);
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method802() {
        field656++;
        this.method1169();
        class236.method1684();
        try {
            if (class198.field2415 == 1) {
                int var1 = Statics.field2409.method3434();
                if (var1 > 0 && Statics.field2409.method3440()) {
                    int var2 = var1 - Statics.field2413;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2409.method3433(var2);
                } else {
                    Statics.field2409.method3439();
                    Statics.field2409.method3505();
                    if (Statics.field1982 == null) {
                        class198.field2415 = 0;
                    } else {
                        class198.field2415 = 2;
                    }
                    Statics.field2054 = null;
                    Statics.field2412 = null;
                }
            }
        } catch (Exception var115) {
            var115.printStackTrace();
            Statics.field2409.method3439();
            class198.field2415 = 0;
            Statics.field2054 = null;
            Statics.field2412 = null;
            Statics.field1982 = null;
        }
        method3199();
        class46.method3061();
        class55.method3177();
        if (Statics.field1294 != null) {
            int var4 = Statics.field1294.method678();
            field897 = var4;
        }
        if (field773 == 0) {
            Statics.method3818();
            class54.method15();
        } else if (field773 == 5) {
            class86.method64(this);
            Statics.method3818();
            class54.method15();
        } else if (field773 == 10 || field773 == 11) {
            class86.method64(this);
        } else if (field773 == 20) {
            class86.method64(this);
            this.method1172();
        } else if (field773 == 25) {
            method3143(false);
            field792 = 0;
            boolean var5 = true;
            for (int var6 = 0; var6 < Statics.field522.length; var6++) {
                if (Statics.field269[var6] != -1 && Statics.field522[var6] == null) {
                    Statics.field522[var6] = Statics.field2071.method3845(Statics.field269[var6], 0);
                    if (Statics.field522[var6] == null) {
                        var5 = false;
                        field792++;
                    }
                }
                if (Statics.field610[var6] != -1 && Statics.field3080[var6] == null) {
                    Statics.field3080[var6] = Statics.field2071.method3837(Statics.field610[var6], 0, Statics.field2038[var6]);
                    if (Statics.field3080[var6] == null) {
                        var5 = false;
                        field792++;
                    }
                }
            }
            if (var5) {
                field701 = 0;
                boolean var7 = true;
                for (int var8 = 0; var8 < Statics.field522.length; var8++) {
                    byte[] var9 = Statics.field3080[var8];
                    if (var9 != null) {
                        int var10 = (Statics.field3612[var8] >> 8) * 64 - Statics.field1262;
                        int var11 = (Statics.field3612[var8] & 0xFF) * 64 - Statics.field2367;
                        if (field714) {
                            var10 = 10;
                            var11 = 10;
                        }
                        var7 &= class56.method5430(var9, var10, var11);
                    }
                }
                if (var7) {
                    if (field696 != 0) {
                        method3426(class225.field2778 + class82.field1138 + class82.field1136 + 100 + "%" + class82.field1137, true);
                    }
                    method3199();
                    Statics.field3111.method2991();
                    for (int var12 = 0; var12 < 4; var12++) {
                        field704[var12].method3299();
                    }
                    for (int var13 = 0; var13 < 4; var13++) {
                        for (int var14 = 0; var14 < 104; var14++) {
                            for (int var15 = 0; var15 < 104; var15++) {
                                class56.field506[var13][var14][var15] = 0;
                            }
                        }
                    }
                    method3199();
                    class56.field505 = 99;
                    Statics.field503 = new byte[4][104][104];
                    Statics.field515 = new byte[4][104][104];
                    Statics.field508 = new byte[4][104][104];
                    Statics.field519 = new byte[4][104][104];
                    Statics.field1941 = new int[4][105][105];
                    Statics.field566 = new byte[4][105][105];
                    Statics.field510 = new int[105][105];
                    Statics.field3549 = new int[104];
                    Statics.field3458 = new int[104];
                    Statics.field273 = new int[104];
                    Statics.field353 = new int[104];
                    Statics.field1530 = new int[104];
                    int var16 = Statics.field522.length;
                    class76.method3090();
                    method3143(true);
                    if (!field714) {
                        int var17 = 0;
                        label516: while (true) {
                            if (var17 >= var16) {
                                for (int var31 = 0; var31 < var16; var31++) {
                                    int var32 = (Statics.field3612[var31] >> 8) * 64 - Statics.field1262;
                                    int var33 = (Statics.field3612[var31] & 0xFF) * 64 - Statics.field2367;
                                    byte[] var34 = Statics.field522[var31];
                                    if (var34 == null && Statics.field2360 < 800) {
                                        method3199();
                                        class56.method4133(var32, var33, 64, 64);
                                    }
                                }
                                method3143(true);
                                int var35 = 0;
                                while (true) {
                                    if (var35 >= var16) {
                                        break label516;
                                    }
                                    byte[] var36 = Statics.field3080[var35];
                                    if (var36 != null) {
                                        int var37 = (Statics.field3612[var35] >> 8) * 64 - Statics.field1262;
                                        int var38 = (Statics.field3612[var35] & 0xFF) * 64 - Statics.field2367;
                                        method3199();
                                        class56.method3219(var36, var37, var38, Statics.field3111, field704);
                                    }
                                    var35++;
                                }
                            }
                            int var18 = (Statics.field3612[var17] >> 8) * 64 - Statics.field1262;
                            int var19 = (Statics.field3612[var17] & 0xFF) * 64 - Statics.field2367;
                            byte[] var20 = Statics.field522[var17];
                            if (var20 != null) {
                                method3199();
                                int var21 = Statics.field531 * 8 - 48;
                                int var22 = Statics.field2360 * 8 - 48;
                                class173[] var23 = field704;
                                int var24 = 0;
                                label513: while (true) {
                                    if (var24 >= 4) {
                                        class301 var27 = new class301(var20);
                                        int var28 = 0;
                                        while (true) {
                                            if (var28 >= 4) {
                                                break label513;
                                            }
                                            for (int var29 = 0; var29 < 64; var29++) {
                                                for (int var30 = 0; var30 < 64; var30++) {
                                                    class56.method362(var27, var28, var18 + var29, var19 + var30, var21, var22, 0);
                                                }
                                            }
                                            var28++;
                                        }
                                    }
                                    for (int var25 = 0; var25 < 64; var25++) {
                                        for (int var26 = 0; var26 < 64; var26++) {
                                            if (var18 + var25 > 0 && var18 + var25 < 103 && var19 + var26 > 0 && var19 + var26 < 103) {
                                                var23[var24].field2087[var18 + var25][var19 + var26] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var24++;
                                }
                            }
                            var17++;
                        }
                    }
                    if (field714) {
                        int var39 = 0;
                        label462: while (true) {
                            if (var39 >= 4) {
                                for (int var57 = 0; var57 < 13; var57++) {
                                    for (int var58 = 0; var58 < 13; var58++) {
                                        int var59 = field706[0][var57][var58];
                                        if (var59 == -1) {
                                            class56.method4133(var57 * 8, var58 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3143(true);
                                int var60 = 0;
                                while (true) {
                                    if (var60 >= 4) {
                                        break label462;
                                    }
                                    method3199();
                                    for (int var61 = 0; var61 < 13; var61++) {
                                        label385: for (int var62 = 0; var62 < 13; var62++) {
                                            int var63 = field706[var60][var61][var62];
                                            if (var63 != -1) {
                                                int var64 = var63 >> 24 & 0x3;
                                                int var65 = var63 >> 1 & 0x3;
                                                int var66 = var63 >> 14 & 0x3FF;
                                                int var67 = var63 >> 3 & 0x7FF;
                                                int var68 = (var66 / 8 << 8) + var67 / 8;
                                                for (int var69 = 0; var69 < Statics.field3612.length; var69++) {
                                                    if (Statics.field3612[var69] == var68 && Statics.field3080[var69] != null) {
                                                        byte[] var70 = Statics.field3080[var69];
                                                        int var71 = var61 * 8;
                                                        int var72 = var62 * 8;
                                                        int var73 = (var66 & 0x7) * 8;
                                                        int var74 = (var67 & 0x7) * 8;
                                                        class134 var75 = Statics.field3111;
                                                        class173[] var76 = field704;
                                                        class301 var77 = new class301(var70);
                                                        int var78 = -1;
                                                        while (true) {
                                                            int var79 = var77.method5142();
                                                            if (var79 == 0) {
                                                                continue label385;
                                                            }
                                                            var78 += var79;
                                                            int var80 = 0;
                                                            while (true) {
                                                                int var81 = var77.method5143();
                                                                if (var81 == 0) {
                                                                    break;
                                                                }
                                                                var80 += var81 - 1;
                                                                int var82 = var80 & 0x3F;
                                                                int var83 = var80 >> 6 & 0x3F;
                                                                int var84 = var80 >> 12;
                                                                int var85 = var77.method5129();
                                                                int var86 = var85 >> 2;
                                                                int var87 = var85 & 0x3;
                                                                if (var64 == var84 && var83 >= var73 && var83 < var73 + 8 && var82 >= var74 && var82 < var74 + 8) {
                                                                    class255 var88 = class255.method3070(var78);
                                                                    int var89 = var71 + class217.method2649(var83 & 0x7, var82 & 0x7, var65, var88.field3360, var88.field3361, var87);
                                                                    int var91 = var83 & 0x7;
                                                                    int var92 = var82 & 0x7;
                                                                    int var94 = var88.field3360;
                                                                    int var95 = var88.field3361;
                                                                    if ((var87 & 0x1) == 1) {
                                                                        int var96 = var94;
                                                                        var94 = var95;
                                                                        var95 = var96;
                                                                    }
                                                                    int var97 = var65 & 0x3;
                                                                    int var98;
                                                                    if (var97 == 0) {
                                                                        var98 = var92;
                                                                    } else if (var97 == 1) {
                                                                        var98 = 7 - var91 - (var94 - 1);
                                                                    } else if (var97 == 2) {
                                                                        var98 = 7 - var92 - (var95 - 1);
                                                                    } else {
                                                                        var98 = var91;
                                                                    }
                                                                    int var99 = var72 + var98;
                                                                    if (var89 > 0 && var99 > 0 && var89 < 103 && var99 < 103) {
                                                                        int var100 = var60;
                                                                        if ((class56.field506[1][var89][var99] & 0x2) == 2) {
                                                                            var100 = var60 - 1;
                                                                        }
                                                                        class173 var101 = null;
                                                                        if (var100 >= 0) {
                                                                            var101 = var76[var100];
                                                                        }
                                                                        class56.method3951(var60, var89, var99, var78, var65 + var87 & 0x3, var86, var75, var101);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var60++;
                                }
                            }
                            method3199();
                            for (int var40 = 0; var40 < 13; var40++) {
                                for (int var41 = 0; var41 < 13; var41++) {
                                    boolean var42 = false;
                                    int var43 = field706[var39][var40][var41];
                                    if (var43 != -1) {
                                        int var44 = var43 >> 24 & 0x3;
                                        int var45 = var43 >> 1 & 0x3;
                                        int var46 = var43 >> 14 & 0x3FF;
                                        int var47 = var43 >> 3 & 0x7FF;
                                        int var48 = (var46 / 8 << 8) + var47 / 8;
                                        for (int var49 = 0; var49 < Statics.field3612.length; var49++) {
                                            if (Statics.field3612[var49] == var48 && Statics.field522[var49] != null) {
                                                class56.method1683(Statics.field522[var49], var39, var40 * 8, var41 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, field704);
                                                var42 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var42) {
                                        int var50 = var39;
                                        int var51 = var40 * 8;
                                        int var52 = var41 * 8;
                                        for (int var53 = 0; var53 < 8; var53++) {
                                            for (int var54 = 0; var54 < 8; var54++) {
                                                class56.field516[var50][var51 + var53][var52 + var54] = 0;
                                            }
                                        }
                                        if (var51 > 0) {
                                            for (int var55 = 1; var55 < 8; var55++) {
                                                class56.field516[var50][var51][var52 + var55] = class56.field516[var50][var51 - 1][var52 + var55];
                                            }
                                        }
                                        if (var52 > 0) {
                                            for (int var56 = 1; var56 < 8; var56++) {
                                                class56.field516[var50][var51 + var56][var52] = class56.field516[var50][var51 + var56][var52 - 1];
                                            }
                                        }
                                        if (var51 > 0 && class56.field516[var50][var51 - 1][var52] != 0) {
                                            class56.field516[var50][var51][var52] = class56.field516[var50][var51 - 1][var52];
                                        } else if (var52 > 0 && class56.field516[var50][var51][var52 - 1] != 0) {
                                            class56.field516[var50][var51][var52] = class56.field516[var50][var51][var52 - 1];
                                        } else if (var51 > 0 && var52 > 0 && class56.field516[var50][var51 - 1][var52 - 1] != 0) {
                                            class56.field516[var50][var51][var52] = class56.field516[var50][var51 - 1][var52 - 1];
                                        }
                                    }
                                }
                            }
                            var39++;
                        }
                    }
                    method3143(true);
                    method3199();
                    class56.method132(Statics.field3111, field704);
                    method3143(true);
                    int var102 = class56.field505;
                    if (var102 > Statics.field2055) {
                        var102 = Statics.field2055;
                    }
                    if (var102 < Statics.field2055 - 1) {
                        int var103 = Statics.field2055 - 1;
                    }
                    if (field844) {
                        Statics.field3111.method2892(class56.field505);
                    } else {
                        Statics.field3111.method2892(0);
                    }
                    for (int var104 = 0; var104 < 104; var104++) {
                        for (int var105 = 0; var105 < 104; var105++) {
                            method656(var104, var105);
                        }
                    }
                    method3199();
                    for (class69 var106 = (class69) field775.method4543(); var106 != null; var106 = (class69) field775.method4564()) {
                        if (var106.field930 == -1) {
                            var106.field935 = 0;
                            method285(var106);
                        } else {
                            var106.method3351();
                        }
                    }
                    class255.field3348.method3103();
                    if (Statics.field3618.method809()) {
                        class188 var107 = class188.method2887(class184.field2250, field693.field1298);
                        var107.field2335.method5306(1057001181);
                        field693.method2109(var107);
                    }
                    if (!field714) {
                        int var108 = (Statics.field531 - 6) / 8;
                        int var109 = (Statics.field531 + 6) / 8;
                        int var110 = (Statics.field2360 - 6) / 8;
                        int var111 = (Statics.field2360 + 6) / 8;
                        for (int var112 = var108 - 1; var112 <= var109 + 1; var112++) {
                            for (int var113 = var110 - 1; var113 <= var111 + 1; var113++) {
                                if (var112 < var108 || var112 > var109 || var113 < var110 || var113 > var111) {
                                    Statics.field2071.method3860("m" + var112 + "_" + var113);
                                    Statics.field2071.method3860("l" + var112 + "_" + var113);
                                }
                            }
                        }
                    }
                    method1969(30);
                    method3199();
                    class56.method1987();
                    class188 var114 = class188.method2887(class184.field2219, field693.field1298);
                    field693.method2109(var114);
                    class54.method15();
                } else {
                    field696 = 2;
                }
            } else {
                field696 = 1;
            }
        }
        if (field773 == 30) {
            this.method1173();
        } else if (field773 == 40 || field773 == 45) {
            this.method1172();
        }
    }

    @ObfuscatedName("client.ac(ZI)V")
    public final void method899(boolean arg0) {
        boolean var2 = class198.method109();
        if (var2 && field882 && Statics.field127 != null) {
            Statics.field127.method2296();
        }
        if ((field773 == 10 || field773 == 20 || field773 == 30) && field860 != 0L && Statics.method184() > field860) {
            method2798(method4856());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field852[var3] = true;
            }
        }
        if (field773 == 0) {
            this.method823(class86.field1170, class86.field1171, arg0);
        } else if (field773 == 5) {
            Statics.method3297(Statics.field1, Statics.field110, Statics.field97);
        } else if (field773 == 10 || field773 == 11) {
            Statics.method3297(Statics.field1, Statics.field110, Statics.field97);
        } else if (field773 == 20) {
            Statics.method3297(Statics.field1, Statics.field110, Statics.field97);
        } else if (field773 == 25) {
            if (field696 == 1) {
                if (field792 > field885) {
                    field885 = field792;
                }
                int var4 = (field885 * 50 - field792 * 50) / field885;
                method3426(class225.field2778 + class82.field1138 + class82.field1136 + var4 + "%" + class82.field1137, false);
            } else if (field696 == 2) {
                if (field701 > field734) {
                    field734 = field701;
                }
                int var5 = (field734 * 50 - field701 * 50) / field734 + 50;
                method3426(class225.field2778 + class82.field1138 + class82.field1136 + var5 + "%" + class82.field1137, false);
            } else {
                method3426(class225.field2778, false);
            }
        } else if (field773 == 30) {
            this.method1175();
        } else if (field773 == 40) {
            method3426(class225.field2789 + class82.field1138 + class225.field2780, false);
        } else if (field773 == 45) {
            method3426(class225.field2929, false);
        }
        if (field773 == 30 && field910 == 0 && !arg0 && !field735) {
            for (int var6 = 0; var6 < field791; var6++) {
                if (field853[var6]) {
                    Statics.field418.method760(field748[var6], field645[var6], field857[var6], field858[var6]);
                    field853[var6] = false;
                }
            }
        } else if (field773 > 0) {
            Statics.field418.method759(0, 0);
            for (int var7 = 0; var7 < field791; var7++) {
                field853[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method804() {
        if (Statics.field2408.method2025()) {
            Statics.field2408.method2022();
        }
        if (Statics.field125 != null) {
            Statics.field125.field589 = false;
        }
        Statics.field125 = null;
        field693.method2111();
        Statics.method708();
        if (class55.field502 != null) {
            class55 var1 = class55.field502;
            synchronized (class55.field502) {
                class55.field502 = null;
            }
        }
        Statics.field1294 = null;
        if (Statics.field127 != null) {
            Statics.field127.method2289();
        }
        if (Statics.field385 != null) {
            Statics.field385.method2289();
        }
        class238.method4071();
        Object var3 = class236.field3154;
        synchronized (class236.field3154) {
            if (class236.field3151 != 0) {
                class236.field3151 = 1;
                try {
                    class236.field3154.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field114 != null) {
            Statics.field114.method3082();
            Statics.field114 = null;
        }
        try {
            class168.field2046.method6102();
            for (int var6 = 0; var6 < Statics.field2042; var6++) {
                Statics.field2011[var6].method6102();
            }
            class168.field2047.method6102();
            class168.field2040.method6102();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cb.ex(II)V")
    public static void method1969(int arg0) {
        if (field773 == arg0) {
            return;
        }
        if (field773 == 0) {
            Statics.field3618.method805();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field679 = 0;
            field680 = 0;
            field681 = 0;
            field697.method4660(arg0);
            if (arg0 != 20) {
                method3198(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1053 != null) {
            Statics.field1053.method3269();
            Statics.field1053 = null;
        }
        if (field773 == 25) {
            field696 = 0;
            field792 = 0;
            field885 = 1;
            field701 = 0;
            field734 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method3362(Statics.field1116, Statics.field1971, true, 0);
        } else if (arg0 == 20) {
            class86.method3362(Statics.field1116, Statics.field1971, true, field773 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method3362(Statics.field1116, Statics.field1971, false, 4);
        } else if (Statics.field1164) {
            Statics.field528 = null;
            Statics.field1163 = null;
            Statics.field122 = null;
            Statics.field1172 = null;
            Statics.field285 = null;
            Statics.field1604 = null;
            Statics.field1168 = null;
            Statics.field244 = null;
            Statics.field2505 = null;
            Statics.field1992 = null;
            Statics.field1324 = null;
            Statics.field549 = null;
            Statics.field1285 = null;
            Statics.field2740 = null;
            Statics.field134.method1664();
            class198.field2415 = 1;
            Statics.field1982 = null;
            Statics.field2411 = -1;
            Statics.field1150 = -1;
            Statics.field1156 = 0;
            Statics.field402 = false;
            Statics.field2413 = 2;
            class238.method2569(true);
            Statics.field1164 = false;
        }
        field773 = arg0;
    }

    @ObfuscatedName("client.ew(I)V")
    public void method1169() {
        if (field773 != 1000) {
            boolean var1 = class238.method3808();
            if (!var1) {
                this.method1170();
            }
        }
    }

    @ObfuscatedName("client.ed(B)V")
    public void method1170() {
        if (class238.field3186 >= 4) {
            this.method806("js5crc");
            field773 = 1000;
            return;
        }
        if (class238.field3178 >= 4) {
            if (field773 <= 5) {
                this.method806("js5io");
                field773 = 1000;
                return;
            }
            field676 = 3000;
            class238.field3178 = 3;
        }
        if (--field676 + 1 > 0) {
            return;
        }
        try {
            if (field675 == 0) {
                Statics.field1534 = Statics.field464.method3240(Statics.field2072, Statics.field209);
                field675++;
            }
            if (field675 == 1) {
                if (Statics.field1534.field2026 == 2) {
                    this.method1410(-1);
                    return;
                }
                if (Statics.field1534.field2026 == 1) {
                    field675++;
                }
            }
            if (field675 == 2) {
                if (field892) {
                    Statics.field150 = class306.method5554((Socket) Statics.field1534.field2028, 40000, 5000);
                } else {
                    Statics.field150 = new class172((Socket) Statics.field1534.field2028, Statics.field464, 5000);
                }
                class301 var1 = new class301(5);
                var1.method5272(15);
                var1.method5306(188);
                Statics.field150.method3274(var1.field3708, 0, 5);
                field675++;
                Statics.field3112 = Statics.method184();
            }
            if (field675 == 3) {
                if (Statics.field150.method3295() > 0 || !field892 && field773 <= 5) {
                    int var2 = Statics.field150.method3270();
                    if (var2 != 0) {
                        this.method1410(var2);
                        return;
                    }
                    field675++;
                } else if (Statics.method184() - Statics.field3112 > 30000L) {
                    this.method1410(-2);
                    return;
                }
            }
            if (field675 == 4) {
                class306 var3 = Statics.field150;
                boolean var4 = field773 > 20;
                if (Statics.field3184 != null) {
                    try {
                        Statics.field3184.method3269();
                    } catch (Exception var14) {
                    }
                    Statics.field3184 = null;
                }
                Statics.field3184 = var3;
                class238.method2569(var4);
                class238.field3181.field3707 = 0;
                Statics.field47 = null;
                Statics.field1751 = null;
                class238.field3182 = 0;
                while (true) {
                    class234 var6 = (class234) class238.field3174.method5529();
                    if (var6 == null) {
                        while (true) {
                            class234 var7 = (class234) class238.field3170.method5529();
                            if (var7 == null) {
                                if (class238.field3185 != 0) {
                                    try {
                                        class301 var8 = new class301(4);
                                        var8.method5272(4);
                                        var8.method5272(class238.field3185);
                                        var8.method5114(0);
                                        Statics.field3184.method3274(var8.field3708, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3184.method3269();
                                        } catch (Exception var12) {
                                        }
                                        class238.field3178++;
                                        Statics.field3184 = null;
                                    }
                                }
                                class238.field3187 = 0;
                                Statics.field3171 = Statics.method184();
                                Statics.field1534 = null;
                                Statics.field150 = null;
                                field675 = 0;
                                field678 = 0;
                                return;
                            }
                            class238.field3172.method4470(var7);
                            class238.field3177.method5535(var7, var7.field2115);
                            class238.field3169++;
                            class238.field3180--;
                        }
                    }
                    class238.field3175.method5535(var6, var6.field2115);
                    class238.field3176++;
                    class238.field3179--;
                }
            }
        } catch (IOException var15) {
            this.method1410(-3);
        }
    }

    @ObfuscatedName("client.fl(IB)V")
    public void method1410(int arg0) {
        Statics.field1534 = null;
        Statics.field150 = null;
        field675 = 0;
        if (Statics.field209 == Statics.field139) {
            Statics.field209 = Statics.field916;
        } else {
            Statics.field209 = Statics.field139;
        }
        field678++;
        if (field678 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field773 <= 5) {
                this.method806("js5connect_full");
                field773 = 1000;
            } else {
                field676 = 3000;
            }
        } else if (field678 >= 2 && arg0 == 6) {
            this.method806("js5connect_outofdate");
            field773 = 1000;
        } else if (field678 >= 4) {
            if (field773 <= 5) {
                this.method806("js5connect");
                field773 = 1000;
            } else {
                field676 = 3000;
            }
        }
    }

    @ObfuscatedName("az.fp(Lia;Ljava/lang/String;I)V")
    public static void method376(class237 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field917.add(var2);
        field814 += var2.field538;
    }

    @ObfuscatedName("lc.fx(I)Z")
    public static boolean method5657() {
        if (field917 == null || field918 >= field917.size()) {
            return true;
        }
        while (field918 < field917.size()) {
            class59 var0 = (class59) field917.get(field918);
            if (!var0.method1024()) {
                return false;
            }
            field918++;
        }
        return true;
    }

    @ObfuscatedName("x.fs(I)I")
    public static int method150() {
        if (field917 == null || field918 >= field917.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field918; var1++) {
            var0 += ((class59) field917.get(var1)).field537;
        }
        return var0 * 10000 / field814;
    }

    @ObfuscatedName("fv.fn(III)V")
    public static void method3335(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class131.field1780[var4];
            int var8 = method717(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class134.method2899(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ah.fb(IZZZI)Lia;")
    public static class237 method753(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class309 var4 = null;
        if (class168.field2046 != null) {
            var4 = new class309(arg0, class168.field2046, Statics.field2011[arg0], 1000000);
        }
        return new class237(var4, Statics.field1228, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fz(I)V")
    public final void method1172() {
        class306 var1 = field693.method2113();
        class300 var2 = field693.field1299;
        try {
            if (field679 == 0) {
                if (Statics.field577 == null && (field815.method1975() || field680 > 250)) {
                    Statics.field577 = field815.method1981();
                    field815.method1974();
                    field815 = null;
                }
                if (Statics.field577 != null) {
                    if (var1 != null) {
                        var1.method3269();
                        var1 = null;
                    }
                    Statics.field3131 = null;
                    field801 = false;
                    field680 = 0;
                    field679 = 1;
                }
            }
            if (field679 == 1) {
                if (Statics.field3131 == null) {
                    Statics.field3131 = Statics.field464.method3240(Statics.field2072, Statics.field209);
                }
                if (Statics.field3131.field2026 == 2) {
                    throw new IOException();
                }
                if (Statics.field3131.field2026 == 1) {
                    if (field892) {
                        var1 = class306.method5554((Socket) Statics.field3131.field2028, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field3131.field2028, Statics.field464, 5000);
                    }
                    field693.method2110(var1);
                    Statics.field3131 = null;
                    field679 = 2;
                }
            }
            if (field679 == 2) {
                field693.method2128();
                class188 var3 = class188.method3189();
                var3.field2341 = null;
                var3.field2334 = 0;
                var3.field2335 = new class300(5000);
                var3.field2335.method5272(class185.field2311.field2312);
                field693.method2109(var3);
                field693.method2108();
                var2.field3707 = 0;
                field679 = 3;
            }
            if (field679 == 3) {
                if (Statics.field127 != null) {
                    Statics.field127.method2287();
                }
                if (Statics.field385 != null) {
                    Statics.field385.method2287();
                }
                boolean var6 = true;
                if (field892 && !var1.method3288(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3270();
                    if (Statics.field127 != null) {
                        Statics.field127.method2287();
                    }
                    if (Statics.field385 != null) {
                        Statics.field385.method2287();
                    }
                    if (var7 != 0) {
                        method921(var7);
                        return;
                    }
                    var2.field3707 = 0;
                    field679 = 4;
                }
            }
            if (field679 == 4) {
                if (var2.field3707 < 8) {
                    int var8 = var1.method3295();
                    if (var8 > 8 - var2.field3707) {
                        var8 = 8 - var2.field3707;
                    }
                    if (var8 > 0) {
                        var1.method3284(var2.field3708, var2.field3707, var8);
                        var2.field3707 += var8;
                    }
                }
                if (var2.field3707 == 8) {
                    var2.field3707 = 0;
                    Statics.field251 = var2.method5311();
                    field679 = 5;
                }
            }
            if (field679 == 5) {
                field693.field1299.field3707 = 0;
                field693.method2128();
                class300 var9 = new class300(500);
                int[] var10 = new int[] { Statics.field577.nextInt(), Statics.field577.nextInt(), Statics.field577.nextInt(), Statics.field577.nextInt() };
                var9.field3707 = 0;
                var9.method5272(1);
                var9.method5306(var10[0]);
                var9.method5306(var10[1]);
                var9.method5306(var10[2]);
                var9.method5306(var10[3]);
                var9.method5118(Statics.field251);
                if (field773 == 40) {
                    var9.method5306(Statics.field296[0]);
                    var9.method5306(Statics.field296[1]);
                    var9.method5306(Statics.field296[2]);
                    var9.method5306(Statics.field296[3]);
                } else {
                    var9.method5272(field683.method33());
                    switch(field683.field1993) {
                        case 0:
                        case 3:
                            var9.method5115(Statics.field1886);
                            var9.field3707++;
                            break;
                        case 1:
                            LinkedHashMap var12 = Statics.field221.field1050;
                            String var13 = class86.field1182;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5306((Integer) var12.get(var15));
                            break;
                        case 2:
                            var9.field3707 += 4;
                    }
                    var9.method5272(class314.field3816.method33());
                    var9.method5310(class86.field1174);
                }
                var9.method5152(class84.field1152, class84.field1151);
                Statics.field296 = var10;
                class188 var18 = class188.method3189();
                var18.field2341 = null;
                var18.field2334 = 0;
                var18.field2335 = new class300(5000);
                var18.field2335.field3707 = 0;
                if (field773 == 40) {
                    var18.field2335.method5272(class185.field2314.field2312);
                } else {
                    var18.field2335.method5272(class185.field2309.field2312);
                }
                var18.field2335.method5114(0);
                int var21 = var18.field2335.field3707;
                var18.field2335.method5306(188);
                var18.field2335.method5306(1);
                var18.field2335.method5272(field652);
                var18.field2335.method5211(var9.field3708, 0, var9.field3707);
                int var22 = var18.field2335.field3707;
                var18.field2335.method5310(class86.field1182);
                var18.field2335.method5272((field735 ? 1 : 0) << 1 | (field844 ? 1 : 0));
                var18.field2335.method5114(Statics.field3615);
                var18.field2335.method5114(Statics.field345);
                class300 var23 = var18.field2335;
                if (field894 == null) {
                    byte[] var24 = new byte[24];
                    try {
                        class168.field2040.method6114(0L);
                        class168.field2040.method6101(var24);
                        int var25;
                        for (var25 = 0; var25 < 24 && var24[var25] == 0; var25++) {
                        }
                        if (var25 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var51) {
                        for (int var27 = 0; var27 < 24; var27++) {
                            var24[var27] = -1;
                        }
                    }
                    var23.method5211(var24, 0, var24.length);
                } else {
                    var23.method5211(field894, 0, field894.length);
                }
                var18.field2335.method5310(Statics.field478);
                var18.field2335.method5306(Statics.field673);
                class301 var30 = new class301(Statics.field2064.method5835());
                Statics.field2064.method5837(var30);
                var18.field2335.method5211(var30.field3708, 0, var30.field3708.length);
                var18.field2335.method5272(field652);
                var18.field2335.method5306(0);
                var18.field2335.method5306(Statics.field39.field3143);
                var18.field2335.method5306(Statics.field609.field3143);
                var18.field2335.method5306(Statics.field30.field3143);
                var18.field2335.method5306(Statics.field3543.field3143);
                var18.field2335.method5306(Statics.field783.field3143);
                var18.field2335.method5306(Statics.field2071.field3143);
                var18.field2335.method5306(Statics.field484.field3143);
                var18.field2335.method5306(Statics.field1985.field3143);
                var18.field2335.method5306(Statics.field1971.field3143);
                var18.field2335.method5306(Statics.field77.field3143);
                var18.field2335.method5306(Statics.field1116.field3143);
                var18.field2335.method5306(Statics.field66.field3143);
                var18.field2335.method5306(Statics.field2017.field3143);
                var18.field2335.method5306(Statics.field500.field3143);
                var18.field2335.method5306(Statics.field2350.field3143);
                var18.field2335.method5306(Statics.field294.field3143);
                var18.field2335.method5306(0);
                var18.field2335.method5306(Statics.field677.field3143);
                var18.field2335.method5306(Statics.field3821.field3143);
                var18.field2335.method5306(Statics.field2056.field3143);
                var18.field2335.method5306(Statics.field530.field3143);
                var18.field2335.method5150(var10, var22, var18.field2335.field3707);
                var18.field2335.method5147(var18.field2335.field3707 - var21);
                field693.method2109(var18);
                field693.method2108();
                field693.field1298 = new class329(var10);
                int[] var31 = new int[4];
                for (int var32 = 0; var32 < 4; var32++) {
                    var31[var32] = var10[var32] + 50;
                }
                var2.method5075(var31);
                field679 = 6;
            }
            if (field679 == 6 && var1.method3295() > 0) {
                int var33 = var1.method3270();
                if (var33 == 21 && field773 == 20) {
                    field679 = 9;
                } else if (var33 == 2) {
                    field679 = 11;
                } else if (var33 == 15 && field773 == 40) {
                    field693.field1301 = -1;
                    field679 = 16;
                } else if (var33 == 64) {
                    field679 = 7;
                } else if (var33 == 23 && field681 < 1) {
                    field681++;
                    field679 = 0;
                } else if (var33 == 29) {
                    field679 = 14;
                } else {
                    method921(var33);
                    return;
                }
            }
            if (field679 == 7 && var1.method3295() > 0) {
                Statics.field149 = var1.method3270();
                field679 = 8;
            }
            if (field679 == 8 && var1.method3295() >= Statics.field149) {
                var1.method3284(var2.field3708, 0, Statics.field149);
                var2.field3707 = 0;
                field679 = 6;
            }
            if (field679 == 9 && var1.method3295() > 0) {
                field682 = (var1.method3270() + 3) * 60;
                field679 = 10;
            }
            if (field679 == 10) {
                field680 = 0;
                class86.method1010(class225.field2964, class225.field2810, field682 / 60 + class225.field2811);
                if (--field682 <= 0) {
                    field679 = 0;
                }
            } else {
                if (field679 == 11 && var1.method3295() >= 1) {
                    Statics.field2354 = var1.method3270();
                    field679 = 12;
                }
                if (field679 == 12 && var1.method3295() >= Statics.field2354) {
                    boolean var34 = var1.method3270() == 1;
                    var1.method3284(var2.field3708, 0, 4);
                    var2.field3707 = 0;
                    boolean var35 = false;
                    if (var34) {
                        int var36 = var2.method5106() << 24;
                        int var37 = var36 | var2.method5106() << 16;
                        int var38 = var37 | var2.method5106() << 8;
                        int var39 = var38 | var2.method5106();
                        int var40 = class292.method4818(class86.field1182);
                        if (Statics.field221.field1050.size() >= 10 && !Statics.field221.field1050.containsKey(var40)) {
                            Iterator var41 = Statics.field221.field1050.entrySet().iterator();
                            var41.next();
                            var41.remove();
                        }
                        Statics.field221.field1050.put(var40, var39);
                    }
                    if (field685) {
                        Statics.field221.field1047 = class86.field1182;
                    } else {
                        Statics.field221.field1047 = null;
                    }
                    class74.method586();
                    field684 = var1.method3270();
                    field818 = var1.method3270() == 1;
                    field739 = var1.method3270();
                    field739 <<= 0x8;
                    field739 += var1.method3270();
                    field764 = var1.method3270();
                    var1.method3284(var2.field3708, 0, 1);
                    var2.field3707 = 0;
                    class183[] var42 = class183.method3069();
                    int var43 = var2.method5077();
                    if (var43 < 0 || var43 >= var42.length) {
                        throw new IOException(var43 + " " + var2.field3707);
                    }
                    field693.field1303 = var42[var43];
                    field693.field1301 = field693.field1303.field2203;
                    var1.method3284(var2.field3708, 0, 2);
                    var2.field3707 = 0;
                    field693.field1301 = var2.method5124();
                    try {
                        class48.method710(Statics.field3618, "zap");
                    } catch (Throwable var50) {
                    }
                    field679 = 13;
                }
                if (field679 != 13) {
                    if (field679 == 14 && var1.method3295() >= 2) {
                        var2.field3707 = 0;
                        var1.method3284(var2.field3708, 0, 2);
                        var2.field3707 = 0;
                        Statics.field3651 = var2.method5124();
                        field679 = 15;
                    }
                    if (field679 == 15 && var1.method3295() >= Statics.field3651) {
                        var2.field3707 = 0;
                        var1.method3284(var2.field3708, 0, Statics.field3651);
                        var2.field3707 = 0;
                        String var45 = var2.method5138();
                        String var46 = var2.method5138();
                        String var47 = var2.method5138();
                        class86.method1010(var45, var46, var47);
                        method1969(10);
                    }
                    if (field679 == 16) {
                        if (field693.field1301 == -1) {
                            if (var1.method3295() < 2) {
                                return;
                            }
                            var1.method3284(var2.field3708, 0, 2);
                            var2.field3707 = 0;
                            field693.field1301 = var2.method5124();
                        }
                        if (var1.method3295() >= field693.field1301) {
                            var1.method3284(var2.field3708, 0, field693.field1301);
                            var2.field3707 = 0;
                            int var48 = field693.field1301;
                            field697.method4644();
                            method963();
                            class90.method1924(var2);
                            if (var2.field3707 != var48) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field680++;
                        if (field680 > 2000) {
                            if (field681 < 1) {
                                if (Statics.field209 == Statics.field139) {
                                    Statics.field209 = Statics.field916;
                                } else {
                                    Statics.field209 = Statics.field139;
                                }
                                field681++;
                                field679 = 0;
                            } else {
                                method921(-3);
                            }
                        }
                    }
                } else if (var1.method3295() >= field693.field1301) {
                    var2.field3707 = 0;
                    var1.method3284(var2.field3708, 0, field693.field1301);
                    field697.method4645();
                    method19();
                    class90.method1924(var2);
                    Statics.field531 = -1;
                    method375(false, var2);
                    field693.field1303 = null;
                }
            }
        } catch (IOException var52) {
            if (field681 < 1) {
                if (Statics.field209 == Statics.field139) {
                    Statics.field209 = Statics.field916;
                } else {
                    Statics.field209 = Statics.field139;
                }
                field681++;
                field679 = 0;
            } else {
                method921(-2);
            }
        }
    }

    @ObfuscatedName("o.fj(I)V")
    public static void method19() {
        field657 = 1L;
        Statics.field125.field592 = 0;
        Statics.field49 = true;
        field661 = true;
        field703 = -1L;
        class97.method142();
        field693.method2128();
        field693.field1299.field3707 = 0;
        field693.field1303 = null;
        field693.field1310 = null;
        field693.field1306 = null;
        field693.field1308 = null;
        field693.field1301 = 0;
        field693.field1300 = 0;
        field663 = 0;
        field694 = 0;
        field664 = 0;
        field649 = 0;
        field782 = false;
        class55.field483 = 0;
        class92.method2341();
        field826 = 0;
        field650 = false;
        field845 = 0;
        field717 = 0;
        field721 = 0;
        Statics.field2717 = null;
        field879 = 0;
        field705 = -1;
        field877 = 0;
        field878 = 0;
        field672 = class85.field1158;
        field902 = class85.field1158;
        field880 = 0;
        class90.method1161();
        for (int var0 = 0; var0 < 2048; var0++) {
            field762[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field688[var1] = null;
        }
        field759 = -1;
        field686.method4557();
        field855.method4557();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field799[var2][var3][var4] = null;
                }
            }
        }
        field775 = new class263();
        Statics.field415.method1691();
        for (int var5 = 0; var5 < Statics.field3205; var5++) {
            class242 var6 = class242.method2078(var5);
            if (var6 != null) {
                class213.field2535[var5] = 0;
                class213.field2534[var5] = 0;
            }
        }
        Statics.field2408.method2030();
        field817 = -1;
        if (field806 != -1) {
            Statics.method1763(field806);
        }
        for (class62 var7 = (class62) field807.method5529(); var7 != null; var7 = (class62) field807.method5530()) {
            method3363(var7, true);
        }
        field806 = -1;
        field807 = new class319(8);
        field813 = null;
        field649 = 0;
        field782 = false;
        field919.method3688((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field770[var8] = null;
            field771[var8] = false;
        }
        class60.method178();
        field655 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field852[var9] = true;
        }
        method4019();
        Statics.field568 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field914[var10] = new class10();
        }
        Statics.field937 = null;
    }

    @ObfuscatedName("bc.fw(I)V")
    public static void method963() {
        field693.method2128();
        field693.field1299.field3707 = 0;
        field693.field1303 = null;
        field693.field1310 = null;
        field693.field1306 = null;
        field693.field1308 = null;
        field693.field1301 = 0;
        field693.field1300 = 0;
        field663 = 0;
        field649 = 0;
        field782 = false;
        field879 = 0;
        field877 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field762[var0] = null;
        }
        Statics.field2392 = null;
        for (int var1 = 0; var1 < field688.length; var1++) {
            class80 var2 = field688[var1];
            if (var2 != null) {
                var2.field966 = -1;
                var2.field946 = false;
            }
        }
        class60.method178();
        method1969(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field852[var3] = true;
        }
        method4019();
    }

    @ObfuscatedName("bf.ff(II)V")
    public static void method921(int arg0) {
        if (arg0 == -3) {
            class86.method1010(class225.field2930, class225.field2954, class225.field2814);
        } else if (arg0 == -2) {
            class86.method1010(class225.field2815, class225.field2816, class225.field2817);
        } else if (arg0 == -1) {
            class86.method1010(class225.field3031, class225.field2819, class225.field2820);
        } else if (arg0 == 3) {
            class86.field1177 = 3;
            class86.field1194 = 1;
        } else if (arg0 == 4) {
            class86.field1177 = 12;
            class86.field1166 = 0;
        } else if (arg0 == 5) {
            class86.field1194 = 2;
            class86.method1010(class225.field2824, class225.field2825, class225.field2826);
        } else if (arg0 == 68 || !(field653 || arg0 != 6)) {
            class86.method1010(class225.field2827, class225.field3002, class225.field2875);
        } else if (arg0 == 7) {
            class86.method1010(class225.field2813, class225.field2831, class225.field2952);
        } else if (arg0 == 8) {
            class86.method1010(class225.field2850, class225.field2834, class225.field3060);
        } else if (arg0 == 9) {
            class86.method1010(class225.field2889, class225.field2837, class225.field2838);
        } else if (arg0 == 10) {
            class86.method1010(class225.field3019, class225.field2771, class225.field3018);
        } else if (arg0 == 11) {
            class86.method1010(class225.field2842, class225.field2843, class225.field2844);
        } else if (arg0 == 12) {
            class86.method1010(class225.field2845, class225.field2995, class225.field3057);
        } else if (arg0 == 13) {
            class86.method1010(class225.field2848, class225.field2849, class225.field2947);
        } else if (arg0 == 14) {
            class86.method1010(class225.field2851, class225.field2852, class225.field2985);
        } else if (arg0 == 16) {
            class86.method1010(class225.field2854, class225.field2830, class225.field2856);
        } else if (arg0 == 17) {
            class86.method1010(class225.field3011, class225.field2858, class225.field2969);
        } else if (arg0 == 18) {
            class86.field1177 = 12;
            class86.field1166 = 1;
        } else if (arg0 == 19) {
            class86.method1010(class225.field2863, class225.field2950, class225.field2865);
        } else if (arg0 == 20) {
            class86.method1010(class225.field2941, class225.field3009, class225.field2868);
        } else if (arg0 == 22) {
            class86.method1010(class225.field2869, class225.field2870, class225.field2871);
        } else if (arg0 == 23) {
            class86.method1010(class225.field2872, class225.field2873, class225.field2874);
        } else if (arg0 == 24) {
            class86.method1010(class225.field3004, class225.field2876, class225.field2877);
        } else if (arg0 == 25) {
            class86.method1010(class225.field2878, class225.field2793, class225.field2880);
        } else if (arg0 == 26) {
            class86.method1010(class225.field2881, class225.field2971, class225.field2883);
        } else if (arg0 == 27) {
            class86.method1010(class225.field2884, class225.field2885, class225.field2886);
        } else if (arg0 == 31) {
            class86.method1010(class225.field2846, class225.field2779, class225.field2910);
        } else if (arg0 == 32) {
            class86.method1010(class225.field2896, class225.field2897, class225.field2861);
        } else if (arg0 == 37) {
            class86.method1010(class225.field2840, class225.field2855, class225.field2901);
        } else if (arg0 == 38) {
            class86.method1010(class225.field2972, class225.field2882, class225.field2904);
        } else if (arg0 == 55) {
            class86.field1177 = 8;
        } else if (arg0 == 56) {
            class86.method1010(class225.field2909, class225.field2879, class225.field2911);
            method1969(11);
            return;
        } else if (arg0 == 57) {
            class86.method1010(class225.field2912, class225.field3008, class225.field2914);
            method1969(11);
            return;
        } else if (arg0 == 61) {
            class86.field1177 = 7;
        } else {
            class86.method1010(class225.field2915, class225.field2916, class225.field2917);
        }
        method1969(10);
    }

    @ObfuscatedName("aj.fm(I)V")
    public static final void method504() {
        field693.method2111();
        class259.method2888();
        class246.field3255.method3103();
        class247.method4961();
        class255.field3350.method3103();
        class255.field3348.method3103();
        class255.field3375.method3103();
        class255.field3344.method3103();
        class258.field3462.method3103();
        class258.field3463.method3103();
        class256.field3439.method3103();
        class256.field3402.method3103();
        class256.field3403.method3103();
        class260.field3511.method3103();
        class260.field3522.method3103();
        class245.method161();
        Statics.method281();
        class242.method537();
        class254.field3337.method3103();
        class254.field3326.method3103();
        class254.field3321.method3103();
        class248.field3274.method3103();
        class248.field3273.method3103();
        class252.method3182();
        class251.method3719();
        class243.method3074();
        class215.field2549.method3103();
        class218.method3228();
        ((class120) Statics.field1777).method2551();
        class93.field1269.method3103();
        Statics.field39.method3852();
        Statics.field609.method3852();
        Statics.field3543.method3852();
        Statics.field783.method3852();
        Statics.field2071.method3852();
        Statics.field484.method3852();
        Statics.field1985.method3852();
        Statics.field1971.method3852();
        Statics.field77.method3852();
        Statics.field1116.method3852();
        Statics.field66.method3852();
        Statics.field2017.method3852();
        Statics.field3111.method2991();
        for (int var0 = 0; var0 < 4; var0++) {
            field704[var0].method3299();
        }
        System.gc();
        class198.field2415 = 1;
        Statics.field1982 = null;
        Statics.field2411 = -1;
        Statics.field1150 = -1;
        Statics.field1156 = 0;
        Statics.field402 = false;
        Statics.field2413 = 2;
        field881 = -1;
        field882 = false;
        class76.method3090();
        method1969(10);
    }

    @ObfuscatedName("n.fi(II)V")
    public static final void method144(int arg0) {
        method504();
        switch(arg0) {
            case 1:
                class86.method536();
                break;
            case 2:
                class86.method1903();
        }
    }

    @ObfuscatedName("s.fg(B)V")
    public static final void method269() {
        if (field694 > 0) {
            method504();
        } else {
            field697.method4643();
            method1969(40);
            Statics.field1053 = field693.method2113();
            field693.method2124();
        }
    }

    @ObfuscatedName("fp.fu(ZB)V")
    public static final void method3198(boolean arg0) {
        if (arg0) {
            field683 = class86.field1186 ? class161.field1997 : class161.field1996;
            return;
        }
        LinkedHashMap var1 = Statics.field221.field1050;
        String var2 = class86.field1182;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field683 = var1.containsKey(var4) ? class161.field1995 : class161.field1994;
    }

    @ObfuscatedName("client.fe(B)V")
    public final void method1173() {
        if (field663 > 1) {
            field663--;
        }
        if (field694 > 0) {
            field694--;
        }
        if (field801) {
            field801 = false;
            method269();
            return;
        }
        if (!field782) {
            method2149();
        }
        for (int var1 = 0; var1 < 100 && this.method1202(field693); var1++) {
        }
        if (field773 != 30) {
            return;
        }
        while (class97.method3062()) {
            class188 var2 = class188.method2887(class184.field2236, field693.field1298);
            var2.field2335.method5272(0);
            int var3 = var2.field2335.field3707;
            class97.method2077(var2.field2335);
            var2.field2335.method5190(var2.field2335.field3707 - var3);
            field693.method2109(var2);
        }
        if (field697.field3570) {
            class188 var4 = class188.method2887(class184.field2294, field693.field1298);
            var4.field2335.method5272(0);
            int var5 = var4.field2335.field3707;
            field697.method4648(var4.field2335);
            var4.field2335.method5190(var4.field2335.field3707 - var5);
            field693.method2109(var4);
            field697.method4655();
        }
        Object var6 = Statics.field125.field588;
        synchronized (Statics.field125.field588) {
            if (!field923) {
                Statics.field125.field592 = 0;
            } else if (class55.field496 != 0 || Statics.field125.field592 >= 40) {
                class188 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field125.field592 && (var7 == null || var7.field2335.field3707 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field125.field591[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field125.field590[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field658 != var14 || field913 != var13) {
                        if (var7 == null) {
                            var7 = class188.method2887(class184.field2223, field693.field1298);
                            var7.field2335.method5272(0);
                            var8 = var7.field2335.field3707;
                            var7.field2335.field3707 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field746 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field658;
                            var16 = var13 - field913;
                            var17 = (int) ((Statics.field125.field594[var12] - field746) / 20L);
                            var10 = (int) ((Statics.field125.field594[var12] - field746) % 20L + (long) var10);
                        }
                        field658 = var14;
                        field913 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2335.method5114((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2335.method5272(var17 + 128);
                            var7.field2335.method5114((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2335.method5272(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2335.method5306(Integer.MIN_VALUE);
                            } else {
                                var7.field2335.method5306(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2335.method5114((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2335.method5306(Integer.MIN_VALUE);
                            } else {
                                var7.field2335.method5306(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field746 = Statics.field125.field594[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2335.method5190(var7.field2335.field3707 - var8);
                    int var18 = var7.field2335.field3707;
                    var7.field2335.field3707 = var8;
                    var7.field2335.method5272(var10 / var11);
                    var7.field2335.method5272(var10 % var11);
                    var7.field2335.field3707 = var18;
                    field693.method2109(var7);
                }
                if (var9 >= Statics.field125.field592) {
                    Statics.field125.field592 = 0;
                } else {
                    Statics.field125.field592 -= var9;
                    System.arraycopy(Statics.field125.field590, var9, Statics.field125.field590, 0, Statics.field125.field592);
                    System.arraycopy(Statics.field125.field591, var9, Statics.field125.field591, 0, Statics.field125.field592);
                    System.arraycopy(Statics.field125.field594, var9, Statics.field125.field594, 0, Statics.field125.field592);
                }
            }
        }
        if (class55.field496 == 1 || !Statics.field540 && class55.field496 == 4 || class55.field496 == 2) {
            long var20 = class55.field499 - field657 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field657 = class55.field499 * -1L;
            int var22 = class55.field489;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field345) {
                var22 = Statics.field345;
            }
            int var23 = class55.field497;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field3615) {
                var23 = Statics.field3615;
            }
            int var24 = (int) var20;
            class188 var25 = class188.method2887(class184.field2276, field693.field1298);
            var25.field2335.method5114((class55.field496 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2335.method5114(var23);
            var25.field2335.method5114(var22);
            field693.method2109(var25);
        }
        if (class46.field406 > 0) {
            class188 var26 = class188.method2887(class184.field2287, field693.field1298);
            var26.field2335.method5114(0);
            int var27 = var26.field2335.field3707;
            long var28 = Statics.method184();
            for (int var30 = 0; var30 < class46.field406; var30++) {
                long var31 = var28 - field703;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field703 = var28;
                var26.field2335.method5272(class46.field405[var30]);
                var26.field2335.method5172((int) var31);
            }
            var26.field2335.method5147(var26.field2335.field3707 - var27);
            field693.method2109(var26);
        }
        if (field730 > 0) {
            field730--;
        }
        if (class46.field399[96] || class46.field399[97] || class46.field399[98] || class46.field399[99]) {
            field731 = true;
        }
        if (field731 && field730 <= 0) {
            field730 = 20;
            field731 = false;
            class188 var33 = class188.method2887(class184.field2209, field693.field1298);
            var33.field2335.method5340(field717);
            var33.field2335.method5164(field715);
            field693.method2109(var33);
        }
        if (Statics.field49 && !field661) {
            field661 = true;
            class188 var34 = class188.method2887(class184.field2211, field693.field1298);
            var34.field2335.method5272(1);
            field693.method2109(var34);
        }
        if (!Statics.field49 && field661) {
            field661 = false;
            class188 var35 = class188.method2887(class184.field2211, field693.field1298);
            var35.field2335.method5272(0);
            field693.method2109(var35);
        }
        if (Statics.field146 != null) {
            Statics.field146.method5998();
        }
        method714();
        if (Statics.field2055 != field705) {
            field705 = Statics.field2055;
            int var36 = Statics.field2055;
            int[] var37 = Statics.field194.field3875;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class56.field506[var36][var42][var40] & 0x18) == 0) {
                        Statics.field3111.method2925(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class56.field506[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field3111.method2925(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field194.method5685();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class56.field506[var36][var46][var45] & 0x18) == 0) {
                        method3340(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class56.field506[var36 + 1][var46][var45] & 0x8) != 0) {
                        method3340(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field873 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field3111.method3056(Statics.field2055, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class129.method65(var49);
                        int var52 = class255.method3070(var51).field3373;
                        if (var52 >= 0) {
                            field876[field873] = class243.method3377(var52).method4052(false);
                            field872[field873] = var47;
                            field875[field873] = var48;
                            field873++;
                        }
                    }
                }
            }
            Statics.field418.method5656();
        }
        if (field773 != 30) {
            return;
        }
        for (class69 var53 = (class69) field775.method4543(); var53 != null; var53 = (class69) field775.method4564()) {
            if (var53.field930 > 0) {
                var53.field930--;
            }
            if (var53.field930 != 0) {
                if (var53.field935 > 0) {
                    var53.field935--;
                }
                if (var53.field935 == 0 && var53.field927 >= 1 && var53.field928 >= 1 && var53.field927 <= 102 && var53.field928 <= 102 && (var53.field931 < 0 || class56.method167(var53.field931, var53.field934))) {
                    method221(var53.field933, var53.field926, var53.field927, var53.field928, var53.field931, var53.field932, var53.field934);
                    var53.field935 = -1;
                    if (var53.field931 == var53.field929 && var53.field929 == -1) {
                        var53.method3351();
                    } else if (var53.field931 == var53.field929 && var53.field936 == var53.field932 && var53.field934 == var53.field925) {
                        var53.method3351();
                    }
                }
            } else if (var53.field929 < 0 || class56.method167(var53.field929, var53.field925)) {
                method221(var53.field933, var53.field926, var53.field927, var53.field928, var53.field929, var53.field936, var53.field925);
                var53.method3351();
            }
        }
        method3813();
        field693.field1300++;
        if (field693.field1300 > 750) {
            method269();
            return;
        }
        method3060();
        method372();
        int[] var54 = class90.field1241;
        for (int var55 = 0; var55 < class90.field1247; var55++) {
            class67 var56 = field762[var54[var55]];
            if (var56 != null && var56.field956 > 0) {
                var56.field956--;
                if (var56.field956 == 0) {
                    var56.field953 = null;
                }
            }
        }
        for (int var57 = 0; var57 < field880; var57++) {
            int var58 = field690[var57];
            class80 var59 = field688[var58];
            if (var59 != null && var59.field956 > 0) {
                var59.field956--;
                if (var59.field956 == 0) {
                    var59.field953 = null;
                }
            }
        }
        field708++;
        if (field750 != 0) {
            field749 += 20;
            if (field749 >= 400) {
                field750 = 0;
            }
        }
        if (Statics.field1794 != null) {
            field752++;
            if (field752 >= 15) {
                method4409(Statics.field1794);
                Statics.field1794 = null;
            }
        }
        class218 var60 = Statics.field69;
        class218 var61 = Statics.field3297;
        Statics.field69 = null;
        Statics.field3297 = null;
        field726 = null;
        field828 = false;
        field825 = false;
        field763 = 0;
        while (class46.method2342() && field763 < 128) {
            if (field684 >= 2 && class46.field399[82] && Statics.field2103 == 66) {
                String var62 = class92.method2889();
                Statics.field3618.method788(var62);
            } else if (field721 != 1 || Statics.field433 <= 0) {
                field870[field763] = Statics.field2103;
                field869[field763] = Statics.field433;
                field763++;
            }
        }
        if (method4433() && class46.field399[82] && class46.field399[81] && field897 != 0) {
            int var63 = Statics.field2392.field614 - field897;
            if (var63 < 0) {
                var63 = 0;
            } else if (var63 > 3) {
                var63 = 3;
            }
            if (Statics.field2392.field614 != var63) {
                method501(Statics.field1262 + Statics.field2392.field978[0], Statics.field2367 + Statics.field2392.field996[0], var63, false);
            }
            field897 = 0;
        }
        if (field806 != -1) {
            method286(field806, 0, 0, Statics.field3615, Statics.field345, 0, 0);
        }
        field832++;
        while (true) {
            class63 var64;
            class218 var65;
            class218 var66;
            do {
                var64 = (class63) field847.method4548();
                if (var64 == null) {
                    while (true) {
                        class63 var67;
                        class218 var68;
                        class218 var69;
                        do {
                            var67 = (class63) field848.method4548();
                            if (var67 == null) {
                                while (true) {
                                    class63 var70;
                                    class218 var71;
                                    class218 var72;
                                    do {
                                        var70 = (class63) field846.method4548();
                                        if (var70 == null) {
                                            this.method1177();
                                            if (Statics.field146 != null) {
                                                Statics.field146.method5870(Statics.field2055, (Statics.field2392.field983 >> 7) + Statics.field1262, (Statics.field2392.field940 >> 7) + Statics.field2367, false);
                                                Statics.field146.method6041();
                                            }
                                            if (field651 != null) {
                                                this.method1377();
                                            }
                                            if (Statics.field2325 != null) {
                                                method4409(Statics.field2325);
                                                field659++;
                                                if (class55.field490 == 0) {
                                                    if (field758) {
                                                        if (Statics.field2325 == Statics.field1605 && field757 != field754) {
                                                            class218 var73 = Statics.field2325;
                                                            byte var74 = 0;
                                                            if (field812 == 1 && var73.field2577 == 206) {
                                                                var74 = 1;
                                                            }
                                                            if (var73.field2585[field757] <= 0) {
                                                                var74 = 0;
                                                            }
                                                            if (class219.method4885(method188(var73))) {
                                                                int var75 = field754;
                                                                int var76 = field757;
                                                                var73.field2585[var76] = var73.field2585[var75];
                                                                var73.field2662[var76] = var73.field2662[var75];
                                                                var73.field2585[var75] = -1;
                                                                var73.field2662[var75] = 0;
                                                            } else if (var74 == 1) {
                                                                int var77 = field754;
                                                                int var78 = field757;
                                                                while (var77 != var78) {
                                                                    if (var77 > var78) {
                                                                        var73.method3738(var77 - 1, var77);
                                                                        var77--;
                                                                    } else if (var77 < var78) {
                                                                        var73.method3738(var77 + 1, var77);
                                                                        var77++;
                                                                    }
                                                                }
                                                            } else {
                                                                var73.method3738(field757, field754);
                                                            }
                                                            class188 var79 = class188.method2887(class184.field2220, field693.field1298);
                                                            var79.field2335.method5340(field754);
                                                            var79.field2335.method5157(var74);
                                                            var79.field2335.method5340(field757);
                                                            var79.field2335.method5177(Statics.field2325.field2573);
                                                            field693.method2109(var79);
                                                        }
                                                    } else if (this.method1178()) {
                                                        this.method1505(field755, field756);
                                                    } else if (field649 > 0) {
                                                        method85(field755, field756);
                                                    }
                                                    field752 = 10;
                                                    class55.field496 = 0;
                                                    Statics.field2325 = null;
                                                } else if (field659 >= 5 && (class55.field494 > field755 + 5 || class55.field494 < field755 - 5 || class55.field492 > field756 + 5 || class55.field492 < field756 - 5)) {
                                                    field758 = true;
                                                }
                                            }
                                            if (class134.method3057()) {
                                                int var80 = class134.field1832;
                                                int var81 = class134.field1833;
                                                class188 var82 = class188.method2887(class184.field2208, field693.field1298);
                                                var82.field2335.method5272(5);
                                                var82.field2335.method5114(Statics.field2367 + var81);
                                                var82.field2335.method5340(Statics.field1262 + var80);
                                                var82.field2335.method5157(class46.field399[82] ? (class46.field399[81] ? 2 : 1) : 0);
                                                field693.method2109(var82);
                                                class134.method3015();
                                                field747 = class55.field497;
                                                field802 = class55.field489;
                                                field750 = 1;
                                                field749 = 0;
                                                field877 = var80;
                                                field878 = var81;
                                            }
                                            if (Statics.field69 != var60) {
                                                if (var60 != null) {
                                                    method4409(var60);
                                                }
                                                if (Statics.field69 != null) {
                                                    method4409(Statics.field69);
                                                }
                                            }
                                            if (Statics.field3297 != var61 && field798 == field797) {
                                                if (var61 != null) {
                                                    method4409(var61);
                                                }
                                                if (Statics.field3297 != null) {
                                                    method4409(Statics.field3297);
                                                }
                                            }
                                            if (Statics.field3297 == null) {
                                                if (field797 > 0) {
                                                    field797--;
                                                }
                                            } else if (field797 < field798) {
                                                field797++;
                                                if (field798 == field797) {
                                                    method4409(Statics.field3297);
                                                }
                                            }
                                            if (field721 == 0) {
                                                int var83 = Statics.field2392.field983;
                                                int var84 = Statics.field2392.field940;
                                                if (Statics.field938 - var83 < -500 || Statics.field938 - var83 > 500 || Statics.field1792 - var84 < -500 || Statics.field1792 - var84 > 500) {
                                                    Statics.field938 = var83;
                                                    Statics.field1792 = var84;
                                                }
                                                if (Statics.field938 != var83) {
                                                    Statics.field938 += (var83 - Statics.field938) / 16;
                                                }
                                                if (Statics.field1792 != var84) {
                                                    Statics.field1792 += (var84 - Statics.field1792) / 16;
                                                }
                                                int var85 = Statics.field938 >> 7;
                                                int var86 = Statics.field1792 >> 7;
                                                int var87 = method228(Statics.field938, Statics.field1792, Statics.field2055);
                                                int var88 = 0;
                                                if (var85 > 3 && var86 > 3 && var85 < 100 && var86 < 100) {
                                                    for (int var89 = var85 - 4; var89 <= var85 + 4; var89++) {
                                                        for (int var90 = var86 - 4; var90 <= var86 + 4; var90++) {
                                                            int var91 = Statics.field2055;
                                                            if (var91 < 3 && (class56.field506[1][var89][var90] & 0x2) == 2) {
                                                                var91++;
                                                            }
                                                            int var92 = var87 - class56.field516[var91][var89][var90];
                                                            if (var92 > var88) {
                                                                var88 = var92;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var93 = var88 * 192;
                                                if (var93 > 98048) {
                                                    var93 = 98048;
                                                }
                                                if (var93 < 32768) {
                                                    var93 = 32768;
                                                }
                                                if (var93 > field819) {
                                                    field819 += (var93 - field819) / 24;
                                                } else if (var93 < field819) {
                                                    field819 += (var93 - field819) / 80;
                                                }
                                                Statics.field167 = method228(Statics.field2392.field983, Statics.field2392.field940, Statics.field2055) - field777;
                                            } else if (field721 == 1) {
                                                method5469();
                                                short var94 = -1;
                                                if (class46.field399[33]) {
                                                    var94 = 0;
                                                } else if (class46.field399[49]) {
                                                    var94 = 1024;
                                                }
                                                if (class46.field399[48]) {
                                                    if (var94 == 0) {
                                                        var94 = 1792;
                                                    } else if (var94 == 1024) {
                                                        var94 = 1280;
                                                    } else {
                                                        var94 = 1536;
                                                    }
                                                } else if (class46.field399[50]) {
                                                    if (var94 == 0) {
                                                        var94 = 256;
                                                    } else if (var94 == 1024) {
                                                        var94 = 768;
                                                    } else {
                                                        var94 = 512;
                                                    }
                                                }
                                                byte var95 = 0;
                                                if (class46.field399[35]) {
                                                    var95 = -1;
                                                } else if (class46.field399[51]) {
                                                    var95 = 1;
                                                }
                                                int var96 = 0;
                                                if (var94 >= 0 || var95 != 0) {
                                                    int var97 = class46.field399[81] ? field727 : field769;
                                                    var96 = var97 * 16;
                                                    field724 = var94;
                                                    field725 = var95;
                                                }
                                                if (field648 < var96) {
                                                    field648 += var96 / 8;
                                                    if (field648 > var96) {
                                                        field648 = var96;
                                                    }
                                                } else if (field648 > var96) {
                                                    field648 = field648 * 9 / 10;
                                                }
                                                if (field648 > 0) {
                                                    int var98 = field648 / 16;
                                                    if (field724 >= 0) {
                                                        int var99 = field724 - Statics.field1057 & 0x7FF;
                                                        int var100 = class131.field1780[var99];
                                                        int var101 = class131.field1781[var99];
                                                        Statics.field938 += var98 * var100 / 65536;
                                                        Statics.field1792 += var98 * var101 / 65536;
                                                    }
                                                    if (field725 != 0) {
                                                        Statics.field167 += field725 * var98;
                                                        if (Statics.field167 > 0) {
                                                            Statics.field167 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field724 = -1;
                                                    field725 = -1;
                                                }
                                                if (class46.field399[13]) {
                                                    field693.method2109(class188.method2887(class184.field2275, field693.field1298));
                                                    field721 = 0;
                                                }
                                            }
                                            if (class55.field490 == 4 && Statics.field540) {
                                                int var102 = class55.field492 - field720;
                                                field718 = var102 * 2;
                                                field720 = var102 == -1 || var102 == 1 ? class55.field492 : (field720 + class55.field492) / 2;
                                                int var103 = field719 - class55.field494;
                                                field768 = var103 * 2;
                                                field719 = var103 == -1 || var103 == 1 ? class55.field494 : (field719 + class55.field494) / 2;
                                            } else {
                                                if (class46.field399[96]) {
                                                    field768 += (-24 - field768) / 2;
                                                } else if (class46.field399[97]) {
                                                    field768 += (24 - field768) / 2;
                                                } else {
                                                    field768 /= 2;
                                                }
                                                if (class46.field399[98]) {
                                                    field718 += (12 - field718) / 2;
                                                } else if (class46.field399[99]) {
                                                    field718 += (-12 - field718) / 2;
                                                } else {
                                                    field718 /= 2;
                                                }
                                                field720 = class55.field492;
                                                field719 = class55.field494;
                                            }
                                            field717 = field768 / 2 + field717 & 0x7FF;
                                            field715 += field718 / 2;
                                            if (field715 < 128) {
                                                field715 = 128;
                                            }
                                            if (field715 > 383) {
                                                field715 = 383;
                                            }
                                            if (field671) {
                                                int var104 = Statics.field641 * 128 + 64;
                                                int var105 = Statics.field1320 * 128 + 64;
                                                int var106 = method228(var104, var105, Statics.field2055) - Statics.field307;
                                                if (Statics.field3343 < var104) {
                                                    Statics.field3343 += Statics.field3231 * (var104 - Statics.field3343) / 1000 + Statics.field3661;
                                                    if (Statics.field3343 > var104) {
                                                        Statics.field3343 = var104;
                                                    }
                                                }
                                                if (Statics.field3343 > var104) {
                                                    Statics.field3343 -= Statics.field3231 * (Statics.field3343 - var104) / 1000 + Statics.field3661;
                                                    if (Statics.field3343 < var104) {
                                                        Statics.field3343 = var104;
                                                    }
                                                }
                                                if (Statics.field438 < var106) {
                                                    Statics.field438 += Statics.field3231 * (var106 - Statics.field438) / 1000 + Statics.field3661;
                                                    if (Statics.field438 > var106) {
                                                        Statics.field438 = var106;
                                                    }
                                                }
                                                if (Statics.field438 > var106) {
                                                    Statics.field438 -= Statics.field3231 * (Statics.field438 - var106) / 1000 + Statics.field3661;
                                                    if (Statics.field438 < var106) {
                                                        Statics.field438 = var106;
                                                    }
                                                }
                                                if (Statics.field1000 < var105) {
                                                    Statics.field1000 += Statics.field3231 * (var105 - Statics.field1000) / 1000 + Statics.field3661;
                                                    if (Statics.field1000 > var105) {
                                                        Statics.field1000 = var105;
                                                    }
                                                }
                                                if (Statics.field1000 > var105) {
                                                    Statics.field1000 -= Statics.field3231 * (Statics.field1000 - var105) / 1000 + Statics.field3661;
                                                    if (Statics.field1000 < var105) {
                                                        Statics.field1000 = var105;
                                                    }
                                                }
                                                int var107 = Statics.field2347 * 128 + 64;
                                                int var108 = Statics.field140 * 128 + 64;
                                                int var109 = method228(var107, var108, Statics.field2055) - Statics.field2550;
                                                int var110 = var107 - Statics.field3343;
                                                int var111 = var109 - Statics.field438;
                                                int var112 = var108 - Statics.field1000;
                                                int var113 = (int) Math.sqrt((double) (var110 * var110 + var112 * var112));
                                                int var114 = (int) (Math.atan2((double) var111, (double) var113) * 325.949D) & 0x7FF;
                                                int var115 = (int) (Math.atan2((double) var110, (double) var112) * -325.949D) & 0x7FF;
                                                if (var114 < 128) {
                                                    var114 = 128;
                                                }
                                                if (var114 > 383) {
                                                    var114 = 383;
                                                }
                                                if (Statics.field61 < var114) {
                                                    Statics.field61 += Statics.field436 * (var114 - Statics.field61) / 1000 + Statics.field241;
                                                    if (Statics.field61 > var114) {
                                                        Statics.field61 = var114;
                                                    }
                                                }
                                                if (Statics.field61 > var114) {
                                                    Statics.field61 -= Statics.field436 * (Statics.field61 - var114) / 1000 + Statics.field241;
                                                    if (Statics.field61 < var114) {
                                                        Statics.field61 = var114;
                                                    }
                                                }
                                                int var116 = var115 - Statics.field1057;
                                                if (var116 > 1024) {
                                                    var116 -= 2048;
                                                }
                                                if (var116 < -1024) {
                                                    var116 += 2048;
                                                }
                                                if (var116 > 0) {
                                                    Statics.field1057 += Statics.field436 * var116 / 1000 + Statics.field241;
                                                    Statics.field1057 &= 0x7FF;
                                                }
                                                if (var116 < 0) {
                                                    Statics.field1057 -= Statics.field436 * -var116 / 1000 + Statics.field241;
                                                    Statics.field1057 &= 0x7FF;
                                                }
                                                int var117 = var115 - Statics.field1057;
                                                if (var117 > 1024) {
                                                    var117 -= 2048;
                                                }
                                                if (var117 < -1024) {
                                                    var117 += 2048;
                                                }
                                                if (var117 < 0 && var116 > 0 || var117 > 0 && var116 < 0) {
                                                    Statics.field1057 = var115;
                                                }
                                            }
                                            for (int var118 = 0; var118 < 5; var118++) {
                                                int var10002 = field896[var118]++;
                                            }
                                            Statics.field2408.method2024();
                                            int var119 = class55.method3662();
                                            int var120 = class46.method4960();
                                            if (var119 > 15000 && var120 > 15000) {
                                                field694 = 250;
                                                class55.field483 = 14500;
                                                class188 var121 = class188.method2887(class184.field2288, field693.field1298);
                                                field693.method2109(var121);
                                            }
                                            Statics.field415.method1690();
                                            field693.field1304++;
                                            if (field693.field1304 > 50) {
                                                class188 var122 = class188.method2887(class184.field2248, field693.field1298);
                                                field693.method2109(var122);
                                            }
                                            try {
                                                field693.method2108();
                                            } catch (IOException var124) {
                                                method269();
                                            }
                                            return;
                                        }
                                        var71 = var70.field574;
                                        if (var71.field2574 < 0) {
                                            break;
                                        }
                                        var72 = class218.method3666(var71.field2592);
                                    } while (var72 == null || var72.field2699 == null || var71.field2574 >= var72.field2699.length || var72.field2699[var71.field2574] != var71);
                                    class77.method46(var70);
                                }
                            }
                            var68 = var67.field574;
                            if (var68.field2574 < 0) {
                                break;
                            }
                            var69 = class218.method3666(var68.field2592);
                        } while (var69 == null || var69.field2699 == null || var68.field2574 >= var69.field2699.length || var69.field2699[var68.field2574] != var68);
                        class77.method46(var67);
                    }
                }
                var65 = var64.field574;
                if (var65.field2574 < 0) {
                    break;
                }
                var66 = class218.method3666(var65.field2592);
            } while (var66 == null || var66.field2699 == null || var65.field2574 >= var66.field2699.length || var66.field2699[var65.field2574] != var65);
            class77.method46(var64);
        }
    }

    @ObfuscatedName("fp.fv(I)V")
    public static final void method3199() {
        if (Statics.field385 != null) {
            Statics.field385.method2290();
        }
        if (Statics.field127 != null) {
            Statics.field127.method2290();
        }
    }

    @ObfuscatedName("hg.fo(I)V")
    public static final void method3813() {
        for (int var0 = 0; var0 < field845; var0++) {
            int var10002 = field888[var0]--;
            if (field888[var0] >= -10) {
                class102 var2 = field890[var0];
                if (var2 == null) {
                    class102 var10000 = (class102) null;
                    var2 = class102.method2212(Statics.field783, field692[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field888[var0] += var2.method2218();
                    field890[var0] = var2;
                }
                if (field888[var0] < 0) {
                    int var9;
                    if (field924[var0] == 0) {
                        var9 = field883;
                    } else {
                        int var3 = (field924[var0] & 0xFF) * 128;
                        int var4 = field924[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2392.field983;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field924[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2392.field940;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field888[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field884 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class104 var10 = var2.method2210().method2257(Statics.field291);
                        class114 var11 = class114.method2383(var10, 100, var9);
                        var11.method2423(field887[var0] - 1);
                        Statics.field12.method2154(var11);
                    }
                    field888[var0] = -100;
                }
            } else {
                field845--;
                for (int var1 = var0; var1 < field845; var1++) {
                    field692[var1] = field692[var1 + 1];
                    field890[var1] = field890[var1 + 1];
                    field887[var1] = field887[var1 + 1];
                    field888[var1] = field888[var1 + 1];
                    field924[var1] = field924[var1 + 1];
                }
                var0--;
            }
        }
        if (!field882) {
            return;
        }
        boolean var12;
        if (class198.field2415 == 0) {
            var12 = Statics.field2409.method3440();
        } else {
            var12 = true;
        }
        if (var12) {
            return;
        }
        if (field861 != 0 && field881 != -1) {
            class237 var13 = Statics.field484;
            int var14 = field881;
            int var15 = field861;
            class198.field2415 = 1;
            Statics.field1982 = var13;
            Statics.field2411 = var14;
            Statics.field1150 = 0;
            Statics.field1156 = var15;
            Statics.field402 = false;
            Statics.field2413 = 10000;
        }
        field882 = false;
    }

    @ObfuscatedName("aq.fa(IIII)V")
    public static void method531(int arg0, int arg1, int arg2) {
        if (field883 == 0 || arg1 == 0 || field845 >= 50) {
            return;
        }
        field692[field845] = arg0;
        field887[field845] = arg1;
        field888[field845] = arg2;
        field890[field845] = null;
        field924[field845] = 0;
        field845++;
    }

    @ObfuscatedName("kv.fy(II)V")
    public static void method5418(int arg0) {
        if (arg0 == -1 && !field882) {
            Statics.field2409.method3439();
            class198.field2415 = 1;
            Statics.field1982 = null;
        } else if (arg0 != -1 && field881 != arg0 && field861 != 0 && !field882) {
            class198.method3247(2, Statics.field484, arg0, 0, field861, false);
        }
        field881 = arg0;
    }

    @ObfuscatedName("ab.fd(III)V")
    public static void method721(int arg0, int arg1) {
        if (field861 == 0 || arg0 == -1) {
            return;
        }
        class237 var2 = Statics.field66;
        int var3 = field861;
        class198.field2415 = 1;
        Statics.field1982 = var2;
        Statics.field2411 = arg0;
        Statics.field1150 = 0;
        Statics.field1156 = var3;
        Statics.field402 = false;
        Statics.field2413 = 10000;
        field882 = true;
    }

    @ObfuscatedName("ai.fq(B)V")
    public static final void method714() {
        if (!Statics.field2050) {
            return;
        }
        if (Statics.field568 != null) {
            Statics.field568.method4744();
        }
        method5470();
        Statics.field2050 = false;
    }

    @ObfuscatedName("jo.fc(Lhn;III)V")
    public static final void method4639(class218 arg0, int arg1, int arg2) {
        if (field879 != 0 && field879 != 3 || field782 || !(class55.field496 == 1 || !Statics.field540 && class55.field496 == 4)) {
            return;
        }
        class212 var3 = arg0.method3781(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field497 - arg1;
        int var5 = class55.field489 - arg2;
        if (!var3.method3659(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2529 / 2;
        int var7 = var5 - var3.field2526 / 2;
        int var8 = field717 & 0x7FF;
        int var9 = class131.field1780[var8];
        int var10 = class131.field1781[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2392.field983 + var11 >> 7;
        int var14 = Statics.field2392.field940 - var12 >> 7;
        class188 var15 = class188.method2887(class184.field2277, field693.field1298);
        var15.field2335.method5272(18);
        var15.field2335.method5114(Statics.field2367 + var14);
        var15.field2335.method5340(Statics.field1262 + var13);
        var15.field2335.method5157(class46.field399[82] ? (class46.field399[81] ? 2 : 1) : 0);
        var15.field2335.method5272(var6);
        var15.field2335.method5272(var7);
        var15.field2335.method5114(field717);
        var15.field2335.method5272(57);
        var15.field2335.method5272(0);
        var15.field2335.method5272(0);
        var15.field2335.method5272(89);
        var15.field2335.method5114(Statics.field2392.field983);
        var15.field2335.method5114(Statics.field2392.field940);
        var15.field2335.method5272(63);
        field693.method2109(var15);
        field877 = var13;
        field878 = var14;
    }

    @ObfuscatedName("ib.ft(Ljava/lang/String;I)V")
    public static final void method3994(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field221.field1049 = !Statics.field221.field1049;
            class74.method586();
            if (Statics.field221.field1049) {
                class92.method1681(99, "", "Roofs are now all hidden");
            } else {
                class92.method1681(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field709 = !field709;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field765 = !field765;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field794 = !field794;
        }
        if (field684 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field146.field4000 = !Statics.field146.field4000;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field709 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field709 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method269();
            }
        }
        class188 var1 = class188.method2887(class184.field2271, field693.field1298);
        var1.field2335.method5272(arg0.length() + 1);
        var1.field2335.method5310(arg0);
        field693.method2109(var1);
    }

    @ObfuscatedName("eq.fr(I)V")
    public static final void method3060() {
        int var0 = class90.field1247;
        int[] var1 = class90.field1241;
        for (int var2 = 0; var2 < var0; var2++) {
            class67 var3 = field762[var1[var2]];
            if (var3 != null) {
                method1014(var3, 1);
            }
        }
    }

    @ObfuscatedName("af.gb(B)V")
    public static final void method372() {
        for (int var0 = 0; var0 < field880; var0++) {
            int var1 = field690[var0];
            class80 var2 = field688[var1];
            if (var2 != null) {
                method1014(var2, var2.field1120.field3484);
            }
        }
    }

    @ObfuscatedName("bb.gi(Lbx;II)V")
    public static final void method1014(class70 arg0, int arg1) {
        if (arg0.field986 >= field656) {
            method3364(arg0);
        } else if (arg0.field987 >= field656) {
            method68(arg0);
        } else {
            method503(arg0);
        }
        if (arg0.field983 < 128 || arg0.field940 < 128 || arg0.field983 >= 13184 || arg0.field940 >= 13184) {
            arg0.field995 = -1;
            arg0.field985 = -1;
            arg0.field986 = 0;
            arg0.field987 = 0;
            arg0.field983 = arg0.field978[0] * 128 + arg0.field943 * 64;
            arg0.field940 = arg0.field996[0] * 128 + arg0.field943 * 64;
            arg0.method1573();
        }
        if (Statics.field2392 == arg0 && (arg0.field983 < 1536 || arg0.field940 < 1536 || arg0.field983 >= 11776 || arg0.field940 >= 11776)) {
            arg0.field995 = -1;
            arg0.field985 = -1;
            arg0.field986 = 0;
            arg0.field987 = 0;
            arg0.field983 = arg0.field978[0] * 128 + arg0.field943 * 64;
            arg0.field940 = arg0.field996[0] * 128 + arg0.field943 * 64;
            arg0.method1573();
        }
        if (arg0.field976 != 0) {
            if (arg0.field966 != -1) {
                class70 var2 = null;
                if (arg0.field966 < 32768) {
                    var2 = field688[arg0.field966];
                } else if (arg0.field966 >= 32768) {
                    var2 = field762[arg0.field966 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field983 - var2.field983;
                    int var4 = arg0.field940 - var2.field940;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field991 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field946) {
                    arg0.field966 = -1;
                    arg0.field946 = false;
                }
            }
            if (arg0.field968 != -1 && (arg0.field974 == 0 || arg0.field998 > 0)) {
                arg0.field991 = arg0.field968;
                arg0.field968 = -1;
            }
            int var5 = arg0.field991 - arg0.field972 & 0x7FF;
            if (var5 == 0 && arg0.field946) {
                arg0.field966 = -1;
                arg0.field946 = false;
            }
            if (var5 == 0) {
                arg0.field957 = 0;
            } else {
                arg0.field957++;
                if (var5 > 1024) {
                    arg0.field972 -= arg0.field976;
                    boolean var6 = true;
                    if (var5 < arg0.field976 || var5 > 2048 - arg0.field976) {
                        arg0.field972 = arg0.field991;
                        var6 = false;
                    }
                    if (arg0.field969 == arg0.field945 && (arg0.field957 > 25 || var6)) {
                        if (arg0.field951 == -1) {
                            arg0.field969 = arg0.field994;
                        } else {
                            arg0.field969 = arg0.field951;
                        }
                    }
                } else {
                    arg0.field972 += arg0.field976;
                    boolean var7 = true;
                    if (var5 < arg0.field976 || var5 > 2048 - arg0.field976) {
                        arg0.field972 = arg0.field991;
                        var7 = false;
                    }
                    if (arg0.field969 == arg0.field945 && (arg0.field957 > 25 || var7)) {
                        if (arg0.field947 == -1) {
                            arg0.field969 = arg0.field994;
                        } else {
                            arg0.field969 = arg0.field947;
                        }
                    }
                }
                arg0.field972 &= 0x7FF;
            }
        }
        arg0.field948 = false;
        if (arg0.field969 != -1) {
            class260 var9 = class260.method5476(arg0.field969);
            if (var9 == null || var9.field3526 == null) {
                arg0.field969 = -1;
            } else {
                arg0.field971++;
                if (arg0.field970 < var9.field3526.length && arg0.field971 > var9.field3515[arg0.field970]) {
                    arg0.field971 = 1;
                    arg0.field970++;
                    Statics.method3076(var9, arg0.field970, arg0.field983, arg0.field940);
                }
                if (arg0.field970 >= var9.field3526.length) {
                    arg0.field971 = 0;
                    arg0.field970 = 0;
                    Statics.method3076(var9, arg0.field970, arg0.field983, arg0.field940);
                }
            }
        }
        if (arg0.field985 != -1 && field656 >= arg0.field980) {
            if (arg0.field979 < 0) {
                arg0.field979 = 0;
            }
            int var10 = class245.method1108(arg0.field985).field3246;
            if (var10 == -1) {
                arg0.field985 = -1;
            } else {
                class260 var11 = class260.method5476(var10);
                if (var11 == null || var11.field3526 == null) {
                    arg0.field985 = -1;
                } else {
                    arg0.field993++;
                    if (arg0.field979 < var11.field3526.length && arg0.field993 > var11.field3515[arg0.field979]) {
                        arg0.field993 = 1;
                        arg0.field979++;
                        Statics.method3076(var11, arg0.field979, arg0.field983, arg0.field940);
                    }
                    if (arg0.field979 >= var11.field3526.length && (arg0.field979 < 0 || arg0.field979 >= var11.field3526.length)) {
                        arg0.field985 = -1;
                    }
                }
            }
        }
        if (arg0.field995 != -1 && arg0.field975 <= 1) {
            class260 var12 = class260.method5476(arg0.field995);
            if (var12.field3524 == 1 && arg0.field999 > 0 && arg0.field986 <= field656 && arg0.field987 < field656) {
                arg0.field975 = 1;
                return;
            }
        }
        if (arg0.field995 != -1 && arg0.field975 == 0) {
            class260 var13 = class260.method5476(arg0.field995);
            if (var13 == null || var13.field3526 == null) {
                arg0.field995 = -1;
            } else {
                arg0.field990++;
                if (arg0.field973 < var13.field3526.length && arg0.field990 > var13.field3515[arg0.field973]) {
                    arg0.field990 = 1;
                    arg0.field973++;
                    Statics.method3076(var13, arg0.field973, arg0.field983, arg0.field940);
                }
                if (arg0.field973 >= var13.field3526.length) {
                    arg0.field973 -= var13.field3520;
                    arg0.field984++;
                    if (arg0.field984 >= var13.field3523) {
                        arg0.field995 = -1;
                    } else if (arg0.field973 >= 0 && arg0.field973 < var13.field3526.length) {
                        Statics.method3076(var13, arg0.field973, arg0.field983, arg0.field940);
                    } else {
                        arg0.field995 = -1;
                    }
                }
                arg0.field948 = var13.field3519;
            }
        }
        if (arg0.field975 > 0) {
            arg0.field975--;
        }
    }

    @ObfuscatedName("gy.ge(Lbx;I)V")
    public static final void method3364(class70 arg0) {
        int var1 = Math.max(1, arg0.field986 - field656);
        int var2 = arg0.field982 * 128 + arg0.field943 * 64;
        int var3 = arg0.field958 * 128 + arg0.field943 * 64;
        arg0.field983 += (var2 - arg0.field983) / var1;
        arg0.field940 += (var3 - arg0.field940) / var1;
        arg0.field998 = 0;
        arg0.field991 = arg0.field988;
    }

    @ObfuscatedName("l.gy(Lbx;I)V")
    public static final void method68(class70 arg0) {
        if (field656 == arg0.field987 || arg0.field995 == -1 || arg0.field975 != 0 || arg0.field990 + 1 > class260.method5476(arg0.field995).field3515[arg0.field973]) {
            int var1 = arg0.field987 - arg0.field986;
            int var2 = field656 - arg0.field986;
            int var3 = arg0.field982 * 128 + arg0.field943 * 64;
            int var4 = arg0.field958 * 128 + arg0.field943 * 64;
            int var5 = arg0.field962 * 128 + arg0.field943 * 64;
            int var6 = arg0.field992 * 128 + arg0.field943 * 64;
            arg0.field983 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field940 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field998 = 0;
        arg0.field991 = arg0.field988;
        arg0.field972 = arg0.field991;
    }

    @ObfuscatedName("ax.ga(Lbx;I)V")
    public static final void method503(class70 arg0) {
        arg0.field969 = arg0.field945;
        if (arg0.field974 == 0) {
            arg0.field998 = 0;
            return;
        }
        if (arg0.field995 != -1 && arg0.field975 == 0) {
            class260 var1 = class260.method5476(arg0.field995);
            if (arg0.field999 > 0 && var1.field3524 == 0) {
                arg0.field998++;
                return;
            }
            if (arg0.field999 <= 0 && var1.field3525 == 0) {
                arg0.field998++;
                return;
            }
        }
        int var2 = arg0.field983;
        int var3 = arg0.field940;
        int var4 = arg0.field978[arg0.field974 - 1] * 128 + arg0.field943 * 64;
        int var5 = arg0.field996[arg0.field974 - 1] * 128 + arg0.field943 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field991 = 1280;
            } else if (var3 > var5) {
                arg0.field991 = 1792;
            } else {
                arg0.field991 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field991 = 768;
            } else if (var3 > var5) {
                arg0.field991 = 256;
            } else {
                arg0.field991 = 512;
            }
        } else if (var3 < var5) {
            arg0.field991 = 1024;
        } else if (var3 > var5) {
            arg0.field991 = 0;
        }
        byte var6 = arg0.field997[arg0.field974 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field983 = var4;
            arg0.field940 = var5;
            arg0.field974--;
            if (arg0.field999 > 0) {
                arg0.field999--;
            }
            return;
        }
        int var7 = arg0.field991 - arg0.field972 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field967;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field994;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field960;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field977;
        }
        if (var8 == -1) {
            var8 = arg0.field994;
        }
        arg0.field969 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class80) {
            var10 = ((class80) arg0).field1120.field3488;
        }
        if (var10) {
            if (arg0.field991 != arg0.field972 && arg0.field966 == -1 && arg0.field976 != 0) {
                var9 = 2;
            }
            if (arg0.field974 > 2) {
                var9 = 6;
            }
            if (arg0.field974 > 3) {
                var9 = 8;
            }
            if (arg0.field998 > 0 && arg0.field974 > 1) {
                var9 = 8;
                arg0.field998--;
            }
        } else {
            if (arg0.field974 > 1) {
                var9 = 6;
            }
            if (arg0.field974 > 2) {
                var9 = 8;
            }
            if (arg0.field998 > 0 && arg0.field974 > 1) {
                var9 = 8;
                arg0.field998--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field994 == arg0.field969 && arg0.field952 != -1) {
            arg0.field969 = arg0.field952;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field983 += var9;
                if (arg0.field983 > var4) {
                    arg0.field983 = var4;
                }
            } else if (var2 > var4) {
                arg0.field983 -= var9;
                if (arg0.field983 < var4) {
                    arg0.field983 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field940 += var9;
                if (arg0.field940 > var5) {
                    arg0.field940 = var5;
                }
            } else if (var3 > var5) {
                arg0.field940 -= var9;
                if (arg0.field940 < var5) {
                    arg0.field940 = var5;
                }
            }
        }
        if (arg0.field983 == var4 && arg0.field940 == var5) {
            arg0.field974--;
            if (arg0.field999 > 0) {
                arg0.field999--;
            }
        }
    }

    @ObfuscatedName("be.gs(Lba;III)V")
    public static void method1043(class67 arg0, int arg1, int arg2) {
        if (arg0.field995 == arg1 && arg1 != -1) {
            int var3 = class260.method5476(arg1).field3517;
            if (var3 == 1) {
                arg0.field973 = 0;
                arg0.field990 = 0;
                arg0.field975 = arg2;
                arg0.field984 = 0;
            }
            if (var3 == 2) {
                arg0.field984 = 0;
            }
        } else if (arg1 == -1 || arg0.field995 == -1 || class260.method5476(arg1).field3509 >= class260.method5476(arg0.field995).field3509) {
            arg0.field995 = arg1;
            arg0.field973 = 0;
            arg0.field990 = 0;
            arg0.field975 = arg2;
            arg0.field984 = 0;
            arg0.field999 = arg0.field974;
        }
    }

    @ObfuscatedName("jy.gm(I)I")
    public static int method4856() {
        return field735 ? 2 : 1;
    }

    @ObfuscatedName("dp.gn(II)V")
    public static void method2798(int arg0) {
        field860 = 0L;
        if (arg0 >= 2) {
            field735 = true;
        } else {
            field735 = false;
        }
        if (method4856() == 1) {
            Statics.field3618.method817(765, 503);
        } else {
            Statics.field3618.method817(7680, 2160);
        }
        if (field773 >= 25) {
            method4019();
        }
    }

    @ObfuscatedName("in.gl(S)V")
    public static void method4019() {
        class188 var0 = class188.method2887(class184.field2290, field693.field1298);
        var0.field2335.method5272(method4856());
        var0.field2335.method5114(Statics.field3615);
        var0.field2335.method5114(Statics.field345);
        field693.method2109(var0);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method782() {
        field860 = Statics.method184() + 500L;
        this.method1301();
        if (field806 != -1) {
            this.method1360(true);
        }
    }

    @ObfuscatedName("client.gx(B)V")
    public void method1301() {
        int var1 = Statics.field3615;
        int var2 = Statics.field345;
        if (this.field473 < var1) {
            int var3 = this.field473;
        }
        if (this.field443 < var2) {
            int var4 = this.field443;
        }
        if (Statics.field221 == null) {
            return;
        }
        try {
            client var5 = Statics.field3618;
            Object[] var6 = new Object[] { method4856() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public final void method1175() {
        if (field806 != -1) {
            method130(field806);
        }
        for (int var1 = 0; var1 < field791; var1++) {
            if (field852[var1]) {
                field853[var1] = true;
            }
            field854[var1] = field852[var1];
            field852[var1] = false;
        }
        field851 = field656;
        field795 = -1;
        field864 = -1;
        Statics.field1605 = null;
        if (field806 != -1) {
            field791 = 0;
            Statics.method3358(field806, 0, 0, Statics.field3615, Statics.field345, 0, 0, -1);
        }
        class322.method5581();
        if (field751) {
            if (field750 == 1) {
                Statics.field109[field749 / 100].method5785(field747 - 8, field802 - 8);
            }
            if (field750 == 2) {
                Statics.field109[field749 / 100 + 4].method5785(field747 - 8, field802 - 8);
            }
        }
        if (field782) {
            method44();
        } else if (field795 != -1) {
            method4804(field795, field864);
        }
        if (field910 == 3) {
            for (int var2 = 0; var2 < field791; var2++) {
                if (field854[var2]) {
                    class322.method5589(field748[var2], field645[var2], field857[var2], field858[var2], 16711935, 128);
                } else if (field853[var2]) {
                    class322.method5589(field748[var2], field645[var2], field857[var2], field858[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field2055;
        int var4 = Statics.field2392.field983;
        int var5 = Statics.field2392.field940;
        int var6 = field708;
        for (class76 var7 = (class76) class76.field1068.method4543(); var7 != null; var7 = (class76) class76.field1068.method4564()) {
            if (var7.field1073 != -1 || var7.field1077 != null) {
                int var8 = 0;
                if (var4 > var7.field1070) {
                    var8 += var4 - var7.field1070;
                } else if (var4 < var7.field1067) {
                    var8 += var7.field1067 - var4;
                }
                if (var5 > var7.field1081) {
                    var8 += var5 - var7.field1081;
                } else if (var5 < var7.field1066) {
                    var8 += var7.field1066 - var5;
                }
                if (var8 - 64 > var7.field1071 || field884 == 0 || var7.field1080 != var3) {
                    if (var7.field1069 != null) {
                        Statics.field12.method2174(var7.field1069);
                        var7.field1069 = null;
                    }
                    if (var7.field1079 != null) {
                        Statics.field12.method2174(var7.field1079);
                        var7.field1079 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field884 * (var7.field1071 - var8) / var7.field1071;
                    class102 var10000;
                    if (var7.field1069 != null) {
                        var7.field1069.method2427(var9);
                    } else if (var7.field1073 >= 0) {
                        var10000 = (class102) null;
                        class102 var10 = class102.method2212(Statics.field783, var7.field1073, 0);
                        if (var10 != null) {
                            class104 var11 = var10.method2210().method2257(Statics.field291);
                            class114 var12 = class114.method2383(var11, 100, var9);
                            var12.method2423(-1);
                            Statics.field12.method2154(var12);
                            var7.field1069 = var12;
                        }
                    }
                    if (var7.field1079 != null) {
                        var7.field1079.method2427(var9);
                        if (!var7.field1079.method3353()) {
                            var7.field1079 = null;
                        }
                    } else if (var7.field1077 != null && (var7.field1078 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field1077.length);
                        var10000 = (class102) null;
                        class102 var14 = class102.method2212(Statics.field783, var7.field1077[var13], 0);
                        if (var14 != null) {
                            class104 var15 = var14.method2210().method2257(Statics.field291);
                            class114 var16 = class114.method2383(var15, 100, var9);
                            var16.method2423(0);
                            Statics.field12.method2154(var16);
                            var7.field1079 = var16;
                            var7.field1078 = var7.field1075 + (int) (Math.random() * (double) (var7.field1076 - var7.field1075));
                        }
                    }
                }
            }
        }
        field708 = 0;
    }

    @ObfuscatedName("gj.go(Ljava/lang/String;ZI)V")
    public static final void method3426(String arg0, boolean arg1) {
        if (!field745) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field97.method5065(arg0, 250);
        int var6 = Statics.field97.method5022(arg0, 250) * 13;
        class322.method5590(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class322.method5626(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field97.method4986(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field791; var11++) {
            if (field857[var11] + field748[var11] > var7 && field748[var11] < var7 + var9 && field858[var11] + field645[var11] > var8 && field645[var11] < var8 + var10) {
                field852[var11] = true;
            }
        }
        if (arg1) {
            Statics.field418.method759(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field791; var16++) {
            if (field857[var16] + field748[var16] > var12 && field748[var16] < var12 + var14 && field858[var16] + field645[var16] > var13 && field645[var16] < var13 + var15) {
                field853[var16] = true;
            }
        }
    }

    @ObfuscatedName("aa.gq(IIIII)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3) {
        field702++;
        method121();
        if (field765) {
            method756(Statics.field2392, false);
        }
        if (field759 >= 0 && field762[field759] != null) {
            method756(field762[field759], false);
        }
        method1035(true);
        method609();
        method1035(false);
        for (class87 var4 = (class87) field686.method4543(); var4 != null; var4 = (class87) field686.method4564()) {
            if (Statics.field2055 != var4.field1213 || field656 > var4.field1217) {
                var4.method3351();
            } else if (field656 >= var4.field1218) {
                if (var4.field1208 > 0) {
                    class80 var5 = field688[var4.field1208 - 1];
                    if (var5 != null && var5.field983 >= 0 && var5.field983 < 13312 && var5.field940 >= 0 && var5.field940 < 13312) {
                        var4.method1967(var5.field983, var5.field940, method228(var5.field983, var5.field940, var4.field1213) - var4.field1205, field656);
                    }
                }
                if (var4.field1208 < 0) {
                    int var6 = -var4.field1208 - 1;
                    class67 var7;
                    if (field739 == var6) {
                        var7 = Statics.field2392;
                    } else {
                        var7 = field762[var6];
                    }
                    if (var7 != null && var7.field983 >= 0 && var7.field983 < 13312 && var7.field940 >= 0 && var7.field940 < 13312) {
                        var4.method1967(var7.field983, var7.field940, method228(var7.field983, var7.field940, var4.field1213) - var4.field1205, field656);
                    }
                }
                var4.method1968(field708);
                Statics.field3111.method2902(Statics.field2055, (int) var4.field1210, (int) var4.field1211, (int) var4.field1212, 60, var4, var4.field1203, -1L, false);
            }
        }
        method1009();
        method110(arg0, arg1, arg2, arg3, true);
        int var8 = field905;
        int var9 = field906;
        int var10 = field907;
        int var11 = field908;
        class322.method5582(var8, var9, var8 + var10, var9 + var11);
        class131.method2801();
        if (!field671) {
            int var12 = field715;
            if (field819 / 256 > var12) {
                var12 = field819 / 256;
            }
            if (field776[4] && field700[4] + 128 > var12) {
                var12 = field700[4] + 128;
            }
            int var13 = field717 & 0x7FF;
            int var14 = Statics.field938;
            int var15 = Statics.field167;
            int var16 = Statics.field1792;
            int var17 = var12 * 3 + 600;
            int var19 = method717(var17, var11);
            int var20 = 2048 - var12 & 0x7FF;
            int var21 = 2048 - var13 & 0x7FF;
            int var22 = 0;
            int var23 = 0;
            int var24 = var19;
            if (var20 != 0) {
                int var25 = class131.field1780[var20];
                int var26 = class131.field1781[var20];
                int var27 = var23 * var26 - var19 * var25 >> 16;
                var24 = var23 * var25 + var19 * var26 >> 16;
                var23 = var27;
            }
            if (var21 != 0) {
                int var28 = class131.field1780[var21];
                int var29 = class131.field1781[var21];
                int var30 = var22 * var29 + var24 * var28 >> 16;
                var24 = var24 * var29 - var22 * var28 >> 16;
                var22 = var30;
            }
            Statics.field3343 = var14 - var22;
            Statics.field438 = var15 - var23;
            Statics.field1000 = var16 - var24;
            Statics.field61 = var12;
            Statics.field1057 = var13;
            if (field721 == 1 && field684 >= 2 && field656 % 50 == 0 && (Statics.field938 >> 7 != Statics.field2392.field983 >> 7 || Statics.field1792 >> 7 != Statics.field2392.field940 >> 7)) {
                int var31 = Statics.field2392.field614;
                int var32 = (Statics.field938 >> 7) + Statics.field1262;
                int var33 = (Statics.field1792 >> 7) + Statics.field2367;
                method501(var32, var33, var31, true);
            }
        }
        int var34;
        if (field671) {
            int var35;
            if (Statics.field221.field1049) {
                var35 = Statics.field2055;
            } else {
                int var36 = method228(Statics.field3343, Statics.field1000, Statics.field2055);
                if (var36 - Statics.field438 >= 800 || (class56.field506[Statics.field2055][Statics.field3343 >> 7][Statics.field1000 >> 7] & 0x4) == 0) {
                    var35 = 3;
                } else {
                    var35 = Statics.field2055;
                }
            }
            var34 = var35;
        } else {
            var34 = method2150();
        }
        int var37 = Statics.field3343;
        int var38 = Statics.field438;
        int var39 = Statics.field1000;
        int var40 = Statics.field61;
        int var41 = Statics.field1057;
        for (int var42 = 0; var42 < 5; var42++) {
            if (field776[var42]) {
                int var43 = (int) (Math.random() * (double) (field893[var42] * 2 + 1) - (double) field893[var42] + Math.sin((double) field895[var42] / 100.0D * (double) field896[var42]) * (double) field700[var42]);
                if (var42 == 0) {
                    Statics.field3343 += var43;
                }
                if (var42 == 1) {
                    Statics.field438 += var43;
                }
                if (var42 == 2) {
                    Statics.field1000 += var43;
                }
                if (var42 == 3) {
                    Statics.field1057 = Statics.field1057 + var43 & 0x7FF;
                }
                if (var42 == 4) {
                    Statics.field61 += var43;
                    if (Statics.field61 < 128) {
                        Statics.field61 = 128;
                    }
                    if (Statics.field61 > 383) {
                        Statics.field61 = 383;
                    }
                }
            }
        }
        int var44 = class55.field494;
        int var45 = class55.field492;
        if (class55.field496 != 0) {
            var44 = class55.field497;
            var45 = class55.field489;
        }
        if (var44 >= var8 && var44 < var8 + var10 && var45 >= var9 && var45 < var9 + var11) {
            class129.method1099(var44 - var8, var45 - var9);
        } else {
            class129.field1735 = false;
            class129.field1736 = 0;
        }
        method3199();
        class322.method5590(var8, var9, var10, var11, 0);
        method3199();
        int var46 = class131.field1766;
        class131.field1766 = field732;
        Statics.field3111.method2932(Statics.field3343, Statics.field438, Statics.field1000, Statics.field61, Statics.field1057, var34);
        class131.field1766 = var46;
        method3199();
        Statics.field3111.method2905();
        method3641(var8, var9, var10, var11);
        if (field664 == 2) {
            method1057((field667 - Statics.field1262 << 7) + field733, (field668 - Statics.field2367 << 7) + field784, field669 * 2);
            if (field779 > -1 && field656 % 20 < 10) {
                Statics.field533[0].method5785(field779 + var8 - 12, field886 + var9 - 28);
            }
        }
        ((class120) Statics.field1777).method2552(field708);
        method3341(var8, var9, var10, var11);
        Statics.field3343 = var37;
        Statics.field438 = var38;
        Statics.field1000 = var39;
        Statics.field61 = var40;
        Statics.field1057 = var41;
        if (field655) {
            byte var47 = 0;
            int var48 = class238.field3179 + class238.field3176 + var47;
            if (var48 == 0) {
                field655 = false;
            }
        }
        if (field655) {
            class322.method5590(var8, var9, var10, var11, 0);
            method3426(class225.field2778, false);
        }
    }

    @ObfuscatedName("p.gt(IIIIZI)V")
    public static final void method110(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field909;
        } else if (var5 >= 100) {
            var6 = field898;
        } else {
            var6 = (field898 - field909) * var5 / 100 + field909;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field820) {
            short var8 = field820;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field674) {
                var6 = field674;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class322.method5581();
                    class322.method5590(arg0, arg1, var10, arg3, -16777216);
                    class322.method5590(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field904) {
            short var11 = field904;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field901) {
                var6 = field901;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class322.method5581();
                    class322.method5590(arg0, arg1, arg2, var13, -16777216);
                    class322.method5590(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field732 = arg3 * var6 / 334;
        if (field907 != arg2 || field908 != arg3) {
            method3335(arg2, arg3);
        }
        field905 = arg0;
        field906 = arg1;
        field907 = arg2;
        field908 = arg3;
    }

    @ObfuscatedName("p.gf(I)V")
    public static void method121() {
        if (Statics.field2392.field983 >> 7 == field877 && Statics.field2392.field940 >> 7 == field878) {
            field877 = 0;
        }
    }

    @ObfuscatedName("ar.gj(I)V")
    public static void method609() {
        int var0 = class90.field1247;
        int[] var1 = class90.field1241;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field759 != var1[var2] && field739 != var1[var2]) {
                method756(field762[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ah.gw(Lba;ZI)V")
    public static void method756(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1141() || arg0.field633) {
            return;
        }
        arg0.field615 = false;
        if ((field844 && class90.field1247 > 50 || class90.field1247 > 200) && arg1 && arg0.field969 == arg0.field945) {
            arg0.field615 = true;
        }
        int var2 = arg0.field983 >> 7;
        int var3 = arg0.field940 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method855(0, 0, 0, false, arg0.field625);
        if (arg0.field631 != null && field656 >= arg0.field634 && field656 < arg0.field613) {
            arg0.field615 = false;
            arg0.field620 = method228(arg0.field983, arg0.field940, Statics.field2055);
            arg0.field944 = field656;
            Statics.field3111.method2903(Statics.field2055, arg0.field983, arg0.field940, arg0.field620, 60, arg0, arg0.field972, var4, arg0.field627, arg0.field628, arg0.field629, arg0.field630);
            return;
        }
        if ((arg0.field983 & 0x7F) == 64 && (arg0.field940 & 0x7F) == 64) {
            if (field702 == field822[var2][var3]) {
                return;
            }
            field822[var2][var3] = field702;
        }
        arg0.field620 = method228(arg0.field983, arg0.field940, Statics.field2055);
        arg0.field944 = field656;
        Statics.field3111.method2902(Statics.field2055, arg0.field983, arg0.field940, arg0.field620, 60, arg0, arg0.field972, var4, arg0.field948);
    }

    @ObfuscatedName("bl.gu(ZI)V")
    public static final void method1035(boolean arg0) {
        for (int var1 = 0; var1 < field880; var1++) {
            class80 var2 = field688[field690[var1]];
            if (var2 != null && var2.method1141() && var2.field1120.field3485 == arg0 && var2.field1120.method4404()) {
                int var3 = var2.field983 >> 7;
                int var4 = var2.field940 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field943 == 1 && (var2.field983 & 0x7F) == 64 && (var2.field940 & 0x7F) == 64) {
                        if (field702 == field822[var3][var4]) {
                            continue;
                        }
                        field822[var3][var4] = field702;
                    }
                    long var5 = class129.method855(0, 0, 1, !var2.field1120.field3483, field690[var1]);
                    var2.field944 = field656;
                    Statics.field3111.method2902(Statics.field2055, var2.field983, var2.field940, method228(var2.field983 + (var2.field943 * 64 - 64), var2.field940 + (var2.field943 * 64 - 64), Statics.field2055), var2.field943 * 64 - 64 + 60, var2, var2.field972, var5, var2.field948);
                }
            }
        }
    }

    @ObfuscatedName("bk.gg(I)V")
    public static final void method1009() {
        for (class78 var0 = (class78) field855.method4543(); var0 != null; var0 = (class78) field855.method4564()) {
            if (Statics.field2055 != var0.field1101 || var0.field1108) {
                var0.method3351();
            } else if (field656 >= var0.field1100) {
                var0.method1881(field708);
                if (var0.field1108) {
                    var0.method3351();
                } else {
                    Statics.field3111.method2902(var0.field1101, var0.field1099, var0.field1104, var0.field1107, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("ca.gr(I)I")
    public static final int method2150() {
        if (Statics.field221.field1049) {
            return Statics.field2055;
        }
        int var0 = 3;
        if (Statics.field61 < 310) {
            int var1;
            int var2;
            if (field721 == 1) {
                var1 = Statics.field938 >> 7;
                var2 = Statics.field1792 >> 7;
            } else {
                var1 = Statics.field2392.field983 >> 7;
                var2 = Statics.field2392.field940 >> 7;
            }
            int var3 = Statics.field3343 >> 7;
            int var4 = Statics.field1000 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field2055;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2055;
            }
            if ((class56.field506[Statics.field2055][var3][var4] & 0x4) != 0) {
                var0 = Statics.field2055;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class56.field506[Statics.field2055][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2055;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class56.field506[Statics.field2055][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2055;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class56.field506[Statics.field2055][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2055;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class56.field506[Statics.field2055][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2055;
                        }
                    }
                }
            }
        }
        if (Statics.field2392.field983 >= 0 && Statics.field2392.field940 >= 0 && Statics.field2392.field983 < 13312 && Statics.field2392.field940 < 13312) {
            if ((class56.field506[Statics.field2055][Statics.field2392.field983 >> 7][Statics.field2392.field940 >> 7] & 0x4) != 0) {
                var0 = Statics.field2055;
            }
            return var0;
        } else {
            return Statics.field2055;
        }
    }

    @ObfuscatedName("bt.gd(I)Z")
    public static boolean method1063() {
        return (field766 & 0x4) != 0;
    }

    @ObfuscatedName("bz.gk(I)Z")
    public static boolean method1649() {
        return (field766 & 0x1) != 0;
    }

    @ObfuscatedName("bj.gh(Lba;I)Z")
    public static boolean method1670(class67 arg0) {
        if (field766 == 0) {
            return false;
        } else if (Statics.field2392 == arg0) {
            return (field766 & 0x8) != 0;
        } else {
            boolean var1 = method1063() || method1649() && arg0.method1138();
            if (!var1) {
                boolean var2 = (field766 & 0x2) != 0;
                var1 = var2 && arg0.method1122();
            }
            return var1;
        }
    }

    @ObfuscatedName("ke.gv(Lbx;IIIIIB)V")
    public static final void method4908(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1141()) {
            return;
        }
        if (arg0 instanceof class80) {
            class258 var6 = ((class80) arg0).field1120;
            if (var6.field3490 != null) {
                var6 = var6.method4391();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1247;
        int[] var8 = class90.field1241;
        byte var9 = 0;
        if (arg1 < var7 && field656 == arg0.field944 && method1670((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                int var11 = arg0.field954 + 15;
                method1057(arg0.field983, arg0.field940, var11);
                class297 var12 = (class297) field670.get(class293.field3655);
                byte var13 = 9;
                var12.method5006(var10.field626.method4829(), field779 + arg2, field886 + arg3 - var13, 16777215, 0);
                var9 = 18;
            }
        }
        int var14 = -2;
        if (!arg0.field965.method4484()) {
            int var15 = arg0.field954 + 15;
            method1057(arg0.field983, arg0.field940, var15);
            for (class79 var16 = (class79) arg0.field965.method4491(); var16 != null; var16 = (class79) arg0.field965.method4490()) {
                class71 var17 = var16.method1893(field656);
                if (var17 != null) {
                    class248 var18 = var16.field1113;
                    class326 var19 = var18.method4159();
                    class326 var20 = var18.method4166();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field3286;
                    } else {
                        if (var18.field3287 * 2 < var20.field3870) {
                            var21 = var18.field3287;
                        }
                        var22 = var20.field3870 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field656 - var17.field1004;
                    int var26 = var17.field1003 * var22 / var18.field3286;
                    int var29;
                    if (var17.field1005 > var25) {
                        int var27 = var18.field3284 == 0 ? 0 : var25 / var18.field3284 * var18.field3284;
                        int var28 = var17.field1001 * var22 / var18.field3286;
                        var29 = (var26 - var28) * var27 / var17.field1005 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1005 + var18.field3283 - var25;
                        if (var18.field3281 >= 0) {
                            var23 = (var30 << 8) / (var18.field3283 - var18.field3281);
                        }
                    }
                    if (var17.field1003 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var14 += 5;
                        if (field779 > -1) {
                            int var36 = field779 + arg2 - (var22 >> 1);
                            int var37 = field886 + arg3 - var14;
                            class322.method5590(var36, var37, var29, 5, 65280);
                            class322.method5590(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var14 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field3872;
                        var14 += var32;
                        int var33 = field779 + arg2 - (var22 >> 1);
                        int var34 = field886 + arg3 - var14;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method5696(var35, var34, var23);
                            class322.method5583(var35, var34, var31 + var35, var32 + var34);
                            var20.method5696(var35, var34, var23);
                        } else {
                            var19.method5785(var35, var34);
                            class322.method5583(var35, var34, var31 + var35, var32 + var34);
                            var20.method5785(var35, var34);
                        }
                        class322.method5582(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var14 += 2;
                    }
                } else if (var16.method1894()) {
                    var16.method3351();
                }
            }
        }
        if (var14 == -2) {
            var14 += 7;
        }
        int var38 = var9 + var14;
        if (arg1 < var7) {
            class67 var39 = (class67) arg0;
            if (var39.field633) {
                return;
            }
            if (var39.field632 != -1 || var39.field635 != -1) {
                int var40 = arg0.field954 + 15;
                method1057(arg0.field983, arg0.field940, var40);
                if (field779 > -1) {
                    if (var39.field632 != -1) {
                        var38 += 25;
                        Statics.field3599[var39.field632].method5785(field779 + arg2 - 12, field886 + arg3 - var38);
                    }
                    if (var39.field635 != -1) {
                        var38 += 25;
                        Statics.field354[var39.field635].method5785(field779 + arg2 - 12, field886 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field664 == 10 && field666 == var8[arg1]) {
                int var41 = arg0.field954 + 15;
                method1057(arg0.field983, arg0.field940, var41);
                if (field779 > -1) {
                    int var42 = Statics.field533[1].field3872 + var38;
                    Statics.field533[1].method5785(field779 + arg2 - 12, field886 + arg3 - var42);
                }
            }
        } else {
            class258 var43 = ((class80) arg0).field1120;
            if (var43.field3490 != null) {
                var43 = var43.method4391();
            }
            if (var43.field3466 >= 0 && var43.field3466 < Statics.field354.length) {
                int var44 = arg0.field954 + 15;
                method1057(arg0.field983, arg0.field940, var44);
                if (field779 > -1) {
                    Statics.field354[var43.field3466].method5785(field779 + arg2 - 12, field886 + arg3 - 30);
                }
            }
            if (field664 == 1 && field687 == field690[arg1 - var7] && field656 % 20 < 10) {
                int var45 = arg0.field954 + 15;
                method1057(arg0.field983, arg0.field940, var45);
                if (field779 > -1) {
                    Statics.field533[0].method5785(field779 + arg2 - 12, field886 + arg3 - 28);
                }
            }
        }
        if (arg0.field953 != null && (arg1 >= var7 || !arg0.field955 && (field863 == 4 || !arg0.field941 && (field863 == 0 || field863 == 3 || field863 == 1 && ((class67) arg0).method1138())))) {
            int var46 = arg0.field954;
            method1057(arg0.field983, arg0.field940, var46);
            if (field779 > -1 && field856 < field788) {
                field738[field856] = Statics.field1.method4977(arg0.field953) / 2;
                field723[field856] = Statics.field1.field3680;
                field699[field856] = field779;
                field736[field856] = field886;
                field859[field856] = arg0.field949;
                field740[field856] = arg0.field942;
                field741[field856] = arg0.field956;
                field742[field856] = arg0.field953;
                field856++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field950[var47];
            int var49 = arg0.field939[var47];
            class254 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field656) {
                    continue;
                }
                int var52 = arg0.field939[var47];
                class254 var53 = (class254) class254.field3337.method3100((long) var52);
                class254 var54;
                if (var53 == null) {
                    byte[] var55 = Statics.field426.method3845(32, var52);
                    class254 var56 = new class254();
                    if (var55 != null) {
                        var56.method4246(new class301(var55));
                    }
                    class254.field3337.method3102(var56, (long) var52);
                    var54 = var56;
                } else {
                    var54 = var53;
                }
                var50 = var54;
                var51 = var54.field3329;
                if (var54 != null && var54.field3334 != null) {
                    var50 = var54.method4271();
                    if (var50 == null) {
                        arg0.field950[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var57 = arg0.field963[var47];
            class254 var58 = null;
            if (var57 >= 0) {
                class254 var59 = (class254) class254.field3337.method3100((long) var57);
                class254 var60;
                if (var59 == null) {
                    byte[] var61 = Statics.field426.method3845(32, var57);
                    class254 var62 = new class254();
                    if (var61 != null) {
                        var62.method4246(new class301(var61));
                    }
                    class254.field3337.method3102(var62, (long) var57);
                    var60 = var62;
                } else {
                    var60 = var59;
                }
                var58 = var60;
                if (var60 != null && var60.field3334 != null) {
                    var58 = var60.method4271();
                }
            }
            if (var48 - var51 <= field656) {
                if (var50 == null) {
                    arg0.field950[var47] = -1;
                } else {
                    int var63 = arg0.field954 / 2;
                    method1057(arg0.field983, arg0.field940, var63);
                    if (field779 > -1) {
                        if (var47 == 1) {
                            field886 -= 20;
                        }
                        if (var47 == 2) {
                            field779 -= 15;
                            field886 -= 10;
                        }
                        if (var47 == 3) {
                            field779 += 15;
                            field886 -= 10;
                        }
                        Object var64 = null;
                        Object var65 = null;
                        Object var66 = null;
                        Object var67 = null;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        class326 var76 = null;
                        class326 var77 = null;
                        class326 var78 = null;
                        class326 var79 = null;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        int var86 = 0;
                        int var87 = 0;
                        int var88 = 0;
                        class326 var89 = var50.method4250();
                        if (var89 != null) {
                            var68 = var89.field3870;
                            int var90 = var89.field3872;
                            if (var90 > var88) {
                                var88 = var90;
                            }
                            var72 = var89.field3871;
                        }
                        class326 var91 = var50.method4251();
                        if (var91 != null) {
                            var69 = var91.field3870;
                            int var92 = var91.field3872;
                            if (var92 > var88) {
                                var88 = var92;
                            }
                            var73 = var91.field3871;
                        }
                        class326 var93 = var50.method4252();
                        if (var93 != null) {
                            var70 = var93.field3870;
                            int var94 = var93.field3872;
                            if (var94 > var88) {
                                var88 = var94;
                            }
                            var74 = var93.field3871;
                        }
                        class326 var95 = var50.method4253();
                        if (var95 != null) {
                            var71 = var95.field3870;
                            int var96 = var95.field3872;
                            if (var96 > var88) {
                                var88 = var96;
                            }
                            var75 = var95.field3871;
                        }
                        if (var58 != null) {
                            var76 = var58.method4250();
                            if (var76 != null) {
                                var80 = var76.field3870;
                                int var97 = var76.field3872;
                                if (var97 > var88) {
                                    var88 = var97;
                                }
                                var84 = var76.field3871;
                            }
                            var77 = var58.method4251();
                            if (var77 != null) {
                                var81 = var77.field3870;
                                int var98 = var77.field3872;
                                if (var98 > var88) {
                                    var88 = var98;
                                }
                                var85 = var77.field3871;
                            }
                            var78 = var58.method4252();
                            if (var78 != null) {
                                var82 = var78.field3870;
                                int var99 = var78.field3872;
                                if (var99 > var88) {
                                    var88 = var99;
                                }
                                var86 = var78.field3871;
                            }
                            var79 = var58.method4253();
                            if (var79 != null) {
                                var83 = var79.field3870;
                                int var100 = var79.field3872;
                                if (var100 > var88) {
                                    var88 = var100;
                                }
                                var87 = var79.field3871;
                            }
                        }
                        class296 var101 = var50.method4254();
                        if (var101 == null) {
                            var101 = Statics.field110;
                        }
                        class296 var102;
                        if (var58 == null) {
                            var102 = Statics.field110;
                        } else {
                            var102 = var58.method4254();
                            if (var102 == null) {
                                var102 = Statics.field110;
                            }
                        }
                        Object var103 = null;
                        String var104 = null;
                        boolean var105 = false;
                        int var106 = 0;
                        String var107 = var50.method4267(arg0.field961[var47]);
                        int var108 = var101.method4977(var107);
                        if (var58 != null) {
                            var104 = var58.method4267(arg0.field964[var47]);
                            var106 = var102.method4977(var104);
                        }
                        int var109 = 0;
                        int var110 = 0;
                        if (var69 > 0) {
                            if (var93 == null && var95 == null) {
                                var109 = 1;
                            } else {
                                var109 = var108 / var69 + 1;
                            }
                        }
                        if (var58 != null && var81 > 0) {
                            if (var78 == null && var79 == null) {
                                var110 = 1;
                            } else {
                                var110 = var106 / var81 + 1;
                            }
                        }
                        int var111 = 0;
                        int var112 = var111;
                        if (var68 > 0) {
                            var111 += var68;
                        }
                        var111 += 2;
                        int var113 = var111;
                        if (var70 > 0) {
                            var111 += var70;
                        }
                        int var114 = var111;
                        int var115 = var111;
                        int var117;
                        if (var69 > 0) {
                            int var116 = var69 * var109;
                            var117 = var111 + var116;
                            var115 = (var116 - var108) / 2 + var111;
                        } else {
                            var117 = var108 + var111;
                        }
                        int var118 = var117;
                        if (var71 > 0) {
                            var117 += var71;
                        }
                        int var119 = 0;
                        int var120 = 0;
                        int var121 = 0;
                        int var122 = 0;
                        int var123 = 0;
                        if (var58 != null) {
                            var117 += 2;
                            var119 = var117;
                            if (var80 > 0) {
                                var117 += var80;
                            }
                            var117 += 2;
                            var120 = var117;
                            if (var82 > 0) {
                                var117 += var82;
                            }
                            var121 = var117;
                            var123 = var117;
                            if (var81 > 0) {
                                int var124 = var81 * var110;
                                var117 += var124;
                                var123 += (var124 - var106) / 2;
                            } else {
                                var117 += var106;
                            }
                            var122 = var117;
                            if (var83 > 0) {
                                var117 += var83;
                            }
                        }
                        int var125 = arg0.field950[var47] - field656;
                        int var126 = var50.field3324 - var50.field3324 * var125 / var50.field3329;
                        int var127 = var50.field3335 * var125 / var50.field3329 + -var50.field3335;
                        int var128 = field779 + arg2 - (var117 >> 1) + var126;
                        int var129 = field886 + arg3 - 12 + var127;
                        int var130 = var129;
                        int var131 = var88 + var129;
                        int var132 = var50.field3339 + var129 + 15;
                        int var133 = var132 - var101.field3678;
                        int var134 = var101.field3685 + var132;
                        if (var133 < var129) {
                            var130 = var133;
                        }
                        if (var134 > var131) {
                            var131 = var134;
                        }
                        int var135 = 0;
                        if (var58 != null) {
                            var135 = var58.field3339 + var129 + 15;
                            int var136 = var135 - var102.field3678;
                            int var137 = var102.field3685 + var135;
                            if (var136 < var130) {
                                ;
                            }
                            if (var137 > var131) {
                                ;
                            }
                        }
                        int var140 = 255;
                        if (var50.field3336 >= 0) {
                            var140 = (var125 << 8) / (var50.field3329 - var50.field3336);
                        }
                        if (var140 >= 0 && var140 < 255) {
                            if (var89 != null) {
                                var89.method5696(var112 + var128 - var72, var129, var140);
                            }
                            if (var93 != null) {
                                var93.method5696(var113 + var128 - var74, var129, var140);
                            }
                            if (var91 != null) {
                                for (int var141 = 0; var141 < var109; var141++) {
                                    var91.method5696(var69 * var141 + (var114 + var128 - var73), var129, var140);
                                }
                            }
                            if (var95 != null) {
                                var95.method5696(var118 + var128 - var75, var129, var140);
                            }
                            var101.method4983(var107, var115 + var128, var132, var50.field3328, 0, var140);
                            if (var58 != null) {
                                if (var76 != null) {
                                    var76.method5696(var119 + var128 - var84, var129, var140);
                                }
                                if (var78 != null) {
                                    var78.method5696(var120 + var128 - var86, var129, var140);
                                }
                                if (var77 != null) {
                                    for (int var142 = 0; var142 < var110; var142++) {
                                        var77.method5696(var81 * var142 + (var121 + var128 - var85), var129, var140);
                                    }
                                }
                                if (var79 != null) {
                                    var79.method5696(var122 + var128 - var87, var129, var140);
                                }
                                var102.method4983(var104, var123 + var128, var135, var58.field3328, 0, var140);
                            }
                        } else {
                            if (var89 != null) {
                                var89.method5785(var112 + var128 - var72, var129);
                            }
                            if (var93 != null) {
                                var93.method5785(var113 + var128 - var74, var129);
                            }
                            if (var91 != null) {
                                for (int var143 = 0; var143 < var109; var143++) {
                                    var91.method5785(var69 * var143 + (var114 + var128 - var73), var129);
                                }
                            }
                            if (var95 != null) {
                                var95.method5785(var118 + var128 - var75, var129);
                            }
                            var101.method5026(var107, var115 + var128, var132, var50.field3328 | 0xFF000000, 0);
                            if (var58 != null) {
                                if (var76 != null) {
                                    var76.method5785(var119 + var128 - var84, var129);
                                }
                                if (var78 != null) {
                                    var78.method5785(var120 + var128 - var86, var129);
                                }
                                if (var77 != null) {
                                    for (int var144 = 0; var144 < var110; var144++) {
                                        var77.method5785(var81 * var144 + (var121 + var128 - var85), var129);
                                    }
                                }
                                if (var79 != null) {
                                    var79.method5785(var122 + var128 - var87, var129);
                                }
                                var102.method5026(var104, var123 + var128, var135, var58.field3328 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ht.gc(IIIII)V")
    public static final void method3641(int arg0, int arg1, int arg2, int arg3) {
        field856 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1247;
        int[] var8 = class90.field1241;
        for (int var9 = 0; var9 < field880 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = field762[var8[var9]];
                if (field759 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field2392 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field688[field690[var9 - var7]];
            }
            method4908(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field765 && var6 != -1) {
            method4908(Statics.field2392, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method4908(field762[field759], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field856; var11++) {
            int var12 = field699[var11];
            int var13 = field736[var11];
            int var14 = field738[var11];
            int var15 = field723[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field736[var17] - field723[var17] && var13 - var15 < field736[var17] + 2 && var12 - var14 < field738[var17] + field699[var17] && var12 + var14 > field699[var17] - field738[var17] && field736[var17] - field723[var17] < var13) {
                        var13 = field736[var17] - field723[var17];
                        var16 = true;
                    }
                }
            }
            field779 = field699[var11];
            field886 = field736[var11] = var13;
            String var18 = field742[var11];
            if (field811 == 0) {
                int var19 = 16776960;
                if (field859[var11] < 6) {
                    var19 = field862[field859[var11]];
                }
                if (field859[var11] == 6) {
                    var19 = field702 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field859[var11] == 7) {
                    var19 = field702 % 20 < 10 ? 255 : 65535;
                }
                if (field859[var11] == 8) {
                    var19 = field702 % 20 < 10 ? 45056 : 8454016;
                }
                if (field859[var11] == 9) {
                    int var20 = 150 - field741[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field859[var11] == 10) {
                    int var21 = 150 - field741[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field859[var11] == 11) {
                    int var22 = 150 - field741[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field740[var11] == 0) {
                    Statics.field1.method5006(var18, field779 + arg0, field886 + arg1, var19, 0);
                }
                if (field740[var11] == 1) {
                    Statics.field1.method4987(var18, field779 + arg0, field886 + arg1, var19, 0, field702);
                }
                if (field740[var11] == 2) {
                    Statics.field1.method5000(var18, field779 + arg0, field886 + arg1, var19, 0, field702);
                }
                if (field740[var11] == 3) {
                    Statics.field1.method5056(var18, field779 + arg0, field886 + arg1, var19, 0, field702, 150 - field741[var11]);
                }
                if (field740[var11] == 4) {
                    int var23 = (150 - field741[var11]) * (Statics.field1.method4977(var18) + 100) / 150;
                    class322.method5583(field779 + arg0 - 50, arg1, field779 + arg0 + 50, arg1 + arg3);
                    Statics.field1.method5026(var18, field779 + arg0 + 50 - var23, field886 + arg1, var19, 0);
                    class322.method5582(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field740[var11] == 5) {
                    int var24 = 150 - field741[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class322.method5583(arg0, field886 + arg1 - Statics.field1.field3680 - 1, arg0 + arg2, field886 + arg1 + 5);
                    Statics.field1.method5006(var18, field779 + arg0, field886 + arg1 + var25, var19, 0);
                    class322.method5582(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1.method5006(var18, field779 + arg0, field886 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("dk.gz(I)V")
    public static final void method2571() {
        field760 = 0;
        int var0 = (Statics.field2392.field983 >> 7) + Statics.field1262;
        int var1 = (Statics.field2392.field940 >> 7) + Statics.field2367;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field760 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field760 = 1;
        }
        if (field760 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field760 = 0;
        }
    }

    @ObfuscatedName("fk.ht(IIIII)V")
    public static final void method3341(int arg0, int arg1, int arg2, int arg3) {
        method2571();
    }

    @ObfuscatedName("bt.hc(IIIB)V")
    public static final void method1057(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field779 = -1;
            field886 = -1;
            return;
        }
        int var3 = method228(arg0, arg1, Statics.field2055) - arg2;
        int var4 = arg0 - Statics.field3343;
        int var5 = var3 - Statics.field438;
        int var6 = arg1 - Statics.field1000;
        int var7 = class131.field1780[Statics.field61];
        int var8 = class131.field1781[Statics.field61];
        int var9 = class131.field1780[Statics.field1057];
        int var10 = class131.field1781[Statics.field1057];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field779 = field732 * var11 / var15 + field907 / 2;
            field886 = field732 * var14 / var15 + field908 / 2;
        } else {
            field779 = -1;
            field886 = -1;
        }
    }

    @ObfuscatedName("f.hi(IIIB)I")
    public static final int method228(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field506[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field516[var5][var3][var4] + class56.field516[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field516[var5][var3][var4 + 1] + class56.field516[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ai.hf(IIB)I")
    public static int method717(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field900 - field899) * var2 / 100 + field899;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("az.hb(ZLks;I)V")
    public static final void method375(boolean arg0, class300 arg1) {
        field714 = arg0;
        if (!field714) {
            int var2 = arg1.method5293();
            int var3 = arg1.method5124();
            int var4 = arg1.method5124();
            Statics.field2038 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2038[var5][var6] = arg1.method5134();
                }
            }
            Statics.field3612 = new int[var4];
            Statics.field269 = new int[var4];
            Statics.field610 = new int[var4];
            Statics.field522 = new byte[var4][];
            Statics.field3080 = new byte[var4][];
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
                        Statics.field3612[var8] = var11;
                        Statics.field269[var8] = Statics.field2071.method3854("m" + var9 + "_" + var10);
                        Statics.field610[var8] = Statics.field2071.method3854("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2106(var3, var2, true);
            return;
        }
        int var12 = arg1.method5167();
        boolean var13 = arg1.method5158() == 1;
        int var14 = arg1.method5315();
        int var15 = arg1.method5124();
        arg1.method5079();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5080(1);
                    if (var19 == 1) {
                        field706[var16][var17][var18] = arg1.method5080(26);
                    } else {
                        field706[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5083();
        Statics.field2038 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2038[var20][var21] = arg1.method5134();
            }
        }
        Statics.field3612 = new int[var15];
        Statics.field269 = new int[var15];
        Statics.field610 = new int[var15];
        Statics.field522 = new byte[var15][];
        Statics.field3080 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field706[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3612[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3612[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field269[var22] = Statics.field2071.method3854("m" + var31 + "_" + var32);
                            Statics.field610[var22] = Statics.field2071.method3854("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2106(var12, var14, !var13);
    }

    @ObfuscatedName("cq.hj(IIZI)V")
    public static final void method2106(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field531 == arg0 && Statics.field2360 == arg1) {
            return;
        }
        Statics.field531 = arg0;
        Statics.field2360 = arg1;
        method1969(25);
        method3426(class225.field2778, true);
        int var3 = Statics.field1262;
        int var4 = Statics.field2367;
        Statics.field1262 = (arg0 - 6) * 8;
        Statics.field2367 = (arg1 - 6) * 8;
        int var5 = Statics.field1262 - var3;
        int var6 = Statics.field2367 - var4;
        int var7 = Statics.field1262;
        int var8 = Statics.field2367;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field688[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field978[var11] -= var5;
                    var10.field996[var11] -= var6;
                }
                var10.field983 -= var5 * 128;
                var10.field940 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field762[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field978[var14] -= var5;
                    var13.field996[var14] -= var6;
                }
                var13.field983 -= var5 * 128;
                var13.field940 -= var6 * 128;
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
                        field799[var25][var21][var22] = field799[var25][var23][var24];
                    } else {
                        field799[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field775.method4543(); var26 != null; var26 = (class69) field775.method4564()) {
            var26.field927 -= var5;
            var26.field928 -= var6;
            if (var26.field927 < 0 || var26.field928 < 0 || var26.field927 >= 104 || var26.field928 >= 104) {
                var26.method3351();
            }
        }
        if (field877 != 0) {
            field877 -= var5;
            field878 -= var6;
        }
        field845 = 0;
        field671 = false;
        Statics.field3343 -= var5 << 7;
        Statics.field1000 -= var6 << 7;
        Statics.field938 -= var5 << 7;
        Statics.field1792 -= var6 << 7;
        field705 = -1;
        field855.method4557();
        field686.method4557();
        for (int var27 = 0; var27 < 4; var27++) {
            field704[var27].method3299();
        }
    }

    @ObfuscatedName("ez.hp(ZI)V")
    public static final void method3143(boolean arg0) {
        method3199();
        field693.field1304++;
        if (field693.field1304 < 50 && !arg0) {
            return;
        }
        field693.field1304 = 0;
        if (field801 || field693.method2113() == null) {
            return;
        }
        class188 var1 = class188.method2887(class184.field2248, field693.field1298);
        field693.method2109(var1);
        try {
            field693.method2108();
        } catch (IOException var3) {
            field801 = true;
        }
    }

    @ObfuscatedName("fk.hl(IIIIIB)V")
    public static final void method3340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3111.method2935(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3111.method2921(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class129.method703(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field194.field3875;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class129.method65(var5);
            class255 var14 = class255.method3070(var13);
            if (var14.field3359 == -1) {
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
                class325 var15 = Statics.field1747[var14.field3359];
                if (var15 != null) {
                    int var16 = (var14.field3360 * 4 - var15.field3863) / 2;
                    int var17 = (var14.field3361 * 4 - var15.field3864) / 2;
                    var15.method5663(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3361) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3111.method2985(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3111.method2921(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class129.method65(var18);
            class255 var24 = class255.method3070(var23);
            if (var24.field3359 != -1) {
                class325 var25 = Statics.field1747[var24.field3359];
                if (var25 != null) {
                    int var26 = (var24.field3360 * 4 - var25.field3863) / 2;
                    int var27 = (var24.field3361 * 4 - var25.field3864) / 2;
                    var25.method5663(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3361) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class129.method703(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field194.field3875;
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
        long var31 = Statics.field3111.method3056(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class129.method65(var31);
        class255 var34 = class255.method3070(var33);
        if (var34.field3359 == -1) {
            return;
        }
        class325 var35 = Statics.field1747[var34.field3359];
        if (var35 != null) {
            int var36 = (var34.field3360 * 4 - var35.field3863) / 2;
            int var37 = (var34.field3361 * 4 - var35.field3864) / 2;
            var35.method5663(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3361) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hs(Lci;I)Z")
    public final boolean method1202(class96 arg0) {
        class306 var2 = arg0.method2113();
        class300 var3 = arg0.field1299;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1303 == null) {
                if (arg0.field1302) {
                    if (!var2.method3288(1)) {
                        return false;
                    }
                    var2.method3284(arg0.field1299.field3708, 0, 1);
                    arg0.field1300 = 0;
                    arg0.field1302 = false;
                }
                var3.field3707 = 0;
                if (var3.method5092()) {
                    if (!var2.method3288(1)) {
                        return false;
                    }
                    var2.method3284(arg0.field1299.field3708, 1, 1);
                    arg0.field1300 = 0;
                }
                arg0.field1302 = true;
                class183[] var4 = class183.method3069();
                int var5 = var3.method5077();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3707);
                }
                arg0.field1303 = var4[var5];
                arg0.field1301 = arg0.field1303.field2203;
            }
            if (arg0.field1301 == -1) {
                if (!var2.method3288(1)) {
                    return false;
                }
                arg0.method2113().method3284(var3.field3708, 0, 1);
                arg0.field1301 = var3.field3708[0] & 0xFF;
            }
            if (arg0.field1301 == -2) {
                if (!var2.method3288(2)) {
                    return false;
                }
                arg0.method2113().method3284(var3.field3708, 0, 2);
                var3.field3707 = 0;
                arg0.field1301 = var3.method5124();
            }
            if (!var2.method3288(arg0.field1301)) {
                return false;
            }
            var3.field3707 = 0;
            var2.method3284(var3.field3708, 0, arg0.field1301);
            arg0.field1300 = 0;
            field697.method4642();
            arg0.field1308 = arg0.field1306;
            arg0.field1306 = arg0.field1310;
            arg0.field1310 = arg0.field1303;
            if (class183.field2117 == arg0.field1303) {
                method375(false, arg0.field1299);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1303) {
                method504();
                arg0.field1303 = null;
                return false;
            }
            if (class183.field2201 == arg0.field1303) {
                String var6 = var3.method5138();
                String var7 = class297.method4981(class292.method611(class211.method3071(var3)));
                class92.method1681(6, var6, var7);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1303) {
                method57(class186.field2323);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2182 == arg0.field1303) {
                for (int var8 = 0; var8 < field762.length; var8++) {
                    if (field762[var8] != null) {
                        field762[var8].field995 = -1;
                    }
                }
                for (int var9 = 0; var9 < field688.length; var9++) {
                    if (field688[var9] != null) {
                        field688[var9].field995 = -1;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2186 == arg0.field1303) {
                Statics.field415.field1059.method4726(var3, arg0.field1301);
                method2151();
                field840 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1303) {
                field863 = var3.method5129();
                field891 = var3.method5159();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2181 == arg0.field1303) {
                int var10 = var3.method5129();
                if (var3.method5129() == 0) {
                    field914[var10] = new class10();
                    var3.field3707 += 18;
                } else {
                    var3.field3707--;
                    field914[var10] = new class10(var3, false);
                }
                field842 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1303) {
                int var11 = var3.method5134();
                if (field728 != var11) {
                    field728 = var11;
                    method538();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1303) {
                int var12 = var3.method5124();
                if (var12 == 65535) {
                    var12 = -1;
                }
                method5418(var12);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2199 == arg0.field1303) {
                int var13 = var3.method5315();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = var3.method5173();
                method721(var13, var14);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1303) {
                int var15 = var3.method5129();
                int var16 = var3.method5129();
                int var17 = var3.method5129();
                int var18 = var3.method5129();
                field776[var15] = true;
                field893[var15] = var16;
                field700[var15] = var17;
                field895[var15] = var18;
                field896[var15] = 0;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1303) {
                int var19 = var3.method5167();
                int var20 = var3.method5218();
                class213.field2535[var19] = var20;
                if (class213.field2534[var19] != var20) {
                    class213.field2534[var19] = var20;
                }
                method3360(var19);
                field833[++field834 - 1 & 0x1F] = var19;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2151 == arg0.field1303) {
                int var21 = var3.method5134();
                int var22 = var3.method5124();
                if (var21 < -70000) {
                    var22 += 32768;
                }
                class218 var23;
                if (var21 >= 0) {
                    var23 = class218.method3666(var21);
                } else {
                    var23 = null;
                }
                while (var3.field3707 < arg0.field1301) {
                    int var24 = var3.method5143();
                    int var25 = var3.method5124();
                    int var26 = 0;
                    if (var25 != 0) {
                        var26 = var3.method5129();
                        if (var26 == 255) {
                            var26 = var3.method5134();
                        }
                    }
                    if (var23 != null && var24 >= 0 && var24 < var23.field2585.length) {
                        var23.field2585[var24] = var25;
                        var23.field2662[var24] = var26;
                    }
                    class60.method3718(var22, var24, var25 - 1, var26);
                }
                if (var23 != null) {
                    method4409(var23);
                }
                method5451();
                field835[++field836 - 1 & 0x1F] = var22 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1303) {
                int var27 = var3.method5134();
                boolean var28 = var3.method5129() == 1;
                class218 var29 = class218.method3666(var27);
                if (var29.field2679 != var28) {
                    var29.field2679 = var28;
                    method4409(var29);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1303) {
                int var30 = var3.method5179();
                class218 var31 = class218.method3666(var30);
                for (int var32 = 0; var32 < var31.field2585.length; var32++) {
                    var31.field2585[var32] = -1;
                    var31.field2585[var32] = 0;
                }
                method4409(var31);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1303) {
                method700(false, var3);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1303) {
                if (Statics.field568 != null) {
                    Statics.field568.method4859(var3);
                }
                method1997();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1303) {
                int var33 = var3.method5178();
                class218 var34 = class218.method3666(var33);
                var34.field2616 = 3;
                var34.field2617 = Statics.field2392.field612.method3696();
                method4409(var34);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2184 == arg0.field1303) {
                Statics.field3664 = var3.method5129();
                Statics.field532 = var3.method5158();
                for (int var35 = Statics.field532; var35 < Statics.field532 + 8; var35++) {
                    for (int var36 = Statics.field3664; var36 < Statics.field3664 + 8; var36++) {
                        if (field799[Statics.field2055][var35][var36] != null) {
                            field799[Statics.field2055][var35][var36] = null;
                            method656(var35, var36);
                        }
                    }
                }
                for (class69 var37 = (class69) field775.method4543(); var37 != null; var37 = (class69) field775.method4564()) {
                    if (var37.field927 >= Statics.field532 && var37.field927 < Statics.field532 + 8 && var37.field928 >= Statics.field3664 && var37.field928 < Statics.field3664 + 8 && Statics.field2055 == var37.field933) {
                        var37.field930 = 0;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1303) {
                method1045(var3.method5138());
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1303) {
                int var38 = var3.method5293();
                field806 = var38;
                this.method1360(false);
                method754(var38);
                class77.method176(field806);
                for (int var39 = 0; var39 < 100; var39++) {
                    field852[var39] = true;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1303) {
                for (int var40 = 0; var40 < Statics.field3205; var40++) {
                    class242 var41 = class242.method2078(var40);
                    if (var41 != null) {
                        class213.field2535[var40] = 0;
                        class213.field2534[var40] = 0;
                    }
                }
                method5451();
                field834 += 32;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1303) {
                method57(class186.field2320);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1303) {
                method57(class186.field2328);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1303) {
                byte var42 = var3.method5162();
                int var43 = var3.method5293();
                class213.field2535[var43] = var42;
                if (class213.field2534[var43] != var42) {
                    class213.field2534[var43] = var42;
                }
                method3360(var43);
                field833[++field834 - 1 & 0x1F] = var43;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2193 == arg0.field1303) {
                field671 = false;
                for (int var44 = 0; var44 < 5; var44++) {
                    field776[var44] = false;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1303) {
                String var45 = var3.method5138();
                Object[] var46 = new Object[var45.length() + 1];
                for (int var47 = var45.length() - 1; var47 >= 0; var47--) {
                    if (var45.charAt(var47) == 's') {
                        var46[var47 + 1] = var3.method5138();
                    } else {
                        var46[var47 + 1] = Integer.valueOf(var3.method5134());
                    }
                }
                var46[0] = Integer.valueOf(var3.method5134());
                class63 var48 = new class63();
                var48.field585 = var46;
                class77.method46(var48);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1303) {
                int var49 = var3.method5124();
                int var50 = var3.method5293();
                int var51 = var3.method5218();
                class218 var52 = class218.method3666(var51);
                var52.field2697 = (var50 << 16) + var49;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1303) {
                int var53 = var3.method5163();
                int var54 = var3.method5275();
                int var55 = var3.method5134();
                class218 var56 = class218.method3666(var55);
                if (var56.field2582 != var53 || var56.field2715 != var54 || var56.field2578 != 0 || var56.field2579 != 0) {
                    var56.field2582 = var53;
                    var56.field2715 = var54;
                    var56.field2578 = 0;
                    var56.field2579 = 0;
                    method4409(var56);
                    this.method1407(var56);
                    if (var56.field2575 == 0) {
                        method267(Statics.field248[var55 >> 16], var56, false);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2122 == arg0.field1303) {
                int var57 = var3.method5178();
                int var58 = var3.method5218();
                int var59 = var3.method5315();
                if (var59 == 65535) {
                    var59 = -1;
                }
                int var60 = var3.method5293();
                if (var60 == 65535) {
                    var60 = -1;
                }
                for (int var61 = var59; var61 <= var60; var61++) {
                    long var62 = ((long) var58 << 32) + (long) var61;
                    class181 var64 = field849.method5527(var62);
                    if (var64 != null) {
                        var64.method3351();
                    }
                    field849.method5535(new class180(var57), var62);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1303) {
                method700(true, var3);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1303) {
                int var65 = var3.method5134();
                int var66 = var3.method5124();
                if (var65 < -70000) {
                    var66 += 32768;
                }
                class218 var67;
                if (var65 >= 0) {
                    var67 = class218.method3666(var65);
                } else {
                    var67 = null;
                }
                if (var67 != null) {
                    for (int var68 = 0; var68 < var67.field2585.length; var68++) {
                        var67.field2585[var68] = 0;
                        var67.field2662[var68] = 0;
                    }
                }
                class60.method263(var66);
                int var69 = var3.method5124();
                for (int var70 = 0; var70 < var69; var70++) {
                    int var71 = var3.method5293();
                    int var72 = var3.method5129();
                    if (var72 == 255) {
                        var72 = var3.method5134();
                    }
                    if (var67 != null && var70 < var67.field2585.length) {
                        var67.field2585[var70] = var71;
                        var67.field2662[var70] = var72;
                    }
                    class60.method3718(var66, var70, var71 - 1, var72);
                }
                if (var67 != null) {
                    method4409(var67);
                }
                method5451();
                field835[++field836 - 1 & 0x1F] = var66 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1303) {
                method57(class186.field2316);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1303) {
                method57(class186.field2317);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1303) {
                int var73 = var3.method5293();
                int var74 = var3.method5134();
                int var75 = var73 >> 10 & 0x1F;
                int var76 = var73 >> 5 & 0x1F;
                int var77 = var73 & 0x1F;
                int var78 = (var77 << 3) + (var75 << 19) + (var76 << 11);
                class218 var79 = class218.method3666(var74);
                if (var79.field2601 != var78) {
                    var79.field2601 = var78;
                    method4409(var79);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1303) {
                if (field806 != -1) {
                    method3819(field806, 0);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1303) {
                Statics.field532 = var3.method5324();
                Statics.field3664 = var3.method5158();
                while (var3.field3707 < arg0.field1301) {
                    int var80 = var3.method5129();
                    class186 var81 = class186.method1926()[var80];
                    method57(var81);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1303) {
                field671 = true;
                Statics.field2347 = var3.method5129();
                Statics.field140 = var3.method5129();
                Statics.field2550 = var3.method5124();
                Statics.field241 = var3.method5129();
                Statics.field436 = var3.method5129();
                if (Statics.field436 >= 100) {
                    int var82 = Statics.field2347 * 128 + 64;
                    int var83 = Statics.field140 * 128 + 64;
                    int var84 = method228(var82, var83, Statics.field2055) - Statics.field2550;
                    int var85 = var82 - Statics.field3343;
                    int var86 = var84 - Statics.field438;
                    int var87 = var83 - Statics.field1000;
                    int var88 = (int) Math.sqrt((double) (var85 * var85 + var87 * var87));
                    Statics.field61 = (int) (Math.atan2((double) var86, (double) var88) * 325.949D) & 0x7FF;
                    Statics.field1057 = (int) (Math.atan2((double) var85, (double) var87) * -325.949D) & 0x7FF;
                    if (Statics.field61 < 128) {
                        Statics.field61 = 128;
                    }
                    if (Statics.field61 > 383) {
                        Statics.field61 = 383;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2200 == arg0.field1303) {
                method5451();
                int var89 = var3.method5179();
                int var90 = var3.method5129();
                int var91 = var3.method5158();
                field780[var90] = var89;
                field778[var90] = var91;
                field800[var90] = 1;
                for (int var92 = 0; var92 < 98; var92++) {
                    if (var89 >= class222.field2755[var92]) {
                        field800[var90] = var92 + 2;
                    }
                }
                field837[++field647 - 1 & 0x1F] = var90;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1303) {
                class97.method145(var3, arg0.field1301);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1303) {
                if (arg0.field1301 == 0) {
                    Statics.field568 = null;
                } else {
                    if (Statics.field568 == null) {
                        Statics.field568 = new class286(Statics.field2390, Statics.field3618);
                    }
                    Statics.field568.method4863(var3);
                }
                method1997();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1303) {
                int var93 = var3.method5315();
                Statics.method3725(var93);
                field835[++field836 - 1 & 0x1F] = var93 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1303) {
                int var94 = var3.method5134();
                int var95 = var3.method5134();
                int var96 = class54.method74();
                class188 var97 = class188.method2887(class184.field2215, field693.field1298);
                var97.field2335.method5155(field451);
                var97.field2335.method5272(var96);
                var97.field2335.method5177(var94);
                var97.field2335.method5306(var95);
                field693.method2109(var97);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2129 == arg0.field1303) {
                int var98 = var3.method5167();
                int var99 = var3.method5218();
                class218 var100 = class218.method3666(var99);
                if (var100 != null && var100.field2575 == 0) {
                    if (var98 > var100.field2597 - var100.field2589) {
                        var98 = var100.field2597 - var100.field2589;
                    }
                    if (var98 < 0) {
                        var98 = 0;
                    }
                    if (var100.field2622 != var98) {
                        var100.field2622 = var98;
                        method4409(var100);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1303) {
                int var101 = var3.method5163();
                int var102 = var3.method5134();
                class218 var103 = class218.method3666(var102);
                if (var103.field2620 != var101 || var101 == -1) {
                    var103.field2620 = var101;
                    var103.field2701 = 0;
                    var103.field2702 = 0;
                    method4409(var103);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2196 == arg0.field1303) {
                int var104 = var3.method5124();
                int var105 = var3.method5129();
                int var106 = var3.method5124();
                method531(var104, var105, var106);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1303) {
                int var107 = var3.method5129();
                method107(var107);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1303) {
                int var108 = var3.method5178();
                int var109 = var3.method5218();
                class62 var110 = (class62) field807.method5527((long) var109);
                class62 var111 = (class62) field807.method5527((long) var108);
                if (var111 != null) {
                    method3363(var111, var110 == null || var110.field571 != var111.field571);
                }
                if (var110 != null) {
                    var110.method3351();
                    field807.method5535(var110, (long) var108);
                }
                class218 var112 = class218.method3666(var109);
                if (var112 != null) {
                    method4409(var112);
                }
                class218 var113 = class218.method3666(var108);
                if (var113 != null) {
                    method4409(var113);
                    method267(Statics.field248[var113.field2573 >>> 16], var113, true);
                }
                if (field806 != -1) {
                    method3819(field806, 1);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1303) {
                boolean var114 = var3.method5129() == 1;
                if (var114) {
                    Statics.field275 = Statics.method184() - var3.method5311();
                    Statics.field937 = new class7(var3, true);
                } else {
                    Statics.field937 = null;
                }
                field843 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2188 == arg0.field1303) {
                method57(class186.field2321);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1303) {
                String var115 = var3.method5138();
                long var116 = (long) var3.method5124();
                long var118 = (long) var3.method5133();
                class230 var120 = (class230) class196.method222(class230.method1984(), var3.method5129());
                long var121 = (var116 << 32) + var118;
                boolean var123 = false;
                for (int var124 = 0; var124 < 100; var124++) {
                    if (field866[var124] == var121) {
                        var123 = true;
                        break;
                    }
                }
                if (Statics.field415.method1693(new class284(var115, Statics.field2390))) {
                    var123 = true;
                }
                if (!var123 && field760 == 0) {
                    field866[field716] = var121;
                    field716 = (field716 + 1) % 100;
                    String var125 = class297.method4981(class292.method611(class211.method3071(var3)));
                    byte var126;
                    if (var120.field3094) {
                        var126 = 7;
                    } else {
                        var126 = 3;
                    }
                    if (var120.field3101 == -1) {
                        class92.method1681(var126, var115, var125);
                    } else {
                        class92.method1681(var126, class82.method3404(var120.field3101) + var115, var125);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2185 == arg0.field1303) {
                field671 = true;
                Statics.field641 = var3.method5129();
                Statics.field1320 = var3.method5129();
                Statics.field307 = var3.method5124();
                Statics.field3661 = var3.method5129();
                Statics.field3231 = var3.method5129();
                if (Statics.field3231 >= 100) {
                    Statics.field3343 = Statics.field641 * 128 + 64;
                    Statics.field1000 = Statics.field1320 * 128 + 64;
                    Statics.field438 = method228(Statics.field3343, Statics.field1000, Statics.field2055) - Statics.field307;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1303) {
                String var127 = var3.method5138();
                long var128 = var3.method5311();
                long var130 = (long) var3.method5124();
                long var132 = (long) var3.method5133();
                class230 var134 = (class230) class196.method222(class230.method1984(), var3.method5129());
                long var135 = (var130 << 32) + var132;
                boolean var137 = false;
                for (int var138 = 0; var138 < 100; var138++) {
                    if (field866[var138] == var135) {
                        var137 = true;
                        break;
                    }
                }
                if (var134.field3103 && Statics.field415.method1693(new class284(var127, Statics.field2390))) {
                    var137 = true;
                }
                if (!var137 && field760 == 0) {
                    field866[field716] = var135;
                    field716 = (field716 + 1) % 100;
                    String var139 = class297.method4981(class292.method611(class211.method3071(var3)));
                    if (var134.field3101 == -1) {
                        class92.method3339(9, var127, var139, class290.method313(var128));
                    } else {
                        class92.method3339(9, class82.method3404(var134.field3101) + var127, var139, class290.method313(var128));
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1303) {
                int var140 = var3.method5134();
                class62 var141 = (class62) field807.method5527((long) var140);
                if (var141 != null) {
                    method3363(var141, true);
                }
                if (field813 != null) {
                    method4409(field813);
                    field813 = null;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1303) {
                Statics.field173 = class311.method3162(var3.method5129());
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2190 == arg0.field1303) {
                Statics.field3664 = var3.method5159();
                Statics.field532 = var3.method5324();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1303) {
                class72 var142 = new class72();
                var142.field1020 = var3.method5138();
                var142.field1014 = var3.method5124();
                int var143 = var3.method5134();
                var142.field1017 = var143;
                method1969(45);
                var2.method3269();
                Object var144 = null;
                class86.method58(var142);
                arg0.field1303 = null;
                return false;
            }
            if (class183.field2180 == arg0.field1303) {
                int var145 = var3.method5179();
                int var146 = var3.method5315();
                class218 var147 = class218.method3666(var145);
                if (var147.field2616 != 1 || var147.field2617 != var146) {
                    var147.field2616 = 1;
                    var147.field2617 = var146;
                    method4409(var147);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1303) {
                int var148 = var3.method5178();
                int var149 = var3.method5167();
                if (var149 == 65535) {
                    var149 = -1;
                }
                int var150 = var3.method5218();
                class218 var151 = class218.method3666(var150);
                if (var151.field2572) {
                    var151.field2626 = var149;
                    var151.field2700 = var148;
                    class256 var153 = class256.method4164(var149);
                    var151.field2624 = var153.field3450;
                    var151.field2625 = var153.field3414;
                    var151.field2588 = var153.field3438;
                    var151.field2645 = var153.field3416;
                    var151.field2623 = var153.field3417;
                    var151.field2627 = var153.field3432;
                    if (var153.field3418 == 1) {
                        var151.field2632 = 1;
                    } else {
                        var151.field2632 = 2;
                    }
                    if (var151.field2628 > 0) {
                        var151.field2627 = var151.field2627 * 32 / var151.field2628;
                    } else if (var151.field2584 > 0) {
                        var151.field2627 = var151.field2627 * 32 / var151.field2584;
                    }
                    method4409(var151);
                } else if (var149 == -1) {
                    var151.field2616 = 0;
                    arg0.field1303 = null;
                    return true;
                } else {
                    class256 var152 = class256.method4164(var149);
                    var151.field2616 = 4;
                    var151.field2617 = var149;
                    var151.field2624 = var152.field3450;
                    var151.field2625 = var152.field3414;
                    var151.field2627 = var152.field3432 * 100 / var148;
                    method4409(var151);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2187 == arg0.field1303) {
                field877 = var3.method5129();
                if (field877 == 255) {
                    field877 = 0;
                }
                field878 = var3.method5129();
                if (field878 == 255) {
                    field878 = 0;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1303) {
                boolean var154 = var3.method5136();
                if (!var154) {
                    Statics.field2717 = null;
                } else if (Statics.field2717 == null) {
                    Statics.field2717 = new class239();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1303) {
                int var155 = var3.method5167();
                int var156 = var3.method5159();
                int var157 = var3.method5178();
                class62 var158 = (class62) field807.method5527((long) var157);
                if (var158 != null) {
                    method3363(var158, var158.field571 != var155);
                }
                method4886(var157, var155, var156);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2120 == arg0.field1303) {
                field663 = var3.method5315() * 30;
                field796 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1303) {
                method5451();
                field737 = var3.method5129();
                field796 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1303) {
                class90.method1930(var3, arg0.field1301);
                method1764();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2189 == arg0.field1303) {
                method57(class186.field2324);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1303) {
                byte[] var159 = new byte[arg0.field1301];
                var3.method5078(var159, 0, var159.length);
                class301 var160 = new class301(var159);
                String var161 = var160.method5138();
                class52.method3723(var161, true, false);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1303) {
                int var162 = var3.method5143();
                boolean var163 = var3.method5129() == 1;
                String var164 = "";
                boolean var165 = false;
                if (var163) {
                    var164 = var3.method5138();
                    if (Statics.field415.method1693(new class284(var164, Statics.field2390))) {
                        var165 = true;
                    }
                }
                String var166 = var3.method5138();
                if (!var165) {
                    class92.method1681(var162, var164, var166);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1303) {
                int var167 = var3.method5129();
                method144(var167);
                arg0.field1303 = null;
                return false;
            }
            if (class183.field2198 == arg0.field1303) {
                method57(class186.field2318);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2191 == arg0.field1303) {
                field879 = var3.method5129();
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2195 == arg0.field1303) {
                int var168 = var3.method5293();
                int var169 = var3.method5293();
                int var170 = var3.method5178();
                int var171 = var3.method5167();
                class218 var172 = class218.method3666(var170);
                if (var172.field2624 != var169 || var172.field2625 != var171 || var172.field2627 != var168) {
                    var172.field2624 = var169;
                    var172.field2625 = var171;
                    var172.field2627 = var168;
                    method4409(var172);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2194 == arg0.field1303) {
                Statics.field415.method1688();
                field840 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1303) {
                method57(class186.field2315);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1303) {
                Statics.field415.method1723(var3, arg0.field1301);
                field840 = field832;
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1303) {
                field664 = var3.method5129();
                if (field664 == 1) {
                    field687 = var3.method5124();
                }
                if (field664 >= 2 && field664 <= 6) {
                    if (field664 == 2) {
                        field733 = 64;
                        field784 = 64;
                    }
                    if (field664 == 3) {
                        field733 = 0;
                        field784 = 64;
                    }
                    if (field664 == 4) {
                        field733 = 128;
                        field784 = 64;
                    }
                    if (field664 == 5) {
                        field733 = 64;
                        field784 = 0;
                    }
                    if (field664 == 6) {
                        field733 = 64;
                        field784 = 128;
                    }
                    field664 = 2;
                    field667 = var3.method5124();
                    field668 = var3.method5124();
                    field669 = var3.method5129();
                }
                if (field664 == 10) {
                    field666 = var3.method5124();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1303) {
                String var173 = var3.method5138();
                int var174 = var3.method5159();
                int var175 = var3.method5158();
                if (var175 >= 1 && var175 <= 8) {
                    if (var173.equalsIgnoreCase(class225.field2775)) {
                        var173 = null;
                    }
                    field770[var175 - 1] = var173;
                    field771[var175 - 1] = var174 == 0;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1303) {
                var3.field3707 += 28;
                if (var3.method5174()) {
                    Statics.method3088(var3, var3.field3707 - 28);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2165 == arg0.field1303) {
                method57(class186.field2319);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2192 == arg0.field1303) {
                int var176 = var3.method5293();
                int var177 = var3.method5218();
                class218 var178 = class218.method3666(var177);
                if (var178.field2616 != 2 || var178.field2617 != var176) {
                    var178.field2616 = 2;
                    var178.field2617 = var176;
                    method4409(var178);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1303) {
                String var179 = var3.method5138();
                int var180 = var3.method5218();
                class218 var181 = class218.method3666(var180);
                if (!var179.equals(var181.field2634)) {
                    var181.field2634 = var179;
                    method4409(var181);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2127 == arg0.field1303) {
                int var182 = arg0.field1301 + var3.field3707;
                int var183 = var3.method5124();
                int var184 = var3.method5124();
                if (field806 != var183) {
                    field806 = var183;
                    this.method1360(false);
                    method754(field806);
                    class77.method176(field806);
                    for (int var185 = 0; var185 < 100; var185++) {
                        field852[var185] = true;
                    }
                }
                while (var184-- > 0) {
                    int var186 = var3.method5134();
                    int var187 = var3.method5124();
                    int var188 = var3.method5129();
                    class62 var189 = (class62) field807.method5527((long) var186);
                    if (var189 != null && var189.field571 != var187) {
                        method3363(var189, true);
                        var189 = null;
                    }
                    if (var189 == null) {
                        var189 = method4886(var186, var187, var188);
                    }
                    var189.field569 = true;
                }
                for (class62 var190 = (class62) field807.method5529(); var190 != null; var190 = (class62) field807.method5530()) {
                    if (var190.field569) {
                        var190.field569 = false;
                    } else {
                        method3363(var190, true);
                    }
                }
                field849 = new class319(512);
                while (var3.field3707 < var182) {
                    int var191 = var3.method5134();
                    int var192 = var3.method5124();
                    int var193 = var3.method5124();
                    int var194 = var3.method5134();
                    for (int var195 = var192; var195 <= var193; var195++) {
                        long var196 = ((long) var191 << 32) + (long) var195;
                        field849.method5535(new class180(var194), var196);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1303) {
                method375(true, arg0.field1299);
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2197 == arg0.field1303) {
                for (int var198 = 0; var198 < class213.field2534.length; var198++) {
                    if (class213.field2535[var198] != class213.field2534[var198]) {
                        class213.field2534[var198] = class213.field2535[var198];
                        method3360(var198);
                        field833[++field834 - 1 & 0x1F] = var198;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1303) {
                method5451();
                field903 = var3.method5132();
                field796 = field832;
                arg0.field1303 = null;
                return true;
            }
            Statics.method3817("" + (arg0.field1303 == null ? -1 : arg0.field1303.field2202) + class82.field1134 + (arg0.field1306 == null ? -1 : arg0.field1306.field2202) + class82.field1134 + (arg0.field1308 == null ? -1 : arg0.field1308.field2202) + class82.field1134 + arg0.field1301, (Throwable) null);
            method504();
        } catch (IOException var203) {
            method269();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1303 == null ? -1 : arg0.field1303.field2202) + class82.field1134 + (arg0.field1306 == null ? -1 : arg0.field1306.field2202) + class82.field1134 + (arg0.field1308 == null ? -1 : arg0.field1308.field2202) + class82.field1134 + arg0.field1301 + class82.field1134 + (Statics.field1262 + Statics.field2392.field978[0]) + class82.field1134 + (Statics.field2367 + Statics.field2392.field996[0]) + class82.field1134;
            for (int var202 = 0; var202 < arg0.field1301 && var202 < 50; var202++) {
                var201 = var201 + var3.field3708[var202] + class82.field1134;
            }
            Statics.method3817(var201, var204);
            method504();
        }
        return true;
    }

    @ObfuscatedName("g.hn(Lgy;I)V")
    public static final void method57(class186 arg0) {
        class300 var1 = field693.field1299;
        if (class186.field2315 == arg0) {
            int var2 = var1.method5324();
            int var3 = (var2 >> 4 & 0x7) + Statics.field532;
            int var4 = (var2 & 0x7) + Statics.field3664;
            int var5 = var1.method5159();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field744[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method3809(Statics.field2055, var3, var4, var8, -1, var6, var7, 0, -1);
            }
            return;
        }
        if (class186.field2328 == arg0) {
            int var9 = var1.method5293();
            int var10 = var1.method5159();
            int var11 = var1.method5129();
            int var12 = (var11 >> 4 & 0x7) + Statics.field532;
            int var13 = (var11 & 0x7) + Statics.field3664;
            int var14 = var1.method5129();
            int var15 = var14 >> 4 & 0xF;
            int var16 = var14 & 0x7;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                int var17 = var15 + 1;
                if (Statics.field2392.field978[0] >= var12 - var17 && Statics.field2392.field978[0] <= var12 + var17 && Statics.field2392.field996[0] >= var13 - var17 && Statics.field2392.field996[0] <= var13 + var17 && field884 != 0 && var16 > 0 && field845 < 50) {
                    field692[field845] = var9;
                    field887[field845] = var16;
                    field888[field845] = var10;
                    field890[field845] = null;
                    field924[field845] = (var12 << 16) + (var13 << 8) + var15;
                    field845++;
                }
            }
        }
        if (class186.field2323 == arg0) {
            int var18 = var1.method5315();
            int var19 = var1.method5158();
            int var20 = (var19 >> 4 & 0x7) + Statics.field532;
            int var21 = (var19 & 0x7) + Statics.field3664;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class263 var22 = field799[Statics.field2055][var20][var21];
                if (var22 != null) {
                    for (class88 var23 = (class88) var22.method4543(); var23 != null; var23 = (class88) var22.method4564()) {
                        if ((var18 & 0x7FFF) == var23.field1226) {
                            var23.method3351();
                            break;
                        }
                    }
                    if (var22.method4543() == null) {
                        field799[Statics.field2055][var20][var21] = null;
                    }
                    method656(var20, var21);
                }
            }
        } else if (class186.field2318 == arg0) {
            int var24 = var1.method5167();
            int var25 = var1.method5158();
            int var26 = (var25 >> 4 & 0x7) + Statics.field532;
            int var27 = (var25 & 0x7) + Statics.field3664;
            int var28 = var1.method5167();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class88 var29 = new class88();
                var29.field1226 = var24;
                var29.field1224 = var28;
                if (field799[Statics.field2055][var26][var27] == null) {
                    field799[Statics.field2055][var26][var27] = new class263();
                }
                field799[Statics.field2055][var26][var27].method4545(var29);
                method656(var26, var27);
            }
        } else if (class186.field2317 == arg0) {
            int var30 = var1.method5124();
            int var31 = var1.method5158();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field744[var32];
            int var35 = var1.method5159();
            int var36 = (var35 >> 4 & 0x7) + Statics.field532;
            int var37 = (var35 & 0x7) + Statics.field3664;
            if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                if (var34 == 0) {
                    class137 var38 = Statics.field3111.method2913(Statics.field2055, var36, var37);
                    if (var38 != null) {
                        int var39 = class129.method65(var38.field1876);
                        if (var32 == 2) {
                            var38.field1874 = new class94(var39, 2, var33 + 4, Statics.field2055, var36, var37, var30, false, var38.field1874);
                            var38.field1870 = new class94(var39, 2, var33 + 1 & 0x3, Statics.field2055, var36, var37, var30, false, var38.field1870);
                        } else {
                            var38.field1874 = new class94(var39, var32, var33, Statics.field2055, var36, var37, var30, false, var38.field1874);
                        }
                    }
                }
                if (var34 == 1) {
                    class142 var40 = Statics.field3111.method2914(Statics.field2055, var36, var37);
                    if (var40 != null) {
                        int var41 = class129.method65(var40.field1916);
                        if (var32 == 4 || var32 == 5) {
                            var40.field1914 = new class94(var41, 4, var33, Statics.field2055, var36, var37, var30, false, var40.field1914);
                        } else if (var32 == 6) {
                            var40.field1914 = new class94(var41, 4, var33 + 4, Statics.field2055, var36, var37, var30, false, var40.field1914);
                        } else if (var32 == 7) {
                            var40.field1914 = new class94(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field2055, var36, var37, var30, false, var40.field1914);
                        } else if (var32 == 8) {
                            var40.field1914 = new class94(var41, 4, var33 + 4, Statics.field2055, var36, var37, var30, false, var40.field1914);
                            var40.field1915 = new class94(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field2055, var36, var37, var30, false, var40.field1915);
                        }
                    }
                }
                if (var34 == 2) {
                    class143 var42 = Statics.field3111.method2939(Statics.field2055, var36, var37);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var42 != null) {
                        var42.field1921 = new class94(class129.method65(var42.field1933), var32, var33, Statics.field2055, var36, var37, var30, false, var42.field1921);
                    }
                }
                if (var34 == 3) {
                    class124 var43 = Statics.field3111.method2916(Statics.field2055, var36, var37);
                    if (var43 != null) {
                        var43.field1601 = new class94(class129.method65(var43.field1603), 22, var33, Statics.field2055, var36, var37, var30, false, var43.field1601);
                    }
                }
            }
        } else if (class186.field2324 == arg0) {
            int var44 = var1.method5158();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field744[var45];
            int var48 = var1.method5315();
            int var49 = var1.method5129();
            int var50 = (var49 >> 4 & 0x7) + Statics.field532;
            int var51 = (var49 & 0x7) + Statics.field3664;
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                method3809(Statics.field2055, var50, var51, var47, var48, var45, var46, 0, -1);
            }
        } else {
            if (class186.field2321 == arg0) {
                int var52 = var1.method5158();
                int var53 = (var52 >> 4 & 0x7) + Statics.field532;
                int var54 = (var52 & 0x7) + Statics.field3664;
                byte var55 = var1.method5130();
                int var56 = var1.method5293();
                byte var57 = var1.method5171();
                byte var58 = var1.method5333();
                int var59 = var1.method5158();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field744[var60];
                int var63 = var1.method5315();
                int var64 = var1.method5167();
                byte var65 = var1.method5171();
                int var66 = var1.method5293();
                class67 var67;
                if (field739 == var64) {
                    var67 = Statics.field2392;
                } else {
                    var67 = field762[var64];
                }
                if (var67 != null) {
                    class255 var68 = class255.method3070(var66);
                    int var69;
                    int var70;
                    if (var61 == 1 || var61 == 3) {
                        var69 = var68.field3361;
                        var70 = var68.field3360;
                    } else {
                        var69 = var68.field3360;
                        var70 = var68.field3361;
                    }
                    int var71 = (var69 >> 1) + var53;
                    int var72 = (var69 + 1 >> 1) + var53;
                    int var73 = (var70 >> 1) + var54;
                    int var74 = (var70 + 1 >> 1) + var54;
                    int[][] var75 = class56.field516[Statics.field2055];
                    int var76 = var75[var71][var73] + var75[var72][var73] + var75[var71][var74] + var75[var72][var74] >> 2;
                    int var77 = (var53 << 7) + (var69 << 6);
                    int var78 = (var54 << 7) + (var70 << 6);
                    class128 var79 = var68.method4291(var60, var61, var75, var77, var76, var78);
                    if (var79 != null) {
                        method3809(Statics.field2055, var53, var54, var62, -1, 0, 0, var56 + 1, var63 + 1);
                        var67.field634 = field656 + var56;
                        var67.field613 = field656 + var63;
                        var67.field631 = var79;
                        var67.field623 = var53 * 128 + var69 * 64;
                        var67.field621 = var54 * 128 + var70 * 64;
                        var67.field624 = var76;
                        if (var55 > var58) {
                            byte var80 = var55;
                            var55 = var58;
                            var58 = var80;
                        }
                        if (var57 > var65) {
                            byte var81 = var57;
                            var57 = var65;
                            var65 = var81;
                        }
                        var67.field627 = var53 + var55;
                        var67.field629 = var53 + var58;
                        var67.field628 = var54 + var57;
                        var67.field630 = var54 + var65;
                    }
                }
            }
            if (class186.field2319 == arg0) {
                int var82 = var1.method5132();
                int var83 = var1.method5129();
                int var84 = var1.method5324();
                int var85 = (var84 >> 4 & 0x7) + Statics.field532;
                int var86 = (var84 & 0x7) + Statics.field3664;
                int var87 = var1.method5324() * 4;
                int var88 = var1.method5315();
                int var89 = var1.method5324() * 4;
                int var90 = var1.method5124();
                int var91 = var1.method5159();
                byte var92 = var1.method5162();
                byte var93 = var1.method5171();
                int var94 = var1.method5124();
                int var95 = var85 + var93;
                int var96 = var86 + var92;
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104 && var94 != 65535) {
                    int var97 = var85 * 128 + 64;
                    int var98 = var86 * 128 + 64;
                    int var99 = var95 * 128 + 64;
                    int var100 = var96 * 128 + 64;
                    class87 var101 = new class87(var94, Statics.field2055, var97, var98, method228(var97, var98, Statics.field2055) - var87, field656 + var90, field656 + var88, var91, var83, var82, var89);
                    var101.method1967(var99, var100, method228(var99, var100, Statics.field2055) - var89, field656 + var90);
                    field686.method4545(var101);
                }
            } else if (class186.field2316 == arg0) {
                int var102 = var1.method5293();
                int var103 = var1.method5315();
                int var104 = var1.method5167();
                int var105 = var1.method5324();
                int var106 = (var105 >> 4 & 0x7) + Statics.field532;
                int var107 = (var105 & 0x7) + Statics.field3664;
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class263 var108 = field799[Statics.field2055][var106][var107];
                    if (var108 != null) {
                        for (class88 var109 = (class88) var108.method4543(); var109 != null; var109 = (class88) var108.method4564()) {
                            if ((var102 & 0x7FFF) == var109.field1226 && var109.field1224 == var104) {
                                var109.field1224 = var103;
                                break;
                            }
                        }
                        method656(var106, var107);
                    }
                }
            } else if (class186.field2320 == arg0) {
                int var110 = var1.method5315();
                int var111 = var1.method5324();
                int var112 = (var111 >> 4 & 0x7) + Statics.field532;
                int var113 = (var111 & 0x7) + Statics.field3664;
                int var114 = var1.method5129();
                int var115 = var1.method5167();
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    int var116 = var112 * 128 + 64;
                    int var117 = var113 * 128 + 64;
                    class78 var118 = new class78(var115, Statics.field2055, var116, var117, method228(var116, var117, Statics.field2055) - var114, var110, field656);
                    field855.method4545(var118);
                }
            }
        }
    }

    @ObfuscatedName("hm.hw(IIIIIIIIII)V")
    public static final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field775.method4543(); var10 != null; var10 = (class69) field775.method4564()) {
            if (var10.field933 == arg0 && var10.field927 == arg1 && var10.field928 == arg2 && var10.field926 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field933 = arg0;
            var9.field926 = arg3;
            var9.field927 = arg1;
            var9.field928 = arg2;
            method285(var9);
            field775.method4545(var9);
        }
        var9.field931 = arg4;
        var9.field934 = arg5;
        var9.field932 = arg6;
        var9.field935 = arg7;
        var9.field930 = arg8;
    }

    @ObfuscatedName("u.hd(Lbs;I)V")
    public static final void method285(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field926 == 0) {
            var1 = Statics.field3111.method2935(arg0.field933, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 1) {
            var1 = Statics.field3111.method2918(arg0.field933, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 2) {
            var1 = Statics.field3111.method2985(arg0.field933, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 3) {
            var1 = Statics.field3111.method3056(arg0.field933, arg0.field927, arg0.field928);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3111.method2921(arg0.field933, arg0.field927, arg0.field928, var1);
            var3 = class129.method65(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field929 = var3;
        arg0.field925 = var4;
        arg0.field936 = var5;
    }

    @ObfuscatedName("y.ha(IIIIIIIS)V")
    public static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field844 && Statics.field2055 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3111.method2935(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3111.method2918(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3111.method2985(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3111.method3056(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3111.method2921(arg0, arg2, arg3, var7);
            int var13 = class129.method65(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3111.method2908(arg0, arg2, arg3);
                class255 var16 = class255.method3070(var13);
                if (var16.field3362 != 0) {
                    field704[arg0].method3306(arg2, arg3, var14, var15, var16.field3363);
                }
            }
            if (arg1 == 1) {
                Statics.field3111.method2909(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3111.method3013(arg0, arg2, arg3);
                class255 var17 = class255.method3070(var13);
                if (var17.field3360 + arg2 > 103 || var17.field3360 + arg3 > 103 || var17.field3361 + arg2 > 103 || var17.field3361 + arg3 > 103) {
                    return;
                }
                if (var17.field3362 != 0) {
                    field704[arg0].method3307(arg2, arg3, var17.field3360, var17.field3361, var15, var17.field3363);
                }
            }
            if (arg1 == 3) {
                Statics.field3111.method2911(arg0, arg2, arg3);
                class255 var18 = class255.method3070(var13);
                if (var18.field3362 == 1) {
                    field704[arg0].method3309(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field506[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class56.method1021(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3111, field704[arg0]);
    }

    @ObfuscatedName("al.hm(III)V")
    public static final void method656(int arg0, int arg1) {
        class263 var2 = field799[Statics.field2055][arg0][arg1];
        if (var2 == null) {
            Statics.field3111.method2896(Statics.field2055, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4543(); var6 != null; var6 = (class88) var2.method4564()) {
            class256 var7 = class256.method4164(var6.field1226);
            long var8 = (long) var7.field3428;
            if (var7.field3418 == 1) {
                var8 = (long) (var6.field1224 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3111.method2896(Statics.field2055, arg0, arg1);
            return;
        }
        var2.method4565(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4543(); var12 != null; var12 = (class88) var2.method4564()) {
            if (var5.field1226 != var12.field1226) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1226 != var12.field1226 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method855(arg0, arg1, 3, false, 0);
        Statics.field3111.method2898(Statics.field2055, arg0, arg1, method228(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2055), var5, var13, var10, var11);
    }

    @ObfuscatedName("at.hg(ZLks;B)V")
    public static final void method700(boolean arg0, class300 arg1) {
        field767 = 0;
        field691 = 0;
        method1682();
        while (arg1.method5081(field693.field1301) >= 27) {
            int var2 = arg1.method5080(15);
            if (var2 == 32767) {
                break;
            }
            boolean var6 = false;
            if (field688[var2] == null) {
                field688[var2] = new class80();
                var6 = true;
            }
            class80 var7 = field688[var2];
            field690[++field880 - 1] = var2;
            var7.field989 = field656;
            int var8;
            if (arg0) {
                var8 = arg1.method5080(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = arg1.method5080(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            var7.field1120 = class258.method3989(arg1.method5080(14));
            int var9 = field772[arg1.method5080(3)];
            if (var6) {
                var7.field991 = var7.field972 = var9;
            }
            int var10 = arg1.method5080(1);
            int var11 = arg1.method5080(1);
            if (var11 == 1) {
                field868[++field691 - 1] = var2;
            }
            int var12;
            if (arg0) {
                var12 = arg1.method5080(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = arg1.method5080(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var7.field943 = var7.field1120.field3484;
            var7.field976 = var7.field1120.field3489;
            if (var7.field976 == 0) {
                var7.field972 = 0;
            }
            var7.field994 = var7.field1120.field3460;
            var7.field967 = var7.field1120.field3494;
            var7.field977 = var7.field1120.field3474;
            var7.field960 = var7.field1120.field3486;
            var7.field945 = var7.field1120.field3469;
            var7.field951 = var7.field1120.field3470;
            var7.field947 = var7.field1120.field3471;
            var7.method1902(Statics.field2392.field978[0] + var12, Statics.field2392.field996[0] + var8, var10 == 1);
        }
        arg1.method5083();
        method719(arg1);
        for (int var3 = 0; var3 < field767; var3++) {
            int var4 = field829[var3];
            if (field656 != field688[var4].field989) {
                field688[var4].field1120 = null;
                field688[var4] = null;
            }
        }
        if (field693.field1301 != arg1.field3707) {
            throw new RuntimeException(arg1.field3707 + class82.field1134 + field693.field1301);
        }
        for (int var5 = 0; var5 < field880; var5++) {
            if (field688[field690[var5]] == null) {
                throw new RuntimeException(var5 + class82.field1134 + field880);
            }
        }
    }

    @ObfuscatedName("bj.hy(S)V")
    public static final void method1682() {
        class300 var0 = field693.field1299;
        var0.method5079();
        int var1 = var0.method5080(8);
        if (var1 < field880) {
            for (int var2 = var1; var2 < field880; var2++) {
                field829[++field767 - 1] = field690[var2];
            }
        }
        if (var1 > field880) {
            throw new RuntimeException("");
        }
        field880 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field690[var3];
            class80 var5 = field688[var4];
            int var6 = var0.method5080(1);
            if (var6 == 0) {
                field690[++field880 - 1] = var4;
                var5.field989 = field656;
            } else {
                int var7 = var0.method5080(2);
                if (var7 == 0) {
                    field690[++field880 - 1] = var4;
                    var5.field989 = field656;
                    field868[++field691 - 1] = var4;
                } else if (var7 == 1) {
                    field690[++field880 - 1] = var4;
                    var5.field989 = field656;
                    int var8 = var0.method5080(3);
                    var5.method1904(var8, (byte) 1);
                    int var9 = var0.method5080(1);
                    if (var9 == 1) {
                        field868[++field691 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field690[++field880 - 1] = var4;
                    var5.field989 = field656;
                    int var10 = var0.method5080(3);
                    var5.method1904(var10, (byte) 2);
                    int var11 = var0.method5080(3);
                    var5.method1904(var11, (byte) 2);
                    int var12 = var0.method5080(1);
                    if (var12 == 1) {
                        field868[++field691 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field829[++field767 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ab.hk(Lks;I)V")
    public static final void method719(class300 arg0) {
        for (int var1 = 0; var1 < field691; var1++) {
            int var2 = field868[var1];
            class80 var3 = field688[var2];
            int var4 = arg0.method5129();
            if ((var4 & 0x4) != 0) {
                var3.field966 = arg0.method5124();
                if (var3.field966 == 65535) {
                    var3.field966 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field985 = arg0.method5315();
                int var5 = arg0.method5179();
                var3.field981 = var5 >> 16;
                var3.field980 = (var5 & 0xFFFF) + field656;
                var3.field979 = 0;
                var3.field993 = 0;
                if (var3.field980 > field656) {
                    var3.field979 = -1;
                }
                if (var3.field985 == 65535) {
                    var3.field985 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field953 = arg0.method5138();
                var3.field956 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method5159();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg0.method5143();
                        if (var11 == 32767) {
                            var11 = arg0.method5143();
                            var9 = arg0.method5143();
                            var8 = arg0.method5143();
                            var10 = arg0.method5143();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg0.method5143();
                        }
                        int var12 = arg0.method5143();
                        var3.method1576(var11, var9, var8, var10, field656, var12);
                    }
                }
                int var13 = arg0.method5129();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg0.method5143();
                        int var16 = arg0.method5143();
                        if (var16 == 32767) {
                            var3.method1577(var15);
                        } else {
                            int var17 = arg0.method5143();
                            int var18 = arg0.method5129();
                            int var19 = var16 > 0 ? arg0.method5159() : var18;
                            var3.method1572(var15, field656, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field982 = arg0.method5171();
                var3.field958 = arg0.method5171();
                var3.field962 = arg0.method5171();
                var3.field992 = arg0.method5130();
                var3.field986 = arg0.method5167() + field656;
                var3.field987 = arg0.method5167() + field656;
                var3.field988 = arg0.method5315();
                var3.field974 = 1;
                var3.field999 = 0;
                var3.field982 += var3.field978[0];
                var3.field958 += var3.field996[0];
                var3.field962 += var3.field978[0];
                var3.field992 += var3.field996[0];
            }
            if ((var4 & 0x8) != 0) {
                int var20 = arg0.method5167();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = arg0.method5129();
                if (var3.field995 == var20 && var20 != -1) {
                    int var22 = class260.method5476(var20).field3517;
                    if (var22 == 1) {
                        var3.field973 = 0;
                        var3.field990 = 0;
                        var3.field975 = var21;
                        var3.field984 = 0;
                    }
                    if (var22 == 2) {
                        var3.field984 = 0;
                    }
                } else if (var20 == -1 || var3.field995 == -1 || class260.method5476(var20).field3509 >= class260.method5476(var3.field995).field3509) {
                    var3.field995 = var20;
                    var3.field973 = 0;
                    var3.field990 = 0;
                    var3.field975 = var21;
                    var3.field984 = 0;
                    var3.field999 = var3.field974;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1120 = class258.method3989(arg0.method5315());
                var3.field943 = var3.field1120.field3484;
                var3.field976 = var3.field1120.field3489;
                var3.field994 = var3.field1120.field3460;
                var3.field967 = var3.field1120.field3494;
                var3.field977 = var3.field1120.field3474;
                var3.field960 = var3.field1120.field3486;
                var3.field945 = var3.field1120.field3469;
                var3.field951 = var3.field1120.field3470;
                var3.field947 = var3.field1120.field3471;
            }
            if ((var4 & 0x80) != 0) {
                int var23 = arg0.method5315();
                int var24 = arg0.method5167();
                int var25 = var3.field983 - (var23 - Statics.field1262 - Statics.field1262) * 64;
                int var26 = var3.field940 - (var24 - Statics.field2367 - Statics.field2367) * 64;
                if (var25 != 0 || var26 != 0) {
                    var3.field968 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("ca.hv(I)V")
    public static void method2149() {
        field649 = 0;
        field782 = false;
        field654[0] = class225.field3016;
        field689[0] = "";
        field786[0] = 1006;
        field790[0] = false;
        field649 = 1;
    }

    @ObfuscatedName("jp.ho(IIB)V")
    public static final void method4804(int arg0, int arg1) {
        if (field649 < 2 && field826 == 0 && !field650 || !field794) {
            return;
        }
        int var2 = field649 - 1;
        String var4;
        if (field826 == 1 && field649 < 2) {
            var4 = class225.field2921 + class225.field2894 + field841 + " " + class82.field1133;
        } else if (field650 && field649 < 2) {
            var4 = field804 + class225.field2894 + field805 + " " + class82.field1133;
        } else {
            var4 = method4027(var2);
        }
        if (field649 > 2) {
            var4 = var4 + class82.method2132(16777215) + " " + '/' + " " + (field649 - 2) + class225.field2925;
        }
        Statics.field1.method4990(var4, arg0 + 4, arg1 + 15, 16777215, 0, field656 / 1000);
    }

    @ObfuscatedName("i.hz(I)V")
    public static final void method44() {
        int var0 = Statics.field3126;
        int var1 = Statics.field534;
        int var2 = Statics.field567;
        int var3 = Statics.field598;
        int var4 = 6116423;
        class322.method5590(var0, var1, var2, var3, var4);
        class322.method5590(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class322.method5626(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1.method5026(class225.field2924, var0 + 3, var1 + 14, var4, -1);
        int var5 = class55.field494;
        int var6 = class55.field492;
        for (int var7 = 0; var7 < field649; var7++) {
            int var8 = (field649 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1.method5026(method4027(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field3126;
        int var11 = Statics.field534;
        int var12 = Statics.field567;
        int var13 = Statics.field598;
        for (int var14 = 0; var14 < field791; var14++) {
            if (field857[var14] + field748[var14] > var10 && field748[var14] < var10 + var12 && field858[var14] + field645[var14] > var11 && field645[var14] < var11 + var13) {
                field853[var14] = true;
            }
        }
    }

    @ObfuscatedName("client.hh(I)V")
    public final void method1177() {
        method1039();
        if (Statics.field2325 != null || field651 != null) {
            return;
        }
        int var28;
        int var31;
        int var32;
        label227: {
            int var1 = class55.field496;
            if (field782) {
                if (var1 != 1 && (Statics.field540 || var1 != 4)) {
                    int var2 = class55.field494;
                    int var3 = class55.field492;
                    if (var2 < Statics.field3126 - 10 || var2 > Statics.field567 + Statics.field3126 + 10 || var3 < Statics.field534 - 10 || var3 > Statics.field598 + Statics.field534 + 10) {
                        field782 = false;
                        int var4 = Statics.field3126;
                        int var5 = Statics.field534;
                        int var6 = Statics.field567;
                        int var7 = Statics.field598;
                        for (int var8 = 0; var8 < field791; var8++) {
                            if (field857[var8] + field748[var8] > var4 && field748[var8] < var4 + var6 && field858[var8] + field645[var8] > var5 && field645[var8] < var5 + var7) {
                                field852[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field540 && var1 == 4) {
                    int var9 = Statics.field3126;
                    int var10 = Statics.field534;
                    int var11 = Statics.field567;
                    int var12 = class55.field497;
                    int var13 = class55.field489;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field649; var15++) {
                        int var16 = (field649 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1 && var14 >= 0) {
                        int var17 = field761[var14];
                        int var18 = field785[var14];
                        int var19 = field786[var14];
                        int var20 = field787[var14];
                        String var21 = field654[var14];
                        String var22 = field689[var14];
                        method3178(var17, var18, var19, var20, var21, var22, class55.field497, class55.field489);
                    }
                    field782 = false;
                    int var23 = Statics.field3126;
                    int var24 = Statics.field534;
                    int var25 = Statics.field567;
                    int var26 = Statics.field598;
                    for (int var27 = 0; var27 < field791; var27++) {
                        if (field857[var27] + field748[var27] > var23 && field748[var27] < var23 + var25 && field858[var27] + field645[var27] > var24 && field645[var27] < var24 + var26) {
                            field852[var27] = true;
                        }
                    }
                }
            } else {
                var28 = field649 - 1;
                if ((var1 == 1 || !Statics.field540 && var1 == 4) && var28 >= 0) {
                    int var30 = field786[var28];
                    if (var30 == 39 || var30 == 40 || var30 == 41 || var30 == 42 || var30 == 43 || var30 == 33 || var30 == 34 || var30 == 35 || var30 == 36 || var30 == 37 || var30 == 38 || var30 == 1005) {
                        var31 = field761[var28];
                        var32 = field785[var28];
                        class218 var33 = class218.method3666(var32);
                        int var34 = method188(var33);
                        boolean var35 = (var34 >> 28 & 0x1) != 0;
                        if (var35) {
                            break label227;
                        }
                        class219 var10000 = (class219) null;
                        if (class219.method4885(method188(var33))) {
                            break label227;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field540 && var1 == 4) && this.method1178()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field540 && var1 == 4) && field649 > 0 && var28 >= 0) {
                    int var36 = field761[var28];
                    int var37 = field785[var28];
                    int var38 = field786[var28];
                    int var39 = field787[var28];
                    String var40 = field654[var28];
                    String var41 = field689[var28];
                    method3178(var36, var37, var38, var39, var40, var41, class55.field497, class55.field489);
                }
                if (var1 == 2 && field649 > 0) {
                    this.method1505(class55.field497, class55.field489);
                }
            }
            return;
        }
        if (Statics.field2325 != null && !field758 && field649 > 0 && !this.method1178()) {
            method85(field755, field756);
        }
        field758 = false;
        field659 = 0;
        if (Statics.field2325 != null) {
            method4409(Statics.field2325);
        }
        Statics.field2325 = class218.method3666(var32);
        field754 = var31;
        field755 = class55.field497;
        field756 = class55.field489;
        if (var28 >= 0) {
            Statics.field266 = new class83();
            Statics.field266.field1145 = field761[var28];
            Statics.field266.field1144 = field785[var28];
            Statics.field266.field1143 = field786[var28];
            Statics.field266.field1146 = field787[var28];
            Statics.field266.field1147 = field654[var28];
        }
        method4409(Statics.field2325);
    }

    @ObfuscatedName("client.hu(I)Z")
    public final boolean method1178() {
        int var1 = field649 - 1;
        return (field743 == 1 && field649 > 2 || method3098(var1)) && !field790[var1];
    }

    @ObfuscatedName("client.hq(IIB)V")
    public final void method1505(int arg0, int arg1) {
        int var3 = Statics.field1.method4977(class225.field2924);
        for (int var4 = 0; var4 < field649; var4++) {
            int var5 = Statics.field1.method4977(method4027(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field649 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field3615) {
            var7 = Statics.field3615 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field345) {
            var8 = Statics.field345 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field3126 = var7;
        Statics.field534 = var8;
        Statics.field567 = var3;
        Statics.field598 = field649 * 15 + 22;
        Statics.field3111.method2928(Statics.field2055, arg0, arg1, false);
        field782 = true;
    }

    @ObfuscatedName("eg.hx(IB)Z")
    public static final boolean method3098(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field786[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ew.hr(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3178(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 8) {
            class80 var8 = field688[arg3];
            if (var8 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var9 = class188.method2887(class184.field2218, field693.field1298);
                var9.field2335.method5340(field662);
                var9.field2335.method5340(arg3);
                var9.field2335.method5272(class46.field399[82] ? 1 : 0);
                var9.field2335.method5175(Statics.field3652);
                field693.method2109(var9);
            }
        }
        if (arg2 == 12) {
            class80 var10 = field688[arg3];
            if (var10 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var11 = class188.method2887(class184.field2240, field693.field1298);
                var11.field2335.method5157(class46.field399[82] ? 1 : 0);
                var11.field2335.method5340(arg3);
                field693.method2109(var11);
            }
        }
        if (arg2 == 14) {
            class67 var12 = field762[arg3];
            if (var12 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var13 = class188.method2887(class184.field2291, field693.field1298);
                var13.field2335.method5114(Statics.field2492);
                var13.field2335.method5156(class46.field399[82] ? 1 : 0);
                var13.field2335.method5166(Statics.field607);
                var13.field2335.method5177(Statics.field1061);
                var13.field2335.method5340(arg3);
                field693.method2109(var13);
            }
        }
        if (arg2 == 48) {
            class67 var14 = field762[arg3];
            if (var14 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var15 = class188.method2887(class184.field2282, field693.field1298);
                var15.field2335.method5340(arg3);
                var15.field2335.method5272(class46.field399[82] ? 1 : 0);
                field693.method2109(var15);
            }
        }
        if (arg2 == 1001) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var16 = class188.method2887(class184.field2293, field693.field1298);
            var16.field2335.method5157(class46.field399[82] ? 1 : 0);
            var16.field2335.method5164(Statics.field1262 + arg0);
            var16.field2335.method5166(arg3);
            var16.field2335.method5114(Statics.field2367 + arg1);
            field693.method2109(var16);
        }
        if (arg2 == 1005) {
            class218 var17 = class218.method3666(arg1);
            if (var17 == null || var17.field2662[arg0] < 100000) {
                class188 var18 = class188.method2887(class184.field2247, field693.field1298);
                var18.field2335.method5114(arg3);
                field693.method2109(var18);
            } else {
                class92.method1681(27, "", var17.field2662[arg0] + " x " + class256.method4164(arg3).field3407);
            }
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 58) {
            class218 var19 = Statics.method3658(arg1, arg0);
            if (var19 != null) {
                class188 var20 = class188.method2887(class184.field2265, field693.field1298);
                var20.field2335.method5340(field803);
                var20.field2335.method5164(arg0);
                var20.field2335.method5176(arg1);
                var20.field2335.method5164(var19.field2626);
                var20.field2335.method5176(Statics.field3652);
                var20.field2335.method5114(field662);
                field693.method2109(var20);
            }
        }
        if (arg2 == 5) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var21 = class188.method2887(class184.field2300, field693.field1298);
            var21.field2335.method5164(arg3);
            var21.field2335.method5155(class46.field399[82] ? 1 : 0);
            var21.field2335.method5340(Statics.field1262 + arg0);
            var21.field2335.method5164(Statics.field2367 + arg1);
            field693.method2109(var21);
        }
        if (arg2 == 30 && field813 == null) {
            method576(arg1, arg0);
            field813 = Statics.method3658(arg1, arg0);
            method4409(field813);
        }
        if (arg2 == 50) {
            class67 var22 = field762[arg3];
            if (var22 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var23 = class188.method2887(class184.field2267, field693.field1298);
                var23.field2335.method5340(arg3);
                var23.field2335.method5155(class46.field399[82] ? 1 : 0);
                field693.method2109(var23);
            }
        }
        if (arg2 == 13) {
            class80 var24 = field688[arg3];
            if (var24 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var25 = class188.method2887(class184.field2231, field693.field1298);
                var25.field2335.method5156(class46.field399[82] ? 1 : 0);
                var25.field2335.method5114(arg3);
                field693.method2109(var25);
            }
        }
        if (arg2 == 21) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var26 = class188.method2887(class184.field2228, field693.field1298);
            var26.field2335.method5164(Statics.field2367 + arg1);
            var26.field2335.method5164(arg3);
            var26.field2335.method5155(class46.field399[82] ? 1 : 0);
            var26.field2335.method5166(Statics.field1262 + arg0);
            field693.method2109(var26);
        }
        if (arg2 == 2) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var27 = class188.method2887(class184.field2224, field693.field1298);
            var27.field2335.method5177(Statics.field3652);
            var27.field2335.method5114(arg3);
            var27.field2335.method5114(field662);
            var27.field2335.method5157(class46.field399[82] ? 1 : 0);
            var27.field2335.method5114(Statics.field2367 + arg1);
            var27.field2335.method5164(Statics.field1262 + arg0);
            field693.method2109(var27);
        }
        if (arg2 == 39) {
            class188 var28 = class188.method2887(class184.field2254, field693.field1298);
            var28.field2335.method5166(arg3);
            var28.field2335.method5164(arg0);
            var28.field2335.method5175(arg1);
            field693.method2109(var28);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 3) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var29 = class188.method2887(class184.field2237, field693.field1298);
            var29.field2335.method5155(class46.field399[82] ? 1 : 0);
            var29.field2335.method5164(Statics.field2367 + arg1);
            var29.field2335.method5164(arg3);
            var29.field2335.method5340(Statics.field1262 + arg0);
            field693.method2109(var29);
        }
        if (arg2 == 44) {
            class67 var30 = field762[arg3];
            if (var30 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var31 = class188.method2887(class184.field2283, field693.field1298);
                var31.field2335.method5272(class46.field399[82] ? 1 : 0);
                var31.field2335.method5114(arg3);
                field693.method2109(var31);
            }
        }
        if (arg2 == 16) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var32 = class188.method2887(class184.field2273, field693.field1298);
            var32.field2335.method5166(Statics.field2367 + arg1);
            var32.field2335.method5166(Statics.field1262 + arg0);
            var32.field2335.method5177(Statics.field1061);
            var32.field2335.method5114(Statics.field607);
            var32.field2335.method5166(Statics.field2492);
            var32.field2335.method5157(class46.field399[82] ? 1 : 0);
            var32.field2335.method5166(arg3);
            field693.method2109(var32);
        }
        if (arg2 == 38) {
            method574();
            class218 var33 = class218.method3666(arg1);
            field826 = 1;
            Statics.field607 = arg0;
            Statics.field1061 = arg1;
            Statics.field2492 = arg3;
            method4409(var33);
            field841 = class82.method2132(16748608) + class256.method4164(arg3).field3407 + class82.method2132(16777215);
            if (field841 == null) {
                field841 = class225.field2775;
            }
            return;
        }
        if (arg2 == 37) {
            class188 var34 = class188.method2887(class184.field2227, field693.field1298);
            var34.field2335.method5177(arg1);
            var34.field2335.method5164(arg3);
            var34.field2335.method5340(arg0);
            field693.method2109(var34);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 32) {
            class188 var35 = class188.method2887(class184.field2251, field693.field1298);
            var35.field2335.method5164(arg0);
            var35.field2335.method5340(arg3);
            var35.field2335.method5164(field662);
            var35.field2335.method5175(arg1);
            var35.field2335.method5175(Statics.field3652);
            field693.method2109(var35);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 1004) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            class188 var36 = class188.method2887(class184.field2247, field693.field1298);
            var36.field2335.method5114(arg3);
            field693.method2109(var36);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field146.method5915(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 35) {
            class188 var37 = class188.method2887(class184.field2260, field693.field1298);
            var37.field2335.method5340(arg0);
            var37.field2335.method5166(arg3);
            var37.field2335.method5176(arg1);
            field693.method2109(var37);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 15) {
            class67 var38 = field762[arg3];
            if (var38 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var39 = class188.method2887(class184.field2221, field693.field1298);
                var39.field2335.method5114(field662);
                var39.field2335.method5272(class46.field399[82] ? 1 : 0);
                var39.field2335.method5176(Statics.field3652);
                var39.field2335.method5340(arg3);
                field693.method2109(var39);
            }
        }
        if (arg2 == 23) {
            if (field782) {
                Statics.field3111.method2929();
            } else {
                Statics.field3111.method2928(Statics.field2055, arg0, arg1, true);
            }
        }
        if (arg2 == 4) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var40 = class188.method2887(class184.field2245, field693.field1298);
            var40.field2335.method5114(Statics.field1262 + arg0);
            var40.field2335.method5156(class46.field399[82] ? 1 : 0);
            var40.field2335.method5114(arg3);
            var40.field2335.method5114(Statics.field2367 + arg1);
            field693.method2109(var40);
        }
        if (arg2 == 28) {
            class188 var41 = class188.method2887(class184.field2226, field693.field1298);
            var41.field2335.method5306(arg1);
            field693.method2109(var41);
            class218 var42 = class218.method3666(arg1);
            if (var42.field2666 != null && var42.field2666[0][0] == 5) {
                int var43 = var42.field2666[0][1];
                class213.field2534[var43] = 1 - class213.field2534[var43];
                method3360(var43);
            }
        }
        if (arg2 == 17) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var44 = class188.method2887(class184.field2263, field693.field1298);
            var44.field2335.method5176(Statics.field3652);
            var44.field2335.method5114(Statics.field2367 + arg1);
            var44.field2335.method5340(Statics.field1262 + arg0);
            var44.field2335.method5340(arg3);
            var44.field2335.method5340(field662);
            var44.field2335.method5157(class46.field399[82] ? 1 : 0);
            field693.method2109(var44);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var45 = Statics.method3658(arg1, arg0);
            if (var45 != null) {
                method1909(arg3, arg1, arg0, var45.field2626, arg5);
            }
        }
        if (arg2 == 26) {
            method701();
        }
        if (arg2 == 34) {
            class188 var46 = class188.method2887(class184.field2303, field693.field1298);
            var46.field2335.method5340(arg3);
            var46.field2335.method5166(arg0);
            var46.field2335.method5175(arg1);
            field693.method2109(var46);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 7) {
            class80 var47 = field688[arg3];
            if (var47 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var48 = class188.method2887(class184.field2207, field693.field1298);
                var48.field2335.method5155(class46.field399[82] ? 1 : 0);
                var48.field2335.method5340(arg3);
                var48.field2335.method5306(Statics.field1061);
                var48.field2335.method5166(Statics.field607);
                var48.field2335.method5166(Statics.field2492);
                field693.method2109(var48);
            }
        }
        if (arg2 == 33) {
            class188 var49 = class188.method2887(class184.field2292, field693.field1298);
            var49.field2335.method5166(arg0);
            var49.field2335.method5306(arg1);
            var49.field2335.method5166(arg3);
            field693.method2109(var49);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 1002) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            class188 var50 = class188.method2887(class184.field2229, field693.field1298);
            var50.field2335.method5164(arg3);
            field693.method2109(var50);
        }
        if (arg2 == 19) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var51 = class188.method2887(class184.field2298, field693.field1298);
            var51.field2335.method5164(Statics.field1262 + arg0);
            var51.field2335.method5272(class46.field399[82] ? 1 : 0);
            var51.field2335.method5340(arg3);
            var51.field2335.method5164(Statics.field2367 + arg1);
            field693.method2109(var51);
        }
        if (arg2 == 31) {
            class188 var52 = class188.method2887(class184.field2233, field693.field1298);
            var52.field2335.method5340(Statics.field2492);
            var52.field2335.method5340(Statics.field607);
            var52.field2335.method5177(arg1);
            var52.field2335.method5340(arg0);
            var52.field2335.method5166(arg3);
            var52.field2335.method5175(Statics.field1061);
            field693.method2109(var52);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 6) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var53 = class188.method2887(class184.field2295, field693.field1298);
            var53.field2335.method5340(Statics.field1262 + arg0);
            var53.field2335.method5340(Statics.field2367 + arg1);
            var53.field2335.method5156(class46.field399[82] ? 1 : 0);
            var53.field2335.method5164(arg3);
            field693.method2109(var53);
        }
        if (arg2 == 22) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var54 = class188.method2887(class184.field2302, field693.field1298);
            var54.field2335.method5340(Statics.field1262 + arg0);
            var54.field2335.method5166(arg3);
            var54.field2335.method5156(class46.field399[82] ? 1 : 0);
            var54.field2335.method5166(Statics.field2367 + arg1);
            field693.method2109(var54);
        }
        if (arg2 == 43) {
            class188 var55 = class188.method2887(class184.field2262, field693.field1298);
            var55.field2335.method5340(arg0);
            var55.field2335.method5164(arg3);
            var55.field2335.method5177(arg1);
            field693.method2109(var55);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 42) {
            class188 var56 = class188.method2887(class184.field2216, field693.field1298);
            var56.field2335.method5164(arg3);
            var56.field2335.method5175(arg1);
            var56.field2335.method5114(arg0);
            field693.method2109(var56);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 9) {
            class80 var57 = field688[arg3];
            if (var57 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var58 = class188.method2887(class184.field2280, field693.field1298);
                var58.field2335.method5340(arg3);
                var58.field2335.method5272(class46.field399[82] ? 1 : 0);
                field693.method2109(var58);
            }
        }
        if (arg2 == 20) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var59 = class188.method2887(class184.field2225, field693.field1298);
            var59.field2335.method5164(Statics.field1262 + arg0);
            var59.field2335.method5272(class46.field399[82] ? 1 : 0);
            var59.field2335.method5340(arg3);
            var59.field2335.method5164(Statics.field2367 + arg1);
            field693.method2109(var59);
        }
        if (arg2 == 1) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var60 = class188.method2887(class184.field2268, field693.field1298);
            var60.field2335.method5340(Statics.field607);
            var60.field2335.method5164(Statics.field2492);
            var60.field2335.method5166(arg3);
            var60.field2335.method5157(class46.field399[82] ? 1 : 0);
            var60.field2335.method5166(Statics.field2367 + arg1);
            var60.field2335.method5176(Statics.field1061);
            var60.field2335.method5164(Statics.field1262 + arg0);
            field693.method2109(var60);
        }
        if (arg2 == 25) {
            class218 var61 = Statics.method3658(arg1, arg0);
            if (var61 != null) {
                method574();
                method3551(arg1, arg0, class219.method1927(method188(var61)), var61.field2626);
                field826 = 0;
                field804 = method2320(var61);
                if (field804 == null) {
                    field804 = class225.field2775;
                }
                if (var61.field2572) {
                    field805 = var61.field2593 + class82.method2132(16777215);
                } else {
                    field805 = class82.method2132(65280) + var61.field2695 + class82.method2132(16777215);
                }
            }
            return;
        }
        if (arg2 == 40) {
            class188 var62 = class188.method2887(class184.field2269, field693.field1298);
            var62.field2335.method5176(arg1);
            var62.field2335.method5166(arg3);
            var62.field2335.method5164(arg0);
            field693.method2109(var62);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 36) {
            class188 var63 = class188.method2887(class184.field2249, field693.field1298);
            var63.field2335.method5175(arg1);
            var63.field2335.method5164(arg0);
            var63.field2335.method5164(arg3);
            field693.method2109(var63);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 41) {
            class188 var64 = class188.method2887(class184.field2270, field693.field1298);
            var64.field2335.method5177(arg1);
            var64.field2335.method5340(arg0);
            var64.field2335.method5340(arg3);
            field693.method2109(var64);
            field752 = 0;
            Statics.field1794 = class218.method3666(arg1);
            field753 = arg0;
        }
        if (arg2 == 47) {
            class67 var65 = field762[arg3];
            if (var65 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var66 = class188.method2887(class184.field2217, field693.field1298);
                var66.field2335.method5272(class46.field399[82] ? 1 : 0);
                var66.field2335.method5164(arg3);
                field693.method2109(var66);
            }
        }
        if (arg2 == 11) {
            class80 var67 = field688[arg3];
            if (var67 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var68 = class188.method2887(class184.field2239, field693.field1298);
                var68.field2335.method5114(arg3);
                var68.field2335.method5157(class46.field399[82] ? 1 : 0);
                field693.method2109(var68);
            }
        }
        if (arg2 == 45) {
            class67 var69 = field762[arg3];
            if (var69 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var70 = class188.method2887(class184.field2297, field693.field1298);
                var70.field2335.method5340(arg3);
                var70.field2335.method5155(class46.field399[82] ? 1 : 0);
                field693.method2109(var70);
            }
        }
        if (arg2 == 49) {
            class67 var71 = field762[arg3];
            if (var71 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var72 = class188.method2887(class184.field2222, field693.field1298);
                var72.field2335.method5340(arg3);
                var72.field2335.method5272(class46.field399[82] ? 1 : 0);
                field693.method2109(var72);
            }
        }
        if (arg2 == 29) {
            class188 var73 = class188.method2887(class184.field2226, field693.field1298);
            var73.field2335.method5306(arg1);
            field693.method2109(var73);
            class218 var74 = class218.method3666(arg1);
            if (var74.field2666 != null && var74.field2666[0][0] == 5) {
                int var75 = var74.field2666[0][1];
                if (class213.field2534[var75] != var74.field2693[0]) {
                    class213.field2534[var75] = var74.field2693[0];
                    method3360(var75);
                }
            }
        }
        if (arg2 == 51) {
            class67 var76 = field762[arg3];
            if (var76 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var77 = class188.method2887(class184.field2244, field693.field1298);
                var77.field2335.method5156(class46.field399[82] ? 1 : 0);
                var77.field2335.method5340(arg3);
                field693.method2109(var77);
            }
        }
        if (arg2 == 24) {
            class218 var78 = class218.method3666(arg1);
            boolean var79 = true;
            if (var78.field2577 > 0) {
                var79 = method5432(var78);
            }
            if (var79) {
                class188 var80 = class188.method2887(class184.field2226, field693.field1298);
                var80.field2335.method5306(arg1);
                field693.method2109(var80);
            }
        }
        if (arg2 == 1003) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            class80 var81 = field688[arg3];
            if (var81 != null) {
                class258 var82 = var81.field1120;
                if (var82.field3490 != null) {
                    var82 = var82.method4391();
                }
                if (var82 != null) {
                    class188 var83 = class188.method2887(class184.field2259, field693.field1298);
                    var83.field2335.method5166(var82.field3475);
                    field693.method2109(var83);
                }
            }
        }
        if (arg2 == 18) {
            field747 = arg6;
            field802 = arg7;
            field750 = 2;
            field749 = 0;
            field877 = arg0;
            field878 = arg1;
            class188 var84 = class188.method2887(class184.field2232, field693.field1298);
            var84.field2335.method5340(Statics.field1262 + arg0);
            var84.field2335.method5114(arg3);
            var84.field2335.method5156(class46.field399[82] ? 1 : 0);
            var84.field2335.method5164(Statics.field2367 + arg1);
            field693.method2109(var84);
        }
        if (arg2 == 10) {
            class80 var85 = field688[arg3];
            if (var85 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var86 = class188.method2887(class184.field2212, field693.field1298);
                var86.field2335.method5166(arg3);
                var86.field2335.method5157(class46.field399[82] ? 1 : 0);
                field693.method2109(var86);
            }
        }
        if (arg2 == 46) {
            class67 var87 = field762[arg3];
            if (var87 != null) {
                field747 = arg6;
                field802 = arg7;
                field750 = 2;
                field749 = 0;
                field877 = arg0;
                field878 = arg1;
                class188 var88 = class188.method2887(class184.field2301, field693.field1298);
                var88.field2335.method5340(arg3);
                var88.field2335.method5155(class46.field399[82] ? 1 : 0);
                field693.method2109(var88);
            }
        }
        if (field826 != 0) {
            field826 = 0;
            method4409(class218.method3666(Statics.field1061));
        }
        if (field650) {
            method574();
        }
        if (Statics.field1794 != null && field752 == 0) {
            method4409(Statics.field1794);
        }
    }

    @ObfuscatedName("gu.ii(IIIIB)V")
    public static void method3551(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = Statics.method3658(arg0, arg1);
        if (var4 != null && var4.field2658 != null) {
            class63 var5 = new class63();
            var5.field574 = var4;
            var5.field585 = var4.field2658;
            class77.method46(var5);
        }
        field803 = arg3;
        field650 = true;
        Statics.field3652 = arg0;
        field662 = arg1;
        Statics.field2061 = arg2;
        method4409(var4);
    }

    @ObfuscatedName("ak.ik(B)V")
    public static void method574() {
        if (!field650) {
            return;
        }
        class218 var0 = Statics.method3658(Statics.field3652, field662);
        if (var0 != null && var0.field2661 != null) {
            class63 var1 = new class63();
            var1.field574 = var0;
            var1.field585 = var0.field2661;
            class77.method46(var1);
        }
        field650 = false;
        method4409(var0);
    }

    @ObfuscatedName("aw.ia(III)V")
    public static void method576(int arg0, int arg1) {
        class188 var2 = class188.method2887(class184.field2257, field693.field1298);
        var2.field2335.method5164(arg1);
        var2.field2335.method5306(arg0);
        field693.method2109(var2);
    }

    @ObfuscatedName("cg.ib(IIIILjava/lang/String;I)V")
    public static void method1909(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = Statics.method3658(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2621 != null) {
            class63 var6 = new class63();
            var6.field574 = var5;
            var6.field580 = arg0;
            var6.field581 = arg4;
            var6.field585 = var5.field2621;
            class77.method46(var6);
        }
        boolean var7 = true;
        if (var5.field2577 > 0) {
            var7 = method5432(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method188(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class188 var11 = class188.method2887(class184.field2235, field693.field1298);
            var11.field2335.method5306(arg1);
            var11.field2335.method5114(arg2);
            var11.field2335.method5114(arg3);
            field693.method2109(var11);
        }
        if (arg0 == 2) {
            class188 var12 = class188.method2887(class184.field2210, field693.field1298);
            var12.field2335.method5306(arg1);
            var12.field2335.method5114(arg2);
            var12.field2335.method5114(arg3);
            field693.method2109(var12);
        }
        if (arg0 == 3) {
            class188 var13 = class188.method2887(class184.field2206, field693.field1298);
            var13.field2335.method5306(arg1);
            var13.field2335.method5114(arg2);
            var13.field2335.method5114(arg3);
            field693.method2109(var13);
        }
        if (arg0 == 4) {
            class188 var14 = class188.method2887(class184.field2274, field693.field1298);
            var14.field2335.method5306(arg1);
            var14.field2335.method5114(arg2);
            var14.field2335.method5114(arg3);
            field693.method2109(var14);
        }
        if (arg0 == 5) {
            class188 var15 = class188.method2887(class184.field2238, field693.field1298);
            var15.field2335.method5306(arg1);
            var15.field2335.method5114(arg2);
            var15.field2335.method5114(arg3);
            field693.method2109(var15);
        }
        if (arg0 == 6) {
            class188 var16 = class188.method2887(class184.field2258, field693.field1298);
            var16.field2335.method5306(arg1);
            var16.field2335.method5114(arg2);
            var16.field2335.method5114(arg3);
            field693.method2109(var16);
        }
        if (arg0 == 7) {
            class188 var17 = class188.method2887(class184.field2205, field693.field1298);
            var17.field2335.method5306(arg1);
            var17.field2335.method5114(arg2);
            var17.field2335.method5114(arg3);
            field693.method2109(var17);
        }
        if (arg0 == 8) {
            class188 var18 = class188.method2887(class184.field2255, field693.field1298);
            var18.field2335.method5306(arg1);
            var18.field2335.method5114(arg2);
            var18.field2335.method5114(arg3);
            field693.method2109(var18);
        }
        if (arg0 == 9) {
            class188 var19 = class188.method2887(class184.field2213, field693.field1298);
            var19.field2335.method5306(arg1);
            var19.field2335.method5114(arg2);
            var19.field2335.method5114(arg3);
            field693.method2109(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var20 = class188.method2887(class184.field2304, field693.field1298);
        var20.field2335.method5306(arg1);
        var20.field2335.method5114(arg2);
        var20.field2335.method5114(arg3);
        field693.method2109(var20);
    }

    @ObfuscatedName("by.in(B)V")
    public static final void method1039() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field649 - 1; var1++) {
                if (field786[var1] < 1000 && field786[var1 + 1] > 1000) {
                    String var2 = field689[var1];
                    field689[var1] = field689[var1 + 1];
                    field689[var1 + 1] = var2;
                    String var3 = field654[var1];
                    field654[var1] = field654[var1 + 1];
                    field654[var1 + 1] = var3;
                    int var4 = field786[var1];
                    field786[var1] = field786[var1 + 1];
                    field786[var1 + 1] = var4;
                    int var5 = field761[var1];
                    field761[var1] = field761[var1 + 1];
                    field761[var1 + 1] = var5;
                    int var6 = field785[var1];
                    field785[var1] = field785[var1 + 1];
                    field785[var1 + 1] = var6;
                    int var7 = field787[var1];
                    field787[var1] = field787[var1 + 1];
                    field787[var1 + 1] = var7;
                    boolean var8 = field790[var1];
                    field790[var1] = field790[var1 + 1];
                    field790[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("br.ic(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method1888(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3220(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fn.id(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3220(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field782 || field649 >= 500) {
            return;
        }
        field654[field649] = arg0;
        field689[field649] = arg1;
        field786[field649] = arg2;
        field787[field649] = arg3;
        field761[field649] = arg4;
        field785[field649] = arg5;
        field790[field649] = arg6;
        field649++;
    }

    @ObfuscatedName("ea.ij(B)V")
    public static void method3075() {
        for (int var0 = 0; var0 < field649; var0++) {
            int var1 = field786[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field649 - 1) {
                    for (int var3 = var0; var3 < field649 - 1; var3++) {
                        field654[var3] = field654[var3 + 1];
                        field689[var3] = field689[var3 + 1];
                        field786[var3] = field786[var3 + 1];
                        field787[var3] = field787[var3 + 1];
                        field761[var3] = field761[var3 + 1];
                        field785[var3] = field785[var3 + 1];
                        field790[var3] = field790[var3 + 1];
                    }
                }
                var0--;
                field649--;
            }
        }
        int var4 = Statics.field567 / 2 + Statics.field3126;
        int var5 = Statics.field534;
        int var6 = Statics.field1.method4977(class225.field2924);
        for (int var7 = 0; var7 < field649; var7++) {
            int var8 = Statics.field1.method4977(method4027(var7));
            if (var8 > var6) {
                var6 = var8;
            }
        }
        var6 += 8;
        int var9 = field649 * 15 + 22;
        int var10 = var4 - var6 / 2;
        if (var6 + var10 > Statics.field3615) {
            var10 = Statics.field3615 - var6;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var5;
        if (var9 + var5 > Statics.field345) {
            var11 = Statics.field345 - var9;
        }
        if (var11 < 0) {
            var11 = 0;
        }
        Statics.field3126 = var10;
        Statics.field534 = var11;
        Statics.field567 = var6;
        Statics.field598 = field649 * 15 + 22;
    }

    @ObfuscatedName("ic.im(IB)Ljava/lang/String;")
    public static String method4027(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field689[arg0].length() > 0) {
            return field654[arg0] + class225.field2894 + field689[arg0];
        } else {
            return field654[arg0];
        }
    }

    @ObfuscatedName("y.ie(IIIII)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3) {
        if (field826 == 0 && !field650) {
            method1888(class225.field2926, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1736;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class129.method76(var4);
                    int var12 = class129.method149(var4);
                    class67 var13 = field762[field759];
                    method3405(var13, field759, var11, var12);
                }
                return;
            }
            long var14 = class129.method2799(var8);
            if (var6 != var14) {
                label277: {
                    var6 = var14;
                    int var16 = class129.method108(var8);
                    int var17 = class129.method669(var8);
                    int var18 = class129.method2662(class129.field1733[var8]);
                    int var20 = class129.method65(class129.field1733[var8]);
                    int var21 = var20;
                    if (var18 == 2 && Statics.field3111.method2921(Statics.field2055, var16, var17, var14) >= 0) {
                        class255 var22 = class255.method3070(var20);
                        if (var22.field3386 != null) {
                            var22 = var22.method4304();
                        }
                        if (var22 == null) {
                            break label277;
                        }
                        if (field826 == 1) {
                            method1888(class225.field2921, field841 + " " + class82.field1133 + " " + class82.method2132(65535) + var22.field3355, 1, var20, var16, var17);
                        } else if (!field650) {
                            String[] var23 = var22.field3394;
                            if (var23 != null) {
                                for (int var24 = 4; var24 >= 0; var24--) {
                                    if (var23[var24] != null) {
                                        short var25 = 0;
                                        if (var24 == 0) {
                                            var25 = 3;
                                        }
                                        if (var24 == 1) {
                                            var25 = 4;
                                        }
                                        if (var24 == 2) {
                                            var25 = 5;
                                        }
                                        if (var24 == 3) {
                                            var25 = 6;
                                        }
                                        if (var24 == 4) {
                                            var25 = 1001;
                                        }
                                        method1888(var23[var24], class82.method2132(65535) + var22.field3355, var25, var21, var16, var17);
                                    }
                                }
                            }
                            method1888(class225.field2922, class82.method2132(65535) + var22.field3355, 1002, var22.field3369, var16, var17);
                        } else if ((Statics.field2061 & 0x4) == 4) {
                            method1888(field804, field805 + " " + class82.field1133 + " " + class82.method2132(65535) + var22.field3355, 2, var20, var16, var17);
                        }
                    }
                    if (var18 == 1) {
                        class80 var26 = field688[var21];
                        if (var26 == null) {
                            break label277;
                        }
                        if (var26.field1120.field3484 == 1 && (var26.field983 & 0x7F) == 64 && (var26.field940 & 0x7F) == 64) {
                            for (int var27 = 0; var27 < field880; var27++) {
                                class80 var28 = field688[field690[var27]];
                                if (var28 != null && var26 != var28 && var28.field1120.field3484 == 1 && var26.field983 == var28.field983 && var26.field940 == var28.field940) {
                                    method4380(var28.field1120, field690[var27], var16, var17);
                                }
                            }
                            int var29 = class90.field1247;
                            int[] var30 = class90.field1241;
                            for (int var31 = 0; var31 < var29; var31++) {
                                class67 var32 = field762[var30[var31]];
                                if (var32 != null && var26.field983 == var32.field983 && var26.field940 == var32.field940) {
                                    method3405(var32, var30[var31], var16, var17);
                                }
                            }
                        }
                        method4380(var26.field1120, var21, var16, var17);
                    }
                    if (var18 == 0) {
                        class67 var33 = field762[var21];
                        if (var33 == null) {
                            break label277;
                        }
                        if ((var33.field983 & 0x7F) == 64 && (var33.field940 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < field880; var34++) {
                                class80 var35 = field688[field690[var34]];
                                if (var35 != null && var35.field1120.field3484 == 1 && var33.field983 == var35.field983 && var33.field940 == var35.field940) {
                                    method4380(var35.field1120, field690[var34], var16, var17);
                                }
                            }
                            int var36 = class90.field1247;
                            int[] var37 = class90.field1241;
                            for (int var38 = 0; var38 < var36; var38++) {
                                class67 var39 = field762[var37[var38]];
                                if (var39 != null && var33 != var39 && var33.field983 == var39.field983 && var33.field940 == var39.field940) {
                                    method3405(var39, var37[var38], var16, var17);
                                }
                            }
                        }
                        if (field759 == var21) {
                            var4 = var14;
                        } else {
                            method3405(var33, var21, var16, var17);
                        }
                    }
                    if (var18 == 3) {
                        class263 var40 = field799[Statics.field2055][var16][var17];
                        if (var40 != null) {
                            for (class88 var41 = (class88) var40.method4551(); var41 != null; var41 = (class88) var40.method4553()) {
                                class256 var42 = class256.method4164(var41.field1226);
                                if (field826 == 1) {
                                    method1888(class225.field2921, field841 + " " + class82.field1133 + " " + class82.method2132(16748608) + var42.field3407, 16, var41.field1226, var16, var17);
                                } else if (!field650) {
                                    String[] var43 = var42.field3421;
                                    for (int var44 = 4; var44 >= 0; var44--) {
                                        if (var43 != null && var43[var44] != null) {
                                            byte var45 = 0;
                                            if (var44 == 0) {
                                                var45 = 18;
                                            }
                                            if (var44 == 1) {
                                                var45 = 19;
                                            }
                                            if (var44 == 2) {
                                                var45 = 20;
                                            }
                                            if (var44 == 3) {
                                                var45 = 21;
                                            }
                                            if (var44 == 4) {
                                                var45 = 22;
                                            }
                                            method1888(var43[var44], class82.method2132(16748608) + var42.field3407, var45, var41.field1226, var16, var17);
                                        } else if (var44 == 2) {
                                            method1888(class225.field2853, class82.method2132(16748608) + var42.field3407, 20, var41.field1226, var16, var17);
                                        }
                                    }
                                    method1888(class225.field2922, class82.method2132(16748608) + var42.field3407, 1004, var41.field1226, var16, var17);
                                } else if ((Statics.field2061 & 0x1) == 1) {
                                    method1888(field804, field805 + " " + class82.field1133 + " " + class82.method2132(16748608) + var42.field3407, 17, var41.field1226, var16, var17);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("ih.iu(Liz;IIII)V")
    public static final void method4380(class258 arg0, int arg1, int arg2, int arg3) {
        if (field649 >= 400) {
            return;
        }
        if (arg0.field3490 != null) {
            arg0 = arg0.method4391();
        }
        if (arg0 == null || !arg0.field3483 || arg0.field3473 && field817 != arg1) {
            return;
        }
        String var4 = arg0.field3464;
        if (arg0.field3479 != 0) {
            int var6 = arg0.field3479;
            int var7 = Statics.field2392.field618;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method2132(16711680);
            } else if (var8 < -6) {
                var9 = class82.method2132(16723968);
            } else if (var8 < -3) {
                var9 = class82.method2132(16740352);
            } else if (var8 < 0) {
                var9 = class82.method2132(16756736);
            } else if (var8 > 9) {
                var9 = class82.method2132(65280);
            } else if (var8 > 6) {
                var9 = class82.method2132(4259584);
            } else if (var8 > 3) {
                var9 = class82.method2132(8453888);
            } else if (var8 > 0) {
                var9 = class82.method2132(12648192);
            } else {
                var9 = class82.method2132(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1136 + class225.field2927 + arg0.field3479 + class82.field1137;
        }
        if (arg0.field3473 && field850) {
            method1888(class225.field2922, class82.method2132(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field826 == 1) {
            method1888(class225.field2921, field841 + " " + class82.field1133 + " " + class82.method2132(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field650) {
            int var10 = arg0.field3473 && field850 ? 2000 : 0;
            String[] var11 = arg0.field3480;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class225.field2923)) {
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
                        method1888(var11[var12], class82.method2132(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class225.field2923)) {
                        short var15 = 0;
                        if (field902 != class85.field1158) {
                            if (field902 == class85.field1155 || field902 == class85.field1159 && arg0.field3479 > Statics.field2392.field618) {
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
                            method1888(var11[var14], class82.method2132(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3473 || !field850) {
                method1888(class225.field2922, class82.method2132(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2061 & 0x2) == 2) {
            method1888(field804, field805 + " " + class82.field1133 + " " + class82.method2132(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gx.ix(Lba;IIII)V")
    public static final void method3405(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2392 == arg0 || field649 >= 400) {
            return;
        }
        String var9;
        if (arg0.field619 == 0) {
            String var4 = arg0.field617[0] + arg0.field626 + arg0.field617[1];
            int var5 = arg0.field618;
            int var6 = Statics.field2392.field618;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method2132(16711680);
            } else if (var7 < -6) {
                var8 = class82.method2132(16723968);
            } else if (var7 < -3) {
                var8 = class82.method2132(16740352);
            } else if (var7 < 0) {
                var8 = class82.method2132(16756736);
            } else if (var7 > 9) {
                var8 = class82.method2132(65280);
            } else if (var7 > 6) {
                var8 = class82.method2132(4259584);
            } else if (var7 > 3) {
                var8 = class82.method2132(8453888);
            } else if (var7 > 0) {
                var8 = class82.method2132(12648192);
            } else {
                var8 = class82.method2132(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1136 + class225.field2927 + arg0.field618 + class82.field1137 + arg0.field617[2];
        } else {
            var9 = arg0.field617[0] + arg0.field626 + arg0.field617[1] + " " + class82.field1136 + class225.field2928 + arg0.field619 + class82.field1137 + arg0.field617[2];
        }
        if (field826 == 1) {
            method1888(class225.field2921, field841 + " " + class82.field1133 + " " + class82.method2132(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field650) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field770[var10] != null) {
                    short var11 = 0;
                    if (field770[var10].equalsIgnoreCase(class225.field2923)) {
                        if (field672 == class85.field1158) {
                            continue;
                        }
                        if (field672 == class85.field1155 || field672 == class85.field1159 && arg0.field618 > Statics.field2392.field618) {
                            var11 = 2000;
                        }
                        if (Statics.field2392.field638 != 0 && arg0.field638 != 0) {
                            if (Statics.field2392.field638 == arg0.field638) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field771[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field874[var10] + var11;
                    method1888(field770[var10], class82.method2132(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2061 & 0x8) == 8) {
            method1888(field804, field805 + " " + class82.field1133 + " " + class82.method2132(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field649; var14++) {
            if (field786[var14] == 23) {
                field689[var14] = class82.method2132(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ig.iy([Lhn;IIIIIIIIB)V")
    public static final void method4432(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class322.method5582(arg2, arg3, arg4, arg5);
        class131.method2801();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2592 == arg1 || arg1 == -1412584499 && field651 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field748[field791] = var10.field2586 + arg6;
                    field645[field791] = var10.field2672 + arg7;
                    field857[field791] = var10.field2619;
                    field858[field791] = var10.field2589;
                    var11 = ++field791 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2710 = var11;
                var10.field2694 = field656;
                if (!var10.field2572 || !method4085(var10)) {
                    if (var10.field2577 > 0) {
                        method73(var10);
                    }
                    int var12 = var10.field2586 + arg6;
                    int var13 = var10.field2672 + arg7;
                    int var14 = var10.field2604;
                    if (field651 == var10) {
                        if (arg1 != -1412584499 && !var10.field2708) {
                            Statics.field1867 = arg0;
                            Statics.field143 = arg6;
                            Statics.field1966 = arg7;
                            continue;
                        }
                        if (field831 && field825) {
                            int var15 = class55.field494;
                            int var16 = class55.field492;
                            int var17 = var15 - field838;
                            int var18 = var16 - field823;
                            if (var17 < field920) {
                                var17 = field920;
                            }
                            if (var10.field2619 + var17 > field920 + field821.field2619) {
                                var17 = field920 + field821.field2619 - var10.field2619;
                            }
                            if (var18 < field827) {
                                var18 = field827;
                            }
                            if (var10.field2589 + var18 > field827 + field821.field2589) {
                                var18 = field827 + field821.field2589 - var10.field2589;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2708) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2575 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2575 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2619 + var12;
                        int var26 = var10.field2589 + var13;
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
                        int var29 = var10.field2619 + var12;
                        int var30 = var10.field2589 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2572 || var19 < var21 && var20 < var22) {
                        if (var10.field2577 != 0) {
                            if (var10.field2577 == 1336) {
                                if (field709) {
                                    var13 += 15;
                                    Statics.field97.method4984("Fps:" + field451, var10.field2619 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field844) {
                                        var33 = 16711680;
                                    }
                                    Statics.field97.method4984("Mem:" + var32 + "k", var10.field2619 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2577 == 1337) {
                                field795 = var12;
                                field864 = var13;
                                method518(var12, var13, var10.field2619, var10.field2589);
                                field852[var10.field2710] = true;
                                class322.method5582(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2577 == 1338) {
                                method441(var10, var12, var13, var11);
                                class322.method5582(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2577 == 1339) {
                                method3171(var10, var12, var13, var11);
                                class322.method5582(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2577 == 1400) {
                                Statics.field146.method5878(var12, var13, var10.field2619, var10.field2589, field656);
                            }
                            if (var10.field2577 == 1401) {
                                Statics.field146.method5941(var12, var13, var10.field2619, var10.field2589);
                            }
                            if (var10.field2577 == 1402) {
                                Statics.field134.method1635(var12, field656);
                            }
                        }
                        if (var10.field2575 == 0) {
                            if (!var10.field2572 && method4085(var10) && Statics.field69 != var10) {
                                continue;
                            }
                            if (!var10.field2572) {
                                if (var10.field2622 > var10.field2597 - var10.field2589) {
                                    var10.field2622 = var10.field2597 - var10.field2589;
                                }
                                if (var10.field2622 < 0) {
                                    var10.field2622 = 0;
                                }
                            }
                            method4432(arg0, var10.field2573, var19, var20, var21, var22, var12 - var10.field2594, var13 - var10.field2622, var11);
                            if (var10.field2699 != null) {
                                method4432(var10.field2699, var10.field2573, var19, var20, var21, var22, var12 - var10.field2594, var13 - var10.field2622, var11);
                            }
                            class62 var34 = (class62) field807.method5527((long) var10.field2573);
                            if (var34 != null) {
                                Statics.method3358(var34.field571, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class322.method5582(arg2, arg3, arg4, arg5);
                            class131.method2801();
                        }
                        if (field735 || field854[var11] || field910 > 1) {
                            if (var10.field2575 == 0 && !var10.field2572 && var10.field2597 > var10.field2589) {
                                method265(var10.field2619 + var12, var13, var10.field2622, var10.field2589, var10.field2597);
                            }
                            if (var10.field2575 != 1) {
                                if (var10.field2575 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2643; var36++) {
                                        for (int var37 = 0; var37 < var10.field2584; var37++) {
                                            int var38 = (var10.field2640 + 32) * var37 + var12;
                                            int var39 = (var10.field2641 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2642[var35];
                                                var39 += var10.field2629[var35];
                                            }
                                            if (var10.field2585[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2585[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2325 == var10 && field754 == var35) {
                                                    class326 var43;
                                                    if (field826 == 1 && Statics.field607 == var35 && Statics.field1061 == var10.field2573) {
                                                        var43 = Statics.method1932(var42, var10.field2662[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = Statics.method1932(var42, var10.field2662[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method4409(var10);
                                                    } else if (Statics.field2325 == var10 && field754 == var35) {
                                                        int var44 = class55.field494 - field755;
                                                        int var45 = class55.field492 - field756;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field659 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5696(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class322.field3847 && var46.field2622 > 0) {
                                                                int var47 = field708 * (class322.field3847 - var39 - var45) / 3;
                                                                if (var47 > field708 * 10) {
                                                                    var47 = field708 * 10;
                                                                }
                                                                if (var47 > var46.field2622) {
                                                                    var47 = var46.field2622;
                                                                }
                                                                var46.field2622 -= var47;
                                                                field756 += var47;
                                                                method4409(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class322.field3849 && var46.field2622 < var46.field2597 - var46.field2589) {
                                                                int var48 = field708 * (var39 + var45 + 32 - class322.field3849) / 3;
                                                                if (var48 > field708 * 10) {
                                                                    var48 = field708 * 10;
                                                                }
                                                                if (var48 > var46.field2597 - var46.field2589 - var46.field2622) {
                                                                    var48 = var46.field2597 - var46.field2589 - var46.field2622;
                                                                }
                                                                var46.field2622 += var48;
                                                                field756 -= var48;
                                                                method4409(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1794 == var10 && field753 == var35) {
                                                        var43.method5696(var38, var39, 128);
                                                    } else {
                                                        var43.method5785(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2688 != null && var35 < 20) {
                                                class326 var49 = var10.method3741(var35);
                                                if (var49 != null) {
                                                    var49.method5785(var38, var39);
                                                } else if (class218.field2698) {
                                                    method4409(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2575 == 3) {
                                    int var50;
                                    if (method1012(var10)) {
                                        var50 = var10.field2599;
                                        if (Statics.field69 == var10 && var10.field2669 != 0) {
                                            var50 = var10.field2669;
                                        }
                                    } else {
                                        var50 = var10.field2601;
                                        if (Statics.field69 == var10 && var10.field2600 != 0) {
                                            var50 = var10.field2600;
                                        }
                                    }
                                    if (var10.field2602) {
                                        switch(var10.field2603.field3857) {
                                            case 1:
                                                class322.method5591(var12, var13, var10.field2619, var10.field2589, var10.field2601, var10.field2599);
                                                break;
                                            case 2:
                                                class322.method5642(var12, var13, var10.field2619, var10.field2589, var10.field2601, var10.field2599, 255 - (var10.field2604 & 0xFF), 255 - (var10.field2605 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class322.method5590(var12, var13, var10.field2619, var10.field2589, var50);
                                                } else {
                                                    class322.method5589(var12, var13, var10.field2619, var10.field2589, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class322.method5626(var12, var13, var10.field2619, var10.field2589, var50);
                                    } else {
                                        class322.method5595(var12, var13, var10.field2619, var10.field2589, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2575 == 4) {
                                    class296 var51 = var10.method3770();
                                    if (var51 != null) {
                                        String var52 = var10.field2634;
                                        int var53;
                                        if (method1012(var10)) {
                                            var53 = var10.field2599;
                                            if (Statics.field69 == var10 && var10.field2669 != 0) {
                                                var53 = var10.field2669;
                                            }
                                            if (var10.field2635.length() > 0) {
                                                var52 = var10.field2635;
                                            }
                                        } else {
                                            var53 = var10.field2601;
                                            if (Statics.field69 == var10 && var10.field2600 != 0) {
                                                var53 = var10.field2600;
                                            }
                                        }
                                        if (var10.field2572 && var10.field2626 != -1) {
                                            class256 var54 = class256.method4164(var10.field2626);
                                            var52 = var54.field3407;
                                            if (var52 == null) {
                                                var52 = class225.field2775;
                                            }
                                            if ((var54.field3418 == 1 || var10.field2700 != 1) && var10.field2700 != -1) {
                                                var52 = class82.method2132(16748608) + var52 + class82.field1140 + " " + 'x' + method534(var10.field2700);
                                            }
                                        }
                                        if (field813 == var10) {
                                            var52 = class225.field2929;
                                            var53 = var10.field2601;
                                        }
                                        if (!var10.field2572) {
                                            var52 = method949(var52, var10);
                                        }
                                        var51.method4986(var52, var12, var13, var10.field2619, var10.field2589, var53, var10.field2639 ? 0 : -1, var10.field2637, var10.field2638, var10.field2636);
                                    } else if (class218.field2698) {
                                        method4409(var10);
                                    }
                                } else if (var10.field2575 == 5) {
                                    if (var10.field2572) {
                                        class326 var56;
                                        if (var10.field2626 == -1) {
                                            var56 = var10.method3762(false);
                                        } else {
                                            var56 = Statics.method1932(var10.field2626, var10.field2700, var10.field2612, var10.field2613, var10.field2632, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3874;
                                            int var58 = var56.field3876;
                                            if (var10.field2611) {
                                                class322.method5583(var12, var13, var10.field2619 + var12, var10.field2589 + var13);
                                                int var59 = (var10.field2619 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2589 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2610 != 0) {
                                                            var56.method5713(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2610, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5785(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5696(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class322.method5582(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2619 * 4096 / var57;
                                                if (var10.field2610 != 0) {
                                                    var56.method5713(var10.field2619 / 2 + var12, var10.field2589 / 2 + var13, var10.field2610, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5789(var12, var13, var10.field2619, var10.field2589, 256 - (var14 & 0xFF));
                                                } else if (var10.field2619 == var57 && var10.field2589 == var58) {
                                                    var56.method5785(var12, var13);
                                                } else {
                                                    var56.method5738(var12, var13, var10.field2619, var10.field2589);
                                                }
                                            }
                                        } else if (class218.field2698) {
                                            method4409(var10);
                                        }
                                    } else {
                                        class326 var55 = var10.method3762(method1012(var10));
                                        if (var55 != null) {
                                            var55.method5785(var12, var13);
                                        } else if (class218.field2698) {
                                            method4409(var10);
                                        }
                                    }
                                } else if (var10.field2575 == 6) {
                                    boolean var64 = method1012(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2690;
                                    } else {
                                        var65 = var10.field2620;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2626 != -1) {
                                        class256 var68 = class256.method4164(var10.field2626);
                                        if (var68 != null) {
                                            class256 var69 = var68.method4367(var10.field2700);
                                            var66 = var69.method4330(1);
                                            if (var66 == null) {
                                                method4409(var10);
                                            } else {
                                                var66.method2722();
                                                var67 = var66.field1869 / 2;
                                            }
                                        }
                                    } else if (var10.field2616 == 5) {
                                        if (var10.field2617 == 0) {
                                            var66 = field919.method3694((class260) null, -1, (class260) null, -1);
                                        } else {
                                            var66 = Statics.field2392.method1118();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3760((class260) null, -1, var64, Statics.field2392.field612);
                                        if (var66 == null && class218.field2698) {
                                            method4409(var10);
                                        }
                                    } else {
                                        class260 var70 = class260.method5476(var65);
                                        var66 = var10.method3760(var70, var10.field2701, var64, Statics.field2392.field612);
                                        if (var66 == null && class218.field2698) {
                                            method4409(var10);
                                        }
                                    }
                                    class131.method2837(var10.field2619 / 2 + var12, var10.field2589 / 2 + var13);
                                    int var71 = var10.field2627 * class131.field1780[var10.field2624] >> 16;
                                    int var72 = var10.field2627 * class131.field1781[var10.field2624] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2572) {
                                            var66.method2722();
                                            if (var10.field2630) {
                                                var66.method2674(0, var10.field2625, var10.field2588, var10.field2624, var10.field2645, var10.field2623 + var67 + var71, var10.field2623 + var72, var10.field2627);
                                            } else {
                                                var66.method2682(0, var10.field2625, var10.field2588, var10.field2624, var10.field2645, var10.field2623 + var67 + var71, var10.field2623 + var72);
                                            }
                                        } else {
                                            var66.method2682(0, var10.field2625, 0, var10.field2624, 0, var71, var72);
                                        }
                                    }
                                    class131.method2803();
                                } else {
                                    if (var10.field2575 == 7) {
                                        class296 var73 = var10.method3770();
                                        if (var73 == null) {
                                            if (class218.field2698) {
                                                method4409(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2643; var75++) {
                                            for (int var76 = 0; var76 < var10.field2584; var76++) {
                                                if (var10.field2585[var74] > 0) {
                                                    class256 var77 = class256.method4164(var10.field2585[var74] - 1);
                                                    String var78;
                                                    if (var77.field3418 != 1 && var10.field2662[var74] == 1) {
                                                        var78 = class82.method2132(16748608) + var77.field3407 + class82.field1140;
                                                    } else {
                                                        var78 = class82.method2132(16748608) + var77.field3407 + class82.field1140 + " " + 'x' + method534(var10.field2662[var74]);
                                                    }
                                                    int var79 = (var10.field2640 + 115) * var76 + var12;
                                                    int var80 = (var10.field2641 + 12) * var75 + var13;
                                                    if (var10.field2637 == 0) {
                                                        var73.method5026(var78, var79, var80, var10.field2601, var10.field2639 ? 0 : -1);
                                                    } else if (var10.field2637 == 1) {
                                                        var73.method5006(var78, var10.field2619 / 2 + var79, var80, var10.field2601, var10.field2639 ? 0 : -1);
                                                    } else {
                                                        var73.method4984(var78, var10.field2619 + var79 - 1, var80, var10.field2601, var10.field2639 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2575 == 8 && Statics.field3297 == var10 && field798 == field797) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class296 var83 = Statics.field97;
                                        String var84 = var10.field2634;
                                        String var85 = method949(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1138);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4977(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3680 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2619 + var12 - 5 - var81;
                                        int var90 = var10.field2589 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class322.method5590(var89, var90, var81, var82, 16777120);
                                        class322.method5626(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2634;
                                        int var92 = var83.field3680 + var90 + 2;
                                        String var93 = method949(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1138);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5026(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3680 + 1;
                                        }
                                    }
                                    if (var10.field2575 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2607) {
                                            var96 = var12;
                                            var97 = var10.field2589 + var13;
                                            var98 = var10.field2619 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2619 + var12;
                                            var99 = var10.field2589 + var13;
                                        }
                                        if (var10.field2652 == 1) {
                                            class322.method5600(var96, var97, var98, var99, var10.field2601);
                                        } else {
                                            method54(var96, var97, var98, var99, var10.field2601, var10.field2652);
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

    @ObfuscatedName("g.iv(IIIIIIB)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class322.field3844;
        int var18 = arg1 - class322.field3847;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2802(var19, var20, var21);
        class131.method2859(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2802(var19, var21, var22);
        class131.method2859(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bc.iq(Ljava/lang/String;Lhn;I)Ljava/lang/String;")
    public static String method949(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method508(method86(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("as.is(II)Ljava/lang/String;")
    public static final String method534(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1134 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method2132(65408) + var1.substring(0, var1.length() - 8) + class225.field2932 + " " + class82.field1136 + var1 + class82.field1137 + class82.field1140;
        } else if (var1.length() > 6) {
            return " " + class82.method2132(16777215) + var1.substring(0, var1.length() - 4) + class225.field2805 + " " + class82.field1136 + var1 + class82.field1137 + class82.field1140;
        } else {
            return " " + class82.method2132(16776960) + var1 + class82.field1140;
        }
    }

    @ObfuscatedName("client.it(ZS)V")
    public final void method1360(boolean arg0) {
        method115(field806, Statics.field3615, Statics.field345, arg0);
    }

    @ObfuscatedName("client.iw(Lhn;I)V")
    public void method1407(class218 arg0) {
        class218 var2 = arg0.field2592 == -1 ? null : class218.method3666(arg0.field2592);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3615;
            var4 = Statics.field345;
        } else {
            var3 = var2.field2619;
            var4 = var2.field2589;
        }
        method3089(arg0, var3, var4, false);
        method1046(arg0, var3, var4);
    }

    @ObfuscatedName("s.il([Lhn;Lhn;ZB)V")
    public static void method267(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2596 == 0 ? arg1.field2619 : arg1.field2596;
        int var4 = arg1.field2597 == 0 ? arg1.field2589 : arg1.field2597;
        method4127(arg0, arg1.field2573, var3, var4, arg2);
        if (arg1.field2699 != null) {
            method4127(arg1.field2699, arg1.field2573, var3, var4, arg2);
        }
        class62 var5 = (class62) field807.method5527((long) arg1.field2573);
        if (var5 != null) {
            method115(var5.field571, var3, var4, arg2);
        }
        if (arg1.field2577 == 1337) {
        }
    }

    @ObfuscatedName("p.ir(IIIZI)V")
    public static final void method115(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method1013(arg0)) {
            method4127(Statics.field248[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ix.if([Lhn;IIIZB)V")
    public static void method4127(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2592 == arg1) {
                method3089(var6, arg2, arg3, arg4);
                method1046(var6, arg2, arg3);
                if (var6.field2594 > var6.field2596 - var6.field2619) {
                    var6.field2594 = var6.field2596 - var6.field2619;
                }
                if (var6.field2594 < 0) {
                    var6.field2594 = 0;
                }
                if (var6.field2622 > var6.field2597 - var6.field2589) {
                    var6.field2622 = var6.field2597 - var6.field2589;
                }
                if (var6.field2622 < 0) {
                    var6.field2622 = 0;
                }
                if (var6.field2575 == 0) {
                    method267(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ei.ih(Lhn;IIZI)V")
    public static void method3089(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2619;
        int var5 = arg0.field2589;
        if (arg0.field2580 == 0) {
            arg0.field2619 = arg0.field2584;
        } else if (arg0.field2580 == 1) {
            arg0.field2619 = arg1 - arg0.field2584;
        } else if (arg0.field2580 == 2) {
            arg0.field2619 = arg0.field2584 * arg1 >> 14;
        }
        if (arg0.field2581 == 0) {
            arg0.field2589 = arg0.field2643;
        } else if (arg0.field2581 == 1) {
            arg0.field2589 = arg2 - arg0.field2643;
        } else if (arg0.field2581 == 2) {
            arg0.field2589 = arg0.field2643 * arg2 >> 14;
        }
        if (arg0.field2580 == 4) {
            arg0.field2619 = arg0.field2590 * arg0.field2589 / arg0.field2591;
        }
        if (arg0.field2581 == 4) {
            arg0.field2589 = arg0.field2619 * arg0.field2591 / arg0.field2590;
        }
        if (arg0.field2577 == 1337) {
            field660 = arg0;
        }
        if (arg3 && arg0.field2677 != null && (arg0.field2619 != var4 || arg0.field2589 != var5)) {
            class63 var6 = new class63();
            var6.field574 = arg0;
            var6.field585 = arg0.field2677;
            field846.method4545(var6);
        }
    }

    @ObfuscatedName("be.iz(Lhn;III)V")
    public static void method1046(class218 arg0, int arg1, int arg2) {
        if (arg0.field2578 == 0) {
            arg0.field2586 = arg0.field2582;
        } else if (arg0.field2578 == 1) {
            arg0.field2586 = (arg1 - arg0.field2619) / 2 + arg0.field2582;
        } else if (arg0.field2578 == 2) {
            arg0.field2586 = arg1 - arg0.field2619 - arg0.field2582;
        } else if (arg0.field2578 == 3) {
            arg0.field2586 = arg0.field2582 * arg1 >> 14;
        } else if (arg0.field2578 == 4) {
            arg0.field2586 = (arg0.field2582 * arg1 >> 14) + (arg1 - arg0.field2619) / 2;
        } else {
            arg0.field2586 = arg1 - arg0.field2619 - (arg0.field2582 * arg1 >> 14);
        }
        if (arg0.field2579 == 0) {
            arg0.field2672 = arg0.field2715;
        } else if (arg0.field2579 == 1) {
            arg0.field2672 = (arg2 - arg0.field2589) / 2 + arg0.field2715;
        } else if (arg0.field2579 == 2) {
            arg0.field2672 = arg2 - arg0.field2589 - arg0.field2715;
        } else if (arg0.field2579 == 3) {
            arg0.field2672 = arg0.field2715 * arg2 >> 14;
        } else if (arg0.field2579 == 4) {
            arg0.field2672 = (arg0.field2715 * arg2 >> 14) + (arg2 - arg0.field2589) / 2;
        } else {
            arg0.field2672 = arg2 - arg0.field2589 - (arg0.field2715 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ie.ig(Lhn;IIIIIIB)V")
    public static final void method4086(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field713) {
            field722 = 32;
        } else {
            field722 = 0;
        }
        field713 = false;
        if (class55.field490 == 1 || !Statics.field540 && class55.field490 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2622 -= 4;
                method4409(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2622 += 4;
                method4409(arg0);
            } else if (arg5 >= arg1 - field722 && arg5 < field722 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2622 = (arg4 - arg3) * var8 / var9;
                method4409(arg0);
                field713 = true;
            }
        }
        if (field897 == 0) {
            return;
        }
        int var10 = arg0.field2619;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2622 += field897 * 45;
            method4409(arg0);
        }
    }

    @ObfuscatedName("r.ip(IIIIII)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2387[0].method5663(arg0, arg1);
        Statics.field2387[1].method5663(arg0, arg1 + arg3 - 16);
        class322.method5590(arg0, arg1 + 16, 16, arg3 - 32, field871);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class322.method5590(arg0, arg1 + 16 + var6, 16, var5, field710);
        class322.method5598(arg0, arg1 + 16 + var6, var5, field712);
        class322.method5598(arg0 + 1, arg1 + 16 + var6, var5, field712);
        class322.method5597(arg0, arg1 + 16 + var6, 16, field712);
        class322.method5597(arg0, arg1 + 17 + var6, 16, field712);
        class322.method5598(arg0 + 15, arg1 + 16 + var6, var5, field711);
        class322.method5598(arg0 + 14, arg1 + 17 + var6, var5 - 1, field711);
        class322.method5597(arg0, arg1 + 15 + var6 + var5, 16, field711);
        class322.method5597(arg0 + 1, arg1 + 14 + var6 + var5, 15, field711);
    }

    @ObfuscatedName("bb.jj(Lhn;B)Z")
    public static final boolean method1012(class218 arg0) {
        if (arg0.field2692 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2692.length; var1++) {
            int var2 = method86(arg0, var1);
            int var3 = arg0.field2693[var1];
            if (arg0.field2692[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("j.jw(Lhn;IB)I")
    public static final int method86(class218 arg0, int arg1) {
        if (arg0.field2666 == null || arg1 >= arg0.field2666.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2666[arg1];
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
                    var7 = field778[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field800[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field780[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method3666(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class256.method4164(var12).field3420 || field695)) {
                        for (int var13 = 0; var13 < var11.field2585.length; var13++) {
                            if (var12 + 1 == var11.field2585[var13]) {
                                var7 += var11.field2662[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2534[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2755[field800[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2534[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2392.field618;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2758[var14]) {
                            var7 += field800[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method3666(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class256.method4164(var18).field3420 || field695)) {
                        for (int var19 = 0; var19 < var17.field2585.length; var19++) {
                            if (var18 + 1 == var17.field2585[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field737;
                }
                if (var6 == 12) {
                    var7 = field903;
                }
                if (var6 == 13) {
                    int var20 = class213.field2534[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method122(var22);
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
                    var7 = (Statics.field2392.field983 >> 7) + Statics.field1262;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2392.field940 >> 7) + Statics.field2367;
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

    @ObfuscatedName("d.jr(Lhn;Lif;IIZI)V")
    public static final void method66(class218 arg0, class256 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3422;
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
            var7 = class225.field2769;
        }
        if (var6 != -1 && var7 != null) {
            method3220(var7, class82.method2132(16748608) + arg1.field3407, var6, arg1.field3411, arg2, arg0.field2573, arg4);
        }
    }

    @ObfuscatedName("da.jg(Lhn;IIS)V")
    public static final void method2796(class218 arg0, int arg1, int arg2) {
        if (arg0.field2568 == 1) {
            method1888(arg0.field2696, "", 24, 0, 0, arg0.field2573);
        }
        if (arg0.field2568 == 2 && !field650) {
            String var3 = method2320(arg0);
            if (var3 != null) {
                method1888(var3, class82.method2132(65280) + arg0.field2695, 25, 0, -1, arg0.field2573);
            }
        }
        if (arg0.field2568 == 3) {
            method1888(class225.field2986, "", 26, 0, 0, arg0.field2573);
        }
        if (arg0.field2568 == 4) {
            method1888(arg0.field2696, "", 28, 0, 0, arg0.field2573);
        }
        if (arg0.field2568 == 5) {
            method1888(arg0.field2696, "", 29, 0, 0, arg0.field2573);
        }
        if (arg0.field2568 == 6 && field813 == null) {
            method1888(arg0.field2696, "", 30, 0, -1, arg0.field2573);
        }
        if (arg0.field2575 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2589; var5++) {
                for (int var6 = 0; var6 < arg0.field2619; var6++) {
                    int var7 = (arg0.field2640 + 32) * var6;
                    int var8 = (arg0.field2641 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2642[var4];
                        var8 += arg0.field2629[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field757 = var4;
                        Statics.field1605 = arg0;
                        if (arg0.field2585[var4] > 0) {
                            class256 var9 = class256.method4164(arg0.field2585[var4] - 1);
                            if (field826 == 1 && class219.method575(method188(arg0))) {
                                if (Statics.field1061 != arg0.field2573 || Statics.field607 != var4) {
                                    method1888(class225.field2921, field841 + " " + class82.field1133 + " " + class82.method2132(16748608) + var9.field3407, 31, var9.field3411, var4, arg0.field2573);
                                }
                            } else if (!field650 || !class219.method575(method188(arg0))) {
                                String[] var10 = var9.field3422;
                                int var11 = -1;
                                if (field789 && method2009()) {
                                    var11 = var9.method4335();
                                }
                                if (class219.method575(method188(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method66(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class219.method4640(method188(arg0))) {
                                    method1888(class225.field2921, class82.method2132(16748608) + var9.field3407, 38, var9.field3411, var4, arg0.field2573);
                                }
                                if (class219.method575(method188(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            method66(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method66(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field2657;
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
                                            method1888(var14[var15], class82.method2132(16748608) + var9.field3407, var16, var9.field3411, var4, arg0.field2573);
                                        }
                                    }
                                }
                                method1888(class225.field2922, class82.method2132(16748608) + var9.field3407, 1005, var9.field3411, var4, arg0.field2573);
                            } else if ((Statics.field2061 & 0x10) == 16) {
                                method1888(field804, field805 + " " + class82.field1133 + " " + class82.method2132(16748608) + var9.field3407, 32, var9.field3411, var4, arg0.field2573);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2572) {
            return;
        }
        if (!field650) {
            for (int var17 = 9; var17 >= 5; var17--) {
                String var18 = Statics.method1917(arg0, var17);
                if (var18 != null) {
                    method1888(var18, arg0.field2593, 1007, var17 + 1, arg0.field2574, arg0.field2573);
                }
            }
            String var19 = method2320(arg0);
            if (var19 != null) {
                method1888(var19, arg0.field2593, 25, 0, arg0.field2574, arg0.field2573);
            }
            for (int var20 = 4; var20 >= 0; var20--) {
                String var21 = Statics.method1917(arg0, var20);
                if (var21 != null) {
                    method3220(var21, arg0.field2593, 57, var20 + 1, arg0.field2574, arg0.field2573, arg0.field2714);
                }
            }
            if (class219.method1933(method188(arg0))) {
                method1888(class225.field2835, "", 30, 0, arg0.field2574, arg0.field2573);
            }
        } else if (class219.method1908(method188(arg0)) && (Statics.field2061 & 0x20) == 32) {
            method1888(field804, field805 + " " + class82.field1133 + " " + arg0.field2593, 58, 0, arg0.field2574, arg0.field2573);
        }
    }

    @ObfuscatedName("bv.jv(ZI)V")
    public static void method1762(boolean arg0) {
        field793 = arg0;
    }

    @ObfuscatedName("bn.jb(B)Z")
    public static boolean method1097() {
        return field793;
    }

    @ObfuscatedName("cz.jo(I)Z")
    public static boolean method2009() {
        return field793 || class46.field399[81];
    }

    @ObfuscatedName("u.js(IIIIIIIB)V")
    public static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method1013(arg0)) {
            method141(Statics.field248[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("v.ja([Lhn;IIIIIIII)V")
    public static final void method141(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2592 == arg1 && (!var9.field2572 || var9.field2575 == 0 || var9.field2659 || method188(var9) != 0 || field821 == var9 || var9.field2577 == 1338)) {
                if (var9.field2572) {
                    if (method4085(var9)) {
                        continue;
                    }
                } else if (var9.field2575 == 0 && Statics.field69 != var9 && method4085(var9)) {
                    continue;
                }
                int var10 = var9.field2586 + arg6;
                int var11 = var9.field2672 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2575 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2575 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2619 + var10;
                    int var19 = var9.field2589 + var11;
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
                    int var22 = var9.field2619 + var10;
                    int var23 = var9.field2589 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field651 == var9) {
                    field828 = true;
                    field865 = var10;
                    field830 = var11;
                }
                boolean var24 = false;
                if (var9.field2647) {
                    switch(field809) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2573 >>> 16 == field665) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field665 == var9.field2573) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2572 || var12 < var14 && var13 < var15) {
                    if (var9.field2572) {
                        if (var9.field2713) {
                            if (class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15) {
                                for (class63 var25 = (class63) field846.method4543(); var25 != null; var25 = (class63) field846.method4564()) {
                                    if (var25.field573) {
                                        var25.method3351();
                                        var25.field574.field2562 = false;
                                    }
                                }
                                if (Statics.field3527 == 0) {
                                    field651 = null;
                                    field821 = null;
                                }
                                if (!field782) {
                                    method2149();
                                }
                            }
                        } else if (var9.field2682 && class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15) {
                            for (class63 var26 = (class63) field846.method4543(); var26 != null; var26 = (class63) field846.method4564()) {
                                if (var26.field573 && var26.field574.field2680 == var26.field585) {
                                    var26.method3351();
                                }
                            }
                        }
                    }
                    int var27 = class55.field494;
                    int var28 = class55.field492;
                    if (class55.field496 != 0) {
                        var27 = class55.field497;
                        var28 = class55.field489;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2577 == 1337) {
                        if (!field655 && !field782 && var29) {
                            method195(var27, var28, var12, var13);
                        }
                    } else if (var9.field2577 == 1338) {
                        method4639(var9, var10, var11);
                    } else {
                        if (var9.field2577 == 1400) {
                            Statics.field146.method5861(class55.field494, class55.field492, var29, var10, var11, var9.field2619, var9.field2589);
                        }
                        if (!field782 && var29) {
                            if (var9.field2577 == 1400) {
                                Statics.field146.method5913(var10, var11, var9.field2619, var9.field2589, var27, var28);
                            } else {
                                method2796(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2703.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2703[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2703[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2712 != null) {
                                            var34 = class46.field399[var9.field2703[var30][var33]];
                                        }
                                        if (Statics.method3552(var9.field2703[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2712 != null && var9.field2712[var30] > field656) {
                                                break;
                                            }
                                            byte var35 = var9.field2649[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field399[86] && !class46.field399[82] && !class46.field399[81]) && ((var35 & 0x2) == 0 || class46.field399[86]) && ((var35 & 0x1) == 0 || class46.field399[82]) && ((var35 & 0x4) == 0 || class46.field399[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1909(var30 + 1, var9.field2573, var9.field2574, var9.field2626, "");
                                    } else if (var30 == 10) {
                                        method574();
                                        method3551(var9.field2573, var9.field2574, class219.method1927(method188(var9)), var9.field2626);
                                        field804 = method2320(var9);
                                        if (field804 == null) {
                                            field804 = class225.field2775;
                                        }
                                        field805 = var9.field2593 + class82.method2132(16777215);
                                    }
                                    int var36 = var9.field2650[var30];
                                    if (var9.field2712 == null) {
                                        var9.field2712 = new int[var9.field2703.length];
                                    }
                                    if (var9.field2561 == null) {
                                        var9.field2561 = new int[var9.field2703.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2712[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2712[var30] == 0) {
                                        var9.field2712[var30] = field656 + var36 + var9.field2561[var30];
                                    } else {
                                        var9.field2712[var30] = field656 + var36;
                                    }
                                }
                                if (!var31 && var9.field2712 != null) {
                                    var9.field2712[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2572) {
                            boolean var37;
                            if (class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field490 == 1 || !Statics.field540 && class55.field490 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field496 == 1 || !Statics.field540 && class55.field496 == 4) && class55.field497 >= var12 && class55.field489 >= var13 && class55.field497 < var14 && class55.field489 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                Statics.method3816(var9, class55.field497 - var10, class55.field489 - var11);
                            }
                            if (var9.field2577 == 1400) {
                                Statics.field146.method5862(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field651 != null && field651 != var9 && var37 && class219.method56(method188(var9))) {
                                field726 = var9;
                            }
                            if (field821 == var9) {
                                field825 = true;
                                field920 = var10;
                                field827 = var11;
                            }
                            if (var9.field2659) {
                                if (var37 && field897 != 0 && var9.field2680 != null) {
                                    class63 var40 = new class63();
                                    var40.field573 = true;
                                    var40.field574 = var9;
                                    var40.field576 = field897;
                                    var40.field585 = var9.field2680;
                                    field846.method4545(var40);
                                }
                                if (field651 != null || Statics.field2325 != null || field782) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2705 && var39) {
                                    var9.field2705 = true;
                                    if (var9.field2684 != null) {
                                        class63 var41 = new class63();
                                        var41.field573 = true;
                                        var41.field574 = var9;
                                        var41.field582 = class55.field497 - var10;
                                        var41.field576 = class55.field489 - var11;
                                        var41.field585 = var9.field2684;
                                        field846.method4545(var41);
                                    }
                                }
                                if (var9.field2705 && var38 && var9.field2583 != null) {
                                    class63 var42 = new class63();
                                    var42.field573 = true;
                                    var42.field574 = var9;
                                    var42.field582 = class55.field494 - var10;
                                    var42.field576 = class55.field492 - var11;
                                    var42.field585 = var9.field2583;
                                    field846.method4545(var42);
                                }
                                if (var9.field2705 && !var38) {
                                    var9.field2705 = false;
                                    if (var9.field2663 != null) {
                                        class63 var43 = new class63();
                                        var43.field573 = true;
                                        var43.field574 = var9;
                                        var43.field582 = class55.field494 - var10;
                                        var43.field576 = class55.field492 - var11;
                                        var43.field585 = var9.field2663;
                                        field848.method4545(var43);
                                    }
                                }
                                if (var38 && var9.field2664 != null) {
                                    class63 var44 = new class63();
                                    var44.field573 = true;
                                    var44.field574 = var9;
                                    var44.field582 = class55.field494 - var10;
                                    var44.field576 = class55.field492 - var11;
                                    var44.field585 = var9.field2664;
                                    field846.method4545(var44);
                                }
                                if (!var9.field2562 && var37) {
                                    var9.field2562 = true;
                                    if (var9.field2665 != null) {
                                        class63 var45 = new class63();
                                        var45.field573 = true;
                                        var45.field574 = var9;
                                        var45.field582 = class55.field494 - var10;
                                        var45.field576 = class55.field492 - var11;
                                        var45.field585 = var9.field2665;
                                        field846.method4545(var45);
                                    }
                                }
                                if (var9.field2562 && var37 && var9.field2644 != null) {
                                    class63 var46 = new class63();
                                    var46.field573 = true;
                                    var46.field574 = var9;
                                    var46.field582 = class55.field494 - var10;
                                    var46.field576 = class55.field492 - var11;
                                    var46.field585 = var9.field2644;
                                    field846.method4545(var46);
                                }
                                if (var9.field2562 && !var37) {
                                    var9.field2562 = false;
                                    if (var9.field2667 != null) {
                                        class63 var47 = new class63();
                                        var47.field573 = true;
                                        var47.field574 = var9;
                                        var47.field582 = class55.field494 - var10;
                                        var47.field576 = class55.field492 - var11;
                                        var47.field585 = var9.field2667;
                                        field848.method4545(var47);
                                    }
                                }
                                if (var9.field2678 != null) {
                                    class63 var48 = new class63();
                                    var48.field574 = var9;
                                    var48.field585 = var9.field2678;
                                    field847.method4545(var48);
                                }
                                if (var9.field2673 != null && field834 > var9.field2707) {
                                    if (var9.field2576 == null || field834 - var9.field2707 > 32) {
                                        class63 var53 = new class63();
                                        var53.field574 = var9;
                                        var53.field585 = var9.field2673;
                                        field846.method4545(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2707; var49 < field834; var49++) {
                                            int var50 = field833[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2576.length; var51++) {
                                                if (var9.field2576[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field574 = var9;
                                                    var52.field585 = var9.field2673;
                                                    field846.method4545(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2707 = field834;
                                }
                                if (var9.field2674 != null && field836 > var9.field2571) {
                                    if (var9.field2566 == null || field836 - var9.field2571 > 32) {
                                        class63 var58 = new class63();
                                        var58.field574 = var9;
                                        var58.field585 = var9.field2674;
                                        field846.method4545(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2571; var54 < field836; var54++) {
                                            int var55 = field835[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2566.length; var56++) {
                                                if (var9.field2566[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field574 = var9;
                                                    var57.field585 = var9.field2674;
                                                    field846.method4545(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2571 = field836;
                                }
                                if (var9.field2676 != null && field647 > var9.field2709) {
                                    if (var9.field2686 == null || field647 - var9.field2709 > 32) {
                                        class63 var63 = new class63();
                                        var63.field574 = var9;
                                        var63.field585 = var9.field2676;
                                        field846.method4545(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2709; var59 < field647; var59++) {
                                            int var60 = field837[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2686.length; var61++) {
                                                if (var9.field2686[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field574 = var9;
                                                    var62.field585 = var9.field2676;
                                                    field846.method4545(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field647;
                                }
                                if (field839 > var9.field2706 && var9.field2681 != null) {
                                    class63 var64 = new class63();
                                    var64.field574 = var9;
                                    var64.field585 = var9.field2681;
                                    field846.method4545(var64);
                                }
                                if (field840 > var9.field2706 && var9.field2683 != null) {
                                    class63 var65 = new class63();
                                    var65.field574 = var9;
                                    var65.field585 = var9.field2683;
                                    field846.method4545(var65);
                                }
                                if (field824 > var9.field2706 && var9.field2595 != null) {
                                    class63 var66 = new class63();
                                    var66.field574 = var9;
                                    var66.field585 = var9.field2595;
                                    field846.method4545(var66);
                                }
                                if (field842 > var9.field2706 && var9.field2689 != null) {
                                    class63 var67 = new class63();
                                    var67.field574 = var9;
                                    var67.field585 = var9.field2689;
                                    field846.method4545(var67);
                                }
                                if (field843 > var9.field2706 && var9.field2675 != null) {
                                    class63 var68 = new class63();
                                    var68.field574 = var9;
                                    var68.field585 = var9.field2675;
                                    field846.method4545(var68);
                                }
                                if (field796 > var9.field2706 && var9.field2685 != null) {
                                    class63 var69 = new class63();
                                    var69.field574 = var9;
                                    var69.field585 = var9.field2685;
                                    field846.method4545(var69);
                                }
                                var9.field2706 = field832;
                                if (var9.field2606 != null) {
                                    for (int var70 = 0; var70 < field763; var70++) {
                                        class63 var71 = new class63();
                                        var71.field574 = var9;
                                        var71.field579 = field870[var70];
                                        var71.field575 = field869[var70];
                                        var71.field585 = var9.field2606;
                                        field846.method4545(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2572) {
                            if (field651 != null || Statics.field2325 != null || field782) {
                                continue;
                            }
                            if ((var9.field2651 >= 0 || var9.field2600 != 0) && class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15) {
                                if (var9.field2651 >= 0) {
                                    Statics.field69 = arg0[var9.field2651];
                                } else {
                                    Statics.field69 = var9;
                                }
                            }
                            if (var9.field2575 == 8 && class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15) {
                                Statics.field3297 = var9;
                            }
                            if (var9.field2597 > var9.field2589) {
                                method4086(var9, var9.field2619 + var10, var11, var9.field2589, var9.field2597, class55.field494, class55.field492);
                            }
                        }
                        if (var9.field2575 == 0) {
                            method141(arg0, var9.field2573, var12, var13, var14, var15, var10 - var9.field2594, var11 - var9.field2622);
                            if (var9.field2699 != null) {
                                method141(var9.field2699, var9.field2573, var12, var13, var14, var15, var10 - var9.field2594, var11 - var9.field2622);
                            }
                            class62 var72 = (class62) field807.method5527((long) var9.field2573);
                            if (var72 != null) {
                                if (var72.field565 == 0 && class55.field494 >= var12 && class55.field492 >= var13 && class55.field494 < var14 && class55.field492 < var15 && !field782) {
                                    for (class63 var73 = (class63) field846.method4543(); var73 != null; var73 = (class63) field846.method4564()) {
                                        if (var73.field573) {
                                            var73.method3351();
                                            var73.field574.field2562 = false;
                                        }
                                    }
                                    if (Statics.field3527 == 0) {
                                        field651 = null;
                                        field821 = null;
                                    }
                                    if (!field782) {
                                        method2149();
                                    }
                                }
                                method286(var72.field571, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ho.jc(III)V")
    public static final void method3819(int arg0, int arg1) {
        if (class218.method1013(arg0)) {
            method220(Statics.field248[arg0], arg1);
        }
    }

    @ObfuscatedName("y.jn([Lhn;IB)V")
    public static final void method220(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2575 == 0) {
                    if (var3.field2699 != null) {
                        method220(var3.field2699, arg1);
                    }
                    class62 var4 = (class62) field807.method5527((long) var3.field2573);
                    if (var4 != null) {
                        method3819(var4.field571, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2711 != null) {
                    class63 var5 = new class63();
                    var5.field574 = var3;
                    var5.field585 = var3.field2711;
                    class77.method46(var5);
                }
                if (arg1 == 1 && var3.field2670 != null) {
                    if (var3.field2574 >= 0) {
                        class218 var6 = class218.method3666(var3.field2573);
                        if (var6 == null || var6.field2699 == null || var3.field2574 >= var6.field2699.length || var6.field2699[var3.field2574] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field574 = var3;
                    var7.field585 = var3.field2670;
                    class77.method46(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.jk(B)V")
    public final void method1377() {
        method4409(field651);
        Statics.field3527++;
        if (field828 && field825) {
            int var1 = class55.field494;
            int var2 = class55.field492;
            int var3 = var1 - field838;
            int var4 = var2 - field823;
            if (var3 < field920) {
                var3 = field920;
            }
            if (field651.field2619 + var3 > field920 + field821.field2619) {
                var3 = field920 + field821.field2619 - field651.field2619;
            }
            if (var4 < field827) {
                var4 = field827;
            }
            if (field651.field2589 + var4 > field827 + field821.field2589) {
                var4 = field827 + field821.field2589 - field651.field2589;
            }
            int var5 = var3 - field865;
            int var6 = var4 - field830;
            int var7 = field651.field2655;
            if (Statics.field3527 > field651.field2656 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field831 = true;
            }
            int var8 = field821.field2594 + (var3 - field920);
            int var9 = field821.field2622 + (var4 - field827);
            if (field651.field2668 != null && field831) {
                class63 var10 = new class63();
                var10.field574 = field651;
                var10.field582 = var8;
                var10.field576 = var9;
                var10.field585 = field651.field2668;
                class77.method46(var10);
            }
            if (class55.field490 == 0) {
                if (field831) {
                    if (field651.field2687 != null) {
                        class63 var11 = new class63();
                        var11.field574 = field651;
                        var11.field582 = var8;
                        var11.field576 = var9;
                        var11.field578 = field726;
                        var11.field585 = field651.field2687;
                        class77.method46(var11);
                    }
                    if (field726 != null && Statics.method1037(field651) != null) {
                        class188 var12 = class188.method2887(class184.field2243, field693.field1298);
                        var12.field2335.method5166(field726.field2574);
                        var12.field2335.method5340(field651.field2626);
                        var12.field2335.method5175(field651.field2573);
                        var12.field2335.method5175(field726.field2573);
                        var12.field2335.method5164(field726.field2626);
                        var12.field2335.method5164(field651.field2574);
                        field693.method2109(var12);
                    }
                } else if (this.method1178()) {
                    this.method1505(field865 + field838, field830 + field823);
                } else if (field649 > 0) {
                    method85(field865 + field838, field830 + field823);
                }
                field651 = null;
            }
        } else if (Statics.field3527 > 1) {
            field651 = null;
        }
    }

    @ObfuscatedName("j.jx(III)V")
    public static void method85(int arg0, int arg1) {
        class83 var2 = Statics.field266;
        method3178(var2.field1145, var2.field1144, var2.field1143, var2.field1146, var2.field1147, var2.field1147, arg0, arg1);
        Statics.field266 = null;
    }

    @ObfuscatedName("iz.jf(Lhn;I)V")
    public static void method4409(class218 arg0) {
        if (field851 == arg0.field2694) {
            field852[arg0.field2710] = true;
        }
    }

    @ObfuscatedName("kk.jm(B)V")
    public static void method5451() {
        for (class62 var0 = (class62) field807.method5529(); var0 != null; var0 = (class62) field807.method5530()) {
            int var1 = var0.field571;
            if (class218.method1013(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field248[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2572;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2115;
                    class218 var6 = class218.method3666(var5);
                    if (var6 != null) {
                        method4409(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.jp(II)V")
    public static final void method754(int arg0) {
        if (!class218.method1013(arg0)) {
            return;
        }
        class218[] var1 = Statics.field248[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2701 = 0;
                var3.field2702 = 0;
            }
        }
    }

    @ObfuscatedName("h.je(II)V")
    public static final void method130(int arg0) {
        if (class218.method1013(arg0)) {
            method655(Statics.field248[arg0], -1);
        }
    }

    @ObfuscatedName("al.jh([Lhn;IB)V")
    public static final void method655(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2592 == arg1 && (!var3.field2572 || !method4085(var3))) {
                if (var3.field2575 == 0) {
                    if (!var3.field2572 && method4085(var3) && Statics.field69 != var3) {
                        continue;
                    }
                    method655(arg0, var3.field2573);
                    if (var3.field2699 != null) {
                        method655(var3.field2699, var3.field2573);
                    }
                    class62 var4 = (class62) field807.method5527((long) var3.field2573);
                    if (var4 != null) {
                        method130(var4.field571);
                    }
                }
                if (var3.field2575 == 6) {
                    if (var3.field2620 != -1 || var3.field2690 != -1) {
                        boolean var5 = method1012(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2690;
                        } else {
                            var6 = var3.field2620;
                        }
                        if (var6 != -1) {
                            class260 var7 = class260.method5476(var6);
                            var3.field2702 += field708;
                            while (var3.field2702 > var7.field3515[var3.field2701]) {
                                var3.field2702 -= var7.field3515[var3.field2701];
                                var3.field2701++;
                                if (var3.field2701 >= var7.field3526.length) {
                                    var3.field2701 -= var7.field3520;
                                    if (var3.field2701 < 0 || var3.field2701 >= var7.field3526.length) {
                                        var3.field2701 = 0;
                                    }
                                }
                                method4409(var3);
                            }
                        }
                    }
                    if (var3.field2697 != 0 && !var3.field2572) {
                        int var8 = var3.field2697 >> 16;
                        int var9 = var3.field2697 << 16 >> 16;
                        int var10 = field708 * var8;
                        int var11 = field708 * var9;
                        var3.field2624 = var3.field2624 + var10 & 0x7FF;
                        var3.field2625 = var3.field2625 + var11 & 0x7FF;
                        method4409(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gb.ju(IB)V")
    public static final void method3360(int arg0) {
        method5451();
        class76.method3387();
        int var1 = class242.method2078(arg0).field3209;
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field2534[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class131.method2806(0.9D);
                ((class120) Statics.field1777).method2546(0.9D);
            }
            if (var2 == 2) {
                class131.method2806(0.8D);
                ((class120) Statics.field1777).method2546(0.8D);
            }
            if (var2 == 3) {
                class131.method2806(0.7D);
                ((class120) Statics.field1777).method2546(0.7D);
            }
            if (var2 == 4) {
                class131.method2806(0.6D);
                ((class120) Statics.field1777).method2546(0.6D);
            }
            class256.field3403.method3103();
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
            if (field861 != var3) {
                if (field861 == 0 && field881 != -1) {
                    class237 var4 = Statics.field484;
                    int var5 = field881;
                    class198.field2415 = 1;
                    Statics.field1982 = var4;
                    Statics.field2411 = var5;
                    Statics.field1150 = 0;
                    Statics.field1156 = var3;
                    Statics.field402 = false;
                    Statics.field2413 = 10000;
                    field882 = false;
                } else if (var3 == 0) {
                    Statics.field2409.method3439();
                    class198.field2415 = 1;
                    Statics.field1982 = null;
                    field882 = false;
                } else if (class198.field2415 == 0) {
                    Statics.field2409.method3433(var3);
                } else {
                    Statics.field1156 = var3;
                }
                field861 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field883 = 127;
            }
            if (var2 == 1) {
                field883 = 96;
            }
            if (var2 == 2) {
                field883 = 64;
            }
            if (var2 == 3) {
                field883 = 32;
            }
            if (var2 == 4) {
                field883 = 0;
            }
        }
        if (var1 == 5) {
            field743 = var2;
        }
        if (var1 == 6) {
            field811 = var2;
        }
        if (var1 == 9) {
            field812 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field884 = 127;
            }
            if (var2 == 1) {
                field884 = 96;
            }
            if (var2 == 2) {
                field884 = 64;
            }
            if (var2 == 3) {
                field884 = 32;
            }
            if (var2 == 4) {
                field884 = 0;
            }
        }
        if (var1 == 17) {
            field817 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class85[] var6 = new class85[] { class85.field1158, class85.field1159, class85.field1155, class85.field1157 };
            field672 = (class85) class196.method222(var6, var2);
            if (field672 == null) {
                field672 = class85.field1159;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field759 = -1;
            } else {
                field759 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class85[] var7 = new class85[] { class85.field1158, class85.field1159, class85.field1155, class85.field1157 };
        field902 = (class85) class196.method222(var7, var2);
        if (field902 == null) {
            field902 = class85.field1159;
        }
    }

    @ObfuscatedName("l.jd(Lhn;I)V")
    public static final void method73(class218 arg0) {
        int var1 = arg0.field2577;
        if (var1 == 324) {
            if (field911 == -1) {
                field911 = arg0.field2608;
                field912 = arg0.field2609;
            }
            if (field919.field2542) {
                arg0.field2608 = field911;
            } else {
                arg0.field2608 = field912;
            }
        } else if (var1 == 325) {
            if (field911 == -1) {
                field911 = arg0.field2608;
                field912 = arg0.field2609;
            }
            if (field919.field2542) {
                arg0.field2608 = field912;
            } else {
                arg0.field2608 = field911;
            }
        } else if (var1 == 327) {
            arg0.field2624 = 150;
            arg0.field2625 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2616 = 5;
            arg0.field2617 = 0;
        } else if (var1 == 328) {
            arg0.field2624 = 150;
            arg0.field2625 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2616 = 5;
            arg0.field2617 = 1;
        }
    }

    @ObfuscatedName("at.jz(I)V")
    public static final void method701() {
        class188 var0 = class188.method2887(class184.field2299, field693.field1298);
        field693.method2109(var0);
        for (class62 var1 = (class62) field807.method5529(); var1 != null; var1 = (class62) field807.method5530()) {
            if (var1.field565 == 0 || var1.field565 == 3) {
                method3363(var1, true);
            }
        }
        if (field813 != null) {
            method4409(field813);
            field813 = null;
        }
    }

    @ObfuscatedName("ku.jy(IIIB)Lbe;")
    public static final class62 method4886(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field571 = arg1;
        var3.field565 = arg2;
        field807.method5535(var3, (long) arg0);
        method754(arg1);
        class218 var4 = class218.method3666(arg0);
        method4409(var4);
        if (field813 != null) {
            method4409(field813);
            field813 = null;
        }
        method3075();
        method267(Statics.field248[arg0 >> 16], var4, false);
        class77.method176(arg1);
        if (field806 != -1) {
            method3819(field806, 1);
        }
        return var3;
    }

    @ObfuscatedName("gy.jl(Lbe;ZI)V")
    public static final void method3363(class62 arg0, boolean arg1) {
        int var2 = arg0.field571;
        int var3 = (int) arg0.field2115;
        arg0.method3351();
        if (arg1) {
            Statics.method1763(var2);
        }
        method530(var2);
        class218 var4 = class218.method3666(var3);
        if (var4 != null) {
            method4409(var4);
        }
        method3075();
        if (field806 != -1) {
            method3819(field806, 1);
        }
    }

    @ObfuscatedName("kv.km(Lhn;I)Z")
    public static final boolean method5432(class218 arg0) {
        int var1 = arg0.field2577;
        if (var1 == 205) {
            field694 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field919.method3689(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field919.method3690(var4, var5 == 1);
        }
        if (var1 == 324) {
            field919.method3687(false);
        }
        if (var1 == 325) {
            field919.method3687(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method2887(class184.field2285, field693.field1298);
            field919.method3692(var6.field2335);
            field693.method2109(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.ku(Lhn;IIII)V")
    public static final void method441(class218 arg0, int arg1, int arg2, int arg3) {
        method3199();
        class212 var4 = arg0.method3781(false);
        if (var4 == null) {
            return;
        }
        class322.method5582(arg1, arg2, var4.field2529 + arg1, var4.field2526 + arg2);
        if (field879 == 2 || field879 == 5) {
            class322.method5631(arg1, arg2, 0, var4.field2531, var4.field2528);
        } else {
            int var5 = field717 & 0x7FF;
            int var6 = Statics.field2392.field983 / 32 + 48;
            int var7 = 464 - Statics.field2392.field940 / 32;
            Statics.field194.method5773(arg1, arg2, var4.field2529, var4.field2526, var6, var7, var5, 256, var4.field2531, var4.field2528);
            for (int var8 = 0; var8 < field873; var8++) {
                int var9 = field872[var8] * 4 + 2 - Statics.field2392.field983 / 32;
                int var10 = field875[var8] * 4 + 2 - Statics.field2392.field940 / 32;
                method2080(arg1, arg2, var9, var10, field876[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class263 var13 = field799[Statics.field2055][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2392.field983 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2392.field940 / 32;
                        method2080(arg1, arg2, var14, var15, Statics.field190[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field880; var16++) {
                class80 var17 = field688[field690[var16]];
                if (var17 != null && var17.method1141()) {
                    class258 var18 = var17.field1120;
                    if (var18 != null && var18.field3490 != null) {
                        var18 = var18.method4391();
                    }
                    if (var18 != null && var18.field3481 && var18.field3483) {
                        int var19 = var17.field983 / 32 - Statics.field2392.field983 / 32;
                        int var20 = var17.field940 / 32 - Statics.field2392.field940 / 32;
                        method2080(arg1, arg2, var19, var20, Statics.field190[1], var4);
                    }
                }
            }
            int var21 = class90.field1247;
            int[] var22 = class90.field1241;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field762[var22[var23]];
                if (var24 != null && var24.method1141() && !var24.field633 && Statics.field2392 != var24) {
                    int var25 = var24.field983 / 32 - Statics.field2392.field983 / 32;
                    int var26 = var24.field940 / 32 - Statics.field2392.field940 / 32;
                    boolean var27 = false;
                    if (Statics.field2392.field638 != 0 && var24.field638 != 0 && Statics.field2392.field638 == var24.field638) {
                        var27 = true;
                    }
                    if (var24.method1138()) {
                        method2080(arg1, arg2, var25, var26, Statics.field190[3], var4);
                    } else if (var27) {
                        method2080(arg1, arg2, var25, var26, Statics.field190[4], var4);
                    } else if (var24.method1122()) {
                        method2080(arg1, arg2, var25, var26, Statics.field190[5], var4);
                    } else {
                        method2080(arg1, arg2, var25, var26, Statics.field190[2], var4);
                    }
                }
            }
            if (field664 != 0 && field656 % 20 < 10) {
                if (field664 == 1 && field687 >= 0 && field687 < field688.length) {
                    class80 var28 = field688[field687];
                    if (var28 != null) {
                        int var29 = var28.field983 / 32 - Statics.field2392.field983 / 32;
                        int var30 = var28.field940 / 32 - Statics.field2392.field940 / 32;
                        method694(arg1, arg2, var29, var30, Statics.field3310[1], var4);
                    }
                }
                if (field664 == 2) {
                    int var31 = field667 * 4 - Statics.field1262 * 4 + 2 - Statics.field2392.field983 / 32;
                    int var32 = field668 * 4 - Statics.field2367 * 4 + 2 - Statics.field2392.field940 / 32;
                    method694(arg1, arg2, var31, var32, Statics.field3310[1], var4);
                }
                if (field664 == 10 && field666 >= 0 && field666 < field762.length) {
                    class67 var33 = field762[field666];
                    if (var33 != null) {
                        int var34 = var33.field983 / 32 - Statics.field2392.field983 / 32;
                        int var35 = var33.field940 / 32 - Statics.field2392.field940 / 32;
                        method694(arg1, arg2, var34, var35, Statics.field3310[1], var4);
                    }
                }
            }
            if (field877 != 0) {
                int var36 = field877 * 4 + 2 - Statics.field2392.field983 / 32;
                int var37 = field878 * 4 + 2 - Statics.field2392.field940 / 32;
                method2080(arg1, arg2, var36, var37, Statics.field3310[0], var4);
            }
            if (!Statics.field2392.field633) {
                class322.method5590(var4.field2529 / 2 + arg1 - 1, var4.field2526 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field853[arg3] = true;
    }

    @ObfuscatedName("ex.ke(Lhn;IIIB)V")
    public static final void method3171(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3781(false);
        if (var4 == null) {
            return;
        }
        if (field879 < 3) {
            Statics.field1868.method5773(arg1, arg2, var4.field2529, var4.field2526, 25, 25, field717, 256, var4.field2531, var4.field2528);
        } else {
            class322.method5631(arg1, arg2, 0, var4.field2531, var4.field2528);
        }
    }

    @ObfuscatedName("at.kl(IIIILlt;Lhf;S)V")
    public static final void method694(int arg0, int arg1, int arg2, int arg3, class326 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2080(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field717 & 0x7FF;
        int var8 = class131.field1780[var7];
        int var9 = class131.field1781[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2529 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field536.method5745(arg5.field2529 / 2 + arg0 - var17 / 2 + var15, arg5.field2526 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ce.kh(IIIILlt;Lhf;I)V")
    public static final void method2080(int arg0, int arg1, int arg2, int arg3, class326 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field717 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1780[var6];
        int var9 = class131.field1781[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5710(arg5.field2529 / 2 + var10 - arg4.field3874 / 2, arg5.field2526 / 2 - var11 - arg4.field3876 / 2, arg0, arg1, arg5.field2529, arg5.field2526, arg5.field2531, arg5.field2528);
        } else {
            arg4.method5785(arg5.field2529 / 2 + arg0 + var10 - arg4.field3874 / 2, arg5.field2526 / 2 + arg1 - var11 - arg4.field3876 / 2);
        }
    }

    @ObfuscatedName("au.kj(I)V")
    public static final void method509() {
        for (int var0 = 0; var0 < class90.field1247; var0++) {
            class67 var1 = field762[class90.field1241[var0]];
            var1.method1112();
        }
        class92.method1081();
        if (Statics.field568 != null) {
            Statics.field568.method4865();
        }
    }

    @ObfuscatedName("ca.kq(I)V")
    public static final void method2151() {
        Iterator var0 = class92.field1258.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1100();
        }
        if (Statics.field568 != null) {
            Statics.field568.method4878();
        }
    }

    @ObfuscatedName("kn.kz(I)V")
    public static final void method5470() {
        for (int var0 = 0; var0 < class90.field1247; var0++) {
            class67 var1 = field762[class90.field1241[var0]];
            var1.method1133();
        }
    }

    @ObfuscatedName("cz.kb(I)V")
    public static final void method1997() {
        field824 = field832;
        Statics.field2050 = true;
    }

    @ObfuscatedName("au.ko(Ljava/lang/String;I)V")
    public static final void method507(String arg0) {
        if (Statics.field568 != null) {
            class188 var1 = class188.method2887(class184.field2230, field693.field1298);
            var1.field2335.method5272(class301.method4819(arg0));
            var1.field2335.method5310(arg0);
            field693.method2109(var1);
        }
    }

    @ObfuscatedName("v.kc(Ljava/lang/String;I)V")
    public static final void method139(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method2887(class184.field2253, field693.field1298);
            var1.field2335.method5272(class301.method4819(arg0));
            var1.field2335.method5310(arg0);
            field693.method2109(var1);
        }
    }

    @ObfuscatedName("ck.kg(I)V")
    public static final void method1923() {
        class188 var0 = class188.method2887(class184.field2253, field693.field1298);
        var0.field2335.method5272(0);
        field693.method2109(var0);
    }

    @ObfuscatedName("aq.kt(IB)V")
    public static void method530(int arg0) {
        for (class180 var1 = (class180) field849.method5529(); var1 != null; var1 = (class180) field849.method5530()) {
            if ((long) arg0 == (var1.field2115 >> 48 & 0xFFFFL)) {
                var1.method3351();
            }
        }
    }

    @ObfuscatedName("z.ks(Lhn;I)I")
    public static int method188(class218 arg0) {
        class180 var1 = (class180) field849.method5527(((long) arg0.field2573 << 32) + (long) arg0.field2574);
        return var1 == null ? arg0.field2646 : var1.field2112;
    }

    @ObfuscatedName("ie.kd(Lhn;I)Z")
    public static boolean method4085(class218 arg0) {
        return arg0.field2679;
    }

    @ObfuscatedName("dw.ki(Lhn;I)Ljava/lang/String;")
    public static String method2320(class218 arg0) {
        if (class219.method1927(method188(arg0)) == 0) {
            return null;
        } else if (arg0.field2648 == null || arg0.field2648.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2648;
        }
    }

    @ObfuscatedName("ad.kf(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method663(String arg0, boolean arg1) {
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
        if (Statics.field478 != null) {
            var3 = "/p=" + Statics.field478;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3632 + "/a=" + Statics.field673 + var3 + "/";
    }

    @ObfuscatedName("be.kr(Ljava/lang/String;B)V")
    public static void method1045(String arg0) {
        Statics.field478 = arg0;
        try {
            String var1 = Statics.field3618.getParameter(Integer.toString(18));
            String var2 = Statics.field3618.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class208.method1588(Statics.method184() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field3618;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ad.kw(Ljava/lang/String;ZI)V")
    public static void method659(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3423; var5++) {
            class256 var6 = class256.method4164(var5);
            if ((!arg1 || var6.field3447) && var6.field3405 == -1 && var6.field3407.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2003 = -1;
                    Statics.field115 = null;
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
        Statics.field115 = var3;
        Statics.field2500 = 0;
        Statics.field2003 = var4;
        String[] var9 = new String[Statics.field2003];
        for (int var10 = 0; var10 < Statics.field2003; var10++) {
            var9[var10] = class256.method4164(var3[var10]).field3407;
        }
        short[] var11 = Statics.field115;
        class190.method4883(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("client.ky(I)Ljz;")
    public class284 method1183() {
        return Statics.field2392 == null ? null : Statics.field2392.field626;
    }

    @ObfuscatedName("ax.kk(IIIZI)V")
    public static void method501(int arg0, int arg1, int arg2, boolean arg3) {
        class188 var4 = class188.method2887(class184.field2256, field693.field1298);
        var4.field2335.method5306(arg3 ? field728 : 0);
        var4.field2335.method5164(arg0);
        var4.field2335.method5114(arg1);
        var4.field2335.method5272(arg2);
        field693.method2109(var4);
    }

    @ObfuscatedName("ig.kx(I)Z")
    public static boolean method4433() {
        return field684 >= 2;
    }

    @ObfuscatedName("m.kn(II)V")
    public static void method107(int arg0) {
        field721 = arg0;
    }

    @ObfuscatedName("as.lj(I)V")
    public static void method538() {
        if (field721 == 1) {
            field729 = true;
        }
    }

    @ObfuscatedName("kx.ld(B)V")
    public static void method5469() {
        if (!field729 || Statics.field2392 == null) {
            return;
        }
        int var0 = Statics.field2392.field978[0];
        int var1 = Statics.field2392.field996[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field938 = Statics.field2392.field983;
        int var2 = method228(Statics.field2392.field983, Statics.field2392.field940, Statics.field2055) - field777;
        if (var2 < Statics.field167) {
            Statics.field167 = var2;
        }
        Statics.field1792 = Statics.field2392.field940;
        field729 = false;
    }

    @ObfuscatedName("bt.lr(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1060(String arg0) {
        class230[] var1 = class230.method1984();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class230 var3 = var1[var2];
            if (var3.field3101 != -1 && arg0.startsWith(class82.method3404(var3.field3101))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3101).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bv.lh(B)V")
    public static void method1764() {
        if (Statics.field2717 == null) {
            return;
        }
        field889 = field656;
        Statics.field2717.method3999();
        for (int var0 = 0; var0 < field762.length; var0++) {
            if (field762[var0] != null) {
                Statics.field2717.method4012((field762[var0].field983 >> 7) + Statics.field1262, (field762[var0].field940 >> 7) + Statics.field2367);
            }
        }
    }
}

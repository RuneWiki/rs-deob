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

public final class client extends class63 implements class291 {

    @ObfuscatedName("client.w")
    public static class182[] field832 = new class182[4];

    @ObfuscatedName("client.at")
    public static boolean field908 = true;

    @ObfuscatedName("client.bh")
    public static int field646 = 1;

    @ObfuscatedName("client.by")
    public static int field647 = 0;

    @ObfuscatedName("client.br")
    public static int field648 = 0;

    @ObfuscatedName("client.bf")
    public static boolean field660 = false;

    @ObfuscatedName("client.bz")
    public static boolean field911 = false;

    @ObfuscatedName("client.bi")
    public static int field651 = -1;

    @ObfuscatedName("client.bk")
    public static int field652 = -1;

    @ObfuscatedName("client.bw")
    public static boolean field653 = false;

    @ObfuscatedName("client.bo")
    public static int field654 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field896 = true;

    @ObfuscatedName("client.cr")
    public static int field656 = 0;

    @ObfuscatedName("client.ch")
    public static long field657 = -1L;

    @ObfuscatedName("client.cl")
    public static int field658 = -1;

    @ObfuscatedName("client.cw")
    public static int field659 = -1;

    @ObfuscatedName("client.cp")
    public static long field795 = -1L;

    @ObfuscatedName("client.cu")
    public static boolean field661 = true;

    @ObfuscatedName("client.ct")
    public static boolean field783 = false;

    @ObfuscatedName("client.ck")
    public static int field663 = 0;

    @ObfuscatedName("client.cy")
    public static int field741 = 0;

    @ObfuscatedName("client.cg")
    public static int field665 = 0;

    @ObfuscatedName("client.cv")
    public static int field666 = 0;

    @ObfuscatedName("client.cs")
    public static int field710 = 0;

    @ObfuscatedName("client.cn")
    public static int field668 = 0;

    @ObfuscatedName("client.co")
    public static int field821 = 0;

    @ObfuscatedName("client.dh")
    public static int field670 = 0;

    @ObfuscatedName("client.dl")
    public static int field671 = 0;

    @ObfuscatedName("client.de")
    public static class94 field672 = class94.field1178;

    @ObfuscatedName("client.dw")
    public static class94 field673 = class94.field1178;

    @ObfuscatedName("client.dq")
    public static int field675 = 0;

    @ObfuscatedName("client.dm")
    public static int field886 = 0;

    @ObfuscatedName("client.dp")
    public static int field865 = 0;

    @ObfuscatedName("client.eh")
    public static int field679 = 0;

    @ObfuscatedName("client.eb")
    public static int field649 = 0;

    @ObfuscatedName("client.ek")
    public static int field893 = 0;

    @ObfuscatedName("client.ew")
    public static int field682 = 0;

    @ObfuscatedName("client.ej")
    public static int field683 = 0;

    @ObfuscatedName("client.eo")
    public static class170 field873 = class170.field2022;

    @ObfuscatedName("client.el")
    public static boolean field685 = false;

    @ObfuscatedName("client.ea")
    public static class98 field806 = new class98();

    @ObfuscatedName("client.en")
    public class311 field687;

    @ObfuscatedName("client.fn")
    public class10 field688;

    @ObfuscatedName("client.ft")
    public static byte[] field689 = null;

    @ObfuscatedName("client.fj")
    public static class89[] field690 = new class89[32768];

    @ObfuscatedName("client.fp")
    public static int field691 = 0;

    @ObfuscatedName("client.ff")
    public static int[] field692 = new int[32768];

    @ObfuscatedName("client.fs")
    public static int field827 = 0;

    @ObfuscatedName("client.fk")
    public static int[] field655 = new int[250];

    @ObfuscatedName("client.fx")
    public static final class105 field695 = new class105();

    @ObfuscatedName("client.fh")
    public static int field734 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field697 = false;

    @ObfuscatedName("client.fb")
    public static boolean field698 = true;

    @ObfuscatedName("client.fg")
    public static class283 field699 = new class283();

    @ObfuscatedName("client.fl")
    public static HashMap field700 = new HashMap();

    @ObfuscatedName("client.gg")
    public static int field701 = 0;

    @ObfuscatedName("client.gm")
    public static int field702 = 1;

    @ObfuscatedName("client.gh")
    public static int field703 = 0;

    @ObfuscatedName("client.gu")
    public static int field704 = 1;

    @ObfuscatedName("client.go")
    public static int field705 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field707 = false;

    @ObfuscatedName("client.gi")
    public static int[][][] field684 = new int[4][13][13];

    @ObfuscatedName("client.gp")
    public static final int[] field709 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gd")
    public static int field851 = 0;

    @ObfuscatedName("client.hv")
    public static int field712 = 2301979;

    @ObfuscatedName("client.hj")
    public static int field713 = 5063219;

    @ObfuscatedName("client.hm")
    public static int field714 = 3353893;

    @ObfuscatedName("client.hu")
    public static int field715 = 7759444;

    @ObfuscatedName("client.hx")
    public static boolean field693 = false;

    @ObfuscatedName("client.ho")
    public static int field721 = 0;

    @ObfuscatedName("client.hr")
    public static int field778 = 128;

    @ObfuscatedName("client.ht")
    public static int field831 = 0;

    @ObfuscatedName("client.hp")
    public static int field720 = 0;

    @ObfuscatedName("client.hb")
    public static int field761 = 0;

    @ObfuscatedName("client.hd")
    public static int field722 = 0;

    @ObfuscatedName("client.hw")
    public static int field723 = 0;

    @ObfuscatedName("client.iq")
    public static int field724 = 0;

    @ObfuscatedName("client.ip")
    public static int field868 = 50;

    @ObfuscatedName("client.in")
    public static int field756 = 0;

    @ObfuscatedName("client.io")
    public static int field762 = 0;

    @ObfuscatedName("client.ic")
    public static int field789 = 0;

    @ObfuscatedName("client.ia")
    public static int field729 = 12;

    @ObfuscatedName("client.ib")
    public static int field677 = 6;

    @ObfuscatedName("client.ij")
    public static int field731 = 0;

    @ObfuscatedName("client.il")
    public static boolean field650 = false;

    @ObfuscatedName("client.im")
    public static int field733 = 0;

    @ObfuscatedName("client.it")
    public static String field745 = null;

    @ObfuscatedName("client.is")
    public static boolean field844 = false;

    @ObfuscatedName("client.iy")
    public static int field919 = 0;

    @ObfuscatedName("client.ir")
    public static int field736 = 0;

    @ObfuscatedName("client.ik")
    public static int field737 = 50;

    @ObfuscatedName("client.iw")
    public static int[] field784 = new int[field737];

    @ObfuscatedName("client.if")
    public static int[] field739 = new int[field737];

    @ObfuscatedName("client.ie")
    public static int[] field740 = new int[field737];

    @ObfuscatedName("client.iu")
    public static int[] field727 = new int[field737];

    @ObfuscatedName("client.iv")
    public static int[] field742 = new int[field737];

    @ObfuscatedName("client.jl")
    public static int[] field743 = new int[field737];

    @ObfuscatedName("client.jb")
    public static int[] field744 = new int[field737];

    @ObfuscatedName("client.jx")
    public static String[] field842 = new String[field737];

    @ObfuscatedName("client.je")
    public static int[][] field746 = new int[104][104];

    @ObfuscatedName("client.jm")
    public static int field747 = 0;

    @ObfuscatedName("client.jq")
    public static int field748 = -1;

    @ObfuscatedName("client.jt")
    public static int field749 = -1;

    @ObfuscatedName("client.jd")
    public static int field750 = 0;

    @ObfuscatedName("client.jv")
    public static int field768 = 0;

    @ObfuscatedName("client.jy")
    public static int field751 = 0;

    @ObfuscatedName("client.ji")
    public static int field753 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field754 = true;

    @ObfuscatedName("client.jj")
    public static int field755 = 0;

    @ObfuscatedName("client.jw")
    public static int field882 = 0;

    @ObfuscatedName("client.jh")
    public static int field807 = 0;

    @ObfuscatedName("client.jo")
    public static int field758 = 0;

    @ObfuscatedName("client.ja")
    public static int field759 = 0;

    @ObfuscatedName("client.jg")
    public static int field760 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field849 = false;

    @ObfuscatedName("client.jc")
    public static int field899 = 0;

    @ObfuscatedName("client.jz")
    public static int field763 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field764 = true;

    @ObfuscatedName("client.kb")
    public static class76[] field765 = new class76[2048];

    @ObfuscatedName("client.kz")
    public static int field766 = -1;

    @ObfuscatedName("client.ka")
    public static int field767 = 0;

    @ObfuscatedName("client.ko")
    public static boolean field726 = true;

    @ObfuscatedName("client.kp")
    public static int field769 = 0;

    @ObfuscatedName("client.kq")
    public static int field770 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field771 = new int[1000];

    @ObfuscatedName("client.kl")
    public static final int[] field772 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kr")
    public static String[] field773 = new String[8];

    @ObfuscatedName("client.kv")
    public static boolean[] field774 = new boolean[8];

    @ObfuscatedName("client.kw")
    public static int[] field728 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ku")
    public static int field815 = -1;

    @ObfuscatedName("client.kc")
    public static class273[][][] field777 = new class273[4][104][104];

    @ObfuscatedName("client.kh")
    public static class273 field877 = new class273();

    @ObfuscatedName("client.km")
    public static class273 field779 = new class273();

    @ObfuscatedName("client.ky")
    public static class273 field735 = new class273();

    @ObfuscatedName("client.kj")
    public static int[] field781 = new int[25];

    @ObfuscatedName("client.kd")
    public static int[] field782 = new int[25];

    @ObfuscatedName("client.lt")
    public static int[] field676 = new int[25];

    @ObfuscatedName("client.li")
    public static int field883 = 0;

    @ObfuscatedName("client.lk")
    public static boolean field785 = false;

    @ObfuscatedName("client.lw")
    public static int field786 = 0;

    @ObfuscatedName("client.ld")
    public static int[] field787 = new int[500];

    @ObfuscatedName("client.ln")
    public static int[] field788 = new int[500];

    @ObfuscatedName("client.lz")
    public static int[] field845 = new int[500];

    @ObfuscatedName("client.lp")
    public static int[] field790 = new int[500];

    @ObfuscatedName("client.lv")
    public static String[] field791 = new String[500];

    @ObfuscatedName("client.la")
    public static String[] field792 = new String[500];

    @ObfuscatedName("client.lb")
    public static boolean[] field793 = new boolean[500];

    @ObfuscatedName("client.ls")
    public static boolean field794 = false;

    @ObfuscatedName("client.ly")
    public static boolean field664 = false;

    @ObfuscatedName("client.lq")
    public static boolean field725 = false;

    @ObfuscatedName("client.lu")
    public static boolean field797 = true;

    @ObfuscatedName("client.lj")
    public static int field798 = -1;

    @ObfuscatedName("client.lo")
    public static int field799 = -1;

    @ObfuscatedName("client.md")
    public static int field800 = 0;

    @ObfuscatedName("client.mc")
    public static int field752 = 50;

    @ObfuscatedName("client.mi")
    public static int field802 = 0;

    @ObfuscatedName("client.mv")
    public static boolean field804 = false;

    @ObfuscatedName("client.ms")
    public static int field805 = -1;

    @ObfuscatedName("client.mb")
    public static int field837 = -1;

    @ObfuscatedName("client.mj")
    public static String field852 = null;

    @ObfuscatedName("client.mu")
    public static String field808 = null;

    @ObfuscatedName("client.mw")
    public static int field874 = -1;

    @ObfuscatedName("client.mn")
    public static class329 field834 = new class329(8);

    @ObfuscatedName("client.mr")
    public static int field811 = 0;

    @ObfuscatedName("client.mk")
    public static int field812 = -1;

    @ObfuscatedName("client.mt")
    public static int field813 = 0;

    @ObfuscatedName("client.ml")
    public static int field866 = 0;

    @ObfuscatedName("client.mh")
    public static class227 field823 = null;

    @ObfuscatedName("client.mp")
    public static int field816 = 0;

    @ObfuscatedName("client.mo")
    public static int field817 = 0;

    @ObfuscatedName("client.mm")
    public static int field776 = 0;

    @ObfuscatedName("client.mx")
    public static int field819 = -1;

    @ObfuscatedName("client.nu")
    public static boolean field820 = false;

    @ObfuscatedName("client.ng")
    public static class227 field870 = null;

    @ObfuscatedName("client.ns")
    public static class227 field822 = null;

    @ObfuscatedName("client.nm")
    public static class227 field833 = null;

    @ObfuscatedName("client.ni")
    public static int field824 = 0;

    @ObfuscatedName("client.nl")
    public static int field810 = 0;

    @ObfuscatedName("client.nc")
    public static class227 field826 = null;

    @ObfuscatedName("client.nr")
    public static boolean field860 = false;

    @ObfuscatedName("client.nv")
    public static int field828 = -1;

    @ObfuscatedName("client.nf")
    public static int field717 = -1;

    @ObfuscatedName("client.ny")
    public static boolean field830 = false;

    @ObfuscatedName("client.ne")
    public static int field854 = -1;

    @ObfuscatedName("client.nh")
    public static int field863 = -1;

    @ObfuscatedName("client.na")
    public static boolean field801 = false;

    @ObfuscatedName("client.nb")
    public static int field738 = 1;

    @ObfuscatedName("client.nq")
    public static int[] field835 = new int[32];

    @ObfuscatedName("client.nt")
    public static int field836 = 0;

    @ObfuscatedName("client.np")
    public static int[] field876 = new int[32];

    @ObfuscatedName("client.nd")
    public static int field838 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field839 = new int[32];

    @ObfuscatedName("client.ob")
    public static int field840 = 0;

    @ObfuscatedName("client.od")
    public static int field841 = 0;

    @ObfuscatedName("client.oh")
    public static int field880 = 0;

    @ObfuscatedName("client.oj")
    public static int field843 = 0;

    @ObfuscatedName("client.or")
    public static int field686 = 0;

    @ObfuscatedName("client.ox")
    public static int field681 = 0;

    @ObfuscatedName("client.oc")
    public static int field846 = 0;

    @ObfuscatedName("client.om")
    public static int field847 = 0;

    @ObfuscatedName("client.oo")
    public static class273 field848 = new class273();

    @ObfuscatedName("client.ow")
    public static class273 field716 = new class273();

    @ObfuscatedName("client.on")
    public static class273 field850 = new class273();

    @ObfuscatedName("client.of")
    public static class329 field892 = new class329(512);

    @ObfuscatedName("client.og")
    public static int field825 = 0;

    @ObfuscatedName("client.op")
    public static int field853 = -2;

    @ObfuscatedName("client.ol")
    public static boolean[] field902 = new boolean[100];

    @ObfuscatedName("client.ot")
    public static boolean[] field855 = new boolean[100];

    @ObfuscatedName("client.oi")
    public static boolean[] field856 = new boolean[100];

    @ObfuscatedName("client.ou")
    public static int[] field857 = new int[100];

    @ObfuscatedName("client.oe")
    public static int[] field918 = new int[100];

    @ObfuscatedName("client.oy")
    public static int[] field859 = new int[100];

    @ObfuscatedName("client.oa")
    public static int[] field809 = new int[100];

    @ObfuscatedName("client.ok")
    public static int field861 = 0;

    @ObfuscatedName("client.ov")
    public static long field862 = 0L;

    @ObfuscatedName("client.pb")
    public static boolean field669 = true;

    @ObfuscatedName("client.ph")
    public static int[] field864 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.px")
    public static int field796 = 0;

    @ObfuscatedName("client.ps")
    public static int field867 = 0;

    @ObfuscatedName("client.pm")
    public static String field872 = "";

    @ObfuscatedName("client.pg")
    public static long[] field869 = new long[100];

    @ObfuscatedName("client.pk")
    public static int field708 = 0;

    @ObfuscatedName("client.pq")
    public static int field871 = 0;

    @ObfuscatedName("client.pi")
    public static int[] field662 = new int[128];

    @ObfuscatedName("client.pl")
    public static int[] field694 = new int[128];

    @ObfuscatedName("client.py")
    public static long field818 = -1L;

    @ObfuscatedName("client.pw")
    public static int field875 = -1;

    @ObfuscatedName("client.pz")
    public static int field757 = 0;

    @ObfuscatedName("client.pa")
    public static int[] field718 = new int[1000];

    @ObfuscatedName("client.pf")
    public static int[] field878 = new int[1000];

    @ObfuscatedName("client.ql")
    public static class336[] field879 = new class336[1000];

    @ObfuscatedName("client.qf")
    public static int field775 = 0;

    @ObfuscatedName("client.qu")
    public static int field881 = 0;

    @ObfuscatedName("client.qb")
    public static int field895 = 0;

    @ObfuscatedName("client.qc")
    public static int field780 = -1;

    @ObfuscatedName("client.qk")
    public static boolean field884 = false;

    @ObfuscatedName("client.qs")
    public static int field885 = 0;

    @ObfuscatedName("client.qg")
    public static int[] field858 = new int[50];

    @ObfuscatedName("client.qo")
    public static int[] field887 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field888 = new int[50];

    @ObfuscatedName("client.qt")
    public static int[] field889 = new int[50];

    @ObfuscatedName("client.qj")
    public static class111[] field890 = new class111[50];

    @ObfuscatedName("client.qx")
    public static boolean field891 = false;

    @ObfuscatedName("client.rd")
    public static boolean[] field903 = new boolean[5];

    @ObfuscatedName("client.ri")
    public static int[] field680 = new int[5];

    @ObfuscatedName("client.rj")
    public static int[] field894 = new int[5];

    @ObfuscatedName("client.rt")
    public static int[] field706 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field645 = new int[5];

    @ObfuscatedName("client.rx")
    public static short field897 = 256;

    @ObfuscatedName("client.rq")
    public static short field898 = 205;

    @ObfuscatedName("client.rm")
    public static short field915 = 256;

    @ObfuscatedName("client.rr")
    public static short field900 = 320;

    @ObfuscatedName("client.rp")
    public static short field901 = 1;

    @ObfuscatedName("client.re")
    public static short field732 = 32767;

    @ObfuscatedName("client.rb")
    public static short field829 = 1;

    @ObfuscatedName("client.ra")
    public static short field904 = 32767;

    @ObfuscatedName("client.rh")
    public static int field905 = 0;

    @ObfuscatedName("client.rw")
    public static int field906 = 0;

    @ObfuscatedName("client.rg")
    public static int field907 = 0;

    @ObfuscatedName("client.sd")
    public static int field696 = 0;

    @ObfuscatedName("client.sf")
    public static int field909 = 0;

    @ObfuscatedName("client.sl")
    public static class224 field910 = new class224();

    @ObfuscatedName("client.si")
    public static int field814 = -1;

    @ObfuscatedName("client.sk")
    public static int field912 = -1;

    @ObfuscatedName("client.sq")
    public static class341 field913 = new class340();

    @ObfuscatedName("client.ss")
    public static class19[] field914 = new class19[8];

    @ObfuscatedName("client.sw")
    public static class77 field803 = new class77();

    @ObfuscatedName("client.sg")
    public static int field916 = -1;

    @ObfuscatedName("client.sr")
    public static ArrayList field917 = new ArrayList(10);

    @ObfuscatedName("client.sm")
    public static int field923 = 0;

    @ObfuscatedName("client.sp")
    public static int field667 = 0;

    @ObfuscatedName("client.tj")
    public static final class75 field920 = new class75();

    @ObfuscatedName("client.tc")
    public static int[] field921 = new int[50];

    @ObfuscatedName("client.tr")
    public static int[] field922 = new int[50];

    @ObfuscatedName("cx.fe(I)Lma;")
    public static class344 method1672() {
        return Statics.field199;
    }

    @ObfuscatedName("client.ar(B)V")
    public final void method986() {
    }

    public final void init() {
        if (!this.method903()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field698 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1160)) {
                            field660 = true;
                        } else {
                            field660 = false;
                        }
                        break;
                    case 4:
                        if (field651 == -1) {
                            field651 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field647 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field373 = class200.method3402(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field126 = class241.method1104(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1160)) {
                        }
                        break;
                    case 9:
                        Statics.field318 = var2;
                        break;
                    case 10:
                        class242[] var3 = new class242[] { class242.field3140, class242.field3137, class242.field3139, class242.field3143, class242.field3138, class242.field3141 };
                        Statics.field1175 = (class242) class205.method3134(var3, Integer.parseInt(var2));
                        if (Statics.field1175 == class242.field3141) {
                            Statics.field93 = class349.field4066;
                        } else {
                            Statics.field93 = class349.field4073;
                        }
                        break;
                    case 12:
                        field646 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field2456 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field648 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field76 = var2;
                }
            }
        }
        method538();
        Statics.field253 = this.getCodeBase().getHost();
        String var4 = Statics.field126.field3134;
        byte var5 = 0;
        try {
            Statics.field2506 = 21;
            Statics.field2069 = var5;
            try {
                Statics.field366 = System.getProperty("os.name");
            } catch (Exception var24) {
                Statics.field366 = "Unknown";
            }
            Statics.field1078 = Statics.field366.toLowerCase();
            try {
                Statics.field1560 = System.getProperty("user.home");
                if (Statics.field1560 != null) {
                    Statics.field1560 = Statics.field1560 + "/";
                }
            } catch (Exception var23) {
            }
            try {
                if (Statics.field1078.startsWith("win")) {
                    if (Statics.field1560 == null) {
                        Statics.field1560 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1560 == null) {
                    Statics.field1560 = System.getenv("HOME");
                }
                if (Statics.field1560 != null) {
                    Statics.field1560 = Statics.field1560 + "/";
                }
            } catch (Exception var22) {
            }
            if (Statics.field1560 == null) {
                Statics.field1560 = "~/";
            }
            Statics.field1118 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1560, "/tmp/", "" };
            Statics.field1319 = new String[] { ".jagex_cache_" + Statics.field2069, ".file_store_" + Statics.field2069 };
            label142: for (int var9 = 0; var9 < 4; var9++) {
                Statics.field2063 = class177.method796("oldschool", var4, var9);
                if (!Statics.field2063.exists()) {
                    Statics.field2063.mkdirs();
                }
                File[] var10 = Statics.field2063.listFiles();
                if (var10 == null) {
                    break;
                }
                File[] var11 = var10;
                int var12 = 0;
                while (true) {
                    if (var12 >= var11.length) {
                        break label142;
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
                    } catch (Exception var21) {
                        var16 = false;
                    }
                    if (!var16) {
                        break;
                    }
                    var12++;
                }
            }
            File var18 = Statics.field2063;
            Statics.field2073 = var18;
            if (!Statics.field2073.exists()) {
                throw new RuntimeException("");
            }
            class179.field2077 = true;
            class177.method215();
            class177.field2067 = new class353(new class354(class179.method3098("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class177.field2059 = new class353(new class354(class179.method3098("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2557 = new class353[Statics.field2506];
            for (int var19 = 0; var19 < Statics.field2506; var19++) {
                Statics.field2557[var19] = new class353(new class354(class179.method3098("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var25) {
            class352.method3694((String) null, var25);
        }
        Statics.field148 = this;
        Statics.field289 = field651;
        if (field652 == -1) {
            field652 = 0;
        }
        this.method857(765, 503, 193);
    }

    @ObfuscatedName("aa.fj(S)V")
    public static final void method538() {
        class143.field1840 = false;
        field911 = false;
    }

    @ObfuscatedName("client.ac(B)V")
    public final void method979() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1461 = null;
            Statics.field2070 = null;
            Statics.field110 = (byte[][][]) null;
        } else {
            Statics.field1461 = var1;
            Statics.field2070 = new int[var1.length];
            Statics.field110 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1461.length; var3++) {
                Statics.field110[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field3584 = field648 == 0 ? 43594 : field646 + 40000;
        Statics.field1267 = field648 == 0 ? 443 : field646 + 50000;
        Statics.field3149 = Statics.field3584;
        Statics.field2552 = class225.field2570;
        Statics.field367 = class225.field2566;
        Statics.field2558 = class225.field2567;
        Statics.field332 = class225.field2568;
        Statics.field101 = new class153();
        this.method851();
        this.method852();
        Statics.field3297 = this.method997();
        Statics.field31 = new class319(255, class177.field2067, class177.field2059, 500000);
        class354 var4 = null;
        class83 var5 = new class83();
        try {
            var4 = Statics.method529("", Statics.field1175.field3142, false);
            byte[] var6 = new byte[(int) var4.method6134()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method6133(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class83(new class311(var6));
        } catch (Exception var15) {
        }
        try {
            if (var4 != null) {
                var4.method6135();
            }
        } catch (Exception var14) {
        }
        Statics.field3618 = var5;
        this.method849();
        String var13 = Statics.field604;
        class61.field441 = this;
        if (var13 != null) {
            class61.field440 = var13;
        }
        if (field648 != 0) {
            field783 = true;
        }
        method111(Statics.field3618.field1055);
        Statics.field2037 = new class84(Statics.field93);
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method985() {
        field656++;
        this.method1449();
        class246.method703();
        class207.method3124();
        method4939();
        class55.method1939();
        class64.method39();
        if (Statics.field3297 != null) {
            int var1 = Statics.field3297.method729();
            field847 = var1;
        }
        if (field654 == 0) {
            Statics.method792();
            class63.method131();
        } else if (field654 == 5) {
            class95.method4450(this);
            Statics.method792();
            class63.method131();
        } else if (field654 == 10 || field654 == 11) {
            class95.method4450(this);
        } else if (field654 == 20) {
            class95.method4450(this);
            this.method1375();
        } else if (field654 == 25) {
            method319(false);
            field701 = 0;
            boolean var2 = true;
            for (int var3 = 0; var3 < Statics.field152.length; var3++) {
                if (Statics.field298[var3] != -1 && Statics.field152[var3] == null) {
                    Statics.field152[var3] = Statics.field479.method3834(Statics.field298[var3], 0);
                    if (Statics.field152[var3] == null) {
                        var2 = false;
                        field701++;
                    }
                }
                if (Statics.field77[var3] != -1 && Statics.field591[var3] == null) {
                    Statics.field591[var3] = Statics.field479.method3835(Statics.field77[var3], 0, Statics.field2732[var3]);
                    if (Statics.field591[var3] == null) {
                        var2 = false;
                        field701++;
                    }
                }
            }
            if (var2) {
                field703 = 0;
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field152.length; var5++) {
                    byte[] var6 = Statics.field591[var5];
                    if (var6 != null) {
                        int var7 = (Statics.field2076[var5] >> 8) * 64 - Statics.field3157;
                        int var8 = (Statics.field2076[var5] & 0xFF) * 64 - Statics.field301;
                        if (field707) {
                            var7 = 10;
                            var8 = 10;
                        }
                        boolean var10 = true;
                        class311 var11 = new class311(var6);
                        int var12 = -1;
                        label482: while (true) {
                            int var13 = var11.method5130();
                            if (var13 == 0) {
                                var4 &= var10;
                                break;
                            }
                            var12 += var13;
                            int var15 = 0;
                            boolean var16 = false;
                            while (true) {
                                while (!var16) {
                                    int var18 = var11.method5096();
                                    if (var18 == 0) {
                                        continue label482;
                                    }
                                    var15 += var18 - 1;
                                    int var19 = var15 & 0x3F;
                                    int var20 = var15 >> 6 & 0x3F;
                                    int var21 = var11.method5274() >> 2;
                                    int var22 = var7 + var20;
                                    int var23 = var8 + var19;
                                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                                        class265 var24 = class265.method325(var12);
                                        if (var21 != 22 || !field911 || var24.field3424 != 0 || var24.field3398 == 1 || var24.field3381) {
                                            if (!var24.method4280()) {
                                                field703++;
                                                var10 = false;
                                            }
                                            var16 = true;
                                        }
                                    }
                                }
                                int var17 = var11.method5096();
                                if (var17 == 0) {
                                    break;
                                }
                                var11.method5274();
                            }
                        }
                    }
                }
                if (var4) {
                    if (field705 != 0) {
                        method3669(class234.field2795 + class91.field1156 + class91.field1155 + 100 + "%" + class91.field1154, true);
                    }
                    method4939();
                    Statics.field537.method3046();
                    for (int var25 = 0; var25 < 4; var25++) {
                        field832[var25].method3316();
                    }
                    for (int var26 = 0; var26 < 4; var26++) {
                        for (int var27 = 0; var27 < 104; var27++) {
                            for (int var28 = 0; var28 < 104; var28++) {
                                class65.field508[var26][var27][var28] = 0;
                            }
                        }
                    }
                    method4939();
                    class65.method3634();
                    int var29 = Statics.field152.length;
                    for (class85 var30 = (class85) class85.field1076.method4540(); var30 != null; var30 = (class85) class85.field1076.method4545()) {
                        if (var30.field1089 != null) {
                            Statics.field351.method2185(var30.field1089);
                            var30.field1089 = null;
                        }
                        if (var30.field1083 != null) {
                            Statics.field351.method2185(var30.field1083);
                            var30.field1083 = null;
                        }
                    }
                    class85.field1076.method4537();
                    method319(true);
                    if (!field707) {
                        for (int var31 = 0; var31 < var29; var31++) {
                            int var32 = (Statics.field2076[var31] >> 8) * 64 - Statics.field3157;
                            int var33 = (Statics.field2076[var31] & 0xFF) * 64 - Statics.field301;
                            byte[] var34 = Statics.field152[var31];
                            if (var34 != null) {
                                method4939();
                                class65.method1131(var34, var32, var33, Statics.field2113 * 8 - 48, Statics.field2014 * 8 - 48, field832);
                            }
                        }
                        for (int var35 = 0; var35 < var29; var35++) {
                            int var36 = (Statics.field2076[var35] >> 8) * 64 - Statics.field3157;
                            int var37 = (Statics.field2076[var35] & 0xFF) * 64 - Statics.field301;
                            byte[] var38 = Statics.field152[var35];
                            if (var38 == null && Statics.field2014 < 800) {
                                method4939();
                                class65.method536(var36, var37, 64, 64);
                            }
                        }
                        method319(true);
                        for (int var39 = 0; var39 < var29; var39++) {
                            byte[] var40 = Statics.field591[var39];
                            if (var40 != null) {
                                int var41 = (Statics.field2076[var39] >> 8) * 64 - Statics.field3157;
                                int var42 = (Statics.field2076[var39] & 0xFF) * 64 - Statics.field301;
                                method4939();
                                class65.method3255(var40, var41, var42, Statics.field537, field832);
                            }
                        }
                    }
                    if (field707) {
                        int var43 = 0;
                        label394: while (true) {
                            if (var43 >= 4) {
                                for (int var54 = 0; var54 < 13; var54++) {
                                    for (int var55 = 0; var55 < 13; var55++) {
                                        int var56 = field684[0][var54][var55];
                                        if (var56 == -1) {
                                            class65.method536(var54 * 8, var55 * 8, 8, 8);
                                        }
                                    }
                                }
                                method319(true);
                                int var57 = 0;
                                while (true) {
                                    if (var57 >= 4) {
                                        break label394;
                                    }
                                    method4939();
                                    for (int var58 = 0; var58 < 13; var58++) {
                                        label351: for (int var59 = 0; var59 < 13; var59++) {
                                            int var60 = field684[var57][var58][var59];
                                            if (var60 != -1) {
                                                int var61 = var60 >> 24 & 0x3;
                                                int var62 = var60 >> 1 & 0x3;
                                                int var63 = var60 >> 14 & 0x3FF;
                                                int var64 = var60 >> 3 & 0x7FF;
                                                int var65 = (var63 / 8 << 8) + var64 / 8;
                                                for (int var66 = 0; var66 < Statics.field2076.length; var66++) {
                                                    if (Statics.field2076[var66] == var65 && Statics.field591[var66] != null) {
                                                        byte[] var67 = Statics.field591[var66];
                                                        int var68 = var58 * 8;
                                                        int var69 = var59 * 8;
                                                        int var70 = (var63 & 0x7) * 8;
                                                        int var71 = (var64 & 0x7) * 8;
                                                        class143 var72 = Statics.field537;
                                                        class182[] var73 = field832;
                                                        class311 var74 = new class311(var67);
                                                        int var75 = -1;
                                                        while (true) {
                                                            int var76 = var74.method5130();
                                                            if (var76 == 0) {
                                                                continue label351;
                                                            }
                                                            var75 += var76;
                                                            int var77 = 0;
                                                            while (true) {
                                                                int var78 = var74.method5096();
                                                                if (var78 == 0) {
                                                                    break;
                                                                }
                                                                var77 += var78 - 1;
                                                                int var79 = var77 & 0x3F;
                                                                int var80 = var77 >> 6 & 0x3F;
                                                                int var81 = var77 >> 12;
                                                                int var82 = var74.method5274();
                                                                int var83 = var82 >> 2;
                                                                int var84 = var82 & 0x3;
                                                                if (var61 == var81 && var80 >= var70 && var80 < var70 + 8 && var79 >= var71 && var79 < var71 + 8) {
                                                                    class265 var85 = class265.method325(var75);
                                                                    int var86 = var68 + class226.method4243(var80 & 0x7, var79 & 0x7, var62, var85.field3419, var85.field3397, var84);
                                                                    int var87 = var69 + class226.method1723(var80 & 0x7, var79 & 0x7, var62, var85.field3419, var85.field3397, var84);
                                                                    if (var86 > 0 && var87 > 0 && var86 < 103 && var87 < 103) {
                                                                        int var88 = var57;
                                                                        if ((class65.field508[1][var86][var87] & 0x2) == 2) {
                                                                            var88 = var57 - 1;
                                                                        }
                                                                        class182 var89 = null;
                                                                        if (var88 >= 0) {
                                                                            var89 = var73[var88];
                                                                        }
                                                                        class65.method73(var57, var86, var87, var75, var62 + var84 & 0x3, var83, var72, var89);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var57++;
                                }
                            }
                            method4939();
                            for (int var44 = 0; var44 < 13; var44++) {
                                for (int var45 = 0; var45 < 13; var45++) {
                                    boolean var46 = false;
                                    int var47 = field684[var43][var44][var45];
                                    if (var47 != -1) {
                                        int var48 = var47 >> 24 & 0x3;
                                        int var49 = var47 >> 1 & 0x3;
                                        int var50 = var47 >> 14 & 0x3FF;
                                        int var51 = var47 >> 3 & 0x7FF;
                                        int var52 = (var50 / 8 << 8) + var51 / 8;
                                        for (int var53 = 0; var53 < Statics.field2076.length; var53++) {
                                            if (Statics.field2076[var53] == var52 && Statics.field152[var53] != null) {
                                                class65.method323(Statics.field152[var53], var43, var44 * 8, var45 * 8, var48, (var50 & 0x7) * 8, (var51 & 0x7) * 8, var49, field832);
                                                var46 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var46) {
                                        class65.method2182(var43, var44 * 8, var45 * 8);
                                    }
                                }
                            }
                            var43++;
                        }
                    }
                    method319(true);
                    method4939();
                    class65.method3375(Statics.field537, field832);
                    method319(true);
                    int var90 = class65.field507;
                    if (var90 > Statics.field1950) {
                        var90 = Statics.field1950;
                    }
                    if (var90 < Statics.field1950 - 1) {
                        int var91 = Statics.field1950 - 1;
                    }
                    if (field911) {
                        Statics.field537.method2928(class65.field507);
                    } else {
                        Statics.field537.method2928(0);
                    }
                    for (int var92 = 0; var92 < 104; var92++) {
                        for (int var93 = 0; var93 < 104; var93++) {
                            method1144(var92, var93);
                        }
                    }
                    method4939();
                    for (class78 var94 = (class78) field877.method4540(); var94 != null; var94 = (class78) field877.method4545()) {
                        if (var94.field931 == -1) {
                            var94.field935 = 0;
                            method69(var94);
                        } else {
                            var94.method3359();
                        }
                    }
                    class265.field3416.method3146();
                    if (Statics.field148.method971()) {
                        class197 var95 = class197.method1128(class193.field2300, field695.field1329);
                        var95.field2361.method5123(1057001181);
                        field695.method2155(var95);
                    }
                    if (!field707) {
                        int var96 = (Statics.field2113 - 6) / 8;
                        int var97 = (Statics.field2113 + 6) / 8;
                        int var98 = (Statics.field2014 - 6) / 8;
                        int var99 = (Statics.field2014 + 6) / 8;
                        for (int var100 = var96 - 1; var100 <= var97 + 1; var100++) {
                            for (int var101 = var98 - 1; var101 <= var99 + 1; var101++) {
                                if (var100 < var96 || var100 > var97 || var101 < var98 || var101 > var99) {
                                    Statics.field479.method3858("m" + var100 + "_" + var101);
                                    Statics.field479.method3858("l" + var100 + "_" + var101);
                                }
                            }
                        }
                    }
                    method575(30);
                    method4939();
                    Statics.field515 = (byte[][][]) null;
                    Statics.field509 = (byte[][][]) null;
                    Statics.field41 = (byte[][][]) null;
                    Statics.field3664 = (byte[][][]) null;
                    Statics.field53 = (int[][][]) null;
                    Statics.field512 = (byte[][][]) null;
                    Statics.field1174 = (int[][]) null;
                    Statics.field3326 = null;
                    Statics.field3182 = null;
                    Statics.field1173 = null;
                    Statics.field1999 = null;
                    Statics.field1284 = null;
                    class197 var102 = class197.method1128(class193.field2236, field695.field1329);
                    field695.method2155(var102);
                    Statics.field2575.method3259();
                    for (int var103 = 0; var103 < 32; var103++) {
                        field450[var103] = 0L;
                    }
                    for (int var104 = 0; var104 < 32; var104++) {
                        field460[var104] = 0L;
                    }
                    Statics.field32 = 0;
                } else {
                    field705 = 2;
                }
            } else {
                field705 = 1;
            }
        }
        if (field654 == 30) {
            this.method1249();
        } else if (field654 == 40 || field654 == 45) {
            this.method1375();
        }
    }

    @ObfuscatedName("client.av(ZI)V")
    public final void method871(boolean arg0) {
        boolean var2 = class207.method314();
        if (var2 && field884 && Statics.field193 != null) {
            Statics.field193.method2318();
        }
        if ((field654 == 10 || field654 == 20 || field654 == 30) && field862 != 0L && class308.method4891() > field862) {
            method111(method2373());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field902[var3] = true;
            }
        }
        if (field654 == 0) {
            this.method873(class95.field1188, class95.field1190, arg0);
        } else if (field654 == 5) {
            class95.method1110(Statics.field75, Statics.field3685, Statics.field138);
        } else if (field654 == 10 || field654 == 11) {
            class95.method1110(Statics.field75, Statics.field3685, Statics.field138);
        } else if (field654 == 20) {
            class95.method1110(Statics.field75, Statics.field3685, Statics.field138);
        } else if (field654 == 25) {
            if (field705 == 1) {
                if (field701 > field702) {
                    field702 = field701;
                }
                int var4 = (field702 * 50 - field701 * 50) / field702;
                method3669(class234.field2795 + class91.field1156 + class91.field1155 + var4 + "%" + class91.field1154, false);
            } else if (field705 == 2) {
                if (field703 > field704) {
                    field704 = field703;
                }
                int var5 = (field704 * 50 - field703 * 50) / field704 + 50;
                method3669(class234.field2795 + class91.field1156 + class91.field1155 + var5 + "%" + class91.field1154, false);
            } else {
                method3669(class234.field2795, false);
            }
        } else if (field654 == 30) {
            this.method1351();
        } else if (field654 == 40) {
            method3669(class234.field2796 + class91.field1156 + class234.field3039, false);
        } else if (field654 == 45) {
            method3669(class234.field2852, false);
        }
        if (field654 == 30 && field861 == 0 && !arg0 && !field669) {
            for (int var6 = 0; var6 < field825; var6++) {
                if (field855[var6]) {
                    Statics.field151.method829(field857[var6], field918[var6], field859[var6], field809[var6]);
                    field855[var6] = false;
                }
            }
        } else if (field654 > 0) {
            Statics.field151.method835(0, 0);
            for (int var7 = 0; var7 < field825; var7++) {
                field855[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method872() {
        if (Statics.field1271.method2062()) {
            Statics.field1271.method2070();
        }
        if (Statics.field1462 != null) {
            Statics.field1462.field587 = false;
        }
        Statics.field1462 = null;
        field695.method2154();
        class55.method701();
        class64.method34();
        Statics.field3297 = null;
        if (Statics.field193 != null) {
            Statics.field193.method2319();
        }
        if (Statics.field3678 != null) {
            Statics.field3678.method2319();
        }
        class248.method1444();
        Object var1 = class246.field3181;
        synchronized (class246.field3181) {
            if (class246.field3179 != 0) {
                class246.field3179 = 1;
                try {
                    class246.field3181.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field101 != null) {
            Statics.field101.method3127();
            Statics.field101 = null;
        }
        try {
            class177.field2067.method6118();
            for (int var4 = 0; var4 < Statics.field2506; var4++) {
                Statics.field2557[var4].method6118();
            }
            class177.field2059.method6118();
            class177.field2066.method6118();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ad.fp(II)V")
    public static void method575(int arg0) {
        if (field654 == arg0) {
            return;
        }
        if (field654 == 0) {
            Statics.field148.method929();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field649 = 0;
            field893 = 0;
            field682 = 0;
            field699.method4661(arg0);
            if (arg0 != 20) {
                method322(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field563 != null) {
            Statics.field563.method3288();
            Statics.field563 = null;
        }
        if (field654 == 25) {
            field705 = 0;
            field701 = 0;
            field702 = 1;
            field703 = 0;
            field704 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method1087(Statics.field1168, Statics.field1292, true, 0);
        } else if (arg0 == 20) {
            class95.method1087(Statics.field1168, Statics.field1292, true, field654 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method1087(Statics.field1168, Statics.field1292, false, 4);
        } else {
            class95.method1966();
        }
        field654 = arg0;
    }

    @ObfuscatedName("client.ff(B)V")
    public void method1449() {
        if (field654 == 1000) {
            return;
        }
        long var1 = class308.method4891();
        int var3 = (int) (var1 - Statics.field3196);
        Statics.field3196 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class248.field3209 += var3;
        boolean var4;
        if (class248.field3206 == 0 && class248.field3200 == 0 && class248.field3212 == 0 && class248.field3194 == 0) {
            var4 = true;
        } else if (Statics.field3195 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class248.field3209 > 30000) {
                        throw new IOException();
                    }
                    while (class248.field3200 < 200 && class248.field3194 > 0) {
                        class244 var5 = (class244) class248.field3197.method5537();
                        class311 var6 = new class311(4);
                        var6.method5095(1);
                        var6.method5100((int) var5.field2138);
                        Statics.field3195.method3307(var6.field3753, 0, 4);
                        class248.field3199.method5531(var5, var5.field2138);
                        class248.field3194--;
                        class248.field3200++;
                    }
                    while (class248.field3206 < 200 && class248.field3212 > 0) {
                        class244 var7 = (class244) class248.field3201.method4456();
                        class311 var8 = new class311(4);
                        var8.method5095(0);
                        var8.method5100((int) var7.field2138);
                        Statics.field3195.method3307(var8.field3753, 0, 4);
                        var7.method3353();
                        class248.field3204.method5531(var7, var7.field2138);
                        class248.field3212--;
                        class248.field3206++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3195.method3291();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class248.field3209 = 0;
                        byte var11 = 0;
                        if (Statics.field3203 == null) {
                            var11 = 8;
                        } else if (class248.field3208 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class248.field3207.field3752;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3195.method3305(class248.field3207.field3753, class248.field3207.field3752, var12);
                            if (class248.field3211 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class248.field3207.field3753[class248.field3207.field3752 + var13] ^= class248.field3211;
                                }
                            }
                            class248.field3207.field3752 += var12;
                            if (class248.field3207.field3752 < var11) {
                                break;
                            }
                            if (Statics.field3203 == null) {
                                class248.field3207.field3752 = 0;
                                int var14 = class248.field3207.method5274();
                                int var15 = class248.field3207.method5342();
                                int var16 = class248.field3207.method5274();
                                int var17 = class248.field3207.method5120();
                                long var18 = (long) ((var14 << 16) + var15);
                                class244 var20 = (class244) class248.field3199.method5543(var18);
                                Statics.field1989 = true;
                                if (var20 == null) {
                                    var20 = (class244) class248.field3204.method5543(var18);
                                    Statics.field1989 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3203 = var20;
                                Statics.field2428 = new class311(var17 + var21 + Statics.field3203.field3154);
                                Statics.field2428.method5095(var16);
                                Statics.field2428.method5123(var17);
                                class248.field3208 = 8;
                                class248.field3207.field3752 = 0;
                            } else if (class248.field3208 == 0) {
                                if (class248.field3207.field3753[0] == -1) {
                                    class248.field3208 = 1;
                                    class248.field3207.field3752 = 0;
                                } else {
                                    Statics.field3203 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2428.field3753.length - Statics.field3203.field3154;
                            int var23 = 512 - class248.field3208;
                            if (var23 > var22 - Statics.field2428.field3752) {
                                var23 = var22 - Statics.field2428.field3752;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3195.method3305(Statics.field2428.field3753, Statics.field2428.field3752, var23);
                            if (class248.field3211 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2428.field3753[Statics.field2428.field3752 + var24] ^= class248.field3211;
                                }
                            }
                            Statics.field2428.field3752 += var23;
                            class248.field3208 += var23;
                            if (Statics.field2428.field3752 == var22) {
                                if (Statics.field3203.field2138 == 16711935L) {
                                    Statics.field260 = Statics.field2428;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class247 var26 = class248.field3210[var25];
                                        if (var26 != null) {
                                            Statics.field260.field3752 = var25 * 8 + 5;
                                            int var27 = Statics.field260.method5120();
                                            int var28 = Statics.field260.method5120();
                                            var26.method3939(var27, var28);
                                        }
                                    }
                                } else {
                                    class248.field3198.reset();
                                    class248.field3198.update(Statics.field2428.field3753, 0, var22);
                                    int var29 = (int) class248.field3198.getValue();
                                    if (Statics.field3203.field3153 != var29) {
                                        try {
                                            Statics.field3195.method3288();
                                        } catch (Exception var35) {
                                        }
                                        class248.field3205++;
                                        Statics.field3195 = null;
                                        class248.field3211 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class248.field3205 = 0;
                                    class248.field3213 = 0;
                                    Statics.field3203.field3155.method3952((int) (Statics.field3203.field2138 & 0xFFFFL), Statics.field2428.field3753, (Statics.field3203.field2138 & 0xFF0000L) == 16711680L, Statics.field1989);
                                }
                                Statics.field3203.method3359();
                                if (Statics.field1989) {
                                    class248.field3200--;
                                } else {
                                    class248.field3206--;
                                }
                                class248.field3208 = 0;
                                Statics.field3203 = null;
                                Statics.field2428 = null;
                            } else {
                                if (class248.field3208 != 512) {
                                    break;
                                }
                                class248.field3208 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3195.method3288();
                } catch (Exception var34) {
                }
                class248.field3213++;
                Statics.field3195 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1246();
        }
    }

    @ObfuscatedName("client.fs(I)V")
    public void method1246() {
        if (class248.field3205 >= 4) {
            this.method875("js5crc");
            field654 = 1000;
            return;
        }
        if (class248.field3213 >= 4) {
            if (field654 <= 5) {
                this.method875("js5io");
                field654 = 1000;
                return;
            }
            field865 = 3000;
            class248.field3213 = 3;
        }
        if (--field865 + 1 > 0) {
            return;
        }
        try {
            if (field886 == 0) {
                Statics.field349 = Statics.field470.method3266(Statics.field253, Statics.field3149);
                field886++;
            }
            if (field886 == 1) {
                if (Statics.field349.field2046 == 2) {
                    this.method1247(-1);
                    return;
                }
                if (Statics.field349.field2046 == 1) {
                    field886++;
                }
            }
            if (field886 == 2) {
                if (field698) {
                    Statics.field2058 = class316.method3661((Socket) Statics.field349.field2048, 40000, 5000);
                } else {
                    Statics.field2058 = new class181((Socket) Statics.field349.field2048, Statics.field470, 5000);
                }
                class311 var1 = new class311(5);
                var1.method5095(15);
                var1.method5123(193);
                Statics.field2058.method3307(var1.field3753, 0, 5);
                field886++;
                Statics.field2342 = class308.method4891();
            }
            if (field886 == 3) {
                if (Statics.field2058.method3291() > 0 || !field698 && field654 <= 5) {
                    int var2 = Statics.field2058.method3290();
                    if (var2 != 0) {
                        this.method1247(var2);
                        return;
                    }
                    field886++;
                } else if (class308.method4891() - Statics.field2342 > 30000L) {
                    this.method1247(-2);
                    return;
                }
            }
            if (field886 == 4) {
                class316 var3 = Statics.field2058;
                boolean var4 = field654 > 20;
                if (Statics.field3195 != null) {
                    try {
                        Statics.field3195.method3288();
                    } catch (Exception var14) {
                    }
                    Statics.field3195 = null;
                }
                Statics.field3195 = var3;
                class248.method2372(var4);
                class248.field3207.field3752 = 0;
                Statics.field3203 = null;
                Statics.field2428 = null;
                class248.field3208 = 0;
                while (true) {
                    class244 var6 = (class244) class248.field3199.method5537();
                    if (var6 == null) {
                        while (true) {
                            class244 var7 = (class244) class248.field3204.method5537();
                            if (var7 == null) {
                                if (class248.field3211 != 0) {
                                    try {
                                        class311 var8 = new class311(4);
                                        var8.method5095(4);
                                        var8.method5095(class248.field3211);
                                        var8.method5099(0);
                                        Statics.field3195.method3307(var8.field3753, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3195.method3288();
                                        } catch (Exception var12) {
                                        }
                                        class248.field3213++;
                                        Statics.field3195 = null;
                                    }
                                }
                                class248.field3209 = 0;
                                Statics.field3196 = class308.method4891();
                                Statics.field349 = null;
                                Statics.field2058 = null;
                                field886 = 0;
                                field679 = 0;
                                return;
                            }
                            class248.field3201.method4454(var7);
                            class248.field3202.method5531(var7, var7.field2138);
                            class248.field3212++;
                            class248.field3206--;
                        }
                    }
                    class248.field3197.method5531(var6, var6.field2138);
                    class248.field3194++;
                    class248.field3200--;
                }
            }
        } catch (IOException var15) {
            this.method1247(-3);
        }
    }

    @ObfuscatedName("client.fk(II)V")
    public void method1247(int arg0) {
        Statics.field349 = null;
        Statics.field2058 = null;
        field886 = 0;
        if (Statics.field3584 == Statics.field3149) {
            Statics.field3149 = Statics.field1267;
        } else {
            Statics.field3149 = Statics.field3584;
        }
        field679++;
        if (field679 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field654 <= 5) {
                this.method875("js5connect_full");
                field654 = 1000;
            } else {
                field865 = 3000;
            }
        } else if (field679 >= 2 && arg0 == 6) {
            this.method875("js5connect_outofdate");
            field654 = 1000;
        } else if (field679 >= 4) {
            if (field654 <= 5) {
                this.method875("js5connect");
                field654 = 1000;
            } else {
                field865 = 3000;
            }
        }
    }

    @ObfuscatedName("fz.fv(Lil;Ljava/lang/String;B)V")
    public static void method3194(class247 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field917.add(var2);
        field667 += var2.field535;
    }

    @ObfuscatedName("c.fm(I)I")
    public static int method110() {
        if (field917 == null || field923 >= field917.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field923; var1++) {
            var0 += ((class68) field917.get(var1)).field538;
        }
        return var0 * 10000 / field667;
    }

    @ObfuscatedName("ai.fx(II)I")
    public static int method616(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("aa.fq(III)V")
    public static void method535(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method616(var4);
            int var6 = class140.field1798[var4];
            int var7 = method3293(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class143.method2931(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ad.fy(IZZZB)Lil;")
    public static class247 method573(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class319 var4 = null;
        if (class177.field2067 != null) {
            var4 = new class319(arg0, class177.field2067, Statics.field2557[arg0], 1000000);
        }
        return new class247(var4, Statics.field31, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fb(B)V")
    public final void method1375() {
        class316 var1 = field695.method2159();
        class310 var2 = field695.field1326;
        try {
            if (field649 == 0) {
                if (Statics.field115 == null && (field806.method2037() || field893 > 250)) {
                    Statics.field115 = field806.method2039();
                    field806.method2029();
                    field806 = null;
                }
                if (Statics.field115 != null) {
                    if (var1 != null) {
                        var1.method3288();
                        var1 = null;
                    }
                    Statics.field294 = null;
                    field697 = false;
                    field893 = 0;
                    field649 = 1;
                }
            }
            if (field649 == 1) {
                if (Statics.field294 == null) {
                    Statics.field294 = Statics.field470.method3266(Statics.field253, Statics.field3149);
                }
                if (Statics.field294.field2046 == 2) {
                    throw new IOException();
                }
                if (Statics.field294.field2046 == 1) {
                    if (field698) {
                        var1 = class316.method3661((Socket) Statics.field294.field2048, 40000, 5000);
                    } else {
                        var1 = new class181((Socket) Statics.field294.field2048, Statics.field470, 5000);
                    }
                    field695.method2156(var1);
                    Statics.field294 = null;
                    field649 = 2;
                }
            }
            if (field649 == 2) {
                field695.method2167();
                class197 var3 = Statics.method3810();
                var3.field2361.method5095(class194.field2333.field2339);
                field695.method2155(var3);
                field695.method2158();
                var2.field3752 = 0;
                field649 = 3;
            }
            if (field649 == 3) {
                if (Statics.field193 != null) {
                    Statics.field193.method2315();
                }
                if (Statics.field3678 != null) {
                    Statics.field3678.method2315();
                }
                boolean var4 = true;
                if (field698 && !var1.method3292(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3290();
                    if (Statics.field193 != null) {
                        Statics.field193.method2315();
                    }
                    if (Statics.field3678 != null) {
                        Statics.field3678.method2315();
                    }
                    if (var5 != 0) {
                        method3210(var5);
                        return;
                    }
                    var2.field3752 = 0;
                    field649 = 4;
                }
            }
            if (field649 == 4) {
                if (var2.field3752 < 8) {
                    int var6 = var1.method3291();
                    if (var6 > 8 - var2.field3752) {
                        var6 = 8 - var2.field3752;
                    }
                    if (var6 > 0) {
                        var1.method3305(var2.field3753, var2.field3752, var6);
                        var2.field3752 += var6;
                    }
                }
                if (var2.field3752 == 8) {
                    var2.field3752 = 0;
                    Statics.field558 = var2.method5121();
                    field649 = 5;
                }
            }
            if (field649 == 5) {
                field695.field1326.field3752 = 0;
                field695.method2167();
                class310 var7 = new class310(500);
                int[] var8 = new int[] { Statics.field115.nextInt(), Statics.field115.nextInt(), Statics.field115.nextInt(), Statics.field115.nextInt() };
                var7.field3752 = 0;
                var7.method5095(1);
                var7.method5123(var8[0]);
                var7.method5123(var8[1]);
                var7.method5123(var8[2]);
                var7.method5123(var8[3]);
                var7.method5103(Statics.field558);
                if (field654 == 40) {
                    var7.method5123(Statics.field488[0]);
                    var7.method5123(Statics.field488[1]);
                    var7.method5123(Statics.field488[2]);
                    var7.method5123(Statics.field488[3]);
                } else {
                    var7.method5095(field873.method18());
                    switch(field873.field2023) {
                        case 0:
                            LinkedHashMap var10 = Statics.field3618.field1059;
                            String var11 = class95.field1197;
                            int var12 = var11.length();
                            int var13 = 0;
                            for (int var14 = 0; var14 < var12; var14++) {
                                var13 = (var13 << 5) - var13 + var11.charAt(var14);
                            }
                            var7.method5123((Integer) var10.get(var13));
                            break;
                        case 1:
                            var7.field3752 += 4;
                            break;
                        case 2:
                        case 3:
                            var7.method5100(Statics.field314);
                            var7.field3752++;
                    }
                    var7.method5095(class324.field3858.method18());
                    var7.method5105(class95.field1198);
                }
                var7.method5113(class93.field1171, class93.field1169);
                Statics.field488 = var8;
                class197 var16 = Statics.method3810();
                var16.field2361.field3752 = 0;
                if (field654 == 40) {
                    var16.field2361.method5095(class194.field2336.field2339);
                } else {
                    var16.field2361.method5095(class194.field2335.field2339);
                }
                var16.field2361.method5099(0);
                int var17 = var16.field2361.field3752;
                var16.field2361.method5123(193);
                var16.field2361.method5123(1);
                var16.field2361.method5095(field651);
                var16.field2361.method5095(field652);
                var16.field2361.method5237(var7.field3753, 0, var7.field3752);
                int var18 = var16.field2361.field3752;
                var16.field2361.method5105(class95.field1197);
                var16.field2361.method5095((field669 ? 1 : 0) << 1 | (field911 ? 1 : 0));
                var16.field2361.method5099(Statics.field3639);
                var16.field2361.method5099(Statics.field1893);
                method3285(var16.field2361);
                var16.field2361.method5105(Statics.field318);
                var16.field2361.method5123(Statics.field2456);
                class311 var19 = new class311(Statics.field435.method5857());
                Statics.field435.method5860(var19);
                var16.field2361.method5237(var19.field3753, 0, var19.field3753.length);
                var16.field2361.method5095(field651);
                var16.field2361.method5123(0);
                var16.field2361.method5291(Statics.field479.field3173);
                var16.field2361.method5291(Statics.field90.field3173);
                var16.field2361.method5291(Statics.field2362.field3173);
                var16.field2361.method5160(Statics.field545.field3173);
                var16.field2361.method5123(Statics.field91.field3173);
                var16.field2361.method5123(Statics.field3158.field3173);
                var16.field2361.method5291(Statics.field1168.field3173);
                var16.field2361.method5160(Statics.field300.field3173);
                var16.field2361.method5161(Statics.field2025.field3173);
                var16.field2361.method5161(Statics.field678.field3173);
                var16.field2361.method5160(Statics.field254.field3173);
                var16.field2361.method5291(Statics.field3706.field3173);
                var16.field2361.method5160(Statics.field2358.field3173);
                var16.field2361.method5291(Statics.field1292.field3173);
                var16.field2361.method5160(Statics.field1311.field3173);
                var16.field2361.method5291(Statics.field3884.field3173);
                var16.field2361.method5160(Statics.field1815.field3173);
                var16.field2361.method5123(Statics.field2731.field3173);
                var16.field2361.method5160(0);
                var16.field2361.method5161(Statics.field2011.field3173);
                var16.field2361.method5291(Statics.field2521.field3173);
                var16.field2361.method5136(var8, var18, var16.field2361.field3752);
                var16.field2361.method5122(var16.field2361.field3752 - var17);
                field695.method2155(var16);
                field695.method2158();
                field695.field1329 = new class339(var8);
                int[] var20 = new int[4];
                for (int var21 = 0; var21 < 4; var21++) {
                    var20[var21] = var8[var21] + 50;
                }
                var2.method5088(var20);
                field649 = 6;
            }
            if (field649 == 6 && var1.method3291() > 0) {
                int var22 = var1.method3290();
                if (var22 == 21 && field654 == 20) {
                    field649 = 12;
                } else if (var22 == 2) {
                    field649 = 14;
                } else if (var22 == 15 && field654 == 40) {
                    field695.field1339 = -1;
                    field649 = 19;
                } else if (var22 == 64) {
                    field649 = 10;
                } else if (var22 == 23 && field682 < 1) {
                    field682++;
                    field649 = 0;
                } else if (var22 == 29) {
                    field649 = 17;
                } else if (var22 == 69) {
                    field649 = 7;
                } else {
                    method3210(var22);
                    return;
                }
            }
            if (field649 == 7 && var1.method3291() >= 2) {
                var1.method3305(var2.field3753, 0, 2);
                var2.field3752 = 0;
                Statics.field259 = var2.method5342();
                field649 = 8;
            }
            if (field649 == 8 && var1.method3291() >= Statics.field259) {
                var2.field3752 = 0;
                var1.method3305(var2.field3753, var2.field3752, Statics.field259);
                class8 var23 = class8.method5424()[var2.method5274()];
                try {
                    class13 var24 = class14.method1129(var23);
                    this.field688 = new class10(var2, var24);
                    field649 = 9;
                } catch (Exception var49) {
                    method3210(22);
                    return;
                }
            }
            if (field649 == 9 && this.field688.method95()) {
                this.field687 = this.field688.method81();
                this.field688.method80();
                this.field688 = null;
                if (this.field687 == null) {
                    method3210(22);
                    return;
                }
                field695.method2167();
                class197 var26 = Statics.method3810();
                var26.field2361.method5095(class194.field2337.field2339);
                var26.field2361.method5099(this.field687.field3752);
                var26.field2361.method5109(this.field687);
                field695.method2155(var26);
                field695.method2158();
                this.field687 = null;
                field649 = 6;
            }
            if (field649 == 10 && var1.method3291() > 0) {
                Statics.field434 = var1.method3290();
                field649 = 11;
            }
            if (field649 == 11 && var1.method3291() >= Statics.field434) {
                var1.method3305(var2.field3753, 0, Statics.field434);
                var2.field3752 = 0;
                field649 = 6;
            }
            if (field649 == 12 && var1.method3291() > 0) {
                field683 = (var1.method3290() + 3) * 60;
                field649 = 13;
            }
            if (field649 == 13) {
                field893 = 0;
                class95.method966(class234.field2826, class234.field2815, field683 / 60 + class234.field2828);
                if (--field683 <= 0) {
                    field649 = 0;
                }
            } else {
                if (field649 == 14 && var1.method3291() >= 1) {
                    Statics.field1964 = var1.method3290();
                    field649 = 15;
                }
                if (field649 == 15 && var1.method3291() >= Statics.field1964) {
                    boolean var27 = var1.method3290() == 1;
                    var1.method3305(var2.field3753, 0, 4);
                    var2.field3752 = 0;
                    boolean var28 = false;
                    if (var27) {
                        int var29 = var2.method5063() << 24;
                        int var30 = var29 | var2.method5063() << 16;
                        int var31 = var30 | var2.method5063() << 8;
                        int var32 = var31 | var2.method5063();
                        String var33 = class95.field1197;
                        int var34 = var33.length();
                        int var35 = 0;
                        int var36 = 0;
                        while (true) {
                            if (var36 >= var34) {
                                if (Statics.field3618.field1059.size() >= 10 && !Statics.field3618.field1059.containsKey(var35)) {
                                    Iterator var39 = Statics.field3618.field1059.entrySet().iterator();
                                    var39.next();
                                    var39.remove();
                                }
                                Statics.field3618.field1059.put(var35, var32);
                                break;
                            }
                            var35 = (var35 << 5) - var35 + var33.charAt(var36);
                            var36++;
                        }
                    }
                    if (field685) {
                        Statics.field3618.field1051 = class95.field1197;
                    } else {
                        Statics.field3618.field1051 = null;
                    }
                    class83.method165();
                    field776 = var1.method3290();
                    field820 = var1.method3290() == 1;
                    field766 = var1.method3290();
                    field766 <<= 0x8;
                    field766 += var1.method3290();
                    field767 = var1.method3290();
                    var1.method3305(var2.field3753, 0, 1);
                    var2.field3752 = 0;
                    class192[] var40 = class192.method1088();
                    int var41 = var2.method5080();
                    if (var41 < 0 || var41 >= var40.length) {
                        throw new IOException(var41 + " " + var2.field3752);
                    }
                    field695.field1331 = var40[var41];
                    field695.field1339 = field695.field1331.field2227;
                    var1.method3305(var2.field3753, 0, 2);
                    var2.field3752 = 0;
                    field695.field1339 = var2.method5342();
                    try {
                        class57.method780(Statics.field148, "zap");
                    } catch (Throwable var48) {
                    }
                    field649 = 16;
                }
                if (field649 != 16) {
                    if (field649 == 17 && var1.method3291() >= 2) {
                        var2.field3752 = 0;
                        var1.method3305(var2.field3753, 0, 2);
                        var2.field3752 = 0;
                        Statics.field2498 = var2.method5342();
                        field649 = 18;
                    }
                    if (field649 == 18 && var1.method3291() >= Statics.field2498) {
                        var2.field3752 = 0;
                        var1.method3305(var2.field3753, 0, Statics.field2498);
                        var2.field3752 = 0;
                        String var43 = var2.method5202();
                        String var44 = var2.method5202();
                        String var45 = var2.method5202();
                        class95.method966(var43, var44, var45);
                        method575(10);
                    }
                    if (field649 == 19) {
                        if (field695.field1339 == -1) {
                            if (var1.method3291() < 2) {
                                return;
                            }
                            var1.method3305(var2.field3753, 0, 2);
                            var2.field3752 = 0;
                            field695.field1339 = var2.method5342();
                        }
                        if (var1.method3291() >= field695.field1339) {
                            var1.method3305(var2.field3753, 0, field695.field1339);
                            var2.field3752 = 0;
                            int var46 = field695.field1339;
                            field699.method4643();
                            method5474();
                            class99.method5054(var2);
                            if (var2.field3752 != var46) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field893++;
                        if (field893 > 2000) {
                            if (field682 < 1) {
                                if (Statics.field3584 == Statics.field3149) {
                                    Statics.field3149 = Statics.field1267;
                                } else {
                                    Statics.field3149 = Statics.field3584;
                                }
                                field682++;
                                field649 = 0;
                            } else {
                                method3210(-3);
                            }
                        }
                    }
                } else if (var1.method3291() >= field695.field1339) {
                    var2.field3752 = 0;
                    var1.method3305(var2.field3753, 0, field695.field1339);
                    field699.method4641();
                    Statics.method2043();
                    class99.method5054(var2);
                    Statics.field2113 = -1;
                    method1130(false, var2);
                    field695.field1331 = null;
                }
            }
        } catch (IOException var50) {
            if (field682 < 1) {
                if (Statics.field3584 == Statics.field3149) {
                    Statics.field3149 = Statics.field1267;
                } else {
                    Statics.field3149 = Statics.field3584;
                }
                field682++;
                field649 = 0;
            } else {
                method3210(-2);
            }
        }
    }

    @ObfuscatedName("ld.fd(S)V")
    public static void method5474() {
        field695.method2167();
        field695.field1326.field3752 = 0;
        field695.field1331 = null;
        field695.field1336 = null;
        field695.field1337 = null;
        field695.field1338 = null;
        field695.field1339 = 0;
        field695.field1334 = 0;
        field663 = 0;
        field786 = 0;
        field785 = false;
        field895 = 0;
        field775 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field765[var0] = null;
        }
        Statics.field2563 = null;
        for (int var1 = 0; var1 < field690.length; var1++) {
            class89 var2 = field690[var1];
            if (var2 != null) {
                var2.field981 = -1;
                var2.field966 = false;
            }
        }
        class69.field547 = new class329(32);
        method575(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field902[var3] = true;
        }
        method1143();
    }

    @ObfuscatedName("fp.fa(IB)V")
    public static void method3210(int arg0) {
        if (arg0 == -3) {
            class95.method966(class234.field2829, class234.field2830, class234.field2831);
        } else if (arg0 == -2) {
            class95.method966(class234.field3023, class234.field2833, class234.field2834);
        } else if (arg0 == -1) {
            class95.method966(class234.field2835, class234.field2836, class234.field2963);
        } else if (arg0 == 3) {
            class95.field1192 = 3;
            class95.field1191 = 1;
        } else if (arg0 == 4) {
            class95.field1192 = 12;
            class95.field1200 = 0;
        } else if (arg0 == 5) {
            class95.field1191 = 2;
            class95.method966(class234.field2870, class234.field2842, class234.field2843);
        } else if (arg0 == 68 || !(field653 || arg0 != 6)) {
            class95.method966(class234.field2844, class234.field3037, class234.field2846);
        } else if (arg0 == 7) {
            class95.method966(class234.field2951, class234.field2848, class234.field2803);
        } else if (arg0 == 8) {
            class95.method966(class234.field2850, class234.field3057, class234.field2841);
        } else if (arg0 == 9) {
            class95.method966(class234.field2853, class234.field2854, class234.field2855);
        } else if (arg0 == 10) {
            class95.method966(class234.field3013, class234.field2857, class234.field3086);
        } else if (arg0 == 11) {
            class95.method966(class234.field3078, class234.field2860, class234.field3040);
        } else if (arg0 == 12) {
            class95.method966(class234.field3081, class234.field2863, class234.field2864);
        } else if (arg0 == 13) {
            class95.method966(class234.field3035, class234.field2896, class234.field2867);
        } else if (arg0 == 14) {
            class95.method966(class234.field2868, class234.field2869, class234.field2950);
        } else if (arg0 == 16) {
            class95.method966(class234.field2871, class234.field2872, class234.field2873);
        } else if (arg0 == 17) {
            class95.method966(class234.field2861, class234.field3050, class234.field2876);
        } else if (arg0 == 18) {
            class95.field1192 = 12;
            class95.field1200 = 1;
        } else if (arg0 == 19) {
            class95.method966(class234.field2880, class234.field2822, class234.field2953);
        } else if (arg0 == 20) {
            class95.method966(class234.field2883, class234.field2804, class234.field2885);
        } else if (arg0 == 22) {
            class95.method966(class234.field2886, class234.field2887, class234.field2888);
        } else if (arg0 == 23) {
            class95.method966(class234.field2889, class234.field2890, class234.field2904);
        } else if (arg0 == 24) {
            class95.method966(class234.field2892, class234.field2893, class234.field2967);
        } else if (arg0 == 25) {
            class95.method966(class234.field2895, class234.field2919, class234.field2837);
        } else if (arg0 == 26) {
            class95.method966(class234.field2947, class234.field3010, class234.field2900);
        } else if (arg0 == 27) {
            class95.method966(class234.field2901, class234.field2856, class234.field2820);
        } else if (arg0 == 31) {
            class95.method966(class234.field2910, class234.field3028, class234.field2912);
        } else if (arg0 == 32) {
            class95.method966(class234.field3043, class234.field2914, class234.field2915);
        } else if (arg0 == 37) {
            class95.method966(class234.field2916, class234.field2917, class234.field2918);
        } else if (arg0 == 38) {
            class95.method966(class234.field2911, class234.field2920, class234.field2921);
        } else if (arg0 == 55) {
            class95.field1192 = 8;
        } else if (arg0 == 56) {
            class95.method966(class234.field3026, class234.field2927, class234.field2928);
            method575(11);
            return;
        } else if (arg0 == 57) {
            class95.method966(class234.field2849, class234.field3077, class234.field2891);
            method575(11);
            return;
        } else if (arg0 == 61) {
            class95.field1192 = 7;
        } else {
            class95.method966(class234.field2932, class234.field2933, class234.field2934);
        }
        method575(10);
    }

    @ObfuscatedName("as.fu(I)V")
    public static final void method305() {
        field695.method2154();
        class269.field3534.method3146();
        Statics.method3610();
        class257.method5491();
        class265.field3396.method3146();
        class265.field3416.method3146();
        class265.field3410.method3146();
        class265.field3386.method3146();
        class268.method308();
        class266.method2024();
        class270.field3563.method3146();
        class270.field3550.method3146();
        class255.method3122();
        class260.field3325.method3146();
        class252.method543();
        class264.method4140();
        class258.method4057();
        class262.field3337.method3146();
        class261.method3826();
        class253.field3241.method3146();
        class224.field2560.method3146();
        class227.field2581.method3146();
        class227.field2715.method3146();
        class227.field2682.method3146();
        class227.field2729.method3146();
        ((class129) Statics.field1802).method2591();
        class102.field1300.method3146();
        Statics.field1815.method3891();
        Statics.field254.method3891();
        Statics.field3884.method3891();
        Statics.field2731.method3891();
        Statics.field479.method3891();
        Statics.field2521.method3891();
        Statics.field2011.method3891();
        Statics.field1292.method3891();
        Statics.field91.method3891();
        Statics.field1168.method3891();
        Statics.field545.method3891();
        Statics.field2362.method3891();
        Statics.field537.method3046();
        for (int var0 = 0; var0 < 4; var0++) {
            field832[var0].method3316();
        }
        System.gc();
        class207.method1099(2);
        field780 = -1;
        field884 = false;
        for (class85 var1 = (class85) class85.field1076.method4540(); var1 != null; var1 = (class85) class85.field1076.method4545()) {
            if (var1.field1089 != null) {
                Statics.field351.method2185(var1.field1089);
                var1.field1089 = null;
            }
            if (var1.field1083 != null) {
                Statics.field351.method2185(var1.field1083);
                var1.field1083 = null;
            }
        }
        class85.field1076.method4537();
        method575(10);
    }

    @ObfuscatedName("aw.fi(II)V")
    public static final void method551(int arg0) {
        method305();
        switch(arg0) {
            case 1:
                class95.field1192 = 24;
                class95.method966(class234.field3030, class234.field2832, class234.field2897);
                break;
            case 2:
                class95.method2120();
        }
    }

    @ObfuscatedName("ca.fc(I)V")
    public static final void method1755() {
        if (field734 > 0) {
            method305();
        } else {
            field699.method4646();
            method575(40);
            Statics.field563 = field695.method2159();
            field695.method2153();
        }
    }

    @ObfuscatedName("ak.fl(ZI)V")
    public static final void method322(boolean arg0) {
        if (arg0) {
            field873 = class95.field1201 ? class170.field2020 : class170.field2021;
            return;
        }
        LinkedHashMap var1 = Statics.field3618.field1059;
        String var2 = class95.field1197;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field873 = var1.containsKey(var4) ? class170.field2026 : class170.field2022;
    }

    @ObfuscatedName("client.fw(B)V")
    public final void method1249() {
        if (field663 > 1) {
            field663--;
        }
        if (field734 > 0) {
            field734--;
        }
        if (field697) {
            field697 = false;
            method1755();
            return;
        }
        if (!field785) {
            method1180();
        }
        for (int var1 = 0; var1 < 100 && this.method1547(field695); var1++) {
        }
        if (field654 != 30) {
            return;
        }
        while (class106.method203()) {
            class197 var2 = class197.method1128(class193.field2281, field695.field1329);
            var2.field2361.method5095(0);
            int var3 = var2.field2361.field3752;
            class106.method211(var2.field2361);
            var2.field2361.method5310(var2.field2361.field3752 - var3);
            field695.method2155(var2);
        }
        if (field699.field3615) {
            class197 var4 = class197.method1128(class193.field2252, field695.field1329);
            var4.field2361.method5095(0);
            int var5 = var4.field2361.field3752;
            field699.method4637(var4.field2361);
            var4.field2361.method5310(var4.field2361.field3752 - var5);
            field695.method2155(var4);
            field699.method4642();
        }
        Object var6 = Statics.field1462.field589;
        synchronized (Statics.field1462.field589) {
            if (!field908) {
                Statics.field1462.field592 = 0;
            } else if (class64.field484 != 0 || Statics.field1462.field592 >= 40) {
                class197 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field1462.field592 && (var7 == null || var7.field2361.field3752 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field1462.field590[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field1462.field588[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field658 != var14 || field659 != var13) {
                        if (var7 == null) {
                            var7 = class197.method1128(class193.field2327, field695.field1329);
                            var7.field2361.method5095(0);
                            var8 = var7.field2361.field3752;
                            var7.field2361.field3752 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field795 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field658;
                            var16 = var13 - field659;
                            var17 = (int) ((Statics.field1462.field586[var12] - field795) / 20L);
                            var10 = (int) ((Statics.field1462.field586[var12] - field795) % 20L + (long) var10);
                        }
                        field658 = var14;
                        field659 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2361.method5099((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2361.method5095(var17 + 128);
                            var7.field2361.method5099((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2361.method5095(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2361.method5123(Integer.MIN_VALUE);
                            } else {
                                var7.field2361.method5123(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2361.method5099((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2361.method5123(Integer.MIN_VALUE);
                            } else {
                                var7.field2361.method5123(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field795 = Statics.field1462.field586[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2361.method5310(var7.field2361.field3752 - var8);
                    int var18 = var7.field2361.field3752;
                    var7.field2361.field3752 = var8;
                    var7.field2361.method5095(var10 / var11);
                    var7.field2361.method5095(var10 % var11);
                    var7.field2361.field3752 = var18;
                    field695.method2155(var7);
                }
                if (var9 >= Statics.field1462.field592) {
                    Statics.field1462.field592 = 0;
                } else {
                    Statics.field1462.field592 -= var9;
                    System.arraycopy(Statics.field1462.field588, var9, Statics.field1462.field588, 0, Statics.field1462.field592);
                    System.arraycopy(Statics.field1462.field590, var9, Statics.field1462.field590, 0, Statics.field1462.field592);
                    System.arraycopy(Statics.field1462.field586, var9, Statics.field1462.field586, 0, Statics.field1462.field592);
                }
            }
        }
        if (class64.field484 == 1 || !Statics.field1990 && class64.field484 == 4 || class64.field484 == 2) {
            long var20 = class64.field501 - field657;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field657 = class64.field501;
            int var22 = class64.field503;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1893) {
                var22 = Statics.field1893;
            }
            int var23 = class64.field490;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field3639) {
                var23 = Statics.field3639;
            }
            int var24 = (int) var20;
            class197 var25 = class197.method1128(class193.field2330, field695.field1329);
            var25.field2361.method5099((class64.field484 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2361.method5099(var23);
            var25.field2361.method5099(var22);
            field695.method2155(var25);
        }
        if (class55.field415 > 0) {
            class197 var26 = class197.method1128(class193.field2235, field695.field1329);
            var26.field2361.method5099(0);
            int var27 = var26.field2361.field3752;
            long var28 = class308.method4891();
            for (int var30 = 0; var30 < class55.field415; var30++) {
                long var31 = var28 - field818;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field818 = var28;
                var26.field2361.method5158((int) var31);
                var26.field2361.method5143(class55.field414[var30]);
            }
            var26.field2361.method5122(var26.field2361.field3752 - var27);
            field695.method2155(var26);
        }
        if (field733 > 0) {
            field733--;
        }
        if (class55.field417[96] || class55.field417[97] || class55.field417[98] || class55.field417[99]) {
            field844 = true;
        }
        if (field844 && field733 <= 0) {
            field733 = 20;
            field844 = false;
            class197 var33 = class197.method1128(class193.field2276, field695.field1329);
            var33.field2361.method5312(field778);
            var33.field2361.method5312(field831);
            field695.method2155(var33);
        }
        if (Statics.field574 && !field661) {
            field661 = true;
            class197 var34 = class197.method1128(class193.field2278, field695.field1329);
            var34.field2361.method5095(1);
            field695.method2155(var34);
        }
        if (!Statics.field574 && field661) {
            field661 = false;
            class197 var35 = class197.method1128(class193.field2278, field695.field1329);
            var35.field2361.method5095(0);
            field695.method2155(var35);
        }
        if (Statics.field199 != null) {
            Statics.field199.method5882();
        }
        method187();
        method3314();
        if (field654 != 30) {
            return;
        }
        method324();
        method591();
        field695.field1334++;
        if (field695.field1334 > 750) {
            method1755();
            return;
        }
        int var36 = class99.field1264;
        int[] var37 = class99.field1269;
        for (int var38 = 0; var38 < var36; var38++) {
            class76 var39 = field765[var37[var38]];
            if (var39 != null) {
                method540(var39, 1);
            }
        }
        method3202();
        method615();
        field851++;
        if (field753 != 0) {
            field751 += 20;
            if (field751 >= 400) {
                field753 = 0;
            }
        }
        if (Statics.field1132 != null) {
            field755++;
            if (field755 >= 15) {
                method3344(Statics.field1132);
                Statics.field1132 = null;
            }
        }
        class227 var40 = Statics.field3351;
        class227 var41 = Statics.field2093;
        Statics.field3351 = null;
        Statics.field2093 = null;
        field826 = null;
        field830 = false;
        field860 = false;
        field871 = 0;
        while (class55.method180() && field871 < 128) {
            if (field776 >= 2 && class55.field417[82] && Statics.field3136 == 66) {
                String var42 = "";
                Iterator var43 = class101.field1286.iterator();
                while (var43.hasNext()) {
                    class74 var44 = (class74) var43.next();
                    var42 = var42 + var44.field598 + ':' + var44.field603 + '\n';
                }
                Statics.field148.method850(var42);
            } else if (field724 != 1 || Statics.field201 <= 0) {
                field694[field871] = Statics.field3136;
                field662[field871] = Statics.field201;
                field871++;
            }
        }
        boolean var47 = field776 >= 2;
        if (var47 && class55.field417[82] && class55.field417[81] && field847 != 0) {
            int var48 = Statics.field2563.field628 - field847;
            if (var48 < 0) {
                var48 = 0;
            } else if (var48 > 3) {
                var48 = 3;
            }
            if (Statics.field2563.field628 != var48) {
                int var49 = Statics.field3157 + Statics.field2563.field994[0];
                int var50 = Statics.field301 + Statics.field2563.field969[0];
                class197 var51 = class197.method1128(class193.field2270, field695.field1329);
                var51.field2361.method5151(var49);
                var51.field2361.method5160(0);
                var51.field2361.method5312(var50);
                var51.field2361.method5095(var48);
                field695.method2155(var51);
            }
            field847 = 0;
        }
        if (field874 != -1) {
            method706(field874, 0, 0, Statics.field3639, Statics.field1893, 0, 0);
        }
        field738++;
        while (true) {
            class72 var52;
            class227 var53;
            class227 var54;
            do {
                var52 = (class72) field716.method4541();
                if (var52 == null) {
                    while (true) {
                        class72 var55;
                        class227 var56;
                        class227 var57;
                        do {
                            var55 = (class72) field850.method4541();
                            if (var55 == null) {
                                while (true) {
                                    class72 var58;
                                    class227 var59;
                                    class227 var60;
                                    do {
                                        var58 = (class72) field848.method4541();
                                        if (var58 == null) {
                                            this.method1254();
                                            if (Statics.field199 != null) {
                                                Statics.field199.method5889(Statics.field1950, (Statics.field2563.field991 >> 7) + Statics.field3157, (Statics.field2563.field939 >> 7) + Statics.field301, false);
                                                Statics.field199.method6035();
                                            }
                                            if (field822 != null) {
                                                this.method1259();
                                            }
                                            if (Statics.field2028 != null) {
                                                method3344(Statics.field2028);
                                                field899++;
                                                if (class64.field492 == 0) {
                                                    if (field849) {
                                                        if (Statics.field2028 == Statics.field1923 && field807 != field760) {
                                                            class227 var61 = Statics.field2028;
                                                            byte var62 = 0;
                                                            if (field866 == 1 && var61.field2696 == 206) {
                                                                var62 = 1;
                                                            }
                                                            if (var61.field2705[field760] <= 0) {
                                                                var62 = 0;
                                                            }
                                                            if (class228.method3103(method3108(var61))) {
                                                                int var63 = field807;
                                                                int var64 = field760;
                                                                var61.field2705[var64] = var61.field2705[var63];
                                                                var61.field2712[var64] = var61.field2712[var63];
                                                                var61.field2705[var63] = -1;
                                                                var61.field2712[var63] = 0;
                                                            } else if (var62 == 1) {
                                                                int var65 = field807;
                                                                int var66 = field760;
                                                                while (var65 != var66) {
                                                                    if (var65 > var66) {
                                                                        var61.method3757(var65 - 1, var65);
                                                                        var65--;
                                                                    } else if (var65 < var66) {
                                                                        var61.method3757(var65 + 1, var65);
                                                                        var65++;
                                                                    }
                                                                }
                                                            } else {
                                                                var61.method3757(field760, field807);
                                                            }
                                                            class197 var67 = class197.method1128(class193.field2303, field695.field1329);
                                                            var67.field2361.method5123(Statics.field2028.field2587);
                                                            var67.field2361.method5312(field807);
                                                            var67.field2361.method5099(field760);
                                                            var67.field2361.method5095(var62);
                                                            field695.method2155(var67);
                                                        }
                                                    } else if (this.method1255()) {
                                                        this.method1256(field758, field759);
                                                    } else if (field786 > 0) {
                                                        int var68 = field758;
                                                        int var69 = field759;
                                                        method321(Statics.field309, var68, var69);
                                                        Statics.field309 = null;
                                                    }
                                                    field755 = 10;
                                                    class64.field484 = 0;
                                                    Statics.field2028 = null;
                                                } else if (field899 >= 5 && (class64.field493 > field758 + 5 || class64.field493 < field758 - 5 || class64.field500 > field759 + 5 || class64.field500 < field759 - 5)) {
                                                    field849 = true;
                                                }
                                            }
                                            if (class143.method2968()) {
                                                int var70 = class143.field1860;
                                                int var71 = class143.field1861;
                                                class197 var72 = class197.method1128(class193.field2233, field695.field1329);
                                                var72.field2361.method5095(5);
                                                var72.field2361.method5312(Statics.field3157 + var70);
                                                var72.field2361.method5143(class55.field417[82] ? (class55.field417[81] ? 2 : 1) : 0);
                                                var72.field2361.method5334(Statics.field301 + var71);
                                                field695.method2155(var72);
                                                class143.method2969();
                                                field750 = class64.field490;
                                                field768 = class64.field503;
                                                field753 = 1;
                                                field751 = 0;
                                                field775 = var70;
                                                field881 = var71;
                                            }
                                            if (Statics.field3351 != var40) {
                                                if (var40 != null) {
                                                    method3344(var40);
                                                }
                                                if (Statics.field3351 != null) {
                                                    method3344(Statics.field3351);
                                                }
                                            }
                                            if (Statics.field2093 != var41 && field800 == field752) {
                                                if (var41 != null) {
                                                    method3344(var41);
                                                }
                                                if (Statics.field2093 != null) {
                                                    method3344(Statics.field2093);
                                                }
                                            }
                                            if (Statics.field2093 == null) {
                                                if (field800 > 0) {
                                                    field800--;
                                                }
                                            } else if (field800 < field752) {
                                                field800++;
                                                if (field800 == field752) {
                                                    method3344(Statics.field2093);
                                                }
                                            }
                                            if (field724 == 0) {
                                                int var73 = Statics.field2563.field991;
                                                int var74 = Statics.field2563.field939;
                                                if (Statics.field1245 - var73 < -500 || Statics.field1245 - var73 > 500 || Statics.field1478 - var74 < -500 || Statics.field1478 - var74 > 500) {
                                                    Statics.field1245 = var73;
                                                    Statics.field1478 = var74;
                                                }
                                                if (Statics.field1245 != var73) {
                                                    Statics.field1245 += (var73 - Statics.field1245) / 16;
                                                }
                                                if (Statics.field1478 != var74) {
                                                    Statics.field1478 += (var74 - Statics.field1478) / 16;
                                                }
                                                int var75 = Statics.field1245 >> 7;
                                                int var76 = Statics.field1478 >> 7;
                                                int var77 = method2028(Statics.field1245, Statics.field1478, Statics.field1950);
                                                int var78 = 0;
                                                if (var75 > 3 && var76 > 3 && var75 < 100 && var76 < 100) {
                                                    for (int var79 = var75 - 4; var79 <= var75 + 4; var79++) {
                                                        for (int var80 = var76 - 4; var80 <= var76 + 4; var80++) {
                                                            int var81 = Statics.field1950;
                                                            if (var81 < 3 && (class65.field508[1][var79][var80] & 0x2) == 2) {
                                                                var81++;
                                                            }
                                                            int var82 = var77 - class65.field520[var81][var79][var80];
                                                            if (var82 > var78) {
                                                                var78 = var82;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var83 = var78 * 192;
                                                if (var83 > 98048) {
                                                    var83 = 98048;
                                                }
                                                if (var83 < 32768) {
                                                    var83 = 32768;
                                                }
                                                if (var83 > field919) {
                                                    field919 += (var83 - field919) / 24;
                                                } else if (var83 < field919) {
                                                    field919 += (var83 - field919) / 80;
                                                }
                                                Statics.field1342 = method2028(Statics.field2563.field991, Statics.field2563.field939, Statics.field1950) - field868;
                                            } else if (field724 == 1) {
                                                if (field650 && Statics.field2563 != null) {
                                                    int var84 = Statics.field2563.field994[0];
                                                    int var85 = Statics.field2563.field969[0];
                                                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                                                        Statics.field1245 = Statics.field2563.field991;
                                                        int var86 = method2028(Statics.field2563.field991, Statics.field2563.field939, Statics.field1950) - field868;
                                                        if (var86 < Statics.field1342) {
                                                            Statics.field1342 = var86;
                                                        }
                                                        Statics.field1478 = Statics.field2563.field939;
                                                        field650 = false;
                                                    }
                                                }
                                                short var87 = -1;
                                                if (class55.field417[33]) {
                                                    var87 = 0;
                                                } else if (class55.field417[49]) {
                                                    var87 = 1024;
                                                }
                                                if (class55.field417[48]) {
                                                    if (var87 == 0) {
                                                        var87 = 1792;
                                                    } else if (var87 == 1024) {
                                                        var87 = 1280;
                                                    } else {
                                                        var87 = 1536;
                                                    }
                                                } else if (class55.field417[50]) {
                                                    if (var87 == 0) {
                                                        var87 = 256;
                                                    } else if (var87 == 1024) {
                                                        var87 = 768;
                                                    } else {
                                                        var87 = 512;
                                                    }
                                                }
                                                byte var88 = 0;
                                                if (class55.field417[35]) {
                                                    var88 = -1;
                                                } else if (class55.field417[51]) {
                                                    var88 = 1;
                                                }
                                                int var89 = 0;
                                                if (var87 >= 0 || var88 != 0) {
                                                    int var90 = class55.field417[81] ? field677 : field729;
                                                    var89 = var90 * 16;
                                                    field762 = var87;
                                                    field789 = var88;
                                                }
                                                if (field756 < var89) {
                                                    field756 += var89 / 8;
                                                    if (field756 > var89) {
                                                        field756 = var89;
                                                    }
                                                } else if (field756 > var89) {
                                                    field756 = field756 * 9 / 10;
                                                }
                                                if (field756 > 0) {
                                                    int var91 = field756 / 16;
                                                    if (field762 >= 0) {
                                                        int var92 = field762 - Statics.field3177 & 0x7FF;
                                                        int var93 = class140.field1798[var92];
                                                        int var94 = class140.field1781[var92];
                                                        Statics.field1245 += var91 * var93 / 65536;
                                                        Statics.field1478 += var91 * var94 / 65536;
                                                    }
                                                    if (field789 != 0) {
                                                        Statics.field1342 += field789 * var91;
                                                        if (Statics.field1342 > 0) {
                                                            Statics.field1342 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field762 = -1;
                                                    field789 = -1;
                                                }
                                                if (class55.field417[13]) {
                                                    field695.method2155(class197.method1128(class193.field2245, field695.field1329));
                                                    field724 = 0;
                                                }
                                            }
                                            if (class64.field492 == 4 && Statics.field1990) {
                                                int var95 = class64.field500 - field723;
                                                field761 = var95 * 2;
                                                field723 = var95 == -1 || var95 == 1 ? class64.field500 : (field723 + class64.field500) / 2;
                                                int var96 = field722 - class64.field493;
                                                field720 = var96 * 2;
                                                field722 = var96 == -1 || var96 == 1 ? class64.field493 : (field722 + class64.field493) / 2;
                                            } else {
                                                if (class55.field417[96]) {
                                                    field720 += (-24 - field720) / 2;
                                                } else if (class55.field417[97]) {
                                                    field720 += (24 - field720) / 2;
                                                } else {
                                                    field720 /= 2;
                                                }
                                                if (class55.field417[98]) {
                                                    field761 += (12 - field761) / 2;
                                                } else if (class55.field417[99]) {
                                                    field761 += (-12 - field761) / 2;
                                                } else {
                                                    field761 /= 2;
                                                }
                                                field723 = class64.field500;
                                                field722 = class64.field493;
                                            }
                                            field831 = field720 / 2 + field831 & 0x7FF;
                                            field778 += field761 / 2;
                                            if (field778 < 128) {
                                                field778 = 128;
                                            }
                                            if (field778 > 383) {
                                                field778 = 383;
                                            }
                                            if (field891) {
                                                int var97 = Statics.field2125 * 128 + 64;
                                                int var98 = Statics.field1141 * 128 + 64;
                                                int var99 = method2028(var97, var98, Statics.field1950) - Statics.field303;
                                                if (Statics.field631 < var97) {
                                                    Statics.field631 += Statics.field272 * (var97 - Statics.field631) / 1000 + Statics.field1317;
                                                    if (Statics.field631 > var97) {
                                                        Statics.field631 = var97;
                                                    }
                                                }
                                                if (Statics.field631 > var97) {
                                                    Statics.field631 -= Statics.field272 * (Statics.field631 - var97) / 1000 + Statics.field1317;
                                                    if (Statics.field631 < var97) {
                                                        Statics.field631 = var97;
                                                    }
                                                }
                                                if (Statics.field422 < var99) {
                                                    Statics.field422 += Statics.field272 * (var99 - Statics.field422) / 1000 + Statics.field1317;
                                                    if (Statics.field422 > var99) {
                                                        Statics.field422 = var99;
                                                    }
                                                }
                                                if (Statics.field422 > var99) {
                                                    Statics.field422 -= Statics.field272 * (Statics.field422 - var99) / 1000 + Statics.field1317;
                                                    if (Statics.field422 < var99) {
                                                        Statics.field422 = var99;
                                                    }
                                                }
                                                if (Statics.field559 < var98) {
                                                    Statics.field559 += Statics.field272 * (var98 - Statics.field559) / 1000 + Statics.field1317;
                                                    if (Statics.field559 > var98) {
                                                        Statics.field559 = var98;
                                                    }
                                                }
                                                if (Statics.field559 > var98) {
                                                    Statics.field559 -= Statics.field272 * (Statics.field559 - var98) / 1000 + Statics.field1317;
                                                    if (Statics.field559 < var98) {
                                                        Statics.field559 = var98;
                                                    }
                                                }
                                                int var100 = Statics.field113 * 128 + 64;
                                                int var101 = Statics.field3341 * 128 + 64;
                                                int var102 = method2028(var100, var101, Statics.field1950) - Statics.field129;
                                                int var103 = var100 - Statics.field631;
                                                int var104 = var102 - Statics.field422;
                                                int var105 = var101 - Statics.field559;
                                                int var106 = (int) Math.sqrt((double) (var103 * var103 + var105 * var105));
                                                int var107 = (int) (Math.atan2((double) var104, (double) var106) * 325.949D) & 0x7FF;
                                                int var108 = (int) (Math.atan2((double) var103, (double) var105) * -325.949D) & 0x7FF;
                                                if (var107 < 128) {
                                                    var107 = 128;
                                                }
                                                if (var107 > 383) {
                                                    var107 = 383;
                                                }
                                                if (Statics.field1824 < var107) {
                                                    Statics.field1824 += Statics.field2406 * (var107 - Statics.field1824) / 1000 + Statics.field1268;
                                                    if (Statics.field1824 > var107) {
                                                        Statics.field1824 = var107;
                                                    }
                                                }
                                                if (Statics.field1824 > var107) {
                                                    Statics.field1824 -= Statics.field2406 * (Statics.field1824 - var107) / 1000 + Statics.field1268;
                                                    if (Statics.field1824 < var107) {
                                                        Statics.field1824 = var107;
                                                    }
                                                }
                                                int var109 = var108 - Statics.field3177;
                                                if (var109 > 1024) {
                                                    var109 -= 2048;
                                                }
                                                if (var109 < -1024) {
                                                    var109 += 2048;
                                                }
                                                if (var109 > 0) {
                                                    Statics.field3177 += Statics.field2406 * var109 / 1000 + Statics.field1268;
                                                    Statics.field3177 &= 0x7FF;
                                                }
                                                if (var109 < 0) {
                                                    Statics.field3177 -= Statics.field2406 * -var109 / 1000 + Statics.field1268;
                                                    Statics.field3177 &= 0x7FF;
                                                }
                                                int var110 = var108 - Statics.field3177;
                                                if (var110 > 1024) {
                                                    var110 -= 2048;
                                                }
                                                if (var110 < -1024) {
                                                    var110 += 2048;
                                                }
                                                if (var110 < 0 && var109 > 0 || var110 > 0 && var109 < 0) {
                                                    Statics.field3177 = var108;
                                                }
                                            }
                                            for (int var111 = 0; var111 < 5; var111++) {
                                                int var10002 = field645[var111]++;
                                            }
                                            Statics.field1271.method2072();
                                            int var112 = class64.method3121();
                                            int var113 = class55.method4058();
                                            if (var112 > 15000 && var113 > 15000) {
                                                field734 = 250;
                                                class64.method2149(14500);
                                                class197 var114 = class197.method1128(class193.field2304, field695.field1329);
                                                field695.method2155(var114);
                                            }
                                            Statics.field2037.method1775();
                                            field695.field1335++;
                                            if (field695.field1335 > 50) {
                                                class197 var115 = class197.method1128(class193.field2323, field695.field1329);
                                                field695.method2155(var115);
                                            }
                                            try {
                                                field695.method2158();
                                            } catch (IOException var117) {
                                                method1755();
                                            }
                                            return;
                                        }
                                        var59 = var58.field572;
                                        if (var59.field2588 < 0) {
                                            break;
                                        }
                                        var60 = class227.method3345(var59.field2671);
                                    } while (var60 == null || var60.field2673 == null || var59.field2588 >= var60.field2673.length || var60.field2673[var59.field2588] != var59);
                                    class86.method197(var58);
                                }
                            }
                            var56 = var55.field572;
                            if (var56.field2588 < 0) {
                                break;
                            }
                            var57 = class227.method3345(var56.field2671);
                        } while (var57 == null || var57.field2673 == null || var56.field2588 >= var57.field2673.length || var57.field2673[var56.field2588] != var56);
                        class86.method197(var55);
                    }
                }
                var53 = var52.field572;
                if (var53.field2588 < 0) {
                    break;
                }
                var54 = class227.method3345(var53.field2671);
            } while (var54 == null || var54.field2673 == null || var53.field2588 >= var54.field2673.length || var54.field2673[var53.field2588] != var53);
            class86.method197(var52);
        }
    }

    @ObfuscatedName("kr.fo(B)V")
    public static final void method4939() {
        if (Statics.field3678 != null) {
            Statics.field3678.method2337();
        }
        if (Statics.field193 != null) {
            Statics.field193.method2337();
        }
    }

    @ObfuscatedName("ai.gc(I)V")
    public static final void method591() {
        for (int var0 = 0; var0 < field885; var0++) {
            int var10002 = field888[var0]--;
            if (field888[var0] >= -10) {
                class111 var2 = field890[var0];
                if (var2 == null) {
                    class111 var10000 = (class111) null;
                    var2 = class111.method2243(Statics.field2731, field858[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field888[var0] += var2.method2240();
                    field890[var0] = var2;
                }
                if (field888[var0] < 0) {
                    int var9;
                    if (field889[var0] == 0) {
                        var9 = Statics.field3618.field1060;
                    } else {
                        int var3 = (field889[var0] & 0xFF) * 128;
                        int var4 = field889[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2563.field991;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field889[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2563.field939;
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
                        var9 = Statics.field3618.field1061 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class113 var10 = var2.method2245().method2286(Statics.field1558);
                        class123 var11 = class123.method2414(var10, 100, var9);
                        var11.method2417(field887[var0] - 1);
                        Statics.field351.method2184(var11);
                    }
                    field888[var0] = -100;
                }
            } else {
                field885--;
                for (int var1 = var0; var1 < field885; var1++) {
                    field858[var1] = field858[var1 + 1];
                    field890[var1] = field890[var1 + 1];
                    field887[var1] = field887[var1 + 1];
                    field888[var1] = field888[var1 + 1];
                    field889[var1] = field889[var1 + 1];
                }
                var0--;
            }
        }
        if (field884 && !class207.method3282()) {
            if (Statics.field3618.field1057 != 0 && field780 != -1) {
                class207.method1934(Statics.field2521, field780, 0, Statics.field3618.field1057, false);
            }
            field884 = false;
        }
    }

    @ObfuscatedName("hl.gz(Ljy;IIIB)V")
    public static void method3725(class270 arg0, int arg1, int arg2, int arg3) {
        if (field885 >= 50 || Statics.field3618.field1061 == 0 || arg0.field3562 == null || arg1 >= arg0.field3562.length) {
            return;
        }
        int var4 = arg0.field3562[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field858[field885] = var5;
        field887[field885] = var6;
        field888[field885] = 0;
        field890[field885] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field889[field885] = (var8 << 16) + (var9 << 8) + var7;
        field885++;
    }

    @ObfuscatedName("hd.gj(IIII)V")
    public static void method3803(int arg0, int arg1, int arg2) {
        if (Statics.field3618.field1060 == 0 || arg1 == 0 || field885 >= 50) {
            return;
        }
        field858[field885] = arg0;
        field887[field885] = arg1;
        field888[field885] = arg2;
        field890[field885] = null;
        field889[field885] = 0;
        field885++;
    }

    @ObfuscatedName("k.gr(II)V")
    public static void method220(int arg0) {
        if (arg0 == -1 && !field884) {
            class207.method530();
        } else if (arg0 != -1 && field780 != arg0 && Statics.field3618.field1057 != 0 && !field884) {
            class207.method1100(2, Statics.field2521, arg0, 0, Statics.field3618.field1057, false);
        }
        field780 = arg0;
    }

    @ObfuscatedName("gw.gg(IIB)V")
    public static void method3374(int arg0, int arg1) {
        if (Statics.field3618.field1057 != 0 && arg0 != -1) {
            class207.method1934(Statics.field545, arg0, 0, Statics.field3618.field1057, false);
            field884 = true;
        }
    }

    @ObfuscatedName("q.gm(I)V")
    public static final void method187() {
        if (!Statics.field208) {
            return;
        }
        if (Statics.field245 != null) {
            Statics.field245.method4741();
        }
        method1096();
        Statics.field208 = false;
    }

    @ObfuscatedName("fw.gh(I)V")
    public static final void method3314() {
        if (Statics.field1950 == field875) {
            return;
        }
        field875 = Statics.field1950;
        int var0 = Statics.field1950;
        int[] var1 = Statics.field127.field3918;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class65.field508[var0][var6][var4] & 0x18) == 0) {
                    Statics.field537.method2963(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class65.field508[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field537.method2963(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field127.method5684();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class65.field508[var0][var10][var9] & 0x18) == 0) {
                    method6(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class65.field508[var0 + 1][var10][var9] & 0x8) != 0) {
                    method6(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field757 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field537.method2958(Statics.field1950, var11, var12);
                if (var13 != 0L) {
                    int var15 = class138.method3119(var13);
                    int var16 = class265.method325(var15).field3415;
                    if (var16 >= 0 && class253.method3211(var16).field3264) {
                        field879[field757] = class253.method3211(var16).method4038(false);
                        field718[field757] = var11;
                        field878[field757] = var12;
                        field757++;
                    }
                }
            }
        }
        Statics.field151.method5651();
    }

    @ObfuscatedName("fk.gu(Lhe;III)V")
    public static final void method3233(class227 arg0, int arg1, int arg2) {
        if (field895 != 0 && field895 != 3 || field785 || !(class64.field484 == 1 || !Statics.field1990 && class64.field484 == 4)) {
            return;
        }
        class221 var3 = arg0.method3755(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field490 - arg1;
        int var5 = class64.field503 - arg2;
        if (!var3.method3662(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2538 / 2;
        int var7 = var5 - var3.field2533 / 2;
        int var8 = field831 & 0x7FF;
        int var9 = class140.field1798[var8];
        int var10 = class140.field1781[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2563.field991 + var11 >> 7;
        int var14 = Statics.field2563.field939 - var12 >> 7;
        class197 var15 = class197.method1128(class193.field2273, field695.field1329);
        var15.field2361.method5095(18);
        var15.field2361.method5312(Statics.field3157 + var13);
        var15.field2361.method5143(class55.field417[82] ? (class55.field417[81] ? 2 : 1) : 0);
        var15.field2361.method5334(Statics.field301 + var14);
        var15.field2361.method5095(var6);
        var15.field2361.method5095(var7);
        var15.field2361.method5099(field831);
        var15.field2361.method5095(57);
        var15.field2361.method5095(0);
        var15.field2361.method5095(0);
        var15.field2361.method5095(89);
        var15.field2361.method5099(Statics.field2563.field991);
        var15.field2361.method5099(Statics.field2563.field939);
        var15.field2361.method5095(63);
        field695.method2155(var15);
        field775 = var13;
        field881 = var14;
    }

    @ObfuscatedName("ai.go(I)V")
    public static final void method615() {
        int[] var0 = class99.field1269;
        for (int var1 = 0; var1 < class99.field1264; var1++) {
            class76 var2 = field765[var0[var1]];
            if (var2 != null && var2.field992 > 0) {
                var2.field992--;
                if (var2.field992 == 0) {
                    var2.field952 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field691; var3++) {
            int var4 = field692[var3];
            class89 var5 = field690[var4];
            if (var5 != null && var5.field992 > 0) {
                var5.field992--;
                if (var5.field992 == 0) {
                    var5.field952 = null;
                }
            }
        }
    }

    @ObfuscatedName("bw.gt(Ljava/lang/String;B)V")
    public static final void method1098(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field3618.field1053 = !Statics.field3618.field1053;
            class83.method165();
            if (Statics.field3618.field1053) {
                Statics.method3809(99, "", "Roofs are now all hidden");
            } else {
                Statics.method3809(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field783 = !field783;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field726 = !field726;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field797 = !field797;
        }
        if (field776 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field199.field4044 = !Statics.field199.field4044;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field783 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field783 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1755();
            }
        }
        class197 var1 = class197.method1128(class193.field2244, field695.field1329);
        var1.field2361.method5095(arg0.length() + 1);
        var1.field2361.method5105(arg0);
        field695.method2155(var1);
    }

    @ObfuscatedName("fj.gb(I)V")
    public static final void method3202() {
        for (int var0 = 0; var0 < field691; var0++) {
            int var1 = field692[var0];
            class89 var2 = field690[var1];
            if (var2 != null) {
                method540(var2, var2.field1136.field3501);
            }
        }
    }

    @ObfuscatedName("ao.gw(Lcx;II)V")
    public static final void method540(class79 arg0, int arg1) {
        if (arg0.field985 >= field656) {
            method584(arg0);
        } else if (arg0.field974 >= field656) {
            if (field656 == arg0.field974 || arg0.field971 == -1 || arg0.field938 != 0 || arg0.field973 + 1 > class270.method4174(arg0.field971).field3553[arg0.field972]) {
                int var2 = arg0.field974 - arg0.field985;
                int var3 = field656 - arg0.field985;
                int var4 = arg0.field982 * 128 + arg0.field942 * 64;
                int var5 = arg0.field983 * 128 + arg0.field942 * 64;
                int var6 = arg0.field959 * 128 + arg0.field942 * 64;
                int var7 = arg0.field957 * 128 + arg0.field942 * 64;
                arg0.field991 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field939 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field964 = 0;
            arg0.field990 = arg0.field987;
            arg0.field940 = arg0.field990;
        } else {
            method712(arg0);
        }
        if (arg0.field991 < 128 || arg0.field939 < 128 || arg0.field991 >= 13184 || arg0.field939 >= 13184) {
            arg0.field971 = -1;
            arg0.field976 = -1;
            arg0.field985 = 0;
            arg0.field974 = 0;
            arg0.field991 = arg0.field994[0] * 128 + arg0.field942 * 64;
            arg0.field939 = arg0.field969[0] * 128 + arg0.field942 * 64;
            arg0.method1657();
        }
        if (Statics.field2563 == arg0 && (arg0.field991 < 1536 || arg0.field939 < 1536 || arg0.field991 >= 11776 || arg0.field939 >= 11776)) {
            arg0.field971 = -1;
            arg0.field976 = -1;
            arg0.field985 = 0;
            arg0.field974 = 0;
            arg0.field991 = arg0.field994[0] * 128 + arg0.field942 * 64;
            arg0.field939 = arg0.field969[0] * 128 + arg0.field942 * 64;
            arg0.method1657();
        }
        if (arg0.field941 != 0) {
            if (arg0.field981 != -1) {
                class79 var8 = null;
                if (arg0.field981 < 32768) {
                    var8 = field690[arg0.field981];
                } else if (arg0.field981 >= 32768) {
                    var8 = field765[arg0.field981 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field991 - var8.field991;
                    int var10 = arg0.field939 - var8.field939;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field990 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field966) {
                    arg0.field981 = -1;
                    arg0.field966 = false;
                }
            }
            if (arg0.field960 != -1 && (arg0.field986 == 0 || arg0.field964 > 0)) {
                arg0.field990 = arg0.field960;
                arg0.field960 = -1;
            }
            int var11 = arg0.field990 - arg0.field940 & 0x7FF;
            if (var11 == 0 && arg0.field966) {
                arg0.field981 = -1;
                arg0.field966 = false;
            }
            if (var11 == 0) {
                arg0.field955 = 0;
            } else {
                arg0.field955++;
                if (var11 > 1024) {
                    arg0.field940 -= arg0.field941;
                    boolean var12 = true;
                    if (var11 < arg0.field941 || var11 > 2048 - arg0.field941) {
                        arg0.field940 = arg0.field990;
                        var12 = false;
                    }
                    if (arg0.field968 == arg0.field944 && (arg0.field955 > 25 || var12)) {
                        if (arg0.field945 == -1) {
                            arg0.field968 = arg0.field947;
                        } else {
                            arg0.field968 = arg0.field945;
                        }
                    }
                } else {
                    arg0.field940 += arg0.field941;
                    boolean var13 = true;
                    if (var11 < arg0.field941 || var11 > 2048 - arg0.field941) {
                        arg0.field940 = arg0.field990;
                        var13 = false;
                    }
                    if (arg0.field968 == arg0.field944 && (arg0.field955 > 25 || var13)) {
                        if (arg0.field946 == -1) {
                            arg0.field968 = arg0.field947;
                        } else {
                            arg0.field968 = arg0.field946;
                        }
                    }
                }
                arg0.field940 &= 0x7FF;
            }
        }
        method2924(arg0);
    }

    @ObfuscatedName("ai.gs(Lcx;I)V")
    public static final void method584(class79 arg0) {
        int var1 = Math.max(1, arg0.field985 - field656);
        int var2 = arg0.field982 * 128 + arg0.field942 * 64;
        int var3 = arg0.field983 * 128 + arg0.field942 * 64;
        arg0.field991 += (var2 - arg0.field991) / var1;
        arg0.field939 += (var3 - arg0.field939) / var1;
        arg0.field964 = 0;
        arg0.field990 = arg0.field987;
    }

    @ObfuscatedName("at.gk(Lcx;I)V")
    public static final void method712(class79 arg0) {
        arg0.field968 = arg0.field944;
        if (arg0.field986 == 0) {
            arg0.field964 = 0;
            return;
        }
        if (arg0.field971 != -1 && arg0.field938 == 0) {
            class270 var1 = class270.method4174(arg0.field971);
            if (arg0.field997 > 0 && var1.field3561 == 0) {
                arg0.field964++;
                return;
            }
            if (arg0.field997 <= 0 && var1.field3556 == 0) {
                arg0.field964++;
                return;
            }
        }
        int var2 = arg0.field991;
        int var3 = arg0.field939;
        int var4 = arg0.field994[arg0.field986 - 1] * 128 + arg0.field942 * 64;
        int var5 = arg0.field969[arg0.field986 - 1] * 128 + arg0.field942 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field990 = 1280;
            } else if (var3 > var5) {
                arg0.field990 = 1792;
            } else {
                arg0.field990 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field990 = 768;
            } else if (var3 > var5) {
                arg0.field990 = 256;
            } else {
                arg0.field990 = 512;
            }
        } else if (var3 < var5) {
            arg0.field990 = 1024;
        } else if (var3 > var5) {
            arg0.field990 = 0;
        }
        byte var6 = arg0.field996[arg0.field986 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field991 = var4;
            arg0.field939 = var5;
            arg0.field986--;
            if (arg0.field997 > 0) {
                arg0.field997--;
            }
            return;
        }
        int var7 = arg0.field990 - arg0.field940 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field948;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field947;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field950;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field949;
        }
        if (var8 == -1) {
            var8 = arg0.field947;
        }
        arg0.field968 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class89) {
            var10 = ((class89) arg0).field1136.field3514;
        }
        if (var10) {
            if (arg0.field990 != arg0.field940 && arg0.field981 == -1 && arg0.field941 != 0) {
                var9 = 2;
            }
            if (arg0.field986 > 2) {
                var9 = 6;
            }
            if (arg0.field986 > 3) {
                var9 = 8;
            }
            if (arg0.field964 > 0 && arg0.field986 > 1) {
                var9 = 8;
                arg0.field964--;
            }
        } else {
            if (arg0.field986 > 1) {
                var9 = 6;
            }
            if (arg0.field986 > 2) {
                var9 = 8;
            }
            if (arg0.field964 > 0 && arg0.field986 > 1) {
                var9 = 8;
                arg0.field964--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field968 == arg0.field947 && arg0.field943 != -1) {
            arg0.field968 = arg0.field943;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field991 += var9;
                if (arg0.field991 > var4) {
                    arg0.field991 = var4;
                }
            } else if (var2 > var4) {
                arg0.field991 -= var9;
                if (arg0.field991 < var4) {
                    arg0.field991 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field939 += var9;
                if (arg0.field939 > var5) {
                    arg0.field939 = var5;
                }
            } else if (var3 > var5) {
                arg0.field939 -= var9;
                if (arg0.field939 < var5) {
                    arg0.field939 = var5;
                }
            }
        }
        if (arg0.field991 == var4 && arg0.field939 == var5) {
            arg0.field986--;
            if (arg0.field997 > 0) {
                arg0.field997--;
            }
        }
    }

    @ObfuscatedName("ew.gv(Lcx;I)V")
    public static final void method2924(class79 arg0) {
        arg0.field951 = false;
        if (arg0.field968 != -1) {
            class270 var1 = class270.method4174(arg0.field968);
            if (var1 == null || var1.field3551 == null) {
                arg0.field968 = -1;
            } else {
                arg0.field970++;
                if (arg0.field965 < var1.field3551.length && arg0.field970 > var1.field3553[arg0.field965]) {
                    arg0.field970 = 1;
                    arg0.field965++;
                    method3725(var1, arg0.field965, arg0.field991, arg0.field939);
                }
                if (arg0.field965 >= var1.field3551.length) {
                    arg0.field970 = 0;
                    arg0.field965 = 0;
                    method3725(var1, arg0.field965, arg0.field991, arg0.field939);
                }
            }
        }
        if (arg0.field976 != -1 && field656 >= arg0.field979) {
            if (arg0.field977 < 0) {
                arg0.field977 = 0;
            }
            int var2 = class255.method2025(arg0.field976).field3285;
            if (var2 == -1) {
                arg0.field976 = -1;
            } else {
                class270 var3 = class270.method4174(var2);
                if (var3 == null || var3.field3551 == null) {
                    arg0.field976 = -1;
                } else {
                    arg0.field978++;
                    if (arg0.field977 < var3.field3551.length && arg0.field978 > var3.field3553[arg0.field977]) {
                        arg0.field978 = 1;
                        arg0.field977++;
                        method3725(var3, arg0.field977, arg0.field991, arg0.field939);
                    }
                    if (arg0.field977 >= var3.field3551.length && (arg0.field977 < 0 || arg0.field977 >= var3.field3551.length)) {
                        arg0.field976 = -1;
                    }
                }
            }
        }
        if (arg0.field971 != -1 && arg0.field938 <= 1) {
            class270 var4 = class270.method4174(arg0.field971);
            if (var4.field3561 == 1 && arg0.field997 > 0 && arg0.field985 <= field656 && arg0.field974 < field656) {
                arg0.field938 = 1;
                return;
            }
        }
        if (arg0.field971 != -1 && arg0.field938 == 0) {
            class270 var5 = class270.method4174(arg0.field971);
            if (var5 == null || var5.field3551 == null) {
                arg0.field971 = -1;
            } else {
                arg0.field973++;
                if (arg0.field972 < var5.field3551.length && arg0.field973 > var5.field3553[arg0.field972]) {
                    arg0.field973 = 1;
                    arg0.field972++;
                    method3725(var5, arg0.field972, arg0.field991, arg0.field939);
                }
                if (arg0.field972 >= var5.field3551.length) {
                    arg0.field972 -= var5.field3559;
                    arg0.field975++;
                    if (arg0.field975 >= var5.field3555) {
                        arg0.field971 = -1;
                    } else if (arg0.field972 >= 0 && arg0.field972 < var5.field3551.length) {
                        method3725(var5, arg0.field972, arg0.field991, arg0.field939);
                    } else {
                        arg0.field971 = -1;
                    }
                }
                arg0.field951 = var5.field3557;
            }
        }
        if (arg0.field938 > 0) {
            arg0.field938--;
        }
    }

    @ObfuscatedName("bi.gx(Lbq;III)V")
    public static void method1089(class76 arg0, int arg1, int arg2) {
        if (arg0.field971 == arg1 && arg1 != -1) {
            int var3 = class270.method4174(arg1).field3549;
            if (var3 == 1) {
                arg0.field972 = 0;
                arg0.field973 = 0;
                arg0.field938 = arg2;
                arg0.field975 = 0;
            }
            if (var3 == 2) {
                arg0.field975 = 0;
            }
        } else if (arg1 == -1 || arg0.field971 == -1 || class270.method4174(arg1).field3558 >= class270.method4174(arg0.field971).field3558) {
            arg0.field971 = arg1;
            arg0.field972 = 0;
            arg0.field973 = 0;
            arg0.field938 = arg2;
            arg0.field975 = 0;
            arg0.field997 = arg0.field986;
        }
    }

    @ObfuscatedName("dt.ga(B)I")
    public static int method2373() {
        return field669 ? 2 : 1;
    }

    @ObfuscatedName("c.gi(II)V")
    public static void method111(int arg0) {
        field862 = 0L;
        if (arg0 >= 2) {
            field669 = true;
        } else {
            field669 = false;
        }
        if (method2373() == 1) {
            Statics.field148.method846(765, 503);
        } else {
            Statics.field148.method846(7680, 2160);
        }
        if (field654 >= 25) {
            method1143();
        }
    }

    @ObfuscatedName("bv.gp(I)V")
    public static void method1143() {
        class197 var0 = class197.method1128(class193.field2274, field695.field1329);
        var0.field2361.method5095(method2373());
        var0.field2361.method5099(Statics.field3639);
        var0.field2361.method5099(Statics.field1893);
        field695.method2155(var0);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method854() {
        field862 = class308.method4891() + 500L;
        this.method1401();
        if (field874 != -1) {
            this.method1651(true);
        }
    }

    @ObfuscatedName("client.ge(I)V")
    public void method1401() {
        int var1 = Statics.field3639;
        int var2 = Statics.field1893;
        if (this.field461 < var1) {
            int var3 = this.field461;
        }
        if (this.field462 < var2) {
            int var4 = this.field462;
        }
        if (Statics.field3618 == null) {
            return;
        }
        try {
            client var5 = Statics.field148;
            Object[] var6 = new Object[] { method2373() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gn(I)V")
    public final void method1351() {
        if (field874 != -1) {
            method4387(field874);
        }
        for (int var1 = 0; var1 < field825; var1++) {
            if (field902[var1]) {
                field855[var1] = true;
            }
            field856[var1] = field902[var1];
            field902[var1] = false;
        }
        field853 = field656;
        field798 = -1;
        field799 = -1;
        Statics.field1923 = null;
        if (field874 != -1) {
            field825 = 0;
            method745(field874, 0, 0, Statics.field3639, Statics.field1893, 0, 0, -1);
        }
        class332.method5624();
        if (field754) {
            if (field753 == 1) {
                Statics.field99[field751 / 100].method5688(field750 - 8, field768 - 8);
            }
            if (field753 == 2) {
                Statics.field99[field751 / 100 + 4].method5688(field750 - 8, field768 - 8);
            }
        }
        if (field785) {
            int var2 = Statics.field3632;
            int var3 = Statics.field1316;
            int var4 = Statics.field1929;
            int var5 = Statics.field2121;
            int var6 = 6116423;
            class332.method5581(var2, var3, var4, var5, var6);
            class332.method5581(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class332.method5585(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field75.method4956(class234.field2988, var2 + 3, var3 + 14, var6, -1);
            int var7 = class64.field493;
            int var8 = class64.field500;
            for (int var9 = 0; var9 < field786; var9++) {
                int var10 = (field786 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field75.method4956(method1109(var9), var2 + 3, var10, var11, 0);
            }
            method3804(Statics.field3632, Statics.field1316, Statics.field1929, Statics.field2121);
        } else if (field798 != -1) {
            method221(field798, field799);
        }
        if (field861 == 3) {
            for (int var12 = 0; var12 < field825; var12++) {
                if (field856[var12]) {
                    class332.method5580(field857[var12], field918[var12], field859[var12], field809[var12], 16711935, 128);
                } else if (field855[var12]) {
                    class332.method5580(field857[var12], field918[var12], field859[var12], field809[var12], 16711680, 128);
                }
            }
        }
        class85.method4819(Statics.field1950, Statics.field2563.field991, Statics.field2563.field939, field851);
        field851 = 0;
    }

    @ObfuscatedName("hc.gd(Ljava/lang/String;ZB)V")
    public static final void method3669(String arg0, boolean arg1) {
        if (!field764) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field138.method4963(arg0, 250);
        int var6 = Statics.field138.method5011(arg0, 250) * 13;
        class332.method5581(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class332.method5585(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field138.method4970(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3114(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field151.method835(0, 0);
        } else {
            method3804(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ck.gl(IIIII)V")
    public static final void method2038(int arg0, int arg1, int arg2, int arg3) {
        field747++;
        method1979();
        method713();
        if (field815 >= 0 && field765[field815] != null) {
            method1759(field765[field815], false);
        }
        method2927(true);
        method304();
        method2927(false);
        for (class96 var4 = (class96) field779.method4540(); var4 != null; var4 = (class96) field779.method4545()) {
            if (Statics.field1950 != var4.field1226 || field656 > var4.field1235) {
                var4.method3359();
            } else if (field656 >= var4.field1219) {
                if (var4.field1232 > 0) {
                    class89 var5 = field690[var4.field1232 - 1];
                    if (var5 != null && var5.field991 >= 0 && var5.field991 < 13312 && var5.field939 >= 0 && var5.field939 < 13312) {
                        var4.method2014(var5.field991, var5.field939, method2028(var5.field991, var5.field939, var4.field1226) - var4.field1228, field656);
                    }
                }
                if (var4.field1232 < 0) {
                    int var6 = -var4.field1232 - 1;
                    class76 var7;
                    if (field766 == var6) {
                        var7 = Statics.field2563;
                    } else {
                        var7 = field765[var6];
                    }
                    if (var7 != null && var7.field991 >= 0 && var7.field991 < 13312 && var7.field939 >= 0 && var7.field939 < 13312) {
                        var4.method2014(var7.field991, var7.field939, method2028(var7.field991, var7.field939, var4.field1226) - var4.field1228, field656);
                    }
                }
                var4.method2016(field851);
                Statics.field537.method2940(Statics.field1950, (int) var4.field1225, (int) var4.field1218, (int) var4.field1233, 60, var4, var4.field1223, -1L, false);
            }
        }
        Statics.method409();
        method227(arg0, arg1, arg2, arg3, true);
        int var8 = field905;
        int var9 = field906;
        int var10 = field907;
        int var11 = field696;
        class332.method5573(var8, var9, var8 + var10, var9 + var11);
        class140.method2907();
        if (!field891) {
            int var12 = field778;
            if (field919 / 256 > var12) {
                var12 = field919 / 256;
            }
            if (field903[4] && field894[4] + 128 > var12) {
                var12 = field894[4] + 128;
            }
            int var13 = field831 & 0x7FF;
            int var14 = Statics.field1245;
            int var15 = Statics.field1342;
            int var16 = Statics.field1478;
            int var17 = method616(var12);
            int var18 = method3293(var17, var11);
            int var19 = 2048 - var12 & 0x7FF;
            int var20 = 2048 - var13 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class140.field1798[var19];
                int var25 = class140.field1781[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class140.field1798[var20];
                int var28 = class140.field1781[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field631 = var14 - var21;
            Statics.field422 = var15 - var22;
            Statics.field559 = var16 - var23;
            Statics.field1824 = var12;
            Statics.field3177 = var13;
            if (field724 == 1 && field776 >= 2 && field656 % 50 == 0 && (Statics.field1245 >> 7 != Statics.field2563.field991 >> 7 || Statics.field1478 >> 7 != Statics.field2563.field939 >> 7)) {
                int var30 = Statics.field2563.field628;
                int var31 = (Statics.field1245 >> 7) + Statics.field3157;
                int var32 = (Statics.field1478 >> 7) + Statics.field301;
                class197 var33 = class197.method1128(class193.field2270, field695.field1329);
                var33.field2361.method5151(var31);
                var33.field2361.method5160(field731);
                var33.field2361.method5312(var32);
                var33.field2361.method5095(var30);
                field695.method2155(var33);
            }
        }
        int var46;
        if (field891) {
            var46 = method624();
        } else {
            int var34;
            if (Statics.field3618.field1053) {
                var34 = Statics.field1950;
            } else {
                label506: {
                    int var35 = 3;
                    if (Statics.field1824 < 310) {
                        label498: {
                            int var36;
                            int var37;
                            if (field724 == 1) {
                                var36 = Statics.field1245 >> 7;
                                var37 = Statics.field1478 >> 7;
                            } else {
                                var36 = Statics.field2563.field991 >> 7;
                                var37 = Statics.field2563.field939 >> 7;
                            }
                            int var38 = Statics.field631 >> 7;
                            int var39 = Statics.field559 >> 7;
                            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                                    if ((class65.field508[Statics.field1950][var38][var39] & 0x4) != 0) {
                                        var35 = Statics.field1950;
                                    }
                                    int var40;
                                    if (var36 > var38) {
                                        var40 = var36 - var38;
                                    } else {
                                        var40 = var38 - var36;
                                    }
                                    int var41;
                                    if (var37 > var39) {
                                        var41 = var37 - var39;
                                    } else {
                                        var41 = var39 - var37;
                                    }
                                    if (var40 > var41) {
                                        int var42 = var41 * 65536 / var40;
                                        int var43 = 32768;
                                        while (true) {
                                            if (var36 == var38) {
                                                break label498;
                                            }
                                            if (var38 < var36) {
                                                var38++;
                                            } else if (var38 > var36) {
                                                var38--;
                                            }
                                            if ((class65.field508[Statics.field1950][var38][var39] & 0x4) != 0) {
                                                var35 = Statics.field1950;
                                            }
                                            var43 += var42;
                                            if (var43 >= 65536) {
                                                var43 -= 65536;
                                                if (var39 < var37) {
                                                    var39++;
                                                } else if (var39 > var37) {
                                                    var39--;
                                                }
                                                if ((class65.field508[Statics.field1950][var38][var39] & 0x4) != 0) {
                                                    var35 = Statics.field1950;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var41 > 0) {
                                            int var44 = var40 * 65536 / var41;
                                            int var45 = 32768;
                                            while (var37 != var39) {
                                                if (var39 < var37) {
                                                    var39++;
                                                } else if (var39 > var37) {
                                                    var39--;
                                                }
                                                if ((class65.field508[Statics.field1950][var38][var39] & 0x4) != 0) {
                                                    var35 = Statics.field1950;
                                                }
                                                var45 += var44;
                                                if (var45 >= 65536) {
                                                    var45 -= 65536;
                                                    if (var38 < var36) {
                                                        var38++;
                                                    } else if (var38 > var36) {
                                                        var38--;
                                                    }
                                                    if ((class65.field508[Statics.field1950][var38][var39] & 0x4) != 0) {
                                                        var35 = Statics.field1950;
                                                    }
                                                }
                                            }
                                        }
                                        break label498;
                                    }
                                }
                                var34 = Statics.field1950;
                                break label506;
                            }
                            var34 = Statics.field1950;
                            break label506;
                        }
                    }
                    if (Statics.field2563.field991 >= 0 && Statics.field2563.field939 >= 0 && Statics.field2563.field991 < 13312 && Statics.field2563.field939 < 13312) {
                        if ((class65.field508[Statics.field1950][Statics.field2563.field991 >> 7][Statics.field2563.field939 >> 7] & 0x4) != 0) {
                            var35 = Statics.field1950;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field1950;
                    }
                }
            }
            var46 = var34;
        }
        int var47 = Statics.field631;
        int var48 = Statics.field422;
        int var49 = Statics.field559;
        int var50 = Statics.field1824;
        int var51 = Statics.field3177;
        for (int var52 = 0; var52 < 5; var52++) {
            if (field903[var52]) {
                int var53 = (int) (Math.random() * (double) (field680[var52] * 2 + 1) - (double) field680[var52] + Math.sin((double) field706[var52] / 100.0D * (double) field645[var52]) * (double) field894[var52]);
                if (var52 == 0) {
                    Statics.field631 += var53;
                }
                if (var52 == 1) {
                    Statics.field422 += var53;
                }
                if (var52 == 2) {
                    Statics.field559 += var53;
                }
                if (var52 == 3) {
                    Statics.field3177 = Statics.field3177 + var53 & 0x7FF;
                }
                if (var52 == 4) {
                    Statics.field1824 += var53;
                    if (Statics.field1824 < 128) {
                        Statics.field1824 = 128;
                    }
                    if (Statics.field1824 > 383) {
                        Statics.field1824 = 383;
                    }
                }
            }
        }
        int var54 = class64.field493;
        int var55 = class64.field500;
        if (class64.field484 != 0) {
            var54 = class64.field490;
            var55 = class64.field503;
        }
        if (var54 >= var8 && var54 < var8 + var10 && var55 >= var9 && var55 < var9 + var11) {
            class138.method32(var54 - var8, var55 - var9);
        } else {
            class138.field1757 = false;
            class138.field1764 = 0;
        }
        method4939();
        class332.method5581(var8, var9, var10, var11, 0);
        method4939();
        int var56 = class140.field1797;
        class140.field1797 = field909;
        Statics.field537.method2979(Statics.field631, Statics.field422, Statics.field559, Statics.field1824, Statics.field3177, var46);
        class140.field1797 = var56;
        method4939();
        Statics.field537.method2995();
        field736 = 0;
        boolean var57 = false;
        int var58 = -1;
        int var59 = -1;
        int var60 = class99.field1264;
        int[] var61 = class99.field1269;
        for (int var62 = 0; var62 < field691 + var60; var62++) {
            class79 var63;
            if (var62 < var60) {
                var63 = field765[var61[var62]];
                if (field815 == var61[var62]) {
                    var57 = true;
                    var58 = var62;
                    continue;
                }
                if (Statics.field2563 == var63) {
                    var59 = var62;
                    continue;
                }
            } else {
                var63 = field690[field692[var62 - var60]];
            }
            method569(var63, var62, var8, var9, var10, var11);
        }
        if (field726 && var59 != -1) {
            method569(Statics.field2563, var59, var8, var9, var10, var11);
        }
        if (var57) {
            method569(field765[field815], var58, var8, var9, var10, var11);
        }
        for (int var64 = 0; var64 < field736; var64++) {
            int var65 = field784[var64];
            int var66 = field739[var64];
            int var67 = field727[var64];
            int var68 = field740[var64];
            boolean var69 = true;
            while (var69) {
                var69 = false;
                for (int var70 = 0; var70 < var64; var70++) {
                    if (var66 + 2 > field739[var70] - field740[var70] && var66 - var68 < field739[var70] + 2 && var65 - var67 < field784[var70] + field727[var70] && var65 + var67 > field784[var70] - field727[var70] && field739[var70] - field740[var70] < var66) {
                        var66 = field739[var70] - field740[var70];
                        var69 = true;
                    }
                }
            }
            field748 = field784[var64];
            field749 = field739[var64] = var66;
            String var71 = field842[var64];
            if (field813 == 0) {
                int var72 = 16776960;
                if (field742[var64] < 6) {
                    var72 = field864[field742[var64]];
                }
                if (field742[var64] == 6) {
                    var72 = field747 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field742[var64] == 7) {
                    var72 = field747 % 20 < 10 ? 255 : 65535;
                }
                if (field742[var64] == 8) {
                    var72 = field747 % 20 < 10 ? 45056 : 8454016;
                }
                if (field742[var64] == 9) {
                    int var73 = 150 - field744[var64];
                    if (var73 < 50) {
                        var72 = var73 * 1280 + 16711680;
                    } else if (var73 < 100) {
                        var72 = 16776960 - (var73 - 50) * 327680;
                    } else if (var73 < 150) {
                        var72 = (var73 - 100) * 5 + 65280;
                    }
                }
                if (field742[var64] == 10) {
                    int var74 = 150 - field744[var64];
                    if (var74 < 50) {
                        var72 = var74 * 5 + 16711680;
                    } else if (var74 < 100) {
                        var72 = 16711935 - (var74 - 50) * 327680;
                    } else if (var74 < 150) {
                        var72 = (var74 - 100) * 327680 + 255 - (var74 - 100) * 5;
                    }
                }
                if (field742[var64] == 11) {
                    int var75 = 150 - field744[var64];
                    if (var75 < 50) {
                        var72 = 16777215 - var75 * 327685;
                    } else if (var75 < 100) {
                        var72 = (var75 - 50) * 327685 + 65280;
                    } else if (var75 < 150) {
                        var72 = 16777215 - (var75 - 100) * 327680;
                    }
                }
                if (field743[var64] == 0) {
                    Statics.field75.method5049(var71, field748 + var8, field749 + var9, var72, 0);
                }
                if (field743[var64] == 1) {
                    Statics.field75.method4971(var71, field748 + var8, field749 + var9, var72, 0, field747);
                }
                if (field743[var64] == 2) {
                    Statics.field75.method4977(var71, field748 + var8, field749 + var9, var72, 0, field747);
                }
                if (field743[var64] == 3) {
                    Statics.field75.method4972(var71, field748 + var8, field749 + var9, var72, 0, field747, 150 - field744[var64]);
                }
                if (field743[var64] == 4) {
                    int var76 = (150 - field744[var64]) * (Statics.field75.method4961(var71) + 100) / 150;
                    class332.method5574(field748 + var8 - 50, var9, field748 + var8 + 50, var9 + var11);
                    Statics.field75.method4956(var71, field748 + var8 + 50 - var76, field749 + var9, var72, 0);
                    class332.method5573(var8, var9, var8 + var10, var9 + var11);
                }
                if (field743[var64] == 5) {
                    int var77 = 150 - field744[var64];
                    int var78 = 0;
                    if (var77 < 25) {
                        var78 = var77 - 25;
                    } else if (var77 > 125) {
                        var78 = var77 - 125;
                    }
                    class332.method5574(var8, field749 + var9 - Statics.field75.field3728 - 1, var8 + var10, field749 + var9 + 5);
                    Statics.field75.method5049(var71, field748 + var8, field749 + var9 + var78, var72, 0);
                    class332.method5573(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field75.method5049(var71, field748 + var8, field749 + var9, 16776960, 0);
            }
        }
        if (field741 == 2) {
            method153((field710 - Statics.field3157 << 7) + field670, (field668 - Statics.field301 << 7) + field671, field821 * 2);
            if (field748 > -1 && field656 % 20 < 10) {
                Statics.field319[0].method5688(field748 + var8 - 12, field749 + var9 - 28);
            }
        }
        ((class129) Statics.field1802).method2592(field851);
        method3800();
        Statics.field631 = var47;
        Statics.field422 = var48;
        Statics.field559 = var49;
        Statics.field1824 = var50;
        Statics.field3177 = var51;
        if (field896) {
            byte var79 = 0;
            int var80 = class248.field3200 + class248.field3194 + var79;
            if (var80 == 0) {
                field896 = false;
            }
        }
        if (field896) {
            class332.method5581(var8, var9, var10, var11, 0);
            method3669(class234.field2795, false);
        }
    }

    @ObfuscatedName("d.gy(IIIIZI)V")
    public static final void method227(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field897;
        } else if (var5 >= 100) {
            var6 = field898;
        } else {
            var6 = (field898 - field897) * var5 / 100 + field897;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field829) {
            short var8 = field829;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field732) {
                var6 = field732;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class332.method5624();
                    class332.method5581(arg0, arg1, var10, arg3, -16777216);
                    class332.method5581(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
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
                    class332.method5624();
                    class332.method5581(arg0, arg1, arg2, var13, -16777216);
                    class332.method5581(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field909 = arg3 * var6 / 334;
        if (field907 != arg2 || field696 != arg3) {
            method535(arg2, arg3);
        }
        field905 = arg0;
        field906 = arg1;
        field907 = arg2;
        field696 = arg3;
    }

    @ObfuscatedName("cw.gq(I)V")
    public static void method1979() {
        if (Statics.field2563.field991 >> 7 == field775 && Statics.field2563.field939 >> 7 == field881) {
            field775 = 0;
        }
    }

    @ObfuscatedName("at.gf(I)V")
    public static void method713() {
        if (field726) {
            method1759(Statics.field2563, false);
        }
    }

    @ObfuscatedName("as.hn(I)V")
    public static void method304() {
        int var0 = class99.field1264;
        int[] var1 = class99.field1269;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field815 != var1[var2] && field766 != var1[var2]) {
                method1759(field765[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("cd.hq(Lbq;ZI)V")
    public static void method1759(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1195() || arg0.field626) {
            return;
        }
        arg0.field625 = false;
        if ((field911 && class99.field1264 > 50 || class99.field1264 > 200) && arg1 && arg0.field968 == arg0.field944) {
            arg0.field625 = true;
        }
        int var2 = arg0.field991 >> 7;
        int var3 = arg0.field939 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method1957(0, 0, 0, false, arg0.field629);
        if (arg0.field608 != null && field656 >= arg0.field615 && field656 < arg0.field616) {
            arg0.field625 = false;
            arg0.field614 = method2028(arg0.field991, arg0.field939, Statics.field1950);
            arg0.field984 = field656;
            Statics.field537.method2941(Statics.field1950, arg0.field991, arg0.field939, arg0.field614, 60, arg0, arg0.field940, var4, arg0.field621, arg0.field607, arg0.field623, arg0.field624);
            return;
        }
        if ((arg0.field991 & 0x7F) == 64 && (arg0.field939 & 0x7F) == 64) {
            if (field747 == field746[var2][var3]) {
                return;
            }
            field746[var2][var3] = field747;
        }
        arg0.field614 = method2028(arg0.field991, arg0.field939, Statics.field1950);
        arg0.field984 = field656;
        Statics.field537.method2940(Statics.field1950, arg0.field991, arg0.field939, arg0.field614, 60, arg0, arg0.field940, var4, arg0.field951);
    }

    @ObfuscatedName("ej.ha(ZI)V")
    public static final void method2927(boolean arg0) {
        for (int var1 = 0; var1 < field691; var1++) {
            class89 var2 = field690[field692[var1]];
            if (var2 != null && var2.method1195() && var2.field1136.field3495 == arg0 && var2.field1136.method4374()) {
                int var3 = var2.field991 >> 7;
                int var4 = var2.field939 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field942 == 1 && (var2.field991 & 0x7F) == 64 && (var2.field939 & 0x7F) == 64) {
                        if (field747 == field746[var3][var4]) {
                            continue;
                        }
                        field746[var3][var4] = field747;
                    }
                    long var5 = class138.method1957(0, 0, 1, !var2.field1136.field3528, field692[var1]);
                    var2.field984 = field656;
                    Statics.field537.method2940(Statics.field1950, var2.field991, var2.field939, method2028(var2.field991 + (var2.field942 * 64 - 64), var2.field939 + (var2.field942 * 64 - 64), Statics.field1950), var2.field942 * 64 - 64 + 60, var2, var2.field940, var5, var2.field951);
                }
            }
        }
    }

    @ObfuscatedName("ai.hg(I)I")
    public static final int method624() {
        if (Statics.field3618.field1053) {
            return Statics.field1950;
        } else {
            int var0 = method2028(Statics.field631, Statics.field559, Statics.field1950);
            return var0 - Statics.field422 >= 800 || (class65.field508[Statics.field1950][Statics.field631 >> 7][Statics.field559 >> 7] & 0x4) == 0 ? 3 : Statics.field1950;
        }
    }

    @ObfuscatedName("bc.hk(I)Z")
    public static boolean method1029() {
        return (field769 & 0x8) != 0;
    }

    @ObfuscatedName("w.hv(Lbq;B)Z")
    public static boolean method33(class76 arg0) {
        if (field769 == 0) {
            return false;
        } else if (Statics.field2563 == arg0) {
            return method1029();
        } else {
            boolean var1 = (field769 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field769 & 0x1) != 0;
                var2 = var3 && arg0.method1210();
            }
            return var2 || Statics.method3351() && arg0.method1209();
        }
    }

    @ObfuscatedName("ap.hj(Lcx;IIIIII)V")
    public static final void method569(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1195()) {
            return;
        }
        if (arg0 instanceof class89) {
            class268 var6 = ((class89) arg0).field1136;
            if (var6.field3525 != null) {
                var6 = var6.method4392();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1264;
        int[] var8 = class99.field1269;
        byte var9 = 0;
        if (arg1 < var7 && field656 == arg0.field984 && method33((class76) arg0)) {
            class76 var10 = (class76) arg0;
            if (arg1 < var7) {
                Statics.method122(arg0, arg0.field989 + 15);
                class307 var11 = (class307) field700.get(class303.field3700);
                byte var12 = 9;
                var11.method5049(var10.field620.method4821(), field748 + arg2, field749 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field958.method4468()) {
            Statics.method122(arg0, arg0.field989 + 15);
            for (class88 var14 = (class88) arg0.field958.method4467(); var14 != null; var14 = (class88) arg0.field958.method4466()) {
                class80 var15 = var14.method1942(field656);
                if (var15 != null) {
                    class258 var16 = var14.field1127;
                    class336 var17 = var16.method4123();
                    class336 var18 = var16.method4126();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3320;
                    } else {
                        if (var16.field3311 * 2 < var18.field3914) {
                            var19 = var16.field3311;
                        }
                        var20 = var18.field3914 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field656 - var15.field1000;
                    int var24 = var15.field1002 * var20 / var16.field3320;
                    int var27;
                    if (var15.field1008 > var23) {
                        int var25 = var16.field3308 == 0 ? 0 : var23 / var16.field3308 * var16.field3308;
                        int var26 = var15.field1001 * var20 / var16.field3320;
                        var27 = (var24 - var26) * var25 / var15.field1008 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1008 + var16.field3317 - var23;
                        if (var16.field3315 >= 0) {
                            var21 = (var28 << 8) / (var16.field3317 - var16.field3315);
                        }
                    }
                    if (var15.field1002 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field748 > -1) {
                            int var34 = field748 + arg2 - (var20 >> 1);
                            int var35 = field749 + arg3 - var13;
                            class332.method5581(var34, var35, var27, 5, 65280);
                            class332.method5581(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3912;
                        var13 += var30;
                        int var31 = field748 + arg2 - (var20 >> 1);
                        int var32 = field749 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5699(var33, var32, var21);
                            class332.method5574(var33, var32, var29 + var33, var30 + var32);
                            var18.method5699(var33, var32, var21);
                        } else {
                            var17.method5688(var33, var32);
                            class332.method5574(var33, var32, var29 + var33, var30 + var32);
                            var18.method5688(var33, var32);
                        }
                        class332.method5573(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1943()) {
                    var14.method3359();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class76 var37 = (class76) arg0;
            if (var37.field626) {
                return;
            }
            if (var37.field609 != -1 || var37.field610 != -1) {
                Statics.method122(arg0, arg0.field989 + 15);
                if (field748 > -1) {
                    if (var37.field609 != -1) {
                        var36 += 25;
                        Statics.field605[var37.field609].method5688(field748 + arg2 - 12, field749 + arg3 - var36);
                    }
                    if (var37.field610 != -1) {
                        var36 += 25;
                        Statics.field711[var37.field610].method5688(field748 + arg2 - 12, field749 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field741 == 10 && field666 == var8[arg1]) {
                Statics.method122(arg0, arg0.field989 + 15);
                if (field748 > -1) {
                    int var38 = Statics.field319[1].field3912 + var36;
                    Statics.field319[1].method5688(field748 + arg2 - 12, field749 + arg3 - var38);
                }
            }
        } else {
            class268 var39 = ((class89) arg0).field1136;
            if (var39.field3525 != null) {
                var39 = var39.method4392();
            }
            if (var39.field3520 >= 0 && var39.field3520 < Statics.field711.length) {
                Statics.method122(arg0, arg0.field989 + 15);
                if (field748 > -1) {
                    Statics.field711[var39.field3520].method5688(field748 + arg2 - 12, field749 + arg3 - 30);
                }
            }
            if (field741 == 1 && field665 == field692[arg1 - var7] && field656 % 20 < 10) {
                Statics.method122(arg0, arg0.field989 + 15);
                if (field748 > -1) {
                    Statics.field319[0].method5688(field748 + arg2 - 12, field749 + arg3 - 28);
                }
            }
        }
        if (arg0.field952 != null && (arg1 >= var7 || !arg0.field954 && (field796 == 4 || !arg0.field953 && (field796 == 0 || field796 == 3 || field796 == 1 && ((class76) arg0).method1210())))) {
            Statics.method122(arg0, arg0.field989);
            if (field748 > -1 && field736 < field737) {
                field727[field736] = Statics.field75.method4961(arg0.field952) / 2;
                field740[field736] = Statics.field75.field3728;
                field784[field736] = field748;
                field739[field736] = field749;
                field742[field736] = arg0.field956;
                field743[field736] = arg0.field995;
                field744[field736] = arg0.field992;
                field842[field736] = arg0.field952;
                field736++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field961[var40];
            int var42 = arg0.field967[var40];
            class264 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field656) {
                    continue;
                }
                var43 = class264.method3399(arg0.field967[var40]);
                var44 = var43.field3365;
                if (var43 != null && var43.field3376 != null) {
                    var43 = var43.method4212();
                    if (var43 == null) {
                        arg0.field961[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field962[var40];
            class264 var46 = null;
            if (var45 >= 0) {
                var46 = class264.method3399(var45);
                if (var46 != null && var46.field3376 != null) {
                    var46 = var46.method4212();
                }
            }
            if (var41 - var44 <= field656) {
                if (var43 == null) {
                    arg0.field961[var40] = -1;
                } else {
                    Statics.method122(arg0, arg0.field989 / 2);
                    if (field748 > -1) {
                        if (var40 == 1) {
                            field749 -= 20;
                        }
                        if (var40 == 2) {
                            field748 -= 15;
                            field749 -= 10;
                        }
                        if (var40 == 3) {
                            field748 += 15;
                            field749 -= 10;
                        }
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        class336 var59 = null;
                        class336 var60 = null;
                        class336 var61 = null;
                        class336 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class336 var72 = var43.method4214();
                        if (var72 != null) {
                            var51 = var72.field3914;
                            int var73 = var72.field3912;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3919;
                        }
                        class336 var74 = var43.method4209();
                        if (var74 != null) {
                            var52 = var74.field3914;
                            int var75 = var74.field3912;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3919;
                        }
                        class336 var76 = var43.method4218();
                        if (var76 != null) {
                            var53 = var76.field3914;
                            int var77 = var76.field3912;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3919;
                        }
                        class336 var78 = var43.method4216();
                        if (var78 != null) {
                            var54 = var78.field3914;
                            int var79 = var78.field3912;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3919;
                        }
                        if (var46 != null) {
                            var59 = var46.method4214();
                            if (var59 != null) {
                                var63 = var59.field3914;
                                int var80 = var59.field3912;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3919;
                            }
                            var60 = var46.method4209();
                            if (var60 != null) {
                                var64 = var60.field3914;
                                int var81 = var60.field3912;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3919;
                            }
                            var61 = var46.method4218();
                            if (var61 != null) {
                                var65 = var61.field3914;
                                int var82 = var61.field3912;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3919;
                            }
                            var62 = var46.method4216();
                            if (var62 != null) {
                                var66 = var62.field3914;
                                int var83 = var62.field3912;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3919;
                            }
                        }
                        class306 var84 = var43.method4217();
                        if (var84 == null) {
                            var84 = Statics.field3685;
                        }
                        class306 var85;
                        if (var46 == null) {
                            var85 = Statics.field3685;
                        } else {
                            var85 = var46.method4217();
                            if (var85 == null) {
                                var85 = Statics.field3685;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4213(arg0.field993[var40]);
                        int var91 = var84.method4961(var90);
                        if (var46 != null) {
                            var87 = var46.method4213(arg0.field963[var40]);
                            var89 = var85.method4961(var87);
                        }
                        int var92 = 0;
                        int var93 = 0;
                        if (var52 > 0) {
                            if (var76 == null && var78 == null) {
                                var92 = 1;
                            } else {
                                var92 = var91 / var52 + 1;
                            }
                        }
                        if (var46 != null && var64 > 0) {
                            if (var61 == null && var62 == null) {
                                var93 = 1;
                            } else {
                                var93 = var89 / var64 + 1;
                            }
                        }
                        int var94 = 0;
                        int var95 = var94;
                        if (var51 > 0) {
                            var94 += var51;
                        }
                        var94 += 2;
                        int var96 = var94;
                        if (var53 > 0) {
                            var94 += var53;
                        }
                        int var97 = var94;
                        int var98 = var94;
                        int var100;
                        if (var52 > 0) {
                            int var99 = var52 * var92;
                            var100 = var94 + var99;
                            var98 = (var99 - var91) / 2 + var94;
                        } else {
                            var100 = var91 + var94;
                        }
                        int var101 = var100;
                        if (var54 > 0) {
                            var100 += var54;
                        }
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        if (var46 != null) {
                            var100 += 2;
                            var102 = var100;
                            if (var63 > 0) {
                                var100 += var63;
                            }
                            var100 += 2;
                            var103 = var100;
                            if (var65 > 0) {
                                var100 += var65;
                            }
                            var104 = var100;
                            var106 = var100;
                            if (var64 > 0) {
                                int var107 = var64 * var93;
                                var100 += var107;
                                var106 += (var107 - var89) / 2;
                            } else {
                                var100 += var89;
                            }
                            var105 = var100;
                            if (var66 > 0) {
                                var100 += var66;
                            }
                        }
                        int var108 = arg0.field961[var40] - field656;
                        int var109 = var43.field3378 - var43.field3378 * var108 / var43.field3365;
                        int var110 = var43.field3354 * var108 / var43.field3365 + -var43.field3354;
                        int var111 = field748 + arg2 - (var100 >> 1) + var109;
                        int var112 = field749 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3375 + var112 + 15;
                        int var116 = var115 - var84.field3729;
                        int var117 = var84.field3730 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3375 + var112 + 15;
                            int var119 = var118 - var85.field3729;
                            int var120 = var85.field3730 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3379 >= 0) {
                            var123 = (var108 << 8) / (var43.field3365 - var43.field3379);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5699(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5699(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5699(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5699(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5013(var90, var98 + var111, var115, var43.field3364, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5699(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5699(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5699(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5699(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5013(var87, var106 + var111, var118, var46.field3364, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5688(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5688(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5688(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5688(var101 + var111 - var58, var112);
                            }
                            var84.method4956(var90, var98 + var111, var115, var43.field3364 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5688(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5688(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5688(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5688(var105 + var111 - var70, var112);
                                }
                                var85.method4956(var87, var106 + var111, var118, var46.field3364 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hb.hm(I)V")
    public static final void method3800() {
        field763 = 0;
        int var0 = (Statics.field2563.field991 >> 7) + Statics.field3157;
        int var1 = (Statics.field2563.field939 >> 7) + Statics.field301;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field763 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field763 = 1;
        }
        if (field763 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field763 = 0;
        }
    }

    @ObfuscatedName("y.hx(IIII)V")
    public static final void method153(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field748 = -1;
            field749 = -1;
            return;
        }
        int var3 = method2028(arg0, arg1, Statics.field1950) - arg2;
        int var4 = arg0 - Statics.field631;
        int var5 = var3 - Statics.field422;
        int var6 = arg1 - Statics.field559;
        int var7 = class140.field1798[Statics.field1824];
        int var8 = class140.field1781[Statics.field1824];
        int var9 = class140.field1798[Statics.field3177];
        int var10 = class140.field1781[Statics.field3177];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field748 = field909 * var11 / var15 + field907 / 2;
            field749 = field909 * var14 / var15 + field696 / 2;
        } else {
            field748 = -1;
            field749 = -1;
        }
    }

    @ObfuscatedName("ck.ho(IIII)I")
    public static final int method2028(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field508[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field520[var5][var3][var4] + class65.field520[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field520[var5][var3][var4 + 1] + class65.field520[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fw.hc(IIB)I")
    public static int method3293(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field900 - field915) * var2 / 100 + field915;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("bj.hs(ZLky;I)V")
    public static final void method1130(boolean arg0, class310 arg1) {
        field707 = arg0;
        if (!field707) {
            int var2 = arg1.method5342();
            int var3 = arg1.method5112();
            int var4 = arg1.method5342();
            Statics.field2732 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2732[var5][var6] = arg1.method5120();
                }
            }
            Statics.field2076 = new int[var4];
            Statics.field298 = new int[var4];
            Statics.field77 = new int[var4];
            Statics.field152 = new byte[var4][];
            Statics.field591 = new byte[var4][];
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
                        Statics.field2076[var8] = var11;
                        Statics.field298[var8] = Statics.field479.method3880("m" + var9 + "_" + var10);
                        Statics.field77[var8] = Statics.field479.method3880("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4059(var2, var3, true);
            return;
        }
        int var12 = arg1.method5342();
        boolean var13 = arg1.method5146() == 1;
        int var14 = arg1.method5153();
        int var15 = arg1.method5342();
        arg1.method5067();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5068(1);
                    if (var19 == 1) {
                        field684[var16][var17][var18] = arg1.method5068(26);
                    } else {
                        field684[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5090();
        Statics.field2732 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2732[var20][var21] = arg1.method5120();
            }
        }
        Statics.field2076 = new int[var15];
        Statics.field298 = new int[var15];
        Statics.field77 = new int[var15];
        Statics.field152 = new byte[var15][];
        Statics.field591 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field684[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2076[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2076[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field298[var22] = Statics.field479.method3880("m" + var31 + "_" + var32);
                            Statics.field77[var22] = Statics.field479.method3880("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4059(var14, var12, !var13);
    }

    @ObfuscatedName("ir.hh(IIZI)V")
    public static final void method4059(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2113 == arg0 && Statics.field2014 == arg1) {
            return;
        }
        Statics.field2113 = arg0;
        Statics.field2014 = arg1;
        method575(25);
        method3669(class234.field2795, true);
        int var3 = Statics.field3157;
        int var4 = Statics.field301;
        Statics.field3157 = (arg0 - 6) * 8;
        Statics.field301 = (arg1 - 6) * 8;
        int var5 = Statics.field3157 - var3;
        int var6 = Statics.field301 - var4;
        int var7 = Statics.field3157;
        int var8 = Statics.field301;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field690[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field994[var11] -= var5;
                    var10.field969[var11] -= var6;
                }
                var10.field991 -= var5 * 128;
                var10.field939 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field765[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field994[var14] -= var5;
                    var13.field969[var14] -= var6;
                }
                var13.field991 -= var5 * 128;
                var13.field939 -= var6 * 128;
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
                        field777[var25][var21][var22] = field777[var25][var23][var24];
                    } else {
                        field777[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field877.method4540(); var26 != null; var26 = (class78) field877.method4545()) {
            var26.field927 -= var5;
            var26.field928 -= var6;
            if (var26.field927 < 0 || var26.field928 < 0 || var26.field927 >= 104 || var26.field928 >= 104) {
                var26.method3359();
            }
        }
        if (field775 != 0) {
            field775 -= var5;
            field881 -= var6;
        }
        field885 = 0;
        field891 = false;
        Statics.field631 -= var5 << 7;
        Statics.field559 -= var6 << 7;
        Statics.field1245 -= var5 << 7;
        Statics.field1478 -= var6 << 7;
        field875 = -1;
        field735.method4537();
        field779.method4537();
        for (int var27 = 0; var27 < 4; var27++) {
            field832[var27].method3316();
        }
    }

    @ObfuscatedName("ac.hf(ZI)V")
    public static final void method319(boolean arg0) {
        method4939();
        field695.field1335++;
        if (field695.field1335 < 50 && !arg0) {
            return;
        }
        field695.field1335 = 0;
        if (field697 || field695.method2159() == null) {
            return;
        }
        class197 var1 = class197.method1128(class193.field2323, field695.field1329);
        field695.method2155(var1);
        try {
            field695.method2158();
        } catch (IOException var3) {
            field697 = true;
        }
    }

    @ObfuscatedName("v.hl(IIIIIB)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field537.method2936(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field537.method2937(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class138.method1795(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field127.field3918;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class138.method3119(var5);
            class265 var14 = class265.method325(var13);
            if (var14.field3383 == -1) {
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
                class335 var15 = Statics.field264[var14.field3383];
                if (var15 != null) {
                    int var16 = (var14.field3419 * 4 - var15.field3906) / 2;
                    int var17 = (var14.field3397 * 4 - var15.field3910) / 2;
                    var15.method5658(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3397) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field537.method2957(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field537.method2937(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class138.method3119(var18);
            class265 var24 = class265.method325(var23);
            if (var24.field3383 != -1) {
                class335 var25 = Statics.field264[var24.field3383];
                if (var25 != null) {
                    int var26 = (var24.field3419 * 4 - var25.field3906) / 2;
                    int var27 = (var24.field3397 * 4 - var25.field3910) / 2;
                    var25.method5658(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3397) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class138.method1795(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field127.field3918;
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
        long var31 = Statics.field537.method2958(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class138.method3119(var31);
        class265 var34 = class265.method325(var33);
        if (var34.field3383 == -1) {
            return;
        }
        class335 var35 = Statics.field264[var34.field3383];
        if (var35 != null) {
            int var36 = (var34.field3419 * 4 - var35.field3906) / 2;
            int var37 = (var34.field3397 * 4 - var35.field3910) / 2;
            var35.method5658(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3397) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.he(Ldh;B)Z")
    public final boolean method1547(class105 arg0) {
        class316 var2 = arg0.method2159();
        class310 var3 = arg0.field1326;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1331 == null) {
                if (arg0.field1333) {
                    if (!var2.method3292(1)) {
                        return false;
                    }
                    var2.method3305(arg0.field1326.field3753, 0, 1);
                    arg0.field1334 = 0;
                    arg0.field1333 = false;
                }
                var3.field3752 = 0;
                if (var3.method5064()) {
                    if (!var2.method3292(1)) {
                        return false;
                    }
                    var2.method3305(arg0.field1326.field3753, 1, 1);
                    arg0.field1334 = 0;
                }
                arg0.field1333 = true;
                class192[] var4 = class192.method1088();
                int var5 = var3.method5080();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3752);
                }
                arg0.field1331 = var4[var5];
                arg0.field1339 = arg0.field1331.field2227;
            }
            if (arg0.field1339 == -1) {
                if (!var2.method3292(1)) {
                    return false;
                }
                arg0.method2159().method3305(var3.field3753, 0, 1);
                arg0.field1339 = var3.field3753[0] & 0xFF;
            }
            if (arg0.field1339 == -2) {
                if (!var2.method3292(2)) {
                    return false;
                }
                arg0.method2159().method3305(var3.field3753, 0, 2);
                var3.field3752 = 0;
                arg0.field1339 = var3.method5342();
            }
            if (!var2.method3292(arg0.field1339)) {
                return false;
            }
            var3.field3752 = 0;
            var2.method3305(var3.field3753, 0, arg0.field1339);
            arg0.field1334 = 0;
            field699.method4638();
            arg0.field1338 = arg0.field1337;
            arg0.field1337 = arg0.field1336;
            arg0.field1336 = arg0.field1331;
            if (class192.field2140 == arg0.field1331) {
                int var6 = var3.method5096();
                boolean var7 = var3.method5274() == 1;
                String var8 = "";
                boolean var9 = false;
                if (var7) {
                    var8 = var3.method5202();
                    if (Statics.field2037.method1816(new class294(var8, Statics.field93))) {
                        var9 = true;
                    }
                }
                String var10 = var3.method5202();
                if (!var9) {
                    Statics.method3809(var6, var8, var10);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1331) {
                int var11 = var3.method5112();
                if (var11 == 65535) {
                    var11 = -1;
                }
                method220(var11);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1331) {
                int var12 = var3.method5342();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = var3.method5159();
                method3374(var12, var13);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1331) {
                for (int var14 = 0; var14 < Statics.field3238; var14++) {
                    class252 var15 = class252.method3657(var14);
                    if (var15 != null) {
                        class222.field2540[var14] = 0;
                        class222.field2542[var14] = 0;
                    }
                }
                method3383();
                field836 += 32;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2158 == arg0.field1331) {
                method224(false, var3);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2146 == arg0.field1331) {
                int var16 = var3.method5274();
                method4935(var16);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2153 == arg0.field1331) {
                method3190(class195.field2346);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1331) {
                String var17 = var3.method5202();
                Object[] var18 = new Object[var17.length() + 1];
                for (int var19 = var17.length() - 1; var19 >= 0; var19--) {
                    if (var17.charAt(var19) == 's') {
                        var18[var19 + 1] = var3.method5202();
                    } else {
                        var18[var19 + 1] = Integer.valueOf(var3.method5120());
                    }
                }
                var18[0] = Integer.valueOf(var3.method5120());
                class72 var20 = new class72();
                var20.field573 = var18;
                class86.method197(var20);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2218 == arg0.field1331) {
                if (Statics.field245 != null) {
                    Statics.field245.method4841(var3);
                }
                method411();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1331) {
                method224(true, var3);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1331) {
                class106.method2369(var3, arg0.field1339);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1331) {
                int var21 = var3.method5274();
                if (var3.method5274() == 0) {
                    field914[var21] = new class19();
                    var3.field3752 += 18;
                } else {
                    var3.field3752--;
                    field914[var21] = new class19(var3, false);
                }
                field686 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2151 == arg0.field1331) {
                int var22 = var3.method5120();
                class227 var23 = class227.method3345(var22);
                var23.field2630 = 3;
                var23.field2688 = Statics.field2563.field622.method3699();
                method3344(var23);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1331) {
                int var24 = arg0.field1339 + var3.field3752;
                int var25 = var3.method5342();
                int var26 = var3.method5342();
                if (field874 != var25) {
                    field874 = var25;
                    this.method1651(false);
                    method4945(field874);
                    class86.method4012(field874);
                    for (int var27 = 0; var27 < 100; var27++) {
                        field902[var27] = true;
                    }
                }
                while (var26-- > 0) {
                    int var28 = var3.method5120();
                    int var29 = var3.method5342();
                    int var30 = var3.method5274();
                    class71 var31 = (class71) field834.method5543((long) var28);
                    if (var31 != null && var31.field564 != var29) {
                        method1141(var31, true);
                        var31 = null;
                    }
                    if (var31 == null) {
                        var31 = method3830(var28, var29, var30);
                    }
                    var31.field560 = true;
                }
                for (class71 var32 = (class71) field834.method5537(); var32 != null; var32 = (class71) field834.method5532()) {
                    if (var32.field560) {
                        var32.field560 = false;
                    } else {
                        method1141(var32, true);
                    }
                }
                field892 = new class329(512);
                while (var3.field3752 < var24) {
                    int var33 = var3.method5120();
                    int var34 = var3.method5342();
                    int var35 = var3.method5342();
                    int var36 = var3.method5120();
                    for (int var37 = var34; var37 <= var35; var37++) {
                        long var38 = ((long) var33 << 32) + (long) var37;
                        field892.method5531(new class189(var36), var38);
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2144 == arg0.field1331) {
                Statics.field3223 = var3.method5146();
                Statics.field1332 = var3.method5146();
                while (var3.field3752 < arg0.field1339) {
                    int var40 = var3.method5274();
                    class195 var41 = class195.method4002()[var40];
                    method3190(var41);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1331) {
                field741 = var3.method5274();
                if (field741 == 1) {
                    field665 = var3.method5342();
                }
                if (field741 >= 2 && field741 <= 6) {
                    if (field741 == 2) {
                        field670 = 64;
                        field671 = 64;
                    }
                    if (field741 == 3) {
                        field670 = 0;
                        field671 = 64;
                    }
                    if (field741 == 4) {
                        field670 = 128;
                        field671 = 64;
                    }
                    if (field741 == 5) {
                        field670 = 64;
                        field671 = 0;
                    }
                    if (field741 == 6) {
                        field670 = 64;
                        field671 = 128;
                    }
                    field741 = 2;
                    field710 = var3.method5342();
                    field668 = var3.method5342();
                    field821 = var3.method5274();
                }
                if (field741 == 10) {
                    field666 = var3.method5342();
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2155 == arg0.field1331) {
                method3190(class195.field2349);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2150 == arg0.field1331) {
                int var42 = var3.method5342();
                int var43 = var3.method5274();
                int var44 = var3.method5342();
                method3803(var42, var43, var44);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1331) {
                int var45 = var3.method5155();
                int var46 = var3.method5120();
                class227 var47 = class227.method3345(var46);
                if (var47 != null && var47.field2589 == 0) {
                    if (var45 > var47.field2640 - var47.field2603) {
                        var45 = var47.field2640 - var47.field2603;
                    }
                    if (var45 < 0) {
                        var45 = 0;
                    }
                    if (var47.field2609 != var45) {
                        var47.field2609 = var45;
                        method3344(var47);
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2220 == arg0.field1331) {
                field895 = var3.method5274();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1331) {
                int var48 = var3.method5274();
                int var49 = var3.method5274();
                int var50 = var3.method5274();
                int var51 = var3.method5274();
                field903[var48] = true;
                field680[var48] = var49;
                field894[var48] = var50;
                field706[var48] = var51;
                field645[var48] = 0;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2215 == arg0.field1331) {
                for (int var52 = 0; var52 < field765.length; var52++) {
                    if (field765[var52] != null) {
                        field765[var52].field971 = -1;
                    }
                }
                for (int var53 = 0; var53 < field690.length; var53++) {
                    if (field690[var53] != null) {
                        field690[var53].field971 = -1;
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1331) {
                method3190(class195.field2352);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2216 == arg0.field1331) {
                field663 = var3.method5155() * 30;
                field846 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2154 == arg0.field1331) {
                int var54 = var3.method5216();
                int var55 = var3.method5156();
                class227 var56 = class227.method3345(var54);
                if (var56.field2634 != var55 || var55 == -1) {
                    var56.field2634 = var55;
                    var56.field2719 = 0;
                    var56.field2716 = 0;
                    method3344(var56);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2208 == arg0.field1331) {
                method3383();
                field816 = var3.method5274();
                field846 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2219 == arg0.field1331) {
                int var57 = var3.method5153();
                int var58 = var3.method5342();
                int var59 = var3.method5120();
                class227 var60 = class227.method3345(var59);
                var60.field2643 = (var58 << 16) + var57;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1331) {
                int var61 = var3.method5120();
                class71 var62 = (class71) field834.method5543((long) var61);
                if (var62 != null) {
                    method1141(var62, true);
                }
                if (field823 != null) {
                    method3344(field823);
                    field823 = null;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1331) {
                int var63 = var3.method5216();
                int var64 = var3.method5144();
                int var65 = var3.method5153();
                class71 var66 = (class71) field834.method5543((long) var63);
                if (var66 != null) {
                    method1141(var66, var66.field564 != var65);
                }
                method3830(var63, var65, var64);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1331) {
                Statics.field2037.field1069.method4718(var3, arg0.field1339);
                method90();
                field880 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2217 == arg0.field1331) {
                String var67 = var3.method5202();
                String var68 = class307.method4999(class302.method3365(class220.method1976(var3)));
                Statics.method3809(6, var67, var68);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2149 == arg0.field1331) {
                field891 = false;
                for (int var69 = 0; var69 < 5; var69++) {
                    field903[var69] = false;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2205 == arg0.field1331) {
                method1130(false, arg0.field1326);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1331) {
                field891 = true;
                Statics.field2125 = var3.method5274();
                Statics.field1141 = var3.method5274();
                Statics.field303 = var3.method5342();
                Statics.field1317 = var3.method5274();
                Statics.field272 = var3.method5274();
                if (Statics.field272 >= 100) {
                    Statics.field631 = Statics.field2125 * 128 + 64;
                    Statics.field559 = Statics.field1141 * 128 + 64;
                    Statics.field422 = method2028(Statics.field631, Statics.field559, Statics.field1950) - Statics.field303;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2225 == arg0.field1331) {
                if (field874 != -1) {
                    method302(field874, 0);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1331) {
                int var70 = var3.method5155();
                field874 = var70;
                this.method1651(false);
                method4945(var70);
                class86.method4012(field874);
                for (int var71 = 0; var71 < 100; var71++) {
                    field902[var71] = true;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2222 == arg0.field1331) {
                Statics.field3223 = var3.method5144();
                Statics.field1332 = var3.method5144();
                for (int var72 = Statics.field1332; var72 < Statics.field1332 + 8; var72++) {
                    for (int var73 = Statics.field3223; var73 < Statics.field3223 + 8; var73++) {
                        if (field777[Statics.field1950][var72][var73] != null) {
                            field777[Statics.field1950][var72][var73] = null;
                            method1144(var72, var73);
                        }
                    }
                }
                for (class78 var74 = (class78) field877.method4540(); var74 != null; var74 = (class78) field877.method4545()) {
                    if (var74.field927 >= Statics.field1332 && var74.field927 < Statics.field1332 + 8 && var74.field928 >= Statics.field3223 && var74.field928 < Statics.field3223 + 8 && Statics.field1950 == var74.field925) {
                        var74.field931 = 0;
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1331) {
                byte[] var75 = new byte[arg0.field1339];
                var3.method5066(var75, 0, var75.length);
                class311 var76 = new class311(var75);
                String var77 = var76.method5202();
                class61.method1978(var77, true, false);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2165 == arg0.field1331) {
                method3190(class195.field2345);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2206 == arg0.field1331) {
                field867 = var3.method5146();
                field796 = var3.method5145();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2198 == arg0.field1331) {
                int var78 = var3.method5164();
                int var79 = var3.method5165();
                int var80 = var3.method5112();
                if (var80 == 65535) {
                    var80 = -1;
                }
                class227 var81 = class227.method3345(var78);
                if (var81.field2586) {
                    var81.field2713 = var80;
                    var81.field2714 = var79;
                    class266 var83 = class266.method1102(var80);
                    var81.field2584 = var83.field3458;
                    var81.field2639 = var83.field3452;
                    var81.field2658 = var83.field3453;
                    var81.field2636 = var83.field3454;
                    var81.field2681 = var83.field3473;
                    var81.field2641 = var83.field3450;
                    if (var83.field3456 == 1) {
                        var81.field2645 = 1;
                    } else {
                        var81.field2645 = 2;
                    }
                    if (var81.field2642 > 0) {
                        var81.field2641 = var81.field2641 * 32 / var81.field2642;
                    } else if (var81.field2598 > 0) {
                        var81.field2641 = var81.field2641 * 32 / var81.field2598;
                    }
                    method3344(var81);
                } else if (var80 == -1) {
                    var81.field2630 = 0;
                    arg0.field1331 = null;
                    return true;
                } else {
                    class266 var82 = class266.method1102(var80);
                    var81.field2630 = 4;
                    var81.field2688 = var80;
                    var81.field2584 = var82.field3458;
                    var81.field2639 = var82.field3452;
                    var81.field2641 = var82.field3450 * 100 / var79;
                    method3344(var81);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1331) {
                boolean var84 = var3.method5333();
                if (!var84) {
                    Statics.field149 = null;
                } else if (Statics.field149 == null) {
                    Statics.field149 = new class249();
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1331) {
                int var85 = var3.method5165();
                int var86 = var3.method5342();
                class222.field2540[var86] = var85;
                if (class222.field2542[var86] != var85) {
                    class222.field2542[var86] = var85;
                }
                method2134(var86);
                field835[++field836 - 1 & 0x1F] = var86;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1331) {
                field775 = var3.method5274();
                if (field775 == 255) {
                    field775 = 0;
                }
                field881 = var3.method5274();
                if (field881 == 255) {
                    field881 = 0;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1331) {
                for (int var87 = 0; var87 < class222.field2542.length; var87++) {
                    if (class222.field2542[var87] != class222.field2540[var87]) {
                        class222.field2542[var87] = class222.field2540[var87];
                        method2134(var87);
                        field835[++field836 - 1 & 0x1F] = var87;
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2211 == arg0.field1331) {
                method222(var3.method5202());
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1331) {
                method3190(class195.field2344);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1331) {
                String var88 = var3.method5202();
                long var89 = (long) var3.method5342();
                long var91 = (long) var3.method5119();
                class240 var93 = (class240) class205.method3134(class240.method3808(), var3.method5274());
                long var94 = (var89 << 32) + var91;
                boolean var96 = false;
                for (int var97 = 0; var97 < 100; var97++) {
                    if (field869[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (Statics.field2037.method1816(new class294(var88, Statics.field93))) {
                    var96 = true;
                }
                if (!var96 && field763 == 0) {
                    field869[field708] = var94;
                    field708 = (field708 + 1) % 100;
                    String var98 = class307.method4999(class302.method3365(class220.method1976(var3)));
                    byte var99;
                    if (var93.field3121) {
                        var99 = 7;
                    } else {
                        var99 = 3;
                    }
                    if (var93.field3127 == -1) {
                        Statics.method3809(var99, var88, var98);
                    } else {
                        Statics.method3809(var99, class91.method226(var93.field3127) + var88, var98);
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2193 == arg0.field1331) {
                String var100 = var3.method5202();
                long var101 = var3.method5121();
                long var103 = (long) var3.method5342();
                long var105 = (long) var3.method5119();
                class240 var107 = (class240) class205.method3134(class240.method3808(), var3.method5274());
                long var108 = (var103 << 32) + var105;
                boolean var110 = false;
                for (int var111 = 0; var111 < 100; var111++) {
                    if (field869[var111] == var108) {
                        var110 = true;
                        break;
                    }
                }
                if (var107.field3124 && Statics.field2037.method1816(new class294(var100, Statics.field93))) {
                    var110 = true;
                }
                if (!var110 && field763 == 0) {
                    field869[field708] = var108;
                    field708 = (field708 + 1) % 100;
                    String var112 = class307.method4999(class302.method3365(class220.method1976(var3)));
                    if (var107.field3127 == -1) {
                        class101.method3215(9, var100, var112, class300.method4173(var101));
                    } else {
                        class101.method3215(9, class91.method226(var107.field3127) + var100, var112, class300.method4173(var101));
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1331) {
                method305();
                arg0.field1331 = null;
                return false;
            }
            if (class192.field2169 == arg0.field1331) {
                class99.method3213(var3, arg0.field1339);
                method2618();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2207 == arg0.field1331) {
                Statics.field2037.method1774(var3, arg0.field1339);
                field880 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2152 == arg0.field1331) {
                int var113 = var3.method5155();
                int var114 = var3.method5164();
                class227 var115 = class227.method3345(var114);
                if (var115.field2630 != 2 || var115.field2688 != var113) {
                    var115.field2630 = 2;
                    var115.field2688 = var113;
                    method3344(var115);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1331) {
                int var116 = var3.method5216();
                int var117 = var3.method5153();
                int var118 = var117 >> 10 & 0x1F;
                int var119 = var117 >> 5 & 0x1F;
                int var120 = var117 & 0x1F;
                int var121 = (var120 << 3) + (var118 << 19) + (var119 << 11);
                class227 var122 = class227.method3345(var116);
                if (var122.field2612 != var121) {
                    var122.field2612 = var121;
                    method3344(var122);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2141 == arg0.field1331) {
                int var123 = var3.method5120();
                int var124 = var3.method5342();
                if (var123 < -70000) {
                    var124 += 32768;
                }
                class227 var125;
                if (var123 >= 0) {
                    var125 = class227.method3345(var123);
                } else {
                    var125 = null;
                }
                while (var3.field3752 < arg0.field1339) {
                    int var126 = var3.method5096();
                    int var127 = var3.method5342();
                    int var128 = 0;
                    if (var127 != 0) {
                        var128 = var3.method5274();
                        if (var128 == 255) {
                            var128 = var3.method5120();
                        }
                    }
                    if (var125 != null && var126 >= 0 && var126 < var125.field2705.length) {
                        var125.field2705[var126] = var127;
                        var125.field2712[var126] = var128;
                    }
                    class69.method188(var124, var126, var127 - 1, var128);
                }
                if (var125 != null) {
                    method3344(var125);
                }
                method3383();
                field876[++field838 - 1 & 0x1F] = var124 & 0x7FFF;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2199 == arg0.field1331) {
                byte var129 = var3.method5238();
                int var130 = var3.method5153();
                class222.field2540[var130] = var129;
                if (class222.field2542[var130] != var129) {
                    class222.field2542[var130] = var129;
                }
                method2134(var130);
                field835[++field836 - 1 & 0x1F] = var130;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1331) {
                int var131 = var3.method5120();
                class227 var132 = class227.method3345(var131);
                for (int var133 = 0; var133 < var132.field2705.length; var133++) {
                    var132.field2705[var133] = -1;
                    var132.field2705[var133] = 0;
                }
                method3344(var132);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2197 == arg0.field1331) {
                int var134 = var3.method5216();
                boolean var135 = var3.method5144() == 1;
                class227 var136 = class227.method3345(var134);
                if (var136.field2644 != var135) {
                    var136.field2644 = var135;
                    method3344(var136);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2213 == arg0.field1331) {
                method3190(class195.field2351);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1331) {
                int var137 = var3.method5120();
                String var138 = var3.method5202();
                class227 var139 = class227.method3345(var137);
                if (!var138.equals(var139.field2648)) {
                    var139.field2648 = var138;
                    method3344(var139);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2224 == arg0.field1331) {
                int var140 = var3.method5120();
                int var141 = var3.method5153();
                class227 var142 = class227.method3345(var140);
                if (var142.field2630 != 1 || var142.field2688 != var141) {
                    var142.field2630 = 1;
                    var142.field2688 = var141;
                    method3344(var142);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2202 == arg0.field1331) {
                Statics.field2037.method1771();
                field880 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2212 == arg0.field1331) {
                int var143 = var3.method5155();
                int var144 = var3.method5112();
                int var145 = var3.method5112();
                int var146 = var3.method5216();
                class227 var147 = class227.method3345(var146);
                if (var147.field2584 != var144 || var147.field2639 != var143 || var147.field2641 != var145) {
                    var147.field2584 = var144;
                    var147.field2639 = var143;
                    var147.field2641 = var145;
                    method3344(var147);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1331) {
                method3190(class195.field2343);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2223 == arg0.field1331) {
                int var148 = var3.method5157();
                int var149 = var3.method5118();
                int var150 = var3.method5120();
                class227 var151 = class227.method3345(var150);
                if (var151.field2596 != var148 || var151.field2580 != var149 || var151.field2592 != 0 || var151.field2693 != 0) {
                    var151.field2596 = var148;
                    var151.field2580 = var149;
                    var151.field2592 = 0;
                    var151.field2693 = 0;
                    method3344(var151);
                    this.method1542(var151);
                    if (var151.field2589 == 0) {
                        method1655(Statics.field45[var150 >> 16], var151, false);
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2162 == arg0.field1331) {
                int var152 = var3.method5120();
                int var153 = var3.method5120();
                int var154 = class63.method185();
                class197 var155 = class197.method1128(class193.field2256, field695.field1329);
                var155.field2361.method5142(var154);
                var155.field2361.method5291(var152);
                var155.field2361.method5160(var153);
                var155.field2361.method5141(field458);
                field695.method2155(var155);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1331) {
                int var156 = var3.method5274();
                method551(var156);
                arg0.field1331 = null;
                return false;
            }
            if (class192.field2164 == arg0.field1331) {
                field891 = true;
                Statics.field113 = var3.method5274();
                Statics.field3341 = var3.method5274();
                Statics.field129 = var3.method5342();
                Statics.field1268 = var3.method5274();
                Statics.field2406 = var3.method5274();
                if (Statics.field2406 >= 100) {
                    int var157 = Statics.field113 * 128 + 64;
                    int var158 = Statics.field3341 * 128 + 64;
                    int var159 = method2028(var157, var158, Statics.field1950) - Statics.field129;
                    int var160 = var157 - Statics.field631;
                    int var161 = var159 - Statics.field422;
                    int var162 = var158 - Statics.field559;
                    int var163 = (int) Math.sqrt((double) (var160 * var160 + var162 * var162));
                    Statics.field1824 = (int) (Math.atan2((double) var161, (double) var163) * 325.949D) & 0x7FF;
                    Statics.field3177 = (int) (Math.atan2((double) var160, (double) var162) * -325.949D) & 0x7FF;
                    if (Statics.field1824 < 128) {
                        Statics.field1824 = 128;
                    }
                    if (Statics.field1824 > 383) {
                        Statics.field1824 = 383;
                    }
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2148 == arg0.field1331) {
                int var164 = var3.method5120();
                int var165 = var3.method5153();
                if (var165 == 65535) {
                    var165 = -1;
                }
                int var166 = var3.method5120();
                int var167 = var3.method5112();
                if (var167 == 65535) {
                    var167 = -1;
                }
                for (int var168 = var167; var168 <= var165; var168++) {
                    long var169 = ((long) var164 << 32) + (long) var168;
                    class190 var171 = field892.method5543(var169);
                    if (var171 != null) {
                        var171.method3359();
                    }
                    field892.method5531(new class189(var166), var169);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1331) {
                var3.field3752 += 28;
                if (var3.method5140()) {
                    method702(var3, var3.field3752 - 28);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2145 == arg0.field1331) {
                method3383();
                int var172 = var3.method5165();
                int var173 = var3.method5144();
                int var174 = var3.method5144();
                field676[var174] = var172;
                field781[var174] = var173;
                field782[var174] = 1;
                for (int var175 = 0; var175 < 98; var175++) {
                    if (var172 >= class231.field2769[var175]) {
                        field782[var174] = var175 + 2;
                    }
                }
                field839[++field840 - 1 & 0x1F] = var174;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1331) {
                String var176 = var3.method5202();
                int var177 = var3.method5144();
                int var178 = var3.method5145();
                if (var178 >= 1 && var178 <= 8) {
                    if (var176.equalsIgnoreCase(class234.field2792)) {
                        var176 = null;
                    }
                    field773[var178 - 1] = var176;
                    field774[var178 - 1] = var177 == 0;
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2143 == arg0.field1331) {
                int var179 = var3.method5120();
                int var180 = var3.method5342();
                if (var179 < -70000) {
                    var180 += 32768;
                }
                class227 var181;
                if (var179 >= 0) {
                    var181 = class227.method3345(var179);
                } else {
                    var181 = null;
                }
                if (var181 != null) {
                    for (int var182 = 0; var182 < var181.field2705.length; var182++) {
                        var181.field2705[var182] = 0;
                        var181.field2712[var182] = 0;
                    }
                }
                class69.method3407(var180);
                int var183 = var3.method5342();
                for (int var184 = 0; var184 < var183; var184++) {
                    int var185 = var3.method5112();
                    int var186 = var3.method5145();
                    if (var186 == 255) {
                        var186 = var3.method5164();
                    }
                    if (var181 != null && var184 < var181.field2705.length) {
                        var181.field2705[var184] = var185;
                        var181.field2712[var184] = var186;
                    }
                    class69.method188(var180, var184, var185 - 1, var186);
                }
                if (var181 != null) {
                    method3344(var181);
                }
                method3383();
                field876[++field838 - 1 & 0x1F] = var180 & 0x7FFF;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1331) {
                method3383();
                field817 = var3.method5118();
                field846 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2210 == arg0.field1331) {
                if (arg0.field1339 == 0) {
                    Statics.field245 = null;
                } else {
                    if (Statics.field245 == null) {
                        Statics.field245 = new class296(Statics.field93, Statics.field148);
                    }
                    Statics.field245.method4846(var3);
                }
                method411();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2214 == arg0.field1331) {
                method3190(class195.field2348);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2142 == arg0.field1331) {
                class81 var187 = new class81();
                var187.field1022 = var3.method5202();
                var187.field1019 = var3.method5342();
                int var188 = var3.method5120();
                var187.field1020 = var188;
                method575(45);
                var2.method3288();
                Object var189 = null;
                class95.method1101(var187);
                arg0.field1331 = null;
                return false;
            }
            if (class192.field2183 == arg0.field1331) {
                method3190(class195.field2350);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2203 == arg0.field1331) {
                method1130(true, arg0.field1326);
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1331) {
                int var190 = var3.method5155();
                class69.method1671(var190);
                field876[++field838 - 1 & 0x1F] = var190 & 0x7FFF;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2221 == arg0.field1331) {
                Statics.field730 = class321.method719(var3.method5274());
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2209 == arg0.field1331) {
                Statics.field1332 = var3.method5144();
                Statics.field3223 = var3.method5146();
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1331) {
                boolean var191 = var3.method5274() == 1;
                if (var191) {
                    Statics.field18 = class308.method4891() - var3.method5121();
                    Statics.field3635 = new class16(var3, true);
                } else {
                    Statics.field3635 = null;
                }
                field681 = field738;
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2156 == arg0.field1331) {
                int var192 = var3.method5165();
                int var193 = var3.method5216();
                class71 var194 = (class71) field834.method5543((long) var192);
                class71 var195 = (class71) field834.method5543((long) var193);
                if (var195 != null) {
                    method1141(var195, var194 == null || var194.field564 != var195.field564);
                }
                if (var194 != null) {
                    var194.method3359();
                    field834.method5531(var194, (long) var193);
                }
                class227 var196 = class227.method3345(var192);
                if (var196 != null) {
                    method3344(var196);
                }
                class227 var197 = class227.method3345(var193);
                if (var197 != null) {
                    method3344(var197);
                    method1655(Statics.field45[var197.field2587 >>> 16], var197, true);
                }
                if (field874 != -1) {
                    method302(field874, 1);
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2147 == arg0.field1331) {
                int var198 = var3.method5120();
                if (field731 != var198) {
                    field731 = var198;
                    method576();
                }
                arg0.field1331 = null;
                return true;
            }
            if (class192.field2157 == arg0.field1331) {
                method3190(class195.field2347);
                arg0.field1331 = null;
                return true;
            }
            class352.method3694("" + (arg0.field1331 == null ? -1 : arg0.field1331.field2226) + class91.field1151 + (arg0.field1337 == null ? -1 : arg0.field1337.field2226) + class91.field1151 + (arg0.field1338 == null ? -1 : arg0.field1338.field2226) + class91.field1151 + arg0.field1339, (Throwable) null);
            method305();
        } catch (IOException var203) {
            method1755();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1331 == null ? -1 : arg0.field1331.field2226) + class91.field1151 + (arg0.field1337 == null ? -1 : arg0.field1337.field2226) + class91.field1151 + (arg0.field1338 == null ? -1 : arg0.field1338.field2226) + class91.field1151 + arg0.field1339 + class91.field1151 + (Statics.field3157 + Statics.field2563.field994[0]) + class91.field1151 + (Statics.field301 + Statics.field2563.field969[0]) + class91.field1151;
            for (int var202 = 0; var202 < arg0.field1339 && var202 < 50; var202++) {
                var201 = var201 + var3.field3753[var202] + class91.field1151;
            }
            class352.method3694(var201, var204);
            method305();
        }
        return true;
    }

    @ObfuscatedName("fz.hz(Lgs;I)V")
    public static final void method3190(class195 arg0) {
        class310 var1 = field695.field1326;
        if (class195.field2343 == arg0) {
            int var2 = var1.method5155();
            int var3 = var1.method5144();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1332;
            int var5 = (var3 & 0x7) + Statics.field3223;
            int var6 = var1.method5144();
            int var7 = var6 >> 4 & 0xF;
            int var8 = var6 & 0x7;
            int var9 = var1.method5145();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                int var10 = var7 + 1;
                if (Statics.field2563.field994[0] >= var4 - var10 && Statics.field2563.field994[0] <= var4 + var10 && Statics.field2563.field969[0] >= var5 - var10 && Statics.field2563.field969[0] <= var5 + var10 && Statics.field3618.field1061 != 0 && var8 > 0 && field885 < 50) {
                    field858[field885] = var2;
                    field887[field885] = var8;
                    field888[field885] = var9;
                    field890[field885] = null;
                    field889[field885] = (var4 << 16) + (var5 << 8) + var7;
                    field885++;
                }
            }
        }
        if (class195.field2350 == arg0) {
            int var11 = var1.method5144();
            int var12 = (var11 >> 4 & 0x7) + Statics.field1332;
            int var13 = (var11 & 0x7) + Statics.field3223;
            int var14 = var1.method5155();
            int var15 = var1.method5342();
            int var16 = var1.method5274();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                int var17 = var12 * 128 + 64;
                int var18 = var13 * 128 + 64;
                class87 var19 = new class87(var14, Statics.field1950, var17, var18, method2028(var17, var18, Statics.field1950) - var16, var15, field656);
                field735.method4549(var19);
            }
        } else if (class195.field2347 == arg0) {
            int var20 = var1.method5146() * 4;
            byte var21 = var1.method5148();
            byte var22 = var1.method5148();
            int var23 = var1.method5274();
            int var24 = var1.method5153();
            int var25 = var1.method5157();
            int var26 = var1.method5144();
            int var27 = (var26 >> 4 & 0x7) + Statics.field1332;
            int var28 = (var26 & 0x7) + Statics.field3223;
            int var29 = var1.method5342();
            int var30 = var1.method5155();
            int var31 = var1.method5144();
            int var32 = var1.method5146() * 4;
            int var33 = var21 + var27;
            int var34 = var22 + var28;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var30 != 65535) {
                int var35 = var27 * 128 + 64;
                int var36 = var28 * 128 + 64;
                int var37 = var33 * 128 + 64;
                int var38 = var34 * 128 + 64;
                class96 var39 = new class96(var30, Statics.field1950, var35, var36, method2028(var35, var36, Statics.field1950) - var20, field656 + var24, field656 + var29, var31, var23, var25, var32);
                var39.method2014(var37, var38, method2028(var37, var38, Statics.field1950) - var32, field656 + var24);
                field779.method4549(var39);
            }
        } else if (class195.field2344 == arg0) {
            int var40 = var1.method5342();
            int var41 = var1.method5146();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field709[var42];
            int var45 = var1.method5274();
            int var46 = (var45 >> 4 & 0x7) + Statics.field1332;
            int var47 = (var45 & 0x7) + Statics.field3223;
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                method1103(Statics.field1950, var46, var47, var44, var40, var42, var43, 0, -1);
            }
        } else if (class195.field2346 == arg0) {
            int var48 = var1.method5155();
            int var49 = var1.method5145();
            int var50 = (var49 >> 4 & 0x7) + Statics.field1332;
            int var51 = (var49 & 0x7) + Statics.field3223;
            int var52 = var1.method5155();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class97 var53 = new class97();
                var53.field1239 = var52;
                var53.field1240 = var48;
                if (field777[Statics.field1950][var50][var51] == null) {
                    field777[Statics.field1950][var50][var51] = new class273();
                }
                field777[Statics.field1950][var50][var51].method4549(var53);
                method1144(var50, var51);
            }
        } else if (class195.field2351 == arg0) {
            int var54 = var1.method5153();
            int var55 = var1.method5145();
            int var56 = (var55 >> 4 & 0x7) + Statics.field1332;
            int var57 = (var55 & 0x7) + Statics.field3223;
            int var58 = var1.method5153();
            int var59 = var1.method5153();
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                class273 var60 = field777[Statics.field1950][var56][var57];
                if (var60 != null) {
                    for (class97 var61 = (class97) var60.method4540(); var61 != null; var61 = (class97) var60.method4545()) {
                        if ((var54 & 0x7FFF) == var61.field1239 && var61.field1240 == var59) {
                            var61.field1240 = var58;
                            break;
                        }
                    }
                    method1144(var56, var57);
                }
            }
        } else if (class195.field2349 == arg0) {
            int var62 = var1.method5153();
            int var63 = var1.method5145();
            int var64 = (var63 >> 4 & 0x7) + Statics.field1332;
            int var65 = (var63 & 0x7) + Statics.field3223;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class273 var66 = field777[Statics.field1950][var64][var65];
                if (var66 != null) {
                    for (class97 var67 = (class97) var66.method4540(); var67 != null; var67 = (class97) var66.method4545()) {
                        if ((var62 & 0x7FFF) == var67.field1239) {
                            var67.method3359();
                            break;
                        }
                    }
                    if (var66.method4540() == null) {
                        field777[Statics.field1950][var64][var65] = null;
                    }
                    method1144(var64, var65);
                }
            }
        } else if (class195.field2352 == arg0) {
            int var68 = var1.method5145();
            int var69 = var68 >> 2;
            int var70 = var68 & 0x3;
            int var71 = field709[var69];
            int var72 = var1.method5342();
            int var73 = var1.method5145();
            int var74 = (var73 >> 4 & 0x7) + Statics.field1332;
            int var75 = (var73 & 0x7) + Statics.field3223;
            if (var74 >= 0 && var75 >= 0 && var74 < 103 && var75 < 103) {
                if (var71 == 0) {
                    class146 var76 = Statics.field537.method2967(Statics.field1950, var74, var75);
                    if (var76 != null) {
                        int var77 = class138.method3119(var76.field1903);
                        if (var69 == 2) {
                            var76.field1900 = new class103(var77, 2, var70 + 4, Statics.field1950, var74, var75, var72, false, var76.field1900);
                            var76.field1898 = new class103(var77, 2, var70 + 1 & 0x3, Statics.field1950, var74, var75, var72, false, var76.field1898);
                        } else {
                            var76.field1900 = new class103(var77, var69, var70, Statics.field1950, var74, var75, var72, false, var76.field1900);
                        }
                    }
                }
                if (var71 == 1) {
                    class151 var78 = Statics.field537.method3004(Statics.field1950, var74, var75);
                    if (var78 != null) {
                        int var79 = class138.method3119(var78.field1941);
                        if (var69 == 4 || var69 == 5) {
                            var78.field1939 = new class103(var79, 4, var70, Statics.field1950, var74, var75, var72, false, var78.field1939);
                        } else if (var69 == 6) {
                            var78.field1939 = new class103(var79, 4, var70 + 4, Statics.field1950, var74, var75, var72, false, var78.field1939);
                        } else if (var69 == 7) {
                            var78.field1939 = new class103(var79, 4, (var70 + 2 & 0x3) + 4, Statics.field1950, var74, var75, var72, false, var78.field1939);
                        } else if (var69 == 8) {
                            var78.field1939 = new class103(var79, 4, var70 + 4, Statics.field1950, var74, var75, var72, false, var78.field1939);
                            var78.field1943 = new class103(var79, 4, (var70 + 2 & 0x3) + 4, Statics.field1950, var74, var75, var72, false, var78.field1943);
                        }
                    }
                }
                if (var71 == 2) {
                    class152 var80 = Statics.field537.method2953(Statics.field1950, var74, var75);
                    if (var69 == 11) {
                        var69 = 10;
                    }
                    if (var80 != null) {
                        var80.field1947 = new class103(class138.method3119(var80.field1958), var69, var70, Statics.field1950, var74, var75, var72, false, var80.field1947);
                    }
                }
                if (var71 == 3) {
                    class133 var81 = Statics.field537.method2952(Statics.field1950, var74, var75);
                    if (var81 != null) {
                        var81.field1629 = new class103(class138.method3119(var81.field1630), 22, var70, Statics.field1950, var74, var75, var72, false, var81.field1629);
                    }
                }
            }
        } else {
            if (class195.field2345 == arg0) {
                byte var82 = var1.method5218();
                int var83 = var1.method5144();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field709[var84];
                byte var87 = var1.method5218();
                int var88 = var1.method5342();
                int var89 = var1.method5145();
                int var90 = (var89 >> 4 & 0x7) + Statics.field1332;
                int var91 = (var89 & 0x7) + Statics.field3223;
                byte var92 = var1.method5148();
                int var93 = var1.method5342();
                int var94 = var1.method5112();
                int var95 = var1.method5342();
                byte var96 = var1.method5148();
                class76 var97;
                if (field766 == var93) {
                    var97 = Statics.field2563;
                } else {
                    var97 = field765[var93];
                }
                if (var97 != null) {
                    class265 var98 = class265.method325(var94);
                    int var99;
                    int var100;
                    if (var85 == 1 || var85 == 3) {
                        var99 = var98.field3397;
                        var100 = var98.field3419;
                    } else {
                        var99 = var98.field3419;
                        var100 = var98.field3397;
                    }
                    int var101 = (var99 >> 1) + var90;
                    int var102 = (var99 + 1 >> 1) + var90;
                    int var103 = (var100 >> 1) + var91;
                    int var104 = (var100 + 1 >> 1) + var91;
                    int[][] var105 = class65.field520[Statics.field1950];
                    int var106 = var105[var101][var103] + var105[var102][var103] + var105[var101][var104] + var105[var102][var104] >> 2;
                    int var107 = (var90 << 7) + (var99 << 6);
                    int var108 = (var91 << 7) + (var100 << 6);
                    class137 var109 = var98.method4250(var84, var85, var105, var107, var106, var108);
                    if (var109 != null) {
                        method1103(Statics.field1950, var90, var91, var86, -1, 0, 0, var95 + 1, var88 + 1);
                        var97.field615 = field656 + var95;
                        var97.field616 = field656 + var88;
                        var97.field608 = var109;
                        var97.field635 = var90 * 128 + var99 * 64;
                        var97.field627 = var91 * 128 + var100 * 64;
                        var97.field618 = var106;
                        if (var92 > var87) {
                            byte var110 = var92;
                            var92 = var87;
                            var87 = var110;
                        }
                        if (var82 > var96) {
                            byte var111 = var82;
                            var82 = var96;
                            var96 = var111;
                        }
                        var97.field621 = var90 + var92;
                        var97.field623 = var87 + var90;
                        var97.field607 = var82 + var91;
                        var97.field624 = var91 + var96;
                    }
                }
            }
            if (class195.field2348 == arg0) {
                int var112 = var1.method5145();
                int var113 = (var112 >> 4 & 0x7) + Statics.field1332;
                int var114 = (var112 & 0x7) + Statics.field3223;
                int var115 = var1.method5144();
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = field709[var116];
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method1103(Statics.field1950, var113, var114, var118, -1, var116, var117, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("bo.hr(IIIIIIIIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field877.method4540(); var10 != null; var10 = (class78) field877.method4545()) {
            if (var10.field925 == arg0 && var10.field927 == arg1 && var10.field928 == arg2 && var10.field926 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field925 = arg0;
            var9.field926 = arg3;
            var9.field927 = arg1;
            var9.field928 = arg2;
            method69(var9);
            field877.method4549(var9);
        }
        var9.field933 = arg4;
        var9.field934 = arg5;
        var9.field937 = arg6;
        var9.field935 = arg7;
        var9.field931 = arg8;
    }

    @ObfuscatedName("p.ht(Lbp;I)V")
    public static final void method69(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field926 == 0) {
            var1 = Statics.field537.method2936(arg0.field925, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 1) {
            var1 = Statics.field537.method2956(arg0.field925, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 2) {
            var1 = Statics.field537.method2957(arg0.field925, arg0.field927, arg0.field928);
        }
        if (arg0.field926 == 3) {
            var1 = Statics.field537.method2958(arg0.field925, arg0.field927, arg0.field928);
        }
        if (var1 != 0L) {
            int var6 = Statics.field537.method2937(arg0.field925, arg0.field927, arg0.field928, var1);
            var3 = class138.method3119(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field929 = var3;
        arg0.field936 = var4;
        arg0.field930 = var5;
    }

    @ObfuscatedName("ak.hp(I)V")
    public static final void method324() {
        for (class78 var0 = (class78) field877.method4540(); var0 != null; var0 = (class78) field877.method4545()) {
            if (var0.field931 > 0) {
                var0.field931--;
            }
            if (var0.field931 != 0) {
                if (var0.field935 > 0) {
                    var0.field935--;
                }
                if (var0.field935 == 0 && var0.field927 >= 1 && var0.field928 >= 1 && var0.field927 <= 102 && var0.field928 <= 102 && (var0.field933 < 0 || class65.method3806(var0.field933, var0.field934))) {
                    method659(var0.field925, var0.field926, var0.field927, var0.field928, var0.field933, var0.field937, var0.field934);
                    var0.field935 = -1;
                    if (var0.field933 == var0.field929 && var0.field929 == -1) {
                        var0.method3359();
                    } else if (var0.field933 == var0.field929 && var0.field937 == var0.field930 && var0.field936 == var0.field934) {
                        var0.method3359();
                    }
                }
            } else if (var0.field929 < 0 || class65.method3806(var0.field929, var0.field936)) {
                method659(var0.field925, var0.field926, var0.field927, var0.field928, var0.field929, var0.field930, var0.field936);
                var0.method3359();
            }
        }
    }

    @ObfuscatedName("af.hb(IIIIIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field911 && Statics.field1950 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field537.method2936(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field537.method2956(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field537.method2957(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field537.method2958(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field537.method2937(arg0, arg2, arg3, var7);
            int var13 = class138.method3119(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field537.method2946(arg0, arg2, arg3);
                class265 var16 = class265.method325(var13);
                if (var16.field3398 != 0) {
                    field832[arg0].method3322(arg2, arg3, var14, var15, var16.field3399);
                }
            }
            if (arg1 == 1) {
                Statics.field537.method2947(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field537.method2948(arg0, arg2, arg3);
                class265 var17 = class265.method325(var13);
                if (var17.field3419 + arg2 > 103 || var17.field3419 + arg3 > 103 || var17.field3397 + arg2 > 103 || var17.field3397 + arg3 > 103) {
                    return;
                }
                if (var17.field3398 != 0) {
                    field832[arg0].method3323(arg2, arg3, var17.field3419, var17.field3397, var15, var17.field3399);
                }
            }
            if (arg1 == 3) {
                Statics.field537.method2949(arg0, arg2, arg3);
                class265 var18 = class265.method325(var13);
                if (var18.field3398 == 1) {
                    field832[arg0].method3325(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field508[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class65.method1138(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field537, field832[arg0]);
    }

    @ObfuscatedName("bv.hd(III)V")
    public static final void method1144(int arg0, int arg1) {
        class273 var2 = field777[Statics.field1950][arg0][arg1];
        if (var2 == null) {
            Statics.field537.method2950(Statics.field1950, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class97 var5 = null;
        for (class97 var6 = (class97) var2.method4540(); var6 != null; var6 = (class97) var2.method4545()) {
            class266 var7 = class266.method1102(var6.field1239);
            long var8 = (long) var7.field3478;
            if (var7.field3456 == 1) {
                var8 = (long) (var6.field1240 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field537.method2950(Statics.field1950, arg0, arg1);
            return;
        }
        var2.method4539(var5);
        class97 var10 = null;
        class97 var11 = null;
        for (class97 var12 = (class97) var2.method4540(); var12 != null; var12 = (class97) var2.method4545()) {
            if (var5.field1239 != var12.field1239) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1239 != var12.field1239 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class138.method1957(arg0, arg1, 3, false, 0);
        Statics.field537.method3040(Statics.field1950, arg0, arg1, method2028(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1950), var5, var13, var10, var11);
    }

    @ObfuscatedName("k.hw(ZLky;I)V")
    public static final void method224(boolean arg0, class310 arg1) {
        field770 = 0;
        field827 = 0;
        class310 var2 = field695.field1326;
        var2.method5067();
        int var3 = var2.method5068(8);
        if (var3 < field691) {
            for (int var4 = var3; var4 < field691; var4++) {
                field771[++field770 - 1] = field692[var4];
            }
        }
        if (var3 > field691) {
            throw new RuntimeException("");
        }
        field691 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field692[var5];
            class89 var7 = field690[var6];
            int var8 = var2.method5068(1);
            if (var8 == 0) {
                field692[++field691 - 1] = var6;
                var7.field988 = field656;
            } else {
                int var9 = var2.method5068(2);
                if (var9 == 0) {
                    field692[++field691 - 1] = var6;
                    var7.field988 = field656;
                    field655[++field827 - 1] = var6;
                } else if (var9 == 1) {
                    field692[++field691 - 1] = var6;
                    var7.field988 = field656;
                    int var10 = var2.method5068(3);
                    var7.method1951(var10, (byte) 1);
                    int var11 = var2.method5068(1);
                    if (var11 == 1) {
                        field655[++field827 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field692[++field691 - 1] = var6;
                    var7.field988 = field656;
                    int var12 = var2.method5068(3);
                    var7.method1951(var12, (byte) 2);
                    int var13 = var2.method5068(3);
                    var7.method1951(var13, (byte) 2);
                    int var14 = var2.method5068(1);
                    if (var14 == 1) {
                        field655[++field827 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field771[++field770 - 1] = var6;
                }
            }
        }
        method3412(arg0, arg1);
        for (int var15 = 0; var15 < field827; var15++) {
            int var16 = field655[var15];
            class89 var17 = field690[var16];
            int var18 = arg1.method5274();
            if ((var18 & 0x8) != 0) {
                var17.field976 = arg1.method5112();
                int var19 = arg1.method5120();
                var17.field980 = var19 >> 16;
                var17.field979 = (var19 & 0xFFFF) + field656;
                var17.field977 = 0;
                var17.field978 = 0;
                if (var17.field979 > field656) {
                    var17.field977 = -1;
                }
                if (var17.field976 == 65535) {
                    var17.field976 = -1;
                }
            }
            if ((var18 & 0x2) != 0) {
                int var20 = arg1.method5155();
                int var21 = arg1.method5112();
                int var22 = var17.field991 - (var20 - Statics.field3157 - Statics.field3157) * 64;
                int var23 = var17.field939 - (var21 - Statics.field301 - Statics.field301) * 64;
                if (var22 != 0 || var23 != 0) {
                    var17.field960 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x10) != 0) {
                var17.field981 = arg1.method5153();
                if (var17.field981 == 65535) {
                    var17.field981 = -1;
                }
            }
            if ((var18 & 0x20) != 0) {
                var17.field952 = arg1.method5202();
                var17.field992 = 100;
            }
            if ((var18 & 0x1) != 0) {
                var17.field1136 = class268.method250(arg1.method5153());
                var17.field942 = var17.field1136.field3501;
                var17.field941 = var17.field1136.field3524;
                var17.field947 = var17.field1136.field3526;
                var17.field948 = var17.field1136.field3508;
                var17.field949 = var17.field1136.field3509;
                var17.field950 = var17.field1136.field3504;
                var17.field944 = var17.field1136.field3507;
                var17.field945 = var17.field1136.field3505;
                var17.field946 = var17.field1136.field3506;
            }
            if ((var18 & 0x40) != 0) {
                int var24 = arg1.method5155();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg1.method5274();
                if (var17.field971 == var24 && var24 != -1) {
                    int var26 = class270.method4174(var24).field3549;
                    if (var26 == 1) {
                        var17.field972 = 0;
                        var17.field973 = 0;
                        var17.field938 = var25;
                        var17.field975 = 0;
                    }
                    if (var26 == 2) {
                        var17.field975 = 0;
                    }
                } else if (var24 == -1 || var17.field971 == -1 || class270.method4174(var24).field3558 >= class270.method4174(var17.field971).field3558) {
                    var17.field971 = var24;
                    var17.field972 = 0;
                    var17.field973 = 0;
                    var17.field938 = var25;
                    var17.field975 = 0;
                    var17.field997 = var17.field986;
                }
            }
            if ((var18 & 0x4) != 0) {
                int var27 = arg1.method5144();
                if (var27 > 0) {
                    for (int var28 = 0; var28 < var27; var28++) {
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = -1;
                        int var32 = arg1.method5096();
                        if (var32 == 32767) {
                            var32 = arg1.method5096();
                            var30 = arg1.method5096();
                            var29 = arg1.method5096();
                            var31 = arg1.method5096();
                        } else if (var32 == 32766) {
                            var32 = -1;
                        } else {
                            var30 = arg1.method5096();
                        }
                        int var33 = arg1.method5096();
                        var17.method1659(var32, var30, var29, var31, field656, var33);
                    }
                }
                int var34 = arg1.method5274();
                if (var34 > 0) {
                    for (int var35 = 0; var35 < var34; var35++) {
                        int var36 = arg1.method5096();
                        int var37 = arg1.method5096();
                        if (var37 == 32767) {
                            var17.method1660(var36);
                        } else {
                            int var38 = arg1.method5096();
                            int var39 = arg1.method5145();
                            int var40 = var37 > 0 ? arg1.method5145() : var39;
                            var17.method1667(var36, field656, var37, var38, var39, var40);
                        }
                    }
                }
            }
            if ((var18 & 0x80) != 0) {
                var17.field982 = arg1.method5218();
                var17.field983 = arg1.method5218();
                var17.field959 = arg1.method5218();
                var17.field957 = arg1.method5218();
                var17.field985 = arg1.method5342() + field656;
                var17.field974 = arg1.method5155() + field656;
                var17.field987 = arg1.method5342();
                var17.field986 = 1;
                var17.field997 = 0;
                var17.field982 += var17.field994[0];
                var17.field983 += var17.field969[0];
                var17.field959 += var17.field994[0];
                var17.field957 += var17.field969[0];
            }
        }
        for (int var41 = 0; var41 < field770; var41++) {
            int var42 = field771[var41];
            if (field656 != field690[var42].field988) {
                field690[var42].field1136 = null;
                field690[var42] = null;
            }
        }
        if (field695.field1339 != arg1.field3752) {
            throw new RuntimeException(arg1.field3752 + class91.field1151 + field695.field1339);
        }
        for (int var43 = 0; var43 < field691; var43++) {
            if (field690[field692[var43]] == null) {
                throw new RuntimeException(var43 + class91.field1151 + field691);
            }
        }
    }

    @ObfuscatedName("ge.iq(ZLky;B)V")
    public static final void method3412(boolean arg0, class310 arg1) {
        while (true) {
            if (arg1.method5070(field695.field1339) >= 27) {
                int var2 = arg1.method5068(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field690[var2] == null) {
                        field690[var2] = new class89();
                        var3 = true;
                    }
                    class89 var4 = field690[var2];
                    field692[++field691 - 1] = var2;
                    var4.field988 = field656;
                    var4.field1136 = class268.method250(arg1.method5068(14));
                    int var5 = arg1.method5068(1);
                    if (var5 == 1) {
                        field655[++field827 - 1] = var2;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method5068(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method5068(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field728[arg1.method5068(3)];
                    if (var3) {
                        var4.field990 = var4.field940 = var7;
                    }
                    int var8 = arg1.method5068(1);
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5068(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5068(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field942 = var4.field1136.field3501;
                    var4.field941 = var4.field1136.field3524;
                    if (var4.field941 == 0) {
                        var4.field940 = 0;
                    }
                    var4.field947 = var4.field1136.field3526;
                    var4.field948 = var4.field1136.field3508;
                    var4.field949 = var4.field1136.field3509;
                    var4.field950 = var4.field1136.field3504;
                    var4.field944 = var4.field1136.field3507;
                    var4.field945 = var4.field1136.field3505;
                    var4.field946 = var4.field1136.field3506;
                    var4.method1952(Statics.field2563.field994[0] + var6, Statics.field2563.field969[0] + var9, var8 == 1);
                    continue;
                }
            }
            arg1.method5090();
            return;
        }
    }

    @ObfuscatedName("ba.ip(I)V")
    public static void method1180() {
        field786 = 0;
        field785 = false;
        field791[0] = class234.field3033;
        field792[0] = "";
        field845[0] = 1006;
        field793[0] = false;
        field786 = 1;
    }

    @ObfuscatedName("k.ii(IIB)V")
    public static final void method221(int arg0, int arg1) {
        if (field786 < 2 && field802 == 0 && !field804 || !field797) {
            return;
        }
        int var2 = method405();
        String var3;
        if (field802 == 1 && field786 < 2) {
            var3 = class234.field2938 + class234.field2948 + field745 + " " + class91.field1153;
        } else if (field804 && field786 < 2) {
            var3 = field852 + class234.field2948 + field808 + " " + class91.field1153;
        } else {
            var3 = method1109(var2);
        }
        if (field786 > 2) {
            var3 = var3 + class91.method200(16777215) + " " + '/' + " " + (field786 - 2) + class234.field2942;
        }
        Statics.field75.method5002(var3, arg0 + 4, arg1 + 15, 16777215, 0, field656 / 1000);
    }

    @ObfuscatedName("ep.id(IIIIB)V")
    public static final void method3114(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field825; var4++) {
            if (field859[var4] + field857[var4] > arg0 && field857[var4] < arg0 + arg2 && field918[var4] + field809[var4] > arg1 && field918[var4] < arg1 + arg3) {
                field902[var4] = true;
            }
        }
    }

    @ObfuscatedName("hw.ig(IIIII)V")
    public static final void method3804(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field825; var4++) {
            if (field859[var4] + field857[var4] > arg0 && field857[var4] < arg0 + arg2 && field918[var4] + field809[var4] > arg1 && field918[var4] < arg1 + arg3) {
                field855[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.in(B)V")
    public final void method1254() {
        method2838();
        if (Statics.field2028 != null || field822 != null) {
            return;
        }
        int var1 = class64.field484;
        if (field785) {
            if (var1 != 1 && (Statics.field1990 || var1 != 4)) {
                int var2 = class64.field493;
                int var3 = class64.field500;
                if (var2 < Statics.field3632 - 10 || var2 > Statics.field3632 + Statics.field1929 + 10 || var3 < Statics.field1316 - 10 || var3 > Statics.field2121 + Statics.field1316 + 10) {
                    field785 = false;
                    method3114(Statics.field3632, Statics.field1316, Statics.field1929, Statics.field2121);
                }
            }
            if (var1 == 1 || !Statics.field1990 && var1 == 4) {
                int var4 = Statics.field3632;
                int var5 = Statics.field1316;
                int var6 = Statics.field1929;
                int var7 = class64.field490;
                int var8 = class64.field503;
                int var9 = -1;
                for (int var10 = 0; var10 < field786; var10++) {
                    int var11 = (field786 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    method4937(var9);
                }
                field785 = false;
                method3114(Statics.field3632, Statics.field1316, Statics.field1929, Statics.field2121);
            }
            return;
        }
        int var12 = method405();
        if ((var1 == 1 || !Statics.field1990 && var1 == 4) && var12 >= 0) {
            int var13 = field845[var12];
            if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                int var14 = field787[var12];
                int var15 = field788[var12];
                class227 var16 = class227.method3345(var15);
                if (class228.method320(method3108(var16)) || class228.method3103(method3108(var16))) {
                    if (Statics.field2028 != null && !field849 && field786 > 0 && !this.method1255()) {
                        int var17 = field758;
                        int var18 = field759;
                        method321(Statics.field309, var17, var18);
                        Statics.field309 = null;
                    }
                    field849 = false;
                    field899 = 0;
                    if (Statics.field2028 != null) {
                        method3344(Statics.field2028);
                    }
                    Statics.field2028 = class227.method3345(var15);
                    field807 = var14;
                    field758 = class64.field490;
                    field759 = class64.field503;
                    if (var12 >= 0) {
                        Statics.field309 = new class92();
                        Statics.field309.field1165 = field787[var12];
                        Statics.field309.field1162 = field788[var12];
                        Statics.field309.field1163 = field845[var12];
                        Statics.field309.field1161 = field790[var12];
                        Statics.field309.field1164 = field791[var12];
                    }
                    method3344(Statics.field2028);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field1990 && var1 == 4) && this.method1255()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field1990 && var1 == 4) && field786 > 0) {
            method4937(var12);
        }
        if (var1 == 2 && field786 > 0) {
            this.method1256(class64.field490, class64.field503);
        }
    }

    @ObfuscatedName("client.io(I)Z")
    public final boolean method1255() {
        int var1 = method405();
        return (field883 == 1 && field786 > 2 || method2060(var1)) && !field793[var1];
    }

    @ObfuscatedName("client.ic(III)V")
    public final void method1256(int arg0, int arg1) {
        method3247(arg0, arg1);
        Statics.field537.method2966(Statics.field1950, arg0, arg1, false);
        field785 = true;
    }

    @ObfuscatedName("fm.ih(IIS)V")
    public static void method3247(int arg0, int arg1) {
        int var2 = Statics.field75.method4961(class234.field2988);
        for (int var3 = 0; var3 < field786; var3++) {
            int var4 = Statics.field75.method4961(method1109(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field786 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3639) {
            var6 = Statics.field3639 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1893) {
            var7 = Statics.field1893 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field3632 = var6;
        Statics.field1316 = var7;
        Statics.field1929 = var2;
        Statics.field2121 = field786 * 15 + 22;
    }

    @ObfuscatedName("cy.ia(II)Z")
    public static final boolean method2060(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field845[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("kr.ib(IB)V")
    public static final void method4937(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field787[arg0];
        int var2 = field788[arg0];
        int var3 = field845[arg0];
        int var4 = field790[arg0];
        String var5 = field791[arg0];
        String var6 = field792[arg0];
        method3349(var1, var2, var3, var4, var5, var6, class64.field490, class64.field503);
    }

    @ObfuscatedName("ak.ij(Lcq;IIB)V")
    public static final void method321(class92 arg0, int arg1, int arg2) {
        method3349(arg0.field1165, arg0.field1162, arg0.field1163, arg0.field1161, arg0.field1164, arg0.field1164, arg1, arg2);
    }

    @ObfuscatedName("gz.il(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3349(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field199.method5934(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 25) {
            class227 var8 = class227.method1975(arg1, arg0);
            if (var8 != null) {
                method618();
                method3379(arg1, arg0, class228.method3369(method3108(var8)), var8.field2713);
                field802 = 0;
                field852 = method3825(var8);
                if (field852 == null) {
                    field852 = class234.field2792;
                }
                if (var8.field2586) {
                    field808 = var8.field2666 + class91.method200(16777215);
                } else {
                    field808 = class91.method200(65280) + var8.field2709 + class91.method200(16777215);
                }
            }
            return;
        }
        if (arg2 == 58) {
            class227 var9 = class227.method1975(arg1, arg0);
            if (var9 != null) {
                class197 var10 = class197.method1128(class193.field2297, field695.field1329);
                var10.field2361.method5123(Statics.field494);
                var10.field2361.method5099(arg0);
                var10.field2361.method5151(field837);
                var10.field2361.method5334(field805);
                var10.field2361.method5312(var9.field2713);
                var10.field2361.method5291(arg1);
                field695.method2155(var10);
            }
        }
        if (arg2 == 35) {
            class197 var11 = class197.method1128(class193.field2260, field695.field1329);
            var11.field2361.method5312(arg0);
            var11.field2361.method5151(arg3);
            var11.field2361.method5160(arg1);
            field695.method2155(var11);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 28) {
            class197 var12 = class197.method1128(class193.field2288, field695.field1329);
            var12.field2361.method5123(arg1);
            field695.method2155(var12);
            class227 var13 = class227.method3345(arg1);
            if (var13.field2600 != null && var13.field2600[0][0] == 5) {
                int var14 = var13.field2600[0][1];
                class222.field2542[var14] = 1 - class222.field2542[var14];
                method2134(var14);
            }
        }
        if (arg2 == 1004) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            class197 var15 = class197.method1128(class193.field2314, field695.field1329);
            var15.field2361.method5151(arg3);
            field695.method2155(var15);
        }
        if (arg2 == 45) {
            class76 var16 = field765[arg3];
            if (var16 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var17 = class197.method1128(class193.field2239, field695.field1329);
                var17.field2361.method5334(arg3);
                var17.field2361.method5142(class55.field417[82] ? 1 : 0);
                field695.method2155(var17);
            }
        }
        if (arg2 == 1005) {
            class227 var18 = class227.method3345(arg1);
            if (var18 == null || var18.field2712[arg0] < 100000) {
                class197 var19 = class197.method1128(class193.field2314, field695.field1329);
                var19.field2361.method5151(arg3);
                field695.method2155(var19);
            } else {
                Statics.method3809(27, "", var18.field2712[arg0] + " x " + class266.method1102(arg3).field3445);
            }
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 30 && field823 == null) {
            method2136(arg1, arg0);
            field823 = class227.method1975(arg1, arg0);
            method3344(field823);
        }
        if (arg2 == 21) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var20 = class197.method1128(class193.field2249, field695.field1329);
            var20.field2361.method5099(Statics.field3157 + arg0);
            var20.field2361.method5151(arg3);
            var20.field2361.method5334(Statics.field301 + arg1);
            var20.field2361.method5095(class55.field417[82] ? 1 : 0);
            field695.method2155(var20);
        }
        if (arg2 == 40) {
            class197 var21 = class197.method1128(class193.field2265, field695.field1329);
            var21.field2361.method5099(arg3);
            var21.field2361.method5312(arg0);
            var21.field2361.method5123(arg1);
            field695.method2155(var21);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 22) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var22 = class197.method1128(class193.field2306, field695.field1329);
            var22.field2361.method5099(arg3);
            var22.field2361.method5141(class55.field417[82] ? 1 : 0);
            var22.field2361.method5099(Statics.field301 + arg1);
            var22.field2361.method5334(Statics.field3157 + arg0);
            field695.method2155(var22);
        }
        if (arg2 == 32) {
            class197 var23 = class197.method1128(class193.field2328, field695.field1329);
            var23.field2361.method5099(arg3);
            var23.field2361.method5099(arg0);
            var23.field2361.method5151(field805);
            var23.field2361.method5161(Statics.field494);
            var23.field2361.method5160(arg1);
            field695.method2155(var23);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 14) {
            class76 var24 = field765[arg3];
            if (var24 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var25 = class197.method1128(class193.field2284, field695.field1329);
                var25.field2361.method5142(class55.field417[82] ? 1 : 0);
                var25.field2361.method5161(Statics.field141);
                var25.field2361.method5334(Statics.field1323);
                var25.field2361.method5312(arg3);
                var25.field2361.method5099(Statics.field380);
                field695.method2155(var25);
            }
        }
        if (arg2 == 5) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var26 = class197.method1128(class193.field2268, field695.field1329);
            var26.field2361.method5334(Statics.field301 + arg1);
            var26.field2361.method5142(class55.field417[82] ? 1 : 0);
            var26.field2361.method5312(arg3);
            var26.field2361.method5151(Statics.field3157 + arg0);
            field695.method2155(var26);
        }
        if (arg2 == 16) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var27 = class197.method1128(class193.field2264, field695.field1329);
            var27.field2361.method5160(Statics.field141);
            var27.field2361.method5334(Statics.field3157 + arg0);
            var27.field2361.method5312(Statics.field380);
            var27.field2361.method5312(Statics.field301 + arg1);
            var27.field2361.method5151(Statics.field1323);
            var27.field2361.method5334(arg3);
            var27.field2361.method5095(class55.field417[82] ? 1 : 0);
            field695.method2155(var27);
        }
        if (arg2 == 43) {
            class197 var28 = class197.method1128(class193.field2258, field695.field1329);
            var28.field2361.method5334(arg3);
            var28.field2361.method5334(arg0);
            var28.field2361.method5161(arg1);
            field695.method2155(var28);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 34) {
            class197 var29 = class197.method1128(class193.field2326, field695.field1329);
            var29.field2361.method5099(arg0);
            var29.field2361.method5312(arg3);
            var29.field2361.method5160(arg1);
            field695.method2155(var29);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 29) {
            class197 var30 = class197.method1128(class193.field2288, field695.field1329);
            var30.field2361.method5123(arg1);
            field695.method2155(var30);
            class227 var31 = class227.method3345(arg1);
            if (var31.field2600 != null && var31.field2600[0][0] == 5) {
                int var32 = var31.field2600[0][1];
                if (class222.field2542[var32] != var31.field2707[0]) {
                    class222.field2542[var32] = var31.field2707[0];
                    method2134(var32);
                }
            }
        }
        if (arg2 == 33) {
            class197 var33 = class197.method1128(class193.field2285, field695.field1329);
            var33.field2361.method5099(arg0);
            var33.field2361.method5160(arg1);
            var33.field2361.method5151(arg3);
            field695.method2155(var33);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 1001) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var34 = class197.method1128(class193.field2272, field695.field1329);
            var34.field2361.method5142(class55.field417[82] ? 1 : 0);
            var34.field2361.method5312(Statics.field301 + arg1);
            var34.field2361.method5312(Statics.field3157 + arg0);
            var34.field2361.method5099(arg3);
            field695.method2155(var34);
        }
        if (arg2 == 10) {
            class89 var35 = field690[arg3];
            if (var35 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var36 = class197.method1128(class193.field2247, field695.field1329);
                var36.field2361.method5334(arg3);
                var36.field2361.method5143(class55.field417[82] ? 1 : 0);
                field695.method2155(var36);
            }
        }
        if (arg2 == 26) {
            method3366();
        }
        if (arg2 == 24) {
            class227 var37 = class227.method3345(arg1);
            boolean var38 = true;
            if (var37.field2696 > 0) {
                var38 = method1677(var37);
            }
            if (var38) {
                class197 var39 = class197.method1128(class193.field2288, field695.field1329);
                var39.field2361.method5123(arg1);
                field695.method2155(var39);
            }
        }
        if (arg2 == 38) {
            method618();
            class227 var40 = class227.method3345(arg1);
            field802 = 1;
            Statics.field1323 = arg0;
            Statics.field141 = arg1;
            Statics.field380 = arg3;
            method3344(var40);
            field745 = class91.method200(16748608) + class266.method1102(arg3).field3445 + class91.method200(16777215);
            if (field745 == null) {
                field745 = class234.field2792;
            }
            return;
        }
        if (arg2 == 46) {
            class76 var41 = field765[arg3];
            if (var41 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var42 = class197.method1128(class193.field2279, field695.field1329);
                var42.field2361.method5099(arg3);
                var42.field2361.method5141(class55.field417[82] ? 1 : 0);
                field695.method2155(var42);
            }
        }
        if (arg2 == 18) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var43 = class197.method1128(class193.field2312, field695.field1329);
            var43.field2361.method5099(Statics.field3157 + arg0);
            var43.field2361.method5099(arg3);
            var43.field2361.method5099(Statics.field301 + arg1);
            var43.field2361.method5142(class55.field417[82] ? 1 : 0);
            field695.method2155(var43);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var44 = class227.method1975(arg1, arg0);
            if (var44 != null) {
                method22(arg3, arg1, arg0, var44.field2713, arg5);
            }
        }
        if (arg2 == 12) {
            class89 var45 = field690[arg3];
            if (var45 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var46 = class197.method1128(class193.field2310, field695.field1329);
                var46.field2361.method5143(class55.field417[82] ? 1 : 0);
                var46.field2361.method5151(arg3);
                field695.method2155(var46);
            }
        }
        if (arg2 == 7) {
            class89 var47 = field690[arg3];
            if (var47 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var48 = class197.method1128(class193.field2259, field695.field1329);
                var48.field2361.method5161(Statics.field141);
                var48.field2361.method5334(arg3);
                var48.field2361.method5312(Statics.field1323);
                var48.field2361.method5142(class55.field417[82] ? 1 : 0);
                var48.field2361.method5099(Statics.field380);
                field695.method2155(var48);
            }
        }
        if (arg2 == 1003) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            class89 var49 = field690[arg3];
            if (var49 != null) {
                class268 var50 = var49.field1136;
                if (var50.field3525 != null) {
                    var50 = var50.method4392();
                }
                if (var50 != null) {
                    class197 var51 = class197.method1128(class193.field2289, field695.field1329);
                    var51.field2361.method5312(var50.field3532);
                    field695.method2155(var51);
                }
            }
        }
        if (arg2 == 47) {
            class76 var52 = field765[arg3];
            if (var52 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var53 = class197.method1128(class193.field2313, field695.field1329);
                var53.field2361.method5334(arg3);
                var53.field2361.method5141(class55.field417[82] ? 1 : 0);
                field695.method2155(var53);
            }
        }
        if (arg2 == 48) {
            class76 var54 = field765[arg3];
            if (var54 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var55 = class197.method1128(class193.field2254, field695.field1329);
                var55.field2361.method5142(class55.field417[82] ? 1 : 0);
                var55.field2361.method5151(arg3);
                field695.method2155(var55);
            }
        }
        if (arg2 == 4) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var56 = class197.method1128(class193.field2311, field695.field1329);
            var56.field2361.method5099(arg3);
            var56.field2361.method5312(Statics.field3157 + arg0);
            var56.field2361.method5142(class55.field417[82] ? 1 : 0);
            var56.field2361.method5151(Statics.field301 + arg1);
            field695.method2155(var56);
        }
        if (arg2 == 51) {
            class76 var57 = field765[arg3];
            if (var57 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var58 = class197.method1128(class193.field2283, field695.field1329);
                var58.field2361.method5143(class55.field417[82] ? 1 : 0);
                var58.field2361.method5099(arg3);
                field695.method2155(var58);
            }
        }
        if (arg2 == 8) {
            class89 var59 = field690[arg3];
            if (var59 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var60 = class197.method1128(class193.field2275, field695.field1329);
                var60.field2361.method5312(arg3);
                var60.field2361.method5334(field805);
                var60.field2361.method5160(Statics.field494);
                var60.field2361.method5141(class55.field417[82] ? 1 : 0);
                field695.method2155(var60);
            }
        }
        if (arg2 == 3) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var61 = class197.method1128(class193.field2294, field695.field1329);
            var61.field2361.method5334(Statics.field3157 + arg0);
            var61.field2361.method5095(class55.field417[82] ? 1 : 0);
            var61.field2361.method5099(Statics.field301 + arg1);
            var61.field2361.method5334(arg3);
            field695.method2155(var61);
        }
        if (arg2 == 11) {
            class89 var62 = field690[arg3];
            if (var62 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var63 = class197.method1128(class193.field2237, field695.field1329);
                var63.field2361.method5141(class55.field417[82] ? 1 : 0);
                var63.field2361.method5099(arg3);
                field695.method2155(var63);
            }
        }
        if (arg2 == 49) {
            class76 var64 = field765[arg3];
            if (var64 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var65 = class197.method1128(class193.field2243, field695.field1329);
                var65.field2361.method5141(class55.field417[82] ? 1 : 0);
                var65.field2361.method5151(arg3);
                field695.method2155(var65);
            }
        }
        if (arg2 == 19) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var66 = class197.method1128(class193.field2318, field695.field1329);
            var66.field2361.method5099(Statics.field301 + arg1);
            var66.field2361.method5143(class55.field417[82] ? 1 : 0);
            var66.field2361.method5312(arg3);
            var66.field2361.method5099(Statics.field3157 + arg0);
            field695.method2155(var66);
        }
        if (arg2 == 31) {
            class197 var67 = class197.method1128(class193.field2296, field695.field1329);
            var67.field2361.method5099(Statics.field380);
            var67.field2361.method5099(arg3);
            var67.field2361.method5099(Statics.field1323);
            var67.field2361.method5161(Statics.field141);
            var67.field2361.method5099(arg0);
            var67.field2361.method5123(arg1);
            field695.method2155(var67);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 50) {
            class76 var68 = field765[arg3];
            if (var68 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var69 = class197.method1128(class193.field2269, field695.field1329);
                var69.field2361.method5151(arg3);
                var69.field2361.method5143(class55.field417[82] ? 1 : 0);
                field695.method2155(var69);
            }
        }
        if (arg2 == 1002) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            class197 var70 = class197.method1128(class193.field2322, field695.field1329);
            var70.field2361.method5312(arg3);
            field695.method2155(var70);
        }
        if (arg2 == 44) {
            class76 var71 = field765[arg3];
            if (var71 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var72 = class197.method1128(class193.field2261, field695.field1329);
                var72.field2361.method5141(class55.field417[82] ? 1 : 0);
                var72.field2361.method5334(arg3);
                field695.method2155(var72);
            }
        }
        if (arg2 == 20) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var73 = class197.method1128(class193.field2255, field695.field1329);
            var73.field2361.method5151(Statics.field301 + arg1);
            var73.field2361.method5141(class55.field417[82] ? 1 : 0);
            var73.field2361.method5151(Statics.field3157 + arg0);
            var73.field2361.method5312(arg3);
            field695.method2155(var73);
        }
        if (arg2 == 42) {
            class197 var74 = class197.method1128(class193.field2316, field695.field1329);
            var74.field2361.method5334(arg0);
            var74.field2361.method5334(arg3);
            var74.field2361.method5160(arg1);
            field695.method2155(var74);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 36) {
            class197 var75 = class197.method1128(class193.field2266, field695.field1329);
            var75.field2361.method5334(arg0);
            var75.field2361.method5161(arg1);
            var75.field2361.method5099(arg3);
            field695.method2155(var75);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 15) {
            class76 var76 = field765[arg3];
            if (var76 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var77 = class197.method1128(class193.field2257, field695.field1329);
                var77.field2361.method5099(arg3);
                var77.field2361.method5141(class55.field417[82] ? 1 : 0);
                var77.field2361.method5312(field805);
                var77.field2361.method5123(Statics.field494);
                field695.method2155(var77);
            }
        }
        if (arg2 == 37) {
            class197 var78 = class197.method1128(class193.field2230, field695.field1329);
            var78.field2361.method5291(arg1);
            var78.field2361.method5312(arg0);
            var78.field2361.method5099(arg3);
            field695.method2155(var78);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 23) {
            if (field785) {
                Statics.field537.method3062();
            } else {
                Statics.field537.method2966(Statics.field1950, arg0, arg1, true);
            }
        }
        if (arg2 == 39) {
            class197 var79 = class197.method1128(class193.field2331, field695.field1329);
            var79.field2361.method5151(arg3);
            var79.field2361.method5291(arg1);
            var79.field2361.method5151(arg0);
            field695.method2155(var79);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (arg2 == 9) {
            class89 var80 = field690[arg3];
            if (var80 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var81 = class197.method1128(class193.field2263, field695.field1329);
                var81.field2361.method5151(arg3);
                var81.field2361.method5143(class55.field417[82] ? 1 : 0);
                field695.method2155(var81);
            }
        }
        if (arg2 == 6) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var82 = class197.method1128(class193.field2325, field695.field1329);
            var82.field2361.method5151(Statics.field301 + arg1);
            var82.field2361.method5151(arg3);
            var82.field2361.method5151(Statics.field3157 + arg0);
            var82.field2361.method5142(class55.field417[82] ? 1 : 0);
            field695.method2155(var82);
        }
        if (arg2 == 1) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var83 = class197.method1128(class193.field2280, field695.field1329);
            var83.field2361.method5151(Statics.field380);
            var83.field2361.method5151(Statics.field301 + arg1);
            var83.field2361.method5151(Statics.field1323);
            var83.field2361.method5334(Statics.field3157 + arg0);
            var83.field2361.method5123(Statics.field141);
            var83.field2361.method5099(arg3);
            var83.field2361.method5143(class55.field417[82] ? 1 : 0);
            field695.method2155(var83);
        }
        if (arg2 == 2) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var84 = class197.method1128(class193.field2238, field695.field1329);
            var84.field2361.method5312(Statics.field3157 + arg0);
            var84.field2361.method5099(field805);
            var84.field2361.method5099(Statics.field301 + arg1);
            var84.field2361.method5123(Statics.field494);
            var84.field2361.method5141(class55.field417[82] ? 1 : 0);
            var84.field2361.method5099(arg3);
            field695.method2155(var84);
        }
        if (arg2 == 17) {
            field750 = arg6;
            field768 = arg7;
            field753 = 2;
            field751 = 0;
            field775 = arg0;
            field881 = arg1;
            class197 var85 = class197.method1128(class193.field2282, field695.field1329);
            var85.field2361.method5334(Statics.field301 + arg1);
            var85.field2361.method5334(Statics.field3157 + arg0);
            var85.field2361.method5334(field805);
            var85.field2361.method5151(arg3);
            var85.field2361.method5095(class55.field417[82] ? 1 : 0);
            var85.field2361.method5161(Statics.field494);
            field695.method2155(var85);
        }
        if (arg2 == 13) {
            class89 var86 = field690[arg3];
            if (var86 != null) {
                field750 = arg6;
                field768 = arg7;
                field753 = 2;
                field751 = 0;
                field775 = arg0;
                field881 = arg1;
                class197 var87 = class197.method1128(class193.field2277, field695.field1329);
                var87.field2361.method5142(class55.field417[82] ? 1 : 0);
                var87.field2361.method5312(arg3);
                field695.method2155(var87);
            }
        }
        if (arg2 == 41) {
            class197 var88 = class197.method1128(class193.field2295, field695.field1329);
            var88.field2361.method5151(arg3);
            var88.field2361.method5123(arg1);
            var88.field2361.method5312(arg0);
            field695.method2155(var88);
            field755 = 0;
            Statics.field1132 = class227.method3345(arg1);
            field882 = arg0;
        }
        if (field802 != 0) {
            field802 = 0;
            method3344(class227.method3345(Statics.field141));
        }
        if (field804) {
            method618();
        }
        if (Statics.field1132 != null && field755 == 0) {
            method3344(Statics.field1132);
        }
    }

    @ObfuscatedName("em.im(ILjava/lang/String;B)V")
    public static void method2701(int arg0, String arg1) {
        int var2 = class99.field1264;
        int[] var3 = class99.field1269;
        boolean var4 = false;
        class294 var5 = new class294(arg1, Statics.field93);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field765[var3[var6]];
            if (var7 != null && Statics.field2563 != var7 && var7.field620 != null && var7.field620.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method1128(class193.field2261, field695.field1329);
                    var8.field2361.method5141(0);
                    var8.field2361.method5334(var3[var6]);
                    field695.method2155(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method1128(class193.field2313, field695.field1329);
                    var9.field2361.method5334(var3[var6]);
                    var9.field2361.method5141(0);
                    field695.method2155(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method1128(class193.field2243, field695.field1329);
                    var10.field2361.method5141(0);
                    var10.field2361.method5151(var3[var6]);
                    field695.method2155(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method1128(class193.field2269, field695.field1329);
                    var11.field2361.method5151(var3[var6]);
                    var11.field2361.method5143(0);
                    field695.method2155(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            Statics.method3809(4, "", class234.field2937 + arg1);
        }
    }

    @ObfuscatedName("gs.iz(IIIII)V")
    public static void method3379(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method1975(arg0, arg1);
        if (var4 != null && var4.field2684 != null) {
            class72 var5 = new class72();
            var5.field572 = var4;
            var5.field573 = var4.field2684;
            class86.method197(var5);
        }
        field837 = arg3;
        field804 = true;
        Statics.field494 = arg0;
        field805 = arg1;
        Statics.field638 = arg2;
        method3344(var4);
    }

    @ObfuscatedName("ai.it(I)V")
    public static void method618() {
        if (!field804) {
            return;
        }
        class227 var0 = class227.method1975(Statics.field494, field805);
        if (var0 != null && var0.field2585 != null) {
            class72 var1 = new class72();
            var1.field572 = var0;
            var1.field573 = var0.field2585;
            class86.method197(var1);
        }
        field804 = false;
        method3344(var0);
    }

    @ObfuscatedName("cn.ix(III)V")
    public static void method2136(int arg0, int arg1) {
        class197 var2 = class197.method1128(class193.field2267, field695.field1329);
        var2.field2361.method5123(arg0);
        var2.field2361.method5099(arg1);
        field695.method2155(var2);
    }

    @ObfuscatedName("w.is(IIIILjava/lang/String;I)V")
    public static void method22(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method1975(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2614 != null) {
            class72 var6 = new class72();
            var6.field572 = var5;
            var6.field575 = arg0;
            var6.field579 = arg4;
            var6.field573 = var5.field2614;
            class86.method197(var6);
        }
        boolean var7 = true;
        if (var5.field2696 > 0) {
            var7 = method1677(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3108(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class197 var11 = class197.method1128(class193.field2241, field695.field1329);
            var11.field2361.method5123(arg1);
            var11.field2361.method5099(arg2);
            var11.field2361.method5099(arg3);
            field695.method2155(var11);
        }
        if (arg0 == 2) {
            class197 var12 = class197.method1128(class193.field2287, field695.field1329);
            var12.field2361.method5123(arg1);
            var12.field2361.method5099(arg2);
            var12.field2361.method5099(arg3);
            field695.method2155(var12);
        }
        if (arg0 == 3) {
            class197 var13 = class197.method1128(class193.field2250, field695.field1329);
            var13.field2361.method5123(arg1);
            var13.field2361.method5099(arg2);
            var13.field2361.method5099(arg3);
            field695.method2155(var13);
        }
        if (arg0 == 4) {
            class197 var14 = class197.method1128(class193.field2321, field695.field1329);
            var14.field2361.method5123(arg1);
            var14.field2361.method5099(arg2);
            var14.field2361.method5099(arg3);
            field695.method2155(var14);
        }
        if (arg0 == 5) {
            class197 var15 = class197.method1128(class193.field2248, field695.field1329);
            var15.field2361.method5123(arg1);
            var15.field2361.method5099(arg2);
            var15.field2361.method5099(arg3);
            field695.method2155(var15);
        }
        if (arg0 == 6) {
            class197 var16 = class197.method1128(class193.field2290, field695.field1329);
            var16.field2361.method5123(arg1);
            var16.field2361.method5099(arg2);
            var16.field2361.method5099(arg3);
            field695.method2155(var16);
        }
        if (arg0 == 7) {
            class197 var17 = class197.method1128(class193.field2317, field695.field1329);
            var17.field2361.method5123(arg1);
            var17.field2361.method5099(arg2);
            var17.field2361.method5099(arg3);
            field695.method2155(var17);
        }
        if (arg0 == 8) {
            class197 var18 = class197.method1128(class193.field2253, field695.field1329);
            var18.field2361.method5123(arg1);
            var18.field2361.method5099(arg2);
            var18.field2361.method5099(arg3);
            field695.method2155(var18);
        }
        if (arg0 == 9) {
            class197 var19 = class197.method1128(class193.field2308, field695.field1329);
            var19.field2361.method5123(arg1);
            var19.field2361.method5099(arg2);
            var19.field2361.method5099(arg3);
            field695.method2155(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var20 = class197.method1128(class193.field2232, field695.field1329);
        var20.field2361.method5123(arg1);
        var20.field2361.method5099(arg2);
        var20.field2361.method5099(arg3);
        field695.method2155(var20);
    }

    @ObfuscatedName("eb.iy(I)V")
    public static final void method2838() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field786 - 1; var1++) {
                if (field845[var1] < 1000 && field845[var1 + 1] > 1000) {
                    String var2 = field792[var1];
                    field792[var1] = field792[var1 + 1];
                    field792[var1 + 1] = var2;
                    String var3 = field791[var1];
                    field791[var1] = field791[var1 + 1];
                    field791[var1 + 1] = var3;
                    int var4 = field845[var1];
                    field845[var1] = field845[var1 + 1];
                    field845[var1 + 1] = var4;
                    int var5 = field787[var1];
                    field787[var1] = field787[var1 + 1];
                    field787[var1 + 1] = var5;
                    int var6 = field788[var1];
                    field788[var1] = field788[var1 + 1];
                    field788[var1 + 1] = var6;
                    int var7 = field790[var1];
                    field790[var1] = field790[var1 + 1];
                    field790[var1 + 1] = var7;
                    boolean var8 = field793[var1];
                    field793[var1] = field793[var1 + 1];
                    field793[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("am.ir(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method506(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        Statics.method539(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("aq.iw(I)I")
    public static final int method405() {
        return field786 - 1;
    }

    @ObfuscatedName("af.if(I)V")
    public static void method661() {
        for (int var0 = 0; var0 < field786; var0++) {
            if (method552(field845[var0])) {
                if (var0 < field786 - 1) {
                    for (int var1 = var0; var1 < field786 - 1; var1++) {
                        field791[var1] = field791[var1 + 1];
                        field792[var1] = field792[var1 + 1];
                        field845[var1] = field845[var1 + 1];
                        field790[var1] = field790[var1 + 1];
                        field787[var1] = field787[var1 + 1];
                        field788[var1] = field788[var1 + 1];
                        field793[var1] = field793[var1 + 1];
                    }
                }
                var0--;
                field786--;
            }
        }
        method3247(Statics.field1929 / 2 + Statics.field3632, Statics.field1316);
    }

    @ObfuscatedName("aw.ie(II)Z")
    public static boolean method552(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bo.iu(II)Ljava/lang/String;")
    public static String method1109(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field792[arg0].length() > 0) {
            return field791[arg0] + class234.field2948 + field792[arg0];
        } else {
            return field791[arg0];
        }
    }

    @ObfuscatedName("ix.iv(IIIII)V")
    public static final void method3999(int arg0, int arg1, int arg2, int arg3) {
        if (field802 == 0 && !field804) {
            method506(class234.field2943, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class138.field1764;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class138.method3373(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class76 var14 = field765[field815];
                    Statics.method2703(var14, field815, var11, var12);
                }
                return;
            }
            long var15 = class138.field1769[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class138.method1756(var8);
                    int var20 = class138.method1049(var8);
                    int var21 = class138.method3727(class138.field1769[var8]);
                    int var23 = class138.method3119(class138.field1769[var8]);
                    int var24 = var23;
                    if (var21 == 2 && Statics.field537.method2937(Statics.field1950, var19, var20, var15) >= 0) {
                        class265 var25 = class265.method325(var23);
                        if (var25.field3422 != null) {
                            var25 = var25.method4263();
                        }
                        if (var25 == null) {
                            break label277;
                        }
                        if (field802 == 1) {
                            method506(class234.field2938, field745 + " " + class91.field1153 + " " + class91.method200(65535) + var25.field3395, 1, var23, var19, var20);
                        } else if (!field804) {
                            String[] var26 = var25.field3408;
                            if (var26 != null) {
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26[var27] != null) {
                                        short var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 3;
                                        }
                                        if (var27 == 1) {
                                            var28 = 4;
                                        }
                                        if (var27 == 2) {
                                            var28 = 5;
                                        }
                                        if (var27 == 3) {
                                            var28 = 6;
                                        }
                                        if (var27 == 4) {
                                            var28 = 1001;
                                        }
                                        method506(var26[var27], class91.method200(65535) + var25.field3395, var28, var24, var19, var20);
                                    }
                                }
                            }
                            method506(class234.field2983, class91.method200(65535) + var25.field3395, 1002, var25.field3388, var19, var20);
                        } else if ((Statics.field638 & 0x4) == 4) {
                            method506(field852, field808 + " " + class91.field1153 + " " + class91.method200(65535) + var25.field3395, 2, var23, var19, var20);
                        }
                    }
                    if (var21 == 1) {
                        class89 var29 = field690[var24];
                        if (var29 == null) {
                            break label277;
                        }
                        if (var29.field1136.field3501 == 1 && (var29.field991 & 0x7F) == 64 && (var29.field939 & 0x7F) == 64) {
                            for (int var30 = 0; var30 < field691; var30++) {
                                class89 var31 = field690[field692[var30]];
                                if (var31 != null && var29 != var31 && var31.field1136.field3501 == 1 && var29.field991 == var31.field991 && var29.field939 == var31.field939) {
                                    method2027(var31.field1136, field692[var30], var19, var20);
                                }
                            }
                            int var32 = class99.field1264;
                            int[] var33 = class99.field1269;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class76 var35 = field765[var33[var34]];
                                if (var35 != null && var29.field991 == var35.field991 && var29.field939 == var35.field939) {
                                    Statics.method2703(var35, var33[var34], var19, var20);
                                }
                            }
                        }
                        method2027(var29.field1136, var24, var19, var20);
                    }
                    if (var21 == 0) {
                        class76 var36 = field765[var24];
                        if (var36 == null) {
                            break label277;
                        }
                        if ((var36.field991 & 0x7F) == 64 && (var36.field939 & 0x7F) == 64) {
                            for (int var37 = 0; var37 < field691; var37++) {
                                class89 var38 = field690[field692[var37]];
                                if (var38 != null && var38.field1136.field3501 == 1 && var36.field991 == var38.field991 && var36.field939 == var38.field939) {
                                    method2027(var38.field1136, field692[var37], var19, var20);
                                }
                            }
                            int var39 = class99.field1264;
                            int[] var40 = class99.field1269;
                            for (int var41 = 0; var41 < var39; var41++) {
                                class76 var42 = field765[var40[var41]];
                                if (var42 != null && var36 != var42 && var36.field991 == var42.field991 && var36.field939 == var42.field939) {
                                    Statics.method2703(var42, var40[var41], var19, var20);
                                }
                            }
                        }
                        if (field815 == var24) {
                            var4 = var15;
                        } else {
                            Statics.method2703(var36, var24, var19, var20);
                        }
                    }
                    if (var21 == 3) {
                        class273 var43 = field777[Statics.field1950][var19][var20];
                        if (var43 != null) {
                            for (class97 var44 = (class97) var43.method4544(); var44 != null; var44 = (class97) var43.method4554()) {
                                class266 var45 = class266.method1102(var44.field1239);
                                if (field802 == 1) {
                                    method506(class234.field2938, field745 + " " + class91.field1153 + " " + class91.method200(16748608) + var45.field3445, 16, var44.field1239, var19, var20);
                                } else if (!field804) {
                                    String[] var46 = var45.field3459;
                                    for (int var47 = 4; var47 >= 0; var47--) {
                                        if (var46 != null && var46[var47] != null) {
                                            byte var48 = 0;
                                            if (var47 == 0) {
                                                var48 = 18;
                                            }
                                            if (var47 == 1) {
                                                var48 = 19;
                                            }
                                            if (var47 == 2) {
                                                var48 = 20;
                                            }
                                            if (var47 == 3) {
                                                var48 = 21;
                                            }
                                            if (var47 == 4) {
                                                var48 = 22;
                                            }
                                            method506(var46[var47], class91.method200(16748608) + var45.field3445, var48, var44.field1239, var19, var20);
                                        } else if (var47 == 2) {
                                            method506(class234.field2785, class91.method200(16748608) + var45.field3445, 20, var44.field1239, var19, var20);
                                        }
                                    }
                                    method506(class234.field2983, class91.method200(16748608) + var45.field3445, 1004, var44.field1239, var19, var20);
                                } else if ((Statics.field638 & 0x1) == 1) {
                                    method506(field852, field808 + " " + class91.field1153 + " " + class91.method200(16748608) + var45.field3445, 17, var44.field1239, var19, var20);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("ct.jl(Ljd;IIIS)V")
    public static final void method2027(class268 arg0, int arg1, int arg2, int arg3) {
        if (field786 >= 400) {
            return;
        }
        if (arg0.field3525 != null) {
            arg0 = arg0.method4392();
        }
        if (arg0 == null || !arg0.field3528 || arg0.field3530 && field819 != arg1) {
            return;
        }
        String var4 = arg0.field3500;
        if (arg0.field3517 != 0) {
            int var6 = arg0.field3517;
            int var7 = Statics.field2563.field612;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class91.method200(16711680);
            } else if (var8 < -6) {
                var9 = class91.method200(16723968);
            } else if (var8 < -3) {
                var9 = class91.method200(16740352);
            } else if (var8 < 0) {
                var9 = class91.method200(16756736);
            } else if (var8 > 9) {
                var9 = class91.method200(65280);
            } else if (var8 > 6) {
                var9 = class91.method200(4259584);
            } else if (var8 > 3) {
                var9 = class91.method200(8453888);
            } else if (var8 > 0) {
                var9 = class91.method200(12648192);
            } else {
                var9 = class91.method200(16776960);
            }
            var4 = var4 + var9 + " " + class91.field1155 + class234.field2944 + arg0.field3517 + class91.field1154;
        }
        if (arg0.field3530 && field794) {
            method506(class234.field2983, class91.method200(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field802 == 1) {
            method506(class234.field2938, field745 + " " + class91.field1153 + " " + class91.method200(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field804) {
            int var10 = arg0.field3530 && field794 ? 2000 : 0;
            String[] var11 = arg0.field3529;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class234.field2940)) {
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
                        method506(var11[var12], class91.method200(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class234.field2940)) {
                        short var15 = 0;
                        if (field673 != class94.field1178) {
                            if (field673 == class94.field1176 || field673 == class94.field1177 && arg0.field3517 > Statics.field2563.field612) {
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
                            method506(var11[var14], class91.method200(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3530 || !field794) {
                method506(class234.field2983, class91.method200(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field638 & 0x2) == 2) {
            method506(field852, field808 + " " + class91.field1153 + " " + class91.method200(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bs.jx(IIIIIIIIB)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method545(arg0)) {
            Statics.field2391 = null;
            method4938(Statics.field45[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2391 != null) {
                method4938(Statics.field2391, -1412584499, arg1, arg2, arg3, arg4, Statics.field924, Statics.field1894, arg7);
                Statics.field2391 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field902[var8] = true;
            }
        } else {
            field902[arg7] = true;
        }
    }

    @ObfuscatedName("kr.je([Lhe;IIIIIIIIB)V")
    public static final void method4938(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class332.method5573(arg2, arg3, arg4, arg5);
        class140.method2907();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2671 == arg1 || arg1 == -1412584499 && field822 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field857[field825] = var10.field2695 + arg6;
                    field918[field825] = var10.field2601 + arg7;
                    field859[field825] = var10.field2602;
                    field809[field825] = var10.field2603;
                    var11 = ++field825 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2724 = var11;
                var10.field2597 = field656;
                if (!var10.field2586 || !method775(var10)) {
                    if (var10.field2696 > 0) {
                        method4634(var10);
                    }
                    int var12 = var10.field2695 + arg6;
                    int var13 = var10.field2601 + arg7;
                    int var14 = var10.field2653;
                    if (field822 == var10) {
                        if (arg1 != -1412584499 && !var10.field2672) {
                            Statics.field2391 = arg0;
                            Statics.field924 = arg6;
                            Statics.field1894 = arg7;
                            continue;
                        }
                        if (field801 && field860) {
                            int var15 = class64.field493;
                            int var16 = class64.field500;
                            int var17 = var15 - field824;
                            int var18 = var16 - field810;
                            if (var17 < field828) {
                                var17 = field828;
                            }
                            if (var10.field2602 + var17 > field828 + field833.field2602) {
                                var17 = field828 + field833.field2602 - var10.field2602;
                            }
                            if (var18 < field717) {
                                var18 = field717;
                            }
                            if (var10.field2603 + var18 > field717 + field833.field2603) {
                                var18 = field717 + field833.field2603 - var10.field2603;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2672) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2589 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2589 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2602 + var12;
                        int var26 = var10.field2603 + var13;
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
                        int var29 = var10.field2602 + var12;
                        int var30 = var10.field2603 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2586 || var19 < var21 && var20 < var22) {
                        if (var10.field2696 != 0) {
                            if (var10.field2696 == 1336) {
                                if (field783) {
                                    var13 += 15;
                                    Statics.field138.method4968("Fps:" + field458, var10.field2602 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field911) {
                                        var33 = 16711680;
                                    }
                                    Statics.field138.method4968("Mem:" + var32 + "k", var10.field2602 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2696 == 1337) {
                                field798 = var12;
                                field799 = var13;
                                method2038(var12, var13, var10.field2602, var10.field2603);
                                field902[var10.field2724] = true;
                                class332.method5573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2696 == 1338) {
                                method3633(var10, var12, var13, var11);
                                class332.method5573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2696 == 1339) {
                                method2098(var10, var12, var13, var11);
                                class332.method5573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2696 == 1400) {
                                Statics.field199.method5897(var12, var13, var10.field2602, var10.field2603, field656);
                            }
                            if (var10.field2696 == 1401) {
                                Statics.field199.method5900(var12, var13, var10.field2602, var10.field2603);
                            }
                            if (var10.field2696 == 1402) {
                                Statics.field2.method1730(var12, field656);
                            }
                        }
                        if (var10.field2589 == 0) {
                            if (!var10.field2586 && method775(var10) && Statics.field3351 != var10) {
                                continue;
                            }
                            if (!var10.field2586) {
                                if (var10.field2609 > var10.field2640 - var10.field2603) {
                                    var10.field2609 = var10.field2640 - var10.field2603;
                                }
                                if (var10.field2609 < 0) {
                                    var10.field2609 = 0;
                                }
                            }
                            method4938(arg0, var10.field2587, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2609, var11);
                            if (var10.field2673 != null) {
                                method4938(var10.field2673, var10.field2587, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2609, var11);
                            }
                            class71 var34 = (class71) field834.method5543((long) var10.field2587);
                            if (var34 != null) {
                                method745(var34.field564, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class332.method5573(arg2, arg3, arg4, arg5);
                            class140.method2907();
                        }
                        if (field669 || field856[var11] || field861 > 1) {
                            if (var10.field2589 == 0 && !var10.field2586 && var10.field2640 > var10.field2603) {
                                method1964(var10.field2602 + var12, var13, var10.field2609, var10.field2603, var10.field2640);
                            }
                            if (var10.field2589 != 1) {
                                if (var10.field2589 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2599; var36++) {
                                        for (int var37 = 0; var37 < var10.field2598; var37++) {
                                            int var38 = (var10.field2708 + 32) * var37 + var12;
                                            int var39 = (var10.field2655 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2656[var35];
                                                var39 += var10.field2657[var35];
                                            }
                                            if (var10.field2705[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2705[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2028 == var10 && field807 == var35) {
                                                    class336 var43;
                                                    if (field802 == 1 && Statics.field1323 == var35 && Statics.field141 == var10.field2587) {
                                                        var43 = class266.method622(var42, var10.field2712[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class266.method622(var42, var10.field2712[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3344(var10);
                                                    } else if (Statics.field2028 == var10 && field807 == var35) {
                                                        int var44 = class64.field493 - field758;
                                                        int var45 = class64.field500 - field759;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field899 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5699(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class332.field3888 && var46.field2609 > 0) {
                                                                int var47 = field851 * (class332.field3888 - var39 - var45) / 3;
                                                                if (var47 > field851 * 10) {
                                                                    var47 = field851 * 10;
                                                                }
                                                                if (var47 > var46.field2609) {
                                                                    var47 = var46.field2609;
                                                                }
                                                                var46.field2609 -= var47;
                                                                field759 += var47;
                                                                method3344(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class332.field3889 && var46.field2609 < var46.field2640 - var46.field2603) {
                                                                int var48 = field851 * (var39 + var45 + 32 - class332.field3889) / 3;
                                                                if (var48 > field851 * 10) {
                                                                    var48 = field851 * 10;
                                                                }
                                                                if (var48 > var46.field2640 - var46.field2603 - var46.field2609) {
                                                                    var48 = var46.field2640 - var46.field2603 - var46.field2609;
                                                                }
                                                                var46.field2609 += var48;
                                                                field759 -= var48;
                                                                method3344(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1132 == var10 && field882 == var35) {
                                                        var43.method5699(var38, var39, 128);
                                                    } else {
                                                        var43.method5688(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2723 != null && var35 < 20) {
                                                class336 var49 = var10.method3734(var35);
                                                if (var49 != null) {
                                                    var49.method5688(var38, var39);
                                                } else if (class227.field2604) {
                                                    method3344(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2589 == 3) {
                                    int var50;
                                    if (Statics.method74(var10)) {
                                        var50 = var10.field2613;
                                        if (Statics.field3351 == var10 && var10.field2615 != 0) {
                                            var50 = var10.field2615;
                                        }
                                    } else {
                                        var50 = var10.field2612;
                                        if (Statics.field3351 == var10 && var10.field2667 != 0) {
                                            var50 = var10.field2667;
                                        }
                                    }
                                    if (var10.field2616) {
                                        switch(var10.field2617.field3903) {
                                            case 1:
                                                class332.method5582(var12, var13, var10.field2602, var10.field2603, var10.field2612, var10.field2613);
                                                break;
                                            case 2:
                                                class332.method5647(var12, var13, var10.field2602, var10.field2603, var10.field2612, var10.field2613, 255 - (var10.field2653 & 0xFF), 255 - (var10.field2637 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class332.method5581(var12, var13, var10.field2602, var10.field2603, var50);
                                                } else {
                                                    class332.method5580(var12, var13, var10.field2602, var10.field2603, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class332.method5585(var12, var13, var10.field2602, var10.field2603, var50);
                                    } else {
                                        class332.method5586(var12, var13, var10.field2602, var10.field2603, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2589 == 4) {
                                    class306 var51 = var10.method3733();
                                    if (var51 != null) {
                                        String var52 = var10.field2648;
                                        int var53;
                                        if (Statics.method74(var10)) {
                                            var53 = var10.field2613;
                                            if (Statics.field3351 == var10 && var10.field2615 != 0) {
                                                var53 = var10.field2615;
                                            }
                                            if (var10.field2649.length() > 0) {
                                                var52 = var10.field2649;
                                            }
                                        } else {
                                            var53 = var10.field2612;
                                            if (Statics.field3351 == var10 && var10.field2667 != 0) {
                                                var53 = var10.field2667;
                                            }
                                        }
                                        if (var10.field2586 && var10.field2713 != -1) {
                                            class266 var54 = class266.method1102(var10.field2713);
                                            var52 = var54.field3445;
                                            if (var52 == null) {
                                                var52 = class234.field2792;
                                            }
                                            if ((var54.field3456 == 1 || var10.field2714 != 1) && var10.field2714 != -1) {
                                                var52 = class91.method200(16748608) + var52 + class91.field1157 + " " + 'x' + method774(var10.field2714);
                                            }
                                        }
                                        if (field823 == var10) {
                                            var52 = class234.field2852;
                                            var53 = var10.field2612;
                                        }
                                        if (!var10.field2586) {
                                            var52 = method3807(var52, var10);
                                        }
                                        var51.method4970(var52, var12, var13, var10.field2602, var10.field2603, var53, var10.field2694 ? 0 : -1, var10.field2651, var10.field2652, var10.field2664);
                                    } else if (class227.field2604) {
                                        method3344(var10);
                                    }
                                } else if (var10.field2589 == 5) {
                                    if (var10.field2586) {
                                        class336 var56;
                                        if (var10.field2713 == -1) {
                                            var56 = var10.method3774(false);
                                        } else {
                                            var56 = class266.method622(var10.field2713, var10.field2714, var10.field2626, var10.field2627, var10.field2645, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3917;
                                            int var58 = var56.field3916;
                                            if (var10.field2625) {
                                                class332.method5574(var12, var13, var10.field2602 + var12, var10.field2603 + var13);
                                                int var59 = (var10.field2602 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2603 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2628 != 0) {
                                                            var56.method5712(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2628, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5688(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5699(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class332.method5573(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2602 * 4096 / var57;
                                                if (var10.field2628 != 0) {
                                                    var56.method5712(var10.field2602 / 2 + var12, var10.field2603 / 2 + var13, var10.field2628, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5726(var12, var13, var10.field2602, var10.field2603, 256 - (var14 & 0xFF));
                                                } else if (var10.field2602 == var57 && var10.field2603 == var58) {
                                                    var56.method5688(var12, var13);
                                                } else {
                                                    var56.method5695(var12, var13, var10.field2602, var10.field2603);
                                                }
                                            }
                                        } else if (class227.field2604) {
                                            method3344(var10);
                                        }
                                    } else {
                                        class336 var55 = var10.method3774(Statics.method74(var10));
                                        if (var55 != null) {
                                            var55.method5688(var12, var13);
                                        } else if (class227.field2604) {
                                            method3344(var10);
                                        }
                                    }
                                } else if (var10.field2589 == 6) {
                                    boolean var64 = Statics.method74(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2635;
                                    } else {
                                        var65 = var10.field2634;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2713 != -1) {
                                        class266 var68 = class266.method1102(var10.field2713);
                                        if (var68 != null) {
                                            class266 var69 = var68.method4298(var10.field2714);
                                            var66 = var69.method4297(1);
                                            if (var66 == null) {
                                                method3344(var10);
                                            } else {
                                                var66.method2744();
                                                var67 = var66.field1895 / 2;
                                            }
                                        }
                                    } else if (var10.field2630 == 5) {
                                        if (var10.field2688 == 0) {
                                            var66 = field910.method3697((class270) null, -1, (class270) null, -1);
                                        } else {
                                            var66 = Statics.field2563.method1198();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3735((class270) null, -1, var64, Statics.field2563.field622);
                                        if (var66 == null && class227.field2604) {
                                            method3344(var10);
                                        }
                                    } else {
                                        class270 var70 = class270.method4174(var65);
                                        var66 = var10.method3735(var70, var10.field2719, var64, Statics.field2563.field622);
                                        if (var66 == null && class227.field2604) {
                                            method3344(var10);
                                        }
                                    }
                                    class140.method2908(var10.field2602 / 2 + var12, var10.field2603 / 2 + var13);
                                    int var71 = var10.field2641 * class140.field1798[var10.field2584] >> 16;
                                    int var72 = var10.field2641 * class140.field1781[var10.field2584] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2586) {
                                            var66.method2744();
                                            if (var10.field2711) {
                                                var66.method2737(0, var10.field2639, var10.field2658, var10.field2584, var10.field2636, var10.field2681 + var67 + var71, var10.field2681 + var72, var10.field2641);
                                            } else {
                                                var66.method2736(0, var10.field2639, var10.field2658, var10.field2584, var10.field2636, var10.field2681 + var67 + var71, var10.field2681 + var72);
                                            }
                                        } else {
                                            var66.method2736(0, var10.field2639, 0, var10.field2584, 0, var71, var72);
                                        }
                                    }
                                    class140.method2914();
                                } else {
                                    if (var10.field2589 == 7) {
                                        class306 var73 = var10.method3733();
                                        if (var73 == null) {
                                            if (class227.field2604) {
                                                method3344(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2599; var75++) {
                                            for (int var76 = 0; var76 < var10.field2598; var76++) {
                                                if (var10.field2705[var74] > 0) {
                                                    class266 var77 = class266.method1102(var10.field2705[var74] - 1);
                                                    String var78;
                                                    if (var77.field3456 != 1 && var10.field2712[var74] == 1) {
                                                        var78 = class91.method200(16748608) + var77.field3445 + class91.field1157;
                                                    } else {
                                                        var78 = class91.method200(16748608) + var77.field3445 + class91.field1157 + " " + 'x' + method774(var10.field2712[var74]);
                                                    }
                                                    int var79 = (var10.field2708 + 115) * var76 + var12;
                                                    int var80 = (var10.field2655 + 12) * var75 + var13;
                                                    if (var10.field2651 == 0) {
                                                        var73.method4956(var78, var79, var80, var10.field2612, var10.field2694 ? 0 : -1);
                                                    } else if (var10.field2651 == 1) {
                                                        var73.method5049(var78, var10.field2602 / 2 + var79, var80, var10.field2612, var10.field2694 ? 0 : -1);
                                                    } else {
                                                        var73.method4968(var78, var10.field2602 + var79 - 1, var80, var10.field2612, var10.field2694 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2589 == 8 && Statics.field2093 == var10 && field800 == field752) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class306 var83 = Statics.field138;
                                        String var84 = var10.field2648;
                                        String var85 = method3807(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class91.field1156);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4961(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3728 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2602 + var12 - 5 - var81;
                                        int var90 = var10.field2603 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class332.method5581(var89, var90, var81, var82, 16777120);
                                        class332.method5585(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2648;
                                        int var92 = var83.field3728 + var90 + 2;
                                        String var93 = method3807(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class91.field1156);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4956(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3728 + 1;
                                        }
                                    }
                                    if (var10.field2589 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2621) {
                                            var96 = var12;
                                            var97 = var10.field2603 + var13;
                                            var98 = var10.field2602 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2602 + var12;
                                            var99 = var10.field2603 + var13;
                                        }
                                        if (var10.field2620 == 1) {
                                            class332.method5591(var96, var97, var98, var99, var10.field2612);
                                        } else {
                                            method70(var96, var97, var98, var99, var10.field2612, var10.field2620);
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

    @ObfuscatedName("p.jm(IIIIIII)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class332.field3891;
        int var18 = arg1 - class332.field3888;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2848(var19, var20, var21);
        class140.method2851(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2848(var19, var21, var22);
        class140.method2851(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("iq.jq(Ljava/lang/String;Lhe;I)Ljava/lang/String;")
    public static String method3807(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method3099(method4143(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("br.jt(II)Ljava/lang/String;")
    public static final String method774(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1151 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method200(65408) + var1.substring(0, var1.length() - 8) + class234.field2805 + " " + class91.field1155 + var1 + class91.field1154 + class91.field1157;
        } else if (var1.length() > 6) {
            return " " + class91.method200(16777215) + var1.substring(0, var1.length() - 4) + class234.field3009 + " " + class91.field1155 + var1 + class91.field1154 + class91.field1157;
        } else {
            return " " + class91.method200(16776960) + var1 + class91.field1157;
        }
    }

    @ObfuscatedName("client.jd(ZB)V")
    public final void method1651(boolean arg0) {
        method598(field874, Statics.field3639, Statics.field1893, arg0);
    }

    @ObfuscatedName("client.jv(Lhe;I)V")
    public void method1542(class227 arg0) {
        class227 var2 = arg0.field2671 == -1 ? null : class227.method3345(arg0.field2671);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3639;
            var4 = Statics.field1893;
        } else {
            var3 = var2.field2602;
            var4 = var2.field2603;
        }
        method2022(arg0, var3, var4, false);
        method72(arg0, var3, var4);
    }

    @ObfuscatedName("bp.jy([Lhe;Lhe;ZB)V")
    public static void method1655(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2610 == 0 ? arg1.field2602 : arg1.field2610;
        int var4 = arg1.field2640 == 0 ? arg1.field2603 : arg1.field2640;
        method1918(arg0, arg1.field2587, var3, var4, arg2);
        if (arg1.field2673 != null) {
            method1918(arg1.field2673, arg1.field2587, var3, var4, arg2);
        }
        class71 var5 = (class71) field834.method5543((long) arg1.field2587);
        if (var5 != null) {
            method598(var5.field564, var3, var4, arg2);
        }
        if (arg1.field2696 == 1337) {
        }
    }

    @ObfuscatedName("ai.ji(IIIZI)V")
    public static final void method598(int arg0, int arg1, int arg2, boolean arg3) {
        if (class227.method545(arg0)) {
            method1918(Statics.field45[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cc.jn([Lhe;IIIZI)V")
    public static void method1918(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2671 == arg1) {
                method2022(var6, arg2, arg3, arg4);
                method72(var6, arg2, arg3);
                if (var6.field2608 > var6.field2610 - var6.field2602) {
                    var6.field2608 = var6.field2610 - var6.field2602;
                }
                if (var6.field2608 < 0) {
                    var6.field2608 = 0;
                }
                if (var6.field2609 > var6.field2640 - var6.field2603) {
                    var6.field2609 = var6.field2640 - var6.field2603;
                }
                if (var6.field2609 < 0) {
                    var6.field2609 = 0;
                }
                if (var6.field2589 == 0) {
                    method1655(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ct.jp(Lhe;IIZB)V")
    public static void method2022(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2602;
        int var5 = arg0.field2603;
        if (arg0.field2594 == 0) {
            arg0.field2602 = arg0.field2598;
        } else if (arg0.field2594 == 1) {
            arg0.field2602 = arg1 - arg0.field2598;
        } else if (arg0.field2594 == 2) {
            arg0.field2602 = arg0.field2598 * arg1 >> 14;
        }
        if (arg0.field2595 == 0) {
            arg0.field2603 = arg0.field2599;
        } else if (arg0.field2595 == 1) {
            arg0.field2603 = arg2 - arg0.field2599;
        } else if (arg0.field2595 == 2) {
            arg0.field2603 = arg0.field2599 * arg2 >> 14;
        }
        if (arg0.field2594 == 4) {
            arg0.field2602 = arg0.field2661 * arg0.field2603 / arg0.field2605;
        }
        if (arg0.field2595 == 4) {
            arg0.field2603 = arg0.field2605 * arg0.field2602 / arg0.field2661;
        }
        if (arg0.field2696 == 1337) {
            field870 = arg0;
        }
        if (arg3 && arg0.field2702 != null && (arg0.field2602 != var4 || arg0.field2603 != var5)) {
            class72 var6 = new class72();
            var6.field572 = arg0;
            var6.field573 = arg0.field2702;
            field848.method4549(var6);
        }
    }

    @ObfuscatedName("p.jj(Lhe;III)V")
    public static void method72(class227 arg0, int arg1, int arg2) {
        if (arg0.field2592 == 0) {
            arg0.field2695 = arg0.field2596;
        } else if (arg0.field2592 == 1) {
            arg0.field2695 = (arg1 - arg0.field2602) / 2 + arg0.field2596;
        } else if (arg0.field2592 == 2) {
            arg0.field2695 = arg1 - arg0.field2602 - arg0.field2596;
        } else if (arg0.field2592 == 3) {
            arg0.field2695 = arg0.field2596 * arg1 >> 14;
        } else if (arg0.field2592 == 4) {
            arg0.field2695 = (arg0.field2596 * arg1 >> 14) + (arg1 - arg0.field2602) / 2;
        } else {
            arg0.field2695 = arg1 - arg0.field2602 - (arg0.field2596 * arg1 >> 14);
        }
        if (arg0.field2693 == 0) {
            arg0.field2601 = arg0.field2580;
        } else if (arg0.field2693 == 1) {
            arg0.field2601 = (arg2 - arg0.field2603) / 2 + arg0.field2580;
        } else if (arg0.field2693 == 2) {
            arg0.field2601 = arg2 - arg0.field2603 - arg0.field2580;
        } else if (arg0.field2693 == 3) {
            arg0.field2601 = arg0.field2580 * arg2 >> 14;
        } else if (arg0.field2693 == 4) {
            arg0.field2601 = (arg0.field2580 * arg2 >> 14) + (arg2 - arg0.field2603) / 2;
        } else {
            arg0.field2601 = arg2 - arg0.field2603 - (arg0.field2580 * arg2 >> 14);
        }
    }

    @ObfuscatedName("jy.jw(Lhe;IIIIIII)V")
    public static final void method4425(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field693) {
            field721 = 32;
        } else {
            field721 = 0;
        }
        field693 = false;
        if (class64.field492 == 1 || !Statics.field1990 && class64.field492 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2609 -= 4;
                method3344(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2609 += 4;
                method3344(arg0);
            } else if (arg5 >= arg1 - field721 && arg5 < field721 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2609 = (arg4 - arg3) * var8 / var9;
                method3344(arg0);
                field693 = true;
            }
        }
        if (field847 == 0) {
            return;
        }
        int var10 = arg0.field2602;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2609 += field847 * 45;
            method3344(arg0);
        }
    }

    @ObfuscatedName("cr.js(IIIIII)V")
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field565[0].method5658(arg0, arg1);
        Statics.field565[1].method5658(arg0, arg1 + arg3 - 16);
        class332.method5581(arg0, arg1 + 16, 16, arg3 - 32, field712);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class332.method5581(arg0, arg1 + 16 + var6, 16, var5, field713);
        class332.method5600(arg0, arg1 + 16 + var6, var5, field715);
        class332.method5600(arg0 + 1, arg1 + 16 + var6, var5, field715);
        class332.method5629(arg0, arg1 + 16 + var6, 16, field715);
        class332.method5629(arg0, arg1 + 17 + var6, 16, field715);
        class332.method5600(arg0 + 15, arg1 + 16 + var6, var5, field714);
        class332.method5600(arg0 + 14, arg1 + 17 + var6, var5 - 1, field714);
        class332.method5629(arg0, arg1 + 15 + var6 + var5, 16, field714);
        class332.method5629(arg0 + 1, arg1 + 14 + var6 + var5, 15, field714);
    }

    @ObfuscatedName("ie.jo(Lhe;IS)I")
    public static final int method4143(class227 arg0, int arg1) {
        if (arg0.field2600 == null || arg1 >= arg0.field2600.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2600[arg1];
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
                    var7 = field781[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field782[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field676[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method3345(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class266.method1102(var12).field3442 || field660)) {
                        for (int var13 = 0; var13 < var11.field2705.length; var13++) {
                            if (var12 + 1 == var11.field2705[var13]) {
                                var7 += var11.field2712[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2542[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2769[field782[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2542[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2563.field612;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2770[var14]) {
                            var7 += field782[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method3345(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class266.method1102(var18).field3442 || field660)) {
                        for (int var19 = 0; var19 < var17.field2705.length; var19++) {
                            if (var18 + 1 == var17.field2705[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field816;
                }
                if (var6 == 12) {
                    var7 = field817;
                }
                if (var6 == 13) {
                    int var20 = class222.field2542[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method3680(var22);
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
                    var7 = (Statics.field2563.field991 >> 7) + Statics.field3157;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2563.field939 >> 7) + Statics.field301;
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

    @ObfuscatedName("p.ja(Lhe;Ljq;IIZI)V")
    public static final void method71(class227 arg0, class266 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3460;
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
            var7 = class234.field2865;
        }
        if (var6 != -1 && var7 != null) {
            Statics.method539(var7, class91.method200(16748608) + arg1.field3445, var6, arg1.field3481, arg2, arg0.field2587, arg4);
        }
    }

    @ObfuscatedName("am.jg(Lhe;IIB)V")
    public static final void method441(class227 arg0, int arg1, int arg2) {
        if (arg0.field2590 == 1) {
            method506(arg0.field2710, "", 24, 0, 0, arg0.field2587);
        }
        if (arg0.field2590 == 2 && !field804) {
            String var3 = method3825(arg0);
            if (var3 != null) {
                method506(var3, class91.method200(65280) + arg0.field2709, 25, 0, -1, arg0.field2587);
            }
        }
        if (arg0.field2590 == 3) {
            method506(class234.field2875, "", 26, 0, 0, arg0.field2587);
        }
        if (arg0.field2590 == 4) {
            method506(arg0.field2710, "", 28, 0, 0, arg0.field2587);
        }
        if (arg0.field2590 == 5) {
            method506(arg0.field2710, "", 29, 0, 0, arg0.field2587);
        }
        if (arg0.field2590 == 6 && field823 == null) {
            method506(arg0.field2710, "", 30, 0, -1, arg0.field2587);
        }
        if (arg0.field2589 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2603; var5++) {
                for (int var6 = 0; var6 < arg0.field2602; var6++) {
                    int var7 = (arg0.field2708 + 32) * var6;
                    int var8 = (arg0.field2655 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2656[var4];
                        var8 += arg0.field2657[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field760 = var4;
                        Statics.field1923 = arg0;
                        if (arg0.field2705[var4] > 0) {
                            class266 var9 = class266.method1102(arg0.field2705[var4] - 1);
                            if (field802 == 1 && class228.method723(method3108(arg0))) {
                                if (Statics.field141 != arg0.field2587 || Statics.field1323 != var4) {
                                    method506(class234.field2938, field745 + " " + class91.field1153 + " " + class91.method200(16748608) + var9.field3445, 31, var9.field3481, var4, arg0.field2587);
                                }
                            } else if (!field804 || !class228.method723(method3108(arg0))) {
                                String[] var10 = var9.field3460;
                                int var11 = -1;
                                if (field664 && method3254()) {
                                    var11 = var9.method4354();
                                }
                                if (class228.method723(method3108(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method71(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method3108(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method506(class234.field2938, class91.method200(16748608) + var9.field3445, 38, var9.field3481, var4, arg0.field2587);
                                }
                                class228 var10000 = (class228) null;
                                if (class228.method723(method3108(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method71(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method71(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field2659;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method506(var16[var17], class91.method200(16748608) + var9.field3445, var18, var9.field3481, var4, arg0.field2587);
                                        }
                                    }
                                }
                                method506(class234.field2983, class91.method200(16748608) + var9.field3445, 1005, var9.field3481, var4, arg0.field2587);
                            } else if ((Statics.field638 & 0x10) == 16) {
                                method506(field852, field808 + " " + class91.field1153 + " " + class91.method200(16748608) + var9.field3445, 32, var9.field3481, var4, arg0.field2587);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2586) {
            return;
        }
        if (!field804) {
            for (int var19 = 9; var19 >= 5; var19--) {
                int var20 = method3108(arg0);
                boolean var21 = (var20 >> var19 + 1 & 0x1) != 0;
                String var22;
                if (!var21 && arg0.field2614 == null) {
                    var22 = null;
                } else if (arg0.field2663 == null || arg0.field2663.length <= var19 || arg0.field2663[var19] == null || arg0.field2663[var19].trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = arg0.field2663[var19];
                }
                if (var22 != null) {
                    method506(var22, arg0.field2666, 1007, var19 + 1, arg0.field2588, arg0.field2587);
                }
            }
            String var24 = method3825(arg0);
            if (var24 != null) {
                method506(var24, arg0.field2666, 25, 0, arg0.field2588, arg0.field2587);
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                int var26 = method3108(arg0);
                boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
                String var28;
                if (!var27 && arg0.field2614 == null) {
                    var28 = null;
                } else if (arg0.field2663 == null || arg0.field2663.length <= var25 || arg0.field2663[var25] == null || arg0.field2663[var25].trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = arg0.field2663[var25];
                }
                if (var28 != null) {
                    Statics.method539(var28, arg0.field2666, 57, var25 + 1, arg0.field2588, arg0.field2587, arg0.field2624);
                }
            }
            int var30 = method3108(arg0);
            boolean var31 = (var30 & 0x1) != 0;
            if (var31) {
                method506(class234.field2790, "", 30, 0, arg0.field2588, arg0.field2587);
            }
        } else if (class228.method2406(method3108(arg0)) && (Statics.field638 & 0x20) == 32) {
            method506(field852, field808 + " " + class91.field1153 + " " + arg0.field2666, 58, 0, arg0.field2588, arg0.field2587);
        }
    }

    @ObfuscatedName("d.jk(ZB)V")
    public static void method229(boolean arg0) {
        field725 = arg0;
    }

    @ObfuscatedName("w.jc(I)Z")
    public static boolean method30() {
        return field725;
    }

    @ObfuscatedName("fq.jz(I)Z")
    public static boolean method3254() {
        return field725 || class55.field417[81];
    }

    @ObfuscatedName("at.ju(IIIIIIIB)V")
    public static final void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method545(arg0)) {
            method2045(Statics.field45[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cy.jr([Lhe;IIIIIIII)V")
    public static final void method2045(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2671 == arg1 && (!var9.field2586 || var9.field2589 == 0 || var9.field2576 || method3108(var9) != 0 || field833 == var9 || var9.field2696 == 1338)) {
                if (var9.field2586) {
                    if (method775(var9)) {
                        continue;
                    }
                } else if (var9.field2589 == 0 && Statics.field3351 != var9 && method775(var9)) {
                    continue;
                }
                int var10 = var9.field2695 + arg6;
                int var11 = var9.field2601 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2589 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2589 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2602 + var10;
                    int var19 = var9.field2603 + var11;
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
                    int var22 = var9.field2602 + var10;
                    int var23 = var9.field2603 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field822 == var9) {
                    field830 = true;
                    field854 = var10;
                    field863 = var11;
                }
                boolean var24 = false;
                if (var9.field2591) {
                    switch(field811) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2587 >>> 16 == field812) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field812 == var9.field2587) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2586 || var12 < var14 && var13 < var15) {
                    if (var9.field2586) {
                        if (var9.field2727) {
                            if (class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15) {
                                for (class72 var25 = (class72) field848.method4540(); var25 != null; var25 = (class72) field848.method4545()) {
                                    if (var25.field582) {
                                        var25.method3359();
                                        var25.field572.field2718 = false;
                                    }
                                }
                                if (Statics.field522 == 0) {
                                    field822 = null;
                                    field833 = null;
                                }
                                if (!field785) {
                                    method1180();
                                }
                            }
                        } else if (var9.field2728 && class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15) {
                            for (class72 var26 = (class72) field848.method4540(); var26 != null; var26 = (class72) field848.method4545()) {
                                if (var26.field582 && var26.field572.field2654 == var26.field573) {
                                    var26.method3359();
                                }
                            }
                        }
                    }
                    int var27 = class64.field493;
                    int var28 = class64.field500;
                    if (class64.field484 != 0) {
                        var27 = class64.field490;
                        var28 = class64.field503;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2696 == 1337) {
                        if (!field896 && !field785 && var29) {
                            method3999(var27, var28, var12, var13);
                        }
                    } else if (var9.field2696 == 1338) {
                        method3233(var9, var10, var11);
                    } else {
                        if (var9.field2696 == 1400) {
                            Statics.field199.method5880(class64.field493, class64.field500, var29, var10, var11, var9.field2602, var9.field2603);
                        }
                        if (!field785 && var29) {
                            if (var9.field2696 == 1400) {
                                Statics.field199.method6065(var10, var11, var9.field2602, var9.field2603, var27, var28);
                            } else {
                                method441(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2650.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2650[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2650[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2685 != null) {
                                            var34 = class55.field417[var9.field2650[var30][var33]];
                                        }
                                        if (method790(var9.field2650[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2685 != null && var9.field2685[var30] > field656) {
                                                break;
                                            }
                                            byte var35 = var9.field2638[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field417[86] && !class55.field417[82] && !class55.field417[81]) && ((var35 & 0x2) == 0 || class55.field417[86]) && ((var35 & 0x1) == 0 || class55.field417[82]) && ((var35 & 0x4) == 0 || class55.field417[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method22(var30 + 1, var9.field2587, var9.field2588, var9.field2713, "");
                                    } else if (var30 == 10) {
                                        method618();
                                        method3379(var9.field2587, var9.field2588, class228.method3369(method3108(var9)), var9.field2713);
                                        field852 = method3825(var9);
                                        if (field852 == null) {
                                            field852 = class234.field2792;
                                        }
                                        field808 = var9.field2666 + class91.method200(16777215);
                                    }
                                    int var36 = var9.field2680[var30];
                                    if (var9.field2685 == null) {
                                        var9.field2685 = new int[var9.field2650.length];
                                    }
                                    if (var9.field2665 == null) {
                                        var9.field2665 = new int[var9.field2650.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2685[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2685[var30] == 0) {
                                        var9.field2685[var30] = field656 + var36 + var9.field2665[var30];
                                    } else {
                                        var9.field2685[var30] = field656 + var36;
                                    }
                                }
                                if (!var31 && var9.field2685 != null) {
                                    var9.field2685[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2586) {
                            boolean var37;
                            if (class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field492 == 1 || !Statics.field1990 && class64.field492 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field484 == 1 || !Statics.field1990 && class64.field484 == 4) && class64.field490 >= var12 && class64.field503 >= var13 && class64.field490 < var14 && class64.field503 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method108(var9, class64.field490 - var10, class64.field503 - var11);
                            }
                            if (var9.field2696 == 1400) {
                                Statics.field199.method5881(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field822 != null && field822 != var9 && var37 && class228.method1095(method3108(var9))) {
                                field826 = var9;
                            }
                            if (field833 == var9) {
                                field860 = true;
                                field828 = var10;
                                field717 = var11;
                            }
                            if (var9.field2576) {
                                if (var37 && field847 != 0 && var9.field2654 != null) {
                                    class72 var40 = new class72();
                                    var40.field582 = true;
                                    var40.field572 = var9;
                                    var40.field580 = field847;
                                    var40.field573 = var9.field2654;
                                    field848.method4549(var40);
                                }
                                if (field822 != null || Statics.field2028 != null || field785) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2606 && var39) {
                                    var9.field2606 = true;
                                    if (var9.field2675 != null) {
                                        class72 var41 = new class72();
                                        var41.field582 = true;
                                        var41.field572 = var9;
                                        var41.field571 = class64.field490 - var10;
                                        var41.field580 = class64.field503 - var11;
                                        var41.field573 = var9.field2675;
                                        field848.method4549(var41);
                                    }
                                }
                                if (var9.field2606 && var38 && var9.field2676 != null) {
                                    class72 var42 = new class72();
                                    var42.field582 = true;
                                    var42.field572 = var9;
                                    var42.field571 = class64.field493 - var10;
                                    var42.field580 = class64.field500 - var11;
                                    var42.field573 = var9.field2676;
                                    field848.method4549(var42);
                                }
                                if (var9.field2606 && !var38) {
                                    var9.field2606 = false;
                                    if (var9.field2677 != null) {
                                        class72 var43 = new class72();
                                        var43.field582 = true;
                                        var43.field572 = var9;
                                        var43.field571 = class64.field493 - var10;
                                        var43.field580 = class64.field500 - var11;
                                        var43.field573 = var9.field2677;
                                        field850.method4549(var43);
                                    }
                                }
                                if (var38 && var9.field2678 != null) {
                                    class72 var44 = new class72();
                                    var44.field582 = true;
                                    var44.field572 = var9;
                                    var44.field571 = class64.field493 - var10;
                                    var44.field580 = class64.field500 - var11;
                                    var44.field573 = var9.field2678;
                                    field848.method4549(var44);
                                }
                                if (!var9.field2718 && var37) {
                                    var9.field2718 = true;
                                    if (var9.field2679 != null) {
                                        class72 var45 = new class72();
                                        var45.field582 = true;
                                        var45.field572 = var9;
                                        var45.field571 = class64.field493 - var10;
                                        var45.field580 = class64.field500 - var11;
                                        var45.field573 = var9.field2679;
                                        field848.method4549(var45);
                                    }
                                }
                                if (var9.field2718 && var37 && var9.field2619 != null) {
                                    class72 var46 = new class72();
                                    var46.field582 = true;
                                    var46.field572 = var9;
                                    var46.field571 = class64.field493 - var10;
                                    var46.field580 = class64.field500 - var11;
                                    var46.field573 = var9.field2619;
                                    field848.method4549(var46);
                                }
                                if (var9.field2718 && !var37) {
                                    var9.field2718 = false;
                                    if (var9.field2607 != null) {
                                        class72 var47 = new class72();
                                        var47.field582 = true;
                                        var47.field572 = var9;
                                        var47.field571 = class64.field493 - var10;
                                        var47.field580 = class64.field500 - var11;
                                        var47.field573 = var9.field2607;
                                        field850.method4549(var47);
                                    }
                                }
                                if (var9.field2631 != null) {
                                    class72 var48 = new class72();
                                    var48.field572 = var9;
                                    var48.field573 = var9.field2631;
                                    field716.method4549(var48);
                                }
                                if (var9.field2686 != null && field836 > var9.field2646) {
                                    if (var9.field2662 == null || field836 - var9.field2646 > 32) {
                                        class72 var53 = new class72();
                                        var53.field572 = var9;
                                        var53.field573 = var9.field2686;
                                        field848.method4549(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2646; var49 < field836; var49++) {
                                            int var50 = field835[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2662.length; var51++) {
                                                if (var9.field2662[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field572 = var9;
                                                    var52.field573 = var9.field2686;
                                                    field848.method4549(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2646 = field836;
                                }
                                if (var9.field2633 != null && field838 > var9.field2722) {
                                    if (var9.field2689 == null || field838 - var9.field2722 > 32) {
                                        class72 var58 = new class72();
                                        var58.field572 = var9;
                                        var58.field573 = var9.field2633;
                                        field848.method4549(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2722; var54 < field838; var54++) {
                                            int var55 = field876[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2689.length; var56++) {
                                                if (var9.field2689[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field572 = var9;
                                                    var57.field573 = var9.field2633;
                                                    field848.method4549(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2722 = field838;
                                }
                                if (var9.field2690 != null && field840 > var9.field2726) {
                                    if (var9.field2691 == null || field840 - var9.field2726 > 32) {
                                        class72 var63 = new class72();
                                        var63.field572 = var9;
                                        var63.field573 = var9.field2690;
                                        field848.method4549(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2726; var59 < field840; var59++) {
                                            int var60 = field839[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2691.length; var61++) {
                                                if (var9.field2691[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field572 = var9;
                                                    var62.field573 = var9.field2690;
                                                    field848.method4549(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2726 = field840;
                                }
                                if (field841 > var9.field2720 && var9.field2582 != null) {
                                    class72 var64 = new class72();
                                    var64.field572 = var9;
                                    var64.field573 = var9.field2582;
                                    field848.method4549(var64);
                                }
                                if (field880 > var9.field2720 && var9.field2697 != null) {
                                    class72 var65 = new class72();
                                    var65.field572 = var9;
                                    var65.field573 = var9.field2697;
                                    field848.method4549(var65);
                                }
                                if (field843 > var9.field2720 && var9.field2698 != null) {
                                    class72 var66 = new class72();
                                    var66.field572 = var9;
                                    var66.field573 = var9.field2698;
                                    field848.method4549(var66);
                                }
                                if (field686 > var9.field2720 && var9.field2703 != null) {
                                    class72 var67 = new class72();
                                    var67.field572 = var9;
                                    var67.field573 = var9.field2703;
                                    field848.method4549(var67);
                                }
                                if (field681 > var9.field2720 && var9.field2704 != null) {
                                    class72 var68 = new class72();
                                    var68.field572 = var9;
                                    var68.field573 = var9.field2704;
                                    field848.method4549(var68);
                                }
                                if (field846 > var9.field2720 && var9.field2699 != null) {
                                    class72 var69 = new class72();
                                    var69.field572 = var9;
                                    var69.field573 = var9.field2699;
                                    field848.method4549(var69);
                                }
                                var9.field2720 = field738;
                                if (var9.field2717 != null) {
                                    for (int var70 = 0; var70 < field871; var70++) {
                                        class72 var71 = new class72();
                                        var71.field572 = var9;
                                        var71.field577 = field694[var70];
                                        var71.field578 = field662[var70];
                                        var71.field573 = var9.field2717;
                                        field848.method4549(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2586) {
                            if (field822 != null || Statics.field2028 != null || field785) {
                                continue;
                            }
                            if ((var9.field2583 >= 0 || var9.field2667 != 0) && class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15) {
                                if (var9.field2583 >= 0) {
                                    Statics.field3351 = arg0[var9.field2583];
                                } else {
                                    Statics.field3351 = var9;
                                }
                            }
                            if (var9.field2589 == 8 && class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15) {
                                Statics.field2093 = var9;
                            }
                            if (var9.field2640 > var9.field2603) {
                                method4425(var9, var9.field2602 + var10, var11, var9.field2603, var9.field2640, class64.field493, class64.field500);
                            }
                        }
                        if (var9.field2589 == 0) {
                            method2045(arg0, var9.field2587, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2609);
                            if (var9.field2673 != null) {
                                method2045(var9.field2673, var9.field2587, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2609);
                            }
                            class71 var72 = (class71) field834.method5543((long) var9.field2587);
                            if (var72 != null) {
                                if (var72.field561 == 0 && class64.field493 >= var12 && class64.field500 >= var13 && class64.field493 < var14 && class64.field500 < var15 && !field785) {
                                    for (class72 var73 = (class72) field848.method4540(); var73 != null; var73 = (class72) field848.method4545()) {
                                        if (var73.field582) {
                                            var73.method3359();
                                            var73.field572.field2718 = false;
                                        }
                                    }
                                    if (Statics.field522 == 0) {
                                        field822 = null;
                                        field833 = null;
                                    }
                                    if (!field785) {
                                        method1180();
                                    }
                                }
                                method706(var72.field564, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.kf(IB)Z")
    public static boolean method790(int arg0) {
        for (int var1 = 0; var1 < field871; var1++) {
            if (field694[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("as.kb(III)V")
    public static final void method302(int arg0, int arg1) {
        if (class227.method545(arg0)) {
            method710(Statics.field45[arg0], arg1);
        }
    }

    @ObfuscatedName("at.ks([Lhe;II)V")
    public static final void method710(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2589 == 0) {
                    if (var3.field2673 != null) {
                        method710(var3.field2673, arg1);
                    }
                    class71 var4 = (class71) field834.method5543((long) var3.field2587);
                    if (var4 != null) {
                        method302(var4.field564, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2700 != null) {
                    class72 var5 = new class72();
                    var5.field572 = var3;
                    var5.field573 = var3.field2700;
                    class86.method197(var5);
                }
                if (arg1 == 1 && var3.field2611 != null) {
                    if (var3.field2588 >= 0) {
                        class227 var6 = class227.method3345(var3.field2587);
                        if (var6 == null || var6.field2673 == null || var3.field2588 >= var6.field2673.length || var6.field2673[var3.field2588] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field572 = var3;
                    var7.field573 = var3.field2611;
                    class86.method197(var7);
                }
            }
        }
    }

    @ObfuscatedName("c.kz(Lhe;III)V")
    public static final void method108(class227 arg0, int arg1, int arg2) {
        if (field822 != null || field785 || arg0 == null || method1230(arg0) == null) {
            return;
        }
        field822 = arg0;
        field833 = method1230(arg0);
        field824 = arg1;
        field810 = arg2;
        Statics.field522 = 0;
        field801 = false;
        int var3 = method405();
        if (var3 == -1) {
            return;
        }
        Statics.field309 = new class92();
        Statics.field309.field1165 = field787[var3];
        Statics.field309.field1162 = field788[var3];
        Statics.field309.field1163 = field845[var3];
        Statics.field309.field1161 = field790[var3];
        Statics.field309.field1164 = field791[var3];
    }

    @ObfuscatedName("client.ka(I)V")
    public final void method1259() {
        method3344(field822);
        Statics.field522++;
        if (field830 && field860) {
            int var1 = class64.field493;
            int var2 = class64.field500;
            int var3 = var1 - field824;
            int var4 = var2 - field810;
            if (var3 < field828) {
                var3 = field828;
            }
            if (field822.field2602 + var3 > field828 + field833.field2602) {
                var3 = field828 + field833.field2602 - field822.field2602;
            }
            if (var4 < field717) {
                var4 = field717;
            }
            if (field822.field2603 + var4 > field717 + field833.field2603) {
                var4 = field717 + field833.field2603 - field822.field2603;
            }
            int var5 = var3 - field854;
            int var6 = var4 - field863;
            int var7 = field822.field2669;
            if (Statics.field522 > field822.field2670 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field801 = true;
            }
            int var8 = field833.field2608 + (var3 - field828);
            int var9 = field833.field2609 + (var4 - field717);
            if (field822.field2593 != null && field801) {
                class72 var10 = new class72();
                var10.field572 = field822;
                var10.field571 = var8;
                var10.field580 = var9;
                var10.field573 = field822.field2593;
                class86.method197(var10);
            }
            if (class64.field492 == 0) {
                if (field801) {
                    if (field822.field2683 != null) {
                        class72 var11 = new class72();
                        var11.field572 = field822;
                        var11.field571 = var8;
                        var11.field580 = var9;
                        var11.field576 = field826;
                        var11.field573 = field822.field2683;
                        class86.method197(var11);
                    }
                    if (field826 != null) {
                        class227 var12 = field822;
                        int var13 = method3108(var12);
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
                                var12 = class227.method3345(var12.field2671);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class197 var18 = class197.method1128(class193.field2299, field695.field1329);
                            var18.field2361.method5151(field826.field2713);
                            var18.field2361.method5312(field822.field2713);
                            var18.field2361.method5291(field822.field2587);
                            var18.field2361.method5099(field822.field2588);
                            var18.field2361.method5312(field826.field2588);
                            var18.field2361.method5161(field826.field2587);
                            field695.method2155(var18);
                        }
                    }
                } else if (this.method1255()) {
                    this.method1256(field854 + field824, field863 + field810);
                } else if (field786 > 0) {
                    int var19 = field854 + field824;
                    int var20 = field863 + field810;
                    method321(Statics.field309, var19, var20);
                    Statics.field309 = null;
                }
                field822 = null;
            }
        } else if (Statics.field522 > 1) {
            field822 = null;
        }
    }

    @ObfuscatedName("fo.kn(Lhe;I)V")
    public static void method3344(class227 arg0) {
        if (field853 == arg0.field2597) {
            field902[arg0.field2724] = true;
        }
    }

    @ObfuscatedName("gk.ko(I)V")
    public static void method3383() {
        for (class71 var0 = (class71) field834.method5537(); var0 != null; var0 = (class71) field834.method5532()) {
            int var1 = var0.field564;
            if (class227.method545(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field45[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2586;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2138;
                    class227 var6 = class227.method3345(var5);
                    if (var6 != null) {
                        method3344(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.ki(Lhe;I)Lhe;")
    public static class227 method1230(class227 arg0) {
        class227 var1 = arg0;
        int var2 = method3108(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class227 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class227.method3345(var1.field2671);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class227 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2668;
        }
        return var7;
    }

    @ObfuscatedName("kw.kx(II)V")
    public static final void method4945(int arg0) {
        if (!class227.method545(arg0)) {
            return;
        }
        class227[] var1 = Statics.field45[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2719 = 0;
                var3.field2716 = 0;
            }
        }
    }

    @ObfuscatedName("jd.kt(II)V")
    public static final void method4387(int arg0) {
        if (class227.method545(arg0)) {
            method2926(Statics.field45[arg0], -1);
        }
    }

    @ObfuscatedName("ej.ke([Lhe;II)V")
    public static final void method2926(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2671 == arg1 && (!var3.field2586 || !method775(var3))) {
                if (var3.field2589 == 0) {
                    if (!var3.field2586 && method775(var3) && Statics.field3351 != var3) {
                        continue;
                    }
                    method2926(arg0, var3.field2587);
                    if (var3.field2673 != null) {
                        method2926(var3.field2673, var3.field2587);
                    }
                    class71 var4 = (class71) field834.method5543((long) var3.field2587);
                    if (var4 != null) {
                        method4387(var4.field564);
                    }
                }
                if (var3.field2589 == 6) {
                    if (var3.field2634 != -1 || var3.field2635 != -1) {
                        boolean var5 = Statics.method74(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2635;
                        } else {
                            var6 = var3.field2634;
                        }
                        if (var6 != -1) {
                            class270 var7 = class270.method4174(var6);
                            var3.field2716 += field851;
                            while (var3.field2716 > var7.field3553[var3.field2719]) {
                                var3.field2716 -= var7.field3553[var3.field2719];
                                var3.field2719++;
                                if (var3.field2719 >= var7.field3551.length) {
                                    var3.field2719 -= var7.field3559;
                                    if (var3.field2719 < 0 || var3.field2719 >= var7.field3551.length) {
                                        var3.field2719 = 0;
                                    }
                                }
                                method3344(var3);
                            }
                        }
                    }
                    if (var3.field2643 != 0 && !var3.field2586) {
                        int var8 = var3.field2643 >> 16;
                        int var9 = var3.field2643 << 16 >> 16;
                        int var10 = field851 * var8;
                        int var11 = field851 * var9;
                        var3.field2584 = var3.field2584 + var10 & 0x7FF;
                        var3.field2639 = var3.field2639 + var11 & 0x7FF;
                        method3344(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.kp(D)V")
    public static final void method554(double arg0) {
        class140.method2845(arg0);
        ((class129) Statics.field1802).method2587(arg0);
        class266.field3441.method3146();
        Statics.field3618.field1058 = arg0;
        class83.method165();
    }

    @ObfuscatedName("az.kq(II)V")
    public static final void method704(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field3618.field1057 == var1) {
            return;
        }
        if (Statics.field3618.field1057 == 0 && field780 != -1) {
            class207.method1934(Statics.field2521, field780, 0, var1, false);
            field884 = false;
        } else if (var1 == 0) {
            class207.method530();
            field884 = false;
        } else if (class207.field2422 == 0) {
            Statics.field2427.method3444(var1);
        } else {
            Statics.field72 = var1;
        }
        Statics.field3618.field1057 = var1;
        class83.method165();
    }

    @ObfuscatedName("ad.kk(II)V")
    public static final void method574(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field3618.field1060 = var1;
        class83.method165();
    }

    @ObfuscatedName("gs.kg(II)V")
    public static final void method3378(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field3618.field1061 = var1;
        class83.method165();
    }

    @ObfuscatedName("cs.kl(II)V")
    public static final void method2134(int arg0) {
        method3383();
        for (class85 var1 = (class85) class85.field1076.method4540(); var1 != null; var1 = (class85) class85.field1076.method4545()) {
            if (var1.field1088 != null) {
                var1.method1839();
            }
        }
        int var2 = class252.method3657(arg0).field3239;
        if (var2 == 0) {
            return;
        }
        int var3 = class222.field2542[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method554(0.9D);
            }
            if (var3 == 2) {
                method554(0.8D);
            }
            if (var3 == 3) {
                method554(0.7D);
            }
            if (var3 == 4) {
                method554(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method704(255);
            }
            if (var3 == 1) {
                method704(192);
            }
            if (var3 == 2) {
                method704(128);
            }
            if (var3 == 3) {
                method704(64);
            }
            if (var3 == 4) {
                method704(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method574(127);
            }
            if (var3 == 1) {
                method574(96);
            }
            if (var3 == 2) {
                method574(64);
            }
            if (var3 == 3) {
                method574(32);
            }
            if (var3 == 4) {
                method574(0);
            }
        }
        if (var2 == 5) {
            field883 = var3;
        }
        if (var2 == 6) {
            field813 = var3;
        }
        if (var2 == 9) {
            field866 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method3378(127);
            }
            if (var3 == 1) {
                method3378(96);
            }
            if (var3 == 2) {
                method3378(64);
            }
            if (var3 == 3) {
                method3378(32);
            }
            if (var3 == 4) {
                method3378(0);
            }
        }
        if (var2 == 17) {
            field819 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class94[] var4 = new class94[] { class94.field1178, class94.field1177, class94.field1176, class94.field1180 };
            field672 = (class94) class205.method3134(var4, var3);
            if (field672 == null) {
                field672 = class94.field1177;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field815 = -1;
            } else {
                field815 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class94[] var5 = new class94[] { class94.field1178, class94.field1177, class94.field1176, class94.field1180 };
        field673 = (class94) class205.method3134(var5, var3);
        if (field673 == null) {
            field673 = class94.field1177;
        }
    }

    @ObfuscatedName("ja.kr(Lhe;I)V")
    public static final void method4634(class227 arg0) {
        int var1 = arg0.field2696;
        if (var1 == 324) {
            if (field814 == -1) {
                field814 = arg0.field2622;
                field912 = arg0.field2623;
            }
            if (field910.field2553) {
                arg0.field2622 = field814;
            } else {
                arg0.field2622 = field912;
            }
        } else if (var1 == 325) {
            if (field814 == -1) {
                field814 = arg0.field2622;
                field912 = arg0.field2623;
            }
            if (field910.field2553) {
                arg0.field2622 = field912;
            } else {
                arg0.field2622 = field814;
            }
        } else if (var1 == 327) {
            arg0.field2584 = 150;
            arg0.field2639 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2630 = 5;
            arg0.field2688 = 0;
        } else if (var1 == 328) {
            arg0.field2584 = 150;
            arg0.field2639 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2630 = 5;
            arg0.field2688 = 1;
        }
    }

    @ObfuscatedName("gt.kv(B)V")
    public static final void method3366() {
        class197 var0 = class197.method1128(class193.field2307, field695.field1329);
        field695.method2155(var0);
        for (class71 var1 = (class71) field834.method5537(); var1 != null; var1 = (class71) field834.method5532()) {
            if (var1.field561 == 0 || var1.field561 == 3) {
                method1141(var1, true);
            }
        }
        if (field823 != null) {
            method3344(field823);
            field823 = null;
        }
    }

    @ObfuscatedName("ia.kw(IIII)Lbt;")
    public static final class71 method3830(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field564 = arg1;
        var3.field561 = arg2;
        field834.method5531(var3, (long) arg0);
        method4945(arg1);
        class227 var4 = class227.method3345(arg0);
        method3344(var4);
        if (field823 != null) {
            method3344(field823);
            field823 = null;
        }
        method661();
        method1655(Statics.field45[arg0 >> 16], var4, false);
        class86.method4012(arg1);
        if (field874 != -1) {
            method302(field874, 1);
        }
        return var3;
    }

    @ObfuscatedName("bv.ku(Lbt;ZI)V")
    public static final void method1141(class71 arg0, boolean arg1) {
        int var2 = arg0.field564;
        int var3 = (int) arg0.field2138;
        arg0.method3359();
        if (arg1 && var2 != -1 && Statics.field2356[var2]) {
            Statics.field428.method3849(var2);
            if (Statics.field45[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field45[var2].length; var5++) {
                    if (Statics.field45[var2][var5] != null) {
                        if (Statics.field45[var2][var5].field2589 == 2) {
                            var4 = false;
                        } else {
                            Statics.field45[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field45[var2] = null;
                }
                Statics.field2356[var2] = false;
            }
        }
        method531(var2);
        class227 var6 = class227.method3345(var3);
        if (var6 != null) {
            method3344(var6);
        }
        method661();
        if (field874 != -1) {
            method302(field874, 1);
        }
    }

    @ObfuscatedName("ci.kc(Lhe;I)Z")
    public static final boolean method1677(class227 arg0) {
        int var1 = arg0.field2696;
        if (var1 == 205) {
            field734 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field910.method3702(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field910.method3693(var4, var5 == 1);
        }
        if (var1 == 324) {
            field910.method3704(false);
        }
        if (var1 == 325) {
            field910.method3704(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method1128(class193.field2240, field695.field1329);
            field910.method3695(var6.field2361);
            field695.method2155(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hv.kh(Lhe;IIII)V")
    public static final void method3633(class227 arg0, int arg1, int arg2, int arg3) {
        method4939();
        class221 var4 = arg0.method3755(false);
        if (var4 == null) {
            return;
        }
        class332.method5573(arg1, arg2, var4.field2538 + arg1, var4.field2533 + arg2);
        if (field895 == 2 || field895 == 5) {
            class332.method5595(arg1, arg2, 0, var4.field2532, var4.field2534);
        } else {
            int var5 = field831 & 0x7FF;
            int var6 = Statics.field2563.field991 / 32 + 48;
            int var7 = 464 - Statics.field2563.field939 / 32;
            Statics.field127.method5710(arg1, arg2, var4.field2538, var4.field2533, var6, var7, var5, 256, var4.field2532, var4.field2534);
            for (int var8 = 0; var8 < field757; var8++) {
                int var9 = field718[var8] * 4 + 2 - Statics.field2563.field991 / 32;
                int var10 = field878[var8] * 4 + 2 - Statics.field2563.field939 / 32;
                method228(arg1, arg2, var9, var10, field879[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class273 var13 = field777[Statics.field1950][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2563.field991 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2563.field939 / 32;
                        method228(arg1, arg2, var14, var15, Statics.field999[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field691; var16++) {
                class89 var17 = field690[field692[var16]];
                if (var17 != null && var17.method1195()) {
                    class268 var18 = var17.field1136;
                    if (var18 != null && var18.field3525 != null) {
                        var18 = var18.method4392();
                    }
                    if (var18 != null && var18.field3516 && var18.field3528) {
                        int var19 = var17.field991 / 32 - Statics.field2563.field991 / 32;
                        int var20 = var17.field939 / 32 - Statics.field2563.field939 / 32;
                        method228(arg1, arg2, var19, var20, Statics.field999[1], var4);
                    }
                }
            }
            int var21 = class99.field1264;
            int[] var22 = class99.field1269;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field765[var22[var23]];
                if (var24 != null && var24.method1195() && !var24.field626 && Statics.field2563 != var24) {
                    int var25 = var24.field991 / 32 - Statics.field2563.field991 / 32;
                    int var26 = var24.field939 / 32 - Statics.field2563.field939 / 32;
                    boolean var27 = false;
                    if (Statics.field2563.field617 != 0 && var24.field617 != 0 && Statics.field2563.field617 == var24.field617) {
                        var27 = true;
                    }
                    if (var24.method1210()) {
                        method228(arg1, arg2, var25, var26, Statics.field999[3], var4);
                    } else if (var27) {
                        method228(arg1, arg2, var25, var26, Statics.field999[4], var4);
                    } else if (var24.method1209()) {
                        method228(arg1, arg2, var25, var26, Statics.field999[5], var4);
                    } else {
                        method228(arg1, arg2, var25, var26, Statics.field999[2], var4);
                    }
                }
            }
            if (field741 != 0 && field656 % 20 < 10) {
                if (field741 == 1 && field665 >= 0 && field665 < field690.length) {
                    class89 var28 = field690[field665];
                    if (var28 != null) {
                        int var29 = var28.field991 / 32 - Statics.field2563.field991 / 32;
                        int var30 = var28.field939 / 32 - Statics.field2563.field939 / 32;
                        method292(arg1, arg2, var29, var30, Statics.field88[1], var4);
                    }
                }
                if (field741 == 2) {
                    int var31 = field710 * 4 - Statics.field3157 * 4 + 2 - Statics.field2563.field991 / 32;
                    int var32 = field668 * 4 - Statics.field301 * 4 + 2 - Statics.field2563.field939 / 32;
                    method292(arg1, arg2, var31, var32, Statics.field88[1], var4);
                }
                if (field741 == 10 && field666 >= 0 && field666 < field765.length) {
                    class76 var33 = field765[field666];
                    if (var33 != null) {
                        int var34 = var33.field991 / 32 - Statics.field2563.field991 / 32;
                        int var35 = var33.field939 / 32 - Statics.field2563.field939 / 32;
                        method292(arg1, arg2, var34, var35, Statics.field88[1], var4);
                    }
                }
            }
            if (field775 != 0) {
                int var36 = field775 * 4 + 2 - Statics.field2563.field991 / 32;
                int var37 = field881 * 4 + 2 - Statics.field2563.field939 / 32;
                method228(arg1, arg2, var36, var37, Statics.field88[0], var4);
            }
            if (!Statics.field2563.field626) {
                class332.method5581(var4.field2538 / 2 + arg1 - 1, var4.field2533 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field855[arg3] = true;
    }

    @ObfuscatedName("cg.km(Lhe;IIII)V")
    public static final void method2098(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3755(false);
        if (var4 == null) {
            return;
        }
        if (field895 < 3) {
            Statics.field1965.method5710(arg1, arg2, var4.field2538, var4.field2533, 25, 25, field831, 256, var4.field2532, var4.field2534);
        } else {
            class332.method5595(arg1, arg2, 0, var4.field2532, var4.field2534);
        }
    }

    @ObfuscatedName("au.ky(IIIILlm;Lho;I)V")
    public static final void method292(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method228(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field831 & 0x7FF;
        int var8 = class140.field1798[var7];
        int var9 = class140.field1781[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2538 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1770.method5711(arg5.field2538 / 2 + arg0 - var17 / 2 + var15, arg5.field2533 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("d.kj(IIIILlm;Lho;I)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field831 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1798[var6];
        int var9 = class140.field1781[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5758(arg5.field2538 / 2 + var10 - arg4.field3917 / 2, arg5.field2533 / 2 - var11 - arg4.field3916 / 2, arg0, arg1, arg5.field2538, arg5.field2533, arg5.field2532, arg5.field2534);
        } else {
            arg4.method5688(arg5.field2538 / 2 + arg0 + var10 - arg4.field3917 / 2, arg5.field2533 / 2 + arg1 - var11 - arg4.field3916 / 2);
        }
    }

    @ObfuscatedName("z.kd(B)V")
    public static final void method90() {
        Iterator var0 = class101.field1286.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1151();
        }
        if (Statics.field245 != null) {
            Statics.field245.method4848();
        }
    }

    @ObfuscatedName("bw.lt(I)V")
    public static final void method1096() {
        for (int var0 = 0; var0 < class99.field1264; var0++) {
            class76 var1 = field765[class99.field1269[var0]];
            var1.method1188();
        }
    }

    @ObfuscatedName("ah.li(B)V")
    public static final void method411() {
        field843 = field738;
        Statics.field208 = true;
    }

    @ObfuscatedName("bi.lk(Ljava/lang/String;S)V")
    public static final void method1086(String arg0) {
        if (Statics.field245 != null) {
            class197 var1 = class197.method1128(class193.field2229, field695.field1329);
            var1.field2361.method5095(class311.method2704(arg0));
            var1.field2361.method5105(arg0);
            field695.method2155(var1);
        }
    }

    @ObfuscatedName("cg.lr(Ljava/lang/String;I)V")
    public static final void method2097(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method1128(class193.field2286, field695.field1329);
            var1.field2361.method5095(class311.method2704(arg0));
            var1.field2361.method5105(arg0);
            field695.method2155(var1);
        }
    }

    @ObfuscatedName("li.le(I)V")
    public static final void method5398() {
        class197 var0 = class197.method1128(class193.field2286, field695.field1329);
        var0.field2361.method5095(0);
        field695.method2155(var0);
    }

    @ObfuscatedName("am.lf(II)V")
    public static void method531(int arg0) {
        for (class189 var1 = (class189) field892.method5537(); var1 != null; var1 = (class189) field892.method5532()) {
            if ((var1.field2138 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3359();
            }
        }
    }

    @ObfuscatedName("ef.lx(Lhe;I)I")
    public static int method3108(class227 arg0) {
        class189 var1 = (class189) field892.method5543(((long) arg0.field2587 << 32) + (long) arg0.field2588);
        return var1 == null ? arg0.field2660 : var1.field2136;
    }

    @ObfuscatedName("br.lg(Lhe;B)Z")
    public static boolean method775(class227 arg0) {
        return arg0.field2644;
    }

    @ObfuscatedName("ic.lw(Lhe;B)Ljava/lang/String;")
    public static String method3825(class227 arg0) {
        if (class228.method3369(method3108(arg0)) == 0) {
            return null;
        } else if (arg0.field2577 == null || arg0.field2577.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2577;
        }
    }

    @ObfuscatedName("ap.ld(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method558(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field648 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field648 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field648 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field648 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field648 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field318 != null) {
            var3 = "/p=" + Statics.field318;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field373 + "/a=" + Statics.field2456 + var3 + "/";
    }

    @ObfuscatedName("k.ln(Ljava/lang/String;B)V")
    public static void method222(String arg0) {
        Statics.field318 = arg0;
        try {
            String var1 = Statics.field148.getParameter(Integer.toString(18));
            String var2 = Statics.field148.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class217.method31(class308.method4891() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field148;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("aw.lz(Ljava/lang/String;ZB)V")
    public static void method555(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1279; var5++) {
            class266 var6 = class266.method1102(var5);
            if ((!arg1 || var6.field3485) && var6.field3433 == -1 && var6.field3445.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2368 = -1;
                    Statics.field1971 = null;
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
        Statics.field1971 = var3;
        Statics.field3215 = 0;
        Statics.field2368 = var4;
        String[] var9 = new String[Statics.field2368];
        for (int var10 = 0; var10 < Statics.field2368; var10++) {
            var9[var10] = class266.method1102(var3[var10]).field3445;
        }
        short[] var11 = Statics.field1971;
        class199.method1965(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("lr.lp([BIB)V")
    public static void method5419(byte[] arg0, int arg1) {
        if (field689 == null) {
            field689 = new byte[24];
        }
        class312.method5353(arg0, arg1, field689, 0, 24);
    }

    @ObfuscatedName("az.lv(Lkj;IB)V")
    public static void method702(class311 arg0, int arg1) {
        method5419(arg0.field3753, arg1);
        if (class177.field2066 == null) {
            return;
        }
        try {
            class177.field2066.method6127(0L);
            class177.field2066.method6107(arg0.field3753, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("fc.la(Lkj;I)V")
    public static void method3285(class311 arg0) {
        if (field689 != null) {
            arg0.method5237(field689, 0, field689.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class177.field2066.method6127(0L);
            class177.field2066.method6104(var1);
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
        arg0.method5237(var1, 0, var1.length);
    }

    @ObfuscatedName("client.lb(I)Lki;")
    public class294 method1362() {
        return Statics.field2563 == null ? null : Statics.field2563.field620;
    }

    @ObfuscatedName("kr.ls(IS)V")
    public static void method4935(int arg0) {
        field724 = arg0;
    }

    @ObfuscatedName("ad.lc(B)V")
    public static void method576() {
        if (field724 == 1) {
            field650 = true;
        }
    }

    @ObfuscatedName("s.ly(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method198(String arg0) {
        class240[] var1 = class240.method3808();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3127 != -1 && arg0.startsWith(class91.method226(var3.field3127))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3127).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dk.lq(I)V")
    public static void method2618() {
        if (Statics.field149 == null) {
            return;
        }
        field916 = field656;
        Statics.field149.method3979();
        for (int var0 = 0; var0 < field765.length; var0++) {
            if (field765[var0] != null) {
                Statics.field149.method3978((field765[var0].field991 >> 7) + Statics.field3157, (field765[var0].field939 >> 7) + Statics.field301);
            }
        }
    }
}

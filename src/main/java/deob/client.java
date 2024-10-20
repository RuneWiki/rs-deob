package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class63 implements class290 {

    @ObfuscatedName("client.w")
    public static class182[] field734 = new class182[4];

    @ObfuscatedName("client.ac")
    public static boolean field842 = true;

    @ObfuscatedName("client.bl")
    public static int field672 = 1;

    @ObfuscatedName("client.bc")
    public static int field781 = 0;

    @ObfuscatedName("client.bj")
    public static int field905 = 0;

    @ObfuscatedName("client.bg")
    public static boolean field675 = false;

    @ObfuscatedName("client.br")
    public static boolean field676 = false;

    @ObfuscatedName("client.bu")
    public static int field677 = -1;

    @ObfuscatedName("client.ba")
    public static boolean field867 = false;

    @ObfuscatedName("client.bm")
    public static int field707 = 0;

    @ObfuscatedName("client.cu")
    public static boolean field942 = true;

    @ObfuscatedName("client.cw")
    public static int field674 = 0;

    @ObfuscatedName("client.cq")
    public static long field685 = -1L;

    @ObfuscatedName("client.cf")
    public static int field799 = -1;

    @ObfuscatedName("client.cj")
    public static int field687 = -1;

    @ObfuscatedName("client.cd")
    public static long field688 = -1L;

    @ObfuscatedName("client.cx")
    public static boolean field907 = true;

    @ObfuscatedName("client.cp")
    public static boolean field690 = false;

    @ObfuscatedName("client.ch")
    public static int field691 = 0;

    @ObfuscatedName("client.cs")
    public static int field692 = 0;

    @ObfuscatedName("client.ck")
    public static int field693 = 0;

    @ObfuscatedName("client.co")
    public static int field694 = 0;

    @ObfuscatedName("client.cz")
    public static int field695 = 0;

    @ObfuscatedName("client.cy")
    public static int field696 = 0;

    @ObfuscatedName("client.cb")
    public static int field890 = 0;

    @ObfuscatedName("client.cl")
    public static int field698 = 0;

    @ObfuscatedName("client.dx")
    public static int field699 = 0;

    @ObfuscatedName("client.dv")
    public static class94 field949 = class94.field1195;

    @ObfuscatedName("client.dh")
    public static class94 field822 = class94.field1195;

    @ObfuscatedName("client.db")
    public static int field702 = 0;

    @ObfuscatedName("client.de")
    public static int field681 = 0;

    @ObfuscatedName("client.da")
    public static int field713 = 0;

    @ObfuscatedName("client.ek")
    public static int field928 = 0;

    @ObfuscatedName("client.ep")
    public static int field749 = 0;

    @ObfuscatedName("client.eg")
    public static int field823 = 0;

    @ObfuscatedName("client.eq")
    public static int field709 = 0;

    @ObfuscatedName("client.em")
    public static int field710 = 0;

    @ObfuscatedName("client.eh")
    public static class170 field711 = class170.field2044;

    @ObfuscatedName("client.ex")
    public static boolean field678 = false;

    @ObfuscatedName("client.ed")
    public static class98 field875 = new class98();

    @ObfuscatedName("client.el")
    public class310 field755;

    @ObfuscatedName("client.ea")
    public class10 field715;

    @ObfuscatedName("client.fq")
    public static byte[] field716 = null;

    @ObfuscatedName("client.fs")
    public static class89[] field718 = new class89[32768];

    @ObfuscatedName("client.fv")
    public static int field719 = 0;

    @ObfuscatedName("client.fz")
    public static int[] field720 = new int[32768];

    @ObfuscatedName("client.fk")
    public static int field703 = 0;

    @ObfuscatedName("client.fe")
    public static int[] field722 = new int[250];

    @ObfuscatedName("client.fm")
    public static final class105 field723 = new class105();

    @ObfuscatedName("client.ff")
    public static int field724 = 0;

    @ObfuscatedName("client.fr")
    public static boolean field714 = false;

    @ObfuscatedName("client.fi")
    public static boolean field726 = true;

    @ObfuscatedName("client.fy")
    public static class282 field793 = new class282();

    @ObfuscatedName("client.fw")
    public static HashMap field859 = new HashMap();

    @ObfuscatedName("client.gj")
    public static int field729 = 0;

    @ObfuscatedName("client.gm")
    public static int field712 = 1;

    @ObfuscatedName("client.gr")
    public static int field896 = 0;

    @ObfuscatedName("client.gv")
    public static int field792 = 1;

    @ObfuscatedName("client.gw")
    public static int field733 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field735 = false;

    @ObfuscatedName("client.gt")
    public static int[][][] field748 = new int[4][13][13];

    @ObfuscatedName("client.gn")
    public static final int[] field737 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gu")
    public static int field738 = 0;

    @ObfuscatedName("client.hh")
    public static int field740 = 2301979;

    @ObfuscatedName("client.hi")
    public static int field671 = 5063219;

    @ObfuscatedName("client.hk")
    public static int field742 = 3353893;

    @ObfuscatedName("client.hp")
    public static int field743 = 7759444;

    @ObfuscatedName("client.ht")
    public static boolean field744 = false;

    @ObfuscatedName("client.ho")
    public static int field745 = 0;

    @ObfuscatedName("client.hs")
    public static int field746 = 128;

    @ObfuscatedName("client.hr")
    public static int field769 = 0;

    @ObfuscatedName("client.hl")
    public static int field856 = 0;

    @ObfuscatedName("client.hd")
    public static int field736 = 0;

    @ObfuscatedName("client.hm")
    public static int field750 = 0;

    @ObfuscatedName("client.hw")
    public static int field751 = 0;

    @ObfuscatedName("client.hy")
    public static int field847 = 0;

    @ObfuscatedName("client.ia")
    public static int field753 = 50;

    @ObfuscatedName("client.is")
    public static int field754 = 0;

    @ObfuscatedName("client.ig")
    public static int field797 = 0;

    @ObfuscatedName("client.io")
    public static int field756 = 0;

    @ObfuscatedName("client.ip")
    public static int field700 = 12;

    @ObfuscatedName("client.iw")
    public static int field924 = 6;

    @ObfuscatedName("client.ii")
    public static int field759 = 0;

    @ObfuscatedName("client.id")
    public static boolean field760 = false;

    @ObfuscatedName("client.it")
    public static String field832 = null;

    @ObfuscatedName("client.iq")
    public static int field830 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field762 = false;

    @ObfuscatedName("client.iv")
    public static int field763 = 0;

    @ObfuscatedName("client.ib")
    public static int field764 = 0;

    @ObfuscatedName("client.ih")
    public static int field765 = 50;

    @ObfuscatedName("client.iu")
    public static int[] field766 = new int[field765];

    @ObfuscatedName("client.ie")
    public static int[] field787 = new int[field765];

    @ObfuscatedName("client.ir")
    public static int[] field768 = new int[field765];

    @ObfuscatedName("client.in")
    public static int[] field752 = new int[field765];

    @ObfuscatedName("client.iy")
    public static int[] field862 = new int[field765];

    @ObfuscatedName("client.il")
    public static int[] field673 = new int[field765];

    @ObfuscatedName("client.jj")
    public static int[] field934 = new int[field765];

    @ObfuscatedName("client.jp")
    public static String[] field773 = new String[field765];

    @ObfuscatedName("client.jd")
    public static int[][] field774 = new int[104][104];

    @ObfuscatedName("client.jg")
    public static int field731 = 0;

    @ObfuscatedName("client.jq")
    public static int field706 = -1;

    @ObfuscatedName("client.ju")
    public static int field777 = -1;

    @ObfuscatedName("client.jx")
    public static int field778 = 0;

    @ObfuscatedName("client.jt")
    public static int field922 = 0;

    @ObfuscatedName("client.jm")
    public static int field780 = 0;

    @ObfuscatedName("client.jl")
    public static int field683 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field782 = true;

    @ObfuscatedName("client.jb")
    public static int field783 = 0;

    @ObfuscatedName("client.je")
    public static int field945 = 0;

    @ObfuscatedName("client.jw")
    public static int field785 = 0;

    @ObfuscatedName("client.jr")
    public static int field686 = 0;

    @ObfuscatedName("client.ja")
    public static int field784 = 0;

    @ObfuscatedName("client.jk")
    public static int field788 = 0;

    @ObfuscatedName("client.jy")
    public static boolean field789 = false;

    @ObfuscatedName("client.jz")
    public static int field790 = 0;

    @ObfuscatedName("client.jf")
    public static int field791 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field851 = true;

    @ObfuscatedName("client.ka")
    public static class76[] field861 = new class76[2048];

    @ObfuscatedName("client.ko")
    public static int field794 = -1;

    @ObfuscatedName("client.kp")
    public static int field889 = 0;

    @ObfuscatedName("client.kw")
    public static boolean field940 = true;

    @ObfuscatedName("client.kh")
    public static int field684 = 0;

    @ObfuscatedName("client.kt")
    public static int field772 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field931 = new int[1000];

    @ObfuscatedName("client.kd")
    public static final int[] field761 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kz")
    public static String[] field801 = new String[8];

    @ObfuscatedName("client.kl")
    public static boolean[] field802 = new boolean[8];

    @ObfuscatedName("client.kv")
    public static int[] field803 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kr")
    public static int field804 = -1;

    @ObfuscatedName("client.kj")
    public static class272[][][] field805 = new class272[4][104][104];

    @ObfuscatedName("client.ki")
    public static class272 field806 = new class272();

    @ObfuscatedName("client.kq")
    public static class272 field807 = new class272();

    @ObfuscatedName("client.ky")
    public static class272 field808 = new class272();

    @ObfuscatedName("client.kf")
    public static int[] field809 = new int[25];

    @ObfuscatedName("client.kn")
    public static int[] field810 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field811 = new int[25];

    @ObfuscatedName("client.li")
    public static int field812 = 0;

    @ObfuscatedName("client.ll")
    public static boolean field813 = false;

    @ObfuscatedName("client.ld")
    public static int field815 = 0;

    @ObfuscatedName("client.la")
    public static int[] field816 = new int[500];

    @ObfuscatedName("client.lb")
    public static int[] field817 = new int[500];

    @ObfuscatedName("client.ly")
    public static int[] field818 = new int[500];

    @ObfuscatedName("client.lt")
    public static int[] field819 = new int[500];

    @ObfuscatedName("client.lg")
    public static String[] field820 = new String[500];

    @ObfuscatedName("client.lq")
    public static String[] field821 = new String[500];

    @ObfuscatedName("client.lo")
    public static boolean[] field898 = new boolean[500];

    @ObfuscatedName("client.lc")
    public static boolean field732 = false;

    @ObfuscatedName("client.lu")
    public static boolean field824 = false;

    @ObfuscatedName("client.lv")
    public static boolean field825 = false;

    @ObfuscatedName("client.lw")
    public static boolean field826 = true;

    @ObfuscatedName("client.lm")
    public static int field827 = -1;

    @ObfuscatedName("client.ls")
    public static int field828 = -1;

    @ObfuscatedName("client.lh")
    public static int field829 = 0;

    @ObfuscatedName("client.mf")
    public static int field771 = 50;

    @ObfuscatedName("client.mo")
    public static int field701 = 0;

    @ObfuscatedName("client.md")
    public static boolean field833 = false;

    @ObfuscatedName("client.ma")
    public static int field834 = -1;

    @ObfuscatedName("client.mc")
    public static int field835 = -1;

    @ObfuscatedName("client.mp")
    public static String field836 = null;

    @ObfuscatedName("client.mu")
    public static String field837 = null;

    @ObfuscatedName("client.mi")
    public static int field838 = -1;

    @ObfuscatedName("client.mg")
    public static class328 field954 = new class328(8);

    @ObfuscatedName("client.mw")
    public static int field866 = 0;

    @ObfuscatedName("client.ms")
    public static int field841 = -1;

    @ObfuscatedName("client.mt")
    public static int field728 = 0;

    @ObfuscatedName("client.mv")
    public static int field708 = 0;

    @ObfuscatedName("client.mq")
    public static class227 field844 = null;

    @ObfuscatedName("client.mj")
    public static int field845 = 0;

    @ObfuscatedName("client.mk")
    public static int field846 = 0;

    @ObfuscatedName("client.mb")
    public static int field814 = 0;

    @ObfuscatedName("client.mn")
    public static int field848 = -1;

    @ObfuscatedName("client.mm")
    public static boolean field849 = false;

    @ObfuscatedName("client.nn")
    public static class227 field850 = null;

    @ObfuscatedName("client.nm")
    public static class227 field858 = null;

    @ObfuscatedName("client.ny")
    public static class227 field852 = null;

    @ObfuscatedName("client.nc")
    public static int field730 = 0;

    @ObfuscatedName("client.nl")
    public static int field854 = 0;

    @ObfuscatedName("client.nh")
    public static class227 field855 = null;

    @ObfuscatedName("client.nx")
    public static boolean field800 = false;

    @ObfuscatedName("client.ng")
    public static int field857 = -1;

    @ObfuscatedName("client.nr")
    public static int field786 = -1;

    @ObfuscatedName("client.no")
    public static boolean field881 = false;

    @ObfuscatedName("client.nd")
    public static int field860 = -1;

    @ObfuscatedName("client.ni")
    public static int field796 = -1;

    @ObfuscatedName("client.nv")
    public static boolean field757 = false;

    @ObfuscatedName("client.ne")
    public static int field863 = 1;

    @ObfuscatedName("client.nw")
    public static int[] field864 = new int[32];

    @ObfuscatedName("client.nz")
    public static int field865 = 0;

    @ObfuscatedName("client.np")
    public static int[] field758 = new int[32];

    @ObfuscatedName("client.nt")
    public static int field904 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field868 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field869 = 0;

    @ObfuscatedName("client.oe")
    public static int field870 = 0;

    @ObfuscatedName("client.on")
    public static int field871 = 0;

    @ObfuscatedName("client.od")
    public static int field872 = 0;

    @ObfuscatedName("client.oi")
    public static int field873 = 0;

    @ObfuscatedName("client.oj")
    public static int field874 = 0;

    @ObfuscatedName("client.oq")
    public static int field776 = 0;

    @ObfuscatedName("client.ow")
    public static int field876 = 0;

    @ObfuscatedName("client.oh")
    public static class272 field877 = new class272();

    @ObfuscatedName("client.oc")
    public static class272 field878 = new class272();

    @ObfuscatedName("client.ok")
    public static class272 field913 = new class272();

    @ObfuscatedName("client.og")
    public static class328 field880 = new class328(512);

    @ObfuscatedName("client.op")
    public static int field682 = 0;

    @ObfuscatedName("client.ox")
    public static int field882 = -2;

    @ObfuscatedName("client.oo")
    public static boolean[] field883 = new boolean[100];

    @ObfuscatedName("client.oz")
    public static boolean[] field884 = new boolean[100];

    @ObfuscatedName("client.or")
    public static boolean[] field885 = new boolean[100];

    @ObfuscatedName("client.os")
    public static int[] field886 = new int[100];

    @ObfuscatedName("client.oy")
    public static int[] field887 = new int[100];

    @ObfuscatedName("client.ou")
    public static int[] field888 = new int[100];

    @ObfuscatedName("client.om")
    public static int[] field908 = new int[100];

    @ObfuscatedName("client.ov")
    public static int field721 = 0;

    @ObfuscatedName("client.ob")
    public static long field891 = 0L;

    @ObfuscatedName("client.ol")
    public static boolean field892 = true;

    @ObfuscatedName("client.pr")
    public static int[] field893 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pc")
    public static int field894 = 0;

    @ObfuscatedName("client.ps")
    public static int field895 = 0;

    @ObfuscatedName("client.pm")
    public static String field914 = "";

    @ObfuscatedName("client.pj")
    public static long[] field897 = new long[100];

    @ObfuscatedName("client.pt")
    public static int field795 = 0;

    @ObfuscatedName("client.py")
    public static int field899 = 0;

    @ObfuscatedName("client.po")
    public static int[] field900 = new int[128];

    @ObfuscatedName("client.pa")
    public static int[] field901 = new int[128];

    @ObfuscatedName("client.pb")
    public static long field902 = -1L;

    @ObfuscatedName("client.pd")
    public static int field903 = -1;

    @ObfuscatedName("client.pn")
    public static int field775 = 0;

    @ObfuscatedName("client.pl")
    public static int[] field843 = new int[1000];

    @ObfuscatedName("client.pk")
    public static int[] field906 = new int[1000];

    @ObfuscatedName("client.pf")
    public static class335[] field952 = new class335[1000];

    @ObfuscatedName("client.qr")
    public static int field739 = 0;

    @ObfuscatedName("client.qe")
    public static int field909 = 0;

    @ObfuscatedName("client.qd")
    public static int field910 = 0;

    @ObfuscatedName("client.qa")
    public static int field911 = 255;

    @ObfuscatedName("client.qu")
    public static int field912 = -1;

    @ObfuscatedName("client.qk")
    public static boolean field705 = false;

    @ObfuscatedName("client.qv")
    public static int field717 = 127;

    @ObfuscatedName("client.qf")
    public static int field915 = 127;

    @ObfuscatedName("client.qn")
    public static int field916 = 0;

    @ObfuscatedName("client.qo")
    public static int[] field917 = new int[50];

    @ObfuscatedName("client.qi")
    public static int[] field918 = new int[50];

    @ObfuscatedName("client.qp")
    public static int[] field919 = new int[50];

    @ObfuscatedName("client.qt")
    public static int[] field920 = new int[50];

    @ObfuscatedName("client.qx")
    public static class111[] field921 = new class111[50];

    @ObfuscatedName("client.ro")
    public static boolean field725 = false;

    @ObfuscatedName("client.rz")
    public static boolean[] field923 = new boolean[5];

    @ObfuscatedName("client.rh")
    public static int[] field679 = new int[5];

    @ObfuscatedName("client.rr")
    public static int[] field741 = new int[5];

    @ObfuscatedName("client.rk")
    public static int[] field926 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field927 = new int[5];

    @ObfuscatedName("client.rw")
    public static short field770 = 256;

    @ObfuscatedName("client.ru")
    public static short field929 = 205;

    @ObfuscatedName("client.rd")
    public static short field930 = 256;

    @ObfuscatedName("client.rv")
    public static short field936 = 320;

    @ObfuscatedName("client.rq")
    public static short field932 = 1;

    @ObfuscatedName("client.rx")
    public static short field933 = 32767;

    @ObfuscatedName("client.rm")
    public static short field939 = 1;

    @ObfuscatedName("client.ry")
    public static short field935 = 32767;

    @ObfuscatedName("client.rg")
    public static int field840 = 0;

    @ObfuscatedName("client.sh")
    public static int field704 = 0;

    @ObfuscatedName("client.so")
    public static int field925 = 0;

    @ObfuscatedName("client.sv")
    public static int field937 = 0;

    @ObfuscatedName("client.sj")
    public static int field747 = 0;

    @ObfuscatedName("client.sq")
    public static class224 field941 = new class224();

    @ObfuscatedName("client.ss")
    public static int field938 = -1;

    @ObfuscatedName("client.si")
    public static int field943 = -1;

    @ObfuscatedName("client.st")
    public static class340 field944 = new class339();

    @ObfuscatedName("client.sc")
    public static class19[] field697 = new class19[8];

    @ObfuscatedName("client.sd")
    public static class77 field946 = new class77();

    @ObfuscatedName("client.sr")
    public static int field947 = -1;

    @ObfuscatedName("client.sn")
    public static ArrayList field727 = new ArrayList(10);

    @ObfuscatedName("client.se")
    public static int field767 = 0;

    @ObfuscatedName("client.su")
    public static int field950 = 0;

    @ObfuscatedName("client.ta")
    public static final class75 field951 = new class75();

    @ObfuscatedName("client.te")
    public static int[] field831 = new int[50];

    @ObfuscatedName("client.tv")
    public static int[] field953 = new int[50];

    @ObfuscatedName("ao.eh(B)Lmx;")
    public static class343 method263() {
        return Statics.field626;
    }

    @ObfuscatedName("client.ay(B)V")
    public final void method862() {
    }

    public final void init() {
        if (!this.method931()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field726 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1174)) {
                            field675 = true;
                        } else {
                            field675 = false;
                        }
                        break;
                    case 4:
                        if (field677 == -1) {
                            field677 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field781 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class200 var4;
                        if (var3 >= 0 && var3 < class200.field2396.length) {
                            var4 = class200.field2396[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field441 = var4;
                        break;
                    case 7:
                        Statics.field2526 = class240.method2621(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1174)) {
                        }
                        break;
                    case 9:
                        Statics.field2404 = var2;
                        break;
                    case 10:
                        Statics.field533 = (class241) class205.method2633(class241.method550(), Integer.parseInt(var2));
                        if (Statics.field533 == class241.field3148) {
                            Statics.field356 = class348.field4061;
                        } else {
                            Statics.field356 = class348.field4063;
                        }
                        break;
                    case 12:
                        field672 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field100 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field905 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3772 = var2;
                }
            }
        }
        method1649();
        Statics.field560 = this.getCodeBase().getHost();
        String var5 = Statics.field2526.field3140;
        byte var6 = 0;
        try {
            class177.method1962("oldschool", var5, var6, 21);
        } catch (Exception var8) {
            class351.method2420((String) null, var8);
        }
        Statics.field9 = this;
        Statics.field296 = field677;
        this.method863(765, 503, 191);
    }

    @ObfuscatedName("ca.ej(I)V")
    public static final void method1649() {
        class143.field1876 = false;
        field676 = false;
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method832() {
        class312.method4699(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field955 = field905 == 0 ? 43594 : field672 + 40000;
        Statics.field126 = field905 == 0 ? 443 : field672 + 50000;
        Statics.field369 = Statics.field955;
        Statics.field2536 = class225.field2588;
        Statics.field254 = class225.field2590;
        Statics.field84 = class225.field2585;
        Statics.field2022 = class225.field2587;
        Statics.field2005 = new class153();
        this.method857();
        this.method961();
        Statics.field664 = this.method869();
        Statics.field1825 = new class318(255, class177.field2091, class177.field2083, 500000);
        class353 var1 = null;
        class83 var2 = new class83();
        try {
            var1 = class177.method21("", Statics.field533.field3143, false);
            byte[] var3 = new byte[(int) var1.method6206()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6194(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class83(new class310(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6189();
            }
        } catch (Exception var9) {
        }
        Statics.field1694 = var2;
        this.method833();
        class61.method4209(this, Statics.field455);
        if (field905 != 0) {
            field690 = true;
        }
        method5027(Statics.field1694.field1085);
        Statics.field456 = new class84(Statics.field356);
    }

    @ObfuscatedName("client.at(I)V")
    public final void method854() {
        field674++;
        this.method1588();
        Statics.method763();
        class207.method1924();
        method3393();
        class55 var1 = class55.field402;
        synchronized (class55.field402) {
            class55.field427++;
            class55.field424 = class55.field400;
            class55.field423 = 0;
            if (class55.field419 >= 0) {
                while (class55.field419 != class55.field418) {
                    int var3 = class55.field410[class55.field418];
                    class55.field418 = class55.field418 + 1 & 0x7F;
                    if (var3 < 0) {
                        class55.field416[~var3] = false;
                    } else {
                        if (!class55.field416[var3] && class55.field423 < class55.field422.length - 1) {
                            class55.field422[++class55.field423 - 1] = var3;
                        }
                        class55.field416[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class55.field416[var2] = false;
                }
                class55.field419 = class55.field418;
            }
            if (class55.field423 > 0) {
                class55.field427 = 0;
            }
            class55.field400 = class55.field425;
        }
        class64.method3150();
        if (Statics.field664 != null) {
            int var5 = Statics.field664.method714();
            field876 = var5;
        }
        if (field707 == 0) {
            method39();
            class63.method424();
        } else if (field707 == 5) {
            class95.method40(this);
            method39();
            class63.method424();
        } else if (field707 == 10 || field707 == 11) {
            class95.method40(this);
        } else if (field707 == 20) {
            class95.method40(this);
            this.method1205();
        } else if (field707 == 25) {
            method1972(false);
            field729 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field3616.length; var7++) {
                if (Statics.field73[var7] != -1 && Statics.field3616[var7] == null) {
                    Statics.field3616[var7] = Statics.field264.method3873(Statics.field73[var7], 0);
                    if (Statics.field3616[var7] == null) {
                        var6 = false;
                        field729++;
                    }
                }
                if (Statics.field1830[var7] != -1 && Statics.field196[var7] == null) {
                    Statics.field196[var7] = Statics.field264.method3874(Statics.field1830[var7], 0, Statics.field1909[var7]);
                    if (Statics.field196[var7] == null) {
                        var6 = false;
                        field729++;
                    }
                }
            }
            if (var6) {
                field896 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field3616.length; var9++) {
                    byte[] var10 = Statics.field196[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field1171[var9] >> 8) * 64 - Statics.field348;
                        int var12 = (Statics.field1171[var9] & 0xFF) * 64 - Statics.field263;
                        if (field735) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= class65.method3771(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field733 != 0) {
                        method1640(class234.field2809 + class91.field1176 + class91.field1178 + 100 + "%" + class91.field1172, true);
                    }
                    method3393();
                    Statics.field596.method3047();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field734[var13].method3370();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class65.field519[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method3393();
                    class65.method3594();
                    int var17 = Statics.field3616.length;
                    class85.method3466();
                    method1972(true);
                    if (!field735) {
                        int var18 = 0;
                        label529: while (true) {
                            if (var18 >= var17) {
                                for (int var32 = 0; var32 < var17; var32++) {
                                    int var33 = (Statics.field1171[var32] >> 8) * 64 - Statics.field348;
                                    int var34 = (Statics.field1171[var32] & 0xFF) * 64 - Statics.field263;
                                    byte[] var35 = Statics.field3616[var32];
                                    if (var35 == null && Statics.field3262 < 800) {
                                        method3393();
                                        class65.method1183(var33, var34, 64, 64);
                                    }
                                }
                                method1972(true);
                                int var36 = 0;
                                while (true) {
                                    if (var36 >= var17) {
                                        break label529;
                                    }
                                    byte[] var37 = Statics.field196[var36];
                                    if (var37 != null) {
                                        int var38 = (Statics.field1171[var36] >> 8) * 64 - Statics.field348;
                                        int var39 = (Statics.field1171[var36] & 0xFF) * 64 - Statics.field263;
                                        method3393();
                                        Statics.method3253(var37, var38, var39, Statics.field596, field734);
                                    }
                                    var36++;
                                }
                            }
                            int var19 = (Statics.field1171[var18] >> 8) * 64 - Statics.field348;
                            int var20 = (Statics.field1171[var18] & 0xFF) * 64 - Statics.field263;
                            byte[] var21 = Statics.field3616[var18];
                            if (var21 != null) {
                                method3393();
                                int var22 = Statics.field397 * 8 - 48;
                                int var23 = Statics.field3262 * 8 - 48;
                                class182[] var24 = field734;
                                int var25 = 0;
                                label526: while (true) {
                                    if (var25 >= 4) {
                                        class310 var28 = new class310(var21);
                                        int var29 = 0;
                                        while (true) {
                                            if (var29 >= 4) {
                                                break label526;
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    class65.method2142(var28, var29, var19 + var30, var20 + var31, var22, var23, 0);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    for (int var26 = 0; var26 < 64; var26++) {
                                        for (int var27 = 0; var27 < 64; var27++) {
                                            if (var19 + var26 > 0 && var19 + var26 < 103 && var20 + var27 > 0 && var20 + var27 < 103) {
                                                var24[var25].field2128[var19 + var26][var20 + var27] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var25++;
                                }
                            }
                            var18++;
                        }
                    }
                    if (field735) {
                        int var40 = 0;
                        label475: while (true) {
                            if (var40 >= 4) {
                                for (int var63 = 0; var63 < 13; var63++) {
                                    for (int var64 = 0; var64 < 13; var64++) {
                                        int var65 = field748[0][var63][var64];
                                        if (var65 == -1) {
                                            class65.method1183(var63 * 8, var64 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1972(true);
                                int var66 = 0;
                                while (true) {
                                    if (var66 >= 4) {
                                        break label475;
                                    }
                                    method3393();
                                    for (int var67 = 0; var67 < 13; var67++) {
                                        label398: for (int var68 = 0; var68 < 13; var68++) {
                                            int var69 = field748[var66][var67][var68];
                                            if (var69 != -1) {
                                                int var70 = var69 >> 24 & 0x3;
                                                int var71 = var69 >> 1 & 0x3;
                                                int var72 = var69 >> 14 & 0x3FF;
                                                int var73 = var69 >> 3 & 0x7FF;
                                                int var74 = (var72 / 8 << 8) + var73 / 8;
                                                for (int var75 = 0; var75 < Statics.field1171.length; var75++) {
                                                    if (Statics.field1171[var75] == var74 && Statics.field196[var75] != null) {
                                                        byte[] var76 = Statics.field196[var75];
                                                        int var77 = var67 * 8;
                                                        int var78 = var68 * 8;
                                                        int var79 = (var72 & 0x7) * 8;
                                                        int var80 = (var73 & 0x7) * 8;
                                                        class143 var81 = Statics.field596;
                                                        class182[] var82 = field734;
                                                        class310 var83 = new class310(var76);
                                                        int var84 = -1;
                                                        while (true) {
                                                            int var85 = var83.method5208();
                                                            if (var85 == 0) {
                                                                continue label398;
                                                            }
                                                            var84 += var85;
                                                            int var86 = 0;
                                                            while (true) {
                                                                int var87 = var83.method5207();
                                                                if (var87 == 0) {
                                                                    break;
                                                                }
                                                                var86 += var87 - 1;
                                                                int var88 = var86 & 0x3F;
                                                                int var89 = var86 >> 6 & 0x3F;
                                                                int var90 = var86 >> 12;
                                                                int var91 = var83.method5193();
                                                                int var92 = var91 >> 2;
                                                                int var93 = var91 & 0x3;
                                                                if (var70 == var90 && var89 >= var79 && var89 < var79 + 8 && var88 >= var80 && var88 < var80 + 8) {
                                                                    class264 var94 = class264.method3595(var84);
                                                                    int var96 = var89 & 0x7;
                                                                    int var97 = var88 & 0x7;
                                                                    int var99 = var94.field3387;
                                                                    int var100 = var94.field3388;
                                                                    if ((var93 & 0x1) == 1) {
                                                                        int var101 = var99;
                                                                        var99 = var100;
                                                                        var100 = var101;
                                                                    }
                                                                    int var102 = var71 & 0x3;
                                                                    int var103;
                                                                    if (var102 == 0) {
                                                                        var103 = var96;
                                                                    } else if (var102 == 1) {
                                                                        var103 = var97;
                                                                    } else if (var102 == 2) {
                                                                        var103 = 7 - var96 - (var99 - 1);
                                                                    } else {
                                                                        var103 = 7 - var97 - (var100 - 1);
                                                                    }
                                                                    int var104 = var77 + var103;
                                                                    int var105 = var78 + class226.method768(var89 & 0x7, var88 & 0x7, var71, var94.field3387, var94.field3388, var93);
                                                                    if (var104 > 0 && var105 > 0 && var104 < 103 && var105 < 103) {
                                                                        int var106 = var66;
                                                                        if ((class65.field519[1][var104][var105] & 0x2) == 2) {
                                                                            var106 = var66 - 1;
                                                                        }
                                                                        class182 var107 = null;
                                                                        if (var106 >= 0) {
                                                                            var107 = var82[var106];
                                                                        }
                                                                        class65.method103(var66, var104, var105, var84, var71 + var93 & 0x3, var92, var81, var107);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var66++;
                                }
                            }
                            method3393();
                            for (int var41 = 0; var41 < 13; var41++) {
                                for (int var42 = 0; var42 < 13; var42++) {
                                    boolean var43 = false;
                                    int var44 = field748[var40][var41][var42];
                                    if (var44 != -1) {
                                        int var45 = var44 >> 24 & 0x3;
                                        int var46 = var44 >> 1 & 0x3;
                                        int var47 = var44 >> 14 & 0x3FF;
                                        int var48 = var44 >> 3 & 0x7FF;
                                        int var49 = (var47 / 8 << 8) + var48 / 8;
                                        for (int var50 = 0; var50 < Statics.field1171.length; var50++) {
                                            if (Statics.field1171[var50] == var49 && Statics.field3616[var50] != null) {
                                                byte[] var51 = Statics.field3616[var50];
                                                int var52 = var41 * 8;
                                                int var53 = var42 * 8;
                                                int var54 = (var47 & 0x7) * 8;
                                                int var55 = (var48 & 0x7) * 8;
                                                class182[] var56 = field734;
                                                for (int var57 = 0; var57 < 8; var57++) {
                                                    for (int var58 = 0; var58 < 8; var58++) {
                                                        if (var52 + var57 > 0 && var52 + var57 < 103 && var53 + var58 > 0 && var53 + var58 < 103) {
                                                            var56[var40].field2128[var52 + var57][var53 + var58] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class310 var59 = new class310(var51);
                                                for (int var60 = 0; var60 < 4; var60++) {
                                                    for (int var61 = 0; var61 < 64; var61++) {
                                                        for (int var62 = 0; var62 < 64; var62++) {
                                                            if (var45 == var60 && var61 >= var54 && var61 < var54 + 8 && var62 >= var55 && var62 < var55 + 8) {
                                                                class65.method2142(var59, var40, var52 + class226.method3286(var61 & 0x7, var62 & 0x7, var46), var53 + class226.method3695(var61 & 0x7, var62 & 0x7, var46), 0, 0, var46);
                                                            } else {
                                                                class65.method2142(var59, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var43 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var43) {
                                        class65.method770(var40, var41 * 8, var42 * 8);
                                    }
                                }
                            }
                            var40++;
                        }
                    }
                    method1972(true);
                    method3393();
                    class65.method1942(Statics.field596, field734);
                    method1972(true);
                    int var108 = class65.field520;
                    if (var108 > Statics.field2544) {
                        var108 = Statics.field2544;
                    }
                    if (var108 < Statics.field2544 - 1) {
                        int var109 = Statics.field2544 - 1;
                    }
                    if (field676) {
                        Statics.field596.method3014(class65.field520);
                    } else {
                        Statics.field596.method3014(0);
                    }
                    for (int var110 = 0; var110 < 104; var110++) {
                        for (int var111 = 0; var111 < 104; var111++) {
                            method98(var110, var111);
                        }
                    }
                    method3393();
                    for (class78 var112 = (class78) field806.method4621(); var112 != null; var112 = (class78) field806.method4641()) {
                        if (var112.field958 == -1) {
                            var112.field966 = 0;
                            method321(var112);
                        } else {
                            var112.method3401();
                        }
                    }
                    class264.field3376.method3172();
                    if (Statics.field9.method861()) {
                        class197 var113 = class197.method1625(class193.field2252, field723.field1341);
                        var113.field2377.method5295(1057001181);
                        field723.method2159(var113);
                    }
                    if (!field735) {
                        int var114 = (Statics.field397 - 6) / 8;
                        int var115 = (Statics.field397 + 6) / 8;
                        int var116 = (Statics.field3262 - 6) / 8;
                        int var117 = (Statics.field3262 + 6) / 8;
                        for (int var118 = var114 - 1; var118 <= var115 + 1; var118++) {
                            for (int var119 = var116 - 1; var119 <= var117 + 1; var119++) {
                                if (var118 < var114 || var118 > var115 || var119 < var116 || var119 > var117) {
                                    Statics.field264.method3896("m" + var118 + "_" + var119);
                                    Statics.field264.method3896("l" + var118 + "_" + var119);
                                }
                            }
                        }
                    }
                    method3372(30);
                    method3393();
                    class65.method2102();
                    class197 var120 = class197.method1625(class193.field2319, field723.field1341);
                    field723.method2159(var120);
                    class63.method424();
                } else {
                    field733 = 2;
                }
            } else {
                field733 = 1;
            }
        }
        if (field707 == 30) {
            this.method1206();
        } else if (field707 == 40 || field707 == 45) {
            this.method1205();
        }
    }

    @ObfuscatedName("client.aq(ZB)V")
    public final void method963(boolean arg0) {
        boolean var2 = class207.method2140();
        if (var2 && field705 && Statics.field346 != null) {
            Statics.field346.method2326();
        }
        if ((field707 == 10 || field707 == 20 || field707 == 30) && field891 != 0L && class307.method2184() > field891) {
            method5027(method538());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field883[var3] = true;
            }
        }
        if (field707 == 0) {
            this.method851(class95.field1209, class95.field1212, arg0);
        } else if (field707 == 5) {
            class95.method1181(Statics.field31, Statics.field1320, Statics.field3455);
        } else if (field707 == 10 || field707 == 11) {
            class95.method1181(Statics.field31, Statics.field1320, Statics.field3455);
        } else if (field707 == 20) {
            class95.method1181(Statics.field31, Statics.field1320, Statics.field3455);
        } else if (field707 == 25) {
            if (field733 == 1) {
                if (field729 > field712) {
                    field712 = field729;
                }
                int var4 = (field712 * 50 - field729 * 50) / field712;
                method1640(class234.field2809 + class91.field1176 + class91.field1178 + var4 + "%" + class91.field1172, false);
            } else if (field733 == 2) {
                if (field896 > field792) {
                    field792 = field896;
                }
                int var5 = (field792 * 50 - field896 * 50) / field792 + 50;
                method1640(class234.field2809 + class91.field1176 + class91.field1178 + var5 + "%" + class91.field1172, false);
            } else {
                method1640(class234.field2809, false);
            }
        } else if (field707 == 30) {
            this.method1209();
        } else if (field707 == 40) {
            method1640(class234.field2841 + class91.field1176 + class234.field2811, false);
        } else if (field707 == 45) {
            method1640(class234.field2885, false);
        }
        if (field707 == 30 && field721 == 0 && !arg0 && !field892) {
            for (int var6 = 0; var6 < field682; var6++) {
                if (field884[var6]) {
                    Statics.field251.method819(field886[var6], field887[var6], field888[var6], field908[var6]);
                    field884[var6] = false;
                }
            }
        } else if (field707 > 0) {
            Statics.field251.method812(0, 0);
            for (int var7 = 0; var7 < field682; var7++) {
                field884[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.al(I)V")
    public final void method856() {
        if (Statics.field1081.method2065()) {
            Statics.field1081.method2067();
        }
        if (Statics.field3739 != null) {
            Statics.field3739.field603 = false;
        }
        Statics.field3739 = null;
        field723.method2161();
        class55.method3420();
        class64.method2169();
        Statics.field664 = null;
        if (Statics.field346 != null) {
            Statics.field346.method2327();
        }
        if (Statics.field4044 != null) {
            Statics.field4044.method2327();
        }
        class247.method3152();
        Object var1 = class245.field3181;
        synchronized (class245.field3181) {
            if (class245.field3180 != 0) {
                class245.field3180 = 1;
                try {
                    class245.field3181.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field2005 != null) {
            Statics.field2005.method3157();
            Statics.field2005 = null;
        }
        try {
            class177.field2091.method6163();
            for (int var4 = 0; var4 < Statics.field4041; var4++) {
                Statics.field2094[var4].method6163();
            }
            class177.field2083.method6163();
            class177.field2093.method6163();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ft.ez(II)V")
    public static void method3372(int arg0) {
        if (field707 == arg0) {
            return;
        }
        if (field707 == 0) {
            Statics.field9.method858();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field749 = 0;
            field823 = 0;
            field709 = 0;
            field793.method4720(arg0);
            if (arg0 != 20) {
                method211(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field509 != null) {
            Statics.field509.method3308();
            Statics.field509 = null;
        }
        if (field707 == 25) {
            field733 = 0;
            field729 = 0;
            field712 = 1;
            field896 = 0;
            field792 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method5573(Statics.field1953, Statics.field2545, true, 0);
        } else if (arg0 == 20) {
            class95.method5573(Statics.field1953, Statics.field2545, true, field707 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method5573(Statics.field1953, Statics.field2545, false, 4);
        } else {
            class95.method3850();
        }
        field707 = arg0;
    }

    @ObfuscatedName("client.eb(I)V")
    public void method1588() {
        if (field707 != 1000) {
            boolean var1 = class247.method3137();
            if (!var1) {
                this.method1203();
            }
        }
    }

    @ObfuscatedName("client.et(I)V")
    public void method1203() {
        if (class247.field3210 >= 4) {
            this.method830("js5crc");
            field707 = 1000;
            return;
        }
        if (class247.field3194 >= 4) {
            if (field707 <= 5) {
                this.method830("js5io");
                field707 = 1000;
                return;
            }
            field713 = 3000;
            class247.field3194 = 3;
        }
        if (--field713 + 1 > 0) {
            return;
        }
        try {
            if (field681 == 0) {
                Statics.field2021 = Statics.field489.method3277(Statics.field560, Statics.field369);
                field681++;
            }
            if (field681 == 1) {
                if (Statics.field2021.field2065 == 2) {
                    this.method1452(-1);
                    return;
                }
                if (Statics.field2021.field2065 == 1) {
                    field681++;
                }
            }
            if (field681 == 2) {
                if (field726) {
                    Statics.field552 = class315.method3133((Socket) Statics.field2021.field2068, 40000, 5000);
                } else {
                    Statics.field552 = new class181((Socket) Statics.field2021.field2068, Statics.field489, 5000);
                }
                class310 var1 = new class310(5);
                var1.method5177(15);
                var1.method5295(191);
                Statics.field552.method3315(var1.field3731, 0, 5);
                field681++;
                Statics.field429 = class307.method2184();
            }
            if (field681 == 3) {
                if (Statics.field552.method3310() > 0 || !field726 && field707 <= 5) {
                    int var2 = Statics.field552.method3309();
                    if (var2 != 0) {
                        this.method1452(var2);
                        return;
                    }
                    field681++;
                } else if (class307.method2184() - Statics.field429 > 30000L) {
                    this.method1452(-2);
                    return;
                }
            }
            if (field681 == 4) {
                class247.method3827(Statics.field552, field707 > 20);
                Statics.field2021 = null;
                Statics.field552 = null;
                field681 = 0;
                field928 = 0;
            }
        } catch (IOException var4) {
            this.method1452(-3);
        }
    }

    @ObfuscatedName("client.ef(II)V")
    public void method1452(int arg0) {
        Statics.field2021 = null;
        Statics.field552 = null;
        field681 = 0;
        if (Statics.field955 == Statics.field369) {
            Statics.field369 = Statics.field126;
        } else {
            Statics.field369 = Statics.field955;
        }
        field928++;
        if (field928 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field707 <= 5) {
                this.method830("js5connect_full");
                field707 = 1000;
            } else {
                field713 = 3000;
            }
        } else if (field928 >= 2 && arg0 == 6) {
            this.method830("js5connect_outofdate");
            field707 = 1000;
        } else if (field928 >= 4) {
            if (field707 <= 5) {
                this.method830("js5connect");
                field707 = 1000;
            } else {
                field713 = 3000;
            }
        }
    }

    @ObfuscatedName("ep.ey(Liw;Ljava/lang/String;B)V")
    public static void method2840(class246 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field727.add(var2);
        field950 += var2.field547;
    }

    @ObfuscatedName("v.ew(I)Z")
    public static boolean method173() {
        if (field727 == null || field767 >= field727.size()) {
            return true;
        }
        while (field767 < field727.size()) {
            class68 var0 = (class68) field727.get(field767);
            if (!var0.method1062()) {
                return false;
            }
            field767++;
        }
        return true;
    }

    @ObfuscatedName("aw.ex(I)I")
    public static int method659() {
        if (field727 == null || field767 >= field727.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field767; var1++) {
            var0 += ((class68) field727.get(var1)).field548;
        }
        return var0 * 10000 / field950;
    }

    @ObfuscatedName("t.ed(I)V")
    public static void method39() {
        if (field702 == 0) {
            Statics.field596 = new class143(4, 104, 104, class65.field527);
            for (int var0 = 0; var0 < 4; var0++) {
                field734[var0] = new class182(104, 104);
            }
            Statics.field633 = new class335(512, 512);
            class95.field1212 = class234.field2812;
            class95.field1209 = 5;
            field702 = 20;
        } else if (field702 == 20) {
            class95.field1212 = class234.field2813;
            class95.field1209 = 10;
            field702 = 30;
        } else if (field702 == 30) {
            Statics.field2141 = method248(0, false, true, true);
            Statics.field853 = method248(1, false, true, true);
            Statics.field3159 = method248(2, true, false, true);
            Statics.field291 = method248(3, false, true, true);
            Statics.field103 = method248(4, false, true, true);
            Statics.field264 = method248(5, true, true, true);
            Statics.field2133 = method248(6, true, true, true);
            Statics.field301 = method248(7, false, true, true);
            Statics.field2545 = method248(8, false, true, true);
            Statics.field1980 = method248(9, false, true, true);
            Statics.field1953 = method248(10, false, true, true);
            Statics.field83 = method248(11, false, true, true);
            Statics.field630 = method248(12, false, true, true);
            Statics.field1821 = method248(13, true, false, true);
            Statics.field2581 = method248(14, false, true, true);
            Statics.field2580 = method248(15, false, true, true);
            Statics.field20 = method248(17, true, true, true);
            Statics.field609 = method248(18, false, true, true);
            Statics.field363 = method248(19, false, true, true);
            Statics.field3690 = method248(20, false, true, true);
            class95.field1212 = class234.field3090;
            class95.field1209 = 20;
            field702 = 40;
        } else if (field702 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field2141.method3992() * 4 / 100;
            int var3 = var2 + Statics.field853.method3992() * 4 / 100;
            int var4 = var3 + Statics.field3159.method3992() * 2 / 100;
            int var5 = var4 + Statics.field291.method3992() * 2 / 100;
            int var6 = var5 + Statics.field103.method3992() * 6 / 100;
            int var7 = var6 + Statics.field264.method3992() * 4 / 100;
            int var8 = var7 + Statics.field2133.method3992() * 2 / 100;
            int var9 = var8 + Statics.field301.method3992() * 56 / 100;
            int var10 = var9 + Statics.field2545.method3992() * 2 / 100;
            int var11 = var10 + Statics.field1980.method3992() * 2 / 100;
            int var12 = var11 + Statics.field1953.method3992() * 2 / 100;
            int var13 = var12 + Statics.field83.method3992() * 2 / 100;
            int var14 = var13 + Statics.field630.method3992() * 2 / 100;
            int var15 = var14 + Statics.field1821.method3992() * 2 / 100;
            int var16 = var15 + Statics.field2581.method3992() * 2 / 100;
            int var17 = var16 + Statics.field2580.method3992() * 2 / 100;
            int var18 = var17 + Statics.field363.method3992() / 100;
            int var19 = var18 + Statics.field609.method3992() / 100;
            int var20 = var19 + Statics.field3690.method3992() / 100;
            int var21 = var20 + (Statics.field20.method3975() && Statics.field20.method3877() ? 1 : 0);
            if (var21 == 100) {
                method2840(Statics.field2141, "Animations");
                method2840(Statics.field853, "Skeletons");
                method2840(Statics.field103, "Sound FX");
                method2840(Statics.field264, "Maps");
                method2840(Statics.field2133, "Music Tracks");
                method2840(Statics.field301, "Models");
                method2840(Statics.field2545, "Sprites");
                method2840(Statics.field83, "Music Jingles");
                method2840(Statics.field2581, "Music Samples");
                method2840(Statics.field2580, "Music Patches");
                method2840(Statics.field363, "World Map");
                method2840(Statics.field609, "World Map Geography");
                method2840(Statics.field3690, "World Map Ground");
                Statics.field2115 = new class322();
                Statics.field2115.method5562(Statics.field20);
                class95.field1212 = class234.field2816;
                class95.field1209 = 30;
                field702 = 45;
            } else {
                if (var21 != 0) {
                    class95.field1212 = class234.field2815 + var21 + "%";
                }
                class95.field1209 = 30;
            }
        } else if (field702 == 45) {
            class115.method20(22050, !field676, 2);
            class208 var22 = new class208();
            var22.method3501(9, 128);
            Statics.field346 = class115.method2019(Statics.field489, 0, 22050);
            Statics.field346.method2323(var22);
            class207.method3138(Statics.field2580, Statics.field2581, Statics.field103, var22);
            Statics.field4044 = class115.method2019(Statics.field489, 1, 2048);
            Statics.field1277 = new class108();
            Statics.field4044.method2323(Statics.field1277);
            Statics.field54 = new class122(22050, Statics.field1448);
            class95.field1212 = class234.field2817;
            class95.field1209 = 35;
            field702 = 50;
            Statics.field430 = new class303(Statics.field2545, Statics.field1821);
        } else if (field702 == 50) {
            int var23 = class302.method5023().length;
            field859 = Statics.field430.method5031(class302.method5023());
            if (field859.size() < var23) {
                class95.field1212 = class234.field2818 + field859.size() * 100 / var23 + "%";
                class95.field1209 = 40;
            } else {
                Statics.field1320 = (class305) field859.get(class302.field3683);
                Statics.field3455 = (class305) field859.get(class302.field3682);
                Statics.field31 = (class305) field859.get(class302.field3686);
                Statics.field250 = field944.method5914();
                class95.field1212 = class234.field3043;
                class95.field1209 = 40;
                field702 = 60;
            }
        } else if (field702 == 60) {
            class246 var24 = Statics.field1953;
            class246 var25 = Statics.field2545;
            int var26 = 0;
            if (var24.method3895("title.jpg", "")) {
                var26++;
            }
            if (var25.method3895("logo", "")) {
                var26++;
            }
            if (var25.method3895("logo_deadman_mode", "")) {
                var26++;
            }
            if (var25.method3895("logo_seasonal_mode", "")) {
                var26++;
            }
            if (var25.method3895("titlebox", "")) {
                var26++;
            }
            if (var25.method3895("titlebutton", "")) {
                var26++;
            }
            if (var25.method3895("runes", "")) {
                var26++;
            }
            if (var25.method3895("title_mute", "")) {
                var26++;
            }
            if (var25.method3895("options_radio_buttons,0", "")) {
                var26++;
            }
            if (var25.method3895("options_radio_buttons,2", "")) {
                var26++;
            }
            if (var25.method3895("options_radio_buttons,4", "")) {
                var26++;
            }
            if (var25.method3895("options_radio_buttons,6", "")) {
                var26++;
            }
            var25.method3895("sl_back", "");
            var25.method3895("sl_flags", "");
            var25.method3895("sl_arrows", "");
            var25.method3895("sl_stars", "");
            var25.method3895("sl_button", "");
            byte var29 = 12;
            if (var26 < var29) {
                class95.field1212 = class234.field2957 + var26 * 100 / var29 + "%";
                class95.field1209 = 50;
            } else {
                class95.field1212 = class234.field2821;
                class95.field1209 = 50;
                method3372(5);
                field702 = 70;
            }
        } else if (field702 == 70) {
            if (Statics.field3159.method3877()) {
                class246 var31 = Statics.field3159;
                Statics.field3 = var31;
                class255.method2071(Statics.field3159);
                Statics.method3136(Statics.field3159, Statics.field301);
                class246 var32 = Statics.field3159;
                class246 var33 = Statics.field301;
                boolean var34 = field676;
                Statics.field3406 = var32;
                Statics.field2530 = var33;
                class264.field3401 = var34;
                class246 var35 = Statics.field3159;
                class246 var36 = Statics.field301;
                Statics.field3514 = var35;
                Statics.field3485 = var36;
                class261.method2139(Statics.field3159);
                class265.method3216(Statics.field3159, Statics.field301, field675, Statics.field1320);
                class246 var37 = Statics.field3159;
                class246 var38 = Statics.field2141;
                class246 var39 = Statics.field853;
                Statics.field3546 = var37;
                Statics.field3544 = var38;
                Statics.field118 = var39;
                class246 var40 = Statics.field3159;
                class246 var41 = Statics.field301;
                Statics.field3275 = var40;
                Statics.field3279 = var41;
                class246 var42 = Statics.field3159;
                Statics.field3322 = var42;
                class251.method3839(Statics.field3159);
                class246 var43 = Statics.field291;
                class246 var44 = Statics.field301;
                class246 var45 = Statics.field2545;
                class246 var46 = Statics.field1821;
                Statics.field2598 = var43;
                Statics.field2700 = var44;
                Statics.field1301 = var45;
                Statics.field1155 = var46;
                Statics.field2597 = new class227[Statics.field2598.method3885()][];
                Statics.field3875 = new boolean[Statics.field2598.method3885()];
                class250.method47(Statics.field3159);
                class262.method3783(Statics.field3159);
                class246 var47 = Statics.field3159;
                Statics.field3258 = var47;
                class246 var48 = Statics.field3159;
                Statics.field3331 = var48;
                Statics.field1081 = new class100();
                class246 var49 = Statics.field3159;
                class246 var50 = Statics.field2545;
                class246 var51 = Statics.field1821;
                Statics.field3348 = var49;
                Statics.field3365 = var50;
                Statics.field3347 = var51;
                class246 var52 = Statics.field3159;
                class246 var53 = Statics.field2545;
                Statics.field3309 = var52;
                Statics.field3302 = var53;
                class246 var54 = Statics.field3159;
                class246 var55 = Statics.field2545;
                Statics.field3256 = var55;
                if (var54.method3877()) {
                    Statics.field3238 = var54.method3884(35);
                    Statics.field3236 = new class252[Statics.field3238];
                    for (int var56 = 0; var56 < Statics.field3238; var56++) {
                        byte[] var57 = var54.method3873(35, var56);
                        Statics.field3236[var56] = new class252(var56);
                        if (var57 != null) {
                            Statics.field3236[var56].method4082(new class310(var57));
                            Statics.field3236[var56].method4085();
                        }
                    }
                }
                class95.field1212 = class234.field2823;
                class95.field1209 = 60;
                field702 = 80;
            } else {
                class95.field1212 = class234.field2822 + Statics.field3159.method3983() + "%";
                class95.field1209 = 60;
            }
        } else if (field702 == 80) {
            int var58 = 0;
            if (Statics.field2359 == null) {
                Statics.field2359 = class336.method4791(Statics.field2545, Statics.field2115.field3831, 0);
            } else {
                var58++;
            }
            if (Statics.field3689 == null) {
                Statics.field3689 = class336.method4791(Statics.field2545, Statics.field2115.field3832, 0);
            } else {
                var58++;
            }
            if (Statics.field1364 == null) {
                Statics.field1364 = class336.method3244(Statics.field2545, Statics.field2115.field3833, 0);
            } else {
                var58++;
            }
            if (Statics.field3582 == null) {
                Statics.field3582 = class336.method3856(Statics.field2545, Statics.field2115.field3834, 0);
            } else {
                var58++;
            }
            if (Statics.field879 == null) {
                Statics.field879 = class336.method3856(Statics.field2545, Statics.field2115.field3840, 0);
            } else {
                var58++;
            }
            if (Statics.field1298 == null) {
                Statics.field1298 = class336.method3856(Statics.field2545, Statics.field2115.field3836, 0);
            } else {
                var58++;
            }
            if (Statics.field3320 == null) {
                Statics.field3320 = class336.method3856(Statics.field2545, Statics.field2115.field3839, 0);
            } else {
                var58++;
            }
            if (Statics.field546 == null) {
                Statics.field546 = class336.method3856(Statics.field2545, Statics.field2115.field3838, 0);
            } else {
                var58++;
            }
            if (Statics.field3111 == null) {
                Statics.field3111 = class336.method3856(Statics.field2545, Statics.field2115.field3837, 0);
            } else {
                var58++;
            }
            if (Statics.field82 == null) {
                Statics.field82 = class336.method3244(Statics.field2545, Statics.field2115.field3835, 0);
            } else {
                var58++;
            }
            if (Statics.field62 == null) {
                Statics.field62 = class336.method3244(Statics.field2545, Statics.field2115.field3841, 0);
            } else {
                var58++;
            }
            if (var58 < 11) {
                class95.field1212 = class234.field2824 + var58 * 100 / 12 + "%";
                class95.field1209 = 70;
            } else {
                Statics.field3718 = Statics.field62;
                Statics.field3689.method5757();
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1364[0].method5735(var59 + var62, var60 + var62, var61 + var62);
                class95.field1212 = class234.field2825;
                class95.field1209 = 70;
                field702 = 90;
            }
        } else if (field702 == 90) {
            if (Statics.field1980.method3877()) {
                Statics.field298 = new class129(Statics.field1980, Statics.field2545, 20, 0.8D, field676 ? 64 : 128);
                class140.method2874(Statics.field298);
                class140.method2911(0.8D);
                field702 = 100;
            } else {
                class95.field1212 = class234.field2826 + "0%";
                class95.field1209 = 90;
            }
        } else if (field702 == 100) {
            int var63 = Statics.field298.method2612();
            if (var63 < 100) {
                class95.field1212 = class234.field2826 + var63 + "%";
                class95.field1209 = 90;
            } else {
                class95.field1212 = class234.field2827;
                class95.field1209 = 90;
                field702 = 110;
            }
        } else if (field702 == 110) {
            Statics.field3739 = new class73();
            Statics.field489.method3280(Statics.field3739, 10);
            class95.field1212 = class234.field2828;
            class95.field1209 = 92;
            field702 = 120;
        } else if (field702 == 120) {
            if (Statics.field1953.method3895("huffman", "")) {
                class219 var64 = new class219(Statics.field1953.method3893("huffman", ""));
                Statics.field2546 = var64;
                class95.field1212 = class234.field2878;
                class95.field1209 = 94;
                field702 = 130;
            } else {
                class95.field1212 = class234.field2991 + "%";
                class95.field1209 = 94;
            }
        } else if (field702 == 130) {
            if (!Statics.field291.method3877()) {
                class95.field1212 = class234.field3056 + Statics.field291.method3983() * 4 / 5 + "%";
                class95.field1209 = 96;
            } else if (!Statics.field630.method3877()) {
                class95.field1212 = class234.field3056 + (80 + Statics.field630.method3983() / 6) + "%";
                class95.field1209 = 96;
            } else if (Statics.field1821.method3877()) {
                class95.field1212 = class234.field2832;
                class95.field1209 = 98;
                field702 = 140;
            } else {
                class95.field1212 = class234.field3056 + (96 + Statics.field1821.method3983() / 50) + "%";
                class95.field1209 = 96;
            }
        } else if (field702 == 140) {
            class95.field1209 = 100;
            if (Statics.field363.method3903(class45.field323.field325)) {
                if (Statics.field626 == null) {
                    Statics.field626 = new class343();
                    Statics.field626.method5943(Statics.field363, Statics.field609, Statics.field3690, Statics.field31, field859, Statics.field1364);
                }
                class95.field1212 = class234.field2834;
                field702 = 150;
            } else {
                class95.field1212 = class234.field2934 + Statics.field363.method3897(class45.field323.field325) / 10 + "%";
            }
        } else if (field702 == 150) {
            method3372(10);
        }
    }

    @ObfuscatedName("ab.ev(IZZZI)Liw;")
    public static class246 method248(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class318 var4 = null;
        if (class177.field2091 != null) {
            var4 = new class318(arg0, class177.field2091, Statics.field2094[arg0], 1000000);
        }
        return new class246(var4, Statics.field1825, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ei(I)V")
    public final void method1205() {
        class315 var1 = field723.method2163();
        class309 var2 = field723.field1342;
        try {
            if (field749 == 0) {
                if (Statics.field295 == null && (field875.method2038() || field823 > 250)) {
                    Statics.field295 = field875.method2028();
                    field875.method2026();
                    field875 = null;
                }
                if (Statics.field295 != null) {
                    if (var1 != null) {
                        var1.method3308();
                        var1 = null;
                    }
                    Statics.field611 = null;
                    field714 = false;
                    field823 = 0;
                    field749 = 1;
                }
            }
            if (field749 == 1) {
                if (Statics.field611 == null) {
                    Statics.field611 = Statics.field489.method3277(Statics.field560, Statics.field369);
                }
                if (Statics.field611.field2065 == 2) {
                    throw new IOException();
                }
                if (Statics.field611.field2065 == 1) {
                    if (field726) {
                        var1 = class315.method3133((Socket) Statics.field611.field2068, 40000, 5000);
                    } else {
                        var1 = new class181((Socket) Statics.field611.field2068, Statics.field489, 5000);
                    }
                    field723.method2180(var1);
                    Statics.field611 = null;
                    field749 = 2;
                }
            }
            if (field749 == 2) {
                field723.method2157();
                class197 var3 = class197.method4007();
                var3.field2377.method5177(class194.field2361.field2356);
                field723.method2159(var3);
                field723.method2158();
                var2.field3734 = 0;
                field749 = 3;
            }
            if (field749 == 3) {
                if (Statics.field346 != null) {
                    Statics.field346.method2325();
                }
                if (Statics.field4044 != null) {
                    Statics.field4044.method2325();
                }
                boolean var4 = true;
                if (field726 && !var1.method3311(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3309();
                    if (Statics.field346 != null) {
                        Statics.field346.method2325();
                    }
                    if (Statics.field4044 != null) {
                        Statics.field4044.method2325();
                    }
                    if (var5 != 0) {
                        method765(var5);
                        return;
                    }
                    var2.field3734 = 0;
                    field749 = 4;
                }
            }
            if (field749 == 4) {
                if (var2.field3734 < 8) {
                    int var6 = var1.method3310();
                    if (var6 > 8 - var2.field3734) {
                        var6 = 8 - var2.field3734;
                    }
                    if (var6 > 0) {
                        var1.method3312(var2.field3731, var2.field3734, var6);
                        var2.field3734 += var6;
                    }
                }
                if (var2.field3734 == 8) {
                    var2.field3734 = 0;
                    Statics.field1431 = var2.method5285();
                    field749 = 5;
                }
            }
            if (field749 == 5) {
                field723.field1342.field3734 = 0;
                field723.method2157();
                class309 var7 = new class309(500);
                int[] var8 = new int[] { Statics.field295.nextInt(), Statics.field295.nextInt(), Statics.field295.nextInt(), Statics.field295.nextInt() };
                var7.field3734 = 0;
                var7.method5177(1);
                var7.method5295(var8[0]);
                var7.method5295(var8[1]);
                var7.method5295(var8[2]);
                var7.method5295(var8[3]);
                var7.method5182(Statics.field1431);
                if (field707 == 40) {
                    var7.method5295(Statics.field2018[0]);
                    var7.method5295(Statics.field2018[1]);
                    var7.method5295(Statics.field2018[2]);
                    var7.method5295(Statics.field2018[3]);
                } else {
                    var7.method5177(field711.method28());
                    switch(field711.field2043) {
                        case 0:
                        case 1:
                            var7.method5351(Statics.field1071);
                            var7.field3734++;
                            break;
                        case 2:
                            var7.field3734 += 4;
                            break;
                        case 3:
                            LinkedHashMap var10 = Statics.field1694.field1092;
                            String var11 = class95.field1220;
                            int var12 = var11.length();
                            int var13 = 0;
                            for (int var14 = 0; var14 < var12; var14++) {
                                var13 = (var13 << 5) - var13 + var11.charAt(var14);
                            }
                            var7.method5295((Integer) var10.get(var13));
                    }
                    var7.method5177(class323.field3842.method28());
                    var7.method5322(class95.field1221);
                }
                var7.method5216(class93.field1187, class93.field1188);
                Statics.field2018 = var8;
                class197 var16 = class197.method4007();
                var16.field2377.field3734 = 0;
                if (field707 == 40) {
                    var16.field2377.method5177(class194.field2353.field2356);
                } else {
                    var16.field2377.method5177(class194.field2352.field2356);
                }
                var16.field2377.method5178(0);
                int var17 = var16.field2377.field3734;
                var16.field2377.method5295(191);
                var16.field2377.method5295(1);
                var16.field2377.method5177(field677);
                var16.field2377.method5186(var7.field3731, 0, var7.field3734);
                int var18 = var16.field2377.field3734;
                var16.field2377.method5322(class95.field1220);
                var16.field2377.method5177((field892 ? 1 : 0) << 1 | (field676 ? 1 : 0));
                var16.field2377.method5178(Statics.field1642);
                var16.field2377.method5178(Statics.field475);
                method657(var16.field2377);
                var16.field2377.method5322(Statics.field2404);
                var16.field2377.method5295(Statics.field100);
                class310 var19 = new class310(Statics.field250.method5925());
                Statics.field250.method5923(var19);
                var16.field2377.method5186(var19.field3731, 0, var19.field3731.length);
                var16.field2377.method5177(field677);
                var16.field2377.method5295(0);
                var16.field2377.method5239(Statics.field363.field3172);
                var16.field2377.method5239(Statics.field2581.field3172);
                var16.field2377.method5245(Statics.field1953.field3172);
                var16.field2377.method5238(Statics.field2545.field3172);
                var16.field2377.method5295(Statics.field3690.field3172);
                var16.field2377.method5239(Statics.field609.field3172);
                var16.field2377.method5245(Statics.field103.field3172);
                var16.field2377.method5245(Statics.field2580.field3172);
                var16.field2377.method5238(Statics.field83.field3172);
                var16.field2377.method5239(Statics.field291.field3172);
                var16.field2377.method5239(Statics.field1821.field3172);
                var16.field2377.method5239(Statics.field301.field3172);
                var16.field2377.method5245(Statics.field20.field3172);
                var16.field2377.method5295(Statics.field853.field3172);
                var16.field2377.method5239(0);
                var16.field2377.method5295(Statics.field630.field3172);
                var16.field2377.method5239(Statics.field1980.field3172);
                var16.field2377.method5239(Statics.field2141.field3172);
                var16.field2377.method5295(Statics.field3159.field3172);
                var16.field2377.method5295(Statics.field2133.field3172);
                var16.field2377.method5239(Statics.field264.field3172);
                var16.field2377.method5214(var8, var18, var16.field2377.field3734);
                var16.field2377.method5244(var16.field2377.field3734 - var17);
                field723.method2159(var16);
                field723.method2158();
                field723.field1341 = new class338(var8);
                int[] var20 = new int[4];
                for (int var21 = 0; var21 < 4; var21++) {
                    var20[var21] = var8[var21] + 50;
                }
                var2.method5136(var20);
                field749 = 6;
            }
            if (field749 == 6 && var1.method3310() > 0) {
                int var22 = var1.method3309();
                if (var22 == 21 && field707 == 20) {
                    field749 = 12;
                } else if (var22 == 2) {
                    field749 = 14;
                } else if (var22 == 15 && field707 == 40) {
                    field723.field1344 = -1;
                    field749 = 19;
                } else if (var22 == 64) {
                    field749 = 10;
                } else if (var22 == 23 && field709 < 1) {
                    field709++;
                    field749 = 0;
                } else if (var22 == 29) {
                    field749 = 17;
                } else if (var22 == 69) {
                    field749 = 7;
                } else {
                    method765(var22);
                    return;
                }
            }
            if (field749 == 7 && var1.method3310() >= 2) {
                var1.method3312(var2.field3731, 0, 2);
                var2.field3734 = 0;
                Statics.field213 = var2.method5195();
                field749 = 8;
            }
            if (field749 == 8 && var1.method3310() >= Statics.field213) {
                var2.field3734 = 0;
                var1.method3312(var2.field3731, var2.field3734, Statics.field213);
                class8[] var23 = new class8[] { class8.field38 };
                class8 var24 = var23[var2.method5193()];
                try {
                    class13 var25 = class14.method70(var24);
                    this.field715 = new class10(var2, var25);
                    field749 = 9;
                } catch (Exception var66) {
                    method765(22);
                    return;
                }
            }
            if (field749 == 9 && this.field715.method77()) {
                this.field755 = this.field715.method90();
                this.field715.method78();
                this.field715 = null;
                if (this.field755 == null) {
                    method765(22);
                    return;
                }
                field723.method2157();
                class197 var27 = class197.method4007();
                var27.field2377.method5177(class194.field2354.field2356);
                var27.field2377.method5178(this.field755.field3734);
                var27.field2377.method5187(this.field755);
                field723.method2159(var27);
                field723.method2158();
                this.field755 = null;
                field749 = 6;
            }
            if (field749 == 10 && var1.method3310() > 0) {
                Statics.field457 = var1.method3309();
                field749 = 11;
            }
            if (field749 == 11 && var1.method3310() >= Statics.field457) {
                var1.method3312(var2.field3731, 0, Statics.field457);
                var2.field3734 = 0;
                field749 = 6;
            }
            if (field749 == 12 && var1.method3310() > 0) {
                field710 = (var1.method3309() + 3) * 60;
                field749 = 13;
            }
            if (field749 == 13) {
                field823 = 0;
                class95.method3154(class234.field2840, class234.field2831, field710 / 60 + class234.field2842);
                if (--field710 <= 0) {
                    field749 = 0;
                }
            } else {
                if (field749 == 14 && var1.method3310() >= 1) {
                    Statics.field1077 = var1.method3309();
                    field749 = 15;
                }
                if (field749 == 15 && var1.method3310() >= Statics.field1077) {
                    boolean var28 = var1.method3309() == 1;
                    var1.method3312(var2.field3731, 0, 4);
                    var2.field3734 = 0;
                    boolean var29 = false;
                    if (var28) {
                        int var30 = var2.method5149() << 24;
                        int var31 = var30 | var2.method5149() << 16;
                        int var32 = var31 | var2.method5149() << 8;
                        int var33 = var32 | var2.method5149();
                        String var34 = class95.field1220;
                        int var35 = var34.length();
                        int var36 = 0;
                        int var37 = 0;
                        while (true) {
                            if (var37 >= var35) {
                                if (Statics.field1694.field1092.size() >= 10 && !Statics.field1694.field1092.containsKey(var36)) {
                                    Iterator var40 = Statics.field1694.field1092.entrySet().iterator();
                                    var40.next();
                                    var40.remove();
                                }
                                Statics.field1694.field1092.put(var36, var33);
                                break;
                            }
                            var36 = (var36 << 5) - var36 + var34.charAt(var37);
                            var37++;
                        }
                    }
                    if (field678) {
                        Statics.field1694.field1086 = class95.field1220;
                    } else {
                        Statics.field1694.field1086 = null;
                    }
                    class83.method658();
                    field814 = var1.method3309();
                    field849 = var1.method3309() == 1;
                    field794 = var1.method3309();
                    field794 <<= 0x8;
                    field794 += var1.method3309();
                    field889 = var1.method3309();
                    var1.method3312(var2.field3731, 0, 1);
                    var2.field3734 = 0;
                    class192[] var41 = class192.method3454();
                    int var42 = var2.method5156();
                    if (var42 < 0 || var42 >= var41.length) {
                        throw new IOException(var42 + " " + var2.field3734);
                    }
                    field723.field1343 = var41[var42];
                    field723.field1344 = field723.field1343.field2158;
                    var1.method3312(var2.field3731, 0, 2);
                    var2.field3734 = 0;
                    field723.field1344 = var2.method5195();
                    try {
                        client var43 = Statics.field9;
                        JSObject.getWindow(var43).call("zap", (Object[]) null);
                    } catch (Throwable var65) {
                    }
                    field749 = 16;
                }
                if (field749 != 16) {
                    if (field749 == 17 && var1.method3310() >= 2) {
                        var2.field3734 = 0;
                        var1.method3312(var2.field3731, 0, 2);
                        var2.field3734 = 0;
                        Statics.field353 = var2.method5195();
                        field749 = 18;
                    }
                    if (field749 == 18 && var1.method3310() >= Statics.field353) {
                        var2.field3734 = 0;
                        var1.method3312(var2.field3731, 0, Statics.field353);
                        var2.field3734 = 0;
                        String var56 = var2.method5202();
                        String var57 = var2.method5202();
                        String var58 = var2.method5202();
                        class95.method3154(var56, var57, var58);
                        method3372(10);
                    }
                    if (field749 == 19) {
                        if (field723.field1344 == -1) {
                            if (var1.method3310() < 2) {
                                return;
                            }
                            var1.method3312(var2.field3731, 0, 2);
                            var2.field3734 = 0;
                            field723.field1344 = var2.method5195();
                        }
                        if (var1.method3310() >= field723.field1344) {
                            var1.method3312(var2.field3731, 0, field723.field1344);
                            var2.field3734 = 0;
                            int var59 = field723.field1344;
                            field793.method4709();
                            field723.method2157();
                            field723.field1342.field3734 = 0;
                            field723.field1343 = null;
                            field723.field1337 = null;
                            field723.field1349 = null;
                            field723.field1347 = null;
                            field723.field1344 = 0;
                            field723.field1346 = 0;
                            field691 = 0;
                            method4701();
                            field910 = 0;
                            field739 = 0;
                            for (int var60 = 0; var60 < 2048; var60++) {
                                field861[var60] = null;
                            }
                            Statics.field141 = null;
                            for (int var61 = 0; var61 < field718.length; var61++) {
                                class89 var62 = field718[var61];
                                if (var62 != null) {
                                    var62.field999 = -1;
                                    var62.field1000 = false;
                                }
                            }
                            class69.field555 = new class328(32);
                            method3372(30);
                            for (int var63 = 0; var63 < 100; var63++) {
                                field883[var63] = true;
                            }
                            method126();
                            class99.method4444(var2);
                            if (var2.field3734 != var59) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field823++;
                        if (field823 > 2000) {
                            if (field709 < 1) {
                                if (Statics.field955 == Statics.field369) {
                                    Statics.field369 = Statics.field126;
                                } else {
                                    Statics.field369 = Statics.field955;
                                }
                                field709++;
                                field749 = 0;
                            } else {
                                method765(-3);
                            }
                        }
                    }
                } else if (var1.method3310() >= field723.field1344) {
                    var2.field3734 = 0;
                    var1.method3312(var2.field3731, 0, field723.field1344);
                    field793.method4710();
                    field685 = -1L;
                    Statics.field3739.field605 = 0;
                    Statics.field491 = true;
                    field907 = true;
                    field902 = -1L;
                    class106.method3266();
                    field723.method2157();
                    field723.field1342.field3734 = 0;
                    field723.field1343 = null;
                    field723.field1337 = null;
                    field723.field1349 = null;
                    field723.field1347 = null;
                    field723.field1344 = 0;
                    field723.field1346 = 0;
                    field691 = 0;
                    field724 = 0;
                    field692 = 0;
                    method4701();
                    class64.field498 = 0;
                    class101.field1305.clear();
                    class101.field1302.method5584();
                    class101.field1306.method4691();
                    class101.field1304 = 0;
                    field701 = 0;
                    field833 = false;
                    field916 = 0;
                    field769 = 0;
                    field847 = 0;
                    Statics.field1902 = null;
                    field910 = 0;
                    field903 = -1;
                    field739 = 0;
                    field909 = 0;
                    field949 = class94.field1195;
                    field822 = class94.field1195;
                    field719 = 0;
                    class99.method318();
                    for (int var45 = 0; var45 < 2048; var45++) {
                        field861[var45] = null;
                    }
                    for (int var46 = 0; var46 < 32768; var46++) {
                        field718[var46] = null;
                    }
                    field804 = -1;
                    field807.method4627();
                    field808.method4627();
                    for (int var47 = 0; var47 < 4; var47++) {
                        for (int var48 = 0; var48 < 104; var48++) {
                            for (int var49 = 0; var49 < 104; var49++) {
                                field805[var47][var48][var49] = null;
                            }
                        }
                    }
                    field806 = new class272();
                    Statics.field456.method1765();
                    for (int var50 = 0; var50 < Statics.field3232; var50++) {
                        class251 var51 = class251.method3419(var50);
                        if (var51 != null) {
                            class222.field2562[var50] = 0;
                            class222.field2558[var50] = 0;
                        }
                    }
                    Statics.field1081.method2054();
                    field848 = -1;
                    if (field838 != -1) {
                        class227.method2039(field838);
                    }
                    for (class71 var52 = (class71) field954.method5605(); var52 != null; var52 = (class71) field954.method5608()) {
                        method766(var52, true);
                    }
                    field838 = -1;
                    field954 = new class328(8);
                    field844 = null;
                    method4701();
                    field941.method3742((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var53 = 0; var53 < 8; var53++) {
                        field801[var53] = null;
                        field802[var53] = false;
                    }
                    class69.field555 = new class328(32);
                    field942 = true;
                    for (int var54 = 0; var54 < 100; var54++) {
                        field883[var54] = true;
                    }
                    method126();
                    Statics.field1907 = null;
                    for (int var55 = 0; var55 < 8; var55++) {
                        field697[var55] = new class19();
                    }
                    Statics.field311 = null;
                    class99.method4444(var2);
                    Statics.field397 = -1;
                    method541(false, var2);
                    field723.field1343 = null;
                }
            }
        } catch (IOException var67) {
            if (field709 < 1) {
                if (Statics.field955 == Statics.field369) {
                    Statics.field369 = Statics.field126;
                } else {
                    Statics.field369 = Statics.field955;
                }
                field709++;
                field749 = 0;
            } else {
                method765(-2);
            }
        }
    }

    @ObfuscatedName("bg.el(IB)V")
    public static void method765(int arg0) {
        if (arg0 == -3) {
            class95.method3154(class234.field2893, class234.field2844, class234.field2845);
        } else if (arg0 == -2) {
            class95.method3154(class234.field2846, class234.field2847, class234.field2848);
        } else if (arg0 == -1) {
            class95.method3154(class234.field2849, class234.field3001, class234.field2851);
        } else if (arg0 == 3) {
            class95.field1205 = 3;
            class95.field1214 = 1;
        } else if (arg0 == 4) {
            class95.method1954(0);
        } else if (arg0 == 5) {
            class95.field1214 = 2;
            class95.method3154(class234.field2855, class234.field2883, class234.field2857);
        } else if (arg0 == 68 || !(field867 || arg0 != 6)) {
            class95.method3154(class234.field2858, class234.field2853, class234.field2820);
        } else if (arg0 == 7) {
            class95.method3154(class234.field2861, class234.field2862, class234.field2863);
        } else if (arg0 == 8) {
            class95.method3154(class234.field2963, class234.field2865, class234.field2958);
        } else if (arg0 == 9) {
            class95.method3154(class234.field2867, class234.field3072, class234.field2928);
        } else if (arg0 == 10) {
            class95.method3154(class234.field2870, class234.field2871, class234.field2872);
        } else if (arg0 == 11) {
            class95.method3154(class234.field3067, class234.field3069, class234.field3087);
        } else if (arg0 == 12) {
            class95.method3154(class234.field2876, class234.field2877, class234.field3097);
        } else if (arg0 == 13) {
            class95.method3154(class234.field2879, class234.field2880, class234.field2967);
        } else if (arg0 == 14) {
            class95.method3154(class234.field2882, class234.field3074, class234.field2884);
        } else if (arg0 == 16) {
            class95.method3154(class234.field3048, class234.field3059, class234.field3091);
        } else if (arg0 == 17) {
            class95.method3154(class234.field2888, class234.field2889, class234.field2890);
        } else if (arg0 == 18) {
            class95.field1205 = 12;
            class95.field1211 = 1;
        } else if (arg0 == 19) {
            class95.method3154(class234.field2894, class234.field2895, class234.field2896);
        } else if (arg0 == 20) {
            class95.method3154(class234.field2959, class234.field2898, class234.field2936);
        } else if (arg0 == 22) {
            class95.method3154(class234.field2900, class234.field2915, class234.field2902);
        } else if (arg0 == 23) {
            class95.method3154(class234.field2972, class234.field2904, class234.field2905);
        } else if (arg0 == 24) {
            class95.method3154(class234.field2906, class234.field2907, class234.field2947);
        } else if (arg0 == 25) {
            class95.method3154(class234.field2944, class234.field2910, class234.field3046);
        } else if (arg0 == 26) {
            class95.method3154(class234.field2912, class234.field2913, class234.field2914);
        } else if (arg0 == 27) {
            class95.method3154(class234.field2866, class234.field2916, class234.field2836);
        } else if (arg0 == 31) {
            class95.method3154(class234.field2924, class234.field2925, class234.field2926);
        } else if (arg0 == 32) {
            class95.method3154(class234.field2801, class234.field3034, class234.field2929);
        } else if (arg0 == 37) {
            class95.method3154(class234.field3002, class234.field2931, class234.field2932);
        } else if (arg0 == 38) {
            class95.method3154(class234.field2969, class234.field2956, class234.field2984);
        } else if (arg0 == 55) {
            class95.field1205 = 8;
        } else if (arg0 == 56) {
            class95.method3154(class234.field2940, class234.field2903, class234.field2942);
            method3372(11);
            return;
        } else if (arg0 == 57) {
            class95.method3154(class234.field2943, class234.field2868, class234.field2945);
            method3372(11);
            return;
        } else if (arg0 == 61) {
            class95.field1205 = 7;
        } else {
            class95.method3154(class234.field2946, class234.field2874, class234.field2829);
        }
        method3372(10);
    }

    @ObfuscatedName("ep.ea(I)V")
    public static final void method2852() {
        field723.method2161();
        method1636();
        Statics.field596.method3047();
        for (int var0 = 0; var0 < 4; var0++) {
            field734[var0].method3370();
        }
        System.gc();
        class207.method771(2);
        field912 = -1;
        field705 = false;
        for (class85 var1 = (class85) class85.field1113.method4621(); var1 != null; var1 = (class85) class85.field1113.method4641()) {
            if (var1.field1111 != null) {
                Statics.field1277.method2196(var1.field1111);
                var1.field1111 = null;
            }
            if (var1.field1108 != null) {
                Statics.field1277.method2196(var1.field1108);
                var1.field1108 = null;
            }
        }
        class85.field1113.method4627();
        method3372(10);
    }

    @ObfuscatedName("cq.fq(II)V")
    public static final void method1956(int arg0) {
        method2852();
        switch(arg0) {
            case 1:
                class95.field1205 = 24;
                class95.method3154(class234.field3037, class234.field3038, class234.field3039);
                break;
            case 2:
                class95.method135();
        }
    }

    @ObfuscatedName("cg.fx(B)V")
    public static final void method1636() {
        class268.method24();
        class255.field3282.method3172();
        class256.field3288.method3172();
        class264.method1641();
        class267.field3487.method3172();
        class267.field3488.method3172();
        class265.method3153();
        class269.field3537.method3172();
        class269.field3552.method3172();
        class254.field3264.method3172();
        class254.field3265.method3172();
        class259.method3335();
        class251.method109();
        class263.field3350.method3172();
        class263.field3351.method3172();
        class263.field3364.method3172();
        class257.field3303.method3172();
        class257.field3305.method3172();
        class261.method3869();
        class260.method3362();
        class252.method3720();
        class224.field2577.method3172();
        class227.method1059();
        ((class129) Statics.field1808).method2618();
        class102.field1309.method3172();
        Statics.field2141.method3888();
        Statics.field853.method3888();
        Statics.field291.method3888();
        Statics.field103.method3888();
        Statics.field264.method3888();
        Statics.field2133.method3888();
        Statics.field301.method3888();
        Statics.field2545.method3888();
        Statics.field1980.method3888();
        Statics.field1953.method3888();
        Statics.field83.method3888();
        Statics.field630.method3888();
    }

    @ObfuscatedName("bd.fp(I)V")
    public static final void method1064() {
        if (field724 > 0) {
            method2852();
        } else {
            field793.method4708();
            method3372(40);
            Statics.field509 = field723.method2163();
            field723.method2162();
        }
    }

    @ObfuscatedName("p.fj(ZI)V")
    public static final void method211(boolean arg0) {
        if (arg0) {
            field711 = class95.field1224 ? class170.field2047 : class170.field2045;
            return;
        }
        LinkedHashMap var1 = Statics.field1694.field1092;
        String var2 = class95.field1220;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field711 = var1.containsKey(var4) ? class170.field2046 : class170.field2044;
    }

    @ObfuscatedName("client.fs(I)V")
    public final void method1206() {
        if (field691 > 1) {
            field691--;
        }
        if (field724 > 0) {
            field724--;
        }
        if (field714) {
            field714 = false;
            method1064();
            return;
        }
        if (!field813) {
            method630();
        }
        for (int var1 = 0; var1 < 100 && this.method1543(field723); var1++) {
        }
        if (field707 != 30) {
            return;
        }
        while (true) {
            class107 var2 = (class107) class106.field1355.method4551();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field793.field3599) {
                    class197 var6 = class197.method1625(class193.field2272, field723.field1341);
                    var6.field2377.method5177(0);
                    int var7 = var6.field2377.field3734;
                    field793.method4718(var6.field2377);
                    var6.field2377.method5190(var6.field2377.field3734 - var7);
                    field723.method2159(var6);
                    field793.method4711();
                }
                Object var8 = Statics.field3739.field606;
                synchronized (Statics.field3739.field606) {
                    if (!field842) {
                        Statics.field3739.field605 = 0;
                    } else if (class64.field496 != 0 || Statics.field3739.field605 >= 40) {
                        class197 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field3739.field605 && (var9 == null || var9.field2377.field3734 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field3739.field604[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field3739.field607[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field799 != var16 || field687 != var15) {
                                if (var9 == null) {
                                    var9 = class197.method1625(class193.field2270, field723.field1341);
                                    var9.field2377.method5177(0);
                                    var10 = var9.field2377.field3734;
                                    var9.field2377.field3734 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field688 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field799;
                                    var18 = var15 - field687;
                                    var19 = (int) ((Statics.field3739.field608[var14] - field688) / 20L);
                                    var12 = (int) ((Statics.field3739.field608[var14] - field688) % 20L + (long) var12);
                                }
                                field799 = var16;
                                field687 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2377.method5178((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2377.method5177(var19 + 128);
                                    var9.field2377.method5178((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2377.method5177(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2377.method5295(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2377.method5295(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2377.method5178((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2377.method5295(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2377.method5295(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field688 = Statics.field3739.field608[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2377.method5190(var9.field2377.field3734 - var10);
                            int var20 = var9.field2377.field3734;
                            var9.field2377.field3734 = var10;
                            var9.field2377.method5177(var12 / var13);
                            var9.field2377.method5177(var12 % var13);
                            var9.field2377.field3734 = var20;
                            field723.method2159(var9);
                        }
                        if (var11 >= Statics.field3739.field605) {
                            Statics.field3739.field605 = 0;
                        } else {
                            Statics.field3739.field605 -= var11;
                            System.arraycopy(Statics.field3739.field607, var11, Statics.field3739.field607, 0, Statics.field3739.field605);
                            System.arraycopy(Statics.field3739.field604, var11, Statics.field3739.field604, 0, Statics.field3739.field605);
                            System.arraycopy(Statics.field3739.field608, var11, Statics.field3739.field608, 0, Statics.field3739.field605);
                        }
                    }
                }
                if (class64.field496 == 1 || !Statics.field587 && class64.field496 == 4 || class64.field496 == 2) {
                    long var22 = class64.field495 - field685;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field685 = class64.field495;
                    int var24 = class64.field513;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field475) {
                        var24 = Statics.field475;
                    }
                    int var25 = class64.field512;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1642) {
                        var25 = Statics.field1642;
                    }
                    int var26 = (int) var22;
                    class197 var27 = class197.method1625(class193.field2313, field723.field1341);
                    var27.field2377.method5178((class64.field496 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2377.method5178(var25);
                    var27.field2377.method5178(var24);
                    field723.method2159(var27);
                }
                if (class55.field423 > 0) {
                    class197 var28 = class197.method1625(class193.field2309, field723.field1341);
                    var28.field2377.method5178(0);
                    int var29 = var28.field2377.field3734;
                    long var30 = class307.method2184();
                    for (int var32 = 0; var32 < class55.field423; var32++) {
                        long var33 = var30 - field902;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field902 = var30;
                        var28.field2377.method5236((int) var33);
                        var28.field2377.method5419(class55.field422[var32]);
                    }
                    var28.field2377.method5244(var28.field2377.field3734 - var29);
                    field723.method2159(var28);
                }
                if (field830 > 0) {
                    field830--;
                }
                if (class55.field416[96] || class55.field416[97] || class55.field416[98] || class55.field416[99]) {
                    field762 = true;
                }
                if (field762 && field830 <= 0) {
                    field830 = 20;
                    field762 = false;
                    class197 var35 = class197.method1625(class193.field2290, field723.field1341);
                    var35.field2377.method5230(field769);
                    var35.field2377.method5229(field746);
                    field723.method2159(var35);
                }
                if (Statics.field491 && !field907) {
                    field907 = true;
                    class197 var36 = class197.method1625(class193.field2300, field723.field1341);
                    var36.field2377.method5177(1);
                    field723.method2159(var36);
                }
                if (!Statics.field491 && field907) {
                    field907 = false;
                    class197 var37 = class197.method1625(class193.field2300, field723.field1341);
                    var37.field2377.method5177(0);
                    field723.method2159(var37);
                }
                if (Statics.field626 != null) {
                    Statics.field626.method5944();
                }
                if (Statics.field45) {
                    if (Statics.field1907 != null) {
                        Statics.field1907.method4812();
                    }
                    for (int var38 = 0; var38 < class99.field1279; var38++) {
                        class76 var39 = field861[class99.field1282[var38]];
                        var39.method1138();
                    }
                    Statics.field45 = false;
                }
                Statics.method312();
                if (field707 != 30) {
                    return;
                }
                for (class78 var40 = (class78) field806.method4621(); var40 != null; var40 = (class78) field806.method4641()) {
                    if (var40.field958 > 0) {
                        var40.field958--;
                    }
                    if (var40.field958 == 0) {
                        if (var40.field956 >= 0) {
                            int var41 = var40.field956;
                            int var42 = var40.field962;
                            class264 var43 = class264.method3595(var41);
                            if (var42 == 11) {
                                var42 = 10;
                            }
                            if (var42 >= 5 && var42 <= 8) {
                                var42 = 4;
                            }
                            boolean var44 = var43.method4319(var42);
                            if (!var44) {
                                continue;
                            }
                        }
                        method241(var40.field971, var40.field957, var40.field967, var40.field959, var40.field956, var40.field961, var40.field962);
                        var40.method3401();
                    } else {
                        if (var40.field966 > 0) {
                            var40.field966--;
                        }
                        if (var40.field966 == 0 && var40.field967 >= 1 && var40.field959 >= 1 && var40.field967 <= 102 && var40.field959 <= 102) {
                            if (var40.field960 >= 0) {
                                int var45 = var40.field960;
                                int var46 = var40.field965;
                                class264 var47 = class264.method3595(var45);
                                if (var46 == 11) {
                                    var46 = 10;
                                }
                                if (var46 >= 5 && var46 <= 8) {
                                    var46 = 4;
                                }
                                boolean var48 = var47.method4319(var46);
                                if (!var48) {
                                    continue;
                                }
                            }
                            method241(var40.field971, var40.field957, var40.field967, var40.field959, var40.field960, var40.field964, var40.field965);
                            var40.field966 = -1;
                            if (var40.field960 == var40.field956 && var40.field956 == -1) {
                                var40.method3401();
                            } else if (var40.field960 == var40.field956 && var40.field964 == var40.field961 && var40.field965 == var40.field962) {
                                var40.method3401();
                            }
                        }
                    }
                }
                int var10002;
                for (int var49 = 0; var49 < field916; var49++) {
                    var10002 = field919[var49]--;
                    if (field919[var49] >= -10) {
                        class111 var51 = field921[var49];
                        if (var51 == null) {
                            class111 var10000 = (class111) null;
                            var51 = class111.method2267(Statics.field103, field917[var49], 0);
                            if (var51 == null) {
                                continue;
                            }
                            field919[var49] += var51.method2254();
                            field921[var49] = var51;
                        }
                        if (field919[var49] < 0) {
                            int var58;
                            if (field920[var49] == 0) {
                                var58 = field717;
                            } else {
                                int var52 = (field920[var49] & 0xFF) * 128;
                                int var53 = field920[var49] >> 16 & 0xFF;
                                int var54 = var53 * 128 + 64 - Statics.field141.field995;
                                if (var54 < 0) {
                                    var54 = -var54;
                                }
                                int var55 = field920[var49] >> 8 & 0xFF;
                                int var56 = var55 * 128 + 64 - Statics.field141.field1024;
                                if (var56 < 0) {
                                    var56 = -var56;
                                }
                                int var57 = var54 + var56 - 128;
                                if (var57 > var52) {
                                    field919[var49] = -100;
                                    continue;
                                }
                                if (var57 < 0) {
                                    var57 = 0;
                                }
                                var58 = field915 * (var52 - var57) / var52;
                            }
                            if (var58 > 0) {
                                class113 var59 = var51.method2253().method2300(Statics.field54);
                                class123 var60 = class123.method2450(var59, 100, var58);
                                var60.method2443(field918[var49] - 1);
                                Statics.field1277.method2195(var60);
                            }
                            field919[var49] = -100;
                        }
                    } else {
                        field916--;
                        for (int var50 = var49; var50 < field916; var50++) {
                            field917[var50] = field917[var50 + 1];
                            field921[var50] = field921[var50 + 1];
                            field918[var50] = field918[var50 + 1];
                            field919[var50] = field919[var50 + 1];
                            field920[var50] = field920[var50 + 1];
                        }
                        var49--;
                    }
                }
                if (field705 && !class207.method1646()) {
                    if (field911 != 0 && field912 != -1) {
                        class207.method2136(Statics.field2133, field912, 0, field911, false);
                    }
                    field705 = false;
                }
                field723.field1346++;
                if (field723.field1346 > 750) {
                    method1064();
                    return;
                }
                int var61 = class99.field1279;
                int[] var62 = class99.field1282;
                for (int var63 = 0; var63 < var61; var63++) {
                    class76 var64 = field861[var62[var63]];
                    if (var64 != null) {
                        method3373(var64, 1);
                    }
                }
                for (int var65 = 0; var65 < field719; var65++) {
                    int var66 = field720[var65];
                    class89 var67 = field718[var66];
                    if (var67 != null) {
                        method3373(var67, var67.field1159.field3513);
                    }
                }
                method3412();
                field738++;
                if (field683 != 0) {
                    field780 += 20;
                    if (field780 >= 400) {
                        field683 = 0;
                    }
                }
                if (Statics.field80 != null) {
                    field783++;
                    if (field783 >= 15) {
                        method710(Statics.field80);
                        Statics.field80 = null;
                    }
                }
                class227 var68 = Statics.field3636;
                class227 var69 = Statics.field1951;
                Statics.field3636 = null;
                Statics.field1951 = null;
                field855 = null;
                field881 = false;
                field800 = false;
                field899 = 0;
                while (class55.method801() && field899 < 128) {
                    if (field814 >= 2 && class55.field416[82] && Statics.field2582 == 66) {
                        String var70 = "";
                        Iterator var71 = class101.field1302.iterator();
                        while (var71.hasNext()) {
                            class74 var72 = (class74) var71.next();
                            var70 = var70 + var72.field615 + ':' + var72.field617 + '\n';
                        }
                        Statics.field9.method864(var70);
                    } else if (field847 != 1 || Statics.field1351 <= 0) {
                        field901[field899] = Statics.field2582;
                        field900[field899] = Statics.field1351;
                        field899++;
                    }
                }
                if (method3294() && class55.field416[82] && class55.field416[81] && field876 != 0) {
                    int var75 = Statics.field141.field657 - field876;
                    if (var75 < 0) {
                        var75 = 0;
                    } else if (var75 > 3) {
                        var75 = 3;
                    }
                    if (Statics.field141.field657 != var75) {
                        int var76 = Statics.field348 + Statics.field141.field1031[0];
                        int var77 = Statics.field263 + Statics.field141.field1029[0];
                        class197 var78 = class197.method1625(class193.field2328, field723.field1341);
                        var78.field2377.method5178(var77);
                        var78.field2377.method5238(0);
                        var78.field2377.method5178(var76);
                        var78.field2377.method5220(var75);
                        field723.method2159(var78);
                    }
                    field876 = 0;
                }
                if (field838 != -1) {
                    method3151(field838, 0, 0, Statics.field1642, Statics.field475, 0, 0);
                }
                field863++;
                while (true) {
                    class72 var79;
                    class227 var80;
                    class227 var81;
                    do {
                        var79 = (class72) field878.method4619();
                        if (var79 == null) {
                            while (true) {
                                class72 var82;
                                class227 var83;
                                class227 var84;
                                do {
                                    var82 = (class72) field913.method4619();
                                    if (var82 == null) {
                                        while (true) {
                                            class72 var85;
                                            class227 var86;
                                            class227 var87;
                                            do {
                                                var85 = (class72) field877.method4619();
                                                if (var85 == null) {
                                                    this.method1607();
                                                    if (Statics.field626 != null) {
                                                        Statics.field626.method5998(Statics.field2544, (Statics.field141.field995 >> 7) + Statics.field348, (Statics.field141.field1024 >> 7) + Statics.field263, false);
                                                        Statics.field626.method6117();
                                                    }
                                                    if (field858 != null) {
                                                        this.method1296();
                                                    }
                                                    if (Statics.field2033 != null) {
                                                        method710(Statics.field2033);
                                                        field790++;
                                                        if (class64.field503 == 0) {
                                                            if (field789) {
                                                                if (Statics.field3227 == Statics.field2033 && field788 != field785) {
                                                                    class227 var88 = Statics.field2033;
                                                                    byte var89 = 0;
                                                                    if (field708 == 1 && var88.field2671 == 206) {
                                                                        var89 = 1;
                                                                    }
                                                                    if (var88.field2730[field788] <= 0) {
                                                                        var89 = 0;
                                                                    }
                                                                    if (class228.method3826(method262(var88))) {
                                                                        int var90 = field785;
                                                                        int var91 = field788;
                                                                        var88.field2730[var91] = var88.field2730[var90];
                                                                        var88.field2731[var91] = var88.field2731[var90];
                                                                        var88.field2730[var90] = -1;
                                                                        var88.field2731[var90] = 0;
                                                                    } else if (var89 == 1) {
                                                                        int var92 = field785;
                                                                        int var93 = field788;
                                                                        while (var92 != var93) {
                                                                            if (var92 > var93) {
                                                                                var88.method3789(var92 - 1, var92);
                                                                                var92--;
                                                                            } else if (var92 < var93) {
                                                                                var88.method3789(var92 + 1, var92);
                                                                                var92++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var88.method3789(field788, field785);
                                                                    }
                                                                    class197 var94 = class197.method1625(class193.field2310, field723.field1341);
                                                                    var94.field2377.method5238(Statics.field2033.field2738);
                                                                    var94.field2377.method5178(field788);
                                                                    var94.field2377.method5177(var89);
                                                                    var94.field2377.method5230(field785);
                                                                    field723.method2159(var94);
                                                                }
                                                            } else if (this.method1505()) {
                                                                this.method1213(field686, field784);
                                                            } else if (field815 > 0) {
                                                                method2025(field686, field784);
                                                            }
                                                            field783 = 10;
                                                            class64.field496 = 0;
                                                            Statics.field2033 = null;
                                                        } else if (field790 >= 5 && (class64.field504 > field686 + 5 || class64.field504 < field686 - 5 || class64.field505 > field784 + 5 || class64.field505 < field784 - 5)) {
                                                            field789 = true;
                                                        }
                                                    }
                                                    if (class143.method2985()) {
                                                        int var95 = class143.field1868;
                                                        int var96 = class143.field1892;
                                                        class197 var97 = class197.method1625(class193.field2345, field723.field1341);
                                                        var97.field2377.method5177(5);
                                                        var97.field2377.method5177(class55.field416[82] ? (class55.field416[81] ? 2 : 1) : 0);
                                                        var97.field2377.method5230(Statics.field348 + var95);
                                                        var97.field2377.method5178(Statics.field263 + var96);
                                                        field723.method2159(var97);
                                                        class143.method3118();
                                                        field778 = class64.field512;
                                                        field922 = class64.field513;
                                                        field683 = 1;
                                                        field780 = 0;
                                                        field739 = var95;
                                                        field909 = var96;
                                                    }
                                                    if (Statics.field3636 != var68) {
                                                        if (var68 != null) {
                                                            method710(var68);
                                                        }
                                                        if (Statics.field3636 != null) {
                                                            method710(Statics.field3636);
                                                        }
                                                    }
                                                    if (Statics.field1951 != var69 && field829 == field771) {
                                                        if (var69 != null) {
                                                            method710(var69);
                                                        }
                                                        if (Statics.field1951 != null) {
                                                            method710(Statics.field1951);
                                                        }
                                                    }
                                                    if (Statics.field1951 == null) {
                                                        if (field829 > 0) {
                                                            field829--;
                                                        }
                                                    } else if (field829 < field771) {
                                                        field829++;
                                                        if (field829 == field771) {
                                                            method710(Statics.field1951);
                                                        }
                                                    }
                                                    method629();
                                                    if (field725) {
                                                        int var98 = Statics.field1039 * 128 + 64;
                                                        int var99 = Statics.field44 * 128 + 64;
                                                        int var100 = method1061(var98, var99, Statics.field2544) - Statics.field2100;
                                                        if (Statics.field1781 < var98) {
                                                            Statics.field1781 += Statics.field1641 * (var98 - Statics.field1781) / 1000 + Statics.field610;
                                                            if (Statics.field1781 > var98) {
                                                                Statics.field1781 = var98;
                                                            }
                                                        }
                                                        if (Statics.field1781 > var98) {
                                                            Statics.field1781 -= Statics.field1641 * (Statics.field1781 - var98) / 1000 + Statics.field610;
                                                            if (Statics.field1781 < var98) {
                                                                Statics.field1781 = var98;
                                                            }
                                                        }
                                                        if (Statics.field1925 < var100) {
                                                            Statics.field1925 += Statics.field1641 * (var100 - Statics.field1925) / 1000 + Statics.field610;
                                                            if (Statics.field1925 > var100) {
                                                                Statics.field1925 = var100;
                                                            }
                                                        }
                                                        if (Statics.field1925 > var100) {
                                                            Statics.field1925 -= Statics.field1641 * (Statics.field1925 - var100) / 1000 + Statics.field610;
                                                            if (Statics.field1925 < var100) {
                                                                Statics.field1925 = var100;
                                                            }
                                                        }
                                                        if (Statics.field189 < var99) {
                                                            Statics.field189 += Statics.field1641 * (var99 - Statics.field189) / 1000 + Statics.field610;
                                                            if (Statics.field189 > var99) {
                                                                Statics.field189 = var99;
                                                            }
                                                        }
                                                        if (Statics.field189 > var99) {
                                                            Statics.field189 -= Statics.field1641 * (Statics.field189 - var99) / 1000 + Statics.field610;
                                                            if (Statics.field189 < var99) {
                                                                Statics.field189 = var99;
                                                            }
                                                        }
                                                        int var101 = Statics.field1473 * 128 + 64;
                                                        int var102 = Statics.field1562 * 128 + 64;
                                                        int var103 = method1061(var101, var102, Statics.field2544) - Statics.field3621;
                                                        int var104 = var101 - Statics.field1781;
                                                        int var105 = var103 - Statics.field1925;
                                                        int var106 = var102 - Statics.field189;
                                                        int var107 = (int) Math.sqrt((double) (var104 * var104 + var106 * var106));
                                                        int var108 = (int) (Math.atan2((double) var105, (double) var107) * 325.949D) & 0x7FF;
                                                        int var109 = (int) (Math.atan2((double) var104, (double) var106) * -325.949D) & 0x7FF;
                                                        if (var108 < 128) {
                                                            var108 = 128;
                                                        }
                                                        if (var108 > 383) {
                                                            var108 = 383;
                                                        }
                                                        if (Statics.field3729 < var108) {
                                                            Statics.field3729 += Statics.field2593 * (var108 - Statics.field3729) / 1000 + Statics.field2014;
                                                            if (Statics.field3729 > var108) {
                                                                Statics.field3729 = var108;
                                                            }
                                                        }
                                                        if (Statics.field3729 > var108) {
                                                            Statics.field3729 -= Statics.field2593 * (Statics.field3729 - var108) / 1000 + Statics.field2014;
                                                            if (Statics.field3729 < var108) {
                                                                Statics.field3729 = var108;
                                                            }
                                                        }
                                                        int var110 = var109 - Statics.field2246;
                                                        if (var110 > 1024) {
                                                            var110 -= 2048;
                                                        }
                                                        if (var110 < -1024) {
                                                            var110 += 2048;
                                                        }
                                                        if (var110 > 0) {
                                                            Statics.field2246 += Statics.field2593 * var110 / 1000 + Statics.field2014;
                                                            Statics.field2246 &= 0x7FF;
                                                        }
                                                        if (var110 < 0) {
                                                            Statics.field2246 -= Statics.field2593 * -var110 / 1000 + Statics.field2014;
                                                            Statics.field2246 &= 0x7FF;
                                                        }
                                                        int var111 = var109 - Statics.field2246;
                                                        if (var111 > 1024) {
                                                            var111 -= 2048;
                                                        }
                                                        if (var111 < -1024) {
                                                            var111 += 2048;
                                                        }
                                                        if (var111 < 0 && var110 > 0 || var111 > 0 && var110 < 0) {
                                                            Statics.field2246 = var109;
                                                        }
                                                    }
                                                    for (int var112 = 0; var112 < 5; var112++) {
                                                        var10002 = field927[var112]++;
                                                    }
                                                    Statics.field1081.method2064();
                                                    int var113 = ++class64.field498 - 1;
                                                    int var115 = class55.method548();
                                                    if (var113 > 15000 && var115 > 15000) {
                                                        field724 = 250;
                                                        class64.field498 = 14500;
                                                        class197 var116 = class197.method1625(class193.field2259, field723.field1341);
                                                        field723.method2159(var116);
                                                    }
                                                    Statics.field456.method1753();
                                                    field723.field1350++;
                                                    if (field723.field1350 > 50) {
                                                        class197 var117 = class197.method1625(class193.field2268, field723.field1341);
                                                        field723.method2159(var117);
                                                    }
                                                    try {
                                                        field723.method2158();
                                                    } catch (IOException var119) {
                                                        method1064();
                                                    }
                                                    return;
                                                }
                                                var86 = var85.field586;
                                                if (var86.field2605 < 0) {
                                                    break;
                                                }
                                                var87 = class227.method2021(var86.field2615);
                                            } while (var87 == null || var87.field2736 == null || var86.field2605 >= var87.field2736.length || var87.field2736[var86.field2605] != var86);
                                            class86.method2141(var85);
                                        }
                                    }
                                    var83 = var82.field586;
                                    if (var83.field2605 < 0) {
                                        break;
                                    }
                                    var84 = class227.method2021(var83.field2615);
                                } while (var84 == null || var84.field2736 == null || var83.field2605 >= var84.field2736.length || var84.field2736[var83.field2605] != var83);
                                class86.method2141(var82);
                            }
                        }
                        var80 = var79.field586;
                        if (var80.field2605 < 0) {
                            break;
                        }
                        var81 = class227.method2021(var80.field2615);
                    } while (var81 == null || var81.field2736 == null || var80.field2605 >= var81.field2736.length || var81.field2736[var80.field2605] != var80);
                    class86.method2141(var79);
                }
            }
            class197 var4 = class197.method1625(class193.field2330, field723.field1341);
            var4.field2377.method5177(0);
            int var5 = var4.field2377.field3734;
            Statics.method3421(var4.field2377);
            var4.field2377.method5190(var4.field2377.field3734 - var5);
            field723.method2159(var4);
        }
    }

    @ObfuscatedName("gk.fv(I)V")
    public static final void method3393() {
        if (Statics.field4044 != null) {
            Statics.field4044.method2324();
        }
        if (Statics.field346 != null) {
            Statics.field346.method2324();
        }
    }

    @ObfuscatedName("f.fz(Ljm;IIIB)V")
    public static void method123(class269 arg0, int arg1, int arg2, int arg3) {
        if (field916 >= 50 || field915 == 0 || arg0.field3539 == null || arg1 >= arg0.field3539.length) {
            return;
        }
        int var4 = arg0.field3539[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field917[field916] = var5;
        field918[field916] = var6;
        field919[field916] = 0;
        field921[field916] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field920[field916] = (var8 << 16) + (var9 << 8) + var7;
        field916++;
    }

    @ObfuscatedName("w.fk(IIII)V")
    public static void method71(int arg0, int arg1, int arg2) {
        if (field717 == 0 || arg1 == 0 || field916 >= 50) {
            return;
        }
        field917[field916] = arg0;
        field918[field916] = arg1;
        field919[field916] = arg2;
        field921[field916] = null;
        field920[field916] = 0;
        field916++;
    }

    @ObfuscatedName("ad.fe(II)V")
    public static void method576(int arg0) {
        if (arg0 == -1 && !field705) {
            Statics.field2437.method3499();
            class207.field2438 = 1;
            Statics.field2421 = null;
        } else if (arg0 != -1 && field912 != arg0 && field911 != 0 && !field705) {
            class246 var1 = Statics.field2133;
            int var2 = field911;
            class207.field2438 = 1;
            Statics.field2421 = var1;
            Statics.field2035 = arg0;
            Statics.field2439 = 0;
            Statics.field523 = var2;
            Statics.field2440 = false;
            Statics.field1923 = 2;
        }
        field912 = arg0;
    }

    @ObfuscatedName("f.fm(Lhq;III)V")
    public static final void method125(class227 arg0, int arg1, int arg2) {
        if (field910 != 0 && field910 != 3 || field813 || !(class64.field496 == 1 || !Statics.field587 && class64.field496 == 4)) {
            return;
        }
        class221 var3 = arg0.method3793(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field512 - arg1;
        int var5 = class64.field513 - arg2;
        if (!var3.method3710(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2551 / 2;
        int var7 = var5 - var3.field2550 / 2;
        int var8 = field769 & 0x7FF;
        int var9 = class140.field1811[var8];
        int var10 = class140.field1794[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field141.field995 + var11 >> 7;
        int var14 = Statics.field141.field1024 - var12 >> 7;
        class197 var15 = class197.method1625(class193.field2318, field723.field1341);
        var15.field2377.method5177(18);
        var15.field2377.method5177(class55.field416[82] ? (class55.field416[81] ? 2 : 1) : 0);
        var15.field2377.method5230(Statics.field348 + var13);
        var15.field2377.method5178(Statics.field263 + var14);
        var15.field2377.method5177(var6);
        var15.field2377.method5177(var7);
        var15.field2377.method5178(field769);
        var15.field2377.method5177(57);
        var15.field2377.method5177(0);
        var15.field2377.method5177(0);
        var15.field2377.method5177(89);
        var15.field2377.method5178(Statics.field141.field995);
        var15.field2377.method5178(Statics.field141.field1024);
        var15.field2377.method5177(63);
        field723.method2159(var15);
        field739 = var13;
        field909 = var14;
    }

    @ObfuscatedName("gf.fg(I)V")
    public static final void method3412() {
        int[] var0 = class99.field1282;
        for (int var1 = 0; var1 < class99.field1279; var1++) {
            class76 var2 = field861[var0[var1]];
            if (var2 != null && var2.field989 > 0) {
                var2.field989--;
                if (var2.field989 == 0) {
                    var2.field1021 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field719; var3++) {
            int var4 = field720[var3];
            class89 var5 = field718[var4];
            if (var5 != null && var5.field989 > 0) {
                var5.field989--;
                if (var5.field989 == 0) {
                    var5.field1021 = null;
                }
            }
        }
    }

    @ObfuscatedName("au.ff(Ljava/lang/String;I)V")
    public static final void method330(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1694.field1083 = !Statics.field1694.field1083;
            class83.method658();
            if (Statics.field1694.field1083) {
                class101.method317(99, "", "Roofs are now all hidden");
            } else {
                class101.method317(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field690 = !field690;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field940 = !field940;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field826 = !field826;
        }
        if (field814 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field626.field4034 = !Statics.field626.field4034;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field690 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field690 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1064();
            }
        }
        class197 var1 = class197.method1625(class193.field2297, field723.field1341);
        var1.field2377.method5177(arg0.length() + 1);
        var1.field2377.method5322(arg0);
        field723.method2159(var1);
    }

    @ObfuscatedName("aj.fr(I)V")
    public static final void method629() {
        if (field847 == 0) {
            int var0 = Statics.field141.field995;
            int var1 = Statics.field141.field1024;
            if (Statics.field65 - var0 < -500 || Statics.field65 - var0 > 500 || Statics.field516 - var1 < -500 || Statics.field516 - var1 > 500) {
                Statics.field65 = var0;
                Statics.field516 = var1;
            }
            if (Statics.field65 != var0) {
                Statics.field65 += (var0 - Statics.field65) / 16;
            }
            if (Statics.field516 != var1) {
                Statics.field516 += (var1 - Statics.field516) / 16;
            }
            int var2 = Statics.field65 >> 7;
            int var3 = Statics.field516 >> 7;
            int var4 = method1061(Statics.field65, Statics.field516, Statics.field2544);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field2544;
                        if (var8 < 3 && (class65.field519[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class65.field527[var8][var6][var7];
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
            if (var10 > field763) {
                field763 += (var10 - field763) / 24;
            } else if (var10 < field763) {
                field763 += (var10 - field763) / 80;
            }
            Statics.field41 = method1061(Statics.field141.field995, Statics.field141.field1024, Statics.field2544) - field753;
        } else if (field847 == 1) {
            if (field760 && Statics.field141 != null) {
                int var11 = Statics.field141.field1031[0];
                int var12 = Statics.field141.field1029[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field65 = Statics.field141.field995;
                    int var13 = method1061(Statics.field141.field995, Statics.field141.field1024, Statics.field2544) - field753;
                    if (var13 < Statics.field41) {
                        Statics.field41 = var13;
                    }
                    Statics.field516 = Statics.field141.field1024;
                    field760 = false;
                }
            }
            short var14 = -1;
            if (class55.field416[33]) {
                var14 = 0;
            } else if (class55.field416[49]) {
                var14 = 1024;
            }
            if (class55.field416[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class55.field416[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class55.field416[35]) {
                var15 = -1;
            } else if (class55.field416[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class55.field416[81] ? field924 : field700;
                var16 = var17 * 16;
                field797 = var14;
                field756 = var15;
            }
            if (field754 < var16) {
                field754 += var16 / 8;
                if (field754 > var16) {
                    field754 = var16;
                }
            } else if (field754 > var16) {
                field754 = field754 * 9 / 10;
            }
            if (field754 > 0) {
                int var18 = field754 / 16;
                if (field797 >= 0) {
                    int var19 = field797 - Statics.field2246 & 0x7FF;
                    int var20 = class140.field1811[var19];
                    int var21 = class140.field1794[var19];
                    Statics.field65 += var18 * var20 / 65536;
                    Statics.field516 += var18 * var21 / 65536;
                }
                if (field756 != 0) {
                    Statics.field41 += field756 * var18;
                    if (Statics.field41 > 0) {
                        Statics.field41 = 0;
                    }
                }
            } else {
                field797 = -1;
                field756 = -1;
            }
            if (class55.field416[13]) {
                field723.method2159(class197.method1625(class193.field2291, field723.field1341));
                field847 = 0;
            }
        }
        if (class64.field503 == 4 && Statics.field587) {
            int var22 = class64.field505 - field751;
            field736 = var22 * 2;
            field751 = var22 == -1 || var22 == 1 ? class64.field505 : (field751 + class64.field505) / 2;
            int var23 = field750 - class64.field504;
            field856 = var23 * 2;
            field750 = var23 == -1 || var23 == 1 ? class64.field504 : (field750 + class64.field504) / 2;
        } else {
            if (class55.field416[96]) {
                field856 += (-24 - field856) / 2;
            } else if (class55.field416[97]) {
                field856 += (24 - field856) / 2;
            } else {
                field856 /= 2;
            }
            if (class55.field416[98]) {
                field736 += (12 - field736) / 2;
            } else if (class55.field416[99]) {
                field736 += (-12 - field736) / 2;
            } else {
                field736 /= 2;
            }
            field751 = class64.field505;
            field750 = class64.field504;
        }
        field769 = field856 / 2 + field769 & 0x7FF;
        field746 += field736 / 2;
        if (field746 < 128) {
            field746 = 128;
        }
        if (field746 > 383) {
            field746 = 383;
        }
    }

    @ObfuscatedName("ft.fi(Lcg;II)V")
    public static final void method3373(class79 arg0, int arg1) {
        if (arg0.field1027 >= field674) {
            method3738(arg0);
        } else if (arg0.field1020 >= field674) {
            if (field674 == arg0.field1020 || arg0.field1005 == -1 || arg0.field1008 != 0 || arg0.field1007 + 1 > class269.method536(arg0.field1005).field3541[arg0.field1009]) {
                int var2 = arg0.field1020 - arg0.field1027;
                int var3 = field674 - arg0.field1027;
                int var4 = arg0.field998 * 128 + arg0.field1015 * 64;
                int var5 = arg0.field1017 * 128 + arg0.field1015 * 64;
                int var6 = arg0.field1016 * 128 + arg0.field1015 * 64;
                int var7 = arg0.field1018 * 128 + arg0.field1015 * 64;
                arg0.field995 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1024 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1033 = 0;
            arg0.field1032 = arg0.field1028;
            arg0.field1030 = arg0.field1032;
        } else {
            arg0.field1002 = arg0.field978;
            if (arg0.field1006 == 0) {
                arg0.field1033 = 0;
            } else {
                label430: {
                    if (arg0.field1005 != -1 && arg0.field1008 == 0) {
                        class269 var8 = class269.method536(arg0.field1005);
                        if (arg0.field974 > 0 && var8.field3550 == 0) {
                            arg0.field1033++;
                            break label430;
                        }
                        if (arg0.field974 <= 0 && var8.field3542 == 0) {
                            arg0.field1033++;
                            break label430;
                        }
                    }
                    int var9 = arg0.field995;
                    int var10 = arg0.field1024;
                    int var11 = arg0.field1031[arg0.field1006 - 1] * 128 + arg0.field1015 * 64;
                    int var12 = arg0.field1029[arg0.field1006 - 1] * 128 + arg0.field1015 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1032 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1032 = 1792;
                        } else {
                            arg0.field1032 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1032 = 768;
                        } else if (var10 > var12) {
                            arg0.field1032 = 256;
                        } else {
                            arg0.field1032 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1032 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1032 = 0;
                    }
                    byte var13 = arg0.field1013[arg0.field1006 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1032 - arg0.field1030 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field982;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field981;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field984;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field983;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field981;
                        }
                        arg0.field1002 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class89) {
                            var17 = ((class89) arg0).field1159.field3519;
                        }
                        if (var17) {
                            if (arg0.field1032 != arg0.field1030 && arg0.field999 == -1 && arg0.field1026 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1006 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1006 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1033 > 0 && arg0.field1006 > 1) {
                                var16 = 8;
                                arg0.field1033--;
                            }
                        } else {
                            if (arg0.field1006 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1006 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1033 > 0 && arg0.field1006 > 1) {
                                var16 = 8;
                                arg0.field1033--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field981 == arg0.field1002 && arg0.field985 != -1) {
                            arg0.field1002 = arg0.field985;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field995 += var16;
                                if (arg0.field995 > var11) {
                                    arg0.field995 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field995 -= var16;
                                if (arg0.field995 < var11) {
                                    arg0.field995 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1024 += var16;
                                if (arg0.field1024 > var12) {
                                    arg0.field1024 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1024 -= var16;
                                if (arg0.field1024 < var12) {
                                    arg0.field1024 = var12;
                                }
                            }
                        }
                        if (arg0.field995 == var11 && arg0.field1024 == var12) {
                            arg0.field1006--;
                            if (arg0.field974 > 0) {
                                arg0.field974--;
                            }
                        }
                    } else {
                        arg0.field995 = var11;
                        arg0.field1024 = var12;
                        arg0.field1006--;
                        if (arg0.field974 > 0) {
                            arg0.field974--;
                        }
                    }
                }
            }
        }
        if (arg0.field995 < 128 || arg0.field1024 < 128 || arg0.field995 >= 13184 || arg0.field1024 >= 13184) {
            arg0.field1005 = -1;
            arg0.field972 = -1;
            arg0.field1027 = 0;
            arg0.field1020 = 0;
            arg0.field995 = arg0.field1031[0] * 128 + arg0.field1015 * 64;
            arg0.field1024 = arg0.field1029[0] * 128 + arg0.field1015 * 64;
            arg0.method1631();
        }
        if (Statics.field141 == arg0 && (arg0.field995 < 1536 || arg0.field1024 < 1536 || arg0.field995 >= 11776 || arg0.field1024 >= 11776)) {
            arg0.field1005 = -1;
            arg0.field972 = -1;
            arg0.field1027 = 0;
            arg0.field1020 = 0;
            arg0.field995 = arg0.field1031[0] * 128 + arg0.field1015 * 64;
            arg0.field1024 = arg0.field1029[0] * 128 + arg0.field1015 * 64;
            arg0.method1631();
        }
        if (arg0.field1026 != 0) {
            if (arg0.field999 != -1) {
                class79 var18 = null;
                if (arg0.field999 < 32768) {
                    var18 = field718[arg0.field999];
                } else if (arg0.field999 >= 32768) {
                    var18 = field861[arg0.field999 - 32768];
                }
                if (var18 != null) {
                    int var19 = arg0.field995 - var18.field995;
                    int var20 = arg0.field1024 - var18.field1024;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field1032 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1000) {
                    arg0.field999 = -1;
                    arg0.field1000 = false;
                }
            }
            if (arg0.field1001 != -1 && (arg0.field1006 == 0 || arg0.field1033 > 0)) {
                arg0.field1032 = arg0.field1001;
                arg0.field1001 = -1;
            }
            int var21 = arg0.field1032 - arg0.field1030 & 0x7FF;
            if (var21 == 0 && arg0.field1000) {
                arg0.field999 = -1;
                arg0.field1000 = false;
            }
            if (var21 == 0) {
                arg0.field1025 = 0;
            } else {
                arg0.field1025++;
                if (var21 > 1024) {
                    arg0.field1030 -= arg0.field1026;
                    boolean var22 = true;
                    if (var21 < arg0.field1026 || var21 > 2048 - arg0.field1026) {
                        arg0.field1030 = arg0.field1032;
                        var22 = false;
                    }
                    if (arg0.field978 == arg0.field1002 && (arg0.field1025 > 25 || var22)) {
                        if (arg0.field979 == -1) {
                            arg0.field1002 = arg0.field981;
                        } else {
                            arg0.field1002 = arg0.field979;
                        }
                    }
                } else {
                    arg0.field1030 += arg0.field1026;
                    boolean var23 = true;
                    if (var21 < arg0.field1026 || var21 > 2048 - arg0.field1026) {
                        arg0.field1030 = arg0.field1032;
                        var23 = false;
                    }
                    if (arg0.field978 == arg0.field1002 && (arg0.field1025 > 25 || var23)) {
                        if (arg0.field980 == -1) {
                            arg0.field1002 = arg0.field981;
                        } else {
                            arg0.field1002 = arg0.field980;
                        }
                    }
                }
                arg0.field1030 &= 0x7FF;
            }
        }
        arg0.field975 = false;
        if (arg0.field1002 != -1) {
            class269 var25 = class269.method536(arg0.field1002);
            if (var25 == null || var25.field3535 == null) {
                arg0.field1002 = -1;
            } else {
                arg0.field976++;
                if (arg0.field1003 < var25.field3535.length && arg0.field976 > var25.field3541[arg0.field1003]) {
                    arg0.field976 = 1;
                    arg0.field1003++;
                    method123(var25, arg0.field1003, arg0.field995, arg0.field1024);
                }
                if (arg0.field1003 >= var25.field3535.length) {
                    arg0.field976 = 0;
                    arg0.field1003 = 0;
                    method123(var25, arg0.field1003, arg0.field995, arg0.field1024);
                }
            }
        }
        if (arg0.field972 != -1 && field674 >= arg0.field1014) {
            if (arg0.field1011 < 0) {
                arg0.field1011 = 0;
            }
            int var26 = class254.method1045(arg0.field972).field3268;
            if (var26 == -1) {
                arg0.field972 = -1;
            } else {
                class269 var27 = class269.method536(var26);
                if (var27 == null || var27.field3535 == null) {
                    arg0.field972 = -1;
                } else {
                    arg0.field988++;
                    if (arg0.field1011 < var27.field3535.length && arg0.field988 > var27.field3541[arg0.field1011]) {
                        arg0.field988 = 1;
                        arg0.field1011++;
                        method123(var27, arg0.field1011, arg0.field995, arg0.field1024);
                    }
                    if (arg0.field1011 >= var27.field3535.length && (arg0.field1011 < 0 || arg0.field1011 >= var27.field3535.length)) {
                        arg0.field972 = -1;
                    }
                }
            }
        }
        if (arg0.field1005 != -1 && arg0.field1008 <= 1) {
            class269 var28 = class269.method536(arg0.field1005);
            if (var28.field3550 == 1 && arg0.field974 > 0 && arg0.field1027 <= field674 && arg0.field1020 < field674) {
                arg0.field1008 = 1;
                return;
            }
        }
        if (arg0.field1005 != -1 && arg0.field1008 == 0) {
            class269 var29 = class269.method536(arg0.field1005);
            if (var29 == null || var29.field3535 == null) {
                arg0.field1005 = -1;
            } else {
                arg0.field1007++;
                if (arg0.field1009 < var29.field3535.length && arg0.field1007 > var29.field3541[arg0.field1009]) {
                    arg0.field1007 = 1;
                    arg0.field1009++;
                    method123(var29, arg0.field1009, arg0.field995, arg0.field1024);
                }
                if (arg0.field1009 >= var29.field3535.length) {
                    arg0.field1009 -= var29.field3543;
                    arg0.field1010++;
                    if (arg0.field1010 >= var29.field3549) {
                        arg0.field1005 = -1;
                    } else if (arg0.field1009 >= 0 && arg0.field1009 < var29.field3535.length) {
                        method123(var29, arg0.field1009, arg0.field995, arg0.field1024);
                    } else {
                        arg0.field1005 = -1;
                    }
                }
                arg0.field975 = var29.field3545;
            }
        }
        if (arg0.field1008 > 0) {
            arg0.field1008--;
        }
    }

    @ObfuscatedName("hg.fy(Lcg;B)V")
    public static final void method3738(class79 arg0) {
        int var1 = Math.max(1, arg0.field1027 - field674);
        int var2 = arg0.field998 * 128 + arg0.field1015 * 64;
        int var3 = arg0.field1017 * 128 + arg0.field1015 * 64;
        arg0.field995 += (var2 - arg0.field995) / var1;
        arg0.field1024 += (var3 - arg0.field1024) / var1;
        arg0.field1033 = 0;
        arg0.field1032 = arg0.field1028;
    }

    @ObfuscatedName("r.fu(Lbf;IIB)V")
    public static void method199(class76 arg0, int arg1, int arg2) {
        if (arg0.field1005 == arg1 && arg1 != -1) {
            int var3 = class269.method536(arg1).field3536;
            if (var3 == 1) {
                arg0.field1009 = 0;
                arg0.field1007 = 0;
                arg0.field1008 = arg2;
                arg0.field1010 = 0;
            }
            if (var3 == 2) {
                arg0.field1010 = 0;
            }
        } else if (arg1 == -1 || arg0.field1005 == -1 || class269.method536(arg1).field3538 >= class269.method536(arg0.field1005).field3538) {
            arg0.field1005 = arg1;
            arg0.field1009 = 0;
            arg0.field1007 = 0;
            arg0.field1008 = arg2;
            arg0.field1010 = 0;
            arg0.field974 = arg0.field1006;
        }
    }

    @ObfuscatedName("ah.fl(I)I")
    public static int method538() {
        return field892 ? 2 : 1;
    }

    @ObfuscatedName("kz.fo(II)V")
    public static void method5027(int arg0) {
        field891 = 0L;
        if (arg0 >= 2) {
            field892 = true;
        } else {
            field892 = false;
        }
        if (method538() == 1) {
            Statics.field9.method885(765, 503);
        } else {
            Statics.field9.method885(7680, 2160);
        }
        if (field707 >= 25) {
            method126();
        }
    }

    @ObfuscatedName("f.fn(B)V")
    public static void method126() {
        class197 var0 = class197.method1625(class193.field2342, field723.field1341);
        var0.field2377.method5177(method538());
        var0.field2377.method5178(Statics.field1642);
        var0.field2377.method5178(Statics.field475);
        field723.method2159(var0);
    }

    @ObfuscatedName("client.d(I)V")
    public final void method955() {
        field891 = class307.method2184() + 500L;
        this.method1208();
        if (field838 != -1) {
            this.method1350(true);
        }
    }

    @ObfuscatedName("client.fd(I)V")
    public void method1208() {
        int var1 = Statics.field1642;
        int var2 = Statics.field475;
        if (this.field468 < var1) {
            int var3 = this.field468;
        }
        if (this.field472 < var2) {
            int var4 = this.field472;
        }
        if (Statics.field1694 != null) {
            try {
                class57.method755(Statics.field9, "resize", new Object[] { method538() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fw(I)V")
    public final void method1209() {
        if (field838 != -1) {
            method769(field838);
        }
        for (int var1 = 0; var1 < field682; var1++) {
            if (field883[var1]) {
                field884[var1] = true;
            }
            field885[var1] = field883[var1];
            field883[var1] = false;
        }
        field882 = field674;
        field827 = -1;
        field828 = -1;
        Statics.field3227 = null;
        if (field838 != -1) {
            field682 = 0;
            method3769(field838, 0, 0, Statics.field1642, Statics.field475, 0, 0, -1);
        }
        class331.method5678();
        if (field782) {
            if (field683 == 1) {
                Statics.field546[field780 / 100].method5765(field778 - 8, field922 - 8);
            }
            if (field683 == 2) {
                Statics.field546[field780 / 100 + 4].method5765(field778 - 8, field922 - 8);
            }
        }
        if (field813) {
            method5572();
        } else if (field827 != -1) {
            int var2 = field827;
            int var3 = field828;
            if ((field815 >= 2 || field701 != 0 || field833) && field826) {
                int var4 = method175();
                String var5;
                if (field701 == 1 && field815 < 2) {
                    var5 = class234.field2909 + class234.field2962 + field832 + " " + class91.field1173;
                } else if (field833 && field815 < 2) {
                    var5 = field836 + class234.field2962 + field837 + " " + class91.field1173;
                } else {
                    var5 = method1129(var4);
                }
                if (field815 > 2) {
                    var5 = var5 + class91.method631(16777215) + " " + '/' + " " + (field815 - 2) + class234.field2839;
                }
                Statics.field31.method5106(var5, var2 + 4, var3 + 15, 16777215, 0, field674 / 1000);
            }
        }
        if (field721 == 3) {
            for (int var6 = 0; var6 < field682; var6++) {
                if (field885[var6]) {
                    class331.method5660(field886[var6], field887[var6], field888[var6], field908[var6], 16711935, 128);
                } else if (field884[var6]) {
                    class331.method5660(field886[var6], field887[var6], field888[var6], field908[var6], 16711680, 128);
                }
            }
        }
        class85.method3449(Statics.field2544, Statics.field141.field995, Statics.field141.field1024, field738);
        field738 = 0;
    }

    @ObfuscatedName("cg.fa(Ljava/lang/String;ZI)V")
    public static final void method1640(String arg0, boolean arg1) {
        if (!field851) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3455.method5044(arg0, 250);
        int var6 = Statics.field3455.method5051(arg0, 250) * 13;
        class331.method5661(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class331.method5665(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3455.method5107(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field682; var11++) {
            if (field888[var11] + field886[var11] > var7 && field886[var11] < var7 + var9 && field908[var11] + field887[var11] > var8 && field887[var11] < var8 + var10) {
                field883[var11] = true;
            }
        }
        if (arg1) {
            Statics.field251.method812(0, 0);
        } else {
            method1648(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bt.fh(IIIIS)V")
    public static final void method1192(int arg0, int arg1, int arg2, int arg3) {
        field731++;
        if (Statics.field141.field995 >> 7 == field739 && Statics.field141.field1024 >> 7 == field909) {
            field739 = 0;
        }
        method172();
        method1033();
        method3375(true);
        int var4 = class99.field1279;
        int[] var5 = class99.field1282;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field804 != var5[var6] && field794 != var5[var6]) {
                method4080(field861[var5[var6]], true);
            }
        }
        method3375(false);
        method1978();
        for (class87 var7 = (class87) field808.method4621(); var7 != null; var7 = (class87) field808.method4641()) {
            if (Statics.field2544 != var7.field1138 || var7.field1147) {
                var7.method3401();
            } else if (field674 >= var7.field1139) {
                var7.method1919(field738);
                if (var7.field1147) {
                    var7.method3401();
                } else {
                    Statics.field596.method3116(var7.field1138, var7.field1144, var7.field1142, var7.field1141, 60, var7, 0, -1L, false);
                }
            }
        }
        method3849(arg0, arg1, arg2, arg3, true);
        int var8 = field840;
        int var9 = field704;
        int var10 = field925;
        int var11 = field937;
        class331.method5653(var8, var9, var8 + var10, var9 + var11);
        class140.method2870();
        if (!field725) {
            int var12 = field746;
            if (field763 / 256 > var12) {
                var12 = field763 / 256;
            }
            if (field923[4] && field741[4] + 128 > var12) {
                var12 = field741[4] + 128;
            }
            int var13 = field769 & 0x7FF;
            int var14 = Statics.field65;
            int var15 = Statics.field41;
            int var16 = Statics.field516;
            int var17 = var12 * 3 + 600;
            int var19 = var11 - 334;
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 100) {
                var19 = 100;
            }
            int var20 = (field936 - field930) * var19 / 100 + field930;
            int var21 = var17 * var20 / 256;
            int var23 = 2048 - var12 & 0x7FF;
            int var24 = 2048 - var13 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var21;
            if (var23 != 0) {
                int var28 = class140.field1811[var23];
                int var29 = class140.field1794[var23];
                int var30 = var26 * var29 - var21 * var28 >> 16;
                var27 = var26 * var28 + var21 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class140.field1811[var24];
                int var32 = class140.field1794[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field1781 = var14 - var25;
            Statics.field1925 = var15 - var26;
            Statics.field189 = var16 - var27;
            Statics.field3729 = var12;
            Statics.field2246 = var13;
            if (field847 == 1 && field814 >= 2 && field674 % 50 == 0 && (Statics.field65 >> 7 != Statics.field141.field995 >> 7 || Statics.field516 >> 7 != Statics.field141.field1024 >> 7)) {
                int var34 = Statics.field141.field657;
                int var35 = (Statics.field65 >> 7) + Statics.field348;
                int var36 = (Statics.field516 >> 7) + Statics.field263;
                class197 var37 = class197.method1625(class193.field2328, field723.field1341);
                var37.field2377.method5178(var36);
                var37.field2377.method5238(field759);
                var37.field2377.method5178(var35);
                var37.field2377.method5220(var34);
                field723.method2159(var37);
            }
        }
        int var38;
        if (field725) {
            var38 = method210();
        } else {
            var38 = method79();
        }
        int var39 = Statics.field1781;
        int var40 = Statics.field1925;
        int var41 = Statics.field189;
        int var42 = Statics.field3729;
        int var43 = Statics.field2246;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field923[var44]) {
                int var45 = (int) (Math.random() * (double) (field679[var44] * 2 + 1) - (double) field679[var44] + Math.sin((double) field926[var44] / 100.0D * (double) field927[var44]) * (double) field741[var44]);
                if (var44 == 0) {
                    Statics.field1781 += var45;
                }
                if (var44 == 1) {
                    Statics.field1925 += var45;
                }
                if (var44 == 2) {
                    Statics.field189 += var45;
                }
                if (var44 == 3) {
                    Statics.field2246 = Statics.field2246 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field3729 += var45;
                    if (Statics.field3729 < 128) {
                        Statics.field3729 = 128;
                    }
                    if (Statics.field3729 > 383) {
                        Statics.field3729 = 383;
                    }
                }
            }
        }
        int var46 = class64.field504;
        int var47 = class64.field505;
        if (class64.field496 != 0) {
            var46 = class64.field512;
            var47 = class64.field513;
        }
        if (var46 >= var8 && var46 < var8 + var10 && var47 >= var9 && var47 < var9 + var11) {
            class138.method4977(var46 - var8, var47 - var9);
        } else {
            class138.method1966();
        }
        method3393();
        class331.method5661(var8, var9, var10, var11, 0);
        method3393();
        int var48 = class140.field1797;
        class140.field1797 = field747;
        Statics.field596.method2989(Statics.field1781, Statics.field1925, Statics.field189, Statics.field3729, Statics.field2246, var38);
        class140.field1797 = var48;
        method3393();
        Statics.field596.method2960();
        method542(var8, var9, var10, var11);
        if (field692 == 2) {
            method1955((field695 - Statics.field348 << 7) + field698, (field696 - Statics.field263 << 7) + field699, field890 * 2);
            if (field706 > -1 && field674 % 20 < 10) {
                Statics.field1298[0].method5765(field706 + var8 - 12, field777 + var9 - 28);
            }
        }
        ((class129) Statics.field1808).method2619(field738);
        field791 = 0;
        int var49 = (Statics.field141.field995 >> 7) + Statics.field348;
        int var50 = (Statics.field141.field1024 >> 7) + Statics.field263;
        if (var49 >= 3053 && var49 <= 3156 && var50 >= 3056 && var50 <= 3136) {
            field791 = 1;
        }
        if (var49 >= 3072 && var49 <= 3118 && var50 >= 9492 && var50 <= 9535) {
            field791 = 1;
        }
        if (field791 == 1 && var49 >= 3139 && var49 <= 3199 && var50 >= 3008 && var50 <= 3062) {
            field791 = 0;
        }
        Statics.field1781 = var39;
        Statics.field1925 = var40;
        Statics.field189 = var41;
        Statics.field3729 = var42;
        Statics.field2246 = var43;
        if (field942) {
            byte var51 = 0;
            int var52 = class247.field3199 + class247.field3197 + var51;
            if (var52 == 0) {
                field942 = false;
            }
        }
        if (field942) {
            class331.method5661(var8, var9, var10, var11, 0);
            method1640(class234.field2809, false);
        }
    }

    @ObfuscatedName("hm.ft(IIIIZI)V")
    public static final void method3849(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field770;
        } else if (var5 >= 100) {
            var6 = field929;
        } else {
            var6 = (field929 - field770) * var5 / 100 + field770;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field939) {
            short var8 = field939;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field933) {
                var6 = field933;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class331.method5678();
                    class331.method5661(arg0, arg1, var10, arg3, -16777216);
                    class331.method5661(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field935) {
            short var11 = field935;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field932) {
                var6 = field932;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class331.method5678();
                    class331.method5661(arg0, arg1, arg2, var13, -16777216);
                    class331.method5661(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field747 = arg3 * var6 / 334;
        if (field925 != arg2 || field937 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class140.field1811[var16];
                int var20 = arg3 - 334;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 100) {
                    var20 = 100;
                }
                int var21 = (field936 - field930) * var20 / 100 + field930;
                int var22 = var17 * var21 / 256;
                var14[var15] = var19 * var22 >> 16;
            }
            class143.method2981(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field840 = arg0;
        field704 = arg1;
        field925 = arg2;
        field937 = arg3;
    }

    @ObfuscatedName("v.gx(I)V")
    public static void method172() {
        if (field940) {
            method4080(Statics.field141, false);
        }
    }

    @ObfuscatedName("bu.gk(I)V")
    public static void method1033() {
        if (field804 >= 0 && field861[field804] != null) {
            method4080(field861[field804], false);
        }
    }

    @ObfuscatedName("ik.gs(Lbf;ZI)V")
    public static void method4080(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1165() || arg0.field656) {
            return;
        }
        arg0.field635 = false;
        if ((field676 && class99.field1279 > 50 || class99.field1279 > 200) && arg1 && arg0.field978 == arg0.field1002) {
            arg0.field635 = true;
        }
        int var2 = arg0.field995 >> 7;
        int var3 = arg0.field1024 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method3833(0, 0, 0, false, arg0.field658);
        if (arg0.field648 != null && field674 >= arg0.field659 && field674 < arg0.field651) {
            arg0.field635 = false;
            arg0.field643 = method1061(arg0.field995, arg0.field1024, Statics.field2544);
            arg0.field977 = field674;
            Statics.field596.method3057(Statics.field2544, arg0.field995, arg0.field1024, arg0.field643, 60, arg0, arg0.field1030, var4, arg0.field650, arg0.field636, arg0.field652, arg0.field644);
            return;
        }
        if ((arg0.field995 & 0x7F) == 64 && (arg0.field1024 & 0x7F) == 64) {
            if (field731 == field774[var2][var3]) {
                return;
            }
            field774[var2][var3] = field731;
        }
        arg0.field643 = method1061(arg0.field995, arg0.field1024, Statics.field2544);
        arg0.field977 = field674;
        Statics.field596.method3116(Statics.field2544, arg0.field995, arg0.field1024, arg0.field643, 60, arg0, arg0.field1030, var4, arg0.field975);
    }

    @ObfuscatedName("ft.gj(ZI)V")
    public static final void method3375(boolean arg0) {
        for (int var1 = 0; var1 < field719; var1++) {
            class89 var2 = field718[field720[var1]];
            if (var2 != null && var2.method1165() && var2.field1159.field3510 == arg0 && var2.field1159.method4452()) {
                int var3 = var2.field995 >> 7;
                int var4 = var2.field1024 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1015 == 1 && (var2.field995 & 0x7F) == 64 && (var2.field1024 & 0x7F) == 64) {
                        if (field731 == field774[var3][var4]) {
                            continue;
                        }
                        field774[var3][var4] = field731;
                    }
                    long var5 = class138.method3833(0, 0, 1, !var2.field1159.field3518, field720[var1]);
                    var2.field977 = field674;
                    Statics.field596.method3116(Statics.field2544, var2.field995, var2.field1024, method1061(var2.field995 + (var2.field1015 * 64 - 64), var2.field1024 + (var2.field1015 * 64 - 64), Statics.field2544), var2.field1015 * 64 - 64 + 60, var2, var2.field1030, var5, var2.field975);
                }
            }
        }
    }

    @ObfuscatedName("cx.gm(I)V")
    public static final void method1978() {
        for (class96 var0 = (class96) field807.method4621(); var0 != null; var0 = (class96) field807.method4641()) {
            if (Statics.field2544 != var0.field1239 || field674 > var0.field1245) {
                var0.method3401();
            } else if (field674 >= var0.field1244) {
                if (var0.field1248 > 0) {
                    class89 var1 = field718[var0.field1248 - 1];
                    if (var1 != null && var1.field995 >= 0 && var1.field995 < 13312 && var1.field1024 >= 0 && var1.field1024 < 13312) {
                        var0.method2012(var1.field995, var1.field1024, method1061(var1.field995, var1.field1024, var0.field1239) - var0.field1238, field674);
                    }
                }
                if (var0.field1248 < 0) {
                    int var2 = -var0.field1248 - 1;
                    class76 var3;
                    if (field794 == var2) {
                        var3 = Statics.field141;
                    } else {
                        var3 = field861[var2];
                    }
                    if (var3 != null && var3.field995 >= 0 && var3.field995 < 13312 && var3.field1024 >= 0 && var3.field1024 < 13312) {
                        var0.method2012(var3.field995, var3.field1024, method1061(var3.field995, var3.field1024, var0.field1239) - var0.field1238, field674);
                    }
                }
                var0.method2014(field738);
                Statics.field596.method3116(Statics.field2544, (int) var0.field1250, (int) var0.field1247, (int) var0.field1240, 60, var0, var0.field1243, -1L, false);
            }
        }
    }

    @ObfuscatedName("m.gr(I)I")
    public static final int method79() {
        if (Statics.field1694.field1083) {
            return Statics.field2544;
        }
        int var0 = 3;
        if (Statics.field3729 < 310) {
            int var1;
            int var2;
            if (field847 == 1) {
                var1 = Statics.field65 >> 7;
                var2 = Statics.field516 >> 7;
            } else {
                var1 = Statics.field141.field995 >> 7;
                var2 = Statics.field141.field1024 >> 7;
            }
            int var3 = Statics.field1781 >> 7;
            int var4 = Statics.field189 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field2544;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2544;
            }
            if ((class65.field519[Statics.field2544][var3][var4] & 0x4) != 0) {
                var0 = Statics.field2544;
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
                    if ((class65.field519[Statics.field2544][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2544;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class65.field519[Statics.field2544][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2544;
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
                    if ((class65.field519[Statics.field2544][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2544;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class65.field519[Statics.field2544][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2544;
                        }
                    }
                }
            }
        }
        if (Statics.field141.field995 >= 0 && Statics.field141.field1024 >= 0 && Statics.field141.field995 < 13312 && Statics.field141.field1024 < 13312) {
            if ((class65.field519[Statics.field2544][Statics.field141.field995 >> 7][Statics.field141.field1024 >> 7] & 0x4) != 0) {
                var0 = Statics.field2544;
            }
            return var0;
        } else {
            return Statics.field2544;
        }
    }

    @ObfuscatedName("p.gv(I)I")
    public static final int method210() {
        if (Statics.field1694.field1083) {
            return Statics.field2544;
        } else {
            int var0 = method1061(Statics.field1781, Statics.field189, Statics.field2544);
            return var0 - Statics.field1925 >= 800 || (class65.field519[Statics.field2544][Statics.field1781 >> 7][Statics.field189 >> 7] & 0x4) == 0 ? 3 : Statics.field2544;
        }
    }

    @ObfuscatedName("gc.gw(I)Z")
    public static boolean method3413() {
        return (field684 & 0x4) != 0;
    }

    @ObfuscatedName("client.gh(I)Z")
    public static boolean method1626() {
        return (field684 & 0x1) != 0;
    }

    @ObfuscatedName("ch.ga(B)Z")
    public static boolean method2022() {
        return (field684 & 0x8) != 0;
    }

    @ObfuscatedName("ld.gf(Lbf;I)Z")
    public static boolean method5560(class76 arg0) {
        if (field684 == 0) {
            return false;
        } else if (Statics.field141 == arg0) {
            return method2022();
        } else {
            boolean var1 = method3413() || method1626() && arg0.method1134();
            if (!var1) {
                boolean var2 = (field684 & 0x2) != 0;
                var1 = var2 && arg0.method1137();
            }
            return var1;
        }
    }

    @ObfuscatedName("r.gc(Lcg;IIIIII)V")
    public static final void method198(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1165()) {
            return;
        }
        if (arg0 instanceof class89) {
            class267 var6 = ((class89) arg0).field1159;
            if (var6.field3515 != null) {
                var6 = var6.method4451();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1279;
        int[] var8 = class99.field1282;
        byte var9 = 0;
        if (arg1 < var7 && field674 == arg0.field977 && method5560((class76) arg0)) {
            class76 var10 = (class76) arg0;
            if (arg1 < var7) {
                method3740(arg0, arg0.field1023 + 15);
                class306 var11 = (class306) field859.get(class302.field3682);
                byte var12 = 9;
                var11.method5056(var10.field649.method4889(), field706 + arg2, field777 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field973.method4555()) {
            method3740(arg0, arg0.field1023 + 15);
            for (class88 var14 = (class88) arg0.field973.method4551(); var14 != null; var14 = (class88) arg0.field973.method4553()) {
                class80 var15 = var14.method1927(field674);
                if (var15 != null) {
                    class257 var16 = var14.field1152;
                    class335 var17 = var16.method4176();
                    class335 var18 = var16.method4175();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3307;
                    } else {
                        if (var16.field3316 * 2 < var18.field3905) {
                            var19 = var16.field3316;
                        }
                        var20 = var18.field3905 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field674 - var15.field1038;
                    int var24 = var15.field1034 * var20 / var16.field3307;
                    int var27;
                    if (var15.field1037 > var23) {
                        int var25 = var16.field3311 == 0 ? 0 : var23 / var16.field3311 * var16.field3311;
                        int var26 = var15.field1035 * var20 / var16.field3307;
                        var27 = (var24 - var26) * var25 / var15.field1037 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1037 + var16.field3312 - var23;
                        if (var16.field3310 >= 0) {
                            var21 = (var28 << 8) / (var16.field3312 - var16.field3310);
                        }
                    }
                    if (var15.field1034 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field706 > -1) {
                            int var34 = field706 + arg2 - (var20 >> 1);
                            int var35 = field777 + arg3 - var13;
                            class331.method5661(var34, var35, var27, 5, 65280);
                            class331.method5661(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3907;
                        var13 += var30;
                        int var31 = field706 + arg2 - (var20 >> 1);
                        int var32 = field777 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5771(var33, var32, var21);
                            class331.method5654(var33, var32, var29 + var33, var30 + var32);
                            var18.method5771(var33, var32, var21);
                        } else {
                            var17.method5765(var33, var32);
                            class331.method5654(var33, var32, var29 + var33, var30 + var32);
                            var18.method5765(var33, var32);
                        }
                        class331.method5653(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1934()) {
                    var14.method3401();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class76 var37 = (class76) arg0;
            if (var37.field656) {
                return;
            }
            if (var37.field642 != -1 || var37.field638 != -1) {
                method3740(arg0, arg0.field1023 + 15);
                if (field706 > -1) {
                    if (var37.field642 != -1) {
                        var36 += 25;
                        Statics.field3582[var37.field642].method5765(field706 + arg2 - 12, field777 + arg3 - var36);
                    }
                    if (var37.field638 != -1) {
                        var36 += 25;
                        Statics.field879[var37.field638].method5765(field706 + arg2 - 12, field777 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field692 == 10 && field694 == var8[arg1]) {
                method3740(arg0, arg0.field1023 + 15);
                if (field706 > -1) {
                    int var38 = Statics.field1298[1].field3907 + var36;
                    Statics.field1298[1].method5765(field706 + arg2 - 12, field777 + arg3 - var38);
                }
            }
        } else {
            class267 var39 = ((class89) arg0).field1159;
            if (var39.field3515 != null) {
                var39 = var39.method4451();
            }
            if (var39.field3500 >= 0 && var39.field3500 < Statics.field879.length) {
                method3740(arg0, arg0.field1023 + 15);
                if (field706 > -1) {
                    Statics.field879[var39.field3500].method5765(field706 + arg2 - 12, field777 + arg3 - 30);
                }
            }
            if (field692 == 1 && field693 == field720[arg1 - var7] && field674 % 20 < 10) {
                method3740(arg0, arg0.field1023 + 15);
                if (field706 > -1) {
                    Statics.field1298[0].method5765(field706 + arg2 - 12, field777 + arg3 - 28);
                }
            }
        }
        if (arg0.field1021 != null && (arg1 >= var7 || !arg0.field987 && (field894 == 4 || !arg0.field986 && (field894 == 0 || field894 == 3 || field894 == 1 && ((class76) arg0).method1134())))) {
            method3740(arg0, arg0.field1023);
            if (field706 > -1 && field764 < field765) {
                field752[field764] = Statics.field31.method5127(arg0.field1021) / 2;
                field768[field764] = Statics.field31.field3707;
                field766[field764] = field706;
                field787[field764] = field777;
                field862[field764] = arg0.field990;
                field673[field764] = arg0.field991;
                field934[field764] = arg0.field989;
                field773[field764] = arg0.field1021;
                field764++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field993[var40];
            int var42 = arg0.field1019[var40];
            class263 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field674) {
                    continue;
                }
                var43 = class263.method3603(arg0.field1019[var40]);
                var44 = var43.field3357;
                if (var43 != null && var43.field3368 != null) {
                    var43 = var43.method4313();
                    if (var43 == null) {
                        arg0.field993[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field996[var40];
            class263 var46 = null;
            if (var45 >= 0) {
                var46 = class263.method3603(var45);
                if (var46 != null && var46.field3368 != null) {
                    var46 = var46.method4313();
                }
            }
            if (var41 - var44 <= field674) {
                if (var43 == null) {
                    arg0.field993[var40] = -1;
                } else {
                    method3740(arg0, arg0.field1023 / 2);
                    if (field706 > -1) {
                        if (var40 == 1) {
                            field777 -= 20;
                        }
                        if (var40 == 2) {
                            field706 -= 15;
                            field777 -= 10;
                        }
                        if (var40 == 3) {
                            field706 += 15;
                            field777 -= 10;
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
                        class335 var59 = null;
                        class335 var60 = null;
                        class335 var61 = null;
                        class335 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class335 var72 = var43.method4284();
                        if (var72 != null) {
                            var51 = var72.field3905;
                            int var73 = var72.field3907;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3902;
                        }
                        class335 var74 = var43.method4297();
                        if (var74 != null) {
                            var52 = var74.field3905;
                            int var75 = var74.field3907;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3902;
                        }
                        class335 var76 = var43.method4286();
                        if (var76 != null) {
                            var53 = var76.field3905;
                            int var77 = var76.field3907;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3902;
                        }
                        class335 var78 = var43.method4294();
                        if (var78 != null) {
                            var54 = var78.field3905;
                            int var79 = var78.field3907;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3902;
                        }
                        if (var46 != null) {
                            var59 = var46.method4284();
                            if (var59 != null) {
                                var63 = var59.field3905;
                                int var80 = var59.field3907;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3902;
                            }
                            var60 = var46.method4297();
                            if (var60 != null) {
                                var64 = var60.field3905;
                                int var81 = var60.field3907;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3902;
                            }
                            var61 = var46.method4286();
                            if (var61 != null) {
                                var65 = var61.field3905;
                                int var82 = var61.field3907;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3902;
                            }
                            var62 = var46.method4294();
                            if (var62 != null) {
                                var66 = var62.field3905;
                                int var83 = var62.field3907;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3902;
                            }
                        }
                        class305 var84 = var43.method4285();
                        if (var84 == null) {
                            var84 = Statics.field1320;
                        }
                        class305 var85;
                        if (var46 == null) {
                            var85 = Statics.field1320;
                        } else {
                            var85 = var46.method4285();
                            if (var85 == null) {
                                var85 = Statics.field1320;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4312(arg0.field994[var40]);
                        int var91 = var84.method5127(var90);
                        if (var46 != null) {
                            var87 = var46.method4312(arg0.field997[var40]);
                            var89 = var85.method5127(var87);
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
                        int var108 = arg0.field993[var40] - field674;
                        int var109 = var43.field3369 - var43.field3369 * var108 / var43.field3357;
                        int var110 = var43.field3363 * var108 / var43.field3357 + -var43.field3363;
                        int var111 = field706 + arg2 - (var100 >> 1) + var109;
                        int var112 = field777 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3367 + var112 + 15;
                        int var116 = var115 - var84.field3710;
                        int var117 = var84.field3709 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3367 + var112 + 15;
                            int var119 = var118 - var85.field3710;
                            int var120 = var85.field3709 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3356 >= 0) {
                            var123 = (var108 << 8) / (var43.field3357 - var43.field3356);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5771(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5771(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5771(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5771(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5047(var90, var98 + var111, var115, var43.field3353, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5771(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5771(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5771(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5771(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5047(var87, var106 + var111, var118, var46.field3353, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5765(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5765(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5765(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5765(var101 + var111 - var58, var112);
                            }
                            var84.method5053(var90, var98 + var111, var115, var43.field3353 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5765(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5765(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5765(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5765(var105 + var111 - var70, var112);
                                }
                                var85.method5053(var87, var106 + var111, var118, var46.field3353 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.gd(IIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3) {
        field764 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class99.field1279;
        int[] var8 = class99.field1282;
        for (int var9 = 0; var9 < field719 + var7; var9++) {
            class79 var10;
            if (var9 < var7) {
                var10 = field861[var8[var9]];
                if (field804 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field141 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field718[field720[var9 - var7]];
            }
            method198(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field940 && var6 != -1) {
            method198(Statics.field141, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method198(field861[field804], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field764; var11++) {
            int var12 = field766[var11];
            int var13 = field787[var11];
            int var14 = field752[var11];
            int var15 = field768[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field787[var17] - field768[var17] && var13 - var15 < field787[var17] + 2 && var12 - var14 < field766[var17] + field752[var17] && var12 + var14 > field766[var17] - field752[var17] && field787[var17] - field768[var17] < var13) {
                        var13 = field787[var17] - field768[var17];
                        var16 = true;
                    }
                }
            }
            field706 = field766[var11];
            field777 = field787[var11] = var13;
            String var18 = field773[var11];
            if (field728 == 0) {
                int var19 = 16776960;
                if (field862[var11] < 6) {
                    var19 = field893[field862[var11]];
                }
                if (field862[var11] == 6) {
                    var19 = field731 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field862[var11] == 7) {
                    var19 = field731 % 20 < 10 ? 255 : 65535;
                }
                if (field862[var11] == 8) {
                    var19 = field731 % 20 < 10 ? 45056 : 8454016;
                }
                if (field862[var11] == 9) {
                    int var20 = 150 - field934[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field862[var11] == 10) {
                    int var21 = 150 - field934[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field862[var11] == 11) {
                    int var22 = 150 - field934[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field673[var11] == 0) {
                    Statics.field31.method5056(var18, field706 + arg0, field777 + arg1, var19, 0);
                }
                if (field673[var11] == 1) {
                    Statics.field31.method5058(var18, field706 + arg0, field777 + arg1, var19, 0, field731);
                }
                if (field673[var11] == 2) {
                    Statics.field31.method5059(var18, field706 + arg0, field777 + arg1, var19, 0, field731);
                }
                if (field673[var11] == 3) {
                    Statics.field31.method5060(var18, field706 + arg0, field777 + arg1, var19, 0, field731, 150 - field934[var11]);
                }
                if (field673[var11] == 4) {
                    int var23 = (150 - field934[var11]) * (Statics.field31.method5127(var18) + 100) / 150;
                    class331.method5654(field706 + arg0 - 50, arg1, field706 + arg0 + 50, arg1 + arg3);
                    Statics.field31.method5053(var18, field706 + arg0 + 50 - var23, field777 + arg1, var19, 0);
                    class331.method5653(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field673[var11] == 5) {
                    int var24 = 150 - field934[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class331.method5654(arg0, field777 + arg1 - Statics.field31.field3707 - 1, arg0 + arg2, field777 + arg1 + 5);
                    Statics.field31.method5056(var18, field706 + arg0, field777 + arg1 + var25, var19, 0);
                    class331.method5653(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field31.method5056(var18, field706 + arg0, field777 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("hg.gz(Lcg;IB)V")
    public static final void method3740(class79 arg0, int arg1) {
        method1955(arg0.field995, arg0.field1024, arg1);
    }

    @ObfuscatedName("cq.gb(IIIB)V")
    public static final void method1955(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field706 = -1;
            field777 = -1;
            return;
        }
        int var3 = method1061(arg0, arg1, Statics.field2544) - arg2;
        int var4 = arg0 - Statics.field1781;
        int var5 = var3 - Statics.field1925;
        int var6 = arg1 - Statics.field189;
        int var7 = class140.field1811[Statics.field3729];
        int var8 = class140.field1794[Statics.field3729];
        int var9 = class140.field1811[Statics.field2246];
        int var10 = class140.field1794[Statics.field2246];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field706 = field747 * var11 / var15 + field925 / 2;
            field777 = field747 * var14 / var15 + field937 / 2;
        } else {
            field706 = -1;
            field777 = -1;
        }
    }

    @ObfuscatedName("bd.gp(IIII)I")
    public static final int method1061(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field519[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field527[var5][var3][var4] + class65.field527[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field527[var5][var3][var4 + 1] + class65.field527[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("av.gt(ZLky;B)V")
    public static final void method541(boolean arg0, class309 arg1) {
        field735 = arg0;
        if (!field735) {
            int var2 = arg1.method5231();
            int var3 = arg1.method5232();
            int var4 = arg1.method5195();
            Statics.field1909 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1909[var5][var6] = arg1.method5270();
                }
            }
            Statics.field1171 = new int[var4];
            Statics.field73 = new int[var4];
            Statics.field1830 = new int[var4];
            Statics.field3616 = new byte[var4][];
            Statics.field196 = new byte[var4][];
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
                        Statics.field1171[var8] = var11;
                        Statics.field73[var8] = Statics.field264.method3909("m" + var9 + "_" + var10);
                        Statics.field1830[var8] = Statics.field264.method3909("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3721(var2, var3, true);
            return;
        }
        int var12 = arg1.method5195();
        int var13 = arg1.method5232();
        boolean var14 = arg1.method5222() == 1;
        int var15 = arg1.method5195();
        arg1.method5154();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5135(1);
                    if (var19 == 1) {
                        field748[var16][var17][var18] = arg1.method5135(26);
                    } else {
                        field748[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5145();
        Statics.field1909 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1909[var20][var21] = arg1.method5270();
            }
        }
        Statics.field1171 = new int[var15];
        Statics.field73 = new int[var15];
        Statics.field1830 = new int[var15];
        Statics.field3616 = new byte[var15][];
        Statics.field196 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field748[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1171[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1171[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field73[var22] = Statics.field264.method3909("m" + var31 + "_" + var32);
                            Statics.field1830[var22] = Statics.field264.method3909("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3721(var13, var12, !var14);
    }

    @ObfuscatedName("hv.gn(IIZB)V")
    public static final void method3721(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field397 == arg0 && Statics.field3262 == arg1) {
            return;
        }
        Statics.field397 = arg0;
        Statics.field3262 = arg1;
        method3372(25);
        method1640(class234.field2809, true);
        int var3 = Statics.field348;
        int var4 = Statics.field263;
        Statics.field348 = (arg0 - 6) * 8;
        Statics.field263 = (arg1 - 6) * 8;
        int var5 = Statics.field348 - var3;
        int var6 = Statics.field263 - var4;
        int var7 = Statics.field348;
        int var8 = Statics.field263;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field718[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1031[var11] -= var5;
                    var10.field1029[var11] -= var6;
                }
                var10.field995 -= var5 * 128;
                var10.field1024 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field861[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1031[var14] -= var5;
                    var13.field1029[var14] -= var6;
                }
                var13.field995 -= var5 * 128;
                var13.field1024 -= var6 * 128;
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
                        field805[var25][var21][var22] = field805[var25][var23][var24];
                    } else {
                        field805[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field806.method4621(); var26 != null; var26 = (class78) field806.method4641()) {
            var26.field967 -= var5;
            var26.field959 -= var6;
            if (var26.field967 < 0 || var26.field959 < 0 || var26.field967 >= 104 || var26.field959 >= 104) {
                var26.method3401();
            }
        }
        if (field739 != 0) {
            field739 -= var5;
            field909 -= var6;
        }
        field916 = 0;
        field725 = false;
        Statics.field1781 -= var5 << 7;
        Statics.field189 -= var6 << 7;
        Statics.field65 -= var5 << 7;
        Statics.field516 -= var6 << 7;
        field903 = -1;
        field808.method4627();
        field807.method4627();
        for (int var27 = 0; var27 < 4; var27++) {
            field734[var27].method3370();
        }
    }

    @ObfuscatedName("cd.gl(ZI)V")
    public static final void method1972(boolean arg0) {
        method3393();
        field723.field1350++;
        if (field723.field1350 < 50 && !arg0) {
            return;
        }
        field723.field1350 = 0;
        if (field714 || field723.method2163() == null) {
            return;
        }
        class197 var1 = class197.method1625(class193.field2268, field723.field1341);
        field723.method2159(var1);
        try {
            field723.method2158();
        } catch (IOException var3) {
            field714 = true;
        }
    }

    @ObfuscatedName("cl.gy(IIIIII)V")
    public static final void method2145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field596.method2972(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field596.method3087(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class138.method139(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field633.field3906;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class138.method3219(var5);
            class264 var14 = class264.method3595(var13);
            if (var14.field3409 == -1) {
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
                class334 var15 = Statics.field1364[var14.field3409];
                if (var15 != null) {
                    int var16 = (var14.field3387 * 4 - var15.field3893) / 2;
                    int var17 = (var14.field3388 * 4 - var15.field3898) / 2;
                    var15.method5737(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3388) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field596.method2974(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field596.method3087(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class138.method3219(var18);
            class264 var24 = class264.method3595(var23);
            if (var24.field3409 != -1) {
                class334 var25 = Statics.field1364[var24.field3409];
                if (var25 != null) {
                    int var26 = (var24.field3387 * 4 - var25.field3893) / 2;
                    int var27 = (var24.field3388 * 4 - var25.field3898) / 2;
                    var25.method5737(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3388) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class138.method139(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field633.field3906;
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
        long var31 = Statics.field596.method2975(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class138.method3219(var31);
        class264 var34 = class264.method3595(var33);
        if (var34.field3409 == -1) {
            return;
        }
        class334 var35 = Statics.field1364[var34.field3409];
        if (var35 != null) {
            int var36 = (var34.field3387 * 4 - var35.field3893) / 2;
            int var37 = (var34.field3388 * 4 - var35.field3898) / 2;
            var35.method5737(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3388) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.gu(Ldx;B)Z")
    public final boolean method1543(class105 arg0) {
        class315 var2 = arg0.method2163();
        class309 var3 = arg0.field1342;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1343 == null) {
                if (arg0.field1345) {
                    if (!var2.method3311(1)) {
                        return false;
                    }
                    var2.method3312(arg0.field1342.field3731, 0, 1);
                    arg0.field1346 = 0;
                    arg0.field1345 = false;
                }
                var3.field3734 = 0;
                if (var3.method5140()) {
                    if (!var2.method3311(1)) {
                        return false;
                    }
                    var2.method3312(arg0.field1342.field3731, 1, 1);
                    arg0.field1346 = 0;
                }
                arg0.field1345 = true;
                class192[] var4 = class192.method3454();
                int var5 = var3.method5156();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3734);
                }
                arg0.field1343 = var4[var5];
                arg0.field1344 = arg0.field1343.field2158;
            }
            if (arg0.field1344 == -1) {
                if (!var2.method3311(1)) {
                    return false;
                }
                arg0.method2163().method3312(var3.field3731, 0, 1);
                arg0.field1344 = var3.field3731[0] & 0xFF;
            }
            if (arg0.field1344 == -2) {
                if (!var2.method3311(2)) {
                    return false;
                }
                arg0.method2163().method3312(var3.field3731, 0, 2);
                var3.field3734 = 0;
                arg0.field1344 = var3.method5195();
            }
            if (!var2.method3311(arg0.field1344)) {
                return false;
            }
            var3.field3734 = 0;
            var2.method3312(var3.field3731, 0, arg0.field1344);
            arg0.field1346 = 0;
            field793.method4716();
            arg0.field1347 = arg0.field1349;
            arg0.field1349 = arg0.field1337;
            arg0.field1337 = arg0.field1343;
            if (class192.field2162 == arg0.field1343) {
                for (int var6 = 0; var6 < Statics.field3232; var6++) {
                    class251 var7 = class251.method3419(var6);
                    if (var7 != null) {
                        class222.field2562[var6] = 0;
                        class222.field2558[var6] = 0;
                    }
                }
                method753();
                field865 += 32;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2220 == arg0.field1343) {
                byte var8 = var3.method5306();
                int var9 = var3.method5195();
                class222.field2562[var9] = var8;
                if (class222.field2558[var9] != var8) {
                    class222.field2558[var9] = var8;
                }
                method3303(var9);
                field864[++field865 - 1 & 0x1F] = var9;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1343) {
                method990(class195.field2364);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2209 == arg0.field1343) {
                field691 = var3.method5195() * 30;
                field776 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1343) {
                class81 var10 = new class81();
                var10.field1054 = var3.method5202();
                var10.field1044 = var3.method5195();
                int var11 = var3.method5270();
                var10.field1052 = var11;
                method3372(45);
                var2.method3308();
                Object var12 = null;
                class95.method760(var10);
                arg0.field1343 = null;
                return false;
            }
            if (class192.field2197 == arg0.field1343) {
                int var13 = var3.method5270();
                if (field759 != var13) {
                    field759 = var13;
                    method1081();
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2223 == arg0.field1343) {
                int var14 = var3.method5207();
                boolean var15 = var3.method5193() == 1;
                String var16 = "";
                boolean var17 = false;
                if (var15) {
                    var16 = var3.method5202();
                    if (Statics.field456.method1756(new class293(var16, Statics.field356))) {
                        var17 = true;
                    }
                }
                String var18 = var3.method5202();
                if (!var17) {
                    class101.method317(var14, var16, var18);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2235 == arg0.field1343) {
                if (field838 != -1) {
                    method3411(field838, 0);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2224 == arg0.field1343) {
                int var19 = var3.method5243();
                int var20 = var3.method5232();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = var3.method5270();
                int var22 = var3.method5232();
                if (var22 == 65535) {
                    var22 = -1;
                }
                for (int var23 = var20; var23 <= var22; var23++) {
                    long var24 = ((long) var19 << 32) + (long) var23;
                    class190 var26 = field880.method5611(var24);
                    if (var26 != null) {
                        var26.method3401();
                    }
                    field880.method5606(new class189(var21), var24);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1343) {
                int var27 = arg0.field1344 + var3.field3734;
                int var28 = var3.method5195();
                int var29 = var3.method5195();
                if (field838 != var28) {
                    field838 = var28;
                    this.method1350(false);
                    method2182(field838);
                    class86.method3852(field838);
                    for (int var30 = 0; var30 < 100; var30++) {
                        field883[var30] = true;
                    }
                }
                while (var29-- > 0) {
                    int var31 = var3.method5270();
                    int var32 = var3.method5195();
                    int var33 = var3.method5193();
                    class71 var34 = (class71) field954.method5611((long) var31);
                    if (var34 != null && var34.field583 != var32) {
                        method766(var34, true);
                        var34 = null;
                    }
                    if (var34 == null) {
                        var34 = method420(var31, var32, var33);
                    }
                    var34.field581 = true;
                }
                for (class71 var35 = (class71) field954.method5605(); var35 != null; var35 = (class71) field954.method5608()) {
                    if (var35.field581) {
                        var35.field581 = false;
                    } else {
                        method766(var35, true);
                    }
                }
                field880 = new class328(512);
                while (var3.field3734 < var27) {
                    int var36 = var3.method5270();
                    int var37 = var3.method5195();
                    int var38 = var3.method5195();
                    int var39 = var3.method5270();
                    for (int var40 = var37; var40 <= var38; var40++) {
                        long var41 = ((long) var36 << 32) + (long) var40;
                        field880.method5606(new class189(var39), var41);
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1343) {
                Statics.field456.field1099.method4794(var3, arg0.field1344);
                method4171();
                field871 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1343) {
                method541(true, arg0.field1342);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2207 == arg0.field1343) {
                method990(class195.field2368);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2222 == arg0.field1343) {
                int var43 = var3.method5193();
                method3146(var43);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1343) {
                class106.method237(var3, arg0.field1344);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1343) {
                field725 = true;
                Statics.field1473 = var3.method5193();
                Statics.field1562 = var3.method5193();
                Statics.field3621 = var3.method5195();
                Statics.field2014 = var3.method5193();
                Statics.field2593 = var3.method5193();
                if (Statics.field2593 >= 100) {
                    int var44 = Statics.field1473 * 128 + 64;
                    int var45 = Statics.field1562 * 128 + 64;
                    int var46 = method1061(var44, var45, Statics.field2544) - Statics.field3621;
                    int var47 = var44 - Statics.field1781;
                    int var48 = var46 - Statics.field1925;
                    int var49 = var45 - Statics.field189;
                    int var50 = (int) Math.sqrt((double) (var47 * var47 + var49 * var49));
                    Statics.field3729 = (int) (Math.atan2((double) var48, (double) var50) * 325.949D) & 0x7FF;
                    Statics.field2246 = (int) (Math.atan2((double) var47, (double) var49) * -325.949D) & 0x7FF;
                    if (Statics.field3729 < 128) {
                        Statics.field3729 = 128;
                    }
                    if (Statics.field3729 > 383) {
                        Statics.field3729 = 383;
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1343) {
                field725 = false;
                for (int var51 = 0; var51 < 5; var51++) {
                    field923[var51] = false;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2165 == arg0.field1343) {
                int var52 = var3.method5270();
                class71 var53 = (class71) field954.method5611((long) var52);
                if (var53 != null) {
                    method766(var53, true);
                }
                if (field844 != null) {
                    method710(field844);
                    field844 = null;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1343) {
                byte[] var54 = new byte[arg0.field1344];
                var3.method5142(var54, 0, var54.length);
                class310 var55 = new class310(var54);
                String var56 = var55.method5202();
                class61.method4704(var56, true, false);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2206 == arg0.field1343) {
                int var57 = var3.method5231();
                field838 = var57;
                this.method1350(false);
                method2182(var57);
                class86.method3852(field838);
                for (int var58 = 0; var58 < 100; var58++) {
                    field883[var58] = true;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2245 == arg0.field1343) {
                field725 = true;
                Statics.field1039 = var3.method5193();
                Statics.field44 = var3.method5193();
                Statics.field2100 = var3.method5195();
                Statics.field610 = var3.method5193();
                Statics.field1641 = var3.method5193();
                if (Statics.field1641 >= 100) {
                    Statics.field1781 = Statics.field1039 * 128 + 64;
                    Statics.field189 = Statics.field44 * 128 + 64;
                    Statics.field1925 = method1061(Statics.field1781, Statics.field189, Statics.field2544) - Statics.field2100;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2240 == arg0.field1343) {
                method4495(true, var3);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2212 == arg0.field1343) {
                int var59 = var3.method5270();
                int var60 = var3.method5233();
                class222.field2562[var60] = var59;
                if (class222.field2558[var60] != var59) {
                    class222.field2558[var60] = var59;
                }
                method3303(var60);
                field864[++field865 - 1 & 0x1F] = var60;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1343) {
                int var61 = var3.method5231();
                int var62 = var3.method5243();
                class227 var63 = class227.method2021(var62);
                if (var63.field2649 != 1 || var63.field2650 != var61) {
                    var63.field2649 = 1;
                    var63.field2650 = var61;
                    method710(var63);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2243 == arg0.field1343) {
                field739 = var3.method5193();
                if (field739 == 255) {
                    field739 = 0;
                }
                field909 = var3.method5193();
                if (field909 == 255) {
                    field909 = 0;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2221 == arg0.field1343) {
                Statics.field665 = class320.method2018(var3.method5193());
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2228 == arg0.field1343) {
                int var64 = var3.method5284();
                boolean var65 = var3.method5188() == 1;
                class227 var66 = class227.method2021(var64);
                if (var66.field2626 != var65) {
                    var66.field2626 = var65;
                    method710(var66);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2203 == arg0.field1343) {
                method990(class195.field2372);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2239 == arg0.field1343) {
                int var67 = var3.method5195();
                int var68 = var3.method5193();
                int var69 = var3.method5195();
                method71(var67, var68, var69);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1343) {
                method2856(var3.method5202());
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2183 == arg0.field1343) {
                int var70 = var3.method5284();
                class227 var71 = class227.method2021(var70);
                for (int var72 = 0; var72 < var71.field2730.length; var72++) {
                    var71.field2730[var72] = -1;
                    var71.field2730[var72] = 0;
                }
                method710(var71);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2215 == arg0.field1343) {
                Statics.field456.method1752(var3, arg0.field1344);
                field871 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1343) {
                int var73 = var3.method5270();
                int var74 = var3.method5195();
                if (var73 < -70000) {
                    var74 += 32768;
                }
                class227 var75;
                if (var73 >= 0) {
                    var75 = class227.method2021(var73);
                } else {
                    var75 = null;
                }
                if (var75 != null) {
                    for (int var76 = 0; var76 < var75.field2730.length; var76++) {
                        var75.field2730[var76] = 0;
                        var75.field2731[var76] = 0;
                    }
                }
                Statics.method4530(var74);
                int var77 = var3.method5195();
                for (int var78 = 0; var78 < var77; var78++) {
                    int var79 = var3.method5231();
                    int var80 = var3.method5188();
                    if (var80 == 255) {
                        var80 = var3.method5284();
                    }
                    if (var75 != null && var78 < var75.field2730.length) {
                        var75.field2730[var78] = var79;
                        var75.field2731[var78] = var80;
                    }
                    class69.method3596(var74, var78, var79 - 1, var80);
                }
                if (var75 != null) {
                    method710(var75);
                }
                method753();
                field758[++field904 - 1 & 0x1F] = var74 & 0x7FFF;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2210 == arg0.field1343) {
                int var81 = var3.method5270();
                int var82 = var3.method5270();
                int var83 = class63.method656();
                class197 var84 = class197.method1625(class193.field2263, field723.field1341);
                var84.field2377.method5419(var83);
                var84.field2377.method5221(field460);
                var84.field2377.method5238(var81);
                var84.field2377.method5245(var82);
                field723.method2159(var84);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2164 == arg0.field1343) {
                for (int var85 = 0; var85 < class222.field2558.length; var85++) {
                    if (class222.field2562[var85] != class222.field2558[var85]) {
                        class222.field2558[var85] = class222.field2562[var85];
                        method3303(var85);
                        field864[++field865 - 1 & 0x1F] = var85;
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2217 == arg0.field1343) {
                method753();
                field846 = var3.method5196();
                field776 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2241 == arg0.field1343) {
                method990(class195.field2363);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1343) {
                int var86 = var3.method5195();
                if (var86 == 65535) {
                    var86 = -1;
                }
                method576(var86);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2216 == arg0.field1343) {
                int var87 = var3.method5233();
                if (var87 == 65535) {
                    var87 = -1;
                }
                int var88 = var3.method5316();
                Statics.method4971(var87, var88);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2242 == arg0.field1343) {
                int var89 = var3.method5195();
                int var90 = var3.method5243();
                class227 var91 = class227.method2021(var90);
                if (var91 != null && var91.field2608 == 0) {
                    if (var89 > var91.field2630 - var91.field2622) {
                        var89 = var91.field2630 - var91.field2622;
                    }
                    if (var89 < 0) {
                        var89 = 0;
                    }
                    if (var91.field2703 != var89) {
                        var91.field2703 = var89;
                        method710(var91);
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2198 == arg0.field1343) {
                if (arg0.field1344 == 0) {
                    Statics.field1907 = null;
                } else {
                    if (Statics.field1907 == null) {
                        Statics.field1907 = new class295(Statics.field356, Statics.field9);
                    }
                    Statics.field1907.method4910(var3);
                }
                method2192();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2169 == arg0.field1343) {
                method4495(false, var3);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1343) {
                int var92 = var3.method5193();
                method1956(var92);
                arg0.field1343 = null;
                return false;
            }
            if (class192.field2227 == arg0.field1343) {
                if (Statics.field1907 != null) {
                    Statics.field1907.method4934(var3);
                }
                method2192();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2229 == arg0.field1343) {
                method990(class195.field2365);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1343) {
                int var93 = var3.method5215();
                int var94 = var3.method5215();
                String var95 = var3.method5202();
                if (var93 >= 1 && var93 <= 8) {
                    if (var95.equalsIgnoreCase(class234.field2806)) {
                        var95 = null;
                    }
                    field801[var93 - 1] = var95;
                    field802[var93 - 1] = var94 == 0;
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1343) {
                boolean var96 = var3.method5193() == 1;
                if (var96) {
                    Statics.field554 = class307.method2184() - var3.method5285();
                    Statics.field311 = new class16(var3, true);
                } else {
                    Statics.field311 = null;
                }
                field874 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1343) {
                int var97 = var3.method5215();
                int var98 = var3.method5284();
                int var99 = var3.method5231();
                class71 var100 = (class71) field954.method5611((long) var98);
                if (var100 != null) {
                    method766(var100, var100.field583 != var99);
                }
                method420(var98, var99, var97);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1343) {
                field895 = var3.method5188();
                field894 = var3.method5188();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1343) {
                Statics.field155 = var3.method5222();
                Statics.field598 = var3.method5188();
                while (var3.field3734 < arg0.field1344) {
                    int var101 = var3.method5193();
                    class195 var102 = class195.method3247()[var101];
                    method990(var102);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1343) {
                class99.method18(var3, arg0.field1344);
                method965();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1343) {
                boolean var103 = var3.method5189();
                if (!var103) {
                    Statics.field1902 = null;
                } else if (Statics.field1902 == null) {
                    Statics.field1902 = new class248();
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2205 == arg0.field1343) {
                method990(class195.field2369);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2232 == arg0.field1343) {
                int var104 = var3.method5270();
                int var105 = var3.method5233();
                class227 var106 = class227.method2021(var104);
                if (var106.field2649 != 2 || var106.field2650 != var105) {
                    var106.field2649 = 2;
                    var106.field2650 = var105;
                    method710(var106);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2226 == arg0.field1343) {
                Statics.field155 = var3.method5193();
                Statics.field598 = var3.method5222();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1343) {
                method990(class195.field2367);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2218 == arg0.field1343) {
                int var107 = var3.method5193();
                if (var3.method5193() == 0) {
                    field697[var107] = new class19();
                    var3.field3734 += 18;
                } else {
                    var3.field3734--;
                    field697[var107] = new class19(var3, false);
                }
                field873 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2208 == arg0.field1343) {
                int var108 = var3.method5232();
                int var109 = var3.method5243();
                int var110 = var3.method5233();
                class227 var111 = class227.method2021(var109);
                var111.field2634 = (var110 << 16) + var108;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1343) {
                int var112 = var3.method5284();
                int var113 = var3.method5232();
                int var114 = var113 >> 10 & 0x1F;
                int var115 = var113 >> 5 & 0x1F;
                int var116 = var113 & 0x1F;
                int var117 = (var116 << 3) + (var114 << 19) + (var115 << 11);
                class227 var118 = class227.method2021(var112);
                if (var118.field2628 != var117) {
                    var118.field2628 = var117;
                    method710(var118);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1343) {
                for (int var119 = 0; var119 < field861.length; var119++) {
                    if (field861[var119] != null) {
                        field861[var119].field1005 = -1;
                    }
                }
                for (int var120 = 0; var120 < field718.length; var120++) {
                    if (field718[var120] != null) {
                        field718[var120].field1005 = -1;
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1343) {
                int var121 = var3.method5195();
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = var3.method5254();
                int var123 = var3.method5254();
                class227 var124 = class227.method2021(var123);
                if (var124.field2717) {
                    var124.field2732 = var121;
                    var124.field2656 = var122;
                    class265 var126 = class265.method136(var121);
                    var124.field2741 = var126.field3431;
                    var124.field2658 = var126.field3441;
                    var124.field2670 = var126.field3442;
                    var124.field2655 = var126.field3443;
                    var124.field2707 = var126.field3444;
                    var124.field2643 = var126.field3439;
                    if (var126.field3445 == 1) {
                        var124.field2695 = 1;
                    } else {
                        var124.field2695 = 2;
                    }
                    if (var124.field2729 > 0) {
                        var124.field2643 = var124.field2643 * 32 / var124.field2729;
                    } else if (var124.field2617 > 0) {
                        var124.field2643 = var124.field2643 * 32 / var124.field2617;
                    }
                    method710(var124);
                } else if (var121 == -1) {
                    var124.field2649 = 0;
                    arg0.field1343 = null;
                    return true;
                } else {
                    class265 var125 = class265.method136(var121);
                    var124.field2649 = 4;
                    var124.field2650 = var121;
                    var124.field2741 = var125.field3431;
                    var124.field2658 = var125.field3441;
                    var124.field2643 = var125.field3439 * 100 / var122;
                    method710(var124);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2213 == arg0.field1343) {
                int var127 = var3.method5270();
                int var128 = var3.method5195();
                int var129 = var3.method5231();
                int var130 = var3.method5232();
                class227 var131 = class227.method2021(var127);
                if (var131.field2741 != var129 || var131.field2658 != var128 || var131.field2643 != var130) {
                    var131.field2741 = var129;
                    var131.field2658 = var128;
                    var131.field2643 = var130;
                    method710(var131);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1343) {
                Statics.field155 = var3.method5188();
                Statics.field598 = var3.method5215();
                for (int var132 = Statics.field155; var132 < Statics.field155 + 8; var132++) {
                    for (int var133 = Statics.field598; var133 < Statics.field598 + 8; var133++) {
                        if (field805[Statics.field2544][var132][var133] != null) {
                            field805[Statics.field2544][var132][var133] = null;
                            method98(var132, var133);
                        }
                    }
                }
                for (class78 var134 = (class78) field806.method4621(); var134 != null; var134 = (class78) field806.method4641()) {
                    if (var134.field967 >= Statics.field155 && var134.field967 < Statics.field155 + 8 && var134.field959 >= Statics.field598 && var134.field959 < Statics.field598 + 8 && Statics.field2544 == var134.field971) {
                        var134.field958 = 0;
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1343) {
                method753();
                field845 = var3.method5193();
                field776 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2219 == arg0.field1343) {
                String var135 = var3.method5202();
                long var136 = (long) var3.method5195();
                long var138 = (long) var3.method5197();
                class239 var140 = (class239) class205.method2633(class239.method1126(), var3.method5193());
                long var141 = (var136 << 32) + var138;
                boolean var143 = false;
                for (int var144 = 0; var144 < 100; var144++) {
                    if (field897[var144] == var141) {
                        var143 = true;
                        break;
                    }
                }
                if (Statics.field456.method1756(new class293(var135, Statics.field356))) {
                    var143 = true;
                }
                if (!var143 && field791 == 0) {
                    field897[field795] = var141;
                    field795 = (field795 + 1) % 100;
                    String var145 = class306.method5054(class301.method3703(class220.method1091(var3)));
                    byte var146;
                    if (var140.field3133) {
                        var146 = 7;
                    } else {
                        var146 = 3;
                    }
                    if (var140.field3124 == -1) {
                        class101.method317(var146, var135, var145);
                    } else {
                        class101.method317(var146, class91.method698(var140.field3124) + var135, var145);
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2230 == arg0.field1343) {
                Statics.field456.method1750();
                field871 = field863;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2214 == arg0.field1343) {
                int var147 = var3.method5235();
                int var148 = var3.method5270();
                class227 var149 = class227.method2021(var148);
                if (var149.field2653 != var147 || var147 == -1) {
                    var149.field2653 = var147;
                    var149.field2734 = 0;
                    var149.field2735 = 0;
                    method710(var149);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1343) {
                var3.field3734 += 28;
                if (var3.method5218()) {
                    method793(var3, var3.field3734 - 28);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1343) {
                int var150 = var3.method5243();
                class227 var151 = class227.method2021(var150);
                var151.field2649 = 3;
                var151.field2650 = Statics.field141.field645.method3749();
                method710(var151);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2193 == arg0.field1343) {
                method753();
                int var152 = var3.method5270();
                int var153 = var3.method5188();
                int var154 = var3.method5193();
                field811[var153] = var152;
                field809[var153] = var154;
                field810[var153] = 1;
                for (int var155 = 0; var155 < 98; var155++) {
                    if (var152 >= class231.field2785[var155]) {
                        field810[var153] = var155 + 2;
                    }
                }
                field868[++field869 - 1 & 0x1F] = var153;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2236 == arg0.field1343) {
                field692 = var3.method5193();
                if (field692 == 1) {
                    field693 = var3.method5195();
                }
                if (field692 >= 2 && field692 <= 6) {
                    if (field692 == 2) {
                        field698 = 64;
                        field699 = 64;
                    }
                    if (field692 == 3) {
                        field698 = 0;
                        field699 = 64;
                    }
                    if (field692 == 4) {
                        field698 = 128;
                        field699 = 64;
                    }
                    if (field692 == 5) {
                        field698 = 64;
                        field699 = 0;
                    }
                    if (field692 == 6) {
                        field698 = 64;
                        field699 = 128;
                    }
                    field692 = 2;
                    field695 = var3.method5195();
                    field696 = var3.method5195();
                    field890 = var3.method5193();
                }
                if (field692 == 10) {
                    field694 = var3.method5195();
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1343) {
                int var156 = var3.method5243();
                String var157 = var3.method5202();
                class227 var158 = class227.method2021(var156);
                if (!var157.equals(var158.field2667)) {
                    var158.field2667 = var157;
                    method710(var158);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1343) {
                int var159 = var3.method5193();
                int var160 = var3.method5193();
                int var161 = var3.method5193();
                int var162 = var3.method5193();
                field923[var159] = true;
                field679[var159] = var160;
                field741[var159] = var161;
                field926[var159] = var162;
                field927[var159] = 0;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2238 == arg0.field1343) {
                method990(class195.field2371);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2225 == arg0.field1343) {
                String var163 = var3.method5202();
                Object[] var164 = new Object[var163.length() + 1];
                for (int var165 = var163.length() - 1; var165 >= 0; var165--) {
                    if (var163.charAt(var165) == 's') {
                        var164[var165 + 1] = var3.method5202();
                    } else {
                        var164[var165 + 1] = Integer.valueOf(var3.method5270());
                    }
                }
                var164[0] = Integer.valueOf(var3.method5270());
                class72 var166 = new class72();
                var166.field601 = var164;
                class86.method2141(var166);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1343) {
                method541(false, arg0.field1342);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2202 == arg0.field1343) {
                int var167 = var3.method5284();
                int var168 = var3.method5270();
                class71 var169 = (class71) field954.method5611((long) var167);
                class71 var170 = (class71) field954.method5611((long) var168);
                if (var170 != null) {
                    method766(var170, var169 == null || var169.field583 != var170.field583);
                }
                if (var169 != null) {
                    var169.method3401();
                    field954.method5606(var169, (long) var168);
                }
                class227 var171 = class227.method2021(var167);
                if (var171 != null) {
                    method710(var171);
                }
                class227 var172 = class227.method2021(var168);
                if (var172 != null) {
                    method710(var172);
                    method46(Statics.field2597[var172.field2738 >>> 16], var172, true);
                }
                if (field838 != -1) {
                    method3411(field838, 1);
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1343) {
                method990(class195.field2362);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1343) {
                int var173 = var3.method5233();
                class69.method229(var173);
                field758[++field904 - 1 & 0x1F] = var173 & 0x7FFF;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2231 == arg0.field1343) {
                method2852();
                arg0.field1343 = null;
                return false;
            }
            if (class192.field2233 == arg0.field1343) {
                field910 = var3.method5193();
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1343) {
                String var174 = var3.method5202();
                String var175 = class306.method5054(class301.method3703(class220.method1091(var3)));
                class101.method317(6, var174, var175);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2244 == arg0.field1343) {
                int var176 = var3.method5270();
                int var177 = var3.method5195();
                if (var176 < -70000) {
                    var177 += 32768;
                }
                class227 var178;
                if (var176 >= 0) {
                    var178 = class227.method2021(var176);
                } else {
                    var178 = null;
                }
                while (var3.field3734 < arg0.field1344) {
                    int var179 = var3.method5207();
                    int var180 = var3.method5195();
                    int var181 = 0;
                    if (var180 != 0) {
                        var181 = var3.method5193();
                        if (var181 == 255) {
                            var181 = var3.method5270();
                        }
                    }
                    if (var178 != null && var179 >= 0 && var179 < var178.field2730.length) {
                        var178.field2730[var179] = var180;
                        var178.field2731[var179] = var181;
                    }
                    class69.method3596(var177, var179, var180 - 1, var181);
                }
                if (var178 != null) {
                    method710(var178);
                }
                method753();
                field758[++field904 - 1 & 0x1F] = var177 & 0x7FFF;
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2237 == arg0.field1343) {
                String var182 = var3.method5202();
                long var183 = var3.method5285();
                long var185 = (long) var3.method5195();
                long var187 = (long) var3.method5197();
                class239 var189 = (class239) class205.method2633(class239.method1126(), var3.method5193());
                long var190 = (var185 << 32) + var187;
                boolean var192 = false;
                for (int var193 = 0; var193 < 100; var193++) {
                    if (field897[var193] == var190) {
                        var192 = true;
                        break;
                    }
                }
                if (var189.field3134 && Statics.field456.method1756(new class293(var182, Statics.field356))) {
                    var192 = true;
                }
                if (!var192 && field791 == 0) {
                    field897[field795] = var190;
                    field795 = (field795 + 1) % 100;
                    String var194 = class306.method5054(class301.method3703(class220.method1091(var3)));
                    if (var189.field3124 == -1) {
                        class101.method230(9, var182, var194, class299.method143(var183));
                    } else {
                        class101.method230(9, class91.method698(var189.field3124) + var182, var194, class299.method143(var183));
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2234 == arg0.field1343) {
                method990(class195.field2366);
                arg0.field1343 = null;
                return true;
            }
            if (class192.field2211 == arg0.field1343) {
                int var195 = var3.method5254();
                int var196 = var3.method5196();
                int var197 = var3.method5234();
                class227 var198 = class227.method2021(var195);
                if (var198.field2661 != var197 || var198.field2616 != var196 || var198.field2694 != 0 || var198.field2674 != 0) {
                    var198.field2661 = var197;
                    var198.field2616 = var196;
                    var198.field2694 = 0;
                    var198.field2674 = 0;
                    method710(var198);
                    this.method1576(var198);
                    if (var198.field2608 == 0) {
                        method46(Statics.field2597[var195 >> 16], var198, false);
                    }
                }
                arg0.field1343 = null;
                return true;
            }
            class351.method2420("" + (arg0.field1343 == null ? -1 : arg0.field1343.field2199) + class91.field1169 + (arg0.field1349 == null ? -1 : arg0.field1349.field2199) + class91.field1169 + (arg0.field1347 == null ? -1 : arg0.field1347.field2199) + class91.field1169 + arg0.field1344, (Throwable) null);
            method2852();
        } catch (IOException var203) {
            method1064();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1343 == null ? -1 : arg0.field1343.field2199) + class91.field1169 + (arg0.field1349 == null ? -1 : arg0.field1349.field2199) + class91.field1169 + (arg0.field1347 == null ? -1 : arg0.field1347.field2199) + class91.field1169 + arg0.field1344 + class91.field1169 + (Statics.field348 + Statics.field141.field1031[0]) + class91.field1169 + (Statics.field263 + Statics.field141.field1029[0]) + class91.field1169;
            for (int var202 = 0; var202 < arg0.field1344 && var202 < 50; var202++) {
                var201 = var201 + var3.field3731[var202] + class91.field1169;
            }
            class351.method2420(var201, var204);
            method2852();
        }
        return true;
    }

    @ObfuscatedName("be.gq(Lgd;I)V")
    public static final void method990(class195 arg0) {
        class309 var1 = field723.field1342;
        if (class195.field2362 == arg0) {
            int var2 = var1.method5232();
            int var3 = var1.method5222();
            int var4 = (var3 >> 4 & 0x7) + Statics.field155;
            int var5 = (var3 & 0x7) + Statics.field598;
            int var6 = var1.method5232();
            int var7 = var1.method5195();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class272 var8 = field805[Statics.field2544][var4][var5];
                if (var8 != null) {
                    for (class97 var9 = (class97) var8.method4621(); var9 != null; var9 = (class97) var8.method4641()) {
                        if ((var6 & 0x7FFF) == var9.field1268 && var9.field1265 == var2) {
                            var9.field1265 = var7;
                            break;
                        }
                    }
                    method98(var4, var5);
                }
            }
            return;
        }
        if (class195.field2372 == arg0) {
            int var10 = var1.method5188();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = var1.method5188();
            int var14 = var1.method5193();
            int var15 = (var14 >> 4 & 0x7) + Statics.field155;
            int var16 = (var14 & 0x7) + Statics.field598;
            int var17 = var1.method5232();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                int var18 = var11 + 1;
                if (Statics.field141.field1031[0] >= var15 - var18 && Statics.field141.field1031[0] <= var15 + var18 && Statics.field141.field1029[0] >= var16 - var18 && Statics.field141.field1029[0] <= var16 + var18 && field915 != 0 && var12 > 0 && field916 < 50) {
                    field917[field916] = var17;
                    field918[field916] = var12;
                    field919[field916] = var13;
                    field921[field916] = null;
                    field920[field916] = (var15 << 16) + (var16 << 8) + var11;
                    field916++;
                }
            }
        }
        if (class195.field2365 == arg0) {
            int var19 = var1.method5232();
            byte var20 = var1.method5225();
            int var21 = var1.method5222();
            int var22 = (var21 >> 4 & 0x7) + Statics.field155;
            int var23 = (var21 & 0x7) + Statics.field598;
            int var24 = var1.method5193();
            int var25 = var1.method5188() * 4;
            int var26 = var1.method5215();
            int var27 = var1.method5231();
            int var28 = var1.method5195();
            int var29 = var1.method5234();
            int var30 = var1.method5222() * 4;
            byte var31 = var1.method5225();
            int var32 = var20 + var22;
            int var33 = var23 + var31;
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var19 != 65535) {
                int var34 = var22 * 128 + 64;
                int var35 = var23 * 128 + 64;
                int var36 = var32 * 128 + 64;
                int var37 = var33 * 128 + 64;
                class96 var38 = new class96(var19, Statics.field2544, var34, var35, method1061(var34, var35, Statics.field2544) - var25, field674 + var27, field674 + var28, var26, var24, var29, var30);
                var38.method2012(var36, var37, method1061(var36, var37, Statics.field2544) - var30, field674 + var27);
                field807.method4616(var38);
            }
        } else if (class195.field2366 == arg0) {
            int var39 = var1.method5215();
            int var40 = (var39 >> 4 & 0x7) + Statics.field155;
            int var41 = (var39 & 0x7) + Statics.field598;
            int var42 = var1.method5188();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field737[var43];
            int var46 = var1.method5195();
            if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                if (var45 == 0) {
                    class146 var47 = Statics.field596.method3034(Statics.field2544, var40, var41);
                    if (var47 != null) {
                        int var48 = class138.method3219(var47.field1915);
                        if (var43 == 2) {
                            var47.field1913 = new class103(var48, 2, var44 + 4, Statics.field2544, var40, var41, var46, false, var47.field1913);
                            var47.field1914 = new class103(var48, 2, var44 + 1 & 0x3, Statics.field2544, var40, var41, var46, false, var47.field1914);
                        } else {
                            var47.field1913 = new class103(var48, var43, var44, Statics.field2544, var40, var41, var46, false, var47.field1913);
                        }
                    }
                }
                if (var45 == 1) {
                    class151 var49 = Statics.field596.method2969(Statics.field2544, var40, var41);
                    if (var49 != null) {
                        int var50 = class138.method3219(var49.field1956);
                        if (var43 == 4 || var43 == 5) {
                            var49.field1961 = new class103(var50, 4, var44, Statics.field2544, var40, var41, var46, false, var49.field1961);
                        } else if (var43 == 6) {
                            var49.field1961 = new class103(var50, 4, var44 + 4, Statics.field2544, var40, var41, var46, false, var49.field1961);
                        } else if (var43 == 7) {
                            var49.field1961 = new class103(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field2544, var40, var41, var46, false, var49.field1961);
                        } else if (var43 == 8) {
                            var49.field1961 = new class103(var50, 4, var44 + 4, Statics.field2544, var40, var41, var46, false, var49.field1961);
                            var49.field1962 = new class103(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field2544, var40, var41, var46, false, var49.field1962);
                        }
                    }
                }
                if (var45 == 2) {
                    class152 var51 = Statics.field596.method2955(Statics.field2544, var40, var41);
                    if (var43 == 11) {
                        var43 = 10;
                    }
                    if (var51 != null) {
                        var51.field1965 = new class103(class138.method3219(var51.field1977), var43, var44, Statics.field2544, var40, var41, var46, false, var51.field1965);
                    }
                }
                if (var45 == 3) {
                    class133 var52 = Statics.field596.method2971(Statics.field2544, var40, var41);
                    if (var52 != null) {
                        var52.field1637 = new class103(class138.method3219(var52.field1635), 22, var44, Statics.field2544, var40, var41, var46, false, var52.field1637);
                    }
                }
            }
        } else if (class195.field2369 == arg0) {
            int var53 = var1.method5233();
            int var54 = var1.method5215();
            int var55 = (var54 >> 4 & 0x7) + Statics.field155;
            int var56 = (var54 & 0x7) + Statics.field598;
            int var57 = var1.method5215();
            int var58 = var1.method5231();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                int var59 = var55 * 128 + 64;
                int var60 = var56 * 128 + 64;
                class87 var61 = new class87(var53, Statics.field2544, var59, var60, method1061(var59, var60, Statics.field2544) - var57, var58, field674);
                field808.method4616(var61);
            }
        } else if (class195.field2363 == arg0) {
            int var62 = var1.method5222();
            int var63 = (var62 >> 4 & 0x7) + Statics.field155;
            int var64 = (var62 & 0x7) + Statics.field598;
            int var65 = var1.method5215();
            int var66 = var65 >> 2;
            int var67 = var65 & 0x3;
            int var68 = field737[var66];
            int var69 = var1.method5233();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                method89(Statics.field2544, var63, var64, var68, var69, var66, var67, 0, -1);
            }
        } else if (class195.field2368 == arg0) {
            int var70 = var1.method5222();
            int var71 = var70 >> 2;
            int var72 = var70 & 0x3;
            int var73 = field737[var71];
            int var74 = var1.method5188();
            int var75 = (var74 >> 4 & 0x7) + Statics.field155;
            int var76 = (var74 & 0x7) + Statics.field598;
            if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                method89(Statics.field2544, var75, var76, var73, -1, var71, var72, 0, -1);
            }
        } else if (class195.field2364 == arg0) {
            int var77 = var1.method5188();
            int var78 = (var77 >> 4 & 0x7) + Statics.field155;
            int var79 = (var77 & 0x7) + Statics.field598;
            int var80 = var1.method5195();
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                class272 var81 = field805[Statics.field2544][var78][var79];
                if (var81 != null) {
                    for (class97 var82 = (class97) var81.method4621(); var82 != null; var82 = (class97) var81.method4641()) {
                        if ((var80 & 0x7FFF) == var82.field1268) {
                            var82.method3401();
                            break;
                        }
                    }
                    if (var81.method4621() == null) {
                        field805[Statics.field2544][var78][var79] = null;
                    }
                    method98(var78, var79);
                }
            }
        } else if (class195.field2371 == arg0) {
            int var83 = var1.method5193();
            int var84 = (var83 >> 4 & 0x7) + Statics.field155;
            int var85 = (var83 & 0x7) + Statics.field598;
            int var86 = var1.method5232();
            int var87 = var1.method5233();
            if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                class97 var88 = new class97();
                var88.field1268 = var87;
                var88.field1265 = var86;
                if (field805[Statics.field2544][var84][var85] == null) {
                    field805[Statics.field2544][var84][var85] = new class272();
                }
                field805[Statics.field2544][var84][var85].method4616(var88);
                method98(var84, var85);
            }
        } else if (class195.field2367 == arg0) {
            byte var89 = var1.method5194();
            byte var90 = var1.method5225();
            int var91 = var1.method5195();
            byte var92 = var1.method5194();
            byte var93 = var1.method5225();
            int var94 = var1.method5195();
            int var95 = var1.method5232();
            int var96 = var1.method5193();
            int var97 = (var96 >> 4 & 0x7) + Statics.field155;
            int var98 = (var96 & 0x7) + Statics.field598;
            int var99 = var1.method5222();
            int var100 = var99 >> 2;
            int var101 = var99 & 0x3;
            int var102 = field737[var100];
            int var103 = var1.method5195();
            class76 var104;
            if (field794 == var91) {
                var104 = Statics.field141;
            } else {
                var104 = field861[var91];
            }
            if (var104 != null) {
                class264 var105 = class264.method3595(var103);
                int var106;
                int var107;
                if (var101 == 1 || var101 == 3) {
                    var106 = var105.field3388;
                    var107 = var105.field3387;
                } else {
                    var106 = var105.field3387;
                    var107 = var105.field3388;
                }
                int var108 = (var106 >> 1) + var97;
                int var109 = (var106 + 1 >> 1) + var97;
                int var110 = (var107 >> 1) + var98;
                int var111 = (var107 + 1 >> 1) + var98;
                int[][] var112 = class65.field527[Statics.field2544];
                int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                int var114 = (var97 << 7) + (var106 << 6);
                int var115 = (var98 << 7) + (var107 << 6);
                class137 var116 = var105.method4327(var100, var101, var112, var114, var113, var115);
                if (var116 != null) {
                    method89(Statics.field2544, var97, var98, var102, -1, 0, 0, var95 + 1, var94 + 1);
                    var104.field659 = field674 + var95;
                    var104.field651 = field674 + var94;
                    var104.field648 = var116;
                    var104.field646 = var97 * 128 + var106 * 64;
                    var104.field641 = var98 * 128 + var107 * 64;
                    var104.field647 = var113;
                    if (var90 > var93) {
                        byte var117 = var90;
                        var90 = var93;
                        var93 = var117;
                    }
                    if (var89 > var92) {
                        byte var118 = var89;
                        var89 = var92;
                        var92 = var118;
                    }
                    var104.field650 = var90 + var97;
                    var104.field652 = var93 + var97;
                    var104.field636 = var89 + var98;
                    var104.field644 = var92 + var98;
                }
            }
        }
    }

    @ObfuscatedName("m.gg(IIIIIIIIII)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field806.method4621(); var10 != null; var10 = (class78) field806.method4641()) {
            if (var10.field971 == arg0 && var10.field967 == arg1 && var10.field959 == arg2 && var10.field957 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field971 = arg0;
            var9.field957 = arg3;
            var9.field967 = arg1;
            var9.field959 = arg2;
            method321(var9);
            field806.method4616(var9);
        }
        var9.field960 = arg4;
        var9.field965 = arg5;
        var9.field964 = arg6;
        var9.field966 = arg7;
        var9.field958 = arg8;
    }

    @ObfuscatedName("ap.go(Lbs;I)V")
    public static final void method321(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field957 == 0) {
            var1 = Statics.field596.method2972(arg0.field971, arg0.field967, arg0.field959);
        }
        if (arg0.field957 == 1) {
            var1 = Statics.field596.method2973(arg0.field971, arg0.field967, arg0.field959);
        }
        if (arg0.field957 == 2) {
            var1 = Statics.field596.method2974(arg0.field971, arg0.field967, arg0.field959);
        }
        if (arg0.field957 == 3) {
            var1 = Statics.field596.method2975(arg0.field971, arg0.field967, arg0.field959);
        }
        if (var1 != 0L) {
            int var6 = Statics.field596.method3087(arg0.field971, arg0.field967, arg0.field959, var1);
            var3 = class138.method3219(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field956 = var3;
        arg0.field962 = var4;
        arg0.field961 = var5;
    }

    @ObfuscatedName("ab.gi(IIIIIIII)V")
    public static final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field676 && Statics.field2544 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field596.method2972(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field596.method2973(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field596.method2974(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field596.method2975(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field596.method3087(arg0, arg2, arg3, var7);
            int var13 = class138.method3219(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field596.method2963(arg0, arg2, arg3);
                class264 var16 = class264.method3595(var13);
                if (var16.field3389 != 0) {
                    field734[arg0].method3344(arg2, arg3, var14, var15, var16.field3390);
                }
            }
            if (arg1 == 1) {
                Statics.field596.method2964(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field596.method2965(arg0, arg2, arg3);
                class264 var17 = class264.method3595(var13);
                if (var17.field3387 + arg2 > 103 || var17.field3387 + arg3 > 103 || var17.field3388 + arg2 > 103 || var17.field3388 + arg3 > 103) {
                    return;
                }
                if (var17.field3389 != 0) {
                    field734[arg0].method3364(arg2, arg3, var17.field3387, var17.field3388, var15, var17.field3390);
                }
            }
            if (arg1 == 3) {
                Statics.field596.method3031(arg0, arg2, arg3);
                class264 var18 = class264.method3595(var13);
                if (var18.field3389 == 1) {
                    field734[arg0].method3347(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field519[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class65.method4315(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field596, field734[arg0]);
    }

    @ObfuscatedName("a.ge(III)V")
    public static final void method98(int arg0, int arg1) {
        class272 var2 = field805[Statics.field2544][arg0][arg1];
        if (var2 == null) {
            Statics.field596.method2967(Statics.field2544, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class97 var5 = null;
        for (class97 var6 = (class97) var2.method4621(); var6 != null; var6 = (class97) var2.method4641()) {
            class265 var7 = class265.method136(var6.field1268);
            long var8 = (long) var7.field3479;
            if (var7.field3445 == 1) {
                var8 = (long) (var6.field1265 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field596.method2967(Statics.field2544, arg0, arg1);
            return;
        }
        var2.method4617(var5);
        class97 var10 = null;
        class97 var11 = null;
        for (class97 var12 = (class97) var2.method4621(); var12 != null; var12 = (class97) var2.method4641()) {
            if (var5.field1268 != var12.field1268) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1268 != var12.field1268 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class138.method3833(arg0, arg1, 3, false, 0);
        Statics.field596.method2953(Statics.field2544, arg0, arg1, method1061(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2544), var5, var13, var10, var11);
    }

    @ObfuscatedName("jt.he(ZLky;I)V")
    public static final void method4495(boolean arg0, class309 arg1) {
        field772 = 0;
        field703 = 0;
        class309 var2 = field723.field1342;
        var2.method5154();
        int var3 = var2.method5135(8);
        if (var3 < field719) {
            for (int var4 = var3; var4 < field719; var4++) {
                field931[++field772 - 1] = field720[var4];
            }
        }
        if (var3 > field719) {
            throw new RuntimeException("");
        }
        field719 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field720[var5];
            class89 var7 = field718[var6];
            int var8 = var2.method5135(1);
            if (var8 == 0) {
                field720[++field719 - 1] = var6;
                var7.field1022 = field674;
            } else {
                int var9 = var2.method5135(2);
                if (var9 == 0) {
                    field720[++field719 - 1] = var6;
                    var7.field1022 = field674;
                    field722[++field703 - 1] = var6;
                } else if (var9 == 1) {
                    field720[++field719 - 1] = var6;
                    var7.field1022 = field674;
                    int var10 = var2.method5135(3);
                    var7.method1943(var10, (byte) 1);
                    int var11 = var2.method5135(1);
                    if (var11 == 1) {
                        field722[++field703 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field720[++field719 - 1] = var6;
                    var7.field1022 = field674;
                    int var12 = var2.method5135(3);
                    var7.method1943(var12, (byte) 2);
                    int var13 = var2.method5135(3);
                    var7.method1943(var13, (byte) 2);
                    int var14 = var2.method5135(1);
                    if (var14 == 1) {
                        field722[++field703 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field931[++field772 - 1] = var6;
                }
            }
        }
        method4489(arg0, arg1);
        method3984(arg1);
        for (int var15 = 0; var15 < field772; var15++) {
            int var16 = field931[var15];
            if (field674 != field718[var16].field1022) {
                field718[var16].field1159 = null;
                field718[var16] = null;
            }
        }
        if (field723.field1344 != arg1.field3734) {
            throw new RuntimeException(arg1.field3734 + class91.field1169 + field723.field1344);
        }
        for (int var17 = 0; var17 < field719; var17++) {
            if (field718[field720[var17]] == null) {
                throw new RuntimeException(var17 + class91.field1169 + field719);
            }
        }
    }

    @ObfuscatedName("jt.hf(ZLky;B)V")
    public static final void method4489(boolean arg0, class309 arg1) {
        while (true) {
            if (arg1.method5141(field723.field1344) >= 27) {
                int var2 = arg1.method5135(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field718[var2] == null) {
                        field718[var2] = new class89();
                        var3 = true;
                    }
                    class89 var4 = field718[var2];
                    field720[++field719 - 1] = var2;
                    var4.field1022 = field674;
                    int var5 = arg1.method5135(1);
                    if (var5 == 1) {
                        field722[++field703 - 1] = var2;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method5135(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method5135(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = arg1.method5135(1);
                    var4.field1159 = class267.method2944(arg1.method5135(14));
                    int var8 = field803[arg1.method5135(3)];
                    if (var3) {
                        var4.field1032 = var4.field1030 = var8;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5135(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5135(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1015 = var4.field1159.field3513;
                    var4.field1026 = var4.field1159.field3505;
                    if (var4.field1026 == 0) {
                        var4.field1030 = 0;
                    }
                    var4.field981 = var4.field1159.field3497;
                    var4.field982 = var4.field1159.field3494;
                    var4.field983 = var4.field1159.field3499;
                    var4.field984 = var4.field1159.field3516;
                    var4.field978 = var4.field1159.field3486;
                    var4.field979 = var4.field1159.field3495;
                    var4.field980 = var4.field1159.field3496;
                    var4.method1945(Statics.field141.field1031[0] + var9, Statics.field141.field1029[0] + var6, var7 == 1);
                    continue;
                }
            }
            arg1.method5145();
            return;
        }
    }

    @ObfuscatedName("iw.hx(Lky;I)V")
    public static final void method3984(class309 arg0) {
        for (int var1 = 0; var1 < field703; var1++) {
            int var2 = field722[var1];
            class89 var3 = field718[var2];
            int var4 = arg0.method5193();
            if ((var4 & 0x80) != 0) {
                int var5 = arg0.method5215();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = arg0.method5207();
                        if (var10 == 32767) {
                            var10 = arg0.method5207();
                            var8 = arg0.method5207();
                            var7 = arg0.method5207();
                            var9 = arg0.method5207();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = arg0.method5207();
                        }
                        int var11 = arg0.method5207();
                        var3.method1633(var10, var8, var7, var9, field674, var11);
                    }
                }
                int var12 = arg0.method5193();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = arg0.method5207();
                        int var15 = arg0.method5207();
                        if (var15 == 32767) {
                            var3.method1635(var14);
                        } else {
                            int var16 = arg0.method5207();
                            int var17 = arg0.method5188();
                            int var18 = var15 > 0 ? arg0.method5215() : var17;
                            var3.method1634(var14, field674, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field999 = arg0.method5232();
                if (var3.field999 == 65535) {
                    var3.field999 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field998 = arg0.method5226();
                var3.field1017 = arg0.method5306();
                var3.field1016 = arg0.method5225();
                var3.field1018 = arg0.method5225();
                var3.field1027 = arg0.method5233() + field674;
                var3.field1020 = arg0.method5233() + field674;
                var3.field1028 = arg0.method5195();
                var3.field1006 = 1;
                var3.field974 = 0;
                var3.field998 += var3.field1031[0];
                var3.field1017 += var3.field1029[0];
                var3.field1016 += var3.field1031[0];
                var3.field1018 += var3.field1029[0];
            }
            if ((var4 & 0x2) != 0) {
                var3.field1159 = class267.method2944(arg0.method5195());
                var3.field1015 = var3.field1159.field3513;
                var3.field1026 = var3.field1159.field3505;
                var3.field981 = var3.field1159.field3497;
                var3.field982 = var3.field1159.field3494;
                var3.field983 = var3.field1159.field3499;
                var3.field984 = var3.field1159.field3516;
                var3.field978 = var3.field1159.field3486;
                var3.field979 = var3.field1159.field3495;
                var3.field980 = var3.field1159.field3496;
            }
            if ((var4 & 0x4) != 0) {
                int var19 = arg0.method5195();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = arg0.method5215();
                if (var3.field1005 == var19 && var19 != -1) {
                    int var21 = class269.method536(var19).field3536;
                    if (var21 == 1) {
                        var3.field1009 = 0;
                        var3.field1007 = 0;
                        var3.field1008 = var20;
                        var3.field1010 = 0;
                    }
                    if (var21 == 2) {
                        var3.field1010 = 0;
                    }
                } else if (var19 == -1 || var3.field1005 == -1 || class269.method536(var19).field3538 >= class269.method536(var3.field1005).field3538) {
                    var3.field1005 = var19;
                    var3.field1009 = 0;
                    var3.field1007 = 0;
                    var3.field1008 = var20;
                    var3.field1010 = 0;
                    var3.field974 = var3.field1006;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1021 = arg0.method5202();
                var3.field989 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field972 = arg0.method5231();
                int var22 = arg0.method5254();
                var3.field1004 = var22 >> 16;
                var3.field1014 = (var22 & 0xFFFF) + field674;
                var3.field1011 = 0;
                var3.field988 = 0;
                if (var3.field1014 > field674) {
                    var3.field1011 = -1;
                }
                if (var3.field972 == 65535) {
                    var3.field972 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var23 = arg0.method5232();
                int var24 = arg0.method5231();
                int var25 = var3.field995 - (var23 - Statics.field348 - Statics.field348) * 64;
                int var26 = var3.field1024 - (var24 - Statics.field263 - Statics.field263) * 64;
                if (var25 != 0 || var26 != 0) {
                    var3.field1001 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("ky.hb(Lbf;IIBI)V")
    public static final void method5174(class76 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1031[0];
        int var5 = arg0.field1029[0];
        int var6 = arg0.method1140();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1140();
        field951.field2146 = arg1;
        field951.field2143 = arg2;
        field951.field2144 = 1;
        field951.field2145 = 1;
        class75 var10 = field951;
        int var11 = class183.method1817(var4, var5, var9, var10, field734[arg0.field657], true, field831, field953);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1144(field831[var12], field953[var12], arg3);
            }
        }
    }

    @ObfuscatedName("jk.hj(I)V")
    public static void method4701() {
        field815 = 0;
        field813 = false;
    }

    @ObfuscatedName("aj.hn(I)V")
    public static void method630() {
        method4701();
        field820[0] = class234.field3023;
        field821[0] = "";
        field818[0] = 1006;
        field898[0] = false;
        field815 = 1;
    }

    @ObfuscatedName("lt.hh(I)V")
    public static final void method5572() {
        int var0 = Statics.field1331;
        int var1 = Statics.field798;
        int var2 = Statics.field433;
        int var3 = Statics.field347;
        int var4 = 6116423;
        class331.method5661(var0, var1, var2, var3, var4);
        class331.method5661(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class331.method5665(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field31.method5053(class234.field3057, var0 + 3, var1 + 14, var4, -1);
        int var5 = class64.field504;
        int var6 = class64.field505;
        for (int var7 = 0; var7 < field815; var7++) {
            int var8 = (field815 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class305 var10 = Statics.field31;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field821[var7].length() > 0) {
                var11 = field820[var7] + class234.field2962 + field821[var7];
            } else {
                var11 = field820[var7];
            }
            var10.method5053(var11, var0 + 3, var8, var9, 0);
        }
        method1648(Statics.field1331, Statics.field798, Statics.field433, Statics.field347);
    }

    @ObfuscatedName("ca.hi(IIIII)V")
    public static final void method1648(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field682; var4++) {
            if (field888[var4] + field886[var4] > arg0 && field886[var4] < arg0 + arg2 && field908[var4] + field887[var4] > arg1 && field887[var4] < arg1 + arg3) {
                field884[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hk(I)V")
    public final void method1607() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field815 - 1; var2++) {
                if (field818[var2] < 1000 && field818[var2 + 1] > 1000) {
                    String var3 = field821[var2];
                    field821[var2] = field821[var2 + 1];
                    field821[var2 + 1] = var3;
                    String var4 = field820[var2];
                    field820[var2] = field820[var2 + 1];
                    field820[var2 + 1] = var4;
                    int var5 = field818[var2];
                    field818[var2] = field818[var2 + 1];
                    field818[var2 + 1] = var5;
                    int var6 = field816[var2];
                    field816[var2] = field816[var2 + 1];
                    field816[var2 + 1] = var6;
                    int var7 = field817[var2];
                    field817[var2] = field817[var2 + 1];
                    field817[var2 + 1] = var7;
                    int var8 = field819[var2];
                    field819[var2] = field819[var2 + 1];
                    field819[var2 + 1] = var8;
                    boolean var9 = field898[var2];
                    field898[var2] = field898[var2 + 1];
                    field898[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field2033 != null || field858 != null) {
            return;
        }
        int var10 = class64.field496;
        if (field813) {
            if (var10 != 1 && (Statics.field587 || var10 != 4)) {
                int var11 = class64.field504;
                int var12 = class64.field505;
                if (var11 < Statics.field1331 - 10 || var11 > Statics.field433 + Statics.field1331 + 10 || var12 < Statics.field798 - 10 || var12 > Statics.field798 + Statics.field347 + 10) {
                    field813 = false;
                    int var13 = Statics.field1331;
                    int var14 = Statics.field798;
                    int var15 = Statics.field433;
                    int var16 = Statics.field347;
                    for (int var17 = 0; var17 < field682; var17++) {
                        if (field888[var17] + field886[var17] > var13 && field886[var17] < var13 + var15 && field908[var17] + field887[var17] > var14 && field887[var17] < var14 + var16) {
                            field883[var17] = true;
                        }
                    }
                }
            }
            if (var10 == 1 || !Statics.field587 && var10 == 4) {
                int var18 = Statics.field1331;
                int var19 = Statics.field798;
                int var20 = Statics.field433;
                int var21 = class64.field512;
                int var22 = class64.field513;
                int var23 = -1;
                for (int var24 = 0; var24 < field815; var24++) {
                    int var25 = (field815 - 1 - var24) * 15 + var19 + 31;
                    if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                        var23 = var24;
                    }
                }
                if (var23 != -1) {
                    method3829(var23);
                }
                field813 = false;
                int var26 = Statics.field1331;
                int var27 = Statics.field798;
                int var28 = Statics.field433;
                int var29 = Statics.field347;
                for (int var30 = 0; var30 < field682; var30++) {
                    if (field888[var30] + field886[var30] > var26 && field886[var30] < var26 + var28 && field908[var30] + field887[var30] > var27 && field887[var30] < var27 + var29) {
                        field883[var30] = true;
                    }
                }
            }
            return;
        }
        int var31 = method175();
        if ((var10 == 1 || !Statics.field587 && var10 == 4) && var31 >= 0) {
            int var32 = field818[var31];
            if (var32 == 39 || var32 == 40 || var32 == 41 || var32 == 42 || var32 == 43 || var32 == 33 || var32 == 34 || var32 == 35 || var32 == 36 || var32 == 37 || var32 == 38 || var32 == 1005) {
                label244: {
                    int var33 = field816[var31];
                    int var34 = field817[var31];
                    class227 var35 = class227.method2021(var34);
                    int var36 = method262(var35);
                    boolean var37 = (var36 >> 28 & 0x1) != 0;
                    if (!var37) {
                        class228 var10000 = (class228) null;
                        if (!class228.method3826(method262(var35))) {
                            break label244;
                        }
                    }
                    if (Statics.field2033 != null && !field789 && field815 > 0 && !this.method1505()) {
                        method2025(field686, field784);
                    }
                    field789 = false;
                    field790 = 0;
                    if (Statics.field2033 != null) {
                        method710(Statics.field2033);
                    }
                    Statics.field2033 = class227.method2021(var34);
                    field785 = var33;
                    field686 = class64.field512;
                    field784 = class64.field513;
                    if (var31 >= 0) {
                        method1814(var31);
                    }
                    method710(Statics.field2033);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field587 && var10 == 4) && this.method1505()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field587 && var10 == 4) && field815 > 0) {
            method3829(var31);
        }
        if (var10 == 2 && field815 > 0) {
            this.method1213(class64.field512, class64.field513);
        }
    }

    @ObfuscatedName("client.hp(I)Z")
    public final boolean method1505() {
        int var1 = method175();
        boolean var2 = field812 == 1 && field815 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field818[var1];
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
        return var2 && !field898[var1];
    }

    @ObfuscatedName("client.ht(III)V")
    public final void method1213(int arg0, int arg1) {
        method419(arg0, arg1);
        Statics.field596.method2982(Statics.field2544, arg0, arg1, false);
        field813 = true;
    }

    @ObfuscatedName("at.hz(III)V")
    public static void method419(int arg0, int arg1) {
        int var2 = Statics.field31.method5127(class234.field3057);
        for (int var3 = 0; var3 < field815; var3++) {
            class305 var4 = Statics.field31;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field821[var3].length() > 0) {
                var5 = field820[var3] + class234.field2962 + field821[var3];
            } else {
                var5 = field820[var3];
            }
            int var6 = var4.method5127(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field815 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1642) {
            var8 = Statics.field1642 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field475) {
            var9 = Statics.field475 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1331 = var8;
        Statics.field798 = var9;
        Statics.field433 = var2;
        Statics.field347 = field815 * 15 + 22;
    }

    @ObfuscatedName("hq.hv(II)V")
    public static final void method3829(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field816[arg0];
        int var2 = field817[arg0];
        int var3 = field818[arg0];
        int var4 = field819[arg0];
        String var5 = field820[arg0];
        String var6 = field821[arg0];
        method1052(var1, var2, var3, var4, var5, var6, class64.field512, class64.field513);
    }

    @ObfuscatedName("s.hg(Lcf;III)V")
    public static final void method22(class92 arg0, int arg1, int arg2) {
        method1052(arg0.field1181, arg0.field1180, arg0.field1179, arg0.field1182, arg0.field1183, arg0.field1183, arg1, arg2);
    }

    @ObfuscatedName("bm.ha(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 34) {
            class197 var8 = class197.method1625(class193.field2305, field723.field1341);
            var8.field2377.method5238(arg1);
            var8.field2377.method5229(arg0);
            var8.field2377.method5230(arg3);
            field723.method2159(var8);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 22) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var9 = class197.method1625(class193.field2288, field723.field1341);
            var9.field2377.method5229(arg3);
            var9.field2377.method5177(class55.field416[82] ? 1 : 0);
            var9.field2377.method5241(Statics.field263 + arg1);
            var9.field2377.method5241(Statics.field348 + arg0);
            field723.method2159(var9);
        }
        if (arg2 == 39) {
            class197 var10 = class197.method1625(class193.field2278, field723.field1341);
            var10.field2377.method5295(arg1);
            var10.field2377.method5230(arg0);
            var10.field2377.method5230(arg3);
            field723.method2159(var10);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 31) {
            class197 var11 = class197.method1625(class193.field2255, field723.field1341);
            var11.field2377.method5230(arg3);
            var11.field2377.method5245(Statics.field1354);
            var11.field2377.method5241(arg0);
            var11.field2377.method5241(Statics.field1307);
            var11.field2377.method5245(arg1);
            var11.field2377.method5178(Statics.field105);
            field723.method2159(var11);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 26) {
            method1069();
        }
        if (arg2 == 2) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var12 = class197.method1625(class193.field2304, field723.field1341);
            var12.field2377.method5419(class55.field416[82] ? 1 : 0);
            var12.field2377.method5230(Statics.field263 + arg1);
            var12.field2377.method5229(Statics.field348 + arg0);
            var12.field2377.method5230(arg3);
            var12.field2377.method5239(Statics.field2793);
            var12.field2377.method5178(field834);
            field723.method2159(var12);
        }
        if (arg2 == 20) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var13 = class197.method1625(class193.field2249, field723.field1341);
            var13.field2377.method5230(arg3);
            var13.field2377.method5230(Statics.field263 + arg1);
            var13.field2377.method5177(class55.field416[82] ? 1 : 0);
            var13.field2377.method5241(Statics.field348 + arg0);
            field723.method2159(var13);
        }
        if (arg2 == 49) {
            class76 var14 = field861[arg3];
            if (var14 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var15 = class197.method1625(class193.field2275, field723.field1341);
                var15.field2377.method5241(arg3);
                var15.field2377.method5419(class55.field416[82] ? 1 : 0);
                field723.method2159(var15);
            }
        }
        if (arg2 == 1005) {
            class227 var16 = class227.method2021(arg1);
            if (var16 == null || var16.field2731[arg0] < 100000) {
                class197 var17 = class197.method1625(class193.field2327, field723.field1341);
                var17.field2377.method5230(arg3);
                field723.method2159(var17);
            } else {
                class101.method317(27, "", var16.field2731[arg0] + " x " + class265.method136(arg3).field3434);
            }
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 9) {
            class89 var18 = field718[arg3];
            if (var18 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var19 = class197.method1625(class193.field2280, field723.field1341);
                var19.field2377.method5221(class55.field416[82] ? 1 : 0);
                var19.field2377.method5229(arg3);
                field723.method2159(var19);
            }
        }
        if (arg2 == 4) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var20 = class197.method1625(class193.field2282, field723.field1341);
            var20.field2377.method5419(class55.field416[82] ? 1 : 0);
            var20.field2377.method5230(arg3);
            var20.field2377.method5230(Statics.field348 + arg0);
            var20.field2377.method5241(Statics.field263 + arg1);
            field723.method2159(var20);
        }
        if (arg2 == 51) {
            class76 var21 = field861[arg3];
            if (var21 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var22 = class197.method1625(class193.field2322, field723.field1341);
                var22.field2377.method5220(class55.field416[82] ? 1 : 0);
                var22.field2377.method5178(arg3);
                field723.method2159(var22);
            }
        }
        if (arg2 == 12) {
            class89 var23 = field718[arg3];
            if (var23 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var24 = class197.method1625(class193.field2273, field723.field1341);
                var24.field2377.method5241(arg3);
                var24.field2377.method5220(class55.field416[82] ? 1 : 0);
                field723.method2159(var24);
            }
        }
        if (arg2 == 37) {
            class197 var25 = class197.method1625(class193.field2332, field723.field1341);
            var25.field2377.method5229(arg3);
            var25.field2377.method5178(arg0);
            var25.field2377.method5245(arg1);
            field723.method2159(var25);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 28) {
            class197 var26 = class197.method1625(class193.field2335, field723.field1341);
            var26.field2377.method5295(arg1);
            field723.method2159(var26);
            class227 var27 = class227.method2021(arg1);
            if (var27.field2724 != null && var27.field2724[0][0] == 5) {
                int var28 = var27.field2724[0][1];
                class222.field2558[var28] = 1 - class222.field2558[var28];
                method3303(var28);
            }
        }
        if (arg2 == 1003) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            class89 var29 = field718[arg3];
            if (var29 != null) {
                class267 var30 = var29.field1159;
                if (var30.field3515 != null) {
                    var30 = var30.method4451();
                }
                if (var30 != null) {
                    class197 var31 = class197.method1625(class193.field2312, field723.field1341);
                    var31.field2377.method5230(var30.field3489);
                    field723.method2159(var31);
                }
            }
        }
        if (arg2 == 35) {
            class197 var32 = class197.method1625(class193.field2306, field723.field1341);
            var32.field2377.method5230(arg3);
            var32.field2377.method5245(arg1);
            var32.field2377.method5229(arg0);
            field723.method2159(var32);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 23) {
            if (field813) {
                Statics.field596.method2984();
            } else {
                Statics.field596.method2982(Statics.field2544, arg0, arg1, true);
            }
        }
        if (arg2 == 50) {
            class76 var33 = field861[arg3];
            if (var33 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var34 = class197.method1625(class193.field2344, field723.field1341);
                var34.field2377.method5419(class55.field416[82] ? 1 : 0);
                var34.field2377.method5230(arg3);
                field723.method2159(var34);
            }
        }
        if (arg2 == 46) {
            class76 var35 = field861[arg3];
            if (var35 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var36 = class197.method1625(class193.field2334, field723.field1341);
                var36.field2377.method5230(arg3);
                var36.field2377.method5221(class55.field416[82] ? 1 : 0);
                field723.method2159(var36);
            }
        }
        if (arg2 == 43) {
            class197 var37 = class197.method1625(class193.field2315, field723.field1341);
            var37.field2377.method5229(arg0);
            var37.field2377.method5230(arg3);
            var37.field2377.method5239(arg1);
            field723.method2159(var37);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 7) {
            class89 var38 = field718[arg3];
            if (var38 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var39 = class197.method1625(class193.field2286, field723.field1341);
                var39.field2377.method5178(arg3);
                var39.field2377.method5419(class55.field416[82] ? 1 : 0);
                var39.field2377.method5295(Statics.field1354);
                var39.field2377.method5178(Statics.field105);
                var39.field2377.method5178(Statics.field1307);
                field723.method2159(var39);
            }
        }
        if (arg2 == 58) {
            class227 var40 = class227.method1055(arg1, arg0);
            if (var40 != null) {
                class197 var41 = class197.method1625(class193.field2276, field723.field1341);
                var41.field2377.method5238(Statics.field2793);
                var41.field2377.method5241(field834);
                var41.field2377.method5230(var40.field2732);
                var41.field2377.method5245(arg1);
                var41.field2377.method5241(field835);
                var41.field2377.method5229(arg0);
                field723.method2159(var41);
            }
        }
        if (arg2 == 25) {
            class227 var42 = class227.method1055(arg1, arg0);
            if (var42 != null) {
                method209();
                method4780(arg1, arg0, class228.method142(method262(var42)), var42.field2732);
                field701 = 0;
                field836 = method3713(var42);
                if (field836 == null) {
                    field836 = class234.field2806;
                }
                if (var42.field2717) {
                    field837 = var42.field2685 + class91.method631(16777215);
                } else {
                    field837 = class91.method631(65280) + var42.field2711 + class91.method631(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            class197 var43 = class197.method1625(class193.field2327, field723.field1341);
            var43.field2377.method5230(arg3);
            field723.method2159(var43);
        }
        if (arg2 == 17) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var44 = class197.method1625(class193.field2326, field723.field1341);
            var44.field2377.method5245(Statics.field2793);
            var44.field2377.method5229(Statics.field263 + arg1);
            var44.field2377.method5241(field834);
            var44.field2377.method5419(class55.field416[82] ? 1 : 0);
            var44.field2377.method5178(arg3);
            var44.field2377.method5229(Statics.field348 + arg0);
            field723.method2159(var44);
        }
        if (arg2 == 30 && field844 == null) {
            method5506(arg1, arg0);
            field844 = class227.method1055(arg1, arg0);
            method710(field844);
        }
        if (arg2 == 40) {
            class197 var45 = class197.method1625(class193.field2314, field723.field1341);
            var45.field2377.method5229(arg0);
            var45.field2377.method5229(arg3);
            var45.field2377.method5239(arg1);
            field723.method2159(var45);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 42) {
            class197 var46 = class197.method1625(class193.field2338, field723.field1341);
            var46.field2377.method5241(arg3);
            var46.field2377.method5178(arg0);
            var46.field2377.method5238(arg1);
            field723.method2159(var46);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 41) {
            class197 var47 = class197.method1625(class193.field2341, field723.field1341);
            var47.field2377.method5245(arg1);
            var47.field2377.method5178(arg3);
            var47.field2377.method5178(arg0);
            field723.method2159(var47);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 3) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var48 = class197.method1625(class193.field2329, field723.field1341);
            var48.field2377.method5178(Statics.field263 + arg1);
            var48.field2377.method5419(class55.field416[82] ? 1 : 0);
            var48.field2377.method5241(Statics.field348 + arg0);
            var48.field2377.method5229(arg3);
            field723.method2159(var48);
        }
        if (arg2 == 24) {
            class227 var49 = class227.method2021(arg1);
            boolean var50 = true;
            if (var49.field2671 > 0) {
                var50 = method43(var49);
            }
            if (var50) {
                class197 var51 = class197.method1625(class193.field2335, field723.field1341);
                var51.field2377.method5295(arg1);
                field723.method2159(var51);
            }
        }
        if (arg2 == 1) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var52 = class197.method1625(class193.field2293, field723.field1341);
            var52.field2377.method5178(arg3);
            var52.field2377.method5241(Statics.field105);
            var52.field2377.method5221(class55.field416[82] ? 1 : 0);
            var52.field2377.method5178(Statics.field263 + arg1);
            var52.field2377.method5239(Statics.field1354);
            var52.field2377.method5241(Statics.field348 + arg0);
            var52.field2377.method5241(Statics.field1307);
            field723.method2159(var52);
        }
        if (arg2 == 15) {
            class76 var53 = field861[arg3];
            if (var53 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var54 = class197.method1625(class193.field2302, field723.field1341);
                var54.field2377.method5239(Statics.field2793);
                var54.field2377.method5220(class55.field416[82] ? 1 : 0);
                var54.field2377.method5230(arg3);
                var54.field2377.method5230(field834);
                field723.method2159(var54);
            }
        }
        if (arg2 == 13) {
            class89 var55 = field718[arg3];
            if (var55 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var56 = class197.method1625(class193.field2348, field723.field1341);
                var56.field2377.method5241(arg3);
                var56.field2377.method5177(class55.field416[82] ? 1 : 0);
                field723.method2159(var56);
            }
        }
        if (arg2 == 11) {
            class89 var57 = field718[arg3];
            if (var57 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var58 = class197.method1625(class193.field2271, field723.field1341);
                var58.field2377.method5221(class55.field416[82] ? 1 : 0);
                var58.field2377.method5230(arg3);
                field723.method2159(var58);
            }
        }
        if (arg2 == 5) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var59 = class197.method1625(class193.field2324, field723.field1341);
            var59.field2377.method5241(Statics.field263 + arg1);
            var59.field2377.method5220(class55.field416[82] ? 1 : 0);
            var59.field2377.method5229(arg3);
            var59.field2377.method5229(Statics.field348 + arg0);
            field723.method2159(var59);
        }
        if (arg2 == 14) {
            class76 var60 = field861[arg3];
            if (var60 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var61 = class197.method1625(class193.field2303, field723.field1341);
                var61.field2377.method5229(Statics.field105);
                var61.field2377.method5178(Statics.field1307);
                var61.field2377.method5230(arg3);
                var61.field2377.method5419(class55.field416[82] ? 1 : 0);
                var61.field2377.method5295(Statics.field1354);
                field723.method2159(var61);
            }
        }
        if (arg2 == 8) {
            class89 var62 = field718[arg3];
            if (var62 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var63 = class197.method1625(class193.field2295, field723.field1341);
                var63.field2377.method5245(Statics.field2793);
                var63.field2377.method5178(arg3);
                var63.field2377.method5229(field834);
                var63.field2377.method5220(class55.field416[82] ? 1 : 0);
                field723.method2159(var63);
            }
        }
        if (arg2 == 45) {
            class76 var64 = field861[arg3];
            if (var64 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var65 = class197.method1625(class193.field2266, field723.field1341);
                var65.field2377.method5177(class55.field416[82] ? 1 : 0);
                var65.field2377.method5241(arg3);
                field723.method2159(var65);
            }
        }
        if (arg2 == 38) {
            method209();
            class227 var66 = class227.method2021(arg1);
            field701 = 1;
            Statics.field105 = arg0;
            Statics.field1354 = arg1;
            Statics.field1307 = arg3;
            method710(var66);
            field832 = class91.method631(16748608) + class265.method136(arg3).field3434 + class91.method631(16777215);
            if (field832 == null) {
                field832 = class234.field2806;
            }
            return;
        }
        if (arg2 == 29) {
            class197 var67 = class197.method1625(class193.field2335, field723.field1341);
            var67.field2377.method5295(arg1);
            field723.method2159(var67);
            class227 var68 = class227.method2021(arg1);
            if (var68.field2724 != null && var68.field2724[0][0] == 5) {
                int var69 = var68.field2724[0][1];
                if (class222.field2558[var69] != var68.field2726[0]) {
                    class222.field2558[var69] = var68.field2726[0];
                    method3303(var69);
                }
            }
        }
        if (arg2 == 16) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var70 = class197.method1625(class193.field2349, field723.field1341);
            var70.field2377.method5178(Statics.field263 + arg1);
            var70.field2377.method5419(class55.field416[82] ? 1 : 0);
            var70.field2377.method5229(Statics.field1307);
            var70.field2377.method5178(arg3);
            var70.field2377.method5230(Statics.field105);
            var70.field2377.method5295(Statics.field1354);
            var70.field2377.method5178(Statics.field348 + arg0);
            field723.method2159(var70);
        }
        if (arg2 == 33) {
            class197 var71 = class197.method1625(class193.field2262, field723.field1341);
            var71.field2377.method5241(arg0);
            var71.field2377.method5229(arg3);
            var71.field2377.method5245(arg1);
            field723.method2159(var71);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 1001) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var72 = class197.method1625(class193.field2261, field723.field1341);
            var72.field2377.method5230(Statics.field263 + arg1);
            var72.field2377.method5230(Statics.field348 + arg0);
            var72.field2377.method5177(class55.field416[82] ? 1 : 0);
            var72.field2377.method5241(arg3);
            field723.method2159(var72);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var73 = class227.method1055(arg1, arg0);
            if (var73 != null) {
                method3225(arg3, arg1, arg0, var73.field2732, arg5);
            }
        }
        if (arg2 == 21) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var74 = class197.method1625(class193.field2311, field723.field1341);
            var74.field2377.method5220(class55.field416[82] ? 1 : 0);
            var74.field2377.method5230(arg3);
            var74.field2377.method5230(Statics.field263 + arg1);
            var74.field2377.method5229(Statics.field348 + arg0);
            field723.method2159(var74);
        }
        if (arg2 == 19) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var75 = class197.method1625(class193.field2347, field723.field1341);
            var75.field2377.method5178(arg3);
            var75.field2377.method5230(Statics.field348 + arg0);
            var75.field2377.method5230(Statics.field263 + arg1);
            var75.field2377.method5419(class55.field416[82] ? 1 : 0);
            field723.method2159(var75);
        }
        if (arg2 == 18) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var76 = class197.method1625(class193.field2253, field723.field1341);
            var76.field2377.method5419(class55.field416[82] ? 1 : 0);
            var76.field2377.method5229(arg3);
            var76.field2377.method5241(Statics.field263 + arg1);
            var76.field2377.method5230(Statics.field348 + arg0);
            field723.method2159(var76);
        }
        if (arg2 == 32) {
            class197 var77 = class197.method1625(class193.field2336, field723.field1341);
            var77.field2377.method5229(arg3);
            var77.field2377.method5245(Statics.field2793);
            var77.field2377.method5229(field834);
            var77.field2377.method5295(arg1);
            var77.field2377.method5178(arg0);
            field723.method2159(var77);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 48) {
            class76 var78 = field861[arg3];
            if (var78 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var79 = class197.method1625(class193.field2298, field723.field1341);
                var79.field2377.method5221(class55.field416[82] ? 1 : 0);
                var79.field2377.method5241(arg3);
                field723.method2159(var79);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field626.method6018(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 44) {
            class76 var80 = field861[arg3];
            if (var80 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var81 = class197.method1625(class193.field2321, field723.field1341);
                var81.field2377.method5241(arg3);
                var81.field2377.method5220(class55.field416[82] ? 1 : 0);
                field723.method2159(var81);
            }
        }
        if (arg2 == 10) {
            class89 var82 = field718[arg3];
            if (var82 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var83 = class197.method1625(class193.field2281, field723.field1341);
                var83.field2377.method5178(arg3);
                var83.field2377.method5221(class55.field416[82] ? 1 : 0);
                field723.method2159(var83);
            }
        }
        if (arg2 == 1002) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            class197 var84 = class197.method1625(class193.field2294, field723.field1341);
            var84.field2377.method5229(arg3);
            field723.method2159(var84);
        }
        if (arg2 == 6) {
            field778 = arg6;
            field922 = arg7;
            field683 = 2;
            field780 = 0;
            field739 = arg0;
            field909 = arg1;
            class197 var85 = class197.method1625(class193.field2283, field723.field1341);
            var85.field2377.method5230(Statics.field263 + arg1);
            var85.field2377.method5241(arg3);
            var85.field2377.method5229(Statics.field348 + arg0);
            var85.field2377.method5220(class55.field416[82] ? 1 : 0);
            field723.method2159(var85);
        }
        if (arg2 == 36) {
            class197 var86 = class197.method1625(class193.field2264, field723.field1341);
            var86.field2377.method5178(arg0);
            var86.field2377.method5178(arg3);
            var86.field2377.method5239(arg1);
            field723.method2159(var86);
            field783 = 0;
            Statics.field80 = class227.method2021(arg1);
            field945 = arg0;
        }
        if (arg2 == 47) {
            class76 var87 = field861[arg3];
            if (var87 != null) {
                field778 = arg6;
                field922 = arg7;
                field683 = 2;
                field780 = 0;
                field739 = arg0;
                field909 = arg1;
                class197 var88 = class197.method1625(class193.field2247, field723.field1341);
                var88.field2377.method5229(arg3);
                var88.field2377.method5419(class55.field416[82] ? 1 : 0);
                field723.method2159(var88);
            }
        }
        if (field701 != 0) {
            field701 = 0;
            method710(class227.method2021(Statics.field1354));
        }
        if (field833) {
            method209();
        }
        if (Statics.field80 != null && field783 == 0) {
            method710(Statics.field80);
        }
    }

    @ObfuscatedName("iw.hc(ILjava/lang/String;I)V")
    public static void method4005(int arg0, String arg1) {
        int var2 = class99.field1279;
        int[] var3 = class99.field1282;
        boolean var4 = false;
        class293 var5 = new class293(arg1, Statics.field356);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field861[var3[var6]];
            if (var7 != null && Statics.field141 != var7 && var7.field649 != null && var7.field649.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method1625(class193.field2321, field723.field1341);
                    var8.field2377.method5241(var3[var6]);
                    var8.field2377.method5220(0);
                    field723.method2159(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method1625(class193.field2247, field723.field1341);
                    var9.field2377.method5229(var3[var6]);
                    var9.field2377.method5419(0);
                    field723.method2159(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method1625(class193.field2275, field723.field1341);
                    var10.field2377.method5241(var3[var6]);
                    var10.field2377.method5419(0);
                    field723.method2159(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method1625(class193.field2344, field723.field1341);
                    var11.field2377.method5419(0);
                    var11.field2377.method5230(var3[var6]);
                    field723.method2159(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class101.method317(4, "", class234.field3051 + arg1);
        }
    }

    @ObfuscatedName("jc.hu(IIIII)V")
    public static void method4780(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method1055(arg0, arg1);
        if (var4 != null && var4.field2744 != null) {
            class72 var5 = new class72();
            var5.field586 = var4;
            var5.field601 = var4.field2744;
            class86.method2141(var5);
        }
        field835 = arg3;
        field833 = true;
        Statics.field2793 = arg0;
        field834 = arg1;
        Statics.field2015 = arg2;
        method710(var4);
    }

    @ObfuscatedName("p.hq(S)V")
    public static void method209() {
        if (!field833) {
            return;
        }
        class227 var0 = class227.method1055(Statics.field2793, field834);
        if (var0 != null && var0.field2704 != null) {
            class72 var1 = new class72();
            var1.field586 = var0;
            var1.field601 = var0.field2704;
            class86.method2141(var1);
        }
        field833 = false;
        method710(var0);
    }

    @ObfuscatedName("ln.hs(III)V")
    public static void method5506(int arg0, int arg1) {
        class197 var2 = class197.method1625(class193.field2277, field723.field1341);
        var2.field2377.method5230(arg1);
        var2.field2377.method5239(arg0);
        field723.method2159(var2);
    }

    @ObfuscatedName("fz.hr(IIIILjava/lang/String;I)V")
    public static void method3225(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method1055(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2712 != null) {
            class72 var6 = new class72();
            var6.field586 = var5;
            var6.field589 = arg0;
            var6.field593 = arg4;
            var6.field601 = var5.field2712;
            class86.method2141(var6);
        }
        boolean var7 = true;
        if (var5.field2671 > 0) {
            var7 = method43(var5);
        }
        if (!var7 || !class228.method3866(method262(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class197 var8 = class197.method1625(class193.field2254, field723.field1341);
            var8.field2377.method5295(arg1);
            var8.field2377.method5178(arg2);
            var8.field2377.method5178(arg3);
            field723.method2159(var8);
        }
        if (arg0 == 2) {
            class197 var9 = class197.method1625(class193.field2279, field723.field1341);
            var9.field2377.method5295(arg1);
            var9.field2377.method5178(arg2);
            var9.field2377.method5178(arg3);
            field723.method2159(var9);
        }
        if (arg0 == 3) {
            class197 var10 = class197.method1625(class193.field2269, field723.field1341);
            var10.field2377.method5295(arg1);
            var10.field2377.method5178(arg2);
            var10.field2377.method5178(arg3);
            field723.method2159(var10);
        }
        if (arg0 == 4) {
            class197 var11 = class197.method1625(class193.field2256, field723.field1341);
            var11.field2377.method5295(arg1);
            var11.field2377.method5178(arg2);
            var11.field2377.method5178(arg3);
            field723.method2159(var11);
        }
        if (arg0 == 5) {
            class197 var12 = class197.method1625(class193.field2292, field723.field1341);
            var12.field2377.method5295(arg1);
            var12.field2377.method5178(arg2);
            var12.field2377.method5178(arg3);
            field723.method2159(var12);
        }
        if (arg0 == 6) {
            class197 var13 = class197.method1625(class193.field2331, field723.field1341);
            var13.field2377.method5295(arg1);
            var13.field2377.method5178(arg2);
            var13.field2377.method5178(arg3);
            field723.method2159(var13);
        }
        if (arg0 == 7) {
            class197 var14 = class197.method1625(class193.field2248, field723.field1341);
            var14.field2377.method5295(arg1);
            var14.field2377.method5178(arg2);
            var14.field2377.method5178(arg3);
            field723.method2159(var14);
        }
        if (arg0 == 8) {
            class197 var15 = class197.method1625(class193.field2287, field723.field1341);
            var15.field2377.method5295(arg1);
            var15.field2377.method5178(arg2);
            var15.field2377.method5178(arg3);
            field723.method2159(var15);
        }
        if (arg0 == 9) {
            class197 var16 = class197.method1625(class193.field2260, field723.field1341);
            var16.field2377.method5295(arg1);
            var16.field2377.method5178(arg2);
            var16.field2377.method5178(arg3);
            field723.method2159(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var17 = class197.method1625(class193.field2301, field723.field1341);
        var17.field2377.method5295(arg1);
        var17.field2377.method5178(arg2);
        var17.field2377.method5178(arg3);
        field723.method2159(var17);
    }

    @ObfuscatedName("jj.hl(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4259(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        Statics.method1010(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("v.hm(B)I")
    public static final int method175() {
        return field815 - 1;
    }

    @ObfuscatedName("s.hw(I)V")
    public static void method16() {
        for (int var0 = 0; var0 < field815; var0++) {
            if (method1736(field818[var0])) {
                if (var0 < field815 - 1) {
                    for (int var1 = var0; var1 < field815 - 1; var1++) {
                        field820[var1] = field820[var1 + 1];
                        field821[var1] = field821[var1 + 1];
                        field818[var1] = field818[var1 + 1];
                        field819[var1] = field819[var1 + 1];
                        field816[var1] = field816[var1 + 1];
                        field817[var1] = field817[var1 + 1];
                        field898[var1] = field898[var1 + 1];
                    }
                }
                var0--;
                field815--;
            }
        }
        Statics.method130();
    }

    @ObfuscatedName("cv.hy(II)Z")
    public static boolean method1736(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bv.ia(II)Ljava/lang/String;")
    public static String method1129(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field821[arg0].length() > 0) {
            return field820[arg0] + class234.field2962 + field821[arg0];
        } else {
            return field820[arg0];
        }
    }

    @ObfuscatedName("fn.iz(IIIII)V")
    public static final void method3288(int arg0, int arg1, int arg2, int arg3) {
        if (field701 == 0 && !field833) {
            method4259(class234.field2805, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class138.field1767;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class138.method2023(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class76 var14 = field861[field804];
                    method4081(var14, field804, var11, var12);
                }
                return;
            }
            long var15 = class138.field1768[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class138.method325(var8);
                    long var20 = class138.field1768[var8];
                    int var22 = (int) (var20 >>> 7 & 0x7FL);
                    int var24 = var22;
                    long var25 = class138.field1768[var8];
                    int var27 = (int) (var25 >>> 14 & 0x3L);
                    int var30 = class138.method3147(var8);
                    if (var27 == 2 && Statics.field596.method3087(Statics.field2544, var19, var22, var15) >= 0) {
                        class264 var31 = class264.method3595(var30);
                        if (var31.field3413 != null) {
                            var31 = var31.method4325();
                        }
                        if (var31 == null) {
                            break label277;
                        }
                        if (field701 == 1) {
                            method4259(class234.field2909, field832 + " " + class91.field1173 + " " + class91.method631(65535) + var31.field3382, 1, var30, var19, var22);
                        } else if (!field833) {
                            String[] var32 = var31.field3399;
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
                                        method4259(var32[var33], class91.method631(65535) + var31.field3382, var34, var30, var19, var24);
                                    }
                                }
                            }
                            method4259(class234.field2953, class91.method631(65535) + var31.field3382, 1002, var31.field3415, var19, var24);
                        } else if ((Statics.field2015 & 0x4) == 4) {
                            method4259(field836, field837 + " " + class91.field1173 + " " + class91.method631(65535) + var31.field3382, 2, var30, var19, var22);
                        }
                    }
                    if (var27 == 1) {
                        class89 var35 = field718[var30];
                        if (var35 == null) {
                            break label277;
                        }
                        if (var35.field1159.field3513 == 1 && (var35.field995 & 0x7F) == 64 && (var35.field1024 & 0x7F) == 64) {
                            for (int var36 = 0; var36 < field719; var36++) {
                                class89 var37 = field718[field720[var36]];
                                if (var37 != null && var35 != var37 && var37.field1159.field3513 == 1 && var35.field995 == var37.field995 && var35.field1024 == var37.field1024) {
                                    method118(var37.field1159, field720[var36], var19, var24);
                                }
                            }
                            int var38 = class99.field1279;
                            int[] var39 = class99.field1282;
                            for (int var40 = 0; var40 < var38; var40++) {
                                class76 var41 = field861[var39[var40]];
                                if (var41 != null && var35.field995 == var41.field995 && var35.field1024 == var41.field1024) {
                                    method4081(var41, var39[var40], var19, var24);
                                }
                            }
                        }
                        method118(var35.field1159, var30, var19, var24);
                    }
                    if (var27 == 0) {
                        class76 var42 = field861[var30];
                        if (var42 == null) {
                            break label277;
                        }
                        if ((var42.field995 & 0x7F) == 64 && (var42.field1024 & 0x7F) == 64) {
                            for (int var43 = 0; var43 < field719; var43++) {
                                class89 var44 = field718[field720[var43]];
                                if (var44 != null && var44.field1159.field3513 == 1 && var42.field995 == var44.field995 && var42.field1024 == var44.field1024) {
                                    method118(var44.field1159, field720[var43], var19, var24);
                                }
                            }
                            int var45 = class99.field1279;
                            int[] var46 = class99.field1282;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class76 var48 = field861[var46[var47]];
                                if (var48 != null && var42 != var48 && var42.field995 == var48.field995 && var42.field1024 == var48.field1024) {
                                    method4081(var48, var46[var47], var19, var24);
                                }
                            }
                        }
                        if (field804 == var30) {
                            var4 = var15;
                        } else {
                            method4081(var42, var30, var19, var24);
                        }
                    }
                    if (var27 == 3) {
                        class272 var49 = field805[Statics.field2544][var19][var24];
                        if (var49 != null) {
                            for (class97 var50 = (class97) var49.method4622(); var50 != null; var50 = (class97) var49.method4615()) {
                                class265 var51 = class265.method136(var50.field1268);
                                if (field701 == 1) {
                                    method4259(class234.field2909, field832 + " " + class91.field1173 + " " + class91.method631(16748608) + var51.field3434, 16, var50.field1268, var19, var24);
                                } else if (!field833) {
                                    String[] var52 = var51.field3454;
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
                                            method4259(var52[var53], class91.method631(16748608) + var51.field3434, var54, var50.field1268, var19, var24);
                                        } else if (var53 == 2) {
                                            method4259(class234.field2927, class91.method631(16748608) + var51.field3434, 20, var50.field1268, var19, var24);
                                        }
                                    }
                                    method4259(class234.field2953, class91.method631(16748608) + var51.field3434, 1004, var50.field1268, var19, var24);
                                } else if ((Statics.field2015 & 0x1) == 1) {
                                    method4259(field836, field837 + " " + class91.field1173 + " " + class91.method631(16748608) + var51.field3434, 17, var50.field1268, var19, var24);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("c.im(Ljx;IIII)V")
    public static final void method118(class267 arg0, int arg1, int arg2, int arg3) {
        if (field815 >= 400) {
            return;
        }
        if (arg0.field3515 != null) {
            arg0 = arg0.method4451();
        }
        if (arg0 == null || !arg0.field3518 || arg0.field3520 && field848 != arg1) {
            return;
        }
        String var4 = arg0.field3490;
        if (arg0.field3507 != 0) {
            int var6 = arg0.field3507;
            int var7 = Statics.field141.field653;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class91.method631(16711680);
            } else if (var8 < -6) {
                var9 = class91.method631(16723968);
            } else if (var8 < -3) {
                var9 = class91.method631(16740352);
            } else if (var8 < 0) {
                var9 = class91.method631(16756736);
            } else if (var8 > 9) {
                var9 = class91.method631(65280);
            } else if (var8 > 6) {
                var9 = class91.method631(4259584);
            } else if (var8 > 3) {
                var9 = class91.method631(8453888);
            } else if (var8 > 0) {
                var9 = class91.method631(12648192);
            } else {
                var9 = class91.method631(16776960);
            }
            var4 = var4 + var9 + " " + class91.field1178 + class234.field2965 + arg0.field3507 + class91.field1172;
        }
        if (arg0.field3520 && field732) {
            method4259(class234.field2953, class91.method631(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field701 == 1) {
            method4259(class234.field2909, field832 + " " + class91.field1173 + " " + class91.method631(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field833) {
            int var10 = arg0.field3520 && field732 ? 2000 : 0;
            String[] var11 = arg0.field3506;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class234.field3019)) {
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
                        method4259(var11[var12], class91.method631(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class234.field3019)) {
                        short var15 = 0;
                        if (field822 != class94.field1195) {
                            if (field822 == class94.field1192 || field822 == class94.field1196 && arg0.field3507 > Statics.field141.field653) {
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
                            method4259(var11[var14], class91.method631(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3520 || !field732) {
                method4259(class234.field2953, class91.method631(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2015 & 0x2) == 2) {
            method4259(field836, field837 + " " + class91.field1173 + " " + class91.method631(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ik.if(Lbf;IIII)V")
    public static final void method4081(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field141 == arg0 || field815 >= 400) {
            return;
        }
        String var9;
        if (arg0.field654 == 0) {
            String var4 = arg0.field640[0] + arg0.field649 + arg0.field640[1];
            int var5 = arg0.field653;
            int var6 = Statics.field141.field653;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class91.method631(16711680);
            } else if (var7 < -6) {
                var8 = class91.method631(16723968);
            } else if (var7 < -3) {
                var8 = class91.method631(16740352);
            } else if (var7 < 0) {
                var8 = class91.method631(16756736);
            } else if (var7 > 9) {
                var8 = class91.method631(65280);
            } else if (var7 > 6) {
                var8 = class91.method631(4259584);
            } else if (var7 > 3) {
                var8 = class91.method631(8453888);
            } else if (var7 > 0) {
                var8 = class91.method631(12648192);
            } else {
                var8 = class91.method631(16776960);
            }
            var9 = var4 + var8 + " " + class91.field1178 + class234.field2965 + arg0.field653 + class91.field1172 + arg0.field640[2];
        } else {
            var9 = arg0.field640[0] + arg0.field649 + arg0.field640[1] + " " + class91.field1178 + class234.field2804 + arg0.field654 + class91.field1172 + arg0.field640[2];
        }
        if (field701 == 1) {
            method4259(class234.field2909, field832 + " " + class91.field1173 + " " + class91.method631(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field833) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field801[var10] != null) {
                    short var11 = 0;
                    if (field801[var10].equalsIgnoreCase(class234.field3019)) {
                        if (field949 == class94.field1195) {
                            continue;
                        }
                        if (field949 == class94.field1192 || field949 == class94.field1196 && arg0.field653 > Statics.field141.field653) {
                            var11 = 2000;
                        }
                        if (Statics.field141.field655 != 0 && arg0.field655 != 0) {
                            if (Statics.field141.field655 == arg0.field655) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field802[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field761[var10] + var11;
                    method4259(field801[var10], class91.method631(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2015 & 0x8) == 8) {
            method4259(field836, field837 + " " + class91.field1173 + " " + class91.method631(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field815; var14++) {
            if (field818[var14] == 23) {
                field821[var14] = class91.method631(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ha.ix(IIIIIIIII)V")
    public static final void method3769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method417(arg0)) {
            Statics.field116 = null;
            method2418(Statics.field2597[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field116 != null) {
                method2418(Statics.field116, -1412584499, arg1, arg2, arg3, arg4, Statics.field948, Statics.field2548, arg7);
                Statics.field116 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field883[var8] = true;
            }
        } else {
            field883[arg7] = true;
        }
    }

    @ObfuscatedName("df.ij([Lhq;IIIIIIIII)V")
    public static final void method2418(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class331.method5653(arg2, arg3, arg4, arg5);
        class140.method2870();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2615 == arg1 || arg1 == -1412584499 && field858 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field886[field682] = var10.field2672 + arg6;
                    field887[field682] = var10.field2610 + arg7;
                    field888[field682] = var10.field2620;
                    field908[field682] = var10.field2622;
                    var11 = ++field682 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2743 = var11;
                var10.field2664 = field674;
                if (!var10.field2717 || !method176(var10)) {
                    if (var10.field2671 > 0) {
                        method759(var10);
                    }
                    int var12 = var10.field2672 + arg6;
                    int var13 = var10.field2610 + arg7;
                    int var14 = var10.field2637;
                    if (field858 == var10) {
                        if (arg1 != -1412584499 && !var10.field2690) {
                            Statics.field116 = arg0;
                            Statics.field948 = arg6;
                            Statics.field2548 = arg7;
                            continue;
                        }
                        if (field757 && field800) {
                            int var15 = class64.field504;
                            int var16 = class64.field505;
                            int var17 = var15 - field730;
                            int var18 = var16 - field854;
                            if (var17 < field857) {
                                var17 = field857;
                            }
                            if (var10.field2620 + var17 > field857 + field852.field2620) {
                                var17 = field857 + field852.field2620 - var10.field2620;
                            }
                            if (var18 < field786) {
                                var18 = field786;
                            }
                            if (var10.field2622 + var18 > field786 + field852.field2622) {
                                var18 = field786 + field852.field2622 - var10.field2622;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2690) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2608 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2608 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2620 + var12;
                        int var26 = var10.field2622 + var13;
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
                        int var29 = var10.field2620 + var12;
                        int var30 = var10.field2622 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2717 || var19 < var21 && var20 < var22) {
                        if (var10.field2671 != 0) {
                            if (var10.field2671 == 1336) {
                                if (field690) {
                                    var13 += 15;
                                    Statics.field3455.method5055("Fps:" + field460, var10.field2620 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field676) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3455.method5055("Mem:" + var32 + "k", var10.field2620 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2671 == 1337) {
                                field827 = var12;
                                field828 = var13;
                                method1192(var12, var13, var10.field2620, var10.field2622);
                                field883[var10.field2743] = true;
                                class331.method5653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2671 == 1338) {
                                method4786(var10, var12, var13, var11);
                                class331.method5653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2671 == 1339) {
                                method1084(var10, var12, var13, var11);
                                class331.method5653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2671 == 1400) {
                                Statics.field626.method5962(var12, var13, var10.field2620, var10.field2622, field674);
                            }
                            if (var10.field2671 == 1401) {
                                Statics.field626.method6133(var12, var13, var10.field2620, var10.field2622);
                            }
                            if (var10.field2671 == 1402) {
                                Statics.field1297.method1706(var12, field674);
                            }
                        }
                        if (var10.field2608 == 0) {
                            if (!var10.field2717 && method176(var10) && Statics.field3636 != var10) {
                                continue;
                            }
                            if (!var10.field2717) {
                                if (var10.field2703 > var10.field2630 - var10.field2622) {
                                    var10.field2703 = var10.field2630 - var10.field2622;
                                }
                                if (var10.field2703 < 0) {
                                    var10.field2703 = 0;
                                }
                            }
                            method2418(arg0, var10.field2738, var19, var20, var21, var22, var12 - var10.field2604, var13 - var10.field2703, var11);
                            if (var10.field2736 != null) {
                                method2418(var10.field2736, var10.field2738, var19, var20, var21, var22, var12 - var10.field2604, var13 - var10.field2703, var11);
                            }
                            class71 var34 = (class71) field954.method5611((long) var10.field2738);
                            if (var34 != null) {
                                method3769(var34.field583, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class331.method5653(arg2, arg3, arg4, arg5);
                            class140.method2870();
                        }
                        if (field892 || field885[var11] || field721 > 1) {
                            if (var10.field2608 == 0 && !var10.field2717 && var10.field2630 > var10.field2622) {
                                method3306(var10.field2620 + var12, var13, var10.field2703, var10.field2622, var10.field2630);
                            }
                            if (var10.field2608 != 1) {
                                if (var10.field2608 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2618; var36++) {
                                        for (int var37 = 0; var37 < var10.field2617; var37++) {
                                            int var38 = (var10.field2673 + 32) * var37 + var12;
                                            int var39 = (var10.field2659 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2675[var35];
                                                var39 += var10.field2676[var35];
                                            }
                                            if (var10.field2730[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2730[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2033 == var10 && field785 == var35) {
                                                    class335 var43;
                                                    if (field701 == 1 && Statics.field105 == var35 && Statics.field1354 == var10.field2738) {
                                                        var43 = class265.method2155(var42, var10.field2731[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class265.method2155(var42, var10.field2731[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method710(var10);
                                                    } else if (Statics.field2033 == var10 && field785 == var35) {
                                                        int var44 = class64.field504 - field686;
                                                        int var45 = class64.field505 - field784;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field790 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5771(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class331.field3881 && var46.field2703 > 0) {
                                                                int var47 = field738 * (class331.field3881 - var39 - var45) / 3;
                                                                if (var47 > field738 * 10) {
                                                                    var47 = field738 * 10;
                                                                }
                                                                if (var47 > var46.field2703) {
                                                                    var47 = var46.field2703;
                                                                }
                                                                var46.field2703 -= var47;
                                                                field784 += var47;
                                                                method710(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class331.field3878 && var46.field2703 < var46.field2630 - var46.field2622) {
                                                                int var48 = field738 * (var39 + var45 + 32 - class331.field3878) / 3;
                                                                if (var48 > field738 * 10) {
                                                                    var48 = field738 * 10;
                                                                }
                                                                if (var48 > var46.field2630 - var46.field2622 - var46.field2703) {
                                                                    var48 = var46.field2630 - var46.field2622 - var46.field2703;
                                                                }
                                                                var46.field2703 += var48;
                                                                field784 -= var48;
                                                                method710(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field80 == var10 && field945 == var35) {
                                                        var43.method5771(var38, var39, 128);
                                                    } else {
                                                        var43.method5765(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2607 != null && var35 < 20) {
                                                class335 var49 = var10.method3790(var35);
                                                if (var49 != null) {
                                                    var49.method5765(var38, var39);
                                                } else if (class227.field2612) {
                                                    method710(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2608 == 3) {
                                    int var50;
                                    if (method3656(var10)) {
                                        var50 = var10.field2632;
                                        if (Statics.field3636 == var10 && var10.field2613 != 0) {
                                            var50 = var10.field2613;
                                        }
                                    } else {
                                        var50 = var10.field2628;
                                        if (Statics.field3636 == var10 && var10.field2625 != 0) {
                                            var50 = var10.field2625;
                                        }
                                    }
                                    if (var10.field2609) {
                                        switch(var10.field2636.field3891) {
                                            case 1:
                                                class331.method5719(var12, var13, var10.field2620, var10.field2622, var10.field2628, var10.field2632);
                                                break;
                                            case 2:
                                                class331.method5663(var12, var13, var10.field2620, var10.field2622, var10.field2628, var10.field2632, 255 - (var10.field2637 & 0xFF), 255 - (var10.field2638 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class331.method5661(var12, var13, var10.field2620, var10.field2622, var50);
                                                } else {
                                                    class331.method5660(var12, var13, var10.field2620, var10.field2622, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class331.method5665(var12, var13, var10.field2620, var10.field2622, var50);
                                    } else {
                                        class331.method5666(var12, var13, var10.field2620, var10.field2622, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2608 == 4) {
                                    class305 var51 = var10.method3791();
                                    if (var51 != null) {
                                        String var52 = var10.field2667;
                                        int var53;
                                        if (method3656(var10)) {
                                            var53 = var10.field2632;
                                            if (Statics.field3636 == var10 && var10.field2613 != 0) {
                                                var53 = var10.field2613;
                                            }
                                            if (var10.field2668.length() > 0) {
                                                var52 = var10.field2668;
                                            }
                                        } else {
                                            var53 = var10.field2628;
                                            if (Statics.field3636 == var10 && var10.field2625 != 0) {
                                                var53 = var10.field2625;
                                            }
                                        }
                                        if (var10.field2717 && var10.field2732 != -1) {
                                            class265 var54 = class265.method136(var10.field2732);
                                            var52 = var54.field3434;
                                            if (var52 == null) {
                                                var52 = class234.field2806;
                                            }
                                            if ((var54.field3445 == 1 || var10.field2656 != 1) && var10.field2656 != -1) {
                                                var52 = class91.method631(16748608) + var52 + class91.field1175 + " " + 'x' + method4963(var10.field2656);
                                            }
                                        }
                                        if (field844 == var10) {
                                            var52 = class234.field2885;
                                            var53 = var10.field2628;
                                        }
                                        if (!var10.field2717) {
                                            var52 = method3688(var52, var10);
                                        }
                                        var51.method5107(var52, var12, var13, var10.field2620, var10.field2622, var53, var10.field2742 ? 0 : -1, var10.field2594, var10.field2621, var10.field2669);
                                    } else if (class227.field2612) {
                                        method710(var10);
                                    }
                                } else if (var10.field2608 == 5) {
                                    if (var10.field2717) {
                                        class335 var56;
                                        if (var10.field2732 == -1) {
                                            var56 = var10.method3796(false);
                                        } else {
                                            var56 = class265.method2155(var10.field2732, var10.field2656, var10.field2645, var10.field2646, var10.field2695, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3911;
                                            int var58 = var56.field3904;
                                            if (var10.field2644) {
                                                class331.method5654(var12, var13, var10.field2620 + var12, var10.field2622 + var13);
                                                int var59 = (var10.field2620 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2622 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2678 != 0) {
                                                            var56.method5815(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2678, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5765(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5771(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class331.method5653(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2620 * 4096 / var57;
                                                if (var10.field2678 != 0) {
                                                    var56.method5815(var10.field2620 / 2 + var12, var10.field2622 / 2 + var13, var10.field2678, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5773(var12, var13, var10.field2620, var10.field2622, 256 - (var14 & 0xFF));
                                                } else if (var10.field2620 == var57 && var10.field2622 == var58) {
                                                    var56.method5765(var12, var13);
                                                } else {
                                                    var56.method5767(var12, var13, var10.field2620, var10.field2622);
                                                }
                                            }
                                        } else if (class227.field2612) {
                                            method710(var10);
                                        }
                                    } else {
                                        class335 var55 = var10.method3796(method3656(var10));
                                        if (var55 != null) {
                                            var55.method5765(var12, var13);
                                        } else if (class227.field2612) {
                                            method710(var10);
                                        }
                                    }
                                } else if (var10.field2608 == 6) {
                                    boolean var64 = method3656(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2654;
                                    } else {
                                        var65 = var10.field2653;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2732 != -1) {
                                        class265 var68 = class265.method136(var10.field2732);
                                        if (var68 != null) {
                                            class265 var69 = var68.method4398(var10.field2656);
                                            var66 = var69.method4382(1);
                                            if (var66 == null) {
                                                method710(var10);
                                            } else {
                                                var66.method2758();
                                                var67 = var66.field1906 / 2;
                                            }
                                        }
                                    } else if (var10.field2649 == 5) {
                                        if (var10.field2650 == 0) {
                                            var66 = field941.method3761((class269) null, -1, (class269) null, -1);
                                        } else {
                                            var66 = Statics.field141.method1141();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3813((class269) null, -1, var64, Statics.field141.field645);
                                        if (var66 == null && class227.field2612) {
                                            method710(var10);
                                        }
                                    } else {
                                        class269 var70 = class269.method536(var65);
                                        var66 = var10.method3813(var70, var10.field2734, var64, Statics.field141.field645);
                                        if (var66 == null && class227.field2612) {
                                            method710(var10);
                                        }
                                    }
                                    class140.method2939(var10.field2620 / 2 + var12, var10.field2622 / 2 + var13);
                                    int var71 = var10.field2643 * class140.field1811[var10.field2741] >> 16;
                                    int var72 = var10.field2643 * class140.field1794[var10.field2741] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2717) {
                                            var66.method2758();
                                            if (var10.field2663) {
                                                var66.method2763(0, var10.field2658, var10.field2670, var10.field2741, var10.field2655, var10.field2707 + var67 + var71, var10.field2707 + var72, var10.field2643);
                                            } else {
                                                var66.method2761(0, var10.field2658, var10.field2670, var10.field2741, var10.field2655, var10.field2707 + var67 + var71, var10.field2707 + var72);
                                            }
                                        } else {
                                            var66.method2761(0, var10.field2658, 0, var10.field2741, 0, var71, var72);
                                        }
                                    }
                                    class140.method2916();
                                } else {
                                    if (var10.field2608 == 7) {
                                        class305 var73 = var10.method3791();
                                        if (var73 == null) {
                                            if (class227.field2612) {
                                                method710(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2618; var75++) {
                                            for (int var76 = 0; var76 < var10.field2617; var76++) {
                                                if (var10.field2730[var74] > 0) {
                                                    class265 var77 = class265.method136(var10.field2730[var74] - 1);
                                                    String var78;
                                                    if (var77.field3445 != 1 && var10.field2731[var74] == 1) {
                                                        var78 = class91.method631(16748608) + var77.field3434 + class91.field1175;
                                                    } else {
                                                        var78 = class91.method631(16748608) + var77.field3434 + class91.field1175 + " " + 'x' + method4963(var10.field2731[var74]);
                                                    }
                                                    int var79 = (var10.field2673 + 115) * var76 + var12;
                                                    int var80 = (var10.field2659 + 12) * var75 + var13;
                                                    if (var10.field2594 == 0) {
                                                        var73.method5053(var78, var79, var80, var10.field2628, var10.field2742 ? 0 : -1);
                                                    } else if (var10.field2594 == 1) {
                                                        var73.method5056(var78, var10.field2620 / 2 + var79, var80, var10.field2628, var10.field2742 ? 0 : -1);
                                                    } else {
                                                        var73.method5055(var78, var10.field2620 + var79 - 1, var80, var10.field2628, var10.field2742 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2608 == 8 && Statics.field1951 == var10 && field829 == field771) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class305 var83 = Statics.field3455;
                                        String var84 = var10.field2667;
                                        String var85 = method3688(var84, var10);
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
                                            int var88 = var83.method5127(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3707 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2620 + var12 - 5 - var81;
                                        int var90 = var10.field2622 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class331.method5661(var89, var90, var81, var82, 16777120);
                                        class331.method5665(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2667;
                                        int var92 = var83.field3707 + var90 + 2;
                                        String var93 = method3688(var91, var10);
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
                                            var83.method5053(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3707 + 1;
                                        }
                                    }
                                    if (var10.field2608 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2640) {
                                            var96 = var12;
                                            var97 = var10.field2622 + var13;
                                            var98 = var10.field2620 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2620 + var12;
                                            var99 = var10.field2622 + var13;
                                        }
                                        if (var10.field2639 == 1) {
                                            class331.method5671(var96, var97, var98, var99, var10.field2628);
                                        } else {
                                            method1818(var96, var97, var98, var99, var10.field2628, var10.field2639);
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

    @ObfuscatedName("cn.is(IIIIIIB)V")
    public static final void method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class331.field3883;
        int var18 = arg1 - class331.field3881;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2878(var19, var20, var21);
        class140.method2930(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2878(var19, var21, var22);
        class140.method2930(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("hh.ig(Ljava/lang/String;Lhq;I)Ljava/lang/String;")
    public static String method3688(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3974(method196(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("kt.io(IB)Ljava/lang/String;")
    public static final String method4963(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1169 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method631(65408) + var1.substring(0, var1.length() - 8) + class234.field2948 + " " + class91.field1178 + var1 + class91.field1172 + class91.field1175;
        } else if (var1.length() > 6) {
            return " " + class91.method631(16777215) + var1.substring(0, var1.length() - 4) + class234.field2837 + " " + class91.field1178 + var1 + class91.field1172 + class91.field1175;
        } else {
            return " " + class91.method631(16776960) + var1 + class91.field1175;
        }
    }

    @ObfuscatedName("client.ic(ZB)V")
    public final void method1350(boolean arg0) {
        int var2 = field838;
        int var3 = Statics.field1642;
        int var4 = Statics.field475;
        if (class227.method417(var2)) {
            method720(Statics.field2597[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ip(Lhq;I)V")
    public void method1576(class227 arg0) {
        class227 var2 = arg0.field2615 == -1 ? null : class227.method2021(arg0.field2615);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1642;
            var4 = Statics.field475;
        } else {
            var3 = var2.field2620;
            var4 = var2.field2622;
        }
        method1094(arg0, var3, var4, false);
        method3689(arg0, var3, var4);
    }

    @ObfuscatedName("i.iw([Lhq;Lhq;ZB)V")
    public static void method46(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2629 == 0 ? arg1.field2620 : arg1.field2629;
        int var4 = arg1.field2630 == 0 ? arg1.field2622 : arg1.field2630;
        method720(arg0, arg1.field2738, var3, var4, arg2);
        if (arg1.field2736 != null) {
            method720(arg1.field2736, arg1.field2738, var3, var4, arg2);
        }
        class71 var5 = (class71) field954.method5611((long) arg1.field2738);
        if (var5 != null) {
            int var6 = var5.field583;
            if (class227.method417(var6)) {
                method720(Statics.field2597[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2671 == 1337) {
        }
    }

    @ObfuscatedName("bz.ii([Lhq;IIIZI)V")
    public static void method720(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2615 == arg1) {
                method1094(var6, arg2, arg3, arg4);
                method3689(var6, arg2, arg3);
                if (var6.field2604 > var6.field2629 - var6.field2620) {
                    var6.field2604 = var6.field2629 - var6.field2620;
                }
                if (var6.field2604 < 0) {
                    var6.field2604 = 0;
                }
                if (var6.field2703 > var6.field2630 - var6.field2622) {
                    var6.field2703 = var6.field2630 - var6.field2622;
                }
                if (var6.field2703 < 0) {
                    var6.field2703 = 0;
                }
                if (var6.field2608 == 0) {
                    method46(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bo.id(Lhq;IIZS)V")
    public static void method1094(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2620;
        int var5 = arg0.field2622;
        if (arg0.field2666 == 0) {
            arg0.field2620 = arg0.field2617;
        } else if (arg0.field2666 == 1) {
            arg0.field2620 = arg1 - arg0.field2617;
        } else if (arg0.field2666 == 2) {
            arg0.field2620 = arg0.field2617 * arg1 >> 14;
        }
        if (arg0.field2614 == 0) {
            arg0.field2622 = arg0.field2618;
        } else if (arg0.field2614 == 1) {
            arg0.field2622 = arg2 - arg0.field2618;
        } else if (arg0.field2614 == 2) {
            arg0.field2622 = arg0.field2618 * arg2 >> 14;
        }
        if (arg0.field2666 == 4) {
            arg0.field2620 = arg0.field2623 * arg0.field2622 / arg0.field2624;
        }
        if (arg0.field2614 == 4) {
            arg0.field2622 = arg0.field2624 * arg0.field2620 / arg0.field2623;
        }
        if (arg0.field2671 == 1337) {
            field850 = arg0;
        }
        if (arg3 && arg0.field2721 != null && (arg0.field2620 != var4 || arg0.field2622 != var5)) {
            class72 var6 = new class72();
            var6.field586 = arg0;
            var6.field601 = arg0.field2721;
            field877.method4616(var6);
        }
    }

    @ObfuscatedName("hi.it(Lhq;IIB)V")
    public static void method3689(class227 arg0, int arg1, int arg2) {
        if (arg0.field2694 == 0) {
            arg0.field2672 = arg0.field2661;
        } else if (arg0.field2694 == 1) {
            arg0.field2672 = (arg1 - arg0.field2620) / 2 + arg0.field2661;
        } else if (arg0.field2694 == 2) {
            arg0.field2672 = arg1 - arg0.field2620 - arg0.field2661;
        } else if (arg0.field2694 == 3) {
            arg0.field2672 = arg0.field2661 * arg1 >> 14;
        } else if (arg0.field2694 == 4) {
            arg0.field2672 = (arg0.field2661 * arg1 >> 14) + (arg1 - arg0.field2620) / 2;
        } else {
            arg0.field2672 = arg1 - arg0.field2620 - (arg0.field2661 * arg1 >> 14);
        }
        if (arg0.field2674 == 0) {
            arg0.field2610 = arg0.field2616;
        } else if (arg0.field2674 == 1) {
            arg0.field2610 = (arg2 - arg0.field2622) / 2 + arg0.field2616;
        } else if (arg0.field2674 == 2) {
            arg0.field2610 = arg2 - arg0.field2622 - arg0.field2616;
        } else if (arg0.field2674 == 3) {
            arg0.field2610 = arg0.field2616 * arg2 >> 14;
        } else if (arg0.field2674 == 4) {
            arg0.field2610 = (arg0.field2616 * arg2 >> 14) + (arg2 - arg0.field2622) / 2;
        } else {
            arg0.field2610 = arg2 - arg0.field2622 - (arg0.field2616 * arg2 >> 14);
        }
    }

    @ObfuscatedName("as.iq(Lhq;IIIIIIB)V")
    public static final void method556(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field744) {
            field745 = 32;
        } else {
            field745 = 0;
        }
        field744 = false;
        if (class64.field503 == 1 || !Statics.field587 && class64.field503 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2703 -= 4;
                method710(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2703 += 4;
                method710(arg0);
            } else if (arg5 >= arg1 - field745 && arg5 < field745 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2703 = (arg4 - arg3) * var8 / var9;
                method710(arg0);
                field744 = true;
            }
        }
        if (field876 == 0) {
            return;
        }
        int var10 = arg0.field2620;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2703 += field876 * 45;
            method710(arg0);
        }
    }

    @ObfuscatedName("fa.ik(IIIIIB)V")
    public static final void method3306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field82[0].method5737(arg0, arg1);
        Statics.field82[1].method5737(arg0, arg1 + arg3 - 16);
        class331.method5661(arg0, arg1 + 16, 16, arg3 - 32, field740);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class331.method5661(arg0, arg1 + 16 + var6, 16, var5, field671);
        class331.method5669(arg0, arg1 + 16 + var6, var5, field743);
        class331.method5669(arg0 + 1, arg1 + 16 + var6, var5, field743);
        class331.method5686(arg0, arg1 + 16 + var6, 16, field743);
        class331.method5686(arg0, arg1 + 17 + var6, 16, field743);
        class331.method5669(arg0 + 15, arg1 + 16 + var6, var5, field742);
        class331.method5669(arg0 + 14, arg1 + 17 + var6, var5 - 1, field742);
        class331.method5686(arg0, arg1 + 15 + var6 + var5, 16, field742);
        class331.method5686(arg0 + 1, arg1 + 14 + var6 + var5, 15, field742);
    }

    @ObfuscatedName("ip.iv(IB)Ljava/lang/String;")
    public static final String method3974(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("hx.ib(Lhq;I)Z")
    public static final boolean method3656(class227 arg0) {
        if (arg0.field2725 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2725.length; var1++) {
            int var2 = method196(arg0, var1);
            int var3 = arg0.field2726[var1];
            if (arg0.field2725[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2725[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2725[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.ih(Lhq;II)I")
    public static final int method196(class227 arg0, int arg1) {
        if (arg0.field2724 == null || arg1 >= arg0.field2724.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2724[arg1];
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
                    var7 = field809[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field810[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field811[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method2021(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class265.method136(var12).field3447 || field675)) {
                        for (int var13 = 0; var13 < var11.field2730.length; var13++) {
                            if (var12 + 1 == var11.field2730[var13]) {
                                var7 += var11.field2731[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2558[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2785[field810[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2558[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field141.field653;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2783[var14]) {
                            var7 += field810[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method2021(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class265.method136(var18).field3447 || field675)) {
                        for (int var19 = 0; var19 < var17.field2730.length; var19++) {
                            if (var18 + 1 == var17.field2730[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field845;
                }
                if (var6 == 12) {
                    var7 = field846;
                }
                if (var6 == 13) {
                    int var20 = class222.field2558[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method552(var22);
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
                    var7 = (Statics.field141.field995 >> 7) + Statics.field348;
                }
                if (var6 == 19) {
                    var7 = (Statics.field141.field1024 >> 7) + Statics.field263;
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

    @ObfuscatedName("id.iu(Lhq;Ljq;IIZB)V")
    public static final void method4051(class227 arg0, class265 arg1, int arg2, int arg3, boolean arg4) {
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
            var7 = class234.field2800;
        }
        if (var6 != -1 && var7 != null) {
            Statics.method1010(var7, class91.method631(16748608) + arg1.field3434, var6, arg1.field3432, arg2, arg0.field2738, arg4);
        }
    }

    @ObfuscatedName("k.ie(Lhq;III)V")
    public static final void method13(class227 arg0, int arg1, int arg2) {
        if (arg0.field2709 == 1) {
            method4259(arg0.field2599, "", 24, 0, 0, arg0.field2738);
        }
        if (arg0.field2709 == 2 && !field833) {
            String var3 = method3713(arg0);
            if (var3 != null) {
                method4259(var3, class91.method631(65280) + arg0.field2711, 25, 0, -1, arg0.field2738);
            }
        }
        if (arg0.field2709 == 3) {
            method4259(class234.field2961, "", 26, 0, 0, arg0.field2738);
        }
        if (arg0.field2709 == 4) {
            method4259(arg0.field2599, "", 28, 0, 0, arg0.field2738);
        }
        if (arg0.field2709 == 5) {
            method4259(arg0.field2599, "", 29, 0, 0, arg0.field2738);
        }
        if (arg0.field2709 == 6 && field844 == null) {
            method4259(arg0.field2599, "", 30, 0, -1, arg0.field2738);
        }
        if (arg0.field2608 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2622; var5++) {
                for (int var6 = 0; var6 < arg0.field2620; var6++) {
                    int var7 = (arg0.field2673 + 32) * var6;
                    int var8 = (arg0.field2659 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2675[var4];
                        var8 += arg0.field2676[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field788 = var4;
                        Statics.field3227 = arg0;
                        if (arg0.field2730[var4] > 0) {
                            label266: {
                                class265 var9 = class265.method136(arg0.field2730[var4] - 1);
                                if (field701 == 1) {
                                    int var10 = method262(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1354 != arg0.field2738 || Statics.field105 != var4) {
                                            method4259(class234.field2909, field832 + " " + class91.field1173 + " " + class91.method631(16748608) + var9.field3434, 31, var9.field3432, var4, arg0.field2738);
                                        }
                                        break label266;
                                    }
                                }
                                if (field833) {
                                    int var12 = method262(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2015 & 0x10) == 16) {
                                            method4259(field836, field837 + " " + class91.field1173 + " " + class91.method631(16748608) + var9.field3434, 32, var9.field3432, var4, arg0.field2738);
                                        }
                                        break label266;
                                    }
                                }
                                String[] var14 = var9.field3449;
                                int var15 = -1;
                                if (field824 && method2381()) {
                                    var15 = var9.method4381();
                                }
                                int var16 = method262(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method4051(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method262(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method4259(class234.field2909, class91.method631(16748608) + var9.field3434, 38, var9.field3432, var4, arg0.field2738);
                                }
                                int var21 = method262(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method4051(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method4051(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field2714;
                                if (var24 != null) {
                                    for (int var25 = 4; var25 >= 0; var25--) {
                                        if (var24[var25] != null) {
                                            byte var26 = 0;
                                            if (var25 == 0) {
                                                var26 = 39;
                                            }
                                            if (var25 == 1) {
                                                var26 = 40;
                                            }
                                            if (var25 == 2) {
                                                var26 = 41;
                                            }
                                            if (var25 == 3) {
                                                var26 = 42;
                                            }
                                            if (var25 == 4) {
                                                var26 = 43;
                                            }
                                            method4259(var24[var25], class91.method631(16748608) + var9.field3434, var26, var9.field3432, var4, arg0.field2738);
                                        }
                                    }
                                }
                                method4259(class234.field2953, class91.method631(16748608) + var9.field3434, 1005, var9.field3432, var4, arg0.field2738);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2717) {
            return;
        }
        if (field833) {
            int var27 = method262(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field2015 & 0x20) == 32) {
                method4259(field836, field837 + " " + class91.field1173 + " " + arg0.field2685, 58, 0, arg0.field2605, arg0.field2738);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            String var30 = method633(arg0, var29);
            if (var30 != null) {
                method4259(var30, arg0.field2685, 1007, var29 + 1, arg0.field2605, arg0.field2738);
            }
        }
        String var31 = method3713(arg0);
        if (var31 != null) {
            method4259(var31, arg0.field2685, 25, 0, arg0.field2605, arg0.field2738);
        }
        for (int var32 = 4; var32 >= 0; var32--) {
            String var33 = method633(arg0, var32);
            if (var33 != null) {
                Statics.method1010(var33, arg0.field2685, 57, var32 + 1, arg0.field2605, arg0.field2738, arg0.field2748);
            }
        }
        if (class228.method540(method262(arg0))) {
            method4259(class234.field2873, "", 30, 0, arg0.field2605, arg0.field2738);
        }
    }

    @ObfuscatedName("c.ir(ZI)V")
    public static void method115(boolean arg0) {
        field825 = arg0;
    }

    @ObfuscatedName("kx.in(I)Z")
    public static boolean method4917() {
        return field825;
    }

    @ObfuscatedName("dy.iy(B)Z")
    public static boolean method2381() {
        return field825 || class55.field416[81];
    }

    @ObfuscatedName("ed.il(IIIIIIIB)V")
    public static final void method3151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method417(arg0)) {
            method559(Statics.field2597[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("as.jj([Lhq;IIIIIIIB)V")
    public static final void method559(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2615 == arg1 && (!var9.field2717 || var9.field2608 == 0 || var9.field2692 || method262(var9) != 0 || field852 == var9 || var9.field2671 == 1338)) {
                if (var9.field2717) {
                    if (method176(var9)) {
                        continue;
                    }
                } else if (var9.field2608 == 0 && Statics.field3636 != var9 && method176(var9)) {
                    continue;
                }
                int var10 = var9.field2672 + arg6;
                int var11 = var9.field2610 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2608 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2608 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2620 + var10;
                    int var19 = var9.field2622 + var11;
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
                    int var22 = var9.field2620 + var10;
                    int var23 = var9.field2622 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field858 == var9) {
                    field881 = true;
                    field860 = var10;
                    field796 = var11;
                }
                boolean var24 = false;
                if (var9.field2677) {
                    switch(field866) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2738 >>> 16 == field841) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field841 == var9.field2738) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2717 || var12 < var14 && var13 < var15) {
                    if (var9.field2717) {
                        if (var9.field2746) {
                            if (class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15) {
                                for (class72 var25 = (class72) field877.method4621(); var25 != null; var25 = (class72) field877.method4641()) {
                                    if (var25.field585) {
                                        var25.method3401();
                                        var25.field586.field2737 = false;
                                    }
                                }
                                if (Statics.field1919 == 0) {
                                    field858 = null;
                                    field852 = null;
                                }
                                if (!field813) {
                                    method630();
                                }
                            }
                        } else if (var9.field2747 && class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15) {
                            for (class72 var26 = (class72) field877.method4621(); var26 != null; var26 = (class72) field877.method4641()) {
                                if (var26.field585 && var26.field586.field2713 == var26.field601) {
                                    var26.method3401();
                                }
                            }
                        }
                    }
                    int var27 = class64.field504;
                    int var28 = class64.field505;
                    if (class64.field496 != 0) {
                        var27 = class64.field512;
                        var28 = class64.field513;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2671 == 1337) {
                        if (!field942 && !field813 && var29) {
                            method3288(var27, var28, var12, var13);
                        }
                    } else if (var9.field2671 == 1338) {
                        method125(var9, var10, var11);
                    } else {
                        if (var9.field2671 == 1400) {
                            Statics.field626.method5945(class64.field504, class64.field505, var29, var10, var11, var9.field2620, var9.field2622);
                        }
                        if (!field813 && var29) {
                            if (var9.field2671 == 1400) {
                                Statics.field626.method5997(var10, var11, var9.field2620, var9.field2622, var27, var28);
                            } else {
                                method13(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2627.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2627[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2627[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2662 != null) {
                                            var34 = class55.field416[var9.field2627[var30][var33]];
                                        }
                                        if (method4878(var9.field2627[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2662 != null && var9.field2662[var30] > field674) {
                                                break;
                                            }
                                            byte var35 = var9.field2720[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field416[86] && !class55.field416[82] && !class55.field416[81]) && ((var35 & 0x2) == 0 || class55.field416[86]) && ((var35 & 0x1) == 0 || class55.field416[82]) && ((var35 & 0x4) == 0 || class55.field416[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method3225(var30 + 1, var9.field2738, var9.field2605, var9.field2732, "");
                                    } else if (var30 == 10) {
                                        method209();
                                        method4780(var9.field2738, var9.field2605, class228.method142(method262(var9)), var9.field2732);
                                        field836 = method3713(var9);
                                        if (field836 == null) {
                                            field836 = class234.field2806;
                                        }
                                        field837 = var9.field2685 + class91.method631(16777215);
                                    }
                                    int var36 = var9.field2683[var30];
                                    if (var9.field2662 == null) {
                                        var9.field2662 = new int[var9.field2627.length];
                                    }
                                    if (var9.field2684 == null) {
                                        var9.field2684 = new int[var9.field2627.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2662[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2662[var30] == 0) {
                                        var9.field2662[var30] = field674 + var36 + var9.field2684[var30];
                                    } else {
                                        var9.field2662[var30] = field674 + var36;
                                    }
                                }
                                if (!var31 && var9.field2662 != null) {
                                    var9.field2662[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2717) {
                            boolean var37;
                            if (class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field503 == 1 || !Statics.field587 && class64.field503 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field496 == 1 || !Statics.field587 && class64.field496 == 4) && class64.field512 >= var12 && class64.field513 >= var13 && class64.field512 < var14 && class64.field513 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method97(var9, class64.field512 - var10, class64.field513 - var11);
                            }
                            if (var9.field2671 == 1400) {
                                Statics.field626.method5946(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field858 != null && field858 != var9 && var37 && class228.method4008(method262(var9))) {
                                field855 = var9;
                            }
                            if (field852 == var9) {
                                field800 = true;
                                field857 = var10;
                                field786 = var11;
                            }
                            if (var9.field2692) {
                                if (var37 && field876 != 0 && var9.field2713 != null) {
                                    class72 var40 = new class72();
                                    var40.field585 = true;
                                    var40.field586 = var9;
                                    var40.field597 = field876;
                                    var40.field601 = var9.field2713;
                                    field877.method4616(var40);
                                }
                                if (field858 != null || Statics.field2033 != null || field813) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2611 && var39) {
                                    var9.field2611 = true;
                                    if (var9.field2696 != null) {
                                        class72 var41 = new class72();
                                        var41.field585 = true;
                                        var41.field586 = var9;
                                        var41.field602 = class64.field512 - var10;
                                        var41.field597 = class64.field513 - var11;
                                        var41.field601 = var9.field2696;
                                        field877.method4616(var41);
                                    }
                                }
                                if (var9.field2611 && var38 && var9.field2633 != null) {
                                    class72 var42 = new class72();
                                    var42.field585 = true;
                                    var42.field586 = var9;
                                    var42.field602 = class64.field504 - var10;
                                    var42.field597 = class64.field505 - var11;
                                    var42.field601 = var9.field2633;
                                    field877.method4616(var42);
                                }
                                if (var9.field2611 && !var38) {
                                    var9.field2611 = false;
                                    if (var9.field2680 != null) {
                                        class72 var43 = new class72();
                                        var43.field585 = true;
                                        var43.field586 = var9;
                                        var43.field602 = class64.field504 - var10;
                                        var43.field597 = class64.field505 - var11;
                                        var43.field601 = var9.field2680;
                                        field913.method4616(var43);
                                    }
                                }
                                if (var38 && var9.field2697 != null) {
                                    class72 var44 = new class72();
                                    var44.field585 = true;
                                    var44.field586 = var9;
                                    var44.field602 = class64.field504 - var10;
                                    var44.field597 = class64.field505 - var11;
                                    var44.field601 = var9.field2697;
                                    field877.method4616(var44);
                                }
                                if (!var9.field2737 && var37) {
                                    var9.field2737 = true;
                                    if (var9.field2698 != null) {
                                        class72 var45 = new class72();
                                        var45.field585 = true;
                                        var45.field586 = var9;
                                        var45.field602 = class64.field504 - var10;
                                        var45.field597 = class64.field505 - var11;
                                        var45.field601 = var9.field2698;
                                        field877.method4616(var45);
                                    }
                                }
                                if (var9.field2737 && var37 && var9.field2699 != null) {
                                    class72 var46 = new class72();
                                    var46.field585 = true;
                                    var46.field586 = var9;
                                    var46.field602 = class64.field504 - var10;
                                    var46.field597 = class64.field505 - var11;
                                    var46.field601 = var9.field2699;
                                    field877.method4616(var46);
                                }
                                if (var9.field2737 && !var37) {
                                    var9.field2737 = false;
                                    if (var9.field2739 != null) {
                                        class72 var47 = new class72();
                                        var47.field585 = true;
                                        var47.field586 = var9;
                                        var47.field602 = class64.field504 - var10;
                                        var47.field597 = class64.field505 - var11;
                                        var47.field601 = var9.field2739;
                                        field913.method4616(var47);
                                    }
                                }
                                if (var9.field2660 != null) {
                                    class72 var48 = new class72();
                                    var48.field586 = var9;
                                    var48.field601 = var9.field2660;
                                    field878.method4616(var48);
                                }
                                if (var9.field2705 != null && field865 > var9.field2619) {
                                    if (var9.field2706 == null || field865 - var9.field2619 > 32) {
                                        class72 var53 = new class72();
                                        var53.field586 = var9;
                                        var53.field601 = var9.field2705;
                                        field877.method4616(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2619; var49 < field865; var49++) {
                                            int var50 = field864[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2706.length; var51++) {
                                                if (var9.field2706[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field586 = var9;
                                                    var52.field601 = var9.field2705;
                                                    field877.method4616(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2619 = field865;
                                }
                                if (var9.field2681 != null && field904 > var9.field2728) {
                                    if (var9.field2708 == null || field904 - var9.field2728 > 32) {
                                        class72 var58 = new class72();
                                        var58.field586 = var9;
                                        var58.field601 = var9.field2681;
                                        field877.method4616(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2728; var54 < field904; var54++) {
                                            int var55 = field758[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2708.length; var56++) {
                                                if (var9.field2708[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field586 = var9;
                                                    var57.field601 = var9.field2681;
                                                    field877.method4616(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2728 = field904;
                                }
                                if (var9.field2606 != null && field869 > var9.field2682) {
                                    if (var9.field2710 == null || field869 - var9.field2682 > 32) {
                                        class72 var63 = new class72();
                                        var63.field586 = var9;
                                        var63.field601 = var9.field2606;
                                        field877.method4616(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2682; var59 < field869; var59++) {
                                            int var60 = field868[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2710.length; var61++) {
                                                if (var9.field2710[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field586 = var9;
                                                    var62.field601 = var9.field2606;
                                                    field877.method4616(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2682 = field869;
                                }
                                if (field870 > var9.field2665 && var9.field2631 != null) {
                                    class72 var64 = new class72();
                                    var64.field586 = var9;
                                    var64.field601 = var9.field2631;
                                    field877.method4616(var64);
                                }
                                if (field871 > var9.field2665 && var9.field2716 != null) {
                                    class72 var65 = new class72();
                                    var65.field586 = var9;
                                    var65.field601 = var9.field2716;
                                    field877.method4616(var65);
                                }
                                if (field872 > var9.field2665 && var9.field2745 != null) {
                                    class72 var66 = new class72();
                                    var66.field586 = var9;
                                    var66.field601 = var9.field2745;
                                    field877.method4616(var66);
                                }
                                if (field873 > var9.field2665 && var9.field2722 != null) {
                                    class72 var67 = new class72();
                                    var67.field586 = var9;
                                    var67.field601 = var9.field2722;
                                    field877.method4616(var67);
                                }
                                if (field874 > var9.field2665 && var9.field2723 != null) {
                                    class72 var68 = new class72();
                                    var68.field586 = var9;
                                    var68.field601 = var9.field2723;
                                    field877.method4616(var68);
                                }
                                if (field776 > var9.field2665 && var9.field2718 != null) {
                                    class72 var69 = new class72();
                                    var69.field586 = var9;
                                    var69.field601 = var9.field2718;
                                    field877.method4616(var69);
                                }
                                var9.field2665 = field863;
                                if (var9.field2715 != null) {
                                    for (int var70 = 0; var70 < field899; var70++) {
                                        class72 var71 = new class72();
                                        var71.field586 = var9;
                                        var71.field591 = field901[var70];
                                        var71.field592 = field900[var70];
                                        var71.field601 = var9.field2715;
                                        field877.method4616(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2717) {
                            if (field858 != null || Statics.field2033 != null || field813) {
                                continue;
                            }
                            if ((var9.field2727 >= 0 || var9.field2625 != 0) && class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15) {
                                if (var9.field2727 >= 0) {
                                    Statics.field3636 = arg0[var9.field2727];
                                } else {
                                    Statics.field3636 = var9;
                                }
                            }
                            if (var9.field2608 == 8 && class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15) {
                                Statics.field1951 = var9;
                            }
                            if (var9.field2630 > var9.field2622) {
                                method556(var9, var9.field2620 + var10, var11, var9.field2622, var9.field2630, class64.field504, class64.field505);
                            }
                        }
                        if (var9.field2608 == 0) {
                            method559(arg0, var9.field2738, var12, var13, var14, var15, var10 - var9.field2604, var11 - var9.field2703);
                            if (var9.field2736 != null) {
                                method559(var9.field2736, var9.field2738, var12, var13, var14, var15, var10 - var9.field2604, var11 - var9.field2703);
                            }
                            class71 var72 = (class71) field954.method5611((long) var9.field2738);
                            if (var72 != null) {
                                if (var72.field578 == 0 && class64.field504 >= var12 && class64.field505 >= var13 && class64.field504 < var14 && class64.field505 < var15 && !field813) {
                                    for (class72 var73 = (class72) field877.method4621(); var73 != null; var73 = (class72) field877.method4641()) {
                                        if (var73.field585) {
                                            var73.method3401();
                                            var73.field586.field2737 = false;
                                        }
                                    }
                                    if (Statics.field1919 == 0) {
                                        field858 = null;
                                        field852 = null;
                                    }
                                    if (!field813) {
                                        method630();
                                    }
                                }
                                method3151(var72.field583, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.jp(II)Z")
    public static boolean method4878(int arg0) {
        for (int var1 = 0; var1 < field899; var1++) {
            if (field901[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gf.jd(IIB)V")
    public static final void method3411(int arg0, int arg1) {
        if (class227.method417(arg0)) {
            method632(Statics.field2597[arg0], arg1);
        }
    }

    @ObfuscatedName("aj.jg([Lhq;II)V")
    public static final void method632(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2608 == 0) {
                    if (var3.field2736 != null) {
                        method632(var3.field2736, arg1);
                    }
                    class71 var4 = (class71) field954.method5611((long) var3.field2738);
                    if (var4 != null) {
                        method3411(var4.field583, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2719 != null) {
                    class72 var5 = new class72();
                    var5.field586 = var3;
                    var5.field601 = var3.field2719;
                    class86.method2141(var5);
                }
                if (arg1 == 1 && var3.field2600 != null) {
                    if (var3.field2605 >= 0) {
                        class227 var6 = class227.method2021(var3.field2738);
                        if (var6 == null || var6.field2736 == null || var3.field2605 >= var6.field2736.length || var6.field2736[var3.field2605] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field586 = var3;
                    var7.field601 = var3.field2600;
                    class86.method2141(var7);
                }
            }
        }
    }

    @ObfuscatedName("a.jq(Lhq;IIB)V")
    public static final void method97(class227 arg0, int arg1, int arg2) {
        if (field858 != null || field813 || arg0 == null) {
            return;
        }
        class227 var3 = method2193(arg0);
        if (var3 == null) {
            var3 = arg0.field2687;
        }
        if (var3 == null) {
            return;
        }
        field858 = arg0;
        class227 var5 = method2193(arg0);
        if (var5 == null) {
            var5 = arg0.field2687;
        }
        field852 = var5;
        field730 = arg1;
        field854 = arg2;
        Statics.field1919 = 0;
        field757 = false;
        int var7 = method175();
        if (var7 != -1) {
            method1814(var7);
        }
        return;
    }

    @ObfuscatedName("client.ju(B)V")
    public final void method1296() {
        method710(field858);
        Statics.field1919++;
        if (field881 && field800) {
            int var1 = class64.field504;
            int var2 = class64.field505;
            int var3 = var1 - field730;
            int var4 = var2 - field854;
            if (var3 < field857) {
                var3 = field857;
            }
            if (field858.field2620 + var3 > field857 + field852.field2620) {
                var3 = field857 + field852.field2620 - field858.field2620;
            }
            if (var4 < field786) {
                var4 = field786;
            }
            if (field858.field2622 + var4 > field786 + field852.field2622) {
                var4 = field786 + field852.field2622 - field858.field2622;
            }
            int var5 = var3 - field860;
            int var6 = var4 - field796;
            int var7 = field858.field2688;
            if (Statics.field1919 > field858.field2689 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field757 = true;
            }
            int var8 = field852.field2604 + (var3 - field857);
            int var9 = field852.field2703 + (var4 - field786);
            if (field858.field2701 != null && field757) {
                class72 var10 = new class72();
                var10.field586 = field858;
                var10.field602 = var8;
                var10.field597 = var9;
                var10.field601 = field858.field2701;
                class86.method2141(var10);
            }
            if (class64.field503 == 0) {
                if (field757) {
                    if (field858.field2702 != null) {
                        class72 var11 = new class72();
                        var11.field586 = field858;
                        var11.field602 = var8;
                        var11.field597 = var9;
                        var11.field590 = field855;
                        var11.field601 = field858.field2702;
                        class86.method2141(var11);
                    }
                    if (field855 != null && method2193(field858) != null) {
                        class197 var12 = class197.method1625(class193.field2267, field723.field1341);
                        var12.field2377.method5295(field855.field2738);
                        var12.field2377.method5239(field858.field2738);
                        var12.field2377.method5241(field858.field2605);
                        var12.field2377.method5229(field855.field2732);
                        var12.field2377.method5229(field855.field2605);
                        var12.field2377.method5229(field858.field2732);
                        field723.method2159(var12);
                    }
                } else if (this.method1505()) {
                    this.method1213(field860 + field730, field854 + field796);
                } else if (field815 > 0) {
                    method2025(field860 + field730, field854 + field796);
                }
                field858 = null;
            }
        } else if (Statics.field1919 > 1) {
            field858 = null;
        }
    }

    @ObfuscatedName("cn.jx(II)V")
    public static void method1814(int arg0) {
        Statics.field2081 = new class92();
        Statics.field2081.field1181 = field816[arg0];
        Statics.field2081.field1180 = field817[arg0];
        Statics.field2081.field1179 = field818[arg0];
        Statics.field2081.field1182 = field819[arg0];
        Statics.field2081.field1183 = field820[arg0];
    }

    @ObfuscatedName("cs.jt(III)V")
    public static void method2025(int arg0, int arg1) {
        method22(Statics.field2081, arg0, arg1);
        Statics.field2081 = null;
    }

    @ObfuscatedName("bl.jm(Lhq;I)V")
    public static void method710(class227 arg0) {
        if (field882 == arg0.field2664) {
            field883[arg0.field2743] = true;
        }
    }

    @ObfuscatedName("bj.jl(I)V")
    public static void method753() {
        for (class71 var0 = (class71) field954.method5605(); var0 != null; var0 = (class71) field954.method5608()) {
            int var1 = var0.field583;
            if (class227.method417(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field2597[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2717;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2157;
                    class227 var6 = class227.method2021(var5);
                    if (var6 != null) {
                        method710(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.jv(II)V")
    public static final void method2182(int arg0) {
        if (!class227.method417(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2597[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2734 = 0;
                var3.field2735 = 0;
            }
        }
    }

    @ObfuscatedName("bg.ji(II)V")
    public static final void method769(int arg0) {
        if (class227.method417(arg0)) {
            method2017(Statics.field2597[arg0], -1);
        }
    }

    @ObfuscatedName("cp.jb([Lhq;II)V")
    public static final void method2017(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2615 == arg1 && (!var3.field2717 || !method176(var3))) {
                if (var3.field2608 == 0) {
                    if (!var3.field2717 && method176(var3) && Statics.field3636 != var3) {
                        continue;
                    }
                    method2017(arg0, var3.field2738);
                    if (var3.field2736 != null) {
                        method2017(var3.field2736, var3.field2738);
                    }
                    class71 var4 = (class71) field954.method5611((long) var3.field2738);
                    if (var4 != null) {
                        method769(var4.field583);
                    }
                }
                if (var3.field2608 == 6) {
                    if (var3.field2653 != -1 || var3.field2654 != -1) {
                        boolean var5 = method3656(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2654;
                        } else {
                            var6 = var3.field2653;
                        }
                        if (var6 != -1) {
                            class269 var7 = class269.method536(var6);
                            var3.field2735 += field738;
                            while (var3.field2735 > var7.field3541[var3.field2734]) {
                                var3.field2735 -= var7.field3541[var3.field2734];
                                var3.field2734++;
                                if (var3.field2734 >= var7.field3535.length) {
                                    var3.field2734 -= var7.field3543;
                                    if (var3.field2734 < 0 || var3.field2734 >= var7.field3535.length) {
                                        var3.field2734 = 0;
                                    }
                                }
                                method710(var3);
                            }
                        }
                    }
                    if (var3.field2634 != 0 && !var3.field2717) {
                        int var8 = var3.field2634 >> 16;
                        int var9 = var3.field2634 << 16 >> 16;
                        int var10 = field738 * var8;
                        int var11 = field738 * var9;
                        var3.field2741 = var3.field2741 + var10 & 0x7FF;
                        var3.field2658 = var3.field2658 + var11 & 0x7FF;
                        method710(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fa.je(IB)V")
    public static final void method3303(int arg0) {
        method753();
        for (class85 var1 = (class85) class85.field1113.method4621(); var1 != null; var1 = (class85) class85.field1113.method4641()) {
            if (var1.field1117 != null) {
                var1.method1809();
            }
        }
        int var2 = class251.method3419(arg0).field3231;
        if (var2 == 0) {
            return;
        }
        int var3 = class222.field2558[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class140.method2911(0.9D);
                ((class129) Statics.field1808).method2613(0.9D);
            }
            if (var3 == 2) {
                class140.method2911(0.8D);
                ((class129) Statics.field1808).method2613(0.8D);
            }
            if (var3 == 3) {
                class140.method2911(0.7D);
                ((class129) Statics.field1808).method2613(0.7D);
            }
            if (var3 == 4) {
                class140.method2911(0.6D);
                ((class129) Statics.field1808).method2613(0.6D);
            }
            class265.field3425.method3172();
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
            if (field911 != var4) {
                if (field911 == 0 && field912 != -1) {
                    class207.method2136(Statics.field2133, field912, 0, var4, false);
                    field705 = false;
                } else if (var4 == 0) {
                    Statics.field2437.method3499();
                    class207.field2438 = 1;
                    Statics.field2421 = null;
                    field705 = false;
                } else {
                    class207.method116(var4);
                }
                field911 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field717 = 127;
            }
            if (var3 == 1) {
                field717 = 96;
            }
            if (var3 == 2) {
                field717 = 64;
            }
            if (var3 == 3) {
                field717 = 32;
            }
            if (var3 == 4) {
                field717 = 0;
            }
        }
        if (var2 == 5) {
            field812 = var3;
        }
        if (var2 == 6) {
            field728 = var3;
        }
        if (var2 == 9) {
            field708 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field915 = 127;
            }
            if (var3 == 1) {
                field915 = 96;
            }
            if (var3 == 2) {
                field915 = 64;
            }
            if (var3 == 3) {
                field915 = 32;
            }
            if (var3 == 4) {
                field915 = 0;
            }
        }
        if (var2 == 17) {
            field848 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field949 = (class94) class205.method2633(class94.method575(), var3);
            if (field949 == null) {
                field949 = class94.field1196;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field804 = -1;
            } else {
                field804 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field822 = (class94) class205.method2633(class94.method575(), var3);
            if (field822 == null) {
                field822 = class94.field1196;
            }
        }
    }

    @ObfuscatedName("bi.jo(Lhq;I)V")
    public static final void method759(class227 arg0) {
        int var1 = arg0.field2671;
        if (var1 == 324) {
            if (field938 == -1) {
                field938 = arg0.field2641;
                field943 = arg0.field2642;
            }
            if (field941.field2572) {
                arg0.field2641 = field938;
            } else {
                arg0.field2641 = field943;
            }
        } else if (var1 == 325) {
            if (field938 == -1) {
                field938 = arg0.field2641;
                field943 = arg0.field2642;
            }
            if (field941.field2572) {
                arg0.field2641 = field943;
            } else {
                arg0.field2641 = field938;
            }
        } else if (var1 == 327) {
            arg0.field2741 = 150;
            arg0.field2658 = (int) (Math.sin((double) field674 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2649 = 5;
            arg0.field2650 = 0;
        } else if (var1 == 328) {
            arg0.field2741 = 150;
            arg0.field2658 = (int) (Math.sin((double) field674 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2649 = 5;
            arg0.field2650 = 1;
        }
    }

    @ObfuscatedName("bb.jh(B)V")
    public static final void method1069() {
        class197 var0 = class197.method1625(class193.field2337, field723.field1341);
        field723.method2159(var0);
        for (class71 var1 = (class71) field954.method5605(); var1 != null; var1 = (class71) field954.method5608()) {
            if (var1.field578 == 0 || var1.field578 == 3) {
                method766(var1, true);
            }
        }
        if (field844 != null) {
            method710(field844);
            field844 = null;
        }
    }

    @ObfuscatedName("at.jw(IIIB)Lbq;")
    public static final class71 method420(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field583 = arg1;
        var3.field578 = arg2;
        field954.method5606(var3, (long) arg0);
        method2182(arg1);
        class227 var4 = class227.method2021(arg0);
        method710(var4);
        if (field844 != null) {
            method710(field844);
            field844 = null;
        }
        method16();
        method46(Statics.field2597[arg0 >> 16], var4, false);
        class86.method3852(arg1);
        if (field838 != -1) {
            method3411(field838, 1);
        }
        return var3;
    }

    @ObfuscatedName("bg.jr(Lbq;ZI)V")
    public static final void method766(class71 arg0, boolean arg1) {
        int var2 = arg0.field583;
        int var3 = (int) arg0.field2157;
        arg0.method3401();
        if (arg1) {
            class227.method2039(var2);
        }
        for (class189 var4 = (class189) field880.method5605(); var4 != null; var4 = (class189) field880.method5608()) {
            if ((long) var2 == (var4.field2157 >> 48 & 0xFFFFL)) {
                var4.method3401();
            }
        }
        class227 var5 = class227.method2021(var3);
        if (var5 != null) {
            method710(var5);
        }
        method16();
        if (field838 != -1) {
            method3411(field838, 1);
        }
    }

    @ObfuscatedName("i.ja(Lhq;I)Z")
    public static final boolean method43(class227 arg0) {
        int var1 = arg0.field2671;
        if (var1 == 205) {
            field724 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field941.method3766(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field941.method3756(var4, var5 == 1);
        }
        if (var1 == 324) {
            field941.method3747(false);
        }
        if (var1 == 325) {
            field941.method3747(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method1625(class193.field2308, field723.field1341);
            field941.method3745(var6.field2377);
            field723.method2159(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jn.jk(Lhq;IIII)V")
    public static final void method4786(class227 arg0, int arg1, int arg2, int arg3) {
        method3393();
        class221 var4 = arg0.method3793(false);
        if (var4 == null) {
            return;
        }
        class331.method5653(arg1, arg2, var4.field2551 + arg1, var4.field2550 + arg2);
        if (field910 == 2 || field910 == 5) {
            class331.method5673(arg1, arg2, 0, var4.field2549, var4.field2552);
        } else {
            int var5 = field769 & 0x7FF;
            int var6 = Statics.field141.field995 / 32 + 48;
            int var7 = 464 - Statics.field141.field1024 / 32;
            Statics.field633.method5782(arg1, arg2, var4.field2551, var4.field2550, var6, var7, var5, 256, var4.field2549, var4.field2552);
            for (int var8 = 0; var8 < field775; var8++) {
                int var9 = field843[var8] * 4 + 2 - Statics.field141.field995 / 32;
                int var10 = field906[var8] * 4 + 2 - Statics.field141.field1024 / 32;
                method1936(arg1, arg2, var9, var10, field952[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class272 var13 = field805[Statics.field2544][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field141.field995 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field141.field1024 / 32;
                        method1936(arg1, arg2, var14, var15, Statics.field3111[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field719; var16++) {
                class89 var17 = field718[field720[var16]];
                if (var17 != null && var17.method1165()) {
                    class267 var18 = var17.field1159;
                    if (var18 != null && var18.field3515 != null) {
                        var18 = var18.method4451();
                    }
                    if (var18 != null && var18.field3502 && var18.field3518) {
                        int var19 = var17.field995 / 32 - Statics.field141.field995 / 32;
                        int var20 = var17.field1024 / 32 - Statics.field141.field1024 / 32;
                        method1936(arg1, arg2, var19, var20, Statics.field3111[1], var4);
                    }
                }
            }
            int var21 = class99.field1279;
            int[] var22 = class99.field1282;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field861[var22[var23]];
                if (var24 != null && var24.method1165() && !var24.field656 && Statics.field141 != var24) {
                    int var25 = var24.field995 / 32 - Statics.field141.field995 / 32;
                    int var26 = var24.field1024 / 32 - Statics.field141.field1024 / 32;
                    boolean var27 = false;
                    if (Statics.field141.field655 != 0 && var24.field655 != 0 && Statics.field141.field655 == var24.field655) {
                        var27 = true;
                    }
                    if (var24.method1134()) {
                        method1936(arg1, arg2, var25, var26, Statics.field3111[3], var4);
                    } else if (var27) {
                        method1936(arg1, arg2, var25, var26, Statics.field3111[4], var4);
                    } else if (var24.method1137()) {
                        method1936(arg1, arg2, var25, var26, Statics.field3111[5], var4);
                    } else {
                        method1936(arg1, arg2, var25, var26, Statics.field3111[2], var4);
                    }
                }
            }
            if (field692 != 0 && field674 % 20 < 10) {
                if (field692 == 1 && field693 >= 0 && field693 < field718.length) {
                    class89 var28 = field718[field693];
                    if (var28 != null) {
                        int var29 = var28.field995 / 32 - Statics.field141.field995 / 32;
                        int var30 = var28.field1024 / 32 - Statics.field141.field1024 / 32;
                        method3723(arg1, arg2, var29, var30, Statics.field3320[1], var4);
                    }
                }
                if (field692 == 2) {
                    int var31 = field695 * 4 - Statics.field348 * 4 + 2 - Statics.field141.field995 / 32;
                    int var32 = field696 * 4 - Statics.field263 * 4 + 2 - Statics.field141.field1024 / 32;
                    method3723(arg1, arg2, var31, var32, Statics.field3320[1], var4);
                }
                if (field692 == 10 && field694 >= 0 && field694 < field861.length) {
                    class76 var33 = field861[field694];
                    if (var33 != null) {
                        int var34 = var33.field995 / 32 - Statics.field141.field995 / 32;
                        int var35 = var33.field1024 / 32 - Statics.field141.field1024 / 32;
                        method3723(arg1, arg2, var34, var35, Statics.field3320[1], var4);
                    }
                }
            }
            if (field739 != 0) {
                int var36 = field739 * 4 + 2 - Statics.field141.field995 / 32;
                int var37 = field909 * 4 + 2 - Statics.field141.field1024 / 32;
                method1936(arg1, arg2, var36, var37, Statics.field3320[0], var4);
            }
            if (!Statics.field141.field656) {
                class331.method5661(var4.field2551 / 2 + arg1 - 1, var4.field2550 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field884[arg3] = true;
    }

    @ObfuscatedName("bx.jy(Lhq;IIII)V")
    public static final void method1084(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3793(false);
        if (var4 == null) {
            return;
        }
        if (field910 < 3) {
            Statics.field2359.method5782(arg1, arg2, var4.field2551, var4.field2550, 25, 25, field769, 256, var4.field2549, var4.field2552);
        } else {
            class331.method5673(arg1, arg2, 0, var4.field2549, var4.field2552);
        }
    }

    @ObfuscatedName("hg.jz(IIIILlp;Lhz;I)V")
    public static final void method3723(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1936(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field769 & 0x7FF;
        int var8 = class140.field1811[var7];
        int var9 = class140.field1794[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2551 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3689.method5783(arg5.field2551 / 2 + arg0 - var17 / 2 + var15, arg5.field2550 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("cu.jf(IIIILlp;Lhz;I)V")
    public static final void method1936(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field769 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1811[var6];
        int var9 = class140.field1794[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5781(arg5.field2551 / 2 + var10 - arg4.field3911 / 2, arg5.field2550 / 2 - var11 - arg4.field3904 / 2, arg0, arg1, arg5.field2551, arg5.field2550, arg5.field2549, arg5.field2552);
        } else {
            arg4.method5765(arg5.field2551 / 2 + arg0 + var10 - arg4.field3911 / 2, arg5.field2550 / 2 + arg1 - var11 - arg4.field3904 / 2);
        }
    }

    @ObfuscatedName("ie.jc(S)V")
    public static final void method4171() {
        class101.method3226();
        if (Statics.field1907 != null) {
            Statics.field1907.method4906();
        }
    }

    @ObfuscatedName("dv.jn(I)V")
    public static final void method2192() {
        field872 = field863;
        Statics.field45 = true;
    }

    @ObfuscatedName("ef.js(Ljava/lang/String;I)V")
    public static final void method3142(String arg0) {
        if (Statics.field1907 != null) {
            class197 var1 = class197.method1625(class193.field2258, field723.field1341);
            var1.field2377.method5177(class310.method2409(arg0));
            var1.field2377.method5322(arg0);
            field723.method2159(var1);
        }
    }

    @ObfuscatedName("he.ka(Ljava/lang/String;B)V")
    public static final void method3602(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method1625(class193.field2325, field723.field1341);
            var1.field2377.method5177(class310.method2409(arg0));
            var1.field2377.method5322(arg0);
            field723.method2159(var1);
        }
    }

    @ObfuscatedName("ag.ko(Lhq;B)I")
    public static int method262(class227 arg0) {
        class189 var1 = (class189) field880.method5611(((long) arg0.field2738 << 32) + (long) arg0.field2605);
        return var1 == null ? arg0.field2679 : var1.field2154;
    }

    @ObfuscatedName("dv.kp(Lhq;I)Lhq;")
    public static class227 method2193(class227 arg0) {
        int var1 = method262(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class227.method2021(arg0.field2615);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.km(Lhq;I)Z")
    public static boolean method176(class227 arg0) {
        return arg0.field2626;
    }

    @ObfuscatedName("aj.kw(Lhq;II)Ljava/lang/String;")
    public static String method633(class227 arg0, int arg1) {
        if (!class228.method3866(method262(arg0), arg1) && arg0.field2712 == null) {
            return null;
        } else if (arg0.field2686 == null || arg0.field2686.length <= arg1 || arg0.field2686[arg1] == null || arg0.field2686[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2686[arg1];
        }
    }

    @ObfuscatedName("hz.ku(Lhq;I)Ljava/lang/String;")
    public static String method3713(class227 arg0) {
        if (class228.method142(method262(arg0)) == 0) {
            return null;
        } else if (arg0.field2691 == null || arg0.field2691.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2691;
        }
    }

    @ObfuscatedName("ir.kc(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4179(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field905 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field905 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field905 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field905 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field905 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2404 != null) {
            var3 = "/p=" + Statics.field2404;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field441 + "/a=" + Statics.field100 + var3 + "/";
    }

    @ObfuscatedName("ep.kx(Ljava/lang/String;I)V")
    public static void method2856(String arg0) {
        Statics.field2404 = arg0;
        try {
            String var1 = Statics.field9.getParameter(Integer.toString(18));
            String var2 = Statics.field9.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class217.method558(class307.method2184() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field9;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ig.kb(Ljava/lang/String;ZI)V")
    public static void method3868(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2750; var5++) {
            class265 var6 = class265.method136(var5);
            if ((!arg1 || var6.field3473) && var6.field3466 == -1 && var6.field3434.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2424 = -1;
                    Statics.field1303 = null;
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
        Statics.field1303 = var3;
        Statics.field600 = 0;
        Statics.field2424 = var4;
        String[] var9 = new String[Statics.field2424];
        for (int var10 = 0; var10 < Statics.field2424; var10++) {
            var9[var10] = class265.method136(var3[var10]).field3434;
        }
        short[] var11 = Statics.field1303;
        class199.method1083(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("bp.kh(Lkf;II)V")
    public static void method793(class310 arg0, int arg1) {
        byte[] var2 = arg0.field3731;
        if (field716 == null) {
            field716 = new byte[24];
        }
        class311.method5430(var2, arg1, field716, 0, 24);
        if (class177.field2093 == null) {
            return;
        }
        try {
            class177.field2093.method6164(0L);
            class177.field2093.method6169(arg0.field3731, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("aw.kt(Lkf;B)V")
    public static void method657(class310 arg0) {
        if (field716 != null) {
            arg0.method5186(field716, 0, field716.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class177.field2093.method6164(0L);
            class177.field2093.method6166(var1);
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
        arg0.method5186(var1, 0, var1.length);
    }

    @ObfuscatedName("client.ks(I)Lku;")
    public class293 method1216() {
        return Statics.field141 == null ? null : Statics.field141.field649;
    }

    @ObfuscatedName("cj.ke(IIIZB)V")
    public static void method1967(int arg0, int arg1, int arg2, boolean arg3) {
        class197 var4 = class197.method1625(class193.field2328, field723.field1341);
        var4.field2377.method5178(arg1);
        var4.field2377.method5238(arg3 ? field759 : 0);
        var4.field2377.method5178(arg0);
        var4.field2377.method5220(arg2);
        field723.method2159(var4);
    }

    @ObfuscatedName("fn.kd(B)Z")
    public static boolean method3294() {
        return field814 >= 2;
    }

    @ObfuscatedName("ef.kz(II)V")
    public static void method3146(int arg0) {
        field847 = arg0;
    }

    @ObfuscatedName("bb.kl(I)V")
    public static void method1081() {
        if (field847 == 1) {
            field760 = true;
        }
    }

    @ObfuscatedName("bm.kv(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1058(String arg0) {
        class239[] var1 = class239.method1126();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field3124 != -1 && arg0.startsWith(class91.method698(var3.field3124))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3124).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bw.kr(B)V")
    public static void method965() {
        if (Statics.field1902 == null) {
            return;
        }
        field947 = field674;
        Statics.field1902.method4036();
        for (int var0 = 0; var0 < field861.length; var0++) {
            if (field861[var0] != null) {
                Statics.field1902.method4045((field861[var0].field995 >> 7) + Statics.field348, (field861[var0].field1024 >> 7) + Statics.field263);
            }
        }
    }
}

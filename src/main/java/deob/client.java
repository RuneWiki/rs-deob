package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class63 implements class290 {

    @ObfuscatedName("client.w")
    public static class182[] field738 = new class182[4];

    @ObfuscatedName("client.aw")
    public static boolean field750 = true;

    @ObfuscatedName("client.bf")
    public static int field681 = 1;

    @ObfuscatedName("client.bc")
    public static int field682 = 0;

    @ObfuscatedName("client.bd")
    public static int field683 = 0;

    @ObfuscatedName("client.be")
    public static boolean field684 = false;

    @ObfuscatedName("client.bg")
    public static boolean field685 = false;

    @ObfuscatedName("client.ba")
    public static int field686 = -1;

    @ObfuscatedName("client.bv")
    public static boolean field783 = false;

    @ObfuscatedName("client.bx")
    public static int field688 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field702 = true;

    @ObfuscatedName("client.cd")
    public static int field690 = 0;

    @ObfuscatedName("client.cx")
    public static long field767 = 1L;

    @ObfuscatedName("client.ci")
    public static int field692 = -1;

    @ObfuscatedName("client.cz")
    public static int field693 = -1;

    @ObfuscatedName("client.cb")
    public static long field876 = -1L;

    @ObfuscatedName("client.cy")
    public static boolean field695 = true;

    @ObfuscatedName("client.ct")
    public static boolean field935 = false;

    @ObfuscatedName("client.cf")
    public static int field918 = 0;

    @ObfuscatedName("client.ca")
    public static int field890 = 0;

    @ObfuscatedName("client.cj")
    public static int field699 = 0;

    @ObfuscatedName("client.cp")
    public static int field801 = 0;

    @ObfuscatedName("client.ck")
    public static int field701 = 0;

    @ObfuscatedName("client.ce")
    public static int field764 = 0;

    @ObfuscatedName("client.cv")
    public static int field703 = 0;

    @ObfuscatedName("client.cl")
    public static int field704 = 0;

    @ObfuscatedName("client.dv")
    public static int field705 = 0;

    @ObfuscatedName("client.du")
    public static class94 field706 = class94.field1186;

    @ObfuscatedName("client.dz")
    public static class94 field707 = class94.field1186;

    @ObfuscatedName("client.dq")
    public static int field708 = 0;

    @ObfuscatedName("client.dm")
    public static int field861 = 0;

    @ObfuscatedName("client.db")
    public static int field710 = 0;

    @ObfuscatedName("client.eq")
    public static int field744 = 0;

    @ObfuscatedName("client.ei")
    public static int field712 = 0;

    @ObfuscatedName("client.en")
    public static int field713 = 0;

    @ObfuscatedName("client.ec")
    public static int field714 = 0;

    @ObfuscatedName("client.ev")
    public static int field715 = 0;

    @ObfuscatedName("client.eb")
    public static class170 field716 = class170.field2009;

    @ObfuscatedName("client.ez")
    public static boolean field717 = false;

    @ObfuscatedName("client.ek")
    public static class98 field718 = new class98();

    @ObfuscatedName("client.eg")
    public class310 field719;

    @ObfuscatedName("client.es")
    public class10 field720;

    @ObfuscatedName("client.fk")
    public static byte[] field721 = null;

    @ObfuscatedName("client.ff")
    public static class89[] field722 = new class89[32768];

    @ObfuscatedName("client.fd")
    public static int field723 = 0;

    @ObfuscatedName("client.fo")
    public static int[] field724 = new int[32768];

    @ObfuscatedName("client.fi")
    public static int field852 = 0;

    @ObfuscatedName("client.fv")
    public static int[] field726 = new int[250];

    @ObfuscatedName("client.fg")
    public static final class105 field762 = new class105();

    @ObfuscatedName("client.fu")
    public static int field803 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field729 = false;

    @ObfuscatedName("client.fj")
    public static boolean field730 = true;

    @ObfuscatedName("client.fn")
    public static class282 field797 = new class282();

    @ObfuscatedName("client.fe")
    public static HashMap field732 = new HashMap();

    @ObfuscatedName("client.gw")
    public static int field819 = 0;

    @ObfuscatedName("client.gu")
    public static int field922 = 1;

    @ObfuscatedName("client.gt")
    public static int field735 = 0;

    @ObfuscatedName("client.gz")
    public static int field736 = 1;

    @ObfuscatedName("client.ga")
    public static int field900 = 0;

    @ObfuscatedName("client.gs")
    public static boolean field739 = false;

    @ObfuscatedName("client.gk")
    public static int[][][] field740 = new int[4][13][13];

    @ObfuscatedName("client.gl")
    public static final int[] field700 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gj")
    public static int field742 = 0;

    @ObfuscatedName("client.hi")
    public static int field743 = 2301979;

    @ObfuscatedName("client.hl")
    public static int field748 = 5063219;

    @ObfuscatedName("client.hq")
    public static int field745 = 3353893;

    @ObfuscatedName("client.hw")
    public static int field746 = 7759444;

    @ObfuscatedName("client.hb")
    public static boolean field747 = false;

    @ObfuscatedName("client.hd")
    public static int field820 = 0;

    @ObfuscatedName("client.hn")
    public static int field825 = 128;

    @ObfuscatedName("client.hu")
    public static int field910 = 0;

    @ObfuscatedName("client.ha")
    public static int field709 = 0;

    @ObfuscatedName("client.ho")
    public static int field752 = 0;

    @ObfuscatedName("client.hr")
    public static int field741 = 0;

    @ObfuscatedName("client.hv")
    public static int field754 = 0;

    @ObfuscatedName("client.hx")
    public static int field755 = 0;

    @ObfuscatedName("client.im")
    public static int field756 = 50;

    @ObfuscatedName("client.ii")
    public static int field758 = 0;

    @ObfuscatedName("client.iv")
    public static int field725 = 0;

    @ObfuscatedName("client.ir")
    public static int field760 = 0;

    @ObfuscatedName("client.ip")
    public static int field761 = 12;

    @ObfuscatedName("client.ih")
    public static int field891 = 6;

    @ObfuscatedName("client.ia")
    public static int field763 = 0;

    @ObfuscatedName("client.in")
    public static boolean field771 = false;

    @ObfuscatedName("client.ie")
    public static int field765 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field766 = false;

    @ObfuscatedName("client.ik")
    public static int field942 = 0;

    @ObfuscatedName("client.io")
    public static int field768 = 0;

    @ObfuscatedName("client.it")
    public static String field934 = null;

    @ObfuscatedName("client.iw")
    public static int field769 = 50;

    @ObfuscatedName("client.if")
    public static int[] field770 = new int[field769];

    @ObfuscatedName("client.ib")
    public static int[] field832 = new int[field769];

    @ObfuscatedName("client.id")
    public static int[] field772 = new int[field769];

    @ObfuscatedName("client.il")
    public static int[] field909 = new int[field769];

    @ObfuscatedName("client.iu")
    public static int[] field774 = new int[field769];

    @ObfuscatedName("client.is")
    public static int[] field928 = new int[field769];

    @ObfuscatedName("client.jq")
    public static int[] field776 = new int[field769];

    @ObfuscatedName("client.ji")
    public static String[] field782 = new String[field769];

    @ObfuscatedName("client.jv")
    public static int[][] field778 = new int[104][104];

    @ObfuscatedName("client.jw")
    public static int field779 = 0;

    @ObfuscatedName("client.jx")
    public static int field813 = -1;

    @ObfuscatedName("client.je")
    public static int field781 = -1;

    @ObfuscatedName("client.jj")
    public static int field923 = 0;

    @ObfuscatedName("client.jn")
    public static int field689 = 0;

    @ObfuscatedName("client.jc")
    public static int field784 = 0;

    @ObfuscatedName("client.jl")
    public static int field785 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field786 = true;

    @ObfuscatedName("client.jk")
    public static int field787 = 0;

    @ObfuscatedName("client.jg")
    public static int field881 = 0;

    @ObfuscatedName("client.jo")
    public static int field818 = 0;

    @ObfuscatedName("client.ja")
    public static int field790 = 0;

    @ObfuscatedName("client.jp")
    public static int field697 = 0;

    @ObfuscatedName("client.jy")
    public static int field792 = 0;

    @ObfuscatedName("client.jf")
    public static boolean field888 = false;

    @ObfuscatedName("client.jr")
    public static int field794 = 0;

    @ObfuscatedName("client.jt")
    public static int field795 = 0;

    @ObfuscatedName("client.js")
    public static boolean field796 = true;

    @ObfuscatedName("client.kw")
    public static class76[] field791 = new class76[2048];

    @ObfuscatedName("client.ke")
    public static int field798 = -1;

    @ObfuscatedName("client.kt")
    public static int field799 = 0;

    @ObfuscatedName("client.kr")
    public static boolean field800 = true;

    @ObfuscatedName("client.kk")
    public static int field691 = 0;

    @ObfuscatedName("client.kn")
    public static int field802 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field919 = new int[1000];

    @ObfuscatedName("client.kc")
    public static final int[] field804 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ka")
    public static String[] field805 = new String[8];

    @ObfuscatedName("client.kf")
    public static boolean[] field806 = new boolean[8];

    @ObfuscatedName("client.kg")
    public static int[] field807 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kx")
    public static int field808 = -1;

    @ObfuscatedName("client.kh")
    public static class272[][][] field809 = new class272[4][104][104];

    @ObfuscatedName("client.kp")
    public static class272 field698 = new class272();

    @ObfuscatedName("client.kz")
    public static class272 field811 = new class272();

    @ObfuscatedName("client.kj")
    public static class272 field812 = new class272();

    @ObfuscatedName("client.kb")
    public static int[] field687 = new int[25];

    @ObfuscatedName("client.kd")
    public static int[] field753 = new int[25];

    @ObfuscatedName("client.kl")
    public static int[] field822 = new int[25];

    @ObfuscatedName("client.lk")
    public static int field816 = 0;

    @ObfuscatedName("client.lb")
    public static boolean field817 = false;

    @ObfuscatedName("client.lg")
    public static int field694 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field777 = new int[500];

    @ObfuscatedName("client.lx")
    public static int[] field857 = new int[500];

    @ObfuscatedName("client.ly")
    public static int[] field780 = new int[500];

    @ObfuscatedName("client.ll")
    public static int[] field859 = new int[500];

    @ObfuscatedName("client.lh")
    public static String[] field823 = new String[500];

    @ObfuscatedName("client.ln")
    public static String[] field824 = new String[500];

    @ObfuscatedName("client.lw")
    public static boolean[] field810 = new boolean[500];

    @ObfuscatedName("client.lv")
    public static boolean field826 = false;

    @ObfuscatedName("client.lz")
    public static boolean field827 = false;

    @ObfuscatedName("client.li")
    public static boolean field828 = false;

    @ObfuscatedName("client.lj")
    public static boolean field829 = true;

    @ObfuscatedName("client.lu")
    public static int field830 = -1;

    @ObfuscatedName("client.le")
    public static int field831 = -1;

    @ObfuscatedName("client.lp")
    public static int field872 = 0;

    @ObfuscatedName("client.mp")
    public static int field833 = 50;

    @ObfuscatedName("client.mm")
    public static int field834 = 0;

    @ObfuscatedName("client.mi")
    public static boolean field836 = false;

    @ObfuscatedName("client.mw")
    public static int field837 = -1;

    @ObfuscatedName("client.mj")
    public static int field838 = -1;

    @ObfuscatedName("client.mc")
    public static String field839 = null;

    @ObfuscatedName("client.mx")
    public static String field840 = null;

    @ObfuscatedName("client.mr")
    public static int field925 = -1;

    @ObfuscatedName("client.mn")
    public static class328 field842 = new class328(8);

    @ObfuscatedName("client.mv")
    public static int field843 = 0;

    @ObfuscatedName("client.mk")
    public static int field844 = -1;

    @ObfuscatedName("client.mu")
    public static int field845 = 0;

    @ObfuscatedName("client.me")
    public static int field846 = 0;

    @ObfuscatedName("client.md")
    public static class227 field883 = null;

    @ObfuscatedName("client.mo")
    public static int field848 = 0;

    @ObfuscatedName("client.mz")
    public static int field849 = 0;

    @ObfuscatedName("client.mt")
    public static int field850 = 0;

    @ObfuscatedName("client.ma")
    public static int field841 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field711 = false;

    @ObfuscatedName("client.ne")
    public static class227 field853 = null;

    @ObfuscatedName("client.nc")
    public static class227 field854 = null;

    @ObfuscatedName("client.ng")
    public static class227 field855 = null;

    @ObfuscatedName("client.np")
    public static int field856 = 0;

    @ObfuscatedName("client.nd")
    public static int field929 = 0;

    @ObfuscatedName("client.ni")
    public static class227 field858 = null;

    @ObfuscatedName("client.ns")
    public static boolean field733 = false;

    @ObfuscatedName("client.nx")
    public static int field860 = -1;

    @ObfuscatedName("client.nk")
    public static int field882 = -1;

    @ObfuscatedName("client.na")
    public static boolean field862 = false;

    @ObfuscatedName("client.nt")
    public static int field835 = -1;

    @ObfuscatedName("client.nu")
    public static int field864 = -1;

    @ObfuscatedName("client.nf")
    public static boolean field865 = false;

    @ObfuscatedName("client.nv")
    public static int field866 = 1;

    @ObfuscatedName("client.nr")
    public static int[] field867 = new int[32];

    @ObfuscatedName("client.nj")
    public static int field773 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field869 = new int[32];

    @ObfuscatedName("client.ny")
    public static int field870 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field871 = new int[32];

    @ObfuscatedName("client.nh")
    public static int field793 = 0;

    @ObfuscatedName("client.os")
    public static int field904 = 0;

    @ObfuscatedName("client.oe")
    public static int field874 = 0;

    @ObfuscatedName("client.or")
    public static int field875 = 0;

    @ObfuscatedName("client.oi")
    public static int field775 = 0;

    @ObfuscatedName("client.oh")
    public static int field727 = 0;

    @ObfuscatedName("client.om")
    public static int field878 = 0;

    @ObfuscatedName("client.on")
    public static int field879 = 0;

    @ObfuscatedName("client.ow")
    public static class272 field788 = new class272();

    @ObfuscatedName("client.of")
    public static class272 field728 = new class272();

    @ObfuscatedName("client.ox")
    public static class272 field920 = new class272();

    @ObfuscatedName("client.og")
    public static class328 field751 = new class328(512);

    @ObfuscatedName("client.oq")
    public static int field884 = 0;

    @ObfuscatedName("client.oo")
    public static int field885 = -2;

    @ObfuscatedName("client.oa")
    public static boolean[] field680 = new boolean[100];

    @ObfuscatedName("client.ou")
    public static boolean[] field887 = new boolean[100];

    @ObfuscatedName("client.ok")
    public static boolean[] field814 = new boolean[100];

    @ObfuscatedName("client.op")
    public static int[] field951 = new int[100];

    @ObfuscatedName("client.ob")
    public static int[] field940 = new int[100];

    @ObfuscatedName("client.oz")
    public static int[] field734 = new int[100];

    @ObfuscatedName("client.oc")
    public static int[] field737 = new int[100];

    @ObfuscatedName("client.oy")
    public static int field893 = 0;

    @ObfuscatedName("client.od")
    public static long field894 = 0L;

    @ObfuscatedName("client.ov")
    public static boolean field895 = true;

    @ObfuscatedName("client.pi")
    public static int[] field896 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pr")
    public static int field897 = 0;

    @ObfuscatedName("client.pu")
    public static int field863 = 0;

    @ObfuscatedName("client.pt")
    public static String field815 = "";

    @ObfuscatedName("client.pp")
    public static long[] field847 = new long[100];

    @ObfuscatedName("client.ph")
    public static int field901 = 0;

    @ObfuscatedName("client.pa")
    public static int field902 = 0;

    @ObfuscatedName("client.pk")
    public static int[] field903 = new int[128];

    @ObfuscatedName("client.pw")
    public static int[] field873 = new int[128];

    @ObfuscatedName("client.pe")
    public static long field905 = -1L;

    @ObfuscatedName("client.pz")
    public static int field696 = -1;

    @ObfuscatedName("client.pm")
    public static int field907 = 0;

    @ObfuscatedName("client.px")
    public static int[] field908 = new int[1000];

    @ObfuscatedName("client.pg")
    public static int[] field868 = new int[1000];

    @ObfuscatedName("client.ps")
    public static class335[] field886 = new class335[1000];

    @ObfuscatedName("client.qa")
    public static int field911 = 0;

    @ObfuscatedName("client.qk")
    public static int field912 = 0;

    @ObfuscatedName("client.qx")
    public static int field913 = 0;

    @ObfuscatedName("client.qv")
    public static int field914 = 255;

    @ObfuscatedName("client.qc")
    public static int field915 = -1;

    @ObfuscatedName("client.qn")
    public static boolean field916 = false;

    @ObfuscatedName("client.qz")
    public static int field917 = 127;

    @ObfuscatedName("client.qy")
    public static int field759 = 127;

    @ObfuscatedName("client.qr")
    public static int field937 = 0;

    @ObfuscatedName("client.qw")
    public static int[] field880 = new int[50];

    @ObfuscatedName("client.qf")
    public static int[] field921 = new int[50];

    @ObfuscatedName("client.qm")
    public static int[] field877 = new int[50];

    @ObfuscatedName("client.qp")
    public static int[] field954 = new int[50];

    @ObfuscatedName("client.qu")
    public static class111[] field924 = new class111[50];

    @ObfuscatedName("client.ri")
    public static boolean field889 = false;

    @ObfuscatedName("client.rq")
    public static boolean[] field927 = new boolean[5];

    @ObfuscatedName("client.ru")
    public static int[] field789 = new int[5];

    @ObfuscatedName("client.rp")
    public static int[] field731 = new int[5];

    @ObfuscatedName("client.rs")
    public static int[] field930 = new int[5];

    @ObfuscatedName("client.rz")
    public static int[] field931 = new int[5];

    @ObfuscatedName("client.rg")
    public static short field932 = 256;

    @ObfuscatedName("client.rk")
    public static short field933 = 205;

    @ObfuscatedName("client.rn")
    public static short field898 = 256;

    @ObfuscatedName("client.rd")
    public static short field851 = 320;

    @ObfuscatedName("client.rr")
    public static short field936 = 1;

    @ObfuscatedName("client.rw")
    public static short field749 = 32767;

    @ObfuscatedName("client.rm")
    public static short field938 = 1;

    @ObfuscatedName("client.ra")
    public static short field939 = 32767;

    @ObfuscatedName("client.ro")
    public static int field906 = 0;

    @ObfuscatedName("client.sh")
    public static int field941 = 0;

    @ObfuscatedName("client.sc")
    public static int field821 = 0;

    @ObfuscatedName("client.si")
    public static int field943 = 0;

    @ObfuscatedName("client.st")
    public static int field944 = 0;

    @ObfuscatedName("client.so")
    public static class224 field945 = new class224();

    @ObfuscatedName("client.sv")
    public static int field946 = -1;

    @ObfuscatedName("client.se")
    public static int field947 = -1;

    @ObfuscatedName("client.sp")
    public static class340 field948 = new class339();

    @ObfuscatedName("client.sd")
    public static class19[] field949 = new class19[8];

    @ObfuscatedName("client.sk")
    public static class77 field950 = new class77();

    @ObfuscatedName("client.su")
    public static int field892 = -1;

    @ObfuscatedName("client.sf")
    public static ArrayList field952 = new ArrayList(10);

    @ObfuscatedName("client.sz")
    public static int field953 = 0;

    @ObfuscatedName("client.sn")
    public static int field899 = 0;

    @ObfuscatedName("client.tp")
    public static final class75 field955 = new class75();

    @ObfuscatedName("client.tj")
    public static int[] field956 = new int[50];

    @ObfuscatedName("client.tk")
    public static int[] field957 = new int[50];

    @ObfuscatedName("u.ek(I)Lml;")
    public static class343 method103() {
        return Statics.field122;
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method897() {
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
                        field730 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1171)) {
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
                        Statics.field3598 = class200.method3415(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field2354 = Statics.method3848(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1171)) {
                        }
                        break;
                    case 9:
                        Statics.field138 = var2;
                        break;
                    case 10:
                        class241[] var3 = new class241[] { class241.field3105, class241.field3106, class241.field3112, class241.field3108, class241.field3109, class241.field3107 };
                        Statics.field3966 = (class241) class205.method129(var3, Integer.parseInt(var2));
                        if (Statics.field3966 == class241.field3112) {
                            Statics.field165 = class348.field4051;
                        } else {
                            Statics.field165 = class348.field4055;
                        }
                        break;
                    case 12:
                        field681 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field3272 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field683 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2391 = var2;
                }
            }
        }
        class143.field1848 = false;
        field685 = false;
        Statics.field1306 = this.getCodeBase().getHost();
        String var4 = Statics.field2354.field3097;
        byte var5 = 0;
        try {
            Statics.field596 = 21;
            Statics.field41 = var5;
            try {
                Statics.field3528 = System.getProperty("os.name");
            } catch (Exception var60) {
                Statics.field3528 = "Unknown";
            }
            Statics.field2017 = Statics.field3528.toLowerCase();
            try {
                Statics.field213 = System.getProperty("user.home");
                if (Statics.field213 != null) {
                    Statics.field213 = Statics.field213 + "/";
                }
            } catch (Exception var59) {
            }
            try {
                if (Statics.field2017.startsWith("win")) {
                    if (Statics.field213 == null) {
                        Statics.field213 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field213 == null) {
                    Statics.field213 = System.getenv("HOME");
                }
                if (Statics.field213 != null) {
                    Statics.field213 = Statics.field213 + "/";
                }
            } catch (Exception var58) {
            }
            if (Statics.field213 == null) {
                Statics.field213 = "~/";
            }
            Statics.field2523 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field213, "/tmp/", "" };
            Statics.field3872 = new String[] { ".jagex_cache_" + Statics.field41, ".file_store_" + Statics.field41 };
            int var9 = 0;
            label274: while (var9 < 4) {
                String var10 = var9 == 0 ? "" : "" + var9;
                Statics.field2049 = new File(Statics.field213, "jagex_cl_oldschool_" + var4 + var10 + ".dat");
                String var11 = null;
                String var12 = null;
                boolean var13 = false;
                if (Statics.field2049.exists()) {
                    try {
                        class353 var14 = new class353(Statics.field2049, "rw", 10000L);
                        class310 var15 = new class310((int) var14.method6194());
                        while (var15.field3711 < var15.field3710.length) {
                            int var16 = var14.method6206(var15.field3710, var15.field3711, var15.field3710.length - var15.field3711);
                            if (var16 == -1) {
                                throw new IOException();
                            }
                            var15.field3711 += var16;
                        }
                        var15.field3711 = 0;
                        int var17 = var15.method5137();
                        if (var17 < 1 || var17 > 3) {
                            throw new IOException("" + var17);
                        }
                        int var18 = 0;
                        if (var17 > 1) {
                            var18 = var15.method5137();
                        }
                        if (var17 <= 2) {
                            var11 = var15.method5147();
                            if (var18 == 1) {
                                var12 = var15.method5147();
                            }
                        } else {
                            var11 = var15.method5271();
                            if (var18 == 1) {
                                var12 = var15.method5271();
                            }
                        }
                        var14.method6192();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                    if (var11 != null) {
                        File var20 = new File(var11);
                        if (!var20.exists()) {
                            var11 = null;
                        }
                    }
                    if (var11 != null) {
                        File var21 = new File(var11, "test.dat");
                        boolean var24;
                        try {
                            RandomAccessFile var22 = new RandomAccessFile(var21, "rw");
                            int var23 = var22.read();
                            var22.seek(0L);
                            var22.write(var23);
                            var22.seek(0L);
                            var22.close();
                            var21.delete();
                            var24 = true;
                        } catch (Exception var57) {
                            var24 = false;
                        }
                        if (!var24) {
                            var11 = null;
                        }
                    }
                }
                if (var11 == null && var9 == 0) {
                    label250: for (int var26 = 0; var26 < Statics.field3872.length; var26++) {
                        for (int var27 = 0; var27 < Statics.field2523.length; var27++) {
                            File var28 = new File(Statics.field2523[var27] + Statics.field3872[var26] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var28.exists()) {
                                File var29 = new File(var28, "test.dat");
                                boolean var32;
                                try {
                                    RandomAccessFile var30 = new RandomAccessFile(var29, "rw");
                                    int var31 = var30.read();
                                    var30.seek(0L);
                                    var30.write(var31);
                                    var30.seek(0L);
                                    var30.close();
                                    var29.delete();
                                    var32 = true;
                                } catch (Exception var56) {
                                    var32 = false;
                                }
                                if (var32) {
                                    var11 = var28.toString();
                                    var13 = true;
                                    break label250;
                                }
                            }
                        }
                    }
                }
                if (var11 == null) {
                    var11 = Statics.field213 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + "oldschool" + File.separatorChar + var4 + File.separatorChar;
                    var13 = true;
                }
                if (var12 != null) {
                    File var34 = new File(var12);
                    File var35 = new File(var11);
                    try {
                        File[] var36 = var34.listFiles();
                        File[] var37 = var36;
                        for (int var38 = 0; var38 < var37.length; var38++) {
                            File var39 = var37[var38];
                            File var40 = new File(var35, var39.getName());
                            boolean var41 = var39.renameTo(var40);
                            if (!var41) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var61) {
                        var61.printStackTrace();
                    }
                    var13 = true;
                }
                if (var13) {
                    class177.method3122(new File(var11), (File) null);
                }
                File var43 = new File(var11);
                Statics.field1181 = var43;
                if (!Statics.field1181.exists()) {
                    Statics.field1181.mkdirs();
                }
                File[] var44 = Statics.field1181.listFiles();
                if (var44 == null) {
                    break;
                }
                File[] var45 = var44;
                int var46 = 0;
                while (true) {
                    if (var46 >= var45.length) {
                        break label274;
                    }
                    File var47 = var45[var46];
                    boolean var50;
                    try {
                        RandomAccessFile var48 = new RandomAccessFile(var47, "rw");
                        int var49 = var48.read();
                        var48.seek(0L);
                        var48.write(var49);
                        var48.seek(0L);
                        var48.close();
                        var50 = true;
                    } catch (Exception var55) {
                        var50 = false;
                    }
                    if (!var50) {
                        var9++;
                        break;
                    }
                    var46++;
                }
            }
            File var52 = Statics.field1181;
            Statics.field2058 = var52;
            if (!Statics.field2058.exists()) {
                throw new RuntimeException("");
            }
            class179.field2057 = true;
            class177.method3678();
            class177.field2052 = new class352(new class353(Statics.method2826("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class177.field2056 = new class352(new class353(Statics.method2826("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2346 = new class352[Statics.field596];
            for (int var53 = 0; var53 < Statics.field596; var53++) {
                Statics.field2346[var53] = new class352(new class353(Statics.method2826("main_file_cache.idx" + var53), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var63) {
            class351.method3842((String) null, var63);
        }
        Statics.field319 = this;
        Statics.field4071 = field686;
        this.method872(765, 503, 189);
    }

    @ObfuscatedName("client.am(I)V")
    public final void method889() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4068 = null;
            Statics.field3716 = null;
            Statics.field3723 = (byte[][][]) null;
        } else {
            Statics.field4068 = var1;
            Statics.field3716 = new int[var1.length];
            Statics.field3723 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4068.length; var3++) {
                Statics.field3723[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field158 = field683 == 0 ? 43594 : field681 + 40000;
        Statics.field121 = field683 == 0 ? 443 : field681 + 50000;
        Statics.field3575 = Statics.field158;
        Statics.field279 = class225.field2545;
        Statics.field1765 = class225.field2548;
        Statics.field2540 = class225.field2547;
        Statics.field2536 = class225.field2546;
        Statics.field277 = new class153();
        this.method915();
        this.method903();
        Statics.field1263 = this.method863();
        Statics.field296 = new class318(255, class177.field2052, class177.field2056, 500000);
        Statics.field677 = class83.method680();
        this.method886();
        String var5 = Statics.field348;
        class61.field462 = this;
        if (var5 != null) {
            class61.field463 = var5;
        }
        if (field683 != 0) {
            field935 = true;
        }
        method357(Statics.field677.field1080);
        Statics.field1253 = new class84(Statics.field165);
    }

    @ObfuscatedName("client.au(B)V")
    public final void method890() {
        field690++;
        this.method1272();
        while (true) {
            class272 var1 = class245.field3150;
            class242 var2;
            synchronized (class245.field3150) {
                var2 = (class242) class245.field3149.method4557();
            }
            if (var2 == null) {
                try {
                    if (class207.field2407 == 1) {
                        int var4 = Statics.field2406.method3461();
                        if (var4 > 0 && Statics.field2406.method3556()) {
                            int var5 = var4 - Statics.field1188;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2406.method3482(var5);
                        } else {
                            Statics.field2406.method3535();
                            Statics.field2406.method3471();
                            if (Statics.field2408 == null) {
                                class207.field2407 = 0;
                            } else {
                                class207.field2407 = 2;
                            }
                            Statics.field2411 = null;
                            Statics.field1967 = null;
                        }
                    }
                } catch (Exception var18) {
                    var18.printStackTrace();
                    Statics.field2406.method3535();
                    class207.field2407 = 0;
                    Statics.field2411 = null;
                    Statics.field1967 = null;
                    Statics.field2408 = null;
                }
                method2152();
                class55 var7 = class55.field414;
                synchronized (class55.field414) {
                    class55.field438++;
                    class55.field435 = class55.field437;
                    class55.field418 = 0;
                    if (class55.field430 >= 0) {
                        while (class55.field440 != class55.field430) {
                            int var9 = class55.field428[class55.field440];
                            class55.field440 = class55.field440 + 1 & 0x7F;
                            if (var9 < 0) {
                                class55.field427[~var9] = false;
                            } else {
                                if (!class55.field427[var9] && class55.field418 < class55.field433.length - 1) {
                                    class55.field433[++class55.field418 - 1] = var9;
                                }
                                class55.field427[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class55.field427[var8] = false;
                        }
                        class55.field430 = class55.field440;
                    }
                    if (class55.field418 > 0) {
                        class55.field438 = 0;
                    }
                    class55.field437 = class55.field434;
                }
                class64.method744();
                if (Statics.field1263 != null) {
                    int var11 = Statics.field1263.method754();
                    field879 = var11;
                }
                if (field688 == 0) {
                    method3855();
                    Statics.field473.method3246();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field482[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field483[var13] = 0L;
                    }
                    Statics.field1878 = 0;
                } else if (field688 == 5) {
                    class95.method211(this);
                    method3855();
                    Statics.field473.method3246();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field482[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field483[var15] = 0L;
                    }
                    Statics.field1878 = 0;
                } else if (field688 == 10 || field688 == 11) {
                    class95.method211(this);
                } else if (field688 == 20) {
                    class95.method211(this);
                    this.method1248();
                } else if (field688 == 25) {
                    method131();
                }
                if (field688 == 30) {
                    this.method1249();
                } else if (field688 == 40 || field688 == 45) {
                    this.method1248();
                }
                return;
            }
            var2.field3116.method3985(var2.field3115, (int) var2.field2117, var2.field3114, false);
        }
    }

    @ObfuscatedName("client.ao(ZB)V")
    public final void method945(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class207.field2407 == 2) {
                    if (Statics.field2411 == null) {
                        Statics.field2411 = class213.method3652(Statics.field2408, Statics.field2409, Statics.field2414);
                        if (Statics.field2411 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field1967 == null) {
                        Statics.field1967 = new class118(Statics.field2404, Statics.field2405);
                    }
                    if (Statics.field2406.method3462(Statics.field2411, Statics.field454, Statics.field1967, 22050)) {
                        Statics.field2406.method3527();
                        Statics.field2406.method3482(Statics.field2515);
                        Statics.field2406.method3491(Statics.field2411, Statics.field107);
                        class207.field2407 = 0;
                        Statics.field2411 = null;
                        Statics.field1967 = null;
                        Statics.field2408 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2406.method3535();
                class207.field2407 = 0;
                Statics.field2411 = null;
                Statics.field1967 = null;
                Statics.field2408 = null;
            }
            var2 = false;
        }
        if (var2 && field916 && Statics.field368 != null) {
            Statics.field368.method2345();
        }
        if ((field688 == 10 || field688 == 20 || field688 == 30) && field894 != 0L && Statics.method3668() > field894) {
            method357(method1171());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field680[var5] = true;
            }
        }
        if (field688 == 0) {
            this.method910(class95.field1199, class95.field1198, arg0);
        } else if (field688 == 5) {
            class95.method1133(Statics.field2046, Statics.field1304, Statics.field141);
        } else if (field688 == 10 || field688 == 11) {
            class95.method1133(Statics.field2046, Statics.field1304, Statics.field141);
        } else if (field688 == 20) {
            class95.method1133(Statics.field2046, Statics.field1304, Statics.field141);
        } else if (field688 == 25) {
            if (field900 == 1) {
                if (field819 > field922) {
                    field922 = field819;
                }
                int var6 = (field922 * 50 - field819 * 50) / field922;
                Statics.method3663(class234.field2768 + class91.field1168 + class91.field1165 + var6 + "%" + class91.field1166, false);
            } else if (field900 == 2) {
                if (field735 > field736) {
                    field736 = field735;
                }
                int var7 = (field736 * 50 - field735 * 50) / field736 + 50;
                Statics.method3663(class234.field2768 + class91.field1168 + class91.field1165 + var7 + "%" + class91.field1166, false);
            } else {
                Statics.method3663(class234.field2768, false);
            }
        } else if (field688 == 30) {
            this.method1629();
        } else if (field688 == 40) {
            Statics.method3663(class234.field2804 + class91.field1168 + class234.field2770, false);
        } else if (field688 == 45) {
            Statics.method3663(class234.field2919, false);
        }
        if (field688 == 30 && field893 == 0 && !arg0 && !field895) {
            for (int var8 = 0; var8 < field884; var8++) {
                if (field887[var8]) {
                    Statics.field2412.method847(field951[var8], field940[var8], field734[var8], field737[var8]);
                    field887[var8] = false;
                }
            }
        } else if (field688 > 0) {
            Statics.field2412.method846(0, 0);
            for (int var9 = 0; var9 < field884; var9++) {
                field887[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.aq(S)V")
    public final void method892() {
        if (Statics.field1984.method2063()) {
            Statics.field1984.method2060();
        }
        if (Statics.field2435 != null) {
            Statics.field2435.field620 = false;
        }
        Statics.field2435 = null;
        field762.method2159();
        if (class55.field414 != null) {
            class55 var1 = class55.field414;
            synchronized (class55.field414) {
                class55.field414 = null;
            }
        }
        class64.method1936();
        Statics.field1263 = null;
        if (Statics.field368 != null) {
            Statics.field368.method2331();
        }
        if (Statics.field212 != null) {
            Statics.field212.method2331();
        }
        class247.method77();
        Object var3 = class245.field3151;
        synchronized (class245.field3151) {
            if (class245.field3152 != 0) {
                class245.field3152 = 1;
                try {
                    class245.field3151.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field277 != null) {
            Statics.field277.method3123();
            Statics.field277 = null;
        }
        try {
            class177.field2052.method6162();
            for (int var6 = 0; var6 < Statics.field596; var6++) {
                Statics.field2346[var6].method6162();
            }
            class177.field2056.method6162();
            class177.field2054.method6162();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bn.ew(II)V")
    public static void method1137(int arg0) {
        if (field688 == arg0) {
            return;
        }
        if (field688 == 0) {
            Statics.field319.method869();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field712 = 0;
            field713 = 0;
            field714 = 0;
            field797.method4648(arg0);
            if (arg0 != 20) {
                method1937(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1961 != null) {
            Statics.field1961.method3285();
            Statics.field1961 = null;
        }
        if (field688 == 25) {
            field900 = 0;
            field819 = 0;
            field922 = 1;
            field735 = 0;
            field736 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method4920(Statics.field2544, Statics.field2718, true, 0);
        } else if (arg0 == 20) {
            class95.method4920(Statics.field2544, Statics.field2718, true, field688 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method4920(Statics.field2544, Statics.field2718, false, 4);
        } else {
            class95.method3665();
        }
        field688 = arg0;
    }

    @ObfuscatedName("client.eg(B)V")
    public void method1272() {
        if (field688 == 1000) {
            return;
        }
        long var1 = Statics.method3668();
        int var3 = (int) (var1 - Statics.field3166);
        Statics.field3166 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class247.field3169 += var3;
        boolean var4;
        if (class247.field3174 == 0 && class247.field3170 == 0 && class247.field3173 == 0 && class247.field3168 == 0) {
            var4 = true;
        } else if (Statics.field3181 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class247.field3169 > 30000) {
                        throw new IOException();
                    }
                    while (class247.field3170 < 200 && class247.field3168 > 0) {
                        class243 var5 = (class243) class247.field3167.method5546();
                        class310 var6 = new class310(4);
                        var6.method5121(1);
                        var6.method5178((int) var5.field2117);
                        Statics.field3181.method3293(var6.field3710, 0, 4);
                        class247.field3175.method5548(var5, var5.field2117);
                        class247.field3168--;
                        class247.field3170++;
                    }
                    while (class247.field3174 < 200 && class247.field3173 > 0) {
                        class243 var7 = (class243) class247.field3171.method4482();
                        class310 var8 = new class310(4);
                        var8.method5121(0);
                        var8.method5178((int) var7.field2117);
                        Statics.field3181.method3293(var8.field3710, 0, 4);
                        var7.method3351();
                        class247.field3176.method5548(var7, var7.field2117);
                        class247.field3173--;
                        class247.field3174++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3181.method3290();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class247.field3169 = 0;
                        byte var11 = 0;
                        if (Statics.field3182 == null) {
                            var11 = 8;
                        } else if (class247.field3179 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class247.field3177.field3711;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3181.method3296(class247.field3177.field3710, class247.field3177.field3711, var12);
                            if (class247.field3164 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class247.field3177.field3710[class247.field3177.field3711 + var13] ^= class247.field3164;
                                }
                            }
                            class247.field3177.field3711 += var12;
                            if (class247.field3177.field3711 < var11) {
                                break;
                            }
                            if (Statics.field3182 == null) {
                                class247.field3177.field3711 = 0;
                                int var14 = class247.field3177.method5137();
                                int var15 = class247.field3177.method5139();
                                int var16 = class247.field3177.method5137();
                                int var17 = class247.field3177.method5142();
                                long var18 = (long) ((var14 << 16) + var15);
                                class243 var20 = (class243) class247.field3175.method5561(var18);
                                Statics.field678 = true;
                                if (var20 == null) {
                                    var20 = (class243) class247.field3176.method5561(var18);
                                    Statics.field678 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3182 = var20;
                                Statics.field3178 = new class310(var17 + var21 + Statics.field3182.field3121);
                                Statics.field3178.method5121(var16);
                                Statics.field3178.method5279(var17);
                                class247.field3179 = 8;
                                class247.field3177.field3711 = 0;
                            } else if (class247.field3179 == 0) {
                                if (class247.field3177.field3710[0] == -1) {
                                    class247.field3179 = 1;
                                    class247.field3177.field3711 = 0;
                                } else {
                                    Statics.field3182 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3178.field3710.length - Statics.field3182.field3121;
                            int var23 = 512 - class247.field3179;
                            if (var23 > var22 - Statics.field3178.field3711) {
                                var23 = var22 - Statics.field3178.field3711;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3181.method3296(Statics.field3178.field3710, Statics.field3178.field3711, var23);
                            if (class247.field3164 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3178.field3710[Statics.field3178.field3711 + var24] ^= class247.field3164;
                                }
                            }
                            Statics.field3178.field3711 += var23;
                            class247.field3179 += var23;
                            if (Statics.field3178.field3711 == var22) {
                                if (Statics.field3182.field2117 == 16711935L) {
                                    Statics.field60 = Statics.field3178;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class246 var26 = class247.field3165[var25];
                                        if (var26 != null) {
                                            Statics.field60.field3711 = var25 * 8 + 5;
                                            int var27 = Statics.field60.method5142();
                                            int var28 = Statics.field60.method5142();
                                            var26.method3966(var27, var28);
                                        }
                                    }
                                } else {
                                    class247.field3180.reset();
                                    class247.field3180.update(Statics.field3178.field3710, 0, var22);
                                    int var29 = (int) class247.field3180.getValue();
                                    if (Statics.field3182.field3125 != var29) {
                                        try {
                                            Statics.field3181.method3285();
                                        } catch (Exception var35) {
                                        }
                                        class247.field3183++;
                                        Statics.field3181 = null;
                                        class247.field3164 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class247.field3183 = 0;
                                    class247.field3184 = 0;
                                    Statics.field3182.field3122.method3965((int) (Statics.field3182.field2117 & 0xFFFFL), Statics.field3178.field3710, (Statics.field3182.field2117 & 0xFF0000L) == 16711680L, Statics.field678);
                                }
                                Statics.field3182.method3355();
                                if (Statics.field678) {
                                    class247.field3170--;
                                } else {
                                    class247.field3174--;
                                }
                                class247.field3179 = 0;
                                Statics.field3182 = null;
                                Statics.field3178 = null;
                            } else {
                                if (class247.field3179 != 512) {
                                    break;
                                }
                                class247.field3179 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3181.method3285();
                } catch (Exception var34) {
                }
                class247.field3184++;
                Statics.field3181 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1246();
        }
    }

    @ObfuscatedName("client.es(I)V")
    public void method1246() {
        if (class247.field3183 >= 4) {
            this.method964("js5crc");
            field688 = 1000;
            return;
        }
        if (class247.field3184 >= 4) {
            if (field688 <= 5) {
                this.method964("js5io");
                field688 = 1000;
                return;
            }
            field710 = 3000;
            class247.field3184 = 3;
        }
        if (--field710 + 1 > 0) {
            return;
        }
        try {
            if (field861 == 0) {
                Statics.field369 = Statics.field2711.method3256(Statics.field1306, Statics.field3575);
                field861++;
            }
            if (field861 == 1) {
                if (Statics.field369.field2034 == 2) {
                    this.method1475(-1);
                    return;
                }
                if (Statics.field369.field2034 == 1) {
                    field861++;
                }
            }
            if (field861 == 2) {
                if (field730) {
                    Statics.field2469 = class315.method5357((Socket) Statics.field369.field2031, 40000, 5000);
                } else {
                    Statics.field2469 = new class181((Socket) Statics.field369.field2031, Statics.field2711, 5000);
                }
                class310 var1 = new class310(5);
                var1.method5121(15);
                var1.method5279(189);
                Statics.field2469.method3293(var1.field3710, 0, 5);
                field861++;
                Statics.field456 = Statics.method3668();
            }
            if (field861 == 3) {
                if (Statics.field2469.method3290() > 0 || !field730 && field688 <= 5) {
                    int var2 = Statics.field2469.method3284();
                    if (var2 != 0) {
                        this.method1475(var2);
                        return;
                    }
                    field861++;
                } else if (Statics.method3668() - Statics.field456 > 30000L) {
                    this.method1475(-2);
                    return;
                }
            }
            if (field861 == 4) {
                class247.method192(Statics.field2469, field688 > 20);
                Statics.field369 = null;
                Statics.field2469 = null;
                field861 = 0;
                field744 = 0;
            }
        } catch (IOException var4) {
            this.method1475(-3);
        }
    }

    @ObfuscatedName("client.fk(II)V")
    public void method1475(int arg0) {
        Statics.field369 = null;
        Statics.field2469 = null;
        field861 = 0;
        if (Statics.field3575 == Statics.field158) {
            Statics.field3575 = Statics.field121;
        } else {
            Statics.field3575 = Statics.field158;
        }
        field744++;
        if (field744 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field688 <= 5) {
                this.method964("js5connect_full");
                field688 = 1000;
            } else {
                field710 = 3000;
            }
        } else if (field744 >= 2 && arg0 == 6) {
            this.method964("js5connect_outofdate");
            field688 = 1000;
        } else if (field744 >= 4) {
            if (field688 <= 5) {
                this.method964("js5connect");
                field688 = 1000;
            } else {
                field710 = 3000;
            }
        }
    }

    @ObfuscatedName("ek.fw(Lih;Ljava/lang/String;B)V")
    public static void method3118(class246 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field952.add(var2);
        field899 += var2.field566;
    }

    @ObfuscatedName("h.fl(I)I")
    public static int method117() {
        if (field952 == null || field953 >= field952.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field953; var1++) {
            var0 += ((class68) field952.get(var1)).field568;
        }
        return var0 * 10000 / field899;
    }

    @ObfuscatedName("ff.fy(IB)I")
    public static int method3184(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("bl.ff(III)V")
    public static void method1240(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method3184(var4);
            int var6 = class140.field1795[var4];
            int var7 = method2094(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class143.method2947(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ic.fd(I)V")
    public static void method3855() {
        if (field708 == 0) {
            Statics.field61 = new class143(4, 104, 104, class65.field550);
            for (int var0 = 0; var0 < 4; var0++) {
                field738[var0] = new class182(104, 104);
            }
            Statics.field3791 = new class335(512, 512);
            class95.field1198 = class234.field2990;
            class95.field1199 = 5;
            field708 = 20;
        } else if (field708 == 20) {
            class95.field1198 = class234.field2772;
            class95.field1199 = 10;
            field708 = 30;
        } else if (field708 == 30) {
            Statics.field3113 = method2149(0, false, true, true);
            Statics.field2500 = method2149(1, false, true, true);
            Statics.field103 = method2149(2, true, false, true);
            Statics.field271 = method2149(3, false, true, true);
            Statics.field3665 = method2149(4, false, true, true);
            Statics.field163 = method2149(5, true, true, true);
            Statics.field329 = method2149(6, true, true, true);
            Statics.field334 = method2149(7, false, true, true);
            Statics.field2718 = method2149(8, false, true, true);
            Statics.field1264 = method2149(9, false, true, true);
            Statics.field2544 = method2149(10, false, true, true);
            Statics.field294 = method2149(11, false, true, true);
            Statics.field312 = method2149(12, false, true, true);
            Statics.field1152 = method2149(13, true, false, true);
            Statics.field2550 = method2149(14, false, true, true);
            Statics.field114 = method2149(15, false, true, true);
            Statics.field1172 = method2149(17, true, true, true);
            Statics.field1988 = method2149(18, false, true, true);
            Statics.field3556 = method2149(19, false, true, true);
            Statics.field145 = method2149(20, false, true, true);
            class95.field1198 = class234.field2773;
            class95.field1199 = 20;
            field708 = 40;
        } else if (field708 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field3113.method3990() * 4 / 100;
            int var3 = var2 + Statics.field2500.method3990() * 4 / 100;
            int var4 = var3 + Statics.field103.method3990() * 2 / 100;
            int var5 = var4 + Statics.field271.method3990() * 2 / 100;
            int var6 = var5 + Statics.field3665.method3990() * 6 / 100;
            int var7 = var6 + Statics.field163.method3990() * 4 / 100;
            int var8 = var7 + Statics.field329.method3990() * 2 / 100;
            int var9 = var8 + Statics.field334.method3990() * 56 / 100;
            int var10 = var9 + Statics.field2718.method3990() * 2 / 100;
            int var11 = var10 + Statics.field1264.method3990() * 2 / 100;
            int var12 = var11 + Statics.field2544.method3990() * 2 / 100;
            int var13 = var12 + Statics.field294.method3990() * 2 / 100;
            int var14 = var13 + Statics.field312.method3990() * 2 / 100;
            int var15 = var14 + Statics.field1152.method3990() * 2 / 100;
            int var16 = var15 + Statics.field2550.method3990() * 2 / 100;
            int var17 = var16 + Statics.field114.method3990() * 2 / 100;
            int var18 = var17 + Statics.field3556.method3990() / 100;
            int var19 = var18 + Statics.field1988.method3990() / 100;
            int var20 = var19 + Statics.field145.method3990() / 100;
            int var21 = var20 + (Statics.field1172.method3964() && Statics.field1172.method3874() ? 1 : 0);
            if (var21 == 100) {
                method3118(Statics.field3113, "Animations");
                method3118(Statics.field2500, "Skeletons");
                method3118(Statics.field3665, "Sound FX");
                method3118(Statics.field163, "Maps");
                method3118(Statics.field329, "Music Tracks");
                method3118(Statics.field334, "Models");
                method3118(Statics.field2718, "Sprites");
                method3118(Statics.field294, "Music Jingles");
                method3118(Statics.field2550, "Music Samples");
                method3118(Statics.field114, "Music Patches");
                method3118(Statics.field3556, "World Map");
                method3118(Statics.field1988, "World Map Geography");
                method3118(Statics.field145, "World Map Ground");
                Statics.field36 = new class322();
                Statics.field36.method5490(Statics.field1172);
                class95.field1198 = class234.field2867;
                class95.field1199 = 30;
                field708 = 45;
            } else {
                if (var21 != 0) {
                    class95.field1198 = class234.field3054 + var21 + "%";
                }
                class95.field1199 = 30;
            }
        } else if (field708 == 45) {
            class115.method734(22050, !field685, 2);
            class208 var22 = new class208();
            var22.method3468(9, 128);
            Statics.field368 = class115.method3115(Statics.field2711, 0, 22050);
            Statics.field368.method2327(var22);
            class246 var23 = Statics.field114;
            class246 var24 = Statics.field2550;
            class246 var25 = Statics.field3665;
            Statics.field454 = var23;
            Statics.field2405 = var24;
            Statics.field2404 = var25;
            Statics.field2406 = var22;
            Statics.field212 = class115.method3115(Statics.field2711, 1, 2048);
            Statics.field554 = new class108();
            Statics.field212.method2327(Statics.field554);
            Statics.field149 = new class122(22050, Statics.field1422);
            class95.field1198 = class234.field2776;
            class95.field1199 = 35;
            field708 = 50;
            Statics.field575 = new class303(Statics.field2718, Statics.field1152);
        } else if (field708 == 50) {
            int var26 = class302.method4958().length;
            field732 = Statics.field575.method4962(class302.method4958());
            if (field732.size() < var26) {
                class95.field1198 = class234.field2777 + field732.size() * 100 / var26 + "%";
                class95.field1199 = 40;
            } else {
                Statics.field1304 = (class305) field732.get(class302.field3655);
                Statics.field141 = (class305) field732.get(class302.field3656);
                Statics.field2046 = (class305) field732.get(class302.field3667);
                Statics.field1288 = field948.method5884();
                class95.field1198 = class234.field2794;
                class95.field1199 = 40;
                field708 = 60;
            }
        } else if (field708 == 60) {
            int var27 = class95.method1965(Statics.field2544, Statics.field2718);
            int var28 = class95.method75();
            if (var27 < var28) {
                class95.field1198 = class234.field2814 + var27 * 100 / var28 + "%";
                class95.field1199 = 50;
            } else {
                class95.field1198 = class234.field2960;
                class95.field1199 = 50;
                method1137(5);
                field708 = 70;
            }
        } else if (field708 == 70) {
            if (Statics.field103.method3874()) {
                class246 var29 = Statics.field103;
                Statics.field3505 = var29;
                class246 var30 = Statics.field103;
                Statics.field3258 = var30;
                class256.method1163(Statics.field103, Statics.field334);
                class264.method260(Statics.field103, Statics.field334, field685);
                class246 var31 = Statics.field103;
                class246 var32 = Statics.field334;
                Statics.field3469 = var31;
                Statics.field3467 = var32;
                class261.method784(Statics.field103);
                class246 var33 = Statics.field103;
                class246 var34 = Statics.field334;
                boolean var35 = field684;
                class305 var36 = Statics.field1304;
                Statics.field3803 = var33;
                Statics.field95 = var34;
                Statics.field2011 = var35;
                Statics.field3908 = Statics.field3803.method3891(10);
                Statics.field404 = var36;
                class246 var37 = Statics.field103;
                class246 var38 = Statics.field3113;
                class246 var39 = Statics.field2500;
                Statics.field1289 = var37;
                Statics.field4030 = var38;
                Statics.field1178 = var39;
                class246 var40 = Statics.field103;
                class246 var41 = Statics.field334;
                Statics.field3245 = var40;
                Statics.field3237 = var41;
                class246 var42 = Statics.field103;
                Statics.field3292 = var42;
                class246 var43 = Statics.field103;
                Statics.field3209 = var43;
                Statics.field3205 = Statics.field3209.method3891(16);
                class227.method1726(Statics.field271, Statics.field334, Statics.field2718, Statics.field1152);
                class250.method4778(Statics.field103);
                class262.method1050(Statics.field103);
                class253.method2050(Statics.field103);
                class246 var44 = Statics.field103;
                Statics.field3298 = var44;
                Statics.field1984 = new class100();
                class246 var45 = Statics.field103;
                class246 var46 = Statics.field2718;
                class246 var47 = Statics.field1152;
                Statics.field3325 = var45;
                Statics.field3323 = var46;
                Statics.field3640 = var47;
                class246 var48 = Statics.field103;
                class246 var49 = Statics.field2718;
                Statics.field3274 = var48;
                Statics.field3837 = var49;
                class246 var50 = Statics.field103;
                class246 var51 = Statics.field2718;
                Statics.field3226 = var51;
                if (var50.method3874()) {
                    Statics.field3553 = var50.method3891(35);
                    Statics.field3220 = new class252[Statics.field3553];
                    for (int var52 = 0; var52 < Statics.field3553; var52++) {
                        byte[] var53 = var50.method3869(35, var52);
                        Statics.field3220[var52] = new class252(var52);
                        if (var53 != null) {
                            Statics.field3220[var52].method4080(new class310(var53));
                            Statics.field3220[var52].method4074();
                        }
                    }
                }
                class95.field1198 = class234.field2782;
                class95.field1199 = 60;
                field708 = 80;
            } else {
                class95.field1198 = class234.field2781 + Statics.field103.method3986() + "%";
                class95.field1199 = 60;
            }
        } else if (field708 == 80) {
            int var54 = 0;
            if (Statics.field1326 == null) {
                Statics.field1326 = class336.method3441(Statics.field2718, Statics.field36.field3817, 0);
            } else {
                var54++;
            }
            if (Statics.field111 == null) {
                Statics.field111 = class336.method3441(Statics.field2718, Statics.field36.field3825, 0);
            } else {
                var54++;
            }
            if (Statics.field2010 == null) {
                class246 var55 = Statics.field2718;
                int var56 = Statics.field36.field3815;
                class334[] var57;
                if (class336.method3218(var55, var56, 0)) {
                    var57 = class336.method3843();
                } else {
                    var57 = null;
                }
                Statics.field2010 = var57;
            } else {
                var54++;
            }
            if (Statics.field407 == null) {
                Statics.field407 = class336.method3368(Statics.field2718, Statics.field36.field3816, 0);
            } else {
                var54++;
            }
            if (Statics.field1355 == null) {
                Statics.field1355 = class336.method3368(Statics.field2718, Statics.field36.field3818, 0);
            } else {
                var54++;
            }
            if (Statics.field27 == null) {
                Statics.field27 = class336.method3368(Statics.field2718, Statics.field36.field3819, 0);
            } else {
                var54++;
            }
            if (Statics.field374 == null) {
                Statics.field374 = class336.method3368(Statics.field2718, Statics.field36.field3820, 0);
            } else {
                var54++;
            }
            if (Statics.field3651 == null) {
                Statics.field3651 = class336.method3368(Statics.field2718, Statics.field36.field3821, 0);
            } else {
                var54++;
            }
            if (Statics.field3206 == null) {
                Statics.field3206 = class336.method3368(Statics.field2718, Statics.field36.field3822, 0);
            } else {
                var54++;
            }
            if (Statics.field2752 == null) {
                class246 var58 = Statics.field2718;
                int var59 = Statics.field36.field3823;
                class334[] var60;
                if (class336.method3218(var58, var59, 0)) {
                    var60 = class336.method3843();
                } else {
                    var60 = null;
                }
                Statics.field2752 = var60;
            } else {
                var54++;
            }
            if (Statics.field307 == null) {
                class246 var61 = Statics.field2718;
                int var62 = Statics.field36.field3824;
                class334[] var63;
                if (class336.method3218(var61, var62, 0)) {
                    var63 = class336.method3843();
                } else {
                    var63 = null;
                }
                Statics.field307 = var63;
            } else {
                var54++;
            }
            if (var54 < 11) {
                class95.field1198 = class234.field2783 + var54 * 100 / 12 + "%";
                class95.field1199 = 70;
            } else {
                Statics.field3691 = Statics.field307;
                Statics.field111.method5724();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2010[0].method5702(var64 + var67, var65 + var67, var66 + var67);
                class95.field1198 = class234.field2952;
                class95.field1199 = 70;
                field708 = 90;
            }
        } else if (field708 == 90) {
            if (Statics.field1264.method3874()) {
                Statics.field315 = new class129(Statics.field1264, Statics.field2718, 20, 0.8D, field685 ? 64 : 128);
                class140.method2867(Statics.field315);
                class140.method2837(0.8D);
                field708 = 100;
            } else {
                class95.field1198 = class234.field2855 + "0%";
                class95.field1199 = 90;
            }
        } else if (field708 == 100) {
            int var68 = Statics.field315.method2588();
            if (var68 < 100) {
                class95.field1198 = class234.field2855 + var68 + "%";
                class95.field1199 = 90;
            } else {
                class95.field1198 = class234.field2786;
                class95.field1199 = 90;
                field708 = 110;
            }
        } else if (field708 == 110) {
            Statics.field2435 = new class73();
            Statics.field2711.method3257(Statics.field2435, 10);
            class95.field1198 = class234.field2787;
            class95.field1199 = 92;
            field708 = 120;
        } else if (field708 == 120) {
            if (Statics.field2544.method3886("huffman", "")) {
                class219 var69 = new class219(Statics.field2544.method3868("huffman", ""));
                Statics.field2514 = var69;
                class95.field1198 = class234.field3048;
                class95.field1199 = 94;
                field708 = 130;
            } else {
                class95.field1198 = class234.field3046 + "%";
                class95.field1199 = 94;
            }
        } else if (field708 == 130) {
            if (!Statics.field271.method3874()) {
                class95.field1198 = class234.field2771 + Statics.field271.method3986() * 4 / 5 + "%";
                class95.field1199 = 96;
            } else if (!Statics.field312.method3874()) {
                class95.field1198 = class234.field2771 + (80 + Statics.field312.method3986() / 6) + "%";
                class95.field1199 = 96;
            } else if (Statics.field1152.method3874()) {
                class95.field1198 = class234.field2791;
                class95.field1199 = 98;
                field708 = 140;
            } else {
                class95.field1198 = class234.field2771 + (96 + Statics.field1152.method3986() / 50) + "%";
                class95.field1199 = 96;
            }
        } else if (field708 == 140) {
            class95.field1199 = 100;
            if (Statics.field3556.method3890(class45.field340.field345)) {
                if (Statics.field122 == null) {
                    Statics.field122 = new class343();
                    Statics.field122.method5921(Statics.field3556, Statics.field1988, Statics.field145, Statics.field2046, field732, Statics.field2010);
                }
                class95.field1198 = class234.field3008;
                field708 = 150;
            } else {
                class95.field1198 = class234.field2792 + Statics.field3556.method3906(class45.field340.field345) / 10 + "%";
            }
        } else if (field708 == 150) {
            method1137(10);
        }
    }

    @ObfuscatedName("cl.fo(IZZZB)Lih;")
    public static class246 method2149(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class318 var4 = null;
        if (class177.field2052 != null) {
            var4 = new class318(arg0, class177.field2052, Statics.field2346[arg0], 1000000);
        }
        return new class246(var4, Statics.field296, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fi(I)V")
    public final void method1248() {
        class315 var1 = field762.method2169();
        class309 var2 = field762.field1338;
        try {
            if (field712 == 0) {
                if (Statics.field533 == null && (field718.method2016() || field713 > 250)) {
                    Statics.field533 = field718.method2017();
                    field718.method2019();
                    field718 = null;
                }
                if (Statics.field533 != null) {
                    if (var1 != null) {
                        var1.method3285();
                        var1 = null;
                    }
                    Statics.field332 = null;
                    field729 = false;
                    field713 = 0;
                    field712 = 1;
                }
            }
            if (field712 == 1) {
                if (Statics.field332 == null) {
                    Statics.field332 = Statics.field2711.method3256(Statics.field1306, Statics.field3575);
                }
                if (Statics.field332.field2034 == 2) {
                    throw new IOException();
                }
                if (Statics.field332.field2034 == 1) {
                    if (field730) {
                        var1 = class315.method5357((Socket) Statics.field332.field2031, 40000, 5000);
                    } else {
                        var1 = new class181((Socket) Statics.field332.field2031, Statics.field2711, 5000);
                    }
                    field762.method2164(var1);
                    Statics.field332 = null;
                    field712 = 2;
                }
            }
            if (field712 == 2) {
                field762.method2155();
                class197 var3 = class197.method3198();
                var3.field2348 = null;
                var3.field2338 = 0;
                var3.field2339 = new class309(5000);
                var3.field2339.method5121(class194.field2316.field2317);
                field762.method2171(var3);
                field762.method2156();
                var2.field3711 = 0;
                field712 = 3;
            }
            if (field712 == 3) {
                if (Statics.field368 != null) {
                    Statics.field368.method2329();
                }
                if (Statics.field212 != null) {
                    Statics.field212.method2329();
                }
                boolean var6 = true;
                if (field730 && !var1.method3289(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3284();
                    if (Statics.field368 != null) {
                        Statics.field368.method2329();
                    }
                    if (Statics.field212 != null) {
                        Statics.field212.method2329();
                    }
                    if (var7 != 0) {
                        method3755(var7);
                        return;
                    }
                    var2.field3711 = 0;
                    field712 = 4;
                }
            }
            if (field712 == 4) {
                if (var2.field3711 < 8) {
                    int var8 = var1.method3290();
                    if (var8 > 8 - var2.field3711) {
                        var8 = 8 - var2.field3711;
                    }
                    if (var8 > 0) {
                        var1.method3296(var2.field3710, var2.field3711, var8);
                        var2.field3711 += var8;
                    }
                }
                if (var2.field3711 == 8) {
                    var2.field3711 = 0;
                    Statics.field1320 = var2.method5143();
                    field712 = 5;
                }
            }
            if (field712 == 5) {
                field762.field1338.field3711 = 0;
                field762.method2155();
                class309 var9 = new class309(500);
                int[] var10 = new int[] { Statics.field533.nextInt(), Statics.field533.nextInt(), Statics.field533.nextInt(), Statics.field533.nextInt() };
                var9.field3711 = 0;
                var9.method5121(1);
                var9.method5279(var10[0]);
                var9.method5279(var10[1]);
                var9.method5279(var10[2]);
                var9.method5279(var10[3]);
                var9.method5119(Statics.field1320);
                if (field688 == 40) {
                    var9.method5279(Statics.field1346[0]);
                    var9.method5279(Statics.field1346[1]);
                    var9.method5279(Statics.field1346[2]);
                    var9.method5279(Statics.field1346[3]);
                } else {
                    var9.method5121(field716.method26());
                    switch(field716.field2015) {
                        case 0:
                            LinkedHashMap var12 = Statics.field677.field1083;
                            String var13 = class95.field1221;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5279((Integer) var12.get(var15));
                            break;
                        case 1:
                        case 2:
                            var9.method5178(Statics.field1142);
                            var9.field3711++;
                            break;
                        case 3:
                            var9.field3711 += 4;
                    }
                    var9.method5121(class323.field3826.method26());
                    var9.method5217(class95.field1211);
                }
                var9.method5160(class93.field1182, class93.field1179);
                Statics.field1346 = var10;
                class197 var18 = class197.method3198();
                var18.field2348 = null;
                var18.field2338 = 0;
                var18.field2339 = new class309(5000);
                var18.field2339.field3711 = 0;
                if (field688 == 40) {
                    var18.field2339.method5121(class194.field2314.field2317);
                } else {
                    var18.field2339.method5121(class194.field2318.field2317);
                }
                var18.field2339.method5122(0);
                int var21 = var18.field2339.field3711;
                var18.field2339.method5279(189);
                var18.field2339.method5279(1);
                var18.field2339.method5121(field686);
                var18.field2339.method5186(var9.field3710, 0, var9.field3711);
                int var22 = var18.field2339.field3711;
                var18.field2339.method5217(class95.field1221);
                var18.field2339.method5121((field895 ? 1 : 0) << 1 | (field685 ? 1 : 0));
                var18.field2339.method5122(Statics.field278);
                var18.field2339.method5122(Statics.field2526);
                class309 var23 = var18.field2339;
                if (field721 == null) {
                    byte[] var24 = class177.method1935();
                    var23.method5186(var24, 0, var24.length);
                } else {
                    var23.method5186(field721, 0, field721.length);
                }
                var18.field2339.method5217(Statics.field138);
                var18.field2339.method5279(Statics.field3272);
                class310 var25 = new class310(Statics.field1288.method5901());
                Statics.field1288.method5900(var25);
                var18.field2339.method5186(var25.field3710, 0, var25.field3710.length);
                var18.field2339.method5121(field686);
                var18.field2339.method5279(0);
                var18.field2339.method5279(Statics.field3113.field3142);
                var18.field2339.method5279(Statics.field2500.field3142);
                var18.field2339.method5279(Statics.field103.field3142);
                var18.field2339.method5279(Statics.field271.field3142);
                var18.field2339.method5279(Statics.field3665.field3142);
                var18.field2339.method5279(Statics.field163.field3142);
                var18.field2339.method5279(Statics.field329.field3142);
                var18.field2339.method5279(Statics.field334.field3142);
                var18.field2339.method5279(Statics.field2718.field3142);
                var18.field2339.method5279(Statics.field1264.field3142);
                var18.field2339.method5279(Statics.field2544.field3142);
                var18.field2339.method5279(Statics.field294.field3142);
                var18.field2339.method5279(Statics.field312.field3142);
                var18.field2339.method5279(Statics.field1152.field3142);
                var18.field2339.method5279(Statics.field2550.field3142);
                var18.field2339.method5279(Statics.field114.field3142);
                var18.field2339.method5279(0);
                var18.field2339.method5279(Statics.field1172.field3142);
                var18.field2339.method5279(Statics.field1988.field3142);
                var18.field2339.method5279(Statics.field3556.field3142);
                var18.field2339.method5279(Statics.field145.field3142);
                var18.field2339.method5158(var10, var22, var18.field2339.field3711);
                var18.field2339.method5316(var18.field2339.field3711 - var21);
                field762.method2171(var18);
                field762.method2156();
                field762.field1341 = new class338(var10);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var10[var27] + 50;
                }
                var2.method5115(var26);
                field712 = 6;
            }
            if (field712 == 6 && var1.method3290() > 0) {
                int var28 = var1.method3284();
                if (var28 == 21 && field688 == 20) {
                    field712 = 12;
                } else if (var28 == 2) {
                    field712 = 14;
                } else if (var28 == 15 && field688 == 40) {
                    field762.field1334 = -1;
                    field712 = 19;
                } else if (var28 == 64) {
                    field712 = 10;
                } else if (var28 == 23 && field714 < 1) {
                    field714++;
                    field712 = 0;
                } else if (var28 == 29) {
                    field712 = 17;
                } else if (var28 == 69) {
                    field712 = 7;
                } else {
                    method3755(var28);
                    return;
                }
            }
            if (field712 == 7 && var1.method3290() >= 2) {
                var1.method3296(var2.field3710, 0, 2);
                var2.field3711 = 0;
                Statics.field2027 = var2.method5139();
                field712 = 8;
            }
            if (field712 == 8 && var1.method3290() >= Statics.field2027) {
                var2.field3711 = 0;
                var1.method3296(var2.field3710, var2.field3711, Statics.field2027);
                class8[] var29 = new class8[] { class8.field35 };
                class8 var30 = var29[var2.method5137()];
                try {
                    switch(var30.field31) {
                        case 0:
                            class6 var31 = new class6();
                            this.field720 = new class10(var2, var31);
                            field712 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var64) {
                    method3755(22);
                    return;
                }
            }
            if (field712 == 9 && this.field720.method84()) {
                this.field719 = this.field720.method86();
                this.field720.method83();
                this.field720 = null;
                if (this.field719 == null) {
                    method3755(22);
                    return;
                }
                field762.method2155();
                class197 var34 = class197.method3198();
                var34.field2348 = null;
                var34.field2338 = 0;
                var34.field2339 = new class309(5000);
                var34.field2339.method5121(class194.field2315.field2317);
                var34.field2339.method5122(this.field719.field3711);
                var34.field2339.method5352(this.field719);
                field762.method2171(var34);
                field762.method2156();
                this.field719 = null;
                field712 = 6;
            }
            if (field712 == 10 && var1.method3290() > 0) {
                Statics.field408 = var1.method3284();
                field712 = 11;
            }
            if (field712 == 11 && var1.method3290() >= Statics.field408) {
                var1.method3296(var2.field3710, 0, Statics.field408);
                var2.field3711 = 0;
                field712 = 6;
            }
            if (field712 == 12 && var1.method3290() > 0) {
                field715 = (var1.method3284() + 3) * 60;
                field712 = 13;
            }
            if (field712 == 13) {
                field713 = 0;
                class95.method1684(class234.field2799, class234.field2800, field715 / 60 + class234.field2785);
                if (--field715 <= 0) {
                    field712 = 0;
                }
            } else {
                if (field712 == 14 && var1.method3290() >= 1) {
                    Statics.field72 = var1.method3284();
                    field712 = 15;
                }
                if (field712 == 15 && var1.method3290() >= Statics.field72) {
                    boolean var37 = var1.method3284() == 1;
                    var1.method3296(var2.field3710, 0, 4);
                    var2.field3711 = 0;
                    boolean var38 = false;
                    if (var37) {
                        int var39 = var2.method5101() << 24;
                        int var40 = var39 | var2.method5101() << 16;
                        int var41 = var40 | var2.method5101() << 8;
                        int var42 = var41 | var2.method5101();
                        String var43 = class95.field1221;
                        int var44 = var43.length();
                        int var45 = 0;
                        int var46 = 0;
                        while (true) {
                            if (var46 >= var44) {
                                if (Statics.field677.field1083.size() >= 10 && !Statics.field677.field1083.containsKey(var45)) {
                                    Iterator var49 = Statics.field677.field1083.entrySet().iterator();
                                    var49.next();
                                    var49.remove();
                                }
                                Statics.field677.field1083.put(var45, var42);
                                break;
                            }
                            var45 = (var45 << 5) - var45 + var43.charAt(var46);
                            var46++;
                        }
                    }
                    if (field717) {
                        Statics.field677.field1081 = class95.field1221;
                    } else {
                        Statics.field677.field1081 = null;
                    }
                    class83.method437();
                    field850 = var1.method3284();
                    field711 = var1.method3284() == 1;
                    field798 = var1.method3284();
                    field798 <<= 0x8;
                    field798 += var1.method3284();
                    field799 = var1.method3284();
                    var1.method3296(var2.field3710, 0, 1);
                    var2.field3711 = 0;
                    class192[] var50 = class192.method782();
                    int var51 = var2.method5084();
                    if (var51 < 0 || var51 >= var50.length) {
                        throw new IOException(var51 + " " + var2.field3711);
                    }
                    field762.field1333 = var50[var51];
                    field762.field1334 = field762.field1333.field2206;
                    var1.method3296(var2.field3710, 0, 2);
                    var2.field3711 = 0;
                    field762.field1334 = var2.method5139();
                    try {
                        class57.method794(Statics.field319, "zap");
                    } catch (Throwable var63) {
                    }
                    field712 = 16;
                }
                if (field712 != 16) {
                    if (field712 == 17 && var1.method3290() >= 2) {
                        var2.field3711 = 0;
                        var1.method3296(var2.field3710, 0, 2);
                        var2.field3711 = 0;
                        Statics.field34 = var2.method5139();
                        field712 = 18;
                    }
                    if (field712 == 18 && var1.method3290() >= Statics.field34) {
                        var2.field3711 = 0;
                        var1.method3296(var2.field3710, 0, Statics.field34);
                        var2.field3711 = 0;
                        String var53 = var2.method5257();
                        String var54 = var2.method5257();
                        String var55 = var2.method5257();
                        class95.method1684(var53, var54, var55);
                        method1137(10);
                    }
                    if (field712 == 19) {
                        if (field762.field1334 == -1) {
                            if (var1.method3290() < 2) {
                                return;
                            }
                            var1.method3296(var2.field3710, 0, 2);
                            var2.field3711 = 0;
                            field762.field1334 = var2.method5139();
                        }
                        if (var1.method3290() >= field762.field1334) {
                            var1.method3296(var2.field3710, 0, field762.field1334);
                            var2.field3711 = 0;
                            int var56 = field762.field1334;
                            field797.method4651();
                            field762.method2155();
                            field762.field1338.field3711 = 0;
                            field762.field1333 = null;
                            field762.field1335 = null;
                            field762.field1330 = null;
                            field762.field1340 = null;
                            field762.field1334 = 0;
                            field762.field1339 = 0;
                            field918 = 0;
                            method3661();
                            field913 = 0;
                            field911 = 0;
                            for (int var57 = 0; var57 < 2048; var57++) {
                                field791[var57] = null;
                            }
                            Statics.field3718 = null;
                            for (int var58 = 0; var58 < field722.length; var58++) {
                                class89 var59 = field722[var58];
                                if (var59 != null) {
                                    var59.field1000 = -1;
                                    var59.field1001 = false;
                                }
                            }
                            class69.field571 = new class328(32);
                            method1137(30);
                            for (int var60 = 0; var60 < 100; var60++) {
                                field680[var60] = true;
                            }
                            class197 var61 = class197.method3105(class193.field2258, field762.field1341);
                            var61.field2339.method5121(method1171());
                            var61.field2339.method5122(Statics.field278);
                            var61.field2339.method5122(Statics.field2526);
                            field762.method2171(var61);
                            class99.method4839(var2);
                            if (var2.field3711 != var56) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field713++;
                        if (field713 > 2000) {
                            if (field714 < 1) {
                                if (Statics.field3575 == Statics.field158) {
                                    Statics.field3575 = Statics.field121;
                                } else {
                                    Statics.field3575 = Statics.field158;
                                }
                                field714++;
                                field712 = 0;
                            } else {
                                method3755(-3);
                            }
                        }
                    }
                } else if (var1.method3290() >= field762.field1334) {
                    var2.field3711 = 0;
                    var1.method3296(var2.field3710, 0, field762.field1334);
                    field797.method4649();
                    method3642();
                    class99.method4839(var2);
                    Statics.field586 = -1;
                    method3121(false, var2);
                    field762.field1333 = null;
                }
            }
        } catch (IOException var65) {
            if (field714 < 1) {
                if (Statics.field3575 == Statics.field158) {
                    Statics.field3575 = Statics.field121;
                } else {
                    Statics.field3575 = Statics.field158;
                }
                field714++;
                field712 = 0;
            } else {
                method3755(-2);
            }
        }
    }

    @ObfuscatedName("hs.fv(I)V")
    public static void method3642() {
        field767 = 1L;
        Statics.field2435.field621 = 0;
        Statics.field503 = true;
        field695 = true;
        field905 = -1L;
        class106.method247();
        field762.method2155();
        field762.field1338.field3711 = 0;
        field762.field1333 = null;
        field762.field1335 = null;
        field762.field1330 = null;
        field762.field1340 = null;
        field762.field1334 = 0;
        field762.field1339 = 0;
        field918 = 0;
        field803 = 0;
        field890 = 0;
        method3661();
        class64.method3364(0);
        class101.method1930();
        field834 = 0;
        field836 = false;
        field937 = 0;
        field910 = 0;
        field755 = 0;
        Statics.field223 = null;
        field913 = 0;
        field696 = -1;
        field911 = 0;
        field912 = 0;
        field706 = class94.field1186;
        field707 = class94.field1186;
        field723 = 0;
        class99.method1227();
        for (int var0 = 0; var0 < 2048; var0++) {
            field791[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field722[var1] = null;
        }
        field808 = -1;
        field811.method4553();
        field812.method4553();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field809[var2][var3][var4] = null;
                }
            }
        }
        field698 = new class272();
        Statics.field1253.method1828();
        for (int var5 = 0; var5 < Statics.field3205; var5++) {
            class251 var6 = class251.method3836(var5);
            if (var6 != null) {
                class222.field2525[var5] = 0;
                class222.field2527[var5] = 0;
            }
        }
        Statics.field1984.method2058();
        field841 = -1;
        if (field925 != -1) {
            class227.method4222(field925);
        }
        for (class71 var7 = (class71) field842.method5546(); var7 != null; var7 = (class71) field842.method5554()) {
            method581(var7, true);
        }
        field925 = -1;
        field842 = new class328(8);
        field883 = null;
        method3661();
        field945.method3737((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field805[var8] = null;
            field806[var8] = false;
        }
        class69.field571 = new class328(32);
        field702 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field680[var9] = true;
        }
        class197 var10 = class197.method3105(class193.field2258, field762.field1341);
        var10.field2339.method5121(method1171());
        var10.field2339.method5122(Statics.field278);
        var10.field2339.method5122(Statics.field2526);
        field762.method2171(var10);
        Statics.field597 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field949[var11] = new class19();
        }
        Statics.field85 = null;
    }

    @ObfuscatedName("hk.fc(II)V")
    public static void method3755(int arg0) {
        if (arg0 == -3) {
            class95.method1684(class234.field2972, class234.field2803, class234.field2907);
        } else if (arg0 == -2) {
            class95.method1684(class234.field2805, class234.field2806, class234.field2807);
        } else if (arg0 == -1) {
            class95.method1684(class234.field3028, class234.field2996, class234.field2810);
        } else if (arg0 == 3) {
            class95.field1205 = 3;
            class95.field1219 = 1;
        } else if (arg0 == 4) {
            class95.method573(0);
        } else if (arg0 == 5) {
            class95.field1219 = 2;
            class95.method1684(class234.field2846, class234.field2815, class234.field2816);
        } else if (arg0 == 68 || !(field783 || arg0 != 6)) {
            class95.method1684(class234.field2884, class234.field2764, class234.field2819);
        } else if (arg0 == 7) {
            class95.method1684(class234.field3060, class234.field2821, class234.field2822);
        } else if (arg0 == 8) {
            class95.method1684(class234.field2823, class234.field2824, class234.field2985);
        } else if (arg0 == 9) {
            class95.method1684(class234.field2826, class234.field2827, class234.field2828);
        } else if (arg0 == 10) {
            class95.method1684(class234.field2774, class234.field2830, class234.field3058);
        } else if (arg0 == 11) {
            class95.method1684(class234.field2832, class234.field2833, class234.field2834);
        } else if (arg0 == 12) {
            class95.method1684(class234.field2835, class234.field2956, class234.field2820);
        } else if (arg0 == 13) {
            class95.method1684(class234.field2838, class234.field2801, class234.field3009);
        } else if (arg0 == 14) {
            class95.method1684(class234.field2841, class234.field2842, class234.field2843);
        } else if (arg0 == 16) {
            class95.method1684(class234.field2844, class234.field2845, class234.field2763);
        } else if (arg0 == 17) {
            class95.method1684(class234.field2847, class234.field2848, class234.field2918);
        } else if (arg0 == 18) {
            class95.method573(1);
        } else if (arg0 == 19) {
            class95.method1684(class234.field2878, class234.field2854, class234.field2913);
        } else if (arg0 == 20) {
            class95.method1684(class234.field2856, class234.field2857, class234.field2858);
        } else if (arg0 == 22) {
            class95.method1684(class234.field2859, class234.field2757, class234.field2861);
        } else if (arg0 == 23) {
            class95.method1684(class234.field2941, class234.field2790, class234.field2864);
        } else if (arg0 == 24) {
            class95.method1684(class234.field2849, class234.field2866, class234.field2825);
        } else if (arg0 == 25) {
            class95.method1684(class234.field2954, class234.field2869, class234.field2870);
        } else if (arg0 == 26) {
            class95.method1684(class234.field2871, class234.field2872, class234.field2933);
        } else if (arg0 == 27) {
            class95.method1684(class234.field2874, class234.field2875, class234.field2876);
        } else if (arg0 == 31) {
            class95.method1684(class234.field2883, class234.field2779, class234.field2885);
        } else if (arg0 == 32) {
            class95.method1684(class234.field2886, class234.field2887, class234.field2888);
        } else if (arg0 == 37) {
            class95.method1684(class234.field2889, class234.field2892, class234.field2769);
        } else if (arg0 == 38) {
            class95.method1684(class234.field3029, class234.field2893, class234.field2894);
        } else if (arg0 == 55) {
            class95.field1205 = 8;
        } else if (arg0 == 56) {
            class95.method1684(class234.field2789, class234.field2900, class234.field2901);
            method1137(11);
            return;
        } else if (arg0 == 57) {
            class95.method1684(class234.field2902, class234.field2903, class234.field2904);
            method1137(11);
            return;
        } else if (arg0 == 61) {
            class95.field1205 = 7;
        } else {
            class95.method1684(class234.field2914, class234.field2759, class234.field2873);
        }
        method1137(10);
    }

    @ObfuscatedName("hb.fp(I)V")
    public static final void method3673() {
        field762.method2159();
        method125();
        Statics.field61.method2944();
        for (int var0 = 0; var0 < 4; var0++) {
            field738[var0].method3320();
        }
        System.gc();
        class207.field2407 = 1;
        Statics.field2408 = null;
        Statics.field2409 = -1;
        Statics.field2414 = -1;
        Statics.field2515 = 0;
        Statics.field107 = false;
        Statics.field1188 = 2;
        field915 = -1;
        field916 = false;
        class85.method4838();
        method1137(10);
    }

    @ObfuscatedName("bi.fg(II)V")
    public static final void method1213(int arg0) {
        method3673();
        switch(arg0) {
            case 1:
                class95.method2192();
                break;
            case 2:
                class95.field1205 = 24;
                class95.method1684(class234.field2993, class234.field2788, class234.field2995);
        }
    }

    @ObfuscatedName("g.fx(B)V")
    public static final void method125() {
        class268.method82();
        class255.field3259.method3141();
        class256.method3222();
        class264.method1659();
        class267.method4642();
        class265.method4166();
        class269.method1964();
        class254.field3243.method3141();
        class254.field3240.method3141();
        class259.method3632();
        class251.field3207.method3141();
        class263.field3324.method3141();
        class263.field3322.method3141();
        class263.field3336.method3141();
        class257.field3280.method3141();
        class257.field3275.method3141();
        class261.method3367();
        class260.field3296.method3141();
        class252.method3235();
        class224.method3681();
        class227.field2562.method3141();
        class227.field2563.method3141();
        class227.field2564.method3141();
        class227.field2565.method3141();
        ((class129) Statics.field1782).method2594();
        class102.field1308.method3141();
        Statics.field3113.method3918();
        Statics.field2500.method3918();
        Statics.field271.method3918();
        Statics.field3665.method3918();
        Statics.field163.method3918();
        Statics.field329.method3918();
        Statics.field334.method3918();
        Statics.field2718.method3918();
        Statics.field1264.method3918();
        Statics.field2544.method3918();
        Statics.field294.method3918();
        Statics.field312.method3918();
    }

    @ObfuscatedName("en.fu(S)V")
    public static final void method2829() {
        if (field803 > 0) {
            method3673();
        } else {
            field797.method4654();
            method1137(40);
            Statics.field1961 = field762.method2169();
            field762.method2160();
        }
    }

    @ObfuscatedName("cs.ft(ZI)V")
    public static final void method1937(boolean arg0) {
        if (arg0) {
            field716 = class95.field1215 ? class170.field2008 : class170.field2007;
            return;
        }
        LinkedHashMap var1 = Statics.field677.field1083;
        String var2 = class95.field1221;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field716 = var1.containsKey(var4) ? class170.field2013 : class170.field2009;
    }

    @ObfuscatedName("client.fj(I)V")
    public final void method1249() {
        if (field918 > 1) {
            field918--;
        }
        if (field803 > 0) {
            field803--;
        }
        if (field729) {
            field729 = false;
            method2829();
            return;
        }
        if (!field817) {
            method2696();
        }
        for (int var1 = 0; var1 < 100 && this.method1350(field762); var1++) {
        }
        if (field688 != 30) {
            return;
        }
        while (true) {
            class107 var2 = (class107) class106.field1342.method4488();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field797.field3582) {
                    class197 var6 = class197.method3105(class193.field2271, field762.field1341);
                    var6.field2339.method5121(0);
                    int var7 = var6.field2339.field3711;
                    field797.method4652(var6.field2339);
                    var6.field2339.method5246(var6.field2339.field3711 - var7);
                    field762.method2171(var6);
                    field797.method4650();
                }
                Object var8 = Statics.field2435.field615;
                synchronized (Statics.field2435.field615) {
                    if (!field750) {
                        Statics.field2435.field621 = 0;
                    } else if (class64.field525 != 0 || Statics.field2435.field621 >= 40) {
                        class197 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field2435.field621 && (var9 == null || var9.field2339.field3711 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field2435.field618[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field2435.field622[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field692 != var16 || field693 != var15) {
                                if (var9 == null) {
                                    var9 = class197.method3105(class193.field2282, field762.field1341);
                                    var9.field2339.method5121(0);
                                    var10 = var9.field2339.field3711;
                                    var9.field2339.field3711 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field876 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field692;
                                    var18 = var15 - field693;
                                    var19 = (int) ((Statics.field2435.field619[var14] - field876) / 20L);
                                    var12 = (int) ((Statics.field2435.field619[var14] - field876) % 20L + (long) var12);
                                }
                                field692 = var16;
                                field693 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2339.method5122((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2339.method5121(var19 + 128);
                                    var9.field2339.method5122((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2339.method5121(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2339.method5279(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2339.method5279(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2339.method5122((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2339.method5279(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2339.method5279(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field876 = Statics.field2435.field619[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2339.method5246(var9.field2339.field3711 - var10);
                            int var20 = var9.field2339.field3711;
                            var9.field2339.field3711 = var10;
                            var9.field2339.method5121(var12 / var13);
                            var9.field2339.method5121(var12 % var13);
                            var9.field2339.field3711 = var20;
                            field762.method2171(var9);
                        }
                        if (var11 >= Statics.field2435.field621) {
                            Statics.field2435.field621 = 0;
                        } else {
                            Statics.field2435.field621 -= var11;
                            System.arraycopy(Statics.field2435.field622, var11, Statics.field2435.field622, 0, Statics.field2435.field621);
                            System.arraycopy(Statics.field2435.field618, var11, Statics.field2435.field618, 0, Statics.field2435.field621);
                            System.arraycopy(Statics.field2435.field619, var11, Statics.field2435.field619, 0, Statics.field2435.field621);
                        }
                    }
                }
                if (class64.field525 == 1 || !Statics.field2507 && class64.field525 == 4 || class64.field525 == 2) {
                    long var22 = class64.field528 - field767 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field767 = class64.field528 * -1L;
                    int var24 = class64.field521;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field2526) {
                        var24 = Statics.field2526;
                    }
                    int var25 = class64.field526;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field278) {
                        var25 = Statics.field278;
                    }
                    int var26 = (int) var22;
                    class197 var27 = class197.method3105(class193.field2210, field762.field1341);
                    var27.field2339.method5122((var26 << 1) + (class64.field525 == 2 ? 1 : 0));
                    var27.field2339.method5122(var25);
                    var27.field2339.method5122(var24);
                    field762.method2171(var27);
                }
                if (class55.field418 > 0) {
                    class197 var28 = class197.method3105(class193.field2211, field762.field1341);
                    var28.field2339.method5122(0);
                    int var29 = var28.field2339.field3711;
                    long var30 = Statics.method3668();
                    for (int var32 = 0; var32 < class55.field418; var32++) {
                        long var33 = var30 - field905;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field905 = var30;
                        var28.field2339.method5179((int) var33);
                        var28.field2339.method5121(class55.field433[var32]);
                    }
                    var28.field2339.method5316(var28.field2339.field3711 - var29);
                    field762.method2171(var28);
                }
                if (field765 > 0) {
                    field765--;
                }
                if (class55.field427[96] || class55.field427[97] || class55.field427[98] || class55.field427[99]) {
                    field766 = true;
                }
                if (field766 && field765 <= 0) {
                    field765 = 20;
                    field766 = false;
                    class197 var35 = class197.method3105(class193.field2221, field762.field1341);
                    var35.field2339.method5174(field910);
                    var35.field2339.method5174(field825);
                    field762.method2171(var35);
                }
                if (Statics.field503 && !field695) {
                    field695 = true;
                    class197 var36 = class197.method3105(class193.field2262, field762.field1341);
                    var36.field2339.method5121(1);
                    field762.method2171(var36);
                }
                if (!Statics.field503 && field695) {
                    field695 = false;
                    class197 var37 = class197.method3105(class193.field2262, field762.field1341);
                    var37.field2339.method5121(0);
                    field762.method2171(var37);
                }
                if (Statics.field122 != null) {
                    Statics.field122.method6013();
                }
                if (Statics.field3583) {
                    if (Statics.field597 != null) {
                        Statics.field597.method4754();
                    }
                    method465();
                    Statics.field3583 = false;
                }
                method4051();
                if (field688 != 30) {
                    return;
                }
                for (class78 var38 = (class78) field698.method4559(); var38 != null; var38 = (class78) field698.method4577()) {
                    if (var38.field970 > 0) {
                        var38.field970--;
                    }
                    if (var38.field970 != 0) {
                        if (var38.field966 > 0) {
                            var38.field966--;
                        }
                        if (var38.field966 == 0 && var38.field961 >= 1 && var38.field962 >= 1 && var38.field961 <= 102 && var38.field962 <= 102 && (var38.field965 < 0 || class65.method3278(var38.field965, var38.field968))) {
                            method2390(var38.field963, var38.field960, var38.field961, var38.field962, var38.field965, var38.field967, var38.field968);
                            var38.field966 = -1;
                            if (var38.field965 == var38.field959 && var38.field959 == -1) {
                                var38.method3355();
                            } else if (var38.field965 == var38.field959 && var38.field969 == var38.field967 && var38.field968 == var38.field964) {
                                var38.method3355();
                            }
                        }
                    } else if (var38.field959 < 0 || class65.method3278(var38.field959, var38.field964)) {
                        method2390(var38.field963, var38.field960, var38.field961, var38.field962, var38.field959, var38.field969, var38.field964);
                        var38.method3355();
                    }
                }
                method222();
                field762.field1339++;
                if (field762.field1339 > 750) {
                    method2829();
                    return;
                }
                int var39 = class99.field1279;
                int[] var40 = class99.field1272;
                for (int var41 = 0; var41 < var39; var41++) {
                    class76 var42 = field791[var40[var41]];
                    if (var42 != null) {
                        method577(var42, 1);
                    }
                }
                for (int var43 = 0; var43 < field723; var43++) {
                    int var44 = field724[var43];
                    class89 var45 = field722[var44];
                    if (var45 != null) {
                        method577(var45, var45.field1149.field3471);
                    }
                }
                method558();
                field742++;
                if (field785 != 0) {
                    field784 += 20;
                    if (field784 >= 400) {
                        field785 = 0;
                    }
                }
                if (Statics.field308 != null) {
                    field787++;
                    if (field787 >= 15) {
                        method1117(Statics.field308);
                        Statics.field308 = null;
                    }
                }
                class227 var46 = Statics.field53;
                class227 var47 = Statics.field2369;
                Statics.field53 = null;
                Statics.field2369 = null;
                field858 = null;
                field862 = false;
                field733 = false;
                field902 = 0;
                while (class55.method225() && field902 < 128) {
                    if (field850 >= 2 && class55.field427[82] && Statics.field17 == 66) {
                        String var48 = "";
                        Iterator var49 = class101.field1292.iterator();
                        while (var49.hasNext()) {
                            class74 var50 = (class74) var49.next();
                            var48 = var48 + var50.field637 + ':' + var50.field636 + '\n';
                        }
                        Statics.field319.method865(var48);
                    } else if (field755 != 1 || Statics.field2532 <= 0) {
                        field873[field902] = Statics.field17;
                        field903[field902] = Statics.field2532;
                        field902++;
                    }
                }
                boolean var53 = field850 >= 2;
                if (var53 && class55.field427[82] && class55.field427[81] && field879 != 0) {
                    int var54 = Statics.field3718.field667 - field879;
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 3) {
                        var54 = 3;
                    }
                    if (Statics.field3718.field667 != var54) {
                        Statics.method118(Statics.field591 + Statics.field3718.field1029[0], Statics.field1153 + Statics.field3718.field1030[0], var54, false);
                    }
                    field879 = 0;
                }
                if (field925 != -1) {
                    method21(field925, 0, 0, Statics.field278, Statics.field2526, 0, 0);
                }
                field866++;
                while (true) {
                    class72 var55;
                    class227 var56;
                    class227 var57;
                    do {
                        var55 = (class72) field728.method4557();
                        if (var55 == null) {
                            while (true) {
                                class72 var58;
                                class227 var59;
                                class227 var60;
                                do {
                                    var58 = (class72) field920.method4557();
                                    if (var58 == null) {
                                        while (true) {
                                            class72 var61;
                                            class227 var62;
                                            class227 var63;
                                            do {
                                                var61 = (class72) field788.method4557();
                                                if (var61 == null) {
                                                    this.method1253();
                                                    method436();
                                                    if (field854 != null) {
                                                        this.method1258();
                                                    }
                                                    if (Statics.field3083 != null) {
                                                        method1117(Statics.field3083);
                                                        field794++;
                                                        if (class64.field522 == 0) {
                                                            if (field888) {
                                                                if (Statics.field3083 == Statics.field2107 && field818 != field792) {
                                                                    class227 var64 = Statics.field3083;
                                                                    byte var65 = 0;
                                                                    if (field846 == 1 && var64.field2572 == 206) {
                                                                        var65 = 1;
                                                                    }
                                                                    if (var64.field2672[field792] <= 0) {
                                                                        var65 = 0;
                                                                    }
                                                                    if (class228.method3252(method1127(var64))) {
                                                                        int var66 = field818;
                                                                        int var67 = field792;
                                                                        var64.field2672[var67] = var64.field2672[var66];
                                                                        var64.field2693[var67] = var64.field2693[var66];
                                                                        var64.field2672[var66] = -1;
                                                                        var64.field2693[var66] = 0;
                                                                    } else if (var65 == 1) {
                                                                        int var68 = field818;
                                                                        int var69 = field792;
                                                                        while (var68 != var69) {
                                                                            if (var68 > var69) {
                                                                                var64.method3770(var68 - 1, var68);
                                                                                var68--;
                                                                            } else if (var68 < var69) {
                                                                                var64.method3770(var68 + 1, var68);
                                                                                var68++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var64.method3770(field792, field818);
                                                                    }
                                                                    class197 var70 = class197.method3105(class193.field2299, field762.field1341);
                                                                    var70.field2339.method5174(field792);
                                                                    var70.field2339.method5173(field818);
                                                                    var70.field2339.method5121(var65);
                                                                    var70.field2339.method5181(Statics.field3083.field2568);
                                                                    field762.method2171(var70);
                                                                }
                                                            } else if (this.method1623()) {
                                                                this.method1529(field790, field697);
                                                            } else if (field694 > 0) {
                                                                int var71 = field790;
                                                                int var72 = field697;
                                                                class92 var73 = Statics.field339;
                                                                method3664(var73.field1177, var73.field1173, var73.field1174, var73.field1175, var73.field1176, var73.field1176, var71, var72);
                                                                Statics.field339 = null;
                                                            }
                                                            field787 = 10;
                                                            class64.field525 = 0;
                                                            Statics.field3083 = null;
                                                        } else if (field794 >= 5 && (class64.field518 > field790 + 5 || class64.field518 < field790 - 5 || class64.field519 > field697 + 5 || class64.field519 < field697 - 5)) {
                                                            field888 = true;
                                                        }
                                                    }
                                                    if (class143.method2951()) {
                                                        int var74 = class143.field1846;
                                                        int var75 = class143.field1847;
                                                        class197 var76 = class197.method3105(class193.field2249, field762.field1341);
                                                        var76.field2339.method5121(5);
                                                        var76.field2339.method5122(Statics.field591 + var74);
                                                        var76.field2339.method5121(class55.field427[82] ? (class55.field427[81] ? 2 : 1) : 0);
                                                        var76.field2339.method5122(Statics.field1153 + var75);
                                                        field762.method2171(var76);
                                                        class143.method3083();
                                                        field923 = class64.field526;
                                                        field689 = class64.field521;
                                                        field785 = 1;
                                                        field784 = 0;
                                                        field911 = var74;
                                                        field912 = var75;
                                                    }
                                                    if (Statics.field53 != var46) {
                                                        if (var46 != null) {
                                                            method1117(var46);
                                                        }
                                                        if (Statics.field53 != null) {
                                                            method1117(Statics.field53);
                                                        }
                                                    }
                                                    if (Statics.field2369 != var47 && field872 == field833) {
                                                        if (var47 != null) {
                                                            method1117(var47);
                                                        }
                                                        if (Statics.field2369 != null) {
                                                            method1117(Statics.field2369);
                                                        }
                                                    }
                                                    if (Statics.field2369 == null) {
                                                        if (field872 > 0) {
                                                            field872--;
                                                        }
                                                    } else if (field872 < field833) {
                                                        field872++;
                                                        if (field872 == field833) {
                                                            method1117(Statics.field2369);
                                                        }
                                                    }
                                                    Statics.method2697();
                                                    if (field889) {
                                                        int var77 = Statics.field1146 * 128 + 64;
                                                        int var78 = Statics.field218 * 128 + 64;
                                                        int var79 = method4641(var77, var78, Statics.field611) - Statics.field21;
                                                        if (Statics.field221 < var77) {
                                                            Statics.field221 += Statics.field3127 * (var77 - Statics.field221) / 1000 + Statics.field65;
                                                            if (Statics.field221 > var77) {
                                                                Statics.field221 = var77;
                                                            }
                                                        }
                                                        if (Statics.field221 > var77) {
                                                            Statics.field221 -= Statics.field3127 * (Statics.field221 - var77) / 1000 + Statics.field65;
                                                            if (Statics.field221 < var77) {
                                                                Statics.field221 = var77;
                                                            }
                                                        }
                                                        if (Statics.field64 < var79) {
                                                            Statics.field64 += Statics.field3127 * (var79 - Statics.field64) / 1000 + Statics.field65;
                                                            if (Statics.field64 > var79) {
                                                                Statics.field64 = var79;
                                                            }
                                                        }
                                                        if (Statics.field64 > var79) {
                                                            Statics.field64 -= Statics.field3127 * (Statics.field64 - var79) / 1000 + Statics.field65;
                                                            if (Statics.field64 < var79) {
                                                                Statics.field64 = var79;
                                                            }
                                                        }
                                                        if (Statics.field2373 < var78) {
                                                            Statics.field2373 += Statics.field3127 * (var78 - Statics.field2373) / 1000 + Statics.field65;
                                                            if (Statics.field2373 > var78) {
                                                                Statics.field2373 = var78;
                                                            }
                                                        }
                                                        if (Statics.field2373 > var78) {
                                                            Statics.field2373 -= Statics.field3127 * (Statics.field2373 - var78) / 1000 + Statics.field65;
                                                            if (Statics.field2373 < var78) {
                                                                Statics.field2373 = var78;
                                                            }
                                                        }
                                                        int var80 = Statics.field926 * 128 + 64;
                                                        int var81 = Statics.field2760 * 128 + 64;
                                                        int var82 = method4641(var80, var81, Statics.field611) - Statics.field1550;
                                                        int var83 = var80 - Statics.field221;
                                                        int var84 = var82 - Statics.field64;
                                                        int var85 = var81 - Statics.field2373;
                                                        int var86 = (int) Math.sqrt((double) (var83 * var83 + var85 * var85));
                                                        int var87 = (int) (Math.atan2((double) var84, (double) var86) * 325.949D) & 0x7FF;
                                                        int var88 = (int) (Math.atan2((double) var83, (double) var85) * -325.949D) & 0x7FF;
                                                        if (var87 < 128) {
                                                            var87 = 128;
                                                        }
                                                        if (var87 > 383) {
                                                            var87 = 383;
                                                        }
                                                        if (Statics.field639 < var87) {
                                                            Statics.field639 += Statics.field1281 * (var87 - Statics.field639) / 1000 + Statics.field3627;
                                                            if (Statics.field639 > var87) {
                                                                Statics.field639 = var87;
                                                            }
                                                        }
                                                        if (Statics.field639 > var87) {
                                                            Statics.field639 -= Statics.field1281 * (Statics.field639 - var87) / 1000 + Statics.field3627;
                                                            if (Statics.field639 < var87) {
                                                                Statics.field639 = var87;
                                                            }
                                                        }
                                                        int var89 = var88 - Statics.field231;
                                                        if (var89 > 1024) {
                                                            var89 -= 2048;
                                                        }
                                                        if (var89 < -1024) {
                                                            var89 += 2048;
                                                        }
                                                        if (var89 > 0) {
                                                            Statics.field231 += Statics.field1281 * var89 / 1000 + Statics.field3627;
                                                            Statics.field231 &= 0x7FF;
                                                        }
                                                        if (var89 < 0) {
                                                            Statics.field231 -= Statics.field1281 * -var89 / 1000 + Statics.field3627;
                                                            Statics.field231 &= 0x7FF;
                                                        }
                                                        int var90 = var88 - Statics.field231;
                                                        if (var90 > 1024) {
                                                            var90 -= 2048;
                                                        }
                                                        if (var90 < -1024) {
                                                            var90 += 2048;
                                                        }
                                                        if (var90 < 0 && var89 > 0 || var90 > 0 && var89 < 0) {
                                                            Statics.field231 = var88;
                                                        }
                                                    }
                                                    for (int var91 = 0; var91 < 5; var91++) {
                                                        int var10002 = field931[var91]++;
                                                    }
                                                    Statics.field1984.method2087();
                                                    int var92 = ++class64.field512 - 1;
                                                    int var94 = class55.field438;
                                                    if (var92 > 15000 && var94 > 15000) {
                                                        field803 = 250;
                                                        class64.method3364(14500);
                                                        class197 var96 = class197.method3105(class193.field2252, field762.field1341);
                                                        field762.method2171(var96);
                                                    }
                                                    Statics.field1253.method1773();
                                                    field762.field1337++;
                                                    if (field762.field1337 > 50) {
                                                        class197 var97 = class197.method3105(class193.field2296, field762.field1341);
                                                        field762.method2171(var97);
                                                    }
                                                    try {
                                                        field762.method2156();
                                                    } catch (IOException var99) {
                                                        method2829();
                                                    }
                                                    return;
                                                }
                                                var62 = var61.field613;
                                                if (var62.field2710 < 0) {
                                                    break;
                                                }
                                                var63 = class227.method3572(var62.field2587);
                                            } while (var63 == null || var63.field2698 == null || var62.field2710 >= var63.field2698.length || var63.field2698[var62.field2710] != var62);
                                            class86.method1239(var61);
                                        }
                                    }
                                    var59 = var58.field613;
                                    if (var59.field2710 < 0) {
                                        break;
                                    }
                                    var60 = class227.method3572(var59.field2587);
                                } while (var60 == null || var60.field2698 == null || var59.field2710 >= var60.field2698.length || var60.field2698[var59.field2710] != var59);
                                class86.method1239(var58);
                            }
                        }
                        var56 = var55.field613;
                        if (var56.field2710 < 0) {
                            break;
                        }
                        var57 = class227.method3572(var56.field2587);
                    } while (var57 == null || var57.field2698 == null || var56.field2710 >= var57.field2698.length || var57.field2698[var56.field2710] != var56);
                    class86.method1239(var55);
                }
            }
            class197 var4 = class197.method3105(class193.field2305, field762.field1341);
            var4.field2339.method5121(0);
            int var5 = var4.field2339.field3711;
            Statics.method3120(var4.field2339);
            var4.field2339.method5246(var4.field2339.field3711 - var5);
            field762.method2171(var4);
        }
    }

    @ObfuscatedName("cl.fn(B)V")
    public static final void method2152() {
        if (Statics.field212 != null) {
            Statics.field212.method2328();
        }
        if (Statics.field368 != null) {
            Statics.field368.method2328();
        }
    }

    @ObfuscatedName("c.fz(S)V")
    public static final void method222() {
        for (int var0 = 0; var0 < field937; var0++) {
            int var10002 = field877[var0]--;
            if (field877[var0] >= -10) {
                class111 var2 = field924[var0];
                if (var2 == null) {
                    class111 var10000 = (class111) null;
                    var2 = class111.method2261(Statics.field3665, field880[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field877[var0] += var2.method2263();
                    field924[var0] = var2;
                }
                if (field877[var0] < 0) {
                    int var9;
                    if (field954[var0] == 0) {
                        var9 = field917;
                    } else {
                        int var3 = (field954[var0] & 0xFF) * 128;
                        int var4 = field954[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field3718.field984;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field954[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field3718.field974;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field877[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field759 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class113 var10 = var2.method2258().method2300(Statics.field149);
                        class123 var11 = class123.method2424(var10, 100, var9);
                        var11.method2454(field921[var0] - 1);
                        Statics.field554.method2195(var11);
                    }
                    field877[var0] = -100;
                }
            } else {
                field937--;
                for (int var1 = var0; var1 < field937; var1++) {
                    field880[var1] = field880[var1 + 1];
                    field924[var1] = field924[var1 + 1];
                    field921[var1] = field921[var1 + 1];
                    field877[var1] = field877[var1 + 1];
                    field954[var1] = field954[var1 + 1];
                }
                var0--;
            }
        }
        if (!field916) {
            return;
        }
        boolean var12;
        if (class207.field2407 == 0) {
            var12 = Statics.field2406.method3556();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field914 != 0 && field915 != -1) {
                class207.method1165(Statics.field329, field915, 0, field914, false);
            }
            field916 = false;
        }
    }

    @ObfuscatedName("dv.fr(Ljc;IIIB)V")
    public static void method2178(class269 arg0, int arg1, int arg2, int arg3) {
        if (field937 >= 50 || field759 == 0 || arg0.field3516 == null || arg1 >= arg0.field3516.length) {
            return;
        }
        int var4 = arg0.field3516[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field880[field937] = var5;
        field921[field937] = var6;
        field877[field937] = 0;
        field924[field937] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field954[field937] = (var8 << 16) + (var9 << 8) + var7;
        field937++;
    }

    @ObfuscatedName("ed.fs(IIII)V")
    public static void method3100(int arg0, int arg1, int arg2) {
        if (field917 == 0 || arg1 == 0 || field937 >= 50) {
            return;
        }
        field880[field937] = arg0;
        field921[field937] = arg1;
        field877[field937] = arg2;
        field924[field937] = null;
        field954[field937] = 0;
        field937++;
    }

    @ObfuscatedName("iv.fh(II)V")
    public static void method3864(int arg0) {
        if (arg0 == -1 && !field916) {
            class207.method1323();
        } else if (arg0 != -1 && field915 != arg0 && field914 != 0 && !field916) {
            class207.method3106(2, Statics.field329, arg0, 0, field914, false);
        }
        field915 = arg0;
    }

    @ObfuscatedName("ie.fq(III)V")
    public static void method4047(int arg0, int arg1) {
        if (field914 != 0 && arg0 != -1) {
            class207.method1165(Statics.field294, arg0, 0, field914, false);
            field916 = true;
        }
    }

    @ObfuscatedName("iq.fe(I)V")
    public static final void method4051() {
        if (Statics.field611 == field696) {
            return;
        }
        field696 = Statics.field611;
        int var0 = Statics.field611;
        int[] var1 = Statics.field3791.field3897;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class65.field536[var0][var6][var4] & 0x18) == 0) {
                    Statics.field61.method3095(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class65.field536[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field61.method3095(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3791.method5723();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class65.field536[var0][var10][var9] & 0x18) == 0) {
                    method1087(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class65.field536[var0 + 1][var10][var9] & 0x8) != 0) {
                    method1087(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field907 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field61.method3059(Statics.field611, var11, var12);
                if (var13 != 0L) {
                    int var15 = class138.method351(var13);
                    int var16 = class264.method363(var15).field3373;
                    if (var16 >= 0) {
                        field886[field907] = class252.method249(var16).method4075(false);
                        field908[field907] = var11;
                        field868[field907] = var12;
                        field907++;
                    }
                }
            }
        }
        Statics.field2412.method5692();
    }

    @ObfuscatedName("d.fb(Lhe;III)V")
    public static final void method45(class227 arg0, int arg1, int arg2) {
        if (field913 != 0 && field913 != 3 || field817 || !(class64.field525 == 1 || !Statics.field2507 && class64.field525 == 4)) {
            return;
        }
        class221 var3 = arg0.method3772(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field526 - arg1;
        int var5 = class64.field521 - arg2;
        if (!var3.method3691(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2519 / 2;
        int var7 = var5 - var3.field2518 / 2;
        int var8 = field910 & 0x7FF;
        int var9 = class140.field1795[var8];
        int var10 = class140.field1796[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3718.field984 + var11 >> 7;
        int var14 = Statics.field3718.field974 - var12 >> 7;
        class197 var15 = class197.method3105(class193.field2208, field762.field1341);
        var15.field2339.method5121(18);
        var15.field2339.method5122(Statics.field591 + var13);
        var15.field2339.method5121(class55.field427[82] ? (class55.field427[81] ? 2 : 1) : 0);
        var15.field2339.method5122(Statics.field1153 + var14);
        var15.field2339.method5121(var6);
        var15.field2339.method5121(var7);
        var15.field2339.method5122(field910);
        var15.field2339.method5121(57);
        var15.field2339.method5121(0);
        var15.field2339.method5121(0);
        var15.field2339.method5121(89);
        var15.field2339.method5122(Statics.field3718.field984);
        var15.field2339.method5122(Statics.field3718.field974);
        var15.field2339.method5121(63);
        field762.method2171(var15);
        field911 = var13;
        field912 = var14;
    }

    @ObfuscatedName("ao.fa(I)V")
    public static final void method558() {
        int[] var0 = class99.field1272;
        for (int var1 = 0; var1 < class99.field1279; var1++) {
            class76 var2 = field791[var0[var1]];
            if (var2 != null && var2.field990 > 0) {
                var2.field990--;
                if (var2.field990 == 0) {
                    var2.field1003 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field723; var3++) {
            int var4 = field724[var3];
            class89 var5 = field722[var4];
            if (var5 != null && var5.field990 > 0) {
                var5.field990--;
                if (var5.field990 == 0) {
                    var5.field1003 = null;
                }
            }
        }
    }

    @ObfuscatedName("bt.fm(Ljava/lang/String;B)V")
    public static final void method843(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field677.field1078 = !Statics.field677.field1078;
            class83.method437();
            if (Statics.field677.field1078) {
                class101.method2911(99, "", "Roofs are now all hidden");
            } else {
                class101.method2911(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field935 = !field935;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field800 = !field800;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field829 = !field829;
        }
        if (field850 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field122.field4014 = !Statics.field122.field4014;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field935 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field935 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2829();
            }
        }
        class197 var1 = class197.method3105(class193.field2247, field762.field1341);
        var1.field2339.method5121(arg0.length() + 1);
        var1.field2339.method5217(arg0);
        field762.method2171(var1);
    }

    @ObfuscatedName("ak.gx(Lcw;II)V")
    public static final void method577(class79 arg0, int arg1) {
        if (arg0.field1020 >= field690) {
            int var2 = Math.max(1, arg0.field1020 - field690);
            int var3 = arg0.field991 * 128 + arg0.field977 * 64;
            int var4 = arg0.field977 * 64 + arg0.field1018 * 128;
            arg0.field984 += (var3 - arg0.field984) / var2;
            arg0.field974 += (var4 - arg0.field974) / var2;
            arg0.field1032 = 0;
            arg0.field980 = arg0.field1022;
        } else if (arg0.field1021 >= field690) {
            if (field690 == arg0.field1021 || arg0.field1017 == -1 || arg0.field1009 != 0 || arg0.field1008 + 1 > class269.method4110(arg0.field1017).field3515[arg0.field1015]) {
                int var5 = arg0.field1021 - arg0.field1020;
                int var6 = field690 - arg0.field1020;
                int var7 = arg0.field991 * 128 + arg0.field977 * 64;
                int var8 = arg0.field977 * 64 + arg0.field1018 * 128;
                int var9 = arg0.field977 * 64 + arg0.field973 * 128;
                int var10 = arg0.field977 * 64 + arg0.field1019 * 128;
                arg0.field984 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field974 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1032 = 0;
            arg0.field980 = arg0.field1022;
            arg0.field996 = arg0.field980;
        } else {
            method3366(arg0);
        }
        if (arg0.field984 < 128 || arg0.field974 < 128 || arg0.field984 >= 13184 || arg0.field974 >= 13184) {
            arg0.field1017 = -1;
            arg0.field1010 = -1;
            arg0.field1020 = 0;
            arg0.field1021 = 0;
            arg0.field984 = arg0.field1029[0] * 128 + arg0.field977 * 64;
            arg0.field974 = arg0.field1030[0] * 128 + arg0.field977 * 64;
            arg0.method1663();
        }
        if (Statics.field3718 == arg0 && (arg0.field984 < 1536 || arg0.field974 < 1536 || arg0.field984 >= 11776 || arg0.field974 >= 11776)) {
            arg0.field1017 = -1;
            arg0.field1010 = -1;
            arg0.field1020 = 0;
            arg0.field1021 = 0;
            arg0.field984 = arg0.field1029[0] * 128 + arg0.field977 * 64;
            arg0.field974 = arg0.field1030[0] * 128 + arg0.field977 * 64;
            arg0.method1663();
        }
        if (arg0.field1027 != 0) {
            if (arg0.field1000 != -1) {
                class79 var11 = null;
                if (arg0.field1000 < 32768) {
                    var11 = field722[arg0.field1000];
                } else if (arg0.field1000 >= 32768) {
                    var11 = field791[arg0.field1000 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field984 - var11.field984;
                    int var13 = arg0.field974 - var11.field974;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field980 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1001) {
                    arg0.field1000 = -1;
                    arg0.field1001 = false;
                }
            }
            if (arg0.field1016 != -1 && (arg0.field1028 == 0 || arg0.field1032 > 0)) {
                arg0.field980 = arg0.field1016;
                arg0.field1016 = -1;
            }
            int var14 = arg0.field980 - arg0.field996 & 0x7FF;
            if (var14 == 0 && arg0.field1001) {
                arg0.field1000 = -1;
                arg0.field1001 = false;
            }
            if (var14 == 0) {
                arg0.field1026 = 0;
            } else {
                arg0.field1026++;
                if (var14 > 1024) {
                    arg0.field996 -= arg0.field1027;
                    boolean var15 = true;
                    if (var14 < arg0.field1027 || var14 > 2048 - arg0.field1027) {
                        arg0.field996 = arg0.field980;
                        var15 = false;
                    }
                    if (arg0.field979 == arg0.field1025 && (arg0.field1026 > 25 || var15)) {
                        if (arg0.field1011 == -1) {
                            arg0.field1025 = arg0.field994;
                        } else {
                            arg0.field1025 = arg0.field1011;
                        }
                    }
                } else {
                    arg0.field996 += arg0.field1027;
                    boolean var16 = true;
                    if (var14 < arg0.field1027 || var14 > 2048 - arg0.field1027) {
                        arg0.field996 = arg0.field980;
                        var16 = false;
                    }
                    if (arg0.field979 == arg0.field1025 && (arg0.field1026 > 25 || var16)) {
                        if (arg0.field981 == -1) {
                            arg0.field1025 = arg0.field994;
                        } else {
                            arg0.field1025 = arg0.field981;
                        }
                    }
                }
                arg0.field996 &= 0x7FF;
            }
        }
        arg0.field1002 = false;
        if (arg0.field1025 != -1) {
            class269 var18 = class269.method4110(arg0.field1025);
            if (var18 == null || var18.field3514 == null) {
                arg0.field1025 = -1;
            } else {
                arg0.field1005++;
                if (arg0.field975 < var18.field3514.length && arg0.field1005 > var18.field3515[arg0.field975]) {
                    arg0.field1005 = 1;
                    arg0.field975++;
                    method2178(var18, arg0.field975, arg0.field984, arg0.field974);
                }
                if (arg0.field975 >= var18.field3514.length) {
                    arg0.field1005 = 0;
                    arg0.field975 = 0;
                    method2178(var18, arg0.field975, arg0.field984, arg0.field974);
                }
            }
        }
        if (arg0.field1010 != -1 && field690 >= arg0.field1014) {
            if (arg0.field1007 < 0) {
                arg0.field1007 = 0;
            }
            int var19 = class254.method1049(arg0.field1010).field3244;
            if (var19 == -1) {
                arg0.field1010 = -1;
            } else {
                class269 var20 = class269.method4110(var19);
                if (var20 == null || var20.field3514 == null) {
                    arg0.field1010 = -1;
                } else {
                    arg0.field1013++;
                    if (arg0.field1007 < var20.field3514.length && arg0.field1013 > var20.field3515[arg0.field1007]) {
                        arg0.field1013 = 1;
                        arg0.field1007++;
                        method2178(var20, arg0.field1007, arg0.field984, arg0.field974);
                    }
                    if (arg0.field1007 >= var20.field3514.length && (arg0.field1007 < 0 || arg0.field1007 >= var20.field3514.length)) {
                        arg0.field1010 = -1;
                    }
                }
            }
        }
        if (arg0.field1017 != -1 && arg0.field1009 <= 1) {
            class269 var21 = class269.method4110(arg0.field1017);
            if (var21.field3521 == 1 && arg0.field1033 > 0 && arg0.field1020 <= field690 && arg0.field1021 < field690) {
                arg0.field1009 = 1;
                return;
            }
        }
        if (arg0.field1017 != -1 && arg0.field1009 == 0) {
            class269 var22 = class269.method4110(arg0.field1017);
            if (var22 == null || var22.field3514 == null) {
                arg0.field1017 = -1;
            } else {
                arg0.field1008++;
                if (arg0.field1015 < var22.field3514.length && arg0.field1008 > var22.field3515[arg0.field1015]) {
                    arg0.field1008 = 1;
                    arg0.field1015++;
                    method2178(var22, arg0.field1015, arg0.field984, arg0.field974);
                }
                if (arg0.field1015 >= var22.field3514.length) {
                    arg0.field1015 -= var22.field3517;
                    arg0.field1012++;
                    if (arg0.field1012 >= var22.field3523) {
                        arg0.field1017 = -1;
                    } else if (arg0.field1015 >= 0 && arg0.field1015 < var22.field3514.length) {
                        method2178(var22, arg0.field1015, arg0.field984, arg0.field974);
                    } else {
                        arg0.field1017 = -1;
                    }
                }
                arg0.field1002 = var22.field3519;
            }
        }
        if (arg0.field1009 > 0) {
            arg0.field1009--;
        }
    }

    @ObfuscatedName("gn.ge(Lcw;I)V")
    public static final void method3366(class79 arg0) {
        arg0.field1025 = arg0.field979;
        if (arg0.field1028 == 0) {
            arg0.field1032 = 0;
            return;
        }
        if (arg0.field1017 != -1 && arg0.field1009 == 0) {
            class269 var1 = class269.method4110(arg0.field1017);
            if (arg0.field1033 > 0 && var1.field3521 == 0) {
                arg0.field1032++;
                return;
            }
            if (arg0.field1033 <= 0 && var1.field3525 == 0) {
                arg0.field1032++;
                return;
            }
        }
        int var2 = arg0.field984;
        int var3 = arg0.field974;
        int var4 = arg0.field1029[arg0.field1028 - 1] * 128 + arg0.field977 * 64;
        int var5 = arg0.field1030[arg0.field1028 - 1] * 128 + arg0.field977 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field980 = 1280;
            } else if (var3 > var5) {
                arg0.field980 = 1792;
            } else {
                arg0.field980 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field980 = 768;
            } else if (var3 > var5) {
                arg0.field980 = 256;
            } else {
                arg0.field980 = 512;
            }
        } else if (var3 < var5) {
            arg0.field980 = 1024;
        } else if (var3 > var5) {
            arg0.field980 = 0;
        }
        byte var6 = arg0.field1023[arg0.field1028 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field984 = var4;
            arg0.field974 = var5;
            arg0.field1028--;
            if (arg0.field1033 > 0) {
                arg0.field1033--;
            }
            return;
        }
        int var7 = arg0.field980 - arg0.field996 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field983;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field994;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field985;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1004;
        }
        if (var8 == -1) {
            var8 = arg0.field994;
        }
        arg0.field1025 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class89) {
            var10 = ((class89) arg0).field1149.field3495;
        }
        if (var10) {
            if (arg0.field996 != arg0.field980 && arg0.field1000 == -1 && arg0.field1027 != 0) {
                var9 = 2;
            }
            if (arg0.field1028 > 2) {
                var9 = 6;
            }
            if (arg0.field1028 > 3) {
                var9 = 8;
            }
            if (arg0.field1032 > 0 && arg0.field1028 > 1) {
                var9 = 8;
                arg0.field1032--;
            }
        } else {
            if (arg0.field1028 > 1) {
                var9 = 6;
            }
            if (arg0.field1028 > 2) {
                var9 = 8;
            }
            if (arg0.field1032 > 0 && arg0.field1028 > 1) {
                var9 = 8;
                arg0.field1032--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field994 == arg0.field1025 && arg0.field986 != -1) {
            arg0.field1025 = arg0.field986;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field984 += var9;
                if (arg0.field984 > var4) {
                    arg0.field984 = var4;
                }
            } else if (var2 > var4) {
                arg0.field984 -= var9;
                if (arg0.field984 < var4) {
                    arg0.field984 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field974 += var9;
                if (arg0.field974 > var5) {
                    arg0.field974 = var5;
                }
            } else if (var3 > var5) {
                arg0.field974 -= var9;
                if (arg0.field974 < var5) {
                    arg0.field974 = var5;
                }
            }
        }
        if (arg0.field984 == var4 && arg0.field974 == var5) {
            arg0.field1028--;
            if (arg0.field1033 > 0) {
                arg0.field1033--;
            }
        }
    }

    @ObfuscatedName("as.gw(I)V")
    public static void method436() {
        if (Statics.field122 != null) {
            Statics.field122.method6028(Statics.field611, (Statics.field3718.field984 >> 7) + Statics.field591, (Statics.field3718.field974 >> 7) + Statics.field1153, false);
            Statics.field122.method5947();
        }
    }

    @ObfuscatedName("h.gu(Lbi;IIB)V")
    public static void method119(class76 arg0, int arg1, int arg2) {
        if (arg0.field1017 == arg1 && arg1 != -1) {
            int var3 = class269.method4110(arg1).field3526;
            if (var3 == 1) {
                arg0.field1015 = 0;
                arg0.field1008 = 0;
                arg0.field1009 = arg2;
                arg0.field1012 = 0;
            }
            if (var3 == 2) {
                arg0.field1012 = 0;
            }
        } else if (arg1 == -1 || arg0.field1017 == -1 || class269.method4110(arg1).field3520 >= class269.method4110(arg0.field1017).field3520) {
            arg0.field1017 = arg1;
            arg0.field1015 = 0;
            arg0.field1008 = 0;
            arg0.field1009 = arg2;
            arg0.field1012 = 0;
            arg0.field1033 = arg0.field1028;
        }
    }

    @ObfuscatedName("bj.gt(I)I")
    public static int method1171() {
        return field895 ? 2 : 1;
    }

    @ObfuscatedName("af.gz(II)V")
    public static void method357(int arg0) {
        field894 = 0L;
        if (arg0 >= 2) {
            field895 = true;
        } else {
            field895 = false;
        }
        if (method1171() == 1) {
            Statics.field319.method861(765, 503);
        } else {
            Statics.field319.method861(7680, 2160);
        }
        if (field688 < 25) {
            return;
        }
        class197 var1 = class197.method3105(class193.field2258, field762.field1341);
        var1.field2339.method5121(method1171());
        var1.field2339.method5122(Statics.field278);
        var1.field2339.method5122(Statics.field2526);
        field762.method2171(var1);
    }

    @ObfuscatedName("client.u(B)V")
    public final void method972() {
        field894 = Statics.method3668() + 500L;
        this.method1274();
        if (field925 != -1) {
            this.method1256(true);
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public void method1274() {
        int var1 = Statics.field278;
        int var2 = Statics.field2526;
        if (this.field484 < var1) {
            int var3 = this.field484;
        }
        if (this.field487 < var2) {
            int var4 = this.field487;
        }
        if (Statics.field677 == null) {
            return;
        }
        try {
            client var5 = Statics.field319;
            Object[] var6 = new Object[] { method1171() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gc(B)V")
    public final void method1629() {
        if (field925 != -1) {
            int var1 = field925;
            if (class227.method1732(var1)) {
                method3251(Statics.field2694[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field884; var2++) {
            if (field680[var2]) {
                field887[var2] = true;
            }
            field814[var2] = field680[var2];
            field680[var2] = false;
        }
        field885 = field690;
        field830 = -1;
        field831 = -1;
        Statics.field2107 = null;
        if (field925 != -1) {
            field884 = 0;
            method3631(field925, 0, 0, Statics.field278, Statics.field2526, 0, 0, -1);
        }
        class331.method5598();
        if (field786) {
            if (field785 == 1) {
                Statics.field3651[field784 / 100].method5731(field923 - 8, field689 - 8);
            }
            if (field785 == 2) {
                Statics.field3651[field784 / 100 + 4].method5731(field923 - 8, field689 - 8);
            }
        }
        if (field817) {
            int var8 = Statics.field249;
            int var9 = Statics.field2344;
            int var10 = Statics.field384;
            int var11 = Statics.field377;
            int var12 = 6116423;
            class331.method5606(var8, var9, var10, var11, var12);
            class331.method5606(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class331.method5691(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field2046.method4987(class234.field2935, var8 + 3, var9 + 14, var12, -1);
            int var13 = class64.field518;
            int var14 = class64.field519;
            for (int var15 = 0; var15 < field694; var15++) {
                int var16 = (field694 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class305 var18 = Statics.field2046;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field824[var15].length() > 0) {
                    var19 = field823[var15] + class234.field2921 + field824[var15];
                } else {
                    var19 = field823[var15];
                }
                var18.method4987(var19, var8 + 3, var16, var17, 0);
            }
            method715(Statics.field249, Statics.field2344, Statics.field384, Statics.field377);
        } else if (field830 != -1) {
            int var3 = field830;
            int var4 = field831;
            if ((field694 >= 2 || field834 != 0 || field836) && field829) {
                int var5 = method345();
                String var6;
                if (field834 == 1 && field694 < 2) {
                    var6 = class234.field3014 + class234.field2921 + field934 + " " + class91.field1167;
                } else if (field836 && field694 < 2) {
                    var6 = field839 + class234.field2921 + field840 + " " + class91.field1167;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field824[var5].length() > 0) {
                        var7 = field823[var5] + class234.field2921 + field824[var5];
                    } else {
                        var7 = field823[var5];
                    }
                    var6 = var7;
                }
                if (field694 > 2) {
                    var6 = var6 + class91.method4912(16777215) + " " + '/' + " " + (field694 - 2) + class234.field2890;
                }
                Statics.field2046.method5005(var6, var3 + 4, var4 + 15, 16777215, 0, field690 / 1000);
            }
        }
        if (field893 == 3) {
            for (int var20 = 0; var20 < field884; var20++) {
                if (field814[var20]) {
                    class331.method5605(field951[var20], field940[var20], field734[var20], field737[var20], 16711935, 128);
                } else if (field887[var20]) {
                    class331.method5605(field951[var20], field940[var20], field734[var20], field737[var20], 16711680, 128);
                }
            }
        }
        Statics.method1144(Statics.field611, Statics.field3718.field984, Statics.field3718.field974, field742);
        field742 = 0;
    }

    @ObfuscatedName("hj.gn(IIIII)V")
    public static final void method3718(int arg0, int arg1, int arg2, int arg3) {
        field779++;
        if (Statics.field3718.field984 >> 7 == field911 && Statics.field3718.field974 >> 7 == field912) {
            field911 = 0;
        }
        if (field800) {
            method224(Statics.field3718, false);
        }
        method608();
        method2128(true);
        int var4 = class99.field1279;
        int[] var5 = class99.field1272;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field808 != var5[var6] && field798 != var5[var6]) {
                method224(field791[var5[var6]], true);
            }
        }
        method2128(false);
        for (class96 var7 = (class96) field811.method4559(); var7 != null; var7 = (class96) field811.method4577()) {
            if (Statics.field611 != var7.field1228 || field690 > var7.field1235) {
                var7.method3355();
            } else if (field690 >= var7.field1236) {
                if (var7.field1229 > 0) {
                    class89 var8 = field722[var7.field1229 - 1];
                    if (var8 != null && var8.field984 >= 0 && var8.field984 < 13312 && var8.field974 >= 0 && var8.field974 < 13312) {
                        var7.method2012(var8.field984, var8.field974, method4641(var8.field984, var8.field974, var7.field1228) - var7.field1233, field690);
                    }
                }
                if (var7.field1229 < 0) {
                    int var9 = -var7.field1229 - 1;
                    class76 var10;
                    if (field798 == var9) {
                        var10 = Statics.field3718;
                    } else {
                        var10 = field791[var9];
                    }
                    if (var10 != null && var10.field984 >= 0 && var10.field984 < 13312 && var10.field974 >= 0 && var10.field974 < 13312) {
                        var7.method2012(var10.field984, var10.field974, method4641(var10.field984, var10.field974, var7.field1228) - var7.field1233, field690);
                    }
                }
                var7.method2010(field742);
                Statics.field61.method2924(Statics.field611, (int) var7.field1241, (int) var7.field1240, (int) var7.field1242, 60, var7, var7.field1248, -1L, false);
            }
        }
        method219();
        method3440(arg0, arg1, arg2, arg3, true);
        int var11 = field906;
        int var12 = field941;
        int var13 = field821;
        int var14 = field943;
        class331.method5599(var11, var12, var11 + var13, var12 + var14);
        class140.method2883();
        if (!field889) {
            int var15 = field825;
            if (field942 / 256 > var15) {
                var15 = field942 / 256;
            }
            if (field927[4] && field731[4] + 128 > var15) {
                var15 = field731[4] + 128;
            }
            int var16 = field910 & 0x7FF;
            int var17 = Statics.field1455;
            int var18 = Statics.field757;
            int var19 = Statics.field2207;
            int var20 = var15 * 3 + 600;
            int var22 = method2094(var20, var14);
            int var23 = 2048 - var15 & 0x7FF;
            int var24 = 2048 - var16 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var22;
            if (var23 != 0) {
                int var28 = class140.field1795[var23];
                int var29 = class140.field1796[var23];
                int var30 = var26 * var29 - var22 * var28 >> 16;
                var27 = var26 * var28 + var22 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class140.field1795[var24];
                int var32 = class140.field1796[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field221 = var17 - var25;
            Statics.field64 = var18 - var26;
            Statics.field2373 = var19 - var27;
            Statics.field639 = var15;
            Statics.field231 = var16;
            if (field755 == 1 && field850 >= 2 && field690 % 50 == 0 && (Statics.field1455 >> 7 != Statics.field3718.field984 >> 7 || Statics.field2207 >> 7 != Statics.field3718.field974 >> 7)) {
                int var34 = Statics.field3718.field667;
                int var35 = (Statics.field1455 >> 7) + Statics.field591;
                int var36 = (Statics.field2207 >> 7) + Statics.field1153;
                Statics.method118(var35, var36, var34, true);
            }
        }
        int var37;
        if (field889) {
            var37 = method1082();
        } else {
            var37 = method3205();
        }
        int var38 = Statics.field221;
        int var39 = Statics.field64;
        int var40 = Statics.field2373;
        int var41 = Statics.field639;
        int var42 = Statics.field231;
        for (int var43 = 0; var43 < 5; var43++) {
            if (field927[var43]) {
                int var44 = (int) (Math.random() * (double) (field789[var43] * 2 + 1) - (double) field789[var43] + Math.sin((double) field930[var43] / 100.0D * (double) field931[var43]) * (double) field731[var43]);
                if (var43 == 0) {
                    Statics.field221 += var44;
                }
                if (var43 == 1) {
                    Statics.field64 += var44;
                }
                if (var43 == 2) {
                    Statics.field2373 += var44;
                }
                if (var43 == 3) {
                    Statics.field231 = Statics.field231 + var44 & 0x7FF;
                }
                if (var43 == 4) {
                    Statics.field639 += var44;
                    if (Statics.field639 < 128) {
                        Statics.field639 = 128;
                    }
                    if (Statics.field639 > 383) {
                        Statics.field639 = 383;
                    }
                }
            }
        }
        int var45 = class64.field518;
        int var46 = class64.field519;
        if (class64.field525 != 0) {
            var45 = class64.field526;
            var46 = class64.field521;
        }
        if (var45 >= var11 && var45 < var11 + var13 && var46 >= var12 && var46 < var12 + var14) {
            class138.method5428(var45 - var11, var46 - var12);
        } else {
            class138.method999();
        }
        method2152();
        class331.method5606(var11, var12, var13, var14, 0);
        method2152();
        int var47 = class140.field1781;
        class140.field1781 = field944;
        Statics.field61.method2953(Statics.field221, Statics.field64, Statics.field2373, Statics.field639, Statics.field231, var37);
        class140.field1781 = var47;
        method2152();
        Statics.field61.method2927();
        method1046(var11, var12, var13, var14);
        method3192(var11, var12);
        ((class129) Statics.field1782).method2595(field742);
        method3225(var11, var12, var13, var14);
        Statics.field221 = var38;
        Statics.field64 = var39;
        Statics.field2373 = var40;
        Statics.field639 = var41;
        Statics.field231 = var42;
        if (field702 && class247.method262(true, false) == 0) {
            field702 = false;
        }
        if (field702) {
            class331.method5606(var11, var12, var13, var14, 0);
            Statics.method3663(class234.field2768, false);
        }
    }

    @ObfuscatedName("gp.gb(IIIIZI)V")
    public static final void method3440(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field932;
        } else if (var5 >= 100) {
            var6 = field933;
        } else {
            var6 = (field933 - field932) * var5 / 100 + field932;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field938) {
            short var8 = field938;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field749) {
                var6 = field749;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class331.method5598();
                    class331.method5606(arg0, arg1, var10, arg3, -16777216);
                    class331.method5606(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field939) {
            short var11 = field939;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field936) {
                var6 = field936;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class331.method5598();
                    class331.method5606(arg0, arg1, arg2, var13, -16777216);
                    class331.method5606(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field944 = arg3 * var6 / 334;
        if (field821 != arg2 || field943 != arg3) {
            method1240(arg2, arg3);
        }
        field906 = arg0;
        field941 = arg1;
        field821 = arg2;
        field943 = arg3;
    }

    @ObfuscatedName("az.gh(I)V")
    public static void method608() {
        if (field808 >= 0 && field791[field808] != null) {
            method224(field791[field808], false);
        }
    }

    @ObfuscatedName("c.gm(Lbi;ZI)V")
    public static void method224(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1179() || arg0.field652) {
            return;
        }
        arg0.field664 = false;
        if ((field685 && class99.field1279 > 50 || class99.field1279 > 200) && arg1 && arg0.field979 == arg0.field1025) {
            arg0.field664 = true;
        }
        int var2 = arg0.field984 >> 7;
        int var3 = arg0.field974 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method5881(0, 0, 0, false, arg0.field668);
        if (arg0.field657 != null && field690 >= arg0.field654 && field690 < arg0.field655) {
            arg0.field664 = false;
            arg0.field646 = method4641(arg0.field984, arg0.field974, Statics.field611);
            arg0.field978 = field690;
            Statics.field61.method2925(Statics.field611, arg0.field984, arg0.field974, arg0.field646, 60, arg0, arg0.field996, var4, arg0.field660, arg0.field661, arg0.field662, arg0.field665);
            return;
        }
        if ((arg0.field984 & 0x7F) == 64 && (arg0.field974 & 0x7F) == 64) {
            if (field779 == field778[var2][var3]) {
                return;
            }
            field778[var2][var3] = field779;
        }
        arg0.field646 = method4641(arg0.field984, arg0.field974, Statics.field611);
        arg0.field978 = field690;
        Statics.field61.method2924(Statics.field611, arg0.field984, arg0.field974, arg0.field646, 60, arg0, arg0.field996, var4, arg0.field1002);
    }

    @ObfuscatedName("ck.gq(ZB)V")
    public static final void method2128(boolean arg0) {
        for (int var1 = 0; var1 < field723; var1++) {
            class89 var2 = field722[field724[var1]];
            if (var2 != null && var2.method1179() && var2.field1149.field3486 == arg0 && var2.field1149.method4395()) {
                int var3 = var2.field984 >> 7;
                int var4 = var2.field974 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field977 == 1 && (var2.field984 & 0x7F) == 64 && (var2.field974 & 0x7F) == 64) {
                        if (field779 == field778[var3][var4]) {
                            continue;
                        }
                        field778[var3][var4] = field779;
                    }
                    long var5 = class138.method5881(0, 0, 1, !var2.field1149.field3494, field724[var1]);
                    var2.field978 = field690;
                    Statics.field61.method2924(Statics.field611, var2.field984, var2.field974, method4641(var2.field984 + (var2.field977 * 64 - 64), var2.field974 + (var2.field977 * 64 - 64), Statics.field611), var2.field977 * 64 - 64 + 60, var2, var2.field996, var5, var2.field1002);
                }
            }
        }
    }

    @ObfuscatedName("o.gs(I)V")
    public static final void method219() {
        for (class87 var0 = (class87) field812.method4559(); var0 != null; var0 = (class87) field812.method4577()) {
            if (Statics.field611 != var0.field1141 || var0.field1143) {
                var0.method3355();
            } else if (field690 >= var0.field1133) {
                var0.method1932(field742);
                if (var0.field1143) {
                    var0.method3355();
                } else {
                    Statics.field61.method2924(var0.field1141, var0.field1134, var0.field1136, var0.field1137, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("fo.gk(B)I")
    public static final int method3205() {
        if (Statics.field677.field1078) {
            return Statics.field611;
        }
        int var0 = 3;
        if (Statics.field639 < 310) {
            int var1;
            int var2;
            if (field755 == 1) {
                var1 = Statics.field1455 >> 7;
                var2 = Statics.field2207 >> 7;
            } else {
                var1 = Statics.field3718.field984 >> 7;
                var2 = Statics.field3718.field974 >> 7;
            }
            int var3 = Statics.field221 >> 7;
            int var4 = Statics.field2373 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field611;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field611;
            }
            if ((class65.field536[Statics.field611][var3][var4] & 0x4) != 0) {
                var0 = Statics.field611;
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
                    if ((class65.field536[Statics.field611][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field611;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class65.field536[Statics.field611][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field611;
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
                    if ((class65.field536[Statics.field611][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field611;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class65.field536[Statics.field611][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field611;
                        }
                    }
                }
            }
        }
        if (Statics.field3718.field984 >= 0 && Statics.field3718.field974 >= 0 && Statics.field3718.field984 < 13312 && Statics.field3718.field974 < 13312) {
            if ((class65.field536[Statics.field611][Statics.field3718.field984 >> 7][Statics.field3718.field974 >> 7] & 0x4) != 0) {
                var0 = Statics.field611;
            }
            return var0;
        } else {
            return Statics.field611;
        }
    }

    @ObfuscatedName("ba.gl(B)I")
    public static final int method1082() {
        if (Statics.field677.field1078) {
            return Statics.field611;
        } else {
            int var0 = method4641(Statics.field221, Statics.field2373, Statics.field611);
            return var0 - Statics.field64 >= 800 || (class65.field536[Statics.field611][Statics.field221 >> 7][Statics.field2373 >> 7] & 0x4) == 0 ? 3 : Statics.field611;
        }
    }

    @ObfuscatedName("ff.gy(III)V")
    public static final void method3192(int arg0, int arg1) {
        if (field890 == 2) {
            method278((field701 - Statics.field591 << 7) + field704, (field764 - Statics.field1153 << 7) + field705, field703 * 2);
            if (field813 > -1 && field690 % 20 < 10) {
                Statics.field27[0].method5731(field813 + arg0 - 12, field781 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ar.gd(I)Z")
    public static boolean method350() {
        return (field691 & 0x1) != 0;
    }

    @ObfuscatedName("aa.gj(Lcw;IIIIII)V")
    public static final void method583(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1179()) {
            return;
        }
        if (arg0 instanceof class89) {
            class267 var6 = ((class89) arg0).field1149;
            if (var6.field3491 != null) {
                var6 = var6.method4394();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1279;
        int[] var8 = class99.field1272;
        byte var9 = 0;
        if (arg1 < var7 && field690 == arg0.field978) {
            class76 var10 = (class76) arg0;
            boolean var11;
            if (field691 == 0) {
                var11 = false;
            } else if (Statics.field3718 == var10) {
                boolean var15 = (field691 & 0x8) != 0;
                var11 = var15;
            } else {
                boolean var12 = (field691 & 0x4) != 0;
                boolean var13 = var12 || method350() && var10.method1195();
                if (!var13) {
                    boolean var14 = (field691 & 0x2) != 0;
                    var13 = var14 && var10.method1178();
                }
                var11 = var13;
            }
            if (var11) {
                class76 var16 = (class76) arg0;
                if (arg1 < var7) {
                    method783(arg0, arg0.field1024 + 15);
                    class306 var17 = (class306) field732.get(class302.field3656);
                    byte var18 = 9;
                    var17.method4990(var16.field653.method4845(), field813 + arg2, field781 + arg3 - var18, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var19 = -2;
        if (!arg0.field999.method4495()) {
            method783(arg0, arg0.field1024 + 15);
            for (class88 var20 = (class88) arg0.field999.method4488(); var20 != null; var20 = (class88) arg0.field999.method4543()) {
                class80 var21 = var20.method1944(field690);
                if (var21 != null) {
                    class257 var22 = var20.field1144;
                    class335 var23 = var22.method4156();
                    class335 var24 = var22.method4155();
                    int var25 = 0;
                    int var26;
                    if (var23 == null || var24 == null) {
                        var26 = var22.field3285;
                    } else {
                        if (var22.field3286 * 2 < var24.field3890) {
                            var25 = var22.field3286;
                        }
                        var26 = var24.field3890 - var25 * 2;
                    }
                    int var27 = 255;
                    boolean var28 = true;
                    int var29 = field690 - var21.field1036;
                    int var30 = var21.field1037 * var26 / var22.field3285;
                    int var33;
                    if (var21.field1039 > var29) {
                        int var31 = var22.field3273 == 0 ? 0 : var29 / var22.field3273 * var22.field3273;
                        int var32 = var21.field1035 * var26 / var22.field3285;
                        var33 = (var30 - var32) * var31 / var21.field1039 + var32;
                    } else {
                        var33 = var30;
                        int var34 = var21.field1039 + var22.field3276 - var29;
                        if (var22.field3284 >= 0) {
                            var27 = (var34 << 8) / (var22.field3276 - var22.field3284);
                        }
                    }
                    if (var21.field1037 > 0 && var33 < 1) {
                        var33 = 1;
                    }
                    if (var23 == null || var24 == null) {
                        var19 += 5;
                        if (field813 > -1) {
                            int var40 = field813 + arg2 - (var26 >> 1);
                            int var41 = field781 + arg3 - var19;
                            class331.method5606(var40, var41, var33, 5, 65280);
                            class331.method5606(var33 + var40, var41, var26 - var33, 5, 16711680);
                        }
                        var19 += 2;
                    } else {
                        int var35;
                        if (var26 == var33) {
                            var35 = var25 * 2 + var33;
                        } else {
                            var35 = var25 + var33;
                        }
                        int var36 = var23.field3900;
                        var19 += var36;
                        int var37 = field813 + arg2 - (var26 >> 1);
                        int var38 = field781 + arg3 - var19;
                        int var39 = var37 - var25;
                        if (var27 >= 0 && var27 < 255) {
                            var23.method5737(var39, var38, var27);
                            class331.method5620(var39, var38, var35 + var39, var36 + var38);
                            var24.method5737(var39, var38, var27);
                        } else {
                            var23.method5731(var39, var38);
                            class331.method5620(var39, var38, var35 + var39, var36 + var38);
                            var24.method5731(var39, var38);
                        }
                        class331.method5599(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var19 += 2;
                    }
                } else if (var20.method1941()) {
                    var20.method3355();
                }
            }
        }
        if (var19 == -2) {
            var19 += 7;
        }
        int var42 = var9 + var19;
        if (arg1 < var7) {
            class76 var43 = (class76) arg0;
            if (var43.field652) {
                return;
            }
            if (var43.field649 != -1 || var43.field648 != -1) {
                method783(arg0, arg0.field1024 + 15);
                if (field813 > -1) {
                    if (var43.field649 != -1) {
                        var42 += 25;
                        Statics.field407[var43.field649].method5731(field813 + arg2 - 12, field781 + arg3 - var42);
                    }
                    if (var43.field648 != -1) {
                        var42 += 25;
                        Statics.field1355[var43.field648].method5731(field813 + arg2 - 12, field781 + arg3 - var42);
                    }
                }
            }
            if (arg1 >= 0 && field890 == 10 && field801 == var8[arg1]) {
                method783(arg0, arg0.field1024 + 15);
                if (field813 > -1) {
                    int var44 = Statics.field27[1].field3900 + var42;
                    Statics.field27[1].method5731(field813 + arg2 - 12, field781 + arg3 - var44);
                }
            }
        } else {
            class267 var45 = ((class89) arg0).field1149;
            if (var45.field3491 != null) {
                var45 = var45.method4394();
            }
            if (var45.field3489 >= 0 && var45.field3489 < Statics.field1355.length) {
                method783(arg0, arg0.field1024 + 15);
                if (field813 > -1) {
                    Statics.field1355[var45.field3489].method5731(field813 + arg2 - 12, field781 + arg3 - 30);
                }
            }
            if (field890 == 1 && field699 == field724[arg1 - var7] && field690 % 20 < 10) {
                method783(arg0, arg0.field1024 + 15);
                if (field813 > -1) {
                    Statics.field27[0].method5731(field813 + arg2 - 12, field781 + arg3 - 28);
                }
            }
        }
        if (arg0.field1003 != null && (arg1 >= var7 || !arg0.field989 && (field897 == 4 || !arg0.field1031 && (field897 == 0 || field897 == 3 || field897 == 1 && ((class76) arg0).method1195())))) {
            method783(arg0, arg0.field1024);
            if (field813 > -1 && field768 < field769) {
                field909[field768] = Statics.field2046.method4982(arg0.field1003) / 2;
                field772[field768] = Statics.field2046.field3683;
                field770[field768] = field813;
                field832[field768] = field781;
                field774[field768] = arg0.field988;
                field928[field768] = arg0.field992;
                field776[field768] = arg0.field990;
                field782[field768] = arg0.field1003;
                field768++;
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg0.field982[var46];
            int var48 = arg0.field976[var46];
            class263 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field690) {
                    continue;
                }
                var49 = class263.method183(arg0.field976[var46]);
                var50 = var49.field3330;
                if (var49 != null && var49.field3341 != null) {
                    var49 = var49.method4236();
                    if (var49 == null) {
                        arg0.field982[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg0.field997[var46];
            class263 var52 = null;
            if (var51 >= 0) {
                var52 = class263.method183(var51);
                if (var52 != null && var52.field3341 != null) {
                    var52 = var52.method4236();
                }
            }
            if (var47 - var50 <= field690) {
                if (var49 == null) {
                    arg0.field982[var46] = -1;
                } else {
                    method783(arg0, arg0.field1024 / 2);
                    if (field813 > -1) {
                        if (var46 == 1) {
                            field781 -= 20;
                        }
                        if (var46 == 2) {
                            field813 -= 15;
                            field781 -= 10;
                        }
                        if (var46 == 3) {
                            field813 += 15;
                            field781 -= 10;
                        }
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        class335 var65 = null;
                        class335 var66 = null;
                        class335 var67 = null;
                        class335 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class335 var78 = var49.method4250();
                        if (var78 != null) {
                            var57 = var78.field3890;
                            int var79 = var78.field3900;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field3889;
                        }
                        class335 var80 = var49.method4239();
                        if (var80 != null) {
                            var58 = var80.field3890;
                            int var81 = var80.field3900;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field3889;
                        }
                        class335 var82 = var49.method4240();
                        if (var82 != null) {
                            var59 = var82.field3890;
                            int var83 = var82.field3900;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field3889;
                        }
                        class335 var84 = var49.method4241();
                        if (var84 != null) {
                            var60 = var84.field3890;
                            int var85 = var84.field3900;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field3889;
                        }
                        if (var52 != null) {
                            var65 = var52.method4250();
                            if (var65 != null) {
                                var69 = var65.field3890;
                                int var86 = var65.field3900;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field3889;
                            }
                            var66 = var52.method4239();
                            if (var66 != null) {
                                var70 = var66.field3890;
                                int var87 = var66.field3900;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field3889;
                            }
                            var67 = var52.method4240();
                            if (var67 != null) {
                                var71 = var67.field3890;
                                int var88 = var67.field3900;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field3889;
                            }
                            var68 = var52.method4241();
                            if (var68 != null) {
                                var72 = var68.field3890;
                                int var89 = var68.field3900;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field3889;
                            }
                        }
                        class305 var90 = var49.method4244();
                        if (var90 == null) {
                            var90 = Statics.field1304;
                        }
                        class305 var91;
                        if (var52 == null) {
                            var91 = Statics.field1304;
                        } else {
                            var91 = var52.method4244();
                            if (var91 == null) {
                                var91 = Statics.field1304;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var49.method4237(arg0.field995[var46]);
                        int var97 = var90.method4982(var96);
                        if (var52 != null) {
                            var93 = var52.method4237(arg0.field998[var46]);
                            var95 = var91.method4982(var93);
                        }
                        int var98 = 0;
                        int var99 = 0;
                        if (var58 > 0) {
                            if (var82 == null && var84 == null) {
                                var98 = 1;
                            } else {
                                var98 = var97 / var58 + 1;
                            }
                        }
                        if (var52 != null && var70 > 0) {
                            if (var67 == null && var68 == null) {
                                var99 = 1;
                            } else {
                                var99 = var95 / var70 + 1;
                            }
                        }
                        int var100 = 0;
                        int var101 = var100;
                        if (var57 > 0) {
                            var100 += var57;
                        }
                        var100 += 2;
                        int var102 = var100;
                        if (var59 > 0) {
                            var100 += var59;
                        }
                        int var103 = var100;
                        int var104 = var100;
                        int var106;
                        if (var58 > 0) {
                            int var105 = var58 * var98;
                            var106 = var100 + var105;
                            var104 = (var105 - var97) / 2 + var100;
                        } else {
                            var106 = var97 + var100;
                        }
                        int var107 = var106;
                        if (var60 > 0) {
                            var106 += var60;
                        }
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        if (var52 != null) {
                            var106 += 2;
                            var108 = var106;
                            if (var69 > 0) {
                                var106 += var69;
                            }
                            var106 += 2;
                            var109 = var106;
                            if (var71 > 0) {
                                var106 += var71;
                            }
                            var110 = var106;
                            var112 = var106;
                            if (var70 > 0) {
                                int var113 = var70 * var99;
                                var106 += var113;
                                var112 += (var113 - var95) / 2;
                            } else {
                                var106 += var95;
                            }
                            var111 = var106;
                            if (var72 > 0) {
                                var106 += var72;
                            }
                        }
                        int var114 = arg0.field982[var46] - field690;
                        int var115 = var49.field3339 - var49.field3339 * var114 / var49.field3330;
                        int var116 = var49.field3342 * var114 / var49.field3330 + -var49.field3342;
                        int var117 = field813 + arg2 - (var106 >> 1) + var115;
                        int var118 = field781 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var49.field3340 + var118 + 15;
                        int var122 = var121 - var90.field3684;
                        int var123 = var90.field3685 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var52 != null) {
                            var124 = var52.field3340 + var118 + 15;
                            int var125 = var124 - var91.field3684;
                            int var126 = var91.field3685 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var49.field3335 >= 0) {
                            var129 = (var114 << 8) / (var49.field3330 - var49.field3335);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method5737(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method5737(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method5737(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method5737(var107 + var117 - var64, var118, var129);
                            }
                            var90.method4988(var96, var104 + var117, var121, var49.field3329, 0, var129);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method5737(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method5737(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method5737(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method5737(var111 + var117 - var76, var118, var129);
                                }
                                var91.method4988(var93, var112 + var117, var124, var52.field3329, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method5731(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method5731(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method5731(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method5731(var107 + var117 - var64, var118);
                            }
                            var90.method4987(var96, var104 + var117, var121, var49.field3329 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method5731(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method5731(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method5731(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method5731(var111 + var117 - var76, var118);
                                }
                                var91.method4987(var93, var112 + var117, var124, var52.field3329 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.go(IIIII)V")
    public static final void method1046(int arg0, int arg1, int arg2, int arg3) {
        field768 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class99.field1279;
        int[] var8 = class99.field1272;
        for (int var9 = 0; var9 < field723 + var7; var9++) {
            class79 var10;
            if (var9 < var7) {
                var10 = field791[var8[var9]];
                if (field808 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field3718 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field722[field724[var9 - var7]];
            }
            method583(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field800 && var6 != -1) {
            method583(Statics.field3718, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method583(field791[field808], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field768; var11++) {
            int var12 = field770[var11];
            int var13 = field832[var11];
            int var14 = field909[var11];
            int var15 = field772[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field832[var17] - field772[var17] && var13 - var15 < field832[var17] + 2 && var12 - var14 < field909[var17] + field770[var17] && var12 + var14 > field770[var17] - field909[var17] && field832[var17] - field772[var17] < var13) {
                        var13 = field832[var17] - field772[var17];
                        var16 = true;
                    }
                }
            }
            field813 = field770[var11];
            field781 = field832[var11] = var13;
            String var18 = field782[var11];
            if (field845 == 0) {
                int var19 = 16776960;
                if (field774[var11] < 6) {
                    var19 = field896[field774[var11]];
                }
                if (field774[var11] == 6) {
                    var19 = field779 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field774[var11] == 7) {
                    var19 = field779 % 20 < 10 ? 255 : 65535;
                }
                if (field774[var11] == 8) {
                    var19 = field779 % 20 < 10 ? 45056 : 8454016;
                }
                if (field774[var11] == 9) {
                    int var20 = 150 - field776[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field774[var11] == 10) {
                    int var21 = 150 - field776[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field774[var11] == 11) {
                    int var22 = 150 - field776[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field928[var11] == 0) {
                    Statics.field2046.method4990(var18, field813 + arg0, field781 + arg1, var19, 0);
                }
                if (field928[var11] == 1) {
                    Statics.field2046.method4992(var18, field813 + arg0, field781 + arg1, var19, 0, field779);
                }
                if (field928[var11] == 2) {
                    Statics.field2046.method4993(var18, field813 + arg0, field781 + arg1, var19, 0, field779);
                }
                if (field928[var11] == 3) {
                    Statics.field2046.method4994(var18, field813 + arg0, field781 + arg1, var19, 0, field779, 150 - field776[var11]);
                }
                if (field928[var11] == 4) {
                    int var23 = (150 - field776[var11]) * (Statics.field2046.method4982(var18) + 100) / 150;
                    class331.method5620(field813 + arg0 - 50, arg1, field813 + arg0 + 50, arg1 + arg3);
                    Statics.field2046.method4987(var18, field813 + arg0 + 50 - var23, field781 + arg1, var19, 0);
                    class331.method5599(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field928[var11] == 5) {
                    int var24 = 150 - field776[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class331.method5620(arg0, field781 + arg1 - Statics.field2046.field3683 - 1, arg0 + arg2, field781 + arg1 + 5);
                    Statics.field2046.method4990(var18, field813 + arg0, field781 + arg1 + var25, var19, 0);
                    class331.method5599(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2046.method4990(var18, field813 + arg0, field781 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ei.gp(S)V")
    public static final void method2827() {
        field795 = 0;
        int var0 = (Statics.field3718.field984 >> 7) + Statics.field591;
        int var1 = (Statics.field3718.field974 >> 7) + Statics.field1153;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field795 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field795 = 1;
        }
        if (field795 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field795 = 0;
        }
    }

    @ObfuscatedName("fc.gf(IIIII)V")
    public static final void method3225(int arg0, int arg1, int arg2, int arg3) {
        method2827();
    }

    @ObfuscatedName("bo.gr(Lcw;IB)V")
    public static final void method783(class79 arg0, int arg1) {
        method278(arg0.field984, arg0.field974, arg1);
    }

    @ObfuscatedName("ai.gi(IIII)V")
    public static final void method278(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field813 = -1;
            field781 = -1;
            return;
        }
        int var3 = method4641(arg0, arg1, Statics.field611) - arg2;
        int var4 = arg0 - Statics.field221;
        int var5 = var3 - Statics.field64;
        int var6 = arg1 - Statics.field2373;
        int var7 = class140.field1795[Statics.field639];
        int var8 = class140.field1796[Statics.field639];
        int var9 = class140.field1795[Statics.field231];
        int var10 = class140.field1796[Statics.field231];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field813 = field944 * var11 / var15 + field821 / 2;
            field781 = field944 * var14 / var15 + field943 / 2;
        } else {
            field813 = -1;
            field781 = -1;
        }
    }

    @ObfuscatedName("ja.hz(IIII)I")
    public static final int method4641(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field536[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field550[var5][var3][var4] + class65.field550[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field550[var5][var3][var4 + 1] + class65.field550[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cp.hc(III)I")
    public static int method2094(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field851 - field898) * var2 / 100 + field898;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ek.hy(ZLkj;I)V")
    public static final void method3121(boolean arg0, class309 arg1) {
        field739 = arg0;
        if (!field739) {
            int var2 = arg1.method5139();
            int var3 = arg1.method5127();
            int var4 = arg1.method5139();
            Statics.field1958 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1958[var5][var6] = arg1.method5142();
                }
            }
            Statics.field3311 = new int[var4];
            Statics.field442 = new int[var4];
            Statics.field268 = new int[var4];
            Statics.field140 = new byte[var4][];
            Statics.field133 = new byte[var4][];
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
                        Statics.field3311[var8] = var11;
                        Statics.field442[var8] = Statics.field163.method3885("m" + var9 + "_" + var10);
                        Statics.field268[var8] = Statics.field163.method3885("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method207(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method5137() == 1;
        int var13 = arg1.method5127();
        int var14 = arg1.method5177();
        int var15 = arg1.method5139();
        arg1.method5086();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5085(1);
                    if (var19 == 1) {
                        field740[var16][var17][var18] = arg1.method5085(26);
                    } else {
                        field740[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5088();
        Statics.field1958 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1958[var20][var21] = arg1.method5142();
            }
        }
        Statics.field3311 = new int[var15];
        Statics.field442 = new int[var15];
        Statics.field268 = new int[var15];
        Statics.field140 = new byte[var15][];
        Statics.field133 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field740[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3311[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3311[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field442[var22] = Statics.field163.method3885("m" + var31 + "_" + var32);
                            Statics.field268[var22] = Statics.field163.method3885("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method207(var13, var14, !var12);
    }

    @ObfuscatedName("r.hs(IIZI)V")
    public static final void method207(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field586 == arg0 && Statics.field530 == arg1) {
            return;
        }
        Statics.field586 = arg0;
        Statics.field530 = arg1;
        method1137(25);
        Statics.method3663(class234.field2768, true);
        int var3 = Statics.field591;
        int var4 = Statics.field1153;
        Statics.field591 = (arg0 - 6) * 8;
        Statics.field1153 = (arg1 - 6) * 8;
        int var5 = Statics.field591 - var3;
        int var6 = Statics.field1153 - var4;
        int var7 = Statics.field591;
        int var8 = Statics.field1153;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field722[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1029[var11] -= var5;
                    var10.field1030[var11] -= var6;
                }
                var10.field984 -= var5 * 128;
                var10.field974 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field791[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1029[var14] -= var5;
                    var13.field1030[var14] -= var6;
                }
                var13.field984 -= var5 * 128;
                var13.field974 -= var6 * 128;
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
                        field809[var25][var21][var22] = field809[var25][var23][var24];
                    } else {
                        field809[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field698.method4559(); var26 != null; var26 = (class78) field698.method4577()) {
            var26.field961 -= var5;
            var26.field962 -= var6;
            if (var26.field961 < 0 || var26.field962 < 0 || var26.field961 >= 104 || var26.field962 >= 104) {
                var26.method3355();
            }
        }
        if (field911 != 0) {
            field911 -= var5;
            field912 -= var6;
        }
        field937 = 0;
        field889 = false;
        Statics.field221 -= var5 << 7;
        Statics.field2373 -= var6 << 7;
        Statics.field1455 -= var5 << 7;
        Statics.field2207 -= var6 << 7;
        field696 = -1;
        field812.method4553();
        field811.method4553();
        for (int var27 = 0; var27 < 4; var27++) {
            field738[var27].method3320();
        }
    }

    @ObfuscatedName("kg.hh(ZI)V")
    public static final void method4968(boolean arg0) {
        method2152();
        field762.field1337++;
        if (field762.field1337 < 50 && !arg0) {
            return;
        }
        field762.field1337 = 0;
        if (field729 || field762.method2169() == null) {
            return;
        }
        class197 var1 = class197.method3105(class193.field2296, field762.field1341);
        field762.method2171(var1);
        try {
            field762.method2156();
        } catch (IOException var3) {
            field729 = true;
        }
    }

    @ObfuscatedName("i.hf(B)V")
    public static final void method131() {
        method4968(false);
        field819 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field140.length; var1++) {
            if (Statics.field442[var1] != -1 && Statics.field140[var1] == null) {
                Statics.field140[var1] = Statics.field163.method3869(Statics.field442[var1], 0);
                if (Statics.field140[var1] == null) {
                    var0 = false;
                    field819++;
                }
            }
            if (Statics.field268[var1] != -1 && Statics.field133[var1] == null) {
                Statics.field133[var1] = Statics.field163.method3908(Statics.field268[var1], 0, Statics.field1958[var1]);
                if (Statics.field133[var1] == null) {
                    var0 = false;
                    field819++;
                }
            }
        }
        if (!var0) {
            field900 = 1;
            return;
        }
        field735 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field140.length; var3++) {
            byte[] var4 = Statics.field133[var3];
            if (var4 != null) {
                int var5 = (Statics.field3311[var3] >> 8) * 64 - Statics.field591;
                int var6 = (Statics.field3311[var3] & 0xFF) * 64 - Statics.field1153;
                if (field739) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class310 var9 = new class310(var4);
                int var10 = -1;
                label535: while (true) {
                    int var11 = var9.method5152();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method5151();
                            if (var16 == 0) {
                                continue label535;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method5137() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class264 var22 = class264.method363(var10);
                                if (var19 != 22 || !field685 || var22.field3364 != 0 || var22.field3362 == 1 || var22.field3383) {
                                    if (!var22.method4270()) {
                                        field735++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method5151();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method5137();
                    }
                }
            }
        }
        if (!var2) {
            field900 = 2;
            return;
        }
        if (field900 != 0) {
            Statics.method3663(class234.field2768 + class91.field1168 + class91.field1165 + 100 + "%" + class91.field1166, true);
        }
        method2152();
        Statics.field61.method2944();
        for (int var23 = 0; var23 < 4; var23++) {
            field738[var23].method3320();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class65.field536[var24][var25][var26] = 0;
                }
            }
        }
        method2152();
        class65.method3200();
        int var27 = Statics.field140.length;
        class85.method4838();
        method4968(true);
        if (!field739) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field3311[var28] >> 8) * 64 - Statics.field591;
                int var30 = (Statics.field3311[var28] & 0xFF) * 64 - Statics.field1153;
                byte[] var31 = Statics.field140[var28];
                if (var31 != null) {
                    method2152();
                    class65.method245(var31, var29, var30, Statics.field586 * 8 - 48, Statics.field530 * 8 - 48, field738);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field3311[var32] >> 8) * 64 - Statics.field591;
                int var34 = (Statics.field3311[var32] & 0xFF) * 64 - Statics.field1153;
                byte[] var35 = Statics.field140[var32];
                if (var35 == null && Statics.field530 < 800) {
                    method2152();
                    class65.method442(var33, var34, 64, 64);
                }
            }
            method4968(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field133[var36];
                if (var37 != null) {
                    int var38 = (Statics.field3311[var36] >> 8) * 64 - Statics.field591;
                    int var39 = (Statics.field3311[var36] & 0xFF) * 64 - Statics.field1153;
                    method2152();
                    class143 var40 = Statics.field61;
                    class182[] var41 = field738;
                    class310 var42 = new class310(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method5152();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method5151();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method5137();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class65.field536[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class182 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class65.method5117(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field739) {
            for (int var57 = 0; var57 < 4; var57++) {
                method2152();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field740[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field3311.length; var67++) {
                                if (Statics.field3311[var67] == var66 && Statics.field140[var67] != null) {
                                    byte[] var68 = Statics.field140[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class182[] var73 = field738;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field2093[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class310 var76 = new class310(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    int var82 = var69 + class226.method586(var78 & 0x7, var79 & 0x7, var63);
                                                    int var84 = var78 & 0x7;
                                                    int var85 = var79 & 0x7;
                                                    int var87 = var63 & 0x3;
                                                    int var88;
                                                    if (var87 == 0) {
                                                        var88 = var85;
                                                    } else if (var87 == 1) {
                                                        var88 = 7 - var84;
                                                    } else if (var87 == 2) {
                                                        var88 = 7 - var85;
                                                    } else {
                                                        var88 = var84;
                                                    }
                                                    class65.method3442(var76, var57, var82, var70 + var88, 0, 0, var63);
                                                } else {
                                                    class65.method3442(var76, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            class65.method4956(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var89 = 0; var89 < 13; var89++) {
                for (int var90 = 0; var90 < 13; var90++) {
                    int var91 = field740[0][var89][var90];
                    if (var91 == -1) {
                        class65.method442(var89 * 8, var90 * 8, 8, 8);
                    }
                }
            }
            method4968(true);
            for (int var92 = 0; var92 < 4; var92++) {
                method2152();
                for (int var93 = 0; var93 < 13; var93++) {
                    label363: for (int var94 = 0; var94 < 13; var94++) {
                        int var95 = field740[var92][var93][var94];
                        if (var95 != -1) {
                            int var96 = var95 >> 24 & 0x3;
                            int var97 = var95 >> 1 & 0x3;
                            int var98 = var95 >> 14 & 0x3FF;
                            int var99 = var95 >> 3 & 0x7FF;
                            int var100 = (var98 / 8 << 8) + var99 / 8;
                            for (int var101 = 0; var101 < Statics.field3311.length; var101++) {
                                if (Statics.field3311[var101] == var100 && Statics.field133[var101] != null) {
                                    byte[] var102 = Statics.field133[var101];
                                    int var103 = var93 * 8;
                                    int var104 = var94 * 8;
                                    int var105 = (var98 & 0x7) * 8;
                                    int var106 = (var99 & 0x7) * 8;
                                    class143 var107 = Statics.field61;
                                    class182[] var108 = field738;
                                    class310 var109 = new class310(var102);
                                    int var110 = -1;
                                    while (true) {
                                        int var111 = var109.method5152();
                                        if (var111 == 0) {
                                            continue label363;
                                        }
                                        var110 += var111;
                                        int var112 = 0;
                                        while (true) {
                                            int var113 = var109.method5151();
                                            if (var113 == 0) {
                                                break;
                                            }
                                            var112 += var113 - 1;
                                            int var114 = var112 & 0x3F;
                                            int var115 = var112 >> 6 & 0x3F;
                                            int var116 = var112 >> 12;
                                            int var117 = var109.method5137();
                                            int var118 = var117 >> 2;
                                            int var119 = var117 & 0x3;
                                            if (var96 == var116 && var115 >= var105 && var115 < var105 + 8 && var114 >= var106 && var114 < var106 + 8) {
                                                class264 var120 = class264.method363(var110);
                                                int var121 = var103 + class226.method3425(var115 & 0x7, var114 & 0x7, var97, var120.field3360, var120.field3361, var119);
                                                int var122 = var104 + class226.method136(var115 & 0x7, var114 & 0x7, var97, var120.field3360, var120.field3361, var119);
                                                if (var121 > 0 && var122 > 0 && var121 < 103 && var122 < 103) {
                                                    int var123 = var92;
                                                    if ((class65.field536[1][var121][var122] & 0x2) == 2) {
                                                        var123 = var92 - 1;
                                                    }
                                                    class182 var124 = null;
                                                    if (var123 >= 0) {
                                                        var124 = var108[var123];
                                                    }
                                                    class65.method5117(var92, var121, var122, var110, var97 + var119 & 0x3, var118, var107, var124);
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
        }
        method4968(true);
        method2152();
        class65.method218(Statics.field61, field738);
        method4968(true);
        int var125 = class65.field538;
        if (var125 > Statics.field611) {
            var125 = Statics.field611;
        }
        if (var125 < Statics.field611 - 1) {
            int var126 = Statics.field611 - 1;
        }
        if (field685) {
            Statics.field61.method2914(class65.field538);
        } else {
            Statics.field61.method2914(0);
        }
        for (int var127 = 0; var127 < 104; var127++) {
            for (int var128 = 0; var128 < 104; var128++) {
                method1716(var127, var128);
            }
        }
        method2152();
        method1085();
        class264.field3348.method3141();
        if (Statics.field319.method884()) {
            class197 var129 = class197.method3105(class193.field2216, field762.field1341);
            var129.field2339.method5279(1057001181);
            field762.method2171(var129);
        }
        if (!field739) {
            int var130 = (Statics.field586 - 6) / 8;
            int var131 = (Statics.field586 + 6) / 8;
            int var132 = (Statics.field530 - 6) / 8;
            int var133 = (Statics.field530 + 6) / 8;
            for (int var134 = var130 - 1; var134 <= var131 + 1; var134++) {
                for (int var135 = var132 - 1; var135 <= var133 + 1; var135++) {
                    if (var134 < var130 || var134 > var131 || var135 < var132 || var135 > var133) {
                        Statics.field163.method3905("m" + var134 + "_" + var135);
                        Statics.field163.method3905("l" + var134 + "_" + var135);
                    }
                }
            }
        }
        method1137(30);
        method2152();
        Statics.field539 = (byte[][][]) null;
        Statics.field4062 = (byte[][][]) null;
        Statics.field540 = (byte[][][]) null;
        Statics.field541 = (byte[][][]) null;
        Statics.field405 = (int[][][]) null;
        Statics.field1463 = (byte[][][]) null;
        Statics.field546 = (int[][]) null;
        Statics.field117 = null;
        Statics.field2006 = null;
        Statics.field3307 = null;
        Statics.field555 = null;
        Statics.field1087 = null;
        class197 var136 = class197.method3105(class193.field2242, field762.field1341);
        field762.method2171(var136);
        Statics.field473.method3246();
        for (int var137 = 0; var137 < 32; var137++) {
            field482[var137] = 0L;
        }
        for (int var138 = 0; var138 < 32; var138++) {
            field483[var138] = 0L;
        }
        Statics.field1878 = 0;
    }

    @ObfuscatedName("bv.hi(IIIIIB)V")
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field61.method2939(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field61.method2943(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class138.method2405(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field3791.field3897;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class138.method351(var5);
            class264 var14 = class264.method363(var13);
            if (var14.field3392 == -1) {
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
                class334 var15 = Statics.field2010[var14.field3392];
                if (var15 != null) {
                    int var16 = (var14.field3360 * 4 - var15.field3884) / 2;
                    int var17 = (var14.field3361 * 4 - var15.field3886) / 2;
                    var15.method5717(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3361) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field61.method2941(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field61.method2943(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class138.method351(var18);
            class264 var24 = class264.method363(var23);
            if (var24.field3392 != -1) {
                class334 var25 = Statics.field2010[var24.field3392];
                if (var25 != null) {
                    int var26 = (var24.field3360 * 4 - var25.field3884) / 2;
                    int var27 = (var24.field3361 * 4 - var25.field3886) / 2;
                    var25.method5717(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3361) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class138.method2405(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field3791.field3897;
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
        long var31 = Statics.field61.method3059(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class138.method351(var31);
        class264 var34 = class264.method363(var33);
        if (var34.field3392 == -1) {
            return;
        }
        class334 var35 = Statics.field2010[var34.field3392];
        if (var35 != null) {
            int var36 = (var34.field3360 * 4 - var35.field3884) / 2;
            int var37 = (var34.field3361 * 4 - var35.field3886) / 2;
            var35.method5717(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3361) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hl(Ldv;I)Z")
    public final boolean method1350(class105 arg0) {
        class315 var2 = arg0.method2169();
        class309 var3 = arg0.field1338;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1333 == null) {
                if (arg0.field1336) {
                    if (!var2.method3289(1)) {
                        return false;
                    }
                    var2.method3296(arg0.field1338.field3710, 0, 1);
                    arg0.field1339 = 0;
                    arg0.field1336 = false;
                }
                var3.field3711 = 0;
                if (var3.method5087()) {
                    if (!var2.method3289(1)) {
                        return false;
                    }
                    var2.method3296(arg0.field1338.field3710, 1, 1);
                    arg0.field1339 = 0;
                }
                arg0.field1336 = true;
                class192[] var4 = class192.method782();
                int var5 = var3.method5084();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3711);
                }
                arg0.field1333 = var4[var5];
                arg0.field1334 = arg0.field1333.field2206;
            }
            if (arg0.field1334 == -1) {
                if (!var2.method3289(1)) {
                    return false;
                }
                arg0.method2169().method3296(var3.field3710, 0, 1);
                arg0.field1334 = var3.field3710[0] & 0xFF;
            }
            if (arg0.field1334 == -2) {
                if (!var2.method3289(2)) {
                    return false;
                }
                arg0.method2169().method3296(var3.field3710, 0, 2);
                var3.field3711 = 0;
                arg0.field1334 = var3.method5139();
            }
            if (!var2.method3289(arg0.field1334)) {
                return false;
            }
            var3.field3711 = 0;
            var2.method3296(var3.field3710, 0, arg0.field1334);
            arg0.field1339 = 0;
            field797.method4655();
            arg0.field1340 = arg0.field1330;
            arg0.field1330 = arg0.field1335;
            arg0.field1335 = arg0.field1333;
            if (class192.field2205 == arg0.field1333) {
                int var6 = var3.method5177();
                int var7 = var3.method5201();
                class222.field2525[var6] = var7;
                if (class222.field2527[var6] != var7) {
                    class222.field2527[var6] = var7;
                }
                method223(var6);
                field867[++field773 - 1 & 0x1F] = var6;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2130 == arg0.field1333) {
                int var8 = var3.method5137();
                int var9 = var3.method5137();
                int var10 = var3.method5137();
                int var11 = var3.method5137();
                field927[var8] = true;
                field789[var8] = var9;
                field731[var8] = var10;
                field930[var8] = var11;
                field931[var8] = 0;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1333) {
                method683(class195.field2326);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1333) {
                field889 = true;
                Statics.field1146 = var3.method5137();
                Statics.field218 = var3.method5137();
                Statics.field21 = var3.method5139();
                Statics.field65 = var3.method5137();
                Statics.field3127 = var3.method5137();
                if (Statics.field3127 >= 100) {
                    Statics.field221 = Statics.field1146 * 128 + 64;
                    Statics.field2373 = Statics.field218 * 128 + 64;
                    Statics.field64 = method4641(Statics.field221, Statics.field2373, Statics.field611) - Statics.field21;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1333) {
                field863 = var3.method5167();
                field897 = var3.method5167();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2145 == arg0.field1333) {
                Statics.field1253.method1781(var3, arg0.field1334);
                field874 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1333) {
                int var12 = var3.method5127();
                int var13 = var3.method5127();
                int var14 = var3.method5184();
                class227 var15 = class227.method3572(var14);
                var15.field2624 = (var12 << 16) + var13;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2146 == arg0.field1333) {
                field890 = var3.method5137();
                if (field890 == 1) {
                    field699 = var3.method5139();
                }
                if (field890 >= 2 && field890 <= 6) {
                    if (field890 == 2) {
                        field704 = 64;
                        field705 = 64;
                    }
                    if (field890 == 3) {
                        field704 = 0;
                        field705 = 64;
                    }
                    if (field890 == 4) {
                        field704 = 128;
                        field705 = 64;
                    }
                    if (field890 == 5) {
                        field704 = 64;
                        field705 = 0;
                    }
                    if (field890 == 6) {
                        field704 = 64;
                        field705 = 128;
                    }
                    field890 = 2;
                    field701 = var3.method5139();
                    field764 = var3.method5139();
                    field703 = var3.method5137();
                }
                if (field890 == 10) {
                    field801 = var3.method5139();
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2120 == arg0.field1333) {
                int var16 = var3.method5127();
                byte var17 = var3.method5171();
                class222.field2525[var16] = var17;
                if (class222.field2527[var16] != var17) {
                    class222.field2527[var16] = var17;
                }
                method223(var16);
                field867[++field773 - 1 & 0x1F] = var16;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2126 == arg0.field1333) {
                method683(class195.field2329);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2165 == arg0.field1333) {
                boolean var18 = var3.method5272();
                if (!var18) {
                    Statics.field223 = null;
                } else if (Statics.field223 == null) {
                    Statics.field223 = new class248();
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2147 == arg0.field1333) {
                int var19 = var3.method5139();
                field925 = var19;
                this.method1256(false);
                method51(var19);
                class86.method315(field925);
                for (int var20 = 0; var20 < 100; var20++) {
                    field680[var20] = true;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1333) {
                int var21 = var3.method5142();
                int var22 = var3.method5176();
                class227 var23 = class227.method3572(var21);
                if (var23.field2611 != 1 || var23.field2612 != var22) {
                    var23.field2611 = 1;
                    var23.field2612 = var22;
                    method1117(var23);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2122 == arg0.field1333) {
                int var24 = var3.method5137();
                method1213(var24);
                arg0.field1333 = null;
                return false;
            }
            if (class192.field2198 == arg0.field1333) {
                method683(class195.field2332);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1333) {
                method3673();
                arg0.field1333 = null;
                return false;
            }
            if (class192.field2203 == arg0.field1333) {
                field918 = var3.method5139() * 30;
                field878 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2162 == arg0.field1333) {
                method683(class195.field2330);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1333) {
                method810();
                field849 = var3.method5140();
                field878 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1333) {
                method683(class195.field2324);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1333) {
                int var25 = var3.method5142();
                int var26 = var3.method5139();
                if (var25 < -70000) {
                    var26 += 32768;
                }
                class227 var27;
                if (var25 >= 0) {
                    var27 = class227.method3572(var25);
                } else {
                    var27 = null;
                }
                if (var27 != null) {
                    for (int var28 = 0; var28 < var27.field2672.length; var28++) {
                        var27.field2672[var28] = 0;
                        var27.field2693[var28] = 0;
                    }
                }
                class69.method1242(var26);
                int var29 = var3.method5139();
                for (int var30 = 0; var30 < var29; var30++) {
                    int var31 = var3.method5177();
                    int var32 = var3.method5167();
                    if (var32 == 255) {
                        var32 = var3.method5184();
                    }
                    if (var27 != null && var30 < var27.field2672.length) {
                        var27.field2672[var30] = var31;
                        var27.field2693[var30] = var32;
                    }
                    class69.method2129(var26, var30, var31 - 1, var32);
                }
                if (var27 != null) {
                    method1117(var27);
                }
                method810();
                field869[++field870 - 1 & 0x1F] = var26 & 0x7FFF;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2148 == arg0.field1333) {
                Statics.field1253.method1771();
                field874 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1333) {
                int var33 = var3.method5182();
                int var34 = var3.method5306();
                int var35 = var3.method5306();
                class227 var36 = class227.method3572(var33);
                if (var36.field2577 != var34 || var36.field2595 != var35 || var36.field2573 != 0 || var36.field2574 != 0) {
                    var36.field2577 = var34;
                    var36.field2595 = var35;
                    var36.field2573 = 0;
                    var36.field2574 = 0;
                    method1117(var36);
                    this.method1257(var36);
                    if (var36.field2570 == 0) {
                        method1005(Statics.field2694[var33 >> 16], var36, false);
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1333) {
                boolean var37 = var3.method5137() == 1;
                if (var37) {
                    Statics.field1803 = Statics.method3668() - var3.method5143();
                    Statics.field85 = new class16(var3, true);
                } else {
                    Statics.field85 = null;
                }
                field727 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1333) {
                String var38 = var3.method5257();
                long var39 = var3.method5143();
                long var41 = (long) var3.method5139();
                long var43 = (long) var3.method5264();
                class239 var45 = (class239) class205.method129(class239.method1122(), var3.method5137());
                long var46 = (var41 << 32) + var43;
                boolean var48 = false;
                for (int var49 = 0; var49 < 100; var49++) {
                    if (field847[var49] == var46) {
                        var48 = true;
                        break;
                    }
                }
                if (var45.field3096 && Statics.field1253.method1776(new class293(var38, Statics.field165))) {
                    var48 = true;
                }
                if (!var48 && field795 == 0) {
                    field847[field901] = var46;
                    field901 = (field901 + 1) % 100;
                    String var50 = class306.method4986(class301.method2406(class220.method3269(var3)));
                    if (var45.field3089 == -1) {
                        class101.method2151(9, var38, var50, Statics.method5354(var39));
                    } else {
                        class101.method2151(9, class91.method15(var45.field3089) + var38, var50, Statics.method5354(var39));
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1333) {
                int var51 = var3.method5127();
                int var52 = var3.method5142();
                int var53 = var51 >> 10 & 0x1F;
                int var54 = var51 >> 5 & 0x1F;
                int var55 = var51 & 0x1F;
                int var56 = (var55 << 3) + (var53 << 19) + (var54 << 11);
                class227 var57 = class227.method3572(var52);
                if (var57.field2593 != var56) {
                    var57.field2593 = var56;
                    method1117(var57);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2138 == arg0.field1333) {
                int var58 = var3.method5142();
                if (field763 != var58) {
                    field763 = var58;
                    method33();
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1333) {
                field889 = false;
                for (int var59 = 0; var59 < 5; var59++) {
                    field927[var59] = false;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2144 == arg0.field1333) {
                field911 = var3.method5137();
                if (field911 == 255) {
                    field911 = 0;
                }
                field912 = var3.method5137();
                if (field912 == 255) {
                    field912 = 0;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2154 == arg0.field1333) {
                int var60 = var3.method5142();
                int var61 = var3.method5139();
                if (var60 < -70000) {
                    var61 += 32768;
                }
                class227 var62;
                if (var60 >= 0) {
                    var62 = class227.method3572(var60);
                } else {
                    var62 = null;
                }
                while (var3.field3711 < arg0.field1334) {
                    int var63 = var3.method5151();
                    int var64 = var3.method5139();
                    int var65 = 0;
                    if (var64 != 0) {
                        var65 = var3.method5137();
                        if (var65 == 255) {
                            var65 = var3.method5142();
                        }
                    }
                    if (var62 != null && var63 >= 0 && var63 < var62.field2672.length) {
                        var62.field2672[var63] = var64;
                        var62.field2693[var63] = var65;
                    }
                    class69.method2129(var61, var63, var64 - 1, var65);
                }
                if (var62 != null) {
                    method1117(var62);
                }
                method810();
                field869[++field870 - 1 & 0x1F] = var61 & 0x7FFF;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2134 == arg0.field1333) {
                int var66 = var3.method5142();
                String var67 = var3.method5257();
                class227 var68 = class227.method3572(var66);
                if (!var67.equals(var68.field2629)) {
                    var68.field2629 = var67;
                    method1117(var68);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1333) {
                int var69 = var3.method5177();
                if (var69 == 65535) {
                    var69 = -1;
                }
                method3864(var69);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1333) {
                int var70 = var3.method5264();
                int var71 = var3.method5139();
                if (var71 == 65535) {
                    var71 = -1;
                }
                method4047(var71, var70);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2169 == arg0.field1333) {
                int var72 = var3.method5176();
                int var73 = var3.method5182();
                int var74 = var3.method5177();
                int var75 = var3.method5139();
                class227 var76 = class227.method3572(var73);
                if (var76.field2619 != var75 || var76.field2620 != var72 || var76.field2660 != var74) {
                    var76.field2619 = var75;
                    var76.field2620 = var72;
                    var76.field2660 = var74;
                    method1117(var76);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1333) {
                if (Statics.field597 != null) {
                    Statics.field597.method4877(var3);
                }
                method233();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2156 == arg0.field1333) {
                method810();
                int var77 = var3.method5167();
                int var78 = var3.method5166();
                int var79 = var3.method5182();
                field822[var78] = var79;
                field687[var78] = var77;
                field753[var78] = 1;
                for (int var80 = 0; var80 < 98; var80++) {
                    if (var79 >= class231.field2748[var80]) {
                        field753[var78] = var80 + 2;
                    }
                }
                field871[++field793 - 1 & 0x1F] = var78;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2183 == arg0.field1333) {
                int var81 = var3.method5167();
                int var82 = var3.method5176();
                int var83 = var3.method5201();
                class71 var84 = (class71) field842.method5561((long) var83);
                if (var84 != null) {
                    method581(var84, var84.field600 != var82);
                }
                method346(var83, var82, var81);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1333) {
                byte[] var85 = new byte[arg0.field1334];
                var3.method5079(var85, 0, var85.length);
                class310 var86 = new class310(var85);
                String var87 = var86.method5257();
                class61.method2135(var87, true, false);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2151 == arg0.field1333) {
                method683(class195.field2331);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2155 == arg0.field1333) {
                if (field925 != -1) {
                    method3412(field925, 0);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1333) {
                var3.field3711 += 28;
                if (var3.method5134()) {
                    method3098(var3, var3.field3711 - 28);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2153 == arg0.field1333) {
                method1172(var3.method5257());
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2142 == arg0.field1333) {
                method683(class195.field2325);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2199 == arg0.field1333) {
                method683(class195.field2327);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1333) {
                class81 var88 = new class81();
                var88.field1052 = var3.method5257();
                var88.field1041 = var3.method5139();
                int var89 = var3.method5142();
                var88.field1050 = var89;
                method1137(45);
                var2.method3285();
                Object var90 = null;
                class95.method3227(var88);
                arg0.field1333 = null;
                return false;
            }
            if (class192.field2127 == arg0.field1333) {
                int var91 = var3.method5306();
                int var92 = var3.method5184();
                class227 var93 = class227.method3572(var92);
                if (var93.field2615 != var91 || var91 == -1) {
                    var93.field2615 = var91;
                    var93.field2588 = 0;
                    var93.field2697 = 0;
                    method1117(var93);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2133 == arg0.field1333) {
                int var94 = var3.method5139();
                int var95 = var3.method5137();
                int var96 = var3.method5139();
                method3100(var94, var95, var96);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1333) {
                Statics.field3960 = var3.method5168();
                Statics.field92 = var3.method5168();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1333) {
                field889 = true;
                Statics.field926 = var3.method5137();
                Statics.field2760 = var3.method5137();
                Statics.field1550 = var3.method5139();
                Statics.field3627 = var3.method5137();
                Statics.field1281 = var3.method5137();
                if (Statics.field1281 >= 100) {
                    int var97 = Statics.field926 * 128 + 64;
                    int var98 = Statics.field2760 * 128 + 64;
                    int var99 = method4641(var97, var98, Statics.field611) - Statics.field1550;
                    int var100 = var97 - Statics.field221;
                    int var101 = var99 - Statics.field64;
                    int var102 = var98 - Statics.field2373;
                    int var103 = (int) Math.sqrt((double) (var100 * var100 + var102 * var102));
                    Statics.field639 = (int) (Math.atan2((double) var101, (double) var103) * 325.949D) & 0x7FF;
                    Statics.field231 = (int) (Math.atan2((double) var100, (double) var102) * -325.949D) & 0x7FF;
                    if (Statics.field639 < 128) {
                        Statics.field639 = 128;
                    }
                    if (Statics.field639 > 383) {
                        Statics.field639 = 383;
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2140 == arg0.field1333) {
                method3121(false, arg0.field1338);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2141 == arg0.field1333) {
                int var104 = var3.method5201();
                int var105 = var3.method5176();
                class227 var106 = class227.method3572(var104);
                if (var106.field2611 != 2 || var106.field2612 != var105) {
                    var106.field2611 = 2;
                    var106.field2612 = var105;
                    method1117(var106);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2129 == arg0.field1333) {
                for (int var107 = 0; var107 < class222.field2527.length; var107++) {
                    if (class222.field2527[var107] != class222.field2525[var107]) {
                        class222.field2527[var107] = class222.field2525[var107];
                        method223(var107);
                        field867[++field773 - 1 & 0x1F] = var107;
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2131 == arg0.field1333) {
                method3121(true, arg0.field1338);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2197 == arg0.field1333) {
                int var108 = var3.method5201();
                boolean var109 = var3.method5137() == 1;
                class227 var110 = class227.method3572(var108);
                if (var110.field2630 != var109) {
                    var110.field2630 = var109;
                    method1117(var110);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2143 == arg0.field1333) {
                String var111 = var3.method5257();
                String var112 = class306.method4986(class301.method2406(class220.method3269(var3)));
                class101.method2911(6, var111, var112);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1333) {
                Statics.field3960 = var3.method5168();
                Statics.field92 = var3.method5137();
                while (var3.field3711 < arg0.field1334) {
                    int var113 = var3.method5137();
                    class195 var114 = class195.method362()[var113];
                    method683(var114);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2132 == arg0.field1333) {
                if (arg0.field1334 == 0) {
                    Statics.field597 = null;
                } else {
                    if (Statics.field597 == null) {
                        Statics.field597 = new class295(Statics.field165, Statics.field319);
                    }
                    Statics.field597.method4876(var3);
                }
                method233();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2149 == arg0.field1333) {
                String var115 = var3.method5257();
                long var116 = (long) var3.method5139();
                long var118 = (long) var3.method5264();
                class239 var120 = (class239) class205.method129(class239.method1122(), var3.method5137());
                long var121 = (var116 << 32) + var118;
                boolean var123 = false;
                for (int var124 = 0; var124 < 100; var124++) {
                    if (field847[var124] == var121) {
                        var123 = true;
                        break;
                    }
                }
                if (Statics.field1253.method1776(new class293(var115, Statics.field165))) {
                    var123 = true;
                }
                if (!var123 && field795 == 0) {
                    field847[field901] = var121;
                    field901 = (field901 + 1) % 100;
                    String var125 = class306.method4986(class301.method2406(class220.method3269(var3)));
                    byte var126;
                    if (var120.field3087) {
                        var126 = 7;
                    } else {
                        var126 = 3;
                    }
                    if (var120.field3089 == -1) {
                        class101.method2911(var126, var115, var125);
                    } else {
                        class101.method2911(var126, class91.method15(var120.field3089) + var115, var125);
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1333) {
                int var127 = var3.method5177();
                if (var127 == 65535) {
                    var127 = -1;
                }
                int var128 = var3.method5182();
                int var129 = var3.method5184();
                class227 var130 = class227.method3572(var129);
                if (var130.field2567) {
                    var130.field2705 = var127;
                    var130.field2695 = var128;
                    class265 var132 = class265.method337(var127);
                    var130.field2619 = var132.field3412;
                    var130.field2620 = var132.field3430;
                    var130.field2658 = var132.field3414;
                    var130.field2617 = var132.field3415;
                    var130.field2618 = var132.field3446;
                    var130.field2660 = var132.field3411;
                    if (var132.field3419 == 1) {
                        var130.field2627 = 1;
                    } else {
                        var130.field2627 = 2;
                    }
                    if (var130.field2623 > 0) {
                        var130.field2660 = var130.field2660 * 32 / var130.field2623;
                    } else if (var130.field2580 > 0) {
                        var130.field2660 = var130.field2660 * 32 / var130.field2580;
                    }
                    method1117(var130);
                } else if (var127 == -1) {
                    var130.field2611 = 0;
                    arg0.field1333 = null;
                    return true;
                } else {
                    class265 var131 = class265.method337(var127);
                    var130.field2611 = 4;
                    var130.field2612 = var127;
                    var130.field2619 = var131.field3412;
                    var130.field2620 = var131.field3430;
                    var130.field2660 = var131.field3411 * 100 / var128;
                    method1117(var130);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1333) {
                method182(false, var3);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1333) {
                method810();
                field848 = var3.method5137();
                field878 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2193 == arg0.field1333) {
                String var133 = var3.method5257();
                int var134 = var3.method5167();
                int var135 = var3.method5166();
                if (var135 >= 1 && var135 <= 8) {
                    if (var133.equalsIgnoreCase(class234.field2765)) {
                        var133 = null;
                    }
                    field805[var135 - 1] = var133;
                    field806[var135 - 1] = var134 == 0;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2164 == arg0.field1333) {
                Statics.field1997 = class320.method3685(var3.method5137());
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2150 == arg0.field1333) {
                method683(class195.field2333);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2157 == arg0.field1333) {
                method683(class195.field2328);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2128 == arg0.field1333) {
                field913 = var3.method5137();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1333) {
                int var136 = arg0.field1334 + var3.field3711;
                int var137 = var3.method5139();
                int var138 = var3.method5139();
                if (field925 != var137) {
                    field925 = var137;
                    this.method1256(false);
                    method51(field925);
                    class86.method315(field925);
                    for (int var139 = 0; var139 < 100; var139++) {
                        field680[var139] = true;
                    }
                }
                while (var138-- > 0) {
                    int var140 = var3.method5142();
                    int var141 = var3.method5139();
                    int var142 = var3.method5137();
                    class71 var143 = (class71) field842.method5561((long) var140);
                    if (var143 != null && var143.field600 != var141) {
                        method581(var143, true);
                        var143 = null;
                    }
                    if (var143 == null) {
                        var143 = method346(var140, var141, var142);
                    }
                    var143.field595 = true;
                }
                for (class71 var144 = (class71) field842.method5546(); var144 != null; var144 = (class71) field842.method5554()) {
                    if (var144.field595) {
                        var144.field595 = false;
                    } else {
                        method581(var144, true);
                    }
                }
                field751 = new class328(512);
                while (var3.field3711 < var136) {
                    int var145 = var3.method5142();
                    int var146 = var3.method5139();
                    int var147 = var3.method5139();
                    int var148 = var3.method5142();
                    for (int var149 = var146; var149 <= var147; var149++) {
                        long var150 = ((long) var145 << 32) + (long) var149;
                        field751.method5548(new class189(var148), var150);
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1333) {
                int var152 = var3.method5142();
                class71 var153 = (class71) field842.method5561((long) var152);
                if (var153 != null) {
                    method581(var153, true);
                }
                if (field883 != null) {
                    method1117(field883);
                    field883 = null;
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2135 == arg0.field1333) {
                Statics.field92 = var3.method5137();
                Statics.field3960 = var3.method5168();
                for (int var154 = Statics.field92; var154 < Statics.field92 + 8; var154++) {
                    for (int var155 = Statics.field3960; var155 < Statics.field3960 + 8; var155++) {
                        if (field809[Statics.field611][var154][var155] != null) {
                            field809[Statics.field611][var154][var155] = null;
                            method1716(var154, var155);
                        }
                    }
                }
                for (class78 var156 = (class78) field698.method4559(); var156 != null; var156 = (class78) field698.method4577()) {
                    if (var156.field961 >= Statics.field92 && var156.field961 < Statics.field92 + 8 && var156.field962 >= Statics.field3960 && var156.field962 < Statics.field3960 + 8 && Statics.field611 == var156.field963) {
                        var156.field970 = 0;
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1333) {
                for (int var157 = 0; var157 < Statics.field3205; var157++) {
                    class251 var158 = class251.method3836(var157);
                    if (var158 != null) {
                        class222.field2525[var157] = 0;
                        class222.field2527[var157] = 0;
                    }
                }
                method810();
                field773 += 32;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2137 == arg0.field1333) {
                int var159 = var3.method5137();
                method226(var159);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1333) {
                int var160 = var3.method5127();
                int var161 = var3.method5182();
                class227 var162 = class227.method3572(var161);
                if (var162 != null && var162.field2570 == 0) {
                    if (var160 > var162.field2598 - var162.field2643) {
                        var160 = var162.field2598 - var162.field2643;
                    }
                    if (var160 < 0) {
                        var160 = 0;
                    }
                    if (var162.field2590 != var160) {
                        var162.field2590 = var160;
                        method1117(var162);
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1333) {
                class106.method139(var3, arg0.field1334);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2119 == arg0.field1333) {
                int var163 = var3.method5127();
                class69.method1086(var163);
                field869[++field870 - 1 & 0x1F] = var163 & 0x7FFF;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2121 == arg0.field1333) {
                method182(true, var3);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2123 == arg0.field1333) {
                int var164 = var3.method5142();
                int var165 = var3.method5142();
                int var166 = class63.method3348();
                class197 var167 = class197.method3105(class193.field2219, field762.field1341);
                var167.field2339.method5181(var164);
                var167.field2339.method5180(var165);
                var167.field2339.method5290(field480);
                var167.field2339.method5290(var166);
                field762.method2171(var167);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2139 == arg0.field1333) {
                Statics.field1253.field1094.method4740(var3, arg0.field1334);
                method4957();
                field874 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1333) {
                class99.method50(var3, arg0.field1334);
                method1982();
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1333) {
                int var168 = var3.method5182();
                class227 var169 = class227.method3572(var168);
                for (int var170 = 0; var170 < var169.field2672.length; var170++) {
                    var169.field2672[var170] = -1;
                    var169.field2672[var170] = 0;
                }
                method1117(var169);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2202 == arg0.field1333) {
                int var171 = var3.method5127();
                if (var171 == 65535) {
                    var171 = -1;
                }
                int var172 = var3.method5201();
                int var173 = var3.method5142();
                int var174 = var3.method5177();
                if (var174 == 65535) {
                    var174 = -1;
                }
                for (int var175 = var171; var175 <= var174; var175++) {
                    long var176 = ((long) var172 << 32) + (long) var175;
                    class190 var178 = field751.method5561(var176);
                    if (var178 != null) {
                        var178.method3355();
                    }
                    field751.method5548(new class189(var173), var176);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2124 == arg0.field1333) {
                int var179 = var3.method5184();
                class227 var180 = class227.method3572(var179);
                var180.field2611 = 3;
                var180.field2612 = Statics.field3718.field647.method3728();
                method1117(var180);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1333) {
                String var181 = var3.method5257();
                Object[] var182 = new Object[var181.length() + 1];
                for (int var183 = var181.length() - 1; var183 >= 0; var183--) {
                    if (var181.charAt(var183) == 's') {
                        var182[var183 + 1] = var3.method5257();
                    } else {
                        var182[var183 + 1] = Integer.valueOf(var3.method5142());
                    }
                }
                var182[0] = Integer.valueOf(var3.method5142());
                class72 var184 = new class72();
                var184.field603 = var182;
                class86.method1239(var184);
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2158 == arg0.field1333) {
                int var185 = var3.method5151();
                boolean var186 = var3.method5137() == 1;
                String var187 = "";
                boolean var188 = false;
                if (var186) {
                    var187 = var3.method5257();
                    if (Statics.field1253.method1776(new class293(var187, Statics.field165))) {
                        var188 = true;
                    }
                }
                String var189 = var3.method5257();
                if (!var188) {
                    class101.method2911(var185, var187, var189);
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2152 == arg0.field1333) {
                for (int var190 = 0; var190 < field791.length; var190++) {
                    if (field791[var190] != null) {
                        field791[var190].field1017 = -1;
                    }
                }
                for (int var191 = 0; var191 < field722.length; var191++) {
                    if (field722[var191] != null) {
                        field722[var191].field1017 = -1;
                    }
                }
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1333) {
                int var192 = var3.method5137();
                if (var3.method5137() == 0) {
                    field949[var192] = new class19();
                    var3.field3711 += 18;
                } else {
                    var3.field3711--;
                    field949[var192] = new class19(var3, false);
                }
                field775 = field866;
                arg0.field1333 = null;
                return true;
            }
            if (class192.field2125 == arg0.field1333) {
                int var193 = var3.method5201();
                int var194 = var3.method5142();
                class71 var195 = (class71) field842.method5561((long) var194);
                class71 var196 = (class71) field842.method5561((long) var193);
                if (var196 != null) {
                    method581(var196, var195 == null || var195.field600 != var196.field600);
                }
                if (var195 != null) {
                    var195.method3355();
                    field842.method5548(var195, (long) var193);
                }
                class227 var197 = class227.method3572(var194);
                if (var197 != null) {
                    method1117(var197);
                }
                class227 var198 = class227.method3572(var193);
                if (var198 != null) {
                    method1117(var198);
                    method1005(Statics.field2694[var198.field2568 >>> 16], var198, true);
                }
                if (field925 != -1) {
                    method3412(field925, 1);
                }
                arg0.field1333 = null;
                return true;
            }
            class351.method3842("" + (arg0.field1333 == null ? -1 : arg0.field1333.field2136) + class91.field1162 + (arg0.field1330 == null ? -1 : arg0.field1330.field2136) + class91.field1162 + (arg0.field1340 == null ? -1 : arg0.field1340.field2136) + class91.field1162 + arg0.field1334, (Throwable) null);
            method3673();
        } catch (IOException var203) {
            method2829();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1333 == null ? -1 : arg0.field1333.field2136) + class91.field1162 + (arg0.field1330 == null ? -1 : arg0.field1330.field2136) + class91.field1162 + (arg0.field1340 == null ? -1 : arg0.field1340.field2136) + class91.field1162 + arg0.field1334 + class91.field1162 + (Statics.field591 + Statics.field3718.field1029[0]) + class91.field1162 + (Statics.field1153 + Statics.field3718.field1030[0]) + class91.field1162;
            for (int var202 = 0; var202 < arg0.field1334 && var202 < 50; var202++) {
                var201 = var201 + var3.field3710[var202] + class91.field1162;
            }
            class351.method3842(var201, var204);
            method3673();
        }
        return true;
    }

    @ObfuscatedName("ac.hq(Lgh;B)V")
    public static final void method683(class195 arg0) {
        class309 var1 = field762.field1338;
        if (class195.field2328 == arg0) {
            int var2 = var1.method5167();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field700[var3];
            int var6 = var1.method5137();
            int var7 = (var6 >> 4 & 0x7) + Statics.field92;
            int var8 = (var6 & 0x7) + Statics.field3960;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                Statics.method2910(Statics.field611, var7, var8, var5, -1, var3, var4, 0, -1);
            }
            return;
        }
        if (class195.field2325 == arg0) {
            byte var9 = var1.method5171();
            int var10 = var1.method5177();
            int var11 = var1.method5139();
            int var12 = var1.method5177();
            int var13 = var1.method5167();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field700[var14];
            byte var17 = var1.method5138();
            int var18 = var1.method5166();
            int var19 = (var18 >> 4 & 0x7) + Statics.field92;
            int var20 = (var18 & 0x7) + Statics.field3960;
            byte var21 = var1.method5169();
            int var22 = var1.method5177();
            byte var23 = var1.method5169();
            class76 var24;
            if (field798 == var11) {
                var24 = Statics.field3718;
            } else {
                var24 = field791[var11];
            }
            if (var24 != null) {
                class264 var25 = class264.method363(var12);
                int var26;
                int var27;
                if (var15 == 1 || var15 == 3) {
                    var26 = var25.field3361;
                    var27 = var25.field3360;
                } else {
                    var26 = var25.field3360;
                    var27 = var25.field3361;
                }
                int var28 = (var26 >> 1) + var19;
                int var29 = (var26 + 1 >> 1) + var19;
                int var30 = (var27 >> 1) + var20;
                int var31 = (var27 + 1 >> 1) + var20;
                int[][] var32 = class65.field550[Statics.field611];
                int var33 = var32[var28][var30] + var32[var29][var30] + var32[var28][var31] + var32[var29][var31] >> 2;
                int var34 = (var19 << 7) + (var26 << 6);
                int var35 = (var20 << 7) + (var27 << 6);
                class137 var36 = var25.method4271(var14, var15, var32, var34, var33, var35);
                if (var36 != null) {
                    Statics.method2910(Statics.field611, var19, var20, var16, -1, 0, 0, var22 + 1, var10 + 1);
                    var24.field654 = field690 + var22;
                    var24.field655 = field690 + var10;
                    var24.field657 = var36;
                    var24.field663 = var19 * 128 + var26 * 64;
                    var24.field658 = var20 * 128 + var27 * 64;
                    var24.field656 = var33;
                    if (var17 > var21) {
                        byte var37 = var17;
                        var17 = var21;
                        var21 = var37;
                    }
                    if (var9 > var23) {
                        byte var38 = var9;
                        var9 = var23;
                        var23 = var38;
                    }
                    var24.field660 = var17 + var19;
                    var24.field662 = var19 + var21;
                    var24.field661 = var9 + var20;
                    var24.field665 = var20 + var23;
                }
            }
        }
        if (class195.field2332 == arg0) {
            int var39 = var1.method5168();
            int var40 = (var39 >> 4 & 0x7) + Statics.field92;
            int var41 = (var39 & 0x7) + Statics.field3960;
            int var42 = var1.method5139();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class272 var43 = field809[Statics.field611][var40][var41];
                if (var43 != null) {
                    for (class97 var44 = (class97) var43.method4559(); var44 != null; var44 = (class97) var43.method4577()) {
                        if ((var42 & 0x7FFF) == var44.field1255) {
                            var44.method3355();
                            break;
                        }
                    }
                    if (var43.method4559() == null) {
                        field809[Statics.field611][var40][var41] = null;
                    }
                    method1716(var40, var41);
                }
            }
        } else if (class195.field2330 == arg0) {
            int var45 = var1.method5139();
            int var46 = var1.method5177();
            int var47 = var1.method5127();
            int var48 = var1.method5137();
            int var49 = (var48 >> 4 & 0x7) + Statics.field92;
            int var50 = (var48 & 0x7) + Statics.field3960;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                class272 var51 = field809[Statics.field611][var49][var50];
                if (var51 != null) {
                    for (class97 var52 = (class97) var51.method4559(); var52 != null; var52 = (class97) var51.method4577()) {
                        if ((var46 & 0x7FFF) == var52.field1255 && var52.field1258 == var45) {
                            var52.field1258 = var47;
                            break;
                        }
                    }
                    method1716(var49, var50);
                }
            }
        } else if (class195.field2331 == arg0) {
            int var53 = var1.method5137();
            int var54 = (var53 >> 4 & 0x7) + Statics.field92;
            int var55 = (var53 & 0x7) + Statics.field3960;
            int var56 = var1.method5177();
            int var57 = var1.method5168();
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = field700[var58];
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                Statics.method2910(Statics.field611, var54, var55, var60, var56, var58, var59, 0, -1);
            }
        } else {
            if (class195.field2326 == arg0) {
                int var61 = var1.method5137();
                int var62 = var1.method5168();
                int var63 = (var62 >> 4 & 0x7) + Statics.field92;
                int var64 = (var62 & 0x7) + Statics.field3960;
                int var65 = var1.method5176();
                int var66 = var1.method5168();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var69 = var67 + 1;
                    if (Statics.field3718.field1029[0] >= var63 - var69 && Statics.field3718.field1029[0] <= var63 + var69 && Statics.field3718.field1030[0] >= var64 - var69 && Statics.field3718.field1030[0] <= var64 + var69 && field759 != 0 && var68 > 0 && field937 < 50) {
                        field880[field937] = var65;
                        field921[field937] = var68;
                        field877[field937] = var61;
                        field924[field937] = null;
                        field954[field937] = (var63 << 16) + (var64 << 8) + var67;
                        field937++;
                    }
                }
            }
            if (class195.field2324 == arg0) {
                int var70 = var1.method5176();
                int var71 = var1.method5127();
                int var72 = var1.method5137();
                int var73 = (var72 >> 4 & 0x7) + Statics.field92;
                int var74 = (var72 & 0x7) + Statics.field3960;
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class97 var75 = new class97();
                    var75.field1255 = var70;
                    var75.field1258 = var71;
                    if (field809[Statics.field611][var73][var74] == null) {
                        field809[Statics.field611][var73][var74] = new class272();
                    }
                    field809[Statics.field611][var73][var74].method4580(var75);
                    method1716(var73, var74);
                }
            } else if (class195.field2333 == arg0) {
                int var76 = var1.method5176();
                int var77 = var1.method5168() * 4;
                int var78 = var1.method5167() * 4;
                int var79 = var1.method5167();
                byte var80 = var1.method5170();
                int var81 = var1.method5177();
                int var82 = var1.method5127();
                int var83 = var1.method5137();
                int var84 = (var83 >> 4 & 0x7) + Statics.field92;
                int var85 = (var83 & 0x7) + Statics.field3960;
                int var86 = var1.method5137();
                int var87 = var1.method5140();
                byte var88 = var1.method5170();
                int var89 = var80 + var84;
                int var90 = var85 + var88;
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104 && var81 != 65535) {
                    int var91 = var84 * 128 + 64;
                    int var92 = var85 * 128 + 64;
                    int var93 = var89 * 128 + 64;
                    int var94 = var90 * 128 + 64;
                    class96 var95 = new class96(var81, Statics.field611, var91, var92, method4641(var91, var92, Statics.field611) - var78, field690 + var82, field690 + var76, var79, var86, var87, var77);
                    var95.method2012(var93, var94, method4641(var93, var94, Statics.field611) - var77, field690 + var82);
                    field811.method4580(var95);
                }
            } else if (class195.field2327 == arg0) {
                int var96 = var1.method5166();
                int var97 = var1.method5139();
                int var98 = var1.method5166();
                int var99 = (var98 >> 4 & 0x7) + Statics.field92;
                int var100 = (var98 & 0x7) + Statics.field3960;
                int var101 = var1.method5176();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    int var102 = var99 * 128 + 64;
                    int var103 = var100 * 128 + 64;
                    class87 var104 = new class87(var97, Statics.field611, var102, var103, method4641(var102, var103, Statics.field611) - var96, var101, field690);
                    field812.method4580(var104);
                }
            } else if (class195.field2329 == arg0) {
                int var105 = var1.method5168();
                int var106 = (var105 >> 4 & 0x7) + Statics.field92;
                int var107 = (var105 & 0x7) + Statics.field3960;
                int var108 = var1.method5137();
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = field700[var109];
                int var112 = var1.method5177();
                if (var106 >= 0 && var107 >= 0 && var106 < 103 && var107 < 103) {
                    if (var111 == 0) {
                        class146 var113 = Statics.field61.method2935(Statics.field611, var106, var107);
                        if (var113 != null) {
                            int var114 = class138.method351(var113.field1892);
                            if (var109 == 2) {
                                var113.field1889 = new class103(var114, 2, var110 + 4, Statics.field611, var106, var107, var112, false, var113.field1889);
                                var113.field1891 = new class103(var114, 2, var110 + 1 & 0x3, Statics.field611, var106, var107, var112, false, var113.field1891);
                            } else {
                                var113.field1889 = new class103(var114, var109, var110, Statics.field611, var106, var107, var112, false, var113.field1889);
                            }
                        }
                    }
                    if (var111 == 1) {
                        class151 var115 = Statics.field61.method2988(Statics.field611, var106, var107);
                        if (var115 != null) {
                            int var116 = class138.method351(var115.field1934);
                            if (var109 == 4 || var109 == 5) {
                                var115.field1932 = new class103(var116, 4, var110, Statics.field611, var106, var107, var112, false, var115.field1932);
                            } else if (var109 == 6) {
                                var115.field1932 = new class103(var116, 4, var110 + 4, Statics.field611, var106, var107, var112, false, var115.field1932);
                            } else if (var109 == 7) {
                                var115.field1932 = new class103(var116, 4, (var110 + 2 & 0x3) + 4, Statics.field611, var106, var107, var112, false, var115.field1932);
                            } else if (var109 == 8) {
                                var115.field1932 = new class103(var116, 4, var110 + 4, Statics.field611, var106, var107, var112, false, var115.field1932);
                                var115.field1935 = new class103(var116, 4, (var110 + 2 & 0x3) + 4, Statics.field611, var106, var107, var112, false, var115.field1935);
                            }
                        }
                    }
                    if (var111 == 2) {
                        class152 var117 = Statics.field61.method2937(Statics.field611, var106, var107);
                        if (var109 == 11) {
                            var109 = 10;
                        }
                        if (var117 != null) {
                            var117.field1945 = new class103(class138.method351(var117.field1957), var109, var110, Statics.field611, var106, var107, var112, false, var117.field1945);
                        }
                    }
                    if (var111 == 3) {
                        class133 var118 = Statics.field61.method2938(Statics.field611, var106, var107);
                        if (var118 != null) {
                            var118.field1631 = new class103(class138.method351(var118.field1632), 22, var110, Statics.field611, var106, var107, var112, false, var118.field1631);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bv.hb(I)V")
    public static final void method1085() {
        for (class78 var0 = (class78) field698.method4559(); var0 != null; var0 = (class78) field698.method4577()) {
            if (var0.field970 == -1) {
                var0.field966 = 0;
                method314(var0);
            } else {
                var0.method3355();
            }
        }
    }

    @ObfuscatedName("ap.hd(Lbw;B)V")
    public static final void method314(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field960 == 0) {
            var1 = Statics.field61.method2939(arg0.field963, arg0.field961, arg0.field962);
        }
        if (arg0.field960 == 1) {
            var1 = Statics.field61.method2940(arg0.field963, arg0.field961, arg0.field962);
        }
        if (arg0.field960 == 2) {
            var1 = Statics.field61.method2941(arg0.field963, arg0.field961, arg0.field962);
        }
        if (arg0.field960 == 3) {
            var1 = Statics.field61.method3059(arg0.field963, arg0.field961, arg0.field962);
        }
        if (var1 != 0L) {
            int var6 = Statics.field61.method2943(arg0.field963, arg0.field961, arg0.field962, var1);
            var3 = class138.method351(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field959 = var3;
        arg0.field964 = var4;
        arg0.field969 = var5;
    }

    @ObfuscatedName("dk.hg(IIIIIIII)V")
    public static final void method2390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field685 && Statics.field611 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field61.method2939(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field61.method2940(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field61.method2941(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field61.method3059(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field61.method2943(arg0, arg2, arg3, var7);
            int var13 = class138.method351(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field61.method2930(arg0, arg2, arg3);
                class264 var16 = class264.method363(var13);
                if (var16.field3362 != 0) {
                    field738[arg0].method3319(arg2, arg3, var14, var15, var16.field3385);
                }
            }
            if (arg1 == 1) {
                Statics.field61.method3012(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field61.method2932(arg0, arg2, arg3);
                class264 var17 = class264.method363(var13);
                if (var17.field3360 + arg2 > 103 || var17.field3360 + arg3 > 103 || var17.field3361 + arg2 > 103 || var17.field3361 + arg3 > 103) {
                    return;
                }
                if (var17.field3362 != 0) {
                    field738[arg0].method3337(arg2, arg3, var17.field3360, var17.field3361, var15, var17.field3385);
                }
            }
            if (arg1 == 3) {
                Statics.field61.method2933(arg0, arg2, arg3);
                class264 var18 = class264.method363(var13);
                if (var18.field3362 == 1) {
                    field738[arg0].method3339(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field536[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class143 var20 = Statics.field61;
        class182 var21 = field738[arg0];
        class264 var22 = class264.method363(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3361;
            var24 = var22.field3360;
        } else {
            var23 = var22.field3360;
            var24 = var22.field3361;
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
        int[][] var29 = class65.field550[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class138.method5881(arg2, arg3, 2, var22.field3364 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3372 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class145 var36;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var36 = var22.method4271(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class103(arg4, 22, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method2912(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3362 == 1) {
                var21.method3317(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var62;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var62 = var22.method4271(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class103(arg4, 10, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            if (var62 != null) {
                var20.method2923(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3362 != 0) {
                var21.method3315(arg2, arg3, var23, var24, var22.field3385);
            }
        } else if (arg6 >= 12) {
            class145 var37;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var37 = var22.method4271(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method2923(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3362 != 0) {
                var21.method3315(arg2, arg3, var23, var24, var22.field3385);
            }
        } else if (arg6 == 0) {
            class145 var38;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var38 = var22.method4271(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class103(arg4, 0, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3019(arg0, arg2, arg3, var30, var38, (class145) null, class65.field545[arg5], 0, var33, var35);
            if (var22.field3362 != 0) {
                var21.method3314(arg2, arg3, arg6, arg5, var22.field3385);
            }
        } else if (arg6 == 1) {
            class145 var39;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var39 = var22.method4271(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class103(arg4, 1, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3019(arg0, arg2, arg3, var30, var39, (class145) null, class65.field543[arg5], 0, var33, var35);
            if (var22.field3362 != 0) {
                var21.method3314(arg2, arg3, arg6, arg5, var22.field3385);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class145 var41;
            class145 var42;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var41 = var22.method4271(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4271(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class103(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3368, true, (class145) null);
                var42 = new class103(arg4, 2, var40, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3019(arg0, arg2, arg3, var30, var41, var42, class65.field545[arg5], class65.field545[var40], var33, var35);
            if (var22.field3362 != 0) {
                var21.method3314(arg2, arg3, arg6, arg5, var22.field3385);
            }
        } else if (arg6 == 3) {
            class145 var43;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var43 = var22.method4271(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class103(arg4, 3, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3019(arg0, arg2, arg3, var30, var43, (class145) null, class65.field543[arg5], 0, var33, var35);
            if (var22.field3362 != 0) {
                var21.method3314(arg2, arg3, arg6, arg5, var22.field3385);
            }
        } else if (arg6 == 9) {
            class145 var44;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var44 = var22.method4271(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method2923(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3362 != 0) {
                var21.method3315(arg2, arg3, var23, var24, var22.field3385);
            }
        } else if (arg6 == 4) {
            class145 var45;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var45 = var22.method4271(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3035(arg0, arg2, arg3, var30, var45, (class145) null, class65.field545[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2939(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class264.method363(class138.method351(var47)).field3394;
            }
            class145 var49;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var49 = var22.method4271(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3035(arg0, arg2, arg3, var30, var49, (class145) null, class65.field545[arg5], 0, class65.field542[arg5] * var46, class65.field548[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2939(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class264.method363(class138.method351(var51)).field3394 / 2;
            }
            class145 var53;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var53 = var22.method4271(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3035(arg0, arg2, arg3, var30, var53, (class145) null, 256, arg5, class65.field547[arg5] * var50, class65.field553[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class145 var55;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var55 = var22.method4271(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class103(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3035(arg0, arg2, arg3, var30, var55, (class145) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2939(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class264.method363(class138.method351(var57)).field3394 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class145 var60;
            class145 var61;
            if (var22.field3368 == -1 && var22.field3386 == null) {
                var60 = var22.method4271(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4271(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3368, true, (class145) null);
                var61 = new class103(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3368, true, (class145) null);
            }
            var20.method3035(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class65.field547[arg5] * var56, class65.field553[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("ch.ht(III)V")
    public static final void method1716(int arg0, int arg1) {
        class272 var2 = field809[Statics.field611][arg0][arg1];
        if (var2 == null) {
            Statics.field61.method2934(Statics.field611, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class97 var5 = null;
        for (class97 var6 = (class97) var2.method4559(); var6 != null; var6 = (class97) var2.method4577()) {
            class265 var7 = class265.method337(var6.field1255);
            long var8 = (long) var7.field3418;
            if (var7.field3419 == 1) {
                var8 = (long) (var6.field1258 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field61.method2934(Statics.field611, arg0, arg1);
            return;
        }
        var2.method4555(var5);
        class97 var10 = null;
        class97 var11 = null;
        for (class97 var12 = (class97) var2.method4559(); var12 != null; var12 = (class97) var2.method4577()) {
            if (var5.field1255 != var12.field1255) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1255 != var12.field1255 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class138.method5881(arg0, arg1, 3, false, 0);
        Statics.field61.method2920(Statics.field611, arg0, arg1, method4641(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field611), var5, var13, var10, var11);
    }

    @ObfuscatedName("b.hj(ZLkj;B)V")
    public static final void method182(boolean arg0, class309 arg1) {
        field802 = 0;
        field852 = 0;
        Statics.method274();
        while (arg1.method5078(field762.field1334) >= 27) {
            int var2 = arg1.method5085(15);
            if (var2 == 32767) {
                break;
            }
            boolean var6 = false;
            if (field722[var2] == null) {
                field722[var2] = new class89();
                var6 = true;
            }
            class89 var7 = field722[var2];
            field724[++field723 - 1] = var2;
            var7.field1006 = field690;
            int var8;
            if (arg0) {
                var8 = arg1.method5085(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = arg1.method5085(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = field807[arg1.method5085(3)];
            if (var6) {
                var7.field980 = var7.field996 = var9;
            }
            int var10 = arg1.method5085(1);
            int var11 = arg1.method5085(1);
            if (var11 == 1) {
                field726[++field852 - 1] = var2;
            }
            int var12;
            if (arg0) {
                var12 = arg1.method5085(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = arg1.method5085(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var7.field1149 = class267.method3854(arg1.method5085(14));
            var7.field977 = var7.field1149.field3471;
            var7.field1027 = var7.field1149.field3490;
            if (var7.field1027 == 0) {
                var7.field996 = 0;
            }
            var7.field994 = var7.field1149.field3473;
            var7.field983 = var7.field1149.field3474;
            var7.field1004 = var7.field1149.field3475;
            var7.field985 = var7.field1149.field3476;
            var7.field979 = var7.field1149.field3470;
            var7.field1011 = var7.field1149.field3492;
            var7.field981 = var7.field1149.field3472;
            var7.method1949(Statics.field3718.field1029[0] + var12, Statics.field3718.field1030[0] + var8, var10 == 1);
        }
        arg1.method5088();
        method305(arg1);
        for (int var3 = 0; var3 < field802; var3++) {
            int var4 = field919[var3];
            if (field690 != field722[var4].field1006) {
                field722[var4].field1149 = null;
                field722[var4] = null;
            }
        }
        if (field762.field1334 != arg1.field3711) {
            throw new RuntimeException(arg1.field3711 + class91.field1162 + field762.field1334);
        }
        for (int var5 = 0; var5 < field723; var5++) {
            if (field722[field724[var5]] == null) {
                throw new RuntimeException(var5 + class91.field1162 + field723);
            }
        }
    }

    @ObfuscatedName("ai.hm(Lkj;I)V")
    public static final void method305(class309 arg0) {
        for (int var1 = 0; var1 < field852; var1++) {
            int var2 = field726[var1];
            class89 var3 = field722[var2];
            int var4 = arg0.method5137();
            if ((var4 & 0x80) != 0) {
                int var5 = arg0.method5177();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method5137();
                if (var3.field1017 == var5 && var5 != -1) {
                    int var7 = class269.method4110(var5).field3526;
                    if (var7 == 1) {
                        var3.field1015 = 0;
                        var3.field1008 = 0;
                        var3.field1009 = var6;
                        var3.field1012 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1012 = 0;
                    }
                } else if (var5 == -1 || var3.field1017 == -1 || class269.method4110(var5).field3520 >= class269.method4110(var3.field1017).field3520) {
                    var3.field1017 = var5;
                    var3.field1015 = 0;
                    var3.field1008 = 0;
                    var3.field1009 = var6;
                    var3.field1012 = 0;
                    var3.field1033 = var3.field1028;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var8 = arg0.method5176();
                int var9 = arg0.method5177();
                int var10 = var3.field984 - (var8 - Statics.field591 - Statics.field591) * 64;
                int var11 = var3.field974 - (var9 - Statics.field1153 - Statics.field1153) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1016 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1149 = class267.method3854(arg0.method5177());
                var3.field977 = var3.field1149.field3471;
                var3.field1027 = var3.field1149.field3490;
                var3.field994 = var3.field1149.field3473;
                var3.field983 = var3.field1149.field3474;
                var3.field1004 = var3.field1149.field3475;
                var3.field985 = var3.field1149.field3476;
                var3.field979 = var3.field1149.field3470;
                var3.field1011 = var3.field1149.field3492;
                var3.field981 = var3.field1149.field3472;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1000 = arg0.method5139();
                if (var3.field1000 == 65535) {
                    var3.field1000 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1010 = arg0.method5177();
                int var12 = arg0.method5184();
                var3.field1034 = var12 >> 16;
                var3.field1014 = (var12 & 0xFFFF) + field690;
                var3.field1007 = 0;
                var3.field1013 = 0;
                if (var3.field1014 > field690) {
                    var3.field1007 = -1;
                }
                if (var3.field1010 == 65535) {
                    var3.field1010 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1003 = arg0.method5257();
                var3.field990 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var13 = arg0.method5168();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method5151();
                        if (var18 == 32767) {
                            var18 = arg0.method5151();
                            var16 = arg0.method5151();
                            var15 = arg0.method5151();
                            var17 = arg0.method5151();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method5151();
                        }
                        int var19 = arg0.method5151();
                        var3.method1677(var18, var16, var15, var17, field690, var19);
                    }
                }
                int var20 = arg0.method5167();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method5151();
                        int var23 = arg0.method5151();
                        if (var23 == 32767) {
                            var3.method1667(var22);
                        } else {
                            int var24 = arg0.method5151();
                            int var25 = arg0.method5167();
                            int var26 = var23 > 0 ? arg0.method5168() : var25;
                            var3.method1666(var22, field690, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field991 = arg0.method5170();
                var3.field1018 = arg0.method5171();
                var3.field973 = arg0.method5169();
                var3.field1019 = arg0.method5138();
                var3.field1020 = arg0.method5127() + field690;
                var3.field1021 = arg0.method5176() + field690;
                var3.field1022 = arg0.method5139();
                var3.field1028 = 1;
                var3.field1033 = 0;
                var3.field991 += var3.field1029[0];
                var3.field1018 += var3.field1030[0];
                var3.field973 += var3.field1029[0];
                var3.field1019 += var3.field1030[0];
            }
        }
    }

    @ObfuscatedName("dk.hp(Lbi;IIBI)V")
    public static final void method2379(class76 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1029[0];
        int var5 = arg0.field1030[0];
        int var6 = arg0.method1181();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1181();
        class184 var8 = method366(arg1, arg2);
        class182 var9 = field738[arg0.field667];
        int[] var10 = field956;
        int[] var11 = field957;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class183.field2097[var12][var13] = 0;
                class183.field2100[var12][var13] = 99999999;
            }
        }
        boolean var29;
        if (var7 == 1) {
            int var14 = var4;
            int var15 = var5;
            byte var16 = 64;
            byte var17 = 64;
            int var18 = var4 - var16;
            int var19 = var5 - var17;
            class183.field2097[var16][var17] = 99;
            class183.field2100[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class183.field2095[var20] = var4;
            int var93 = var20 + 1;
            class183.field2102[var20] = var5;
            int[][] var22 = var9.field2093;
            boolean var27;
            while (true) {
                if (var93 == var21) {
                    Statics.field2531 = var14;
                    Statics.field2098 = var15;
                    var27 = false;
                    break;
                }
                var14 = class183.field2095[var21];
                var15 = class183.field2102[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2086;
                int var26 = var15 - var9.field2087;
                if (var8.method1166(1, var14, var15, var9)) {
                    Statics.field2531 = var14;
                    Statics.field2098 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class183.field2100[var23][var24] + 1;
                if (var23 > 0 && class183.field2097[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class183.field2095[var93] = var14 - 1;
                    class183.field2102[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 - 1][var24] = 2;
                    class183.field2100[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class183.field2097[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class183.field2095[var93] = var14 + 1;
                    class183.field2102[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 + 1][var24] = 8;
                    class183.field2100[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class183.field2097[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class183.field2095[var93] = var14;
                    class183.field2102[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23][var24 - 1] = 1;
                    class183.field2100[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class183.field2097[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class183.field2095[var93] = var14;
                    class183.field2102[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23][var24 + 1] = 4;
                    class183.field2100[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class183.field2097[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class183.field2095[var93] = var14 - 1;
                    class183.field2102[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 - 1][var24 - 1] = 3;
                    class183.field2100[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class183.field2097[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class183.field2095[var93] = var14 + 1;
                    class183.field2102[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 + 1][var24 - 1] = 9;
                    class183.field2100[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class183.field2097[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class183.field2095[var93] = var14 - 1;
                    class183.field2102[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 - 1][var24 + 1] = 6;
                    class183.field2100[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class183.field2097[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class183.field2095[var93] = var14 + 1;
                    class183.field2102[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class183.field2097[var23 + 1][var24 + 1] = 12;
                    class183.field2100[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class183.field2097[var32][var33] = 99;
            class183.field2100[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class183.field2095[var36] = var4;
            int var94 = var36 + 1;
            class183.field2102[var36] = var5;
            int[][] var38 = var9.field2093;
            boolean var43;
            while (true) {
                if (var94 == var37) {
                    Statics.field2531 = var30;
                    Statics.field2098 = var31;
                    var43 = false;
                    break;
                }
                var30 = class183.field2095[var37];
                var31 = class183.field2102[var37];
                var37 = var37 + 1 & 0xFFF;
                int var39 = var30 - var34;
                int var40 = var31 - var35;
                int var41 = var30 - var9.field2086;
                int var42 = var31 - var9.field2087;
                if (var8.method1166(2, var30, var31, var9)) {
                    Statics.field2531 = var30;
                    Statics.field2098 = var31;
                    var43 = true;
                    break;
                }
                int var44 = class183.field2100[var39][var40] + 1;
                if (var39 > 0 && class183.field2097[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var42 + 1] & 0x1240138) == 0) {
                    class183.field2095[var94] = var30 - 1;
                    class183.field2102[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 - 1][var40] = 2;
                    class183.field2100[var39 - 1][var40] = var44;
                }
                if (var39 < 126 && class183.field2097[var39 + 1][var40] == 0 && (var38[var41 + 2][var42] & 0x1240183) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E0) == 0) {
                    class183.field2095[var94] = var30 + 1;
                    class183.field2102[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 + 1][var40] = 8;
                    class183.field2100[var39 + 1][var40] = var44;
                }
                if (var40 > 0 && class183.field2097[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var41 + 1][var42 - 1] & 0x1240183) == 0) {
                    class183.field2095[var94] = var30;
                    class183.field2102[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39][var40 - 1] = 1;
                    class183.field2100[var39][var40 - 1] = var44;
                }
                if (var40 < 126 && class183.field2097[var39][var40 + 1] == 0 && (var38[var41][var42 + 2] & 0x1240138) == 0 && (var38[var41 + 1][var42 + 2] & 0x12401E0) == 0) {
                    class183.field2095[var94] = var30;
                    class183.field2102[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39][var40 + 1] = 4;
                    class183.field2100[var39][var40 + 1] = var44;
                }
                if (var39 > 0 && var40 > 0 && class183.field2097[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42] & 0x124013E) == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0 && (var38[var41][var42 - 1] & 0x124018F) == 0) {
                    class183.field2095[var94] = var30 - 1;
                    class183.field2102[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 - 1][var40 - 1] = 3;
                    class183.field2100[var39 - 1][var40 - 1] = var44;
                }
                if (var39 < 126 && var40 > 0 && class183.field2097[var39 + 1][var40 - 1] == 0 && (var38[var41 + 1][var42 - 1] & 0x124018F) == 0 && (var38[var41 + 2][var42 - 1] & 0x1240183) == 0 && (var38[var41 + 2][var42] & 0x12401E3) == 0) {
                    class183.field2095[var94] = var30 + 1;
                    class183.field2102[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 + 1][var40 - 1] = 9;
                    class183.field2100[var39 + 1][var40 - 1] = var44;
                }
                if (var39 > 0 && var40 < 126 && class183.field2097[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var42 + 1] & 0x124013E) == 0 && (var38[var41 - 1][var42 + 2] & 0x1240138) == 0 && (var38[var41][var42 + 2] & 0x12401F8) == 0) {
                    class183.field2095[var94] = var30 - 1;
                    class183.field2102[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 - 1][var40 + 1] = 6;
                    class183.field2100[var39 - 1][var40 + 1] = var44;
                }
                if (var39 < 126 && var40 < 126 && class183.field2097[var39 + 1][var40 + 1] == 0 && (var38[var41 + 1][var42 + 2] & 0x12401F8) == 0 && (var38[var41 + 2][var42 + 2] & 0x12401E0) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E3) == 0) {
                    class183.field2095[var94] = var30 + 1;
                    class183.field2102[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class183.field2097[var39 + 1][var40 + 1] = 12;
                    class183.field2100[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        } else {
            int var45 = var4;
            int var46 = var5;
            byte var47 = 64;
            byte var48 = 64;
            int var49 = var4 - var47;
            int var50 = var5 - var48;
            class183.field2097[var47][var48] = 99;
            class183.field2100[var47][var48] = 0;
            byte var51 = 0;
            int var52 = 0;
            class183.field2095[var51] = var4;
            int var95 = var51 + 1;
            class183.field2102[var51] = var5;
            int[][] var53 = var9.field2093;
            boolean var58;
            label643: while (true) {
                label641: while (true) {
                    int var54;
                    int var55;
                    int var56;
                    int var57;
                    int var59;
                    do {
                        do {
                            do {
                                label618: do {
                                    if (var95 == var52) {
                                        Statics.field2531 = var45;
                                        Statics.field2098 = var46;
                                        var58 = false;
                                        break label643;
                                    }
                                    var45 = class183.field2095[var52];
                                    var46 = class183.field2102[var52];
                                    var52 = var52 + 1 & 0xFFF;
                                    var54 = var45 - var49;
                                    var55 = var46 - var50;
                                    var56 = var45 - var9.field2086;
                                    var57 = var46 - var9.field2087;
                                    if (var8.method1166(var7, var45, var46, var9)) {
                                        Statics.field2531 = var45;
                                        Statics.field2098 = var46;
                                        var58 = true;
                                        break label643;
                                    }
                                    var59 = class183.field2100[var54][var55] + 1;
                                    if (var54 > 0 && class183.field2097[var54 - 1][var55] == 0 && (var53[var56 - 1][var57] & 0x124010E) == 0 && (var53[var56 - 1][var7 + var57 - 1] & 0x1240138) == 0) {
                                        int var60 = 1;
                                        while (true) {
                                            if (var60 >= var7 - 1) {
                                                class183.field2095[var95] = var45 - 1;
                                                class183.field2102[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54 - 1][var55] = 2;
                                                class183.field2100[var54 - 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 + var60] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var60++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && class183.field2097[var54 + 1][var55] == 0 && (var53[var7 + var56][var57] & 0x1240183) == 0 && (var53[var7 + var56][var7 + var57 - 1] & 0x12401E0) == 0) {
                                        int var61 = 1;
                                        while (true) {
                                            if (var61 >= var7 - 1) {
                                                class183.field2095[var95] = var45 + 1;
                                                class183.field2102[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54 + 1][var55] = 8;
                                                class183.field2100[var54 + 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 + var61] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var61++;
                                        }
                                    }
                                    if (var55 > 0 && class183.field2097[var54][var55 - 1] == 0 && (var53[var56][var57 - 1] & 0x124010E) == 0 && (var53[var7 + var56 - 1][var57 - 1] & 0x1240183) == 0) {
                                        int var62 = 1;
                                        while (true) {
                                            if (var62 >= var7 - 1) {
                                                class183.field2095[var95] = var45;
                                                class183.field2102[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54][var55 - 1] = 1;
                                                class183.field2100[var54][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var62][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var62++;
                                        }
                                    }
                                    if (var55 < 128 - var7 && class183.field2097[var54][var55 + 1] == 0 && (var53[var56][var7 + var57] & 0x1240138) == 0 && (var53[var7 + var56 - 1][var7 + var57] & 0x12401E0) == 0) {
                                        int var63 = 1;
                                        while (true) {
                                            if (var63 >= var7 - 1) {
                                                class183.field2095[var95] = var45;
                                                class183.field2102[var95] = var46 + 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54][var55 + 1] = 4;
                                                class183.field2100[var54][var55 + 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var63][var7 + var57] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var63++;
                                        }
                                    }
                                    if (var54 > 0 && var55 > 0 && class183.field2097[var54 - 1][var55 - 1] == 0 && (var53[var56 - 1][var57 - 1] & 0x124010E) == 0) {
                                        int var64 = 1;
                                        while (true) {
                                            if (var64 >= var7) {
                                                class183.field2095[var95] = var45 - 1;
                                                class183.field2102[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54 - 1][var55 - 1] = 3;
                                                class183.field2100[var54 - 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 - 1 + var64] & 0x124013E) != 0 || (var53[var56 - 1 + var64][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var64++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && var55 > 0 && class183.field2097[var54 + 1][var55 - 1] == 0 && (var53[var7 + var56][var57 - 1] & 0x1240183) == 0) {
                                        int var65 = 1;
                                        while (true) {
                                            if (var65 >= var7) {
                                                class183.field2095[var95] = var45 + 1;
                                                class183.field2102[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class183.field2097[var54 + 1][var55 - 1] = 9;
                                                class183.field2100[var54 + 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 - 1 + var65] & 0x12401E3) != 0 || (var53[var56 + var65][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var65++;
                                        }
                                    }
                                    if (var54 > 0 && var55 < 128 - var7 && class183.field2097[var54 - 1][var55 + 1] == 0 && (var53[var56 - 1][var7 + var57] & 0x1240138) == 0) {
                                        for (int var66 = 1; var66 < var7; var66++) {
                                            if ((var53[var56 - 1][var57 + var66] & 0x124013E) != 0 || (var53[var56 - 1 + var66][var7 + var57] & 0x12401F8) != 0) {
                                                continue label618;
                                            }
                                        }
                                        class183.field2095[var95] = var45 - 1;
                                        class183.field2102[var95] = var46 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class183.field2097[var54 - 1][var55 + 1] = 6;
                                        class183.field2100[var54 - 1][var55 + 1] = var59;
                                    }
                                } while (var54 >= 128 - var7);
                            } while (var55 >= 128 - var7);
                        } while (class183.field2097[var54 + 1][var55 + 1] != 0);
                    } while ((var53[var7 + var56][var7 + var57] & 0x12401E0) != 0);
                    for (int var67 = 1; var67 < var7; var67++) {
                        if ((var53[var56 + var67][var7 + var57] & 0x12401F8) != 0 || (var53[var7 + var56][var57 + var67] & 0x12401E3) != 0) {
                            continue label641;
                        }
                    }
                    class183.field2095[var95] = var45 + 1;
                    class183.field2102[var95] = var46 + 1;
                    var95 = var95 + 1 & 0xFFF;
                    class183.field2097[var54 + 1][var55 + 1] = 12;
                    class183.field2100[var54 + 1][var55 + 1] = var59;
                }
            }
            var29 = var58;
        }
        int var86;
        label709: {
            int var68 = var4 - 64;
            int var69 = var5 - 64;
            int var70 = Statics.field2531;
            int var71 = Statics.field2098;
            if (!var29) {
                int var72 = Integer.MAX_VALUE;
                int var73 = Integer.MAX_VALUE;
                byte var74 = 10;
                int var75 = var8.field2105;
                int var76 = var8.field2104;
                int var77 = var8.field2103;
                int var78 = var8.field2106;
                for (int var79 = var75 - var74; var79 <= var74 + var75; var79++) {
                    for (int var80 = var76 - var74; var80 <= var74 + var76; var80++) {
                        int var81 = var79 - var68;
                        int var82 = var80 - var69;
                        if (var81 >= 0 && var82 >= 0 && var81 < 128 && var82 < 128 && class183.field2100[var81][var82] < 100) {
                            int var83 = 0;
                            if (var79 < var75) {
                                var83 = var75 - var79;
                            } else if (var79 > var75 + var77 - 1) {
                                var83 = var79 - (var75 + var77 - 1);
                            }
                            int var84 = 0;
                            if (var80 < var76) {
                                var84 = var76 - var80;
                            } else if (var80 > var76 + var78 - 1) {
                                var84 = var80 - (var76 + var78 - 1);
                            }
                            int var85 = var83 * var83 + var84 * var84;
                            if (var85 < var72 || var72 == var85 && class183.field2100[var81][var82] < var73) {
                                var72 = var85;
                                var73 = class183.field2100[var81][var82];
                                var70 = var79;
                                var71 = var80;
                            }
                        }
                    }
                }
                if (var72 == Integer.MAX_VALUE) {
                    var86 = -1;
                    break label709;
                }
            }
            if (var4 == var70 && var5 == var71) {
                var86 = 0;
            } else {
                byte var87 = 0;
                class183.field2095[var87] = var70;
                int var96 = var87 + 1;
                class183.field2102[var87] = var71;
                int var88;
                int var89 = var88 = class183.field2097[var70 - var68][var71 - var69];
                while (var4 != var70 || var5 != var71) {
                    if (var88 != var89) {
                        var88 = var89;
                        class183.field2095[var96] = var70;
                        class183.field2102[var96++] = var71;
                    }
                    if ((var89 & 0x2) != 0) {
                        var70++;
                    } else if ((var89 & 0x8) != 0) {
                        var70--;
                    }
                    if ((var89 & 0x1) != 0) {
                        var71++;
                    } else if ((var89 & 0x4) != 0) {
                        var71--;
                    }
                    var89 = class183.field2097[var70 - var68][var71 - var69];
                }
                int var90 = 0;
                while (var96-- > 0) {
                    var10[var90] = class183.field2095[var96];
                    var11[var90++] = class183.field2102[var96];
                    if (var90 >= var10.length) {
                        break;
                    }
                }
                var86 = var90;
            }
        }
        int var91 = var86;
        if (var86 >= 1) {
            for (int var92 = 0; var92 < var91 - 1; var92++) {
                arg0.method1185(field956[var92], field957[var92], arg3);
            }
        }
    }

    @ObfuscatedName("al.he(IIB)Lgx;")
    public static class184 method366(int arg0, int arg1) {
        field955.field2105 = arg0;
        field955.field2104 = arg1;
        field955.field2103 = 1;
        field955.field2106 = 1;
        return field955;
    }

    @ObfuscatedName("hi.hn(I)V")
    public static void method3661() {
        field694 = 0;
        field817 = false;
    }

    @ObfuscatedName("eq.hu(B)V")
    public static void method2696() {
        method3661();
        field823[0] = class234.field3006;
        field824[0] = "";
        field780[0] = 1006;
        field810[0] = false;
        field694 = 1;
    }

    @ObfuscatedName("ah.ha(IIIII)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field884; var4++) {
            if (field951[var4] + field734[var4] > arg0 && field951[var4] < arg0 + arg2 && field940[var4] + field737[var4] > arg1 && field940[var4] < arg1 + arg3) {
                field887[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ho(B)V")
    public final void method1253() {
        method1119();
        if (Statics.field3083 != null || field854 != null) {
            return;
        }
        int var28;
        int var30;
        int var31;
        label227: {
            int var1 = class64.field525;
            if (field817) {
                if (var1 != 1 && (Statics.field2507 || var1 != 4)) {
                    int var2 = class64.field518;
                    int var3 = class64.field519;
                    if (var2 < Statics.field249 - 10 || var2 > Statics.field384 + Statics.field249 + 10 || var3 < Statics.field2344 - 10 || var3 > Statics.field377 + Statics.field2344 + 10) {
                        field817 = false;
                        int var4 = Statics.field249;
                        int var5 = Statics.field2344;
                        int var6 = Statics.field384;
                        int var7 = Statics.field377;
                        for (int var8 = 0; var8 < field884; var8++) {
                            if (field951[var8] + field734[var8] > var4 && field951[var8] < var4 + var6 && field940[var8] + field737[var8] > var5 && field940[var8] < var5 + var7) {
                                field680[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field2507 && var1 == 4) {
                    int var9 = Statics.field249;
                    int var10 = Statics.field2344;
                    int var11 = Statics.field384;
                    int var12 = class64.field526;
                    int var13 = class64.field521;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field694; var15++) {
                        int var16 = (field694 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1 && var14 >= 0) {
                        int var17 = field777[var14];
                        int var18 = field857[var14];
                        int var19 = field780[var14];
                        int var20 = field859[var14];
                        String var21 = field823[var14];
                        String var22 = field824[var14];
                        method3664(var17, var18, var19, var20, var21, var22, class64.field526, class64.field521);
                    }
                    field817 = false;
                    int var23 = Statics.field249;
                    int var24 = Statics.field2344;
                    int var25 = Statics.field384;
                    int var26 = Statics.field377;
                    for (int var27 = 0; var27 < field884; var27++) {
                        if (field951[var27] + field734[var27] > var23 && field951[var27] < var23 + var25 && field940[var27] + field737[var27] > var24 && field940[var27] < var24 + var26) {
                            field680[var27] = true;
                        }
                    }
                }
            } else {
                var28 = method345();
                if ((var1 == 1 || !Statics.field2507 && var1 == 4) && var28 >= 0) {
                    int var29 = field780[var28];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field777[var28];
                        var31 = field857[var28];
                        class227 var32 = class227.method3572(var31);
                        int var33 = method1127(var32);
                        boolean var34 = (var33 >> 28 & 0x1) != 0;
                        if (var34) {
                            break label227;
                        }
                        class228 var10000 = (class228) null;
                        if (class228.method3252(method1127(var32))) {
                            break label227;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field2507 && var1 == 4) && this.method1623()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field2507 && var1 == 4) && field694 > 0 && var28 >= 0) {
                    int var38 = field777[var28];
                    int var39 = field857[var28];
                    int var40 = field780[var28];
                    int var41 = field859[var28];
                    String var42 = field823[var28];
                    String var43 = field824[var28];
                    method3664(var38, var39, var40, var41, var42, var43, class64.field526, class64.field521);
                }
                if (var1 == 2 && field694 > 0) {
                    this.method1529(class64.field526, class64.field521);
                }
            }
            return;
        }
        if (Statics.field3083 != null && !field888 && field694 > 0 && !this.method1623()) {
            int var35 = field790;
            int var36 = field697;
            class92 var37 = Statics.field339;
            method3664(var37.field1177, var37.field1173, var37.field1174, var37.field1175, var37.field1176, var37.field1176, var35, var36);
            Statics.field339 = null;
        }
        field888 = false;
        field794 = 0;
        if (Statics.field3083 != null) {
            method1117(Statics.field3083);
        }
        Statics.field3083 = class227.method3572(var31);
        field818 = var30;
        field790 = class64.field526;
        field697 = class64.field521;
        if (var28 >= 0) {
            Statics.field339 = new class92();
            Statics.field339.field1177 = field777[var28];
            Statics.field339.field1173 = field857[var28];
            Statics.field339.field1174 = field780[var28];
            Statics.field339.field1175 = field859[var28];
            Statics.field339.field1176 = field823[var28];
        }
        method1117(Statics.field3083);
    }

    @ObfuscatedName("client.hr(I)Z")
    public final boolean method1623() {
        int var1 = method345();
        return (field816 == 1 && field694 > 2 || Statics.method94(var1)) && !field810[var1];
    }

    @ObfuscatedName("client.hv(III)V")
    public final void method1529(int arg0, int arg1) {
        method3575(arg0, arg1);
        Statics.field61.method2949(Statics.field611, arg0, arg1, false);
        field817 = true;
    }

    @ObfuscatedName("hz.hx(III)V")
    public static void method3575(int arg0, int arg1) {
        int var2 = Statics.field2046.method4982(class234.field2935);
        for (int var3 = 0; var3 < field694; var3++) {
            class305 var4 = Statics.field2046;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field824[var3].length() > 0) {
                var5 = field823[var3] + class234.field2921 + field824[var3];
            } else {
                var5 = field823[var3];
            }
            int var6 = var4.method4982(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field694 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field278) {
            var8 = Statics.field278 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2526) {
            var9 = Statics.field2526 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field249 = var8;
        Statics.field2344 = var9;
        Statics.field384 = var2;
        Statics.field377 = field694 * 15 + 22;
    }

    @ObfuscatedName("hi.ij(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3664(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            method3817();
        }
        if (arg2 == 1005) {
            class227 var8 = class227.method3572(arg1);
            if (var8 == null || var8.field2693[arg0] < 100000) {
                class197 var9 = class197.method3105(class193.field2295, field762.field1341);
                var9.field2339.method5173(arg3);
                field762.method2171(var9);
            } else {
                class101.method2911(27, "", var8.field2693[arg0] + " x " + class265.method337(arg3).field3398);
            }
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 19) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var10 = class197.method3105(class193.field2287, field762.field1341);
            var10.field2339.method5122(Statics.field1153 + arg1);
            var10.field2339.method5173(Statics.field591 + arg0);
            var10.field2339.method5290(class55.field427[82] ? 1 : 0);
            var10.field2339.method5122(arg3);
            field762.method2171(var10);
        }
        if (arg2 == 2) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var11 = class197.method3105(class193.field2253, field762.field1341);
            var11.field2339.method5122(field837);
            var11.field2339.method5279(Statics.field30);
            var11.field2339.method5173(arg3);
            var11.field2339.method5172(Statics.field1153 + arg1);
            var11.field2339.method5165(class55.field427[82] ? 1 : 0);
            var11.field2339.method5172(Statics.field591 + arg0);
            field762.method2171(var11);
        }
        if (arg2 == 51) {
            class76 var12 = field791[arg3];
            if (var12 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var13 = class197.method3105(class193.field2248, field762.field1341);
                var13.field2339.method5121(class55.field427[82] ? 1 : 0);
                var13.field2339.method5122(arg3);
                field762.method2171(var13);
            }
        }
        if (arg2 == 43) {
            class197 var14 = class197.method3105(class193.field2239, field762.field1341);
            var14.field2339.method5174(arg0);
            var14.field2339.method5180(arg1);
            var14.field2339.method5174(arg3);
            field762.method2171(var14);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 37) {
            class197 var15 = class197.method3105(class193.field2245, field762.field1341);
            var15.field2339.method5174(arg0);
            var15.field2339.method5207(arg1);
            var15.field2339.method5173(arg3);
            field762.method2171(var15);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 20) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var16 = class197.method3105(class193.field2276, field762.field1341);
            var16.field2339.method5121(class55.field427[82] ? 1 : 0);
            var16.field2339.method5172(Statics.field591 + arg0);
            var16.field2339.method5173(Statics.field1153 + arg1);
            var16.field2339.method5174(arg3);
            field762.method2171(var16);
        }
        if (arg2 == 24) {
            class227 var17 = class227.method3572(arg1);
            boolean var18 = true;
            if (var17.field2572 > 0) {
                var18 = method310(var17);
            }
            if (var18) {
                class197 var19 = class197.method3105(class193.field2232, field762.field1341);
                var19.field2339.method5279(arg1);
                field762.method2171(var19);
            }
        }
        if (arg2 == 38) {
            method180();
            class227 var20 = class227.method3572(arg1);
            field834 = 1;
            Statics.field958 = arg0;
            Statics.field244 = arg1;
            Statics.field1900 = arg3;
            method1117(var20);
            field934 = class91.method4912(16748608) + class265.method337(arg3).field3398 + class91.method4912(16777215);
            if (field934 == null) {
                field934 = class234.field2765;
            }
            return;
        }
        if (arg2 == 34) {
            class197 var21 = class197.method3105(class193.field2266, field762.field1341);
            var21.field2339.method5279(arg1);
            var21.field2339.method5173(arg3);
            var21.field2339.method5174(arg0);
            field762.method2171(var21);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 8) {
            class89 var22 = field722[arg3];
            if (var22 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var23 = class197.method3105(class193.field2272, field762.field1341);
                var23.field2339.method5165(class55.field427[82] ? 1 : 0);
                var23.field2339.method5279(Statics.field30);
                var23.field2339.method5122(field837);
                var23.field2339.method5122(arg3);
                field762.method2171(var23);
            }
        }
        if (arg2 == 39) {
            class197 var24 = class197.method3105(class193.field2259, field762.field1341);
            var24.field2339.method5122(arg3);
            var24.field2339.method5172(arg0);
            var24.field2339.method5180(arg1);
            field762.method2171(var24);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 29) {
            class197 var25 = class197.method3105(class193.field2232, field762.field1341);
            var25.field2339.method5279(arg1);
            field762.method2171(var25);
            class227 var26 = class227.method3572(arg1);
            if (var26.field2651 != null && var26.field2651[0][0] == 5) {
                int var27 = var26.field2651[0][1];
                if (class222.field2527[var27] != var26.field2688[0]) {
                    class222.field2527[var27] = var26.field2688[0];
                    method223(var27);
                }
            }
        }
        if (arg2 == 5) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var28 = class197.method3105(class193.field2297, field762.field1341);
            var28.field2339.method5173(Statics.field591 + arg0);
            var28.field2339.method5174(Statics.field1153 + arg1);
            var28.field2339.method5290(class55.field427[82] ? 1 : 0);
            var28.field2339.method5173(arg3);
            field762.method2171(var28);
        }
        if (arg2 == 42) {
            class197 var29 = class197.method3105(class193.field2300, field762.field1341);
            var29.field2339.method5279(arg1);
            var29.field2339.method5173(arg0);
            var29.field2339.method5173(arg3);
            field762.method2171(var29);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 44) {
            class76 var30 = field791[arg3];
            if (var30 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var31 = class197.method3105(class193.field2268, field762.field1341);
                var31.field2339.method5121(class55.field427[82] ? 1 : 0);
                var31.field2339.method5174(arg3);
                field762.method2171(var31);
            }
        }
        if (arg2 == 16) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var32 = class197.method3105(class193.field2303, field762.field1341);
            var32.field2339.method5173(Statics.field1900);
            var32.field2339.method5174(arg3);
            var32.field2339.method5287(class55.field427[82] ? 1 : 0);
            var32.field2339.method5181(Statics.field244);
            var32.field2339.method5174(Statics.field591 + arg0);
            var32.field2339.method5174(Statics.field958);
            var32.field2339.method5172(Statics.field1153 + arg1);
            field762.method2171(var32);
        }
        if (arg2 == 3) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var33 = class197.method3105(class193.field2222, field762.field1341);
            var33.field2339.method5165(class55.field427[82] ? 1 : 0);
            var33.field2339.method5174(Statics.field591 + arg0);
            var33.field2339.method5172(arg3);
            var33.field2339.method5172(Statics.field1153 + arg1);
            field762.method2171(var33);
        }
        if (arg2 == 35) {
            class197 var34 = class197.method3105(class193.field2269, field762.field1341);
            var34.field2339.method5279(arg1);
            var34.field2339.method5172(arg3);
            var34.field2339.method5122(arg0);
            field762.method2171(var34);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 23) {
            if (field817) {
                Statics.field61.method3075();
            } else {
                Statics.field61.method2949(Statics.field611, arg0, arg1, true);
            }
        }
        if (arg2 == 49) {
            class76 var35 = field791[arg3];
            if (var35 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var36 = class197.method3105(class193.field2251, field762.field1341);
                var36.field2339.method5287(class55.field427[82] ? 1 : 0);
                var36.field2339.method5174(arg3);
                field762.method2171(var36);
            }
        }
        if (arg2 == 25) {
            class227 var37 = class227.method194(arg1, arg0);
            if (var37 != null) {
                method180();
                method682(arg1, arg0, class228.method352(method1127(var37)), var37.field2705);
                field834 = 0;
                field839 = method5486(var37);
                if (field839 == null) {
                    field839 = class234.field2765;
                }
                if (var37.field2567) {
                    field840 = var37.field2594 + class91.method4912(16777215);
                } else {
                    field840 = class91.method4912(65280) + var37.field2690 + class91.method4912(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var38 = class197.method3105(class193.field2288, field762.field1341);
            var38.field2339.method5174(arg3);
            var38.field2339.method5174(Statics.field591 + arg0);
            var38.field2339.method5172(Statics.field1153 + arg1);
            var38.field2339.method5287(class55.field427[82] ? 1 : 0);
            field762.method2171(var38);
        }
        if (arg2 == 28) {
            class197 var39 = class197.method3105(class193.field2232, field762.field1341);
            var39.field2339.method5279(arg1);
            field762.method2171(var39);
            class227 var40 = class227.method3572(arg1);
            if (var40.field2651 != null && var40.field2651[0][0] == 5) {
                int var41 = var40.field2651[0][1];
                class222.field2527[var41] = 1 - class222.field2527[var41];
                method223(var41);
            }
        }
        if (arg2 == 30 && field883 == null) {
            method812(arg1, arg0);
            field883 = class227.method194(arg1, arg0);
            method1117(field883);
        }
        if (arg2 == 1003) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            class89 var42 = field722[arg3];
            if (var42 != null) {
                class267 var43 = var42.field1149;
                if (var43.field3491 != null) {
                    var43 = var43.method4394();
                }
                if (var43 != null) {
                    class197 var44 = class197.method3105(class193.field2243, field762.field1341);
                    var44.field2339.method5174(var43.field3465);
                    field762.method2171(var44);
                }
            }
        }
        if (arg2 == 13) {
            class89 var45 = field722[arg3];
            if (var45 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var46 = class197.method3105(class193.field2304, field762.field1341);
                var46.field2339.method5121(class55.field427[82] ? 1 : 0);
                var46.field2339.method5122(arg3);
                field762.method2171(var46);
            }
        }
        if (arg2 == 47) {
            class76 var47 = field791[arg3];
            if (var47 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var48 = class197.method3105(class193.field2283, field762.field1341);
                var48.field2339.method5122(arg3);
                var48.field2339.method5165(class55.field427[82] ? 1 : 0);
                field762.method2171(var48);
            }
        }
        if (arg2 == 50) {
            class76 var49 = field791[arg3];
            if (var49 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var50 = class197.method3105(class193.field2302, field762.field1341);
                var50.field2339.method5121(class55.field427[82] ? 1 : 0);
                var50.field2339.method5122(arg3);
                field762.method2171(var50);
            }
        }
        if (arg2 == 41) {
            class197 var51 = class197.method3105(class193.field2286, field762.field1341);
            var51.field2339.method5172(arg0);
            var51.field2339.method5207(arg1);
            var51.field2339.method5122(arg3);
            field762.method2171(var51);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 48) {
            class76 var52 = field791[arg3];
            if (var52 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var53 = class197.method3105(class193.field2255, field762.field1341);
                var53.field2339.method5290(class55.field427[82] ? 1 : 0);
                var53.field2339.method5122(arg3);
                field762.method2171(var53);
            }
        }
        if (arg2 == 7) {
            class89 var54 = field722[arg3];
            if (var54 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var55 = class197.method3105(class193.field2238, field762.field1341);
                var55.field2339.method5122(Statics.field958);
                var55.field2339.method5122(Statics.field1900);
                var55.field2339.method5279(Statics.field244);
                var55.field2339.method5290(class55.field427[82] ? 1 : 0);
                var55.field2339.method5172(arg3);
                field762.method2171(var55);
            }
        }
        if (arg2 == 4) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var56 = class197.method3105(class193.field2244, field762.field1341);
            var56.field2339.method5122(arg3);
            var56.field2339.method5174(Statics.field591 + arg0);
            var56.field2339.method5174(Statics.field1153 + arg1);
            var56.field2339.method5287(class55.field427[82] ? 1 : 0);
            field762.method2171(var56);
        }
        if (arg2 == 9) {
            class89 var57 = field722[arg3];
            if (var57 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var58 = class197.method3105(class193.field2264, field762.field1341);
                var58.field2339.method5172(arg3);
                var58.field2339.method5287(class55.field427[82] ? 1 : 0);
                field762.method2171(var58);
            }
        }
        if (arg2 == 10) {
            class89 var59 = field722[arg3];
            if (var59 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var60 = class197.method3105(class193.field2212, field762.field1341);
                var60.field2339.method5122(arg3);
                var60.field2339.method5287(class55.field427[82] ? 1 : 0);
                field762.method2171(var60);
            }
        }
        if (arg2 == 31) {
            class197 var61 = class197.method3105(class193.field2306, field762.field1341);
            var61.field2339.method5181(arg1);
            var61.field2339.method5174(Statics.field958);
            var61.field2339.method5207(Statics.field244);
            var61.field2339.method5173(arg0);
            var61.field2339.method5122(arg3);
            var61.field2339.method5173(Statics.field1900);
            field762.method2171(var61);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 17) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var62 = class197.method3105(class193.field2234, field762.field1341);
            var62.field2339.method5287(class55.field427[82] ? 1 : 0);
            var62.field2339.method5172(arg3);
            var62.field2339.method5174(field837);
            var62.field2339.method5122(Statics.field1153 + arg1);
            var62.field2339.method5180(Statics.field30);
            var62.field2339.method5174(Statics.field591 + arg0);
            field762.method2171(var62);
        }
        if (arg2 == 22) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var63 = class197.method3105(class193.field2236, field762.field1341);
            var63.field2339.method5122(arg3);
            var63.field2339.method5173(Statics.field1153 + arg1);
            var63.field2339.method5290(class55.field427[82] ? 1 : 0);
            var63.field2339.method5173(Statics.field591 + arg0);
            field762.method2171(var63);
        }
        if (arg2 == 45) {
            class76 var64 = field791[arg3];
            if (var64 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var65 = class197.method3105(class193.field2233, field762.field1341);
                var65.field2339.method5173(arg3);
                var65.field2339.method5290(class55.field427[82] ? 1 : 0);
                field762.method2171(var65);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field122.method6009(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 11) {
            class89 var66 = field722[arg3];
            if (var66 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var67 = class197.method3105(class193.field2278, field762.field1341);
                var67.field2339.method5173(arg3);
                var67.field2339.method5287(class55.field427[82] ? 1 : 0);
                field762.method2171(var67);
            }
        }
        if (arg2 == 1) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var68 = class197.method3105(class193.field2241, field762.field1341);
            var68.field2339.method5173(Statics.field958);
            var68.field2339.method5181(Statics.field244);
            var68.field2339.method5172(Statics.field1153 + arg1);
            var68.field2339.method5172(Statics.field591 + arg0);
            var68.field2339.method5172(arg3);
            var68.field2339.method5172(Statics.field1900);
            var68.field2339.method5290(class55.field427[82] ? 1 : 0);
            field762.method2171(var68);
        }
        if (arg2 == 1002) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            class197 var69 = class197.method3105(class193.field2285, field762.field1341);
            var69.field2339.method5173(arg3);
            field762.method2171(var69);
        }
        if (arg2 == 15) {
            class76 var70 = field791[arg3];
            if (var70 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var71 = class197.method3105(class193.field2301, field762.field1341);
                var71.field2339.method5122(arg3);
                var71.field2339.method5180(Statics.field30);
                var71.field2339.method5121(class55.field427[82] ? 1 : 0);
                var71.field2339.method5173(field837);
                field762.method2171(var71);
            }
        }
        if (arg2 == 1001) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var72 = class197.method3105(class193.field2275, field762.field1341);
            var72.field2339.method5174(arg3);
            var72.field2339.method5172(Statics.field591 + arg0);
            var72.field2339.method5121(class55.field427[82] ? 1 : 0);
            var72.field2339.method5122(Statics.field1153 + arg1);
            field762.method2171(var72);
        }
        if (arg2 == 1004) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            class197 var73 = class197.method3105(class193.field2295, field762.field1341);
            var73.field2339.method5173(arg3);
            field762.method2171(var73);
        }
        if (arg2 == 46) {
            class76 var74 = field791[arg3];
            if (var74 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var75 = class197.method3105(class193.field2267, field762.field1341);
                var75.field2339.method5290(class55.field427[82] ? 1 : 0);
                var75.field2339.method5122(arg3);
                field762.method2171(var75);
            }
        }
        if (arg2 == 36) {
            class197 var76 = class197.method3105(class193.field2209, field762.field1341);
            var76.field2339.method5172(arg0);
            var76.field2339.method5180(arg1);
            var76.field2339.method5172(arg3);
            field762.method2171(var76);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 14) {
            class76 var77 = field791[arg3];
            if (var77 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var78 = class197.method3105(class193.field2226, field762.field1341);
                var78.field2339.method5173(Statics.field1900);
                var78.field2339.method5173(arg3);
                var78.field2339.method5290(class55.field427[82] ? 1 : 0);
                var78.field2339.method5174(Statics.field958);
                var78.field2339.method5279(Statics.field244);
                field762.method2171(var78);
            }
        }
        if (arg2 == 21) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var79 = class197.method3105(class193.field2228, field762.field1341);
            var79.field2339.method5121(class55.field427[82] ? 1 : 0);
            var79.field2339.method5172(arg3);
            var79.field2339.method5172(Statics.field591 + arg0);
            var79.field2339.method5173(Statics.field1153 + arg1);
            field762.method2171(var79);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var80 = class227.method194(arg1, arg0);
            if (var80 != null) {
                method3365(arg3, arg1, arg0, var80.field2705, arg5);
            }
        }
        if (arg2 == 12) {
            class89 var81 = field722[arg3];
            if (var81 != null) {
                field923 = arg6;
                field689 = arg7;
                field785 = 2;
                field784 = 0;
                field911 = arg0;
                field912 = arg1;
                class197 var82 = class197.method3105(class193.field2220, field762.field1341);
                var82.field2339.method5165(class55.field427[82] ? 1 : 0);
                var82.field2339.method5172(arg3);
                field762.method2171(var82);
            }
        }
        if (arg2 == 58) {
            class227 var83 = class227.method194(arg1, arg0);
            if (var83 != null) {
                class197 var84 = class197.method3105(class193.field2273, field762.field1341);
                var84.field2339.method5173(field838);
                var84.field2339.method5173(field837);
                var84.field2339.method5174(arg0);
                var84.field2339.method5172(var83.field2705);
                var84.field2339.method5279(Statics.field30);
                var84.field2339.method5207(arg1);
                field762.method2171(var84);
            }
        }
        if (arg2 == 40) {
            class197 var85 = class197.method3105(class193.field2277, field762.field1341);
            var85.field2339.method5181(arg1);
            var85.field2339.method5174(arg3);
            var85.field2339.method5122(arg0);
            field762.method2171(var85);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 32) {
            class197 var86 = class197.method3105(class193.field2229, field762.field1341);
            var86.field2339.method5172(field837);
            var86.field2339.method5207(Statics.field30);
            var86.field2339.method5173(arg3);
            var86.field2339.method5173(arg0);
            var86.field2339.method5207(arg1);
            field762.method2171(var86);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 33) {
            class197 var87 = class197.method3105(class193.field2293, field762.field1341);
            var87.field2339.method5172(arg3);
            var87.field2339.method5180(arg1);
            var87.field2339.method5122(arg0);
            field762.method2171(var87);
            field787 = 0;
            Statics.field308 = class227.method3572(arg1);
            field881 = arg0;
        }
        if (arg2 == 6) {
            field923 = arg6;
            field689 = arg7;
            field785 = 2;
            field784 = 0;
            field911 = arg0;
            field912 = arg1;
            class197 var88 = class197.method3105(class193.field2289, field762.field1341);
            var88.field2339.method5173(arg3);
            var88.field2339.method5121(class55.field427[82] ? 1 : 0);
            var88.field2339.method5122(Statics.field591 + arg0);
            var88.field2339.method5172(Statics.field1153 + arg1);
            field762.method2171(var88);
        }
        if (field834 != 0) {
            field834 = 0;
            method1117(class227.method3572(Statics.field244));
        }
        if (field836) {
            method180();
        }
        if (Statics.field308 != null && field787 == 0) {
            method1117(Statics.field308);
        }
    }

    @ObfuscatedName("aq.ig(ILjava/lang/String;S)V")
    public static void method574(int arg0, String arg1) {
        int var2 = class99.field1279;
        int[] var3 = class99.field1272;
        boolean var4 = false;
        class293 var5 = new class293(arg1, Statics.field165);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field791[var3[var6]];
            if (var7 != null && Statics.field3718 != var7 && var7.field653 != null && var7.field653.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method3105(class193.field2268, field762.field1341);
                    var8.field2339.method5121(0);
                    var8.field2339.method5174(var3[var6]);
                    field762.method2171(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method3105(class193.field2283, field762.field1341);
                    var9.field2339.method5122(var3[var6]);
                    var9.field2339.method5165(0);
                    field762.method2171(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method3105(class193.field2251, field762.field1341);
                    var10.field2339.method5287(0);
                    var10.field2339.method5174(var3[var6]);
                    field762.method2171(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method3105(class193.field2302, field762.field1341);
                    var11.field2339.method5121(0);
                    var11.field2339.method5122(var3[var6]);
                    field762.method2171(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class101.method2911(4, "", class234.field2910 + arg1);
        }
    }

    @ObfuscatedName("ac.ic(IIIIB)V")
    public static void method682(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method194(arg0, arg1);
        if (var4 != null && var4.field2665 != null) {
            class72 var5 = new class72();
            var5.field613 = var4;
            var5.field603 = var4.field2665;
            class86.method1239(var5);
        }
        field838 = arg3;
        field836 = true;
        Statics.field30 = arg0;
        field837 = arg1;
        Statics.field337 = arg2;
        method1117(var4);
    }

    @ObfuscatedName("b.iz(B)V")
    public static void method180() {
        if (!field836) {
            return;
        }
        class227 var0 = class227.method194(Statics.field30, field837);
        if (var0 != null && var0.field2666 != null) {
            class72 var1 = new class72();
            var1.field613 = var0;
            var1.field603 = var0.field2666;
            class86.method1239(var1);
        }
        field836 = false;
        method1117(var0);
    }

    @ObfuscatedName("be.ii(III)V")
    public static void method812(int arg0, int arg1) {
        class197 var2 = class197.method3105(class193.field2292, field762.field1341);
        var2.field2339.method5181(arg0);
        var2.field2339.method5172(arg1);
        field762.method2171(var2);
    }

    @ObfuscatedName("gn.iv(IIIILjava/lang/String;B)V")
    public static void method3365(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method194(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2674 != null) {
            class72 var6 = new class72();
            var6.field613 = var5;
            var6.field606 = arg0;
            var6.field608 = arg4;
            var6.field603 = var5.field2674;
            class86.method1239(var6);
        }
        boolean var7 = true;
        if (var5.field2572 > 0) {
            var7 = method310(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method1127(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class197 var11 = class197.method3105(class193.field2265, field762.field1341);
            var11.field2339.method5279(arg1);
            var11.field2339.method5122(arg2);
            var11.field2339.method5122(arg3);
            field762.method2171(var11);
        }
        if (arg0 == 2) {
            class197 var12 = class197.method3105(class193.field2281, field762.field1341);
            var12.field2339.method5279(arg1);
            var12.field2339.method5122(arg2);
            var12.field2339.method5122(arg3);
            field762.method2171(var12);
        }
        if (arg0 == 3) {
            class197 var13 = class197.method3105(class193.field2279, field762.field1341);
            var13.field2339.method5279(arg1);
            var13.field2339.method5122(arg2);
            var13.field2339.method5122(arg3);
            field762.method2171(var13);
        }
        if (arg0 == 4) {
            class197 var14 = class197.method3105(class193.field2227, field762.field1341);
            var14.field2339.method5279(arg1);
            var14.field2339.method5122(arg2);
            var14.field2339.method5122(arg3);
            field762.method2171(var14);
        }
        if (arg0 == 5) {
            class197 var15 = class197.method3105(class193.field2270, field762.field1341);
            var15.field2339.method5279(arg1);
            var15.field2339.method5122(arg2);
            var15.field2339.method5122(arg3);
            field762.method2171(var15);
        }
        if (arg0 == 6) {
            class197 var16 = class197.method3105(class193.field2231, field762.field1341);
            var16.field2339.method5279(arg1);
            var16.field2339.method5122(arg2);
            var16.field2339.method5122(arg3);
            field762.method2171(var16);
        }
        if (arg0 == 7) {
            class197 var17 = class197.method3105(class193.field2257, field762.field1341);
            var17.field2339.method5279(arg1);
            var17.field2339.method5122(arg2);
            var17.field2339.method5122(arg3);
            field762.method2171(var17);
        }
        if (arg0 == 8) {
            class197 var18 = class197.method3105(class193.field2263, field762.field1341);
            var18.field2339.method5279(arg1);
            var18.field2339.method5122(arg2);
            var18.field2339.method5122(arg3);
            field762.method2171(var18);
        }
        if (arg0 == 9) {
            class197 var19 = class197.method3105(class193.field2224, field762.field1341);
            var19.field2339.method5279(arg1);
            var19.field2339.method5122(arg2);
            var19.field2339.method5122(arg3);
            field762.method2171(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var20 = class197.method3105(class193.field2256, field762.field1341);
        var20.field2339.method5279(arg1);
        var20.field2339.method5122(arg2);
        var20.field2339.method5122(arg3);
        field762.method2171(var20);
    }

    @ObfuscatedName("bp.ir(B)V")
    public static final void method1119() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field694 - 1; var1++) {
                if (field780[var1] < 1000 && field780[var1 + 1] > 1000) {
                    String var2 = field824[var1];
                    field824[var1] = field824[var1 + 1];
                    field824[var1 + 1] = var2;
                    String var3 = field823[var1];
                    field823[var1] = field823[var1 + 1];
                    field823[var1 + 1] = var3;
                    int var4 = field780[var1];
                    field780[var1] = field780[var1 + 1];
                    field780[var1 + 1] = var4;
                    int var5 = field777[var1];
                    field777[var1] = field777[var1 + 1];
                    field777[var1 + 1] = var5;
                    int var6 = field857[var1];
                    field857[var1] = field857[var1 + 1];
                    field857[var1 + 1] = var6;
                    int var7 = field859[var1];
                    field859[var1] = field859[var1 + 1];
                    field859[var1 + 1] = var7;
                    boolean var8 = field810[var1];
                    field810[var1] = field810[var1 + 1];
                    field810[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("jb.ix(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method4739(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1088(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("bv.iy(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1088(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field817 || field694 >= 500) {
            return;
        }
        field823[field694] = arg0;
        field824[field694] = arg1;
        field780[field694] = arg2;
        field859[field694] = arg3;
        field777[field694] = arg4;
        field857[field694] = arg5;
        field810[field694] = arg6;
        field694++;
    }

    @ObfuscatedName("ab.ip(B)I")
    public static final int method345() {
        return field694 - 1;
    }

    @ObfuscatedName("cl.ih(I)V")
    public static void method2150() {
        for (int var0 = 0; var0 < field694; var0++) {
            if (method252(field780[var0])) {
                if (var0 < field694 - 1) {
                    for (int var1 = var0; var1 < field694 - 1; var1++) {
                        field823[var1] = field823[var1 + 1];
                        field824[var1] = field824[var1 + 1];
                        field780[var1] = field780[var1 + 1];
                        field859[var1] = field859[var1 + 1];
                        field777[var1] = field777[var1 + 1];
                        field857[var1] = field857[var1 + 1];
                        field810[var1] = field810[var1 + 1];
                    }
                }
                var0--;
                field694--;
            }
        }
        method3575(Statics.field384 / 2 + Statics.field249, Statics.field2344);
    }

    @ObfuscatedName("ae.ia(II)Z")
    public static boolean method252(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ar.in(IIIII)V")
    public static final void method349(int arg0, int arg1, int arg2, int arg3) {
        if (field834 == 0 && !field836) {
            method4739(class234.field2920, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class138.method1094(); var8++) {
            long var9 = class138.method735(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class138.method2172(var8);
                int var12 = class138.method313(var8);
                int var13 = class138.method4640(var8);
                int var14 = class138.method358(var8);
                if (var13 == 2 && Statics.field61.method2943(Statics.field611, var11, var12, var9) >= 0) {
                    class264 var15 = class264.method363(var14);
                    if (var15.field3386 != null) {
                        var15 = var15.method4277();
                    }
                    if (var15 == null) {
                        continue;
                    }
                    if (field834 == 1) {
                        method4739(class234.field3014, field934 + " " + class91.field1167 + " " + class91.method4912(65535) + var15.field3355, 1, var14, var11, var12);
                    } else if (!field836) {
                        String[] var16 = var15.field3369;
                        if (var16 != null) {
                            for (int var17 = 4; var17 >= 0; var17--) {
                                if (var16[var17] != null) {
                                    short var18 = 0;
                                    if (var17 == 0) {
                                        var18 = 3;
                                    }
                                    if (var17 == 1) {
                                        var18 = 4;
                                    }
                                    if (var17 == 2) {
                                        var18 = 5;
                                    }
                                    if (var17 == 3) {
                                        var18 = 6;
                                    }
                                    if (var17 == 4) {
                                        var18 = 1001;
                                    }
                                    method4739(var16[var17], class91.method4912(65535) + var15.field3355, var18, var14, var11, var12);
                                }
                            }
                        }
                        method4739(class234.field2912, class91.method4912(65535) + var15.field3355, 1002, var15.field3352, var11, var12);
                    } else if ((Statics.field337 & 0x4) == 4) {
                        method4739(field839, field840 + " " + class91.field1167 + " " + class91.method4912(65535) + var15.field3355, 2, var14, var11, var12);
                    }
                }
                if (var13 == 1) {
                    class89 var19 = field722[var14];
                    if (var19 == null) {
                        continue;
                    }
                    if (var19.field1149.field3471 == 1 && (var19.field984 & 0x7F) == 64 && (var19.field974 & 0x7F) == 64) {
                        for (int var20 = 0; var20 < field723; var20++) {
                            class89 var21 = field722[field724[var20]];
                            if (var21 != null && var19 != var21 && var21.field1149.field3471 == 1 && var19.field984 == var21.field984 && var19.field974 == var21.field974) {
                                method568(var21.field1149, field724[var20], var11, var12);
                            }
                        }
                        int var22 = class99.field1279;
                        int[] var23 = class99.field1272;
                        for (int var24 = 0; var24 < var22; var24++) {
                            class76 var25 = field791[var23[var24]];
                            if (var25 != null && var19.field984 == var25.field984 && var19.field974 == var25.field974) {
                                method1123(var25, var23[var24], var11, var12);
                            }
                        }
                    }
                    method568(var19.field1149, var14, var11, var12);
                }
                if (var13 == 0) {
                    class76 var26 = field791[var14];
                    if (var26 == null) {
                        continue;
                    }
                    if ((var26.field984 & 0x7F) == 64 && (var26.field974 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < field723; var27++) {
                            class89 var28 = field722[field724[var27]];
                            if (var28 != null && var28.field1149.field3471 == 1 && var26.field984 == var28.field984 && var26.field974 == var28.field974) {
                                method568(var28.field1149, field724[var27], var11, var12);
                            }
                        }
                        int var29 = class99.field1279;
                        int[] var30 = class99.field1272;
                        for (int var31 = 0; var31 < var29; var31++) {
                            class76 var32 = field791[var30[var31]];
                            if (var32 != null && var26 != var32 && var26.field984 == var32.field984 && var26.field974 == var32.field974) {
                                method1123(var32, var30[var31], var11, var12);
                            }
                        }
                    }
                    if (field808 == var14) {
                        var4 = var9;
                    } else {
                        method1123(var26, var14, var11, var12);
                    }
                }
                if (var13 == 3) {
                    class272 var33 = field809[Statics.field611][var11][var12];
                    if (var33 != null) {
                        for (class97 var34 = (class97) var33.method4563(); var34 != null; var34 = (class97) var33.method4560()) {
                            class265 var35 = class265.method337(var34.field1255);
                            if (field834 == 1) {
                                method4739(class234.field3014, field934 + " " + class91.field1167 + " " + class91.method4912(16748608) + var35.field3398, 16, var34.field1255, var11, var12);
                            } else if (!field836) {
                                String[] var36 = var35.field3420;
                                for (int var37 = 4; var37 >= 0; var37--) {
                                    if (var36 != null && var36[var37] != null) {
                                        byte var38 = 0;
                                        if (var37 == 0) {
                                            var38 = 18;
                                        }
                                        if (var37 == 1) {
                                            var38 = 19;
                                        }
                                        if (var37 == 2) {
                                            var38 = 20;
                                        }
                                        if (var37 == 3) {
                                            var38 = 21;
                                        }
                                        if (var37 == 4) {
                                            var38 = 22;
                                        }
                                        method4739(var36[var37], class91.method4912(16748608) + var35.field3398, var38, var34.field1255, var11, var12);
                                    } else if (var37 == 2) {
                                        method4739(class234.field3061, class91.method4912(16748608) + var35.field3398, 20, var34.field1255, var11, var12);
                                    }
                                }
                                method4739(class234.field2912, class91.method4912(16748608) + var35.field3398, 1004, var34.field1255, var11, var12);
                            } else if ((Statics.field337 & 0x1) == 1) {
                                method4739(field839, field840 + " " + class91.field1167 + " " + class91.method4912(16748608) + var35.field3398, 17, var34.field1255, var11, var12);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var39 = (int) (var4 >>> 0 & 0x7FL);
            int var41 = class138.method3202(var4);
            class76 var42 = field791[field808];
            method1123(var42, field808, var39, var41);
        }
    }

    @ObfuscatedName("ao.ie(Ljj;IIII)V")
    public static final void method568(class267 arg0, int arg1, int arg2, int arg3) {
        if (field694 >= 400) {
            return;
        }
        if (arg0.field3491 != null) {
            arg0 = arg0.method4394();
        }
        if (arg0 == null || !arg0.field3494 || arg0.field3463 && field841 != arg1) {
            return;
        }
        String var4 = arg0.field3466;
        if (arg0.field3483 != 0) {
            int var6 = arg0.field3483;
            int var7 = Statics.field3718.field651;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class91.method4912(16711680);
            } else if (var8 < -6) {
                var9 = class91.method4912(16723968);
            } else if (var8 < -3) {
                var9 = class91.method4912(16740352);
            } else if (var8 < 0) {
                var9 = class91.method4912(16756736);
            } else if (var8 > 9) {
                var9 = class91.method4912(65280);
            } else if (var8 > 6) {
                var9 = class91.method4912(4259584);
            } else if (var8 > 3) {
                var9 = class91.method4912(8453888);
            } else if (var8 > 0) {
                var9 = class91.method4912(12648192);
            } else {
                var9 = class91.method4912(16776960);
            }
            var4 = var4 + var9 + " " + class91.field1165 + class234.field2831 + arg0.field3483 + class91.field1166;
        }
        if (arg0.field3463 && field826) {
            method4739(class234.field2912, class91.method4912(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field834 == 1) {
            method4739(class234.field3014, field934 + " " + class91.field1167 + " " + class91.method4912(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field836) {
            int var10 = arg0.field3463 && field826 ? 2000 : 0;
            String[] var11 = arg0.field3481;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class234.field2946)) {
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
                        method4739(var11[var12], class91.method4912(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class234.field2946)) {
                        short var15 = 0;
                        if (field707 != class94.field1186) {
                            if (field707 == class94.field1184 || field707 == class94.field1189 && arg0.field3483 > Statics.field3718.field651) {
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
                            method4739(var11[var14], class91.method4912(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3463 || !field826) {
                method4739(class234.field2912, class91.method4912(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field337 & 0x2) == 2) {
            method4739(field839, field840 + " " + class91.field1167 + " " + class91.method4912(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bm.iq(Lbi;IIII)V")
    public static final void method1123(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3718 == arg0 || field694 >= 400) {
            return;
        }
        String var9;
        if (arg0.field672 == 0) {
            String var4 = arg0.field650[0] + arg0.field653 + arg0.field650[1];
            int var5 = arg0.field651;
            int var6 = Statics.field3718.field651;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class91.method4912(16711680);
            } else if (var7 < -6) {
                var8 = class91.method4912(16723968);
            } else if (var7 < -3) {
                var8 = class91.method4912(16740352);
            } else if (var7 < 0) {
                var8 = class91.method4912(16756736);
            } else if (var7 > 9) {
                var8 = class91.method4912(65280);
            } else if (var7 > 6) {
                var8 = class91.method4912(4259584);
            } else if (var7 > 3) {
                var8 = class91.method4912(8453888);
            } else if (var7 > 0) {
                var8 = class91.method4912(12648192);
            } else {
                var8 = class91.method4912(16776960);
            }
            var9 = var4 + var8 + " " + class91.field1165 + class234.field2831 + arg0.field651 + class91.field1166 + arg0.field650[2];
        } else {
            var9 = arg0.field650[0] + arg0.field653 + arg0.field650[1] + " " + class91.field1165 + class234.field2944 + arg0.field672 + class91.field1166 + arg0.field650[2];
        }
        if (field834 == 1) {
            method4739(class234.field3014, field934 + " " + class91.field1167 + " " + class91.method4912(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field836) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field805[var10] != null) {
                    short var11 = 0;
                    if (field805[var10].equalsIgnoreCase(class234.field2946)) {
                        if (field706 == class94.field1186) {
                            continue;
                        }
                        if (field706 == class94.field1184 || field706 == class94.field1189 && arg0.field651 > Statics.field3718.field651) {
                            var11 = 2000;
                        }
                        if (Statics.field3718.field645 != 0 && arg0.field645 != 0) {
                            if (Statics.field3718.field645 == arg0.field645) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field806[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field804[var10] + var11;
                    method4739(field805[var10], class91.method4912(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field337 & 0x8) == 8) {
            method4739(field839, field840 + " " + class91.field1167 + " " + class91.method4912(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field694; var14++) {
            if (field780[var14] == 23) {
                field824[var14] = class91.method4912(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("hy.ik(IIIIIIIII)V")
    public static final void method3631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method1732(arg0)) {
            Statics.field71 = null;
            method3862(Statics.field2694[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field71 != null) {
                method3862(Statics.field71, -1412584499, arg1, arg2, arg3, arg4, Statics.field246, Statics.field3527, arg7);
                Statics.field71 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field680[var8] = true;
            }
        } else {
            field680[arg7] = true;
        }
    }

    @ObfuscatedName("iv.io([Lhe;IIIIIIIIB)V")
    public static final void method3862(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class331.method5599(arg2, arg3, arg4, arg5);
        class140.method2883();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2587 == arg1 || arg1 == -1412584499 && field854 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field951[field884] = var10.field2581 + arg6;
                    field940[field884] = var10.field2654 + arg7;
                    field734[field884] = var10.field2583;
                    field737[field884] = var10.field2643;
                    var11 = ++field884 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2703 = var11;
                var10.field2604 = field690;
                if (!var10.field2567 || !method321(var10)) {
                    if (var10.field2572 > 0) {
                        method3223(var10);
                    }
                    int var12 = var10.field2581 + arg6;
                    int var13 = var10.field2654 + arg7;
                    int var14 = var10.field2641;
                    if (field854 == var10) {
                        if (arg1 != -1412584499 && !var10.field2675) {
                            Statics.field71 = arg0;
                            Statics.field246 = arg6;
                            Statics.field3527 = arg7;
                            continue;
                        }
                        if (field865 && field733) {
                            int var15 = class64.field518;
                            int var16 = class64.field519;
                            int var17 = var15 - field856;
                            int var18 = var16 - field929;
                            if (var17 < field860) {
                                var17 = field860;
                            }
                            if (var10.field2583 + var17 > field860 + field855.field2583) {
                                var17 = field860 + field855.field2583 - var10.field2583;
                            }
                            if (var18 < field882) {
                                var18 = field882;
                            }
                            if (var10.field2643 + var18 > field882 + field855.field2643) {
                                var18 = field882 + field855.field2643 - var10.field2643;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2675) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2570 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2570 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2583 + var12;
                        int var26 = var10.field2643 + var13;
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
                        int var29 = var10.field2583 + var12;
                        int var30 = var10.field2643 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2567 || var19 < var21 && var20 < var22) {
                        if (var10.field2572 != 0) {
                            if (var10.field2572 == 1336) {
                                if (field935) {
                                    var13 += 15;
                                    Statics.field141.method4989("Fps:" + field480, var10.field2583 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field685) {
                                        var33 = 16711680;
                                    }
                                    Statics.field141.method4989("Mem:" + var32 + "k", var10.field2583 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2572 == 1337) {
                                field830 = var12;
                                field831 = var13;
                                method3718(var12, var13, var10.field2583, var10.field2643);
                                field680[var10.field2703] = true;
                                class331.method5599(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2572 == 1338) {
                                method1100(var10, var12, var13, var11);
                                class331.method5599(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2572 == 1339) {
                                method5425(var10, var12, var13, var11);
                                class331.method5599(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2572 == 1400) {
                                Statics.field122.method5973(var12, var13, var10.field2583, var10.field2643, field690);
                            }
                            if (var10.field2572 == 1401) {
                                Statics.field122.method5942(var12, var13, var10.field2583, var10.field2643);
                            }
                            if (var10.field2572 == 1402) {
                                Statics.field2028.method1750(var12, field690);
                            }
                        }
                        if (var10.field2570 == 0) {
                            if (!var10.field2567 && method321(var10) && Statics.field53 != var10) {
                                continue;
                            }
                            if (!var10.field2567) {
                                if (var10.field2590 > var10.field2598 - var10.field2643) {
                                    var10.field2590 = var10.field2598 - var10.field2643;
                                }
                                if (var10.field2590 < 0) {
                                    var10.field2590 = 0;
                                }
                            }
                            method3862(arg0, var10.field2568, var19, var20, var21, var22, var12 - var10.field2647, var13 - var10.field2590, var11);
                            if (var10.field2698 != null) {
                                method3862(var10.field2698, var10.field2568, var19, var20, var21, var22, var12 - var10.field2647, var13 - var10.field2590, var11);
                            }
                            class71 var34 = (class71) field842.method5561((long) var10.field2568);
                            if (var34 != null) {
                                method3631(var34.field600, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class331.method5599(arg2, arg3, arg4, arg5);
                            class140.method2883();
                        }
                        if (field895 || field814[var11] || field893 > 1) {
                            if (var10.field2570 == 0 && !var10.field2567 && var10.field2598 > var10.field2643) {
                                method4952(var10.field2583 + var12, var13, var10.field2590, var10.field2643, var10.field2598);
                            }
                            if (var10.field2570 != 1) {
                                if (var10.field2570 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2622; var36++) {
                                        for (int var37 = 0; var37 < var10.field2580; var37++) {
                                            int var38 = (var10.field2635 + 32) * var37 + var12;
                                            int var39 = (var10.field2636 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2661[var35];
                                                var39 += var10.field2638[var35];
                                            }
                                            if (var10.field2672[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2672[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field3083 == var10 && field818 == var35) {
                                                    class335 var43;
                                                    if (field834 == 1 && Statics.field958 == var35 && Statics.field244 == var10.field2568) {
                                                        var43 = class265.method2026(var42, var10.field2693[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class265.method2026(var42, var10.field2693[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1117(var10);
                                                    } else if (Statics.field3083 == var10 && field818 == var35) {
                                                        int var44 = class64.field518 - field790;
                                                        int var45 = class64.field519 - field697;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field794 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5737(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class331.field3863 && var46.field2590 > 0) {
                                                                int var47 = field742 * (class331.field3863 - var39 - var45) / 3;
                                                                if (var47 > field742 * 10) {
                                                                    var47 = field742 * 10;
                                                                }
                                                                if (var47 > var46.field2590) {
                                                                    var47 = var46.field2590;
                                                                }
                                                                var46.field2590 -= var47;
                                                                field697 += var47;
                                                                method1117(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class331.field3867 && var46.field2590 < var46.field2598 - var46.field2643) {
                                                                int var48 = field742 * (var39 + var45 + 32 - class331.field3867) / 3;
                                                                if (var48 > field742 * 10) {
                                                                    var48 = field742 * 10;
                                                                }
                                                                if (var48 > var46.field2598 - var46.field2643 - var46.field2590) {
                                                                    var48 = var46.field2598 - var46.field2643 - var46.field2590;
                                                                }
                                                                var46.field2590 += var48;
                                                                field697 -= var48;
                                                                method1117(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field308 == var10 && field881 == var35) {
                                                        var43.method5737(var38, var39, 128);
                                                    } else {
                                                        var43.method5731(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2639 != null && var35 < 20) {
                                                class335 var49 = var10.method3773(var35);
                                                if (var49 != null) {
                                                    var49.method5731(var38, var39);
                                                } else if (class227.field2566) {
                                                    method1117(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2570 == 3) {
                                    int var50;
                                    if (method220(var10)) {
                                        var50 = var10.field2637;
                                        if (Statics.field53 == var10 && var10.field2596 != 0) {
                                            var50 = var10.field2596;
                                        }
                                    } else {
                                        var50 = var10.field2593;
                                        if (Statics.field53 == var10 && var10.field2706 != 0) {
                                            var50 = var10.field2706;
                                        }
                                    }
                                    if (var10.field2686) {
                                        switch(var10.field2652.field3874) {
                                            case 1:
                                                class331.method5607(var12, var13, var10.field2583, var10.field2643, var10.field2593, var10.field2637);
                                                break;
                                            case 2:
                                                class331.method5631(var12, var13, var10.field2583, var10.field2643, var10.field2593, var10.field2637, 255 - (var10.field2641 & 0xFF), 255 - (var10.field2600 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class331.method5606(var12, var13, var10.field2583, var10.field2643, var50);
                                                } else {
                                                    class331.method5605(var12, var13, var10.field2583, var10.field2643, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class331.method5691(var12, var13, var10.field2583, var10.field2643, var50);
                                    } else {
                                        class331.method5610(var12, var13, var10.field2583, var10.field2643, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2570 == 4) {
                                    class305 var51 = var10.method3778();
                                    if (var51 != null) {
                                        String var52 = var10.field2629;
                                        int var53;
                                        if (method220(var10)) {
                                            var53 = var10.field2637;
                                            if (Statics.field53 == var10 && var10.field2596 != 0) {
                                                var53 = var10.field2596;
                                            }
                                            if (var10.field2597.length() > 0) {
                                                var52 = var10.field2597;
                                            }
                                        } else {
                                            var53 = var10.field2593;
                                            if (Statics.field53 == var10 && var10.field2706 != 0) {
                                                var53 = var10.field2706;
                                            }
                                        }
                                        if (var10.field2567 && var10.field2705 != -1) {
                                            class265 var54 = class265.method337(var10.field2705);
                                            var52 = var54.field3398;
                                            if (var52 == null) {
                                                var52 = class234.field2765;
                                            }
                                            if ((var54.field3419 == 1 || var10.field2695 != 1) && var10.field2695 != -1) {
                                                var52 = class91.method4912(16748608) + var52 + class91.field1163 + " " + 'x' + method3224(var10.field2695);
                                            }
                                        }
                                        if (field883 == var10) {
                                            var52 = class234.field2919;
                                            var53 = var10.field2593;
                                        }
                                        if (!var10.field2567) {
                                            var52 = method3117(var52, var10);
                                        }
                                        var51.method4995(var52, var12, var13, var10.field2583, var10.field2643, var53, var10.field2685 ? 0 : -1, var10.field2632, var10.field2646, var10.field2631);
                                    } else if (class227.field2566) {
                                        method1117(var10);
                                    }
                                } else if (var10.field2570 == 5) {
                                    if (var10.field2567) {
                                        class335 var56;
                                        if (var10.field2705 == -1) {
                                            var56 = var10.method3771(false);
                                        } else {
                                            var56 = class265.method2026(var10.field2705, var10.field2695, var10.field2607, var10.field2608, var10.field2627, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3894;
                                            int var58 = var56.field3891;
                                            if (var10.field2606) {
                                                class331.method5620(var12, var13, var10.field2583 + var12, var10.field2643 + var13);
                                                int var59 = (var10.field2583 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2643 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2605 != 0) {
                                                            var56.method5791(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2605, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5731(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5737(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class331.method5599(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2583 * 4096 / var57;
                                                if (var10.field2605 != 0) {
                                                    var56.method5791(var10.field2583 / 2 + var12, var10.field2643 / 2 + var13, var10.field2605, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5739(var12, var13, var10.field2583, var10.field2643, 256 - (var14 & 0xFF));
                                                } else if (var10.field2583 == var57 && var10.field2643 == var58) {
                                                    var56.method5731(var12, var13);
                                                } else {
                                                    var56.method5733(var12, var13, var10.field2583, var10.field2643);
                                                }
                                            }
                                        } else if (class227.field2566) {
                                            method1117(var10);
                                        }
                                    } else {
                                        class335 var55 = var10.method3771(method220(var10));
                                        if (var55 != null) {
                                            var55.method5731(var12, var13);
                                        } else if (class227.field2566) {
                                            method1117(var10);
                                        }
                                    }
                                } else if (var10.field2570 == 6) {
                                    boolean var64 = method220(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2616;
                                    } else {
                                        var65 = var10.field2615;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2705 != -1) {
                                        class265 var68 = class265.method337(var10.field2705);
                                        if (var68 != null) {
                                            class265 var69 = var68.method4321(var10.field2695);
                                            var66 = var69.method4328(1);
                                            if (var66 == null) {
                                                method1117(var10);
                                            } else {
                                                var66.method2705();
                                                var67 = var66.field1884 / 2;
                                            }
                                        }
                                    } else if (var10.field2611 == 5) {
                                        if (var10.field2612 == 0) {
                                            var66 = field945.method3726((class269) null, -1, (class269) null, -1);
                                        } else {
                                            var66 = Statics.field3718.method1182();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3774((class269) null, -1, var64, Statics.field3718.field647);
                                        if (var66 == null && class227.field2566) {
                                            method1117(var10);
                                        }
                                    } else {
                                        class269 var70 = class269.method4110(var65);
                                        var66 = var10.method3774(var70, var10.field2588, var64, Statics.field3718.field647);
                                        if (var66 == null && class227.field2566) {
                                            method1117(var10);
                                        }
                                    }
                                    class140.method2835(var10.field2583 / 2 + var12, var10.field2643 / 2 + var13);
                                    int var71 = var10.field2660 * class140.field1795[var10.field2619] >> 16;
                                    int var72 = var10.field2660 * class140.field1796[var10.field2619] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2567) {
                                            var66.method2705();
                                            if (var10.field2625) {
                                                var66.method2749(0, var10.field2620, var10.field2658, var10.field2619, var10.field2617, var10.field2618 + var67 + var71, var10.field2618 + var72, var10.field2660);
                                            } else {
                                                var66.method2718(0, var10.field2620, var10.field2658, var10.field2619, var10.field2617, var10.field2618 + var67 + var71, var10.field2618 + var72);
                                            }
                                        } else {
                                            var66.method2718(0, var10.field2620, 0, var10.field2619, 0, var71, var72);
                                        }
                                    }
                                    class140.method2900();
                                } else {
                                    if (var10.field2570 == 7) {
                                        class305 var73 = var10.method3778();
                                        if (var73 == null) {
                                            if (class227.field2566) {
                                                method1117(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2622; var75++) {
                                            for (int var76 = 0; var76 < var10.field2580; var76++) {
                                                if (var10.field2672[var74] > 0) {
                                                    class265 var77 = class265.method337(var10.field2672[var74] - 1);
                                                    String var78;
                                                    if (var77.field3419 != 1 && var10.field2693[var74] == 1) {
                                                        var78 = class91.method4912(16748608) + var77.field3398 + class91.field1163;
                                                    } else {
                                                        var78 = class91.method4912(16748608) + var77.field3398 + class91.field1163 + " " + 'x' + method3224(var10.field2693[var74]);
                                                    }
                                                    int var79 = (var10.field2635 + 115) * var76 + var12;
                                                    int var80 = (var10.field2636 + 12) * var75 + var13;
                                                    if (var10.field2632 == 0) {
                                                        var73.method4987(var78, var79, var80, var10.field2593, var10.field2685 ? 0 : -1);
                                                    } else if (var10.field2632 == 1) {
                                                        var73.method4990(var78, var10.field2583 / 2 + var79, var80, var10.field2593, var10.field2685 ? 0 : -1);
                                                    } else {
                                                        var73.method4989(var78, var10.field2583 + var79 - 1, var80, var10.field2593, var10.field2685 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2570 == 8 && Statics.field2369 == var10 && field872 == field833) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class305 var83 = Statics.field141;
                                        String var84 = var10.field2629;
                                        String var85 = method3117(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class91.field1168);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4982(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3683 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2583 + var12 - 5 - var81;
                                        int var90 = var10.field2643 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class331.method5606(var89, var90, var81, var82, 16777120);
                                        class331.method5691(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2629;
                                        int var92 = var83.field3683 + var90 + 2;
                                        String var93 = method3117(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class91.field1168);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4987(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3683 + 1;
                                        }
                                    }
                                    if (var10.field2570 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2602) {
                                            var96 = var12;
                                            var97 = var10.field2643 + var13;
                                            var98 = var10.field2583 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2583 + var12;
                                            var99 = var10.field2643 + var13;
                                        }
                                        if (var10.field2601 == 1) {
                                            class331.method5615(var96, var97, var98, var99, var10.field2593);
                                        } else {
                                            method841(var96, var97, var98, var99, var10.field2593, var10.field2601);
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

    @ObfuscatedName("bt.it(IIIIIII)V")
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class331.field3868;
        int var18 = arg1 - class331.field3863;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2846(var19, var20, var21);
        class140.method2843(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2846(var19, var21, var22);
        class140.method2843(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ez.iw(Ljava/lang/String;Lhe;I)Ljava/lang/String;")
    public static String method3117(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1071(arg1, var2 - 1);
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

    @ObfuscatedName("fc.if(IB)Ljava/lang/String;")
    public static final String method3224(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1162 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method4912(65408) + var1.substring(0, var1.length() - 8) + class234.field2922 + " " + class91.field1165 + var1 + class91.field1166 + class91.field1163;
        } else if (var1.length() > 6) {
            return " " + class91.method4912(16777215) + var1.substring(0, var1.length() - 4) + class234.field3040 + " " + class91.field1165 + var1 + class91.field1166 + class91.field1163;
        } else {
            return " " + class91.method4912(16776960) + var1 + class91.field1163;
        }
    }

    @ObfuscatedName("client.ib(ZB)V")
    public final void method1256(boolean arg0) {
        int var2 = field925;
        int var3 = Statics.field278;
        int var4 = Statics.field2526;
        if (class227.method1732(var2)) {
            method1124(Statics.field2694[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.id(Lhe;I)V")
    public void method1257(class227 arg0) {
        class227 var2 = arg0.field2587 == -1 ? null : class227.method3572(arg0.field2587);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field278;
            var4 = Statics.field2526;
        } else {
            var3 = var2.field2583;
            var4 = var2.field2643;
        }
        method650(arg0, var3, var4, false);
        method261(arg0, var3, var4);
    }

    @ObfuscatedName("bq.il([Lhe;Lhe;ZI)V")
    public static void method1005(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2591 == 0 ? arg1.field2583 : arg1.field2591;
        int var4 = arg1.field2598 == 0 ? arg1.field2643 : arg1.field2598;
        method1124(arg0, arg1.field2568, var3, var4, arg2);
        if (arg1.field2698 != null) {
            method1124(arg1.field2698, arg1.field2568, var3, var4, arg2);
        }
        class71 var5 = (class71) field842.method5561((long) arg1.field2568);
        if (var5 != null) {
            int var6 = var5.field600;
            if (class227.method1732(var6)) {
                method1124(Statics.field2694[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2572 == 1337) {
        }
    }

    @ObfuscatedName("bm.iu([Lhe;IIIZI)V")
    public static void method1124(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2587 == arg1) {
                method650(var6, arg2, arg3, arg4);
                method261(var6, arg2, arg3);
                if (var6.field2647 > var6.field2591 - var6.field2583) {
                    var6.field2647 = var6.field2591 - var6.field2583;
                }
                if (var6.field2647 < 0) {
                    var6.field2647 = 0;
                }
                if (var6.field2590 > var6.field2598 - var6.field2643) {
                    var6.field2590 = var6.field2598 - var6.field2643;
                }
                if (var6.field2590 < 0) {
                    var6.field2590 = 0;
                }
                if (var6.field2570 == 0) {
                    method1005(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ad.is(Lhe;IIZS)V")
    public static void method650(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2583;
        int var5 = arg0.field2643;
        if (arg0.field2704 == 0) {
            arg0.field2583 = arg0.field2580;
        } else if (arg0.field2704 == 1) {
            arg0.field2583 = arg1 - arg0.field2580;
        } else if (arg0.field2704 == 2) {
            arg0.field2583 = arg0.field2580 * arg1 >> 14;
        }
        if (arg0.field2684 == 0) {
            arg0.field2643 = arg0.field2622;
        } else if (arg0.field2684 == 1) {
            arg0.field2643 = arg2 - arg0.field2622;
        } else if (arg0.field2684 == 2) {
            arg0.field2643 = arg0.field2622 * arg2 >> 14;
        }
        if (arg0.field2704 == 4) {
            arg0.field2583 = arg0.field2643 * arg0.field2585 / arg0.field2586;
        }
        if (arg0.field2684 == 4) {
            arg0.field2643 = arg0.field2586 * arg0.field2583 / arg0.field2585;
        }
        if (arg0.field2572 == 1337) {
            field853 = arg0;
        }
        if (arg3 && arg0.field2683 != null && (arg0.field2583 != var4 || arg0.field2643 != var5)) {
            class72 var6 = new class72();
            var6.field613 = arg0;
            var6.field603 = arg0.field2683;
            field788.method4580(var6);
        }
    }

    @ObfuscatedName("ae.jq(Lhe;III)V")
    public static void method261(class227 arg0, int arg1, int arg2) {
        if (arg0.field2573 == 0) {
            arg0.field2581 = arg0.field2577;
        } else if (arg0.field2573 == 1) {
            arg0.field2581 = (arg1 - arg0.field2583) / 2 + arg0.field2577;
        } else if (arg0.field2573 == 2) {
            arg0.field2581 = arg1 - arg0.field2583 - arg0.field2577;
        } else if (arg0.field2573 == 3) {
            arg0.field2581 = arg0.field2577 * arg1 >> 14;
        } else if (arg0.field2573 == 4) {
            arg0.field2581 = (arg0.field2577 * arg1 >> 14) + (arg1 - arg0.field2583) / 2;
        } else {
            arg0.field2581 = arg1 - arg0.field2583 - (arg0.field2577 * arg1 >> 14);
        }
        if (arg0.field2574 == 0) {
            arg0.field2654 = arg0.field2595;
        } else if (arg0.field2574 == 1) {
            arg0.field2654 = (arg2 - arg0.field2643) / 2 + arg0.field2595;
        } else if (arg0.field2574 == 2) {
            arg0.field2654 = arg2 - arg0.field2643 - arg0.field2595;
        } else if (arg0.field2574 == 3) {
            arg0.field2654 = arg0.field2595 * arg2 >> 14;
        } else if (arg0.field2574 == 4) {
            arg0.field2654 = (arg0.field2595 * arg2 >> 14) + (arg2 - arg0.field2643) / 2;
        } else {
            arg0.field2654 = arg2 - arg0.field2643 - (arg0.field2595 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ei.ji(Lhe;IIIIIII)V")
    public static final void method2828(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field747) {
            field820 = 32;
        } else {
            field820 = 0;
        }
        field747 = false;
        if (class64.field522 == 1 || !Statics.field2507 && class64.field522 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2590 -= 4;
                method1117(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2590 += 4;
                method1117(arg0);
            } else if (arg5 >= arg1 - field820 && arg5 < field820 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2590 = (arg4 - arg3) * var8 / var9;
                method1117(arg0);
                field747 = true;
            }
        }
        if (field879 == 0) {
            return;
        }
        int var10 = arg0.field2583;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2590 += field879 * 45;
            method1117(arg0);
        }
    }

    @ObfuscatedName("ka.jv(IIIIII)V")
    public static final void method4952(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2752[0].method5717(arg0, arg1);
        Statics.field2752[1].method5717(arg0, arg1 + arg3 - 16);
        class331.method5606(arg0, arg1 + 16, 16, arg3 - 32, field743);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class331.method5606(arg0, arg1 + 16 + var6, 16, var5, field748);
        class331.method5613(arg0, arg1 + 16 + var6, var5, field746);
        class331.method5613(arg0 + 1, arg1 + 16 + var6, var5, field746);
        class331.method5611(arg0, arg1 + 16 + var6, 16, field746);
        class331.method5611(arg0, arg1 + 17 + var6, 16, field746);
        class331.method5613(arg0 + 15, arg1 + 16 + var6, var5, field745);
        class331.method5613(arg0 + 14, arg1 + 17 + var6, var5 - 1, field745);
        class331.method5611(arg0, arg1 + 15 + var6 + var5, 16, field745);
        class331.method5611(arg0 + 1, arg1 + 14 + var6 + var5, 15, field745);
    }

    @ObfuscatedName("o.jw(Lhe;I)Z")
    public static final boolean method220(class227 arg0) {
        if (arg0.field2687 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2687.length; var1++) {
            int var2 = method1071(arg0, var1);
            int var3 = arg0.field2688[var1];
            if (arg0.field2687[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2687[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2687[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ba.jx(Lhe;II)I")
    public static final int method1071(class227 arg0, int arg1) {
        if (arg0.field2651 == null || arg1 >= arg0.field2651.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2651[arg1];
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
                    var7 = field687[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field753[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field822[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method3572(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class265.method337(var12).field3413 || field684)) {
                        for (int var13 = 0; var13 < var11.field2672.length; var13++) {
                            if (var12 + 1 == var11.field2672[var13]) {
                                var7 += var11.field2693[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2527[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2748[field753[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2527[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3718.field651;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2745[var14]) {
                            var7 += field753[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method3572(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class265.method337(var18).field3413 || field684)) {
                        for (int var19 = 0; var19 < var17.field2672.length; var19++) {
                            if (var18 + 1 == var17.field2672[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field848;
                }
                if (var6 == 12) {
                    var7 = field849;
                }
                if (var6 == 13) {
                    int var20 = class222.field2527[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method2013(var22);
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
                    var7 = (Statics.field3718.field984 >> 7) + Statics.field591;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3718.field974 >> 7) + Statics.field1153;
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

    @ObfuscatedName("bs.je(Lhe;Ljx;IIZI)V")
    public static final void method1116(class227 arg0, class265 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3421;
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
            var7 = class234.field2929;
        }
        if (var6 != -1 && var7 != null) {
            method1088(var7, class91.method4912(16748608) + arg1.field3398, var6, arg1.field3404, arg2, arg0.field2568, arg4);
        }
    }

    @ObfuscatedName("ae.jj(Lhe;III)V")
    public static final void method258(class227 arg0, int arg1, int arg2) {
        if (arg0.field2571 == 1) {
            method4739(arg0.field2691, "", 24, 0, 0, arg0.field2568);
        }
        if (arg0.field2571 == 2 && !field836) {
            String var3 = method5486(arg0);
            if (var3 != null) {
                method4739(var3, class91.method4912(65280) + arg0.field2690, 25, 0, -1, arg0.field2568);
            }
        }
        if (arg0.field2571 == 3) {
            method4739(class234.field2778, "", 26, 0, 0, arg0.field2568);
        }
        if (arg0.field2571 == 4) {
            method4739(arg0.field2691, "", 28, 0, 0, arg0.field2568);
        }
        if (arg0.field2571 == 5) {
            method4739(arg0.field2691, "", 29, 0, 0, arg0.field2568);
        }
        if (arg0.field2571 == 6 && field883 == null) {
            method4739(arg0.field2691, "", 30, 0, -1, arg0.field2568);
        }
        if (arg0.field2570 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2643; var5++) {
                for (int var6 = 0; var6 < arg0.field2583; var6++) {
                    int var7 = (arg0.field2635 + 32) * var6;
                    int var8 = (arg0.field2636 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2661[var4];
                        var8 += arg0.field2638[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field792 = var4;
                        Statics.field2107 = arg0;
                        if (arg0.field2672[var4] > 0) {
                            label270: {
                                class265 var9 = class265.method337(arg0.field2672[var4] - 1);
                                if (field834 == 1) {
                                    int var10 = method1127(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field244 != arg0.field2568 || Statics.field958 != var4) {
                                            method4739(class234.field3014, field934 + " " + class91.field1167 + " " + class91.method4912(16748608) + var9.field3398, 31, var9.field3404, var4, arg0.field2568);
                                        }
                                        break label270;
                                    }
                                }
                                if (field836) {
                                    int var12 = method1127(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field337 & 0x10) == 16) {
                                            method4739(field839, field840 + " " + class91.field1167 + " " + class91.method4912(16748608) + var9.field3398, 32, var9.field3404, var4, arg0.field2568);
                                        }
                                        break label270;
                                    }
                                }
                                String[] var14 = var9.field3421;
                                int var15 = -1;
                                if (field827) {
                                    boolean var16 = field828 || class55.field427[81];
                                    if (var16) {
                                        var15 = var9.method4349();
                                    }
                                }
                                int var17 = method1127(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 4; var19 >= 3; var19--) {
                                        if (var15 != var19) {
                                            method1116(arg0, var9, var4, var19, false);
                                        }
                                    }
                                }
                                int var20 = method1127(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method4739(class234.field3014, class91.method4912(16748608) + var9.field3398, 38, var9.field3404, var4, arg0.field2568);
                                }
                                int var22 = method1127(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15 != var24) {
                                            method1116(arg0, var9, var4, var24, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method1116(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var25 = arg0.field2575;
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
                                            method4739(var25[var26], class91.method4912(16748608) + var9.field3398, var27, var9.field3404, var4, arg0.field2568);
                                        }
                                    }
                                }
                                method4739(class234.field2912, class91.method4912(16748608) + var9.field3398, 1005, var9.field3404, var4, arg0.field2568);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2567) {
            return;
        }
        if (!field836) {
            for (int var28 = 9; var28 >= 5; var28--) {
                String var29 = method3669(arg0, var28);
                if (var29 != null) {
                    method4739(var29, arg0.field2594, 1007, var28 + 1, arg0.field2710, arg0.field2568);
                }
            }
            String var30 = method5486(arg0);
            if (var30 != null) {
                method4739(var30, arg0.field2594, 25, 0, arg0.field2710, arg0.field2568);
            }
            for (int var31 = 4; var31 >= 0; var31--) {
                String var32 = method3669(arg0, var31);
                if (var32 != null) {
                    method1088(var32, arg0.field2594, 57, var31 + 1, arg0.field2710, arg0.field2568, arg0.field2659);
                }
            }
            if (class228.method1757(method1127(arg0))) {
                method4739(class234.field2851, "", 30, 0, arg0.field2710, arg0.field2568);
            }
        } else if (class228.method3374(method1127(arg0)) && (Statics.field337 & 0x20) == 32) {
            method4739(field839, field840 + " " + class91.field1167 + " " + arg0.field2594, 58, 0, arg0.field2710, arg0.field2568);
        }
    }

    @ObfuscatedName("k.jn(ZB)V")
    public static void method20(boolean arg0) {
        field828 = arg0;
    }

    @ObfuscatedName("k.jl(IIIIIIIB)V")
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method1732(arg0)) {
            method3839(Statics.field2694[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ha.jm([Lhe;IIIIIIII)V")
    public static final void method3839(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2587 == arg1 && (!var9.field2567 || var9.field2570 == 0 || var9.field2671 || method1127(var9) != 0 || field855 == var9 || var9.field2572 == 1338)) {
                if (var9.field2567) {
                    if (method321(var9)) {
                        continue;
                    }
                } else if (var9.field2570 == 0 && Statics.field53 != var9 && method321(var9)) {
                    continue;
                }
                int var10 = var9.field2581 + arg6;
                int var11 = var9.field2654 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2570 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2570 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2583 + var10;
                    int var19 = var9.field2643 + var11;
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
                    int var22 = var9.field2583 + var10;
                    int var23 = var9.field2643 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field854 == var9) {
                    field862 = true;
                    field835 = var10;
                    field864 = var11;
                }
                boolean var24 = false;
                if (var9.field2642) {
                    switch(field843) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2568 >>> 16 == field844) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field844 == var9.field2568) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2567 || var12 < var14 && var13 < var15) {
                    if (var9.field2567) {
                        if (var9.field2708) {
                            if (class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15) {
                                for (class72 var25 = (class72) field788.method4559(); var25 != null; var25 = (class72) field788.method4577()) {
                                    if (var25.field602) {
                                        var25.method3355();
                                        var25.field613.field2678 = false;
                                    }
                                }
                                if (Statics.field2023 == 0) {
                                    field854 = null;
                                    field855 = null;
                                }
                                if (!field817) {
                                    method2696();
                                }
                            }
                        } else if (var9.field2709 && class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15) {
                            for (class72 var26 = (class72) field788.method4559(); var26 != null; var26 = (class72) field788.method4577()) {
                                if (var26.field602 && var26.field613.field2599 == var26.field603) {
                                    var26.method3355();
                                }
                            }
                        }
                    }
                    int var27 = class64.field518;
                    int var28 = class64.field519;
                    if (class64.field525 != 0) {
                        var27 = class64.field526;
                        var28 = class64.field521;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2572 == 1337) {
                        if (!field702 && !field817 && var29) {
                            method349(var27, var28, var12, var13);
                        }
                    } else if (var9.field2572 == 1338) {
                        method45(var9, var10, var11);
                    } else {
                        if (var9.field2572 == 1400) {
                            Statics.field122.method5923(class64.field518, class64.field519, var29, var10, var11, var9.field2583, var9.field2643);
                        }
                        if (!field817 && var29) {
                            if (var9.field2572 == 1400) {
                                Statics.field122.method5967(var10, var11, var9.field2583, var9.field2643, var27, var28);
                            } else {
                                method258(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2556.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2556[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2556[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2707 != null) {
                                            var34 = class55.field427[var9.field2556[var30][var33]];
                                        }
                                        if (method2121(var9.field2556[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2707 != null && var9.field2707[var30] > field690) {
                                                break;
                                            }
                                            byte var35 = var9.field2644[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field427[86] && !class55.field427[82] && !class55.field427[81]) && ((var35 & 0x2) == 0 || class55.field427[86]) && ((var35 & 0x1) == 0 || class55.field427[82]) && ((var35 & 0x4) == 0 || class55.field427[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method3365(var30 + 1, var9.field2568, var9.field2710, var9.field2705, "");
                                    } else if (var30 == 10) {
                                        method180();
                                        method682(var9.field2568, var9.field2710, class228.method352(method1127(var9)), var9.field2705);
                                        field839 = method5486(var9);
                                        if (field839 == null) {
                                            field839 = class234.field2765;
                                        }
                                        field840 = var9.field2594 + class91.method4912(16777215);
                                    }
                                    int var36 = var9.field2645[var30];
                                    if (var9.field2707 == null) {
                                        var9.field2707 = new int[var9.field2556.length];
                                    }
                                    if (var9.field2696 == null) {
                                        var9.field2696 = new int[var9.field2556.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2707[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2707[var30] == 0) {
                                        var9.field2707[var30] = field690 + var36 + var9.field2696[var30];
                                    } else {
                                        var9.field2707[var30] = field690 + var36;
                                    }
                                }
                                if (!var31 && var9.field2707 != null) {
                                    var9.field2707[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2567) {
                            boolean var37;
                            if (class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field522 == 1 || !Statics.field2507 && class64.field522 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field525 == 1 || !Statics.field2507 && class64.field525 == 4) && class64.field526 >= var12 && class64.field521 >= var13 && class64.field526 < var14 && class64.field521 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                Statics.method1224(var9, class64.field526 - var10, class64.field521 - var11);
                            }
                            if (var9.field2572 == 1400) {
                                Statics.field122.method5924(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field854 != null && field854 != var9 && var37 && class228.method188(method1127(var9))) {
                                field858 = var9;
                            }
                            if (field855 == var9) {
                                field733 = true;
                                field860 = var10;
                                field882 = var11;
                            }
                            if (var9.field2671) {
                                if (var37 && field879 != 0 && var9.field2599 != null) {
                                    class72 var40 = new class72();
                                    var40.field602 = true;
                                    var40.field613 = var9;
                                    var40.field601 = field879;
                                    var40.field603 = var9.field2599;
                                    field788.method4580(var40);
                                }
                                if (field854 != null || Statics.field3083 != null || field817) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2582 && var39) {
                                    var9.field2582 = true;
                                    if (var9.field2656 != null) {
                                        class72 var41 = new class72();
                                        var41.field602 = true;
                                        var41.field613 = var9;
                                        var41.field604 = class64.field526 - var10;
                                        var41.field601 = class64.field521 - var11;
                                        var41.field603 = var9.field2656;
                                        field788.method4580(var41);
                                    }
                                }
                                if (var9.field2582 && var38 && var9.field2657 != null) {
                                    class72 var42 = new class72();
                                    var42.field602 = true;
                                    var42.field613 = var9;
                                    var42.field604 = class64.field518 - var10;
                                    var42.field601 = class64.field519 - var11;
                                    var42.field603 = var9.field2657;
                                    field788.method4580(var42);
                                }
                                if (var9.field2582 && !var38) {
                                    var9.field2582 = false;
                                    if (var9.field2578 != null) {
                                        class72 var43 = new class72();
                                        var43.field602 = true;
                                        var43.field613 = var9;
                                        var43.field604 = class64.field518 - var10;
                                        var43.field601 = class64.field519 - var11;
                                        var43.field603 = var9.field2578;
                                        field920.method4580(var43);
                                    }
                                }
                                if (var38 && var9.field2669 != null) {
                                    class72 var44 = new class72();
                                    var44.field602 = true;
                                    var44.field613 = var9;
                                    var44.field604 = class64.field518 - var10;
                                    var44.field601 = class64.field519 - var11;
                                    var44.field603 = var9.field2669;
                                    field788.method4580(var44);
                                }
                                if (!var9.field2678 && var37) {
                                    var9.field2678 = true;
                                    if (var9.field2681 != null) {
                                        class72 var45 = new class72();
                                        var45.field602 = true;
                                        var45.field613 = var9;
                                        var45.field604 = class64.field518 - var10;
                                        var45.field601 = class64.field519 - var11;
                                        var45.field603 = var9.field2681;
                                        field788.method4580(var45);
                                    }
                                }
                                if (var9.field2678 && var37 && var9.field2558 != null) {
                                    class72 var46 = new class72();
                                    var46.field602 = true;
                                    var46.field613 = var9;
                                    var46.field604 = class64.field518 - var10;
                                    var46.field601 = class64.field519 - var11;
                                    var46.field603 = var9.field2558;
                                    field788.method4580(var46);
                                }
                                if (var9.field2678 && !var37) {
                                    var9.field2678 = false;
                                    if (var9.field2662 != null) {
                                        class72 var47 = new class72();
                                        var47.field602 = true;
                                        var47.field613 = var9;
                                        var47.field604 = class64.field518 - var10;
                                        var47.field601 = class64.field519 - var11;
                                        var47.field603 = var9.field2662;
                                        field920.method4580(var47);
                                    }
                                }
                                if (var9.field2673 != null) {
                                    class72 var48 = new class72();
                                    var48.field613 = var9;
                                    var48.field603 = var9.field2673;
                                    field728.method4580(var48);
                                }
                                if (var9.field2667 != null && field773 > var9.field2702) {
                                    if (var9.field2668 == null || field773 - var9.field2702 > 32) {
                                        class72 var53 = new class72();
                                        var53.field613 = var9;
                                        var53.field603 = var9.field2667;
                                        field788.method4580(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2702; var49 < field773; var49++) {
                                            int var50 = field867[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2668.length; var51++) {
                                                if (var9.field2668[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field613 = var9;
                                                    var52.field603 = var9.field2667;
                                                    field788.method4580(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2702 = field773;
                                }
                                if (var9.field2633 != null && field870 > var9.field2621) {
                                    if (var9.field2670 == null || field870 - var9.field2621 > 32) {
                                        class72 var58 = new class72();
                                        var58.field613 = var9;
                                        var58.field603 = var9.field2633;
                                        field788.method4580(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2621; var54 < field870; var54++) {
                                            int var55 = field869[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2670.length; var56++) {
                                                if (var9.field2670[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field613 = var9;
                                                    var57.field603 = var9.field2633;
                                                    field788.method4580(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2621 = field870;
                                }
                                if (var9.field2634 != null && field793 > var9.field2589) {
                                    if (var9.field2569 == null || field793 - var9.field2589 > 32) {
                                        class72 var63 = new class72();
                                        var63.field613 = var9;
                                        var63.field603 = var9.field2634;
                                        field788.method4580(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2589; var59 < field793; var59++) {
                                            int var60 = field871[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2569.length; var61++) {
                                                if (var9.field2569[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field613 = var9;
                                                    var62.field603 = var9.field2634;
                                                    field788.method4580(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2589 = field793;
                                }
                                if (field904 > var9.field2701 && var9.field2676 != null) {
                                    class72 var64 = new class72();
                                    var64.field613 = var9;
                                    var64.field603 = var9.field2676;
                                    field788.method4580(var64);
                                }
                                if (field874 > var9.field2701 && var9.field2592 != null) {
                                    class72 var65 = new class72();
                                    var65.field613 = var9;
                                    var65.field603 = var9.field2592;
                                    field788.method4580(var65);
                                }
                                if (field875 > var9.field2701 && var9.field2679 != null) {
                                    class72 var66 = new class72();
                                    var66.field613 = var9;
                                    var66.field603 = var9.field2679;
                                    field788.method4580(var66);
                                }
                                if (field775 > var9.field2701 && var9.field2554 != null) {
                                    class72 var67 = new class72();
                                    var67.field613 = var9;
                                    var67.field603 = var9.field2554;
                                    field788.method4580(var67);
                                }
                                if (field727 > var9.field2701 && var9.field2692 != null) {
                                    class72 var68 = new class72();
                                    var68.field613 = var9;
                                    var68.field603 = var9.field2692;
                                    field788.method4580(var68);
                                }
                                if (field878 > var9.field2701 && var9.field2680 != null) {
                                    class72 var69 = new class72();
                                    var69.field613 = var9;
                                    var69.field603 = var9.field2680;
                                    field788.method4580(var69);
                                }
                                var9.field2701 = field866;
                                if (var9.field2677 != null) {
                                    for (int var70 = 0; var70 < field902; var70++) {
                                        class72 var71 = new class72();
                                        var71.field613 = var9;
                                        var71.field610 = field873[var70];
                                        var71.field609 = field903[var70];
                                        var71.field603 = var9.field2677;
                                        field788.method4580(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2567) {
                            if (field854 != null || Statics.field3083 != null || field817) {
                                continue;
                            }
                            if ((var9.field2689 >= 0 || var9.field2706 != 0) && class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15) {
                                if (var9.field2689 >= 0) {
                                    Statics.field53 = arg0[var9.field2689];
                                } else {
                                    Statics.field53 = var9;
                                }
                            }
                            if (var9.field2570 == 8 && class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15) {
                                Statics.field2369 = var9;
                            }
                            if (var9.field2598 > var9.field2643) {
                                method2828(var9, var9.field2583 + var10, var11, var9.field2643, var9.field2598, class64.field518, class64.field519);
                            }
                        }
                        if (var9.field2570 == 0) {
                            method3839(arg0, var9.field2568, var12, var13, var14, var15, var10 - var9.field2647, var11 - var9.field2590);
                            if (var9.field2698 != null) {
                                method3839(var9.field2698, var9.field2568, var12, var13, var14, var15, var10 - var9.field2647, var11 - var9.field2590);
                            }
                            class71 var72 = (class71) field842.method5561((long) var9.field2568);
                            if (var72 != null) {
                                if (var72.field594 == 0 && class64.field518 >= var12 && class64.field519 >= var13 && class64.field518 < var14 && class64.field519 < var15 && !field817) {
                                    for (class72 var73 = (class72) field788.method4559(); var73 != null; var73 = (class72) field788.method4577()) {
                                        if (var73.field602) {
                                            var73.method3355();
                                            var73.field613.field2678 = false;
                                        }
                                    }
                                    if (Statics.field2023 == 0) {
                                        field854 = null;
                                        field855 = null;
                                    }
                                    if (!field817) {
                                        method2696();
                                    }
                                }
                                method21(var72.field600, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.jh(II)Z")
    public static boolean method2121(int arg0) {
        for (int var1 = 0; var1 < field902; var1++) {
            if (field873[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gk.jk(IIB)V")
    public static final void method3412(int arg0, int arg1) {
        if (class227.method1732(arg0)) {
            method1095(Statics.field2694[arg0], arg1);
        }
    }

    @ObfuscatedName("bx.jg([Lhe;IB)V")
    public static final void method1095(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2570 == 0) {
                    if (var3.field2698 != null) {
                        method1095(var3.field2698, arg1);
                    }
                    class71 var4 = (class71) field842.method5561((long) var3.field2568);
                    if (var4 != null) {
                        method3412(var4.field600, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2700 != null) {
                    class72 var5 = new class72();
                    var5.field613 = var3;
                    var5.field603 = var3.field2700;
                    class86.method1239(var5);
                }
                if (arg1 == 1 && var3.field2682 != null) {
                    if (var3.field2710 >= 0) {
                        class227 var6 = class227.method3572(var3.field2568);
                        if (var6 == null || var6.field2698 == null || var3.field2710 >= var6.field2698.length || var6.field2698[var3.field2710] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field613 = var3;
                    var7.field603 = var3.field2682;
                    class86.method1239(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.jz(S)V")
    public final void method1258() {
        method1117(field854);
        Statics.field2023++;
        if (field862 && field733) {
            int var1 = class64.field518;
            int var2 = class64.field519;
            int var3 = var1 - field856;
            int var4 = var2 - field929;
            if (var3 < field860) {
                var3 = field860;
            }
            if (field854.field2583 + var3 > field860 + field855.field2583) {
                var3 = field860 + field855.field2583 - field854.field2583;
            }
            if (var4 < field882) {
                var4 = field882;
            }
            if (field854.field2643 + var4 > field882 + field855.field2643) {
                var4 = field882 + field855.field2643 - field854.field2643;
            }
            int var5 = var3 - field835;
            int var6 = var4 - field864;
            int var7 = field854.field2650;
            if (Statics.field2023 > field854.field2640 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field865 = true;
            }
            int var8 = field855.field2647 + (var3 - field860);
            int var9 = field855.field2590 + (var4 - field882);
            if (field854.field2663 != null && field865) {
                class72 var10 = new class72();
                var10.field613 = field854;
                var10.field604 = var8;
                var10.field601 = var9;
                var10.field603 = field854.field2663;
                class86.method1239(var10);
            }
            if (class64.field522 == 0) {
                if (field865) {
                    if (field854.field2664 != null) {
                        class72 var11 = new class72();
                        var11.field613 = field854;
                        var11.field604 = var8;
                        var11.field601 = var9;
                        var11.field607 = field858;
                        var11.field603 = field854.field2664;
                        class86.method1239(var11);
                    }
                    if (field858 != null && method151(field854) != null) {
                        class197 var12 = class197.method3105(class193.field2235, field762.field1341);
                        var12.field2339.method5180(field858.field2568);
                        var12.field2339.method5173(field858.field2710);
                        var12.field2339.method5181(field854.field2568);
                        var12.field2339.method5172(field858.field2705);
                        var12.field2339.method5172(field854.field2710);
                        var12.field2339.method5172(field854.field2705);
                        field762.method2171(var12);
                    }
                } else if (this.method1623()) {
                    this.method1529(field856 + field835, field929 + field864);
                } else if (field694 > 0) {
                    int var13 = field856 + field835;
                    int var14 = field929 + field864;
                    class92 var15 = Statics.field339;
                    method3664(var15.field1177, var15.field1173, var15.field1174, var15.field1175, var15.field1176, var15.field1176, var13, var14);
                    Statics.field339 = null;
                }
                field854 = null;
            }
        } else if (Statics.field2023 > 1) {
            field854 = null;
        }
    }

    @ObfuscatedName("bs.jo(Lhe;I)V")
    public static void method1117(class227 arg0) {
        if (field885 == arg0.field2604) {
            field680[arg0.field2703] = true;
        }
    }

    @ObfuscatedName("be.ja(B)V")
    public static void method810() {
        for (class71 var0 = (class71) field842.method5546(); var0 != null; var0 = (class71) field842.method5554()) {
            int var1 = var0.field600;
            if (class227.method1732(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field2694[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2567;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2117;
                    class227 var6 = class227.method3572(var5);
                    if (var6 != null) {
                        method1117(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ib.jp(Lhe;B)Lhe;")
    public static class227 method4146(class227 arg0) {
        class227 var1 = method151(arg0);
        if (var1 == null) {
            var1 = arg0.field2649;
        }
        return var1;
    }

    @ObfuscatedName("w.jy(II)V")
    public static final void method51(int arg0) {
        if (!class227.method1732(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2694[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2588 = 0;
                var3.field2697 = 0;
            }
        }
    }

    @ObfuscatedName("fz.jf([Lhe;II)V")
    public static final void method3251(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2587 == arg1 && (!var3.field2567 || !method321(var3))) {
                if (var3.field2570 == 0) {
                    if (!var3.field2567 && method321(var3) && Statics.field53 != var3) {
                        continue;
                    }
                    method3251(arg0, var3.field2568);
                    if (var3.field2698 != null) {
                        method3251(var3.field2698, var3.field2568);
                    }
                    class71 var4 = (class71) field842.method5561((long) var3.field2568);
                    if (var4 != null) {
                        int var5 = var4.field600;
                        if (class227.method1732(var5)) {
                            method3251(Statics.field2694[var5], -1);
                        }
                    }
                }
                if (var3.field2570 == 6) {
                    if (var3.field2615 != -1 || var3.field2616 != -1) {
                        boolean var6 = method220(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2616;
                        } else {
                            var7 = var3.field2615;
                        }
                        if (var7 != -1) {
                            class269 var8 = class269.method4110(var7);
                            var3.field2697 += field742;
                            while (var3.field2697 > var8.field3515[var3.field2588]) {
                                var3.field2697 -= var8.field3515[var3.field2588];
                                var3.field2588++;
                                if (var3.field2588 >= var8.field3514.length) {
                                    var3.field2588 -= var8.field3517;
                                    if (var3.field2588 < 0 || var3.field2588 >= var8.field3514.length) {
                                        var3.field2588 = 0;
                                    }
                                }
                                method1117(var3);
                            }
                        }
                    }
                    if (var3.field2624 != 0 && !var3.field2567) {
                        int var9 = var3.field2624 >> 16;
                        int var10 = var3.field2624 << 16 >> 16;
                        int var11 = field742 * var9;
                        int var12 = field742 * var10;
                        var3.field2619 = var3.field2619 + var11 & 0x7FF;
                        var3.field2620 = var3.field2620 + var12 & 0x7FF;
                        method1117(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.jr(IB)V")
    public static final void method223(int arg0) {
        method810();
        for (class85 var1 = (class85) class85.field1098.method4559(); var1 != null; var1 = (class85) class85.field1098.method4577()) {
            if (var1.field1110 != null) {
                var1.method1839();
            }
        }
        int var2 = class251.method3836(arg0).field3208;
        if (var2 == 0) {
            return;
        }
        int var3 = class222.field2527[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class140.method2837(0.9D);
                ((class129) Statics.field1782).method2589(0.9D);
            }
            if (var3 == 2) {
                class140.method2837(0.8D);
                ((class129) Statics.field1782).method2589(0.8D);
            }
            if (var3 == 3) {
                class140.method2837(0.7D);
                ((class129) Statics.field1782).method2589(0.7D);
            }
            if (var3 == 4) {
                class140.method2837(0.6D);
                ((class129) Statics.field1782).method2589(0.6D);
            }
            class265.field3417.method3141();
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
            if (field914 != var4) {
                if (field914 == 0 && field915 != -1) {
                    class207.method1165(Statics.field329, field915, 0, var4, false);
                    field916 = false;
                } else if (var4 == 0) {
                    class207.method1323();
                    field916 = false;
                } else {
                    class207.method3690(var4);
                }
                field914 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field917 = 127;
            }
            if (var3 == 1) {
                field917 = 96;
            }
            if (var3 == 2) {
                field917 = 64;
            }
            if (var3 == 3) {
                field917 = 32;
            }
            if (var3 == 4) {
                field917 = 0;
            }
        }
        if (var2 == 5) {
            field816 = var3;
        }
        if (var2 == 6) {
            field845 = var3;
        }
        if (var2 == 9) {
            field846 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field759 = 127;
            }
            if (var3 == 1) {
                field759 = 96;
            }
            if (var3 == 2) {
                field759 = 64;
            }
            if (var3 == 3) {
                field759 = 32;
            }
            if (var3 == 4) {
                field759 = 0;
            }
        }
        if (var2 == 17) {
            field841 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field706 = (class94) class205.method129(class94.method571(), var3);
            if (field706 == null) {
                field706 = class94.field1189;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field808 = -1;
            } else {
                field808 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field707 = (class94) class205.method129(class94.method571(), var3);
            if (field707 == null) {
                field707 = class94.field1189;
            }
        }
    }

    @ObfuscatedName("fc.jt(Lhe;I)V")
    public static final void method3223(class227 arg0) {
        int var1 = arg0.field2572;
        if (var1 == 324) {
            if (field946 == -1) {
                field946 = arg0.field2603;
                field947 = arg0.field2579;
            }
            if (field945.field2543) {
                arg0.field2603 = field946;
            } else {
                arg0.field2603 = field947;
            }
        } else if (var1 == 325) {
            if (field946 == -1) {
                field946 = arg0.field2603;
                field947 = arg0.field2579;
            }
            if (field945.field2543) {
                arg0.field2603 = field947;
            } else {
                arg0.field2603 = field946;
            }
        } else if (var1 == 327) {
            arg0.field2619 = 150;
            arg0.field2620 = (int) (Math.sin((double) field690 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2611 = 5;
            arg0.field2612 = 0;
        } else if (var1 == 328) {
            arg0.field2619 = 150;
            arg0.field2620 = (int) (Math.sin((double) field690 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2611 = 5;
            arg0.field2612 = 1;
        }
    }

    @ObfuscatedName("hn.jd(I)V")
    public static final void method3817() {
        class197 var0 = class197.method3105(class193.field2246, field762.field1341);
        field762.method2171(var0);
        for (class71 var1 = (class71) field842.method5546(); var1 != null; var1 = (class71) field842.method5554()) {
            if (var1.field594 == 0 || var1.field594 == 3) {
                method581(var1, true);
            }
        }
        if (field883 != null) {
            method1117(field883);
            field883 = null;
        }
    }

    @ObfuscatedName("ab.js(IIII)Lbm;")
    public static final class71 method346(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field600 = arg1;
        var3.field594 = arg2;
        field842.method5548(var3, (long) arg0);
        method51(arg1);
        class227 var4 = class227.method3572(arg0);
        method1117(var4);
        if (field883 != null) {
            method1117(field883);
            field883 = null;
        }
        method2150();
        method1005(Statics.field2694[arg0 >> 16], var4, false);
        class86.method315(arg1);
        if (field925 != -1) {
            method3412(field925, 1);
        }
        return var3;
    }

    @ObfuscatedName("ak.jb(Lbm;ZI)V")
    public static final void method581(class71 arg0, boolean arg1) {
        int var2 = arg0.field600;
        int var3 = (int) arg0.field2117;
        arg0.method3355();
        if (arg1) {
            class227.method4222(var2);
        }
        method1756(var2);
        class227 var4 = class227.method3572(var3);
        if (var4 != null) {
            method1117(var4);
        }
        method2150();
        if (field925 != -1) {
            method3412(field925, 1);
        }
    }

    @ObfuscatedName("ap.kw(Lhe;B)Z")
    public static final boolean method310(class227 arg0) {
        int var1 = arg0.field2572;
        if (var1 == 205) {
            field803 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field945.method3721(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field945.method3722(var4, var5 == 1);
        }
        if (var1 == 324) {
            field945.method3723(false);
        }
        if (var1 == 325) {
            field945.method3723(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method3105(class193.field2240, field762.field1341);
            field945.method3724(var6.field2339);
            field762.method2171(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bz.km(Lhe;IIII)V")
    public static final void method1100(class227 arg0, int arg1, int arg2, int arg3) {
        method2152();
        class221 var4 = arg0.method3772(false);
        if (var4 == null) {
            return;
        }
        class331.method5599(arg1, arg2, var4.field2519 + arg1, var4.field2518 + arg2);
        if (field913 == 2 || field913 == 5) {
            class331.method5655(arg1, arg2, 0, var4.field2517, var4.field2520);
        } else {
            int var5 = field910 & 0x7FF;
            int var6 = Statics.field3718.field984 / 32 + 48;
            int var7 = 464 - Statics.field3718.field974 / 32;
            Statics.field3791.method5748(arg1, arg2, var4.field2519, var4.field2518, var6, var7, var5, 256, var4.field2517, var4.field2520);
            for (int var8 = 0; var8 < field907; var8++) {
                int var9 = field908[var8] * 4 + 2 - Statics.field3718.field984 / 32;
                int var10 = field868[var8] * 4 + 2 - Statics.field3718.field974 / 32;
                method1132(arg1, arg2, var9, var10, field886[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class272 var13 = field809[Statics.field611][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3718.field984 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3718.field974 / 32;
                        method1132(arg1, arg2, var14, var15, Statics.field3206[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field723; var16++) {
                class89 var17 = field722[field724[var16]];
                if (var17 != null && var17.method1179()) {
                    class267 var18 = var17.field1149;
                    if (var18 != null && var18.field3491 != null) {
                        var18 = var18.method4394();
                    }
                    if (var18 != null && var18.field3482 && var18.field3494) {
                        int var19 = var17.field984 / 32 - Statics.field3718.field984 / 32;
                        int var20 = var17.field974 / 32 - Statics.field3718.field974 / 32;
                        method1132(arg1, arg2, var19, var20, Statics.field3206[1], var4);
                    }
                }
            }
            int var21 = class99.field1279;
            int[] var22 = class99.field1272;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field791[var22[var23]];
                if (var24 != null && var24.method1179() && !var24.field652 && Statics.field3718 != var24) {
                    int var25 = var24.field984 / 32 - Statics.field3718.field984 / 32;
                    int var26 = var24.field974 / 32 - Statics.field3718.field974 / 32;
                    boolean var27 = false;
                    if (Statics.field3718.field645 != 0 && var24.field645 != 0 && Statics.field3718.field645 == var24.field645) {
                        var27 = true;
                    }
                    if (var24.method1195()) {
                        method1132(arg1, arg2, var25, var26, Statics.field3206[3], var4);
                    } else if (var27) {
                        method1132(arg1, arg2, var25, var26, Statics.field3206[4], var4);
                    } else if (var24.method1178()) {
                        method1132(arg1, arg2, var25, var26, Statics.field3206[5], var4);
                    } else {
                        method1132(arg1, arg2, var25, var26, Statics.field3206[2], var4);
                    }
                }
            }
            if (field890 != 0 && field690 % 20 < 10) {
                if (field890 == 1 && field699 >= 0 && field699 < field722.length) {
                    class89 var28 = field722[field699];
                    if (var28 != null) {
                        int var29 = var28.field984 / 32 - Statics.field3718.field984 / 32;
                        int var30 = var28.field974 / 32 - Statics.field3718.field974 / 32;
                        method14(arg1, arg2, var29, var30, Statics.field374[1], var4);
                    }
                }
                if (field890 == 2) {
                    int var31 = field701 * 4 - Statics.field591 * 4 + 2 - Statics.field3718.field984 / 32;
                    int var32 = field764 * 4 - Statics.field1153 * 4 + 2 - Statics.field3718.field974 / 32;
                    method14(arg1, arg2, var31, var32, Statics.field374[1], var4);
                }
                if (field890 == 10 && field801 >= 0 && field801 < field791.length) {
                    class76 var33 = field791[field801];
                    if (var33 != null) {
                        int var34 = var33.field984 / 32 - Statics.field3718.field984 / 32;
                        int var35 = var33.field974 / 32 - Statics.field3718.field974 / 32;
                        method14(arg1, arg2, var34, var35, Statics.field374[1], var4);
                    }
                }
            }
            if (field911 != 0) {
                int var36 = field911 * 4 + 2 - Statics.field3718.field984 / 32;
                int var37 = field912 * 4 + 2 - Statics.field3718.field974 / 32;
                method1132(arg1, arg2, var36, var37, Statics.field374[0], var4);
            }
            if (!Statics.field3718.field652) {
                class331.method5606(var4.field2519 / 2 + arg1 - 1, var4.field2518 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field887[arg3] = true;
    }

    @ObfuscatedName("lt.ke(Lhe;IIIB)V")
    public static final void method5425(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3772(false);
        if (var4 == null) {
            return;
        }
        if (field913 < 3) {
            Statics.field1326.method5748(arg1, arg2, var4.field2519, var4.field2518, 25, 25, field910, 256, var4.field2517, var4.field2520);
        } else {
            class331.method5655(arg1, arg2, 0, var4.field2517, var4.field2520);
        }
    }

    @ObfuscatedName("m.kt(IIIILla;Lhg;B)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1132(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field910 & 0x7FF;
        int var8 = class140.field1795[var7];
        int var9 = class140.field1796[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2519 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field111.method5749(arg5.field2519 / 2 + arg0 - var17 / 2 + var15, arg5.field2518 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bb.kv(IIIILla;Lhg;B)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, class335 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field910 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1795[var6];
        int var9 = class140.field1796[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5747(arg5.field2519 / 2 + var10 - arg4.field3894 / 2, arg5.field2518 / 2 - var11 - arg4.field3891 / 2, arg0, arg1, arg5.field2519, arg5.field2518, arg5.field2517, arg5.field2520);
        } else {
            arg4.method5731(arg5.field2519 / 2 + arg0 + var10 - arg4.field3894 / 2, arg5.field2518 / 2 + arg1 - var11 - arg4.field3891 / 2);
        }
    }

    @ObfuscatedName("ig.kr(B)V")
    public static final void method3853() {
        for (int var0 = 0; var0 < class99.field1279; var0++) {
            class76 var1 = field791[class99.field1272[var0]];
            var1.method1176();
        }
        Iterator var2 = class101.field1292.iterator();
        while (var2.hasNext()) {
            class74 var3 = (class74) var2.next();
            var3.method1155();
        }
        if (Statics.field597 != null) {
            Statics.field597.method4878();
        }
    }

    @ObfuscatedName("ka.ku(I)V")
    public static final void method4957() {
        Iterator var0 = class101.field1292.iterator();
        while (var0.hasNext()) {
            class74 var1 = (class74) var0.next();
            var1.method1143();
        }
        if (Statics.field597 != null) {
            Statics.field597.method4883();
        }
    }

    @ObfuscatedName("ao.ky(B)V")
    public static final void method465() {
        for (int var0 = 0; var0 < class99.field1279; var0++) {
            class76 var1 = field791[class99.field1272[var0]];
            var1.method1219();
        }
    }

    @ObfuscatedName("fb.ko(B)V")
    public static final void method3283() {
        field874 = field866;
    }

    @ObfuscatedName("y.ki(I)V")
    public static final void method233() {
        field875 = field866;
        Statics.field3583 = true;
    }

    @ObfuscatedName("hk.kk(Ljava/lang/String;I)V")
    public static final void method3720(String arg0) {
        if (Statics.field597 != null) {
            class197 var1 = class197.method3105(class193.field2218, field762.field1341);
            var1.field2339.method5121(class310.method3851(arg0));
            var1.field2339.method5217(arg0);
            field762.method2171(var1);
        }
    }

    @ObfuscatedName("i.kn(Ljava/lang/String;I)V")
    public static final void method126(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method3105(class193.field2237, field762.field1341);
            var1.field2339.method5121(class310.method3851(arg0));
            var1.field2339.method5217(arg0);
            field762.method2171(var1);
        }
    }

    @ObfuscatedName("al.kq(I)V")
    public static final void method364() {
        class197 var0 = class197.method3105(class193.field2237, field762.field1341);
        var0.field2339.method5121(0);
        field762.method2171(var0);
    }

    @ObfuscatedName("cr.ks(II)V")
    public static void method1756(int arg0) {
        for (class189 var1 = (class189) field751.method5546(); var1 != null; var1 = (class189) field751.method5554()) {
            if ((var1.field2117 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3355();
            }
        }
    }

    @ObfuscatedName("bb.kc(Lhe;I)I")
    public static int method1127(class227 arg0) {
        class189 var1 = (class189) field751.method5561(((long) arg0.field2568 << 32) + (long) arg0.field2710);
        return var1 == null ? arg0.field2613 : var1.field2115;
    }

    @ObfuscatedName("a.ka(Lhe;B)Lhe;")
    public static class227 method151(class227 arg0) {
        int var1 = class228.method802(method1127(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class227.method3572(arg0.field2587);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ab.kf(Lhe;I)Z")
    public static boolean method321(class227 arg0) {
        return arg0.field2630;
    }

    @ObfuscatedName("hw.kg(Lhe;II)Ljava/lang/String;")
    public static String method3669(class227 arg0, int arg1) {
        int var2 = method1127(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2674 == null) {
            return null;
        } else if (arg0.field2648 == null || arg0.field2648.length <= arg1 || arg0.field2648[arg1] == null || arg0.field2648[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2648[arg1];
        }
    }

    @ObfuscatedName("lg.kx(Lhe;B)Ljava/lang/String;")
    public static String method5486(class227 arg0) {
        if (class228.method352(method1127(arg0)) == 0) {
            return null;
        } else if (arg0.field2653 == null || arg0.field2653.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2653;
        }
    }

    @ObfuscatedName("ak.kh(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method582(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field683 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field683 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field683 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field683 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field683 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field138 != null) {
            var3 = "/p=" + Statics.field138;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3598 + "/a=" + Statics.field3272 + var3 + "/";
    }

    @ObfuscatedName("bj.kp(Ljava/lang/String;I)V")
    public static void method1172(String arg0) {
        Statics.field138 = arg0;
        try {
            String var1 = Statics.field319.getParameter(Integer.toString(18));
            String var2 = Statics.field319.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = Statics.method3668() + 94608000000L;
                class217.field2504.setTime(new Date(var6));
                int var8 = class217.field2504.get(7);
                int var9 = class217.field2504.get(5);
                int var10 = class217.field2504.get(2);
                int var11 = class217.field2504.get(1);
                int var12 = class217.field2504.get(11);
                int var13 = class217.field2504.get(12);
                int var14 = class217.field2504.get(13);
                String var15 = class217.field2503[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class217.field2505[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field319;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("bp.kz(Ljava/lang/String;ZB)V")
    public static void method1120(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3908; var5++) {
            class265 var6 = class265.method337(var5);
            if ((!arg1 || var6.field3447) && var6.field3441 == -1 && var6.field3398.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1552 = -1;
                    Statics.field387 = null;
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
        Statics.field387 = var3;
        Statics.field336 = 0;
        Statics.field1552 = var4;
        String[] var9 = new String[Statics.field1552];
        for (int var10 = 0; var10 < Statics.field1552; var10++) {
            var9[var10] = class265.method337(var3[var10]).field3398;
        }
        class199.method3850(var9, Statics.field387);
    }

    @ObfuscatedName("cu.kj([BII)V")
    public static void method1931(byte[] arg0, int arg1) {
        if (field721 == null) {
            field721 = new byte[24];
        }
        class311.method5375(arg0, arg1, field721, 0, 24);
    }

    @ObfuscatedName("ed.kb(Lkb;II)V")
    public static void method3098(class310 arg0, int arg1) {
        method1931(arg0.field3710, arg1);
        class177.method438(arg0, arg1);
    }

    @ObfuscatedName("client.kd(I)Lku;")
    public class293 method1375() {
        return Statics.field3718 == null ? null : Statics.field3718.field653;
    }

    @ObfuscatedName("er.lk(I)Z")
    public static boolean method3107() {
        return field850 >= 2;
    }

    @ObfuscatedName("c.lb(IB)V")
    public static void method226(int arg0) {
        field755 = arg0;
    }

    @ObfuscatedName("d.lt(S)V")
    public static void method33() {
        if (field755 == 1) {
            field771 = true;
        }
    }

    @ObfuscatedName("em.lc(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3114(String arg0) {
        class239[] var1 = class239.method1122();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field3089 != -1 && arg0.startsWith(class91.method15(var3.field3089))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3089).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cy.lo(I)V")
    public static void method1982() {
        if (Statics.field223 == null) {
            return;
        }
        field892 = field690;
        Statics.field223.method4018();
        for (int var0 = 0; var0 < field791.length; var0++) {
            if (field791[var0] != null) {
                Statics.field223.method4017((field791[var0].field984 >> 7) + Statics.field591, (field791[var0].field974 >> 7) + Statics.field1153);
            }
        }
    }
}

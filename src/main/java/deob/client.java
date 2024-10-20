package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class53 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field687 = new class173[4];

    @ObfuscatedName("client.ab")
    public static boolean field896 = true;

    @ObfuscatedName("client.bj")
    public static int field829 = 1;

    @ObfuscatedName("client.bg")
    public static int field632 = 0;

    @ObfuscatedName("client.bk")
    public static int field631 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field634 = false;

    @ObfuscatedName("client.bc")
    public static boolean field846 = false;

    @ObfuscatedName("client.bs")
    public static int field737 = -1;

    @ObfuscatedName("client.ba")
    public static boolean field801 = false;

    @ObfuscatedName("client.bn")
    public static int field645 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field640 = true;

    @ObfuscatedName("client.cs")
    public static int field641 = 0;

    @ObfuscatedName("client.ch")
    public static long field642 = 1L;

    @ObfuscatedName("client.cn")
    public static int field643 = -1;

    @ObfuscatedName("client.cx")
    public static int field682 = -1;

    @ObfuscatedName("client.ck")
    public static long field729 = -1L;

    @ObfuscatedName("client.ce")
    public static boolean field646 = true;

    @ObfuscatedName("client.cu")
    public static boolean field647 = false;

    @ObfuscatedName("client.cg")
    public static int field844 = 0;

    @ObfuscatedName("client.ct")
    public static int field637 = 0;

    @ObfuscatedName("client.cr")
    public static int field822 = 0;

    @ObfuscatedName("client.cy")
    public static int field651 = 0;

    @ObfuscatedName("client.cz")
    public static int field652 = 0;

    @ObfuscatedName("client.cm")
    public static int field653 = 0;

    @ObfuscatedName("client.cl")
    public static int field654 = 0;

    @ObfuscatedName("client.ci")
    public static int field655 = 0;

    @ObfuscatedName("client.cc")
    public static int field656 = 0;

    @ObfuscatedName("client.cw")
    public static class85 field657 = class85.field1147;

    @ObfuscatedName("client.do")
    public static class85 field658 = class85.field1147;

    @ObfuscatedName("client.dx")
    public static int field659 = 0;

    @ObfuscatedName("client.di")
    public static int field660 = 0;

    @ObfuscatedName("client.dr")
    public static int field661 = 0;

    @ObfuscatedName("client.ek")
    public static int field662 = 0;

    @ObfuscatedName("client.ew")
    public static int field663 = 0;

    @ObfuscatedName("client.ep")
    public static int field664 = 0;

    @ObfuscatedName("client.er")
    public static int field741 = 0;

    @ObfuscatedName("client.es")
    public static int field666 = 0;

    @ObfuscatedName("client.eq")
    public static class161 field744 = class161.field1986;

    @ObfuscatedName("client.eg")
    public static boolean field773 = false;

    @ObfuscatedName("client.ec")
    public static class89 field870 = new class89();

    @ObfuscatedName("client.ea")
    public static byte[] field670 = null;

    @ObfuscatedName("client.eb")
    public static class80[] field762 = new class80[32768];

    @ObfuscatedName("client.em")
    public static int field672 = 0;

    @ObfuscatedName("client.fd")
    public static int[] field905 = new int[32768];

    @ObfuscatedName("client.ff")
    public static int field674 = 0;

    @ObfuscatedName("client.fe")
    public static int[] field721 = new int[250];

    @ObfuscatedName("client.fo")
    public static final class96 field668 = new class96();

    @ObfuscatedName("client.fn")
    public static int field733 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field678 = false;

    @ObfuscatedName("client.fu")
    public static boolean field728 = true;

    @ObfuscatedName("client.fl")
    public static class272 field680 = new class272();

    @ObfuscatedName("client.fp")
    public static HashMap field681 = new HashMap();

    @ObfuscatedName("client.fi")
    public static int field825 = 0;

    @ObfuscatedName("client.fj")
    public static int field860 = 1;

    @ObfuscatedName("client.fz")
    public static int field684 = 0;

    @ObfuscatedName("client.gw")
    public static int field685 = 1;

    @ObfuscatedName("client.ga")
    public static int field735 = 0;

    @ObfuscatedName("client.gd")
    public static boolean field688 = false;

    @ObfuscatedName("client.gb")
    public static int[][][] field689 = new int[4][13][13];

    @ObfuscatedName("client.gi")
    public static final int[] field690 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gt")
    public static int field691 = 0;

    @ObfuscatedName("client.he")
    public static int field692 = 2301979;

    @ObfuscatedName("client.hd")
    public static int field693 = 5063219;

    @ObfuscatedName("client.hj")
    public static int field694 = 3353893;

    @ObfuscatedName("client.hy")
    public static int field695 = 7759444;

    @ObfuscatedName("client.hu")
    public static boolean field696 = false;

    @ObfuscatedName("client.ht")
    public static int field697 = 0;

    @ObfuscatedName("client.hv")
    public static int field698 = 128;

    @ObfuscatedName("client.hc")
    public static int field699 = 0;

    @ObfuscatedName("client.hw")
    public static int field869 = 0;

    @ObfuscatedName("client.hm")
    public static int field701 = 0;

    @ObfuscatedName("client.hf")
    public static int field848 = 0;

    @ObfuscatedName("client.hl")
    public static int field703 = 0;

    @ObfuscatedName("client.hk")
    public static int field704 = 0;

    @ObfuscatedName("client.hp")
    public static int field705 = 50;

    @ObfuscatedName("client.ho")
    public static int field706 = 0;

    @ObfuscatedName("client.hz")
    public static int field707 = 0;

    @ObfuscatedName("client.ih")
    public static int field633 = 0;

    @ObfuscatedName("client.ie")
    public static int field709 = 12;

    @ObfuscatedName("client.ic")
    public static int field710 = 6;

    @ObfuscatedName("client.ia")
    public static int field711 = 0;

    @ObfuscatedName("client.ip")
    public static boolean field752 = false;

    @ObfuscatedName("client.im")
    public static int field713 = 0;

    @ObfuscatedName("client.it")
    public static String field783 = null;

    @ObfuscatedName("client.ir")
    public static boolean field714 = false;

    @ObfuscatedName("client.il")
    public static int field715 = 0;

    @ObfuscatedName("client.iy")
    public static int field648 = 0;

    @ObfuscatedName("client.io")
    public static int field717 = 50;

    @ObfuscatedName("client.iu")
    public static int[] field718 = new int[field717];

    @ObfuscatedName("client.iq")
    public static int[] field719 = new int[field717];

    @ObfuscatedName("client.ij")
    public static int[] field720 = new int[field717];

    @ObfuscatedName("client.is")
    public static int[] field770 = new int[field717];

    @ObfuscatedName("client.ik")
    public static int[] field722 = new int[field717];

    @ObfuscatedName("client.id")
    public static int[] field723 = new int[field717];

    @ObfuscatedName("client.ig")
    public static int[] field724 = new int[field717];

    @ObfuscatedName("client.ii")
    public static String[] field677 = new String[field717];

    @ObfuscatedName("client.iw")
    public static int[][] field899 = new int[104][104];

    @ObfuscatedName("client.ib")
    public static int field727 = 0;

    @ObfuscatedName("client.iv")
    public static int field669 = -1;

    @ObfuscatedName("client.in")
    public static int field764 = -1;

    @ObfuscatedName("client.jl")
    public static int field730 = 0;

    @ObfuscatedName("client.js")
    public static int field738 = 0;

    @ObfuscatedName("client.jw")
    public static int field732 = 0;

    @ObfuscatedName("client.jo")
    public static int field830 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field734 = true;

    @ObfuscatedName("client.jn")
    public static int field765 = 0;

    @ObfuscatedName("client.jh")
    public static int field736 = 0;

    @ObfuscatedName("client.jk")
    public static int field886 = 0;

    @ObfuscatedName("client.jx")
    public static int field864 = 0;

    @ObfuscatedName("client.jd")
    public static int field739 = 0;

    @ObfuscatedName("client.jy")
    public static int field740 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field769 = false;

    @ObfuscatedName("client.ju")
    public static int field742 = 0;

    @ObfuscatedName("client.jb")
    public static int field679 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field862 = true;

    @ObfuscatedName("client.jf")
    public static class67[] field745 = new class67[2048];

    @ObfuscatedName("client.jc")
    public static int field676 = -1;

    @ObfuscatedName("client.jq")
    public static int field747 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field748 = true;

    @ObfuscatedName("client.kf")
    public static int field749 = 0;

    @ObfuscatedName("client.kk")
    public static int field816 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field746 = new int[1000];

    @ObfuscatedName("client.kn")
    public static final int[] field823 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ka")
    public static String[] field766 = new String[8];

    @ObfuscatedName("client.km")
    public static boolean[] field644 = new boolean[8];

    @ObfuscatedName("client.ks")
    public static int[] field755 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kl")
    public static int field756 = -1;

    @ObfuscatedName("client.kq")
    public static class262[][][] field817 = new class262[4][104][104];

    @ObfuscatedName("client.kh")
    public static class262 field758 = new class262();

    @ObfuscatedName("client.kj")
    public static class262 field759 = new class262();

    @ObfuscatedName("client.kv")
    public static class262 field760 = new class262();

    @ObfuscatedName("client.kp")
    public static int[] field671 = new int[25];

    @ObfuscatedName("client.ky")
    public static int[] field788 = new int[25];

    @ObfuscatedName("client.kw")
    public static int[] field763 = new int[25];

    @ObfuscatedName("client.kb")
    public static int field781 = 0;

    @ObfuscatedName("client.kg")
    public static boolean field901 = false;

    @ObfuscatedName("client.lf")
    public static int field667 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field767 = new int[500];

    @ObfuscatedName("client.lc")
    public static int[] field751 = new int[500];

    @ObfuscatedName("client.la")
    public static int[] field857 = new int[500];

    @ObfuscatedName("client.le")
    public static int[] field777 = new int[500];

    @ObfuscatedName("client.lh")
    public static String[] field771 = new String[500];

    @ObfuscatedName("client.lo")
    public static String[] field772 = new String[500];

    @ObfuscatedName("client.lj")
    public static boolean[] field761 = new boolean[500];

    @ObfuscatedName("client.lk")
    public static boolean field774 = false;

    @ObfuscatedName("client.li")
    public static boolean field775 = false;

    @ObfuscatedName("client.ls")
    public static boolean field776 = false;

    @ObfuscatedName("client.lz")
    public static boolean field665 = true;

    @ObfuscatedName("client.ln")
    public static int field778 = -1;

    @ObfuscatedName("client.lr")
    public static int field794 = -1;

    @ObfuscatedName("client.lm")
    public static int field799 = 0;

    @ObfuscatedName("client.ld")
    public static int field675 = 50;

    @ObfuscatedName("client.lw")
    public static int field673 = 0;

    @ObfuscatedName("client.lu")
    public static boolean field784 = false;

    @ObfuscatedName("client.ll")
    public static int field785 = -1;

    @ObfuscatedName("client.mj")
    public static int field786 = -1;

    @ObfuscatedName("client.mg")
    public static String field787 = null;

    @ObfuscatedName("client.my")
    public static String field782 = null;

    @ObfuscatedName("client.mk")
    public static int field789 = -1;

    @ObfuscatedName("client.ma")
    public static class318 field790 = new class318(8);

    @ObfuscatedName("client.ms")
    public static int field791 = 0;

    @ObfuscatedName("client.ml")
    public static int field792 = -1;

    @ObfuscatedName("client.mn")
    public static int field793 = 0;

    @ObfuscatedName("client.mr")
    public static int field902 = 0;

    @ObfuscatedName("client.mv")
    public static class218 field795 = null;

    @ObfuscatedName("client.mi")
    public static int field796 = 0;

    @ObfuscatedName("client.mq")
    public static int field725 = 0;

    @ObfuscatedName("client.mt")
    public static int field798 = 0;

    @ObfuscatedName("client.mh")
    public static int field813 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field716 = false;

    @ObfuscatedName("client.mc")
    public static class218 field875 = null;

    @ObfuscatedName("client.mu")
    public static class218 field802 = null;

    @ObfuscatedName("client.mo")
    public static class218 field803 = null;

    @ObfuscatedName("client.mm")
    public static int field804 = 0;

    @ObfuscatedName("client.mx")
    public static int field635 = 0;

    @ObfuscatedName("client.mw")
    public static class218 field806 = null;

    @ObfuscatedName("client.nh")
    public static boolean field807 = false;

    @ObfuscatedName("client.no")
    public static int field808 = -1;

    @ObfuscatedName("client.nm")
    public static int field809 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field810 = false;

    @ObfuscatedName("client.ng")
    public static int field883 = -1;

    @ObfuscatedName("client.nk")
    public static int field812 = -1;

    @ObfuscatedName("client.nj")
    public static boolean field638 = false;

    @ObfuscatedName("client.nc")
    public static int field814 = 1;

    @ObfuscatedName("client.ne")
    public static int[] field815 = new int[32];

    @ObfuscatedName("client.nv")
    public static int field649 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field811 = new int[32];

    @ObfuscatedName("client.ns")
    public static int field702 = 0;

    @ObfuscatedName("client.np")
    public static int[] field818 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field820 = 0;

    @ObfuscatedName("client.nw")
    public static int field821 = 0;

    @ObfuscatedName("client.nt")
    public static int field712 = 0;

    @ObfuscatedName("client.ny")
    public static int field863 = 0;

    @ObfuscatedName("client.na")
    public static int field824 = 0;

    @ObfuscatedName("client.nz")
    public static int field861 = 0;

    @ObfuscatedName("client.nq")
    public static int field826 = 0;

    @ObfuscatedName("client.om")
    public static int field827 = 0;

    @ObfuscatedName("client.op")
    public static class262 field828 = new class262();

    @ObfuscatedName("client.oy")
    public static class262 field866 = new class262();

    @ObfuscatedName("client.of")
    public static class262 field884 = new class262();

    @ObfuscatedName("client.oo")
    public static class318 field831 = new class318(512);

    @ObfuscatedName("client.og")
    public static int field832 = 0;

    @ObfuscatedName("client.ov")
    public static int field833 = -2;

    @ObfuscatedName("client.os")
    public static boolean[] field834 = new boolean[100];

    @ObfuscatedName("client.ok")
    public static boolean[] field835 = new boolean[100];

    @ObfuscatedName("client.on")
    public static boolean[] field836 = new boolean[100];

    @ObfuscatedName("client.ow")
    public static int[] field837 = new int[100];

    @ObfuscatedName("client.oi")
    public static int[] field838 = new int[100];

    @ObfuscatedName("client.oz")
    public static int[] field839 = new int[100];

    @ObfuscatedName("client.oq")
    public static int[] field840 = new int[100];

    @ObfuscatedName("client.ou")
    public static int field841 = 0;

    @ObfuscatedName("client.oa")
    public static long field842 = 0L;

    @ObfuscatedName("client.ot")
    public static boolean field843 = true;

    @ObfuscatedName("client.pe")
    public static int[] field865 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pm")
    public static int field845 = 0;

    @ObfuscatedName("client.pk")
    public static int field849 = 0;

    @ObfuscatedName("client.pc")
    public static String field847 = "";

    @ObfuscatedName("client.po")
    public static long[] field708 = new long[100];

    @ObfuscatedName("client.ph")
    public static int field683 = 0;

    @ObfuscatedName("client.pr")
    public static int field850 = 0;

    @ObfuscatedName("client.pa")
    public static int[] field851 = new int[128];

    @ObfuscatedName("client.pq")
    public static int[] field852 = new int[128];

    @ObfuscatedName("client.ps")
    public static long field853 = -1L;

    @ObfuscatedName("client.pp")
    public static int field854 = -1;

    @ObfuscatedName("client.pz")
    public static int field855 = 0;

    @ObfuscatedName("client.pf")
    public static int[] field856 = new int[1000];

    @ObfuscatedName("client.py")
    public static int[] field882 = new int[1000];

    @ObfuscatedName("client.px")
    public static class325[] field858 = new class325[1000];

    @ObfuscatedName("client.pj")
    public static int field819 = 0;

    @ObfuscatedName("client.pd")
    public static int field800 = 0;

    @ObfuscatedName("client.qe")
    public static int field867 = 0;

    @ObfuscatedName("client.qc")
    public static int field650 = 255;

    @ObfuscatedName("client.ql")
    public static int field726 = -1;

    @ObfuscatedName("client.qt")
    public static boolean field768 = false;

    @ObfuscatedName("client.qk")
    public static int field700 = 127;

    @ObfuscatedName("client.qh")
    public static int field636 = 127;

    @ObfuscatedName("client.qx")
    public static int field754 = 0;

    @ObfuscatedName("client.qm")
    public static int[] field868 = new int[50];

    @ObfuscatedName("client.qj")
    public static int[] field757 = new int[50];

    @ObfuscatedName("client.qz")
    public static int[] field779 = new int[50];

    @ObfuscatedName("client.qw")
    public static int[] field871 = new int[50];

    @ObfuscatedName("client.qf")
    public static class100[] field872 = new class100[50];

    @ObfuscatedName("client.qp")
    public static boolean field873 = false;

    @ObfuscatedName("client.rj")
    public static boolean[] field780 = new boolean[5];

    @ObfuscatedName("client.rw")
    public static int[] field876 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field877 = new int[5];

    @ObfuscatedName("client.re")
    public static int[] field878 = new int[5];

    @ObfuscatedName("client.ry")
    public static int[] field879 = new int[5];

    @ObfuscatedName("client.rx")
    public static short field880 = 256;

    @ObfuscatedName("client.rt")
    public static short field881 = 205;

    @ObfuscatedName("client.rb")
    public static short field743 = 256;

    @ObfuscatedName("client.ro")
    public static short field859 = 320;

    @ObfuscatedName("client.rd")
    public static short field797 = 1;

    @ObfuscatedName("client.rn")
    public static short field885 = 32767;

    @ObfuscatedName("client.rl")
    public static short field805 = 1;

    @ObfuscatedName("client.ri")
    public static short field887 = 32767;

    @ObfuscatedName("client.rz")
    public static int field888 = 0;

    @ObfuscatedName("client.ru")
    public static int field889 = 0;

    @ObfuscatedName("client.rv")
    public static int field890 = 0;

    @ObfuscatedName("client.rg")
    public static int field891 = 0;

    @ObfuscatedName("client.rk")
    public static int field892 = 0;

    @ObfuscatedName("client.rh")
    public static class215 field893 = new class215();

    @ObfuscatedName("client.sv")
    public static int field894 = -1;

    @ObfuscatedName("client.sm")
    public static int field895 = -1;

    @ObfuscatedName("client.sq")
    public static class330 field753 = new class329();

    @ObfuscatedName("client.si")
    public static class10[] field897 = new class10[8];

    @ObfuscatedName("client.sw")
    public static class68 field898 = new class68();

    @ObfuscatedName("client.sc")
    public static int field750 = -1;

    @ObfuscatedName("client.sk")
    public static ArrayList field900 = new ArrayList(10);

    @ObfuscatedName("client.sx")
    public static int field686 = 0;

    @ObfuscatedName("client.sr")
    public static int field630 = 0;

    @ObfuscatedName("client.ts")
    public static final class66 field903 = new class66();

    @ObfuscatedName("client.tr")
    public static int[] field904 = new int[50];

    @ObfuscatedName("client.tb")
    public static int[] field731 = new int[50];

    @ObfuscatedName("client.bj(I)V")
    public final void method811() {
    }

    public final void init() {
        if (!this.method791()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field728 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1125)) {
                            field634 = true;
                        } else {
                            field634 = false;
                        }
                        break;
                    case 4:
                        if (field737 == -1) {
                            field737 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field632 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var10 = Integer.parseInt(var2);
                        class191 var11;
                        if (var10 >= 0 && var10 < class191.field2340.length) {
                            var11 = class191.field2340[var10];
                        } else {
                            var11 = null;
                        }
                        Statics.field2515 = var11;
                        break;
                    case 7:
                        int var4 = Integer.parseInt(var2);
                        class230[] var5 = new class230[] { class230.field3078, class230.field3080, class230.field3081, class230.field3079 };
                        class230[] var6 = var5;
                        int var7 = 0;
                        class230 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class230 var8 = var6[var7];
                            if (var8.field3082 == var4) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field403 = var9;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1125)) {
                        }
                        break;
                    case 9:
                        Statics.field1944 = var2;
                        break;
                    case 10:
                        class231[] var3 = new class231[] { class231.field3086, class231.field3090, class231.field3085, class231.field3087, class231.field3089, class231.field3088 };
                        Statics.field285 = (class231) class196.method2065(var3, Integer.parseInt(var2));
                        if (Statics.field285 == class231.field3089) {
                            Statics.field2325 = class338.field4033;
                        } else {
                            Statics.field2325 = class338.field4032;
                        }
                        break;
                    case 12:
                        field829 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field565 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field631 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1511 = var2;
                }
            }
        }
        method3849();
        Statics.field2071 = this.getCodeBase().getHost();
        String var12 = Statics.field403.field3083;
        byte var13 = 0;
        try {
            class168.method441("oldschool", var12, var13, 21);
        } catch (Exception var15) {
            class341.method5815((String) null, var15);
        }
        Statics.field2488 = this;
        Statics.field4045 = field737;
        this.method789(765, 503, 187);
    }

    @ObfuscatedName("hz.em(B)V")
    public static final void method3849() {
        class134.field1803 = false;
        field846 = false;
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method897() {
        class302.method1974(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2394 = field631 == 0 ? 43594 : field829 + 40000;
        Statics.field571 = field631 == 0 ? 443 : field829 + 50000;
        Statics.field331 = Statics.field2394;
        Statics.field2526 = class216.field2530;
        Statics.field270 = class216.field2534;
        Statics.field4011 = class216.field2532;
        Statics.field2067 = class216.field2533;
        Statics.field3767 = new class144();
        this.method783();
        this.method784();
        Statics.field2464 = this.method866();
        Statics.field165 = new class308(255, class168.field2022, class168.field2029, 500000);
        class343 var1 = null;
        class74 var2 = new class74();
        try {
            var1 = class168.method2049("", Statics.field285.field3084, false);
            byte[] var3 = new byte[(int) var1.method6098()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6097(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class74(new class300(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6105();
            }
        } catch (Exception var9) {
        }
        Statics.field1071 = var2;
        this.method901();
        class51.method26(this, Statics.field447);
        if (field631 != 0) {
            field647 = true;
        }
        method1027(Statics.field1071.field1038);
        Statics.field586 = new class75(Statics.field2325);
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method802() {
        field641++;
        this.method1152();
        class235.method3260();
        try {
            if (class198.field2393 == 1) {
                int var1 = Statics.field4005.method3373();
                if (var1 > 0 && Statics.field4005.method3380()) {
                    int var2 = var1 - Statics.field3276;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field4005.method3374(var2);
                } else {
                    Statics.field4005.method3379();
                    Statics.field4005.method3431();
                    if (Statics.field2519 == null) {
                        class198.field2393 = 0;
                    } else {
                        class198.field2393 = 2;
                    }
                    Statics.field2396 = null;
                    Statics.field3527 = null;
                }
            }
        } catch (Exception var123) {
            var123.printStackTrace();
            Statics.field4005.method3379();
            class198.field2393 = 0;
            Statics.field2396 = null;
            Statics.field3527 = null;
            Statics.field2519 = null;
        }
        method352();
        class45 var4 = class45.field382;
        synchronized (class45.field382) {
            class45.field362++;
            class45.field379 = class45.field381;
            class45.field378 = 0;
            if (class45.field374 >= 0) {
                while (class45.field374 != class45.field373) {
                    int var6 = class45.field372[class45.field373];
                    class45.field373 = class45.field373 + 1 & 0x7F;
                    if (var6 < 0) {
                        class45.field367[~var6] = false;
                    } else {
                        if (!class45.field367[var6] && class45.field378 < class45.field377.length - 1) {
                            class45.field377[++class45.field378 - 1] = var6;
                        }
                        class45.field367[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class45.field367[var5] = false;
                }
                class45.field374 = class45.field373;
            }
            if (class45.field378 > 0) {
                class45.field362 = 0;
            }
            class45.field381 = class45.field387;
        }
        class54 var8 = class54.field456;
        synchronized (class54.field456) {
            class54.field465 = class54.field461;
            class54.field466 = class54.field462;
            class54.field477 = class54.field463;
            class54.field468 = class54.field464;
            class54.field473 = class54.field470;
            class54.field474 = class54.field469;
            class54.field475 = class54.field478;
            class54.field471 = class54.field472;
            class54.field470 = 0;
        }
        if (Statics.field2464 != null) {
            int var10 = Statics.field2464.method653();
            field827 = var10;
        }
        if (field645 == 0) {
            method407();
            class53.method2832();
        } else if (field645 == 5) {
            class86.method3057(this);
            method407();
            class53.method2832();
        } else if (field645 == 10 || field645 == 11) {
            class86.method3057(this);
        } else if (field645 == 20) {
            class86.method3057(this);
            this.method1552();
        } else if (field645 == 25) {
            method3257(false);
            field825 = 0;
            boolean var11 = true;
            for (int var12 = 0; var12 < Statics.field1194.length; var12++) {
                if (Statics.field1226[var12] != -1 && Statics.field1194[var12] == null) {
                    Statics.field1194[var12] = Statics.field141.method3752(Statics.field1226[var12], 0);
                    if (Statics.field1194[var12] == null) {
                        var11 = false;
                        field825++;
                    }
                }
                if (Statics.field2739[var12] != -1 && Statics.field626[var12] == null) {
                    Statics.field626[var12] = Statics.field141.method3753(Statics.field2739[var12], 0, Statics.field397[var12]);
                    if (Statics.field626[var12] == null) {
                        var11 = false;
                        field825++;
                    }
                }
            }
            if (var11) {
                field684 = 0;
                boolean var13 = true;
                for (int var14 = 0; var14 < Statics.field1194.length; var14++) {
                    byte[] var15 = Statics.field626[var14];
                    if (var15 != null) {
                        int var16 = (Statics.field185[var14] >> 8) * 64 - Statics.field2477;
                        int var17 = (Statics.field185[var14] & 0xFF) * 64 - Statics.field562;
                        if (field688) {
                            var16 = 10;
                            var17 = 10;
                        }
                        boolean var19 = true;
                        class300 var20 = new class300(var15);
                        int var21 = -1;
                        label599: while (true) {
                            int var22 = var20.method5125();
                            if (var22 == 0) {
                                var13 &= var19;
                                break;
                            }
                            var21 += var22;
                            int var23 = 0;
                            boolean var24 = false;
                            while (true) {
                                while (!var24) {
                                    int var26 = var20.method5124();
                                    if (var26 == 0) {
                                        continue label599;
                                    }
                                    var23 += var26 - 1;
                                    int var27 = var23 & 0x3F;
                                    int var28 = var23 >> 6 & 0x3F;
                                    int var29 = var20.method5110() >> 2;
                                    int var30 = var16 + var28;
                                    int var31 = var17 + var27;
                                    if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                        class254 var32 = class254.method3616(var21);
                                        if (var29 != 22 || !field846 || var32.field3334 != 0 || var32.field3332 == 1 || var32.field3353) {
                                            if (!var32.method4230()) {
                                                field684++;
                                                var19 = false;
                                            }
                                            var24 = true;
                                        }
                                    }
                                }
                                int var25 = var20.method5124();
                                if (var25 == 0) {
                                    break;
                                }
                                var20.method5110();
                            }
                        }
                    }
                }
                if (var13) {
                    if (field735 != 0) {
                        method9(class225.field2925 + class82.field1126 + class82.field1124 + 100 + "%" + class82.field1128, true);
                    }
                    method352();
                    Statics.field86.method2834();
                    for (int var34 = 0; var34 < 4; var34++) {
                        field687[var34].method3227();
                    }
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                class57.field492[var35][var36][var37] = 0;
                            }
                        }
                    }
                    method352();
                    class57.method249();
                    int var38 = Statics.field1194.length;
                    class76.method212();
                    method3257(true);
                    if (!field688) {
                        int var39 = 0;
                        label537: while (true) {
                            if (var39 >= var38) {
                                for (int var53 = 0; var53 < var38; var53++) {
                                    int var54 = (Statics.field185[var53] >> 8) * 64 - Statics.field2477;
                                    int var55 = (Statics.field185[var53] & 0xFF) * 64 - Statics.field562;
                                    byte[] var56 = Statics.field1194[var53];
                                    if (var56 == null && Statics.field3568 < 800) {
                                        method352();
                                        class57.method94(var54, var55, 64, 64);
                                    }
                                }
                                method3257(true);
                                int var57 = 0;
                                while (true) {
                                    if (var57 >= var38) {
                                        break label537;
                                    }
                                    byte[] var58 = Statics.field626[var57];
                                    if (var58 != null) {
                                        int var59 = (Statics.field185[var57] >> 8) * 64 - Statics.field2477;
                                        int var60 = (Statics.field185[var57] & 0xFF) * 64 - Statics.field562;
                                        method352();
                                        class134 var61 = Statics.field86;
                                        class173[] var62 = field687;
                                        class300 var63 = new class300(var58);
                                        int var64 = -1;
                                        while (true) {
                                            int var65 = var63.method5125();
                                            if (var65 == 0) {
                                                break;
                                            }
                                            var64 += var65;
                                            int var66 = 0;
                                            while (true) {
                                                int var67 = var63.method5124();
                                                if (var67 == 0) {
                                                    break;
                                                }
                                                var66 += var67 - 1;
                                                int var68 = var66 & 0x3F;
                                                int var69 = var66 >> 6 & 0x3F;
                                                int var70 = var66 >> 12;
                                                int var71 = var63.method5110();
                                                int var72 = var71 >> 2;
                                                int var73 = var71 & 0x3;
                                                int var74 = var59 + var69;
                                                int var75 = var60 + var68;
                                                if (var74 > 0 && var75 > 0 && var74 < 103 && var75 < 103) {
                                                    int var76 = var70;
                                                    if ((class57.field492[1][var74][var75] & 0x2) == 2) {
                                                        var76 = var70 - 1;
                                                    }
                                                    class173 var77 = null;
                                                    if (var76 >= 0) {
                                                        var77 = var62[var76];
                                                    }
                                                    class57.method4113(var70, var74, var75, var64, var73, var72, var61, var77);
                                                }
                                            }
                                        }
                                    }
                                    var57++;
                                }
                            }
                            int var40 = (Statics.field185[var39] >> 8) * 64 - Statics.field2477;
                            int var41 = (Statics.field185[var39] & 0xFF) * 64 - Statics.field562;
                            byte[] var42 = Statics.field1194[var39];
                            if (var42 != null) {
                                method352();
                                int var43 = Statics.field48 * 8 - 48;
                                int var44 = Statics.field3568 * 8 - 48;
                                class173[] var45 = field687;
                                int var46 = 0;
                                label534: while (true) {
                                    if (var46 >= 4) {
                                        class300 var49 = new class300(var42);
                                        int var50 = 0;
                                        while (true) {
                                            if (var50 >= 4) {
                                                break label534;
                                            }
                                            for (int var51 = 0; var51 < 64; var51++) {
                                                for (int var52 = 0; var52 < 64; var52++) {
                                                    class57.method5447(var49, var50, var40 + var51, var41 + var52, var43, var44, 0);
                                                }
                                            }
                                            var50++;
                                        }
                                    }
                                    for (int var47 = 0; var47 < 64; var47++) {
                                        for (int var48 = 0; var48 < 64; var48++) {
                                            if (var40 + var47 > 0 && var40 + var47 < 103 && var41 + var48 > 0 && var41 + var48 < 103) {
                                                var45[var46].field2068[var40 + var47][var41 + var48] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var46++;
                                }
                            }
                            var39++;
                        }
                    }
                    if (field688) {
                        int var78 = 0;
                        label470: while (true) {
                            if (var78 >= 4) {
                                for (int var96 = 0; var96 < 13; var96++) {
                                    for (int var97 = 0; var97 < 13; var97++) {
                                        int var98 = field689[0][var96][var97];
                                        if (var98 == -1) {
                                            class57.method94(var96 * 8, var97 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3257(true);
                                int var99 = 0;
                                while (true) {
                                    if (var99 >= 4) {
                                        break label470;
                                    }
                                    method352();
                                    for (int var100 = 0; var100 < 13; var100++) {
                                        for (int var101 = 0; var101 < 13; var101++) {
                                            int var102 = field689[var99][var100][var101];
                                            if (var102 != -1) {
                                                int var103 = var102 >> 24 & 0x3;
                                                int var104 = var102 >> 1 & 0x3;
                                                int var105 = var102 >> 14 & 0x3FF;
                                                int var106 = var102 >> 3 & 0x7FF;
                                                int var107 = (var105 / 8 << 8) + var106 / 8;
                                                for (int var108 = 0; var108 < Statics.field185.length; var108++) {
                                                    if (Statics.field185[var108] == var107 && Statics.field626[var108] != null) {
                                                        class57.method3071(Statics.field626[var108], var99, var100 * 8, var101 * 8, var103, (var105 & 0x7) * 8, (var106 & 0x7) * 8, var104, Statics.field86, field687);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var99++;
                                }
                            }
                            method352();
                            for (int var79 = 0; var79 < 13; var79++) {
                                for (int var80 = 0; var80 < 13; var80++) {
                                    boolean var81 = false;
                                    int var82 = field689[var78][var79][var80];
                                    if (var82 != -1) {
                                        int var83 = var82 >> 24 & 0x3;
                                        int var84 = var82 >> 1 & 0x3;
                                        int var85 = var82 >> 14 & 0x3FF;
                                        int var86 = var82 >> 3 & 0x7FF;
                                        int var87 = (var85 / 8 << 8) + var86 / 8;
                                        for (int var88 = 0; var88 < Statics.field185.length; var88++) {
                                            if (Statics.field185[var88] == var87 && Statics.field1194[var88] != null) {
                                                class57.method717(Statics.field1194[var88], var78, var79 * 8, var80 * 8, var83, (var85 & 0x7) * 8, (var86 & 0x7) * 8, var84, field687);
                                                var81 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var81) {
                                        int var89 = var78;
                                        int var90 = var79 * 8;
                                        int var91 = var80 * 8;
                                        for (int var92 = 0; var92 < 8; var92++) {
                                            for (int var93 = 0; var93 < 8; var93++) {
                                                class57.field496[var89][var90 + var92][var91 + var93] = 0;
                                            }
                                        }
                                        if (var90 > 0) {
                                            for (int var94 = 1; var94 < 8; var94++) {
                                                class57.field496[var89][var90][var91 + var94] = class57.field496[var89][var90 - 1][var91 + var94];
                                            }
                                        }
                                        if (var91 > 0) {
                                            for (int var95 = 1; var95 < 8; var95++) {
                                                class57.field496[var89][var90 + var95][var91] = class57.field496[var89][var90 + var95][var91 - 1];
                                            }
                                        }
                                        if (var90 > 0 && class57.field496[var89][var90 - 1][var91] != 0) {
                                            class57.field496[var89][var90][var91] = class57.field496[var89][var90 - 1][var91];
                                        } else if (var91 > 0 && class57.field496[var89][var90][var91 - 1] != 0) {
                                            class57.field496[var89][var90][var91] = class57.field496[var89][var90][var91 - 1];
                                        } else if (var90 > 0 && var91 > 0 && class57.field496[var89][var90 - 1][var91 - 1] != 0) {
                                            class57.field496[var89][var90][var91] = class57.field496[var89][var90 - 1][var91 - 1];
                                        }
                                    }
                                }
                            }
                            var78++;
                        }
                    }
                    method3257(true);
                    method352();
                    Statics.method3320(Statics.field86, field687);
                    method3257(true);
                    int var109 = class57.field491;
                    if (var109 > Statics.field1929) {
                        var109 = Statics.field1929;
                    }
                    if (var109 < Statics.field1929 - 1) {
                        int var110 = Statics.field1929 - 1;
                    }
                    if (field846) {
                        Statics.field86.method2835(class57.field491);
                    } else {
                        Statics.field86.method2835(0);
                    }
                    for (int var111 = 0; var111 < 104; var111++) {
                        for (int var112 = 0; var112 < 104; var112++) {
                            method3726(var111, var112);
                        }
                    }
                    method352();
                    method493();
                    class254.field3318.method3102();
                    if (Statics.field2488.method810()) {
                        class182 var113 = class182.method19(class178.field2181, field668.field1294);
                        var113.field2303.method5097(1057001181);
                        field668.method2084(var113);
                    }
                    if (!field688) {
                        int var114 = (Statics.field48 - 6) / 8;
                        int var115 = (Statics.field48 + 6) / 8;
                        int var116 = (Statics.field3568 - 6) / 8;
                        int var117 = (Statics.field3568 + 6) / 8;
                        for (int var118 = var114 - 1; var118 <= var115 + 1; var118++) {
                            for (int var119 = var116 - 1; var119 <= var117 + 1; var119++) {
                                if (var118 < var114 || var118 > var115 || var119 < var116 || var119 > var117) {
                                    Statics.field141.method3763("m" + var118 + "_" + var119);
                                    Statics.field141.method3763("l" + var118 + "_" + var119);
                                }
                            }
                        }
                    }
                    method3347(30);
                    method352();
                    class57.method3350();
                    class182 var120 = class182.method19(class178.field2177, field668.field1294);
                    field668.method2084(var120);
                    class53.method2832();
                } else {
                    field735 = 2;
                }
            } else {
                field735 = 1;
            }
        }
        if (field645 == 30) {
            this.method1387();
        } else if (field645 == 40 || field645 == 45) {
            this.method1552();
        }
    }

    @ObfuscatedName("client.ad(ZI)V")
    public final void method803(boolean arg0) {
        boolean var2 = class198.method521();
        if (var2 && field768 && Statics.field1964 != null) {
            Statics.field1964.method2270();
        }
        if ((field645 == 10 || field645 == 20 || field645 == 30) && field842 != 0L && class297.method481() > field842) {
            method1027(method4329());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field834[var3] = true;
            }
        }
        if (field645 == 0) {
            this.method805(class86.field1178, class86.field1167, arg0);
        } else if (field645 == 5) {
            class86.method3471(Statics.field59, Statics.field19, Statics.field489);
        } else if (field645 == 10 || field645 == 11) {
            class86.method3471(Statics.field59, Statics.field19, Statics.field489);
        } else if (field645 == 20) {
            class86.method3471(Statics.field59, Statics.field19, Statics.field489);
        } else if (field645 == 25) {
            if (field735 == 1) {
                if (field825 > field860) {
                    field860 = field825;
                }
                int var4 = (field860 * 50 - field825 * 50) / field860;
                method9(class225.field2925 + class82.field1126 + class82.field1124 + var4 + "%" + class82.field1128, false);
            } else if (field735 == 2) {
                if (field684 > field685) {
                    field685 = field684;
                }
                int var5 = (field685 * 50 - field684 * 50) / field685 + 50;
                method9(class225.field2925 + class82.field1126 + class82.field1124 + var5 + "%" + class82.field1128, false);
            } else {
                method9(class225.field2925, false);
            }
        } else if (field645 == 30) {
            this.method1360();
        } else if (field645 == 40) {
            method9(class225.field2756 + class82.field1126 + class225.field2757, false);
        } else if (field645 == 45) {
            method9(class225.field2906, false);
        }
        if (field645 == 30 && field841 == 0 && !arg0 && !field843) {
            for (int var6 = 0; var6 < field832; var6++) {
                if (field835[var6]) {
                    Statics.field3579.method760(field837[var6], field838[var6], field839[var6], field840[var6]);
                    field835[var6] = false;
                }
            }
        } else if (field645 > 0) {
            Statics.field3579.method763(0, 0);
            for (int var7 = 0; var7 < field832; var7++) {
                field835[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method861() {
        if (Statics.field2005.method1988()) {
            Statics.field2005.method2018();
        }
        if (Statics.field2081 != null) {
            Statics.field2081.field574 = false;
        }
        Statics.field2081 = null;
        field668.method2086();
        class45.method3275();
        if (class54.field456 != null) {
            class54 var1 = class54.field456;
            synchronized (class54.field456) {
                class54.field456 = null;
            }
        }
        Statics.field2464 = null;
        if (Statics.field1964 != null) {
            Statics.field1964.method2267();
        }
        if (Statics.field2050 != null) {
            Statics.field2050.method2267();
        }
        class237.method1042();
        class235.method3341();
        if (Statics.field3767 != null) {
            Statics.field3767.method3028();
            Statics.field3767 = null;
        }
        try {
            class168.field2022.method6083();
            for (int var3 = 0; var3 < Statics.field2023; var3++) {
                Statics.field1153[var3].method6083();
            }
            class168.field2029.method6083();
            class168.field2027.method6083();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("ge.fd(II)V")
    public static void method3347(int arg0) {
        if (field645 == arg0) {
            return;
        }
        if (field645 == 0) {
            Statics.field2488.method806();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field663 = 0;
            field664 = 0;
            field741 = 0;
            field680.method4625(arg0);
            if (arg0 != 20) {
                method515(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1731 != null) {
            Statics.field1731.method3191();
            Statics.field1731 = null;
        }
        if (field645 == 25) {
            field735 = 0;
            field825 = 0;
            field860 = 1;
            field684 = 0;
            field685 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method700(Statics.field3077, Statics.field15, true, 0);
        } else if (arg0 == 20) {
            class86.method700(Statics.field3077, Statics.field15, true, field645 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method700(Statics.field3077, Statics.field15, false, 4);
        } else {
            class86.method3020();
        }
        field645 = arg0;
    }

    @ObfuscatedName("client.ff(B)V")
    public void method1152() {
        if (field645 == 1000) {
            return;
        }
        long var1 = class297.method481();
        int var3 = (int) (var1 - Statics.field3139);
        Statics.field3139 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class237.field3147 += var3;
        boolean var4;
        if (class237.field3157 == 0 && class237.field3140 == 0 && class237.field3142 == 0 && class237.field3141 == 0) {
            var4 = true;
        } else if (Statics.field3697 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class237.field3147 > 30000) {
                        throw new IOException();
                    }
                    while (class237.field3140 < 200 && class237.field3141 > 0) {
                        class233 var5 = (class233) class237.field3143.method5501();
                        class300 var6 = new class300(4);
                        var6.method5094(1);
                        var6.method5138((int) var5.field2322);
                        Statics.field3697.method3197(var6.field3704, 0, 4);
                        class237.field3145.method5502(var5, var5.field2322);
                        class237.field3141--;
                        class237.field3140++;
                    }
                    while (class237.field3157 < 200 && class237.field3142 > 0) {
                        class233 var7 = (class233) class237.field3144.method4437();
                        class300 var8 = new class300(4);
                        var8.method5094(0);
                        var8.method5138((int) var7.field2322);
                        Statics.field3697.method3197(var8.field3704, 0, 4);
                        var7.method3286();
                        class237.field3155.method5502(var7, var7.field2322);
                        class237.field3142--;
                        class237.field3157++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3697.method3193();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class237.field3147 = 0;
                        byte var11 = 0;
                        if (Statics.field3795 == null) {
                            var11 = 8;
                        } else if (class237.field3151 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class237.field3149.field3703;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3697.method3195(class237.field3149.field3704, class237.field3149.field3703, var12);
                            if (class237.field3146 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class237.field3149.field3704[class237.field3149.field3703 + var13] ^= class237.field3146;
                                }
                            }
                            class237.field3149.field3703 += var12;
                            if (class237.field3149.field3703 < var11) {
                                break;
                            }
                            if (Statics.field3795 == null) {
                                class237.field3149.field3703 = 0;
                                int var14 = class237.field3149.method5110();
                                int var15 = class237.field3149.method5112();
                                int var16 = class237.field3149.method5110();
                                int var17 = class237.field3149.method5192();
                                long var18 = (long) ((var14 << 16) + var15);
                                class233 var20 = (class233) class237.field3145.method5499(var18);
                                Statics.field90 = true;
                                if (var20 == null) {
                                    var20 = (class233) class237.field3155.method5499(var18);
                                    Statics.field90 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3795 = var20;
                                Statics.field3150 = new class300(var17 + var21 + Statics.field3795.field3101);
                                Statics.field3150.method5094(var16);
                                Statics.field3150.method5097(var17);
                                class237.field3151 = 8;
                                class237.field3149.field3703 = 0;
                            } else if (class237.field3151 == 0) {
                                if (class237.field3149.field3704[0] == -1) {
                                    class237.field3151 = 1;
                                    class237.field3149.field3703 = 0;
                                } else {
                                    Statics.field3795 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3150.field3704.length - Statics.field3795.field3101;
                            int var23 = 512 - class237.field3151;
                            if (var23 > var22 - Statics.field3150.field3703) {
                                var23 = var22 - Statics.field3150.field3703;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3697.method3195(Statics.field3150.field3704, Statics.field3150.field3703, var23);
                            if (class237.field3146 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3150.field3704[Statics.field3150.field3703 + var24] ^= class237.field3146;
                                }
                            }
                            Statics.field3150.field3703 += var23;
                            class237.field3151 += var23;
                            if (Statics.field3150.field3703 == var22) {
                                if (Statics.field3795.field2322 == 16711935L) {
                                    Statics.field3153 = Statics.field3150;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class236 var26 = class237.field3154[var25];
                                        if (var26 != null) {
                                            Statics.field3153.field3703 = var25 * 8 + 5;
                                            int var27 = Statics.field3153.method5192();
                                            int var28 = Statics.field3153.method5192();
                                            var26.method3875(var27, var28);
                                        }
                                    }
                                } else {
                                    class237.field3152.reset();
                                    class237.field3152.update(Statics.field3150.field3704, 0, var22);
                                    int var29 = (int) class237.field3152.getValue();
                                    if (Statics.field3795.field3100 != var29) {
                                        try {
                                            Statics.field3697.method3191();
                                        } catch (Exception var35) {
                                        }
                                        class237.field3156++;
                                        Statics.field3697 = null;
                                        class237.field3146 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class237.field3156 = 0;
                                    class237.field3148 = 0;
                                    Statics.field3795.field3099.method3876((int) (Statics.field3795.field2322 & 0xFFFFL), Statics.field3150.field3704, (Statics.field3795.field2322 & 0xFF0000L) == 16711680L, Statics.field90);
                                }
                                Statics.field3795.method3292();
                                if (Statics.field90) {
                                    class237.field3140--;
                                } else {
                                    class237.field3157--;
                                }
                                class237.field3151 = 0;
                                Statics.field3795 = null;
                                Statics.field3150 = null;
                            } else {
                                if (class237.field3151 != 512) {
                                    break;
                                }
                                class237.field3151 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3697.method3191();
                } catch (Exception var34) {
                }
                class237.field3148++;
                Statics.field3697 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1153();
        }
    }

    @ObfuscatedName("client.fe(S)V")
    public void method1153() {
        if (class237.field3156 >= 4) {
            this.method807("js5crc");
            field645 = 1000;
            return;
        }
        if (class237.field3148 >= 4) {
            if (field645 <= 5) {
                this.method807("js5io");
                field645 = 1000;
                return;
            }
            field661 = 3000;
            class237.field3148 = 3;
        }
        if (--field661 + 1 > 0) {
            return;
        }
        try {
            if (field660 == 0) {
                Statics.field511 = Statics.field449.method3158(Statics.field2071, Statics.field331);
                field660++;
            }
            if (field660 == 1) {
                if (Statics.field511.field2010 == 2) {
                    this.method1538(-1);
                    return;
                }
                if (Statics.field511.field2010 == 1) {
                    field660++;
                }
            }
            if (field660 == 2) {
                if (field728) {
                    Statics.field1845 = class305.method4810((Socket) Statics.field511.field2015, 40000, 5000);
                } else {
                    Statics.field1845 = new class172((Socket) Statics.field511.field2015, Statics.field449, 5000);
                }
                class300 var1 = new class300(5);
                var1.method5094(15);
                var1.method5097(187);
                Statics.field1845.method3197(var1.field3704, 0, 5);
                field660++;
                Statics.field520 = class297.method481();
            }
            if (field660 == 3) {
                if (Statics.field1845.method3193() > 0 || !field728 && field645 <= 5) {
                    int var2 = Statics.field1845.method3215();
                    if (var2 != 0) {
                        this.method1538(var2);
                        return;
                    }
                    field660++;
                } else if (class297.method481() - Statics.field520 > 30000L) {
                    this.method1538(-2);
                    return;
                }
            }
            if (field660 == 4) {
                class237.method4817(Statics.field1845, field645 > 20);
                Statics.field511 = null;
                Statics.field1845 = null;
                field660 = 0;
                field662 = 0;
            }
        } catch (IOException var4) {
            this.method1538(-3);
        }
    }

    @ObfuscatedName("client.fk(II)V")
    public void method1538(int arg0) {
        Statics.field511 = null;
        Statics.field1845 = null;
        field660 = 0;
        if (Statics.field331 == Statics.field2394) {
            Statics.field331 = Statics.field571;
        } else {
            Statics.field331 = Statics.field2394;
        }
        field662++;
        if (field662 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field645 <= 5) {
                this.method807("js5connect_full");
                field645 = 1000;
            } else {
                field661 = 3000;
            }
        } else if (field662 >= 2 && arg0 == 6) {
            this.method807("js5connect_outofdate");
            field645 = 1000;
        } else if (field662 >= 4) {
            if (field645 <= 5) {
                this.method807("js5connect");
                field645 = 1000;
            } else {
                field661 = 3000;
            }
        }
    }

    @ObfuscatedName("kx.fv(Lif;Ljava/lang/String;I)V")
    public static void method5444(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field900.add(var2);
        field630 += var2.field515;
    }

    @ObfuscatedName("ap.fo(I)I")
    public static int method720() {
        if (field900 == null || field686 >= field900.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field686; var1++) {
            var0 += ((class59) field900.get(var1)).field516;
        }
        return var0 * 10000 / field630;
    }

    @ObfuscatedName("gs.fq(III)V")
    public static void method3326(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class131.field1762[var4];
            int var8 = Statics.method537(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class134.method2987(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("as.fn(B)V")
    public static void method407() {
        if (field659 == 0) {
            Statics.field86 = new class134(4, 104, 104, class57.field496);
            for (int var0 = 0; var0 < 4; var0++) {
                field687[var0] = new class173(104, 104);
            }
            Statics.field2350 = new class325(512, 512);
            class86.field1167 = class225.field2758;
            class86.field1178 = 5;
            field659 = 20;
        } else if (field659 == 20) {
            class86.field1167 = class225.field2759;
            class86.field1178 = 10;
            field659 = 30;
        } else if (field659 == 30) {
            Statics.field2275 = method722(0, false, true, true);
            Statics.field3423 = method722(1, false, true, true);
            Statics.field6 = method722(2, true, false, true);
            Statics.field332 = method722(3, false, true, true);
            Statics.field1593 = method722(4, false, true, true);
            Statics.field141 = method722(5, true, true, true);
            Statics.field26 = method722(6, true, true, true);
            Statics.field564 = method722(7, false, true, true);
            Statics.field15 = method722(8, false, true, true);
            Statics.field320 = method722(9, false, true, true);
            Statics.field3077 = method722(10, false, true, true);
            Statics.field404 = method722(11, false, true, true);
            Statics.field1398 = method722(12, false, true, true);
            Statics.field268 = method722(13, true, false, true);
            Statics.field1489 = method722(14, false, true, true);
            Statics.field49 = method722(15, false, true, true);
            Statics.field72 = method722(17, true, true, true);
            Statics.field147 = method722(18, false, true, true);
            Statics.field2380 = method722(19, false, true, true);
            Statics.field1936 = method722(20, false, true, true);
            class86.field1167 = class225.field2760;
            class86.field1178 = 20;
            field659 = 40;
        } else if (field659 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field2275.method3874() * 4 / 100;
            int var3 = var2 + Statics.field3423.method3874() * 4 / 100;
            int var4 = var3 + Statics.field6.method3874() * 2 / 100;
            int var5 = var4 + Statics.field332.method3874() * 2 / 100;
            int var6 = var5 + Statics.field1593.method3874() * 6 / 100;
            int var7 = var6 + Statics.field141.method3874() * 4 / 100;
            int var8 = var7 + Statics.field26.method3874() * 2 / 100;
            int var9 = var8 + Statics.field564.method3874() * 56 / 100;
            int var10 = var9 + Statics.field15.method3874() * 2 / 100;
            int var11 = var10 + Statics.field320.method3874() * 2 / 100;
            int var12 = var11 + Statics.field3077.method3874() * 2 / 100;
            int var13 = var12 + Statics.field404.method3874() * 2 / 100;
            int var14 = var13 + Statics.field1398.method3874() * 2 / 100;
            int var15 = var14 + Statics.field268.method3874() * 2 / 100;
            int var16 = var15 + Statics.field1489.method3874() * 2 / 100;
            int var17 = var16 + Statics.field49.method3874() * 2 / 100;
            int var18 = var17 + Statics.field2380.method3874() / 100;
            int var19 = var18 + Statics.field147.method3874() / 100;
            int var20 = var19 + Statics.field1936.method3874() / 100;
            int var21 = var20 + (Statics.field72.method3873() && Statics.field72.method3827() ? 1 : 0);
            if (var21 == 100) {
                method5444(Statics.field2275, "Animations");
                method5444(Statics.field3423, "Skeletons");
                method5444(Statics.field1593, "Sound FX");
                method5444(Statics.field141, "Maps");
                method5444(Statics.field26, "Music Tracks");
                method5444(Statics.field564, "Models");
                method5444(Statics.field15, "Sprites");
                method5444(Statics.field404, "Music Jingles");
                method5444(Statics.field1489, "Music Samples");
                method5444(Statics.field49, "Music Patches");
                method5444(Statics.field2380, "World Map");
                method5444(Statics.field147, "World Map Geography");
                method5444(Statics.field1936, "World Map Ground");
                Statics.field512 = new class312();
                Statics.field512.method5450(Statics.field72);
                class86.field1167 = class225.field2762;
                class86.field1178 = 30;
                field659 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1167 = class225.field2781 + var21 + "%";
                }
                class86.field1178 = 30;
            }
        } else if (field659 == 45) {
            boolean var22 = !field846;
            Statics.field2491 = 22050;
            Statics.field1409 = var22;
            Statics.field1104 = 2;
            class199 var23 = new class199();
            var23.method3433(9, 128);
            Statics.field1964 = class104.method642(Statics.field449, 0, 22050);
            Statics.field1964.method2232(var23);
            class236 var24 = Statics.field49;
            class236 var25 = Statics.field1489;
            class236 var26 = Statics.field1593;
            Statics.field2397 = var24;
            Statics.field2391 = var25;
            Statics.field2400 = var26;
            Statics.field4005 = var23;
            Statics.field2050 = class104.method642(Statics.field449, 1, 2048);
            Statics.field509 = new class97();
            Statics.field2050.method2232(Statics.field509);
            Statics.field1026 = new class111(22050, Statics.field2491);
            class86.field1167 = class225.field3009;
            class86.field1178 = 35;
            field659 = 50;
            Statics.field589 = new class293(Statics.field15, Statics.field268);
        } else if (field659 == 50) {
            class292[] var27 = new class292[] { class292.field3641, class292.field3643, class292.field3640, class292.field3642, class292.field3648, class292.field3649 };
            int var28 = var27.length;
            class293 var29 = Statics.field589;
            class292[] var30 = new class292[] { class292.field3641, class292.field3643, class292.field3640, class292.field3642, class292.field3648, class292.field3649 };
            field681 = var29.method4951(var30);
            if (field681.size() < var28) {
                class86.field1167 = class225.field2764 + field681.size() * 100 / var28 + "%";
                class86.field1178 = 40;
            } else {
                Statics.field19 = (class294) field681.get(class292.field3641);
                Statics.field489 = (class294) field681.get(class292.field3648);
                Statics.field59 = (class294) field681.get(class292.field3649);
                Statics.field354 = field753.method5828();
                class86.field1167 = class225.field2765;
                class86.field1178 = 40;
                field659 = 60;
            }
        } else if (field659 == 60) {
            class236 var31 = Statics.field3077;
            class236 var32 = Statics.field15;
            int var33 = 0;
            if (var31.method3771("title.jpg", "")) {
                var33++;
            }
            if (var32.method3771("logo", "")) {
                var33++;
            }
            if (var32.method3771("logo_deadman_mode", "")) {
                var33++;
            }
            if (var32.method3771("logo_seasonal_mode", "")) {
                var33++;
            }
            if (var32.method3771("titlebox", "")) {
                var33++;
            }
            if (var32.method3771("titlebutton", "")) {
                var33++;
            }
            if (var32.method3771("runes", "")) {
                var33++;
            }
            if (var32.method3771("title_mute", "")) {
                var33++;
            }
            if (var32.method3771("options_radio_buttons,0", "")) {
                var33++;
            }
            if (var32.method3771("options_radio_buttons,2", "")) {
                var33++;
            }
            if (var32.method3771("options_radio_buttons,4", "")) {
                var33++;
            }
            if (var32.method3771("options_radio_buttons,6", "")) {
                var33++;
            }
            var32.method3771("sl_back", "");
            var32.method3771("sl_flags", "");
            var32.method3771("sl_arrows", "");
            var32.method3771("sl_stars", "");
            var32.method3771("sl_button", "");
            byte var36 = 12;
            if (var33 < var36) {
                class86.field1167 = class225.field2926 + var33 * 100 / var36 + "%";
                class86.field1178 = 50;
            } else {
                class86.field1167 = class225.field2767;
                class86.field1178 = 50;
                method3347(5);
                field659 = 70;
            }
        } else if (field659 == 70) {
            if (Statics.field6.method3827()) {
                class258.method5621(Statics.field6);
                class245.method3720(Statics.field6);
                class236 var38 = Statics.field6;
                class236 var39 = Statics.field564;
                Statics.field3245 = var38;
                Statics.field3234 = var39;
                Statics.field67 = Statics.field3245.method3764(3);
                class236 var40 = Statics.field6;
                class236 var41 = Statics.field564;
                boolean var42 = field846;
                Statics.field3341 = var40;
                Statics.field3316 = var41;
                class254.field3346 = var42;
                class236 var43 = Statics.field6;
                class236 var44 = Statics.field564;
                Statics.field3461 = var43;
                Statics.field3430 = var44;
                class251.method2040(Statics.field6);
                Statics.method1091(Statics.field6, Statics.field564, field634, Statics.field19);
                class236 var45 = Statics.field6;
                class236 var46 = Statics.field2275;
                class236 var47 = Statics.field3423;
                Statics.field3498 = var45;
                Statics.field3480 = var46;
                Statics.field3495 = var47;
                class244.method3266(Statics.field6, Statics.field564);
                class236 var48 = Statics.field6;
                Statics.field3268 = var48;
                Statics.method482(Statics.field6);
                class218.method701(Statics.field332, Statics.field564, Statics.field15, Statics.field268);
                class240.method3062(Statics.field6);
                class252.method3585(Statics.field6);
                class236 var49 = Statics.field6;
                Statics.field3206 = var49;
                class236 var50 = Statics.field6;
                Statics.field3270 = var50;
                Statics.field2005 = new class91();
                class236 var51 = Statics.field6;
                class236 var52 = Statics.field15;
                class236 var53 = Statics.field268;
                Statics.field3296 = var51;
                Statics.field3291 = var52;
                Statics.field2486 = var53;
                class247.method3063(Statics.field6, Statics.field15);
                class242.method3090(Statics.field6, Statics.field15);
                class86.field1167 = class225.field2995;
                class86.field1178 = 60;
                field659 = 80;
            } else {
                class86.field1167 = class225.field2852 + Statics.field6.method3897() + "%";
                class86.field1178 = 60;
            }
        } else if (field659 == 80) {
            int var54 = 0;
            if (Statics.field46 == null) {
                Statics.field46 = Statics.method4026(Statics.field15, Statics.field512.field3802, 0);
            } else {
                var54++;
            }
            if (Statics.field339 == null) {
                Statics.field339 = Statics.method4026(Statics.field15, Statics.field512.field3804, 0);
            } else {
                var54++;
            }
            if (Statics.field1995 == null) {
                class236 var55 = Statics.field15;
                int var56 = Statics.field512.field3801;
                class324[] var57;
                if (class326.method4199(var55, var56, 0)) {
                    class324[] var58 = new class324[Statics.field3879];
                    for (int var59 = 0; var59 < Statics.field3879; var59++) {
                        class324 var60 = var58[var59] = new class324();
                        var60.field3859 = Statics.field3876;
                        var60.field3863 = Statics.field3877;
                        var60.field3862 = Statics.field3878[var59];
                        var60.field3861 = Statics.field3880[var59];
                        var60.field3860 = Statics.field3818[var59];
                        var60.field3857 = Statics.field3881[var59];
                        var60.field3856 = Statics.field3524;
                        var60.field3858 = Statics.field3638[var59];
                    }
                    class326.method1082();
                    var57 = var58;
                } else {
                    var57 = null;
                }
                Statics.field1995 = var57;
            } else {
                var54++;
            }
            if (Statics.field2736 == null) {
                Statics.field2736 = class326.method118(Statics.field15, Statics.field512.field3803, 0);
            } else {
                var54++;
            }
            if (Statics.field1093 == null) {
                Statics.field1093 = class326.method118(Statics.field15, Statics.field512.field3799, 0);
            } else {
                var54++;
            }
            if (Statics.field92 == null) {
                Statics.field92 = class326.method118(Statics.field15, Statics.field512.field3808, 0);
            } else {
                var54++;
            }
            if (Statics.field2513 == null) {
                Statics.field2513 = class326.method118(Statics.field15, Statics.field512.field3805, 0);
            } else {
                var54++;
            }
            if (Statics.field3365 == null) {
                Statics.field3365 = class326.method118(Statics.field15, Statics.field512.field3806, 0);
            } else {
                var54++;
            }
            if (Statics.field229 == null) {
                Statics.field229 = class326.method118(Statics.field15, Statics.field512.field3807, 0);
            } else {
                var54++;
            }
            if (Statics.field544 == null) {
                class236 var62 = Statics.field15;
                int var63 = Statics.field512.field3800;
                class324[] var64;
                if (class326.method4199(var62, var63, 0)) {
                    class324[] var65 = new class324[Statics.field3879];
                    for (int var66 = 0; var66 < Statics.field3879; var66++) {
                        class324 var67 = var65[var66] = new class324();
                        var67.field3859 = Statics.field3876;
                        var67.field3863 = Statics.field3877;
                        var67.field3862 = Statics.field3878[var66];
                        var67.field3861 = Statics.field3880[var66];
                        var67.field3860 = Statics.field3818[var66];
                        var67.field3857 = Statics.field3881[var66];
                        var67.field3856 = Statics.field3524;
                        var67.field3858 = Statics.field3638[var66];
                    }
                    class326.method1082();
                    var64 = var65;
                } else {
                    var64 = null;
                }
                Statics.field544 = var64;
            } else {
                var54++;
            }
            if (Statics.field342 == null) {
                class236 var69 = Statics.field15;
                int var70 = Statics.field512.field3809;
                class324[] var71;
                if (class326.method4199(var69, var70, 0)) {
                    class324[] var72 = new class324[Statics.field3879];
                    for (int var73 = 0; var73 < Statics.field3879; var73++) {
                        class324 var74 = var72[var73] = new class324();
                        var74.field3859 = Statics.field3876;
                        var74.field3863 = Statics.field3877;
                        var74.field3862 = Statics.field3878[var73];
                        var74.field3861 = Statics.field3880[var73];
                        var74.field3860 = Statics.field3818[var73];
                        var74.field3857 = Statics.field3881[var73];
                        var74.field3856 = Statics.field3524;
                        var74.field3858 = Statics.field3638[var73];
                    }
                    class326.method1082();
                    var71 = var72;
                } else {
                    var71 = null;
                }
                Statics.field342 = var71;
            } else {
                var54++;
            }
            if (var54 < 11) {
                class86.field1167 = class225.field2770 + var54 * 100 / 12 + "%";
                class86.field1178 = 70;
            } else {
                Statics.field3669 = Statics.field342;
                Statics.field339.method5643();
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 21.0D) - 10;
                int var78 = (int) (Math.random() * 21.0D) - 10;
                int var79 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1995[0].method5622(var76 + var79, var77 + var79, var78 + var79);
                class86.field1167 = class225.field2753;
                class86.field1178 = 70;
                field659 = 90;
            }
        } else if (field659 == 90) {
            if (Statics.field320.method3827()) {
                Statics.field88 = new class120(Statics.field320, Statics.field15, 20, 0.8D, field846 ? 64 : 128);
                class131.method2765(Statics.field88);
                class131.method2780(0.8D);
                field659 = 100;
            } else {
                class86.field1167 = class225.field2771 + "0%";
                class86.field1178 = 90;
            }
        } else if (field659 == 100) {
            int var80 = Statics.field88.method2519();
            if (var80 < 100) {
                class86.field1167 = class225.field2771 + var80 + "%";
                class86.field1178 = 90;
            } else {
                class86.field1167 = class225.field2773;
                class86.field1178 = 90;
                field659 = 110;
            }
        } else if (field659 == 110) {
            Statics.field2081 = new class64();
            Statics.field449.method3159(Statics.field2081, 10);
            class86.field1167 = class225.field2774;
            class86.field1178 = 92;
            field659 = 120;
        } else if (field659 == 120) {
            if (Statics.field3077.method3771("huffman", "")) {
                class206 var81 = new class206(Statics.field3077.method3773("huffman", ""));
                class207.method3023(var81);
                class86.field1167 = class225.field2776;
                class86.field1178 = 94;
                field659 = 130;
            } else {
                class86.field1167 = class225.field2775 + "%";
                class86.field1178 = 94;
            }
        } else if (field659 == 130) {
            if (!Statics.field332.method3827()) {
                class86.field1167 = class225.field2777 + Statics.field332.method3897() * 4 / 5 + "%";
                class86.field1178 = 96;
            } else if (!Statics.field1398.method3827()) {
                class86.field1167 = class225.field2777 + (80 + Statics.field1398.method3897() / 6) + "%";
                class86.field1178 = 96;
            } else if (Statics.field268.method3827()) {
                class86.field1167 = class225.field2778;
                class86.field1178 = 98;
                field659 = 140;
            } else {
                class86.field1167 = class225.field2777 + (96 + Statics.field268.method3897() / 50) + "%";
                class86.field1178 = 96;
            }
        } else if (field659 == 140) {
            class86.field1178 = 100;
            if (Statics.field2380.method3774(class36.field292.field286)) {
                if (Statics.field36 == null) {
                    Statics.field36 = new class333();
                    Statics.field36.method5853(Statics.field2380, Statics.field147, Statics.field1936, Statics.field59, field681, Statics.field1995);
                }
                class86.field1167 = class225.field2797;
                field659 = 150;
            } else {
                class86.field1167 = class225.field2779 + Statics.field2380.method3776(class36.field292.field286) / 10 + "%";
            }
        } else if (field659 == 150) {
            method3347(10);
        }
    }

    @ObfuscatedName("ap.fy(IZZZI)Lif;")
    public static class236 method722(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2022 != null) {
            var4 = new class308(arg0, class168.field2022, Statics.field1153[arg0], 1000000);
        }
        return new class236(var4, Statics.field165, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fu(I)V")
    public final void method1552() {
        class305 var1 = field668.method2103();
        class299 var2 = field668.field1290;
        try {
            if (field663 == 0) {
                if (Statics.field1189 == null && (field870.method1952() || field664 > 250)) {
                    Statics.field1189 = field870.method1949();
                    field870.method1947();
                    field870 = null;
                }
                if (Statics.field1189 != null) {
                    if (var1 != null) {
                        var1.method3191();
                        var1 = null;
                    }
                    Statics.field1141 = null;
                    field678 = false;
                    field664 = 0;
                    field663 = 1;
                }
            }
            if (field663 == 1) {
                if (Statics.field1141 == null) {
                    Statics.field1141 = Statics.field449.method3158(Statics.field2071, Statics.field331);
                }
                if (Statics.field1141.field2010 == 2) {
                    throw new IOException();
                }
                if (Statics.field1141.field2010 == 1) {
                    if (field728) {
                        var1 = class305.method4810((Socket) Statics.field1141.field2015, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field1141.field2015, Statics.field449, 5000);
                    }
                    field668.method2100(var1);
                    Statics.field1141 = null;
                    field663 = 2;
                }
            }
            if (field663 == 2) {
                field668.method2101();
                class182 var3;
                if (class182.field2308 == 0) {
                    var3 = new class182();
                } else {
                    var3 = class182.field2304[--class182.field2308];
                }
                var3.field2305 = null;
                var3.field2306 = 0;
                var3.field2303 = new class299(5000);
                var3.field2303.method5094(class179.field2283.field2281);
                field668.method2084(var3);
                field668.method2083();
                var2.field3703 = 0;
                field663 = 3;
            }
            if (field663 == 3) {
                if (Statics.field1964 != null) {
                    Statics.field1964.method2258();
                }
                if (Statics.field2050 != null) {
                    Statics.field2050.method2258();
                }
                boolean var7 = true;
                if (field728 && !var1.method3194(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3215();
                    if (Statics.field1964 != null) {
                        Statics.field1964.method2258();
                    }
                    if (Statics.field2050 != null) {
                        Statics.field2050.method2258();
                    }
                    if (var8 != 0) {
                        method3012(var8);
                        return;
                    }
                    var2.field3703 = 0;
                    field663 = 4;
                }
            }
            if (field663 == 4) {
                if (var2.field3703 < 8) {
                    int var9 = var1.method3193();
                    if (var9 > 8 - var2.field3703) {
                        var9 = 8 - var2.field3703;
                    }
                    if (var9 > 0) {
                        var1.method3195(var2.field3704, var2.field3703, var9);
                        var2.field3703 += var9;
                    }
                }
                if (var2.field3703 == 8) {
                    var2.field3703 = 0;
                    Statics.field5 = var2.method5116();
                    field663 = 5;
                }
            }
            if (field663 == 5) {
                field668.field1290.field3703 = 0;
                field668.method2101();
                class299 var10 = new class299(500);
                int[] var11 = new int[] { Statics.field1189.nextInt(), Statics.field1189.nextInt(), Statics.field1189.nextInt(), Statics.field1189.nextInt() };
                var10.field3703 = 0;
                var10.method5094(1);
                var10.method5097(var11[0]);
                var10.method5097(var11[1]);
                var10.method5097(var11[2]);
                var10.method5097(var11[3]);
                var10.method5137(Statics.field5);
                if (field645 == 40) {
                    var10.method5097(Statics.field627[0]);
                    var10.method5097(Statics.field627[1]);
                    var10.method5097(Statics.field627[2]);
                    var10.method5097(Statics.field627[3]);
                } else {
                    var10.method5094(field744.method28());
                    switch(field744.field1988) {
                        case 0:
                        case 1:
                            var10.method5138(Statics.field3518);
                            var10.field3703++;
                            break;
                        case 2:
                            var10.method5097((Integer) Statics.field1071.field1033.get(class291.method3026(class86.field1175)));
                            break;
                        case 3:
                            var10.field3703 += 4;
                    }
                    var10.method5094(class313.field3814.method28());
                    var10.method5101(class86.field1176);
                }
                var10.method5133(class84.field1145, class84.field1143);
                Statics.field627 = var11;
                class182 var12;
                if (class182.field2308 == 0) {
                    var12 = new class182();
                } else {
                    var12 = class182.field2304[--class182.field2308];
                }
                var12.field2305 = null;
                var12.field2306 = 0;
                var12.field2303 = new class299(5000);
                var12.field2303.field3703 = 0;
                if (field645 == 40) {
                    var12.field2303.method5094(class179.field2284.field2281);
                } else {
                    var12.field2303.method5094(class179.field2286.field2281);
                }
                var12.field2303.method5095(0);
                int var16 = var12.field2303.field3703;
                var12.field2303.method5097(187);
                var12.field2303.method5097(1);
                var12.field2303.method5094(field737);
                var12.field2303.method5104(var10.field3704, 0, var10.field3703);
                int var17 = var12.field2303.field3703;
                var12.field2303.method5101(class86.field1175);
                var12.field2303.method5094((field843 ? 1 : 0) << 1 | (field846 ? 1 : 0));
                var12.field2303.method5095(Statics.field45);
                var12.field2303.method5095(Statics.field1152);
                class299 var18 = var12.field2303;
                if (field670 == null) {
                    byte[] var19 = class168.method1892();
                    var18.method5104(var19, 0, var19.length);
                } else {
                    var18.method5104(field670, 0, field670.length);
                }
                var12.field2303.method5101(Statics.field1944);
                var12.field2303.method5097(Statics.field565);
                class300 var20 = new class300(Statics.field354.method5830());
                Statics.field354.method5829(var20);
                var12.field2303.method5104(var20.field3704, 0, var20.field3704.length);
                var12.field2303.method5094(field737);
                var12.field2303.method5097(0);
                var12.field2303.method5097(Statics.field2275.field3104);
                var12.field2303.method5097(Statics.field3423.field3104);
                var12.field2303.method5097(Statics.field6.field3104);
                var12.field2303.method5097(Statics.field332.field3104);
                var12.field2303.method5097(Statics.field1593.field3104);
                var12.field2303.method5097(Statics.field141.field3104);
                var12.field2303.method5097(Statics.field26.field3104);
                var12.field2303.method5097(Statics.field564.field3104);
                var12.field2303.method5097(Statics.field15.field3104);
                var12.field2303.method5097(Statics.field320.field3104);
                var12.field2303.method5097(Statics.field3077.field3104);
                var12.field2303.method5097(Statics.field404.field3104);
                var12.field2303.method5097(Statics.field1398.field3104);
                var12.field2303.method5097(Statics.field268.field3104);
                var12.field2303.method5097(Statics.field1489.field3104);
                var12.field2303.method5097(Statics.field49.field3104);
                var12.field2303.method5097(0);
                var12.field2303.method5097(Statics.field72.field3104);
                var12.field2303.method5097(Statics.field147.field3104);
                var12.field2303.method5097(Statics.field2380.field3104);
                var12.field2303.method5097(Statics.field1936.field3104);
                var12.field2303.method5131(var11, var17, var12.field2303.field3703);
                var12.field2303.method5106(var12.field2303.field3703 - var16);
                field668.method2084(var12);
                field668.method2083();
                field668.field1294 = new class328(var11);
                int[] var21 = new int[4];
                for (int var22 = 0; var22 < 4; var22++) {
                    var21[var22] = var11[var22] + 50;
                }
                var2.method5072(var21);
                field663 = 6;
            }
            if (field663 == 6 && var1.method3193() > 0) {
                int var23 = var1.method3215();
                if (var23 == 21 && field645 == 20) {
                    field663 = 9;
                } else if (var23 == 2) {
                    field663 = 11;
                } else if (var23 == 15 && field645 == 40) {
                    field668.field1296 = -1;
                    field663 = 16;
                } else if (var23 == 64) {
                    field663 = 7;
                } else if (var23 == 23 && field741 < 1) {
                    field741++;
                    field663 = 0;
                } else if (var23 == 29) {
                    field663 = 14;
                } else {
                    method3012(var23);
                    return;
                }
            }
            if (field663 == 7 && var1.method3193() > 0) {
                Statics.field3567 = var1.method3215();
                field663 = 8;
            }
            if (field663 == 8 && var1.method3193() >= Statics.field3567) {
                var1.method3195(var2.field3704, 0, Statics.field3567);
                var2.field3703 = 0;
                field663 = 6;
            }
            if (field663 == 9 && var1.method3193() > 0) {
                field666 = (var1.method3215() + 3) * 60;
                field663 = 10;
            }
            if (field663 == 10) {
                field664 = 0;
                class86.method242(class225.field2786, class225.field2913, field666 / 60 + class225.field2796);
                if (--field666 <= 0) {
                    field663 = 0;
                }
            } else {
                if (field663 == 11 && var1.method3193() >= 1) {
                    Statics.field483 = var1.method3215();
                    field663 = 12;
                }
                if (field663 == 12 && var1.method3193() >= Statics.field483) {
                    boolean var24 = var1.method3215() == 1;
                    var1.method3195(var2.field3704, 0, 4);
                    var2.field3703 = 0;
                    boolean var25 = false;
                    if (var24) {
                        int var26 = var2.method5058() << 24;
                        int var27 = var26 | var2.method5058() << 16;
                        int var28 = var27 | var2.method5058() << 8;
                        int var29 = var28 | var2.method5058();
                        int var30 = class291.method3026(class86.field1175);
                        if (Statics.field1071.field1033.size() >= 10 && !Statics.field1071.field1033.containsKey(var30)) {
                            Iterator var31 = Statics.field1071.field1033.entrySet().iterator();
                            var31.next();
                            var31.remove();
                        }
                        Statics.field1071.field1033.put(var30, var29);
                    }
                    if (field773) {
                        Statics.field1071.field1031 = class86.field1175;
                    } else {
                        Statics.field1071.field1031 = null;
                    }
                    class74.method1733();
                    field798 = var1.method3215();
                    field716 = var1.method3215() == 1;
                    field676 = var1.method3215();
                    field676 <<= 0x8;
                    field676 += var1.method3215();
                    field747 = var1.method3215();
                    var1.method3195(var2.field3704, 0, 1);
                    var2.field3703 = 0;
                    class177[] var32 = class177.method3148();
                    int var33 = var2.method5087();
                    if (var33 < 0 || var33 >= var32.length) {
                        throw new IOException(var33 + " " + var2.field3703);
                    }
                    field668.field1303 = var32[var33];
                    field668.field1296 = field668.field1303.field2104;
                    var1.method3195(var2.field3704, 0, 2);
                    var2.field3703 = 0;
                    field668.field1296 = var2.method5112();
                    try {
                        client var34 = Statics.field2488;
                        JSObject.getWindow(var34).call("zap", (Object[]) null);
                    } catch (Throwable var52) {
                    }
                    field663 = 13;
                }
                if (field663 != 13) {
                    if (field663 == 14 && var1.method3193() >= 2) {
                        var2.field3703 = 0;
                        var1.method3195(var2.field3704, 0, 2);
                        var2.field3703 = 0;
                        Statics.field196 = var2.method5112();
                        field663 = 15;
                    }
                    if (field663 == 15 && var1.method3193() >= Statics.field196) {
                        var2.field3703 = 0;
                        var1.method3195(var2.field3704, 0, Statics.field196);
                        var2.field3703 = 0;
                        String var47 = var2.method5119();
                        String var48 = var2.method5119();
                        String var49 = var2.method5119();
                        class86.method242(var47, var48, var49);
                        method3347(10);
                    }
                    if (field663 == 16) {
                        if (field668.field1296 == -1) {
                            if (var1.method3193() < 2) {
                                return;
                            }
                            var1.method3195(var2.field3704, 0, 2);
                            var2.field3703 = 0;
                            field668.field1296 = var2.method5112();
                        }
                        if (var1.method3193() >= field668.field1296) {
                            var1.method3195(var2.field3704, 0, field668.field1296);
                            var2.field3703 = 0;
                            int var50 = field668.field1296;
                            field680.method4628();
                            method1852();
                            class90.method1855(var2);
                            if (var2.field3703 != var50) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field664++;
                        if (field664 > 2000) {
                            if (field741 < 1) {
                                if (Statics.field331 == Statics.field2394) {
                                    Statics.field331 = Statics.field571;
                                } else {
                                    Statics.field331 = Statics.field2394;
                                }
                                field741++;
                                field663 = 0;
                            } else {
                                method3012(-3);
                            }
                        }
                    }
                } else if (var1.method3193() >= field668.field1296) {
                    var2.field3703 = 0;
                    var1.method3195(var2.field3704, 0, field668.field1296);
                    field680.method4645();
                    field642 = 1L;
                    Statics.field2081.field566 = 0;
                    Statics.field428 = true;
                    field646 = true;
                    field853 = -1L;
                    class118.method127();
                    field668.method2101();
                    field668.field1290.field3703 = 0;
                    field668.field1303 = null;
                    field668.field1301 = null;
                    field668.field1302 = null;
                    field668.field1300 = null;
                    field668.field1296 = 0;
                    field668.field1299 = 0;
                    field844 = 0;
                    field733 = 0;
                    field637 = 0;
                    method589();
                    class54.field460 = 0;
                    class92.method964();
                    field673 = 0;
                    field784 = false;
                    field754 = 0;
                    field699 = 0;
                    field704 = 0;
                    Statics.field2535 = null;
                    field867 = 0;
                    field854 = -1;
                    field819 = 0;
                    field800 = 0;
                    field657 = class85.field1147;
                    field658 = class85.field1147;
                    field672 = 0;
                    class90.method1663();
                    for (int var36 = 0; var36 < 2048; var36++) {
                        field745[var36] = null;
                    }
                    for (int var37 = 0; var37 < 32768; var37++) {
                        field762[var37] = null;
                    }
                    field756 = -1;
                    field759.method4525();
                    field760.method4525();
                    for (int var38 = 0; var38 < 4; var38++) {
                        for (int var39 = 0; var39 < 104; var39++) {
                            for (int var40 = 0; var40 < 104; var40++) {
                                field817[var38][var39][var40] = null;
                            }
                        }
                    }
                    field758 = new class262();
                    Statics.field586.method1681();
                    for (int var41 = 0; var41 < Statics.field3179; var41++) {
                        class241 var42 = class241.method3055(var41);
                        if (var42 != null) {
                            class213.field2510[var41] = 0;
                            class213.field2511[var41] = 0;
                        }
                    }
                    Statics.field2005.method1984();
                    field813 = -1;
                    if (field789 != -1) {
                        class218.method4328(field789);
                    }
                    for (class62 var43 = (class62) field790.method5501(); var43 != null; var43 = (class62) field790.method5500()) {
                        method3969(var43, true);
                    }
                    field789 = -1;
                    field790 = new class318(8);
                    field795 = null;
                    method589();
                    field893.method3631((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var44 = 0; var44 < 8; var44++) {
                        field766[var44] = null;
                        field644[var44] = false;
                    }
                    class60.field522 = new class318(32);
                    field640 = true;
                    for (int var45 = 0; var45 < 100; var45++) {
                        field834[var45] = true;
                    }
                    method3718();
                    Statics.field2499 = null;
                    for (int var46 = 0; var46 < 8; var46++) {
                        field897[var46] = new class10();
                    }
                    Statics.field1271 = null;
                    class90.method1855(var2);
                    Statics.field48 = -1;
                    method1011(false, var2);
                    field668.field1303 = null;
                }
            }
        } catch (IOException var53) {
            if (field741 < 1) {
                if (Statics.field331 == Statics.field2394) {
                    Statics.field331 = Statics.field571;
                } else {
                    Statics.field331 = Statics.field2394;
                }
                field741++;
                field663 = 0;
            } else {
                method3012(-2);
            }
        }
    }

    @ObfuscatedName("bt.fl(I)V")
    public static void method1852() {
        field668.method2101();
        field668.field1290.field3703 = 0;
        field668.field1303 = null;
        field668.field1301 = null;
        field668.field1302 = null;
        field668.field1300 = null;
        field668.field1296 = 0;
        field668.field1299 = 0;
        field844 = 0;
        method589();
        field867 = 0;
        field819 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field745[var0] = null;
        }
        Statics.field585 = null;
        for (int var1 = 0; var1 < field762.length; var1++) {
            class80 var2 = field762[var1];
            if (var2 != null) {
                var2.field949 = -1;
                var2.field950 = false;
            }
        }
        class60.field522 = new class318(32);
        method3347(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field834[var3] = true;
        }
        method3718();
    }

    @ObfuscatedName("ew.fr(IB)V")
    public static void method3012(int arg0) {
        if (arg0 == -3) {
            class86.method242(class225.field2788, class225.field2892, class225.field3019);
        } else if (arg0 == -2) {
            class86.method242(class225.field2792, class225.field2793, class225.field2794);
        } else if (arg0 == -1) {
            class86.method242(class225.field2999, class225.field2989, class225.field2988);
        } else if (arg0 == 3) {
            class86.field1170 = 3;
            class86.field1182 = 1;
        } else if (arg0 == 4) {
            class86.field1170 = 12;
            class86.field1168 = 0;
        } else if (arg0 == 5) {
            class86.field1182 = 2;
            class86.method242(class225.field2801, class225.field2923, class225.field2803);
        } else if (arg0 == 68 || !(field801 || arg0 != 6)) {
            class86.method242(class225.field2804, class225.field2763, class225.field2854);
        } else if (arg0 == 7) {
            class86.method242(class225.field3014, class225.field2808, class225.field2809);
        } else if (arg0 == 8) {
            class86.method242(class225.field2810, class225.field2837, class225.field2812);
        } else if (arg0 == 9) {
            class86.method242(class225.field2813, class225.field2938, class225.field2815);
        } else if (arg0 == 10) {
            class86.method242(class225.field2816, class225.field2817, class225.field2922);
        } else if (arg0 == 11) {
            class86.method242(class225.field3001, class225.field2780, class225.field2821);
        } else if (arg0 == 12) {
            class86.method242(class225.field2822, class225.field2823, class225.field2824);
        } else if (arg0 == 13) {
            class86.method242(class225.field2825, class225.field2840, class225.field2827);
        } else if (arg0 == 14) {
            class86.method242(class225.field3032, class225.field2829, class225.field2910);
        } else if (arg0 == 16) {
            class86.method242(class225.field2831, class225.field2832, class225.field2833);
        } else if (arg0 == 17) {
            class86.method242(class225.field2834, class225.field2930, class225.field2791);
        } else if (arg0 == 18) {
            class86.field1170 = 12;
            class86.field1168 = 1;
        } else if (arg0 == 19) {
            class86.method242(class225.field2916, class225.field2841, class225.field2842);
        } else if (arg0 == 20) {
            class86.method242(class225.field2843, class225.field2844, class225.field2845);
        } else if (arg0 == 22) {
            class86.method242(class225.field2846, class225.field2937, class225.field2898);
        } else if (arg0 == 23) {
            class86.method242(class225.field2849, class225.field2850, class225.field2851);
        } else if (arg0 == 24) {
            class86.method242(class225.field2917, class225.field2853, class225.field2919);
        } else if (arg0 == 25) {
            class86.method242(class225.field2855, class225.field2856, class225.field2857);
        } else if (arg0 == 26) {
            class86.method242(class225.field2908, class225.field2859, class225.field2994);
        } else if (arg0 == 27) {
            class86.method242(class225.field2861, class225.field2862, class225.field2863);
        } else if (arg0 == 31) {
            class86.method242(class225.field3043, class225.field2871, class225.field2872);
        } else if (arg0 == 32) {
            class86.method242(class225.field2873, class225.field2874, class225.field2875);
        } else if (arg0 == 37) {
            class86.method242(class225.field2876, class225.field2877, class225.field2878);
        } else if (arg0 == 38) {
            class86.method242(class225.field2949, class225.field2987, class225.field2881);
        } else if (arg0 == 55) {
            class86.field1170 = 8;
        } else if (arg0 == 56) {
            class86.method242(class225.field2886, class225.field2957, class225.field2888);
            method3347(11);
            return;
        } else if (arg0 == 57) {
            class86.method242(class225.field2889, class225.field3031, class225.field2891);
            method3347(11);
            return;
        } else if (arg0 == 61) {
            class86.field1170 = 7;
        } else {
            class86.method242(class225.field3011, class225.field2893, class225.field2894);
        }
        method3347(10);
    }

    @ObfuscatedName("bz.fs(I)V")
    public static final void method1031() {
        field668.method2086();
        method1887();
        Statics.field86.method2834();
        for (int var0 = 0; var0 < 4; var0++) {
            field687[var0].method3227();
        }
        System.gc();
        class198.method3013(2);
        field726 = -1;
        field768 = false;
        class76.method212();
        method3347(10);
    }

    @ObfuscatedName("l.fg(II)V")
    public static final void method156(int arg0) {
        method1031();
        switch(arg0) {
            case 1:
                class86.field1170 = 24;
                class86.method242(class225.field2984, class225.field2811, class225.field2976);
                break;
            case 2:
                class86.field1170 = 24;
                class86.method242(class225.field2746, class225.field2890, class225.field2982);
        }
    }

    @ObfuscatedName("cj.fc(I)V")
    public static final void method1887() {
        class258.method3283();
        class245.field3227.method3102();
        class246.field3236.method3102();
        class254.method3319();
        class257.method3918();
        class255.method963();
        class259.method4882();
        class244.method3349();
        class249.method3564();
        class241.method1588();
        class253.field3293.method3102();
        class253.field3294.method3102();
        class253.field3295.method3102();
        class247.method3737();
        class251.method126();
        class250.method159();
        class242.field3185.method3102();
        class215.method135();
        class218.field2546.method3102();
        class218.field2547.method3102();
        class218.field2678.method3102();
        class218.field2549.method3102();
        ((class120) Statics.field1747).method2521();
        class93.field1263.method3102();
        Statics.field2275.method3823();
        Statics.field3423.method3823();
        Statics.field332.method3823();
        Statics.field1593.method3823();
        Statics.field141.method3823();
        Statics.field26.method3823();
        Statics.field564.method3823();
        Statics.field15.method3823();
        Statics.field320.method3823();
        Statics.field3077.method3823();
        Statics.field404.method3823();
        Statics.field1398.method3823();
    }

    @ObfuscatedName("hq.fa(I)V")
    public static final void method3746() {
        if (field733 > 0) {
            method1031();
        } else {
            field680.method4633();
            method3347(40);
            Statics.field1731 = field668.method2103();
            field668.method2087();
        }
    }

    @ObfuscatedName("ao.fp(ZI)V")
    public static final void method515(boolean arg0) {
        if (arg0) {
            field744 = class86.field1179 ? class161.field1985 : class161.field1987;
        } else {
            field744 = Statics.field1071.field1033.containsKey(class291.method3026(class86.field1175)) ? class161.field1989 : class161.field1986;
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1387() {
        if (field844 > 1) {
            field844--;
        }
        if (field733 > 0) {
            field733--;
        }
        if (field678) {
            field678 = false;
            method3746();
            return;
        }
        if (!field901) {
            method1577();
        }
        for (int var1 = 0; var1 < 100 && this.method1159(field668); var1++) {
        }
        if (field645 != 30) {
            return;
        }
        while (class118.method3589()) {
            class182 var2 = class182.method19(class178.field2188, field668.field1294);
            var2.field2303.method5094(0);
            int var3 = var2.field2303.field3703;
            class118.method1028(var2.field2303);
            var2.field2303.method5093(var2.field2303.field3703 - var3);
            field668.method2084(var2);
        }
        if (field680.field3556) {
            class182 var4 = class182.method19(class178.field2196, field668.field1294);
            var4.field2303.method5094(0);
            int var5 = var4.field2303.field3703;
            field680.method4629(var4.field2303);
            var4.field2303.method5093(var4.field2303.field3703 - var5);
            field668.method2084(var4);
            field680.method4647();
        }
        Object var6 = Statics.field2081.field572;
        synchronized (Statics.field2081.field572) {
            if (!field896) {
                Statics.field2081.field566 = 0;
            } else if (class54.field473 != 0 || Statics.field2081.field566 >= 40) {
                class182 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2081.field566 && (var7 == null || var7.field2303.field3703 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2081.field568[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2081.field567[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field643 != var14 || field682 != var13) {
                        if (var7 == null) {
                            var7 = class182.method19(class178.field2226, field668.field1294);
                            var7.field2303.method5094(0);
                            var8 = var7.field2303.field3703;
                            var7.field2303.field3703 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field729 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field643;
                            var16 = var13 - field682;
                            var17 = (int) ((Statics.field2081.field569[var12] - field729) / 20L);
                            var10 = (int) ((Statics.field2081.field569[var12] - field729) % 20L + (long) var10);
                        }
                        field643 = var14;
                        field682 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2303.method5095((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2303.method5094(var17 + 128);
                            var7.field2303.method5095((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2303.method5094(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2303.method5097(Integer.MIN_VALUE);
                            } else {
                                var7.field2303.method5097(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2303.method5095((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2303.method5097(Integer.MIN_VALUE);
                            } else {
                                var7.field2303.method5097(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field729 = Statics.field2081.field569[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2303.method5093(var7.field2303.field3703 - var8);
                    int var18 = var7.field2303.field3703;
                    var7.field2303.field3703 = var8;
                    var7.field2303.method5094(var10 / var11);
                    var7.field2303.method5094(var10 % var11);
                    var7.field2303.field3703 = var18;
                    field668.method2084(var7);
                }
                if (var9 >= Statics.field2081.field566) {
                    Statics.field2081.field566 = 0;
                } else {
                    Statics.field2081.field566 -= var9;
                    System.arraycopy(Statics.field2081.field567, var9, Statics.field2081.field567, 0, Statics.field2081.field566);
                    System.arraycopy(Statics.field2081.field568, var9, Statics.field2081.field568, 0, Statics.field2081.field566);
                    System.arraycopy(Statics.field2081.field569, var9, Statics.field2081.field569, 0, Statics.field2081.field566);
                }
            }
        }
        if (class54.field473 == 1 || !Statics.field3102 && class54.field473 == 4 || class54.field473 == 2) {
            long var20 = class54.field471 - field642 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field642 = class54.field471 * -1L;
            int var22 = class54.field475;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1152) {
                var22 = Statics.field1152;
            }
            int var23 = class54.field474;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field45) {
                var23 = Statics.field45;
            }
            int var24 = (int) var20;
            class182 var25 = class182.method19(class178.field2242, field668.field1294);
            var25.field2303.method5095((var24 << 1) + (class54.field473 == 2 ? 1 : 0));
            var25.field2303.method5095(var23);
            var25.field2303.method5095(var22);
            field668.method2084(var25);
        }
        if (class45.field378 > 0) {
            class182 var26 = class182.method19(class178.field2203, field668.field1294);
            var26.field2303.method5095(0);
            int var27 = var26.field2303.field3703;
            long var28 = class297.method481();
            for (int var30 = 0; var30 < class45.field378; var30++) {
                long var31 = var28 - field853;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field853 = var28;
                var26.field2303.method5136(class45.field377[var30]);
                var26.field2303.method5153((int) var31);
            }
            var26.field2303.method5106(var26.field2303.field3703 - var27);
            field668.method2084(var26);
        }
        if (field713 > 0) {
            field713--;
        }
        if (class45.field367[96] || class45.field367[97] || class45.field367[98] || class45.field367[99]) {
            field714 = true;
        }
        if (field714 && field713 <= 0) {
            field713 = 20;
            field714 = false;
            class182 var33 = class182.method19(class178.field2194, field668.field1294);
            var33.field2303.method5146(field699);
            var33.field2303.method5146(field698);
            field668.method2084(var33);
        }
        if (Statics.field428 && !field646) {
            field646 = true;
            class182 var34 = class182.method19(class178.field2230, field668.field1294);
            var34.field2303.method5094(1);
            field668.method2084(var34);
        }
        if (!Statics.field428 && field646) {
            field646 = false;
            class182 var35 = class182.method19(class178.field2230, field668.field1294);
            var35.field2303.method5094(0);
            field668.method2084(var35);
        }
        if (Statics.field36 != null) {
            Statics.field36.method5854();
        }
        method2057();
        method2291();
        if (field645 != 30) {
            return;
        }
        for (class69 var36 = (class69) field758.method4540(); var36 != null; var36 = (class69) field758.method4533()) {
            if (var36.field907 > 0) {
                var36.field907--;
            }
            if (var36.field907 != 0) {
                if (var36.field917 > 0) {
                    var36.field917--;
                }
                if (var36.field917 == 0 && var36.field909 >= 1 && var36.field910 >= 1 && var36.field909 <= 102 && var36.field910 <= 102 && (var36.field918 < 0 || class57.method4159(var36.field918, var36.field919))) {
                    method4008(var36.field914, var36.field908, var36.field909, var36.field910, var36.field918, var36.field915, var36.field919);
                    var36.field917 = -1;
                    if (var36.field918 == var36.field916 && var36.field916 == -1) {
                        var36.method3292();
                    } else if (var36.field918 == var36.field916 && var36.field915 == var36.field912 && var36.field919 == var36.field913) {
                        var36.method3292();
                    }
                }
            } else if (var36.field916 < 0 || class57.method4159(var36.field916, var36.field913)) {
                method4008(var36.field914, var36.field908, var36.field909, var36.field910, var36.field916, var36.field912, var36.field913);
                var36.method3292();
            }
        }
        method483();
        field668.field1299++;
        if (field668.field1299 > 750) {
            method3746();
            return;
        }
        int var37 = class90.field1234;
        int[] var38 = class90.field1235;
        for (int var39 = 0; var39 < var37; var39++) {
            class67 var40 = field745[var38[var39]];
            if (var40 != null) {
                method1080(var40, 1);
            }
        }
        for (int var41 = 0; var41 < field672; var41++) {
            int var42 = field905[var41];
            class80 var43 = field762[var42];
            if (var43 != null) {
                method1080(var43, var43.field1106.field3435);
            }
        }
        method4622();
        field691++;
        if (field830 != 0) {
            field732 += 20;
            if (field732 >= 400) {
                field830 = 0;
            }
        }
        if (Statics.field2373 != null) {
            field765++;
            if (field765 >= 15) {
                method3272(Statics.field2373);
                Statics.field2373 = null;
            }
        }
        class218 var44 = Statics.field103;
        class218 var45 = Statics.field91;
        Statics.field103 = null;
        Statics.field91 = null;
        field806 = null;
        field810 = false;
        field807 = false;
        field850 = 0;
        while (class45.method695() && field850 < 128) {
            if (field798 >= 2 && class45.field367[82] && Statics.field1733 == 66) {
                String var46 = "";
                Iterator var47 = class92.field1256.iterator();
                while (var47.hasNext()) {
                    class65 var48 = (class65) var47.next();
                    var46 = var46 + var48.field579 + ':' + var48.field584 + '\n';
                }
                Statics.field2488.method910(var46);
            } else if (field704 != 1 || Statics.field1522 <= 0) {
                field852[field850] = Statics.field1733;
                field851[field850] = Statics.field1522;
                field850++;
            }
        }
        boolean var51 = field798 >= 2;
        if (var51 && class45.field367[82] && class45.field367[81] && field827 != 0) {
            int var52 = Statics.field585.field613 - field827;
            if (var52 < 0) {
                var52 = 0;
            } else if (var52 > 3) {
                var52 = 3;
            }
            if (Statics.field585.field613 != var52) {
                int var53 = Statics.field2477 + Statics.field585.field978[0];
                int var54 = Statics.field562 + Statics.field585.field979[0];
                class182 var55 = class182.method19(class178.field2252, field668.field1294);
                var55.field2303.method5145(var53);
                var55.field2303.method5155(0);
                var55.field2303.method5145(var54);
                var55.field2303.method5136(var52);
                field668.method2084(var55);
            }
            field827 = 0;
        }
        if (field789 != -1) {
            method5261(field789, 0, 0, Statics.field45, Statics.field1152, 0, 0);
        }
        field814++;
        while (true) {
            class63 var56;
            class218 var57;
            class218 var58;
            do {
                var56 = (class63) field866.method4529();
                if (var56 == null) {
                    while (true) {
                        class63 var59;
                        class218 var60;
                        class218 var61;
                        do {
                            var59 = (class63) field884.method4529();
                            if (var59 == null) {
                                while (true) {
                                    class63 var62;
                                    class218 var63;
                                    class218 var64;
                                    do {
                                        var62 = (class63) field828.method4529();
                                        if (var62 == null) {
                                            this.method1160();
                                            method501();
                                            if (field802 != null) {
                                                this.method1165();
                                            }
                                            if (Statics.field1035 != null) {
                                                method3272(Statics.field1035);
                                                field742++;
                                                if (class54.field465 == 0) {
                                                    if (field769) {
                                                        if (Statics.field313 == Statics.field1035 && field886 != field740) {
                                                            class218 var65 = Statics.field1035;
                                                            byte var66 = 0;
                                                            if (field902 == 1 && var65.field2692 == 206) {
                                                                var66 = 1;
                                                            }
                                                            if (var65.field2676[field740] <= 0) {
                                                                var66 = 0;
                                                            }
                                                            int var67 = method210(var65);
                                                            boolean var68 = (var67 >> 29 & 0x1) != 0;
                                                            if (var68) {
                                                                int var69 = field886;
                                                                int var70 = field740;
                                                                var65.field2676[var70] = var65.field2676[var69];
                                                                var65.field2679[var70] = var65.field2679[var69];
                                                                var65.field2676[var69] = -1;
                                                                var65.field2679[var69] = 0;
                                                            } else if (var66 == 1) {
                                                                int var71 = field886;
                                                                int var72 = field740;
                                                                while (var71 != var72) {
                                                                    if (var71 > var72) {
                                                                        var65.method3682(var71 - 1, var71);
                                                                        var71--;
                                                                    } else if (var71 < var72) {
                                                                        var65.method3682(var71 + 1, var71);
                                                                        var71++;
                                                                    }
                                                                }
                                                            } else {
                                                                var65.method3682(field740, field886);
                                                            }
                                                            class182 var73 = class182.method19(class178.field2184, field668.field1294);
                                                            var73.field2303.method5097(Statics.field1035.field2669);
                                                            var73.field2303.method5287(var66);
                                                            var73.field2303.method5095(field886);
                                                            var73.field2303.method5145(field740);
                                                            field668.method2084(var73);
                                                        }
                                                    } else if (this.method1161()) {
                                                        this.method1178(field864, field739);
                                                    } else if (field667 > 0) {
                                                        int var74 = field864;
                                                        int var75 = field739;
                                                        method2044(Statics.field4035, var74, var75);
                                                        Statics.field4035 = null;
                                                    }
                                                    field765 = 10;
                                                    class54.field473 = 0;
                                                    Statics.field1035 = null;
                                                } else if (field742 >= 5 && (class54.field466 > field864 + 5 || class54.field466 < field864 - 5 || class54.field477 > field739 + 5 || class54.field477 < field739 - 5)) {
                                                    field769 = true;
                                                }
                                            }
                                            if (class134.method2836()) {
                                                int var76 = class134.field1813;
                                                int var77 = class134.field1814;
                                                class182 var78 = class182.method19(class178.field2279, field668.field1294);
                                                var78.field2303.method5094(5);
                                                var78.field2303.method5263(class45.field367[82] ? (class45.field367[81] ? 2 : 1) : 0);
                                                var78.field2303.method5095(Statics.field2477 + var76);
                                                var78.field2303.method5145(Statics.field562 + var77);
                                                field668.method2084(var78);
                                                class134.method2894();
                                                field730 = class54.field474;
                                                field738 = class54.field475;
                                                field830 = 1;
                                                field732 = 0;
                                                field819 = var76;
                                                field800 = var77;
                                            }
                                            if (Statics.field103 != var44) {
                                                if (var44 != null) {
                                                    method3272(var44);
                                                }
                                                if (Statics.field103 != null) {
                                                    method3272(Statics.field103);
                                                }
                                            }
                                            if (Statics.field91 != var45 && field799 == field675) {
                                                if (var45 != null) {
                                                    method3272(var45);
                                                }
                                                if (Statics.field91 != null) {
                                                    method3272(Statics.field91);
                                                }
                                            }
                                            if (Statics.field91 == null) {
                                                if (field799 > 0) {
                                                    field799--;
                                                }
                                            } else if (field799 < field675) {
                                                field799++;
                                                if (field799 == field675) {
                                                    method3272(Statics.field91);
                                                }
                                            }
                                            if (field704 == 0) {
                                                int var79 = Statics.field585.field937;
                                                int var80 = Statics.field585.field923;
                                                if (Statics.field140 - var79 < -500 || Statics.field140 - var79 > 500 || Statics.field2346 - var80 < -500 || Statics.field2346 - var80 > 500) {
                                                    Statics.field140 = var79;
                                                    Statics.field2346 = var80;
                                                }
                                                if (Statics.field140 != var79) {
                                                    Statics.field140 += (var79 - Statics.field140) / 16;
                                                }
                                                if (Statics.field2346 != var80) {
                                                    Statics.field2346 += (var80 - Statics.field2346) / 16;
                                                }
                                                int var81 = Statics.field140 >> 7;
                                                int var82 = Statics.field2346 >> 7;
                                                int var83 = method1045(Statics.field140, Statics.field2346, Statics.field1929);
                                                int var84 = 0;
                                                if (var81 > 3 && var82 > 3 && var81 < 100 && var82 < 100) {
                                                    for (int var85 = var81 - 4; var85 <= var81 + 4; var85++) {
                                                        for (int var86 = var82 - 4; var86 <= var82 + 4; var86++) {
                                                            int var87 = Statics.field1929;
                                                            if (var87 < 3 && (class57.field492[1][var85][var86] & 0x2) == 2) {
                                                                var87++;
                                                            }
                                                            int var88 = var83 - class57.field496[var87][var85][var86];
                                                            if (var88 > var84) {
                                                                var84 = var88;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var89 = var84 * 192;
                                                if (var89 > 98048) {
                                                    var89 = 98048;
                                                }
                                                if (var89 < 32768) {
                                                    var89 = 32768;
                                                }
                                                if (var89 > field715) {
                                                    field715 += (var89 - field715) / 24;
                                                } else if (var89 < field715) {
                                                    field715 += (var89 - field715) / 80;
                                                }
                                                Statics.field315 = method1045(Statics.field585.field937, Statics.field585.field923, Statics.field1929) - field705;
                                            } else if (field704 == 1) {
                                                if (field752 && Statics.field585 != null) {
                                                    int var90 = Statics.field585.field978[0];
                                                    int var91 = Statics.field585.field979[0];
                                                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                                                        Statics.field140 = Statics.field585.field937;
                                                        int var92 = method1045(Statics.field585.field937, Statics.field585.field923, Statics.field1929) - field705;
                                                        if (var92 < Statics.field315) {
                                                            Statics.field315 = var92;
                                                        }
                                                        Statics.field2346 = Statics.field585.field923;
                                                        field752 = false;
                                                    }
                                                }
                                                short var93 = -1;
                                                if (class45.field367[33]) {
                                                    var93 = 0;
                                                } else if (class45.field367[49]) {
                                                    var93 = 1024;
                                                }
                                                if (class45.field367[48]) {
                                                    if (var93 == 0) {
                                                        var93 = 1792;
                                                    } else if (var93 == 1024) {
                                                        var93 = 1280;
                                                    } else {
                                                        var93 = 1536;
                                                    }
                                                } else if (class45.field367[50]) {
                                                    if (var93 == 0) {
                                                        var93 = 256;
                                                    } else if (var93 == 1024) {
                                                        var93 = 768;
                                                    } else {
                                                        var93 = 512;
                                                    }
                                                }
                                                byte var94 = 0;
                                                if (class45.field367[35]) {
                                                    var94 = -1;
                                                } else if (class45.field367[51]) {
                                                    var94 = 1;
                                                }
                                                int var95 = 0;
                                                if (var93 >= 0 || var94 != 0) {
                                                    int var96 = class45.field367[81] ? field710 : field709;
                                                    var95 = var96 * 16;
                                                    field707 = var93;
                                                    field633 = var94;
                                                }
                                                if (field706 < var95) {
                                                    field706 += var95 / 8;
                                                    if (field706 > var95) {
                                                        field706 = var95;
                                                    }
                                                } else if (field706 > var95) {
                                                    field706 = field706 * 9 / 10;
                                                }
                                                if (field706 > 0) {
                                                    int var97 = field706 / 16;
                                                    if (field707 >= 0) {
                                                        int var98 = field707 - Statics.field112 & 0x7FF;
                                                        int var99 = class131.field1762[var98];
                                                        int var100 = class131.field1737[var98];
                                                        Statics.field140 += var97 * var99 / 65536;
                                                        Statics.field2346 += var97 * var100 / 65536;
                                                    }
                                                    if (field633 != 0) {
                                                        Statics.field315 += field633 * var97;
                                                        if (Statics.field315 > 0) {
                                                            Statics.field315 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field707 = -1;
                                                    field633 = -1;
                                                }
                                                if (class45.field367[13]) {
                                                    method3316();
                                                }
                                            }
                                            if (class54.field465 == 4 && Statics.field3102) {
                                                int var101 = class54.field477 - field703;
                                                field701 = var101 * 2;
                                                field703 = var101 == -1 || var101 == 1 ? class54.field477 : (field703 + class54.field477) / 2;
                                                int var102 = field848 - class54.field466;
                                                field869 = var102 * 2;
                                                field848 = var102 == -1 || var102 == 1 ? class54.field466 : (field848 + class54.field466) / 2;
                                            } else {
                                                if (class45.field367[96]) {
                                                    field869 += (-24 - field869) / 2;
                                                } else if (class45.field367[97]) {
                                                    field869 += (24 - field869) / 2;
                                                } else {
                                                    field869 /= 2;
                                                }
                                                if (class45.field367[98]) {
                                                    field701 += (12 - field701) / 2;
                                                } else if (class45.field367[99]) {
                                                    field701 += (-12 - field701) / 2;
                                                } else {
                                                    field701 /= 2;
                                                }
                                                field703 = class54.field477;
                                                field848 = class54.field466;
                                            }
                                            field699 = field869 / 2 + field699 & 0x7FF;
                                            field698 += field701 / 2;
                                            if (field698 < 128) {
                                                field698 = 128;
                                            }
                                            if (field698 > 383) {
                                                field698 = 383;
                                            }
                                            if (field873) {
                                                method4142();
                                            }
                                            for (int var103 = 0; var103 < 5; var103++) {
                                                int var10002 = field879[var103]++;
                                            }
                                            Statics.field2005.method1987();
                                            int var104 = ++class54.field460 - 1;
                                            int var106 = class45.method3478();
                                            if (var104 > 15000 && var106 > 15000) {
                                                field733 = 250;
                                                class54.field460 = 14500;
                                                class182 var107 = class182.method19(class178.field2269, field668.field1294);
                                                field668.method2084(var107);
                                            }
                                            Statics.field586.method1679();
                                            field668.field1297++;
                                            if (field668.field1297 > 50) {
                                                class182 var108 = class182.method19(class178.field2183, field668.field1294);
                                                field668.method2084(var108);
                                            }
                                            try {
                                                field668.method2083();
                                            } catch (IOException var110) {
                                                method3746();
                                            }
                                            return;
                                        }
                                        var63 = var62.field552;
                                        if (var63.field2553 < 0) {
                                            break;
                                        }
                                        var64 = Statics.method2628(var63.field2542);
                                    } while (var64 == null || var64.field2682 == null || var63.field2553 >= var64.field2682.length || var64.field2682[var63.field2553] != var63);
                                    class77.method1570(var62);
                                }
                            }
                            var60 = var59.field552;
                            if (var60.field2553 < 0) {
                                break;
                            }
                            var61 = Statics.method2628(var60.field2542);
                        } while (var61 == null || var61.field2682 == null || var60.field2553 >= var61.field2682.length || var61.field2682[var60.field2553] != var60);
                        class77.method1570(var59);
                    }
                }
                var57 = var56.field552;
                if (var57.field2553 < 0) {
                    break;
                }
                var58 = Statics.method2628(var57.field2542);
            } while (var58 == null || var58.field2682 == null || var57.field2553 >= var58.field2682.length || var58.field2682[var57.field2553] != var57);
            class77.method1570(var56);
        }
    }

    @ObfuscatedName("aw.fx(I)V")
    public static final void method352() {
        if (Statics.field2050 != null) {
            Statics.field2050.method2233();
        }
        if (Statics.field1964 != null) {
            Statics.field1964.method2233();
        }
    }

    @ObfuscatedName("au.fb(I)V")
    public static final void method483() {
        for (int var0 = 0; var0 < field754; var0++) {
            int var10002 = field779[var0]--;
            if (field779[var0] >= -10) {
                class100 var2 = field872[var0];
                if (var2 == null) {
                    class100 var10000 = (class100) null;
                    var2 = class100.method2166(Statics.field1593, field868[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field779[var0] += var2.method2170();
                    field872[var0] = var2;
                }
                if (field779[var0] < 0) {
                    int var9;
                    if (field871[var0] == 0) {
                        var9 = field700;
                    } else {
                        int var3 = (field871[var0] & 0xFF) * 128;
                        int var4 = field871[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field585.field937;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field871[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field585.field923;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field779[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field636 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class102 var10 = var2.method2158().method2203(Statics.field1026);
                        class112 var11 = class112.method2325(var10, 100, var9);
                        var11.method2329(field757[var0] - 1);
                        Statics.field509.method2107(var11);
                    }
                    field779[var0] = -100;
                }
            } else {
                field754--;
                for (int var1 = var0; var1 < field754; var1++) {
                    field868[var1] = field868[var1 + 1];
                    field872[var1] = field872[var1 + 1];
                    field757[var1] = field757[var1 + 1];
                    field779[var1] = field779[var1 + 1];
                    field871[var1] = field871[var1 + 1];
                }
                var0--;
            }
        }
        if (field768 && !class198.method651()) {
            if (field650 != 0 && field726 != -1) {
                class198.method3259(Statics.field26, field726, 0, field650, false);
            }
            field768 = false;
        }
    }

    @ObfuscatedName("bs.fw(Liv;IIII)V")
    public static void method1055(class259 arg0, int arg1, int arg2, int arg3) {
        if (field754 >= 50 || field636 == 0 || arg0.field3486 == null || arg1 >= arg0.field3486.length) {
            return;
        }
        int var4 = arg0.field3486[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field868[field754] = var5;
        field757[field754] = var6;
        field779[field754] = 0;
        field872[field754] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field871[field754] = (var8 << 16) + (var9 << 8) + var7;
        field754++;
    }

    @ObfuscatedName("jz.fh(IIII)V")
    public static void method4618(int arg0, int arg1, int arg2) {
        if (field700 == 0 || arg1 == 0 || field754 >= 50) {
            return;
        }
        field868[field754] = arg0;
        field757[field754] = arg1;
        field779[field754] = arg2;
        field872[field754] = null;
        field871[field754] = 0;
        field754++;
    }

    @ObfuscatedName("av.fm(II)V")
    public static void method351(int arg0) {
        if (arg0 == -1 && !field768) {
            class198.method1587();
        } else if (arg0 != -1 && field726 != arg0 && field650 != 0 && !field768) {
            class198.method40(2, Statics.field26, arg0, 0, field650, false);
        }
        field726 = arg0;
    }

    @ObfuscatedName("bk.fi(III)V")
    public static void method967(int arg0, int arg1) {
        if (field650 != 0 && arg0 != -1) {
            class198.method3259(Statics.field404, arg0, 0, field650, false);
            field768 = true;
        }
    }

    @ObfuscatedName("cu.fj(I)V")
    public static final void method2057() {
        if (!Statics.field1217) {
            return;
        }
        if (Statics.field2499 != null) {
            Statics.field2499.method4729();
        }
        for (int var0 = 0; var0 < class90.field1234; var0++) {
            class67 var1 = field745[class90.field1235[var0]];
            var1.method1098();
        }
        Statics.field1217 = false;
    }

    @ObfuscatedName("dx.fz(B)V")
    public static final void method2291() {
        if (Statics.field1929 == field854) {
            return;
        }
        field854 = Statics.field1929;
        int var0 = Statics.field1929;
        int[] var1 = Statics.field2350.field3873;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class57.field492[var0][var6][var4] & 0x18) == 0) {
                    Statics.field86.method2868(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class57.field492[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field86.method2868(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2350.method5749();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class57.field492[var0][var10][var9] & 0x18) == 0) {
                    method4336(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class57.field492[var0 + 1][var10][var9] & 0x8) != 0) {
                    method4336(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field855 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field86.method2863(Statics.field1929, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method12(var13);
                    int var16 = class254.method3616(var15).field3343;
                    if (var16 >= 0) {
                        field858[field855] = class242.method103(var16).method3987(false);
                        field856[field855] = var11;
                        field882[field855] = var12;
                        field855++;
                    }
                }
            }
        }
        Statics.field3579.method5616();
    }

    @ObfuscatedName("jm.gw(Lha;IIB)V")
    public static final void method4707(class218 arg0, int arg1, int arg2) {
        if (field867 != 0 && field867 != 3 || field901 || !(class54.field473 == 1 || !Statics.field3102 && class54.field473 == 4)) {
            return;
        }
        class212 var3 = arg0.method3670(true);
        if (var3 == null) {
            return;
        }
        int var4 = class54.field474 - arg1;
        int var5 = class54.field475 - arg2;
        if (!var3.method3591(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2507 / 2;
        int var7 = var5 - var3.field2504 / 2;
        int var8 = field699 & 0x7FF;
        int var9 = class131.field1762[var8];
        int var10 = class131.field1737[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field585.field937 + var11 >> 7;
        int var14 = Statics.field585.field923 - var12 >> 7;
        class182 var15 = class182.method19(class178.field2213, field668.field1294);
        var15.field2303.method5094(18);
        var15.field2303.method5263(class45.field367[82] ? (class45.field367[81] ? 2 : 1) : 0);
        var15.field2303.method5095(Statics.field2477 + var13);
        var15.field2303.method5145(Statics.field562 + var14);
        var15.field2303.method5094(var6);
        var15.field2303.method5094(var7);
        var15.field2303.method5095(field699);
        var15.field2303.method5094(57);
        var15.field2303.method5094(0);
        var15.field2303.method5094(0);
        var15.field2303.method5094(89);
        var15.field2303.method5095(Statics.field585.field937);
        var15.field2303.method5095(Statics.field585.field923);
        var15.field2303.method5094(63);
        field668.method2084(var15);
        field819 = var13;
        field800 = var14;
    }

    @ObfuscatedName("jp.ga(I)V")
    public static final void method4622() {
        int[] var0 = class90.field1235;
        for (int var1 = 0; var1 < class90.field1234; var1++) {
            class67 var2 = field745[var0[var1]];
            if (var2 != null && var2.field939 > 0) {
                var2.field939--;
                if (var2.field939 == 0) {
                    var2.field936 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field672; var3++) {
            int var4 = field905[var3];
            class80 var5 = field762[var4];
            if (var5 != null && var5.field939 > 0) {
                var5.field939--;
                if (var5.field939 == 0) {
                    var5.field936 = null;
                }
            }
        }
    }

    @ObfuscatedName("fl.gn(Ljava/lang/String;I)V")
    public static final void method3160(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1071.field1028 = !Statics.field1071.field1028;
            class74.method1733();
            if (Statics.field1071.field1028) {
                class92.method1894(99, "", "Roofs are now all hidden");
            } else {
                class92.method1894(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field647 = !field647;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field748 = !field748;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field665 = !field665;
        }
        if (field798 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field36.field3955 = !Statics.field36.field3955;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field647 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field647 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3746();
            }
        }
        class182 var1 = class182.method19(class178.field2217, field668.field1294);
        var1.field2303.method5094(arg0.length() + 1);
        var1.field2303.method5101(arg0);
        field668.method2084(var1);
    }

    @ObfuscatedName("is.gj(I)V")
    public static final void method4142() {
        int var0 = Statics.field3478 * 128 + 64;
        int var1 = Statics.field148 * 128 + 64;
        int var2 = method1045(var0, var1, Statics.field1929) - Statics.field398;
        if (Statics.field2389 < var0) {
            Statics.field2389 += Statics.field93 * (var0 - Statics.field2389) / 1000 + Statics.field3313;
            if (Statics.field2389 > var0) {
                Statics.field2389 = var0;
            }
        }
        if (Statics.field2389 > var0) {
            Statics.field2389 -= Statics.field93 * (Statics.field2389 - var0) / 1000 + Statics.field3313;
            if (Statics.field2389 < var0) {
                Statics.field2389 = var0;
            }
        }
        if (Statics.field539 < var2) {
            Statics.field539 += Statics.field93 * (var2 - Statics.field539) / 1000 + Statics.field3313;
            if (Statics.field539 > var2) {
                Statics.field539 = var2;
            }
        }
        if (Statics.field539 > var2) {
            Statics.field539 -= Statics.field93 * (Statics.field539 - var2) / 1000 + Statics.field3313;
            if (Statics.field539 < var2) {
                Statics.field539 = var2;
            }
        }
        if (Statics.field1937 < var1) {
            Statics.field1937 += Statics.field93 * (var1 - Statics.field1937) / 1000 + Statics.field3313;
            if (Statics.field1937 > var1) {
                Statics.field1937 = var1;
            }
        }
        if (Statics.field1937 > var1) {
            Statics.field1937 -= Statics.field93 * (Statics.field1937 - var1) / 1000 + Statics.field3313;
            if (Statics.field1937 < var1) {
                Statics.field1937 = var1;
            }
        }
        int var3 = Statics.field1112 * 128 + 64;
        int var4 = Statics.field3590 * 128 + 64;
        int var5 = method1045(var3, var4, Statics.field1929) - Statics.field874;
        int var6 = var3 - Statics.field2389;
        int var7 = var5 - Statics.field539;
        int var8 = var4 - Statics.field1937;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1714 < var10) {
            Statics.field1714 += Statics.field624 * (var10 - Statics.field1714) / 1000 + Statics.field2311;
            if (Statics.field1714 > var10) {
                Statics.field1714 = var10;
            }
        }
        if (Statics.field1714 > var10) {
            Statics.field1714 -= Statics.field624 * (Statics.field1714 - var10) / 1000 + Statics.field2311;
            if (Statics.field1714 < var10) {
                Statics.field1714 = var10;
            }
        }
        int var12 = var11 - Statics.field112;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field112 += Statics.field624 * var12 / 1000 + Statics.field2311;
            Statics.field112 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field112 -= Statics.field624 * -var12 / 1000 + Statics.field2311;
            Statics.field112 &= 0x7FF;
        }
        int var13 = var11 - Statics.field112;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field112 = var11;
        }
    }

    @ObfuscatedName("bs.gx(Lbv;IB)V")
    public static final void method1080(class70 arg0, int arg1) {
        if (arg0.field951 > field641) {
            method1039(arg0);
        } else if (arg0.field970 >= field641) {
            method214(arg0);
        } else {
            arg0.field952 = arg0.field928;
            if (arg0.field977 == 0) {
                arg0.field981 = 0;
            } else {
                label322: {
                    if (arg0.field955 != -1 && arg0.field958 == 0) {
                        class259 var2 = class259.method209(arg0.field955);
                        if (arg0.field927 > 0 && var2.field3479 == 0) {
                            arg0.field981++;
                            break label322;
                        }
                        if (arg0.field927 <= 0 && var2.field3494 == 0) {
                            arg0.field981++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field937;
                    int var4 = arg0.field923;
                    int var5 = arg0.field978[arg0.field977 - 1] * 128 + arg0.field926 * 64;
                    int var6 = arg0.field979[arg0.field977 - 1] * 128 + arg0.field926 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field974 = 1280;
                        } else if (var4 > var6) {
                            arg0.field974 = 1792;
                        } else {
                            arg0.field974 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field974 = 768;
                        } else if (var4 > var6) {
                            arg0.field974 = 256;
                        } else {
                            arg0.field974 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field974 = 1024;
                    } else if (var4 > var6) {
                        arg0.field974 = 0;
                    }
                    byte var7 = arg0.field931[arg0.field977 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field974 - arg0.field924 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field963;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field960;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field934;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field933;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field960;
                        }
                        arg0.field952 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class80) {
                            var11 = ((class80) arg0).field1106.field3463;
                        }
                        if (var11) {
                            if (arg0.field974 != arg0.field924 && arg0.field949 == -1 && arg0.field969 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field977 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field977 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field981 > 0 && arg0.field977 > 1) {
                                var10 = 8;
                                arg0.field981--;
                            }
                        } else {
                            if (arg0.field977 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field977 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field981 > 0 && arg0.field977 > 1) {
                                var10 = 8;
                                arg0.field981--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field960 == arg0.field952 && arg0.field935 != -1) {
                            arg0.field952 = arg0.field935;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field937 += var10;
                                if (arg0.field937 > var5) {
                                    arg0.field937 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field937 -= var10;
                                if (arg0.field937 < var5) {
                                    arg0.field937 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field923 += var10;
                                if (arg0.field923 > var6) {
                                    arg0.field923 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field923 -= var10;
                                if (arg0.field923 < var6) {
                                    arg0.field923 = var6;
                                }
                            }
                        }
                        if (arg0.field937 == var5 && arg0.field923 == var6) {
                            arg0.field977--;
                            if (arg0.field927 > 0) {
                                arg0.field927--;
                            }
                        }
                    } else {
                        arg0.field937 = var5;
                        arg0.field923 = var6;
                        arg0.field977--;
                        if (arg0.field927 > 0) {
                            arg0.field927--;
                        }
                    }
                }
            }
        }
        if (arg0.field937 < 128 || arg0.field923 < 128 || arg0.field937 >= 13184 || arg0.field923 >= 13184) {
            arg0.field955 = -1;
            arg0.field982 = -1;
            arg0.field951 = 0;
            arg0.field970 = 0;
            arg0.field937 = arg0.field978[0] * 128 + arg0.field926 * 64;
            arg0.field923 = arg0.field979[0] * 128 + arg0.field926 * 64;
            arg0.method1576();
        }
        if (Statics.field585 == arg0 && (arg0.field937 < 1536 || arg0.field923 < 1536 || arg0.field937 >= 11776 || arg0.field923 >= 11776)) {
            arg0.field955 = -1;
            arg0.field982 = -1;
            arg0.field951 = 0;
            arg0.field970 = 0;
            arg0.field937 = arg0.field978[0] * 128 + arg0.field926 * 64;
            arg0.field923 = arg0.field979[0] * 128 + arg0.field926 * 64;
            arg0.method1576();
        }
        method35(arg0);
        arg0.field948 = false;
        if (arg0.field952 != -1) {
            class259 var12 = class259.method209(arg0.field952);
            if (var12 == null || var12.field3483 == null) {
                arg0.field952 = -1;
            } else {
                arg0.field942++;
                if (arg0.field953 < var12.field3483.length && arg0.field942 > var12.field3485[arg0.field953]) {
                    arg0.field942 = 1;
                    arg0.field953++;
                    method1055(var12, arg0.field953, arg0.field937, arg0.field923);
                }
                if (arg0.field953 >= var12.field3483.length) {
                    arg0.field942 = 0;
                    arg0.field953 = 0;
                    method1055(var12, arg0.field953, arg0.field937, arg0.field923);
                }
            }
        }
        if (arg0.field982 != -1 && field641 >= arg0.field944) {
            if (arg0.field954 < 0) {
                arg0.field954 = 0;
            }
            int var13 = class244.method3267(arg0.field982).field3215;
            if (var13 == -1) {
                arg0.field982 = -1;
            } else {
                class259 var14 = class259.method209(var13);
                if (var14 == null || var14.field3483 == null) {
                    arg0.field982 = -1;
                } else {
                    arg0.field962++;
                    if (arg0.field954 < var14.field3483.length && arg0.field962 > var14.field3485[arg0.field954]) {
                        arg0.field962 = 1;
                        arg0.field954++;
                        method1055(var14, arg0.field954, arg0.field937, arg0.field923);
                    }
                    if (arg0.field954 >= var14.field3483.length && (arg0.field954 < 0 || arg0.field954 >= var14.field3483.length)) {
                        arg0.field982 = -1;
                    }
                }
            }
        }
        if (arg0.field955 != -1 && arg0.field958 <= 1) {
            class259 var15 = class259.method209(arg0.field955);
            if (var15.field3479 == 1 && arg0.field927 > 0 && arg0.field951 <= field641 && arg0.field970 < field641) {
                arg0.field958 = 1;
                return;
            }
        }
        if (arg0.field955 != -1 && arg0.field958 == 0) {
            class259 var16 = class259.method209(arg0.field955);
            if (var16 == null || var16.field3483 == null) {
                arg0.field955 = -1;
            } else {
                arg0.field957++;
                if (arg0.field956 < var16.field3483.length && arg0.field957 > var16.field3485[arg0.field956]) {
                    arg0.field957 = 1;
                    arg0.field956++;
                    method1055(var16, arg0.field956, arg0.field937, arg0.field923);
                }
                if (arg0.field956 >= var16.field3483.length) {
                    arg0.field956 -= var16.field3490;
                    arg0.field959++;
                    if (arg0.field959 >= var16.field3497) {
                        arg0.field955 = -1;
                    } else if (arg0.field956 >= 0 && arg0.field956 < var16.field3483.length) {
                        method1055(var16, arg0.field956, arg0.field937, arg0.field923);
                    } else {
                        arg0.field955 = -1;
                    }
                }
                arg0.field948 = var16.field3489;
            }
        }
        if (arg0.field958 > 0) {
            arg0.field958--;
        }
    }

    @ObfuscatedName("bm.gk(Lbv;I)V")
    public static final void method1039(class70 arg0) {
        int var1 = arg0.field951 - field641;
        int var2 = arg0.field926 * 64 + arg0.field922 * 128;
        int var3 = arg0.field967 * 128 + arg0.field926 * 64;
        arg0.field937 += (var2 - arg0.field937) / var1;
        arg0.field923 += (var3 - arg0.field923) / var1;
        arg0.field981 = 0;
        arg0.field974 = arg0.field971;
    }

    @ObfuscatedName("z.gq(Lbv;I)V")
    public static final void method214(class70 arg0) {
        if (field641 == arg0.field970 || arg0.field955 == -1 || arg0.field958 != 0 || arg0.field957 + 1 > class259.method209(arg0.field955).field3485[arg0.field956]) {
            int var1 = arg0.field970 - arg0.field951;
            int var2 = field641 - arg0.field951;
            int var3 = arg0.field926 * 64 + arg0.field922 * 128;
            int var4 = arg0.field967 * 128 + arg0.field926 * 64;
            int var5 = arg0.field966 * 128 + arg0.field926 * 64;
            int var6 = arg0.field930 * 128 + arg0.field926 * 64;
            arg0.field937 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field923 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field981 = 0;
        arg0.field974 = arg0.field971;
        arg0.field924 = arg0.field974;
    }

    @ObfuscatedName("w.gf(Lbv;I)V")
    public static final void method35(class70 arg0) {
        if (arg0.field969 == 0) {
            return;
        }
        if (arg0.field949 != -1) {
            class70 var1 = null;
            if (arg0.field949 < 32768) {
                var1 = field762[arg0.field949];
            } else if (arg0.field949 >= 32768) {
                var1 = field745[arg0.field949 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field937 - var1.field937;
                int var3 = arg0.field923 - var1.field923;
                if (var2 != 0 || var3 != 0) {
                    arg0.field974 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field950) {
                arg0.field949 = -1;
                arg0.field950 = false;
            }
        }
        if (arg0.field961 != -1 && (arg0.field977 == 0 || arg0.field981 > 0)) {
            arg0.field974 = arg0.field961;
            arg0.field961 = -1;
        }
        int var4 = arg0.field974 - arg0.field924 & 0x7FF;
        if (var4 == 0 && arg0.field950) {
            arg0.field949 = -1;
            arg0.field950 = false;
        }
        if (var4 == 0) {
            arg0.field975 = 0;
            return;
        }
        arg0.field975++;
        if (var4 > 1024) {
            arg0.field924 -= arg0.field969;
            boolean var5 = true;
            if (var4 < arg0.field969 || var4 > 2048 - arg0.field969) {
                arg0.field924 = arg0.field974;
                var5 = false;
            }
            if (arg0.field952 == arg0.field928 && (arg0.field975 > 25 || var5)) {
                if (arg0.field929 == -1) {
                    arg0.field952 = arg0.field960;
                } else {
                    arg0.field952 = arg0.field929;
                }
            }
        } else {
            arg0.field924 += arg0.field969;
            boolean var6 = true;
            if (var4 < arg0.field969 || var4 > 2048 - arg0.field969) {
                arg0.field924 = arg0.field974;
                var6 = false;
            }
            if (arg0.field952 == arg0.field928 && (arg0.field975 > 25 || var6)) {
                if (arg0.field976 == -1) {
                    arg0.field952 = arg0.field960;
                } else {
                    arg0.field952 = arg0.field976;
                }
            }
        }
        arg0.field924 &= 0x7FF;
    }

    @ObfuscatedName("aq.gs(I)V")
    public static void method501() {
        if (Statics.field36 != null) {
            Statics.field36.method5864(Statics.field1929, (Statics.field585.field937 >> 7) + Statics.field2477, (Statics.field585.field923 >> 7) + Statics.field562, false);
            Statics.field36.method5880();
        }
    }

    @ObfuscatedName("ed.gd(Lbn;III)V")
    public static void method3083(class67 arg0, int arg1, int arg2) {
        if (arg0.field955 == arg1 && arg1 != -1) {
            int var3 = class259.method209(arg1).field3496;
            if (var3 == 1) {
                arg0.field956 = 0;
                arg0.field957 = 0;
                arg0.field958 = arg2;
                arg0.field959 = 0;
            }
            if (var3 == 2) {
                arg0.field959 = 0;
            }
        } else if (arg1 == -1 || arg0.field955 == -1 || class259.method209(arg1).field3493 >= class259.method209(arg0.field955).field3493) {
            arg0.field955 = arg1;
            arg0.field956 = 0;
            arg0.field957 = 0;
            arg0.field958 = arg2;
            arg0.field959 = 0;
            arg0.field927 = arg0.field977;
        }
    }

    @ObfuscatedName("ii.gb(I)I")
    public static int method4329() {
        return field843 ? 2 : 1;
    }

    @ObfuscatedName("by.gi(IB)V")
    public static void method1027(int arg0) {
        field842 = 0L;
        if (arg0 >= 2) {
            field843 = true;
        } else {
            field843 = false;
        }
        if (method4329() == 1) {
            Statics.field2488.method923(765, 503);
        } else {
            Statics.field2488.method923(7680, 2160);
        }
        if (field645 >= 25) {
            method3718();
        }
    }

    @ObfuscatedName("hb.gz(I)V")
    public static void method3718() {
        class182 var0 = class182.method19(class178.field2180, field668.field1294);
        var0.field2303.method5094(method4329());
        var0.field2303.method5095(Statics.field45);
        var0.field2303.method5095(Statics.field1152);
        field668.method2084(var0);
    }

    @ObfuscatedName("client.u(I)V")
    public final void method829() {
        field842 = class297.method481() + 500L;
        this.method1157();
        if (field789 != -1) {
            this.method1403(true);
        }
    }

    @ObfuscatedName("client.ge(I)V")
    public void method1157() {
        int var1 = Statics.field45;
        int var2 = Statics.field1152;
        if (this.field432 < var1) {
            int var3 = this.field432;
        }
        if (this.field433 < var2) {
            int var4 = this.field433;
        }
        if (Statics.field1071 == null) {
            return;
        }
        try {
            client var5 = Statics.field2488;
            Object[] var6 = new Object[] { method4329() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gt(I)V")
    public final void method1360() {
        if (field789 != -1) {
            int var1 = field789;
            if (class218.method3537(var1)) {
                method929(Statics.field1950[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field832; var2++) {
            if (field834[var2]) {
                field835[var2] = true;
            }
            field836[var2] = field834[var2];
            field834[var2] = false;
        }
        field833 = field641;
        field778 = -1;
        field794 = -1;
        Statics.field313 = null;
        if (field789 != -1) {
            field832 = 0;
            method128(field789, 0, 0, Statics.field45, Statics.field1152, 0, 0, -1);
        }
        class321.method5578();
        if (field734) {
            if (field830 == 1) {
                Statics.field3365[field732 / 100].method5712(field730 - 8, field738 - 8);
            }
            if (field830 == 2) {
                Statics.field3365[field732 / 100 + 4].method5712(field730 - 8, field738 - 8);
            }
        }
        if (field901) {
            int var8 = Statics.field44;
            int var9 = Statics.field321;
            int var10 = Statics.field384;
            int var11 = Statics.field481;
            int var12 = 6116423;
            class321.method5589(var8, var9, var10, var11, var12);
            class321.method5589(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class321.method5553(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field59.method4966(class225.field2901, var8 + 3, var9 + 14, var12, -1);
            int var13 = class54.field466;
            int var14 = class54.field477;
            for (int var15 = 0; var15 < field667; var15++) {
                int var16 = (field667 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class294 var18 = Statics.field59;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field772[var15].length() > 0) {
                    var19 = field771[var15] + class225.field2909 + field772[var15];
                } else {
                    var19 = field771[var15];
                }
                var18.method4966(var19, var8 + 3, var16, var17, 0);
            }
            int var20 = Statics.field44;
            int var21 = Statics.field321;
            int var22 = Statics.field384;
            int var23 = Statics.field481;
            for (int var24 = 0; var24 < field832; var24++) {
                if (field839[var24] + field837[var24] > var20 && field837[var24] < var20 + var22 && field840[var24] + field838[var24] > var21 && field838[var24] < var21 + var23) {
                    field835[var24] = true;
                }
            }
        } else if (field778 != -1) {
            int var3 = field778;
            int var4 = field794;
            if ((field667 >= 2 || field673 != 0 || field784) && field665) {
                int var5 = method1147();
                String var6;
                if (field673 == 1 && field667 < 2) {
                    var6 = class225.field2769 + class225.field2909 + field783 + " " + class82.field1131;
                } else if (field784 && field667 < 2) {
                    var6 = field787 + class225.field2909 + field782 + " " + class82.field1131;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field772[var5].length() > 0) {
                        var7 = field771[var5] + class225.field2909 + field772[var5];
                    } else {
                        var7 = field771[var5];
                    }
                    var6 = var7;
                }
                if (field667 > 2) {
                    var6 = var6 + class82.method1876(16777215) + " " + '/' + " " + (field667 - 2) + class225.field2902;
                }
                Statics.field59.method4984(var6, var3 + 4, var4 + 15, 16777215, 0, field641 / 1000);
            }
        }
        if (field841 == 3) {
            for (int var25 = 0; var25 < field832; var25++) {
                if (field836[var25]) {
                    class321.method5547(field837[var25], field838[var25], field839[var25], field840[var25], 16711935, 128);
                } else if (field835[var25]) {
                    class321.method5547(field837[var25], field838[var25], field839[var25], field840[var25], 16711680, 128);
                }
            }
        }
        int var26 = Statics.field1929;
        int var27 = Statics.field585.field937;
        int var28 = Statics.field585.field923;
        int var29 = field691;
        for (class76 var30 = (class76) class76.field1057.method4540(); var30 != null; var30 = (class76) class76.field1057.method4533()) {
            if (var30.field1059 != -1 || var30.field1063 != null) {
                int var31 = 0;
                if (var27 > var30.field1065) {
                    var31 += var27 - var30.field1065;
                } else if (var27 < var30.field1055) {
                    var31 += var30.field1055 - var27;
                }
                if (var28 > var30.field1053) {
                    var31 += var28 - var30.field1053;
                } else if (var28 < var30.field1058) {
                    var31 += var30.field1058 - var28;
                }
                if (var31 - 64 > var30.field1054 || field636 == 0 || var30.field1064 != var26) {
                    if (var30.field1060 != null) {
                        Statics.field509.method2109(var30.field1060);
                        var30.field1060 = null;
                    }
                    if (var30.field1052 != null) {
                        Statics.field509.method2109(var30.field1052);
                        var30.field1052 = null;
                    }
                } else {
                    var31 -= 64;
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    int var32 = field636 * (var30.field1054 - var31) / var30.field1054;
                    class100 var10000;
                    if (var30.field1060 != null) {
                        var30.field1060.method2353(var32);
                    } else if (var30.field1059 >= 0) {
                        var10000 = (class100) null;
                        class100 var33 = class100.method2166(Statics.field1593, var30.field1059, 0);
                        if (var33 != null) {
                            class102 var34 = var33.method2158().method2203(Statics.field1026);
                            class112 var35 = class112.method2325(var34, 100, var32);
                            var35.method2329(-1);
                            Statics.field509.method2107(var35);
                            var30.field1060 = var35;
                        }
                    }
                    if (var30.field1052 != null) {
                        var30.field1052.method2353(var32);
                        if (!var30.field1052.method3295()) {
                            var30.field1052 = null;
                        }
                    } else if (var30.field1063 != null && (var30.field1056 -= var29) <= 0) {
                        int var36 = (int) (Math.random() * (double) var30.field1063.length);
                        var10000 = (class100) null;
                        class100 var37 = class100.method2166(Statics.field1593, var30.field1063[var36], 0);
                        if (var37 != null) {
                            class102 var38 = var37.method2158().method2203(Statics.field1026);
                            class112 var39 = class112.method2325(var38, 100, var32);
                            var39.method2329(0);
                            Statics.field509.method2107(var39);
                            var30.field1052 = var39;
                            var30.field1056 = var30.field1061 + (int) (Math.random() * (double) (var30.field1062 - var30.field1061));
                        }
                    }
                }
            }
        }
        field691 = 0;
    }

    @ObfuscatedName("i.gv(Ljava/lang/String;ZB)V")
    public static final void method9(String arg0, boolean arg1) {
        if (!field862) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field489.method4964(arg0, 250);
        int var6 = Statics.field489.method5043(arg0, 250) * 13;
        class321.method5589(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5553(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field489.method4970(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3024(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3579.method763(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field832; var11++) {
            if (field839[var11] + field837[var11] > var7 && field837[var11] < var7 + var9 && field840[var11] + field838[var11] > var8 && field838[var11] < var8 + var10) {
                field835[var11] = true;
            }
        }
    }

    @ObfuscatedName("gb.gm(IIIII)V")
    public static final void method3339(int arg0, int arg1, int arg2, int arg3) {
        field727++;
        if (Statics.field585.field937 >> 7 == field819 && Statics.field585.field923 >> 7 == field800) {
            field819 = 0;
        }
        method568();
        if (field756 >= 0 && field745[field756] != null) {
            method139(field745[field756], false);
        }
        method3878(true);
        method253();
        method3878(false);
        for (class87 var4 = (class87) field759.method4540(); var4 != null; var4 = (class87) field759.method4533()) {
            if (Statics.field1929 != var4.field1210 || field641 > var4.field1201) {
                var4.method3292();
            } else if (field641 >= var4.field1197) {
                if (var4.field1191 > 0) {
                    class80 var5 = field762[var4.field1191 - 1];
                    if (var5 != null && var5.field937 >= 0 && var5.field937 < 13312 && var5.field923 >= 0 && var5.field923 < 13312) {
                        var4.method1939(var5.field937, var5.field923, method1045(var5.field937, var5.field923, var4.field1210) - var4.field1196, field641);
                    }
                }
                if (var4.field1191 < 0) {
                    int var6 = -var4.field1191 - 1;
                    class67 var7;
                    if (field676 == var6) {
                        var7 = Statics.field585;
                    } else {
                        var7 = field745[var6];
                    }
                    if (var7 != null && var7.field937 >= 0 && var7.field937 < 13312 && var7.field923 >= 0 && var7.field923 < 13312) {
                        var4.method1939(var7.field937, var7.field923, method1045(var7.field937, var7.field923, var4.field1210) - var4.field1196, field641);
                    }
                }
                var4.method1940(field691);
                Statics.field86.method2845(Statics.field1929, (int) var4.field1192, (int) var4.field1204, (int) var4.field1205, 60, var4, var4.field1211, -1L, false);
            }
        }
        method3064();
        method3018(arg0, arg1, arg2, arg3, true);
        int var8 = field888;
        int var9 = field889;
        int var10 = field890;
        int var11 = field891;
        class321.method5541(var8, var9, var8 + var10, var9 + var11);
        class131.method2820();
        if (!field873) {
            int var12 = field698;
            if (field715 / 256 > var12) {
                var12 = field715 / 256;
            }
            if (field780[4] && field877[4] + 128 > var12) {
                var12 = field877[4] + 128;
            }
            int var13 = field699 & 0x7FF;
            int var14 = Statics.field140;
            int var15 = Statics.field315;
            int var16 = Statics.field2346;
            int var17 = var12 * 3 + 600;
            int var19 = Statics.method537(var17, var11);
            int var20 = 2048 - var12 & 0x7FF;
            int var21 = 2048 - var13 & 0x7FF;
            int var22 = 0;
            int var23 = 0;
            int var24 = var19;
            if (var20 != 0) {
                int var25 = class131.field1762[var20];
                int var26 = class131.field1737[var20];
                int var27 = var23 * var26 - var19 * var25 >> 16;
                var24 = var23 * var25 + var19 * var26 >> 16;
                var23 = var27;
            }
            if (var21 != 0) {
                int var28 = class131.field1762[var21];
                int var29 = class131.field1737[var21];
                int var30 = var22 * var29 + var24 * var28 >> 16;
                var24 = var24 * var29 - var22 * var28 >> 16;
                var22 = var30;
            }
            Statics.field2389 = var14 - var22;
            Statics.field539 = var15 - var23;
            Statics.field1937 = var16 - var24;
            Statics.field1714 = var12;
            Statics.field112 = var13;
            if (field704 == 1 && field798 >= 2 && field641 % 50 == 0 && (Statics.field140 >> 7 != Statics.field585.field937 >> 7 || Statics.field2346 >> 7 != Statics.field585.field923 >> 7)) {
                int var31 = Statics.field585.field613;
                int var32 = (Statics.field140 >> 7) + Statics.field2477;
                int var33 = (Statics.field2346 >> 7) + Statics.field562;
                class182 var34 = class182.method19(class178.field2252, field668.field1294);
                var34.field2303.method5145(var32);
                var34.field2303.method5155(field711);
                var34.field2303.method5145(var33);
                var34.field2303.method5136(var31);
                field668.method2084(var34);
            }
        }
        int var35;
        if (field873) {
            var35 = method182();
        } else {
            var35 = method247();
        }
        int var36 = Statics.field2389;
        int var37 = Statics.field539;
        int var38 = Statics.field1937;
        int var39 = Statics.field1714;
        int var40 = Statics.field112;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field780[var41]) {
                int var42 = (int) (Math.random() * (double) (field876[var41] * 2 + 1) - (double) field876[var41] + Math.sin((double) field878[var41] / 100.0D * (double) field879[var41]) * (double) field877[var41]);
                if (var41 == 0) {
                    Statics.field2389 += var42;
                }
                if (var41 == 1) {
                    Statics.field539 += var42;
                }
                if (var41 == 2) {
                    Statics.field1937 += var42;
                }
                if (var41 == 3) {
                    Statics.field112 = Statics.field112 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field1714 += var42;
                    if (Statics.field1714 < 128) {
                        Statics.field1714 = 128;
                    }
                    if (Statics.field1714 > 383) {
                        Statics.field1714 = 383;
                    }
                }
            }
        }
        int var43 = class54.field466;
        int var44 = class54.field477;
        if (class54.field473 != 0) {
            var43 = class54.field474;
            var44 = class54.field475;
        }
        if (var43 >= var8 && var43 < var8 + var10 && var44 >= var9 && var44 < var9 + var11) {
            int var45 = var43 - var8;
            int var46 = var44 - var9;
            class129.field1715 = var45;
            class129.field1717 = var46;
            class129.field1724 = true;
            class129.field1722 = 0;
            class129.field1723 = false;
        } else {
            class129.method3736();
        }
        method352();
        class321.method5589(var8, var9, var10, var11, 0);
        method352();
        int var47 = class131.field1748;
        class131.field1748 = field892;
        Statics.field86.method2947(Statics.field2389, Statics.field539, Statics.field1937, Statics.field1714, Statics.field112, var35);
        class131.field1748 = var47;
        method352();
        Statics.field86.method2848();
        field648 = 0;
        boolean var48 = false;
        int var49 = -1;
        int var50 = -1;
        int var51 = class90.field1234;
        int[] var52 = class90.field1235;
        for (int var53 = 0; var53 < field672 + var51; var53++) {
            class70 var54;
            if (var53 < var51) {
                var54 = field745[var52[var53]];
                if (field756 == var52[var53]) {
                    var48 = true;
                    var49 = var53;
                    continue;
                }
                if (Statics.field585 == var54) {
                    var50 = var53;
                    continue;
                }
            } else {
                var54 = field762[field905[var53 - var51]];
            }
            Statics.method3077(var54, var53, var8, var9, var10, var11);
        }
        if (field748 && var50 != -1) {
            Statics.method3077(Statics.field585, var50, var8, var9, var10, var11);
        }
        if (var48) {
            Statics.method3077(field745[field756], var49, var8, var9, var10, var11);
        }
        for (int var55 = 0; var55 < field648; var55++) {
            int var56 = field718[var55];
            int var57 = field719[var55];
            int var58 = field770[var55];
            int var59 = field720[var55];
            boolean var60 = true;
            while (var60) {
                var60 = false;
                for (int var61 = 0; var61 < var55; var61++) {
                    if (var57 + 2 > field719[var61] - field720[var61] && var57 - var59 < field719[var61] + 2 && var56 - var58 < field770[var61] + field718[var61] && var56 + var58 > field718[var61] - field770[var61] && field719[var61] - field720[var61] < var57) {
                        var57 = field719[var61] - field720[var61];
                        var60 = true;
                    }
                }
            }
            field669 = field718[var55];
            field764 = field719[var55] = var57;
            String var62 = field677[var55];
            if (field793 == 0) {
                int var63 = 16776960;
                if (field722[var55] < 6) {
                    var63 = field865[field722[var55]];
                }
                if (field722[var55] == 6) {
                    var63 = field727 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field722[var55] == 7) {
                    var63 = field727 % 20 < 10 ? 255 : 65535;
                }
                if (field722[var55] == 8) {
                    var63 = field727 % 20 < 10 ? 45056 : 8454016;
                }
                if (field722[var55] == 9) {
                    int var64 = 150 - field724[var55];
                    if (var64 < 50) {
                        var63 = var64 * 1280 + 16711680;
                    } else if (var64 < 100) {
                        var63 = 16776960 - (var64 - 50) * 327680;
                    } else if (var64 < 150) {
                        var63 = (var64 - 100) * 5 + 65280;
                    }
                }
                if (field722[var55] == 10) {
                    int var65 = 150 - field724[var55];
                    if (var65 < 50) {
                        var63 = var65 * 5 + 16711680;
                    } else if (var65 < 100) {
                        var63 = 16711935 - (var65 - 50) * 327680;
                    } else if (var65 < 150) {
                        var63 = (var65 - 100) * 327680 + 255 - (var65 - 100) * 5;
                    }
                }
                if (field722[var55] == 11) {
                    int var66 = 150 - field724[var55];
                    if (var66 < 50) {
                        var63 = 16777215 - var66 * 327685;
                    } else if (var66 < 100) {
                        var63 = (var66 - 50) * 327685 + 65280;
                    } else if (var66 < 150) {
                        var63 = 16777215 - (var66 - 100) * 327680;
                    }
                }
                if (field723[var55] == 0) {
                    Statics.field59.method4988(var62, field669 + var8, field764 + var9, var63, 0);
                }
                if (field723[var55] == 1) {
                    Statics.field59.method5006(var62, field669 + var8, field764 + var9, var63, 0, field727);
                }
                if (field723[var55] == 2) {
                    Statics.field59.method4961(var62, field669 + var8, field764 + var9, var63, 0, field727);
                }
                if (field723[var55] == 3) {
                    Statics.field59.method4973(var62, field669 + var8, field764 + var9, var63, 0, field727, 150 - field724[var55]);
                }
                if (field723[var55] == 4) {
                    int var67 = (150 - field724[var55]) * (Statics.field59.method4962(var62) + 100) / 150;
                    class321.method5562(field669 + var8 - 50, var9, field669 + var8 + 50, var9 + var11);
                    Statics.field59.method4966(var62, field669 + var8 + 50 - var67, field764 + var9, var63, 0);
                    class321.method5541(var8, var9, var8 + var10, var9 + var11);
                }
                if (field723[var55] == 5) {
                    int var68 = 150 - field724[var55];
                    int var69 = 0;
                    if (var68 < 25) {
                        var69 = var68 - 25;
                    } else if (var68 > 125) {
                        var69 = var68 - 125;
                    }
                    class321.method5562(var8, field764 + var9 - Statics.field59.field3666 - 1, var8 + var10, field764 + var9 + 5);
                    Statics.field59.method4988(var62, field669 + var8, field764 + var9 + var69, var63, 0);
                    class321.method5541(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field59.method4988(var62, field669 + var8, field764 + var9, 16776960, 0);
            }
        }
        method345(var8, var9);
        ((class120) Statics.field1747).method2522(field691);
        method3270();
        Statics.field2389 = var36;
        Statics.field539 = var37;
        Statics.field1937 = var38;
        Statics.field1714 = var39;
        Statics.field112 = var40;
        if (field640 && class237.method3297(true, false) == 0) {
            field640 = false;
        }
        if (field640) {
            class321.method5589(var8, var9, var10, var11, 0);
            method9(class225.field2925, false);
        }
    }

    @ObfuscatedName("eq.gl(IIIIZB)V")
    public static final void method3018(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field880;
        } else if (var5 >= 100) {
            var6 = field881;
        } else {
            var6 = (field881 - field880) * var5 / 100 + field880;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field805) {
            short var8 = field805;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field885) {
                var6 = field885;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class321.method5578();
                    class321.method5589(arg0, arg1, var10, arg3, -16777216);
                    class321.method5589(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field887) {
            short var11 = field887;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field797) {
                var6 = field797;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class321.method5578();
                    class321.method5589(arg0, arg1, arg2, var13, -16777216);
                    class321.method5589(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field892 = arg3 * var6 / 334;
        if (field890 != arg2 || field891 != arg3) {
            method3326(arg2, arg3);
        }
        field888 = arg0;
        field889 = arg1;
        field890 = arg2;
        field891 = arg3;
    }

    @ObfuscatedName("ay.gr(I)V")
    public static void method568() {
        if (field748) {
            method139(Statics.field585, false);
        }
    }

    @ObfuscatedName("g.gp(B)V")
    public static void method253() {
        int var0 = class90.field1234;
        int[] var1 = class90.field1235;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field756 != var1[var2] && field676 != var1[var2]) {
                method139(field745[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("s.gy(Lbn;ZI)V")
    public static void method139(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1108() || arg0.field599) {
            return;
        }
        arg0.field610 = false;
        if ((field846 && class90.field1234 > 50 || class90.field1234 > 200) && arg1 && arg0.field952 == arg0.field928) {
            arg0.field610 = true;
        }
        int var2 = arg0.field937 >> 7;
        int var3 = arg0.field923 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method673(0, 0, 0, false, arg0.field616);
        if (arg0.field593 != null && field641 >= arg0.field600 && field641 < arg0.field601) {
            arg0.field610 = false;
            arg0.field619 = method1045(arg0.field937, arg0.field923, Statics.field1929);
            arg0.field925 = field641;
            Statics.field86.method2846(Statics.field1929, arg0.field937, arg0.field923, arg0.field619, 60, arg0, arg0.field924, var4, arg0.field606, arg0.field607, arg0.field608, arg0.field609);
            return;
        }
        if ((arg0.field937 & 0x7F) == 64 && (arg0.field923 & 0x7F) == 64) {
            if (field727 == field899[var2][var3]) {
                return;
            }
            field899[var2][var3] = field727;
        }
        arg0.field619 = method1045(arg0.field937, arg0.field923, Statics.field1929);
        arg0.field925 = field641;
        Statics.field86.method2845(Statics.field1929, arg0.field937, arg0.field923, arg0.field619, 60, arg0, arg0.field924, var4, arg0.field948);
    }

    @ObfuscatedName("if.gh(ZB)V")
    public static final void method3878(boolean arg0) {
        for (int var1 = 0; var1 < field672; var1++) {
            class80 var2 = field762[field905[var1]];
            if (var2 != null && var2.method1108() && var2.field1106.field3441 == arg0 && var2.field1106.method4344()) {
                int var3 = var2.field937 >> 7;
                int var4 = var2.field923 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field926 == 1 && (var2.field937 & 0x7F) == 64 && (var2.field923 & 0x7F) == 64) {
                        if (field727 == field899[var3][var4]) {
                            continue;
                        }
                        field899[var3][var4] = field727;
                    }
                    long var5 = class129.method673(0, 0, 1, !var2.field1106.field3444, field905[var1]);
                    var2.field925 = field641;
                    Statics.field86.method2845(Statics.field1929, var2.field937, var2.field923, method1045(var2.field937 + (var2.field926 * 64 - 64), var2.field923 + (var2.field926 * 64 - 64), Statics.field1929), var2.field926 * 64 - 64 + 60, var2, var2.field924, var5, var2.field948);
                }
            }
        }
    }

    @ObfuscatedName("eh.gc(I)V")
    public static final void method3064() {
        for (class78 var0 = (class78) field760.method4540(); var0 != null; var0 = (class78) field760.method4533()) {
            if (Statics.field1929 != var0.field1088 || var0.field1095) {
                var0.method3292();
            } else if (field641 >= var0.field1087) {
                var0.method1854(field691);
                if (var0.field1095) {
                    var0.method3292();
                } else {
                    Statics.field86.method2845(var0.field1088, var0.field1086, var0.field1090, var0.field1091, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("m.go(B)I")
    public static final int method247() {
        if (Statics.field1071.field1028) {
            return Statics.field1929;
        }
        int var0 = 3;
        if (Statics.field1714 < 310) {
            int var1;
            int var2;
            if (field704 == 1) {
                var1 = Statics.field140 >> 7;
                var2 = Statics.field2346 >> 7;
            } else {
                var1 = Statics.field585.field937 >> 7;
                var2 = Statics.field585.field923 >> 7;
            }
            int var3 = Statics.field2389 >> 7;
            int var4 = Statics.field1937 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1929;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1929;
            }
            if ((class57.field492[Statics.field1929][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1929;
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
                    if ((class57.field492[Statics.field1929][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1929;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class57.field492[Statics.field1929][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1929;
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
                    if ((class57.field492[Statics.field1929][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1929;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class57.field492[Statics.field1929][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1929;
                        }
                    }
                }
            }
        }
        if (Statics.field585.field937 >= 0 && Statics.field585.field923 >= 0 && Statics.field585.field937 < 13312 && Statics.field585.field923 < 13312) {
            if ((class57.field492[Statics.field1929][Statics.field585.field937 >> 7][Statics.field585.field923 >> 7] & 0x4) != 0) {
                var0 = Statics.field1929;
            }
            return var0;
        } else {
            return Statics.field1929;
        }
    }

    @ObfuscatedName("n.gg(I)I")
    public static final int method182() {
        if (Statics.field1071.field1028) {
            return Statics.field1929;
        } else {
            int var0 = method1045(Statics.field2389, Statics.field1937, Statics.field1929);
            return var0 - Statics.field539 >= 800 || (class57.field492[Statics.field1929][Statics.field2389 >> 7][Statics.field1937 >> 7] & 0x4) == 0 ? 3 : Statics.field1929;
        }
    }

    @ObfuscatedName("av.gu(IIB)V")
    public static final void method345(int arg0, int arg1) {
        if (field637 == 2) {
            method690((field652 - Statics.field2477 << 7) + field655, (field653 - Statics.field562 << 7) + field656, field654 * 2);
            if (field669 > -1 && field641 % 20 < 10) {
                Statics.field92[0].method5712(field669 + arg0 - 12, field764 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cb.he(B)Z")
    public static boolean method1896() {
        return (field749 & 0x4) != 0;
    }

    @ObfuscatedName("el.hd(I)Z")
    public static boolean method3025() {
        return (field749 & 0x1) != 0;
    }

    @ObfuscatedName("y.hj(I)Z")
    public static boolean method14() {
        return (field749 & 0x2) != 0;
    }

    @ObfuscatedName("fm.ht(B)V")
    public static final void method3270() {
        field679 = 0;
        int var0 = (Statics.field585.field937 >> 7) + Statics.field2477;
        int var1 = (Statics.field585.field923 >> 7) + Statics.field562;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field679 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field679 = 1;
        }
        if (field679 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field679 = 0;
        }
    }

    @ObfuscatedName("gg.hh(Lbv;II)V")
    public static final void method3575(class70 arg0, int arg1) {
        method690(arg0.field937, arg0.field923, arg1);
    }

    @ObfuscatedName("aj.hn(IIII)V")
    public static final void method690(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field669 = -1;
            field764 = -1;
            return;
        }
        int var3 = method1045(arg0, arg1, Statics.field1929) - arg2;
        int var4 = arg0 - Statics.field2389;
        int var5 = var3 - Statics.field539;
        int var6 = arg1 - Statics.field1937;
        int var7 = class131.field1762[Statics.field1714];
        int var8 = class131.field1737[Statics.field1714];
        int var9 = class131.field1762[Statics.field112];
        int var10 = class131.field1737[Statics.field112];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field669 = field892 * var11 / var15 + field890 / 2;
            field764 = field892 * var14 / var15 + field891 / 2;
        } else {
            field669 = -1;
            field764 = -1;
        }
    }

    @ObfuscatedName("bm.hx(IIII)I")
    public static final int method1045(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class57.field492[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class57.field496[var5][var3][var4] + class57.field496[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class57.field496[var5][var3][var4 + 1] + class57.field496[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bq.hg(ZLkl;B)V")
    public static final void method1011(boolean arg0, class299 arg1) {
        field688 = arg0;
        if (!field688) {
            int var2 = arg1.method5290();
            int var3 = arg1.method5149();
            int var4 = arg1.method5112();
            Statics.field397 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field397[var5][var6] = arg1.method5192();
                }
            }
            Statics.field185 = new int[var4];
            Statics.field1226 = new int[var4];
            Statics.field2739 = new int[var4];
            Statics.field1194 = new byte[var4][];
            Statics.field626 = new byte[var4][];
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
                        Statics.field185[var8] = var11;
                        Statics.field1226[var8] = Statics.field141.method3847("m" + var9 + "_" + var10);
                        Statics.field2739[var8] = Statics.field141.method3847("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3054(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method5242() == 1;
        int var13 = arg1.method5150();
        int var14 = arg1.method5112();
        int var15 = arg1.method5112();
        arg1.method5062();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5063(1);
                    if (var19 == 1) {
                        field689[var16][var17][var18] = arg1.method5063(26);
                    } else {
                        field689[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5064();
        Statics.field397 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field397[var20][var21] = arg1.method5192();
            }
        }
        Statics.field185 = new int[var15];
        Statics.field1226 = new int[var15];
        Statics.field2739 = new int[var15];
        Statics.field1194 = new byte[var15][];
        Statics.field626 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field689[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field185[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field185[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1226[var22] = Statics.field141.method3847("m" + var31 + "_" + var32);
                            Statics.field2739[var22] = Statics.field141.method3847("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3054(var14, var13, !var12);
    }

    @ObfuscatedName("ec.hb(IIZS)V")
    public static final void method3054(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field48 == arg0 && Statics.field3568 == arg1) {
            return;
        }
        Statics.field48 = arg0;
        Statics.field3568 = arg1;
        method3347(25);
        method9(class225.field2925, true);
        int var3 = Statics.field2477;
        int var4 = Statics.field562;
        Statics.field2477 = (arg0 - 6) * 8;
        Statics.field562 = (arg1 - 6) * 8;
        int var5 = Statics.field2477 - var3;
        int var6 = Statics.field562 - var4;
        int var7 = Statics.field2477;
        int var8 = Statics.field562;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field762[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field978[var11] -= var5;
                    var10.field979[var11] -= var6;
                }
                var10.field937 -= var5 * 128;
                var10.field923 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field745[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field978[var14] -= var5;
                    var13.field979[var14] -= var6;
                }
                var13.field937 -= var5 * 128;
                var13.field923 -= var6 * 128;
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
                        field817[var25][var21][var22] = field817[var25][var23][var24];
                    } else {
                        field817[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field758.method4540(); var26 != null; var26 = (class69) field758.method4533()) {
            var26.field909 -= var5;
            var26.field910 -= var6;
            if (var26.field909 < 0 || var26.field910 < 0 || var26.field909 >= 104 || var26.field910 >= 104) {
                var26.method3292();
            }
        }
        if (field819 != 0) {
            field819 -= var5;
            field800 -= var6;
        }
        field754 = 0;
        field873 = false;
        Statics.field2389 -= var5 << 7;
        Statics.field1937 -= var6 << 7;
        Statics.field140 -= var5 << 7;
        Statics.field2346 -= var6 << 7;
        field854 = -1;
        field760.method4525();
        field759.method4525();
        for (int var27 = 0; var27 < 4; var27++) {
            field687[var27].method3227();
        }
    }

    @ObfuscatedName("fp.hs(ZI)V")
    public static final void method3257(boolean arg0) {
        method352();
        field668.field1297++;
        if (field668.field1297 < 50 && !arg0) {
            return;
        }
        field668.field1297 = 0;
        if (field678 || field668.method2103() == null) {
            return;
        }
        class182 var1 = class182.method19(class178.field2183, field668.field1294);
        field668.method2084(var1);
        try {
            field668.method2083();
        } catch (IOException var3) {
            field678 = true;
        }
    }

    @ObfuscatedName("iz.hv(IIIIII)V")
    public static final void method4336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field86.method2860(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field86.method2864(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class129.method649(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field2350.field3873;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class129.method12(var5);
            class254 var14 = class254.method3616(var13);
            if (var14.field3344 == -1) {
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
                class324 var15 = Statics.field1995[var14.field3344];
                if (var15 != null) {
                    int var16 = (var14.field3330 * 4 - var15.field3860) / 2;
                    int var17 = (var14.field3331 * 4 - var15.field3857) / 2;
                    var15.method5625(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3331) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field86.method2862(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field86.method2864(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class129.method12(var18);
            class254 var24 = class254.method3616(var23);
            if (var24.field3344 != -1) {
                class324 var25 = Statics.field1995[var24.field3344];
                if (var25 != null) {
                    int var26 = (var24.field3330 * 4 - var25.field3860) / 2;
                    int var27 = (var24.field3331 * 4 - var25.field3857) / 2;
                    var25.method5625(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3331) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class129.method649(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field2350.field3873;
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
        long var31 = Statics.field86.method2863(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class129.method12(var31);
        class254 var34 = class254.method3616(var33);
        if (var34.field3344 == -1) {
            return;
        }
        class324 var35 = Statics.field1995[var34.field3344];
        if (var35 != null) {
            int var36 = (var34.field3330 * 4 - var35.field3860) / 2;
            int var37 = (var34.field3331 * 4 - var35.field3857) / 2;
            var35.method5625(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3331) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hc(Lcr;I)Z")
    public final boolean method1159(class96 arg0) {
        class305 var2 = arg0.method2103();
        class299 var3 = arg0.field1290;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1303 == null) {
                if (arg0.field1298) {
                    if (!var2.method3194(1)) {
                        return false;
                    }
                    var2.method3195(arg0.field1290.field3704, 0, 1);
                    arg0.field1299 = 0;
                    arg0.field1298 = false;
                }
                var3.field3703 = 0;
                if (var3.method5059()) {
                    if (!var2.method3194(1)) {
                        return false;
                    }
                    var2.method3195(arg0.field1290.field3704, 1, 1);
                    arg0.field1299 = 0;
                }
                arg0.field1298 = true;
                class177[] var4 = class177.method3148();
                int var5 = var3.method5087();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3703);
                }
                arg0.field1303 = var4[var5];
                arg0.field1296 = arg0.field1303.field2104;
            }
            if (arg0.field1296 == -1) {
                if (!var2.method3194(1)) {
                    return false;
                }
                arg0.method2103().method3195(var3.field3704, 0, 1);
                arg0.field1296 = var3.field3704[0] & 0xFF;
            }
            if (arg0.field1296 == -2) {
                if (!var2.method3194(2)) {
                    return false;
                }
                arg0.method2103().method3195(var3.field3704, 0, 2);
                var3.field3703 = 0;
                arg0.field1296 = var3.method5112();
            }
            if (!var2.method3194(arg0.field1296)) {
                return false;
            }
            var3.field3703 = 0;
            var2.method3195(var3.field3704, 0, arg0.field1296);
            arg0.field1299 = 0;
            field680.method4624();
            arg0.field1300 = arg0.field1302;
            arg0.field1302 = arg0.field1301;
            arg0.field1301 = arg0.field1303;
            if (class177.field2101 == arg0.field1303) {
                int var6 = var3.method5150();
                int var7 = var3.method5158();
                class213.field2510[var6] = var7;
                if (class213.field2511[var6] != var7) {
                    class213.field2511[var6] = var7;
                }
                method5415(var6);
                field815[++field649 - 1 & 0x1F] = var6;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2108 == arg0.field1303) {
                int var8 = var3.method5150();
                if (var8 == 65535) {
                    var8 = -1;
                }
                method351(var8);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2149 == arg0.field1303) {
                int var9 = var3.method5290();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = var3.method5226();
                method967(var9, var10);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2158 == arg0.field1303) {
                int var11 = var3.method5192();
                if (field711 != var11) {
                    field711 = var11;
                    method694();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2148 == arg0.field1303) {
                method1031();
                arg0.field1303 = null;
                return false;
            }
            if (class177.field2105 == arg0.field1303) {
                int var12 = var3.method5192();
                int var13 = var3.method5192();
                int var14 = class53.method217();
                class182 var15 = class182.method19(class178.field2192, field668.field1294);
                var15.field2303.method5136(field446);
                var15.field2303.method5155(var12);
                var15.field2303.method5155(var13);
                var15.field2303.method5263(var14);
                field668.method2084(var15);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2164 == arg0.field1303) {
                int var16 = var3.method5150();
                int var17 = var3.method5157();
                class218 var18 = Statics.method2628(var17);
                if (var18.field2595 != 1 || var18.field2571 != var16) {
                    var18.field2595 = 1;
                    var18.field2571 = var16;
                    method3272(var18);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2089 == arg0.field1303) {
                field867 = var3.method5110();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2143 == arg0.field1303) {
                method516(class180.field2298);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2121 == arg0.field1303) {
                method248(true, var3);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2115 == arg0.field1303) {
                for (int var19 = 0; var19 < field745.length; var19++) {
                    if (field745[var19] != null) {
                        field745[var19].field955 = -1;
                    }
                }
                for (int var20 = 0; var20 < field762.length; var20++) {
                    if (field762[var20] != null) {
                        field762[var20].field955 = -1;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2113 == arg0.field1303) {
                int var21 = var3.method5159();
                class218 var22 = Statics.method2628(var21);
                for (int var23 = 0; var23 < var22.field2676.length; var23++) {
                    var22.field2676[var23] = -1;
                    var22.field2676[var23] = 0;
                }
                method3272(var22);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2161 == arg0.field1303) {
                int var24 = var3.method5192();
                int var25 = var3.method5132();
                class218 var26 = Statics.method2628(var24);
                if (var26.field2596 != var25 || var25 == -1) {
                    var26.field2596 = var25;
                    var26.field2680 = 0;
                    var26.field2681 = 0;
                    method3272(var26);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2165 == arg0.field1303) {
                method516(class180.field2299);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2160 == arg0.field1303) {
                Statics.field586.field1042.method4712(var3, arg0.field1296);
                method925();
                field712 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2114 == arg0.field1303) {
                method4806();
                field796 = var3.method5110();
                field826 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2153 == arg0.field1303) {
                int var27 = var3.method5150();
                int var28 = var3.method5157();
                class218 var29 = Statics.method2628(var28);
                if (var29 != null && var29.field2554 == 0) {
                    if (var27 > var29.field2586 - var29.field2693) {
                        var27 = var29.field2586 - var29.field2693;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    if (var29.field2574 != var27) {
                        var29.field2574 = var27;
                        method3272(var29);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2111 == arg0.field1303) {
                for (int var30 = 0; var30 < class213.field2511.length; var30++) {
                    if (class213.field2511[var30] != class213.field2510[var30]) {
                        class213.field2511[var30] = class213.field2510[var30];
                        method5415(var30);
                        field815[++field649 - 1 & 0x1F] = var30;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2141 == arg0.field1303) {
                Statics.field586.method1677();
                field712 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2154 == arg0.field1303) {
                int var31 = arg0.field1296 + var3.field3703;
                int var32 = var3.method5112();
                int var33 = var3.method5112();
                if (field789 != var32) {
                    field789 = var32;
                    this.method1403(false);
                    method924(field789);
                    class77.method1975(field789);
                    for (int var34 = 0; var34 < 100; var34++) {
                        field834[var34] = true;
                    }
                }
                while (var33-- > 0) {
                    int var35 = var3.method5192();
                    int var36 = var3.method5112();
                    int var37 = var3.method5110();
                    class62 var38 = (class62) field790.method5499((long) var35);
                    if (var38 != null && var38.field548 != var36) {
                        method3969(var38, true);
                        var38 = null;
                    }
                    if (var38 == null) {
                        var38 = method966(var35, var36, var37);
                    }
                    var38.field547 = true;
                }
                for (class62 var39 = (class62) field790.method5501(); var39 != null; var39 = (class62) field790.method5500()) {
                    if (var39.field547) {
                        var39.field547 = false;
                    } else {
                        method3969(var39, true);
                    }
                }
                field831 = new class318(512);
                while (var3.field3703 < var31) {
                    int var40 = var3.method5192();
                    int var41 = var3.method5112();
                    int var42 = var3.method5112();
                    int var43 = var3.method5192();
                    for (int var44 = var41; var44 <= var42; var44++) {
                        long var45 = ((long) var40 << 32) + (long) var44;
                        field831.method5502(new class187(var43), var45);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2155 == arg0.field1303) {
                method4806();
                int var47 = var3.method5195();
                int var48 = var3.method5195();
                int var49 = var3.method5158();
                field763[var48] = var49;
                field671[var48] = var47;
                field788[var48] = 1;
                for (int var50 = 0; var50 < 98; var50++) {
                    if (var49 >= class222.field2732[var50]) {
                        field788[var48] = var50 + 2;
                    }
                }
                field818[++field820 - 1 & 0x1F] = var48;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2096 == arg0.field1303) {
                method516(class180.field2290);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2123 == arg0.field1303) {
                method516(class180.field2291);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2129 == arg0.field1303) {
                int var51 = var3.method5290();
                int var52 = var3.method5290();
                int var53 = var3.method5192();
                class218 var54 = Statics.method2628(var53);
                var54.field2608 = (var52 << 16) + var51;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2135 == arg0.field1303) {
                int var55 = var3.method5112();
                int var56 = var3.method5110();
                int var57 = var3.method5112();
                method4618(var55, var56, var57);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2139 == arg0.field1303) {
                field873 = false;
                for (int var58 = 0; var58 < 5; var58++) {
                    field780[var58] = false;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2156 == arg0.field1303) {
                method1011(true, arg0.field1290);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2110 == arg0.field1303) {
                method516(class180.field2296);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2136 == arg0.field1303) {
                int var59 = var3.method5149();
                byte var60 = var3.method5142();
                class213.field2510[var59] = var60;
                if (class213.field2511[var59] != var60) {
                    class213.field2511[var59] = var60;
                }
                method5415(var59);
                field815[++field649 - 1 & 0x1F] = var59;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2126 == arg0.field1303) {
                method516(class180.field2294);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2094 == arg0.field1303) {
                int var61 = var3.method5110();
                if (var3.method5110() == 0) {
                    field897[var61] = new class10();
                    var3.field3703 += 18;
                } else {
                    var3.field3703--;
                    field897[var61] = new class10(var3, false);
                }
                field824 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2163 == arg0.field1303) {
                Statics.field2521 = var3.method5195();
                Statics.field8 = var3.method5242();
                while (var3.field3703 < arg0.field1296) {
                    int var62 = var3.method5110();
                    class180 var63 = class180.method1664()[var62];
                    method516(var63);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2116 == arg0.field1303) {
                field844 = var3.method5112() * 30;
                field826 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2103 == arg0.field1303) {
                int var64 = var3.method5157();
                int var65 = var3.method5290();
                int var66 = var65 >> 10 & 0x1F;
                int var67 = var65 >> 5 & 0x1F;
                int var68 = var65 & 0x1F;
                int var69 = (var68 << 3) + (var66 << 19) + (var67 << 11);
                class218 var70 = Statics.method2628(var64);
                if (var70.field2577 != var69) {
                    var70.field2577 = var69;
                    method3272(var70);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2169 == arg0.field1303) {
                byte[] var71 = new byte[arg0.field1296];
                var3.method5061(var71, 0, var71.length);
                class300 var72 = new class300(var71);
                String var73 = var72.method5119();
                class51.method129(var73, true, false);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2171 == arg0.field1303) {
                int var74 = var3.method5159();
                int var75 = var3.method5159();
                int var76 = var3.method5150();
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = var3.method5112();
                if (var77 == 65535) {
                    var77 = -1;
                }
                for (int var78 = var77; var78 <= var76; var78++) {
                    long var79 = ((long) var74 << 32) + (long) var78;
                    class188 var81 = field831.method5499(var79);
                    if (var81 != null) {
                        var81.method3292();
                    }
                    field831.method5502(new class187(var75), var79);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2112 == arg0.field1303) {
                int var82 = var3.method5192();
                int var83 = var3.method5112();
                if (var82 < -70000) {
                    var83 += 32768;
                }
                class218 var84;
                if (var82 >= 0) {
                    var84 = Statics.method2628(var82);
                } else {
                    var84 = null;
                }
                if (var84 != null) {
                    for (int var85 = 0; var85 < var84.field2676.length; var85++) {
                        var84.field2676[var85] = 0;
                        var84.field2679[var85] = 0;
                    }
                }
                Statics.method1687(var83);
                int var86 = var3.method5112();
                for (int var87 = 0; var87 < var86; var87++) {
                    int var88 = var3.method5139();
                    if (var88 == 255) {
                        var88 = var3.method5159();
                    }
                    int var89 = var3.method5112();
                    if (var84 != null && var87 < var84.field2676.length) {
                        var84.field2676[var87] = var89;
                        var84.field2679[var87] = var88;
                    }
                    class60.method715(var83, var87, var89 - 1, var88);
                }
                if (var84 != null) {
                    method3272(var84);
                }
                method4806();
                field811[++field702 - 1 & 0x1F] = var83 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2168 == arg0.field1303) {
                if (Statics.field2499 != null) {
                    Statics.field2499.method4846(var3);
                }
                method3653();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2157 == arg0.field1303) {
                boolean var90 = var3.method5242() == 1;
                int var91 = var3.method5192();
                class218 var92 = Statics.method2628(var91);
                if (var92.field2572 != var90) {
                    var92.field2572 = var90;
                    method3272(var92);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2145 == arg0.field1303) {
                int var93 = var3.method5110();
                method4948(var93);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2087 == arg0.field1303) {
                field637 = var3.method5110();
                if (field637 == 1) {
                    field822 = var3.method5112();
                }
                if (field637 >= 2 && field637 <= 6) {
                    if (field637 == 2) {
                        field655 = 64;
                        field656 = 64;
                    }
                    if (field637 == 3) {
                        field655 = 0;
                        field656 = 64;
                    }
                    if (field637 == 4) {
                        field655 = 128;
                        field656 = 64;
                    }
                    if (field637 == 5) {
                        field655 = 64;
                        field656 = 0;
                    }
                    if (field637 == 6) {
                        field655 = 64;
                        field656 = 128;
                    }
                    field637 = 2;
                    field652 = var3.method5112();
                    field653 = var3.method5112();
                    field654 = var3.method5110();
                }
                if (field637 == 10) {
                    field651 = var3.method5112();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2118 == arg0.field1303) {
                field873 = true;
                Statics.field1112 = var3.method5110();
                Statics.field3590 = var3.method5110();
                Statics.field874 = var3.method5112();
                Statics.field2311 = var3.method5110();
                Statics.field624 = var3.method5110();
                if (Statics.field624 >= 100) {
                    int var94 = Statics.field1112 * 128 + 64;
                    int var95 = Statics.field3590 * 128 + 64;
                    int var96 = method1045(var94, var95, Statics.field1929) - Statics.field874;
                    int var97 = var94 - Statics.field2389;
                    int var98 = var96 - Statics.field539;
                    int var99 = var95 - Statics.field1937;
                    int var100 = (int) Math.sqrt((double) (var97 * var97 + var99 * var99));
                    Statics.field1714 = (int) (Math.atan2((double) var98, (double) var100) * 325.949D) & 0x7FF;
                    Statics.field112 = (int) (Math.atan2((double) var97, (double) var99) * -325.949D) & 0x7FF;
                    if (Statics.field1714 < 128) {
                        Statics.field1714 = 128;
                    }
                    if (Statics.field1714 > 383) {
                        Statics.field1714 = 383;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2095 == arg0.field1303) {
                Statics.field2521 = var3.method5110();
                Statics.field8 = var3.method5242();
                for (int var101 = Statics.field8; var101 < Statics.field8 + 8; var101++) {
                    for (int var102 = Statics.field2521; var102 < Statics.field2521 + 8; var102++) {
                        if (field817[Statics.field1929][var101][var102] != null) {
                            field817[Statics.field1929][var101][var102] = null;
                            method3726(var101, var102);
                        }
                    }
                }
                for (class69 var103 = (class69) field758.method4540(); var103 != null; var103 = (class69) field758.method4533()) {
                    if (var103.field909 >= Statics.field8 && var103.field909 < Statics.field8 + 8 && var103.field910 >= Statics.field2521 && var103.field910 < Statics.field2521 + 8 && Statics.field1929 == var103.field914) {
                        var103.field907 = 0;
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2093 == arg0.field1303) {
                int var104 = var3.method5124();
                boolean var105 = var3.method5110() == 1;
                String var106 = "";
                boolean var107 = false;
                if (var105) {
                    var106 = var3.method5119();
                    if (Statics.field586.method1682(new class283(var106, Statics.field2325))) {
                        var107 = true;
                    }
                }
                String var108 = var3.method5119();
                if (!var107) {
                    class92.method1894(var104, var106, var108);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2140 == arg0.field1303) {
                Statics.field586.method1700(var3, arg0.field1296);
                field712 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2090 == arg0.field1303) {
                field873 = true;
                Statics.field3478 = var3.method5110();
                Statics.field148 = var3.method5110();
                Statics.field398 = var3.method5112();
                Statics.field3313 = var3.method5110();
                Statics.field93 = var3.method5110();
                if (Statics.field93 >= 100) {
                    Statics.field2389 = Statics.field3478 * 128 + 64;
                    Statics.field1937 = Statics.field148 * 128 + 64;
                    Statics.field539 = method1045(Statics.field2389, Statics.field1937, Statics.field1929) - Statics.field398;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2147 == arg0.field1303) {
                int var109 = var3.method5112();
                field789 = var109;
                this.method1403(false);
                method924(var109);
                class77.method1975(field789);
                for (int var110 = 0; var110 < 100; var110++) {
                    field834[var110] = true;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2091 == arg0.field1303) {
                field845 = var3.method5139();
                field849 = var3.method5242();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2124 == arg0.field1303) {
                method516(class180.field2295);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2167 == arg0.field1303) {
                Statics.field2501 = class310.method752(var3.method5110());
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2170 == arg0.field1303) {
                String var111 = var3.method5119();
                long var112 = var3.method5116();
                long var114 = (long) var3.method5112();
                long var116 = (long) var3.method5226();
                class229 var118 = (class229) class196.method2065(class229.method3544(), var3.method5110());
                long var119 = (var114 << 32) + var116;
                boolean var121 = false;
                for (int var122 = 0; var122 < 100; var122++) {
                    if (field708[var122] == var119) {
                        var121 = true;
                        break;
                    }
                }
                if (var118.field3076 && Statics.field586.method1682(new class283(var111, Statics.field2325))) {
                    var121 = true;
                }
                if (!var121 && field679 == 0) {
                    field708[field683] = var119;
                    field683 = (field683 + 1) % 100;
                    String var123 = class295.method4965(class291.method4809(class207.method1858(var3)));
                    if (var118.field3074 == -1) {
                        class92.method869(9, var111, var123, class289.method3256(var112));
                    } else {
                        class92.method869(9, class82.method2079(var118.field3074) + var111, var123, class289.method3256(var112));
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2132 == arg0.field1303) {
                method3994(var3.method5119());
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2134 == arg0.field1303) {
                int var124 = var3.method5158();
                int var125 = var3.method5157();
                class62 var126 = (class62) field790.method5499((long) var125);
                class62 var127 = (class62) field790.method5499((long) var124);
                if (var127 != null) {
                    method3969(var127, var126 == null || var126.field548 != var127.field548);
                }
                if (var126 != null) {
                    var126.method3292();
                    field790.method5502(var126, (long) var124);
                }
                class218 var128 = Statics.method2628(var125);
                if (var128 != null) {
                    method3272(var128);
                }
                class218 var129 = Statics.method2628(var124);
                if (var129 != null) {
                    method3272(var129);
                    Statics.method2023(Statics.field1950[var129.field2669 >>> 16], var129, true);
                }
                if (field789 != -1) {
                    method1025(field789, 1);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2088 == arg0.field1303) {
                boolean var130 = var3.method5110() == 1;
                if (var130) {
                    Statics.field1523 = class297.method481() - var3.method5116();
                    Statics.field1271 = new class7(var3, true);
                } else {
                    Statics.field1271 = null;
                }
                field861 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2142 == arg0.field1303) {
                int var131 = var3.method5192();
                class218 var132 = Statics.method2628(var131);
                var132.field2595 = 3;
                var132.field2571 = Statics.field585.field595.method3626();
                method3272(var132);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2166 == arg0.field1303) {
                class90.method1088(var3, arg0.field1296);
                method1859();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2117 == arg0.field1303) {
                method1011(false, arg0.field1290);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2127 == arg0.field1303) {
                int var133 = var3.method5112();
                int var134 = var3.method5242();
                int var135 = var3.method5157();
                class62 var136 = (class62) field790.method5499((long) var135);
                if (var136 != null) {
                    method3969(var136, var136.field548 != var133);
                }
                method966(var135, var133, var134);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2131 == arg0.field1303) {
                int var137 = var3.method5290();
                if (var137 == 65535) {
                    var137 = -1;
                }
                int var138 = var3.method5192();
                int var139 = var3.method5158();
                class218 var140 = Statics.method2628(var138);
                if (var140.field2607) {
                    var140.field2664 = var137;
                    var140.field2694 = var139;
                    class255 var142 = Statics.method3278(var137);
                    var140.field2559 = var142.field3384;
                    var140.field2604 = var142.field3385;
                    var140.field2605 = var142.field3386;
                    var140.field2601 = var142.field3387;
                    var140.field2602 = var142.field3369;
                    var140.field2644 = var142.field3383;
                    if (var142.field3411 == 1) {
                        var140.field2552 = 1;
                    } else {
                        var140.field2552 = 2;
                    }
                    if (var140.field2646 > 0) {
                        var140.field2644 = var140.field2644 * 32 / var140.field2646;
                    } else if (var140.field2657 > 0) {
                        var140.field2644 = var140.field2644 * 32 / var140.field2657;
                    }
                    method3272(var140);
                } else if (var137 == -1) {
                    var140.field2595 = 0;
                    arg0.field1303 = null;
                    return true;
                } else {
                    class255 var141 = Statics.method3278(var137);
                    var140.field2595 = 4;
                    var140.field2571 = var137;
                    var140.field2559 = var141.field3384;
                    var140.field2604 = var141.field3385;
                    var140.field2644 = var141.field3383 * 100 / var139;
                    method3272(var140);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2172 == arg0.field1303) {
                Statics.field8 = var3.method5139();
                Statics.field2521 = var3.method5195();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2152 == arg0.field1303) {
                var3.field3703 += 28;
                if (var3.method5135()) {
                    method718(var3, var3.field3703 - 28);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2130 == arg0.field1303) {
                String var143 = var3.method5119();
                int var144 = var3.method5242();
                int var145 = var3.method5195();
                if (var145 >= 1 && var145 <= 8) {
                    if (var143.equalsIgnoreCase(class225.field2800)) {
                        var143 = null;
                    }
                    field766[var145 - 1] = var143;
                    field644[var145 - 1] = var144 == 0;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2128 == arg0.field1303) {
                int var146 = var3.method5110();
                method156(var146);
                arg0.field1303 = null;
                return false;
            }
            if (class177.field2102 == arg0.field1303) {
                method516(class180.field2293);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2150 == arg0.field1303) {
                String var147 = var3.method5119();
                String var148 = class295.method4965(class291.method4809(class207.method1858(var3)));
                class92.method1894(6, var147, var148);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2137 == arg0.field1303) {
                class118.method2513(var3, arg0.field1296);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2098 == arg0.field1303) {
                int var149 = var3.method5290();
                class60.method50(var149);
                field811[++field702 - 1 & 0x1F] = var149 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2100 == arg0.field1303) {
                class72 var150 = new class72();
                var150.field1002 = var3.method5119();
                var150.field1005 = var3.method5112();
                int var151 = var3.method5192();
                var150.field1000 = var151;
                method3347(45);
                var2.method3191();
                Object var152 = null;
                Statics.method692(var150);
                arg0.field1303 = null;
                return false;
            }
            if (class177.field2120 == arg0.field1303) {
                int var153 = var3.method5149();
                int var154 = var3.method5149();
                int var155 = var3.method5290();
                int var156 = var3.method5192();
                class218 var157 = Statics.method2628(var156);
                if (var157.field2559 != var154 || var157.field2604 != var155 || var157.field2644 != var153) {
                    var157.field2559 = var154;
                    var157.field2604 = var155;
                    var157.field2644 = var153;
                    method3272(var157);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2107 == arg0.field1303) {
                if (arg0.field1296 == 0) {
                    Statics.field2499 = null;
                } else {
                    if (Statics.field2499 == null) {
                        Statics.field2499 = new class284(Statics.field2325, Statics.field2488);
                    }
                    Statics.field2499.method4845(var3);
                }
                method3653();
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2146 == arg0.field1303) {
                String var158 = var3.method5119();
                Object[] var159 = new Object[var158.length() + 1];
                for (int var160 = var158.length() - 1; var160 >= 0; var160--) {
                    if (var158.charAt(var160) == 's') {
                        var159[var160 + 1] = var3.method5119();
                    } else {
                        var159[var160 + 1] = Integer.valueOf(var3.method5192());
                    }
                }
                var159[0] = Integer.valueOf(var3.method5192());
                class63 var161 = new class63();
                var161.field550 = var159;
                class77.method1570(var161);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2092 == arg0.field1303) {
                int var162 = var3.method5110();
                int var163 = var3.method5110();
                int var164 = var3.method5110();
                int var165 = var3.method5110();
                field780[var162] = true;
                field876[var162] = var163;
                field877[var162] = var164;
                field878[var162] = var165;
                field879[var162] = 0;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2099 == arg0.field1303) {
                field819 = var3.method5110();
                if (field819 == 255) {
                    field819 = 0;
                }
                field800 = var3.method5110();
                if (field800 == 255) {
                    field800 = 0;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2122 == arg0.field1303) {
                int var166 = var3.method5192();
                int var167 = var3.method5290();
                class218 var168 = Statics.method2628(var166);
                if (var168.field2595 != 2 || var168.field2571 != var167) {
                    var168.field2595 = 2;
                    var168.field2571 = var167;
                    method3272(var168);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2125 == arg0.field1303) {
                int var169 = var3.method5151();
                int var170 = var3.method5158();
                int var171 = var3.method5132();
                class218 var172 = Statics.method2628(var170);
                if (var172.field2561 != var171 || var172.field2562 != var169 || var172.field2557 != 0 || var172.field2558 != 0) {
                    var172.field2561 = var171;
                    var172.field2562 = var169;
                    var172.field2557 = 0;
                    var172.field2558 = 0;
                    method3272(var172);
                    this.method1164(var172);
                    if (var172.field2554 == 0) {
                        Statics.method2023(Statics.field1950[var170 >> 16], var172, false);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2159 == arg0.field1303) {
                if (field789 != -1) {
                    method1025(field789, 0);
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2151 == arg0.field1303) {
                String var173 = var3.method5119();
                long var174 = (long) var3.method5112();
                long var176 = (long) var3.method5226();
                class229 var178 = (class229) class196.method2065(class229.method3544(), var3.method5110());
                long var179 = (var174 << 32) + var176;
                boolean var181 = false;
                for (int var182 = 0; var182 < 100; var182++) {
                    if (field708[var182] == var179) {
                        var181 = true;
                        break;
                    }
                }
                if (Statics.field586.method1682(new class283(var173, Statics.field2325))) {
                    var181 = true;
                }
                if (!var181 && field679 == 0) {
                    field708[field683] = var179;
                    field683 = (field683 + 1) % 100;
                    String var183 = class295.method4965(class291.method4809(class207.method1858(var3)));
                    byte var184;
                    if (var178.field3075) {
                        var184 = 7;
                    } else {
                        var184 = 3;
                    }
                    if (var178.field3074 == -1) {
                        class92.method1894(var184, var173, var183);
                    } else {
                        class92.method1894(var184, class82.method2079(var178.field3074) + var173, var183);
                    }
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2144 == arg0.field1303) {
                int var185 = var3.method5192();
                class62 var186 = (class62) field790.method5499((long) var185);
                if (var186 != null) {
                    method3969(var186, true);
                }
                if (field795 != null) {
                    method3272(field795);
                    field795 = null;
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2162 == arg0.field1303) {
                int var187 = var3.method5192();
                int var188 = var3.method5112();
                if (var187 < -70000) {
                    var188 += 32768;
                }
                class218 var189;
                if (var187 >= 0) {
                    var189 = Statics.method2628(var187);
                } else {
                    var189 = null;
                }
                while (var3.field3703 < arg0.field1296) {
                    int var190 = var3.method5124();
                    int var191 = var3.method5112();
                    int var192 = 0;
                    if (var191 != 0) {
                        var192 = var3.method5110();
                        if (var192 == 255) {
                            var192 = var3.method5192();
                        }
                    }
                    if (var189 != null && var190 >= 0 && var190 < var189.field2676.length) {
                        var189.field2676[var190] = var191;
                        var189.field2679[var190] = var192;
                    }
                    class60.method715(var188, var190, var191 - 1, var192);
                }
                if (var189 != null) {
                    method3272(var189);
                }
                method4806();
                field811[++field702 - 1 & 0x1F] = var188 & 0x7FFF;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2133 == arg0.field1303) {
                method4806();
                field725 = var3.method5113();
                field826 = field814;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2119 == arg0.field1303) {
                for (int var193 = 0; var193 < Statics.field3179; var193++) {
                    class241 var194 = class241.method3055(var193);
                    if (var194 != null) {
                        class213.field2510[var193] = 0;
                        class213.field2511[var193] = 0;
                    }
                }
                method4806();
                field649 += 32;
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2138 == arg0.field1303) {
                method516(class180.field2297);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2174 == arg0.field1303) {
                boolean var195 = var3.method5291();
                if (!var195) {
                    Statics.field2535 = null;
                } else if (Statics.field2535 == null) {
                    Statics.field2535 = new class238();
                }
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2109 == arg0.field1303) {
                method516(class180.field2292);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2106 == arg0.field1303) {
                method248(false, var3);
                arg0.field1303 = null;
                return true;
            }
            if (class177.field2097 == arg0.field1303) {
                int var196 = var3.method5159();
                String var197 = var3.method5119();
                class218 var198 = Statics.method2628(var196);
                if (!var197.equals(var198.field2576)) {
                    var198.field2576 = var197;
                    method3272(var198);
                }
                arg0.field1303 = null;
                return true;
            }
            class341.method5815("" + (arg0.field1303 == null ? -1 : arg0.field1303.field2173) + class82.field1122 + (arg0.field1302 == null ? -1 : arg0.field1302.field2173) + class82.field1122 + (arg0.field1300 == null ? -1 : arg0.field1300.field2173) + class82.field1122 + arg0.field1296, (Throwable) null);
            method1031();
        } catch (IOException var203) {
            method3746();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1303 == null ? -1 : arg0.field1303.field2173) + class82.field1122 + (arg0.field1302 == null ? -1 : arg0.field1302.field2173) + class82.field1122 + (arg0.field1300 == null ? -1 : arg0.field1300.field2173) + class82.field1122 + arg0.field1296 + class82.field1122 + (Statics.field2477 + Statics.field585.field978[0]) + class82.field1122 + (Statics.field562 + Statics.field585.field979[0]) + class82.field1122;
            for (int var202 = 0; var202 < arg0.field1296 && var202 < 50; var202++) {
                var201 = var201 + var3.field3704[var202] + class82.field1122;
            }
            class341.method5815(var201, var204);
            method1031();
        }
        return true;
    }

    @ObfuscatedName("ao.hw(Lfi;I)V")
    public static final void method516(class180 arg0) {
        class299 var1 = field668.field1290;
        if (class180.field2294 == arg0) {
            int var2 = var1.method5195();
            int var3 = (var2 >> 4 & 0x7) + Statics.field8;
            int var4 = (var2 & 0x7) + Statics.field2521;
            int var5 = var1.method5290();
            int var6 = var1.method5110();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field690[var7];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method1089(Statics.field1929, var3, var4, var9, var5, var7, var8, 0, -1);
            }
        } else if (class180.field2291 == arg0) {
            int var10 = var1.method5149();
            int var11 = var1.method5290();
            int var12 = var1.method5110();
            int var13 = (var12 >> 4 & 0x7) + Statics.field8;
            int var14 = (var12 & 0x7) + Statics.field2521;
            int var15 = var1.method5242();
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                int var16 = var13 * 128 + 64;
                int var17 = var14 * 128 + 64;
                class78 var18 = new class78(var10, Statics.field1929, var16, var17, method1045(var16, var17, Statics.field1929) - var15, var11, field641);
                field760.method4554(var18);
            }
        } else if (class180.field2296 == arg0) {
            int var19 = var1.method5149();
            int var20 = var1.method5150();
            int var21 = var1.method5110();
            int var22 = (var21 >> 4 & 0x7) + Statics.field8;
            int var23 = (var21 & 0x7) + Statics.field2521;
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class88 var24 = new class88();
                var24.field1222 = var19;
                var24.field1221 = var20;
                if (field817[Statics.field1929][var22][var23] == null) {
                    field817[Statics.field1929][var22][var23] = new class262();
                }
                field817[Statics.field1929][var22][var23].method4554(var24);
                method3726(var22, var23);
            }
        } else {
            if (class180.field2298 == arg0) {
                int var25 = var1.method5290();
                int var26 = var1.method5242();
                int var27 = var1.method5139();
                int var28 = (var27 >> 4 & 0x7) + Statics.field8;
                int var29 = (var27 & 0x7) + Statics.field2521;
                int var30 = var1.method5242();
                int var31 = var30 >> 4 & 0xF;
                int var32 = var30 & 0x7;
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    int var33 = var31 + 1;
                    if (Statics.field585.field978[0] >= var28 - var33 && Statics.field585.field978[0] <= var28 + var33 && Statics.field585.field979[0] >= var29 - var33 && Statics.field585.field979[0] <= var29 + var33 && field636 != 0 && var32 > 0 && field754 < 50) {
                        field868[field754] = var25;
                        field757[field754] = var32;
                        field779[field754] = var26;
                        field872[field754] = null;
                        field871[field754] = (var28 << 16) + (var29 << 8) + var31;
                        field754++;
                    }
                }
            }
            if (class180.field2290 == arg0) {
                int var34 = var1.method5110();
                int var35 = var1.method5242() * 4;
                int var36 = var1.method5290();
                byte var37 = var1.method5144();
                int var38 = var1.method5290();
                int var39 = var1.method5139();
                int var40 = (var39 >> 4 & 0x7) + Statics.field8;
                int var41 = (var39 & 0x7) + Statics.field2521;
                int var42 = var1.method5151();
                int var43 = var1.method5242();
                int var44 = var1.method5150();
                int var45 = var1.method5139() * 4;
                byte var46 = var1.method5144();
                int var47 = var40 + var46;
                int var48 = var37 + var41;
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var38 != 65535) {
                    int var49 = var40 * 128 + 64;
                    int var50 = var41 * 128 + 64;
                    int var51 = var47 * 128 + 64;
                    int var52 = var48 * 128 + 64;
                    class87 var53 = new class87(var38, Statics.field1929, var49, var50, method1045(var49, var50, Statics.field1929) - var35, field641 + var44, field641 + var36, var34, var43, var42, var45);
                    var53.method1939(var51, var52, method1045(var51, var52, Statics.field1929) - var45, field641 + var44);
                    field759.method4554(var53);
                }
            } else if (class180.field2297 == arg0) {
                int var54 = var1.method5139();
                int var55 = var54 >> 2;
                int var56 = var54 & 0x3;
                int var57 = field690[var55];
                int var58 = var1.method5110();
                int var59 = (var58 >> 4 & 0x7) + Statics.field8;
                int var60 = (var58 & 0x7) + Statics.field2521;
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    method1089(Statics.field1929, var59, var60, var57, -1, var55, var56, 0, -1);
                }
            } else if (class180.field2295 == arg0) {
                int var61 = var1.method5150();
                int var62 = var1.method5149();
                int var63 = var1.method5290();
                int var64 = var1.method5242();
                int var65 = (var64 >> 4 & 0x7) + Statics.field8;
                int var66 = (var64 & 0x7) + Statics.field2521;
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    class262 var67 = field817[Statics.field1929][var65][var66];
                    if (var67 != null) {
                        for (class88 var68 = (class88) var67.method4540(); var68 != null; var68 = (class88) var67.method4533()) {
                            if ((var62 & 0x7FFF) == var68.field1222 && var68.field1221 == var63) {
                                var68.field1221 = var61;
                                break;
                            }
                        }
                        method3726(var65, var66);
                    }
                }
            } else if (class180.field2292 == arg0) {
                int var69 = var1.method5195();
                int var70 = (var69 >> 4 & 0x7) + Statics.field8;
                int var71 = (var69 & 0x7) + Statics.field2521;
                int var72 = var1.method5149();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class262 var73 = field817[Statics.field1929][var70][var71];
                    if (var73 != null) {
                        for (class88 var74 = (class88) var73.method4540(); var74 != null; var74 = (class88) var73.method4533()) {
                            if ((var72 & 0x7FFF) == var74.field1222) {
                                var74.method3292();
                                break;
                            }
                        }
                        if (var73.method4540() == null) {
                            field817[Statics.field1929][var70][var71] = null;
                        }
                        method3726(var70, var71);
                    }
                }
            } else if (class180.field2293 == arg0) {
                int var75 = var1.method5242();
                int var76 = (var75 >> 4 & 0x7) + Statics.field8;
                int var77 = (var75 & 0x7) + Statics.field2521;
                int var78 = var1.method5139();
                int var79 = var78 >> 2;
                int var80 = var78 & 0x3;
                int var81 = field690[var79];
                int var82 = var1.method5149();
                if (var76 >= 0 && var77 >= 0 && var76 < 103 && var77 < 103) {
                    if (var81 == 0) {
                        class137 var83 = Statics.field86.method2856(Statics.field1929, var76, var77);
                        if (var83 != null) {
                            int var84 = class129.method12(var83.field1858);
                            if (var79 == 2) {
                                var83.field1856 = new class94(var84, 2, var80 + 4, Statics.field1929, var76, var77, var82, false, var83.field1856);
                                var83.field1857 = new class94(var84, 2, var80 + 1 & 0x3, Statics.field1929, var76, var77, var82, false, var83.field1857);
                            } else {
                                var83.field1856 = new class94(var84, var79, var80, Statics.field1929, var76, var77, var82, false, var83.field1856);
                            }
                        }
                    }
                    if (var81 == 1) {
                        class142 var85 = Statics.field86.method2857(Statics.field1929, var76, var77);
                        if (var85 != null) {
                            int var86 = class129.method12(var85.field1898);
                            if (var79 == 4 || var79 == 5) {
                                var85.field1896 = new class94(var86, 4, var80, Statics.field1929, var76, var77, var82, false, var85.field1896);
                            } else if (var79 == 6) {
                                var85.field1896 = new class94(var86, 4, var80 + 4, Statics.field1929, var76, var77, var82, false, var85.field1896);
                            } else if (var79 == 7) {
                                var85.field1896 = new class94(var86, 4, (var80 + 2 & 0x3) + 4, Statics.field1929, var76, var77, var82, false, var85.field1896);
                            } else if (var79 == 8) {
                                var85.field1896 = new class94(var86, 4, var80 + 4, Statics.field1929, var76, var77, var82, false, var85.field1896);
                                var85.field1892 = new class94(var86, 4, (var80 + 2 & 0x3) + 4, Statics.field1929, var76, var77, var82, false, var85.field1892);
                            }
                        }
                    }
                    if (var81 == 2) {
                        class143 var87 = Statics.field86.method2858(Statics.field1929, var76, var77);
                        if (var79 == 11) {
                            var79 = 10;
                        }
                        if (var87 != null) {
                            var87.field1906 = new class94(class129.method12(var87.field1900), var79, var80, Statics.field1929, var76, var77, var82, false, var87.field1906);
                        }
                    }
                    if (var81 == 3) {
                        class124 var88 = Statics.field86.method2859(Statics.field1929, var76, var77);
                        if (var88 != null) {
                            var88.field1589 = new class94(class129.method12(var88.field1590), 22, var80, Statics.field1929, var76, var77, var82, false, var88.field1589);
                        }
                    }
                }
            } else if (class180.field2299 == arg0) {
                byte var89 = var1.method5297();
                int var90 = var1.method5150();
                int var91 = var1.method5242();
                int var92 = (var91 >> 4 & 0x7) + Statics.field8;
                int var93 = (var91 & 0x7) + Statics.field2521;
                int var94 = var1.method5139();
                int var95 = var94 >> 2;
                int var96 = var94 & 0x3;
                int var97 = field690[var95];
                byte var98 = var1.method5297();
                byte var99 = var1.method5143();
                byte var100 = var1.method5142();
                int var101 = var1.method5112();
                int var102 = var1.method5149();
                int var103 = var1.method5112();
                class67 var104;
                if (field676 == var102) {
                    var104 = Statics.field585;
                } else {
                    var104 = field745[var102];
                }
                if (var104 != null) {
                    class254 var105 = class254.method3616(var103);
                    int var106;
                    int var107;
                    if (var96 == 1 || var96 == 3) {
                        var106 = var105.field3331;
                        var107 = var105.field3330;
                    } else {
                        var106 = var105.field3330;
                        var107 = var105.field3331;
                    }
                    int var108 = (var106 >> 1) + var92;
                    int var109 = (var106 + 1 >> 1) + var92;
                    int var110 = (var107 >> 1) + var93;
                    int var111 = (var107 + 1 >> 1) + var93;
                    int[][] var112 = class57.field496[Statics.field1929];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var92 << 7) + (var106 << 6);
                    int var115 = (var93 << 7) + (var107 << 6);
                    class128 var116 = var105.method4233(var95, var96, var112, var114, var113, var115);
                    if (var116 != null) {
                        method1089(Statics.field1929, var92, var93, var97, -1, 0, 0, var90 + 1, var101 + 1);
                        var104.field600 = field641 + var90;
                        var104.field601 = field641 + var101;
                        var104.field593 = var116;
                        var104.field602 = var92 * 128 + var106 * 64;
                        var104.field604 = var93 * 128 + var107 * 64;
                        var104.field603 = var113;
                        if (var100 > var98) {
                            byte var117 = var100;
                            var100 = var98;
                            var98 = var117;
                        }
                        if (var89 > var99) {
                            byte var118 = var89;
                            var89 = var99;
                            var99 = var118;
                        }
                        var104.field606 = var92 + var100;
                        var104.field608 = var92 + var98;
                        var104.field607 = var89 + var93;
                        var104.field609 = var93 + var99;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.hm(IIIIIIIIIB)V")
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field758.method4540(); var10 != null; var10 = (class69) field758.method4533()) {
            if (var10.field914 == arg0 && var10.field909 == arg1 && var10.field910 == arg2 && var10.field908 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field914 = arg0;
            var9.field908 = arg3;
            var9.field909 = arg1;
            var9.field910 = arg2;
            method4429(var9);
            field758.method4554(var9);
        }
        var9.field918 = arg4;
        var9.field919 = arg5;
        var9.field915 = arg6;
        var9.field917 = arg7;
        var9.field907 = arg8;
    }

    @ObfuscatedName("ah.hf(I)V")
    public static final void method493() {
        for (class69 var0 = (class69) field758.method4540(); var0 != null; var0 = (class69) field758.method4533()) {
            if (var0.field907 == -1) {
                var0.field917 = 0;
                method4429(var0);
            } else {
                var0.method3292();
            }
        }
    }

    @ObfuscatedName("iv.hl(Lbh;B)V")
    public static final void method4429(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field908 == 0) {
            var1 = Statics.field86.method2860(arg0.field914, arg0.field909, arg0.field910);
        }
        if (arg0.field908 == 1) {
            var1 = Statics.field86.method2861(arg0.field914, arg0.field909, arg0.field910);
        }
        if (arg0.field908 == 2) {
            var1 = Statics.field86.method2862(arg0.field914, arg0.field909, arg0.field910);
        }
        if (arg0.field908 == 3) {
            var1 = Statics.field86.method2863(arg0.field914, arg0.field909, arg0.field910);
        }
        if (var1 != 0L) {
            int var6 = Statics.field86.method2864(arg0.field914, arg0.field909, arg0.field910, var1);
            var3 = class129.method12(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field916 = var3;
        arg0.field913 = var4;
        arg0.field912 = var5;
    }

    @ObfuscatedName("ir.hk(IIIIIIII)V")
    public static final void method4008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field846 && Statics.field1929 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field86.method2860(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field86.method2861(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field86.method2862(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field86.method2863(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field86.method2864(arg0, arg2, arg3, var7);
            int var13 = class129.method12(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field86.method2851(arg0, arg2, arg3);
                class254 var16 = class254.method3616(var13);
                if (var16.field3332 != 0) {
                    field687[arg0].method3234(arg2, arg3, var14, var15, var16.field3360);
                }
            }
            if (arg1 == 1) {
                Statics.field86.method2852(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field86.method2907(arg0, arg2, arg3);
                class254 var17 = class254.method3616(var13);
                if (var17.field3330 + arg2 > 103 || var17.field3330 + arg3 > 103 || var17.field3331 + arg2 > 103 || var17.field3331 + arg3 > 103) {
                    return;
                }
                if (var17.field3332 != 0) {
                    field687[arg0].method3232(arg2, arg3, var17.field3330, var17.field3331, var15, var17.field3360);
                }
            }
            if (arg1 == 3) {
                Statics.field86.method2965(arg0, arg2, arg3);
                class254 var18 = class254.method3616(var13);
                if (var18.field3332 == 1) {
                    field687[arg0].method3235(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class57.field492[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class134 var20 = Statics.field86;
        class173 var21 = field687[arg0];
        class254 var22 = class254.method3616(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3331;
            var24 = var22.field3330;
        } else {
            var23 = var22.field3330;
            var24 = var22.field3331;
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
        int[][] var29 = class57.field496[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class129.method673(arg2, arg3, 2, var22.field3334 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3355 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class136 var36;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var36 = var22.method4233(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class94(arg4, 22, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2898(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3332 == 1) {
                var21.method3228(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var62;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var62 = var22.method4233(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class94(arg4, 10, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            if (var62 != null) {
                var20.method2885(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3332 != 0) {
                var21.method3253(arg2, arg3, var23, var24, var22.field3360);
            }
        } else if (arg6 >= 12) {
            class136 var37;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var37 = var22.method4233(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2885(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3332 != 0) {
                var21.method3253(arg2, arg3, var23, var24, var22.field3360);
            }
        } else if (arg6 == 0) {
            class136 var38;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var38 = var22.method4233(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class94(arg4, 0, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method3005(arg0, arg2, arg3, var30, var38, (class136) null, class57.field500[arg5], 0, var33, var35);
            if (var22.field3332 != 0) {
                var21.method3252(arg2, arg3, arg6, arg5, var22.field3360);
            }
        } else if (arg6 == 1) {
            class136 var39;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var39 = var22.method4233(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class94(arg4, 1, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method3005(arg0, arg2, arg3, var30, var39, (class136) null, class57.field501[arg5], 0, var33, var35);
            if (var22.field3332 != 0) {
                var21.method3252(arg2, arg3, arg6, arg5, var22.field3360);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class136 var41;
            class136 var42;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var41 = var22.method4233(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4233(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class94(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3338, true, (class136) null);
                var42 = new class94(arg4, 2, var40, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method3005(arg0, arg2, arg3, var30, var41, var42, class57.field500[arg5], class57.field500[var40], var33, var35);
            if (var22.field3332 != 0) {
                var21.method3252(arg2, arg3, arg6, arg5, var22.field3360);
            }
        } else if (arg6 == 3) {
            class136 var43;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var43 = var22.method4233(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class94(arg4, 3, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method3005(arg0, arg2, arg3, var30, var43, (class136) null, class57.field501[arg5], 0, var33, var35);
            if (var22.field3332 != 0) {
                var21.method3252(arg2, arg3, arg6, arg5, var22.field3360);
            }
        } else if (arg6 == 9) {
            class136 var44;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var44 = var22.method4233(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2885(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3332 != 0) {
                var21.method3253(arg2, arg3, var23, var24, var22.field3360);
            }
        } else if (arg6 == 4) {
            class136 var45;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var45 = var22.method4233(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var45, (class136) null, class57.field500[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2860(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class254.method3616(class129.method12(var47)).field3339;
            }
            class136 var49;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var49 = var22.method4233(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var49, (class136) null, class57.field500[arg5], 0, class57.field507[arg5] * var46, class57.field503[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2860(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class254.method3616(class129.method12(var51)).field3339 / 2;
            }
            class136 var53;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var53 = var22.method4233(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var53, (class136) null, 256, arg5, class57.field504[arg5] * var50, class57.field505[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class136 var55;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var55 = var22.method4233(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class94(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var55, (class136) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2860(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class254.method3616(class129.method12(var57)).field3339 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class136 var60;
            class136 var61;
            if (var22.field3338 == -1 && var22.field3321 == null) {
                var60 = var22.method4233(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4233(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3338, true, (class136) null);
                var61 = new class94(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3338, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class57.field504[arg5] * var56, class57.field505[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("hv.hp(III)V")
    public static final void method3726(int arg0, int arg1) {
        class262 var2 = field817[Statics.field1929][arg0][arg1];
        if (var2 == null) {
            Statics.field86.method2855(Statics.field1929, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4540(); var6 != null; var6 = (class88) var2.method4533()) {
            class255 var7 = Statics.method3278(var6.field1222);
            long var8 = (long) var7.field3390;
            if (var7.field3411 == 1) {
                var8 = (long) (var6.field1221 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field86.method2855(Statics.field1929, arg0, arg1);
            return;
        }
        var2.method4535(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4540(); var12 != null; var12 = (class88) var2.method4533()) {
            if (var5.field1222 != var12.field1222) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1222 != var12.field1222 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method673(arg0, arg1, 3, false, 0);
        Statics.field86.method2967(Statics.field1929, arg0, arg1, method1045(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1929), var5, var13, var10, var11);
    }

    @ObfuscatedName("m.hi(ZLkl;I)V")
    public static final void method248(boolean arg0, class299 arg1) {
        field816 = 0;
        field674 = 0;
        method4225();
        method51(arg0, arg1);
        Statics.method1087(arg1);
        for (int var2 = 0; var2 < field816; var2++) {
            int var3 = field746[var2];
            if (field641 != field762[var3].field972) {
                field762[var3].field1106 = null;
                field762[var3] = null;
            }
        }
        if (field668.field1296 != arg1.field3703) {
            throw new RuntimeException(arg1.field3703 + class82.field1122 + field668.field1296);
        }
        for (int var4 = 0; var4 < field672; var4++) {
            if (field762[field905[var4]] == null) {
                throw new RuntimeException(var4 + class82.field1122 + field672);
            }
        }
    }

    @ObfuscatedName("id.hq(I)V")
    public static final void method4225() {
        class299 var0 = field668.field1290;
        var0.method5062();
        int var1 = var0.method5063(8);
        if (var1 < field672) {
            for (int var2 = var1; var2 < field672; var2++) {
                field746[++field816 - 1] = field905[var2];
            }
        }
        if (var1 > field672) {
            throw new RuntimeException("");
        }
        field672 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field905[var3];
            class80 var5 = field762[var4];
            int var6 = var0.method5063(1);
            if (var6 == 0) {
                field905[++field672 - 1] = var4;
                var5.field972 = field641;
            } else {
                int var7 = var0.method5063(2);
                if (var7 == 0) {
                    field905[++field672 - 1] = var4;
                    var5.field972 = field641;
                    field721[++field674 - 1] = var4;
                } else if (var7 == 1) {
                    field905[++field672 - 1] = var4;
                    var5.field972 = field641;
                    int var8 = var0.method5063(3);
                    var5.method1873(var8, (byte) 1);
                    int var9 = var0.method5063(1);
                    if (var9 == 1) {
                        field721[++field674 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field905[++field672 - 1] = var4;
                    var5.field972 = field641;
                    int var10 = var0.method5063(3);
                    var5.method1873(var10, (byte) 2);
                    int var11 = var0.method5063(3);
                    var5.method1873(var11, (byte) 2);
                    int var12 = var0.method5063(1);
                    if (var12 == 1) {
                        field721[++field674 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field746[++field816 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("b.hr(ZLkl;I)V")
    public static final void method51(boolean arg0, class299 arg1) {
        while (true) {
            if (arg1.method5065(field668.field1296) >= 27) {
                int var2 = arg1.method5063(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field762[var2] == null) {
                        field762[var2] = new class80();
                        var3 = true;
                    }
                    class80 var4 = field762[var2];
                    field905[++field672 - 1] = var2;
                    var4.field972 = field641;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method5063(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method5063(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field755[arg1.method5063(3)];
                    if (var3) {
                        var4.field974 = var4.field924 = var6;
                    }
                    int var7 = arg1.method5063(1);
                    int var8 = arg1.method5063(1);
                    if (var8 == 1) {
                        field721[++field674 - 1] = var2;
                    }
                    var4.field1106 = class257.method4706(arg1.method5063(14));
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5063(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5063(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field926 = var4.field1106.field3435;
                    var4.field969 = var4.field1106.field3451;
                    if (var4.field969 == 0) {
                        var4.field924 = 0;
                    }
                    var4.field960 = var4.field1106.field3434;
                    var4.field963 = var4.field1106.field3442;
                    var4.field933 = var4.field1106.field3443;
                    var4.field934 = var4.field1106.field3440;
                    var4.field928 = var4.field1106.field3438;
                    var4.field929 = var4.field1106.field3439;
                    var4.field976 = var4.field1106.field3429;
                    var4.method1874(Statics.field585.field978[0] + var5, Statics.field585.field979[0] + var9, var7 == 1);
                    continue;
                }
            }
            arg1.method5064();
            return;
        }
    }

    @ObfuscatedName("ag.hz(I)V")
    public static void method589() {
        field667 = 0;
        field901 = false;
    }

    @ObfuscatedName("bv.ih(I)V")
    public static void method1577() {
        method589();
        field771[0] = class225.field2993;
        field772[0] = "";
        field857[0] = 1006;
        field761[0] = false;
        field667 = 1;
    }

    @ObfuscatedName("el.if(IIIIB)V")
    public static final void method3024(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field832; var4++) {
            if (field839[var4] + field837[var4] > arg0 && field837[var4] < arg0 + arg2 && field840[var4] + field838[var4] > arg1 && field838[var4] < arg1 + arg3) {
                field834[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ie(I)V")
    public final void method1160() {
        method341();
        if (Statics.field1035 != null || field802 != null) {
            return;
        }
        int var12;
        int var14;
        int var15;
        label193: {
            int var1 = class54.field473;
            if (field901) {
                if (var1 != 1 && (Statics.field3102 || var1 != 4)) {
                    int var2 = class54.field466;
                    int var3 = class54.field477;
                    if (var2 < Statics.field44 - 10 || var2 > Statics.field44 + Statics.field384 + 10 || var3 < Statics.field321 - 10 || var3 > Statics.field481 + Statics.field321 + 10) {
                        field901 = false;
                        method3024(Statics.field44, Statics.field321, Statics.field384, Statics.field481);
                    }
                }
                if (var1 == 1 || !Statics.field3102 && var1 == 4) {
                    int var4 = Statics.field44;
                    int var5 = Statics.field321;
                    int var6 = Statics.field384;
                    int var7 = class54.field474;
                    int var8 = class54.field475;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field667; var10++) {
                        int var11 = (field667 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1) {
                        method3545(var9);
                    }
                    field901 = false;
                    method3024(Statics.field44, Statics.field321, Statics.field384, Statics.field481);
                }
            } else {
                var12 = method1147();
                if ((var1 == 1 || !Statics.field3102 && var1 == 4) && var12 >= 0) {
                    int var13 = field857[var12];
                    if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                        var14 = field767[var12];
                        var15 = field751[var12];
                        class218 var16 = Statics.method2628(var15);
                        int var17 = method210(var16);
                        boolean var18 = (var17 >> 28 & 0x1) != 0;
                        if (var18) {
                            break label193;
                        }
                        int var19 = method210(var16);
                        boolean var20 = (var19 >> 29 & 0x1) != 0;
                        if (var20) {
                            break label193;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field3102 && var1 == 4) && this.method1161()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field3102 && var1 == 4) && field667 > 0) {
                    method3545(var12);
                }
                if (var1 == 2 && field667 > 0) {
                    this.method1178(class54.field474, class54.field475);
                }
            }
            return;
        }
        if (Statics.field1035 != null && !field769 && field667 > 0 && !this.method1161()) {
            int var21 = field864;
            int var22 = field739;
            method2044(Statics.field4035, var21, var22);
            Statics.field4035 = null;
        }
        field769 = false;
        field742 = 0;
        if (Statics.field1035 != null) {
            method3272(Statics.field1035);
        }
        Statics.field1035 = Statics.method2628(var15);
        field886 = var14;
        field864 = class54.field474;
        field739 = class54.field475;
        if (var12 >= 0) {
            method3088(var12);
        }
        method3272(Statics.field1035);
    }

    @ObfuscatedName("client.ic(I)Z")
    public final boolean method1161() {
        int var1 = method1147();
        return (field781 == 1 && field667 > 2 || method933(var1)) && !field761[var1];
    }

    @ObfuscatedName("client.ia(III)V")
    public final void method1178(int arg0, int arg1) {
        int var3 = Statics.field59.method4962(class225.field2901);
        for (int var4 = 0; var4 < field667; var4++) {
            class294 var5 = Statics.field59;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field772[var4].length() > 0) {
                var6 = field771[var4] + class225.field2909 + field772[var4];
            } else {
                var6 = field771[var4];
            }
            int var7 = var5.method4962(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field667 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field45) {
            var9 = Statics.field45 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field1152) {
            var10 = Statics.field1152 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field44 = var9;
        Statics.field321 = var10;
        Statics.field384 = var3;
        Statics.field481 = field667 * 15 + 22;
        Statics.field86.method2871(Statics.field1929, arg0, arg1, false);
        field901 = true;
    }

    @ObfuscatedName("bg.ip(II)Z")
    public static final boolean method933(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field857[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gy.im(IB)V")
    public static final void method3545(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field767[arg0];
        int var2 = field751[arg0];
        int var3 = field857[arg0];
        int var4 = field777[arg0];
        String var5 = field771[arg0];
        String var6 = field772[arg0];
        method243(var1, var2, var3, var4, var5, var6, class54.field474, class54.field475);
    }

    @ObfuscatedName("ce.it(Lcq;III)V")
    public static final void method2044(class83 arg0, int arg1, int arg2) {
        method243(arg0.field1138, arg0.field1133, arg0.field1132, arg0.field1135, arg0.field1136, arg0.field1136, arg1, arg2);
    }

    @ObfuscatedName("h.ir(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method243(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 50) {
            class67 var8 = field745[arg3];
            if (var8 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var9 = class182.method19(class178.field2236, field668.field1294);
                var9.field2303.method5287(class45.field367[82] ? 1 : 0);
                var9.field2303.method5313(arg3);
                field668.method2084(var9);
            }
        }
        if (arg2 == 12) {
            class80 var10 = field762[arg3];
            if (var10 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var11 = class182.method19(class178.field2267, field668.field1294);
                var11.field2303.method5136(class45.field367[82] ? 1 : 0);
                var11.field2303.method5095(arg3);
                field668.method2084(var11);
            }
        }
        if (arg2 == 15) {
            class67 var12 = field745[arg3];
            if (var12 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var13 = class182.method19(class178.field2218, field668.field1294);
                var13.field2303.method5136(class45.field367[82] ? 1 : 0);
                var13.field2303.method5313(arg3);
                var13.field2303.method5097(Statics.field200);
                var13.field2303.method5145(field785);
                field668.method2084(var13);
            }
        }
        if (arg2 == 4) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var14 = class182.method19(class178.field2266, field668.field1294);
            var14.field2303.method5146(arg3);
            var14.field2303.method5263(class45.field367[82] ? 1 : 0);
            var14.field2303.method5146(Statics.field562 + arg1);
            var14.field2303.method5146(Statics.field2477 + arg0);
            field668.method2084(var14);
        }
        if (arg2 == 58) {
            class218 var15 = class218.method5373(arg1, arg0);
            if (var15 != null) {
                class182 var16 = class182.method19(class178.field2276, field668.field1294);
                var16.field2303.method5313(arg0);
                var16.field2303.method5155(arg1);
                var16.field2303.method5146(field785);
                var16.field2303.method5313(var15.field2664);
                var16.field2303.method5313(field786);
                var16.field2303.method5311(Statics.field200);
                field668.method2084(var16);
            }
        }
        if (arg2 == 1002) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            class182 var17 = class182.method19(class178.field2185, field668.field1294);
            var17.field2303.method5145(arg3);
            field668.method2084(var17);
        }
        if (arg2 == 11) {
            class80 var18 = field762[arg3];
            if (var18 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var19 = class182.method19(class178.field2257, field668.field1294);
                var19.field2303.method5094(class45.field367[82] ? 1 : 0);
                var19.field2303.method5146(arg3);
                field668.method2084(var19);
            }
        }
        if (arg2 == 1004) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            class182 var20 = class182.method19(class178.field2235, field668.field1294);
            var20.field2303.method5313(arg3);
            field668.method2084(var20);
        }
        if (arg2 == 32) {
            class182 var21 = class182.method19(class178.field2238, field668.field1294);
            var21.field2303.method5146(arg0);
            var21.field2303.method5311(Statics.field200);
            var21.field2303.method5145(arg3);
            var21.field2303.method5145(field785);
            var21.field2303.method5154(arg1);
            field668.method2084(var21);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field36.method6008(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 20) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var22 = class182.method19(class178.field2273, field668.field1294);
            var22.field2303.method5146(Statics.field2477 + arg0);
            var22.field2303.method5136(class45.field367[82] ? 1 : 0);
            var22.field2303.method5145(arg3);
            var22.field2303.method5313(Statics.field562 + arg1);
            field668.method2084(var22);
        }
        if (arg2 == 1) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var23 = class182.method19(class178.field2229, field668.field1294);
            var23.field2303.method5145(Statics.field2477 + arg0);
            var23.field2303.method5311(Statics.field1886);
            var23.field2303.method5145(Statics.field562 + arg1);
            var23.field2303.method5313(arg3);
            var23.field2303.method5146(Statics.field389);
            var23.field2303.method5136(class45.field367[82] ? 1 : 0);
            var23.field2303.method5146(Statics.field3887);
            field668.method2084(var23);
        }
        if (arg2 == 9) {
            class80 var24 = field762[arg3];
            if (var24 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var25 = class182.method19(class178.field2209, field668.field1294);
                var25.field2303.method5136(class45.field367[82] ? 1 : 0);
                var25.field2303.method5145(arg3);
                field668.method2084(var25);
            }
        }
        if (arg2 == 34) {
            class182 var26 = class182.method19(class178.field2262, field668.field1294);
            var26.field2303.method5313(arg0);
            var26.field2303.method5095(arg3);
            var26.field2303.method5154(arg1);
            field668.method2084(var26);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 31) {
            class182 var27 = class182.method19(class178.field2186, field668.field1294);
            var27.field2303.method5313(Statics.field3887);
            var27.field2303.method5154(Statics.field1886);
            var27.field2303.method5145(Statics.field389);
            var27.field2303.method5154(arg1);
            var27.field2303.method5313(arg3);
            var27.field2303.method5146(arg0);
            field668.method2084(var27);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 35) {
            class182 var28 = class182.method19(class178.field2198, field668.field1294);
            var28.field2303.method5155(arg1);
            var28.field2303.method5146(arg0);
            var28.field2303.method5095(arg3);
            field668.method2084(var28);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 1003) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            class80 var29 = field762[arg3];
            if (var29 != null) {
                class257 var30 = var29.field1106;
                if (var30.field3459 != null) {
                    var30 = var30.method4343();
                }
                if (var30 != null) {
                    class182 var31 = class182.method19(class178.field2195, field668.field1294);
                    var31.field2303.method5145(var30.field3436);
                    field668.method2084(var31);
                }
            }
        }
        if (arg2 == 49) {
            class67 var32 = field745[arg3];
            if (var32 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var33 = class182.method19(class178.field2215, field668.field1294);
                var33.field2303.method5287(class45.field367[82] ? 1 : 0);
                var33.field2303.method5146(arg3);
                field668.method2084(var33);
            }
        }
        if (arg2 == 37) {
            class182 var34 = class182.method19(class178.field2228, field668.field1294);
            var34.field2303.method5313(arg0);
            var34.field2303.method5313(arg3);
            var34.field2303.method5154(arg1);
            field668.method2084(var34);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 2) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var35 = class182.method19(class178.field2200, field668.field1294);
            var35.field2303.method5146(arg3);
            var35.field2303.method5311(Statics.field200);
            var35.field2303.method5313(Statics.field2477 + arg0);
            var35.field2303.method5095(field785);
            var35.field2303.method5146(Statics.field562 + arg1);
            var35.field2303.method5136(class45.field367[82] ? 1 : 0);
            field668.method2084(var35);
        }
        if (arg2 == 33) {
            class182 var36 = class182.method19(class178.field2208, field668.field1294);
            var36.field2303.method5154(arg1);
            var36.field2303.method5145(arg3);
            var36.field2303.method5146(arg0);
            field668.method2084(var36);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 6) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var37 = class182.method19(class178.field2249, field668.field1294);
            var37.field2303.method5146(arg3);
            var37.field2303.method5145(Statics.field2477 + arg0);
            var37.field2303.method5287(class45.field367[82] ? 1 : 0);
            var37.field2303.method5313(Statics.field562 + arg1);
            field668.method2084(var37);
        }
        if (arg2 == 36) {
            class182 var38 = class182.method19(class178.field2191, field668.field1294);
            var38.field2303.method5146(arg3);
            var38.field2303.method5155(arg1);
            var38.field2303.method5095(arg0);
            field668.method2084(var38);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 40) {
            class182 var39 = class182.method19(class178.field2254, field668.field1294);
            var39.field2303.method5313(arg0);
            var39.field2303.method5154(arg1);
            var39.field2303.method5313(arg3);
            field668.method2084(var39);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 48) {
            class67 var40 = field745[arg3];
            if (var40 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var41 = class182.method19(class178.field2268, field668.field1294);
                var41.field2303.method5095(arg3);
                var41.field2303.method5287(class45.field367[82] ? 1 : 0);
                field668.method2084(var41);
            }
        }
        if (arg2 == 46) {
            class67 var42 = field745[arg3];
            if (var42 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var43 = class182.method19(class178.field2270, field668.field1294);
                var43.field2303.method5287(class45.field367[82] ? 1 : 0);
                var43.field2303.method5095(arg3);
                field668.method2084(var43);
            }
        }
        if (arg2 == 29) {
            class182 var44 = class182.method19(class178.field2221, field668.field1294);
            var44.field2303.method5097(arg1);
            field668.method2084(var44);
            class218 var45 = Statics.method2628(arg1);
            if (var45.field2670 != null && var45.field2670[0][0] == 5) {
                int var46 = var45.field2670[0][1];
                if (class213.field2511[var46] != var45.field2672[0]) {
                    class213.field2511[var46] = var45.field2672[0];
                    method5415(var46);
                }
            }
        }
        if (arg2 == 3) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var47 = class182.method19(class178.field2234, field668.field1294);
            var47.field2303.method5287(class45.field367[82] ? 1 : 0);
            var47.field2303.method5145(arg3);
            var47.field2303.method5146(Statics.field562 + arg1);
            var47.field2303.method5313(Statics.field2477 + arg0);
            field668.method2084(var47);
        }
        if (arg2 == 16) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var48 = class182.method19(class178.field2258, field668.field1294);
            var48.field2303.method5287(class45.field367[82] ? 1 : 0);
            var48.field2303.method5095(Statics.field389);
            var48.field2303.method5155(Statics.field1886);
            var48.field2303.method5313(Statics.field3887);
            var48.field2303.method5313(arg3);
            var48.field2303.method5313(Statics.field562 + arg1);
            var48.field2303.method5145(Statics.field2477 + arg0);
            field668.method2084(var48);
        }
        if (arg2 == 41) {
            class182 var49 = class182.method19(class178.field2248, field668.field1294);
            var49.field2303.method5313(arg0);
            var49.field2303.method5097(arg1);
            var49.field2303.method5095(arg3);
            field668.method2084(var49);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 21) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var50 = class182.method19(class178.field2244, field668.field1294);
            var50.field2303.method5145(Statics.field2477 + arg0);
            var50.field2303.method5095(arg3);
            var50.field2303.method5145(Statics.field562 + arg1);
            var50.field2303.method5263(class45.field367[82] ? 1 : 0);
            field668.method2084(var50);
        }
        if (arg2 == 39) {
            class182 var51 = class182.method19(class178.field2197, field668.field1294);
            var51.field2303.method5311(arg1);
            var51.field2303.method5145(arg0);
            var51.field2303.method5145(arg3);
            field668.method2084(var51);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 30 && field795 == null) {
            method246(arg1, arg0);
            field795 = class218.method5373(arg1, arg0);
            method3272(field795);
        }
        if (arg2 == 28) {
            class182 var52 = class182.method19(class178.field2221, field668.field1294);
            var52.field2303.method5097(arg1);
            field668.method2084(var52);
            class218 var53 = Statics.method2628(arg1);
            if (var53.field2670 != null && var53.field2670[0][0] == 5) {
                int var54 = var53.field2670[0][1];
                class213.field2511[var54] = 1 - class213.field2511[var54];
                method5415(var54);
            }
        }
        if (arg2 == 1001) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var55 = class182.method19(class178.field2231, field668.field1294);
            var55.field2303.method5313(arg3);
            var55.field2303.method5146(Statics.field562 + arg1);
            var55.field2303.method5095(Statics.field2477 + arg0);
            var55.field2303.method5287(class45.field367[82] ? 1 : 0);
            field668.method2084(var55);
        }
        if (arg2 == 24) {
            class218 var56 = Statics.method2628(arg1);
            boolean var57 = true;
            if (var56.field2692 > 0) {
                var57 = method116(var56);
            }
            if (var57) {
                class182 var58 = class182.method19(class178.field2221, field668.field1294);
                var58.field2303.method5097(arg1);
                field668.method2084(var58);
            }
        }
        if (arg2 == 25) {
            class218 var59 = class218.method5373(arg1, arg0);
            if (var59 != null) {
                method101();
                method157(arg1, arg0, class219.method137(method210(var59)), var59.field2664);
                field673 = 0;
                field787 = method1026(var59);
                if (field787 == null) {
                    field787 = class225.field2800;
                }
                if (var59.field2607) {
                    field782 = var59.field2631 + class82.method1876(16777215);
                } else {
                    field782 = class82.method1876(65280) + var59.field2539 + class82.method1876(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var60 = class182.method19(class178.field2202, field668.field1294);
            var60.field2303.method5145(arg3);
            var60.field2303.method5313(Statics.field562 + arg1);
            var60.field2303.method5287(class45.field367[82] ? 1 : 0);
            var60.field2303.method5146(Statics.field2477 + arg0);
            field668.method2084(var60);
        }
        if (arg2 == 8) {
            class80 var61 = field762[arg3];
            if (var61 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var62 = class182.method19(class178.field2214, field668.field1294);
                var62.field2303.method5155(Statics.field200);
                var62.field2303.method5146(arg3);
                var62.field2303.method5313(field785);
                var62.field2303.method5094(class45.field367[82] ? 1 : 0);
                field668.method2084(var62);
            }
        }
        if (arg2 == 38) {
            method101();
            class218 var63 = Statics.method2628(arg1);
            field673 = 1;
            Statics.field389 = arg0;
            Statics.field1886 = arg1;
            Statics.field3887 = arg3;
            method3272(var63);
            field783 = class82.method1876(16748608) + Statics.method3278(arg3).field3378 + class82.method1876(16777215);
            if (field783 == null) {
                field783 = class225.field2800;
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var64 = class218.method5373(arg1, arg0);
            if (var64 != null) {
                method672(arg3, arg1, arg0, var64.field2664, arg5);
            }
        }
        if (arg2 == 13) {
            class80 var65 = field762[arg3];
            if (var65 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var66 = class182.method19(class178.field2216, field668.field1294);
                var66.field2303.method5313(arg3);
                var66.field2303.method5287(class45.field367[82] ? 1 : 0);
                field668.method2084(var66);
            }
        }
        if (arg2 == 14) {
            class67 var67 = field745[arg3];
            if (var67 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var68 = class182.method19(class178.field2240, field668.field1294);
                var68.field2303.method5097(Statics.field1886);
                var68.field2303.method5287(class45.field367[82] ? 1 : 0);
                var68.field2303.method5095(Statics.field389);
                var68.field2303.method5145(Statics.field3887);
                var68.field2303.method5313(arg3);
                field668.method2084(var68);
            }
        }
        if (arg2 == 19) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var69 = class182.method19(class178.field2190, field668.field1294);
            var69.field2303.method5287(class45.field367[82] ? 1 : 0);
            var69.field2303.method5313(Statics.field562 + arg1);
            var69.field2303.method5095(Statics.field2477 + arg0);
            var69.field2303.method5146(arg3);
            field668.method2084(var69);
        }
        if (arg2 == 10) {
            class80 var70 = field762[arg3];
            if (var70 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var71 = class182.method19(class178.field2225, field668.field1294);
                var71.field2303.method5146(arg3);
                var71.field2303.method5136(class45.field367[82] ? 1 : 0);
                field668.method2084(var71);
            }
        }
        if (arg2 == 7) {
            class80 var72 = field762[arg3];
            if (var72 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var73 = class182.method19(class178.field2271, field668.field1294);
                var73.field2303.method5145(Statics.field3887);
                var73.field2303.method5145(Statics.field389);
                var73.field2303.method5311(Statics.field1886);
                var73.field2303.method5094(class45.field367[82] ? 1 : 0);
                var73.field2303.method5146(arg3);
                field668.method2084(var73);
            }
        }
        if (arg2 == 26) {
            method3188();
        }
        if (arg2 == 1005) {
            class218 var74 = Statics.method2628(arg1);
            if (var74 == null || var74.field2679[arg0] < 100000) {
                class182 var75 = class182.method19(class178.field2235, field668.field1294);
                var75.field2303.method5313(arg3);
                field668.method2084(var75);
            } else {
                class92.method1894(27, "", var74.field2679[arg0] + " x " + Statics.method3278(arg3).field3378);
            }
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 23) {
            if (field901) {
                Statics.field86.method2872();
            } else {
                Statics.field86.method2871(Statics.field1929, arg0, arg1, true);
            }
        }
        if (arg2 == 47) {
            class67 var76 = field745[arg3];
            if (var76 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var77 = class182.method19(class178.field2274, field668.field1294);
                var77.field2303.method5263(class45.field367[82] ? 1 : 0);
                var77.field2303.method5145(arg3);
                field668.method2084(var77);
            }
        }
        if (arg2 == 45) {
            class67 var78 = field745[arg3];
            if (var78 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var79 = class182.method19(class178.field2251, field668.field1294);
                var79.field2303.method5263(class45.field367[82] ? 1 : 0);
                var79.field2303.method5145(arg3);
                field668.method2084(var79);
            }
        }
        if (arg2 == 51) {
            class67 var80 = field745[arg3];
            if (var80 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var81 = class182.method19(class178.field2204, field668.field1294);
                var81.field2303.method5095(arg3);
                var81.field2303.method5094(class45.field367[82] ? 1 : 0);
                field668.method2084(var81);
            }
        }
        if (arg2 == 17) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var82 = class182.method19(class178.field2264, field668.field1294);
            var82.field2303.method5097(Statics.field200);
            var82.field2303.method5145(Statics.field562 + arg1);
            var82.field2303.method5094(class45.field367[82] ? 1 : 0);
            var82.field2303.method5313(arg3);
            var82.field2303.method5313(Statics.field2477 + arg0);
            var82.field2303.method5146(field785);
            field668.method2084(var82);
        }
        if (arg2 == 42) {
            class182 var83 = class182.method19(class178.field2212, field668.field1294);
            var83.field2303.method5146(arg3);
            var83.field2303.method5095(arg0);
            var83.field2303.method5097(arg1);
            field668.method2084(var83);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 5) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var84 = class182.method19(class178.field2265, field668.field1294);
            var84.field2303.method5145(arg3);
            var84.field2303.method5263(class45.field367[82] ? 1 : 0);
            var84.field2303.method5313(Statics.field562 + arg1);
            var84.field2303.method5146(Statics.field2477 + arg0);
            field668.method2084(var84);
        }
        if (arg2 == 43) {
            class182 var85 = class182.method19(class178.field2182, field668.field1294);
            var85.field2303.method5154(arg1);
            var85.field2303.method5145(arg0);
            var85.field2303.method5095(arg3);
            field668.method2084(var85);
            field765 = 0;
            Statics.field2373 = Statics.method2628(arg1);
            field736 = arg0;
        }
        if (arg2 == 22) {
            field730 = arg6;
            field738 = arg7;
            field830 = 2;
            field732 = 0;
            field819 = arg0;
            field800 = arg1;
            class182 var86 = class182.method19(class178.field2259, field668.field1294);
            var86.field2303.method5313(Statics.field562 + arg1);
            var86.field2303.method5313(arg3);
            var86.field2303.method5263(class45.field367[82] ? 1 : 0);
            var86.field2303.method5313(Statics.field2477 + arg0);
            field668.method2084(var86);
        }
        if (arg2 == 44) {
            class67 var87 = field745[arg3];
            if (var87 != null) {
                field730 = arg6;
                field738 = arg7;
                field830 = 2;
                field732 = 0;
                field819 = arg0;
                field800 = arg1;
                class182 var88 = class182.method19(class178.field2223, field668.field1294);
                var88.field2303.method5313(arg3);
                var88.field2303.method5136(class45.field367[82] ? 1 : 0);
                field668.method2084(var88);
            }
        }
        if (field673 != 0) {
            field673 = 0;
            method3272(Statics.method2628(Statics.field1886));
        }
        if (field784) {
            method101();
        }
        if (Statics.field2373 != null && field765 == 0) {
            method3272(Statics.field2373);
        }
    }

    @ObfuscatedName("aa.il(ILjava/lang/String;I)V")
    public static void method301(int arg0, String arg1) {
        int var2 = class90.field1234;
        int[] var3 = class90.field1235;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field2325);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field745[var3[var6]];
            if (var7 != null && Statics.field585 != var7 && var7.field605 != null && var7.field605.equals(var5)) {
                if (arg0 == 1) {
                    class182 var8 = class182.method19(class178.field2223, field668.field1294);
                    var8.field2303.method5313(var3[var6]);
                    var8.field2303.method5136(0);
                    field668.method2084(var8);
                } else if (arg0 == 4) {
                    class182 var9 = class182.method19(class178.field2274, field668.field1294);
                    var9.field2303.method5263(0);
                    var9.field2303.method5145(var3[var6]);
                    field668.method2084(var9);
                } else if (arg0 == 6) {
                    class182 var10 = class182.method19(class178.field2215, field668.field1294);
                    var10.field2303.method5287(0);
                    var10.field2303.method5146(var3[var6]);
                    field668.method2084(var10);
                } else if (arg0 == 7) {
                    class182 var11 = class182.method19(class178.field2236, field668.field1294);
                    var11.field2303.method5287(0);
                    var11.field2303.method5313(var3[var6]);
                    field668.method2084(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method1894(4, "", class225.field2955 + arg1);
        }
    }

    @ObfuscatedName("l.iy(IIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method5373(arg0, arg1);
        if (var4 != null && var4.field2649 != null) {
            class63 var5 = new class63();
            var5.field552 = var4;
            var5.field550 = var4.field2649;
            class77.method1570(var5);
        }
        field786 = arg3;
        field784 = true;
        Statics.field200 = arg0;
        field785 = arg1;
        Statics.field1502 = arg2;
        method3272(var4);
    }

    @ObfuscatedName("c.ix(I)V")
    public static void method101() {
        if (!field784) {
            return;
        }
        class218 var0 = class218.method5373(Statics.field200, field785);
        if (var0 != null && var0.field2650 != null) {
            class63 var1 = new class63();
            var1.field552 = var0;
            var1.field550 = var0.field2650;
            class77.method1570(var1);
        }
        field784 = false;
        method3272(var0);
    }

    @ObfuscatedName("m.io(IIS)V")
    public static void method246(int arg0, int arg1) {
        class182 var2 = class182.method19(class178.field2247, field668.field1294);
        var2.field2303.method5097(arg0);
        var2.field2303.method5313(arg1);
        field668.method2084(var2);
    }

    @ObfuscatedName("aj.iu(IIIILjava/lang/String;I)V")
    public static void method672(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method5373(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2658 != null) {
            class63 var6 = new class63();
            var6.field552 = var5;
            var6.field554 = arg0;
            var6.field560 = arg4;
            var6.field550 = var5.field2658;
            class77.method1570(var6);
        }
        boolean var7 = true;
        if (var5.field2692 > 0) {
            var7 = method116(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method210(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class182 var11 = class182.method19(class178.field2280, field668.field1294);
            var11.field2303.method5097(arg1);
            var11.field2303.method5095(arg2);
            var11.field2303.method5095(arg3);
            field668.method2084(var11);
        }
        if (arg0 == 2) {
            class182 var12 = class182.method19(class178.field2255, field668.field1294);
            var12.field2303.method5097(arg1);
            var12.field2303.method5095(arg2);
            var12.field2303.method5095(arg3);
            field668.method2084(var12);
        }
        if (arg0 == 3) {
            class182 var13 = class182.method19(class178.field2241, field668.field1294);
            var13.field2303.method5097(arg1);
            var13.field2303.method5095(arg2);
            var13.field2303.method5095(arg3);
            field668.method2084(var13);
        }
        if (arg0 == 4) {
            class182 var14 = class182.method19(class178.field2206, field668.field1294);
            var14.field2303.method5097(arg1);
            var14.field2303.method5095(arg2);
            var14.field2303.method5095(arg3);
            field668.method2084(var14);
        }
        if (arg0 == 5) {
            class182 var15 = class182.method19(class178.field2263, field668.field1294);
            var15.field2303.method5097(arg1);
            var15.field2303.method5095(arg2);
            var15.field2303.method5095(arg3);
            field668.method2084(var15);
        }
        if (arg0 == 6) {
            class182 var16 = class182.method19(class178.field2205, field668.field1294);
            var16.field2303.method5097(arg1);
            var16.field2303.method5095(arg2);
            var16.field2303.method5095(arg3);
            field668.method2084(var16);
        }
        if (arg0 == 7) {
            class182 var17 = class182.method19(class178.field2187, field668.field1294);
            var17.field2303.method5097(arg1);
            var17.field2303.method5095(arg2);
            var17.field2303.method5095(arg3);
            field668.method2084(var17);
        }
        if (arg0 == 8) {
            class182 var18 = class182.method19(class178.field2243, field668.field1294);
            var18.field2303.method5097(arg1);
            var18.field2303.method5095(arg2);
            var18.field2303.method5095(arg3);
            field668.method2084(var18);
        }
        if (arg0 == 9) {
            class182 var19 = class182.method19(class178.field2256, field668.field1294);
            var19.field2303.method5097(arg1);
            var19.field2303.method5095(arg2);
            var19.field2303.method5095(arg3);
            field668.method2084(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class182 var20 = class182.method19(class178.field2201, field668.field1294);
        var20.field2303.method5097(arg1);
        var20.field2303.method5095(arg2);
        var20.field2303.method5095(arg3);
        field668.method2084(var20);
    }

    @ObfuscatedName("aa.iq(I)V")
    public static final void method341() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field667 - 1; var1++) {
                if (field857[var1] < 1000 && field857[var1 + 1] > 1000) {
                    String var2 = field772[var1];
                    field772[var1] = field772[var1 + 1];
                    field772[var1 + 1] = var2;
                    String var3 = field771[var1];
                    field771[var1] = field771[var1 + 1];
                    field771[var1 + 1] = var3;
                    int var4 = field857[var1];
                    field857[var1] = field857[var1 + 1];
                    field857[var1 + 1] = var4;
                    int var5 = field767[var1];
                    field767[var1] = field767[var1 + 1];
                    field767[var1 + 1] = var5;
                    int var6 = field751[var1];
                    field751[var1] = field751[var1 + 1];
                    field751[var1 + 1] = var6;
                    int var7 = field777[var1];
                    field777[var1] = field777[var1 + 1];
                    field777[var1 + 1] = var7;
                    boolean var8 = field761[var1];
                    field761[var1] = field761[var1 + 1];
                    field761[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ao.is(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method513(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field901 || field667 >= 500) {
            return;
        }
        field771[field667] = arg0;
        field772[field667] = arg1;
        field857[field667] = arg2;
        field777[field667] = arg3;
        field767[field667] = arg4;
        field751[field667] = arg5;
        field761[field667] = arg6;
        field667++;
    }

    @ObfuscatedName("bb.ik(I)I")
    public static final int method1147() {
        return field667 - 1;
    }

    @ObfuscatedName("hm.id(I)V")
    public static void method3733() {
        for (int var0 = 0; var0 < field667; var0++) {
            int var1 = field857[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field667 - 1) {
                    for (int var3 = var0; var3 < field667 - 1; var3++) {
                        field771[var3] = field771[var3 + 1];
                        field772[var3] = field772[var3 + 1];
                        field857[var3] = field857[var3 + 1];
                        field777[var3] = field777[var3 + 1];
                        field767[var3] = field767[var3 + 1];
                        field751[var3] = field751[var3 + 1];
                        field761[var3] = field761[var3 + 1];
                    }
                }
                var0--;
                field667--;
            }
        }
        int var4 = Statics.field384 / 2 + Statics.field44;
        int var5 = Statics.field321;
        int var6 = Statics.field59.method4962(class225.field2901);
        for (int var7 = 0; var7 < field667; var7++) {
            class294 var8 = Statics.field59;
            String var9;
            if (var7 < 0) {
                var9 = "";
            } else if (field772[var7].length() > 0) {
                var9 = field771[var7] + class225.field2909 + field772[var7];
            } else {
                var9 = field771[var7];
            }
            int var10 = var8.method4962(var9);
            if (var10 > var6) {
                var6 = var10;
            }
        }
        var6 += 8;
        int var11 = field667 * 15 + 22;
        int var12 = var4 - var6 / 2;
        if (var6 + var12 > Statics.field45) {
            var12 = Statics.field45 - var6;
        }
        if (var12 < 0) {
            var12 = 0;
        }
        int var13 = var5;
        if (var11 + var5 > Statics.field1152) {
            var13 = Statics.field1152 - var11;
        }
        if (var13 < 0) {
            var13 = 0;
        }
        Statics.field44 = var12;
        Statics.field321 = var13;
        Statics.field384 = var6;
        Statics.field481 = field667 * 15 + 22;
    }

    @ObfuscatedName("go.ig(IIIIB)V")
    public static final void method3565(int arg0, int arg1, int arg2, int arg3) {
        if (field673 == 0 && !field784) {
            Statics.method10(class225.field2903, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class129.method3340(); var8++) {
            long var9 = class129.method132(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class129.method4906(class129.field1726[var8]);
                int var12 = var11;
                int var13 = class129.method2504(var8);
                int var14 = class129.method3255(var8);
                int var15 = class129.method259(var8);
                if (var14 == 2 && Statics.field86.method2864(Statics.field1929, var11, var13, var9) >= 0) {
                    class254 var16 = class254.method3616(var15);
                    if (var16.field3321 != null) {
                        var16 = var16.method4241();
                    }
                    if (var16 == null) {
                        continue;
                    }
                    if (field673 == 1) {
                        Statics.method10(class225.field2769, field783 + " " + class82.field1131 + " " + class82.method1876(65535) + var16.field3325, 1, var15, var11, var13);
                    } else if (!field784) {
                        String[] var17 = var16.field3342;
                        if (var17 != null) {
                            for (int var18 = 4; var18 >= 0; var18--) {
                                if (var17[var18] != null) {
                                    short var19 = 0;
                                    if (var18 == 0) {
                                        var19 = 3;
                                    }
                                    if (var18 == 1) {
                                        var19 = 4;
                                    }
                                    if (var18 == 2) {
                                        var19 = 5;
                                    }
                                    if (var18 == 3) {
                                        var19 = 6;
                                    }
                                    if (var18 == 4) {
                                        var19 = 1001;
                                    }
                                    Statics.method10(var17[var18], class82.method1876(65535) + var16.field3325, var19, var15, var12, var13);
                                }
                            }
                        }
                        Statics.method10(class225.field2899, class82.method1876(65535) + var16.field3325, 1002, var16.field3324, var12, var13);
                    } else if ((Statics.field1502 & 0x4) == 4) {
                        Statics.method10(field787, field782 + " " + class82.field1131 + " " + class82.method1876(65535) + var16.field3325, 2, var15, var11, var13);
                    }
                }
                if (var14 == 1) {
                    class80 var20 = field762[var15];
                    if (var20 == null) {
                        continue;
                    }
                    if (var20.field1106.field3435 == 1 && (var20.field937 & 0x7F) == 64 && (var20.field923 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field672; var21++) {
                            class80 var22 = field762[field905[var21]];
                            if (var22 != null && var20 != var22 && var22.field1106.field3435 == 1 && var20.field937 == var22.field937 && var20.field923 == var22.field923) {
                                method5448(var22.field1106, field905[var21], var12, var13);
                            }
                        }
                        int var23 = class90.field1234;
                        int[] var24 = class90.field1235;
                        for (int var25 = 0; var25 < var23; var25++) {
                            class67 var26 = field745[var24[var25]];
                            if (var26 != null && var20.field937 == var26.field937 && var20.field923 == var26.field923) {
                                method478(var26, var24[var25], var12, var13);
                            }
                        }
                    }
                    method5448(var20.field1106, var15, var12, var13);
                }
                if (var14 == 0) {
                    class67 var27 = field745[var15];
                    if (var27 == null) {
                        continue;
                    }
                    if ((var27.field937 & 0x7F) == 64 && (var27.field923 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < field672; var28++) {
                            class80 var29 = field762[field905[var28]];
                            if (var29 != null && var29.field1106.field3435 == 1 && var27.field937 == var29.field937 && var27.field923 == var29.field923) {
                                method5448(var29.field1106, field905[var28], var12, var13);
                            }
                        }
                        int var30 = class90.field1234;
                        int[] var31 = class90.field1235;
                        for (int var32 = 0; var32 < var30; var32++) {
                            class67 var33 = field745[var31[var32]];
                            if (var33 != null && var27 != var33 && var27.field937 == var33.field937 && var27.field923 == var33.field923) {
                                method478(var33, var31[var32], var12, var13);
                            }
                        }
                    }
                    if (field756 == var15) {
                        var4 = var9;
                    } else {
                        method478(var27, var15, var12, var13);
                    }
                }
                if (var14 == 3) {
                    class262 var34 = field817[Statics.field1929][var12][var13];
                    if (var34 != null) {
                        for (class88 var35 = (class88) var34.method4532(); var35 != null; var35 = (class88) var34.method4556()) {
                            class255 var36 = Statics.method3278(var35.field1222);
                            if (field673 == 1) {
                                Statics.method10(class225.field2769, field783 + " " + class82.field1131 + " " + class82.method1876(16748608) + var36.field3378, 16, var35.field1222, var12, var13);
                            } else if (!field784) {
                                String[] var37 = var36.field3388;
                                for (int var38 = 4; var38 >= 0; var38--) {
                                    if (var37 != null && var37[var38] != null) {
                                        byte var39 = 0;
                                        if (var38 == 0) {
                                            var39 = 18;
                                        }
                                        if (var38 == 1) {
                                            var39 = 19;
                                        }
                                        if (var38 == 2) {
                                            var39 = 20;
                                        }
                                        if (var38 == 3) {
                                            var39 = 21;
                                        }
                                        if (var38 == 4) {
                                            var39 = 22;
                                        }
                                        Statics.method10(var37[var38], class82.method1876(16748608) + var36.field3378, var39, var35.field1222, var12, var13);
                                    } else if (var38 == 2) {
                                        Statics.method10(class225.field2826, class82.method1876(16748608) + var36.field3378, 20, var35.field1222, var12, var13);
                                    }
                                }
                                Statics.method10(class225.field2899, class82.method1876(16748608) + var36.field3378, 1004, var35.field1222, var12, var13);
                            } else if ((Statics.field1502 & 0x1) == 1) {
                                Statics.method10(field787, field782 + " " + class82.field1131 + " " + class82.method1876(16748608) + var36.field3378, 17, var35.field1222, var12, var13);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var40 = class129.method4906(var4);
            int var41 = (int) (var4 >>> 7 & 0x7FL);
            class67 var43 = field745[field756];
            method478(var43, field756, var40, var41);
        }
    }

    @ObfuscatedName("kz.ii(Liw;IIII)V")
    public static final void method5448(class257 arg0, int arg1, int arg2, int arg3) {
        if (field667 >= 400) {
            return;
        }
        if (arg0.field3459 != null) {
            arg0 = arg0.method4343();
        }
        if (arg0 == null || !arg0.field3444 || arg0.field3464 && field813 != arg1) {
            return;
        }
        String var4 = arg0.field3458;
        if (arg0.field3457 != 0) {
            int var6 = arg0.field3457;
            int var7 = Statics.field585.field618;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method1876(16711680);
            } else if (var8 < -6) {
                var9 = class82.method1876(16723968);
            } else if (var8 < -3) {
                var9 = class82.method1876(16740352);
            } else if (var8 < 0) {
                var9 = class82.method1876(16756736);
            } else if (var8 > 9) {
                var9 = class82.method1876(65280);
            } else if (var8 > 6) {
                var9 = class82.method1876(4259584);
            } else if (var8 > 3) {
                var9 = class82.method1876(8453888);
            } else if (var8 > 0) {
                var9 = class82.method1876(12648192);
            } else {
                var9 = class82.method1876(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1124 + class225.field3021 + arg0.field3457 + class82.field1128;
        }
        if (arg0.field3464 && field774) {
            Statics.method10(class225.field2899, class82.method1876(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field673 == 1) {
            Statics.method10(class225.field2769, field783 + " " + class82.field1131 + " " + class82.method1876(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field784) {
            int var10 = arg0.field3464 && field774 ? 2000 : 0;
            String[] var11 = arg0.field3456;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class225.field2900)) {
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
                        Statics.method10(var11[var12], class82.method1876(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class225.field2900)) {
                        short var15 = 0;
                        if (field658 != class85.field1147) {
                            if (field658 == class85.field1149 || field658 == class85.field1151 && arg0.field3457 > Statics.field585.field618) {
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
                            Statics.method10(var11[var14], class82.method1876(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3464 || !field774) {
                Statics.method10(class225.field2899, class82.method1876(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1502 & 0x2) == 2) {
            Statics.method10(field787, field782 + " " + class82.field1131 + " " + class82.method1876(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ak.iz(Lbn;IIII)V")
    public static final void method478(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field585 == arg0 || field667 >= 400) {
            return;
        }
        String var9;
        if (arg0.field598 == 0) {
            String var4 = arg0.field596[0] + arg0.field605 + arg0.field596[1];
            int var5 = arg0.field618;
            int var6 = Statics.field585.field618;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method1876(16711680);
            } else if (var7 < -6) {
                var8 = class82.method1876(16723968);
            } else if (var7 < -3) {
                var8 = class82.method1876(16740352);
            } else if (var7 < 0) {
                var8 = class82.method1876(16756736);
            } else if (var7 > 9) {
                var8 = class82.method1876(65280);
            } else if (var7 > 6) {
                var8 = class82.method1876(4259584);
            } else if (var7 > 3) {
                var8 = class82.method1876(8453888);
            } else if (var7 > 0) {
                var8 = class82.method1876(12648192);
            } else {
                var8 = class82.method1876(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1124 + class225.field3021 + arg0.field618 + class82.field1128 + arg0.field596[2];
        } else {
            var9 = arg0.field596[0] + arg0.field605 + arg0.field596[1] + " " + class82.field1124 + class225.field2905 + arg0.field598 + class82.field1128 + arg0.field596[2];
        }
        if (field673 == 1) {
            Statics.method10(class225.field2769, field783 + " " + class82.field1131 + " " + class82.method1876(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field784) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field766[var10] != null) {
                    short var11 = 0;
                    if (field766[var10].equalsIgnoreCase(class225.field2900)) {
                        if (field657 == class85.field1147) {
                            continue;
                        }
                        if (field657 == class85.field1149 || field657 == class85.field1151 && arg0.field618 > Statics.field585.field618) {
                            var11 = 2000;
                        }
                        if (Statics.field585.field611 != 0 && arg0.field611 != 0) {
                            if (Statics.field585.field611 == arg0.field611) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field644[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field823[var10] + var11;
                    Statics.method10(field766[var10], class82.method1876(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1502 & 0x8) == 8) {
            Statics.method10(field787, field782 + " " + class82.field1131 + " " + class82.method1876(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field667; var14++) {
            if (field857[var14] == 23) {
                field772[var14] = class82.method1876(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("k.iw(IIIIIIIII)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method3537(arg0)) {
            Statics.field2224 = null;
            method3070(Statics.field1950[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2224 != null) {
                method3070(Statics.field2224, -1412584499, arg1, arg2, arg3, arg4, Statics.field32, Statics.field1127, arg7);
                Statics.field2224 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field834[var8] = true;
            }
        } else {
            field834[arg7] = true;
        }
    }

    @ObfuscatedName("eu.ib([Lha;IIIIIIIII)V")
    public static final void method3070(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5541(arg2, arg3, arg4, arg5);
        class131.method2820();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2542 == arg1 || arg1 == -1412584499 && field802 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field837[field832] = var10.field2543 + arg6;
                    field838[field832] = var10.field2582 + arg7;
                    field839[field832] = var10.field2567;
                    field840[field832] = var10.field2693;
                    var11 = ++field832 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2689 = var11;
                var10.field2690 = field641;
                if (!var10.field2607 || !method2020(var10)) {
                    if (var10.field2692 > 0) {
                        method2289(var10);
                    }
                    int var12 = var10.field2543 + arg6;
                    int var13 = var10.field2582 + arg7;
                    int var14 = var10.field2583;
                    if (field802 == var10) {
                        if (arg1 != -1412584499 && !var10.field2636) {
                            Statics.field2224 = arg0;
                            Statics.field32 = arg6;
                            Statics.field1127 = arg7;
                            continue;
                        }
                        if (field638 && field807) {
                            int var15 = class54.field466;
                            int var16 = class54.field477;
                            int var17 = var15 - field804;
                            int var18 = var16 - field635;
                            if (var17 < field808) {
                                var17 = field808;
                            }
                            if (var10.field2567 + var17 > field808 + field803.field2567) {
                                var17 = field808 + field803.field2567 - var10.field2567;
                            }
                            if (var18 < field809) {
                                var18 = field809;
                            }
                            if (var10.field2693 + var18 > field809 + field803.field2693) {
                                var18 = field809 + field803.field2693 - var10.field2693;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2636) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2554 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2554 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2567 + var12;
                        int var26 = var10.field2693 + var13;
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
                        int var29 = var10.field2567 + var12;
                        int var30 = var10.field2693 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2607 || var19 < var21 && var20 < var22) {
                        if (var10.field2692 != 0) {
                            if (var10.field2692 == 1336) {
                                if (field647) {
                                    var13 += 15;
                                    Statics.field489.method4968("Fps:" + field446, var10.field2567 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field846) {
                                        var33 = 16711680;
                                    }
                                    Statics.field489.method4968("Mem:" + var32 + "k", var10.field2567 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2692 == 1337) {
                                field778 = var12;
                                field794 = var13;
                                method3339(var12, var13, var10.field2567, var10.field2693);
                                field834[var10.field2689] = true;
                                class321.method5541(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2692 == 1338) {
                                method3022(var10, var12, var13, var11);
                                class321.method5541(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2692 == 1339) {
                                method1736(var10, var12, var13, var11);
                                class321.method5541(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2692 == 1400) {
                                Statics.field36.method5872(var12, var13, var10.field2567, var10.field2693, field641);
                            }
                            if (var10.field2692 == 1401) {
                                Statics.field36.method5875(var12, var13, var10.field2567, var10.field2693);
                            }
                            if (var10.field2692 == 1402) {
                                Statics.field3279.method1638(var12, field641);
                            }
                        }
                        if (var10.field2554 == 0) {
                            if (!var10.field2607 && method2020(var10) && Statics.field103 != var10) {
                                continue;
                            }
                            if (!var10.field2607) {
                                if (var10.field2574 > var10.field2586 - var10.field2693) {
                                    var10.field2574 = var10.field2586 - var10.field2693;
                                }
                                if (var10.field2574 < 0) {
                                    var10.field2574 = 0;
                                }
                            }
                            method3070(arg0, var10.field2669, var19, var20, var21, var22, var12 - var10.field2573, var13 - var10.field2574, var11);
                            if (var10.field2682 != null) {
                                method3070(var10.field2682, var10.field2669, var19, var20, var21, var22, var12 - var10.field2573, var13 - var10.field2574, var11);
                            }
                            class62 var34 = (class62) field790.method5499((long) var10.field2669);
                            if (var34 != null) {
                                method128(var34.field548, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5541(arg2, arg3, arg4, arg5);
                            class131.method2820();
                        }
                        if (field843 || field836[var11] || field841 > 1) {
                            if (var10.field2554 == 0 && !var10.field2607 && var10.field2586 > var10.field2693) {
                                Statics.method4662(var10.field2567 + var12, var13, var10.field2574, var10.field2693, var10.field2586);
                            }
                            if (var10.field2554 != 1) {
                                if (var10.field2554 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2599; var36++) {
                                        for (int var37 = 0; var37 < var10.field2657; var37++) {
                                            int var38 = (var10.field2619 + 32) * var37 + var12;
                                            int var39 = (var10.field2628 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2548[var35];
                                                var39 += var10.field2622[var35];
                                            }
                                            if (var10.field2676[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2676[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1035 == var10 && field886 == var35) {
                                                    class325 var43;
                                                    if (field673 == 1 && Statics.field389 == var35 && Statics.field1886 == var10.field2669) {
                                                        var43 = class255.method3745(var42, var10.field2679[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method3745(var42, var10.field2679[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3272(var10);
                                                    } else if (Statics.field1035 == var10 && field886 == var35) {
                                                        int var44 = class54.field466 - field864;
                                                        int var45 = class54.field477 - field739;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field742 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5657(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3845 && var46.field2574 > 0) {
                                                                int var47 = field691 * (class321.field3845 - var39 - var45) / 3;
                                                                if (var47 > field691 * 10) {
                                                                    var47 = field691 * 10;
                                                                }
                                                                if (var47 > var46.field2574) {
                                                                    var47 = var46.field2574;
                                                                }
                                                                var46.field2574 -= var47;
                                                                field739 += var47;
                                                                method3272(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3844 && var46.field2574 < var46.field2586 - var46.field2693) {
                                                                int var48 = field691 * (var39 + var45 + 32 - class321.field3844) / 3;
                                                                if (var48 > field691 * 10) {
                                                                    var48 = field691 * 10;
                                                                }
                                                                if (var48 > var46.field2586 - var46.field2693 - var46.field2574) {
                                                                    var48 = var46.field2586 - var46.field2693 - var46.field2574;
                                                                }
                                                                var46.field2574 += var48;
                                                                field739 -= var48;
                                                                method3272(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2373 == var10 && field736 == var35) {
                                                        var43.method5657(var38, var39, 128);
                                                    } else {
                                                        var43.method5712(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2623 != null && var35 < 20) {
                                                class325 var49 = var10.method3700(var35);
                                                if (var49 != null) {
                                                    var49.method5712(var38, var39);
                                                } else if (class218.field2550) {
                                                    method3272(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2554 == 3) {
                                    int var50;
                                    if (method155(var10)) {
                                        var50 = var10.field2578;
                                        if (Statics.field103 == var10 && var10.field2580 != 0) {
                                            var50 = var10.field2580;
                                        }
                                    } else {
                                        var50 = var10.field2577;
                                        if (Statics.field103 == var10 && var10.field2579 != 0) {
                                            var50 = var10.field2579;
                                        }
                                    }
                                    if (var10.field2581) {
                                        switch(var10.field2652.field3852) {
                                            case 1:
                                                class321.method5587(var12, var13, var10.field2567, var10.field2693, var10.field2577, var10.field2578);
                                                break;
                                            case 2:
                                                class321.method5575(var12, var13, var10.field2567, var10.field2693, var10.field2577, var10.field2578, 255 - (var10.field2583 & 0xFF), 255 - (var10.field2615 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5589(var12, var13, var10.field2567, var10.field2693, var50);
                                                } else {
                                                    class321.method5547(var12, var13, var10.field2567, var10.field2693, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5553(var12, var13, var10.field2567, var10.field2693, var50);
                                    } else {
                                        class321.method5552(var12, var13, var10.field2567, var10.field2693, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2554 == 4) {
                                    class294 var51 = var10.method3667();
                                    if (var51 != null) {
                                        String var52 = var10.field2576;
                                        int var53;
                                        if (method155(var10)) {
                                            var53 = var10.field2578;
                                            if (Statics.field103 == var10 && var10.field2580 != 0) {
                                                var53 = var10.field2580;
                                            }
                                            if (var10.field2614.length() > 0) {
                                                var52 = var10.field2614;
                                            }
                                        } else {
                                            var53 = var10.field2577;
                                            if (Statics.field103 == var10 && var10.field2579 != 0) {
                                                var53 = var10.field2579;
                                            }
                                        }
                                        if (var10.field2607 && var10.field2664 != -1) {
                                            class255 var54 = Statics.method3278(var10.field2664);
                                            var52 = var54.field3378;
                                            if (var52 == null) {
                                                var52 = class225.field2800;
                                            }
                                            if ((var54.field3411 == 1 || var10.field2694 != 1) && var10.field2694 != -1) {
                                                var52 = class82.method1876(16748608) + var52 + class82.field1121 + " " + 'x' + method215(var10.field2694);
                                            }
                                        }
                                        if (field795 == var10) {
                                            var52 = class225.field2906;
                                            var53 = var10.field2577;
                                        }
                                        if (!var10.field2607) {
                                            var52 = method490(var52, var10);
                                        }
                                        var51.method4970(var52, var12, var13, var10.field2567, var10.field2693, var53, var10.field2691 ? 0 : -1, var10.field2685, var10.field2617, var10.field2610);
                                    } else if (class218.field2550) {
                                        method3272(var10);
                                    }
                                } else if (var10.field2554 == 5) {
                                    if (var10.field2607) {
                                        class325 var56;
                                        if (var10.field2664 == -1) {
                                            var56 = var10.method3666(false);
                                        } else {
                                            var56 = class255.method3745(var10.field2664, var10.field2694, var10.field2591, var10.field2592, var10.field2552, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3869;
                                            int var58 = var56.field3864;
                                            if (var10.field2590) {
                                                class321.method5562(var12, var13, var10.field2567 + var12, var10.field2693 + var13);
                                                int var59 = (var10.field2567 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2693 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2589 != 0) {
                                                            var56.method5745(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2589, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5712(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5657(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5541(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2567 * 4096 / var57;
                                                if (var10.field2589 != 0) {
                                                    var56.method5745(var10.field2567 / 2 + var12, var10.field2693 / 2 + var13, var10.field2589, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5659(var12, var13, var10.field2567, var10.field2693, 256 - (var14 & 0xFF));
                                                } else if (var10.field2567 == var57 && var10.field2693 == var58) {
                                                    var56.method5712(var12, var13);
                                                } else {
                                                    var56.method5653(var12, var13, var10.field2567, var10.field2693);
                                                }
                                            }
                                        } else if (class218.field2550) {
                                            method3272(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3666(method155(var10));
                                        if (var55 != null) {
                                            var55.method5712(var12, var13);
                                        } else if (class218.field2550) {
                                            method3272(var10);
                                        }
                                    }
                                } else if (var10.field2554 == 6) {
                                    boolean var64 = method155(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2600;
                                    } else {
                                        var65 = var10.field2596;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2664 != -1) {
                                        class255 var68 = Statics.method3278(var10.field2664);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4275(var10.field2694);
                                            var66 = var69.method4325(1);
                                            if (var66 == null) {
                                                method3272(var10);
                                            } else {
                                                var66.method2691();
                                                var67 = var66.field1850 / 2;
                                            }
                                        }
                                    } else if (var10.field2595 == 5) {
                                        if (var10.field2571 == 0) {
                                            var66 = field893.method3624((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field585.method1101();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3676((class259) null, -1, var64, Statics.field585.field595);
                                        if (var66 == null && class218.field2550) {
                                            method3272(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method209(var65);
                                        var66 = var10.method3676(var70, var10.field2680, var64, Statics.field585.field595);
                                        if (var66 == null && class218.field2550) {
                                            method3272(var10);
                                        }
                                    }
                                    class131.method2830(var10.field2567 / 2 + var12, var10.field2693 / 2 + var13);
                                    int var71 = var10.field2644 * class131.field1762[var10.field2559] >> 16;
                                    int var72 = var10.field2644 * class131.field1737[var10.field2559] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2607) {
                                            var66.method2691();
                                            if (var10.field2609) {
                                                var66.method2649(0, var10.field2604, var10.field2605, var10.field2559, var10.field2601, var10.field2602 + var67 + var71, var10.field2602 + var72, var10.field2644);
                                            } else {
                                                var66.method2651(0, var10.field2604, var10.field2605, var10.field2559, var10.field2601, var10.field2602 + var67 + var71, var10.field2602 + var72);
                                            }
                                        } else {
                                            var66.method2651(0, var10.field2604, 0, var10.field2559, 0, var71, var72);
                                        }
                                    }
                                    class131.method2775();
                                } else {
                                    if (var10.field2554 == 7) {
                                        class294 var73 = var10.method3667();
                                        if (var73 == null) {
                                            if (class218.field2550) {
                                                method3272(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2599; var75++) {
                                            for (int var76 = 0; var76 < var10.field2657; var76++) {
                                                if (var10.field2676[var74] > 0) {
                                                    class255 var77 = Statics.method3278(var10.field2676[var74] - 1);
                                                    String var78;
                                                    if (var77.field3411 != 1 && var10.field2679[var74] == 1) {
                                                        var78 = class82.method1876(16748608) + var77.field3378 + class82.field1121;
                                                    } else {
                                                        var78 = class82.method1876(16748608) + var77.field3378 + class82.field1121 + " " + 'x' + method215(var10.field2679[var74]);
                                                    }
                                                    int var79 = (var10.field2619 + 115) * var76 + var12;
                                                    int var80 = (var10.field2628 + 12) * var75 + var13;
                                                    if (var10.field2685 == 0) {
                                                        var73.method4966(var78, var79, var80, var10.field2577, var10.field2691 ? 0 : -1);
                                                    } else if (var10.field2685 == 1) {
                                                        var73.method4988(var78, var10.field2567 / 2 + var79, var80, var10.field2577, var10.field2691 ? 0 : -1);
                                                    } else {
                                                        var73.method4968(var78, var10.field2567 + var79 - 1, var80, var10.field2577, var10.field2691 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2554 == 8 && Statics.field91 == var10 && field799 == field675) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class294 var83 = Statics.field489;
                                        String var84 = var10.field2576;
                                        String var85 = method490(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1126);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4962(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3666 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2567 + var12 - 5 - var81;
                                        int var90 = var10.field2693 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5589(var89, var90, var81, var82, 16777120);
                                        class321.method5553(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2576;
                                        int var92 = var83.field3666 + var90 + 2;
                                        String var93 = method490(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1126);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4966(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3666 + 1;
                                        }
                                    }
                                    if (var10.field2554 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2677) {
                                            var96 = var12;
                                            var97 = var10.field2693 + var13;
                                            var98 = var10.field2567 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2567 + var12;
                                            var99 = var10.field2693 + var13;
                                        }
                                        if (var10.field2585 == 1) {
                                            class321.method5558(var96, var97, var98, var99, var10.field2577);
                                        } else {
                                            method698(var96, var97, var98, var99, var10.field2577, var10.field2585);
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

    @ObfuscatedName("ax.iv(IIIIIIB)V")
    public static final void method698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3840;
        int var18 = arg1 - class321.field3845;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2822(var19, var20, var21);
        class131.method2752(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2822(var19, var21, var22);
        class131.method2752(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ah.in(Ljava/lang/String;Lha;B)Ljava/lang/String;")
    public static String method490(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method4684(arg1, var2 - 1);
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

    @ObfuscatedName("z.jl(IB)Ljava/lang/String;")
    public static final String method215(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1122 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method1876(65408) + var1.substring(0, var1.length() - 8) + class225.field2986 + " " + class82.field1124 + var1 + class82.field1128 + class82.field1121;
        } else if (var1.length() > 6) {
            return " " + class82.method1876(16777215) + var1.substring(0, var1.length() - 4) + class225.field2911 + " " + class82.field1124 + var1 + class82.field1128 + class82.field1121;
        } else {
            return " " + class82.method1876(16776960) + var1 + class82.field1121;
        }
    }

    @ObfuscatedName("client.js(ZI)V")
    public final void method1403(boolean arg0) {
        method3268(field789, Statics.field45, Statics.field1152, arg0);
    }

    @ObfuscatedName("client.jw(Lha;I)V")
    public void method1164(class218 arg0) {
        class218 var2 = arg0.field2542 == -1 ? null : Statics.method2628(arg0.field2542);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field45;
            var4 = Statics.field1152;
        } else {
            var3 = var2.field2567;
            var4 = var2.field2693;
        }
        method491(arg0, var3, var4, false);
        method20(arg0, var3, var4);
    }

    @ObfuscatedName("fm.ja(IIIZB)V")
    public static final void method3268(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method3537(arg0)) {
            method4395(Statics.field1950[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ib.ji([Lha;IIIZB)V")
    public static void method4395(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2542 == arg1) {
                method491(var6, arg2, arg3, arg4);
                method20(var6, arg2, arg3);
                if (var6.field2573 > var6.field2575 - var6.field2567) {
                    var6.field2573 = var6.field2575 - var6.field2567;
                }
                if (var6.field2573 < 0) {
                    var6.field2573 = 0;
                }
                if (var6.field2574 > var6.field2586 - var6.field2693) {
                    var6.field2574 = var6.field2586 - var6.field2693;
                }
                if (var6.field2574 < 0) {
                    var6.field2574 = 0;
                }
                if (var6.field2554 == 0) {
                    Statics.method2023(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ah.jn(Lha;IIZB)V")
    public static void method491(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2567;
        int var5 = arg0.field2693;
        if (arg0.field2667 == 0) {
            arg0.field2567 = arg0.field2657;
        } else if (arg0.field2667 == 1) {
            arg0.field2567 = arg1 - arg0.field2657;
        } else if (arg0.field2667 == 2) {
            arg0.field2567 = arg0.field2657 * arg1 >> 14;
        }
        if (arg0.field2560 == 0) {
            arg0.field2693 = arg0.field2599;
        } else if (arg0.field2560 == 1) {
            arg0.field2693 = arg2 - arg0.field2599;
        } else if (arg0.field2560 == 2) {
            arg0.field2693 = arg0.field2599 * arg2 >> 14;
        }
        if (arg0.field2667 == 4) {
            arg0.field2567 = arg0.field2693 * arg0.field2618 / arg0.field2570;
        }
        if (arg0.field2560 == 4) {
            arg0.field2693 = arg0.field2570 * arg0.field2567 / arg0.field2618;
        }
        if (arg0.field2692 == 1337) {
            field875 = arg0;
        }
        if (arg3 && arg0.field2621 != null && (arg0.field2567 != var4 || arg0.field2693 != var5)) {
            class63 var6 = new class63();
            var6.field552 = arg0;
            var6.field550 = arg0.field2621;
            field828.method4554(var6);
        }
    }

    @ObfuscatedName("y.jh(Lha;III)V")
    public static void method20(class218 arg0, int arg1, int arg2) {
        if (arg0.field2557 == 0) {
            arg0.field2543 = arg0.field2561;
        } else if (arg0.field2557 == 1) {
            arg0.field2543 = (arg1 - arg0.field2567) / 2 + arg0.field2561;
        } else if (arg0.field2557 == 2) {
            arg0.field2543 = arg1 - arg0.field2567 - arg0.field2561;
        } else if (arg0.field2557 == 3) {
            arg0.field2543 = arg0.field2561 * arg1 >> 14;
        } else if (arg0.field2557 == 4) {
            arg0.field2543 = (arg0.field2561 * arg1 >> 14) + (arg1 - arg0.field2567) / 2;
        } else {
            arg0.field2543 = arg1 - arg0.field2567 - (arg0.field2561 * arg1 >> 14);
        }
        if (arg0.field2558 == 0) {
            arg0.field2582 = arg0.field2562;
        } else if (arg0.field2558 == 1) {
            arg0.field2582 = (arg2 - arg0.field2693) / 2 + arg0.field2562;
        } else if (arg0.field2558 == 2) {
            arg0.field2582 = arg2 - arg0.field2693 - arg0.field2562;
        } else if (arg0.field2558 == 3) {
            arg0.field2582 = arg0.field2562 * arg2 >> 14;
        } else if (arg0.field2558 == 4) {
            arg0.field2582 = (arg0.field2562 * arg2 >> 14) + (arg2 - arg0.field2693) / 2;
        } else {
            arg0.field2582 = arg2 - arg0.field2693 - (arg0.field2562 * arg2 >> 14);
        }
    }

    @ObfuscatedName("r.jz(Lha;IIIIIIB)V")
    public static final void method258(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field696) {
            field697 = 32;
        } else {
            field697 = 0;
        }
        field696 = false;
        if (class54.field465 == 1 || !Statics.field3102 && class54.field465 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2574 -= 4;
                method3272(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2574 += 4;
                method3272(arg0);
            } else if (arg5 >= arg1 - field697 && arg5 < field697 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2574 = (arg4 - arg3) * var8 / var9;
                method3272(arg0);
                field696 = true;
            }
        }
        if (field827 == 0) {
            return;
        }
        int var10 = arg0.field2567;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2574 += field827 * 45;
            method3272(arg0);
        }
    }

    @ObfuscatedName("l.jk(Lha;I)Z")
    public static final boolean method155(class218 arg0) {
        if (arg0.field2551 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2551.length; var1++) {
            int var2 = method4684(arg0, var1);
            int var3 = arg0.field2672[var1];
            if (arg0.field2551[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2551[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2551[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jy.jx(Lha;II)I")
    public static final int method4684(class218 arg0, int arg1) {
        if (arg0.field2670 == null || arg1 >= arg0.field2670.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2670[arg1];
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
                    var7 = field671[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field788[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field763[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = Statics.method2628(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method3278(var12).field3391 || field634)) {
                        for (int var13 = 0; var13 < var11.field2676.length; var13++) {
                            if (var12 + 1 == var11.field2676[var13]) {
                                var7 += var11.field2679[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2511[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2732[field788[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2511[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field585.field618;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2730[var14]) {
                            var7 += field788[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = Statics.method2628(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method3278(var18).field3391 || field634)) {
                        for (int var19 = 0; var19 < var17.field2676.length; var19++) {
                            if (var18 + 1 == var17.field2676[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field796;
                }
                if (var6 == 12) {
                    var7 = field725;
                }
                if (var6 == 13) {
                    int var20 = class213.field2511[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method782(var22);
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
                    var7 = (Statics.field585.field937 >> 7) + Statics.field2477;
                }
                if (var6 == 19) {
                    var7 = (Statics.field585.field923 >> 7) + Statics.field562;
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

    @ObfuscatedName("ka.jm(ZB)V")
    public static void method5044(boolean arg0) {
        field776 = arg0;
    }

    @ObfuscatedName("ae.ju(I)Z")
    public static boolean method648() {
        return field776;
    }

    @ObfuscatedName("q.jb(I)Z")
    public static boolean method263() {
        return field776 || class45.field367[81];
    }

    @ObfuscatedName("kq.je(IIIIIIII)V")
    public static final void method5261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method3537(arg0)) {
            method575(Statics.field1950[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ay.jt([Lha;IIIIIIIB)V")
    public static final void method575(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2542 == arg1 && (!var9.field2607 || var9.field2554 == 0 || var9.field2640 || method210(var9) != 0 || field803 == var9 || var9.field2692 == 1338)) {
                if (var9.field2607) {
                    if (method2020(var9)) {
                        continue;
                    }
                } else if (var9.field2554 == 0 && Statics.field103 != var9 && method2020(var9)) {
                    continue;
                }
                int var10 = var9.field2543 + arg6;
                int var11 = var9.field2582 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2554 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2554 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2567 + var10;
                    int var19 = var9.field2693 + var11;
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
                    int var22 = var9.field2567 + var10;
                    int var23 = var9.field2693 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field802 == var9) {
                    field810 = true;
                    field883 = var10;
                    field812 = var11;
                }
                boolean var24 = false;
                if (var9.field2626) {
                    switch(field791) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2669 >>> 16 == field792) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field792 == var9.field2669) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2607 || var12 < var14 && var13 < var15) {
                    if (var9.field2607) {
                        if (var9.field2620) {
                            if (class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15) {
                                for (class63 var25 = (class63) field828.method4540(); var25 != null; var25 = (class63) field828.method4533()) {
                                    if (var25.field551) {
                                        var25.method3292();
                                        var25.field552.field2683 = false;
                                    }
                                }
                                if (Statics.field188 == 0) {
                                    field802 = null;
                                    field803 = null;
                                }
                                if (!field901) {
                                    method1577();
                                }
                            }
                        } else if (var9.field2565 && class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15) {
                            for (class63 var26 = (class63) field828.method4540(); var26 != null; var26 = (class63) field828.method4533()) {
                                if (var26.field551 && var26.field552.field2659 == var26.field550) {
                                    var26.method3292();
                                }
                            }
                        }
                    }
                    int var27 = class54.field466;
                    int var28 = class54.field477;
                    if (class54.field473 != 0) {
                        var27 = class54.field474;
                        var28 = class54.field475;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2692 == 1337) {
                        if (!field640 && !field901 && var29) {
                            method3565(var27, var28, var12, var13);
                        }
                    } else if (var9.field2692 == 1338) {
                        method4707(var9, var10, var11);
                    } else {
                        if (var9.field2692 == 1400) {
                            Statics.field36.method5855(class54.field466, class54.field477, var29, var10, var11, var9.field2567, var9.field2693);
                        }
                        if (!field901 && var29) {
                            if (var9.field2692 == 1400) {
                                Statics.field36.method5907(var10, var11, var9.field2567, var9.field2693, var27, var28);
                            } else {
                                Statics.method235(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2627.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2627[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2627[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2656 != null) {
                                            var34 = class45.field367[var9.field2627[var30][var33]];
                                        }
                                        if (method1044(var9.field2627[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2656 != null && var9.field2656[var30] > field641) {
                                                break;
                                            }
                                            byte var35 = var9.field2630[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class45.field367[86] && !class45.field367[82] && !class45.field367[81]) && ((var35 & 0x2) == 0 || class45.field367[86]) && ((var35 & 0x1) == 0 || class45.field367[82]) && ((var35 & 0x4) == 0 || class45.field367[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method672(var30 + 1, var9.field2669, var9.field2553, var9.field2664, "");
                                    } else if (var30 == 10) {
                                        method101();
                                        method157(var9.field2669, var9.field2553, class219.method137(method210(var9)), var9.field2664);
                                        field787 = method1026(var9);
                                        if (field787 == null) {
                                            field787 = class225.field2800;
                                        }
                                        field782 = var9.field2631 + class82.method1876(16777215);
                                    }
                                    int var36 = var9.field2632[var30];
                                    if (var9.field2656 == null) {
                                        var9.field2656 = new int[var9.field2627.length];
                                    }
                                    if (var9.field2671 == null) {
                                        var9.field2671 = new int[var9.field2627.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2656[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2656[var30] == 0) {
                                        var9.field2656[var30] = field641 + var36 + var9.field2671[var30];
                                    } else {
                                        var9.field2656[var30] = field641 + var36;
                                    }
                                }
                                if (!var31 && var9.field2656 != null) {
                                    var9.field2656[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2607) {
                            boolean var37;
                            if (class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class54.field465 == 1 || !Statics.field3102 && class54.field465 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class54.field473 == 1 || !Statics.field3102 && class54.field473 == 4) && class54.field474 >= var12 && class54.field475 >= var13 && class54.field474 < var14 && class54.field475 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method117(var9, class54.field474 - var10, class54.field475 - var11);
                            }
                            if (var9.field2692 == 1400) {
                                Statics.field36.method5856(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field802 != null && field802 != var9 && var37 && class219.method1137(method210(var9))) {
                                field806 = var9;
                            }
                            if (field803 == var9) {
                                field807 = true;
                                field808 = var10;
                                field809 = var11;
                            }
                            if (var9.field2640) {
                                if (var37 && field827 != 0 && var9.field2659 != null) {
                                    class63 var40 = new class63();
                                    var40.field551 = true;
                                    var40.field552 = var9;
                                    var40.field555 = field827;
                                    var40.field550 = var9.field2659;
                                    field828.method4554(var40);
                                }
                                if (field802 != null || Statics.field1035 != null || field901) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2684 && var39) {
                                    var9.field2684 = true;
                                    if (var9.field2616 != null) {
                                        class63 var41 = new class63();
                                        var41.field551 = true;
                                        var41.field552 = var9;
                                        var41.field553 = class54.field474 - var10;
                                        var41.field555 = class54.field475 - var11;
                                        var41.field550 = var9.field2616;
                                        field828.method4554(var41);
                                    }
                                }
                                if (var9.field2684 && var38 && var9.field2641 != null) {
                                    class63 var42 = new class63();
                                    var42.field551 = true;
                                    var42.field552 = var9;
                                    var42.field553 = class54.field466 - var10;
                                    var42.field555 = class54.field477 - var11;
                                    var42.field550 = var9.field2641;
                                    field828.method4554(var42);
                                }
                                if (var9.field2684 && !var38) {
                                    var9.field2684 = false;
                                    if (var9.field2642 != null) {
                                        class63 var43 = new class63();
                                        var43.field551 = true;
                                        var43.field552 = var9;
                                        var43.field553 = class54.field466 - var10;
                                        var43.field555 = class54.field477 - var11;
                                        var43.field550 = var9.field2642;
                                        field884.method4554(var43);
                                    }
                                }
                                if (var38 && var9.field2647 != null) {
                                    class63 var44 = new class63();
                                    var44.field551 = true;
                                    var44.field552 = var9;
                                    var44.field553 = class54.field466 - var10;
                                    var44.field555 = class54.field477 - var11;
                                    var44.field550 = var9.field2647;
                                    field828.method4554(var44);
                                }
                                if (!var9.field2683 && var37) {
                                    var9.field2683 = true;
                                    if (var9.field2634 != null) {
                                        class63 var45 = new class63();
                                        var45.field551 = true;
                                        var45.field552 = var9;
                                        var45.field553 = class54.field466 - var10;
                                        var45.field555 = class54.field477 - var11;
                                        var45.field550 = var9.field2634;
                                        field828.method4554(var45);
                                    }
                                }
                                if (var9.field2683 && var37 && var9.field2645 != null) {
                                    class63 var46 = new class63();
                                    var46.field551 = true;
                                    var46.field552 = var9;
                                    var46.field553 = class54.field466 - var10;
                                    var46.field555 = class54.field477 - var11;
                                    var46.field550 = var9.field2645;
                                    field828.method4554(var46);
                                }
                                if (var9.field2683 && !var37) {
                                    var9.field2683 = false;
                                    if (var9.field2674 != null) {
                                        class63 var47 = new class63();
                                        var47.field551 = true;
                                        var47.field552 = var9;
                                        var47.field553 = class54.field466 - var10;
                                        var47.field555 = class54.field477 - var11;
                                        var47.field550 = var9.field2674;
                                        field884.method4554(var47);
                                    }
                                }
                                if (var9.field2566 != null) {
                                    class63 var48 = new class63();
                                    var48.field552 = var9;
                                    var48.field550 = var9.field2566;
                                    field866.method4554(var48);
                                }
                                if (var9.field2651 != null && field649 > var9.field2686) {
                                    if (var9.field2611 == null || field649 - var9.field2686 > 32) {
                                        class63 var53 = new class63();
                                        var53.field552 = var9;
                                        var53.field550 = var9.field2651;
                                        field828.method4554(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2686; var49 < field649; var49++) {
                                            int var50 = field815[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2611.length; var51++) {
                                                if (var9.field2611[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field552 = var9;
                                                    var52.field550 = var9.field2651;
                                                    field828.method4554(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field649;
                                }
                                if (var9.field2653 != null && field702 > var9.field2687) {
                                    if (var9.field2654 == null || field702 - var9.field2687 > 32) {
                                        class63 var58 = new class63();
                                        var58.field552 = var9;
                                        var58.field550 = var9.field2653;
                                        field828.method4554(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2687; var54 < field702; var54++) {
                                            int var55 = field811[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2654.length; var56++) {
                                                if (var9.field2654[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field552 = var9;
                                                    var57.field550 = var9.field2653;
                                                    field828.method4554(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2687 = field702;
                                }
                                if (var9.field2655 != null && field820 > var9.field2688) {
                                    if (var9.field2643 == null || field820 - var9.field2688 > 32) {
                                        class63 var63 = new class63();
                                        var63.field552 = var9;
                                        var63.field550 = var9.field2655;
                                        field828.method4554(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2688; var59 < field820; var59++) {
                                            int var60 = field818[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2643.length; var61++) {
                                                if (var9.field2643[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field552 = var9;
                                                    var62.field550 = var9.field2655;
                                                    field828.method4554(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2688 = field820;
                                }
                                if (field821 > var9.field2584 && var9.field2660 != null) {
                                    class63 var64 = new class63();
                                    var64.field552 = var9;
                                    var64.field550 = var9.field2660;
                                    field828.method4554(var64);
                                }
                                if (field712 > var9.field2584 && var9.field2662 != null) {
                                    class63 var65 = new class63();
                                    var65.field552 = var9;
                                    var65.field550 = var9.field2662;
                                    field828.method4554(var65);
                                }
                                if (field863 > var9.field2584 && var9.field2663 != null) {
                                    class63 var66 = new class63();
                                    var66.field552 = var9;
                                    var66.field550 = var9.field2663;
                                    field828.method4554(var66);
                                }
                                if (field824 > var9.field2584 && var9.field2668 != null) {
                                    class63 var67 = new class63();
                                    var67.field552 = var9;
                                    var67.field550 = var9.field2668;
                                    field828.method4554(var67);
                                }
                                if (field861 > var9.field2584 && var9.field2563 != null) {
                                    class63 var68 = new class63();
                                    var68.field552 = var9;
                                    var68.field550 = var9.field2563;
                                    field828.method4554(var68);
                                }
                                if (field826 > var9.field2584 && var9.field2588 != null) {
                                    class63 var69 = new class63();
                                    var69.field552 = var9;
                                    var69.field550 = var9.field2588;
                                    field828.method4554(var69);
                                }
                                var9.field2584 = field814;
                                if (var9.field2661 != null) {
                                    for (int var70 = 0; var70 < field850; var70++) {
                                        class63 var71 = new class63();
                                        var71.field552 = var9;
                                        var71.field557 = field852[var70];
                                        var71.field563 = field851[var70];
                                        var71.field550 = var9.field2661;
                                        field828.method4554(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2607) {
                            if (field802 != null || Statics.field1035 != null || field901) {
                                continue;
                            }
                            if ((var9.field2673 >= 0 || var9.field2579 != 0) && class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15) {
                                if (var9.field2673 >= 0) {
                                    Statics.field103 = arg0[var9.field2673];
                                } else {
                                    Statics.field103 = var9;
                                }
                            }
                            if (var9.field2554 == 8 && class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15) {
                                Statics.field91 = var9;
                            }
                            if (var9.field2586 > var9.field2693) {
                                method258(var9, var9.field2567 + var10, var11, var9.field2693, var9.field2586, class54.field466, class54.field477);
                            }
                        }
                        if (var9.field2554 == 0) {
                            method575(arg0, var9.field2669, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2574);
                            if (var9.field2682 != null) {
                                method575(var9.field2682, var9.field2669, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2574);
                            }
                            class62 var72 = (class62) field790.method5499((long) var9.field2669);
                            if (var72 != null) {
                                if (var72.field546 == 0 && class54.field466 >= var12 && class54.field477 >= var13 && class54.field466 < var14 && class54.field477 < var15 && !field901) {
                                    for (class63 var73 = (class63) field828.method4540(); var73 != null; var73 = (class63) field828.method4533()) {
                                        if (var73.field551) {
                                            var73.method3292();
                                            var73.field552.field2683 = false;
                                        }
                                    }
                                    if (Statics.field188 == 0) {
                                        field802 = null;
                                        field803 = null;
                                    }
                                    if (!field901) {
                                        method1577();
                                    }
                                }
                                method5261(var72.field548, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.jv(IB)Z")
    public static boolean method1044(int arg0) {
        for (int var1 = 0; var1 < field850; var1++) {
            if (field852[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bc.jf(IIB)V")
    public static final void method1025(int arg0, int arg1) {
        if (class218.method3537(arg0)) {
            method2066(Statics.field1950[arg0], arg1);
        }
    }

    @ObfuscatedName("cg.jr([Lha;II)V")
    public static final void method2066(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2554 == 0) {
                    if (var3.field2682 != null) {
                        method2066(var3.field2682, arg1);
                    }
                    class62 var4 = (class62) field790.method5499((long) var3.field2669);
                    if (var4 != null) {
                        method1025(var4.field548, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2665 != null) {
                    class63 var5 = new class63();
                    var5.field552 = var3;
                    var5.field550 = var3.field2665;
                    class77.method1570(var5);
                }
                if (arg1 == 1 && var3.field2666 != null) {
                    if (var3.field2553 >= 0) {
                        class218 var6 = Statics.method2628(var3.field2669);
                        if (var6 == null || var6.field2682 == null || var3.field2553 >= var6.field2682.length || var6.field2682[var3.field2553] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field552 = var3;
                    var7.field550 = var3.field2666;
                    class77.method1570(var7);
                }
            }
        }
    }

    @ObfuscatedName("o.jc(Lha;III)V")
    public static final void method117(class218 arg0, int arg1, int arg2) {
        if (field802 != null || field901 || arg0 == null) {
            return;
        }
        class218 var3 = method3744(arg0);
        if (var3 == null) {
            var3 = arg0.field2633;
        }
        if (var3 == null) {
            return;
        }
        field802 = arg0;
        class218 var5 = method3744(arg0);
        if (var5 == null) {
            var5 = arg0.field2633;
        }
        field803 = var5;
        field804 = arg1;
        field635 = arg2;
        Statics.field188 = 0;
        field638 = false;
        int var7 = method1147();
        if (var7 != -1) {
            method3088(var7);
        }
        return;
    }

    @ObfuscatedName("client.jq(I)V")
    public final void method1165() {
        method3272(field802);
        Statics.field188++;
        if (field810 && field807) {
            int var1 = class54.field466;
            int var2 = class54.field477;
            int var3 = var1 - field804;
            int var4 = var2 - field635;
            if (var3 < field808) {
                var3 = field808;
            }
            if (field802.field2567 + var3 > field808 + field803.field2567) {
                var3 = field808 + field803.field2567 - field802.field2567;
            }
            if (var4 < field809) {
                var4 = field809;
            }
            if (field802.field2693 + var4 > field809 + field803.field2693) {
                var4 = field809 + field803.field2693 - field802.field2693;
            }
            int var5 = var3 - field883;
            int var6 = var4 - field812;
            int var7 = field802.field2556;
            if (Statics.field188 > field802.field2635 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field638 = true;
            }
            int var8 = field803.field2573 + (var3 - field808);
            int var9 = field803.field2574 + (var4 - field809);
            if (field802.field2606 != null && field638) {
                class63 var10 = new class63();
                var10.field552 = field802;
                var10.field553 = var8;
                var10.field555 = var9;
                var10.field550 = field802.field2606;
                class77.method1570(var10);
            }
            if (class54.field465 == 0) {
                if (field638) {
                    if (field802.field2638 != null) {
                        class63 var11 = new class63();
                        var11.field552 = field802;
                        var11.field553 = var8;
                        var11.field555 = var9;
                        var11.field556 = field806;
                        var11.field550 = field802.field2638;
                        class77.method1570(var11);
                    }
                    if (field806 != null && method3744(field802) != null) {
                        class182 var12 = class182.method19(class178.field2210, field668.field1294);
                        var12.field2303.method5145(field806.field2664);
                        var12.field2303.method5146(field802.field2664);
                        var12.field2303.method5095(field802.field2553);
                        var12.field2303.method5313(field806.field2553);
                        var12.field2303.method5097(field802.field2669);
                        var12.field2303.method5097(field806.field2669);
                        field668.method2084(var12);
                    }
                } else if (this.method1161()) {
                    this.method1178(field883 + field804, field812 + field635);
                } else if (field667 > 0) {
                    int var13 = field883 + field804;
                    int var14 = field812 + field635;
                    method2044(Statics.field4035, var13, var14);
                    Statics.field4035 = null;
                }
                field802 = null;
            }
        } else if (Statics.field188 > 1) {
            field802 = null;
        }
    }

    @ObfuscatedName("ed.jg(IB)V")
    public static void method3088(int arg0) {
        Statics.field4035 = new class83();
        Statics.field4035.field1138 = field767[arg0];
        Statics.field4035.field1133 = field751[arg0];
        Statics.field4035.field1132 = field857[arg0];
        Statics.field4035.field1135 = field777[arg0];
        Statics.field4035.field1136 = field771[arg0];
    }

    @ObfuscatedName("fm.jj(Lha;B)V")
    public static void method3272(class218 arg0) {
        if (field833 == arg0.field2690) {
            field834[arg0.field2689] = true;
        }
    }

    @ObfuscatedName("jt.kt(B)V")
    public static void method4806() {
        for (class62 var0 = (class62) field790.method5501(); var0 != null; var0 = (class62) field790.method5500()) {
            int var1 = var0.field548;
            if (class218.method3537(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field1950[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2607;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2322;
                    class218 var6 = Statics.method2628(var5);
                    if (var6 != null) {
                        method3272(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.kd(IS)V")
    public static final void method924(int arg0) {
        if (!class218.method3537(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1950[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2680 = 0;
                var3.field2681 = 0;
            }
        }
    }

    @ObfuscatedName("bg.ke([Lha;II)V")
    public static final void method929(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2542 == arg1 && (!var3.field2607 || !method2020(var3))) {
                if (var3.field2554 == 0) {
                    if (!var3.field2607 && method2020(var3) && Statics.field103 != var3) {
                        continue;
                    }
                    method929(arg0, var3.field2669);
                    if (var3.field2682 != null) {
                        method929(var3.field2682, var3.field2669);
                    }
                    class62 var4 = (class62) field790.method5499((long) var3.field2669);
                    if (var4 != null) {
                        int var5 = var4.field548;
                        if (class218.method3537(var5)) {
                            method929(Statics.field1950[var5], -1);
                        }
                    }
                }
                if (var3.field2554 == 6) {
                    if (var3.field2596 != -1 || var3.field2600 != -1) {
                        boolean var6 = method155(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2600;
                        } else {
                            var7 = var3.field2596;
                        }
                        if (var7 != -1) {
                            class259 var8 = class259.method209(var7);
                            var3.field2681 += field691;
                            while (var3.field2681 > var8.field3485[var3.field2680]) {
                                var3.field2681 -= var8.field3485[var3.field2680];
                                var3.field2680++;
                                if (var3.field2680 >= var8.field3483.length) {
                                    var3.field2680 -= var8.field3490;
                                    if (var3.field2680 < 0 || var3.field2680 >= var8.field3483.length) {
                                        var3.field2680 = 0;
                                    }
                                }
                                method3272(var3);
                            }
                        }
                    }
                    if (var3.field2608 != 0 && !var3.field2607) {
                        int var9 = var3.field2608 >> 16;
                        int var10 = var3.field2608 << 16 >> 16;
                        int var11 = field691 * var9;
                        int var12 = field691 * var10;
                        var3.field2559 = var3.field2559 + var11 & 0x7FF;
                        var3.field2604 = var3.field2604 + var12 & 0x7FF;
                        method3272(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("kb.kr(II)V")
    public static final void method5415(int arg0) {
        method4806();
        class76.method1046();
        int var1 = class241.method3055(arg0).field3181;
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field2511[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class131.method2780(0.9D);
                ((class120) Statics.field1747).method2516(0.9D);
            }
            if (var2 == 2) {
                class131.method2780(0.8D);
                ((class120) Statics.field1747).method2516(0.8D);
            }
            if (var2 == 3) {
                class131.method2780(0.7D);
                ((class120) Statics.field1747).method2516(0.7D);
            }
            if (var2 == 4) {
                class131.method2780(0.6D);
                ((class120) Statics.field1747).method2516(0.6D);
            }
            class255.method3225();
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
            if (field650 != var3) {
                if (field650 == 0 && field726 != -1) {
                    class198.method3259(Statics.field26, field726, 0, var3, false);
                    field768 = false;
                } else if (var3 == 0) {
                    class198.method1587();
                    field768 = false;
                } else {
                    class198.method2540(var3);
                }
                field650 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field700 = 127;
            }
            if (var2 == 1) {
                field700 = 96;
            }
            if (var2 == 2) {
                field700 = 64;
            }
            if (var2 == 3) {
                field700 = 32;
            }
            if (var2 == 4) {
                field700 = 0;
            }
        }
        if (var1 == 5) {
            field781 = var2;
        }
        if (var1 == 6) {
            field793 = var2;
        }
        if (var1 == 9) {
            field902 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field636 = 127;
            }
            if (var2 == 1) {
                field636 = 96;
            }
            if (var2 == 2) {
                field636 = 64;
            }
            if (var2 == 3) {
                field636 = 32;
            }
            if (var2 == 4) {
                field636 = 0;
            }
        }
        if (var1 == 17) {
            field813 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field657 = (class85) class196.method2065(class85.method5427(), var2);
            if (field657 == null) {
                field657 = class85.field1151;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field756 = -1;
            } else {
                field756 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field658 = (class85) class196.method2065(class85.method5427(), var2);
            if (field658 == null) {
                field658 = class85.field1151;
            }
        }
    }

    @ObfuscatedName("dk.kf(Lha;B)V")
    public static final void method2289(class218 arg0) {
        int var1 = arg0.field2692;
        if (var1 == 324) {
            if (field894 == -1) {
                field894 = arg0.field2587;
                field895 = arg0.field2648;
            }
            if (field893.field2522) {
                arg0.field2587 = field894;
            } else {
                arg0.field2587 = field895;
            }
        } else if (var1 == 325) {
            if (field894 == -1) {
                field894 = arg0.field2587;
                field895 = arg0.field2648;
            }
            if (field893.field2522) {
                arg0.field2587 = field895;
            } else {
                arg0.field2587 = field894;
            }
        } else if (var1 == 327) {
            arg0.field2559 = 150;
            arg0.field2604 = (int) (Math.sin((double) field641 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2595 = 5;
            arg0.field2571 = 0;
        } else if (var1 == 328) {
            arg0.field2559 = 150;
            arg0.field2604 = (int) (Math.sin((double) field641 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2595 = 5;
            arg0.field2571 = 1;
        }
    }

    @ObfuscatedName("fc.kk(I)V")
    public static final void method3188() {
        class182 var0 = class182.method19(class178.field2232, field668.field1294);
        field668.method2084(var0);
        for (class62 var1 = (class62) field790.method5501(); var1 != null; var1 = (class62) field790.method5500()) {
            if (var1.field546 == 0 || var1.field546 == 3) {
                method3969(var1, true);
            }
        }
        if (field795 != null) {
            method3272(field795);
            field795 = null;
        }
    }

    @ObfuscatedName("bk.ki(IIII)Lbz;")
    public static final class62 method966(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field548 = arg1;
        var3.field546 = arg2;
        field790.method5502(var3, (long) arg0);
        method924(arg1);
        class218 var4 = Statics.method2628(arg0);
        method3272(var4);
        if (field795 != null) {
            method3272(field795);
            field795 = null;
        }
        method3733();
        Statics.method2023(Statics.field1950[arg0 >> 16], var4, false);
        class77.method1975(arg1);
        if (field789 != -1) {
            method1025(field789, 1);
        }
        return var3;
    }

    @ObfuscatedName("im.ko(Lbz;ZS)V")
    public static final void method3969(class62 arg0, boolean arg1) {
        int var2 = arg0.field548;
        int var3 = (int) arg0.field2322;
        arg0.method3292();
        if (arg1) {
            class218.method4328(var2);
        }
        for (class187 var4 = (class187) field831.method5501(); var4 != null; var4 = (class187) field831.method5500()) {
            if ((long) var2 == (var4.field2322 >> 48 & 0xFFFFL)) {
                var4.method3292();
            }
        }
        class218 var5 = Statics.method2628(var3);
        if (var5 != null) {
            method3272(var5);
        }
        method3733();
        if (field789 != -1) {
            method1025(field789, 1);
        }
    }

    @ObfuscatedName("o.kn(Lha;B)Z")
    public static final boolean method116(class218 arg0) {
        int var1 = arg0.field2692;
        if (var1 == 205) {
            field733 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field893.method3637(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field893.method3620(var4, var5 == 1);
        }
        if (var1 == 324) {
            field893.method3621(false);
        }
        if (var1 == 325) {
            field893.method3621(true);
        }
        if (var1 == 326) {
            class182 var6 = class182.method19(class178.field2233, field668.field1294);
            field893.method3622(var6.field2303);
            field668.method2084(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("en.ka(Lha;IIIB)V")
    public static final void method3022(class218 arg0, int arg1, int arg2, int arg3) {
        method352();
        class212 var4 = arg0.method3670(false);
        if (var4 == null) {
            return;
        }
        class321.method5541(arg1, arg2, var4.field2507 + arg1, var4.field2504 + arg2);
        if (field867 == 2 || field867 == 5) {
            class321.method5560(arg1, arg2, 0, var4.field2506, var4.field2505);
        } else {
            int var5 = field699 & 0x7FF;
            int var6 = Statics.field585.field937 / 32 + 48;
            int var7 = 464 - Statics.field585.field923 / 32;
            Statics.field2350.method5668(arg1, arg2, var4.field2507, var4.field2504, var6, var7, var5, 256, var4.field2506, var4.field2505);
            for (int var8 = 0; var8 < field855; var8++) {
                int var9 = field856[var8] * 4 + 2 - Statics.field585.field937 / 32;
                int var10 = field882[var8] * 4 + 2 - Statics.field585.field923 / 32;
                method115(arg1, arg2, var9, var10, field858[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field817[Statics.field1929][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field585.field937 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field585.field923 / 32;
                        method115(arg1, arg2, var14, var15, Statics.field229[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field672; var16++) {
                class80 var17 = field762[field905[var16]];
                if (var17 != null && var17.method1108()) {
                    class257 var18 = var17.field1106;
                    if (var18 != null && var18.field3459 != null) {
                        var18 = var18.method4343();
                    }
                    if (var18 != null && var18.field3450 && var18.field3444) {
                        int var19 = var17.field937 / 32 - Statics.field585.field937 / 32;
                        int var20 = var17.field923 / 32 - Statics.field585.field923 / 32;
                        method115(arg1, arg2, var19, var20, Statics.field229[1], var4);
                    }
                }
            }
            int var21 = class90.field1234;
            int[] var22 = class90.field1235;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field745[var22[var23]];
                if (var24 != null && var24.method1108() && !var24.field599 && Statics.field585 != var24) {
                    int var25 = var24.field937 / 32 - Statics.field585.field937 / 32;
                    int var26 = var24.field923 / 32 - Statics.field585.field923 / 32;
                    boolean var27 = false;
                    if (Statics.field585.field611 != 0 && var24.field611 != 0 && Statics.field585.field611 == var24.field611) {
                        var27 = true;
                    }
                    if (var24.method1094()) {
                        method115(arg1, arg2, var25, var26, Statics.field229[3], var4);
                    } else if (var27) {
                        method115(arg1, arg2, var25, var26, Statics.field229[4], var4);
                    } else if (var24.method1097()) {
                        method115(arg1, arg2, var25, var26, Statics.field229[5], var4);
                    } else {
                        method115(arg1, arg2, var25, var26, Statics.field229[2], var4);
                    }
                }
            }
            if (field637 != 0 && field641 % 20 < 10) {
                if (field637 == 1 && field822 >= 0 && field822 < field762.length) {
                    class80 var28 = field762[field822];
                    if (var28 != null) {
                        int var29 = var28.field937 / 32 - Statics.field585.field937 / 32;
                        int var30 = var28.field923 / 32 - Statics.field585.field923 / 32;
                        method3954(arg1, arg2, var29, var30, Statics.field2513[1], var4);
                    }
                }
                if (field637 == 2) {
                    int var31 = field652 * 4 - Statics.field2477 * 4 + 2 - Statics.field585.field937 / 32;
                    int var32 = field653 * 4 - Statics.field562 * 4 + 2 - Statics.field585.field923 / 32;
                    method3954(arg1, arg2, var31, var32, Statics.field2513[1], var4);
                }
                if (field637 == 10 && field651 >= 0 && field651 < field745.length) {
                    class67 var33 = field745[field651];
                    if (var33 != null) {
                        int var34 = var33.field937 / 32 - Statics.field585.field937 / 32;
                        int var35 = var33.field923 / 32 - Statics.field585.field923 / 32;
                        method3954(arg1, arg2, var34, var35, Statics.field2513[1], var4);
                    }
                }
            }
            if (field819 != 0) {
                int var36 = field819 * 4 + 2 - Statics.field585.field937 / 32;
                int var37 = field800 * 4 + 2 - Statics.field585.field923 / 32;
                method115(arg1, arg2, var36, var37, Statics.field2513[0], var4);
            }
            if (!Statics.field585.field599) {
                class321.method5589(var4.field2507 / 2 + arg1 - 1, var4.field2504 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field835[arg3] = true;
    }

    @ObfuscatedName("bi.km(Lha;IIII)V")
    public static final void method1736(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3670(false);
        if (var4 == null) {
            return;
        }
        if (field867 < 3) {
            Statics.field46.method5668(arg1, arg2, var4.field2507, var4.field2504, 25, 25, field699, 256, var4.field2506, var4.field2505);
        } else {
            class321.method5560(arg1, arg2, 0, var4.field2506, var4.field2505);
        }
    }

    @ObfuscatedName("ip.ks(IIIILls;Lhy;B)V")
    public static final void method3954(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method115(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field699 & 0x7FF;
        int var8 = class131.field1762[var7];
        int var9 = class131.field1737[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2507 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field339.method5669(arg5.field2507 / 2 + arg0 - var17 / 2 + var15, arg5.field2504 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("o.kl(IIIILls;Lhy;I)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field699 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1762[var6];
        int var9 = class131.field1737[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5753(arg5.field2507 / 2 + var10 - arg4.field3869 / 2, arg5.field2504 / 2 - var11 - arg4.field3864 / 2, arg0, arg1, arg5.field2507, arg5.field2504, arg5.field2506, arg5.field2505);
        } else {
            arg4.method5712(arg5.field2507 / 2 + arg0 + var10 - arg4.field3869 / 2, arg5.field2504 / 2 + arg1 - var11 - arg4.field3864 / 2);
        }
    }

    @ObfuscatedName("jg.kq(I)V")
    public static final void method4870() {
        for (int var0 = 0; var0 < class90.field1234; var0++) {
            class67 var1 = field745[class90.field1235[var0]];
            var1.method1095();
        }
        class92.method3655();
        if (Statics.field2499 != null) {
            Statics.field2499.method4847();
        }
    }

    @ObfuscatedName("bj.kh(B)V")
    public static final void method925() {
        Iterator var0 = class92.field1256.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1060();
        }
        if (Statics.field2499 != null) {
            Statics.field2499.method4852();
        }
    }

    @ObfuscatedName("dm.kj(B)V")
    public static final void method2739() {
        field712 = field814;
    }

    @ObfuscatedName("hh.kv(I)V")
    public static final void method3653() {
        field863 = field814;
        Statics.field1217 = true;
    }

    @ObfuscatedName("g.kp(Ljava/lang/String;B)V")
    public static final void method254(String arg0) {
        if (Statics.field2499 != null) {
            class182 var1 = class182.method19(class178.field2246, field668.field1294);
            var1.field2303.method5094(class300.method2738(arg0));
            var1.field2303.method5101(arg0);
            field668.method2084(var1);
        }
    }

    @ObfuscatedName("w.kw(I)V")
    public static final void method29() {
        class182 var0 = class182.method19(class178.field2260, field668.field1294);
        var0.field2303.method5094(0);
        field668.method2084(var0);
    }

    @ObfuscatedName("u.kb(Lha;I)I")
    public static int method210(class218 arg0) {
        class187 var1 = (class187) field831.method5499(((long) arg0.field2669 << 32) + (long) arg0.field2553);
        return var1 == null ? arg0.field2625 : var1.field2321;
    }

    @ObfuscatedName("hq.kg(Lha;I)Lha;")
    public static class218 method3744(class218 arg0) {
        int var1 = class219.method6060(method210(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = Statics.method2628(arg0.field2542);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ck.kx(Lha;I)Z")
    public static boolean method2020(class218 arg0) {
        return arg0.field2572;
    }

    @ObfuscatedName("by.ku(Lha;I)Ljava/lang/String;")
    public static String method1026(class218 arg0) {
        if (class219.method137(method210(arg0)) == 0) {
            return null;
        } else if (arg0.field2637 == null || arg0.field2637.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2637;
        }
    }

    @ObfuscatedName("ho.kz(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3748(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field631 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field631 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field631 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field631 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field631 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1944 != null) {
            var3 = "/p=" + Statics.field1944;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field2515 + "/a=" + Statics.field565 + var3 + "/";
    }

    @ObfuscatedName("it.kc(Ljava/lang/String;I)V")
    public static void method3994(String arg0) {
        Statics.field1944 = arg0;
        try {
            String var1 = Statics.field2488.getParameter(Integer.toString(18));
            String var2 = Statics.field2488.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class210.method723(class297.method481() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class47.method705(Statics.field2488, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("z.lp(Ljava/lang/String;ZB)V")
    public static void method216(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3372; var5++) {
            class255 var6 = Statics.method3278(var5);
            if ((!arg1 || var6.field3418) && var6.field3410 == -1 && var6.field3378.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field385 = -1;
                    Statics.field3543 = null;
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
        Statics.field3543 = var3;
        Statics.field2331 = 0;
        Statics.field385 = var4;
        String[] var9 = new String[Statics.field385];
        for (int var10 = 0; var10 < Statics.field385; var10++) {
            var9[var10] = Statics.method3278(var3[var10]).field3378;
        }
        short[] var11 = Statics.field3543;
        class189.method4139(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ap.lf(Lkq;II)V")
    public static void method718(class300 arg0, int arg1) {
        byte[] var2 = arg0.field3704;
        if (field670 == null) {
            field670 = new byte[24];
        }
        class301.method5343(var2, arg1, field670, 0, 24);
        class168.method3147(arg0, arg1);
    }

    @ObfuscatedName("client.lv(I)Ljc;")
    public class283 method1166() {
        return Statics.field585 == null ? null : Statics.field585.field605;
    }

    @ObfuscatedName("kk.lc(IB)V")
    public static void method4948(int arg0) {
        field704 = arg0;
    }

    @ObfuscatedName("gf.la(S)V")
    public static void method3316() {
        field668.method2084(class182.method19(class178.field2227, field668.field1294));
        field704 = 0;
    }

    @ObfuscatedName("aj.le(I)V")
    public static void method694() {
        if (field704 == 1) {
            field752 = true;
        }
    }

    @ObfuscatedName("ar.lh(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method564(String arg0) {
        class229[] var1 = class229.method3544();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3074 != -1 && arg0.startsWith(class82.method2079(var3.field3074))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3074).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bp.lo(I)V")
    public static void method1859() {
        if (Statics.field2535 == null) {
            return;
        }
        field750 = field641;
        Statics.field2535.method3922();
        for (int var0 = 0; var0 < field745.length; var0++) {
            if (field745[var0] != null) {
                Statics.field2535.method3921((field745[var0].field937 >> 7) + Statics.field2477, (field745[var0].field923 >> 7) + Statics.field562);
            }
        }
    }
}

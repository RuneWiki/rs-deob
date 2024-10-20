package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class54 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field812 = new class173[4];

    @ObfuscatedName("client.as")
    public static boolean field792 = true;

    @ObfuscatedName("client.ba")
    public static int field701 = 1;

    @ObfuscatedName("client.bg")
    public static int field768 = 0;

    @ObfuscatedName("client.bd")
    public static int field635 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field636 = false;

    @ObfuscatedName("client.bu")
    public static boolean field637 = false;

    @ObfuscatedName("client.bt")
    public static int field709 = -1;

    @ObfuscatedName("client.bs")
    public static boolean field639 = false;

    @ObfuscatedName("client.bj")
    public static int field640 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field773 = true;

    @ObfuscatedName("client.ci")
    public static int field643 = 0;

    @ObfuscatedName("client.cy")
    public static long field644 = -1L;

    @ObfuscatedName("client.co")
    public static int field645 = -1;

    @ObfuscatedName("client.cu")
    public static int field906 = -1;

    @ObfuscatedName("client.cz")
    public static long field647 = -1L;

    @ObfuscatedName("client.cq")
    public static boolean field648 = true;

    @ObfuscatedName("client.cj")
    public static boolean field649 = false;

    @ObfuscatedName("client.cm")
    public static int field726 = 0;

    @ObfuscatedName("client.cb")
    public static int field651 = 0;

    @ObfuscatedName("client.cp")
    public static int field832 = 0;

    @ObfuscatedName("client.cs")
    public static int field729 = 0;

    @ObfuscatedName("client.ck")
    public static int field715 = 0;

    @ObfuscatedName("client.ct")
    public static int field655 = 0;

    @ObfuscatedName("client.cc")
    public static int field801 = 0;

    @ObfuscatedName("client.ch")
    public static int field657 = 0;

    @ObfuscatedName("client.cg")
    public static int field658 = 0;

    @ObfuscatedName("client.ca")
    public static class85 field659 = class85.field1151;

    @ObfuscatedName("client.db")
    public static class85 field839 = class85.field1151;

    @ObfuscatedName("client.dd")
    public static int field781 = 0;

    @ObfuscatedName("client.di")
    public static int field663 = 0;

    @ObfuscatedName("client.dn")
    public static int field820 = 0;

    @ObfuscatedName("client.ee")
    public static int field654 = 0;

    @ObfuscatedName("client.ef")
    public static int field879 = 0;

    @ObfuscatedName("client.ep")
    public static int field667 = 0;

    @ObfuscatedName("client.et")
    public static int field668 = 0;

    @ObfuscatedName("client.eq")
    public static int field669 = 0;

    @ObfuscatedName("client.em")
    public static class161 field851 = class161.field1983;

    @ObfuscatedName("client.es")
    public static boolean field671 = false;

    @ObfuscatedName("client.en")
    public static class89 field672 = new class89();

    @ObfuscatedName("client.ea")
    public static byte[] field673 = null;

    @ObfuscatedName("client.ej")
    public static class80[] field674 = new class80[32768];

    @ObfuscatedName("client.el")
    public static int field665 = 0;

    @ObfuscatedName("client.ft")
    public static int[] field690 = new int[32768];

    @ObfuscatedName("client.fe")
    public static int field677 = 0;

    @ObfuscatedName("client.fs")
    public static int[] field678 = new int[250];

    @ObfuscatedName("client.fu")
    public static final class96 field679 = new class96();

    @ObfuscatedName("client.fn")
    public static int field634 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field681 = false;

    @ObfuscatedName("client.fw")
    public static boolean field682 = true;

    @ObfuscatedName("client.ff")
    public static class272 field683 = new class272();

    @ObfuscatedName("client.fm")
    public static HashMap field842 = new HashMap();

    @ObfuscatedName("client.fb")
    public static int field685 = 0;

    @ObfuscatedName("client.fd")
    public static int field686 = 1;

    @ObfuscatedName("client.fo")
    public static int field687 = 0;

    @ObfuscatedName("client.ga")
    public static int field688 = 1;

    @ObfuscatedName("client.gx")
    public static int field689 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field741 = false;

    @ObfuscatedName("client.gm")
    public static int[][][] field692 = new int[4][13][13];

    @ObfuscatedName("client.gj")
    public static final int[] field693 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gp")
    public static int field694 = 0;

    @ObfuscatedName("client.hg")
    public static int field896 = 2301979;

    @ObfuscatedName("client.hx")
    public static int field662 = 5063219;

    @ObfuscatedName("client.hw")
    public static int field684 = 3353893;

    @ObfuscatedName("client.hn")
    public static int field791 = 7759444;

    @ObfuscatedName("client.hj")
    public static boolean field699 = false;

    @ObfuscatedName("client.hf")
    public static int field807 = 0;

    @ObfuscatedName("client.hd")
    public static int field704 = 128;

    @ObfuscatedName("client.hz")
    public static int field702 = 0;

    @ObfuscatedName("client.hu")
    public static int field852 = 0;

    @ObfuscatedName("client.hm")
    public static int field661 = 0;

    @ObfuscatedName("client.ht")
    public static int field705 = 0;

    @ObfuscatedName("client.hc")
    public static int field695 = 0;

    @ObfuscatedName("client.hl")
    public static int field707 = 0;

    @ObfuscatedName("client.hy")
    public static int field708 = 50;

    @ObfuscatedName("client.ho")
    public static int field877 = 0;

    @ObfuscatedName("client.hq")
    public static int field710 = 0;

    @ObfuscatedName("client.ig")
    public static int field711 = 0;

    @ObfuscatedName("client.ip")
    public static int field712 = 12;

    @ObfuscatedName("client.if")
    public static int field713 = 6;

    @ObfuscatedName("client.ik")
    public static int field800 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field646 = false;

    @ObfuscatedName("client.iu")
    public static int field716 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field734 = false;

    @ObfuscatedName("client.im")
    public static int field718 = 0;

    @ObfuscatedName("client.ir")
    public static int field719 = 0;

    @ObfuscatedName("client.io")
    public static int field720 = 50;

    @ObfuscatedName("client.il")
    public static int[] field721 = new int[field720];

    @ObfuscatedName("client.ic")
    public static int[] field656 = new int[field720];

    @ObfuscatedName("client.ib")
    public static int[] field723 = new int[field720];

    @ObfuscatedName("client.iy")
    public static int[] field675 = new int[field720];

    @ObfuscatedName("client.id")
    public static int[] field725 = new int[field720];

    @ObfuscatedName("client.ih")
    public static int[] field895 = new int[field720];

    @ObfuscatedName("client.ii")
    public static int[] field700 = new int[field720];

    @ObfuscatedName("client.iw")
    public static String[] field728 = new String[field720];

    @ObfuscatedName("client.in")
    public static int[][] field778 = new int[104][104];

    @ObfuscatedName("client.it")
    public static String field786 = null;

    @ObfuscatedName("client.is")
    public static int field717 = 0;

    @ObfuscatedName("client.iv")
    public static int field731 = -1;

    @ObfuscatedName("client.ia")
    public static int field732 = -1;

    @ObfuscatedName("client.jm")
    public static int field733 = 0;

    @ObfuscatedName("client.jb")
    public static int field714 = 0;

    @ObfuscatedName("client.ja")
    public static int field735 = 0;

    @ObfuscatedName("client.jd")
    public static int field736 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field650 = true;

    @ObfuscatedName("client.jy")
    public static int field754 = 0;

    @ObfuscatedName("client.jl")
    public static int field666 = 0;

    @ObfuscatedName("client.jw")
    public static int field740 = 0;

    @ObfuscatedName("client.jt")
    public static int field730 = 0;

    @ObfuscatedName("client.jn")
    public static int field742 = 0;

    @ObfuscatedName("client.jg")
    public static int field743 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field744 = false;

    @ObfuscatedName("client.je")
    public static int field745 = 0;

    @ObfuscatedName("client.jc")
    public static int field746 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field747 = true;

    @ObfuscatedName("client.js")
    public static class67[] field748 = new class67[2048];

    @ObfuscatedName("client.ju")
    public static int field738 = -1;

    @ObfuscatedName("client.jf")
    public static int field750 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field751 = true;

    @ObfuscatedName("client.kw")
    public static int field698 = 0;

    @ObfuscatedName("client.kq")
    public static int field753 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field871 = new int[1000];

    @ObfuscatedName("client.ks")
    public static final int[] field813 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kx")
    public static String[] field739 = new String[8];

    @ObfuscatedName("client.ka")
    public static boolean[] field816 = new boolean[8];

    @ObfuscatedName("client.kj")
    public static int[] field758 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kf")
    public static int field759 = -1;

    @ObfuscatedName("client.kc")
    public static class262[][][] field760 = new class262[4][104][104];

    @ObfuscatedName("client.ki")
    public static class262 field761 = new class262();

    @ObfuscatedName("client.kz")
    public static class262 field762 = new class262();

    @ObfuscatedName("client.ky")
    public static class262 field763 = new class262();

    @ObfuscatedName("client.kd")
    public static int[] field764 = new int[25];

    @ObfuscatedName("client.ku")
    public static int[] field765 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field766 = new int[25];

    @ObfuscatedName("client.kn")
    public static int field767 = 0;

    @ObfuscatedName("client.ke")
    public static boolean field884 = false;

    @ObfuscatedName("client.la")
    public static int field769 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field770 = new int[500];

    @ObfuscatedName("client.lr")
    public static int[] field771 = new int[500];

    @ObfuscatedName("client.ll")
    public static int[] field772 = new int[500];

    @ObfuscatedName("client.lh")
    public static int[] field837 = new int[500];

    @ObfuscatedName("client.ls")
    public static String[] field774 = new String[500];

    @ObfuscatedName("client.li")
    public static String[] field775 = new String[500];

    @ObfuscatedName("client.lv")
    public static boolean[] field776 = new boolean[500];

    @ObfuscatedName("client.lu")
    public static boolean field777 = false;

    @ObfuscatedName("client.lw")
    public static boolean field652 = false;

    @ObfuscatedName("client.lx")
    public static boolean field779 = false;

    @ObfuscatedName("client.ld")
    public static boolean field780 = true;

    @ObfuscatedName("client.lz")
    public static int field724 = -1;

    @ObfuscatedName("client.lm")
    public static int field782 = -1;

    @ObfuscatedName("client.lp")
    public static int field783 = 0;

    @ObfuscatedName("client.lo")
    public static int field784 = 50;

    @ObfuscatedName("client.lj")
    public static int field785 = 0;

    @ObfuscatedName("client.lg")
    public static boolean field787 = false;

    @ObfuscatedName("client.ln")
    public static int field788 = -1;

    @ObfuscatedName("client.mg")
    public static int field789 = -1;

    @ObfuscatedName("client.mf")
    public static String field790 = null;

    @ObfuscatedName("client.mz")
    public static String field902 = null;

    @ObfuscatedName("client.mh")
    public static int field697 = -1;

    @ObfuscatedName("client.mo")
    public static class318 field793 = new class318(8);

    @ObfuscatedName("client.md")
    public static int field829 = 0;

    @ObfuscatedName("client.mc")
    public static int field795 = -1;

    @ObfuscatedName("client.mj")
    public static int field641 = 0;

    @ObfuscatedName("client.my")
    public static int field908 = 0;

    @ObfuscatedName("client.mu")
    public static class218 field798 = null;

    @ObfuscatedName("client.mr")
    public static int field633 = 0;

    @ObfuscatedName("client.mk")
    public static int field824 = 0;

    @ObfuscatedName("client.mn")
    public static int field755 = 0;

    @ObfuscatedName("client.mq")
    public static int field802 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field803 = false;

    @ObfuscatedName("client.ml")
    public static class218 field804 = null;

    @ObfuscatedName("client.ma")
    public static class218 field805 = null;

    @ObfuscatedName("client.ms")
    public static class218 field806 = null;

    @ObfuscatedName("client.mp")
    public static int field703 = 0;

    @ObfuscatedName("client.me")
    public static int field808 = 0;

    @ObfuscatedName("client.mv")
    public static class218 field809 = null;

    @ObfuscatedName("client.nk")
    public static boolean field810 = false;

    @ObfuscatedName("client.np")
    public static int field749 = -1;

    @ObfuscatedName("client.nn")
    public static int field752 = -1;

    @ObfuscatedName("client.nw")
    public static boolean field696 = false;

    @ObfuscatedName("client.nc")
    public static int field847 = -1;

    @ObfuscatedName("client.nb")
    public static int field815 = -1;

    @ObfuscatedName("client.nr")
    public static boolean field876 = false;

    @ObfuscatedName("client.nf")
    public static int field757 = 1;

    @ObfuscatedName("client.nx")
    public static int[] field818 = new int[32];

    @ObfuscatedName("client.ni")
    public static int field680 = 0;

    @ObfuscatedName("client.no")
    public static int[] field817 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field821 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field822 = new int[32];

    @ObfuscatedName("client.ny")
    public static int field823 = 0;

    @ObfuscatedName("client.nj")
    public static int field888 = 0;

    @ObfuscatedName("client.nz")
    public static int field825 = 0;

    @ObfuscatedName("client.nh")
    public static int field826 = 0;

    @ObfuscatedName("client.nd")
    public static int field827 = 0;

    @ObfuscatedName("client.ng")
    public static int field653 = 0;

    @ObfuscatedName("client.nm")
    public static int field835 = 0;

    @ObfuscatedName("client.ol")
    public static int field756 = 0;

    @ObfuscatedName("client.oj")
    public static class262 field831 = new class262();

    @ObfuscatedName("client.oc")
    public static class262 field814 = new class262();

    @ObfuscatedName("client.od")
    public static class262 field833 = new class262();

    @ObfuscatedName("client.op")
    public static class318 field670 = new class318(512);

    @ObfuscatedName("client.or")
    public static int field811 = 0;

    @ObfuscatedName("client.oq")
    public static int field836 = -2;

    @ObfuscatedName("client.ot")
    public static boolean[] field843 = new boolean[100];

    @ObfuscatedName("client.oh")
    public static boolean[] field838 = new boolean[100];

    @ObfuscatedName("client.ov")
    public static boolean[] field632 = new boolean[100];

    @ObfuscatedName("client.ox")
    public static int[] field840 = new int[100];

    @ObfuscatedName("client.og")
    public static int[] field841 = new int[100];

    @ObfuscatedName("client.ob")
    public static int[] field828 = new int[100];

    @ObfuscatedName("client.os")
    public static int[] field727 = new int[100];

    @ObfuscatedName("client.oi")
    public static int field844 = 0;

    @ObfuscatedName("client.oe")
    public static long field737 = 0L;

    @ObfuscatedName("client.oz")
    public static boolean field846 = true;

    @ObfuscatedName("client.pv")
    public static int[] field830 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pz")
    public static int field848 = 0;

    @ObfuscatedName("client.pn")
    public static int field849 = 0;

    @ObfuscatedName("client.pf")
    public static String field850 = "";

    @ObfuscatedName("client.pi")
    public static long[] field853 = new long[100];

    @ObfuscatedName("client.pq")
    public static int field722 = 0;

    @ObfuscatedName("client.px")
    public static int field867 = 0;

    @ObfuscatedName("client.py")
    public static int[] field854 = new int[128];

    @ObfuscatedName("client.pp")
    public static int[] field855 = new int[128];

    @ObfuscatedName("client.ps")
    public static long field664 = -1L;

    @ObfuscatedName("client.pl")
    public static int field857 = -1;

    @ObfuscatedName("client.pb")
    public static int field858 = 0;

    @ObfuscatedName("client.pa")
    public static int[] field859 = new int[1000];

    @ObfuscatedName("client.pj")
    public static int[] field860 = new int[1000];

    @ObfuscatedName("client.pt")
    public static class325[] field861 = new class325[1000];

    @ObfuscatedName("client.pg")
    public static int field862 = 0;

    @ObfuscatedName("client.pd")
    public static int field863 = 0;

    @ObfuscatedName("client.qx")
    public static int field864 = 0;

    @ObfuscatedName("client.qf")
    public static int field865 = 255;

    @ObfuscatedName("client.qv")
    public static int field866 = -1;

    @ObfuscatedName("client.qp")
    public static boolean field856 = false;

    @ObfuscatedName("client.qt")
    public static int field868 = 127;

    @ObfuscatedName("client.qk")
    public static int field869 = 127;

    @ObfuscatedName("client.qm")
    public static int field794 = 0;

    @ObfuscatedName("client.qd")
    public static int[] field890 = new int[50];

    @ObfuscatedName("client.qb")
    public static int[] field872 = new int[50];

    @ObfuscatedName("client.qr")
    public static int[] field873 = new int[50];

    @ObfuscatedName("client.qq")
    public static int[] field874 = new int[50];

    @ObfuscatedName("client.qy")
    public static class102[] field875 = new class102[50];

    @ObfuscatedName("client.qw")
    public static boolean field834 = false;

    @ObfuscatedName("client.ru")
    public static boolean[] field642 = new boolean[5];

    @ObfuscatedName("client.rz")
    public static int[] field878 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field796 = new int[5];

    @ObfuscatedName("client.rn")
    public static int[] field880 = new int[5];

    @ObfuscatedName("client.ri")
    public static int[] field881 = new int[5];

    @ObfuscatedName("client.rt")
    public static short field882 = 256;

    @ObfuscatedName("client.ra")
    public static short field883 = 205;

    @ObfuscatedName("client.rp")
    public static short field799 = 256;

    @ObfuscatedName("client.rk")
    public static short field885 = 320;

    @ObfuscatedName("client.rj")
    public static short field886 = 1;

    @ObfuscatedName("client.rx")
    public static short field887 = 32767;

    @ObfuscatedName("client.rc")
    public static short field845 = 1;

    @ObfuscatedName("client.re")
    public static short field889 = 32767;

    @ObfuscatedName("client.rs")
    public static int field706 = 0;

    @ObfuscatedName("client.rm")
    public static int field638 = 0;

    @ObfuscatedName("client.rr")
    public static int field892 = 0;

    @ObfuscatedName("client.rf")
    public static int field893 = 0;

    @ObfuscatedName("client.rh")
    public static int field894 = 0;

    @ObfuscatedName("client.rg")
    public static class215 field797 = new class215();

    @ObfuscatedName("client.sm")
    public static int field819 = -1;

    @ObfuscatedName("client.sl")
    public static int field897 = -1;

    @ObfuscatedName("client.sq")
    public static class330 field898 = new class329();

    @ObfuscatedName("client.sr")
    public static class10[] field899 = new class10[8];

    @ObfuscatedName("client.sn")
    public static class68 field900 = new class68();

    @ObfuscatedName("client.sk")
    public static int field901 = -1;

    @ObfuscatedName("client.sv")
    public static ArrayList field691 = new ArrayList(10);

    @ObfuscatedName("client.sa")
    public static int field903 = 0;

    @ObfuscatedName("client.sw")
    public static int field904 = 0;

    @ObfuscatedName("client.tg")
    public static final class66 field905 = new class66();

    @ObfuscatedName("client.th")
    public static int[] field891 = new int[50];

    @ObfuscatedName("client.ta")
    public static int[] field907 = new int[50];

    @ObfuscatedName("ec.fe(I)Llo;")
    public static class333 method3177() {
        return Statics.field1181;
    }

    @ObfuscatedName("client.at(B)V")
    public final void method854() {
    }

    public final void init() {
        if (!this.method858()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field682 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1130)) {
                            field636 = true;
                        } else {
                            field636 = false;
                        }
                        break;
                    case 4:
                        if (field709 == -1) {
                            field709 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field768 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var9 = Integer.parseInt(var2);
                        class191 var10;
                        if (var9 >= 0 && var9 < class191.field2330.length) {
                            var10 = class191.field2330[var9];
                        } else {
                            var10 = null;
                        }
                        Statics.field281 = var10;
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class230[] var4 = new class230[] { class230.field3086, class230.field3085, class230.field3087, class230.field3088 };
                        class230[] var5 = var4;
                        int var6 = 0;
                        class230 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class230 var7 = var5[var6];
                            if (var7.field3089 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field266 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1130)) {
                        }
                        break;
                    case 9:
                        Statics.field1995 = var2;
                        break;
                    case 10:
                        Statics.field459 = (class231) class196.method292(class231.method1086(), Integer.parseInt(var2));
                        if (Statics.field459 == class231.field3097) {
                            Statics.field536 = class338.field4025;
                        } else {
                            Statics.field536 = class338.field4033;
                        }
                        break;
                    case 12:
                        field701 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field4042 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field635 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field4017 = var2;
                }
            }
        }
        method167();
        Statics.field328 = this.getCodeBase().getHost();
        String var11 = Statics.field266.field3090;
        byte var12 = 0;
        try {
            class168.method3449("oldschool", var11, var12, 21);
        } catch (Exception var14) {
            class341.method4728((String) null, var14);
        }
        Statics.field257 = this;
        Statics.field1217 = field709;
        this.method832(765, 503, 185);
    }

    @ObfuscatedName("k.fi(B)V")
    public static final void method167() {
        class134.field1783 = false;
        field637 = false;
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method844() {
        class302.method3687(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2738 = field635 == 0 ? 43594 : field701 + 40000;
        Statics.field1435 = field635 == 0 ? 443 : field701 + 50000;
        Statics.field71 = Statics.field2738;
        Statics.field2520 = class216.field2525;
        Statics.field2521 = class216.field2528;
        Statics.field3882 = class216.field2527;
        Statics.field2360 = class216.field2526;
        Statics.field2731 = new class144();
        this.method826();
        this.method827();
        Statics.field392 = this.method823();
        Statics.field136 = new class308(255, class168.field2027, class168.field2029, 500000);
        Statics.field562 = class74.method2904();
        this.method824();
        class52.method4031(this, Statics.field2466);
        if (field635 != 0) {
            field649 = true;
        }
        method4962(Statics.field562.field1035);
        Statics.field1296 = new class75(Statics.field536);
    }

    @ObfuscatedName("client.ae(B)V")
    public final void method845() {
        field643++;
        this.method1223();
        while (true) {
            class262 var1 = class235.field3136;
            class232 var2;
            synchronized (class235.field3136) {
                var2 = (class232) class235.field3137.method4579();
            }
            if (var2 == null) {
                try {
                    if (class198.field2378 == 1) {
                        int var4 = Statics.field2375.method3474();
                        if (var4 > 0 && Statics.field2375.method3479()) {
                            int var5 = var4 - Statics.field2385;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2375.method3552(var5);
                        } else {
                            Statics.field2375.method3478();
                            Statics.field2375.method3535();
                            if (Statics.field3280 == null) {
                                class198.field2378 = 0;
                            } else {
                                class198.field2378 = 2;
                            }
                            Statics.field2381 = null;
                            Statics.field3700 = null;
                        }
                    }
                } catch (Exception var267) {
                    var267.printStackTrace();
                    Statics.field2375.method3478();
                    class198.field2378 = 0;
                    Statics.field2381 = null;
                    Statics.field3700 = null;
                    Statics.field3280 = null;
                }
                method2168();
                class46 var7 = class46.field391;
                synchronized (class46.field391) {
                    class46.field389++;
                    class46.field386 = class46.field371;
                    class46.field385 = 0;
                    if (class46.field381 >= 0) {
                        while (class46.field381 != class46.field380) {
                            int var9 = class46.field379[class46.field380];
                            class46.field380 = class46.field380 + 1 & 0x7F;
                            if (var9 < 0) {
                                class46.field387[~var9] = false;
                            } else {
                                if (!class46.field387[var9] && class46.field385 < class46.field384.length - 1) {
                                    class46.field384[++class46.field385 - 1] = var9;
                                }
                                class46.field387[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class46.field387[var8] = false;
                        }
                        class46.field381 = class46.field380;
                    }
                    if (class46.field385 > 0) {
                        class46.field389 = 0;
                    }
                    class46.field371 = class46.field388;
                }
                class55 var11 = class55.field472;
                synchronized (class55.field472) {
                    class55.field475 = class55.field461;
                    class55.field466 = class55.field462;
                    class55.field467 = class55.field463;
                    class55.field456 = class55.field468;
                    class55.field473 = class55.field474;
                    class55.field464 = class55.field465;
                    class55.field469 = class55.field471;
                    class55.field476 = class55.field470;
                    class55.field474 = 0;
                }
                if (Statics.field392 != null) {
                    int var13 = Statics.field392.method713();
                    field756 = var13;
                }
                if (field640 == 0) {
                    method4030();
                    class54.method1950();
                } else if (field640 == 5) {
                    class86.method3433(this);
                    method4030();
                    class54.method1950();
                } else if (field640 == 10 || field640 == 11) {
                    class86.method3433(this);
                } else if (field640 == 20) {
                    class86.method3433(this);
                    this.method1226();
                } else if (field640 == 25) {
                    method140(false);
                    field685 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field1929.length; var15++) {
                        if (Statics.field4038[var15] != -1 && Statics.field1929[var15] == null) {
                            Statics.field1929[var15] = Statics.field165.method3873(Statics.field4038[var15], 0);
                            if (Statics.field1929[var15] == null) {
                                var14 = false;
                                field685++;
                            }
                        }
                        if (Statics.field300[var15] != -1 && Statics.field1973[var15] == null) {
                            Statics.field1973[var15] = Statics.field165.method3874(Statics.field300[var15], 0, Statics.field2280[var15]);
                            if (Statics.field1973[var15] == null) {
                                var14 = false;
                                field685++;
                            }
                        }
                    }
                    if (var14) {
                        field687 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field1929.length; var17++) {
                            byte[] var18 = Statics.field1973[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field628[var17] >> 8) * 64 - Statics.field1961;
                                int var20 = (Statics.field628[var17] & 0xFF) * 64 - Statics.field1108;
                                if (field741) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                boolean var22 = true;
                                class300 var23 = new class300(var18);
                                int var24 = -1;
                                label1202: while (true) {
                                    int var25 = var23.method5137();
                                    if (var25 == 0) {
                                        var16 &= var22;
                                        break;
                                    }
                                    var24 += var25;
                                    int var26 = 0;
                                    boolean var27 = false;
                                    while (true) {
                                        while (!var27) {
                                            int var29 = var23.method5309();
                                            if (var29 == 0) {
                                                continue label1202;
                                            }
                                            var26 += var29 - 1;
                                            int var30 = var26 & 0x3F;
                                            int var31 = var26 >> 6 & 0x3F;
                                            int var32 = var23.method5123() >> 2;
                                            int var33 = var19 + var31;
                                            int var34 = var20 + var30;
                                            if (var33 > 0 && var34 > 0 && var33 < 103 && var34 < 103) {
                                                class254 var35 = class254.method3848(var24);
                                                if (var32 != 22 || !field637 || var35.field3357 != 0 || var35.field3377 == 1 || var35.field3376) {
                                                    if (!var35.method4297()) {
                                                        field687++;
                                                        var22 = false;
                                                    }
                                                    var27 = true;
                                                }
                                            }
                                        }
                                        int var28 = var23.method5309();
                                        if (var28 == 0) {
                                            break;
                                        }
                                        var23.method5123();
                                    }
                                }
                            }
                        }
                        if (var16) {
                            if (field689 != 0) {
                                method79(class225.field2754 + class82.field1133 + class82.field1137 + 100 + "%" + class82.field1131, true);
                            }
                            method2168();
                            Statics.field207.method2906();
                            for (int var37 = 0; var37 < 4; var37++) {
                                field812[var37].method3357();
                            }
                            for (int var38 = 0; var38 < 4; var38++) {
                                for (int var39 = 0; var39 < 104; var39++) {
                                    for (int var40 = 0; var40 < 104; var40++) {
                                        class56.field488[var38][var39][var40] = 0;
                                    }
                                }
                            }
                            method2168();
                            class56.method3646();
                            int var41 = Statics.field1929.length;
                            class76.method967();
                            method140(true);
                            if (!field741) {
                                for (int var42 = 0; var42 < var41; var42++) {
                                    int var43 = (Statics.field628[var42] >> 8) * 64 - Statics.field1961;
                                    int var44 = (Statics.field628[var42] & 0xFF) * 64 - Statics.field1108;
                                    byte[] var45 = Statics.field1929[var42];
                                    if (var45 != null) {
                                        method2168();
                                        class56.method2903(var45, var43, var44, Statics.field141 * 8 - 48, Statics.field564 * 8 - 48, field812);
                                    }
                                }
                                for (int var46 = 0; var46 < var41; var46++) {
                                    int var47 = (Statics.field628[var46] >> 8) * 64 - Statics.field1961;
                                    int var48 = (Statics.field628[var46] & 0xFF) * 64 - Statics.field1108;
                                    byte[] var49 = Statics.field1929[var46];
                                    if (var49 == null && Statics.field564 < 800) {
                                        method2168();
                                        class56.method530(var47, var48, 64, 64);
                                    }
                                }
                                method140(true);
                                for (int var50 = 0; var50 < var41; var50++) {
                                    byte[] var51 = Statics.field1973[var50];
                                    if (var51 != null) {
                                        int var52 = (Statics.field628[var50] >> 8) * 64 - Statics.field1961;
                                        int var53 = (Statics.field628[var50] & 0xFF) * 64 - Statics.field1108;
                                        method2168();
                                        class134 var54 = Statics.field207;
                                        class173[] var55 = field812;
                                        class300 var56 = new class300(var51);
                                        int var57 = -1;
                                        while (true) {
                                            int var58 = var56.method5137();
                                            if (var58 == 0) {
                                                break;
                                            }
                                            var57 += var58;
                                            int var59 = 0;
                                            while (true) {
                                                int var60 = var56.method5309();
                                                if (var60 == 0) {
                                                    break;
                                                }
                                                var59 += var60 - 1;
                                                int var61 = var59 & 0x3F;
                                                int var62 = var59 >> 6 & 0x3F;
                                                int var63 = var59 >> 12;
                                                int var64 = var56.method5123();
                                                int var65 = var64 >> 2;
                                                int var66 = var64 & 0x3;
                                                int var67 = var52 + var62;
                                                int var68 = var53 + var61;
                                                if (var67 > 0 && var68 > 0 && var67 < 103 && var68 < 103) {
                                                    int var69 = var63;
                                                    if ((class56.field488[1][var67][var68] & 0x2) == 2) {
                                                        var69 = var63 - 1;
                                                    }
                                                    class173 var70 = null;
                                                    if (var69 >= 0) {
                                                        var70 = var55[var69];
                                                    }
                                                    class56.method4192(var63, var67, var68, var57, var66, var65, var54, var70);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field741) {
                                int var71 = 0;
                                label1107: while (true) {
                                    if (var71 >= 4) {
                                        for (int var111 = 0; var111 < 13; var111++) {
                                            for (int var112 = 0; var112 < 13; var112++) {
                                                int var113 = field692[0][var111][var112];
                                                if (var113 == -1) {
                                                    class56.method530(var111 * 8, var112 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method140(true);
                                        int var114 = 0;
                                        while (true) {
                                            if (var114 >= 4) {
                                                break label1107;
                                            }
                                            method2168();
                                            for (int var115 = 0; var115 < 13; var115++) {
                                                for (int var116 = 0; var116 < 13; var116++) {
                                                    int var117 = field692[var114][var115][var116];
                                                    if (var117 != -1) {
                                                        int var118 = var117 >> 24 & 0x3;
                                                        int var119 = var117 >> 1 & 0x3;
                                                        int var120 = var117 >> 14 & 0x3FF;
                                                        int var121 = var117 >> 3 & 0x7FF;
                                                        int var122 = (var120 / 8 << 8) + var121 / 8;
                                                        for (int var123 = 0; var123 < Statics.field628.length; var123++) {
                                                            if (Statics.field628[var123] == var122 && Statics.field1973[var123] != null) {
                                                                class56.method3846(Statics.field1973[var123], var114, var115 * 8, var116 * 8, var118, (var120 & 0x7) * 8, (var121 & 0x7) * 8, var119, Statics.field207, field812);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var114++;
                                        }
                                    }
                                    method2168();
                                    for (int var72 = 0; var72 < 13; var72++) {
                                        for (int var73 = 0; var73 < 13; var73++) {
                                            boolean var74 = false;
                                            int var75 = field692[var71][var72][var73];
                                            if (var75 != -1) {
                                                int var76 = var75 >> 24 & 0x3;
                                                int var77 = var75 >> 1 & 0x3;
                                                int var78 = var75 >> 14 & 0x3FF;
                                                int var79 = var75 >> 3 & 0x7FF;
                                                int var80 = (var78 / 8 << 8) + var79 / 8;
                                                for (int var81 = 0; var81 < Statics.field628.length; var81++) {
                                                    if (Statics.field628[var81] == var80 && Statics.field1929[var81] != null) {
                                                        byte[] var82 = Statics.field1929[var81];
                                                        int var83 = var72 * 8;
                                                        int var84 = var73 * 8;
                                                        int var85 = (var78 & 0x7) * 8;
                                                        int var86 = (var79 & 0x7) * 8;
                                                        class173[] var87 = field812;
                                                        for (int var88 = 0; var88 < 8; var88++) {
                                                            for (int var89 = 0; var89 < 8; var89++) {
                                                                if (var83 + var88 > 0 && var83 + var88 < 103 && var84 + var89 > 0 && var84 + var89 < 103) {
                                                                    var87[var71].field2066[var83 + var88][var84 + var89] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class300 var90 = new class300(var82);
                                                        for (int var91 = 0; var91 < 4; var91++) {
                                                            for (int var92 = 0; var92 < 64; var92++) {
                                                                for (int var93 = 0; var93 < 64; var93++) {
                                                                    if (var76 == var91 && var92 >= var85 && var92 < var85 + 8 && var93 >= var86 && var93 < var86 + 8) {
                                                                        int var97 = var92 & 0x7;
                                                                        int var98 = var93 & 0x7;
                                                                        int var100 = var77 & 0x3;
                                                                        int var101;
                                                                        if (var100 == 0) {
                                                                            var101 = var97;
                                                                        } else if (var100 == 1) {
                                                                            var101 = var98;
                                                                        } else if (var100 == 2) {
                                                                            var101 = 7 - var97;
                                                                        } else {
                                                                            var101 = 7 - var98;
                                                                        }
                                                                        int var104 = var83 + var101;
                                                                        int var106 = var92 & 0x7;
                                                                        int var107 = var93 & 0x7;
                                                                        int var109 = var77 & 0x3;
                                                                        int var110;
                                                                        if (var109 == 0) {
                                                                            var110 = var107;
                                                                        } else if (var109 == 1) {
                                                                            var110 = 7 - var106;
                                                                        } else if (var109 == 2) {
                                                                            var110 = 7 - var107;
                                                                        } else {
                                                                            var110 = var106;
                                                                        }
                                                                        Statics.method5474(var90, var71, var104, var84 + var110, 0, 0, var77);
                                                                    } else {
                                                                        Statics.method5474(var90, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var74 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var74) {
                                                class56.method3246(var71, var72 * 8, var73 * 8);
                                            }
                                        }
                                    }
                                    var71++;
                                }
                            }
                            method140(true);
                            method2168();
                            class134 var124 = Statics.field207;
                            class173[] var125 = field812;
                            for (int var126 = 0; var126 < 4; var126++) {
                                for (int var127 = 0; var127 < 104; var127++) {
                                    for (int var128 = 0; var128 < 104; var128++) {
                                        if ((class56.field488[var126][var127][var128] & 0x1) == 1) {
                                            int var129 = var126;
                                            if ((class56.field488[1][var127][var128] & 0x2) == 2) {
                                                var129 = var126 - 1;
                                            }
                                            if (var129 >= 0) {
                                                var125[var129].method3349(var127, var128);
                                            }
                                        }
                                    }
                                }
                            }
                            class56.field496 += (int) (Math.random() * 5.0D) - 2;
                            if (class56.field496 < -8) {
                                class56.field496 = -8;
                            }
                            if (class56.field496 > 8) {
                                class56.field496 = 8;
                            }
                            class56.field497 += (int) (Math.random() * 5.0D) - 2;
                            if (class56.field497 < -16) {
                                class56.field497 = -16;
                            }
                            if (class56.field497 > 16) {
                                class56.field497 = 16;
                            }
                            for (int var130 = 0; var130 < 4; var130++) {
                                byte[][] var131 = Statics.field1301[var130];
                                int var132 = (int) Math.sqrt(5100.0D);
                                int var133 = var132 * 768 >> 8;
                                for (int var134 = 1; var134 < 103; var134++) {
                                    for (int var135 = 1; var135 < 103; var135++) {
                                        int var136 = class56.field482[var130][var135 + 1][var134] - class56.field482[var130][var135 - 1][var134];
                                        int var137 = class56.field482[var130][var135][var134 + 1] - class56.field482[var130][var135][var134 - 1];
                                        int var138 = (int) Math.sqrt((double) (var137 * var137 + var136 * var136 + 65536));
                                        int var139 = (var136 << 8) / var138;
                                        int var140 = 65536 / var138;
                                        int var141 = (var137 << 8) / var138;
                                        int var142 = (var141 * -50 + var139 * -50 + var140 * -10) / var133 + 96;
                                        int var143 = (var131[var135][var134] >> 1) + (var131[var135][var134 + 1] >> 3) + (var131[var135][var134 - 1] >> 2) + (var131[var135 - 1][var134] >> 2) + (var131[var135 + 1][var134] >> 3);
                                        Statics.field1965[var135][var134] = var142 - var143;
                                    }
                                }
                                for (int var144 = 0; var144 < 104; var144++) {
                                    Statics.field485[var144] = 0;
                                    Statics.field487[var144] = 0;
                                    Statics.field480[var144] = 0;
                                    Statics.field479[var144] = 0;
                                    Statics.field3084[var144] = 0;
                                }
                                for (int var145 = -5; var145 < 109; var145++) {
                                    for (int var146 = 0; var146 < 104; var146++) {
                                        int var147 = var145 + 5;
                                        int var10002;
                                        if (var147 >= 0 && var147 < 104) {
                                            int var148 = Statics.field1415[var130][var147][var146] & 0xFF;
                                            if (var148 > 0) {
                                                int var149 = var148 - 1;
                                                class245 var150 = (class245) class245.field3241.method3120((long) var149);
                                                class245 var151;
                                                if (var150 == null) {
                                                    byte[] var152 = Statics.field3242.method3873(1, var149);
                                                    class245 var153 = new class245();
                                                    if (var152 != null) {
                                                        var153.method4139(new class300(var152), var149);
                                                    }
                                                    var153.method4145();
                                                    class245.field3241.method3122(var153, (long) var149);
                                                    var151 = var153;
                                                } else {
                                                    var151 = var150;
                                                }
                                                Statics.field485[var146] += var151.field3245;
                                                Statics.field487[var146] += var151.field3244;
                                                Statics.field480[var146] += var151.field3249;
                                                Statics.field479[var146] += var151.field3246;
                                                var10002 = Statics.field3084[var146]++;
                                            }
                                        }
                                        int var155 = var145 - 5;
                                        if (var155 >= 0 && var155 < 104) {
                                            int var156 = Statics.field1415[var130][var155][var146] & 0xFF;
                                            if (var156 > 0) {
                                                int var157 = var156 - 1;
                                                class245 var158 = (class245) class245.field3241.method3120((long) var157);
                                                class245 var159;
                                                if (var158 == null) {
                                                    byte[] var160 = Statics.field3242.method3873(1, var157);
                                                    class245 var161 = new class245();
                                                    if (var160 != null) {
                                                        var161.method4139(new class300(var160), var157);
                                                    }
                                                    var161.method4145();
                                                    class245.field3241.method3122(var161, (long) var157);
                                                    var159 = var161;
                                                } else {
                                                    var159 = var158;
                                                }
                                                Statics.field485[var146] -= var159.field3245;
                                                Statics.field487[var146] -= var159.field3244;
                                                Statics.field480[var146] -= var159.field3249;
                                                Statics.field479[var146] -= var159.field3246;
                                                var10002 = Statics.field3084[var146]--;
                                            }
                                        }
                                    }
                                    if (var145 >= 1 && var145 < 103) {
                                        int var163 = 0;
                                        int var164 = 0;
                                        int var165 = 0;
                                        int var166 = 0;
                                        int var167 = 0;
                                        for (int var168 = -5; var168 < 109; var168++) {
                                            int var169 = var168 + 5;
                                            if (var169 >= 0 && var169 < 104) {
                                                var163 += Statics.field485[var169];
                                                var164 += Statics.field487[var169];
                                                var165 += Statics.field480[var169];
                                                var166 += Statics.field479[var169];
                                                var167 += Statics.field3084[var169];
                                            }
                                            int var170 = var168 - 5;
                                            if (var170 >= 0 && var170 < 104) {
                                                var163 -= Statics.field485[var170];
                                                var164 -= Statics.field487[var170];
                                                var165 -= Statics.field480[var170];
                                                var166 -= Statics.field479[var170];
                                                var167 -= Statics.field3084[var170];
                                            }
                                            if (var168 >= 1 && var168 < 103 && (!field637 || (class56.field488[0][var145][var168] & 0x2) != 0 || (class56.field488[var130][var145][var168] & 0x10) == 0)) {
                                                if (var130 < class56.field481) {
                                                    class56.field481 = var130;
                                                }
                                                int var171 = Statics.field1415[var130][var145][var168] & 0xFF;
                                                int var172 = Statics.field486[var130][var145][var168] & 0xFF;
                                                if (var171 > 0 || var172 > 0) {
                                                    int var173 = class56.field482[var130][var145][var168];
                                                    int var174 = class56.field482[var130][var145 + 1][var168];
                                                    int var175 = class56.field482[var130][var145 + 1][var168 + 1];
                                                    int var176 = class56.field482[var130][var145][var168 + 1];
                                                    int var177 = Statics.field1965[var145][var168];
                                                    int var178 = Statics.field1965[var145 + 1][var168];
                                                    int var179 = Statics.field1965[var145 + 1][var168 + 1];
                                                    int var180 = Statics.field1965[var145][var168 + 1];
                                                    int var181 = -1;
                                                    int var182 = -1;
                                                    if (var171 > 0) {
                                                        int var183 = var163 * 256 / var166;
                                                        int var184 = var164 / var167;
                                                        int var185 = var165 / var167;
                                                        var181 = Statics.method4257(var183, var184, var185);
                                                        int var186 = class56.field496 + var183 & 0xFF;
                                                        int var187 = class56.field497 + var185;
                                                        if (var187 < 0) {
                                                            var187 = 0;
                                                        } else if (var187 > 255) {
                                                            var187 = 255;
                                                        }
                                                        var182 = Statics.method4257(var186, var184, var187);
                                                    }
                                                    if (var130 > 0) {
                                                        boolean var188 = true;
                                                        if (var171 == 0 && Statics.field483[var130][var145][var168] != 0) {
                                                            var188 = false;
                                                        }
                                                        if (var172 > 0 && !class258.method308(var172 - 1).field3496) {
                                                            var188 = false;
                                                        }
                                                        if (var188 && var173 == var174 && var173 == var175 && var173 == var176) {
                                                            Statics.field489[var130][var145][var168] |= 0x924;
                                                        }
                                                    }
                                                    int var189 = 0;
                                                    if (var182 != -1) {
                                                        var189 = class131.field1758[class56.method568(var182, 96)];
                                                    }
                                                    if (var172 == 0) {
                                                        var124.method2911(var130, var145, var168, 0, 0, -1, var173, var174, var175, var176, class56.method568(var181, var177), class56.method568(var181, var178), class56.method568(var181, var179), class56.method568(var181, var180), 0, 0, 0, 0, var189, 0);
                                                    } else {
                                                        int var190 = Statics.field483[var130][var145][var168] + 1;
                                                        byte var191 = Statics.field484[var130][var145][var168];
                                                        class258 var192 = class258.method308(var172 - 1);
                                                        int var193 = var192.field3498;
                                                        int var194;
                                                        int var195;
                                                        if (var193 >= 0) {
                                                            var194 = Statics.field1749.method2637(var193);
                                                            var195 = -1;
                                                        } else if (var192.field3494 == 16711935) {
                                                            var195 = -2;
                                                            var193 = -1;
                                                            var194 = -2;
                                                        } else {
                                                            var195 = Statics.method4257(var192.field3495, var192.field3492, var192.field3500);
                                                            int var196 = class56.field496 + var192.field3495 & 0xFF;
                                                            int var197 = class56.field497 + var192.field3500;
                                                            if (var197 < 0) {
                                                                var197 = 0;
                                                            } else if (var197 > 255) {
                                                                var197 = 255;
                                                            }
                                                            var194 = Statics.method4257(var196, var192.field3492, var197);
                                                        }
                                                        int var198 = 0;
                                                        if (var194 != -2) {
                                                            var198 = class131.field1758[class56.method1672(var194, 96)];
                                                        }
                                                        if (var192.field3497 != -1) {
                                                            int var199 = class56.field496 + var192.field3501 & 0xFF;
                                                            int var200 = class56.field497 + var192.field3503;
                                                            if (var200 < 0) {
                                                                var200 = 0;
                                                            } else if (var200 > 255) {
                                                                var200 = 255;
                                                            }
                                                            int var201 = Statics.method4257(var199, var192.field3502, var200);
                                                            var198 = class131.field1758[class56.method1672(var201, 96)];
                                                        }
                                                        var124.method2911(var130, var145, var168, var190, var191, var193, var173, var174, var175, var176, class56.method568(var181, var177), class56.method568(var181, var178), class56.method568(var181, var179), class56.method568(var181, var180), class56.method1672(var195, var177), class56.method1672(var195, var178), class56.method1672(var195, var179), class56.method1672(var195, var180), var189, var198);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var202 = 1; var202 < 103; var202++) {
                                    for (int var203 = 1; var203 < 103; var203++) {
                                        int var208;
                                        if ((class56.field488[var130][var203][var202] & 0x8) != 0) {
                                            var208 = 0;
                                        } else if (var130 <= 0 || (class56.field488[1][var203][var202] & 0x2) == 0) {
                                            var208 = var130;
                                        } else {
                                            var208 = var130 - 1;
                                        }
                                        var124.method2910(var130, var203, var202, var208);
                                    }
                                }
                                Statics.field1415[var130] = (byte[][]) null;
                                Statics.field486[var130] = (byte[][]) null;
                                Statics.field483[var130] = (byte[][]) null;
                                Statics.field484[var130] = (byte[][]) null;
                                Statics.field1301[var130] = (byte[][]) null;
                            }
                            var124.method2937(-50, -10, -50);
                            for (int var209 = 0; var209 < 104; var209++) {
                                for (int var210 = 0; var210 < 104; var210++) {
                                    if ((class56.field488[1][var209][var210] & 0x2) == 2) {
                                        var124.method3074(var209, var210);
                                    }
                                }
                            }
                            int var211 = 1;
                            int var212 = 2;
                            int var213 = 4;
                            for (int var214 = 0; var214 < 4; var214++) {
                                if (var214 > 0) {
                                    var211 <<= 0x3;
                                    var212 <<= 0x3;
                                    var213 <<= 0x3;
                                }
                                for (int var215 = 0; var215 <= var214; var215++) {
                                    for (int var216 = 0; var216 <= 104; var216++) {
                                        for (int var217 = 0; var217 <= 104; var217++) {
                                            if ((Statics.field489[var215][var217][var216] & var211) != 0) {
                                                int var218 = var216;
                                                int var219 = var216;
                                                int var220 = var215;
                                                int var221 = var215;
                                                while (var218 > 0 && (Statics.field489[var215][var217][var218 - 1] & var211) != 0) {
                                                    var218--;
                                                }
                                                while (var219 < 104 && (Statics.field489[var215][var217][var219 + 1] & var211) != 0) {
                                                    var219++;
                                                }
                                                label758: while (var220 > 0) {
                                                    for (int var222 = var218; var222 <= var219; var222++) {
                                                        if ((Statics.field489[var220 - 1][var217][var222] & var211) == 0) {
                                                            break label758;
                                                        }
                                                    }
                                                    var220--;
                                                }
                                                label747: while (var221 < var214) {
                                                    for (int var223 = var218; var223 <= var219; var223++) {
                                                        if ((Statics.field489[var221 + 1][var217][var223] & var211) == 0) {
                                                            break label747;
                                                        }
                                                    }
                                                    var221++;
                                                }
                                                int var224 = (var221 + 1 - var220) * (var219 - var218 + 1);
                                                if (var224 >= 8) {
                                                    short var225 = 240;
                                                    int var226 = class56.field482[var221][var217][var218] - var225;
                                                    int var227 = class56.field482[var220][var217][var218];
                                                    class134.method2909(var214, 1, var217 * 128, var217 * 128, var218 * 128, var219 * 128 + 128, var226, var227);
                                                    for (int var228 = var220; var228 <= var221; var228++) {
                                                        for (int var229 = var218; var229 <= var219; var229++) {
                                                            Statics.field489[var228][var217][var229] &= ~var211;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field489[var215][var217][var216] & var212) != 0) {
                                                int var230 = var217;
                                                int var231 = var217;
                                                int var232 = var215;
                                                int var233 = var215;
                                                while (var230 > 0 && (Statics.field489[var215][var230 - 1][var216] & var212) != 0) {
                                                    var230--;
                                                }
                                                while (var231 < 104 && (Statics.field489[var215][var231 + 1][var216] & var212) != 0) {
                                                    var231++;
                                                }
                                                label811: while (var232 > 0) {
                                                    for (int var234 = var230; var234 <= var231; var234++) {
                                                        if ((Statics.field489[var232 - 1][var234][var216] & var212) == 0) {
                                                            break label811;
                                                        }
                                                    }
                                                    var232--;
                                                }
                                                label800: while (var233 < var214) {
                                                    for (int var235 = var230; var235 <= var231; var235++) {
                                                        if ((Statics.field489[var233 + 1][var235][var216] & var212) == 0) {
                                                            break label800;
                                                        }
                                                    }
                                                    var233++;
                                                }
                                                int var236 = (var233 + 1 - var232) * (var231 - var230 + 1);
                                                if (var236 >= 8) {
                                                    short var237 = 240;
                                                    int var238 = class56.field482[var233][var230][var216] - var237;
                                                    int var239 = class56.field482[var232][var230][var216];
                                                    class134.method2909(var214, 2, var230 * 128, var231 * 128 + 128, var216 * 128, var216 * 128, var238, var239);
                                                    for (int var240 = var232; var240 <= var233; var240++) {
                                                        for (int var241 = var230; var241 <= var231; var241++) {
                                                            Statics.field489[var240][var241][var216] &= ~var212;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field489[var215][var217][var216] & var213) != 0) {
                                                int var242 = var217;
                                                int var243 = var217;
                                                int var244 = var216;
                                                int var245 = var216;
                                                while (var244 > 0 && (Statics.field489[var215][var217][var244 - 1] & var213) != 0) {
                                                    var244--;
                                                }
                                                while (var245 < 104 && (Statics.field489[var215][var217][var245 + 1] & var213) != 0) {
                                                    var245++;
                                                }
                                                label864: while (var242 > 0) {
                                                    for (int var246 = var244; var246 <= var245; var246++) {
                                                        if ((Statics.field489[var215][var242 - 1][var246] & var213) == 0) {
                                                            break label864;
                                                        }
                                                    }
                                                    var242--;
                                                }
                                                label853: while (var243 < 104) {
                                                    for (int var247 = var244; var247 <= var245; var247++) {
                                                        if ((Statics.field489[var215][var243 + 1][var247] & var213) == 0) {
                                                            break label853;
                                                        }
                                                    }
                                                    var243++;
                                                }
                                                if ((var243 - var242 + 1) * (var245 - var244 + 1) >= 4) {
                                                    int var248 = class56.field482[var215][var242][var244];
                                                    class134.method2909(var214, 4, var242 * 128, var243 * 128 + 128, var244 * 128, var245 * 128 + 128, var248, var248);
                                                    for (int var249 = var242; var249 <= var243; var249++) {
                                                        for (int var250 = var244; var250 <= var245; var250++) {
                                                            Statics.field489[var215][var249][var250] &= ~var213;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method140(true);
                            int var251 = class56.field481;
                            if (var251 > Statics.field625) {
                                var251 = Statics.field625;
                            }
                            if (var251 < Statics.field625 - 1) {
                                int var252 = Statics.field625 - 1;
                            }
                            if (field637) {
                                Statics.field207.method2907(class56.field481);
                            } else {
                                Statics.field207.method2907(0);
                            }
                            for (int var253 = 0; var253 < 104; var253++) {
                                for (int var254 = 0; var254 < 104; var254++) {
                                    method51(var253, var254);
                                }
                            }
                            method2168();
                            for (class69 var255 = (class69) field761.method4581(); var255 != null; var255 = (class69) field761.method4589()) {
                                if (var255.field920 == -1) {
                                    var255.field909 = 0;
                                    method3092(var255);
                                } else {
                                    var255.method3386();
                                }
                            }
                            class254.field3340.method3123();
                            if (Statics.field257.method853()) {
                                class188 var256 = class188.method2402(class184.field2272, field679.field1284);
                                var256.field2308.method5262(1057001181);
                                field679.method2177(var256);
                            }
                            if (!field741) {
                                int var257 = (Statics.field141 - 6) / 8;
                                int var258 = (Statics.field141 + 6) / 8;
                                int var259 = (Statics.field564 - 6) / 8;
                                int var260 = (Statics.field564 + 6) / 8;
                                for (int var261 = var257 - 1; var261 <= var258 + 1; var261++) {
                                    for (int var262 = var259 - 1; var262 <= var260 + 1; var262++) {
                                        if (var261 < var257 || var261 > var258 || var262 < var259 || var262 > var260) {
                                            Statics.field165.method3897("m" + var261 + "_" + var262);
                                            Statics.field165.method3897("l" + var261 + "_" + var262);
                                        }
                                    }
                                }
                            }
                            method2725(30);
                            method2168();
                            Statics.field1415 = (byte[][][]) null;
                            Statics.field486 = (byte[][][]) null;
                            Statics.field483 = (byte[][][]) null;
                            Statics.field484 = (byte[][][]) null;
                            Statics.field489 = (int[][][]) null;
                            Statics.field1301 = (byte[][][]) null;
                            Statics.field1965 = (int[][]) null;
                            Statics.field485 = null;
                            Statics.field487 = null;
                            Statics.field480 = null;
                            Statics.field479 = null;
                            Statics.field3084 = null;
                            class188 var263 = class188.method2402(class184.field2281, field679.field1284);
                            field679.method2177(var263);
                            class54.method1950();
                        } else {
                            field689 = 2;
                        }
                    } else {
                        field689 = 1;
                    }
                }
                if (field640 == 30) {
                    this.method1509();
                } else if (field640 == 40 || field640 == 45) {
                    this.method1226();
                }
                return;
            }
            var2.field3105.method3985(var2.field3104, (int) var2.field2091, var2.field3103, false);
        }
    }

    @ObfuscatedName("client.au(ZI)V")
    public final void method846(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2378 == 2) {
                    if (Statics.field2381 == null) {
                        Statics.field2381 = class204.method3662(Statics.field3280, Statics.field2316, Statics.field2379);
                        if (Statics.field2381 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field3700 == null) {
                        Statics.field3700 = new class109(Statics.field2376, Statics.field2382);
                    }
                    if (Statics.field2375.method3475(Statics.field2381, Statics.field2377, Statics.field3700, 22050)) {
                        Statics.field2375.method3476();
                        Statics.field2375.method3552(Statics.field2380);
                        Statics.field2375.method3504(Statics.field2381, Statics.field509);
                        class198.field2378 = 0;
                        Statics.field2381 = null;
                        Statics.field3700 = null;
                        Statics.field3280 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2375.method3478();
                class198.field2378 = 0;
                Statics.field2381 = null;
                Statics.field3700 = null;
                Statics.field3280 = null;
            }
            var2 = false;
        }
        if (var2 && field856 && Statics.field1122 != null) {
            Statics.field1122.method2349();
        }
        if ((field640 == 10 || field640 == 20 || field640 == 30) && field737 != 0L && class297.method3777() > field737) {
            method4962(method3100());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field843[var5] = true;
            }
        }
        if (field640 == 0) {
            this.method910(class86.field1164, class86.field1165, arg0);
        } else if (field640 == 5) {
            class86.method12(Statics.field366, Statics.field414, Statics.field3139);
        } else if (field640 == 10 || field640 == 11) {
            class86.method12(Statics.field366, Statics.field414, Statics.field3139);
        } else if (field640 == 20) {
            class86.method12(Statics.field366, Statics.field414, Statics.field3139);
        } else if (field640 == 25) {
            if (field689 == 1) {
                if (field685 > field686) {
                    field686 = field685;
                }
                int var6 = (field686 * 50 - field685 * 50) / field686;
                method79(class225.field2754 + class82.field1133 + class82.field1137 + var6 + "%" + class82.field1131, false);
            } else if (field689 == 2) {
                if (field687 > field688) {
                    field688 = field687;
                }
                int var7 = (field688 * 50 - field687 * 50) / field688 + 50;
                method79(class225.field2754 + class82.field1133 + class82.field1137 + var7 + "%" + class82.field1131, false);
            } else {
                method79(class225.field2754, false);
            }
        } else if (field640 == 30) {
            this.method1263();
        } else if (field640 == 40) {
            method79(class225.field2755 + class82.field1133 + class225.field2756, false);
        } else if (field640 == 45) {
            method79(class225.field2988, false);
        }
        if (field640 == 30 && field844 == 0 && !arg0 && !field846) {
            for (int var8 = 0; var8 < field811; var8++) {
                if (field838[var8]) {
                    Statics.field155.method805(field840[var8], field841[var8], field828[var8], field727[var8]);
                    field838[var8] = false;
                }
            }
        } else if (field640 > 0) {
            Statics.field155.method804(0, 0);
            for (int var9 = 0; var9 < field811; var9++) {
                field838[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method847() {
        if (Statics.field1.method2094()) {
            Statics.field1.method2091();
        }
        if (Statics.field16 != null) {
            Statics.field16.field577 = false;
        }
        Statics.field16 = null;
        field679.method2179();
        class46.method706();
        class55.method4431();
        Statics.field392 = null;
        if (Statics.field1122 != null) {
            Statics.field1122.method2377();
        }
        if (Statics.field1143 != null) {
            Statics.field1143.method2377();
        }
        class237.method3413();
        class235.method3838();
        if (Statics.field2731 != null) {
            Statics.field2731.method3111();
            Statics.field2731 = null;
        }
        class168.method2726();
    }

    @ObfuscatedName("dh.fp(IB)V")
    public static void method2725(int arg0) {
        if (field640 == arg0) {
            return;
        }
        if (field640 == 0) {
            Statics.field257.method855();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field879 = 0;
            field667 = 0;
            field668 = 0;
            field683.method4669(arg0);
            if (arg0 != 20) {
                method203(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field500 != null) {
            Statics.field500.method3292();
            Statics.field500 = null;
        }
        if (field640 == 25) {
            field689 = 0;
            field685 = 0;
            field686 = 1;
            field687 = 0;
            field688 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method1997(Statics.field262, Statics.field70, true, 0);
        } else if (arg0 == 20) {
            class86.method1997(Statics.field262, Statics.field70, true, field640 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method1997(Statics.field262, Statics.field70, false, 4);
        } else {
            class86.method3727();
        }
        field640 = arg0;
    }

    @ObfuscatedName("client.fu(I)V")
    public void method1223() {
        if (field640 == 1000) {
            return;
        }
        long var1 = class297.method3777();
        int var3 = (int) (var1 - Statics.field3150);
        Statics.field3150 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class237.field3151 += var3;
        boolean var4;
        if (class237.field3161 == 0 && class237.field3156 == 0 && class237.field3163 == 0 && class237.field3154 == 0) {
            var4 = true;
        } else if (Statics.field3160 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class237.field3151 > 30000) {
                        throw new IOException();
                    }
                    while (class237.field3156 < 200 && class237.field3154 > 0) {
                        class233 var5 = (class233) class237.field3153.method5536();
                        class300 var6 = new class300(4);
                        var6.method5253(1);
                        var6.method5109((int) var5.field2091);
                        Statics.field3160.method3299(var6.field3699, 0, 4);
                        class237.field3155.method5529(var5, var5.field2091);
                        class237.field3154--;
                        class237.field3156++;
                    }
                    while (class237.field3161 < 200 && class237.field3163 > 0) {
                        class233 var7 = (class233) class237.field3157.method4489();
                        class300 var8 = new class300(4);
                        var8.method5253(0);
                        var8.method5109((int) var7.field2091);
                        Statics.field3160.method3299(var8.field3699, 0, 4);
                        var7.method3378();
                        class237.field3169.method5529(var7, var7.field2091);
                        class237.field3163--;
                        class237.field3161++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3160.method3291();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class237.field3151 = 0;
                        byte var11 = 0;
                        if (Statics.field1980 == null) {
                            var11 = 8;
                        } else if (class237.field3162 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class237.field3152.field3694;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3160.method3318(class237.field3152.field3699, class237.field3152.field3694, var12);
                            if (class237.field3166 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class237.field3152.field3699[class237.field3152.field3694 + var13] ^= class237.field3166;
                                }
                            }
                            class237.field3152.field3694 += var12;
                            if (class237.field3152.field3694 < var11) {
                                break;
                            }
                            if (Statics.field1980 == null) {
                                class237.field3152.field3694 = 0;
                                int var14 = class237.field3152.method5123();
                                int var15 = class237.field3152.method5166();
                                int var16 = class237.field3152.method5123();
                                int var17 = class237.field3152.method5155();
                                long var18 = (long) ((var14 << 16) + var15);
                                class233 var20 = (class233) class237.field3155.method5528(var18);
                                Statics.field1152 = true;
                                if (var20 == null) {
                                    var20 = (class233) class237.field3169.method5528(var18);
                                    Statics.field1152 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1980 = var20;
                                Statics.field1869 = new class300(var17 + var21 + Statics.field1980.field3109);
                                Statics.field1869.method5253(var16);
                                Statics.field1869.method5262(var17);
                                class237.field3162 = 8;
                                class237.field3152.field3694 = 0;
                            } else if (class237.field3162 == 0) {
                                if (class237.field3152.field3699[0] == -1) {
                                    class237.field3162 = 1;
                                    class237.field3152.field3694 = 0;
                                } else {
                                    Statics.field1980 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1869.field3699.length - Statics.field1980.field3109;
                            int var23 = 512 - class237.field3162;
                            if (var23 > var22 - Statics.field1869.field3694) {
                                var23 = var22 - Statics.field1869.field3694;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3160.method3318(Statics.field1869.field3699, Statics.field1869.field3694, var23);
                            if (class237.field3166 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1869.field3699[Statics.field1869.field3694 + var24] ^= class237.field3166;
                                }
                            }
                            Statics.field1869.field3694 += var23;
                            class237.field3162 += var23;
                            if (Statics.field1869.field3694 == var22) {
                                if (Statics.field1980.field2091 == 16711935L) {
                                    Statics.field2479 = Statics.field1869;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class236 var26 = class237.field3165[var25];
                                        if (var26 != null) {
                                            Statics.field2479.field3694 = var25 * 8 + 5;
                                            int var27 = Statics.field2479.method5155();
                                            int var28 = Statics.field2479.method5155();
                                            var26.method3983(var27, var28);
                                        }
                                    }
                                } else {
                                    class237.field3167.reset();
                                    class237.field3167.update(Statics.field1869.field3699, 0, var22);
                                    int var29 = (int) class237.field3167.getValue();
                                    if (Statics.field1980.field3107 != var29) {
                                        try {
                                            Statics.field3160.method3292();
                                        } catch (Exception var35) {
                                        }
                                        class237.field3159++;
                                        Statics.field3160 = null;
                                        class237.field3166 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class237.field3159 = 0;
                                    class237.field3168 = 0;
                                    Statics.field1980.field3108.method3984((int) (Statics.field1980.field2091 & 0xFFFFL), Statics.field1869.field3699, (Statics.field1980.field2091 & 0xFF0000L) == 16711680L, Statics.field1152);
                                }
                                Statics.field1980.method3386();
                                if (Statics.field1152) {
                                    class237.field3156--;
                                } else {
                                    class237.field3161--;
                                }
                                class237.field3162 = 0;
                                Statics.field1980 = null;
                                Statics.field1869 = null;
                            } else {
                                if (class237.field3162 != 512) {
                                    break;
                                }
                                class237.field3162 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3160.method3292();
                } catch (Exception var34) {
                }
                class237.field3168++;
                Statics.field3160 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1224();
        }
    }

    @ObfuscatedName("client.fy(B)V")
    public void method1224() {
        if (class237.field3159 >= 4) {
            this.method834("js5crc");
            field640 = 1000;
            return;
        }
        if (class237.field3168 >= 4) {
            if (field640 <= 5) {
                this.method834("js5io");
                field640 = 1000;
                return;
            }
            field820 = 3000;
            class237.field3168 = 3;
        }
        if (--field820 + 1 > 0) {
            return;
        }
        try {
            if (field663 == 0) {
                Statics.field1848 = Statics.field447.method3261(Statics.field328, Statics.field71);
                field663++;
            }
            if (field663 == 1) {
                if (Statics.field1848.field2007 == 2) {
                    this.method1225(-1);
                    return;
                }
                if (Statics.field1848.field2007 == 1) {
                    field663++;
                }
            }
            if (field663 == 2) {
                if (field682) {
                    Statics.field676 = class305.method691((Socket) Statics.field1848.field2011, 40000, 5000);
                } else {
                    Statics.field676 = new class172((Socket) Statics.field1848.field2011, Statics.field447, 5000);
                }
                class300 var1 = new class300(5);
                var1.method5253(15);
                var1.method5262(185);
                Statics.field676.method3299(var1.field3699, 0, 5);
                field663++;
                Statics.field3131 = class297.method3777();
            }
            if (field663 == 3) {
                if (Statics.field676.method3291() > 0 || !field682 && field640 <= 5) {
                    int var2 = Statics.field676.method3315();
                    if (var2 != 0) {
                        this.method1225(var2);
                        return;
                    }
                    field663++;
                } else if (class297.method3777() - Statics.field3131 > 30000L) {
                    this.method1225(-2);
                    return;
                }
            }
            if (field663 == 4) {
                class237.method4058(Statics.field676, field640 > 20);
                Statics.field1848 = null;
                Statics.field676 = null;
                field663 = 0;
                field654 = 0;
            }
        } catch (IOException var4) {
            this.method1225(-3);
        }
    }

    @ObfuscatedName("client.fn(II)V")
    public void method1225(int arg0) {
        Statics.field1848 = null;
        Statics.field676 = null;
        field663 = 0;
        if (Statics.field71 == Statics.field2738) {
            Statics.field71 = Statics.field1435;
        } else {
            Statics.field71 = Statics.field2738;
        }
        field654++;
        if (field654 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field640 <= 5) {
                this.method834("js5connect_full");
                field640 = 1000;
            } else {
                field820 = 3000;
            }
        } else if (field654 >= 2 && arg0 == 6) {
            this.method834("js5connect_outofdate");
            field640 = 1000;
        } else if (field654 >= 4) {
            if (field640 <= 5) {
                this.method834("js5connect");
                field640 = 1000;
            } else {
                field820 = 3000;
            }
        }
    }

    @ObfuscatedName("ag.fg(Lij;Ljava/lang/String;I)V")
    public static void method531(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field691.add(var2);
        field904 += var2.field519;
    }

    @ObfuscatedName("x.fw(I)I")
    public static int method171() {
        if (field691 == null || field903 >= field691.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field903; var1++) {
            var0 += ((class59) field691.get(var1)).field523;
        }
        return var0 * 10000 / field904;
    }

    @ObfuscatedName("b.ff(II)I")
    public static int method253(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("gm.fh(IIB)V")
    public static void method3448(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method253(var4);
            int var6 = class131.field1762[var4];
            int var7 = method2381(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class134.method2941(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ip.fl(I)V")
    public static void method4030() {
        if (field781 == 0) {
            Statics.field207 = new class134(4, 104, 104, class56.field482);
            for (int var0 = 0; var0 < 4; var0++) {
                field812[var0] = new class173(104, 104);
            }
            Statics.field1593 = new class325(512, 512);
            class86.field1165 = class225.field2757;
            class86.field1164 = 5;
            field781 = 20;
        } else if (field781 == 20) {
            class86.field1165 = class225.field2758;
            class86.field1164 = 10;
            field781 = 30;
        } else if (field781 == 30) {
            Statics.field1979 = method259(0, false, true, true);
            Statics.field2291 = method259(1, false, true, true);
            Statics.field286 = method259(2, true, false, true);
            Statics.field2500 = method259(3, false, true, true);
            Statics.field3111 = method259(4, false, true, true);
            Statics.field165 = method259(5, true, true, true);
            Statics.field2532 = method259(6, true, true, true);
            Statics.field2322 = method259(7, false, true, true);
            Statics.field70 = method259(8, false, true, true);
            Statics.field220 = method259(9, false, true, true);
            Statics.field262 = method259(10, false, true, true);
            Statics.field1438 = method259(11, false, true, true);
            Statics.field1878 = method259(12, false, true, true);
            Statics.field1934 = method259(13, true, false, true);
            Statics.field2355 = method259(14, false, true, true);
            Statics.field2508 = method259(15, false, true, true);
            Statics.field3894 = method259(17, true, true, true);
            Statics.field197 = method259(18, false, true, true);
            Statics.field1312 = method259(19, false, true, true);
            Statics.field985 = method259(20, false, true, true);
            class86.field1165 = class225.field2759;
            class86.field1164 = 20;
            field781 = 40;
        } else if (field781 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1979.method3981() * 4 / 100;
            int var3 = var2 + Statics.field2291.method3981() * 4 / 100;
            int var4 = var3 + Statics.field286.method3981() * 2 / 100;
            int var5 = var4 + Statics.field2500.method3981() * 2 / 100;
            int var6 = var5 + Statics.field3111.method3981() * 6 / 100;
            int var7 = var6 + Statics.field165.method3981() * 4 / 100;
            int var8 = var7 + Statics.field2532.method3981() * 2 / 100;
            int var9 = var8 + Statics.field2322.method3981() * 56 / 100;
            int var10 = var9 + Statics.field70.method3981() * 2 / 100;
            int var11 = var10 + Statics.field220.method3981() * 2 / 100;
            int var12 = var11 + Statics.field262.method3981() * 2 / 100;
            int var13 = var12 + Statics.field1438.method3981() * 2 / 100;
            int var14 = var13 + Statics.field1878.method3981() * 2 / 100;
            int var15 = var14 + Statics.field1934.method3981() * 2 / 100;
            int var16 = var15 + Statics.field2355.method3981() * 2 / 100;
            int var17 = var16 + Statics.field2508.method3981() * 2 / 100;
            int var18 = var17 + Statics.field1312.method3981() / 100;
            int var19 = var18 + Statics.field197.method3981() / 100;
            int var20 = var19 + Statics.field985.method3981() / 100;
            int var21 = var20 + (Statics.field3894.method3980() && Statics.field3894.method3948() ? 1 : 0);
            if (var21 == 100) {
                method531(Statics.field1979, "Animations");
                method531(Statics.field2291, "Skeletons");
                method531(Statics.field3111, "Sound FX");
                method531(Statics.field165, "Maps");
                method531(Statics.field2532, "Music Tracks");
                method531(Statics.field2322, "Models");
                method531(Statics.field70, "Sprites");
                method531(Statics.field1438, "Music Jingles");
                method531(Statics.field2355, "Music Samples");
                method531(Statics.field2508, "Music Patches");
                method531(Statics.field1312, "World Map");
                method531(Statics.field197, "World Map Geography");
                method531(Statics.field985, "World Map Ground");
                Statics.field2356 = new class312();
                Statics.field2356.method5471(Statics.field3894);
                class86.field1165 = class225.field2835;
                class86.field1164 = 30;
                field781 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1165 = class225.field2760 + var21 + "%";
                }
                class86.field1164 = 30;
            }
        } else if (field781 == 45) {
            boolean var22 = !field637;
            Statics.field1392 = 22050;
            Statics.field544 = var22;
            Statics.field3297 = 2;
            class199 var23 = new class199();
            var23.method3510(9, 128);
            Statics.field1122 = class106.method1651(Statics.field447, 0, 22050);
            Statics.field1122.method2346(var23);
            class198.method3290(Statics.field2508, Statics.field2355, Statics.field3111, var23);
            Statics.field1143 = class106.method1651(Statics.field447, 1, 2048);
            Statics.field3248 = new class99();
            Statics.field1143.method2346(Statics.field3248);
            Statics.field288 = new class113(22050, Statics.field1392);
            class86.field1165 = class225.field2762;
            class86.field1164 = 35;
            field781 = 50;
            Statics.field1847 = new class293(Statics.field70, Statics.field1934);
        } else if (field781 == 50) {
            class292[] var24 = new class292[] { class292.field3647, class292.field3646, class292.field3642, class292.field3645, class292.field3644, class292.field3643 };
            int var25 = var24.length;
            class293 var26 = Statics.field1847;
            class292[] var27 = new class292[] { class292.field3647, class292.field3646, class292.field3642, class292.field3645, class292.field3644, class292.field3643 };
            field842 = var26.method4966(var27);
            if (field842.size() < var25) {
                class86.field1165 = class225.field2763 + field842.size() * 100 / var25 + "%";
                class86.field1164 = 40;
            } else {
                Statics.field414 = (class295) field842.get(class292.field3644);
                Statics.field3139 = (class295) field842.get(class292.field3643);
                Statics.field366 = (class295) field842.get(class292.field3645);
                Statics.field2533 = field898.method5839();
                class86.field1165 = class225.field2764;
                class86.field1164 = 40;
                field781 = 60;
            }
        } else if (field781 == 60) {
            int var28 = class86.method150(Statics.field262, Statics.field70);
            int var29 = class86.method3645();
            if (var28 < var29) {
                class86.field1165 = class225.field2990 + var28 * 100 / var29 + "%";
                class86.field1164 = 50;
            } else {
                class86.field1165 = class225.field2766;
                class86.field1164 = 50;
                method2725(5);
                field781 = 70;
            }
        } else if (field781 == 70) {
            if (Statics.field286.method3948()) {
                class258.method1061(Statics.field286);
                class245.method3458(Statics.field286);
                class236 var30 = Statics.field286;
                class236 var31 = Statics.field2322;
                Statics.field3253 = var30;
                Statics.field369 = var31;
                Statics.field3252 = Statics.field3253.method3953(3);
                class236 var32 = Statics.field286;
                class236 var33 = Statics.field2322;
                boolean var34 = field637;
                Statics.field3338 = var32;
                Statics.field3339 = var33;
                class254.field3381 = var34;
                class257.method2146(Statics.field286, Statics.field2322);
                class236 var35 = Statics.field286;
                Statics.field3299 = var35;
                class236 var36 = Statics.field286;
                class236 var37 = Statics.field2322;
                boolean var38 = field636;
                class295 var39 = Statics.field414;
                Statics.field3390 = var36;
                Statics.field3399 = var37;
                Statics.field3394 = var38;
                Statics.field3395 = Statics.field3390.method3953(10);
                Statics.field255 = var39;
                class259.method3472(Statics.field286, Statics.field1979, Statics.field2291);
                class244.method2189(Statics.field286, Statics.field2322);
                class249.method2000(Statics.field286);
                class241.method231(Statics.field286);
                class218.method2638(Statics.field2500, Statics.field2322, Statics.field70, Statics.field1934);
                class236 var40 = Statics.field286;
                Statics.field3 = var40;
                class252.method528(Statics.field286);
                class236 var41 = Statics.field286;
                Statics.field3220 = var41;
                class236 var42 = Statics.field286;
                Statics.field3293 = var42;
                Statics.field1 = new class91();
                class253.method3275(Statics.field286, Statics.field70, Statics.field1934);
                class236 var43 = Statics.field286;
                class236 var44 = Statics.field70;
                Statics.field3262 = var43;
                Statics.field3263 = var44;
                class236 var45 = Statics.field286;
                class236 var46 = Statics.field70;
                Statics.field3197 = var46;
                if (var45.method3948()) {
                    Statics.field2472 = var45.method3953(35);
                    Statics.field55 = new class242[Statics.field2472];
                    for (int var47 = 0; var47 < Statics.field2472; var47++) {
                        byte[] var48 = var45.method3873(35, var47);
                        Statics.field55[var47] = new class242(var47);
                        if (var48 != null) {
                            Statics.field55[var47].method4082(new class300(var48));
                            Statics.field55[var47].method4088();
                        }
                    }
                }
                class86.field1165 = class225.field2768;
                class86.field1164 = 60;
                field781 = 80;
            } else {
                class86.field1165 = class225.field2996 + Statics.field286.method4000() + "%";
                class86.field1164 = 60;
            }
        } else if (field781 == 80) {
            int var49 = 0;
            if (Statics.field2 == null) {
                Statics.field2 = class326.method1991(Statics.field70, Statics.field2356.field3793, 0);
            } else {
                var49++;
            }
            if (Statics.field27 == null) {
                Statics.field27 = class326.method1991(Statics.field70, Statics.field2356.field3788, 0);
            } else {
                var49++;
            }
            if (Statics.field32 == null) {
                class236 var50 = Statics.field70;
                int var51 = Statics.field2356.field3789;
                class324[] var52;
                if (class326.method539(var50, var51, 0)) {
                    class324[] var53 = new class324[Statics.field3875];
                    for (int var54 = 0; var54 < Statics.field3875; var54++) {
                        class324 var55 = var53[var54] = new class324();
                        var55.field3860 = Statics.field3877;
                        var55.field3861 = Statics.field3876;
                        var55.field3858 = Statics.field1222[var54];
                        var55.field3859 = Statics.field1105[var54];
                        var55.field3854 = Statics.field515[var54];
                        var55.field3857 = Statics.field1156[var54];
                        var55.field3856 = Statics.field3874;
                        var55.field3855 = Statics.field3878[var54];
                    }
                    class326.method639();
                    var52 = var53;
                } else {
                    var52 = null;
                }
                Statics.field32 = var52;
            } else {
                var49++;
            }
            if (Statics.field3627 == null) {
                Statics.field3627 = class326.method1993(Statics.field70, Statics.field2356.field3790, 0);
            } else {
                var49++;
            }
            if (Statics.field1188 == null) {
                Statics.field1188 = class326.method1993(Statics.field70, Statics.field2356.field3791, 0);
            } else {
                var49++;
            }
            if (Statics.field90 == null) {
                Statics.field90 = class326.method1993(Statics.field70, Statics.field2356.field3787, 0);
            } else {
                var49++;
            }
            if (Statics.field627 == null) {
                Statics.field627 = class326.method1993(Statics.field70, Statics.field2356.field3792, 0);
            } else {
                var49++;
            }
            if (Statics.field1514 == null) {
                Statics.field1514 = class326.method1993(Statics.field70, Statics.field2356.field3794, 0);
            } else {
                var49++;
            }
            if (Statics.field363 == null) {
                Statics.field363 = class326.method1993(Statics.field70, Statics.field2356.field3795, 0);
            } else {
                var49++;
            }
            if (Statics.field2050 == null) {
                class236 var57 = Statics.field70;
                int var58 = Statics.field2356.field3796;
                class324[] var59;
                if (class326.method539(var57, var58, 0)) {
                    class324[] var60 = new class324[Statics.field3875];
                    for (int var61 = 0; var61 < Statics.field3875; var61++) {
                        class324 var62 = var60[var61] = new class324();
                        var62.field3860 = Statics.field3877;
                        var62.field3861 = Statics.field3876;
                        var62.field3858 = Statics.field1222[var61];
                        var62.field3859 = Statics.field1105[var61];
                        var62.field3854 = Statics.field515[var61];
                        var62.field3857 = Statics.field1156[var61];
                        var62.field3856 = Statics.field3874;
                        var62.field3855 = Statics.field3878[var61];
                    }
                    class326.method639();
                    var59 = var60;
                } else {
                    var59 = null;
                }
                Statics.field2050 = var59;
            } else {
                var49++;
            }
            if (Statics.field3221 == null) {
                class236 var64 = Statics.field70;
                int var65 = Statics.field2356.field3797;
                class324[] var66;
                if (class326.method539(var64, var65, 0)) {
                    class324[] var67 = new class324[Statics.field3875];
                    for (int var68 = 0; var68 < Statics.field3875; var68++) {
                        class324 var69 = var67[var68] = new class324();
                        var69.field3860 = Statics.field3877;
                        var69.field3861 = Statics.field3876;
                        var69.field3858 = Statics.field1222[var68];
                        var69.field3859 = Statics.field1105[var68];
                        var69.field3854 = Statics.field515[var68];
                        var69.field3857 = Statics.field1156[var68];
                        var69.field3856 = Statics.field3874;
                        var69.field3855 = Statics.field3878[var68];
                    }
                    class326.method639();
                    var66 = var67;
                } else {
                    var66 = null;
                }
                Statics.field3221 = var66;
            } else {
                var49++;
            }
            if (var49 < 11) {
                class86.field1165 = class225.field2769 + var49 * 100 / 12 + "%";
                class86.field1164 = 70;
            } else {
                Statics.field3670 = Statics.field3221;
                Statics.field27.method5696();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                Statics.field32[0].method5657(var71 + var74, var72 + var74, var73 + var74);
                class86.field1165 = class225.field2770;
                class86.field1164 = 70;
                field781 = 90;
            }
        } else if (field781 == 90) {
            if (Statics.field220.method3948()) {
                Statics.field214 = new class120(Statics.field220, Statics.field70, 20, 0.8D, field637 ? 64 : 128);
                class131.method2884(Statics.field214);
                class131.method2831(0.8D);
                field781 = 100;
            } else {
                class86.field1165 = class225.field2858 + "0%";
                class86.field1164 = 90;
            }
        } else if (field781 == 100) {
            int var75 = Statics.field214.method2635();
            if (var75 < 100) {
                class86.field1165 = class225.field2858 + var75 + "%";
                class86.field1164 = 90;
            } else {
                class86.field1165 = class225.field2772;
                class86.field1164 = 90;
                field781 = 110;
            }
        } else if (field781 == 110) {
            Statics.field16 = new class64();
            Statics.field447.method3260(Statics.field16, 10);
            class86.field1165 = class225.field2773;
            class86.field1164 = 92;
            field781 = 120;
        } else if (field781 == 120) {
            if (Statics.field262.method3895("huffman", "")) {
                class210 var76 = new class210(Statics.field262.method3878("huffman", ""));
                class211.method4059(var76);
                class86.field1165 = class225.field2932;
                class86.field1164 = 94;
                field781 = 130;
            } else {
                class86.field1165 = class225.field2774 + "%";
                class86.field1164 = 94;
            }
        } else if (field781 == 130) {
            if (!Statics.field2500.method3948()) {
                class86.field1165 = class225.field2912 + Statics.field2500.method4000() * 4 / 5 + "%";
                class86.field1164 = 96;
            } else if (!Statics.field1878.method3948()) {
                class86.field1165 = class225.field2912 + (80 + Statics.field1878.method4000() / 6) + "%";
                class86.field1164 = 96;
            } else if (Statics.field1934.method3948()) {
                class86.field1165 = class225.field2961;
                class86.field1164 = 98;
                field781 = 140;
            } else {
                class86.field1165 = class225.field2912 + (96 + Statics.field1934.method4000() / 50) + "%";
                class86.field1164 = 96;
            }
        } else if (field781 == 140) {
            class86.field1164 = 100;
            if (Statics.field1312.method3885(class36.field289.field294)) {
                if (Statics.field1181 == null) {
                    Statics.field1181 = new class333();
                    Statics.field1181.method5871(Statics.field1312, Statics.field197, Statics.field985, Statics.field366, field842, Statics.field32);
                }
                class86.field1165 = class225.field2767;
                field781 = 150;
            } else {
                class86.field1165 = class225.field2778 + Statics.field1312.method3888(class36.field289.field294) / 10 + "%";
            }
        } else if (field781 == 150) {
            method2725(10);
        }
    }

    @ObfuscatedName("z.fv(IZZZI)Lij;")
    public static class236 method259(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2027 != null) {
            var4 = new class308(arg0, class168.field2027, Statics.field522[arg0], 1000000);
        }
        return new class236(var4, Statics.field136, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fk(I)V")
    public final void method1226() {
        class305 var1 = field679.method2181();
        class299 var2 = field679.field1285;
        try {
            if (field879 == 0) {
                if (Statics.field4008 == null && (field672.method2047() || field667 > 250)) {
                    Statics.field4008 = field672.method2050();
                    field672.method2046();
                    field672 = null;
                }
                if (Statics.field4008 != null) {
                    if (var1 != null) {
                        var1.method3292();
                        var1 = null;
                    }
                    Statics.field1153 = null;
                    field681 = false;
                    field667 = 0;
                    field879 = 1;
                }
            }
            if (field879 == 1) {
                if (Statics.field1153 == null) {
                    Statics.field1153 = Statics.field447.method3261(Statics.field328, Statics.field71);
                }
                if (Statics.field1153.field2007 == 2) {
                    throw new IOException();
                }
                if (Statics.field1153.field2007 == 1) {
                    if (field682) {
                        var1 = class305.method691((Socket) Statics.field1153.field2011, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field1153.field2011, Statics.field447, 5000);
                    }
                    field679.method2178(var1);
                    Statics.field1153 = null;
                    field879 = 2;
                }
            }
            if (field879 == 2) {
                field679.method2175();
                class188 var3;
                if (class188.field2310 == 0) {
                    var3 = new class188();
                } else {
                    var3 = class188.field2306[--class188.field2310];
                }
                var3.field2307 = null;
                var3.field2311 = 0;
                var3.field2308 = new class299(5000);
                var3.field2308.method5253(class185.field2284.field2289);
                field679.method2177(var3);
                field679.method2176();
                var2.field3694 = 0;
                field879 = 3;
            }
            if (field879 == 3) {
                if (Statics.field1122 != null) {
                    Statics.field1122.method2348();
                }
                if (Statics.field1143 != null) {
                    Statics.field1143.method2348();
                }
                boolean var7 = true;
                if (field682 && !var1.method3296(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3315();
                    if (Statics.field1122 != null) {
                        Statics.field1122.method2348();
                    }
                    if (Statics.field1143 != null) {
                        Statics.field1143.method2348();
                    }
                    if (var8 != 0) {
                        method3884(var8);
                        return;
                    }
                    var2.field3694 = 0;
                    field879 = 4;
                }
            }
            if (field879 == 4) {
                if (var2.field3694 < 8) {
                    int var9 = var1.method3291();
                    if (var9 > 8 - var2.field3694) {
                        var9 = 8 - var2.field3694;
                    }
                    if (var9 > 0) {
                        var1.method3318(var2.field3699, var2.field3694, var9);
                        var2.field3694 += var9;
                    }
                }
                if (var2.field3694 == 8) {
                    var2.field3694 = 0;
                    Statics.field578 = var2.method5129();
                    field879 = 5;
                }
            }
            if (field879 == 5) {
                field679.field1285.field3694 = 0;
                field679.method2175();
                class299 var10 = new class299(500);
                int[] var11 = new int[] { Statics.field4008.nextInt(), Statics.field4008.nextInt(), Statics.field4008.nextInt(), Statics.field4008.nextInt() };
                var10.field3694 = 0;
                var10.method5253(1);
                var10.method5262(var11[0]);
                var10.method5262(var11[1]);
                var10.method5262(var11[2]);
                var10.method5262(var11[3]);
                var10.method5208(Statics.field578);
                if (field640 == 40) {
                    var10.method5262(Statics.field2075[0]);
                    var10.method5262(Statics.field2075[1]);
                    var10.method5262(Statics.field2075[2]);
                    var10.method5262(Statics.field2075[3]);
                } else {
                    var10.method5253(field851.method33());
                    switch(field851.field1984) {
                        case 0:
                        case 1:
                            var10.method5109(Statics.field2492);
                            var10.field3694++;
                            break;
                        case 2:
                            var10.method5262((Integer) Statics.field562.field1039.get(class291.method76(class86.field1173)));
                            break;
                        case 3:
                            var10.field3694 += 4;
                    }
                    var10.method5253(class313.field3800.method33());
                    var10.method5114(class86.field1174);
                }
                var10.method5145(class84.field1145, class84.field1146);
                Statics.field2075 = var11;
                class188 var12;
                if (class188.field2310 == 0) {
                    var12 = new class188();
                } else {
                    var12 = class188.field2306[--class188.field2310];
                }
                var12.field2307 = null;
                var12.field2311 = 0;
                var12.field2308 = new class299(5000);
                var12.field2308.field3694 = 0;
                if (field640 == 40) {
                    var12.field2308.method5253(class185.field2287.field2289);
                } else {
                    var12.field2308.method5253(class185.field2286.field2289);
                }
                var12.field2308.method5128(0);
                int var16 = var12.field2308.field3694;
                var12.field2308.method5262(185);
                var12.field2308.method5262(1);
                var12.field2308.method5253(field709);
                var12.field2308.method5238(var10.field3699, 0, var10.field3694);
                int var17 = var12.field2308.field3694;
                var12.field2308.method5114(class86.field1173);
                var12.field2308.method5253((field846 ? 1 : 0) << 1 | (field637 ? 1 : 0));
                var12.field2308.method5128(Statics.field3628);
                var12.field2308.method5128(Statics.field3243);
                class299 var18 = var12.field2308;
                if (field673 == null) {
                    byte[] var19 = new byte[24];
                    try {
                        class168.field2026.method6147(0L);
                        class168.field2026.method6152(var19);
                        int var20;
                        for (var20 = 0; var20 < 24 && var19[var20] == 0; var20++) {
                        }
                        if (var20 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var51) {
                        for (int var22 = 0; var22 < 24; var22++) {
                            var19[var22] = -1;
                        }
                    }
                    var18.method5238(var19, 0, var19.length);
                } else {
                    var18.method5238(field673, 0, field673.length);
                }
                var12.field2308.method5114(Statics.field1995);
                var12.field2308.method5262(Statics.field4042);
                class300 var25 = new class300(Statics.field2533.method5852());
                Statics.field2533.method5851(var25);
                var12.field2308.method5238(var25.field3699, 0, var25.field3699.length);
                var12.field2308.method5253(field709);
                var12.field2308.method5262(0);
                var12.field2308.method5262(Statics.field1979.field3126);
                var12.field2308.method5262(Statics.field2291.field3126);
                var12.field2308.method5262(Statics.field286.field3126);
                var12.field2308.method5262(Statics.field2500.field3126);
                var12.field2308.method5262(Statics.field3111.field3126);
                var12.field2308.method5262(Statics.field165.field3126);
                var12.field2308.method5262(Statics.field2532.field3126);
                var12.field2308.method5262(Statics.field2322.field3126);
                var12.field2308.method5262(Statics.field70.field3126);
                var12.field2308.method5262(Statics.field220.field3126);
                var12.field2308.method5262(Statics.field262.field3126);
                var12.field2308.method5262(Statics.field1438.field3126);
                var12.field2308.method5262(Statics.field1878.field3126);
                var12.field2308.method5262(Statics.field1934.field3126);
                var12.field2308.method5262(Statics.field2355.field3126);
                var12.field2308.method5262(Statics.field2508.field3126);
                var12.field2308.method5262(0);
                var12.field2308.method5262(Statics.field3894.field3126);
                var12.field2308.method5262(Statics.field197.field3126);
                var12.field2308.method5262(Statics.field1312.field3126);
                var12.field2308.method5262(Statics.field985.field3126);
                var12.field2308.method5280(var11, var17, var12.field2308.field3694);
                var12.field2308.method5289(var12.field2308.field3694 - var16);
                field679.method2177(var12);
                field679.method2176();
                field679.field1284 = new class328(var11);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var11[var27] + 50;
                }
                var2.method5066(var26);
                field879 = 6;
            }
            if (field879 == 6 && var1.method3291() > 0) {
                int var28 = var1.method3315();
                if (var28 == 21 && field640 == 20) {
                    field879 = 9;
                } else if (var28 == 2) {
                    field879 = 11;
                } else if (var28 == 15 && field640 == 40) {
                    field679.field1289 = -1;
                    field879 = 16;
                } else if (var28 == 64) {
                    field879 = 7;
                } else if (var28 == 23 && field668 < 1) {
                    field668++;
                    field879 = 0;
                } else if (var28 == 29) {
                    field879 = 14;
                } else {
                    method3884(var28);
                    return;
                }
            }
            if (field879 == 7 && var1.method3291() > 0) {
                Statics.field330 = var1.method3315();
                field879 = 8;
            }
            if (field879 == 8 && var1.method3291() >= Statics.field330) {
                var1.method3318(var2.field3699, 0, Statics.field330);
                var2.field3694 = 0;
                field879 = 6;
            }
            if (field879 == 9 && var1.method3291() > 0) {
                field669 = (var1.method3315() + 3) * 60;
                field879 = 10;
            }
            if (field879 == 10) {
                field667 = 0;
                class86.method118(class225.field2785, class225.field2792, field669 / 60 + class225.field2787);
                if (--field669 <= 0) {
                    field879 = 0;
                }
            } else {
                if (field879 == 11 && var1.method3291() >= 1) {
                    Statics.field400 = var1.method3315();
                    field879 = 12;
                }
                if (field879 == 12 && var1.method3291() >= Statics.field400) {
                    boolean var29 = var1.method3315() == 1;
                    var1.method3318(var2.field3699, 0, 4);
                    var2.field3694 = 0;
                    boolean var30 = false;
                    if (var29) {
                        int var31 = var2.method5069() << 24;
                        int var32 = var31 | var2.method5069() << 16;
                        int var33 = var32 | var2.method5069() << 8;
                        int var34 = var33 | var2.method5069();
                        int var35 = class291.method76(class86.field1173);
                        if (Statics.field562.field1039.size() >= 10 && !Statics.field562.field1039.containsKey(var35)) {
                            Iterator var36 = Statics.field562.field1039.entrySet().iterator();
                            var36.next();
                            var36.remove();
                        }
                        Statics.field562.field1039.put(var35, var34);
                    }
                    if (field671) {
                        Statics.field562.field1036 = class86.field1173;
                    } else {
                        Statics.field562.field1036 = null;
                    }
                    class74.method4291();
                    field755 = var1.method3315();
                    field803 = var1.method3315() == 1;
                    field738 = var1.method3315();
                    field738 <<= 0x8;
                    field738 += var1.method3315();
                    field750 = var1.method3315();
                    var1.method3318(var2.field3699, 0, 1);
                    var2.field3694 = 0;
                    class183[] var37 = class183.method1053();
                    int var38 = var2.method5071();
                    if (var38 < 0 || var38 >= var37.length) {
                        throw new IOException(var38 + " " + var2.field3694);
                    }
                    field679.field1286 = var37[var38];
                    field679.field1289 = field679.field1286.field2179;
                    var1.method3318(var2.field3699, 0, 2);
                    var2.field3694 = 0;
                    field679.field1289 = var2.method5166();
                    try {
                        class48.method749(Statics.field257, "zap");
                    } catch (Throwable var50) {
                    }
                    field879 = 13;
                }
                if (field879 != 13) {
                    if (field879 == 14 && var1.method3291() >= 2) {
                        var2.field3694 = 0;
                        var1.method3318(var2.field3699, 0, 2);
                        var2.field3694 = 0;
                        Statics.field93 = var2.method5166();
                        field879 = 15;
                    }
                    if (field879 == 15 && var1.method3291() >= Statics.field93) {
                        var2.field3694 = 0;
                        var1.method3318(var2.field3699, 0, Statics.field93);
                        var2.field3694 = 0;
                        String var40 = var2.method5132();
                        String var41 = var2.method5132();
                        String var42 = var2.method5132();
                        class86.method118(var40, var41, var42);
                        method2725(10);
                    }
                    if (field879 == 16) {
                        if (field679.field1289 == -1) {
                            if (var1.method3291() < 2) {
                                return;
                            }
                            var1.method3318(var2.field3699, 0, 2);
                            var2.field3694 = 0;
                            field679.field1289 = var2.method5166();
                        }
                        if (var1.method3291() >= field679.field1289) {
                            var1.method3318(var2.field3699, 0, field679.field1289);
                            var2.field3694 = 0;
                            int var43 = field679.field1289;
                            field683.method4672();
                            field679.method2175();
                            field679.field1285.field3694 = 0;
                            field679.field1286 = null;
                            field679.field1291 = null;
                            field679.field1287 = null;
                            field679.field1293 = null;
                            field679.field1289 = 0;
                            field679.field1292 = 0;
                            field726 = 0;
                            field769 = 0;
                            field884 = false;
                            field864 = 0;
                            field862 = 0;
                            for (int var44 = 0; var44 < 2048; var44++) {
                                field748[var44] = null;
                            }
                            Statics.field2530 = null;
                            for (int var45 = 0; var45 < field674.length; var45++) {
                                class80 var46 = field674[var45];
                                if (var46 != null) {
                                    var46.field947 = -1;
                                    var46.field952 = false;
                                }
                            }
                            class60.field526 = new class318(32);
                            method2725(30);
                            for (int var47 = 0; var47 < 100; var47++) {
                                field843[var47] = true;
                            }
                            class188 var48 = class188.method2402(class184.field2258, field679.field1284);
                            var48.field2308.method5253(method3100());
                            var48.field2308.method5128(Statics.field3628);
                            var48.field2308.method5128(Statics.field3243);
                            field679.method2177(var48);
                            class90.method1057(var2);
                            if (var2.field3694 != var43) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field667++;
                        if (field667 > 2000) {
                            if (field668 < 1) {
                                if (Statics.field71 == Statics.field2738) {
                                    Statics.field71 = Statics.field1435;
                                } else {
                                    Statics.field71 = Statics.field2738;
                                }
                                field668++;
                                field879 = 0;
                            } else {
                                method3884(-3);
                            }
                        }
                    }
                } else if (var1.method3291() >= field679.field1289) {
                    var2.field3694 = 0;
                    var1.method3318(var2.field3699, 0, field679.field1289);
                    field683.method4670();
                    method98();
                    class90.method1057(var2);
                    Statics.field141 = -1;
                    method3289(false, var2);
                    field679.field1286 = null;
                }
            }
        } catch (IOException var52) {
            if (field668 < 1) {
                if (Statics.field71 == Statics.field2738) {
                    Statics.field71 = Statics.field1435;
                } else {
                    Statics.field71 = Statics.field2738;
                }
                field668++;
                field879 = 0;
            } else {
                method3884(-2);
            }
        }
    }

    @ObfuscatedName("i.fr(I)V")
    public static void method98() {
        field644 = -1L;
        Statics.field16.field568 = 0;
        Statics.field256 = true;
        field648 = true;
        field664 = -1L;
        class97.method1981();
        field679.method2175();
        field679.field1285.field3694 = 0;
        field679.field1286 = null;
        field679.field1291 = null;
        field679.field1287 = null;
        field679.field1293 = null;
        field679.field1289 = 0;
        field679.field1292 = 0;
        field726 = 0;
        field634 = 0;
        field651 = 0;
        field769 = 0;
        field884 = false;
        class55.field460 = 0;
        class92.field1250.clear();
        class92.field1249.method5505();
        class92.field1253.method4638();
        class92.field1251 = 0;
        field785 = 0;
        field787 = false;
        field794 = 0;
        field702 = 0;
        field707 = 0;
        Statics.field31 = null;
        field864 = 0;
        field857 = -1;
        field862 = 0;
        field863 = 0;
        field659 = class85.field1151;
        field839 = class85.field1151;
        field665 = 0;
        class90.field1240 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class90.field1230[var0] = null;
            class90.field1229[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field748[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field674[var2] = null;
        }
        field759 = -1;
        field762.method4575();
        field763.method4575();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field760[var3][var4][var5] = null;
                }
            }
        }
        field761 = new class262();
        Statics.field1296.method1763();
        for (int var6 = 0; var6 < Statics.field3191; var6++) {
            class241 var7 = class241.method2125(var6);
            if (var7 != null) {
                class213.field2505[var6] = 0;
                class213.field2507[var6] = 0;
            }
        }
        Statics.field1.method2089();
        field802 = -1;
        if (field697 != -1) {
            class218.method3774(field697);
        }
        for (class62 var8 = (class62) field793.method5536(); var8 != null; var8 = (class62) field793.method5530()) {
            method1206(var8, true);
        }
        field697 = -1;
        field793 = new class318(8);
        field798 = null;
        field769 = 0;
        field884 = false;
        field797.method3737((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field739[var9] = null;
            field816[var9] = false;
        }
        class60.field526 = new class318(32);
        field773 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field843[var10] = true;
        }
        class188 var11 = class188.method2402(class184.field2258, field679.field1284);
        var11.field2308.method5253(method3100());
        var11.field2308.method5128(Statics.field3628);
        var11.field2308.method5128(Statics.field3243);
        field679.method2177(var11);
        Statics.field28 = null;
        for (int var12 = 0; var12 < 8; var12++) {
            field899[var12] = new class10();
        }
        Statics.field338 = null;
    }

    @ObfuscatedName("hq.fm(II)V")
    public static void method3884(int arg0) {
        if (arg0 == -3) {
            class86.method118(class225.field2788, class225.field2789, class225.field2803);
        } else if (arg0 == -2) {
            class86.method118(class225.field2791, class225.field2951, class225.field2817);
        } else if (arg0 == -1) {
            class86.method118(class225.field2794, class225.field2795, class225.field2796);
        } else if (arg0 == 3) {
            class86.field1177 = 3;
            class86.field1167 = 1;
        } else if (arg0 == 4) {
            class86.field1177 = 12;
            class86.field1157 = 0;
        } else if (arg0 == 5) {
            class86.field1167 = 2;
            class86.method118(class225.field2800, class225.field2801, class225.field2802);
        } else if (arg0 == 68 || !(field639 || arg0 != 6)) {
            class86.method118(class225.field2917, class225.field2804, class225.field2805);
        } else if (arg0 == 7) {
            class86.method118(class225.field2806, class225.field2848, class225.field3033);
        } else if (arg0 == 8) {
            class86.method118(class225.field2819, class225.field2810, class225.field2765);
        } else if (arg0 == 9) {
            class86.method118(class225.field2812, class225.field2813, class225.field2749);
        } else if (arg0 == 10) {
            class86.method118(class225.field2987, class225.field2816, class225.field2883);
        } else if (arg0 == 11) {
            class86.method118(class225.field2818, class225.field2859, class225.field2880);
        } else if (arg0 == 12) {
            class86.method118(class225.field2821, class225.field2822, class225.field2823);
        } else if (arg0 == 13) {
            class86.method118(class225.field2837, class225.field2825, class225.field3024);
        } else if (arg0 == 14) {
            class86.method118(class225.field2827, class225.field2781, class225.field2829);
        } else if (arg0 == 16) {
            class86.method118(class225.field2830, class225.field2881, class225.field2832);
        } else if (arg0 == 17) {
            class86.method118(class225.field2833, class225.field2834, class225.field2976);
        } else if (arg0 == 18) {
            class86.field1177 = 12;
            class86.field1157 = 1;
        } else if (arg0 == 19) {
            class86.method118(class225.field2839, class225.field3039, class225.field2841);
        } else if (arg0 == 20) {
            class86.method118(class225.field2831, class225.field2843, class225.field2844);
        } else if (arg0 == 22) {
            class86.method118(class225.field2845, class225.field2846, class225.field2847);
        } else if (arg0 == 23) {
            class86.method118(class225.field3001, class225.field2954, class225.field2896);
        } else if (arg0 == 24) {
            class86.method118(class225.field2851, class225.field2852, class225.field2853);
        } else if (arg0 == 25) {
            class86.method118(class225.field2854, class225.field2855, class225.field2820);
        } else if (arg0 == 26) {
            class86.method118(class225.field2857, class225.field2902, class225.field2924);
        } else if (arg0 == 27) {
            class86.method118(class225.field2892, class225.field2861, class225.field2862);
        } else if (arg0 == 31) {
            class86.method118(class225.field2869, class225.field3018, class225.field2744);
        } else if (arg0 == 32) {
            class86.method118(class225.field2872, class225.field2873, class225.field2874);
        } else if (arg0 == 37) {
            class86.method118(class225.field2875, class225.field2808, class225.field2877);
        } else if (arg0 == 38) {
            class86.method118(class225.field2878, class225.field2879, class225.field3005);
        } else if (arg0 == 55) {
            class86.field1177 = 8;
        } else if (arg0 == 56) {
            class86.method118(class225.field2885, class225.field2886, class225.field2870);
            method2725(11);
            return;
        } else if (arg0 == 57) {
            class86.method118(class225.field2888, class225.field2889, class225.field2964);
            method2725(11);
            return;
        } else if (arg0 == 61) {
            class86.field1177 = 7;
        } else {
            class86.method118(class225.field2901, class225.field2780, class225.field3041);
        }
        method2725(10);
    }

    @ObfuscatedName("t.fx(B)V")
    public static final void method19() {
        field679.method2179();
        class258.field3499.method3123();
        class245.method2037();
        class246.method564();
        class254.field3352.method3123();
        class254.field3340.method3123();
        class254.field3343.method3123();
        class254.field3373.method3123();
        class257.field3471.method3123();
        class257.field3462.method3123();
        class255.method1830();
        class259.method3232();
        class244.method1990();
        class249.field3285.method3123();
        class241.method291();
        class253.field3320.method3123();
        class253.field3327.method3123();
        class253.field3318.method3123();
        class247.field3271.method3123();
        class247.field3265.method3123();
        class251.field3298.method3123();
        class250.field3292.method3123();
        class242.method3581();
        class215.method3684();
        class218.field2652.method3123();
        class218.field2544.method3123();
        class218.field2545.method3123();
        class218.field2546.method3123();
        ((class120) Statics.field1749).method2614();
        class93.field1255.method3123();
        Statics.field1979.method3889();
        Statics.field2291.method3889();
        Statics.field2500.method3889();
        Statics.field3111.method3889();
        Statics.field165.method3889();
        Statics.field2532.method3889();
        Statics.field2322.method3889();
        Statics.field70.method3889();
        Statics.field220.method3889();
        Statics.field262.method3889();
        Statics.field1438.method3889();
        Statics.field1878.method3889();
        Statics.field207.method2906();
        for (int var0 = 0; var0 < 4; var0++) {
            field812[var0].method3357();
        }
        System.gc();
        class198.method1977(2);
        field866 = -1;
        field856 = false;
        class76.method967();
        method2725(10);
    }

    @ObfuscatedName("em.fc(IB)V")
    public static final void method3095(int arg0) {
        method19();
        switch(arg0) {
            case 1:
                class86.field1177 = 24;
                class86.method118(class225.field2982, class225.field2983, class225.field2984);
                break;
            case 2:
                class86.method2071();
        }
    }

    @ObfuscatedName("am.fa(I)V")
    public static final void method547() {
        if (field634 > 0) {
            method19();
        } else {
            field683.method4674();
            method2725(40);
            Statics.field500 = field679.method2181();
            field679.method2180();
        }
    }

    @ObfuscatedName("e.fj(ZB)V")
    public static final void method203(boolean arg0) {
        if (arg0) {
            field851 = class86.field1178 ? class161.field1988 : class161.field1986;
        } else {
            field851 = Statics.field562.field1039.containsKey(class291.method76(class86.field1173)) ? class161.field1987 : class161.field1983;
        }
    }

    @ObfuscatedName("client.fq(B)V")
    public final void method1509() {
        if (field726 > 1) {
            field726--;
        }
        if (field634 > 0) {
            field634--;
        }
        if (field681) {
            field681 = false;
            method547();
            return;
        }
        if (!field884) {
            method3400();
        }
        for (int var1 = 0; var1 < 100 && this.method1519(field679); var1++) {
        }
        if (field640 != 30) {
            return;
        }
        while (true) {
            class98 var2 = (class98) class97.field1298.method4509();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field683.field3569) {
                    class188 var6 = class188.method2402(class184.field2202, field679.field1284);
                    var6.field2308.method5253(0);
                    int var7 = var6.field2308.field3694;
                    field683.method4684(var6.field2308);
                    var6.field2308.method5120(var6.field2308.field3694 - var7);
                    field679.method2177(var6);
                    field683.method4671();
                }
                Object var8 = Statics.field16.field576;
                synchronized (Statics.field16.field576) {
                    if (!field792) {
                        Statics.field16.field568 = 0;
                    } else if (class55.field473 != 0 || Statics.field16.field568 >= 40) {
                        class188 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field16.field568 && (var9 == null || var9.field2308.field3694 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field16.field570[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field16.field569[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field645 != var16 || field906 != var15) {
                                if (var9 == null) {
                                    var9 = class188.method2402(class184.field2184, field679.field1284);
                                    var9.field2308.method5253(0);
                                    var10 = var9.field2308.field3694;
                                    var9.field2308.field3694 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field647 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field645;
                                    var18 = var15 - field906;
                                    var19 = (int) ((Statics.field16.field571[var14] - field647) / 20L);
                                    var12 = (int) ((Statics.field16.field571[var14] - field647) % 20L + (long) var12);
                                }
                                field645 = var16;
                                field906 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2308.method5128((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2308.method5253(var19 + 128);
                                    var9.field2308.method5128((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2308.method5253(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2308.method5262(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2308.method5262(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2308.method5128((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2308.method5262(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2308.method5262(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field647 = Statics.field16.field571[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2308.method5120(var9.field2308.field3694 - var10);
                            int var20 = var9.field2308.field3694;
                            var9.field2308.field3694 = var10;
                            var9.field2308.method5253(var12 / var13);
                            var9.field2308.method5253(var12 % var13);
                            var9.field2308.field3694 = var20;
                            field679.method2177(var9);
                        }
                        if (var11 >= Statics.field16.field568) {
                            Statics.field16.field568 = 0;
                        } else {
                            Statics.field16.field568 -= var11;
                            System.arraycopy(Statics.field16.field569, var11, Statics.field16.field569, 0, Statics.field16.field568);
                            System.arraycopy(Statics.field16.field570, var11, Statics.field16.field570, 0, Statics.field16.field568);
                            System.arraycopy(Statics.field16.field571, var11, Statics.field16.field571, 0, Statics.field16.field568);
                        }
                    }
                }
                if (class55.field473 == 1 || !Statics.field113 && class55.field473 == 4 || class55.field473 == 2) {
                    long var22 = (class55.field476 - field644) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field644 = class55.field476;
                    int var24 = class55.field469;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field3243) {
                        var24 = Statics.field3243;
                    }
                    int var25 = class55.field464;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field3628) {
                        var25 = Statics.field3628;
                    }
                    int var26 = (int) var22;
                    class188 var27 = class188.method2402(class184.field2217, field679.field1284);
                    var27.field2308.method5128((class55.field473 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2308.method5128(var25);
                    var27.field2308.method5128(var24);
                    field679.method2177(var27);
                }
                if (class46.field385 > 0) {
                    class188 var28 = class188.method2402(class184.field2188, field679.field1284);
                    var28.field2308.method5128(0);
                    int var29 = var28.field2308.field3694;
                    long var30 = class297.method3777();
                    for (int var32 = 0; var32 < class46.field385; var32++) {
                        long var33 = var30 - field664;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field664 = var30;
                        var28.field2308.method5109((int) var33);
                        var28.field2308.method5253(class46.field384[var32]);
                    }
                    var28.field2308.method5289(var28.field2308.field3694 - var29);
                    field679.method2177(var28);
                }
                if (field716 > 0) {
                    field716--;
                }
                if (class46.field387[96] || class46.field387[97] || class46.field387[98] || class46.field387[99]) {
                    field734 = true;
                }
                if (field734 && field716 <= 0) {
                    field716 = 20;
                    field734 = false;
                    class188 var35 = class188.method2402(class184.field2221, field679.field1284);
                    var35.field2308.method5158(field702);
                    var35.field2308.method5322(field704);
                    field679.method2177(var35);
                }
                if (Statics.field256 && !field648) {
                    field648 = true;
                    class188 var36 = class188.method2402(class184.field2210, field679.field1284);
                    var36.field2308.method5253(1);
                    field679.method2177(var36);
                }
                if (!Statics.field256 && field648) {
                    field648 = false;
                    class188 var37 = class188.method2402(class184.field2210, field679.field1284);
                    var37.field2308.method5253(0);
                    field679.method2177(var37);
                }
                if (Statics.field1181 != null) {
                    Statics.field1181.method5872();
                }
                method3081();
                method1045();
                if (field640 != 30) {
                    return;
                }
                for (class69 var38 = (class69) field761.method4581(); var38 != null; var38 = (class69) field761.method4589()) {
                    if (var38.field920 > 0) {
                        var38.field920--;
                    }
                    if (var38.field920 != 0) {
                        if (var38.field909 > 0) {
                            var38.field909--;
                        }
                        if (var38.field909 == 0 && var38.field911 >= 1 && var38.field912 >= 1 && var38.field911 <= 102 && var38.field912 <= 102 && (var38.field916 < 0 || class56.method5061(var38.field916, var38.field918))) {
                            method139(var38.field919, var38.field922, var38.field911, var38.field912, var38.field916, var38.field910, var38.field918);
                            var38.field909 = -1;
                            if (var38.field916 == var38.field913 && var38.field913 == -1) {
                                var38.method3386();
                            } else if (var38.field916 == var38.field913 && var38.field914 == var38.field910 && var38.field918 == var38.field915) {
                                var38.method3386();
                            }
                        }
                    } else if (var38.field913 < 0 || class56.method5061(var38.field913, var38.field915)) {
                        method139(var38.field919, var38.field922, var38.field911, var38.field912, var38.field913, var38.field914, var38.field915);
                        var38.method3386();
                    }
                }
                int var10002;
                for (int var39 = 0; var39 < field794; var39++) {
                    var10002 = field873[var39]--;
                    if (field873[var39] >= -10) {
                        class102 var41 = field875[var39];
                        if (var41 == null) {
                            class102 var10000 = (class102) null;
                            var41 = class102.method2280(Statics.field3111, field890[var39], 0);
                            if (var41 == null) {
                                continue;
                            }
                            field873[var39] += var41.method2271();
                            field875[var39] = var41;
                        }
                        if (field873[var39] < 0) {
                            int var48;
                            if (field874[var39] == 0) {
                                var48 = field868;
                            } else {
                                int var42 = (field874[var39] & 0xFF) * 128;
                                int var43 = field874[var39] >> 16 & 0xFF;
                                int var44 = var43 * 128 + 64 - Statics.field2530.field930;
                                if (var44 < 0) {
                                    var44 = -var44;
                                }
                                int var45 = field874[var39] >> 8 & 0xFF;
                                int var46 = var45 * 128 + 64 - Statics.field2530.field933;
                                if (var46 < 0) {
                                    var46 = -var46;
                                }
                                int var47 = var44 + var46 - 128;
                                if (var47 > var42) {
                                    field873[var39] = -100;
                                    continue;
                                }
                                if (var47 < 0) {
                                    var47 = 0;
                                }
                                var48 = field869 * (var42 - var47) / var42;
                            }
                            if (var48 > 0) {
                                class104 var49 = var41.method2270().method2320(Statics.field288);
                                class114 var50 = class114.method2511(var49, 100, var48);
                                var50.method2440(field872[var39] - 1);
                                Statics.field3248.method2214(var50);
                            }
                            field873[var39] = -100;
                        }
                    } else {
                        field794--;
                        for (int var40 = var39; var40 < field794; var40++) {
                            field890[var40] = field890[var40 + 1];
                            field875[var40] = field875[var40 + 1];
                            field872[var40] = field872[var40 + 1];
                            field873[var40] = field873[var40 + 1];
                            field874[var40] = field874[var40 + 1];
                        }
                        var39--;
                    }
                }
                if (field856 && !Statics.method2035()) {
                    if (field865 != 0 && field866 != -1) {
                        class198.method3457(Statics.field2532, field866, 0, field865, false);
                    }
                    field856 = false;
                }
                field679.field1292++;
                if (field679.field1292 > 750) {
                    method547();
                    return;
                }
                method622();
                for (int var51 = 0; var51 < field665; var51++) {
                    int var52 = field690[var51];
                    class80 var53 = field674[var52];
                    if (var53 != null) {
                        Statics.method4266(var53, var53.field1114.field3460);
                    }
                }
                method739();
                field694++;
                if (field736 != 0) {
                    field735 += 20;
                    if (field735 >= 400) {
                        field736 = 0;
                    }
                }
                if (Statics.field1166 != null) {
                    field754++;
                    if (field754 >= 15) {
                        method166(Statics.field1166);
                        Statics.field1166 = null;
                    }
                }
                class218 var54 = Statics.field1278;
                class218 var55 = Statics.field40;
                Statics.field1278 = null;
                Statics.field40 = null;
                field809 = null;
                field696 = false;
                field810 = false;
                field867 = 0;
                while (class46.method4057() && field867 < 128) {
                    if (field755 >= 2 && class46.field387[82] && Statics.field230 == 66) {
                        String var56 = "";
                        Iterator var57 = class92.field1249.iterator();
                        while (var57.hasNext()) {
                            class65 var58 = (class65) var57.next();
                            var56 = var56 + var58.field591 + ':' + var58.field586 + '\n';
                        }
                        Statics.field257.method825(var56);
                    } else if (field707 != 1 || Statics.field396 <= 0) {
                        field855[field867] = Statics.field230;
                        field854[field867] = Statics.field396;
                        field867++;
                    }
                }
                if (method1649() && class46.field387[82] && class46.field387[81] && field756 != 0) {
                    int var61 = Statics.field2530.field618 - field756;
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 3) {
                        var61 = 3;
                    }
                    if (Statics.field2530.field618 != var61) {
                        int var62 = Statics.field1961 + Statics.field2530.field924[0];
                        int var63 = Statics.field1108 + Statics.field2530.field931[0];
                        class188 var64 = class188.method2402(class184.field2229, field679.field1284);
                        var64.field2308.method5168(0);
                        var64.field2308.method5253(var61);
                        var64.field2308.method5158(var63);
                        var64.field2308.method5322(var62);
                        field679.method2177(var64);
                    }
                    field756 = 0;
                }
                if (field697 != -1) {
                    method3861(field697, 0, 0, Statics.field3628, Statics.field3243, 0, 0);
                }
                field757++;
                while (true) {
                    class63 var65;
                    class218 var66;
                    class218 var67;
                    do {
                        var65 = (class63) field814.method4579();
                        if (var65 == null) {
                            while (true) {
                                class63 var68;
                                class218 var69;
                                class218 var70;
                                do {
                                    var68 = (class63) field833.method4579();
                                    if (var68 == null) {
                                        while (true) {
                                            class63 var71;
                                            class218 var72;
                                            class218 var73;
                                            do {
                                                var71 = (class63) field831.method4579();
                                                if (var71 == null) {
                                                    this.method1369();
                                                    method3277();
                                                    if (field805 != null) {
                                                        this.method1236();
                                                    }
                                                    if (Statics.field63 != null) {
                                                        method166(Statics.field63);
                                                        field745++;
                                                        if (class55.field475 == 0) {
                                                            if (field744) {
                                                                if (Statics.field63 == Statics.field2477 && field743 != field740) {
                                                                    class218 var74 = Statics.field63;
                                                                    byte var75 = 0;
                                                                    if (field908 == 1 && var74.field2553 == 206) {
                                                                        var75 = 1;
                                                                    }
                                                                    if (var74.field2602[field743] <= 0) {
                                                                        var75 = 0;
                                                                    }
                                                                    int var76 = method3452(var74);
                                                                    boolean var77 = (var76 >> 29 & 0x1) != 0;
                                                                    if (var77) {
                                                                        int var78 = field740;
                                                                        int var79 = field743;
                                                                        var74.field2602[var79] = var74.field2602[var78];
                                                                        var74.field2674[var79] = var74.field2674[var78];
                                                                        var74.field2602[var78] = -1;
                                                                        var74.field2674[var78] = 0;
                                                                    } else if (var75 == 1) {
                                                                        int var80 = field740;
                                                                        int var81 = field743;
                                                                        while (var80 != var81) {
                                                                            if (var80 > var81) {
                                                                                var74.method3811(var80 - 1, var80);
                                                                                var80--;
                                                                            } else if (var80 < var81) {
                                                                                var74.method3811(var80 + 1, var80);
                                                                                var80++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var74.method3811(field743, field740);
                                                                    }
                                                                    class188 var82 = class188.method2402(class184.field2206, field679.field1284);
                                                                    var82.field2308.method5158(field740);
                                                                    var82.field2308.method5167(Statics.field63.field2549);
                                                                    var82.field2308.method5157(field743);
                                                                    var82.field2308.method5150(var75);
                                                                    field679.method2177(var82);
                                                                }
                                                            } else if (this.method1232()) {
                                                                this.method1233(field730, field742);
                                                            } else if (field769 > 0) {
                                                                method285(field730, field742);
                                                            }
                                                            field754 = 10;
                                                            class55.field473 = 0;
                                                            Statics.field63 = null;
                                                        } else if (field745 >= 5 && (class55.field466 > field730 + 5 || class55.field466 < field730 - 5 || class55.field467 > field742 + 5 || class55.field467 < field742 - 5)) {
                                                            field744 = true;
                                                        }
                                                    }
                                                    if (class134.method2955()) {
                                                        int var83 = class134.field1814;
                                                        int var84 = class134.field1815;
                                                        class188 var85 = class188.method2402(class184.field2244, field679.field1284);
                                                        var85.field2308.method5253(5);
                                                        var85.field2308.method5128(Statics.field1961 + var83);
                                                        var85.field2308.method5148(class46.field387[82] ? (class46.field387[81] ? 2 : 1) : 0);
                                                        var85.field2308.method5128(Statics.field1108 + var84);
                                                        field679.method2177(var85);
                                                        class134.method2984();
                                                        field733 = class55.field464;
                                                        field714 = class55.field469;
                                                        field736 = 1;
                                                        field735 = 0;
                                                        field862 = var83;
                                                        field863 = var84;
                                                    }
                                                    if (Statics.field1278 != var54) {
                                                        if (var54 != null) {
                                                            method166(var54);
                                                        }
                                                        if (Statics.field1278 != null) {
                                                            method166(Statics.field1278);
                                                        }
                                                    }
                                                    if (Statics.field40 != var55 && field784 == field783) {
                                                        if (var55 != null) {
                                                            method166(var55);
                                                        }
                                                        if (Statics.field40 != null) {
                                                            method166(Statics.field40);
                                                        }
                                                    }
                                                    if (Statics.field40 == null) {
                                                        if (field783 > 0) {
                                                            field783--;
                                                        }
                                                    } else if (field783 < field784) {
                                                        field783++;
                                                        if (field784 == field783) {
                                                            method166(Statics.field40);
                                                        }
                                                    }
                                                    if (field707 == 0) {
                                                        int var86 = Statics.field2530.field930;
                                                        int var87 = Statics.field2530.field933;
                                                        if (Statics.field3586 - var86 < -500 || Statics.field3586 - var86 > 500 || Statics.field3130 - var87 < -500 || Statics.field3130 - var87 > 500) {
                                                            Statics.field3586 = var86;
                                                            Statics.field3130 = var87;
                                                        }
                                                        if (Statics.field3586 != var86) {
                                                            Statics.field3586 += (var86 - Statics.field3586) / 16;
                                                        }
                                                        if (Statics.field3130 != var87) {
                                                            Statics.field3130 += (var87 - Statics.field3130) / 16;
                                                        }
                                                        int var88 = Statics.field3586 >> 7;
                                                        int var89 = Statics.field3130 >> 7;
                                                        int var90 = method1942(Statics.field3586, Statics.field3130, Statics.field625);
                                                        int var91 = 0;
                                                        if (var88 > 3 && var89 > 3 && var88 < 100 && var89 < 100) {
                                                            for (int var92 = var88 - 4; var92 <= var88 + 4; var92++) {
                                                                for (int var93 = var89 - 4; var93 <= var89 + 4; var93++) {
                                                                    int var94 = Statics.field625;
                                                                    if (var94 < 3 && (class56.field488[1][var92][var93] & 0x2) == 2) {
                                                                        var94++;
                                                                    }
                                                                    int var95 = var90 - class56.field482[var94][var92][var93];
                                                                    if (var95 > var91) {
                                                                        var91 = var95;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var96 = var91 * 192;
                                                        if (var96 > 98048) {
                                                            var96 = 98048;
                                                        }
                                                        if (var96 < 32768) {
                                                            var96 = 32768;
                                                        }
                                                        if (var96 > field718) {
                                                            field718 += (var96 - field718) / 24;
                                                        } else if (var96 < field718) {
                                                            field718 += (var96 - field718) / 80;
                                                        }
                                                        Statics.field498 = method1942(Statics.field2530.field930, Statics.field2530.field933, Statics.field625) - field708;
                                                    } else if (field707 == 1) {
                                                        method4964();
                                                        short var97 = -1;
                                                        if (class46.field387[33]) {
                                                            var97 = 0;
                                                        } else if (class46.field387[49]) {
                                                            var97 = 1024;
                                                        }
                                                        if (class46.field387[48]) {
                                                            if (var97 == 0) {
                                                                var97 = 1792;
                                                            } else if (var97 == 1024) {
                                                                var97 = 1280;
                                                            } else {
                                                                var97 = 1536;
                                                            }
                                                        } else if (class46.field387[50]) {
                                                            if (var97 == 0) {
                                                                var97 = 256;
                                                            } else if (var97 == 1024) {
                                                                var97 = 768;
                                                            } else {
                                                                var97 = 512;
                                                            }
                                                        }
                                                        byte var98 = 0;
                                                        if (class46.field387[35]) {
                                                            var98 = -1;
                                                        } else if (class46.field387[51]) {
                                                            var98 = 1;
                                                        }
                                                        int var99 = 0;
                                                        if (var97 >= 0 || var98 != 0) {
                                                            int var100 = class46.field387[81] ? field713 : field712;
                                                            var99 = var100 * 16;
                                                            field710 = var97;
                                                            field711 = var98;
                                                        }
                                                        if (field877 < var99) {
                                                            field877 += var99 / 8;
                                                            if (field877 > var99) {
                                                                field877 = var99;
                                                            }
                                                        } else if (field877 > var99) {
                                                            field877 = field877 * 9 / 10;
                                                        }
                                                        if (field877 > 0) {
                                                            int var101 = field877 / 16;
                                                            if (field710 >= 0) {
                                                                int var102 = field710 - Statics.field336 & 0x7FF;
                                                                int var103 = class131.field1762[var102];
                                                                int var104 = class131.field1752[var102];
                                                                Statics.field3586 += var101 * var103 / 65536;
                                                                Statics.field3130 += var101 * var104 / 65536;
                                                            }
                                                            if (field711 != 0) {
                                                                Statics.field498 += field711 * var101;
                                                                if (Statics.field498 > 0) {
                                                                    Statics.field498 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field710 = -1;
                                                            field711 = -1;
                                                        }
                                                        if (class46.field387[13]) {
                                                            method3406();
                                                        }
                                                    }
                                                    if (class55.field475 == 4 && Statics.field113) {
                                                        int var105 = class55.field467 - field695;
                                                        field661 = var105 * 2;
                                                        field695 = var105 == -1 || var105 == 1 ? class55.field467 : (field695 + class55.field467) / 2;
                                                        int var106 = field705 - class55.field466;
                                                        field852 = var106 * 2;
                                                        field705 = var106 == -1 || var106 == 1 ? class55.field466 : (field705 + class55.field466) / 2;
                                                    } else {
                                                        if (class46.field387[96]) {
                                                            field852 += (-24 - field852) / 2;
                                                        } else if (class46.field387[97]) {
                                                            field852 += (24 - field852) / 2;
                                                        } else {
                                                            field852 /= 2;
                                                        }
                                                        if (class46.field387[98]) {
                                                            field661 += (12 - field661) / 2;
                                                        } else if (class46.field387[99]) {
                                                            field661 += (-12 - field661) / 2;
                                                        } else {
                                                            field661 /= 2;
                                                        }
                                                        field695 = class55.field467;
                                                        field705 = class55.field466;
                                                    }
                                                    field702 = field852 / 2 + field702 & 0x7FF;
                                                    field704 += field661 / 2;
                                                    if (field704 < 128) {
                                                        field704 = 128;
                                                    }
                                                    if (field704 > 383) {
                                                        field704 = 383;
                                                    }
                                                    if (field834) {
                                                        method2156();
                                                    }
                                                    for (int var107 = 0; var107 < 5; var107++) {
                                                        var10002 = field881[var107]++;
                                                    }
                                                    Statics.field1.method2102();
                                                    int var108 = class55.method3166();
                                                    int var109 = class46.method18();
                                                    if (var108 > 15000 && var109 > 15000) {
                                                        field634 = 250;
                                                        class55.field460 = 14500;
                                                        class188 var110 = class188.method2402(class184.field2239, field679.field1284);
                                                        field679.method2177(var110);
                                                    }
                                                    Statics.field1296.method1778();
                                                    field679.field1290++;
                                                    if (field679.field1290 > 50) {
                                                        class188 var111 = class188.method2402(class184.field2246, field679.field1284);
                                                        field679.method2177(var111);
                                                    }
                                                    try {
                                                        field679.method2176();
                                                    } catch (IOException var113) {
                                                        method547();
                                                    }
                                                    return;
                                                }
                                                var72 = var71.field560;
                                                if (var72.field2550 < 0) {
                                                    break;
                                                }
                                                var73 = class218.method3416(var72.field2673);
                                            } while (var73 == null || var73.field2679 == null || var72.field2550 >= var73.field2679.length || var73.field2679[var72.field2550] != var72);
                                            class77.method165(var71);
                                        }
                                    }
                                    var69 = var68.field560;
                                    if (var69.field2550 < 0) {
                                        break;
                                    }
                                    var70 = class218.method3416(var69.field2673);
                                } while (var70 == null || var70.field2679 == null || var69.field2550 >= var70.field2679.length || var70.field2679[var69.field2550] != var69);
                                class77.method165(var68);
                            }
                        }
                        var66 = var65.field560;
                        if (var66.field2550 < 0) {
                            break;
                        }
                        var67 = class218.method3416(var66.field2673);
                    } while (var67 == null || var67.field2679 == null || var66.field2550 >= var67.field2679.length || var67.field2679[var66.field2550] != var66);
                    class77.method165(var65);
                }
            }
            class188 var4 = class188.method2402(class184.field2276, field679.field1284);
            var4.field2308.method5253(0);
            int var5 = var4.field2308.field3694;
            class97.method532(var4.field2308);
            var4.field2308.method5120(var4.field2308.field3694 - var5);
            field679.method2177(var4);
        }
    }

    @ObfuscatedName("cb.fz(I)V")
    public static final void method2168() {
        if (Statics.field1143 != null) {
            Statics.field1143.method2347();
        }
        if (Statics.field1122 != null) {
            Statics.field1122.method2347();
        }
    }

    @ObfuscatedName("dh.fb(Liv;IIII)V")
    public static void method2727(class259 arg0, int arg1, int arg2, int arg3) {
        if (field794 >= 50 || field869 == 0 || arg0.field3512 == null || arg1 >= arg0.field3512.length) {
            return;
        }
        int var4 = arg0.field3512[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field890[field794] = var5;
        field872[field794] = var6;
        field873[field794] = 0;
        field875[field794] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field874[field794] = (var8 << 16) + (var9 << 8) + var7;
        field794++;
    }

    @ObfuscatedName("ge.fd(IIII)V")
    public static void method3414(int arg0, int arg1, int arg2) {
        if (field868 == 0 || arg1 == 0 || field794 >= 50) {
            return;
        }
        field890[field794] = arg0;
        field872[field794] = arg1;
        field873[field794] = arg2;
        field875[field794] = null;
        field874[field794] = 0;
        field794++;
    }

    @ObfuscatedName("am.fo(II)V")
    public static void method563(int arg0) {
        if (arg0 == -1 && !field856) {
            Statics.field2375.method3478();
            class198.field2378 = 1;
            Statics.field3280 = null;
        } else if (arg0 != -1 && field866 != arg0 && field865 != 0 && !field856) {
            Statics.method221(2, Statics.field2532, arg0, 0, field865, false);
        }
        field866 = arg0;
    }

    @ObfuscatedName("au.ga(IIB)V")
    public static void method692(int arg0, int arg1) {
        if (field865 != 0 && arg0 != -1) {
            class198.method3457(Statics.field1438, arg0, 0, field865, false);
            field856 = true;
        }
    }

    @ObfuscatedName("ef.gx(B)V")
    public static final void method3081() {
        if (!Statics.field3596) {
            return;
        }
        if (Statics.field28 != null) {
            Statics.field28.method4767();
        }
        method258();
        Statics.field3596 = false;
    }

    @ObfuscatedName("bx.gs(S)V")
    public static final void method1045() {
        if (Statics.field625 == field857) {
            return;
        }
        field857 = Statics.field625;
        int var0 = Statics.field625;
        int[] var1 = Statics.field1593.field3866;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field488[var0][var6][var4] & 0x18) == 0) {
                    Statics.field207.method2969(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class56.field488[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field207.method2969(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1593.method5697();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field488[var0][var10][var9] & 0x18) == 0) {
                    method397(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class56.field488[var0 + 1][var10][var9] & 0x8) != 0) {
                    method397(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field858 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field207.method2956(Statics.field625, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method3196(var13);
                    int var16 = class254.method3848(var15).field3366;
                    if (var16 >= 0) {
                        field861[field858] = class242.method1149(var16).method4099(false);
                        field859[field858] = var11;
                        field860[field858] = var12;
                        field858++;
                    }
                }
            }
        }
        Statics.field155.method5649();
    }

    @ObfuscatedName("w.ge(Lhi;III)V")
    public static final void method297(class218 arg0, int arg1, int arg2) {
        if (field864 != 0 && field864 != 3 || field884 || !(class55.field473 == 1 || !Statics.field113 && class55.field473 == 4)) {
            return;
        }
        class212 var3 = arg0.method3790(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field464 - arg1;
        int var5 = class55.field469 - arg2;
        if (!var3.method3708(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2498 / 2;
        int var7 = var5 - var3.field2501 / 2;
        int var8 = field702 & 0x7FF;
        int var9 = class131.field1762[var8];
        int var10 = class131.field1752[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2530.field930 + var11 >> 7;
        int var14 = Statics.field2530.field933 - var12 >> 7;
        class188 var15 = class188.method2402(class184.field2267, field679.field1284);
        var15.field2308.method5253(18);
        var15.field2308.method5128(Statics.field1961 + var13);
        var15.field2308.method5148(class46.field387[82] ? (class46.field387[81] ? 2 : 1) : 0);
        var15.field2308.method5128(Statics.field1108 + var14);
        var15.field2308.method5253(var6);
        var15.field2308.method5253(var7);
        var15.field2308.method5128(field702);
        var15.field2308.method5253(57);
        var15.field2308.method5253(0);
        var15.field2308.method5253(0);
        var15.field2308.method5253(89);
        var15.field2308.method5128(Statics.field2530.field930);
        var15.field2308.method5128(Statics.field2530.field933);
        var15.field2308.method5253(63);
        field679.method2177(var15);
        field862 = var13;
        field863 = var14;
    }

    @ObfuscatedName("ay.gu(I)V")
    public static final void method739() {
        int[] var0 = class90.field1232;
        for (int var1 = 0; var1 < class90.field1240; var1++) {
            class67 var2 = field748[var0[var1]];
            if (var2 != null && var2.field951 > 0) {
                var2.field951--;
                if (var2.field951 == 0) {
                    var2.field948 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field665; var3++) {
            int var4 = field690[var3];
            class80 var5 = field674[var4];
            if (var5 != null && var5.field951 > 0) {
                var5.field951--;
                if (var5.field951 == 0) {
                    var5.field948 = null;
                }
            }
        }
    }

    @ObfuscatedName("gg.gk(Ljava/lang/String;B)V")
    public static final void method3578(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field562.field1037 = !Statics.field562.field1037;
            class74.method4291();
            if (Statics.field562.field1037) {
                class92.method522(99, "", "Roofs are now all hidden");
            } else {
                class92.method522(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field649 = !field649;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field751 = !field751;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field780 = !field780;
        }
        if (field755 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1181.field4001 = !Statics.field1181.field4001;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field649 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field649 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method547();
            }
        }
        class188 var1 = class188.method2402(class184.field2214, field679.field1284);
        var1.field2308.method5253(arg0.length() + 1);
        var1.field2308.method5114(arg0);
        field679.method2177(var1);
    }

    @ObfuscatedName("cj.gn(S)V")
    public static final void method2156() {
        int var0 = Statics.field89 * 128 + 64;
        int var1 = Statics.field361 * 128 + 64;
        int var2 = method1942(var0, var1, Statics.field625) - Statics.field232;
        if (Statics.field1922 < var0) {
            Statics.field1922 += Statics.field1069 * (var0 - Statics.field1922) / 1000 + Statics.field324;
            if (Statics.field1922 > var0) {
                Statics.field1922 = var0;
            }
        }
        if (Statics.field1922 > var0) {
            Statics.field1922 -= Statics.field1069 * (Statics.field1922 - var0) / 1000 + Statics.field324;
            if (Statics.field1922 < var0) {
                Statics.field1922 = var0;
            }
        }
        if (Statics.field95 < var2) {
            Statics.field95 += Statics.field1069 * (var2 - Statics.field95) / 1000 + Statics.field324;
            if (Statics.field95 > var2) {
                Statics.field95 = var2;
            }
        }
        if (Statics.field95 > var2) {
            Statics.field95 -= Statics.field1069 * (Statics.field95 - var2) / 1000 + Statics.field324;
            if (Statics.field95 < var2) {
                Statics.field95 = var2;
            }
        }
        if (Statics.field80 < var1) {
            Statics.field80 += Statics.field1069 * (var1 - Statics.field80) / 1000 + Statics.field324;
            if (Statics.field80 > var1) {
                Statics.field80 = var1;
            }
        }
        if (Statics.field80 > var1) {
            Statics.field80 -= Statics.field1069 * (Statics.field80 - var1) / 1000 + Statics.field324;
            if (Statics.field80 < var1) {
                Statics.field80 = var1;
            }
        }
        int var3 = Statics.field3584 * 128 + 64;
        int var4 = Statics.field402 * 128 + 64;
        int var5 = method1942(var3, var4, Statics.field625) - Statics.field1714;
        int var6 = var3 - Statics.field1922;
        int var7 = var5 - Statics.field95;
        int var8 = var4 - Statics.field80;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field3278 < var10) {
            Statics.field3278 += Statics.field511 * (var10 - Statics.field3278) / 1000 + Statics.field2037;
            if (Statics.field3278 > var10) {
                Statics.field3278 = var10;
            }
        }
        if (Statics.field3278 > var10) {
            Statics.field3278 -= Statics.field511 * (Statics.field3278 - var10) / 1000 + Statics.field2037;
            if (Statics.field3278 < var10) {
                Statics.field3278 = var10;
            }
        }
        int var12 = var11 - Statics.field336;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field336 += Statics.field511 * var12 / 1000 + Statics.field2037;
            Statics.field336 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field336 -= Statics.field511 * -var12 / 1000 + Statics.field2037;
            Statics.field336 &= 0x7FF;
        }
        int var13 = var11 - Statics.field336;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field336 = var11;
        }
    }

    @ObfuscatedName("aj.gf(B)V")
    public static final void method622() {
        int var0 = class90.field1240;
        int[] var1 = class90.field1232;
        for (int var2 = 0; var2 < var0; var2++) {
            class67 var3 = field748[var1[var2]];
            if (var3 != null) {
                Statics.method4266(var3, 1);
            }
        }
    }

    @ObfuscatedName("y.gt(Lbz;I)V")
    public static final void method307(class70 arg0) {
        int var1 = arg0.field926 - field643;
        int var2 = arg0.field967 * 128 + arg0.field928 * 64;
        int var3 = arg0.field980 * 128 + arg0.field928 * 64;
        arg0.field930 += (var2 - arg0.field930) / var1;
        arg0.field933 += (var3 - arg0.field933) / var1;
        arg0.field983 = 0;
        arg0.field927 = arg0.field973;
    }

    @ObfuscatedName("ef.gm(Lbz;I)V")
    public static final void method3080(class70 arg0) {
        arg0.field954 = arg0.field965;
        if (arg0.field979 == 0) {
            arg0.field983 = 0;
            return;
        }
        if (arg0.field957 != -1 && arg0.field960 == 0) {
            class259 var1 = class259.method3856(arg0.field957);
            if (arg0.field984 > 0 && var1.field3505 == 0) {
                arg0.field983++;
                return;
            }
            if (arg0.field984 <= 0 && var1.field3514 == 0) {
                arg0.field983++;
                return;
            }
        }
        int var2 = arg0.field930;
        int var3 = arg0.field933;
        int var4 = arg0.field924[arg0.field979 - 1] * 128 + arg0.field928 * 64;
        int var5 = arg0.field931[arg0.field979 - 1] * 128 + arg0.field928 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field927 = 1280;
            } else if (var3 > var5) {
                arg0.field927 = 1792;
            } else {
                arg0.field927 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field927 = 768;
            } else if (var3 > var5) {
                arg0.field927 = 256;
            } else {
                arg0.field927 = 512;
            }
        } else if (var3 < var5) {
            arg0.field927 = 1024;
        } else if (var3 > var5) {
            arg0.field927 = 0;
        }
        byte var6 = arg0.field982[arg0.field979 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field930 = var4;
            arg0.field933 = var5;
            arg0.field979--;
            if (arg0.field984 > 0) {
                arg0.field984--;
            }
            return;
        }
        int var7 = arg0.field927 - arg0.field944 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field934;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field976;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field936;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field969;
        }
        if (var8 == -1) {
            var8 = arg0.field976;
        }
        arg0.field954 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class80) {
            var10 = ((class80) arg0).field1114.field3488;
        }
        if (var10) {
            if (arg0.field944 != arg0.field927 && arg0.field947 == -1 && arg0.field978 != 0) {
                var9 = 2;
            }
            if (arg0.field979 > 2) {
                var9 = 6;
            }
            if (arg0.field979 > 3) {
                var9 = 8;
            }
            if (arg0.field983 > 0 && arg0.field979 > 1) {
                var9 = 8;
                arg0.field983--;
            }
        } else {
            if (arg0.field979 > 1) {
                var9 = 6;
            }
            if (arg0.field979 > 2) {
                var9 = 8;
            }
            if (arg0.field983 > 0 && arg0.field979 > 1) {
                var9 = 8;
                arg0.field983--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field976 == arg0.field954 && arg0.field937 != -1) {
            arg0.field954 = arg0.field937;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field930 += var9;
                if (arg0.field930 > var4) {
                    arg0.field930 = var4;
                }
            } else if (var2 > var4) {
                arg0.field930 -= var9;
                if (arg0.field930 < var4) {
                    arg0.field930 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field933 += var9;
                if (arg0.field933 > var5) {
                    arg0.field933 = var5;
                }
            } else if (var3 > var5) {
                arg0.field933 -= var9;
                if (arg0.field933 < var5) {
                    arg0.field933 = var5;
                }
            }
        }
        if (arg0.field930 == var4 && arg0.field933 == var5) {
            arg0.field979--;
            if (arg0.field984 > 0) {
                arg0.field984--;
            }
        }
    }

    @ObfuscatedName("bz.gj(Lbz;S)V")
    public static final void method1665(class70 arg0) {
        if (arg0.field978 == 0) {
            return;
        }
        if (arg0.field947 != -1) {
            class70 var1 = null;
            if (arg0.field947 < 32768) {
                var1 = field674[arg0.field947];
            } else if (arg0.field947 >= 32768) {
                var1 = field748[arg0.field947 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field930 - var1.field930;
                int var3 = arg0.field933 - var1.field933;
                if (var2 != 0 || var3 != 0) {
                    arg0.field927 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field952) {
                arg0.field947 = -1;
                arg0.field952 = false;
            }
        }
        if (arg0.field935 != -1 && (arg0.field979 == 0 || arg0.field983 > 0)) {
            arg0.field927 = arg0.field935;
            arg0.field935 = -1;
        }
        int var4 = arg0.field927 - arg0.field944 & 0x7FF;
        if (var4 == 0 && arg0.field952) {
            arg0.field947 = -1;
            arg0.field952 = false;
        }
        if (var4 == 0) {
            arg0.field949 = 0;
            return;
        }
        arg0.field949++;
        if (var4 > 1024) {
            arg0.field944 -= arg0.field978;
            boolean var5 = true;
            if (var4 < arg0.field978 || var4 > 2048 - arg0.field978) {
                arg0.field944 = arg0.field927;
                var5 = false;
            }
            if (arg0.field965 == arg0.field954 && (arg0.field949 > 25 || var5)) {
                if (arg0.field925 == -1) {
                    arg0.field954 = arg0.field976;
                } else {
                    arg0.field954 = arg0.field925;
                }
            }
        } else {
            arg0.field944 += arg0.field978;
            boolean var6 = true;
            if (var4 < arg0.field978 || var4 > 2048 - arg0.field978) {
                arg0.field944 = arg0.field927;
                var6 = false;
            }
            if (arg0.field965 == arg0.field954 && (arg0.field949 > 25 || var6)) {
                if (arg0.field932 == -1) {
                    arg0.field954 = arg0.field976;
                } else {
                    arg0.field954 = arg0.field932;
                }
            }
        }
        arg0.field944 &= 0x7FF;
    }

    @ObfuscatedName("fh.gy(I)V")
    public static void method3277() {
        if (Statics.field1181 != null) {
            Statics.field1181.method5882(Statics.field625, (Statics.field2530.field930 >> 7) + Statics.field1961, (Statics.field2530.field933 >> 7) + Statics.field1108, false);
            Statics.field1181.method6001();
        }
    }

    @ObfuscatedName("be.go(Lbj;IIB)V")
    public static void method1107(class67 arg0, int arg1, int arg2) {
        if (arg0.field957 == arg1 && arg1 != -1) {
            int var3 = class259.method3856(arg1).field3522;
            if (var3 == 1) {
                arg0.field958 = 0;
                arg0.field959 = 0;
                arg0.field960 = arg2;
                arg0.field961 = 0;
            }
            if (var3 == 2) {
                arg0.field961 = 0;
            }
        } else if (arg1 == -1 || arg0.field957 == -1 || class259.method3856(arg1).field3520 >= class259.method3856(arg0.field957).field3520) {
            arg0.field957 = arg1;
            arg0.field958 = 0;
            arg0.field959 = 0;
            arg0.field960 = arg2;
            arg0.field961 = 0;
            arg0.field984 = arg0.field979;
        }
    }

    @ObfuscatedName("ei.gp(I)I")
    public static int method3100() {
        return field846 ? 2 : 1;
    }

    @ObfuscatedName("kq.gh(II)V")
    public static void method4962(int arg0) {
        field737 = 0L;
        if (arg0 >= 2) {
            field846 = true;
        } else {
            field846 = false;
        }
        if (method3100() == 1) {
            Statics.field257.method895(765, 503);
        } else {
            Statics.field257.method895(7680, 2160);
        }
        if (field640 < 25) {
            return;
        }
        class188 var1 = class188.method2402(class184.field2258, field679.field1284);
        var1.field2308.method5253(method3100());
        var1.field2308.method5128(Statics.field3628);
        var1.field2308.method5128(Statics.field3243);
        field679.method2177(var1);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method829() {
        field737 = class297.method3777() + 500L;
        this.method1228();
        if (field697 != -1) {
            this.method1234(true);
        }
    }

    @ObfuscatedName("client.gg(S)V")
    public void method1228() {
        int var1 = Statics.field3628;
        int var2 = Statics.field3243;
        if (this.field440 < var1) {
            int var3 = this.field440;
        }
        if (this.field433 < var2) {
            int var4 = this.field433;
        }
        if (Statics.field562 == null) {
            return;
        }
        try {
            client var5 = Statics.field257;
            Object[] var6 = new Object[] { method3100() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gq(B)V")
    public final void method1263() {
        if (field697 != -1) {
            method286(field697);
        }
        for (int var1 = 0; var1 < field811; var1++) {
            if (field843[var1]) {
                field838[var1] = true;
            }
            field632[var1] = field843[var1];
            field843[var1] = false;
        }
        field836 = field643;
        field724 = -1;
        field782 = -1;
        Statics.field2477 = null;
        if (field697 != -1) {
            field811 = 0;
            method1099(field697, 0, 0, Statics.field3628, Statics.field3243, 0, 0, -1);
        }
        class321.method5577();
        if (field650) {
            if (field736 == 1) {
                Statics.field1514[field735 / 100].method5686(field733 - 8, field714 - 8);
            }
            if (field736 == 2) {
                Statics.field1514[field735 / 100 + 4].method5686(field733 - 8, field714 - 8);
            }
        }
        if (field884) {
            method304();
        } else if (field724 != -1) {
            int var2 = field724;
            int var3 = field782;
            if ((field769 >= 2 || field785 != 0 || field787) && field780) {
                int var4 = method193();
                String var5;
                if (field785 == 1 && field769 < 2) {
                    var5 = class225.field2897 + class225.field2907 + field786 + " " + class82.field1132;
                } else if (field787 && field769 < 2) {
                    var5 = field790 + class225.field2907 + field902 + " " + class82.field1132;
                } else {
                    var5 = Statics.method1142(var4);
                }
                if (field769 > 2) {
                    var5 = var5 + class82.method3907(16777215) + " " + '/' + " " + (field769 - 2) + class225.field2840;
                }
                Statics.field366.method4994(var5, var2 + 4, var3 + 15, 16777215, 0, field643 / 1000);
            }
        }
        if (field844 == 3) {
            for (int var6 = 0; var6 < field811; var6++) {
                if (field632[var6]) {
                    class321.method5584(field840[var6], field841[var6], field828[var6], field727[var6], 16711935, 128);
                } else if (field838[var6]) {
                    class321.method5584(field840[var6], field841[var6], field828[var6], field727[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field625;
        int var8 = Statics.field2530.field930;
        int var9 = Statics.field2530.field933;
        int var10 = field694;
        for (class76 var11 = (class76) class76.field1051.method4581(); var11 != null; var11 = (class76) class76.field1051.method4589()) {
            if (var11.field1056 != -1 || var11.field1049 != null) {
                int var12 = 0;
                if (var8 > var11.field1061) {
                    var12 += var8 - var11.field1061;
                } else if (var8 < var11.field1060) {
                    var12 += var11.field1060 - var8;
                }
                if (var9 > var11.field1054) {
                    var12 += var9 - var11.field1054;
                } else if (var9 < var11.field1052) {
                    var12 += var11.field1052 - var9;
                }
                if (var12 - 64 > var11.field1053 || field869 == 0 || var11.field1050 != var7) {
                    if (var11.field1057 != null) {
                        Statics.field3248.method2211(var11.field1057);
                        var11.field1057 = null;
                    }
                    if (var11.field1062 != null) {
                        Statics.field3248.method2211(var11.field1062);
                        var11.field1062 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field869 * (var11.field1053 - var12) / var11.field1053;
                    class102 var10000;
                    if (var11.field1057 != null) {
                        var11.field1057.method2446(var13);
                    } else if (var11.field1056 >= 0) {
                        var10000 = (class102) null;
                        class102 var14 = class102.method2280(Statics.field3111, var11.field1056, 0);
                        if (var14 != null) {
                            class104 var15 = var14.method2270().method2320(Statics.field288);
                            class114 var16 = class114.method2511(var15, 100, var13);
                            var16.method2440(-1);
                            Statics.field3248.method2214(var16);
                            var11.field1057 = var16;
                        }
                    }
                    if (var11.field1062 != null) {
                        var11.field1062.method2446(var13);
                        if (!var11.field1062.method3388()) {
                            var11.field1062 = null;
                        }
                    } else if (var11.field1049 != null && (var11.field1055 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field1049.length);
                        var10000 = (class102) null;
                        class102 var18 = class102.method2280(Statics.field3111, var11.field1049[var17], 0);
                        if (var18 != null) {
                            class104 var19 = var18.method2270().method2320(Statics.field288);
                            class114 var20 = class114.method2511(var19, 100, var13);
                            var20.method2440(0);
                            Statics.field3248.method2214(var20);
                            var11.field1062 = var20;
                            var11.field1055 = var11.field1058 + (int) (Math.random() * (double) (var11.field1059 - var11.field1058));
                        }
                    }
                }
            }
        }
        field694 = 0;
    }

    @ObfuscatedName("c.gr(Ljava/lang/String;ZI)V")
    public static final void method79(String arg0, boolean arg1) {
        if (!field747) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3139.method4984(arg0, 250);
        int var6 = Statics.field3139.method4985(arg0, 250) * 13;
        class321.method5585(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5620(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3139.method4992(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1995(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field155.method804(0, 0);
        } else {
            method247(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ei.gz(IIIII)V")
    public static final void method3101(int arg0, int arg1, int arg2, int arg3) {
        field717++;
        Statics.method3093();
        method3855();
        method4103();
        method681(true);
        method394();
        method681(false);
        method998();
        method4963();
        method3686(arg0, arg1, arg2, arg3, true);
        int var4 = field706;
        int var5 = field638;
        int var6 = field892;
        int var7 = field893;
        class321.method5578(var4, var5, var4 + var6, var5 + var7);
        class131.method2829();
        if (!field834) {
            int var8 = field704;
            if (field718 / 256 > var8) {
                var8 = field718 / 256;
            }
            if (field642[4] && field796[4] + 128 > var8) {
                var8 = field796[4] + 128;
            }
            int var9 = field702 & 0x7FF;
            method151(Statics.field3586, Statics.field498, Statics.field3130, var8, var9, method253(var8), var7);
        }
        int var22;
        if (field834) {
            int var23;
            if (Statics.field562.field1037) {
                var23 = Statics.field625;
            } else {
                int var24 = method1942(Statics.field1922, Statics.field80, Statics.field625);
                if (var24 - Statics.field95 >= 800 || (class56.field488[Statics.field625][Statics.field1922 >> 7][Statics.field80 >> 7] & 0x4) == 0) {
                    var23 = 3;
                } else {
                    var23 = Statics.field625;
                }
            }
            var22 = var23;
        } else {
            int var10;
            if (Statics.field562.field1037) {
                var10 = Statics.field625;
            } else {
                label446: {
                    int var11 = 3;
                    if (Statics.field3278 < 310) {
                        int var12;
                        int var13;
                        if (field707 == 1) {
                            var12 = Statics.field3586 >> 7;
                            var13 = Statics.field3130 >> 7;
                        } else {
                            var12 = Statics.field2530.field930 >> 7;
                            var13 = Statics.field2530.field933 >> 7;
                        }
                        int var14 = Statics.field1922 >> 7;
                        int var15 = Statics.field80 >> 7;
                        if (var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
                            var10 = Statics.field625;
                            break label446;
                        }
                        if (var12 < 0 || var13 < 0 || var12 >= 104 || var13 >= 104) {
                            var10 = Statics.field625;
                            break label446;
                        }
                        if ((class56.field488[Statics.field625][var14][var15] & 0x4) != 0) {
                            var11 = Statics.field625;
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
                                if ((class56.field488[Statics.field625][var14][var15] & 0x4) != 0) {
                                    var11 = Statics.field625;
                                }
                                var19 += var18;
                                if (var19 >= 65536) {
                                    var19 -= 65536;
                                    if (var15 < var13) {
                                        var15++;
                                    } else if (var15 > var13) {
                                        var15--;
                                    }
                                    if ((class56.field488[Statics.field625][var14][var15] & 0x4) != 0) {
                                        var11 = Statics.field625;
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
                                if ((class56.field488[Statics.field625][var14][var15] & 0x4) != 0) {
                                    var11 = Statics.field625;
                                }
                                var21 += var20;
                                if (var21 >= 65536) {
                                    var21 -= 65536;
                                    if (var14 < var12) {
                                        var14++;
                                    } else if (var14 > var12) {
                                        var14--;
                                    }
                                    if ((class56.field488[Statics.field625][var14][var15] & 0x4) != 0) {
                                        var11 = Statics.field625;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2530.field930 >= 0 && Statics.field2530.field933 >= 0 && Statics.field2530.field930 < 13312 && Statics.field2530.field933 < 13312) {
                        if ((class56.field488[Statics.field625][Statics.field2530.field930 >> 7][Statics.field2530.field933 >> 7] & 0x4) != 0) {
                            var11 = Statics.field625;
                        }
                        var10 = var11;
                    } else {
                        var10 = Statics.field625;
                    }
                }
            }
            var22 = var10;
        }
        int var25 = Statics.field1922;
        int var26 = Statics.field95;
        int var27 = Statics.field80;
        int var28 = Statics.field3278;
        int var29 = Statics.field336;
        for (int var30 = 0; var30 < 5; var30++) {
            if (field642[var30]) {
                int var31 = (int) (Math.random() * (double) (field878[var30] * 2 + 1) - (double) field878[var30] + Math.sin((double) field880[var30] / 100.0D * (double) field881[var30]) * (double) field796[var30]);
                if (var30 == 0) {
                    Statics.field1922 += var31;
                }
                if (var30 == 1) {
                    Statics.field95 += var31;
                }
                if (var30 == 2) {
                    Statics.field80 += var31;
                }
                if (var30 == 3) {
                    Statics.field336 = Statics.field336 + var31 & 0x7FF;
                }
                if (var30 == 4) {
                    Statics.field3278 += var31;
                    if (Statics.field3278 < 128) {
                        Statics.field3278 = 128;
                    }
                    if (Statics.field3278 > 383) {
                        Statics.field3278 = 383;
                    }
                }
            }
        }
        int var32 = class55.field466;
        int var33 = class55.field467;
        if (class55.field473 != 0) {
            var32 = class55.field464;
            var33 = class55.field469;
        }
        if (var32 >= var4 && var32 < var4 + var6 && var33 >= var5 && var33 < var5 + var7) {
            int var34 = var32 - var4;
            int var35 = var33 - var5;
            class129.field1715 = var34;
            class129.field1716 = var35;
            class129.field1723 = true;
            class129.field1722 = 0;
            class129.field1726 = false;
        } else {
            class129.field1723 = false;
            class129.field1722 = 0;
        }
        method2168();
        class321.method5585(var4, var5, var6, var7, 0);
        method2168();
        int var36 = class131.field1763;
        class131.field1763 = field894;
        Statics.field207.method2935(Statics.field1922, Statics.field95, Statics.field80, Statics.field3278, Statics.field336, var22);
        class131.field1763 = var36;
        method2168();
        Statics.field207.method3075();
        field719 = 0;
        boolean var37 = false;
        int var38 = -1;
        int var39 = -1;
        int var40 = class90.field1240;
        int[] var41 = class90.field1232;
        for (int var42 = 0; var42 < field665 + var40; var42++) {
            class70 var43;
            if (var42 < var40) {
                var43 = field748[var41[var42]];
                if (field759 == var41[var42]) {
                    var37 = true;
                    var38 = var42;
                    continue;
                }
                if (Statics.field2530 == var43) {
                    var39 = var42;
                    continue;
                }
            } else {
                var43 = field674[field690[var42 - var40]];
            }
            method5424(var43, var42, var4, var5, var6, var7);
        }
        if (field751 && var39 != -1) {
            method5424(Statics.field2530, var39, var4, var5, var6, var7);
        }
        if (var37) {
            method5424(field748[field759], var38, var4, var5, var6, var7);
        }
        for (int var44 = 0; var44 < field719; var44++) {
            int var45 = field721[var44];
            int var46 = field656[var44];
            int var47 = field675[var44];
            int var48 = field723[var44];
            boolean var49 = true;
            while (var49) {
                var49 = false;
                for (int var50 = 0; var50 < var44; var50++) {
                    if (var46 + 2 > field656[var50] - field723[var50] && var46 - var48 < field656[var50] + 2 && var45 - var47 < field721[var50] + field675[var50] && var45 + var47 > field721[var50] - field675[var50] && field656[var50] - field723[var50] < var46) {
                        var46 = field656[var50] - field723[var50];
                        var49 = true;
                    }
                }
            }
            field731 = field721[var44];
            field732 = field656[var44] = var46;
            String var51 = field728[var44];
            if (field641 == 0) {
                int var52 = 16776960;
                if (field725[var44] < 6) {
                    var52 = field830[field725[var44]];
                }
                if (field725[var44] == 6) {
                    var52 = field717 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field725[var44] == 7) {
                    var52 = field717 % 20 < 10 ? 255 : 65535;
                }
                if (field725[var44] == 8) {
                    var52 = field717 % 20 < 10 ? 45056 : 8454016;
                }
                if (field725[var44] == 9) {
                    int var53 = 150 - field700[var44];
                    if (var53 < 50) {
                        var52 = var53 * 1280 + 16711680;
                    } else if (var53 < 100) {
                        var52 = 16776960 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var52 = (var53 - 100) * 5 + 65280;
                    }
                }
                if (field725[var44] == 10) {
                    int var54 = 150 - field700[var44];
                    if (var54 < 50) {
                        var52 = var54 * 5 + 16711680;
                    } else if (var54 < 100) {
                        var52 = 16711935 - (var54 - 50) * 327680;
                    } else if (var54 < 150) {
                        var52 = (var54 - 100) * 327680 + 255 - (var54 - 100) * 5;
                    }
                }
                if (field725[var44] == 11) {
                    int var55 = 150 - field700[var44];
                    if (var55 < 50) {
                        var52 = 16777215 - var55 * 327685;
                    } else if (var55 < 100) {
                        var52 = (var55 - 50) * 327685 + 65280;
                    } else if (var55 < 150) {
                        var52 = 16777215 - (var55 - 100) * 327680;
                    }
                }
                if (field895[var44] == 0) {
                    Statics.field366.method5042(var51, field731 + var4, field732 + var5, var52, 0);
                }
                if (field895[var44] == 1) {
                    Statics.field366.method4991(var51, field731 + var4, field732 + var5, var52, 0, field717);
                }
                if (field895[var44] == 2) {
                    Statics.field366.method5055(var51, field731 + var4, field732 + var5, var52, 0, field717);
                }
                if (field895[var44] == 3) {
                    Statics.field366.method4979(var51, field731 + var4, field732 + var5, var52, 0, field717, 150 - field700[var44]);
                }
                if (field895[var44] == 4) {
                    int var56 = (150 - field700[var44]) * (Statics.field366.method4982(var51) + 100) / 150;
                    class321.method5579(field731 + var4 - 50, var5, field731 + var4 + 50, var5 + var7);
                    Statics.field366.method4987(var51, field731 + var4 + 50 - var56, field732 + var5, var52, 0);
                    class321.method5578(var4, var5, var4 + var6, var5 + var7);
                }
                if (field895[var44] == 5) {
                    int var57 = 150 - field700[var44];
                    int var58 = 0;
                    if (var57 < 25) {
                        var58 = var57 - 25;
                    } else if (var57 > 125) {
                        var58 = var57 - 125;
                    }
                    class321.method5579(var4, field732 + var5 - Statics.field366.field3661 - 1, var4 + var6, field732 + var5 + 5);
                    Statics.field366.method5042(var51, field731 + var4, field732 + var5 + var58, var52, 0);
                    class321.method5578(var4, var5, var4 + var6, var5 + var7);
                }
            } else {
                Statics.field366.method5042(var51, field731 + var4, field732 + var5, 16776960, 0);
            }
        }
        method396(var4, var5);
        ((class120) Statics.field1749).method2633(field694);
        method3373(var4, var5, var6, var7);
        Statics.field1922 = var25;
        Statics.field95 = var26;
        Statics.field80 = var27;
        Statics.field3278 = var28;
        Statics.field336 = var29;
        if (field773) {
            byte var59 = 0;
            int var60 = class237.field3156 + class237.field3154 + var59;
            if (var60 == 0) {
                field773 = false;
            }
        }
        if (field773) {
            class321.method5585(var4, var5, var6, var7, 0);
            method79(class225.field2754, false);
        }
    }

    @ObfuscatedName("gi.gd(IIIIZI)V")
    public static final void method3686(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field882;
        } else if (var5 >= 100) {
            var6 = field883;
        } else {
            var6 = (field883 - field882) * var5 / 100 + field882;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field845) {
            short var8 = field845;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field887) {
                var6 = field887;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class321.method5577();
                    class321.method5585(arg0, arg1, var10, arg3, -16777216);
                    class321.method5585(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field889) {
            short var11 = field889;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field886) {
                var6 = field886;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class321.method5577();
                    class321.method5585(arg0, arg1, arg2, var13, -16777216);
                    class321.method5585(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field894 = arg3 * var6 / 334;
        if (field892 != arg2 || field893 != arg3) {
            method3448(arg2, arg3);
        }
        field706 = arg0;
        field638 = arg1;
        field892 = arg2;
        field893 = arg3;
    }

    @ObfuscatedName("hl.gl(I)V")
    public static void method3855() {
        if (field751) {
            method1201(Statics.field2530, false);
        }
    }

    @ObfuscatedName("iz.gc(I)V")
    public static void method4103() {
        if (field759 >= 0 && field748[field759] != null) {
            method1201(field748[field759], false);
        }
    }

    @ObfuscatedName("aw.gv(B)V")
    public static void method394() {
        int var0 = class90.field1240;
        int[] var1 = class90.field1232;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field759 != var1[var2] && field738 != var1[var2]) {
                method1201(field748[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bj.gi(Lbj;ZI)V")
    public static void method1201(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1163() || arg0.field617) {
            return;
        }
        arg0.field623 = false;
        if ((field637 && class90.field1240 > 50 || class90.field1240 > 200) && arg1 && arg0.field965 == arg0.field954) {
            arg0.field623 = true;
        }
        int var2 = arg0.field930 >> 7;
        int var3 = arg0.field933 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method3245(0, 0, 0, false, arg0.field619);
        if (arg0.field610 != null && field643 >= arg0.field611 && field643 < arg0.field606) {
            arg0.field623 = false;
            arg0.field615 = method1942(arg0.field930, arg0.field933, Statics.field625);
            arg0.field929 = field643;
            Statics.field207.method2918(Statics.field625, arg0.field930, arg0.field933, arg0.field615, 60, arg0, arg0.field944, var4, arg0.field596, arg0.field612, arg0.field613, arg0.field605);
            return;
        }
        if ((arg0.field930 & 0x7F) == 64 && (arg0.field933 & 0x7F) == 64) {
            if (field717 == field778[var2][var3]) {
                return;
            }
            field778[var2][var3] = field717;
        }
        arg0.field615 = method1942(arg0.field930, arg0.field933, Statics.field625);
        arg0.field929 = field643;
        Statics.field207.method2948(Statics.field625, arg0.field930, arg0.field933, arg0.field615, 60, arg0, arg0.field944, var4, arg0.field938);
    }

    @ObfuscatedName("ae.hg(ZB)V")
    public static final void method681(boolean arg0) {
        for (int var1 = 0; var1 < field665; var1++) {
            class80 var2 = field674[field690[var1]];
            if (var2 != null && var2.method1163() && var2.field1114.field3479 == arg0 && var2.field1114.method4402()) {
                int var3 = var2.field930 >> 7;
                int var4 = var2.field933 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field928 == 1 && (var2.field930 & 0x7F) == 64 && (var2.field933 & 0x7F) == 64) {
                        if (field717 == field778[var3][var4]) {
                            continue;
                        }
                        field778[var3][var4] = field717;
                    }
                    long var5 = class129.method3245(0, 0, 1, !var2.field1114.field3487, field690[var1]);
                    var2.field929 = field643;
                    Statics.field207.method2948(Statics.field625, var2.field930, var2.field933, method1942(var2.field930 + (var2.field928 * 64 - 64), var2.field933 + (var2.field928 * 64 - 64), Statics.field625), var2.field928 * 64 - 64 + 60, var2, var2.field944, var5, var2.field938);
                }
            }
        }
    }

    @ObfuscatedName("bc.hx(I)V")
    public static final void method998() {
        for (class87 var0 = (class87) field762.method4581(); var0 != null; var0 = (class87) field762.method4589()) {
            if (Statics.field625 != var0.field1193 || field643 > var0.field1202) {
                var0.method3386();
            } else if (field643 >= var0.field1198) {
                if (var0.field1203 > 0) {
                    class80 var1 = field674[var0.field1203 - 1];
                    if (var1 != null && var1.field930 >= 0 && var1.field930 < 13312 && var1.field933 >= 0 && var1.field933 < 13312) {
                        var0.method2039(var1.field930, var1.field933, method1942(var1.field930, var1.field933, var0.field1193) - var0.field1192, field643);
                    }
                }
                if (var0.field1203 < 0) {
                    int var2 = -var0.field1203 - 1;
                    class67 var3;
                    if (field738 == var2) {
                        var3 = Statics.field2530;
                    } else {
                        var3 = field748[var2];
                    }
                    if (var3 != null && var3.field930 >= 0 && var3.field930 < 13312 && var3.field933 >= 0 && var3.field933 < 13312) {
                        var0.method2039(var3.field930, var3.field933, method1942(var3.field930, var3.field933, var0.field1193) - var0.field1192, field643);
                    }
                }
                var0.method2040(field694);
                Statics.field207.method2948(Statics.field625, (int) var0.field1204, (int) var0.field1199, (int) var0.field1197, 60, var0, var0.field1212, -1L, false);
            }
        }
    }

    @ObfuscatedName("kq.hw(I)V")
    public static final void method4963() {
        for (class78 var0 = (class78) field763.method4581(); var0 != null; var0 = (class78) field763.method4589()) {
            if (Statics.field625 != var0.field1090 || var0.field1097) {
                var0.method3386();
            } else if (field643 >= var0.field1089) {
                var0.method1946(field694);
                if (var0.field1097) {
                    var0.method3386();
                } else {
                    Statics.field207.method2948(var0.field1090, var0.field1091, var0.field1092, var0.field1093, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("ar.hn(III)V")
    public static final void method396(int arg0, int arg1) {
        if (field651 == 2) {
            method566((field715 - Statics.field1961 << 7) + field657, (field655 - Statics.field1108 << 7) + field658, field801 * 2);
            if (field731 > -1 && field643 % 20 < 10) {
                Statics.field90[0].method5686(field731 + arg0 - 12, field732 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ku.hj(Lbz;IIIIII)V")
    public static final void method5424(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1163()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1114;
            if (var6.field3458 != null) {
                var6 = var6.method4408();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1240;
        int[] var8 = class90.field1232;
        byte var9 = 0;
        if (arg1 < var7 && field643 == arg0.field929) {
            class67 var10 = (class67) arg0;
            boolean var11;
            if (field698 == 0) {
                var11 = false;
            } else if (Statics.field2530 == var10) {
                boolean var17 = (field698 & 0x8) != 0;
                var11 = var17;
            } else {
                boolean var12 = (field698 & 0x4) != 0;
                boolean var13 = var12;
                if (!var12) {
                    boolean var14 = (field698 & 0x1) != 0;
                    var13 = var14 && var10.method1152();
                }
                boolean var15 = var13;
                if (!var13) {
                    boolean var16 = (field698 & 0x2) != 0;
                    var15 = var16 && var10.method1155();
                }
                var11 = var15;
            }
            if (var11) {
                class67 var18 = (class67) arg0;
                if (arg1 < var7) {
                    method3087(arg0, arg0.field975 + 15);
                    class296 var19 = (class296) field842.get(class292.field3643);
                    byte var20 = 9;
                    var19.method5042(var18.field601.method4851(), field731 + arg2, field732 + arg3 - var20, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var21 = -2;
        if (!arg0.field950.method4555()) {
            method3087(arg0, arg0.field975 + 15);
            for (class79 var22 = (class79) arg0.field950.method4509(); var22 != null; var22 = (class79) arg0.field950.method4506()) {
                class71 var23 = var22.method1954(field643);
                if (var23 != null) {
                    class247 var24 = var22.field1109;
                    class325 var25 = var24.method4184();
                    class325 var26 = var24.method4175();
                    int var27 = 0;
                    int var28;
                    if (var25 == null || var26 == null) {
                        var28 = var24.field3275;
                    } else {
                        if (var24.field3276 * 2 < var26.field3863) {
                            var27 = var24.field3276;
                        }
                        var28 = var26.field3863 - var27 * 2;
                    }
                    int var29 = 255;
                    boolean var30 = true;
                    int var31 = field643 - var23.field988;
                    int var32 = var23.field986 * var28 / var24.field3275;
                    int var35;
                    if (var23.field989 > var31) {
                        int var33 = var24.field3270 == 0 ? 0 : var31 / var24.field3270 * var24.field3270;
                        int var34 = var23.field987 * var28 / var24.field3275;
                        var35 = (var32 - var34) * var33 / var23.field989 + var34;
                    } else {
                        var35 = var32;
                        int var36 = var23.field989 + var24.field3264 - var31;
                        if (var24.field3269 >= 0) {
                            var29 = (var36 << 8) / (var24.field3264 - var24.field3269);
                        }
                    }
                    if (var23.field986 > 0 && var35 < 1) {
                        var35 = 1;
                    }
                    if (var25 == null || var26 == null) {
                        var21 += 5;
                        if (field731 > -1) {
                            int var42 = field731 + arg2 - (var28 >> 1);
                            int var43 = field732 + arg3 - var21;
                            class321.method5585(var42, var43, var35, 5, 65280);
                            class321.method5585(var35 + var42, var43, var28 - var35, 5, 16711680);
                        }
                        var21 += 2;
                    } else {
                        int var37;
                        if (var28 == var35) {
                            var37 = var27 * 2 + var35;
                        } else {
                            var37 = var27 + var35;
                        }
                        int var38 = var25.field3870;
                        var21 += var38;
                        int var39 = field731 + arg2 - (var28 >> 1);
                        int var40 = field732 + arg3 - var21;
                        int var41 = var39 - var27;
                        if (var29 >= 0 && var29 < 255) {
                            var25.method5683(var41, var40, var29);
                            class321.method5579(var41, var40, var37 + var41, var38 + var40);
                            var26.method5683(var41, var40, var29);
                        } else {
                            var25.method5686(var41, var40);
                            class321.method5579(var41, var40, var37 + var41, var38 + var40);
                            var26.method5686(var41, var40);
                        }
                        class321.method5578(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var21 += 2;
                    }
                } else if (var22.method1952()) {
                    var22.method3386();
                }
            }
        }
        if (var21 == -2) {
            var21 += 7;
        }
        int var44 = var9 + var21;
        if (arg1 < var7) {
            class67 var45 = (class67) arg0;
            if (var45.field617) {
                return;
            }
            if (var45.field598 != -1 || var45.field599 != -1) {
                method3087(arg0, arg0.field975 + 15);
                if (field731 > -1) {
                    if (var45.field598 != -1) {
                        var44 += 25;
                        Statics.field3627[var45.field598].method5686(field731 + arg2 - 12, field732 + arg3 - var44);
                    }
                    if (var45.field599 != -1) {
                        var44 += 25;
                        Statics.field1188[var45.field599].method5686(field731 + arg2 - 12, field732 + arg3 - var44);
                    }
                }
            }
            if (arg1 >= 0 && field651 == 10 && field729 == var8[arg1]) {
                method3087(arg0, arg0.field975 + 15);
                if (field731 > -1) {
                    int var46 = Statics.field90[1].field3870 + var44;
                    Statics.field90[1].method5686(field731 + arg2 - 12, field732 + arg3 - var46);
                }
            }
        } else {
            class257 var47 = ((class80) arg0).field1114;
            if (var47.field3458 != null) {
                var47 = var47.method4408();
            }
            if (var47.field3482 >= 0 && var47.field3482 < Statics.field1188.length) {
                method3087(arg0, arg0.field975 + 15);
                if (field731 > -1) {
                    Statics.field1188[var47.field3482].method5686(field731 + arg2 - 12, field732 + arg3 - 30);
                }
            }
            if (field651 == 1 && field832 == field690[arg1 - var7] && field643 % 20 < 10) {
                method3087(arg0, arg0.field975 + 15);
                if (field731 > -1) {
                    Statics.field90[0].method5686(field731 + arg2 - 12, field732 + arg3 - 28);
                }
            }
        }
        if (arg0.field948 != null && (arg1 >= var7 || !arg0.field940 && (field848 == 4 || !arg0.field939 && (field848 == 0 || field848 == 3 || field848 == 1 && ((class67) arg0).method1152())))) {
            method3087(arg0, arg0.field975);
            if (field731 > -1 && field719 < field720) {
                field675[field719] = Statics.field366.method4982(arg0.field948) / 2;
                field723[field719] = Statics.field366.field3661;
                field721[field719] = field731;
                field656[field719] = field732;
                field725[field719] = arg0.field942;
                field895[field719] = arg0.field943;
                field700[field719] = arg0.field951;
                field728[field719] = arg0.field948;
                field719++;
            }
        }
        for (int var48 = 0; var48 < 4; var48++) {
            int var49 = arg0.field981[var48];
            int var50 = arg0.field953[var48];
            class253 var51 = null;
            int var52 = 0;
            if (var50 >= 0) {
                if (var49 <= field643) {
                    continue;
                }
                var51 = class253.method3869(arg0.field953[var48]);
                var52 = var51.field3315;
                if (var51 != null && var51.field3332 != null) {
                    var51 = var51.method4262();
                    if (var51 == null) {
                        arg0.field981[var48] = -1;
                        continue;
                    }
                }
            } else if (var49 < 0) {
                continue;
            }
            int var53 = arg0.field955[var48];
            class253 var54 = null;
            if (var53 >= 0) {
                var54 = class253.method3869(var53);
                if (var54 != null && var54.field3332 != null) {
                    var54 = var54.method4262();
                }
            }
            if (var49 - var52 <= field643) {
                if (var51 == null) {
                    arg0.field981[var48] = -1;
                } else {
                    method3087(arg0, arg0.field975 / 2);
                    if (field731 > -1) {
                        if (var48 == 1) {
                            field732 -= 20;
                        }
                        if (var48 == 2) {
                            field731 -= 15;
                            field732 -= 10;
                        }
                        if (var48 == 3) {
                            field731 += 15;
                            field732 -= 10;
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
                        class325 var67 = null;
                        class325 var68 = null;
                        class325 var69 = null;
                        class325 var70 = null;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        class325 var80 = var51.method4274();
                        if (var80 != null) {
                            var59 = var80.field3863;
                            int var81 = var80.field3870;
                            if (var81 > var79) {
                                var79 = var81;
                            }
                            var63 = var80.field3868;
                        }
                        class325 var82 = var51.method4264();
                        if (var82 != null) {
                            var60 = var82.field3863;
                            int var83 = var82.field3870;
                            if (var83 > var79) {
                                var79 = var83;
                            }
                            var64 = var82.field3868;
                        }
                        class325 var84 = var51.method4265();
                        if (var84 != null) {
                            var61 = var84.field3863;
                            int var85 = var84.field3870;
                            if (var85 > var79) {
                                var79 = var85;
                            }
                            var65 = var84.field3868;
                        }
                        class325 var86 = var51.method4286();
                        if (var86 != null) {
                            var62 = var86.field3863;
                            int var87 = var86.field3870;
                            if (var87 > var79) {
                                var79 = var87;
                            }
                            var66 = var86.field3868;
                        }
                        if (var54 != null) {
                            var67 = var54.method4274();
                            if (var67 != null) {
                                var71 = var67.field3863;
                                int var88 = var67.field3870;
                                if (var88 > var79) {
                                    var79 = var88;
                                }
                                var75 = var67.field3868;
                            }
                            var68 = var54.method4264();
                            if (var68 != null) {
                                var72 = var68.field3863;
                                int var89 = var68.field3870;
                                if (var89 > var79) {
                                    var79 = var89;
                                }
                                var76 = var68.field3868;
                            }
                            var69 = var54.method4265();
                            if (var69 != null) {
                                var73 = var69.field3863;
                                int var90 = var69.field3870;
                                if (var90 > var79) {
                                    var79 = var90;
                                }
                                var77 = var69.field3868;
                            }
                            var70 = var54.method4286();
                            if (var70 != null) {
                                var74 = var70.field3863;
                                int var91 = var70.field3870;
                                if (var91 > var79) {
                                    var79 = var91;
                                }
                                var78 = var70.field3868;
                            }
                        }
                        class295 var92 = var51.method4267();
                        if (var92 == null) {
                            var92 = Statics.field414;
                        }
                        class295 var93;
                        if (var54 == null) {
                            var93 = Statics.field414;
                        } else {
                            var93 = var54.method4267();
                            if (var93 == null) {
                                var93 = Statics.field414;
                            }
                        }
                        Object var94 = null;
                        String var95 = null;
                        boolean var96 = false;
                        int var97 = 0;
                        String var98 = var51.method4276(arg0.field946[var48]);
                        int var99 = var92.method4982(var98);
                        if (var54 != null) {
                            var95 = var54.method4276(arg0.field945[var48]);
                            var97 = var93.method4982(var95);
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
                        if (var54 != null && var72 > 0) {
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
                        if (var54 != null) {
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
                        int var116 = arg0.field981[var48] - field643;
                        int var117 = var51.field3330 - var51.field3330 * var116 / var51.field3315;
                        int var118 = var51.field3316 * var116 / var51.field3315 + -var51.field3316;
                        int var119 = field731 + arg2 - (var108 >> 1) + var117;
                        int var120 = field732 + arg3 - 12 + var118;
                        int var121 = var120;
                        int var122 = var79 + var120;
                        int var123 = var51.field3331 + var120 + 15;
                        int var124 = var123 - var92.field3668;
                        int var125 = var92.field3669 + var123;
                        if (var124 < var120) {
                            var121 = var124;
                        }
                        if (var125 > var122) {
                            var122 = var125;
                        }
                        int var126 = 0;
                        if (var54 != null) {
                            var126 = var54.field3331 + var120 + 15;
                            int var127 = var126 - var93.field3668;
                            int var128 = var93.field3669 + var126;
                            if (var127 < var121) {
                                ;
                            }
                            if (var128 > var122) {
                                ;
                            }
                        }
                        int var131 = 255;
                        if (var51.field3328 >= 0) {
                            var131 = (var116 << 8) / (var51.field3315 - var51.field3328);
                        }
                        if (var131 >= 0 && var131 < 255) {
                            if (var80 != null) {
                                var80.method5683(var103 + var119 - var63, var120, var131);
                            }
                            if (var84 != null) {
                                var84.method5683(var104 + var119 - var65, var120, var131);
                            }
                            if (var82 != null) {
                                for (int var132 = 0; var132 < var100; var132++) {
                                    var82.method5683(var60 * var132 + (var105 + var119 - var64), var120, var131);
                                }
                            }
                            if (var86 != null) {
                                var86.method5683(var109 + var119 - var66, var120, var131);
                            }
                            var92.method5028(var98, var106 + var119, var123, var51.field3325, 0, var131);
                            if (var54 != null) {
                                if (var67 != null) {
                                    var67.method5683(var110 + var119 - var75, var120, var131);
                                }
                                if (var69 != null) {
                                    var69.method5683(var111 + var119 - var77, var120, var131);
                                }
                                if (var68 != null) {
                                    for (int var133 = 0; var133 < var101; var133++) {
                                        var68.method5683(var72 * var133 + (var112 + var119 - var76), var120, var131);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method5683(var113 + var119 - var78, var120, var131);
                                }
                                var93.method5028(var95, var114 + var119, var126, var54.field3325, 0, var131);
                            }
                        } else {
                            if (var80 != null) {
                                var80.method5686(var103 + var119 - var63, var120);
                            }
                            if (var84 != null) {
                                var84.method5686(var104 + var119 - var65, var120);
                            }
                            if (var82 != null) {
                                for (int var134 = 0; var134 < var100; var134++) {
                                    var82.method5686(var60 * var134 + (var105 + var119 - var64), var120);
                                }
                            }
                            if (var86 != null) {
                                var86.method5686(var109 + var119 - var66, var120);
                            }
                            var92.method4987(var98, var106 + var119, var123, var51.field3325 | 0xFF000000, 0);
                            if (var54 != null) {
                                if (var67 != null) {
                                    var67.method5686(var110 + var119 - var75, var120);
                                }
                                if (var69 != null) {
                                    var69.method5686(var111 + var119 - var77, var120);
                                }
                                if (var68 != null) {
                                    for (int var135 = 0; var135 < var101; var135++) {
                                        var68.method5686(var72 * var135 + (var112 + var119 - var76), var120);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method5686(var113 + var119 - var78, var120);
                                }
                                var93.method4987(var95, var114 + var119, var126, var54.field3325 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.hf(I)V")
    public static final void method540() {
        field746 = 0;
        int var0 = (Statics.field2530.field930 >> 7) + Statics.field1961;
        int var1 = (Statics.field2530.field933 >> 7) + Statics.field1108;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field746 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field746 = 1;
        }
        if (field746 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field746 = 0;
        }
    }

    @ObfuscatedName("fc.he(IIIIB)V")
    public static final void method3373(int arg0, int arg1, int arg2, int arg3) {
        method540();
    }

    @ObfuscatedName("ep.hh(Lbz;II)V")
    public static final void method3087(class70 arg0, int arg1) {
        method566(arg0.field930, arg0.field933, arg1);
    }

    @ObfuscatedName("ab.hb(IIIB)V")
    public static final void method566(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field731 = -1;
            field732 = -1;
            return;
        }
        int var3 = method1942(arg0, arg1, Statics.field625) - arg2;
        int var4 = arg0 - Statics.field1922;
        int var5 = var3 - Statics.field95;
        int var6 = arg1 - Statics.field80;
        int var7 = class131.field1762[Statics.field3278];
        int var8 = class131.field1752[Statics.field3278];
        int var9 = class131.field1762[Statics.field336];
        int var10 = class131.field1752[Statics.field336];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field731 = field894 * var11 / var15 + field892 / 2;
            field732 = field894 * var14 / var15 + field893 / 2;
        } else {
            field731 = -1;
            field732 = -1;
        }
    }

    @ObfuscatedName("bp.hi(IIII)I")
    public static final int method1942(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field488[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field482[var5][var3][var4] + class56.field482[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field482[var5][var3][var4 + 1] + class56.field482[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dq.hk(IIB)I")
    public static int method2381(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field885 - field799) * var2 / 100 + field799;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("p.ha(IIIIIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method2381(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class131.field1762[var8];
            int var14 = class131.field1752[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class131.field1762[var9];
            int var17 = class131.field1752[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field1922 = arg0 - var10;
        Statics.field95 = arg1 - var11;
        Statics.field80 = arg2 - var12;
        Statics.field3278 = arg3;
        Statics.field336 = arg4;
        if (field707 != 1 || field755 < 2 || field643 % 50 != 0 || !(Statics.field3586 >> 7 != Statics.field2530.field930 >> 7 || Statics.field3130 >> 7 != Statics.field2530.field933 >> 7)) {
            return;
        }
        int var19 = Statics.field2530.field618;
        int var20 = (Statics.field3586 >> 7) + Statics.field1961;
        int var21 = (Statics.field3130 >> 7) + Statics.field1108;
        class188 var22 = class188.method2402(class184.field2229, field679.field1284);
        var22.field2308.method5168(field800);
        var22.field2308.method5253(var19);
        var22.field2308.method5158(var21);
        var22.field2308.method5322(var20);
        field679.method2177(var22);
    }

    @ObfuscatedName("fk.hv(ZLkf;I)V")
    public static final void method3289(boolean arg0, class299 arg1) {
        field741 = arg0;
        if (!field741) {
            int var2 = arg1.method5160();
            int var3 = arg1.method5166();
            int var4 = arg1.method5166();
            Statics.field2280 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2280[var5][var6] = arg1.method5155();
                }
            }
            Statics.field628 = new int[var4];
            Statics.field4038 = new int[var4];
            Statics.field300 = new int[var4];
            Statics.field1929 = new byte[var4][];
            Statics.field1973 = new byte[var4][];
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
                        Statics.field628[var8] = var11;
                        Statics.field4038[var8] = Statics.field165.method3891("m" + var9 + "_" + var10);
                        Statics.field300[var8] = Statics.field165.method3891("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method257(var3, var2, true);
            return;
        }
        int var12 = arg1.method5162();
        boolean var13 = arg1.method5136() == 1;
        int var14 = arg1.method5161();
        int var15 = arg1.method5166();
        arg1.method5073();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5074(1);
                    if (var19 == 1) {
                        field692[var16][var17][var18] = arg1.method5074(26);
                    } else {
                        field692[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5075();
        Statics.field2280 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2280[var20][var21] = arg1.method5155();
            }
        }
        Statics.field628 = new int[var15];
        Statics.field4038 = new int[var15];
        Statics.field300 = new int[var15];
        Statics.field1929 = new byte[var15][];
        Statics.field1973 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field692[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field628[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field628[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field4038[var22] = Statics.field165.method3891("m" + var31 + "_" + var32);
                            Statics.field300[var22] = Statics.field165.method3891("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method257(var14, var12, !var13);
    }

    @ObfuscatedName("z.hd(IIZI)V")
    public static final void method257(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field141 == arg0 && Statics.field564 == arg1) {
            return;
        }
        Statics.field141 = arg0;
        Statics.field564 = arg1;
        method2725(25);
        method79(class225.field2754, true);
        int var3 = Statics.field1961;
        int var4 = Statics.field1108;
        Statics.field1961 = (arg0 - 6) * 8;
        Statics.field1108 = (arg1 - 6) * 8;
        int var5 = Statics.field1961 - var3;
        int var6 = Statics.field1108 - var4;
        int var7 = Statics.field1961;
        int var8 = Statics.field1108;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field674[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field924[var11] -= var5;
                    var10.field931[var11] -= var6;
                }
                var10.field930 -= var5 * 128;
                var10.field933 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field748[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field924[var14] -= var5;
                    var13.field931[var14] -= var6;
                }
                var13.field930 -= var5 * 128;
                var13.field933 -= var6 * 128;
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
                        field760[var25][var21][var22] = field760[var25][var23][var24];
                    } else {
                        field760[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field761.method4581(); var26 != null; var26 = (class69) field761.method4589()) {
            var26.field911 -= var5;
            var26.field912 -= var6;
            if (var26.field911 < 0 || var26.field912 < 0 || var26.field911 >= 104 || var26.field912 >= 104) {
                var26.method3386();
            }
        }
        if (field862 != 0) {
            field862 -= var5;
            field863 -= var6;
        }
        field794 = 0;
        field834 = false;
        Statics.field1922 -= var5 << 7;
        Statics.field80 -= var6 << 7;
        Statics.field3586 -= var5 << 7;
        Statics.field3130 -= var6 << 7;
        field857 = -1;
        field763.method4575();
        field762.method4575();
        for (int var27 = 0; var27 < 4; var27++) {
            field812[var27].method3357();
        }
    }

    @ObfuscatedName("p.hz(ZI)V")
    public static final void method140(boolean arg0) {
        method2168();
        field679.field1290++;
        if (field679.field1290 < 50 && !arg0) {
            return;
        }
        field679.field1290 = 0;
        if (field681 || field679.method2181() == null) {
            return;
        }
        class188 var1 = class188.method2402(class184.field2246, field679.field1284);
        field679.method2177(var1);
        try {
            field679.method2176();
        } catch (IOException var3) {
            field681 = true;
        }
    }

    @ObfuscatedName("ar.hu(IIIIII)V")
    public static final void method397(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field207.method2932(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field207.method2936(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field1593.field3866;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class129.method3196(var5);
            class254 var17 = class254.method3848(var16);
            if (var17.field3367 == -1) {
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
                class324 var18 = Statics.field32[var17.field3367];
                if (var18 != null) {
                    int var19 = (var17.field3342 * 4 - var18.field3854) / 2;
                    int var20 = (var17.field3378 * 4 - var18.field3857) / 2;
                    var18.method5658(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3378) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field207.method3039(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field207.method2936(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class129.method3196(var21);
            class254 var27 = class254.method3848(var26);
            if (var27.field3367 != -1) {
                class324 var28 = Statics.field32[var27.field3367];
                if (var28 != null) {
                    int var29 = (var27.field3342 * 4 - var28.field3854) / 2;
                    int var30 = (var27.field3378 * 4 - var28.field3857) / 2;
                    var28.method5658(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3378) * 4 + 48 + var30);
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
                int[] var35 = Statics.field1593.field3866;
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
        long var37 = Statics.field207.method2956(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class129.method3196(var37);
        class254 var40 = class254.method3848(var39);
        if (var40.field3367 == -1) {
            return;
        }
        class324 var41 = Statics.field32[var40.field3367];
        if (var41 != null) {
            int var42 = (var40.field3342 * 4 - var41.field3854) / 2;
            int var43 = (var40.field3378 * 4 - var41.field3857) / 2;
            var41.method5658(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3378) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hm(Lcp;I)Z")
    public final boolean method1519(class96 arg0) {
        class305 var2 = arg0.method2181();
        class299 var3 = arg0.field1285;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1286 == null) {
                if (arg0.field1288) {
                    if (!var2.method3296(1)) {
                        return false;
                    }
                    var2.method3318(arg0.field1285.field3699, 0, 1);
                    arg0.field1292 = 0;
                    arg0.field1288 = false;
                }
                var3.field3694 = 0;
                if (var3.method5100()) {
                    if (!var2.method3296(1)) {
                        return false;
                    }
                    var2.method3318(arg0.field1285.field3699, 1, 1);
                    arg0.field1292 = 0;
                }
                arg0.field1288 = true;
                class183[] var4 = class183.method1053();
                int var5 = var3.method5071();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3694);
                }
                arg0.field1286 = var4[var5];
                arg0.field1289 = arg0.field1286.field2179;
            }
            if (arg0.field1289 == -1) {
                if (!var2.method3296(1)) {
                    return false;
                }
                arg0.method2181().method3318(var3.field3699, 0, 1);
                arg0.field1289 = var3.field3699[0] & 0xFF;
            }
            if (arg0.field1289 == -2) {
                if (!var2.method3296(2)) {
                    return false;
                }
                arg0.method2181().method3318(var3.field3699, 0, 2);
                var3.field3694 = 0;
                arg0.field1289 = var3.method5166();
            }
            if (!var2.method3296(arg0.field1289)) {
                return false;
            }
            var3.field3694 = 0;
            var2.method3318(var3.field3699, 0, arg0.field1289);
            arg0.field1292 = 0;
            field683.method4666();
            arg0.field1293 = arg0.field1287;
            arg0.field1287 = arg0.field1291;
            arg0.field1291 = arg0.field1286;
            if (class183.field2127 == arg0.field1286) {
                field726 = var3.method5160() * 30;
                field835 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1286) {
                int var6 = var3.method5123();
                if (var3.method5123() == 0) {
                    field899[var6] = new class10();
                    var3.field3694 += 18;
                } else {
                    var3.field3694--;
                    field899[var6] = new class10(var3, false);
                }
                field827 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1286) {
                int var7 = var3.method5162();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = var3.method5310();
                int var9 = var3.method5166();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = var3.method5170();
                for (int var11 = var7; var11 <= var9; var11++) {
                    long var12 = ((long) var10 << 32) + (long) var11;
                    class181 var14 = field670.method5528(var12);
                    if (var14 != null) {
                        var14.method3386();
                    }
                    field670.method5529(new class180(var8), var12);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1286) {
                boolean var15 = var3.method5123() == 1;
                if (var15) {
                    Statics.field585 = class297.method3777() - var3.method5129();
                    Statics.field338 = new class7(var3, true);
                } else {
                    Statics.field338 = null;
                }
                field653 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1286) {
                field651 = var3.method5123();
                if (field651 == 1) {
                    field832 = var3.method5166();
                }
                if (field651 >= 2 && field651 <= 6) {
                    if (field651 == 2) {
                        field657 = 64;
                        field658 = 64;
                    }
                    if (field651 == 3) {
                        field657 = 0;
                        field658 = 64;
                    }
                    if (field651 == 4) {
                        field657 = 128;
                        field658 = 64;
                    }
                    if (field651 == 5) {
                        field657 = 64;
                        field658 = 0;
                    }
                    if (field651 == 6) {
                        field657 = 64;
                        field658 = 128;
                    }
                    field651 = 2;
                    field715 = var3.method5166();
                    field655 = var3.method5166();
                    field801 = var3.method5123();
                }
                if (field651 == 10) {
                    field729 = var3.method5166();
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1286) {
                byte[] var16 = new byte[arg0.field1289];
                var3.method5072(var16, 0, var16.length);
                class300 var17 = new class300(var16);
                String var18 = var17.method5132();
                class52.method27(var18, true, false);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2112 == arg0.field1286) {
                method284(true, var3);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2096 == arg0.field1286) {
                method3289(true, arg0.field1285);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1286) {
                int var19 = var3.method5155();
                if (field800 != var19) {
                    field800 = var19;
                    method546();
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1286) {
                class90.method5569(var3, arg0.field1289);
                method3090();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1286) {
                int var20 = var3.method5166();
                int var21 = var3.method5310();
                class218 var22 = class218.method3416(var21);
                if (var22.field2662 != 1 || var22.field2593 != var20) {
                    var22.field2662 = 1;
                    var22.field2593 = var20;
                    method166(var22);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1286) {
                method395(class186.field2296);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2105 == arg0.field1286) {
                int var23 = var3.method5155();
                int var24 = var3.method5166();
                if (var23 < -70000) {
                    var24 += 32768;
                }
                class218 var25;
                if (var23 >= 0) {
                    var25 = class218.method3416(var23);
                } else {
                    var25 = null;
                }
                while (var3.field3694 < arg0.field1289) {
                    int var26 = var3.method5309();
                    int var27 = var3.method5166();
                    int var28 = 0;
                    if (var27 != 0) {
                        var28 = var3.method5123();
                        if (var28 == 255) {
                            var28 = var3.method5155();
                        }
                    }
                    if (var25 != null && var26 >= 0 && var26 < var25.field2602.length) {
                        var25.field2602[var26] = var27;
                        var25.field2674[var26] = var28;
                    }
                    class60.method565(var24, var26, var27 - 1, var28);
                }
                if (var25 != null) {
                    method166(var25);
                }
                method3089();
                field817[++field821 - 1 & 0x1F] = var24 & 0x7FFF;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1286) {
                int var29 = var3.method5160();
                class60.method220(var29);
                field817[++field821 - 1 & 0x1F] = var29 & 0x7FFF;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1286) {
                int var30 = var3.method5155();
                class62 var31 = (class62) field793.method5528((long) var30);
                if (var31 != null) {
                    method1206(var31, true);
                }
                if (field798 != null) {
                    method166(field798);
                    field798 = null;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2099 == arg0.field1286) {
                int var32 = arg0.field1289 + var3.field3694;
                int var33 = var3.method5166();
                int var34 = var3.method5166();
                if (field697 != var33) {
                    field697 = var33;
                    this.method1234(false);
                    method399(field697);
                    class77.method3091(field697);
                    for (int var35 = 0; var35 < 100; var35++) {
                        field843[var35] = true;
                    }
                }
                while (var34-- > 0) {
                    int var36 = var3.method5155();
                    int var37 = var3.method5166();
                    int var38 = var3.method5123();
                    class62 var39 = (class62) field793.method5528((long) var36);
                    if (var39 != null && var39.field549 != var37) {
                        method1206(var39, true);
                        var39 = null;
                    }
                    if (var39 == null) {
                        var39 = method306(var36, var37, var38);
                    }
                    var39.field546 = true;
                }
                for (class62 var40 = (class62) field793.method5536(); var40 != null; var40 = (class62) field793.method5530()) {
                    if (var40.field546) {
                        var40.field546 = false;
                    } else {
                        method1206(var40, true);
                    }
                }
                field670 = new class318(512);
                while (var3.field3694 < var32) {
                    int var41 = var3.method5155();
                    int var42 = var3.method5166();
                    int var43 = var3.method5166();
                    int var44 = var3.method5155();
                    for (int var45 = var42; var45 <= var43; var45++) {
                        long var46 = ((long) var41 << 32) + (long) var45;
                        field670.method5529(new class180(var44), var46);
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1286) {
                int var48 = var3.method5310();
                int var49 = var3.method5155();
                class62 var50 = (class62) field793.method5528((long) var48);
                class62 var51 = (class62) field793.method5528((long) var49);
                if (var51 != null) {
                    method1206(var51, var50 == null || var50.field549 != var51.field549);
                }
                if (var50 != null) {
                    var50.method3386();
                    field793.method5529(var50, (long) var49);
                }
                class218 var52 = class218.method3416(var48);
                if (var52 != null) {
                    method166(var52);
                }
                class218 var53 = class218.method3416(var49);
                if (var53 != null) {
                    method166(var53);
                    method707(Statics.field2540[var53.field2549 >>> 16], var53, true);
                }
                if (field697 != -1) {
                    method1999(field697, 1);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1286) {
                method395(class186.field2298);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1286) {
                String var54 = var3.method5132();
                long var55 = var3.method5129();
                long var57 = (long) var3.method5166();
                long var59 = (long) var3.method5127();
                class229 var61 = (class229) class196.method292(class229.method800(), var3.method5123());
                long var62 = (var57 << 32) + var59;
                boolean var64 = false;
                for (int var65 = 0; var65 < 100; var65++) {
                    if (field853[var65] == var62) {
                        var64 = true;
                        break;
                    }
                }
                if (var61.field3079 && Statics.field1296.method1826(new class283(var54, Statics.field536))) {
                    var64 = true;
                }
                if (!var64 && field746 == 0) {
                    field853[field722] = var62;
                    field722 = (field722 + 1) % 100;
                    String var66 = class296.method5037(class291.method3853(class211.method58(var3)));
                    if (var61.field3080 == -1) {
                        class92.method398(9, var54, var66, class289.method305(var55));
                    } else {
                        class92.method398(9, class82.method90(var61.field3080) + var54, var66, class289.method305(var55));
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2097 == arg0.field1286) {
                int var67 = var3.method5123();
                int var68 = var3.method5123();
                int var69 = var3.method5123();
                int var70 = var3.method5123();
                field642[var67] = true;
                field878[var67] = var68;
                field796[var67] = var69;
                field880[var67] = var70;
                field881[var67] = 0;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2092 == arg0.field1286) {
                method3089();
                field824 = var3.method5126();
                field835 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1286) {
                Statics.field2502 = var3.method5136();
                Statics.field62 = var3.method5136();
                for (int var71 = Statics.field2502; var71 < Statics.field2502 + 8; var71++) {
                    for (int var72 = Statics.field62; var72 < Statics.field62 + 8; var72++) {
                        if (field760[Statics.field625][var71][var72] != null) {
                            field760[Statics.field625][var71][var72] = null;
                            method51(var71, var72);
                        }
                    }
                }
                for (class69 var73 = (class69) field761.method4581(); var73 != null; var73 = (class69) field761.method4589()) {
                    if (var73.field911 >= Statics.field2502 && var73.field911 < Statics.field2502 + 8 && var73.field912 >= Statics.field62 && var73.field912 < Statics.field62 + 8 && Statics.field625 == var73.field919) {
                        var73.field920 = 0;
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2110 == arg0.field1286) {
                for (int var74 = 0; var74 < field748.length; var74++) {
                    if (field748[var74] != null) {
                        field748[var74].field957 = -1;
                    }
                }
                for (int var75 = 0; var75 < field674.length; var75++) {
                    if (field674[var75] != null) {
                        field674[var75].field957 = -1;
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1286) {
                int var76 = var3.method5166();
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = var3.method5155();
                int var78 = var3.method5117();
                class218 var79 = class218.method3416(var78);
                if (var79.field2569) {
                    var79.field2675 = var76;
                    var79.field2580 = var77;
                    class255 var81 = class255.method3852(var76);
                    var79.field2600 = var81.field3407;
                    var79.field2601 = var81.field3408;
                    var79.field2598 = var81.field3409;
                    var79.field2632 = var81.field3410;
                    var79.field2548 = var81.field3411;
                    var79.field2603 = var81.field3406;
                    if (var81.field3442 == 1) {
                        var79.field2608 = 1;
                    } else {
                        var79.field2608 = 2;
                    }
                    if (var79.field2578 > 0) {
                        var79.field2603 = var79.field2603 * 32 / var79.field2578;
                    } else if (var79.field2560 > 0) {
                        var79.field2603 = var79.field2603 * 32 / var79.field2560;
                    }
                    method166(var79);
                } else if (var76 == -1) {
                    var79.field2662 = 0;
                    arg0.field1286 = null;
                    return true;
                } else {
                    class255 var80 = class255.method3852(var76);
                    var79.field2662 = 4;
                    var79.field2593 = var76;
                    var79.field2600 = var80.field3407;
                    var79.field2601 = var80.field3408;
                    var79.field2603 = var80.field3406 * 100 / var77;
                    method166(var79);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2108 == arg0.field1286) {
                method395(class186.field2297);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1286) {
                Statics.field20 = class310.method4432(var3.method5123());
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1286) {
                int var82 = var3.method5309();
                boolean var83 = var3.method5123() == 1;
                String var84 = "";
                boolean var85 = false;
                if (var83) {
                    var84 = var3.method5132();
                    if (Statics.field1296.method1826(new class283(var84, Statics.field536))) {
                        var85 = true;
                    }
                }
                String var86 = var3.method5132();
                if (!var85) {
                    class92.method522(var82, var84, var86);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2094 == arg0.field1286) {
                Statics.field1296.method1760();
                field825 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1286) {
                int var87 = var3.method5161();
                field697 = var87;
                this.method1234(false);
                method399(var87);
                class77.method3091(field697);
                for (int var88 = 0; var88 < 100; var88++) {
                    field843[var88] = true;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1286) {
                Statics.field2502 = var3.method5153();
                Statics.field62 = var3.method5211();
                while (var3.field3694 < arg0.field1289) {
                    int var89 = var3.method5123();
                    class186 var90 = class186.method619()[var89];
                    method395(var90);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2098 == arg0.field1286) {
                int var91 = var3.method5170();
                int var92 = var3.method5160();
                class218 var93 = class218.method3416(var91);
                if (var93 != null && var93.field2630 == 0) {
                    if (var92 > var93.field2654 - var93.field2565) {
                        var92 = var93.field2654 - var93.field2565;
                    }
                    if (var92 < 0) {
                        var92 = 0;
                    }
                    if (var93.field2614 != var92) {
                        var93.field2614 = var92;
                        method166(var93);
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1286) {
                int var94 = var3.method5123();
                method289(var94);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1286) {
                int var95 = var3.method5155();
                int var96 = var3.method5165();
                class218 var97 = class218.method3416(var95);
                if (var97.field2596 != var96 || var96 == -1) {
                    var97.field2596 = var96;
                    var97.field2677 = 0;
                    var97.field2678 = 0;
                    method166(var97);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1286) {
                method395(class186.field2300);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1286) {
                int var98 = var3.method5161();
                if (var98 == 65535) {
                    var98 = -1;
                }
                method563(var98);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1286) {
                int var99 = var3.method5192();
                int var100 = var3.method5160();
                if (var100 == 65535) {
                    var100 = -1;
                }
                method692(var100, var99);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1286) {
                int var101 = var3.method5155();
                int var102 = var3.method5155();
                int var103 = class54.method252();
                class188 var104 = class188.method2402(class184.field2233, field679.field1284);
                var104.field2308.method5167(var101);
                var104.field2308.method5168(var102);
                var104.field2308.method5253(var103);
                var104.field2308.method5253(field428);
                field679.method2177(var104);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2114 == arg0.field1286) {
                int var105 = var3.method5162();
                int var106 = var3.method5161();
                int var107 = var3.method5162();
                int var108 = var3.method5155();
                class218 var109 = class218.method3416(var108);
                if (var109.field2600 != var107 || var109.field2601 != var106 || var109.field2603 != var105) {
                    var109.field2600 = var107;
                    var109.field2601 = var106;
                    var109.field2603 = var105;
                    method166(var109);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1286) {
                method284(false, var3);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2106 == arg0.field1286) {
                method3374(var3.method5132());
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2113 == arg0.field1286) {
                method19();
                arg0.field1286 = null;
                return false;
            }
            if (class183.field2095 == arg0.field1286) {
                int var110 = var3.method5155();
                int var111 = var3.method5166();
                if (var110 < -70000) {
                    var111 += 32768;
                }
                class218 var112;
                if (var110 >= 0) {
                    var112 = class218.method3416(var110);
                } else {
                    var112 = null;
                }
                if (var112 != null) {
                    for (int var113 = 0; var113 < var112.field2602.length; var113++) {
                        var112.field2602[var113] = 0;
                        var112.field2674[var113] = 0;
                    }
                }
                class60.method4961(var111);
                int var114 = var3.method5166();
                for (int var115 = 0; var115 < var114; var115++) {
                    int var116 = var3.method5211();
                    if (var116 == 255) {
                        var116 = var3.method5170();
                    }
                    int var117 = var3.method5162();
                    if (var112 != null && var115 < var112.field2602.length) {
                        var112.field2602[var115] = var117;
                        var112.field2674[var115] = var116;
                    }
                    class60.method565(var111, var115, var117 - 1, var116);
                }
                if (var112 != null) {
                    method166(var112);
                }
                method3089();
                field817[++field821 - 1 & 0x1F] = var111 & 0x7FFF;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1286) {
                field834 = true;
                Statics.field3584 = var3.method5123();
                Statics.field402 = var3.method5123();
                Statics.field1714 = var3.method5166();
                Statics.field2037 = var3.method5123();
                Statics.field511 = var3.method5123();
                if (Statics.field511 >= 100) {
                    int var118 = Statics.field3584 * 128 + 64;
                    int var119 = Statics.field402 * 128 + 64;
                    int var120 = method1942(var118, var119, Statics.field625) - Statics.field1714;
                    int var121 = var118 - Statics.field1922;
                    int var122 = var120 - Statics.field95;
                    int var123 = var119 - Statics.field80;
                    int var124 = (int) Math.sqrt((double) (var121 * var121 + var123 * var123));
                    Statics.field3278 = (int) (Math.atan2((double) var122, (double) var124) * 325.949D) & 0x7FF;
                    Statics.field336 = (int) (Math.atan2((double) var121, (double) var123) * -325.949D) & 0x7FF;
                    if (Statics.field3278 < 128) {
                        Statics.field3278 = 128;
                    }
                    if (Statics.field3278 > 383) {
                        Statics.field3278 = 383;
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2102 == arg0.field1286) {
                method395(class186.field2295);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2104 == arg0.field1286) {
                for (int var125 = 0; var125 < Statics.field3191; var125++) {
                    class241 var126 = class241.method2125(var125);
                    if (var126 != null) {
                        class213.field2505[var125] = 0;
                        class213.field2507[var125] = 0;
                    }
                }
                method3089();
                field680 += 32;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1286) {
                method395(class186.field2293);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1286) {
                int var127 = var3.method5166();
                byte var128 = var3.method5154();
                class213.field2505[var127] = var128;
                if (class213.field2507[var127] != var128) {
                    class213.field2507[var127] = var128;
                }
                method310(var127);
                field818[++field680 - 1 & 0x1F] = var127;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1286) {
                int var129 = var3.method5161();
                int var130 = var3.method5310();
                class218 var131 = class218.method3416(var130);
                if (var131.field2662 != 2 || var131.field2593 != var129) {
                    var131.field2662 = 2;
                    var131.field2593 = var129;
                    method166(var131);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1286) {
                for (int var132 = 0; var132 < class213.field2507.length; var132++) {
                    if (class213.field2507[var132] != class213.field2505[var132]) {
                        class213.field2507[var132] = class213.field2505[var132];
                        method310(var132);
                        field818[++field680 - 1 & 0x1F] = var132;
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1286) {
                class72 var133 = new class72();
                var133.field1002 = var3.method5132();
                var133.field999 = var3.method5166();
                int var134 = var3.method5155();
                var133.field1000 = var134;
                method2725(45);
                var2.method3292();
                Object var135 = null;
                class86.method1104(var133);
                arg0.field1286 = null;
                return false;
            }
            if (class183.field2165 == arg0.field1286) {
                method3289(false, arg0.field1285);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1286) {
                int var136 = var3.method5160();
                int var137 = var3.method5153();
                int var138 = var3.method5155();
                class62 var139 = (class62) field793.method5528((long) var138);
                if (var139 != null) {
                    method1206(var139, var139.field549 != var136);
                }
                method306(var138, var136, var137);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1286) {
                Statics.field1296.method1761(var3, arg0.field1289);
                field825 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2093 == arg0.field1286) {
                int var140 = var3.method5123();
                method3095(var140);
                arg0.field1286 = null;
                return false;
            }
            if (class183.field2120 == arg0.field1286) {
                class97.method735(var3, arg0.field1289);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1286) {
                String var141 = var3.method5132();
                long var142 = (long) var3.method5166();
                long var144 = (long) var3.method5127();
                class229 var146 = (class229) class196.method292(class229.method800(), var3.method5123());
                long var147 = (var142 << 32) + var144;
                boolean var149 = false;
                for (int var150 = 0; var150 < 100; var150++) {
                    if (field853[var150] == var147) {
                        var149 = true;
                        break;
                    }
                }
                if (Statics.field1296.method1826(new class283(var141, Statics.field536))) {
                    var149 = true;
                }
                if (!var149 && field746 == 0) {
                    field853[field722] = var147;
                    field722 = (field722 + 1) % 100;
                    String var151 = class296.method5037(class291.method3853(class211.method58(var3)));
                    byte var152;
                    if (var146.field3082) {
                        var152 = 7;
                    } else {
                        var152 = 3;
                    }
                    if (var146.field3080 == -1) {
                        class92.method522(var152, var141, var151);
                    } else {
                        class92.method522(var152, class82.method90(var146.field3080) + var141, var151);
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1286) {
                int var153 = var3.method5163();
                int var154 = var3.method5170();
                int var155 = var3.method5126();
                class218 var156 = class218.method3416(var154);
                if (var156.field2554 != var155 || var156.field2559 != var153 || var156.field2621 != 0 || var156.field2555 != 0) {
                    var156.field2554 = var155;
                    var156.field2559 = var153;
                    var156.field2621 = 0;
                    var156.field2555 = 0;
                    method166(var156);
                    this.method1235(var156);
                    if (var156.field2630 == 0) {
                        method707(Statics.field2540[var154 >> 16], var156, false);
                    }
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2117 == arg0.field1286) {
                int var157 = var3.method5170();
                int var158 = var3.method5160();
                int var159 = var158 >> 10 & 0x1F;
                int var160 = var158 >> 5 & 0x1F;
                int var161 = var158 & 0x1F;
                int var162 = (var161 << 3) + (var159 << 19) + (var160 << 11);
                class218 var163 = class218.method3416(var157);
                if (var163.field2574 != var162) {
                    var163.field2574 = var162;
                    method166(var163);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1286) {
                field862 = var3.method5123();
                if (field862 == 255) {
                    field862 = 0;
                }
                field863 = var3.method5123();
                if (field863 == 255) {
                    field863 = 0;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2107 == arg0.field1286) {
                method3089();
                field633 = var3.method5123();
                field835 = field757;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1286) {
                int var164 = var3.method5155();
                class218 var165 = class218.method3416(var164);
                for (int var166 = 0; var166 < var165.field2602.length; var166++) {
                    var165.field2602[var166] = -1;
                    var165.field2602[var166] = 0;
                }
                method166(var165);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1286) {
                int var167 = var3.method5211();
                int var168 = var3.method5123();
                String var169 = var3.method5132();
                if (var168 >= 1 && var168 <= 8) {
                    if (var169.equalsIgnoreCase(class225.field2836)) {
                        var169 = null;
                    }
                    field739[var168 - 1] = var169;
                    field816[var168 - 1] = var167 == 0;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2100 == arg0.field1286) {
                int var170 = var3.method5310();
                class218 var171 = class218.method3416(var170);
                var171.field2662 = 3;
                var171.field2593 = Statics.field2530.field597.method3750();
                method166(var171);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1286) {
                field834 = false;
                for (int var172 = 0; var172 < 5; var172++) {
                    field642[var172] = false;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1286) {
                int var173 = var3.method5166();
                int var174 = var3.method5123();
                int var175 = var3.method5166();
                method3414(var173, var174, var175);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1286) {
                method395(class186.field2301);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1286) {
                int var176 = var3.method5117();
                boolean var177 = var3.method5123() == 1;
                class218 var178 = class218.method3416(var176);
                if (var178.field2570 != var177) {
                    var178.field2570 = var177;
                    method166(var178);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1286) {
                Statics.field2502 = var3.method5123();
                Statics.field62 = var3.method5153();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1286) {
                field848 = var3.method5153();
                field849 = var3.method5123();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2115 == arg0.field1286) {
                field834 = true;
                Statics.field89 = var3.method5123();
                Statics.field361 = var3.method5123();
                Statics.field232 = var3.method5166();
                Statics.field324 = var3.method5123();
                Statics.field1069 = var3.method5123();
                if (Statics.field1069 >= 100) {
                    Statics.field1922 = Statics.field89 * 128 + 64;
                    Statics.field80 = Statics.field361 * 128 + 64;
                    Statics.field95 = method1942(Statics.field1922, Statics.field80, Statics.field625) - Statics.field232;
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2101 == arg0.field1286) {
                if (field697 != -1) {
                    method1999(field697, 0);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2129 == arg0.field1286) {
                method3089();
                int var179 = var3.method5211();
                int var180 = var3.method5117();
                int var181 = var3.method5123();
                field766[var179] = var180;
                field764[var179] = var181;
                field765[var179] = 1;
                for (int var182 = 0; var182 < 98; var182++) {
                    if (var180 >= class222.field2729[var182]) {
                        field765[var179] = var182 + 2;
                    }
                }
                field822[++field823 - 1 & 0x1F] = var179;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2103 == arg0.field1286) {
                String var183 = var3.method5132();
                String var184 = class296.method5037(class291.method3853(class211.method58(var3)));
                class92.method522(6, var183, var184);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1286) {
                int var185 = var3.method5117();
                int var186 = var3.method5160();
                class213.field2505[var186] = var185;
                if (class213.field2507[var186] != var185) {
                    class213.field2507[var186] = var185;
                }
                method310(var186);
                field818[++field680 - 1 & 0x1F] = var186;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1286) {
                var3.field3694 += 28;
                if (var3.method5147()) {
                    method71(var3, var3.field3694 - 28);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2111 == arg0.field1286) {
                int var187 = var3.method5117();
                String var188 = var3.method5132();
                class218 var189 = class218.method3416(var187);
                if (!var188.equals(var189.field2599)) {
                    var189.field2599 = var188;
                    method166(var189);
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1286) {
                method395(class186.field2294);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1286) {
                if (arg0.field1289 == 0) {
                    Statics.field28 = null;
                } else {
                    if (Statics.field28 == null) {
                        Statics.field28 = new class285(Statics.field536, Statics.field257);
                    }
                    Statics.field28.method4881(var3);
                }
                method3681();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1286) {
                boolean var190 = var3.method5134();
                if (!var190) {
                    Statics.field31 = null;
                } else if (Statics.field31 == null) {
                    Statics.field31 = new class238();
                }
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2151 == arg0.field1286) {
                method395(class186.field2299);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2122 == arg0.field1286) {
                field864 = var3.method5123();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1286) {
                String var191 = var3.method5132();
                Object[] var192 = new Object[var191.length() + 1];
                for (int var193 = var191.length() - 1; var193 >= 0; var193--) {
                    if (var191.charAt(var193) == 's') {
                        var192[var193 + 1] = var3.method5132();
                    } else {
                        var192[var193 + 1] = Integer.valueOf(var3.method5155());
                    }
                }
                var192[0] = Integer.valueOf(var3.method5155());
                class63 var194 = new class63();
                var194.field558 = var192;
                class77.method165(var194);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2109 == arg0.field1286) {
                if (Statics.field28 != null) {
                    Statics.field28.method4878(var3);
                }
                method3681();
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1286) {
                method395(class186.field2292);
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1286) {
                int var195 = var3.method5162();
                int var196 = var3.method5310();
                int var197 = var3.method5162();
                class218 var198 = class218.method3416(var196);
                var198.field2605 = (var195 << 16) + var197;
                arg0.field1286 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1286) {
                Statics.field1296.field1044.method4754(var3, arg0.field1289);
                method701();
                field825 = field757;
                arg0.field1286 = null;
                return true;
            }
            class341.method4728("" + (arg0.field1286 == null ? -1 : arg0.field1286.field2178) + class82.field1128 + (arg0.field1287 == null ? -1 : arg0.field1287.field2178) + class82.field1128 + (arg0.field1293 == null ? -1 : arg0.field1293.field2178) + class82.field1128 + arg0.field1289, (Throwable) null);
            method19();
        } catch (IOException var203) {
            method547();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1286 == null ? -1 : arg0.field1286.field2178) + class82.field1128 + (arg0.field1287 == null ? -1 : arg0.field1287.field2178) + class82.field1128 + (arg0.field1293 == null ? -1 : arg0.field1293.field2178) + class82.field1128 + arg0.field1289 + class82.field1128 + (Statics.field1961 + Statics.field2530.field924[0]) + class82.field1128 + (Statics.field1108 + Statics.field2530.field931[0]) + class82.field1128;
            for (int var202 = 0; var202 < arg0.field1289 && var202 < 50; var202++) {
                var201 = var201 + var3.field3699[var202] + class82.field1128;
            }
            class341.method4728(var201, var204);
            method19();
        }
        return true;
    }

    @ObfuscatedName("aw.ht(Lge;I)V")
    public static final void method395(class186 arg0) {
        class299 var1 = field679.field1285;
        if (class186.field2301 == arg0) {
            int var2 = var1.method5166();
            int var3 = var1.method5123();
            int var4 = (var3 >> 4 & 0x7) + Statics.field2502;
            int var5 = (var3 & 0x7) + Statics.field62;
            int var6 = var1.method5211();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field693[var7];
            if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                if (var9 == 0) {
                    class137 var10 = Statics.field207.method2928(Statics.field625, var4, var5);
                    if (var10 != null) {
                        int var11 = class129.method3196(var10.field1857);
                        if (var7 == 2) {
                            var10.field1855 = new class94(var11, 2, var8 + 4, Statics.field625, var4, var5, var2, false, var10.field1855);
                            var10.field1856 = new class94(var11, 2, var8 + 1 & 0x3, Statics.field625, var4, var5, var2, false, var10.field1856);
                        } else {
                            var10.field1855 = new class94(var11, var7, var8, Statics.field625, var4, var5, var2, false, var10.field1855);
                        }
                    }
                }
                if (var9 == 1) {
                    class142 var12 = Statics.field207.method3042(Statics.field625, var4, var5);
                    if (var12 != null) {
                        int var13 = class129.method3196(var12.field1900);
                        if (var7 == 4 || var7 == 5) {
                            var12.field1898 = new class94(var13, 4, var8, Statics.field625, var4, var5, var2, false, var12.field1898);
                        } else if (var7 == 6) {
                            var12.field1898 = new class94(var13, 4, var8 + 4, Statics.field625, var4, var5, var2, false, var12.field1898);
                        } else if (var7 == 7) {
                            var12.field1898 = new class94(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field625, var4, var5, var2, false, var12.field1898);
                        } else if (var7 == 8) {
                            var12.field1898 = new class94(var13, 4, var8 + 4, Statics.field625, var4, var5, var2, false, var12.field1898);
                            var12.field1899 = new class94(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field625, var4, var5, var2, false, var12.field1899);
                        }
                    }
                }
                if (var9 == 2) {
                    class143 var14 = Statics.field207.method2930(Statics.field625, var4, var5);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var14 != null) {
                        var14.field1907 = new class94(class129.method3196(var14.field1905), var7, var8, Statics.field625, var4, var5, var2, false, var14.field1907);
                    }
                }
                if (var9 == 3) {
                    class124 var15 = Statics.field207.method2931(Statics.field625, var4, var5);
                    if (var15 != null) {
                        var15.field1588 = new class94(class129.method3196(var15.field1589), 22, var8, Statics.field625, var4, var5, var2, false, var15.field1588);
                    }
                }
            }
        } else if (class186.field2294 == arg0) {
            int var16 = var1.method5153();
            int var17 = var1.method5162();
            int var18 = var1.method5162();
            int var19 = var1.method5123();
            int var20 = (var19 >> 4 & 0x7) + Statics.field2502;
            int var21 = (var19 & 0x7) + Statics.field62;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                int var22 = var20 * 128 + 64;
                int var23 = var21 * 128 + 64;
                class78 var24 = new class78(var18, Statics.field625, var22, var23, method1942(var22, var23, Statics.field625) - var16, var17, field643);
                field763.method4576(var24);
            }
        } else if (class186.field2299 == arg0) {
            int var25 = var1.method5164();
            int var26 = var1.method5136();
            int var27 = var1.method5136() * 4;
            int var28 = var1.method5161();
            int var29 = var1.method5123();
            int var30 = (var29 >> 4 & 0x7) + Statics.field2502;
            int var31 = (var29 & 0x7) + Statics.field62;
            int var32 = var1.method5153() * 4;
            int var33 = var1.method5161();
            byte var34 = var1.method5185();
            byte var35 = var1.method5185();
            int var36 = var1.method5211();
            int var37 = var1.method5161();
            int var38 = var30 + var34;
            int var39 = var31 + var35;
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var28 != 65535) {
                int var40 = var30 * 128 + 64;
                int var41 = var31 * 128 + 64;
                int var42 = var38 * 128 + 64;
                int var43 = var39 * 128 + 64;
                class87 var44 = new class87(var28, Statics.field625, var40, var41, method1942(var40, var41, Statics.field625) - var27, field643 + var33, field643 + var37, var36, var26, var25, var32);
                var44.method2039(var42, var43, method1942(var42, var43, Statics.field625) - var32, field643 + var33);
                field762.method4576(var44);
            }
        } else if (class186.field2293 == arg0) {
            int var45 = var1.method5166();
            int var46 = var1.method5160();
            int var47 = var1.method5123();
            int var48 = (var47 >> 4 & 0x7) + Statics.field2502;
            int var49 = (var47 & 0x7) + Statics.field62;
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class88 var50 = new class88();
                var50.field1218 = var46;
                var50.field1219 = var45;
                if (field760[Statics.field625][var48][var49] == null) {
                    field760[Statics.field625][var48][var49] = new class262();
                }
                field760[Statics.field625][var48][var49].method4576(var50);
                method51(var48, var49);
            }
        } else {
            if (class186.field2292 == arg0) {
                int var51 = var1.method5162();
                int var52 = var1.method5166();
                int var53 = var1.method5136();
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = field693[var54];
                int var57 = var1.method5166();
                byte var58 = var1.method5277();
                int var59 = var1.method5211();
                int var60 = (var59 >> 4 & 0x7) + Statics.field2502;
                int var61 = (var59 & 0x7) + Statics.field62;
                int var62 = var1.method5160();
                byte var63 = var1.method5154();
                byte var64 = var1.method5268();
                byte var65 = var1.method5185();
                class67 var66;
                if (field738 == var62) {
                    var66 = Statics.field2530;
                } else {
                    var66 = field748[var62];
                }
                if (var66 != null) {
                    class254 var67 = class254.method3848(var52);
                    int var68;
                    int var69;
                    if (var55 == 1 || var55 == 3) {
                        var68 = var67.field3378;
                        var69 = var67.field3342;
                    } else {
                        var68 = var67.field3342;
                        var69 = var67.field3378;
                    }
                    int var70 = (var68 >> 1) + var60;
                    int var71 = (var68 + 1 >> 1) + var60;
                    int var72 = (var69 >> 1) + var61;
                    int var73 = (var69 + 1 >> 1) + var61;
                    int[][] var74 = class56.field482[Statics.field625];
                    int var75 = var74[var70][var72] + var74[var71][var72] + var74[var70][var73] + var74[var71][var73] >> 2;
                    int var76 = (var60 << 7) + (var68 << 6);
                    int var77 = (var61 << 7) + (var69 << 6);
                    class128 var78 = var67.method4299(var54, var55, var74, var76, var75, var77);
                    if (var78 != null) {
                        method72(Statics.field625, var60, var61, var56, -1, 0, 0, var51 + 1, var57 + 1);
                        var66.field611 = field643 + var51;
                        var66.field606 = field643 + var57;
                        var66.field610 = var78;
                        var66.field621 = var60 * 128 + var68 * 64;
                        var66.field614 = var61 * 128 + var69 * 64;
                        var66.field608 = var75;
                        if (var64 > var58) {
                            byte var79 = var64;
                            var64 = var58;
                            var58 = var79;
                        }
                        if (var65 > var63) {
                            byte var80 = var65;
                            var65 = var63;
                            var63 = var80;
                        }
                        var66.field596 = var60 + var64;
                        var66.field613 = var58 + var60;
                        var66.field612 = var61 + var65;
                        var66.field605 = var61 + var63;
                    }
                }
            }
            if (class186.field2300 == arg0) {
                int var81 = var1.method5136();
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field693[var82];
                int var85 = var1.method5123();
                int var86 = (var85 >> 4 & 0x7) + Statics.field2502;
                int var87 = (var85 & 0x7) + Statics.field62;
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    method72(Statics.field625, var86, var87, var84, -1, var82, var83, 0, -1);
                }
            } else if (class186.field2297 == arg0) {
                int var88 = var1.method5136();
                int var89 = (var88 >> 4 & 0x7) + Statics.field2502;
                int var90 = (var88 & 0x7) + Statics.field62;
                int var91 = var1.method5162();
                int var92 = var1.method5153();
                int var93 = var92 >> 2;
                int var94 = var92 & 0x3;
                int var95 = field693[var93];
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    method72(Statics.field625, var89, var90, var95, var91, var93, var94, 0, -1);
                }
            } else if (class186.field2298 == arg0) {
                int var96 = var1.method5161();
                int var97 = var1.method5162();
                int var98 = var1.method5123();
                int var99 = (var98 >> 4 & 0x7) + Statics.field2502;
                int var100 = (var98 & 0x7) + Statics.field62;
                int var101 = var1.method5161();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    class262 var102 = field760[Statics.field625][var99][var100];
                    if (var102 != null) {
                        for (class88 var103 = (class88) var102.method4581(); var103 != null; var103 = (class88) var102.method4589()) {
                            if ((var96 & 0x7FFF) == var103.field1218 && var103.field1219 == var101) {
                                var103.field1219 = var97;
                                break;
                            }
                        }
                        method51(var99, var100);
                    }
                }
            } else if (class186.field2295 == arg0) {
                int var104 = var1.method5166();
                int var105 = var1.method5136();
                int var106 = (var105 >> 4 & 0x7) + Statics.field2502;
                int var107 = (var105 & 0x7) + Statics.field62;
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class262 var108 = field760[Statics.field625][var106][var107];
                    if (var108 != null) {
                        for (class88 var109 = (class88) var108.method4581(); var109 != null; var109 = (class88) var108.method4589()) {
                            if ((var104 & 0x7FFF) == var109.field1218) {
                                var109.method3386();
                                break;
                            }
                        }
                        if (var108.method4581() == null) {
                            field760[Statics.field625][var106][var107] = null;
                        }
                        method51(var106, var107);
                    }
                }
            } else if (class186.field2296 == arg0) {
                int var110 = var1.method5136();
                int var111 = var1.method5211();
                int var112 = var111 >> 4 & 0xF;
                int var113 = var111 & 0x7;
                int var114 = var1.method5211();
                int var115 = (var114 >> 4 & 0x7) + Statics.field2502;
                int var116 = (var114 & 0x7) + Statics.field62;
                int var117 = var1.method5160();
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    int var118 = var112 + 1;
                    if (Statics.field2530.field924[0] >= var115 - var118 && Statics.field2530.field924[0] <= var115 + var118 && Statics.field2530.field931[0] >= var116 - var118 && Statics.field2530.field931[0] <= var116 + var118 && field869 != 0 && var113 > 0 && field794 < 50) {
                        field890[field794] = var117;
                        field872[field794] = var113;
                        field873[field794] = var110;
                        field875[field794] = null;
                        field874[field794] = (var115 << 16) + (var116 << 8) + var112;
                        field794++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.hc(IIIIIIIIIB)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field761.method4581(); var10 != null; var10 = (class69) field761.method4589()) {
            if (var10.field919 == arg0 && var10.field911 == arg1 && var10.field912 == arg2 && var10.field922 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field919 = arg0;
            var9.field922 = arg3;
            var9.field911 = arg1;
            var9.field912 = arg2;
            method3092(var9);
            field761.method4576(var9);
        }
        var9.field916 = arg4;
        var9.field918 = arg5;
        var9.field910 = arg6;
        var9.field909 = arg7;
        var9.field920 = arg8;
    }

    @ObfuscatedName("eq.hl(Lbn;I)V")
    public static final void method3092(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field922 == 0) {
            var1 = Statics.field207.method2932(arg0.field919, arg0.field911, arg0.field912);
        }
        if (arg0.field922 == 1) {
            var1 = Statics.field207.method2933(arg0.field919, arg0.field911, arg0.field912);
        }
        if (arg0.field922 == 2) {
            var1 = Statics.field207.method3039(arg0.field919, arg0.field911, arg0.field912);
        }
        if (arg0.field922 == 3) {
            var1 = Statics.field207.method2956(arg0.field919, arg0.field911, arg0.field912);
        }
        if (var1 != 0L) {
            int var6 = Statics.field207.method2936(arg0.field919, arg0.field911, arg0.field912, var1);
            var3 = class129.method3196(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field913 = var3;
        arg0.field915 = var4;
        arg0.field914 = var5;
    }

    @ObfuscatedName("m.hy(IIIIIIIB)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field637 && Statics.field625 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field207.method2932(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field207.method2933(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field207.method3039(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field207.method2956(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field207.method2936(arg0, arg2, arg3, var7);
            int var13 = class129.method3196(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field207.method2923(arg0, arg2, arg3);
                class254 var16 = class254.method3848(var13);
                if (var16.field3377 != 0) {
                    field812[arg0].method3333(arg2, arg3, var14, var15, var16.field3356);
                }
            }
            if (arg1 == 1) {
                Statics.field207.method2924(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field207.method2925(arg0, arg2, arg3);
                class254 var17 = class254.method3848(var13);
                if (var17.field3342 + arg2 > 103 || var17.field3342 + arg3 > 103 || var17.field3378 + arg2 > 103 || var17.field3378 + arg3 > 103) {
                    return;
                }
                if (var17.field3377 != 0) {
                    field812[arg0].method3334(arg2, arg3, var17.field3342, var17.field3378, var15, var17.field3356);
                }
            }
            if (arg1 == 3) {
                Statics.field207.method2908(arg0, arg2, arg3);
                class254 var18 = class254.method3848(var13);
                if (var18.field3377 == 1) {
                    field812[arg0].method3336(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field488[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class134 var20 = Statics.field207;
        class173 var21 = field812[arg0];
        class254 var22 = class254.method3848(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3378;
            var24 = var22.field3342;
        } else {
            var23 = var22.field3342;
            var24 = var22.field3378;
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
        int[][] var29 = class56.field482[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class129.method3245(arg2, arg3, 2, var22.field3357 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3346 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class136 var36;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var36 = var22.method4299(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class94(arg4, 22, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3377 == 1) {
                var21.method3331(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var62;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var62 = var22.method4299(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class94(arg4, 10, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            if (var62 != null) {
                var20.method2916(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3377 != 0) {
                var21.method3329(arg2, arg3, var23, var24, var22.field3356);
            }
        } else if (arg6 >= 12) {
            class136 var37;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var37 = var22.method4299(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2916(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3377 != 0) {
                var21.method3329(arg2, arg3, var23, var24, var22.field3356);
            }
        } else if (arg6 == 0) {
            class136 var38;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var38 = var22.method4299(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class94(arg4, 0, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var38, (class136) null, class56.field490[arg5], 0, var33, var35);
            if (var22.field3377 != 0) {
                var21.method3328(arg2, arg3, arg6, arg5, var22.field3356);
            }
        } else if (arg6 == 1) {
            class136 var39;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var39 = var22.method4299(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class94(arg4, 1, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var39, (class136) null, class56.field491[arg5], 0, var33, var35);
            if (var22.field3377 != 0) {
                var21.method3328(arg2, arg3, arg6, arg5, var22.field3356);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class136 var41;
            class136 var42;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var41 = var22.method4299(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4299(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class94(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3361, true, (class136) null);
                var42 = new class94(arg4, 2, var40, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var41, var42, class56.field490[arg5], class56.field490[var40], var33, var35);
            if (var22.field3377 != 0) {
                var21.method3328(arg2, arg3, arg6, arg5, var22.field3356);
            }
        } else if (arg6 == 3) {
            class136 var43;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var43 = var22.method4299(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class94(arg4, 3, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2914(arg0, arg2, arg3, var30, var43, (class136) null, class56.field491[arg5], 0, var33, var35);
            if (var22.field3377 != 0) {
                var21.method3328(arg2, arg3, arg6, arg5, var22.field3356);
            }
        } else if (arg6 == 9) {
            class136 var44;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var44 = var22.method4299(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2916(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3377 != 0) {
                var21.method3329(arg2, arg3, var23, var24, var22.field3356);
            }
        } else if (arg6 == 4) {
            class136 var45;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var45 = var22.method4299(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2915(arg0, arg2, arg3, var30, var45, (class136) null, class56.field490[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2932(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class254.method3848(class129.method3196(var47)).field3362;
            }
            class136 var49;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var49 = var22.method4299(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2915(arg0, arg2, arg3, var30, var49, (class136) null, class56.field490[arg5], 0, class56.field492[arg5] * var46, class56.field499[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2932(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class254.method3848(class129.method3196(var51)).field3362 / 2;
            }
            class136 var53;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var53 = var22.method4299(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2915(arg0, arg2, arg3, var30, var53, (class136) null, 256, arg5, class56.field494[arg5] * var50, class56.field495[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class136 var55;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var55 = var22.method4299(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class94(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2915(arg0, arg2, arg3, var30, var55, (class136) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2932(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class254.method3848(class129.method3196(var57)).field3362 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class136 var60;
            class136 var61;
            if (var22.field3361 == -1 && var22.field3354 == null) {
                var60 = var22.method4299(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4299(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3361, true, (class136) null);
                var61 = new class94(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3361, true, (class136) null);
            }
            var20.method2915(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class56.field494[arg5] * var56, class56.field495[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("v.hr(III)V")
    public static final void method51(int arg0, int arg1) {
        class262 var2 = field760[Statics.field625][arg0][arg1];
        if (var2 == null) {
            Statics.field207.method2927(Statics.field625, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4581(); var6 != null; var6 = (class88) var2.method4589()) {
            class255 var7 = class255.method3852(var6.field1218);
            long var8 = (long) var7.field3413;
            if (var7.field3442 == 1) {
                var8 = (long) (var6.field1219 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field207.method2927(Statics.field625, arg0, arg1);
            return;
        }
        var2.method4577(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4581(); var12 != null; var12 = (class88) var2.method4589()) {
            if (var5.field1218 != var12.field1218) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1218 != var12.field1218 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method3245(arg0, arg1, 3, false, 0);
        Statics.field207.method2913(Statics.field625, arg0, arg1, method1942(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field625), var5, var13, var10, var11);
    }

    @ObfuscatedName("f.hp(ZLkf;I)V")
    public static final void method284(boolean arg0, class299 arg1) {
        field753 = 0;
        field677 = 0;
        method527();
        method592(arg0, arg1);
        method3247(arg1);
        for (int var2 = 0; var2 < field753; var2++) {
            int var3 = field871[var2];
            if (field643 != field674[var3].field941) {
                field674[var3].field1114 = null;
                field674[var3] = null;
            }
        }
        if (field679.field1289 != arg1.field3694) {
            throw new RuntimeException(arg1.field3694 + class82.field1128 + field679.field1289);
        }
        for (int var4 = 0; var4 < field665; var4++) {
            if (field674[field690[var4]] == null) {
                throw new RuntimeException(var4 + class82.field1128 + field665);
            }
        }
    }

    @ObfuscatedName("ad.hs(B)V")
    public static final void method527() {
        class299 var0 = field679.field1285;
        var0.method5073();
        int var1 = var0.method5074(8);
        if (var1 < field665) {
            for (int var2 = var1; var2 < field665; var2++) {
                field871[++field753 - 1] = field690[var2];
            }
        }
        if (var1 > field665) {
            throw new RuntimeException("");
        }
        field665 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field690[var3];
            class80 var5 = field674[var4];
            int var6 = var0.method5074(1);
            if (var6 == 0) {
                field690[++field665 - 1] = var4;
                var5.field941 = field643;
            } else {
                int var7 = var0.method5074(2);
                if (var7 == 0) {
                    field690[++field665 - 1] = var4;
                    var5.field941 = field643;
                    field678[++field677 - 1] = var4;
                } else if (var7 == 1) {
                    field690[++field665 - 1] = var4;
                    var5.field941 = field643;
                    int var8 = var0.method5074(3);
                    var5.method1962(var8, (byte) 1);
                    int var9 = var0.method5074(1);
                    if (var9 == 1) {
                        field678[++field677 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field690[++field665 - 1] = var4;
                    var5.field941 = field643;
                    int var10 = var0.method5074(3);
                    var5.method1962(var10, (byte) 2);
                    int var11 = var0.method5074(3);
                    var5.method1962(var11, (byte) 2);
                    int var12 = var0.method5074(1);
                    if (var12 == 1) {
                        field678[++field677 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field871[++field753 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ax.ho(ZLkf;S)V")
    public static final void method592(boolean arg0, class299 arg1) {
        while (true) {
            if (arg1.method5076(field679.field1289) >= 27) {
                int var2 = arg1.method5074(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field674[var2] == null) {
                        field674[var2] = new class80();
                        var3 = true;
                    }
                    class80 var4 = field674[var2];
                    field690[++field665 - 1] = var2;
                    var4.field941 = field643;
                    int var5 = field758[arg1.method5074(3)];
                    if (var3) {
                        var4.field927 = var4.field944 = var5;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method5074(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method5074(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method5074(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method5074(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = arg1.method5074(1);
                    if (var8 == 1) {
                        field678[++field677 - 1] = var2;
                    }
                    var4.field1114 = class257.method1054(arg1.method5074(14));
                    int var9 = arg1.method5074(1);
                    var4.field928 = var4.field1114.field3460;
                    var4.field978 = var4.field1114.field3468;
                    if (var4.field978 == 0) {
                        var4.field944 = 0;
                    }
                    var4.field976 = var4.field1114.field3466;
                    var4.field934 = var4.field1114.field3467;
                    var4.field969 = var4.field1114.field3457;
                    var4.field936 = var4.field1114.field3456;
                    var4.field965 = var4.field1114.field3463;
                    var4.field925 = var4.field1114.field3484;
                    var4.field932 = var4.field1114.field3455;
                    var4.method1964(Statics.field2530.field924[0] + var6, Statics.field2530.field931[0] + var7, var9 == 1);
                    continue;
                }
            }
            arg1.method5075();
            return;
        }
    }

    @ObfuscatedName("fp.hq(Lkf;I)V")
    public static final void method3247(class299 arg0) {
        for (int var1 = 0; var1 < field677; var1++) {
            int var2 = field678[var1];
            class80 var3 = field674[var2];
            int var4 = arg0.method5123();
            if ((var4 & 0x2) != 0) {
                int var5 = arg0.method5160();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method5153();
                if (var3.field957 == var5 && var5 != -1) {
                    int var7 = class259.method3856(var5).field3522;
                    if (var7 == 1) {
                        var3.field958 = 0;
                        var3.field959 = 0;
                        var3.field960 = var6;
                        var3.field961 = 0;
                    }
                    if (var7 == 2) {
                        var3.field961 = 0;
                    }
                } else if (var5 == -1 || var3.field957 == -1 || class259.method3856(var5).field3520 >= class259.method3856(var3.field957).field3520) {
                    var3.field957 = var5;
                    var3.field958 = 0;
                    var3.field959 = 0;
                    var3.field960 = var6;
                    var3.field961 = 0;
                    var3.field984 = var3.field979;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field947 = arg0.method5161();
                if (var3.field947 == 65535) {
                    var3.field947 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field962 = arg0.method5161();
                int var8 = arg0.method5117();
                var3.field966 = var8 >> 16;
                var3.field974 = (var8 & 0xFFFF) + field643;
                var3.field963 = 0;
                var3.field964 = 0;
                if (var3.field974 > field643) {
                    var3.field963 = -1;
                }
                if (var3.field962 == 65535) {
                    var3.field962 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var9 = arg0.method5161();
                int var10 = arg0.method5162();
                int var11 = var3.field930 - (var9 - Statics.field1961 - Statics.field1961) * 64;
                int var12 = var3.field933 - (var10 - Statics.field1108 - Statics.field1108) * 64;
                if (var11 != 0 || var12 != 0) {
                    var3.field935 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field948 = arg0.method5132();
                var3.field951 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1114 = class257.method1054(arg0.method5166());
                var3.field928 = var3.field1114.field3460;
                var3.field978 = var3.field1114.field3468;
                var3.field976 = var3.field1114.field3466;
                var3.field934 = var3.field1114.field3467;
                var3.field969 = var3.field1114.field3457;
                var3.field936 = var3.field1114.field3456;
                var3.field965 = var3.field1114.field3463;
                var3.field925 = var3.field1114.field3484;
                var3.field932 = var3.field1114.field3455;
            }
            if ((var4 & 0x40) != 0) {
                int var13 = arg0.method5153();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method5309();
                        if (var18 == 32767) {
                            var18 = arg0.method5309();
                            var16 = arg0.method5309();
                            var15 = arg0.method5309();
                            var17 = arg0.method5309();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method5309();
                        }
                        int var19 = arg0.method5309();
                        var3.method1653(var18, var16, var15, var17, field643, var19);
                    }
                }
                int var20 = arg0.method5211();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method5309();
                        int var23 = arg0.method5309();
                        if (var23 == 32767) {
                            var3.method1655(var22);
                        } else {
                            int var24 = arg0.method5309();
                            int var25 = arg0.method5123();
                            int var26 = var23 > 0 ? arg0.method5153() : var25;
                            var3.method1654(var22, field643, var23, var24, var25, var26);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.ig(IIS)Lfc;")
    public static class175 method567(int arg0, int arg1) {
        field905.field2078 = arg0;
        field905.field2077 = arg1;
        field905.field2080 = 1;
        field905.field2079 = 1;
        return field905;
    }

    @ObfuscatedName("gx.ij(B)V")
    public static void method3400() {
        field769 = 0;
        field884 = false;
        field774[0] = class225.field2842;
        field775[0] = "";
        field772[0] = 1006;
        field776[0] = false;
        field769 = 1;
    }

    @ObfuscatedName("u.ip(B)V")
    public static final void method304() {
        int var0 = Statics.field2437;
        int var1 = Statics.field1511;
        int var2 = Statics.field373;
        int var3 = Statics.field339;
        int var4 = 6116423;
        class321.method5585(var0, var1, var2, var3, var4);
        class321.method5585(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class321.method5620(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field366.method4987(class225.field2900, var0 + 3, var1 + 14, var4, -1);
        int var5 = class55.field466;
        int var6 = class55.field467;
        for (int var7 = 0; var7 < field769; var7++) {
            int var8 = (field769 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field366.method4987(Statics.method1142(var7), var0 + 3, var8, var9, 0);
        }
        method247(Statics.field2437, Statics.field1511, Statics.field373, Statics.field339);
    }

    @ObfuscatedName("cn.if(IIIII)V")
    public static final void method1995(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field811; var4++) {
            if (field840[var4] + field828[var4] > arg0 && field840[var4] < arg0 + arg2 && field841[var4] + field727[var4] > arg1 && field841[var4] < arg1 + arg3) {
                field843[var4] = true;
            }
        }
    }

    @ObfuscatedName("b.ik(IIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field811; var4++) {
            if (field840[var4] + field828[var4] > arg0 && field840[var4] < arg0 + arg2 && field841[var4] + field727[var4] > arg1 && field841[var4] < arg1 + arg3) {
                field838[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.iq(I)V")
    public final void method1369() {
        method3098();
        if (Statics.field63 != null || field805 != null) {
            return;
        }
        int var18;
        int var20;
        int var21;
        label192: {
            int var1 = class55.field473;
            if (field884) {
                if (var1 != 1 && (Statics.field113 || var1 != 4)) {
                    int var2 = class55.field466;
                    int var3 = class55.field467;
                    if (var2 < Statics.field2437 - 10 || var2 > Statics.field373 + Statics.field2437 + 10 || var3 < Statics.field1511 - 10 || var3 > Statics.field339 + Statics.field1511 + 10) {
                        field884 = false;
                        method1995(Statics.field2437, Statics.field1511, Statics.field373, Statics.field339);
                    }
                }
                if (var1 == 1 || !Statics.field113 && var1 == 4) {
                    int var4 = Statics.field2437;
                    int var5 = Statics.field1511;
                    int var6 = Statics.field373;
                    int var7 = class55.field464;
                    int var8 = class55.field469;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field769; var10++) {
                        int var11 = (field769 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field770[var9];
                        int var13 = field771[var9];
                        int var14 = field772[var9];
                        int var15 = field837[var9];
                        String var16 = field774[var9];
                        String var17 = field775[var9];
                        method1213(var12, var13, var14, var15, var16, var17, class55.field464, class55.field469);
                    }
                    field884 = false;
                    method1995(Statics.field2437, Statics.field1511, Statics.field373, Statics.field339);
                }
            } else {
                var18 = method193();
                if ((var1 == 1 || !Statics.field113 && var1 == 4) && var18 >= 0) {
                    int var19 = field772[var18];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field770[var18];
                        var21 = field771[var18];
                        class218 var22 = class218.method3416(var21);
                        if (class219.method3248(method3452(var22))) {
                            break label192;
                        }
                        int var23 = method3452(var22);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label192;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field113 && var1 == 4) && this.method1232()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field113 && var1 == 4) && field769 > 0 && var18 >= 0) {
                    int var25 = field770[var18];
                    int var26 = field771[var18];
                    int var27 = field772[var18];
                    int var28 = field837[var18];
                    String var29 = field774[var18];
                    String var30 = field775[var18];
                    method1213(var25, var26, var27, var28, var29, var30, class55.field464, class55.field469);
                }
                if (var1 == 2 && field769 > 0) {
                    this.method1233(class55.field464, class55.field469);
                }
            }
            return;
        }
        if (Statics.field63 != null && !field744 && field769 > 0 && !this.method1232()) {
            method285(field730, field742);
        }
        field744 = false;
        field745 = 0;
        if (Statics.field63 != null) {
            method166(Statics.field63);
        }
        Statics.field63 = class218.method3416(var21);
        field740 = var20;
        field730 = class55.field464;
        field742 = class55.field469;
        if (var18 >= 0) {
            method2157(var18);
        }
        method166(Statics.field63);
    }

    @ObfuscatedName("client.iu(I)Z")
    public final boolean method1232() {
        int var1 = method193();
        return (field767 == 1 && field769 > 2 || method3097(var1)) && !field776[var1];
    }

    @ObfuscatedName("client.ie(IIS)V")
    public final void method1233(int arg0, int arg1) {
        method2427(arg0, arg1);
        Statics.field207.method2996(Statics.field625, arg0, arg1, false);
        field884 = true;
    }

    @ObfuscatedName("ad.iz(B)V")
    public static void method524() {
        method2427(Statics.field373 / 2 + Statics.field2437, Statics.field1511);
    }

    @ObfuscatedName("do.im(III)V")
    public static void method2427(int arg0, int arg1) {
        int var2 = Statics.field366.method4982(class225.field2900);
        for (int var3 = 0; var3 < field769; var3++) {
            int var4 = Statics.field366.method4982(Statics.method1142(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field769 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3628) {
            var6 = Statics.field3628 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field3243) {
            var7 = Statics.field3243 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2437 = var6;
        Statics.field1511 = var7;
        Statics.field373 = var2;
        Statics.field339 = field769 * 15 + 22;
    }

    @ObfuscatedName("eh.ir(II)Z")
    public static final boolean method3097(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field772[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bm.io(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 46) {
            class67 var8 = field748[arg3];
            if (var8 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var9 = class188.method2402(class184.field2226, field679.field1284);
                var9.field2308.method5148(class46.field387[82] ? 1 : 0);
                var9.field2308.method5322(arg3);
                field679.method2177(var9);
            }
        }
        if (arg2 == 42) {
            class188 var10 = class188.method2402(class184.field2212, field679.field1284);
            var10.field2308.method5169(arg1);
            var10.field2308.method5128(arg0);
            var10.field2308.method5322(arg3);
            field679.method2177(var10);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 50) {
            class67 var11 = field748[arg3];
            if (var11 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var12 = class188.method2402(class184.field2252, field679.field1284);
                var12.field2308.method5157(arg3);
                var12.field2308.method5253(class46.field387[82] ? 1 : 0);
                field679.method2177(var12);
            }
        }
        if (arg2 == 26) {
            method3850();
        }
        if (arg2 == 41) {
            class188 var13 = class188.method2402(class184.field2195, field679.field1284);
            var13.field2308.method5128(arg0);
            var13.field2308.method5169(arg1);
            var13.field2308.method5322(arg3);
            field679.method2177(var13);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 25) {
            class218 var14 = class218.method1064(arg1, arg0);
            if (var14 != null) {
                method1087();
                method799(arg1, arg0, class219.method3215(method3452(var14)), var14.field2675);
                field785 = 0;
                field790 = method2410(var14);
                if (field790 == null) {
                    field790 = class225.field2836;
                }
                if (var14.field2569) {
                    field902 = var14.field2676 + class82.method3907(16777215);
                } else {
                    field902 = class82.method3907(65280) + var14.field2671 + class82.method3907(16777215);
                }
            }
            return;
        }
        if (arg2 == 49) {
            class67 var15 = field748[arg3];
            if (var15 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var16 = class188.method2402(class184.field2237, field679.field1284);
                var16.field2308.method5149(class46.field387[82] ? 1 : 0);
                var16.field2308.method5128(arg3);
                field679.method2177(var16);
            }
        }
        if (arg2 == 43) {
            class188 var17 = class188.method2402(class184.field2216, field679.field1284);
            var17.field2308.method5128(arg3);
            var17.field2308.method5168(arg1);
            var17.field2308.method5158(arg0);
            field679.method2177(var17);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 5) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var18 = class188.method2402(class184.field2193, field679.field1284);
            var18.field2308.method5150(class46.field387[82] ? 1 : 0);
            var18.field2308.method5322(Statics.field1961 + arg0);
            var18.field2308.method5322(Statics.field1108 + arg1);
            var18.field2308.method5322(arg3);
            field679.method2177(var18);
        }
        if (arg2 == 48) {
            class67 var19 = field748[arg3];
            if (var19 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var20 = class188.method2402(class184.field2232, field679.field1284);
                var20.field2308.method5150(class46.field387[82] ? 1 : 0);
                var20.field2308.method5158(arg3);
                field679.method2177(var20);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1181.method5927(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 29) {
            class188 var21 = class188.method2402(class184.field2253, field679.field1284);
            var21.field2308.method5262(arg1);
            field679.method2177(var21);
            class218 var22 = class218.method3416(arg1);
            if (var22.field2667 != null && var22.field2667[0][0] == 5) {
                int var23 = var22.field2667[0][1];
                if (class213.field2507[var23] != var22.field2644[0]) {
                    class213.field2507[var23] = var22.field2644[0];
                    method310(var23);
                }
            }
        }
        if (arg2 == 11) {
            class80 var24 = field674[arg3];
            if (var24 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var25 = class188.method2402(class184.field2283, field679.field1284);
                var25.field2308.method5253(class46.field387[82] ? 1 : 0);
                var25.field2308.method5157(arg3);
                field679.method2177(var25);
            }
        }
        if (arg2 == 13) {
            class80 var26 = field674[arg3];
            if (var26 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var27 = class188.method2402(class184.field2189, field679.field1284);
                var27.field2308.method5149(class46.field387[82] ? 1 : 0);
                var27.field2308.method5158(arg3);
                field679.method2177(var27);
            }
        }
        if (arg2 == 40) {
            class188 var28 = class188.method2402(class184.field2259, field679.field1284);
            var28.field2308.method5128(arg3);
            var28.field2308.method5168(arg1);
            var28.field2308.method5128(arg0);
            field679.method2177(var28);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 14) {
            class67 var29 = field748[arg3];
            if (var29 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var30 = class188.method2402(class184.field2207, field679.field1284);
                var30.field2308.method5158(arg3);
                var30.field2308.method5158(Statics.field573);
                var30.field2308.method5262(Statics.field2405);
                var30.field2308.method5157(Statics.field1889);
                var30.field2308.method5150(class46.field387[82] ? 1 : 0);
                field679.method2177(var30);
            }
        }
        if (arg2 == 1002) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            class188 var31 = class188.method2402(class184.field2223, field679.field1284);
            var31.field2308.method5157(arg3);
            field679.method2177(var31);
        }
        if (arg2 == 18) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var32 = class188.method2402(class184.field2225, field679.field1284);
            var32.field2308.method5149(class46.field387[82] ? 1 : 0);
            var32.field2308.method5322(Statics.field1961 + arg0);
            var32.field2308.method5158(arg3);
            var32.field2308.method5322(Statics.field1108 + arg1);
            field679.method2177(var32);
        }
        if (arg2 == 38) {
            method1087();
            class218 var33 = class218.method3416(arg1);
            field785 = 1;
            Statics.field573 = arg0;
            Statics.field2405 = arg1;
            Statics.field1889 = arg3;
            method166(var33);
            field786 = class82.method3907(16748608) + class255.method3852(arg3).field3416 + class82.method3907(16777215);
            if (field786 == null) {
                field786 = class225.field2836;
            }
            return;
        }
        if (arg2 == 47) {
            class67 var34 = field748[arg3];
            if (var34 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var35 = class188.method2402(class184.field2230, field679.field1284);
                var35.field2308.method5322(arg3);
                var35.field2308.method5148(class46.field387[82] ? 1 : 0);
                field679.method2177(var35);
            }
        }
        if (arg2 == 1) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var36 = class188.method2402(class184.field2250, field679.field1284);
            var36.field2308.method5128(arg3);
            var36.field2308.method5253(class46.field387[82] ? 1 : 0);
            var36.field2308.method5322(Statics.field1889);
            var36.field2308.method5157(Statics.field1961 + arg0);
            var36.field2308.method5262(Statics.field2405);
            var36.field2308.method5157(Statics.field1108 + arg1);
            var36.field2308.method5158(Statics.field573);
            field679.method2177(var36);
        }
        if (arg2 == 15) {
            class67 var37 = field748[arg3];
            if (var37 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var38 = class188.method2402(class184.field2181, field679.field1284);
                var38.field2308.method5167(Statics.field2036);
                var38.field2308.method5149(class46.field387[82] ? 1 : 0);
                var38.field2308.method5128(arg3);
                var38.field2308.method5322(field788);
                field679.method2177(var38);
            }
        }
        if (arg2 == 39) {
            class188 var39 = class188.method2402(class184.field2197, field679.field1284);
            var39.field2308.method5322(arg3);
            var39.field2308.method5128(arg0);
            var39.field2308.method5169(arg1);
            field679.method2177(var39);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 35) {
            class188 var40 = class188.method2402(class184.field2191, field679.field1284);
            var40.field2308.method5128(arg3);
            var40.field2308.method5169(arg1);
            var40.field2308.method5158(arg0);
            field679.method2177(var40);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 28) {
            class188 var41 = class188.method2402(class184.field2253, field679.field1284);
            var41.field2308.method5262(arg1);
            field679.method2177(var41);
            class218 var42 = class218.method3416(arg1);
            if (var42.field2667 != null && var42.field2667[0][0] == 5) {
                int var43 = var42.field2667[0][1];
                class213.field2507[var43] = 1 - class213.field2507[var43];
                method310(var43);
            }
        }
        if (arg2 == 51) {
            class67 var44 = field748[arg3];
            if (var44 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var45 = class188.method2402(class184.field2236, field679.field1284);
                var45.field2308.method5322(arg3);
                var45.field2308.method5149(class46.field387[82] ? 1 : 0);
                field679.method2177(var45);
            }
        }
        if (arg2 == 23) {
            if (field884) {
                Statics.field207.method2997();
            } else {
                Statics.field207.method2996(Statics.field625, arg0, arg1, true);
            }
        }
        if (arg2 == 9) {
            class80 var46 = field674[arg3];
            if (var46 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var47 = class188.method2402(class184.field2182, field679.field1284);
                var47.field2308.method5157(arg3);
                var47.field2308.method5150(class46.field387[82] ? 1 : 0);
                field679.method2177(var47);
            }
        }
        if (arg2 == 21) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var48 = class188.method2402(class184.field2209, field679.field1284);
            var48.field2308.method5253(class46.field387[82] ? 1 : 0);
            var48.field2308.method5158(arg3);
            var48.field2308.method5158(Statics.field1961 + arg0);
            var48.field2308.method5158(Statics.field1108 + arg1);
            field679.method2177(var48);
        }
        if (arg2 == 6) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var49 = class188.method2402(class184.field2241, field679.field1284);
            var49.field2308.method5157(Statics.field1961 + arg0);
            var49.field2308.method5157(arg3);
            var49.field2308.method5157(Statics.field1108 + arg1);
            var49.field2308.method5149(class46.field387[82] ? 1 : 0);
            field679.method2177(var49);
        }
        if (arg2 == 36) {
            class188 var50 = class188.method2402(class184.field2254, field679.field1284);
            var50.field2308.method5168(arg1);
            var50.field2308.method5157(arg3);
            var50.field2308.method5128(arg0);
            field679.method2177(var50);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 3) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var51 = class188.method2402(class184.field2271, field679.field1284);
            var51.field2308.method5322(Statics.field1961 + arg0);
            var51.field2308.method5322(Statics.field1108 + arg1);
            var51.field2308.method5157(arg3);
            var51.field2308.method5253(class46.field387[82] ? 1 : 0);
            field679.method2177(var51);
        }
        if (arg2 == 34) {
            class188 var52 = class188.method2402(class184.field2238, field679.field1284);
            var52.field2308.method5262(arg1);
            var52.field2308.method5322(arg3);
            var52.field2308.method5158(arg0);
            field679.method2177(var52);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 58) {
            class218 var53 = class218.method1064(arg1, arg0);
            if (var53 != null) {
                class188 var54 = class188.method2402(class184.field2275, field679.field1284);
                var54.field2308.method5322(field788);
                var54.field2308.method5322(arg0);
                var54.field2308.method5169(arg1);
                var54.field2308.method5322(field789);
                var54.field2308.method5262(Statics.field2036);
                var54.field2308.method5157(var53.field2675);
                field679.method2177(var54);
            }
        }
        if (arg2 == 4) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var55 = class188.method2402(class184.field2279, field679.field1284);
            var55.field2308.method5158(Statics.field1961 + arg0);
            var55.field2308.method5148(class46.field387[82] ? 1 : 0);
            var55.field2308.method5322(arg3);
            var55.field2308.method5158(Statics.field1108 + arg1);
            field679.method2177(var55);
        }
        if (arg2 == 20) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var56 = class188.method2402(class184.field2245, field679.field1284);
            var56.field2308.method5128(arg3);
            var56.field2308.method5150(class46.field387[82] ? 1 : 0);
            var56.field2308.method5128(Statics.field1108 + arg1);
            var56.field2308.method5157(Statics.field1961 + arg0);
            field679.method2177(var56);
        }
        if (arg2 == 8) {
            class80 var57 = field674[arg3];
            if (var57 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var58 = class188.method2402(class184.field2218, field679.field1284);
                var58.field2308.method5157(arg3);
                var58.field2308.method5158(field788);
                var58.field2308.method5169(Statics.field2036);
                var58.field2308.method5253(class46.field387[82] ? 1 : 0);
                field679.method2177(var58);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var59 = class218.method1064(arg1, arg0);
            if (var59 != null) {
                method4911(arg3, arg1, arg0, var59.field2675, arg5);
            }
        }
        if (arg2 == 2) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var60 = class188.method2402(class184.field2224, field679.field1284);
            var60.field2308.method5322(Statics.field1108 + arg1);
            var60.field2308.method5128(arg3);
            var60.field2308.method5322(Statics.field1961 + arg0);
            var60.field2308.method5253(class46.field387[82] ? 1 : 0);
            var60.field2308.method5128(field788);
            var60.field2308.method5262(Statics.field2036);
            field679.method2177(var60);
        }
        if (arg2 == 30 && field798 == null) {
            method1040(arg1, arg0);
            field798 = class218.method1064(arg1, arg0);
            method166(field798);
        }
        if (arg2 == 45) {
            class67 var61 = field748[arg3];
            if (var61 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var62 = class188.method2402(class184.field2235, field679.field1284);
                var62.field2308.method5150(class46.field387[82] ? 1 : 0);
                var62.field2308.method5157(arg3);
                field679.method2177(var62);
            }
        }
        if (arg2 == 44) {
            class67 var63 = field748[arg3];
            if (var63 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var64 = class188.method2402(class184.field2194, field679.field1284);
                var64.field2308.method5128(arg3);
                var64.field2308.method5253(class46.field387[82] ? 1 : 0);
                field679.method2177(var64);
            }
        }
        if (arg2 == 10) {
            class80 var65 = field674[arg3];
            if (var65 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var66 = class188.method2402(class184.field2273, field679.field1284);
                var66.field2308.method5322(arg3);
                var66.field2308.method5149(class46.field387[82] ? 1 : 0);
                field679.method2177(var66);
            }
        }
        if (arg2 == 16) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var67 = class188.method2402(class184.field2185, field679.field1284);
            var67.field2308.method5157(arg3);
            var67.field2308.method5253(class46.field387[82] ? 1 : 0);
            var67.field2308.method5158(Statics.field1961 + arg0);
            var67.field2308.method5169(Statics.field2405);
            var67.field2308.method5128(Statics.field1108 + arg1);
            var67.field2308.method5157(Statics.field573);
            var67.field2308.method5157(Statics.field1889);
            field679.method2177(var67);
        }
        if (arg2 == 22) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var68 = class188.method2402(class184.field2201, field679.field1284);
            var68.field2308.method5158(Statics.field1961 + arg0);
            var68.field2308.method5253(class46.field387[82] ? 1 : 0);
            var68.field2308.method5157(Statics.field1108 + arg1);
            var68.field2308.method5157(arg3);
            field679.method2177(var68);
        }
        if (arg2 == 17) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var69 = class188.method2402(class184.field2255, field679.field1284);
            var69.field2308.method5322(Statics.field1108 + arg1);
            var69.field2308.method5157(Statics.field1961 + arg0);
            var69.field2308.method5148(class46.field387[82] ? 1 : 0);
            var69.field2308.method5322(arg3);
            var69.field2308.method5168(Statics.field2036);
            var69.field2308.method5128(field788);
            field679.method2177(var69);
        }
        if (arg2 == 1004) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            class188 var70 = class188.method2402(class184.field2199, field679.field1284);
            var70.field2308.method5157(arg3);
            field679.method2177(var70);
        }
        if (arg2 == 1005) {
            class218 var71 = class218.method3416(arg1);
            if (var71 == null || var71.field2674[arg0] < 100000) {
                class188 var72 = class188.method2402(class184.field2199, field679.field1284);
                var72.field2308.method5157(arg3);
                field679.method2177(var72);
            } else {
                class92.method522(27, "", var71.field2674[arg0] + " x " + class255.method3852(arg3).field3416);
            }
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 19) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var73 = class188.method2402(class184.field2270, field679.field1284);
            var73.field2308.method5158(arg3);
            var73.field2308.method5158(Statics.field1961 + arg0);
            var73.field2308.method5128(Statics.field1108 + arg1);
            var73.field2308.method5253(class46.field387[82] ? 1 : 0);
            field679.method2177(var73);
        }
        if (arg2 == 1003) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            class80 var74 = field674[arg3];
            if (var74 != null) {
                class257 var75 = var74.field1114;
                if (var75.field3458 != null) {
                    var75 = var75.method4408();
                }
                if (var75 != null) {
                    class188 var76 = class188.method2402(class184.field2263, field679.field1284);
                    var76.field2308.method5128(var75.field3465);
                    field679.method2177(var76);
                }
            }
        }
        if (arg2 == 31) {
            class188 var77 = class188.method2402(class184.field2243, field679.field1284);
            var77.field2308.method5158(arg3);
            var77.field2308.method5128(arg0);
            var77.field2308.method5157(Statics.field573);
            var77.field2308.method5168(Statics.field2405);
            var77.field2308.method5322(Statics.field1889);
            var77.field2308.method5262(arg1);
            field679.method2177(var77);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 33) {
            class188 var78 = class188.method2402(class184.field2261, field679.field1284);
            var78.field2308.method5168(arg1);
            var78.field2308.method5322(arg0);
            var78.field2308.method5158(arg3);
            field679.method2177(var78);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 37) {
            class188 var79 = class188.method2402(class184.field2220, field679.field1284);
            var79.field2308.method5168(arg1);
            var79.field2308.method5157(arg3);
            var79.field2308.method5158(arg0);
            field679.method2177(var79);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 32) {
            class188 var80 = class188.method2402(class184.field2242, field679.field1284);
            var80.field2308.method5167(Statics.field2036);
            var80.field2308.method5128(arg3);
            var80.field2308.method5262(arg1);
            var80.field2308.method5157(arg0);
            var80.field2308.method5157(field788);
            field679.method2177(var80);
            field754 = 0;
            Statics.field1166 = class218.method3416(arg1);
            field666 = arg0;
        }
        if (arg2 == 12) {
            class80 var81 = field674[arg3];
            if (var81 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var82 = class188.method2402(class184.field2269, field679.field1284);
                var82.field2308.method5128(arg3);
                var82.field2308.method5150(class46.field387[82] ? 1 : 0);
                field679.method2177(var82);
            }
        }
        if (arg2 == 24) {
            class218 var83 = class218.method3416(arg1);
            boolean var84 = true;
            if (var83.field2553 > 0) {
                var84 = method205(var83);
            }
            if (var84) {
                class188 var85 = class188.method2402(class184.field2253, field679.field1284);
                var85.field2308.method5262(arg1);
                field679.method2177(var85);
            }
        }
        if (arg2 == 7) {
            class80 var86 = field674[arg3];
            if (var86 != null) {
                field733 = arg6;
                field714 = arg7;
                field736 = 2;
                field735 = 0;
                field862 = arg0;
                field863 = arg1;
                class188 var87 = class188.method2402(class184.field2234, field679.field1284);
                var87.field2308.method5322(Statics.field1889);
                var87.field2308.method5150(class46.field387[82] ? 1 : 0);
                var87.field2308.method5322(arg3);
                var87.field2308.method5322(Statics.field573);
                var87.field2308.method5168(Statics.field2405);
                field679.method2177(var87);
            }
        }
        if (arg2 == 1001) {
            field733 = arg6;
            field714 = arg7;
            field736 = 2;
            field735 = 0;
            field862 = arg0;
            field863 = arg1;
            class188 var88 = class188.method2402(class184.field2215, field679.field1284);
            var88.field2308.method5149(class46.field387[82] ? 1 : 0);
            var88.field2308.method5322(Statics.field1108 + arg1);
            var88.field2308.method5157(Statics.field1961 + arg0);
            var88.field2308.method5322(arg3);
            field679.method2177(var88);
        }
        if (field785 != 0) {
            field785 = 0;
            method166(class218.method3416(Statics.field2405));
        }
        if (field787) {
            method1087();
        }
        if (Statics.field1166 != null && field754 == 0) {
            method166(Statics.field1166);
        }
    }

    @ObfuscatedName("ai.il(ILjava/lang/String;I)V")
    public static void method760(int arg0, String arg1) {
        int var2 = class90.field1240;
        int[] var3 = class90.field1232;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field536);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field748[var3[var6]];
            if (var7 != null && Statics.field2530 != var7 && var7.field601 != null && var7.field601.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method2402(class184.field2194, field679.field1284);
                    var8.field2308.method5128(var3[var6]);
                    var8.field2308.method5253(0);
                    field679.method2177(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method2402(class184.field2230, field679.field1284);
                    var9.field2308.method5322(var3[var6]);
                    var9.field2308.method5148(0);
                    field679.method2177(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method2402(class184.field2237, field679.field1284);
                    var10.field2308.method5149(0);
                    var10.field2308.method5128(var3[var6]);
                    field679.method2177(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method2402(class184.field2252, field679.field1284);
                    var11.field2308.method5157(var3[var6]);
                    var11.field2308.method5253(0);
                    field679.method2177(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method522(4, "", class225.field3008 + arg1);
        }
    }

    @ObfuscatedName("as.ic(IIIII)V")
    public static void method799(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method1064(arg0, arg1);
        if (var4 != null && var4.field2646 != null) {
            class63 var5 = new class63();
            var5.field560 = var4;
            var5.field558 = var4.field2646;
            class77.method165(var5);
        }
        field789 = arg3;
        field787 = true;
        Statics.field2036 = arg0;
        field788 = arg1;
        Statics.field1136 = arg2;
        method166(var4);
    }

    @ObfuscatedName("bq.ib(B)V")
    public static void method1087() {
        if (!field787) {
            return;
        }
        class218 var0 = class218.method1064(Statics.field2036, field788);
        if (var0 != null && var0.field2647 != null) {
            class63 var1 = new class63();
            var1.field560 = var0;
            var1.field558 = var0.field2647;
            class77.method165(var1);
        }
        field787 = false;
        method166(var0);
    }

    @ObfuscatedName("bd.iy(IIB)V")
    public static void method1040(int arg0, int arg1) {
        class188 var2 = class188.method2402(class184.field2278, field679.field1284);
        var2.field2308.method5157(arg1);
        var2.field2308.method5168(arg0);
        field679.method2177(var2);
    }

    @ObfuscatedName("kk.id(IIIILjava/lang/String;I)V")
    public static void method4911(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method1064(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2655 != null) {
            class63 var6 = new class63();
            var6.field560 = var5;
            var6.field555 = arg0;
            var6.field559 = arg4;
            var6.field558 = var5.field2655;
            class77.method165(var6);
        }
        boolean var7 = true;
        if (var5.field2553 > 0) {
            var7 = method205(var5);
        }
        if (!var7 || !class219.method3082(method3452(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class188 var8 = class188.method2402(class184.field2186, field679.field1284);
            var8.field2308.method5262(arg1);
            var8.field2308.method5128(arg2);
            var8.field2308.method5128(arg3);
            field679.method2177(var8);
        }
        if (arg0 == 2) {
            class188 var9 = class188.method2402(class184.field2219, field679.field1284);
            var9.field2308.method5262(arg1);
            var9.field2308.method5128(arg2);
            var9.field2308.method5128(arg3);
            field679.method2177(var9);
        }
        if (arg0 == 3) {
            class188 var10 = class188.method2402(class184.field2249, field679.field1284);
            var10.field2308.method5262(arg1);
            var10.field2308.method5128(arg2);
            var10.field2308.method5128(arg3);
            field679.method2177(var10);
        }
        if (arg0 == 4) {
            class188 var11 = class188.method2402(class184.field2251, field679.field1284);
            var11.field2308.method5262(arg1);
            var11.field2308.method5128(arg2);
            var11.field2308.method5128(arg3);
            field679.method2177(var11);
        }
        if (arg0 == 5) {
            class188 var12 = class188.method2402(class184.field2274, field679.field1284);
            var12.field2308.method5262(arg1);
            var12.field2308.method5128(arg2);
            var12.field2308.method5128(arg3);
            field679.method2177(var12);
        }
        if (arg0 == 6) {
            class188 var13 = class188.method2402(class184.field2264, field679.field1284);
            var13.field2308.method5262(arg1);
            var13.field2308.method5128(arg2);
            var13.field2308.method5128(arg3);
            field679.method2177(var13);
        }
        if (arg0 == 7) {
            class188 var14 = class188.method2402(class184.field2277, field679.field1284);
            var14.field2308.method5262(arg1);
            var14.field2308.method5128(arg2);
            var14.field2308.method5128(arg3);
            field679.method2177(var14);
        }
        if (arg0 == 8) {
            class188 var15 = class188.method2402(class184.field2192, field679.field1284);
            var15.field2308.method5262(arg1);
            var15.field2308.method5128(arg2);
            var15.field2308.method5128(arg3);
            field679.method2177(var15);
        }
        if (arg0 == 9) {
            class188 var16 = class188.method2402(class184.field2187, field679.field1284);
            var16.field2308.method5262(arg1);
            var16.field2308.method5128(arg2);
            var16.field2308.method5128(arg3);
            field679.method2177(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var17 = class188.method2402(class184.field2260, field679.field1284);
        var17.field2308.method5262(arg1);
        var17.field2308.method5128(arg2);
        var17.field2308.method5128(arg3);
        field679.method2177(var17);
    }

    @ObfuscatedName("eh.ih(B)V")
    public static final void method3098() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field769 - 1; var1++) {
                if (field772[var1] < 1000 && field772[var1 + 1] > 1000) {
                    String var2 = field775[var1];
                    field775[var1] = field775[var1 + 1];
                    field775[var1 + 1] = var2;
                    String var3 = field774[var1];
                    field774[var1] = field774[var1 + 1];
                    field774[var1 + 1] = var3;
                    int var4 = field772[var1];
                    field772[var1] = field772[var1 + 1];
                    field772[var1 + 1] = var4;
                    int var5 = field770[var1];
                    field770[var1] = field770[var1 + 1];
                    field770[var1 + 1] = var5;
                    int var6 = field771[var1];
                    field771[var1] = field771[var1 + 1];
                    field771[var1 + 1] = var6;
                    int var7 = field837[var1];
                    field837[var1] = field837[var1 + 1];
                    field837[var1 + 1] = var7;
                    boolean var8 = field776[var1];
                    field776[var1] = field776[var1 + 1];
                    field776[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ex.ii(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3104(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3866(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("hs.ix(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3866(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field884 || field769 >= 500) {
            return;
        }
        field774[field769] = arg0;
        field775[field769] = arg1;
        field772[field769] = arg2;
        field837[field769] = arg3;
        field770[field769] = arg4;
        field771[field769] = arg5;
        field776[field769] = arg6;
        field769++;
    }

    @ObfuscatedName("r.iw(B)I")
    public static final int method193() {
        return field769 - 1;
    }

    @ObfuscatedName("w.in(II)Z")
    public static boolean method298(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("p.is(IIIIB)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3) {
        if (field785 == 0 && !field787) {
            method3104(class225.field2811, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class129.method400(); var8++) {
            long var9 = class129.method77(var8);
            if (var6 != var9) {
                var6 = var9;
                long var11 = class129.field1725[var8];
                int var13 = (int) (var11 >>> 0 & 0x7FL);
                int var15 = var13;
                long var16 = class129.field1725[var8];
                int var18 = (int) (var16 >>> 7 & 0x7FL);
                int var20 = var18;
                int var21 = class129.method4871(var8);
                int var22 = class129.method1098(var8);
                if (var21 == 2 && Statics.field207.method2936(Statics.field625, var13, var18, var9) >= 0) {
                    class254 var23 = class254.method3848(var22);
                    if (var23.field3354 != null) {
                        var23 = var23.method4333();
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (field785 == 1) {
                        method3104(class225.field2897, field786 + " " + class82.field1132 + " " + class82.method3907(65535) + var23.field3348, 1, var22, var13, var18);
                    } else if (!field787) {
                        String[] var24 = var23.field3364;
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 3;
                                    }
                                    if (var25 == 1) {
                                        var26 = 4;
                                    }
                                    if (var25 == 2) {
                                        var26 = 5;
                                    }
                                    if (var25 == 3) {
                                        var26 = 6;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1001;
                                    }
                                    method3104(var24[var25], class82.method3907(65535) + var23.field3348, var26, var22, var15, var20);
                                }
                            }
                        }
                        method3104(class225.field2898, class82.method3907(65535) + var23.field3348, 1002, var23.field3379, var15, var20);
                    } else if ((Statics.field1136 & 0x4) == 4) {
                        method3104(field790, field902 + " " + class82.field1132 + " " + class82.method3907(65535) + var23.field3348, 2, var22, var13, var18);
                    }
                }
                if (var21 == 1) {
                    class80 var27 = field674[var22];
                    if (var27 == null) {
                        continue;
                    }
                    if (var27.field1114.field3460 == 1 && (var27.field930 & 0x7F) == 64 && (var27.field933 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < field665; var28++) {
                            class80 var29 = field674[field690[var28]];
                            if (var29 != null && var27 != var29 && var29.field1114.field3460 == 1 && var27.field930 == var29.field930 && var27.field933 == var29.field933) {
                                method3267(var29.field1114, field690[var28], var15, var20);
                            }
                        }
                        int var30 = class90.field1240;
                        int[] var31 = class90.field1232;
                        for (int var32 = 0; var32 < var30; var32++) {
                            class67 var33 = field748[var31[var32]];
                            if (var33 != null && var27.field930 == var33.field930 && var27.field933 == var33.field933) {
                                method688(var33, var31[var32], var15, var20);
                            }
                        }
                    }
                    method3267(var27.field1114, var22, var15, var20);
                }
                if (var21 == 0) {
                    class67 var34 = field748[var22];
                    if (var34 == null) {
                        continue;
                    }
                    if ((var34.field930 & 0x7F) == 64 && (var34.field933 & 0x7F) == 64) {
                        for (int var35 = 0; var35 < field665; var35++) {
                            class80 var36 = field674[field690[var35]];
                            if (var36 != null && var36.field1114.field3460 == 1 && var34.field930 == var36.field930 && var34.field933 == var36.field933) {
                                method3267(var36.field1114, field690[var35], var15, var20);
                            }
                        }
                        int var37 = class90.field1240;
                        int[] var38 = class90.field1232;
                        for (int var39 = 0; var39 < var37; var39++) {
                            class67 var40 = field748[var38[var39]];
                            if (var40 != null && var34 != var40 && var34.field930 == var40.field930 && var34.field933 == var40.field933) {
                                method688(var40, var38[var39], var15, var20);
                            }
                        }
                    }
                    if (field759 == var22) {
                        var4 = var9;
                    } else {
                        method688(var34, var22, var15, var20);
                    }
                }
                if (var21 == 3) {
                    class262 var41 = field760[Statics.field625][var15][var20];
                    if (var41 != null) {
                        for (class88 var42 = (class88) var41.method4582(); var42 != null; var42 = (class88) var41.method4584()) {
                            class255 var43 = class255.method3852(var42.field1218);
                            if (field785 == 1) {
                                method3104(class225.field2897, field786 + " " + class82.field1132 + " " + class82.method3907(16748608) + var43.field3416, 16, var42.field1218, var15, var20);
                            } else if (!field787) {
                                String[] var44 = var43.field3415;
                                for (int var45 = 4; var45 >= 0; var45--) {
                                    if (var44 != null && var44[var45] != null) {
                                        byte var46 = 0;
                                        if (var45 == 0) {
                                            var46 = 18;
                                        }
                                        if (var45 == 1) {
                                            var46 = 19;
                                        }
                                        if (var45 == 2) {
                                            var46 = 20;
                                        }
                                        if (var45 == 3) {
                                            var46 = 21;
                                        }
                                        if (var45 == 4) {
                                            var46 = 22;
                                        }
                                        method3104(var44[var45], class82.method3907(16748608) + var43.field3416, var46, var42.field1218, var15, var20);
                                    } else if (var45 == 2) {
                                        method3104(class225.field2959, class82.method3907(16748608) + var43.field3416, 20, var42.field1218, var15, var20);
                                    }
                                }
                                method3104(class225.field2898, class82.method3907(16748608) + var43.field3416, 1004, var42.field1218, var15, var20);
                            } else if ((Statics.field1136 & 0x1) == 1) {
                                method3104(field790, field902 + " " + class82.field1132 + " " + class82.method3907(16748608) + var43.field3416, 17, var42.field1218, var15, var20);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var47 = (int) (var4 >>> 0 & 0x7FL);
            int var49 = (int) (var4 >>> 7 & 0x7FL);
            class67 var51 = field748[field759];
            method688(var51, field759, var47, var49);
        }
    }

    @ObfuscatedName("ff.iv(Lit;IIII)V")
    public static final void method3267(class257 arg0, int arg1, int arg2, int arg3) {
        if (field769 >= 400) {
            return;
        }
        if (arg0.field3458 != null) {
            arg0 = arg0.method4408();
        }
        if (arg0 == null || !arg0.field3487 || arg0.field3489 && field802 != arg1) {
            return;
        }
        String var4 = arg0.field3491;
        if (arg0.field3476 != 0) {
            var4 = var4 + method127(arg0.field3476, Statics.field2530.field622) + " " + class82.field1137 + class225.field2903 + arg0.field3476 + class82.field1131;
        }
        if (arg0.field3489 && field777) {
            method3104(class225.field2898, class82.method3907(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field785 == 1) {
            method3104(class225.field2897, field786 + " " + class82.field1132 + " " + class82.method3907(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field787) {
            int var5 = arg0.field3489 && field777 ? 2000 : 0;
            String[] var6 = arg0.field3474;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class225.field2899)) {
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
                        method3104(var6[var7], class82.method3907(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class225.field2899)) {
                        short var10 = 0;
                        if (field839 != class85.field1151) {
                            if (field839 == class85.field1149 || field839 == class85.field1155 && arg0.field3476 > Statics.field2530.field622) {
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
                            method3104(var6[var9], class82.method3907(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3489 || !field777) {
                method3104(class225.field2898, class82.method3907(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1136 & 0x2) == 2) {
            method3104(field790, field902 + " " + class82.field1132 + " " + class82.method3907(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.ia(Lbj;IIII)V")
    public static final void method688(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2530 == arg0 || field769 >= 400) {
            return;
        }
        String var4;
        if (arg0.field603 == 0) {
            var4 = arg0.field609[0] + arg0.field601 + arg0.field609[1] + method127(arg0.field622, Statics.field2530.field622) + " " + class82.field1137 + class225.field2903 + arg0.field622 + class82.field1131 + arg0.field609[2];
        } else {
            var4 = arg0.field609[0] + arg0.field601 + arg0.field609[1] + " " + class82.field1137 + class225.field2904 + arg0.field603 + class82.field1131 + arg0.field609[2];
        }
        if (field785 == 1) {
            method3104(class225.field2897, field786 + " " + class82.field1132 + " " + class82.method3907(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field787) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field739[var5] != null) {
                    short var6 = 0;
                    if (field739[var5].equalsIgnoreCase(class225.field2899)) {
                        if (field659 == class85.field1151) {
                            continue;
                        }
                        if (field659 == class85.field1149 || field659 == class85.field1155 && arg0.field622 > Statics.field2530.field622) {
                            var6 = 2000;
                        }
                        if (Statics.field2530.field602 != 0 && arg0.field602 != 0) {
                            if (Statics.field2530.field602 == arg0.field602) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field816[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field813[var5] + var6;
                    method3104(field739[var5], class82.method3907(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1136 & 0x8) == 8) {
            method3104(field790, field902 + " " + class82.field1132 + " " + class82.method3907(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field769; var9++) {
            if (field772[var9] == 23) {
                field775[var9] = class82.method3907(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("d.jm(III)Ljava/lang/String;")
    public static final String method127(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class82.method3907(16711680);
        } else if (var2 < -6) {
            return class82.method3907(16723968);
        } else if (var2 < -3) {
            return class82.method3907(16740352);
        } else if (var2 < 0) {
            return class82.method3907(16756736);
        } else if (var2 > 9) {
            return class82.method3907(65280);
        } else if (var2 > 6) {
            return class82.method3907(4259584);
        } else if (var2 > 3) {
            return class82.method3907(8453888);
        } else if (var2 > 0) {
            return class82.method3907(12648192);
        } else {
            return class82.method3907(16776960);
        }
    }

    @ObfuscatedName("bi.jb(IIIIIIIII)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method2615(arg0)) {
            Statics.field3219 = null;
            method4751(Statics.field2540[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3219 != null) {
                method4751(Statics.field3219, -1412584499, arg1, arg2, arg3, arg4, Statics.field3601, Statics.field47, arg7);
                Statics.field3219 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field843[var8] = true;
            }
        } else {
            field843[arg7] = true;
        }
    }

    @ObfuscatedName("je.ja([Lhi;IIIIIIIII)V")
    public static final void method4751(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5578(arg2, arg3, arg4, arg5);
        class131.method2829();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2673 == arg1 || arg1 == -1412584499 && field805 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field840[field811] = var10.field2650 + arg6;
                    field841[field811] = var10.field2563 + arg7;
                    field828[field811] = var10.field2562;
                    field727[field811] = var10.field2565;
                    var11 = ++field811 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2686 = var11;
                var10.field2687 = field643;
                if (!var10.field2569 || !method594(var10)) {
                    if (var10.field2553 > 0) {
                        method3868(var10);
                    }
                    int var12 = var10.field2650 + arg6;
                    int var13 = var10.field2563 + arg7;
                    int var14 = var10.field2587;
                    if (field805 == var10) {
                        if (arg1 != -1412584499 && !var10.field2633) {
                            Statics.field3219 = arg0;
                            Statics.field3601 = arg6;
                            Statics.field47 = arg7;
                            continue;
                        }
                        if (field876 && field810) {
                            int var15 = class55.field466;
                            int var16 = class55.field467;
                            int var17 = var15 - field703;
                            int var18 = var16 - field808;
                            if (var17 < field749) {
                                var17 = field749;
                            }
                            if (var10.field2562 + var17 > field749 + field806.field2562) {
                                var17 = field749 + field806.field2562 - var10.field2562;
                            }
                            if (var18 < field752) {
                                var18 = field752;
                            }
                            if (var10.field2565 + var18 > field752 + field806.field2565) {
                                var18 = field752 + field806.field2565 - var10.field2565;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2633) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2630 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2630 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2562 + var12;
                        int var26 = var10.field2565 + var13;
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
                        int var29 = var10.field2562 + var12;
                        int var30 = var10.field2565 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2569 || var19 < var21 && var20 < var22) {
                        if (var10.field2553 != 0) {
                            if (var10.field2553 == 1336) {
                                if (field649) {
                                    var13 += 15;
                                    Statics.field3139.method4990("Fps:" + field428, var10.field2562 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field637) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3139.method4990("Mem:" + var32 + "k", var10.field2562 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2553 == 1337) {
                                field724 = var12;
                                field782 = var13;
                                method3101(var12, var13, var10.field2562, var10.field2565);
                                field843[var10.field2686] = true;
                                class321.method5578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2553 == 1338) {
                                Statics.method57(var10, var12, var13, var11);
                                class321.method5578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2553 == 1339) {
                                method3859(var10, var12, var13, var11);
                                class321.method5578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2553 == 1400) {
                                Statics.field1181.method5890(var12, var13, var10.field2562, var10.field2565, field643);
                            }
                            if (var10.field2553 == 1401) {
                                Statics.field1181.method6019(var12, var13, var10.field2562, var10.field2565);
                            }
                            if (var10.field2553 == 1402) {
                                Statics.field1162.method1718(var12, field643);
                            }
                        }
                        if (var10.field2630 == 0) {
                            if (!var10.field2569 && method594(var10) && Statics.field1278 != var10) {
                                continue;
                            }
                            if (!var10.field2569) {
                                if (var10.field2614 > var10.field2654 - var10.field2565) {
                                    var10.field2614 = var10.field2654 - var10.field2565;
                                }
                                if (var10.field2614 < 0) {
                                    var10.field2614 = 0;
                                }
                            }
                            method4751(arg0, var10.field2549, var19, var20, var21, var22, var12 - var10.field2573, var13 - var10.field2614, var11);
                            if (var10.field2679 != null) {
                                method4751(var10.field2679, var10.field2549, var19, var20, var21, var22, var12 - var10.field2573, var13 - var10.field2614, var11);
                            }
                            class62 var34 = (class62) field793.method5528((long) var10.field2549);
                            if (var34 != null) {
                                method1099(var34.field549, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5578(arg2, arg3, arg4, arg5);
                            class131.method2829();
                        }
                        if (field846 || field632[var11] || field844 > 1) {
                            if (var10.field2630 == 0 && !var10.field2569 && var10.field2654 > var10.field2565) {
                                method1070(var10.field2562 + var12, var13, var10.field2614, var10.field2565, var10.field2654);
                            }
                            if (var10.field2630 != 1) {
                                if (var10.field2630 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2561; var36++) {
                                        for (int var37 = 0; var37 < var10.field2560; var37++) {
                                            int var38 = (var10.field2616 + 32) * var37 + var12;
                                            int var39 = (var10.field2617 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2618[var35];
                                                var39 += var10.field2619[var35];
                                            }
                                            if (var10.field2602[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2602[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field63 == var10 && field740 == var35) {
                                                    class325 var43;
                                                    if (field785 == 1 && Statics.field573 == var35 && Statics.field2405 == var10.field2549) {
                                                        var43 = class255.method1101(var42, var10.field2674[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method1101(var42, var10.field2674[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method166(var10);
                                                    } else if (Statics.field63 == var10 && field740 == var35) {
                                                        int var44 = class55.field466 - field730;
                                                        int var45 = class55.field467 - field742;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field745 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5683(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3839 && var46.field2614 > 0) {
                                                                int var47 = field694 * (class321.field3839 - var39 - var45) / 3;
                                                                if (var47 > field694 * 10) {
                                                                    var47 = field694 * 10;
                                                                }
                                                                if (var47 > var46.field2614) {
                                                                    var47 = var46.field2614;
                                                                }
                                                                var46.field2614 -= var47;
                                                                field742 += var47;
                                                                method166(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3838 && var46.field2614 < var46.field2654 - var46.field2565) {
                                                                int var48 = field694 * (var39 + var45 + 32 - class321.field3838) / 3;
                                                                if (var48 > field694 * 10) {
                                                                    var48 = field694 * 10;
                                                                }
                                                                if (var48 > var46.field2654 - var46.field2565 - var46.field2614) {
                                                                    var48 = var46.field2654 - var46.field2565 - var46.field2614;
                                                                }
                                                                var46.field2614 += var48;
                                                                field742 -= var48;
                                                                method166(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1166 == var10 && field666 == var35) {
                                                        var43.method5683(var38, var39, 128);
                                                    } else {
                                                        var43.method5686(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2620 != null && var35 < 20) {
                                                class325 var49 = var10.method3788(var35);
                                                if (var49 != null) {
                                                    var49.method5686(var38, var39);
                                                } else if (class218.field2547) {
                                                    method166(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2630 == 3) {
                                    int var50;
                                    if (method1047(var10)) {
                                        var50 = var10.field2575;
                                        if (Statics.field1278 == var10 && var10.field2577 != 0) {
                                            var50 = var10.field2577;
                                        }
                                    } else {
                                        var50 = var10.field2574;
                                        if (Statics.field1278 == var10 && var10.field2576 != 0) {
                                            var50 = var10.field2576;
                                        }
                                    }
                                    if (var10.field2634) {
                                        switch(var10.field2579.field3849) {
                                            case 1:
                                                class321.method5586(var12, var13, var10.field2562, var10.field2565, var10.field2574, var10.field2575);
                                                break;
                                            case 2:
                                                class321.method5587(var12, var13, var10.field2562, var10.field2565, var10.field2574, var10.field2575, 255 - (var10.field2587 & 0xFF), 255 - (var10.field2581 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5585(var12, var13, var10.field2562, var10.field2565, var50);
                                                } else {
                                                    class321.method5584(var12, var13, var10.field2562, var10.field2565, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5620(var12, var13, var10.field2562, var10.field2565, var50);
                                    } else {
                                        class321.method5590(var12, var13, var10.field2562, var10.field2565, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2630 == 4) {
                                    class295 var51 = var10.method3787();
                                    if (var51 != null) {
                                        String var52 = var10.field2599;
                                        int var53;
                                        if (method1047(var10)) {
                                            var53 = var10.field2575;
                                            if (Statics.field1278 == var10 && var10.field2577 != 0) {
                                                var53 = var10.field2577;
                                            }
                                            if (var10.field2611.length() > 0) {
                                                var52 = var10.field2611;
                                            }
                                        } else {
                                            var53 = var10.field2574;
                                            if (Statics.field1278 == var10 && var10.field2576 != 0) {
                                                var53 = var10.field2576;
                                            }
                                        }
                                        if (var10.field2569 && var10.field2675 != -1) {
                                            class255 var54 = class255.method3852(var10.field2675);
                                            var52 = var54.field3416;
                                            if (var52 == null) {
                                                var52 = class225.field2836;
                                            }
                                            if ((var54.field3442 == 1 || var10.field2580 != 1) && var10.field2580 != -1) {
                                                var52 = class82.method3907(16748608) + var52 + class82.field1134 + " " + 'x' + method125(var10.field2580);
                                            }
                                        }
                                        if (field798 == var10) {
                                            var52 = class225.field2988;
                                            var53 = var10.field2574;
                                        }
                                        if (!var10.field2569) {
                                            var52 = method6106(var52, var10);
                                        }
                                        var51.method4992(var52, var12, var13, var10.field2562, var10.field2565, var53, var10.field2615 ? 0 : -1, var10.field2631, var10.field2635, var10.field2612);
                                    } else if (class218.field2547) {
                                        method166(var10);
                                    }
                                } else if (var10.field2630 == 5) {
                                    if (var10.field2569) {
                                        class325 var56;
                                        if (var10.field2675 == -1) {
                                            var56 = var10.method3786(false);
                                        } else {
                                            var56 = class255.method1101(var10.field2675, var10.field2580, var10.field2684, var10.field2586, var10.field2608, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3867;
                                            int var58 = var56.field3865;
                                            if (var10.field2623) {
                                                class321.method5579(var12, var13, var10.field2562 + var12, var10.field2565 + var13);
                                                int var59 = (var10.field2562 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2565 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2610 != 0) {
                                                            var56.method5714(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2610, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5686(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5683(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5578(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2562 * 4096 / var57;
                                                if (var10.field2610 != 0) {
                                                    var56.method5714(var10.field2562 / 2 + var12, var10.field2565 / 2 + var13, var10.field2610, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5733(var12, var13, var10.field2562, var10.field2565, 256 - (var14 & 0xFF));
                                                } else if (var10.field2562 == var57 && var10.field2565 == var58) {
                                                    var56.method5686(var12, var13);
                                                } else {
                                                    var56.method5685(var12, var13, var10.field2562, var10.field2565);
                                                }
                                            }
                                        } else if (class218.field2547) {
                                            method166(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3786(method1047(var10));
                                        if (var55 != null) {
                                            var55.method5686(var12, var13);
                                        } else if (class218.field2547) {
                                            method166(var10);
                                        }
                                    }
                                } else if (var10.field2630 == 6) {
                                    boolean var64 = method1047(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2556;
                                    } else {
                                        var65 = var10.field2596;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2675 != -1) {
                                        class255 var68 = class255.method3852(var10.field2675);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4399(var10.field2580);
                                            var66 = var69.method4348(1);
                                            if (var66 == null) {
                                                method166(var10);
                                            } else {
                                                var66.method2734();
                                                var67 = var66.field1849 / 2;
                                            }
                                        }
                                    } else if (var10.field2662 == 5) {
                                        if (var10.field2593 == 0) {
                                            var66 = field797.method3753((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field2530.method1159();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3789((class259) null, -1, var64, Statics.field2530.field597);
                                        if (var66 == null && class218.field2547) {
                                            method166(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method3856(var65);
                                        var66 = var10.method3789(var70, var10.field2677, var64, Statics.field2530.field597);
                                        if (var66 == null && class218.field2547) {
                                            method166(var10);
                                        }
                                    }
                                    class131.method2834(var10.field2562 / 2 + var12, var10.field2565 / 2 + var13);
                                    int var71 = var10.field2603 * class131.field1762[var10.field2600] >> 16;
                                    int var72 = var10.field2603 * class131.field1752[var10.field2600] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2569) {
                                            var66.method2734();
                                            if (var10.field2606) {
                                                var66.method2749(0, var10.field2601, var10.field2598, var10.field2600, var10.field2632, var10.field2548 + var67 + var71, var10.field2548 + var72, var10.field2603);
                                            } else {
                                                var66.method2747(0, var10.field2601, var10.field2598, var10.field2600, var10.field2632, var10.field2548 + var67 + var71, var10.field2548 + var72);
                                            }
                                        } else {
                                            var66.method2747(0, var10.field2601, 0, var10.field2600, 0, var71, var72);
                                        }
                                    }
                                    class131.method2859();
                                } else {
                                    if (var10.field2630 == 7) {
                                        class295 var73 = var10.method3787();
                                        if (var73 == null) {
                                            if (class218.field2547) {
                                                method166(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2561; var75++) {
                                            for (int var76 = 0; var76 < var10.field2560; var76++) {
                                                if (var10.field2602[var74] > 0) {
                                                    class255 var77 = class255.method3852(var10.field2602[var74] - 1);
                                                    String var78;
                                                    if (var77.field3442 != 1 && var10.field2674[var74] == 1) {
                                                        var78 = class82.method3907(16748608) + var77.field3416 + class82.field1134;
                                                    } else {
                                                        var78 = class82.method3907(16748608) + var77.field3416 + class82.field1134 + " " + 'x' + method125(var10.field2674[var74]);
                                                    }
                                                    int var79 = (var10.field2616 + 115) * var76 + var12;
                                                    int var80 = (var10.field2617 + 12) * var75 + var13;
                                                    if (var10.field2631 == 0) {
                                                        var73.method4987(var78, var79, var80, var10.field2574, var10.field2615 ? 0 : -1);
                                                    } else if (var10.field2631 == 1) {
                                                        var73.method5042(var78, var10.field2562 / 2 + var79, var80, var10.field2574, var10.field2615 ? 0 : -1);
                                                    } else {
                                                        var73.method4990(var78, var10.field2562 + var79 - 1, var80, var10.field2574, var10.field2615 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2630 == 8 && Statics.field40 == var10 && field784 == field783) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class295 var83 = Statics.field3139;
                                        String var84 = var10.field2599;
                                        String var85 = method6106(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1133);
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
                                            var82 += var83.field3661 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2562 + var12 - 5 - var81;
                                        int var90 = var10.field2565 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5585(var89, var90, var81, var82, 16777120);
                                        class321.method5620(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2599;
                                        int var92 = var83.field3661 + var90 + 2;
                                        String var93 = method6106(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1133);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4987(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3661 + 1;
                                        }
                                    }
                                    if (var10.field2630 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2642) {
                                            var96 = var12;
                                            var97 = var10.field2565 + var13;
                                            var98 = var10.field2562 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2562 + var12;
                                            var99 = var10.field2565 + var13;
                                        }
                                        if (var10.field2582 == 1) {
                                            class321.method5595(var96, var97, var98, var99, var10.field2574);
                                        } else {
                                            method3113(var96, var97, var98, var99, var10.field2574, var10.field2582);
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

    @ObfuscatedName("ev.jd(IIIIIII)V")
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3836;
        int var18 = arg1 - class321.field3839;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2828(var19, var20, var21);
        class131.method2837(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2828(var19, var21, var22);
        class131.method2837(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("lg.jk(Ljava/lang/String;Lhi;B)Ljava/lang/String;")
    public static String method6106(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3371(method52(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("d.jq(II)Ljava/lang/String;")
    public static final String method125(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1128 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method3907(65408) + var1.substring(0, var1.length() - 8) + class225.field2824 + " " + class82.field1137 + var1 + class82.field1131 + class82.field1134;
        } else if (var1.length() > 6) {
            return " " + class82.method3907(16777215) + var1.substring(0, var1.length() - 4) + class225.field2887 + " " + class82.field1137 + var1 + class82.field1131 + class82.field1134;
        } else {
            return " " + class82.method3907(16776960) + var1 + class82.field1134;
        }
    }

    @ObfuscatedName("client.jy(ZI)V")
    public final void method1234(boolean arg0) {
        int var2 = field697;
        int var3 = Statics.field3628;
        int var4 = Statics.field3243;
        if (class218.method2615(var2)) {
            method1109(Statics.field2540[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jl(Lhi;I)V")
    public void method1235(class218 arg0) {
        class218 var2 = arg0.field2673 == -1 ? null : class218.method3416(arg0.field2673);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3628;
            var4 = Statics.field3243;
        } else {
            var3 = var2.field2562;
            var4 = var2.field2565;
        }
        method4840(arg0, var3, var4, false);
        method4323(arg0, var3, var4);
    }

    @ObfuscatedName("an.jo([Lhi;Lhi;ZI)V")
    public static void method707(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2572 == 0 ? arg1.field2562 : arg1.field2572;
        int var4 = arg1.field2654 == 0 ? arg1.field2565 : arg1.field2654;
        method1109(arg0, arg1.field2549, var3, var4, arg2);
        if (arg1.field2679 != null) {
            method1109(arg1.field2679, arg1.field2549, var3, var4, arg2);
        }
        class62 var5 = (class62) field793.method5528((long) arg1.field2549);
        if (var5 != null) {
            int var6 = var5.field549;
            if (class218.method2615(var6)) {
                method1109(Statics.field2540[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2553 == 1337) {
        }
    }

    @ObfuscatedName("bt.jz([Lhi;IIIZI)V")
    public static void method1109(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2673 == arg1) {
                method4840(var6, arg2, arg3, arg4);
                method4323(var6, arg2, arg3);
                if (var6.field2573 > var6.field2572 - var6.field2562) {
                    var6.field2573 = var6.field2572 - var6.field2562;
                }
                if (var6.field2573 < 0) {
                    var6.field2573 = 0;
                }
                if (var6.field2614 > var6.field2654 - var6.field2565) {
                    var6.field2614 = var6.field2654 - var6.field2565;
                }
                if (var6.field2614 < 0) {
                    var6.field2614 = 0;
                }
                if (var6.field2630 == 0) {
                    method707(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("js.jw(Lhi;IIZI)V")
    public static void method4840(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2562;
        int var5 = arg0.field2565;
        if (arg0.field2665 == 0) {
            arg0.field2562 = arg0.field2560;
        } else if (arg0.field2665 == 1) {
            arg0.field2562 = arg1 - arg0.field2560;
        } else if (arg0.field2665 == 2) {
            arg0.field2562 = arg0.field2560 * arg1 >> 14;
        }
        if (arg0.field2584 == 0) {
            arg0.field2565 = arg0.field2561;
        } else if (arg0.field2584 == 1) {
            arg0.field2565 = arg2 - arg0.field2561;
        } else if (arg0.field2584 == 2) {
            arg0.field2565 = arg0.field2561 * arg2 >> 14;
        }
        if (arg0.field2665 == 4) {
            arg0.field2562 = arg0.field2566 * arg0.field2565 / arg0.field2567;
        }
        if (arg0.field2584 == 4) {
            arg0.field2565 = arg0.field2567 * arg0.field2562 / arg0.field2566;
        }
        if (arg0.field2553 == 1337) {
            field804 = arg0;
        }
        if (arg3 && arg0.field2664 != null && (arg0.field2562 != var4 || arg0.field2565 != var5)) {
            class63 var6 = new class63();
            var6.field560 = arg0;
            var6.field558 = arg0.field2664;
            field831.method4576(var6);
        }
    }

    @ObfuscatedName("ix.jt(Lhi;III)V")
    public static void method4323(class218 arg0, int arg1, int arg2) {
        if (arg0.field2621 == 0) {
            arg0.field2650 = arg0.field2554;
        } else if (arg0.field2621 == 1) {
            arg0.field2650 = (arg1 - arg0.field2562) / 2 + arg0.field2554;
        } else if (arg0.field2621 == 2) {
            arg0.field2650 = arg1 - arg0.field2562 - arg0.field2554;
        } else if (arg0.field2621 == 3) {
            arg0.field2650 = arg0.field2554 * arg1 >> 14;
        } else if (arg0.field2621 == 4) {
            arg0.field2650 = (arg0.field2554 * arg1 >> 14) + (arg1 - arg0.field2562) / 2;
        } else {
            arg0.field2650 = arg1 - arg0.field2562 - (arg0.field2554 * arg1 >> 14);
        }
        if (arg0.field2555 == 0) {
            arg0.field2563 = arg0.field2559;
        } else if (arg0.field2555 == 1) {
            arg0.field2563 = (arg2 - arg0.field2565) / 2 + arg0.field2559;
        } else if (arg0.field2555 == 2) {
            arg0.field2563 = arg2 - arg0.field2565 - arg0.field2559;
        } else if (arg0.field2555 == 3) {
            arg0.field2563 = arg0.field2559 * arg2 >> 14;
        } else if (arg0.field2555 == 4) {
            arg0.field2563 = (arg0.field2559 * arg2 >> 14) + (arg2 - arg0.field2565) / 2;
        } else {
            arg0.field2563 = arg2 - arg0.field2565 - (arg0.field2559 * arg2 >> 14);
        }
    }

    @ObfuscatedName("bm.jn(Lhi;IIIIIII)V")
    public static final void method1215(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field699) {
            field807 = 32;
        } else {
            field807 = 0;
        }
        field699 = false;
        if (class55.field475 == 1 || !Statics.field113 && class55.field475 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2614 -= 4;
                method166(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2614 += 4;
                method166(arg0);
            } else if (arg5 >= arg1 - field807 && arg5 < field807 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2614 = (arg4 - arg3) * var8 / var9;
                method166(arg0);
                field699 = true;
            }
        }
        if (field756 == 0) {
            return;
        }
        int var10 = arg0.field2562;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2614 += field756 * 45;
            method166(arg0);
        }
    }

    @ObfuscatedName("bh.jg(IIIIIB)V")
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2050[0].method5658(arg0, arg1);
        Statics.field2050[1].method5658(arg0, arg1 + arg3 - 16);
        class321.method5585(arg0, arg1 + 16, 16, arg3 - 32, field896);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class321.method5585(arg0, arg1 + 16 + var6, 16, var5, field662);
        class321.method5593(arg0, arg1 + 16 + var6, var5, field791);
        class321.method5593(arg0 + 1, arg1 + 16 + var6, var5, field791);
        class321.method5581(arg0, arg1 + 16 + var6, 16, field791);
        class321.method5581(arg0, arg1 + 17 + var6, 16, field791);
        class321.method5593(arg0 + 15, arg1 + 16 + var6, var5, field684);
        class321.method5593(arg0 + 14, arg1 + 17 + var6, var5 - 1, field684);
        class321.method5581(arg0, arg1 + 15 + var6 + var5, 16, field684);
        class321.method5581(arg0 + 1, arg1 + 14 + var6 + var5, 15, field684);
    }

    @ObfuscatedName("fx.jr(IB)Ljava/lang/String;")
    public static final String method3371(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bl.je(Lhi;S)Z")
    public static final boolean method1047(class218 arg0) {
        if (arg0.field2668 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2668.length; var1++) {
            int var2 = method52(arg0, var1);
            int var3 = arg0.field2644[var1];
            if (arg0.field2668[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2668[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2668[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("v.jc(Lhi;IB)I")
    public static final int method52(class218 arg0, int arg1) {
        if (arg0.field2667 == null || arg1 >= arg0.field2667.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2667[arg1];
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
                    var7 = field764[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field765[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field766[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method3416(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method3852(var12).field3431 || field636)) {
                        for (int var13 = 0; var13 < var11.field2602.length; var13++) {
                            if (var12 + 1 == var11.field2602[var13]) {
                                var7 += var11.field2674[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2507[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2729[field765[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2507[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2530.field622;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2728[var14]) {
                            var7 += field765[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method3416(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method3852(var18).field3431 || field636)) {
                        for (int var19 = 0; var19 < var17.field2602.length; var19++) {
                            if (var18 + 1 == var17.field2602[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field633;
                }
                if (var6 == 12) {
                    var7 = field824;
                }
                if (var6 == 13) {
                    int var20 = class213.field2507[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method3185(var22);
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
                    var7 = (Statics.field2530.field930 >> 7) + Statics.field1961;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2530.field933 >> 7) + Statics.field1108;
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

    @ObfuscatedName("bt.ji(Lhi;Liw;IIZS)V")
    public static final void method1124(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3412;
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
            var7 = class225.field2745;
        }
        if (var6 != -1 && var7 != null) {
            method3866(var7, class82.method3907(16748608) + arg1.field3416, var6, arg1.field3420, arg2, arg0.field2549, arg4);
        }
    }

    @ObfuscatedName("ce.jx(Lhi;IIB)V")
    public static final void method1980(class218 arg0, int arg1, int arg2) {
        if (arg0.field2557 == 1) {
            method3104(arg0.field2672, "", 24, 0, 0, arg0.field2549);
        }
        if (arg0.field2557 == 2 && !field787) {
            String var3 = method2410(arg0);
            if (var3 != null) {
                method3104(var3, class82.method3907(65280) + arg0.field2671, 25, 0, -1, arg0.field2549);
            }
        }
        if (arg0.field2557 == 3) {
            method3104(class225.field2826, "", 26, 0, 0, arg0.field2549);
        }
        if (arg0.field2557 == 4) {
            method3104(arg0.field2672, "", 28, 0, 0, arg0.field2549);
        }
        if (arg0.field2557 == 5) {
            method3104(arg0.field2672, "", 29, 0, 0, arg0.field2549);
        }
        if (arg0.field2557 == 6 && field798 == null) {
            method3104(arg0.field2672, "", 30, 0, -1, arg0.field2549);
        }
        if (arg0.field2630 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2565; var5++) {
                for (int var6 = 0; var6 < arg0.field2562; var6++) {
                    int var7 = (arg0.field2616 + 32) * var6;
                    int var8 = (arg0.field2617 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2618[var4];
                        var8 += arg0.field2619[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field743 = var4;
                        Statics.field2477 = arg0;
                        if (arg0.field2602[var4] > 0) {
                            label265: {
                                class255 var9 = class255.method3852(arg0.field2602[var4] - 1);
                                if (field785 == 1) {
                                    int var10 = method3452(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2405 != arg0.field2549 || Statics.field573 != var4) {
                                            method3104(class225.field2897, field786 + " " + class82.field1132 + " " + class82.method3907(16748608) + var9.field3416, 31, var9.field3420, var4, arg0.field2549);
                                        }
                                        break label265;
                                    }
                                }
                                if (field787) {
                                    int var12 = method3452(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1136 & 0x10) == 16) {
                                            method3104(field790, field902 + " " + class82.field1132 + " " + class82.method3907(16748608) + var9.field3416, 32, var9.field3420, var4, arg0.field2549);
                                        }
                                        break label265;
                                    }
                                }
                                String[] var14 = var9.field3412;
                                int var15 = -1;
                                if (field652 && method3851()) {
                                    var15 = var9.method4379();
                                }
                                int var16 = method3452(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method1124(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method3452(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method3104(class225.field2897, class82.method3907(16748608) + var9.field3416, 38, var9.field3420, var4, arg0.field2549);
                                }
                                int var21 = method3452(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method1124(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method1124(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field2661;
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
                                            method3104(var24[var25], class82.method3907(16748608) + var9.field3416, var26, var9.field3420, var4, arg0.field2549);
                                        }
                                    }
                                }
                                method3104(class225.field2898, class82.method3907(16748608) + var9.field3416, 1005, var9.field3420, var4, arg0.field2549);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2569) {
            return;
        }
        if (!field787) {
            for (int var27 = 9; var27 >= 5; var27--) {
                String var28 = method178(arg0, var27);
                if (var28 != null) {
                    method3104(var28, arg0.field2676, 1007, var27 + 1, arg0.field2550, arg0.field2549);
                }
            }
            String var29 = method2410(arg0);
            if (var29 != null) {
                method3104(var29, arg0.field2676, 25, 0, arg0.field2550, arg0.field2549);
            }
            for (int var30 = 4; var30 >= 0; var30--) {
                String var31 = method178(arg0, var30);
                if (var31 != null) {
                    method3866(var31, arg0.field2676, 57, var30 + 1, arg0.field2550, arg0.field2549, arg0.field2691);
                }
            }
            int var32 = method3452(arg0);
            boolean var33 = (var32 & 0x1) != 0;
            if (var33) {
                method3104(class225.field2775, "", 30, 0, arg0.field2550, arg0.field2549);
            }
        } else if (class219.method287(method3452(arg0)) && (Statics.field1136 & 0x20) == 32) {
            method3104(field790, field902 + " " + class82.field1132 + " " + arg0.field2676, 58, 0, arg0.field2550, arg0.field2549);
        }
    }

    @ObfuscatedName("ck.jv(ZI)V")
    public static void method2207(boolean arg0) {
        field779 = arg0;
    }

    @ObfuscatedName("aj.js(I)Z")
    public static boolean method646() {
        return field779;
    }

    @ObfuscatedName("hz.jh(B)Z")
    public static boolean method3851() {
        return field779 || class46.field387[81];
    }

    @ObfuscatedName("hr.ju(IIIIIIII)V")
    public static final void method3861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method2615(arg0)) {
            method1066(Statics.field2540[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bh.jf([Lhi;IIIIIIII)V")
    public static final void method1066(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2673 == arg1 && (!var9.field2569 || var9.field2630 == 0 || var9.field2551 || method3452(var9) != 0 || field806 == var9 || var9.field2553 == 1338)) {
                if (var9.field2569) {
                    if (method594(var9)) {
                        continue;
                    }
                } else if (var9.field2630 == 0 && Statics.field1278 != var9 && method594(var9)) {
                    continue;
                }
                int var10 = var9.field2650 + arg6;
                int var11 = var9.field2563 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2630 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2630 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2562 + var10;
                    int var19 = var9.field2565 + var11;
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
                    int var22 = var9.field2562 + var10;
                    int var23 = var9.field2565 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field805 == var9) {
                    field696 = true;
                    field847 = var10;
                    field815 = var11;
                }
                boolean var24 = false;
                if (var9.field2607) {
                    switch(field829) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2549 >>> 16 == field795) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field795 == var9.field2549) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2569 || var12 < var14 && var13 < var15) {
                    if (var9.field2569) {
                        if (var9.field2689) {
                            if (class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                for (class63 var25 = (class63) field831.method4581(); var25 != null; var25 = (class63) field831.method4589()) {
                                    if (var25.field563) {
                                        var25.method3386();
                                        var25.field560.field2604 = false;
                                    }
                                }
                                if (Statics.field1591 == 0) {
                                    field805 = null;
                                    field806 = null;
                                }
                                if (!field884) {
                                    method3400();
                                }
                            }
                        } else if (var9.field2690 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                            for (class63 var26 = (class63) field831.method4581(); var26 != null; var26 = (class63) field831.method4589()) {
                                if (var26.field563 && var26.field560.field2656 == var26.field558) {
                                    var26.method3386();
                                }
                            }
                        }
                    }
                    int var27 = class55.field466;
                    int var28 = class55.field467;
                    if (class55.field473 != 0) {
                        var27 = class55.field464;
                        var28 = class55.field469;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2553 == 1337) {
                        if (!field773 && !field884 && var29) {
                            method148(var27, var28, var12, var13);
                        }
                    } else if (var9.field2553 == 1338) {
                        method297(var9, var10, var11);
                    } else {
                        if (var9.field2553 == 1400) {
                            Statics.field1181.method5972(class55.field466, class55.field467, var29, var10, var11, var9.field2562, var9.field2565);
                        }
                        if (!field884 && var29) {
                            if (var9.field2553 == 1400) {
                                Statics.field1181.method5925(var10, var11, var9.field2562, var9.field2565, var27, var28);
                            } else {
                                method1980(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2624.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2624[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2624[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2628 != null) {
                                            var34 = class46.field387[var9.field2624[var30][var33]];
                                        }
                                        if (method3096(var9.field2624[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2628 != null && var9.field2628[var30] > field643) {
                                                break;
                                            }
                                            byte var35 = var9.field2625[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field387[86] && !class46.field387[82] && !class46.field387[81]) && ((var35 & 0x2) == 0 || class46.field387[86]) && ((var35 & 0x1) == 0 || class46.field387[82]) && ((var35 & 0x4) == 0 || class46.field387[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method4911(var30 + 1, var9.field2549, var9.field2550, var9.field2675, "");
                                    } else if (var30 == 10) {
                                        method1087();
                                        method799(var9.field2549, var9.field2550, class219.method3215(method3452(var9)), var9.field2675);
                                        field790 = method2410(var9);
                                        if (field790 == null) {
                                            field790 = class225.field2836;
                                        }
                                        field902 = var9.field2676 + class82.method3907(16777215);
                                    }
                                    int var36 = var9.field2629[var30];
                                    if (var9.field2628 == null) {
                                        var9.field2628 = new int[var9.field2624.length];
                                    }
                                    if (var9.field2627 == null) {
                                        var9.field2627 = new int[var9.field2624.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2628[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2628[var30] == 0) {
                                        var9.field2628[var30] = field643 + var36 + var9.field2627[var30];
                                    } else {
                                        var9.field2628[var30] = field643 + var36;
                                    }
                                }
                                if (!var31 && var9.field2628 != null) {
                                    var9.field2628[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2569) {
                            boolean var37;
                            if (class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field475 == 1 || !Statics.field113 && class55.field475 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field473 == 1 || !Statics.field113 && class55.field473 == 4) && class55.field464 >= var12 && class55.field469 >= var13 && class55.field464 < var14 && class55.field469 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method60(var9, class55.field464 - var10, class55.field469 - var11);
                            }
                            if (var9.field2553 == 1400) {
                                Statics.field1181.method5874(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field805 != null && field805 != var9 && var37 && class219.method2634(method3452(var9))) {
                                field809 = var9;
                            }
                            if (field806 == var9) {
                                field810 = true;
                                field749 = var10;
                                field752 = var11;
                            }
                            if (var9.field2551) {
                                if (var37 && field756 != 0 && var9.field2656 != null) {
                                    class63 var40 = new class63();
                                    var40.field563 = true;
                                    var40.field560 = var9;
                                    var40.field552 = field756;
                                    var40.field558 = var9.field2656;
                                    field831.method4576(var40);
                                }
                                if (field805 != null || Statics.field63 != null || field884) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2681 && var39) {
                                    var9.field2681 = true;
                                    if (var9.field2613 != null) {
                                        class63 var41 = new class63();
                                        var41.field563 = true;
                                        var41.field560 = var9;
                                        var41.field557 = class55.field464 - var10;
                                        var41.field552 = class55.field469 - var11;
                                        var41.field558 = var9.field2613;
                                        field831.method4576(var41);
                                    }
                                }
                                if (var9.field2681 && var38 && var9.field2638 != null) {
                                    class63 var42 = new class63();
                                    var42.field563 = true;
                                    var42.field560 = var9;
                                    var42.field557 = class55.field466 - var10;
                                    var42.field552 = class55.field467 - var11;
                                    var42.field558 = var9.field2638;
                                    field831.method4576(var42);
                                }
                                if (var9.field2681 && !var38) {
                                    var9.field2681 = false;
                                    if (var9.field2552 != null) {
                                        class63 var43 = new class63();
                                        var43.field563 = true;
                                        var43.field560 = var9;
                                        var43.field557 = class55.field466 - var10;
                                        var43.field552 = class55.field467 - var11;
                                        var43.field558 = var9.field2552;
                                        field833.method4576(var43);
                                    }
                                }
                                if (var38 && var9.field2640 != null) {
                                    class63 var44 = new class63();
                                    var44.field563 = true;
                                    var44.field560 = var9;
                                    var44.field557 = class55.field466 - var10;
                                    var44.field552 = class55.field467 - var11;
                                    var44.field558 = var9.field2640;
                                    field831.method4576(var44);
                                }
                                if (!var9.field2604 && var37) {
                                    var9.field2604 = true;
                                    if (var9.field2641 != null) {
                                        class63 var45 = new class63();
                                        var45.field563 = true;
                                        var45.field560 = var9;
                                        var45.field557 = class55.field466 - var10;
                                        var45.field552 = class55.field467 - var11;
                                        var45.field558 = var9.field2641;
                                        field831.method4576(var45);
                                    }
                                }
                                if (var9.field2604 && var37 && var9.field2535 != null) {
                                    class63 var46 = new class63();
                                    var46.field563 = true;
                                    var46.field560 = var9;
                                    var46.field557 = class55.field466 - var10;
                                    var46.field552 = class55.field467 - var11;
                                    var46.field558 = var9.field2535;
                                    field831.method4576(var46);
                                }
                                if (var9.field2604 && !var37) {
                                    var9.field2604 = false;
                                    if (var9.field2643 != null) {
                                        class63 var47 = new class63();
                                        var47.field563 = true;
                                        var47.field560 = var9;
                                        var47.field557 = class55.field466 - var10;
                                        var47.field552 = class55.field467 - var11;
                                        var47.field558 = var9.field2643;
                                        field833.method4576(var47);
                                    }
                                }
                                if (var9.field2571 != null) {
                                    class63 var48 = new class63();
                                    var48.field560 = var9;
                                    var48.field558 = var9.field2571;
                                    field814.method4576(var48);
                                }
                                if (var9.field2648 != null && field680 > var9.field2645) {
                                    if (var9.field2669 == null || field680 - var9.field2645 > 32) {
                                        class63 var53 = new class63();
                                        var53.field560 = var9;
                                        var53.field558 = var9.field2648;
                                        field831.method4576(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2645; var49 < field680; var49++) {
                                            int var50 = field818[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2669.length; var51++) {
                                                if (var9.field2669[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field560 = var9;
                                                    var52.field558 = var9.field2648;
                                                    field831.method4576(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2645 = field680;
                                }
                                if (var9.field2597 != null && field821 > var9.field2568) {
                                    if (var9.field2651 == null || field821 - var9.field2568 > 32) {
                                        class63 var58 = new class63();
                                        var58.field560 = var9;
                                        var58.field558 = var9.field2597;
                                        field831.method4576(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2568; var54 < field821; var54++) {
                                            int var55 = field817[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2651.length; var56++) {
                                                if (var9.field2651[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field560 = var9;
                                                    var57.field558 = var9.field2597;
                                                    field831.method4576(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2568 = field821;
                                }
                                if (var9.field2663 != null && field823 > var9.field2685) {
                                    if (var9.field2653 == null || field823 - var9.field2685 > 32) {
                                        class63 var63 = new class63();
                                        var63.field560 = var9;
                                        var63.field558 = var9.field2663;
                                        field831.method4576(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2685; var59 < field823; var59++) {
                                            int var60 = field822[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2653.length; var61++) {
                                                if (var9.field2653[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field560 = var9;
                                                    var62.field558 = var9.field2663;
                                                    field831.method4576(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2685 = field823;
                                }
                                if (field888 > var9.field2682 && var9.field2657 != null) {
                                    class63 var64 = new class63();
                                    var64.field560 = var9;
                                    var64.field558 = var9.field2657;
                                    field831.method4576(var64);
                                }
                                if (field825 > var9.field2682 && var9.field2639 != null) {
                                    class63 var65 = new class63();
                                    var65.field560 = var9;
                                    var65.field558 = var9.field2639;
                                    field831.method4576(var65);
                                }
                                if (field826 > var9.field2682 && var9.field2660 != null) {
                                    class63 var66 = new class63();
                                    var66.field560 = var9;
                                    var66.field558 = var9.field2660;
                                    field831.method4576(var66);
                                }
                                if (field827 > var9.field2682 && var9.field2626 != null) {
                                    class63 var67 = new class63();
                                    var67.field560 = var9;
                                    var67.field558 = var9.field2626;
                                    field831.method4576(var67);
                                }
                                if (field653 > var9.field2682 && var9.field2666 != null) {
                                    class63 var68 = new class63();
                                    var68.field560 = var9;
                                    var68.field558 = var9.field2666;
                                    field831.method4576(var68);
                                }
                                if (field835 > var9.field2682 && var9.field2649 != null) {
                                    class63 var69 = new class63();
                                    var69.field560 = var9;
                                    var69.field558 = var9.field2649;
                                    field831.method4576(var69);
                                }
                                var9.field2682 = field757;
                                if (var9.field2658 != null) {
                                    for (int var70 = 0; var70 < field867; var70++) {
                                        class63 var71 = new class63();
                                        var71.field560 = var9;
                                        var71.field561 = field855[var70];
                                        var71.field553 = field854[var70];
                                        var71.field558 = var9.field2658;
                                        field831.method4576(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2569) {
                            if (field805 != null || Statics.field63 != null || field884) {
                                continue;
                            }
                            if ((var9.field2670 >= 0 || var9.field2576 != 0) && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                if (var9.field2670 >= 0) {
                                    Statics.field1278 = arg0[var9.field2670];
                                } else {
                                    Statics.field1278 = var9;
                                }
                            }
                            if (var9.field2630 == 8 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                Statics.field40 = var9;
                            }
                            if (var9.field2654 > var9.field2565) {
                                method1215(var9, var9.field2562 + var10, var11, var9.field2565, var9.field2654, class55.field466, class55.field467);
                            }
                        }
                        if (var9.field2630 == 0) {
                            method1066(arg0, var9.field2549, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2614);
                            if (var9.field2679 != null) {
                                method1066(var9.field2679, var9.field2549, var12, var13, var14, var15, var10 - var9.field2573, var11 - var9.field2614);
                            }
                            class62 var72 = (class62) field793.method5528((long) var9.field2549);
                            if (var72 != null) {
                                if (var72.field545 == 0 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15 && !field884) {
                                    for (class63 var73 = (class63) field831.method4581(); var73 != null; var73 = (class63) field831.method4589()) {
                                        if (var73.field563) {
                                            var73.method3386();
                                            var73.field560.field2604 = false;
                                        }
                                    }
                                    if (Statics.field1591 == 0) {
                                        field805 = null;
                                        field806 = null;
                                    }
                                    if (!field884) {
                                        method3400();
                                    }
                                }
                                method3861(var72.field549, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("em.jp(II)Z")
    public static boolean method3096(int arg0) {
        for (int var1 = 0; var1 < field867; var1++) {
            if (field855[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cr.jj(III)V")
    public static final void method1999(int arg0, int arg1) {
        if (class218.method2615(arg0)) {
            Statics.method3683(Statics.field2540[arg0], arg1);
        }
    }

    @ObfuscatedName("v.kk(Lhi;III)V")
    public static final void method60(class218 arg0, int arg1, int arg2) {
        if (field805 != null || field884 || arg0 == null || method525(arg0) == null) {
            return;
        }
        field805 = arg0;
        field806 = method525(arg0);
        field703 = arg1;
        field808 = arg2;
        Statics.field1591 = 0;
        field876 = false;
        int var3 = method193();
        if (var3 != -1) {
            method2157(var3);
        }
    }

    @ObfuscatedName("client.kr(I)V")
    public final void method1236() {
        method166(field805);
        Statics.field1591++;
        if (field696 && field810) {
            int var1 = class55.field466;
            int var2 = class55.field467;
            int var3 = var1 - field703;
            int var4 = var2 - field808;
            if (var3 < field749) {
                var3 = field749;
            }
            if (field805.field2562 + var3 > field749 + field806.field2562) {
                var3 = field749 + field806.field2562 - field805.field2562;
            }
            if (var4 < field752) {
                var4 = field752;
            }
            if (field805.field2565 + var4 > field752 + field806.field2565) {
                var4 = field752 + field806.field2565 - field805.field2565;
            }
            int var5 = var3 - field847;
            int var6 = var4 - field815;
            int var7 = field805.field2589;
            if (Statics.field1591 > field805.field2543 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field876 = true;
            }
            int var8 = field806.field2573 + (var3 - field749);
            int var9 = field806.field2614 + (var4 - field752);
            if (field805.field2683 != null && field876) {
                class63 var10 = new class63();
                var10.field560 = field805;
                var10.field557 = var8;
                var10.field552 = var9;
                var10.field558 = field805.field2683;
                class77.method165(var10);
            }
            if (class55.field475 == 0) {
                if (field876) {
                    if (field805.field2688 != null) {
                        class63 var11 = new class63();
                        var11.field560 = field805;
                        var11.field557 = var8;
                        var11.field552 = var9;
                        var11.field556 = field809;
                        var11.field558 = field805.field2688;
                        class77.method165(var11);
                    }
                    if (field809 != null && method2612(field805) != null) {
                        class188 var12 = class188.method2402(class184.field2227, field679.field1284);
                        var12.field2308.method5158(field805.field2675);
                        var12.field2308.method5167(field809.field2549);
                        var12.field2308.method5157(field809.field2550);
                        var12.field2308.method5158(field805.field2550);
                        var12.field2308.method5322(field809.field2675);
                        var12.field2308.method5167(field805.field2549);
                        field679.method2177(var12);
                    }
                } else if (this.method1232()) {
                    this.method1233(field847 + field703, field815 + field808);
                } else if (field769 > 0) {
                    method285(field847 + field703, field815 + field808);
                }
                field805 = null;
            }
        } else if (Statics.field1591 > 1) {
            field805 = null;
        }
    }

    @ObfuscatedName("cj.kh(II)V")
    public static void method2157(int arg0) {
        Statics.field3094 = new class83();
        Statics.field3094.field1141 = field770[arg0];
        Statics.field3094.field1139 = field771[arg0];
        Statics.field3094.field1140 = field772[arg0];
        Statics.field3094.field1142 = field837[arg0];
        Statics.field3094.field1138 = field774[arg0];
    }

    @ObfuscatedName("f.kw(III)V")
    public static void method285(int arg0, int arg1) {
        class83 var2 = Statics.field3094;
        method1213(var2.field1141, var2.field1139, var2.field1140, var2.field1142, var2.field1138, var2.field1138, arg0, arg1);
        Statics.field3094 = null;
    }

    @ObfuscatedName("h.kq(Lhi;I)V")
    public static void method166(class218 arg0) {
        if (field836 == arg0.field2687) {
            field843[arg0.field2686] = true;
        }
    }

    @ObfuscatedName("et.ko(I)V")
    public static void method3089() {
        for (class62 var0 = (class62) field793.method5536(); var0 != null; var0 = (class62) field793.method5530()) {
            int var1 = var0.field549;
            if (class218.method2615(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field2540[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2569;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2091;
                    class218 var6 = class218.method3416(var5);
                    if (var6 != null) {
                        method166(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.kp(Lhi;B)Lhi;")
    public static class218 method525(class218 arg0) {
        class218 var1 = method2612(arg0);
        if (var1 == null) {
            var1 = arg0.field2558;
        }
        return var1;
    }

    @ObfuscatedName("ar.ks(IB)V")
    public static final void method399(int arg0) {
        if (!class218.method2615(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2540[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2677 = 0;
                var3.field2678 = 0;
            }
        }
    }

    @ObfuscatedName("f.kx(II)V")
    public static final void method286(int arg0) {
        if (class218.method2615(arg0)) {
            method4189(Statics.field2540[arg0], -1);
        }
    }

    @ObfuscatedName("il.ka([Lhi;IB)V")
    public static final void method4189(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2673 == arg1 && (!var3.field2569 || !method594(var3))) {
                if (var3.field2630 == 0) {
                    if (!var3.field2569 && method594(var3) && Statics.field1278 != var3) {
                        continue;
                    }
                    method4189(arg0, var3.field2549);
                    if (var3.field2679 != null) {
                        method4189(var3.field2679, var3.field2549);
                    }
                    class62 var4 = (class62) field793.method5528((long) var3.field2549);
                    if (var4 != null) {
                        method286(var4.field549);
                    }
                }
                if (var3.field2630 == 6) {
                    if (var3.field2596 != -1 || var3.field2556 != -1) {
                        boolean var5 = method1047(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2556;
                        } else {
                            var6 = var3.field2596;
                        }
                        if (var6 != -1) {
                            class259 var7 = class259.method3856(var6);
                            var3.field2678 += field694;
                            while (var3.field2678 > var7.field3511[var3.field2677]) {
                                var3.field2678 -= var7.field3511[var3.field2677];
                                var3.field2677++;
                                if (var3.field2677 >= var7.field3521.length) {
                                    var3.field2677 -= var7.field3513;
                                    if (var3.field2677 < 0 || var3.field2677 >= var7.field3521.length) {
                                        var3.field2677 = 0;
                                    }
                                }
                                method166(var3);
                            }
                        }
                    }
                    if (var3.field2605 != 0 && !var3.field2569) {
                        int var8 = var3.field2605 >> 16;
                        int var9 = var3.field2605 << 16 >> 16;
                        int var10 = field694 * var8;
                        int var11 = field694 * var9;
                        var3.field2600 = var3.field2600 + var10 & 0x7FF;
                        var3.field2601 = var3.field2601 + var11 & 0x7FF;
                        method166(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.kj(IB)V")
    public static final void method310(int arg0) {
        method3089();
        for (class76 var1 = (class76) class76.field1051.method4581(); var1 != null; var1 = (class76) class76.field1051.method4589()) {
            if (var1.field1063 != null) {
                var1.method1832();
            }
        }
        int var2 = class241.method2125(arg0).field3193;
        if (var2 == 0) {
            return;
        }
        int var3 = class213.field2507[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class131.method2831(0.9D);
                ((class120) Statics.field1749).method2609(0.9D);
            }
            if (var3 == 2) {
                class131.method2831(0.8D);
                ((class120) Statics.field1749).method2609(0.8D);
            }
            if (var3 == 3) {
                class131.method2831(0.7D);
                ((class120) Statics.field1749).method2609(0.7D);
            }
            if (var3 == 4) {
                class131.method2831(0.6D);
                ((class120) Statics.field1749).method2609(0.6D);
            }
            class255.field3398.method3123();
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
            if (field865 != var4) {
                if (field865 == 0 && field866 != -1) {
                    class198.method3457(Statics.field2532, field866, 0, var4, false);
                    field856 = false;
                } else if (var4 == 0) {
                    class198.method2208();
                    field856 = false;
                } else if (class198.field2378 == 0) {
                    Statics.field2375.method3552(var4);
                } else {
                    Statics.field2380 = var4;
                }
                field865 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field868 = 127;
            }
            if (var3 == 1) {
                field868 = 96;
            }
            if (var3 == 2) {
                field868 = 64;
            }
            if (var3 == 3) {
                field868 = 32;
            }
            if (var3 == 4) {
                field868 = 0;
            }
        }
        if (var2 == 5) {
            field767 = var3;
        }
        if (var2 == 6) {
            field641 = var3;
        }
        if (var2 == 9) {
            field908 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field869 = 127;
            }
            if (var3 == 1) {
                field869 = 96;
            }
            if (var3 == 2) {
                field869 = 64;
            }
            if (var3 == 3) {
                field869 = 32;
            }
            if (var3 == 4) {
                field869 = 0;
            }
        }
        if (var2 == 17) {
            field802 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class85[] var5 = new class85[] { class85.field1149, class85.field1150, class85.field1155, class85.field1151 };
            field659 = (class85) class196.method292(var5, var3);
            if (field659 == null) {
                field659 = class85.field1155;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field759 = -1;
            } else {
                field759 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class85[] var6 = new class85[] { class85.field1149, class85.field1150, class85.field1155, class85.field1151 };
        field839 = (class85) class196.method292(var6, var3);
        if (field839 == null) {
            field839 = class85.field1155;
        }
    }

    @ObfuscatedName("hs.kf(Lhi;I)V")
    public static final void method3868(class218 arg0) {
        int var1 = arg0.field2553;
        if (var1 == 324) {
            if (field819 == -1) {
                field819 = arg0.field2680;
                field897 = arg0.field2585;
            }
            if (field797.field2516) {
                arg0.field2680 = field819;
            } else {
                arg0.field2680 = field897;
            }
        } else if (var1 == 325) {
            if (field819 == -1) {
                field819 = arg0.field2680;
                field897 = arg0.field2585;
            }
            if (field797.field2516) {
                arg0.field2680 = field897;
            } else {
                arg0.field2680 = field819;
            }
        } else if (var1 == 327) {
            arg0.field2600 = 150;
            arg0.field2601 = (int) (Math.sin((double) field643 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2662 = 5;
            arg0.field2593 = 0;
        } else if (var1 == 328) {
            arg0.field2600 = 150;
            arg0.field2601 = (int) (Math.sin((double) field643 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2662 = 5;
            arg0.field2593 = 1;
        }
    }

    @ObfuscatedName("hd.kc(I)V")
    public static final void method3850() {
        class188 var0 = class188.method2402(class184.field2266, field679.field1284);
        field679.method2177(var0);
        for (class62 var1 = (class62) field793.method5536(); var1 != null; var1 = (class62) field793.method5530()) {
            if (var1.field545 == 0 || var1.field545 == 3) {
                method1206(var1, true);
            }
        }
        if (field798 != null) {
            method166(field798);
            field798 = null;
        }
    }

    @ObfuscatedName("y.ki(IIII)Lbq;")
    public static final class62 method306(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field549 = arg1;
        var3.field545 = arg2;
        field793.method5529(var3, (long) arg0);
        method399(arg1);
        class218 var4 = class218.method3416(arg0);
        method166(var4);
        if (field798 != null) {
            method166(field798);
            field798 = null;
        }
        for (int var5 = 0; var5 < field769; var5++) {
            if (method298(field772[var5])) {
                if (var5 < field769 - 1) {
                    for (int var6 = var5; var6 < field769 - 1; var6++) {
                        field774[var6] = field774[var6 + 1];
                        field775[var6] = field775[var6 + 1];
                        field772[var6] = field772[var6 + 1];
                        field837[var6] = field837[var6 + 1];
                        field770[var6] = field770[var6 + 1];
                        field771[var6] = field771[var6 + 1];
                        field776[var6] = field776[var6 + 1];
                    }
                }
                var5--;
                field769--;
            }
        }
        method524();
        method707(Statics.field2540[arg0 >> 16], var4, false);
        class77.method3091(arg1);
        if (field697 != -1) {
            method1999(field697, 1);
        }
        return var3;
    }

    @ObfuscatedName("bm.kz(Lbq;ZI)V")
    public static final void method1206(class62 arg0, boolean arg1) {
        int var2 = arg0.field549;
        int var3 = (int) arg0.field2091;
        arg0.method3386();
        if (arg1) {
            class218.method3774(var2);
        }
        method3471(var2);
        class218 var4 = class218.method3416(var3);
        if (var4 != null) {
            method166(var4);
        }
        for (int var5 = 0; var5 < field769; var5++) {
            if (method298(field772[var5])) {
                if (var5 < field769 - 1) {
                    for (int var6 = var5; var6 < field769 - 1; var6++) {
                        field774[var6] = field774[var6 + 1];
                        field775[var6] = field775[var6 + 1];
                        field772[var6] = field772[var6 + 1];
                        field837[var6] = field837[var6 + 1];
                        field770[var6] = field770[var6 + 1];
                        field771[var6] = field771[var6 + 1];
                        field776[var6] = field776[var6 + 1];
                    }
                }
                var5--;
                field769--;
            }
        }
        method524();
        if (field697 != -1) {
            method1999(field697, 1);
        }
    }

    @ObfuscatedName("s.ky(Lhi;I)Z")
    public static final boolean method205(class218 arg0) {
        int var1 = arg0.field2553;
        if (var1 == 205) {
            field634 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field797.method3738(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field797.method3739(var4, var5 == 1);
        }
        if (var1 == 324) {
            field797.method3740(false);
        }
        if (var1 == 325) {
            field797.method3740(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method2402(class184.field2265, field679.field1284);
            field797.method3741(var6.field2308);
            field679.method2177(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hy.ku(Lhi;IIII)V")
    public static final void method3859(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3790(false);
        if (var4 == null) {
            return;
        }
        if (field864 < 3) {
            Statics.field2.method5712(arg1, arg2, var4.field2498, var4.field2501, 25, 25, field702, 256, var4.field2497, var4.field2499);
        } else {
            class321.method5597(arg1, arg2, 0, var4.field2497, var4.field2499);
        }
    }

    @ObfuscatedName("ax.kg(IIIILlx;Lhn;B)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1130(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field702 & 0x7FF;
        int var8 = class131.field1762[var7];
        int var9 = class131.field1752[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2498 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field27.method5779(arg5.field2498 / 2 + arg0 - var17 / 2 + var15, arg5.field2501 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bt.kn(IIIILlx;Lhn;B)V")
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field702 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1762[var6];
        int var9 = class131.field1752[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5711(arg5.field2498 / 2 + var10 - arg4.field3867 / 2, arg5.field2501 / 2 - var11 - arg4.field3865 / 2, arg0, arg1, arg5.field2498, arg5.field2501, arg5.field2497, arg5.field2499);
        } else {
            arg4.method5686(arg5.field2498 / 2 + arg0 + var10 - arg4.field3867 / 2, arg5.field2501 / 2 + arg1 - var11 - arg4.field3865 / 2);
        }
    }

    @ObfuscatedName("kz.ke(I)V")
    public static final void method5394() {
        for (int var0 = 0; var0 < class90.field1240; var0++) {
            class67 var1 = field748[class90.field1232[var0]];
            var1.method1174();
        }
        Iterator var2 = class92.field1249.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1123();
        }
        if (Statics.field28 != null) {
            Statics.field28.method4879();
        }
    }

    @ObfuscatedName("ah.kl(I)V")
    public static final void method701() {
        Iterator var0 = class92.field1249.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1113();
        }
        if (Statics.field28 != null) {
            Statics.field28.method4880();
        }
    }

    @ObfuscatedName("z.kt(I)V")
    public static final void method258() {
        for (int var0 = 0; var0 < class90.field1240; var0++) {
            class67 var1 = field748[class90.field1232[var0]];
            var1.method1156();
        }
    }

    @ObfuscatedName("fg.km(I)V")
    public static final void method3257() {
        field825 = field757;
    }

    @ObfuscatedName("gc.kb(B)V")
    public static final void method3681() {
        field826 = field757;
        Statics.field3596 = true;
    }

    @ObfuscatedName("ey.lc(Ljava/lang/String;S)V")
    public static final void method3188(String arg0) {
        if (Statics.field28 != null) {
            class188 var1 = class188.method2402(class184.field2196, field679.field1284);
            var1.field2308.method5253(Statics.method3242(arg0));
            var1.field2308.method5114(arg0);
            field679.method2177(var1);
        }
    }

    @ObfuscatedName("ep.la(Ljava/lang/String;B)V")
    public static final void method3085(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method2402(class184.field2268, field679.field1284);
            var1.field2308.method5253(Statics.method3242(arg0));
            var1.field2308.method5114(arg0);
            field679.method2177(var1);
        }
    }

    @ObfuscatedName("jy.lq(B)V")
    public static final void method4664() {
        class188 var0 = class188.method2402(class184.field2268, field679.field1284);
        var0.field2308.method5253(0);
        field679.method2177(var0);
    }

    @ObfuscatedName("gh.lr(II)V")
    public static void method3471(int arg0) {
        for (class180 var1 = (class180) field670.method5536(); var1 != null; var1 = (class180) field670.method5530()) {
            if ((long) arg0 == (var1.field2091 >> 48 & 0xFFFFL)) {
                var1.method3386();
            }
        }
    }

    @ObfuscatedName("go.ll(Lhi;I)I")
    public static int method3452(class218 arg0) {
        class180 var1 = (class180) field670.method5528(((long) arg0.field2549 << 32) + (long) arg0.field2550);
        return var1 == null ? arg0.field2622 : var1.field2088;
    }

    @ObfuscatedName("dp.lh(Lhi;B)Lhi;")
    public static class218 method2612(class218 arg0) {
        int var1 = method3452(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class218.method3416(arg0.field2673);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ax.ls(Lhi;I)Z")
    public static boolean method594(class218 arg0) {
        return arg0.field2570;
    }

    @ObfuscatedName("j.li(Lhi;II)Ljava/lang/String;")
    public static String method178(class218 arg0, int arg1) {
        if (!class219.method3082(method3452(arg0), arg1) && arg0.field2655 == null) {
            return null;
        } else if (arg0.field2595 == null || arg0.field2595.length <= arg1 || arg0.field2595[arg1] == null || arg0.field2595[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2595[arg1];
        }
    }

    @ObfuscatedName("dm.lv(Lhi;B)Ljava/lang/String;")
    public static String method2410(class218 arg0) {
        if (class219.method3215(method3452(arg0)) == 0) {
            return null;
        } else if (arg0.field2592 == null || arg0.field2592.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2592;
        }
    }

    @ObfuscatedName("ie.lu(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4102(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field635 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field635 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field635 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field635 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field635 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1995 != null) {
            var3 = "/p=" + Statics.field1995;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field281 + "/a=" + Statics.field4042 + var3 + "/";
    }

    @ObfuscatedName("fc.lt(Ljava/lang/String;S)V")
    public static void method3374(String arg0) {
        Statics.field1995 = arg0;
        try {
            String var1 = Statics.field257.getParameter(Integer.toString(18));
            String var2 = Statics.field257.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class297.method3777() + 94608000000L;
                class208.field2480.setTime(new Date(var6));
                int var8 = class208.field2480.get(7);
                int var9 = class208.field2480.get(5);
                int var10 = class208.field2480.get(2);
                int var11 = class208.field2480.get(1);
                int var12 = class208.field2480.get(11);
                int var13 = class208.field2480.get(12);
                int var14 = class208.field2480.get(13);
                String var15 = class208.field2483[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class208.field2481[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class48.method748(Statics.field257, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("et.lw(Ljava/lang/String;ZI)V")
    public static void method3088(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3395; var5++) {
            class255 var6 = class255.method3852(var5);
            if ((!arg1 || var6.field3441) && var6.field3392 == -1 && var6.field3416.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field477 = -1;
                    Statics.field1952 = null;
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
        Statics.field1952 = var3;
        Statics.field322 = 0;
        Statics.field477 = var4;
        String[] var9 = new String[Statics.field477];
        for (int var10 = 0; var10 < Statics.field477; var10++) {
            var9[var10] = class255.method3852(var3[var10]).field3416;
        }
        short[] var11 = Statics.field1952;
        class190.method3376(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("jn.lx([BIB)V")
    public static void method4702(byte[] arg0, int arg1) {
        if (field673 == null) {
            field673 = new byte[24];
        }
        class301.method5369(arg0, arg1, field673, 0, 24);
    }

    @ObfuscatedName("l.ld(Lkc;II)V")
    public static void method71(class300 arg0, int arg1) {
        method4702(arg0.field3699, arg1);
        if (class168.field2026 == null) {
            return;
        }
        try {
            class168.field2026.method6147(0L);
            class168.field2026.method6133(arg0.field3699, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.lz(S)Lju;")
    public class283 method1237() {
        return Statics.field2530 == null ? null : Statics.field2530.field601;
    }

    @ObfuscatedName("bn.lm(B)Z")
    public static boolean method1649() {
        return field755 >= 2;
    }

    @ObfuscatedName("g.lf(II)V")
    public static void method289(int arg0) {
        field707 = arg0;
    }

    @ObfuscatedName("gs.lb(B)V")
    public static void method3406() {
        field679.method2177(class188.method2402(class184.field2211, field679.field1284));
        field707 = 0;
    }

    @ObfuscatedName("av.lk(I)V")
    public static void method546() {
        if (field707 == 1) {
            field646 = true;
        }
    }

    @ObfuscatedName("kq.lp(I)V")
    public static void method4964() {
        if (!field646 || Statics.field2530 == null) {
            return;
        }
        int var0 = Statics.field2530.field924[0];
        int var1 = Statics.field2530.field931[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field3586 = Statics.field2530.field930;
        int var2 = method1942(Statics.field2530.field930, Statics.field2530.field933, Statics.field625) - field708;
        if (var2 < Statics.field498) {
            Statics.field498 = var2;
        }
        Statics.field3130 = Statics.field2530.field933;
        field646 = false;
    }

    @ObfuscatedName("gu.lo(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method3415(String arg0) {
        class229[] var1 = class229.method800();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3080 != -1 && arg0.startsWith(class82.method90(var3.field3080))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3080).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("et.lj(I)V")
    public static void method3090() {
        if (Statics.field31 == null) {
            return;
        }
        field901 = field643;
        Statics.field31.method4041();
        for (int var0 = 0; var0 < field748.length; var0++) {
            if (field748[var0] != null) {
                Statics.field31.method4035((field748[var0].field930 >> 7) + Statics.field1961, (field748[var0].field933 >> 7) + Statics.field1108);
            }
        }
    }
}

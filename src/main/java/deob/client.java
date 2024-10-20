package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class54 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field659 = new class173[4];

    @ObfuscatedName("client.au")
    public static boolean field860 = true;

    @ObfuscatedName("client.bg")
    public static int field624 = 1;

    @ObfuscatedName("client.bn")
    public static int field760 = 0;

    @ObfuscatedName("client.bp")
    public static int field626 = 0;

    @ObfuscatedName("client.bv")
    public static boolean field627 = false;

    @ObfuscatedName("client.bf")
    public static boolean field838 = false;

    @ObfuscatedName("client.bj")
    public static int field857 = -1;

    @ObfuscatedName("client.bd")
    public static boolean field630 = false;

    @ObfuscatedName("client.by")
    public static int field631 = 0;

    @ObfuscatedName("client.cl")
    public static boolean field658 = true;

    @ObfuscatedName("client.ca")
    public static int field628 = 0;

    @ObfuscatedName("client.ck")
    public static long field635 = 1L;

    @ObfuscatedName("client.ce")
    public static int field636 = -1;

    @ObfuscatedName("client.cn")
    public static int field668 = -1;

    @ObfuscatedName("client.cj")
    public static long field638 = -1L;

    @ObfuscatedName("client.cw")
    public static boolean field640 = true;

    @ObfuscatedName("client.cu")
    public static boolean field853 = false;

    @ObfuscatedName("client.cd")
    public static int field641 = 0;

    @ObfuscatedName("client.cs")
    public static int field881 = 0;

    @ObfuscatedName("client.cx")
    public static int field643 = 0;

    @ObfuscatedName("client.ci")
    public static int field644 = 0;

    @ObfuscatedName("client.cf")
    public static int field645 = 0;

    @ObfuscatedName("client.cq")
    public static int field646 = 0;

    @ObfuscatedName("client.co")
    public static int field647 = 0;

    @ObfuscatedName("client.cz")
    public static int field768 = 0;

    @ObfuscatedName("client.cp")
    public static int field826 = 0;

    @ObfuscatedName("client.cg")
    public static class85 field886 = class85.field1147;

    @ObfuscatedName("client.dj")
    public static class85 field651 = class85.field1147;

    @ObfuscatedName("client.do")
    public static int field652 = 0;

    @ObfuscatedName("client.dd")
    public static int field653 = 0;

    @ObfuscatedName("client.dp")
    public static int field654 = 0;

    @ObfuscatedName("client.en")
    public static int field655 = 0;

    @ObfuscatedName("client.eo")
    public static int field656 = 0;

    @ObfuscatedName("client.el")
    public static int field657 = 0;

    @ObfuscatedName("client.ea")
    public static int field842 = 0;

    @ObfuscatedName("client.em")
    public static int field822 = 0;

    @ObfuscatedName("client.ev")
    public static class161 field660 = class161.field1974;

    @ObfuscatedName("client.eb")
    public static boolean field661 = false;

    @ObfuscatedName("client.ei")
    public static class89 field723 = new class89();

    @ObfuscatedName("client.ee")
    public static byte[] field663 = null;

    @ObfuscatedName("client.ew")
    public static class80[] field634 = new class80[32768];

    @ObfuscatedName("client.ex")
    public static int field665 = 0;

    @ObfuscatedName("client.ft")
    public static int[] field875 = new int[32768];

    @ObfuscatedName("client.ff")
    public static int field667 = 0;

    @ObfuscatedName("client.fh")
    public static int[] field882 = new int[250];

    @ObfuscatedName("client.fd")
    public static final class96 field669 = new class96();

    @ObfuscatedName("client.fz")
    public static int field670 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field773 = false;

    @ObfuscatedName("client.fc")
    public static boolean field650 = true;

    @ObfuscatedName("client.fq")
    public static class272 field673 = new class272();

    @ObfuscatedName("client.fj")
    public static HashMap field674 = new HashMap();

    @ObfuscatedName("client.fb")
    public static int field675 = 0;

    @ObfuscatedName("client.fn")
    public static int field852 = 1;

    @ObfuscatedName("client.fo")
    public static int field677 = 0;

    @ObfuscatedName("client.ga")
    public static int field873 = 1;

    @ObfuscatedName("client.gw")
    public static int field679 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field676 = false;

    @ObfuscatedName("client.gh")
    public static int[][][] field682 = new int[4][13][13];

    @ObfuscatedName("client.gq")
    public static final int[] field683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gg")
    public static int field684 = 0;

    @ObfuscatedName("client.hh")
    public static int field685 = 2301979;

    @ObfuscatedName("client.hq")
    public static int field746 = 5063219;

    @ObfuscatedName("client.hd")
    public static int field687 = 3353893;

    @ObfuscatedName("client.hi")
    public static int field818 = 7759444;

    @ObfuscatedName("client.hc")
    public static boolean field713 = false;

    @ObfuscatedName("client.hj")
    public static int field642 = 0;

    @ObfuscatedName("client.hu")
    public static int field691 = 128;

    @ObfuscatedName("client.hk")
    public static int field692 = 0;

    @ObfuscatedName("client.hr")
    public static int field693 = 0;

    @ObfuscatedName("client.he")
    public static int field694 = 0;

    @ObfuscatedName("client.hb")
    public static int field695 = 0;

    @ObfuscatedName("client.hv")
    public static int field764 = 0;

    @ObfuscatedName("client.hn")
    public static int field697 = 0;

    @ObfuscatedName("client.hx")
    public static int field698 = 50;

    @ObfuscatedName("client.hg")
    public static int field699 = 0;

    @ObfuscatedName("client.hz")
    public static int field803 = 0;

    @ObfuscatedName("client.ib")
    public static int field701 = 0;

    @ObfuscatedName("client.in")
    public static int field702 = 12;

    @ObfuscatedName("client.ir")
    public static int field703 = 6;

    @ObfuscatedName("client.ii")
    public static int field689 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field825 = false;

    @ObfuscatedName("client.is")
    public static int field884 = 0;

    @ObfuscatedName("client.iu")
    public static boolean field859 = false;

    @ObfuscatedName("client.ih")
    public static int field708 = 0;

    @ObfuscatedName("client.im")
    public static int field709 = 0;

    @ObfuscatedName("client.il")
    public static int field662 = 50;

    @ObfuscatedName("client.iq")
    public static int[] field711 = new int[field662];

    @ObfuscatedName("client.if")
    public static int[] field712 = new int[field662];

    @ObfuscatedName("client.it")
    public static String field777 = null;

    @ObfuscatedName("client.ij")
    public static int[] field894 = new int[field662];

    @ObfuscatedName("client.iv")
    public static int[] field887 = new int[field662];

    @ObfuscatedName("client.ic")
    public static int[] field715 = new int[field662];

    @ObfuscatedName("client.iy")
    public static int[] field716 = new int[field662];

    @ObfuscatedName("client.id")
    public static int[] field717 = new int[field662];

    @ObfuscatedName("client.ie")
    public static String[] field629 = new String[field662];

    @ObfuscatedName("client.ia")
    public static int[][] field719 = new int[104][104];

    @ObfuscatedName("client.ip")
    public static int field778 = 0;

    @ObfuscatedName("client.iw")
    public static int field781 = -1;

    @ObfuscatedName("client.ig")
    public static int field722 = -1;

    @ObfuscatedName("client.jd")
    public static int field680 = 0;

    @ObfuscatedName("client.jv")
    public static int field724 = 0;

    @ObfuscatedName("client.jo")
    public static int field686 = 0;

    @ObfuscatedName("client.jf")
    public static int field726 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field727 = true;

    @ObfuscatedName("client.jk")
    public static int field728 = 0;

    @ObfuscatedName("client.js")
    public static int field729 = 0;

    @ObfuscatedName("client.jc")
    public static int field730 = 0;

    @ObfuscatedName("client.jg")
    public static int field731 = 0;

    @ObfuscatedName("client.jl")
    public static int field871 = 0;

    @ObfuscatedName("client.jw")
    public static int field733 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field734 = false;

    @ObfuscatedName("client.ji")
    public static int field735 = 0;

    @ObfuscatedName("client.jm")
    public static int field736 = 0;

    @ObfuscatedName("client.je")
    public static boolean field737 = true;

    @ObfuscatedName("client.jb")
    public static class67[] field625 = new class67[2048];

    @ObfuscatedName("client.jt")
    public static int field806 = -1;

    @ObfuscatedName("client.jy")
    public static int field740 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field885 = true;

    @ObfuscatedName("client.kb")
    public static int field742 = 0;

    @ObfuscatedName("client.kn")
    public static int field743 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field732 = new int[1000];

    @ObfuscatedName("client.kf")
    public static final int[] field745 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ko")
    public static String[] field681 = new String[8];

    @ObfuscatedName("client.km")
    public static boolean[] field706 = new boolean[8];

    @ObfuscatedName("client.kv")
    public static int[] field748 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kt")
    public static int field749 = -1;

    @ObfuscatedName("client.kz")
    public static class262[][][] field820 = new class262[4][104][104];

    @ObfuscatedName("client.kp")
    public static class262 field666 = new class262();

    @ObfuscatedName("client.ky")
    public static class262 field752 = new class262();

    @ObfuscatedName("client.ki")
    public static class262 field755 = new class262();

    @ObfuscatedName("client.kw")
    public static int[] field714 = new int[25];

    @ObfuscatedName("client.ks")
    public static int[] field672 = new int[25];

    @ObfuscatedName("client.ka")
    public static int[] field756 = new int[25];

    @ObfuscatedName("client.kq")
    public static int field757 = 0;

    @ObfuscatedName("client.kx")
    public static boolean field758 = false;

    @ObfuscatedName("client.lx")
    public static int field738 = 0;

    @ObfuscatedName("client.le")
    public static int[] field761 = new int[500];

    @ObfuscatedName("client.lj")
    public static int[] field762 = new int[500];

    @ObfuscatedName("client.ls")
    public static int[] field869 = new int[500];

    @ObfuscatedName("client.lm")
    public static int[] field754 = new int[500];

    @ObfuscatedName("client.lr")
    public static String[] field765 = new String[500];

    @ObfuscatedName("client.lp")
    public static String[] field766 = new String[500];

    @ObfuscatedName("client.lw")
    public static boolean[] field767 = new boolean[500];

    @ObfuscatedName("client.lf")
    public static boolean field696 = false;

    @ObfuscatedName("client.lt")
    public static boolean field769 = false;

    @ObfuscatedName("client.li")
    public static boolean field770 = false;

    @ObfuscatedName("client.lg")
    public static boolean field771 = true;

    @ObfuscatedName("client.lz")
    public static int field772 = -1;

    @ObfuscatedName("client.ld")
    public static int field690 = -1;

    @ObfuscatedName("client.ly")
    public static int field774 = 0;

    @ObfuscatedName("client.ln")
    public static int field739 = 50;

    @ObfuscatedName("client.lu")
    public static int field776 = 0;

    @ObfuscatedName("client.lh")
    public static boolean field744 = false;

    @ObfuscatedName("client.ll")
    public static int field688 = -1;

    @ObfuscatedName("client.ml")
    public static int field649 = -1;

    @ObfuscatedName("client.ma")
    public static String field725 = null;

    @ObfuscatedName("client.mw")
    public static String field782 = null;

    @ObfuscatedName("client.mr")
    public static int field783 = -1;

    @ObfuscatedName("client.ms")
    public static class318 field899 = new class318(8);

    @ObfuscatedName("client.mf")
    public static int field785 = 0;

    @ObfuscatedName("client.mu")
    public static int field786 = -1;

    @ObfuscatedName("client.mz")
    public static int field787 = 0;

    @ObfuscatedName("client.md")
    public static int field788 = 0;

    @ObfuscatedName("client.mq")
    public static class218 field789 = null;

    @ObfuscatedName("client.mh")
    public static int field790 = 0;

    @ObfuscatedName("client.mx")
    public static int field870 = 0;

    @ObfuscatedName("client.mk")
    public static int field792 = 0;

    @ObfuscatedName("client.mc")
    public static int field793 = -1;

    @ObfuscatedName("client.me")
    public static boolean field794 = false;

    @ObfuscatedName("client.mi")
    public static class218 field795 = null;

    @ObfuscatedName("client.mn")
    public static class218 field796 = null;

    @ObfuscatedName("client.mo")
    public static class218 field797 = null;

    @ObfuscatedName("client.mj")
    public static int field876 = 0;

    @ObfuscatedName("client.mm")
    public static int field799 = 0;

    @ObfuscatedName("client.mp")
    public static class218 field784 = null;

    @ObfuscatedName("client.na")
    public static boolean field801 = false;

    @ObfuscatedName("client.ny")
    public static int field802 = -1;

    @ObfuscatedName("client.nu")
    public static int field707 = -1;

    @ObfuscatedName("client.nt")
    public static boolean field804 = false;

    @ObfuscatedName("client.nh")
    public static int field805 = -1;

    @ObfuscatedName("client.ns")
    public static int field700 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field807 = false;

    @ObfuscatedName("client.nj")
    public static int field808 = 1;

    @ObfuscatedName("client.nm")
    public static int[] field809 = new int[32];

    @ObfuscatedName("client.nw")
    public static int field810 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field811 = new int[32];

    @ObfuscatedName("client.nx")
    public static int field812 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field813 = new int[32];

    @ObfuscatedName("client.nn")
    public static int field814 = 0;

    @ObfuscatedName("client.nv")
    public static int field815 = 0;

    @ObfuscatedName("client.nc")
    public static int field816 = 0;

    @ObfuscatedName("client.nz")
    public static int field817 = 0;

    @ObfuscatedName("client.nr")
    public static int field867 = 0;

    @ObfuscatedName("client.nb")
    public static int field819 = 0;

    @ObfuscatedName("client.np")
    public static int field671 = 0;

    @ObfuscatedName("client.oy")
    public static int field821 = 0;

    @ObfuscatedName("client.oc")
    public static class262 field721 = new class262();

    @ObfuscatedName("client.om")
    public static class262 field823 = new class262();

    @ObfuscatedName("client.oa")
    public static class262 field824 = new class262();

    @ObfuscatedName("client.ob")
    public static class318 field705 = new class318(512);

    @ObfuscatedName("client.oh")
    public static int field678 = 0;

    @ObfuscatedName("client.of")
    public static int field827 = -2;

    @ObfuscatedName("client.og")
    public static boolean[] field828 = new boolean[100];

    @ObfuscatedName("client.ov")
    public static boolean[] field829 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static boolean[] field648 = new boolean[100];

    @ObfuscatedName("client.ot")
    public static int[] field830 = new int[100];

    @ObfuscatedName("client.ou")
    public static int[] field832 = new int[100];

    @ObfuscatedName("client.ow")
    public static int[] field833 = new int[100];

    @ObfuscatedName("client.oq")
    public static int[] field834 = new int[100];

    @ObfuscatedName("client.oi")
    public static int field835 = 0;

    @ObfuscatedName("client.oo")
    public static long field836 = 0L;

    @ObfuscatedName("client.ox")
    public static boolean field837 = true;

    @ObfuscatedName("client.pr")
    public static int[] field839 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pt")
    public static int field840 = 0;

    @ObfuscatedName("client.pj")
    public static int field841 = 0;

    @ObfuscatedName("client.pv")
    public static String field779 = "";

    @ObfuscatedName("client.pw")
    public static long[] field843 = new long[100];

    @ObfuscatedName("client.py")
    public static int field844 = 0;

    @ObfuscatedName("client.pk")
    public static int field845 = 0;

    @ObfuscatedName("client.pl")
    public static int[] field846 = new int[128];

    @ObfuscatedName("client.pf")
    public static int[] field847 = new int[128];

    @ObfuscatedName("client.pb")
    public static long field751 = -1L;

    @ObfuscatedName("client.pp")
    public static int field849 = -1;

    @ObfuscatedName("client.ps")
    public static int field850 = 0;

    @ObfuscatedName("client.pc")
    public static int[] field851 = new int[1000];

    @ObfuscatedName("client.pu")
    public static int[] field633 = new int[1000];

    @ObfuscatedName("client.ph")
    public static class325[] field868 = new class325[1000];

    @ObfuscatedName("client.pi")
    public static int field854 = 0;

    @ObfuscatedName("client.pm")
    public static int field855 = 0;

    @ObfuscatedName("client.qm")
    public static int field856 = 0;

    @ObfuscatedName("client.qe")
    public static int field639 = 255;

    @ObfuscatedName("client.qj")
    public static int field858 = -1;

    @ObfuscatedName("client.qn")
    public static boolean field747 = false;

    @ObfuscatedName("client.qy")
    public static int field720 = 127;

    @ObfuscatedName("client.qr")
    public static int field861 = 127;

    @ObfuscatedName("client.qs")
    public static int field862 = 0;

    @ObfuscatedName("client.qx")
    public static int[] field863 = new int[50];

    @ObfuscatedName("client.qo")
    public static int[] field763 = new int[50];

    @ObfuscatedName("client.qk")
    public static int[] field865 = new int[50];

    @ObfuscatedName("client.qi")
    public static int[] field866 = new int[50];

    @ObfuscatedName("client.qw")
    public static class102[] field775 = new class102[50];

    @ObfuscatedName("client.qt")
    public static boolean field848 = false;

    @ObfuscatedName("client.rt")
    public static boolean[] field750 = new boolean[5];

    @ObfuscatedName("client.ry")
    public static int[] field780 = new int[5];

    @ObfuscatedName("client.ri")
    public static int[] field888 = new int[5];

    @ObfuscatedName("client.rw")
    public static int[] field872 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field800 = new int[5];

    @ObfuscatedName("client.rj")
    public static short field874 = 256;

    @ObfuscatedName("client.rz")
    public static short field753 = 205;

    @ObfuscatedName("client.rk")
    public static short field710 = 256;

    @ObfuscatedName("client.rv")
    public static short field877 = 320;

    @ObfuscatedName("client.rs")
    public static short field878 = 1;

    @ObfuscatedName("client.rd")
    public static short field879 = 32767;

    @ObfuscatedName("client.rh")
    public static short field880 = 1;

    @ObfuscatedName("client.rg")
    public static short field718 = 32767;

    @ObfuscatedName("client.rp")
    public static int field798 = 0;

    @ObfuscatedName("client.rb")
    public static int field883 = 0;

    @ObfuscatedName("client.ru")
    public static int field741 = 0;

    @ObfuscatedName("client.rq")
    public static int field831 = 0;

    @ObfuscatedName("client.rx")
    public static int field864 = 0;

    @ObfuscatedName("client.rf")
    public static class215 field664 = new class215();

    @ObfuscatedName("client.se")
    public static int field704 = -1;

    @ObfuscatedName("client.si")
    public static int field889 = -1;

    @ObfuscatedName("client.sj")
    public static class330 field890 = new class329();

    @ObfuscatedName("client.sd")
    public static class10[] field891 = new class10[8];

    @ObfuscatedName("client.su")
    public static class68 field892 = new class68();

    @ObfuscatedName("client.so")
    public static int field893 = -1;

    @ObfuscatedName("client.sq")
    public static ArrayList field637 = new ArrayList(10);

    @ObfuscatedName("client.sw")
    public static int field895 = 0;

    @ObfuscatedName("client.sr")
    public static int field896 = 0;

    @ObfuscatedName("client.th")
    public static final class66 field897 = new class66();

    @ObfuscatedName("client.tc")
    public static int[] field898 = new int[50];

    @ObfuscatedName("client.tu")
    public static int[] field623 = new int[50];

    @ObfuscatedName("x.eg(I)Lln;")
    public static class333 method14() {
        return Statics.field75;
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method794() {
    }

    public final void init() {
        if (!this.method882()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field650 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1127)) {
                            field627 = true;
                        } else {
                            field627 = false;
                        }
                        break;
                    case 4:
                        if (field857 == -1) {
                            field857 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field760 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class191 var4;
                        if (var3 >= 0 && var3 < class191.field2323.length) {
                            var4 = class191.field2323[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field361 = var4;
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var2);
                        class230[] var6 = class230.method2624();
                        int var7 = 0;
                        class230 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class230 var8 = var6[var7];
                            if (var8.field3078 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field227 = var9;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1127)) {
                        }
                        break;
                    case 9:
                        Statics.field218 = var2;
                        break;
                    case 10:
                        Statics.field360 = (class231) class196.method3332(class231.method2625(), Integer.parseInt(var2));
                        if (Statics.field360 == class231.field3087) {
                            Statics.field22 = class338.field4030;
                        } else {
                            Statics.field22 = class338.field4025;
                        }
                        break;
                    case 12:
                        field624 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field566 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field626 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field465 = var2;
                }
            }
        }
        class134.field1794 = false;
        field838 = false;
        Statics.field508 = this.getCodeBase().getHost();
        String var10 = Statics.field227.field3079;
        byte var11 = 0;
        try {
            class168.method3384("oldschool", var10, var11, 21);
        } catch (Exception var13) {
            class341.method3361((String) null, var13);
        }
        Statics.field2505 = this;
        Statics.field2724 = field857;
        this.method769(765, 503, 183);
    }

    @ObfuscatedName("client.at(B)V")
    public final void method784() {
        class302.method1671(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field276 = field626 == 0 ? 43594 : field624 + 40000;
        Statics.field3896 = field626 == 0 ? 443 : field624 + 50000;
        Statics.field2295 = Statics.field276;
        Statics.field1945 = class216.field2519;
        Statics.field2509 = class216.field2520;
        Statics.field2514 = class216.field2521;
        Statics.field2512 = class216.field2522;
        Statics.field2084 = new class144();
        this.method764();
        this.method765();
        Statics.field1103 = this.method761();
        Statics.field2083 = new class308(255, class168.field2019, class168.field2020, 500000);
        class343 var1 = null;
        class74 var2 = new class74();
        try {
            var1 = class168.method96("", Statics.field360.field3084, false);
            byte[] var3 = new byte[(int) var1.method6096()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6097(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class74(new class300(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method6094();
            }
        } catch (Exception var11) {
        }
        Statics.field928 = var2;
        this.method785();
        String var10 = Statics.field2358;
        class52.field414 = this;
        if (var10 != null) {
            class52.field407 = var10;
        }
        if (field626 != 0) {
            field853 = true;
        }
        method3531(Statics.field928.field1026);
        Statics.field2683 = new class75(Statics.field22);
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method768() {
        field628++;
        this.method1124();
        class235.method1906();
        try {
            if (class198.field2377 == 1) {
                int var1 = Statics.field2376.method3417();
                if (var1 > 0 && Statics.field2376.method3434()) {
                    int var2 = var1 - Statics.field1834;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2376.method3416(var2);
                } else {
                    Statics.field2376.method3422();
                    Statics.field2376.method3420();
                    if (Statics.field2373 == null) {
                        class198.field2377 = 0;
                    } else {
                        class198.field2377 = 2;
                    }
                    Statics.field1302 = null;
                    Statics.field2330 = null;
                }
            }
        } catch (Exception var138) {
            var138.printStackTrace();
            Statics.field2376.method3422();
            class198.field2377 = 0;
            Statics.field1302 = null;
            Statics.field2330 = null;
            Statics.field2373 = null;
        }
        method3014();
        class46.method205();
        class55 var4 = class55.field455;
        synchronized (class55.field455) {
            class55.field461 = class55.field457;
            class55.field462 = class55.field458;
            class55.field463 = class55.field459;
            class55.field464 = class55.field454;
            class55.field469 = class55.field471;
            class55.field470 = class55.field473;
            class55.field460 = class55.field467;
            class55.field472 = class55.field453;
            class55.field471 = 0;
        }
        if (Statics.field1103 != null) {
            int var6 = Statics.field1103.method649();
            field821 = var6;
        }
        if (field631 == 0) {
            method2314();
            class54.method3036();
        } else if (field631 == 5) {
            class86.method4927(this);
            method2314();
            class54.method3036();
        } else if (field631 == 10 || field631 == 11) {
            class86.method4927(this);
        } else if (field631 == 20) {
            class86.method4927(this);
            this.method1356();
        } else if (field631 == 25) {
            method3817(false);
            field675 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field2463.length; var8++) {
                if (Statics.field345[var8] != -1 && Statics.field2463[var8] == null) {
                    Statics.field2463[var8] = Statics.field3557.method3825(Statics.field345[var8], 0);
                    if (Statics.field2463[var8] == null) {
                        var7 = false;
                        field675++;
                    }
                }
                if (Statics.field3492[var8] != -1 && Statics.field900[var8] == null) {
                    Statics.field900[var8] = Statics.field3557.method3833(Statics.field3492[var8], 0, Statics.field83[var8]);
                    if (Statics.field900[var8] == null) {
                        var7 = false;
                        field675++;
                    }
                }
            }
            if (var7) {
                field677 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field2463.length; var10++) {
                    byte[] var11 = Statics.field900[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field2381[var10] >> 8) * 64 - Statics.field20;
                        int var13 = (Statics.field2381[var10] & 0xFF) * 64 - Statics.field553;
                        if (field676) {
                            var12 = 10;
                            var13 = 10;
                        }
                        var9 &= class56.method4260(var11, var12, var13);
                    }
                }
                if (var9) {
                    if (field679 != 0) {
                        method6042(class225.field3005 + class82.field1122 + class82.field1121 + 100 + "%" + class82.field1124, true);
                    }
                    method3014();
                    Statics.field178.method2835();
                    for (int var14 = 0; var14 < 4; var14++) {
                        field659[var14].method3276();
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                class56.field475[var15][var16][var17] = 0;
                            }
                        }
                    }
                    method3014();
                    class56.method231();
                    int var18 = Statics.field2463.length;
                    class76.method3772();
                    method3817(true);
                    if (!field676) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            int var20 = (Statics.field2381[var19] >> 8) * 64 - Statics.field20;
                            int var21 = (Statics.field2381[var19] & 0xFF) * 64 - Statics.field553;
                            byte[] var22 = Statics.field2463[var19];
                            if (var22 != null) {
                                method3014();
                                class56.method1118(var22, var20, var21, Statics.field1586 * 8 - 48, Statics.field1304 * 8 - 48, field659);
                            }
                        }
                        for (int var23 = 0; var23 < var18; var23++) {
                            int var24 = (Statics.field2381[var23] >> 8) * 64 - Statics.field20;
                            int var25 = (Statics.field2381[var23] & 0xFF) * 64 - Statics.field553;
                            byte[] var26 = Statics.field2463[var23];
                            if (var26 == null && Statics.field1304 < 800) {
                                method3014();
                                class56.method2607(var24, var25, 64, 64);
                            }
                        }
                        method3817(true);
                        for (int var27 = 0; var27 < var18; var27++) {
                            byte[] var28 = Statics.field900[var27];
                            if (var28 != null) {
                                int var29 = (Statics.field2381[var27] >> 8) * 64 - Statics.field20;
                                int var30 = (Statics.field2381[var27] & 0xFF) * 64 - Statics.field553;
                                method3014();
                                class134 var31 = Statics.field178;
                                class173[] var32 = field659;
                                class300 var33 = new class300(var28);
                                int var34 = -1;
                                while (true) {
                                    int var35 = var33.method5118();
                                    if (var35 == 0) {
                                        break;
                                    }
                                    var34 += var35;
                                    int var36 = 0;
                                    while (true) {
                                        int var37 = var33.method5117();
                                        if (var37 == 0) {
                                            break;
                                        }
                                        var36 += var37 - 1;
                                        int var38 = var36 & 0x3F;
                                        int var39 = var36 >> 6 & 0x3F;
                                        int var40 = var36 >> 12;
                                        int var41 = var33.method5103();
                                        int var42 = var41 >> 2;
                                        int var43 = var41 & 0x3;
                                        int var44 = var29 + var39;
                                        int var45 = var30 + var38;
                                        if (var44 > 0 && var45 > 0 && var44 < 103 && var45 < 103) {
                                            int var46 = var40;
                                            if ((class56.field475[1][var44][var45] & 0x2) == 2) {
                                                var46 = var40 - 1;
                                            }
                                            class173 var47 = null;
                                            if (var46 >= 0) {
                                                var47 = var32[var46];
                                            }
                                            class56.method3341(var40, var44, var45, var34, var43, var42, var31, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field676) {
                        int var48 = 0;
                        label473: while (true) {
                            if (var48 >= 4) {
                                for (int var80 = 0; var80 < 13; var80++) {
                                    for (int var81 = 0; var81 < 13; var81++) {
                                        int var82 = field682[0][var80][var81];
                                        if (var82 == -1) {
                                            class56.method2607(var80 * 8, var81 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3817(true);
                                int var83 = 0;
                                while (true) {
                                    if (var83 >= 4) {
                                        break label473;
                                    }
                                    method3014();
                                    for (int var84 = 0; var84 < 13; var84++) {
                                        label396: for (int var85 = 0; var85 < 13; var85++) {
                                            int var86 = field682[var83][var84][var85];
                                            if (var86 != -1) {
                                                int var87 = var86 >> 24 & 0x3;
                                                int var88 = var86 >> 1 & 0x3;
                                                int var89 = var86 >> 14 & 0x3FF;
                                                int var90 = var86 >> 3 & 0x7FF;
                                                int var91 = (var89 / 8 << 8) + var90 / 8;
                                                for (int var92 = 0; var92 < Statics.field2381.length; var92++) {
                                                    if (Statics.field2381[var92] == var91 && Statics.field900[var92] != null) {
                                                        byte[] var93 = Statics.field900[var92];
                                                        int var94 = var84 * 8;
                                                        int var95 = var85 * 8;
                                                        int var96 = (var89 & 0x7) * 8;
                                                        int var97 = (var90 & 0x7) * 8;
                                                        class134 var98 = Statics.field178;
                                                        class173[] var99 = field659;
                                                        class300 var100 = new class300(var93);
                                                        int var101 = -1;
                                                        while (true) {
                                                            int var102 = var100.method5118();
                                                            if (var102 == 0) {
                                                                continue label396;
                                                            }
                                                            var101 += var102;
                                                            int var103 = 0;
                                                            while (true) {
                                                                int var104 = var100.method5117();
                                                                if (var104 == 0) {
                                                                    break;
                                                                }
                                                                var103 += var104 - 1;
                                                                int var105 = var103 & 0x3F;
                                                                int var106 = var103 >> 6 & 0x3F;
                                                                int var107 = var103 >> 12;
                                                                int var108 = var100.method5103();
                                                                int var109 = var108 >> 2;
                                                                int var110 = var108 & 0x3;
                                                                if (var87 == var107 && var106 >= var96 && var106 < var96 + 8 && var105 >= var97 && var105 < var97 + 8) {
                                                                    class254 var111 = class254.method3035(var101);
                                                                    int var112 = var94 + class217.method568(var106 & 0x7, var105 & 0x7, var88, var111.field3366, var111.field3329, var110);
                                                                    int var114 = var106 & 0x7;
                                                                    int var115 = var105 & 0x7;
                                                                    int var117 = var111.field3366;
                                                                    int var118 = var111.field3329;
                                                                    if ((var110 & 0x1) == 1) {
                                                                        int var119 = var117;
                                                                        var117 = var118;
                                                                        var118 = var119;
                                                                    }
                                                                    int var120 = var88 & 0x3;
                                                                    int var121;
                                                                    if (var120 == 0) {
                                                                        var121 = var115;
                                                                    } else if (var120 == 1) {
                                                                        var121 = 7 - var114 - (var117 - 1);
                                                                    } else if (var120 == 2) {
                                                                        var121 = 7 - var115 - (var118 - 1);
                                                                    } else {
                                                                        var121 = var114;
                                                                    }
                                                                    int var122 = var95 + var121;
                                                                    if (var112 > 0 && var122 > 0 && var112 < 103 && var122 < 103) {
                                                                        int var123 = var83;
                                                                        if ((class56.field475[1][var112][var122] & 0x2) == 2) {
                                                                            var123 = var83 - 1;
                                                                        }
                                                                        class173 var124 = null;
                                                                        if (var123 >= 0) {
                                                                            var124 = var99[var123];
                                                                        }
                                                                        class56.method3341(var83, var112, var122, var101, var88 + var110 & 0x3, var109, var98, var124);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var83++;
                                }
                            }
                            method3014();
                            for (int var49 = 0; var49 < 13; var49++) {
                                for (int var50 = 0; var50 < 13; var50++) {
                                    boolean var51 = false;
                                    int var52 = field682[var48][var49][var50];
                                    if (var52 != -1) {
                                        int var53 = var52 >> 24 & 0x3;
                                        int var54 = var52 >> 1 & 0x3;
                                        int var55 = var52 >> 14 & 0x3FF;
                                        int var56 = var52 >> 3 & 0x7FF;
                                        int var57 = (var55 / 8 << 8) + var56 / 8;
                                        for (int var58 = 0; var58 < Statics.field2381.length; var58++) {
                                            if (Statics.field2381[var58] == var57 && Statics.field2463[var58] != null) {
                                                byte[] var59 = Statics.field2463[var58];
                                                int var60 = var49 * 8;
                                                int var61 = var50 * 8;
                                                int var62 = (var55 & 0x7) * 8;
                                                int var63 = (var56 & 0x7) * 8;
                                                class173[] var64 = field659;
                                                for (int var65 = 0; var65 < 8; var65++) {
                                                    for (int var66 = 0; var66 < 8; var66++) {
                                                        if (var60 + var65 > 0 && var60 + var65 < 103 && var61 + var66 > 0 && var61 + var66 < 103) {
                                                            var64[var48].field2062[var60 + var65][var61 + var66] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class300 var67 = new class300(var59);
                                                for (int var68 = 0; var68 < 4; var68++) {
                                                    for (int var69 = 0; var69 < 64; var69++) {
                                                        for (int var70 = 0; var70 < 64; var70++) {
                                                            if (var53 == var68 && var69 >= var62 && var69 < var62 + 8 && var70 >= var63 && var70 < var63 + 8) {
                                                                int var73 = var60 + class217.method625(var69 & 0x7, var70 & 0x7, var54);
                                                                int var75 = var69 & 0x7;
                                                                int var76 = var70 & 0x7;
                                                                int var78 = var54 & 0x3;
                                                                int var79;
                                                                if (var78 == 0) {
                                                                    var79 = var76;
                                                                } else if (var78 == 1) {
                                                                    var79 = 7 - var75;
                                                                } else if (var78 == 2) {
                                                                    var79 = 7 - var76;
                                                                } else {
                                                                    var79 = var75;
                                                                }
                                                                class56.method474(var67, var48, var73, var61 + var79, 0, 0, var54);
                                                            } else {
                                                                class56.method474(var67, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var51 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var51) {
                                        Statics.method4170(var48, var49 * 8, var50 * 8);
                                    }
                                }
                            }
                            var48++;
                        }
                    }
                    method3817(true);
                    method3014();
                    Statics.method3034(Statics.field178, field659);
                    method3817(true);
                    int var125 = class56.field480;
                    if (var125 > Statics.field562) {
                        var125 = Statics.field562;
                    }
                    if (var125 < Statics.field562 - 1) {
                        int var126 = Statics.field562 - 1;
                    }
                    if (field838) {
                        Statics.field178.method2878(class56.field480);
                    } else {
                        Statics.field178.method2878(0);
                    }
                    for (int var127 = 0; var127 < 104; var127++) {
                        for (int var128 = 0; var128 < 104; var128++) {
                            method501(var127, var128);
                        }
                    }
                    method3014();
                    method4155();
                    class254.field3352.method3063();
                    if (Statics.field2505.method793()) {
                        class188 var129 = class188.method1894(class184.field2236, field669.field1279);
                        var129.field2313.method5090(1057001181);
                        field669.method2075(var129);
                    }
                    if (!field676) {
                        int var130 = (Statics.field1586 - 6) / 8;
                        int var131 = (Statics.field1586 + 6) / 8;
                        int var132 = (Statics.field1304 - 6) / 8;
                        int var133 = (Statics.field1304 + 6) / 8;
                        for (int var134 = var130 - 1; var134 <= var131 + 1; var134++) {
                            for (int var135 = var132 - 1; var135 <= var133 + 1; var135++) {
                                if (var134 < var130 || var134 > var131 || var135 < var132 || var135 > var133) {
                                    Statics.field3557.method3849("m" + var134 + "_" + var135);
                                    Statics.field3557.method3849("l" + var134 + "_" + var135);
                                }
                            }
                        }
                    }
                    method178(30);
                    method3014();
                    Statics.field477 = (byte[][][]) null;
                    Statics.field258 = (byte[][][]) null;
                    Statics.field478 = (byte[][][]) null;
                    Statics.field1090 = (byte[][][]) null;
                    Statics.field1962 = (int[][][]) null;
                    Statics.field474 = (byte[][][]) null;
                    Statics.field1978 = (int[][]) null;
                    Statics.field1954 = null;
                    Statics.field1211 = null;
                    Statics.field5 = null;
                    Statics.field356 = null;
                    Statics.field489 = null;
                    class188 var136 = class188.method1894(class184.field2217, field669.field1279);
                    field669.method2075(var136);
                    class54.method3036();
                } else {
                    field679 = 2;
                }
            } else {
                field679 = 1;
            }
        }
        if (field631 == 30) {
            this.method1173();
        } else if (field631 == 40 || field631 == 45) {
            this.method1356();
        }
    }

    @ObfuscatedName("client.av(ZI)V")
    public final void method786(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2377 == 2) {
                    if (Statics.field1302 == null) {
                        Statics.field1302 = class204.method3607(Statics.field2373, Statics.field2379, Statics.field2380);
                        if (Statics.field1302 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2330 == null) {
                        Statics.field2330 = new class109(Statics.field2378, Statics.field2374);
                    }
                    if (Statics.field2376.method3418(Statics.field1302, Statics.field2375, Statics.field2330, 22050)) {
                        Statics.field2376.method3519();
                        Statics.field2376.method3416(Statics.field396);
                        Statics.field2376.method3421(Statics.field1302, Statics.field564);
                        class198.field2377 = 0;
                        Statics.field1302 = null;
                        Statics.field2330 = null;
                        Statics.field2373 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2376.method3422();
                class198.field2377 = 0;
                Statics.field1302 = null;
                Statics.field2330 = null;
                Statics.field2373 = null;
            }
            var2 = false;
        }
        if (var2 && field747 && Statics.field186 != null) {
            Statics.field186.method2267();
        }
        if ((field631 == 10 || field631 == 20 || field631 == 30) && field836 != 0L && Statics.method2303() > field836) {
            method3531(method637());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field828[var5] = true;
            }
        }
        if (field631 == 0) {
            this.method788(class86.field1156, class86.field1160, arg0);
        } else if (field631 == 5) {
            class86.method892(Statics.field1097, Statics.field49, Statics.field2382);
        } else if (field631 == 10 || field631 == 11) {
            class86.method892(Statics.field1097, Statics.field49, Statics.field2382);
        } else if (field631 == 20) {
            class86.method892(Statics.field1097, Statics.field49, Statics.field2382);
        } else if (field631 == 25) {
            if (field679 == 1) {
                if (field675 > field852) {
                    field852 = field675;
                }
                int var6 = (field852 * 50 - field675 * 50) / field852;
                method6042(class225.field3005 + class82.field1122 + class82.field1121 + var6 + "%" + class82.field1124, false);
            } else if (field679 == 2) {
                if (field677 > field873) {
                    field873 = field677;
                }
                int var7 = (field873 * 50 - field677 * 50) / field873 + 50;
                method6042(class225.field3005 + class82.field1122 + class82.field1121 + var7 + "%" + class82.field1124, false);
            } else {
                method6042(class225.field3005, false);
            }
        } else if (field631 == 30) {
            this.method1130();
        } else if (field631 == 40) {
            method6042(class225.field2828 + class82.field1122 + class225.field2783, false);
        } else if (field631 == 45) {
            method6042(class225.field2901, false);
        }
        if (field631 == 30 && field835 == 0 && !arg0 && !field837) {
            for (int var8 = 0; var8 < field678; var8++) {
                if (field829[var8]) {
                    Statics.field394.method740(field830[var8], field832[var8], field833[var8], field834[var8]);
                    field829[var8] = false;
                }
            }
        } else if (field631 > 0) {
            Statics.field394.method744(0, 0);
            for (int var9 = 0; var9 < field678; var9++) {
                field829[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.an(I)V")
    public final void method787() {
        if (Statics.field1847.method1982()) {
            Statics.field1847.method1985();
        }
        if (Statics.field3284 != null) {
            Statics.field3284.field560 = false;
        }
        Statics.field3284 = null;
        field669.method2072();
        class46.method1740();
        if (class55.field455 != null) {
            class55 var1 = class55.field455;
            synchronized (class55.field455) {
                class55.field455 = null;
            }
        }
        Statics.field1103 = null;
        if (Statics.field186 != null) {
            Statics.field186.method2236();
        }
        if (Statics.field1030 != null) {
            Statics.field1030.method2236();
        }
        if (Statics.field3161 != null) {
            Statics.field3161.method3242();
        }
        Object var3 = class235.field3125;
        synchronized (class235.field3125) {
            if (class235.field3127 != 0) {
                class235.field3127 = 1;
                try {
                    class235.field3125.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field2084 != null) {
            Statics.field2084.method3047();
            Statics.field2084 = null;
        }
        class168.method2605();
    }

    @ObfuscatedName("y.es(IB)V")
    public static void method178(int arg0) {
        if (field631 == arg0) {
            return;
        }
        if (field631 == 0) {
            Statics.field2505.method789();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field656 = 0;
            field657 = 0;
            field842 = 0;
            field673.method4638(arg0);
            if (arg0 != 20) {
                method2087(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field513 != null) {
            Statics.field513.method3242();
            Statics.field513 = null;
        }
        if (field631 == 25) {
            field679 = 0;
            field675 = 0;
            field852 = 1;
            field677 = 0;
            field873 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method4025(Statics.field3641, Statics.field205, true, 0);
        } else if (arg0 == 20) {
            Statics.method4025(Statics.field3641, Statics.field205, true, field631 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method4025(Statics.field3641, Statics.field205, false, 4);
        } else if (Statics.field1182) {
            Statics.field1159 = null;
            Statics.field2333 = null;
            Statics.field1949 = null;
            Statics.field1153 = null;
            Statics.field2336 = null;
            Statics.field1089 = null;
            Statics.field2023 = null;
            Statics.field25 = null;
            Statics.field1150 = null;
            Statics.field1981 = null;
            Statics.field3065 = null;
            Statics.field2022 = null;
            Statics.field3051 = null;
            Statics.field33 = null;
            Statics.field1955.method1664();
            class198.method3033(2);
            class237.method3318(true);
            Statics.field1182 = false;
        }
        field631 = arg0;
    }

    @ObfuscatedName("client.ef(I)V")
    public void method1124() {
        if (field631 != 1000) {
            boolean var1 = class237.method2751();
            if (!var1) {
                this.method1224();
            }
        }
    }

    @ObfuscatedName("client.ed(B)V")
    public void method1224() {
        if (class237.field3143 >= 4) {
            this.method811("js5crc");
            field631 = 1000;
            return;
        }
        if (class237.field3148 >= 4) {
            if (field631 <= 5) {
                this.method811("js5io");
                field631 = 1000;
                return;
            }
            field654 = 3000;
            class237.field3148 = 3;
        }
        if (--field654 + 1 > 0) {
            return;
        }
        try {
            if (field653 == 0) {
                Statics.field620 = Statics.field450.method3213(Statics.field508, Statics.field2295);
                field653++;
            }
            if (field653 == 1) {
                if (Statics.field620.field1998 == 2) {
                    this.method1336(-1);
                    return;
                }
                if (Statics.field620.field1998 == 1) {
                    field653++;
                }
            }
            if (field653 == 2) {
                if (field650) {
                    Statics.field2694 = class305.method4936((Socket) Statics.field620.field2002, 40000, 5000);
                } else {
                    Statics.field2694 = new class172((Socket) Statics.field620.field2002, Statics.field450, 5000);
                }
                class300 var1 = new class300(5);
                var1.method5087(15);
                var1.method5090(183);
                Statics.field2694.method3250(var1.field3694, 0, 5);
                field653++;
                Statics.field1947 = Statics.method2303();
            }
            if (field653 == 3) {
                if (Statics.field2694.method3263() > 0 || !field650 && field631 <= 5) {
                    int var2 = Statics.field2694.method3262();
                    if (var2 != 0) {
                        this.method1336(var2);
                        return;
                    }
                    field653++;
                } else if (Statics.method2303() - Statics.field1947 > 30000L) {
                    this.method1336(-2);
                    return;
                }
            }
            if (field653 == 4) {
                class305 var3 = Statics.field2694;
                boolean var4 = field631 > 20;
                if (Statics.field3161 != null) {
                    try {
                        Statics.field3161.method3242();
                    } catch (Exception var14) {
                    }
                    Statics.field3161 = null;
                }
                Statics.field3161 = var3;
                class237.method3318(var4);
                class237.field3154.field3696 = 0;
                Statics.field3160 = null;
                Statics.field4024 = null;
                class237.field3155 = 0;
                while (true) {
                    class233 var6 = (class233) class237.field3152.method5516();
                    if (var6 == null) {
                        while (true) {
                            class233 var7 = (class233) class237.field3150.method5516();
                            if (var7 == null) {
                                if (class237.field3159 != 0) {
                                    try {
                                        class300 var8 = new class300(4);
                                        var8.method5087(4);
                                        var8.method5087(class237.field3159);
                                        var8.method5145(0);
                                        Statics.field3161.method3250(var8.field3694, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3161.method3242();
                                        } catch (Exception var12) {
                                        }
                                        class237.field3148++;
                                        Statics.field3161 = null;
                                    }
                                }
                                class237.field3141 = 0;
                                Statics.field3146 = Statics.method2303();
                                Statics.field620 = null;
                                Statics.field2694 = null;
                                field653 = 0;
                                field655 = 0;
                                return;
                            }
                            class237.field3147.method4469(var7);
                            class237.field3145.method5517(var7, var7.field2096);
                            class237.field3149++;
                            class237.field3151--;
                        }
                    }
                    class237.field3153.method5517(var6, var6.field2096);
                    class237.field3144++;
                    class237.field3140--;
                }
            }
        } catch (IOException var15) {
            this.method1336(-3);
        }
    }

    @ObfuscatedName("client.eq(II)V")
    public void method1336(int arg0) {
        Statics.field620 = null;
        Statics.field2694 = null;
        field653 = 0;
        if (Statics.field276 == Statics.field2295) {
            Statics.field2295 = Statics.field3896;
        } else {
            Statics.field2295 = Statics.field276;
        }
        field655++;
        if (field655 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field631 <= 5) {
                this.method811("js5connect_full");
                field631 = 1000;
            } else {
                field654 = 3000;
            }
        } else if (field655 >= 2 && arg0 == 6) {
            this.method811("js5connect_outofdate");
            field631 = 1000;
        } else if (field655 >= 4) {
            if (field631 <= 5) {
                this.method811("js5connect");
                field631 = 1000;
            } else {
                field654 = 3000;
            }
        }
    }

    @ObfuscatedName("p.et(Lio;Ljava/lang/String;I)V")
    public static void method128(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field637.add(var2);
        field896 += var2.field510;
    }

    @ObfuscatedName("gr.eb(I)I")
    public static int method3365() {
        if (field637 == null || field895 >= field637.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field895; var1++) {
            var0 += ((class59) field637.get(var1)).field506;
        }
        return var0 * 10000 / field896;
    }

    @ObfuscatedName("de.ei(I)V")
    public static void method2314() {
        if (field652 == 0) {
            Statics.field178 = new class134(4, 104, 104, class56.field476);
            for (int var0 = 0; var0 < 4; var0++) {
                field659[var0] = new class173(104, 104);
            }
            Statics.field535 = new class325(512, 512);
            class86.field1160 = class225.field2753;
            class86.field1156 = 5;
            field652 = 20;
        } else if (field652 == 20) {
            class86.field1160 = class225.field2754;
            class86.field1156 = 10;
            field652 = 30;
        } else if (field652 == 30) {
            Statics.field555 = method4435(0, false, true, true);
            Statics.field65 = method4435(1, false, true, true);
            Statics.field2075 = method4435(2, true, false, true);
            Statics.field98 = method4435(3, false, true, true);
            Statics.field93 = method4435(4, false, true, true);
            Statics.field3557 = method4435(5, true, true, true);
            Statics.field202 = method4435(6, true, true, true);
            Statics.field401 = method4435(7, false, true, true);
            Statics.field205 = method4435(8, false, true, true);
            Statics.field101 = method4435(9, false, true, true);
            Statics.field3641 = method4435(10, false, true, true);
            Statics.field3776 = method4435(11, false, true, true);
            Statics.field576 = method4435(12, false, true, true);
            Statics.field1498 = method4435(13, true, false, true);
            Statics.field236 = method4435(14, false, true, true);
            Statics.field3785 = method4435(15, false, true, true);
            Statics.field400 = method4435(17, true, true, true);
            Statics.field222 = method4435(18, false, true, true);
            Statics.field1922 = method4435(19, false, true, true);
            Statics.field283 = method4435(20, false, true, true);
            class86.field1160 = class225.field2755;
            class86.field1156 = 20;
            field652 = 40;
        } else if (field652 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field555.method3949() * 4 / 100;
            int var3 = var2 + Statics.field65.method3949() * 4 / 100;
            int var4 = var3 + Statics.field2075.method3949() * 2 / 100;
            int var5 = var4 + Statics.field98.method3949() * 2 / 100;
            int var6 = var5 + Statics.field93.method3949() * 6 / 100;
            int var7 = var6 + Statics.field3557.method3949() * 4 / 100;
            int var8 = var7 + Statics.field202.method3949() * 2 / 100;
            int var9 = var8 + Statics.field401.method3949() * 56 / 100;
            int var10 = var9 + Statics.field205.method3949() * 2 / 100;
            int var11 = var10 + Statics.field101.method3949() * 2 / 100;
            int var12 = var11 + Statics.field3641.method3949() * 2 / 100;
            int var13 = var12 + Statics.field3776.method3949() * 2 / 100;
            int var14 = var13 + Statics.field576.method3949() * 2 / 100;
            int var15 = var14 + Statics.field1498.method3949() * 2 / 100;
            int var16 = var15 + Statics.field236.method3949() * 2 / 100;
            int var17 = var16 + Statics.field3785.method3949() * 2 / 100;
            int var18 = var17 + Statics.field1922.method3949() / 100;
            int var19 = var18 + Statics.field222.method3949() / 100;
            int var20 = var19 + Statics.field283.method3949() / 100;
            int var21 = var20 + (Statics.field400.method3944() && Statics.field400.method3830() ? 1 : 0);
            if (var21 == 100) {
                method128(Statics.field555, "Animations");
                method128(Statics.field65, "Skeletons");
                method128(Statics.field93, "Sound FX");
                method128(Statics.field3557, "Maps");
                method128(Statics.field202, "Music Tracks");
                method128(Statics.field401, "Models");
                method128(Statics.field205, "Sprites");
                method128(Statics.field3776, "Music Jingles");
                method128(Statics.field236, "Music Samples");
                method128(Statics.field3785, "Music Patches");
                method128(Statics.field1922, "World Map");
                method128(Statics.field222, "World Map Geography");
                method128(Statics.field283, "World Map Ground");
                Statics.field1859 = new class312();
                Statics.field1859.method5467(Statics.field400);
                class86.field1160 = class225.field2757;
                class86.field1156 = 30;
                field652 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1160 = class225.field2931 + var21 + "%";
                }
                class86.field1156 = 30;
            }
        } else if (field652 == 45) {
            class106.method1929(22050, !field838, 2);
            class199 var22 = new class199();
            var22.method3451(9, 128);
            Statics.field186 = class106.method2095(Statics.field450, 0, 22050);
            Statics.field186.method2233(var22);
            class198.method3385(Statics.field3785, Statics.field236, Statics.field93, var22);
            Statics.field1030 = class106.method2095(Statics.field450, 1, 2048);
            Statics.field409 = new class99();
            Statics.field1030.method2233(Statics.field409);
            Statics.field1128 = new class113(22050, Statics.field29);
            class86.field1160 = class225.field2758;
            class86.field1156 = 35;
            field652 = 50;
            Statics.field1084 = new class293(Statics.field205, Statics.field1498);
        } else if (field652 == 50) {
            int var23 = class292.method4931().length;
            field674 = Statics.field1084.method4937(class292.method4931());
            if (field674.size() < var23) {
                class86.field1160 = class225.field2759 + field674.size() * 100 / var23 + "%";
                class86.field1156 = 40;
            } else {
                Statics.field49 = (class295) field674.get(class292.field3636);
                Statics.field2382 = (class295) field674.get(class292.field3642);
                Statics.field1097 = (class295) field674.get(class292.field3635);
                Statics.field273 = field890.method5804();
                class86.field1160 = class225.field2792;
                class86.field1156 = 40;
                field652 = 60;
            }
        } else if (field652 == 60) {
            class236 var24 = Statics.field3641;
            class236 var25 = Statics.field205;
            int var26 = 0;
            if (var24.method3829("title.jpg", "")) {
                var26++;
            }
            if (var25.method3829("logo", "")) {
                var26++;
            }
            if (var25.method3829("logo_deadman_mode", "")) {
                var26++;
            }
            if (var25.method3829("titlebox", "")) {
                var26++;
            }
            if (var25.method3829("titlebutton", "")) {
                var26++;
            }
            if (var25.method3829("runes", "")) {
                var26++;
            }
            if (var25.method3829("title_mute", "")) {
                var26++;
            }
            if (var25.method3829("options_radio_buttons,0", "")) {
                var26++;
            }
            if (var25.method3829("options_radio_buttons,2", "")) {
                var26++;
            }
            if (var25.method3829("options_radio_buttons,4", "")) {
                var26++;
            }
            if (var25.method3829("options_radio_buttons,6", "")) {
                var26++;
            }
            var25.method3829("sl_back", "");
            var25.method3829("sl_flags", "");
            var25.method3829("sl_arrows", "");
            var25.method3829("sl_stars", "");
            var25.method3829("sl_button", "");
            int var29 = class86.method498();
            if (var26 < var29) {
                class86.field1160 = class225.field2761 + var26 * 100 / var29 + "%";
                class86.field1156 = 50;
            } else {
                class86.field1160 = class225.field2810;
                class86.field1156 = 50;
                method178(5);
                field652 = 70;
            }
        } else if (field652 == 70) {
            if (Statics.field2075.method3830()) {
                class258.method1102(Statics.field2075);
                class236 var30 = Statics.field2075;
                Statics.field3237 = var30;
                class246.method470(Statics.field2075, Statics.field401);
                class236 var31 = Statics.field2075;
                class236 var32 = Statics.field401;
                boolean var33 = field838;
                Statics.field79 = var31;
                Statics.field3323 = var32;
                class254.field3359 = var33;
                class257.method3038(Statics.field2075, Statics.field401);
                class251.method3356(Statics.field2075);
                class255.method55(Statics.field2075, Statics.field401, field627, Statics.field49);
                class236 var34 = Statics.field2075;
                class236 var35 = Statics.field555;
                class236 var36 = Statics.field65;
                Statics.field3489 = var34;
                Statics.field3486 = var35;
                Statics.field3487 = var36;
                class236 var37 = Statics.field2075;
                class236 var38 = Statics.field401;
                Statics.field3215 = var37;
                Statics.field3218 = var38;
                class236 var39 = Statics.field2075;
                Statics.field3273 = var39;
                class236 var40 = Statics.field2075;
                Statics.field3685 = var40;
                Statics.field2057 = Statics.field3685.method3837(16);
                class218.method3182(Statics.field98, Statics.field401, Statics.field205, Statics.field1498);
                class240.method2256(Statics.field2075);
                class236 var41 = Statics.field2075;
                Statics.field3298 = var41;
                class243.method4941(Statics.field2075);
                class250.method4078(Statics.field2075);
                Statics.field1847 = new class91();
                class253.method2069(Statics.field2075, Statics.field205, Statics.field1498);
                class247.method4416(Statics.field2075, Statics.field205);
                class236 var42 = Statics.field2075;
                class236 var43 = Statics.field205;
                Statics.field3191 = var43;
                if (var42.method3830()) {
                    Statics.field3186 = var42.method3837(35);
                    Statics.field3192 = new class242[Statics.field3186];
                    for (int var44 = 0; var44 < Statics.field3186; var44++) {
                        byte[] var45 = var42.method3825(35, var44);
                        Statics.field3192[var44] = new class242(var44);
                        if (var45 != null) {
                            Statics.field3192[var44].method4030(new class300(var45));
                            Statics.field3192[var44].method4049();
                        }
                    }
                }
                class86.field1160 = class225.field2764;
                class86.field1156 = 60;
                field652 = 80;
            } else {
                class86.field1160 = class225.field2938 + Statics.field2075.method3941() + "%";
                class86.field1156 = 60;
            }
        } else if (field652 == 80) {
            int var46 = 0;
            if (Statics.field1918 == null) {
                Statics.field1918 = class326.method5636(Statics.field205, Statics.field1859.field3804, 0);
            } else {
                var46++;
            }
            if (Statics.field3644 == null) {
                Statics.field3644 = class326.method5636(Statics.field205, Statics.field1859.field3795, 0);
            } else {
                var46++;
            }
            if (Statics.field3617 == null) {
                class236 var47 = Statics.field205;
                int var48 = Statics.field1859.field3794;
                byte[] var49 = var47.method3825(var48, 0);
                boolean var50;
                if (var49 == null) {
                    var50 = false;
                } else {
                    class326.method47(var49);
                    var50 = true;
                }
                class324[] var51;
                if (var50) {
                    var51 = class326.method3237();
                } else {
                    var51 = null;
                }
                Statics.field3617 = var51;
            } else {
                var46++;
            }
            if (Statics.field3937 == null) {
                Statics.field3937 = class326.method1555(Statics.field205, Statics.field1859.field3797, 0);
            } else {
                var46++;
            }
            if (Statics.field2082 == null) {
                Statics.field2082 = class326.method1555(Statics.field205, Statics.field1859.field3798, 0);
            } else {
                var46++;
            }
            if (Statics.field43 == null) {
                Statics.field43 = class326.method1555(Statics.field205, Statics.field1859.field3799, 0);
            } else {
                var46++;
            }
            if (Statics.field119 == null) {
                Statics.field119 = class326.method1555(Statics.field205, Statics.field1859.field3801, 0);
            } else {
                var46++;
            }
            if (Statics.field3545 == null) {
                Statics.field3545 = class326.method1555(Statics.field205, Statics.field1859.field3805, 0);
            } else {
                var46++;
            }
            if (Statics.field357 == null) {
                Statics.field357 = class326.method1555(Statics.field205, Statics.field1859.field3802, 0);
            } else {
                var46++;
            }
            if (Statics.field188 == null) {
                class236 var52 = Statics.field205;
                int var53 = Statics.field1859.field3803;
                byte[] var54 = var52.method3825(var53, 0);
                boolean var55;
                if (var54 == null) {
                    var55 = false;
                } else {
                    class326.method47(var54);
                    var55 = true;
                }
                class324[] var56;
                if (var55) {
                    var56 = class326.method3237();
                } else {
                    var56 = null;
                }
                Statics.field188 = var56;
            } else {
                var46++;
            }
            if (Statics.field499 == null) {
                class236 var57 = Statics.field205;
                int var58 = Statics.field1859.field3800;
                byte[] var59 = var57.method3825(var58, 0);
                boolean var60;
                if (var59 == null) {
                    var60 = false;
                } else {
                    class326.method47(var59);
                    var60 = true;
                }
                class324[] var61;
                if (var60) {
                    var61 = class326.method3237();
                } else {
                    var61 = null;
                }
                Statics.field499 = var61;
            } else {
                var46++;
            }
            if (var46 < 11) {
                class86.field1160 = class225.field2765 + var46 * 100 / 12 + "%";
                class86.field1156 = 70;
            } else {
                Statics.field3669 = Statics.field499;
                Statics.field3644.method5662();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3617[0].method5650(var62 + var65, var63 + var65, var64 + var65);
                class86.field1160 = class225.field2766;
                class86.field1156 = 70;
                field652 = 90;
            }
        } else if (field652 == 90) {
            if (Statics.field101.method3830()) {
                Statics.field2527 = new class120(Statics.field101, Statics.field205, 20, 0.8D, field838 ? 64 : 128);
                class131.method2770(Statics.field2527);
                class131.method2761(0.8D);
                field652 = 100;
            } else {
                class86.field1160 = class225.field2767 + "0%";
                class86.field1156 = 90;
            }
        } else if (field652 == 100) {
            int var66 = Statics.field2527.method2508();
            if (var66 < 100) {
                class86.field1160 = class225.field2767 + var66 + "%";
                class86.field1156 = 90;
            } else {
                class86.field1160 = class225.field2768;
                class86.field1156 = 90;
                field652 = 110;
            }
        } else if (field652 == 110) {
            Statics.field3284 = new class64();
            Statics.field450.method3195(Statics.field3284, 10);
            class86.field1160 = class225.field3007;
            class86.field1156 = 92;
            field652 = 120;
        } else if (field652 == 120) {
            if (Statics.field3641.method3829("huffman", "")) {
                class210 var67 = new class210(Statics.field3641.method3895("huffman", ""));
                Statics.field2487 = var67;
                class86.field1160 = class225.field2756;
                class86.field1156 = 94;
                field652 = 130;
            } else {
                class86.field1160 = class225.field2770 + "%";
                class86.field1156 = 94;
            }
        } else if (field652 == 130) {
            if (!Statics.field98.method3830()) {
                class86.field1160 = class225.field2772 + Statics.field98.method3941() * 4 / 5 + "%";
                class86.field1156 = 96;
            } else if (!Statics.field576.method3830()) {
                class86.field1160 = class225.field2772 + (80 + Statics.field576.method3941() / 6) + "%";
                class86.field1156 = 96;
            } else if (Statics.field1498.method3830()) {
                class86.field1160 = class225.field3030;
                class86.field1156 = 98;
                field652 = 140;
            } else {
                class86.field1160 = class225.field2772 + (96 + Statics.field1498.method3941() / 50) + "%";
                class86.field1156 = 96;
            }
        } else if (field652 == 140) {
            class86.field1156 = 100;
            if (Statics.field1922.method3881(class36.field295.field300)) {
                if (Statics.field75 == null) {
                    Statics.field75 = new class333();
                    Statics.field75.method5843(Statics.field1922, Statics.field222, Statics.field283, Statics.field1097, field674, Statics.field3617);
                }
                class86.field1160 = class225.field2771;
                field652 = 150;
            } else {
                class86.field1160 = class225.field2993 + Statics.field1922.method3866(class36.field295.field300) / 10 + "%";
            }
        } else if (field652 == 150) {
            method178(10);
        }
    }

    @ObfuscatedName("ip.ey(IZZZI)Lio;")
    public static class236 method4435(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2019 != null) {
            var4 = new class308(arg0, class168.field2019, Statics.field389[arg0], 1000000);
        }
        return new class236(var4, Statics.field2083, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ez(I)V")
    public final void method1356() {
        class305 var1 = field669.method2079();
        class299 var2 = field669.field1283;
        try {
            if (field656 == 0) {
                if (Statics.field340 == null && (field723.method1947() || field657 > 250)) {
                    Statics.field340 = field723.method1948();
                    field723.method1946();
                    field723 = null;
                }
                if (Statics.field340 != null) {
                    if (var1 != null) {
                        var1.method3242();
                        var1 = null;
                    }
                    Statics.field3072 = null;
                    field773 = false;
                    field657 = 0;
                    field656 = 1;
                }
            }
            if (field656 == 1) {
                if (Statics.field3072 == null) {
                    Statics.field3072 = Statics.field450.method3213(Statics.field508, Statics.field2295);
                }
                if (Statics.field3072.field1998 == 2) {
                    throw new IOException();
                }
                if (Statics.field3072.field1998 == 1) {
                    if (field650) {
                        var1 = class305.method4936((Socket) Statics.field3072.field2002, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field3072.field2002, Statics.field450, 5000);
                    }
                    field669.method2096(var1);
                    Statics.field3072 = null;
                    field656 = 2;
                }
            }
            if (field656 == 2) {
                field669.method2073();
                class188 var3 = Statics.method3794();
                var3.field2314 = null;
                var3.field2309 = 0;
                var3.field2313 = new class299(5000);
                var3.field2313.method5087(class185.field2292.field2293);
                field669.method2075(var3);
                field669.method2074();
                var2.field3696 = 0;
                field656 = 3;
            }
            if (field656 == 3) {
                if (Statics.field186 != null) {
                    Statics.field186.method2234();
                }
                if (Statics.field1030 != null) {
                    Statics.field1030.method2234();
                }
                boolean var6 = true;
                if (field650 && !var1.method3257(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3262();
                    if (Statics.field186 != null) {
                        Statics.field186.method2234();
                    }
                    if (Statics.field1030 != null) {
                        Statics.field1030.method2234();
                    }
                    if (var7 != 0) {
                        method319(var7);
                        return;
                    }
                    var2.field3696 = 0;
                    field656 = 4;
                }
            }
            if (field656 == 4) {
                if (var2.field3696 < 8) {
                    int var8 = var1.method3263();
                    if (var8 > 8 - var2.field3696) {
                        var8 = 8 - var2.field3696;
                    }
                    if (var8 > 0) {
                        var1.method3247(var2.field3694, var2.field3696, var8);
                        var2.field3696 += var8;
                    }
                }
                if (var2.field3696 == 8) {
                    var2.field3696 = 0;
                    Statics.field1056 = var2.method5143();
                    field656 = 5;
                }
            }
            if (field656 == 5) {
                field669.field1283.field3696 = 0;
                field669.method2073();
                class299 var9 = new class299(500);
                int[] var10 = new int[] { Statics.field340.nextInt(), Statics.field340.nextInt(), Statics.field340.nextInt(), Statics.field340.nextInt() };
                var9.field3696 = 0;
                var9.method5087(1);
                var9.method5090(var10[0]);
                var9.method5090(var10[1]);
                var9.method5090(var10[2]);
                var9.method5090(var10[3]);
                var9.method5173(Statics.field1056);
                if (field631 == 40) {
                    var9.method5090(Statics.field1959[0]);
                    var9.method5090(Statics.field1959[1]);
                    var9.method5090(Statics.field1959[2]);
                    var9.method5090(Statics.field1959[3]);
                } else {
                    var9.method5087(field660.method22());
                    switch(field660.field1979) {
                        case 0:
                        case 2:
                            var9.method5089(Statics.field2730);
                            var9.field3696++;
                            break;
                        case 1:
                            LinkedHashMap var12 = Statics.field928.field1028;
                            String var13 = class86.field1168;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5090((Integer) var12.get(var15));
                            break;
                        case 3:
                            var9.field3696 += 4;
                    }
                    var9.method5087(class313.field3806.method22());
                    var9.method5094(class86.field1172);
                }
                var9.method5126(class84.field1143, class84.field1140);
                Statics.field1959 = var10;
                class188 var18 = Statics.method3794();
                var18.field2314 = null;
                var18.field2309 = 0;
                var18.field2313 = new class299(5000);
                var18.field2313.field3696 = 0;
                if (field631 == 40) {
                    var18.field2313.method5087(class185.field2291.field2293);
                } else {
                    var18.field2313.method5087(class185.field2290.field2293);
                }
                var18.field2313.method5145(0);
                int var21 = var18.field2313.field3696;
                var18.field2313.method5090(183);
                var18.field2313.method5090(1);
                var18.field2313.method5087(field857);
                var18.field2313.method5169(var9.field3694, 0, var9.field3696);
                int var22 = var18.field2313.field3696;
                var18.field2313.method5094(class86.field1168);
                var18.field2313.method5087((field837 ? 1 : 0) << 1 | (field838 ? 1 : 0));
                var18.field2313.method5145(Statics.field3796);
                var18.field2313.method5145(Statics.field434);
                method4437(var18.field2313);
                var18.field2313.method5094(Statics.field218);
                var18.field2313.method5090(Statics.field566);
                class300 var23 = new class300(Statics.field273.method5818());
                Statics.field273.method5817(var23);
                var18.field2313.method5169(var23.field3694, 0, var23.field3694.length);
                var18.field2313.method5087(field857);
                var18.field2313.method5090(0);
                var18.field2313.method5090(Statics.field555.field3118);
                var18.field2313.method5090(Statics.field65.field3118);
                var18.field2313.method5090(Statics.field2075.field3118);
                var18.field2313.method5090(Statics.field98.field3118);
                var18.field2313.method5090(Statics.field93.field3118);
                var18.field2313.method5090(Statics.field3557.field3118);
                var18.field2313.method5090(Statics.field202.field3118);
                var18.field2313.method5090(Statics.field401.field3118);
                var18.field2313.method5090(Statics.field205.field3118);
                var18.field2313.method5090(Statics.field101.field3118);
                var18.field2313.method5090(Statics.field3641.field3118);
                var18.field2313.method5090(Statics.field3776.field3118);
                var18.field2313.method5090(Statics.field576.field3118);
                var18.field2313.method5090(Statics.field1498.field3118);
                var18.field2313.method5090(Statics.field236.field3118);
                var18.field2313.method5090(Statics.field3785.field3118);
                var18.field2313.method5090(0);
                var18.field2313.method5090(Statics.field400.field3118);
                var18.field2313.method5090(Statics.field222.field3118);
                var18.field2313.method5090(Statics.field1922.field3118);
                var18.field2313.method5090(Statics.field283.field3118);
                var18.field2313.method5124(var10, var22, var18.field2313.field3696);
                var18.field2313.method5099(var18.field2313.field3696 - var21);
                field669.method2075(var18);
                field669.method2074();
                field669.field1279 = new class328(var10);
                int[] var24 = new int[4];
                for (int var25 = 0; var25 < 4; var25++) {
                    var24[var25] = var10[var25] + 50;
                }
                var2.method5051(var24);
                field656 = 6;
            }
            if (field656 == 6 && var1.method3263() > 0) {
                int var26 = var1.method3262();
                if (var26 == 21 && field631 == 20) {
                    field656 = 9;
                } else if (var26 == 2) {
                    field656 = 11;
                } else if (var26 == 15 && field631 == 40) {
                    field669.field1277 = -1;
                    field656 = 16;
                } else if (var26 == 64) {
                    field656 = 7;
                } else if (var26 == 23 && field842 < 1) {
                    field842++;
                    field656 = 0;
                } else if (var26 == 29) {
                    field656 = 14;
                } else {
                    method319(var26);
                    return;
                }
            }
            if (field656 == 7 && var1.method3263() > 0) {
                Statics.field2476 = var1.method3262();
                field656 = 8;
            }
            if (field656 == 8 && var1.method3263() >= Statics.field2476) {
                var1.method3247(var2.field3694, 0, Statics.field2476);
                var2.field3696 = 0;
                field656 = 6;
            }
            if (field656 == 9 && var1.method3263() > 0) {
                field822 = (var1.method3262() + 3) * 60;
                field656 = 10;
            }
            if (field656 == 10) {
                field657 = 0;
                class86.method693(class225.field2781, class225.field2782, field822 / 60 + class225.field2816);
                if (--field822 <= 0) {
                    field656 = 0;
                }
            } else {
                if (field656 == 11 && var1.method3263() >= 1) {
                    Statics.field2070 = var1.method3262();
                    field656 = 12;
                }
                if (field656 == 12 && var1.method3263() >= Statics.field2070) {
                    boolean var27 = var1.method3262() == 1;
                    var1.method3247(var2.field3694, 0, 4);
                    var2.field3696 = 0;
                    boolean var28 = false;
                    if (var27) {
                        int var29 = var2.method5054() << 24;
                        int var30 = var29 | var2.method5054() << 16;
                        int var31 = var30 | var2.method5054() << 8;
                        int var32 = var31 | var2.method5054();
                        int var33 = class291.method181(class86.field1168);
                        if (Statics.field928.field1028.size() >= 10 && !Statics.field928.field1028.containsKey(var33)) {
                            Iterator var34 = Statics.field928.field1028.entrySet().iterator();
                            var34.next();
                            var34.remove();
                        }
                        Statics.field928.field1028.put(var33, var32);
                    }
                    if (field661) {
                        Statics.field928.field1027 = class86.field1168;
                    } else {
                        Statics.field928.field1027 = null;
                    }
                    class74.method5046();
                    field792 = var1.method3262();
                    field794 = var1.method3262() == 1;
                    field806 = var1.method3262();
                    field806 <<= 0x8;
                    field806 += var1.method3262();
                    field740 = var1.method3262();
                    var1.method3247(var2.field3694, 0, 1);
                    var2.field3696 = 0;
                    class183[] var35 = class183.method3392();
                    int var36 = var2.method5056();
                    if (var36 < 0 || var36 >= var35.length) {
                        throw new IOException(var36 + " " + var2.field3696);
                    }
                    field669.field1281 = var35[var36];
                    field669.field1277 = field669.field1281.field2184;
                    var1.method3247(var2.field3694, 0, 2);
                    var2.field3696 = 0;
                    field669.field1277 = var2.method5304();
                    try {
                        class48.method686(Statics.field2505, "zap");
                    } catch (Throwable var43) {
                    }
                    field656 = 13;
                }
                if (field656 != 13) {
                    if (field656 == 14 && var1.method3263() >= 2) {
                        var2.field3696 = 0;
                        var1.method3247(var2.field3694, 0, 2);
                        var2.field3696 = 0;
                        Statics.field1432 = var2.method5304();
                        field656 = 15;
                    }
                    if (field656 == 15 && var1.method3263() >= Statics.field1432) {
                        var2.field3696 = 0;
                        var1.method3247(var2.field3694, 0, Statics.field1432);
                        var2.field3696 = 0;
                        String var38 = var2.method5112();
                        String var39 = var2.method5112();
                        String var40 = var2.method5112();
                        class86.method693(var38, var39, var40);
                        method178(10);
                    }
                    if (field656 == 16) {
                        if (field669.field1277 == -1) {
                            if (var1.method3263() < 2) {
                                return;
                            }
                            var1.method3247(var2.field3694, 0, 2);
                            var2.field3696 = 0;
                            field669.field1277 = var2.method5304();
                        }
                        if (var1.method3263() >= field669.field1277) {
                            var1.method3247(var2.field3694, 0, field669.field1277);
                            var2.field3696 = 0;
                            int var41 = field669.field1277;
                            field673.method4649();
                            method3019();
                            class90.method1857(var2);
                            if (var2.field3696 != var41) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field657++;
                        if (field657 > 2000) {
                            if (field842 < 1) {
                                if (Statics.field276 == Statics.field2295) {
                                    Statics.field2295 = Statics.field3896;
                                } else {
                                    Statics.field2295 = Statics.field276;
                                }
                                field842++;
                                field656 = 0;
                            } else {
                                method319(-3);
                            }
                        }
                    }
                } else if (var1.method3263() >= field669.field1277) {
                    var2.field3696 = 0;
                    var1.method3247(var2.field3694, 0, field669.field1277);
                    field673.method4639();
                    method2831();
                    class90.method1857(var2);
                    Statics.field1586 = -1;
                    method696(false, var2);
                    field669.field1281 = null;
                }
            }
        } catch (IOException var44) {
            if (field842 < 1) {
                if (Statics.field276 == Statics.field2295) {
                    Statics.field2295 = Statics.field3896;
                } else {
                    Statics.field2295 = Statics.field276;
                }
                field842++;
                field656 = 0;
            } else {
                method319(-2);
            }
        }
    }

    @ObfuscatedName("ec.ee(B)V")
    public static void method2831() {
        field635 = 1L;
        Statics.field3284.field558 = 0;
        Statics.field909 = true;
        field640 = true;
        field751 = -1L;
        class97.method734();
        field669.method2073();
        field669.field1283.field3696 = 0;
        field669.field1281 = null;
        field669.field1275 = null;
        field669.field1287 = null;
        field669.field1288 = null;
        field669.field1277 = 0;
        field669.field1284 = 0;
        field641 = 0;
        field670 = 0;
        field881 = 0;
        field738 = 0;
        field758 = false;
        class55.field468 = 0;
        class92.field1251.clear();
        class92.field1244.method5494();
        class92.field1246.method4606();
        class92.field1245 = 0;
        field776 = 0;
        field744 = false;
        field862 = 0;
        field692 = 0;
        field697 = 0;
        Statics.field1134 = null;
        field856 = 0;
        field849 = -1;
        field854 = 0;
        field855 = 0;
        field886 = class85.field1147;
        field651 = class85.field1147;
        field665 = 0;
        class90.method3637();
        for (int var0 = 0; var0 < 2048; var0++) {
            field625[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field634[var1] = null;
        }
        field749 = -1;
        field752.method4544();
        field755.method4544();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field820[var2][var3][var4] = null;
                }
            }
        }
        field666 = new class262();
        Statics.field2683.method1736();
        for (int var5 = 0; var5 < Statics.field2057; var5++) {
            class241 var6 = Statics.method462(var5);
            if (var6 != null) {
                class213.field2493[var5] = 0;
                class213.field2494[var5] = 0;
            }
        }
        Statics.field1847.method1983();
        field793 = -1;
        if (field783 != -1) {
            class218.method2522(field783);
        }
        for (class62 var7 = (class62) field899.method5516(); var7 != null; var7 = (class62) field899.method5518()) {
            method4196(var7, true);
        }
        field783 = -1;
        field899 = new class318(8);
        field789 = null;
        field738 = 0;
        field758 = false;
        field664.method3700((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field681[var8] = null;
            field706[var8] = false;
        }
        class60.method4864();
        field658 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field828[var9] = true;
        }
        Statics.method1019();
        Statics.field73 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field891[var10] = new class10();
        }
        Statics.field1289 = null;
    }

    @ObfuscatedName("el.er(B)V")
    public static void method3019() {
        field669.method2073();
        field669.field1283.field3696 = 0;
        field669.field1281 = null;
        field669.field1275 = null;
        field669.field1287 = null;
        field669.field1288 = null;
        field669.field1277 = 0;
        field669.field1284 = 0;
        field641 = 0;
        field738 = 0;
        field758 = false;
        field856 = 0;
        field854 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field625[var0] = null;
        }
        Statics.field2495 = null;
        for (int var1 = 0; var1 < field634.length; var1++) {
            class80 var2 = field634[var1];
            if (var2 != null) {
                var2.field944 = -1;
                var2.field945 = false;
            }
        }
        class60.method4864();
        method178(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field828[var3] = true;
        }
        Statics.method1019();
    }

    @ObfuscatedName("at.eh(IB)V")
    public static void method319(int arg0) {
        if (arg0 == -3) {
            class86.method693(class225.field2784, class225.field2785, class225.field2835);
        } else if (arg0 == -2) {
            class86.method693(class225.field2954, class225.field2788, class225.field2789);
        } else if (arg0 == -1) {
            class86.method693(class225.field2790, class225.field2791, class225.field2787);
        } else if (arg0 == 3) {
            class86.field1169 = 3;
            class86.field1162 = 1;
        } else if (arg0 == 4) {
            class86.field1169 = 12;
            class86.field1157 = 0;
        } else if (arg0 == 5) {
            class86.field1162 = 2;
            class86.method693(class225.field2796, class225.field3015, class225.field2798);
        } else if (arg0 == 68 || !(field630 || arg0 != 6)) {
            class86.method693(class225.field2799, class225.field2800, class225.field2801);
        } else if (arg0 == 7) {
            class86.method693(class225.field3024, class225.field2803, class225.field2804);
        } else if (arg0 == 8) {
            class86.method693(class225.field2805, class225.field2773, class225.field2854);
        } else if (arg0 == 9) {
            class86.method693(class225.field2856, class225.field2809, class225.field2749);
        } else if (arg0 == 10) {
            class86.method693(class225.field2811, class225.field2812, class225.field3010);
        } else if (arg0 == 11) {
            class86.method693(class225.field2786, class225.field2815, class225.field2814);
        } else if (arg0 == 12) {
            class86.method693(class225.field2817, class225.field2818, class225.field2819);
        } else if (arg0 == 13) {
            class86.method693(class225.field2820, class225.field2752, class225.field2824);
        } else if (arg0 == 14) {
            class86.method693(class225.field2823, class225.field2999, class225.field2825);
        } else if (arg0 == 16) {
            class86.method693(class225.field2826, class225.field2742, class225.field2808);
        } else if (arg0 == 17) {
            class86.method693(class225.field2829, class225.field2944, class225.field2831);
        } else if (arg0 == 18) {
            class86.field1169 = 12;
            class86.field1157 = 1;
        } else if (arg0 == 19) {
            class86.method693(class225.field2955, class225.field2911, class225.field2837);
        } else if (arg0 == 20) {
            class86.method693(class225.field2838, class225.field2989, class225.field2840);
        } else if (arg0 == 22) {
            class86.method693(class225.field2841, class225.field3027, class225.field2843);
        } else if (arg0 == 23) {
            class86.method693(class225.field2844, class225.field2802, class225.field2846);
        } else if (arg0 == 24) {
            class86.method693(class225.field3029, class225.field2848, class225.field2849);
        } else if (arg0 == 25) {
            class86.method693(class225.field2850, class225.field2945, class225.field2769);
        } else if (arg0 == 26) {
            class86.method693(class225.field2853, class225.field2899, class225.field2855);
        } else if (arg0 == 27) {
            class86.method693(class225.field2937, class225.field3026, class225.field2858);
        } else if (arg0 == 31) {
            class86.method693(class225.field2865, class225.field2866, class225.field2867);
        } else if (arg0 == 32) {
            class86.method693(class225.field2775, class225.field2869, class225.field2870);
        } else if (arg0 == 37) {
            class86.method693(class225.field2996, class225.field2872, class225.field2806);
        } else if (arg0 == 38) {
            class86.method693(class225.field2973, class225.field2875, class225.field2876);
        } else if (arg0 == 55) {
            class86.field1169 = 8;
        } else if (arg0 == 56) {
            class86.method693(class225.field2827, class225.field2882, class225.field2883);
            method178(11);
            return;
        } else if (arg0 == 57) {
            class86.method693(class225.field2884, class225.field2885, class225.field2886);
            method178(11);
            return;
        } else if (arg0 == 61) {
            class86.field1169 = 7;
        } else {
            class86.method693(class225.field3001, class225.field2888, class225.field2904);
        }
        method178(10);
    }

    @ObfuscatedName("ay.eu(I)V")
    public static final void method626() {
        field669.method2072();
        class258.method1013();
        Statics.method48();
        class246.field3241.method3063();
        class254.field3324.method3063();
        class254.field3352.method3063();
        class254.field3339.method3063();
        class254.field3335.method3063();
        class257.field3435.method3063();
        class257.field3455.method3063();
        class255.field3379.method3063();
        class255.field3380.method3063();
        class255.field3409.method3063();
        class259.field3488.method3063();
        class259.field3500.method3063();
        class244.field3216.method3063();
        class244.field3217.method3063();
        class249.field3272.method3063();
        class241.method3393();
        class253.method5048();
        class247.method3161();
        class251.field3286.method3063();
        class250.field3281.method3063();
        class242.method692();
        class215.field2517.method3063();
        class218.field2533.method3063();
        class218.field2534.method3063();
        class218.field2679.method3063();
        class218.field2612.method3063();
        ((class120) Statics.field1749).method2500();
        class93.field1262.method3063();
        Statics.field555.method3841();
        Statics.field65.method3841();
        Statics.field98.method3841();
        Statics.field93.method3841();
        Statics.field3557.method3841();
        Statics.field202.method3841();
        Statics.field401.method3841();
        Statics.field205.method3841();
        Statics.field101.method3841();
        Statics.field3641.method3841();
        Statics.field3776.method3841();
        Statics.field576.method3841();
        Statics.field178.method2835();
        for (int var0 = 0; var0 < 4; var0++) {
            field659[var0].method3276();
        }
        System.gc();
        class198.method3033(2);
        field858 = -1;
        field747 = false;
        class76.method3772();
        method178(10);
    }

    @ObfuscatedName("y.ew(II)V")
    public static final void method182(int arg0) {
        method626();
        switch(arg0) {
            case 1:
                class86.field1169 = 24;
                class86.method693(class225.field2868, class225.field2979, class225.field2980);
                break;
            case 2:
                class86.field1169 = 24;
                class86.method693(class225.field2797, class225.field2976, class225.field3003);
        }
    }

    @ObfuscatedName("gn.ex(I)V")
    public static final void method3346() {
        if (field670 > 0) {
            method626();
        } else {
            field673.method4652();
            method178(40);
            Statics.field513 = field669.method2079();
            field669.method2078();
        }
    }

    @ObfuscatedName("cx.ft(ZB)V")
    public static final void method2087(boolean arg0) {
        if (arg0) {
            field660 = class86.field1184 ? class161.field1973 : class161.field1975;
            return;
        }
        LinkedHashMap var1 = Statics.field928.field1028;
        String var2 = class86.field1168;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field660 = var1.containsKey(var4) ? class161.field1976 : class161.field1974;
    }

    @ObfuscatedName("client.ff(B)V")
    public final void method1173() {
        if (field641 > 1) {
            field641--;
        }
        if (field670 > 0) {
            field670--;
        }
        if (field773) {
            field773 = false;
            method3346();
            return;
        }
        if (!field758) {
            method1860();
        }
        for (int var1 = 0; var1 < 100 && this.method1131(field669); var1++) {
        }
        if (field631 != 30) {
            return;
        }
        while (true) {
            class98 var2 = (class98) class97.field1293.method4492();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field673.field3550) {
                    class188 var6 = class188.method1894(class184.field2192, field669.field1279);
                    var6.field2313.method5087(0);
                    int var7 = var6.field2313.field3696;
                    field673.method4641(var6.field2313);
                    var6.field2313.method5332(var6.field2313.field3696 - var7);
                    field669.method2075(var6);
                    field673.method4640();
                }
                Object var8 = Statics.field3284.field557;
                synchronized (Statics.field3284.field557) {
                    if (!field860) {
                        Statics.field3284.field558 = 0;
                    } else if (class55.field469 != 0 || Statics.field3284.field558 >= 40) {
                        class188 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field3284.field558 && (var9 == null || var9.field2313.field3696 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field3284.field563[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field3284.field559[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field636 != var16 || field668 != var15) {
                                if (var9 == null) {
                                    var9 = class188.method1894(class184.field2247, field669.field1279);
                                    var9.field2313.method5087(0);
                                    var10 = var9.field2313.field3696;
                                    var9.field2313.field3696 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field638 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field636;
                                    var18 = var15 - field668;
                                    var19 = (int) ((Statics.field3284.field561[var14] - field638) / 20L);
                                    var12 = (int) ((Statics.field3284.field561[var14] - field638) % 20L + (long) var12);
                                }
                                field636 = var16;
                                field668 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2313.method5145((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2313.method5087(var19 + 128);
                                    var9.field2313.method5145((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2313.method5087(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2313.method5090(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2313.method5090(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2313.method5145((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2313.method5090(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2313.method5090(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field638 = Statics.field3284.field561[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2313.method5332(var9.field2313.field3696 - var10);
                            int var20 = var9.field2313.field3696;
                            var9.field2313.field3696 = var10;
                            var9.field2313.method5087(var12 / var13);
                            var9.field2313.method5087(var12 % var13);
                            var9.field2313.field3696 = var20;
                            field669.method2075(var9);
                        }
                        if (var11 >= Statics.field3284.field558) {
                            Statics.field3284.field558 = 0;
                        } else {
                            Statics.field3284.field558 -= var11;
                            System.arraycopy(Statics.field3284.field559, var11, Statics.field3284.field559, 0, Statics.field3284.field558);
                            System.arraycopy(Statics.field3284.field563, var11, Statics.field3284.field563, 0, Statics.field3284.field558);
                            System.arraycopy(Statics.field3284.field561, var11, Statics.field3284.field561, 0, Statics.field3284.field558);
                        }
                    }
                }
                if (class55.field469 == 1 || !Statics.field282 && class55.field469 == 4 || class55.field469 == 2) {
                    long var22 = (class55.field472 - field635 * -1L) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field635 = class55.field472 * -1L;
                    int var24 = class55.field460;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field434) {
                        var24 = Statics.field434;
                    }
                    int var25 = class55.field470;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field3796) {
                        var25 = Statics.field3796;
                    }
                    int var26 = (int) var22;
                    class188 var27 = class188.method1894(class184.field2214, field669.field1279);
                    var27.field2313.method5145((class55.field469 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2313.method5145(var25);
                    var27.field2313.method5145(var24);
                    field669.method2075(var27);
                }
                if (class46.field381 > 0) {
                    class188 var28 = class188.method1894(class184.field2225, field669.field1279);
                    var28.field2313.method5145(0);
                    int var29 = var28.field2313.field3696;
                    long var30 = Statics.method2303();
                    for (int var32 = 0; var32 < class46.field381; var32++) {
                        long var33 = var30 - field751;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field751 = var30;
                        var28.field2313.method5087(class46.field380[var32]);
                        var28.field2313.method5104((int) var33);
                    }
                    var28.field2313.method5099(var28.field2313.field3696 - var29);
                    field669.method2075(var28);
                }
                if (field884 > 0) {
                    field884--;
                }
                if (class46.field374[96] || class46.field374[97] || class46.field374[98] || class46.field374[99]) {
                    field859 = true;
                }
                if (field859 && field884 <= 0) {
                    field884 = 20;
                    field859 = false;
                    class188 var35 = class188.method1894(class184.field2272, field669.field1279);
                    var35.field2313.method5139(field692);
                    var35.field2313.method5145(field691);
                    field669.method2075(var35);
                }
                if (Statics.field909 && !field640) {
                    field640 = true;
                    class188 var36 = class188.method1894(class184.field2201, field669.field1279);
                    var36.field2313.method5087(1);
                    field669.method2075(var36);
                }
                if (!Statics.field909 && field640) {
                    field640 = false;
                    class188 var37 = class188.method1894(class184.field2201, field669.field1279);
                    var37.field2313.method5087(0);
                    field669.method2075(var37);
                }
                if (Statics.field75 != null) {
                    Statics.field75.method5870();
                }
                if (Statics.field537) {
                    if (Statics.field73 != null) {
                        Statics.field73.method4735();
                    }
                    method503();
                    Statics.field537 = false;
                }
                if (Statics.field562 != field849) {
                    field849 = Statics.field562;
                    method34(Statics.field562);
                }
                if (field631 != 30) {
                    return;
                }
                for (class69 var38 = (class69) field666.method4550(); var38 != null; var38 = (class69) field666.method4573()) {
                    if (var38.field906 > 0) {
                        var38.field906--;
                    }
                    if (var38.field906 == 0) {
                        if (var38.field905 >= 0) {
                            int var39 = var38.field905;
                            int var40 = var38.field904;
                            class254 var41 = class254.method3035(var39);
                            if (var40 == 11) {
                                var40 = 10;
                            }
                            if (var40 >= 5 && var40 <= 8) {
                                var40 = 4;
                            }
                            boolean var42 = var41.method4270(var40);
                            if (!var42) {
                                continue;
                            }
                        }
                        method1043(var38.field913, var38.field902, var38.field903, var38.field916, var38.field905, var38.field901, var38.field904);
                        var38.method3326();
                    } else {
                        if (var38.field911 > 0) {
                            var38.field911--;
                        }
                        if (var38.field911 == 0 && var38.field903 >= 1 && var38.field916 >= 1 && var38.field903 <= 102 && var38.field916 <= 102) {
                            if (var38.field908 >= 0) {
                                int var43 = var38.field908;
                                int var44 = var38.field912;
                                class254 var45 = class254.method3035(var43);
                                if (var44 == 11) {
                                    var44 = 10;
                                }
                                if (var44 >= 5 && var44 <= 8) {
                                    var44 = 4;
                                }
                                boolean var46 = var45.method4270(var44);
                                if (!var46) {
                                    continue;
                                }
                            }
                            method1043(var38.field913, var38.field902, var38.field903, var38.field916, var38.field908, var38.field915, var38.field912);
                            var38.field911 = -1;
                            if (var38.field908 == var38.field905 && var38.field905 == -1) {
                                var38.method3326();
                            } else if (var38.field908 == var38.field905 && var38.field915 == var38.field901 && var38.field912 == var38.field904) {
                                var38.method3326();
                            }
                        }
                    }
                }
                Statics.method4000();
                field669.field1284++;
                if (field669.field1284 > 750) {
                    method3346();
                    return;
                }
                method10();
                for (int var47 = 0; var47 < field665; var47++) {
                    int var48 = field875[var47];
                    class80 var49 = field634[var48];
                    if (var49 != null) {
                        method2623(var49, var49.field1098.field3441);
                    }
                }
                method3335();
                field684++;
                if (field726 != 0) {
                    field686 += 20;
                    if (field686 >= 400) {
                        field726 = 0;
                    }
                }
                if (Statics.field1836 != null) {
                    field728++;
                    if (field728 >= 15) {
                        method469(Statics.field1836);
                        Statics.field1836 = null;
                    }
                }
                class218 var50 = Statics.field270;
                class218 var51 = Statics.field293;
                Statics.field270 = null;
                Statics.field293 = null;
                field784 = null;
                field804 = false;
                field801 = false;
                field845 = 0;
                while (class46.method4702() && field845 < 128) {
                    if (field792 >= 2 && class46.field374[82] && Statics.field362 == 66) {
                        String var52 = class92.method131();
                        Statics.field2505.method763(var52);
                    } else if (field697 != 1 || Statics.field127 <= 0) {
                        field847[field845] = Statics.field362;
                        field846[field845] = Statics.field127;
                        field845++;
                    }
                }
                if (method966() && class46.field374[82] && class46.field374[81] && field821 != 0) {
                    int var53 = Statics.field2495.field609 - field821;
                    if (var53 < 0) {
                        var53 = 0;
                    } else if (var53 > 3) {
                        var53 = 3;
                    }
                    if (Statics.field2495.field609 != var53) {
                        int var54 = Statics.field20 + Statics.field2495.field940[0];
                        int var55 = Statics.field553 + Statics.field2495.field974[0];
                        class188 var56 = class188.method1894(class184.field2188, field669.field1279);
                        var56.field2313.method5138(var54);
                        var56.field2313.method5145(var55);
                        var56.field2313.method5129(var53);
                        var56.field2313.method5149(0);
                        field669.method2075(var56);
                    }
                    field821 = 0;
                }
                if (field783 != -1) {
                    method2520(field783, 0, 0, Statics.field3796, Statics.field434, 0, 0);
                }
                field808++;
                while (true) {
                    class63 var57;
                    class218 var58;
                    class218 var59;
                    do {
                        var57 = (class63) field823.method4548();
                        if (var57 == null) {
                            while (true) {
                                class63 var60;
                                class218 var61;
                                class218 var62;
                                do {
                                    var60 = (class63) field824.method4548();
                                    if (var60 == null) {
                                        while (true) {
                                            class63 var63;
                                            class218 var64;
                                            class218 var65;
                                            do {
                                                var63 = (class63) field721.method4548();
                                                if (var63 == null) {
                                                    this.method1132();
                                                    method3626();
                                                    if (field796 != null) {
                                                        this.method1137();
                                                    }
                                                    if (Statics.field19 != null) {
                                                        method469(Statics.field19);
                                                        field735++;
                                                        if (class55.field461 == 0) {
                                                            if (field734) {
                                                                if (Statics.field997 == Statics.field19 && field733 != field730) {
                                                                    class218 var66 = Statics.field19;
                                                                    byte var67 = 0;
                                                                    if (field788 == 1 && var66.field2543 == 206) {
                                                                        var67 = 1;
                                                                    }
                                                                    if (var66.field2663[field733] <= 0) {
                                                                        var67 = 0;
                                                                    }
                                                                    int var68 = method995(var66);
                                                                    boolean var69 = (var68 >> 29 & 0x1) != 0;
                                                                    if (var69) {
                                                                        int var70 = field730;
                                                                        int var71 = field733;
                                                                        var66.field2663[var71] = var66.field2663[var70];
                                                                        var66.field2664[var71] = var66.field2664[var70];
                                                                        var66.field2663[var70] = -1;
                                                                        var66.field2664[var70] = 0;
                                                                    } else if (var67 == 1) {
                                                                        int var72 = field730;
                                                                        int var73 = field733;
                                                                        while (var72 != var73) {
                                                                            if (var72 > var73) {
                                                                                var66.method3754(var72 - 1, var72);
                                                                                var72--;
                                                                            } else if (var72 < var73) {
                                                                                var66.method3754(var72 + 1, var72);
                                                                                var72++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var66.method3754(field733, field730);
                                                                    }
                                                                    class188 var74 = class188.method1894(class184.field2268, field669.field1279);
                                                                    var74.field2313.method5149(Statics.field19.field2571);
                                                                    var74.field2313.method5139(field733);
                                                                    var74.field2313.method5131(var67);
                                                                    var74.field2313.method5139(field730);
                                                                    field669.method2075(var74);
                                                                }
                                                            } else if (this.method1133()) {
                                                                this.method1157(field731, field871);
                                                            } else if (field738 > 0) {
                                                                int var75 = field731;
                                                                int var76 = field871;
                                                                class83 var77 = Statics.field1412;
                                                                method4224(var77.field1132, var77.field1130, var77.field1129, var77.field1136, var77.field1133, var77.field1133, var75, var76);
                                                                Statics.field1412 = null;
                                                            }
                                                            field728 = 10;
                                                            class55.field469 = 0;
                                                            Statics.field19 = null;
                                                        } else if (field735 >= 5 && (class55.field462 > field731 + 5 || class55.field462 < field731 - 5 || class55.field463 > field871 + 5 || class55.field463 < field871 - 5)) {
                                                            field734 = true;
                                                        }
                                                    }
                                                    if (class134.method2874()) {
                                                        int var78 = class134.field1829;
                                                        int var79 = class134.field1803;
                                                        class188 var80 = class188.method1894(class184.field2185, field669.field1279);
                                                        var80.field2313.method5087(5);
                                                        var80.field2313.method5129(class46.field374[82] ? (class46.field374[81] ? 2 : 1) : 0);
                                                        var80.field2313.method5145(Statics.field553 + var79);
                                                        var80.field2313.method5145(Statics.field20 + var78);
                                                        field669.method2075(var80);
                                                        class134.method2911();
                                                        field680 = class55.field470;
                                                        field724 = class55.field460;
                                                        field726 = 1;
                                                        field686 = 0;
                                                        field854 = var78;
                                                        field855 = var79;
                                                    }
                                                    if (Statics.field270 != var50) {
                                                        if (var50 != null) {
                                                            method469(var50);
                                                        }
                                                        if (Statics.field270 != null) {
                                                            method469(Statics.field270);
                                                        }
                                                    }
                                                    if (Statics.field293 != var51 && field774 == field739) {
                                                        if (var51 != null) {
                                                            method469(var51);
                                                        }
                                                        if (Statics.field293 != null) {
                                                            method469(Statics.field293);
                                                        }
                                                    }
                                                    if (Statics.field293 == null) {
                                                        if (field774 > 0) {
                                                            field774--;
                                                        }
                                                    } else if (field774 < field739) {
                                                        field774++;
                                                        if (field774 == field739) {
                                                            method469(Statics.field293);
                                                        }
                                                    }
                                                    if (field697 == 0) {
                                                        int var81 = Statics.field2495.field971;
                                                        int var82 = Statics.field2495.field918;
                                                        if (Statics.field1215 - var81 < -500 || Statics.field1215 - var81 > 500 || Statics.field2466 - var82 < -500 || Statics.field2466 - var82 > 500) {
                                                            Statics.field1215 = var81;
                                                            Statics.field2466 = var82;
                                                        }
                                                        if (Statics.field1215 != var81) {
                                                            Statics.field1215 += (var81 - Statics.field1215) / 16;
                                                        }
                                                        if (Statics.field2466 != var82) {
                                                            Statics.field2466 += (var82 - Statics.field2466) / 16;
                                                        }
                                                        int var83 = Statics.field1215 >> 7;
                                                        int var84 = Statics.field2466 >> 7;
                                                        int var85 = method564(Statics.field1215, Statics.field2466, Statics.field562);
                                                        int var86 = 0;
                                                        if (var83 > 3 && var84 > 3 && var83 < 100 && var84 < 100) {
                                                            for (int var87 = var83 - 4; var87 <= var83 + 4; var87++) {
                                                                for (int var88 = var84 - 4; var88 <= var84 + 4; var88++) {
                                                                    int var89 = Statics.field562;
                                                                    if (var89 < 3 && (class56.field475[1][var87][var88] & 0x2) == 2) {
                                                                        var89++;
                                                                    }
                                                                    int var90 = var85 - class56.field476[var89][var87][var88];
                                                                    if (var90 > var86) {
                                                                        var86 = var90;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var91 = var86 * 192;
                                                        if (var91 > 98048) {
                                                            var91 = 98048;
                                                        }
                                                        if (var91 < 32768) {
                                                            var91 = 32768;
                                                        }
                                                        if (var91 > field708) {
                                                            field708 += (var91 - field708) / 24;
                                                        } else if (var91 < field708) {
                                                            field708 += (var91 - field708) / 80;
                                                        }
                                                        Statics.field581 = method564(Statics.field2495.field971, Statics.field2495.field918, Statics.field562) - field698;
                                                    } else if (field697 == 1) {
                                                        method4634();
                                                        short var92 = -1;
                                                        if (class46.field374[33]) {
                                                            var92 = 0;
                                                        } else if (class46.field374[49]) {
                                                            var92 = 1024;
                                                        }
                                                        if (class46.field374[48]) {
                                                            if (var92 == 0) {
                                                                var92 = 1792;
                                                            } else if (var92 == 1024) {
                                                                var92 = 1280;
                                                            } else {
                                                                var92 = 1536;
                                                            }
                                                        } else if (class46.field374[50]) {
                                                            if (var92 == 0) {
                                                                var92 = 256;
                                                            } else if (var92 == 1024) {
                                                                var92 = 768;
                                                            } else {
                                                                var92 = 512;
                                                            }
                                                        }
                                                        byte var93 = 0;
                                                        if (class46.field374[35]) {
                                                            var93 = -1;
                                                        } else if (class46.field374[51]) {
                                                            var93 = 1;
                                                        }
                                                        int var94 = 0;
                                                        if (var92 >= 0 || var93 != 0) {
                                                            int var95 = class46.field374[81] ? field703 : field702;
                                                            var94 = var95 * 16;
                                                            field803 = var92;
                                                            field701 = var93;
                                                        }
                                                        if (field699 < var94) {
                                                            field699 += var94 / 8;
                                                            if (field699 > var94) {
                                                                field699 = var94;
                                                            }
                                                        } else if (field699 > var94) {
                                                            field699 = field699 * 9 / 10;
                                                        }
                                                        if (field699 > 0) {
                                                            int var96 = field699 / 16;
                                                            if (field803 >= 0) {
                                                                int var97 = field803 - Statics.field1637 & 0x7FF;
                                                                int var98 = class131.field1752[var97];
                                                                int var99 = class131.field1737[var97];
                                                                Statics.field1215 += var96 * var98 / 65536;
                                                                Statics.field2466 += var96 * var99 / 65536;
                                                            }
                                                            if (field701 != 0) {
                                                                Statics.field581 += field701 * var96;
                                                                if (Statics.field581 > 0) {
                                                                    Statics.field581 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field803 = -1;
                                                            field701 = -1;
                                                        }
                                                        if (class46.field374[13]) {
                                                            method3178();
                                                        }
                                                    }
                                                    if (class55.field461 == 4 && Statics.field282) {
                                                        int var100 = class55.field463 - field764;
                                                        field694 = var100 * 2;
                                                        field764 = var100 == -1 || var100 == 1 ? class55.field463 : (field764 + class55.field463) / 2;
                                                        int var101 = field695 - class55.field462;
                                                        field693 = var101 * 2;
                                                        field695 = var101 == -1 || var101 == 1 ? class55.field462 : (field695 + class55.field462) / 2;
                                                    } else {
                                                        if (class46.field374[96]) {
                                                            field693 += (-24 - field693) / 2;
                                                        } else if (class46.field374[97]) {
                                                            field693 += (24 - field693) / 2;
                                                        } else {
                                                            field693 /= 2;
                                                        }
                                                        if (class46.field374[98]) {
                                                            field694 += (12 - field694) / 2;
                                                        } else if (class46.field374[99]) {
                                                            field694 += (-12 - field694) / 2;
                                                        } else {
                                                            field694 /= 2;
                                                        }
                                                        field764 = class55.field463;
                                                        field695 = class55.field462;
                                                    }
                                                    field692 = field693 / 2 + field692 & 0x7FF;
                                                    field691 += field694 / 2;
                                                    if (field691 < 128) {
                                                        field691 = 128;
                                                    }
                                                    if (field691 > 383) {
                                                        field691 = 383;
                                                    }
                                                    if (field848) {
                                                        int var102 = Statics.field1991 * 128 + 64;
                                                        int var103 = Statics.field1038 * 128 + 64;
                                                        int var104 = method564(var102, var103, Statics.field562) - Statics.field2028;
                                                        if (Statics.field491 < var102) {
                                                            Statics.field491 += Statics.field212 * (var102 - Statics.field491) / 1000 + Statics.field302;
                                                            if (Statics.field491 > var102) {
                                                                Statics.field491 = var102;
                                                            }
                                                        }
                                                        if (Statics.field491 > var102) {
                                                            Statics.field491 -= Statics.field212 * (Statics.field491 - var102) / 1000 + Statics.field302;
                                                            if (Statics.field491 < var102) {
                                                                Statics.field491 = var102;
                                                            }
                                                        }
                                                        if (Statics.field56 < var104) {
                                                            Statics.field56 += Statics.field212 * (var104 - Statics.field56) / 1000 + Statics.field302;
                                                            if (Statics.field56 > var104) {
                                                                Statics.field56 = var104;
                                                            }
                                                        }
                                                        if (Statics.field56 > var104) {
                                                            Statics.field56 -= Statics.field212 * (Statics.field56 - var104) / 1000 + Statics.field302;
                                                            if (Statics.field56 < var104) {
                                                                Statics.field56 = var104;
                                                            }
                                                        }
                                                        if (Statics.field94 < var103) {
                                                            Statics.field94 += Statics.field212 * (var103 - Statics.field94) / 1000 + Statics.field302;
                                                            if (Statics.field94 > var103) {
                                                                Statics.field94 = var103;
                                                            }
                                                        }
                                                        if (Statics.field94 > var103) {
                                                            Statics.field94 -= Statics.field212 * (Statics.field94 - var103) / 1000 + Statics.field302;
                                                            if (Statics.field94 < var103) {
                                                                Statics.field94 = var103;
                                                            }
                                                        }
                                                        int var105 = Statics.field335 * 128 + 64;
                                                        int var106 = Statics.field500 * 128 + 64;
                                                        int var107 = method564(var105, var106, Statics.field562) - Statics.field1243;
                                                        int var108 = var105 - Statics.field491;
                                                        int var109 = var107 - Statics.field56;
                                                        int var110 = var106 - Statics.field94;
                                                        int var111 = (int) Math.sqrt((double) (var108 * var108 + var110 * var110));
                                                        int var112 = (int) (Math.atan2((double) var109, (double) var111) * 325.949D) & 0x7FF;
                                                        int var113 = (int) (Math.atan2((double) var108, (double) var110) * -325.949D) & 0x7FF;
                                                        if (var112 < 128) {
                                                            var112 = 128;
                                                        }
                                                        if (var112 > 383) {
                                                            var112 = 383;
                                                        }
                                                        if (Statics.field3839 < var112) {
                                                            Statics.field3839 += Statics.field286 * (var112 - Statics.field3839) / 1000 + Statics.field582;
                                                            if (Statics.field3839 > var112) {
                                                                Statics.field3839 = var112;
                                                            }
                                                        }
                                                        if (Statics.field3839 > var112) {
                                                            Statics.field3839 -= Statics.field286 * (Statics.field3839 - var112) / 1000 + Statics.field582;
                                                            if (Statics.field3839 < var112) {
                                                                Statics.field3839 = var112;
                                                            }
                                                        }
                                                        int var114 = var113 - Statics.field1637;
                                                        if (var114 > 1024) {
                                                            var114 -= 2048;
                                                        }
                                                        if (var114 < -1024) {
                                                            var114 += 2048;
                                                        }
                                                        if (var114 > 0) {
                                                            Statics.field1637 += Statics.field286 * var114 / 1000 + Statics.field582;
                                                            Statics.field1637 &= 0x7FF;
                                                        }
                                                        if (var114 < 0) {
                                                            Statics.field1637 -= Statics.field286 * -var114 / 1000 + Statics.field582;
                                                            Statics.field1637 &= 0x7FF;
                                                        }
                                                        int var115 = var113 - Statics.field1637;
                                                        if (var115 > 1024) {
                                                            var115 -= 2048;
                                                        }
                                                        if (var115 < -1024) {
                                                            var115 += 2048;
                                                        }
                                                        if (var115 < 0 && var114 > 0 || var115 > 0 && var114 < 0) {
                                                            Statics.field1637 = var113;
                                                        }
                                                    }
                                                    for (int var116 = 0; var116 < 5; var116++) {
                                                        int var10002 = field800[var116]++;
                                                    }
                                                    Statics.field1847.method1987();
                                                    int var117 = ++class55.field468 - 1;
                                                    int var119 = class46.field385;
                                                    if (var117 > 15000 && var119 > 15000) {
                                                        field670 = 250;
                                                        class55.field468 = 14500;
                                                        class188 var121 = class188.method1894(class184.field2266, field669.field1279);
                                                        field669.method2075(var121);
                                                    }
                                                    Statics.field2683.method1685();
                                                    field669.field1285++;
                                                    if (field669.field1285 > 50) {
                                                        class188 var122 = class188.method1894(class184.field2186, field669.field1279);
                                                        field669.method2075(var122);
                                                    }
                                                    try {
                                                        field669.method2074();
                                                    } catch (IOException var124) {
                                                        method3346();
                                                    }
                                                    return;
                                                }
                                                var64 = var63.field550;
                                                if (var64.field2540 < 0) {
                                                    break;
                                                }
                                                var65 = class218.method1101(var64.field2594);
                                            } while (var65 == null || var65.field2549 == null || var64.field2540 >= var65.field2549.length || var65.field2549[var64.field2540] != var64);
                                            class77.method1954(var63);
                                        }
                                    }
                                    var61 = var60.field550;
                                    if (var61.field2540 < 0) {
                                        break;
                                    }
                                    var62 = class218.method1101(var61.field2594);
                                } while (var62 == null || var62.field2549 == null || var61.field2540 >= var62.field2549.length || var62.field2549[var61.field2540] != var61);
                                class77.method1954(var60);
                            }
                        }
                        var58 = var57.field550;
                        if (var58.field2540 < 0) {
                            break;
                        }
                        var59 = class218.method1101(var58.field2594);
                    } while (var59 == null || var59.field2549 == null || var58.field2540 >= var59.field2549.length || var59.field2549[var58.field2540] != var58);
                    class77.method1954(var57);
                }
            }
            class188 var4 = class188.method1894(class184.field2273, field669.field1279);
            var4.field2313.method5087(0);
            int var5 = var4.field2313.field3696;
            class97.method191(var4.field2313);
            var4.field2313.method5332(var4.field2313.field3696 - var5);
            field669.method2075(var4);
        }
    }

    @ObfuscatedName("eo.fh(B)V")
    public static final void method3014() {
        if (Statics.field1030 != null) {
            Statics.field1030.method2266();
        }
        if (Statics.field186 != null) {
            Statics.field186.method2266();
        }
    }

    @ObfuscatedName("k.fr(Liw;IIIB)V")
    public static void method206(class259 arg0, int arg1, int arg2, int arg3) {
        if (field862 >= 50 || field861 == 0 || arg0.field3501 == null || arg1 >= arg0.field3501.length) {
            return;
        }
        int var4 = arg0.field3501[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field863[field862] = var5;
        field763[field862] = var6;
        field865[field862] = 0;
        field775[field862] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field866[field862] = (var8 << 16) + (var9 << 8) + var7;
        field862++;
    }

    @ObfuscatedName("gh.fd(IIIS)V")
    public static void method3379(int arg0, int arg1, int arg2) {
        if (field720 == 0 || arg1 == 0 || field862 >= 50) {
            return;
        }
        field863[field862] = arg0;
        field763[field862] = arg1;
        field865[field862] = arg2;
        field775[field862] = null;
        field866[field862] = 0;
        field862++;
    }

    @ObfuscatedName("ak.fe(II)V")
    public static void method591(int arg0) {
        if (arg0 == -1 && !field747) {
            class198.method3802();
        } else if (arg0 != -1 && field858 != arg0 && field639 != 0 && !field747) {
            class236 var1 = Statics.field202;
            int var2 = field639;
            class198.field2377 = 1;
            Statics.field2373 = var1;
            Statics.field2379 = arg0;
            Statics.field2380 = 0;
            Statics.field396 = var2;
            Statics.field564 = false;
            Statics.field1834 = 2;
        }
        field858 = arg0;
    }

    @ObfuscatedName("bi.fz(III)V")
    public static void method968(int arg0, int arg1) {
        if (field639 != 0 && arg0 != -1) {
            class198.method700(Statics.field3776, arg0, 0, field639, false);
            field747 = true;
        }
    }

    @ObfuscatedName("hr.fs(Lhy;III)V")
    public static final void method3796(class218 arg0, int arg1, int arg2) {
        if (field856 != 0 && field856 != 3 || field758 || !(class55.field469 == 1 || !Statics.field282 && class55.field469 == 4)) {
            return;
        }
        class212 var3 = arg0.method3727(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field470 - arg1;
        int var5 = class55.field460 - arg2;
        if (!var3.method3649(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2489 / 2;
        int var7 = var5 - var3.field2491 / 2;
        int var8 = field692 & 0x7FF;
        int var9 = class131.field1752[var8];
        int var10 = class131.field1737[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2495.field971 + var11 >> 7;
        int var14 = Statics.field2495.field918 - var12 >> 7;
        class188 var15 = class188.method1894(class184.field2246, field669.field1279);
        var15.field2313.method5087(18);
        var15.field2313.method5129(class46.field374[82] ? (class46.field374[81] ? 2 : 1) : 0);
        var15.field2313.method5145(Statics.field553 + var14);
        var15.field2313.method5145(Statics.field20 + var13);
        var15.field2313.method5087(var6);
        var15.field2313.method5087(var7);
        var15.field2313.method5145(field692);
        var15.field2313.method5087(57);
        var15.field2313.method5087(0);
        var15.field2313.method5087(0);
        var15.field2313.method5087(89);
        var15.field2313.method5145(Statics.field2495.field971);
        var15.field2313.method5145(Statics.field2495.field918);
        var15.field2313.method5087(63);
        field669.method2075(var15);
        field854 = var13;
        field855 = var14;
    }

    @ObfuscatedName("ga.fc(B)V")
    public static final void method3335() {
        int[] var0 = class90.field1224;
        for (int var1 = 0; var1 < class90.field1227; var1++) {
            class67 var2 = field625[var0[var1]];
            if (var2 != null && var2.field934 > 0) {
                var2.field934--;
                if (var2.field934 == 0) {
                    var2.field921 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field665; var3++) {
            int var4 = field875[var3];
            class80 var5 = field634[var4];
            if (var5 != null && var5.field934 > 0) {
                var5.field934--;
                if (var5.field934 == 0) {
                    var5.field921 = null;
                }
            }
        }
    }

    @ObfuscatedName("bp.fq(Ljava/lang/String;I)V")
    public static final void method932(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field928.field1024 = !Statics.field928.field1024;
            class74.method5046();
            if (Statics.field928.field1024) {
                class92.method500(99, "", "Roofs are now all hidden");
            } else {
                class92.method500(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field853 = !field853;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field885 = !field885;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field771 = !field771;
        }
        if (field792 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field75.field3946 = !Statics.field75.field3946;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field853 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field853 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3346();
            }
        }
        class188 var1 = class188.method1894(class184.field2256, field669.field1279);
        var1.field2313.method5087(arg0.length() + 1);
        var1.field2313.method5094(arg0);
        field669.method2075(var1);
    }

    @ObfuscatedName("x.fy(I)V")
    public static final void method10() {
        int var0 = class90.field1227;
        int[] var1 = class90.field1224;
        for (int var2 = 0; var2 < var0; var2++) {
            class67 var3 = field625[var1[var2]];
            if (var3 != null) {
                method2623(var3, 1);
            }
        }
    }

    @ObfuscatedName("dq.fa(Lbe;IB)V")
    public static final void method2623(class70 arg0, int arg1) {
        if (arg0.field964 > field628) {
            method243(arg0);
        } else if (arg0.field965 >= field628) {
            method1930(arg0);
        } else {
            arg0.field973 = arg0.field923;
            if (arg0.field972 == 0) {
                arg0.field976 = 0;
            } else {
                label309: {
                    if (arg0.field950 != -1 && arg0.field953 == 0) {
                        class259 var2 = class259.method1897(arg0.field950);
                        if (arg0.field970 > 0 && var2.field3497 == 0) {
                            arg0.field976++;
                            break label309;
                        }
                        if (arg0.field970 <= 0 && var2.field3502 == 0) {
                            arg0.field976++;
                            break label309;
                        }
                    }
                    int var3 = arg0.field971;
                    int var4 = arg0.field918;
                    int var5 = arg0.field940[arg0.field972 - 1] * 128 + arg0.field939 * 64;
                    int var6 = arg0.field974[arg0.field972 - 1] * 128 + arg0.field939 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field969 = 1280;
                        } else if (var4 > var6) {
                            arg0.field969 = 1792;
                        } else {
                            arg0.field969 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field969 = 768;
                        } else if (var4 > var6) {
                            arg0.field969 = 256;
                        } else {
                            arg0.field969 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field969 = 1024;
                    } else if (var4 > var6) {
                        arg0.field969 = 0;
                    }
                    byte var7 = arg0.field975[arg0.field972 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field969 - arg0.field931 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field927;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field926;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field929;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field924;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field926;
                        }
                        arg0.field973 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class80) {
                            var11 = ((class80) arg0).field1098.field3469;
                        }
                        if (var11) {
                            if (arg0.field969 != arg0.field931 && arg0.field944 == -1 && arg0.field954 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field972 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field972 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field976 > 0 && arg0.field972 > 1) {
                                var10 = 8;
                                arg0.field976--;
                            }
                        } else {
                            if (arg0.field972 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field972 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field976 > 0 && arg0.field972 > 1) {
                                var10 = 8;
                                arg0.field976--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field973 == arg0.field926 && arg0.field930 != -1) {
                            arg0.field973 = arg0.field930;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field971 += var10;
                                if (arg0.field971 > var5) {
                                    arg0.field971 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field971 -= var10;
                                if (arg0.field971 < var5) {
                                    arg0.field971 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field918 += var10;
                                if (arg0.field918 > var6) {
                                    arg0.field918 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field918 -= var10;
                                if (arg0.field918 < var6) {
                                    arg0.field918 = var6;
                                }
                            }
                        }
                        if (arg0.field971 == var5 && arg0.field918 == var6) {
                            arg0.field972--;
                            if (arg0.field970 > 0) {
                                arg0.field970--;
                            }
                        }
                    } else {
                        arg0.field971 = var5;
                        arg0.field918 = var6;
                        arg0.field972--;
                        if (arg0.field970 > 0) {
                            arg0.field970--;
                        }
                    }
                }
            }
        }
        if (arg0.field971 < 128 || arg0.field918 < 128 || arg0.field971 >= 13184 || arg0.field918 >= 13184) {
            arg0.field950 = -1;
            arg0.field955 = -1;
            arg0.field964 = 0;
            arg0.field965 = 0;
            arg0.field971 = arg0.field940[0] * 128 + arg0.field939 * 64;
            arg0.field918 = arg0.field974[0] * 128 + arg0.field939 * 64;
            arg0.method1568();
        }
        if (Statics.field2495 == arg0 && (arg0.field971 < 1536 || arg0.field918 < 1536 || arg0.field971 >= 11776 || arg0.field918 >= 11776)) {
            arg0.field950 = -1;
            arg0.field955 = -1;
            arg0.field964 = 0;
            arg0.field965 = 0;
            arg0.field971 = arg0.field940[0] * 128 + arg0.field939 * 64;
            arg0.field918 = arg0.field974[0] * 128 + arg0.field939 * 64;
            arg0.method1568();
        }
        if (arg0.field954 != 0) {
            if (arg0.field944 != -1) {
                class70 var12 = null;
                if (arg0.field944 < 32768) {
                    var12 = field634[arg0.field944];
                } else if (arg0.field944 >= 32768) {
                    var12 = field625[arg0.field944 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field971 - var12.field971;
                    int var14 = arg0.field918 - var12.field918;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field969 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field945) {
                    arg0.field944 = -1;
                    arg0.field945 = false;
                }
            }
            if (arg0.field946 != -1 && (arg0.field972 == 0 || arg0.field976 > 0)) {
                arg0.field969 = arg0.field946;
                arg0.field946 = -1;
            }
            int var15 = arg0.field969 - arg0.field931 & 0x7FF;
            if (var15 == 0 && arg0.field945) {
                arg0.field944 = -1;
                arg0.field945 = false;
            }
            if (var15 == 0) {
                arg0.field977 = 0;
            } else {
                arg0.field977++;
                if (var15 > 1024) {
                    arg0.field931 -= arg0.field954;
                    boolean var16 = true;
                    if (var15 < arg0.field954 || var15 > 2048 - arg0.field954) {
                        arg0.field931 = arg0.field969;
                        var16 = false;
                    }
                    if (arg0.field973 == arg0.field923 && (arg0.field977 > 25 || var16)) {
                        if (arg0.field956 == -1) {
                            arg0.field973 = arg0.field926;
                        } else {
                            arg0.field973 = arg0.field956;
                        }
                    }
                } else {
                    arg0.field931 += arg0.field954;
                    boolean var17 = true;
                    if (var15 < arg0.field954 || var15 > 2048 - arg0.field954) {
                        arg0.field931 = arg0.field969;
                        var17 = false;
                    }
                    if (arg0.field973 == arg0.field923 && (arg0.field977 > 25 || var17)) {
                        if (arg0.field947 == -1) {
                            arg0.field973 = arg0.field926;
                        } else {
                            arg0.field973 = arg0.field947;
                        }
                    }
                }
                arg0.field931 &= 0x7FF;
            }
        }
        method4229(arg0);
    }

    @ObfuscatedName("a.fi(Lbe;B)V")
    public static final void method243(class70 arg0) {
        int var1 = arg0.field964 - field628;
        int var2 = arg0.field960 * 128 + arg0.field939 * 64;
        int var3 = arg0.field962 * 128 + arg0.field939 * 64;
        arg0.field971 += (var2 - arg0.field971) / var1;
        arg0.field918 += (var3 - arg0.field918) / var1;
        arg0.field976 = 0;
        arg0.field969 = arg0.field966;
    }

    @ObfuscatedName("ca.fk(Lbe;I)V")
    public static final void method1930(class70 arg0) {
        if (field628 == arg0.field965 || arg0.field950 == -1 || arg0.field953 != 0 || arg0.field952 + 1 > class259.method1897(arg0.field950).field3485[arg0.field951]) {
            int var1 = arg0.field965 - arg0.field964;
            int var2 = field628 - arg0.field964;
            int var3 = arg0.field960 * 128 + arg0.field939 * 64;
            int var4 = arg0.field962 * 128 + arg0.field939 * 64;
            int var5 = arg0.field961 * 128 + arg0.field939 * 64;
            int var6 = arg0.field963 * 128 + arg0.field939 * 64;
            arg0.field971 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field918 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field976 = 0;
        arg0.field969 = arg0.field966;
        arg0.field931 = arg0.field969;
    }

    @ObfuscatedName("ic.fp(Lbe;B)V")
    public static final void method4229(class70 arg0) {
        arg0.field920 = false;
        if (arg0.field973 != -1) {
            class259 var1 = class259.method1897(arg0.field973);
            if (var1 == null || var1.field3490 == null) {
                arg0.field973 = -1;
            } else {
                arg0.field949++;
                if (arg0.field948 < var1.field3490.length && arg0.field949 > var1.field3485[arg0.field948]) {
                    arg0.field949 = 1;
                    arg0.field948++;
                    method206(var1, arg0.field948, arg0.field971, arg0.field918);
                }
                if (arg0.field948 >= var1.field3490.length) {
                    arg0.field949 = 0;
                    arg0.field948 = 0;
                    method206(var1, arg0.field948, arg0.field971, arg0.field918);
                }
            }
        }
        if (arg0.field955 != -1 && field628 >= arg0.field958) {
            if (arg0.field919 < 0) {
                arg0.field919 = 0;
            }
            int var2 = class244.method3966(arg0.field955).field3220;
            if (var2 == -1) {
                arg0.field955 = -1;
            } else {
                class259 var3 = class259.method1897(var2);
                if (var3 == null || var3.field3490 == null) {
                    arg0.field955 = -1;
                } else {
                    arg0.field917++;
                    if (arg0.field919 < var3.field3490.length && arg0.field917 > var3.field3485[arg0.field919]) {
                        arg0.field917 = 1;
                        arg0.field919++;
                        method206(var3, arg0.field919, arg0.field971, arg0.field918);
                    }
                    if (arg0.field919 >= var3.field3490.length && (arg0.field919 < 0 || arg0.field919 >= var3.field3490.length)) {
                        arg0.field955 = -1;
                    }
                }
            }
        }
        if (arg0.field950 != -1 && arg0.field953 <= 1) {
            class259 var4 = class259.method1897(arg0.field950);
            if (var4.field3497 == 1 && arg0.field970 > 0 && arg0.field964 <= field628 && arg0.field965 < field628) {
                arg0.field953 = 1;
                return;
            }
        }
        if (arg0.field950 != -1 && arg0.field953 == 0) {
            class259 var5 = class259.method1897(arg0.field950);
            if (var5 == null || var5.field3490 == null) {
                arg0.field950 = -1;
            } else {
                arg0.field952++;
                if (arg0.field951 < var5.field3490.length && arg0.field952 > var5.field3485[arg0.field951]) {
                    arg0.field952 = 1;
                    arg0.field951++;
                    method206(var5, arg0.field951, arg0.field971, arg0.field918);
                }
                if (arg0.field951 >= var5.field3490.length) {
                    arg0.field951 -= var5.field3494;
                    arg0.field925++;
                    if (arg0.field925 >= var5.field3493) {
                        arg0.field950 = -1;
                    } else if (arg0.field951 >= 0 && arg0.field951 < var5.field3490.length) {
                        method206(var5, arg0.field951, arg0.field971, arg0.field918);
                    } else {
                        arg0.field950 = -1;
                    }
                }
                arg0.field920 = var5.field3496;
            }
        }
        if (arg0.field953 > 0) {
            arg0.field953--;
        }
    }

    @ObfuscatedName("gb.fj(I)V")
    public static void method3626() {
        if (Statics.field75 != null) {
            Statics.field75.method5854(Statics.field562, (Statics.field2495.field971 >> 7) + Statics.field20, (Statics.field2495.field918 >> 7) + Statics.field553, false);
            Statics.field75.method5919();
        }
    }

    @ObfuscatedName("il.fu(Lby;IIB)V")
    public static void method4109(class67 arg0, int arg1, int arg2) {
        if (arg0.field950 == arg1 && arg1 != -1) {
            int var3 = class259.method1897(arg1).field3503;
            if (var3 == 1) {
                arg0.field951 = 0;
                arg0.field952 = 0;
                arg0.field953 = arg2;
                arg0.field925 = 0;
            }
            if (var3 == 2) {
                arg0.field925 = 0;
            }
        } else if (arg1 == -1 || arg0.field950 == -1 || class259.method1897(arg1).field3505 >= class259.method1897(arg0.field950).field3505) {
            arg0.field950 = arg1;
            arg0.field951 = 0;
            arg0.field952 = 0;
            arg0.field953 = arg2;
            arg0.field925 = 0;
            arg0.field970 = arg0.field972;
        }
    }

    @ObfuscatedName("aa.fw(I)I")
    public static int method637() {
        return field837 ? 2 : 1;
    }

    @ObfuscatedName("gs.fv(II)V")
    public static void method3531(int arg0) {
        field836 = 0L;
        if (arg0 >= 2) {
            field837 = true;
        } else {
            field837 = false;
        }
        if (method637() == 1) {
            Statics.field2505.method759(765, 503);
        } else {
            Statics.field2505.method759(7680, 2160);
        }
        if (field631 >= 25) {
            Statics.method1019();
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method810() {
        field836 = Statics.method2303() + 500L;
        this.method1129();
        if (field783 != -1) {
            this.method1135(true);
        }
    }

    @ObfuscatedName("client.fg(B)V")
    public void method1129() {
        int var1 = Statics.field3796;
        int var2 = Statics.field434;
        if (this.field430 < var1) {
            int var3 = this.field430;
        }
        if (this.field431 < var2) {
            int var4 = this.field431;
        }
        if (Statics.field928 == null) {
            return;
        }
        try {
            client var5 = Statics.field2505;
            Object[] var6 = new Object[] { method637() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1130() {
        if (field783 != -1) {
            int var1 = field783;
            if (class218.method3214(var1)) {
                method247(Statics.field3631[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field678; var2++) {
            if (field828[var2]) {
                field829[var2] = true;
            }
            field648[var2] = field828[var2];
            field828[var2] = false;
        }
        field827 = field628;
        field772 = -1;
        field690 = -1;
        Statics.field997 = null;
        if (field783 != -1) {
            field678 = 0;
            method496(field783, 0, 0, Statics.field3796, Statics.field434, 0, 0, -1);
        }
        class321.method5557();
        if (field727) {
            if (field726 == 1) {
                Statics.field3545[field686 / 100].method5664(field680 - 8, field724 - 8);
            }
            if (field726 == 2) {
                Statics.field3545[field686 / 100 + 4].method5664(field680 - 8, field724 - 8);
            }
        }
        if (field758) {
            method159();
        } else if (field772 != -1) {
            method146(field772, field690);
        }
        if (field835 == 3) {
            for (int var3 = 0; var3 < field678; var3++) {
                if (field648[var3]) {
                    class321.method5564(field830[var3], field832[var3], field833[var3], field834[var3], 16711935, 128);
                } else if (field829[var3]) {
                    class321.method5564(field830[var3], field832[var3], field833[var3], field834[var3], 16711680, 128);
                }
            }
        }
        class76.method465(Statics.field562, Statics.field2495.field971, Statics.field2495.field918, field684);
        field684 = 0;
    }

    @ObfuscatedName("lu.fb(Ljava/lang/String;ZI)V")
    public static final void method6042(String arg0, boolean arg1) {
        if (!field737) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2382.method4954(arg0, 250);
        int var6 = Statics.field2382.method4955(arg0, 250) * 13;
        class321.method5565(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5569(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2382.method4956(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1874(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field394.method744(0, 0);
        } else {
            method4063(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bs.fn(IIIII)V")
    public static final void method1011(int arg0, int arg1, int arg2, int arg3) {
        field778++;
        if (Statics.field2495.field971 >> 7 == field854 && Statics.field2495.field918 >> 7 == field855) {
            field854 = 0;
        }
        method1577();
        if (field749 >= 0 && field625[field749] != null) {
            method3037(field625[field749], false);
        }
        method20(true);
        method1936();
        method20(false);
        for (class87 var4 = (class87) field752.method4550(); var4 != null; var4 = (class87) field752.method4573()) {
            if (Statics.field562 != var4.field1186 || field628 > var4.field1192) {
                var4.method3326();
            } else if (field628 >= var4.field1206) {
                if (var4.field1195 > 0) {
                    class80 var5 = field634[var4.field1195 - 1];
                    if (var5 != null && var5.field971 >= 0 && var5.field971 < 13312 && var5.field918 >= 0 && var5.field918 < 13312) {
                        var4.method1932(var5.field971, var5.field918, method564(var5.field971, var5.field918, var4.field1186) - var4.field1187, field628);
                    }
                }
                if (var4.field1195 < 0) {
                    int var6 = -var4.field1195 - 1;
                    class67 var7;
                    if (field806 == var6) {
                        var7 = Statics.field2495;
                    } else {
                        var7 = field625[var6];
                    }
                    if (var7 != null && var7.field971 >= 0 && var7.field971 < 13312 && var7.field918 >= 0 && var7.field918 < 13312) {
                        var4.method1932(var7.field971, var7.field918, method564(var7.field971, var7.field918, var4.field1186) - var4.field1187, field628);
                    }
                }
                var4.method1937(field684);
                Statics.field178.method2846(Statics.field562, (int) var4.field1209, (int) var4.field1198, (int) var4.field1199, 60, var4, var4.field1205, -1L, false);
            }
        }
        method2052();
        Statics.method5808(arg0, arg1, arg2, arg3, true);
        int var8 = field798;
        int var9 = field883;
        int var10 = field741;
        int var11 = field831;
        class321.method5558(var8, var9, var8 + var10, var9 + var11);
        class131.method2756();
        if (!field848) {
            int var12 = field691;
            if (field708 / 256 > var12) {
                var12 = field708 / 256;
            }
            if (field750[4] && field888[4] + 128 > var12) {
                var12 = field888[4] + 128;
            }
            int var13 = field692 & 0x7FF;
            int var14 = Statics.field1215;
            int var15 = Statics.field581;
            int var16 = Statics.field2466;
            int var17 = var12 * 3 + 600;
            int var19 = var11 - 334;
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 100) {
                var19 = 100;
            }
            int var20 = (field877 - field710) * var19 / 100 + field710;
            int var21 = var17 * var20 / 256;
            int var23 = 2048 - var12 & 0x7FF;
            int var24 = 2048 - var13 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var21;
            if (var23 != 0) {
                int var28 = class131.field1752[var23];
                int var29 = class131.field1737[var23];
                int var30 = var26 * var29 - var21 * var28 >> 16;
                var27 = var26 * var28 + var21 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class131.field1752[var24];
                int var32 = class131.field1737[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field491 = var14 - var25;
            Statics.field56 = var15 - var26;
            Statics.field94 = var16 - var27;
            Statics.field3839 = var12;
            Statics.field1637 = var13;
            if (field697 == 1 && field792 >= 2 && field628 % 50 == 0 && (Statics.field1215 >> 7 != Statics.field2495.field971 >> 7 || Statics.field2466 >> 7 != Statics.field2495.field918 >> 7)) {
                int var34 = Statics.field2495.field609;
                int var35 = (Statics.field1215 >> 7) + Statics.field20;
                int var36 = (Statics.field2466 >> 7) + Statics.field553;
                class188 var37 = class188.method1894(class184.field2188, field669.field1279);
                var37.field2313.method5138(var35);
                var37.field2313.method5145(var36);
                var37.field2313.method5129(var34);
                var37.field2313.method5149(field689);
                field669.method2075(var37);
            }
        }
        int var38;
        if (field848) {
            var38 = method967();
        } else {
            var38 = method1554();
        }
        int var39 = Statics.field491;
        int var40 = Statics.field56;
        int var41 = Statics.field94;
        int var42 = Statics.field3839;
        int var43 = Statics.field1637;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field750[var44]) {
                int var45 = (int) (Math.random() * (double) (field780[var44] * 2 + 1) - (double) field780[var44] + Math.sin((double) field872[var44] / 100.0D * (double) field800[var44]) * (double) field888[var44]);
                if (var44 == 0) {
                    Statics.field491 += var45;
                }
                if (var44 == 1) {
                    Statics.field56 += var45;
                }
                if (var44 == 2) {
                    Statics.field94 += var45;
                }
                if (var44 == 3) {
                    Statics.field1637 = Statics.field1637 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field3839 += var45;
                    if (Statics.field3839 < 128) {
                        Statics.field3839 = 128;
                    }
                    if (Statics.field3839 > 383) {
                        Statics.field3839 = 383;
                    }
                }
            }
        }
        int var46 = class55.field462;
        int var47 = class55.field463;
        if (class55.field469 != 0) {
            var46 = class55.field470;
            var47 = class55.field460;
        }
        if (var46 >= var8 && var46 < var8 + var10 && var47 >= var9 && var47 < var9 + var11) {
            class129.method160(var46 - var8, var47 - var9);
        } else {
            class129.method1557();
        }
        method3014();
        class321.method5565(var8, var9, var10, var11, 0);
        method3014();
        int var48 = class131.field1738;
        class131.field1738 = field864;
        Statics.field178.method2922(Statics.field491, Statics.field56, Statics.field94, Statics.field3839, Statics.field1637, var38);
        class131.field1738 = var48;
        method3014();
        Statics.field178.method2995();
        method1573(var8, var9, var10, var11);
        if (field881 == 2) {
            method1883((field645 - Statics.field20 << 7) + field768, (field646 - Statics.field553 << 7) + field826, field647 * 2);
            if (field781 > -1 && field628 % 20 < 10) {
                Statics.field43[0].method5664(field781 + var8 - 12, field722 + var9 - 28);
            }
        }
        ((class120) Statics.field1749).method2501(field684);
        method3030();
        Statics.field491 = var39;
        Statics.field56 = var40;
        Statics.field94 = var41;
        Statics.field3839 = var42;
        Statics.field1637 = var43;
        if (field658) {
            byte var49 = 0;
            int var50 = class237.field3144 + class237.field3140 + var49;
            if (var50 == 0) {
                field658 = false;
            }
        }
        if (field658) {
            class321.method5565(var8, var9, var10, var11, 0);
            method6042(class225.field3005, false);
        }
    }

    @ObfuscatedName("bl.ga(I)V")
    public static void method1577() {
        if (field885) {
            method3037(Statics.field2495, false);
        }
    }

    @ObfuscatedName("ck.gw(I)V")
    public static void method1936() {
        int var0 = class90.field1227;
        int[] var1 = class90.field1224;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field749 != var1[var2] && field806 != var1[var2]) {
                method3037(field625[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ef.gz(Lby;ZI)V")
    public static void method3037(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1066() || arg0.field591) {
            return;
        }
        arg0.field606 = false;
        if ((field838 && class90.field1227 > 50 || class90.field1227 > 200) && arg1 && arg0.field973 == arg0.field923) {
            arg0.field606 = true;
        }
        int var2 = arg0.field971 >> 7;
        int var3 = arg0.field918 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method239(0, 0, 0, false, arg0.field615);
        if (arg0.field601 != null && field628 >= arg0.field594 && field628 < arg0.field604) {
            arg0.field606 = false;
            arg0.field595 = method564(arg0.field971, arg0.field918, Statics.field562);
            arg0.field922 = field628;
            Statics.field178.method2847(Statics.field562, arg0.field971, arg0.field918, arg0.field595, 60, arg0, arg0.field931, var4, arg0.field602, arg0.field603, arg0.field610, arg0.field605);
            return;
        }
        if ((arg0.field971 & 0x7F) == 64 && (arg0.field918 & 0x7F) == 64) {
            if (field778 == field719[var2][var3]) {
                return;
            }
            field719[var2][var3] = field778;
        }
        arg0.field595 = method564(arg0.field971, arg0.field918, Statics.field562);
        arg0.field922 = field628;
        Statics.field178.method2846(Statics.field562, arg0.field971, arg0.field918, arg0.field595, 60, arg0, arg0.field931, var4, arg0.field920);
    }

    @ObfuscatedName("t.gn(ZI)V")
    public static final void method20(boolean arg0) {
        for (int var1 = 0; var1 < field665; var1++) {
            class80 var2 = field634[field875[var1]];
            if (var2 != null && var2.method1066() && var2.field1098.field3456 == arg0 && var2.field1098.method4391()) {
                int var3 = var2.field971 >> 7;
                int var4 = var2.field918 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field939 == 1 && (var2.field971 & 0x7F) == 64 && (var2.field918 & 0x7F) == 64) {
                        if (field778 == field719[var3][var4]) {
                            continue;
                        }
                        field719[var3][var4] = field778;
                    }
                    long var5 = class129.method239(0, 0, 1, !var2.field1098.field3468, field875[var1]);
                    var2.field922 = field628;
                    Statics.field178.method2846(Statics.field562, var2.field971, var2.field918, method564(var2.field971 + (var2.field939 * 64 - 64), var2.field918 + (var2.field939 * 64 - 64), Statics.field562), var2.field939 * 64 - 64 + 60, var2, var2.field931, var5, var2.field920);
                }
            }
        }
    }

    @ObfuscatedName("cu.gu(B)V")
    public static final void method2052() {
        for (class78 var0 = (class78) field755.method4550(); var0 != null; var0 = (class78) field755.method4573()) {
            if (Statics.field562 != var0.field1076 || var0.field1085) {
                var0.method3326();
            } else if (field628 >= var0.field1077) {
                var0.method1856(field684);
                if (var0.field1085) {
                    var0.method3326();
                } else {
                    Statics.field178.method2846(var0.field1076, var0.field1079, var0.field1080, var0.field1081, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("client.gj(I)I")
    public static final int method1554() {
        if (Statics.field928.field1024) {
            return Statics.field562;
        }
        int var0 = 3;
        if (Statics.field3839 < 310) {
            int var1;
            int var2;
            if (field697 == 1) {
                var1 = Statics.field1215 >> 7;
                var2 = Statics.field2466 >> 7;
            } else {
                var1 = Statics.field2495.field971 >> 7;
                var2 = Statics.field2495.field918 >> 7;
            }
            int var3 = Statics.field491 >> 7;
            int var4 = Statics.field94 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field562;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field562;
            }
            if ((class56.field475[Statics.field562][var3][var4] & 0x4) != 0) {
                var0 = Statics.field562;
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
                    if ((class56.field475[Statics.field562][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field562;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class56.field475[Statics.field562][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field562;
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
                    if ((class56.field475[Statics.field562][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field562;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class56.field475[Statics.field562][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field562;
                        }
                    }
                }
            }
        }
        if (Statics.field2495.field971 >= 0 && Statics.field2495.field918 >= 0 && Statics.field2495.field971 < 13312 && Statics.field2495.field918 < 13312) {
            if ((class56.field475[Statics.field562][Statics.field2495.field971 >> 7][Statics.field2495.field918 >> 7] & 0x4) != 0) {
                var0 = Statics.field562;
            }
            return var0;
        } else {
            return Statics.field562;
        }
    }

    @ObfuscatedName("bi.gl(I)I")
    public static final int method967() {
        if (Statics.field928.field1024) {
            return Statics.field562;
        } else {
            int var0 = method564(Statics.field491, Statics.field94, Statics.field562);
            return var0 - Statics.field56 >= 800 || (class56.field475[Statics.field562][Statics.field491 >> 7][Statics.field94 >> 7] & 0x4) == 0 ? 3 : Statics.field562;
        }
    }

    @ObfuscatedName("fr.gr(I)Z")
    public static boolean method3179() {
        return (field742 & 0x1) != 0;
    }

    @ObfuscatedName("ck.gf(I)Z")
    public static boolean method1940() {
        return (field742 & 0x2) != 0;
    }

    @ObfuscatedName("ed.ge(B)Z")
    public static boolean method3050() {
        return (field742 & 0x8) != 0;
    }

    @ObfuscatedName("fp.gh(Lby;I)Z")
    public static boolean method3274(class67 arg0) {
        if (field742 == 0) {
            return false;
        } else if (Statics.field2495 == arg0) {
            return method3050();
        } else {
            boolean var1 = (field742 & 0x4) != 0;
            return var1 || method3179() && arg0.method1083() || method1940() && arg0.method1058();
        }
    }

    @ObfuscatedName("ii.gq(Lbe;IIIIII)V")
    public static final void method3995(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1066()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1098;
            if (var6.field3465 != null) {
                var6 = var6.method4403();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1227;
        int[] var8 = class90.field1224;
        byte var9 = 0;
        if (arg1 < var7 && field628 == arg0.field922 && method3274((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                method1900(arg0, arg0.field968 + 15);
                class296 var11 = (class296) field674.get(class292.field3642);
                byte var12 = 9;
                var11.method4960(var10.field596.method4815(), field781 + arg2, field722 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field943.method4541()) {
            method1900(arg0, arg0.field968 + 15);
            for (class79 var14 = (class79) arg0.field943.method4492(); var14 != null; var14 = (class79) arg0.field943.method4482()) {
                class71 var15 = var14.method1875(field628);
                if (var15 != null) {
                    class247 var16 = var14.field1093;
                    class325 var17 = var16.method4151();
                    class325 var18 = var16.method4136();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3264;
                    } else {
                        if (var16.field3265 * 2 < var18.field3867) {
                            var19 = var16.field3265;
                        }
                        var20 = var18.field3867 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field628 - var15.field979;
                    int var24 = var15.field982 * var20 / var16.field3264;
                    int var27;
                    if (var15.field980 > var23) {
                        int var25 = var16.field3262 == 0 ? 0 : var23 / var16.field3262 * var16.field3262;
                        int var26 = var15.field981 * var20 / var16.field3264;
                        var27 = (var24 - var26) * var25 / var15.field980 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field980 + var16.field3261 - var23;
                        if (var16.field3259 >= 0) {
                            var21 = (var28 << 8) / (var16.field3261 - var16.field3259);
                        }
                    }
                    if (var15.field982 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field781 > -1) {
                            int var34 = field781 + arg2 - (var20 >> 1);
                            int var35 = field722 + arg3 - var13;
                            class321.method5565(var34, var35, var27, 5, 65280);
                            class321.method5565(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3868;
                        var13 += var30;
                        int var31 = field781 + arg2 - (var20 >> 1);
                        int var32 = field722 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5676(var33, var32, var21);
                            class321.method5559(var33, var32, var29 + var33, var30 + var32);
                            var18.method5676(var33, var32, var21);
                        } else {
                            var17.method5664(var33, var32);
                            class321.method5559(var33, var32, var29 + var33, var30 + var32);
                            var18.method5664(var33, var32);
                        }
                        class321.method5558(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1864()) {
                    var14.method3326();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class67 var37 = (class67) arg0;
            if (var37.field591) {
                return;
            }
            if (var37.field589 != -1 || var37.field590 != -1) {
                method1900(arg0, arg0.field968 + 15);
                if (field781 > -1) {
                    if (var37.field589 != -1) {
                        var36 += 25;
                        Statics.field3937[var37.field589].method5664(field781 + arg2 - 12, field722 + arg3 - var36);
                    }
                    if (var37.field590 != -1) {
                        var36 += 25;
                        Statics.field2082[var37.field590].method5664(field781 + arg2 - 12, field722 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field881 == 10 && field644 == var8[arg1]) {
                method1900(arg0, arg0.field968 + 15);
                if (field781 > -1) {
                    int var38 = Statics.field43[1].field3868 + var36;
                    Statics.field43[1].method5664(field781 + arg2 - 12, field722 + arg3 - var38);
                }
            }
        } else {
            class257 var39 = ((class80) arg0).field1098;
            if (var39.field3465 != null) {
                var39 = var39.method4403();
            }
            if (var39.field3452 >= 0 && var39.field3452 < Statics.field2082.length) {
                method1900(arg0, arg0.field968 + 15);
                if (field781 > -1) {
                    Statics.field2082[var39.field3452].method5664(field781 + arg2 - 12, field722 + arg3 - 30);
                }
            }
            if (field881 == 1 && field643 == field875[arg1 - var7] && field628 % 20 < 10) {
                method1900(arg0, arg0.field968 + 15);
                if (field781 > -1) {
                    Statics.field43[0].method5664(field781 + arg2 - 12, field722 + arg3 - 28);
                }
            }
        }
        if (arg0.field921 != null && (arg1 >= var7 || !arg0.field957 && (field840 == 4 || !arg0.field932 && (field840 == 0 || field840 == 3 || field840 == 1 && ((class67) arg0).method1083())))) {
            method1900(arg0, arg0.field968);
            if (field781 > -1 && field709 < field662) {
                field887[field709] = Statics.field1097.method4952(arg0.field921) / 2;
                field894[field709] = Statics.field1097.field3665;
                field711[field709] = field781;
                field712[field709] = field722;
                field715[field709] = arg0.field935;
                field716[field709] = arg0.field936;
                field717[field709] = arg0.field934;
                field629[field709] = arg0.field921;
                field709++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field978[var40];
            int var42 = arg0.field938[var40];
            class253 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field628) {
                    continue;
                }
                var43 = class253.method1797(arg0.field938[var40]);
                var44 = var43.field3307;
                if (var43 != null && var43.field3318 != null) {
                    var43 = var43.method4228();
                    if (var43 == null) {
                        arg0.field978[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field941[var40];
            class253 var46 = null;
            if (var45 >= 0) {
                var46 = class253.method1797(var45);
                if (var46 != null && var46.field3318 != null) {
                    var46 = var46.method4228();
                }
            }
            if (var41 - var44 <= field628) {
                if (var43 == null) {
                    arg0.field978[var40] = -1;
                } else {
                    method1900(arg0, arg0.field968 / 2);
                    if (field781 > -1) {
                        if (var40 == 1) {
                            field722 -= 20;
                        }
                        if (var40 == 2) {
                            field781 -= 15;
                            field722 -= 10;
                        }
                        if (var40 == 3) {
                            field781 += 15;
                            field722 -= 10;
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
                        class325 var59 = null;
                        class325 var60 = null;
                        class325 var61 = null;
                        class325 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class325 var72 = var43.method4239();
                        if (var72 != null) {
                            var51 = var72.field3867;
                            int var73 = var72.field3868;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3869;
                        }
                        class325 var74 = var43.method4252();
                        if (var74 != null) {
                            var52 = var74.field3867;
                            int var75 = var74.field3868;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3869;
                        }
                        class325 var76 = var43.method4241();
                        if (var76 != null) {
                            var53 = var76.field3867;
                            int var77 = var76.field3868;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3869;
                        }
                        class325 var78 = var43.method4232();
                        if (var78 != null) {
                            var54 = var78.field3867;
                            int var79 = var78.field3868;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3869;
                        }
                        if (var46 != null) {
                            var59 = var46.method4239();
                            if (var59 != null) {
                                var63 = var59.field3867;
                                int var80 = var59.field3868;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3869;
                            }
                            var60 = var46.method4252();
                            if (var60 != null) {
                                var64 = var60.field3867;
                                int var81 = var60.field3868;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3869;
                            }
                            var61 = var46.method4241();
                            if (var61 != null) {
                                var65 = var61.field3867;
                                int var82 = var61.field3868;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3869;
                            }
                            var62 = var46.method4232();
                            if (var62 != null) {
                                var66 = var62.field3867;
                                int var83 = var62.field3868;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3869;
                            }
                        }
                        class295 var84 = var43.method4233();
                        if (var84 == null) {
                            var84 = Statics.field49;
                        }
                        class295 var85;
                        if (var46 == null) {
                            var85 = Statics.field49;
                        } else {
                            var85 = var46.method4233();
                            if (var85 == null) {
                                var85 = Statics.field49;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4249(arg0.field933[var40]);
                        int var91 = var84.method4952(var90);
                        if (var46 != null) {
                            var87 = var46.method4249(arg0.field942[var40]);
                            var89 = var85.method4952(var87);
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
                        int var108 = arg0.field978[var40] - field628;
                        int var109 = var43.field3312 - var43.field3312 * var108 / var43.field3307;
                        int var110 = var43.field3311 * var108 / var43.field3307 + -var43.field3311;
                        int var111 = field781 + arg2 - (var100 >> 1) + var109;
                        int var112 = field722 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3317 + var112 + 15;
                        int var116 = var115 - var84.field3666;
                        int var117 = var84.field3667 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3317 + var112 + 15;
                            int var119 = var118 - var85.field3666;
                            int var120 = var85.field3667 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3308 >= 0) {
                            var123 = (var108 << 8) / (var43.field3307 - var43.field3308);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5676(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5676(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5676(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5676(var101 + var111 - var58, var112, var123);
                            }
                            var84.method4958(var90, var98 + var111, var115, var43.field3306, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5676(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5676(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5676(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5676(var105 + var111 - var70, var112, var123);
                                }
                                var85.method4958(var87, var106 + var111, var118, var46.field3306, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5664(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5664(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5664(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5664(var101 + var111 - var58, var112);
                            }
                            var84.method4957(var90, var98 + var111, var115, var43.field3306 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5664(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5664(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5664(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5664(var105 + var111 - var70, var112);
                                }
                                var85.method4957(var87, var106 + var111, var118, var46.field3306 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.gk(IIIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3) {
        field709 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1227;
        int[] var8 = class90.field1224;
        for (int var9 = 0; var9 < field665 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = field625[var8[var9]];
                if (field749 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field2495 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field634[field875[var9 - var7]];
            }
            method3995(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field885 && var6 != -1) {
            method3995(Statics.field2495, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3995(field625[field749], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field709; var11++) {
            int var12 = field711[var11];
            int var13 = field712[var11];
            int var14 = field887[var11];
            int var15 = field894[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field712[var17] - field894[var17] && var13 - var15 < field712[var17] + 2 && var12 - var14 < field887[var17] + field711[var17] && var12 + var14 > field711[var17] - field887[var17] && field712[var17] - field894[var17] < var13) {
                        var13 = field712[var17] - field894[var17];
                        var16 = true;
                    }
                }
            }
            field781 = field711[var11];
            field722 = field712[var11] = var13;
            String var18 = field629[var11];
            if (field787 == 0) {
                int var19 = 16776960;
                if (field715[var11] < 6) {
                    var19 = field839[field715[var11]];
                }
                if (field715[var11] == 6) {
                    var19 = field778 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field715[var11] == 7) {
                    var19 = field778 % 20 < 10 ? 255 : 65535;
                }
                if (field715[var11] == 8) {
                    var19 = field778 % 20 < 10 ? 45056 : 8454016;
                }
                if (field715[var11] == 9) {
                    int var20 = 150 - field717[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field715[var11] == 10) {
                    int var21 = 150 - field717[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field715[var11] == 11) {
                    int var22 = 150 - field717[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field716[var11] == 0) {
                    Statics.field1097.method4960(var18, field781 + arg0, field722 + arg1, var19, 0);
                }
                if (field716[var11] == 1) {
                    Statics.field1097.method4962(var18, field781 + arg0, field722 + arg1, var19, 0, field778);
                }
                if (field716[var11] == 2) {
                    Statics.field1097.method4963(var18, field781 + arg0, field722 + arg1, var19, 0, field778);
                }
                if (field716[var11] == 3) {
                    Statics.field1097.method4964(var18, field781 + arg0, field722 + arg1, var19, 0, field778, 150 - field717[var11]);
                }
                if (field716[var11] == 4) {
                    int var23 = (150 - field717[var11]) * (Statics.field1097.method4952(var18) + 100) / 150;
                    class321.method5559(field781 + arg0 - 50, arg1, field781 + arg0 + 50, arg1 + arg3);
                    Statics.field1097.method4957(var18, field781 + arg0 + 50 - var23, field722 + arg1, var19, 0);
                    class321.method5558(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field716[var11] == 5) {
                    int var24 = 150 - field717[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class321.method5559(arg0, field722 + arg1 - Statics.field1097.field3665 - 1, arg0 + arg2, field722 + arg1 + 5);
                    Statics.field1097.method4960(var18, field781 + arg0, field722 + arg1 + var25, var19, 0);
                    class321.method5558(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1097.method4960(var18, field781 + arg0, field722 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ek.go(B)V")
    public static final void method3030() {
        field736 = 0;
        int var0 = (Statics.field2495.field971 >> 7) + Statics.field20;
        int var1 = (Statics.field2495.field918 >> 7) + Statics.field553;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field736 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field736 = 1;
        }
        if (field736 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field736 = 0;
        }
    }

    @ObfuscatedName("cl.gg(Lbe;IB)V")
    public static final void method1900(class70 arg0, int arg1) {
        method1883(arg0.field971, arg0.field918, arg1);
    }

    @ObfuscatedName("ct.gv(IIIB)V")
    public static final void method1883(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field781 = -1;
            field722 = -1;
            return;
        }
        int var3 = method564(arg0, arg1, Statics.field562) - arg2;
        int var4 = arg0 - Statics.field491;
        int var5 = var3 - Statics.field56;
        int var6 = arg1 - Statics.field94;
        int var7 = class131.field1752[Statics.field3839];
        int var8 = class131.field1737[Statics.field3839];
        int var9 = class131.field1752[Statics.field1637];
        int var10 = class131.field1737[Statics.field1637];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field781 = field864 * var11 / var15 + field741 / 2;
            field722 = field864 * var14 / var15 + field831 / 2;
        } else {
            field781 = -1;
            field722 = -1;
        }
    }

    @ObfuscatedName("af.gt(IIII)I")
    public static final int method564(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field475[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field476[var5][var3][var4] + class56.field476[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field476[var5][var3][var4 + 1] + class56.field476[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ai.gs(ZLkt;B)V")
    public static final void method696(boolean arg0, class299 arg1) {
        field676 = arg0;
        if (!field676) {
            int var2 = arg1.method5152();
            int var3 = arg1.method5152();
            int var4 = arg1.method5304();
            Statics.field83 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field83[var5][var6] = arg1.method5208();
                }
            }
            Statics.field2381 = new int[var4];
            Statics.field345 = new int[var4];
            Statics.field3492 = new int[var4];
            Statics.field2463 = new byte[var4][];
            Statics.field900 = new byte[var4][];
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
                        Statics.field2381[var8] = var11;
                        Statics.field345[var8] = Statics.field3557.method3843("m" + var9 + "_" + var10);
                        Statics.field3492[var8] = Statics.field3557.method3843("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method245(var2, var3, true);
            return;
        }
        boolean var12 = arg1.method5132() == 1;
        int var13 = arg1.method5304();
        int var14 = arg1.method5097();
        int var15 = arg1.method5304();
        arg1.method5060();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5059(1);
                    if (var19 == 1) {
                        field682[var16][var17][var18] = arg1.method5059(26);
                    } else {
                        field682[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5081();
        Statics.field83 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field83[var20][var21] = arg1.method5208();
            }
        }
        Statics.field2381 = new int[var15];
        Statics.field345 = new int[var15];
        Statics.field3492 = new int[var15];
        Statics.field2463 = new byte[var15][];
        Statics.field900 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field682[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2381[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2381[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field345[var22] = Statics.field3557.method3843("m" + var31 + "_" + var32);
                            Statics.field3492[var22] = Statics.field3557.method3843("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method245(var13, var14, !var12);
    }

    @ObfuscatedName("a.gp(IIZI)V")
    public static final void method245(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1586 == arg0 && Statics.field1304 == arg1) {
            return;
        }
        Statics.field1586 = arg0;
        Statics.field1304 = arg1;
        method178(25);
        method6042(class225.field3005, true);
        int var3 = Statics.field20;
        int var4 = Statics.field553;
        Statics.field20 = (arg0 - 6) * 8;
        Statics.field553 = (arg1 - 6) * 8;
        int var5 = Statics.field20 - var3;
        int var6 = Statics.field553 - var4;
        int var7 = Statics.field20;
        int var8 = Statics.field553;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field634[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field940[var11] -= var5;
                    var10.field974[var11] -= var6;
                }
                var10.field971 -= var5 * 128;
                var10.field918 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field625[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field940[var14] -= var5;
                    var13.field974[var14] -= var6;
                }
                var13.field971 -= var5 * 128;
                var13.field918 -= var6 * 128;
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
                        field820[var25][var21][var22] = field820[var25][var23][var24];
                    } else {
                        field820[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field666.method4550(); var26 != null; var26 = (class69) field666.method4573()) {
            var26.field903 -= var5;
            var26.field916 -= var6;
            if (var26.field903 < 0 || var26.field916 < 0 || var26.field903 >= 104 || var26.field916 >= 104) {
                var26.method3326();
            }
        }
        if (field854 != 0) {
            field854 -= var5;
            field855 -= var6;
        }
        field862 = 0;
        field848 = false;
        Statics.field491 -= var5 << 7;
        Statics.field94 -= var6 << 7;
        Statics.field1215 -= var5 << 7;
        Statics.field2466 -= var6 << 7;
        field849 = -1;
        field755.method4544();
        field752.method4544();
        for (int var27 = 0; var27 < 4; var27++) {
            field659[var27].method3276();
        }
    }

    @ObfuscatedName("ht.gc(ZI)V")
    public static final void method3817(boolean arg0) {
        method3014();
        field669.field1285++;
        if (field669.field1285 < 50 && !arg0) {
            return;
        }
        field669.field1285 = 0;
        if (field773 || field669.method2079() == null) {
            return;
        }
        class188 var1 = class188.method1894(class184.field2186, field669.field1279);
        field669.method2075(var1);
        try {
            field669.method2074();
        } catch (IOException var3) {
            field773 = true;
        }
    }

    @ObfuscatedName("l.gd(II)V")
    public static final void method34(int arg0) {
        int[] var1 = Statics.field535.field3873;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field475[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field178.method2869(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class56.field475[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field178.method2869(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field535.method5661();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field475[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method4223(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class56.field475[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method4223(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field850 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field178.method2864(Statics.field562, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method1950(var13);
                    int var16 = class254.method3035(var15).field3350;
                    if (var16 >= 0) {
                        field868[field850] = class242.method481(var16).method4033(false);
                        field851[field850] = var11;
                        field633[field850] = var12;
                        field850++;
                    }
                }
            }
        }
        Statics.field394.method5628();
    }

    @ObfuscatedName("client.gi(Lcx;I)Z")
    public final boolean method1131(class96 arg0) {
        class305 var2 = arg0.method2079();
        class299 var3 = arg0.field1283;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1281 == null) {
                if (arg0.field1282) {
                    if (!var2.method3257(1)) {
                        return false;
                    }
                    var2.method3247(arg0.field1283.field3694, 0, 1);
                    arg0.field1284 = 0;
                    arg0.field1282 = false;
                }
                var3.field3696 = 0;
                if (var3.method5055()) {
                    if (!var2.method3257(1)) {
                        return false;
                    }
                    var2.method3247(arg0.field1283.field3694, 1, 1);
                    arg0.field1284 = 0;
                }
                arg0.field1282 = true;
                class183[] var4 = class183.method3392();
                int var5 = var3.method5056();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3696);
                }
                arg0.field1281 = var4[var5];
                arg0.field1277 = arg0.field1281.field2184;
            }
            if (arg0.field1277 == -1) {
                if (!var2.method3257(1)) {
                    return false;
                }
                arg0.method2079().method3247(var3.field3694, 0, 1);
                arg0.field1277 = var3.field3694[0] & 0xFF;
            }
            if (arg0.field1277 == -2) {
                if (!var2.method3257(2)) {
                    return false;
                }
                arg0.method2079().method3247(var3.field3694, 0, 2);
                var3.field3696 = 0;
                arg0.field1277 = var3.method5304();
            }
            if (!var2.method3257(arg0.field1277)) {
                return false;
            }
            var3.field3696 = 0;
            var2.method3247(var3.field3694, 0, arg0.field1277);
            arg0.field1284 = 0;
            field673.method4636();
            arg0.field1288 = arg0.field1287;
            arg0.field1287 = arg0.field1275;
            arg0.field1275 = arg0.field1281;
            if (class183.field2173 == arg0.field1281) {
                Statics.field2355 = class310.method3040(var3.method5103());
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2105 == arg0.field1281) {
                method689(class186.field2298);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2101 == arg0.field1281) {
                Statics.field287 = var3.method5185();
                Statics.field509 = var3.method5134();
                for (int var6 = Statics.field287; var6 < Statics.field287 + 8; var6++) {
                    for (int var7 = Statics.field509; var7 < Statics.field509 + 8; var7++) {
                        if (field820[Statics.field562][var6][var7] != null) {
                            field820[Statics.field562][var6][var7] = null;
                            method501(var6, var7);
                        }
                    }
                }
                for (class69 var8 = (class69) field666.method4550(); var8 != null; var8 = (class69) field666.method4573()) {
                    if (var8.field903 >= Statics.field287 && var8.field903 < Statics.field287 + 8 && var8.field916 >= Statics.field509 && var8.field916 < Statics.field509 + 8 && Statics.field562 == var8.field913) {
                        var8.field906 = 0;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2114 == arg0.field1281) {
                field641 = var3.method5152() * 30;
                field671 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2110 == arg0.field1281) {
                int var9 = var3.method5132();
                String var10 = var3.method5112();
                int var11 = var3.method5134();
                if (var9 >= 1 && var9 <= 8) {
                    if (var10.equalsIgnoreCase(class225.field2900)) {
                        var10 = null;
                    }
                    field681[var9 - 1] = var10;
                    field706[var9 - 1] = var11 == 0;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1281) {
                method689(class186.field2304);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2151 == arg0.field1281) {
                int var12 = var3.method5103();
                if (var3.method5103() == 0) {
                    field891[var12] = new class10();
                    var3.field3696 += 18;
                } else {
                    var3.field3696--;
                    field891[var12] = new class10(var3, false);
                }
                field867 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1281) {
                int var13 = var3.method5153();
                class218 var14 = class218.method1101(var13);
                var14.field2591 = 3;
                var14.field2581 = Statics.field2495.field588.method3708();
                method469(var14);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2107 == arg0.field1281) {
                int var15 = var3.method5103();
                int var16 = var3.method5141();
                int var17 = var3.method5225();
                class62 var18 = (class62) field899.method5524((long) var17);
                if (var18 != null) {
                    method4196(var18, var18.field540 != var16);
                }
                method5471(var17, var16, var15);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1281) {
                method689(class186.field2302);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1281) {
                int var19 = var3.method5117();
                boolean var20 = var3.method5103() == 1;
                String var21 = "";
                boolean var22 = false;
                if (var20) {
                    var21 = var3.method5112();
                    if (Statics.field2683.method1688(new class283(var21, Statics.field22))) {
                        var22 = true;
                    }
                }
                String var23 = var3.method5112();
                if (!var22) {
                    class92.method500(var19, var21, var23);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1281) {
                int var24 = var3.method5103();
                int var25 = var3.method5103();
                int var26 = var3.method5103();
                int var27 = var3.method5103();
                field750[var24] = true;
                field780[var24] = var25;
                field888[var24] = var26;
                field872[var24] = var27;
                field800[var24] = 0;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1281) {
                int var28 = var3.method5208();
                String var29 = var3.method5112();
                class218 var30 = class218.method1101(var28);
                if (!var29.equals(var30.field2600)) {
                    var30.field2600 = var29;
                    method469(var30);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1281) {
                Statics.method234();
                field870 = var3.method5106();
                field671 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1281) {
                class72 var31 = new class72();
                var31.field1000 = var3.method5112();
                var31.field993 = var3.method5304();
                int var32 = var3.method5208();
                var31.field999 = var32;
                method178(45);
                var2.method3242();
                Object var33 = null;
                class86.method2109(var31);
                arg0.field1281 = null;
                return false;
            }
            if (class183.field2181 == arg0.field1281) {
                int var34 = var3.method5153();
                int var35 = var3.method5304();
                int var36 = var35 >> 10 & 0x1F;
                int var37 = var35 >> 5 & 0x1F;
                int var38 = var35 & 0x1F;
                int var39 = (var38 << 3) + (var36 << 19) + (var37 << 11);
                class218 var40 = class218.method1101(var34);
                if (var40.field2670 != var39) {
                    var40.field2670 = var39;
                    method469(var40);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2180 == arg0.field1281) {
                boolean var41 = var3.method5185() == 1;
                int var42 = var3.method5218();
                class218 var43 = class218.method1101(var42);
                if (var43.field2559 != var41) {
                    var43.field2559 = var41;
                    method469(var43);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1281) {
                int var44 = var3.method5304();
                int var45 = var3.method5103();
                int var46 = var3.method5304();
                method3379(var44, var45, var46);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2100 == arg0.field1281) {
                int var47 = arg0.field1277 + var3.field3696;
                int var48 = var3.method5304();
                int var49 = var3.method5304();
                if (field783 != var48) {
                    field783 = var48;
                    this.method1135(false);
                    method684(field783);
                    class77.method2626(field783);
                    for (int var50 = 0; var50 < 100; var50++) {
                        field828[var50] = true;
                    }
                }
                while (var49-- > 0) {
                    int var51 = var3.method5208();
                    int var52 = var3.method5304();
                    int var53 = var3.method5103();
                    class62 var54 = (class62) field899.method5524((long) var51);
                    if (var54 != null && var54.field540 != var52) {
                        method4196(var54, true);
                        var54 = null;
                    }
                    if (var54 == null) {
                        var54 = method5471(var51, var52, var53);
                    }
                    var54.field539 = true;
                }
                for (class62 var55 = (class62) field899.method5516(); var55 != null; var55 = (class62) field899.method5518()) {
                    if (var55.field539) {
                        var55.field539 = false;
                    } else {
                        method4196(var55, true);
                    }
                }
                field705 = new class318(512);
                while (var3.field3696 < var47) {
                    int var56 = var3.method5208();
                    int var57 = var3.method5304();
                    int var58 = var3.method5304();
                    int var59 = var3.method5208();
                    for (int var60 = var57; var60 <= var58; var60++) {
                        long var61 = ((long) var56 << 32) + (long) var60;
                        field705.method5517(new class180(var59), var61);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1281) {
                field840 = var3.method5103();
                field841 = var3.method5132();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1281) {
                method4062(false, var3);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2097 == arg0.field1281) {
                method689(class186.field2300);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1281) {
                field856 = var3.method5103();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1281) {
                Statics.field509 = var3.method5132();
                Statics.field287 = var3.method5103();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2122 == arg0.field1281) {
                method689(class186.field2299);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1281) {
                int var63 = var3.method5208();
                class62 var64 = (class62) field899.method5524((long) var63);
                if (var64 != null) {
                    method4196(var64, true);
                }
                if (field789 != null) {
                    method469(field789);
                    field789 = null;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1281) {
                int var65 = var3.method5097();
                int var66 = var3.method5218();
                class213.field2493[var65] = var66;
                if (class213.field2494[var65] != var66) {
                    class213.field2494[var65] = var66;
                }
                Statics.method1974(var65);
                field809[++field810 - 1 & 0x1F] = var65;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1281) {
                int var67 = var3.method5153();
                int var68 = var3.method5106();
                int var69 = var3.method5144();
                class218 var70 = class218.method1101(var67);
                if (var70.field2548 != var68 || var70.field2547 != var69 || var70.field2575 != 0 || var70.field2556 != 0) {
                    var70.field2548 = var68;
                    var70.field2547 = var69;
                    var70.field2575 = 0;
                    var70.field2556 = 0;
                    method469(var70);
                    this.method1136(var70);
                    if (var70.field2541 == 0) {
                        method3414(Statics.field3631[var67 >> 16], var70, false);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1281) {
                field854 = var3.method5103();
                if (field854 == 255) {
                    field854 = 0;
                }
                field855 = var3.method5103();
                if (field855 == 255) {
                    field855 = 0;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1281) {
                int var71 = var3.method5141();
                if (var71 == 65535) {
                    var71 = -1;
                }
                method591(var71);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1281) {
                int var72 = var3.method5097();
                if (var72 == 65535) {
                    var72 = -1;
                }
                int var73 = var3.method5146();
                method968(var72, var73);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1281) {
                int var74 = var3.method5208();
                int var75 = var3.method5218();
                int var76 = var3.method5141();
                if (var76 == 65535) {
                    var76 = -1;
                }
                class218 var77 = class218.method1101(var74);
                if (var77.field2538) {
                    var77.field2665 = var76;
                    var77.field2666 = var75;
                    class255 var79 = class255.method1055(var76);
                    var77.field2590 = var79.field3414;
                    var77.field2629 = var79.field3391;
                    var77.field2592 = var79.field3392;
                    var77.field2588 = var79.field3373;
                    var77.field2589 = var79.field3422;
                    var77.field2660 = var79.field3389;
                    if (var79.field3395 == 1) {
                        var77.field2598 = 1;
                    } else {
                        var77.field2598 = 2;
                    }
                    if (var77.field2583 > 0) {
                        var77.field2660 = var77.field2660 * 32 / var77.field2583;
                    } else if (var77.field2550 > 0) {
                        var77.field2660 = var77.field2660 * 32 / var77.field2550;
                    }
                    method469(var77);
                } else if (var76 == -1) {
                    var77.field2591 = 0;
                    arg0.field1281 = null;
                    return true;
                } else {
                    class255 var78 = class255.method1055(var76);
                    var77.field2591 = 4;
                    var77.field2581 = var76;
                    var77.field2590 = var78.field3414;
                    var77.field2629 = var78.field3391;
                    var77.field2660 = var78.field3389 * 100 / var75;
                    method469(var77);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1281) {
                var3.field3696 += 28;
                if (var3.method5128()) {
                    method3394(var3, var3.field3696 - 28);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1281) {
                int var80 = var3.method5153();
                int var81 = var3.method5222();
                class218 var82 = class218.method1101(var80);
                if (var82.field2586 != var81 || var81 == -1) {
                    var82.field2586 = var81;
                    var82.field2667 = 0;
                    var82.field2668 = 0;
                    method469(var82);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1281) {
                class97.method594(var3, arg0.field1277);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1281) {
                byte[] var83 = new byte[arg0.field1277];
                var3.method5057(var83, 0, var83.length);
                class300 var84 = new class300(var83);
                String var85 = var84.method5112();
                class52.method183(var85, true, false);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2127 == arg0.field1281) {
                method689(class186.field2305);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1281) {
                method626();
                arg0.field1281 = null;
                return false;
            }
            if (class183.field2120 == arg0.field1281) {
                int var86 = var3.method5208();
                int var87 = var3.method5225();
                class62 var88 = (class62) field899.method5524((long) var87);
                class62 var89 = (class62) field899.method5524((long) var86);
                if (var89 != null) {
                    method4196(var89, var88 == null || var88.field540 != var89.field540);
                }
                if (var88 != null) {
                    var88.method3326();
                    field899.method5517(var88, (long) var86);
                }
                class218 var90 = class218.method1101(var87);
                if (var90 != null) {
                    method469(var90);
                }
                class218 var91 = class218.method1101(var86);
                if (var91 != null) {
                    method469(var91);
                    method3414(Statics.field3631[var91.field2571 >>> 16], var91, true);
                }
                if (field783 != -1) {
                    method233(field783, 1);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2113 == arg0.field1281) {
                field848 = true;
                Statics.field1991 = var3.method5103();
                Statics.field1038 = var3.method5103();
                Statics.field2028 = var3.method5304();
                Statics.field302 = var3.method5103();
                Statics.field212 = var3.method5103();
                if (Statics.field212 >= 100) {
                    Statics.field491 = Statics.field1991 * 128 + 64;
                    Statics.field94 = Statics.field1038 * 128 + 64;
                    Statics.field56 = method564(Statics.field491, Statics.field94, Statics.field562) - Statics.field2028;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1281) {
                Statics.field287 = var3.method5185();
                Statics.field509 = var3.method5103();
                while (var3.field3696 < arg0.field1277) {
                    int var92 = var3.method5103();
                    class186 var93 = class186.method102()[var92];
                    method689(var93);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1281) {
                Statics.field2683.method1725();
                field816 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1281) {
                if (arg0.field1277 == 0) {
                    Statics.field73 = null;
                } else {
                    if (Statics.field73 == null) {
                        Statics.field73 = new class285(Statics.field22, Statics.field2505);
                    }
                    Statics.field73.method4843(var3);
                }
                method1050();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2098 == arg0.field1281) {
                method689(class186.field2301);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2106 == arg0.field1281) {
                String var94 = var3.method5112();
                Object[] var95 = new Object[var94.length() + 1];
                for (int var96 = var94.length() - 1; var96 >= 0; var96--) {
                    if (var94.charAt(var96) == 's') {
                        var95[var96 + 1] = var3.method5112();
                    } else {
                        var95[var96 + 1] = Integer.valueOf(var3.method5208());
                    }
                }
                var95[0] = Integer.valueOf(var3.method5208());
                class63 var97 = new class63();
                var97.field549 = var95;
                class77.method1954(var97);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2182 == arg0.field1281) {
                int var98 = var3.method5304();
                int var99 = var3.method5208();
                class218 var100 = class218.method1101(var99);
                if (var100 != null && var100.field2541 == 0) {
                    if (var98 > var100.field2563 - var100.field2593) {
                        var98 = var100.field2563 - var100.field2593;
                    }
                    if (var98 < 0) {
                        var98 = 0;
                    }
                    if (var100.field2561 != var98) {
                        var100.field2561 = var98;
                        method469(var100);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2108 == arg0.field1281) {
                method689(class186.field2303);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1281) {
                for (int var101 = 0; var101 < class213.field2494.length; var101++) {
                    if (class213.field2494[var101] != class213.field2493[var101]) {
                        class213.field2494[var101] = class213.field2493[var101];
                        Statics.method1974(var101);
                        field809[++field810 - 1 & 0x1F] = var101;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1281) {
                int var102 = var3.method5097();
                field783 = var102;
                this.method1135(false);
                method684(var102);
                class77.method2626(field783);
                for (int var103 = 0; var103 < 100; var103++) {
                    field828[var103] = true;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1281) {
                method4062(true, var3);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2104 == arg0.field1281) {
                Statics.method234();
                int var104 = var3.method5103();
                int var105 = var3.method5103();
                int var106 = var3.method5225();
                field756[var105] = var106;
                field714[var105] = var104;
                field672[var105] = 1;
                for (int var107 = 0; var107 < 98; var107++) {
                    if (var106 >= class222.field2719[var107]) {
                        field672[var105] = var107 + 2;
                    }
                }
                field813[++field814 - 1 & 0x1F] = var105;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2165 == arg0.field1281) {
                Statics.field2683.field1034.method4713(var3, arg0.field1277);
                method1579();
                field816 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1281) {
                field848 = true;
                Statics.field335 = var3.method5103();
                Statics.field500 = var3.method5103();
                Statics.field1243 = var3.method5304();
                Statics.field582 = var3.method5103();
                Statics.field286 = var3.method5103();
                if (Statics.field286 >= 100) {
                    int var108 = Statics.field335 * 128 + 64;
                    int var109 = Statics.field500 * 128 + 64;
                    int var110 = method564(var108, var109, Statics.field562) - Statics.field1243;
                    int var111 = var108 - Statics.field491;
                    int var112 = var110 - Statics.field56;
                    int var113 = var109 - Statics.field94;
                    int var114 = (int) Math.sqrt((double) (var111 * var111 + var113 * var113));
                    Statics.field3839 = (int) (Math.atan2((double) var112, (double) var114) * 325.949D) & 0x7FF;
                    Statics.field1637 = (int) (Math.atan2((double) var111, (double) var113) * -325.949D) & 0x7FF;
                    if (Statics.field3839 < 128) {
                        Statics.field3839 = 128;
                    }
                    if (Statics.field3839 > 383) {
                        Statics.field3839 = 383;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1281) {
                field881 = var3.method5103();
                if (field881 == 1) {
                    field643 = var3.method5304();
                }
                if (field881 >= 2 && field881 <= 6) {
                    if (field881 == 2) {
                        field768 = 64;
                        field826 = 64;
                    }
                    if (field881 == 3) {
                        field768 = 0;
                        field826 = 64;
                    }
                    if (field881 == 4) {
                        field768 = 128;
                        field826 = 64;
                    }
                    if (field881 == 5) {
                        field768 = 64;
                        field826 = 0;
                    }
                    if (field881 == 6) {
                        field768 = 64;
                        field826 = 128;
                    }
                    field881 = 2;
                    field645 = var3.method5304();
                    field646 = var3.method5304();
                    field647 = var3.method5103();
                }
                if (field881 == 10) {
                    field644 = var3.method5304();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2103 == arg0.field1281) {
                Statics.method234();
                field790 = var3.method5103();
                field671 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1281) {
                method3338(var3.method5112());
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1281) {
                method696(true, arg0.field1283);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1281) {
                String var115 = var3.method5112();
                long var116 = (long) var3.method5304();
                long var118 = (long) var3.method5107();
                class229 var120 = (class229) class196.method3332(class229.method3710(), var3.method5103());
                long var121 = (var116 << 32) + var118;
                boolean var123 = false;
                for (int var124 = 0; var124 < 100; var124++) {
                    if (field843[var124] == var121) {
                        var123 = true;
                        break;
                    }
                }
                if (Statics.field2683.method1688(new class283(var115, Statics.field22))) {
                    var123 = true;
                }
                if (!var123 && field736 == 0) {
                    field843[field844] = var121;
                    field844 = (field844 + 1) % 100;
                    String var125 = class296.method4968(class291.method3355(class211.method46(var3)));
                    byte var126;
                    if (var120.field3069) {
                        var126 = 7;
                    } else {
                        var126 = 3;
                    }
                    if (var120.field3068 == -1) {
                        class92.method500(var126, var115, var125);
                    } else {
                        class92.method500(var126, class82.method3819(var120.field3068) + var115, var125);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1281) {
                method689(class186.field2297);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1281) {
                int var127 = var3.method5103();
                method2107(var127);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1281) {
                byte var128 = var3.method5272();
                int var129 = var3.method5097();
                class213.field2493[var129] = var128;
                if (class213.field2494[var129] != var128) {
                    class213.field2494[var129] = var128;
                }
                Statics.method1974(var129);
                field809[++field810 - 1 & 0x1F] = var129;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1281) {
                int var130 = var3.method5208();
                if (field689 != var130) {
                    field689 = var130;
                    method130();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2109 == arg0.field1281) {
                String var131 = var3.method5112();
                long var132 = var3.method5143();
                long var134 = (long) var3.method5304();
                long var136 = (long) var3.method5107();
                class229 var138 = (class229) class196.method3332(class229.method3710(), var3.method5103());
                long var139 = (var134 << 32) + var136;
                boolean var141 = false;
                for (int var142 = 0; var142 < 100; var142++) {
                    if (field843[var142] == var139) {
                        var141 = true;
                        break;
                    }
                }
                if (var138.field3070 && Statics.field2683.method1688(new class283(var131, Statics.field22))) {
                    var141 = true;
                }
                if (!var141 && field736 == 0) {
                    field843[field844] = var139;
                    field844 = (field844 + 1) % 100;
                    String var143 = class296.method4968(class291.method3355(class211.method46(var3)));
                    if (var138.field3068 == -1) {
                        class92.method3118(9, var131, var143, class289.method3815(var132));
                    } else {
                        class92.method3118(9, class82.method3819(var138.field3068) + var131, var143, class289.method3815(var132));
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1281) {
                for (int var144 = 0; var144 < Statics.field2057; var144++) {
                    class241 var145 = Statics.method462(var144);
                    if (var145 != null) {
                        class213.field2493[var144] = 0;
                        class213.field2494[var144] = 0;
                    }
                }
                Statics.method234();
                field810 += 32;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1281) {
                if (field783 != -1) {
                    method233(field783, 0);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1281) {
                class90.method3380(var3, arg0.field1277);
                method21();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1281) {
                field848 = false;
                for (int var146 = 0; var146 < 5; var146++) {
                    field750[var146] = false;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1281) {
                int var147 = var3.method5208();
                int var148 = var3.method5304();
                if (var147 < -70000) {
                    var148 += 32768;
                }
                class218 var149;
                if (var147 >= 0) {
                    var149 = class218.method1101(var147);
                } else {
                    var149 = null;
                }
                if (var149 != null) {
                    for (int var150 = 0; var150 < var149.field2663.length; var150++) {
                        var149.field2663[var150] = 0;
                        var149.field2664[var150] = 0;
                    }
                }
                class60.method3801(var148);
                int var151 = var3.method5304();
                for (int var152 = 0; var152 < var151; var152++) {
                    int var153 = var3.method5097();
                    int var154 = var3.method5134();
                    if (var154 == 255) {
                        var154 = var3.method5153();
                    }
                    if (var149 != null && var152 < var149.field2663.length) {
                        var149.field2663[var152] = var153;
                        var149.field2664[var152] = var154;
                    }
                    class60.method272(var148, var152, var153 - 1, var154);
                }
                if (var149 != null) {
                    method469(var149);
                }
                Statics.method234();
                field811[++field812 - 1 & 0x1F] = var148 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1281) {
                method696(false, arg0.field1283);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1281) {
                int var155 = var3.method5103();
                method182(var155);
                arg0.field1281 = null;
                return false;
            }
            if (class183.field2145 == arg0.field1281) {
                int var156 = var3.method5141();
                int var157 = var3.method5153();
                class218 var158 = class218.method1101(var157);
                if (var158.field2591 != 2 || var158.field2581 != var156) {
                    var158.field2591 = 2;
                    var158.field2581 = var156;
                    method469(var158);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1281) {
                int var159 = var3.method5097();
                int var160 = var3.method5097();
                int var161 = var3.method5304();
                int var162 = var3.method5225();
                class218 var163 = class218.method1101(var162);
                if (var163.field2590 != var159 || var163.field2629 != var161 || var163.field2660 != var160) {
                    var163.field2590 = var159;
                    var163.field2629 = var161;
                    var163.field2660 = var160;
                    method469(var163);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1281) {
                int var164 = var3.method5208();
                int var165 = var3.method5208();
                int var166 = class54.method695();
                class188 var167 = class188.method1894(class184.field2267, field669.field1279);
                var167.field2313.method5129(field451);
                var167.field2313.method5129(var166);
                var167.field2313.method5148(var164);
                var167.field2313.method5149(var165);
                field669.method2075(var167);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1281) {
                int var168 = var3.method5141();
                int var169 = var3.method5208();
                int var170 = var3.method5141();
                class218 var171 = class218.method1101(var169);
                var171.field2595 = (var170 << 16) + var168;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2129 == arg0.field1281) {
                int var172 = var3.method5141();
                if (var172 == 65535) {
                    var172 = -1;
                }
                int var173 = var3.method5225();
                int var174 = var3.method5152();
                if (var174 == 65535) {
                    var174 = -1;
                }
                int var175 = var3.method5153();
                for (int var176 = var174; var176 <= var172; var176++) {
                    long var177 = ((long) var175 << 32) + (long) var176;
                    class181 var179 = field705.method5524(var177);
                    if (var179 != null) {
                        var179.method3326();
                    }
                    field705.method5517(new class180(var173), var177);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1281) {
                method689(class186.field2306);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2102 == arg0.field1281) {
                int var180 = var3.method5208();
                int var181 = var3.method5304();
                if (var180 < -70000) {
                    var181 += 32768;
                }
                class218 var182;
                if (var180 >= 0) {
                    var182 = class218.method1101(var180);
                } else {
                    var182 = null;
                }
                while (var3.field3696 < arg0.field1277) {
                    int var183 = var3.method5117();
                    int var184 = var3.method5304();
                    int var185 = 0;
                    if (var184 != 0) {
                        var185 = var3.method5103();
                        if (var185 == 255) {
                            var185 = var3.method5208();
                        }
                    }
                    if (var182 != null && var183 >= 0 && var183 < var182.field2663.length) {
                        var182.field2663[var183] = var184;
                        var182.field2664[var183] = var185;
                    }
                    class60.method272(var181, var183, var184 - 1, var185);
                }
                if (var182 != null) {
                    method469(var182);
                }
                Statics.method234();
                field811[++field812 - 1 & 0x1F] = var181 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2111 == arg0.field1281) {
                if (Statics.field73 != null) {
                    Statics.field73.method4860(var3);
                }
                method1050();
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1281) {
                boolean var186 = var3.method5110();
                if (!var186) {
                    Statics.field1134 = null;
                } else if (Statics.field1134 == null) {
                    Statics.field1134 = new class238();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2099 == arg0.field1281) {
                int var187 = var3.method5141();
                class60.method3053(var187);
                field811[++field812 - 1 & 0x1F] = var187 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1281) {
                int var188 = var3.method5153();
                int var189 = var3.method5152();
                class218 var190 = class218.method1101(var188);
                if (var190.field2591 != 1 || var190.field2581 != var189) {
                    var190.field2591 = 1;
                    var190.field2581 = var189;
                    method469(var190);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1281) {
                Statics.field2683.method1699(var3, arg0.field1277);
                field816 = field808;
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1281) {
                int var191 = var3.method5218();
                class218 var192 = class218.method1101(var191);
                for (int var193 = 0; var193 < var192.field2663.length; var193++) {
                    var192.field2663[var193] = -1;
                    var192.field2663[var193] = 0;
                }
                method469(var192);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2117 == arg0.field1281) {
                for (int var194 = 0; var194 < field625.length; var194++) {
                    if (field625[var194] != null) {
                        field625[var194].field950 = -1;
                    }
                }
                for (int var195 = 0; var195 < field634.length; var195++) {
                    if (field634[var195] != null) {
                        field634[var195].field950 = -1;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2112 == arg0.field1281) {
                String var196 = var3.method5112();
                String var197 = class296.method4968(class291.method3355(class211.method46(var3)));
                class92.method500(6, var196, var197);
                arg0.field1281 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1281) {
                boolean var198 = var3.method5103() == 1;
                if (var198) {
                    Statics.field26 = Statics.method2303() - var3.method5143();
                    Statics.field1289 = new class7(var3, true);
                } else {
                    Statics.field1289 = null;
                }
                field819 = field808;
                arg0.field1281 = null;
                return true;
            }
            class341.method3361("" + (arg0.field1281 == null ? -1 : arg0.field1281.field2115) + class82.field1119 + (arg0.field1287 == null ? -1 : arg0.field1287.field2115) + class82.field1119 + (arg0.field1288 == null ? -1 : arg0.field1288.field2115) + class82.field1119 + arg0.field1277, (Throwable) null);
            method626();
        } catch (IOException var203) {
            method3346();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1281 == null ? -1 : arg0.field1281.field2115) + class82.field1119 + (arg0.field1287 == null ? -1 : arg0.field1287.field2115) + class82.field1119 + (arg0.field1288 == null ? -1 : arg0.field1288.field2115) + class82.field1119 + arg0.field1277 + class82.field1119 + (Statics.field20 + Statics.field2495.field940[0]) + class82.field1119 + (Statics.field553 + Statics.field2495.field974[0]) + class82.field1119;
            for (int var202 = 0; var202 < arg0.field1277 && var202 < 50; var202++) {
                var201 = var201 + var3.field3694[var202] + class82.field1119;
            }
            class341.method3361(var201, var204);
            method626();
        }
        return true;
    }

    @ObfuscatedName("ai.gb(Lgn;I)V")
    public static final void method689(class186 arg0) {
        class299 var1 = field669.field1283;
        if (class186.field2300 == arg0) {
            int var2 = var1.method5304();
            int var3 = var1.method5134();
            int var4 = (var3 >> 4 & 0x7) + Statics.field287;
            int var5 = (var3 & 0x7) + Statics.field509;
            int var6 = var1.method5097();
            int var7 = var1.method5134();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                int var8 = var4 * 128 + 64;
                int var9 = var5 * 128 + 64;
                class78 var10 = new class78(var2, Statics.field562, var8, var9, method564(var8, var9, Statics.field562) - var7, var6, field628);
                field755.method4572(var10);
            }
        } else if (class186.field2304 == arg0) {
            int var11 = var1.method5103();
            int var12 = (var11 >> 4 & 0x7) + Statics.field287;
            int var13 = (var11 & 0x7) + Statics.field509;
            int var14 = var1.method5132();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field683[var15];
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                method950(Statics.field562, var12, var13, var17, -1, var15, var16, 0, -1);
            }
        } else if (class186.field2297 == arg0) {
            int var18 = var1.method5134();
            int var19 = var1.method5144();
            byte var20 = var1.method5272();
            byte var21 = var1.method5272();
            int var22 = var1.method5132();
            int var23 = (var22 >> 4 & 0x7) + Statics.field287;
            int var24 = (var22 & 0x7) + Statics.field509;
            int var25 = var1.method5134() * 4;
            int var26 = var1.method5152();
            int var27 = var1.method5097();
            int var28 = var1.method5103() * 4;
            int var29 = var1.method5152();
            int var30 = var1.method5103();
            int var31 = var21 + var23;
            int var32 = var20 + var24;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var26 != 65535) {
                int var33 = var23 * 128 + 64;
                int var34 = var24 * 128 + 64;
                int var35 = var31 * 128 + 64;
                int var36 = var32 * 128 + 64;
                class87 var37 = new class87(var26, Statics.field562, var33, var34, method564(var33, var34, Statics.field562) - var28, field628 + var29, field628 + var27, var30, var18, var19, var25);
                var37.method1932(var35, var36, method564(var35, var36, Statics.field562) - var25, field628 + var29);
                field752.method4572(var37);
            }
        } else if (class186.field2302 == arg0) {
            int var38 = var1.method5152();
            int var39 = var1.method5185();
            int var40 = (var39 >> 4 & 0x7) + Statics.field287;
            int var41 = (var39 & 0x7) + Statics.field509;
            int var42 = var1.method5134();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field683[var43];
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                method950(Statics.field562, var40, var41, var45, var38, var43, var44, 0, -1);
            }
        } else if (class186.field2305 == arg0) {
            int var46 = var1.method5152();
            int var47 = var1.method5132();
            int var48 = (var47 >> 4 & 0x7) + Statics.field287;
            int var49 = (var47 & 0x7) + Statics.field509;
            int var50 = var1.method5132();
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = field683[var51];
            if (var48 >= 0 && var49 >= 0 && var48 < 103 && var49 < 103) {
                if (var53 == 0) {
                    class137 var54 = Statics.field178.method2857(Statics.field562, var48, var49);
                    if (var54 != null) {
                        int var55 = class129.method1950(var54.field1845);
                        if (var51 == 2) {
                            var54.field1843 = new class94(var55, 2, var52 + 4, Statics.field562, var48, var49, var46, false, var54.field1843);
                            var54.field1844 = new class94(var55, 2, var52 + 1 & 0x3, Statics.field562, var48, var49, var46, false, var54.field1844);
                        } else {
                            var54.field1843 = new class94(var55, var51, var52, Statics.field562, var48, var49, var46, false, var54.field1843);
                        }
                    }
                }
                if (var53 == 1) {
                    class142 var56 = Statics.field178.method2983(Statics.field562, var48, var49);
                    if (var56 != null) {
                        int var57 = class129.method1950(var56.field1881);
                        if (var51 == 4 || var51 == 5) {
                            var56.field1893 = new class94(var57, 4, var52, Statics.field562, var48, var49, var46, false, var56.field1893);
                        } else if (var51 == 6) {
                            var56.field1893 = new class94(var57, 4, var52 + 4, Statics.field562, var48, var49, var46, false, var56.field1893);
                        } else if (var51 == 7) {
                            var56.field1893 = new class94(var57, 4, (var52 + 2 & 0x3) + 4, Statics.field562, var48, var49, var46, false, var56.field1893);
                        } else if (var51 == 8) {
                            var56.field1893 = new class94(var57, 4, var52 + 4, Statics.field562, var48, var49, var46, false, var56.field1893);
                            var56.field1889 = new class94(var57, 4, (var52 + 2 & 0x3) + 4, Statics.field562, var48, var49, var46, false, var56.field1889);
                        }
                    }
                }
                if (var53 == 2) {
                    class143 var58 = Statics.field178.method2859(Statics.field562, var48, var49);
                    if (var51 == 11) {
                        var51 = 10;
                    }
                    if (var58 != null) {
                        var58.field1904 = new class94(class129.method1950(var58.field1906), var51, var52, Statics.field562, var48, var49, var46, false, var58.field1904);
                    }
                }
                if (var53 == 3) {
                    class124 var59 = Statics.field178.method2858(Statics.field562, var48, var49);
                    if (var59 != null) {
                        var59.field1582 = new class94(class129.method1950(var59.field1587), 22, var52, Statics.field562, var48, var49, var46, false, var59.field1582);
                    }
                }
            }
        } else {
            if (class186.field2298 == arg0) {
                byte var60 = var1.method5272();
                int var61 = var1.method5304();
                byte var62 = var1.method5135();
                byte var63 = var1.method5272();
                int var64 = var1.method5152();
                byte var65 = var1.method5136();
                int var66 = var1.method5141();
                int var67 = var1.method5152();
                int var68 = var1.method5103();
                int var69 = (var68 >> 4 & 0x7) + Statics.field287;
                int var70 = (var68 & 0x7) + Statics.field509;
                int var71 = var1.method5103();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field683[var72];
                class67 var75;
                if (field806 == var67) {
                    var75 = Statics.field2495;
                } else {
                    var75 = field625[var67];
                }
                if (var75 != null) {
                    class254 var76 = class254.method3035(var66);
                    int var77;
                    int var78;
                    if (var73 == 1 || var73 == 3) {
                        var77 = var76.field3329;
                        var78 = var76.field3366;
                    } else {
                        var77 = var76.field3366;
                        var78 = var76.field3329;
                    }
                    int var79 = (var77 >> 1) + var69;
                    int var80 = (var77 + 1 >> 1) + var69;
                    int var81 = (var78 >> 1) + var70;
                    int var82 = (var78 + 1 >> 1) + var70;
                    int[][] var83 = class56.field476[Statics.field562];
                    int var84 = var83[var79][var81] + var83[var80][var81] + var83[var79][var82] + var83[var80][var82] >> 2;
                    int var85 = (var69 << 7) + (var77 << 6);
                    int var86 = (var70 << 7) + (var78 << 6);
                    class128 var87 = var76.method4265(var72, var73, var83, var85, var84, var86);
                    if (var87 != null) {
                        method950(Statics.field562, var69, var70, var74, -1, 0, 0, var64 + 1, var61 + 1);
                        var75.field594 = field628 + var64;
                        var75.field604 = field628 + var61;
                        var75.field601 = var87;
                        var75.field598 = var69 * 128 + var77 * 64;
                        var75.field600 = var70 * 128 + var78 * 64;
                        var75.field599 = var84;
                        if (var62 > var60) {
                            byte var88 = var62;
                            var62 = var60;
                            var60 = var88;
                        }
                        if (var65 > var63) {
                            byte var89 = var65;
                            var65 = var63;
                            var63 = var89;
                        }
                        var75.field602 = var62 + var69;
                        var75.field610 = var60 + var69;
                        var75.field603 = var65 + var70;
                        var75.field605 = var63 + var70;
                    }
                }
            }
            if (class186.field2306 == arg0) {
                int var90 = var1.method5185();
                int var91 = (var90 >> 4 & 0x7) + Statics.field287;
                int var92 = (var90 & 0x7) + Statics.field509;
                int var93 = var1.method5185();
                int var94 = var93 >> 4 & 0xF;
                int var95 = var93 & 0x7;
                int var96 = var1.method5304();
                int var97 = var1.method5185();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var98 = var94 + 1;
                    if (Statics.field2495.field940[0] >= var91 - var98 && Statics.field2495.field940[0] <= var91 + var98 && Statics.field2495.field974[0] >= var92 - var98 && Statics.field2495.field974[0] <= var92 + var98 && field861 != 0 && var95 > 0 && field862 < 50) {
                        field863[field862] = var96;
                        field763[field862] = var95;
                        field865[field862] = var97;
                        field775[field862] = null;
                        field866[field862] = (var91 << 16) + (var92 << 8) + var94;
                        field862++;
                    }
                }
            }
            if (class186.field2299 == arg0) {
                int var99 = var1.method5103();
                int var100 = (var99 >> 4 & 0x7) + Statics.field287;
                int var101 = (var99 & 0x7) + Statics.field509;
                int var102 = var1.method5152();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class262 var103 = field820[Statics.field562][var100][var101];
                    if (var103 != null) {
                        for (class88 var104 = (class88) var103.method4550(); var104 != null; var104 = (class88) var103.method4573()) {
                            if ((var102 & 0x7FFF) == var104.field1212) {
                                var104.method3326();
                                break;
                            }
                        }
                        if (var103.method4550() == null) {
                            field820[Statics.field562][var100][var101] = null;
                        }
                        method501(var100, var101);
                    }
                }
            } else if (class186.field2303 == arg0) {
                int var105 = var1.method5152();
                int var106 = var1.method5141();
                int var107 = var1.method5185();
                int var108 = (var107 >> 4 & 0x7) + Statics.field287;
                int var109 = (var107 & 0x7) + Statics.field509;
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class88 var110 = new class88();
                    var110.field1212 = var105;
                    var110.field1213 = var106;
                    if (field820[Statics.field562][var108][var109] == null) {
                        field820[Statics.field562][var108][var109] = new class262();
                    }
                    field820[Statics.field562][var108][var109].method4572(var110);
                    method501(var108, var109);
                }
            } else if (class186.field2301 == arg0) {
                int var111 = var1.method5304();
                int var112 = var1.method5304();
                int var113 = var1.method5185();
                int var114 = (var113 >> 4 & 0x7) + Statics.field287;
                int var115 = (var113 & 0x7) + Statics.field509;
                int var116 = var1.method5097();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    class262 var117 = field820[Statics.field562][var114][var115];
                    if (var117 != null) {
                        for (class88 var118 = (class88) var117.method4550(); var118 != null; var118 = (class88) var117.method4573()) {
                            if ((var111 & 0x7FFF) == var118.field1212 && var118.field1213 == var112) {
                                var118.field1213 = var116;
                                break;
                            }
                        }
                        method501(var114, var115);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.gx(IIIIIIIIII)V")
    public static final void method950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field666.method4550(); var10 != null; var10 = (class69) field666.method4573()) {
            if (var10.field913 == arg0 && var10.field903 == arg1 && var10.field916 == arg2 && var10.field902 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field913 = arg0;
            var9.field902 = arg3;
            var9.field903 = arg1;
            var9.field916 = arg2;
            Statics.method150(var9);
            field666.method4572(var9);
        }
        var9.field908 = arg4;
        var9.field912 = arg5;
        var9.field915 = arg6;
        var9.field911 = arg7;
        var9.field906 = arg8;
    }

    @ObfuscatedName("if.gm(I)V")
    public static final void method4155() {
        for (class69 var0 = (class69) field666.method4550(); var0 != null; var0 = (class69) field666.method4573()) {
            if (var0.field906 == -1) {
                var0.field911 = 0;
                Statics.method150(var0);
            } else {
                var0.method3326();
            }
        }
    }

    @ObfuscatedName("bj.hq(IIIIIIII)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field838 && Statics.field562 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field178.method2861(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field178.method2907(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field178.method2863(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field178.method2864(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field178.method2992(arg0, arg2, arg3, var7);
            int var13 = class129.method1950(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field178.method2871(arg0, arg2, arg3);
                class254 var16 = class254.method3035(var13);
                if (var16.field3364 != 0) {
                    field659[arg0].method3279(arg2, arg3, var14, var15, var16.field3340);
                }
            }
            if (arg1 == 1) {
                Statics.field178.method2853(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field178.method2950(arg0, arg2, arg3);
                class254 var17 = class254.method3035(var13);
                if (var17.field3366 + arg2 > 103 || var17.field3366 + arg3 > 103 || var17.field3329 + arg2 > 103 || var17.field3329 + arg3 > 103) {
                    return;
                }
                if (var17.field3364 != 0) {
                    field659[arg0].method3282(arg2, arg3, var17.field3366, var17.field3329, var15, var17.field3340);
                }
            }
            if (arg1 == 3) {
                Statics.field178.method2862(arg0, arg2, arg3);
                class254 var18 = class254.method3035(var13);
                if (var18.field3364 == 1) {
                    field659[arg0].method3284(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field475[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class134 var20 = Statics.field178;
        class173 var21 = field659[arg0];
        class254 var22 = class254.method3035(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3329;
            var24 = var22.field3366;
        } else {
            var23 = var22.field3366;
            var24 = var22.field3329;
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
        int[][] var29 = class56.field476[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class129.method239(arg2, arg3, 2, var22.field3341 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3360 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class136 var36;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var36 = var22.method4265(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class94(arg4, 22, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2841(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3364 == 1) {
                var21.method3280(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var62;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var62 = var22.method4265(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class94(arg4, 10, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            if (var62 != null) {
                var20.method2845(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3364 != 0) {
                var21.method3302(arg2, arg3, var23, var24, var22.field3340);
            }
        } else if (arg6 >= 12) {
            class136 var37;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var37 = var22.method4265(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2845(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3364 != 0) {
                var21.method3302(arg2, arg3, var23, var24, var22.field3340);
            }
        } else if (arg6 == 0) {
            class136 var38;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var38 = var22.method4265(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class94(arg4, 0, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var38, (class136) null, class56.field481[arg5], 0, var33, var35);
            if (var22.field3364 != 0) {
                var21.method3277(arg2, arg3, arg6, arg5, var22.field3340);
            }
        } else if (arg6 == 1) {
            class136 var39;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var39 = var22.method4265(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class94(arg4, 1, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var39, (class136) null, class56.field482[arg5], 0, var33, var35);
            if (var22.field3364 != 0) {
                var21.method3277(arg2, arg3, arg6, arg5, var22.field3340);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class136 var41;
            class136 var42;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var41 = var22.method4265(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4265(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class94(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3327, true, (class136) null);
                var42 = new class94(arg4, 2, var40, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var41, var42, class56.field481[arg5], class56.field481[var40], var33, var35);
            if (var22.field3364 != 0) {
                var21.method3277(arg2, arg3, arg6, arg5, var22.field3340);
            }
        } else if (arg6 == 3) {
            class136 var43;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var43 = var22.method4265(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class94(arg4, 3, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2843(arg0, arg2, arg3, var30, var43, (class136) null, class56.field482[arg5], 0, var33, var35);
            if (var22.field3364 != 0) {
                var21.method3277(arg2, arg3, arg6, arg5, var22.field3340);
            }
        } else if (arg6 == 9) {
            class136 var44;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var44 = var22.method4265(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method2845(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3364 != 0) {
                var21.method3302(arg2, arg3, var23, var24, var22.field3340);
            }
        } else if (arg6 == 4) {
            class136 var45;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var45 = var22.method4265(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var45, (class136) null, class56.field481[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2861(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class254.method3035(class129.method1950(var47)).field3346;
            }
            class136 var49;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var49 = var22.method4265(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var49, (class136) null, class56.field481[arg5], 0, class56.field483[arg5] * var46, class56.field488[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2861(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class254.method3035(class129.method1950(var51)).field3346 / 2;
            }
            class136 var53;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var53 = var22.method4265(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var53, (class136) null, 256, arg5, class56.field485[arg5] * var50, class56.field486[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class136 var55;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var55 = var22.method4265(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class94(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var55, (class136) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2861(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class254.method3035(class129.method1950(var57)).field3346 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class136 var60;
            class136 var61;
            if (var22.field3327 == -1 && var22.field3363 == null) {
                var60 = var22.method4265(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4265(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3327, true, (class136) null);
                var61 = new class94(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3327, true, (class136) null);
            }
            var20.method3004(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class56.field485[arg5] * var56, class56.field486[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("ax.hd(III)V")
    public static final void method501(int arg0, int arg1) {
        class262 var2 = field820[Statics.field562][arg0][arg1];
        if (var2 == null) {
            Statics.field178.method2856(Statics.field562, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4550(); var6 != null; var6 = (class88) var2.method4573()) {
            class255 var7 = class255.method1055(var6.field1212);
            long var8 = (long) var7.field3396;
            if (var7.field3395 == 1) {
                var8 = (long) (var6.field1213 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field178.method2856(Statics.field562, arg0, arg1);
            return;
        }
        var2.method4543(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4550(); var12 != null; var12 = (class88) var2.method4573()) {
            if (var5.field1212 != var12.field1212) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1212 != var12.field1212 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method239(arg0, arg1, 3, false, 0);
        Statics.field178.method2842(Statics.field562, arg0, arg1, method564(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field562), var5, var13, var10, var11);
    }

    @ObfuscatedName("iu.hi(ZLkt;B)V")
    public static final void method4062(boolean arg0, class299 arg1) {
        field743 = 0;
        field667 = 0;
        class299 var2 = field669.field1283;
        var2.method5060();
        int var3 = var2.method5059(8);
        if (var3 < field665) {
            for (int var4 = var3; var4 < field665; var4++) {
                field732[++field743 - 1] = field875[var4];
            }
        }
        if (var3 > field665) {
            throw new RuntimeException("");
        }
        field665 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field875[var5];
            class80 var7 = field634[var6];
            int var8 = var2.method5059(1);
            if (var8 == 0) {
                field875[++field665 - 1] = var6;
                var7.field967 = field628;
            } else {
                int var9 = var2.method5059(2);
                if (var9 == 0) {
                    field875[++field665 - 1] = var6;
                    var7.field967 = field628;
                    field882[++field667 - 1] = var6;
                } else if (var9 == 1) {
                    field875[++field665 - 1] = var6;
                    var7.field967 = field628;
                    int var10 = var2.method5059(3);
                    var7.method1877(var10, (byte) 1);
                    int var11 = var2.method5059(1);
                    if (var11 == 1) {
                        field882[++field667 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field875[++field665 - 1] = var6;
                    var7.field967 = field628;
                    int var12 = var2.method5059(3);
                    var7.method1877(var12, (byte) 2);
                    int var13 = var2.method5059(3);
                    var7.method1877(var13, (byte) 2);
                    int var14 = var2.method5059(1);
                    if (var14 == 1) {
                        field882[++field667 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field732[++field743 - 1] = var6;
                }
            }
        }
        method11(arg0, arg1);
        method1757(arg1);
        for (int var15 = 0; var15 < field743; var15++) {
            int var16 = field732[var15];
            if (field628 != field634[var16].field967) {
                field634[var16].field1098 = null;
                field634[var16] = null;
            }
        }
        if (field669.field1277 != arg1.field3696) {
            throw new RuntimeException(arg1.field3696 + class82.field1119 + field669.field1277);
        }
        for (int var17 = 0; var17 < field665; var17++) {
            if (field634[field875[var17]] == null) {
                throw new RuntimeException(var17 + class82.field1119 + field665);
            }
        }
    }

    @ObfuscatedName("x.hc(ZLkt;S)V")
    public static final void method11(boolean arg0, class299 arg1) {
        while (true) {
            if (arg1.method5061(field669.field1277) >= 27) {
                int var2 = arg1.method5059(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field634[var2] == null) {
                        field634[var2] = new class80();
                        var3 = true;
                    }
                    class80 var4 = field634[var2];
                    field875[++field665 - 1] = var2;
                    var4.field967 = field628;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method5059(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method5059(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method5059(1);
                    int var7 = field748[arg1.method5059(3)];
                    if (var3) {
                        var4.field969 = var4.field931 = var7;
                    }
                    int var8 = arg1.method5059(1);
                    if (var8 == 1) {
                        field882[++field667 - 1] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5059(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5059(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1098 = class257.method4928(arg1.method5059(14));
                    var4.field939 = var4.field1098.field3441;
                    var4.field954 = var4.field1098.field3464;
                    if (var4.field954 == 0) {
                        var4.field931 = 0;
                    }
                    var4.field926 = var4.field1098.field3463;
                    var4.field927 = var4.field1098.field3448;
                    var4.field924 = var4.field1098.field3449;
                    var4.field929 = var4.field1098.field3450;
                    var4.field923 = var4.field1098.field3444;
                    var4.field956 = var4.field1098.field3445;
                    var4.field947 = var4.field1098.field3437;
                    var4.method1878(Statics.field2495.field940[0] + var9, Statics.field2495.field974[0] + var5, var6 == 1);
                    continue;
                }
            }
            arg1.method5081();
            return;
        }
    }

    @ObfuscatedName("br.hj(Lkt;I)V")
    public static final void method1757(class299 arg0) {
        for (int var1 = 0; var1 < field667; var1++) {
            int var2 = field882[var1];
            class80 var3 = field634[var2];
            int var4 = arg0.method5103();
            if ((var4 & 0x4) != 0) {
                var3.field955 = arg0.method5097();
                int var5 = arg0.method5225();
                var3.field959 = var5 >> 16;
                var3.field958 = (var5 & 0xFFFF) + field628;
                var3.field919 = 0;
                var3.field917 = 0;
                if (var3.field958 > field628) {
                    var3.field919 = -1;
                }
                if (var3.field955 == 65535) {
                    var3.field955 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method5141();
                int var7 = arg0.method5141();
                int var8 = var3.field971 - (var6 - Statics.field20 - Statics.field20) * 64;
                int var9 = var3.field918 - (var7 - Statics.field553 - Statics.field553) * 64;
                if (var8 != 0 || var9 != 0) {
                    var3.field946 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field921 = arg0.method5112();
                var3.field934 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field944 = arg0.method5097();
                if (var3.field944 == 65535) {
                    var3.field944 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var10 = arg0.method5185();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg0.method5117();
                        if (var15 == 32767) {
                            var15 = arg0.method5117();
                            var13 = arg0.method5117();
                            var12 = arg0.method5117();
                            var14 = arg0.method5117();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg0.method5117();
                        }
                        int var16 = arg0.method5117();
                        var3.method1560(var15, var13, var12, var14, field628, var16);
                    }
                }
                int var17 = arg0.method5132();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg0.method5117();
                        int var20 = arg0.method5117();
                        if (var20 == 32767) {
                            var3.method1570(var19);
                        } else {
                            int var21 = arg0.method5117();
                            int var22 = arg0.method5103();
                            int var23 = var20 > 0 ? arg0.method5185() : var22;
                            var3.method1561(var19, field628, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var24 = arg0.method5152();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg0.method5134();
                if (var3.field950 == var24 && var24 != -1) {
                    int var26 = class259.method1897(var24).field3503;
                    if (var26 == 1) {
                        var3.field951 = 0;
                        var3.field952 = 0;
                        var3.field953 = var25;
                        var3.field925 = 0;
                    }
                    if (var26 == 2) {
                        var3.field925 = 0;
                    }
                } else if (var24 == -1 || var3.field950 == -1 || class259.method1897(var24).field3505 >= class259.method1897(var3.field950).field3505) {
                    var3.field950 = var24;
                    var3.field951 = 0;
                    var3.field952 = 0;
                    var3.field953 = var25;
                    var3.field925 = 0;
                    var3.field970 = var3.field972;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1098 = class257.method4928(arg0.method5152());
                var3.field939 = var3.field1098.field3441;
                var3.field954 = var3.field1098.field3464;
                var3.field926 = var3.field1098.field3463;
                var3.field927 = var3.field1098.field3448;
                var3.field924 = var3.field1098.field3449;
                var3.field929 = var3.field1098.field3450;
                var3.field923 = var3.field1098.field3444;
                var3.field956 = var3.field1098.field3445;
                var3.field947 = var3.field1098.field3437;
            }
        }
    }

    @ObfuscatedName("bq.hl(B)V")
    public static void method1860() {
        field738 = 0;
        field758 = false;
        field765[0] = class225.field2857;
        field766[0] = "";
        field869[0] = 1006;
        field767[0] = false;
        field738 = 1;
    }

    @ObfuscatedName("e.hm(III)V")
    public static final void method146(int arg0, int arg1) {
        if (field738 < 2 && field776 == 0 && !field744 || !field771) {
            return;
        }
        int var2 = method502();
        String var3;
        if (field776 == 1 && field738 < 2) {
            var3 = class225.field2830 + class225.field2903 + field777 + " " + class82.field1123;
        } else if (field744 && field738 < 2) {
            var3 = field725 + class225.field2903 + field782 + " " + class82.field1123;
        } else {
            var3 = method3359(var2);
        }
        if (field738 > 2) {
            var3 = var3 + class82.method3142(16777215) + " " + '/' + " " + (field738 - 2) + class225.field2897;
        }
        Statics.field1097.method4966(var3, arg0 + 4, arg1 + 15, 16777215, 0, field628 / 1000);
    }

    @ObfuscatedName("q.hp(I)V")
    public static final void method159() {
        int var0 = Statics.field2024;
        int var1 = Statics.field1142;
        int var2 = Statics.field2073;
        int var3 = Statics.field1858;
        int var4 = 6116423;
        class321.method5565(var0, var1, var2, var3, var4);
        class321.method5565(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class321.method5569(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1097.method4957(class225.field2896, var0 + 3, var1 + 14, var4, -1);
        int var5 = class55.field462;
        int var6 = class55.field463;
        for (int var7 = 0; var7 < field738; var7++) {
            int var8 = (field738 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1097.method4957(method3359(var7), var0 + 3, var8, var9, 0);
        }
        method4063(Statics.field2024, Statics.field1142, Statics.field2073, Statics.field1858);
    }

    @ObfuscatedName("cb.hy(IIIII)V")
    public static final void method1874(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field678; var4++) {
            if (field833[var4] + field830[var4] > arg0 && field830[var4] < arg0 + arg2 && field834[var4] + field832[var4] > arg1 && field832[var4] < arg1 + arg3) {
                field828[var4] = true;
            }
        }
    }

    @ObfuscatedName("iu.hs(IIIII)V")
    public static final void method4063(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field678; var4++) {
            if (field833[var4] + field830[var4] > arg0 && field830[var4] < arg0 + arg2 && field834[var4] + field832[var4] > arg1 && field832[var4] < arg1 + arg3) {
                field829[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hf(B)V")
    public final void method1132() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field738 - 1; var2++) {
                if (field869[var2] < 1000 && field869[var2 + 1] > 1000) {
                    String var3 = field766[var2];
                    field766[var2] = field766[var2 + 1];
                    field766[var2 + 1] = var3;
                    String var4 = field765[var2];
                    field765[var2] = field765[var2 + 1];
                    field765[var2 + 1] = var4;
                    int var5 = field869[var2];
                    field869[var2] = field869[var2 + 1];
                    field869[var2 + 1] = var5;
                    int var6 = field761[var2];
                    field761[var2] = field761[var2 + 1];
                    field761[var2 + 1] = var6;
                    int var7 = field762[var2];
                    field762[var2] = field762[var2 + 1];
                    field762[var2 + 1] = var7;
                    int var8 = field754[var2];
                    field754[var2] = field754[var2 + 1];
                    field754[var2 + 1] = var8;
                    boolean var9 = field767[var2];
                    field767[var2] = field767[var2 + 1];
                    field767[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field19 != null || field796 != null) {
            return;
        }
        int var21;
        int var23;
        int var24;
        label214: {
            int var10 = class55.field469;
            if (field758) {
                if (var10 != 1 && (Statics.field282 || var10 != 4)) {
                    int var11 = class55.field462;
                    int var12 = class55.field463;
                    if (var11 < Statics.field2024 - 10 || var11 > Statics.field2073 + Statics.field2024 + 10 || var12 < Statics.field1142 - 10 || var12 > Statics.field1858 + Statics.field1142 + 10) {
                        field758 = false;
                        method1874(Statics.field2024, Statics.field1142, Statics.field2073, Statics.field1858);
                    }
                }
                if (var10 == 1 || !Statics.field282 && var10 == 4) {
                    int var13 = Statics.field2024;
                    int var14 = Statics.field1142;
                    int var15 = Statics.field2073;
                    int var16 = class55.field470;
                    int var17 = class55.field460;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field738; var19++) {
                        int var20 = (field738 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        method487(var18);
                    }
                    field758 = false;
                    method1874(Statics.field2024, Statics.field1142, Statics.field2073, Statics.field1858);
                }
            } else {
                var21 = method502();
                if ((var10 == 1 || !Statics.field282 && var10 == 4) && var21 >= 0) {
                    int var22 = field869[var21];
                    if (var22 == 39 || var22 == 40 || var22 == 41 || var22 == 42 || var22 == 43 || var22 == 33 || var22 == 34 || var22 == 35 || var22 == 36 || var22 == 37 || var22 == 38 || var22 == 1005) {
                        var23 = field761[var21];
                        var24 = field762[var21];
                        class218 var25 = class218.method1101(var24);
                        int var26 = method995(var25);
                        boolean var27 = (var26 >> 28 & 0x1) != 0;
                        if (var27) {
                            break label214;
                        }
                        int var28 = method995(var25);
                        boolean var29 = (var28 >> 29 & 0x1) != 0;
                        if (var29) {
                            break label214;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field282 && var10 == 4) && this.method1133()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field282 && var10 == 4) && field738 > 0) {
                    method487(var21);
                }
                if (var10 == 2 && field738 > 0) {
                    this.method1157(class55.field470, class55.field460);
                }
            }
            return;
        }
        if (Statics.field19 != null && !field734 && field738 > 0 && !this.method1133()) {
            int var30 = field731;
            int var31 = field871;
            class83 var32 = Statics.field1412;
            method4224(var32.field1132, var32.field1130, var32.field1129, var32.field1136, var32.field1133, var32.field1133, var30, var31);
            Statics.field1412 = null;
        }
        field734 = false;
        field735 = 0;
        if (Statics.field19 != null) {
            method469(Statics.field19);
        }
        Statics.field19 = class218.method1101(var24);
        field730 = var23;
        field731 = class55.field470;
        field871 = class55.field460;
        if (var21 >= 0) {
            Statics.field1412 = new class83();
            Statics.field1412.field1132 = field761[var21];
            Statics.field1412.field1130 = field762[var21];
            Statics.field1412.field1129 = field869[var21];
            Statics.field1412.field1136 = field754[var21];
            Statics.field1412.field1133 = field765[var21];
        }
        method469(Statics.field19);
    }

    @ObfuscatedName("client.ha(B)Z")
    public final boolean method1133() {
        int var1 = method502();
        boolean var2 = field757 == 1 && field738 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field869[var1];
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

    @ObfuscatedName("client.hu(III)V")
    public final void method1157(int arg0, int arg1) {
        method999(arg0, arg1);
        Statics.field178.method2972(Statics.field562, arg0, arg1, false);
        field758 = true;
    }

    @ObfuscatedName("bs.hr(IIS)V")
    public static void method999(int arg0, int arg1) {
        int var2 = Statics.field1097.method4952(class225.field2896);
        for (int var3 = 0; var3 < field738; var3++) {
            int var4 = Statics.field1097.method4952(method3359(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field738 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3796) {
            var6 = Statics.field3796 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field434) {
            var7 = Statics.field434 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2024 = var6;
        Statics.field1142 = var7;
        Statics.field2073 = var2;
        Statics.field1858 = field738 * 15 + 22;
    }

    @ObfuscatedName("ap.he(II)V")
    public static final void method487(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field761[arg0];
        int var2 = field762[arg0];
        int var3 = field869[arg0];
        int var4 = field754[arg0];
        String var5 = field765[arg0];
        String var6 = field766[arg0];
        method4224(var1, var2, var3, var4, var5, var6, class55.field470, class55.field460);
    }

    @ObfuscatedName("iz.hb(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4224(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 15) {
            class67 var8 = field625[arg3];
            if (var8 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var9 = class188.method1894(class184.field2195, field669.field1279);
                var9.field2313.method5148(Statics.field1139);
                var9.field2313.method5145(arg3);
                var9.field2313.method5138(field688);
                var9.field2313.method5204(class46.field374[82] ? 1 : 0);
                field669.method2075(var9);
            }
        }
        if (arg2 == 18) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var10 = class188.method1894(class184.field2187, field669.field1279);
            var10.field2313.method5145(arg3);
            var10.field2313.method5140(Statics.field553 + arg1);
            var10.field2313.method5204(class46.field374[82] ? 1 : 0);
            var10.field2313.method5138(Statics.field20 + arg0);
            field669.method2075(var10);
        }
        if (arg2 == 47) {
            class67 var11 = field625[arg3];
            if (var11 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var12 = class188.method1894(class184.field2249, field669.field1279);
                var12.field2313.method5087(class46.field374[82] ? 1 : 0);
                var12.field2313.method5138(arg3);
                field669.method2075(var12);
            }
        }
        if (arg2 == 3) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var13 = class188.method1894(class184.field2222, field669.field1279);
            var13.field2313.method5129(class46.field374[82] ? 1 : 0);
            var13.field2313.method5138(Statics.field553 + arg1);
            var13.field2313.method5145(Statics.field20 + arg0);
            var13.field2313.method5140(arg3);
            field669.method2075(var13);
        }
        if (arg2 == 6) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var14 = class188.method1894(class184.field2228, field669.field1279);
            var14.field2313.method5140(arg3);
            var14.field2313.method5139(Statics.field553 + arg1);
            var14.field2313.method5131(class46.field374[82] ? 1 : 0);
            var14.field2313.method5139(Statics.field20 + arg0);
            field669.method2075(var14);
        }
        if (arg2 == 19) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var15 = class188.method1894(class184.field2260, field669.field1279);
            var15.field2313.method5139(Statics.field20 + arg0);
            var15.field2313.method5087(class46.field374[82] ? 1 : 0);
            var15.field2313.method5138(arg3);
            var15.field2313.method5140(Statics.field553 + arg1);
            field669.method2075(var15);
        }
        if (arg2 == 51) {
            class67 var16 = field625[arg3];
            if (var16 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var17 = class188.method1894(class184.field2212, field669.field1279);
                var17.field2313.method5138(arg3);
                var17.field2313.method5204(class46.field374[82] ? 1 : 0);
                field669.method2075(var17);
            }
        }
        if (arg2 == 20) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var18 = class188.method1894(class184.field2199, field669.field1279);
            var18.field2313.method5139(Statics.field553 + arg1);
            var18.field2313.method5138(arg3);
            var18.field2313.method5087(class46.field374[82] ? 1 : 0);
            var18.field2313.method5140(Statics.field20 + arg0);
            field669.method2075(var18);
        }
        if (arg2 == 34) {
            class188 var19 = class188.method1894(class184.field2193, field669.field1279);
            var19.field2313.method5138(arg3);
            var19.field2313.method5139(arg0);
            var19.field2313.method5090(arg1);
            field669.method2075(var19);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 43) {
            class188 var20 = class188.method1894(class184.field2244, field669.field1279);
            var20.field2313.method5138(arg0);
            var20.field2313.method5139(arg3);
            var20.field2313.method5090(arg1);
            field669.method2075(var20);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 12) {
            class80 var21 = field634[arg3];
            if (var21 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var22 = class188.method1894(class184.field2221, field669.field1279);
                var22.field2313.method5140(arg3);
                var22.field2313.method5129(class46.field374[82] ? 1 : 0);
                field669.method2075(var22);
            }
        }
        if (arg2 == 40) {
            class188 var23 = class188.method1894(class184.field2270, field669.field1279);
            var23.field2313.method5150(arg1);
            var23.field2313.method5138(arg0);
            var23.field2313.method5138(arg3);
            field669.method2075(var23);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 1002) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            class188 var24 = class188.method1894(class184.field2233, field669.field1279);
            var24.field2313.method5139(arg3);
            field669.method2075(var24);
        }
        if (arg2 == 31) {
            class188 var25 = class188.method1894(class184.field2261, field669.field1279);
            var25.field2313.method5139(arg3);
            var25.field2313.method5090(Statics.field2462);
            var25.field2313.method5138(Statics.field1835);
            var25.field2313.method5139(arg0);
            var25.field2313.method5150(arg1);
            var25.field2313.method5140(Statics.field390);
            field669.method2075(var25);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 8) {
            class80 var26 = field634[arg3];
            if (var26 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var27 = class188.method1894(class184.field2281, field669.field1279);
                var27.field2313.method5140(field688);
                var27.field2313.method5149(Statics.field1139);
                var27.field2313.method5138(arg3);
                var27.field2313.method5131(class46.field374[82] ? 1 : 0);
                field669.method2075(var27);
            }
        }
        if (arg2 == 38) {
            method2608();
            class218 var28 = class218.method1101(arg1);
            field776 = 1;
            Statics.field1835 = arg0;
            Statics.field2462 = arg1;
            Statics.field390 = arg3;
            method469(var28);
            field777 = class82.method3142(16748608) + class255.method1055(arg3).field3384 + class82.method3142(16777215);
            if (field777 == null) {
                field777 = class225.field2900;
            }
            return;
        }
        if (arg2 == 13) {
            class80 var29 = field634[arg3];
            if (var29 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var30 = class188.method1894(class184.field2276, field669.field1279);
                var30.field2313.method5131(class46.field374[82] ? 1 : 0);
                var30.field2313.method5138(arg3);
                field669.method2075(var30);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var31 = class218.method701(arg1, arg0);
            if (var31 != null) {
                method1944(arg3, arg1, arg0, var31.field2665, arg5);
            }
        }
        if (arg2 == 5) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var32 = class188.method1894(class184.field2227, field669.field1279);
            var32.field2313.method5129(class46.field374[82] ? 1 : 0);
            var32.field2313.method5139(Statics.field553 + arg1);
            var32.field2313.method5139(arg3);
            var32.field2313.method5138(Statics.field20 + arg0);
            field669.method2075(var32);
        }
        if (arg2 == 7) {
            class80 var33 = field634[arg3];
            if (var33 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var34 = class188.method1894(class184.field2226, field669.field1279);
                var34.field2313.method5090(Statics.field2462);
                var34.field2313.method5131(class46.field374[82] ? 1 : 0);
                var34.field2313.method5138(Statics.field1835);
                var34.field2313.method5140(Statics.field390);
                var34.field2313.method5138(arg3);
                field669.method2075(var34);
            }
        }
        if (arg2 == 41) {
            class188 var35 = class188.method1894(class184.field2283, field669.field1279);
            var35.field2313.method5148(arg1);
            var35.field2313.method5138(arg3);
            var35.field2313.method5145(arg0);
            field669.method2075(var35);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 30 && field789 == null) {
            method482(arg1, arg0);
            field789 = class218.method701(arg1, arg0);
            method469(field789);
        }
        if (arg2 == 14) {
            class67 var36 = field625[arg3];
            if (var36 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var37 = class188.method1894(class184.field2211, field669.field1279);
                var37.field2313.method5129(class46.field374[82] ? 1 : 0);
                var37.field2313.method5140(Statics.field1835);
                var37.field2313.method5138(Statics.field390);
                var37.field2313.method5149(Statics.field2462);
                var37.field2313.method5145(arg3);
                field669.method2075(var37);
            }
        }
        if (arg2 == 1004) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            class188 var38 = class188.method1894(class184.field2206, field669.field1279);
            var38.field2313.method5138(arg3);
            field669.method2075(var38);
        }
        if (arg2 == 32) {
            class188 var39 = class188.method1894(class184.field2220, field669.field1279);
            var39.field2313.method5145(field688);
            var39.field2313.method5138(arg0);
            var39.field2313.method5150(arg1);
            var39.field2313.method5138(arg3);
            var39.field2313.method5149(Statics.field1139);
            field669.method2075(var39);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 26) {
            method59();
        }
        if (arg2 == 4) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var40 = class188.method1894(class184.field2254, field669.field1279);
            var40.field2313.method5139(Statics.field553 + arg1);
            var40.field2313.method5140(arg3);
            var40.field2313.method5138(Statics.field20 + arg0);
            var40.field2313.method5087(class46.field374[82] ? 1 : 0);
            field669.method2075(var40);
        }
        if (arg2 == 10) {
            class80 var41 = field634[arg3];
            if (var41 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var42 = class188.method1894(class184.field2287, field669.field1279);
                var42.field2313.method5204(class46.field374[82] ? 1 : 0);
                var42.field2313.method5145(arg3);
                field669.method2075(var42);
            }
        }
        if (arg2 == 33) {
            class188 var43 = class188.method1894(class184.field2257, field669.field1279);
            var43.field2313.method5139(arg3);
            var43.field2313.method5139(arg0);
            var43.field2313.method5090(arg1);
            field669.method2075(var43);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 23) {
            if (field758) {
                Statics.field178.method2873();
            } else {
                Statics.field178.method2972(Statics.field562, arg0, arg1, true);
            }
        }
        if (arg2 == 11) {
            class80 var44 = field634[arg3];
            if (var44 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var45 = class188.method1894(class184.field2241, field669.field1279);
                var45.field2313.method5129(class46.field374[82] ? 1 : 0);
                var45.field2313.method5139(arg3);
                field669.method2075(var45);
            }
        }
        if (arg2 == 46) {
            class67 var46 = field625[arg3];
            if (var46 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var47 = class188.method1894(class184.field2205, field669.field1279);
                var47.field2313.method5138(arg3);
                var47.field2313.method5087(class46.field374[82] ? 1 : 0);
                field669.method2075(var47);
            }
        }
        if (arg2 == 25) {
            class218 var48 = class218.method701(arg1, arg0);
            if (var48 != null) {
                method2608();
                method1070(arg1, arg0, class219.method4061(method995(var48)), var48.field2665);
                field776 = 0;
                field725 = method151(var48);
                if (field725 == null) {
                    field725 = class225.field2900;
                }
                if (var48.field2538) {
                    field782 = var48.field2641 + class82.method3142(16777215);
                } else {
                    field782 = class82.method3142(65280) + var48.field2537 + class82.method3142(16777215);
                }
            }
            return;
        }
        if (arg2 == 1001) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var49 = class188.method1894(class184.field2210, field669.field1279);
            var49.field2313.method5139(Statics.field553 + arg1);
            var49.field2313.method5145(arg3);
            var49.field2313.method5138(Statics.field20 + arg0);
            var49.field2313.method5131(class46.field374[82] ? 1 : 0);
            field669.method2075(var49);
        }
        if (arg2 == 1005) {
            class218 var50 = class218.method1101(arg1);
            if (var50 == null || var50.field2664[arg0] < 100000) {
                class188 var51 = class188.method1894(class184.field2206, field669.field1279);
                var51.field2313.method5138(arg3);
                field669.method2075(var51);
            } else {
                class92.method500(27, "", var50.field2664[arg0] + " x " + class255.method1055(arg3).field3384);
            }
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 49) {
            class67 var52 = field625[arg3];
            if (var52 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var53 = class188.method1894(class184.field2251, field669.field1279);
                var53.field2313.method5140(arg3);
                var53.field2313.method5129(class46.field374[82] ? 1 : 0);
                field669.method2075(var53);
            }
        }
        if (arg2 == 9) {
            class80 var54 = field634[arg3];
            if (var54 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var55 = class188.method1894(class184.field2215, field669.field1279);
                var55.field2313.method5145(arg3);
                var55.field2313.method5131(class46.field374[82] ? 1 : 0);
                field669.method2075(var55);
            }
        }
        if (arg2 == 58) {
            class218 var56 = class218.method701(arg1, arg0);
            if (var56 != null) {
                class188 var57 = class188.method1894(class184.field2230, field669.field1279);
                var57.field2313.method5150(Statics.field1139);
                var57.field2313.method5139(field688);
                var57.field2313.method5148(arg1);
                var57.field2313.method5145(arg0);
                var57.field2313.method5139(field649);
                var57.field2313.method5145(var56.field2665);
                field669.method2075(var57);
            }
        }
        if (arg2 == 28) {
            class188 var58 = class188.method1894(class184.field2284, field669.field1279);
            var58.field2313.method5090(arg1);
            field669.method2075(var58);
            class218 var59 = class218.method1101(arg1);
            if (var59.field2562 != null && var59.field2562[0][0] == 5) {
                int var60 = var59.field2562[0][1];
                class213.field2494[var60] = 1 - class213.field2494[var60];
                Statics.method1974(var60);
            }
        }
        if (arg2 == 50) {
            class67 var61 = field625[arg3];
            if (var61 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var62 = class188.method1894(class184.field2269, field669.field1279);
                var62.field2313.method5129(class46.field374[82] ? 1 : 0);
                var62.field2313.method5138(arg3);
                field669.method2075(var62);
            }
        }
        if (arg2 == 1003) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            class80 var63 = field634[arg3];
            if (var63 != null) {
                class257 var64 = var63.field1098;
                if (var64.field3465 != null) {
                    var64 = var64.method4403();
                }
                if (var64 != null) {
                    class188 var65 = class188.method1894(class184.field2231, field669.field1279);
                    var65.field2313.method5138(var64.field3439);
                    field669.method2075(var65);
                }
            }
        }
        if (arg2 == 44) {
            class67 var66 = field625[arg3];
            if (var66 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var67 = class188.method1894(class184.field2238, field669.field1279);
                var67.field2313.method5138(arg3);
                var67.field2313.method5204(class46.field374[82] ? 1 : 0);
                field669.method2075(var67);
            }
        }
        if (arg2 == 42) {
            class188 var68 = class188.method1894(class184.field2204, field669.field1279);
            var68.field2313.method5138(arg0);
            var68.field2313.method5149(arg1);
            var68.field2313.method5145(arg3);
            field669.method2075(var68);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 48) {
            class67 var69 = field625[arg3];
            if (var69 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var70 = class188.method1894(class184.field2213, field669.field1279);
                var70.field2313.method5087(class46.field374[82] ? 1 : 0);
                var70.field2313.method5140(arg3);
                field669.method2075(var70);
            }
        }
        if (arg2 == 29) {
            class188 var71 = class188.method1894(class184.field2284, field669.field1279);
            var71.field2313.method5090(arg1);
            field669.method2075(var71);
            class218 var72 = class218.method1101(arg1);
            if (var72.field2562 != null && var72.field2562[0][0] == 5) {
                int var73 = var72.field2562[0][1];
                if (class213.field2494[var73] != var72.field2659[0]) {
                    class213.field2494[var73] = var72.field2659[0];
                    Statics.method1974(var73);
                }
            }
        }
        if (arg2 == 35) {
            class188 var74 = class188.method1894(class184.field2262, field669.field1279);
            var74.field2313.method5148(arg1);
            var74.field2313.method5140(arg3);
            var74.field2313.method5138(arg0);
            field669.method2075(var74);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field75.method5899(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 37) {
            class188 var75 = class188.method1894(class184.field2278, field669.field1279);
            var75.field2313.method5139(arg0);
            var75.field2313.method5150(arg1);
            var75.field2313.method5145(arg3);
            field669.method2075(var75);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 22) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var76 = class188.method1894(class184.field2189, field669.field1279);
            var76.field2313.method5139(arg3);
            var76.field2313.method5138(Statics.field20 + arg0);
            var76.field2313.method5204(class46.field374[82] ? 1 : 0);
            var76.field2313.method5138(Statics.field553 + arg1);
            field669.method2075(var76);
        }
        if (arg2 == 39) {
            class188 var77 = class188.method1894(class184.field2235, field669.field1279);
            var77.field2313.method5149(arg1);
            var77.field2313.method5138(arg0);
            var77.field2313.method5140(arg3);
            field669.method2075(var77);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 1) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var78 = class188.method1894(class184.field2245, field669.field1279);
            var78.field2313.method5129(class46.field374[82] ? 1 : 0);
            var78.field2313.method5145(Statics.field390);
            var78.field2313.method5140(arg3);
            var78.field2313.method5139(Statics.field20 + arg0);
            var78.field2313.method5138(Statics.field1835);
            var78.field2313.method5090(Statics.field2462);
            var78.field2313.method5140(Statics.field553 + arg1);
            field669.method2075(var78);
        }
        if (arg2 == 24) {
            class218 var79 = class218.method1101(arg1);
            boolean var80 = true;
            if (var79.field2543 > 0) {
                var80 = method699(var79);
            }
            if (var80) {
                class188 var81 = class188.method1894(class184.field2284, field669.field1279);
                var81.field2313.method5090(arg1);
                field669.method2075(var81);
            }
        }
        if (arg2 == 45) {
            class67 var82 = field625[arg3];
            if (var82 != null) {
                field680 = arg6;
                field724 = arg7;
                field726 = 2;
                field686 = 0;
                field854 = arg0;
                field855 = arg1;
                class188 var83 = class188.method1894(class184.field2216, field669.field1279);
                var83.field2313.method5087(class46.field374[82] ? 1 : 0);
                var83.field2313.method5139(arg3);
                field669.method2075(var83);
            }
        }
        if (arg2 == 36) {
            class188 var84 = class188.method1894(class184.field2265, field669.field1279);
            var84.field2313.method5139(arg0);
            var84.field2313.method5150(arg1);
            var84.field2313.method5140(arg3);
            field669.method2075(var84);
            field728 = 0;
            Statics.field1836 = class218.method1101(arg1);
            field729 = arg0;
        }
        if (arg2 == 16) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var85 = class188.method1894(class184.field2239, field669.field1279);
            var85.field2313.method5145(Statics.field20 + arg0);
            var85.field2313.method5140(arg3);
            var85.field2313.method5140(Statics.field390);
            var85.field2313.method5145(Statics.field553 + arg1);
            var85.field2313.method5090(Statics.field2462);
            var85.field2313.method5138(Statics.field1835);
            var85.field2313.method5131(class46.field374[82] ? 1 : 0);
            field669.method2075(var85);
        }
        if (arg2 == 21) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var86 = class188.method1894(class184.field2207, field669.field1279);
            var86.field2313.method5131(class46.field374[82] ? 1 : 0);
            var86.field2313.method5140(Statics.field20 + arg0);
            var86.field2313.method5140(arg3);
            var86.field2313.method5145(Statics.field553 + arg1);
            field669.method2075(var86);
        }
        if (arg2 == 2) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var87 = class188.method1894(class184.field2197, field669.field1279);
            var87.field2313.method5149(Statics.field1139);
            var87.field2313.method5145(arg3);
            var87.field2313.method5138(Statics.field553 + arg1);
            var87.field2313.method5204(class46.field374[82] ? 1 : 0);
            var87.field2313.method5139(field688);
            var87.field2313.method5139(Statics.field20 + arg0);
            field669.method2075(var87);
        }
        if (arg2 == 17) {
            field680 = arg6;
            field724 = arg7;
            field726 = 2;
            field686 = 0;
            field854 = arg0;
            field855 = arg1;
            class188 var88 = class188.method1894(class184.field2234, field669.field1279);
            var88.field2313.method5148(Statics.field1139);
            var88.field2313.method5145(field688);
            var88.field2313.method5138(Statics.field553 + arg1);
            var88.field2313.method5138(arg3);
            var88.field2313.method5138(Statics.field20 + arg0);
            var88.field2313.method5129(class46.field374[82] ? 1 : 0);
            field669.method2075(var88);
        }
        if (field776 != 0) {
            field776 = 0;
            method469(class218.method1101(Statics.field2462));
        }
        if (field744) {
            method2608();
        }
        if (Statics.field1836 != null && field728 == 0) {
            method469(Statics.field1836);
        }
    }

    @ObfuscatedName("bm.hv(ILjava/lang/String;I)V")
    public static void method996(int arg0, String arg1) {
        int var2 = class90.field1227;
        int[] var3 = class90.field1224;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field22);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field625[var3[var6]];
            if (var7 != null && Statics.field2495 != var7 && var7.field596 != null && var7.field596.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method1894(class184.field2238, field669.field1279);
                    var8.field2313.method5138(var3[var6]);
                    var8.field2313.method5204(0);
                    field669.method2075(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method1894(class184.field2249, field669.field1279);
                    var9.field2313.method5087(0);
                    var9.field2313.method5138(var3[var6]);
                    field669.method2075(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method1894(class184.field2251, field669.field1279);
                    var10.field2313.method5140(var3[var6]);
                    var10.field2313.method5129(0);
                    field669.method2075(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method1894(class184.field2269, field669.field1279);
                    var11.field2313.method5129(0);
                    var11.field2313.method5138(var3[var6]);
                    field669.method2075(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method500(4, "", class225.field2892 + arg1);
        }
    }

    @ObfuscatedName("by.hn(IIIII)V")
    public static void method1070(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method701(arg0, arg1);
        if (var4 != null && var4.field2636 != null) {
            class63 var5 = new class63();
            var5.field550 = var4;
            var5.field549 = var4.field2636;
            class77.method1954(var5);
        }
        field649 = arg3;
        field744 = true;
        Statics.field1139 = arg0;
        field688 = arg1;
        Statics.field1968 = arg2;
        method469(var4);
    }

    @ObfuscatedName("db.hx(I)V")
    public static void method2608() {
        if (!field744) {
            return;
        }
        class218 var0 = class218.method701(Statics.field1139, field688);
        if (var0 != null && var0.field2582 != null) {
            class63 var1 = new class63();
            var1.field550 = var0;
            var1.field549 = var0.field2582;
            class77.method1954(var1);
        }
        field744 = false;
        method469(var0);
    }

    @ObfuscatedName("ad.ho(IIB)V")
    public static void method482(int arg0, int arg1) {
        class188 var2 = class188.method1894(class184.field2277, field669.field1279);
        var2.field2313.method5149(arg0);
        var2.field2313.method5138(arg1);
        field669.method2075(var2);
    }

    @ObfuscatedName("cm.ht(IIIILjava/lang/String;I)V")
    public static void method1944(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method701(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2645 != null) {
            class63 var6 = new class63();
            var6.field550 = var5;
            var6.field541 = arg0;
            var6.field548 = arg4;
            var6.field549 = var5.field2645;
            class77.method1954(var6);
        }
        boolean var7 = true;
        if (var5.field2543 > 0) {
            var7 = method699(var5);
        }
        if (!var7 || !class219.method3646(method995(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class188 var8 = class188.method1894(class184.field2280, field669.field1279);
            var8.field2313.method5090(arg1);
            var8.field2313.method5145(arg2);
            var8.field2313.method5145(arg3);
            field669.method2075(var8);
        }
        if (arg0 == 2) {
            class188 var9 = class188.method1894(class184.field2229, field669.field1279);
            var9.field2313.method5090(arg1);
            var9.field2313.method5145(arg2);
            var9.field2313.method5145(arg3);
            field669.method2075(var9);
        }
        if (arg0 == 3) {
            class188 var10 = class188.method1894(class184.field2203, field669.field1279);
            var10.field2313.method5090(arg1);
            var10.field2313.method5145(arg2);
            var10.field2313.method5145(arg3);
            field669.method2075(var10);
        }
        if (arg0 == 4) {
            class188 var11 = class188.method1894(class184.field2232, field669.field1279);
            var11.field2313.method5090(arg1);
            var11.field2313.method5145(arg2);
            var11.field2313.method5145(arg3);
            field669.method2075(var11);
        }
        if (arg0 == 5) {
            class188 var12 = class188.method1894(class184.field2259, field669.field1279);
            var12.field2313.method5090(arg1);
            var12.field2313.method5145(arg2);
            var12.field2313.method5145(arg3);
            field669.method2075(var12);
        }
        if (arg0 == 6) {
            class188 var13 = class188.method1894(class184.field2252, field669.field1279);
            var13.field2313.method5090(arg1);
            var13.field2313.method5145(arg2);
            var13.field2313.method5145(arg3);
            field669.method2075(var13);
        }
        if (arg0 == 7) {
            class188 var14 = class188.method1894(class184.field2200, field669.field1279);
            var14.field2313.method5090(arg1);
            var14.field2313.method5145(arg2);
            var14.field2313.method5145(arg3);
            field669.method2075(var14);
        }
        if (arg0 == 8) {
            class188 var15 = class188.method1894(class184.field2208, field669.field1279);
            var15.field2313.method5090(arg1);
            var15.field2313.method5145(arg2);
            var15.field2313.method5145(arg3);
            field669.method2075(var15);
        }
        if (arg0 == 9) {
            class188 var16 = class188.method1894(class184.field2248, field669.field1279);
            var16.field2313.method5090(arg1);
            var16.field2313.method5145(arg2);
            var16.field2313.method5145(arg3);
            field669.method2075(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var17 = class188.method1894(class184.field2218, field669.field1279);
        var17.field2313.method5090(arg1);
        var17.field2313.method5145(arg2);
        var17.field2313.method5145(arg3);
        field669.method2075(var17);
    }

    @ObfuscatedName("kn.hw(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4934(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2328(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("de.hg(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method2328(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field758 || field738 >= 500) {
            return;
        }
        field765[field738] = arg0;
        field766[field738] = arg1;
        field869[field738] = arg2;
        field754[field738] = arg3;
        field761[field738] = arg4;
        field762[field738] = arg5;
        field767[field738] = arg6;
        field738++;
    }

    @ObfuscatedName("ax.hz(I)I")
    public static final int method502() {
        return field738 - 1;
    }

    @ObfuscatedName("gl.ib(IB)Ljava/lang/String;")
    public static String method3359(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field766[arg0].length() > 0) {
            return field765[arg0] + class225.field2903 + field766[arg0];
        } else {
            return field765[arg0];
        }
    }

    @ObfuscatedName("eo.io(IIIII)V")
    public static final void method3016(int arg0, int arg1, int arg2, int arg3) {
        if (field776 == 0 && !field744) {
            method4934(class225.field2898, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < Statics.method244(); var8++) {
            long var9 = class129.field1715[var8];
            if (var6 != var9) {
                var6 = var9;
                long var13 = class129.field1715[var8];
                int var15 = (int) (var13 >>> 0 & 0x7FL);
                int var17 = var15;
                int var18 = class129.method3377(class129.field1715[var8]);
                int var19 = var18;
                int var20 = class129.method5490(class129.field1715[var8]);
                int var22 = class129.method1952(var8);
                if (var20 == 2 && Statics.field178.method2992(Statics.field562, var15, var18, var9) >= 0) {
                    class254 var23 = class254.method3035(var22);
                    if (var23.field3363 != null) {
                        var23 = var23.method4291();
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (field776 == 1) {
                        method4934(class225.field2830, field777 + " " + class82.field1123 + " " + class82.method3142(65535) + var23.field3332, 1, var22, var15, var18);
                    } else if (!field744) {
                        String[] var24 = var23.field3349;
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
                                    method4934(var24[var25], class82.method3142(65535) + var23.field3332, var26, var22, var17, var19);
                                }
                            }
                        }
                        method4934(class225.field2894, class82.method3142(65535) + var23.field3332, 1002, var23.field3371, var17, var19);
                    } else if ((Statics.field1968 & 0x4) == 4) {
                        method4934(field725, field782 + " " + class82.field1123 + " " + class82.method3142(65535) + var23.field3332, 2, var22, var15, var18);
                    }
                }
                if (var20 == 1) {
                    class80 var27 = field634[var22];
                    if (var27 == null) {
                        continue;
                    }
                    if (var27.field1098.field3441 == 1 && (var27.field971 & 0x7F) == 64 && (var27.field918 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < field665; var28++) {
                            class80 var29 = field634[field875[var28]];
                            if (var29 != null && var27 != var29 && var29.field1098.field3441 == 1 && var27.field971 == var29.field971 && var27.field918 == var29.field918) {
                                method998(var29.field1098, field875[var28], var17, var19);
                            }
                        }
                        int var30 = class90.field1227;
                        int[] var31 = class90.field1224;
                        for (int var32 = 0; var32 < var30; var32++) {
                            class67 var33 = field625[var31[var32]];
                            if (var33 != null && var27.field971 == var33.field971 && var27.field918 == var33.field918) {
                                method3821(var33, var31[var32], var17, var19);
                            }
                        }
                    }
                    method998(var27.field1098, var22, var17, var19);
                }
                if (var20 == 0) {
                    class67 var34 = field625[var22];
                    if (var34 == null) {
                        continue;
                    }
                    if ((var34.field971 & 0x7F) == 64 && (var34.field918 & 0x7F) == 64) {
                        for (int var35 = 0; var35 < field665; var35++) {
                            class80 var36 = field634[field875[var35]];
                            if (var36 != null && var36.field1098.field3441 == 1 && var34.field971 == var36.field971 && var34.field918 == var36.field918) {
                                method998(var36.field1098, field875[var35], var17, var19);
                            }
                        }
                        int var37 = class90.field1227;
                        int[] var38 = class90.field1224;
                        for (int var39 = 0; var39 < var37; var39++) {
                            class67 var40 = field625[var38[var39]];
                            if (var40 != null && var34 != var40 && var34.field971 == var40.field971 && var34.field918 == var40.field918) {
                                method3821(var40, var38[var39], var17, var19);
                            }
                        }
                    }
                    if (field749 == var22) {
                        var4 = var9;
                    } else {
                        method3821(var34, var22, var17, var19);
                    }
                }
                if (var20 == 3) {
                    class262 var41 = field820[Statics.field562][var17][var19];
                    if (var41 != null) {
                        for (class88 var42 = (class88) var41.method4551(); var42 != null; var42 = (class88) var41.method4553()) {
                            class255 var43 = class255.method1055(var42.field1212);
                            if (field776 == 1) {
                                method4934(class225.field2830, field777 + " " + class82.field1123 + " " + class82.method3142(16748608) + var43.field3384, 16, var42.field1212, var17, var19);
                            } else if (!field744) {
                                String[] var44 = var43.field3417;
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
                                        method4934(var44[var45], class82.method3142(16748608) + var43.field3384, var46, var42.field1212, var17, var19);
                                    } else if (var45 == 2) {
                                        method4934(class225.field2740, class82.method3142(16748608) + var43.field3384, 20, var42.field1212, var17, var19);
                                    }
                                }
                                method4934(class225.field2894, class82.method3142(16748608) + var43.field3384, 1004, var42.field1212, var17, var19);
                            } else if ((Statics.field1968 & 0x1) == 1) {
                                method4934(field725, field782 + " " + class82.field1123 + " " + class82.method3142(16748608) + var43.field3384, 17, var42.field1212, var17, var19);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var47 = (int) (var4 >>> 0 & 0x7FL);
            int var49 = class129.method3377(var4);
            class67 var50 = field625[field749];
            method3821(var50, field749, var47, var49);
        }
    }

    @ObfuscatedName("bw.in(Lia;IIII)V")
    public static final void method998(class257 arg0, int arg1, int arg2, int arg3) {
        if (field738 >= 400) {
            return;
        }
        if (arg0.field3465 != null) {
            arg0 = arg0.method4403();
        }
        if (arg0 == null || !arg0.field3468 || arg0.field3470 && field793 != arg1) {
            return;
        }
        String var4 = arg0.field3440;
        if (arg0.field3457 != 0) {
            int var6 = arg0.field3457;
            int var7 = Statics.field2495.field593;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method3142(16711680);
            } else if (var8 < -6) {
                var9 = class82.method3142(16723968);
            } else if (var8 < -3) {
                var9 = class82.method3142(16740352);
            } else if (var8 < 0) {
                var9 = class82.method3142(16756736);
            } else if (var8 > 9) {
                var9 = class82.method3142(65280);
            } else if (var8 > 6) {
                var9 = class82.method3142(4259584);
            } else if (var8 > 3) {
                var9 = class82.method3142(8453888);
            } else if (var8 > 0) {
                var9 = class82.method3142(12648192);
            } else {
                var9 = class82.method3142(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1121 + class225.field2821 + arg0.field3457 + class82.field1124;
        }
        if (arg0.field3470 && field696) {
            method4934(class225.field2894, class82.method3142(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field776 == 1) {
            method4934(class225.field2830, field777 + " " + class82.field1123 + " " + class82.method3142(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field744) {
            int var10 = arg0.field3470 && field696 ? 2000 : 0;
            String[] var11 = arg0.field3458;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class225.field2874)) {
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
                        method4934(var11[var12], class82.method3142(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class225.field2874)) {
                        short var15 = 0;
                        if (field651 != class85.field1147) {
                            if (field651 == class85.field1145 || field651 == class85.field1146 && arg0.field3457 > Statics.field2495.field593) {
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
                            method4934(var11[var14], class82.method3142(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3470 || !field696) {
                method4934(class225.field2894, class82.method3142(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1968 & 0x2) == 2) {
            method4934(field725, field782 + " " + class82.field1123 + " " + class82.method3142(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hg.ir(Lby;IIIB)V")
    public static final void method3821(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2495 == arg0 || field738 >= 400) {
            return;
        }
        String var9;
        if (arg0.field587 == 0) {
            String var4 = arg0.field614[0] + arg0.field596 + arg0.field614[1];
            int var5 = arg0.field593;
            int var6 = Statics.field2495.field593;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method3142(16711680);
            } else if (var7 < -6) {
                var8 = class82.method3142(16723968);
            } else if (var7 < -3) {
                var8 = class82.method3142(16740352);
            } else if (var7 < 0) {
                var8 = class82.method3142(16756736);
            } else if (var7 > 9) {
                var8 = class82.method3142(65280);
            } else if (var7 > 6) {
                var8 = class82.method3142(4259584);
            } else if (var7 > 3) {
                var8 = class82.method3142(8453888);
            } else if (var7 > 0) {
                var8 = class82.method3142(12648192);
            } else {
                var8 = class82.method3142(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1121 + class225.field2821 + arg0.field593 + class82.field1124 + arg0.field614[2];
        } else {
            var9 = arg0.field614[0] + arg0.field596 + arg0.field614[1] + " " + class82.field1121 + class225.field2777 + arg0.field587 + class82.field1124 + arg0.field614[2];
        }
        if (field776 == 1) {
            method4934(class225.field2830, field777 + " " + class82.field1123 + " " + class82.method3142(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field744) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field681[var10] != null) {
                    short var11 = 0;
                    if (field681[var10].equalsIgnoreCase(class225.field2874)) {
                        if (field886 == class85.field1147) {
                            continue;
                        }
                        if (field886 == class85.field1145 || field886 == class85.field1146 && arg0.field593 > Statics.field2495.field593) {
                            var11 = 2000;
                        }
                        if (Statics.field2495.field607 != 0 && arg0.field607 != 0) {
                            if (Statics.field2495.field607 == arg0.field607) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field706[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field745[var10] + var11;
                    method4934(field681[var10], class82.method3142(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1968 & 0x8) == 8) {
            method4934(field725, field782 + " " + class82.field1123 + " " + class82.method3142(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field738; var14++) {
            if (field869[var14] == 23) {
                field766[var14] = class82.method3142(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ap.ii(IIIIIIIIB)V")
    public static final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method3214(arg0)) {
            Statics.field1411 = null;
            method3599(Statics.field3631[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1411 != null) {
                method3599(Statics.field1411, -1412584499, arg1, arg2, arg3, arg4, Statics.field139, Statics.field80, arg7);
                Statics.field1411 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field828[var8] = true;
            }
        } else {
            field828[arg7] = true;
        }
    }

    @ObfuscatedName("gd.ik([Lhy;IIIIIIIII)V")
    public static final void method3599(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5558(arg2, arg3, arg4, arg5);
        class131.method2756();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2594 == arg1 || arg1 == -1412584499 && field796 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field830[field678] = var10.field2539 + arg6;
                    field832[field678] = var10.field2553 + arg7;
                    field833[field678] = var10.field2554;
                    field834[field678] = var10.field2593;
                    var11 = ++field678 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2621 = var11;
                var10.field2677 = field628;
                if (!var10.field2538 || !method3961(var10)) {
                    if (var10.field2543 > 0) {
                        method129(var10);
                    }
                    int var12 = var10.field2539 + arg6;
                    int var13 = var10.field2553 + arg7;
                    int var14 = var10.field2570;
                    if (field796 == var10) {
                        if (arg1 != -1412584499 && !var10.field2623) {
                            Statics.field1411 = arg0;
                            Statics.field139 = arg6;
                            Statics.field80 = arg7;
                            continue;
                        }
                        if (field807 && field801) {
                            int var15 = class55.field462;
                            int var16 = class55.field463;
                            int var17 = var15 - field876;
                            int var18 = var16 - field799;
                            if (var17 < field802) {
                                var17 = field802;
                            }
                            if (var10.field2554 + var17 > field802 + field797.field2554) {
                                var17 = field802 + field797.field2554 - var10.field2554;
                            }
                            if (var18 < field707) {
                                var18 = field707;
                            }
                            if (var10.field2593 + var18 > field707 + field797.field2593) {
                                var18 = field707 + field797.field2593 - var10.field2593;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2623) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2541 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2541 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2554 + var12;
                        int var26 = var10.field2593 + var13;
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
                        int var29 = var10.field2554 + var12;
                        int var30 = var10.field2593 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2538 || var19 < var21 && var20 < var22) {
                        if (var10.field2543 != 0) {
                            if (var10.field2543 == 1336) {
                                if (field853) {
                                    var13 += 15;
                                    Statics.field2382.method4959("Fps:" + field451, var10.field2554 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field838) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2382.method4959("Mem:" + var32 + "k", var10.field2554 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2543 == 1337) {
                                field772 = var12;
                                field690 = var13;
                                method1011(var12, var13, var10.field2554, var10.field2593);
                                field828[var10.field2621] = true;
                                class321.method5558(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2543 == 1338) {
                                method1049(var10, var12, var13, var11);
                                class321.method5558(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2543 == 1339) {
                                method1010(var10, var12, var13, var11);
                                class321.method5558(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2543 == 1400) {
                                Statics.field75.method5862(var12, var13, var10.field2554, var10.field2593, field628);
                            }
                            if (var10.field2543 == 1401) {
                                Statics.field75.method5842(var12, var13, var10.field2554, var10.field2593);
                            }
                            if (var10.field2543 == 1402) {
                                Statics.field1955.method1636(var12, field628);
                            }
                        }
                        if (var10.field2541 == 0) {
                            if (!var10.field2538 && method3961(var10) && Statics.field270 != var10) {
                                continue;
                            }
                            if (!var10.field2538) {
                                if (var10.field2561 > var10.field2563 - var10.field2593) {
                                    var10.field2561 = var10.field2563 - var10.field2593;
                                }
                                if (var10.field2561 < 0) {
                                    var10.field2561 = 0;
                                }
                            }
                            method3599(arg0, var10.field2571, var19, var20, var21, var22, var12 - var10.field2605, var13 - var10.field2561, var11);
                            if (var10.field2549 != null) {
                                method3599(var10.field2549, var10.field2571, var19, var20, var21, var22, var12 - var10.field2605, var13 - var10.field2561, var11);
                            }
                            class62 var34 = (class62) field899.method5524((long) var10.field2571);
                            if (var34 != null) {
                                method496(var34.field540, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5558(arg2, arg3, arg4, arg5);
                            class131.method2756();
                        }
                        if (field837 || field648[var11] || field835 > 1) {
                            if (var10.field2541 == 0 && !var10.field2538 && var10.field2563 > var10.field2593) {
                                method3334(var10.field2554 + var12, var13, var10.field2561, var10.field2593, var10.field2563);
                            }
                            if (var10.field2541 != 1) {
                                if (var10.field2541 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2551; var36++) {
                                        for (int var37 = 0; var37 < var10.field2550; var37++) {
                                            int var38 = (var10.field2532 + 32) * var37 + var12;
                                            int var39 = (var10.field2607 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2608[var35];
                                                var39 += var10.field2609[var35];
                                            }
                                            if (var10.field2663[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2663[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field19 == var10 && field730 == var35) {
                                                    class325 var43;
                                                    if (field776 == 1 && Statics.field1835 == var35 && Statics.field2462 == var10.field2571) {
                                                        var43 = class255.method1104(var42, var10.field2664[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method1104(var42, var10.field2664[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method469(var10);
                                                    } else if (Statics.field19 == var10 && field730 == var35) {
                                                        int var44 = class55.field462 - field731;
                                                        int var45 = class55.field463 - field871;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field735 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5676(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3843 && var46.field2561 > 0) {
                                                                int var47 = field684 * (class321.field3843 - var39 - var45) / 3;
                                                                if (var47 > field684 * 10) {
                                                                    var47 = field684 * 10;
                                                                }
                                                                if (var47 > var46.field2561) {
                                                                    var47 = var46.field2561;
                                                                }
                                                                var46.field2561 -= var47;
                                                                field871 += var47;
                                                                method469(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3845 && var46.field2561 < var46.field2563 - var46.field2593) {
                                                                int var48 = field684 * (var39 + var45 + 32 - class321.field3845) / 3;
                                                                if (var48 > field684 * 10) {
                                                                    var48 = field684 * 10;
                                                                }
                                                                if (var48 > var46.field2563 - var46.field2593 - var46.field2561) {
                                                                    var48 = var46.field2563 - var46.field2593 - var46.field2561;
                                                                }
                                                                var46.field2561 += var48;
                                                                field871 -= var48;
                                                                method469(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1836 == var10 && field729 == var35) {
                                                        var43.method5676(var38, var39, 128);
                                                    } else {
                                                        var43.method5664(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2637 != null && var35 < 20) {
                                                class325 var49 = var10.method3725(var35);
                                                if (var49 != null) {
                                                    var49.method5664(var38, var39);
                                                } else if (class218.field2669) {
                                                    method469(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2541 == 3) {
                                    int var50;
                                    if (method2627(var10)) {
                                        var50 = var10.field2565;
                                        if (Statics.field270 == var10 && var10.field2567 != 0) {
                                            var50 = var10.field2567;
                                        }
                                    } else {
                                        var50 = var10.field2670;
                                        if (Statics.field270 == var10 && var10.field2566 != 0) {
                                            var50 = var10.field2566;
                                        }
                                    }
                                    if (var10.field2568) {
                                        switch(var10.field2569.field3854) {
                                            case 1:
                                                class321.method5566(var12, var13, var10.field2554, var10.field2593, var10.field2670, var10.field2565);
                                                break;
                                            case 2:
                                                class321.method5567(var12, var13, var10.field2554, var10.field2593, var10.field2670, var10.field2565, 255 - (var10.field2570 & 0xFF), 255 - (var10.field2560 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5565(var12, var13, var10.field2554, var10.field2593, var50);
                                                } else {
                                                    class321.method5564(var12, var13, var10.field2554, var10.field2593, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5569(var12, var13, var10.field2554, var10.field2593, var50);
                                    } else {
                                        class321.method5625(var12, var13, var10.field2554, var10.field2593, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2541 == 4) {
                                    class295 var51 = var10.method3734();
                                    if (var51 != null) {
                                        String var52 = var10.field2600;
                                        int var53;
                                        if (method2627(var10)) {
                                            var53 = var10.field2565;
                                            if (Statics.field270 == var10 && var10.field2567 != 0) {
                                                var53 = var10.field2567;
                                            }
                                            if (var10.field2601.length() > 0) {
                                                var52 = var10.field2601;
                                            }
                                        } else {
                                            var53 = var10.field2670;
                                            if (Statics.field270 == var10 && var10.field2566 != 0) {
                                                var53 = var10.field2566;
                                            }
                                        }
                                        if (var10.field2538 && var10.field2665 != -1) {
                                            class255 var54 = class255.method1055(var10.field2665);
                                            var52 = var54.field3384;
                                            if (var52 == null) {
                                                var52 = class225.field2900;
                                            }
                                            if ((var54.field3395 == 1 || var10.field2666 != 1) && var10.field2666 != -1) {
                                                var52 = class82.method3142(16748608) + var52 + class82.field1118 + " " + 'x' + method1739(var10.field2666);
                                            }
                                        }
                                        if (field789 == var10) {
                                            var52 = class225.field2901;
                                            var53 = var10.field2670;
                                        }
                                        if (!var10.field2538) {
                                            var52 = method480(var52, var10);
                                        }
                                        var51.method4956(var52, var12, var13, var10.field2554, var10.field2593, var53, var10.field2529 ? 0 : -1, var10.field2603, var10.field2604, var10.field2602);
                                    } else if (class218.field2669) {
                                        method469(var10);
                                    }
                                } else if (var10.field2541 == 5) {
                                    if (var10.field2538) {
                                        class325 var56;
                                        if (var10.field2665 == -1) {
                                            var56 = var10.method3723(false);
                                        } else {
                                            var56 = class255.method1104(var10.field2665, var10.field2666, var10.field2578, var10.field2579, var10.field2598, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3872;
                                            int var58 = var56.field3866;
                                            if (var10.field2577) {
                                                class321.method5559(var12, var13, var10.field2554 + var12, var10.field2593 + var13);
                                                int var59 = (var10.field2554 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2593 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2576 != 0) {
                                                            var56.method5688(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2576, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5664(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5676(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5558(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2554 * 4096 / var57;
                                                if (var10.field2576 != 0) {
                                                    var56.method5688(var10.field2554 / 2 + var12, var10.field2593 / 2 + var13, var10.field2576, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5659(var12, var13, var10.field2554, var10.field2593, 256 - (var14 & 0xFF));
                                                } else if (var10.field2554 == var57 && var10.field2593 == var58) {
                                                    var56.method5664(var12, var13);
                                                } else {
                                                    var56.method5672(var12, var13, var10.field2554, var10.field2593);
                                                }
                                            }
                                        } else if (class218.field2669) {
                                            method469(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3723(method2627(var10));
                                        if (var55 != null) {
                                            var55.method5664(var12, var13);
                                        } else if (class218.field2669) {
                                            method469(var10);
                                        }
                                    }
                                } else if (var10.field2541 == 6) {
                                    boolean var64 = method2627(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2587;
                                    } else {
                                        var65 = var10.field2586;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2665 != -1) {
                                        class255 var68 = class255.method1055(var10.field2665);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4326(var10.field2666);
                                            var66 = var69.method4325(1);
                                            if (var66 == null) {
                                                method469(var10);
                                            } else {
                                                var66.method2635();
                                                var67 = var66.field1837 / 2;
                                            }
                                        }
                                    } else if (var10.field2591 == 5) {
                                        if (var10.field2581 == 0) {
                                            var66 = field664.method3686((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field2495.method1062();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3720((class259) null, -1, var64, Statics.field2495.field588);
                                        if (var66 == null && class218.field2669) {
                                            method469(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method1897(var65);
                                        var66 = var10.method3720(var70, var10.field2667, var64, Statics.field2495.field588);
                                        if (var66 == null && class218.field2669) {
                                            method469(var10);
                                        }
                                    }
                                    class131.method2827(var10.field2554 / 2 + var12, var10.field2593 / 2 + var13);
                                    int var71 = var10.field2660 * class131.field1752[var10.field2590] >> 16;
                                    int var72 = var10.field2660 * class131.field1737[var10.field2590] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2538) {
                                            var66.method2635();
                                            if (var10.field2528) {
                                                var66.method2715(0, var10.field2629, var10.field2592, var10.field2590, var10.field2588, var10.field2589 + var67 + var71, var10.field2589 + var72, var10.field2660);
                                            } else {
                                                var66.method2648(0, var10.field2629, var10.field2592, var10.field2590, var10.field2588, var10.field2589 + var67 + var71, var10.field2589 + var72);
                                            }
                                        } else {
                                            var66.method2648(0, var10.field2629, 0, var10.field2590, 0, var71, var72);
                                        }
                                    }
                                    class131.method2818();
                                } else {
                                    if (var10.field2541 == 7) {
                                        class295 var73 = var10.method3734();
                                        if (var73 == null) {
                                            if (class218.field2669) {
                                                method469(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2551; var75++) {
                                            for (int var76 = 0; var76 < var10.field2550; var76++) {
                                                if (var10.field2663[var74] > 0) {
                                                    class255 var77 = class255.method1055(var10.field2663[var74] - 1);
                                                    String var78;
                                                    if (var77.field3395 != 1 && var10.field2664[var74] == 1) {
                                                        var78 = class82.method3142(16748608) + var77.field3384 + class82.field1118;
                                                    } else {
                                                        var78 = class82.method3142(16748608) + var77.field3384 + class82.field1118 + " " + 'x' + method1739(var10.field2664[var74]);
                                                    }
                                                    int var79 = (var10.field2532 + 115) * var76 + var12;
                                                    int var80 = (var10.field2607 + 12) * var75 + var13;
                                                    if (var10.field2603 == 0) {
                                                        var73.method4957(var78, var79, var80, var10.field2670, var10.field2529 ? 0 : -1);
                                                    } else if (var10.field2603 == 1) {
                                                        var73.method4960(var78, var10.field2554 / 2 + var79, var80, var10.field2670, var10.field2529 ? 0 : -1);
                                                    } else {
                                                        var73.method4959(var78, var10.field2554 + var79 - 1, var80, var10.field2670, var10.field2529 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2541 == 8 && Statics.field293 == var10 && field774 == field739) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class295 var83 = Statics.field2382;
                                        String var84 = var10.field2600;
                                        String var85 = method480(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1122);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4952(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3665 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2554 + var12 - 5 - var81;
                                        int var90 = var10.field2593 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5565(var89, var90, var81, var82, 16777120);
                                        class321.method5569(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2600;
                                        int var92 = var83.field3665 + var90 + 2;
                                        String var93 = method480(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1122);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4957(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3665 + 1;
                                        }
                                    }
                                    if (var10.field2541 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2676) {
                                            var96 = var12;
                                            var97 = var10.field2593 + var13;
                                            var98 = var10.field2554 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2554 + var12;
                                            var99 = var10.field2593 + var13;
                                        }
                                        if (var10.field2572 == 1) {
                                            class321.method5575(var96, var97, var98, var99, var10.field2670);
                                        } else {
                                            method238(var96, var97, var98, var99, var10.field2670, var10.field2572);
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

    @ObfuscatedName("o.is(IIIIIIB)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3846;
        int var18 = arg1 - class321.field3843;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2764(var19, var20, var21);
        class131.method2784(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2764(var19, var21, var22);
        class131.method2784(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ad.iu(Ljava/lang/String;Lhy;I)Ljava/lang/String;")
    public static String method480(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1891(method4861(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bc.ih(II)Ljava/lang/String;")
    public static final String method1739(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1119 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method3142(65408) + var1.substring(0, var1.length() - 8) + class225.field2965 + " " + class82.field1121 + var1 + class82.field1124 + class82.field1118;
        } else if (var1.length() > 6) {
            return " " + class82.method3142(16777215) + var1.substring(0, var1.length() - 4) + class225.field2794 + " " + class82.field1121 + var1 + class82.field1124 + class82.field1118;
        } else {
            return " " + class82.method3142(16776960) + var1 + class82.field1118;
        }
    }

    @ObfuscatedName("client.im(ZI)V")
    public final void method1135(boolean arg0) {
        method3031(field783, Statics.field3796, Statics.field434, arg0);
    }

    @ObfuscatedName("client.il(Lhy;B)V")
    public void method1136(class218 arg0) {
        class218 var2 = arg0.field2594 == -1 ? null : class218.method1101(arg0.field2594);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3796;
            var4 = Statics.field434;
        } else {
            var3 = var2.field2554;
            var4 = var2.field2593;
        }
        method3387(arg0, var3, var4, false);
        method627(arg0, var3, var4);
    }

    @ObfuscatedName("gv.iq([Lhy;Lhy;ZI)V")
    public static void method3414(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2680 == 0 ? arg1.field2554 : arg1.field2680;
        int var4 = arg1.field2563 == 0 ? arg1.field2593 : arg1.field2563;
        method1885(arg0, arg1.field2571, var3, var4, arg2);
        if (arg1.field2549 != null) {
            method1885(arg1.field2549, arg1.field2571, var3, var4, arg2);
        }
        class62 var5 = (class62) field899.method5524((long) arg1.field2571);
        if (var5 != null) {
            method3031(var5.field540, var3, var4, arg2);
        }
        if (arg1.field2543 == 1337) {
        }
    }

    @ObfuscatedName("ek.ix(IIIZB)V")
    public static final void method3031(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method3214(arg0)) {
            method1885(Statics.field3631[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ch.if([Lhy;IIIZI)V")
    public static void method1885(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2594 == arg1) {
                method3387(var6, arg2, arg3, arg4);
                method627(var6, arg2, arg3);
                if (var6.field2605 > var6.field2680 - var6.field2554) {
                    var6.field2605 = var6.field2680 - var6.field2554;
                }
                if (var6.field2605 < 0) {
                    var6.field2605 = 0;
                }
                if (var6.field2561 > var6.field2563 - var6.field2593) {
                    var6.field2561 = var6.field2563 - var6.field2593;
                }
                if (var6.field2561 < 0) {
                    var6.field2561 = 0;
                }
                if (var6.field2541 == 0) {
                    method3414(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gh.it(Lhy;IIZB)V")
    public static void method3387(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2554;
        int var5 = arg0.field2593;
        if (arg0.field2555 == 0) {
            arg0.field2554 = arg0.field2550;
        } else if (arg0.field2555 == 1) {
            arg0.field2554 = arg1 - arg0.field2550;
        } else if (arg0.field2555 == 2) {
            arg0.field2554 = arg0.field2550 * arg1 >> 14;
        }
        if (arg0.field2573 == 0) {
            arg0.field2593 = arg0.field2551;
        } else if (arg0.field2573 == 1) {
            arg0.field2593 = arg2 - arg0.field2551;
        } else if (arg0.field2573 == 2) {
            arg0.field2593 = arg0.field2551 * arg2 >> 14;
        }
        if (arg0.field2555 == 4) {
            arg0.field2554 = arg0.field2633 * arg0.field2593 / arg0.field2557;
        }
        if (arg0.field2573 == 4) {
            arg0.field2593 = arg0.field2557 * arg0.field2554 / arg0.field2633;
        }
        if (arg0.field2543 == 1337) {
            field795 = arg0;
        }
        if (arg3 && arg0.field2654 != null && (arg0.field2554 != var4 || arg0.field2593 != var5)) {
            class63 var6 = new class63();
            var6.field550 = arg0;
            var6.field549 = arg0.field2654;
            field721.method4572(var6);
        }
    }

    @ObfuscatedName("ae.ij(Lhy;III)V")
    public static void method627(class218 arg0, int arg1, int arg2) {
        if (arg0.field2575 == 0) {
            arg0.field2539 = arg0.field2548;
        } else if (arg0.field2575 == 1) {
            arg0.field2539 = (arg1 - arg0.field2554) / 2 + arg0.field2548;
        } else if (arg0.field2575 == 2) {
            arg0.field2539 = arg1 - arg0.field2554 - arg0.field2548;
        } else if (arg0.field2575 == 3) {
            arg0.field2539 = arg0.field2548 * arg1 >> 14;
        } else if (arg0.field2575 == 4) {
            arg0.field2539 = (arg0.field2548 * arg1 >> 14) + (arg1 - arg0.field2554) / 2;
        } else {
            arg0.field2539 = arg1 - arg0.field2554 - (arg0.field2548 * arg1 >> 14);
        }
        if (arg0.field2556 == 0) {
            arg0.field2553 = arg0.field2547;
        } else if (arg0.field2556 == 1) {
            arg0.field2553 = (arg2 - arg0.field2593) / 2 + arg0.field2547;
        } else if (arg0.field2556 == 2) {
            arg0.field2553 = arg2 - arg0.field2593 - arg0.field2547;
        } else if (arg0.field2556 == 3) {
            arg0.field2553 = arg0.field2547 * arg2 >> 14;
        } else if (arg0.field2556 == 4) {
            arg0.field2553 = (arg0.field2547 * arg2 >> 14) + (arg2 - arg0.field2593) / 2;
        } else {
            arg0.field2553 = arg2 - arg0.field2593 - (arg0.field2547 * arg2 >> 14);
        }
    }

    @ObfuscatedName("x.iv(Lhy;IIIIIIB)V")
    public static final void method12(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field713) {
            field642 = 32;
        } else {
            field642 = 0;
        }
        field713 = false;
        if (class55.field461 == 1 || !Statics.field282 && class55.field461 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2561 -= 4;
                method469(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2561 += 4;
                method469(arg0);
            } else if (arg5 >= arg1 - field642 && arg5 < field642 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2561 = (arg4 - arg3) * var8 / var9;
                method469(arg0);
                field713 = true;
            }
        }
        if (field821 == 0) {
            return;
        }
        int var10 = arg0.field2554;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2561 += field821 * 45;
            method469(arg0);
        }
    }

    @ObfuscatedName("ga.iz(IIIIIB)V")
    public static final void method3334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field188[0].method5640(arg0, arg1);
        Statics.field188[1].method5640(arg0, arg1 + arg3 - 16);
        class321.method5565(arg0, arg1 + 16, 16, arg3 - 32, field685);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class321.method5565(arg0, arg1 + 16 + var6, 16, var5, field746);
        class321.method5572(arg0, arg1 + 16 + var6, var5, field818);
        class321.method5572(arg0 + 1, arg1 + 16 + var6, var5, field818);
        class321.method5570(arg0, arg1 + 16 + var6, 16, field818);
        class321.method5570(arg0, arg1 + 17 + var6, 16, field818);
        class321.method5572(arg0 + 15, arg1 + 16 + var6, var5, field687);
        class321.method5572(arg0 + 14, arg1 + 17 + var6, var5 - 1, field687);
        class321.method5570(arg0, arg1 + 15 + var6 + var5, 16, field687);
        class321.method5570(arg0 + 1, arg1 + 14 + var6 + var5, 15, field687);
    }

    @ObfuscatedName("cc.ic(II)Ljava/lang/String;")
    public static final String method1891(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dq.iy(Lhy;I)Z")
    public static final boolean method2627(class218 arg0) {
        if (arg0.field2544 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2544.length; var1++) {
            int var2 = method4861(arg0, var1);
            int var3 = arg0.field2659[var1];
            if (arg0.field2544[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2544[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2544[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("kg.id(Lhy;II)I")
    public static final int method4861(class218 arg0, int arg1) {
        if (arg0.field2562 == null || arg1 >= arg0.field2562.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2562[arg1];
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
                    var7 = field714[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field672[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field756[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method1101(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method1055(var12).field3420 || field627)) {
                        for (int var13 = 0; var13 < var11.field2663.length; var13++) {
                            if (var12 + 1 == var11.field2663[var13]) {
                                var7 += var11.field2664[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2494[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2719[field672[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2494[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2495.field593;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2720[var14]) {
                            var7 += field672[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method1101(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method1055(var18).field3420 || field627)) {
                        for (int var19 = 0; var19 < var17.field2663.length; var19++) {
                            if (var18 + 1 == var17.field2663[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field790;
                }
                if (var6 == 12) {
                    var7 = field870;
                }
                if (var6 == 13) {
                    int var20 = class213.field2494[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method504(var22);
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
                    var7 = (Statics.field2495.field971 >> 7) + Statics.field20;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2495.field918 >> 7) + Statics.field553;
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

    @ObfuscatedName("bs.ie(Lhy;Lid;IIZI)V")
    public static final void method1009(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3399;
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
            var7 = class225.field2741;
        }
        if (var6 != -1 && var7 != null) {
            method2328(var7, class82.method3142(16748608) + arg1.field3384, var6, arg1.field3382, arg2, arg0.field2571, arg4);
        }
    }

    @ObfuscatedName("r.ia(Lhy;III)V")
    public static final void method203(class218 arg0, int arg1, int arg2) {
        if (arg0.field2542 == 1) {
            method4934(arg0.field2662, "", 24, 0, 0, arg0.field2571);
        }
        if (arg0.field2542 == 2 && !field744) {
            String var3 = method151(arg0);
            if (var3 != null) {
                method4934(var3, class82.method3142(65280) + arg0.field2537, 25, 0, -1, arg0.field2571);
            }
        }
        if (arg0.field2542 == 3) {
            method4934(class225.field2902, "", 26, 0, 0, arg0.field2571);
        }
        if (arg0.field2542 == 4) {
            method4934(arg0.field2662, "", 28, 0, 0, arg0.field2571);
        }
        if (arg0.field2542 == 5) {
            method4934(arg0.field2662, "", 29, 0, 0, arg0.field2571);
        }
        if (arg0.field2542 == 6 && field789 == null) {
            method4934(arg0.field2662, "", 30, 0, -1, arg0.field2571);
        }
        if (arg0.field2541 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2593; var5++) {
                for (int var6 = 0; var6 < arg0.field2554; var6++) {
                    int var7 = (arg0.field2532 + 32) * var6;
                    int var8 = (arg0.field2607 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2608[var4];
                        var8 += arg0.field2609[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field733 = var4;
                        Statics.field997 = arg0;
                        if (arg0.field2663[var4] > 0) {
                            class255 var9 = class255.method1055(arg0.field2663[var4] - 1);
                            if (field776 == 1 && class219.method3189(method995(arg0))) {
                                if (Statics.field2462 != arg0.field2571 || Statics.field1835 != var4) {
                                    method4934(class225.field2830, field777 + " " + class82.field1123 + " " + class82.method3142(16748608) + var9.field3384, 31, var9.field3382, var4, arg0.field2571);
                                }
                            } else if (!field744 || !class219.method3189(method995(arg0))) {
                                String[] var10 = var9.field3399;
                                int var11 = -1;
                                if (field769) {
                                    boolean var12 = field770 || class46.field374[81];
                                    if (var12) {
                                        var11 = var9.method4333();
                                    }
                                }
                                if (class219.method3189(method995(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method1009(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = method995(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method4934(class225.field2830, class82.method3142(16748608) + var9.field3384, 38, var9.field3382, var4, arg0.field2571);
                                }
                                class219 var10000 = (class219) null;
                                if (class219.method3189(method995(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11 != var16) {
                                            method1009(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method1009(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var17 = arg0.field2611;
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method4934(var17[var18], class82.method3142(16748608) + var9.field3384, var19, var9.field3382, var4, arg0.field2571);
                                        }
                                    }
                                }
                                method4934(class225.field2894, class82.method3142(16748608) + var9.field3384, 1005, var9.field3382, var4, arg0.field2571);
                            } else if ((Statics.field1968 & 0x10) == 16) {
                                method4934(field725, field782 + " " + class82.field1123 + " " + class82.method3142(16748608) + var9.field3384, 32, var9.field3382, var4, arg0.field2571);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2538) {
            return;
        }
        if (field744) {
            int var20 = method995(arg0);
            boolean var21 = (var20 >> 21 & 0x1) != 0;
            if (var21 && (Statics.field1968 & 0x20) == 32) {
                method4934(field725, field782 + " " + class82.field1123 + " " + arg0.field2641, 58, 0, arg0.field2540, arg0.field2571);
            }
            return;
        }
        for (int var22 = 9; var22 >= 5; var22--) {
            String var23;
            if (!class219.method3646(method995(arg0), var22) && arg0.field2645 == null) {
                var23 = null;
            } else if (arg0.field2619 == null || arg0.field2619.length <= var22 || arg0.field2619[var22] == null || arg0.field2619[var22].trim().length() == 0) {
                var23 = null;
            } else {
                var23 = arg0.field2619[var22];
            }
            if (var23 != null) {
                method4934(var23, arg0.field2641, 1007, var22 + 1, arg0.field2540, arg0.field2571);
            }
        }
        String var25 = method151(arg0);
        if (var25 != null) {
            method4934(var25, arg0.field2641, 25, 0, arg0.field2540, arg0.field2571);
        }
        for (int var26 = 4; var26 >= 0; var26--) {
            String var27;
            if (!class219.method3646(method995(arg0), var26) && arg0.field2645 == null) {
                var27 = null;
            } else if (arg0.field2619 == null || arg0.field2619.length <= var26 || arg0.field2619[var26] == null || arg0.field2619[var26].trim().length() == 0) {
                var27 = null;
            } else {
                var27 = arg0.field2619[var26];
            }
            if (var27 != null) {
                method2328(var27, arg0.field2641, 57, var26 + 1, arg0.field2540, arg0.field2571, arg0.field2681);
            }
        }
        int var29 = method995(arg0);
        boolean var30 = (var29 & 0x1) != 0;
        if (var30) {
            method4934(class225.field2745, "", 30, 0, arg0.field2540, arg0.field2571);
        }
    }

    @ObfuscatedName("bc.ip(ZB)V")
    public static void method1741(boolean arg0) {
        field770 = arg0;
    }

    @ObfuscatedName("bf.iw(I)Z")
    public static boolean method993() {
        return field770;
    }

    @ObfuscatedName("dt.ig(IIIIIIII)V")
    public static final void method2520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method3214(arg0)) {
            method936(Statics.field3631[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bp.jd([Lhy;IIIIIIII)V")
    public static final void method936(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2594 == arg1 && (!var9.field2538 || var9.field2541 == 0 || var9.field2625 || method995(var9) != 0 || field797 == var9 || var9.field2543 == 1338)) {
                if (var9.field2538) {
                    if (method3961(var9)) {
                        continue;
                    }
                } else if (var9.field2541 == 0 && Statics.field270 != var9 && method3961(var9)) {
                    continue;
                }
                int var10 = var9.field2539 + arg6;
                int var11 = var9.field2553 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2541 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2541 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2554 + var10;
                    int var19 = var9.field2593 + var11;
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
                    int var22 = var9.field2554 + var10;
                    int var23 = var9.field2593 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field796 == var9) {
                    field804 = true;
                    field805 = var10;
                    field700 = var11;
                }
                boolean var24 = false;
                if (var9.field2613) {
                    switch(field785) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2571 >>> 16 == field786) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field786 == var9.field2571) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2538 || var12 < var14 && var13 < var15) {
                    if (var9.field2538) {
                        if (var9.field2606) {
                            if (class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15) {
                                for (class63 var25 = (class63) field721.method4550(); var25 != null; var25 = (class63) field721.method4573()) {
                                    if (var25.field543) {
                                        var25.method3326();
                                        var25.field550.field2626 = false;
                                    }
                                }
                                if (Statics.field512 == 0) {
                                    field796 = null;
                                    field797 = null;
                                }
                                if (!field758) {
                                    method1860();
                                }
                            }
                        } else if (var9.field2585 && class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15) {
                            for (class63 var26 = (class63) field721.method4550(); var26 != null; var26 = (class63) field721.method4573()) {
                                if (var26.field543 && var26.field550.field2646 == var26.field549) {
                                    var26.method3326();
                                }
                            }
                        }
                    }
                    int var27 = class55.field462;
                    int var28 = class55.field463;
                    if (class55.field469 != 0) {
                        var27 = class55.field470;
                        var28 = class55.field460;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2543 == 1337) {
                        if (!field658 && !field758 && var29) {
                            method3016(var27, var28, var12, var13);
                        }
                    } else if (var9.field2543 == 1338) {
                        method3796(var9, var10, var11);
                    } else {
                        if (var9.field2543 == 1400) {
                            Statics.field75.method5845(class55.field462, class55.field463, var29, var10, var11, var9.field2554, var9.field2593);
                        }
                        if (!field758 && var29) {
                            if (var9.field2543 == 1400) {
                                Statics.field75.method5871(var10, var11, var9.field2554, var9.field2593, var27, var28);
                            } else {
                                method203(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2672.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2672[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2672[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2657 != null) {
                                            var34 = class46.field374[var9.field2672[var30][var33]];
                                        }
                                        if (method202(var9.field2672[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2657 != null && var9.field2657[var30] > field628) {
                                                break;
                                            }
                                            byte var35 = var9.field2615[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field374[86] && !class46.field374[82] && !class46.field374[81]) && ((var35 & 0x2) == 0 || class46.field374[86]) && ((var35 & 0x1) == 0 || class46.field374[82]) && ((var35 & 0x4) == 0 || class46.field374[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1944(var30 + 1, var9.field2571, var9.field2540, var9.field2665, "");
                                    } else if (var30 == 10) {
                                        method2608();
                                        method1070(var9.field2571, var9.field2540, class219.method4061(method995(var9)), var9.field2665);
                                        field725 = method151(var9);
                                        if (field725 == null) {
                                            field725 = class225.field2900;
                                        }
                                        field782 = var9.field2641 + class82.method3142(16777215);
                                    }
                                    int var36 = var9.field2616[var30];
                                    if (var9.field2657 == null) {
                                        var9.field2657 = new int[var9.field2672.length];
                                    }
                                    if (var9.field2617 == null) {
                                        var9.field2617 = new int[var9.field2672.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2657[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2657[var30] == 0) {
                                        var9.field2657[var30] = field628 + var36 + var9.field2617[var30];
                                    } else {
                                        var9.field2657[var30] = field628 + var36;
                                    }
                                }
                                if (!var31 && var9.field2657 != null) {
                                    var9.field2657[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2538) {
                            boolean var37;
                            if (class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field461 == 1 || !Statics.field282 && class55.field461 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field469 == 1 || !Statics.field282 && class55.field469 == 4) && class55.field470 >= var12 && class55.field460 >= var13 && class55.field470 < var14 && class55.field460 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                Statics.method1898(var9, class55.field470 - var10, class55.field460 - var11);
                            }
                            if (var9.field2543 == 1400) {
                                Statics.field75.method5863(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field796 != null && field796 != var9 && var37 && class219.method3795(method995(var9))) {
                                field784 = var9;
                            }
                            if (field797 == var9) {
                                field801 = true;
                                field802 = var10;
                                field707 = var11;
                            }
                            if (var9.field2625) {
                                if (var37 && field821 != 0 && var9.field2646 != null) {
                                    class63 var40 = new class63();
                                    var40.field543 = true;
                                    var40.field550 = var9;
                                    var40.field545 = field821;
                                    var40.field549 = var9.field2646;
                                    field721.method4572(var40);
                                }
                                if (field796 != null || Statics.field19 != null || field758) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2671 && var39) {
                                    var9.field2671 = true;
                                    if (var9.field2627 != null) {
                                        class63 var41 = new class63();
                                        var41.field543 = true;
                                        var41.field550 = var9;
                                        var41.field544 = class55.field470 - var10;
                                        var41.field545 = class55.field460 - var11;
                                        var41.field549 = var9.field2627;
                                        field721.method4572(var41);
                                    }
                                }
                                if (var9.field2671 && var38 && var9.field2628 != null) {
                                    class63 var42 = new class63();
                                    var42.field543 = true;
                                    var42.field550 = var9;
                                    var42.field544 = class55.field462 - var10;
                                    var42.field545 = class55.field463 - var11;
                                    var42.field549 = var9.field2628;
                                    field721.method4572(var42);
                                }
                                if (var9.field2671 && !var38) {
                                    var9.field2671 = false;
                                    if (var9.field2614 != null) {
                                        class63 var43 = new class63();
                                        var43.field543 = true;
                                        var43.field550 = var9;
                                        var43.field544 = class55.field462 - var10;
                                        var43.field545 = class55.field463 - var11;
                                        var43.field549 = var9.field2614;
                                        field824.method4572(var43);
                                    }
                                }
                                if (var38 && var9.field2596 != null) {
                                    class63 var44 = new class63();
                                    var44.field543 = true;
                                    var44.field550 = var9;
                                    var44.field544 = class55.field462 - var10;
                                    var44.field545 = class55.field463 - var11;
                                    var44.field549 = var9.field2596;
                                    field721.method4572(var44);
                                }
                                if (!var9.field2626 && var37) {
                                    var9.field2626 = true;
                                    if (var9.field2631 != null) {
                                        class63 var45 = new class63();
                                        var45.field543 = true;
                                        var45.field550 = var9;
                                        var45.field544 = class55.field462 - var10;
                                        var45.field545 = class55.field463 - var11;
                                        var45.field549 = var9.field2631;
                                        field721.method4572(var45);
                                    }
                                }
                                if (var9.field2626 && var37 && var9.field2632 != null) {
                                    class63 var46 = new class63();
                                    var46.field543 = true;
                                    var46.field550 = var9;
                                    var46.field544 = class55.field462 - var10;
                                    var46.field545 = class55.field463 - var11;
                                    var46.field549 = var9.field2632;
                                    field721.method4572(var46);
                                }
                                if (var9.field2626 && !var37) {
                                    var9.field2626 = false;
                                    if (var9.field2640 != null) {
                                        class63 var47 = new class63();
                                        var47.field543 = true;
                                        var47.field550 = var9;
                                        var47.field544 = class55.field462 - var10;
                                        var47.field545 = class55.field463 - var11;
                                        var47.field549 = var9.field2640;
                                        field824.method4572(var47);
                                    }
                                }
                                if (var9.field2644 != null) {
                                    class63 var48 = new class63();
                                    var48.field550 = var9;
                                    var48.field549 = var9.field2644;
                                    field823.method4572(var48);
                                }
                                if (var9.field2638 != null && field810 > var9.field2673) {
                                    if (var9.field2647 == null || field810 - var9.field2673 > 32) {
                                        class63 var53 = new class63();
                                        var53.field550 = var9;
                                        var53.field549 = var9.field2638;
                                        field721.method4572(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2673; var49 < field810; var49++) {
                                            int var50 = field809[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2647.length; var51++) {
                                                if (var9.field2647[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field550 = var9;
                                                    var52.field549 = var9.field2638;
                                                    field721.method4572(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2673 = field810;
                                }
                                if (var9.field2536 != null && field812 > var9.field2674) {
                                    if (var9.field2678 == null || field812 - var9.field2674 > 32) {
                                        class63 var58 = new class63();
                                        var58.field550 = var9;
                                        var58.field549 = var9.field2536;
                                        field721.method4572(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2674; var54 < field812; var54++) {
                                            int var55 = field811[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2678.length; var56++) {
                                                if (var9.field2678[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field550 = var9;
                                                    var57.field549 = var9.field2536;
                                                    field721.method4572(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2674 = field812;
                                }
                                if (var9.field2642 != null && field814 > var9.field2675) {
                                    if (var9.field2643 == null || field814 - var9.field2675 > 32) {
                                        class63 var63 = new class63();
                                        var63.field550 = var9;
                                        var63.field549 = var9.field2642;
                                        field721.method4572(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2675; var59 < field814; var59++) {
                                            int var60 = field813[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2643.length; var61++) {
                                                if (var9.field2643[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field550 = var9;
                                                    var62.field549 = var9.field2642;
                                                    field721.method4572(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2675 = field814;
                                }
                                if (field815 > var9.field2530 && var9.field2558 != null) {
                                    class63 var64 = new class63();
                                    var64.field550 = var9;
                                    var64.field549 = var9.field2558;
                                    field721.method4572(var64);
                                }
                                if (field816 > var9.field2530 && var9.field2649 != null) {
                                    class63 var65 = new class63();
                                    var65.field550 = var9;
                                    var65.field549 = var9.field2649;
                                    field721.method4572(var65);
                                }
                                if (field817 > var9.field2530 && var9.field2650 != null) {
                                    class63 var66 = new class63();
                                    var66.field550 = var9;
                                    var66.field549 = var9.field2650;
                                    field721.method4572(var66);
                                }
                                if (field867 > var9.field2530 && var9.field2655 != null) {
                                    class63 var67 = new class63();
                                    var67.field550 = var9;
                                    var67.field549 = var9.field2655;
                                    field721.method4572(var67);
                                }
                                if (field819 > var9.field2530 && var9.field2656 != null) {
                                    class63 var68 = new class63();
                                    var68.field550 = var9;
                                    var68.field549 = var9.field2656;
                                    field721.method4572(var68);
                                }
                                if (field671 > var9.field2530 && var9.field2651 != null) {
                                    class63 var69 = new class63();
                                    var69.field550 = var9;
                                    var69.field549 = var9.field2651;
                                    field721.method4572(var69);
                                }
                                var9.field2530 = field808;
                                if (var9.field2648 != null) {
                                    for (int var70 = 0; var70 < field845; var70++) {
                                        class63 var71 = new class63();
                                        var71.field550 = var9;
                                        var71.field554 = field847[var70];
                                        var71.field542 = field846[var70];
                                        var71.field549 = var9.field2648;
                                        field721.method4572(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2538) {
                            if (field796 != null || Statics.field19 != null || field758) {
                                continue;
                            }
                            if ((var9.field2661 >= 0 || var9.field2566 != 0) && class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15) {
                                if (var9.field2661 >= 0) {
                                    Statics.field270 = arg0[var9.field2661];
                                } else {
                                    Statics.field270 = var9;
                                }
                            }
                            if (var9.field2541 == 8 && class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15) {
                                Statics.field293 = var9;
                            }
                            if (var9.field2563 > var9.field2593) {
                                method12(var9, var9.field2554 + var10, var11, var9.field2593, var9.field2563, class55.field462, class55.field463);
                            }
                        }
                        if (var9.field2541 == 0) {
                            method936(arg0, var9.field2571, var12, var13, var14, var15, var10 - var9.field2605, var11 - var9.field2561);
                            if (var9.field2549 != null) {
                                method936(var9.field2549, var9.field2571, var12, var13, var14, var15, var10 - var9.field2605, var11 - var9.field2561);
                            }
                            class62 var72 = (class62) field899.method5524((long) var9.field2571);
                            if (var72 != null) {
                                if (var72.field538 == 0 && class55.field462 >= var12 && class55.field463 >= var13 && class55.field462 < var14 && class55.field463 < var15 && !field758) {
                                    for (class63 var73 = (class63) field721.method4550(); var73 != null; var73 = (class63) field721.method4573()) {
                                        if (var73.field543) {
                                            var73.method3326();
                                            var73.field550.field2626 = false;
                                        }
                                    }
                                    if (Statics.field512 == 0) {
                                        field796 = null;
                                        field797 = null;
                                    }
                                    if (!field758) {
                                        method1860();
                                    }
                                }
                                method2520(var72.field540, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.jv(IS)Z")
    public static boolean method202(int arg0) {
        for (int var1 = 0; var1 < field845; var1++) {
            if (field847[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("m.jo(III)V")
    public static final void method233(int arg0, int arg1) {
        if (class218.method3214(arg0)) {
            method473(Statics.field3631[arg0], arg1);
        }
    }

    @ObfuscatedName("as.jf([Lhy;IB)V")
    public static final void method473(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2541 == 0) {
                    if (var3.field2549 != null) {
                        method473(var3.field2549, arg1);
                    }
                    class62 var4 = (class62) field899.method5524((long) var3.field2571);
                    if (var4 != null) {
                        method233(var4.field540, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2652 != null) {
                    class63 var5 = new class63();
                    var5.field550 = var3;
                    var5.field549 = var3.field2652;
                    class77.method1954(var5);
                }
                if (arg1 == 1 && var3.field2653 != null) {
                    if (var3.field2540 >= 0) {
                        class218 var6 = class218.method1101(var3.field2571);
                        if (var6 == null || var6.field2549 == null || var3.field2540 >= var6.field2549.length || var6.field2549[var3.field2540] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field550 = var3;
                    var7.field549 = var3.field2653;
                    class77.method1954(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.jn(I)V")
    public final void method1137() {
        method469(field796);
        Statics.field512++;
        if (field804 && field801) {
            int var1 = class55.field462;
            int var2 = class55.field463;
            int var3 = var1 - field876;
            int var4 = var2 - field799;
            if (var3 < field802) {
                var3 = field802;
            }
            if (field796.field2554 + var3 > field802 + field797.field2554) {
                var3 = field802 + field797.field2554 - field796.field2554;
            }
            if (var4 < field707) {
                var4 = field707;
            }
            if (field796.field2593 + var4 > field707 + field797.field2593) {
                var4 = field707 + field797.field2593 - field796.field2593;
            }
            int var5 = var3 - field805;
            int var6 = var4 - field700;
            int var7 = field796.field2610;
            if (Statics.field512 > field796.field2622 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field807 = true;
            }
            int var8 = field797.field2605 + (var3 - field802);
            int var9 = field797.field2561 + (var4 - field707);
            if (field796.field2634 != null && field807) {
                class63 var10 = new class63();
                var10.field550 = field796;
                var10.field544 = var8;
                var10.field545 = var9;
                var10.field549 = field796.field2634;
                class77.method1954(var10);
            }
            if (class55.field461 == 0) {
                if (field807) {
                    if (field796.field2635 != null) {
                        class63 var11 = new class63();
                        var11.field550 = field796;
                        var11.field544 = var8;
                        var11.field545 = var9;
                        var11.field547 = field784;
                        var11.field549 = field796.field2635;
                        class77.method1954(var11);
                    }
                    if (field784 != null && method4933(field796) != null) {
                        class188 var12 = class188.method1894(class184.field2243, field669.field1279);
                        var12.field2313.method5150(field784.field2571);
                        var12.field2313.method5138(field796.field2665);
                        var12.field2313.method5140(field784.field2665);
                        var12.field2313.method5139(field784.field2540);
                        var12.field2313.method5139(field796.field2540);
                        var12.field2313.method5148(field796.field2571);
                        field669.method2075(var12);
                    }
                } else if (this.method1133()) {
                    this.method1157(field876 + field805, field799 + field700);
                } else if (field738 > 0) {
                    int var13 = field876 + field805;
                    int var14 = field799 + field700;
                    class83 var15 = Statics.field1412;
                    method4224(var15.field1132, var15.field1130, var15.field1129, var15.field1136, var15.field1133, var15.field1133, var13, var14);
                    Statics.field1412 = null;
                }
                field796 = null;
            }
        } else if (Statics.field512 > 1) {
            field796 = null;
        }
    }

    @ObfuscatedName("ff.jk(II)V")
    public static void method3160(int arg0) {
        Statics.field1412 = new class83();
        Statics.field1412.field1132 = field761[arg0];
        Statics.field1412.field1130 = field762[arg0];
        Statics.field1412.field1129 = field869[arg0];
        Statics.field1412.field1136 = field754[arg0];
        Statics.field1412.field1133 = field765[arg0];
    }

    @ObfuscatedName("al.js(Lhy;B)V")
    public static void method469(class218 arg0) {
        if (field827 == arg0.field2677) {
            field828[arg0.field2621] = true;
        }
    }

    @ObfuscatedName("ao.ju(Lhy;I)Lhy;")
    public static class218 method326(class218 arg0) {
        class218 var1 = method4933(arg0);
        if (var1 == null) {
            var1 = arg0.field2620;
        }
        return var1;
    }

    @ObfuscatedName("ac.jc(IB)V")
    public static final void method684(int arg0) {
        if (!class218.method3214(arg0)) {
            return;
        }
        class218[] var1 = Statics.field3631[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2667 = 0;
                var3.field2668 = 0;
            }
        }
    }

    @ObfuscatedName("b.jg([Lhy;II)V")
    public static final void method247(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2594 == arg1 && (!var3.field2538 || !method3961(var3))) {
                if (var3.field2541 == 0) {
                    if (!var3.field2538 && method3961(var3) && Statics.field270 != var3) {
                        continue;
                    }
                    method247(arg0, var3.field2571);
                    if (var3.field2549 != null) {
                        method247(var3.field2549, var3.field2571);
                    }
                    class62 var4 = (class62) field899.method5524((long) var3.field2571);
                    if (var4 != null) {
                        int var5 = var4.field540;
                        if (class218.method3214(var5)) {
                            method247(Statics.field3631[var5], -1);
                        }
                    }
                }
                if (var3.field2541 == 6) {
                    if (var3.field2586 != -1 || var3.field2587 != -1) {
                        boolean var6 = method2627(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2587;
                        } else {
                            var7 = var3.field2586;
                        }
                        if (var7 != -1) {
                            class259 var8 = class259.method1897(var7);
                            var3.field2668 += field684;
                            while (var3.field2668 > var8.field3485[var3.field2667]) {
                                var3.field2668 -= var8.field3485[var3.field2667];
                                var3.field2667++;
                                if (var3.field2667 >= var8.field3490.length) {
                                    var3.field2667 -= var8.field3494;
                                    if (var3.field2667 < 0 || var3.field2667 >= var8.field3490.length) {
                                        var3.field2667 = 0;
                                    }
                                }
                                method469(var3);
                            }
                        }
                    }
                    if (var3.field2595 != 0 && !var3.field2538) {
                        int var9 = var3.field2595 >> 16;
                        int var10 = var3.field2595 << 16 >> 16;
                        int var11 = field684 * var9;
                        int var12 = field684 * var10;
                        var3.field2590 = var3.field2590 + var11 & 0x7FF;
                        var3.field2629 = var3.field2629 + var12 & 0x7FF;
                        method469(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.jw(Lhy;I)V")
    public static final void method129(class218 arg0) {
        int var1 = arg0.field2543;
        if (var1 == 324) {
            if (field704 == -1) {
                field704 = arg0.field2574;
                field889 = arg0.field2546;
            }
            if (field664.field2507) {
                arg0.field2574 = field704;
            } else {
                arg0.field2574 = field889;
            }
        } else if (var1 == 325) {
            if (field704 == -1) {
                field704 = arg0.field2574;
                field889 = arg0.field2546;
            }
            if (field664.field2507) {
                arg0.field2574 = field889;
            } else {
                arg0.field2574 = field704;
            }
        } else if (var1 == 327) {
            arg0.field2590 = 150;
            arg0.field2629 = (int) (Math.sin((double) field628 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2591 = 5;
            arg0.field2581 = 0;
        } else if (var1 == 328) {
            arg0.field2590 = 150;
            arg0.field2629 = (int) (Math.sin((double) field628 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2591 = 5;
            arg0.field2581 = 1;
        }
    }

    @ObfuscatedName("v.jq(B)V")
    public static final void method59() {
        class188 var0 = class188.method1894(class184.field2263, field669.field1279);
        field669.method2075(var0);
        for (class62 var1 = (class62) field899.method5516(); var1 != null; var1 = (class62) field899.method5518()) {
            if (var1.field538 == 0 || var1.field538 == 3) {
                method4196(var1, true);
            }
        }
        if (field789 != null) {
            method469(field789);
            field789 = null;
        }
    }

    @ObfuscatedName("kk.ji(IIII)Lbw;")
    public static final class62 method5471(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field540 = arg1;
        var3.field538 = arg2;
        field899.method5517(var3, (long) arg0);
        method684(arg1);
        class218 var4 = class218.method1101(arg0);
        method469(var4);
        if (field789 != null) {
            method469(field789);
            field789 = null;
        }
        for (int var5 = 0; var5 < field738; var5++) {
            int var6 = field869[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field738 - 1) {
                    for (int var8 = var5; var8 < field738 - 1; var8++) {
                        field765[var8] = field765[var8 + 1];
                        field766[var8] = field766[var8 + 1];
                        field869[var8] = field869[var8 + 1];
                        field754[var8] = field754[var8 + 1];
                        field761[var8] = field761[var8 + 1];
                        field762[var8] = field762[var8 + 1];
                        field767[var8] = field767[var8 + 1];
                    }
                }
                var5--;
                field738--;
            }
        }
        Statics.method426();
        method3414(Statics.field3631[arg0 >> 16], var4, false);
        class77.method2626(arg1);
        if (field783 != -1) {
            method233(field783, 1);
        }
        return var3;
    }

    @ObfuscatedName("iv.jm(Lbw;ZI)V")
    public static final void method4196(class62 arg0, boolean arg1) {
        int var2 = arg0.field540;
        int var3 = (int) arg0.field2096;
        arg0.method3326();
        if (arg1) {
            class218.method2522(var2);
        }
        method207(var2);
        class218 var4 = class218.method1101(var3);
        if (var4 != null) {
            method469(var4);
        }
        for (int var5 = 0; var5 < field738; var5++) {
            int var6 = field869[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field738 - 1) {
                    for (int var8 = var5; var8 < field738 - 1; var8++) {
                        field765[var8] = field765[var8 + 1];
                        field766[var8] = field766[var8 + 1];
                        field869[var8] = field869[var8 + 1];
                        field754[var8] = field754[var8 + 1];
                        field761[var8] = field761[var8 + 1];
                        field762[var8] = field762[var8 + 1];
                        field767[var8] = field767[var8 + 1];
                    }
                }
                var5--;
                field738--;
            }
        }
        Statics.method426();
        if (field783 != -1) {
            method233(field783, 1);
        }
    }

    @ObfuscatedName("am.ja(Lhy;S)Z")
    public static final boolean method699(class218 arg0) {
        int var1 = arg0.field2543;
        if (var1 == 205) {
            field670 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field664.method3682(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field664.method3681(var4, var5 == 1);
        }
        if (var1 == 324) {
            field664.method3683(false);
        }
        if (var1 == 325) {
            field664.method3683(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method1894(class184.field2264, field669.field1279);
            field664.method3684(var6.field2313);
            field669.method2075(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bd.je(Lhy;IIIB)V")
    public static final void method1049(class218 arg0, int arg1, int arg2, int arg3) {
        method3014();
        class212 var4 = arg0.method3727(false);
        if (var4 == null) {
            return;
        }
        class321.method5558(arg1, arg2, var4.field2489 + arg1, var4.field2491 + arg2);
        if (field856 == 2 || field856 == 5) {
            class321.method5577(arg1, arg2, 0, var4.field2488, var4.field2490);
        } else {
            int var5 = field692 & 0x7FF;
            int var6 = Statics.field2495.field971 / 32 + 48;
            int var7 = 464 - Statics.field2495.field918 / 32;
            Statics.field535.method5686(arg1, arg2, var4.field2489, var4.field2491, var6, var7, var5, 256, var4.field2488, var4.field2490);
            for (int var8 = 0; var8 < field850; var8++) {
                int var9 = field851[var8] * 4 + 2 - Statics.field2495.field971 / 32;
                int var10 = field633[var8] * 4 + 2 - Statics.field2495.field918 / 32;
                method2068(arg1, arg2, var9, var10, field868[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field820[Statics.field562][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2495.field971 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2495.field918 / 32;
                        method2068(arg1, arg2, var14, var15, Statics.field357[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field665; var16++) {
                class80 var17 = field634[field875[var16]];
                if (var17 != null && var17.method1066()) {
                    class257 var18 = var17.field1098;
                    if (var18 != null && var18.field3465 != null) {
                        var18 = var18.method4403();
                    }
                    if (var18 != null && var18.field3446 && var18.field3468) {
                        int var19 = var17.field971 / 32 - Statics.field2495.field971 / 32;
                        int var20 = var17.field918 / 32 - Statics.field2495.field918 / 32;
                        method2068(arg1, arg2, var19, var20, Statics.field357[1], var4);
                    }
                }
            }
            int var21 = class90.field1227;
            int[] var22 = class90.field1224;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field625[var22[var23]];
                if (var24 != null && var24.method1066() && !var24.field591 && Statics.field2495 != var24) {
                    int var25 = var24.field971 / 32 - Statics.field2495.field971 / 32;
                    int var26 = var24.field918 / 32 - Statics.field2495.field918 / 32;
                    boolean var27 = false;
                    if (Statics.field2495.field607 != 0 && var24.field607 != 0 && Statics.field2495.field607 == var24.field607) {
                        var27 = true;
                    }
                    if (var24.method1083()) {
                        method2068(arg1, arg2, var25, var26, Statics.field357[3], var4);
                    } else if (var27) {
                        method2068(arg1, arg2, var25, var26, Statics.field357[4], var4);
                    } else if (var24.method1058()) {
                        method2068(arg1, arg2, var25, var26, Statics.field357[5], var4);
                    } else {
                        method2068(arg1, arg2, var25, var26, Statics.field357[2], var4);
                    }
                }
            }
            if (field881 != 0 && field628 % 20 < 10) {
                if (field881 == 1 && field643 >= 0 && field643 < field634.length) {
                    class80 var28 = field634[field643];
                    if (var28 != null) {
                        int var29 = var28.field971 / 32 - Statics.field2495.field971 / 32;
                        int var30 = var28.field918 / 32 - Statics.field2495.field918 / 32;
                        method1905(arg1, arg2, var29, var30, Statics.field119[1], var4);
                    }
                }
                if (field881 == 2) {
                    int var31 = field645 * 4 - Statics.field20 * 4 + 2 - Statics.field2495.field971 / 32;
                    int var32 = field646 * 4 - Statics.field553 * 4 + 2 - Statics.field2495.field918 / 32;
                    method1905(arg1, arg2, var31, var32, Statics.field119[1], var4);
                }
                if (field881 == 10 && field644 >= 0 && field644 < field625.length) {
                    class67 var33 = field625[field644];
                    if (var33 != null) {
                        int var34 = var33.field971 / 32 - Statics.field2495.field971 / 32;
                        int var35 = var33.field918 / 32 - Statics.field2495.field918 / 32;
                        method1905(arg1, arg2, var34, var35, Statics.field119[1], var4);
                    }
                }
            }
            if (field854 != 0) {
                int var36 = field854 * 4 + 2 - Statics.field2495.field971 / 32;
                int var37 = field855 * 4 + 2 - Statics.field2495.field918 / 32;
                method2068(arg1, arg2, var36, var37, Statics.field119[0], var4);
            }
            if (!Statics.field2495.field591) {
                class321.method5565(var4.field2489 / 2 + arg1 - 1, var4.field2491 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field829[arg3] = true;
    }

    @ObfuscatedName("bs.jj(Lhy;IIII)V")
    public static final void method1010(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3727(false);
        if (var4 == null) {
            return;
        }
        if (field856 < 3) {
            Statics.field1918.method5686(arg1, arg2, var4.field2489, var4.field2491, 25, 25, field692, 256, var4.field2488, var4.field2490);
        } else {
            class321.method5577(arg1, arg2, 0, var4.field2488, var4.field2490);
        }
    }

    @ObfuscatedName("cl.jb(IIIILli;Lhi;I)V")
    public static final void method1905(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2068(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field692 & 0x7FF;
        int var8 = class131.field1752[var7];
        int var9 = class131.field1737[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2489 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3644.method5687(arg5.field2489 / 2 + arg0 - var17 / 2 + var15, arg5.field2491 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("cs.jx(IIIILli;Lhi;I)V")
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field692 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1752[var6];
        int var9 = class131.field1737[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5685(arg5.field2489 / 2 + var10 - arg4.field3872 / 2, arg5.field2491 / 2 - var11 - arg4.field3866 / 2, arg0, arg1, arg5.field2489, arg5.field2491, arg5.field2488, arg5.field2490);
        } else {
            arg4.method5664(arg5.field2489 / 2 + arg0 + var10 - arg4.field3872 / 2, arg5.field2491 / 2 + arg1 - var11 - arg4.field3866 / 2);
        }
    }

    @ObfuscatedName("es.jt(I)V")
    public static final void method3032() {
        for (int var0 = 0; var0 < class90.field1227; var0++) {
            class67 var1 = field625[class90.field1224[var0]];
            var1.method1056();
        }
        class92.method3382();
        if (Statics.field73 != null) {
            Statics.field73.method4844();
        }
    }

    @ObfuscatedName("bl.jy(B)V")
    public static final void method1579() {
        Iterator var0 = class92.field1244.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1026();
        }
        if (Statics.field73 != null) {
            Statics.field73.method4845();
        }
    }

    @ObfuscatedName("ax.jz(I)V")
    public static final void method503() {
        for (int var0 = 0; var0 < class90.field1227; var0++) {
            class67 var1 = field625[class90.field1224[var0]];
            var1.method1075();
        }
    }

    @ObfuscatedName("j.jp(I)V")
    public static final void method52() {
        field816 = field808;
    }

    @ObfuscatedName("bd.kg(I)V")
    public static final void method1050() {
        field817 = field808;
        Statics.field537 = true;
    }

    @ObfuscatedName("gv.kd(Ljava/lang/String;I)V")
    public static final void method3407(String arg0) {
        if (Statics.field73 != null) {
            class188 var1 = class188.method1894(class184.field2219, field669.field1279);
            var1.field2313.method5087(class300.method2018(arg0));
            var1.field2313.method5094(arg0);
            field669.method2075(var1);
        }
    }

    @ObfuscatedName("al.kr(Ljava/lang/String;B)V")
    public static final void method467(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method1894(class184.field2253, field669.field1279);
            var1.field2313.method5087(class300.method2018(arg0));
            var1.field2313.method5094(arg0);
            field669.method2075(var1);
        }
    }

    @ObfuscatedName("au.kh(B)V")
    public static final void method736() {
        class188 var0 = class188.method1894(class184.field2253, field669.field1279);
        var0.field2313.method5087(0);
        field669.method2075(var0);
    }

    @ObfuscatedName("k.kb(IS)V")
    public static void method207(int arg0) {
        for (class180 var1 = (class180) field705.method5516(); var1 != null; var1 = (class180) field705.method5518()) {
            if ((long) arg0 == (var1.field2096 >> 48 & 0xFFFFL)) {
                var1.method3326();
            }
        }
    }

    @ObfuscatedName("bm.kn(Lhy;S)I")
    public static int method995(class218 arg0) {
        class180 var1 = (class180) field705.method5524(((long) arg0.field2571 << 32) + (long) arg0.field2540);
        return var1 == null ? arg0.field2639 : var1.field2093;
    }

    @ObfuscatedName("kn.ku(Lhy;I)Lhy;")
    public static class218 method4933(class218 arg0) {
        int var1 = class219.method960(method995(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class218.method1101(arg0.field2594);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("in.kj(Lhy;B)Z")
    public static boolean method3961(class218 arg0) {
        return arg0.field2559;
    }

    @ObfuscatedName("i.kf(Lhy;B)Ljava/lang/String;")
    public static String method151(class218 arg0) {
        if (class219.method4061(method995(arg0)) == 0) {
            return null;
        } else if (arg0.field2624 == null || arg0.field2624.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2624;
        }
    }

    @ObfuscatedName("j.ko(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method53(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field626 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field626 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field626 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field626 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field626 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field218 != null) {
            var3 = "/p=" + Statics.field218;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field361 + "/a=" + Statics.field566 + var3 + "/";
    }

    @ObfuscatedName("gw.km(Ljava/lang/String;I)V")
    public static void method3338(String arg0) {
        Statics.field218 = arg0;
        try {
            String var1 = Statics.field2505.getParameter(Integer.toString(18));
            String var2 = Statics.field2505.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class208.method466(Statics.method2303() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field2505;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ar.kv(Ljava/lang/String;ZI)V")
    public static void method677(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3374; var5++) {
            class255 var6 = class255.method1055(var5);
            if ((!arg1 || var6.field3415) && var6.field3390 == -1 && var6.field3384.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field77 = -1;
                    Statics.field1850 = null;
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
        Statics.field1850 = var3;
        Statics.field505 = 0;
        Statics.field77 = var4;
        String[] var9 = new String[Statics.field77];
        for (int var10 = 0; var10 < Statics.field77; var10++) {
            var9[var10] = class255.method1055(var3[var10]).field3384;
        }
        class190.method458(var9, Statics.field1850);
    }

    @ObfuscatedName("go.kt(Lkz;IB)V")
    public static void method3394(class300 arg0, int arg1) {
        byte[] var2 = arg0.field3694;
        if (field663 == null) {
            field663 = new byte[24];
        }
        class301.method5343(var2, arg1, field663, 0, 24);
        class168.method702(arg0, arg1);
    }

    @ObfuscatedName("iw.kz(Lkz;I)V")
    public static void method4437(class300 arg0) {
        if (field663 != null) {
            arg0.method5169(field663, 0, field663.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class168.field2018.method6071(0L);
            class168.field2018.method6073(var1);
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
        arg0.method5169(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kp(B)Ljt;")
    public class283 method1138() {
        return Statics.field2495 == null ? null : Statics.field2495.field596;
    }

    @ObfuscatedName("bi.ky(I)Z")
    public static boolean method966() {
        return field792 >= 2;
    }

    @ObfuscatedName("ci.ki(II)V")
    public static void method2107(int arg0) {
        field697 = arg0;
    }

    @ObfuscatedName("fm.kw(B)V")
    public static void method3178() {
        field669.method2075(class188.method1894(class184.field2255, field669.field1279));
        field697 = 0;
    }

    @ObfuscatedName("p.ks(B)V")
    public static void method130() {
        if (field697 == 1) {
            field825 = true;
        }
    }

    @ObfuscatedName("jr.ka(I)V")
    public static void method4634() {
        if (!field825 || Statics.field2495 == null) {
            return;
        }
        int var0 = Statics.field2495.field940[0];
        int var1 = Statics.field2495.field974[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1215 = Statics.field2495.field971;
        int var2 = method564(Statics.field2495.field971, Statics.field2495.field918, Statics.field562) - field698;
        if (var2 < Statics.field581) {
            Statics.field581 = var2;
        }
        Statics.field2466 = Statics.field2495.field918;
        field825 = false;
    }

    @ObfuscatedName("j.kq(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method54(String arg0) {
        class229[] var1 = class229.method3710();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3068 != -1 && arg0.startsWith(class82.method3819(var3.field3068))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3068).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("g.kx(I)V")
    public static void method21() {
        if (Statics.field1134 == null) {
            return;
        }
        field893 = field628;
        Statics.field1134.method3970();
        for (int var0 = 0; var0 < field625.length; var0++) {
            if (field625[var0] != null) {
                Statics.field1134.method3994((field625[var0].field971 >> 7) + Statics.field20, (field625[var0].field918 >> 7) + Statics.field553);
            }
        }
    }
}

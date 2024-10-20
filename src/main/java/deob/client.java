package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class291 {

    @ObfuscatedName("client.w")
    public static class167[] field729 = new class167[4];

    @ObfuscatedName("client.as")
    public static boolean field878 = true;

    @ObfuscatedName("client.bw")
    public static int field738 = 1;

    @ObfuscatedName("client.bg")
    public static int field645 = 0;

    @ObfuscatedName("client.bs")
    public static int field646 = 0;

    @ObfuscatedName("client.br")
    public static boolean field647 = false;

    @ObfuscatedName("client.bq")
    public static boolean field782 = false;

    @ObfuscatedName("client.bp")
    public static int field649 = 0;

    @ObfuscatedName("client.bj")
    public static int field650 = -1;

    @ObfuscatedName("client.bn")
    public static boolean field873 = false;

    @ObfuscatedName("client.bl")
    public static int field652 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field653 = true;

    @ObfuscatedName("client.ct")
    public static int field654 = 0;

    @ObfuscatedName("client.cb")
    public static long field655 = 1L;

    @ObfuscatedName("client.cm")
    public static int field813 = -1;

    @ObfuscatedName("client.cr")
    public static int field657 = -1;

    @ObfuscatedName("client.ck")
    public static long field658 = -1L;

    @ObfuscatedName("client.ch")
    public static boolean field659 = true;

    @ObfuscatedName("client.cp")
    public static boolean field660 = false;

    @ObfuscatedName("client.cj")
    public static int field661 = 0;

    @ObfuscatedName("client.co")
    public static int field662 = 0;

    @ObfuscatedName("client.cz")
    public static int field663 = 0;

    @ObfuscatedName("client.cx")
    public static int field651 = 0;

    @ObfuscatedName("client.cy")
    public static int field853 = 0;

    @ObfuscatedName("client.ca")
    public static int field851 = 0;

    @ObfuscatedName("client.cw")
    public static int field872 = 0;

    @ObfuscatedName("client.cs")
    public static int field668 = 0;

    @ObfuscatedName("client.cu")
    public static int field669 = 0;

    @ObfuscatedName("client.cc")
    public static class79 field733 = class79.field1127;

    @ObfuscatedName("client.di")
    public static class79 field842 = class79.field1127;

    @ObfuscatedName("client.dr")
    public static int field672 = 0;

    @ObfuscatedName("client.dl")
    public static int field673 = 0;

    @ObfuscatedName("client.du")
    public static int field716 = 0;

    @ObfuscatedName("client.ey")
    public static int field717 = 0;

    @ObfuscatedName("client.ep")
    public static int field676 = 0;

    @ObfuscatedName("client.eh")
    public static int field887 = 0;

    @ObfuscatedName("client.ec")
    public static int field678 = 0;

    @ObfuscatedName("client.eg")
    public static int field679 = 0;

    @ObfuscatedName("client.er")
    public static class149 field680 = class149.field1964;

    @ObfuscatedName("client.ef")
    public static boolean field681 = false;

    @ObfuscatedName("client.eb")
    public static class83 field682 = new class83();

    @ObfuscatedName("client.ei")
    public static byte[] field683 = null;

    @ObfuscatedName("client.em")
    public static class74[] field684 = new class74[32768];

    @ObfuscatedName("client.es")
    public static int field746 = 0;

    @ObfuscatedName("client.et")
    public static int[] field761 = new int[32768];

    @ObfuscatedName("client.el")
    public static int field765 = 0;

    @ObfuscatedName("client.fo")
    public static int[] field838 = new int[250];

    @ObfuscatedName("client.fu")
    public static final class90 field689 = new class90();

    @ObfuscatedName("client.fz")
    public static int field690 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field691 = false;

    @ObfuscatedName("client.fy")
    public static boolean field902 = true;

    @ObfuscatedName("client.fd")
    public static class283 field724 = new class283();

    @ObfuscatedName("client.fh")
    public static HashMap field694 = new HashMap();

    @ObfuscatedName("client.fq")
    public static int field811 = 0;

    @ObfuscatedName("client.fa")
    public static int field686 = 1;

    @ObfuscatedName("client.fe")
    public static int field697 = 0;

    @ObfuscatedName("client.fc")
    public static int field698 = 1;

    @ObfuscatedName("client.fx")
    public static int field699 = 0;

    @ObfuscatedName("client.gh")
    public static boolean field701 = false;

    @ObfuscatedName("client.gp")
    public static int[][][] field702 = new int[4][13][13];

    @ObfuscatedName("client.gf")
    public static final int[] field805 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ga")
    public static int field665 = 0;

    @ObfuscatedName("client.gk")
    public static int field705 = 2301979;

    @ObfuscatedName("client.gm")
    public static int field810 = 5063219;

    @ObfuscatedName("client.hc")
    public static int field707 = 3353893;

    @ObfuscatedName("client.hn")
    public static int field708 = 7759444;

    @ObfuscatedName("client.hf")
    public static boolean field709 = false;

    @ObfuscatedName("client.he")
    public static int field710 = 0;

    @ObfuscatedName("client.hh")
    public static int field711 = 128;

    @ObfuscatedName("client.ht")
    public static int field712 = 0;

    @ObfuscatedName("client.hb")
    public static int field713 = 0;

    @ObfuscatedName("client.hi")
    public static int field714 = 0;

    @ObfuscatedName("client.hm")
    public static int field715 = 0;

    @ObfuscatedName("client.hx")
    public static int field693 = 0;

    @ObfuscatedName("client.ha")
    public static int field726 = 0;

    @ObfuscatedName("client.hz")
    public static int field790 = 50;

    @ObfuscatedName("client.hg")
    public static int field703 = 0;

    @ObfuscatedName("client.hy")
    public static int field720 = 0;

    @ObfuscatedName("client.hv")
    public static int field721 = 0;

    @ObfuscatedName("client.ie")
    public static int field756 = 12;

    @ObfuscatedName("client.id")
    public static int field671 = 6;

    @ObfuscatedName("client.ii")
    public static int field706 = 0;

    @ObfuscatedName("client.ib")
    public static boolean field725 = false;

    @ObfuscatedName("client.iv")
    public static int field763 = 0;

    @ObfuscatedName("client.im")
    public static boolean field727 = false;

    @ObfuscatedName("client.it")
    public static String field796 = null;

    @ObfuscatedName("client.if")
    public static int field762 = 0;

    @ObfuscatedName("client.ir")
    public static int field745 = 0;

    @ObfuscatedName("client.iw")
    public static int field730 = 50;

    @ObfuscatedName("client.ik")
    public static int[] field849 = new int[field730];

    @ObfuscatedName("client.ip")
    public static int[] field808 = new int[field730];

    @ObfuscatedName("client.iy")
    public static int[] field899 = new int[field730];

    @ObfuscatedName("client.io")
    public static int[] field734 = new int[field730];

    @ObfuscatedName("client.ih")
    public static int[] field735 = new int[field730];

    @ObfuscatedName("client.ic")
    public static int[] field736 = new int[field730];

    @ObfuscatedName("client.is")
    public static int[] field737 = new int[field730];

    @ObfuscatedName("client.ij")
    public static String[] field656 = new String[field730];

    @ObfuscatedName("client.il")
    public static int[][] field670 = new int[104][104];

    @ObfuscatedName("client.iq")
    public static int field740 = 0;

    @ObfuscatedName("client.iu")
    public static int field728 = -1;

    @ObfuscatedName("client.ig")
    public static int field742 = -1;

    @ObfuscatedName("client.ia")
    public static int field743 = 0;

    @ObfuscatedName("client.in")
    public static int field744 = 0;

    @ObfuscatedName("client.ji")
    public static int field855 = 0;

    @ObfuscatedName("client.jj")
    public static int field648 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field739 = true;

    @ObfuscatedName("client.jw")
    public static int field748 = 0;

    @ObfuscatedName("client.je")
    public static int field749 = 0;

    @ObfuscatedName("client.jd")
    public static int field792 = 0;

    @ObfuscatedName("client.jh")
    public static int field751 = 0;

    @ObfuscatedName("client.jl")
    public static int field752 = 0;

    @ObfuscatedName("client.jz")
    public static int field731 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field754 = false;

    @ObfuscatedName("client.jg")
    public static int field755 = 0;

    @ObfuscatedName("client.ju")
    public static int field793 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field753 = true;

    @ObfuscatedName("client.jo")
    public static class62[] field758 = new class62[2048];

    @ObfuscatedName("client.jb")
    public static int field860 = -1;

    @ObfuscatedName("client.jr")
    public static int field760 = 0;

    @ObfuscatedName("client.jf")
    public static boolean field687 = true;

    @ObfuscatedName("client.ko")
    public static int field667 = 0;

    @ObfuscatedName("client.kx")
    public static int field695 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field764 = new int[1000];

    @ObfuscatedName("client.ke")
    public static final int[] field666 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kz")
    public static String[] field766 = new String[8];

    @ObfuscatedName("client.kf")
    public static boolean[] field791 = new boolean[8];

    @ObfuscatedName("client.ka")
    public static int[] field768 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ky")
    public static int field685 = -1;

    @ObfuscatedName("client.kq")
    public static class208[][][] field700 = new class208[4][104][104];

    @ObfuscatedName("client.kb")
    public static class208 field771 = new class208();

    @ObfuscatedName("client.kv")
    public static class208 field857 = new class208();

    @ObfuscatedName("client.kh")
    public static class208 field773 = new class208();

    @ObfuscatedName("client.kr")
    public static int[] field774 = new int[25];

    @ObfuscatedName("client.ku")
    public static int[] field723 = new int[25];

    @ObfuscatedName("client.kp")
    public static int[] field776 = new int[25];

    @ObfuscatedName("client.ks")
    public static int field777 = 0;

    @ObfuscatedName("client.kw")
    public static boolean field750 = false;

    @ObfuscatedName("client.kt")
    public static int field696 = 0;

    @ObfuscatedName("client.li")
    public static int[] field780 = new int[500];

    @ObfuscatedName("client.ld")
    public static int[] field692 = new int[500];

    @ObfuscatedName("client.ln")
    public static int[] field718 = new int[500];

    @ObfuscatedName("client.ll")
    public static int[] field783 = new int[500];

    @ObfuscatedName("client.ly")
    public static String[] field784 = new String[500];

    @ObfuscatedName("client.lm")
    public static String[] field785 = new String[500];

    @ObfuscatedName("client.lk")
    public static boolean[] field786 = new boolean[500];

    @ObfuscatedName("client.lu")
    public static boolean field787 = false;

    @ObfuscatedName("client.la")
    public static boolean field788 = false;

    @ObfuscatedName("client.lp")
    public static boolean field789 = false;

    @ObfuscatedName("client.lt")
    public static boolean field759 = true;

    @ObfuscatedName("client.lc")
    public static int field913 = -1;

    @ObfuscatedName("client.lo")
    public static int field891 = -1;

    @ObfuscatedName("client.ls")
    public static int field865 = 0;

    @ObfuscatedName("client.lh")
    public static int field794 = 50;

    @ObfuscatedName("client.lg")
    public static int field795 = 0;

    @ObfuscatedName("client.lw")
    public static boolean field886 = false;

    @ObfuscatedName("client.lf")
    public static int field798 = -1;

    @ObfuscatedName("client.lz")
    public static int field799 = -1;

    @ObfuscatedName("client.ml")
    public static String field800 = null;

    @ObfuscatedName("client.mj")
    public static String field801 = null;

    @ObfuscatedName("client.mb")
    public static int field802 = -1;

    @ObfuscatedName("client.mm")
    public static class205 field803 = new class205(8);

    @ObfuscatedName("client.my")
    public static int field804 = 0;

    @ObfuscatedName("client.mp")
    public static int field644 = 0;

    @ObfuscatedName("client.md")
    public static class233 field806 = null;

    @ObfuscatedName("client.mg")
    public static int field674 = 0;

    @ObfuscatedName("client.mo")
    public static int field871 = 0;

    @ObfuscatedName("client.mh")
    public static int field809 = 0;

    @ObfuscatedName("client.me")
    public static int field840 = -1;

    @ObfuscatedName("client.mr")
    public static boolean field893 = false;

    @ObfuscatedName("client.mk")
    public static class233 field812 = null;

    @ObfuscatedName("client.mz")
    public static class233 field719 = null;

    @ObfuscatedName("client.ma")
    public static class233 field814 = null;

    @ObfuscatedName("client.mq")
    public static int field815 = 0;

    @ObfuscatedName("client.mn")
    public static int field816 = 0;

    @ObfuscatedName("client.mf")
    public static class233 field817 = null;

    @ObfuscatedName("client.mt")
    public static boolean field818 = false;

    @ObfuscatedName("client.mc")
    public static int field819 = -1;

    @ObfuscatedName("client.mx")
    public static int field820 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field843 = false;

    @ObfuscatedName("client.mi")
    public static int field775 = -1;

    @ObfuscatedName("client.ms")
    public static int field823 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field824 = false;

    @ObfuscatedName("client.nh")
    public static int field664 = 1;

    @ObfuscatedName("client.ny")
    public static int[] field757 = new int[32];

    @ObfuscatedName("client.nx")
    public static int field827 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field828 = new int[32];

    @ObfuscatedName("client.nn")
    public static int field829 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field830 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field831 = 0;

    @ObfuscatedName("client.ne")
    public static int field832 = 0;

    @ObfuscatedName("client.nm")
    public static int field833 = 0;

    @ObfuscatedName("client.na")
    public static int field834 = 0;

    @ObfuscatedName("client.nd")
    public static int field835 = 0;

    @ObfuscatedName("client.nv")
    public static int field836 = 0;

    @ObfuscatedName("client.nq")
    public static int field837 = 0;

    @ObfuscatedName("client.nl")
    public static int field778 = 0;

    @ObfuscatedName("client.nb")
    public static class208 field839 = new class208();

    @ObfuscatedName("client.nc")
    public static class208 field807 = new class208();

    @ObfuscatedName("client.ns")
    public static class208 field841 = new class208();

    @ObfuscatedName("client.nz")
    public static class205 field781 = new class205(512);

    @ObfuscatedName("client.or")
    public static int field770 = 0;

    @ObfuscatedName("client.ow")
    public static int field844 = -2;

    @ObfuscatedName("client.og")
    public static boolean[] field845 = new boolean[100];

    @ObfuscatedName("client.oi")
    public static boolean[] field846 = new boolean[100];

    @ObfuscatedName("client.ob")
    public static boolean[] field847 = new boolean[100];

    @ObfuscatedName("client.ou")
    public static int[] field848 = new int[100];

    @ObfuscatedName("client.oo")
    public static int[] field882 = new int[100];

    @ObfuscatedName("client.os")
    public static int[] field850 = new int[100];

    @ObfuscatedName("client.ov")
    public static int[] field741 = new int[100];

    @ObfuscatedName("client.oc")
    public static int field852 = 0;

    @ObfuscatedName("client.ox")
    public static long field870 = 0L;

    @ObfuscatedName("client.of")
    public static boolean field854 = true;

    @ObfuscatedName("client.ok")
    public static int[] field826 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.od")
    public static int field856 = 0;

    @ObfuscatedName("client.ot")
    public static int field779 = 0;

    @ObfuscatedName("client.oa")
    public static String field858 = "";

    @ObfuscatedName("client.ol")
    public static long[] field859 = new long[100];

    @ObfuscatedName("client.on")
    public static int field896 = 0;

    @ObfuscatedName("client.po")
    public static int field861 = 0;

    @ObfuscatedName("client.pp")
    public static int[] field862 = new int[128];

    @ObfuscatedName("client.pz")
    public static int[] field863 = new int[128];

    @ObfuscatedName("client.pv")
    public static long field864 = -1L;

    @ObfuscatedName("client.pg")
    public static int field767 = -1;

    @ObfuscatedName("client.pr")
    public static int field866 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field867 = new int[1000];

    @ObfuscatedName("client.pq")
    public static int[] field868 = new int[1000];

    @ObfuscatedName("client.pk")
    public static class324[] field869 = new class324[1000];

    @ObfuscatedName("client.pn")
    public static int field732 = 0;

    @ObfuscatedName("client.pi")
    public static int field643 = 0;

    @ObfuscatedName("client.pm")
    public static int field747 = 0;

    @ObfuscatedName("client.pt")
    public static int field822 = 255;

    @ObfuscatedName("client.py")
    public static int field874 = -1;

    @ObfuscatedName("client.pa")
    public static boolean field875 = false;

    @ObfuscatedName("client.pl")
    public static int field797 = 127;

    @ObfuscatedName("client.qh")
    public static int field877 = 127;

    @ObfuscatedName("client.qf")
    public static int field677 = 0;

    @ObfuscatedName("client.qa")
    public static int[] field879 = new int[50];

    @ObfuscatedName("client.ql")
    public static int[] field880 = new int[50];

    @ObfuscatedName("client.qy")
    public static int[] field881 = new int[50];

    @ObfuscatedName("client.qk")
    public static int[] field769 = new int[50];

    @ObfuscatedName("client.qp")
    public static class94[] field883 = new class94[50];

    @ObfuscatedName("client.qe")
    public static boolean field884 = false;

    @ObfuscatedName("client.qx")
    public static boolean[] field885 = new boolean[5];

    @ObfuscatedName("client.qi")
    public static int[] field825 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field909 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field888 = new int[5];

    @ObfuscatedName("client.ra")
    public static int[] field889 = new int[5];

    @ObfuscatedName("client.rj")
    public static short field890 = 256;

    @ObfuscatedName("client.rb")
    public static short field772 = 205;

    @ObfuscatedName("client.rk")
    public static short field892 = 256;

    @ObfuscatedName("client.rv")
    public static short field722 = 320;

    @ObfuscatedName("client.rr")
    public static short field912 = 1;

    @ObfuscatedName("client.rz")
    public static short field895 = 32767;

    @ObfuscatedName("client.rh")
    public static short field894 = 1;

    @ObfuscatedName("client.rn")
    public static short field897 = 32767;

    @ObfuscatedName("client.rf")
    public static int field898 = 0;

    @ObfuscatedName("client.rt")
    public static int field821 = 0;

    @ObfuscatedName("client.rp")
    public static int field900 = 0;

    @ObfuscatedName("client.rx")
    public static int field901 = 0;

    @ObfuscatedName("client.ry")
    public static int field876 = 0;

    @ObfuscatedName("client.rq")
    public static class230 field903 = new class230();

    @ObfuscatedName("client.ru")
    public static int field904 = -1;

    @ObfuscatedName("client.rc")
    public static int field905 = -1;

    @ObfuscatedName("client.re")
    public static class327 field906 = new class326();

    @ObfuscatedName("client.rw")
    public static class5[] field907 = new class5[8];

    @ObfuscatedName("client.sa")
    public static class63 field908 = new class63();

    @ObfuscatedName("client.sq")
    public static int field675 = -1;

    @ObfuscatedName("client.sf")
    public static ArrayList field910 = new ArrayList(10);

    @ObfuscatedName("client.ss")
    public static int field911 = 0;

    @ObfuscatedName("client.sd")
    public static final class61 field688 = new class61();

    @ObfuscatedName("client.sz")
    public static int[] field704 = new int[50];

    @ObfuscatedName("client.sv")
    public static int[] field914 = new int[50];

    @ObfuscatedName("jd.et(I)Lls;")
    public static class330 method4620() {
        return Statics.field2589;
    }

    @ObfuscatedName("client.am(I)V")
    public final void method756() {
    }

    public final void init() {
        if (!this.method735()) {
            return;
        }
        class282[] var1 = new class282[] { class282.field3637, class282.field3631, class282.field3638, class282.field3628, class282.field3635, class282.field3645, class282.field3627, class282.field3641, class282.field3640, class282.field3636, class282.field3626, class282.field3632, class282.field3642, class282.field3630, class282.field3629, class282.field3633, class282.field3625, class282.field3639 };
        class282[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class282 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3643);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3643)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class76.field1107)) {
                            field647 = true;
                        } else {
                            field647 = false;
                        }
                        break;
                    case 2:
                        field646 = Integer.parseInt(var5);
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 16:
                    default:
                        break;
                    case 6:
                        field738 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field645 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field391 = (class247) class180.method3951(class247.method3145(), Integer.parseInt(var5));
                        if (Statics.field391 == class247.field3175) {
                            Statics.field252 = class331.field3972;
                        } else {
                            Statics.field252 = class331.field3977;
                        }
                        break;
                    case 10:
                        Statics.field195 = var5;
                        break;
                    case 11:
                        Statics.field599 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field416 = class246.method3478(Integer.parseInt(var5));
                        break;
                    case 13:
                        Statics.field589 = var5;
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class76.field1107)) {
                        }
                        break;
                    case 15:
                        field649 = Integer.parseInt(var5);
                        break;
                    case 17:
                        field902 = Integer.parseInt(var5) != 0;
                        break;
                    case 18:
                        if (field650 == -1) {
                            field650 = Integer.parseInt(var5);
                        }
                }
            }
        }
        method450();
        Statics.field141 = this.getCodeBase().getHost();
        String var6 = Statics.field416.field3166;
        byte var7 = 0;
        try {
            Statics.field4 = 18;
            Statics.field387 = var7;
            try {
                Statics.field3644 = System.getProperty("os.name");
            } catch (Exception var52) {
                Statics.field3644 = "Unknown";
            }
            Statics.field2416 = Statics.field3644.toLowerCase();
            try {
                Statics.field268 = System.getProperty("user.home");
                if (Statics.field268 != null) {
                    Statics.field268 = Statics.field268 + "/";
                }
            } catch (Exception var51) {
            }
            try {
                if (Statics.field2416.startsWith("win")) {
                    if (Statics.field268 == null) {
                        Statics.field268 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field268 == null) {
                    Statics.field268 = System.getenv("HOME");
                }
                if (Statics.field268 != null) {
                    Statics.field268 = Statics.field268 + "/";
                }
            } catch (Exception var50) {
            }
            if (Statics.field268 == null) {
                Statics.field268 = "~/";
            }
            Statics.field2020 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field268, "/tmp/", "" };
            Statics.field2024 = new String[] { ".jagex_cache_" + Statics.field387, ".file_store_" + Statics.field387 };
            int var11 = 0;
            label272: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field1868 = new File(Statics.field268, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field1868.exists()) {
                    try {
                        class113 var16 = new class113(Statics.field1868, "rw", 10000L);
                        class185 var17 = new class185((int) var16.method2268());
                        while (var17.field2386 < var17.field2388.length) {
                            int var18 = var16.method2269(var17.field2388, var17.field2386, var17.field2388.length - var17.field2386);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2386 += var18;
                        }
                        var17.field2386 = 0;
                        int var19 = var17.method3243();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method3243();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method3252();
                            if (var20 == 1) {
                                var14 = var17.method3252();
                            }
                        } else {
                            var13 = var17.method3282();
                            if (var20 == 1) {
                                var14 = var17.method3282();
                            }
                        }
                        var16.method2266();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class158.method127(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label246: for (int var24 = 0; var24 < Statics.field2024.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field2020.length; var25++) {
                            File var26 = new File(Statics.field2020[var25] + Statics.field2024[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class158.method127(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label246;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field268 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var36 = new File(var13);
                    Object var37 = null;
                    try {
                        class113 var38 = new class113(Statics.field1868, "rw", 10000L);
                        class185 var39 = new class185(500);
                        var39.method3227(3);
                        var39.method3227(var37 == null ? 0 : 1);
                        var39.method3419(var36.getPath());
                        if (var37 != null) {
                            var39.method3419(((File) var37).getPath());
                        }
                        var38.method2265(var39.field2388, 0, var39.field2386);
                        var38.method2266();
                    } catch (IOException var49) {
                        var49.printStackTrace();
                    }
                }
                File var41 = new File(var13);
                Statics.field2018 = var41;
                if (!Statics.field2018.exists()) {
                    Statics.field2018.mkdirs();
                }
                File[] var42 = Statics.field2018.listFiles();
                if (var42 != null) {
                    File[] var43 = var42;
                    for (int var44 = 0; var44 < var43.length; var44++) {
                        File var45 = var43[var44];
                        if (!class158.method127(var45, false)) {
                            var11++;
                            continue label272;
                        }
                    }
                }
                break;
            }
            File var46 = Statics.field2018;
            Statics.field2028 = var46;
            if (!Statics.field2028.exists()) {
                throw new RuntimeException("");
            }
            class161.field2031 = true;
            class158.method1585();
            class158.field2021 = new class112(new class113(class161.method3038("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class158.field2022 = new class112(new class113(class161.method3038("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1419 = new class112[Statics.field4];
            for (int var47 = 0; var47 < Statics.field4; var47++) {
                Statics.field1419[var47] = new class112(new class113(class161.method3038("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var55) {
            class155.method1451((String) null, var55);
        }
        Statics.field3184 = this;
        Statics.field3359 = field650;
        this.method733(765, 503, 174);
    }

    @ObfuscatedName("u.fo(S)V")
    public static final void method450() {
        class128.field1824 = false;
        field782 = false;
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method747() {
        class186.method2083(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field184 = field646 == 0 ? 43594 : field738 + 40000;
        Statics.field1727 = field646 == 0 ? 443 : field738 + 50000;
        Statics.field1258 = Statics.field184;
        Statics.field72 = class231.field2615;
        Statics.field1968 = class231.field2618;
        Statics.field105 = class231.field2617;
        Statics.field1129 = class231.field2616;
        Statics.field348 = new class138();
        this.method746();
        this.method728();
        Statics.field1494 = this.method725();
        Statics.field56 = new class165(255, class158.field2021, class158.field2022, 500000);
        class113 var1 = null;
        class68 var2 = new class68();
        try {
            var1 = class158.method3074("", Statics.field391.field3176, false);
            byte[] var3 = new byte[(int) var1.method2268()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2269(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class68(new class185(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2266();
            }
        } catch (Exception var9) {
        }
        Statics.field580 = var2;
        this.method787();
        class46.method106(this, Statics.field3365);
        if (field646 != 0) {
            field660 = true;
        }
        method1069(Statics.field580.field1020);
        Statics.field40 = new class69(Statics.field252);
    }

    @ObfuscatedName("client.ax(I)V")
    public final void method861() {
        field654++;
        this.method1091();
        class251.method3138();
        class220.method1685();
        method4032();
        class40.method2316();
        class49.method4182();
        if (Statics.field1494 != null) {
            int var1 = Statics.field1494.method628();
            field778 = var1;
        }
        if (field652 == 0) {
            method162();
            class48.method619();
        } else if (field652 == 5) {
            class80.method453(this);
            method162();
            class48.method619();
        } else if (field652 == 10 || field652 == 11) {
            class80.method453(this);
        } else if (field652 == 20) {
            class80.method453(this);
            this.method1223();
        } else if (field652 == 25) {
            method454(false);
            field811 = 0;
            boolean var2 = true;
            for (int var3 = 0; var3 < Statics.field1114.length; var3++) {
                if (Statics.field2498[var3] != -1 && Statics.field1114[var3] == null) {
                    Statics.field1114[var3] = Statics.field1415.method4210(Statics.field2498[var3], 0);
                    if (Statics.field1114[var3] == null) {
                        var2 = false;
                        field811++;
                    }
                }
                if (Statics.field1845[var3] != -1 && Statics.field3757[var3] == null) {
                    Statics.field3757[var3] = Statics.field1415.method4211(Statics.field1845[var3], 0, Statics.field272[var3]);
                    if (Statics.field3757[var3] == null) {
                        var2 = false;
                        field811++;
                    }
                }
            }
            if (var2) {
                field697 = 0;
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field1114.length; var5++) {
                    byte[] var6 = Statics.field3757[var5];
                    if (var6 != null) {
                        int var7 = (Statics.field1198[var5] >> 8) * 64 - Statics.field31;
                        int var8 = (Statics.field1198[var5] & 0xFF) * 64 - Statics.field1241;
                        if (field701) {
                            var7 = 10;
                            var8 = 10;
                        }
                        var4 &= class51.method11(var6, var7, var8);
                    }
                }
                if (var4) {
                    if (field699 != 0) {
                        method2396(class240.field2834 + class76.field1103 + class76.field1104 + 100 + "%" + class76.field1105, true);
                    }
                    method4032();
                    Statics.field3123.method2777();
                    for (int var9 = 0; var9 < 4; var9++) {
                        field729[var9].method3109();
                    }
                    for (int var10 = 0; var10 < 4; var10++) {
                        for (int var11 = 0; var11 < 104; var11++) {
                            for (int var12 = 0; var12 < 104; var12++) {
                                class51.field487[var10][var11][var12] = 0;
                            }
                        }
                    }
                    method4032();
                    class51.method3133();
                    int var13 = Statics.field1114.length;
                    for (class70 var14 = (class70) class70.field1037.method3746(); var14 != null; var14 = (class70) class70.field1037.method3747()) {
                        if (var14.field1038 != null) {
                            Statics.field3676.method1869(var14.field1038);
                            var14.field1038 = null;
                        }
                        if (var14.field1045 != null) {
                            Statics.field3676.method1869(var14.field1045);
                            var14.field1045 = null;
                        }
                    }
                    class70.field1037.method3759();
                    method454(true);
                    if (!field701) {
                        int var15 = 0;
                        label1028: while (true) {
                            if (var15 >= var13) {
                                for (int var29 = 0; var29 < var13; var29++) {
                                    int var30 = (Statics.field1198[var29] >> 8) * 64 - Statics.field31;
                                    int var31 = (Statics.field1198[var29] & 0xFF) * 64 - Statics.field1241;
                                    byte[] var32 = Statics.field1114[var29];
                                    if (var32 == null && Statics.field550 < 800) {
                                        method4032();
                                        class51.method550(var30, var31, 64, 64);
                                    }
                                }
                                method454(true);
                                int var33 = 0;
                                while (true) {
                                    if (var33 >= var13) {
                                        break label1028;
                                    }
                                    byte[] var34 = Statics.field3757[var33];
                                    if (var34 != null) {
                                        int var35 = (Statics.field1198[var33] >> 8) * 64 - Statics.field31;
                                        int var36 = (Statics.field1198[var33] & 0xFF) * 64 - Statics.field1241;
                                        method4032();
                                        class128 var37 = Statics.field3123;
                                        class167[] var38 = field729;
                                        class185 var39 = new class185(var34);
                                        int var40 = -1;
                                        while (true) {
                                            int var41 = var39.method3257();
                                            if (var41 == 0) {
                                                break;
                                            }
                                            var40 += var41;
                                            int var42 = 0;
                                            while (true) {
                                                int var43 = var39.method3256();
                                                if (var43 == 0) {
                                                    break;
                                                }
                                                var42 += var43 - 1;
                                                int var44 = var42 & 0x3F;
                                                int var45 = var42 >> 6 & 0x3F;
                                                int var46 = var42 >> 12;
                                                int var47 = var39.method3243();
                                                int var48 = var47 >> 2;
                                                int var49 = var47 & 0x3;
                                                int var50 = var35 + var45;
                                                int var51 = var36 + var44;
                                                if (var50 > 0 && var51 > 0 && var50 < 103 && var51 < 103) {
                                                    int var52 = var46;
                                                    if ((class51.field487[1][var50][var51] & 0x2) == 2) {
                                                        var52 = var46 - 1;
                                                    }
                                                    class167 var53 = null;
                                                    if (var52 >= 0) {
                                                        var53 = var38[var52];
                                                    }
                                                    class51.method1083(var46, var50, var51, var40, var49, var48, var37, var53);
                                                }
                                            }
                                        }
                                    }
                                    var33++;
                                }
                            }
                            int var16 = (Statics.field1198[var15] >> 8) * 64 - Statics.field31;
                            int var17 = (Statics.field1198[var15] & 0xFF) * 64 - Statics.field1241;
                            byte[] var18 = Statics.field1114[var15];
                            if (var18 != null) {
                                method4032();
                                int var19 = Statics.field573 * 8 - 48;
                                int var20 = Statics.field550 * 8 - 48;
                                class167[] var21 = field729;
                                int var22 = 0;
                                label1025: while (true) {
                                    if (var22 >= 4) {
                                        class185 var25 = new class185(var18);
                                        int var26 = 0;
                                        while (true) {
                                            if (var26 >= 4) {
                                                break label1025;
                                            }
                                            for (int var27 = 0; var27 < 64; var27++) {
                                                for (int var28 = 0; var28 < 64; var28++) {
                                                    class51.method31(var25, var26, var16 + var27, var17 + var28, var19, var20, 0);
                                                }
                                            }
                                            var26++;
                                        }
                                    }
                                    for (int var23 = 0; var23 < 64; var23++) {
                                        for (int var24 = 0; var24 < 64; var24++) {
                                            if (var16 + var23 > 0 && var16 + var23 < 103 && var17 + var24 > 0 && var17 + var24 < 103) {
                                                var21[var22].field2070[var16 + var23][var17 + var24] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var22++;
                                }
                            }
                            var15++;
                        }
                    }
                    if (field701) {
                        int var54 = 0;
                        label961: while (true) {
                            if (var54 >= 4) {
                                for (int var65 = 0; var65 < 13; var65++) {
                                    for (int var66 = 0; var66 < 13; var66++) {
                                        int var67 = field702[0][var65][var66];
                                        if (var67 == -1) {
                                            class51.method550(var65 * 8, var66 * 8, 8, 8);
                                        }
                                    }
                                }
                                method454(true);
                                int var68 = 0;
                                while (true) {
                                    if (var68 >= 4) {
                                        break label961;
                                    }
                                    method4032();
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        label918: for (int var70 = 0; var70 < 13; var70++) {
                                            int var71 = field702[var68][var69][var70];
                                            if (var71 != -1) {
                                                int var72 = var71 >> 24 & 0x3;
                                                int var73 = var71 >> 1 & 0x3;
                                                int var74 = var71 >> 14 & 0x3FF;
                                                int var75 = var71 >> 3 & 0x7FF;
                                                int var76 = (var74 / 8 << 8) + var75 / 8;
                                                for (int var77 = 0; var77 < Statics.field1198.length; var77++) {
                                                    if (Statics.field1198[var77] == var76 && Statics.field3757[var77] != null) {
                                                        byte[] var78 = Statics.field3757[var77];
                                                        int var79 = var69 * 8;
                                                        int var80 = var70 * 8;
                                                        int var81 = (var74 & 0x7) * 8;
                                                        int var82 = (var75 & 0x7) * 8;
                                                        class128 var83 = Statics.field3123;
                                                        class167[] var84 = field729;
                                                        class185 var85 = new class185(var78);
                                                        int var86 = -1;
                                                        while (true) {
                                                            int var87 = var85.method3257();
                                                            if (var87 == 0) {
                                                                continue label918;
                                                            }
                                                            var86 += var87;
                                                            int var88 = 0;
                                                            while (true) {
                                                                int var89 = var85.method3256();
                                                                if (var89 == 0) {
                                                                    break;
                                                                }
                                                                var88 += var89 - 1;
                                                                int var90 = var88 & 0x3F;
                                                                int var91 = var88 >> 6 & 0x3F;
                                                                int var92 = var88 >> 12;
                                                                int var93 = var85.method3243();
                                                                int var94 = var93 >> 2;
                                                                int var95 = var93 & 0x3;
                                                                if (var72 == var92 && var91 >= var81 && var91 < var81 + 8 && var90 >= var82 && var90 < var82 + 8) {
                                                                    class271 var96 = class271.method2839(var86);
                                                                    int var97 = var79 + class232.method1866(var91 & 0x7, var90 & 0x7, var73, var96.field3431, var96.field3433, var95);
                                                                    int var98 = var80 + class232.method1679(var91 & 0x7, var90 & 0x7, var73, var96.field3431, var96.field3433, var95);
                                                                    if (var97 > 0 && var98 > 0 && var97 < 103 && var98 < 103) {
                                                                        int var99 = var68;
                                                                        if ((class51.field487[1][var97][var98] & 0x2) == 2) {
                                                                            var99 = var68 - 1;
                                                                        }
                                                                        class167 var100 = null;
                                                                        if (var99 >= 0) {
                                                                            var100 = var84[var99];
                                                                        }
                                                                        class51.method1083(var68, var97, var98, var86, var73 + var95 & 0x3, var94, var83, var100);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var68++;
                                }
                            }
                            method4032();
                            for (int var55 = 0; var55 < 13; var55++) {
                                for (int var56 = 0; var56 < 13; var56++) {
                                    boolean var57 = false;
                                    int var58 = field702[var54][var55][var56];
                                    if (var58 != -1) {
                                        int var59 = var58 >> 24 & 0x3;
                                        int var60 = var58 >> 1 & 0x3;
                                        int var61 = var58 >> 14 & 0x3FF;
                                        int var62 = var58 >> 3 & 0x7FF;
                                        int var63 = (var61 / 8 << 8) + var62 / 8;
                                        for (int var64 = 0; var64 < Statics.field1198.length; var64++) {
                                            if (Statics.field1198[var64] == var63 && Statics.field1114[var64] != null) {
                                                class51.method480(Statics.field1114[var64], var54, var55 * 8, var56 * 8, var59, (var61 & 0x7) * 8, (var62 & 0x7) * 8, var60, field729);
                                                var57 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var57) {
                                        class51.method2399(var54, var55 * 8, var56 * 8);
                                    }
                                }
                            }
                            var54++;
                        }
                    }
                    method454(true);
                    method4032();
                    class128 var101 = Statics.field3123;
                    class167[] var102 = field729;
                    for (int var103 = 0; var103 < 4; var103++) {
                        for (int var104 = 0; var104 < 104; var104++) {
                            for (int var105 = 0; var105 < 104; var105++) {
                                if ((class51.field487[var103][var104][var105] & 0x1) == 1) {
                                    int var106 = var103;
                                    if ((class51.field487[1][var104][var105] & 0x2) == 2) {
                                        var106 = var103 - 1;
                                    }
                                    if (var106 >= 0) {
                                        var102[var106].method3096(var104, var105);
                                    }
                                }
                            }
                        }
                    }
                    class51.field488 += (int) (Math.random() * 5.0D) - 2;
                    if (class51.field488 < -8) {
                        class51.field488 = -8;
                    }
                    if (class51.field488 > 8) {
                        class51.field488 = 8;
                    }
                    class51.field500 += (int) (Math.random() * 5.0D) - 2;
                    if (class51.field500 < -16) {
                        class51.field500 = -16;
                    }
                    if (class51.field500 > 16) {
                        class51.field500 = 16;
                    }
                    for (int var107 = 0; var107 < 4; var107++) {
                        byte[][] var108 = Statics.field522[var107];
                        int var109 = (int) Math.sqrt(5100.0D);
                        int var110 = var109 * 768 >> 8;
                        for (int var111 = 1; var111 < 103; var111++) {
                            for (int var112 = 1; var112 < 103; var112++) {
                                int var113 = class51.field495[var107][var112 + 1][var111] - class51.field495[var107][var112 - 1][var111];
                                int var114 = class51.field495[var107][var112][var111 + 1] - class51.field495[var107][var112][var111 - 1];
                                int var115 = (int) Math.sqrt((double) (var114 * var114 + var113 * var113 + 65536));
                                int var116 = (var113 << 8) / var115;
                                int var117 = 65536 / var115;
                                int var118 = (var114 << 8) / var115;
                                int var119 = (var118 * -50 + var116 * -50 + var117 * -10) / var110 + 96;
                                int var120 = (var108[var112][var111] >> 1) + (var108[var112][var111 + 1] >> 3) + (var108[var112][var111 - 1] >> 2) + (var108[var112 - 1][var111] >> 2) + (var108[var112 + 1][var111] >> 3);
                                Statics.field233[var112][var111] = var119 - var120;
                            }
                        }
                        for (int var121 = 0; var121 < 104; var121++) {
                            Statics.field3183[var121] = 0;
                            Statics.field1513[var121] = 0;
                            Statics.field498[var121] = 0;
                            Statics.field3377[var121] = 0;
                            Statics.field492[var121] = 0;
                        }
                        for (int var122 = -5; var122 < 109; var122++) {
                            for (int var123 = 0; var123 < 104; var123++) {
                                int var124 = var122 + 5;
                                int var10002;
                                if (var124 >= 0 && var124 < 104) {
                                    int var125 = Statics.field1934[var107][var124][var123] & 0xFF;
                                    if (var125 > 0) {
                                        class262 var126 = class262.method296(var125 - 1);
                                        Statics.field3183[var123] += var126.field3323;
                                        Statics.field1513[var123] += var126.field3322;
                                        Statics.field498[var123] += var126.field3325;
                                        Statics.field3377[var123] += var126.field3326;
                                        var10002 = Statics.field492[var123]++;
                                    }
                                }
                                int var127 = var122 - 5;
                                if (var127 >= 0 && var127 < 104) {
                                    int var128 = Statics.field1934[var107][var127][var123] & 0xFF;
                                    if (var128 > 0) {
                                        class262 var129 = class262.method296(var128 - 1);
                                        Statics.field3183[var123] -= var129.field3323;
                                        Statics.field1513[var123] -= var129.field3322;
                                        Statics.field498[var123] -= var129.field3325;
                                        Statics.field3377[var123] -= var129.field3326;
                                        var10002 = Statics.field492[var123]--;
                                    }
                                }
                            }
                            if (var122 >= 1 && var122 < 103) {
                                int var130 = 0;
                                int var131 = 0;
                                int var132 = 0;
                                int var133 = 0;
                                int var134 = 0;
                                for (int var135 = -5; var135 < 109; var135++) {
                                    int var136 = var135 + 5;
                                    if (var136 >= 0 && var136 < 104) {
                                        var130 += Statics.field3183[var136];
                                        var131 += Statics.field1513[var136];
                                        var132 += Statics.field498[var136];
                                        var133 += Statics.field3377[var136];
                                        var134 += Statics.field492[var136];
                                    }
                                    int var137 = var135 - 5;
                                    if (var137 >= 0 && var137 < 104) {
                                        var130 -= Statics.field3183[var137];
                                        var131 -= Statics.field1513[var137];
                                        var132 -= Statics.field498[var137];
                                        var133 -= Statics.field3377[var137];
                                        var134 -= Statics.field492[var137];
                                    }
                                    if (var135 >= 1 && var135 < 103 && (!field782 || (class51.field487[0][var122][var135] & 0x2) != 0 || (class51.field487[var107][var122][var135] & 0x10) == 0)) {
                                        if (var107 < class51.field499) {
                                            class51.field499 = var107;
                                        }
                                        int var138 = Statics.field1934[var107][var122][var135] & 0xFF;
                                        int var139 = Statics.field489[var107][var122][var135] & 0xFF;
                                        if (var138 > 0 || var139 > 0) {
                                            int var140 = class51.field495[var107][var122][var135];
                                            int var141 = class51.field495[var107][var122 + 1][var135];
                                            int var142 = class51.field495[var107][var122 + 1][var135 + 1];
                                            int var143 = class51.field495[var107][var122][var135 + 1];
                                            int var144 = Statics.field233[var122][var135];
                                            int var145 = Statics.field233[var122 + 1][var135];
                                            int var146 = Statics.field233[var122 + 1][var135 + 1];
                                            int var147 = Statics.field233[var122][var135 + 1];
                                            int var148 = -1;
                                            int var149 = -1;
                                            if (var138 > 0) {
                                                int var150 = var130 * 256 / var133;
                                                int var151 = var131 / var134;
                                                int var152 = var132 / var134;
                                                var148 = class51.method135(var150, var151, var152);
                                                int var153 = class51.field488 + var150 & 0xFF;
                                                int var154 = class51.field500 + var152;
                                                if (var154 < 0) {
                                                    var154 = 0;
                                                } else if (var154 > 255) {
                                                    var154 = 255;
                                                }
                                                var149 = class51.method135(var153, var151, var154);
                                            }
                                            if (var107 > 0) {
                                                boolean var155 = true;
                                                if (var138 == 0 && Statics.field486[var107][var122][var135] != 0) {
                                                    var155 = false;
                                                }
                                                if (var139 > 0 && !class275.method3141(var139 - 1).field3573) {
                                                    var155 = false;
                                                }
                                                if (var155 && var140 == var141 && var140 == var142 && var140 == var143) {
                                                    Statics.field8[var107][var122][var135] |= 0x924;
                                                }
                                            }
                                            int var156 = 0;
                                            if (var149 != -1) {
                                                var156 = class125.field1762[class51.method21(var149, 96)];
                                            }
                                            if (var139 == 0) {
                                                var101.method2755(var107, var122, var135, 0, 0, -1, var140, var141, var142, var143, class51.method21(var148, var144), class51.method21(var148, var145), class51.method21(var148, var146), class51.method21(var148, var147), 0, 0, 0, 0, var156, 0);
                                            } else {
                                                int var157 = Statics.field486[var107][var122][var135] + 1;
                                                byte var158 = Statics.field1917[var107][var122][var135];
                                                class275 var159 = class275.method3141(var139 - 1);
                                                int var160 = var159.field3576;
                                                int var161;
                                                int var162;
                                                if (var160 >= 0) {
                                                    var161 = Statics.field1763.method2293(var160);
                                                    var162 = -1;
                                                } else if (var159.field3571 == 16711935) {
                                                    var162 = -2;
                                                    var160 = -1;
                                                    var161 = -2;
                                                } else {
                                                    var162 = class51.method135(var159.field3569, var159.field3572, var159.field3577);
                                                    int var163 = class51.field488 + var159.field3569 & 0xFF;
                                                    int var164 = class51.field500 + var159.field3577;
                                                    if (var164 < 0) {
                                                        var164 = 0;
                                                    } else if (var164 > 255) {
                                                        var164 = 255;
                                                    }
                                                    var161 = class51.method135(var163, var159.field3572, var164);
                                                }
                                                int var165 = 0;
                                                if (var161 != -2) {
                                                    var165 = class125.field1762[class51.method288(var161, 96)];
                                                }
                                                if (var159.field3574 != -1) {
                                                    int var166 = class51.field488 + var159.field3578 & 0xFF;
                                                    int var167 = class51.field500 + var159.field3580;
                                                    if (var167 < 0) {
                                                        var167 = 0;
                                                    } else if (var167 > 255) {
                                                        var167 = 255;
                                                    }
                                                    int var168 = class51.method135(var166, var159.field3575, var167);
                                                    var165 = class125.field1762[class51.method288(var168, 96)];
                                                }
                                                var101.method2755(var107, var122, var135, var157, var158, var160, var140, var141, var142, var143, class51.method21(var148, var144), class51.method21(var148, var145), class51.method21(var148, var146), class51.method21(var148, var147), class51.method288(var162, var144), class51.method288(var162, var145), class51.method288(var162, var146), class51.method288(var162, var147), var156, var165);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var169 = 1; var169 < 103; var169++) {
                            for (int var170 = 1; var170 < 103; var170++) {
                                var101.method2646(var107, var170, var169, class51.method452(var107, var170, var169));
                            }
                        }
                        Statics.field1934[var107] = (byte[][]) null;
                        Statics.field489[var107] = (byte[][]) null;
                        Statics.field486[var107] = (byte[][]) null;
                        Statics.field1917[var107] = (byte[][]) null;
                        Statics.field522[var107] = (byte[][]) null;
                    }
                    var101.method2650(-50, -10, -50);
                    for (int var171 = 0; var171 < 104; var171++) {
                        for (int var172 = 0; var172 < 104; var172++) {
                            if ((class51.field487[1][var171][var172] & 0x2) == 2) {
                                var101.method2644(var171, var172);
                            }
                        }
                    }
                    int var173 = 1;
                    int var174 = 2;
                    int var175 = 4;
                    for (int var176 = 0; var176 < 4; var176++) {
                        if (var176 > 0) {
                            var173 <<= 0x3;
                            var174 <<= 0x3;
                            var175 <<= 0x3;
                        }
                        for (int var177 = 0; var177 <= var176; var177++) {
                            for (int var178 = 0; var178 <= 104; var178++) {
                                for (int var179 = 0; var179 <= 104; var179++) {
                                    if ((Statics.field8[var177][var179][var178] & var173) != 0) {
                                        int var180 = var178;
                                        int var181 = var178;
                                        int var182 = var177;
                                        int var183 = var177;
                                        while (var180 > 0 && (Statics.field8[var177][var179][var180 - 1] & var173) != 0) {
                                            var180--;
                                        }
                                        while (var181 < 104 && (Statics.field8[var177][var179][var181 + 1] & var173) != 0) {
                                            var181++;
                                        }
                                        label644: while (var182 > 0) {
                                            for (int var184 = var180; var184 <= var181; var184++) {
                                                if ((Statics.field8[var182 - 1][var179][var184] & var173) == 0) {
                                                    break label644;
                                                }
                                            }
                                            var182--;
                                        }
                                        label633: while (var183 < var176) {
                                            for (int var185 = var180; var185 <= var181; var185++) {
                                                if ((Statics.field8[var183 + 1][var179][var185] & var173) == 0) {
                                                    break label633;
                                                }
                                            }
                                            var183++;
                                        }
                                        int var186 = (var183 + 1 - var182) * (var181 - var180 + 1);
                                        if (var186 >= 8) {
                                            short var187 = 240;
                                            int var188 = class51.field495[var183][var179][var180] - var187;
                                            int var189 = class51.field495[var182][var179][var180];
                                            class128.method2703(var176, 1, var179 * 128, var179 * 128, var180 * 128, var181 * 128 + 128, var188, var189);
                                            for (int var190 = var182; var190 <= var183; var190++) {
                                                for (int var191 = var180; var191 <= var181; var191++) {
                                                    Statics.field8[var190][var179][var191] &= ~var173;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field8[var177][var179][var178] & var174) != 0) {
                                        int var192 = var179;
                                        int var193 = var179;
                                        int var194 = var177;
                                        int var195 = var177;
                                        while (var192 > 0 && (Statics.field8[var177][var192 - 1][var178] & var174) != 0) {
                                            var192--;
                                        }
                                        while (var193 < 104 && (Statics.field8[var177][var193 + 1][var178] & var174) != 0) {
                                            var193++;
                                        }
                                        label697: while (var194 > 0) {
                                            for (int var196 = var192; var196 <= var193; var196++) {
                                                if ((Statics.field8[var194 - 1][var196][var178] & var174) == 0) {
                                                    break label697;
                                                }
                                            }
                                            var194--;
                                        }
                                        label686: while (var195 < var176) {
                                            for (int var197 = var192; var197 <= var193; var197++) {
                                                if ((Statics.field8[var195 + 1][var197][var178] & var174) == 0) {
                                                    break label686;
                                                }
                                            }
                                            var195++;
                                        }
                                        int var198 = (var195 + 1 - var194) * (var193 - var192 + 1);
                                        if (var198 >= 8) {
                                            short var199 = 240;
                                            int var200 = class51.field495[var195][var192][var178] - var199;
                                            int var201 = class51.field495[var194][var192][var178];
                                            class128.method2703(var176, 2, var192 * 128, var193 * 128 + 128, var178 * 128, var178 * 128, var200, var201);
                                            for (int var202 = var194; var202 <= var195; var202++) {
                                                for (int var203 = var192; var203 <= var193; var203++) {
                                                    Statics.field8[var202][var203][var178] &= ~var174;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field8[var177][var179][var178] & var175) != 0) {
                                        int var204 = var179;
                                        int var205 = var179;
                                        int var206 = var178;
                                        int var207 = var178;
                                        while (var206 > 0 && (Statics.field8[var177][var179][var206 - 1] & var175) != 0) {
                                            var206--;
                                        }
                                        while (var207 < 104 && (Statics.field8[var177][var179][var207 + 1] & var175) != 0) {
                                            var207++;
                                        }
                                        label750: while (var204 > 0) {
                                            for (int var208 = var206; var208 <= var207; var208++) {
                                                if ((Statics.field8[var177][var204 - 1][var208] & var175) == 0) {
                                                    break label750;
                                                }
                                            }
                                            var204--;
                                        }
                                        label739: while (var205 < 104) {
                                            for (int var209 = var206; var209 <= var207; var209++) {
                                                if ((Statics.field8[var177][var205 + 1][var209] & var175) == 0) {
                                                    break label739;
                                                }
                                            }
                                            var205++;
                                        }
                                        if ((var205 - var204 + 1) * (var207 - var206 + 1) >= 4) {
                                            int var210 = class51.field495[var177][var204][var206];
                                            class128.method2703(var176, 4, var204 * 128, var205 * 128 + 128, var206 * 128, var207 * 128 + 128, var210, var210);
                                            for (int var211 = var204; var211 <= var205; var211++) {
                                                for (int var212 = var206; var212 <= var207; var212++) {
                                                    Statics.field8[var177][var211][var212] &= ~var175;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method454(true);
                    int var213 = class51.field499;
                    if (var213 > Statics.field325) {
                        var213 = Statics.field325;
                    }
                    if (var213 < Statics.field325 - 1) {
                        int var214 = Statics.field325 - 1;
                    }
                    if (field782) {
                        Statics.field3123.method2815(class51.field499);
                    } else {
                        Statics.field3123.method2815(0);
                    }
                    for (int var215 = 0; var215 < 104; var215++) {
                        for (int var216 = 0; var216 < 104; var216++) {
                            method111(var215, var216);
                        }
                    }
                    method4032();
                    method4174();
                    class271.field3419.method3647();
                    if (Statics.field3184.method755()) {
                        class175 var217 = class175.method948(class172.field2278, field689.field1278);
                        var217.field2308.method3230(1057001181);
                        field689.method1848(var217);
                    }
                    if (!field701) {
                        int var218 = (Statics.field573 - 6) / 8;
                        int var219 = (Statics.field573 + 6) / 8;
                        int var220 = (Statics.field550 - 6) / 8;
                        int var221 = (Statics.field550 + 6) / 8;
                        for (int var222 = var218 - 1; var222 <= var219 + 1; var222++) {
                            for (int var223 = var220 - 1; var223 <= var221 + 1; var223++) {
                                if (var222 < var218 || var222 > var219 || var223 < var220 || var223 > var221) {
                                    Statics.field1415.method4253("m" + var222 + "_" + var223);
                                    Statics.field1415.method4253("l" + var222 + "_" + var223);
                                }
                            }
                        }
                    }
                    method987(30);
                    method4032();
                    Statics.field1934 = (byte[][][]) null;
                    Statics.field489 = (byte[][][]) null;
                    Statics.field486 = (byte[][][]) null;
                    Statics.field1917 = (byte[][][]) null;
                    Statics.field8 = (int[][][]) null;
                    Statics.field522 = (byte[][][]) null;
                    Statics.field233 = (int[][]) null;
                    Statics.field3183 = null;
                    Statics.field1513 = null;
                    Statics.field498 = null;
                    Statics.field3377 = null;
                    Statics.field492 = null;
                    class175 var224 = class175.method948(class172.field2187, field689.field1278);
                    field689.method1848(var224);
                    class48.method619();
                } else {
                    field699 = 2;
                }
            } else {
                field699 = 1;
            }
        }
        if (field652 == 30) {
            this.method1440();
        } else if (field652 == 40 || field652 == 45) {
            this.method1223();
        }
    }

    @ObfuscatedName("client.an(ZI)V")
    public final void method748(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class220.field2500 == 2) {
                    if (Statics.field2505 == null) {
                        Statics.field2505 = class226.method4020(Statics.field1392, Statics.field2503, Statics.field21);
                        if (Statics.field2505 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field3836 == null) {
                        Statics.field3836 = new class101(Statics.field2501, Statics.field3753);
                    }
                    if (Statics.field1971.method3848(Statics.field2505, Statics.field2504, Statics.field3836, 22050)) {
                        Statics.field1971.method3849();
                        Statics.field1971.method3846(Statics.field2506);
                        Statics.field1971.method3851(Statics.field2505, Statics.field595);
                        class220.field2500 = 0;
                        Statics.field2505 = null;
                        Statics.field3836 = null;
                        Statics.field1392 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1971.method3852();
                class220.field2500 = 0;
                Statics.field2505 = null;
                Statics.field3836 = null;
                Statics.field1392 = null;
            }
            var2 = false;
        }
        if (var2 && field875 && Statics.field365 != null) {
            Statics.field365.method1995();
        }
        if ((field652 == 10 || field652 == 20 || field652 == 30) && field870 != 0L && class187.method918() > field870) {
            method1069(method1667());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field845[var5] = true;
            }
        }
        if (field652 == 0) {
            this.method750(class80.field1150, class80.field1151, arg0);
        } else if (field652 == 5) {
            class80.method123(Statics.field1399, Statics.field3265, Statics.field209, arg0);
        } else if (field652 == 10 || field652 == 11) {
            class80.method123(Statics.field1399, Statics.field3265, Statics.field209, arg0);
        } else if (field652 == 20) {
            class80.method123(Statics.field1399, Statics.field3265, Statics.field209, arg0);
        } else if (field652 == 25) {
            if (field699 == 1) {
                if (field811 > field686) {
                    field686 = field811;
                }
                int var6 = (field686 * 50 - field811 * 50) / field686;
                method2396(class240.field2834 + class76.field1103 + class76.field1104 + var6 + "%" + class76.field1105, false);
            } else if (field699 == 2) {
                if (field697 > field698) {
                    field698 = field697;
                }
                int var7 = (field698 * 50 - field697 * 50) / field698 + 50;
                method2396(class240.field2834 + class76.field1103 + class76.field1104 + var7 + "%" + class76.field1105, false);
            } else {
                method2396(class240.field2834, false);
            }
        } else if (field652 == 30) {
            this.method1097();
        } else if (field652 == 40) {
            method2396(class240.field2918 + class76.field1103 + class240.field2836, false);
        } else if (field652 == 45) {
            method2396(class240.field2985, false);
        }
        if (field652 == 30 && field852 == 0 && !arg0 && !field854) {
            for (int var8 = 0; var8 < field770; var8++) {
                if (field846[var8]) {
                    Statics.field1928.method719(field848[var8], field882[var8], field850[var8], field741[var8]);
                    field846[var8] = false;
                }
            }
        } else if (field652 > 0) {
            Statics.field1928.method711(0, 0);
            for (int var9 = 0; var9 < field770; var9++) {
                field846[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ag(B)V")
    public final void method794() {
        if (Statics.field70.method1775()) {
            Statics.field70.method1772();
        }
        if (Statics.field3611 != null) {
            Statics.field3611.field587 = false;
        }
        Statics.field3611 = null;
        field689.method1847();
        if (class40.field359 != null) {
            class40 var1 = class40.field359;
            synchronized (class40.field359) {
                class40.field359 = null;
            }
        }
        class49.method193();
        Statics.field1494 = null;
        if (Statics.field365 != null) {
            Statics.field365.method1996();
        }
        if (Statics.field518 != null) {
            Statics.field518.method1996();
        }
        if (Statics.field3240 != null) {
            Statics.field3240.method3034();
        }
        Object var3 = class251.field3215;
        synchronized (class251.field3215) {
            if (class251.field3213 != 0) {
                class251.field3213 = 1;
                try {
                    class251.field3215.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field348 != null) {
            Statics.field348.method2841();
            Statics.field348 = null;
        }
        class158.method2943();
    }

    @ObfuscatedName("bt.fj(IB)V")
    public static void method987(int arg0) {
        if (field652 == arg0) {
            return;
        }
        if (field652 == 0) {
            Statics.field3184.method751();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field676 = 0;
            field887 = 0;
            field678 = 0;
            field724.method4898(arg0);
            if (arg0 != 20) {
                method43(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field277 != null) {
            Statics.field277.method3034();
            Statics.field277 = null;
        }
        if (field652 == 25) {
            field699 = 0;
            field811 = 0;
            field686 = 1;
            field697 = 0;
            field698 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class80.method1815(Statics.field2307, Statics.field547, true, 0);
        } else if (arg0 == 20) {
            class80.method1815(Statics.field2307, Statics.field547, true, field652 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class80.method1815(Statics.field2307, Statics.field547, false, 4);
        } else {
            class80.method451();
        }
        field652 = arg0;
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1091() {
        if (field652 != 1000) {
            boolean var1 = class253.method4451();
            if (!var1) {
                this.method1092();
            }
        }
    }

    @ObfuscatedName("client.fu(I)V")
    public void method1092() {
        if (class253.field3246 >= 4) {
            this.method752("js5crc");
            field652 = 1000;
            return;
        }
        if (class253.field3245 >= 4) {
            if (field652 <= 5) {
                this.method752("js5io");
                field652 = 1000;
                return;
            }
            field716 = 3000;
            class253.field3245 = 3;
        }
        if (--field716 + 1 > 0) {
            return;
        }
        try {
            if (field673 == 0) {
                Statics.field641 = Statics.field442.method2985(Statics.field141, Statics.field1258);
                field673++;
            }
            if (field673 == 1) {
                if (Statics.field641.field2004 == 2) {
                    this.method1093(-1);
                    return;
                }
                if (Statics.field641.field2004 == 1) {
                    field673++;
                }
            }
            if (field673 == 2) {
                if (field902) {
                    Statics.field1119 = class160.method5311((Socket) Statics.field641.field1998, 40000, 5000);
                } else {
                    Statics.field1119 = new class164((Socket) Statics.field641.field1998, Statics.field442, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3227(15);
                var1.method3230(174);
                Statics.field1119.method3013(var1.field2388, 0, 5);
                field673++;
                Statics.field1499 = class187.method918();
            }
            if (field673 == 3) {
                if (Statics.field1119.method3012() > 0 || !field902 && field652 <= 5) {
                    int var2 = Statics.field1119.method3019();
                    if (var2 != 0) {
                        this.method1093(var2);
                        return;
                    }
                    field673++;
                } else if (class187.method918() - Statics.field1499 > 30000L) {
                    this.method1093(-2);
                    return;
                }
            }
            if (field673 == 4) {
                class160 var3 = Statics.field1119;
                boolean var4 = field652 > 20;
                if (Statics.field3240 != null) {
                    try {
                        Statics.field3240.method3034();
                    } catch (Exception var14) {
                    }
                    Statics.field3240 = null;
                }
                Statics.field3240 = var3;
                class253.method4196(var4);
                class253.field3239.field2386 = 0;
                Statics.field179 = null;
                Statics.field1951 = null;
                class253.field3230 = 0;
                while (true) {
                    class249 var6 = (class249) class253.field3232.method3690();
                    if (var6 == null) {
                        while (true) {
                            class249 var7 = (class249) class253.field3238.method3690();
                            if (var7 == null) {
                                if (class253.field3228 != 0) {
                                    try {
                                        class185 var8 = new class185(4);
                                        var8.method3227(4);
                                        var8.method3227(class253.field3228);
                                        var8.method3383(0);
                                        Statics.field3240.method3013(var8.field2388, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3240.method3034();
                                        } catch (Exception var12) {
                                        }
                                        class253.field3245++;
                                        Statics.field3240 = null;
                                    }
                                }
                                class253.field3229 = 0;
                                Statics.field1086 = class187.method918();
                                Statics.field641 = null;
                                Statics.field1119 = null;
                                field673 = 0;
                                field717 = 0;
                                return;
                            }
                            class253.field3234.method3607(var7);
                            class253.field3235.method3691(var7, var7.field2466);
                            class253.field3236++;
                            class253.field3244--;
                        }
                    }
                    class253.field3243.method3691(var6, var6.field2466);
                    class253.field3231++;
                    class253.field3233--;
                }
            }
        } catch (IOException var15) {
            this.method1093(-3);
        }
    }

    @ObfuscatedName("client.fi(II)V")
    public void method1093(int arg0) {
        Statics.field641 = null;
        Statics.field1119 = null;
        field673 = 0;
        if (Statics.field184 == Statics.field1258) {
            Statics.field1258 = Statics.field1727;
        } else {
            Statics.field1258 = Statics.field184;
        }
        field717++;
        if (field717 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field652 <= 5) {
                this.method752("js5connect_full");
                field652 = 1000;
            } else {
                field716 = 3000;
            }
        } else if (field717 >= 2 && arg0 == 6) {
            this.method752("js5connect_outofdate");
            field652 = 1000;
        } else if (field717 >= 4) {
            if (field652 <= 5) {
                this.method752("js5connect");
                field652 = 1000;
            } else {
                field716 = 3000;
            }
        }
    }

    @ObfuscatedName("t.fs(I)V")
    public static void method162() {
        if (field672 == 0) {
            Statics.field3123 = new class128(4, 104, 104, class51.field495);
            for (int var0 = 0; var0 < 4; var0++) {
                field729[var0] = new class167(104, 104);
            }
            Statics.field111 = new class324(512, 512);
            class80.field1151 = class240.field3081;
            class80.field1150 = 5;
            field672 = 20;
        } else if (field672 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class125.field1766[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class128.method2676(var1, 500, 800, 512, 334);
            class80.field1151 = class240.field3057;
            class80.field1150 = 10;
            field672 = 30;
        } else if (field672 == 30) {
            Statics.field35 = Statics.method1453(0, false, true, true);
            Statics.field524 = Statics.method1453(1, false, true, true);
            Statics.field2320 = Statics.method1453(2, true, false, true);
            Statics.field235 = Statics.method1453(3, false, true, true);
            Statics.field376 = Statics.method1453(4, false, true, true);
            Statics.field1415 = Statics.method1453(5, true, true, true);
            Statics.field3168 = Statics.method1453(6, true, true, true);
            Statics.field1645 = Statics.method1453(7, false, true, true);
            Statics.field547 = Statics.method1453(8, false, true, true);
            Statics.field294 = Statics.method1453(9, false, true, true);
            Statics.field2307 = Statics.method1453(10, false, true, true);
            Statics.field2820 = Statics.method1453(11, false, true, true);
            Statics.field26 = Statics.method1453(12, false, true, true);
            Statics.field1370 = Statics.method1453(13, true, false, true);
            Statics.field53 = Statics.method1453(14, false, true, true);
            Statics.field575 = Statics.method1453(15, false, true, true);
            Statics.field1417 = Statics.method1453(16, true, true, true);
            Statics.field1973 = Statics.method1453(17, true, true, true);
            class80.field1151 = class240.field2839;
            class80.field1150 = 20;
            field672 = 40;
        } else if (field672 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field35.method4315() * 4 / 100;
            int var8 = var7 + Statics.field524.method4315() * 4 / 100;
            int var9 = var8 + Statics.field2320.method4315() * 2 / 100;
            int var10 = var9 + Statics.field235.method4315() * 2 / 100;
            int var11 = var10 + Statics.field376.method4315() * 6 / 100;
            int var12 = var11 + Statics.field1415.method4315() * 4 / 100;
            int var13 = var12 + Statics.field3168.method4315() * 2 / 100;
            int var14 = var13 + Statics.field1645.method4315() * 57 / 100;
            int var15 = var14 + Statics.field547.method4315() * 2 / 100;
            int var16 = var15 + Statics.field294.method4315() * 2 / 100;
            int var17 = var16 + Statics.field2307.method4315() * 2 / 100;
            int var18 = var17 + Statics.field2820.method4315() * 2 / 100;
            int var19 = var18 + Statics.field26.method4315() * 2 / 100;
            int var20 = var19 + Statics.field1370.method4315() * 2 / 100;
            int var21 = var20 + Statics.field53.method4315() * 2 / 100;
            int var22 = var21 + Statics.field575.method4315() * 2 / 100;
            int var23 = var22 + Statics.field1417.method4315() * 2 / 100;
            int var24 = var23 + (Statics.field1973.method4346() && Statics.field1973.method4215() ? 1 : 0);
            if (var24 == 100) {
                Statics.method4104(Statics.field35, "Animations");
                Statics.method4104(Statics.field524, "Skeletons");
                Statics.method4104(Statics.field376, "Sound FX");
                Statics.method4104(Statics.field1415, "Maps");
                Statics.method4104(Statics.field3168, "Music Tracks");
                Statics.method4104(Statics.field1645, "Models");
                Statics.method4104(Statics.field547, "Sprites");
                Statics.method4104(Statics.field2820, "Music Jingles");
                Statics.method4104(Statics.field53, "Music Samples");
                Statics.method4104(Statics.field575, "Music Patches");
                Statics.method4104(Statics.field1417, "World Map");
                Statics.field1066 = new class312();
                Statics.field1066.method5298(Statics.field1973);
                class80.field1151 = class240.field2841;
                class80.field1150 = 30;
                field672 = 45;
            } else {
                if (var24 != 0) {
                    class80.field1151 = class240.field2840 + var24 + "%";
                }
                class80.field1150 = 30;
            }
        } else if (field672 == 45) {
            boolean var25 = !field782;
            Statics.field2434 = 22050;
            Statics.field1375 = var25;
            Statics.field3809 = 2;
            class221 var26 = new class221();
            var26.method3872(9, 128);
            Statics.field365 = class98.method3955(Statics.field442, 0, 22050);
            Statics.field365.method1992(var26);
            class252 var27 = Statics.field575;
            class252 var28 = Statics.field53;
            class252 var29 = Statics.field376;
            Statics.field2504 = var27;
            Statics.field3753 = var28;
            Statics.field2501 = var29;
            Statics.field1971 = var26;
            Statics.field518 = class98.method3955(Statics.field442, 1, 2048);
            Statics.field3676 = new class91();
            Statics.field518.method1992(Statics.field3676);
            Statics.field1738 = new class105(22050, Statics.field2434);
            class80.field1151 = class240.field2952;
            class80.field1150 = 35;
            field672 = 50;
            Statics.field414 = new class299(Statics.field547, Statics.field1370);
        } else if (field672 == 50) {
            class298[] var30 = new class298[] { class298.field3717, class298.field3715, class298.field3712, class298.field3714, class298.field3720, class298.field3716 };
            int var31 = var30.length;
            class299 var32 = Statics.field414;
            class298[] var33 = new class298[] { class298.field3717, class298.field3715, class298.field3712, class298.field3714, class298.field3720, class298.field3716 };
            field694 = var32.method5130(var33);
            if (field694.size() < var31) {
                class80.field1151 = class240.field2843 + field694.size() * 100 / var31 + "%";
                class80.field1150 = 40;
            } else {
                Statics.field3265 = (class301) field694.get(class298.field3716);
                Statics.field209 = (class301) field694.get(class298.field3720);
                Statics.field1399 = (class301) field694.get(class298.field3717);
                Statics.field1116 = field906.method5634();
                class80.field1151 = class240.field2844;
                class80.field1150 = 40;
                field672 = 60;
            }
        } else if (field672 == 60) {
            int var34 = class80.method194(Statics.field2307, Statics.field547);
            int var35 = class80.method706();
            if (var34 < var35) {
                class80.field1151 = class240.field2958 + var34 * 100 / var35 + "%";
                class80.field1150 = 50;
            } else {
                class80.field1151 = class240.field2846;
                class80.field1150 = 50;
                method987(5);
                field672 = 70;
            }
        } else if (field672 == 70) {
            if (Statics.field2320.method4215()) {
                class252 var36 = Statics.field2320;
                Statics.field3579 = var36;
                class262.method202(Statics.field2320);
                class252 var37 = Statics.field2320;
                class252 var38 = Statics.field1645;
                Statics.field3330 = var37;
                Statics.field3329 = var38;
                Statics.field3338 = Statics.field3330.method4222(3);
                class271.method957(Statics.field2320, Statics.field1645, field782);
                class274.method4106(Statics.field2320, Statics.field1645);
                class268.method4449(Statics.field2320);
                class252 var39 = Statics.field2320;
                class252 var40 = Statics.field1645;
                boolean var41 = field647;
                class301 var42 = Statics.field3265;
                Statics.field3496 = var39;
                Statics.field3489 = var40;
                Statics.field3474 = var41;
                Statics.field3605 = Statics.field3496.method4222(10);
                Statics.field1120 = var42;
                class252 var43 = Statics.field2320;
                class252 var44 = Statics.field35;
                class252 var45 = Statics.field524;
                Statics.field3590 = var43;
                Statics.field3595 = var44;
                Statics.field642 = var45;
                class261.method5064(Statics.field2320, Statics.field1645);
                class252 var46 = Statics.field2320;
                Statics.field3362 = var46;
                class257.method3131(Statics.field2320);
                class233.method1577(Statics.field235, Statics.field1645, Statics.field547, Statics.field1370);
                class256.method3958(Statics.field2320);
                class252 var47 = Statics.field2320;
                Statics.field3379 = var47;
                class259.method2946(Statics.field2320);
                class252 var48 = Statics.field2320;
                Statics.field3301 = var48;
                class267.method4184(Statics.field2320);
                Statics.field70 = new class85();
                class252 var49 = Statics.field2320;
                class252 var50 = Statics.field547;
                class252 var51 = Statics.field1370;
                Statics.field3414 = var49;
                Statics.field3391 = var50;
                Statics.field3411 = var51;
                class264.method4175(Statics.field2320, Statics.field547);
                class258.method2635(Statics.field2320, Statics.field547);
                class80.field1151 = class240.field2848;
                class80.field1150 = 60;
                field672 = 80;
            } else {
                class80.field1151 = class240.field2847 + Statics.field2320.method4321() + "%";
                class80.field1150 = 60;
            }
        } else if (field672 == 80) {
            int var52 = 0;
            if (Statics.field13 == null) {
                Statics.field13 = class325.method4170(Statics.field547, Statics.field1066.field3787, 0);
            } else {
                var52++;
            }
            if (Statics.field433 == null) {
                Statics.field433 = class325.method4170(Statics.field547, Statics.field1066.field3781, 0);
            } else {
                var52++;
            }
            if (Statics.field6 == null) {
                Statics.field6 = class325.method5347(Statics.field547, Statics.field1066.field3782, 0);
            } else {
                var52++;
            }
            if (Statics.field380 == null) {
                Statics.field380 = class325.method3520(Statics.field547, Statics.field1066.field3786, 0);
            } else {
                var52++;
            }
            if (Statics.field1938 == null) {
                Statics.field1938 = class325.method3520(Statics.field547, Statics.field1066.field3780, 0);
            } else {
                var52++;
            }
            if (Statics.field510 == null) {
                Statics.field510 = class325.method3520(Statics.field547, Statics.field1066.field3785, 0);
            } else {
                var52++;
            }
            if (Statics.field2811 == null) {
                Statics.field2811 = class325.method3520(Statics.field547, Statics.field1066.field3784, 0);
            } else {
                var52++;
            }
            if (Statics.field3309 == null) {
                Statics.field3309 = class325.method3520(Statics.field547, Statics.field1066.field3788, 0);
            } else {
                var52++;
            }
            if (Statics.field2408 == null) {
                Statics.field2408 = class325.method3520(Statics.field547, Statics.field1066.field3783, 0);
            } else {
                var52++;
            }
            if (Statics.field210 == null) {
                Statics.field210 = class325.method5347(Statics.field547, Statics.field1066.field3789, 0);
            } else {
                var52++;
            }
            if (Statics.field80 == null) {
                Statics.field80 = class325.method5347(Statics.field547, Statics.field1066.field3790, 0);
            } else {
                var52++;
            }
            if (var52 < 11) {
                class80.field1151 = class240.field2849 + var52 * 100 / 12 + "%";
                class80.field1150 = 70;
            } else {
                Statics.field3740 = Statics.field80;
                Statics.field433.method5483();
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 41.0D) - 20;
                Statics.field6[0].method5458(var53 + var56, var54 + var56, var55 + var56);
                class80.field1151 = class240.field2954;
                class80.field1150 = 70;
                field672 = 90;
            }
        } else if (field672 == 90) {
            if (Statics.field294.method4215()) {
                Statics.field1888 = new class114(Statics.field294, Statics.field547, 20, 0.8D, field782 ? 64 : 128);
                class125.method2557(Statics.field1888);
                class125.method2558(0.8D);
                field672 = 100;
            } else {
                class80.field1151 = class240.field2851 + "0%";
                class80.field1150 = 90;
            }
        } else if (field672 == 100) {
            int var57 = Statics.field1888.method2290();
            if (var57 < 100) {
                class80.field1151 = class240.field2851 + var57 + "%";
                class80.field1150 = 90;
            } else {
                class80.field1151 = class240.field2959;
                class80.field1150 = 90;
                field672 = 110;
            }
        } else if (field672 == 110) {
            Statics.field3611 = new class59();
            Statics.field442.method2986(Statics.field3611, 10);
            class80.field1151 = class240.field2853;
            class80.field1150 = 92;
            field672 = 120;
        } else if (field672 == 120) {
            if (Statics.field2307.method4298("huffman", "")) {
                class177 var58 = new class177(Statics.field2307.method4294("huffman", ""));
                Statics.field3754 = var58;
                class80.field1151 = class240.field2887;
                class80.field1150 = 94;
                field672 = 130;
            } else {
                class80.field1151 = class240.field2854 + "%";
                class80.field1150 = 94;
            }
        } else if (field672 == 130) {
            if (!Statics.field235.method4215()) {
                class80.field1151 = class240.field2856 + Statics.field235.method4321() * 4 / 5 + "%";
                class80.field1150 = 96;
            } else if (!Statics.field26.method4215()) {
                class80.field1151 = class240.field2856 + (80 + Statics.field26.method4321() / 6) + "%";
                class80.field1150 = 96;
            } else if (Statics.field1370.method4215()) {
                class80.field1151 = class240.field2857;
                class80.field1150 = 98;
                field672 = 140;
            } else {
                class80.field1151 = class240.field2856 + (96 + Statics.field1370.method4321() / 50) + "%";
                class80.field1150 = 96;
            }
        } else if (field672 == 140) {
            class80.field1150 = 100;
            if (Statics.field1417.method4233(class30.field275.field278)) {
                if (Statics.field2589 == null) {
                    Statics.field2589 = new class330();
                    Statics.field2589.method5654(Statics.field1417, Statics.field1399, field694, Statics.field6);
                }
                int var59 = Statics.field2589.method5655();
                if (var59 < 100) {
                    class80.field1151 = class240.field2858 + (var59 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1151 = class240.field2859;
                    field672 = 150;
                }
            } else {
                class80.field1151 = class240.field2858 + Statics.field1417.method4235(class30.field275.field278) / 10 + "%";
            }
        } else if (field672 == 150) {
            method987(10);
        }
    }

    @ObfuscatedName("client.fd(I)V")
    public final void method1223() {
        class160 var1 = field689.method1850();
        class192 var2 = field689.field1279;
        try {
            if (field676 == 0) {
                if (Statics.field90 == null && (field682.method1734() || field887 > 250)) {
                    Statics.field90 = field682.method1731();
                    field682.method1740();
                    field682 = null;
                }
                if (Statics.field90 != null) {
                    if (var1 != null) {
                        var1.method3034();
                        var1 = null;
                    }
                    Statics.field280 = null;
                    field691 = false;
                    field887 = 0;
                    field676 = 1;
                }
            }
            if (field676 == 1) {
                if (Statics.field280 == null) {
                    Statics.field280 = Statics.field442.method2985(Statics.field141, Statics.field1258);
                }
                if (Statics.field280.field2004 == 2) {
                    throw new IOException();
                }
                if (Statics.field280.field2004 == 1) {
                    if (field902) {
                        var1 = class160.method5311((Socket) Statics.field280.field1998, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field280.field1998, Statics.field442, 5000);
                    }
                    field689.method1861(var1);
                    Statics.field280 = null;
                    field676 = 2;
                }
            }
            if (field676 == 2) {
                field689.method1854();
                class175 var3 = class175.method971();
                var3.field2302 = null;
                var3.field2301 = 0;
                var3.field2308 = new class192(5000);
                var3.field2308.method3227(class173.field2284.field2287);
                field689.method1848(var3);
                field689.method1845();
                var2.field2386 = 0;
                field676 = 3;
            }
            if (field676 == 3) {
                if (Statics.field365 != null) {
                    Statics.field365.method1994();
                }
                if (Statics.field518 != null) {
                    Statics.field518.method1994();
                }
                boolean var6 = true;
                if (field902 && !var1.method3010(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3019();
                    if (Statics.field365 != null) {
                        Statics.field365.method1994();
                    }
                    if (Statics.field518 != null) {
                        Statics.field518.method1994();
                    }
                    if (var7 != 0) {
                        method3137(var7);
                        return;
                    }
                    var2.field2386 = 0;
                    field676 = 4;
                }
            }
            if (field676 == 4) {
                if (var2.field2386 < 8) {
                    int var8 = var1.method3012();
                    if (var8 > 8 - var2.field2386) {
                        var8 = 8 - var2.field2386;
                    }
                    if (var8 > 0) {
                        var1.method3014(var2.field2388, var2.field2386, var8);
                        var2.field2386 += var8;
                    }
                }
                if (var2.field2386 == 8) {
                    var2.field2386 = 0;
                    Statics.field448 = var2.method3248();
                    field676 = 5;
                }
            }
            if (field676 == 5) {
                field689.field1279.field2386 = 0;
                field689.method1854();
                class192 var9 = new class192(500);
                int[] var10 = new int[] { Statics.field90.nextInt(), Statics.field90.nextInt(), Statics.field90.nextInt(), Statics.field90.nextInt() };
                var9.field2386 = 0;
                var9.method3227(1);
                var9.method3230(var10[0]);
                var9.method3230(var10[1]);
                var9.method3230(var10[2]);
                var9.method3230(var10[3]);
                var9.method3264(Statics.field448);
                if (field652 == 40) {
                    var9.method3230(Statics.field3466[0]);
                    var9.method3230(Statics.field3466[1]);
                    var9.method3230(Statics.field3466[2]);
                    var9.method3230(Statics.field3466[3]);
                } else {
                    var9.method3227(field680.method165());
                    switch(field680.field1966) {
                        case 0:
                        case 3:
                            var9.method3260(Statics.field2507);
                            var9.field2386++;
                            break;
                        case 1:
                            var9.field2386 += 4;
                            break;
                        case 2:
                            var9.method3230((Integer) Statics.field580.field1023.get(class308.method5123(class80.field1159)));
                    }
                    var9.method3227(class313.field3793.method165());
                    var9.method3234(class80.field1155);
                }
                var9.method3265(class78.field1122, class78.field1121);
                Statics.field3466 = var10;
                class175 var11 = class175.method971();
                var11.field2302 = null;
                var11.field2301 = 0;
                var11.field2308 = new class192(5000);
                var11.field2308.field2386 = 0;
                if (field652 == 40) {
                    var11.field2308.method3227(class173.field2286.field2287);
                } else {
                    var11.field2308.method3227(class173.field2285.field2287);
                }
                var11.field2308.method3383(0);
                int var14 = var11.field2308.field2386;
                var11.field2308.method3230(174);
                var11.field2308.method3237(var9.field2388, 0, var9.field2386);
                int var15 = var11.field2308.field2386;
                var11.field2308.method3234(class80.field1159);
                var11.field2308.method3227((field854 ? 1 : 0) << 1 | (field782 ? 1 : 0));
                var11.field2308.method3383(Statics.field1983);
                var11.field2308.method3383(Statics.field42);
                class192 var16 = var11.field2308;
                if (field683 == null) {
                    byte[] var17 = new byte[24];
                    try {
                        class158.field2015.method2243(0L);
                        class158.field2015.method2244(var17);
                        int var18;
                        for (var18 = 0; var18 < 24 && var17[var18] == 0; var18++) {
                        }
                        if (var18 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var50) {
                        for (int var20 = 0; var20 < 24; var20++) {
                            var17[var20] = -1;
                        }
                    }
                    var16.method3237(var17, 0, var17.length);
                } else {
                    var16.method3237(field683, 0, field683.length);
                }
                var11.field2308.method3234(Statics.field195);
                var11.field2308.method3230(Statics.field599);
                class185 var23 = new class185(Statics.field1116.method5637());
                Statics.field1116.method5640(var23);
                var11.field2308.method3237(var23.field2388, 0, var23.field2388.length);
                var11.field2308.method3227(field650);
                var11.field2308.method3230(0);
                var11.field2308.method3230(Statics.field35.field3209);
                var11.field2308.method3230(Statics.field524.field3209);
                var11.field2308.method3230(Statics.field2320.field3209);
                var11.field2308.method3230(Statics.field235.field3209);
                var11.field2308.method3230(Statics.field376.field3209);
                var11.field2308.method3230(Statics.field1415.field3209);
                var11.field2308.method3230(Statics.field3168.field3209);
                var11.field2308.method3230(Statics.field1645.field3209);
                var11.field2308.method3230(Statics.field547.field3209);
                var11.field2308.method3230(Statics.field294.field3209);
                var11.field2308.method3230(Statics.field2307.field3209);
                var11.field2308.method3230(Statics.field2820.field3209);
                var11.field2308.method3230(Statics.field26.field3209);
                var11.field2308.method3230(Statics.field1370.field3209);
                var11.field2308.method3230(Statics.field53.field3209);
                var11.field2308.method3230(Statics.field575.field3209);
                var11.field2308.method3230(Statics.field1417.field3209);
                var11.field2308.method3230(Statics.field1973.field3209);
                var11.field2308.method3376(var10, var15, var11.field2308.field2386);
                var11.field2308.method3239(var11.field2308.field2386 - var14);
                field689.method1848(var11);
                field689.method1845();
                field689.field1278 = new class193(var10);
                int[] var24 = new int[4];
                for (int var25 = 0; var25 < 4; var25++) {
                    var24[var25] = var10[var25] + 50;
                }
                var2.method3532(var24);
                field676 = 6;
            }
            if (field676 == 6 && var1.method3012() > 0) {
                int var26 = var1.method3019();
                if (var26 == 21 && field652 == 20) {
                    field676 = 9;
                } else if (var26 == 2) {
                    field676 = 11;
                } else if (var26 == 15 && field652 == 40) {
                    field689.field1288 = -1;
                    field676 = 16;
                } else if (var26 == 64) {
                    field676 = 7;
                } else if (var26 == 23 && field678 < 1) {
                    field678++;
                    field676 = 0;
                } else if (var26 == 29) {
                    field676 = 14;
                } else {
                    method3137(var26);
                    return;
                }
            }
            if (field676 == 7 && var1.method3012() > 0) {
                Statics.field2612 = var1.method3019();
                field676 = 8;
            }
            if (field676 == 8 && var1.method3012() >= Statics.field2612) {
                var1.method3014(var2.field2388, 0, Statics.field2612);
                var2.field2386 = 0;
                field676 = 6;
            }
            if (field676 == 9 && var1.method3012() > 0) {
                field679 = (var1.method3019() + 3) * 60;
                field676 = 10;
            }
            if (field676 == 10) {
                field887 = 0;
                class80.method1816(class240.field2865, class240.field3103, field679 / 60 + class240.field2867);
                if (--field679 <= 0) {
                    field676 = 0;
                }
            } else {
                if (field676 == 11 && var1.method3012() >= 1) {
                    Statics.field44 = var1.method3019();
                    field676 = 12;
                }
                if (field676 == 12 && var1.method3012() >= Statics.field44) {
                    boolean var27 = var1.method3019() == 1;
                    var1.method3014(var2.field2388, 0, 4);
                    var2.field2386 = 0;
                    boolean var28 = false;
                    if (var27) {
                        int var29 = var2.method3505() << 24;
                        int var30 = var29 | var2.method3505() << 16;
                        int var31 = var30 | var2.method3505() << 8;
                        int var32 = var31 | var2.method3505();
                        int var33 = class308.method5123(class80.field1159);
                        if (Statics.field580.field1023.size() >= 10 && !Statics.field580.field1023.containsKey(var33)) {
                            Iterator var34 = Statics.field580.field1023.entrySet().iterator();
                            var34.next();
                            var34.remove();
                        }
                        Statics.field580.field1023.put(var33, var32);
                    }
                    if (field681) {
                        Statics.field580.field1016 = class80.field1159;
                    } else {
                        Statics.field580.field1016 = null;
                    }
                    class68.method1080();
                    field809 = var1.method3019();
                    field893 = var1.method3019() == 1;
                    field860 = var1.method3019();
                    field860 <<= 0x8;
                    field860 += var1.method3019();
                    field760 = var1.method3019();
                    var1.method3014(var2.field2388, 0, 1);
                    var2.field2386 = 0;
                    class171[] var35 = class171.method1742();
                    int var36 = var2.method3507();
                    if (var36 < 0 || var36 >= var35.length) {
                        throw new IOException(var36 + " " + var2.field2386);
                    }
                    field689.field1283 = var35[var36];
                    field689.field1288 = field689.field1283.field2180;
                    var1.method3014(var2.field2388, 0, 2);
                    var2.field2386 = 0;
                    field689.field1288 = var2.method3245();
                    try {
                        client var37 = Statics.field3184;
                        JSObject.getWindow(var37).call("zap", (Object[]) null);
                    } catch (Throwable var49) {
                    }
                    field676 = 13;
                }
                if (field676 != 13) {
                    if (field676 == 14 && var1.method3012() >= 2) {
                        var2.field2386 = 0;
                        var1.method3014(var2.field2388, 0, 2);
                        var2.field2386 = 0;
                        Statics.field1223 = var2.method3245();
                        field676 = 15;
                    }
                    if (field676 == 15 && var1.method3012() >= Statics.field1223) {
                        var2.field2386 = 0;
                        var1.method3014(var2.field2388, 0, Statics.field1223);
                        var2.field2386 = 0;
                        String var39 = var2.method3251();
                        String var40 = var2.method3251();
                        String var41 = var2.method3251();
                        class80.method1816(var39, var40, var41);
                        method987(10);
                    }
                    if (field676 == 16) {
                        if (field689.field1288 == -1) {
                            if (var1.method3012() < 2) {
                                return;
                            }
                            var1.method3014(var2.field2388, 0, 2);
                            var2.field2386 = 0;
                            field689.field1288 = var2.method3245();
                        }
                        if (var1.method3012() >= field689.field1288) {
                            var1.method3014(var2.field2388, 0, field689.field1288);
                            var2.field2386 = 0;
                            int var42 = field689.field1288;
                            field724.method4902();
                            field689.method1854();
                            field689.field1279.field2386 = 0;
                            field689.field1283 = null;
                            field689.field1280 = null;
                            field689.field1286 = null;
                            field689.field1287 = null;
                            field689.field1288 = 0;
                            field689.field1285 = 0;
                            field661 = 0;
                            method3500();
                            field747 = 0;
                            field732 = 0;
                            for (int var43 = 0; var43 < 2048; var43++) {
                                field758[var43] = null;
                            }
                            Statics.field241 = null;
                            for (int var44 = 0; var44 < field684.length; var44++) {
                                class74 var45 = field684[var44];
                                if (var45 != null) {
                                    var45.field944 = -1;
                                    var45.field958 = false;
                                }
                            }
                            class55.method5126();
                            method987(30);
                            for (int var46 = 0; var46 < 100; var46++) {
                                field845[var46] = true;
                            }
                            class175 var47 = class175.method948(class172.field2191, field689.field1278);
                            var47.field2308.method3227(method1667());
                            var47.field2308.method3383(Statics.field1983);
                            var47.field2308.method3383(Statics.field42);
                            field689.method1848(var47);
                            class84.method975(var2);
                            if (var2.field2386 != var42) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field887++;
                        if (field887 > 2000) {
                            if (field678 < 1) {
                                if (Statics.field184 == Statics.field1258) {
                                    Statics.field1258 = Statics.field1727;
                                } else {
                                    Statics.field1258 = Statics.field184;
                                }
                                field678++;
                                field676 = 0;
                            } else {
                                method3137(-3);
                            }
                        }
                    }
                } else if (var1.method3012() >= field689.field1288) {
                    var2.field2386 = 0;
                    var1.method3014(var2.field2388, 0, field689.field1288);
                    field724.method4895();
                    method2902();
                    class84.method975(var2);
                    Statics.field573 = -1;
                    method533(false, var2);
                    field689.field1283 = null;
                }
            }
        } catch (IOException var51) {
            if (field678 < 1) {
                if (Statics.field184 == Statics.field1258) {
                    Statics.field1258 = Statics.field1727;
                } else {
                    Statics.field1258 = Statics.field184;
                }
                field678++;
                field676 = 0;
            } else {
                method3137(-2);
            }
        }
    }

    @ObfuscatedName("ev.fp(B)V")
    public static void method2902() {
        field655 = 1L;
        Statics.field3611.field582 = 0;
        Statics.field3252 = true;
        field659 = true;
        field864 = -1L;
        class319.method66();
        field689.method1854();
        field689.field1279.field2386 = 0;
        field689.field1283 = null;
        field689.field1280 = null;
        field689.field1286 = null;
        field689.field1287 = null;
        field689.field1288 = 0;
        field689.field1285 = 0;
        field661 = 0;
        field690 = 0;
        field662 = 0;
        method3500();
        class49.field472 = 0;
        class86.field1242.clear();
        class86.field1235.method3620();
        class86.field1236.method3801();
        class86.field1237 = 0;
        field795 = 0;
        field886 = false;
        field677 = 0;
        field712 = 0;
        field726 = 0;
        Statics.field309 = null;
        field747 = 0;
        field767 = -1;
        field732 = 0;
        field643 = 0;
        field733 = class79.field1127;
        field842 = class79.field1127;
        field746 = 0;
        class84.method122();
        for (int var0 = 0; var0 < 2048; var0++) {
            field758[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field684[var1] = null;
        }
        field685 = -1;
        field857.method3759();
        field773.method3759();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field700[var2][var3][var4] = null;
                }
            }
        }
        field771 = new class208();
        Statics.field40.method1521();
        for (int var5 = 0; var5 < Statics.field3267; var5++) {
            class257 var6 = class257.method3091(var5);
            if (var6 != null) {
                class228.field2595[var5] = 0;
                class228.field2596[var5] = 0;
            }
        }
        Statics.field70.method1770();
        field840 = -1;
        if (field802 != -1) {
            class233.method1817(field802);
        }
        for (class57 var7 = (class57) field803.method3690(); var7 != null; var7 = (class57) field803.method3692()) {
            method917(var7, true);
        }
        field802 = -1;
        field803 = new class205(8);
        field806 = null;
        method3500();
        field903.method4053((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field766[var8] = null;
            field791[var8] = false;
        }
        class55.field532 = new class205(32);
        field653 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field845[var9] = true;
        }
        class175 var10 = class175.method948(class172.field2191, field689.field1278);
        var10.field2308.method3227(method1667());
        var10.field2308.method3383(Statics.field1983);
        var10.field2308.method3383(Statics.field42);
        field689.method1848(var10);
        Statics.field928 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field907[var11] = new class5();
        }
        Statics.field2594 = null;
    }

    @ObfuscatedName("fh.fg(II)V")
    public static void method3137(int arg0) {
        if (arg0 == -3) {
            class80.method1816(class240.field2868, class240.field2869, class240.field2823);
        } else if (arg0 == -2) {
            class80.method1816(class240.field2871, class240.field2831, class240.field2873);
        } else if (arg0 == -1) {
            class80.method1816(class240.field3083, class240.field2875, class240.field3093);
        } else if (arg0 == 3) {
            class80.field1154 = 3;
            class80.field1153 = 1;
        } else if (arg0 == 4) {
            class80.field1154 = 12;
            class80.field1152 = 0;
        } else if (arg0 == 5) {
            class80.field1153 = 2;
            class80.method1816(class240.field2880, class240.field3073, class240.field2882);
        } else if (arg0 == 6) {
            class80.method1816(class240.field2883, class240.field2884, class240.field2885);
        } else if (arg0 == 7) {
            class80.method1816(class240.field2886, class240.field3049, class240.field3100);
        } else if (arg0 == 8) {
            class80.method1816(class240.field2889, class240.field2890, class240.field2926);
        } else if (arg0 == 9) {
            class80.method1816(class240.field2892, class240.field2893, class240.field2894);
        } else if (arg0 == 10) {
            class80.method1816(class240.field2895, class240.field2896, class240.field3074);
        } else if (arg0 == 11) {
            class80.method1816(class240.field2898, class240.field3076, class240.field2900);
        } else if (arg0 == 12) {
            class80.method1816(class240.field2901, class240.field2902, class240.field2903);
        } else if (arg0 == 13) {
            class80.method1816(class240.field2904, class240.field2905, class240.field3046);
        } else if (arg0 == 14) {
            class80.method1816(class240.field2907, class240.field3086, class240.field2909);
        } else if (arg0 == 16) {
            class80.method1816(class240.field2910, class240.field2911, class240.field2912);
        } else if (arg0 == 17) {
            class80.method1816(class240.field3025, class240.field2914, class240.field2915);
        } else if (arg0 == 18) {
            class80.field1154 = 12;
            class80.field1152 = 1;
        } else if (arg0 == 19) {
            class80.method1816(class240.field2919, class240.field2897, class240.field2921);
        } else if (arg0 == 20) {
            class80.method1816(class240.field2922, class240.field2923, class240.field2924);
        } else if (arg0 == 22) {
            class80.method1816(class240.field2876, class240.field3114, class240.field3010);
        } else if (arg0 == 23) {
            class80.method1816(class240.field2966, class240.field2929, class240.field3070);
        } else if (arg0 == 24) {
            class80.method1816(class240.field3029, class240.field2932, class240.field3105);
        } else if (arg0 == 25) {
            class80.method1816(class240.field2878, class240.field3078, class240.field2936);
        } else if (arg0 == 26) {
            class80.method1816(class240.field2937, class240.field2938, class240.field2939);
        } else if (arg0 == 27) {
            class80.method1816(class240.field3071, class240.field2941, class240.field2942);
        } else if (arg0 == 31) {
            class80.method1816(class240.field3018, class240.field2950, class240.field2951);
        } else if (arg0 == 32) {
            class80.method1816(class240.field2828, class240.field2953, class240.field2970);
        } else if (arg0 == 37) {
            class80.method1816(class240.field2955, class240.field2956, class240.field2957);
        } else if (arg0 == 38) {
            class80.method1816(class240.field2969, class240.field2891, class240.field2960);
        } else if (arg0 == 55) {
            class80.field1154 = 8;
        } else if (arg0 == 56) {
            class80.method1816(class240.field3035, class240.field2940, class240.field2967);
            method987(11);
            return;
        } else if (arg0 == 57) {
            class80.method1816(class240.field2968, class240.field2863, class240.field3091);
            method987(11);
            return;
        } else if (arg0 == 61) {
            class80.field1154 = 7;
        } else {
            class80.method1816(class240.field3102, class240.field2972, class240.field2973);
        }
        method987(10);
    }

    @ObfuscatedName("al.fv(B)V")
    public static final void method677() {
        field689.method1847();
        class275.method1687();
        class262.method4172();
        class263.field3328.method3647();
        class271.field3418.method3647();
        class271.field3419.method3647();
        class271.field3420.method3647();
        class271.field3454.method3647();
        class274.field3534.method3647();
        class274.field3541.method3647();
        class272.field3475.method3647();
        class272.field3476.method3647();
        class272.field3522.method3647();
        class276.method133();
        class261.field3304.method3647();
        class261.field3305.method3647();
        class266.field3361.method3647();
        class257.field3269.method3647();
        class270.method972();
        class264.method192();
        class268.method100();
        class267.method4190();
        class258.field3272.method3647();
        class230.field2611.method3647();
        class233.field2625.method3647();
        class233.field2641.method3647();
        class233.field2627.method3647();
        class233.field2628.method3647();
        ((class114) Statics.field1763).method2313();
        class87.field1256.method3647();
        Statics.field35.method4242();
        Statics.field524.method4242();
        Statics.field235.method4242();
        Statics.field376.method4242();
        Statics.field1415.method4242();
        Statics.field3168.method4242();
        Statics.field1645.method4242();
        Statics.field547.method4242();
        Statics.field294.method4242();
        Statics.field2307.method4242();
        Statics.field2820.method4242();
        Statics.field26.method4242();
        Statics.field3123.method2777();
        for (int var0 = 0; var0 < 4; var0++) {
            field729[var0].method3109();
        }
        System.gc();
        class220.method286(2);
        field874 = -1;
        field875 = false;
        for (class70 var1 = (class70) class70.field1037.method3746(); var1 != null; var1 = (class70) class70.field1037.method3747()) {
            if (var1.field1038 != null) {
                Statics.field3676.method1869(var1.field1038);
                var1.field1038 = null;
            }
            if (var1.field1045 != null) {
                Statics.field3676.method1869(var1.field1045);
                var1.field1045 = null;
            }
        }
        class70.field1037.method3759();
        method987(10);
    }

    @ObfuscatedName("ir.fw(I)V")
    public static final void method4188() {
        if (field690 > 0) {
            method677();
        } else {
            field724.method4897();
            method987(40);
            Statics.field277 = field689.method1850();
            field689.method1849();
        }
    }

    @ObfuscatedName("j.fk(ZI)V")
    public static final void method43(boolean arg0) {
        if (arg0) {
            field680 = class80.field1163 ? class149.field1967 : class149.field1963;
        } else {
            field680 = Statics.field580.field1023.containsKey(class308.method5123(class80.field1159)) ? class149.field1965 : class149.field1964;
        }
    }

    @ObfuscatedName("client.fh(I)V")
    public final void method1440() {
        if (field661 > 1) {
            field661--;
        }
        if (field690 > 0) {
            field690--;
        }
        if (field691) {
            field691 = false;
            method4188();
            return;
        }
        if (!field750) {
            method974();
        }
        for (int var1 = 0; var1 < 100 && this.method1098(field689); var1++) {
        }
        if (field652 != 30) {
            return;
        }
        while (class319.method5352()) {
            class175 var2 = class175.method948(class172.field2197, field689.field1278);
            var2.field2308.method3227(0);
            int var3 = var2.field2308.field2386;
            class319.method4191(var2.field2308);
            var2.field2308.method3360(var2.field2308.field2386 - var3);
            field689.method1848(var2);
        }
        if (field724.field3649) {
            class175 var4 = class175.method948(class172.field2230, field689.field1278);
            var4.field2308.method3227(0);
            int var5 = var4.field2308.field2386;
            field724.method4906(var4.field2308);
            var4.field2308.method3360(var4.field2308.field2386 - var5);
            field689.method1848(var4);
            field724.method4900();
        }
        Object var6 = Statics.field3611.field581;
        synchronized (Statics.field3611.field581) {
            if (!field878) {
                Statics.field3611.field582 = 0;
            } else if (class49.field469 != 0 || Statics.field3611.field582 >= 40) {
                class175 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field3611.field582 && (var7 == null || var7.field2308.field2386 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field3611.field584[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field3611.field588[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field813 != var14 || field657 != var13) {
                        if (var7 == null) {
                            var7 = class175.method948(class172.field2185, field689.field1278);
                            var7.field2308.method3227(0);
                            var8 = var7.field2308.field2386;
                            var7.field2308.field2386 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field658 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field813;
                            var16 = var13 - field657;
                            var17 = (int) ((Statics.field3611.field585[var12] - field658) / 20L);
                            var10 = (int) ((Statics.field3611.field585[var12] - field658) % 20L + (long) var10);
                        }
                        field813 = var14;
                        field657 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2308.method3383((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2308.method3227(var17 + 128);
                            var7.field2308.method3383((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2308.method3227(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2308.method3230(Integer.MIN_VALUE);
                            } else {
                                var7.field2308.method3230(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2308.method3383((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2308.method3230(Integer.MIN_VALUE);
                            } else {
                                var7.field2308.method3230(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field658 = Statics.field3611.field585[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2308.method3360(var7.field2308.field2386 - var8);
                    int var18 = var7.field2308.field2386;
                    var7.field2308.field2386 = var8;
                    var7.field2308.method3227(var10 / var11);
                    var7.field2308.method3227(var10 % var11);
                    var7.field2308.field2386 = var18;
                    field689.method1848(var7);
                }
                if (var9 >= Statics.field3611.field582) {
                    Statics.field3611.field582 = 0;
                } else {
                    Statics.field3611.field582 -= var9;
                    System.arraycopy(Statics.field3611.field588, var9, Statics.field3611.field588, 0, Statics.field3611.field582);
                    System.arraycopy(Statics.field3611.field584, var9, Statics.field3611.field584, 0, Statics.field3611.field582);
                    System.arraycopy(Statics.field3611.field585, var9, Statics.field3611.field585, 0, Statics.field3611.field582);
                }
            }
        }
        if (class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4 || class49.field469 == 2) {
            long var20 = (class49.field477 - field655 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field655 = class49.field477 * -1L;
            int var22 = class49.field478;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field42) {
                var22 = Statics.field42;
            }
            int var23 = class49.field475;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1983) {
                var23 = Statics.field1983;
            }
            int var24 = (int) var20;
            class175 var25 = class175.method948(class172.field2241, field689.field1278);
            var25.field2308.method3383((var24 << 1) + (class49.field469 == 2 ? 1 : 0));
            var25.field2308.method3383(var23);
            var25.field2308.method3383(var22);
            field689.method1848(var25);
        }
        if (class40.field372 > 0) {
            class175 var26 = class175.method948(class172.field2182, field689.field1278);
            var26.field2308.method3383(0);
            int var27 = var26.field2308.field2386;
            long var28 = class187.method918();
            for (int var30 = 0; var30 < class40.field372; var30++) {
                long var31 = var28 - field864;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field864 = var28;
                var26.field2308.method3268(class40.field369[var30]);
                var26.field2308.method3284((int) var31);
            }
            var26.field2308.method3239(var26.field2308.field2386 - var27);
            field689.method1848(var26);
        }
        if (field763 > 0) {
            field763--;
        }
        if (class40.field363[96] || class40.field363[97] || class40.field363[98] || class40.field363[99]) {
            field727 = true;
        }
        if (field727 && field763 <= 0) {
            field763 = 20;
            field727 = false;
            class175 var33 = class175.method948(class172.field2228, field689.field1278);
            var33.field2308.method3339(field712);
            var33.field2308.method3229(field711);
            field689.method1848(var33);
        }
        if (Statics.field3252 && !field659) {
            field659 = true;
            class175 var34 = class175.method948(class172.field2229, field689.field1278);
            var34.field2308.method3227(1);
            field689.method1848(var34);
        }
        if (!Statics.field3252 && field659) {
            field659 = false;
            class175 var35 = class175.method948(class172.field2229, field689.field1278);
            var35.field2308.method3227(0);
            field689.method1848(var35);
        }
        if (Statics.field2589 != null) {
            Statics.field2589.method5761();
        }
        method635();
        if (Statics.field325 != field767) {
            field767 = Statics.field325;
            int var36 = Statics.field325;
            int[] var37 = Statics.field111.field3853;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class51.field487[var36][var42][var40] & 0x18) == 0) {
                        Statics.field3123.method2675(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class51.field487[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field3123.method2675(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field111.method5482();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class51.field487[var36][var46][var45] & 0x18) == 0) {
                        method5129(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class51.field487[var36 + 1][var46][var45] & 0x8) != 0) {
                        method5129(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field866 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field3123.method2697(Statics.field325, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class123.method2261(var49);
                        int var52 = class271.method2839(var51).field3459;
                        if (var52 >= 0) {
                            field869[field866] = class258.method2830(var52).method4432(false);
                            field867[field866] = var47;
                            field868[field866] = var48;
                            field866++;
                        }
                    }
                }
            }
            Statics.field1928.method5452();
        }
        if (field652 != 30) {
            return;
        }
        for (class64 var53 = (class64) field771.method3746(); var53 != null; var53 = (class64) field771.method3747()) {
            if (var53.field926 > 0) {
                var53.field926--;
            }
            if (var53.field926 == 0) {
                if (var53.field916 >= 0) {
                    int var54 = var53.field916;
                    int var55 = var53.field921;
                    class271 var56 = class271.method2839(var54);
                    if (var55 == 11) {
                        var55 = 10;
                    }
                    if (var55 >= 5 && var55 <= 8) {
                        var55 = 4;
                    }
                    boolean var57 = var56.method4698(var55);
                    if (!var57) {
                        continue;
                    }
                }
                method156(var53.field920, var53.field922, var53.field917, var53.field919, var53.field916, var53.field929, var53.field921);
                var53.method3733();
            } else {
                if (var53.field925 > 0) {
                    var53.field925--;
                }
                if (var53.field925 == 0 && var53.field917 >= 1 && var53.field919 >= 1 && var53.field917 <= 102 && var53.field919 <= 102) {
                    if (var53.field918 >= 0) {
                        int var58 = var53.field918;
                        int var59 = var53.field924;
                        class271 var60 = class271.method2839(var58);
                        if (var59 == 11) {
                            var59 = 10;
                        }
                        if (var59 >= 5 && var59 <= 8) {
                            var59 = 4;
                        }
                        boolean var61 = var60.method4698(var59);
                        if (!var61) {
                            continue;
                        }
                    }
                    method156(var53.field920, var53.field922, var53.field917, var53.field919, var53.field918, var53.field923, var53.field924);
                    var53.field925 = -1;
                    if (var53.field918 == var53.field916 && var53.field916 == -1) {
                        var53.method3733();
                    } else if (var53.field918 == var53.field916 && var53.field929 == var53.field923 && var53.field924 == var53.field921) {
                        var53.method3733();
                    }
                }
            }
        }
        int var10002;
        for (int var62 = 0; var62 < field677; var62++) {
            var10002 = field881[var62]--;
            if (field881[var62] >= -10) {
                class94 var64 = field883[var62];
                if (var64 == null) {
                    class94 var10000 = (class94) null;
                    var64 = class94.method1919(Statics.field376, field879[var62], 0);
                    if (var64 == null) {
                        continue;
                    }
                    field881[var62] += var64.method1925();
                    field883[var62] = var64;
                }
                if (field881[var62] < 0) {
                    int var71;
                    if (field769[var62] == 0) {
                        var71 = field797;
                    } else {
                        int var65 = (field769[var62] & 0xFF) * 128;
                        int var66 = field769[var62] >> 16 & 0xFF;
                        int var67 = var66 * 128 + 64 - Statics.field241.field947;
                        if (var67 < 0) {
                            var67 = -var67;
                        }
                        int var68 = field769[var62] >> 8 & 0xFF;
                        int var69 = var68 * 128 + 64 - Statics.field241.field960;
                        if (var69 < 0) {
                            var69 = -var69;
                        }
                        int var70 = var67 + var69 - 128;
                        if (var70 > var65) {
                            field881[var62] = -100;
                            continue;
                        }
                        if (var70 < 0) {
                            var70 = 0;
                        }
                        var71 = field877 * (var65 - var70) / var65;
                    }
                    if (var71 > 0) {
                        class96 var72 = var64.method1918().method1961(Statics.field1738);
                        class106 var73 = class106.method2088(var72, 100, var71);
                        var73.method2091(field880[var62] - 1);
                        Statics.field3676.method1891(var73);
                    }
                    field881[var62] = -100;
                }
            } else {
                field677--;
                for (int var63 = var62; var63 < field677; var63++) {
                    field879[var63] = field879[var63 + 1];
                    field883[var63] = field883[var63 + 1];
                    field880[var63] = field880[var63 + 1];
                    field881[var63] = field881[var63 + 1];
                    field769[var63] = field769[var63 + 1];
                }
                var62--;
            }
        }
        if (field875) {
            boolean var74;
            if (class220.field2500 == 0) {
                var74 = Statics.field1971.method3853();
            } else {
                var74 = true;
            }
            if (!var74) {
                if (field822 != 0 && field874 != -1) {
                    class220.method88(Statics.field3168, field874, 0, field822, false);
                }
                field875 = false;
            }
        }
        field689.field1285++;
        if (field689.field1285 > 750) {
            method4188();
            return;
        }
        method1640();
        method5303();
        method2828();
        field665++;
        if (field648 != 0) {
            field855 += 20;
            if (field855 >= 400) {
                field648 = 0;
            }
        }
        if (Statics.field54 != null) {
            field748++;
            if (field748 >= 15) {
                method481(Statics.field54);
                Statics.field54 = null;
            }
        }
        class233 var75 = Statics.field2585;
        class233 var76 = Statics.field1927;
        Statics.field2585 = null;
        Statics.field1927 = null;
        field817 = null;
        field843 = false;
        field818 = false;
        field861 = 0;
        while (class40.method903() && field861 < 128) {
            if (field809 >= 2 && class40.field363[82] && Statics.field3164 == 66) {
                String var77 = class86.method201();
                Statics.field3184.method726(var77);
            } else if (field726 != 1 || Statics.field1996 <= 0) {
                field863[field861] = Statics.field3164;
                field862[field861] = Statics.field1996;
                field861++;
            }
        }
        if (method485() && class40.field363[82] && class40.field363[81] && field778 != 0) {
            int var78 = Statics.field241.field627 - field778;
            if (var78 < 0) {
                var78 = 0;
            } else if (var78 > 3) {
                var78 = 3;
            }
            if (Statics.field241.field627 != var78) {
                method2398(Statics.field31 + Statics.field241.field977[0], Statics.field1241 + Statics.field241.field975[0], var78, false);
            }
            field778 = 0;
        }
        if (field802 != -1) {
            method3555(field802, 0, 0, Statics.field1983, Statics.field42, 0, 0);
        }
        field664++;
        while (true) {
            class58 var79;
            class233 var80;
            class233 var81;
            do {
                var79 = (class58) field807.method3743();
                if (var79 == null) {
                    while (true) {
                        class58 var82;
                        class233 var83;
                        class233 var84;
                        do {
                            var82 = (class58) field841.method3743();
                            if (var82 == null) {
                                while (true) {
                                    class58 var85;
                                    class233 var86;
                                    class233 var87;
                                    do {
                                        var85 = (class58) field839.method3743();
                                        if (var85 == null) {
                                            this.method1099();
                                            if (Statics.field2589 != null) {
                                                Statics.field2589.method5666(Statics.field325, (Statics.field241.field947 >> 7) + Statics.field31, (Statics.field241.field960 >> 7) + Statics.field1241, false);
                                                Statics.field2589.method5681();
                                            }
                                            if (field719 != null) {
                                                this.method1253();
                                            }
                                            if (Statics.field2418 != null) {
                                                method481(Statics.field2418);
                                                field755++;
                                                if (class49.field461 == 0) {
                                                    if (field754) {
                                                        if (Statics.field2418 == Statics.field1090 && field792 != field731) {
                                                            class233 var88 = Statics.field2418;
                                                            byte var89 = 0;
                                                            if (field644 == 1 && var88.field2731 == 206) {
                                                                var89 = 1;
                                                            }
                                                            if (var88.field2750[field731] <= 0) {
                                                                var89 = 0;
                                                            }
                                                            if (class234.method298(method5092(var88))) {
                                                                int var90 = field792;
                                                                int var91 = field731;
                                                                var88.field2750[var91] = var88.field2750[var90];
                                                                var88.field2751[var91] = var88.field2751[var90];
                                                                var88.field2750[var90] = -1;
                                                                var88.field2751[var90] = 0;
                                                            } else if (var89 == 1) {
                                                                int var92 = field792;
                                                                int var93 = field731;
                                                                while (var92 != var93) {
                                                                    if (var92 > var93) {
                                                                        var88.method4110(var92 - 1, var92);
                                                                        var92--;
                                                                    } else if (var92 < var93) {
                                                                        var88.method4110(var92 + 1, var92);
                                                                        var92++;
                                                                    }
                                                                }
                                                            } else {
                                                                var88.method4110(field731, field792);
                                                            }
                                                            class175 var94 = class175.method948(class172.field2233, field689.field1278);
                                                            var94.field2308.method3383(field792);
                                                            var94.field2308.method3288(Statics.field2418.field2631);
                                                            var94.field2308.method3269(var89);
                                                            var94.field2308.method3229(field731);
                                                            field689.method1848(var94);
                                                        }
                                                    } else if (this.method1111()) {
                                                        this.method1162(field751, field752);
                                                    } else if (field696 > 0) {
                                                        method158(field751, field752);
                                                    }
                                                    field748 = 10;
                                                    class49.field469 = 0;
                                                    Statics.field2418 = null;
                                                } else if (field755 >= 5 && (class49.field466 > field751 + 5 || class49.field466 < field751 - 5 || class49.field468 > field752 + 5 || class49.field468 < field752 - 5)) {
                                                    field754 = true;
                                                }
                                            }
                                            if (class128.method2680()) {
                                                int var95 = class128.field1817;
                                                int var96 = class128.field1818;
                                                class175 var97 = class175.method948(class172.field2279, field689.field1278);
                                                var97.field2308.method3227(5);
                                                var97.field2308.method3269(class40.field363[82] ? (class40.field363[81] ? 2 : 1) : 0);
                                                var97.field2308.method3383(Statics.field31 + var95);
                                                var97.field2308.method3235(Statics.field1241 + var96);
                                                field689.method1848(var97);
                                                class128.method2643();
                                                field743 = class49.field475;
                                                field744 = class49.field478;
                                                field648 = 1;
                                                field855 = 0;
                                                field732 = var95;
                                                field643 = var96;
                                            }
                                            if (Statics.field2585 != var75) {
                                                if (var75 != null) {
                                                    method481(var75);
                                                }
                                                if (Statics.field2585 != null) {
                                                    method481(Statics.field2585);
                                                }
                                            }
                                            if (Statics.field1927 != var76 && field865 == field794) {
                                                if (var76 != null) {
                                                    method481(var76);
                                                }
                                                if (Statics.field1927 != null) {
                                                    method481(Statics.field1927);
                                                }
                                            }
                                            if (Statics.field1927 == null) {
                                                if (field865 > 0) {
                                                    field865--;
                                                }
                                            } else if (field865 < field794) {
                                                field865++;
                                                if (field865 == field794) {
                                                    method481(Statics.field1927);
                                                }
                                            }
                                            if (field726 == 0) {
                                                int var98 = Statics.field241.field947;
                                                int var99 = Statics.field241.field960;
                                                if (Statics.field1081 - var98 < -500 || Statics.field1081 - var98 > 500 || Statics.field512 - var99 < -500 || Statics.field512 - var99 > 500) {
                                                    Statics.field1081 = var98;
                                                    Statics.field512 = var99;
                                                }
                                                if (Statics.field1081 != var98) {
                                                    Statics.field1081 += (var98 - Statics.field1081) / 16;
                                                }
                                                if (Statics.field512 != var99) {
                                                    Statics.field512 += (var99 - Statics.field512) / 16;
                                                }
                                                int var100 = Statics.field1081 >> 7;
                                                int var101 = Statics.field512 >> 7;
                                                int var102 = method622(Statics.field1081, Statics.field512, Statics.field325);
                                                int var103 = 0;
                                                if (var100 > 3 && var101 > 3 && var100 < 100 && var101 < 100) {
                                                    for (int var104 = var100 - 4; var104 <= var100 + 4; var104++) {
                                                        for (int var105 = var101 - 4; var105 <= var101 + 4; var105++) {
                                                            int var106 = Statics.field325;
                                                            if (var106 < 3 && (class51.field487[1][var104][var105] & 0x2) == 2) {
                                                                var106++;
                                                            }
                                                            int var107 = var102 - class51.field495[var106][var104][var105];
                                                            if (var107 > var103) {
                                                                var103 = var107;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var108 = var103 * 192;
                                                if (var108 > 98048) {
                                                    var108 = 98048;
                                                }
                                                if (var108 < 32768) {
                                                    var108 = 32768;
                                                }
                                                if (var108 > field762) {
                                                    field762 += (var108 - field762) / 24;
                                                } else if (var108 < field762) {
                                                    field762 += (var108 - field762) / 80;
                                                }
                                                Statics.field1071 = method622(Statics.field241.field947, Statics.field241.field960, Statics.field325) - field790;
                                            } else if (field726 == 1) {
                                                method3559();
                                                short var109 = -1;
                                                if (class40.field363[33]) {
                                                    var109 = 0;
                                                } else if (class40.field363[49]) {
                                                    var109 = 1024;
                                                }
                                                if (class40.field363[48]) {
                                                    if (var109 == 0) {
                                                        var109 = 1792;
                                                    } else if (var109 == 1024) {
                                                        var109 = 1280;
                                                    } else {
                                                        var109 = 1536;
                                                    }
                                                } else if (class40.field363[50]) {
                                                    if (var109 == 0) {
                                                        var109 = 256;
                                                    } else if (var109 == 1024) {
                                                        var109 = 768;
                                                    } else {
                                                        var109 = 512;
                                                    }
                                                }
                                                byte var110 = 0;
                                                if (class40.field363[35]) {
                                                    var110 = -1;
                                                } else if (class40.field363[51]) {
                                                    var110 = 1;
                                                }
                                                int var111 = 0;
                                                if (var109 >= 0 || var110 != 0) {
                                                    int var112 = class40.field363[81] ? field671 : field756;
                                                    var111 = var112 * 16;
                                                    field720 = var109;
                                                    field721 = var110;
                                                }
                                                if (field703 < var111) {
                                                    field703 += var111 / 8;
                                                    if (field703 > var111) {
                                                        field703 = var111;
                                                    }
                                                } else if (field703 > var111) {
                                                    field703 = field703 * 9 / 10;
                                                }
                                                if (field703 > 0) {
                                                    int var113 = field703 / 16;
                                                    if (field720 >= 0) {
                                                        int var114 = field720 - Statics.field1948 & 0x7FF;
                                                        int var115 = class125.field1766[var114];
                                                        int var116 = class125.field1741[var114];
                                                        Statics.field1081 += var113 * var115 / 65536;
                                                        Statics.field512 += var113 * var116 / 65536;
                                                    }
                                                    if (field721 != 0) {
                                                        Statics.field1071 += field721 * var113;
                                                        if (Statics.field1071 > 0) {
                                                            Statics.field1071 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field720 = -1;
                                                    field721 = -1;
                                                }
                                                if (class40.field363[13]) {
                                                    method2838();
                                                }
                                            }
                                            if (class49.field461 == 4 && Statics.field1393) {
                                                int var117 = class49.field468 - field693;
                                                field714 = var117 * 2;
                                                field693 = var117 == -1 || var117 == 1 ? class49.field468 : (field693 + class49.field468) / 2;
                                                int var118 = field715 - class49.field466;
                                                field713 = var118 * 2;
                                                field715 = var118 == -1 || var118 == 1 ? class49.field466 : (field715 + class49.field466) / 2;
                                            } else {
                                                if (class40.field363[96]) {
                                                    field713 += (-24 - field713) / 2;
                                                } else if (class40.field363[97]) {
                                                    field713 += (24 - field713) / 2;
                                                } else {
                                                    field713 /= 2;
                                                }
                                                if (class40.field363[98]) {
                                                    field714 += (12 - field714) / 2;
                                                } else if (class40.field363[99]) {
                                                    field714 += (-12 - field714) / 2;
                                                } else {
                                                    field714 /= 2;
                                                }
                                                field693 = class49.field468;
                                                field715 = class49.field466;
                                            }
                                            field712 = field713 / 2 + field712 & 0x7FF;
                                            field711 += field714 / 2;
                                            if (field711 < 128) {
                                                field711 = 128;
                                            }
                                            if (field711 > 383) {
                                                field711 = 383;
                                            }
                                            if (field884) {
                                                Statics.method963();
                                            }
                                            for (int var119 = 0; var119 < 5; var119++) {
                                                var10002 = field889[var119]++;
                                            }
                                            Statics.field70.method1774();
                                            int var120 = class49.method4178();
                                            int var121 = class40.field368;
                                            if (var120 > 15000 && var121 > 15000) {
                                                field690 = 250;
                                                class49.field472 = 14500;
                                                class175 var123 = class175.method948(class172.field2188, field689.field1278);
                                                field689.method1848(var123);
                                            }
                                            Statics.field40.method1520();
                                            field689.field1284++;
                                            if (field689.field1284 > 50) {
                                                class175 var124 = class175.method948(class172.field2186, field689.field1278);
                                                field689.method1848(var124);
                                            }
                                            try {
                                                field689.method1845();
                                            } catch (IOException var126) {
                                                method4188();
                                            }
                                            return;
                                        }
                                        var86 = var85.field562;
                                        if (var86.field2632 < 0) {
                                            break;
                                        }
                                        var87 = class233.method575(var86.field2737);
                                    } while (var87 == null || var87.field2756 == null || var86.field2632 >= var87.field2756.length || var87.field2756[var86.field2632] != var86);
                                    class71.method3130(var85);
                                }
                            }
                            var83 = var82.field562;
                            if (var83.field2632 < 0) {
                                break;
                            }
                            var84 = class233.method575(var83.field2737);
                        } while (var84 == null || var84.field2756 == null || var83.field2632 >= var84.field2756.length || var84.field2756[var83.field2632] != var83);
                        class71.method3130(var82);
                    }
                }
                var80 = var79.field562;
                if (var80.field2632 < 0) {
                    break;
                }
                var81 = class233.method575(var80.field2737);
            } while (var81 == null || var81.field2756 == null || var80.field2632 >= var81.field2756.length || var81.field2756[var80.field2632] != var80);
            class71.method3130(var79);
        }
    }

    @ObfuscatedName("hw.fr(I)V")
    public static final void method4032() {
        if (Statics.field518 != null) {
            Statics.field518.method2002();
        }
        if (Statics.field365 != null) {
            Statics.field365.method2002();
        }
    }

    @ObfuscatedName("gl.fb(Ljk;IIII)V")
    public static void method3480(class276 arg0, int arg1, int arg2, int arg3) {
        if (field677 >= 50 || field877 == 0 || arg0.field3588 == null || arg1 >= arg0.field3588.length) {
            return;
        }
        int var4 = arg0.field3588[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field879[field677] = var5;
        field880[field677] = var6;
        field881[field677] = 0;
        field883[field677] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field769[field677] = (var8 << 16) + (var9 << 8) + var7;
        field677++;
    }

    @ObfuscatedName("an.fm(I)V")
    public static final void method635() {
        if (!Statics.field243) {
            return;
        }
        if (Statics.field928 != null) {
            Statics.field928.method4981();
        }
        method163();
        Statics.field243 = false;
    }

    @ObfuscatedName("s.fn(Lhv;III)V")
    public static final void method120(class233 arg0, int arg1, int arg2) {
        if (field747 != 0 && field747 != 3 || field750 || !(class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4)) {
            return;
        }
        class227 var3 = arg0.method4145(true);
        if (var3 == null) {
            return;
        }
        int var4 = class49.field475 - arg1;
        int var5 = class49.field478 - arg2;
        if (!var3.method4026(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2593 / 2;
        int var7 = var5 - var3.field2590 / 2;
        int var8 = field712 & 0x7FF;
        int var9 = class125.field1766[var8];
        int var10 = class125.field1741[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field241.field947 + var11 >> 7;
        int var14 = Statics.field241.field960 - var12 >> 7;
        class175 var15 = class175.method948(class172.field2262, field689.field1278);
        var15.field2308.method3227(18);
        var15.field2308.method3269(class40.field363[82] ? (class40.field363[81] ? 2 : 1) : 0);
        var15.field2308.method3383(Statics.field31 + var13);
        var15.field2308.method3235(Statics.field1241 + var14);
        var15.field2308.method3227(var6);
        var15.field2308.method3227(var7);
        var15.field2308.method3383(field712);
        var15.field2308.method3227(57);
        var15.field2308.method3227(0);
        var15.field2308.method3227(0);
        var15.field2308.method3227(89);
        var15.field2308.method3383(Statics.field241.field947);
        var15.field2308.method3383(Statics.field241.field960);
        var15.field2308.method3227(63);
        field689.method1848(var15);
        field732 = var13;
        field643 = var14;
    }

    @ObfuscatedName("dc.ff(I)V")
    public static final void method2828() {
        int[] var0 = class84.field1211;
        for (int var1 = 0; var1 < class84.field1212; var1++) {
            class62 var2 = field758[var0[var1]];
            if (var2 != null && var2.field950 > 0) {
                var2.field950--;
                if (var2.field950 == 0) {
                    var2.field989 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field746; var3++) {
            int var4 = field761[var3];
            class74 var5 = field684[var4];
            if (var5 != null && var5.field950 > 0) {
                var5.field950--;
                if (var5.field950 == 0) {
                    var5.field989 = null;
                }
            }
        }
    }

    @ObfuscatedName("bd.fq(I)V")
    public static final void method1640() {
        int var0 = class84.field1212;
        int[] var1 = class84.field1211;
        for (int var2 = 0; var2 < var0; var2++) {
            class62 var3 = field758[var1[var2]];
            if (var3 != null) {
                method551(var3, 1);
            }
        }
    }

    @ObfuscatedName("ld.fa(B)V")
    public static final void method5303() {
        for (int var0 = 0; var0 < field746; var0++) {
            int var1 = field761[var0];
            class74 var2 = field684[var1];
            if (var2 != null) {
                method551(var2, var2.field1089.field3539);
            }
        }
    }

    @ObfuscatedName("ab.fe(Lbj;IB)V")
    public static final void method551(class65 arg0, int arg1) {
        if (arg0.field965 > field654) {
            int var2 = arg0.field965 - field654;
            int var3 = arg0.field973 * 128 + arg0.field934 * 64;
            int var4 = arg0.field968 * 128 + arg0.field934 * 64;
            arg0.field947 += (var3 - arg0.field947) / var2;
            arg0.field960 += (var4 - arg0.field960) / var2;
            arg0.field976 = 0;
            arg0.field982 = arg0.field936;
        } else if (arg0.field978 >= field654) {
            if (field654 == arg0.field978 || arg0.field963 == -1 || arg0.field987 != 0 || arg0.field942 + 1 > class276.method2826(arg0.field963).field3587[arg0.field964]) {
                int var5 = arg0.field978 - arg0.field965;
                int var6 = field654 - arg0.field965;
                int var7 = arg0.field973 * 128 + arg0.field934 * 64;
                int var8 = arg0.field968 * 128 + arg0.field934 * 64;
                int var9 = arg0.field974 * 128 + arg0.field934 * 64;
                int var10 = arg0.field935 * 128 + arg0.field934 * 64;
                arg0.field947 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field960 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field976 = 0;
            arg0.field982 = arg0.field936;
            arg0.field932 = arg0.field982;
        } else {
            method1510(arg0);
        }
        if (arg0.field947 < 128 || arg0.field960 < 128 || arg0.field947 >= 13184 || arg0.field960 >= 13184) {
            arg0.field963 = -1;
            arg0.field971 = -1;
            arg0.field965 = 0;
            arg0.field978 = 0;
            arg0.field947 = arg0.field977[0] * 128 + arg0.field934 * 64;
            arg0.field960 = arg0.field975[0] * 128 + arg0.field934 * 64;
            arg0.method1455();
        }
        if (Statics.field241 == arg0 && (arg0.field947 < 1536 || arg0.field960 < 1536 || arg0.field947 >= 11776 || arg0.field960 >= 11776)) {
            arg0.field963 = -1;
            arg0.field971 = -1;
            arg0.field965 = 0;
            arg0.field978 = 0;
            arg0.field947 = arg0.field977[0] * 128 + arg0.field934 * 64;
            arg0.field960 = arg0.field975[0] * 128 + arg0.field934 * 64;
            arg0.method1455();
        }
        if (arg0.field984 != 0) {
            if (arg0.field944 != -1) {
                class65 var11 = null;
                if (arg0.field944 < 32768) {
                    var11 = field684[arg0.field944];
                } else if (arg0.field944 >= 32768) {
                    var11 = field758[arg0.field944 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field947 - var11.field947;
                    int var13 = arg0.field960 - var11.field960;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field982 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field958) {
                    arg0.field944 = -1;
                    arg0.field958 = false;
                }
            }
            if (arg0.field959 != -1 && (arg0.field985 == 0 || arg0.field976 > 0)) {
                arg0.field982 = arg0.field959;
                arg0.field959 = -1;
            }
            int var14 = arg0.field982 - arg0.field932 & 0x7FF;
            if (var14 == 0 && arg0.field958) {
                arg0.field944 = -1;
                arg0.field958 = false;
            }
            if (var14 == 0) {
                arg0.field961 = 0;
            } else {
                arg0.field961++;
                if (var14 > 1024) {
                    arg0.field932 -= arg0.field984;
                    boolean var15 = true;
                    if (var14 < arg0.field984 || var14 > 2048 - arg0.field984) {
                        arg0.field932 = arg0.field982;
                        var15 = false;
                    }
                    if (arg0.field970 == arg0.field930 && (arg0.field961 > 25 || var15)) {
                        if (arg0.field937 == -1) {
                            arg0.field970 = arg0.field939;
                        } else {
                            arg0.field970 = arg0.field937;
                        }
                    }
                } else {
                    arg0.field932 += arg0.field984;
                    boolean var16 = true;
                    if (var14 < arg0.field984 || var14 > 2048 - arg0.field984) {
                        arg0.field932 = arg0.field982;
                        var16 = false;
                    }
                    if (arg0.field970 == arg0.field930 && (arg0.field961 > 25 || var16)) {
                        if (arg0.field938 == -1) {
                            arg0.field970 = arg0.field939;
                        } else {
                            arg0.field970 = arg0.field938;
                        }
                    }
                }
                arg0.field932 &= 0x7FF;
            }
        }
        method297(arg0);
    }

    @ObfuscatedName("bi.fc(Lbj;I)V")
    public static final void method1510(class65 arg0) {
        arg0.field970 = arg0.field930;
        if (arg0.field985 == 0) {
            arg0.field976 = 0;
            return;
        }
        if (arg0.field963 != -1 && arg0.field987 == 0) {
            class276 var1 = class276.method2826(arg0.field963);
            if (arg0.field990 > 0 && var1.field3596 == 0) {
                arg0.field976++;
                return;
            }
            if (arg0.field990 <= 0 && var1.field3597 == 0) {
                arg0.field976++;
                return;
            }
        }
        int var2 = arg0.field947;
        int var3 = arg0.field960;
        int var4 = arg0.field977[arg0.field985 - 1] * 128 + arg0.field934 * 64;
        int var5 = arg0.field975[arg0.field985 - 1] * 128 + arg0.field934 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field982 = 1280;
            } else if (var3 > var5) {
                arg0.field982 = 1792;
            } else {
                arg0.field982 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field982 = 768;
            } else if (var3 > var5) {
                arg0.field982 = 256;
            } else {
                arg0.field982 = 512;
            }
        } else if (var3 < var5) {
            arg0.field982 = 1024;
        } else if (var3 > var5) {
            arg0.field982 = 0;
        }
        byte var6 = arg0.field988[arg0.field985 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field947 = var4;
            arg0.field960 = var5;
            arg0.field985--;
            if (arg0.field990 > 0) {
                arg0.field990--;
            }
            return;
        }
        int var7 = arg0.field982 - arg0.field932 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field940;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field939;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field983;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field941;
        }
        if (var8 == -1) {
            var8 = arg0.field939;
        }
        arg0.field970 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class74) {
            var10 = ((class74) arg0).field1089.field3566;
        }
        if (var10) {
            if (arg0.field982 != arg0.field932 && arg0.field944 == -1 && arg0.field984 != 0) {
                var9 = 2;
            }
            if (arg0.field985 > 2) {
                var9 = 6;
            }
            if (arg0.field985 > 3) {
                var9 = 8;
            }
            if (arg0.field976 > 0 && arg0.field985 > 1) {
                var9 = 8;
                arg0.field976--;
            }
        } else {
            if (arg0.field985 > 1) {
                var9 = 6;
            }
            if (arg0.field985 > 2) {
                var9 = 8;
            }
            if (arg0.field976 > 0 && arg0.field985 > 1) {
                var9 = 8;
                arg0.field976--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field970 == arg0.field939 && arg0.field943 != -1) {
            arg0.field970 = arg0.field943;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field947 += var9;
                if (arg0.field947 > var4) {
                    arg0.field947 = var4;
                }
            } else if (var2 > var4) {
                arg0.field947 -= var9;
                if (arg0.field947 < var4) {
                    arg0.field947 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field960 += var9;
                if (arg0.field960 > var5) {
                    arg0.field960 = var5;
                }
            } else if (var3 > var5) {
                arg0.field960 -= var9;
                if (arg0.field960 < var5) {
                    arg0.field960 = var5;
                }
            }
        }
        if (arg0.field947 == var4 && arg0.field960 == var5) {
            arg0.field985--;
            if (arg0.field990 > 0) {
                arg0.field990--;
            }
        }
    }

    @ObfuscatedName("z.fx(Lbj;I)V")
    public static final void method297(class65 arg0) {
        arg0.field933 = false;
        if (arg0.field970 != -1) {
            class276 var1 = class276.method2826(arg0.field970);
            if (var1 == null || var1.field3585 == null) {
                arg0.field970 = -1;
            } else {
                arg0.field962++;
                if (arg0.field979 < var1.field3585.length && arg0.field962 > var1.field3587[arg0.field979]) {
                    arg0.field962 = 1;
                    arg0.field979++;
                    method3480(var1, arg0.field979, arg0.field947, arg0.field960);
                }
                if (arg0.field979 >= var1.field3585.length) {
                    arg0.field962 = 0;
                    arg0.field979 = 0;
                    method3480(var1, arg0.field979, arg0.field947, arg0.field960);
                }
            }
        }
        if (arg0.field971 != -1 && field654 >= arg0.field957) {
            if (arg0.field969 < 0) {
                arg0.field969 = 0;
            }
            int var2 = class261.method34(arg0.field971).field3308;
            if (var2 == -1) {
                arg0.field971 = -1;
            } else {
                class276 var3 = class276.method2826(var2);
                if (var3 == null || var3.field3585 == null) {
                    arg0.field971 = -1;
                } else {
                    arg0.field966++;
                    if (arg0.field969 < var3.field3585.length && arg0.field966 > var3.field3587[arg0.field969]) {
                        arg0.field966 = 1;
                        arg0.field969++;
                        method3480(var3, arg0.field969, arg0.field947, arg0.field960);
                    }
                    if (arg0.field969 >= var3.field3585.length && (arg0.field969 < 0 || arg0.field969 >= var3.field3585.length)) {
                        arg0.field971 = -1;
                    }
                }
            }
        }
        if (arg0.field963 != -1 && arg0.field987 <= 1) {
            class276 var4 = class276.method2826(arg0.field963);
            if (var4.field3596 == 1 && arg0.field990 > 0 && arg0.field965 <= field654 && arg0.field978 < field654) {
                arg0.field987 = 1;
                return;
            }
        }
        if (arg0.field963 != -1 && arg0.field987 == 0) {
            class276 var5 = class276.method2826(arg0.field963);
            if (var5 == null || var5.field3585 == null) {
                arg0.field963 = -1;
            } else {
                arg0.field942++;
                if (arg0.field964 < var5.field3585.length && arg0.field942 > var5.field3587[arg0.field964]) {
                    arg0.field942 = 1;
                    arg0.field964++;
                    method3480(var5, arg0.field964, arg0.field947, arg0.field960);
                }
                if (arg0.field964 >= var5.field3585.length) {
                    arg0.field964 -= var5.field3594;
                    arg0.field967++;
                    if (arg0.field967 >= var5.field3598) {
                        arg0.field963 = -1;
                    } else if (arg0.field964 >= 0 && arg0.field964 < var5.field3585.length) {
                        method3480(var5, arg0.field964, arg0.field947, arg0.field960);
                    } else {
                        arg0.field963 = -1;
                    }
                }
                arg0.field933 = var5.field3591;
            }
        }
        if (arg0.field987 > 0) {
            arg0.field987--;
        }
    }

    @ObfuscatedName("ao.gn(Lbb;III)V")
    public static void method891(class62 arg0, int arg1, int arg2) {
        if (arg0.field963 == arg1 && arg1 != -1) {
            int var3 = class276.method2826(arg1).field3581;
            if (var3 == 1) {
                arg0.field964 = 0;
                arg0.field942 = 0;
                arg0.field987 = arg2;
                arg0.field967 = 0;
            }
            if (var3 == 2) {
                arg0.field967 = 0;
            }
        } else if (arg1 == -1 || arg0.field963 == -1 || class276.method2826(arg1).field3592 >= class276.method2826(arg0.field963).field3592) {
            arg0.field963 = arg1;
            arg0.field964 = 0;
            arg0.field942 = 0;
            arg0.field987 = arg2;
            arg0.field967 = 0;
            arg0.field990 = arg0.field985;
        }
    }

    @ObfuscatedName("bx.gv(I)I")
    public static int method1667() {
        return field854 ? 2 : 1;
    }

    @ObfuscatedName("bf.gg(II)V")
    public static void method1069(int arg0) {
        field870 = 0L;
        if (arg0 >= 2) {
            field854 = true;
        } else {
            field854 = false;
        }
        if (method1667() == 1) {
            Statics.field3184.method723(765, 503);
        } else {
            Statics.field3184.method723(7680, 2160);
        }
        if (field652 < 25) {
            return;
        }
        class175 var1 = class175.method948(class172.field2191, field689.field1278);
        var1.field2308.method3227(method1667());
        var1.field2308.method3383(Statics.field1983);
        var1.field2308.method3383(Statics.field42);
        field689.method1848(var1);
    }

    @ObfuscatedName("client.x(B)V")
    public final void method730() {
        field870 = class187.method918() + 500L;
        this.method1160();
        if (field802 != -1) {
            this.method1395(true);
        }
    }

    @ObfuscatedName("client.gi(I)V")
    public void method1160() {
        int var1 = Statics.field1983;
        int var2 = Statics.field42;
        if (this.field435 < var1) {
            int var3 = this.field435;
        }
        if (this.field454 < var2) {
            int var4 = this.field454;
        }
        if (Statics.field580 == null) {
            return;
        }
        try {
            client var5 = Statics.field3184;
            Object[] var6 = new Object[] { method1667() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gq(I)V")
    public final void method1097() {
        if (field802 != -1) {
            method1002(field802);
        }
        for (int var1 = 0; var1 < field770; var1++) {
            if (field845[var1]) {
                field846[var1] = true;
            }
            field847[var1] = field845[var1];
            field845[var1] = false;
        }
        field844 = field654;
        field913 = -1;
        field891 = -1;
        Statics.field1090 = null;
        if (field802 != -1) {
            field770 = 0;
            method3479(field802, 0, 0, Statics.field1983, Statics.field42, 0, 0, -1);
        }
        class320.method5370();
        if (field739) {
            if (field648 == 1) {
                Statics.field3309[field855 / 100].method5491(field743 - 8, field744 - 8);
            }
            if (field648 == 2) {
                Statics.field3309[field855 / 100 + 4].method5491(field743 - 8, field744 - 8);
            }
        }
        if (field750) {
            int var7 = Statics.field2821;
            int var8 = Statics.field3260;
            int var9 = Statics.field1049;
            int var10 = Statics.field1;
            int var11 = 6116423;
            class320.method5379(var7, var8, var9, var10, var11);
            class320.method5379(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class320.method5383(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field1399.method5217(class240.field2980, var7 + 3, var8 + 14, var11, -1);
            int var12 = class49.field466;
            int var13 = class49.field468;
            for (int var14 = 0; var14 < field696; var14++) {
                int var15 = (field696 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                class301 var17 = Statics.field1399;
                String var18;
                if (var14 < 0) {
                    var18 = "";
                } else if (field785[var14].length() > 0) {
                    var18 = field784[var14] + class240.field2987 + field785[var14];
                } else {
                    var18 = field784[var14];
                }
                var17.method5217(var18, var7 + 3, var15, var16, 0);
            }
            int var19 = Statics.field2821;
            int var20 = Statics.field3260;
            int var21 = Statics.field1049;
            int var22 = Statics.field1;
            for (int var23 = 0; var23 < field770; var23++) {
                if (field850[var23] + field848[var23] > var19 && field848[var23] < var19 + var21 && field882[var23] + field741[var23] > var20 && field882[var23] < var20 + var22) {
                    field846[var23] = true;
                }
            }
        } else if (field913 != -1) {
            int var2 = field913;
            int var3 = field891;
            if ((field696 >= 2 || field795 != 0 || field886) && field759) {
                int var4 = Statics.method907();
                String var5;
                if (field795 == 1 && field696 < 2) {
                    var5 = class240.field2977 + class240.field2987 + field796 + " " + class76.field1106;
                } else if (field886 && field696 < 2) {
                    var5 = field800 + class240.field2987 + field801 + " " + class76.field1106;
                } else {
                    String var6;
                    if (var4 < 0) {
                        var6 = "";
                    } else if (field785[var4].length() > 0) {
                        var6 = field784[var4] + class240.field2987 + field785[var4];
                    } else {
                        var6 = field784[var4];
                    }
                    var5 = var6;
                }
                if (field696 > 2) {
                    var5 = var5 + class76.method676(16777215) + " " + '/' + " " + (field696 - 2) + class240.field2981;
                }
                Statics.field1399.method5215(var5, var2 + 4, var3 + 15, 16777215, 0, field654 / 1000);
            }
        }
        if (field852 == 3) {
            for (int var24 = 0; var24 < field770; var24++) {
                if (field847[var24]) {
                    class320.method5384(field848[var24], field882[var24], field850[var24], field741[var24], 16711935, 128);
                } else if (field846[var24]) {
                    class320.method5384(field848[var24], field882[var24], field850[var24], field741[var24], 16711680, 128);
                }
            }
        }
        int var25 = Statics.field325;
        int var26 = Statics.field241.field947;
        int var27 = Statics.field241.field960;
        int var28 = field665;
        for (class70 var29 = (class70) class70.field1037.method3746(); var29 != null; var29 = (class70) class70.field1037.method3747()) {
            if (var29.field1039 != -1 || var29.field1043 != null) {
                int var30 = 0;
                if (var26 > var29.field1036) {
                    var30 += var26 - var29.field1036;
                } else if (var26 < var29.field1034) {
                    var30 += var29.field1034 - var26;
                }
                if (var27 > var29.field1046) {
                    var30 += var27 - var29.field1046;
                } else if (var27 < var29.field1035) {
                    var30 += var29.field1035 - var27;
                }
                if (var30 - 64 > var29.field1042 || field877 == 0 || var29.field1033 != var25) {
                    if (var29.field1038 != null) {
                        Statics.field3676.method1869(var29.field1038);
                        var29.field1038 = null;
                    }
                    if (var29.field1045 != null) {
                        Statics.field3676.method1869(var29.field1045);
                        var29.field1045 = null;
                    }
                } else {
                    var30 -= 64;
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    int var31 = field877 * (var29.field1042 - var30) / var29.field1042;
                    class94 var10000;
                    if (var29.field1038 != null) {
                        var29.field1038.method2092(var31);
                    } else if (var29.field1039 >= 0) {
                        var10000 = (class94) null;
                        class94 var32 = class94.method1919(Statics.field376, var29.field1039, 0);
                        if (var32 != null) {
                            class96 var33 = var32.method1918().method1961(Statics.field1738);
                            class106 var34 = class106.method2088(var33, 100, var31);
                            var34.method2091(-1);
                            Statics.field3676.method1891(var34);
                            var29.field1038 = var34;
                        }
                    }
                    if (var29.field1045 != null) {
                        var29.field1045.method2092(var31);
                        if (!var29.field1045.method3734()) {
                            var29.field1045 = null;
                        }
                    } else if (var29.field1043 != null && (var29.field1044 -= var28) <= 0) {
                        int var35 = (int) (Math.random() * (double) var29.field1043.length);
                        var10000 = (class94) null;
                        class94 var36 = class94.method1919(Statics.field376, var29.field1043[var35], 0);
                        if (var36 != null) {
                            class96 var37 = var36.method1918().method1961(Statics.field1738);
                            class106 var38 = class106.method2088(var37, 100, var31);
                            var38.method2091(0);
                            Statics.field3676.method1891(var38);
                            var29.field1045 = var38;
                            var29.field1044 = var29.field1041 + (int) (Math.random() * (double) (var29.field1040 - var29.field1041));
                        }
                    }
                }
            }
        }
        field665 = 0;
    }

    @ObfuscatedName("dj.gl(Ljava/lang/String;ZI)V")
    public static final void method2396(String arg0, boolean arg1) {
        if (!field753) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field209.method5144(arg0, 250);
        int var6 = Statics.field209.method5146(arg0, 250) * 13;
        class320.method5379(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class320.method5383(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field209.method5152(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2885(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1928.method711(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field770; var11++) {
            if (field850[var11] + field848[var11] > var7 && field848[var11] < var7 + var9 && field882[var11] + field741[var11] > var8 && field882[var11] < var8 + var10) {
                field846[var11] = true;
            }
        }
    }

    @ObfuscatedName("ic.gc(IIIIZI)V")
    public static final void method4306(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (field772 - field890) * var5 / 100 + field890;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field894) {
            short var8 = field894;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field895) {
                var6 = field895;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class320.method5370();
                    class320.method5379(arg0, arg1, var10, arg3, -16777216);
                    class320.method5379(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field897) {
            short var11 = field897;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field912) {
                var6 = field912;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class320.method5370();
                    class320.method5379(arg0, arg1, arg2, var13, -16777216);
                    class320.method5379(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field722 - field892) * var5 / 100 + field892;
        field876 = arg3 * var6 * var14 / 85504 << 1;
        if (field900 != arg2 || field901 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class125.field1766[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class128.method2676(var15, 500, 800, arg2, arg3);
        }
        field898 = arg0;
        field821 = arg1;
        field900 = arg2;
        field901 = arg3;
    }

    @ObfuscatedName("lk.gh(I)V")
    public static void method5363() {
        if (Statics.field241.field947 >> 7 == field732 && Statics.field241.field960 >> 7 == field643) {
            field732 = 0;
        }
    }

    @ObfuscatedName("fb.gp(I)V")
    public static void method3142() {
        if (field687) {
            method4180(Statics.field241, false);
        }
    }

    @ObfuscatedName("bq.gf(I)V")
    public static void method995() {
        if (field685 >= 0 && field758[field685] != null) {
            method4180(field758[field685], false);
        }
    }

    @ObfuscatedName("im.ge(Lbb;ZI)V")
    public static void method4180(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1040() || arg0.field608) {
            return;
        }
        arg0.field626 = false;
        if ((field782 && class84.field1212 > 50 || class84.field1212 > 200) && arg1 && arg0.field970 == arg0.field930) {
            arg0.field626 = true;
        }
        int var2 = arg0.field947 >> 7;
        int var3 = arg0.field960 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method2401(0, 0, 0, false, arg0.field630);
        if (arg0.field621 != null && field654 >= arg0.field636 && field654 < arg0.field617) {
            arg0.field626 = false;
            arg0.field615 = method622(arg0.field947, arg0.field960, Statics.field325);
            arg0.field986 = field654;
            Statics.field3123.method2802(Statics.field325, arg0.field947, arg0.field960, arg0.field615, 60, arg0, arg0.field932, var4, arg0.field622, arg0.field610, arg0.field607, arg0.field625);
            return;
        }
        if ((arg0.field947 & 0x7F) == 64 && (arg0.field960 & 0x7F) == 64) {
            if (field740 == field670[var2][var3]) {
                return;
            }
            field670[var2][var3] = field740;
        }
        arg0.field615 = method622(arg0.field947, arg0.field960, Statics.field325);
        arg0.field986 = field654;
        Statics.field3123.method2653(Statics.field325, arg0.field947, arg0.field960, arg0.field615, 60, arg0, arg0.field932, var4, arg0.field933);
    }

    @ObfuscatedName("ba.gj(ZI)V")
    public static final void method976(boolean arg0) {
        for (int var1 = 0; var1 < field746; var1++) {
            class74 var2 = field684[field761[var1]];
            if (var2 != null && var2.method1040() && var2.field1089.field3557 == arg0 && var2.field1089.method4803()) {
                int var3 = var2.field947 >> 7;
                int var4 = var2.field960 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field934 == 1 && (var2.field947 & 0x7F) == 64 && (var2.field960 & 0x7F) == 64) {
                        if (field740 == field670[var3][var4]) {
                            continue;
                        }
                        field670[var3][var4] = field740;
                    }
                    long var5 = class123.method2401(0, 0, 1, !var2.field1089.field3537, field761[var1]);
                    var2.field986 = field654;
                    Statics.field3123.method2653(Statics.field325, var2.field947, var2.field960, method622(var2.field947 + (var2.field934 * 64 - 64), var2.field960 + (var2.field934 * 64 - 64), Statics.field325), var2.field934 * 64 - 64 + 60, var2, var2.field932, var5, var2.field933);
                }
            }
        }
    }

    @ObfuscatedName("di.ga(I)Z")
    public static boolean method2082() {
        return (field667 & 0x4) != 0;
    }

    @ObfuscatedName("is.gt(B)Z")
    public static boolean method4362() {
        return (field667 & 0x2) != 0;
    }

    @ObfuscatedName("v.gy(I)Z")
    public static boolean method134() {
        return (field667 & 0x8) != 0;
    }

    @ObfuscatedName("ee.gd(Lbb;I)Z")
    public static boolean method2944(class62 arg0) {
        if (field667 == 0) {
            return false;
        } else if (Statics.field241 == arg0) {
            return method134();
        } else {
            boolean var1 = method2082();
            if (!var1) {
                boolean var2 = (field667 & 0x1) != 0;
                var1 = var2 && arg0.method1035();
            }
            return var1 || method4362() && arg0.method1052();
        }
    }

    @ObfuscatedName("ac.gr(Lbj;IIIIIB)V")
    public static final void method620(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1040()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1089;
            if (var6.field3532 != null) {
                var6 = var6.method4818();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1212;
        int[] var8 = class84.field1211;
        byte var9 = 0;
        if (arg1 < var7 && field654 == arg0.field986 && method2944((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                method64(arg0, arg0.field981 + 15);
                class302 var11 = (class302) field694.get(class298.field3720);
                byte var12 = 9;
                var11.method5151(var10.field633.method5075(), field728 + arg2, field742 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field956.method3708()) {
            method64(arg0, arg0.field981 + 15);
            for (class73 var14 = (class73) arg0.field956.method3706(); var14 != null; var14 = (class73) arg0.field956.method3714()) {
                class66 var15 = var14.method1650(field654);
                if (var15 != null) {
                    class264 var16 = var14.field1080;
                    class324 var17 = var16.method4529();
                    class324 var18 = var16.method4533();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3354;
                    } else {
                        if (var16.field3340 * 2 < var18.field3852) {
                            var19 = var16.field3340;
                        }
                        var20 = var18.field3852 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field654 - var15.field997;
                    int var24 = var15.field995 * var20 / var16.field3354;
                    int var27;
                    if (var15.field993 > var23) {
                        int var25 = var16.field3350 == 0 ? 0 : var23 / var16.field3350 * var16.field3350;
                        int var26 = var15.field992 * var20 / var16.field3354;
                        var27 = (var24 - var26) * var25 / var15.field993 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field993 + var16.field3355 - var23;
                        if (var16.field3349 >= 0) {
                            var21 = (var28 << 8) / (var16.field3355 - var16.field3349);
                        }
                    }
                    if (var15.field995 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field728 > -1) {
                            int var34 = field728 + arg2 - (var20 >> 1);
                            int var35 = field742 + arg3 - var13;
                            class320.method5379(var34, var35, var27, 5, 65280);
                            class320.method5379(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3862;
                        var13 += var30;
                        int var31 = field728 + arg2 - (var20 >> 1);
                        int var32 = field742 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5497(var33, var32, var21);
                            class320.method5441(var33, var32, var29 + var33, var30 + var32);
                            var18.method5497(var33, var32, var21);
                        } else {
                            var17.method5491(var33, var32);
                            class320.method5441(var33, var32, var29 + var33, var30 + var32);
                            var18.method5491(var33, var32);
                        }
                        class320.method5371(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1647()) {
                    var14.method3733();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field608) {
                return;
            }
            if (var37.field609 != -1 || var37.field629 != -1) {
                method64(arg0, arg0.field981 + 15);
                if (field728 > -1) {
                    if (var37.field609 != -1) {
                        var36 += 25;
                        Statics.field380[var37.field609].method5491(field728 + arg2 - 12, field742 + arg3 - var36);
                    }
                    if (var37.field629 != -1) {
                        var36 += 25;
                        Statics.field1938[var37.field629].method5491(field728 + arg2 - 12, field742 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field662 == 10 && field651 == var8[arg1]) {
                method64(arg0, arg0.field981 + 15);
                if (field728 > -1) {
                    int var38 = Statics.field510[1].field3862 + var36;
                    Statics.field510[1].method5491(field728 + arg2 - 12, field742 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1089;
            if (var39.field3532 != null) {
                var39 = var39.method4818();
            }
            if (var39.field3560 >= 0 && var39.field3560 < Statics.field1938.length) {
                method64(arg0, arg0.field981 + 15);
                if (field728 > -1) {
                    Statics.field1938[var39.field3560].method5491(field728 + arg2 - 12, field742 + arg3 - 30);
                }
            }
            if (field662 == 1 && field663 == field761[arg1 - var7] && field654 % 20 < 10) {
                method64(arg0, arg0.field981 + 15);
                if (field728 > -1) {
                    Statics.field510[0].method5491(field728 + arg2 - 12, field742 + arg3 - 28);
                }
            }
        }
        if (arg0.field989 != null && (arg1 >= var7 || !arg0.field946 && (field856 == 4 || !arg0.field945 && (field856 == 0 || field856 == 3 || field856 == 1 && ((class62) arg0).method1035())))) {
            method64(arg0, arg0.field981);
            if (field728 > -1 && field745 < field730) {
                field734[field745] = Statics.field1399.method5177(arg0.field989) / 2;
                field899[field745] = Statics.field1399.field3737;
                field849[field745] = field728;
                field808[field745] = field742;
                field735[field745] = arg0.field948;
                field736[field745] = arg0.field949;
                field737[field745] = arg0.field950;
                field656[field745] = arg0.field989;
                field745++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field953[var40];
            int var42 = arg0.field951[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field654) {
                    continue;
                }
                var43 = class270.method1728(arg0.field951[var40]);
                var44 = var43.field3390;
                if (var43 != null && var43.field3409 != null) {
                    var43 = var43.method4632();
                    if (var43 == null) {
                        arg0.field953[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field954[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method1728(var45);
                if (var46 != null && var46.field3409 != null) {
                    var46 = var46.method4632();
                }
            }
            if (var41 - var44 <= field654) {
                if (var43 == null) {
                    arg0.field953[var40] = -1;
                } else {
                    method64(arg0, arg0.field981 / 2);
                    if (field728 > -1) {
                        if (var40 == 1) {
                            field742 -= 20;
                        }
                        if (var40 == 2) {
                            field728 -= 15;
                            field742 -= 10;
                        }
                        if (var40 == 3) {
                            field728 += 15;
                            field742 -= 10;
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
                        class324 var59 = null;
                        class324 var60 = null;
                        class324 var61 = null;
                        class324 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class324 var72 = var43.method4634();
                        if (var72 != null) {
                            var51 = var72.field3852;
                            int var73 = var72.field3862;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3854;
                        }
                        class324 var74 = var43.method4652();
                        if (var74 != null) {
                            var52 = var74.field3852;
                            int var75 = var74.field3862;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3854;
                        }
                        class324 var76 = var43.method4636();
                        if (var76 != null) {
                            var53 = var76.field3852;
                            int var77 = var76.field3862;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3854;
                        }
                        class324 var78 = var43.method4638();
                        if (var78 != null) {
                            var54 = var78.field3852;
                            int var79 = var78.field3862;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3854;
                        }
                        if (var46 != null) {
                            var59 = var46.method4634();
                            if (var59 != null) {
                                var63 = var59.field3852;
                                int var80 = var59.field3862;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3854;
                            }
                            var60 = var46.method4652();
                            if (var60 != null) {
                                var64 = var60.field3852;
                                int var81 = var60.field3862;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3854;
                            }
                            var61 = var46.method4636();
                            if (var61 != null) {
                                var65 = var61.field3852;
                                int var82 = var61.field3862;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3854;
                            }
                            var62 = var46.method4638();
                            if (var62 != null) {
                                var66 = var62.field3852;
                                int var83 = var62.field3862;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3854;
                            }
                        }
                        class301 var84 = var43.method4637();
                        if (var84 == null) {
                            var84 = Statics.field3265;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field3265;
                        } else {
                            var85 = var46.method4637();
                            if (var85 == null) {
                                var85 = Statics.field3265;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4633(arg0.field952[var40]);
                        int var91 = var84.method5177(var90);
                        if (var46 != null) {
                            var87 = var46.method4633(arg0.field955[var40]);
                            var89 = var85.method5177(var87);
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
                        int var108 = arg0.field953[var40] - field654;
                        int var109 = var43.field3406 - var43.field3406 * var108 / var43.field3390;
                        int var110 = var43.field3407 * var108 / var43.field3390 + -var43.field3407;
                        int var111 = field728 + arg2 - (var100 >> 1) + var109;
                        int var112 = field742 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3405 + var112 + 15;
                        int var116 = var115 - var84.field3738;
                        int var117 = var84.field3739 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3405 + var112 + 15;
                            int var119 = var118 - var85.field3738;
                            int var120 = var85.field3739 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3392 >= 0) {
                            var123 = (var108 << 8) / (var43.field3390 - var43.field3392);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5497(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5497(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5497(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5497(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5149(var90, var98 + var111, var115, var43.field3400, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5497(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5497(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5497(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5497(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5149(var87, var106 + var111, var118, var46.field3400, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5491(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5491(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5491(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5491(var101 + var111 - var58, var112);
                            }
                            var84.method5217(var90, var98 + var111, var115, var43.field3400 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5491(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5491(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5491(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5491(var105 + var111 - var70, var112);
                                }
                                var85.method5217(var87, var106 + var111, var118, var46.field3400 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.gz(I)V")
    public static final void method978() {
        field793 = 0;
        int var0 = (Statics.field241.field947 >> 7) + Statics.field31;
        int var1 = (Statics.field241.field960 >> 7) + Statics.field1241;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field793 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field793 = 1;
        }
        if (field793 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field793 = 0;
        }
    }

    @ObfuscatedName("g.gs(Lbj;IS)V")
    public static final void method64(class65 arg0, int arg1) {
        method2837(arg0.field947, arg0.field960, arg1);
    }

    @ObfuscatedName("ep.gb(IIIB)V")
    public static final void method2837(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field728 = -1;
            field742 = -1;
            return;
        }
        int var3 = method622(arg0, arg1, Statics.field325) - arg2;
        int var4 = arg0 - Statics.field385;
        int var5 = var3 - Statics.field2802;
        int var6 = arg1 - Statics.field3210;
        int var7 = class125.field1766[Statics.field3525];
        int var8 = class125.field1741[Statics.field3525];
        int var9 = class125.field1766[Statics.field1948];
        int var10 = class125.field1741[Statics.field1948];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field728 = field876 * var11 / var15 + field900 / 2;
            field742 = field876 * var14 / var15 + field901 / 2;
        } else {
            field728 = -1;
            field742 = -1;
        }
    }

    @ObfuscatedName("ad.gu(IIII)I")
    public static final int method622(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field487[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field495[var5][var3][var4] + class51.field495[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field495[var5][var3][var4 + 1] + class51.field495[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ah.gw(ZLgf;I)V")
    public static final void method533(boolean arg0, class192 arg1) {
        field701 = arg0;
        if (!field701) {
            int var2 = arg1.method3245();
            int var3 = arg1.method3280();
            int var4 = arg1.method3245();
            Statics.field272 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field272[var5][var6] = arg1.method3323();
                }
            }
            Statics.field1198 = new int[var4];
            Statics.field2498 = new int[var4];
            Statics.field1845 = new int[var4];
            Statics.field1114 = new byte[var4][];
            Statics.field3757 = new byte[var4][];
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
                        Statics.field1198[var8] = var11;
                        Statics.field2498[var8] = Statics.field1415.method4228("m" + var9 + "_" + var10);
                        Statics.field1845[var8] = Statics.field1415.method4228("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method646(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3243() == 1;
        int var13 = arg1.method3245();
        int var14 = arg1.method3280();
        int var15 = arg1.method3245();
        arg1.method3508();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3509(1);
                    if (var19 == 1) {
                        field702[var16][var17][var18] = arg1.method3509(26);
                    } else {
                        field702[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3521();
        Statics.field272 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field272[var20][var21] = arg1.method3323();
            }
        }
        Statics.field1198 = new int[var15];
        Statics.field2498 = new int[var15];
        Statics.field1845 = new int[var15];
        Statics.field1114 = new byte[var15][];
        Statics.field3757 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field702[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1198[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1198[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2498[var22] = Statics.field1415.method4228("m" + var31 + "_" + var32);
                            Statics.field1845[var22] = Statics.field1415.method4228("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method646(var13, var14, !var12);
    }

    @ObfuscatedName("an.go(IIZI)V")
    public static final void method646(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field573 == arg0 && Statics.field550 == arg1) {
            return;
        }
        Statics.field573 = arg0;
        Statics.field550 = arg1;
        method987(25);
        method2396(class240.field2834, true);
        int var3 = Statics.field31;
        int var4 = Statics.field1241;
        Statics.field31 = (arg0 - 6) * 8;
        Statics.field1241 = (arg1 - 6) * 8;
        int var5 = Statics.field31 - var3;
        int var6 = Statics.field1241 - var4;
        int var7 = Statics.field31;
        int var8 = Statics.field1241;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field684[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field977[var11] -= var5;
                    var10.field975[var11] -= var6;
                }
                var10.field947 -= var5 * 128;
                var10.field960 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field758[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field977[var14] -= var5;
                    var13.field975[var14] -= var6;
                }
                var13.field947 -= var5 * 128;
                var13.field960 -= var6 * 128;
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
                        field700[var25][var21][var22] = field700[var25][var23][var24];
                    } else {
                        field700[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field771.method3746(); var26 != null; var26 = (class64) field771.method3747()) {
            var26.field917 -= var5;
            var26.field919 -= var6;
            if (var26.field917 < 0 || var26.field919 < 0 || var26.field917 >= 104 || var26.field919 >= 104) {
                var26.method3733();
            }
        }
        if (field732 != 0) {
            field732 -= var5;
            field643 -= var6;
        }
        field677 = 0;
        field884 = false;
        Statics.field385 -= var5 << 7;
        Statics.field3210 -= var6 << 7;
        Statics.field1081 -= var5 << 7;
        Statics.field512 -= var6 << 7;
        field767 = -1;
        field773.method3759();
        field857.method3759();
        for (int var27 = 0; var27 < 4; var27++) {
            field729[var27].method3109();
        }
    }

    @ObfuscatedName("f.gx(ZI)V")
    public static final void method454(boolean arg0) {
        method4032();
        field689.field1284++;
        if (field689.field1284 < 50 && !arg0) {
            return;
        }
        field689.field1284 = 0;
        if (field691 || field689.method1850() == null) {
            return;
        }
        class175 var1 = class175.method948(class172.field2186, field689.field1278);
        field689.method1848(var1);
        try {
            field689.method1845();
        } catch (IOException var3) {
            field691 = true;
        }
    }

    @ObfuscatedName("kq.gk(IIIIII)V")
    public static final void method5129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3123.method2668(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3123.method2672(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class123.method1666(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field111.field3853;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class123.method2261(var5);
            class271 var14 = class271.method2839(var13);
            if (var14.field3445 == -1) {
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
                class323 var15 = Statics.field6[var14.field3445];
                if (var15 != null) {
                    int var16 = (var14.field3431 * 4 - var15.field3845) / 2;
                    int var17 = (var14.field3433 * 4 - var15.field3846) / 2;
                    var15.method5471(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3433) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3123.method2670(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3123.method2672(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class123.method2261(var18);
            class271 var24 = class271.method2839(var23);
            if (var24.field3445 != -1) {
                class323 var25 = Statics.field6[var24.field3445];
                if (var25 != null) {
                    int var26 = (var24.field3431 * 4 - var25.field3845) / 2;
                    int var27 = (var24.field3433 * 4 - var25.field3846) / 2;
                    var25.method5471(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3433) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class123.method1666(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field111.field3853;
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
        long var31 = Statics.field3123.method2697(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class123.method2261(var31);
        class271 var34 = class271.method2839(var33);
        if (var34.field3445 == -1) {
            return;
        }
        class323 var35 = Statics.field6[var34.field3445];
        if (var35 != null) {
            int var36 = (var34.field3431 * 4 - var35.field3845) / 2;
            int var37 = (var34.field3433 * 4 - var35.field3846) / 2;
            var35.method5471(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3433) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.gm(Lcr;I)Z")
    public final boolean method1098(class90 arg0) {
        class160 var2 = arg0.method1850();
        class192 var3 = arg0.field1279;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1283 == null) {
                if (arg0.field1282) {
                    if (!var2.method3010(1)) {
                        return false;
                    }
                    var2.method3014(arg0.field1279.field2388, 0, 1);
                    arg0.field1285 = 0;
                    arg0.field1282 = false;
                }
                var3.field2386 = 0;
                if (var3.method3518()) {
                    if (!var2.method3010(1)) {
                        return false;
                    }
                    var2.method3014(arg0.field1279.field2388, 1, 1);
                    arg0.field1285 = 0;
                }
                arg0.field1282 = true;
                class171[] var4 = class171.method1742();
                int var5 = var3.method3507();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2386);
                }
                arg0.field1283 = var4[var5];
                arg0.field1288 = arg0.field1283.field2180;
            }
            if (arg0.field1288 == -1) {
                if (!var2.method3010(1)) {
                    return false;
                }
                arg0.method1850().method3014(var3.field2388, 0, 1);
                arg0.field1288 = var3.field2388[0] & 0xFF;
            }
            if (arg0.field1288 == -2) {
                if (!var2.method3010(2)) {
                    return false;
                }
                arg0.method1850().method3014(var3.field2388, 0, 2);
                var3.field2386 = 0;
                arg0.field1288 = var3.method3245();
            }
            if (!var2.method3010(arg0.field1288)) {
                return false;
            }
            var3.field2386 = 0;
            var2.method3014(var3.field2388, 0, arg0.field1288);
            arg0.field1285 = 0;
            field724.method4896();
            arg0.field1287 = arg0.field1286;
            arg0.field1286 = arg0.field1280;
            arg0.field1280 = arg0.field1283;
            if (class171.field2098 == arg0.field1283) {
                field662 = var3.method3243();
                if (field662 == 1) {
                    field663 = var3.method3245();
                }
                if (field662 >= 2 && field662 <= 6) {
                    if (field662 == 2) {
                        field668 = 64;
                        field669 = 64;
                    }
                    if (field662 == 3) {
                        field668 = 0;
                        field669 = 64;
                    }
                    if (field662 == 4) {
                        field668 = 128;
                        field669 = 64;
                    }
                    if (field662 == 5) {
                        field668 = 64;
                        field669 = 0;
                    }
                    if (field662 == 6) {
                        field668 = 64;
                        field669 = 128;
                    }
                    field662 = 2;
                    field853 = var3.method3245();
                    field851 = var3.method3245();
                    field872 = var3.method3243();
                }
                if (field662 == 10) {
                    field651 = var3.method3245();
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1283) {
                int var6 = var3.method3280();
                int var7 = var3.method3253();
                class233 var8 = class233.method575(var7);
                if (var8 != null && var8.field2620 == 0) {
                    if (var6 > var8.field2708 - var8.field2740) {
                        var6 = var8.field2708 - var8.field2740;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8.field2653 != var6) {
                        var8.field2653 = var6;
                        method481(var8);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1283) {
                int var9 = var3.method3404();
                class55 var10 = (class55) class55.field532.method3687((long) var9);
                if (var10 != null) {
                    var10.method3733();
                }
                field828[++field829 - 1 & 0x1F] = var9 & 0x7FFF;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2161 == arg0.field1283) {
                var3.field2386 += 28;
                if (var3.method3267()) {
                    int var11 = var3.field2386 - 28;
                    method2026(var3.field2388, var11);
                    Statics.method1081(var3, var11);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1283) {
                int var12 = var3.method3320();
                int var13 = var3.method3404();
                class233 var14 = class233.method575(var12);
                if (var14.field2674 != 2 || var14.field2675 != var13) {
                    var14.field2674 = 2;
                    var14.field2675 = var13;
                    method481(var14);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1283) {
                method3056(class174.field2295);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1283) {
                Statics.method1450(true, var3);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2106 == arg0.field1283) {
                field732 = var3.method3243();
                if (field732 == 255) {
                    field732 = 0;
                }
                field643 = var3.method3243();
                if (field643 == 255) {
                    field643 = 0;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1283) {
                int var15 = var3.method3281();
                field802 = var15;
                this.method1395(false);
                method198(var15);
                class71.method130(field802);
                for (int var16 = 0; var16 < 100; var16++) {
                    field845[var16] = true;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1283) {
                Statics.method988();
                field871 = var3.method3369();
                field837 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1283) {
                int var17 = var3.method3243();
                int var18 = var3.method3243();
                int var19 = var3.method3243();
                int var20 = var3.method3243();
                field885[var17] = true;
                field825[var17] = var18;
                field909[var17] = var19;
                field888[var17] = var20;
                field889[var17] = 0;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1283) {
                method3056(class174.field2297);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1283) {
                Statics.field40.field1029.method4959(var3, arg0.field1288);
                method2288();
                field833 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2111 == arg0.field1283) {
                for (int var21 = 0; var21 < class228.field2596.length; var21++) {
                    if (class228.field2596[var21] != class228.field2595[var21]) {
                        class228.field2596[var21] = class228.field2595[var21];
                        method1732(var21);
                        field757[++field827 - 1 & 0x1F] = var21;
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2151 == arg0.field1283) {
                boolean var22 = var3.method3243() == 1;
                int var23 = var3.method3289();
                class233 var24 = class233.method575(var23);
                if (var24.field2651 != var22) {
                    var24.field2651 = var22;
                    method481(var24);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1283) {
                int var25 = var3.method3323();
                int var26 = var3.method3323();
                int var27 = 0;
                if (Statics.field127 == null || !Statics.field127.isValid()) {
                    try {
                        Iterator var28 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var28.hasNext()) {
                            GarbageCollectorMXBean var29 = (GarbageCollectorMXBean) var28.next();
                            if (var29.isValid()) {
                                Statics.field127 = var29;
                                field455 = -1L;
                                field451 = -1L;
                            }
                        }
                    } catch (Throwable var267) {
                    }
                }
                if (Statics.field127 != null) {
                    long var31 = class187.method918();
                    long var33 = Statics.field127.getCollectionTime();
                    if (field451 != -1L) {
                        long var35 = var33 - field451;
                        long var37 = var31 - field455;
                        if (var37 != 0L) {
                            var27 = (int) (var35 * 100L / var37);
                        }
                    }
                    field451 = var33;
                    field455 = var31;
                }
                class175 var41 = class175.method948(class172.field2203, field689.field1278);
                var41.field2308.method3269(var27);
                var41.field2308.method3403(var25);
                var41.field2308.method3403(var26);
                var41.field2308.method3270(field431);
                field689.method1848(var41);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2116 == arg0.field1283) {
                if (arg0.field1288 == 0) {
                    Statics.field928 = null;
                } else {
                    if (Statics.field928 == null) {
                        Statics.field928 = new class296(Statics.field252, Statics.field3184);
                    }
                    Statics.field928.method5105(var3);
                }
                field834 = field664;
                Statics.field243 = true;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2152 == arg0.field1283) {
                int var42 = var3.method3289();
                class233 var43 = class233.method575(var42);
                var43.field2674 = 3;
                var43.field2675 = Statics.field241.field624.method4056();
                method481(var43);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1283) {
                int var44 = var3.method3283();
                int var45 = var3.method3253();
                int var46 = var3.method3283();
                class233 var47 = class233.method575(var45);
                if (var47.field2640 != var46 || var47.field2752 != var44 || var47.field2636 != 0 || var47.field2637 != 0) {
                    var47.field2640 = var46;
                    var47.field2752 = var44;
                    var47.field2636 = 0;
                    var47.field2637 = 0;
                    method481(var47);
                    this.method1135(var47);
                    if (var47.field2620 == 0) {
                        method2957(Statics.field2622[var45 >> 16], var47, false);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2162 == arg0.field1283) {
                Statics.field2428 = var3.method3243();
                Statics.field3275 = var3.method3392();
                while (var3.field2386 < arg0.field1288) {
                    int var48 = var3.method3243();
                    class174 var49 = class174.method1743()[var48];
                    method3056(var49);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2099 == arg0.field1283) {
                int var50 = var3.method3404();
                int var51 = var3.method3289();
                class228.field2595[var50] = var51;
                if (class228.field2596[var50] != var51) {
                    class228.field2596[var50] = var51;
                }
                method1732(var50);
                field757[++field827 - 1 & 0x1F] = var50;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1283) {
                int var52 = var3.method3245();
                if (var52 == 65535) {
                    var52 = -1;
                }
                if (var52 == -1 && !field875) {
                    Statics.field1971.method3852();
                    class220.field2500 = 1;
                    Statics.field1392 = null;
                } else if (var52 != -1 && field874 != var52 && field822 != 0 && !field875) {
                    class220.method2873(2, Statics.field3168, var52, 0, field822, false);
                }
                field874 = var52;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2165 == arg0.field1283) {
                int var53 = var3.method3404();
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = var3.method3285();
                if (field822 != 0 && var53 != -1) {
                    class220.method88(Statics.field2820, var53, 0, field822, false);
                    field875 = true;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1283) {
                int var55 = var3.method3289();
                int var56 = var3.method3253();
                class57 var57 = (class57) field803.method3687((long) var56);
                class57 var58 = (class57) field803.method3687((long) var55);
                if (var58 != null) {
                    method917(var58, var57 == null || var57.field557 != var58.field557);
                }
                if (var57 != null) {
                    var57.method3733();
                    field803.method3691(var57, (long) var55);
                }
                class233 var59 = class233.method575(var56);
                if (var59 != null) {
                    method481(var59);
                }
                class233 var60 = class233.method575(var55);
                if (var60 != null) {
                    method481(var60);
                    method2957(Statics.field2622[var60.field2631 >>> 16], var60, true);
                }
                if (field802 != -1) {
                    method3209(field802, 1);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2097 == arg0.field1283) {
                boolean var61 = var3.method3249();
                if (!var61) {
                    Statics.field309 = null;
                } else if (Statics.field309 == null) {
                    Statics.field309 = new class254();
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1283) {
                method3056(class174.field2291);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1283) {
                int var62 = var3.method3320();
                class233 var63 = class233.method575(var62);
                for (int var64 = 0; var64 < var63.field2750.length; var64++) {
                    var63.field2750[var64] = -1;
                    var63.field2750[var64] = 0;
                }
                method481(var63);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2102 == arg0.field1283) {
                class67 var65 = new class67();
                var65.field998 = var3.method3251();
                var65.field1008 = var3.method3245();
                int var66 = var3.method3323();
                var65.field1009 = var66;
                method987(45);
                var2.method3034();
                Object var67 = null;
                class80.method1642(var65);
                arg0.field1283 = null;
                return false;
            }
            if (class171.field2147 == arg0.field1283) {
                field884 = true;
                Statics.field317 = var3.method3243();
                Statics.field1201 = var3.method3243();
                Statics.field3771 = var3.method3245();
                Statics.field200 = var3.method3243();
                Statics.field106 = var3.method3243();
                if (Statics.field106 >= 100) {
                    Statics.field385 = Statics.field317 * 128 + 64;
                    Statics.field3210 = Statics.field1201 * 128 + 64;
                    Statics.field2802 = method622(Statics.field385, Statics.field3210, Statics.field325) - Statics.field3771;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1283) {
                int var68 = var3.method3323();
                class57 var69 = (class57) field803.method3687((long) var68);
                if (var69 != null) {
                    method917(var69, true);
                }
                if (field806 != null) {
                    method481(field806);
                    field806 = null;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1283) {
                int var70 = var3.method3243();
                if (var3.method3243() == 0) {
                    field907[var70] = new class5();
                    var3.field2386 += 18;
                } else {
                    var3.field2386--;
                    field907[var70] = new class5(var3, false);
                }
                field835 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1283) {
                int var71 = var3.method3245();
                int var72 = var3.method3320();
                int var73 = var71 >> 10 & 0x1F;
                int var74 = var71 >> 5 & 0x1F;
                int var75 = var71 & 0x1F;
                int var76 = (var75 << 3) + (var73 << 19) + (var74 << 11);
                class233 var77 = class233.method575(var72);
                if (var77.field2656 != var76) {
                    var77.field2656 = var76;
                    method481(var77);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2105 == arg0.field1283) {
                int var78 = var3.method3320();
                int var79 = var3.method3281();
                if (var79 == 65535) {
                    var79 = -1;
                }
                int var80 = var3.method3323();
                class233 var81 = class233.method575(var80);
                if (var81.field2710) {
                    var81.field2695 = var79;
                    var81.field2753 = var78;
                    class272 var83 = class272.method1730(var79);
                    var81.field2682 = var83.field3495;
                    var81.field2683 = var83.field3488;
                    var81.field2684 = var83.field3472;
                    var81.field2722 = var83.field3477;
                    var81.field2681 = var83.field3490;
                    var81.field2758 = var83.field3485;
                    if (var83.field3512 == 1) {
                        var81.field2690 = 1;
                    } else {
                        var81.field2690 = 2;
                    }
                    if (var81.field2686 > 0) {
                        var81.field2758 = var81.field2758 * 32 / var81.field2686;
                    } else if (var81.field2642 > 0) {
                        var81.field2758 = var81.field2758 * 32 / var81.field2642;
                    }
                    method481(var81);
                } else if (var79 == -1) {
                    var81.field2674 = 0;
                    arg0.field1283 = null;
                    return true;
                } else {
                    class272 var82 = class272.method1730(var79);
                    var81.field2674 = 4;
                    var81.field2675 = var79;
                    var81.field2682 = var82.field3495;
                    var81.field2683 = var82.field3488;
                    var81.field2758 = var82.field3485 * 100 / var78;
                    method481(var81);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1283) {
                class84.method702(var3, arg0.field1288);
                method2262();
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1283) {
                String var84 = var3.method3251();
                int var85 = var3.method3253();
                class233 var86 = class233.method575(var85);
                if (!var84.equals(var86.field2692)) {
                    var86.field2692 = var84;
                    method481(var86);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2104 == arg0.field1283) {
                int var87 = var3.method3280();
                int var88 = var3.method3404();
                int var89 = var3.method3323();
                class233 var90 = class233.method575(var89);
                var90.field2687 = (var87 << 16) + var88;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2115 == arg0.field1283) {
                int var91 = var3.method3323();
                int var92 = var3.method3369();
                class233 var93 = class233.method575(var91);
                if (var93.field2678 != var92 || var92 == -1) {
                    var93.field2678 = var92;
                    var93.field2754 = 0;
                    var93.field2654 = 0;
                    method481(var93);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1283) {
                field856 = var3.method3243();
                field779 = var3.method3271();
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1283) {
                Statics.field40.method1519(var3, arg0.field1288);
                field833 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1283) {
                int var94 = var3.method3243();
                String var95 = var3.method3251();
                int var96 = var3.method3392();
                if (var96 >= 1 && var96 <= 8) {
                    if (var95.equalsIgnoreCase(class240.field3056)) {
                        var95 = null;
                    }
                    field766[var96 - 1] = var95;
                    field791[var96 - 1] = var94 == 0;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1283) {
                field884 = false;
                for (int var97 = 0; var97 < 5; var97++) {
                    field885[var97] = false;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1283) {
                if (field802 != -1) {
                    int var98 = field802;
                    if (class233.method91(var98)) {
                        method1684(Statics.field2622[var98], 0);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2120 == arg0.field1283) {
                method533(false, arg0.field1279);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2176 == arg0.field1283) {
                int var99 = var3.method3245();
                int var100 = var3.method3243();
                int var101 = var3.method3245();
                if (field797 != 0 && var100 != 0 && field677 < 50) {
                    field879[field677] = var99;
                    field880[field677] = var100;
                    field881[field677] = var101;
                    field883[field677] = null;
                    field769[field677] = 0;
                    field677++;
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1283) {
                method533(true, arg0.field1279);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2177 == arg0.field1283) {
                int var105 = var3.method3323();
                int var106 = var3.method3245();
                if (var105 < -70000) {
                    var106 += 32768;
                }
                class233 var107;
                if (var105 >= 0) {
                    var107 = class233.method575(var105);
                } else {
                    var107 = null;
                }
                while (var3.field2386 < arg0.field1288) {
                    int var108 = var3.method3256();
                    int var109 = var3.method3245();
                    int var110 = 0;
                    if (var109 != 0) {
                        var110 = var3.method3243();
                        if (var110 == 255) {
                            var110 = var3.method3323();
                        }
                    }
                    if (var107 != null && var108 >= 0 && var108 < var107.field2750.length) {
                        var107.field2750[var108] = var109;
                        var107.field2751[var108] = var110;
                    }
                    class55.method107(var106, var108, var109 - 1, var110);
                }
                if (var107 != null) {
                    method481(var107);
                }
                Statics.method988();
                field828[++field829 - 1 & 0x1F] = var106 & 0x7FFF;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2119 == arg0.field1283) {
                method3056(class174.field2298);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1283) {
                byte var111 = var3.method3244();
                int var112 = var3.method3245();
                class228.field2595[var112] = var111;
                if (class228.field2596[var112] != var111) {
                    class228.field2596[var112] = var111;
                }
                method1732(var112);
                field757[++field827 - 1 & 0x1F] = var112;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1283) {
                method3056(class174.field2294);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2114 == arg0.field1283) {
                Statics.method988();
                field674 = var3.method3243();
                field837 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2163 == arg0.field1283) {
                int var113 = var3.method3243();
                method2639(var113);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1283) {
                int var114 = var3.method3280();
                int var115 = var3.method3404();
                int var116 = var3.method3289();
                int var117 = var3.method3281();
                class233 var118 = class233.method575(var116);
                if (var118.field2682 != var114 || var118.field2683 != var117 || var118.field2758 != var115) {
                    var118.field2682 = var114;
                    var118.field2683 = var117;
                    var118.field2758 = var115;
                    method481(var118);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1283) {
                class319.method2397(var3, arg0.field1288);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2112 == arg0.field1283) {
                Statics.field2428 = var3.method3271();
                Statics.field3275 = var3.method3392();
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2100 == arg0.field1283) {
                int var119 = var3.method3253();
                int var120 = var3.method3245();
                int var121 = var3.method3273();
                class57 var122 = (class57) field803.method3687((long) var119);
                if (var122 != null) {
                    method917(var122, var122.field557 != var120);
                }
                class57 var123 = new class57();
                var123.field557 = var120;
                var123.field552 = var121;
                field803.method3691(var123, (long) var119);
                method198(var120);
                class233 var124 = class233.method575(var119);
                method481(var124);
                if (field806 != null) {
                    method481(field806);
                    field806 = null;
                }
                method2636();
                method2957(Statics.field2622[var119 >> 16], var124, false);
                class71.method130(var120);
                if (field802 != -1) {
                    int var125 = field802;
                    if (class233.method91(var125)) {
                        method1684(Statics.field2622[var125], 1);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2101 == arg0.field1283) {
                method3056(class174.field2292);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2107 == arg0.field1283) {
                Statics.field2428 = var3.method3243();
                Statics.field3275 = var3.method3392();
                for (int var126 = Statics.field3275; var126 < Statics.field3275 + 8; var126++) {
                    for (int var127 = Statics.field2428; var127 < Statics.field2428 + 8; var127++) {
                        if (field700[Statics.field325][var126][var127] != null) {
                            field700[Statics.field325][var126][var127] = null;
                            method111(var126, var127);
                        }
                    }
                }
                for (class64 var128 = (class64) field771.method3746(); var128 != null; var128 = (class64) field771.method3747()) {
                    if (var128.field917 >= Statics.field3275 && var128.field917 < Statics.field3275 + 8 && var128.field919 >= Statics.field2428 && var128.field919 < Statics.field2428 + 8 && Statics.field325 == var128.field920) {
                        var128.field926 = 0;
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2109 == arg0.field1283) {
                field747 = var3.method3243();
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1283) {
                method3056(class174.field2289);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2103 == arg0.field1283) {
                String var129 = var3.method3251();
                long var130 = (long) var3.method3245();
                long var132 = (long) var3.method3247();
                class245[] var134 = new class245[] { class245.field3153, class245.field3160, class245.field3150, class245.field3152, class245.field3155, class245.field3158 };
                class245 var135 = (class245) class180.method3951(var134, var3.method3243());
                long var136 = (var130 << 32) + var132;
                boolean var138 = false;
                for (int var139 = 0; var139 < 100; var139++) {
                    if (field859[var139] == var136) {
                        var138 = true;
                        break;
                    }
                }
                if (Statics.field40.method1528(new class294(var129, Statics.field252))) {
                    var138 = true;
                }
                if (!var138 && field793 == 0) {
                    field859[field896] = var136;
                    field896 = (field896 + 1) % 100;
                    String var143;
                    try {
                        int var140 = var3.method3256();
                        if (var140 > 32767) {
                            var140 = 32767;
                        }
                        byte[] var141 = new byte[var140];
                        var3.field2386 += Statics.field3754.method3163(var3.field2388, var3.field2386, var141, 0, var140);
                        String var142 = class304.method3475(var141, 0, var140);
                        var143 = var142;
                    } catch (Exception var266) {
                        var143 = "Cabbage";
                    }
                    String var146 = class302.method5147(class308.method3018(var143));
                    byte var147;
                    if (var135.field3154) {
                        var147 = 7;
                    } else {
                        var147 = 3;
                    }
                    if (var135.field3157 == -1) {
                        class86.method1671(var147, var129, var146);
                    } else {
                        int var149 = var135.field3157;
                        String var150 = "<img=" + var149 + ">";
                        class86.method1671(var147, var150 + var129, var146);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2173 == arg0.field1283) {
                Statics.method988();
                int var151 = var3.method3392();
                int var152 = var3.method3253();
                int var153 = var3.method3243();
                field776[var151] = var152;
                field774[var151] = var153;
                field723[var151] = 1;
                for (int var154 = 0; var154 < 98; var154++) {
                    if (var152 >= class237.field2805[var154]) {
                        field723[var151] = var154 + 2;
                    }
                }
                field830[++field831 - 1 & 0x1F] = var151;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2118 == arg0.field1283) {
                for (int var155 = 0; var155 < Statics.field3267; var155++) {
                    class257 var156 = class257.method3091(var155);
                    if (var156 != null) {
                        class228.field2595[var155] = 0;
                        class228.field2596[var155] = 0;
                    }
                }
                Statics.method988();
                field827 += 32;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2108 == arg0.field1283) {
                Statics.method1450(false, var3);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1283) {
                int var157 = var3.method3323();
                if (field706 != var157) {
                    field706 = var157;
                    if (field726 == 1) {
                        field725 = true;
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1283) {
                String var158 = var3.method3251();
                Object[] var159 = new Object[var158.length() + 1];
                for (int var160 = var158.length() - 1; var160 >= 0; var160--) {
                    if (var158.charAt(var160) == 's') {
                        var159[var160 + 1] = var3.method3251();
                    } else {
                        var159[var160 + 1] = Integer.valueOf(var3.method3323());
                    }
                }
                var159[0] = Integer.valueOf(var3.method3323());
                class58 var161 = new class58();
                var161.field574 = var159;
                class71.method3130(var161);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1283) {
                String var162 = var3.method3251();
                String var166;
                try {
                    int var163 = var3.method3256();
                    if (var163 > 32767) {
                        var163 = 32767;
                    }
                    byte[] var164 = new byte[var163];
                    var3.field2386 += Statics.field3754.method3163(var3.field2388, var3.field2386, var164, 0, var163);
                    String var165 = class304.method3475(var164, 0, var163);
                    var166 = var165;
                } catch (Exception var265) {
                    var166 = "Cabbage";
                }
                String var169 = class302.method5147(class308.method3018(var166));
                class86.method1671(6, var162, var169);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1283) {
                int var170 = var3.method3323();
                int var171 = var3.method3245();
                class233 var172 = class233.method575(var170);
                if (var172.field2674 != 1 || var172.field2675 != var171) {
                    var172.field2674 = 1;
                    var172.field2675 = var171;
                    method481(var172);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1283) {
                method3056(class174.field2293);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2113 == arg0.field1283) {
                for (int var173 = 0; var173 < field758.length; var173++) {
                    if (field758[var173] != null) {
                        field758[var173].field963 = -1;
                    }
                }
                for (int var174 = 0; var174 < field684.length; var174++) {
                    if (field684[var174] != null) {
                        field684[var174].field963 = -1;
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1283) {
                int var175 = var3.method3280();
                if (var175 == 65535) {
                    var175 = -1;
                }
                int var176 = var3.method3253();
                int var177 = var3.method3281();
                if (var177 == 65535) {
                    var177 = -1;
                }
                int var178 = var3.method3253();
                for (int var179 = var177; var179 <= var175; var179++) {
                    long var180 = ((long) var178 << 32) + (long) var179;
                    class207 var182 = field781.method3687(var180);
                    if (var182 != null) {
                        var182.method3733();
                    }
                    field781.method3691(new class214(var176), var180);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2117 == arg0.field1283) {
                int var183 = var3.method3256();
                boolean var184 = var3.method3243() == 1;
                String var185 = "";
                boolean var186 = false;
                if (var184) {
                    var185 = var3.method3251();
                    if (Statics.field40.method1528(new class294(var185, Statics.field252))) {
                        var186 = true;
                    }
                }
                String var187 = var3.method3251();
                if (!var186) {
                    class86.method1671(var183, var185, var187);
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1283) {
                field661 = var3.method3404() * 30;
                field837 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1283) {
                if (Statics.field928 != null) {
                    Statics.field928.method5100(var3);
                }
                method14();
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2128 == arg0.field1283) {
                method677();
                arg0.field1283 = null;
                return false;
            }
            if (class171.field2126 == arg0.field1283) {
                int var188 = var3.method3323();
                int var189 = var3.method3245();
                if (var188 < -70000) {
                    var189 += 32768;
                }
                class233 var190;
                if (var188 >= 0) {
                    var190 = class233.method575(var188);
                } else {
                    var190 = null;
                }
                if (var190 != null) {
                    for (int var191 = 0; var191 < var190.field2750.length; var191++) {
                        var190.field2750[var191] = 0;
                        var190.field2751[var191] = 0;
                    }
                }
                class55.method3121(var189);
                int var192 = var3.method3245();
                for (int var193 = 0; var193 < var192; var193++) {
                    int var194 = var3.method3271();
                    if (var194 == 255) {
                        var194 = var3.method3320();
                    }
                    int var195 = var3.method3281();
                    if (var190 != null && var193 < var190.field2750.length) {
                        var190.field2750[var193] = var195;
                        var190.field2751[var193] = var194;
                    }
                    class55.method107(var189, var193, var195 - 1, var194);
                }
                if (var190 != null) {
                    method481(var190);
                }
                Statics.method988();
                field828[++field829 - 1 & 0x1F] = var189 & 0x7FFF;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1283) {
                int var196 = arg0.field1288 + var3.field2386;
                int var197 = var3.method3245();
                int var198 = var3.method3245();
                if (field802 != var197) {
                    field802 = var197;
                    this.method1395(false);
                    method198(field802);
                    class71.method130(field802);
                    for (int var199 = 0; var199 < 100; var199++) {
                        field845[var199] = true;
                    }
                }
                while (var198-- > 0) {
                    int var200 = var3.method3323();
                    int var201 = var3.method3245();
                    int var202 = var3.method3243();
                    class57 var203 = (class57) field803.method3687((long) var200);
                    if (var203 != null && var203.field557 != var201) {
                        method917(var203, true);
                        var203 = null;
                    }
                    if (var203 == null) {
                        class57 var204 = new class57();
                        var204.field557 = var201;
                        var204.field552 = var202;
                        field803.method3691(var204, (long) var200);
                        method198(var201);
                        class233 var205 = class233.method575(var200);
                        method481(var205);
                        if (field806 != null) {
                            method481(field806);
                            field806 = null;
                        }
                        method2636();
                        method2957(Statics.field2622[var200 >> 16], var205, false);
                        class71.method130(var201);
                        if (field802 != -1) {
                            int var206 = field802;
                            if (class233.method91(var206)) {
                                method1684(Statics.field2622[var206], 1);
                            }
                        }
                        var203 = var204;
                    }
                    var203.field551 = true;
                }
                for (class57 var208 = (class57) field803.method3690(); var208 != null; var208 = (class57) field803.method3692()) {
                    if (var208.field551) {
                        var208.field551 = false;
                    } else {
                        method917(var208, true);
                    }
                }
                field781 = new class205(512);
                while (var3.field2386 < var196) {
                    int var209 = var3.method3323();
                    int var210 = var3.method3245();
                    int var211 = var3.method3245();
                    int var212 = var3.method3323();
                    for (int var213 = var210; var213 <= var211; var213++) {
                        long var214 = ((long) var209 << 32) + (long) var213;
                        field781.method3691(new class214(var212), var214);
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1283) {
                Statics.field40.method1518();
                field833 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2095 == arg0.field1283) {
                boolean var216 = var3.method3243() == 1;
                if (var216) {
                    Statics.field2094 = class187.method918() - var3.method3248();
                    Statics.field2594 = new class2(var3, true);
                } else {
                    Statics.field2594 = null;
                }
                field836 = field664;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2096 == arg0.field1283) {
                method3056(class174.field2290);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2110 == arg0.field1283) {
                String var217 = var3.method3251();
                Statics.field195 = var217;
                try {
                    String var218 = Statics.field3184.getParameter(class282.field3625.field3643);
                    String var219 = Statics.field3184.getParameter(class282.field3638.field3643);
                    String var220 = var218 + "settings=" + var217 + "; version=1; path=/; domain=" + var219;
                    String var221;
                    if (var217.length() == 0) {
                        var221 = var220 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var221 = var220 + "; Expires=" + class195.method4085(class187.method918() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var222 = Statics.field3184;
                    String var223 = "document.cookie=\"" + var221 + "\"";
                    JSObject.getWindow(var222).eval(var223);
                } catch (Throwable var264) {
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1283) {
                int var225 = var3.method3243();
                class310[] var226 = class310.method4894();
                int var227 = 0;
                class310 var229;
                while (true) {
                    if (var227 >= var226.length) {
                        var229 = null;
                        break;
                    }
                    class310 var228 = var226[var227];
                    if (var228.field3776 == var225) {
                        var229 = var228;
                        break;
                    }
                    var227++;
                }
                Statics.field631 = var229;
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2178 == arg0.field1283) {
                method3056(class174.field2296);
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1283) {
                field884 = true;
                Statics.field567 = var3.method3243();
                Statics.field401 = var3.method3243();
                Statics.field37 = var3.method3245();
                Statics.field1240 = var3.method3243();
                Statics.field638 = var3.method3243();
                if (Statics.field638 >= 100) {
                    int var230 = Statics.field567 * 128 + 64;
                    int var231 = Statics.field401 * 128 + 64;
                    int var232 = method622(var230, var231, Statics.field325) - Statics.field37;
                    int var233 = var230 - Statics.field385;
                    int var234 = var232 - Statics.field2802;
                    int var235 = var231 - Statics.field3210;
                    int var236 = (int) Math.sqrt((double) (var233 * var233 + var235 * var235));
                    Statics.field3525 = (int) (Math.atan2((double) var234, (double) var236) * 325.949D) & 0x7FF;
                    Statics.field1948 = (int) (Math.atan2((double) var233, (double) var235) * -325.949D) & 0x7FF;
                    if (Statics.field3525 < 128) {
                        Statics.field3525 = 128;
                    }
                    if (Statics.field3525 > 383) {
                        Statics.field3525 = 383;
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1283) {
                String var237 = var3.method3251();
                long var238 = var3.method3248();
                long var240 = (long) var3.method3245();
                long var242 = (long) var3.method3247();
                class245[] var244 = new class245[] { class245.field3153, class245.field3160, class245.field3150, class245.field3152, class245.field3155, class245.field3158 };
                class245 var245 = (class245) class180.method3951(var244, var3.method3243());
                long var246 = (var240 << 32) + var242;
                boolean var248 = false;
                for (int var249 = 0; var249 < 100; var249++) {
                    if (field859[var249] == var246) {
                        var248 = true;
                        break;
                    }
                }
                if (var245.field3159 && Statics.field40.method1528(new class294(var237, Statics.field252))) {
                    var248 = true;
                }
                if (!var248 && field793 == 0) {
                    field859[field896] = var246;
                    field896 = (field896 + 1) % 100;
                    String var253;
                    try {
                        int var250 = var3.method3256();
                        if (var250 > 32767) {
                            var250 = 32767;
                        }
                        byte[] var251 = new byte[var250];
                        var3.field2386 += Statics.field3754.method3163(var3.field2388, var3.field2386, var251, 0, var250);
                        String var252 = class304.method3475(var251, 0, var250);
                        var253 = var252;
                    } catch (Exception var263) {
                        var253 = "Cabbage";
                    }
                    String var256 = class302.method5147(class308.method3018(var253));
                    if (var245.field3157 == -1) {
                        class86.method538(9, var237, var256, class306.method2851(var238));
                    } else {
                        int var257 = var245.field3157;
                        String var258 = "<img=" + var257 + ">";
                        class86.method538(9, var258 + var237, var256, class306.method2851(var238));
                    }
                }
                arg0.field1283 = null;
                return true;
            }
            class155.method1451("" + (arg0.field1283 == null ? -1 : arg0.field1283.field2179) + class76.field1101 + (arg0.field1286 == null ? -1 : arg0.field1286.field2179) + class76.field1101 + (arg0.field1287 == null ? -1 : arg0.field1287.field2179) + class76.field1101 + arg0.field1288, (Throwable) null);
            method677();
        } catch (IOException var268) {
            method4188();
        } catch (Exception var269) {
            String var261 = "" + (arg0.field1283 == null ? -1 : arg0.field1283.field2179) + class76.field1101 + (arg0.field1286 == null ? -1 : arg0.field1286.field2179) + class76.field1101 + (arg0.field1287 == null ? -1 : arg0.field1287.field2179) + class76.field1101 + arg0.field1288 + class76.field1101 + (Statics.field31 + Statics.field241.field977[0]) + class76.field1101 + (Statics.field1241 + Statics.field241.field975[0]) + class76.field1101;
            for (int var262 = 0; var262 < arg0.field1288 && var262 < 50; var262++) {
                var261 = var261 + var3.field2388[var262] + class76.field1101;
            }
            class155.method1451(var261, var269);
            method677();
        }
        return true;
    }

    @ObfuscatedName("fy.hc(Lfm;B)V")
    public static final void method3056(class174 arg0) {
        class192 var1 = field689.field1279;
        if (class174.field2291 == arg0) {
            int var2 = var1.method3273();
            int var3 = (var2 >> 4 & 0x7) + Statics.field3275;
            int var4 = (var2 & 0x7) + Statics.field2428;
            int var5 = var1.method3273();
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = var1.method3243();
            int var9 = var1.method3404();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                int var10 = var6 + 1;
                if (Statics.field241.field977[0] >= var3 - var10 && Statics.field241.field977[0] <= var3 + var10 && Statics.field241.field975[0] >= var4 - var10 && Statics.field241.field975[0] <= var4 + var10 && field877 != 0 && var7 > 0 && field677 < 50) {
                    field879[field677] = var9;
                    field880[field677] = var7;
                    field881[field677] = var8;
                    field883[field677] = null;
                    field769[field677] = (var3 << 16) + (var4 << 8) + var6;
                    field677++;
                }
            }
        }
        if (class174.field2296 == arg0) {
            int var11 = var1.method3392();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field805[var12];
            int var15 = var1.method3281();
            int var16 = var1.method3243();
            int var17 = (var16 >> 4 & 0x7) + Statics.field3275;
            int var18 = (var16 & 0x7) + Statics.field2428;
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                method2057(Statics.field325, var17, var18, var14, var15, var12, var13, 0, -1);
            }
        } else if (class174.field2297 == arg0) {
            int var19 = var1.method3281();
            int var20 = var1.method3273();
            int var21 = (var20 >> 4 & 0x7) + Statics.field3275;
            int var22 = (var20 & 0x7) + Statics.field2428;
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class208 var23 = field700[Statics.field325][var21][var22];
                if (var23 != null) {
                    for (class82 var24 = (class82) var23.method3746(); var24 != null; var24 = (class82) var23.method3747()) {
                        if ((var19 & 0x7FFF) == var24.field1199) {
                            var24.method3733();
                            break;
                        }
                    }
                    if (var23.method3746() == null) {
                        field700[Statics.field325][var21][var22] = null;
                    }
                    method111(var21, var22);
                }
            }
        } else {
            if (class174.field2295 == arg0) {
                byte var25 = var1.method3276();
                byte var26 = var1.method3275();
                byte var27 = var1.method3274();
                byte var28 = var1.method3244();
                int var29 = var1.method3243();
                int var30 = var29 >> 2;
                int var31 = var29 & 0x3;
                int var32 = field805[var30];
                int var33 = var1.method3280();
                int var34 = var1.method3273();
                int var35 = (var34 >> 4 & 0x7) + Statics.field3275;
                int var36 = (var34 & 0x7) + Statics.field2428;
                int var37 = var1.method3281();
                int var38 = var1.method3404();
                int var39 = var1.method3245();
                class62 var40;
                if (field860 == var37) {
                    var40 = Statics.field241;
                } else {
                    var40 = field758[var37];
                }
                if (var40 != null) {
                    class271 var41 = class271.method2839(var39);
                    int var42;
                    int var43;
                    if (var31 == 1 || var31 == 3) {
                        var42 = var41.field3433;
                        var43 = var41.field3431;
                    } else {
                        var42 = var41.field3431;
                        var43 = var41.field3433;
                    }
                    int var44 = (var42 >> 1) + var35;
                    int var45 = (var42 + 1 >> 1) + var35;
                    int var46 = (var43 >> 1) + var36;
                    int var47 = (var43 + 1 >> 1) + var36;
                    int[][] var48 = class51.field495[Statics.field325];
                    int var49 = var48[var44][var46] + var48[var45][var46] + var48[var44][var47] + var48[var45][var47] >> 2;
                    int var50 = (var35 << 7) + (var42 << 6);
                    int var51 = (var36 << 7) + (var43 << 6);
                    class122 var52 = var41.method4722(var30, var31, var48, var50, var49, var51);
                    if (var52 != null) {
                        method2057(Statics.field325, var35, var36, var32, -1, 0, 0, var38 + 1, var33 + 1);
                        var40.field636 = field654 + var38;
                        var40.field617 = field654 + var33;
                        var40.field621 = var52;
                        var40.field618 = var35 * 128 + var42 * 64;
                        var40.field620 = var36 * 128 + var43 * 64;
                        var40.field623 = var49;
                        if (var25 > var26) {
                            byte var53 = var25;
                            var25 = var26;
                            var26 = var53;
                        }
                        if (var28 > var27) {
                            byte var54 = var28;
                            var28 = var27;
                            var27 = var54;
                        }
                        var40.field622 = var25 + var35;
                        var40.field607 = var26 + var35;
                        var40.field610 = var28 + var36;
                        var40.field625 = var27 + var36;
                    }
                }
            }
            if (class174.field2293 == arg0) {
                int var55 = var1.method3392();
                int var56 = var1.method3273();
                int var57 = (var56 >> 4 & 0x7) + Statics.field3275;
                int var58 = (var56 & 0x7) + Statics.field2428;
                int var59 = var1.method3404();
                byte var60 = var1.method3275();
                int var61 = var1.method3281();
                byte var62 = var1.method3244();
                int var63 = var1.method3273() * 4;
                int var64 = var1.method3392() * 4;
                int var65 = var1.method3281();
                int var66 = var1.method3392();
                int var67 = var1.method3283();
                int var68 = var57 + var60;
                int var69 = var58 + var62;
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var61 != 65535) {
                    int var70 = var57 * 128 + 64;
                    int var71 = var58 * 128 + 64;
                    int var72 = var68 * 128 + 64;
                    int var73 = var69 * 128 + 64;
                    class81 var74 = new class81(var61, Statics.field325, var70, var71, method622(var70, var71, Statics.field325) - var63, field654 + var59, field654 + var65, var55, var66, var67, var64);
                    var74.method1724(var72, var73, method622(var72, var73, Statics.field325) - var64, field654 + var59);
                    field857.method3740(var74);
                }
            } else if (class174.field2294 == arg0) {
                int var75 = var1.method3273();
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = field805[var76];
                int var79 = var1.method3271();
                int var80 = (var79 >> 4 & 0x7) + Statics.field3275;
                int var81 = (var79 & 0x7) + Statics.field2428;
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    method2057(Statics.field325, var80, var81, var78, -1, var76, var77, 0, -1);
                }
            } else if (class174.field2289 == arg0) {
                int var82 = var1.method3273();
                int var83 = (var82 >> 4 & 0x7) + Statics.field3275;
                int var84 = (var82 & 0x7) + Statics.field2428;
                int var85 = var1.method3273();
                int var86 = var1.method3280();
                int var87 = var1.method3281();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class72 var90 = new class72(var86, Statics.field325, var88, var89, method622(var88, var89, Statics.field325) - var85, var87, field654);
                    field773.method3740(var90);
                }
            } else if (class174.field2292 == arg0) {
                int var91 = var1.method3280();
                int var92 = var1.method3404();
                int var93 = var1.method3404();
                int var94 = var1.method3273();
                int var95 = (var94 >> 4 & 0x7) + Statics.field3275;
                int var96 = (var94 & 0x7) + Statics.field2428;
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class208 var97 = field700[Statics.field325][var95][var96];
                    if (var97 != null) {
                        for (class82 var98 = (class82) var97.method3746(); var98 != null; var98 = (class82) var97.method3747()) {
                            if ((var93 & 0x7FFF) == var98.field1199 && var98.field1203 == var91) {
                                var98.field1203 = var92;
                                break;
                            }
                        }
                        method111(var95, var96);
                    }
                }
            } else if (class174.field2298 == arg0) {
                int var99 = var1.method3281();
                int var100 = var1.method3243();
                int var101 = var100 >> 2;
                int var102 = var100 & 0x3;
                int var103 = field805[var101];
                int var104 = var1.method3271();
                int var105 = (var104 >> 4 & 0x7) + Statics.field3275;
                int var106 = (var104 & 0x7) + Statics.field2428;
                if (var105 >= 0 && var106 >= 0 && var105 < 103 && var106 < 103) {
                    if (var103 == 0) {
                        class131 var107 = Statics.field3123.method2664(Statics.field325, var105, var106);
                        if (var107 != null) {
                            int var108 = class123.method2261(var107.field1853);
                            if (var101 == 2) {
                                var107.field1850 = new class88(var108, 2, var102 + 4, Statics.field325, var105, var106, var99, false, var107.field1850);
                                var107.field1856 = new class88(var108, 2, var102 + 1 & 0x3, Statics.field325, var105, var106, var99, false, var107.field1856);
                            } else {
                                var107.field1850 = new class88(var108, var101, var102, Statics.field325, var105, var106, var99, false, var107.field1850);
                            }
                        }
                    }
                    if (var103 == 1) {
                        class136 var109 = Statics.field3123.method2647(Statics.field325, var105, var106);
                        if (var109 != null) {
                            int var110 = class123.method2261(var109.field1899);
                            if (var101 == 4 || var101 == 5) {
                                var109.field1901 = new class88(var110, 4, var102, Statics.field325, var105, var106, var99, false, var109.field1901);
                            } else if (var101 == 6) {
                                var109.field1901 = new class88(var110, 4, var102 + 4, Statics.field325, var105, var106, var99, false, var109.field1901);
                            } else if (var101 == 7) {
                                var109.field1901 = new class88(var110, 4, (var102 + 2 & 0x3) + 4, Statics.field325, var105, var106, var99, false, var109.field1901);
                            } else if (var101 == 8) {
                                var109.field1901 = new class88(var110, 4, var102 + 4, Statics.field325, var105, var106, var99, false, var109.field1901);
                                var109.field1893 = new class88(var110, 4, (var102 + 2 & 0x3) + 4, Statics.field325, var105, var106, var99, false, var109.field1893);
                            }
                        }
                    }
                    if (var103 == 2) {
                        class137 var111 = Statics.field3123.method2751(Statics.field325, var105, var106);
                        if (var101 == 11) {
                            var101 = 10;
                        }
                        if (var111 != null) {
                            var111.field1906 = new class88(class123.method2261(var111.field1913), var101, var102, Statics.field325, var105, var106, var99, false, var111.field1906);
                        }
                    }
                    if (var103 == 3) {
                        class118 var112 = Statics.field3123.method2671(Statics.field325, var105, var106);
                        if (var112 != null) {
                            var112.field1590 = new class88(class123.method2261(var112.field1591), 22, var102, Statics.field325, var105, var106, var99, false, var112.field1590);
                        }
                    }
                }
            } else if (class174.field2290 == arg0) {
                int var113 = var1.method3245();
                int var114 = var1.method3245();
                int var115 = var1.method3273();
                int var116 = (var115 >> 4 & 0x7) + Statics.field3275;
                int var117 = (var115 & 0x7) + Statics.field2428;
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class82 var118 = new class82();
                    var118.field1199 = var113;
                    var118.field1203 = var114;
                    if (field700[Statics.field325][var116][var117] == null) {
                        field700[Statics.field325][var116][var117] = new class208();
                    }
                    field700[Statics.field325][var116][var117].method3740(var118);
                    method111(var116, var117);
                }
            }
        }
    }

    @ObfuscatedName("cs.hn(IIIIIIIIIB)V")
    public static final void method2057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field771.method3746(); var10 != null; var10 = (class64) field771.method3747()) {
            if (var10.field920 == arg0 && var10.field917 == arg1 && var10.field919 == arg2 && var10.field922 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field920 = arg0;
            var9.field922 = arg3;
            var9.field917 = arg1;
            var9.field919 = arg2;
            method199(var9);
            field771.method3740(var9);
        }
        var9.field918 = arg4;
        var9.field924 = arg5;
        var9.field923 = arg6;
        var9.field925 = arg7;
        var9.field926 = arg8;
    }

    @ObfuscatedName("ii.hf(B)V")
    public static final void method4174() {
        for (class64 var0 = (class64) field771.method3746(); var0 != null; var0 = (class64) field771.method3747()) {
            if (var0.field926 == -1) {
                var0.field925 = 0;
                method199(var0);
            } else {
                var0.method3733();
            }
        }
    }

    @ObfuscatedName("b.he(Lbv;B)V")
    public static final void method199(class64 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field922 == 0) {
            var1 = Statics.field3123.method2668(arg0.field920, arg0.field917, arg0.field919);
        }
        if (arg0.field922 == 1) {
            var1 = Statics.field3123.method2641(arg0.field920, arg0.field917, arg0.field919);
        }
        if (arg0.field922 == 2) {
            var1 = Statics.field3123.method2670(arg0.field920, arg0.field917, arg0.field919);
        }
        if (arg0.field922 == 3) {
            var1 = Statics.field3123.method2697(arg0.field920, arg0.field917, arg0.field919);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3123.method2672(arg0.field920, arg0.field917, arg0.field919, var1);
            var3 = class123.method2261(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field916 = var3;
        arg0.field921 = var4;
        arg0.field929 = var5;
    }

    @ObfuscatedName("n.hl(IIIIIIII)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field782 && Statics.field325 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3123.method2668(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3123.method2641(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3123.method2670(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3123.method2697(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3123.method2672(arg0, arg2, arg3, var7);
            int var13 = class123.method2261(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3123.method2659(arg0, arg2, arg3);
                class271 var16 = class271.method2839(var13);
                if (var16.field3429 != 0) {
                    field729[arg0].method3099(arg2, arg3, var14, var15, var16.field3423);
                }
            }
            if (arg1 == 1) {
                Statics.field3123.method2660(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3123.method2661(arg0, arg2, arg3);
                class271 var17 = class271.method2839(var13);
                if (var17.field3431 + arg2 > 103 || var17.field3431 + arg3 > 103 || var17.field3433 + arg2 > 103 || var17.field3433 + arg3 > 103) {
                    return;
                }
                if (var17.field3429 != 0) {
                    field729[arg0].method3095(arg2, arg3, var17.field3431, var17.field3433, var15, var17.field3423);
                }
            }
            if (arg1 == 3) {
                Statics.field3123.method2662(arg0, arg2, arg3);
                class271 var18 = class271.method2839(var13);
                if (var18.field3429 == 1) {
                    field729[arg0].method3101(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field487[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        Statics.method1582(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3123, field729[arg0]);
    }

    @ObfuscatedName("o.ho(III)V")
    public static final void method111(int arg0, int arg1) {
        class208 var2 = field700[Statics.field325][arg0][arg1];
        if (var2 == null) {
            Statics.field3123.method2663(Statics.field325, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method3746(); var6 != null; var6 = (class82) var2.method3747()) {
            class272 var7 = class272.method1730(var6.field1199);
            long var8 = (long) var7.field3483;
            if (var7.field3512 == 1) {
                var8 = (long) (var6.field1203 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3123.method2663(Statics.field325, arg0, arg1);
            return;
        }
        var2.method3753(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method3746(); var12 != null; var12 = (class82) var2.method3747()) {
            if (var5.field1199 != var12.field1199) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1199 != var12.field1199 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class123.method2401(arg0, arg1, 3, false, 0);
        Statics.field3123.method2649(Statics.field325, arg0, arg1, method622(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field325), var5, var13, var10, var11);
    }

    @ObfuscatedName("im.hj(B)V")
    public static final void method4179() {
        class192 var0 = field689.field1279;
        var0.method3508();
        int var1 = var0.method3509(8);
        if (var1 < field746) {
            for (int var2 = var1; var2 < field746; var2++) {
                field764[++field695 - 1] = field761[var2];
            }
        }
        if (var1 > field746) {
            throw new RuntimeException("");
        }
        field746 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field761[var3];
            class74 var5 = field684[var4];
            int var6 = var0.method3509(1);
            if (var6 == 0) {
                field761[++field746 - 1] = var4;
                var5.field980 = field654;
            } else {
                int var7 = var0.method3509(2);
                if (var7 == 0) {
                    field761[++field746 - 1] = var4;
                    var5.field980 = field654;
                    field838[++field765 - 1] = var4;
                } else if (var7 == 1) {
                    field761[++field746 - 1] = var4;
                    var5.field980 = field654;
                    int var8 = var0.method3509(3);
                    var5.method1660(var8, (byte) 1);
                    int var9 = var0.method3509(1);
                    if (var9 == 1) {
                        field838[++field765 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field761[++field746 - 1] = var4;
                    var5.field980 = field654;
                    int var10 = var0.method3509(3);
                    var5.method1660(var10, (byte) 2);
                    int var11 = var0.method3509(3);
                    var5.method1660(var11, (byte) 2);
                    int var12 = var0.method3509(1);
                    if (var12 == 1) {
                        field838[++field765 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field764[++field695 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("js.hs(ZLgf;I)V")
    public static final void method4893(boolean arg0, class192 arg1) {
        while (true) {
            if (arg1.method3534(field689.field1288) >= 27) {
                int var2 = arg1.method3509(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field684[var2] == null) {
                        field684[var2] = new class74();
                        var3 = true;
                    }
                    class74 var4 = field684[var2];
                    field761[++field746 - 1] = var2;
                    var4.field980 = field654;
                    int var5 = field768[arg1.method3509(3)];
                    if (var3) {
                        var4.field982 = var4.field932 = var5;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method3509(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method3509(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    var4.field1089 = class274.method1993(arg1.method3509(14));
                    int var7 = arg1.method3509(1);
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3509(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3509(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method3509(1);
                    if (var9 == 1) {
                        field838[++field765 - 1] = var2;
                    }
                    var4.field934 = var4.field1089.field3539;
                    var4.field984 = var4.field1089.field3561;
                    if (var4.field984 == 0) {
                        var4.field932 = 0;
                    }
                    var4.field939 = var4.field1089.field3544;
                    var4.field940 = var4.field1089.field3545;
                    var4.field941 = var4.field1089.field3546;
                    var4.field983 = var4.field1089.field3543;
                    var4.field930 = var4.field1089.field3562;
                    var4.field937 = var4.field1089.field3559;
                    var4.field938 = var4.field1089.field3565;
                    var4.method1659(Statics.field241.field977[0] + var8, Statics.field241.field975[0] + var6, var7 == 1);
                    continue;
                }
            }
            arg1.method3521();
            return;
        }
    }

    @ObfuscatedName("gl.hd(Lbb;IIBI)V")
    public static final void method3476(class62 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field977[0];
        int var5 = arg0.field975[0];
        int var6 = arg0.method1036();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1036();
        class169 var8 = method116(arg1, arg2);
        class167 var9 = field729[arg0.field627];
        int[] var10 = field704;
        int[] var11 = field914;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class168.field2084[var12][var13] = 0;
                class168.field2085[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class168.method3040(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class168.field2084[var17][var18] = 99;
            class168.field2085[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class168.field2087[var21] = var4;
            int var55 = var21 + 1;
            class168.field2086[var21] = var5;
            int[][] var23 = var9.field2070;
            boolean var28;
            while (true) {
                if (var55 == var22) {
                    Statics.field2082 = var15;
                    Statics.field1500 = var16;
                    var28 = false;
                    break;
                }
                var15 = class168.field2087[var22];
                var16 = class168.field2086[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2075;
                int var27 = var16 - var9.field2076;
                if (var8.method1026(2, var15, var16, var9)) {
                    Statics.field2082 = var15;
                    Statics.field1500 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class168.field2085[var24][var25] + 1;
                if (var24 > 0 && class168.field2084[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class168.field2087[var55] = var15 - 1;
                    class168.field2086[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 - 1][var25] = 2;
                    class168.field2085[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class168.field2084[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class168.field2087[var55] = var15 + 1;
                    class168.field2086[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 + 1][var25] = 8;
                    class168.field2085[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class168.field2084[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class168.field2087[var55] = var15;
                    class168.field2086[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24][var25 - 1] = 1;
                    class168.field2085[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class168.field2084[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class168.field2087[var55] = var15;
                    class168.field2086[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24][var25 + 1] = 4;
                    class168.field2085[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class168.field2084[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class168.field2087[var55] = var15 - 1;
                    class168.field2086[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 - 1][var25 - 1] = 3;
                    class168.field2085[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class168.field2084[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class168.field2087[var55] = var15 + 1;
                    class168.field2086[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 + 1][var25 - 1] = 9;
                    class168.field2085[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class168.field2084[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class168.field2087[var55] = var15 - 1;
                    class168.field2086[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 - 1][var25 + 1] = 6;
                    class168.field2085[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class168.field2084[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class168.field2087[var55] = var15 + 1;
                    class168.field2086[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class168.field2084[var24 + 1][var25 + 1] = 12;
                    class168.field2085[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            var14 = class168.method484(var4, var5, var7, var8, var9);
        }
        int var48;
        label321: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field2082;
            int var33 = Statics.field1500;
            if (!var14) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field2093;
                int var38 = var8.field2090;
                int var39 = var8.field2091;
                int var40 = var8.field2092;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class168.field2085[var43][var44] < 100) {
                            int var45 = 0;
                            if (var41 < var37) {
                                var45 = var37 - var41;
                            } else if (var41 > var37 + var39 - 1) {
                                var45 = var41 - (var37 + var39 - 1);
                            }
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = var45 * var45 + var46 * var46;
                            if (var47 < var34 || var34 == var47 && class168.field2085[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class168.field2085[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label321;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var48 = 0;
            } else {
                byte var49 = 0;
                class168.field2087[var49] = var32;
                int var56 = var49 + 1;
                class168.field2086[var49] = var33;
                int var50;
                int var51 = var50 = class168.field2084[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class168.field2087[var56] = var32;
                        class168.field2086[var56++] = var33;
                    }
                    if ((var51 & 0x2) != 0) {
                        var32++;
                    } else if ((var51 & 0x8) != 0) {
                        var32--;
                    }
                    if ((var51 & 0x1) != 0) {
                        var33++;
                    } else if ((var51 & 0x4) != 0) {
                        var33--;
                    }
                    var51 = class168.field2084[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class168.field2087[var56];
                    var11[var52++] = class168.field2086[var56];
                    if (var52 >= var10.length) {
                        break;
                    }
                }
                var48 = var52;
            }
        }
        int var53 = var48;
        if (var48 >= 1) {
            for (int var54 = 0; var54 < var53 - 1; var54++) {
                arg0.method1049(field704[var54], field914[var54], arg3);
            }
        }
    }

    @ObfuscatedName("s.hu(IIB)Lfw;")
    public static class169 method116(int arg0, int arg1) {
        field688.field2093 = arg0;
        field688.field2090 = arg1;
        field688.field2091 = 1;
        field688.field2092 = 1;
        return field688;
    }

    @ObfuscatedName("gh.hh(I)V")
    public static void method3500() {
        field696 = 0;
        field750 = false;
    }

    @ObfuscatedName("bs.ht(I)V")
    public static void method974() {
        method3500();
        field784[0] = class240.field2866;
        field785[0] = "";
        field718[0] = 1006;
        field786[0] = false;
        field696 = 1;
    }

    @ObfuscatedName("eo.hb(IIIII)V")
    public static final void method2885(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field770; var4++) {
            if (field850[var4] + field848[var4] > arg0 && field848[var4] < arg0 + arg2 && field882[var4] + field741[var4] > arg1 && field882[var4] < arg1 + arg3) {
                field845[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hi(I)V")
    public final void method1099() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field696 - 1; var2++) {
                if (field718[var2] < 1000 && field718[var2 + 1] > 1000) {
                    String var3 = field785[var2];
                    field785[var2] = field785[var2 + 1];
                    field785[var2 + 1] = var3;
                    String var4 = field784[var2];
                    field784[var2] = field784[var2 + 1];
                    field784[var2 + 1] = var4;
                    int var5 = field718[var2];
                    field718[var2] = field718[var2 + 1];
                    field718[var2 + 1] = var5;
                    int var6 = field780[var2];
                    field780[var2] = field780[var2 + 1];
                    field780[var2 + 1] = var6;
                    int var7 = field692[var2];
                    field692[var2] = field692[var2 + 1];
                    field692[var2 + 1] = var7;
                    int var8 = field783[var2];
                    field783[var2] = field783[var2 + 1];
                    field783[var2 + 1] = var8;
                    boolean var9 = field786[var2];
                    field786[var2] = field786[var2 + 1];
                    field786[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field2418 != null || field719 != null) {
            return;
        }
        int var27;
        int var29;
        int var30;
        label212: {
            int var10 = class49.field469;
            if (field750) {
                if (var10 != 1 && (Statics.field1393 || var10 != 4)) {
                    int var11 = class49.field466;
                    int var12 = class49.field468;
                    if (var11 < Statics.field2821 - 10 || var11 > Statics.field2821 + Statics.field1049 + 10 || var12 < Statics.field3260 - 10 || var12 > Statics.field3260 + Statics.field1 + 10) {
                        field750 = false;
                        method2885(Statics.field2821, Statics.field3260, Statics.field1049, Statics.field1);
                    }
                }
                if (var10 == 1 || !Statics.field1393 && var10 == 4) {
                    int var13 = Statics.field2821;
                    int var14 = Statics.field3260;
                    int var15 = Statics.field1049;
                    int var16 = class49.field475;
                    int var17 = class49.field478;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field696; var19++) {
                        int var20 = (field696 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field780[var18];
                        int var22 = field692[var18];
                        int var23 = field718[var18];
                        int var24 = field783[var18];
                        String var25 = field784[var18];
                        String var26 = field785[var18];
                        method2879(var21, var22, var23, var24, var25, var26, class49.field475, class49.field478);
                    }
                    field750 = false;
                    method2885(Statics.field2821, Statics.field3260, Statics.field1049, Statics.field1);
                }
            } else {
                var27 = Statics.method907();
                if ((var10 == 1 || !Statics.field1393 && var10 == 4) && var27 >= 0) {
                    int var28 = field718[var27];
                    if (var28 == 39 || var28 == 40 || var28 == 41 || var28 == 42 || var28 == 43 || var28 == 33 || var28 == 34 || var28 == 35 || var28 == 36 || var28 == 37 || var28 == 38 || var28 == 1005) {
                        var29 = field780[var27];
                        var30 = field692[var27];
                        class233 var31 = class233.method575(var30);
                        int var32 = method5092(var31);
                        boolean var33 = (var32 >> 28 & 0x1) != 0;
                        if (var33) {
                            break label212;
                        }
                        class234 var10000 = (class234) null;
                        if (class234.method298(method5092(var31))) {
                            break label212;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field1393 && var10 == 4) && this.method1111()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field1393 && var10 == 4) && field696 > 0 && var27 >= 0) {
                    int var34 = field780[var27];
                    int var35 = field692[var27];
                    int var36 = field718[var27];
                    int var37 = field783[var27];
                    String var38 = field784[var27];
                    String var39 = field785[var27];
                    method2879(var34, var35, var36, var37, var38, var39, class49.field475, class49.field478);
                }
                if (var10 == 2 && field696 > 0) {
                    this.method1162(class49.field475, class49.field478);
                }
            }
            return;
        }
        if (Statics.field2418 != null && !field754 && field696 > 0 && !this.method1111()) {
            method158(field751, field752);
        }
        field754 = false;
        field755 = 0;
        if (Statics.field2418 != null) {
            method481(Statics.field2418);
        }
        Statics.field2418 = class233.method575(var30);
        field792 = var29;
        field751 = class49.field475;
        field752 = class49.field478;
        if (var27 >= 0) {
            method953(var27);
        }
        method481(Statics.field2418);
    }

    @ObfuscatedName("client.hm(B)Z")
    public final boolean method1111() {
        int var1 = Statics.method907();
        boolean var2 = field777 == 1 && field696 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field718[var1];
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
        return var2 && !field786[var1];
    }

    @ObfuscatedName("client.hx(III)V")
    public final void method1162(int arg0, int arg1) {
        method549(arg0, arg1);
        Statics.field3123.method2688(Statics.field325, arg0, arg1, false);
        field750 = true;
    }

    @ObfuscatedName("ab.ha(III)V")
    public static void method549(int arg0, int arg1) {
        int var2 = Statics.field1399.method5177(class240.field2980);
        for (int var3 = 0; var3 < field696; var3++) {
            class301 var4 = Statics.field1399;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field785[var3].length() > 0) {
                var5 = field784[var3] + class240.field2987 + field785[var3];
            } else {
                var5 = field784[var3];
            }
            int var6 = var4.method5177(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field696 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1983) {
            var8 = Statics.field1983 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field42) {
            var9 = Statics.field42 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field2821 = var8;
        Statics.field3260 = var9;
        Statics.field1049 = var2;
        Statics.field1 = field696 * 15 + 22;
    }

    @ObfuscatedName("em.hz(Lby;III)V")
    public static final void method2958(class77 arg0, int arg1, int arg2) {
        method2879(arg0.field1115, arg0.field1112, arg0.field1117, arg0.field1113, arg0.field1111, arg0.field1111, arg1, arg2);
    }

    @ObfuscatedName("ez.hw(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2879(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 33) {
            class175 var8 = class175.method948(class172.field2280, field689.field1278);
            var8.field2308.method3235(arg3);
            var8.field2308.method3288(arg1);
            var8.field2308.method3339(arg0);
            field689.method1848(var8);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 38) {
            method1017();
            class233 var9 = class233.method575(arg1);
            field795 = 1;
            Statics.field1243 = arg0;
            Statics.field2055 = arg1;
            Statics.field1729 = arg3;
            method481(var9);
            field796 = class76.method676(16748608) + class272.method1730(arg3).field3480 + class76.method676(16777215);
            if (field796 == null) {
                field796 = class240.field3056;
            }
            return;
        }
        if (arg2 == 22) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var10 = class175.method948(class172.field2195, field689.field1278);
            var10.field2308.method3383(arg3);
            var10.field2308.method3235(Statics.field31 + arg0);
            var10.field2308.method3269(class40.field363[82] ? 1 : 0);
            var10.field2308.method3339(Statics.field1241 + arg1);
            field689.method1848(var10);
        }
        if (arg2 == 1001) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var11 = class175.method948(class172.field2194, field689.field1278);
            var11.field2308.method3339(arg3);
            var11.field2308.method3339(Statics.field1241 + arg1);
            var11.field2308.method3268(class40.field363[82] ? 1 : 0);
            var11.field2308.method3383(Statics.field31 + arg0);
            field689.method1848(var11);
        }
        if (arg2 == 1002) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            class175 var12 = class175.method948(class172.field2255, field689.field1278);
            var12.field2308.method3339(arg3);
            field689.method1848(var12);
        }
        if (arg2 == 9) {
            class74 var13 = field684[arg3];
            if (var13 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var14 = class175.method948(class172.field2223, field689.field1278);
                var14.field2308.method3270(class40.field363[82] ? 1 : 0);
                var14.field2308.method3383(arg3);
                field689.method1848(var14);
            }
        }
        if (arg2 == 26) {
            class175 var15 = class175.method948(class172.field2253, field689.field1278);
            field689.method1848(var15);
            for (class57 var16 = (class57) field803.method3690(); var16 != null; var16 = (class57) field803.method3692()) {
                if (var16.field552 == 0 || var16.field552 == 3) {
                    method917(var16, true);
                }
            }
            if (field806 != null) {
                method481(field806);
                field806 = null;
            }
        }
        if (arg2 == 45) {
            class62 var17 = field758[arg3];
            if (var17 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var18 = class175.method948(class172.field2254, field689.field1278);
                var18.field2308.method3268(class40.field363[82] ? 1 : 0);
                var18.field2308.method3235(arg3);
                field689.method1848(var18);
            }
        }
        if (arg2 == 46) {
            class62 var19 = field758[arg3];
            if (var19 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var20 = class175.method948(class172.field2250, field689.field1278);
                var20.field2308.method3270(class40.field363[82] ? 1 : 0);
                var20.field2308.method3383(arg3);
                field689.method1848(var20);
            }
        }
        if (arg2 == 47) {
            class62 var21 = field758[arg3];
            if (var21 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var22 = class175.method948(class172.field2281, field689.field1278);
                var22.field2308.method3269(class40.field363[82] ? 1 : 0);
                var22.field2308.method3383(arg3);
                field689.method1848(var22);
            }
        }
        if (arg2 == 5) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var23 = class175.method948(class172.field2243, field689.field1278);
            var23.field2308.method3229(arg3);
            var23.field2308.method3235(Statics.field31 + arg0);
            var23.field2308.method3270(class40.field363[82] ? 1 : 0);
            var23.field2308.method3383(Statics.field1241 + arg1);
            field689.method1848(var23);
        }
        if (arg2 == 18) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var24 = class175.method948(class172.field2237, field689.field1278);
            var24.field2308.method3339(Statics.field31 + arg0);
            var24.field2308.method3383(arg3);
            var24.field2308.method3227(class40.field363[82] ? 1 : 0);
            var24.field2308.method3383(Statics.field1241 + arg1);
            field689.method1848(var24);
        }
        if (arg2 == 31) {
            class175 var25 = class175.method948(class172.field2204, field689.field1278);
            var25.field2308.method3287(Statics.field2055);
            var25.field2308.method3235(Statics.field1243);
            var25.field2308.method3287(arg1);
            var25.field2308.method3235(arg0);
            var25.field2308.method3235(Statics.field1729);
            var25.field2308.method3383(arg3);
            field689.method1848(var25);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 50) {
            class62 var26 = field758[arg3];
            if (var26 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var27 = class175.method948(class172.field2234, field689.field1278);
                var27.field2308.method3227(class40.field363[82] ? 1 : 0);
                var27.field2308.method3235(arg3);
                field689.method1848(var27);
            }
        }
        if (arg2 == 1005) {
            class233 var28 = class233.method575(arg1);
            if (var28 == null || var28.field2751[arg0] < 100000) {
                class175 var29 = class175.method948(class172.field2206, field689.field1278);
                var29.field2308.method3235(arg3);
                field689.method1848(var29);
            } else {
                class86.method1671(27, "", var28.field2751[arg0] + " x " + class272.method1730(arg3).field3480);
            }
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 51) {
            class62 var30 = field758[arg3];
            if (var30 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var31 = class175.method948(class172.field2227, field689.field1278);
                var31.field2308.method3229(arg3);
                var31.field2308.method3270(class40.field363[82] ? 1 : 0);
                field689.method1848(var31);
            }
        }
        if (arg2 == 1) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var32 = class175.method948(class172.field2251, field689.field1278);
            var32.field2308.method3235(Statics.field1729);
            var32.field2308.method3287(Statics.field2055);
            var32.field2308.method3229(Statics.field1241 + arg1);
            var32.field2308.method3229(arg3);
            var32.field2308.method3270(class40.field363[82] ? 1 : 0);
            var32.field2308.method3229(Statics.field1243);
            var32.field2308.method3229(Statics.field31 + arg0);
            field689.method1848(var32);
        }
        if (arg2 == 41) {
            class175 var33 = class175.method948(class172.field2271, field689.field1278);
            var33.field2308.method3383(arg3);
            var33.field2308.method3229(arg0);
            var33.field2308.method3230(arg1);
            field689.method1848(var33);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 12) {
            class74 var34 = field684[arg3];
            if (var34 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var35 = class175.method948(class172.field2232, field689.field1278);
                var35.field2308.method3227(class40.field363[82] ? 1 : 0);
                var35.field2308.method3383(arg3);
                field689.method1848(var35);
            }
        }
        if (arg2 == 49) {
            class62 var36 = field758[arg3];
            if (var36 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var37 = class175.method948(class172.field2266, field689.field1278);
                var37.field2308.method3339(arg3);
                var37.field2308.method3268(class40.field363[82] ? 1 : 0);
                field689.method1848(var37);
            }
        }
        if (arg2 == 6) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var38 = class175.method948(class172.field2226, field689.field1278);
            var38.field2308.method3383(Statics.field31 + arg0);
            var38.field2308.method3235(arg3);
            var38.field2308.method3269(class40.field363[82] ? 1 : 0);
            var38.field2308.method3235(Statics.field1241 + arg1);
            field689.method1848(var38);
        }
        if (arg2 == 10) {
            class74 var39 = field684[arg3];
            if (var39 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var40 = class175.method948(class172.field2202, field689.field1278);
                var40.field2308.method3235(arg3);
                var40.field2308.method3270(class40.field363[82] ? 1 : 0);
                field689.method1848(var40);
            }
        }
        if (arg2 == 30 && field806 == null) {
            method621(arg1, arg0);
            field806 = class233.method3154(arg1, arg0);
            method481(field806);
        }
        if (arg2 == 39) {
            class175 var41 = class175.method948(class172.field2277, field689.field1278);
            var41.field2308.method3230(arg1);
            var41.field2308.method3229(arg3);
            var41.field2308.method3339(arg0);
            field689.method1848(var41);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 15) {
            class62 var42 = field758[arg3];
            if (var42 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var43 = class175.method948(class172.field2215, field689.field1278);
                var43.field2308.method3227(class40.field363[82] ? 1 : 0);
                var43.field2308.method3383(field798);
                var43.field2308.method3383(arg3);
                var43.field2308.method3403(Statics.field47);
                field689.method1848(var43);
            }
        }
        if (arg2 == 7) {
            class74 var44 = field684[arg3];
            if (var44 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var45 = class175.method948(class172.field2209, field689.field1278);
                var45.field2308.method3383(arg3);
                var45.field2308.method3227(class40.field363[82] ? 1 : 0);
                var45.field2308.method3287(Statics.field2055);
                var45.field2308.method3229(Statics.field1729);
                var45.field2308.method3339(Statics.field1243);
                field689.method1848(var45);
            }
        }
        if (arg2 == 1004) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            class175 var46 = class175.method948(class172.field2206, field689.field1278);
            var46.field2308.method3235(arg3);
            field689.method1848(var46);
        }
        if (arg2 == 32) {
            class175 var47 = class175.method948(class172.field2225, field689.field1278);
            var47.field2308.method3383(field798);
            var47.field2308.method3230(arg1);
            var47.field2308.method3383(arg0);
            var47.field2308.method3235(arg3);
            var47.field2308.method3403(Statics.field47);
            field689.method1848(var47);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 14) {
            class62 var48 = field758[arg3];
            if (var48 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var49 = class175.method948(class172.field2208, field689.field1278);
                var49.field2308.method3339(Statics.field1243);
                var49.field2308.method3229(Statics.field1729);
                var49.field2308.method3229(arg3);
                var49.field2308.method3269(class40.field363[82] ? 1 : 0);
                var49.field2308.method3287(Statics.field2055);
                field689.method1848(var49);
            }
        }
        if (arg2 == 23) {
            if (field750) {
                Statics.field3123.method2667();
            } else {
                Statics.field3123.method2688(Statics.field325, arg0, arg1, true);
            }
        }
        if (arg2 == 40) {
            class175 var50 = class175.method948(class172.field2246, field689.field1278);
            var50.field2308.method3383(arg0);
            var50.field2308.method3339(arg3);
            var50.field2308.method3287(arg1);
            field689.method1848(var50);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 35) {
            class175 var51 = class175.method948(class172.field2275, field689.field1278);
            var51.field2308.method3287(arg1);
            var51.field2308.method3235(arg3);
            var51.field2308.method3383(arg0);
            field689.method1848(var51);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 2) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var52 = class175.method948(class172.field2217, field689.field1278);
            var52.field2308.method3235(arg3);
            var52.field2308.method3339(field798);
            var52.field2308.method3268(class40.field363[82] ? 1 : 0);
            var52.field2308.method3383(Statics.field1241 + arg1);
            var52.field2308.method3235(Statics.field31 + arg0);
            var52.field2308.method3288(Statics.field47);
            field689.method1848(var52);
        }
        if (arg2 == 16) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var53 = class175.method948(class172.field2245, field689.field1278);
            var53.field2308.method3383(Statics.field1729);
            var53.field2308.method3229(Statics.field1241 + arg1);
            var53.field2308.method3269(class40.field363[82] ? 1 : 0);
            var53.field2308.method3229(Statics.field1243);
            var53.field2308.method3339(arg3);
            var53.field2308.method3339(Statics.field31 + arg0);
            var53.field2308.method3403(Statics.field2055);
            field689.method1848(var53);
        }
        if (arg2 == 19) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var54 = class175.method948(class172.field2200, field689.field1278);
            var54.field2308.method3339(arg3);
            var54.field2308.method3269(class40.field363[82] ? 1 : 0);
            var54.field2308.method3235(Statics.field1241 + arg1);
            var54.field2308.method3383(Statics.field31 + arg0);
            field689.method1848(var54);
        }
        if (arg2 == 21) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var55 = class175.method948(class172.field2216, field689.field1278);
            var55.field2308.method3227(class40.field363[82] ? 1 : 0);
            var55.field2308.method3383(Statics.field1241 + arg1);
            var55.field2308.method3235(Statics.field31 + arg0);
            var55.field2308.method3339(arg3);
            field689.method1848(var55);
        }
        if (arg2 == 42) {
            class175 var56 = class175.method948(class172.field2244, field689.field1278);
            var56.field2308.method3403(arg1);
            var56.field2308.method3229(arg0);
            var56.field2308.method3229(arg3);
            field689.method1848(var56);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 29) {
            class175 var57 = class175.method948(class172.field2213, field689.field1278);
            var57.field2308.method3230(arg1);
            field689.method1848(var57);
            class233 var58 = class233.method575(arg1);
            if (var58.field2744 != null && var58.field2744[0][0] == 5) {
                int var59 = var58.field2744[0][1];
                if (class228.field2596[var59] != var58.field2746[0]) {
                    class228.field2596[var59] = var58.field2746[0];
                    method1732(var59);
                }
            }
        }
        if (arg2 == 58) {
            class233 var60 = class233.method3154(arg1, arg0);
            if (var60 != null) {
                class175 var61 = class175.method948(class172.field2196, field689.field1278);
                var61.field2308.method3229(arg0);
                var61.field2308.method3229(var60.field2695);
                var61.field2308.method3287(Statics.field47);
                var61.field2308.method3383(field798);
                var61.field2308.method3235(field799);
                var61.field2308.method3230(arg1);
                field689.method1848(var61);
            }
        }
        if (arg2 == 17) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var62 = class175.method948(class172.field2192, field689.field1278);
            var62.field2308.method3229(arg3);
            var62.field2308.method3288(Statics.field47);
            var62.field2308.method3383(Statics.field31 + arg0);
            var62.field2308.method3270(class40.field363[82] ? 1 : 0);
            var62.field2308.method3383(Statics.field1241 + arg1);
            var62.field2308.method3339(field798);
            field689.method1848(var62);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2589.method5710(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 1003) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            class74 var63 = field684[arg3];
            if (var63 != null) {
                class274 var64 = var63.field1089;
                if (var64.field3532 != null) {
                    var64 = var64.method4818();
                }
                if (var64 != null) {
                    class175 var65 = class175.method948(class172.field2272, field689.field1278);
                    var65.field2308.method3229(var64.field3536);
                    field689.method1848(var65);
                }
            }
        }
        if (arg2 == 3) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var66 = class175.method948(class172.field2219, field689.field1278);
            var66.field2308.method3227(class40.field363[82] ? 1 : 0);
            var66.field2308.method3383(Statics.field31 + arg0);
            var66.field2308.method3235(arg3);
            var66.field2308.method3383(Statics.field1241 + arg1);
            field689.method1848(var66);
        }
        if (arg2 == 34) {
            class175 var67 = class175.method948(class172.field2268, field689.field1278);
            var67.field2308.method3339(arg3);
            var67.field2308.method3287(arg1);
            var67.field2308.method3235(arg0);
            field689.method1848(var67);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 24) {
            class233 var68 = class233.method575(arg1);
            boolean var69 = true;
            if (var68.field2731 > 0) {
                var69 = method913(var68);
            }
            if (var69) {
                class175 var70 = class175.method948(class172.field2213, field689.field1278);
                var70.field2308.method3230(arg1);
                field689.method1848(var70);
            }
        }
        if (arg2 == 4) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var71 = class175.method948(class172.field2247, field689.field1278);
            var71.field2308.method3383(Statics.field1241 + arg1);
            var71.field2308.method3229(arg3);
            var71.field2308.method3339(Statics.field31 + arg0);
            var71.field2308.method3269(class40.field363[82] ? 1 : 0);
            field689.method1848(var71);
        }
        if (arg2 == 20) {
            field743 = arg6;
            field744 = arg7;
            field648 = 2;
            field855 = 0;
            field732 = arg0;
            field643 = arg1;
            class175 var72 = class175.method948(class172.field2214, field689.field1278);
            var72.field2308.method3235(arg3);
            var72.field2308.method3235(Statics.field1241 + arg1);
            var72.field2308.method3269(class40.field363[82] ? 1 : 0);
            var72.field2308.method3383(Statics.field31 + arg0);
            field689.method1848(var72);
        }
        if (arg2 == 13) {
            class74 var73 = field684[arg3];
            if (var73 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var74 = class175.method948(class172.field2231, field689.field1278);
                var74.field2308.method3229(arg3);
                var74.field2308.method3268(class40.field363[82] ? 1 : 0);
                field689.method1848(var74);
            }
        }
        if (arg2 == 37) {
            class175 var75 = class175.method948(class172.field2270, field689.field1278);
            var75.field2308.method3339(arg3);
            var75.field2308.method3403(arg1);
            var75.field2308.method3383(arg0);
            field689.method1848(var75);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 11) {
            class74 var76 = field684[arg3];
            if (var76 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var77 = class175.method948(class172.field2184, field689.field1278);
                var77.field2308.method3270(class40.field363[82] ? 1 : 0);
                var77.field2308.method3229(arg3);
                field689.method1848(var77);
            }
        }
        if (arg2 == 36) {
            class175 var78 = class175.method948(class172.field2210, field689.field1278);
            var78.field2308.method3339(arg3);
            var78.field2308.method3383(arg0);
            var78.field2308.method3230(arg1);
            field689.method1848(var78);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 43) {
            class175 var79 = class175.method948(class172.field2256, field689.field1278);
            var79.field2308.method3288(arg1);
            var79.field2308.method3235(arg0);
            var79.field2308.method3339(arg3);
            field689.method1848(var79);
            field748 = 0;
            Statics.field54 = class233.method575(arg1);
            field749 = arg0;
        }
        if (arg2 == 25) {
            class233 var80 = class233.method3154(arg1, arg0);
            if (var80 != null) {
                method1017();
                int var83 = method5092(var80);
                int var84 = var83 >> 11 & 0x3F;
                method1584(arg1, arg0, var84, var80.field2695);
                field795 = 0;
                class234 var10000 = (class234) null;
                String var85;
                if (class234.method5127(method5092(var80)) == 0) {
                    var85 = null;
                } else if (var80.field2711 == null || var80.field2711.trim().length() == 0) {
                    var85 = null;
                } else {
                    var85 = var80.field2711;
                }
                field800 = var85;
                if (field800 == null) {
                    field800 = "Null";
                }
                if (var80.field2710) {
                    field801 = var80.field2705 + class76.method676(16777215);
                } else {
                    field801 = class76.method676(65280) + var80.field2748 + class76.method676(16777215);
                }
            }
            return;
        }
        if (arg2 == 28) {
            class175 var86 = class175.method948(class172.field2213, field689.field1278);
            var86.field2308.method3230(arg1);
            field689.method1848(var86);
            class233 var87 = class233.method575(arg1);
            if (var87.field2744 != null && var87.field2744[0][0] == 5) {
                int var88 = var87.field2744[0][1];
                class228.field2596[var88] = 1 - class228.field2596[var88];
                method1732(var88);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var89 = class233.method3154(arg1, arg0);
            if (var89 != null) {
                method986(arg3, arg1, arg0, var89.field2695, arg5);
            }
        }
        if (arg2 == 8) {
            class74 var90 = field684[arg3];
            if (var90 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var91 = class175.method948(class172.field2261, field689.field1278);
                var91.field2308.method3235(field798);
                var91.field2308.method3287(Statics.field47);
                var91.field2308.method3269(class40.field363[82] ? 1 : 0);
                var91.field2308.method3383(arg3);
                field689.method1848(var91);
            }
        }
        if (arg2 == 48) {
            class62 var92 = field758[arg3];
            if (var92 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var93 = class175.method948(class172.field2267, field689.field1278);
                var93.field2308.method3383(arg3);
                var93.field2308.method3270(class40.field363[82] ? 1 : 0);
                field689.method1848(var93);
            }
        }
        if (arg2 == 44) {
            class62 var94 = field758[arg3];
            if (var94 != null) {
                field743 = arg6;
                field744 = arg7;
                field648 = 2;
                field855 = 0;
                field732 = arg0;
                field643 = arg1;
                class175 var95 = class175.method948(class172.field2242, field689.field1278);
                var95.field2308.method3269(class40.field363[82] ? 1 : 0);
                var95.field2308.method3235(arg3);
                field689.method1848(var95);
            }
        }
        if (field795 != 0) {
            field795 = 0;
            method481(class233.method575(Statics.field2055));
        }
        if (field886) {
            method1017();
        }
        if (Statics.field54 != null && field748 == 0) {
            method481(Statics.field54);
        }
    }

    @ObfuscatedName("be.hr(IIIII)V")
    public static void method1584(int arg0, int arg1, int arg2, int arg3) {
        class233 var4 = class233.method3154(arg0, arg1);
        if (var4 != null && var4.field2723 != null) {
            class58 var5 = new class58();
            var5.field562 = var4;
            var5.field574 = var4.field2723;
            class71.method3130(var5);
        }
        field799 = arg3;
        field886 = true;
        Statics.field47 = arg0;
        field798 = arg1;
        Statics.field396 = arg2;
        method481(var4);
    }

    @ObfuscatedName("bq.hp(B)V")
    public static void method1017() {
        if (!field886) {
            return;
        }
        class233 var0 = class233.method3154(Statics.field47, field798);
        if (var0 != null && var0.field2724 != null) {
            class58 var1 = new class58();
            var1.field562 = var0;
            var1.field574 = var0.field2724;
            class71.method3130(var1);
        }
        field886 = false;
        method481(var0);
    }

    @ObfuscatedName("ad.hg(III)V")
    public static void method621(int arg0, int arg1) {
        class175 var2 = class175.method948(class172.field2239, field689.field1278);
        var2.field2308.method3230(arg0);
        var2.field2308.method3339(arg1);
        field689.method1848(var2);
    }

    @ObfuscatedName("bt.hy(IIIILjava/lang/String;I)V")
    public static void method986(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method3154(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2732 != null) {
            class58 var6 = new class58();
            var6.field562 = var5;
            var6.field566 = arg0;
            var6.field569 = arg4;
            var6.field574 = var5.field2732;
            class71.method3130(var6);
        }
        boolean var7 = true;
        if (var5.field2731 > 0) {
            var7 = method913(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method5092(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class175 var11 = class175.method948(class172.field2269, field689.field1278);
            var11.field2308.method3230(arg1);
            var11.field2308.method3383(arg2);
            var11.field2308.method3383(arg3);
            field689.method1848(var11);
        }
        if (arg0 == 2) {
            class175 var12 = class175.method948(class172.field2211, field689.field1278);
            var12.field2308.method3230(arg1);
            var12.field2308.method3383(arg2);
            var12.field2308.method3383(arg3);
            field689.method1848(var12);
        }
        if (arg0 == 3) {
            class175 var13 = class175.method948(class172.field2199, field689.field1278);
            var13.field2308.method3230(arg1);
            var13.field2308.method3383(arg2);
            var13.field2308.method3383(arg3);
            field689.method1848(var13);
        }
        if (arg0 == 4) {
            class175 var14 = class175.method948(class172.field2252, field689.field1278);
            var14.field2308.method3230(arg1);
            var14.field2308.method3383(arg2);
            var14.field2308.method3383(arg3);
            field689.method1848(var14);
        }
        if (arg0 == 5) {
            class175 var15 = class175.method948(class172.field2249, field689.field1278);
            var15.field2308.method3230(arg1);
            var15.field2308.method3383(arg2);
            var15.field2308.method3383(arg3);
            field689.method1848(var15);
        }
        if (arg0 == 6) {
            class175 var16 = class175.method948(class172.field2220, field689.field1278);
            var16.field2308.method3230(arg1);
            var16.field2308.method3383(arg2);
            var16.field2308.method3383(arg3);
            field689.method1848(var16);
        }
        if (arg0 == 7) {
            class175 var17 = class175.method948(class172.field2276, field689.field1278);
            var17.field2308.method3230(arg1);
            var17.field2308.method3383(arg2);
            var17.field2308.method3383(arg3);
            field689.method1848(var17);
        }
        if (arg0 == 8) {
            class175 var18 = class175.method948(class172.field2189, field689.field1278);
            var18.field2308.method3230(arg1);
            var18.field2308.method3383(arg2);
            var18.field2308.method3383(arg3);
            field689.method1848(var18);
        }
        if (arg0 == 9) {
            class175 var19 = class175.method948(class172.field2205, field689.field1278);
            var19.field2308.method3230(arg1);
            var19.field2308.method3383(arg2);
            var19.field2308.method3383(arg3);
            field689.method1848(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var20 = class175.method948(class172.field2248, field689.field1278);
        var20.field2308.method3230(arg1);
        var20.field2308.method3383(arg2);
        var20.field2308.method3383(arg3);
        field689.method1848(var20);
    }

    @ObfuscatedName("at.hv(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method456(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method661(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("an.hk(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method661(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field750 || field696 >= 500) {
            return;
        }
        field784[field696] = arg0;
        field785[field696] = arg1;
        field718[field696] = arg2;
        field783[field696] = arg3;
        field780[field696] = arg4;
        field692[field696] = arg5;
        field786[field696] = arg6;
        field696++;
    }

    @ObfuscatedName("dm.id(B)V")
    public static void method2636() {
        for (int var0 = 0; var0 < field696; var0++) {
            if (method5293(field718[var0])) {
                if (var0 < field696 - 1) {
                    for (int var1 = var0; var1 < field696 - 1; var1++) {
                        field784[var1] = field784[var1 + 1];
                        field785[var1] = field785[var1 + 1];
                        field718[var1] = field718[var1 + 1];
                        field783[var1] = field783[var1 + 1];
                        field780[var1] = field780[var1 + 1];
                        field692[var1] = field692[var1 + 1];
                        field786[var1] = field786[var1 + 1];
                    }
                }
                var0--;
                field696--;
            }
        }
        method549(Statics.field1049 / 2 + Statics.field2821, Statics.field3260);
    }

    @ObfuscatedName("kc.ii(II)Z")
    public static boolean method5293(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("dv.ib(Ljg;IIII)V")
    public static final void method2547(class274 arg0, int arg1, int arg2, int arg3) {
        if (field696 >= 400) {
            return;
        }
        if (arg0.field3532 != null) {
            arg0 = arg0.method4818();
        }
        if (arg0 == null || !arg0.field3537 || arg0.field3567 && field840 != arg1) {
            return;
        }
        String var4 = arg0.field3538;
        if (arg0.field3554 != 0) {
            var4 = var4 + method1018(arg0.field3554, Statics.field241.field613) + " " + class76.field1104 + class240.field2983 + arg0.field3554 + class76.field1105;
        }
        if (arg0.field3567 && field787) {
            method456(class240.field2978, class76.method676(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field795 == 1) {
            method456(class240.field2977, field796 + " " + class76.field1106 + " " + class76.method676(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field886) {
            int var5 = arg0.field3567 && field787 ? 2000 : 0;
            String[] var6 = arg0.field3558;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class240.field2930)) {
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
                        method456(var6[var7], class76.method676(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class240.field2930)) {
                        short var10 = 0;
                        if (field842 != class79.field1127) {
                            if (field842 == class79.field1125 || field842 == class79.field1126 && arg0.field3554 > Statics.field241.field613) {
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
                            method456(var6[var9], class76.method676(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3567 || !field787) {
                method456(class240.field2978, class76.method676(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field396 & 0x2) == 2) {
            method456(field800, field801 + " " + class76.field1106 + " " + class76.method676(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bx.iv(Lbb;IIIB)V")
    public static final void method1668(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field241 == arg0 || field696 >= 400) {
            return;
        }
        String var4;
        if (arg0.field614 == 0) {
            var4 = arg0.field612[0] + arg0.field633 + arg0.field612[1] + method1018(arg0.field613, Statics.field241.field613) + " " + class76.field1104 + class240.field2983 + arg0.field613 + class76.field1105 + arg0.field612[2];
        } else {
            var4 = arg0.field612[0] + arg0.field633 + arg0.field612[1] + " " + class76.field1104 + class240.field2984 + arg0.field614 + class76.field1105 + arg0.field612[2];
        }
        if (field795 == 1) {
            method456(class240.field2977, field796 + " " + class76.field1106 + " " + class76.method676(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field886) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field766[var5] != null) {
                    short var6 = 0;
                    if (field766[var5].equalsIgnoreCase(class240.field2930)) {
                        if (field733 == class79.field1127) {
                            continue;
                        }
                        if (field733 == class79.field1125 || field733 == class79.field1126 && arg0.field613 > Statics.field241.field613) {
                            var6 = 2000;
                        }
                        if (Statics.field241.field628 != 0 && arg0.field628 != 0) {
                            if (Statics.field241.field628 == arg0.field628) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field791[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field666[var5] + var6;
                    method456(field766[var5], class76.method676(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field396 & 0x8) == 8) {
            method456(field800, field801 + " " + class76.field1106 + " " + class76.method676(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field696; var9++) {
            if (field718[var9] == 23) {
                field785[var9] = class76.method676(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bq.im(III)Ljava/lang/String;")
    public static final String method1018(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class76.method676(16711680);
        } else if (var2 < -6) {
            return class76.method676(16723968);
        } else if (var2 < -3) {
            return class76.method676(16740352);
        } else if (var2 < 0) {
            return class76.method676(16756736);
        } else if (var2 > 9) {
            return class76.method676(65280);
        } else if (var2 > 6) {
            return class76.method676(4259584);
        } else if (var2 > 3) {
            return class76.method676(8453888);
        } else if (var2 > 0) {
            return class76.method676(12648192);
        } else {
            return class76.method676(16776960);
        }
    }

    @ObfuscatedName("gl.it(IIIIIIIII)V")
    public static final void method3479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method91(arg0)) {
            Statics.field2586 = null;
            method1814(Statics.field2622[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2586 != null) {
                method1814(Statics.field2586, -1412584499, arg1, arg2, arg3, arg4, Statics.field526, Statics.field3713, arg7);
                Statics.field2586 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field845[var8] = true;
            }
        } else {
            field845[arg7] = true;
        }
    }

    @ObfuscatedName("ct.if([Lhv;IIIIIIIII)V")
    public static final void method1814(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class320.method5371(arg2, arg3, arg4, arg5);
        class125.method2554();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2737 == arg1 || arg1 == -1412584499 && field719 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field848[field770] = var10.field2759 + arg6;
                    field882[field770] = var10.field2650 + arg7;
                    field850[field770] = var10.field2691;
                    field741[field770] = var10.field2740;
                    var11 = ++field770 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2763 = var11;
                var10.field2764 = field654;
                if (!var10.field2710 || !method30(var10)) {
                    if (var10.field2731 > 0) {
                        method3206(var10);
                    }
                    int var12 = var10.field2759 + arg6;
                    int var13 = var10.field2650 + arg7;
                    int var14 = var10.field2703;
                    if (field719 == var10) {
                        if (arg1 != -1412584499 && !var10.field2685) {
                            Statics.field2586 = arg0;
                            Statics.field526 = arg6;
                            Statics.field3713 = arg7;
                            continue;
                        }
                        if (field824 && field818) {
                            int var15 = class49.field466;
                            int var16 = class49.field468;
                            int var17 = var15 - field815;
                            int var18 = var16 - field816;
                            if (var17 < field819) {
                                var17 = field819;
                            }
                            if (var10.field2691 + var17 > field819 + field814.field2691) {
                                var17 = field819 + field814.field2691 - var10.field2691;
                            }
                            if (var18 < field820) {
                                var18 = field820;
                            }
                            if (var10.field2740 + var18 > field820 + field814.field2740) {
                                var18 = field820 + field814.field2740 - var10.field2740;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2685) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2620 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2620 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2691 + var12;
                        int var26 = var10.field2740 + var13;
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
                        int var29 = var10.field2691 + var12;
                        int var30 = var10.field2740 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2710 || var19 < var21 && var20 < var22) {
                        if (var10.field2731 != 0) {
                            if (var10.field2731 == 1336) {
                                if (field660) {
                                    var13 += 15;
                                    Statics.field209.method5180("Fps:" + field431, var10.field2691 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field782) {
                                        var33 = 16711680;
                                    }
                                    Statics.field209.method5180("Mem:" + var32 + "k", var10.field2691 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2731 == 1337) {
                                field913 = var12;
                                field891 = var13;
                                int var36 = var10.field2691;
                                int var37 = var10.field2740;
                                field740++;
                                method5363();
                                method3142();
                                method995();
                                method976(true);
                                int var38 = class84.field1212;
                                int[] var39 = class84.field1211;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    if (field685 != var39[var40] && field860 != var39[var40]) {
                                        method4180(field758[var39[var40]], true);
                                    }
                                }
                                method976(false);
                                for (class81 var41 = (class81) field857.method3746(); var41 != null; var41 = (class81) field857.method3747()) {
                                    if (Statics.field325 != var41.field1173 || field654 > var41.field1179) {
                                        var41.method3733();
                                    } else if (field654 >= var41.field1178) {
                                        if (var41.field1182 > 0) {
                                            class74 var42 = field684[var41.field1182 - 1];
                                            if (var42 != null && var42.field947 >= 0 && var42.field947 < 13312 && var42.field960 >= 0 && var42.field960 < 13312) {
                                                var41.method1724(var42.field947, var42.field960, method622(var42.field947, var42.field960, var41.field1173) - var41.field1186, field654);
                                            }
                                        }
                                        if (var41.field1182 < 0) {
                                            int var43 = -var41.field1182 - 1;
                                            class62 var44;
                                            if (field860 == var43) {
                                                var44 = Statics.field241;
                                            } else {
                                                var44 = field758[var43];
                                            }
                                            if (var44 != null && var44.field947 >= 0 && var44.field947 < 13312 && var44.field960 >= 0 && var44.field960 < 13312) {
                                                var41.method1724(var44.field947, var44.field960, method622(var44.field947, var44.field960, var41.field1173) - var41.field1186, field654);
                                            }
                                        }
                                        var41.method1726(field665);
                                        Statics.field3123.method2653(Statics.field325, (int) var41.field1184, (int) var41.field1185, (int) var41.field1172, 60, var41, var41.field1189, -1L, false);
                                    }
                                }
                                for (class72 var45 = (class72) field773.method3746(); var45 != null; var45 = (class72) field773.method3747()) {
                                    if (Statics.field325 != var45.field1070 || var45.field1077) {
                                        var45.method3733();
                                    } else if (field654 >= var45.field1069) {
                                        var45.method1641(field665);
                                        if (var45.field1077) {
                                            var45.method3733();
                                        } else {
                                            Statics.field3123.method2653(var45.field1070, var45.field1076, var45.field1072, var45.field1073, 60, var45, 0, -1L, false);
                                        }
                                    }
                                }
                                method4306(var12, var13, var36, var37, true);
                                int var46 = field898;
                                int var47 = field821;
                                int var48 = field900;
                                int var49 = field901;
                                class320.method5371(var46, var47, var46 + var48, var47 + var49);
                                class125.method2554();
                                if (!field884) {
                                    int var50 = field711;
                                    if (field762 / 256 > var50) {
                                        var50 = field762 / 256;
                                    }
                                    if (field885[4] && field909[4] + 128 > var50) {
                                        var50 = field909[4] + 128;
                                    }
                                    int var51 = field712 & 0x7FF;
                                    int var52 = Statics.field1081;
                                    int var53 = Statics.field1071;
                                    int var54 = Statics.field512;
                                    int var55 = var50 * 3 + 600;
                                    int var56 = 2048 - var50 & 0x7FF;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 0;
                                    int var59 = 0;
                                    int var60 = var55;
                                    if (var56 != 0) {
                                        int var61 = class125.field1766[var56];
                                        int var62 = class125.field1741[var56];
                                        int var63 = var59 * var62 - var55 * var61 >> 16;
                                        var60 = var59 * var61 + var55 * var62 >> 16;
                                        var59 = var63;
                                    }
                                    if (var57 != 0) {
                                        int var64 = class125.field1766[var57];
                                        int var65 = class125.field1741[var57];
                                        int var66 = var58 * var65 + var60 * var64 >> 16;
                                        var60 = var60 * var65 - var58 * var64 >> 16;
                                        var58 = var66;
                                    }
                                    Statics.field385 = var52 - var58;
                                    Statics.field2802 = var53 - var59;
                                    Statics.field3210 = var54 - var60;
                                    Statics.field3525 = var50;
                                    Statics.field1948 = var51;
                                    if (field726 == 1 && field809 >= 2 && field654 % 50 == 0 && (Statics.field1081 >> 7 != Statics.field241.field947 >> 7 || Statics.field512 >> 7 != Statics.field241.field960 >> 7)) {
                                        int var67 = Statics.field241.field627;
                                        int var68 = (Statics.field1081 >> 7) + Statics.field31;
                                        int var69 = (Statics.field512 >> 7) + Statics.field1241;
                                        method2398(var68, var69, var67, true);
                                    }
                                }
                                int var82;
                                if (field884) {
                                    int var83;
                                    if (Statics.field580.field1017) {
                                        var83 = Statics.field325;
                                    } else {
                                        int var84 = method622(Statics.field385, Statics.field3210, Statics.field325);
                                        if (var84 - Statics.field2802 >= 800 || (class51.field487[Statics.field325][Statics.field385 >> 7][Statics.field3210 >> 7] & 0x4) == 0) {
                                            var83 = 3;
                                        } else {
                                            var83 = Statics.field325;
                                        }
                                    }
                                    var82 = var83;
                                } else {
                                    int var70;
                                    if (Statics.field580.field1017) {
                                        var70 = Statics.field325;
                                    } else {
                                        label1327: {
                                            int var71 = 3;
                                            if (Statics.field3525 < 310) {
                                                label1295: {
                                                    int var72;
                                                    int var73;
                                                    if (field726 == 1) {
                                                        var72 = Statics.field1081 >> 7;
                                                        var73 = Statics.field512 >> 7;
                                                    } else {
                                                        var72 = Statics.field241.field947 >> 7;
                                                        var73 = Statics.field241.field960 >> 7;
                                                    }
                                                    int var74 = Statics.field385 >> 7;
                                                    int var75 = Statics.field3210 >> 7;
                                                    if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                                                        if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                                                            if ((class51.field487[Statics.field325][var74][var75] & 0x4) != 0) {
                                                                var71 = Statics.field325;
                                                            }
                                                            int var76;
                                                            if (var72 > var74) {
                                                                var76 = var72 - var74;
                                                            } else {
                                                                var76 = var74 - var72;
                                                            }
                                                            int var77;
                                                            if (var73 > var75) {
                                                                var77 = var73 - var75;
                                                            } else {
                                                                var77 = var75 - var73;
                                                            }
                                                            if (var76 > var77) {
                                                                int var78 = var77 * 65536 / var76;
                                                                int var79 = 32768;
                                                                while (true) {
                                                                    if (var72 == var74) {
                                                                        break label1295;
                                                                    }
                                                                    if (var74 < var72) {
                                                                        var74++;
                                                                    } else if (var74 > var72) {
                                                                        var74--;
                                                                    }
                                                                    if ((class51.field487[Statics.field325][var74][var75] & 0x4) != 0) {
                                                                        var71 = Statics.field325;
                                                                    }
                                                                    var79 += var78;
                                                                    if (var79 >= 65536) {
                                                                        var79 -= 65536;
                                                                        if (var75 < var73) {
                                                                            var75++;
                                                                        } else if (var75 > var73) {
                                                                            var75--;
                                                                        }
                                                                        if ((class51.field487[Statics.field325][var74][var75] & 0x4) != 0) {
                                                                            var71 = Statics.field325;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (var77 > 0) {
                                                                    int var80 = var76 * 65536 / var77;
                                                                    int var81 = 32768;
                                                                    while (var73 != var75) {
                                                                        if (var75 < var73) {
                                                                            var75++;
                                                                        } else if (var75 > var73) {
                                                                            var75--;
                                                                        }
                                                                        if ((class51.field487[Statics.field325][var74][var75] & 0x4) != 0) {
                                                                            var71 = Statics.field325;
                                                                        }
                                                                        var81 += var80;
                                                                        if (var81 >= 65536) {
                                                                            var81 -= 65536;
                                                                            if (var74 < var72) {
                                                                                var74++;
                                                                            } else if (var74 > var72) {
                                                                                var74--;
                                                                            }
                                                                            if ((class51.field487[Statics.field325][var74][var75] & 0x4) != 0) {
                                                                                var71 = Statics.field325;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break label1295;
                                                            }
                                                        }
                                                        var70 = Statics.field325;
                                                        break label1327;
                                                    }
                                                    var70 = Statics.field325;
                                                    break label1327;
                                                }
                                            }
                                            if (Statics.field241.field947 >= 0 && Statics.field241.field960 >= 0 && Statics.field241.field947 < 13312 && Statics.field241.field960 < 13312) {
                                                if ((class51.field487[Statics.field325][Statics.field241.field947 >> 7][Statics.field241.field960 >> 7] & 0x4) != 0) {
                                                    var71 = Statics.field325;
                                                }
                                                var70 = var71;
                                            } else {
                                                var70 = Statics.field325;
                                            }
                                        }
                                    }
                                    var82 = var70;
                                }
                                int var85 = Statics.field385;
                                int var86 = Statics.field2802;
                                int var87 = Statics.field3210;
                                int var88 = Statics.field3525;
                                int var89 = Statics.field1948;
                                for (int var90 = 0; var90 < 5; var90++) {
                                    if (field885[var90]) {
                                        int var91 = (int) (Math.random() * (double) (field825[var90] * 2 + 1) - (double) field825[var90] + Math.sin((double) field888[var90] / 100.0D * (double) field889[var90]) * (double) field909[var90]);
                                        if (var90 == 0) {
                                            Statics.field385 += var91;
                                        }
                                        if (var90 == 1) {
                                            Statics.field2802 += var91;
                                        }
                                        if (var90 == 2) {
                                            Statics.field3210 += var91;
                                        }
                                        if (var90 == 3) {
                                            Statics.field1948 = Statics.field1948 + var91 & 0x7FF;
                                        }
                                        if (var90 == 4) {
                                            Statics.field3525 += var91;
                                            if (Statics.field3525 < 128) {
                                                Statics.field3525 = 128;
                                            }
                                            if (Statics.field3525 > 383) {
                                                Statics.field3525 = 383;
                                            }
                                        }
                                    }
                                }
                                int var92 = class49.field466;
                                int var93 = class49.field468;
                                if (class49.field469 != 0) {
                                    var92 = class49.field475;
                                    var93 = class49.field478;
                                }
                                if (var92 >= var46 && var92 < var46 + var48 && var93 >= var47 && var93 < var47 + var49) {
                                    class123.method44(var92 - var46, var93 - var47);
                                } else {
                                    class123.method4202();
                                }
                                method4032();
                                class320.method5379(var46, var47, var48, var49, 0);
                                method4032();
                                int var94 = class125.field1756;
                                class125.field1756 = field876;
                                Statics.field3123.method2682(Statics.field385, Statics.field2802, Statics.field3210, Statics.field3525, Statics.field1948, var82);
                                class125.field1756 = var94;
                                method4032();
                                Statics.field3123.method2656();
                                field745 = 0;
                                boolean var95 = false;
                                int var96 = -1;
                                int var97 = -1;
                                int var98 = class84.field1212;
                                int[] var99 = class84.field1211;
                                for (int var100 = 0; var100 < field746 + var98; var100++) {
                                    class65 var101;
                                    if (var100 < var98) {
                                        var101 = field758[var99[var100]];
                                        if (field685 == var99[var100]) {
                                            var95 = true;
                                            var96 = var100;
                                            continue;
                                        }
                                        if (Statics.field241 == var101) {
                                            var97 = var100;
                                            continue;
                                        }
                                    } else {
                                        var101 = field684[field761[var100 - var98]];
                                    }
                                    method620(var101, var100, var46, var47, var48, var49);
                                }
                                if (field687 && var97 != -1) {
                                    method620(Statics.field241, var97, var46, var47, var48, var49);
                                }
                                if (var95) {
                                    method620(field758[field685], var96, var46, var47, var48, var49);
                                }
                                for (int var102 = 0; var102 < field745; var102++) {
                                    int var103 = field849[var102];
                                    int var104 = field808[var102];
                                    int var105 = field734[var102];
                                    int var106 = field899[var102];
                                    boolean var107 = true;
                                    while (var107) {
                                        var107 = false;
                                        for (int var108 = 0; var108 < var102; var108++) {
                                            if (var104 + 2 > field808[var108] - field899[var108] && var104 - var106 < field808[var108] + 2 && var103 - var105 < field849[var108] + field734[var108] && var103 + var105 > field849[var108] - field734[var108] && field808[var108] - field899[var108] < var104) {
                                                var104 = field808[var108] - field899[var108];
                                                var107 = true;
                                            }
                                        }
                                    }
                                    field728 = field849[var102];
                                    field742 = field808[var102] = var104;
                                    String var109 = field656[var102];
                                    if (field804 == 0) {
                                        int var110 = 16776960;
                                        if (field735[var102] < 6) {
                                            var110 = field826[field735[var102]];
                                        }
                                        if (field735[var102] == 6) {
                                            var110 = field740 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field735[var102] == 7) {
                                            var110 = field740 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field735[var102] == 8) {
                                            var110 = field740 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field735[var102] == 9) {
                                            int var111 = 150 - field737[var102];
                                            if (var111 < 50) {
                                                var110 = var111 * 1280 + 16711680;
                                            } else if (var111 < 100) {
                                                var110 = 16776960 - (var111 - 50) * 327680;
                                            } else if (var111 < 150) {
                                                var110 = (var111 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field735[var102] == 10) {
                                            int var112 = 150 - field737[var102];
                                            if (var112 < 50) {
                                                var110 = var112 * 5 + 16711680;
                                            } else if (var112 < 100) {
                                                var110 = 16711935 - (var112 - 50) * 327680;
                                            } else if (var112 < 150) {
                                                var110 = (var112 - 100) * 327680 + 255 - (var112 - 100) * 5;
                                            }
                                        }
                                        if (field735[var102] == 11) {
                                            int var113 = 150 - field737[var102];
                                            if (var113 < 50) {
                                                var110 = 16777215 - var113 * 327685;
                                            } else if (var113 < 100) {
                                                var110 = (var113 - 50) * 327685 + 65280;
                                            } else if (var113 < 150) {
                                                var110 = 16777215 - (var113 - 100) * 327680;
                                            }
                                        }
                                        if (field736[var102] == 0) {
                                            Statics.field1399.method5151(var109, field728 + var46, field742 + var47, var110, 0);
                                        }
                                        if (field736[var102] == 1) {
                                            Statics.field1399.method5153(var109, field728 + var46, field742 + var47, var110, 0, field740);
                                        }
                                        if (field736[var102] == 2) {
                                            Statics.field1399.method5154(var109, field728 + var46, field742 + var47, var110, 0, field740);
                                        }
                                        if (field736[var102] == 3) {
                                            Statics.field1399.method5201(var109, field728 + var46, field742 + var47, var110, 0, field740, 150 - field737[var102]);
                                        }
                                        if (field736[var102] == 4) {
                                            int var114 = (150 - field737[var102]) * (Statics.field1399.method5177(var109) + 100) / 150;
                                            class320.method5441(field728 + var46 - 50, var47, field728 + var46 + 50, var47 + var49);
                                            Statics.field1399.method5217(var109, field728 + var46 + 50 - var114, field742 + var47, var110, 0);
                                            class320.method5371(var46, var47, var46 + var48, var47 + var49);
                                        }
                                        if (field736[var102] == 5) {
                                            int var115 = 150 - field737[var102];
                                            int var116 = 0;
                                            if (var115 < 25) {
                                                var116 = var115 - 25;
                                            } else if (var115 > 125) {
                                                var116 = var115 - 125;
                                            }
                                            class320.method5441(var46, field742 + var47 - Statics.field1399.field3737 - 1, var46 + var48, field742 + var47 + 5);
                                            Statics.field1399.method5151(var109, field728 + var46, field742 + var47 + var116, var110, 0);
                                            class320.method5371(var46, var47, var46 + var48, var47 + var49);
                                        }
                                    } else {
                                        Statics.field1399.method5151(var109, field728 + var46, field742 + var47, 16776960, 0);
                                    }
                                }
                                if (field662 == 2) {
                                    method2837((field853 - Statics.field31 << 7) + field668, (field851 - Statics.field1241 << 7) + field669, field872 * 2);
                                    if (field728 > -1 && field654 % 20 < 10) {
                                        Statics.field510[0].method5491(field728 + var46 - 12, field742 + var47 - 28);
                                    }
                                }
                                ((class114) Statics.field1763).method2297(field665);
                                method978();
                                Statics.field385 = var85;
                                Statics.field2802 = var86;
                                Statics.field3210 = var87;
                                Statics.field3525 = var88;
                                Statics.field1948 = var89;
                                if (field653) {
                                    byte var117 = 0;
                                    int var118 = class253.field3233 + class253.field3231 + var117;
                                    if (var118 == 0) {
                                        field653 = false;
                                    }
                                }
                                if (field653) {
                                    class320.method5379(var46, var47, var48, var49, 0);
                                    method2396(class240.field2834, false);
                                }
                                field845[var10.field2763] = true;
                                class320.method5371(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2731 == 1338) {
                                method1449(var10, var12, var13, var11);
                                class320.method5371(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2731 == 1339) {
                                method5125(var10, var12, var13, var11);
                                class320.method5371(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2731 == 1400) {
                                Statics.field2589.method5674(var12, var13, var10.field2691, var10.field2740, field654);
                            }
                            if (var10.field2731 == 1401) {
                                Statics.field2589.method5712(var12, var13, var10.field2691, var10.field2740);
                            }
                        }
                        if (var10.field2620 == 0) {
                            if (!var10.field2710 && method30(var10) && Statics.field2585 != var10) {
                                continue;
                            }
                            if (!var10.field2710) {
                                if (var10.field2653 > var10.field2708 - var10.field2740) {
                                    var10.field2653 = var10.field2708 - var10.field2740;
                                }
                                if (var10.field2653 < 0) {
                                    var10.field2653 = 0;
                                }
                            }
                            method1814(arg0, var10.field2631, var19, var20, var21, var22, var12 - var10.field2712, var13 - var10.field2653, var11);
                            if (var10.field2756 != null) {
                                method1814(var10.field2756, var10.field2631, var19, var20, var21, var22, var12 - var10.field2712, var13 - var10.field2653, var11);
                            }
                            class57 var120 = (class57) field803.method3687((long) var10.field2631);
                            if (var120 != null) {
                                method3479(var120.field557, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class320.method5371(arg2, arg3, arg4, arg5);
                            class125.method2554();
                        }
                        if (field854 || field847[var11] || field852 > 1) {
                            if (var10.field2620 == 0 && !var10.field2710 && var10.field2708 > var10.field2740) {
                                int var121 = var10.field2691 + var12;
                                int var122 = var10.field2653;
                                int var123 = var10.field2740;
                                int var124 = var10.field2708;
                                Statics.field210[0].method5471(var121, var13);
                                Statics.field210[1].method5471(var121, var13 + var123 - 16);
                                class320.method5379(var121, var13 + 16, 16, var123 - 32, field705);
                                int var125 = (var123 - 32) * var123 / var124;
                                if (var125 < 8) {
                                    var125 = 8;
                                }
                                int var126 = (var123 - 32 - var125) * var122 / (var124 - var123);
                                class320.method5379(var121, var13 + 16 + var126, 16, var125, field810);
                                class320.method5414(var121, var13 + 16 + var126, var125, field708);
                                class320.method5414(var121 + 1, var13 + 16 + var126, var125, field708);
                                class320.method5385(var121, var13 + 16 + var126, 16, field708);
                                class320.method5385(var121, var13 + 17 + var126, 16, field708);
                                class320.method5414(var121 + 15, var13 + 16 + var126, var125, field707);
                                class320.method5414(var121 + 14, var13 + 17 + var126, var125 - 1, field707);
                                class320.method5385(var121, var13 + 15 + var126 + var125, 16, field707);
                                class320.method5385(var121 + 1, var13 + 14 + var126 + var125, 15, field707);
                            }
                            if (var10.field2620 != 1) {
                                if (var10.field2620 == 2) {
                                    int var127 = 0;
                                    for (int var128 = 0; var128 < var10.field2643; var128++) {
                                        for (int var129 = 0; var129 < var10.field2642; var129++) {
                                            int var130 = (var10.field2698 + 32) * var129 + var12;
                                            int var131 = (var10.field2699 + 32) * var128 + var13;
                                            if (var127 < 20) {
                                                var130 += var10.field2700[var127];
                                                var131 += var10.field2755[var127];
                                            }
                                            if (var10.field2750[var127] > 0) {
                                                boolean var132 = false;
                                                boolean var133 = false;
                                                int var134 = var10.field2750[var127] - 1;
                                                if (var130 + 32 > arg2 && var130 < arg4 && var131 + 32 > arg3 && var131 < arg5 || Statics.field2418 == var10 && field792 == var127) {
                                                    class324 var135;
                                                    if (field795 == 1 && Statics.field1243 == var127 && Statics.field2055 == var10.field2631) {
                                                        var135 = class272.method678(var134, var10.field2751[var127], 2, 0, 2, false);
                                                    } else {
                                                        var135 = class272.method678(var134, var10.field2751[var127], 1, 3153952, 2, false);
                                                    }
                                                    if (var135 == null) {
                                                        method481(var10);
                                                    } else if (Statics.field2418 == var10 && field792 == var127) {
                                                        int var136 = class49.field466 - field751;
                                                        int var137 = class49.field468 - field752;
                                                        if (var136 < 5 && var136 > -5) {
                                                            var136 = 0;
                                                        }
                                                        if (var137 < 5 && var137 > -5) {
                                                            var137 = 0;
                                                        }
                                                        if (field755 < 5) {
                                                            var136 = 0;
                                                            var137 = 0;
                                                        }
                                                        var135.method5497(var130 + var136, var131 + var137, 128);
                                                        if (arg1 != -1) {
                                                            class233 var138 = arg0[arg1 & 0xFFFF];
                                                            if (var131 + var137 < class320.field3826 && var138.field2653 > 0) {
                                                                int var139 = field665 * (class320.field3826 - var131 - var137) / 3;
                                                                if (var139 > field665 * 10) {
                                                                    var139 = field665 * 10;
                                                                }
                                                                if (var139 > var138.field2653) {
                                                                    var139 = var138.field2653;
                                                                }
                                                                var138.field2653 -= var139;
                                                                field752 += var139;
                                                                method481(var138);
                                                            }
                                                            if (var131 + var137 + 32 > class320.field3828 && var138.field2653 < var138.field2708 - var138.field2740) {
                                                                int var140 = field665 * (var131 + var137 + 32 - class320.field3828) / 3;
                                                                if (var140 > field665 * 10) {
                                                                    var140 = field665 * 10;
                                                                }
                                                                if (var140 > var138.field2708 - var138.field2740 - var138.field2653) {
                                                                    var140 = var138.field2708 - var138.field2740 - var138.field2653;
                                                                }
                                                                var138.field2653 += var140;
                                                                field752 -= var140;
                                                                method481(var138);
                                                            }
                                                        }
                                                    } else if (Statics.field54 == var10 && field749 == var127) {
                                                        var135.method5497(var130, var131, 128);
                                                    } else {
                                                        var135.method5491(var130, var131);
                                                    }
                                                }
                                            } else if (var10.field2702 != null && var127 < 20) {
                                                class324 var141 = var10.method4113(var127);
                                                if (var141 != null) {
                                                    var141.method5491(var130, var131);
                                                } else if (class233.field2645) {
                                                    method481(var10);
                                                }
                                            }
                                            var127++;
                                        }
                                    }
                                } else if (var10.field2620 == 3) {
                                    int var142;
                                    if (Statics.method1446(var10)) {
                                        var142 = var10.field2657;
                                        if (Statics.field2585 == var10 && var10.field2659 != 0) {
                                            var142 = var10.field2659;
                                        }
                                    } else {
                                        var142 = var10.field2656;
                                        if (Statics.field2585 == var10 && var10.field2730 != 0) {
                                            var142 = var10.field2730;
                                        }
                                    }
                                    if (var10.field2660) {
                                        switch(var10.field2661.field3839) {
                                            case 1:
                                                class320.method5380(var12, var13, var10.field2691, var10.field2740, var10.field2656, var10.field2657);
                                                break;
                                            case 2:
                                                class320.method5381(var12, var13, var10.field2691, var10.field2740, var10.field2656, var10.field2657, 255 - (var10.field2703 & 0xFF), 255 - (var10.field2663 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class320.method5379(var12, var13, var10.field2691, var10.field2740, var142);
                                                } else {
                                                    class320.method5384(var12, var13, var10.field2691, var10.field2740, var142, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class320.method5383(var12, var13, var10.field2691, var10.field2740, var142);
                                    } else {
                                        class320.method5397(var12, var13, var10.field2691, var10.field2740, var142, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2620 == 4) {
                                    class301 var143 = var10.method4124();
                                    if (var143 != null) {
                                        String var144 = var10.field2692;
                                        int var145;
                                        if (Statics.method1446(var10)) {
                                            var145 = var10.field2657;
                                            if (Statics.field2585 == var10 && var10.field2659 != 0) {
                                                var145 = var10.field2659;
                                            }
                                            if (var10.field2693.length() > 0) {
                                                var144 = var10.field2693;
                                            }
                                        } else {
                                            var145 = var10.field2656;
                                            if (Statics.field2585 == var10 && var10.field2730 != 0) {
                                                var145 = var10.field2730;
                                            }
                                        }
                                        if (var10.field2710 && var10.field2695 != -1) {
                                            class272 var146 = class272.method1730(var10.field2695);
                                            var144 = var146.field3480;
                                            if (var144 == null) {
                                                var144 = class240.field3056;
                                            }
                                            if ((var146.field3512 == 1 || var10.field2753 != 1) && var10.field2753 != -1) {
                                                var144 = class76.method676(16748608) + var144 + class76.field1102 + " " + 'x' + method3477(var10.field2753);
                                            }
                                        }
                                        if (field806 == var10) {
                                            var144 = class240.field2985;
                                            var145 = var10.field2656;
                                        }
                                        if (!var10.field2710) {
                                            var144 = method1068(var144, var10);
                                        }
                                        var143.method5152(var144, var12, var13, var10.field2691, var10.field2740, var145, var10.field2680 ? 0 : -1, var10.field2727, var10.field2701, var10.field2689);
                                    } else if (class233.field2645) {
                                        method481(var10);
                                    }
                                } else if (var10.field2620 == 5) {
                                    if (var10.field2710) {
                                        class324 var148;
                                        if (var10.field2695 == -1) {
                                            var148 = var10.method4111(false);
                                        } else {
                                            var148 = class272.method678(var10.field2695, var10.field2753, var10.field2697, var10.field2671, var10.field2690, false);
                                        }
                                        if (var148 != null) {
                                            int var149 = var148.field3855;
                                            int var150 = var148.field3857;
                                            if (var10.field2716) {
                                                class320.method5441(var12, var13, var10.field2691 + var12, var10.field2740 + var13);
                                                int var151 = (var10.field2691 + (var149 - 1)) / var149;
                                                int var152 = (var10.field2740 + (var150 - 1)) / var150;
                                                for (int var153 = 0; var153 < var151; var153++) {
                                                    for (int var154 = 0; var154 < var152; var154++) {
                                                        if (var10.field2668 != 0) {
                                                            var148.method5510(var149 / 2 + var149 * var153 + var12, var150 / 2 + var150 * var154 + var13, var10.field2668, 4096);
                                                        } else if (var14 == 0) {
                                                            var148.method5491(var149 * var153 + var12, var150 * var154 + var13);
                                                        } else {
                                                            var148.method5497(var149 * var153 + var12, var150 * var154 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class320.method5371(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var155 = var10.field2691 * 4096 / var149;
                                                if (var10.field2668 != 0) {
                                                    var148.method5510(var10.field2691 / 2 + var12, var10.field2740 / 2 + var13, var10.field2668, var155);
                                                } else if (var14 != 0) {
                                                    var148.method5539(var12, var13, var10.field2691, var10.field2740, 256 - (var14 & 0xFF));
                                                } else if (var10.field2691 == var149 && var10.field2740 == var150) {
                                                    var148.method5491(var12, var13);
                                                } else {
                                                    var148.method5493(var12, var13, var10.field2691, var10.field2740);
                                                }
                                            }
                                        } else if (class233.field2645) {
                                            method481(var10);
                                        }
                                    } else {
                                        class324 var147 = var10.method4111(Statics.method1446(var10));
                                        if (var147 != null) {
                                            var147.method5491(var12, var13);
                                        } else if (class233.field2645) {
                                            method481(var10);
                                        }
                                    }
                                } else if (var10.field2620 == 6) {
                                    boolean var156 = Statics.method1446(var10);
                                    int var157;
                                    if (var156) {
                                        var157 = var10.field2679;
                                    } else {
                                        var157 = var10.field2678;
                                    }
                                    class122 var158 = null;
                                    int var159 = 0;
                                    if (var10.field2695 != -1) {
                                        class272 var160 = class272.method1730(var10.field2695);
                                        if (var160 != null) {
                                            class272 var161 = var160.method4753(var10.field2753);
                                            var158 = var161.method4734(1);
                                            if (var158 == null) {
                                                method481(var10);
                                            } else {
                                                var158.method2496();
                                                var159 = var158.field1849 / 2;
                                            }
                                        }
                                    } else if (var10.field2674 == 5) {
                                        if (var10.field2675 == 0) {
                                            var158 = field903.method4080((class276) null, -1, (class276) null, -1);
                                        } else {
                                            var158 = Statics.field241.method1063();
                                        }
                                    } else if (var157 == -1) {
                                        var158 = var10.method4114((class276) null, -1, var156, Statics.field241.field624);
                                        if (var158 == null && class233.field2645) {
                                            method481(var10);
                                        }
                                    } else {
                                        class276 var162 = class276.method2826(var157);
                                        var158 = var10.method4114(var162, var10.field2754, var156, Statics.field241.field624);
                                        if (var158 == null && class233.field2645) {
                                            method481(var10);
                                        }
                                    }
                                    class125.method2618(var10.field2691 / 2 + var12, var10.field2740 / 2 + var13);
                                    int var163 = var10.field2758 * class125.field1766[var10.field2682] >> 16;
                                    int var164 = var10.field2758 * class125.field1741[var10.field2682] >> 16;
                                    if (var158 != null) {
                                        if (var10.field2710) {
                                            var158.method2496();
                                            if (var10.field2688) {
                                                var158.method2503(0, var10.field2683, var10.field2684, var10.field2682, var10.field2722, var10.field2681 + var159 + var163, var10.field2681 + var164, var10.field2758);
                                            } else {
                                                var158.method2484(0, var10.field2683, var10.field2684, var10.field2682, var10.field2722, var10.field2681 + var159 + var163, var10.field2681 + var164);
                                            }
                                        } else {
                                            var158.method2484(0, var10.field2683, 0, var10.field2682, 0, var163, var164);
                                        }
                                    }
                                    class125.method2556();
                                } else {
                                    if (var10.field2620 == 7) {
                                        class301 var165 = var10.method4124();
                                        if (var165 == null) {
                                            if (class233.field2645) {
                                                method481(var10);
                                            }
                                            continue;
                                        }
                                        int var166 = 0;
                                        for (int var167 = 0; var167 < var10.field2643; var167++) {
                                            for (int var168 = 0; var168 < var10.field2642; var168++) {
                                                if (var10.field2750[var166] > 0) {
                                                    class272 var169 = class272.method1730(var10.field2750[var166] - 1);
                                                    String var170;
                                                    if (var169.field3512 != 1 && var10.field2751[var166] == 1) {
                                                        var170 = class76.method676(16748608) + var169.field3480 + class76.field1102;
                                                    } else {
                                                        var170 = class76.method676(16748608) + var169.field3480 + class76.field1102 + " " + 'x' + method3477(var10.field2751[var166]);
                                                    }
                                                    int var171 = (var10.field2698 + 115) * var168 + var12;
                                                    int var172 = (var10.field2699 + 12) * var167 + var13;
                                                    if (var10.field2727 == 0) {
                                                        var165.method5217(var170, var171, var172, var10.field2656, var10.field2680 ? 0 : -1);
                                                    } else if (var10.field2727 == 1) {
                                                        var165.method5151(var170, var10.field2691 / 2 + var171, var172, var10.field2656, var10.field2680 ? 0 : -1);
                                                    } else {
                                                        var165.method5180(var170, var10.field2691 + var171 - 1, var172, var10.field2656, var10.field2680 ? 0 : -1);
                                                    }
                                                }
                                                var166++;
                                            }
                                        }
                                    }
                                    if (var10.field2620 == 8 && Statics.field1927 == var10 && field865 == field794) {
                                        int var173 = 0;
                                        int var174 = 0;
                                        class301 var175 = Statics.field209;
                                        String var176 = var10.field2692;
                                        String var177 = method1068(var176, var10);
                                        while (var177.length() > 0) {
                                            int var178 = var177.indexOf(class76.field1103);
                                            String var179;
                                            if (var178 == -1) {
                                                var179 = var177;
                                                var177 = "";
                                            } else {
                                                var179 = var177.substring(0, var178);
                                                var177 = var177.substring(var178 + 4);
                                            }
                                            int var180 = var175.method5177(var179);
                                            if (var180 > var173) {
                                                var173 = var180;
                                            }
                                            var174 += var175.field3737 + 1;
                                        }
                                        var173 += 6;
                                        var174 += 7;
                                        int var181 = var10.field2691 + var12 - 5 - var173;
                                        int var182 = var10.field2740 + var13 + 5;
                                        if (var181 < var12 + 5) {
                                            var181 = var12 + 5;
                                        }
                                        if (var173 + var181 > arg4) {
                                            var181 = arg4 - var173;
                                        }
                                        if (var174 + var182 > arg5) {
                                            var182 = arg5 - var174;
                                        }
                                        class320.method5379(var181, var182, var173, var174, 16777120);
                                        class320.method5383(var181, var182, var173, var174, 0);
                                        String var183 = var10.field2692;
                                        int var184 = var175.field3737 + var182 + 2;
                                        String var185 = method1068(var183, var10);
                                        while (var185.length() > 0) {
                                            int var186 = var185.indexOf(class76.field1103);
                                            String var187;
                                            if (var186 == -1) {
                                                var187 = var185;
                                                var185 = "";
                                            } else {
                                                var187 = var185.substring(0, var186);
                                                var185 = var185.substring(var186 + 4);
                                            }
                                            var175.method5217(var187, var181 + 3, var184, 0, -1);
                                            var184 += var175.field3737 + 1;
                                        }
                                    }
                                    if (var10.field2620 == 9) {
                                        int var188;
                                        int var189;
                                        int var190;
                                        int var191;
                                        if (var10.field2665) {
                                            var188 = var12;
                                            var189 = var10.field2740 + var13;
                                            var190 = var10.field2691 + var12;
                                            var191 = var13;
                                        } else {
                                            var188 = var12;
                                            var189 = var13;
                                            var190 = var10.field2691 + var12;
                                            var191 = var10.field2740 + var13;
                                        }
                                        if (var10.field2664 == 1) {
                                            class320.method5389(var188, var189, var190, var191, var10.field2656);
                                        } else {
                                            int var194 = var10.field2656;
                                            int var195 = var10.field2664;
                                            int var196 = var190 - var188;
                                            int var197 = var191 - var189;
                                            int var198 = var196 >= 0 ? var196 : -var196;
                                            int var199 = var197 >= 0 ? var197 : -var197;
                                            int var200 = var198;
                                            if (var198 < var199) {
                                                var200 = var199;
                                            }
                                            if (var200 != 0) {
                                                int var201 = (var196 << 16) / var200;
                                                int var202 = (var197 << 16) / var200;
                                                if (var202 <= var201) {
                                                    var201 = -var201;
                                                } else {
                                                    var202 = -var202;
                                                }
                                                int var203 = var195 * var202 >> 17;
                                                int var204 = var195 * var202 + 1 >> 17;
                                                int var205 = var195 * var201 >> 17;
                                                int var206 = var195 * var201 + 1 >> 17;
                                                int var207 = var188 - class320.field3829;
                                                int var208 = var189 - class320.field3826;
                                                int var209 = var203 + var207;
                                                int var210 = var207 - var204;
                                                int var211 = var196 + var207 - var204;
                                                int var212 = var196 + var207 + var203;
                                                int var213 = var205 + var208;
                                                int var214 = var208 - var206;
                                                int var215 = var197 + var208 - var206;
                                                int var216 = var197 + var208 + var205;
                                                class125.method2561(var209, var210, var211);
                                                class125.method2572(var213, var214, var215, var209, var210, var211, var194);
                                                class125.method2561(var209, var211, var212);
                                                class125.method2572(var213, var215, var216, var209, var211, var212, var194);
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

    @ObfuscatedName("bb.ir(Ljava/lang/String;Lhv;B)Ljava/lang/String;")
    public static String method1068(String arg0, class233 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method4193(method617(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("gl.iw(II)Ljava/lang/String;")
    public static final String method3477(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field1101 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method676(65408) + var1.substring(0, var1.length() - 8) + class240.field2988 + " " + class76.field1104 + var1 + class76.field1105 + class76.field1102;
        } else if (var1.length() > 6) {
            return " " + class76.method676(16777215) + var1.substring(0, var1.length() - 4) + class240.field3042 + " " + class76.field1104 + var1 + class76.field1105 + class76.field1102;
        } else {
            return " " + class76.method676(16776960) + var1 + class76.field1102;
        }
    }

    @ObfuscatedName("client.ik(ZI)V")
    public final void method1395(boolean arg0) {
        method1670(field802, Statics.field1983, Statics.field42, arg0);
    }

    @ObfuscatedName("client.ip(Lhv;I)V")
    public void method1135(class233 arg0) {
        class233 var2 = arg0.field2737 == -1 ? null : class233.method575(arg0.field2737);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1983;
            var4 = Statics.field42;
        } else {
            var3 = var2.field2691;
            var4 = var2.field2740;
        }
        method4915(arg0, var3, var4, false);
        method2079(arg0, var3, var4);
    }

    @ObfuscatedName("em.ix([Lhv;Lhv;ZI)V")
    public static void method2957(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2709 == 0 ? arg1.field2691 : arg1.field2709;
        int var4 = arg1.field2708 == 0 ? arg1.field2740 : arg1.field2708;
        method4014(arg0, arg1.field2631, var3, var4, arg2);
        if (arg1.field2756 != null) {
            method4014(arg1.field2756, arg1.field2631, var3, var4, arg2);
        }
        class57 var5 = (class57) field803.method3687((long) arg1.field2631);
        if (var5 != null) {
            method1670(var5.field557, var3, var4, arg2);
        }
        if (arg1.field2731 == 1337) {
        }
    }

    @ObfuscatedName("bc.iy(IIIZI)V")
    public static final void method1670(int arg0, int arg1, int arg2, boolean arg3) {
        if (class233.method91(arg0)) {
            method4014(Statics.field2622[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hx.io([Lhv;IIIZI)V")
    public static void method4014(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2737 == arg1) {
                method4915(var6, arg2, arg3, arg4);
                method2079(var6, arg2, arg3);
                if (var6.field2712 > var6.field2709 - var6.field2691) {
                    var6.field2712 = var6.field2709 - var6.field2691;
                }
                if (var6.field2712 < 0) {
                    var6.field2712 = 0;
                }
                if (var6.field2653 > var6.field2708 - var6.field2740) {
                    var6.field2653 = var6.field2708 - var6.field2740;
                }
                if (var6.field2653 < 0) {
                    var6.field2653 = 0;
                }
                if (var6.field2620 == 0) {
                    method2957(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("jy.ih(Lhv;IIZB)V")
    public static void method4915(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2691;
        int var5 = arg0.field2740;
        if (arg0.field2638 == 0) {
            arg0.field2691 = arg0.field2642;
        } else if (arg0.field2638 == 1) {
            arg0.field2691 = arg1 - arg0.field2642;
        } else if (arg0.field2638 == 2) {
            arg0.field2691 = arg0.field2642 * arg1 >> 14;
        }
        if (arg0.field2639 == 0) {
            arg0.field2740 = arg0.field2643;
        } else if (arg0.field2639 == 1) {
            arg0.field2740 = arg2 - arg0.field2643;
        } else if (arg0.field2639 == 2) {
            arg0.field2740 = arg0.field2643 * arg2 >> 14;
        }
        if (arg0.field2638 == 4) {
            arg0.field2691 = arg0.field2740 * arg0.field2648 / arg0.field2649;
        }
        if (arg0.field2639 == 4) {
            arg0.field2740 = arg0.field2691 * arg0.field2649 / arg0.field2648;
        }
        if (arg0.field2731 == 1337) {
            field812 = arg0;
        }
        if (arg3 && arg0.field2741 != null && (arg0.field2691 != var4 || arg0.field2740 != var5)) {
            class58 var6 = new class58();
            var6.field562 = arg0;
            var6.field574 = arg0.field2741;
            field839.method3740(var6);
        }
    }

    @ObfuscatedName("di.ic(Lhv;III)V")
    public static void method2079(class233 arg0, int arg1, int arg2) {
        if (arg0.field2636 == 0) {
            arg0.field2759 = arg0.field2640;
        } else if (arg0.field2636 == 1) {
            arg0.field2759 = (arg1 - arg0.field2691) / 2 + arg0.field2640;
        } else if (arg0.field2636 == 2) {
            arg0.field2759 = arg1 - arg0.field2691 - arg0.field2640;
        } else if (arg0.field2636 == 3) {
            arg0.field2759 = arg0.field2640 * arg1 >> 14;
        } else if (arg0.field2636 == 4) {
            arg0.field2759 = (arg0.field2640 * arg1 >> 14) + (arg1 - arg0.field2691) / 2;
        } else {
            arg0.field2759 = arg1 - arg0.field2691 - (arg0.field2640 * arg1 >> 14);
        }
        if (arg0.field2637 == 0) {
            arg0.field2650 = arg0.field2752;
        } else if (arg0.field2637 == 1) {
            arg0.field2650 = (arg2 - arg0.field2740) / 2 + arg0.field2752;
        } else if (arg0.field2637 == 2) {
            arg0.field2650 = arg2 - arg0.field2740 - arg0.field2752;
        } else if (arg0.field2637 == 3) {
            arg0.field2650 = arg0.field2752 * arg2 >> 14;
        } else if (arg0.field2637 == 4) {
            arg0.field2650 = (arg0.field2752 * arg2 >> 14) + (arg2 - arg0.field2740) / 2;
        } else {
            arg0.field2650 = arg2 - arg0.field2740 - (arg0.field2752 * arg2 >> 14);
        }
    }

    @ObfuscatedName("iw.iz(II)Ljava/lang/String;")
    public static final String method4193(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ac.ij(Lhv;II)I")
    public static final int method617(class233 arg0, int arg1) {
        if (arg0.field2744 == null || arg1 >= arg0.field2744.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2744[arg1];
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
                    var7 = field774[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field723[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field776[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class233 var11 = class233.method575(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class272.method1730(var12).field3493 || field647)) {
                        for (int var13 = 0; var13 < var11.field2750.length; var13++) {
                            if (var12 + 1 == var11.field2750[var13]) {
                                var7 += var11.field2751[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class228.field2596[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class237.field2805[field723[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class228.field2596[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field241.field613;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class237.field2804[var14]) {
                            var7 += field723[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class233 var17 = class233.method575(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class272.method1730(var18).field3493 || field647)) {
                        for (int var19 = 0; var19 < var17.field2750.length; var19++) {
                            if (var18 + 1 == var17.field2750[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field674;
                }
                if (var6 == 12) {
                    var7 = field871;
                }
                if (var6 == 13) {
                    int var20 = class228.field2596[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class228.method1611(var22);
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
                    var7 = (Statics.field241.field947 >> 7) + Statics.field31;
                }
                if (var6 == 19) {
                    var7 = (Statics.field241.field960 >> 7) + Statics.field1241;
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

    @ObfuscatedName("q.il(Lhv;Ljz;IIZI)V")
    public static final void method19(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3503;
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
            var7 = class240.field2825;
        }
        if (var6 != -1 && var7 != null) {
            method661(var7, class76.method676(16748608) + arg1.field3480, var6, arg1.field3478, arg2, arg0.field2631, arg4);
        }
    }

    @ObfuscatedName("ah.iq(Lhv;III)V")
    public static final void method541(class233 arg0, int arg1, int arg2) {
        if (arg0.field2634 == 1) {
            method456(arg0.field2749, "", 24, 0, 0, arg0.field2631);
        }
        if (arg0.field2634 == 2 && !field886) {
            String var3;
            if (class234.method5127(method5092(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2711 == null || arg0.field2711.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2711;
            }
            if (var3 != null) {
                method456(var3, class76.method676(65280) + arg0.field2748, 25, 0, -1, arg0.field2631);
            }
        }
        if (arg0.field2634 == 3) {
            method456(class240.field2986, "", 26, 0, 0, arg0.field2631);
        }
        if (arg0.field2634 == 4) {
            method456(arg0.field2749, "", 28, 0, 0, arg0.field2631);
        }
        if (arg0.field2634 == 5) {
            method456(arg0.field2749, "", 29, 0, 0, arg0.field2631);
        }
        if (arg0.field2634 == 6 && field806 == null) {
            method456(arg0.field2749, "", 30, 0, -1, arg0.field2631);
        }
        if (arg0.field2620 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2740; var6++) {
                for (int var7 = 0; var7 < arg0.field2691; var7++) {
                    int var8 = (arg0.field2698 + 32) * var7;
                    int var9 = (arg0.field2699 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2700[var5];
                        var9 += arg0.field2755[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field731 = var5;
                        Statics.field1090 = arg0;
                        if (arg0.field2750[var5] > 0) {
                            label301: {
                                class272 var10 = class272.method1730(arg0.field2750[var5] - 1);
                                if (field795 == 1) {
                                    int var11 = method5092(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field2055 != arg0.field2631 || Statics.field1243 != var5) {
                                            method456(class240.field2977, field796 + " " + class76.field1106 + " " + class76.method676(16748608) + var10.field3480, 31, var10.field3478, var5, arg0.field2631);
                                        }
                                        break label301;
                                    }
                                }
                                if (field886) {
                                    int var13 = method5092(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field396 & 0x10) == 16) {
                                            method456(field800, field801 + " " + class76.field1106 + " " + class76.method676(16748608) + var10.field3480, 32, var10.field3478, var5, arg0.field2631);
                                        }
                                        break label301;
                                    }
                                }
                                String[] var15 = var10.field3503;
                                int var16 = -1;
                                if (field788) {
                                    boolean var17 = field789 || class40.field363[81];
                                    if (var17) {
                                        var16 = var10.method4742();
                                    }
                                }
                                int var18 = method5092(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 4; var20 >= 3; var20--) {
                                        if (var16 != var20) {
                                            method19(arg0, var10, var5, var20, false);
                                        }
                                    }
                                }
                                int var21 = method5092(arg0);
                                boolean var22 = (var21 >> 31 & 0x1) != 0;
                                if (var22) {
                                    method456(class240.field2977, class76.method676(16748608) + var10.field3480, 38, var10.field3478, var5, arg0.field2631);
                                }
                                int var23 = method5092(arg0);
                                boolean var24 = (var23 >> 30 & 0x1) != 0;
                                if (var24) {
                                    for (int var25 = 2; var25 >= 0; var25--) {
                                        if (var16 != var25) {
                                            method19(arg0, var10, var5, var25, false);
                                        }
                                    }
                                    if (var16 >= 0) {
                                        method19(arg0, var10, var5, var16, true);
                                    }
                                }
                                String[] var26 = arg0.field2766;
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method456(var26[var27], class76.method676(16748608) + var10.field3480, var28, var10.field3478, var5, arg0.field2631);
                                        }
                                    }
                                }
                                method456(class240.field2978, class76.method676(16748608) + var10.field3480, 1005, var10.field3478, var5, arg0.field2631);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2710) {
            return;
        }
        if (!field886) {
            for (int var29 = 9; var29 >= 5; var29--) {
                String var30 = method2400(arg0, var29);
                if (var30 != null) {
                    method456(var30, arg0.field2705, 1007, var29 + 1, arg0.field2632, arg0.field2631);
                }
            }
            String var31;
            if (class234.method5127(method5092(arg0)) == 0) {
                var31 = null;
            } else if (arg0.field2711 == null || arg0.field2711.trim().length() == 0) {
                var31 = null;
            } else {
                var31 = arg0.field2711;
            }
            if (var31 != null) {
                method456(var31, arg0.field2705, 25, 0, arg0.field2632, arg0.field2631);
            }
            for (int var33 = 4; var33 >= 0; var33--) {
                String var34 = method2400(arg0, var33);
                if (var34 != null) {
                    method456(var34, arg0.field2705, 57, var33 + 1, arg0.field2632, arg0.field2631);
                }
            }
            if (class234.method3057(method5092(arg0))) {
                method456(class240.field2829, "", 30, 0, arg0.field2632, arg0.field2631);
            }
        } else if (class234.method1022(method5092(arg0)) && (Statics.field396 & 0x20) == 32) {
            method456(field800, field801 + " " + class76.field1106 + " " + arg0.field2705, 58, 0, arg0.field2632, arg0.field2631);
        }
    }

    @ObfuscatedName("gj.iu(IIIIIIII)V")
    public static final void method3555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class233.method91(arg0)) {
            method2913(Statics.field2622[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ef.ig([Lhv;IIIIIIII)V")
    public static final void method2913(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && var9.field2737 == arg1 && (!var9.field2710 || var9.field2620 == 0 || var9.field2677 || method5092(var9) != 0 || field814 == var9 || var9.field2731 == 1338)) {
                if (var9.field2710) {
                    if (method30(var9)) {
                        continue;
                    }
                } else if (var9.field2620 == 0 && Statics.field2585 != var9 && method30(var9)) {
                    continue;
                }
                int var10 = var9.field2759 + arg6;
                int var11 = var9.field2650 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2620 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2620 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2691 + var10;
                    int var19 = var9.field2740 + var11;
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
                    int var22 = var9.field2691 + var10;
                    int var23 = var9.field2740 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field719 == var9) {
                    field843 = true;
                    field775 = var10;
                    field823 = var11;
                }
                if (!var9.field2710 || var12 < var14 && var13 < var15) {
                    if (var9.field2710) {
                        if (var9.field2765) {
                            if (class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15) {
                                for (class58 var24 = (class58) field839.method3746(); var24 != null; var24 = (class58) field839.method3747()) {
                                    if (var24.field565) {
                                        var24.method3733();
                                        var24.field562.field2757 = false;
                                    }
                                }
                                if (Statics.field324 == 0) {
                                    field719 = null;
                                    field814 = null;
                                }
                                if (!field750) {
                                    method974();
                                }
                            }
                        } else if (var9.field2733 && class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15) {
                            for (class58 var25 = (class58) field839.method3746(); var25 != null; var25 = (class58) field839.method3747()) {
                                if (var25.field565 && var25.field562.field2626 == var25.field574) {
                                    var25.method3733();
                                }
                            }
                        }
                    }
                    int var26 = class49.field466;
                    int var27 = class49.field468;
                    if (class49.field469 != 0) {
                        var26 = class49.field475;
                        var27 = class49.field478;
                    }
                    boolean var28 = var26 >= var12 && var27 >= var13 && var26 < var14 && var27 < var15;
                    if (var9.field2731 == 1337) {
                        if (!field653 && !field750 && var28) {
                            if (field795 == 0 && !field886) {
                                method456(class240.field2852, "", 23, 0, var26 - var12, var27 - var13);
                            }
                            long var29 = -1L;
                            long var31 = -1L;
                            int var33 = 0;
                            while (true) {
                                int var35 = class123.field1717;
                                if (var33 >= var35) {
                                    if (var29 != -1L) {
                                        int var36 = class123.method2285(var29);
                                        int var37 = class123.method618(var29);
                                        class62 var38 = field758[field685];
                                        method1668(var38, field685, var36, var37);
                                    }
                                    break;
                                }
                                long var39 = class123.method3127(var33);
                                if (var31 != var39) {
                                    label998: {
                                        var31 = var39;
                                        int var41 = class123.method2285(class123.field1728[var33]);
                                        int var42 = var41;
                                        int var43 = class123.method2551(var33);
                                        long var44 = class123.field1728[var33];
                                        int var46 = (int) (var44 >>> 14 & 0x3L);
                                        int var49 = class123.method2261(class123.field1728[var33]);
                                        int var50 = var49;
                                        if (var46 == 2 && Statics.field3123.method2672(Statics.field325, var41, var43, var39) >= 0) {
                                            class271 var51 = class271.method2839(var49);
                                            if (var51.field3457 != null) {
                                                var51 = var51.method4668();
                                            }
                                            if (var51 == null) {
                                                break label998;
                                            }
                                            if (field795 == 1) {
                                                method456(class240.field2977, field796 + " " + class76.field1106 + " " + class76.method676(65535) + var51.field3426, 1, var49, var41, var43);
                                            } else if (!field886) {
                                                String[] var52 = var51.field3443;
                                                if (var52 != null) {
                                                    for (int var53 = 4; var53 >= 0; var53--) {
                                                        if (var52[var53] != null) {
                                                            short var54 = 0;
                                                            if (var53 == 0) {
                                                                var54 = 3;
                                                            }
                                                            if (var53 == 1) {
                                                                var54 = 4;
                                                            }
                                                            if (var53 == 2) {
                                                                var54 = 5;
                                                            }
                                                            if (var53 == 3) {
                                                                var54 = 6;
                                                            }
                                                            if (var53 == 4) {
                                                                var54 = 1001;
                                                            }
                                                            method456(var52[var53], class76.method676(65535) + var51.field3426, var54, var50, var42, var43);
                                                        }
                                                    }
                                                }
                                                method456(class240.field2978, class76.method676(65535) + var51.field3426, 1002, var51.field3461, var42, var43);
                                            } else if ((Statics.field396 & 0x4) == 4) {
                                                method456(field800, field801 + " " + class76.field1106 + " " + class76.method676(65535) + var51.field3426, 2, var49, var41, var43);
                                            }
                                        }
                                        if (var46 == 1) {
                                            class74 var55 = field684[var50];
                                            if (var55 == null) {
                                                break label998;
                                            }
                                            if (var55.field1089.field3539 == 1 && (var55.field947 & 0x7F) == 64 && (var55.field960 & 0x7F) == 64) {
                                                for (int var56 = 0; var56 < field746; var56++) {
                                                    class74 var57 = field684[field761[var56]];
                                                    if (var57 != null && var55 != var57 && var57.field1089.field3539 == 1 && var55.field947 == var57.field947 && var55.field960 == var57.field960) {
                                                        method2547(var57.field1089, field761[var56], var42, var43);
                                                    }
                                                }
                                                int var58 = class84.field1212;
                                                int[] var59 = class84.field1211;
                                                for (int var60 = 0; var60 < var58; var60++) {
                                                    class62 var61 = field758[var59[var60]];
                                                    if (var61 != null && var55.field947 == var61.field947 && var55.field960 == var61.field960) {
                                                        method1668(var61, var59[var60], var42, var43);
                                                    }
                                                }
                                            }
                                            method2547(var55.field1089, var50, var42, var43);
                                        }
                                        if (var46 == 0) {
                                            class62 var62 = field758[var50];
                                            if (var62 == null) {
                                                break label998;
                                            }
                                            if ((var62.field947 & 0x7F) == 64 && (var62.field960 & 0x7F) == 64) {
                                                for (int var63 = 0; var63 < field746; var63++) {
                                                    class74 var64 = field684[field761[var63]];
                                                    if (var64 != null && var64.field1089.field3539 == 1 && var62.field947 == var64.field947 && var62.field960 == var64.field960) {
                                                        method2547(var64.field1089, field761[var63], var42, var43);
                                                    }
                                                }
                                                int var65 = class84.field1212;
                                                int[] var66 = class84.field1211;
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    class62 var68 = field758[var66[var67]];
                                                    if (var68 != null && var62 != var68 && var62.field947 == var68.field947 && var62.field960 == var68.field960) {
                                                        method1668(var68, var66[var67], var42, var43);
                                                    }
                                                }
                                            }
                                            if (field685 == var50) {
                                                var29 = var39;
                                            } else {
                                                method1668(var62, var50, var42, var43);
                                            }
                                        }
                                        if (var46 == 3) {
                                            class208 var69 = field700[Statics.field325][var42][var43];
                                            if (var69 != null) {
                                                for (class82 var70 = (class82) var69.method3738(); var70 != null; var70 = (class82) var69.method3745()) {
                                                    class272 var71 = class272.method1730(var70.field1199);
                                                    if (field795 == 1) {
                                                        method456(class240.field2977, field796 + " " + class76.field1106 + " " + class76.method676(16748608) + var71.field3480, 16, var70.field1199, var42, var43);
                                                    } else if (!field886) {
                                                        String[] var72 = var71.field3520;
                                                        for (int var73 = 4; var73 >= 0; var73--) {
                                                            if (var72 != null && var72[var73] != null) {
                                                                byte var74 = 0;
                                                                if (var73 == 0) {
                                                                    var74 = 18;
                                                                }
                                                                if (var73 == 1) {
                                                                    var74 = 19;
                                                                }
                                                                if (var73 == 2) {
                                                                    var74 = 20;
                                                                }
                                                                if (var73 == 3) {
                                                                    var74 = 21;
                                                                }
                                                                if (var73 == 4) {
                                                                    var74 = 22;
                                                                }
                                                                method456(var72[var73], class76.method676(16748608) + var71.field3480, var74, var70.field1199, var42, var43);
                                                            } else if (var73 == 2) {
                                                                method456(class240.field2824, class76.method676(16748608) + var71.field3480, 20, var70.field1199, var42, var43);
                                                            }
                                                        }
                                                        method456(class240.field2978, class76.method676(16748608) + var71.field3480, 1004, var70.field1199, var42, var43);
                                                    } else if ((Statics.field396 & 0x1) == 1) {
                                                        method456(field800, field801 + " " + class76.field1106 + " " + class76.method676(16748608) + var71.field3480, 17, var70.field1199, var42, var43);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                var33++;
                            }
                        }
                    } else if (var9.field2731 == 1338) {
                        method120(var9, var10, var11);
                    } else {
                        if (var9.field2731 == 1400) {
                            Statics.field2589.method5657(class49.field466, class49.field468, var28, var10, var11, var9.field2691, var9.field2740);
                        }
                        if (!field750 && var28) {
                            if (var9.field2731 == 1400) {
                                Statics.field2589.method5708(var10, var11, var9.field2691, var9.field2740, var26, var27);
                            } else {
                                method541(var9, var26 - var10, var27 - var11);
                            }
                        }
                        if (var9.field2710) {
                            boolean var75;
                            if (class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15) {
                                var75 = true;
                            } else {
                                var75 = false;
                            }
                            boolean var76 = false;
                            if ((class49.field461 == 1 || !Statics.field1393 && class49.field461 == 4) && var75) {
                                var76 = true;
                            }
                            boolean var77 = false;
                            if ((class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4) && class49.field475 >= var12 && class49.field478 >= var13 && class49.field475 < var14 && class49.field478 < var15) {
                                var77 = true;
                            }
                            if (var77) {
                                method483(var9, class49.field475 - var10, class49.field478 - var11);
                            }
                            if (var9.field2731 == 1400) {
                                Statics.field2589.method5658(var26, var27, var75 & var76, var75 & var77);
                            }
                            if (field719 != null && field719 != var9 && var75) {
                                int var78 = method5092(var9);
                                boolean var79 = (var78 >> 20 & 0x1) != 0;
                                if (var79) {
                                    field817 = var9;
                                }
                            }
                            if (field814 == var9) {
                                field818 = true;
                                field819 = var10;
                                field820 = var11;
                            }
                            if (var9.field2677) {
                                if (var75 && field778 != 0 && var9.field2626 != null) {
                                    class58 var80 = new class58();
                                    var80.field565 = true;
                                    var80.field562 = var9;
                                    var80.field579 = field778;
                                    var80.field574 = var9.field2626;
                                    field839.method3740(var80);
                                }
                                if (field719 != null || Statics.field2418 != null || field750) {
                                    var77 = false;
                                    var76 = false;
                                    var75 = false;
                                }
                                if (!var9.field2694 && var77) {
                                    var9.field2694 = true;
                                    if (var9.field2714 != null) {
                                        class58 var81 = new class58();
                                        var81.field565 = true;
                                        var81.field562 = var9;
                                        var81.field563 = class49.field475 - var10;
                                        var81.field579 = class49.field478 - var11;
                                        var81.field574 = var9.field2714;
                                        field839.method3740(var81);
                                    }
                                }
                                if (var9.field2694 && var76 && var9.field2715 != null) {
                                    class58 var82 = new class58();
                                    var82.field565 = true;
                                    var82.field562 = var9;
                                    var82.field563 = class49.field466 - var10;
                                    var82.field579 = class49.field468 - var11;
                                    var82.field574 = var9.field2715;
                                    field839.method3740(var82);
                                }
                                if (var9.field2694 && !var76) {
                                    var9.field2694 = false;
                                    if (var9.field2738 != null) {
                                        class58 var83 = new class58();
                                        var83.field565 = true;
                                        var83.field562 = var9;
                                        var83.field563 = class49.field466 - var10;
                                        var83.field579 = class49.field468 - var11;
                                        var83.field574 = var9.field2738;
                                        field841.method3740(var83);
                                    }
                                }
                                if (var76 && var9.field2717 != null) {
                                    class58 var84 = new class58();
                                    var84.field565 = true;
                                    var84.field562 = var9;
                                    var84.field563 = class49.field466 - var10;
                                    var84.field579 = class49.field468 - var11;
                                    var84.field574 = var9.field2717;
                                    field839.method3740(var84);
                                }
                                if (!var9.field2757 && var75) {
                                    var9.field2757 = true;
                                    if (var9.field2658 != null) {
                                        class58 var85 = new class58();
                                        var85.field565 = true;
                                        var85.field562 = var9;
                                        var85.field563 = class49.field466 - var10;
                                        var85.field579 = class49.field468 - var11;
                                        var85.field574 = var9.field2658;
                                        field839.method3740(var85);
                                    }
                                }
                                if (var9.field2757 && var75 && var9.field2719 != null) {
                                    class58 var86 = new class58();
                                    var86.field565 = true;
                                    var86.field562 = var9;
                                    var86.field563 = class49.field466 - var10;
                                    var86.field579 = class49.field468 - var11;
                                    var86.field574 = var9.field2719;
                                    field839.method3740(var86);
                                }
                                if (var9.field2757 && !var75) {
                                    var9.field2757 = false;
                                    if (var9.field2720 != null) {
                                        class58 var87 = new class58();
                                        var87.field565 = true;
                                        var87.field562 = var9;
                                        var87.field563 = class49.field466 - var10;
                                        var87.field579 = class49.field468 - var11;
                                        var87.field574 = var9.field2720;
                                        field841.method3740(var87);
                                    }
                                }
                                if (var9.field2704 != null) {
                                    class58 var88 = new class58();
                                    var88.field562 = var9;
                                    var88.field574 = var9.field2704;
                                    field807.method3740(var88);
                                }
                                if (var9.field2725 != null && field827 > var9.field2760) {
                                    if (var9.field2726 == null || field827 - var9.field2760 > 32) {
                                        class58 var93 = new class58();
                                        var93.field562 = var9;
                                        var93.field574 = var9.field2725;
                                        field839.method3740(var93);
                                    } else {
                                        label839: for (int var89 = var9.field2760; var89 < field827; var89++) {
                                            int var90 = field757[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2726.length; var91++) {
                                                if (var9.field2726[var91] == var90) {
                                                    class58 var92 = new class58();
                                                    var92.field562 = var9;
                                                    var92.field574 = var9.field2725;
                                                    field839.method3740(var92);
                                                    break label839;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2760 = field827;
                                }
                                if (var9.field2655 != null && field829 > var9.field2761) {
                                    if (var9.field2647 == null || field829 - var9.field2761 > 32) {
                                        class58 var98 = new class58();
                                        var98.field562 = var9;
                                        var98.field574 = var9.field2655;
                                        field839.method3740(var98);
                                    } else {
                                        label815: for (int var94 = var9.field2761; var94 < field829; var94++) {
                                            int var95 = field828[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2647.length; var96++) {
                                                if (var9.field2647[var96] == var95) {
                                                    class58 var97 = new class58();
                                                    var97.field562 = var9;
                                                    var97.field574 = var9.field2655;
                                                    field839.method3740(var97);
                                                    break label815;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2761 = field829;
                                }
                                if (var9.field2729 != null && field831 > var9.field2762) {
                                    if (var9.field2629 == null || field831 - var9.field2762 > 32) {
                                        class58 var103 = new class58();
                                        var103.field562 = var9;
                                        var103.field574 = var9.field2729;
                                        field839.method3740(var103);
                                    } else {
                                        label791: for (int var99 = var9.field2762; var99 < field831; var99++) {
                                            int var100 = field830[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2629.length; var101++) {
                                                if (var9.field2629[var101] == var100) {
                                                    class58 var102 = new class58();
                                                    var102.field562 = var9;
                                                    var102.field574 = var9.field2729;
                                                    field839.method3740(var102);
                                                    break label791;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2762 = field831;
                                }
                                if (field832 > var9.field2646 && var9.field2734 != null) {
                                    class58 var104 = new class58();
                                    var104.field562 = var9;
                                    var104.field574 = var9.field2734;
                                    field839.method3740(var104);
                                }
                                if (field833 > var9.field2646 && var9.field2736 != null) {
                                    class58 var105 = new class58();
                                    var105.field562 = var9;
                                    var105.field574 = var9.field2736;
                                    field839.method3740(var105);
                                }
                                if (field834 > var9.field2646 && var9.field2621 != null) {
                                    class58 var106 = new class58();
                                    var106.field562 = var9;
                                    var106.field574 = var9.field2621;
                                    field839.method3740(var106);
                                }
                                if (field835 > var9.field2646 && var9.field2742 != null) {
                                    class58 var107 = new class58();
                                    var107.field562 = var9;
                                    var107.field574 = var9.field2742;
                                    field839.method3740(var107);
                                }
                                if (field836 > var9.field2646 && var9.field2743 != null) {
                                    class58 var108 = new class58();
                                    var108.field562 = var9;
                                    var108.field574 = var9.field2743;
                                    field839.method3740(var108);
                                }
                                if (field837 > var9.field2646 && var9.field2670 != null) {
                                    class58 var109 = new class58();
                                    var109.field562 = var9;
                                    var109.field574 = var9.field2670;
                                    field839.method3740(var109);
                                }
                                var9.field2646 = field664;
                                if (var9.field2735 != null) {
                                    for (int var110 = 0; var110 < field861; var110++) {
                                        class58 var111 = new class58();
                                        var111.field562 = var9;
                                        var111.field570 = field863[var110];
                                        var111.field568 = field862[var110];
                                        var111.field574 = var9.field2735;
                                        field839.method3740(var111);
                                    }
                                }
                            }
                        }
                        if (!var9.field2710) {
                            if (field719 != null || Statics.field2418 != null || field750) {
                                continue;
                            }
                            if ((var9.field2747 >= 0 || var9.field2730 != 0) && class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15) {
                                if (var9.field2747 >= 0) {
                                    Statics.field2585 = arg0[var9.field2747];
                                } else {
                                    Statics.field2585 = var9;
                                }
                            }
                            if (var9.field2620 == 8 && class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15) {
                                Statics.field1927 = var9;
                            }
                            if (var9.field2708 > var9.field2740) {
                                int var112 = var9.field2691 + var10;
                                int var113 = var9.field2740;
                                int var114 = var9.field2708;
                                int var115 = class49.field466;
                                int var116 = class49.field468;
                                if (field709) {
                                    field710 = 32;
                                } else {
                                    field710 = 0;
                                }
                                field709 = false;
                                if (class49.field461 == 1 || !Statics.field1393 && class49.field461 == 4) {
                                    if (var115 >= var112 && var115 < var112 + 16 && var116 >= var11 && var116 < var11 + 16) {
                                        var9.field2653 -= 4;
                                        method481(var9);
                                    } else if (var115 >= var112 && var115 < var112 + 16 && var116 >= var11 + var113 - 16 && var116 < var11 + var113) {
                                        var9.field2653 += 4;
                                        method481(var9);
                                    } else if (var115 >= var112 - field710 && var115 < field710 + var112 + 16 && var116 >= var11 + 16 && var116 < var11 + var113 - 16) {
                                        int var117 = (var113 - 32) * var113 / var114;
                                        if (var117 < 8) {
                                            var117 = 8;
                                        }
                                        int var118 = var116 - var11 - 16 - var117 / 2;
                                        int var119 = var113 - 32 - var117;
                                        var9.field2653 = (var114 - var113) * var118 / var119;
                                        method481(var9);
                                        field709 = true;
                                    }
                                }
                                if (field778 != 0) {
                                    int var120 = var9.field2691;
                                    if (var115 >= var112 - var120 && var116 >= var11 && var115 < var112 + 16 && var116 <= var11 + var113) {
                                        var9.field2653 += field778 * 45;
                                        method481(var9);
                                    }
                                }
                            }
                        }
                        if (var9.field2620 == 0) {
                            method2913(arg0, var9.field2631, var12, var13, var14, var15, var10 - var9.field2712, var11 - var9.field2653);
                            if (var9.field2756 != null) {
                                method2913(var9.field2756, var9.field2631, var12, var13, var14, var15, var10 - var9.field2712, var11 - var9.field2653);
                            }
                            class57 var121 = (class57) field803.method3687((long) var9.field2631);
                            if (var121 != null) {
                                if (var121.field552 == 0 && class49.field466 >= var12 && class49.field468 >= var13 && class49.field466 < var14 && class49.field468 < var15 && !field750) {
                                    for (class58 var122 = (class58) field839.method3746(); var122 != null; var122 = (class58) field839.method3747()) {
                                        if (var122.field565) {
                                            var122.method3733();
                                            var122.field562.field2757 = false;
                                        }
                                    }
                                    if (Statics.field324 == 0) {
                                        field719 = null;
                                        field814 = null;
                                    }
                                    if (!field750) {
                                        method974();
                                    }
                                }
                                method3555(var121.field557, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.ia(III)V")
    public static final void method3209(int arg0, int arg1) {
        if (class233.method91(arg0)) {
            method1684(Statics.field2622[arg0], arg1);
        }
    }

    @ObfuscatedName("bk.in([Lhv;II)V")
    public static final void method1684(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2620 == 0) {
                    if (var3.field2756 != null) {
                        method1684(var3.field2756, arg1);
                    }
                    class57 var4 = (class57) field803.method3687((long) var3.field2631);
                    if (var4 != null) {
                        method3209(var4.field557, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2652 != null) {
                    class58 var5 = new class58();
                    var5.field562 = var3;
                    var5.field574 = var3.field2652;
                    class71.method3130(var5);
                }
                if (arg1 == 1 && var3.field2662 != null) {
                    if (var3.field2632 >= 0) {
                        class233 var6 = class233.method575(var3.field2631);
                        if (var6 == null || var6.field2756 == null || var3.field2632 >= var6.field2756.length || var6.field2756[var3.field2632] != var3) {
                            continue;
                        }
                    }
                    class58 var7 = new class58();
                    var7.field562 = var3;
                    var7.field574 = var3.field2662;
                    class71.method3130(var7);
                }
            }
        }
    }

    @ObfuscatedName("ak.ji(Lhv;IIB)V")
    public static final void method483(class233 arg0, int arg1, int arg2) {
        if (field719 != null || field750 || arg0 == null || method2948(arg0) == null) {
            return;
        }
        field719 = arg0;
        field814 = method2948(arg0);
        field815 = arg1;
        field816 = arg2;
        Statics.field324 = 0;
        field824 = false;
        int var3 = Statics.method907();
        if (var3 != -1) {
            method953(var3);
        }
    }

    @ObfuscatedName("client.jj(I)V")
    public final void method1253() {
        method481(field719);
        Statics.field324++;
        if (field843 && field818) {
            int var1 = class49.field466;
            int var2 = class49.field468;
            int var3 = var1 - field815;
            int var4 = var2 - field816;
            if (var3 < field819) {
                var3 = field819;
            }
            if (field719.field2691 + var3 > field819 + field814.field2691) {
                var3 = field819 + field814.field2691 - field719.field2691;
            }
            if (var4 < field820) {
                var4 = field820;
            }
            if (field719.field2740 + var4 > field820 + field814.field2740) {
                var4 = field820 + field814.field2740 - field719.field2740;
            }
            int var5 = var3 - field775;
            int var6 = var4 - field823;
            int var7 = field719.field2644;
            if (Statics.field324 > field719.field2721 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field824 = true;
            }
            int var8 = field814.field2712 + (var3 - field819);
            int var9 = field814.field2653 + (var4 - field820);
            if (field719.field2728 != null && field824) {
                class58 var10 = new class58();
                var10.field562 = field719;
                var10.field563 = var8;
                var10.field579 = var9;
                var10.field574 = field719.field2728;
                class71.method3130(var10);
            }
            if (class49.field461 == 0) {
                if (field824) {
                    if (field719.field2633 != null) {
                        class58 var11 = new class58();
                        var11.field562 = field719;
                        var11.field563 = var8;
                        var11.field579 = var9;
                        var11.field561 = field817;
                        var11.field574 = field719.field2633;
                        class71.method3130(var11);
                    }
                    if (field817 != null) {
                        class233 var12 = field719;
                        int var13 = class234.method3844(method5092(var12));
                        class233 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class233.method575(var12.field2737);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class175 var16 = class175.method948(class172.field2198, field689.field1278);
                            var16.field2308.method3403(field817.field2631);
                            var16.field2308.method3235(field817.field2632);
                            var16.field2308.method3229(field817.field2695);
                            var16.field2308.method3235(field719.field2632);
                            var16.field2308.method3288(field719.field2631);
                            var16.field2308.method3235(field719.field2695);
                            field689.method1848(var16);
                        }
                    }
                } else if (this.method1111()) {
                    this.method1162(field815 + field775, field823 + field816);
                } else if (field696 > 0) {
                    method158(field815 + field775, field823 + field816);
                }
                field719 = null;
            }
        } else if (Statics.field324 > 1) {
            field719 = null;
        }
    }

    @ObfuscatedName("bw.jn(IS)V")
    public static void method953(int arg0) {
        Statics.field2411 = new class77();
        Statics.field2411.field1115 = field780[arg0];
        Statics.field2411.field1112 = field692[arg0];
        Statics.field2411.field1117 = field718[arg0];
        Statics.field2411.field1113 = field783[arg0];
        Statics.field2411.field1111 = field784[arg0];
    }

    @ObfuscatedName("n.jc(IIS)V")
    public static void method158(int arg0, int arg1) {
        method2958(Statics.field2411, arg0, arg1);
        Statics.field2411 = null;
    }

    @ObfuscatedName("ak.jw(Lhv;I)V")
    public static void method481(class233 arg0) {
        if (field844 == arg0.field2764) {
            field845[arg0.field2763] = true;
        }
    }

    @ObfuscatedName("ek.jp(Lhv;I)Lhv;")
    public static class233 method2948(class233 arg0) {
        class233 var1 = method960(arg0);
        if (var1 == null) {
            var1 = arg0.field2707;
        }
        return var1;
    }

    @ObfuscatedName("b.jq(IB)V")
    public static final void method198(int arg0) {
        if (!class233.method91(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2622[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2754 = 0;
                var3.field2654 = 0;
            }
        }
    }

    @ObfuscatedName("bq.jd(II)V")
    public static final void method1002(int arg0) {
        if (class233.method91(arg0)) {
            method4173(Statics.field2622[arg0], -1);
        }
    }

    @ObfuscatedName("ii.jh([Lhv;II)V")
    public static final void method4173(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2737 == arg1 && (!var3.field2710 || !method30(var3))) {
                if (var3.field2620 == 0) {
                    if (!var3.field2710 && method30(var3) && Statics.field2585 != var3) {
                        continue;
                    }
                    method4173(arg0, var3.field2631);
                    if (var3.field2756 != null) {
                        method4173(var3.field2756, var3.field2631);
                    }
                    class57 var4 = (class57) field803.method3687((long) var3.field2631);
                    if (var4 != null) {
                        method1002(var4.field557);
                    }
                }
                if (var3.field2620 == 6) {
                    if (var3.field2678 != -1 || var3.field2679 != -1) {
                        boolean var5 = Statics.method1446(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2679;
                        } else {
                            var6 = var3.field2678;
                        }
                        if (var6 != -1) {
                            class276 var7 = class276.method2826(var6);
                            var3.field2654 += field665;
                            while (var3.field2654 > var7.field3587[var3.field2754]) {
                                var3.field2654 -= var7.field3587[var3.field2754];
                                var3.field2754++;
                                if (var3.field2754 >= var7.field3585.length) {
                                    var3.field2754 -= var7.field3594;
                                    if (var3.field2754 < 0 || var3.field2754 >= var7.field3585.length) {
                                        var3.field2754 = 0;
                                    }
                                }
                                method481(var3);
                            }
                        }
                    }
                    if (var3.field2687 != 0 && !var3.field2710) {
                        int var8 = var3.field2687 >> 16;
                        int var9 = var3.field2687 << 16 >> 16;
                        int var10 = field665 * var8;
                        int var11 = field665 * var9;
                        var3.field2682 = var3.field2682 + var10 & 0x7FF;
                        var3.field2683 = var3.field2683 + var11 & 0x7FF;
                        method481(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.jl(II)V")
    public static final void method1732(int arg0) {
        Statics.method988();
        for (class70 var1 = (class70) class70.field1037.method3746(); var1 != null; var1 = (class70) class70.field1037.method3747()) {
            if (var1.field1032 != null) {
                var1.method1578();
            }
        }
        int var2 = class257.method3091(arg0).field3266;
        if (var2 == 0) {
            return;
        }
        int var3 = class228.field2596[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class125.method2558(0.9D);
                ((class114) Statics.field1763).method2291(0.9D);
            }
            if (var3 == 2) {
                class125.method2558(0.8D);
                ((class114) Statics.field1763).method2291(0.8D);
            }
            if (var3 == 3) {
                class125.method2558(0.7D);
                ((class114) Statics.field1763).method2291(0.7D);
            }
            if (var3 == 4) {
                class125.method2558(0.6D);
                ((class114) Statics.field1763).method2291(0.6D);
            }
            class272.field3522.method3647();
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
            if (field822 != var4) {
                if (field822 == 0 && field874 != -1) {
                    class220.method88(Statics.field3168, field874, 0, var4, false);
                    field875 = false;
                } else if (var4 == 0) {
                    Statics.field1971.method3852();
                    class220.field2500 = 1;
                    Statics.field1392 = null;
                    field875 = false;
                } else if (class220.field2500 == 0) {
                    Statics.field1971.method3846(var4);
                } else {
                    Statics.field2506 = var4;
                }
                field822 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field797 = 127;
            }
            if (var3 == 1) {
                field797 = 96;
            }
            if (var3 == 2) {
                field797 = 64;
            }
            if (var3 == 3) {
                field797 = 32;
            }
            if (var3 == 4) {
                field797 = 0;
            }
        }
        if (var2 == 5) {
            field777 = var3;
        }
        if (var2 == 6) {
            field804 = var3;
        }
        if (var2 == 9) {
            field644 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field877 = 127;
            }
            if (var3 == 1) {
                field877 = 96;
            }
            if (var3 == 2) {
                field877 = 64;
            }
            if (var3 == 3) {
                field877 = 32;
            }
            if (var3 == 4) {
                field877 = 0;
            }
        }
        if (var2 == 17) {
            field840 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class79[] var5 = new class79[] { class79.field1125, class79.field1126, class79.field1124, class79.field1127 };
            field733 = (class79) class180.method3951(var5, var3);
            if (field733 == null) {
                field733 = class79.field1126;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field685 = -1;
            } else {
                field685 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class79[] var6 = new class79[] { class79.field1125, class79.field1126, class79.field1124, class79.field1127 };
        field842 = (class79) class180.method3951(var6, var3);
        if (field842 == null) {
            field842 = class79.field1126;
        }
    }

    @ObfuscatedName("fe.jz(Lhv;I)V")
    public static final void method3206(class233 arg0) {
        int var1 = arg0.field2731;
        if (var1 == 324) {
            if (field904 == -1) {
                field904 = arg0.field2666;
                field905 = arg0.field2667;
            }
            if (field903.field2606) {
                arg0.field2666 = field904;
            } else {
                arg0.field2666 = field905;
            }
        } else if (var1 == 325) {
            if (field904 == -1) {
                field904 = arg0.field2666;
                field905 = arg0.field2667;
            }
            if (field903.field2606) {
                arg0.field2666 = field905;
            } else {
                arg0.field2666 = field904;
            }
        } else if (var1 == 327) {
            arg0.field2682 = 150;
            arg0.field2683 = (int) (Math.sin((double) field654 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2674 = 5;
            arg0.field2675 = 0;
        } else if (var1 == 328) {
            arg0.field2682 = 150;
            arg0.field2683 = (int) (Math.sin((double) field654 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2674 = 5;
            arg0.field2675 = 1;
        }
    }

    @ObfuscatedName("ai.jt(Lba;ZI)V")
    public static final void method917(class57 arg0, boolean arg1) {
        int var2 = arg0.field557;
        int var3 = (int) arg0.field2466;
        arg0.method3733();
        if (arg1) {
            class233.method1817(var2);
        }
        for (class214 var4 = (class214) field781.method3690(); var4 != null; var4 = (class214) field781.method3692()) {
            if ((var4.field2466 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3733();
            }
        }
        class233 var5 = class233.method575(var3);
        if (var5 != null) {
            method481(var5);
        }
        method2636();
        if (field802 != -1) {
            int var6 = field802;
            if (class233.method91(var6)) {
                method1684(Statics.field2622[var6], 1);
            }
        }
    }

    @ObfuscatedName("ao.jg(Lhv;B)Z")
    public static final boolean method913(class233 arg0) {
        int var1 = arg0.field2731;
        if (var1 == 205) {
            field690 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field903.method4054(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field903.method4055(var4, var5 == 1);
        }
        if (var1 == 324) {
            field903.method4060(false);
        }
        if (var1 == 325) {
            field903.method4060(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method948(class172.field2264, field689.field1278);
            field903.method4059(var6.field2308);
            field689.method1848(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bv.ju(Lhv;IIIB)V")
    public static final void method1449(class233 arg0, int arg1, int arg2, int arg3) {
        method4032();
        class227 var4 = arg0.method4145(false);
        if (var4 == null) {
            return;
        }
        class320.method5371(arg1, arg2, var4.field2593 + arg1, var4.field2590 + arg2);
        if (field747 == 2 || field747 == 5) {
            class320.method5372(arg1, arg2, 0, var4.field2592, var4.field2591);
        } else {
            int var5 = field712 & 0x7FF;
            int var6 = Statics.field241.field947 / 32 + 48;
            int var7 = 464 - Statics.field241.field960 / 32;
            Statics.field111.method5508(arg1, arg2, var4.field2593, var4.field2590, var6, var7, var5, 256, var4.field2592, var4.field2591);
            for (int var8 = 0; var8 < field866; var8++) {
                int var9 = field867[var8] * 4 + 2 - Statics.field241.field947 / 32;
                int var10 = field868[var8] * 4 + 2 - Statics.field241.field960 / 32;
                method4192(arg1, arg2, var9, var10, field869[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class208 var13 = field700[Statics.field325][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field241.field947 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field241.field960 / 32;
                        method4192(arg1, arg2, var14, var15, Statics.field2408[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field746; var16++) {
                class74 var17 = field684[field761[var16]];
                if (var17 != null && var17.method1040()) {
                    class274 var18 = var17.field1089;
                    if (var18 != null && var18.field3532 != null) {
                        var18 = var18.method4818();
                    }
                    if (var18 != null && var18.field3553 && var18.field3537) {
                        int var19 = var17.field947 / 32 - Statics.field241.field947 / 32;
                        int var20 = var17.field960 / 32 - Statics.field241.field960 / 32;
                        method4192(arg1, arg2, var19, var20, Statics.field2408[1], var4);
                    }
                }
            }
            int var21 = class84.field1212;
            int[] var22 = class84.field1211;
            for (int var23 = 0; var23 < var21; var23++) {
                class62 var24 = field758[var22[var23]];
                if (var24 != null && var24.method1040() && !var24.field608 && Statics.field241 != var24) {
                    int var25 = var24.field947 / 32 - Statics.field241.field947 / 32;
                    int var26 = var24.field960 / 32 - Statics.field241.field960 / 32;
                    boolean var27 = false;
                    if (Statics.field241.field628 != 0 && var24.field628 != 0 && Statics.field241.field628 == var24.field628) {
                        var27 = true;
                    }
                    if (var24.method1035()) {
                        method4192(arg1, arg2, var25, var26, Statics.field2408[3], var4);
                    } else if (var27) {
                        method4192(arg1, arg2, var25, var26, Statics.field2408[4], var4);
                    } else if (var24.method1052()) {
                        method4192(arg1, arg2, var25, var26, Statics.field2408[5], var4);
                    } else {
                        method4192(arg1, arg2, var25, var26, Statics.field2408[2], var4);
                    }
                }
            }
            if (field662 != 0 && field654 % 20 < 10) {
                if (field662 == 1 && field663 >= 0 && field663 < field684.length) {
                    class74 var28 = field684[field663];
                    if (var28 != null) {
                        int var29 = var28.field947 / 32 - Statics.field241.field947 / 32;
                        int var30 = var28.field960 / 32 - Statics.field241.field960 / 32;
                        method2959(arg1, arg2, var29, var30, Statics.field2811[1], var4);
                    }
                }
                if (field662 == 2) {
                    int var31 = field853 * 4 - Statics.field31 * 4 + 2 - Statics.field241.field947 / 32;
                    int var32 = field851 * 4 - Statics.field1241 * 4 + 2 - Statics.field241.field960 / 32;
                    method2959(arg1, arg2, var31, var32, Statics.field2811[1], var4);
                }
                if (field662 == 10 && field651 >= 0 && field651 < field758.length) {
                    class62 var33 = field758[field651];
                    if (var33 != null) {
                        int var34 = var33.field947 / 32 - Statics.field241.field947 / 32;
                        int var35 = var33.field960 / 32 - Statics.field241.field960 / 32;
                        method2959(arg1, arg2, var34, var35, Statics.field2811[1], var4);
                    }
                }
            }
            if (field732 != 0) {
                int var36 = field732 * 4 + 2 - Statics.field241.field947 / 32;
                int var37 = field643 * 4 + 2 - Statics.field241.field960 / 32;
                method4192(arg1, arg2, var36, var37, Statics.field2811[0], var4);
            }
            if (!Statics.field241.field608) {
                class320.method5379(var4.field2593 / 2 + arg1 - 1, var4.field2590 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field846[arg3] = true;
    }

    @ObfuscatedName("kq.jk(Lhv;IIIB)V")
    public static final void method5125(class233 arg0, int arg1, int arg2, int arg3) {
        class227 var4 = arg0.method4145(false);
        if (var4 == null) {
            return;
        }
        if (field747 < 3) {
            Statics.field13.method5508(arg1, arg2, var4.field2593, var4.field2590, 25, 25, field712, 256, var4.field2592, var4.field2591);
        } else {
            class320.method5372(arg1, arg2, 0, var4.field2592, var4.field2591);
        }
    }

    @ObfuscatedName("em.jv(IIIILlt;Lhz;I)V")
    public static final void method2959(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4192(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field712 & 0x7FF;
        int var8 = class125.field1766[var7];
        int var9 = class125.field1741[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2593 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field433.method5487(arg5.field2593 / 2 + arg0 - var17 / 2 + var15, arg5.field2590 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("iw.ja(IIIILlt;Lhz;I)V")
    public static final void method4192(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field712 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1766[var6];
        int var9 = class125.field1741[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5513(arg5.field2593 / 2 + var10 - arg4.field3855 / 2, arg5.field2590 / 2 - var11 - arg4.field3857 / 2, arg0, arg1, arg5.field2593, arg5.field2590, arg5.field2592, arg5.field2591);
        } else {
            arg4.method5491(arg5.field2593 / 2 + arg0 + var10 - arg4.field3855 / 2, arg5.field2590 / 2 + arg1 - var11 - arg4.field3857 / 2);
        }
    }

    @ObfuscatedName("dw.jo(B)V")
    public static final void method2288() {
        class86.method124();
        if (Statics.field928 != null) {
            Statics.field928.method5102();
        }
    }

    @ObfuscatedName("t.js(I)V")
    public static final void method163() {
        for (int var0 = 0; var0 < class84.field1212; var0++) {
            class62 var1 = field758[class84.field1211[var0]];
            var1.method1034();
        }
    }

    @ObfuscatedName("dv.jb(I)V")
    public static final void method2536() {
        field833 = field664;
    }

    @ObfuscatedName("q.jr(I)V")
    public static final void method14() {
        field834 = field664;
        Statics.field243 = true;
    }

    @ObfuscatedName("fu.jy(I)V")
    public static final void method3039() {
        class175 var0 = class175.method948(class172.field2259, field689.field1278);
        var0.field2308.method3227(0);
        field689.method1848(var0);
    }

    @ObfuscatedName("kz.jf(Lhv;I)I")
    public static int method5092(class233 arg0) {
        class214 var1 = (class214) field781.method3687(((long) arg0.field2631 << 32) + (long) arg0.field2632);
        return var1 == null ? arg0.field2669 : var1.field2482;
    }

    @ObfuscatedName("bg.jx(Lhv;I)Lhv;")
    public static class233 method960(class233 arg0) {
        int var1 = class234.method3844(method5092(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method575(arg0.field2737);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("m.jm(Lhv;I)Z")
    public static boolean method30(class233 arg0) {
        return arg0.field2651;
    }

    @ObfuscatedName("dj.kl(Lhv;IB)Ljava/lang/String;")
    public static String method2400(class233 arg0, int arg1) {
        int var2 = method5092(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2732 == null) {
            return null;
        } else if (arg0.field2706 == null || arg0.field2706.length <= arg1 || arg0.field2706[arg1] == null || arg0.field2706[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2706[arg1];
        }
    }

    @ObfuscatedName("ir.kn(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method4189(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field646 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field646 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field646 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field646 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field646 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field195 != null) {
            var3 = "/p=" + Statics.field195;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field649 + "/a=" + Statics.field599 + var3 + "/";
    }

    @ObfuscatedName("cy.ko([BIB)V")
    public static void method2026(byte[] arg0, int arg1) {
        if (field683 == null) {
            field683 = new byte[24];
        }
        class196.method3566(arg0, arg1, field683, 0, 24);
    }

    @ObfuscatedName("client.kx(B)Lkz;")
    public class294 method1104() {
        return Statics.field241 == null ? null : Statics.field241.field633;
    }

    @ObfuscatedName("dj.kk(IIIZI)V")
    public static void method2398(int arg0, int arg1, int arg2, boolean arg3) {
        class175 var4 = class175.method948(class172.field2257, field689.field1278);
        var4.field2308.method3227(arg2);
        var4.field2308.method3288(arg3 ? field706 : 0);
        var4.field2308.method3383(arg0);
        var4.field2308.method3229(arg1);
        field689.method1848(var4);
    }

    @ObfuscatedName("az.km(I)Z")
    public static boolean method485() {
        return field809 >= 2;
    }

    @ObfuscatedName("dk.ke(II)V")
    public static void method2639(int arg0) {
        field726 = arg0;
    }

    @ObfuscatedName("ec.kz(I)V")
    public static void method2838() {
        field689.method1848(class175.method948(class172.field2238, field689.field1278));
        field726 = 0;
    }

    @ObfuscatedName("gj.kf(I)V")
    public static void method3559() {
        if (!field725 || Statics.field241 == null) {
            return;
        }
        int var0 = Statics.field241.field977[0];
        int var1 = Statics.field241.field975[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1081 = Statics.field241.field947;
        int var2 = method622(Statics.field241.field947, Statics.field241.field960, Statics.field325) - field790;
        if (var2 < Statics.field1071) {
            Statics.field1071 = var2;
        }
        Statics.field512 = Statics.field241.field960;
        field725 = false;
    }

    @ObfuscatedName("hh.ka(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method3842(String arg0) {
        class245[] var1 = new class245[] { class245.field3153, class245.field3160, class245.field3150, class245.field3152, class245.field3155, class245.field3158 };
        class245[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class245 var4 = var2[var3];
            if (var4.field3157 != -1 && arg0.startsWith(class76.method449(var4.field3157))) {
                arg0 = arg0.substring(6 + Integer.toString(var4.field3157).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dp.ky(I)V")
    public static void method2262() {
        if (Statics.field309 == null) {
            return;
        }
        field675 = field654;
        Statics.field309.method4371();
        for (int var0 = 0; var0 < field758.length; var0++) {
            if (field758[var0] != null) {
                Statics.field309.method4373((field758[var0].field947 >> 7) + Statics.field31, (field758[var0].field960 >> 7) + Statics.field1241);
            }
        }
    }
}

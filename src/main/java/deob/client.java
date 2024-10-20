package deob;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class53 implements class295 {

    @ObfuscatedName("client.w")
    public static class172[] field707 = new class172[4];

    @ObfuscatedName("client.am")
    public static boolean field828 = true;

    @ObfuscatedName("client.bf")
    public static int field650 = 1;

    @ObfuscatedName("client.bo")
    public static int field788 = 0;

    @ObfuscatedName("client.bd")
    public static int field652 = 0;

    @ObfuscatedName("client.bp")
    public static boolean field653 = false;

    @ObfuscatedName("client.bv")
    public static boolean field654 = false;

    @ObfuscatedName("client.bg")
    public static int field655 = 0;

    @ObfuscatedName("client.bl")
    public static int field656 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field657 = false;

    @ObfuscatedName("client.bw")
    public static int field658 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field664 = true;

    @ObfuscatedName("client.ct")
    public static int field660 = 0;

    @ObfuscatedName("client.cb")
    public static long field665 = 1L;

    @ObfuscatedName("client.cd")
    public static int field662 = -1;

    @ObfuscatedName("client.cq")
    public static int field663 = -1;

    @ObfuscatedName("client.cf")
    public static long field818 = -1L;

    @ObfuscatedName("client.cs")
    public static boolean field783 = true;

    @ObfuscatedName("client.co")
    public static boolean field882 = false;

    @ObfuscatedName("client.cr")
    public static int field667 = 0;

    @ObfuscatedName("client.ck")
    public static int field668 = 0;

    @ObfuscatedName("client.cn")
    public static int field863 = 0;

    @ObfuscatedName("client.cw")
    public static int field670 = 0;

    @ObfuscatedName("client.cv")
    public static int field671 = 0;

    @ObfuscatedName("client.cu")
    public static int field672 = 0;

    @ObfuscatedName("client.ci")
    public static int field878 = 0;

    @ObfuscatedName("client.ce")
    public static int field868 = 0;

    @ObfuscatedName("client.cj")
    public static int field675 = 0;

    @ObfuscatedName("client.cl")
    public static class84 field666 = class84.field1141;

    @ObfuscatedName("client.dz")
    public static class84 field677 = class84.field1141;

    @ObfuscatedName("client.dg")
    public static int field852 = 0;

    @ObfuscatedName("client.dn")
    public static int field679 = 0;

    @ObfuscatedName("client.dt")
    public static int field680 = 0;

    @ObfuscatedName("client.en")
    public static int field738 = 0;

    @ObfuscatedName("client.em")
    public static int field760 = 0;

    @ObfuscatedName("client.ep")
    public static int field844 = 0;

    @ObfuscatedName("client.eo")
    public static int field684 = 0;

    @ObfuscatedName("client.ei")
    public static int field685 = 0;

    @ObfuscatedName("client.ew")
    public static class154 field915 = class154.field1983;

    @ObfuscatedName("client.ea")
    public static boolean field709 = false;

    @ObfuscatedName("client.ed")
    public static class88 field688 = new class88();

    @ObfuscatedName("client.el")
    public static byte[] field689 = null;

    @ObfuscatedName("client.ec")
    public static class79[] field693 = new class79[32768];

    @ObfuscatedName("client.et")
    public static int field691 = 0;

    @ObfuscatedName("client.fp")
    public static int[] field692 = new int[32768];

    @ObfuscatedName("client.fg")
    public static int field816 = 0;

    @ObfuscatedName("client.fj")
    public static int[] field694 = new int[250];

    @ObfuscatedName("client.fo")
    public static final class95 field695 = new class95();

    @ObfuscatedName("client.ff")
    public static int field696 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field697 = false;

    @ObfuscatedName("client.fz")
    public static boolean field698 = true;

    @ObfuscatedName("client.fd")
    public static class287 field774 = new class287();

    @ObfuscatedName("client.ft")
    public static HashMap field850 = new HashMap();

    @ObfuscatedName("client.fa")
    public static int field702 = 0;

    @ObfuscatedName("client.fw")
    public static int field703 = 1;

    @ObfuscatedName("client.fy")
    public static int field704 = 0;

    @ObfuscatedName("client.gn")
    public static int field801 = 1;

    @ObfuscatedName("client.ga")
    public static int field706 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field839 = false;

    @ObfuscatedName("client.gm")
    public static int[][][] field869 = new int[4][13][13];

    @ObfuscatedName("client.gl")
    public static final int[] field710 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ge")
    public static int field711 = 0;

    @ObfuscatedName("client.ha")
    public static int field712 = 2301979;

    @ObfuscatedName("client.ht")
    public static int field735 = 5063219;

    @ObfuscatedName("client.hj")
    public static int field855 = 3353893;

    @ObfuscatedName("client.hy")
    public static int field715 = 7759444;

    @ObfuscatedName("client.hv")
    public static boolean field716 = false;

    @ObfuscatedName("client.ho")
    public static int field865 = 0;

    @ObfuscatedName("client.hm")
    public static int field718 = 128;

    @ObfuscatedName("client.hw")
    public static int field719 = 0;

    @ObfuscatedName("client.hu")
    public static int field767 = 0;

    @ObfuscatedName("client.hd")
    public static int field721 = 0;

    @ObfuscatedName("client.hn")
    public static int field845 = 0;

    @ObfuscatedName("client.hl")
    public static int field723 = 0;

    @ObfuscatedName("client.hf")
    public static int field724 = 0;

    @ObfuscatedName("client.hc")
    public static int field725 = 50;

    @ObfuscatedName("client.hk")
    public static int field791 = 0;

    @ObfuscatedName("client.hs")
    public static int field728 = 0;

    @ObfuscatedName("client.if")
    public static int field729 = 0;

    @ObfuscatedName("client.iy")
    public static int field789 = 12;

    @ObfuscatedName("client.ic")
    public static int field731 = 6;

    @ObfuscatedName("client.ia")
    public static int field732 = 0;

    @ObfuscatedName("client.im")
    public static boolean field846 = false;

    @ObfuscatedName("client.ik")
    public static int field734 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field720 = false;

    @ObfuscatedName("client.iu")
    public static int field736 = 0;

    @ObfuscatedName("client.ii")
    public static int field737 = 0;

    @ObfuscatedName("client.iv")
    public static int field761 = 50;

    @ObfuscatedName("client.it")
    public static String field804 = null;

    @ObfuscatedName("client.ir")
    public static int[] field739 = new int[field761];

    @ObfuscatedName("client.ih")
    public static int[] field740 = new int[field761];

    @ObfuscatedName("client.ij")
    public static int[] field741 = new int[field761];

    @ObfuscatedName("client.is")
    public static int[] field870 = new int[field761];

    @ObfuscatedName("client.ib")
    public static int[] field743 = new int[field761];

    @ObfuscatedName("client.iw")
    public static int[] field744 = new int[field761];

    @ObfuscatedName("client.ig")
    public static int[] field745 = new int[field761];

    @ObfuscatedName("client.id")
    public static String[] field746 = new String[field761];

    @ObfuscatedName("client.in")
    public static int[][] field747 = new int[104][104];

    @ObfuscatedName("client.io")
    public static int field908 = 0;

    @ObfuscatedName("client.iq")
    public static int field749 = -1;

    @ObfuscatedName("client.ip")
    public static int field750 = -1;

    @ObfuscatedName("client.ja")
    public static int field751 = 0;

    @ObfuscatedName("client.jn")
    public static int field752 = 0;

    @ObfuscatedName("client.jd")
    public static int field753 = 0;

    @ObfuscatedName("client.jl")
    public static int field673 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field755 = true;

    @ObfuscatedName("client.jx")
    public static int field730 = 0;

    @ObfuscatedName("client.jp")
    public static int field757 = 0;

    @ObfuscatedName("client.jz")
    public static int field784 = 0;

    @ObfuscatedName("client.jq")
    public static int field686 = 0;

    @ObfuscatedName("client.jf")
    public static int field810 = 0;

    @ObfuscatedName("client.je")
    public static int field722 = 0;

    @ObfuscatedName("client.jy")
    public static boolean field812 = false;

    @ObfuscatedName("client.jc")
    public static int field763 = 0;

    @ObfuscatedName("client.ji")
    public static int field764 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field765 = true;

    @ObfuscatedName("client.jm")
    public static class67[] field766 = new class67[2048];

    @ObfuscatedName("client.jj")
    public static int field826 = -1;

    @ObfuscatedName("client.jv")
    public static int field768 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field769 = true;

    @ObfuscatedName("client.ku")
    public static int field690 = 0;

    @ObfuscatedName("client.kd")
    public static int field771 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field772 = new int[1000];

    @ObfuscatedName("client.ko")
    public static final int[] field773 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kz")
    public static String[] field669 = new String[8];

    @ObfuscatedName("client.kr")
    public static boolean[] field775 = new boolean[8];

    @ObfuscatedName("client.kx")
    public static int[] field889 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ks")
    public static int field777 = -1;

    @ObfuscatedName("client.ky")
    public static class213[][][] field778 = new class213[4][104][104];

    @ObfuscatedName("client.kg")
    public static class213 field779 = new class213();

    @ObfuscatedName("client.kw")
    public static class213 field780 = new class213();

    @ObfuscatedName("client.ke")
    public static class213 field781 = new class213();

    @ObfuscatedName("client.ki")
    public static int[] field782 = new int[25];

    @ObfuscatedName("client.kt")
    public static int[] field776 = new int[25];

    @ObfuscatedName("client.kf")
    public static int[] field754 = new int[25];

    @ObfuscatedName("client.kc")
    public static int field785 = 0;

    @ObfuscatedName("client.kk")
    public static boolean field786 = false;

    @ObfuscatedName("client.ln")
    public static int field787 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field742 = new int[500];

    @ObfuscatedName("client.lf")
    public static int[] field914 = new int[500];

    @ObfuscatedName("client.lo")
    public static int[] field856 = new int[500];

    @ObfuscatedName("client.lk")
    public static int[] field717 = new int[500];

    @ObfuscatedName("client.lg")
    public static String[] field792 = new String[500];

    @ObfuscatedName("client.lh")
    public static String[] field793 = new String[500];

    @ObfuscatedName("client.la")
    public static boolean[] field727 = new boolean[500];

    @ObfuscatedName("client.ly")
    public static boolean field795 = false;

    @ObfuscatedName("client.lb")
    public static boolean field661 = false;

    @ObfuscatedName("client.lr")
    public static boolean field797 = false;

    @ObfuscatedName("client.lp")
    public static boolean field700 = true;

    @ObfuscatedName("client.lv")
    public static int field799 = -1;

    @ObfuscatedName("client.ld")
    public static int field800 = -1;

    @ObfuscatedName("client.li")
    public static int field770 = 0;

    @ObfuscatedName("client.lw")
    public static int field802 = 50;

    @ObfuscatedName("client.lq")
    public static int field847 = 0;

    @ObfuscatedName("client.lc")
    public static boolean field805 = false;

    @ObfuscatedName("client.lz")
    public static int field854 = -1;

    @ObfuscatedName("client.mg")
    public static int field674 = -1;

    @ObfuscatedName("client.mo")
    public static String field808 = null;

    @ObfuscatedName("client.md")
    public static String field809 = null;

    @ObfuscatedName("client.my")
    public static int field821 = -1;

    @ObfuscatedName("client.mh")
    public static class210 field811 = new class210(8);

    @ObfuscatedName("client.mi")
    public static int field859 = 0;

    @ObfuscatedName("client.me")
    public static int field813 = -1;

    @ObfuscatedName("client.mc")
    public static int field814 = 0;

    @ObfuscatedName("client.mr")
    public static int field815 = 0;

    @ObfuscatedName("client.mw")
    public static class239 field794 = null;

    @ObfuscatedName("client.mu")
    public static int field817 = 0;

    @ObfuscatedName("client.ml")
    public static int field911 = 0;

    @ObfuscatedName("client.mm")
    public static int field678 = 0;

    @ObfuscatedName("client.mv")
    public static int field820 = -1;

    @ObfuscatedName("client.mp")
    public static boolean field748 = false;

    @ObfuscatedName("client.mb")
    public static class239 field822 = null;

    @ObfuscatedName("client.mk")
    public static class239 field823 = null;

    @ObfuscatedName("client.ms")
    public static class239 field824 = null;

    @ObfuscatedName("client.mj")
    public static int field825 = 0;

    @ObfuscatedName("client.mx")
    public static int field803 = 0;

    @ObfuscatedName("client.mt")
    public static class239 field827 = null;

    @ObfuscatedName("client.nh")
    public static boolean field905 = false;

    @ObfuscatedName("client.ng")
    public static int field758 = -1;

    @ObfuscatedName("client.ne")
    public static int field830 = -1;

    @ObfuscatedName("client.nd")
    public static boolean field831 = false;

    @ObfuscatedName("client.nn")
    public static int field832 = -1;

    @ObfuscatedName("client.na")
    public static int field833 = -1;

    @ObfuscatedName("client.nc")
    public static boolean field834 = false;

    @ObfuscatedName("client.nq")
    public static int field835 = 1;

    @ObfuscatedName("client.nu")
    public static int[] field836 = new int[32];

    @ObfuscatedName("client.nf")
    public static int field837 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field838 = new int[32];

    @ObfuscatedName("client.ni")
    public static int field682 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field840 = new int[32];

    @ObfuscatedName("client.nw")
    public static int field841 = 0;

    @ObfuscatedName("client.nb")
    public static int field842 = 0;

    @ObfuscatedName("client.nl")
    public static int field843 = 0;

    @ObfuscatedName("client.no")
    public static int field899 = 0;

    @ObfuscatedName("client.np")
    public static int field649 = 0;

    @ObfuscatedName("client.ny")
    public static int field676 = 0;

    @ObfuscatedName("client.nm")
    public static int field925 = 0;

    @ObfuscatedName("client.oy")
    public static int field848 = 0;

    @ObfuscatedName("client.oc")
    public static class213 field849 = new class213();

    @ObfuscatedName("client.oj")
    public static class213 field922 = new class213();

    @ObfuscatedName("client.ov")
    public static class213 field851 = new class213();

    @ObfuscatedName("client.oi")
    public static class210 field860 = new class210(512);

    @ObfuscatedName("client.ow")
    public static int field853 = 0;

    @ObfuscatedName("client.ok")
    public static int field659 = -2;

    @ObfuscatedName("client.of")
    public static boolean[] field796 = new boolean[100];

    @ObfuscatedName("client.op")
    public static boolean[] field924 = new boolean[100];

    @ObfuscatedName("client.os")
    public static boolean[] field857 = new boolean[100];

    @ObfuscatedName("client.oh")
    public static int[] field858 = new int[100];

    @ObfuscatedName("client.ot")
    public static int[] field829 = new int[100];

    @ObfuscatedName("client.or")
    public static int[] field687 = new int[100];

    @ObfuscatedName("client.oa")
    public static int[] field861 = new int[100];

    @ObfuscatedName("client.oq")
    public static int field705 = 0;

    @ObfuscatedName("client.ob")
    public static long field701 = 0L;

    @ObfuscatedName("client.om")
    public static boolean field864 = true;

    @ObfuscatedName("client.pz")
    public static int[] field714 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.py")
    public static int field866 = 0;

    @ObfuscatedName("client.pl")
    public static int field867 = 0;

    @ObfuscatedName("client.ph")
    public static String field790 = "";

    @ObfuscatedName("client.pf")
    public static long[] field756 = new long[100];

    @ObfuscatedName("client.pi")
    public static int field759 = 0;

    @ObfuscatedName("client.pw")
    public static int field871 = 0;

    @ObfuscatedName("client.pe")
    public static int[] field872 = new int[128];

    @ObfuscatedName("client.pk")
    public static int[] field733 = new int[128];

    @ObfuscatedName("client.ps")
    public static long field683 = -1L;

    @ObfuscatedName("client.pc")
    public static int field875 = -1;

    @ObfuscatedName("client.pu")
    public static int field876 = 0;

    @ObfuscatedName("client.px")
    public static int[] field713 = new int[1000];

    @ObfuscatedName("client.pr")
    public static int[] field806 = new int[1000];

    @ObfuscatedName("client.pn")
    public static class328[] field879 = new class328[1000];

    @ObfuscatedName("client.pb")
    public static int field880 = 0;

    @ObfuscatedName("client.pv")
    public static int field881 = 0;

    @ObfuscatedName("client.qo")
    public static int field708 = 0;

    @ObfuscatedName("client.qn")
    public static int field883 = 255;

    @ObfuscatedName("client.qa")
    public static int field681 = -1;

    @ObfuscatedName("client.qw")
    public static boolean field885 = false;

    @ObfuscatedName("client.qz")
    public static int field886 = 127;

    @ObfuscatedName("client.qj")
    public static int field887 = 127;

    @ObfuscatedName("client.qs")
    public static int field888 = 0;

    @ObfuscatedName("client.qi")
    public static int[] field807 = new int[50];

    @ObfuscatedName("client.qx")
    public static int[] field890 = new int[50];

    @ObfuscatedName("client.ql")
    public static int[] field891 = new int[50];

    @ObfuscatedName("client.qq")
    public static int[] field892 = new int[50];

    @ObfuscatedName("client.qh")
    public static class99[] field893 = new class99[50];

    @ObfuscatedName("client.qt")
    public static boolean field894 = false;

    @ObfuscatedName("client.rl")
    public static boolean[] field895 = new boolean[5];

    @ObfuscatedName("client.rx")
    public static int[] field896 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field897 = new int[5];

    @ObfuscatedName("client.rv")
    public static int[] field898 = new int[5];

    @ObfuscatedName("client.ra")
    public static int[] field762 = new int[5];

    @ObfuscatedName("client.rc")
    public static short field900 = 256;

    @ObfuscatedName("client.rd")
    public static short field901 = 205;

    @ObfuscatedName("client.rm")
    public static short field902 = 256;

    @ObfuscatedName("client.rj")
    public static short field903 = 320;

    @ObfuscatedName("client.rf")
    public static short field904 = 1;

    @ObfuscatedName("client.rs")
    public static short field873 = 32767;

    @ObfuscatedName("client.rw")
    public static short field906 = 1;

    @ObfuscatedName("client.rr")
    public static short field907 = 32767;

    @ObfuscatedName("client.re")
    public static int field699 = 0;

    @ObfuscatedName("client.ry")
    public static int field874 = 0;

    @ObfuscatedName("client.ru")
    public static int field910 = 0;

    @ObfuscatedName("client.ri")
    public static int field651 = 0;

    @ObfuscatedName("client.rn")
    public static int field912 = 0;

    @ObfuscatedName("client.rq")
    public static class236 field919 = new class236();

    @ObfuscatedName("client.sm")
    public static int field862 = -1;

    @ObfuscatedName("client.sl")
    public static int field909 = -1;

    @ObfuscatedName("client.sw")
    public static class331 field916 = new class330();

    @ObfuscatedName("client.sj")
    public static class10[] field917 = new class10[8];

    @ObfuscatedName("client.sp")
    public static class68 field918 = new class68();

    @ObfuscatedName("client.sb")
    public static int field798 = -1;

    @ObfuscatedName("client.so")
    public static ArrayList field920 = new ArrayList(10);

    @ObfuscatedName("client.ss")
    public static int field921 = 0;

    @ObfuscatedName("client.ta")
    public static final class66 field819 = new class66();

    @ObfuscatedName("client.tc")
    public static int[] field923 = new int[50];

    @ObfuscatedName("client.tl")
    public static int[] field877 = new int[50];

    @ObfuscatedName("ae.fj(B)Llq;")
    public static class334 method542() {
        return Statics.field131;
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method804() {
    }

    public final void init() {
        if (!this.method783()) {
            return;
        }
        class286[] var1 = class286.method538();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class286 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3681);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3681)) {
                    case 1:
                        field698 = Integer.parseInt(var4) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class81.field1127)) {
                            field653 = true;
                        } else {
                            field653 = false;
                        }
                        break;
                    case 4:
                        if (field656 == -1) {
                            field656 = Integer.parseInt(var4);
                        }
                        break;
                    case 5:
                        field788 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field655 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field34 = class251.method3175(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class81.field1127)) {
                        }
                        break;
                    case 9:
                        Statics.field3804 = var4;
                        break;
                    case 10:
                        class252[] var5 = new class252[] { class252.field3226, class252.field3222, class252.field3227, class252.field3223, class252.field3220, class252.field3221 };
                        Statics.field39 = (class252) Statics.method2007(var5, Integer.parseInt(var4));
                        if (Statics.field39 == class252.field3227) {
                            Statics.field415 = class335.field4017;
                        } else {
                            Statics.field415 = class335.field4018;
                        }
                        break;
                    case 12:
                        field650 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field1035 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field652 = Integer.parseInt(var4);
                        break;
                    case 17:
                        Statics.field32 = var4;
                }
            }
        }
        class133.field1816 = false;
        field654 = false;
        Statics.field106 = this.getCodeBase().getHost();
        String var6 = Statics.field34.field3216;
        byte var7 = 0;
        try {
            Statics.field646 = 21;
            Statics.field1739 = var7;
            try {
                Statics.field1299 = System.getProperty("os.name");
            } catch (Exception var45) {
                Statics.field1299 = "Unknown";
            }
            Statics.field222 = Statics.field1299.toLowerCase();
            try {
                Statics.field134 = System.getProperty("user.home");
                if (Statics.field134 != null) {
                    Statics.field134 = Statics.field134 + "/";
                }
            } catch (Exception var44) {
            }
            try {
                if (Statics.field222.startsWith("win")) {
                    if (Statics.field134 == null) {
                        Statics.field134 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field134 == null) {
                    Statics.field134 = System.getenv("HOME");
                }
                if (Statics.field134 != null) {
                    Statics.field134 = Statics.field134 + "/";
                }
            } catch (Exception var43) {
            }
            if (Statics.field134 == null) {
                Statics.field134 = "~/";
            }
            Statics.field3697 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field134, "/tmp/", "" };
            Statics.field1990 = new String[] { ".jagex_cache_" + Statics.field1739, ".file_store_" + Statics.field1739 };
            int var11 = 0;
            label248: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2044 = new File(Statics.field134, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2044.exists()) {
                    try {
                        class118 var16 = new class118(Statics.field2044, "rw", 10000L);
                        class190 var17 = new class190((int) var16.method2543());
                        while (var17.field2419 < var17.field2420.length) {
                            int var18 = var16.method2544(var17.field2420, var17.field2419, var17.field2420.length - var17.field2419);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2419 += var18;
                        }
                        var17.field2419 = 0;
                        int var19 = var17.method3443();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method3443();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method3465();
                            if (var20 == 1) {
                                var14 = var17.method3465();
                            }
                        } else {
                            var13 = var17.method3592();
                            if (var20 == 1) {
                                var14 = var17.method3592();
                            }
                        }
                        var16.method2541();
                    } catch (IOException var47) {
                        var47.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class163.method3176(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label223: for (int var24 = 0; var24 < Statics.field1990.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field3697.length; var25++) {
                            File var26 = new File(Statics.field3697[var25] + Statics.field1990[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class163.method3176(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label223;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field134 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
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
                    } catch (Exception var46) {
                        var46.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class163.method3204(new File(var13), (File) null);
                }
                File var36 = new File(var13);
                Statics.field2045 = var36;
                if (!Statics.field2045.exists()) {
                    Statics.field2045.mkdirs();
                }
                File[] var37 = Statics.field2045.listFiles();
                if (var37 == null) {
                    break;
                }
                File[] var38 = var37;
                int var39 = 0;
                while (true) {
                    if (var39 >= var38.length) {
                        break label248;
                    }
                    File var40 = var38[var39];
                    if (!class163.method3176(var40, false)) {
                        var11++;
                        break;
                    }
                    var39++;
                }
            }
            class166.method3063(Statics.field2045);
            class163.method2673();
            class163.field2049 = new class117(new class118(class166.method958("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class163.field2050 = new class117(new class118(class166.method958("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field593 = new class117[Statics.field646];
            for (int var41 = 0; var41 < Statics.field646; var41++) {
                Statics.field593[var41] = new class117(new class118(class166.method958("main_file_cache.idx" + var41), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var48) {
            class160.method2786((String) null, var48);
        }
        Statics.field555 = this;
        Statics.field2019 = field656;
        this.method831(765, 503, 179);
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method795() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2432 = null;
            Statics.field1965 = null;
            Statics.field2433 = (byte[][][]) null;
        } else {
            Statics.field2432 = var1;
            Statics.field1965 = new int[var1.length];
            Statics.field2433 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2432.length; var3++) {
                Statics.field2433[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field2055 = field652 == 0 ? 43594 : field650 + 40000;
        Statics.field93 = field652 == 0 ? 443 : field650 + 50000;
        Statics.field2100 = Statics.field2055;
        Statics.field2653 = class237.field2668;
        Statics.field2660 = class237.field2669;
        Statics.field2661 = class237.field2667;
        Statics.field11 = class237.field2666;
        Statics.field2474 = new class143();
        this.method775();
        this.method843();
        Statics.field1282 = this.method772();
        Statics.field155 = new class170(255, class163.field2049, class163.field2050, 500000);
        Statics.field27 = class73.method1160();
        this.method773();
        String var5 = Statics.field363;
        class51.field444 = this;
        if (var5 != null) {
            class51.field437 = var5;
        }
        if (field652 != 0) {
            field882 = true;
        }
        method5082(Statics.field27.field1037);
        Statics.field355 = new class74(Statics.field415);
    }

    @ObfuscatedName("client.av(B)V")
    public final void method791() {
        field660++;
        this.method1573();
        class256.method1072();
        class225.method204();
        method5295();
        class45 var1 = class45.field399;
        synchronized (class45.field399) {
            class45.field410++;
            class45.field407 = class45.field409;
            class45.field411 = 0;
            if (class45.field400 >= 0) {
                while (class45.field401 != class45.field400) {
                    int var3 = class45.field389[class45.field401];
                    class45.field401 = class45.field401 + 1 & 0x7F;
                    if (var3 < 0) {
                        class45.field391[~var3] = false;
                    } else {
                        if (!class45.field391[var3] && class45.field411 < class45.field405.length - 1) {
                            class45.field405[++class45.field411 - 1] = var3;
                        }
                        class45.field391[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class45.field391[var2] = false;
                }
                class45.field400 = class45.field401;
            }
            if (class45.field411 > 0) {
                class45.field410 = 0;
            }
            class45.field409 = class45.field383;
        }
        class54.method536();
        if (Statics.field1282 != null) {
            int var5 = Statics.field1282.method672();
            field848 = var5;
        }
        if (field658 == 0) {
            method581();
            class53.method1663();
        } else if (field658 == 5) {
            Statics.method1063(this);
            method581();
            class53.method1663();
        } else if (field658 == 10 || field658 == 11) {
            Statics.method1063(this);
        } else if (field658 == 20) {
            Statics.method1063(this);
            this.method1182();
        } else if (field658 == 25) {
            method182();
        }
        if (field658 == 30) {
            this.method1183();
        } else if (field658 == 40 || field658 == 45) {
            this.method1182();
        }
    }

    @ObfuscatedName("client.au(ZB)V")
    public final void method874(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class225.field2558 == 2) {
                    if (Statics.field303 == null) {
                        Statics.field303 = class231.method4252(Statics.field279, Statics.field2552, Statics.field2553);
                        if (Statics.field303 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2549 == null) {
                        Statics.field2549 = new class106(Statics.field2559, Statics.field2548);
                    }
                    if (Statics.field1861.method4074(Statics.field303, Statics.field2551, Statics.field2549, 22050)) {
                        Statics.field1861.method4129();
                        Statics.field1861.method4072(Statics.field537);
                        Statics.field1861.method4076(Statics.field303, Statics.field2554);
                        class225.field2558 = 0;
                        Statics.field303 = null;
                        Statics.field2549 = null;
                        Statics.field279 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1861.method4077();
                class225.field2558 = 0;
                Statics.field303 = null;
                Statics.field2549 = null;
                Statics.field279 = null;
            }
            var2 = false;
        }
        if (var2 && field885 && Statics.field504 != null) {
            Statics.field504.method2254();
        }
        if ((field658 == 10 || field658 == 20 || field658 == 30) && field701 != 0L && class192.method183() > field701) {
            method5082(method161());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field796[var5] = true;
            }
        }
        if (field658 == 0) {
            this.method799(class85.field1168, class85.field1167, arg0);
        } else if (field658 == 5) {
            class85.method3375(Statics.field501, Statics.field913, Statics.field1905, arg0);
        } else if (field658 == 10 || field658 == 11) {
            class85.method3375(Statics.field501, Statics.field913, Statics.field1905, arg0);
        } else if (field658 == 20) {
            class85.method3375(Statics.field501, Statics.field913, Statics.field1905, arg0);
        } else if (field658 == 25) {
            if (field706 == 1) {
                if (field702 > field703) {
                    field703 = field702;
                }
                int var6 = (field703 * 50 - field702 * 50) / field703;
                method2043(class246.field2888 + class81.field1124 + class81.field1122 + var6 + "%" + class81.field1123, false);
            } else if (field706 == 2) {
                if (field704 > field801) {
                    field801 = field704;
                }
                int var7 = (field801 * 50 - field704 * 50) / field801 + 50;
                method2043(class246.field2888 + class81.field1124 + class81.field1122 + var7 + "%" + class81.field1123, false);
            } else {
                method2043(class246.field2888, false);
            }
        } else if (field658 == 30) {
            this.method1186();
        } else if (field658 == 40) {
            method2043(class246.field2889 + class81.field1124 + class246.field2890, false);
        } else if (field658 == 45) {
            method2043(class246.field3039, false);
        }
        if (field658 == 30 && field705 == 0 && !arg0 && !field864) {
            for (int var8 = 0; var8 < field853; var8++) {
                if (field924[var8]) {
                    Statics.field1290.method756(field858[var8], field829[var8], field687[var8], field861[var8]);
                    field924[var8] = false;
                }
            }
        } else if (field658 > 0) {
            Statics.field1290.method755(0, 0);
            for (int var9 = 0; var9 < field853; var9++) {
                field924[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method798() {
        if (Statics.field154.method2020()) {
            Statics.field154.method2008();
        }
        if (Statics.field1970 != null) {
            Statics.field1970.field590 = false;
        }
        Statics.field1970 = null;
        field695.method2099();
        if (class45.field399 != null) {
            class45 var1 = class45.field399;
            synchronized (class45.field399) {
                class45.field399 = null;
            }
        }
        class54.method1959();
        Statics.field1282 = null;
        if (Statics.field504 != null) {
            Statics.field504.method2255();
        }
        if (Statics.field1006 != null) {
            Statics.field1006.method2255();
        }
        if (Statics.field3275 != null) {
            Statics.field3275.method3251();
        }
        class256.method4952();
        if (Statics.field2474 != null) {
            Statics.field2474.method3084();
            Statics.field2474 = null;
        }
        class163.method1159();
    }

    @ObfuscatedName("client.fo(I)V")
    public void method1573() {
        if (field658 == 1000) {
            return;
        }
        long var1 = class192.method183();
        int var3 = (int) (var1 - Statics.field3277);
        Statics.field3277 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class258.field3290 += var3;
        boolean var4;
        if (class258.field3286 == 0 && class258.field3281 == 0 && class258.field3284 == 0 && class258.field3279 == 0) {
            var4 = true;
        } else if (Statics.field3275 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class258.field3290 > 30000) {
                        throw new IOException();
                    }
                    while (class258.field3281 < 200 && class258.field3279 > 0) {
                        class254 var5 = (class254) class258.field3278.method3914();
                        class190 var6 = new class190(4);
                        var6.method3439(1);
                        var6.method3441((int) var5.field2512);
                        Statics.field3275.method3255(var6.field2420, 0, 4);
                        class258.field3294.method3920(var5, var5.field2512);
                        class258.field3279--;
                        class258.field3281++;
                    }
                    while (class258.field3286 < 200 && class258.field3284 > 0) {
                        class254 var7 = (class254) class258.field3282.method3823();
                        class190 var8 = new class190(4);
                        var8.method3439(0);
                        var8.method3441((int) var7.field2512);
                        Statics.field3275.method3255(var8.field2420, 0, 4);
                        var7.method3997();
                        class258.field3280.method3920(var7, var7.field2512);
                        class258.field3284--;
                        class258.field3286++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3275.method3252();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class258.field3290 = 0;
                        byte var11 = 0;
                        if (Statics.field62 == null) {
                            var11 = 8;
                        } else if (class258.field3276 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class258.field3288.field2419;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3275.method3258(class258.field3288.field2420, class258.field3288.field2419, var12);
                            if (class258.field3292 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class258.field3288.field2420[class258.field3288.field2419 + var13] ^= class258.field3292;
                                }
                            }
                            class258.field3288.field2419 += var12;
                            if (class258.field3288.field2419 < var11) {
                                break;
                            }
                            if (Statics.field62 == null) {
                                class258.field3288.field2419 = 0;
                                int var14 = class258.field3288.method3443();
                                int var15 = class258.field3288.method3610();
                                int var16 = class258.field3288.method3443();
                                int var17 = class258.field3288.method3460();
                                long var18 = (long) ((var14 << 16) + var15);
                                class254 var20 = (class254) class258.field3294.method3911(var18);
                                Statics.field3293 = true;
                                if (var20 == null) {
                                    var20 = (class254) class258.field3280.method3911(var18);
                                    Statics.field3293 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field62 = var20;
                                Statics.field1943 = new class190(var17 + var21 + Statics.field62.field3235);
                                Statics.field1943.method3439(var16);
                                Statics.field1943.method3442(var17);
                                class258.field3276 = 8;
                                class258.field3288.field2419 = 0;
                            } else if (class258.field3276 == 0) {
                                if (class258.field3288.field2420[0] == -1) {
                                    class258.field3276 = 1;
                                    class258.field3288.field2419 = 0;
                                } else {
                                    Statics.field62 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1943.field2420.length - Statics.field62.field3235;
                            int var23 = 512 - class258.field3276;
                            if (var23 > var22 - Statics.field1943.field2419) {
                                var23 = var22 - Statics.field1943.field2419;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3275.method3258(Statics.field1943.field2420, Statics.field1943.field2419, var23);
                            if (class258.field3292 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1943.field2420[Statics.field1943.field2419 + var24] ^= class258.field3292;
                                }
                            }
                            Statics.field1943.field2419 += var23;
                            class258.field3276 += var23;
                            if (Statics.field1943.field2419 == var22) {
                                if (Statics.field62.field2512 == 16711935L) {
                                    Statics.field59 = Statics.field1943;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class257 var26 = class258.field3287[var25];
                                        if (var26 != null) {
                                            Statics.field59.field2419 = var25 * 8 + 5;
                                            int var27 = Statics.field59.method3460();
                                            int var28 = Statics.field59.method3460();
                                            var26.method4535(var27, var28);
                                        }
                                    }
                                } else {
                                    class258.field3291.reset();
                                    class258.field3291.update(Statics.field1943.field2420, 0, var22);
                                    int var29 = (int) class258.field3291.getValue();
                                    if (Statics.field62.field3233 != var29) {
                                        try {
                                            Statics.field3275.method3251();
                                        } catch (Exception var35) {
                                        }
                                        class258.field3289++;
                                        Statics.field3275 = null;
                                        class258.field3292 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class258.field3289 = 0;
                                    class258.field3295 = 0;
                                    Statics.field62.field3238.method4527((int) (Statics.field62.field2512 & 0xFFFFL), Statics.field1943.field2420, (Statics.field62.field2512 & 0xFF0000L) == 16711680L, Statics.field3293);
                                }
                                Statics.field62.method3960();
                                if (Statics.field3293) {
                                    class258.field3281--;
                                } else {
                                    class258.field3286--;
                                }
                                class258.field3276 = 0;
                                Statics.field62 = null;
                                Statics.field1943 = null;
                            } else {
                                if (class258.field3276 != 512) {
                                    break;
                                }
                                class258.field3276 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3275.method3251();
                } catch (Exception var34) {
                }
                class258.field3295++;
                Statics.field3275 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1180();
        }
    }

    @ObfuscatedName("client.fm(I)V")
    public void method1180() {
        if (class258.field3289 >= 4) {
            this.method827("js5crc");
            field658 = 1000;
            return;
        }
        if (class258.field3295 >= 4) {
            if (field658 <= 5) {
                this.method827("js5io");
                field658 = 1000;
                return;
            }
            field680 = 3000;
            class258.field3295 = 3;
        }
        if (--field680 + 1 > 0) {
            return;
        }
        try {
            if (field679 == 0) {
                Statics.field424 = Statics.field3849.method3217(Statics.field106, Statics.field2100);
                field679++;
            }
            if (field679 == 1) {
                if (Statics.field424.field2030 == 2) {
                    this.method1181(-1);
                    return;
                }
                if (Statics.field424.field2030 == 1) {
                    field679++;
                }
            }
            if (field679 == 2) {
                if (field698) {
                    Socket var1 = (Socket) Statics.field424.field2033;
                    class167 var2 = new class167(var1, 40000, 5000);
                    Statics.field353 = var2;
                } else {
                    Statics.field353 = new class169((Socket) Statics.field424.field2033, Statics.field3849, 5000);
                }
                class190 var3 = new class190(5);
                var3.method3439(15);
                var3.method3442(179);
                Statics.field353.method3255(var3.field2420, 0, 5);
                field679++;
                Statics.field3372 = class192.method183();
            }
            if (field679 == 3) {
                if (Statics.field353.method3252() > 0 || !field698 && field658 <= 5) {
                    int var4 = Statics.field353.method3253();
                    if (var4 != 0) {
                        this.method1181(var4);
                        return;
                    }
                    field679++;
                } else if (class192.method183() - Statics.field3372 > 30000L) {
                    this.method1181(-2);
                    return;
                }
            }
            if (field679 == 4) {
                class165 var5 = Statics.field353;
                boolean var6 = field658 > 20;
                if (Statics.field3275 != null) {
                    try {
                        Statics.field3275.method3251();
                    } catch (Exception var21) {
                    }
                    Statics.field3275 = null;
                }
                Statics.field3275 = var5;
                if (Statics.field3275 != null) {
                    try {
                        class190 var8 = new class190(4);
                        var8.method3439(var6 ? 2 : 3);
                        var8.method3441(0);
                        Statics.field3275.method3255(var8.field2420, 0, 4);
                    } catch (IOException var20) {
                        try {
                            Statics.field3275.method3251();
                        } catch (Exception var19) {
                        }
                        class258.field3295++;
                        Statics.field3275 = null;
                    }
                }
                class258.field3288.field2419 = 0;
                Statics.field62 = null;
                Statics.field1943 = null;
                class258.field3276 = 0;
                while (true) {
                    class254 var11 = (class254) class258.field3294.method3914();
                    if (var11 == null) {
                        while (true) {
                            class254 var12 = (class254) class258.field3280.method3914();
                            if (var12 == null) {
                                if (class258.field3292 != 0) {
                                    try {
                                        class190 var13 = new class190(4);
                                        var13.method3439(4);
                                        var13.method3439(class258.field3292);
                                        var13.method3440(0);
                                        Statics.field3275.method3255(var13.field2420, 0, 4);
                                    } catch (IOException var18) {
                                        try {
                                            Statics.field3275.method3251();
                                        } catch (Exception var17) {
                                        }
                                        class258.field3295++;
                                        Statics.field3275 = null;
                                    }
                                }
                                class258.field3290 = 0;
                                Statics.field3277 = class192.method183();
                                Statics.field424 = null;
                                Statics.field353 = null;
                                field679 = 0;
                                field738 = 0;
                                return;
                            }
                            class258.field3282.method3820(var12);
                            class258.field3283.method3920(var12, var12.field2512);
                            class258.field3284++;
                            class258.field3286--;
                        }
                    }
                    class258.field3278.method3920(var11, var11.field2512);
                    class258.field3279++;
                    class258.field3281--;
                }
            }
        } catch (IOException var22) {
            this.method1181(-3);
        }
    }

    @ObfuscatedName("client.ff(II)V")
    public void method1181(int arg0) {
        Statics.field424 = null;
        Statics.field353 = null;
        field679 = 0;
        if (Statics.field2100 == Statics.field2055) {
            Statics.field2100 = Statics.field93;
        } else {
            Statics.field2100 = Statics.field2055;
        }
        field738++;
        if (field738 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field658 <= 5) {
                this.method827("js5connect_full");
                field658 = 1000;
            } else {
                field680 = 3000;
            }
        } else if (field738 >= 2 && arg0 == 6) {
            this.method827("js5connect_outofdate");
            field658 = 1000;
        } else if (field738 >= 4) {
            if (field658 <= 5) {
                this.method827("js5connect");
                field658 = 1000;
            } else {
                field680 = 3000;
            }
        }
    }

    @ObfuscatedName("av.fq(Lin;Ljava/lang/String;B)V")
    public static void method560(class257 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field920.add(var2);
    }

    @ObfuscatedName("e.fz(IIB)V")
    public static void method135(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class130.field1779[var4];
            int var8 = method537(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class133.method2913(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("av.fd(I)V")
    public static void method581() {
        if (field852 == 0) {
            Statics.field28 = new class133(4, 104, 104, class56.field508);
            for (int var0 = 0; var0 < 4; var0++) {
                field707[var0] = new class172(104, 104);
            }
            Statics.field1068 = new class328(512, 512);
            class85.field1167 = class246.field2891;
            class85.field1168 = 5;
            field852 = 20;
        } else if (field852 == 20) {
            class85.field1167 = class246.field2892;
            class85.field1168 = 10;
            field852 = 30;
        } else if (field852 == 30) {
            Statics.field276 = Statics.method5290(0, false, true, true);
            Statics.field1957 = Statics.method5290(1, false, true, true);
            Statics.field97 = Statics.method5290(2, true, false, true);
            Statics.field285 = Statics.method5290(3, false, true, true);
            Statics.field541 = Statics.method5290(4, false, true, true);
            Statics.field538 = Statics.method5290(5, true, true, true);
            Statics.field2053 = Statics.method5290(6, true, true, true);
            Statics.field240 = Statics.method5290(7, false, true, true);
            Statics.field3225 = Statics.method5290(8, false, true, true);
            Statics.field2129 = Statics.method5290(9, false, true, true);
            Statics.field2637 = Statics.method5290(10, false, true, true);
            Statics.field212 = Statics.method5290(11, false, true, true);
            Statics.field1976 = Statics.method5290(12, false, true, true);
            Statics.field414 = Statics.method5290(13, true, false, true);
            Statics.field1994 = Statics.method5290(14, false, true, true);
            Statics.field9 = Statics.method5290(15, false, true, true);
            Statics.field2325 = Statics.method5290(17, true, true, true);
            Statics.field640 = Statics.method5290(18, false, true, true);
            Statics.field3631 = Statics.method5290(19, false, true, true);
            Statics.field126 = Statics.method5290(20, false, true, true);
            class85.field1167 = class246.field2893;
            class85.field1168 = 20;
            field852 = 40;
        } else if (field852 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field276.method4543() * 4 / 100;
            int var3 = var2 + Statics.field1957.method4543() * 4 / 100;
            int var4 = var3 + Statics.field97.method4543() * 2 / 100;
            int var5 = var4 + Statics.field285.method4543() * 2 / 100;
            int var6 = var5 + Statics.field541.method4543() * 6 / 100;
            int var7 = var6 + Statics.field538.method4543() * 4 / 100;
            int var8 = var7 + Statics.field2053.method4543() * 2 / 100;
            int var9 = var8 + Statics.field240.method4543() * 56 / 100;
            int var10 = var9 + Statics.field3225.method4543() * 2 / 100;
            int var11 = var10 + Statics.field2129.method4543() * 2 / 100;
            int var12 = var11 + Statics.field2637.method4543() * 2 / 100;
            int var13 = var12 + Statics.field212.method4543() * 2 / 100;
            int var14 = var13 + Statics.field1976.method4543() * 2 / 100;
            int var15 = var14 + Statics.field414.method4543() * 2 / 100;
            int var16 = var15 + Statics.field1994.method4543() * 2 / 100;
            int var17 = var16 + Statics.field9.method4543() * 2 / 100;
            int var18 = var17 + Statics.field3631.method4543() / 100;
            int var19 = var18 + Statics.field640.method4543() / 100;
            int var20 = var19 + Statics.field126.method4543() / 100;
            int var21 = var20 + (Statics.field2325.method4526() && Statics.field2325.method4427() ? 1 : 0);
            if (var21 == 100) {
                method560(Statics.field276, "Animations");
                method560(Statics.field1957, "Skeletons");
                method560(Statics.field541, "Sound FX");
                method560(Statics.field538, "Maps");
                method560(Statics.field2053, "Music Tracks");
                method560(Statics.field240, "Models");
                method560(Statics.field3225, "Sprites");
                method560(Statics.field212, "Music Jingles");
                method560(Statics.field1994, "Music Samples");
                method560(Statics.field9, "Music Patches");
                method560(Statics.field3631, "World Map");
                method560(Statics.field640, "World Map Geography");
                method560(Statics.field126, "World Map Ground");
                Statics.field3228 = new class316();
                Statics.field3228.method5471(Statics.field2325);
                class85.field1167 = class246.field3060;
                class85.field1168 = 30;
                field852 = 45;
            } else {
                if (var21 != 0) {
                    class85.field1167 = class246.field2894 + var21 + "%";
                }
                class85.field1168 = 30;
            }
        } else if (field852 == 45) {
            class103.method1610(22050, !field654, 2);
            class226 var22 = new class226();
            var22.method4079(9, 128);
            Statics.field504 = class103.method539(Statics.field3849, 0, 22050);
            Statics.field504.method2251(var22);
            class257 var23 = Statics.field9;
            class257 var24 = Statics.field1994;
            class257 var25 = Statics.field541;
            Statics.field2551 = var23;
            Statics.field2548 = var24;
            Statics.field2559 = var25;
            Statics.field1861 = var22;
            Statics.field1006 = class103.method539(Statics.field3849, 1, 2048);
            Statics.field61 = new class96();
            Statics.field1006.method2251(Statics.field61);
            Statics.field37 = new class110(22050, Statics.field367);
            class85.field1167 = class246.field2896;
            class85.field1168 = 35;
            field852 = 50;
            Statics.field1098 = new class303(Statics.field3225, Statics.field414);
        } else if (field852 == 50) {
            int var26 = class302.method5292().length;
            field850 = Statics.field1098.method5301(class302.method5292());
            if (field850.size() < var26) {
                class85.field1167 = class246.field2897 + field850.size() * 100 / var26 + "%";
                class85.field1168 = 40;
            } else {
                Statics.field913 = (class305) field850.get(class302.field3749);
                Statics.field1905 = (class305) field850.get(class302.field3752);
                Statics.field501 = (class305) field850.get(class302.field3747);
                Statics.field295 = field916.method5794();
                class85.field1167 = class246.field2898;
                class85.field1168 = 40;
                field852 = 60;
            }
        } else if (field852 == 60) {
            class257 var27 = Statics.field2637;
            class257 var28 = Statics.field3225;
            int var29 = 0;
            if (var27.method4443("title.jpg", "")) {
                var29++;
            }
            if (var28.method4443("logo", "")) {
                var29++;
            }
            if (var28.method4443("logo_deadman_mode", "")) {
                var29++;
            }
            if (var28.method4443("titlebox", "")) {
                var29++;
            }
            if (var28.method4443("titlebutton", "")) {
                var29++;
            }
            if (var28.method4443("runes", "")) {
                var29++;
            }
            if (var28.method4443("title_mute", "")) {
                var29++;
            }
            if (var28.method4443("options_radio_buttons,0", "")) {
                var29++;
            }
            if (var28.method4443("options_radio_buttons,2", "")) {
                var29++;
            }
            if (var28.method4443("options_radio_buttons,4", "")) {
                var29++;
            }
            if (var28.method4443("options_radio_buttons,6", "")) {
                var29++;
            }
            var28.method4443("sl_back", "");
            var28.method4443("sl_flags", "");
            var28.method4443("sl_arrows", "");
            var28.method4443("sl_stars", "");
            var28.method4443("sl_button", "");
            byte var32 = 11;
            if (var29 < var32) {
                class85.field1167 = class246.field2940 + var29 * 100 / var32 + "%";
                class85.field1168 = 50;
            } else {
                class85.field1167 = class246.field2900;
                class85.field1168 = 50;
                Statics.method4729(5);
                field852 = 70;
            }
        } else if (field852 == 70) {
            if (Statics.field97.method4427()) {
                class279.method1680(Statics.field97);
                class266.method1618(Statics.field97);
                class267.method2100(Statics.field97, Statics.field240);
                class275.method3083(Statics.field97, Statics.field240, field654);
                class278.method1173(Statics.field97, Statics.field240);
                class257 var34 = Statics.field97;
                Statics.field3415 = var34;
                class257 var35 = Statics.field97;
                class257 var36 = Statics.field240;
                boolean var37 = field653;
                class305 var38 = Statics.field913;
                Statics.field2059 = var35;
                Statics.field3638 = var36;
                Statics.field3508 = var37;
                Statics.field3509 = Statics.field2059.method4419(10);
                Statics.field128 = var38;
                class257 var39 = Statics.field97;
                class257 var40 = Statics.field276;
                class257 var41 = Statics.field1957;
                Statics.field3634 = var39;
                Statics.field3617 = var40;
                Statics.field1882 = var41;
                class265.method717(Statics.field97, Statics.field240);
                class270.method124(Statics.field97);
                class262.method5012(Statics.field97);
                class239.method1048(Statics.field285, Statics.field240, Statics.field3225, Statics.field414);
                class257 var42 = Statics.field97;
                Statics.field3311 = var42;
                class257 var43 = Statics.field97;
                Statics.field3420 = var43;
                class257 var44 = Statics.field97;
                Statics.field3347 = var44;
                class257 var45 = Statics.field97;
                Statics.field3412 = var45;
                Statics.field154 = new class90();
                class257 var46 = Statics.field97;
                class257 var47 = Statics.field3225;
                class257 var48 = Statics.field414;
                Statics.field3431 = var46;
                Statics.field1992 = var47;
                Statics.field3439 = var48;
                class268.method4605(Statics.field97, Statics.field3225);
                class263.method368(Statics.field97, Statics.field3225);
                class85.field1167 = class246.field2877;
                class85.field1168 = 60;
                field852 = 80;
            } else {
                class85.field1167 = class246.field2901 + Statics.field97.method4534() + "%";
                class85.field1168 = 60;
            }
        } else if (field852 == 80) {
            int var49 = 0;
            if (Statics.field345 == null) {
                Statics.field345 = class329.method4673(Statics.field3225, Statics.field3228.field3827, 0);
            } else {
                var49++;
            }
            if (Statics.field185 == null) {
                Statics.field185 = class329.method4673(Statics.field3225, Statics.field3228.field3820, 0);
            } else {
                var49++;
            }
            if (Statics.field569 == null) {
                class257 var50 = Statics.field3225;
                int var51 = Statics.field3228.field3821;
                class327[] var52;
                if (class329.method4330(var50, var51, 0)) {
                    class327[] var53 = new class327[Statics.field3906];
                    for (int var54 = 0; var54 < Statics.field3906; var54++) {
                        class327 var55 = var53[var54] = new class327();
                        var55.field3886 = Statics.field3901;
                        var55.field3881 = Statics.field3905;
                        var55.field3883 = Statics.field3900[var54];
                        var55.field3885 = Statics.field427[var54];
                        var55.field3882 = Statics.field3904[var54];
                        var55.field3880 = Statics.field3902[var54];
                        var55.field3887 = Statics.field3903;
                        var55.field3884 = Statics.field2455[var54];
                    }
                    Statics.method1977();
                    var52 = var53;
                } else {
                    var52 = null;
                }
                Statics.field569 = var52;
            } else {
                var49++;
            }
            if (Statics.field3264 == null) {
                Statics.field3264 = class329.method3757(Statics.field3225, Statics.field3228.field3829, 0);
            } else {
                var49++;
            }
            if (Statics.field553 == null) {
                Statics.field553 = class329.method3757(Statics.field3225, Statics.field3228.field3823, 0);
            } else {
                var49++;
            }
            if (Statics.field224 == null) {
                Statics.field224 = class329.method3757(Statics.field3225, Statics.field3228.field3824, 0);
            } else {
                var49++;
            }
            if (Statics.field1907 == null) {
                Statics.field1907 = class329.method3757(Statics.field3225, Statics.field3228.field3819, 0);
            } else {
                var49++;
            }
            if (Statics.field69 == null) {
                Statics.field69 = class329.method3757(Statics.field3225, Statics.field3228.field3826, 0);
            } else {
                var49++;
            }
            if (Statics.field3 == null) {
                Statics.field3 = class329.method3757(Statics.field3225, Statics.field3228.field3822, 0);
            } else {
                var49++;
            }
            if (Statics.field1248 == null) {
                class257 var57 = Statics.field3225;
                int var58 = Statics.field3228.field3828;
                class327[] var59;
                if (class329.method4330(var57, var58, 0)) {
                    class327[] var60 = new class327[Statics.field3906];
                    for (int var61 = 0; var61 < Statics.field3906; var61++) {
                        class327 var62 = var60[var61] = new class327();
                        var62.field3886 = Statics.field3901;
                        var62.field3881 = Statics.field3905;
                        var62.field3883 = Statics.field3900[var61];
                        var62.field3885 = Statics.field427[var61];
                        var62.field3882 = Statics.field3904[var61];
                        var62.field3880 = Statics.field3902[var61];
                        var62.field3887 = Statics.field3903;
                        var62.field3884 = Statics.field2455[var61];
                    }
                    Statics.method1977();
                    var59 = var60;
                } else {
                    var59 = null;
                }
                Statics.field1248 = var59;
            } else {
                var49++;
            }
            if (Statics.field2356 == null) {
                class257 var64 = Statics.field3225;
                int var65 = Statics.field3228.field3825;
                class327[] var66;
                if (class329.method4330(var64, var65, 0)) {
                    class327[] var67 = new class327[Statics.field3906];
                    for (int var68 = 0; var68 < Statics.field3906; var68++) {
                        class327 var69 = var67[var68] = new class327();
                        var69.field3886 = Statics.field3901;
                        var69.field3881 = Statics.field3905;
                        var69.field3883 = Statics.field3900[var68];
                        var69.field3885 = Statics.field427[var68];
                        var69.field3882 = Statics.field3904[var68];
                        var69.field3880 = Statics.field3902[var68];
                        var69.field3887 = Statics.field3903;
                        var69.field3884 = Statics.field2455[var68];
                    }
                    Statics.method1977();
                    var66 = var67;
                } else {
                    var66 = null;
                }
                Statics.field2356 = var66;
            } else {
                var49++;
            }
            if (var49 < 11) {
                class85.field1167 = class246.field2903 + var49 * 100 / 12 + "%";
                class85.field1168 = 70;
            } else {
                Statics.field3784 = Statics.field2356;
                Statics.field185.method5660();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                Statics.field569[0].method5634(var71 + var74, var72 + var74, var73 + var74);
                class85.field1167 = class246.field3006;
                class85.field1168 = 70;
                field852 = 90;
            }
        } else if (field852 == 90) {
            if (Statics.field2129.method4427()) {
                Statics.field609 = new class119(Statics.field2129, Statics.field3225, 20, 0.8D, field654 ? 64 : 128);
                class130.method2844(Statics.field609);
                class130.method2823(0.8D);
                field852 = 100;
            } else {
                class85.field1167 = class246.field3046 + "0%";
                class85.field1168 = 90;
            }
        } else if (field852 == 100) {
            int var75 = Statics.field609.method2571();
            if (var75 < 100) {
                class85.field1167 = class246.field3046 + var75 + "%";
                class85.field1168 = 90;
            } else {
                class85.field1167 = class246.field2906;
                class85.field1168 = 90;
                field852 = 110;
            }
        } else if (field852 == 110) {
            Statics.field1970 = new class64();
            Statics.field3849.method3221(Statics.field1970, 10);
            class85.field1167 = class246.field2907;
            class85.field1168 = 92;
            field852 = 120;
        } else if (field852 == 120) {
            if (Statics.field2637.method4443("huffman", "")) {
                class182 var76 = new class182(Statics.field2637.method4442("huffman", ""));
                class307.method1613(var76);
                class85.field1167 = class246.field2909;
                class85.field1168 = 94;
                field852 = 130;
            } else {
                class85.field1167 = class246.field2983 + "%";
                class85.field1168 = 94;
            }
        } else if (field852 == 130) {
            if (!Statics.field285.method4427()) {
                class85.field1167 = class246.field2910 + Statics.field285.method4534() * 4 / 5 + "%";
                class85.field1168 = 96;
            } else if (!Statics.field1976.method4427()) {
                class85.field1167 = class246.field2910 + (80 + Statics.field1976.method4534() / 6) + "%";
                class85.field1168 = 96;
            } else if (Statics.field414.method4427()) {
                class85.field1167 = class246.field2911;
                class85.field1168 = 98;
                field852 = 140;
            } else {
                class85.field1167 = class246.field2910 + (96 + Statics.field414.method4534() / 50) + "%";
                class85.field1168 = 96;
            }
        } else if (field852 == 140) {
            class85.field1168 = 100;
            if (Statics.field3631.method4464(class36.field310.field308)) {
                if (Statics.field131 == null) {
                    Statics.field131 = new class334();
                    Statics.field131.method5816(Statics.field3631, Statics.field640, Statics.field126, Statics.field501, field850, Statics.field569);
                }
                class85.field1167 = class246.field2913;
                field852 = 150;
            } else {
                class85.field1167 = class246.field2912 + Statics.field3631.method4446(class36.field310.field308) / 10 + "%";
            }
        } else if (field852 == 150) {
            Statics.method4729(10);
        }
    }

    @ObfuscatedName("client.fi(I)V")
    public final void method1182() {
        class165 var1 = field695.method2117();
        class197 var2 = field695.field1309;
        try {
            if (field760 == 0) {
                if (Statics.field3503 == null && (field688.method1969() || field844 > 250)) {
                    Statics.field3503 = field688.method1968();
                    field688.method1974();
                    field688 = null;
                }
                if (Statics.field3503 != null) {
                    if (var1 != null) {
                        var1.method3251();
                        var1 = null;
                    }
                    Statics.field564 = null;
                    field697 = false;
                    field844 = 0;
                    field760 = 1;
                }
            }
            if (field760 == 1) {
                if (Statics.field564 == null) {
                    Statics.field564 = Statics.field3849.method3217(Statics.field106, Statics.field2100);
                }
                if (Statics.field564.field2030 == 2) {
                    throw new IOException();
                }
                if (Statics.field564.field2030 == 1) {
                    if (field698) {
                        Socket var3 = (Socket) Statics.field564.field2033;
                        class167 var4 = new class167(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class169((Socket) Statics.field564.field2033, Statics.field3849, 5000);
                    }
                    field695.method2098(var1);
                    Statics.field564 = null;
                    field760 = 2;
                }
            }
            if (field760 == 2) {
                field695.method2101();
                class180 var5 = class180.method5041();
                var5.field2350.method3439(class178.field2328.field2327);
                field695.method2097(var5);
                field695.method2096();
                var2.field2419 = 0;
                field760 = 3;
            }
            if (field760 == 3) {
                if (Statics.field504 != null) {
                    Statics.field504.method2253();
                }
                if (Statics.field1006 != null) {
                    Statics.field1006.method2253();
                }
                boolean var6 = true;
                if (field698 && !var1.method3250(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3253();
                    if (Statics.field504 != null) {
                        Statics.field504.method2253();
                    }
                    if (Statics.field1006 != null) {
                        Statics.field1006.method2253();
                    }
                    if (var7 != 0) {
                        method380(var7);
                        return;
                    }
                    var2.field2419 = 0;
                    field760 = 4;
                }
            }
            if (field760 == 4) {
                if (var2.field2419 < 8) {
                    int var8 = var1.method3252();
                    if (var8 > 8 - var2.field2419) {
                        var8 = 8 - var2.field2419;
                    }
                    if (var8 > 0) {
                        var1.method3258(var2.field2420, var2.field2419, var8);
                        var2.field2419 += var8;
                    }
                }
                if (var2.field2419 == 8) {
                    var2.field2419 = 0;
                    Statics.field138 = var2.method3668();
                    field760 = 5;
                }
            }
            if (field760 == 5) {
                field695.field1309.field2419 = 0;
                field695.method2101();
                class197 var9 = new class197(500);
                int[] var10 = new int[] { Statics.field3503.nextInt(), Statics.field3503.nextInt(), Statics.field3503.nextInt(), Statics.field3503.nextInt() };
                var9.field2419 = 0;
                var9.method3439(1);
                var9.method3442(var10[0]);
                var9.method3442(var10[1]);
                var9.method3442(var10[2]);
                var9.method3442(var10[3]);
                var9.method3444(Statics.field138);
                if (field658 == 40) {
                    var9.method3442(Statics.field166[0]);
                    var9.method3442(Statics.field166[1]);
                    var9.method3442(Statics.field166[2]);
                    var9.method3442(Statics.field166[3]);
                } else {
                    var9.method3439(field915.method32());
                    switch(field915.field1985) {
                        case 0:
                        case 2:
                            var9.method3441(Statics.field420);
                            var9.field2419++;
                            break;
                        case 1:
                            var9.field2419 += 4;
                            break;
                        case 3:
                            LinkedHashMap var12 = Statics.field27.field1032;
                            String var13 = class85.field1179;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method3442((Integer) var12.get(var15));
                    }
                    var9.method3439(class317.field3838.method32());
                    var9.method3446(class85.field1180);
                }
                var9.method3478(class83.field1137, class83.field1138);
                Statics.field166 = var10;
                class180 var18 = class180.method5041();
                var18.field2350.field2419 = 0;
                if (field658 == 40) {
                    var18.field2350.method3439(class178.field2322.field2327);
                } else {
                    var18.field2350.method3439(class178.field2324.field2327);
                }
                var18.field2350.method3440(0);
                int var19 = var18.field2350.field2419;
                var18.field2350.method3442(179);
                var18.field2350.method3442(1);
                var18.field2350.method3439(field656);
                var18.field2350.method3449(var9.field2420, 0, var9.field2419);
                int var20 = var18.field2350.field2419;
                var18.field2350.method3446(class85.field1179);
                var18.field2350.method3439((field864 ? 1 : 0) << 1 | (field654 ? 1 : 0));
                var18.field2350.method3440(Statics.field75);
                var18.field2350.method3440(Statics.field348);
                method4175(var18.field2350);
                var18.field2350.method3446(Statics.field3804);
                var18.field2350.method3442(Statics.field1035);
                class190 var21 = new class190(Statics.field295.method5799());
                Statics.field295.method5800(var21);
                var18.field2350.method3449(var21.field2420, 0, var21.field2420.length);
                var18.field2350.method3439(field656);
                var18.field2350.method3442(0);
                var18.field2350.method3442(Statics.field276.field3244);
                var18.field2350.method3442(Statics.field1957.field3244);
                var18.field2350.method3442(Statics.field97.field3244);
                var18.field2350.method3442(Statics.field285.field3244);
                var18.field2350.method3442(Statics.field541.field3244);
                var18.field2350.method3442(Statics.field538.field3244);
                var18.field2350.method3442(Statics.field2053.field3244);
                var18.field2350.method3442(Statics.field240.field3244);
                var18.field2350.method3442(Statics.field3225.field3244);
                var18.field2350.method3442(Statics.field2129.field3244);
                var18.field2350.method3442(Statics.field2637.field3244);
                var18.field2350.method3442(Statics.field212.field3244);
                var18.field2350.method3442(Statics.field1976.field3244);
                var18.field2350.method3442(Statics.field414.field3244);
                var18.field2350.method3442(Statics.field1994.field3244);
                var18.field2350.method3442(Statics.field9.field3244);
                var18.field2350.method3442(0);
                var18.field2350.method3442(Statics.field2325.field3244);
                var18.field2350.method3442(Statics.field640.field3244);
                var18.field2350.method3442(Statics.field3631.field3244);
                var18.field2350.method3442(Statics.field126.field3244);
                var18.field2350.method3565(var10, var20, var18.field2350.field2419);
                var18.field2350.method3451(var18.field2350.field2419 - var19);
                field695.method2097(var18);
                field695.method2096();
                field695.field1308 = new class198(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method3725(var22);
                field760 = 6;
            }
            if (field760 == 6 && var1.method3252() > 0) {
                int var24 = var1.method3253();
                if (var24 == 21 && field658 == 20) {
                    field760 = 9;
                } else if (var24 == 2) {
                    field760 = 11;
                } else if (var24 == 15 && field658 == 40) {
                    field695.field1313 = -1;
                    field760 = 16;
                } else if (var24 == 64) {
                    field760 = 7;
                } else if (var24 == 23 && field684 < 1) {
                    field684++;
                    field760 = 0;
                } else if (var24 == 29) {
                    field760 = 14;
                } else {
                    method380(var24);
                    return;
                }
            }
            if (field760 == 7 && var1.method3252() > 0) {
                Statics.field203 = var1.method3253();
                field760 = 8;
            }
            if (field760 == 8 && var1.method3252() >= Statics.field203) {
                var1.method3258(var2.field2420, 0, Statics.field203);
                var2.field2419 = 0;
                field760 = 6;
            }
            if (field760 == 9 && var1.method3252() > 0) {
                field685 = (var1.method3253() + 3) * 60;
                field760 = 10;
            }
            if (field760 == 10) {
                field844 = 0;
                class85.method2582(class246.field3124, class246.field2920, field685 / 60 + class246.field2921);
                if (--field685 <= 0) {
                    field760 = 0;
                }
            } else {
                if (field760 == 11 && var1.method3252() >= 1) {
                    Statics.field60 = var1.method3253();
                    field760 = 12;
                }
                if (field760 == 12 && var1.method3252() >= Statics.field60) {
                    boolean var25 = var1.method3253() == 1;
                    var1.method3258(var2.field2420, 0, 4);
                    var2.field2419 = 0;
                    boolean var26 = false;
                    if (var25) {
                        int var27 = var2.method3728() << 24;
                        int var28 = var27 | var2.method3728() << 16;
                        int var29 = var28 | var2.method3728() << 8;
                        int var30 = var29 | var2.method3728();
                        String var31 = class85.field1179;
                        int var32 = var31.length();
                        int var33 = 0;
                        int var34 = 0;
                        while (true) {
                            if (var34 >= var32) {
                                if (Statics.field27.field1032.size() >= 10 && !Statics.field27.field1032.containsKey(var33)) {
                                    Iterator var37 = Statics.field27.field1032.entrySet().iterator();
                                    var37.next();
                                    var37.remove();
                                }
                                Statics.field27.field1032.put(var33, var30);
                                break;
                            }
                            var33 = (var33 << 5) - var33 + var31.charAt(var34);
                            var34++;
                        }
                    }
                    if (field709) {
                        Statics.field27.field1028 = class85.field1179;
                    } else {
                        Statics.field27.field1028 = null;
                    }
                    class73.method3157();
                    field678 = var1.method3253();
                    field748 = var1.method3253() == 1;
                    field826 = var1.method3253();
                    field826 <<= 0x8;
                    field826 += var1.method3253();
                    field768 = var1.method3253();
                    var1.method3258(var2.field2420, 0, 1);
                    var2.field2419 = 0;
                    class176[] var38 = class176.method712();
                    int var39 = var2.method3748();
                    if (var39 < 0 || var39 >= var38.length) {
                        throw new IOException(var39 + " " + var2.field2419);
                    }
                    field695.field1310 = var38[var39];
                    field695.field1313 = field695.field1310.field2155;
                    var1.method3258(var2.field2420, 0, 2);
                    var2.field2419 = 0;
                    field695.field1313 = var2.method3610();
                    try {
                        class47.method704(Statics.field555, "zap");
                    } catch (Throwable var64) {
                    }
                    field760 = 13;
                }
                if (field760 != 13) {
                    if (field760 == 14 && var1.method3252() >= 2) {
                        var2.field2419 = 0;
                        var1.method3258(var2.field2420, 0, 2);
                        var2.field2419 = 0;
                        Statics.field331 = var2.method3610();
                        field760 = 15;
                    }
                    if (field760 == 15 && var1.method3252() >= Statics.field331) {
                        var2.field2419 = 0;
                        var1.method3258(var2.field2420, 0, Statics.field331);
                        var2.field2419 = 0;
                        String var55 = var2.method3647();
                        String var56 = var2.method3647();
                        String var57 = var2.method3647();
                        class85.method2582(var55, var56, var57);
                        Statics.method4729(10);
                    }
                    if (field760 == 16) {
                        if (field695.field1313 == -1) {
                            if (var1.method3252() < 2) {
                                return;
                            }
                            var1.method3258(var2.field2420, 0, 2);
                            var2.field2419 = 0;
                            field695.field1313 = var2.method3610();
                        }
                        if (var1.method3252() >= field695.field1313) {
                            var1.method3258(var2.field2420, 0, field695.field1313);
                            var2.field2419 = 0;
                            int var58 = field695.field1313;
                            field774.method5047();
                            field695.method2101();
                            field695.field1309.field2419 = 0;
                            field695.field1310 = null;
                            field695.field1315 = null;
                            field695.field1316 = null;
                            field695.field1317 = null;
                            field695.field1313 = 0;
                            field695.field1306 = 0;
                            field667 = 0;
                            field787 = 0;
                            field786 = false;
                            field708 = 0;
                            field880 = 0;
                            for (int var59 = 0; var59 < 2048; var59++) {
                                field766[var59] = null;
                            }
                            Statics.field187 = null;
                            for (int var60 = 0; var60 < field693.length; var60++) {
                                class79 var61 = field693[var60];
                                if (var61 != null) {
                                    var61.field966 = -1;
                                    var61.field967 = false;
                                }
                            }
                            class60.method3067();
                            Statics.method4729(30);
                            for (int var62 = 0; var62 < 100; var62++) {
                                field796[var62] = true;
                            }
                            method1061();
                            class89.method377(var2);
                            if (var2.field2419 != var58) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field844++;
                        if (field844 > 2000) {
                            if (field684 < 1) {
                                if (Statics.field2100 == Statics.field2055) {
                                    Statics.field2100 = Statics.field93;
                                } else {
                                    Statics.field2100 = Statics.field2055;
                                }
                                field684++;
                                field760 = 0;
                            } else {
                                method380(-3);
                            }
                        }
                    }
                } else if (var1.method3252() >= field695.field1313) {
                    var2.field2419 = 0;
                    var1.method3258(var2.field2420, 0, field695.field1313);
                    field774.method5054();
                    field665 = 1L;
                    Statics.field1970.field592 = 0;
                    Statics.field244 = true;
                    field783 = true;
                    field683 = -1L;
                    class323.method3361();
                    field695.method2101();
                    field695.field1309.field2419 = 0;
                    field695.field1310 = null;
                    field695.field1315 = null;
                    field695.field1316 = null;
                    field695.field1317 = null;
                    field695.field1313 = 0;
                    field695.field1306 = 0;
                    field667 = 0;
                    field696 = 0;
                    field668 = 0;
                    method87();
                    class54.field482 = 0;
                    class91.method1045();
                    field847 = 0;
                    field805 = false;
                    field888 = 0;
                    field719 = 0;
                    field724 = 0;
                    Statics.field217 = null;
                    field708 = 0;
                    field875 = -1;
                    field880 = 0;
                    field881 = 0;
                    field666 = class84.field1141;
                    field677 = class84.field1141;
                    field691 = 0;
                    class89.method519();
                    for (int var41 = 0; var41 < 2048; var41++) {
                        field766[var41] = null;
                    }
                    for (int var42 = 0; var42 < 32768; var42++) {
                        field693[var42] = null;
                    }
                    field777 = -1;
                    field780.method3996();
                    field781.method3996();
                    for (int var43 = 0; var43 < 4; var43++) {
                        for (int var44 = 0; var44 < 104; var44++) {
                            for (int var45 = 0; var45 < 104; var45++) {
                                field778[var43][var44][var45] = null;
                            }
                        }
                    }
                    field779 = new class213();
                    Statics.field355.method1730();
                    for (int var46 = 0; var46 < Statics.field1419; var46++) {
                        class262 var47 = class262.method3119(var46);
                        if (var47 != null) {
                            class234.field2647[var46] = 0;
                            class234.field2648[var46] = 0;
                        }
                    }
                    Statics.field154.method2023();
                    field820 = -1;
                    if (field821 != -1) {
                        int var48 = field821;
                        if (var48 != -1 && Statics.field2766[var48]) {
                            Statics.field429.method4436(var48);
                            if (Statics.field2681[var48] != null) {
                                boolean var49 = true;
                                for (int var50 = 0; var50 < Statics.field2681[var48].length; var50++) {
                                    if (Statics.field2681[var48][var50] != null) {
                                        if (Statics.field2681[var48][var50].field2692 == 2) {
                                            var49 = false;
                                        } else {
                                            Statics.field2681[var48][var50] = null;
                                        }
                                    }
                                }
                                if (var49) {
                                    Statics.field2681[var48] = null;
                                }
                                Statics.field2766[var48] = false;
                            }
                        }
                    }
                    for (class62 var51 = (class62) field811.method3914(); var51 != null; var51 = (class62) field811.method3915()) {
                        method5009(var51, true);
                    }
                    field821 = -1;
                    field811 = new class210(8);
                    field794 = null;
                    method87();
                    field919.method4303((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var52 = 0; var52 < 8; var52++) {
                        field669[var52] = null;
                        field775[var52] = false;
                    }
                    class60.method3067();
                    field664 = true;
                    for (int var53 = 0; var53 < 100; var53++) {
                        field796[var53] = true;
                    }
                    method1061();
                    Statics.field366 = null;
                    for (int var54 = 0; var54 < 8; var54++) {
                        field917[var54] = new class10();
                    }
                    Statics.field428 = null;
                    class89.method377(var2);
                    Statics.field413 = -1;
                    Statics.method139(false, var2);
                    field695.field1310 = null;
                }
            }
        } catch (IOException var65) {
            if (field684 < 1) {
                if (Statics.field2100 == Statics.field2055) {
                    Statics.field2100 = Statics.field93;
                } else {
                    Statics.field2100 = Statics.field2055;
                }
                field684++;
                field760 = 0;
            } else {
                method380(-2);
            }
        }
    }

    @ObfuscatedName("ay.fb(IB)V")
    public static void method380(int arg0) {
        if (arg0 == -3) {
            class85.method2582(class246.field2952, class246.field2923, class246.field2924);
        } else if (arg0 == -2) {
            class85.method2582(class246.field2914, class246.field2950, class246.field2927);
        } else if (arg0 == -1) {
            class85.method2582(class246.field2928, class246.field3149, class246.field2978);
        } else if (arg0 == 3) {
            class85.field1174 = 3;
            class85.field1173 = 1;
        } else if (arg0 == 4) {
            class85.field1174 = 12;
            class85.field1171 = 0;
        } else if (arg0 == 5) {
            class85.field1173 = 2;
            class85.method2582(class246.field2934, class246.field3107, class246.field2936);
        } else if (arg0 == 68 || !(field657 || arg0 != 6)) {
            class85.method2582(class246.field2937, class246.field2938, class246.field2939);
        } else if (arg0 == 7) {
            class85.method2582(class246.field3091, class246.field2941, class246.field3105);
        } else if (arg0 == 8) {
            class85.method2582(class246.field2943, class246.field2944, class246.field2945);
        } else if (arg0 == 9) {
            class85.method2582(class246.field2946, class246.field2947, class246.field2948);
        } else if (arg0 == 10) {
            class85.method2582(class246.field2935, class246.field3133, class246.field3058);
        } else if (arg0 == 11) {
            class85.method2582(class246.field3094, class246.field2953, class246.field2954);
        } else if (arg0 == 12) {
            class85.method2582(class246.field2955, class246.field2956, class246.field2957);
        } else if (arg0 == 13) {
            class85.method2582(class246.field3079, class246.field2999, class246.field2960);
        } else if (arg0 == 14) {
            class85.method2582(class246.field3121, class246.field2962, class246.field3047);
        } else if (arg0 == 16) {
            class85.method2582(class246.field2964, class246.field2933, class246.field2966);
        } else if (arg0 == 17) {
            class85.method2582(class246.field2967, class246.field3159, class246.field3063);
        } else if (arg0 == 18) {
            class85.field1174 = 12;
            class85.field1171 = 1;
        } else if (arg0 == 19) {
            class85.method2582(class246.field2973, class246.field2974, class246.field2975);
        } else if (arg0 == 20) {
            class85.method2582(class246.field3100, class246.field3033, class246.field2878);
        } else if (arg0 == 22) {
            class85.method2582(class246.field2979, class246.field2980, class246.field2981);
        } else if (arg0 == 23) {
            class85.method2582(class246.field3007, class246.field3117, class246.field2984);
        } else if (arg0 == 24) {
            class85.method2582(class246.field2985, class246.field2986, class246.field2987);
        } else if (arg0 == 25) {
            class85.method2582(class246.field2988, class246.field2989, class246.field3053);
        } else if (arg0 == 26) {
            class85.method2582(class246.field2991, class246.field2992, class246.field2993);
        } else if (arg0 == 27) {
            class85.method2582(class246.field2994, class246.field2995, class246.field2996);
        } else if (arg0 == 31) {
            class85.method2582(class246.field3003, class246.field3004, class246.field3005);
        } else if (arg0 == 32) {
            class85.method2582(class246.field3136, class246.field2919, class246.field3008);
        } else if (arg0 == 37) {
            class85.method2582(class246.field3009, class246.field3010, class246.field3118);
        } else if (arg0 == 38) {
            class85.method2582(class246.field3012, class246.field3013, class246.field2904);
        } else if (arg0 == 55) {
            class85.field1174 = 8;
        } else if (arg0 == 56) {
            class85.method2582(class246.field3019, class246.field3020, class246.field3021);
            Statics.method4729(11);
            return;
        } else if (arg0 == 57) {
            class85.method2582(class246.field3022, class246.field3023, class246.field3024);
            Statics.method4729(11);
            return;
        } else if (arg0 == 61) {
            class85.field1174 = 7;
        } else {
            class85.method2582(class246.field3025, class246.field3026, class246.field3027);
        }
        Statics.method4729(10);
    }

    @ObfuscatedName("s.fx(B)V")
    public static final void method11() {
        field695.method2099();
        class279.field3604.method3879();
        class266.field3370.method3879();
        class267.field3375.method3879();
        class275.field3479.method3879();
        class275.field3456.method3879();
        class275.field3498.method3879();
        class275.field3458.method3879();
        class278.method660();
        class276.method4765();
        class280.field3618.method3879();
        class280.field3619.method3879();
        class265.method509();
        class270.field3404.method3879();
        class262.method4264();
        class274.field3432.method3879();
        class274.field3433.method3879();
        class274.field3434.method3879();
        class268.method4416();
        class272.field3416.method3879();
        class271.method365();
        class263.field3322.method3879();
        class236.field2663.method3879();
        class239.method4328();
        ((class119) Statics.field1756).method2561();
        class92.field1270.method3879();
        Statics.field276.method4437();
        Statics.field1957.method4437();
        Statics.field285.method4437();
        Statics.field541.method4437();
        Statics.field538.method4437();
        Statics.field2053.method4437();
        Statics.field240.method4437();
        Statics.field3225.method4437();
        Statics.field2129.method4437();
        Statics.field2637.method4437();
        Statics.field212.method4437();
        Statics.field1976.method4437();
        Statics.field28.method2879();
        for (int var0 = 0; var0 < 4; var0++) {
            field707[var0].method3334();
        }
        System.gc();
        class225.method3061(2);
        field681 = -1;
        field885 = false;
        for (class75 var1 = (class75) class75.field1062.method3990(); var1 != null; var1 = (class75) class75.field1062.method3984()) {
            if (var1.field1059 != null) {
                Statics.field61.method2120(var1.field1059);
                var1.field1059 = null;
            }
            if (var1.field1051 != null) {
                Statics.field61.method2120(var1.field1051);
                var1.field1051 = null;
            }
        }
        class75.field1062.method3996();
        Statics.method4729(10);
    }

    @ObfuscatedName("kw.fk(I)V")
    public static final void method5297() {
        if (field696 > 0) {
            method11();
        } else {
            field774.method5048();
            Statics.method4729(40);
            Statics.field2435 = field695.method2117();
            field695.method2115();
        }
    }

    @ObfuscatedName("eh.ft(ZS)V")
    public static final void method3174(boolean arg0) {
        if (arg0) {
            field915 = class85.field1183 ? class154.field1986 : class154.field1984;
            return;
        }
        LinkedHashMap var1 = Statics.field27.field1032;
        String var2 = class85.field1179;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field915 = var1.containsKey(var4) ? class154.field1982 : class154.field1983;
    }

    @ObfuscatedName("client.fu(B)V")
    public final void method1183() {
        if (field667 > 1) {
            field667--;
        }
        if (field696 > 0) {
            field696--;
        }
        if (field697) {
            field697 = false;
            method5297();
            return;
        }
        if (!field786) {
            method115();
        }
        for (int var1 = 0; var1 < 100 && this.method1187(field695); var1++) {
        }
        if (field658 != 30) {
            return;
        }
        while (true) {
            class322 var2 = (class322) class323.field3858.method3936();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field774.field3684) {
                    class180 var6 = class180.method625(class177.field2224, field695.field1308);
                    var6.field2350.method3439(0);
                    int var7 = var6.field2350.field2419;
                    field774.method5049(var6.field2350);
                    var6.field2350.method3452(var6.field2350.field2419 - var7);
                    field695.method2097(var6);
                    field774.method5060();
                }
                Object var8 = Statics.field1970.field587;
                synchronized (Statics.field1970.field587) {
                    if (!field828) {
                        Statics.field1970.field592 = 0;
                    } else if (class54.field497 != 0 || Statics.field1970.field592 >= 40) {
                        class180 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1970.field592 && (var9 == null || var9.field2350.field2419 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1970.field586[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1970.field589[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field662 != var16 || field663 != var15) {
                                if (var9 == null) {
                                    var9 = class180.method625(class177.field2254, field695.field1308);
                                    var9.field2350.method3439(0);
                                    var10 = var9.field2350.field2419;
                                    var9.field2350.field2419 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field818 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field662;
                                    var18 = var15 - field663;
                                    var19 = (int) ((Statics.field1970.field591[var14] - field818) / 20L);
                                    var12 = (int) ((Statics.field1970.field591[var14] - field818) % 20L + (long) var12);
                                }
                                field662 = var16;
                                field663 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2350.method3440((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2350.method3439(var19 + 128);
                                    var9.field2350.method3440((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2350.method3439(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2350.method3442(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2350.method3442(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2350.method3440((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2350.method3442(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2350.method3442(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field818 = Statics.field1970.field591[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2350.method3452(var9.field2350.field2419 - var10);
                            int var20 = var9.field2350.field2419;
                            var9.field2350.field2419 = var10;
                            var9.field2350.method3439(var12 / var13);
                            var9.field2350.method3439(var12 % var13);
                            var9.field2350.field2419 = var20;
                            field695.method2097(var9);
                        }
                        if (var11 >= Statics.field1970.field592) {
                            Statics.field1970.field592 = 0;
                        } else {
                            Statics.field1970.field592 -= var11;
                            System.arraycopy(Statics.field1970.field589, var11, Statics.field1970.field589, 0, Statics.field1970.field592);
                            System.arraycopy(Statics.field1970.field586, var11, Statics.field1970.field586, 0, Statics.field1970.field592);
                            System.arraycopy(Statics.field1970.field591, var11, Statics.field1970.field591, 0, Statics.field1970.field592);
                        }
                    }
                }
                if (class54.field497 == 1 || !Statics.field1523 && class54.field497 == 4 || class54.field497 == 2) {
                    long var22 = (class54.field491 - field665 * -1L) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field665 = class54.field491 * -1L;
                    int var24 = class54.field480;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field348) {
                        var24 = Statics.field348;
                    }
                    int var25 = class54.field496;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field75) {
                        var25 = Statics.field75;
                    }
                    int var26 = (int) var22;
                    class180 var27 = class180.method625(class177.field2261, field695.field1308);
                    var27.field2350.method3440((class54.field497 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2350.method3440(var25);
                    var27.field2350.method3440(var24);
                    field695.method2097(var27);
                }
                if (class45.field411 > 0) {
                    class180 var28 = class180.method625(class177.field2287, field695.field1308);
                    var28.field2350.method3440(0);
                    int var29 = var28.field2350.field2419;
                    long var30 = class192.method183();
                    for (int var32 = 0; var32 < class45.field411; var32++) {
                        long var33 = var30 - field683;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field683 = var30;
                        var28.field2350.method3601(class45.field405[var32]);
                        var28.field2350.method3441((int) var33);
                    }
                    var28.field2350.method3451(var28.field2350.field2419 - var29);
                    field695.method2097(var28);
                }
                if (field734 > 0) {
                    field734--;
                }
                if (class45.field391[96] || class45.field391[97] || class45.field391[98] || class45.field391[99]) {
                    field720 = true;
                }
                if (field720 && field734 <= 0) {
                    field734 = 20;
                    field720 = false;
                    class180 var35 = class180.method625(class177.field2303, field695.field1308);
                    var35.field2350.method3492(field718);
                    var35.field2350.method3490(field719);
                    field695.method2097(var35);
                }
                if (Statics.field244 && !field783) {
                    field783 = true;
                    class180 var36 = class180.method625(class177.field2316, field695.field1308);
                    var36.field2350.method3439(1);
                    field695.method2097(var36);
                }
                if (!Statics.field244 && field783) {
                    field783 = false;
                    class180 var37 = class180.method625(class177.field2316, field695.field1308);
                    var37.field2350.method3439(0);
                    field695.method2097(var37);
                }
                if (Statics.field131 != null) {
                    Statics.field131.method5954();
                }
                if (Statics.field226) {
                    if (Statics.field366 != null) {
                        Statics.field366.method5180();
                    }
                    for (int var38 = 0; var38 < class89.field1247; var38++) {
                        class67 var39 = field766[class89.field1244[var38]];
                        var39.method1117();
                    }
                    Statics.field226 = false;
                }
                if (Statics.field2219 != field875) {
                    field875 = Statics.field2219;
                    method1928(Statics.field2219);
                }
                if (field658 != 30) {
                    return;
                }
                for (class69 var40 = (class69) field779.method3990(); var40 != null; var40 = (class69) field779.method3984()) {
                    if (var40.field938 > 0) {
                        var40.field938--;
                    }
                    if (var40.field938 != 0) {
                        if (var40.field932 > 0) {
                            var40.field932--;
                        }
                        if (var40.field932 == 0 && var40.field929 >= 1 && var40.field930 >= 1 && var40.field929 <= 102 && var40.field930 <= 102 && (var40.field934 < 0 || class56.method697(var40.field934, var40.field936))) {
                            method1905(var40.field927, var40.field935, var40.field929, var40.field930, var40.field934, var40.field933, var40.field936);
                            var40.field932 = -1;
                            if (var40.field934 == var40.field931 && var40.field931 == -1) {
                                var40.method3960();
                            } else if (var40.field934 == var40.field931 && var40.field933 == var40.field928 && var40.field937 == var40.field936) {
                                var40.method3960();
                            }
                        }
                    } else if (var40.field931 < 0 || class56.method697(var40.field931, var40.field937)) {
                        method1905(var40.field927, var40.field935, var40.field929, var40.field930, var40.field931, var40.field928, var40.field937);
                        var40.method3960();
                    }
                }
                int var10002;
                for (int var41 = 0; var41 < field888; var41++) {
                    var10002 = field891[var41]--;
                    if (field891[var41] >= -10) {
                        class99 var43 = field893[var41];
                        if (var43 == null) {
                            class99 var10000 = (class99) null;
                            var43 = class99.method2175(Statics.field541, field807[var41], 0);
                            if (var43 == null) {
                                continue;
                            }
                            field891[var41] += var43.method2187();
                            field893[var41] = var43;
                        }
                        if (field891[var41] < 0) {
                            int var50;
                            if (field892[var41] == 0) {
                                var50 = field886;
                            } else {
                                int var44 = (field892[var41] & 0xFF) * 128;
                                int var45 = field892[var41] >> 16 & 0xFF;
                                int var46 = var45 * 128 + 64 - Statics.field187.field948;
                                if (var46 < 0) {
                                    var46 = -var46;
                                }
                                int var47 = field892[var41] >> 8 & 0xFF;
                                int var48 = var47 * 128 + 64 - Statics.field187.field949;
                                if (var48 < 0) {
                                    var48 = -var48;
                                }
                                int var49 = var46 + var48 - 128;
                                if (var49 > var44) {
                                    field891[var41] = -100;
                                    continue;
                                }
                                if (var49 < 0) {
                                    var49 = 0;
                                }
                                var50 = field887 * (var44 - var49) / var44;
                            }
                            if (var50 > 0) {
                                class101 var51 = var43.method2188().method2223(Statics.field37);
                                class111 var52 = class111.method2341(var51, 100, var50);
                                var52.method2344(field890[var41] - 1);
                                Statics.field61.method2124(var52);
                            }
                            field891[var41] = -100;
                        }
                    } else {
                        field888--;
                        for (int var42 = var41; var42 < field888; var42++) {
                            field807[var42] = field807[var42 + 1];
                            field893[var42] = field893[var42 + 1];
                            field890[var42] = field890[var42 + 1];
                            field891[var42] = field891[var42 + 1];
                            field892[var42] = field892[var42 + 1];
                        }
                        var41--;
                    }
                }
                if (field885 && !class225.method2533()) {
                    if (field883 != 0 && field681 != -1) {
                        class225.method540(Statics.field2053, field681, 0, field883, false);
                    }
                    field885 = false;
                }
                field695.field1306++;
                if (field695.field1306 > 750) {
                    method5297();
                    return;
                }
                int var53 = class89.field1247;
                int[] var54 = class89.field1244;
                for (int var55 = 0; var55 < var53; var55++) {
                    class67 var56 = field766[var54[var55]];
                    if (var56 != null) {
                        method1681(var56, 1);
                    }
                }
                method3697();
                method3150();
                field711++;
                if (field673 != 0) {
                    field753 += 20;
                    if (field753 >= 400) {
                        field673 = 0;
                    }
                }
                if (Statics.field2 != null) {
                    field730++;
                    if (field730 >= 15) {
                        method508(Statics.field2);
                        Statics.field2 = null;
                    }
                }
                class239 var57 = Statics.field3586;
                class239 var58 = Statics.field1962;
                Statics.field3586 = null;
                Statics.field1962 = null;
                field827 = null;
                field831 = false;
                field905 = false;
                field871 = 0;
                while (class45.method4722() && field871 < 128) {
                    if (field678 >= 2 && class45.field391[82] && Statics.field3716 == 66) {
                        String var59 = class91.method157();
                        Statics.field555.method774(var59);
                    } else if (field724 != 1 || Statics.field280 <= 0) {
                        field733[field871] = Statics.field3716;
                        field872[field871] = Statics.field280;
                        field871++;
                    }
                }
                if (method158() && class45.field391[82] && class45.field391[81] && field848 != 0) {
                    int var60 = Statics.field187.field632 - field848;
                    if (var60 < 0) {
                        var60 = 0;
                    } else if (var60 > 3) {
                        var60 = 3;
                    }
                    if (Statics.field187.field632 != var60) {
                        int var61 = Statics.field84 + Statics.field187.field999[0];
                        int var62 = Statics.field30 + Statics.field187.field996[0];
                        class180 var63 = class180.method625(class177.field2281, field695.field1308);
                        var63.field2350.method3500(0);
                        var63.field2350.method3490(var62);
                        var63.field2350.method3601(var60);
                        var63.field2350.method3440(var61);
                        field695.method2097(var63);
                    }
                    field848 = 0;
                }
                if (field821 != -1) {
                    method1970(field821, 0, 0, Statics.field75, Statics.field348, 0, 0);
                }
                field835++;
                while (true) {
                    class63 var64;
                    class239 var65;
                    class239 var66;
                    do {
                        var64 = (class63) field922.method3969();
                        if (var64 == null) {
                            while (true) {
                                class63 var67;
                                class239 var68;
                                class239 var69;
                                do {
                                    var67 = (class63) field851.method3969();
                                    if (var67 == null) {
                                        while (true) {
                                            class63 var70;
                                            class239 var71;
                                            class239 var72;
                                            do {
                                                var70 = (class63) field849.method3969();
                                                if (var70 == null) {
                                                    this.method1188();
                                                    method2787();
                                                    if (field823 != null) {
                                                        this.method1416();
                                                    }
                                                    if (Statics.field421 != null) {
                                                        method508(Statics.field421);
                                                        field763++;
                                                        if (class54.field487 == 0) {
                                                            if (field812) {
                                                                if (Statics.field421 == Statics.field1418 && field784 != field722) {
                                                                    class239 var73 = Statics.field421;
                                                                    byte var74 = 0;
                                                                    if (field815 == 1 && var73.field2694 == 206) {
                                                                        var74 = 1;
                                                                    }
                                                                    if (var73.field2814[field722] <= 0) {
                                                                        var74 = 0;
                                                                    }
                                                                    int var75 = method62(var73);
                                                                    boolean var76 = (var75 >> 29 & 0x1) != 0;
                                                                    if (var76) {
                                                                        int var77 = field784;
                                                                        int var78 = field722;
                                                                        var73.field2814[var78] = var73.field2814[var77];
                                                                        var73.field2739[var78] = var73.field2739[var77];
                                                                        var73.field2814[var77] = -1;
                                                                        var73.field2739[var77] = 0;
                                                                    } else if (var74 == 1) {
                                                                        int var79 = field784;
                                                                        int var80 = field722;
                                                                        while (var79 != var80) {
                                                                            if (var79 > var80) {
                                                                                var73.method4341(var79 - 1, var79);
                                                                                var79--;
                                                                            } else if (var79 < var80) {
                                                                                var73.method4341(var79 + 1, var79);
                                                                                var79++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var73.method4341(field722, field784);
                                                                    }
                                                                    class180 var81 = class180.method625(class177.field2300, field695.field1308);
                                                                    var81.field2350.method3440(field722);
                                                                    var81.field2350.method3490(field784);
                                                                    var81.field2350.method3442(Statics.field421.field2690);
                                                                    var81.field2350.method3601(var74);
                                                                    field695.method2097(var81);
                                                                }
                                                            } else if (this.method1189()) {
                                                                this.method1539(field686, field810);
                                                            } else if (field787 > 0) {
                                                                int var82 = field686;
                                                                int var83 = field810;
                                                                class82 var84 = Statics.field25;
                                                                method667(var84.field1135, var84.field1129, var84.field1131, var84.field1132, var84.field1133, var84.field1133, var82, var83);
                                                                Statics.field25 = null;
                                                            }
                                                            field730 = 10;
                                                            class54.field497 = 0;
                                                            Statics.field421 = null;
                                                        } else if (field763 >= 5 && (class54.field488 > field686 + 5 || class54.field488 < field686 - 5 || class54.field489 > field810 + 5 || class54.field489 < field810 - 5)) {
                                                            field812 = true;
                                                        }
                                                    }
                                                    if (class133.method3042()) {
                                                        int var85 = class133.field1829;
                                                        int var86 = class133.field1840;
                                                        class180 var87 = class180.method625(class177.field2319, field695.field1308);
                                                        var87.field2350.method3439(5);
                                                        var87.field2350.method3491(Statics.field30 + var86);
                                                        var87.field2350.method3491(Statics.field84 + var85);
                                                        var87.field2350.method3481(class45.field391[82] ? (class45.field391[81] ? 2 : 1) : 0);
                                                        field695.method2097(var87);
                                                        class133.method2927();
                                                        field751 = class54.field496;
                                                        field752 = class54.field480;
                                                        field673 = 1;
                                                        field753 = 0;
                                                        field880 = var85;
                                                        field881 = var86;
                                                    }
                                                    if (Statics.field3586 != var57) {
                                                        if (var57 != null) {
                                                            method508(var57);
                                                        }
                                                        if (Statics.field3586 != null) {
                                                            method508(Statics.field3586);
                                                        }
                                                    }
                                                    if (Statics.field1962 != var58 && field802 == field770) {
                                                        if (var58 != null) {
                                                            method508(var58);
                                                        }
                                                        if (Statics.field1962 != null) {
                                                            method508(Statics.field1962);
                                                        }
                                                    }
                                                    if (Statics.field1962 == null) {
                                                        if (field770 > 0) {
                                                            field770--;
                                                        }
                                                    } else if (field770 < field802) {
                                                        field770++;
                                                        if (field802 == field770) {
                                                            method508(Statics.field1962);
                                                        }
                                                    }
                                                    if (field724 == 0) {
                                                        int var88 = Statics.field187.field948;
                                                        int var89 = Statics.field187.field949;
                                                        if (Statics.field726 - var88 < -500 || Statics.field726 - var88 > 500 || Statics.field136 - var89 < -500 || Statics.field136 - var89 > 500) {
                                                            Statics.field726 = var88;
                                                            Statics.field136 = var89;
                                                        }
                                                        if (Statics.field726 != var88) {
                                                            Statics.field726 += (var88 - Statics.field726) / 16;
                                                        }
                                                        if (Statics.field136 != var89) {
                                                            Statics.field136 += (var89 - Statics.field136) / 16;
                                                        }
                                                        int var90 = Statics.field726 >> 7;
                                                        int var91 = Statics.field136 >> 7;
                                                        int var92 = method3376(Statics.field726, Statics.field136, Statics.field2219);
                                                        int var93 = 0;
                                                        if (var90 > 3 && var91 > 3 && var90 < 100 && var91 < 100) {
                                                            for (int var94 = var90 - 4; var94 <= var90 + 4; var94++) {
                                                                for (int var95 = var91 - 4; var95 <= var91 + 4; var95++) {
                                                                    int var96 = Statics.field2219;
                                                                    if (var96 < 3 && (class56.field506[1][var94][var95] & 0x2) == 2) {
                                                                        var96++;
                                                                    }
                                                                    int var97 = var92 - class56.field508[var96][var94][var95];
                                                                    if (var97 > var93) {
                                                                        var93 = var97;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var98 = var93 * 192;
                                                        if (var98 > 98048) {
                                                            var98 = 98048;
                                                        }
                                                        if (var98 < 32768) {
                                                            var98 = 32768;
                                                        }
                                                        if (var98 > field736) {
                                                            field736 += (var98 - field736) / 24;
                                                        } else if (var98 < field736) {
                                                            field736 += (var98 - field736) / 80;
                                                        }
                                                        Statics.field2539 = method3376(Statics.field187.field948, Statics.field187.field949, Statics.field2219) - field725;
                                                    } else if (field724 == 1) {
                                                        method3355();
                                                        short var99 = -1;
                                                        if (class45.field391[33]) {
                                                            var99 = 0;
                                                        } else if (class45.field391[49]) {
                                                            var99 = 1024;
                                                        }
                                                        if (class45.field391[48]) {
                                                            if (var99 == 0) {
                                                                var99 = 1792;
                                                            } else if (var99 == 1024) {
                                                                var99 = 1280;
                                                            } else {
                                                                var99 = 1536;
                                                            }
                                                        } else if (class45.field391[50]) {
                                                            if (var99 == 0) {
                                                                var99 = 256;
                                                            } else if (var99 == 1024) {
                                                                var99 = 768;
                                                            } else {
                                                                var99 = 512;
                                                            }
                                                        }
                                                        byte var100 = 0;
                                                        if (class45.field391[35]) {
                                                            var100 = -1;
                                                        } else if (class45.field391[51]) {
                                                            var100 = 1;
                                                        }
                                                        int var101 = 0;
                                                        if (var99 >= 0 || var100 != 0) {
                                                            int var102 = class45.field391[81] ? field731 : field789;
                                                            var101 = var102 * 16;
                                                            field728 = var99;
                                                            field729 = var100;
                                                        }
                                                        if (field791 < var101) {
                                                            field791 += var101 / 8;
                                                            if (field791 > var101) {
                                                                field791 = var101;
                                                            }
                                                        } else if (field791 > var101) {
                                                            field791 = field791 * 9 / 10;
                                                        }
                                                        if (field791 > 0) {
                                                            int var103 = field791 / 16;
                                                            if (field728 >= 0) {
                                                                int var104 = field728 - Statics.field544 & 0x7FF;
                                                                int var105 = class130.field1779[var104];
                                                                int var106 = class130.field1768[var104];
                                                                Statics.field726 += var103 * var105 / 65536;
                                                                Statics.field136 += var103 * var106 / 65536;
                                                            }
                                                            if (field729 != 0) {
                                                                Statics.field2539 += field729 * var103;
                                                                if (Statics.field2539 > 0) {
                                                                    Statics.field2539 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field728 = -1;
                                                            field729 = -1;
                                                        }
                                                        if (class45.field391[13]) {
                                                            method1050();
                                                        }
                                                    }
                                                    if (class54.field487 == 4 && Statics.field1523) {
                                                        int var107 = class54.field489 - field723;
                                                        field721 = var107 * 2;
                                                        field723 = var107 == -1 || var107 == 1 ? class54.field489 : (field723 + class54.field489) / 2;
                                                        int var108 = field845 - class54.field488;
                                                        field767 = var108 * 2;
                                                        field845 = var108 == -1 || var108 == 1 ? class54.field488 : (field845 + class54.field488) / 2;
                                                    } else {
                                                        if (class45.field391[96]) {
                                                            field767 += (-24 - field767) / 2;
                                                        } else if (class45.field391[97]) {
                                                            field767 += (24 - field767) / 2;
                                                        } else {
                                                            field767 /= 2;
                                                        }
                                                        if (class45.field391[98]) {
                                                            field721 += (12 - field721) / 2;
                                                        } else if (class45.field391[99]) {
                                                            field721 += (-12 - field721) / 2;
                                                        } else {
                                                            field721 /= 2;
                                                        }
                                                        field723 = class54.field489;
                                                        field845 = class54.field488;
                                                    }
                                                    field719 = field767 / 2 + field719 & 0x7FF;
                                                    field718 += field721 / 2;
                                                    if (field718 < 128) {
                                                        field718 = 128;
                                                    }
                                                    if (field718 > 383) {
                                                        field718 = 383;
                                                    }
                                                    if (field894) {
                                                        method584();
                                                    }
                                                    for (int var109 = 0; var109 < 5; var109++) {
                                                        var10002 = field762[var109]++;
                                                    }
                                                    Statics.field154.method2019();
                                                    int var110 = class54.method1047();
                                                    int var111 = class45.field410;
                                                    if (var110 > 15000 && var111 > 15000) {
                                                        field696 = 250;
                                                        class54.field482 = 14500;
                                                        class180 var113 = class180.method625(class177.field2269, field695.field1308);
                                                        field695.method2097(var113);
                                                    }
                                                    Statics.field355.method1686();
                                                    field695.field1314++;
                                                    if (field695.field1314 > 50) {
                                                        class180 var114 = class180.method625(class177.field2242, field695.field1308);
                                                        field695.method2097(var114);
                                                    }
                                                    try {
                                                        field695.method2096();
                                                    } catch (IOException var116) {
                                                        method5297();
                                                    }
                                                    return;
                                                }
                                                var71 = var70.field575;
                                                if (var71.field2691 < 0) {
                                                    break;
                                                }
                                                var72 = class239.method2052(var71.field2709);
                                            } while (var72 == null || var72.field2686 == null || var71.field2691 >= var72.field2686.length || var72.field2686[var71.field2691] != var71);
                                            class76.method3778(var70);
                                        }
                                    }
                                    var68 = var67.field575;
                                    if (var68.field2691 < 0) {
                                        break;
                                    }
                                    var69 = class239.method2052(var68.field2709);
                                } while (var69 == null || var69.field2686 == null || var68.field2691 >= var69.field2686.length || var69.field2686[var68.field2691] != var68);
                                class76.method3778(var67);
                            }
                        }
                        var65 = var64.field575;
                        if (var65.field2691 < 0) {
                            break;
                        }
                        var66 = class239.method2052(var65.field2709);
                    } while (var66 == null || var66.field2686 == null || var65.field2691 >= var66.field2686.length || var66.field2686[var65.field2691] != var65);
                    class76.method3778(var64);
                }
            }
            class180 var4 = class180.method625(class177.field2311, field695.field1308);
            var4.field2350.method3439(0);
            int var5 = var4.field2350.field2419;
            class323.method3353(var4.field2350);
            var4.field2350.method3452(var4.field2350.field2419 - var5);
            field695.method2097(var4);
        }
    }

    @ObfuscatedName("kw.fr(B)V")
    public static final void method5295() {
        if (Statics.field1006 != null) {
            Statics.field1006.method2252();
        }
        if (Statics.field504 != null) {
            Statics.field504.method2252();
        }
    }

    @ObfuscatedName("z.fc(Lju;IIII)V")
    public static void method292(class280 arg0, int arg1, int arg2, int arg3) {
        if (field888 >= 50 || field887 == 0 || arg0.field3629 == null || arg1 >= arg0.field3629.length) {
            return;
        }
        int var4 = arg0.field3629[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field807[field888] = var5;
        field890[field888] = var6;
        field891[field888] = 0;
        field893[field888] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field892[field888] = (var8 << 16) + (var9 << 8) + var7;
        field888++;
    }

    @ObfuscatedName("jz.fs(IIII)V")
    public static void method4751(int arg0, int arg1, int arg2) {
        if (field886 == 0 || arg1 == 0 || field888 >= 50) {
            return;
        }
        field807[field888] = arg0;
        field890[field888] = arg1;
        field891[field888] = arg2;
        field893[field888] = null;
        field892[field888] = 0;
        field888++;
    }

    @ObfuscatedName("e.fv(IB)V")
    public static void method145(int arg0) {
        if (arg0 == -1 && !field885) {
            class225.method3246();
        } else if (arg0 != -1 && field681 != arg0 && field883 != 0 && !field885) {
            class225.method3397(2, Statics.field2053, arg0, 0, field883, false);
        }
        field681 = arg0;
    }

    @ObfuscatedName("iw.fh(IIB)V")
    public static void method4415(int arg0, int arg1) {
        if (field883 != 0 && arg0 != -1) {
            class225.method540(Statics.field212, arg0, 0, field883, false);
            field885 = true;
        }
    }

    @ObfuscatedName("ay.fa(Lia;III)V")
    public static final void method376(class239 arg0, int arg1, int arg2) {
        if (field708 != 0 && field708 != 3 || field786 || !(class54.field497 == 1 || !Statics.field1523 && class54.field497 == 4)) {
            return;
        }
        class233 var3 = arg0.method4362(true);
        if (var3 == null) {
            return;
        }
        int var4 = class54.field496 - arg1;
        int var5 = class54.field480 - arg2;
        if (!var3.method4256(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2642 / 2;
        int var7 = var5 - var3.field2641 / 2;
        int var8 = field719 & 0x7FF;
        int var9 = class130.field1779[var8];
        int var10 = class130.field1768[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field187.field948 + var11 >> 7;
        int var14 = Statics.field187.field949 - var12 >> 7;
        class180 var15 = class180.method625(class177.field2272, field695.field1308);
        var15.field2350.method3439(18);
        var15.field2350.method3491(Statics.field30 + var14);
        var15.field2350.method3491(Statics.field84 + var13);
        var15.field2350.method3481(class45.field391[82] ? (class45.field391[81] ? 2 : 1) : 0);
        var15.field2350.method3439(var6);
        var15.field2350.method3439(var7);
        var15.field2350.method3440(field719);
        var15.field2350.method3439(57);
        var15.field2350.method3439(0);
        var15.field2350.method3439(0);
        var15.field2350.method3439(89);
        var15.field2350.method3440(Statics.field187.field948);
        var15.field2350.method3440(Statics.field187.field949);
        var15.field2350.method3439(63);
        field695.method2097(var15);
        field880 = var13;
        field881 = var14;
    }

    @ObfuscatedName("ee.fw(B)V")
    public static final void method3150() {
        int[] var0 = class89.field1244;
        for (int var1 = 0; var1 < class89.field1247; var1++) {
            class67 var2 = field766[var0[var1]];
            if (var2 != null && var2.field983 > 0) {
                var2.field983--;
                if (var2.field983 == 0) {
                    var2.field953 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field691; var3++) {
            int var4 = field692[var3];
            class79 var5 = field693[var4];
            if (var5 != null && var5.field983 > 0) {
                var5.field983--;
                if (var5.field983 == 0) {
                    var5.field953 = null;
                }
            }
        }
    }

    @ObfuscatedName("v.fy(Ljava/lang/String;I)V")
    public static final void method220(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field27.field1030 = !Statics.field27.field1030;
            class73.method3157();
            if (Statics.field27.field1030) {
                class91.method696(99, "", "Roofs are now all hidden");
            } else {
                class91.method696(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field882 = !field882;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field769 = !field769;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field700 = !field700;
        }
        if (field678 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field131.field3968 = !Statics.field131.field3968;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field882 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field882 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method5297();
            }
        }
        class180 var1 = class180.method625(class177.field2280, field695.field1308);
        var1.field2350.method3439(arg0.length() + 1);
        var1.field2350.method3446(arg0);
        field695.method2097(var1);
    }

    @ObfuscatedName("av.gn(I)V")
    public static final void method584() {
        int var0 = Statics.field223 * 128 + 64;
        int var1 = Statics.field3758 * 128 + 64;
        int var2 = method3376(var0, var1, Statics.field2219) - Statics.field26;
        if (Statics.field350 < var0) {
            Statics.field350 += Statics.field2101 * (var0 - Statics.field350) / 1000 + Statics.field3843;
            if (Statics.field350 > var0) {
                Statics.field350 = var0;
            }
        }
        if (Statics.field350 > var0) {
            Statics.field350 -= Statics.field2101 * (Statics.field350 - var0) / 1000 + Statics.field3843;
            if (Statics.field350 < var0) {
                Statics.field350 = var0;
            }
        }
        if (Statics.field436 < var2) {
            Statics.field436 += Statics.field2101 * (var2 - Statics.field436) / 1000 + Statics.field3843;
            if (Statics.field436 > var2) {
                Statics.field436 = var2;
            }
        }
        if (Statics.field436 > var2) {
            Statics.field436 -= Statics.field2101 * (Statics.field436 - var2) / 1000 + Statics.field3843;
            if (Statics.field436 < var2) {
                Statics.field436 = var2;
            }
        }
        if (Statics.field3753 < var1) {
            Statics.field3753 += Statics.field2101 * (var1 - Statics.field3753) / 1000 + Statics.field3843;
            if (Statics.field3753 > var1) {
                Statics.field3753 = var1;
            }
        }
        if (Statics.field3753 > var1) {
            Statics.field3753 -= Statics.field2101 * (Statics.field3753 - var1) / 1000 + Statics.field3843;
            if (Statics.field3753 < var1) {
                Statics.field3753 = var1;
            }
        }
        int var3 = Statics.field1259 * 128 + 64;
        int var4 = Statics.field340 * 128 + 64;
        int var5 = method3376(var3, var4, Statics.field2219) - Statics.field168;
        int var6 = var3 - Statics.field350;
        int var7 = var5 - Statics.field436;
        int var8 = var4 - Statics.field3753;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2364 < var10) {
            Statics.field2364 += Statics.field2437 * (var10 - Statics.field2364) / 1000 + Statics.field120;
            if (Statics.field2364 > var10) {
                Statics.field2364 = var10;
            }
        }
        if (Statics.field2364 > var10) {
            Statics.field2364 -= Statics.field2437 * (Statics.field2364 - var10) / 1000 + Statics.field120;
            if (Statics.field2364 < var10) {
                Statics.field2364 = var10;
            }
        }
        int var12 = var11 - Statics.field544;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field544 += Statics.field2437 * var12 / 1000 + Statics.field120;
            Statics.field544 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field544 -= Statics.field2437 * -var12 / 1000 + Statics.field120;
            Statics.field544 &= 0x7FF;
        }
        int var13 = var11 - Statics.field544;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field544 = var11;
        }
    }

    @ObfuscatedName("gj.ga(I)V")
    public static final void method3697() {
        for (int var0 = 0; var0 < field691; var0++) {
            int var1 = field692[var0];
            class79 var2 = field693[var1];
            if (var2 != null) {
                method1681(var2, var2.field1103.field3571);
            }
        }
    }

    @ObfuscatedName("bt.gi(Lbq;II)V")
    public static final void method1681(class70 arg0, int arg1) {
        if (arg0.field986 > field660) {
            method1965(arg0);
        } else if (arg0.field987 >= field660) {
            Statics.method3424(arg0);
        } else {
            arg0.field970 = arg0.field952;
            if (arg0.field994 == 0) {
                arg0.field998 = 0;
            } else {
                label322: {
                    if (arg0.field939 != -1 && arg0.field975 == 0) {
                        class280 var2 = class280.method3173(arg0.field939);
                        if (arg0.field951 > 0 && var2.field3632 == 0) {
                            arg0.field998++;
                            break label322;
                        }
                        if (arg0.field951 <= 0 && var2.field3625 == 0) {
                            arg0.field998++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field948;
                    int var4 = arg0.field949;
                    int var5 = arg0.field999[arg0.field994 - 1] * 128 + arg0.field943 * 64;
                    int var6 = arg0.field996[arg0.field994 - 1] * 128 + arg0.field943 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field991 = 1280;
                        } else if (var4 > var6) {
                            arg0.field991 = 1792;
                        } else {
                            arg0.field991 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field991 = 768;
                        } else if (var4 > var6) {
                            arg0.field991 = 256;
                        } else {
                            arg0.field991 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field991 = 1024;
                    } else if (var4 > var6) {
                        arg0.field991 = 0;
                    }
                    byte var7 = arg0.field956[arg0.field994 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field991 - arg0.field990 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field980;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field945;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field972;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field950;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field945;
                        }
                        arg0.field970 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class79) {
                            var11 = ((class79) arg0).field1103.field3566;
                        }
                        if (var11) {
                            if (arg0.field991 != arg0.field990 && arg0.field966 == -1 && arg0.field940 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field994 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field994 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field998 > 0 && arg0.field994 > 1) {
                                var10 = 8;
                                arg0.field998--;
                            }
                        } else {
                            if (arg0.field994 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field994 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field998 > 0 && arg0.field994 > 1) {
                                var10 = 8;
                                arg0.field998--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field970 == arg0.field945 && arg0.field969 != -1) {
                            arg0.field970 = arg0.field969;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field948 += var10;
                                if (arg0.field948 > var5) {
                                    arg0.field948 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field948 -= var10;
                                if (arg0.field948 < var5) {
                                    arg0.field948 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field949 += var10;
                                if (arg0.field949 > var6) {
                                    arg0.field949 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field949 -= var10;
                                if (arg0.field949 < var6) {
                                    arg0.field949 = var6;
                                }
                            }
                        }
                        if (arg0.field948 == var5 && arg0.field949 == var6) {
                            arg0.field994--;
                            if (arg0.field951 > 0) {
                                arg0.field951--;
                            }
                        }
                    } else {
                        arg0.field948 = var5;
                        arg0.field949 = var6;
                        arg0.field994--;
                        if (arg0.field951 > 0) {
                            arg0.field951--;
                        }
                    }
                }
            }
        }
        if (arg0.field948 < 128 || arg0.field949 < 128 || arg0.field948 >= 13184 || arg0.field949 >= 13184) {
            arg0.field939 = -1;
            arg0.field977 = -1;
            arg0.field986 = 0;
            arg0.field987 = 0;
            arg0.field948 = arg0.field999[0] * 128 + arg0.field943 * 64;
            arg0.field949 = arg0.field996[0] * 128 + arg0.field943 * 64;
            arg0.method1588();
        }
        if (Statics.field187 == arg0 && (arg0.field948 < 1536 || arg0.field949 < 1536 || arg0.field948 >= 11776 || arg0.field949 >= 11776)) {
            arg0.field939 = -1;
            arg0.field977 = -1;
            arg0.field986 = 0;
            arg0.field987 = 0;
            arg0.field948 = arg0.field999[0] * 128 + arg0.field943 * 64;
            arg0.field949 = arg0.field996[0] * 128 + arg0.field943 * 64;
            arg0.method1588();
        }
        method1053(arg0);
        arg0.field942 = false;
        if (arg0.field970 != -1) {
            class280 var12 = class280.method3173(arg0.field970);
            if (var12 == null || var12.field3620 == null) {
                arg0.field970 = -1;
            } else {
                arg0.field971++;
                if (arg0.field981 < var12.field3620.length && arg0.field971 > var12.field3622[arg0.field981]) {
                    arg0.field971 = 1;
                    arg0.field981++;
                    method292(var12, arg0.field981, arg0.field948, arg0.field949);
                }
                if (arg0.field981 >= var12.field3620.length) {
                    arg0.field971 = 0;
                    arg0.field981 = 0;
                    method292(var12, arg0.field981, arg0.field948, arg0.field949);
                }
            }
        }
        if (arg0.field977 != -1 && field660 >= arg0.field941) {
            if (arg0.field965 < 0) {
                arg0.field965 = 0;
            }
            int var13 = class265.method2303(arg0.field977).field3359;
            if (var13 == -1) {
                arg0.field977 = -1;
            } else {
                class280 var14 = class280.method3173(var13);
                if (var14 == null || var14.field3620 == null) {
                    arg0.field977 = -1;
                } else {
                    arg0.field979++;
                    if (arg0.field965 < var14.field3620.length && arg0.field979 > var14.field3622[arg0.field965]) {
                        arg0.field979 = 1;
                        arg0.field965++;
                        method292(var14, arg0.field965, arg0.field948, arg0.field949);
                    }
                    if (arg0.field965 >= var14.field3620.length && (arg0.field965 < 0 || arg0.field965 >= var14.field3620.length)) {
                        arg0.field977 = -1;
                    }
                }
            }
        }
        if (arg0.field939 != -1 && arg0.field975 <= 1) {
            class280 var15 = class280.method3173(arg0.field939);
            if (var15.field3632 == 1 && arg0.field951 > 0 && arg0.field986 <= field660 && arg0.field987 < field660) {
                arg0.field975 = 1;
                return;
            }
        }
        if (arg0.field939 != -1 && arg0.field975 == 0) {
            class280 var16 = class280.method3173(arg0.field939);
            if (var16 == null || var16.field3620 == null) {
                arg0.field939 = -1;
            } else {
                arg0.field974++;
                if (arg0.field973 < var16.field3620.length && arg0.field974 > var16.field3622[arg0.field973]) {
                    arg0.field974 = 1;
                    arg0.field973++;
                    method292(var16, arg0.field973, arg0.field948, arg0.field949);
                }
                if (arg0.field973 >= var16.field3620.length) {
                    arg0.field973 -= var16.field3624;
                    arg0.field976++;
                    if (arg0.field976 >= var16.field3630) {
                        arg0.field939 = -1;
                    } else if (arg0.field973 >= 0 && arg0.field973 < var16.field3620.length) {
                        method292(var16, arg0.field973, arg0.field948, arg0.field949);
                    } else {
                        arg0.field939 = -1;
                    }
                }
                arg0.field942 = var16.field3626;
            }
        }
        if (arg0.field975 > 0) {
            arg0.field975--;
        }
    }

    @ObfuscatedName("cb.gy(Lbq;I)V")
    public static final void method1965(class70 arg0) {
        int var1 = arg0.field986 - field660;
        int var2 = arg0.field982 * 128 + arg0.field943 * 64;
        int var3 = arg0.field984 * 128 + arg0.field943 * 64;
        arg0.field948 += (var2 - arg0.field948) / var1;
        arg0.field949 += (var3 - arg0.field949) / var1;
        arg0.field998 = 0;
        arg0.field991 = arg0.field988;
    }

    @ObfuscatedName("bk.gu(Lbq;I)V")
    public static final void method1053(class70 arg0) {
        if (arg0.field940 == 0) {
            return;
        }
        if (arg0.field966 != -1) {
            class70 var1 = null;
            if (arg0.field966 < 32768) {
                var1 = field693[arg0.field966];
            } else if (arg0.field966 >= 32768) {
                var1 = field766[arg0.field966 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field948 - var1.field948;
                int var3 = arg0.field949 - var1.field949;
                if (var2 != 0 || var3 != 0) {
                    arg0.field991 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field967) {
                arg0.field966 = -1;
                arg0.field967 = false;
            }
        }
        if (arg0.field968 != -1 && (arg0.field994 == 0 || arg0.field998 > 0)) {
            arg0.field991 = arg0.field968;
            arg0.field968 = -1;
        }
        int var4 = arg0.field991 - arg0.field990 & 0x7FF;
        if (var4 == 0 && arg0.field967) {
            arg0.field966 = -1;
            arg0.field967 = false;
        }
        if (var4 == 0) {
            arg0.field992 = 0;
            return;
        }
        arg0.field992++;
        if (var4 > 1024) {
            arg0.field990 -= arg0.field940;
            boolean var5 = true;
            if (var4 < arg0.field940 || var4 > 2048 - arg0.field940) {
                arg0.field990 = arg0.field991;
                var5 = false;
            }
            if (arg0.field970 == arg0.field952 && (arg0.field992 > 25 || var5)) {
                if (arg0.field946 == -1) {
                    arg0.field970 = arg0.field945;
                } else {
                    arg0.field970 = arg0.field946;
                }
            }
        } else {
            arg0.field990 += arg0.field940;
            boolean var6 = true;
            if (var4 < arg0.field940 || var4 > 2048 - arg0.field940) {
                arg0.field990 = arg0.field991;
                var6 = false;
            }
            if (arg0.field970 == arg0.field952 && (arg0.field992 > 25 || var6)) {
                if (arg0.field947 == -1) {
                    arg0.field970 = arg0.field945;
                } else {
                    arg0.field970 = arg0.field947;
                }
            }
        }
        arg0.field990 &= 0x7FF;
    }

    @ObfuscatedName("dp.gz(I)V")
    public static void method2787() {
        if (Statics.field131 != null) {
            Statics.field131.method5827(Statics.field2219, (Statics.field187.field948 >> 7) + Statics.field84, (Statics.field187.field949 >> 7) + Statics.field30, false);
            Statics.field131.method5918();
        }
    }

    @ObfuscatedName("o.gx(Lbw;III)V")
    public static void method181(class67 arg0, int arg1, int arg2) {
        if (arg0.field939 == arg1 && arg1 != -1) {
            int var3 = class280.method3173(arg1).field3633;
            if (var3 == 1) {
                arg0.field973 = 0;
                arg0.field974 = 0;
                arg0.field975 = arg2;
                arg0.field976 = 0;
            }
            if (var3 == 2) {
                arg0.field976 = 0;
            }
        } else if (arg1 == -1 || arg0.field939 == -1 || class280.method3173(arg1).field3627 >= class280.method3173(arg0.field939).field3627) {
            arg0.field939 = arg1;
            arg0.field973 = 0;
            arg0.field974 = 0;
            arg0.field975 = arg2;
            arg0.field976 = 0;
            arg0.field951 = arg0.field994;
        }
    }

    @ObfuscatedName("l.go(I)I")
    public static int method161() {
        return field864 ? 2 : 1;
    }

    @ObfuscatedName("km.gj(II)V")
    public static void method5082(int arg0) {
        field701 = 0L;
        if (arg0 >= 2) {
            field864 = true;
        } else {
            field864 = false;
        }
        if (method161() == 1) {
            Statics.field555.method770(765, 503);
        } else {
            Statics.field555.method770(7680, 2160);
        }
        if (field658 >= 25) {
            method1061();
        }
    }

    @ObfuscatedName("br.gm(I)V")
    public static void method1061() {
        class180 var0 = class180.method625(class177.field2314, field695.field1308);
        var0.field2350.method3439(method161());
        var0.field2350.method3440(Statics.field75);
        var0.field2350.method3440(Statics.field348);
        field695.method2097(var0);
    }

    @ObfuscatedName("client.r(I)V")
    public final void method778() {
        field701 = class192.method183() + 500L;
        this.method1185();
        if (field821 != -1) {
            this.method1191(true);
        }
    }

    @ObfuscatedName("client.gl(I)V")
    public void method1185() {
        int var1 = Statics.field75;
        int var2 = Statics.field348;
        if (this.field458 < var1) {
            int var3 = this.field458;
        }
        if (this.field459 < var2) {
            int var4 = this.field459;
        }
        if (Statics.field27 == null) {
            return;
        }
        try {
            client var5 = Statics.field555;
            Object[] var6 = new Object[] { method161() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gh(B)V")
    public final void method1186() {
        if (field821 != -1) {
            method293(field821);
        }
        for (int var1 = 0; var1 < field853; var1++) {
            if (field796[var1]) {
                field924[var1] = true;
            }
            field857[var1] = field796[var1];
            field796[var1] = false;
        }
        field659 = field660;
        field799 = -1;
        field800 = -1;
        Statics.field1418 = null;
        if (field821 != -1) {
            field853 = 0;
            method1964(field821, 0, 0, Statics.field75, Statics.field348, 0, 0, -1);
        }
        class324.method5542();
        if (field755) {
            if (field673 == 1) {
                Statics.field69[field753 / 100].method5668(field751 - 8, field752 - 8);
            }
            if (field673 == 2) {
                Statics.field69[field753 / 100 + 4].method5668(field751 - 8, field752 - 8);
            }
        }
        if (field786) {
            method187();
        } else if (field799 != -1) {
            method3364(field799, field800);
        }
        if (field705 == 3) {
            for (int var2 = 0; var2 < field853; var2++) {
                if (field857[var2]) {
                    class324.method5550(field858[var2], field829[var2], field687[var2], field861[var2], 16711935, 128);
                } else if (field924[var2]) {
                    class324.method5550(field858[var2], field829[var2], field687[var2], field861[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field2219;
        int var4 = Statics.field187.field948;
        int var5 = Statics.field187.field949;
        int var6 = field711;
        for (class75 var7 = (class75) class75.field1062.method3990(); var7 != null; var7 = (class75) class75.field1062.method3984()) {
            if (var7.field1054 != -1 || var7.field1055 != null) {
                int var8 = 0;
                if (var4 > var7.field1063) {
                    var8 += var4 - var7.field1063;
                } else if (var4 < var7.field1053) {
                    var8 += var7.field1053 - var4;
                }
                if (var5 > var7.field1056) {
                    var8 += var5 - var7.field1056;
                } else if (var5 < var7.field1058) {
                    var8 += var7.field1058 - var5;
                }
                if (var8 - 64 > var7.field1057 || field887 == 0 || var7.field1052 != var3) {
                    if (var7.field1059 != null) {
                        Statics.field61.method2120(var7.field1059);
                        var7.field1059 = null;
                    }
                    if (var7.field1051 != null) {
                        Statics.field61.method2120(var7.field1051);
                        var7.field1051 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field887 * (var7.field1057 - var8) / var7.field1057;
                    class99 var10000;
                    if (var7.field1059 != null) {
                        var7.field1059.method2350(var9);
                    } else if (var7.field1054 >= 0) {
                        var10000 = (class99) null;
                        class99 var10 = class99.method2175(Statics.field541, var7.field1054, 0);
                        if (var10 != null) {
                            class101 var11 = var10.method2188().method2223(Statics.field37);
                            class111 var12 = class111.method2341(var11, 100, var9);
                            var12.method2344(-1);
                            Statics.field61.method2124(var12);
                            var7.field1059 = var12;
                        }
                    }
                    if (var7.field1051 != null) {
                        var7.field1051.method2350(var9);
                        if (!var7.field1051.method3961()) {
                            var7.field1051 = null;
                        }
                    } else if (var7.field1055 != null && (var7.field1067 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field1055.length);
                        var10000 = (class99) null;
                        class99 var14 = class99.method2175(Statics.field541, var7.field1055[var13], 0);
                        if (var14 != null) {
                            class101 var15 = var14.method2188().method2223(Statics.field37);
                            class111 var16 = class111.method2341(var15, 100, var9);
                            var16.method2344(0);
                            Statics.field61.method2124(var16);
                            var7.field1051 = var16;
                            var7.field1067 = var7.field1060 + (int) (Math.random() * (double) (var7.field1064 - var7.field1060));
                        }
                    }
                }
            }
        }
        field711 = 0;
    }

    @ObfuscatedName("cq.gr(Ljava/lang/String;ZI)V")
    public static final void method2043(String arg0, boolean arg1) {
        if (!field765) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1905.method5362(arg0, 250);
        int var6 = Statics.field1905.method5317(arg0, 250) * 13;
        class324.method5551(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class324.method5555(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1905.method5358(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method932(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1290.method755(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field853; var11++) {
            if (field858[var11] + field687[var11] > var7 && field858[var11] < var7 + var9 && field861[var11] + field829[var11] > var8 && field829[var11] < var8 + var10) {
                field924[var11] = true;
            }
        }
    }

    @ObfuscatedName("iq.gb(IIIIZI)V")
    public static final void method4582(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field900;
        } else if (var5 >= 100) {
            var6 = field901;
        } else {
            var6 = (field901 - field900) * var5 / 100 + field900;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field906) {
            short var8 = field906;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field873) {
                var6 = field873;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class324.method5542();
                    class324.method5551(arg0, arg1, var10, arg3, -16777216);
                    class324.method5551(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field907) {
            short var11 = field907;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field904) {
                var6 = field904;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class324.method5542();
                    class324.method5551(arg0, arg1, arg2, var13, -16777216);
                    class324.method5551(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field912 = arg3 * var6 / 334;
        if (field910 != arg2 || field651 != arg3) {
            method135(arg2, arg3);
        }
        field699 = arg0;
        field874 = arg1;
        field910 = arg2;
        field651 = arg3;
    }

    @ObfuscatedName("v.gw(B)V")
    public static void method243() {
        int var0 = class89.field1247;
        int[] var1 = class89.field1244;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field777 != var1[var2] && field826 != var1[var2]) {
                method3352(field766[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ft.gc(Lbw;ZS)V")
    public static void method3352(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1116() || arg0.field633) {
            return;
        }
        arg0.field614 = false;
        if ((field654 && class89.field1247 > 50 || class89.field1247 > 200) && arg1 && arg0.field970 == arg0.field952) {
            arg0.field614 = true;
        }
        int var2 = arg0.field948 >> 7;
        int var3 = arg0.field949 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class128.method2069(0, 0, 0, false, arg0.field622);
        if (arg0.field624 != null && field660 >= arg0.field637 && field660 < arg0.field620) {
            arg0.field614 = false;
            arg0.field634 = method3376(arg0.field948, arg0.field949, Statics.field2219);
            arg0.field961 = field660;
            Statics.field28.method3040(Statics.field2219, arg0.field948, arg0.field949, arg0.field634, 60, arg0, arg0.field990, var4, arg0.field631, arg0.field626, arg0.field627, arg0.field629);
            return;
        }
        if ((arg0.field948 & 0x7F) == 64 && (arg0.field949 & 0x7F) == 64) {
            if (field908 == field747[var2][var3]) {
                return;
            }
            field747[var2][var3] = field908;
        }
        arg0.field634 = method3376(arg0.field948, arg0.field949, Statics.field2219);
        arg0.field961 = field660;
        Statics.field28.method3011(Statics.field2219, arg0.field948, arg0.field949, arg0.field634, 60, arg0, arg0.field990, var4, arg0.field942);
    }

    @ObfuscatedName("p.gk(ZB)V")
    public static final void method65(boolean arg0) {
        for (int var1 = 0; var1 < field691; var1++) {
            class79 var2 = field693[field692[var1]];
            if (var2 != null && var2.method1116() && var2.field1103.field3590 == arg0 && var2.field1103.method4960()) {
                int var3 = var2.field948 >> 7;
                int var4 = var2.field949 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field943 == 1 && (var2.field948 & 0x7F) == 64 && (var2.field949 & 0x7F) == 64) {
                        if (field908 == field747[var3][var4]) {
                            continue;
                        }
                        field747[var3][var4] = field908;
                    }
                    long var5 = class128.method2069(0, 0, 1, !var2.field1103.field3584, field692[var1]);
                    var2.field961 = field660;
                    Statics.field28.method3011(Statics.field2219, var2.field948, var2.field949, method3376(var2.field948 + (var2.field943 * 64 - 64), var2.field949 + (var2.field943 * 64 - 64), Statics.field2219), var2.field943 * 64 - 64 + 60, var2, var2.field990, var5, var2.field942);
                }
            }
        }
    }

    @ObfuscatedName("bi.gd(I)V")
    public static final void method1022() {
        for (class86 var0 = (class86) field780.method3990(); var0 != null; var0 = (class86) field780.method3984()) {
            if (Statics.field2219 != var0.field1210 || field660 > var0.field1202) {
                var0.method3960();
            } else if (field660 >= var0.field1209) {
                if (var0.field1196 > 0) {
                    class79 var1 = field693[var0.field1196 - 1];
                    if (var1 != null && var1.field948 >= 0 && var1.field948 < 13312 && var1.field949 >= 0 && var1.field949 < 13312) {
                        var0.method1957(var1.field948, var1.field949, method3376(var1.field948, var1.field949, var0.field1210) - var0.field1200, field660);
                    }
                }
                if (var0.field1196 < 0) {
                    int var2 = -var0.field1196 - 1;
                    class67 var3;
                    if (field826 == var2) {
                        var3 = Statics.field187;
                    } else {
                        var3 = field766[var2];
                    }
                    if (var3 != null && var3.field948 >= 0 && var3.field948 < 13312 && var3.field949 >= 0 && var3.field949 < 13312) {
                        var0.method1957(var3.field948, var3.field949, method3376(var3.field948, var3.field949, var0.field1210) - var0.field1200, field660);
                    }
                }
                var0.method1960(field711);
                Statics.field28.method3011(Statics.field2219, (int) var0.field1207, (int) var0.field1208, (int) var0.field1201, 60, var0, var0.field1197, -1L, false);
            }
        }
    }

    @ObfuscatedName("hc.gv(III)V")
    public static final void method4231(int arg0, int arg1) {
        if (field668 == 2) {
            method3239((field671 - Statics.field84 << 7) + field868, (field672 - Statics.field30 << 7) + field675, field878 * 2);
            if (field749 > -1 && field660 % 20 < 10) {
                Statics.field224[0].method5668(field749 + arg0 - 12, field750 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("aw.gf(I)Z")
    public static boolean method516() {
        return (field690 & 0x2) != 0;
    }

    @ObfuscatedName("ed.gt(Lbq;IIIIII)V")
    public static final void method3132(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1116()) {
            return;
        }
        if (arg0 instanceof class79) {
            class278 var6 = ((class79) arg0).field1103;
            if (var6.field3574 != null) {
                var6 = var6.method4959();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class89.field1247;
        int[] var8 = class89.field1244;
        byte var9 = 0;
        if (arg1 < var7 && field660 == arg0.field961 && Statics.method3113((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                method3077(arg0, arg0.field978 + 15);
                class306 var11 = (class306) field850.get(class302.field3752);
                byte var12 = 9;
                var11.method5373(var10.field619.method5236(), field749 + arg2, field750 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field995.method3938()) {
            method3077(arg0, arg0.field978 + 15);
            for (class78 var14 = (class78) arg0.field995.method3936(); var14 != null; var14 = (class78) arg0.field995.method3937()) {
                class71 var15 = var14.method1893(field660);
                if (var15 != null) {
                    class268 var16 = var14.field1101;
                    class328 var17 = var16.method4701();
                    class328 var18 = var16.method4700();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3391;
                    } else {
                        if (var16.field3399 * 2 < var18.field3899) {
                            var19 = var16.field3399;
                        }
                        var20 = var18.field3899 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field660 - var15.field1008;
                    int var24 = var15.field1004 * var20 / var16.field3391;
                    int var27;
                    if (var15.field1009 > var23) {
                        int var25 = var16.field3394 == 0 ? 0 : var23 / var16.field3394 * var16.field3394;
                        int var26 = var15.field1003 * var20 / var16.field3391;
                        var27 = (var24 - var26) * var25 / var15.field1009 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1009 + var16.field3395 - var23;
                        if (var16.field3393 >= 0) {
                            var21 = (var28 << 8) / (var16.field3395 - var16.field3393);
                        }
                    }
                    if (var15.field1004 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field749 > -1) {
                            int var34 = field749 + arg2 - (var20 >> 1);
                            int var35 = field750 + arg3 - var13;
                            class324.method5551(var34, var35, var27, 5, 65280);
                            class324.method5551(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3890;
                        var13 += var30;
                        int var31 = field749 + arg2 - (var20 >> 1);
                        int var32 = field750 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5731(var33, var32, var21);
                            class324.method5544(var33, var32, var29 + var33, var30 + var32);
                            var18.method5731(var33, var32, var21);
                        } else {
                            var17.method5668(var33, var32);
                            class324.method5544(var33, var32, var29 + var33, var30 + var32);
                            var18.method5668(var33, var32);
                        }
                        class324.method5543(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1894()) {
                    var14.method3960();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class67 var37 = (class67) arg0;
            if (var37.field633) {
                return;
            }
            if (var37.field613 != -1 || var37.field628 != -1) {
                method3077(arg0, arg0.field978 + 15);
                if (field749 > -1) {
                    if (var37.field613 != -1) {
                        var36 += 25;
                        Statics.field3264[var37.field613].method5668(field749 + arg2 - 12, field750 + arg3 - var36);
                    }
                    if (var37.field628 != -1) {
                        var36 += 25;
                        Statics.field553[var37.field628].method5668(field749 + arg2 - 12, field750 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field668 == 10 && field670 == var8[arg1]) {
                method3077(arg0, arg0.field978 + 15);
                if (field749 > -1) {
                    int var38 = Statics.field224[1].field3890 + var36;
                    Statics.field224[1].method5668(field749 + arg2 - 12, field750 + arg3 - var38);
                }
            }
        } else {
            class278 var39 = ((class79) arg0).field1103;
            if (var39.field3574 != null) {
                var39 = var39.method4959();
            }
            if (var39.field3593 >= 0 && var39.field3593 < Statics.field553.length) {
                method3077(arg0, arg0.field978 + 15);
                if (field749 > -1) {
                    Statics.field553[var39.field3593].method5668(field749 + arg2 - 12, field750 + arg3 - 30);
                }
            }
            if (field668 == 1 && field863 == field692[arg1 - var7] && field660 % 20 < 10) {
                method3077(arg0, arg0.field978 + 15);
                if (field749 > -1) {
                    Statics.field224[0].method5668(field749 + arg2 - 12, field750 + arg3 - 28);
                }
            }
        }
        if (arg0.field953 != null && (arg1 >= var7 || !arg0.field955 && (field866 == 4 || !arg0.field954 && (field866 == 0 || field866 == 3 || field866 == 1 && ((class67) arg0).method1113())))) {
            method3077(arg0, arg0.field978);
            if (field749 > -1 && field737 < field761) {
                field870[field737] = Statics.field501.method5314(arg0.field953) / 2;
                field741[field737] = Statics.field501.field3780;
                field739[field737] = field749;
                field740[field737] = field750;
                field743[field737] = arg0.field957;
                field744[field737] = arg0.field958;
                field745[field737] = arg0.field983;
                field746[field737] = arg0.field953;
                field737++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field962[var40];
            int var42 = arg0.field960[var40];
            class274 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field660) {
                    continue;
                }
                var43 = class274.method3278(arg0.field960[var40]);
                var44 = var43.field3438;
                if (var43 != null && var43.field3449 != null) {
                    var43 = var43.method4801();
                    if (var43 == null) {
                        arg0.field962[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field963[var40];
            class274 var46 = null;
            if (var45 >= 0) {
                var46 = class274.method3278(var45);
                if (var46 != null && var46.field3449 != null) {
                    var46 = var46.method4801();
                }
            }
            if (var41 - var44 <= field660) {
                if (var43 == null) {
                    arg0.field962[var40] = -1;
                } else {
                    method3077(arg0, arg0.field978 / 2);
                    if (field749 > -1) {
                        if (var40 == 1) {
                            field750 -= 20;
                        }
                        if (var40 == 2) {
                            field749 -= 15;
                            field750 -= 10;
                        }
                        if (var40 == 3) {
                            field749 += 15;
                            field750 -= 10;
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
                        class328 var59 = null;
                        class328 var60 = null;
                        class328 var61 = null;
                        class328 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class328 var72 = var43.method4802();
                        if (var72 != null) {
                            var51 = var72.field3899;
                            int var73 = var72.field3890;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3891;
                        }
                        class328 var74 = var43.method4803();
                        if (var74 != null) {
                            var52 = var74.field3899;
                            int var75 = var74.field3890;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3891;
                        }
                        class328 var76 = var43.method4831();
                        if (var76 != null) {
                            var53 = var76.field3899;
                            int var77 = var76.field3890;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3891;
                        }
                        class328 var78 = var43.method4826();
                        if (var78 != null) {
                            var54 = var78.field3899;
                            int var79 = var78.field3890;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3891;
                        }
                        if (var46 != null) {
                            var59 = var46.method4802();
                            if (var59 != null) {
                                var63 = var59.field3899;
                                int var80 = var59.field3890;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3891;
                            }
                            var60 = var46.method4803();
                            if (var60 != null) {
                                var64 = var60.field3899;
                                int var81 = var60.field3890;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3891;
                            }
                            var61 = var46.method4831();
                            if (var61 != null) {
                                var65 = var61.field3899;
                                int var82 = var61.field3890;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3891;
                            }
                            var62 = var46.method4826();
                            if (var62 != null) {
                                var66 = var62.field3899;
                                int var83 = var62.field3890;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3891;
                            }
                        }
                        class305 var84 = var43.method4804();
                        if (var84 == null) {
                            var84 = Statics.field913;
                        }
                        class305 var85;
                        if (var46 == null) {
                            var85 = Statics.field913;
                        } else {
                            var85 = var46.method4804();
                            if (var85 == null) {
                                var85 = Statics.field913;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4834(arg0.field997[var40]);
                        int var91 = var84.method5314(var90);
                        if (var46 != null) {
                            var87 = var46.method4834(arg0.field964[var40]);
                            var89 = var85.method5314(var87);
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
                        int var108 = arg0.field962[var40] - field660;
                        int var109 = var43.field3443 - var43.field3443 * var108 / var43.field3438;
                        int var110 = var43.field3444 * var108 / var43.field3438 + -var43.field3444;
                        int var111 = field749 + arg2 - (var100 >> 1) + var109;
                        int var112 = field750 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3445 + var112 + 15;
                        int var116 = var115 - var84.field3778;
                        int var117 = var84.field3789 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3445 + var112 + 15;
                            int var119 = var118 - var85.field3778;
                            int var120 = var85.field3789 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3447 >= 0) {
                            var123 = (var108 << 8) / (var43.field3438 - var43.field3447);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5731(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5731(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5731(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5731(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5342(var90, var98 + var111, var115, var43.field3441, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5731(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5731(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5731(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5731(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5342(var87, var106 + var111, var118, var46.field3441, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5668(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5668(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5668(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5668(var101 + var111 - var58, var112);
                            }
                            var84.method5319(var90, var98 + var111, var115, var43.field3441 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5668(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5668(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5668(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5668(var105 + var111 - var70, var112);
                                }
                                var85.method5319(var87, var106 + var111, var118, var46.field3441 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.gg(I)V")
    public static final void method1167() {
        field764 = 0;
        int var0 = (Statics.field187.field948 >> 7) + Statics.field84;
        int var1 = (Statics.field187.field949 >> 7) + Statics.field30;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field764 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field764 = 1;
        }
        if (field764 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field764 = 0;
        }
    }

    @ObfuscatedName("bt.gp(IIIII)V")
    public static final void method1678(int arg0, int arg1, int arg2, int arg3) {
        method1167();
    }

    @ObfuscatedName("ef.ha(Lbq;II)V")
    public static final void method3077(class70 arg0, int arg1) {
        method3239(arg0.field948, arg0.field949, arg1);
    }

    @ObfuscatedName("fm.ht(IIII)V")
    public static final void method3239(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field749 = -1;
            field750 = -1;
            return;
        }
        int var3 = method3376(arg0, arg1, Statics.field2219) - arg2;
        int var4 = arg0 - Statics.field350;
        int var5 = var3 - Statics.field436;
        int var6 = arg1 - Statics.field3753;
        int var7 = class130.field1779[Statics.field2364];
        int var8 = class130.field1768[Statics.field2364];
        int var9 = class130.field1779[Statics.field544];
        int var10 = class130.field1768[Statics.field544];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field749 = field912 * var11 / var15 + field910 / 2;
            field750 = field912 * var14 / var15 + field651 / 2;
        } else {
            field749 = -1;
            field750 = -1;
        }
    }

    @ObfuscatedName("fa.hj(IIII)I")
    public static final int method3376(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class56.field508[var5][var3][var4] + class56.field508[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field508[var5][var3][var4 + 1] + class56.field508[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("at.hy(III)I")
    public static int method537(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field903 - field902) * var2 / 100 + field902;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ad.hv(IIIIIIII)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method537(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class130.field1779[var8];
            int var14 = class130.field1768[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class130.field1779[var9];
            int var17 = class130.field1768[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field350 = arg0 - var10;
        Statics.field436 = arg1 - var11;
        Statics.field3753 = arg2 - var12;
        Statics.field2364 = arg3;
        Statics.field544 = arg4;
        if (field724 == 1 && field678 >= 2 && field660 % 50 == 0 && (Statics.field726 >> 7 != Statics.field187.field948 >> 7 || Statics.field136 >> 7 != Statics.field187.field949 >> 7)) {
            int var19 = Statics.field187.field632;
            int var20 = (Statics.field726 >> 7) + Statics.field84;
            int var21 = (Statics.field136 >> 7) + Statics.field30;
            Statics.method576(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("ev.hi(IIZB)V")
    public static final void method2877(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field413 == arg0 && Statics.field535 == arg1) {
            return;
        }
        Statics.field413 = arg0;
        Statics.field535 = arg1;
        Statics.method4729(25);
        method2043(class246.field2888, true);
        int var3 = Statics.field84;
        int var4 = Statics.field30;
        Statics.field84 = (arg0 - 6) * 8;
        Statics.field30 = (arg1 - 6) * 8;
        int var5 = Statics.field84 - var3;
        int var6 = Statics.field30 - var4;
        int var7 = Statics.field84;
        int var8 = Statics.field30;
        for (int var9 = 0; var9 < 32768; var9++) {
            class79 var10 = field693[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field999[var11] -= var5;
                    var10.field996[var11] -= var6;
                }
                var10.field948 -= var5 * 128;
                var10.field949 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field766[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field999[var14] -= var5;
                    var13.field996[var14] -= var6;
                }
                var13.field948 -= var5 * 128;
                var13.field949 -= var6 * 128;
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
                        field778[var25][var21][var22] = field778[var25][var23][var24];
                    } else {
                        field778[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field779.method3990(); var26 != null; var26 = (class69) field779.method3984()) {
            var26.field929 -= var5;
            var26.field930 -= var6;
            if (var26.field929 < 0 || var26.field930 < 0 || var26.field929 >= 104 || var26.field930 >= 104) {
                var26.method3960();
            }
        }
        if (field880 != 0) {
            field880 -= var5;
            field881 -= var6;
        }
        field888 = 0;
        field894 = false;
        Statics.field350 -= var5 << 7;
        Statics.field3753 -= var6 << 7;
        Statics.field726 -= var5 << 7;
        Statics.field136 -= var6 << 7;
        field875 = -1;
        field781.method3996();
        field780.method3996();
        for (int var27 = 0; var27 < 4; var27++) {
            field707[var27].method3334();
        }
    }

    @ObfuscatedName("jp.hp(ZI)V")
    public static final void method4723(boolean arg0) {
        method5295();
        field695.field1314++;
        if (field695.field1314 < 50 && !arg0) {
            return;
        }
        field695.field1314 = 0;
        if (field697 || field695.method2117() == null) {
            return;
        }
        class180 var1 = class180.method625(class177.field2242, field695.field1308);
        field695.method2097(var1);
        try {
            field695.method2096();
        } catch (IOException var3) {
            field697 = true;
        }
    }

    @ObfuscatedName("o.hh(I)V")
    public static final void method182() {
        method4723(false);
        field702 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field3641.length; var1++) {
            if (Statics.field282[var1] != -1 && Statics.field3641[var1] == null) {
                Statics.field3641[var1] = Statics.field538.method4422(Statics.field282[var1], 0);
                if (Statics.field3641[var1] == null) {
                    var0 = false;
                    field702++;
                }
            }
            if (Statics.field33[var1] != -1 && Statics.field1933[var1] == null) {
                Statics.field1933[var1] = Statics.field538.method4485(Statics.field33[var1], 0, Statics.field1256[var1]);
                if (Statics.field1933[var1] == null) {
                    var0 = false;
                    field702++;
                }
            }
        }
        if (!var0) {
            field706 = 1;
            return;
        }
        field704 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field3641.length; var3++) {
            byte[] var4 = Statics.field1933[var3];
            if (var4 != null) {
                int var5 = (Statics.field2121[var3] >> 8) * 64 - Statics.field84;
                int var6 = (Statics.field2121[var3] & 0xFF) * 64 - Statics.field30;
                if (field839) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class56.method5628(var4, var5, var6);
            }
        }
        if (!var2) {
            field706 = 2;
            return;
        }
        if (field706 != 0) {
            method2043(class246.field2888 + class81.field1124 + class81.field1122 + 100 + "%" + class81.field1123, true);
        }
        method5295();
        Statics.field28.method2879();
        for (int var7 = 0; var7 < 4; var7++) {
            field707[var7].method3334();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class56.field506[var8][var9][var10] = 0;
                }
            }
        }
        method5295();
        class56.method4725();
        int var11 = Statics.field3641.length;
        for (class75 var12 = (class75) class75.field1062.method3990(); var12 != null; var12 = (class75) class75.field1062.method3984()) {
            if (var12.field1059 != null) {
                Statics.field61.method2120(var12.field1059);
                var12.field1059 = null;
            }
            if (var12.field1051 != null) {
                Statics.field61.method2120(var12.field1051);
                var12.field1051 = null;
            }
        }
        class75.field1062.method3996();
        method4723(true);
        if (!field839) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field2121[var13] >> 8) * 64 - Statics.field84;
                int var15 = (Statics.field2121[var13] & 0xFF) * 64 - Statics.field30;
                byte[] var16 = Statics.field3641[var13];
                if (var16 != null) {
                    method5295();
                    class56.method3234(var16, var14, var15, Statics.field413 * 8 - 48, Statics.field535 * 8 - 48, field707);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field2121[var17] >> 8) * 64 - Statics.field84;
                int var19 = (Statics.field2121[var17] & 0xFF) * 64 - Statics.field30;
                byte[] var20 = Statics.field3641[var17];
                if (var20 == null && Statics.field535 < 800) {
                    method5295();
                    class56.method1891(var18, var19, 64, 64);
                }
            }
            method4723(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field1933[var21];
                if (var22 != null) {
                    int var23 = (Statics.field2121[var21] >> 8) * 64 - Statics.field84;
                    int var24 = (Statics.field2121[var21] & 0xFF) * 64 - Statics.field30;
                    method5295();
                    class56.method2287(var22, var23, var24, Statics.field28, field707);
                }
            }
        }
        if (field839) {
            for (int var25 = 0; var25 < 4; var25++) {
                method5295();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field869[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field2121.length; var35++) {
                                if (Statics.field2121[var35] == var34 && Statics.field3641[var35] != null) {
                                    class56.method84(Statics.field3641[var35], var25, var26 * 8, var27 * 8, var30, (var32 & 0x7) * 8, (var33 & 0x7) * 8, var31, field707);
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            int var36 = var25;
                            int var37 = var26 * 8;
                            int var38 = var27 * 8;
                            for (int var39 = 0; var39 < 8; var39++) {
                                for (int var40 = 0; var40 < 8; var40++) {
                                    class56.field508[var36][var37 + var39][var38 + var40] = 0;
                                }
                            }
                            if (var37 > 0) {
                                for (int var41 = 1; var41 < 8; var41++) {
                                    class56.field508[var36][var37][var38 + var41] = class56.field508[var36][var37 - 1][var38 + var41];
                                }
                            }
                            if (var38 > 0) {
                                for (int var42 = 1; var42 < 8; var42++) {
                                    class56.field508[var36][var37 + var42][var38] = class56.field508[var36][var37 + var42][var38 - 1];
                                }
                            }
                            if (var37 > 0 && class56.field508[var36][var37 - 1][var38] != 0) {
                                class56.field508[var36][var37][var38] = class56.field508[var36][var37 - 1][var38];
                            } else if (var38 > 0 && class56.field508[var36][var37][var38 - 1] != 0) {
                                class56.field508[var36][var37][var38] = class56.field508[var36][var37][var38 - 1];
                            } else if (var37 > 0 && var38 > 0 && class56.field508[var36][var37 - 1][var38 - 1] != 0) {
                                class56.field508[var36][var37][var38] = class56.field508[var36][var37 - 1][var38 - 1];
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < 13; var43++) {
                for (int var44 = 0; var44 < 13; var44++) {
                    int var45 = field869[0][var43][var44];
                    if (var45 == -1) {
                        class56.method1891(var43 * 8, var44 * 8, 8, 8);
                    }
                }
            }
            method4723(true);
            for (int var46 = 0; var46 < 4; var46++) {
                method5295();
                for (int var47 = 0; var47 < 13; var47++) {
                    for (int var48 = 0; var48 < 13; var48++) {
                        int var49 = field869[var46][var47][var48];
                        if (var49 != -1) {
                            int var50 = var49 >> 24 & 0x3;
                            int var51 = var49 >> 1 & 0x3;
                            int var52 = var49 >> 14 & 0x3FF;
                            int var53 = var49 >> 3 & 0x7FF;
                            int var54 = (var52 / 8 << 8) + var53 / 8;
                            for (int var55 = 0; var55 < Statics.field2121.length; var55++) {
                                if (Statics.field2121[var55] == var54 && Statics.field1933[var55] != null) {
                                    class56.method1889(Statics.field1933[var55], var46, var47 * 8, var48 * 8, var50, (var52 & 0x7) * 8, (var53 & 0x7) * 8, var51, Statics.field28, field707);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method4723(true);
        method5295();
        class56.method2661(Statics.field28, field707);
        method4723(true);
        int var56 = class56.field507;
        if (var56 > Statics.field2219) {
            var56 = Statics.field2219;
        }
        if (var56 < Statics.field2219 - 1) {
            int var57 = Statics.field2219 - 1;
        }
        if (field654) {
            Statics.field28.method2880(class56.field507);
        } else {
            Statics.field28.method2880(0);
        }
        for (int var58 = 0; var58 < 104; var58++) {
            for (int var59 = 0; var59 < 104; var59++) {
                method604(var58, var59);
            }
        }
        method5295();
        method1108();
        class275.field3456.method3879();
        if (Statics.field555.method803()) {
            class180 var60 = class180.method625(class177.field2236, field695.field1308);
            var60.field2350.method3442(1057001181);
            field695.method2097(var60);
        }
        if (!field839) {
            int var61 = (Statics.field413 - 6) / 8;
            int var62 = (Statics.field413 + 6) / 8;
            int var63 = (Statics.field535 - 6) / 8;
            int var64 = (Statics.field535 + 6) / 8;
            for (int var65 = var61 - 1; var65 <= var62 + 1; var65++) {
                for (int var66 = var63 - 1; var66 <= var64 + 1; var66++) {
                    if (var65 < var61 || var65 > var62 || var66 < var63 || var66 > var64) {
                        Statics.field538.method4445("m" + var65 + "_" + var66);
                        Statics.field538.method4445("l" + var65 + "_" + var66);
                    }
                }
            }
        }
        Statics.method4729(30);
        method5295();
        Statics.field518 = (byte[][][]) null;
        Statics.field509 = (byte[][][]) null;
        Statics.field510 = (byte[][][]) null;
        Statics.field505 = (byte[][][]) null;
        Statics.field3315 = (int[][][]) null;
        Statics.field512 = (byte[][][]) null;
        Statics.field1964 = (int[][]) null;
        Statics.field101 = null;
        Statics.field513 = null;
        Statics.field3210 = null;
        Statics.field1303 = null;
        Statics.field514 = null;
        class180 var67 = class180.method625(class177.field2296, field695.field1308);
        field695.method2097(var67);
        class53.method1663();
    }

    @ObfuscatedName("cy.hr(IB)V")
    public static final void method1928(int arg0) {
        int[] var1 = Statics.field1068.field3895;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field506[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field28.method2994(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class56.field506[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field28.method2994(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1068.method5747();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field506[arg0][var10][var9] & 0x18) == 0) {
                    method4289(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class56.field506[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method4289(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field876 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field28.method2970(Statics.field2219, var11, var12);
                if (var13 != 0L) {
                    int var15 = class128.method2337(var13);
                    int var16 = class275.method117(var15).field3481;
                    if (var16 >= 0) {
                        field879[field876] = class263.method379(var16).method4611(false);
                        field713[field876] = var11;
                        field806[field876] = var12;
                        field876++;
                    }
                }
            }
        }
        Statics.field1290.method5625();
    }

    @ObfuscatedName("il.he(IIIIII)V")
    public static final void method4289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field28.method2977(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field28.method2908(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class128.method668(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field1068.field3895;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class128.method2337(var5);
            class275 var15 = class275.method117(var14);
            if (var15.field3482 == -1) {
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
                class327 var16 = Statics.field569[var15.field3482];
                if (var16 != null) {
                    int var17 = (var15.field3491 * 4 - var16.field3882) / 2;
                    int var18 = (var15.field3469 * 4 - var16.field3880) / 2;
                    var16.method5635(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field3469) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field28.method2906(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field28.method2908(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class128.method2337(var19);
            class275 var25 = class275.method117(var24);
            if (var25.field3482 != -1) {
                class327 var26 = Statics.field569[var25.field3482];
                if (var26 != null) {
                    int var27 = (var25.field3491 * 4 - var26.field3882) / 2;
                    int var28 = (var25.field3469 * 4 - var26.field3880) / 2;
                    var26.method5635(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field3469) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class128.method668(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field1068.field3895;
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
        long var33 = Statics.field28.method2970(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class128.method2337(var33);
        class275 var36 = class275.method117(var35);
        if (var36.field3482 == -1) {
            return;
        }
        class327 var37 = Statics.field569[var36.field3482];
        if (var37 != null) {
            int var38 = (var36.field3491 * 4 - var37.field3882) / 2;
            int var39 = (var36.field3469 * 4 - var37.field3880) / 2;
            var37.method5635(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field3469) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.hg(Lck;I)Z")
    public final boolean method1187(class95 arg0) {
        class165 var2 = arg0.method2117();
        class197 var3 = arg0.field1309;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1310 == null) {
                if (arg0.field1304) {
                    if (!var2.method3250(1)) {
                        return false;
                    }
                    var2.method3258(arg0.field1309.field2420, 0, 1);
                    arg0.field1306 = 0;
                    arg0.field1304 = false;
                }
                var3.field2419 = 0;
                if (var3.method3729()) {
                    if (!var2.method3250(1)) {
                        return false;
                    }
                    var2.method3258(arg0.field1309.field2420, 1, 1);
                    arg0.field1306 = 0;
                }
                arg0.field1304 = true;
                class176[] var4 = class176.method712();
                int var5 = var3.method3748();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2419);
                }
                arg0.field1310 = var4[var5];
                arg0.field1313 = arg0.field1310.field2155;
            }
            if (arg0.field1313 == -1) {
                if (!var2.method3250(1)) {
                    return false;
                }
                arg0.method2117().method3258(var3.field2420, 0, 1);
                arg0.field1313 = var3.field2420[0] & 0xFF;
            }
            if (arg0.field1313 == -2) {
                if (!var2.method3250(2)) {
                    return false;
                }
                arg0.method2117().method3258(var3.field2420, 0, 2);
                var3.field2419 = 0;
                arg0.field1313 = var3.method3610();
            }
            if (!var2.method3250(arg0.field1313)) {
                return false;
            }
            var3.field2419 = 0;
            var2.method3258(var3.field2420, 0, arg0.field1313);
            arg0.field1306 = 0;
            field774.method5044();
            arg0.field1317 = arg0.field1316;
            arg0.field1316 = arg0.field1315;
            arg0.field1315 = arg0.field1310;
            if (class176.field2151 == arg0.field1310) {
                int var6 = var3.method3460();
                String var7 = var3.method3647();
                class239 var8 = class239.method2052(var6);
                if (!var7.equals(var8.field2751)) {
                    var8.field2751 = var7;
                    method508(var8);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2156 == arg0.field1310) {
                int var9 = var3.method3502();
                int var10 = var3.method3494();
                int var11 = var10 >> 10 & 0x1F;
                int var12 = var10 >> 5 & 0x1F;
                int var13 = var10 & 0x1F;
                int var14 = (var13 << 3) + (var11 << 19) + (var12 << 11);
                class239 var15 = class239.method2052(var9);
                if (var15.field2715 != var14) {
                    var15.field2715 = var14;
                    method508(var15);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2212 == arg0.field1310) {
                field867 = var3.method3613();
                field866 = var3.method3613();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2211 == arg0.field1310) {
                int var16 = var3.method3503();
                class239 var17 = class239.method2052(var16);
                var17.field2733 = 3;
                var17.field2734 = Statics.field187.field612.method4295();
                method508(var17);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2213 == arg0.field1310) {
                method4584(true, var3);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2183 == arg0.field1310) {
                Statics.method139(true, arg0.field1309);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2202 == arg0.field1310) {
                int var18 = var3.method3460();
                int var19 = var3.method3610();
                if (var18 < -70000) {
                    var19 += 32768;
                }
                class239 var20;
                if (var18 >= 0) {
                    var20 = class239.method2052(var18);
                } else {
                    var20 = null;
                }
                if (var20 != null) {
                    for (int var21 = 0; var21 < var20.field2814.length; var21++) {
                        var20.field2814[var21] = 0;
                        var20.field2739[var21] = 0;
                    }
                }
                class60.method701(var19);
                int var22 = var3.method3610();
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = var3.method3610();
                    int var25 = var3.method3443();
                    if (var25 == 255) {
                        var25 = var3.method3503();
                    }
                    if (var20 != null && var23 < var20.field2814.length) {
                        var20.field2814[var23] = var24;
                        var20.field2739[var23] = var25;
                    }
                    class60.method164(var19, var23, var24 - 1, var25);
                }
                if (var20 != null) {
                    method508(var20);
                }
                method5289();
                field838[++field682 - 1 & 0x1F] = var19 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2188 == arg0.field1310) {
                String var26 = var3.method3647();
                long var27 = var3.method3668();
                long var29 = (long) var3.method3610();
                long var31 = (long) var3.method3459();
                class250 var33 = (class250) Statics.method2007(class250.method245(), var3.method3443());
                long var34 = (var29 << 32) + var31;
                boolean var36 = false;
                for (int var37 = 0; var37 < 100; var37++) {
                    if (field756[var37] == var34) {
                        var36 = true;
                        break;
                    }
                }
                if (var33.field3209 && Statics.field355.method1689(new class298(var26, Statics.field415))) {
                    var36 = true;
                }
                if (!var36 && field764 == 0) {
                    field756[field759] = var34;
                    field759 = (field759 + 1) % 100;
                    String var38 = class306.method5384(class312.method4635(class307.method4414(var3)));
                    if (var33.field3201 == -1) {
                        class91.method50(9, var26, var38, class310.method659(var27));
                    } else {
                        class91.method50(9, class81.method515(var33.field3201) + var26, var38, class310.method659(var27));
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2170 == arg0.field1310) {
                String var39 = var3.method3647();
                String var40 = class306.method5384(class312.method4635(class307.method4414(var3)));
                class91.method696(6, var39, var40);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2205 == arg0.field1310) {
                for (int var41 = 0; var41 < class234.field2648.length; var41++) {
                    if (class234.field2648[var41] != class234.field2647[var41]) {
                        class234.field2648[var41] = class234.field2647[var41];
                        method71(var41);
                        field836[++field837 - 1 & 0x1F] = var41;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2184 == arg0.field1310) {
                if (field821 != -1) {
                    method1763(field821, 0);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2138 == arg0.field1310) {
                method4394(class179.field2342);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2157 == arg0.field1310) {
                method4394(class179.field2341);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2141 == arg0.field1310) {
                Statics.field116 = var3.method3613();
                Statics.field3320 = var3.method3443();
                for (int var42 = Statics.field3320; var42 < Statics.field3320 + 8; var42++) {
                    for (int var43 = Statics.field116; var43 < Statics.field116 + 8; var43++) {
                        if (field778[Statics.field2219][var42][var43] != null) {
                            field778[Statics.field2219][var42][var43] = null;
                            method604(var42, var43);
                        }
                    }
                }
                for (class69 var44 = (class69) field779.method3990(); var44 != null; var44 = (class69) field779.method3984()) {
                    if (var44.field929 >= Statics.field3320 && var44.field929 < Statics.field3320 + 8 && var44.field930 >= Statics.field116 && var44.field930 < Statics.field116 + 8 && Statics.field2219 == var44.field927) {
                        var44.field938 = 0;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2144 == arg0.field1310) {
                method4394(class179.field2345);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2210 == arg0.field1310) {
                for (int var45 = 0; var45 < Statics.field1419; var45++) {
                    class262 var46 = class262.method3119(var45);
                    if (var46 != null) {
                        class234.field2647[var45] = 0;
                        class234.field2648[var45] = 0;
                    }
                }
                method5289();
                field837 += 32;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2175 == arg0.field1310) {
                method4394(class179.field2333);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2190 == arg0.field1310) {
                Statics.field355.method1685(var3, arg0.field1313);
                field843 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2139 == arg0.field1310) {
                int var47 = var3.method3503();
                int var48 = var3.method3650();
                class239 var49 = class239.method2052(var47);
                if (var49 != null && var49.field2692 == 0) {
                    if (var48 > var49.field2714 - var49.field2706) {
                        var48 = var49.field2714 - var49.field2706;
                    }
                    if (var48 < 0) {
                        var48 = 0;
                    }
                    if (var49.field2712 != var48) {
                        var49.field2712 = var48;
                        method508(var49);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2173 == arg0.field1310) {
                int var50 = var3.method3502();
                class239 var51 = class239.method2052(var50);
                for (int var52 = 0; var52 < var51.field2814.length; var52++) {
                    var51.field2814[var52] = -1;
                    var51.field2814[var52] = 0;
                }
                method508(var51);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2133 == arg0.field1310) {
                method11();
                arg0.field1310 = null;
                return false;
            }
            if (class176.field2176 == arg0.field1310) {
                int var53 = var3.method3460();
                int var54 = var3.method3610();
                if (var53 < -70000) {
                    var54 += 32768;
                }
                class239 var55;
                if (var53 >= 0) {
                    var55 = class239.method2052(var53);
                } else {
                    var55 = null;
                }
                while (var3.field2419 < arg0.field1313) {
                    int var56 = var3.method3638();
                    int var57 = var3.method3610();
                    int var58 = 0;
                    if (var57 != 0) {
                        var58 = var3.method3443();
                        if (var58 == 255) {
                            var58 = var3.method3460();
                        }
                    }
                    if (var55 != null && var56 >= 0 && var56 < var55.field2814.length) {
                        var55.field2814[var56] = var57;
                        var55.field2739[var56] = var58;
                    }
                    class60.method164(var54, var56, var57 - 1, var58);
                }
                if (var55 != null) {
                    method508(var55);
                }
                method5289();
                field838[++field682 - 1 & 0x1F] = var54 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2166 == arg0.field1310) {
                int var59 = var3.method3443();
                method4395(var59);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2158 == arg0.field1310) {
                method4584(false, var3);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2150 == arg0.field1310) {
                byte[] var60 = new byte[arg0.field1313];
                var3.method3731(var60, 0, var60.length);
                class190 var61 = new class190(var60);
                String var62 = var61.method3647();
                class51.method517(var62, true, false);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2218 == arg0.field1310) {
                class89.method197(var3, arg0.field1313);
                method3435();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2207 == arg0.field1310) {
                field894 = true;
                Statics.field223 = var3.method3443();
                Statics.field3758 = var3.method3443();
                Statics.field26 = var3.method3610();
                Statics.field3843 = var3.method3443();
                Statics.field2101 = var3.method3443();
                if (Statics.field2101 >= 100) {
                    Statics.field350 = Statics.field223 * 128 + 64;
                    Statics.field3753 = Statics.field3758 * 128 + 64;
                    Statics.field436 = method3376(Statics.field350, Statics.field3753, Statics.field2219) - Statics.field26;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2169 == arg0.field1310) {
                method1958(var3.method3647());
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2149 == arg0.field1310) {
                Statics.field116 = var3.method3486();
                Statics.field3320 = var3.method3613();
                while (var3.field2419 < arg0.field1313) {
                    int var63 = var3.method3443();
                    class179 var64 = class179.method3777()[var63];
                    method4394(var64);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2177 == arg0.field1310) {
                if (Statics.field366 != null) {
                    Statics.field366.method5264(var3);
                }
                method3348();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2194 == arg0.field1310) {
                String var65 = var3.method3647();
                Object[] var66 = new Object[var65.length() + 1];
                for (int var67 = var65.length() - 1; var67 >= 0; var67--) {
                    if (var65.charAt(var67) == 's') {
                        var66[var67 + 1] = var3.method3647();
                    } else {
                        var66[var67 + 1] = Integer.valueOf(var3.method3460());
                    }
                }
                var66[0] = Integer.valueOf(var3.method3460());
                class63 var68 = new class63();
                var68.field580 = var66;
                class76.method3778(var68);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2159 == arg0.field1310) {
                boolean var69 = var3.method3443() == 1;
                if (var69) {
                    Statics.field3615 = class192.method183() - var3.method3668();
                    Statics.field428 = new class7(var3, true);
                } else {
                    Statics.field428 = null;
                }
                field676 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2216 == arg0.field1310) {
                int var70 = var3.method3650();
                field821 = var70;
                this.method1191(false);
                method129(var70);
                class76.method1615(field821);
                for (int var71 = 0; var71 < 100; var71++) {
                    field796[var71] = true;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2209 == arg0.field1310) {
                int var72 = var3.method3484();
                int var73 = var3.method3502();
                int var74 = var3.method3650();
                class62 var75 = (class62) field811.method3911((long) var73);
                if (var75 != null) {
                    method5009(var75, var75.field571 != var74);
                }
                method1051(var73, var74, var72);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2145 == arg0.field1310) {
                Statics.method139(false, arg0.field1309);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2168 == arg0.field1310) {
                field668 = var3.method3443();
                if (field668 == 1) {
                    field863 = var3.method3610();
                }
                if (field668 >= 2 && field668 <= 6) {
                    if (field668 == 2) {
                        field868 = 64;
                        field675 = 64;
                    }
                    if (field668 == 3) {
                        field868 = 0;
                        field675 = 64;
                    }
                    if (field668 == 4) {
                        field868 = 128;
                        field675 = 64;
                    }
                    if (field668 == 5) {
                        field868 = 64;
                        field675 = 0;
                    }
                    if (field668 == 6) {
                        field868 = 64;
                        field675 = 128;
                    }
                    field668 = 2;
                    field671 = var3.method3610();
                    field672 = var3.method3610();
                    field878 = var3.method3443();
                }
                if (field668 == 10) {
                    field670 = var3.method3610();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2200 == arg0.field1310) {
                int var76 = var3.method3494();
                int var77 = var3.method3678();
                int var78 = var3.method3502();
                class239 var79 = class239.method2052(var78);
                var79.field2746 = (var77 << 16) + var76;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2214 == arg0.field1310) {
                int var80 = var3.method3460();
                int var81 = var3.method3460();
                class62 var82 = (class62) field811.method3911((long) var81);
                class62 var83 = (class62) field811.method3911((long) var80);
                if (var83 != null) {
                    method5009(var83, var82 == null || var82.field571 != var83.field571);
                }
                if (var82 != null) {
                    var82.method3960();
                    field811.method3920(var82, (long) var80);
                }
                class239 var84 = class239.method2052(var81);
                if (var84 != null) {
                    method508(var84);
                }
                class239 var85 = class239.method2052(var80);
                if (var85 != null) {
                    method508(var85);
                    method1013(Statics.field2681[var85.field2690 >>> 16], var85, true);
                }
                if (field821 != -1) {
                    method1763(field821, 1);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2167 == arg0.field1310) {
                method4394(class179.field2335);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2182 == arg0.field1310) {
                int var86 = arg0.field1313 + var3.field2419;
                int var87 = var3.method3610();
                int var88 = var3.method3610();
                if (field821 != var87) {
                    field821 = var87;
                    this.method1191(false);
                    method129(field821);
                    class76.method1615(field821);
                    for (int var89 = 0; var89 < 100; var89++) {
                        field796[var89] = true;
                    }
                }
                while (var88-- > 0) {
                    int var90 = var3.method3460();
                    int var91 = var3.method3610();
                    int var92 = var3.method3443();
                    class62 var93 = (class62) field811.method3911((long) var90);
                    if (var93 != null && var93.field571 != var91) {
                        method5009(var93, true);
                        var93 = null;
                    }
                    if (var93 == null) {
                        var93 = method1051(var90, var91, var92);
                    }
                    var93.field567 = true;
                }
                for (class62 var94 = (class62) field811.method3914(); var94 != null; var94 = (class62) field811.method3915()) {
                    if (var94.field567) {
                        var94.field567 = false;
                    } else {
                        method5009(var94, true);
                    }
                }
                field860 = new class210(512);
                while (var3.field2419 < var86) {
                    int var95 = var3.method3460();
                    int var96 = var3.method3610();
                    int var97 = var3.method3610();
                    int var98 = var3.method3460();
                    for (int var99 = var96; var99 <= var97; var99++) {
                        long var100 = ((long) var95 << 32) + (long) var99;
                        field860.method3920(new class219(var98), var100);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2179 == arg0.field1310) {
                class72 var102 = new class72();
                var102.field1020 = var3.method3647();
                var102.field1021 = var3.method3610();
                int var103 = var3.method3460();
                var102.field1022 = var103;
                Statics.method4729(45);
                var2.method3251();
                Object var104 = null;
                class85.method2660(var102);
                arg0.field1310 = null;
                return false;
            }
            if (class176.field2197 == arg0.field1310) {
                int var105 = var3.method3610();
                int var106 = var3.method3443();
                int var107 = var3.method3610();
                method4751(var105, var106, var107);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2198 == arg0.field1310) {
                int var108 = var3.method3484();
                int var109 = var3.method3484();
                String var110 = var3.method3647();
                if (var109 >= 1 && var109 <= 8) {
                    if (var110.equalsIgnoreCase(class246.field2885)) {
                        var110 = null;
                    }
                    field669[var109 - 1] = var110;
                    field775[var109 - 1] = var108 == 0;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2164 == arg0.field1310) {
                Statics.field355.field1046.method5131(var3, arg0.field1313);
                method26();
                field843 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2160 == arg0.field1310) {
                for (int var111 = 0; var111 < field766.length; var111++) {
                    if (field766[var111] != null) {
                        field766[var111].field939 = -1;
                    }
                }
                for (int var112 = 0; var112 < field693.length; var112++) {
                    if (field693[var112] != null) {
                        field693[var112].field939 = -1;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2136 == arg0.field1310) {
                int var113 = var3.method3610();
                int var114 = var3.method3460();
                class234.field2647[var113] = var114;
                if (class234.field2648[var113] != var114) {
                    class234.field2648[var113] = var114;
                }
                method71(var113);
                field836[++field837 - 1 & 0x1F] = var113;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2162 == arg0.field1310) {
                int var115 = var3.method3460();
                boolean var116 = var3.method3443() == 1;
                class239 var117 = class239.method2052(var115);
                if (var117.field2710 != var116) {
                    var117.field2710 = var116;
                    method508(var117);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2189 == arg0.field1310) {
                var3.field2419 += 28;
                if (var3.method3480()) {
                    method5229(var3, var3.field2419 - 28);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2163 == arg0.field1310) {
                int var118 = var3.method3503();
                int var119 = var3.method3650();
                class239 var120 = class239.method2052(var118);
                if (var120.field2733 != 1 || var120.field2734 != var119) {
                    var120.field2733 = 1;
                    var120.field2734 = var119;
                    method508(var120);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2206 == arg0.field1310) {
                field708 = var3.method3443();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2215 == arg0.field1310) {
                field894 = true;
                Statics.field1259 = var3.method3443();
                Statics.field340 = var3.method3443();
                Statics.field168 = var3.method3610();
                Statics.field120 = var3.method3443();
                Statics.field2437 = var3.method3443();
                if (Statics.field2437 >= 100) {
                    int var121 = Statics.field1259 * 128 + 64;
                    int var122 = Statics.field340 * 128 + 64;
                    int var123 = method3376(var121, var122, Statics.field2219) - Statics.field168;
                    int var124 = var121 - Statics.field350;
                    int var125 = var123 - Statics.field436;
                    int var126 = var122 - Statics.field3753;
                    int var127 = (int) Math.sqrt((double) (var124 * var124 + var126 * var126));
                    Statics.field2364 = (int) (Math.atan2((double) var125, (double) var127) * 325.949D) & 0x7FF;
                    Statics.field544 = (int) (Math.atan2((double) var124, (double) var126) * -325.949D) & 0x7FF;
                    if (Statics.field2364 < 128) {
                        Statics.field2364 = 128;
                    }
                    if (Statics.field2364 > 383) {
                        Statics.field2364 = 383;
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2140 == arg0.field1310) {
                method4394(class179.field2336);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2204 == arg0.field1310) {
                field667 = var3.method3610() * 30;
                field925 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2148 == arg0.field1310) {
                boolean var128 = var3.method3462();
                if (!var128) {
                    Statics.field217 = null;
                } else if (Statics.field217 == null) {
                    Statics.field217 = new class259();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2134 == arg0.field1310) {
                field894 = false;
                for (int var129 = 0; var129 < 5; var129++) {
                    field895[var129] = false;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2174 == arg0.field1310) {
                method4394(class179.field2338);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2154 == arg0.field1310) {
                method5289();
                int var130 = var3.method3683();
                int var131 = var3.method3613();
                int var132 = var3.method3443();
                field754[var131] = var130;
                field782[var131] = var132;
                field776[var131] = 1;
                for (int var133 = 0; var133 < 98; var133++) {
                    if (var130 >= class243.field2865[var133]) {
                        field776[var131] = var133 + 2;
                    }
                }
                field840[++field841 - 1 & 0x1F] = var131;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2171 == arg0.field1310) {
                method4394(class179.field2339);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2181 == arg0.field1310) {
                int var134 = var3.method3650();
                int var135 = var3.method3503();
                class239 var136 = class239.method2052(var135);
                if (var136.field2733 != 2 || var136.field2734 != var134) {
                    var136.field2733 = 2;
                    var136.field2734 = var134;
                    method508(var136);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2135 == arg0.field1310) {
                int var137 = var3.method3638();
                boolean var138 = var3.method3443() == 1;
                String var139 = "";
                boolean var140 = false;
                if (var138) {
                    var139 = var3.method3647();
                    if (Statics.field355.method1689(new class298(var139, Statics.field415))) {
                        var140 = true;
                    }
                }
                String var141 = var3.method3647();
                if (!var140) {
                    class91.method696(var137, var139, var141);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2191 == arg0.field1310) {
                int var142 = var3.method3502();
                int var143 = var3.method3511();
                int var144 = var3.method3496();
                class239 var145 = class239.method2052(var142);
                if (var145.field2699 != var144 || var145.field2700 != var143 || var145.field2695 != 0 || var145.field2696 != 0) {
                    var145.field2699 = var144;
                    var145.field2700 = var143;
                    var145.field2695 = 0;
                    var145.field2696 = 0;
                    method508(var145);
                    this.method1192(var145);
                    if (var145.field2692 == 0) {
                        method1013(Statics.field2681[var142 >> 16], var145, false);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2180 == arg0.field1310) {
                int var146 = var3.method3683();
                int var147 = var3.method3494();
                if (var147 == 65535) {
                    var147 = -1;
                }
                int var148 = var3.method3503();
                int var149 = var3.method3610();
                if (var149 == 65535) {
                    var149 = -1;
                }
                for (int var150 = var149; var150 <= var147; var150++) {
                    long var151 = ((long) var148 << 32) + (long) var150;
                    class212 var153 = field860.method3911(var151);
                    if (var153 != null) {
                        var153.method3960();
                    }
                    field860.method3920(new class219(var146), var151);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2192 == arg0.field1310) {
                int var154 = var3.method3460();
                int var155 = var3.method3610();
                if (var155 == 65535) {
                    var155 = -1;
                }
                int var156 = var3.method3503();
                class239 var157 = class239.method2052(var154);
                if (var157.field2689) {
                    var157.field2816 = var155;
                    var157.field2806 = var156;
                    class276 var159 = class276.method1049(var155);
                    var157.field2813 = var159.field3521;
                    var157.field2742 = var159.field3540;
                    var157.field2743 = var159.field3516;
                    var157.field2750 = var159.field3524;
                    var157.field2740 = var159.field3525;
                    var157.field2701 = var159.field3549;
                    if (var159.field3526 == 1) {
                        var157.field2772 = 1;
                    } else {
                        var157.field2772 = 2;
                    }
                    if (var157.field2729 > 0) {
                        var157.field2701 = var157.field2701 * 32 / var157.field2729;
                    } else if (var157.field2716 > 0) {
                        var157.field2701 = var157.field2701 * 32 / var157.field2716;
                    }
                    method508(var157);
                } else if (var155 == -1) {
                    var157.field2733 = 0;
                    arg0.field1310 = null;
                    return true;
                } else {
                    class276 var158 = class276.method1049(var155);
                    var157.field2733 = 4;
                    var157.field2734 = var155;
                    var157.field2813 = var158.field3521;
                    var157.field2742 = var158.field3540;
                    var157.field2701 = var158.field3549 * 100 / var156;
                    method508(var157);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2161 == arg0.field1310) {
                if (arg0.field1313 == 0) {
                    Statics.field366 = null;
                } else {
                    if (Statics.field366 == null) {
                        Statics.field366 = new class300(Statics.field415, Statics.field555);
                    }
                    Statics.field366.method5286(var3);
                }
                method3348();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2146 == arg0.field1310) {
                method4394(class179.field2334);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2142 == arg0.field1310) {
                String var160 = var3.method3647();
                long var161 = (long) var3.method3610();
                long var163 = (long) var3.method3459();
                class250 var165 = (class250) Statics.method2007(class250.method245(), var3.method3443());
                long var166 = (var161 << 32) + var163;
                boolean var168 = false;
                for (int var169 = 0; var169 < 100; var169++) {
                    if (field756[var169] == var166) {
                        var168 = true;
                        break;
                    }
                }
                if (Statics.field355.method1689(new class298(var160, Statics.field415))) {
                    var168 = true;
                }
                if (!var168 && field764 == 0) {
                    field756[field759] = var166;
                    field759 = (field759 + 1) % 100;
                    String var170 = class306.method5384(class312.method4635(class307.method4414(var3)));
                    byte var171;
                    if (var165.field3208) {
                        var171 = 7;
                    } else {
                        var171 = 3;
                    }
                    if (var165.field3201 == -1) {
                        class91.method696(var171, var160, var170);
                    } else {
                        class91.method696(var171, class81.method515(var165.field3201) + var160, var170);
                    }
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2165 == arg0.field1310) {
                int var172 = var3.method3650();
                int var173 = var3.method3650();
                int var174 = var3.method3650();
                int var175 = var3.method3503();
                class239 var176 = class239.method2052(var175);
                if (var176.field2813 != var172 || var176.field2742 != var174 || var176.field2701 != var173) {
                    var176.field2813 = var172;
                    var176.field2742 = var174;
                    var176.field2701 = var173;
                    method508(var176);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2137 == arg0.field1310) {
                int var177 = var3.method3460();
                if (field732 != var177) {
                    field732 = var177;
                    method163();
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2143 == arg0.field1310) {
                Statics.field355.method1684();
                field843 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2153 == arg0.field1310) {
                Statics.field107 = class314.method1024(var3.method3443());
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2208 == arg0.field1310) {
                byte var178 = var3.method3487();
                int var179 = var3.method3494();
                class234.field2647[var179] = var178;
                if (class234.field2648[var179] != var178) {
                    class234.field2648[var179] = var178;
                }
                method71(var179);
                field836[++field837 - 1 & 0x1F] = var179;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2203 == arg0.field1310) {
                method5289();
                field911 = var3.method3458();
                field925 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2185 == arg0.field1310) {
                class323.method52(var3, arg0.field1313);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2196 == arg0.field1310) {
                Statics.field3320 = var3.method3613();
                Statics.field116 = var3.method3486();
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2186 == arg0.field1310) {
                int var180 = var3.method3460();
                class62 var181 = (class62) field811.method3911((long) var180);
                if (var181 != null) {
                    method5009(var181, true);
                }
                if (field794 != null) {
                    method508(field794);
                    field794 = null;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2193 == arg0.field1310) {
                int var182 = var3.method3458();
                int var183 = var3.method3503();
                class239 var184 = class239.method2052(var183);
                if (var184.field2677 != var182 || var182 == -1) {
                    var184.field2677 = var182;
                    var184.field2818 = 0;
                    var184.field2819 = 0;
                    method508(var184);
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2132 == arg0.field1310) {
                int var185 = var3.method3443();
                if (var3.method3443() == 0) {
                    field917[var185] = new class10();
                    var3.field2419 += 18;
                } else {
                    var3.field2419--;
                    field917[var185] = new class10(var3, false);
                }
                field649 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2147 == arg0.field1310) {
                int var186 = var3.method3650();
                if (var186 == 65535) {
                    var186 = -1;
                }
                method145(var186);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2152 == arg0.field1310) {
                int var187 = var3.method3498();
                int var188 = var3.method3494();
                if (var188 == 65535) {
                    var188 = -1;
                }
                method4415(var188, var187);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2195 == arg0.field1310) {
                method4394(class179.field2340);
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2172 == arg0.field1310) {
                int var189 = var3.method3443();
                int var190 = var3.method3443();
                int var191 = var3.method3443();
                int var192 = var3.method3443();
                field895[var189] = true;
                field896[var189] = var190;
                field897[var189] = var191;
                field898[var189] = var192;
                field762[var189] = 0;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2178 == arg0.field1310) {
                int var193 = var3.method3678();
                class60.method381(var193);
                field838[++field682 - 1 & 0x1F] = var193 & 0x7FFF;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2199 == arg0.field1310) {
                field880 = var3.method3443();
                if (field880 == 255) {
                    field880 = 0;
                }
                field881 = var3.method3443();
                if (field881 == 255) {
                    field881 = 0;
                }
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2217 == arg0.field1310) {
                method5289();
                field817 = var3.method3443();
                field925 = field835;
                arg0.field1310 = null;
                return true;
            }
            if (class176.field2201 == arg0.field1310) {
                int var194 = var3.method3460();
                int var195 = var3.method3460();
                int var196 = class53.method18();
                class180 var197 = class180.method625(class177.field2231, field695.field1308);
                var197.field2350.method3601(var196);
                var197.field2350.method3439(field455);
                var197.field2350.method3500(var194);
                var197.field2350.method3499(var195);
                field695.method2097(var197);
                arg0.field1310 = null;
                return true;
            }
            class160.method2786("" + (arg0.field1310 == null ? -1 : arg0.field1310.field2187) + class81.field1119 + (arg0.field1316 == null ? -1 : arg0.field1316.field2187) + class81.field1119 + (arg0.field1317 == null ? -1 : arg0.field1317.field2187) + class81.field1119 + arg0.field1313, (Throwable) null);
            method11();
        } catch (IOException var202) {
            method5297();
        } catch (Exception var203) {
            String var200 = "" + (arg0.field1310 == null ? -1 : arg0.field1310.field2187) + class81.field1119 + (arg0.field1316 == null ? -1 : arg0.field1316.field2187) + class81.field1119 + (arg0.field1317 == null ? -1 : arg0.field1317.field2187) + class81.field1119 + arg0.field1313 + class81.field1119 + (Statics.field84 + Statics.field187.field999[0]) + class81.field1119 + (Statics.field30 + Statics.field187.field996[0]) + class81.field1119;
            for (int var201 = 0; var201 < arg0.field1313 && var201 < 50; var201++) {
                var200 = var200 + var3.field2420[var201] + class81.field1119;
            }
            class160.method2786(var200, var203);
            method11();
        }
        return true;
    }

    @ObfuscatedName("ik.hq(Lfh;I)V")
    public static final void method4394(class179 arg0) {
        class197 var1 = field695.field1309;
        if (class179.field2342 == arg0) {
            int var2 = var1.method3484();
            int var3 = (var2 >> 4 & 0x7) + Statics.field3320;
            int var4 = (var2 & 0x7) + Statics.field116;
            int var5 = var1.method3486();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field710[var6];
            int var9 = var1.method3494();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method289(Statics.field2219, var3, var4, var8, var9, var6, var7, 0, -1);
            }
        } else if (class179.field2340 == arg0) {
            int var10 = var1.method3678();
            int var11 = var1.method3650();
            int var12 = var1.method3678();
            int var13 = var1.method3484();
            int var14 = (var13 >> 4 & 0x7) + Statics.field3320;
            int var15 = (var13 & 0x7) + Statics.field116;
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class213 var16 = field778[Statics.field2219][var14][var15];
                if (var16 != null) {
                    for (class87 var17 = (class87) var16.method3990(); var17 != null; var17 = (class87) var16.method3984()) {
                        if ((var10 & 0x7FFF) == var17.field1222 && var17.field1225 == var12) {
                            var17.field1225 = var11;
                            break;
                        }
                    }
                    method604(var14, var15);
                }
            }
        } else {
            if (class179.field2341 == arg0) {
                byte var18 = var1.method3488();
                int var19 = var1.method3650();
                byte var20 = var1.method3488();
                int var21 = var1.method3494();
                int var22 = var1.method3610();
                int var23 = var1.method3484();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field710[var24];
                byte var27 = var1.method3487();
                int var28 = var1.method3678();
                byte var29 = var1.method3488();
                int var30 = var1.method3613();
                int var31 = (var30 >> 4 & 0x7) + Statics.field3320;
                int var32 = (var30 & 0x7) + Statics.field116;
                class67 var33;
                if (field826 == var28) {
                    var33 = Statics.field187;
                } else {
                    var33 = field766[var28];
                }
                if (var33 != null) {
                    class275 var34 = class275.method117(var21);
                    int var35;
                    int var36;
                    if (var25 == 1 || var25 == 3) {
                        var35 = var34.field3469;
                        var36 = var34.field3491;
                    } else {
                        var35 = var34.field3491;
                        var36 = var34.field3469;
                    }
                    int var37 = (var35 >> 1) + var31;
                    int var38 = (var35 + 1 >> 1) + var31;
                    int var39 = (var36 >> 1) + var32;
                    int var40 = (var36 + 1 >> 1) + var32;
                    int[][] var41 = class56.field508[Statics.field2219];
                    int var42 = var41[var37][var39] + var41[var38][var39] + var41[var37][var40] + var41[var38][var40] >> 2;
                    int var43 = (var31 << 7) + (var35 << 6);
                    int var44 = (var32 << 7) + (var36 << 6);
                    class127 var45 = var34.method4845(var24, var25, var41, var43, var42, var44);
                    if (var45 != null) {
                        method289(Statics.field2219, var31, var32, var26, -1, 0, 0, var22 + 1, var19 + 1);
                        var33.field637 = field660 + var22;
                        var33.field620 = field660 + var19;
                        var33.field624 = var45;
                        var33.field638 = var31 * 128 + var35 * 64;
                        var33.field623 = var32 * 128 + var36 * 64;
                        var33.field618 = var42;
                        if (var18 > var29) {
                            byte var46 = var18;
                            var18 = var29;
                            var29 = var46;
                        }
                        if (var27 > var20) {
                            byte var47 = var27;
                            var27 = var20;
                            var20 = var47;
                        }
                        var33.field631 = var18 + var31;
                        var33.field627 = var29 + var31;
                        var33.field626 = var27 + var32;
                        var33.field629 = var20 + var32;
                    }
                }
            }
            if (class179.field2339 == arg0) {
                int var48 = var1.method3486();
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                int var51 = field710[var49];
                int var52 = var1.method3486();
                int var53 = (var52 >> 4 & 0x7) + Statics.field3320;
                int var54 = (var52 & 0x7) + Statics.field116;
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    method289(Statics.field2219, var53, var54, var51, -1, var49, var50, 0, -1);
                }
            } else if (class179.field2333 == arg0) {
                int var55 = var1.method3486();
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = field710[var56];
                int var59 = var1.method3613();
                int var60 = (var59 >> 4 & 0x7) + Statics.field3320;
                int var61 = (var59 & 0x7) + Statics.field116;
                int var62 = var1.method3610();
                if (var60 >= 0 && var61 >= 0 && var60 < 103 && var61 < 103) {
                    if (var58 == 0) {
                        class136 var63 = Statics.field28.method2900(Statics.field2219, var60, var61);
                        if (var63 != null) {
                            int var64 = class128.method2337(var63.field1872);
                            if (var56 == 2) {
                                var63.field1870 = new class93(var64, 2, var57 + 4, Statics.field2219, var60, var61, var62, false, var63.field1870);
                                var63.field1871 = new class93(var64, 2, var57 + 1 & 0x3, Statics.field2219, var60, var61, var62, false, var63.field1871);
                            } else {
                                var63.field1870 = new class93(var64, var56, var57, Statics.field2219, var60, var61, var62, false, var63.field1870);
                            }
                        }
                    }
                    if (var58 == 1) {
                        class141 var65 = Statics.field28.method3046(Statics.field2219, var60, var61);
                        if (var65 != null) {
                            int var66 = class128.method2337(var65.field1917);
                            if (var56 == 4 || var56 == 5) {
                                var65.field1915 = new class93(var66, 4, var57, Statics.field2219, var60, var61, var62, false, var65.field1915);
                            } else if (var56 == 6) {
                                var65.field1915 = new class93(var66, 4, var57 + 4, Statics.field2219, var60, var61, var62, false, var65.field1915);
                            } else if (var56 == 7) {
                                var65.field1915 = new class93(var66, 4, (var57 + 2 & 0x3) + 4, Statics.field2219, var60, var61, var62, false, var65.field1915);
                            } else if (var56 == 8) {
                                var65.field1915 = new class93(var66, 4, var57 + 4, Statics.field2219, var60, var61, var62, false, var65.field1915);
                                var65.field1908 = new class93(var66, 4, (var57 + 2 & 0x3) + 4, Statics.field2219, var60, var61, var62, false, var65.field1908);
                            }
                        }
                    }
                    if (var58 == 2) {
                        class142 var67 = Statics.field28.method2902(Statics.field2219, var60, var61);
                        if (var56 == 11) {
                            var56 = 10;
                        }
                        if (var67 != null) {
                            var67.field1923 = new class93(class128.method2337(var67.field1919), var56, var57, Statics.field2219, var60, var61, var62, false, var67.field1923);
                        }
                    }
                    if (var58 == 3) {
                        class123 var68 = Statics.field28.method2903(Statics.field2219, var60, var61);
                        if (var68 != null) {
                            var68.field1605 = new class93(class128.method2337(var68.field1611), 22, var57, Statics.field2219, var60, var61, var62, false, var68.field1605);
                        }
                    }
                }
            } else if (class179.field2336 == arg0) {
                int var69 = var1.method3610();
                int var70 = var1.method3484();
                int var71 = var1.method3494();
                int var72 = var1.method3443();
                int var73 = (var72 >> 4 & 0x7) + Statics.field3320;
                int var74 = (var72 & 0x7) + Statics.field116;
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    int var75 = var73 * 128 + 64;
                    int var76 = var74 * 128 + 64;
                    class77 var77 = new class77(var69, Statics.field2219, var75, var76, method3376(var75, var76, Statics.field2219) - var70, var71, field660);
                    field781.method3966(var77);
                }
            } else if (class179.field2338 == arg0) {
                int var78 = var1.method3486() * 4;
                int var79 = var1.method3610();
                int var80 = var1.method3494();
                int var81 = var1.method3486() * 4;
                int var82 = var1.method3496();
                int var83 = var1.method3443();
                int var84 = var1.method3486();
                int var85 = var1.method3678();
                int var86 = var1.method3484();
                int var87 = (var86 >> 4 & 0x7) + Statics.field3320;
                int var88 = (var86 & 0x7) + Statics.field116;
                byte var89 = var1.method3487();
                byte var90 = var1.method3488();
                int var91 = var87 + var90;
                int var92 = var88 + var89;
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var80 != 65535) {
                    int var93 = var87 * 128 + 64;
                    int var94 = var88 * 128 + 64;
                    int var95 = var91 * 128 + 64;
                    int var96 = var92 * 128 + 64;
                    class86 var97 = new class86(var80, Statics.field2219, var93, var94, method3376(var93, var94, Statics.field2219) - var81, field660 + var85, field660 + var79, var83, var84, var82, var78);
                    var97.method1957(var95, var96, method3376(var95, var96, Statics.field2219) - var78, field660 + var85);
                    field780.method3966(var97);
                }
            } else if (class179.field2334 == arg0) {
                int var98 = var1.method3484();
                int var99 = (var98 >> 4 & 0x7) + Statics.field3320;
                int var100 = (var98 & 0x7) + Statics.field116;
                int var101 = var1.method3650();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    class213 var102 = field778[Statics.field2219][var99][var100];
                    if (var102 != null) {
                        for (class87 var103 = (class87) var102.method3990(); var103 != null; var103 = (class87) var102.method3984()) {
                            if ((var101 & 0x7FFF) == var103.field1222) {
                                var103.method3960();
                                break;
                            }
                        }
                        if (var102.method3990() == null) {
                            field778[Statics.field2219][var99][var100] = null;
                        }
                        method604(var99, var100);
                    }
                }
            } else if (class179.field2335 == arg0) {
                int var104 = var1.method3494();
                int var105 = var1.method3650();
                int var106 = var1.method3484();
                int var107 = (var106 >> 4 & 0x7) + Statics.field3320;
                int var108 = (var106 & 0x7) + Statics.field116;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class87 var109 = new class87();
                    var109.field1222 = var105;
                    var109.field1225 = var104;
                    if (field778[Statics.field2219][var107][var108] == null) {
                        field778[Statics.field2219][var107][var108] = new class213();
                    }
                    field778[Statics.field2219][var107][var108].method3966(var109);
                    method604(var107, var108);
                }
            } else if (class179.field2345 == arg0) {
                int var110 = var1.method3443();
                int var111 = (var110 >> 4 & 0x7) + Statics.field3320;
                int var112 = (var110 & 0x7) + Statics.field116;
                int var113 = var1.method3486();
                int var114 = var1.method3484();
                int var115 = var114 >> 4 & 0xF;
                int var116 = var114 & 0x7;
                int var117 = var1.method3650();
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    int var118 = var115 + 1;
                    if (Statics.field187.field999[0] >= var111 - var118 && Statics.field187.field999[0] <= var111 + var118 && Statics.field187.field996[0] >= var112 - var118 && Statics.field187.field996[0] <= var112 + var118 && field887 != 0 && var116 > 0 && field888 < 50) {
                        field807[field888] = var117;
                        field890[field888] = var116;
                        field891[field888] = var113;
                        field893[field888] = null;
                        field892[field888] = (var111 << 16) + (var112 << 8) + var115;
                        field888++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.hm(IIIIIIIIIB)V")
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field779.method3990(); var10 != null; var10 = (class69) field779.method3984()) {
            if (var10.field927 == arg0 && var10.field929 == arg1 && var10.field930 == arg2 && var10.field935 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field927 = arg0;
            var9.field935 = arg3;
            var9.field929 = arg1;
            var9.field930 = arg2;
            method4417(var9);
            field779.method3966(var9);
        }
        var9.field934 = arg4;
        var9.field936 = arg5;
        var9.field933 = arg6;
        var9.field932 = arg7;
        var9.field938 = arg8;
    }

    @ObfuscatedName("bb.hw(B)V")
    public static final void method1108() {
        for (class69 var0 = (class69) field779.method3990(); var0 != null; var0 = (class69) field779.method3984()) {
            if (var0.field938 == -1) {
                var0.field932 = 0;
                method4417(var0);
            } else {
                var0.method3960();
            }
        }
    }

    @ObfuscatedName("ig.hu(Lbj;B)V")
    public static final void method4417(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field935 == 0) {
            var1 = Statics.field28.method2977(arg0.field927, arg0.field929, arg0.field930);
        }
        if (arg0.field935 == 1) {
            var1 = Statics.field28.method2905(arg0.field927, arg0.field929, arg0.field930);
        }
        if (arg0.field935 == 2) {
            var1 = Statics.field28.method2906(arg0.field927, arg0.field929, arg0.field930);
        }
        if (arg0.field935 == 3) {
            var1 = Statics.field28.method2970(arg0.field927, arg0.field929, arg0.field930);
        }
        if (var1 != 0L) {
            int var6 = Statics.field28.method2908(arg0.field927, arg0.field929, arg0.field930, var1);
            var3 = class128.method2337(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field931 = var3;
        arg0.field937 = var4;
        arg0.field928 = var5;
    }

    @ObfuscatedName("cm.hd(IIIIIIII)V")
    public static final void method1905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field654 && Statics.field2219 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field28.method2977(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field28.method2905(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field28.method2906(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field28.method2970(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field28.method2908(arg0, arg2, arg3, var7);
            int var13 = class128.method2337(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field28.method2895(arg0, arg2, arg3);
                class275 var16 = class275.method117(var13);
                if (var16.field3457 != 0) {
                    field707[arg0].method3324(arg2, arg3, var14, var15, var16.field3462);
                }
            }
            if (arg1 == 1) {
                Statics.field28.method2951(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field28.method2897(arg0, arg2, arg3);
                class275 var17 = class275.method117(var13);
                if (var17.field3491 + arg2 > 103 || var17.field3491 + arg3 > 103 || var17.field3469 + arg2 > 103 || var17.field3469 + arg3 > 103) {
                    return;
                }
                if (var17.field3457 != 0) {
                    field707[arg0].method3338(arg2, arg3, var17.field3491, var17.field3469, var15, var17.field3462);
                }
            }
            if (arg1 == 3) {
                Statics.field28.method3051(arg0, arg2, arg3);
                class275 var18 = class275.method117(var13);
                if (var18.field3457 == 1) {
                    field707[arg0].method3327(arg2, arg3);
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
        class133 var20 = Statics.field28;
        class172 var21 = field707[arg0];
        class275 var22 = class275.method117(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3469;
            var24 = var22.field3491;
        } else {
            var23 = var22.field3491;
            var24 = var22.field3469;
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
        int[][] var29 = class56.field508[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class128.method2069(arg2, arg3, 2, var22.field3472 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3493 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class135 var36;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var36 = var22.method4845(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class93(arg4, 22, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2884(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3457 == 1) {
                var21.method3332(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class135 var62;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var62 = var22.method4845(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class93(arg4, 10, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            if (var62 != null) {
                var20.method2888(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3457 != 0) {
                var21.method3321(arg2, arg3, var23, var24, var22.field3462);
            }
        } else if (arg6 >= 12) {
            class135 var37;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var37 = var22.method4845(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class93(arg4, arg6, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2888(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3321(arg2, arg3, var23, var24, var22.field3462);
            }
        } else if (arg6 == 0) {
            class135 var38;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var38 = var22.method4845(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class93(arg4, 0, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2886(arg0, arg2, arg3, var30, var38, (class135) null, class56.field516[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3333(arg2, arg3, arg6, arg5, var22.field3462);
            }
        } else if (arg6 == 1) {
            class135 var39;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var39 = var22.method4845(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class93(arg4, 1, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2886(arg0, arg2, arg3, var30, var39, (class135) null, class56.field519[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3333(arg2, arg3, arg6, arg5, var22.field3462);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class135 var41;
            class135 var42;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var41 = var22.method4845(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4845(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class93(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3476, true, (class135) null);
                var42 = new class93(arg4, 2, var40, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2886(arg0, arg2, arg3, var30, var41, var42, class56.field516[arg5], class56.field516[var40], var33, var35);
            if (var22.field3457 != 0) {
                var21.method3333(arg2, arg3, arg6, arg5, var22.field3462);
            }
        } else if (arg6 == 3) {
            class135 var43;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var43 = var22.method4845(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class93(arg4, 3, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2886(arg0, arg2, arg3, var30, var43, (class135) null, class56.field519[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3333(arg2, arg3, arg6, arg5, var22.field3462);
            }
        } else if (arg6 == 9) {
            class135 var44;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var44 = var22.method4845(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class93(arg4, arg6, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2888(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3321(arg2, arg3, var23, var24, var22.field3462);
            }
        } else if (arg6 == 4) {
            class135 var45;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var45 = var22.method4845(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class93(arg4, 4, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2887(arg0, arg2, arg3, var30, var45, (class135) null, class56.field516[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2977(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class275.method117(class128.method2337(var47)).field3483;
            }
            class135 var49;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var49 = var22.method4845(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class93(arg4, 4, arg5, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2887(arg0, arg2, arg3, var30, var49, (class135) null, class56.field516[arg5], 0, class56.field517[arg5] * var46, class56.field520[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2977(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class275.method117(class128.method2337(var51)).field3483 / 2;
            }
            class135 var53;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var53 = var22.method4845(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class93(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2887(arg0, arg2, arg3, var30, var53, (class135) null, 256, arg5, class56.field521[arg5] * var50, class56.field511[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class135 var55;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var55 = var22.method4845(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class93(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2887(arg0, arg2, arg3, var30, var55, (class135) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2977(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class275.method117(class128.method2337(var57)).field3483 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class135 var60;
            class135 var61;
            if (var22.field3476 == -1 && var22.field3494 == null) {
                var60 = var22.method4845(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4845(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class93(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3476, true, (class135) null);
                var61 = new class93(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3476, true, (class135) null);
            }
            var20.method2887(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class56.field521[arg5] * var56, class56.field511[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("as.hn(III)V")
    public static final void method604(int arg0, int arg1) {
        class213 var2 = field778[Statics.field2219][arg0][arg1];
        if (var2 == null) {
            Statics.field28.method2899(Statics.field2219, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class87 var5 = null;
        for (class87 var6 = (class87) var2.method3990(); var6 != null; var6 = (class87) var2.method3984()) {
            class276 var7 = class276.method1049(var6.field1222);
            long var8 = (long) var7.field3527;
            if (var7.field3526 == 1) {
                var8 = (long) (var6.field1225 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field28.method2899(Statics.field2219, arg0, arg1);
            return;
        }
        var2.method3967(var5);
        class87 var10 = null;
        class87 var11 = null;
        for (class87 var12 = (class87) var2.method3990(); var12 != null; var12 = (class87) var2.method3984()) {
            if (var5.field1222 != var12.field1222) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1222 != var12.field1222 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class128.method2069(arg0, arg1, 3, false, 0);
        Statics.field28.method2885(Statics.field2219, arg0, arg1, method3376(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2219), var5, var13, var10, var11);
    }

    @ObfuscatedName("ip.hl(ZLge;I)V")
    public static final void method4584(boolean arg0, class197 arg1) {
        field771 = 0;
        field816 = 0;
        method4246();
        method3078(arg0, arg1);
        for (int var2 = 0; var2 < field816; var2++) {
            int var3 = field694[var2];
            class79 var4 = field693[var3];
            int var5 = arg1.method3443();
            if ((var5 & 0x1) != 0) {
                var4.field966 = arg1.method3678();
                if (var4.field966 == 65535) {
                    var4.field966 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var6 = arg1.method3650();
                int var7 = arg1.method3650();
                int var8 = var4.field948 - (var6 - Statics.field84 - Statics.field84) * 64;
                int var9 = var4.field949 - (var7 - Statics.field30 - Statics.field30) * 64;
                if (var8 != 0 || var9 != 0) {
                    var4.field968 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x20) != 0) {
                int var10 = arg1.method3610();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg1.method3486();
                if (var4.field939 == var10 && var10 != -1) {
                    int var12 = class280.method3173(var10).field3633;
                    if (var12 == 1) {
                        var4.field973 = 0;
                        var4.field974 = 0;
                        var4.field975 = var11;
                        var4.field976 = 0;
                    }
                    if (var12 == 2) {
                        var4.field976 = 0;
                    }
                } else if (var10 == -1 || var4.field939 == -1 || class280.method3173(var10).field3627 >= class280.method3173(var4.field939).field3627) {
                    var4.field939 = var10;
                    var4.field973 = 0;
                    var4.field974 = 0;
                    var4.field975 = var11;
                    var4.field976 = 0;
                    var4.field951 = var4.field994;
                }
            }
            if ((var5 & 0x4) != 0) {
                var4.field1103 = class278.method3363(arg1.method3610());
                var4.field943 = var4.field1103.field3571;
                var4.field940 = var4.field1103.field3594;
                var4.field945 = var4.field1103.field3577;
                var4.field980 = var4.field1103.field3578;
                var4.field950 = var4.field1103.field3575;
                var4.field972 = var4.field1103.field3580;
                var4.field952 = var4.field1103.field3602;
                var4.field946 = var4.field1103.field3579;
                var4.field947 = var4.field1103.field3576;
            }
            if ((var5 & 0x10) != 0) {
                int var13 = arg1.method3613();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg1.method3638();
                        if (var18 == 32767) {
                            var18 = arg1.method3638();
                            var16 = arg1.method3638();
                            var15 = arg1.method3638();
                            var17 = arg1.method3638();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg1.method3638();
                        }
                        int var19 = arg1.method3638();
                        var4.method1587(var18, var16, var15, var17, field660, var19);
                    }
                }
                int var20 = arg1.method3484();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg1.method3638();
                        int var23 = arg1.method3638();
                        if (var23 == 32767) {
                            var4.method1591(var22);
                        } else {
                            int var24 = arg1.method3638();
                            int var25 = arg1.method3443();
                            int var26 = var23 > 0 ? arg1.method3486() : var25;
                            var4.method1590(var22, field660, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field977 = arg1.method3678();
                int var27 = arg1.method3502();
                var4.field993 = var27 >> 16;
                var4.field941 = (var27 & 0xFFFF) + field660;
                var4.field965 = 0;
                var4.field979 = 0;
                if (var4.field941 > field660) {
                    var4.field965 = -1;
                }
                if (var4.field977 == 65535) {
                    var4.field977 = -1;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field953 = arg1.method3647();
                var4.field983 = 100;
            }
        }
        for (int var28 = 0; var28 < field771; var28++) {
            int var29 = field772[var28];
            if (field660 != field693[var29].field989) {
                field693[var29].field1103 = null;
                field693[var29] = null;
            }
        }
        if (field695.field1313 != arg1.field2419) {
            throw new RuntimeException(arg1.field2419 + class81.field1119 + field695.field1313);
        }
        for (int var30 = 0; var30 < field691; var30++) {
            if (field693[field692[var30]] == null) {
                throw new RuntimeException(var30 + class81.field1119 + field691);
            }
        }
    }

    @ObfuscatedName("hb.hf(B)V")
    public static final void method4246() {
        class197 var0 = field695.field1309;
        var0.method3744();
        int var1 = var0.method3733(8);
        if (var1 < field691) {
            for (int var2 = var1; var2 < field691; var2++) {
                field772[++field771 - 1] = field692[var2];
            }
        }
        if (var1 > field691) {
            throw new RuntimeException("");
        }
        field691 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field692[var3];
            class79 var5 = field693[var4];
            int var6 = var0.method3733(1);
            if (var6 == 0) {
                field692[++field691 - 1] = var4;
                var5.field989 = field660;
            } else {
                int var7 = var0.method3733(2);
                if (var7 == 0) {
                    field692[++field691 - 1] = var4;
                    var5.field989 = field660;
                    field694[++field816 - 1] = var4;
                } else if (var7 == 1) {
                    field692[++field691 - 1] = var4;
                    var5.field989 = field660;
                    int var8 = var0.method3733(3);
                    var5.method1899(var8, (byte) 1);
                    int var9 = var0.method3733(1);
                    if (var9 == 1) {
                        field694[++field816 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field692[++field691 - 1] = var4;
                    var5.field989 = field660;
                    int var10 = var0.method3733(3);
                    var5.method1899(var10, (byte) 2);
                    int var11 = var0.method3733(3);
                    var5.method1899(var11, (byte) 2);
                    int var12 = var0.method3733(1);
                    if (var12 == 1) {
                        field694[++field816 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field772[++field771 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ef.hc(ZLge;B)V")
    public static final void method3078(boolean arg0, class197 arg1) {
        while (true) {
            if (arg1.method3735(field695.field1313) >= 27) {
                int var2 = arg1.method3733(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field693[var2] == null) {
                        field693[var2] = new class79();
                        var3 = true;
                    }
                    class79 var4 = field693[var2];
                    field692[++field691 - 1] = var2;
                    var4.field989 = field660;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3733(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3733(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method3733(1);
                    int var7 = field889[arg1.method3733(3)];
                    if (var3) {
                        var4.field991 = var4.field990 = var7;
                    }
                    int var8 = arg1.method3733(1);
                    if (var8 == 1) {
                        field694[++field816 - 1] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method3733(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method3733(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1103 = class278.method3363(arg1.method3733(14));
                    var4.field943 = var4.field1103.field3571;
                    var4.field940 = var4.field1103.field3594;
                    if (var4.field940 == 0) {
                        var4.field990 = 0;
                    }
                    var4.field945 = var4.field1103.field3577;
                    var4.field980 = var4.field1103.field3578;
                    var4.field950 = var4.field1103.field3575;
                    var4.field972 = var4.field1103.field3580;
                    var4.field952 = var4.field1103.field3602;
                    var4.field946 = var4.field1103.field3579;
                    var4.field947 = var4.field1103.field3576;
                    var4.method1900(Statics.field187.field999[0] + var5, Statics.field187.field996[0] + var9, var6 == 1);
                    continue;
                }
            }
            arg1.method3752();
            return;
        }
    }

    @ObfuscatedName("k.hb(Lbw;IIBI)V")
    public static final void method212(class67 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field999[0];
        int var5 = arg0.field996[0];
        int var6 = arg0.method1119();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1119();
        class174 var8 = method191(arg1, arg2);
        class172 var9 = field707[arg0.field632];
        int[] var10 = field923;
        int[] var11 = field877;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class173.field2118[var12][var13] = 0;
                class173.field2116[var12][var13] = 99999999;
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
            class173.field2118[var16][var17] = 99;
            class173.field2116[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class173.field2122[var20] = var4;
            int var78 = var20 + 1;
            class173.field2123[var20] = var5;
            int[][] var22 = var9.field2108;
            boolean var27;
            while (true) {
                if (var78 == var21) {
                    Statics.field2120 = var14;
                    Statics.field1223 = var15;
                    var27 = false;
                    break;
                }
                var14 = class173.field2122[var21];
                var15 = class173.field2123[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2109;
                int var26 = var15 - var9.field2112;
                if (var8.method1104(1, var14, var15, var9)) {
                    Statics.field2120 = var14;
                    Statics.field1223 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class173.field2116[var23][var24] + 1;
                if (var23 > 0 && class173.field2118[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class173.field2122[var78] = var14 - 1;
                    class173.field2123[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 - 1][var24] = 2;
                    class173.field2116[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class173.field2118[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class173.field2122[var78] = var14 + 1;
                    class173.field2123[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 + 1][var24] = 8;
                    class173.field2116[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class173.field2118[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class173.field2122[var78] = var14;
                    class173.field2123[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23][var24 - 1] = 1;
                    class173.field2116[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class173.field2118[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class173.field2122[var78] = var14;
                    class173.field2123[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23][var24 + 1] = 4;
                    class173.field2116[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class173.field2118[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class173.field2122[var78] = var14 - 1;
                    class173.field2123[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 - 1][var24 - 1] = 3;
                    class173.field2116[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class173.field2118[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class173.field2122[var78] = var14 + 1;
                    class173.field2123[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 + 1][var24 - 1] = 9;
                    class173.field2116[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class173.field2118[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class173.field2122[var78] = var14 - 1;
                    class173.field2123[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 - 1][var24 + 1] = 6;
                    class173.field2116[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class173.field2118[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class173.field2122[var78] = var14 + 1;
                    class173.field2123[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class173.field2118[var23 + 1][var24 + 1] = 12;
                    class173.field2116[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class173.method1158(var4, var5, var8, var9);
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class173.field2118[var32][var33] = 99;
            class173.field2116[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class173.field2122[var36] = var4;
            int var79 = var36 + 1;
            class173.field2123[var36] = var5;
            int[][] var38 = var9.field2108;
            boolean var43;
            label514: while (true) {
                label512: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var79 == var37) {
                                        Statics.field2120 = var30;
                                        Statics.field1223 = var31;
                                        var43 = false;
                                        break label514;
                                    }
                                    var30 = class173.field2122[var37];
                                    var31 = class173.field2123[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2109;
                                    var42 = var31 - var9.field2112;
                                    if (var8.method1104(var7, var30, var31, var9)) {
                                        Statics.field2120 = var30;
                                        Statics.field1223 = var31;
                                        var43 = true;
                                        break label514;
                                    }
                                    var44 = class173.field2116[var39][var40] + 1;
                                    if (var39 > 0 && class173.field2118[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class173.field2122[var79] = var30 - 1;
                                                class173.field2123[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39 - 1][var40] = 2;
                                                class173.field2116[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class173.field2118[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class173.field2122[var79] = var30 + 1;
                                                class173.field2123[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39 + 1][var40] = 8;
                                                class173.field2116[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class173.field2118[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class173.field2122[var79] = var30;
                                                class173.field2123[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39][var40 - 1] = 1;
                                                class173.field2116[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class173.field2118[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class173.field2122[var79] = var30;
                                                class173.field2123[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39][var40 + 1] = 4;
                                                class173.field2116[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class173.field2118[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class173.field2122[var79] = var30 - 1;
                                                class173.field2123[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39 - 1][var40 - 1] = 3;
                                                class173.field2116[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class173.field2118[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class173.field2122[var79] = var30 + 1;
                                                class173.field2123[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class173.field2118[var39 + 1][var40 - 1] = 9;
                                                class173.field2116[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class173.field2118[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class173.field2122[var79] = var30 - 1;
                                        class173.field2123[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class173.field2118[var39 - 1][var40 + 1] = 6;
                                        class173.field2116[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class173.field2118[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class173.field2122[var79] = var30 + 1;
                    class173.field2123[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class173.field2118[var39 + 1][var40 + 1] = 12;
                    class173.field2116[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        }
        int var71;
        label570: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field2120;
            int var56 = Statics.field1223;
            if (!var29) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2128;
                int var61 = var8.field2127;
                int var62 = var8.field2131;
                int var63 = var8.field2130;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class173.field2116[var66][var67] < 100) {
                            int var68 = 0;
                            if (var64 < var60) {
                                var68 = var60 - var64;
                            } else if (var64 > var60 + var62 - 1) {
                                var68 = var64 - (var60 + var62 - 1);
                            }
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = var68 * var68 + var69 * var69;
                            if (var70 < var57 || var57 == var70 && class173.field2116[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class173.field2116[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label570;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var71 = 0;
            } else {
                byte var72 = 0;
                class173.field2122[var72] = var55;
                int var80 = var72 + 1;
                class173.field2123[var72] = var56;
                int var73;
                int var74 = var73 = class173.field2118[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class173.field2122[var80] = var55;
                        class173.field2123[var80++] = var56;
                    }
                    if ((var74 & 0x2) != 0) {
                        var55++;
                    } else if ((var74 & 0x8) != 0) {
                        var55--;
                    }
                    if ((var74 & 0x1) != 0) {
                        var56++;
                    } else if ((var74 & 0x4) != 0) {
                        var56--;
                    }
                    var74 = class173.field2118[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class173.field2122[var80];
                    var11[var75++] = class173.field2123[var80];
                    if (var75 >= var10.length) {
                        break;
                    }
                }
                var71 = var75;
            }
        }
        int var76 = var71;
        if (var71 >= 1) {
            for (int var77 = 0; var77 < var76 - 1; var77++) {
                arg0.method1123(field923[var77], field877[var77], arg3);
            }
        }
    }

    @ObfuscatedName("y.hx(IIB)Lfu;")
    public static class174 method191(int arg0, int arg1) {
        field819.field2128 = arg0;
        field819.field2127 = arg1;
        field819.field2131 = 1;
        field819.field2130 = 1;
        return field819;
    }

    @ObfuscatedName("q.hz(I)V")
    public static void method87() {
        field787 = 0;
        field786 = false;
    }

    @ObfuscatedName("b.hk(B)V")
    public static void method115() {
        method87();
        field792[0] = class246.field3143;
        field793[0] = "";
        field856[0] = 1006;
        field727[0] = false;
        field787 = 1;
    }

    @ObfuscatedName("fh.hs(IIB)V")
    public static final void method3364(int arg0, int arg1) {
        if (field787 < 2 && field847 == 0 && !field805 || !field700) {
            return;
        }
        int var2 = field787 - 1;
        String var4;
        if (field847 == 1 && field787 < 2) {
            var4 = class246.field2951 + class246.field3041 + field804 + " " + class81.field1126;
        } else if (field805 && field787 < 2) {
            var4 = field808 + class246.field3041 + field809 + " " + class81.field1126;
        } else {
            var4 = method3188(var2);
        }
        if (field787 > 2) {
            var4 = var4 + class81.method1019(16777215) + " " + '/' + " " + (field787 - 2) + class246.field2942;
        }
        Statics.field501.method5327(var4, arg0 + 4, arg1 + 15, 16777215, 0, field660 / 1000);
    }

    @ObfuscatedName("y.if(B)V")
    public static final void method187() {
        int var0 = Statics.field277;
        int var1 = Statics.field57;
        int var2 = Statics.field3310;
        int var3 = Statics.field1950;
        int var4 = 6116423;
        class324.method5551(var0, var1, var2, var3, var4);
        class324.method5551(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class324.method5555(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field501.method5319(class246.field3034, var0 + 3, var1 + 14, var4, -1);
        int var5 = class54.field488;
        int var6 = class54.field489;
        for (int var7 = 0; var7 < field787; var7++) {
            int var8 = (field787 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field501.method5319(method3188(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field277;
        int var11 = Statics.field57;
        int var12 = Statics.field3310;
        int var13 = Statics.field1950;
        for (int var14 = 0; var14 < field853; var14++) {
            if (field858[var14] + field687[var14] > var10 && field858[var14] < var10 + var12 && field861[var14] + field829[var14] > var11 && field829[var14] < var11 + var13) {
                field924[var14] = true;
            }
        }
    }

    @ObfuscatedName("bo.il(IIIII)V")
    public static final void method932(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field853; var4++) {
            if (field858[var4] + field687[var4] > arg0 && field858[var4] < arg0 + arg2 && field861[var4] + field829[var4] > arg1 && field829[var4] < arg1 + arg3) {
                field796[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.iy(I)V")
    public final void method1188() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field787 - 1; var2++) {
                if (field856[var2] < 1000 && field856[var2 + 1] > 1000) {
                    String var3 = field793[var2];
                    field793[var2] = field793[var2 + 1];
                    field793[var2 + 1] = var3;
                    String var4 = field792[var2];
                    field792[var2] = field792[var2 + 1];
                    field792[var2 + 1] = var4;
                    int var5 = field856[var2];
                    field856[var2] = field856[var2 + 1];
                    field856[var2 + 1] = var5;
                    int var6 = field742[var2];
                    field742[var2] = field742[var2 + 1];
                    field742[var2 + 1] = var6;
                    int var7 = field914[var2];
                    field914[var2] = field914[var2 + 1];
                    field914[var2 + 1] = var7;
                    int var8 = field717[var2];
                    field717[var2] = field717[var2 + 1];
                    field717[var2 + 1] = var8;
                    boolean var9 = field727[var2];
                    field727[var2] = field727[var2 + 1];
                    field727[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field421 != null || field823 != null) {
            return;
        }
        int var21;
        int var24;
        int var25;
        label214: {
            int var10 = class54.field497;
            if (field786) {
                if (var10 != 1 && (Statics.field1523 || var10 != 4)) {
                    int var11 = class54.field488;
                    int var12 = class54.field489;
                    if (var11 < Statics.field277 - 10 || var11 > Statics.field3310 + Statics.field277 + 10 || var12 < Statics.field57 - 10 || var12 > Statics.field57 + Statics.field1950 + 10) {
                        field786 = false;
                        method932(Statics.field277, Statics.field57, Statics.field3310, Statics.field1950);
                    }
                }
                if (var10 == 1 || !Statics.field1523 && var10 == 4) {
                    int var13 = Statics.field277;
                    int var14 = Statics.field57;
                    int var15 = Statics.field3310;
                    int var16 = class54.field496;
                    int var17 = class54.field480;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field787; var19++) {
                        int var20 = (field787 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        method1011(var18);
                    }
                    field786 = false;
                    method932(Statics.field277, Statics.field57, Statics.field3310, Statics.field1950);
                }
            } else {
                var21 = field787 - 1;
                if ((var10 == 1 || !Statics.field1523 && var10 == 4) && var21 >= 0) {
                    int var23 = field856[var21];
                    if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                        var24 = field742[var21];
                        var25 = field914[var21];
                        class239 var26 = class239.method2052(var25);
                        int var27 = method62(var26);
                        boolean var28 = (var27 >> 28 & 0x1) != 0;
                        if (var28) {
                            break label214;
                        }
                        int var29 = method62(var26);
                        boolean var30 = (var29 >> 29 & 0x1) != 0;
                        if (var30) {
                            break label214;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field1523 && var10 == 4) && this.method1189()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field1523 && var10 == 4) && field787 > 0) {
                    method1011(var21);
                }
                if (var10 == 2 && field787 > 0) {
                    this.method1539(class54.field496, class54.field480);
                }
            }
            return;
        }
        if (Statics.field421 != null && !field812 && field787 > 0 && !this.method1189()) {
            int var31 = field686;
            int var32 = field810;
            class82 var33 = Statics.field25;
            method667(var33.field1135, var33.field1129, var33.field1131, var33.field1132, var33.field1133, var33.field1133, var31, var32);
            Statics.field25 = null;
        }
        field812 = false;
        field763 = 0;
        if (Statics.field421 != null) {
            method508(Statics.field421);
        }
        Statics.field421 = class239.method2052(var25);
        field784 = var24;
        field686 = class54.field496;
        field810 = class54.field480;
        if (var21 >= 0) {
            method3118(var21);
        }
        method508(Statics.field421);
    }

    @ObfuscatedName("client.ic(I)Z")
    public final boolean method1189() {
        int var1 = field787 - 1;
        return (field785 == 1 && field787 > 2 || method5115(var1)) && !field727[var1];
    }

    @ObfuscatedName("client.ia(IIB)V")
    public final void method1539(int arg0, int arg1) {
        method1755(arg0, arg1);
        Statics.field28.method2915(Statics.field2219, arg0, arg1, false);
        field786 = true;
    }

    @ObfuscatedName("bc.im(III)V")
    public static void method1755(int arg0, int arg1) {
        int var2 = Statics.field501.method5314(class246.field3034);
        for (int var3 = 0; var3 < field787; var3++) {
            int var4 = Statics.field501.method5314(method3188(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field787 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field75) {
            var6 = Statics.field75 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field348) {
            var7 = Statics.field348 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field277 = var6;
        Statics.field57 = var7;
        Statics.field3310 = var2;
        Statics.field1950 = field787 * 15 + 22;
    }

    @ObfuscatedName("kn.ik(II)Z")
    public static final boolean method5115(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field856[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bd.ie(II)V")
    public static final void method1011(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field742[arg0];
        int var2 = field914[arg0];
        int var3 = field856[arg0];
        int var4 = field717[arg0];
        String var5 = field792[arg0];
        String var6 = field793[arg0];
        method667(var1, var2, var3, var4, var5, var6, class54.field496, class54.field480);
    }

    @ObfuscatedName("aq.iu(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 20) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var8 = class180.method625(class177.field2226, field695.field1308);
            var8.field2350.method3490(Statics.field30 + arg1);
            var8.field2350.method3676(class45.field391[82] ? 1 : 0);
            var8.field2350.method3490(Statics.field84 + arg0);
            var8.field2350.method3490(arg3);
            field695.method2097(var8);
        }
        if (arg2 == 36) {
            class180 var9 = class180.method625(class177.field2227, field695.field1308);
            var9.field2350.method3492(arg3);
            var9.field2350.method3442(arg1);
            var9.field2350.method3492(arg0);
            field695.method2097(var9);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 51) {
            class67 var10 = field766[arg3];
            if (var10 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var11 = class180.method625(class177.field2240, field695.field1308);
                var11.field2350.method3601(class45.field391[82] ? 1 : 0);
                var11.field2350.method3492(arg3);
                field695.method2097(var11);
            }
        }
        if (arg2 == 45) {
            class67 var12 = field766[arg3];
            if (var12 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var13 = class180.method625(class177.field2276, field695.field1308);
                var13.field2350.method3481(class45.field391[82] ? 1 : 0);
                var13.field2350.method3491(arg3);
                field695.method2097(var13);
            }
        }
        if (arg2 == 50) {
            class67 var14 = field766[arg3];
            if (var14 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var15 = class180.method625(class177.field2295, field695.field1308);
                var15.field2350.method3676(class45.field391[82] ? 1 : 0);
                var15.field2350.method3490(arg3);
                field695.method2097(var15);
            }
        }
        if (arg2 == 11) {
            class79 var16 = field693[arg3];
            if (var16 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var17 = class180.method625(class177.field2253, field695.field1308);
                var17.field2350.method3492(arg3);
                var17.field2350.method3439(class45.field391[82] ? 1 : 0);
                field695.method2097(var17);
            }
        }
        if (arg2 == 34) {
            class180 var18 = class180.method625(class177.field2318, field695.field1308);
            var18.field2350.method3491(arg3);
            var18.field2350.method3501(arg1);
            var18.field2350.method3492(arg0);
            field695.method2097(var18);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 39) {
            class180 var19 = class180.method625(class177.field2283, field695.field1308);
            var19.field2350.method3492(arg3);
            var19.field2350.method3501(arg1);
            var19.field2350.method3490(arg0);
            field695.method2097(var19);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 23) {
            if (field786) {
                Statics.field28.method2907();
            } else {
                Statics.field28.method2915(Statics.field2219, arg0, arg1, true);
            }
        }
        if (arg2 == 10) {
            class79 var20 = field693[arg3];
            if (var20 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var21 = class180.method625(class177.field2221, field695.field1308);
                var21.field2350.method3491(arg3);
                var21.field2350.method3439(class45.field391[82] ? 1 : 0);
                field695.method2097(var21);
            }
        }
        if (arg2 == 30 && field794 == null) {
            method3206(arg1, arg0);
            field794 = class239.method130(arg1, arg0);
            method508(field794);
        }
        if (arg2 == 9) {
            class79 var22 = field693[arg3];
            if (var22 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var23 = class180.method625(class177.field2309, field695.field1308);
                var23.field2350.method3601(class45.field391[82] ? 1 : 0);
                var23.field2350.method3490(arg3);
                field695.method2097(var23);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class239 var24 = class239.method130(arg1, arg0);
            if (var24 != null) {
                method5114(arg3, arg1, arg0, var24.field2816, arg5);
            }
        }
        if (arg2 == 35) {
            class180 var25 = class180.method625(class177.field2292, field695.field1308);
            var25.field2350.method3499(arg1);
            var25.field2350.method3492(arg0);
            var25.field2350.method3492(arg3);
            field695.method2097(var25);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 1002) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            class180 var26 = class180.method625(class177.field2256, field695.field1308);
            var26.field2350.method3491(arg3);
            field695.method2097(var26);
        }
        if (arg2 == 19) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var27 = class180.method625(class177.field2294, field695.field1308);
            var27.field2350.method3492(arg3);
            var27.field2350.method3491(Statics.field84 + arg0);
            var27.field2350.method3440(Statics.field30 + arg1);
            var27.field2350.method3439(class45.field391[82] ? 1 : 0);
            field695.method2097(var27);
        }
        if (arg2 == 40) {
            class180 var28 = class180.method625(class177.field2246, field695.field1308);
            var28.field2350.method3501(arg1);
            var28.field2350.method3490(arg0);
            var28.field2350.method3491(arg3);
            field695.method2097(var28);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 12) {
            class79 var29 = field693[arg3];
            if (var29 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var30 = class180.method625(class177.field2252, field695.field1308);
                var30.field2350.method3440(arg3);
                var30.field2350.method3481(class45.field391[82] ? 1 : 0);
                field695.method2097(var30);
            }
        }
        if (arg2 == 47) {
            class67 var31 = field766[arg3];
            if (var31 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var32 = class180.method625(class177.field2238, field695.field1308);
                var32.field2350.method3492(arg3);
                var32.field2350.method3601(class45.field391[82] ? 1 : 0);
                field695.method2097(var32);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field131.method5872(arg2, arg3, new class235(arg0), new class235(arg1));
        }
        if (arg2 == 1003) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            class79 var33 = field693[arg3];
            if (var33 != null) {
                class278 var34 = var33.field1103;
                if (var34.field3574 != null) {
                    var34 = var34.method4959();
                }
                if (var34 != null) {
                    class180 var35 = class180.method625(class177.field2250, field695.field1308);
                    var35.field2350.method3491(var34.field3569);
                    field695.method2097(var35);
                }
            }
        }
        if (arg2 == 37) {
            class180 var36 = class180.method625(class177.field2278, field695.field1308);
            var36.field2350.method3442(arg1);
            var36.field2350.method3440(arg0);
            var36.field2350.method3440(arg3);
            field695.method2097(var36);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 42) {
            class180 var37 = class180.method625(class177.field2270, field695.field1308);
            var37.field2350.method3442(arg1);
            var37.field2350.method3491(arg0);
            var37.field2350.method3440(arg3);
            field695.method2097(var37);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 18) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var38 = class180.method625(class177.field2225, field695.field1308);
            var38.field2350.method3492(Statics.field30 + arg1);
            var38.field2350.method3490(arg3);
            var38.field2350.method3490(Statics.field84 + arg0);
            var38.field2350.method3439(class45.field391[82] ? 1 : 0);
            field695.method2097(var38);
        }
        if (arg2 == 33) {
            class180 var39 = class180.method625(class177.field2307, field695.field1308);
            var39.field2350.method3490(arg3);
            var39.field2350.method3500(arg1);
            var39.field2350.method3440(arg0);
            field695.method2097(var39);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 3) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var40 = class180.method625(class177.field2230, field695.field1308);
            var40.field2350.method3440(Statics.field30 + arg1);
            var40.field2350.method3676(class45.field391[82] ? 1 : 0);
            var40.field2350.method3491(arg3);
            var40.field2350.method3492(Statics.field84 + arg0);
            field695.method2097(var40);
        }
        if (arg2 == 13) {
            class79 var41 = field693[arg3];
            if (var41 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var42 = class180.method625(class177.field2251, field695.field1308);
                var42.field2350.method3439(class45.field391[82] ? 1 : 0);
                var42.field2350.method3491(arg3);
                field695.method2097(var42);
            }
        }
        if (arg2 == 2) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var43 = class180.method625(class177.field2301, field695.field1308);
            var43.field2350.method3439(class45.field391[82] ? 1 : 0);
            var43.field2350.method3440(Statics.field84 + arg0);
            var43.field2350.method3491(arg3);
            var43.field2350.method3501(Statics.field2066);
            var43.field2350.method3440(field854);
            var43.field2350.method3490(Statics.field30 + arg1);
            field695.method2097(var43);
        }
        if (arg2 == 24) {
            class239 var44 = class239.method2052(arg1);
            boolean var45 = true;
            if (var44.field2694 > 0) {
                var45 = method20(var44);
            }
            if (var45) {
                class180 var46 = class180.method625(class177.field2289, field695.field1308);
                var46.field2350.method3442(arg1);
                field695.method2097(var46);
            }
        }
        if (arg2 == 4) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var47 = class180.method625(class177.field2299, field695.field1308);
            var47.field2350.method3481(class45.field391[82] ? 1 : 0);
            var47.field2350.method3440(arg3);
            var47.field2350.method3440(Statics.field30 + arg1);
            var47.field2350.method3440(Statics.field84 + arg0);
            field695.method2097(var47);
        }
        if (arg2 == 1) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var48 = class180.method625(class177.field2264, field695.field1308);
            var48.field2350.method3492(Statics.field30 + arg1);
            var48.field2350.method3490(Statics.field607);
            var48.field2350.method3481(class45.field391[82] ? 1 : 0);
            var48.field2350.method3499(Statics.field3199);
            var48.field2350.method3492(Statics.field84 + arg0);
            var48.field2350.method3440(arg3);
            var48.field2350.method3490(Statics.field1439);
            field695.method2097(var48);
        }
        if (arg2 == 44) {
            class67 var49 = field766[arg3];
            if (var49 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var50 = class180.method625(class177.field2267, field695.field1308);
                var50.field2350.method3440(arg3);
                var50.field2350.method3601(class45.field391[82] ? 1 : 0);
                field695.method2097(var50);
            }
        }
        if (arg2 == 31) {
            class180 var51 = class180.method625(class177.field2293, field695.field1308);
            var51.field2350.method3500(arg1);
            var51.field2350.method3501(Statics.field3199);
            var51.field2350.method3492(Statics.field607);
            var51.field2350.method3490(Statics.field1439);
            var51.field2350.method3490(arg0);
            var51.field2350.method3492(arg3);
            field695.method2097(var51);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 46) {
            class67 var52 = field766[arg3];
            if (var52 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var53 = class180.method625(class177.field2320, field695.field1308);
                var53.field2350.method3491(arg3);
                var53.field2350.method3439(class45.field391[82] ? 1 : 0);
                field695.method2097(var53);
            }
        }
        if (arg2 == 16) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var54 = class180.method625(class177.field2271, field695.field1308);
            var54.field2350.method3500(Statics.field3199);
            var54.field2350.method3492(Statics.field1439);
            var54.field2350.method3481(class45.field391[82] ? 1 : 0);
            var54.field2350.method3490(Statics.field607);
            var54.field2350.method3492(arg3);
            var54.field2350.method3492(Statics.field84 + arg0);
            var54.field2350.method3490(Statics.field30 + arg1);
            field695.method2097(var54);
        }
        if (arg2 == 22) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var55 = class180.method625(class177.field2308, field695.field1308);
            var55.field2350.method3439(class45.field391[82] ? 1 : 0);
            var55.field2350.method3492(arg3);
            var55.field2350.method3491(Statics.field30 + arg1);
            var55.field2350.method3440(Statics.field84 + arg0);
            field695.method2097(var55);
        }
        if (arg2 == 26) {
            method3755();
        }
        if (arg2 == 1001) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var56 = class180.method625(class177.field2288, field695.field1308);
            var56.field2350.method3440(arg3);
            var56.field2350.method3481(class45.field391[82] ? 1 : 0);
            var56.field2350.method3491(Statics.field84 + arg0);
            var56.field2350.method3492(Statics.field30 + arg1);
            field695.method2097(var56);
        }
        if (arg2 == 1004) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            class180 var57 = class180.method625(class177.field2244, field695.field1308);
            var57.field2350.method3490(arg3);
            field695.method2097(var57);
        }
        if (arg2 == 32) {
            class180 var58 = class180.method625(class177.field2222, field695.field1308);
            var58.field2350.method3500(Statics.field2066);
            var58.field2350.method3442(arg1);
            var58.field2350.method3440(arg0);
            var58.field2350.method3490(arg3);
            var58.field2350.method3490(field854);
            field695.method2097(var58);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 43) {
            class180 var59 = class180.method625(class177.field2265, field695.field1308);
            var59.field2350.method3440(arg3);
            var59.field2350.method3500(arg1);
            var59.field2350.method3440(arg0);
            field695.method2097(var59);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 58) {
            class239 var60 = class239.method130(arg1, arg0);
            if (var60 != null) {
                class180 var61 = class180.method625(class177.field2302, field695.field1308);
                var61.field2350.method3490(field854);
                var61.field2350.method3501(arg1);
                var61.field2350.method3490(field674);
                var61.field2350.method3492(arg0);
                var61.field2350.method3442(Statics.field2066);
                var61.field2350.method3492(var60.field2816);
                field695.method2097(var61);
            }
        }
        if (arg2 == 8) {
            class79 var62 = field693[arg3];
            if (var62 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var63 = class180.method625(class177.field2306, field695.field1308);
                var63.field2350.method3492(arg3);
                var63.field2350.method3601(class45.field391[82] ? 1 : 0);
                var63.field2350.method3499(Statics.field2066);
                var63.field2350.method3491(field854);
                field695.method2097(var63);
            }
        }
        if (arg2 == 25) {
            class239 var64 = class239.method130(arg1, arg0);
            if (var64 != null) {
                method711();
                method951(arg1, arg0, class240.method2534(method62(var64)), var64.field2816);
                field847 = 0;
                field808 = method594(var64);
                if (field808 == null) {
                    field808 = class246.field2885;
                }
                if (var64.field2689) {
                    field809 = var64.field2769 + class81.method1019(16777215);
                } else {
                    field809 = class81.method1019(65280) + var64.field2752 + class81.method1019(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var65 = class180.method625(class177.field2273, field695.field1308);
            var65.field2350.method3500(Statics.field2066);
            var65.field2350.method3440(field854);
            var65.field2350.method3491(Statics.field30 + arg1);
            var65.field2350.method3491(Statics.field84 + arg0);
            var65.field2350.method3481(class45.field391[82] ? 1 : 0);
            var65.field2350.method3490(arg3);
            field695.method2097(var65);
        }
        if (arg2 == 38) {
            method711();
            class239 var66 = class239.method2052(arg1);
            field847 = 1;
            Statics.field607 = arg0;
            Statics.field3199 = arg1;
            Statics.field1439 = arg3;
            method508(var66);
            field804 = class81.method1019(16748608) + class276.method1049(arg3).field3514 + class81.method1019(16777215);
            if (field804 == null) {
                field804 = class246.field2885;
            }
            return;
        }
        if (arg2 == 21) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var67 = class180.method625(class177.field2249, field695.field1308);
            var67.field2350.method3491(Statics.field30 + arg1);
            var67.field2350.method3490(arg3);
            var67.field2350.method3440(Statics.field84 + arg0);
            var67.field2350.method3676(class45.field391[82] ? 1 : 0);
            field695.method2097(var67);
        }
        if (arg2 == 49) {
            class67 var68 = field766[arg3];
            if (var68 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var69 = class180.method625(class177.field2259, field695.field1308);
                var69.field2350.method3491(arg3);
                var69.field2350.method3676(class45.field391[82] ? 1 : 0);
                field695.method2097(var69);
            }
        }
        if (arg2 == 14) {
            class67 var70 = field766[arg3];
            if (var70 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var71 = class180.method625(class177.field2282, field695.field1308);
                var71.field2350.method3492(Statics.field607);
                var71.field2350.method3676(class45.field391[82] ? 1 : 0);
                var71.field2350.method3500(Statics.field3199);
                var71.field2350.method3440(arg3);
                var71.field2350.method3440(Statics.field1439);
                field695.method2097(var71);
            }
        }
        if (arg2 == 7) {
            class79 var72 = field693[arg3];
            if (var72 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var73 = class180.method625(class177.field2243, field695.field1308);
                var73.field2350.method3492(Statics.field1439);
                var73.field2350.method3440(Statics.field607);
                var73.field2350.method3492(arg3);
                var73.field2350.method3601(class45.field391[82] ? 1 : 0);
                var73.field2350.method3442(Statics.field3199);
                field695.method2097(var73);
            }
        }
        if (arg2 == 28) {
            class180 var74 = class180.method625(class177.field2289, field695.field1308);
            var74.field2350.method3442(arg1);
            field695.method2097(var74);
            class239 var75 = class239.method2052(arg1);
            if (var75.field2808 != null && var75.field2808[0][0] == 5) {
                int var76 = var75.field2808[0][1];
                class234.field2648[var76] = 1 - class234.field2648[var76];
                method71(var76);
            }
        }
        if (arg2 == 15) {
            class67 var77 = field766[arg3];
            if (var77 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var78 = class180.method625(class177.field2275, field695.field1308);
                var78.field2350.method3501(Statics.field2066);
                var78.field2350.method3676(class45.field391[82] ? 1 : 0);
                var78.field2350.method3491(field854);
                var78.field2350.method3440(arg3);
                field695.method2097(var78);
            }
        }
        if (arg2 == 41) {
            class180 var79 = class180.method625(class177.field2285, field695.field1308);
            var79.field2350.method3499(arg1);
            var79.field2350.method3491(arg0);
            var79.field2350.method3440(arg3);
            field695.method2097(var79);
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 1005) {
            class239 var80 = class239.method2052(arg1);
            if (var80 == null || var80.field2739[arg0] < 100000) {
                class180 var81 = class180.method625(class177.field2244, field695.field1308);
                var81.field2350.method3490(arg3);
                field695.method2097(var81);
            } else {
                class91.method696(27, "", var80.field2739[arg0] + " x " + class276.method1049(arg3).field3514);
            }
            field730 = 0;
            Statics.field2 = class239.method2052(arg1);
            field757 = arg0;
        }
        if (arg2 == 6) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var82 = class180.method625(class177.field2223, field695.field1308);
            var82.field2350.method3481(class45.field391[82] ? 1 : 0);
            var82.field2350.method3491(Statics.field30 + arg1);
            var82.field2350.method3491(Statics.field84 + arg0);
            var82.field2350.method3490(arg3);
            field695.method2097(var82);
        }
        if (arg2 == 5) {
            field751 = arg6;
            field752 = arg7;
            field673 = 2;
            field753 = 0;
            field880 = arg0;
            field881 = arg1;
            class180 var83 = class180.method625(class177.field2313, field695.field1308);
            var83.field2350.method3492(Statics.field84 + arg0);
            var83.field2350.method3491(arg3);
            var83.field2350.method3492(Statics.field30 + arg1);
            var83.field2350.method3481(class45.field391[82] ? 1 : 0);
            field695.method2097(var83);
        }
        if (arg2 == 48) {
            class67 var84 = field766[arg3];
            if (var84 != null) {
                field751 = arg6;
                field752 = arg7;
                field673 = 2;
                field753 = 0;
                field880 = arg0;
                field881 = arg1;
                class180 var85 = class180.method625(class177.field2290, field695.field1308);
                var85.field2350.method3481(class45.field391[82] ? 1 : 0);
                var85.field2350.method3491(arg3);
                field695.method2097(var85);
            }
        }
        if (arg2 == 29) {
            class180 var86 = class180.method625(class177.field2289, field695.field1308);
            var86.field2350.method3442(arg1);
            field695.method2097(var86);
            class239 var87 = class239.method2052(arg1);
            if (var87.field2808 != null && var87.field2808[0][0] == 5) {
                int var88 = var87.field2808[0][1];
                if (class234.field2648[var88] != var87.field2810[0]) {
                    class234.field2648[var88] = var87.field2810[0];
                    method71(var88);
                }
            }
        }
        if (field847 != 0) {
            field847 = 0;
            method508(class239.method2052(Statics.field3199));
        }
        if (field805) {
            method711();
        }
        if (Statics.field2 != null && field730 == 0) {
            method508(Statics.field2);
        }
    }

    @ObfuscatedName("jl.ii(ILjava/lang/String;I)V")
    public static void method4641(int arg0, String arg1) {
        int var2 = class89.field1247;
        int[] var3 = class89.field1244;
        boolean var4 = false;
        class298 var5 = new class298(arg1, Statics.field415);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field766[var3[var6]];
            if (var7 != null && Statics.field187 != var7 && var7.field619 != null && var7.field619.equals(var5)) {
                if (arg0 == 1) {
                    class180 var8 = class180.method625(class177.field2267, field695.field1308);
                    var8.field2350.method3440(var3[var6]);
                    var8.field2350.method3601(0);
                    field695.method2097(var8);
                } else if (arg0 == 4) {
                    class180 var9 = class180.method625(class177.field2238, field695.field1308);
                    var9.field2350.method3492(var3[var6]);
                    var9.field2350.method3601(0);
                    field695.method2097(var9);
                } else if (arg0 == 6) {
                    class180 var10 = class180.method625(class177.field2259, field695.field1308);
                    var10.field2350.method3491(var3[var6]);
                    var10.field2350.method3676(0);
                    field695.method2097(var10);
                } else if (arg0 == 7) {
                    class180 var11 = class180.method625(class177.field2295, field695.field1308);
                    var11.field2350.method3676(0);
                    var11.field2350.method3490(var3[var6]);
                    field695.method2097(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class91.method696(4, "", class246.field3030 + arg1);
        }
    }

    @ObfuscatedName("be.iv(IIIII)V")
    public static void method951(int arg0, int arg1, int arg2, int arg3) {
        class239 var4 = class239.method130(arg0, arg1);
        if (var4 != null && var4.field2787 != null) {
            class63 var5 = new class63();
            var5.field575 = var4;
            var5.field580 = var4.field2787;
            class76.method3778(var5);
        }
        field674 = arg3;
        field805 = true;
        Statics.field2066 = arg0;
        field854 = arg1;
        Statics.field1116 = arg2;
        method508(var4);
    }

    @ObfuscatedName("ad.it(I)V")
    public static void method711() {
        if (!field805) {
            return;
        }
        class239 var0 = class239.method130(Statics.field2066, field854);
        if (var0 != null && var0.field2817 != null) {
            class63 var1 = new class63();
            var1.field575 = var0;
            var1.field580 = var0.field2817;
            class76.method3778(var1);
        }
        field805 = false;
        method508(var0);
    }

    @ObfuscatedName("fj.ir(IIB)V")
    public static void method3206(int arg0, int arg1) {
        class180 var2 = class180.method625(class177.field2258, field695.field1308);
        var2.field2350.method3501(arg0);
        var2.field2350.method3491(arg1);
        field695.method2097(var2);
    }

    @ObfuscatedName("kn.ih(IIIILjava/lang/String;I)V")
    public static void method5114(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class239 var5 = class239.method130(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2796 != null) {
            class63 var6 = new class63();
            var6.field575 = var5;
            var6.field581 = arg0;
            var6.field578 = arg4;
            var6.field580 = var5.field2796;
            class76.method3778(var6);
        }
        boolean var7 = true;
        if (var5.field2694 > 0) {
            var7 = method20(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method62(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class180 var11 = class180.method625(class177.field2263, field695.field1308);
            var11.field2350.method3442(arg1);
            var11.field2350.method3440(arg2);
            var11.field2350.method3440(arg3);
            field695.method2097(var11);
        }
        if (arg0 == 2) {
            class180 var12 = class180.method625(class177.field2312, field695.field1308);
            var12.field2350.method3442(arg1);
            var12.field2350.method3440(arg2);
            var12.field2350.method3440(arg3);
            field695.method2097(var12);
        }
        if (arg0 == 3) {
            class180 var13 = class180.method625(class177.field2268, field695.field1308);
            var13.field2350.method3442(arg1);
            var13.field2350.method3440(arg2);
            var13.field2350.method3440(arg3);
            field695.method2097(var13);
        }
        if (arg0 == 4) {
            class180 var14 = class180.method625(class177.field2239, field695.field1308);
            var14.field2350.method3442(arg1);
            var14.field2350.method3440(arg2);
            var14.field2350.method3440(arg3);
            field695.method2097(var14);
        }
        if (arg0 == 5) {
            class180 var15 = class180.method625(class177.field2260, field695.field1308);
            var15.field2350.method3442(arg1);
            var15.field2350.method3440(arg2);
            var15.field2350.method3440(arg3);
            field695.method2097(var15);
        }
        if (arg0 == 6) {
            class180 var16 = class180.method625(class177.field2286, field695.field1308);
            var16.field2350.method3442(arg1);
            var16.field2350.method3440(arg2);
            var16.field2350.method3440(arg3);
            field695.method2097(var16);
        }
        if (arg0 == 7) {
            class180 var17 = class180.method625(class177.field2305, field695.field1308);
            var17.field2350.method3442(arg1);
            var17.field2350.method3440(arg2);
            var17.field2350.method3440(arg3);
            field695.method2097(var17);
        }
        if (arg0 == 8) {
            class180 var18 = class180.method625(class177.field2234, field695.field1308);
            var18.field2350.method3442(arg1);
            var18.field2350.method3440(arg2);
            var18.field2350.method3440(arg3);
            field695.method2097(var18);
        }
        if (arg0 == 9) {
            class180 var19 = class180.method625(class177.field2304, field695.field1308);
            var19.field2350.method3442(arg1);
            var19.field2350.method3440(arg2);
            var19.field2350.method3440(arg3);
            field695.method2097(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class180 var20 = class180.method625(class177.field2317, field695.field1308);
        var20.field2350.method3442(arg1);
        var20.field2350.method3440(arg2);
        var20.field2350.method3440(arg3);
        field695.method2097(var20);
    }

    @ObfuscatedName("cg.ij(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1926(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1033(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("bv.is(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1033(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field786 || field787 >= 500) {
            return;
        }
        field792[field787] = arg0;
        field793[field787] = arg1;
        field856[field787] = arg2;
        field717[field787] = arg3;
        field742[field787] = arg4;
        field914[field787] = arg5;
        field727[field787] = arg6;
        field787++;
    }

    @ObfuscatedName("fg.ix(II)Ljava/lang/String;")
    public static String method3188(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field793[arg0].length() > 0) {
            return field792[arg0] + class246.field3041 + field793[arg0];
        } else {
            return field792[arg0];
        }
    }

    @ObfuscatedName("c.ib(IIIII)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3) {
        if (field847 == 0 && !field805) {
            method1926(class246.field3036, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class128.field1738;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class67 var15 = field766[field777];
                    method4396(var15, field777, var11, var13);
                }
                return;
            }
            long var16 = class128.method1054(var8);
            if (var6 != var16) {
                label277: {
                    var6 = var16;
                    long var18 = class128.field1741[var8];
                    int var20 = (int) (var18 >>> 0 & 0x7FL);
                    int var22 = var20;
                    int var23 = class128.method68(var8);
                    int var24 = Statics.method2511(var8);
                    int var25 = class128.method276(var8);
                    if (var24 == 2 && Statics.field28.method2908(Statics.field2219, var20, var23, var16) >= 0) {
                        class275 var26 = class275.method117(var25);
                        if (var26.field3494 != null) {
                            var26 = var26.method4852();
                        }
                        if (var26 == null) {
                            break label277;
                        }
                        if (field847 == 1) {
                            method1926(class246.field2951, field804 + " " + class81.field1126 + " " + class81.method1019(65535) + var26.field3463, 1, var25, var20, var23);
                        } else if (!field805) {
                            String[] var27 = var26.field3480;
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
                                        method1926(var27[var28], class81.method1019(65535) + var26.field3463, var29, var25, var22, var23);
                                    }
                                }
                            }
                            method1926(class246.field3032, class81.method1019(65535) + var26.field3463, 1002, var26.field3477, var22, var23);
                        } else if ((Statics.field1116 & 0x4) == 4) {
                            method1926(field808, field809 + " " + class81.field1126 + " " + class81.method1019(65535) + var26.field3463, 2, var25, var20, var23);
                        }
                    }
                    if (var24 == 1) {
                        class79 var30 = field693[var25];
                        if (var30 == null) {
                            break label277;
                        }
                        if (var30.field1103.field3571 == 1 && (var30.field948 & 0x7F) == 64 && (var30.field949 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field691; var31++) {
                                class79 var32 = field693[field692[var31]];
                                if (var32 != null && var30 != var32 && var32.field1103.field3571 == 1 && var30.field948 == var32.field948 && var30.field949 == var32.field949) {
                                    method523(var32.field1103, field692[var31], var22, var23);
                                }
                            }
                            int var33 = class89.field1247;
                            int[] var34 = class89.field1244;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class67 var36 = field766[var34[var35]];
                                if (var36 != null && var30.field948 == var36.field948 && var30.field949 == var36.field949) {
                                    method4396(var36, var34[var35], var22, var23);
                                }
                            }
                        }
                        method523(var30.field1103, var25, var22, var23);
                    }
                    if (var24 == 0) {
                        class67 var37 = field766[var25];
                        if (var37 == null) {
                            break label277;
                        }
                        if ((var37.field948 & 0x7F) == 64 && (var37.field949 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field691; var38++) {
                                class79 var39 = field693[field692[var38]];
                                if (var39 != null && var39.field1103.field3571 == 1 && var37.field948 == var39.field948 && var37.field949 == var39.field949) {
                                    method523(var39.field1103, field692[var38], var22, var23);
                                }
                            }
                            int var40 = class89.field1247;
                            int[] var41 = class89.field1244;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class67 var43 = field766[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field948 == var43.field948 && var37.field949 == var43.field949) {
                                    method4396(var43, var41[var42], var22, var23);
                                }
                            }
                        }
                        if (field777 == var25) {
                            var4 = var16;
                        } else {
                            method4396(var37, var25, var22, var23);
                        }
                    }
                    if (var24 == 3) {
                        class213 var44 = field778[Statics.field2219][var22][var23];
                        if (var44 != null) {
                            for (class87 var45 = (class87) var44.method3972(); var45 != null; var45 = (class87) var44.method3989()) {
                                class276 var46 = class276.method1049(var45.field1222);
                                if (field847 == 1) {
                                    method1926(class246.field2951, field804 + " " + class81.field1126 + " " + class81.method1019(16748608) + var46.field3514, 16, var45.field1222, var22, var23);
                                } else if (!field805) {
                                    String[] var47 = var46.field3529;
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
                                            method1926(var47[var48], class81.method1019(16748608) + var46.field3514, var49, var45.field1222, var22, var23);
                                        } else if (var48 == 2) {
                                            method1926(class246.field2922, class81.method1019(16748608) + var46.field3514, 20, var45.field1222, var22, var23);
                                        }
                                    }
                                    method1926(class246.field3032, class81.method1019(16748608) + var46.field3514, 1004, var45.field1222, var22, var23);
                                } else if ((Statics.field1116 & 0x1) == 1) {
                                    method1926(field808, field809 + " " + class81.field1126 + " " + class81.method1019(16748608) + var46.field3514, 17, var45.field1222, var22, var23);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("an.iw(Ljg;IIIS)V")
    public static final void method523(class278 arg0, int arg1, int arg2, int arg3) {
        if (field787 >= 400) {
            return;
        }
        if (arg0.field3574 != null) {
            arg0 = arg0.method4959();
        }
        if (arg0 == null || !arg0.field3584 || arg0.field3600 && field820 != arg1) {
            return;
        }
        String var4 = arg0.field3573;
        if (arg0.field3587 != 0) {
            int var6 = arg0.field3587;
            int var7 = Statics.field187.field616;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class81.method1019(16711680);
            } else if (var8 < -6) {
                var9 = class81.method1019(16723968);
            } else if (var8 < -3) {
                var9 = class81.method1019(16740352);
            } else if (var8 < 0) {
                var9 = class81.method1019(16756736);
            } else if (var8 > 9) {
                var9 = class81.method1019(65280);
            } else if (var8 > 6) {
                var9 = class81.method1019(4259584);
            } else if (var8 > 3) {
                var9 = class81.method1019(8453888);
            } else if (var8 > 0) {
                var9 = class81.method1019(12648192);
            } else {
                var9 = class81.method1019(16776960);
            }
            var4 = var4 + var9 + " " + class81.field1122 + class246.field3037 + arg0.field3587 + class81.field1123;
        }
        if (arg0.field3600 && field795) {
            method1926(class246.field3032, class81.method1019(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field847 == 1) {
            method1926(class246.field2951, field804 + " " + class81.field1126 + " " + class81.method1019(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field805) {
            int var10 = arg0.field3600 && field795 ? 2000 : 0;
            String[] var11 = arg0.field3585;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class246.field3062)) {
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
                        method1926(var11[var12], class81.method1019(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class246.field3062)) {
                        short var15 = 0;
                        if (field677 != class84.field1141) {
                            if (field677 == class84.field1144 || field677 == class84.field1145 && arg0.field3587 > Statics.field187.field616) {
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
                            method1926(var11[var14], class81.method1019(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3600 || !field795) {
                method1926(class246.field3032, class81.method1019(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1116 & 0x2) == 2) {
            method1926(field808, field809 + " " + class81.field1126 + " " + class81.method1019(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("iu.ig(Lbw;IIII)V")
    public static final void method4396(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field187 == arg0 || field787 >= 400) {
            return;
        }
        String var9;
        if (arg0.field617 == 0) {
            String var4 = arg0.field611[0] + arg0.field619 + arg0.field611[1];
            int var5 = arg0.field616;
            int var6 = Statics.field187.field616;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class81.method1019(16711680);
            } else if (var7 < -6) {
                var8 = class81.method1019(16723968);
            } else if (var7 < -3) {
                var8 = class81.method1019(16740352);
            } else if (var7 < 0) {
                var8 = class81.method1019(16756736);
            } else if (var7 > 9) {
                var8 = class81.method1019(65280);
            } else if (var7 > 6) {
                var8 = class81.method1019(4259584);
            } else if (var7 > 3) {
                var8 = class81.method1019(8453888);
            } else if (var7 > 0) {
                var8 = class81.method1019(12648192);
            } else {
                var8 = class81.method1019(16776960);
            }
            var9 = var4 + var8 + " " + class81.field1122 + class246.field3037 + arg0.field616 + class81.field1123 + arg0.field611[2];
        } else {
            var9 = arg0.field611[0] + arg0.field619 + arg0.field611[1] + " " + class81.field1122 + class246.field3038 + arg0.field617 + class81.field1123 + arg0.field611[2];
        }
        if (field847 == 1) {
            method1926(class246.field2951, field804 + " " + class81.field1126 + " " + class81.method1019(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field805) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field669[var10] != null) {
                    short var11 = 0;
                    if (field669[var10].equalsIgnoreCase(class246.field3062)) {
                        if (field666 == class84.field1141) {
                            continue;
                        }
                        if (field666 == class84.field1144 || field666 == class84.field1145 && arg0.field616 > Statics.field187.field616) {
                            var11 = 2000;
                        }
                        if (Statics.field187.field615 != 0 && arg0.field615 != 0) {
                            if (Statics.field187.field615 == arg0.field615) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field775[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field773[var10] + var11;
                    method1926(field669[var10], class81.method1019(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1116 & 0x8) == 8) {
            method1926(field808, field809 + " " + class81.field1126 + " " + class81.method1019(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field787; var14++) {
            if (field856[var14] == 23) {
                field793[var14] = class81.method1019(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cb.iz(IIIIIIIII)V")
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class239.method1101(arg0)) {
            Statics.field70 = null;
            method1070(Statics.field2681[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field70 != null) {
                method1070(Statics.field70, -1412584499, arg1, arg2, arg3, arg4, Statics.field287, Statics.field500, arg7);
                Statics.field70 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field796[var8] = true;
            }
        } else {
            field796[arg7] = true;
        }
    }

    @ObfuscatedName("bn.id([Lia;IIIIIIIIB)V")
    public static final void method1070(class239[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class324.method5543(arg2, arg3, arg4, arg5);
        class130.method2789();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class239 var10 = arg0[var9];
            if (var10 != null && (var10.field2709 == arg1 || arg1 == -1412584499 && field823 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field858[field853] = var10.field2749 + arg6;
                    field829[field853] = var10.field2822 + arg7;
                    field687[field853] = var10.field2705;
                    field861[field853] = var10.field2706;
                    var11 = ++field853 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2704 = var11;
                var10.field2828 = field660;
                if (!var10.field2689 || !method987(var10)) {
                    if (var10.field2694 > 0) {
                        method5231(var10);
                    }
                    int var12 = var10.field2749 + arg6;
                    int var13 = var10.field2822 + arg7;
                    int var14 = var10.field2807;
                    if (field823 == var10) {
                        if (arg1 != -1412584499 && !var10.field2785) {
                            Statics.field70 = arg0;
                            Statics.field287 = arg6;
                            Statics.field500 = arg7;
                            continue;
                        }
                        if (field834 && field905) {
                            int var15 = class54.field488;
                            int var16 = class54.field489;
                            int var17 = var15 - field825;
                            int var18 = var16 - field803;
                            if (var17 < field758) {
                                var17 = field758;
                            }
                            if (var10.field2705 + var17 > field758 + field824.field2705) {
                                var17 = field758 + field824.field2705 - var10.field2705;
                            }
                            if (var18 < field830) {
                                var18 = field830;
                            }
                            if (var10.field2706 + var18 > field830 + field824.field2706) {
                                var18 = field830 + field824.field2706 - var10.field2706;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2785) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2692 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2692 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2705 + var12;
                        int var26 = var10.field2706 + var13;
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
                        int var29 = var10.field2705 + var12;
                        int var30 = var10.field2706 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2689 || var19 < var21 && var20 < var22) {
                        if (var10.field2694 != 0) {
                            if (var10.field2694 == 1336) {
                                if (field882) {
                                    var13 += 15;
                                    Statics.field1905.method5312("Fps:" + field455, var10.field2705 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field654) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1905.method5312("Mem:" + var32 + "k", var10.field2705 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2694 == 1337) {
                                field799 = var12;
                                field800 = var13;
                                Statics.method716(var12, var13, var10.field2705, var10.field2706);
                                field796[var10.field2704] = true;
                                class324.method5543(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2694 == 1338) {
                                method3060(var10, var12, var13, var11);
                                class324.method5543(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2694 == 1339) {
                                method2762(var10, var12, var13, var11);
                                class324.method5543(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2694 == 1400) {
                                Statics.field131.method5835(var12, var13, var10.field2705, var10.field2706, field660);
                            }
                            if (var10.field2694 == 1401) {
                                Statics.field131.method5838(var12, var13, var10.field2705, var10.field2706);
                            }
                        }
                        if (var10.field2692 == 0) {
                            if (!var10.field2689 && method987(var10) && Statics.field3586 != var10) {
                                continue;
                            }
                            if (!var10.field2689) {
                                if (var10.field2712 > var10.field2714 - var10.field2706) {
                                    var10.field2712 = var10.field2714 - var10.field2706;
                                }
                                if (var10.field2712 < 0) {
                                    var10.field2712 = 0;
                                }
                            }
                            method1070(arg0, var10.field2690, var19, var20, var21, var22, var12 - var10.field2711, var13 - var10.field2712, var11);
                            if (var10.field2686 != null) {
                                method1070(var10.field2686, var10.field2690, var19, var20, var21, var22, var12 - var10.field2711, var13 - var10.field2712, var11);
                            }
                            class62 var34 = (class62) field811.method3911((long) var10.field2690);
                            if (var34 != null) {
                                method1964(var34.field571, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class324.method5543(arg2, arg3, arg4, arg5);
                            class130.method2789();
                        }
                        if (field864 || field857[var11] || field705 > 1) {
                            if (var10.field2692 == 0 && !var10.field2689 && var10.field2714 > var10.field2706) {
                                method4836(var10.field2705 + var12, var13, var10.field2712, var10.field2706, var10.field2714);
                            }
                            if (var10.field2692 != 1) {
                                if (var10.field2692 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2758; var36++) {
                                        for (int var37 = 0; var37 < var10.field2716; var37++) {
                                            int var38 = (var10.field2757 + 32) * var37 + var12;
                                            int var39 = (var10.field2815 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2759[var35];
                                                var39 += var10.field2721[var35];
                                            }
                                            if (var10.field2814[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2814[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field421 == var10 && field784 == var35) {
                                                    class328 var43;
                                                    if (field847 == 1 && Statics.field607 == var35 && Statics.field3199 == var10.field2690) {
                                                        var43 = class276.method4398(var42, var10.field2739[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class276.method4398(var42, var10.field2739[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method508(var10);
                                                    } else if (Statics.field421 == var10 && field784 == var35) {
                                                        int var44 = class54.field488 - field686;
                                                        int var45 = class54.field489 - field810;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field763 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5731(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class239 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class324.field3861 && var46.field2712 > 0) {
                                                                int var47 = field711 * (class324.field3861 - var39 - var45) / 3;
                                                                if (var47 > field711 * 10) {
                                                                    var47 = field711 * 10;
                                                                }
                                                                if (var47 > var46.field2712) {
                                                                    var47 = var46.field2712;
                                                                }
                                                                var46.field2712 -= var47;
                                                                field810 += var47;
                                                                method508(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class324.field3865 && var46.field2712 < var46.field2714 - var46.field2706) {
                                                                int var48 = field711 * (var39 + var45 + 32 - class324.field3865) / 3;
                                                                if (var48 > field711 * 10) {
                                                                    var48 = field711 * 10;
                                                                }
                                                                if (var48 > var46.field2714 - var46.field2706 - var46.field2712) {
                                                                    var48 = var46.field2714 - var46.field2706 - var46.field2712;
                                                                }
                                                                var46.field2712 += var48;
                                                                field810 -= var48;
                                                                method508(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2 == var10 && field757 == var35) {
                                                        var43.method5731(var38, var39, 128);
                                                    } else {
                                                        var43.method5668(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2761 != null && var35 < 20) {
                                                class328 var49 = var10.method4331(var35);
                                                if (var49 != null) {
                                                    var49.method5668(var38, var39);
                                                } else if (class239.field2741) {
                                                    method508(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2692 == 3) {
                                    int var50;
                                    if (method4760(var10)) {
                                        var50 = var10.field2812;
                                        if (Statics.field3586 == var10 && var10.field2718 != 0) {
                                            var50 = var10.field2718;
                                        }
                                    } else {
                                        var50 = var10.field2715;
                                        if (Statics.field3586 == var10 && var10.field2820 != 0) {
                                            var50 = var10.field2820;
                                        }
                                    }
                                    if (var10.field2719) {
                                        switch(var10.field2720.field3875) {
                                            case 1:
                                                class324.method5620(var12, var13, var10.field2705, var10.field2706, var10.field2715, var10.field2812);
                                                break;
                                            case 2:
                                                class324.method5577(var12, var13, var10.field2705, var10.field2706, var10.field2715, var10.field2812, 255 - (var10.field2807 & 0xFF), 255 - (var10.field2788 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class324.method5551(var12, var13, var10.field2705, var10.field2706, var50);
                                                } else {
                                                    class324.method5550(var12, var13, var10.field2705, var10.field2706, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class324.method5555(var12, var13, var10.field2705, var10.field2706, var50);
                                    } else {
                                        class324.method5556(var12, var13, var10.field2705, var10.field2706, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2692 == 4) {
                                    class305 var51 = var10.method4356();
                                    if (var51 != null) {
                                        String var52 = var10.field2751;
                                        int var53;
                                        if (method4760(var10)) {
                                            var53 = var10.field2812;
                                            if (Statics.field3586 == var10 && var10.field2718 != 0) {
                                                var53 = var10.field2718;
                                            }
                                            if (var10.field2688.length() > 0) {
                                                var52 = var10.field2688;
                                            }
                                        } else {
                                            var53 = var10.field2715;
                                            if (Statics.field3586 == var10 && var10.field2820 != 0) {
                                                var53 = var10.field2820;
                                            }
                                        }
                                        if (var10.field2689 && var10.field2816 != -1) {
                                            class276 var54 = class276.method1049(var10.field2816);
                                            var52 = var54.field3514;
                                            if (var52 == null) {
                                                var52 = class246.field2885;
                                            }
                                            if ((var54.field3526 == 1 || var10.field2806 != 1) && var10.field2806 != -1) {
                                                var52 = class81.method1019(16748608) + var52 + class81.field1125 + " " + 'x' + method290(var10.field2806);
                                            }
                                        }
                                        if (field794 == var10) {
                                            var52 = class246.field3039;
                                            var53 = var10.field2715;
                                        }
                                        if (!var10.field2689) {
                                            var52 = method1068(var52, var10);
                                        }
                                        var51.method5358(var52, var12, var13, var10.field2705, var10.field2706, var53, var10.field2756 ? 0 : -1, var10.field2754, var10.field2765, var10.field2747);
                                    } else if (class239.field2741) {
                                        method508(var10);
                                    }
                                } else if (var10.field2692 == 5) {
                                    if (var10.field2689) {
                                        class328 var56;
                                        if (var10.field2816 == -1) {
                                            var56 = var10.method4337(false);
                                        } else {
                                            var56 = class276.method4398(var10.field2816, var10.field2806, var10.field2738, var10.field2730, var10.field2772, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3893;
                                            int var58 = var56.field3894;
                                            if (var10.field2728) {
                                                class324.method5544(var12, var13, var10.field2705 + var12, var10.field2706 + var13);
                                                int var59 = (var10.field2705 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2706 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2762 != 0) {
                                                            var56.method5656(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2762, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5668(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5731(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class324.method5543(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2705 * 4096 / var57;
                                                if (var10.field2762 != 0) {
                                                    var56.method5656(var10.field2705 / 2 + var12, var10.field2706 / 2 + var13, var10.field2762, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5676(var12, var13, var10.field2705, var10.field2706, 256 - (var14 & 0xFF));
                                                } else if (var10.field2705 == var57 && var10.field2706 == var58) {
                                                    var56.method5668(var12, var13);
                                                } else {
                                                    var56.method5670(var12, var13, var10.field2705, var10.field2706);
                                                }
                                            }
                                        } else if (class239.field2741) {
                                            method508(var10);
                                        }
                                    } else {
                                        class328 var55 = var10.method4337(method4760(var10));
                                        if (var55 != null) {
                                            var55.method5668(var12, var13);
                                        } else if (class239.field2741) {
                                            method508(var10);
                                        }
                                    }
                                } else if (var10.field2692 == 6) {
                                    boolean var64 = method4760(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2702;
                                    } else {
                                        var65 = var10.field2677;
                                    }
                                    class127 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2816 != -1) {
                                        class276 var68 = class276.method1049(var10.field2816);
                                        if (var68 != null) {
                                            class276 var69 = var68.method4897(var10.field2806);
                                            var66 = var69.method4896(1);
                                            if (var66 == null) {
                                                method508(var10);
                                            } else {
                                                var66.method2683();
                                                var67 = var66.field1863 / 2;
                                            }
                                        }
                                    } else if (var10.field2733 == 5) {
                                        if (var10.field2734 == 0) {
                                            var66 = field919.method4312((class280) null, -1, (class280) null, -1);
                                        } else {
                                            var66 = Statics.field187.method1112();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4340((class280) null, -1, var64, Statics.field187.field612);
                                        if (var66 == null && class239.field2741) {
                                            method508(var10);
                                        }
                                    } else {
                                        class280 var70 = class280.method3173(var65);
                                        var66 = var10.method4340(var70, var10.field2818, var64, Statics.field187.field612);
                                        if (var66 == null && class239.field2741) {
                                            method508(var10);
                                        }
                                    }
                                    class130.method2792(var10.field2705 / 2 + var12, var10.field2706 / 2 + var13);
                                    int var71 = var10.field2701 * class130.field1779[var10.field2813] >> 16;
                                    int var72 = var10.field2701 * class130.field1768[var10.field2813] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2689) {
                                            var66.method2683();
                                            if (var10.field2745) {
                                                var66.method2750(0, var10.field2742, var10.field2743, var10.field2813, var10.field2750, var10.field2740 + var67 + var71, var10.field2740 + var72, var10.field2701);
                                            } else {
                                                var66.method2694(0, var10.field2742, var10.field2743, var10.field2813, var10.field2750, var10.field2740 + var67 + var71, var10.field2740 + var72);
                                            }
                                        } else {
                                            var66.method2694(0, var10.field2742, 0, var10.field2813, 0, var71, var72);
                                        }
                                    }
                                    class130.method2841();
                                } else {
                                    if (var10.field2692 == 7) {
                                        class305 var73 = var10.method4356();
                                        if (var73 == null) {
                                            if (class239.field2741) {
                                                method508(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2758; var75++) {
                                            for (int var76 = 0; var76 < var10.field2716; var76++) {
                                                if (var10.field2814[var74] > 0) {
                                                    class276 var77 = class276.method1049(var10.field2814[var74] - 1);
                                                    String var78;
                                                    if (var77.field3526 != 1 && var10.field2739[var74] == 1) {
                                                        var78 = class81.method1019(16748608) + var77.field3514 + class81.field1125;
                                                    } else {
                                                        var78 = class81.method1019(16748608) + var77.field3514 + class81.field1125 + " " + 'x' + method290(var10.field2739[var74]);
                                                    }
                                                    int var79 = (var10.field2757 + 115) * var76 + var12;
                                                    int var80 = (var10.field2815 + 12) * var75 + var13;
                                                    if (var10.field2754 == 0) {
                                                        var73.method5319(var78, var79, var80, var10.field2715, var10.field2756 ? 0 : -1);
                                                    } else if (var10.field2754 == 1) {
                                                        var73.method5373(var78, var10.field2705 / 2 + var79, var80, var10.field2715, var10.field2756 ? 0 : -1);
                                                    } else {
                                                        var73.method5312(var78, var10.field2705 + var79 - 1, var80, var10.field2715, var10.field2756 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2692 == 8 && Statics.field1962 == var10 && field802 == field770) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class305 var83 = Statics.field1905;
                                        String var84 = var10.field2751;
                                        String var85 = method1068(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class81.field1124);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5314(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3780 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2705 + var12 - 5 - var81;
                                        int var90 = var10.field2706 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class324.method5551(var89, var90, var81, var82, 16777120);
                                        class324.method5555(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2751;
                                        int var92 = var83.field3780 + var90 + 2;
                                        String var93 = method1068(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class81.field1124);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5319(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3780 + 1;
                                        }
                                    }
                                    if (var10.field2692 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2731) {
                                            var96 = var12;
                                            var97 = var10.field2706 + var13;
                                            var98 = var10.field2705 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2705 + var12;
                                            var99 = var10.field2706 + var13;
                                        }
                                        if (var10.field2824 == 1) {
                                            class324.method5561(var96, var97, var98, var99, var10.field2715);
                                        } else {
                                            method257(var96, var97, var98, var99, var10.field2715, var10.field2824);
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

    @ObfuscatedName("w.in(IIIIIIS)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class324.field3866;
        int var18 = arg1 - class324.field3861;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class130.method2797(var19, var20, var21);
        class130.method2800(var23, var24, var25, var19, var20, var21, arg4);
        class130.method2797(var19, var21, var22);
        class130.method2800(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bn.io(Ljava/lang/String;Lia;B)Ljava/lang/String;")
    public static String method1068(String arg0, class239 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2785(arg1, var2 - 1);
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

    @ObfuscatedName("j.iq(II)Ljava/lang/String;")
    public static final String method290(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class81.field1119 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class81.method1019(65408) + var1.substring(0, var1.length() - 8) + class246.field3042 + " " + class81.field1122 + var1 + class81.field1123 + class81.field1125;
        } else if (var1.length() > 6) {
            return " " + class81.method1019(16777215) + var1.substring(0, var1.length() - 4) + class246.field3044 + " " + class81.field1122 + var1 + class81.field1123 + class81.field1125;
        } else {
            return " " + class81.method1019(16776960) + var1 + class81.field1125;
        }
    }

    @ObfuscatedName("client.ip(ZB)V")
    public final void method1191(boolean arg0) {
        int var2 = field821;
        int var3 = Statics.field75;
        int var4 = Statics.field348;
        if (class239.method1101(var2)) {
            method3072(Statics.field2681[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ja(Lia;I)V")
    public void method1192(class239 arg0) {
        class239 var2 = arg0.field2709 == -1 ? null : class239.method2052(arg0.field2709);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field75;
            var4 = Statics.field348;
        } else {
            var3 = var2.field2705;
            var4 = var2.field2706;
        }
        method698(arg0, var3, var4, false);
        method19(arg0, var3, var4);
    }

    @ObfuscatedName("bz.jn([Lia;Lia;ZI)V")
    public static void method1013(class239[] arg0, class239 arg1, boolean arg2) {
        int var3 = arg1.field2778 == 0 ? arg1.field2705 : arg1.field2778;
        int var4 = arg1.field2714 == 0 ? arg1.field2706 : arg1.field2714;
        method3072(arg0, arg1.field2690, var3, var4, arg2);
        if (arg1.field2686 != null) {
            method3072(arg1.field2686, arg1.field2690, var3, var4, arg2);
        }
        class62 var5 = (class62) field811.method3911((long) arg1.field2690);
        if (var5 != null) {
            int var6 = var5.field571;
            if (class239.method1101(var6)) {
                method3072(Statics.field2681[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2694 == 1337) {
        }
    }

    @ObfuscatedName("ei.jd([Lia;IIIZI)V")
    public static void method3072(class239[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class239 var6 = arg0[var5];
            if (var6 != null && var6.field2709 == arg1) {
                method698(var6, arg2, arg3, arg4);
                method19(var6, arg2, arg3);
                if (var6.field2711 > var6.field2778 - var6.field2705) {
                    var6.field2711 = var6.field2778 - var6.field2705;
                }
                if (var6.field2711 < 0) {
                    var6.field2711 = 0;
                }
                if (var6.field2712 > var6.field2714 - var6.field2706) {
                    var6.field2712 = var6.field2714 - var6.field2706;
                }
                if (var6.field2712 < 0) {
                    var6.field2712 = 0;
                }
                if (var6.field2692 == 0) {
                    method1013(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("az.jl(Lia;IIZI)V")
    public static void method698(class239 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2705;
        int var5 = arg0.field2706;
        if (arg0.field2697 == 0) {
            arg0.field2705 = arg0.field2716;
        } else if (arg0.field2697 == 1) {
            arg0.field2705 = arg1 - arg0.field2716;
        } else if (arg0.field2697 == 2) {
            arg0.field2705 = arg0.field2716 * arg1 >> 14;
        }
        if (arg0.field2698 == 0) {
            arg0.field2706 = arg0.field2758;
        } else if (arg0.field2698 == 1) {
            arg0.field2706 = arg2 - arg0.field2758;
        } else if (arg0.field2698 == 2) {
            arg0.field2706 = arg0.field2758 * arg2 >> 14;
        }
        if (arg0.field2697 == 4) {
            arg0.field2705 = arg0.field2767 * arg0.field2706 / arg0.field2682;
        }
        if (arg0.field2698 == 4) {
            arg0.field2706 = arg0.field2705 * arg0.field2682 / arg0.field2767;
        }
        if (arg0.field2694 == 1337) {
            field822 = arg0;
        }
        if (arg3 && arg0.field2805 != null && (arg0.field2705 != var4 || arg0.field2706 != var5)) {
            class63 var6 = new class63();
            var6.field575 = arg0;
            var6.field580 = arg0.field2805;
            field849.method3966(var6);
        }
    }

    @ObfuscatedName("s.jh(Lia;III)V")
    public static void method19(class239 arg0, int arg1, int arg2) {
        if (arg0.field2695 == 0) {
            arg0.field2749 = arg0.field2699;
        } else if (arg0.field2695 == 1) {
            arg0.field2749 = (arg1 - arg0.field2705) / 2 + arg0.field2699;
        } else if (arg0.field2695 == 2) {
            arg0.field2749 = arg1 - arg0.field2705 - arg0.field2699;
        } else if (arg0.field2695 == 3) {
            arg0.field2749 = arg0.field2699 * arg1 >> 14;
        } else if (arg0.field2695 == 4) {
            arg0.field2749 = (arg0.field2699 * arg1 >> 14) + (arg1 - arg0.field2705) / 2;
        } else {
            arg0.field2749 = arg1 - arg0.field2705 - (arg0.field2699 * arg1 >> 14);
        }
        if (arg0.field2696 == 0) {
            arg0.field2822 = arg0.field2700;
        } else if (arg0.field2696 == 1) {
            arg0.field2822 = (arg2 - arg0.field2706) / 2 + arg0.field2700;
        } else if (arg0.field2696 == 2) {
            arg0.field2822 = arg2 - arg0.field2706 - arg0.field2700;
        } else if (arg0.field2696 == 3) {
            arg0.field2822 = arg0.field2700 * arg2 >> 14;
        } else if (arg0.field2696 == 4) {
            arg0.field2822 = (arg0.field2700 * arg2 >> 14) + (arg2 - arg0.field2706) / 2;
        } else {
            arg0.field2822 = arg2 - arg0.field2706 - (arg0.field2700 * arg2 >> 14);
        }
    }

    @ObfuscatedName("er.jo(Lia;IIIIIII)V")
    public static final void method3082(class239 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field716) {
            field865 = 32;
        } else {
            field865 = 0;
        }
        field716 = false;
        if (class54.field487 == 1 || !Statics.field1523 && class54.field487 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2712 -= 4;
                method508(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2712 += 4;
                method508(arg0);
            } else if (arg5 >= arg1 - field865 && arg5 < field865 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2712 = (arg4 - arg3) * var8 / var9;
                method508(arg0);
                field716 = true;
            }
        }
        if (field848 == 0) {
            return;
        }
        int var10 = arg0.field2705;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2712 += field848 * 45;
            method508(arg0);
        }
    }

    @ObfuscatedName("je.jx(IIIIII)V")
    public static final void method4836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1248[0].method5635(arg0, arg1);
        Statics.field1248[1].method5635(arg0, arg1 + arg3 - 16);
        class324.method5551(arg0, arg1 + 16, 16, arg3 - 32, field712);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class324.method5551(arg0, arg1 + 16 + var6, 16, var5, field735);
        class324.method5616(arg0, arg1 + 16 + var6, var5, field715);
        class324.method5616(arg0 + 1, arg1 + 16 + var6, var5, field715);
        class324.method5557(arg0, arg1 + 16 + var6, 16, field715);
        class324.method5557(arg0, arg1 + 17 + var6, 16, field715);
        class324.method5616(arg0 + 15, arg1 + 16 + var6, var5, field855);
        class324.method5616(arg0 + 14, arg1 + 17 + var6, var5 - 1, field855);
        class324.method5557(arg0, arg1 + 15 + var6 + var5, 16, field855);
        class324.method5557(arg0 + 1, arg1 + 14 + var6 + var5, 15, field855);
    }

    @ObfuscatedName("jz.jp(Lia;B)Z")
    public static final boolean method4760(class239 arg0) {
        if (arg0.field2809 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2809.length; var1++) {
            int var2 = method2785(arg0, var1);
            int var3 = arg0.field2810[var1];
            if (arg0.field2809[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2809[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2809[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("di.jr(Lia;IB)I")
    public static final int method2785(class239 arg0, int arg1) {
        if (arg0.field2808 == null || arg1 >= arg0.field2808.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2808[arg1];
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
                    var7 = field782[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field776[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field754[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class239 var11 = class239.method2052(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class276.method1049(var12).field3528 || field653)) {
                        for (int var13 = 0; var13 < var11.field2814.length; var13++) {
                            if (var12 + 1 == var11.field2814[var13]) {
                                var7 += var11.field2739[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class234.field2648[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class243.field2865[field776[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class234.field2648[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field187.field616;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class243.field2866[var14]) {
                            var7 += field776[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class239 var17 = class239.method2052(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class276.method1049(var18).field3528 || field653)) {
                        for (int var19 = 0; var19 < var17.field2814.length; var19++) {
                            if (var18 + 1 == var17.field2814[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field817;
                }
                if (var6 == 12) {
                    var7 = field911;
                }
                if (var6 == 13) {
                    int var20 = class234.field2648[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class234.method1611(var22);
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
                    var7 = (Statics.field187.field948 >> 7) + Statics.field84;
                }
                if (var6 == 19) {
                    var7 = (Statics.field187.field949 >> 7) + Statics.field30;
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

    @ObfuscatedName("jr.jt(Lia;Ljc;IIZI)V")
    public static final void method4728(class239 arg0, class276 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3530;
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
            var7 = class246.field2879;
        }
        if (var6 != -1 && var7 != null) {
            method1033(var7, class81.method1019(16748608) + arg1.field3514, var6, arg1.field3513, arg2, arg0.field2690, arg4);
        }
    }

    @ObfuscatedName("p.jz(Lia;III)V")
    public static final void method73(class239 arg0, int arg1, int arg2) {
        if (arg0.field2753 == 1) {
            method1926(arg0.field2703, "", 24, 0, 0, arg0.field2690);
        }
        if (arg0.field2753 == 2 && !field805) {
            String var3 = method594(arg0);
            if (var3 != null) {
                method1926(var3, class81.method1019(65280) + arg0.field2752, 25, 0, -1, arg0.field2690);
            }
        }
        if (arg0.field2753 == 3) {
            method1926(class246.field3153, "", 26, 0, 0, arg0.field2690);
        }
        if (arg0.field2753 == 4) {
            method1926(arg0.field2703, "", 28, 0, 0, arg0.field2690);
        }
        if (arg0.field2753 == 5) {
            method1926(arg0.field2703, "", 29, 0, 0, arg0.field2690);
        }
        if (arg0.field2753 == 6 && field794 == null) {
            method1926(arg0.field2703, "", 30, 0, -1, arg0.field2690);
        }
        if (arg0.field2692 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2706; var5++) {
                for (int var6 = 0; var6 < arg0.field2705; var6++) {
                    int var7 = (arg0.field2757 + 32) * var6;
                    int var8 = (arg0.field2815 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2759[var4];
                        var8 += arg0.field2721[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field722 = var4;
                        Statics.field1418 = arg0;
                        if (arg0.field2814[var4] > 0) {
                            class276 var9 = class276.method1049(arg0.field2814[var4] - 1);
                            if (field847 == 1 && class240.method4052(method62(arg0))) {
                                if (Statics.field3199 != arg0.field2690 || Statics.field607 != var4) {
                                    method1926(class246.field2951, field804 + " " + class81.field1126 + " " + class81.method1019(16748608) + var9.field3514, 31, var9.field3513, var4, arg0.field2690);
                                }
                            } else if (!field805 || !class240.method4052(method62(arg0))) {
                                String[] var10 = var9.field3530;
                                int var11 = -1;
                                if (field661) {
                                    boolean var12 = field797 || class45.field391[81];
                                    if (var12) {
                                        var11 = var9.method4904();
                                    }
                                }
                                if (class240.method4052(method62(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method4728(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class240.method2108(method62(arg0))) {
                                    method1926(class246.field2951, class81.method1019(16748608) + var9.field3514, 38, var9.field3513, var4, arg0.field2690);
                                }
                                if (class240.method4052(method62(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method4728(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method4728(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field2827;
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method1926(var15[var16], class81.method1019(16748608) + var9.field3514, var17, var9.field3513, var4, arg0.field2690);
                                        }
                                    }
                                }
                                method1926(class246.field3032, class81.method1019(16748608) + var9.field3514, 1005, var9.field3513, var4, arg0.field2690);
                            } else if ((Statics.field1116 & 0x10) == 16) {
                                method1926(field808, field809 + " " + class81.field1126 + " " + class81.method1019(16748608) + var9.field3514, 32, var9.field3513, var4, arg0.field2690);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2689) {
            return;
        }
        if (field805) {
            int var18 = method62(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field1116 & 0x20) == 32) {
                method1926(field808, field809 + " " + class81.field1126 + " " + arg0.field2769, 58, 0, arg0.field2691, arg0.field2690);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21 = method514(arg0, var20);
            if (var21 != null) {
                method1926(var21, arg0.field2769, 1007, var20 + 1, arg0.field2691, arg0.field2690);
            }
        }
        String var22 = method594(arg0);
        if (var22 != null) {
            method1926(var22, arg0.field2769, 25, 0, arg0.field2691, arg0.field2690);
        }
        for (int var23 = 4; var23 >= 0; var23--) {
            String var24 = method514(arg0, var23);
            if (var24 != null) {
                method1033(var24, arg0.field2769, 57, var23 + 1, arg0.field2691, arg0.field2690, arg0.field2832);
            }
        }
        int var25 = method62(arg0);
        boolean var26 = (var25 & 0x1) != 0;
        if (var26) {
            method1926(class246.field2883, "", 30, 0, arg0.field2691, arg0.field2690);
        }
    }

    @ObfuscatedName("ic.jq(ZB)V")
    public static void method4329(boolean arg0) {
        field797 = arg0;
    }

    @ObfuscatedName("w.jf(I)Z")
    public static boolean method275() {
        return field797;
    }

    @ObfuscatedName("cp.je(IIIIIIIB)V")
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class239.method1101(arg0)) {
            method702(Statics.field2681[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ac.jy([Lia;IIIIIIIB)V")
    public static final void method702(class239[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class239 var9 = arg0[var8];
            if (var9 != null && var9.field2709 == arg1 && (!var9.field2689 || var9.field2692 == 0 || var9.field2776 || method62(var9) != 0 || field824 == var9 || var9.field2694 == 1338)) {
                if (var9.field2689) {
                    if (method987(var9)) {
                        continue;
                    }
                } else if (var9.field2692 == 0 && Statics.field3586 != var9 && method987(var9)) {
                    continue;
                }
                int var10 = var9.field2749 + arg6;
                int var11 = var9.field2822 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2692 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2692 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2705 + var10;
                    int var19 = var9.field2706 + var11;
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
                    int var22 = var9.field2705 + var10;
                    int var23 = var9.field2706 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field823 == var9) {
                    field831 = true;
                    field832 = var10;
                    field833 = var11;
                }
                boolean var24 = false;
                if (var9.field2764) {
                    switch(field859) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2690 >>> 16 == field813) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field813 == var9.field2690) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2689 || var12 < var14 && var13 < var15) {
                    if (var9.field2689) {
                        if (var9.field2830) {
                            if (class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15) {
                                for (class63 var25 = (class63) field849.method3990(); var25 != null; var25 = (class63) field849.method3984()) {
                                    if (var25.field574) {
                                        var25.method3960();
                                        var25.field575.field2821 = false;
                                    }
                                }
                                if (Statics.field268 == 0) {
                                    field823 = null;
                                    field824 = null;
                                }
                                if (!field786) {
                                    method115();
                                }
                            }
                        } else if (var9.field2831 && class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15) {
                            for (class63 var26 = (class63) field849.method3990(); var26 != null; var26 = (class63) field849.method3984()) {
                                if (var26.field574 && var26.field575.field2797 == var26.field580) {
                                    var26.method3960();
                                }
                            }
                        }
                    }
                    int var27 = class54.field488;
                    int var28 = class54.field489;
                    if (class54.field497 != 0) {
                        var27 = class54.field496;
                        var28 = class54.field480;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2694 == 1337) {
                        if (!field664 && !field786 && var29) {
                            method281(var27, var28, var12, var13);
                        }
                    } else if (var9.field2694 == 1338) {
                        method376(var9, var10, var11);
                    } else {
                        if (var9.field2694 == 1400) {
                            Statics.field131.method5818(class54.field488, class54.field489, var29, var10, var11, var9.field2705, var9.field2706);
                        }
                        if (!field786 && var29) {
                            if (var9.field2694 == 1400) {
                                Statics.field131.method5870(var10, var11, var9.field2705, var9.field2706, var27, var28);
                            } else {
                                method73(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2713.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2713[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2713[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2829 != null) {
                                            var34 = class45.field391[var9.field2713[var30][var33]];
                                        }
                                        if (method1052(var9.field2713[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2829 != null && var9.field2829[var30] > field660) {
                                                break;
                                            }
                                            byte var35 = var9.field2693[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class45.field391[86] && !class45.field391[82] && !class45.field391[81]) && ((var35 & 0x2) == 0 || class45.field391[86]) && ((var35 & 0x1) == 0 || class45.field391[82]) && ((var35 & 0x4) == 0 || class45.field391[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method5114(var30 + 1, var9.field2690, var9.field2691, var9.field2816, "");
                                    } else if (var30 == 10) {
                                        method711();
                                        method951(var9.field2690, var9.field2691, class240.method2534(method62(var9)), var9.field2816);
                                        field808 = method594(var9);
                                        if (field808 == null) {
                                            field808 = class246.field2885;
                                        }
                                        field809 = var9.field2769 + class81.method1019(16777215);
                                    }
                                    int var36 = var9.field2768[var30];
                                    if (var9.field2829 == null) {
                                        var9.field2829 = new int[var9.field2713.length];
                                    }
                                    if (var9.field2755 == null) {
                                        var9.field2755 = new int[var9.field2713.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2829[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2829[var30] == 0) {
                                        var9.field2829[var30] = field660 + var36 + var9.field2755[var30];
                                    } else {
                                        var9.field2829[var30] = field660 + var36;
                                    }
                                }
                                if (!var31 && var9.field2829 != null) {
                                    var9.field2829[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2689) {
                            boolean var37;
                            if (class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class54.field487 == 1 || !Statics.field1523 && class54.field487 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class54.field497 == 1 || !Statics.field1523 && class54.field497 == 4) && class54.field496 >= var12 && class54.field480 >= var13 && class54.field496 < var14 && class54.field480 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method596(var9, class54.field496 - var10, class54.field480 - var11);
                            }
                            if (var9.field2694 == 1400) {
                                Statics.field131.method5819(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field823 != null && field823 != var9 && var37 && class240.method3730(method62(var9))) {
                                field827 = var9;
                            }
                            if (field824 == var9) {
                                field905 = true;
                                field758 = var10;
                                field830 = var11;
                            }
                            if (var9.field2776) {
                                if (var37 && field848 != 0 && var9.field2797 != null) {
                                    class63 var40 = new class63();
                                    var40.field574 = true;
                                    var40.field575 = var9;
                                    var40.field577 = field848;
                                    var40.field580 = var9.field2797;
                                    field849.method3966(var40);
                                }
                                if (field823 != null || Statics.field421 != null || field786) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2724 && var39) {
                                    var9.field2724 = true;
                                    if (var9.field2782 != null) {
                                        class63 var41 = new class63();
                                        var41.field574 = true;
                                        var41.field575 = var9;
                                        var41.field576 = class54.field496 - var10;
                                        var41.field577 = class54.field480 - var11;
                                        var41.field580 = var9.field2782;
                                        field849.method3966(var41);
                                    }
                                }
                                if (var9.field2724 && var38 && var9.field2722 != null) {
                                    class63 var42 = new class63();
                                    var42.field574 = true;
                                    var42.field575 = var9;
                                    var42.field576 = class54.field488 - var10;
                                    var42.field577 = class54.field489 - var11;
                                    var42.field580 = var9.field2722;
                                    field849.method3966(var42);
                                }
                                if (var9.field2724 && !var38) {
                                    var9.field2724 = false;
                                    if (var9.field2780 != null) {
                                        class63 var43 = new class63();
                                        var43.field574 = true;
                                        var43.field575 = var9;
                                        var43.field576 = class54.field488 - var10;
                                        var43.field577 = class54.field489 - var11;
                                        var43.field580 = var9.field2780;
                                        field851.method3966(var43);
                                    }
                                }
                                if (var38 && var9.field2781 != null) {
                                    class63 var44 = new class63();
                                    var44.field574 = true;
                                    var44.field575 = var9;
                                    var44.field576 = class54.field488 - var10;
                                    var44.field577 = class54.field489 - var11;
                                    var44.field580 = var9.field2781;
                                    field849.method3966(var44);
                                }
                                if (!var9.field2821 && var37) {
                                    var9.field2821 = true;
                                    if (var9.field2727 != null) {
                                        class63 var45 = new class63();
                                        var45.field574 = true;
                                        var45.field575 = var9;
                                        var45.field576 = class54.field488 - var10;
                                        var45.field577 = class54.field489 - var11;
                                        var45.field580 = var9.field2727;
                                        field849.method3966(var45);
                                    }
                                }
                                if (var9.field2821 && var37 && var9.field2783 != null) {
                                    class63 var46 = new class63();
                                    var46.field574 = true;
                                    var46.field575 = var9;
                                    var46.field576 = class54.field488 - var10;
                                    var46.field577 = class54.field489 - var11;
                                    var46.field580 = var9.field2783;
                                    field849.method3966(var46);
                                }
                                if (var9.field2821 && !var37) {
                                    var9.field2821 = false;
                                    if (var9.field2784 != null) {
                                        class63 var47 = new class63();
                                        var47.field574 = true;
                                        var47.field575 = var9;
                                        var47.field576 = class54.field488 - var10;
                                        var47.field577 = class54.field489 - var11;
                                        var47.field580 = var9.field2784;
                                        field851.method3966(var47);
                                    }
                                }
                                if (var9.field2795 != null) {
                                    class63 var48 = new class63();
                                    var48.field575 = var9;
                                    var48.field580 = var9.field2795;
                                    field922.method3966(var48);
                                }
                                if (var9.field2789 != null && field837 > var9.field2723) {
                                    if (var9.field2790 == null || field837 - var9.field2723 > 32) {
                                        class63 var53 = new class63();
                                        var53.field575 = var9;
                                        var53.field580 = var9.field2789;
                                        field849.method3966(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2723; var49 < field837; var49++) {
                                            int var50 = field836[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2790.length; var51++) {
                                                if (var9.field2790[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field575 = var9;
                                                    var52.field580 = var9.field2789;
                                                    field849.method3966(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2723 = field837;
                                }
                                if (var9.field2791 != null && field682 > var9.field2825) {
                                    if (var9.field2792 == null || field682 - var9.field2825 > 32) {
                                        class63 var58 = new class63();
                                        var58.field575 = var9;
                                        var58.field580 = var9.field2791;
                                        field849.method3966(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2825; var54 < field682; var54++) {
                                            int var55 = field838[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2792.length; var56++) {
                                                if (var9.field2792[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field575 = var9;
                                                    var57.field580 = var9.field2791;
                                                    field849.method3966(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2825 = field682;
                                }
                                if (var9.field2793 != null && field841 > var9.field2826) {
                                    if (var9.field2794 == null || field841 - var9.field2826 > 32) {
                                        class63 var63 = new class63();
                                        var63.field575 = var9;
                                        var63.field580 = var9.field2793;
                                        field849.method3966(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2826; var59 < field841; var59++) {
                                            int var60 = field840[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2794.length; var61++) {
                                                if (var9.field2794[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field575 = var9;
                                                    var62.field580 = var9.field2793;
                                                    field849.method3966(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2826 = field841;
                                }
                                if (field842 > var9.field2823 && var9.field2798 != null) {
                                    class63 var64 = new class63();
                                    var64.field575 = var9;
                                    var64.field580 = var9.field2798;
                                    field849.method3966(var64);
                                }
                                if (field843 > var9.field2823 && var9.field2800 != null) {
                                    class63 var65 = new class63();
                                    var65.field575 = var9;
                                    var65.field580 = var9.field2800;
                                    field849.method3966(var65);
                                }
                                if (field899 > var9.field2823 && var9.field2801 != null) {
                                    class63 var66 = new class63();
                                    var66.field575 = var9;
                                    var66.field580 = var9.field2801;
                                    field849.method3966(var66);
                                }
                                if (field649 > var9.field2823 && var9.field2774 != null) {
                                    class63 var67 = new class63();
                                    var67.field575 = var9;
                                    var67.field580 = var9.field2774;
                                    field849.method3966(var67);
                                }
                                if (field676 > var9.field2823 && var9.field2726 != null) {
                                    class63 var68 = new class63();
                                    var68.field575 = var9;
                                    var68.field580 = var9.field2726;
                                    field849.method3966(var68);
                                }
                                if (field925 > var9.field2823 && var9.field2802 != null) {
                                    class63 var69 = new class63();
                                    var69.field575 = var9;
                                    var69.field580 = var9.field2802;
                                    field849.method3966(var69);
                                }
                                var9.field2823 = field835;
                                if (var9.field2799 != null) {
                                    for (int var70 = 0; var70 < field871; var70++) {
                                        class63 var71 = new class63();
                                        var71.field575 = var9;
                                        var71.field585 = field733[var70];
                                        var71.field573 = field872[var70];
                                        var71.field580 = var9.field2799;
                                        field849.method3966(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2689) {
                            if (field823 != null || Statics.field421 != null || field786) {
                                continue;
                            }
                            if ((var9.field2811 >= 0 || var9.field2820 != 0) && class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15) {
                                if (var9.field2811 >= 0) {
                                    Statics.field3586 = arg0[var9.field2811];
                                } else {
                                    Statics.field3586 = var9;
                                }
                            }
                            if (var9.field2692 == 8 && class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15) {
                                Statics.field1962 = var9;
                            }
                            if (var9.field2714 > var9.field2706) {
                                method3082(var9, var9.field2705 + var10, var11, var9.field2706, var9.field2714, class54.field488, class54.field489);
                            }
                        }
                        if (var9.field2692 == 0) {
                            method702(arg0, var9.field2690, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2712);
                            if (var9.field2686 != null) {
                                method702(var9.field2686, var9.field2690, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2712);
                            }
                            class62 var72 = (class62) field811.method3911((long) var9.field2690);
                            if (var72 != null) {
                                if (var72.field568 == 0 && class54.field488 >= var12 && class54.field489 >= var13 && class54.field488 < var14 && class54.field489 < var15 && !field786) {
                                    for (class63 var73 = (class63) field849.method3990(); var73 != null; var73 = (class63) field849.method3984()) {
                                        if (var73.field574) {
                                            var73.method3960();
                                            var73.field575.field2821 = false;
                                        }
                                    }
                                    if (Statics.field268 == 0) {
                                        field823 = null;
                                        field824 = null;
                                    }
                                    if (!field786) {
                                        method115();
                                    }
                                }
                                method1970(var72.field571, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.jc(II)Z")
    public static boolean method1052(int arg0) {
        for (int var1 = 0; var1 < field871; var1++) {
            if (field733[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bs.ji(III)V")
    public static final void method1763(int arg0, int arg1) {
        if (class239.method1101(arg0)) {
            method3076(Statics.field2681[arg0], arg1);
        }
    }

    @ObfuscatedName("ef.jg([Lia;IB)V")
    public static final void method3076(class239[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class239 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2692 == 0) {
                    if (var3.field2686 != null) {
                        method3076(var3.field2686, arg1);
                    }
                    class62 var4 = (class62) field811.method3911((long) var3.field2690);
                    if (var4 != null) {
                        method1763(var4.field571, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2803 != null) {
                    class63 var5 = new class63();
                    var5.field575 = var3;
                    var5.field580 = var3.field2803;
                    class76.method3778(var5);
                }
                if (arg1 == 1 && var3.field2804 != null) {
                    if (var3.field2691 >= 0) {
                        class239 var6 = class239.method2052(var3.field2690);
                        if (var6 == null || var6.field2686 == null || var3.field2691 >= var6.field2686.length || var6.field2686[var3.field2691] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field575 = var3;
                    var7.field580 = var3.field2804;
                    class76.method3778(var7);
                }
            }
        }
    }

    @ObfuscatedName("aj.jw(Lia;III)V")
    public static final void method596(class239 arg0, int arg1, int arg2) {
        if (field823 != null || field786 || arg0 == null || method1099(arg0) == null) {
            return;
        }
        field823 = arg0;
        field824 = method1099(arg0);
        field825 = arg1;
        field803 = arg2;
        Statics.field268 = 0;
        field834 = false;
        int var3 = field787 - 1;
        if (var3 != -1) {
            method3118(var3);
        }
    }

    @ObfuscatedName("client.ju(I)V")
    public final void method1416() {
        method508(field823);
        Statics.field268++;
        if (field831 && field905) {
            int var1 = class54.field488;
            int var2 = class54.field489;
            int var3 = var1 - field825;
            int var4 = var2 - field803;
            if (var3 < field758) {
                var3 = field758;
            }
            if (field823.field2705 + var3 > field758 + field824.field2705) {
                var3 = field758 + field824.field2705 - field823.field2705;
            }
            if (var4 < field830) {
                var4 = field830;
            }
            if (field823.field2706 + var4 > field830 + field824.field2706) {
                var4 = field830 + field824.field2706 - field823.field2706;
            }
            int var5 = var3 - field832;
            int var6 = var4 - field833;
            int var7 = field823.field2779;
            if (Statics.field268 > field823.field2773 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field834 = true;
            }
            int var8 = field824.field2711 + (var3 - field758);
            int var9 = field824.field2712 + (var4 - field830);
            if (field823.field2735 != null && field834) {
                class63 var10 = new class63();
                var10.field575 = field823;
                var10.field576 = var8;
                var10.field577 = var9;
                var10.field580 = field823.field2735;
                class76.method3778(var10);
            }
            if (class54.field487 == 0) {
                if (field834) {
                    if (field823.field2786 != null) {
                        class63 var11 = new class63();
                        var11.field575 = field823;
                        var11.field576 = var8;
                        var11.field577 = var9;
                        var11.field579 = field827;
                        var11.field580 = field823.field2786;
                        class76.method3778(var11);
                    }
                    if (field827 != null) {
                        class239 var12 = field823;
                        int var13 = method62(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class239 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class239.method2052(var12.field2709);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class180 var18 = class180.method625(class177.field2255, field695.field1308);
                            var18.field2350.method3491(field823.field2691);
                            var18.field2350.method3491(field827.field2816);
                            var18.field2350.method3440(field827.field2691);
                            var18.field2350.method3499(field823.field2690);
                            var18.field2350.method3500(field827.field2690);
                            var18.field2350.method3440(field823.field2816);
                            field695.method2097(var18);
                        }
                    }
                } else if (this.method1189()) {
                    this.method1539(field832 + field825, field833 + field803);
                } else if (field787 > 0) {
                    int var19 = field832 + field825;
                    int var20 = field833 + field803;
                    class82 var21 = Statics.field25;
                    method667(var21.field1135, var21.field1129, var21.field1131, var21.field1132, var21.field1133, var21.field1133, var19, var20);
                    Statics.field25 = null;
                }
                field823 = null;
            }
        } else if (Statics.field268 > 1) {
            field823 = null;
        }
    }

    @ObfuscatedName("eg.jm(II)V")
    public static void method3118(int arg0) {
        Statics.field25 = new class82();
        Statics.field25.field1135 = field742[arg0];
        Statics.field25.field1129 = field914[arg0];
        Statics.field25.field1131 = field856[arg0];
        Statics.field25.field1132 = field717[arg0];
        Statics.field25.field1133 = field792[arg0];
    }

    @ObfuscatedName("aa.js(Lia;S)V")
    public static void method508(class239 arg0) {
        if (field659 == arg0.field2828) {
            field796[arg0.field2704] = true;
        }
    }

    @ObfuscatedName("kw.jj(B)V")
    public static void method5289() {
        for (class62 var0 = (class62) field811.method3914(); var0 != null; var0 = (class62) field811.method3915()) {
            int var1 = var0.field571;
            if (class239.method1101(var1)) {
                boolean var2 = true;
                class239[] var3 = Statics.field2681[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2689;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2512;
                    class239 var6 = class239.method2052(var5);
                    if (var6 != null) {
                        method508(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.jv(Lia;I)Lia;")
    public static class239 method1099(class239 arg0) {
        class239 var1 = arg0;
        int var2 = method62(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class239 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class239.method2052(var1.field2709);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class239 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2771;
        }
        return var7;
    }

    @ObfuscatedName("n.jk(II)V")
    public static final void method129(int arg0) {
        if (!class239.method1101(arg0)) {
            return;
        }
        class239[] var1 = Statics.field2681[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3 != null) {
                var3.field2818 = 0;
                var3.field2819 = 0;
            }
        }
    }

    @ObfuscatedName("z.jb(IB)V")
    public static final void method293(int arg0) {
        if (class239.method1101(arg0)) {
            method2338(Statics.field2681[arg0], -1);
        }
    }

    @ObfuscatedName("dn.ka([Lia;II)V")
    public static final void method2338(class239[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class239 var3 = arg0[var2];
            if (var3 != null && var3.field2709 == arg1 && (!var3.field2689 || !method987(var3))) {
                if (var3.field2692 == 0) {
                    if (!var3.field2689 && method987(var3) && Statics.field3586 != var3) {
                        continue;
                    }
                    method2338(arg0, var3.field2690);
                    if (var3.field2686 != null) {
                        method2338(var3.field2686, var3.field2690);
                    }
                    class62 var4 = (class62) field811.method3911((long) var3.field2690);
                    if (var4 != null) {
                        method293(var4.field571);
                    }
                }
                if (var3.field2692 == 6) {
                    if (var3.field2677 != -1 || var3.field2702 != -1) {
                        boolean var5 = method4760(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2702;
                        } else {
                            var6 = var3.field2677;
                        }
                        if (var6 != -1) {
                            class280 var7 = class280.method3173(var6);
                            var3.field2819 += field711;
                            while (var3.field2819 > var7.field3622[var3.field2818]) {
                                var3.field2819 -= var7.field3622[var3.field2818];
                                var3.field2818++;
                                if (var3.field2818 >= var7.field3620.length) {
                                    var3.field2818 -= var7.field3624;
                                    if (var3.field2818 < 0 || var3.field2818 >= var7.field3620.length) {
                                        var3.field2818 = 0;
                                    }
                                }
                                method508(var3);
                            }
                        }
                    }
                    if (var3.field2746 != 0 && !var3.field2689) {
                        int var8 = var3.field2746 >> 16;
                        int var9 = var3.field2746 << 16 >> 16;
                        int var10 = field711 * var8;
                        int var11 = field711 * var9;
                        var3.field2813 = var3.field2813 + var10 & 0x7FF;
                        var3.field2742 = var3.field2742 + var11 & 0x7FF;
                        method508(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.km(IB)V")
    public static final void method71(int arg0) {
        method5289();
        for (class75 var1 = (class75) class75.field1062.method3990(); var1 != null; var1 = (class75) class75.field1062.method3984()) {
            if (var1.field1065 != null) {
                var1.method1757();
            }
        }
        int var2 = class262.method3119(arg0).field3318;
        if (var2 == 0) {
            return;
        }
        int var3 = class234.field2648[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class130.method2823(0.9D);
                ((class119) Statics.field1756).method2562(0.9D);
            }
            if (var3 == 2) {
                class130.method2823(0.8D);
                ((class119) Statics.field1756).method2562(0.8D);
            }
            if (var3 == 3) {
                class130.method2823(0.7D);
                ((class119) Statics.field1756).method2562(0.7D);
            }
            if (var3 == 4) {
                class130.method2823(0.6D);
                ((class119) Statics.field1756).method2562(0.6D);
            }
            class276.field3523.method3879();
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
            if (field883 != var4) {
                if (field883 == 0 && field681 != -1) {
                    class225.method540(Statics.field2053, field681, 0, var4, false);
                    field885 = false;
                } else if (var4 == 0) {
                    class225.method3246();
                    field885 = false;
                } else {
                    class225.method3385(var4);
                }
                field883 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field886 = 127;
            }
            if (var3 == 1) {
                field886 = 96;
            }
            if (var3 == 2) {
                field886 = 64;
            }
            if (var3 == 3) {
                field886 = 32;
            }
            if (var3 == 4) {
                field886 = 0;
            }
        }
        if (var2 == 5) {
            field785 = var3;
        }
        if (var2 == 6) {
            field814 = var3;
        }
        if (var2 == 9) {
            field815 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field887 = 127;
            }
            if (var3 == 1) {
                field887 = 96;
            }
            if (var3 == 2) {
                field887 = 64;
            }
            if (var3 == 3) {
                field887 = 32;
            }
            if (var3 == 4) {
                field887 = 0;
            }
        }
        if (var2 == 17) {
            field820 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class84[] var5 = new class84[] { class84.field1145, class84.field1143, class84.field1144, class84.field1141 };
            field666 = (class84) Statics.method2007(var5, var3);
            if (field666 == null) {
                field666 = class84.field1145;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field777 = -1;
            } else {
                field777 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class84[] var6 = new class84[] { class84.field1145, class84.field1143, class84.field1144, class84.field1141 };
        field677 = (class84) Statics.method2007(var6, var3);
        if (field677 == null) {
            field677 = class84.field1145;
        }
    }

    @ObfuscatedName("kr.kn(Lia;I)V")
    public static final void method5231(class239 arg0) {
        int var1 = arg0.field2694;
        if (var1 == 324) {
            if (field862 == -1) {
                field862 = arg0.field2725;
                field909 = arg0.field2737;
            }
            if (field919.field2655) {
                arg0.field2725 = field862;
            } else {
                arg0.field2725 = field909;
            }
        } else if (var1 == 325) {
            if (field862 == -1) {
                field862 = arg0.field2725;
                field909 = arg0.field2737;
            }
            if (field919.field2655) {
                arg0.field2725 = field909;
            } else {
                arg0.field2725 = field862;
            }
        } else if (var1 == 327) {
            arg0.field2813 = 150;
            arg0.field2742 = (int) (Math.sin((double) field660 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2733 = 5;
            arg0.field2734 = 0;
        } else if (var1 == 328) {
            arg0.field2813 = 150;
            arg0.field2742 = (int) (Math.sin((double) field660 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2733 = 5;
            arg0.field2734 = 1;
        }
    }

    @ObfuscatedName("ge.kj(I)V")
    public static final void method3755() {
        class180 var0 = class180.method625(class177.field2266, field695.field1308);
        field695.method2097(var0);
        for (class62 var1 = (class62) field811.method3914(); var1 != null; var1 = (class62) field811.method3915()) {
            if (var1.field568 == 0 || var1.field568 == 3) {
                method5009(var1, true);
            }
        }
        if (field794 != null) {
            method508(field794);
            field794 = null;
        }
    }

    @ObfuscatedName("bk.ku(IIII)Lbk;")
    public static final class62 method1051(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field571 = arg1;
        var3.field568 = arg2;
        field811.method3920(var3, (long) arg0);
        method129(arg1);
        class239 var4 = class239.method2052(arg0);
        method508(var4);
        if (field794 != null) {
            method508(field794);
            field794 = null;
        }
        for (int var5 = 0; var5 < field787; var5++) {
            int var6 = field856[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field787 - 1) {
                    for (int var8 = var5; var8 < field787 - 1; var8++) {
                        field792[var8] = field792[var8 + 1];
                        field793[var8] = field793[var8 + 1];
                        field856[var8] = field856[var8 + 1];
                        field717[var8] = field717[var8 + 1];
                        field742[var8] = field742[var8 + 1];
                        field914[var8] = field914[var8 + 1];
                        field727[var8] = field727[var8 + 1];
                    }
                }
                var5--;
                field787--;
            }
        }
        method1755(Statics.field3310 / 2 + Statics.field277, Statics.field57);
        method1013(Statics.field2681[arg0 >> 16], var4, false);
        class76.method1615(arg1);
        if (field821 != -1) {
            method1763(field821, 1);
        }
        return var3;
    }

    @ObfuscatedName("jw.kd(Lbk;ZI)V")
    public static final void method5009(class62 arg0, boolean arg1) {
        int var2 = arg0.field571;
        int var3 = (int) arg0.field2512;
        arg0.method3960();
        if (arg1 && var2 != -1 && Statics.field2766[var2]) {
            Statics.field429.method4436(var2);
            if (Statics.field2681[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2681[var2].length; var5++) {
                    if (Statics.field2681[var2][var5] != null) {
                        if (Statics.field2681[var2][var5].field2692 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2681[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2681[var2] = null;
                }
                Statics.field2766[var2] = false;
            }
        }
        method740(var2);
        class239 var6 = class239.method2052(var3);
        if (var6 != null) {
            method508(var6);
        }
        for (int var7 = 0; var7 < field787; var7++) {
            int var8 = field856[var7];
            boolean var9 = var8 == 57 || var8 == 58 || var8 == 1007 || var8 == 25 || var8 == 30;
            if (var9) {
                if (var7 < field787 - 1) {
                    for (int var10 = var7; var10 < field787 - 1; var10++) {
                        field792[var10] = field792[var10 + 1];
                        field793[var10] = field793[var10 + 1];
                        field856[var10] = field856[var10 + 1];
                        field717[var10] = field717[var10 + 1];
                        field742[var10] = field742[var10 + 1];
                        field914[var10] = field914[var10 + 1];
                        field727[var10] = field727[var10 + 1];
                    }
                }
                var7--;
                field787--;
            }
        }
        method1755(Statics.field3310 / 2 + Statics.field277, Statics.field57);
        if (field821 != -1) {
            method1763(field821, 1);
        }
    }

    @ObfuscatedName("s.kq(Lia;I)Z")
    public static final boolean method20(class239 arg0) {
        int var1 = arg0.field2694;
        if (var1 == 205) {
            field696 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field919.method4288(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field919.method4315(var4, var5 == 1);
        }
        if (var1 == 324) {
            field919.method4290(false);
        }
        if (var1 == 325) {
            field919.method4290(true);
        }
        if (var1 == 326) {
            class180 var6 = class180.method625(class177.field2232, field695.field1308);
            field919.method4291(var6.field2350);
            field695.method2097(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("em.kl(Lia;IIII)V")
    public static final void method3060(class239 arg0, int arg1, int arg2, int arg3) {
        method5295();
        class233 var4 = arg0.method4362(false);
        if (var4 == null) {
            return;
        }
        class324.method5543(arg1, arg2, var4.field2642 + arg1, var4.field2641 + arg2);
        if (field708 == 2 || field708 == 5) {
            class324.method5563(arg1, arg2, 0, var4.field2644, var4.field2643);
        } else {
            int var5 = field719 & 0x7FF;
            int var6 = Statics.field187.field948 / 32 + 48;
            int var7 = 464 - Statics.field187.field949 / 32;
            Statics.field1068.method5741(arg1, arg2, var4.field2642, var4.field2641, var6, var7, var5, 256, var4.field2644, var4.field2643);
            for (int var8 = 0; var8 < field876; var8++) {
                int var9 = field713[var8] * 4 + 2 - Statics.field187.field948 / 32;
                int var10 = field806[var8] * 4 + 2 - Statics.field187.field949 / 32;
                method3427(arg1, arg2, var9, var10, field879[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class213 var13 = field778[Statics.field2219][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field187.field948 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field187.field949 / 32;
                        method3427(arg1, arg2, var14, var15, Statics.field3[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field691; var16++) {
                class79 var17 = field693[field692[var16]];
                if (var17 != null && var17.method1116()) {
                    class278 var18 = var17.field1103;
                    if (var18 != null && var18.field3574 != null) {
                        var18 = var18.method4959();
                    }
                    if (var18 != null && var18.field3572 && var18.field3584) {
                        int var19 = var17.field948 / 32 - Statics.field187.field948 / 32;
                        int var20 = var17.field949 / 32 - Statics.field187.field949 / 32;
                        method3427(arg1, arg2, var19, var20, Statics.field3[1], var4);
                    }
                }
            }
            int var21 = class89.field1247;
            int[] var22 = class89.field1244;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field766[var22[var23]];
                if (var24 != null && var24.method1116() && !var24.field633 && Statics.field187 != var24) {
                    int var25 = var24.field948 / 32 - Statics.field187.field948 / 32;
                    int var26 = var24.field949 / 32 - Statics.field187.field949 / 32;
                    boolean var27 = false;
                    if (Statics.field187.field615 != 0 && var24.field615 != 0 && Statics.field187.field615 == var24.field615) {
                        var27 = true;
                    }
                    if (var24.method1113()) {
                        method3427(arg1, arg2, var25, var26, Statics.field3[3], var4);
                    } else if (var27) {
                        method3427(arg1, arg2, var25, var26, Statics.field3[4], var4);
                    } else if (var24.method1136()) {
                        method3427(arg1, arg2, var25, var26, Statics.field3[5], var4);
                    } else {
                        method3427(arg1, arg2, var25, var26, Statics.field3[2], var4);
                    }
                }
            }
            if (field668 != 0 && field660 % 20 < 10) {
                if (field668 == 1 && field863 >= 0 && field863 < field693.length) {
                    class79 var28 = field693[field863];
                    if (var28 != null) {
                        int var29 = var28.field948 / 32 - Statics.field187.field948 / 32;
                        int var30 = var28.field949 / 32 - Statics.field187.field949 / 32;
                        method4397(arg1, arg2, var29, var30, Statics.field1907[1], var4);
                    }
                }
                if (field668 == 2) {
                    int var31 = field671 * 4 - Statics.field84 * 4 + 2 - Statics.field187.field948 / 32;
                    int var32 = field672 * 4 - Statics.field30 * 4 + 2 - Statics.field187.field949 / 32;
                    method4397(arg1, arg2, var31, var32, Statics.field1907[1], var4);
                }
                if (field668 == 10 && field670 >= 0 && field670 < field766.length) {
                    class67 var33 = field766[field670];
                    if (var33 != null) {
                        int var34 = var33.field948 / 32 - Statics.field187.field948 / 32;
                        int var35 = var33.field949 / 32 - Statics.field187.field949 / 32;
                        method4397(arg1, arg2, var34, var35, Statics.field1907[1], var4);
                    }
                }
            }
            if (field880 != 0) {
                int var36 = field880 * 4 + 2 - Statics.field187.field948 / 32;
                int var37 = field881 * 4 + 2 - Statics.field187.field949 / 32;
                method3427(arg1, arg2, var36, var37, Statics.field1907[0], var4);
            }
            if (!Statics.field187.field633) {
                class324.method5551(var4.field2642 / 2 + arg1 - 1, var4.field2641 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field924[arg3] = true;
    }

    @ObfuscatedName("di.ko(Lia;IIII)V")
    public static final void method2762(class239 arg0, int arg1, int arg2, int arg3) {
        class233 var4 = arg0.method4362(false);
        if (var4 == null) {
            return;
        }
        if (field708 < 3) {
            Statics.field345.method5741(arg1, arg2, var4.field2642, var4.field2641, 25, 25, field719, 256, var4.field2644, var4.field2643);
        } else {
            class324.method5563(arg1, arg2, 0, var4.field2644, var4.field2643);
        }
    }

    @ObfuscatedName("iu.kz(IIIILld;Lhk;B)V")
    public static final void method4397(int arg0, int arg1, int arg2, int arg3, class328 arg4, class233 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3427(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field719 & 0x7FF;
        int var8 = class130.field1779[var7];
        int var9 = class130.field1768[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2642 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field185.method5762(arg5.field2642 / 2 + arg0 - var17 / 2 + var15, arg5.field2641 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("gq.kr(IIIILld;Lhk;I)V")
    public static final void method3427(int arg0, int arg1, int arg2, int arg3, class328 arg4, class233 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field719 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class130.field1779[var6];
        int var9 = class130.field1768[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5671(arg5.field2642 / 2 + var10 - arg4.field3893 / 2, arg5.field2641 / 2 - var11 - arg4.field3894 / 2, arg0, arg1, arg5.field2642, arg5.field2641, arg5.field2644, arg5.field2643);
        } else {
            arg4.method5668(arg5.field2642 / 2 + arg0 + var10 - arg4.field3893 / 2, arg5.field2641 / 2 + arg1 - var11 - arg4.field3894 / 2);
        }
    }

    @ObfuscatedName("g.kx(S)V")
    public static final void method26() {
        Iterator var0 = class91.field1261.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1078();
        }
        if (Statics.field366 != null) {
            Statics.field366.method5266();
        }
    }

    @ObfuscatedName("an.ks(B)V")
    public static final void method520() {
        field843 = field835;
    }

    @ObfuscatedName("fk.ky(I)V")
    public static final void method3348() {
        field899 = field835;
        Statics.field226 = true;
    }

    @ObfuscatedName("bw.kg(Ljava/lang/String;I)V")
    public static final void method1152(String arg0) {
        if (Statics.field366 != null) {
            class180 var1 = class180.method625(class177.field2233, field695.field1308);
            var1.field2350.method3439(class190.method1171(arg0));
            var1.field2350.method3446(arg0);
            field695.method2097(var1);
        }
    }

    @ObfuscatedName("fi.kw(Ljava/lang/String;B)V")
    public static final void method3287(String arg0) {
        if (!arg0.equals("")) {
            class180 var1 = class180.method625(class177.field2298, field695.field1308);
            var1.field2350.method3439(class190.method1171(arg0));
            var1.field2350.method3446(arg0);
            field695.method2097(var1);
        }
    }

    @ObfuscatedName("av.ke(I)V")
    public static final void method583() {
        class180 var0 = class180.method625(class177.field2298, field695.field1308);
        var0.field2350.method3439(0);
        field695.method2097(var0);
    }

    @ObfuscatedName("ak.ki(II)V")
    public static void method740(int arg0) {
        for (class219 var1 = (class219) field860.method3914(); var1 != null; var1 = (class219) field860.method3915()) {
            if ((long) arg0 == (var1.field2512 >> 48 & 0xFFFFL)) {
                var1.method3960();
            }
        }
    }

    @ObfuscatedName("f.kt(Lia;I)I")
    public static int method62(class239 arg0) {
        class219 var1 = (class219) field860.method3911(((long) arg0.field2690 << 32) + (long) arg0.field2691);
        return var1 == null ? arg0.field2708 : var1.field2527;
    }

    @ObfuscatedName("bd.kf(Lia;I)Z")
    public static boolean method987(class239 arg0) {
        return arg0.field2710;
    }

    @ObfuscatedName("ah.kc(Lia;II)Ljava/lang/String;")
    public static String method514(class239 arg0, int arg1) {
        int var2 = method62(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2796 == null) {
            return null;
        } else if (arg0.field2770 == null || arg0.field2770.length <= arg1 || arg0.field2770[arg1] == null || arg0.field2770[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2770[arg1];
        }
    }

    @ObfuscatedName("aj.kk(Lia;I)Ljava/lang/String;")
    public static String method594(class239 arg0) {
        if (class240.method2534(method62(arg0)) == 0) {
            return null;
        } else if (arg0.field2775 == null || arg0.field2775.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2775;
        }
    }

    @ObfuscatedName("f.kp(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method60(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field652 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field652 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field652 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field652 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field652 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3804 != null) {
            var3 = "/p=" + Statics.field3804;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field655 + "/a=" + Statics.field1035 + var3 + "/";
    }

    @ObfuscatedName("ct.kb(Ljava/lang/String;I)V")
    public static void method1958(String arg0) {
        Statics.field3804 = arg0;
        try {
            String var1 = Statics.field555.getParameter(class286.field3674.field3681);
            String var2 = Statics.field555.getParameter(class286.field3675.field3681);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class200.method21(class192.method183() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field555;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("br.kv(Ljava/lang/String;ZI)V")
    public static void method1055(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3509; var5++) {
            class276 var6 = class276.method1049(var5);
            if ((!arg1 || var6.field3555) && var6.field3559 == -1 && var6.field3514.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2468 = -1;
                    Statics.field641 = null;
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
        Statics.field641 = var3;
        Statics.field115 = 0;
        Statics.field2468 = var4;
        String[] var9 = new String[Statics.field2468];
        for (int var10 = 0; var10 < Statics.field2468; var10++) {
            var9[var10] = class276.method1049(var3[var10]).field3514;
        }
        short[] var11 = Statics.field641;
        class187.method2070(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("kr.kh(Lgx;II)V")
    public static void method5229(class190 arg0, int arg1) {
        byte[] var2 = arg0.field2420;
        if (field689 == null) {
            field689 = new byte[24];
        }
        class201.method3796(var2, arg1, field689, 0, 24);
        if (class163.field2048 == null) {
            return;
        }
        try {
            class163.field2048.method2506(0L);
            class163.field2048.method2514(arg0.field2420, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("hn.ls(Lgx;I)V")
    public static void method4175(class190 arg0) {
        if (field689 != null) {
            arg0.method3449(field689, 0, field689.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class163.field2048.method2506(0L);
            class163.field2048.method2508(var1);
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
        arg0.method3449(var1, 0, var1.length);
    }

    @ObfuscatedName("client.ln(I)Lkx;")
    public class298 method1194() {
        return Statics.field187 == null ? null : Statics.field187.field619;
    }

    @ObfuscatedName("t.lf(B)Z")
    public static boolean method158() {
        return field678 >= 2;
    }

    @ObfuscatedName("iu.lo(II)V")
    public static void method4395(int arg0) {
        field724 = arg0;
    }

    @ObfuscatedName("bg.lk(I)V")
    public static void method1050() {
        field695.method2097(class180.method625(class177.field2257, field695.field1308));
        field724 = 0;
    }

    @ObfuscatedName("l.lg(I)V")
    public static void method163() {
        if (field724 == 1) {
            field846 = true;
        }
    }

    @ObfuscatedName("fc.lh(I)V")
    public static void method3355() {
        if (!field846 || Statics.field187 == null) {
            return;
        }
        int var0 = Statics.field187.field999[0];
        int var1 = Statics.field187.field996[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field726 = Statics.field187.field948;
        int var2 = method3376(Statics.field187.field948, Statics.field187.field949, Statics.field2219) - field725;
        if (var2 < Statics.field2539) {
            Statics.field2539 = var2;
        }
        Statics.field136 = Statics.field187.field949;
        field846 = false;
    }

    @ObfuscatedName("jn.la(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4602(String arg0) {
        class250[] var1 = class250.method245();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class250 var3 = var1[var2];
            if (var3.field3201 != -1 && arg0.startsWith(class81.method515(var3.field3201))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3201).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("gz.ly(I)V")
    public static void method3435() {
        if (Statics.field217 == null) {
            return;
        }
        field798 = field660;
        Statics.field217.method4569();
        for (int var0 = 0; var0 < field766.length; var0++) {
            if (field766[var0] != null) {
                Statics.field217.method4562((field766[var0].field948 >> 7) + Statics.field84, (field766[var0].field949 >> 7) + Statics.field30);
            }
        }
    }
}

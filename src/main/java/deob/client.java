package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class54 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field798 = new class173[4];

    @ObfuscatedName("client.at")
    public static boolean field803 = true;

    @ObfuscatedName("client.bx")
    public static int field856 = 1;

    @ObfuscatedName("client.bh")
    public static int field636 = 0;

    @ObfuscatedName("client.bm")
    public static int field791 = 0;

    @ObfuscatedName("client.bs")
    public static boolean field638 = false;

    @ObfuscatedName("client.bz")
    public static boolean field870 = false;

    @ObfuscatedName("client.be")
    public static int field839 = -1;

    @ObfuscatedName("client.bu")
    public static boolean field827 = false;

    @ObfuscatedName("client.bi")
    public static int field642 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field792 = true;

    @ObfuscatedName("client.cd")
    public static int field645 = 0;

    @ObfuscatedName("client.cy")
    public static long field646 = -1L;

    @ObfuscatedName("client.cb")
    public static int field647 = -1;

    @ObfuscatedName("client.cr")
    public static int field648 = -1;

    @ObfuscatedName("client.ct")
    public static long field649 = -1L;

    @ObfuscatedName("client.ci")
    public static boolean field650 = true;

    @ObfuscatedName("client.cu")
    public static boolean field651 = false;

    @ObfuscatedName("client.ce")
    public static int field652 = 0;

    @ObfuscatedName("client.cc")
    public static int field653 = 0;

    @ObfuscatedName("client.cl")
    public static int field875 = 0;

    @ObfuscatedName("client.cw")
    public static int field655 = 0;

    @ObfuscatedName("client.cq")
    public static int field656 = 0;

    @ObfuscatedName("client.ca")
    public static int field657 = 0;

    @ObfuscatedName("client.cf")
    public static int field658 = 0;

    @ObfuscatedName("client.cx")
    public static int field659 = 0;

    @ObfuscatedName("client.cm")
    public static int field681 = 0;

    @ObfuscatedName("client.ch")
    public static class85 field661 = class85.field1154;

    @ObfuscatedName("client.dt")
    public static class85 field662 = class85.field1154;

    @ObfuscatedName("client.dm")
    public static int field663 = 0;

    @ObfuscatedName("client.dy")
    public static int field679 = 0;

    @ObfuscatedName("client.de")
    public static int field665 = 0;

    @ObfuscatedName("client.ew")
    public static int field841 = 0;

    @ObfuscatedName("client.eq")
    public static int field669 = 0;

    @ObfuscatedName("client.er")
    public static int field670 = 0;

    @ObfuscatedName("client.eo")
    public static int field671 = 0;

    @ObfuscatedName("client.ee")
    public static int field672 = 0;

    @ObfuscatedName("client.ep")
    public static class161 field673 = class161.field1986;

    @ObfuscatedName("client.ev")
    public static boolean field674 = false;

    @ObfuscatedName("client.ez")
    public static class89 field675 = new class89();

    @ObfuscatedName("client.ed")
    public static byte[] field676 = null;

    @ObfuscatedName("client.et")
    public static class80[] field678 = new class80[32768];

    @ObfuscatedName("client.eb")
    public static int field733 = 0;

    @ObfuscatedName("client.fb")
    public static int[] field680 = new int[32768];

    @ObfuscatedName("client.fe")
    public static int field634 = 0;

    @ObfuscatedName("client.fd")
    public static int[] field682 = new int[250];

    @ObfuscatedName("client.fo")
    public static final class96 field668 = new class96();

    @ObfuscatedName("client.fq")
    public static int field684 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field731 = false;

    @ObfuscatedName("client.fv")
    public static boolean field686 = true;

    @ObfuscatedName("client.fm")
    public static class272 field889 = new class272();

    @ObfuscatedName("client.fa")
    public static HashMap field796 = new HashMap();

    @ObfuscatedName("client.fj")
    public static int field690 = 0;

    @ObfuscatedName("client.fx")
    public static int field691 = 1;

    @ObfuscatedName("client.fp")
    public static int field692 = 0;

    @ObfuscatedName("client.gv")
    public static int field693 = 1;

    @ObfuscatedName("client.gy")
    public static int field694 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field748 = false;

    @ObfuscatedName("client.gs")
    public static int[][][] field720 = new int[4][13][13];

    @ObfuscatedName("client.gm")
    public static final int[] field698 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gf")
    public static int field699 = 0;

    @ObfuscatedName("client.hh")
    public static int field700 = 2301979;

    @ObfuscatedName("client.ht")
    public static int field701 = 5063219;

    @ObfuscatedName("client.hk")
    public static int field702 = 3353893;

    @ObfuscatedName("client.hz")
    public static int field703 = 7759444;

    @ObfuscatedName("client.hl")
    public static boolean field704 = false;

    @ObfuscatedName("client.hb")
    public static int field660 = 0;

    @ObfuscatedName("client.hm")
    public static int field706 = 128;

    @ObfuscatedName("client.hu")
    public static int field640 = 0;

    @ObfuscatedName("client.hi")
    public static int field708 = 0;

    @ObfuscatedName("client.hx")
    public static int field709 = 0;

    @ObfuscatedName("client.hf")
    public static int field689 = 0;

    @ObfuscatedName("client.hd")
    public static int field711 = 0;

    @ObfuscatedName("client.hw")
    public static int field712 = 0;

    @ObfuscatedName("client.hj")
    public static int field867 = 50;

    @ObfuscatedName("client.hc")
    public static int field767 = 0;

    @ObfuscatedName("client.hp")
    public static int field715 = 0;

    @ObfuscatedName("client.ih")
    public static int field716 = 0;

    @ObfuscatedName("client.io")
    public static int field717 = 12;

    @ObfuscatedName("client.ib")
    public static int field718 = 6;

    @ObfuscatedName("client.im")
    public static int field719 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field880 = false;

    @ObfuscatedName("client.iq")
    public static int field721 = 0;

    @ObfuscatedName("client.ij")
    public static boolean field722 = false;

    @ObfuscatedName("client.is")
    public static int field723 = 0;

    @ObfuscatedName("client.ik")
    public static int field724 = 0;

    @ObfuscatedName("client.iu")
    public static int field725 = 50;

    @ObfuscatedName("client.iy")
    public static int[] field713 = new int[field725];

    @ObfuscatedName("client.ip")
    public static int[] field705 = new int[field725];

    @ObfuscatedName("client.iw")
    public static int[] field643 = new int[field725];

    @ObfuscatedName("client.id")
    public static int[] field729 = new int[field725];

    @ObfuscatedName("client.if")
    public static int[] field730 = new int[field725];

    @ObfuscatedName("client.ir")
    public static int[] field872 = new int[field725];

    @ObfuscatedName("client.ia")
    public static int[] field732 = new int[field725];

    @ObfuscatedName("client.iv")
    public static String[] field697 = new String[field725];

    @ObfuscatedName("client.it")
    public static String field770 = null;

    @ObfuscatedName("client.in")
    public static int[][] field734 = new int[104][104];

    @ObfuscatedName("client.il")
    public static int field735 = 0;

    @ObfuscatedName("client.ii")
    public static int field736 = -1;

    @ObfuscatedName("client.ic")
    public static int field728 = -1;

    @ObfuscatedName("client.js")
    public static int field737 = 0;

    @ObfuscatedName("client.jv")
    public static int field739 = 0;

    @ObfuscatedName("client.je")
    public static int field740 = 0;

    @ObfuscatedName("client.jt")
    public static int field741 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field742 = true;

    @ObfuscatedName("client.jf")
    public static int field751 = 0;

    @ObfuscatedName("client.jc")
    public static int field744 = 0;

    @ObfuscatedName("client.jp")
    public static int field822 = 0;

    @ObfuscatedName("client.jd")
    public static int field746 = 0;

    @ObfuscatedName("client.jo")
    public static int field747 = 0;

    @ObfuscatedName("client.jh")
    public static int field685 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field749 = false;

    @ObfuscatedName("client.jw")
    public static int field750 = 0;

    @ObfuscatedName("client.jb")
    public static int field635 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field752 = true;

    @ObfuscatedName("client.jm")
    public static class67[] field753 = new class67[2048];

    @ObfuscatedName("client.jq")
    public static int field797 = -1;

    @ObfuscatedName("client.jy")
    public static int field637 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field775 = true;

    @ObfuscatedName("client.ki")
    public static int field757 = 0;

    @ObfuscatedName("client.ko")
    public static int field641 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field759 = new int[1000];

    @ObfuscatedName("client.kn")
    public static final int[] field756 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kh")
    public static String[] field761 = new String[8];

    @ObfuscatedName("client.kb")
    public static boolean[] field882 = new boolean[8];

    @ObfuscatedName("client.kz")
    public static int[] field763 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kf")
    public static int field654 = -1;

    @ObfuscatedName("client.kl")
    public static class262[][][] field765 = new class262[4][104][104];

    @ObfuscatedName("client.ka")
    public static class262 field766 = new class262();

    @ObfuscatedName("client.kt")
    public static class262 field795 = new class262();

    @ObfuscatedName("client.kj")
    public static class262 field768 = new class262();

    @ObfuscatedName("client.km")
    public static int[] field726 = new int[25];

    @ObfuscatedName("client.ky")
    public static int[] field854 = new int[25];

    @ObfuscatedName("client.kd")
    public static int[] field771 = new int[25];

    @ObfuscatedName("client.kv")
    public static int field772 = 0;

    @ObfuscatedName("client.kg")
    public static boolean field773 = false;

    @ObfuscatedName("client.lw")
    public static int field774 = 0;

    @ObfuscatedName("client.ld")
    public static int[] field847 = new int[500];

    @ObfuscatedName("client.lb")
    public static int[] field776 = new int[500];

    @ObfuscatedName("client.ls")
    public static int[] field777 = new int[500];

    @ObfuscatedName("client.lq")
    public static int[] field778 = new int[500];

    @ObfuscatedName("client.ll")
    public static String[] field779 = new String[500];

    @ObfuscatedName("client.ln")
    public static String[] field780 = new String[500];

    @ObfuscatedName("client.lx")
    public static boolean[] field781 = new boolean[500];

    @ObfuscatedName("client.lm")
    public static boolean field782 = false;

    @ObfuscatedName("client.lp")
    public static boolean field871 = false;

    @ObfuscatedName("client.lf")
    public static boolean field868 = false;

    @ObfuscatedName("client.lo")
    public static boolean field785 = true;

    @ObfuscatedName("client.lh")
    public static int field786 = -1;

    @ObfuscatedName("client.lg")
    public static int field787 = -1;

    @ObfuscatedName("client.lj")
    public static int field788 = 0;

    @ObfuscatedName("client.la")
    public static int field789 = 50;

    @ObfuscatedName("client.lr")
    public static int field758 = 0;

    @ObfuscatedName("client.lz")
    public static boolean field816 = false;

    @ObfuscatedName("client.li")
    public static int field769 = -1;

    @ObfuscatedName("client.mp")
    public static int field794 = -1;

    @ObfuscatedName("client.mf")
    public static String field828 = null;

    @ObfuscatedName("client.mm")
    public static String field862 = null;

    @ObfuscatedName("client.mh")
    public static int field887 = -1;

    @ObfuscatedName("client.md")
    public static class318 field900 = new class318(8);

    @ObfuscatedName("client.mc")
    public static int field799 = 0;

    @ObfuscatedName("client.mz")
    public static int field825 = -1;

    @ObfuscatedName("client.ma")
    public static int field801 = 0;

    @ObfuscatedName("client.mr")
    public static int field874 = 0;

    @ObfuscatedName("client.mj")
    public static class218 field707 = null;

    @ObfuscatedName("client.mx")
    public static int field804 = 0;

    @ObfuscatedName("client.mo")
    public static int field805 = 0;

    @ObfuscatedName("client.my")
    public static int field806 = 0;

    @ObfuscatedName("client.mq")
    public static int field807 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field808 = false;

    @ObfuscatedName("client.ms")
    public static class218 field809 = null;

    @ObfuscatedName("client.mk")
    public static class218 field810 = null;

    @ObfuscatedName("client.me")
    public static class218 field811 = null;

    @ObfuscatedName("client.mb")
    public static int field812 = 0;

    @ObfuscatedName("client.mv")
    public static int field813 = 0;

    @ObfuscatedName("client.mw")
    public static class218 field814 = null;

    @ObfuscatedName("client.nm")
    public static boolean field815 = false;

    @ObfuscatedName("client.na")
    public static int field696 = -1;

    @ObfuscatedName("client.nl")
    public static int field817 = -1;

    @ObfuscatedName("client.nj")
    public static boolean field818 = false;

    @ObfuscatedName("client.nk")
    public static int field819 = -1;

    @ObfuscatedName("client.np")
    public static int field820 = -1;

    @ObfuscatedName("client.nc")
    public static boolean field793 = false;

    @ObfuscatedName("client.nt")
    public static int field727 = 1;

    @ObfuscatedName("client.nu")
    public static int[] field783 = new int[32];

    @ObfuscatedName("client.ne")
    public static int field824 = 0;

    @ObfuscatedName("client.no")
    public static int[] field821 = new int[32];

    @ObfuscatedName("client.nw")
    public static int field826 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field738 = new int[32];

    @ObfuscatedName("client.nd")
    public static int field802 = 0;

    @ObfuscatedName("client.nh")
    public static int field829 = 0;

    @ObfuscatedName("client.ng")
    public static int field745 = 0;

    @ObfuscatedName("client.nb")
    public static int field831 = 0;

    @ObfuscatedName("client.nn")
    public static int field832 = 0;

    @ObfuscatedName("client.nv")
    public static int field833 = 0;

    @ObfuscatedName("client.nq")
    public static int field834 = 0;

    @ObfuscatedName("client.on")
    public static int field835 = 0;

    @ObfuscatedName("client.oh")
    public static class262 field844 = new class262();

    @ObfuscatedName("client.os")
    public static class262 field837 = new class262();

    @ObfuscatedName("client.ob")
    public static class262 field764 = new class262();

    @ObfuscatedName("client.oq")
    public static class318 field891 = new class318(512);

    @ObfuscatedName("client.om")
    public static int field840 = 0;

    @ObfuscatedName("client.ol")
    public static int field639 = -2;

    @ObfuscatedName("client.ot")
    public static boolean[] field842 = new boolean[100];

    @ObfuscatedName("client.op")
    public static boolean[] field843 = new boolean[100];

    @ObfuscatedName("client.oi")
    public static boolean[] field848 = new boolean[100];

    @ObfuscatedName("client.oy")
    public static int[] field845 = new int[100];

    @ObfuscatedName("client.ov")
    public static int[] field846 = new int[100];

    @ObfuscatedName("client.oe")
    public static int[] field830 = new int[100];

    @ObfuscatedName("client.ow")
    public static int[] field710 = new int[100];

    @ObfuscatedName("client.oz")
    public static int field784 = 0;

    @ObfuscatedName("client.og")
    public static long field755 = 0L;

    @ObfuscatedName("client.ox")
    public static boolean field851 = true;

    @ObfuscatedName("client.ph")
    public static int[] field852 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pw")
    public static int field853 = 0;

    @ObfuscatedName("client.pa")
    public static int field800 = 0;

    @ObfuscatedName("client.pd")
    public static String field908 = "";

    @ObfuscatedName("client.pz")
    public static long[] field890 = new long[100];

    @ObfuscatedName("client.pr")
    public static int field857 = 0;

    @ObfuscatedName("client.pf")
    public static int field858 = 0;

    @ObfuscatedName("client.po")
    public static int[] field859 = new int[128];

    @ObfuscatedName("client.pm")
    public static int[] field860 = new int[128];

    @ObfuscatedName("client.pi")
    public static long field861 = -1L;

    @ObfuscatedName("client.pt")
    public static int field644 = -1;

    @ObfuscatedName("client.pv")
    public static int field863 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field855 = new int[1000];

    @ObfuscatedName("client.pu")
    public static int[] field823 = new int[1000];

    @ObfuscatedName("client.pg")
    public static class325[] field866 = new class325[1000];

    @ObfuscatedName("client.pl")
    public static int field865 = 0;

    @ObfuscatedName("client.px")
    public static int field790 = 0;

    @ObfuscatedName("client.qf")
    public static int field683 = 0;

    @ObfuscatedName("client.qi")
    public static int field762 = 255;

    @ObfuscatedName("client.qb")
    public static int field667 = -1;

    @ObfuscatedName("client.qr")
    public static boolean field760 = false;

    @ObfuscatedName("client.qj")
    public static int field873 = 127;

    @ObfuscatedName("client.qa")
    public static int field869 = 127;

    @ObfuscatedName("client.qm")
    public static int field850 = 0;

    @ObfuscatedName("client.qh")
    public static int[] field876 = new int[50];

    @ObfuscatedName("client.qw")
    public static int[] field877 = new int[50];

    @ObfuscatedName("client.qx")
    public static int[] field878 = new int[50];

    @ObfuscatedName("client.ql")
    public static int[] field879 = new int[50];

    @ObfuscatedName("client.qt")
    public static class102[] field664 = new class102[50];

    @ObfuscatedName("client.qz")
    public static boolean field849 = false;

    @ObfuscatedName("client.rm")
    public static boolean[] field836 = new boolean[5];

    @ObfuscatedName("client.rk")
    public static int[] field883 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field884 = new int[5];

    @ObfuscatedName("client.rh")
    public static int[] field885 = new int[5];

    @ObfuscatedName("client.rj")
    public static int[] field886 = new int[5];

    @ObfuscatedName("client.rt")
    public static short field881 = 256;

    @ObfuscatedName("client.re")
    public static short field888 = 205;

    @ObfuscatedName("client.rg")
    public static short field905 = 256;

    @ObfuscatedName("client.rp")
    public static short field754 = 320;

    @ObfuscatedName("client.ri")
    public static short field687 = 1;

    @ObfuscatedName("client.ra")
    public static short field892 = 32767;

    @ObfuscatedName("client.rd")
    public static short field893 = 1;

    @ObfuscatedName("client.rr")
    public static short field894 = 32767;

    @ObfuscatedName("client.rc")
    public static int field895 = 0;

    @ObfuscatedName("client.rb")
    public static int field896 = 0;

    @ObfuscatedName("client.rz")
    public static int field897 = 0;

    @ObfuscatedName("client.ro")
    public static int field898 = 0;

    @ObfuscatedName("client.rf")
    public static int field899 = 0;

    @ObfuscatedName("client.ru")
    public static class215 field743 = new class215();

    @ObfuscatedName("client.sl")
    public static int field901 = -1;

    @ObfuscatedName("client.sn")
    public static int field902 = -1;

    @ObfuscatedName("client.su")
    public static class330 field903 = new class329();

    @ObfuscatedName("client.sa")
    public static class10[] field904 = new class10[8];

    @ObfuscatedName("client.sx")
    public static class68 field695 = new class68();

    @ObfuscatedName("client.sj")
    public static int field906 = -1;

    @ObfuscatedName("client.si")
    public static ArrayList field907 = new ArrayList(10);

    @ObfuscatedName("client.se")
    public static int field714 = 0;

    @ObfuscatedName("client.sr")
    public static int field909 = 0;

    @ObfuscatedName("client.tb")
    public static final class66 field910 = new class66();

    @ObfuscatedName("client.tg")
    public static int[] field911 = new int[50];

    @ObfuscatedName("client.td")
    public static int[] field912 = new int[50];

    @ObfuscatedName("dr.ei(I)Lla;")
    public static class333 method2271() {
        return Statics.field481;
    }

    @ObfuscatedName("client.am(I)V")
    public final void method819() {
    }

    public final void init() {
        if (!this.method798()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field686 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1132)) {
                            field638 = true;
                        } else {
                            field638 = false;
                        }
                        break;
                    case 4:
                        if (field839 == -1) {
                            field839 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field636 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field112 = class191.method3295(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field1727 = class230.method2576(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1132)) {
                        }
                        break;
                    case 9:
                        Statics.field2391 = var2;
                        break;
                    case 10:
                        class231[] var3 = new class231[] { class231.field3093, class231.field3092, class231.field3086, class231.field3090, class231.field3088, class231.field3089 };
                        Statics.field102 = (class231) class196.method3185(var3, Integer.parseInt(var2));
                        if (Statics.field102 == class231.field3090) {
                            Statics.field275 = class338.field4031;
                        } else {
                            Statics.field275 = class338.field4033;
                        }
                        break;
                    case 12:
                        field856 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field219 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field791 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field151 = var2;
                }
            }
        }
        method125();
        Statics.field1979 = this.getCodeBase().getHost();
        String var4 = Statics.field1727.field3079;
        byte var5 = 0;
        try {
            Statics.field2024 = 21;
            Statics.field3762 = var5;
            try {
                Statics.field994 = System.getProperty("os.name");
            } catch (Exception var31) {
                Statics.field994 = "Unknown";
            }
            Statics.field1991 = Statics.field994.toLowerCase();
            try {
                Statics.field2029 = System.getProperty("user.home");
                if (Statics.field2029 != null) {
                    Statics.field2029 = Statics.field2029 + "/";
                }
            } catch (Exception var30) {
            }
            try {
                if (Statics.field1991.startsWith("win")) {
                    if (Statics.field2029 == null) {
                        Statics.field2029 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2029 == null) {
                    Statics.field2029 = System.getenv("HOME");
                }
                if (Statics.field2029 != null) {
                    Statics.field2029 = Statics.field2029 + "/";
                }
            } catch (Exception var29) {
            }
            if (Statics.field2029 == null) {
                Statics.field2029 = "~/";
            }
            Statics.field1949 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2029, "/tmp/", "" };
            Statics.field3538 = new String[] { ".jagex_cache_" + Statics.field3762, ".file_store_" + Statics.field3762 };
            label174: for (int var9 = 0; var9 < 4; var9++) {
                Statics.field632 = class168.method496("oldschool", var4, var9);
                if (!Statics.field632.exists()) {
                    Statics.field632.mkdirs();
                }
                File[] var10 = Statics.field632.listFiles();
                if (var10 == null) {
                    break;
                }
                File[] var11 = var10;
                int var12 = 0;
                while (true) {
                    if (var12 >= var11.length) {
                        break label174;
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
                    } catch (Exception var28) {
                        var16 = false;
                    }
                    if (!var16) {
                        break;
                    }
                    var12++;
                }
            }
            File var18 = Statics.field632;
            Statics.field2036 = var18;
            if (!Statics.field2036.exists()) {
                throw new RuntimeException("");
            }
            class170.field2034 = true;
            try {
                File var19 = new File(Statics.field2029, "random.dat");
                if (var19.exists()) {
                    class168.field2028 = new class342(new class343(var19, "rw", 25L), 24, 0);
                } else {
                    label151: for (int var20 = 0; var20 < Statics.field3538.length; var20++) {
                        for (int var21 = 0; var21 < Statics.field1949.length; var21++) {
                            File var22 = new File(Statics.field1949[var21] + Statics.field3538[var20] + File.separatorChar + "random.dat");
                            if (var22.exists()) {
                                class168.field2028 = new class342(new class343(var22, "rw", 25L), 24, 0);
                                break label151;
                            }
                        }
                    }
                }
                if (class168.field2028 == null) {
                    RandomAccessFile var23 = new RandomAccessFile(var19, "rw");
                    int var24 = var23.read();
                    var23.seek(0L);
                    var23.write(var24);
                    var23.seek(0L);
                    var23.close();
                    class168.field2028 = new class342(new class343(var19, "rw", 25L), 24, 0);
                }
            } catch (IOException var32) {
            }
            class168.field2027 = new class342(new class343(class170.method3066("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2020 = new class342(new class343(class170.method3066("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2329 = new class342[Statics.field2024];
            for (int var26 = 0; var26 < Statics.field2024; var26++) {
                Statics.field2329[var26] = new class342(new class343(class170.method3066("main_file_cache.idx" + var26), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var33) {
            class341.method511((String) null, var33);
        }
        Statics.field1710 = this;
        Statics.field3844 = field839;
        this.method796(765, 503, 184);
    }

    @ObfuscatedName("c.eg(B)V")
    public static final void method125() {
        class134.field1835 = false;
        field870 = false;
    }

    @ObfuscatedName("client.ar(B)V")
    public final void method809() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3710 = null;
            Statics.field3711 = null;
            Statics.field1138 = (byte[][][]) null;
        } else {
            Statics.field3710 = var1;
            Statics.field3711 = new int[var1.length];
            Statics.field1138 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3710.length; var3++) {
                Statics.field1138[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field3327 = field791 == 0 ? 43594 : field856 + 40000;
        Statics.field3753 = field791 == 0 ? 443 : field856 + 50000;
        Statics.field1117 = Statics.field3327;
        Statics.field3448 = class216.field2532;
        Statics.field2520 = class216.field2531;
        Statics.field2526 = class216.field2533;
        Statics.field391 = class216.field2530;
        Statics.field688 = new class144();
        this.method790();
        this.method791();
        Statics.field360 = this.method788();
        Statics.field95 = new class308(255, class168.field2027, class168.field2020, 500000);
        Statics.field3112 = class74.method4263();
        this.method870();
        String var5 = Statics.field307;
        class52.field410 = this;
        if (var5 != null) {
            class52.field407 = var5;
        }
        if (field791 != 0) {
            field651 = true;
        }
        method3059(Statics.field3112.field1039);
        Statics.field500 = new class75(Statics.field275);
    }

    @ObfuscatedName("client.ab(B)V")
    public final void method810() {
        field645++;
        this.method1156();
        while (true) {
            class262 var1 = class235.field3127;
            class232 var2;
            synchronized (class235.field3127) {
                var2 = (class232) class235.field3126.method4436();
            }
            if (var2 == null) {
                try {
                    if (class198.field2387 == 1) {
                        int var4 = Statics.field400.method3394();
                        if (var4 > 0 && Statics.field400.method3353()) {
                            int var5 = var4 - Statics.field2383;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field400.method3409(var5);
                        } else {
                            Statics.field400.method3415();
                            Statics.field400.method3340();
                            if (Statics.field2388 == null) {
                                class198.field2387 = 0;
                            } else {
                                class198.field2387 = 2;
                            }
                            Statics.field2389 = null;
                            Statics.field3627 = null;
                        }
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                    Statics.field400.method3415();
                    class198.field2387 = 0;
                    Statics.field2389 = null;
                    Statics.field3627 = null;
                    Statics.field2388 = null;
                }
                method506();
                class46 var7 = class46.field358;
                synchronized (class46.field358) {
                    class46.field385++;
                    class46.field379 = class46.field381;
                    class46.field362 = 0;
                    if (class46.field374 >= 0) {
                        while (class46.field374 != class46.field373) {
                            int var9 = class46.field366[class46.field373];
                            class46.field373 = class46.field373 + 1 & 0x7F;
                            if (var9 < 0) {
                                class46.field370[~var9] = false;
                            } else {
                                if (!class46.field370[var9] && class46.field362 < class46.field377.length - 1) {
                                    class46.field377[++class46.field362 - 1] = var9;
                                }
                                class46.field370[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class46.field370[var8] = false;
                        }
                        class46.field374 = class46.field373;
                    }
                    if (class46.field362 > 0) {
                        class46.field385 = 0;
                    }
                    class46.field381 = class46.field372;
                }
                Statics.method2694();
                if (Statics.field360 != null) {
                    int var11 = Statics.field360.method685();
                    field835 = var11;
                }
                if (field642 == 0) {
                    method3291();
                    class54.method279();
                } else if (field642 == 5) {
                    class86.method3264(this);
                    method3291();
                    class54.method279();
                } else if (field642 == 10 || field642 == 11) {
                    class86.method3264(this);
                } else if (field642 == 20) {
                    class86.method3264(this);
                    this.method1159();
                } else if (field642 == 25) {
                    method695();
                }
                if (field642 == 30) {
                    this.method1160();
                } else if (field642 == 40 || field642 == 45) {
                    this.method1159();
                }
                return;
            }
            var2.field3096.method3859(var2.field3098, (int) var2.field2094, var2.field3100, false);
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method811(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2387 == 2) {
                    if (Statics.field2389 == null) {
                        Statics.field2389 = class204.method3525(Statics.field2388, Statics.field2324, Statics.field401);
                        if (Statics.field2389 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field3627 == null) {
                        Statics.field3627 = new class109(Statics.field2390, Statics.field512);
                    }
                    if (Statics.field400.method3336(Statics.field2389, Statics.field2386, Statics.field3627, 22050)) {
                        Statics.field400.method3428();
                        Statics.field400.method3409(Statics.field1224);
                        Statics.field400.method3402(Statics.field2389, Statics.field152);
                        class198.field2387 = 0;
                        Statics.field2389 = null;
                        Statics.field3627 = null;
                        Statics.field2388 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field400.method3415();
                class198.field2387 = 0;
                Statics.field2389 = null;
                Statics.field3627 = null;
                Statics.field2388 = null;
            }
            var2 = false;
        }
        if (var2 && field760 && Statics.field2693 != null) {
            Statics.field2693.method2194();
        }
        if ((field642 == 10 || field642 == 20 || field642 == 30) && field755 != 0L && class297.method502() > field755) {
            method3059(method4052());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field842[var5] = true;
            }
        }
        if (field642 == 0) {
            this.method913(class86.field1167, class86.field1162, arg0);
        } else if (field642 == 5) {
            class86.method4056(Statics.field2079, Statics.field633, Statics.field3799);
        } else if (field642 == 10 || field642 == 11) {
            class86.method4056(Statics.field2079, Statics.field633, Statics.field3799);
        } else if (field642 == 20) {
            class86.method4056(Statics.field2079, Statics.field633, Statics.field3799);
        } else if (field642 == 25) {
            if (field694 == 1) {
                if (field690 > field691) {
                    field691 = field690;
                }
                int var6 = (field691 * 50 - field690 * 50) / field691;
                method369(class225.field2750 + class82.field1134 + class82.field1133 + var6 + "%" + class82.field1135, false);
            } else if (field694 == 2) {
                if (field692 > field693) {
                    field693 = field692;
                }
                int var7 = (field693 * 50 - field692 * 50) / field693 + 50;
                method369(class225.field2750 + class82.field1134 + class82.field1133 + var7 + "%" + class82.field1135, false);
            } else {
                method369(class225.field2750, false);
            }
        } else if (field642 == 30) {
            this.method1163();
        } else if (field642 == 40) {
            method369(class225.field2751 + class82.field1134 + class225.field2752, false);
        } else if (field642 == 45) {
            method369(class225.field2901, false);
        }
        if (field642 == 30 && field784 == 0 && !arg0 && !field851) {
            for (int var8 = 0; var8 < field840; var8++) {
                if (field843[var8]) {
                    Statics.field349.method767(field845[var8], field846[var8], field830[var8], field710[var8]);
                    field843[var8] = false;
                }
            }
        } else if (field642 > 0) {
            Statics.field349.method768(0, 0);
            for (int var9 = 0; var9 < field840; var9++) {
                field843[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.as(B)V")
    public final void method812() {
        if (Statics.field2385.method1963()) {
            Statics.field2385.method1958();
        }
        if (Statics.field235 != null) {
            Statics.field235.field581 = false;
        }
        Statics.field235 = null;
        field668.method2041();
        class46.method3313();
        class55.method1391();
        Statics.field360 = null;
        if (Statics.field2693 != null) {
            Statics.field2693.method2193();
        }
        if (Statics.field28 != null) {
            Statics.field28.method2193();
        }
        class237.method1864();
        class235.method2980();
        if (Statics.field688 != null) {
            Statics.field688.method2969();
            Statics.field688 = null;
        }
        class168.method2963();
    }

    @ObfuscatedName("bn.ej(II)V")
    public static void method1056(int arg0) {
        if (field642 == arg0) {
            return;
        }
        if (field642 == 0) {
            Statics.field1710.method868();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field669 = 0;
            field670 = 0;
            field671 = 0;
            field889.method4530(arg0);
            if (arg0 != 20) {
                method3718(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field252 != null) {
            Statics.field252.method3184();
            Statics.field252 = null;
        }
        if (field642 == 25) {
            field694 = 0;
            field690 = 0;
            field691 = 1;
            field692 = 0;
            field693 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method371(Statics.field666, Statics.field73, true, 0);
        } else if (arg0 == 20) {
            class86.method371(Statics.field666, Statics.field73, true, field642 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method371(Statics.field666, Statics.field73, false, 4);
        } else if (Statics.field1161) {
            Statics.field267 = null;
            Statics.field3852 = null;
            Statics.field1163 = null;
            Statics.field261 = null;
            Statics.field413 = null;
            Statics.field3656 = null;
            Statics.field1963 = null;
            Statics.field2373 = null;
            Statics.field351 = null;
            Statics.field523 = null;
            Statics.field2342 = null;
            Statics.field52 = null;
            Statics.field1867 = null;
            Statics.field1768 = null;
            Statics.field3776.method1636();
            class198.field2387 = 1;
            Statics.field2388 = null;
            Statics.field2324 = -1;
            Statics.field401 = -1;
            Statics.field1224 = 0;
            Statics.field152 = false;
            Statics.field2383 = 2;
            class237.method3550(true);
            Statics.field1161 = false;
        }
        field642 = arg0;
    }

    @ObfuscatedName("client.en(I)V")
    public void method1156() {
        if (field642 != 1000) {
            boolean var1 = class237.method3632();
            if (!var1) {
                this.method1380();
            }
        }
    }

    @ObfuscatedName("client.eh(I)V")
    public void method1380() {
        if (class237.field3158 >= 4) {
            this.method815("js5crc");
            field642 = 1000;
            return;
        }
        if (class237.field3159 >= 4) {
            if (field642 <= 5) {
                this.method815("js5io");
                field642 = 1000;
                return;
            }
            field665 = 3000;
            class237.field3159 = 3;
        }
        if (--field665 + 1 > 0) {
            return;
        }
        try {
            if (field679 == 0) {
                Statics.field1192 = Statics.field440.method3122(Statics.field1979, Statics.field1117);
                field679++;
            }
            if (field679 == 1) {
                if (Statics.field1192.field2005 == 2) {
                    this.method1158(-1);
                    return;
                }
                if (Statics.field1192.field2005 == 1) {
                    field679++;
                }
            }
            if (field679 == 2) {
                if (field686) {
                    Socket var1 = (Socket) Statics.field1192.field2001;
                    class306 var2 = new class306(var1, 40000, 5000);
                    Statics.field354 = var2;
                } else {
                    Statics.field354 = new class172((Socket) Statics.field1192.field2001, Statics.field440, 5000);
                }
                class300 var3 = new class300(5);
                var3.method5065(15);
                var3.method4977(184);
                Statics.field354.method3160(var3.field3699, 0, 5);
                field679++;
                Statics.field3176 = class297.method502();
            }
            if (field679 == 3) {
                if (Statics.field354.method3177() > 0 || !field686 && field642 <= 5) {
                    int var4 = Statics.field354.method3159();
                    if (var4 != 0) {
                        this.method1158(var4);
                        return;
                    }
                    field679++;
                } else if (class297.method502() - Statics.field3176 > 30000L) {
                    this.method1158(-2);
                    return;
                }
            }
            if (field679 == 4) {
                class237.method1874(Statics.field354, field642 > 20);
                Statics.field1192 = null;
                Statics.field354 = null;
                field679 = 0;
                field841 = 0;
            }
        } catch (IOException var6) {
            this.method1158(-3);
        }
    }

    @ObfuscatedName("client.em(IB)V")
    public void method1158(int arg0) {
        Statics.field1192 = null;
        Statics.field354 = null;
        field679 = 0;
        if (Statics.field3327 == Statics.field1117) {
            Statics.field1117 = Statics.field3753;
        } else {
            Statics.field1117 = Statics.field3327;
        }
        field841++;
        if (field841 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field642 <= 5) {
                this.method815("js5connect_full");
                field642 = 1000;
            } else {
                field665 = 3000;
            }
        } else if (field841 >= 2 && arg0 == 6) {
            this.method815("js5connect_outofdate");
            field642 = 1000;
        } else if (field841 >= 4) {
            if (field642 <= 5) {
                this.method815("js5connect");
                field642 = 1000;
            } else {
                field665 = 3000;
            }
        }
    }

    @ObfuscatedName("an.ev(Lie;Ljava/lang/String;I)V")
    public static void method590(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field907.add(var2);
        field909 += var2.field519;
    }

    @ObfuscatedName("y.ez(I)I")
    public static int method86() {
        if (field907 == null || field714 >= field907.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field714; var1++) {
            var0 += ((class59) field907.get(var1)).field520;
        }
        return var0 * 10000 / field909;
    }

    @ObfuscatedName("y.ec(IIB)V")
    public static void method77(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class131.field1747[var4];
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (field754 - field905) * var8 / 100 + field905;
            int var10 = var5 * var9 / 256;
            var2[var3] = var7 * var10 >> 16;
        }
        class134.method2816(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("gi.eu(I)V")
    public static void method3291() {
        if (field663 == 0) {
            Statics.field1304 = new class134(4, 104, 104, class56.field491);
            for (int var0 = 0; var0 < 4; var0++) {
                field798[var0] = new class173(104, 104);
            }
            Statics.field1074 = new class325(512, 512);
            class86.field1162 = class225.field2753;
            class86.field1167 = 5;
            field663 = 20;
        } else if (field663 == 20) {
            class86.field1162 = class225.field2754;
            class86.field1167 = 10;
            field663 = 30;
        } else if (field663 == 30) {
            Statics.field3 = method1883(0, false, true, true);
            Statics.field115 = method1883(1, false, true, true);
            Statics.field1866 = method1883(2, true, false, true);
            Statics.field1855 = method1883(3, false, true, true);
            Statics.field78 = method1883(4, false, true, true);
            Statics.field11 = method1883(5, true, true, true);
            Statics.field3047 = method1883(6, true, true, true);
            Statics.field2344 = method1883(7, false, true, true);
            Statics.field73 = method1883(8, false, true, true);
            Statics.field1153 = method1883(9, false, true, true);
            Statics.field666 = method1883(10, false, true, true);
            Statics.field3576 = method1883(11, false, true, true);
            Statics.field626 = method1883(12, false, true, true);
            Statics.field1633 = method1883(13, true, false, true);
            Statics.field321 = method1883(14, false, true, true);
            Statics.field1275 = method1883(15, false, true, true);
            Statics.field864 = method1883(17, true, true, true);
            Statics.field3216 = method1883(18, false, true, true);
            Statics.field233 = method1883(19, false, true, true);
            Statics.field335 = method1883(20, false, true, true);
            class86.field1162 = class225.field2803;
            class86.field1167 = 20;
            field663 = 40;
        } else if (field663 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field3.method3847() * 4 / 100;
            int var3 = var2 + Statics.field115.method3847() * 4 / 100;
            int var4 = var3 + Statics.field1866.method3847() * 2 / 100;
            int var5 = var4 + Statics.field1855.method3847() * 2 / 100;
            int var6 = var5 + Statics.field78.method3847() * 6 / 100;
            int var7 = var6 + Statics.field11.method3847() * 4 / 100;
            int var8 = var7 + Statics.field3047.method3847() * 2 / 100;
            int var9 = var8 + Statics.field2344.method3847() * 56 / 100;
            int var10 = var9 + Statics.field73.method3847() * 2 / 100;
            int var11 = var10 + Statics.field1153.method3847() * 2 / 100;
            int var12 = var11 + Statics.field666.method3847() * 2 / 100;
            int var13 = var12 + Statics.field3576.method3847() * 2 / 100;
            int var14 = var13 + Statics.field626.method3847() * 2 / 100;
            int var15 = var14 + Statics.field1633.method3847() * 2 / 100;
            int var16 = var15 + Statics.field321.method3847() * 2 / 100;
            int var17 = var16 + Statics.field1275.method3847() * 2 / 100;
            int var18 = var17 + Statics.field233.method3847() / 100;
            int var19 = var18 + Statics.field3216.method3847() / 100;
            int var20 = var19 + Statics.field335.method3847() / 100;
            int var21 = var20 + (Statics.field864.method3845() && Statics.field864.method3731() ? 1 : 0);
            if (var21 == 100) {
                method590(Statics.field3, "Animations");
                method590(Statics.field115, "Skeletons");
                method590(Statics.field78, "Sound FX");
                method590(Statics.field11, "Maps");
                method590(Statics.field3047, "Music Tracks");
                method590(Statics.field2344, "Models");
                method590(Statics.field73, "Sprites");
                method590(Statics.field3576, "Music Jingles");
                method590(Statics.field321, "Music Samples");
                method590(Statics.field1275, "Music Patches");
                method590(Statics.field233, "World Map");
                method590(Statics.field3216, "World Map Geography");
                method590(Statics.field335, "World Map Ground");
                Statics.field96 = new class312();
                Statics.field96.method5335(Statics.field864);
                class86.field1162 = class225.field2757;
                class86.field1167 = 30;
                field663 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1162 = class225.field2962 + var21 + "%";
                }
                class86.field1167 = 30;
            }
        } else if (field663 == 45) {
            boolean var22 = !field870;
            Statics.field1930 = 22050;
            Statics.field1385 = var22;
            Statics.field1144 = 2;
            class199 var23 = new class199();
            var23.method3395(9, 128);
            Statics.field2693 = class106.method137(Statics.field440, 0, 22050);
            Statics.field2693.method2190(var23);
            class236 var24 = Statics.field1275;
            class236 var25 = Statics.field321;
            class236 var26 = Statics.field78;
            Statics.field2386 = var24;
            Statics.field512 = var25;
            Statics.field2390 = var26;
            Statics.field400 = var23;
            Statics.field28 = class106.method137(Statics.field440, 1, 2048);
            Statics.field105 = new class99();
            Statics.field28.method2190(Statics.field105);
            Statics.field1077 = new class113(22050, Statics.field1930);
            class86.field1162 = class225.field2906;
            class86.field1167 = 35;
            field663 = 50;
            Statics.field1964 = new class293(Statics.field73, Statics.field1633);
        } else if (field663 == 50) {
            int var27 = class292.method4828().length;
            field796 = Statics.field1964.method4830(class292.method4828());
            if (field796.size() < var27) {
                class86.field1162 = class225.field2759 + field796.size() * 100 / var27 + "%";
                class86.field1167 = 40;
            } else {
                Statics.field633 = (class295) field796.get(class292.field3655);
                Statics.field3799 = (class295) field796.get(class292.field3647);
                Statics.field2079 = (class295) field796.get(class292.field3646);
                Statics.field3554 = field903.method5711();
                class86.field1162 = class225.field2989;
                class86.field1167 = 40;
                field663 = 60;
            }
        } else if (field663 == 60) {
            class236 var28 = Statics.field666;
            class236 var29 = Statics.field73;
            int var30 = 0;
            if (var28.method3728("title.jpg", "")) {
                var30++;
            }
            if (var29.method3728("logo", "")) {
                var30++;
            }
            if (var29.method3728("logo_deadman_mode", "")) {
                var30++;
            }
            if (var29.method3728("titlebox", "")) {
                var30++;
            }
            if (var29.method3728("titlebutton", "")) {
                var30++;
            }
            if (var29.method3728("runes", "")) {
                var30++;
            }
            if (var29.method3728("title_mute", "")) {
                var30++;
            }
            if (var29.method3728("options_radio_buttons,0", "")) {
                var30++;
            }
            if (var29.method3728("options_radio_buttons,2", "")) {
                var30++;
            }
            if (var29.method3728("options_radio_buttons,4", "")) {
                var30++;
            }
            if (var29.method3728("options_radio_buttons,6", "")) {
                var30++;
            }
            var29.method3728("sl_back", "");
            var29.method3728("sl_flags", "");
            var29.method3728("sl_arrows", "");
            var29.method3728("sl_stars", "");
            var29.method3728("sl_button", "");
            byte var33 = 11;
            if (var30 < var33) {
                class86.field1162 = class225.field2939 + var30 * 100 / var33 + "%";
                class86.field1167 = 50;
            } else {
                class86.field1162 = class225.field2762;
                class86.field1167 = 50;
                method1056(5);
                field663 = 70;
            }
        } else if (field663 == 70) {
            if (Statics.field1866.method3731()) {
                class236 var35 = Statics.field1866;
                Statics.field3494 = var35;
                class236 var36 = Statics.field1866;
                Statics.field3241 = var36;
                class236 var37 = Statics.field1866;
                class236 var38 = Statics.field2344;
                Statics.field3252 = var37;
                Statics.field631 = var38;
                Statics.field390 = Statics.field3252.method3738(3);
                class236 var39 = Statics.field1866;
                class236 var40 = Statics.field2344;
                boolean var41 = field870;
                Statics.field3337 = var39;
                Statics.field3338 = var40;
                class254.field3354 = var41;
                class236 var42 = Statics.field1866;
                class236 var43 = Statics.field2344;
                Statics.field3484 = var42;
                Statics.field3450 = var43;
                class236 var44 = Statics.field1866;
                Statics.field3294 = var44;
                class255.method522(Statics.field1866, Statics.field2344, field638, Statics.field633);
                class259.method1034(Statics.field1866, Statics.field3, Statics.field115);
                class236 var45 = Statics.field1866;
                class236 var46 = Statics.field2344;
                Statics.field88 = var45;
                Statics.field3222 = var46;
                class249.method139(Statics.field1866);
                class236 var47 = Statics.field1866;
                Statics.field3183 = var47;
                Statics.field3182 = Statics.field3183.method3738(16);
                class218.method1058(Statics.field1855, Statics.field2344, Statics.field73, Statics.field1633);
                class240.method697(Statics.field1866);
                class236 var48 = Statics.field1866;
                Statics.field3306 = var48;
                class236 var49 = Statics.field1866;
                Statics.field3215 = var49;
                class236 var50 = Statics.field1866;
                Statics.field3285 = var50;
                Statics.field2385 = new class91();
                class253.method366(Statics.field1866, Statics.field73, Statics.field1633);
                class247.method1001(Statics.field1866, Statics.field73);
                class236 var51 = Statics.field1866;
                class236 var52 = Statics.field73;
                Statics.field3197 = var52;
                if (var51.method3731()) {
                    Statics.field3202 = var51.method3738(35);
                    Statics.field3189 = new class242[Statics.field3202];
                    for (int var53 = 0; var53 < Statics.field3202; var53++) {
                        byte[] var54 = var51.method3726(35, var53);
                        Statics.field3189[var53] = new class242(var53);
                        if (var54 != null) {
                            Statics.field3189[var53].method3951(new class300(var54));
                            Statics.field3189[var53].method3946();
                        }
                    }
                }
                class86.field1162 = class225.field2764;
                class86.field1167 = 60;
                field663 = 80;
            } else {
                class86.field1162 = class225.field2763 + Statics.field1866.method3851() + "%";
                class86.field1167 = 60;
            }
        } else if (field663 == 80) {
            int var55 = 0;
            if (Statics.field1157 == null) {
                Statics.field1157 = class326.method4283(Statics.field73, Statics.field96.field3802, 0);
            } else {
                var55++;
            }
            if (Statics.field925 == null) {
                Statics.field925 = class326.method4283(Statics.field73, Statics.field96.field3798, 0);
            } else {
                var55++;
            }
            if (Statics.field89 == null) {
                Statics.field89 = class326.method4937(Statics.field73, Statics.field96.field3806, 0);
            } else {
                var55++;
            }
            if (Statics.field3293 == null) {
                Statics.field3293 = Statics.method734(Statics.field73, Statics.field96.field3800, 0);
            } else {
                var55++;
            }
            if (Statics.field249 == null) {
                Statics.field249 = Statics.method734(Statics.field73, Statics.field96.field3801, 0);
            } else {
                var55++;
            }
            if (Statics.field1308 == null) {
                Statics.field1308 = Statics.method734(Statics.field73, Statics.field96.field3797, 0);
            } else {
                var55++;
            }
            if (Statics.field1919 == null) {
                Statics.field1919 = Statics.method734(Statics.field73, Statics.field96.field3803, 0);
            } else {
                var55++;
            }
            if (Statics.field1927 == null) {
                Statics.field1927 = Statics.method734(Statics.field73, Statics.field96.field3804, 0);
            } else {
                var55++;
            }
            if (Statics.field81 == null) {
                Statics.field81 = Statics.method734(Statics.field73, Statics.field96.field3805, 0);
            } else {
                var55++;
            }
            if (Statics.field24 == null) {
                Statics.field24 = class326.method4937(Statics.field73, Statics.field96.field3808, 0);
            } else {
                var55++;
            }
            if (Statics.field94 == null) {
                Statics.field94 = class326.method4937(Statics.field73, Statics.field96.field3807, 0);
            } else {
                var55++;
            }
            if (var55 < 11) {
                class86.field1162 = class225.field2765 + var55 * 100 / 12 + "%";
                class86.field1167 = 70;
            } else {
                Statics.field3675 = Statics.field94;
                Statics.field925.method5546();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                Statics.field89[0].method5514(var56 + var59, var57 + var59, var58 + var59);
                class86.field1162 = class225.field2964;
                class86.field1167 = 70;
                field663 = 90;
            }
        } else if (field663 == 90) {
            if (Statics.field1153.method3731()) {
                Statics.field3140 = new class120(Statics.field1153, Statics.field73, 20, 0.8D, field870 ? 64 : 128);
                class131.method2703(Statics.field3140);
                class131.method2704(0.8D);
                field663 = 100;
            } else {
                class86.field1162 = class225.field2767 + "0%";
                class86.field1167 = 90;
            }
        } else if (field663 == 100) {
            int var60 = Statics.field3140.method2461();
            if (var60 < 100) {
                class86.field1162 = class225.field2767 + var60 + "%";
                class86.field1167 = 90;
            } else {
                class86.field1162 = class225.field2742;
                class86.field1167 = 90;
                field663 = 110;
            }
        } else if (field663 == 110) {
            Statics.field235 = new class64();
            Statics.field440.method3131(Statics.field235, 10);
            class86.field1162 = class225.field2769;
            class86.field1167 = 92;
            field663 = 120;
        } else if (field663 == 120) {
            if (Statics.field666.method3728("huffman", "")) {
                class210 var61 = new class210(Statics.field666.method3789("huffman", ""));
                Statics.field2502 = var61;
                class86.field1162 = class225.field2771;
                class86.field1167 = 94;
                field663 = 130;
            } else {
                class86.field1162 = class225.field2788 + "%";
                class86.field1167 = 94;
            }
        } else if (field663 == 130) {
            if (!Statics.field1855.method3731()) {
                class86.field1162 = class225.field2918 + Statics.field1855.method3851() * 4 / 5 + "%";
                class86.field1167 = 96;
            } else if (!Statics.field626.method3731()) {
                class86.field1162 = class225.field2918 + (80 + Statics.field626.method3851() / 6) + "%";
                class86.field1167 = 96;
            } else if (Statics.field1633.method3731()) {
                class86.field1162 = class225.field2805;
                class86.field1167 = 98;
                field663 = 140;
            } else {
                class86.field1162 = class225.field2918 + (96 + Statics.field1633.method3851() / 50) + "%";
                class86.field1167 = 96;
            }
        } else if (field663 == 140) {
            class86.field1167 = 100;
            if (Statics.field233.method3749(class36.field285.field289)) {
                if (Statics.field481 == null) {
                    Statics.field481 = new class333();
                    Statics.field481.method5804(Statics.field233, Statics.field3216, Statics.field335, Statics.field2079, field796, Statics.field89);
                }
                class86.field1162 = class225.field2973;
                field663 = 150;
            } else {
                class86.field1162 = class225.field2942 + Statics.field233.method3751(class36.field285.field289) / 10 + "%";
            }
        } else if (field663 == 150) {
            method1056(10);
        }
    }

    @ObfuscatedName("cn.ed(IZZZI)Lie;")
    public static class236 method1883(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2027 != null) {
            var4 = new class308(arg0, class168.field2027, Statics.field2329[arg0], 1000000);
        }
        return new class236(var4, Statics.field95, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ey(I)V")
    public final void method1159() {
        class305 var1 = field668.method2042();
        class299 var2 = field668.field1294;
        try {
            if (field669 == 0) {
                if (Statics.field1096 == null && (field675.method1932() || field670 > 250)) {
                    Statics.field1096 = field675.method1934();
                    field675.method1931();
                    field675 = null;
                }
                if (Statics.field1096 != null) {
                    if (var1 != null) {
                        var1.method3184();
                        var1 = null;
                    }
                    Statics.field2295 = null;
                    field731 = false;
                    field670 = 0;
                    field669 = 1;
                }
            }
            if (field669 == 1) {
                if (Statics.field2295 == null) {
                    Statics.field2295 = Statics.field440.method3122(Statics.field1979, Statics.field1117);
                }
                if (Statics.field2295.field2005 == 2) {
                    throw new IOException();
                }
                if (Statics.field2295.field2005 == 1) {
                    if (field686) {
                        Socket var3 = (Socket) Statics.field2295.field2001;
                        class306 var4 = new class306(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class172((Socket) Statics.field2295.field2001, Statics.field440, 5000);
                    }
                    field668.method2039(var1);
                    Statics.field2295 = null;
                    field669 = 2;
                }
            }
            if (field669 == 2) {
                field668.method2036();
                class188 var5 = class188.method2584();
                var5.field2315.method5065(class185.field2290.field2293);
                field668.method2040(var5);
                field668.method2037();
                var2.field3702 = 0;
                field669 = 3;
            }
            if (field669 == 3) {
                if (Statics.field2693 != null) {
                    Statics.field2693.method2191();
                }
                if (Statics.field28 != null) {
                    Statics.field28.method2191();
                }
                boolean var6 = true;
                if (field686 && !var1.method3156(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3159();
                    if (Statics.field2693 != null) {
                        Statics.field2693.method2191();
                    }
                    if (Statics.field28 != null) {
                        Statics.field28.method2191();
                    }
                    if (var7 != 0) {
                        method5308(var7);
                        return;
                    }
                    var2.field3702 = 0;
                    field669 = 4;
                }
            }
            if (field669 == 4) {
                if (var2.field3702 < 8) {
                    int var8 = var1.method3177();
                    if (var8 > 8 - var2.field3702) {
                        var8 = 8 - var2.field3702;
                    }
                    if (var8 > 0) {
                        var1.method3157(var2.field3699, var2.field3702, var8);
                        var2.field3702 += var8;
                    }
                }
                if (var2.field3702 == 8) {
                    var2.field3702 = 0;
                    Statics.field496 = var2.method4996();
                    field669 = 5;
                }
            }
            if (field669 == 5) {
                field668.field1294.field3702 = 0;
                field668.method2036();
                class299 var9 = new class299(500);
                int[] var10 = new int[] { Statics.field1096.nextInt(), Statics.field1096.nextInt(), Statics.field1096.nextInt(), Statics.field1096.nextInt() };
                var9.field3702 = 0;
                var9.method5065(1);
                var9.method4977(var10[0]);
                var9.method4977(var10[1]);
                var9.method4977(var10[2]);
                var9.method4977(var10[3]);
                var9.method4979(Statics.field496);
                if (field642 == 40) {
                    var9.method4977(Statics.field2483[0]);
                    var9.method4977(Statics.field2483[1]);
                    var9.method4977(Statics.field2483[2]);
                    var9.method4977(Statics.field2483[3]);
                } else {
                    var9.method5065(field673.method25());
                    switch(field673.field1985) {
                        case 0:
                        case 1:
                            var9.method5194(Statics.field2306);
                            var9.field3702++;
                            break;
                        case 2:
                            var9.field3702 += 4;
                            break;
                        case 3:
                            var9.method4977((Integer) Statics.field3112.field1042.get(class291.method4780(class86.field1181)));
                    }
                    var9.method5065(class313.field3819.method25());
                    var9.method4981(class86.field1179);
                }
                var9.method5012(class84.field1149, class84.field1150);
                Statics.field2483 = var10;
                class188 var11 = class188.method2584();
                var11.field2315.field3702 = 0;
                if (field642 == 40) {
                    var11.field2315.method5065(class185.field2291.field2293);
                } else {
                    var11.field2315.method5065(class185.field2288.field2293);
                }
                var11.field2315.method4975(0);
                int var12 = var11.field2315.field3702;
                var11.field2315.method4977(184);
                var11.field2315.method4977(1);
                var11.field2315.method5065(field839);
                var11.field2315.method4984(var9.field3699, 0, var9.field3702);
                int var13 = var11.field2315.field3702;
                var11.field2315.method4981(class86.field1181);
                var11.field2315.method5065((field851 ? 1 : 0) << 1 | (field870 ? 1 : 0));
                var11.field2315.method4975(Statics.field1578);
                var11.field2315.method4975(Statics.field1904);
                class299 var14 = var11.field2315;
                if (field676 == null) {
                    byte[] var15 = new byte[24];
                    try {
                        class168.field2028.method5953(0L);
                        class168.field2028.method5962(var15);
                        int var16;
                        for (var16 = 0; var16 < 24 && var15[var16] == 0; var16++) {
                        }
                        if (var16 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var57) {
                        for (int var18 = 0; var18 < 24; var18++) {
                            var15[var18] = -1;
                        }
                    }
                    var14.method4984(var15, 0, var15.length);
                } else {
                    var14.method4984(field676, 0, field676.length);
                }
                var11.field2315.method4981(Statics.field2391);
                var11.field2315.method4977(Statics.field219);
                class300 var21 = new class300(Statics.field3554.method5723());
                Statics.field3554.method5722(var21);
                var11.field2315.method4984(var21.field3699, 0, var21.field3699.length);
                var11.field2315.method5065(field839);
                var11.field2315.method4977(0);
                var11.field2315.method4977(Statics.field3.field3119);
                var11.field2315.method4977(Statics.field115.field3119);
                var11.field2315.method4977(Statics.field1866.field3119);
                var11.field2315.method4977(Statics.field1855.field3119);
                var11.field2315.method4977(Statics.field78.field3119);
                var11.field2315.method4977(Statics.field11.field3119);
                var11.field2315.method4977(Statics.field3047.field3119);
                var11.field2315.method4977(Statics.field2344.field3119);
                var11.field2315.method4977(Statics.field73.field3119);
                var11.field2315.method4977(Statics.field1153.field3119);
                var11.field2315.method4977(Statics.field666.field3119);
                var11.field2315.method4977(Statics.field3576.field3119);
                var11.field2315.method4977(Statics.field626.field3119);
                var11.field2315.method4977(Statics.field1633.field3119);
                var11.field2315.method4977(Statics.field321.field3119);
                var11.field2315.method4977(Statics.field1275.field3119);
                var11.field2315.method4977(0);
                var11.field2315.method4977(Statics.field864.field3119);
                var11.field2315.method4977(Statics.field3216.field3119);
                var11.field2315.method4977(Statics.field233.field3119);
                var11.field2315.method4977(Statics.field335.field3119);
                var11.field2315.method5129(var10, var13, var11.field2315.field3702);
                var11.field2315.method4986(var11.field2315.field3702 - var12);
                field668.method2040(var11);
                field668.method2037();
                field668.field1293 = new class328(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method4939(var22);
                field669 = 6;
            }
            if (field669 == 6 && var1.method3177() > 0) {
                int var24 = var1.method3159();
                if (var24 == 21 && field642 == 20) {
                    field669 = 9;
                } else if (var24 == 2) {
                    field669 = 11;
                } else if (var24 == 15 && field642 == 40) {
                    field668.field1296 = -1;
                    field669 = 16;
                } else if (var24 == 64) {
                    field669 = 7;
                } else if (var24 == 23 && field671 < 1) {
                    field671++;
                    field669 = 0;
                } else if (var24 == 29) {
                    field669 = 14;
                } else {
                    method5308(var24);
                    return;
                }
            }
            if (field669 == 7 && var1.method3177() > 0) {
                Statics.field593 = var1.method3159();
                field669 = 8;
            }
            if (field669 == 8 && var1.method3177() >= Statics.field593) {
                var1.method3157(var2.field3699, 0, Statics.field593);
                var2.field3702 = 0;
                field669 = 6;
            }
            if (field669 == 9 && var1.method3177() > 0) {
                field672 = (var1.method3159() + 3) * 60;
                field669 = 10;
            }
            if (field669 == 10) {
                field670 = 0;
                class86.method3714(class225.field3019, class225.field2977, field672 / 60 + class225.field2783);
                if (--field672 <= 0) {
                    field669 = 0;
                }
            } else {
                if (field669 == 11 && var1.method3177() >= 1) {
                    Statics.field1013 = var1.method3159();
                    field669 = 12;
                }
                if (field669 == 12 && var1.method3177() >= Statics.field1013) {
                    boolean var25 = var1.method3159() == 1;
                    var1.method3157(var2.field3699, 0, 4);
                    var2.field3702 = 0;
                    boolean var26 = false;
                    if (var25) {
                        int var27 = var2.method4942() << 24;
                        int var28 = var27 | var2.method4942() << 16;
                        int var29 = var28 | var2.method4942() << 8;
                        int var30 = var29 | var2.method4942();
                        int var31 = class291.method4780(class86.field1181);
                        if (Statics.field3112.field1042.size() >= 10 && !Statics.field3112.field1042.containsKey(var31)) {
                            Iterator var32 = Statics.field3112.field1042.entrySet().iterator();
                            var32.next();
                            var32.remove();
                        }
                        Statics.field3112.field1042.put(var31, var30);
                    }
                    if (field674) {
                        Statics.field3112.field1035 = class86.field1181;
                    } else {
                        Statics.field3112.field1035 = null;
                    }
                    class74.method3302();
                    field806 = var1.method3159();
                    field808 = var1.method3159() == 1;
                    field797 = var1.method3159();
                    field797 <<= 0x8;
                    field797 += var1.method3159();
                    field637 = var1.method3159();
                    var1.method3157(var2.field3699, 0, 1);
                    var2.field3702 = 0;
                    class183[] var33 = class183.method2066();
                    int var34 = var2.method4968();
                    if (var34 < 0 || var34 >= var33.length) {
                        throw new IOException(var34 + " " + var2.field3702);
                    }
                    field668.field1295 = var33[var34];
                    field668.field1296 = field668.field1295.field2109;
                    var1.method3157(var2.field3699, 0, 2);
                    var2.field3702 = 0;
                    field668.field1296 = var2.method4992();
                    try {
                        class48.method725(Statics.field1710, "zap");
                    } catch (Throwable var56) {
                    }
                    field669 = 13;
                }
                if (field669 != 13) {
                    if (field669 == 14 && var1.method3177() >= 2) {
                        var2.field3702 = 0;
                        var1.method3157(var2.field3699, 0, 2);
                        var2.field3702 = 0;
                        Statics.field330 = var2.method4992();
                        field669 = 15;
                    }
                    if (field669 == 15 && var1.method3177() >= Statics.field330) {
                        var2.field3702 = 0;
                        var1.method3157(var2.field3699, 0, Statics.field330);
                        var2.field3702 = 0;
                        String var47 = var2.method4999();
                        String var48 = var2.method4999();
                        String var49 = var2.method4999();
                        class86.method3714(var47, var48, var49);
                        method1056(10);
                    }
                    if (field669 == 16) {
                        if (field668.field1296 == -1) {
                            if (var1.method3177() < 2) {
                                return;
                            }
                            var1.method3157(var2.field3699, 0, 2);
                            var2.field3702 = 0;
                            field668.field1296 = var2.method4992();
                        }
                        if (var1.method3177() >= field668.field1296) {
                            var1.method3157(var2.field3699, 0, field668.field1296);
                            var2.field3702 = 0;
                            int var50 = field668.field1296;
                            field889.method4533();
                            field668.method2036();
                            field668.field1294.field3702 = 0;
                            field668.field1295 = null;
                            field668.field1301 = null;
                            field668.field1292 = null;
                            field668.field1302 = null;
                            field668.field1296 = 0;
                            field668.field1298 = 0;
                            field652 = 0;
                            method1049();
                            field683 = 0;
                            field865 = 0;
                            for (int var51 = 0; var51 < 2048; var51++) {
                                field753[var51] = null;
                            }
                            Statics.field2737 = null;
                            for (int var52 = 0; var52 < field678.length; var52++) {
                                class80 var53 = field678[var52];
                                if (var53 != null) {
                                    var53.field956 = -1;
                                    var53.field951 = false;
                                }
                            }
                            class60.method4822();
                            method1056(30);
                            for (int var54 = 0; var54 < 100; var54++) {
                                field842[var54] = true;
                            }
                            method3570();
                            class90.method1882(var2);
                            if (var2.field3702 != var50) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field670++;
                        if (field670 > 2000) {
                            if (field671 < 1) {
                                if (Statics.field3327 == Statics.field1117) {
                                    Statics.field1117 = Statics.field3753;
                                } else {
                                    Statics.field1117 = Statics.field3327;
                                }
                                field671++;
                                field669 = 0;
                            } else {
                                method5308(-3);
                            }
                        }
                    }
                } else if (var1.method3177() >= field668.field1296) {
                    var2.field3702 = 0;
                    var1.method3157(var2.field3699, 0, field668.field1296);
                    field889.method4531();
                    field646 = -1L;
                    Statics.field235.field575 = 0;
                    Statics.field2015 = true;
                    field650 = true;
                    field861 = -1L;
                    class97.field1306 = new class261();
                    field668.method2036();
                    field668.field1294.field3702 = 0;
                    field668.field1295 = null;
                    field668.field1301 = null;
                    field668.field1292 = null;
                    field668.field1302 = null;
                    field668.field1296 = 0;
                    field668.field1298 = 0;
                    field652 = 0;
                    field684 = 0;
                    field653 = 0;
                    method1049();
                    class55.field460 = 0;
                    class92.method285();
                    field758 = 0;
                    field816 = false;
                    field850 = 0;
                    field640 = 0;
                    field712 = 0;
                    Statics.field3087 = null;
                    field683 = 0;
                    field644 = -1;
                    field865 = 0;
                    field790 = 0;
                    field661 = class85.field1154;
                    field662 = class85.field1154;
                    field733 = 0;
                    class90.method1676();
                    for (int var36 = 0; var36 < 2048; var36++) {
                        field753[var36] = null;
                    }
                    for (int var37 = 0; var37 < 32768; var37++) {
                        field678[var37] = null;
                    }
                    field654 = -1;
                    field795.method4432();
                    field768.method4432();
                    for (int var38 = 0; var38 < 4; var38++) {
                        for (int var39 = 0; var39 < 104; var39++) {
                            for (int var40 = 0; var40 < 104; var40++) {
                                field765[var38][var39][var40] = null;
                            }
                        }
                    }
                    field766 = new class262();
                    Statics.field500.method1682();
                    for (int var41 = 0; var41 < Statics.field3182; var41++) {
                        class241 var42 = class241.method266(var41);
                        if (var42 != null) {
                            class213.field2509[var41] = 0;
                            class213.field2511[var41] = 0;
                        }
                    }
                    Statics.field2385.method1959();
                    field807 = -1;
                    if (field887 != -1) {
                        class218.method1036(field887);
                    }
                    for (class62 var43 = (class62) field900.method5395(); var43 != null; var43 = (class62) field900.method5392()) {
                        method4826(var43, true);
                    }
                    field887 = -1;
                    field900 = new class318(8);
                    field707 = null;
                    method1049();
                    field743.method3625((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var44 = 0; var44 < 8; var44++) {
                        field761[var44] = null;
                        field882[var44] = false;
                    }
                    class60.method4822();
                    field792 = true;
                    for (int var45 = 0; var45 < 100; var45++) {
                        field842[var45] = true;
                    }
                    method3570();
                    Statics.field2513 = null;
                    for (int var46 = 0; var46 < 8; var46++) {
                        field904[var46] = new class10();
                    }
                    Statics.field1227 = null;
                    class90.method1882(var2);
                    Statics.field2132 = -1;
                    method3717(false, var2);
                    field668.field1295 = null;
                }
            }
        } catch (IOException var58) {
            if (field671 < 1) {
                if (Statics.field3327 == Statics.field1117) {
                    Statics.field1117 = Statics.field3753;
                } else {
                    Statics.field1117 = Statics.field3327;
                }
                field671++;
                field669 = 0;
            } else {
                method5308(-2);
            }
        }
    }

    @ObfuscatedName("kg.el(II)V")
    public static void method5308(int arg0) {
        if (arg0 == -3) {
            class86.method3714(class225.field2860, class225.field2785, class225.field2786);
        } else if (arg0 == -2) {
            class86.method3714(class225.field2798, class225.field2813, class225.field2789);
        } else if (arg0 == -1) {
            class86.method3714(class225.field2858, class225.field3026, class225.field2792);
        } else if (arg0 == 3) {
            class86.field1173 = 3;
            class86.field1172 = 1;
        } else if (arg0 == 4) {
            class86.field1173 = 12;
            class86.field1175 = 0;
        } else if (arg0 == 5) {
            class86.field1172 = 2;
            class86.method3714(class225.field2743, class225.field2797, class225.field2952);
        } else if (arg0 == 68 || !(field827 || arg0 != 6)) {
            class86.method3714(class225.field2799, class225.field2800, class225.field2801);
        } else if (arg0 == 7) {
            class86.method3714(class225.field2998, class225.field2787, class225.field2804);
        } else if (arg0 == 8) {
            class86.method3714(class225.field3002, class225.field2873, class225.field2807);
        } else if (arg0 == 9) {
            class86.method3714(class225.field2935, class225.field2809, class225.field2810);
        } else if (arg0 == 10) {
            class86.method3714(class225.field2987, class225.field2773, class225.field2990);
        } else if (arg0 == 11) {
            class86.method3714(class225.field2814, class225.field2816, class225.field2945);
        } else if (arg0 == 12) {
            class86.method3714(class225.field2817, class225.field2818, class225.field2819);
        } else if (arg0 == 13) {
            class86.method3714(class225.field2820, class225.field2821, class225.field2970);
        } else if (arg0 == 14) {
            class86.method3714(class225.field2766, class225.field2824, class225.field2825);
        } else if (arg0 == 16) {
            class86.method3714(class225.field3042, class225.field2894, class225.field2828);
        } else if (arg0 == 17) {
            class86.method3714(class225.field2829, class225.field2830, class225.field2831);
        } else if (arg0 == 18) {
            class86.field1173 = 12;
            class86.field1175 = 1;
        } else if (arg0 == 19) {
            class86.method3714(class225.field2835, class225.field2836, class225.field3040);
        } else if (arg0 == 20) {
            class86.method3714(class225.field2838, class225.field2839, class225.field2840);
        } else if (arg0 == 22) {
            class86.method3714(class225.field2796, class225.field2994, class225.field2843);
        } else if (arg0 == 23) {
            class86.method3714(class225.field2844, class225.field2845, class225.field2846);
        } else if (arg0 == 24) {
            class86.method3714(class225.field2847, class225.field2848, class225.field2851);
        } else if (arg0 == 25) {
            class86.method3714(class225.field2791, class225.field2924, class225.field2852);
        } else if (arg0 == 26) {
            class86.method3714(class225.field2866, class225.field2854, class225.field3039);
        } else if (arg0 == 27) {
            class86.method3714(class225.field2856, class225.field2857, class225.field2756);
        } else if (arg0 == 31) {
            class86.method3714(class225.field2865, class225.field2770, class225.field2867);
        } else if (arg0 == 32) {
            class86.method3714(class225.field2868, class225.field2869, class225.field2870);
        } else if (arg0 == 37) {
            class86.method3714(class225.field2871, class225.field2872, class225.field2815);
        } else if (arg0 == 38) {
            class86.method3714(class225.field2874, class225.field2823, class225.field2827);
        } else if (arg0 == 55) {
            class86.field1173 = 8;
        } else if (arg0 == 56) {
            class86.method3714(class225.field2940, class225.field2882, class225.field2954);
            method1056(11);
            return;
        } else if (arg0 == 57) {
            class86.method3714(class225.field2884, class225.field2885, class225.field2886);
            method1056(11);
            return;
        } else if (arg0 == 61) {
            class86.field1173 = 7;
        } else {
            class86.method3714(class225.field2841, class225.field2747, class225.field2889);
        }
        method1056(10);
    }

    @ObfuscatedName("ce.ea(I)V")
    public static final void method2021() {
        field668.method2041();
        method273();
        Statics.field1304.method2808();
        for (int var0 = 0; var0 < 4; var0++) {
            field798[var0].method3209();
        }
        System.gc();
        class198.field2387 = 1;
        Statics.field2388 = null;
        Statics.field2324 = -1;
        Statics.field401 = -1;
        Statics.field1224 = 0;
        Statics.field152 = false;
        Statics.field2383 = 2;
        field667 = -1;
        field760 = false;
        class76.method3258();
        method1056(10);
    }

    @ObfuscatedName("ix.et(II)V")
    public static final void method4348(int arg0) {
        method2021();
        switch(arg0) {
            case 1:
                class86.field1173 = 24;
                class86.method3714(class225.field2978, class225.field2979, class225.field2980);
                break;
            case 2:
                class86.method39();
        }
    }

    @ObfuscatedName("d.eb(I)V")
    public static final void method273() {
        class258.field3498.method2995();
        class245.field3233.method2995();
        class246.field3243.method2995();
        class254.field3339.method2995();
        class254.field3372.method2995();
        class254.field3340.method2995();
        class254.field3342.method2995();
        class257.field3451.method2995();
        class257.field3452.method2995();
        class255.method1037();
        class259.field3517.method2995();
        class259.field3503.method2995();
        class244.method3701();
        class249.field3281.method2995();
        class241.method3515();
        class253.method69();
        class247.field3255.method2995();
        class247.field3258.method2995();
        class251.field3292.method2995();
        class250.method2481();
        class242.field3191.method2995();
        class215.method5341();
        class218.field2540.method2995();
        class218.field2609.method2995();
        class218.field2542.method2995();
        class218.field2627.method2995();
        ((class120) Statics.field1752).method2467();
        class93.field1266.method2995();
        Statics.field3.method3742();
        Statics.field115.method3742();
        Statics.field1855.method3742();
        Statics.field78.method3742();
        Statics.field11.method3742();
        Statics.field3047.method3742();
        Statics.field2344.method3742();
        Statics.field73.method3742();
        Statics.field1153.method3742();
        Statics.field666.method3742();
        Statics.field3576.method3742();
        Statics.field626.method3742();
    }

    @ObfuscatedName("bn.fb(I)V")
    public static final void method1057() {
        if (field684 > 0) {
            method2021();
        } else {
            field889.method4529();
            method1056(40);
            Statics.field252 = field668.method2042();
            field668.method2055();
        }
    }

    @ObfuscatedName("hj.fe(ZI)V")
    public static final void method3718(boolean arg0) {
        if (arg0) {
            field673 = class86.field1184 ? class161.field1977 : class161.field1978;
        } else {
            field673 = Statics.field3112.field1042.containsKey(class291.method4780(class86.field1181)) ? class161.field1980 : class161.field1986;
        }
    }

    @ObfuscatedName("client.fd(I)V")
    public final void method1160() {
        if (field652 > 1) {
            field652--;
        }
        if (field684 > 0) {
            field684--;
        }
        if (field731) {
            field731 = false;
            method1057();
            return;
        }
        if (!field773) {
            method718();
        }
        for (int var1 = 0; var1 < 100 && this.method1431(field668); var1++) {
        }
        if (field642 != 30) {
            return;
        }
        while (true) {
            class98 var2 = (class98) class97.field1306.method4385();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field889.field3564) {
                    class188 var6 = class188.method1039(class184.field2188, field668.field1293);
                    var6.field2315.method5065(0);
                    int var7 = var6.field2315.field3702;
                    field889.method4534(var6.field2315);
                    var6.field2315.method4987(var6.field2315.field3702 - var7);
                    field668.method2040(var6);
                    field889.method4532();
                }
                Object var8 = Statics.field235.field574;
                synchronized (Statics.field235.field574) {
                    if (!field803) {
                        Statics.field235.field575 = 0;
                    } else if (class55.field473 != 0 || Statics.field235.field575 >= 40) {
                        class188 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field235.field575 && (var9 == null || var9.field2315.field3702 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field235.field577[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field235.field576[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field647 != var16 || field648 != var15) {
                                if (var9 == null) {
                                    var9 = class188.method1039(class184.field2189, field668.field1293);
                                    var9.field2315.method5065(0);
                                    var10 = var9.field2315.field3702;
                                    var9.field2315.field3702 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field649 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field647;
                                    var18 = var15 - field648;
                                    var19 = (int) ((Statics.field235.field578[var14] - field649) / 20L);
                                    var12 = (int) ((Statics.field235.field578[var14] - field649) % 20L + (long) var12);
                                }
                                field647 = var16;
                                field648 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2315.method4975((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2315.method5065(var19 + 128);
                                    var9.field2315.method4975((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2315.method5065(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2315.method4977(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2315.method4977(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2315.method4975((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2315.method4977(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2315.method4977(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field649 = Statics.field235.field578[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2315.method4987(var9.field2315.field3702 - var10);
                            int var20 = var9.field2315.field3702;
                            var9.field2315.field3702 = var10;
                            var9.field2315.method5065(var12 / var13);
                            var9.field2315.method5065(var12 % var13);
                            var9.field2315.field3702 = var20;
                            field668.method2040(var9);
                        }
                        if (var11 >= Statics.field235.field575) {
                            Statics.field235.field575 = 0;
                        } else {
                            Statics.field235.field575 -= var11;
                            System.arraycopy(Statics.field235.field576, var11, Statics.field235.field576, 0, Statics.field235.field575);
                            System.arraycopy(Statics.field235.field577, var11, Statics.field235.field577, 0, Statics.field235.field575);
                            System.arraycopy(Statics.field235.field578, var11, Statics.field235.field578, 0, Statics.field235.field575);
                        }
                    }
                }
                if (class55.field473 == 1 || !Statics.field183 && class55.field473 == 4 || class55.field473 == 2) {
                    long var22 = (class55.field464 - field646) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field646 = class55.field464;
                    int var24 = class55.field475;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field1904) {
                        var24 = Statics.field1904;
                    }
                    int var25 = class55.field474;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1578) {
                        var25 = Statics.field1578;
                    }
                    int var26 = (int) var22;
                    class188 var27 = class188.method1039(class184.field2211, field668.field1293);
                    var27.field2315.method4975((class55.field473 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2315.method4975(var25);
                    var27.field2315.method4975(var24);
                    field668.method2040(var27);
                }
                if (class46.field362 > 0) {
                    class188 var28 = class188.method1039(class184.field2225, field668.field1293);
                    var28.field2315.method4975(0);
                    int var29 = var28.field2315.field3702;
                    long var30 = class297.method502();
                    for (int var32 = 0; var32 < class46.field362; var32++) {
                        long var33 = var30 - field861;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field861 = var30;
                        var28.field2315.method5033((int) var33);
                        var28.field2315.method5009(class46.field377[var32]);
                    }
                    var28.field2315.method4986(var28.field2315.field3702 - var29);
                    field668.method2040(var28);
                }
                if (field721 > 0) {
                    field721--;
                }
                if (class46.field370[96] || class46.field370[97] || class46.field370[98] || class46.field370[99]) {
                    field722 = true;
                }
                if (field722 && field721 <= 0) {
                    field721 = 20;
                    field722 = false;
                    class188 var35 = class188.method1039(class184.field2210, field668.field1293);
                    var35.field2315.method5026(field706);
                    var35.field2315.method5024(field640);
                    field668.method2040(var35);
                }
                if (Statics.field2015 && !field650) {
                    field650 = true;
                    class188 var36 = class188.method1039(class184.field2187, field668.field1293);
                    var36.field2315.method5065(1);
                    field668.method2040(var36);
                }
                if (!Statics.field2015 && field650) {
                    field650 = false;
                    class188 var37 = class188.method1039(class184.field2187, field668.field1293);
                    var37.field2315.method5065(0);
                    field668.method2040(var37);
                }
                if (Statics.field481 != null) {
                    Statics.field481.method5791();
                }
                if (Statics.field76) {
                    if (Statics.field2513 != null) {
                        Statics.field2513.method4608();
                    }
                    method3878();
                    Statics.field76 = false;
                }
                method1035();
                if (field642 != 30) {
                    return;
                }
                method3112();
                method1584();
                field668.field1298++;
                if (field668.field1298 > 750) {
                    method1057();
                    return;
                }
                method507();
                method2966();
                int[] var38 = class90.field1239;
                for (int var39 = 0; var39 < class90.field1235; var39++) {
                    class67 var40 = field753[var38[var39]];
                    if (var40 != null && var40.field988 > 0) {
                        var40.field988--;
                        if (var40.field988 == 0) {
                            var40.field929 = null;
                        }
                    }
                }
                for (int var41 = 0; var41 < field733; var41++) {
                    int var42 = field680[var41];
                    class80 var43 = field678[var42];
                    if (var43 != null && var43.field988 > 0) {
                        var43.field988--;
                        if (var43.field988 == 0) {
                            var43.field929 = null;
                        }
                    }
                }
                field699++;
                if (field741 != 0) {
                    field740 += 20;
                    if (field740 >= 400) {
                        field741 = 0;
                    }
                }
                if (Statics.field629 != null) {
                    field751++;
                    if (field751 >= 15) {
                        method237(Statics.field629);
                        Statics.field629 = null;
                    }
                }
                class218 var44 = Statics.field2053;
                class218 var45 = Statics.field2768;
                Statics.field2053 = null;
                Statics.field2768 = null;
                field814 = null;
                field818 = false;
                field815 = false;
                field858 = 0;
                while (class46.method2020() && field858 < 128) {
                    if (field806 >= 2 && class46.field370[82] && Statics.field1231 == 66) {
                        String var46 = class92.method2953();
                        Statics.field1710.method794(var46);
                    } else if (field712 != 1 || Statics.field382 <= 0) {
                        field860[field858] = Statics.field1231;
                        field859[field858] = Statics.field382;
                        field858++;
                    }
                }
                boolean var47 = field806 >= 2;
                if (var47 && class46.field370[82] && class46.field370[81] && field835 != 0) {
                    int var48 = Statics.field2737.field624 - field835;
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 3) {
                        var48 = 3;
                    }
                    if (Statics.field2737.field624 != var48) {
                        method4776(Statics.field2734 + Statics.field2737.field985[0], Statics.field3631 + Statics.field2737.field960[0], var48, false);
                    }
                    field835 = 0;
                }
                if (field887 != -1) {
                    method263(field887, 0, 0, Statics.field1578, Statics.field1904, 0, 0);
                }
                field727++;
                while (true) {
                    class63 var49;
                    class218 var50;
                    class218 var51;
                    do {
                        var49 = (class63) field837.method4436();
                        if (var49 == null) {
                            while (true) {
                                class63 var52;
                                class218 var53;
                                class218 var54;
                                do {
                                    var52 = (class63) field764.method4436();
                                    if (var52 == null) {
                                        while (true) {
                                            class63 var55;
                                            class218 var56;
                                            class218 var57;
                                            do {
                                                var55 = (class63) field844.method4436();
                                                if (var55 == null) {
                                                    this.method1165();
                                                    if (Statics.field481 != null) {
                                                        Statics.field481.method5749(Statics.field174, (Statics.field2737.field986 >> 7) + Statics.field2734, (Statics.field2737.field930 >> 7) + Statics.field3631, false);
                                                        Statics.field481.method5765();
                                                    }
                                                    if (field810 != null) {
                                                        this.method1170();
                                                    }
                                                    if (Statics.field1870 != null) {
                                                        method237(Statics.field1870);
                                                        field750++;
                                                        if (class55.field465 == 0) {
                                                            if (field749) {
                                                                if (Statics.field392 == Statics.field1870 && field822 != field685) {
                                                                    class218 var58 = Statics.field1870;
                                                                    byte var59 = 0;
                                                                    if (field874 == 1 && var58.field2550 == 206) {
                                                                        var59 = 1;
                                                                    }
                                                                    if (var58.field2670[field685] <= 0) {
                                                                        var59 = 0;
                                                                    }
                                                                    if (class219.method235(method15(var58))) {
                                                                        int var60 = field822;
                                                                        int var61 = field685;
                                                                        var58.field2670[var61] = var58.field2670[var60];
                                                                        var58.field2671[var61] = var58.field2671[var60];
                                                                        var58.field2670[var60] = -1;
                                                                        var58.field2671[var60] = 0;
                                                                    } else if (var59 == 1) {
                                                                        int var62 = field822;
                                                                        int var63 = field685;
                                                                        while (var62 != var63) {
                                                                            if (var62 > var63) {
                                                                                var58.method3644(var62 - 1, var62);
                                                                                var62--;
                                                                            } else if (var62 < var63) {
                                                                                var58.method3644(var62 + 1, var62);
                                                                                var62++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var58.method3644(field685, field822);
                                                                    }
                                                                    class188 var64 = class188.method1039(class184.field2223, field668.field1293);
                                                                    var64.field2315.method5178(Statics.field1870.field2546);
                                                                    var64.field2315.method4975(field685);
                                                                    var64.field2315.method5065(var59);
                                                                    var64.field2315.method5024(field822);
                                                                    field668.method2040(var64);
                                                                }
                                                            } else if (this.method1166()) {
                                                                this.method1167(field746, field747);
                                                            } else if (field774 > 0) {
                                                                method38(field746, field747);
                                                            }
                                                            field751 = 10;
                                                            class55.field473 = 0;
                                                            Statics.field1870 = null;
                                                        } else if (field750 >= 5 && (class55.field466 > field746 + 5 || class55.field466 < field746 - 5 || class55.field467 > field747 + 5 || class55.field467 < field747 - 5)) {
                                                            field749 = true;
                                                        }
                                                    }
                                                    if (class134.method2820()) {
                                                        int var65 = class134.field1805;
                                                        int var66 = class134.field1806;
                                                        class188 var67 = class188.method1039(class184.field2282, field668.field1293);
                                                        var67.field2315.method5065(5);
                                                        var67.field2315.method5026(Statics.field2734 + var65);
                                                        var67.field2315.method5024(Statics.field3631 + var66);
                                                        var67.field2315.method5016(class46.field370[82] ? (class46.field370[81] ? 2 : 1) : 0);
                                                        field668.method2040(var67);
                                                        class134.method2821();
                                                        field737 = class55.field474;
                                                        field739 = class55.field475;
                                                        field741 = 1;
                                                        field740 = 0;
                                                        field865 = var65;
                                                        field790 = var66;
                                                    }
                                                    if (Statics.field2053 != var44) {
                                                        if (var44 != null) {
                                                            method237(var44);
                                                        }
                                                        if (Statics.field2053 != null) {
                                                            method237(Statics.field2053);
                                                        }
                                                    }
                                                    if (Statics.field2768 != var45 && field789 == field788) {
                                                        if (var45 != null) {
                                                            method237(var45);
                                                        }
                                                        if (Statics.field2768 != null) {
                                                            method237(Statics.field2768);
                                                        }
                                                    }
                                                    if (Statics.field2768 == null) {
                                                        if (field788 > 0) {
                                                            field788--;
                                                        }
                                                    } else if (field788 < field789) {
                                                        field788++;
                                                        if (field789 == field788) {
                                                            method237(Statics.field2768);
                                                        }
                                                    }
                                                    if (field712 == 0) {
                                                        int var68 = Statics.field2737.field986;
                                                        int var69 = Statics.field2737.field930;
                                                        if (Statics.field1069 - var68 < -500 || Statics.field1069 - var68 > 500 || Statics.field90 - var69 < -500 || Statics.field90 - var69 > 500) {
                                                            Statics.field1069 = var68;
                                                            Statics.field90 = var69;
                                                        }
                                                        if (Statics.field1069 != var68) {
                                                            Statics.field1069 += (var68 - Statics.field1069) / 16;
                                                        }
                                                        if (Statics.field90 != var69) {
                                                            Statics.field90 += (var69 - Statics.field90) / 16;
                                                        }
                                                        int var70 = Statics.field1069 >> 7;
                                                        int var71 = Statics.field90 >> 7;
                                                        int var72 = method3522(Statics.field1069, Statics.field90, Statics.field174);
                                                        int var73 = 0;
                                                        if (var70 > 3 && var71 > 3 && var70 < 100 && var71 < 100) {
                                                            for (int var74 = var70 - 4; var74 <= var70 + 4; var74++) {
                                                                for (int var75 = var71 - 4; var75 <= var71 + 4; var75++) {
                                                                    int var76 = Statics.field174;
                                                                    if (var76 < 3 && (class56.field498[1][var74][var75] & 0x2) == 2) {
                                                                        var76++;
                                                                    }
                                                                    int var77 = var72 - class56.field491[var76][var74][var75];
                                                                    if (var77 > var73) {
                                                                        var73 = var77;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var78 = var73 * 192;
                                                        if (var78 > 98048) {
                                                            var78 = 98048;
                                                        }
                                                        if (var78 < 32768) {
                                                            var78 = 32768;
                                                        }
                                                        if (var78 > field723) {
                                                            field723 += (var78 - field723) / 24;
                                                        } else if (var78 < field723) {
                                                            field723 += (var78 - field723) / 80;
                                                        }
                                                        Statics.field1841 = method3522(Statics.field2737.field986, Statics.field2737.field930, Statics.field174) - field867;
                                                    } else if (field712 == 1) {
                                                        method11();
                                                        short var79 = -1;
                                                        if (class46.field370[33]) {
                                                            var79 = 0;
                                                        } else if (class46.field370[49]) {
                                                            var79 = 1024;
                                                        }
                                                        if (class46.field370[48]) {
                                                            if (var79 == 0) {
                                                                var79 = 1792;
                                                            } else if (var79 == 1024) {
                                                                var79 = 1280;
                                                            } else {
                                                                var79 = 1536;
                                                            }
                                                        } else if (class46.field370[50]) {
                                                            if (var79 == 0) {
                                                                var79 = 256;
                                                            } else if (var79 == 1024) {
                                                                var79 = 768;
                                                            } else {
                                                                var79 = 512;
                                                            }
                                                        }
                                                        byte var80 = 0;
                                                        if (class46.field370[35]) {
                                                            var80 = -1;
                                                        } else if (class46.field370[51]) {
                                                            var80 = 1;
                                                        }
                                                        int var81 = 0;
                                                        if (var79 >= 0 || var80 != 0) {
                                                            int var82 = class46.field370[81] ? field718 : field717;
                                                            var81 = var82 * 16;
                                                            field715 = var79;
                                                            field716 = var80;
                                                        }
                                                        if (field767 < var81) {
                                                            field767 += var81 / 8;
                                                            if (field767 > var81) {
                                                                field767 = var81;
                                                            }
                                                        } else if (field767 > var81) {
                                                            field767 = field767 * 9 / 10;
                                                        }
                                                        if (field767 > 0) {
                                                            int var83 = field767 / 16;
                                                            if (field715 >= 0) {
                                                                int var84 = field715 - Statics.field195 & 0x7FF;
                                                                int var85 = class131.field1747[var84];
                                                                int var86 = class131.field1730[var84];
                                                                Statics.field1069 += var83 * var85 / 65536;
                                                                Statics.field90 += var83 * var86 / 65536;
                                                            }
                                                            if (field716 != 0) {
                                                                Statics.field1841 += field716 * var83;
                                                                if (Statics.field1841 > 0) {
                                                                    Statics.field1841 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field715 = -1;
                                                            field716 = -1;
                                                        }
                                                        if (class46.field370[13]) {
                                                            field668.method2040(class188.method1039(class184.field2284, field668.field1293));
                                                            field712 = 0;
                                                        }
                                                    }
                                                    if (class55.field465 == 4 && Statics.field183) {
                                                        int var87 = class55.field467 - field711;
                                                        field709 = var87 * 2;
                                                        field711 = var87 == -1 || var87 == 1 ? class55.field467 : (field711 + class55.field467) / 2;
                                                        int var88 = field689 - class55.field466;
                                                        field708 = var88 * 2;
                                                        field689 = var88 == -1 || var88 == 1 ? class55.field466 : (field689 + class55.field466) / 2;
                                                    } else {
                                                        if (class46.field370[96]) {
                                                            field708 += (-24 - field708) / 2;
                                                        } else if (class46.field370[97]) {
                                                            field708 += (24 - field708) / 2;
                                                        } else {
                                                            field708 /= 2;
                                                        }
                                                        if (class46.field370[98]) {
                                                            field709 += (12 - field709) / 2;
                                                        } else if (class46.field370[99]) {
                                                            field709 += (-12 - field709) / 2;
                                                        } else {
                                                            field709 /= 2;
                                                        }
                                                        field711 = class55.field467;
                                                        field689 = class55.field466;
                                                    }
                                                    field640 = field708 / 2 + field640 & 0x7FF;
                                                    field706 += field709 / 2;
                                                    if (field706 < 128) {
                                                        field706 = 128;
                                                    }
                                                    if (field706 > 383) {
                                                        field706 = 383;
                                                    }
                                                    if (field849) {
                                                        method2034();
                                                    }
                                                    for (int var89 = 0; var89 < 5; var89++) {
                                                        int var10002 = field886[var89]++;
                                                    }
                                                    Statics.field2385.method1962();
                                                    int var90 = class55.method183();
                                                    int var91 = class46.method1010();
                                                    if (var90 > 15000 && var91 > 15000) {
                                                        field684 = 250;
                                                        class55.field460 = 14500;
                                                        class188 var92 = class188.method1039(class184.field2226, field668.field1293);
                                                        field668.method2040(var92);
                                                    }
                                                    Statics.field500.method1681();
                                                    field668.field1299++;
                                                    if (field668.field1299 > 50) {
                                                        class188 var93 = class188.method1039(class184.field2208, field668.field1293);
                                                        field668.method2040(var93);
                                                    }
                                                    try {
                                                        field668.method2037();
                                                    } catch (IOException var95) {
                                                        method1057();
                                                    }
                                                    return;
                                                }
                                                var56 = var55.field566;
                                                if (var56.field2674 < 0) {
                                                    break;
                                                }
                                                var57 = class218.method728(var56.field2565);
                                            } while (var57 == null || var57.field2676 == null || var56.field2674 >= var57.field2676.length || var57.field2676[var56.field2674] != var56);
                                            class77.method4064(var55);
                                        }
                                    }
                                    var53 = var52.field566;
                                    if (var53.field2674 < 0) {
                                        break;
                                    }
                                    var54 = class218.method728(var53.field2565);
                                } while (var54 == null || var54.field2676 == null || var53.field2674 >= var54.field2676.length || var54.field2676[var53.field2674] != var53);
                                class77.method4064(var52);
                            }
                        }
                        var50 = var49.field566;
                        if (var50.field2674 < 0) {
                            break;
                        }
                        var51 = class218.method728(var50.field2565);
                    } while (var51 == null || var51.field2676 == null || var50.field2674 >= var51.field2676.length || var51.field2676[var50.field2674] != var50);
                    class77.method4064(var49);
                }
            }
            class188 var4 = class188.method1039(class184.field2197, field668.field1293);
            var4.field2315.method5065(0);
            int var5 = var4.field2315.field3702;
            class97.method3293(var4.field2315);
            var4.field2315.method4987(var4.field2315.field3702 - var5);
            field668.method2040(var4);
        }
    }

    @ObfuscatedName("ar.fy(B)V")
    public static final void method506() {
        if (Statics.field28 != null) {
            Statics.field28.method2221();
        }
        if (Statics.field2693 != null) {
            Statics.field2693.method2221();
        }
    }

    @ObfuscatedName("bq.ff(I)V")
    public static final void method1584() {
        for (int var0 = 0; var0 < field850; var0++) {
            int var10002 = field878[var0]--;
            if (field878[var0] >= -10) {
                class102 var2 = field664[var0];
                if (var2 == null) {
                    class102 var10000 = (class102) null;
                    var2 = class102.method2129(Statics.field78, field876[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field878[var0] += var2.method2132();
                    field664[var0] = var2;
                }
                if (field878[var0] < 0) {
                    int var9;
                    if (field879[var0] == 0) {
                        var9 = field873;
                    } else {
                        int var3 = (field879[var0] & 0xFF) * 128;
                        int var4 = field879[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2737.field986;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field879[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2737.field930;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field878[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field869 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class104 var10 = var2.method2123().method2163(Statics.field1077);
                        class114 var11 = class114.method2335(var10, 100, var9);
                        var11.method2292(field877[var0] - 1);
                        Statics.field105.method2070(var11);
                    }
                    field878[var0] = -100;
                }
            } else {
                field850--;
                for (int var1 = var0; var1 < field850; var1++) {
                    field876[var1] = field876[var1 + 1];
                    field664[var1] = field664[var1 + 1];
                    field877[var1] = field877[var1 + 1];
                    field878[var1] = field878[var1 + 1];
                    field879[var1] = field879[var1 + 1];
                }
                var0--;
            }
        }
        if (!field760) {
            return;
        }
        boolean var12;
        if (class198.field2387 == 0) {
            var12 = Statics.field400.method3353();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field762 != 0 && field667 != -1) {
                class198.method1875(Statics.field3047, field667, 0, field762, false);
            }
            field760 = false;
        }
    }

    @ObfuscatedName("ap.fo(Lix;IIII)V")
    public static void method498(class259 arg0, int arg1, int arg2, int arg3) {
        if (field850 >= 50 || field869 == 0 || arg0.field3508 == null || arg1 >= arg0.field3508.length) {
            return;
        }
        int var4 = arg0.field3508[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field876[field850] = var5;
        field877[field850] = var6;
        field878[field850] = 0;
        field664[field850] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field879[field850] = (var8 << 16) + (var9 << 8) + var7;
        field850++;
    }

    @ObfuscatedName("be.fk(IIII)V")
    public static void method1087(int arg0, int arg1, int arg2) {
        if (field873 == 0 || arg1 == 0 || field850 >= 50) {
            return;
        }
        field876[field850] = arg0;
        field877[field850] = arg1;
        field878[field850] = arg2;
        field664[field850] = null;
        field879[field850] = 0;
        field850++;
    }

    @ObfuscatedName("gf.fq(II)V")
    public static void method3322(int arg0) {
        if (arg0 == -1 && !field760) {
            class198.method2695();
        } else if (arg0 != -1 && field667 != arg0 && field762 != 0 && !field760) {
            class236 var1 = Statics.field3047;
            int var2 = field762;
            class198.field2387 = 1;
            Statics.field2388 = var1;
            Statics.field2324 = arg0;
            Statics.field401 = 0;
            Statics.field1224 = var2;
            Statics.field152 = false;
            Statics.field2383 = 2;
        }
        field667 = arg0;
    }

    @ObfuscatedName("gy.fc(III)V")
    public static void method3257(int arg0, int arg1) {
        if (field762 != 0 && arg0 != -1) {
            class198.method1875(Statics.field3576, arg0, 0, field762, false);
            field760 = true;
        }
    }

    @ObfuscatedName("bc.fv(I)V")
    public static final void method1035() {
        if (Statics.field174 == field644) {
            return;
        }
        field644 = Statics.field174;
        int var0 = Statics.field174;
        int[] var1 = Statics.field1074.field3875;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field498[var0][var6][var4] & 0x18) == 0) {
                    Statics.field1304.method2815(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class56.field498[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1304.method2815(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1074.method5631();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field498[var0][var10][var9] & 0x18) == 0) {
                    method673(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class56.field498[var0 + 1][var10][var9] & 0x8) != 0) {
                    method673(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field863 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1304.method2810(Statics.field174, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method1871(var13);
                    int var16 = class254.method1148(var15).field3336;
                    if (var16 >= 0) {
                        field866[field863] = class242.method2284(var16).method3947(false);
                        field855[field863] = var11;
                        field823[field863] = var12;
                        field863++;
                    }
                }
            }
        }
        Statics.field349.method5508();
    }

    @ObfuscatedName("kv.fm(Lho;IIB)V")
    public static final void method5276(class218 arg0, int arg1, int arg2) {
        if (field683 != 0 && field683 != 3 || field773 || !(class55.field473 == 1 || !Statics.field183 && class55.field473 == 4)) {
            return;
        }
        class212 var3 = arg0.method3649(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field474 - arg1;
        int var5 = class55.field475 - arg2;
        if (!var3.method3572(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2503 / 2;
        int var7 = var5 - var3.field2504 / 2;
        int var8 = field640 & 0x7FF;
        int var9 = class131.field1747[var8];
        int var10 = class131.field1730[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2737.field986 + var11 >> 7;
        int var14 = Statics.field2737.field930 - var12 >> 7;
        class188 var15 = class188.method1039(class184.field2276, field668.field1293);
        var15.field2315.method5065(18);
        var15.field2315.method5026(Statics.field2734 + var13);
        var15.field2315.method5024(Statics.field3631 + var14);
        var15.field2315.method5016(class46.field370[82] ? (class46.field370[81] ? 2 : 1) : 0);
        var15.field2315.method5065(var6);
        var15.field2315.method5065(var7);
        var15.field2315.method4975(field640);
        var15.field2315.method5065(57);
        var15.field2315.method5065(0);
        var15.field2315.method5065(0);
        var15.field2315.method5065(89);
        var15.field2315.method4975(Statics.field2737.field986);
        var15.field2315.method4975(Statics.field2737.field930);
        var15.field2315.method5065(63);
        field668.method2040(var15);
        field865 = var13;
        field790 = var14;
    }

    @ObfuscatedName("h.fh(Ljava/lang/String;I)V")
    public static final void method234(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field3112.field1037 = !Statics.field3112.field1037;
            class74.method3302();
            if (Statics.field3112.field1037) {
                class92.method3567(99, "", "Roofs are now all hidden");
            } else {
                class92.method3567(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field651 = !field651;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field775 = !field775;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field785 = !field785;
        }
        if (field806 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field481.field3985 = !Statics.field481.field3985;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field651 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field651 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1057();
            }
        }
        class188 var1 = class188.method1039(class184.field2202, field668.field1293);
        var1.field2315.method5065(arg0.length() + 1);
        var1.field2315.method4981(arg0);
        field668.method2040(var1);
    }

    @ObfuscatedName("cc.ft(I)V")
    public static final void method2034() {
        int var0 = Statics.field3046 * 128 + 64;
        int var1 = Statics.field2040 * 128 + 64;
        int var2 = method3522(var0, var1, Statics.field174) - Statics.field628;
        if (Statics.field627 < var0) {
            Statics.field627 += Statics.field1263 * (var0 - Statics.field627) / 1000 + Statics.field573;
            if (Statics.field627 > var0) {
                Statics.field627 = var0;
            }
        }
        if (Statics.field627 > var0) {
            Statics.field627 -= Statics.field1263 * (Statics.field627 - var0) / 1000 + Statics.field573;
            if (Statics.field627 < var0) {
                Statics.field627 = var0;
            }
        }
        if (Statics.field1255 < var2) {
            Statics.field1255 += Statics.field1263 * (var2 - Statics.field1255) / 1000 + Statics.field573;
            if (Statics.field1255 > var2) {
                Statics.field1255 = var2;
            }
        }
        if (Statics.field1255 > var2) {
            Statics.field1255 -= Statics.field1263 * (Statics.field1255 - var2) / 1000 + Statics.field573;
            if (Statics.field1255 < var2) {
                Statics.field1255 = var2;
            }
        }
        if (Statics.field185 < var1) {
            Statics.field185 += Statics.field1263 * (var1 - Statics.field185) / 1000 + Statics.field573;
            if (Statics.field185 > var1) {
                Statics.field185 = var1;
            }
        }
        if (Statics.field185 > var1) {
            Statics.field185 -= Statics.field1263 * (Statics.field185 - var1) / 1000 + Statics.field573;
            if (Statics.field185 < var1) {
                Statics.field185 = var1;
            }
        }
        int var3 = Statics.field456 * 128 + 64;
        int var4 = Statics.field1229 * 128 + 64;
        int var5 = method3522(var3, var4, Statics.field174) - Statics.field91;
        int var6 = var3 - Statics.field627;
        int var7 = var5 - Statics.field1255;
        int var8 = var4 - Statics.field185;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field3584 < var10) {
            Statics.field3584 += Statics.field571 * (var10 - Statics.field3584) / 1000 + Statics.field1127;
            if (Statics.field3584 > var10) {
                Statics.field3584 = var10;
            }
        }
        if (Statics.field3584 > var10) {
            Statics.field3584 -= Statics.field571 * (Statics.field3584 - var10) / 1000 + Statics.field1127;
            if (Statics.field3584 < var10) {
                Statics.field3584 = var10;
            }
        }
        int var12 = var11 - Statics.field195;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field195 += Statics.field571 * var12 / 1000 + Statics.field1127;
            Statics.field195 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field195 -= Statics.field571 * -var12 / 1000 + Statics.field1127;
            Statics.field195 &= 0x7FF;
        }
        int var13 = var11 - Statics.field195;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field195 = var11;
        }
    }

    @ObfuscatedName("ab.fg(I)V")
    public static final void method507() {
        int var0 = class90.field1235;
        int[] var1 = class90.field1239;
        for (int var2 = 0; var2 < var0; var2++) {
            class67 var3 = field753[var1[var2]];
            if (var3 != null) {
                method5691(var3, 1);
            }
        }
    }

    @ObfuscatedName("eg.fz(I)V")
    public static final void method2966() {
        for (int var0 = 0; var0 < field733; var0++) {
            int var1 = field680[var0];
            class80 var2 = field678[var1];
            if (var2 != null) {
                method5691(var2, var2.field1114.field3474);
            }
        }
    }

    @ObfuscatedName("lo.fu(Lby;II)V")
    public static final void method5691(class70 arg0, int arg1) {
        if (arg0.field949 > field645) {
            method3312(arg0);
        } else if (arg0.field977 >= field645) {
            method1845(arg0);
        } else {
            arg0.field980 = arg0.field935;
            if (arg0.field984 == 0) {
                arg0.field950 = 0;
            } else {
                label418: {
                    if (arg0.field936 != -1 && arg0.field937 == 0) {
                        class259 var2 = class259.method122(arg0.field936);
                        if (arg0.field989 > 0 && var2.field3516 == 0) {
                            arg0.field950++;
                            break label418;
                        }
                        if (arg0.field989 <= 0 && var2.field3511 == 0) {
                            arg0.field950++;
                            break label418;
                        }
                    }
                    int var3 = arg0.field986;
                    int var4 = arg0.field930;
                    int var5 = arg0.field985[arg0.field984 - 1] * 128 + arg0.field933 * 64;
                    int var6 = arg0.field960[arg0.field984 - 1] * 128 + arg0.field933 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field981 = 1280;
                        } else if (var4 > var6) {
                            arg0.field981 = 1792;
                        } else {
                            arg0.field981 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field981 = 768;
                        } else if (var4 > var6) {
                            arg0.field981 = 256;
                        } else {
                            arg0.field981 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field981 = 1024;
                    } else if (var4 > var6) {
                        arg0.field981 = 0;
                    }
                    byte var7 = arg0.field987[arg0.field984 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field981 - arg0.field931 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field939;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field938;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field941;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field940;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field938;
                        }
                        arg0.field980 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class80) {
                            var11 = ((class80) arg0).field1114.field3483;
                        }
                        if (var11) {
                            if (arg0.field981 != arg0.field931 && arg0.field956 == -1 && arg0.field983 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field984 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field984 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field950 > 0 && arg0.field984 > 1) {
                                var10 = 8;
                                arg0.field950--;
                            }
                        } else {
                            if (arg0.field984 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field984 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field950 > 0 && arg0.field984 > 1) {
                                var10 = 8;
                                arg0.field950--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field980 == arg0.field938 && arg0.field942 != -1) {
                            arg0.field980 = arg0.field942;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field986 += var10;
                                if (arg0.field986 > var5) {
                                    arg0.field986 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field986 -= var10;
                                if (arg0.field986 < var5) {
                                    arg0.field986 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field930 += var10;
                                if (arg0.field930 > var6) {
                                    arg0.field930 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field930 -= var10;
                                if (arg0.field930 < var6) {
                                    arg0.field930 = var6;
                                }
                            }
                        }
                        if (arg0.field986 == var5 && arg0.field930 == var6) {
                            arg0.field984--;
                            if (arg0.field989 > 0) {
                                arg0.field989--;
                            }
                        }
                    } else {
                        arg0.field986 = var5;
                        arg0.field930 = var6;
                        arg0.field984--;
                        if (arg0.field989 > 0) {
                            arg0.field989--;
                        }
                    }
                }
            }
        }
        if (arg0.field986 < 128 || arg0.field930 < 128 || arg0.field986 >= 13184 || arg0.field930 >= 13184) {
            arg0.field936 = -1;
            arg0.field967 = -1;
            arg0.field949 = 0;
            arg0.field977 = 0;
            arg0.field986 = arg0.field985[0] * 128 + arg0.field933 * 64;
            arg0.field930 = arg0.field960[0] * 128 + arg0.field933 * 64;
            arg0.method1580();
        }
        if (Statics.field2737 == arg0 && (arg0.field986 < 1536 || arg0.field930 < 1536 || arg0.field986 >= 11776 || arg0.field930 >= 11776)) {
            arg0.field936 = -1;
            arg0.field967 = -1;
            arg0.field949 = 0;
            arg0.field977 = 0;
            arg0.field986 = arg0.field985[0] * 128 + arg0.field933 * 64;
            arg0.field930 = arg0.field960[0] * 128 + arg0.field933 * 64;
            arg0.method1580();
        }
        if (arg0.field983 != 0) {
            if (arg0.field956 != -1) {
                class70 var12 = null;
                if (arg0.field956 < 32768) {
                    var12 = field678[arg0.field956];
                } else if (arg0.field956 >= 32768) {
                    var12 = field753[arg0.field956 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field986 - var12.field986;
                    int var14 = arg0.field930 - var12.field930;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field981 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field951) {
                    arg0.field956 = -1;
                    arg0.field951 = false;
                }
            }
            if (arg0.field958 != -1 && (arg0.field984 == 0 || arg0.field950 > 0)) {
                arg0.field981 = arg0.field958;
                arg0.field958 = -1;
            }
            int var15 = arg0.field981 - arg0.field931 & 0x7FF;
            if (var15 == 0 && arg0.field951) {
                arg0.field956 = -1;
                arg0.field951 = false;
            }
            if (var15 == 0) {
                arg0.field982 = 0;
            } else {
                arg0.field982++;
                if (var15 > 1024) {
                    arg0.field931 -= arg0.field983;
                    boolean var16 = true;
                    if (var15 < arg0.field983 || var15 > 2048 - arg0.field983) {
                        arg0.field931 = arg0.field981;
                        var16 = false;
                    }
                    if (arg0.field980 == arg0.field935 && (arg0.field982 > 25 || var16)) {
                        if (arg0.field946 == -1) {
                            arg0.field980 = arg0.field938;
                        } else {
                            arg0.field980 = arg0.field946;
                        }
                    }
                } else {
                    arg0.field931 += arg0.field983;
                    boolean var17 = true;
                    if (var15 < arg0.field983 || var15 > 2048 - arg0.field983) {
                        arg0.field931 = arg0.field981;
                        var17 = false;
                    }
                    if (arg0.field980 == arg0.field935 && (arg0.field982 > 25 || var17)) {
                        if (arg0.field979 == -1) {
                            arg0.field980 = arg0.field938;
                        } else {
                            arg0.field980 = arg0.field979;
                        }
                    }
                }
                arg0.field931 &= 0x7FF;
            }
        }
        arg0.field932 = false;
        if (arg0.field980 != -1) {
            class259 var19 = class259.method122(arg0.field980);
            if (var19 == null || var19.field3515 == null) {
                arg0.field980 = -1;
            } else {
                arg0.field954++;
                if (arg0.field965 < var19.field3515.length && arg0.field954 > var19.field3507[arg0.field965]) {
                    arg0.field954 = 1;
                    arg0.field965++;
                    method498(var19, arg0.field965, arg0.field986, arg0.field930);
                }
                if (arg0.field965 >= var19.field3515.length) {
                    arg0.field954 = 0;
                    arg0.field965 = 0;
                    method498(var19, arg0.field965, arg0.field986, arg0.field930);
                }
            }
        }
        if (arg0.field967 != -1 && field645 >= arg0.field970) {
            if (arg0.field968 < 0) {
                arg0.field968 = 0;
            }
            int var20 = class244.method1038(arg0.field967).field3224;
            if (var20 == -1) {
                arg0.field967 = -1;
            } else {
                class259 var21 = class259.method122(var20);
                if (var21 == null || var21.field3515 == null) {
                    arg0.field967 = -1;
                } else {
                    arg0.field969++;
                    if (arg0.field968 < var21.field3515.length && arg0.field969 > var21.field3507[arg0.field968]) {
                        arg0.field969 = 1;
                        arg0.field968++;
                        method498(var21, arg0.field968, arg0.field986, arg0.field930);
                    }
                    if (arg0.field968 >= var21.field3515.length && (arg0.field968 < 0 || arg0.field968 >= var21.field3515.length)) {
                        arg0.field967 = -1;
                    }
                }
            }
        }
        if (arg0.field936 != -1 && arg0.field937 <= 1) {
            class259 var22 = class259.method122(arg0.field936);
            if (var22.field3516 == 1 && arg0.field989 > 0 && arg0.field949 <= field645 && arg0.field977 < field645) {
                arg0.field937 = 1;
                return;
            }
        }
        if (arg0.field936 != -1 && arg0.field937 == 0) {
            class259 var23 = class259.method122(arg0.field936);
            if (var23 == null || var23.field3515 == null) {
                arg0.field936 = -1;
            } else {
                arg0.field964++;
                if (arg0.field961 < var23.field3515.length && arg0.field964 > var23.field3507[arg0.field961]) {
                    arg0.field964 = 1;
                    arg0.field961++;
                    method498(var23, arg0.field961, arg0.field986, arg0.field930);
                }
                if (arg0.field961 >= var23.field3515.length) {
                    arg0.field961 -= var23.field3509;
                    arg0.field966++;
                    if (arg0.field966 >= var23.field3504) {
                        arg0.field936 = -1;
                    } else if (arg0.field961 >= 0 && arg0.field961 < var23.field3515.length) {
                        method498(var23, arg0.field961, arg0.field986, arg0.field930);
                    } else {
                        arg0.field936 = -1;
                    }
                }
                arg0.field932 = var23.field3505;
            }
        }
        if (arg0.field937 > 0) {
            arg0.field937--;
        }
    }

    @ObfuscatedName("gl.fa(Lby;I)V")
    public static final void method3312(class70 arg0) {
        int var1 = arg0.field949 - field645;
        int var2 = arg0.field972 * 128 + arg0.field933 * 64;
        int var3 = arg0.field974 * 128 + arg0.field933 * 64;
        arg0.field986 += (var2 - arg0.field986) / var1;
        arg0.field930 += (var3 - arg0.field930) / var1;
        arg0.field950 = 0;
        arg0.field981 = arg0.field978;
    }

    @ObfuscatedName("cz.fr(Lby;I)V")
    public static final void method1845(class70 arg0) {
        if (field645 == arg0.field977 || arg0.field936 == -1 || arg0.field937 != 0 || arg0.field964 + 1 > class259.method122(arg0.field936).field3507[arg0.field961]) {
            int var1 = arg0.field977 - arg0.field949;
            int var2 = field645 - arg0.field949;
            int var3 = arg0.field972 * 128 + arg0.field933 * 64;
            int var4 = arg0.field974 * 128 + arg0.field933 * 64;
            int var5 = arg0.field973 * 128 + arg0.field933 * 64;
            int var6 = arg0.field975 * 128 + arg0.field933 * 64;
            arg0.field986 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field930 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field950 = 0;
        arg0.field981 = arg0.field978;
        arg0.field931 = arg0.field981;
    }

    @ObfuscatedName("ge.fi(Lbi;III)V")
    public static void method3262(class67 arg0, int arg1, int arg2) {
        if (arg0.field936 == arg1 && arg1 != -1) {
            int var3 = class259.method122(arg1).field3518;
            if (var3 == 1) {
                arg0.field961 = 0;
                arg0.field964 = 0;
                arg0.field937 = arg2;
                arg0.field966 = 0;
            }
            if (var3 == 2) {
                arg0.field966 = 0;
            }
        } else if (arg1 == -1 || arg0.field936 == -1 || class259.method122(arg1).field3512 >= class259.method122(arg0.field936).field3512) {
            arg0.field936 = arg1;
            arg0.field961 = 0;
            arg0.field964 = 0;
            arg0.field937 = arg2;
            arg0.field966 = 0;
            arg0.field989 = arg0.field984;
        }
    }

    @ObfuscatedName("iw.fw(I)I")
    public static int method4052() {
        return field851 ? 2 : 1;
    }

    @ObfuscatedName("ea.fn(IB)V")
    public static void method3059(int arg0) {
        field755 = 0L;
        if (arg0 >= 2) {
            field851 = true;
        } else {
            field851 = false;
        }
        if (method4052() == 1) {
            Statics.field1710.method786(765, 503);
        } else {
            Statics.field1710.method786(7680, 2160);
        }
        if (field642 < 25) {
            return;
        }
        class188 var1 = class188.method1039(class184.field2257, field668.field1293);
        var1.field2315.method5065(method4052());
        var1.field2315.method4975(Statics.field1578);
        var1.field2315.method4975(Statics.field1904);
        field668.method2040(var1);
    }

    @ObfuscatedName("hk.fl(I)V")
    public static void method3570() {
        class188 var0 = class188.method1039(class184.field2257, field668.field1293);
        var0.field2315.method5065(method4052());
        var0.field2315.method4975(Statics.field1578);
        var0.field2315.method4975(Statics.field1904);
        field668.method2040(var0);
    }

    @ObfuscatedName("client.b(I)V")
    public final void method897() {
        field755 = class297.method502() + 500L;
        this.method1162();
        if (field887 != -1) {
            this.method1365(true);
        }
    }

    @ObfuscatedName("client.fs(B)V")
    public void method1162() {
        int var1 = Statics.field1578;
        int var2 = Statics.field1904;
        if (this.field430 < var1) {
            int var3 = this.field430;
        }
        if (this.field426 < var2) {
            int var4 = this.field426;
        }
        if (Statics.field3112 == null) {
            return;
        }
        try {
            client var5 = Statics.field1710;
            Object[] var6 = new Object[] { method4052() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fj(I)V")
    public final void method1163() {
        if (field887 != -1) {
            int var1 = field887;
            if (class218.method178(var1)) {
                method2035(Statics.field1967[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field840; var2++) {
            if (field842[var2]) {
                field843[var2] = true;
            }
            field848[var2] = field842[var2];
            field842[var2] = false;
        }
        field639 = field645;
        field786 = -1;
        field787 = -1;
        Statics.field392 = null;
        if (field887 != -1) {
            field840 = 0;
            method1032(field887, 0, 0, Statics.field1578, Statics.field1904, 0, 0, -1);
        }
        class321.method5438();
        if (field742) {
            if (field741 == 1) {
                Statics.field1927[field740 / 100].method5605(field737 - 8, field739 - 8);
            }
            if (field741 == 2) {
                Statics.field1927[field740 / 100 + 4].method5605(field737 - 8, field739 - 8);
            }
        }
        if (field773) {
            int var7 = Statics.field1923;
            int var8 = Statics.field409;
            int var9 = Statics.field1055;
            int var10 = Statics.field204;
            int var11 = 6116423;
            class321.method5497(var7, var8, var9, var10, var11);
            class321.method5497(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class321.method5450(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field2079.method4852(class225.field2896, var7 + 3, var8 + 14, var11, -1);
            int var12 = class55.field466;
            int var13 = class55.field467;
            for (int var14 = 0; var14 < field774; var14++) {
                int var15 = (field774 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                Statics.field2079.method4852(method666(var14), var7 + 3, var15, var16, 0);
            }
            int var17 = Statics.field1923;
            int var18 = Statics.field409;
            int var19 = Statics.field1055;
            int var20 = Statics.field204;
            for (int var21 = 0; var21 < field840; var21++) {
                if (field845[var21] + field830[var21] > var17 && field845[var21] < var17 + var19 && field846[var21] + field710[var21] > var18 && field846[var21] < var18 + var20) {
                    field843[var21] = true;
                }
            }
        } else if (field786 != -1) {
            int var3 = field786;
            int var4 = field787;
            if ((field774 >= 2 || field758 != 0 || field816) && field785) {
                int var5 = method3099();
                String var6;
                if (field758 == 1 && field774 < 2) {
                    var6 = class225.field2893 + class225.field2903 + field770 + " " + class82.field1137;
                } else if (field816 && field774 < 2) {
                    var6 = field828 + class225.field2903 + field862 + " " + class82.field1137;
                } else {
                    var6 = method666(var5);
                }
                if (field774 > 2) {
                    var6 = var6 + class82.method1631(16777215) + " " + '/' + " " + (field774 - 2) + class225.field2899;
                }
                Statics.field2079.method4909(var6, var3 + 4, var4 + 15, 16777215, 0, field645 / 1000);
            }
        }
        if (field784 == 3) {
            for (int var22 = 0; var22 < field840; var22++) {
                if (field848[var22]) {
                    class321.method5445(field845[var22], field846[var22], field830[var22], field710[var22], 16711935, 128);
                } else if (field843[var22]) {
                    class321.method5445(field845[var22], field846[var22], field830[var22], field710[var22], 16711680, 128);
                }
            }
        }
        class76.method42(Statics.field174, Statics.field2737.field986, Statics.field2737.field930, field699);
        field699 = 0;
    }

    @ObfuscatedName("az.fx(Ljava/lang/String;ZB)V")
    public static final void method369(String arg0, boolean arg1) {
        if (!field752) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3799.method4905(arg0, 250);
        int var6 = Statics.field3799.method4850(arg0, 250) * 13;
        class321.method5497(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5450(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3799.method4856(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field840; var11++) {
            if (field845[var11] + field830[var11] > var7 && field845[var11] < var7 + var9 && field846[var11] + field710[var11] > var8 && field846[var11] < var8 + var10) {
                field842[var11] = true;
            }
        }
        if (arg1) {
            Statics.field349.method768(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field840; var16++) {
            if (field845[var16] + field830[var16] > var12 && field845[var16] < var12 + var14 && field846[var16] + field710[var16] > var13 && field846[var16] < var13 + var15) {
                field843[var16] = true;
            }
        }
    }

    @ObfuscatedName("jy.fp(IIIII)V")
    public static final void method4721(int arg0, int arg1, int arg2, int arg3) {
        field735++;
        if (Statics.field2737.field986 >> 7 == field865 && Statics.field2737.field930 >> 7 == field790) {
            field865 = 0;
        }
        if (field775) {
            method1938(Statics.field2737, false);
        }
        method2990();
        method46(true);
        method1917();
        method46(false);
        method2022();
        for (class78 var4 = (class78) field768.method4431(); var4 != null; var4 = (class78) field768.method4454()) {
            if (Statics.field174 != var4.field1102 || var4.field1103) {
                var4.method3249();
            } else if (field645 >= var4.field1095) {
                var4.method1841(field699);
                if (var4.field1103) {
                    var4.method3249();
                } else {
                    Statics.field1304.method2792(var4.field1102, var4.field1097, var4.field1098, var4.field1100, 60, var4, 0, -1L, false);
                }
            }
        }
        method3548(arg0, arg1, arg2, arg3, true);
        int var5 = field895;
        int var6 = field896;
        int var7 = field897;
        int var8 = field898;
        class321.method5502(var5, var6, var5 + var7, var6 + var8);
        class131.method2699();
        if (!field849) {
            int var9 = field706;
            if (field723 / 256 > var9) {
                var9 = field723 / 256;
            }
            if (field836[4] && field884[4] + 128 > var9) {
                var9 = field884[4] + 128;
            }
            int var10 = field640 & 0x7FF;
            int var11 = Statics.field1069;
            int var12 = Statics.field1841;
            int var13 = Statics.field90;
            int var16 = var9 * 3 + 600;
            method4269(var11, var12, var13, var9, var10, var16, var8);
        }
        int var29;
        if (field849) {
            var29 = method3553();
        } else {
            int var17;
            if (Statics.field3112.field1037) {
                var17 = Statics.field174;
            } else {
                label313: {
                    int var18 = 3;
                    if (Statics.field3584 < 310) {
                        int var19;
                        int var20;
                        if (field712 == 1) {
                            var19 = Statics.field1069 >> 7;
                            var20 = Statics.field90 >> 7;
                        } else {
                            var19 = Statics.field2737.field986 >> 7;
                            var20 = Statics.field2737.field930 >> 7;
                        }
                        int var21 = Statics.field627 >> 7;
                        int var22 = Statics.field185 >> 7;
                        if (var21 < 0 || var22 < 0 || var21 >= 104 || var22 >= 104) {
                            var17 = Statics.field174;
                            break label313;
                        }
                        if (var19 < 0 || var20 < 0 || var19 >= 104 || var20 >= 104) {
                            var17 = Statics.field174;
                            break label313;
                        }
                        if ((class56.field498[Statics.field174][var21][var22] & 0x4) != 0) {
                            var18 = Statics.field174;
                        }
                        int var23;
                        if (var19 > var21) {
                            var23 = var19 - var21;
                        } else {
                            var23 = var21 - var19;
                        }
                        int var24;
                        if (var20 > var22) {
                            var24 = var20 - var22;
                        } else {
                            var24 = var22 - var20;
                        }
                        if (var23 > var24) {
                            int var25 = var24 * 65536 / var23;
                            int var26 = 32768;
                            while (var19 != var21) {
                                if (var21 < var19) {
                                    var21++;
                                } else if (var21 > var19) {
                                    var21--;
                                }
                                if ((class56.field498[Statics.field174][var21][var22] & 0x4) != 0) {
                                    var18 = Statics.field174;
                                }
                                var26 += var25;
                                if (var26 >= 65536) {
                                    var26 -= 65536;
                                    if (var22 < var20) {
                                        var22++;
                                    } else if (var22 > var20) {
                                        var22--;
                                    }
                                    if ((class56.field498[Statics.field174][var21][var22] & 0x4) != 0) {
                                        var18 = Statics.field174;
                                    }
                                }
                            }
                        } else if (var24 > 0) {
                            int var27 = var23 * 65536 / var24;
                            int var28 = 32768;
                            while (var20 != var22) {
                                if (var22 < var20) {
                                    var22++;
                                } else if (var22 > var20) {
                                    var22--;
                                }
                                if ((class56.field498[Statics.field174][var21][var22] & 0x4) != 0) {
                                    var18 = Statics.field174;
                                }
                                var28 += var27;
                                if (var28 >= 65536) {
                                    var28 -= 65536;
                                    if (var21 < var19) {
                                        var21++;
                                    } else if (var21 > var19) {
                                        var21--;
                                    }
                                    if ((class56.field498[Statics.field174][var21][var22] & 0x4) != 0) {
                                        var18 = Statics.field174;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2737.field986 >= 0 && Statics.field2737.field930 >= 0 && Statics.field2737.field986 < 13312 && Statics.field2737.field930 < 13312) {
                        if ((class56.field498[Statics.field174][Statics.field2737.field986 >> 7][Statics.field2737.field930 >> 7] & 0x4) != 0) {
                            var18 = Statics.field174;
                        }
                        var17 = var18;
                    } else {
                        var17 = Statics.field174;
                    }
                }
            }
            var29 = var17;
        }
        int var30 = Statics.field627;
        int var31 = Statics.field1255;
        int var32 = Statics.field185;
        int var33 = Statics.field3584;
        int var34 = Statics.field195;
        for (int var35 = 0; var35 < 5; var35++) {
            if (field836[var35]) {
                int var36 = (int) (Math.random() * (double) (field883[var35] * 2 + 1) - (double) field883[var35] + Math.sin((double) field885[var35] / 100.0D * (double) field886[var35]) * (double) field884[var35]);
                if (var35 == 0) {
                    Statics.field627 += var36;
                }
                if (var35 == 1) {
                    Statics.field1255 += var36;
                }
                if (var35 == 2) {
                    Statics.field185 += var36;
                }
                if (var35 == 3) {
                    Statics.field195 = Statics.field195 + var36 & 0x7FF;
                }
                if (var35 == 4) {
                    Statics.field3584 += var36;
                    if (Statics.field3584 < 128) {
                        Statics.field3584 = 128;
                    }
                    if (Statics.field3584 > 383) {
                        Statics.field3584 = 383;
                    }
                }
            }
        }
        int var37 = class55.field466;
        int var38 = class55.field467;
        if (class55.field473 != 0) {
            var37 = class55.field474;
            var38 = class55.field475;
        }
        if (var37 >= var5 && var37 < var5 + var7 && var38 >= var6 && var38 < var6 + var8) {
            class129.method515(var37 - var5, var38 - var6);
        } else {
            class129.method1873();
        }
        method506();
        class321.method5497(var5, var6, var7, var8, 0);
        method506();
        int var39 = class131.field1741;
        class131.field1741 = field899;
        Statics.field1304.method2822(Statics.field627, Statics.field1255, Statics.field185, Statics.field3584, Statics.field195, var29);
        class131.field1741 = var39;
        method506();
        Statics.field1304.method2795();
        method2689(var5, var6, var7, var8);
        method1075(var5, var6);
        ((class120) Statics.field1752).method2468(field699);
        field635 = 0;
        int var40 = (Statics.field2737.field986 >> 7) + Statics.field2734;
        int var41 = (Statics.field2737.field930 >> 7) + Statics.field3631;
        if (var40 >= 3053 && var40 <= 3156 && var41 >= 3056 && var41 <= 3136) {
            field635 = 1;
        }
        if (var40 >= 3072 && var40 <= 3118 && var41 >= 9492 && var41 <= 9535) {
            field635 = 1;
        }
        if (field635 == 1 && var40 >= 3139 && var40 <= 3199 && var41 >= 3008 && var41 <= 3062) {
            field635 = 0;
        }
        Statics.field627 = var30;
        Statics.field1255 = var31;
        Statics.field185 = var32;
        Statics.field3584 = var33;
        Statics.field195 = var34;
        if (field792 && class237.method6(true, false) == 0) {
            field792 = false;
        }
        if (field792) {
            class321.method5497(var5, var6, var7, var8, 0);
            method369(class225.field2750, false);
        }
    }

    @ObfuscatedName("gx.gv(IIIIZI)V")
    public static final void method3548(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
            var6 = field888;
        } else {
            var6 = (field888 - field881) * var5 / 100 + field881;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field893) {
            short var8 = field893;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field892) {
                var6 = field892;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class321.method5438();
                    class321.method5497(arg0, arg1, var10, arg3, -16777216);
                    class321.method5497(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field894) {
            short var11 = field894;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field687) {
                var6 = field687;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class321.method5438();
                    class321.method5497(arg0, arg1, arg2, var13, -16777216);
                    class321.method5497(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field899 = arg3 * var6 / 334;
        if (field897 != arg2 || field898 != arg3) {
            method77(arg2, arg3);
        }
        field895 = arg0;
        field896 = arg1;
        field897 = arg2;
        field898 = arg3;
    }

    @ObfuscatedName("eh.gy(B)V")
    public static void method2990() {
        if (field654 >= 0 && field753[field654] != null) {
            method1938(field753[field654], false);
        }
    }

    @ObfuscatedName("cd.ge(B)V")
    public static void method1917() {
        int var0 = class90.field1235;
        int[] var1 = class90.field1239;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field654 != var1[var2] && field797 != var1[var2]) {
                method1938(field753[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("cr.gw(Lbi;ZI)V")
    public static void method1938(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1108() || arg0.field615) {
            return;
        }
        arg0.field602 = false;
        if ((field870 && class90.field1235 > 50 || class90.field1235 > 200) && arg1 && arg0.field980 == arg0.field935) {
            arg0.field602 = true;
        }
        int var2 = arg0.field986 >> 7;
        int var3 = arg0.field930 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method4525(0, 0, 0, false, arg0.field619);
        if (arg0.field610 != null && field645 >= arg0.field611 && field645 < arg0.field606) {
            arg0.field602 = false;
            arg0.field604 = method3522(arg0.field986, arg0.field930, Statics.field174);
            arg0.field934 = field645;
            Statics.field1304.method2793(Statics.field174, arg0.field986, arg0.field930, arg0.field604, 60, arg0, arg0.field931, var4, arg0.field623, arg0.field612, arg0.field613, arg0.field614);
            return;
        }
        if ((arg0.field986 & 0x7F) == 64 && (arg0.field930 & 0x7F) == 64) {
            if (field735 == field734[var2][var3]) {
                return;
            }
            field734[var2][var3] = field735;
        }
        arg0.field604 = method3522(arg0.field986, arg0.field930, Statics.field174);
        arg0.field934 = field645;
        Statics.field1304.method2792(Statics.field174, arg0.field986, arg0.field930, arg0.field604, 60, arg0, arg0.field931, var4, arg0.field932);
    }

    @ObfuscatedName("r.gg(ZB)V")
    public static final void method46(boolean arg0) {
        for (int var1 = 0; var1 < field733; var1++) {
            class80 var2 = field678[field680[var1]];
            if (var2 != null && var2.method1108() && var2.field1114.field3460 == arg0 && var2.field1114.method4274()) {
                int var3 = var2.field986 >> 7;
                int var4 = var2.field930 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field933 == 1 && (var2.field986 & 0x7F) == 64 && (var2.field930 & 0x7F) == 64) {
                        if (field735 == field734[var3][var4]) {
                            continue;
                        }
                        field734[var3][var4] = field735;
                    }
                    long var5 = class129.method4525(0, 0, 1, !var2.field1114.field3482, field680[var1]);
                    var2.field934 = field645;
                    Statics.field1304.method2792(Statics.field174, var2.field986, var2.field930, method3522(var2.field986 + (var2.field933 * 64 - 64), var2.field930 + (var2.field933 * 64 - 64), Statics.field174), var2.field933 * 64 - 64 + 60, var2, var2.field931, var5, var2.field932);
                }
            }
        }
    }

    @ObfuscatedName("ce.gn(I)V")
    public static final void method2022() {
        for (class87 var0 = (class87) field795.method4431(); var0 != null; var0 = (class87) field795.method4454()) {
            if (Statics.field174 != var0.field1206 || field645 > var0.field1204) {
                var0.method3249();
            } else if (field645 >= var0.field1213) {
                if (var0.field1207 > 0) {
                    class80 var1 = field678[var0.field1207 - 1];
                    if (var1 != null && var1.field986 >= 0 && var1.field986 < 13312 && var1.field930 >= 0 && var1.field930 < 13312) {
                        var0.method1920(var1.field986, var1.field930, method3522(var1.field986, var1.field930, var0.field1206) - var0.field1202, field645);
                    }
                }
                if (var0.field1207 < 0) {
                    int var2 = -var0.field1207 - 1;
                    class67 var3;
                    if (field797 == var2) {
                        var3 = Statics.field2737;
                    } else {
                        var3 = field753[var2];
                    }
                    if (var3 != null && var3.field986 >= 0 && var3.field986 < 13312 && var3.field930 >= 0 && var3.field930 < 13312) {
                        var0.method1920(var3.field986, var3.field930, method3522(var3.field986, var3.field930, var0.field1206) - var0.field1202, field645);
                    }
                }
                var0.method1919(field699);
                Statics.field1304.method2792(Statics.field174, (int) var0.field1201, (int) var0.field1220, (int) var0.field1211, 60, var0, var0.field1217, -1L, false);
            }
        }
    }

    @ObfuscatedName("hh.gd(B)I")
    public static final int method3553() {
        if (Statics.field3112.field1037) {
            return Statics.field174;
        } else {
            int var0 = method3522(Statics.field627, Statics.field185, Statics.field174);
            return var0 - Statics.field1255 >= 800 || (class56.field498[Statics.field174][Statics.field627 >> 7][Statics.field185 >> 7] & 0x4) == 0 ? 3 : Statics.field174;
        }
    }

    @ObfuscatedName("be.gi(III)V")
    public static final void method1075(int arg0, int arg1) {
        if (field653 == 2) {
            method3635((field656 - Statics.field2734 << 7) + field659, (field657 - Statics.field3631 << 7) + field681, field658 * 2);
            if (field736 > -1 && field645 % 20 < 10) {
                Statics.field1308[0].method5605(field736 + arg0 - 12, field728 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("t.gt(I)Z")
    public static boolean method181() {
        return (field757 & 0x8) != 0;
    }

    @ObfuscatedName("c.gl(Lbi;B)Z")
    public static boolean method120(class67 arg0) {
        if (field757 == 0) {
            return false;
        } else if (Statics.field2737 == arg0) {
            return method181();
        } else {
            boolean var1 = (field757 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field757 & 0x1) != 0;
                var2 = var3 && arg0.method1097();
            }
            boolean var4 = var2;
            if (!var2) {
                boolean var5 = (field757 & 0x2) != 0;
                var4 = var5 && arg0.method1100();
            }
            return var4;
        }
    }

    @ObfuscatedName("le.gs(Lby;IIIIII)V")
    public static final void method5339(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1108()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1114;
            if (var6.field3463 != null) {
                var6 = var6.method4273();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1235;
        int[] var8 = class90.field1239;
        byte var9 = 0;
        if (arg1 < var7 && field645 == arg0.field934 && method120((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                method1633(arg0, arg0.field943 + 15);
                class296 var11 = (class296) field796.get(class292.field3647);
                byte var12 = 9;
                var11.method4855(var10.field599.method4712(), field736 + arg2, field728 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field955.method4367()) {
            method1633(arg0, arg0.field943 + 15);
            for (class79 var14 = (class79) arg0.field955.method4385(); var14 != null; var14 = (class79) arg0.field955.method4365()) {
                class71 var15 = var14.method1851(field645);
                if (var15 != null) {
                    class247 var16 = var14.field1110;
                    class325 var17 = var16.method4045();
                    class325 var18 = var16.method4031();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3257;
                    } else {
                        if (var16.field3270 * 2 < var18.field3870) {
                            var19 = var16.field3270;
                        }
                        var20 = var18.field3870 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field645 - var15.field991;
                    int var24 = var15.field992 * var20 / var16.field3257;
                    int var27;
                    if (var15.field993 > var23) {
                        int var25 = var16.field3265 == 0 ? 0 : var23 / var16.field3265 * var16.field3265;
                        int var26 = var15.field990 * var20 / var16.field3257;
                        var27 = (var24 - var26) * var25 / var15.field993 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field993 + var16.field3266 - var23;
                        if (var16.field3256 >= 0) {
                            var21 = (var28 << 8) / (var16.field3266 - var16.field3256);
                        }
                    }
                    if (var15.field992 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field736 > -1) {
                            int var34 = field736 + arg2 - (var20 >> 1);
                            int var35 = field728 + arg3 - var13;
                            class321.method5497(var34, var35, var27, 5, 65280);
                            class321.method5497(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3871;
                        var13 += var30;
                        int var31 = field736 + arg2 - (var20 >> 1);
                        int var32 = field728 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5560(var33, var32, var21);
                            class321.method5506(var33, var32, var29 + var33, var30 + var32);
                            var18.method5560(var33, var32, var21);
                        } else {
                            var17.method5605(var33, var32);
                            class321.method5506(var33, var32, var29 + var33, var30 + var32);
                            var18.method5605(var33, var32);
                        }
                        class321.method5502(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1846()) {
                    var14.method3249();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class67 var37 = (class67) arg0;
            if (var37.field615) {
                return;
            }
            if (var37.field598 != -1 || var37.field605 != -1) {
                method1633(arg0, arg0.field943 + 15);
                if (field736 > -1) {
                    if (var37.field598 != -1) {
                        var36 += 25;
                        Statics.field3293[var37.field598].method5605(field736 + arg2 - 12, field728 + arg3 - var36);
                    }
                    if (var37.field605 != -1) {
                        var36 += 25;
                        Statics.field249[var37.field605].method5605(field736 + arg2 - 12, field728 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field653 == 10 && field655 == var8[arg1]) {
                method1633(arg0, arg0.field943 + 15);
                if (field736 > -1) {
                    int var38 = Statics.field1308[1].field3871 + var36;
                    Statics.field1308[1].method5605(field736 + arg2 - 12, field728 + arg3 - var38);
                }
            }
        } else {
            class257 var39 = ((class80) arg0).field1114;
            if (var39.field3463 != null) {
                var39 = var39.method4273();
            }
            if (var39.field3477 >= 0 && var39.field3477 < Statics.field249.length) {
                method1633(arg0, arg0.field943 + 15);
                if (field736 > -1) {
                    Statics.field249[var39.field3477].method5605(field736 + arg2 - 12, field728 + arg3 - 30);
                }
            }
            if (field653 == 1 && field875 == field680[arg1 - var7] && field645 % 20 < 10) {
                method1633(arg0, arg0.field943 + 15);
                if (field736 > -1) {
                    Statics.field1308[0].method5605(field736 + arg2 - 12, field728 + arg3 - 28);
                }
            }
        }
        if (arg0.field929 != null && (arg1 >= var7 || !arg0.field945 && (field853 == 4 || !arg0.field944 && (field853 == 0 || field853 == 3 || field853 == 1 && ((class67) arg0).method1097())))) {
            method1633(arg0, arg0.field943);
            if (field736 > -1 && field724 < field725) {
                field729[field724] = Statics.field2079.method4847(arg0.field929) / 2;
                field643[field724] = Statics.field2079.field3670;
                field713[field724] = field736;
                field705[field724] = field728;
                field730[field724] = arg0.field947;
                field872[field724] = arg0.field948;
                field732[field724] = arg0.field988;
                field697[field724] = arg0.field929;
                field724++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field952[var40];
            int var42 = arg0.field957[var40];
            class253 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field645) {
                    continue;
                }
                int var45 = arg0.field957[var40];
                class253 var46 = (class253) class253.field3321.method2992((long) var45);
                class253 var47;
                if (var46 == null) {
                    byte[] var48 = Statics.field3316.method3726(32, var45);
                    class253 var49 = new class253();
                    if (var48 != null) {
                        var49.method4109(new class300(var48));
                    }
                    class253.field3321.method2994(var49, (long) var45);
                    var47 = var49;
                } else {
                    var47 = var46;
                }
                var43 = var47;
                var44 = var47.field3319;
                if (var47 != null && var47.field3330 != null) {
                    var43 = var47.method4135();
                    if (var43 == null) {
                        arg0.field952[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var50 = arg0.field953[var40];
            class253 var51 = null;
            if (var50 >= 0) {
                class253 var52 = (class253) class253.field3321.method2992((long) var50);
                class253 var53;
                if (var52 == null) {
                    byte[] var54 = Statics.field3316.method3726(32, var50);
                    class253 var55 = new class253();
                    if (var54 != null) {
                        var55.method4109(new class300(var54));
                    }
                    class253.field3321.method2994(var55, (long) var50);
                    var53 = var55;
                } else {
                    var53 = var52;
                }
                var51 = var53;
                if (var53 != null && var53.field3330 != null) {
                    var51 = var53.method4135();
                }
            }
            if (var41 - var44 <= field645) {
                if (var43 == null) {
                    arg0.field952[var40] = -1;
                } else {
                    method1633(arg0, arg0.field943 / 2);
                    if (field736 > -1) {
                        if (var40 == 1) {
                            field728 -= 20;
                        }
                        if (var40 == 2) {
                            field736 -= 15;
                            field728 -= 10;
                        }
                        if (var40 == 3) {
                            field736 += 15;
                            field728 -= 10;
                        }
                        Object var56 = null;
                        Object var57 = null;
                        Object var58 = null;
                        Object var59 = null;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        class325 var68 = null;
                        class325 var69 = null;
                        class325 var70 = null;
                        class325 var71 = null;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        class325 var81 = var43.method4116();
                        if (var81 != null) {
                            var60 = var81.field3870;
                            int var82 = var81.field3871;
                            if (var82 > var80) {
                                var80 = var82;
                            }
                            var64 = var81.field3872;
                        }
                        class325 var83 = var43.method4113();
                        if (var83 != null) {
                            var61 = var83.field3870;
                            int var84 = var83.field3871;
                            if (var84 > var80) {
                                var80 = var84;
                            }
                            var65 = var83.field3872;
                        }
                        class325 var85 = var43.method4114();
                        if (var85 != null) {
                            var62 = var85.field3870;
                            int var86 = var85.field3871;
                            if (var86 > var80) {
                                var80 = var86;
                            }
                            var66 = var85.field3872;
                        }
                        class325 var87 = var43.method4138();
                        if (var87 != null) {
                            var63 = var87.field3870;
                            int var88 = var87.field3871;
                            if (var88 > var80) {
                                var80 = var88;
                            }
                            var67 = var87.field3872;
                        }
                        if (var51 != null) {
                            var68 = var51.method4116();
                            if (var68 != null) {
                                var72 = var68.field3870;
                                int var89 = var68.field3871;
                                if (var89 > var80) {
                                    var80 = var89;
                                }
                                var76 = var68.field3872;
                            }
                            var69 = var51.method4113();
                            if (var69 != null) {
                                var73 = var69.field3870;
                                int var90 = var69.field3871;
                                if (var90 > var80) {
                                    var80 = var90;
                                }
                                var77 = var69.field3872;
                            }
                            var70 = var51.method4114();
                            if (var70 != null) {
                                var74 = var70.field3870;
                                int var91 = var70.field3871;
                                if (var91 > var80) {
                                    var80 = var91;
                                }
                                var78 = var70.field3872;
                            }
                            var71 = var51.method4138();
                            if (var71 != null) {
                                var75 = var71.field3870;
                                int var92 = var71.field3871;
                                if (var92 > var80) {
                                    var80 = var92;
                                }
                                var79 = var71.field3872;
                            }
                        }
                        class295 var93 = var43.method4112();
                        if (var93 == null) {
                            var93 = Statics.field633;
                        }
                        class295 var94;
                        if (var51 == null) {
                            var94 = Statics.field633;
                        } else {
                            var94 = var51.method4112();
                            if (var94 == null) {
                                var94 = Statics.field633;
                            }
                        }
                        Object var95 = null;
                        String var96 = null;
                        boolean var97 = false;
                        int var98 = 0;
                        String var99 = var43.method4111(arg0.field959[var40]);
                        int var100 = var93.method4847(var99);
                        if (var51 != null) {
                            var96 = var51.method4111(arg0.field962[var40]);
                            var98 = var94.method4847(var96);
                        }
                        int var101 = 0;
                        int var102 = 0;
                        if (var61 > 0) {
                            if (var85 == null && var87 == null) {
                                var101 = 1;
                            } else {
                                var101 = var100 / var61 + 1;
                            }
                        }
                        if (var51 != null && var73 > 0) {
                            if (var70 == null && var71 == null) {
                                var102 = 1;
                            } else {
                                var102 = var98 / var73 + 1;
                            }
                        }
                        int var103 = 0;
                        int var104 = var103;
                        if (var60 > 0) {
                            var103 += var60;
                        }
                        var103 += 2;
                        int var105 = var103;
                        if (var62 > 0) {
                            var103 += var62;
                        }
                        int var106 = var103;
                        int var107 = var103;
                        int var109;
                        if (var61 > 0) {
                            int var108 = var61 * var101;
                            var109 = var103 + var108;
                            var107 = (var108 - var100) / 2 + var103;
                        } else {
                            var109 = var100 + var103;
                        }
                        int var110 = var109;
                        if (var63 > 0) {
                            var109 += var63;
                        }
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        if (var51 != null) {
                            var109 += 2;
                            var111 = var109;
                            if (var72 > 0) {
                                var109 += var72;
                            }
                            var109 += 2;
                            var112 = var109;
                            if (var74 > 0) {
                                var109 += var74;
                            }
                            var113 = var109;
                            var115 = var109;
                            if (var73 > 0) {
                                int var116 = var73 * var102;
                                var109 += var116;
                                var115 += (var116 - var98) / 2;
                            } else {
                                var109 += var98;
                            }
                            var114 = var109;
                            if (var75 > 0) {
                                var109 += var75;
                            }
                        }
                        int var117 = arg0.field952[var40] - field645;
                        int var118 = var43.field3324 - var43.field3324 * var117 / var43.field3319;
                        int var119 = var43.field3312 * var117 / var43.field3319 + -var43.field3312;
                        int var120 = field736 + arg2 - (var109 >> 1) + var118;
                        int var121 = field728 + arg3 - 12 + var119;
                        int var122 = var121;
                        int var123 = var80 + var121;
                        int var124 = var43.field3335 + var121 + 15;
                        int var125 = var124 - var93.field3673;
                        int var126 = var93.field3681 + var124;
                        if (var125 < var121) {
                            var122 = var125;
                        }
                        if (var126 > var123) {
                            var123 = var126;
                        }
                        int var127 = 0;
                        if (var51 != null) {
                            var127 = var51.field3335 + var121 + 15;
                            int var128 = var127 - var94.field3673;
                            int var129 = var94.field3681 + var127;
                            if (var128 < var122) {
                                ;
                            }
                            if (var129 > var123) {
                                ;
                            }
                        }
                        int var132 = 255;
                        if (var43.field3326 >= 0) {
                            var132 = (var117 << 8) / (var43.field3319 - var43.field3326);
                        }
                        if (var132 >= 0 && var132 < 255) {
                            if (var81 != null) {
                                var81.method5560(var104 + var120 - var64, var121, var132);
                            }
                            if (var85 != null) {
                                var85.method5560(var105 + var120 - var66, var121, var132);
                            }
                            if (var83 != null) {
                                for (int var133 = 0; var133 < var101; var133++) {
                                    var83.method5560(var61 * var133 + (var106 + var120 - var65), var121, var132);
                                }
                            }
                            if (var87 != null) {
                                var87.method5560(var110 + var120 - var67, var121, var132);
                            }
                            var93.method4896(var99, var107 + var120, var124, var43.field3310, 0, var132);
                            if (var51 != null) {
                                if (var68 != null) {
                                    var68.method5560(var111 + var120 - var76, var121, var132);
                                }
                                if (var70 != null) {
                                    var70.method5560(var112 + var120 - var78, var121, var132);
                                }
                                if (var69 != null) {
                                    for (int var134 = 0; var134 < var102; var134++) {
                                        var69.method5560(var73 * var134 + (var113 + var120 - var77), var121, var132);
                                    }
                                }
                                if (var71 != null) {
                                    var71.method5560(var114 + var120 - var79, var121, var132);
                                }
                                var94.method4896(var96, var115 + var120, var127, var51.field3310, 0, var132);
                            }
                        } else {
                            if (var81 != null) {
                                var81.method5605(var104 + var120 - var64, var121);
                            }
                            if (var85 != null) {
                                var85.method5605(var105 + var120 - var66, var121);
                            }
                            if (var83 != null) {
                                for (int var135 = 0; var135 < var101; var135++) {
                                    var83.method5605(var61 * var135 + (var106 + var120 - var65), var121);
                                }
                            }
                            if (var87 != null) {
                                var87.method5605(var110 + var120 - var67, var121);
                            }
                            var93.method4852(var99, var107 + var120, var124, var43.field3310 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var68 != null) {
                                    var68.method5605(var111 + var120 - var76, var121);
                                }
                                if (var70 != null) {
                                    var70.method5605(var112 + var120 - var78, var121);
                                }
                                if (var69 != null) {
                                    for (int var136 = 0; var136 < var102; var136++) {
                                        var69.method5605(var73 * var136 + (var113 + var120 - var77), var121);
                                    }
                                }
                                if (var71 != null) {
                                    var71.method5605(var114 + var120 - var79, var121);
                                }
                                var94.method4852(var96, var115 + var120, var127, var51.field3310 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.gm(IIIIB)V")
    public static final void method2689(int arg0, int arg1, int arg2, int arg3) {
        field724 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1235;
        int[] var8 = class90.field1239;
        for (int var9 = 0; var9 < field733 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = field753[var8[var9]];
                if (field654 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field2737 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field678[field680[var9 - var7]];
            }
            method5339(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field775 && var6 != -1) {
            method5339(Statics.field2737, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method5339(field753[field654], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field724; var11++) {
            int var12 = field713[var11];
            int var13 = field705[var11];
            int var14 = field729[var11];
            int var15 = field643[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field705[var17] - field643[var17] && var13 - var15 < field705[var17] + 2 && var12 - var14 < field729[var17] + field713[var17] && var12 + var14 > field713[var17] - field729[var17] && field705[var17] - field643[var17] < var13) {
                        var13 = field705[var17] - field643[var17];
                        var16 = true;
                    }
                }
            }
            field736 = field713[var11];
            field728 = field705[var11] = var13;
            String var18 = field697[var11];
            if (field801 == 0) {
                int var19 = 16776960;
                if (field730[var11] < 6) {
                    var19 = field852[field730[var11]];
                }
                if (field730[var11] == 6) {
                    var19 = field735 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field730[var11] == 7) {
                    var19 = field735 % 20 < 10 ? 255 : 65535;
                }
                if (field730[var11] == 8) {
                    var19 = field735 % 20 < 10 ? 45056 : 8454016;
                }
                if (field730[var11] == 9) {
                    int var20 = 150 - field732[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field730[var11] == 10) {
                    int var21 = 150 - field732[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field730[var11] == 11) {
                    int var22 = 150 - field732[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field872[var11] == 0) {
                    Statics.field2079.method4855(var18, field736 + arg0, field728 + arg1, var19, 0);
                }
                if (field872[var11] == 1) {
                    Statics.field2079.method4888(var18, field736 + arg0, field728 + arg1, var19, 0, field735);
                }
                if (field872[var11] == 2) {
                    Statics.field2079.method4883(var18, field736 + arg0, field728 + arg1, var19, 0, field735);
                }
                if (field872[var11] == 3) {
                    Statics.field2079.method4859(var18, field736 + arg0, field728 + arg1, var19, 0, field735, 150 - field732[var11]);
                }
                if (field872[var11] == 4) {
                    int var23 = (150 - field732[var11]) * (Statics.field2079.method4847(var18) + 100) / 150;
                    class321.method5506(field736 + arg0 - 50, arg1, field736 + arg0 + 50, arg1 + arg3);
                    Statics.field2079.method4852(var18, field736 + arg0 + 50 - var23, field728 + arg1, var19, 0);
                    class321.method5502(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field872[var11] == 5) {
                    int var24 = 150 - field732[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class321.method5506(arg0, field728 + arg1 - Statics.field2079.field3670 - 1, arg0 + arg2, field728 + arg1 + 5);
                    Statics.field2079.method4855(var18, field736 + arg0, field728 + arg1 + var25, var19, 0);
                    class321.method5502(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2079.method4855(var18, field736 + arg0, field728 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bo.ga(Lby;II)V")
    public static final void method1633(class70 arg0, int arg1) {
        method3635(arg0.field986, arg0.field930, arg1);
    }

    @ObfuscatedName("hr.go(IIII)V")
    public static final void method3635(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field736 = -1;
            field728 = -1;
            return;
        }
        int var3 = method3522(arg0, arg1, Statics.field174) - arg2;
        int var4 = arg0 - Statics.field627;
        int var5 = var3 - Statics.field1255;
        int var6 = arg1 - Statics.field185;
        int var7 = class131.field1747[Statics.field3584];
        int var8 = class131.field1730[Statics.field3584];
        int var9 = class131.field1747[Statics.field195];
        int var10 = class131.field1730[Statics.field195];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field736 = field899 * var11 / var15 + field897 / 2;
            field728 = field899 * var14 / var15 + field898 / 2;
        } else {
            field736 = -1;
            field728 = -1;
        }
    }

    @ObfuscatedName("gp.gf(IIII)I")
    public static final int method3522(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field498[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field491[var5][var3][var4] + class56.field491[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field491[var5][var3][var4 + 1] + class56.field491[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("il.gr(IIIIIIII)V")
    public static final void method4269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field754 - field905) * var7 / 100 + field905;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class131.field1747[var11];
            int var17 = class131.field1730[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class131.field1747[var12];
            int var20 = class131.field1730[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field627 = arg0 - var13;
        Statics.field1255 = arg1 - var14;
        Statics.field185 = arg2 - var15;
        Statics.field3584 = arg3;
        Statics.field195 = arg4;
        if (field712 == 1 && field806 >= 2 && field645 % 50 == 0 && (Statics.field1069 >> 7 != Statics.field2737.field986 >> 7 || Statics.field90 >> 7 != Statics.field2737.field930 >> 7)) {
            int var22 = Statics.field2737.field624;
            int var23 = (Statics.field1069 >> 7) + Statics.field2734;
            int var24 = (Statics.field90 >> 7) + Statics.field3631;
            method4776(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("hj.gb(ZLkf;I)V")
    public static final void method3717(boolean arg0, class299 arg1) {
        field748 = arg0;
        if (!field748) {
            int var2 = arg1.method5195();
            int var3 = arg1.method5027();
            int var4 = arg1.method4992();
            Statics.field3688 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3688[var5][var6] = arg1.method5085();
                }
            }
            Statics.field476 = new int[var4];
            Statics.field2392 = new int[var4];
            Statics.field540 = new int[var4];
            Statics.field184 = new byte[var4][];
            Statics.field524 = new byte[var4][];
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
                        Statics.field476[var8] = var11;
                        Statics.field2392[var8] = Statics.field11.method3765("m" + var9 + "_" + var10);
                        Statics.field540[var8] = Statics.field11.method3765("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4784(var2, var3, true);
            return;
        }
        int var12 = arg1.method4992();
        boolean var13 = arg1.method5059() == 1;
        int var14 = arg1.method5195();
        int var15 = arg1.method4992();
        arg1.method4959();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method4947(1);
                    if (var19 == 1) {
                        field720[var16][var17][var18] = arg1.method4947(26);
                    } else {
                        field720[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method4945();
        Statics.field3688 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field3688[var20][var21] = arg1.method5085();
            }
        }
        Statics.field476 = new int[var15];
        Statics.field2392 = new int[var15];
        Statics.field540 = new int[var15];
        Statics.field184 = new byte[var15][];
        Statics.field524 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field720[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field476[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field476[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2392[var22] = Statics.field11.method3765("m" + var31 + "_" + var32);
                            Statics.field540[var22] = Statics.field11.method3765("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4784(var14, var12, !var13);
    }

    @ObfuscatedName("ks.gu(IIZI)V")
    public static final void method4784(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2132 == arg0 && Statics.field2423 == arg1) {
            return;
        }
        Statics.field2132 = arg0;
        Statics.field2423 = arg1;
        method1056(25);
        method369(class225.field2750, true);
        int var3 = Statics.field2734;
        int var4 = Statics.field3631;
        Statics.field2734 = (arg0 - 6) * 8;
        Statics.field3631 = (arg1 - 6) * 8;
        int var5 = Statics.field2734 - var3;
        int var6 = Statics.field3631 - var4;
        int var7 = Statics.field2734;
        int var8 = Statics.field3631;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field678[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field985[var11] -= var5;
                    var10.field960[var11] -= var6;
                }
                var10.field986 -= var5 * 128;
                var10.field930 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field753[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field985[var14] -= var5;
                    var13.field960[var14] -= var6;
                }
                var13.field986 -= var5 * 128;
                var13.field930 -= var6 * 128;
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
                        field765[var25][var21][var22] = field765[var25][var23][var24];
                    } else {
                        field765[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field766.method4431(); var26 != null; var26 = (class69) field766.method4454()) {
            var26.field913 -= var5;
            var26.field916 -= var6;
            if (var26.field913 < 0 || var26.field916 < 0 || var26.field913 >= 104 || var26.field916 >= 104) {
                var26.method3249();
            }
        }
        if (field865 != 0) {
            field865 -= var5;
            field790 -= var6;
        }
        field850 = 0;
        field849 = false;
        Statics.field627 -= var5 << 7;
        Statics.field185 -= var6 << 7;
        Statics.field1069 -= var5 << 7;
        Statics.field90 -= var6 << 7;
        field644 = -1;
        field768.method4432();
        field795.method4432();
        for (int var27 = 0; var27 < 4; var27++) {
            field798[var27].method3209();
        }
    }

    @ObfuscatedName("i.gc(ZI)V")
    public static final void method115(boolean arg0) {
        method506();
        field668.field1299++;
        if (field668.field1299 < 50 && !arg0) {
            return;
        }
        field668.field1299 = 0;
        if (field731 || field668.method2042() == null) {
            return;
        }
        class188 var1 = class188.method1039(class184.field2208, field668.field1293);
        field668.method2040(var1);
        try {
            field668.method2037();
        } catch (IOException var3) {
            field731 = true;
        }
    }

    @ObfuscatedName("ah.gk(I)V")
    public static final void method695() {
        method115(false);
        field690 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field184.length; var1++) {
            if (Statics.field2392[var1] != -1 && Statics.field184[var1] == null) {
                Statics.field184[var1] = Statics.field11.method3726(Statics.field2392[var1], 0);
                if (Statics.field184[var1] == null) {
                    var0 = false;
                    field690++;
                }
            }
            if (Statics.field540[var1] != -1 && Statics.field524[var1] == null) {
                Statics.field524[var1] = Statics.field11.method3727(Statics.field540[var1], 0, Statics.field3688[var1]);
                if (Statics.field524[var1] == null) {
                    var0 = false;
                    field690++;
                }
            }
        }
        if (!var0) {
            field694 = 1;
            return;
        }
        field692 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field184.length; var3++) {
            byte[] var4 = Statics.field524[var3];
            if (var4 != null) {
                int var5 = (Statics.field476[var3] >> 8) * 64 - Statics.field2734;
                int var6 = (Statics.field476[var3] & 0xFF) * 64 - Statics.field3631;
                if (field748) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class300 var9 = new class300(var4);
                int var10 = -1;
                label1086: while (true) {
                    int var11 = var9.method5005();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method5004();
                            if (var16 == 0) {
                                continue label1086;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method4990() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class254 var22 = class254.method1148(var10);
                                if (var19 != 22 || !field870 || var22.field3356 != 0 || var22.field3368 == 1 || var22.field3375) {
                                    if (!var22.method4146()) {
                                        field692++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method5004();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method4990();
                    }
                }
            }
        }
        if (!var2) {
            field694 = 2;
            return;
        }
        if (field694 != 0) {
            method369(class225.field2750 + class82.field1134 + class82.field1133 + 100 + "%" + class82.field1135, true);
        }
        method506();
        Statics.field1304.method2808();
        for (int var23 = 0; var23 < 4; var23++) {
            field798[var23].method3209();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class56.field498[var24][var25][var26] = 0;
                }
            }
        }
        method506();
        class56.method2492();
        int var27 = Statics.field184.length;
        class76.method3258();
        method115(true);
        if (!field748) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field476[var28] >> 8) * 64 - Statics.field2734;
                int var30 = (Statics.field476[var28] & 0xFF) * 64 - Statics.field3631;
                byte[] var31 = Statics.field184[var28];
                if (var31 != null) {
                    method506();
                    class56.method654(var31, var29, var30, Statics.field2132 * 8 - 48, Statics.field2423 * 8 - 48, field798);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field476[var32] >> 8) * 64 - Statics.field2734;
                int var34 = (Statics.field476[var32] & 0xFF) * 64 - Statics.field3631;
                byte[] var35 = Statics.field184[var32];
                if (var35 == null && Statics.field2423 < 800) {
                    method506();
                    class56.method497(var33, var34, 64, 64);
                }
            }
            method115(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field524[var36];
                if (var37 != null) {
                    int var38 = (Statics.field476[var36] >> 8) * 64 - Statics.field2734;
                    int var39 = (Statics.field476[var36] & 0xFF) * 64 - Statics.field3631;
                    method506();
                    class134 var40 = Statics.field1304;
                    class173[] var41 = field798;
                    class300 var42 = new class300(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method5005();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method5004();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method4990();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class56.field498[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class173 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class56.method151(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field748) {
            for (int var57 = 0; var57 < 4; var57++) {
                method506();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field720[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field476.length; var67++) {
                                if (Statics.field476[var67] == var66 && Statics.field184[var67] != null) {
                                    byte[] var68 = Statics.field184[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class173[] var73 = field798;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field2065[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class300 var76 = new class300(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    int var83 = var78 & 0x7;
                                                    int var84 = var79 & 0x7;
                                                    int var86 = var63 & 0x3;
                                                    int var87;
                                                    if (var86 == 0) {
                                                        var87 = var83;
                                                    } else if (var86 == 1) {
                                                        var87 = var84;
                                                    } else if (var86 == 2) {
                                                        var87 = 7 - var83;
                                                    } else {
                                                        var87 = 7 - var84;
                                                    }
                                                    int var90 = var69 + var87;
                                                    int var92 = var78 & 0x7;
                                                    int var93 = var79 & 0x7;
                                                    int var95 = var63 & 0x3;
                                                    int var96;
                                                    if (var95 == 0) {
                                                        var96 = var93;
                                                    } else if (var95 == 1) {
                                                        var96 = 7 - var92;
                                                    } else if (var95 == 2) {
                                                        var96 = 7 - var93;
                                                    } else {
                                                        var96 = var92;
                                                    }
                                                    Statics.method59(var76, var57, var90, var70 + var96, 0, 0, var63);
                                                } else {
                                                    Statics.method59(var76, 0, -1, -1, 0, 0, 0);
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
                            class56.method505(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var97 = 0; var97 < 13; var97++) {
                for (int var98 = 0; var98 < 13; var98++) {
                    int var99 = field720[0][var97][var98];
                    if (var99 == -1) {
                        class56.method497(var97 * 8, var98 * 8, 8, 8);
                    }
                }
            }
            method115(true);
            for (int var100 = 0; var100 < 4; var100++) {
                method506();
                for (int var101 = 0; var101 < 13; var101++) {
                    for (int var102 = 0; var102 < 13; var102++) {
                        int var103 = field720[var100][var101][var102];
                        if (var103 != -1) {
                            int var104 = var103 >> 24 & 0x3;
                            int var105 = var103 >> 1 & 0x3;
                            int var106 = var103 >> 14 & 0x3FF;
                            int var107 = var103 >> 3 & 0x7FF;
                            int var108 = (var106 / 8 << 8) + var107 / 8;
                            for (int var109 = 0; var109 < Statics.field476.length; var109++) {
                                if (Statics.field476[var109] == var108 && Statics.field524[var109] != null) {
                                    class56.method1858(Statics.field524[var109], var100, var101 * 8, var102 * 8, var104, (var106 & 0x7) * 8, (var107 & 0x7) * 8, var105, Statics.field1304, field798);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method115(true);
        method506();
        class134 var110 = Statics.field1304;
        class173[] var111 = field798;
        for (int var112 = 0; var112 < 4; var112++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class56.field498[var112][var113][var114] & 0x1) == 1) {
                        int var115 = var112;
                        if ((class56.field498[1][var113][var114] & 0x2) == 2) {
                            var115 = var112 - 1;
                        }
                        if (var115 >= 0) {
                            var111[var115].method3192(var113, var114);
                        }
                    }
                }
            }
        }
        class56.field483 += (int) (Math.random() * 5.0D) - 2;
        if (class56.field483 < -8) {
            class56.field483 = -8;
        }
        if (class56.field483 > 8) {
            class56.field483 = 8;
        }
        class56.field497 += (int) (Math.random() * 5.0D) - 2;
        if (class56.field497 < -16) {
            class56.field497 = -16;
        }
        if (class56.field497 > 16) {
            class56.field497 = 16;
        }
        for (int var116 = 0; var116 < 4; var116++) {
            byte[][] var117 = Statics.field487[var116];
            int var118 = (int) Math.sqrt(5100.0D);
            int var119 = var118 * 768 >> 8;
            for (int var120 = 1; var120 < 103; var120++) {
                for (int var121 = 1; var121 < 103; var121++) {
                    int var122 = class56.field491[var116][var121 + 1][var120] - class56.field491[var116][var121 - 1][var120];
                    int var123 = class56.field491[var116][var121][var120 + 1] - class56.field491[var116][var121][var120 - 1];
                    int var124 = (int) Math.sqrt((double) (var123 * var123 + var122 * var122 + 65536));
                    int var125 = (var122 << 8) / var124;
                    int var126 = 65536 / var124;
                    int var127 = (var123 << 8) / var124;
                    int var128 = (var127 * -50 + var125 * -50 + var126 * -10) / var119 + 96;
                    int var129 = (var117[var121][var120] >> 1) + (var117[var121][var120 + 1] >> 3) + (var117[var121][var120 - 1] >> 2) + (var117[var121 - 1][var120] >> 2) + (var117[var121 + 1][var120] >> 3);
                    Statics.field387[var121][var120] = var128 - var129;
                }
            }
            for (int var130 = 0; var130 < 104; var130++) {
                Statics.field486[var130] = 0;
                Statics.field526[var130] = 0;
                Statics.field480[var130] = 0;
                Statics.field3648[var130] = 0;
                Statics.field488[var130] = 0;
            }
            for (int var131 = -5; var131 < 109; var131++) {
                for (int var132 = 0; var132 < 104; var132++) {
                    int var133 = var131 + 5;
                    int var10002;
                    if (var133 >= 0 && var133 < 104) {
                        int var134 = Statics.field502[var116][var133][var132] & 0xFF;
                        if (var134 > 0) {
                            class245 var135 = class245.method3057(var134 - 1);
                            Statics.field486[var132] += var135.field3236;
                            Statics.field526[var132] += var135.field3234;
                            Statics.field480[var132] += var135.field3238;
                            Statics.field3648[var132] += var135.field3239;
                            var10002 = Statics.field488[var132]++;
                        }
                    }
                    int var136 = var131 - 5;
                    if (var136 >= 0 && var136 < 104) {
                        int var137 = Statics.field502[var116][var136][var132] & 0xFF;
                        if (var137 > 0) {
                            class245 var138 = class245.method3057(var137 - 1);
                            Statics.field486[var132] -= var138.field3236;
                            Statics.field526[var132] -= var138.field3234;
                            Statics.field480[var132] -= var138.field3238;
                            Statics.field3648[var132] -= var138.field3239;
                            var10002 = Statics.field488[var132]--;
                        }
                    }
                }
                if (var131 >= 1 && var131 < 103) {
                    int var139 = 0;
                    int var140 = 0;
                    int var141 = 0;
                    int var142 = 0;
                    int var143 = 0;
                    for (int var144 = -5; var144 < 109; var144++) {
                        int var145 = var144 + 5;
                        if (var145 >= 0 && var145 < 104) {
                            var139 += Statics.field486[var145];
                            var140 += Statics.field526[var145];
                            var141 += Statics.field480[var145];
                            var142 += Statics.field3648[var145];
                            var143 += Statics.field488[var145];
                        }
                        int var146 = var144 - 5;
                        if (var146 >= 0 && var146 < 104) {
                            var139 -= Statics.field486[var146];
                            var140 -= Statics.field526[var146];
                            var141 -= Statics.field480[var146];
                            var142 -= Statics.field3648[var146];
                            var143 -= Statics.field488[var146];
                        }
                        if (var144 >= 1 && var144 < 103 && (!field870 || (class56.field498[0][var131][var144] & 0x2) != 0 || (class56.field498[var116][var131][var144] & 0x10) == 0)) {
                            if (var116 < class56.field482) {
                                class56.field482 = var116;
                            }
                            int var147 = Statics.field502[var116][var131][var144] & 0xFF;
                            int var148 = Statics.field484[var116][var131][var144] & 0xFF;
                            if (var147 > 0 || var148 > 0) {
                                int var149 = class56.field491[var116][var131][var144];
                                int var150 = class56.field491[var116][var131 + 1][var144];
                                int var151 = class56.field491[var116][var131 + 1][var144 + 1];
                                int var152 = class56.field491[var116][var131][var144 + 1];
                                int var153 = Statics.field387[var131][var144];
                                int var154 = Statics.field387[var131 + 1][var144];
                                int var155 = Statics.field387[var131 + 1][var144 + 1];
                                int var156 = Statics.field387[var131][var144 + 1];
                                int var157 = -1;
                                int var158 = -1;
                                if (var147 > 0) {
                                    int var159 = var139 * 256 / var142;
                                    int var160 = var140 / var143;
                                    int var161 = var141 / var143;
                                    var157 = Statics.method142(var159, var160, var161);
                                    int var162 = class56.field483 + var159 & 0xFF;
                                    int var163 = class56.field497 + var161;
                                    if (var163 < 0) {
                                        var163 = 0;
                                    } else if (var163 > 255) {
                                        var163 = 255;
                                    }
                                    var158 = Statics.method142(var162, var160, var163);
                                }
                                if (var116 > 0) {
                                    boolean var164 = true;
                                    if (var147 == 0 && Statics.field394[var116][var131][var144] != 0) {
                                        var164 = false;
                                    }
                                    if (var148 > 0) {
                                        int var165 = var148 - 1;
                                        class258 var166 = (class258) class258.field3498.method2992((long) var165);
                                        class258 var167;
                                        if (var166 == null) {
                                            byte[] var168 = Statics.field3494.method3726(4, var165);
                                            class258 var169 = new class258();
                                            if (var168 != null) {
                                                var169.method4305(new class300(var168), var165);
                                            }
                                            var169.method4313();
                                            class258.field3498.method2994(var169, (long) var165);
                                            var167 = var169;
                                        } else {
                                            var167 = var166;
                                        }
                                        if (!var167.field3488) {
                                            var164 = false;
                                        }
                                    }
                                    if (var164 && var149 == var150 && var149 == var151 && var149 == var152) {
                                        Statics.field489[var116][var131][var144] |= 0x924;
                                    }
                                }
                                int var170 = 0;
                                if (var158 != -1) {
                                    var170 = class131.field1751[class56.method3317(var158, 96)];
                                }
                                if (var148 == 0) {
                                    var110.method2823(var116, var131, var144, 0, 0, -1, var149, var150, var151, var152, class56.method3317(var157, var153), class56.method3317(var157, var154), class56.method3317(var157, var155), class56.method3317(var157, var156), 0, 0, 0, 0, var170, 0);
                                } else {
                                    int var171 = Statics.field394[var116][var131][var144] + 1;
                                    byte var172 = Statics.field3635[var116][var131][var144];
                                    int var173 = var148 - 1;
                                    class258 var174 = (class258) class258.field3498.method2992((long) var173);
                                    class258 var175;
                                    if (var174 == null) {
                                        byte[] var176 = Statics.field3494.method3726(4, var173);
                                        class258 var177 = new class258();
                                        if (var176 != null) {
                                            var177.method4305(new class300(var176), var173);
                                        }
                                        var177.method4313();
                                        class258.field3498.method2994(var177, (long) var173);
                                        var175 = var177;
                                    } else {
                                        var175 = var174;
                                    }
                                    int var179 = var175.field3489;
                                    int var180;
                                    int var181;
                                    if (var179 >= 0) {
                                        var180 = Statics.field1752.method2493(var179);
                                        var181 = -1;
                                    } else if (var175.field3490 == 16711935) {
                                        var181 = -2;
                                        var179 = -1;
                                        var180 = -2;
                                    } else {
                                        var181 = Statics.method142(var175.field3492, var175.field3495, var175.field3496);
                                        int var182 = class56.field483 + var175.field3492 & 0xFF;
                                        int var183 = class56.field497 + var175.field3496;
                                        if (var183 < 0) {
                                            var183 = 0;
                                        } else if (var183 > 255) {
                                            var183 = 255;
                                        }
                                        var180 = Statics.method142(var182, var175.field3495, var183);
                                    }
                                    int var184 = 0;
                                    if (var180 != -2) {
                                        var184 = class131.field1751[class56.method667(var180, 96)];
                                    }
                                    if (var175.field3493 != -1) {
                                        int var185 = class56.field483 + var175.field3497 & 0xFF;
                                        int var186 = class56.field497 + var175.field3499;
                                        if (var186 < 0) {
                                            var186 = 0;
                                        } else if (var186 > 255) {
                                            var186 = 255;
                                        }
                                        int var187 = Statics.method142(var185, var175.field3491, var186);
                                        var184 = class131.field1751[class56.method667(var187, 96)];
                                    }
                                    var110.method2823(var116, var131, var144, var171, var172, var179, var149, var150, var151, var152, class56.method3317(var157, var153), class56.method3317(var157, var154), class56.method3317(var157, var155), class56.method3317(var157, var156), class56.method667(var181, var153), class56.method667(var181, var154), class56.method667(var181, var155), class56.method667(var181, var156), var170, var184);
                                }
                            }
                        }
                    }
                }
            }
            for (int var188 = 1; var188 < 103; var188++) {
                for (int var189 = 1; var189 < 103; var189++) {
                    var110.method2865(var116, var189, var188, class56.method3289(var116, var189, var188));
                }
            }
            Statics.field502[var116] = (byte[][]) null;
            Statics.field484[var116] = (byte[][]) null;
            Statics.field394[var116] = (byte[][]) null;
            Statics.field3635[var116] = (byte[][]) null;
            Statics.field487[var116] = (byte[][]) null;
        }
        var110.method2806(-50, -10, -50);
        for (int var190 = 0; var190 < 104; var190++) {
            for (int var191 = 0; var191 < 104; var191++) {
                if ((class56.field498[1][var190][var191] & 0x2) == 2) {
                    var110.method2887(var190, var191);
                }
            }
        }
        int var192 = 1;
        int var193 = 2;
        int var194 = 4;
        for (int var195 = 0; var195 < 4; var195++) {
            if (var195 > 0) {
                var192 <<= 0x3;
                var193 <<= 0x3;
                var194 <<= 0x3;
            }
            for (int var196 = 0; var196 <= var195; var196++) {
                for (int var197 = 0; var197 <= 104; var197++) {
                    for (int var198 = 0; var198 <= 104; var198++) {
                        if ((Statics.field489[var196][var198][var197] & var192) != 0) {
                            int var199 = var197;
                            int var200 = var197;
                            int var201 = var196;
                            int var202 = var196;
                            while (var199 > 0 && (Statics.field489[var196][var198][var199 - 1] & var192) != 0) {
                                var199--;
                            }
                            while (var200 < 104 && (Statics.field489[var196][var198][var200 + 1] & var192) != 0) {
                                var200++;
                            }
                            label658: while (var201 > 0) {
                                for (int var203 = var199; var203 <= var200; var203++) {
                                    if ((Statics.field489[var201 - 1][var198][var203] & var192) == 0) {
                                        break label658;
                                    }
                                }
                                var201--;
                            }
                            label647: while (var202 < var195) {
                                for (int var204 = var199; var204 <= var200; var204++) {
                                    if ((Statics.field489[var202 + 1][var198][var204] & var192) == 0) {
                                        break label647;
                                    }
                                }
                                var202++;
                            }
                            int var205 = (var202 + 1 - var201) * (var200 - var199 + 1);
                            if (var205 >= 8) {
                                short var206 = 240;
                                int var207 = class56.field491[var202][var198][var199] - var206;
                                int var208 = class56.field491[var201][var198][var199];
                                class134.method2784(var195, 1, var198 * 128, var198 * 128, var199 * 128, var200 * 128 + 128, var207, var208);
                                for (int var209 = var201; var209 <= var202; var209++) {
                                    for (int var210 = var199; var210 <= var200; var210++) {
                                        Statics.field489[var209][var198][var210] &= ~var192;
                                    }
                                }
                            }
                        }
                        if ((Statics.field489[var196][var198][var197] & var193) != 0) {
                            int var211 = var198;
                            int var212 = var198;
                            int var213 = var196;
                            int var214 = var196;
                            while (var211 > 0 && (Statics.field489[var196][var211 - 1][var197] & var193) != 0) {
                                var211--;
                            }
                            while (var212 < 104 && (Statics.field489[var196][var212 + 1][var197] & var193) != 0) {
                                var212++;
                            }
                            label711: while (var213 > 0) {
                                for (int var215 = var211; var215 <= var212; var215++) {
                                    if ((Statics.field489[var213 - 1][var215][var197] & var193) == 0) {
                                        break label711;
                                    }
                                }
                                var213--;
                            }
                            label700: while (var214 < var195) {
                                for (int var216 = var211; var216 <= var212; var216++) {
                                    if ((Statics.field489[var214 + 1][var216][var197] & var193) == 0) {
                                        break label700;
                                    }
                                }
                                var214++;
                            }
                            int var217 = (var214 + 1 - var213) * (var212 - var211 + 1);
                            if (var217 >= 8) {
                                short var218 = 240;
                                int var219 = class56.field491[var214][var211][var197] - var218;
                                int var220 = class56.field491[var213][var211][var197];
                                class134.method2784(var195, 2, var211 * 128, var212 * 128 + 128, var197 * 128, var197 * 128, var219, var220);
                                for (int var221 = var213; var221 <= var214; var221++) {
                                    for (int var222 = var211; var222 <= var212; var222++) {
                                        Statics.field489[var221][var222][var197] &= ~var193;
                                    }
                                }
                            }
                        }
                        if ((Statics.field489[var196][var198][var197] & var194) != 0) {
                            int var223 = var198;
                            int var224 = var198;
                            int var225 = var197;
                            int var226 = var197;
                            while (var225 > 0 && (Statics.field489[var196][var198][var225 - 1] & var194) != 0) {
                                var225--;
                            }
                            while (var226 < 104 && (Statics.field489[var196][var198][var226 + 1] & var194) != 0) {
                                var226++;
                            }
                            label764: while (var223 > 0) {
                                for (int var227 = var225; var227 <= var226; var227++) {
                                    if ((Statics.field489[var196][var223 - 1][var227] & var194) == 0) {
                                        break label764;
                                    }
                                }
                                var223--;
                            }
                            label753: while (var224 < 104) {
                                for (int var228 = var225; var228 <= var226; var228++) {
                                    if ((Statics.field489[var196][var224 + 1][var228] & var194) == 0) {
                                        break label753;
                                    }
                                }
                                var224++;
                            }
                            if ((var224 - var223 + 1) * (var226 - var225 + 1) >= 4) {
                                int var229 = class56.field491[var196][var223][var225];
                                class134.method2784(var195, 4, var223 * 128, var224 * 128 + 128, var225 * 128, var226 * 128 + 128, var229, var229);
                                for (int var230 = var223; var230 <= var224; var230++) {
                                    for (int var231 = var225; var231 <= var226; var231++) {
                                        Statics.field489[var196][var230][var231] &= ~var194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method115(true);
        int var232 = class56.field482;
        if (var232 > Statics.field174) {
            var232 = Statics.field174;
        }
        if (var232 < Statics.field174 - 1) {
            int var233 = Statics.field174 - 1;
        }
        if (field870) {
            Statics.field1304.method2782(class56.field482);
        } else {
            Statics.field1304.method2782(0);
        }
        for (int var234 = 0; var234 < 104; var234++) {
            for (int var235 = 0; var235 < 104; var235++) {
                method538(var234, var235);
            }
        }
        method506();
        for (class69 var236 = (class69) field766.method4431(); var236 != null; var236 = (class69) field766.method4454()) {
            if (var236.field919 == -1) {
                var236.field924 = 0;
                method74(var236);
            } else {
                var236.method3249();
            }
        }
        class254.field3372.method2995();
        if (Statics.field1710.method818()) {
            class188 var237 = class188.method1039(class184.field2209, field668.field1293);
            var237.field2315.method4977(1057001181);
            field668.method2040(var237);
        }
        if (!field748) {
            int var238 = (Statics.field2132 - 6) / 8;
            int var239 = (Statics.field2132 + 6) / 8;
            int var240 = (Statics.field2423 - 6) / 8;
            int var241 = (Statics.field2423 + 6) / 8;
            for (int var242 = var238 - 1; var242 <= var239 + 1; var242++) {
                for (int var243 = var240 - 1; var243 <= var241 + 1; var243++) {
                    if (var242 < var238 || var242 > var239 || var243 < var240 || var243 > var241) {
                        Statics.field11.method3750("m" + var242 + "_" + var243);
                        Statics.field11.method3750("l" + var242 + "_" + var243);
                    }
                }
            }
        }
        method1056(30);
        method506();
        class56.method4717();
        class188 var244 = class188.method1039(class184.field2230, field668.field1293);
        field668.method2040(var244);
        class54.method279();
    }

    @ObfuscatedName("am.gp(IIIIIB)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1304.method2807(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1304.method2811(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (Statics.method3308(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1074.field3875;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class129.method1871(var5);
            class254 var14 = class254.method1148(var13);
            if (var14.field3366 == -1) {
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
                class324 var15 = Statics.field89[var14.field3366];
                if (var15 != null) {
                    int var16 = (var14.field3383 * 4 - var15.field3863) / 2;
                    int var17 = (var14.field3353 * 4 - var15.field3864) / 2;
                    var15.method5515(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3353) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field1304.method2809(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field1304.method2811(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class129.method1871(var18);
            class254 var24 = class254.method1148(var23);
            if (var24.field3366 != -1) {
                class324 var25 = Statics.field89[var24.field3366];
                if (var25 != null) {
                    int var26 = (var24.field3383 * 4 - var25.field3863) / 2;
                    int var27 = (var24.field3353 * 4 - var25.field3864) / 2;
                    var25.method5515(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3353) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (Statics.method3308(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1074.field3875;
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
        long var31 = Statics.field1304.method2810(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class129.method1871(var31);
        class254 var34 = class254.method1148(var33);
        if (var34.field3366 == -1) {
            return;
        }
        class324 var35 = Statics.field89[var34.field3366];
        if (var35 != null) {
            int var36 = (var34.field3383 * 4 - var35.field3863) / 2;
            int var37 = (var34.field3353 * 4 - var35.field3864) / 2;
            var35.method5515(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3353) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.gh(Lcl;I)Z")
    public final boolean method1431(class96 arg0) {
        class305 var2 = arg0.method2042();
        class299 var3 = arg0.field1294;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1295 == null) {
                if (arg0.field1291) {
                    if (!var2.method3156(1)) {
                        return false;
                    }
                    var2.method3157(arg0.field1294.field3699, 0, 1);
                    arg0.field1298 = 0;
                    arg0.field1291 = false;
                }
                var3.field3702 = 0;
                if (var3.method4943()) {
                    if (!var2.method3156(1)) {
                        return false;
                    }
                    var2.method3157(arg0.field1294.field3699, 1, 1);
                    arg0.field1298 = 0;
                }
                arg0.field1291 = true;
                class183[] var4 = class183.method2066();
                int var5 = var3.method4968();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3702);
                }
                arg0.field1295 = var4[var5];
                arg0.field1296 = arg0.field1295.field2109;
            }
            if (arg0.field1296 == -1) {
                if (!var2.method3156(1)) {
                    return false;
                }
                arg0.method2042().method3157(var3.field3699, 0, 1);
                arg0.field1296 = var3.field3699[0] & 0xFF;
            }
            if (arg0.field1296 == -2) {
                if (!var2.method3156(2)) {
                    return false;
                }
                arg0.method2042().method3157(var3.field3699, 0, 2);
                var3.field3702 = 0;
                arg0.field1296 = var3.method4992();
            }
            if (!var2.method3156(arg0.field1296)) {
                return false;
            }
            var3.field3702 = 0;
            var2.method3157(var3.field3699, 0, arg0.field1296);
            arg0.field1298 = 0;
            field889.method4528();
            arg0.field1302 = arg0.field1292;
            arg0.field1292 = arg0.field1301;
            arg0.field1301 = arg0.field1295;
            if (class183.field2122 == arg0.field1295) {
                method91(class186.field2296);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1295) {
                int var6 = var3.method5027();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = var3.method4992();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = var3.method5030();
                int var9 = var3.method5030();
                for (int var10 = var6; var10 <= var7; var10++) {
                    long var11 = ((long) var9 << 32) + (long) var10;
                    class181 var13 = field891.method5393(var11);
                    if (var13 != null) {
                        var13.method3249();
                    }
                    field891.method5394(new class180(var8), var11);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1295) {
                int var14 = var3.method4990();
                method3879(var14);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2096 == arg0.field1295) {
                int var15 = var3.method5032();
                int var16 = var3.method5032();
                int var17 = var3.method5030();
                class218 var18 = class218.method728(var17);
                if (var18.field2555 != var16 || var18.field2617 != var15 || var18.field2571 != 0 || var18.field2552 != 0) {
                    var18.field2555 = var16;
                    var18.field2617 = var15;
                    var18.field2571 = 0;
                    var18.field2552 = 0;
                    method237(var18);
                    this.method1266(var18);
                    if (var18.field2548 == 0) {
                        method836(Statics.field1967[var17 >> 16], var18, false);
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1295) {
                method91(class186.field2297);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1295) {
                field652 = var3.method5027() * 30;
                field834 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2110 == arg0.field1295) {
                boolean var19 = var3.method4990() == 1;
                if (var19) {
                    Statics.field1136 = class297.method502() - var3.method4996();
                    Statics.field1227 = new class7(var3, true);
                } else {
                    Statics.field1227 = null;
                }
                field833 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1295) {
                method2962(var3.method4999());
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1295) {
                int var20 = var3.method5085();
                int var21 = var3.method4992();
                if (var20 < -70000) {
                    var21 += 32768;
                }
                class218 var22;
                if (var20 >= 0) {
                    var22 = class218.method728(var20);
                } else {
                    var22 = null;
                }
                if (var22 != null) {
                    for (int var23 = 0; var23 < var22.field2670.length; var23++) {
                        var22.field2670[var23] = 0;
                        var22.field2671[var23] = 0;
                    }
                }
                class60.method3113(var21);
                int var24 = var3.method4992();
                for (int var25 = 0; var25 < var24; var25++) {
                    int var26 = var3.method5027();
                    int var27 = var3.method5018();
                    if (var27 == 255) {
                        var27 = var3.method5030();
                    }
                    if (var22 != null && var25 < var22.field2670.length) {
                        var22.field2670[var25] = var26;
                        var22.field2671[var25] = var27;
                    }
                    class60.method49(var21, var25, var26 - 1, var27);
                }
                if (var22 != null) {
                    method237(var22);
                }
                method5671();
                field821[++field826 - 1 & 0x1F] = var21 & 0x7FFF;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2127 == arg0.field1295) {
                field849 = true;
                Statics.field3046 = var3.method4990();
                Statics.field2040 = var3.method4990();
                Statics.field628 = var3.method4992();
                Statics.field573 = var3.method4990();
                Statics.field1263 = var3.method4990();
                if (Statics.field1263 >= 100) {
                    Statics.field627 = Statics.field3046 * 128 + 64;
                    Statics.field185 = Statics.field2040 * 128 + 64;
                    Statics.field1255 = method3522(Statics.field627, Statics.field185, Statics.field174) - Statics.field628;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1295) {
                method91(class186.field2303);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1295) {
                int var28 = var3.method5085();
                int var29 = var3.method5085();
                int var30 = class54.method50();
                class188 var31 = class188.method1039(class184.field2200, field668.field1293);
                var31.field2315.method5016(var30);
                var31.field2315.method4977(var28);
                var31.field2315.method5037(var29);
                var31.field2315.method5009(field429);
                field668.method2040(var31);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2165 == arg0.field1295) {
                method5671();
                field805 = var3.method4993();
                field834 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1295) {
                int var32 = var3.method5085();
                if (field719 != var32) {
                    field719 = var32;
                    method3049();
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1295) {
                if (Statics.field2513 != null) {
                    Statics.field2513.method4726(var3);
                }
                method3270();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1295) {
                int var33 = var3.method5030();
                int var34 = var3.method5085();
                class62 var35 = (class62) field900.method5393((long) var34);
                class62 var36 = (class62) field900.method5393((long) var33);
                if (var36 != null) {
                    method4826(var36, var35 == null || var35.field558 != var36.field558);
                }
                if (var35 != null) {
                    var35.method3249();
                    field900.method5394(var35, (long) var33);
                }
                class218 var37 = class218.method728(var34);
                if (var37 != null) {
                    method237(var37);
                }
                class218 var38 = class218.method728(var33);
                if (var38 != null) {
                    method237(var38);
                    method836(Statics.field1967[var38.field2546 >>> 16], var38, true);
                }
                if (field887 != -1) {
                    method663(field887, 1);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1295) {
                Statics.field500.method1705(var3, arg0.field1296);
                field745 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1295) {
                String var39 = var3.method4999();
                long var40 = var3.method4996();
                long var42 = (long) var3.method4992();
                long var44 = (long) var3.method4994();
                class229 var46 = (class229) class196.method3185(class229.method3712(), var3.method4990());
                long var47 = (var42 << 32) + var44;
                boolean var49 = false;
                for (int var50 = 0; var50 < 100; var50++) {
                    if (field890[var50] == var47) {
                        var49 = true;
                        break;
                    }
                }
                if (var46.field3066 && Statics.field500.method1684(new class283(var39, Statics.field275))) {
                    var49 = true;
                }
                if (!var49 && field635 == 0) {
                    field890[field857] = var47;
                    field857 = (field857 + 1) % 100;
                    String var51 = class296.method4851(class291.method3152(class211.method1094(var3)));
                    if (var46.field3068 == -1) {
                        class92.method598(9, var39, var51, class289.method1595(var40));
                    } else {
                        class92.method598(9, class82.method4051(var46.field3068) + var39, var51, class289.method1595(var40));
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1295) {
                var3.field3702 += 28;
                if (var3.method5014()) {
                    method5299(var3, var3.field3702 - 28);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1295) {
                int var52 = var3.method4990();
                if (var3.method4990() == 0) {
                    field904[var52] = new class10();
                    var3.field3702 += 18;
                } else {
                    var3.field3702--;
                    field904[var52] = new class10(var3, false);
                }
                field832 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2107 == arg0.field1295) {
                int var53 = var3.method5052();
                int var54 = var3.method5040();
                class218 var55 = class218.method728(var54);
                if (var55.field2556 != var53 || var53 == -1) {
                    var55.field2556 = var53;
                    var55.field2601 = 0;
                    var55.field2604 = 0;
                    method237(var55);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1295) {
                int var56 = var3.method5085();
                int var57 = var3.method5030();
                int var58 = var3.method5027();
                if (var58 == 65535) {
                    var58 = -1;
                }
                class218 var59 = class218.method728(var56);
                if (var59.field2593) {
                    var59.field2572 = var58;
                    var59.field2673 = var57;
                    class255 var61 = class255.method2964(var58);
                    var59.field2551 = var61.field3403;
                    var59.field2598 = var61.field3404;
                    var59.field2612 = var61.field3405;
                    var59.field2595 = var61.field3406;
                    var59.field2596 = var61.field3407;
                    var59.field2600 = var61.field3402;
                    if (var61.field3434 == 1) {
                        var59.field2605 = 1;
                    } else {
                        var59.field2605 = 2;
                    }
                    if (var59.field2668 > 0) {
                        var59.field2600 = var59.field2600 * 32 / var59.field2668;
                    } else if (var59.field2557 > 0) {
                        var59.field2600 = var59.field2600 * 32 / var59.field2557;
                    }
                    method237(var59);
                } else if (var58 == -1) {
                    var59.field2666 = 0;
                    arg0.field1295 = null;
                    return true;
                } else {
                    class255 var60 = class255.method2964(var58);
                    var59.field2666 = 4;
                    var59.field2590 = var58;
                    var59.field2551 = var60.field3403;
                    var59.field2598 = var60.field3404;
                    var59.field2600 = var60.field3402 * 100 / var57;
                    method237(var59);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1295) {
                int var62 = var3.method5040();
                int var63 = var3.method5028();
                class218 var64 = class218.method728(var62);
                if (var64.field2666 != 2 || var64.field2590 != var63) {
                    var64.field2666 = 2;
                    var64.field2590 = var63;
                    method237(var64);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2115 == arg0.field1295) {
                method91(class186.field2302);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1295) {
                String var65 = var3.method4999();
                long var66 = (long) var3.method4992();
                long var68 = (long) var3.method4994();
                class229 var70 = (class229) class196.method3185(class229.method3712(), var3.method4990());
                long var71 = (var66 << 32) + var68;
                boolean var73 = false;
                for (int var74 = 0; var74 < 100; var74++) {
                    if (field890[var74] == var71) {
                        var73 = true;
                        break;
                    }
                }
                if (Statics.field500.method1684(new class283(var65, Statics.field275))) {
                    var73 = true;
                }
                if (!var73 && field635 == 0) {
                    field890[field857] = var71;
                    field857 = (field857 + 1) % 100;
                    String var75 = class296.method4851(class291.method3152(class211.method1094(var3)));
                    byte var76;
                    if (var70.field3071) {
                        var76 = 7;
                    } else {
                        var76 = 3;
                    }
                    if (var70.field3068 == -1) {
                        class92.method3567(var76, var65, var75);
                    } else {
                        class92.method3567(var76, class82.method4051(var70.field3068) + var65, var75);
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2104 == arg0.field1295) {
                int var77 = var3.method5030();
                class218 var78 = class218.method728(var77);
                for (int var79 = 0; var79 < var78.field2670.length; var79++) {
                    var78.field2670[var79] = -1;
                    var78.field2670[var79] = 0;
                }
                method237(var78);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1295) {
                method1040(true, var3);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1295) {
                int var80 = var3.method5109();
                int var81 = var3.method5027();
                class213.field2509[var81] = var80;
                if (class213.field2511[var81] != var80) {
                    class213.field2511[var81] = var80;
                }
                method3153(var81);
                field783[++field824 - 1 & 0x1F] = var81;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1295) {
                Statics.field327 = var3.method5019();
                Statics.field196 = var3.method4990();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1295) {
                int var82 = var3.method4990();
                int var83 = var3.method4990();
                int var84 = var3.method4990();
                int var85 = var3.method4990();
                field836[var82] = true;
                field883[var82] = var83;
                field884[var82] = var84;
                field885[var82] = var85;
                field886[var82] = 0;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1295) {
                int var86 = var3.method5059();
                String var87 = var3.method4999();
                int var88 = var3.method5018();
                if (var88 >= 1 && var88 <= 8) {
                    if (var87.equalsIgnoreCase(class225.field2755)) {
                        var87 = null;
                    }
                    field761[var88 - 1] = var87;
                    field882[var88 - 1] = var86 == 0;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1295) {
                class72 var89 = new class72();
                var89.field1004 = var3.method4999();
                var89.field1002 = var3.method4992();
                int var90 = var3.method5085();
                var89.field1006 = var90;
                method1056(45);
                var2.method3184();
                Object var91 = null;
                class86.method44(var89);
                arg0.field1295 = null;
                return false;
            }
            if (class183.field2163 == arg0.field1295) {
                Statics.field500.method1679();
                field745 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1295) {
                int var92 = var3.method4990();
                method4348(var92);
                arg0.field1295 = null;
                return false;
            }
            if (class183.field2172 == arg0.field1295) {
                field849 = false;
                for (int var93 = 0; var93 < 5; var93++) {
                    field836[var93] = false;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1295) {
                method91(class186.field2298);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1295) {
                if (arg0.field1296 == 0) {
                    Statics.field2513 = null;
                } else {
                    if (Statics.field2513 == null) {
                        Statics.field2513 = new class285(Statics.field275, Statics.field1710);
                    }
                    Statics.field2513.method4725(var3);
                }
                method3270();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1295) {
                field653 = var3.method4990();
                if (field653 == 1) {
                    field875 = var3.method4992();
                }
                if (field653 >= 2 && field653 <= 6) {
                    if (field653 == 2) {
                        field659 = 64;
                        field681 = 64;
                    }
                    if (field653 == 3) {
                        field659 = 0;
                        field681 = 64;
                    }
                    if (field653 == 4) {
                        field659 = 128;
                        field681 = 64;
                    }
                    if (field653 == 5) {
                        field659 = 64;
                        field681 = 0;
                    }
                    if (field653 == 6) {
                        field659 = 64;
                        field681 = 128;
                    }
                    field653 = 2;
                    field656 = var3.method4992();
                    field657 = var3.method4992();
                    field658 = var3.method4990();
                }
                if (field653 == 10) {
                    field655 = var3.method4992();
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1295) {
                int var94 = var3.method5028();
                class60.method589(var94);
                field821[++field826 - 1 & 0x1F] = var94 & 0x7FFF;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2184 == arg0.field1295) {
                int var95 = var3.method5028();
                field887 = var95;
                this.method1365(false);
                method579(var95);
                class77.method3273(field887);
                for (int var96 = 0; var96 < 100; var96++) {
                    field842[var96] = true;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2098 == arg0.field1295) {
                int var97 = var3.method5004();
                boolean var98 = var3.method4990() == 1;
                String var99 = "";
                boolean var100 = false;
                if (var98) {
                    var99 = var3.method4999();
                    if (Statics.field500.method1684(new class283(var99, Statics.field275))) {
                        var100 = true;
                    }
                }
                String var101 = var3.method4999();
                if (!var100) {
                    class92.method3567(var97, var99, var101);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1295) {
                method3717(false, arg0.field1294);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2099 == arg0.field1295) {
                byte[] var102 = new byte[arg0.field1296];
                var3.method4948(var102, 0, var102.length);
                class300 var103 = new class300(var102);
                String var104 = var103.method4999();
                class52.method3830(var104, true, false);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1295) {
                boolean var105 = var3.method4990() == 1;
                int var106 = var3.method5030();
                class218 var107 = class218.method728(var106);
                if (var107.field2541 != var105) {
                    var107.field2541 = var105;
                    method237(var107);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1295) {
                int var108 = var3.method5085();
                int var109 = var3.method4992();
                if (var108 < -70000) {
                    var109 += 32768;
                }
                class218 var110;
                if (var108 >= 0) {
                    var110 = class218.method728(var108);
                } else {
                    var110 = null;
                }
                while (var3.field3702 < arg0.field1296) {
                    int var111 = var3.method5004();
                    int var112 = var3.method4992();
                    int var113 = 0;
                    if (var112 != 0) {
                        var113 = var3.method4990();
                        if (var113 == 255) {
                            var113 = var3.method5085();
                        }
                    }
                    if (var110 != null && var111 >= 0 && var111 < var110.field2670.length) {
                        var110.field2670[var111] = var112;
                        var110.field2671[var111] = var113;
                    }
                    class60.method49(var109, var111, var112 - 1, var113);
                }
                if (var110 != null) {
                    method237(var110);
                }
                method5671();
                field821[++field826 - 1 & 0x1F] = var109 & 0x7FFF;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1295) {
                int var114 = var3.method5109();
                int var115 = var3.method5028();
                class218 var116 = class218.method728(var114);
                if (var116.field2666 != 1 || var116.field2590 != var115) {
                    var116.field2666 = 1;
                    var116.field2590 = var115;
                    method237(var116);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1295) {
                int var117 = var3.method4992();
                int var118 = var3.method5030();
                int var119 = var117 >> 10 & 0x1F;
                int var120 = var117 >> 5 & 0x1F;
                int var121 = var117 & 0x1F;
                int var122 = (var121 << 3) + (var119 << 19) + (var120 << 11);
                class218 var123 = class218.method728(var118);
                if (var123.field2562 != var122) {
                    var123.field2562 = var122;
                    method237(var123);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2103 == arg0.field1295) {
                int var124 = var3.method4992();
                int var125 = var3.method5028();
                int var126 = var3.method5195();
                int var127 = var3.method5085();
                class218 var128 = class218.method728(var127);
                if (var128.field2551 != var125 || var128.field2598 != var126 || var128.field2600 != var124) {
                    var128.field2551 = var125;
                    var128.field2598 = var126;
                    var128.field2600 = var124;
                    method237(var128);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2102 == arg0.field1295) {
                field800 = var3.method5059();
                field853 = var3.method5018();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1295) {
                method5671();
                int var129 = var3.method5109();
                int var130 = var3.method5018();
                int var131 = var3.method5059();
                field771[var130] = var129;
                field726[var130] = var131;
                field854[var130] = 1;
                for (int var132 = 0; var132 < 98; var132++) {
                    if (var129 >= class222.field2726[var132]) {
                        field854[var130] = var132 + 2;
                    }
                }
                field738[++field802 - 1 & 0x1F] = var130;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2151 == arg0.field1295) {
                field683 = var3.method4990();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2108 == arg0.field1295) {
                int var133 = var3.method5028();
                int var134 = var3.method5040();
                int var135 = var3.method5195();
                class218 var136 = class218.method728(var134);
                var136.field2602 = (var135 << 16) + var133;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1295) {
                String var137 = var3.method4999();
                Object[] var138 = new Object[var137.length() + 1];
                for (int var139 = var137.length() - 1; var139 >= 0; var139--) {
                    if (var137.charAt(var139) == 's') {
                        var138[var139 + 1] = var3.method4999();
                    } else {
                        var138[var139 + 1] = Integer.valueOf(var3.method5085());
                    }
                }
                var138[0] = Integer.valueOf(var3.method5085());
                class63 var140 = new class63();
                var140.field572 = var138;
                class77.method4064(var140);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1295) {
                field849 = true;
                Statics.field456 = var3.method4990();
                Statics.field1229 = var3.method4990();
                Statics.field91 = var3.method4992();
                Statics.field1127 = var3.method4990();
                Statics.field571 = var3.method4990();
                if (Statics.field571 >= 100) {
                    int var141 = Statics.field456 * 128 + 64;
                    int var142 = Statics.field1229 * 128 + 64;
                    int var143 = method3522(var141, var142, Statics.field174) - Statics.field91;
                    int var144 = var141 - Statics.field627;
                    int var145 = var143 - Statics.field1255;
                    int var146 = var142 - Statics.field185;
                    int var147 = (int) Math.sqrt((double) (var144 * var144 + var146 * var146));
                    Statics.field3584 = (int) (Math.atan2((double) var145, (double) var147) * 325.949D) & 0x7FF;
                    Statics.field195 = (int) (Math.atan2((double) var144, (double) var146) * -325.949D) & 0x7FF;
                    if (Statics.field3584 < 128) {
                        Statics.field3584 = 128;
                    }
                    if (Statics.field3584 > 383) {
                        Statics.field3584 = 383;
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1295) {
                method91(class186.field2301);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1295) {
                int var148 = var3.method5085();
                int var149 = var3.method4990();
                int var150 = var3.method4992();
                class62 var151 = (class62) field900.method5393((long) var148);
                if (var151 != null) {
                    method4826(var151, var151.field558 != var150);
                }
                method574(var148, var150, var149);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1295) {
                method91(class186.field2300);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2181 == arg0.field1295) {
                int var152 = var3.method5085();
                class62 var153 = (class62) field900.method5393((long) var152);
                if (var153 != null) {
                    method4826(var153, true);
                }
                if (field707 != null) {
                    method237(field707);
                    field707 = null;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1295) {
                int var154 = var3.method5028();
                byte var155 = var3.method5002();
                class213.field2509[var154] = var155;
                if (class213.field2511[var154] != var155) {
                    class213.field2511[var154] = var155;
                }
                method3153(var154);
                field783[++field824 - 1 & 0x1F] = var154;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1295) {
                method5671();
                field804 = var3.method4990();
                field834 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1295) {
                int var156 = var3.method5030();
                class218 var157 = class218.method728(var156);
                var157.field2666 = 3;
                var157.field2590 = Statics.field2737.field597.method3607();
                method237(var157);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1295) {
                Statics.field196 = var3.method5059();
                Statics.field327 = var3.method5019();
                for (int var158 = Statics.field327; var158 < Statics.field327 + 8; var158++) {
                    for (int var159 = Statics.field196; var159 < Statics.field196 + 8; var159++) {
                        if (field765[Statics.field174][var158][var159] != null) {
                            field765[Statics.field174][var158][var159] = null;
                            method538(var158, var159);
                        }
                    }
                }
                for (class69 var160 = (class69) field766.method4431(); var160 != null; var160 = (class69) field766.method4454()) {
                    if (var160.field913 >= Statics.field327 && var160.field913 < Statics.field327 + 8 && var160.field916 >= Statics.field196 && var160.field916 < Statics.field196 + 8 && Statics.field174 == var160.field918) {
                        var160.field919 = 0;
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1295) {
                class97.method3271(var3, arg0.field1296);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1295) {
                for (int var161 = 0; var161 < class213.field2511.length; var161++) {
                    if (class213.field2511[var161] != class213.field2509[var161]) {
                        class213.field2511[var161] = class213.field2509[var161];
                        method3153(var161);
                        field783[++field824 - 1 & 0x1F] = var161;
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1295) {
                Statics.field500.field1052.method4601(var3, arg0.field1296);
                method3321();
                field745 = field727;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1295) {
                method1040(false, var3);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2117 == arg0.field1295) {
                method3717(true, arg0.field1294);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1295) {
                int var162 = var3.method5030();
                String var163 = var3.method4999();
                class218 var164 = class218.method728(var162);
                if (!var163.equals(var164.field2607)) {
                    var164.field2607 = var163;
                    method237(var164);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2101 == arg0.field1295) {
                int var165 = var3.method4992();
                if (var165 == 65535) {
                    var165 = -1;
                }
                method3322(var165);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1295) {
                int var166 = var3.method5195();
                if (var166 == 65535) {
                    var166 = -1;
                }
                int var167 = var3.method5036();
                method3257(var166, var167);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2097 == arg0.field1295) {
                method91(class186.field2299);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2100 == arg0.field1295) {
                for (int var168 = 0; var168 < Statics.field3182; var168++) {
                    class241 var169 = class241.method266(var168);
                    if (var169 != null) {
                        class213.field2509[var168] = 0;
                        class213.field2511[var168] = 0;
                    }
                }
                method5671();
                field824 += 32;
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2105 == arg0.field1295) {
                method91(class186.field2305);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1295) {
                int var170 = arg0.field1296 + var3.field3702;
                int var171 = var3.method4992();
                int var172 = var3.method4992();
                if (field887 != var171) {
                    field887 = var171;
                    this.method1365(false);
                    method579(field887);
                    class77.method3273(field887);
                    for (int var173 = 0; var173 < 100; var173++) {
                        field842[var173] = true;
                    }
                }
                while (var172-- > 0) {
                    int var174 = var3.method5085();
                    int var175 = var3.method4992();
                    int var176 = var3.method4990();
                    class62 var177 = (class62) field900.method5393((long) var174);
                    if (var177 != null && var177.field558 != var175) {
                        method4826(var177, true);
                        var177 = null;
                    }
                    if (var177 == null) {
                        var177 = method574(var174, var175, var176);
                    }
                    var177.field553 = true;
                }
                for (class62 var178 = (class62) field900.method5395(); var178 != null; var178 = (class62) field900.method5392()) {
                    if (var178.field553) {
                        var178.field553 = false;
                    } else {
                        method4826(var178, true);
                    }
                }
                field891 = new class318(512);
                while (var3.field3702 < var170) {
                    int var179 = var3.method5085();
                    int var180 = var3.method4992();
                    int var181 = var3.method4992();
                    int var182 = var3.method5085();
                    for (int var183 = var180; var183 <= var181; var183++) {
                        long var184 = ((long) var179 << 32) + (long) var183;
                        field891.method5394(new class180(var182), var184);
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2180 == arg0.field1295) {
                String var186 = var3.method4999();
                String var187 = class296.method4851(class291.method3152(class211.method1094(var3)));
                class92.method3567(6, var186, var187);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2112 == arg0.field1295) {
                method2021();
                arg0.field1295 = null;
                return false;
            }
            if (class183.field2129 == arg0.field1295) {
                int var188 = var3.method4992();
                int var189 = var3.method4990();
                int var190 = var3.method4992();
                method1087(var188, var189, var190);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2114 == arg0.field1295) {
                class90.method578(var3, arg0.field1296);
                method3853();
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2106 == arg0.field1295) {
                method91(class186.field2304);
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1295) {
                if (field887 != -1) {
                    method663(field887, 0);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2111 == arg0.field1295) {
                Statics.field327 = var3.method5019();
                Statics.field196 = var3.method4990();
                while (var3.field3702 < arg0.field1296) {
                    int var191 = var3.method4990();
                    class186 var192 = class186.method284()[var191];
                    method91(var192);
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1295) {
                for (int var193 = 0; var193 < field753.length; var193++) {
                    if (field753[var193] != null) {
                        field753[var193].field936 = -1;
                    }
                }
                for (int var194 = 0; var194 < field678.length; var194++) {
                    if (field678[var194] != null) {
                        field678[var194].field936 = -1;
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1295) {
                field865 = var3.method4990();
                if (field865 == 255) {
                    field865 = 0;
                }
                field790 = var3.method4990();
                if (field790 == 255) {
                    field790 = 0;
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2113 == arg0.field1295) {
                Statics.field2697 = class310.method4829(var3.method4990());
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1295) {
                boolean var195 = var3.method4997();
                if (!var195) {
                    Statics.field3087 = null;
                } else if (Statics.field3087 == null) {
                    Statics.field3087 = new class238();
                }
                arg0.field1295 = null;
                return true;
            }
            if (class183.field2120 == arg0.field1295) {
                int var196 = var3.method5030();
                int var197 = var3.method5195();
                class218 var198 = class218.method728(var196);
                if (var198 != null && var198.field2548 == 0) {
                    if (var197 > var198.field2570 - var198.field2639) {
                        var197 = var198.field2570 - var198.field2639;
                    }
                    if (var197 < 0) {
                        var197 = 0;
                    }
                    if (var198.field2568 != var197) {
                        var198.field2568 = var197;
                        method237(var198);
                    }
                }
                arg0.field1295 = null;
                return true;
            }
            class341.method511("" + (arg0.field1295 == null ? -1 : arg0.field1295.field2182) + class82.field1129 + (arg0.field1292 == null ? -1 : arg0.field1292.field2182) + class82.field1129 + (arg0.field1302 == null ? -1 : arg0.field1302.field2182) + class82.field1129 + arg0.field1296, (Throwable) null);
            method2021();
        } catch (IOException var203) {
            method1057();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1295 == null ? -1 : arg0.field1295.field2182) + class82.field1129 + (arg0.field1292 == null ? -1 : arg0.field1292.field2182) + class82.field1129 + (arg0.field1302 == null ? -1 : arg0.field1302.field2182) + class82.field1129 + arg0.field1296 + class82.field1129 + (Statics.field2734 + Statics.field2737.field985[0]) + class82.field1129 + (Statics.field3631 + Statics.field2737.field960[0]) + class82.field1129;
            for (int var202 = 0; var202 < arg0.field1296 && var202 < 50; var202++) {
                var201 = var201 + var3.field3699[var202] + class82.field1129;
            }
            class341.method511(var201, var204);
            method2021();
        }
        return true;
    }

    @ObfuscatedName("y.gq(Lgw;I)V")
    public static final void method91(class186 arg0) {
        class299 var1 = field668.field1294;
        if (class186.field2299 == arg0) {
            byte var2 = var1.method5002();
            byte var3 = var1.method5002();
            int var4 = var1.method4990();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field698[var5];
            int var8 = var1.method5019();
            int var9 = (var8 >> 4 & 0x7) + Statics.field327;
            int var10 = (var8 & 0x7) + Statics.field196;
            byte var11 = var1.method5022();
            int var12 = var1.method5028();
            int var13 = var1.method5027();
            int var14 = var1.method4992();
            int var15 = var1.method5028();
            byte var16 = var1.method5021();
            class67 var17;
            if (field797 == var15) {
                var17 = Statics.field2737;
            } else {
                var17 = field753[var15];
            }
            if (var17 != null) {
                class254 var18 = class254.method1148(var14);
                int var19;
                int var20;
                if (var6 == 1 || var6 == 3) {
                    var19 = var18.field3353;
                    var20 = var18.field3383;
                } else {
                    var19 = var18.field3383;
                    var20 = var18.field3353;
                }
                int var21 = (var19 >> 1) + var9;
                int var22 = (var19 + 1 >> 1) + var9;
                int var23 = (var20 >> 1) + var10;
                int var24 = (var20 + 1 >> 1) + var10;
                int[][] var25 = class56.field491[Statics.field174];
                int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
                int var27 = (var9 << 7) + (var19 << 6);
                int var28 = (var10 << 7) + (var20 << 6);
                class128 var29 = var18.method4147(var5, var6, var25, var27, var26, var28);
                if (var29 != null) {
                    method521(Statics.field174, var9, var10, var7, -1, 0, 0, var12 + 1, var13 + 1);
                    var17.field611 = field645 + var12;
                    var17.field606 = field645 + var13;
                    var17.field610 = var29;
                    var17.field607 = var9 * 128 + var19 * 64;
                    var17.field609 = var10 * 128 + var20 * 64;
                    var17.field608 = var26;
                    if (var2 > var11) {
                        byte var30 = var2;
                        var2 = var11;
                        var11 = var30;
                    }
                    if (var3 > var16) {
                        byte var31 = var3;
                        var3 = var16;
                        var16 = var31;
                    }
                    var17.field623 = var2 + var9;
                    var17.field613 = var9 + var11;
                    var17.field612 = var3 + var10;
                    var17.field614 = var10 + var16;
                }
            }
        }
        if (class186.field2303 == arg0) {
            int var32 = var1.method5028();
            int var33 = var1.method5019();
            int var34 = (var33 >> 4 & 0x7) + Statics.field327;
            int var35 = (var33 & 0x7) + Statics.field196;
            int var36 = var1.method4990();
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = field698[var37];
            if (var34 >= 0 && var35 >= 0 && var34 < 103 && var35 < 103) {
                if (var39 == 0) {
                    class137 var40 = Statics.field1304.method2803(Statics.field174, var34, var35);
                    if (var40 != null) {
                        int var41 = class129.method1871(var40.field1854);
                        if (var37 == 2) {
                            var40.field1851 = new class94(var41, 2, var38 + 4, Statics.field174, var34, var35, var32, false, var40.field1851);
                            var40.field1850 = new class94(var41, 2, var38 + 1 & 0x3, Statics.field174, var34, var35, var32, false, var40.field1850);
                        } else {
                            var40.field1851 = new class94(var41, var37, var38, Statics.field174, var34, var35, var32, false, var40.field1851);
                        }
                    }
                }
                if (var39 == 1) {
                    class142 var42 = Statics.field1304.method2804(Statics.field174, var34, var35);
                    if (var42 != null) {
                        int var43 = class129.method1871(var42.field1891);
                        if (var37 == 4 || var37 == 5) {
                            var42.field1898 = new class94(var43, 4, var38, Statics.field174, var34, var35, var32, false, var42.field1898);
                        } else if (var37 == 6) {
                            var42.field1898 = new class94(var43, 4, var38 + 4, Statics.field174, var34, var35, var32, false, var42.field1898);
                        } else if (var37 == 7) {
                            var42.field1898 = new class94(var43, 4, (var38 + 2 & 0x3) + 4, Statics.field174, var34, var35, var32, false, var42.field1898);
                        } else if (var37 == 8) {
                            var42.field1898 = new class94(var43, 4, var38 + 4, Statics.field174, var34, var35, var32, false, var42.field1898);
                            var42.field1900 = new class94(var43, 4, (var38 + 2 & 0x3) + 4, Statics.field174, var34, var35, var32, false, var42.field1900);
                        }
                    }
                }
                if (var39 == 2) {
                    class143 var44 = Statics.field1304.method2805(Statics.field174, var34, var35);
                    if (var37 == 11) {
                        var37 = 10;
                    }
                    if (var44 != null) {
                        var44.field1905 = new class94(class129.method1871(var44.field1906), var37, var38, Statics.field174, var34, var35, var32, false, var44.field1905);
                    }
                }
                if (var39 == 3) {
                    class124 var45 = Statics.field1304.method2923(Statics.field174, var34, var35);
                    if (var45 != null) {
                        var45.field1576 = new class94(class129.method1871(var45.field1580), 22, var38, Statics.field174, var34, var35, var32, false, var45.field1576);
                    }
                }
            }
        } else if (class186.field2305 == arg0) {
            int var46 = var1.method5018();
            int var47 = (var46 >> 4 & 0x7) + Statics.field327;
            int var48 = (var46 & 0x7) + Statics.field196;
            int var49 = var1.method5195();
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class262 var50 = field765[Statics.field174][var47][var48];
                if (var50 != null) {
                    for (class88 var51 = (class88) var50.method4431(); var51 != null; var51 = (class88) var50.method4454()) {
                        if ((var49 & 0x7FFF) == var51.field1225) {
                            var51.method3249();
                            break;
                        }
                    }
                    if (var50.method4431() == null) {
                        field765[Statics.field174][var47][var48] = null;
                    }
                    method538(var47, var48);
                }
            }
        } else if (class186.field2297 == arg0) {
            int var52 = var1.method5019();
            int var53 = var52 >> 2;
            int var54 = var52 & 0x3;
            int var55 = field698[var53];
            int var56 = var1.method5018();
            int var57 = (var56 >> 4 & 0x7) + Statics.field327;
            int var58 = (var56 & 0x7) + Statics.field196;
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                method521(Statics.field174, var57, var58, var55, -1, var53, var54, 0, -1);
            }
        } else if (class186.field2298 == arg0) {
            int var59 = var1.method5028();
            int var60 = var1.method5027();
            int var61 = var1.method5018();
            int var62 = (var61 >> 4 & 0x7) + Statics.field327;
            int var63 = (var61 & 0x7) + Statics.field196;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                class88 var64 = new class88();
                var64.field1225 = var60;
                var64.field1226 = var59;
                if (field765[Statics.field174][var62][var63] == null) {
                    field765[Statics.field174][var62][var63] = new class262();
                }
                field765[Statics.field174][var62][var63].method4433(var64);
                method538(var62, var63);
            }
        } else {
            if (class186.field2301 == arg0) {
                int var65 = var1.method5059();
                int var66 = (var65 >> 4 & 0x7) + Statics.field327;
                int var67 = (var65 & 0x7) + Statics.field196;
                int var68 = var1.method5059();
                int var69 = var68 >> 4 & 0xF;
                int var70 = var68 & 0x7;
                int var71 = var1.method4992();
                int var72 = var1.method5059();
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    int var73 = var69 + 1;
                    if (Statics.field2737.field985[0] >= var66 - var73 && Statics.field2737.field985[0] <= var66 + var73 && Statics.field2737.field960[0] >= var67 - var73 && Statics.field2737.field960[0] <= var67 + var73 && field869 != 0 && var70 > 0 && field850 < 50) {
                        field876[field850] = var71;
                        field877[field850] = var70;
                        field878[field850] = var72;
                        field664[field850] = null;
                        field879[field850] = (var66 << 16) + (var67 << 8) + var69;
                        field850++;
                    }
                }
            }
            if (class186.field2300 == arg0) {
                int var74 = var1.method4990();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field698[var75];
                int var78 = var1.method5018();
                int var79 = (var78 >> 4 & 0x7) + Statics.field327;
                int var80 = (var78 & 0x7) + Statics.field196;
                int var81 = var1.method4992();
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    method521(Statics.field174, var79, var80, var77, var81, var75, var76, 0, -1);
                }
            } else if (class186.field2296 == arg0) {
                int var82 = var1.method5195();
                int var83 = var1.method5059();
                int var84 = (var83 >> 4 & 0x7) + Statics.field327;
                int var85 = (var83 & 0x7) + Statics.field196;
                int var86 = var1.method5027();
                int var87 = var1.method5195();
                byte var88 = var1.method5023();
                int var89 = var1.method5059() * 4;
                int var90 = var1.method4990();
                int var91 = var1.method5018();
                byte var92 = var1.method5021();
                int var93 = var1.method5034();
                int var94 = var1.method5059() * 4;
                int var95 = var84 + var92;
                int var96 = var85 + var88;
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104 && var82 != 65535) {
                    int var97 = var84 * 128 + 64;
                    int var98 = var85 * 128 + 64;
                    int var99 = var95 * 128 + 64;
                    int var100 = var96 * 128 + 64;
                    class87 var101 = new class87(var82, Statics.field174, var97, var98, method3522(var97, var98, Statics.field174) - var94, field645 + var86, field645 + var87, var91, var90, var93, var89);
                    var101.method1920(var99, var100, method3522(var99, var100, Statics.field174) - var89, field645 + var86);
                    field795.method4433(var101);
                }
            } else if (class186.field2304 == arg0) {
                int var102 = var1.method5027();
                int var103 = var1.method5028();
                int var104 = var1.method5019();
                int var105 = (var104 >> 4 & 0x7) + Statics.field327;
                int var106 = (var104 & 0x7) + Statics.field196;
                int var107 = var1.method5028();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                    class262 var108 = field765[Statics.field174][var105][var106];
                    if (var108 != null) {
                        for (class88 var109 = (class88) var108.method4431(); var109 != null; var109 = (class88) var108.method4454()) {
                            if ((var102 & 0x7FFF) == var109.field1225 && var109.field1226 == var107) {
                                var109.field1226 = var103;
                                break;
                            }
                        }
                        method538(var105, var106);
                    }
                }
            } else if (class186.field2302 == arg0) {
                int var110 = var1.method5195();
                int var111 = var1.method5018();
                int var112 = var1.method5018();
                int var113 = (var112 >> 4 & 0x7) + Statics.field327;
                int var114 = (var112 & 0x7) + Statics.field196;
                int var115 = var1.method5027();
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    int var116 = var113 * 128 + 64;
                    int var117 = var114 * 128 + 64;
                    class78 var118 = new class78(var115, Statics.field174, var116, var117, method3522(var116, var117, Statics.field174) - var111, var110, field645);
                    field768.method4433(var118);
                }
            }
        }
    }

    @ObfuscatedName("ax.gx(IIIIIIIIIB)V")
    public static final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field766.method4431(); var10 != null; var10 = (class69) field766.method4454()) {
            if (var10.field918 == arg0 && var10.field913 == arg1 && var10.field916 == arg2 && var10.field914 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field918 = arg0;
            var9.field914 = arg3;
            var9.field913 = arg1;
            var9.field916 = arg2;
            method74(var9);
            field766.method4433(var9);
        }
        var9.field920 = arg4;
        var9.field917 = arg5;
        var9.field921 = arg6;
        var9.field924 = arg7;
        var9.field919 = arg8;
    }

    @ObfuscatedName("m.gj(Lbt;B)V")
    public static final void method74(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field914 == 0) {
            var1 = Statics.field1304.method2807(arg0.field918, arg0.field913, arg0.field916);
        }
        if (arg0.field914 == 1) {
            var1 = Statics.field1304.method2932(arg0.field918, arg0.field913, arg0.field916);
        }
        if (arg0.field914 == 2) {
            var1 = Statics.field1304.method2809(arg0.field918, arg0.field913, arg0.field916);
        }
        if (arg0.field914 == 3) {
            var1 = Statics.field1304.method2810(arg0.field918, arg0.field913, arg0.field916);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1304.method2811(arg0.field918, arg0.field913, arg0.field916, var1);
            var3 = class129.method1871(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field915 = var3;
        arg0.field922 = var4;
        arg0.field923 = var5;
    }

    @ObfuscatedName("ff.gz(B)V")
    public static final void method3112() {
        for (class69 var0 = (class69) field766.method4431(); var0 != null; var0 = (class69) field766.method4454()) {
            if (var0.field919 > 0) {
                var0.field919--;
            }
            if (var0.field919 == 0) {
                if (var0.field915 >= 0) {
                    int var1 = var0.field915;
                    int var2 = var0.field922;
                    class254 var3 = class254.method1148(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4163(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method13(var0.field918, var0.field914, var0.field913, var0.field916, var0.field915, var0.field923, var0.field922);
                var0.method3249();
            } else {
                if (var0.field924 > 0) {
                    var0.field924--;
                }
                if (var0.field924 == 0 && var0.field913 >= 1 && var0.field916 >= 1 && var0.field913 <= 102 && var0.field916 <= 102) {
                    if (var0.field920 >= 0) {
                        int var5 = var0.field920;
                        int var6 = var0.field917;
                        class254 var7 = class254.method1148(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4163(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method13(var0.field918, var0.field914, var0.field913, var0.field916, var0.field920, var0.field921, var0.field917);
                    var0.field924 = -1;
                    if (var0.field920 == var0.field915 && var0.field915 == -1) {
                        var0.method3249();
                    } else if (var0.field920 == var0.field915 && var0.field923 == var0.field921 && var0.field922 == var0.field917) {
                        var0.method3249();
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.hh(IIIIIIII)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field870 && Statics.field174 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1304.method2807(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1304.method2932(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1304.method2809(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1304.method2810(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1304.method2811(arg0, arg2, arg3, var7);
            int var13 = class129.method1871(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1304.method2781(arg0, arg2, arg3);
                class254 var16 = class254.method1148(var13);
                if (var16.field3368 != 0) {
                    field798[arg0].method3195(arg2, arg3, var14, var15, var16.field3355);
                }
            }
            if (arg1 == 1) {
                Statics.field1304.method2897(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1304.method2858(arg0, arg2, arg3);
                class254 var17 = class254.method1148(var13);
                if (var17.field3383 + arg2 > 103 || var17.field3383 + arg3 > 103 || var17.field3353 + arg2 > 103 || var17.field3353 + arg3 > 103) {
                    return;
                }
                if (var17.field3368 != 0) {
                    field798[arg0].method3196(arg2, arg3, var17.field3383, var17.field3353, var15, var17.field3355);
                }
            }
            if (arg1 == 3) {
                Statics.field1304.method2801(arg0, arg2, arg3);
                class254 var18 = class254.method1148(var13);
                if (var18.field3368 == 1) {
                    field798[arg0].method3198(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field498[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class56.method41(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field1304, field798[arg0]);
    }

    @ObfuscatedName("ao.ht(III)V")
    public static final void method538(int arg0, int arg1) {
        class262 var2 = field765[Statics.field174][arg0][arg1];
        if (var2 == null) {
            Statics.field1304.method2845(Statics.field174, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4431(); var6 != null; var6 = (class88) var2.method4454()) {
            class255 var7 = class255.method2964(var6.field1225);
            long var8 = (long) var7.field3409;
            if (var7.field3434 == 1) {
                var8 = (long) (var6.field1226 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1304.method2845(Statics.field174, arg0, arg1);
            return;
        }
        var2.method4434(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4431(); var12 != null; var12 = (class88) var2.method4454()) {
            if (var5.field1225 != var12.field1225) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1225 != var12.field1225 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method4525(arg0, arg1, 3, false, 0);
        Statics.field1304.method2900(Statics.field174, arg0, arg1, method3522(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field174), var5, var13, var10, var11);
    }

    @ObfuscatedName("bk.hk(ZLkf;B)V")
    public static final void method1040(boolean arg0, class299 arg1) {
        field641 = 0;
        field634 = 0;
        method2274();
        while (arg1.method4949(field668.field1296) >= 27) {
            int var2 = arg1.method4947(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field678[var2] == null) {
                field678[var2] = new class80();
                var32 = true;
            }
            class80 var33 = field678[var2];
            field680[++field733 - 1] = var2;
            var33.field976 = field645;
            int var34;
            if (arg0) {
                var34 = arg1.method4947(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = arg1.method4947(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35;
            if (arg0) {
                var35 = arg1.method4947(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = arg1.method4947(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = field763[arg1.method4947(3)];
            if (var32) {
                var33.field981 = var33.field931 = var36;
            }
            int var37 = arg1.method4947(1);
            if (var37 == 1) {
                field682[++field634 - 1] = var2;
            }
            int var38 = arg1.method4947(1);
            var33.field1114 = class257.method3280(arg1.method4947(14));
            var33.field933 = var33.field1114.field3474;
            var33.field983 = var33.field1114.field3486;
            if (var33.field983 == 0) {
                var33.field931 = 0;
            }
            var33.field938 = var33.field1114.field3479;
            var33.field939 = var33.field1114.field3462;
            var33.field940 = var33.field1114.field3470;
            var33.field941 = var33.field1114.field3464;
            var33.field935 = var33.field1114.field3458;
            var33.field946 = var33.field1114.field3478;
            var33.field979 = var33.field1114.field3457;
            var33.method1854(Statics.field2737.field985[0] + var34, Statics.field2737.field960[0] + var35, var38 == 1);
        }
        arg1.method4945();
        for (int var3 = 0; var3 < field634; var3++) {
            int var4 = field682[var3];
            class80 var5 = field678[var4];
            int var6 = arg1.method4990();
            if ((var6 & 0x10) != 0) {
                int var7 = arg1.method4992();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = arg1.method5059();
                if (var5.field936 == var7 && var7 != -1) {
                    int var9 = class259.method122(var7).field3518;
                    if (var9 == 1) {
                        var5.field961 = 0;
                        var5.field964 = 0;
                        var5.field937 = var8;
                        var5.field966 = 0;
                    }
                    if (var9 == 2) {
                        var5.field966 = 0;
                    }
                } else if (var7 == -1 || var5.field936 == -1 || class259.method122(var7).field3512 >= class259.method122(var5.field936).field3512) {
                    var5.field936 = var7;
                    var5.field961 = 0;
                    var5.field964 = 0;
                    var5.field937 = var8;
                    var5.field966 = 0;
                    var5.field989 = var5.field984;
                }
            }
            if ((var6 & 0x1) != 0) {
                int var10 = arg1.method5019();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg1.method5004();
                        if (var15 == 32767) {
                            var15 = arg1.method5004();
                            var13 = arg1.method5004();
                            var12 = arg1.method5004();
                            var14 = arg1.method5004();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg1.method5004();
                        }
                        int var16 = arg1.method5004();
                        var5.method1573(var15, var13, var12, var14, field645, var16);
                    }
                }
                int var17 = arg1.method5059();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg1.method5004();
                        int var20 = arg1.method5004();
                        if (var20 == 32767) {
                            var5.method1572(var19);
                        } else {
                            int var21 = arg1.method5004();
                            int var22 = arg1.method5019();
                            int var23 = var20 > 0 ? arg1.method5019() : var22;
                            var5.method1571(var19, field645, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field956 = arg1.method5028();
                if (var5.field956 == 65535) {
                    var5.field956 = -1;
                }
            }
            if ((var6 & 0x20) != 0) {
                var5.field1114 = class257.method3280(arg1.method5195());
                var5.field933 = var5.field1114.field3474;
                var5.field983 = var5.field1114.field3486;
                var5.field938 = var5.field1114.field3479;
                var5.field939 = var5.field1114.field3462;
                var5.field940 = var5.field1114.field3470;
                var5.field941 = var5.field1114.field3464;
                var5.field935 = var5.field1114.field3458;
                var5.field946 = var5.field1114.field3478;
                var5.field979 = var5.field1114.field3457;
            }
            if ((var6 & 0x4) != 0) {
                int var24 = arg1.method5028();
                int var25 = arg1.method5195();
                int var26 = var5.field986 - (var24 - Statics.field2734 - Statics.field2734) * 64;
                int var27 = var5.field930 - (var25 - Statics.field3631 - Statics.field3631) * 64;
                if (var26 != 0 || var27 != 0) {
                    var5.field958 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field967 = arg1.method5195();
                int var28 = arg1.method5109();
                var5.field971 = var28 >> 16;
                var5.field970 = (var28 & 0xFFFF) + field645;
                var5.field968 = 0;
                var5.field969 = 0;
                if (var5.field970 > field645) {
                    var5.field968 = -1;
                }
                if (var5.field967 == 65535) {
                    var5.field967 = -1;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field929 = arg1.method4999();
                var5.field988 = 100;
            }
        }
        for (int var29 = 0; var29 < field641; var29++) {
            int var30 = field759[var29];
            if (field645 != field678[var30].field976) {
                field678[var30].field1114 = null;
                field678[var30] = null;
            }
        }
        if (field668.field1296 != arg1.field3702) {
            throw new RuntimeException(arg1.field3702 + class82.field1129 + field668.field1296);
        }
        for (int var31 = 0; var31 < field733; var31++) {
            if (field678[field680[var31]] == null) {
                throw new RuntimeException(var31 + class82.field1129 + field733);
            }
        }
    }

    @ObfuscatedName("dr.hz(I)V")
    public static final void method2274() {
        class299 var0 = field668.field1294;
        var0.method4959();
        int var1 = var0.method4947(8);
        if (var1 < field733) {
            for (int var2 = var1; var2 < field733; var2++) {
                field759[++field641 - 1] = field680[var2];
            }
        }
        if (var1 > field733) {
            throw new RuntimeException("");
        }
        field733 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field680[var3];
            class80 var5 = field678[var4];
            int var6 = var0.method4947(1);
            if (var6 == 0) {
                field680[++field733 - 1] = var4;
                var5.field976 = field645;
            } else {
                int var7 = var0.method4947(2);
                if (var7 == 0) {
                    field680[++field733 - 1] = var4;
                    var5.field976 = field645;
                    field682[++field634 - 1] = var4;
                } else if (var7 == 1) {
                    field680[++field733 - 1] = var4;
                    var5.field976 = field645;
                    int var8 = var0.method4947(3);
                    var5.method1855(var8, (byte) 1);
                    int var9 = var0.method4947(1);
                    if (var9 == 1) {
                        field682[++field634 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field680[++field733 - 1] = var4;
                    var5.field976 = field645;
                    int var10 = var0.method4947(3);
                    var5.method1855(var10, (byte) 2);
                    int var11 = var0.method4947(3);
                    var5.method1855(var11, (byte) 2);
                    int var12 = var0.method4947(1);
                    if (var12 == 1) {
                        field682[++field634 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field759[++field641 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("n.hl(Lbi;IIBI)V")
    public static final void method10(class67 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field985[0];
        int var5 = arg0.field960[0];
        int var6 = arg0.method1096();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1096();
        field910.field2084 = arg1;
        field910.field2082 = arg2;
        field910.field2083 = 1;
        field910.field2081 = 1;
        class66 var10 = field910;
        int var11 = Statics.method3316(var4, var5, var9, var10, field798[arg0.field624], true, field911, field912);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1107(field911[var12], field912[var12], arg3);
            }
        }
    }

    @ObfuscatedName("ba.hb(I)V")
    public static void method1049() {
        field774 = 0;
        field773 = false;
    }

    @ObfuscatedName("ah.hr(I)V")
    public static void method718() {
        method1049();
        field779[0] = class225.field2988;
        field780[0] = "";
        field777[0] = 1006;
        field781[0] = false;
        field774 = 1;
    }

    @ObfuscatedName("client.he(S)V")
    public final void method1165() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field774 - 1; var2++) {
                if (field777[var2] < 1000 && field777[var2 + 1] > 1000) {
                    String var3 = field780[var2];
                    field780[var2] = field780[var2 + 1];
                    field780[var2 + 1] = var3;
                    String var4 = field779[var2];
                    field779[var2] = field779[var2 + 1];
                    field779[var2 + 1] = var4;
                    int var5 = field777[var2];
                    field777[var2] = field777[var2 + 1];
                    field777[var2 + 1] = var5;
                    int var6 = field847[var2];
                    field847[var2] = field847[var2 + 1];
                    field847[var2 + 1] = var6;
                    int var7 = field776[var2];
                    field776[var2] = field776[var2 + 1];
                    field776[var2 + 1] = var7;
                    int var8 = field778[var2];
                    field778[var2] = field778[var2 + 1];
                    field778[var2 + 1] = var8;
                    boolean var9 = field781[var2];
                    field781[var2] = field781[var2 + 1];
                    field781[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field1870 != null || field810 != null) {
            return;
        }
        int var10 = class55.field473;
        if (!field773) {
            int var31 = method3099();
            if ((var10 == 1 || !Statics.field183 && var10 == 4) && var31 >= 0) {
                int var32 = field777[var31];
                if (var32 == 39 || var32 == 40 || var32 == 41 || var32 == 42 || var32 == 43 || var32 == 33 || var32 == 34 || var32 == 35 || var32 == 36 || var32 == 37 || var32 == 38 || var32 == 1005) {
                    int var33 = field847[var31];
                    int var34 = field776[var31];
                    class218 var35 = class218.method728(var34);
                    if (class219.method2950(method15(var35)) || class219.method235(method15(var35))) {
                        if (Statics.field1870 != null && !field749 && field774 > 0 && !this.method1166()) {
                            method38(field746, field747);
                        }
                        field749 = false;
                        field750 = 0;
                        if (Statics.field1870 != null) {
                            method237(Statics.field1870);
                        }
                        Statics.field1870 = class218.method728(var34);
                        field822 = var33;
                        field746 = class55.field474;
                        field747 = class55.field475;
                        if (var31 >= 0) {
                            method2026(var31);
                        }
                        method237(Statics.field1870);
                        return;
                    }
                }
            }
            if ((var10 == 1 || !Statics.field183 && var10 == 4) && this.method1166()) {
                var10 = 2;
            }
            if ((var10 == 1 || !Statics.field183 && var10 == 4) && field774 > 0) {
                method2949(var31);
            }
            if (var10 == 2 && field774 > 0) {
                this.method1167(class55.field474, class55.field475);
            }
            return;
        }
        if (var10 != 1 && (Statics.field183 || var10 != 4)) {
            int var11 = class55.field466;
            int var12 = class55.field467;
            if (var11 < Statics.field1923 - 10 || var11 > Statics.field1923 + Statics.field1055 + 10 || var12 < Statics.field409 - 10 || var12 > Statics.field409 + Statics.field204 + 10) {
                field773 = false;
                int var13 = Statics.field1923;
                int var14 = Statics.field409;
                int var15 = Statics.field1055;
                int var16 = Statics.field204;
                for (int var17 = 0; var17 < field840; var17++) {
                    if (field845[var17] + field830[var17] > var13 && field845[var17] < var13 + var15 && field846[var17] + field710[var17] > var14 && field846[var17] < var14 + var16) {
                        field842[var17] = true;
                    }
                }
            }
        }
        if (var10 != 1 && Statics.field183 || var10 != 4) {
            return;
        }
        int var18 = Statics.field1923;
        int var19 = Statics.field409;
        int var20 = Statics.field1055;
        int var21 = class55.field474;
        int var22 = class55.field475;
        int var23 = -1;
        for (int var24 = 0; var24 < field774; var24++) {
            int var25 = (field774 - 1 - var24) * 15 + var19 + 31;
            if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                var23 = var24;
            }
        }
        if (var23 != -1) {
            method2949(var23);
        }
        field773 = false;
        int var26 = Statics.field1923;
        int var27 = Statics.field409;
        int var28 = Statics.field1055;
        int var29 = Statics.field204;
        for (int var30 = 0; var30 < field840; var30++) {
            if (field845[var30] + field830[var30] > var26 && field845[var30] < var26 + var28 && field846[var30] + field710[var30] > var27 && field846[var30] < var27 + var29) {
                field842[var30] = true;
            }
        }
    }

    @ObfuscatedName("client.hq(B)Z")
    public final boolean method1166() {
        int var1 = method3099();
        return (field772 == 1 && field774 > 2 || method4076(var1)) && !field781[var1];
    }

    @ObfuscatedName("client.ho(III)V")
    public final void method1167(int arg0, int arg1) {
        method3108(arg0, arg1);
        Statics.field1304.method2818(Statics.field174, arg0, arg1, false);
        field773 = true;
    }

    @ObfuscatedName("fy.hv(III)V")
    public static void method3108(int arg0, int arg1) {
        int var2 = Statics.field2079.method4847(class225.field2896);
        for (int var3 = 0; var3 < field774; var3++) {
            int var4 = Statics.field2079.method4847(method666(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field774 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1578) {
            var6 = Statics.field1578 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1904) {
            var7 = Statics.field1904 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1923 = var6;
        Statics.field409 = var7;
        Statics.field1055 = var2;
        Statics.field204 = field774 * 15 + 22;
    }

    @ObfuscatedName("if.hg(II)Z")
    public static final boolean method4076(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field777[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("eq.hn(II)V")
    public static final void method2949(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field847[arg0];
        int var2 = field776[arg0];
        int var3 = field777[arg0];
        int var4 = field778[arg0];
        String var5 = field779[arg0];
        String var6 = field780[arg0];
        method3930(var1, var2, var3, var4, var5, var6, class55.field474, class55.field475);
    }

    @ObfuscatedName("ig.hm(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3930(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1001) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var8 = class188.method1039(class184.field2235, field668.field1293);
            var8.field2315.method4975(Statics.field3631 + arg1);
            var8.field2315.method4975(Statics.field2734 + arg0);
            var8.field2315.method4975(arg3);
            var8.field2315.method5015(class46.field370[82] ? 1 : 0);
            field668.method2040(var8);
        }
        if (arg2 == 45) {
            class67 var9 = field753[arg3];
            if (var9 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var10 = class188.method1039(class184.field2228, field668.field1293);
                var10.field2315.method5026(arg3);
                var10.field2315.method5065(class46.field370[82] ? 1 : 0);
                field668.method2040(var10);
            }
        }
        if (arg2 == 35) {
            class188 var11 = class188.method1039(class184.field2190, field668.field1293);
            var11.field2315.method5024(arg3);
            var11.field2315.method5089(arg1);
            var11.field2315.method4975(arg0);
            field668.method2040(var11);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 11) {
            class80 var12 = field678[arg3];
            if (var12 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var13 = class188.method1039(class184.field2220, field668.field1293);
                var13.field2315.method5065(class46.field370[82] ? 1 : 0);
                var13.field2315.method5024(arg3);
                field668.method2040(var13);
            }
        }
        if (arg2 == 26) {
            method766();
        }
        if (arg2 == 22) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var14 = class188.method1039(class184.field2193, field668.field1293);
            var14.field2315.method5024(Statics.field2734 + arg0);
            var14.field2315.method5024(Statics.field3631 + arg1);
            var14.field2315.method5026(arg3);
            var14.field2315.method5009(class46.field370[82] ? 1 : 0);
            field668.method2040(var14);
        }
        if (arg2 == 5) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var15 = class188.method1039(class184.field2227, field668.field1293);
            var15.field2315.method4975(arg3);
            var15.field2315.method5153(Statics.field2734 + arg0);
            var15.field2315.method5026(Statics.field3631 + arg1);
            var15.field2315.method5015(class46.field370[82] ? 1 : 0);
            field668.method2040(var15);
        }
        if (arg2 == 43) {
            class188 var16 = class188.method1039(class184.field2283, field668.field1293);
            var16.field2315.method4975(arg3);
            var16.field2315.method5037(arg1);
            var16.field2315.method4975(arg0);
            field668.method2040(var16);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 47) {
            class67 var17 = field753[arg3];
            if (var17 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var18 = class188.method1039(class184.field2272, field668.field1293);
                var18.field2315.method5026(arg3);
                var18.field2315.method5016(class46.field370[82] ? 1 : 0);
                field668.method2040(var18);
            }
        }
        if (arg2 == 3) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var19 = class188.method1039(class184.field2236, field668.field1293);
            var19.field2315.method5016(class46.field370[82] ? 1 : 0);
            var19.field2315.method4975(arg3);
            var19.field2315.method5153(Statics.field3631 + arg1);
            var19.field2315.method5026(Statics.field2734 + arg0);
            field668.method2040(var19);
        }
        if (arg2 == 14) {
            class67 var20 = field753[arg3];
            if (var20 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var21 = class188.method1039(class184.field2244, field668.field1293);
                var21.field2315.method5026(arg3);
                var21.field2315.method5178(Statics.field5);
                var21.field2315.method4975(Statics.field164);
                var21.field2315.method5024(Statics.field388);
                var21.field2315.method5065(class46.field370[82] ? 1 : 0);
                field668.method2040(var21);
            }
        }
        if (arg2 == 24) {
            class218 var22 = class218.method728(arg1);
            boolean var23 = true;
            if (var22.field2550 > 0) {
                var23 = method684(var22);
            }
            if (var23) {
                class188 var24 = class188.method1039(class184.field2262, field668.field1293);
                var24.field2315.method4977(arg1);
                field668.method2040(var24);
            }
        }
        if (arg2 == 9) {
            class80 var25 = field678[arg3];
            if (var25 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var26 = class188.method1039(class184.field2274, field668.field1293);
                var26.field2315.method5009(class46.field370[82] ? 1 : 0);
                var26.field2315.method5024(arg3);
                field668.method2040(var26);
            }
        }
        if (arg2 == 10) {
            class80 var27 = field678[arg3];
            if (var27 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var28 = class188.method1039(class184.field2281, field668.field1293);
                var28.field2315.method5009(class46.field370[82] ? 1 : 0);
                var28.field2315.method5153(arg3);
                field668.method2040(var28);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var29 = class218.method61(arg1, arg0);
            if (var29 != null) {
                method520(arg3, arg1, arg0, var29.field2572, arg5);
            }
        }
        if (arg2 == 44) {
            class67 var30 = field753[arg3];
            if (var30 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var31 = class188.method1039(class184.field2232, field668.field1293);
                var31.field2315.method5153(arg3);
                var31.field2315.method5015(class46.field370[82] ? 1 : 0);
                field668.method2040(var31);
            }
        }
        if (arg2 == 30 && field707 == null) {
            method3149(arg1, arg0);
            field707 = class218.method61(arg1, arg0);
            method237(field707);
        }
        if (arg2 == 32) {
            class188 var32 = class188.method1039(class184.field2247, field668.field1293);
            var32.field2315.method5026(field769);
            var32.field2315.method5024(arg0);
            var32.field2315.method5024(arg3);
            var32.field2315.method5178(arg1);
            var32.field2315.method5037(Statics.field1158);
            field668.method2040(var32);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 8) {
            class80 var33 = field678[arg3];
            if (var33 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var34 = class188.method1039(class184.field2261, field668.field1293);
                var34.field2315.method5024(field769);
                var34.field2315.method5024(arg3);
                var34.field2315.method5089(Statics.field1158);
                var34.field2315.method5065(class46.field370[82] ? 1 : 0);
                field668.method2040(var34);
            }
        }
        if (arg2 == 1003) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            class80 var35 = field678[arg3];
            if (var35 != null) {
                class257 var36 = var35.field1114;
                if (var36.field3463 != null) {
                    var36 = var36.method4273();
                }
                if (var36 != null) {
                    class188 var37 = class188.method1039(class184.field2249, field668.field1293);
                    var37.field2315.method5153(var36.field3453);
                    field668.method2040(var37);
                }
            }
        }
        if (arg2 == 39) {
            class188 var38 = class188.method1039(class184.field2218, field668.field1293);
            var38.field2315.method5153(arg0);
            var38.field2315.method4975(arg3);
            var38.field2315.method5037(arg1);
            field668.method2040(var38);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 16) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var39 = class188.method1039(class184.field2198, field668.field1293);
            var39.field2315.method5026(arg3);
            var39.field2315.method4977(Statics.field5);
            var39.field2315.method5153(Statics.field388);
            var39.field2315.method5026(Statics.field3631 + arg1);
            var39.field2315.method5009(class46.field370[82] ? 1 : 0);
            var39.field2315.method5153(Statics.field2734 + arg0);
            var39.field2315.method5153(Statics.field164);
            field668.method2040(var39);
        }
        if (arg2 == 40) {
            class188 var40 = class188.method1039(class184.field2273, field668.field1293);
            var40.field2315.method5178(arg1);
            var40.field2315.method5153(arg0);
            var40.field2315.method5026(arg3);
            field668.method2040(var40);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 33) {
            class188 var41 = class188.method1039(class184.field2212, field668.field1293);
            var41.field2315.method4977(arg1);
            var41.field2315.method5024(arg0);
            var41.field2315.method5024(arg3);
            field668.method2040(var41);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 1004) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            class188 var42 = class188.method1039(class184.field2213, field668.field1293);
            var42.field2315.method4975(arg3);
            field668.method2040(var42);
        }
        if (arg2 == 4) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var43 = class188.method1039(class184.field2191, field668.field1293);
            var43.field2315.method5026(arg3);
            var43.field2315.method4975(Statics.field2734 + arg0);
            var43.field2315.method5009(class46.field370[82] ? 1 : 0);
            var43.field2315.method5153(Statics.field3631 + arg1);
            field668.method2040(var43);
        }
        if (arg2 == 13) {
            class80 var44 = field678[arg3];
            if (var44 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var45 = class188.method1039(class184.field2222, field668.field1293);
                var45.field2315.method5009(class46.field370[82] ? 1 : 0);
                var45.field2315.method5024(arg3);
                field668.method2040(var45);
            }
        }
        if (arg2 == 46) {
            class67 var46 = field753[arg3];
            if (var46 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var47 = class188.method1039(class184.field2207, field668.field1293);
                var47.field2315.method5009(class46.field370[82] ? 1 : 0);
                var47.field2315.method5024(arg3);
                field668.method2040(var47);
            }
        }
        if (arg2 == 6) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var48 = class188.method1039(class184.field2267, field668.field1293);
            var48.field2315.method4975(Statics.field2734 + arg0);
            var48.field2315.method5016(class46.field370[82] ? 1 : 0);
            var48.field2315.method5153(arg3);
            var48.field2315.method5153(Statics.field3631 + arg1);
            field668.method2040(var48);
        }
        if (arg2 == 12) {
            class80 var49 = field678[arg3];
            if (var49 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var50 = class188.method1039(class184.field2264, field668.field1293);
                var50.field2315.method5065(class46.field370[82] ? 1 : 0);
                var50.field2315.method5024(arg3);
                field668.method2040(var50);
            }
        }
        if (arg2 == 42) {
            class188 var51 = class188.method1039(class184.field2260, field668.field1293);
            var51.field2315.method4975(arg3);
            var51.field2315.method4975(arg0);
            var51.field2315.method5178(arg1);
            field668.method2040(var51);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 7) {
            class80 var52 = field678[arg3];
            if (var52 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var53 = class188.method1039(class184.field2196, field668.field1293);
                var53.field2315.method5089(Statics.field5);
                var53.field2315.method5026(Statics.field164);
                var53.field2315.method5153(arg3);
                var53.field2315.method5026(Statics.field388);
                var53.field2315.method5009(class46.field370[82] ? 1 : 0);
                field668.method2040(var53);
            }
        }
        if (arg2 == 21) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var54 = class188.method1039(class184.field2266, field668.field1293);
            var54.field2315.method5026(Statics.field2734 + arg0);
            var54.field2315.method5153(Statics.field3631 + arg1);
            var54.field2315.method5009(class46.field370[82] ? 1 : 0);
            var54.field2315.method4975(arg3);
            field668.method2040(var54);
        }
        if (arg2 == 23) {
            if (field773) {
                Statics.field1304.method2819();
            } else {
                Statics.field1304.method2818(Statics.field174, arg0, arg1, true);
            }
        }
        if (arg2 == 50) {
            class67 var55 = field753[arg3];
            if (var55 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var56 = class188.method1039(class184.field2275, field668.field1293);
                var56.field2315.method5024(arg3);
                var56.field2315.method5015(class46.field370[82] ? 1 : 0);
                field668.method2040(var56);
            }
        }
        if (arg2 == 29) {
            class188 var57 = class188.method1039(class184.field2262, field668.field1293);
            var57.field2315.method4977(arg1);
            field668.method2040(var57);
            class218 var58 = class218.method728(arg1);
            if (var58.field2683 != null && var58.field2683[0][0] == 5) {
                int var59 = var58.field2683[0][1];
                if (class213.field2511[var59] != var58.field2631[0]) {
                    class213.field2511[var59] = var58.field2631[0];
                    method3153(var59);
                }
            }
        }
        if (arg2 == 58) {
            class218 var60 = class218.method61(arg1, arg0);
            if (var60 != null) {
                class188 var61 = class188.method1039(class184.field2237, field668.field1293);
                var61.field2315.method5178(arg1);
                var61.field2315.method4975(var60.field2572);
                var61.field2315.method5089(Statics.field1158);
                var61.field2315.method5026(arg0);
                var61.field2315.method5153(field769);
                var61.field2315.method5153(field794);
                field668.method2040(var61);
            }
        }
        if (arg2 == 49) {
            class67 var62 = field753[arg3];
            if (var62 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var63 = class188.method1039(class184.field2215, field668.field1293);
                var63.field2315.method4975(arg3);
                var63.field2315.method5015(class46.field370[82] ? 1 : 0);
                field668.method2040(var63);
            }
        }
        if (arg2 == 36) {
            class188 var64 = class188.method1039(class184.field2199, field668.field1293);
            var64.field2315.method5026(arg3);
            var64.field2315.method5024(arg0);
            var64.field2315.method5178(arg1);
            field668.method2040(var64);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 1002) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            class188 var65 = class188.method1039(class184.field2221, field668.field1293);
            var65.field2315.method5024(arg3);
            field668.method2040(var65);
        }
        if (arg2 == 18) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var66 = class188.method1039(class184.field2278, field668.field1293);
            var66.field2315.method5009(class46.field370[82] ? 1 : 0);
            var66.field2315.method5024(Statics.field3631 + arg1);
            var66.field2315.method5153(Statics.field2734 + arg0);
            var66.field2315.method5026(arg3);
            field668.method2040(var66);
        }
        if (arg2 == 34) {
            class188 var67 = class188.method1039(class184.field2256, field668.field1293);
            var67.field2315.method4977(arg1);
            var67.field2315.method5024(arg0);
            var67.field2315.method5153(arg3);
            field668.method2040(var67);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 28) {
            class188 var68 = class188.method1039(class184.field2262, field668.field1293);
            var68.field2315.method4977(arg1);
            field668.method2040(var68);
            class218 var69 = class218.method728(arg1);
            if (var69.field2683 != null && var69.field2683[0][0] == 5) {
                int var70 = var69.field2683[0][1];
                class213.field2511[var70] = 1 - class213.field2511[var70];
                method3153(var70);
            }
        }
        if (arg2 == 2) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var71 = class188.method1039(class184.field2253, field668.field1293);
            var71.field2315.method4977(Statics.field1158);
            var71.field2315.method5065(class46.field370[82] ? 1 : 0);
            var71.field2315.method4975(Statics.field3631 + arg1);
            var71.field2315.method5026(arg3);
            var71.field2315.method4975(Statics.field2734 + arg0);
            var71.field2315.method5153(field769);
            field668.method2040(var71);
        }
        if (arg2 == 51) {
            class67 var72 = field753[arg3];
            if (var72 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var73 = class188.method1039(class184.field2263, field668.field1293);
                var73.field2315.method5015(class46.field370[82] ? 1 : 0);
                var73.field2315.method5153(arg3);
                field668.method2040(var73);
            }
        }
        if (arg2 == 20) {
            field737 = arg6;
            field739 = arg7;
            field741 = 2;
            field740 = 0;
            field865 = arg0;
            field790 = arg1;
            class188 var74 = class188.method1039(class184.field2241, field668.field1293);
            var74.field2315.method5016(class46.field370[82] ? 1 : 0);
            var74.field2315.method5026(Statics.field2734 + arg0);
            var74.field2315.method5153(Statics.field3631 + arg1);
            var74.field2315.method5024(arg3);
            field668.method2040(var74);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field481.method5794(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 15) {
            class67 var75 = field753[arg3];
            if (var75 != null) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var76 = class188.method1039(class184.field2240, field668.field1293);
                var76.field2315.method5024(arg3);
                var76.field2315.method5153(field769);
                var76.field2315.method5065(class46.field370[82] ? 1 : 0);
                var76.field2315.method5037(Statics.field1158);
                field668.method2040(var76);
            }
        }
        if (arg2 == 31) {
            class188 var77 = class188.method1039(class184.field2270, field668.field1293);
            var77.field2315.method5178(arg1);
            var77.field2315.method5026(Statics.field388);
            var77.field2315.method4977(Statics.field5);
            var77.field2315.method4975(Statics.field164);
            var77.field2315.method4975(arg0);
            var77.field2315.method4975(arg3);
            field668.method2040(var77);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 37) {
            class188 var78 = class188.method1039(class184.field2248, field668.field1293);
            var78.field2315.method5153(arg0);
            var78.field2315.method5178(arg1);
            var78.field2315.method5153(arg3);
            field668.method2040(var78);
            field751 = 0;
            Statics.field629 = class218.method728(arg1);
            field744 = arg0;
        }
        if (arg2 == 38) {
            method3554();
            class218 var79 = class218.method728(arg1);
            field758 = 1;
            Statics.field388 = arg0;
            Statics.field5 = arg1;
            Statics.field164 = arg3;
            method237(var79);
            field770 = class82.method1631(16748608) + class255.method2964(arg3).field3387 + class82.method1631(16777215);
            if (field770 == null) {
                field770 = class225.field2755;
            }
        } else if (arg2 == 25) {
            class218 var80 = class218.method61(arg1, arg0);
            if (var80 != null) {
                method3554();
                method509(arg1, arg0, class219.method21(method15(var80)), var80.field2572);
                field758 = 0;
                field828 = method3917(var80);
                if (field828 == null) {
                    field828 = class225.field2755;
                }
                if (var80.field2593) {
                    field862 = var80.field2625 + class82.method1631(16777215);
                } else {
                    field862 = class82.method1631(65280) + var80.field2592 + class82.method1631(16777215);
                }
            }
        } else {
            if (arg2 == 19) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var81 = class188.method1039(class184.field2206, field668.field1293);
                var81.field2315.method5015(class46.field370[82] ? 1 : 0);
                var81.field2315.method5153(Statics.field2734 + arg0);
                var81.field2315.method5153(arg3);
                var81.field2315.method5153(Statics.field3631 + arg1);
                field668.method2040(var81);
            }
            if (arg2 == 1005) {
                class218 var82 = class218.method728(arg1);
                if (var82 == null || var82.field2671[arg0] < 100000) {
                    class188 var83 = class188.method1039(class184.field2213, field668.field1293);
                    var83.field2315.method4975(arg3);
                    field668.method2040(var83);
                } else {
                    class92.method3567(27, "", var82.field2671[arg0] + " x " + class255.method2964(arg3).field3387);
                }
                field751 = 0;
                Statics.field629 = class218.method728(arg1);
                field744 = arg0;
            }
            if (arg2 == 1) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var84 = class188.method1039(class184.field2231, field668.field1293);
                var84.field2315.method5024(Statics.field2734 + arg0);
                var84.field2315.method4975(Statics.field3631 + arg1);
                var84.field2315.method5153(Statics.field164);
                var84.field2315.method5178(Statics.field5);
                var84.field2315.method4975(Statics.field388);
                var84.field2315.method5026(arg3);
                var84.field2315.method5016(class46.field370[82] ? 1 : 0);
                field668.method2040(var84);
            }
            if (arg2 == 17) {
                field737 = arg6;
                field739 = arg7;
                field741 = 2;
                field740 = 0;
                field865 = arg0;
                field790 = arg1;
                class188 var85 = class188.method1039(class184.field2219, field668.field1293);
                var85.field2315.method5153(Statics.field3631 + arg1);
                var85.field2315.method5089(Statics.field1158);
                var85.field2315.method5026(arg3);
                var85.field2315.method5153(field769);
                var85.field2315.method5024(Statics.field2734 + arg0);
                var85.field2315.method5015(class46.field370[82] ? 1 : 0);
                field668.method2040(var85);
            }
            if (arg2 == 41) {
                class188 var86 = class188.method1039(class184.field2251, field668.field1293);
                var86.field2315.method5024(arg0);
                var86.field2315.method5037(arg1);
                var86.field2315.method5024(arg3);
                field668.method2040(var86);
                field751 = 0;
                Statics.field629 = class218.method728(arg1);
                field744 = arg0;
            }
            if (arg2 == 48) {
                class67 var87 = field753[arg3];
                if (var87 != null) {
                    field737 = arg6;
                    field739 = arg7;
                    field741 = 2;
                    field740 = 0;
                    field865 = arg0;
                    field790 = arg1;
                    class188 var88 = class188.method1039(class184.field2243, field668.field1293);
                    var88.field2315.method5016(class46.field370[82] ? 1 : 0);
                    var88.field2315.method5024(arg3);
                    field668.method2040(var88);
                }
            }
            if (field758 != 0) {
                field758 = 0;
                method237(class218.method728(Statics.field5));
            }
            if (field816) {
                method3554();
            }
            if (Statics.field629 != null && field751 == 0) {
                method237(Statics.field629);
            }
        }
    }

    @ObfuscatedName("g.hu(ILjava/lang/String;I)V")
    public static void method187(int arg0, String arg1) {
        int var2 = class90.field1235;
        int[] var3 = class90.field1239;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field275);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field753[var3[var6]];
            if (var7 != null && Statics.field2737 != var7 && var7.field599 != null && var7.field599.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method1039(class184.field2232, field668.field1293);
                    var8.field2315.method5153(var3[var6]);
                    var8.field2315.method5015(0);
                    field668.method2040(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method1039(class184.field2272, field668.field1293);
                    var9.field2315.method5026(var3[var6]);
                    var9.field2315.method5016(0);
                    field668.method2040(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method1039(class184.field2215, field668.field1293);
                    var10.field2315.method4975(var3[var6]);
                    var10.field2315.method5015(0);
                    field668.method2040(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method1039(class184.field2275, field668.field1293);
                    var11.field2315.method5024(var3[var6]);
                    var11.field2315.method5015(0);
                    field668.method2040(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method3567(4, "", class225.field2892 + arg1);
        }
    }

    @ObfuscatedName("ab.hi(IIIII)V")
    public static void method509(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method61(arg0, arg1);
        if (var4 != null && var4.field2643 != null) {
            class63 var5 = new class63();
            var5.field566 = var4;
            var5.field572 = var4.field2643;
            class77.method4064(var5);
        }
        field794 = arg3;
        field816 = true;
        Statics.field1158 = arg0;
        field769 = arg1;
        Statics.field528 = arg2;
        method237(var4);
    }

    @ObfuscatedName("hh.hx(I)V")
    public static void method3554() {
        if (!field816) {
            return;
        }
        class218 var0 = class218.method61(Statics.field1158, field769);
        if (var0 != null && var0.field2644 != null) {
            class63 var1 = new class63();
            var1.field566 = var0;
            var1.field572 = var0.field2644;
            class77.method4064(var1);
        }
        field816 = false;
        method237(var0);
    }

    @ObfuscatedName("fz.hf(IIB)V")
    public static void method3149(int arg0, int arg1) {
        class188 var2 = class188.method1039(class184.field2186, field668.field1293);
        var2.field2315.method5089(arg0);
        var2.field2315.method4975(arg1);
        field668.method2040(var2);
    }

    @ObfuscatedName("ax.hd(IIIILjava/lang/String;B)V")
    public static void method520(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method61(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2652 != null) {
            class63 var6 = new class63();
            var6.field566 = var5;
            var6.field564 = arg0;
            var6.field568 = arg4;
            var6.field572 = var5.field2652;
            class77.method4064(var6);
        }
        boolean var7 = true;
        if (var5.field2550 > 0) {
            var7 = method684(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method15(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class188 var11 = class188.method1039(class184.field2245, field668.field1293);
            var11.field2315.method4977(arg1);
            var11.field2315.method4975(arg2);
            var11.field2315.method4975(arg3);
            field668.method2040(var11);
        }
        if (arg0 == 2) {
            class188 var12 = class188.method1039(class184.field2250, field668.field1293);
            var12.field2315.method4977(arg1);
            var12.field2315.method4975(arg2);
            var12.field2315.method4975(arg3);
            field668.method2040(var12);
        }
        if (arg0 == 3) {
            class188 var13 = class188.method1039(class184.field2258, field668.field1293);
            var13.field2315.method4977(arg1);
            var13.field2315.method4975(arg2);
            var13.field2315.method4975(arg3);
            field668.method2040(var13);
        }
        if (arg0 == 4) {
            class188 var14 = class188.method1039(class184.field2195, field668.field1293);
            var14.field2315.method4977(arg1);
            var14.field2315.method4975(arg2);
            var14.field2315.method4975(arg3);
            field668.method2040(var14);
        }
        if (arg0 == 5) {
            class188 var15 = class188.method1039(class184.field2205, field668.field1293);
            var15.field2315.method4977(arg1);
            var15.field2315.method4975(arg2);
            var15.field2315.method4975(arg3);
            field668.method2040(var15);
        }
        if (arg0 == 6) {
            class188 var16 = class188.method1039(class184.field2201, field668.field1293);
            var16.field2315.method4977(arg1);
            var16.field2315.method4975(arg2);
            var16.field2315.method4975(arg3);
            field668.method2040(var16);
        }
        if (arg0 == 7) {
            class188 var17 = class188.method1039(class184.field2252, field668.field1293);
            var17.field2315.method4977(arg1);
            var17.field2315.method4975(arg2);
            var17.field2315.method4975(arg3);
            field668.method2040(var17);
        }
        if (arg0 == 8) {
            class188 var18 = class188.method1039(class184.field2204, field668.field1293);
            var18.field2315.method4977(arg1);
            var18.field2315.method4975(arg2);
            var18.field2315.method4975(arg3);
            field668.method2040(var18);
        }
        if (arg0 == 9) {
            class188 var19 = class188.method1039(class184.field2214, field668.field1293);
            var19.field2315.method4977(arg1);
            var19.field2315.method4975(arg2);
            var19.field2315.method4975(arg3);
            field668.method2040(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var20 = class188.method1039(class184.field2286, field668.field1293);
        var20.field2315.method4977(arg1);
        var20.field2315.method4975(arg2);
        var20.field2315.method4975(arg3);
        field668.method2040(var20);
    }

    @ObfuscatedName("ai.hw(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method602(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1881(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cn.hj(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1881(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field773 || field774 >= 500) {
            return;
        }
        field779[field774] = arg0;
        field780[field774] = arg1;
        field777[field774] = arg2;
        field778[field774] = arg3;
        field847[field774] = arg4;
        field776[field774] = arg5;
        field781[field774] = arg6;
        field774++;
    }

    @ObfuscatedName("fd.hs(B)I")
    public static final int method3099() {
        return field774 - 1;
    }

    @ObfuscatedName("cb.ha(I)V")
    public static void method1937() {
        for (int var0 = 0; var0 < field774; var0++) {
            if (method5251(field777[var0])) {
                if (var0 < field774 - 1) {
                    for (int var1 = var0; var1 < field774 - 1; var1++) {
                        field779[var1] = field779[var1 + 1];
                        field780[var1] = field780[var1 + 1];
                        field777[var1] = field777[var1 + 1];
                        field778[var1] = field778[var1 + 1];
                        field847[var1] = field847[var1 + 1];
                        field776[var1] = field776[var1 + 1];
                        field781[var1] = field781[var1 + 1];
                    }
                }
                var0--;
                field774--;
            }
        }
        method3108(Statics.field1055 / 2 + Statics.field1923, Statics.field409);
    }

    @ObfuscatedName("kj.hy(II)Z")
    public static boolean method5251(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ak.hc(II)Ljava/lang/String;")
    public static String method666(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field780[arg0].length() > 0) {
            return field779[arg0] + class225.field2903 + field780[arg0];
        } else {
            return field779[arg0];
        }
    }

    @ObfuscatedName("ab.hp(IIIII)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (field758 == 0 && !field816) {
            method602(class225.field2898, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1713;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class129.method19(var4);
                    int var12 = class129.method514(var4);
                    class67 var13 = field753[field654];
                    method73(var13, field654, var11, var12);
                }
                return;
            }
            long var14 = class129.field1714[var8];
            if (var6 != var14) {
                label277: {
                    var6 = var14;
                    int var18 = class129.method19(class129.field1714[var8]);
                    int var19 = var18;
                    int var20 = class129.method1017(var8);
                    int var21 = class129.method1870(var8);
                    int var22 = class129.method1871(class129.field1714[var8]);
                    int var23 = var22;
                    if (var21 == 2 && Statics.field1304.method2811(Statics.field174, var18, var20, var14) >= 0) {
                        class254 var24 = class254.method1148(var22);
                        if (var24.field3378 != null) {
                            var24 = var24.method4158();
                        }
                        if (var24 == null) {
                            break label277;
                        }
                        if (field758 == 1) {
                            method602(class225.field2893, field770 + " " + class82.field1137 + " " + class82.method1631(65535) + var24.field3379, 1, var22, var18, var20);
                        } else if (!field816) {
                            String[] var25 = var24.field3351;
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25[var26] != null) {
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 3;
                                        }
                                        if (var26 == 1) {
                                            var27 = 4;
                                        }
                                        if (var26 == 2) {
                                            var27 = 5;
                                        }
                                        if (var26 == 3) {
                                            var27 = 6;
                                        }
                                        if (var26 == 4) {
                                            var27 = 1001;
                                        }
                                        method602(var25[var26], class82.method1631(65535) + var24.field3379, var27, var23, var19, var20);
                                    }
                                }
                            }
                            method602(class225.field2878, class82.method1631(65535) + var24.field3379, 1002, var24.field3344, var19, var20);
                        } else if ((Statics.field528 & 0x4) == 4) {
                            method602(field828, field862 + " " + class82.field1137 + " " + class82.method1631(65535) + var24.field3379, 2, var22, var18, var20);
                        }
                    }
                    if (var21 == 1) {
                        class80 var28 = field678[var23];
                        if (var28 == null) {
                            break label277;
                        }
                        if (var28.field1114.field3474 == 1 && (var28.field986 & 0x7F) == 64 && (var28.field930 & 0x7F) == 64) {
                            for (int var29 = 0; var29 < field733; var29++) {
                                class80 var30 = field678[field680[var29]];
                                if (var30 != null && var28 != var30 && var30.field1114.field3474 == 1 && var28.field986 == var30.field986 && var28.field930 == var30.field930) {
                                    method3272(var30.field1114, field680[var29], var19, var20);
                                }
                            }
                            int var31 = class90.field1235;
                            int[] var32 = class90.field1239;
                            for (int var33 = 0; var33 < var31; var33++) {
                                class67 var34 = field753[var32[var33]];
                                if (var34 != null && var28.field986 == var34.field986 && var28.field930 == var34.field930) {
                                    method73(var34, var32[var33], var19, var20);
                                }
                            }
                        }
                        method3272(var28.field1114, var23, var19, var20);
                    }
                    if (var21 == 0) {
                        class67 var35 = field753[var23];
                        if (var35 == null) {
                            break label277;
                        }
                        if ((var35.field986 & 0x7F) == 64 && (var35.field930 & 0x7F) == 64) {
                            for (int var36 = 0; var36 < field733; var36++) {
                                class80 var37 = field678[field680[var36]];
                                if (var37 != null && var37.field1114.field3474 == 1 && var35.field986 == var37.field986 && var35.field930 == var37.field930) {
                                    method3272(var37.field1114, field680[var36], var19, var20);
                                }
                            }
                            int var38 = class90.field1235;
                            int[] var39 = class90.field1239;
                            for (int var40 = 0; var40 < var38; var40++) {
                                class67 var41 = field753[var39[var40]];
                                if (var41 != null && var35 != var41 && var35.field986 == var41.field986 && var35.field930 == var41.field930) {
                                    method73(var41, var39[var40], var19, var20);
                                }
                            }
                        }
                        if (field654 == var23) {
                            var4 = var14;
                        } else {
                            method73(var35, var23, var19, var20);
                        }
                    }
                    if (var21 == 3) {
                        class262 var42 = field765[Statics.field174][var19][var20];
                        if (var42 != null) {
                            for (class88 var43 = (class88) var42.method4439(); var43 != null; var43 = (class88) var42.method4456()) {
                                class255 var44 = class255.method2964(var43.field1225);
                                if (field758 == 1) {
                                    method602(class225.field2893, field770 + " " + class82.field1137 + " " + class82.method1631(16748608) + var44.field3387, 16, var43.field1225, var19, var20);
                                } else if (!field816) {
                                    String[] var45 = var44.field3411;
                                    for (int var46 = 4; var46 >= 0; var46--) {
                                        if (var45 != null && var45[var46] != null) {
                                            byte var47 = 0;
                                            if (var46 == 0) {
                                                var47 = 18;
                                            }
                                            if (var46 == 1) {
                                                var47 = 19;
                                            }
                                            if (var46 == 2) {
                                                var47 = 20;
                                            }
                                            if (var46 == 3) {
                                                var47 = 21;
                                            }
                                            if (var46 == 4) {
                                                var47 = 22;
                                            }
                                            method602(var45[var46], class82.method1631(16748608) + var44.field3387, var47, var43.field1225, var19, var20);
                                        } else if (var46 == 2) {
                                            method602(class225.field2740, class82.method1631(16748608) + var44.field3387, 20, var43.field1225, var19, var20);
                                        }
                                    }
                                    method602(class225.field2878, class82.method1631(16748608) + var44.field3387, 1004, var43.field1225, var19, var20);
                                } else if ((Statics.field528 & 0x1) == 1) {
                                    method602(field828, field862 + " " + class82.field1137 + " " + class82.method1631(16748608) + var44.field3387, 17, var43.field1225, var19, var20);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("gg.ih(Lil;IIII)V")
    public static final void method3272(class257 arg0, int arg1, int arg2, int arg3) {
        if (field774 >= 400) {
            return;
        }
        if (arg0.field3463 != null) {
            arg0 = arg0.method4273();
        }
        if (arg0 == null || !arg0.field3482 || arg0.field3455 && field807 != arg1) {
            return;
        }
        String var4 = arg0.field3454;
        if (arg0.field3471 != 0) {
            int var6 = arg0.field3471;
            int var7 = Statics.field2737.field596;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method1631(16711680);
            } else if (var8 < -6) {
                var9 = class82.method1631(16723968);
            } else if (var8 < -3) {
                var9 = class82.method1631(16740352);
            } else if (var8 < 0) {
                var9 = class82.method1631(16756736);
            } else if (var8 > 9) {
                var9 = class82.method1631(65280);
            } else if (var8 > 6) {
                var9 = class82.method1631(4259584);
            } else if (var8 > 3) {
                var9 = class82.method1631(8453888);
            } else if (var8 > 0) {
                var9 = class82.method1631(12648192);
            } else {
                var9 = class82.method1631(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1133 + class225.field2775 + arg0.field3471 + class82.field1135;
        }
        if (arg0.field3455 && field782) {
            method602(class225.field2878, class82.method1631(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field758 == 1) {
            method602(class225.field2893, field770 + " " + class82.field1137 + " " + class82.method1631(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field816) {
            int var10 = arg0.field3455 && field782 ? 2000 : 0;
            String[] var11 = arg0.field3459;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class225.field2895)) {
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
                        method602(var11[var12], class82.method1631(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class225.field2895)) {
                        short var15 = 0;
                        if (field662 != class85.field1154) {
                            if (field662 == class85.field1152 || field662 == class85.field1156 && arg0.field3471 > Statics.field2737.field596) {
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
                            method602(var11[var14], class82.method1631(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3455 || !field782) {
                method602(class225.field2878, class82.method1631(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field528 & 0x2) == 2) {
            method602(field828, field862 + " " + class82.field1137 + " " + class82.method1631(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("m.ie(Lbi;IIII)V")
    public static final void method73(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2737 == arg0 || field774 >= 400) {
            return;
        }
        String var9;
        if (arg0.field616 == 0) {
            String var4 = arg0.field601[0] + arg0.field599 + arg0.field601[1];
            int var5 = arg0.field596;
            int var6 = Statics.field2737.field596;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method1631(16711680);
            } else if (var7 < -6) {
                var8 = class82.method1631(16723968);
            } else if (var7 < -3) {
                var8 = class82.method1631(16740352);
            } else if (var7 < 0) {
                var8 = class82.method1631(16756736);
            } else if (var7 > 9) {
                var8 = class82.method1631(65280);
            } else if (var7 > 6) {
                var8 = class82.method1631(4259584);
            } else if (var7 > 3) {
                var8 = class82.method1631(8453888);
            } else if (var7 > 0) {
                var8 = class82.method1631(12648192);
            } else {
                var8 = class82.method1631(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1133 + class225.field2775 + arg0.field596 + class82.field1135 + arg0.field601[2];
        } else {
            var9 = arg0.field601[0] + arg0.field599 + arg0.field601[1] + " " + class82.field1133 + class225.field2900 + arg0.field616 + class82.field1135 + arg0.field601[2];
        }
        if (field758 == 1) {
            method602(class225.field2893, field770 + " " + class82.field1137 + " " + class82.method1631(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field816) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field761[var10] != null) {
                    short var11 = 0;
                    if (field761[var10].equalsIgnoreCase(class225.field2895)) {
                        if (field661 == class85.field1154) {
                            continue;
                        }
                        if (field661 == class85.field1152 || field661 == class85.field1156 && arg0.field596 > Statics.field2737.field596) {
                            var11 = 2000;
                        }
                        if (Statics.field2737.field617 != 0 && arg0.field617 != 0) {
                            if (Statics.field2737.field617 == arg0.field617) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field882[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field756[var10] + var11;
                    method602(field761[var10], class82.method1631(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field528 & 0x8) == 8) {
            method602(field828, field862 + " " + class82.field1137 + " " + class82.method1631(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field774; var14++) {
            if (field777[var14] == 23) {
                field780[var14] = class82.method1631(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bz.io(IIIIIIIII)V")
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method178(arg0)) {
            Statics.field62 = null;
            method1047(Statics.field1967[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field62 != null) {
                method1047(Statics.field62, -1412584499, arg1, arg2, arg3, arg4, Statics.field3062, Statics.field1890, arg7);
                Statics.field62 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field842[var8] = true;
            }
        } else {
            field842[arg7] = true;
        }
    }

    @ObfuscatedName("ba.ib([Lho;IIIIIIIIB)V")
    public static final void method1047(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5502(arg2, arg3, arg4, arg5);
        class131.method2699();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2565 == arg1 || arg1 == -1412584499 && field810 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field845[field840] = var10.field2611 + arg6;
                    field846[field840] = var10.field2566 + arg7;
                    field830[field840] = var10.field2672;
                    field710[field840] = var10.field2639;
                    var11 = ++field840 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2560 = var11;
                var10.field2684 = field645;
                if (!var10.field2593 || !method238(var10)) {
                    if (var10.field2550 > 0) {
                        method207(var10);
                    }
                    int var12 = var10.field2611 + arg6;
                    int var13 = var10.field2566 + arg7;
                    int var14 = var10.field2577;
                    if (field810 == var10) {
                        if (arg1 != -1412584499 && !var10.field2575) {
                            Statics.field62 = arg0;
                            Statics.field3062 = arg6;
                            Statics.field1890 = arg7;
                            continue;
                        }
                        if (field793 && field815) {
                            int var15 = class55.field466;
                            int var16 = class55.field467;
                            int var17 = var15 - field812;
                            int var18 = var16 - field813;
                            if (var17 < field696) {
                                var17 = field696;
                            }
                            if (var10.field2672 + var17 > field696 + field811.field2672) {
                                var17 = field696 + field811.field2672 - var10.field2672;
                            }
                            if (var18 < field817) {
                                var18 = field817;
                            }
                            if (var10.field2639 + var18 > field817 + field811.field2639) {
                                var18 = field817 + field811.field2639 - var10.field2639;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2575) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2548 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2548 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2672 + var12;
                        int var26 = var10.field2639 + var13;
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
                        int var29 = var10.field2672 + var12;
                        int var30 = var10.field2639 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2593 || var19 < var21 && var20 < var22) {
                        if (var10.field2550 != 0) {
                            if (var10.field2550 == 1336) {
                                if (field651) {
                                    var13 += 15;
                                    Statics.field3799.method4922("Fps:" + field429, var10.field2672 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field870) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3799.method4922("Mem:" + var32 + "k", var10.field2672 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2550 == 1337) {
                                field786 = var12;
                                field787 = var13;
                                method4721(var12, var13, var10.field2672, var10.field2639);
                                field842[var10.field2560] = true;
                                class321.method5502(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2550 == 1338) {
                                method1668(var10, var12, var13, var11);
                                class321.method5502(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2550 == 1339) {
                                method2241(var10, var12, var13, var11);
                                class321.method5502(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2550 == 1400) {
                                Statics.field481.method5781(var12, var13, var10.field2672, var10.field2639, field645);
                            }
                            if (var10.field2550 == 1401) {
                                Statics.field481.method5760(var12, var13, var10.field2672, var10.field2639);
                            }
                            if (var10.field2550 == 1402) {
                                Statics.field3776.method1637(var12, field645);
                            }
                        }
                        if (var10.field2548 == 0) {
                            if (!var10.field2593 && method238(var10) && Statics.field2053 != var10) {
                                continue;
                            }
                            if (!var10.field2593) {
                                if (var10.field2568 > var10.field2570 - var10.field2639) {
                                    var10.field2568 = var10.field2570 - var10.field2639;
                                }
                                if (var10.field2568 < 0) {
                                    var10.field2568 = 0;
                                }
                            }
                            method1047(arg0, var10.field2546, var19, var20, var21, var22, var12 - var10.field2567, var13 - var10.field2568, var11);
                            if (var10.field2676 != null) {
                                method1047(var10.field2676, var10.field2546, var19, var20, var21, var22, var12 - var10.field2567, var13 - var10.field2568, var11);
                            }
                            class62 var34 = (class62) field900.method5393((long) var10.field2546);
                            if (var34 != null) {
                                method1032(var34.field558, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5502(arg2, arg3, arg4, arg5);
                            class131.method2699();
                        }
                        if (field851 || field848[var11] || field784 > 1) {
                            if (var10.field2548 == 0 && !var10.field2593 && var10.field2570 > var10.field2639) {
                                method802(var10.field2672 + var12, var13, var10.field2568, var10.field2639, var10.field2570);
                            }
                            if (var10.field2548 != 1) {
                                if (var10.field2548 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2558; var36++) {
                                        for (int var37 = 0; var37 < var10.field2557; var37++) {
                                            int var38 = (var10.field2585 + 32) * var37 + var12;
                                            int var39 = (var10.field2614 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2615[var35];
                                                var39 += var10.field2616[var35];
                                            }
                                            if (var10.field2670[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2670[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1870 == var10 && field822 == var35) {
                                                    class325 var43;
                                                    if (field758 == 1 && Statics.field388 == var35 && Statics.field5 == var10.field2546) {
                                                        var43 = class255.method58(var42, var10.field2671[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method58(var42, var10.field2671[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method237(var10);
                                                    } else if (Statics.field1870 == var10 && field822 == var35) {
                                                        int var44 = class55.field466 - field746;
                                                        int var45 = class55.field467 - field747;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field750 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5560(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3848 && var46.field2568 > 0) {
                                                                int var47 = field699 * (class321.field3848 - var39 - var45) / 3;
                                                                if (var47 > field699 * 10) {
                                                                    var47 = field699 * 10;
                                                                }
                                                                if (var47 > var46.field2568) {
                                                                    var47 = var46.field2568;
                                                                }
                                                                var46.field2568 -= var47;
                                                                field747 += var47;
                                                                method237(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3847 && var46.field2568 < var46.field2570 - var46.field2639) {
                                                                int var48 = field699 * (var39 + var45 + 32 - class321.field3847) / 3;
                                                                if (var48 > field699 * 10) {
                                                                    var48 = field699 * 10;
                                                                }
                                                                if (var48 > var46.field2570 - var46.field2639 - var46.field2568) {
                                                                    var48 = var46.field2570 - var46.field2639 - var46.field2568;
                                                                }
                                                                var46.field2568 += var48;
                                                                field747 -= var48;
                                                                method237(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field629 == var10 && field744 == var35) {
                                                        var43.method5560(var38, var39, 128);
                                                    } else {
                                                        var43.method5605(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2628 != null && var35 < 20) {
                                                class325 var49 = var10.method3647(var35);
                                                if (var49 != null) {
                                                    var49.method5605(var38, var39);
                                                } else if (class218.field2544) {
                                                    method237(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2548 == 3) {
                                    int var50;
                                    if (method1925(var10)) {
                                        var50 = var10.field2564;
                                        if (Statics.field2053 == var10 && var10.field2574 != 0) {
                                            var50 = var10.field2574;
                                        }
                                    } else {
                                        var50 = var10.field2562;
                                        if (Statics.field2053 == var10 && var10.field2573 != 0) {
                                            var50 = var10.field2573;
                                        }
                                    }
                                    if (var10.field2619) {
                                        switch(var10.field2576.field3856) {
                                            case 1:
                                                class321.method5447(var12, var13, var10.field2672, var10.field2639, var10.field2562, var10.field2564);
                                                break;
                                            case 2:
                                                class321.method5448(var12, var13, var10.field2672, var10.field2639, var10.field2562, var10.field2564, 255 - (var10.field2577 & 0xFF), 255 - (var10.field2578 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5497(var12, var13, var10.field2672, var10.field2639, var50);
                                                } else {
                                                    class321.method5445(var12, var13, var10.field2672, var10.field2639, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5450(var12, var13, var10.field2672, var10.field2639, var50);
                                    } else {
                                        class321.method5493(var12, var13, var10.field2672, var10.field2639, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2548 == 4) {
                                    class295 var51 = var10.method3646();
                                    if (var51 != null) {
                                        String var52 = var10.field2607;
                                        int var53;
                                        if (method1925(var10)) {
                                            var53 = var10.field2564;
                                            if (Statics.field2053 == var10 && var10.field2574 != 0) {
                                                var53 = var10.field2574;
                                            }
                                            if (var10.field2589.length() > 0) {
                                                var52 = var10.field2589;
                                            }
                                        } else {
                                            var53 = var10.field2562;
                                            if (Statics.field2053 == var10 && var10.field2573 != 0) {
                                                var53 = var10.field2573;
                                            }
                                        }
                                        if (var10.field2593 && var10.field2572 != -1) {
                                            class255 var54 = class255.method2964(var10.field2572);
                                            var52 = var54.field3387;
                                            if (var52 == null) {
                                                var52 = class225.field2755;
                                            }
                                            if ((var54.field3434 == 1 || var10.field2673 != 1) && var10.field2673 != -1) {
                                                var52 = class82.method1631(16748608) + var52 + class82.field1131 + " " + 'x' + method675(var10.field2673);
                                            }
                                        }
                                        if (field707 == var10) {
                                            var52 = class225.field2901;
                                            var53 = var10.field2562;
                                        }
                                        if (!var10.field2593) {
                                            var52 = method3931(var52, var10);
                                        }
                                        var51.method4856(var52, var12, var13, var10.field2672, var10.field2639, var53, var10.field2608 ? 0 : -1, var10.field2610, var10.field2547, var10.field2624);
                                    } else if (class218.field2544) {
                                        method237(var10);
                                    }
                                } else if (var10.field2548 == 5) {
                                    if (var10.field2593) {
                                        class325 var56;
                                        if (var10.field2572 == -1) {
                                            var56 = var10.method3645(false);
                                        } else {
                                            var56 = class255.method58(var10.field2572, var10.field2673, var10.field2569, var10.field2586, var10.field2605, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3876;
                                            int var58 = var56.field3874;
                                            if (var10.field2584) {
                                                class321.method5506(var12, var13, var10.field2672 + var12, var10.field2639 + var13);
                                                int var59 = (var10.field2672 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2639 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2583 != 0) {
                                                            var56.method5572(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2583, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5605(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5560(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5502(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2672 * 4096 / var57;
                                                if (var10.field2583 != 0) {
                                                    var56.method5572(var10.field2672 / 2 + var12, var10.field2639 / 2 + var13, var10.field2583, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5659(var12, var13, var10.field2672, var10.field2639, 256 - (var14 & 0xFF));
                                                } else if (var10.field2672 == var57 && var10.field2639 == var58) {
                                                    var56.method5605(var12, var13);
                                                } else {
                                                    var56.method5556(var12, var13, var10.field2672, var10.field2639);
                                                }
                                            }
                                        } else if (class218.field2544) {
                                            method237(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3645(method1925(var10));
                                        if (var55 != null) {
                                            var55.method5605(var12, var13);
                                        } else if (class218.field2544) {
                                            method237(var10);
                                        }
                                    }
                                } else if (var10.field2548 == 6) {
                                    boolean var64 = method1925(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2594;
                                    } else {
                                        var65 = var10.field2556;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2572 != -1) {
                                        class255 var68 = class255.method2964(var10.field2572);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4222(var10.field2673);
                                            var66 = var69.method4238(1);
                                            if (var66 == null) {
                                                method237(var10);
                                            } else {
                                                var66.method2592();
                                                var67 = var66.field1843 / 2;
                                            }
                                        }
                                    } else if (var10.field2666 == 5) {
                                        if (var10.field2590 == 0) {
                                            var66 = field743.method3629((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field2737.method1115();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3648((class259) null, -1, var64, Statics.field2737.field597);
                                        if (var66 == null && class218.field2544) {
                                            method237(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method122(var65);
                                        var66 = var10.method3648(var70, var10.field2601, var64, Statics.field2737.field597);
                                        if (var66 == null && class218.field2544) {
                                            method237(var10);
                                        }
                                    }
                                    class131.method2727(var10.field2672 / 2 + var12, var10.field2639 / 2 + var13);
                                    int var71 = var10.field2600 * class131.field1747[var10.field2551] >> 16;
                                    int var72 = var10.field2600 * class131.field1730[var10.field2551] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2593) {
                                            var66.method2592();
                                            if (var10.field2603) {
                                                var66.method2606(0, var10.field2598, var10.field2612, var10.field2551, var10.field2595, var10.field2596 + var67 + var71, var10.field2596 + var72, var10.field2600);
                                            } else {
                                                var66.method2605(0, var10.field2598, var10.field2612, var10.field2551, var10.field2595, var10.field2596 + var67 + var71, var10.field2596 + var72);
                                            }
                                        } else {
                                            var66.method2605(0, var10.field2598, 0, var10.field2551, 0, var71, var72);
                                        }
                                    }
                                    class131.method2701();
                                } else {
                                    if (var10.field2548 == 7) {
                                        class295 var73 = var10.method3646();
                                        if (var73 == null) {
                                            if (class218.field2544) {
                                                method237(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2558; var75++) {
                                            for (int var76 = 0; var76 < var10.field2557; var76++) {
                                                if (var10.field2670[var74] > 0) {
                                                    class255 var77 = class255.method2964(var10.field2670[var74] - 1);
                                                    String var78;
                                                    if (var77.field3434 != 1 && var10.field2671[var74] == 1) {
                                                        var78 = class82.method1631(16748608) + var77.field3387 + class82.field1131;
                                                    } else {
                                                        var78 = class82.method1631(16748608) + var77.field3387 + class82.field1131 + " " + 'x' + method675(var10.field2671[var74]);
                                                    }
                                                    int var79 = (var10.field2585 + 115) * var76 + var12;
                                                    int var80 = (var10.field2614 + 12) * var75 + var13;
                                                    if (var10.field2610 == 0) {
                                                        var73.method4852(var78, var79, var80, var10.field2562, var10.field2608 ? 0 : -1);
                                                    } else if (var10.field2610 == 1) {
                                                        var73.method4855(var78, var10.field2672 / 2 + var79, var80, var10.field2562, var10.field2608 ? 0 : -1);
                                                    } else {
                                                        var73.method4922(var78, var10.field2672 + var79 - 1, var80, var10.field2562, var10.field2608 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2548 == 8 && Statics.field2768 == var10 && field789 == field788) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class295 var83 = Statics.field3799;
                                        String var84 = var10.field2607;
                                        String var85 = method3931(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1134);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4847(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3670 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2672 + var12 - 5 - var81;
                                        int var90 = var10.field2639 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5497(var89, var90, var81, var82, 16777120);
                                        class321.method5450(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2607;
                                        int var92 = var83.field3670 + var90 + 2;
                                        String var93 = method3931(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1134);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4852(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3670 + 1;
                                        }
                                    }
                                    if (var10.field2548 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2580) {
                                            var96 = var12;
                                            var97 = var10.field2639 + var13;
                                            var98 = var10.field2672 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2672 + var12;
                                            var99 = var10.field2639 + var13;
                                        }
                                        if (var10.field2579 == 1) {
                                            class321.method5456(var96, var97, var98, var99, var10.field2562);
                                        } else {
                                            method721(var96, var97, var98, var99, var10.field2562, var10.field2579);
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

    @ObfuscatedName("ag.im(IIIIIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3849;
        int var18 = arg1 - class321.field3848;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2707(var19, var20, var21);
        class131.method2710(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2707(var19, var21, var22);
        class131.method2710(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ig.ig(Ljava/lang/String;Lho;I)Ljava/lang/String;")
    public static String method3931(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3637(arg1, var2 - 1);
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

    @ObfuscatedName("am.iq(IS)Ljava/lang/String;")
    public static final String method675(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1129 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method1631(65408) + var1.substring(0, var1.length() - 8) + class225.field2904 + " " + class82.field1133 + var1 + class82.field1135 + class82.field1131;
        } else if (var1.length() > 6) {
            return " " + class82.method1631(16777215) + var1.substring(0, var1.length() - 4) + class225.field2793 + " " + class82.field1133 + var1 + class82.field1135 + class82.field1131;
        } else {
            return " " + class82.method1631(16776960) + var1 + class82.field1131;
        }
    }

    @ObfuscatedName("client.ij(ZI)V")
    public final void method1365(boolean arg0) {
        method4050(field887, Statics.field1578, Statics.field1904, arg0);
    }

    @ObfuscatedName("client.is(Lho;B)V")
    public void method1266(class218 arg0) {
        class218 var2 = arg0.field2565 == -1 ? null : class218.method728(arg0.field2565);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1578;
            var4 = Statics.field1904;
        } else {
            var3 = var2.field2672;
            var4 = var2.field2639;
        }
        method1929(arg0, var3, var4, false);
        method500(arg0, var3, var4);
    }

    @ObfuscatedName("bh.ik([Lho;Lho;ZI)V")
    public static void method836(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2675 == 0 ? arg1.field2672 : arg1.field2675;
        int var4 = arg1.field2570 == 0 ? arg1.field2639 : arg1.field2570;
        method2955(arg0, arg1.field2546, var3, var4, arg2);
        if (arg1.field2676 != null) {
            method2955(arg1.field2676, arg1.field2546, var3, var4, arg2);
        }
        class62 var5 = (class62) field900.method5393((long) arg1.field2546);
        if (var5 != null) {
            method4050(var5.field558, var3, var4, arg2);
        }
        if (arg1.field2550 == 1337) {
        }
    }

    @ObfuscatedName("iw.iu(IIIZB)V")
    public static final void method4050(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method178(arg0)) {
            method2955(Statics.field1967[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.iy([Lho;IIIZI)V")
    public static void method2955(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2565 == arg1) {
                method1929(var6, arg2, arg3, arg4);
                method500(var6, arg2, arg3);
                if (var6.field2567 > var6.field2675 - var6.field2672) {
                    var6.field2567 = var6.field2675 - var6.field2672;
                }
                if (var6.field2567 < 0) {
                    var6.field2567 = 0;
                }
                if (var6.field2568 > var6.field2570 - var6.field2639) {
                    var6.field2568 = var6.field2570 - var6.field2639;
                }
                if (var6.field2568 < 0) {
                    var6.field2568 = 0;
                }
                if (var6.field2548 == 0) {
                    method836(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cj.ip(Lho;IIZI)V")
    public static void method1929(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2672;
        int var5 = arg0.field2639;
        if (arg0.field2543 == 0) {
            arg0.field2672 = arg0.field2557;
        } else if (arg0.field2543 == 1) {
            arg0.field2672 = arg1 - arg0.field2557;
        } else if (arg0.field2543 == 2) {
            arg0.field2672 = arg0.field2557 * arg1 >> 14;
        }
        if (arg0.field2597 == 0) {
            arg0.field2639 = arg0.field2558;
        } else if (arg0.field2597 == 1) {
            arg0.field2639 = arg2 - arg0.field2558;
        } else if (arg0.field2597 == 2) {
            arg0.field2639 = arg0.field2558 * arg2 >> 14;
        }
        if (arg0.field2543 == 4) {
            arg0.field2672 = arg0.field2656 * arg0.field2639 / arg0.field2630;
        }
        if (arg0.field2597 == 4) {
            arg0.field2639 = arg0.field2672 * arg0.field2630 / arg0.field2656;
        }
        if (arg0.field2550 == 1337) {
            field809 = arg0;
        }
        if (arg3 && arg0.field2661 != null && (arg0.field2672 != var4 || arg0.field2639 != var5)) {
            class63 var6 = new class63();
            var6.field566 = arg0;
            var6.field572 = arg0.field2661;
            field844.method4433(var6);
        }
    }

    @ObfuscatedName("ap.iw(Lho;III)V")
    public static void method500(class218 arg0, int arg1, int arg2) {
        if (arg0.field2571 == 0) {
            arg0.field2611 = arg0.field2555;
        } else if (arg0.field2571 == 1) {
            arg0.field2611 = (arg1 - arg0.field2672) / 2 + arg0.field2555;
        } else if (arg0.field2571 == 2) {
            arg0.field2611 = arg1 - arg0.field2672 - arg0.field2555;
        } else if (arg0.field2571 == 3) {
            arg0.field2611 = arg0.field2555 * arg1 >> 14;
        } else if (arg0.field2571 == 4) {
            arg0.field2611 = (arg0.field2555 * arg1 >> 14) + (arg1 - arg0.field2672) / 2;
        } else {
            arg0.field2611 = arg1 - arg0.field2672 - (arg0.field2555 * arg1 >> 14);
        }
        if (arg0.field2552 == 0) {
            arg0.field2566 = arg0.field2617;
        } else if (arg0.field2552 == 1) {
            arg0.field2566 = (arg2 - arg0.field2639) / 2 + arg0.field2617;
        } else if (arg0.field2552 == 2) {
            arg0.field2566 = arg2 - arg0.field2639 - arg0.field2617;
        } else if (arg0.field2552 == 3) {
            arg0.field2566 = arg0.field2617 * arg2 >> 14;
        } else if (arg0.field2552 == 4) {
            arg0.field2566 = (arg0.field2617 * arg2 >> 14) + (arg2 - arg0.field2639) / 2;
        } else {
            arg0.field2566 = arg2 - arg0.field2639 - (arg0.field2617 * arg2 >> 14);
        }
    }

    @ObfuscatedName("an.id(Lho;IIIIIII)V")
    public static final void method591(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field704) {
            field660 = 32;
        } else {
            field660 = 0;
        }
        field704 = false;
        if (class55.field465 == 1 || !Statics.field183 && class55.field465 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2568 -= 4;
                method237(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2568 += 4;
                method237(arg0);
            } else if (arg5 >= arg1 - field660 && arg5 < field660 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2568 = (arg4 - arg3) * var8 / var9;
                method237(arg0);
                field704 = true;
            }
        }
        if (field835 == 0) {
            return;
        }
        int var10 = arg0.field2672;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2568 += field835 * 45;
            method237(arg0);
        }
    }

    @ObfuscatedName("bh.if(IIIIII)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field24[0].method5515(arg0, arg1);
        Statics.field24[1].method5515(arg0, arg1 + arg3 - 16);
        class321.method5497(arg0, arg1 + 16, 16, arg3 - 32, field700);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class321.method5497(arg0, arg1 + 16 + var6, 16, var5, field701);
        class321.method5454(arg0, arg1 + 16 + var6, var5, field703);
        class321.method5454(arg0 + 1, arg1 + 16 + var6, var5, field703);
        class321.method5452(arg0, arg1 + 16 + var6, 16, field703);
        class321.method5452(arg0, arg1 + 17 + var6, 16, field703);
        class321.method5454(arg0 + 15, arg1 + 16 + var6, var5, field702);
        class321.method5454(arg0 + 14, arg1 + 17 + var6, var5 - 1, field702);
        class321.method5452(arg0, arg1 + 15 + var6 + var5, 16, field702);
        class321.method5452(arg0 + 1, arg1 + 14 + var6 + var5, 15, field702);
    }

    @ObfuscatedName("cy.ir(Lho;I)Z")
    public static final boolean method1925(class218 arg0) {
        if (arg0.field2665 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2665.length; var1++) {
            int var2 = method3637(arg0, var1);
            int var3 = arg0.field2631[var1];
            if (arg0.field2665[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2665[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2665[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hq.ia(Lho;IB)I")
    public static final int method3637(class218 arg0, int arg1) {
        if (arg0.field2683 == null || arg1 >= arg0.field2683.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2683[arg1];
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
                    var7 = field726[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field854[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field771[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method728(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method2964(var12).field3410 || field638)) {
                        for (int var13 = 0; var13 < var11.field2670.length; var13++) {
                            if (var12 + 1 == var11.field2670[var13]) {
                                var7 += var11.field2671[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2511[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2726[field854[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2511[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2737.field596;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2725[var14]) {
                            var7 += field854[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method728(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method2964(var18).field3410 || field638)) {
                        for (int var19 = 0; var19 < var17.field2670.length; var19++) {
                            if (var18 + 1 == var17.field2670[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field804;
                }
                if (var6 == 12) {
                    var7 = field805;
                }
                if (var6 == 13) {
                    int var20 = class213.field2511[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method367(var22);
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
                    var7 = (Statics.field2737.field986 >> 7) + Statics.field2734;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2737.field930 >> 7) + Statics.field3631;
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

    @ObfuscatedName("eh.iv(Lho;Lit;IIZI)V")
    public static final void method2988(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3437;
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
            method1881(var7, class82.method1631(16748608) + arg1.field3387, var6, arg1.field3395, arg2, arg0.field2546, arg4);
        }
    }

    @ObfuscatedName("gu.iz(Lho;III)V")
    public static final void method3445(class218 arg0, int arg1, int arg2) {
        if (arg0.field2581 == 1) {
            method602(arg0.field2669, "", 24, 0, 0, arg0.field2546);
        }
        if (arg0.field2581 == 2 && !field816) {
            String var3 = method3917(arg0);
            if (var3 != null) {
                method602(var3, class82.method1631(65280) + arg0.field2592, 25, 0, -1, arg0.field2546);
            }
        }
        if (arg0.field2581 == 3) {
            method602(class225.field2902, "", 26, 0, 0, arg0.field2546);
        }
        if (arg0.field2581 == 4) {
            method602(arg0.field2669, "", 28, 0, 0, arg0.field2546);
        }
        if (arg0.field2581 == 5) {
            method602(arg0.field2669, "", 29, 0, 0, arg0.field2546);
        }
        if (arg0.field2581 == 6 && field707 == null) {
            method602(arg0.field2669, "", 30, 0, -1, arg0.field2546);
        }
        if (arg0.field2548 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2639; var5++) {
                for (int var6 = 0; var6 < arg0.field2672; var6++) {
                    int var7 = (arg0.field2585 + 32) * var6;
                    int var8 = (arg0.field2614 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2615[var4];
                        var8 += arg0.field2616[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field685 = var4;
                        Statics.field392 = arg0;
                        if (arg0.field2670[var4] > 0) {
                            label271: {
                                class255 var9 = class255.method2964(arg0.field2670[var4] - 1);
                                if (field758 == 1) {
                                    int var10 = method15(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field5 != arg0.field2546 || Statics.field388 != var4) {
                                            method602(class225.field2893, field770 + " " + class82.field1137 + " " + class82.method1631(16748608) + var9.field3387, 31, var9.field3395, var4, arg0.field2546);
                                        }
                                        break label271;
                                    }
                                }
                                if (field816) {
                                    int var12 = method15(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field528 & 0x10) == 16) {
                                            method602(field828, field862 + " " + class82.field1137 + " " + class82.method1631(16748608) + var9.field3387, 32, var9.field3395, var4, arg0.field2546);
                                        }
                                        break label271;
                                    }
                                }
                                String[] var14 = var9.field3437;
                                int var15 = -1;
                                if (field871 && method160()) {
                                    var15 = var9.method4206();
                                }
                                int var16 = method15(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method2988(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method15(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method602(class225.field2893, class82.method1631(16748608) + var9.field3387, 38, var9.field3395, var4, arg0.field2546);
                                }
                                int var21 = method15(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method2988(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method2988(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field2618;
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
                                            method602(var24[var25], class82.method1631(16748608) + var9.field3387, var26, var9.field3395, var4, arg0.field2546);
                                        }
                                    }
                                }
                                method602(class225.field2878, class82.method1631(16748608) + var9.field3387, 1005, var9.field3395, var4, arg0.field2546);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2593) {
            return;
        }
        if (field816) {
            int var27 = method15(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field528 & 0x20) == 32) {
                method602(field828, field862 + " " + class82.field1137 + " " + arg0.field2625, 58, 0, arg0.field2674, arg0.field2546);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            String var30 = method2956(arg0, var29);
            if (var30 != null) {
                method602(var30, arg0.field2625, 1007, var29 + 1, arg0.field2674, arg0.field2546);
            }
        }
        String var31 = method3917(arg0);
        if (var31 != null) {
            method602(var31, arg0.field2625, 25, 0, arg0.field2674, arg0.field2546);
        }
        for (int var32 = 4; var32 >= 0; var32--) {
            String var33 = method2956(arg0, var32);
            if (var33 != null) {
                method1881(var33, arg0.field2625, 57, var32 + 1, arg0.field2674, arg0.field2546, arg0.field2688);
            }
        }
        int var34 = method15(arg0);
        boolean var35 = (var34 & 0x1) != 0;
        if (var35) {
            method602(class225.field2745, "", 30, 0, arg0.field2674, arg0.field2546);
        }
    }

    @ObfuscatedName("ba.it(ZI)V")
    public static void method1048(boolean arg0) {
        field868 = arg0;
    }

    @ObfuscatedName("az.in(I)Z")
    public static boolean method373() {
        return field868;
    }

    @ObfuscatedName("e.il(I)Z")
    public static boolean method160() {
        return field868 || class46.field370[81];
    }

    @ObfuscatedName("f.ii(IIIIIIIB)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method178(arg0)) {
            method3447(Statics.field1967[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("gu.ix([Lho;IIIIIIIB)V")
    public static final void method3447(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2565 == arg1 && (!var9.field2593 || var9.field2548 == 0 || var9.field2632 || method15(var9) != 0 || field811 == var9 || var9.field2550 == 1338)) {
                if (var9.field2593) {
                    if (method238(var9)) {
                        continue;
                    }
                } else if (var9.field2548 == 0 && Statics.field2053 != var9 && method238(var9)) {
                    continue;
                }
                int var10 = var9.field2611 + arg6;
                int var11 = var9.field2566 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2548 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2548 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2672 + var10;
                    int var19 = var9.field2639 + var11;
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
                    int var22 = var9.field2672 + var10;
                    int var23 = var9.field2639 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field810 == var9) {
                    field818 = true;
                    field819 = var10;
                    field820 = var11;
                }
                boolean var24 = false;
                if (var9.field2620) {
                    switch(field799) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2546 >>> 16 == field825) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field825 == var9.field2546) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2593 || var12 < var14 && var13 < var15) {
                    if (var9.field2593) {
                        if (var9.field2686) {
                            if (class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                for (class63 var25 = (class63) field844.method4431(); var25 != null; var25 = (class63) field844.method4454()) {
                                    if (var25.field560) {
                                        var25.method3249();
                                        var25.field566.field2677 = false;
                                    }
                                }
                                if (Statics.field1722 == 0) {
                                    field810 = null;
                                    field811 = null;
                                }
                                if (!field773) {
                                    method718();
                                }
                            }
                        } else if (var9.field2687 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                            for (class63 var26 = (class63) field844.method4431(); var26 != null; var26 = (class63) field844.method4454()) {
                                if (var26.field560 && var26.field566.field2653 == var26.field572) {
                                    var26.method3249();
                                }
                            }
                        }
                    }
                    int var27 = class55.field466;
                    int var28 = class55.field467;
                    if (class55.field473 != 0) {
                        var27 = class55.field474;
                        var28 = class55.field475;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2550 == 1337) {
                        if (!field792 && !field773 && var29) {
                            method512(var27, var28, var12, var13);
                        }
                    } else if (var9.field2550 == 1338) {
                        method5276(var9, var10, var11);
                    } else {
                        if (var9.field2550 == 1400) {
                            Statics.field481.method5819(class55.field466, class55.field467, var29, var10, var11, var9.field2672, var9.field2639);
                        }
                        if (!field773 && var29) {
                            if (var9.field2550 == 1400) {
                                Statics.field481.method5912(var10, var11, var9.field2672, var9.field2639, var27, var28);
                            } else {
                                method3445(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2553.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2553[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2553[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2685 != null) {
                                            var34 = class46.field370[var9.field2553[var30][var33]];
                                        }
                                        if (method3323(var9.field2553[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2685 != null && var9.field2685[var30] > field645) {
                                                break;
                                            }
                                            byte var35 = var9.field2622[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field370[86] && !class46.field370[82] && !class46.field370[81]) && ((var35 & 0x2) == 0 || class46.field370[86]) && ((var35 & 0x1) == 0 || class46.field370[82]) && ((var35 & 0x4) == 0 || class46.field370[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method520(var30 + 1, var9.field2546, var9.field2674, var9.field2572, "");
                                    } else if (var30 == 10) {
                                        method3554();
                                        method509(var9.field2546, var9.field2674, class219.method21(method15(var9)), var9.field2572);
                                        field828 = method3917(var9);
                                        if (field828 == null) {
                                            field828 = class225.field2755;
                                        }
                                        field862 = var9.field2625 + class82.method1631(16777215);
                                    }
                                    int var36 = var9.field2587[var30];
                                    if (var9.field2685 == null) {
                                        var9.field2685 = new int[var9.field2553.length];
                                    }
                                    if (var9.field2549 == null) {
                                        var9.field2549 = new int[var9.field2553.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2685[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2685[var30] == 0) {
                                        var9.field2685[var30] = field645 + var36 + var9.field2549[var30];
                                    } else {
                                        var9.field2685[var30] = field645 + var36;
                                    }
                                }
                                if (!var31 && var9.field2685 != null) {
                                    var9.field2685[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2593) {
                            boolean var37;
                            if (class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field465 == 1 || !Statics.field183 && class55.field465 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field473 == 1 || !Statics.field183 && class55.field473 == 4) && class55.field474 >= var12 && class55.field475 >= var13 && class55.field474 < var14 && class55.field475 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method3713(var9, class55.field474 - var10, class55.field475 - var11);
                            }
                            if (var9.field2550 == 1400) {
                                Statics.field481.method5922(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field810 != null && field810 != var9 && var37 && class219.method79(method15(var9))) {
                                field814 = var9;
                            }
                            if (field811 == var9) {
                                field815 = true;
                                field696 = var10;
                                field817 = var11;
                            }
                            if (var9.field2632) {
                                if (var37 && field835 != 0 && var9.field2653 != null) {
                                    class63 var40 = new class63();
                                    var40.field560 = true;
                                    var40.field566 = var9;
                                    var40.field563 = field835;
                                    var40.field572 = var9.field2653;
                                    field844.method4433(var40);
                                }
                                if (field810 != null || Statics.field1870 != null || field773) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2678 && var39) {
                                    var9.field2678 = true;
                                    if (var9.field2634 != null) {
                                        class63 var41 = new class63();
                                        var41.field560 = true;
                                        var41.field566 = var9;
                                        var41.field562 = class55.field474 - var10;
                                        var41.field563 = class55.field475 - var11;
                                        var41.field572 = var9.field2634;
                                        field844.method4433(var41);
                                    }
                                }
                                if (var9.field2678 && var38 && var9.field2561 != null) {
                                    class63 var42 = new class63();
                                    var42.field560 = true;
                                    var42.field566 = var9;
                                    var42.field562 = class55.field466 - var10;
                                    var42.field563 = class55.field467 - var11;
                                    var42.field572 = var9.field2561;
                                    field844.method4433(var42);
                                }
                                if (var9.field2678 && !var38) {
                                    var9.field2678 = false;
                                    if (var9.field2636 != null) {
                                        class63 var43 = new class63();
                                        var43.field560 = true;
                                        var43.field566 = var9;
                                        var43.field562 = class55.field466 - var10;
                                        var43.field563 = class55.field467 - var11;
                                        var43.field572 = var9.field2636;
                                        field764.method4433(var43);
                                    }
                                }
                                if (var38 && var9.field2637 != null) {
                                    class63 var44 = new class63();
                                    var44.field560 = true;
                                    var44.field566 = var9;
                                    var44.field562 = class55.field466 - var10;
                                    var44.field563 = class55.field467 - var11;
                                    var44.field572 = var9.field2637;
                                    field844.method4433(var44);
                                }
                                if (!var9.field2677 && var37) {
                                    var9.field2677 = true;
                                    if (var9.field2638 != null) {
                                        class63 var45 = new class63();
                                        var45.field560 = true;
                                        var45.field566 = var9;
                                        var45.field562 = class55.field466 - var10;
                                        var45.field563 = class55.field467 - var11;
                                        var45.field572 = var9.field2638;
                                        field844.method4433(var45);
                                    }
                                }
                                if (var9.field2677 && var37 && var9.field2613 != null) {
                                    class63 var46 = new class63();
                                    var46.field560 = true;
                                    var46.field566 = var9;
                                    var46.field562 = class55.field466 - var10;
                                    var46.field563 = class55.field467 - var11;
                                    var46.field572 = var9.field2613;
                                    field844.method4433(var46);
                                }
                                if (var9.field2677 && !var37) {
                                    var9.field2677 = false;
                                    if (var9.field2640 != null) {
                                        class63 var47 = new class63();
                                        var47.field560 = true;
                                        var47.field566 = var9;
                                        var47.field562 = class55.field466 - var10;
                                        var47.field563 = class55.field467 - var11;
                                        var47.field572 = var9.field2640;
                                        field764.method4433(var47);
                                    }
                                }
                                if (var9.field2651 != null) {
                                    class63 var48 = new class63();
                                    var48.field566 = var9;
                                    var48.field572 = var9.field2651;
                                    field837.method4433(var48);
                                }
                                if (var9.field2645 != null && field824 > var9.field2621) {
                                    if (var9.field2646 == null || field824 - var9.field2621 > 32) {
                                        class63 var53 = new class63();
                                        var53.field566 = var9;
                                        var53.field572 = var9.field2645;
                                        field844.method4433(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2621; var49 < field824; var49++) {
                                            int var50 = field783[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2646.length; var51++) {
                                                if (var9.field2646[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field566 = var9;
                                                    var52.field572 = var9.field2645;
                                                    field844.method4433(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2621 = field824;
                                }
                                if (var9.field2647 != null && field826 > var9.field2681) {
                                    if (var9.field2648 == null || field826 - var9.field2681 > 32) {
                                        class63 var58 = new class63();
                                        var58.field566 = var9;
                                        var58.field572 = var9.field2647;
                                        field844.method4433(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2681; var54 < field826; var54++) {
                                            int var55 = field821[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2648.length; var56++) {
                                                if (var9.field2648[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field566 = var9;
                                                    var57.field572 = var9.field2647;
                                                    field844.method4433(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2681 = field826;
                                }
                                if (var9.field2649 != null && field802 > var9.field2682) {
                                    if (var9.field2650 == null || field802 - var9.field2682 > 32) {
                                        class63 var63 = new class63();
                                        var63.field566 = var9;
                                        var63.field572 = var9.field2649;
                                        field844.method4433(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2682; var59 < field802; var59++) {
                                            int var60 = field738[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2650.length; var61++) {
                                                if (var9.field2650[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field566 = var9;
                                                    var62.field572 = var9.field2649;
                                                    field844.method4433(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2682 = field802;
                                }
                                if (field829 > var9.field2559 && var9.field2680 != null) {
                                    class63 var64 = new class63();
                                    var64.field566 = var9;
                                    var64.field572 = var9.field2680;
                                    field844.method4433(var64);
                                }
                                if (field745 > var9.field2559 && var9.field2554 != null) {
                                    class63 var65 = new class63();
                                    var65.field566 = var9;
                                    var65.field572 = var9.field2554;
                                    field844.method4433(var65);
                                }
                                if (field831 > var9.field2559 && var9.field2657 != null) {
                                    class63 var66 = new class63();
                                    var66.field566 = var9;
                                    var66.field572 = var9.field2657;
                                    field844.method4433(var66);
                                }
                                if (field832 > var9.field2559 && var9.field2662 != null) {
                                    class63 var67 = new class63();
                                    var67.field566 = var9;
                                    var67.field572 = var9.field2662;
                                    field844.method4433(var67);
                                }
                                if (field833 > var9.field2559 && var9.field2663 != null) {
                                    class63 var68 = new class63();
                                    var68.field566 = var9;
                                    var68.field572 = var9.field2663;
                                    field844.method4433(var68);
                                }
                                if (field834 > var9.field2559 && var9.field2658 != null) {
                                    class63 var69 = new class63();
                                    var69.field566 = var9;
                                    var69.field572 = var9.field2658;
                                    field844.method4433(var69);
                                }
                                var9.field2559 = field727;
                                if (var9.field2654 != null) {
                                    for (int var70 = 0; var70 < field858; var70++) {
                                        class63 var71 = new class63();
                                        var71.field566 = var9;
                                        var71.field565 = field860[var70];
                                        var71.field567 = field859[var70];
                                        var71.field572 = var9.field2654;
                                        field844.method4433(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2593) {
                            if (field810 != null || Statics.field1870 != null || field773) {
                                continue;
                            }
                            if ((var9.field2667 >= 0 || var9.field2573 != 0) && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                if (var9.field2667 >= 0) {
                                    Statics.field2053 = arg0[var9.field2667];
                                } else {
                                    Statics.field2053 = var9;
                                }
                            }
                            if (var9.field2548 == 8 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15) {
                                Statics.field2768 = var9;
                            }
                            if (var9.field2570 > var9.field2639) {
                                method591(var9, var9.field2672 + var10, var11, var9.field2639, var9.field2570, class55.field466, class55.field467);
                            }
                        }
                        if (var9.field2548 == 0) {
                            method3447(arg0, var9.field2546, var12, var13, var14, var15, var10 - var9.field2567, var11 - var9.field2568);
                            if (var9.field2676 != null) {
                                method3447(var9.field2676, var9.field2546, var12, var13, var14, var15, var10 - var9.field2567, var11 - var9.field2568);
                            }
                            class62 var72 = (class62) field900.method5393((long) var9.field2546);
                            if (var72 != null) {
                                if (var72.field554 == 0 && class55.field466 >= var12 && class55.field467 >= var13 && class55.field466 < var14 && class55.field467 < var15 && !field773) {
                                    for (class63 var73 = (class63) field844.method4431(); var73 != null; var73 = (class63) field844.method4454()) {
                                        if (var73.field560) {
                                            var73.method3249();
                                            var73.field566.field2677 = false;
                                        }
                                    }
                                    if (Statics.field1722 == 0) {
                                        field810 = null;
                                        field811 = null;
                                    }
                                    if (!field773) {
                                        method718();
                                    }
                                }
                                method263(var72.field558, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gf.ic(IB)Z")
    public static boolean method3323(int arg0) {
        for (int var1 = 0; var1 < field858; var1++) {
            if (field860[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ak.js(IIB)V")
    public static final void method663(int arg0, int arg1) {
        if (class218.method178(arg0)) {
            method1055(Statics.field1967[arg0], arg1);
        }
    }

    @ObfuscatedName("bn.jv([Lho;II)V")
    public static final void method1055(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2548 == 0) {
                    if (var3.field2676 != null) {
                        method1055(var3.field2676, arg1);
                    }
                    class62 var4 = (class62) field900.method5393((long) var3.field2546);
                    if (var4 != null) {
                        method663(var4.field558, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2659 != null) {
                    class63 var5 = new class63();
                    var5.field566 = var3;
                    var5.field572 = var3.field2659;
                    class77.method4064(var5);
                }
                if (arg1 == 1 && var3.field2660 != null) {
                    if (var3.field2674 >= 0) {
                        class218 var6 = class218.method728(var3.field2546);
                        if (var6 == null || var6.field2676 == null || var3.field2674 >= var6.field2676.length || var6.field2676[var3.field2674] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field566 = var3;
                    var7.field572 = var3.field2660;
                    class77.method4064(var7);
                }
            }
        }
    }

    @ObfuscatedName("hw.je(Lho;IIS)V")
    public static final void method3713(class218 arg0, int arg1, int arg2) {
        if (field810 != null || field773 || arg0 == null) {
            return;
        }
        class218 var3 = method67(arg0);
        if (var3 == null) {
            var3 = arg0.field2633;
        }
        if (var3 == null) {
            return;
        }
        field810 = arg0;
        class218 var5 = method67(arg0);
        if (var5 == null) {
            var5 = arg0.field2633;
        }
        field811 = var5;
        field812 = arg1;
        field813 = arg2;
        Statics.field1722 = 0;
        field793 = false;
        int var7 = method3099();
        if (var7 != -1) {
            method2026(var7);
        }
        return;
    }

    @ObfuscatedName("client.jt(I)V")
    public final void method1170() {
        method237(field810);
        Statics.field1722++;
        if (field818 && field815) {
            int var1 = class55.field466;
            int var2 = class55.field467;
            int var3 = var1 - field812;
            int var4 = var2 - field813;
            if (var3 < field696) {
                var3 = field696;
            }
            if (field810.field2672 + var3 > field696 + field811.field2672) {
                var3 = field696 + field811.field2672 - field810.field2672;
            }
            if (var4 < field817) {
                var4 = field817;
            }
            if (field810.field2639 + var4 > field817 + field811.field2639) {
                var4 = field817 + field811.field2639 - field810.field2639;
            }
            int var5 = var3 - field819;
            int var6 = var4 - field820;
            int var7 = field810.field2563;
            if (Statics.field1722 > field810.field2629 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field793 = true;
            }
            int var8 = field811.field2567 + (var3 - field696);
            int var9 = field811.field2568 + (var4 - field817);
            if (field810.field2641 != null && field793) {
                class63 var10 = new class63();
                var10.field566 = field810;
                var10.field562 = var8;
                var10.field563 = var9;
                var10.field572 = field810.field2641;
                class77.method4064(var10);
            }
            if (class55.field465 == 0) {
                if (field793) {
                    if (field810.field2642 != null) {
                        class63 var11 = new class63();
                        var11.field566 = field810;
                        var11.field562 = var8;
                        var11.field563 = var9;
                        var11.field559 = field814;
                        var11.field572 = field810.field2642;
                        class77.method4064(var11);
                    }
                    if (field814 != null && method67(field810) != null) {
                        class188 var12 = class188.method1039(class184.field2279, field668.field1293);
                        var12.field2315.method5026(field814.field2674);
                        var12.field2315.method5026(field814.field2572);
                        var12.field2315.method5024(field810.field2674);
                        var12.field2315.method5178(field814.field2546);
                        var12.field2315.method5153(field810.field2572);
                        var12.field2315.method4977(field810.field2546);
                        field668.method2040(var12);
                    }
                } else if (this.method1166()) {
                    this.method1167(field819 + field812, field820 + field813);
                } else if (field774 > 0) {
                    method38(field819 + field812, field820 + field813);
                }
                field810 = null;
            }
        } else if (Statics.field1722 > 1) {
            field810 = null;
        }
    }

    @ObfuscatedName("cc.jx(IB)V")
    public static void method2026(int arg0) {
        Statics.field3290 = new class83();
        Statics.field3290.field1140 = field847[arg0];
        Statics.field3290.field1139 = field776[arg0];
        Statics.field3290.field1141 = field777[arg0];
        Statics.field3290.field1142 = field778[arg0];
        Statics.field3290.field1143 = field779[arg0];
    }

    @ObfuscatedName("u.ji(III)V")
    public static void method38(int arg0, int arg1) {
        class83 var2 = Statics.field3290;
        method3930(var2.field1140, var2.field1139, var2.field1141, var2.field1142, var2.field1143, var2.field1143, arg0, arg1);
        Statics.field3290 = null;
    }

    @ObfuscatedName("s.jf(Lho;I)V")
    public static void method237(class218 arg0) {
        if (field639 == arg0.field2684) {
            field842[arg0.field2560] = true;
        }
    }

    @ObfuscatedName("lo.jc(I)V")
    public static void method5671() {
        for (class62 var0 = (class62) field900.method5395(); var0 != null; var0 = (class62) field900.method5392()) {
            int var1 = var0.field558;
            if (class218.method178(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field1967[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2593;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2094;
                    class218 var6 = class218.method728(var5);
                    if (var6 != null) {
                        method237(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.jg(II)V")
    public static final void method579(int arg0) {
        if (!class218.method178(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1967[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2601 = 0;
                var3.field2604 = 0;
            }
        }
    }

    @ObfuscatedName("cc.ja([Lho;II)V")
    public static final void method2035(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2565 == arg1 && (!var3.field2593 || !method238(var3))) {
                if (var3.field2548 == 0) {
                    if (!var3.field2593 && method238(var3) && Statics.field2053 != var3) {
                        continue;
                    }
                    method2035(arg0, var3.field2546);
                    if (var3.field2676 != null) {
                        method2035(var3.field2676, var3.field2546);
                    }
                    class62 var4 = (class62) field900.method5393((long) var3.field2546);
                    if (var4 != null) {
                        int var5 = var4.field558;
                        if (class218.method178(var5)) {
                            method2035(Statics.field1967[var5], -1);
                        }
                    }
                }
                if (var3.field2548 == 6) {
                    if (var3.field2556 != -1 || var3.field2594 != -1) {
                        boolean var6 = method1925(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2594;
                        } else {
                            var7 = var3.field2556;
                        }
                        if (var7 != -1) {
                            class259 var8 = class259.method122(var7);
                            var3.field2604 += field699;
                            while (var3.field2604 > var8.field3507[var3.field2601]) {
                                var3.field2604 -= var8.field3507[var3.field2601];
                                var3.field2601++;
                                if (var3.field2601 >= var8.field3515.length) {
                                    var3.field2601 -= var8.field3509;
                                    if (var3.field2601 < 0 || var3.field2601 >= var8.field3515.length) {
                                        var3.field2601 = 0;
                                    }
                                }
                                method237(var3);
                            }
                        }
                    }
                    if (var3.field2602 != 0 && !var3.field2593) {
                        int var9 = var3.field2602 >> 16;
                        int var10 = var3.field2602 << 16 >> 16;
                        int var11 = field699 * var9;
                        int var12 = field699 * var10;
                        var3.field2551 = var3.field2551 + var11 & 0x7FF;
                        var3.field2598 = var3.field2598 + var12 & 0x7FF;
                        method237(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fu.jp(II)V")
    public static final void method3153(int arg0) {
        method5671();
        for (class76 var1 = (class76) class76.field1066.method4431(); var1 != null; var1 = (class76) class76.field1066.method4454()) {
            if (var1.field1070 != null) {
                var1.method1736();
            }
        }
        int var2 = class241.method266(arg0).field3185;
        if (var2 == 0) {
            return;
        }
        int var3 = class213.field2511[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class131.method2704(0.9D);
                ((class120) Statics.field1752).method2462(0.9D);
            }
            if (var3 == 2) {
                class131.method2704(0.8D);
                ((class120) Statics.field1752).method2462(0.8D);
            }
            if (var3 == 3) {
                class131.method2704(0.7D);
                ((class120) Statics.field1752).method2462(0.7D);
            }
            if (var3 == 4) {
                class131.method2704(0.6D);
                ((class120) Statics.field1752).method2462(0.6D);
            }
            class255.field3394.method2995();
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
            if (field762 != var4) {
                if (field762 == 0 && field667 != -1) {
                    class198.method1875(Statics.field3047, field667, 0, var4, false);
                    field760 = false;
                } else if (var4 == 0) {
                    class198.method2695();
                    field760 = false;
                } else if (class198.field2387 == 0) {
                    Statics.field400.method3409(var4);
                } else {
                    Statics.field1224 = var4;
                }
                field762 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field873 = 127;
            }
            if (var3 == 1) {
                field873 = 96;
            }
            if (var3 == 2) {
                field873 = 64;
            }
            if (var3 == 3) {
                field873 = 32;
            }
            if (var3 == 4) {
                field873 = 0;
            }
        }
        if (var2 == 5) {
            field772 = var3;
        }
        if (var2 == 6) {
            field801 = var3;
        }
        if (var2 == 9) {
            field874 = var3;
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
            field807 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field661 = (class85) class196.method3185(class85.method3991(), var3);
            if (field661 == null) {
                field661 = class85.field1156;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field654 = -1;
            } else {
                field654 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field662 = (class85) class196.method3185(class85.method3991(), var3);
            if (field662 == null) {
                field662 = class85.field1156;
            }
        }
    }

    @ObfuscatedName("x.jd(Lho;I)V")
    public static final void method207(class218 arg0) {
        int var1 = arg0.field2550;
        if (var1 == 324) {
            if (field901 == -1) {
                field901 = arg0.field2545;
                field902 = arg0.field2582;
            }
            if (field743.field2522) {
                arg0.field2545 = field901;
            } else {
                arg0.field2545 = field902;
            }
        } else if (var1 == 325) {
            if (field901 == -1) {
                field901 = arg0.field2545;
                field902 = arg0.field2582;
            }
            if (field743.field2522) {
                arg0.field2545 = field902;
            } else {
                arg0.field2545 = field901;
            }
        } else if (var1 == 327) {
            arg0.field2551 = 150;
            arg0.field2598 = (int) (Math.sin((double) field645 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2666 = 5;
            arg0.field2590 = 0;
        } else if (var1 == 328) {
            arg0.field2551 = 150;
            arg0.field2598 = (int) (Math.sin((double) field645 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2666 = 5;
            arg0.field2590 = 1;
        }
    }

    @ObfuscatedName("at.jo(I)V")
    public static final void method766() {
        class188 var0 = class188.method1039(class184.field2242, field668.field1293);
        field668.method2040(var0);
        for (class62 var1 = (class62) field900.method5395(); var1 != null; var1 = (class62) field900.method5392()) {
            if (var1.field554 == 0 || var1.field554 == 3) {
                method4826(var1, true);
            }
        }
        if (field707 != null) {
            method237(field707);
            field707 = null;
        }
    }

    @ObfuscatedName("al.jh(IIII)Lbk;")
    public static final class62 method574(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field558 = arg1;
        var3.field554 = arg2;
        field900.method5394(var3, (long) arg0);
        method579(arg1);
        class218 var4 = class218.method728(arg0);
        method237(var4);
        if (field707 != null) {
            method237(field707);
            field707 = null;
        }
        method1937();
        method836(Statics.field1967[arg0 >> 16], var4, false);
        class77.method3273(arg1);
        if (field887 != -1) {
            method663(field887, 1);
        }
        return var3;
    }

    @ObfuscatedName("ko.jr(Lbk;ZI)V")
    public static final void method4826(class62 arg0, boolean arg1) {
        int var2 = arg0.field558;
        int var3 = (int) arg0.field2094;
        arg0.method3249();
        if (arg1) {
            class218.method1036(var2);
        }
        for (class180 var4 = (class180) field891.method5395(); var4 != null; var4 = (class180) field891.method5392()) {
            if ((long) var2 == (var4.field2094 >> 48 & 0xFFFFL)) {
                var4.method3249();
            }
        }
        class218 var5 = class218.method728(var3);
        if (var5 != null) {
            method237(var5);
        }
        method1937();
        if (field887 != -1) {
            method663(field887, 1);
        }
    }

    @ObfuscatedName("ae.jw(Lho;I)Z")
    public static final boolean method684(class218 arg0) {
        int var1 = arg0.field2550;
        if (var1 == 205) {
            field684 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field743.method3633(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field743.method3599(var4, var5 == 1);
        }
        if (var1 == 324) {
            field743.method3602(false);
        }
        if (var1 == 325) {
            field743.method3602(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method1039(class184.field2229, field668.field1293);
            field743.method3603(var6.field2315);
            field668.method2040(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bl.jb(Lho;IIII)V")
    public static final void method1668(class218 arg0, int arg1, int arg2, int arg3) {
        method506();
        class212 var4 = arg0.method3649(false);
        if (var4 == null) {
            return;
        }
        class321.method5502(arg1, arg2, var4.field2503 + arg1, var4.field2504 + arg2);
        if (field683 == 2 || field683 == 5) {
            class321.method5458(arg1, arg2, 0, var4.field2506, var4.field2505);
        } else {
            int var5 = field640 & 0x7FF;
            int var6 = Statics.field2737.field986 / 32 + 48;
            int var7 = 464 - Statics.field2737.field930 / 32;
            Statics.field1074.method5651(arg1, arg2, var4.field2503, var4.field2504, var6, var7, var5, 256, var4.field2506, var4.field2505);
            for (int var8 = 0; var8 < field863; var8++) {
                int var9 = field855[var8] * 4 + 2 - Statics.field2737.field986 / 32;
                int var10 = field823[var8] * 4 + 2 - Statics.field2737.field930 / 32;
                method3552(arg1, arg2, var9, var10, field866[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field765[Statics.field174][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2737.field986 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2737.field930 / 32;
                        method3552(arg1, arg2, var14, var15, Statics.field81[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field733; var16++) {
                class80 var17 = field678[field680[var16]];
                if (var17 != null && var17.method1108()) {
                    class257 var18 = var17.field1114;
                    if (var18 != null && var18.field3463 != null) {
                        var18 = var18.method4273();
                    }
                    if (var18 != null && var18.field3469 && var18.field3482) {
                        int var19 = var17.field986 / 32 - Statics.field2737.field986 / 32;
                        int var20 = var17.field930 / 32 - Statics.field2737.field930 / 32;
                        method3552(arg1, arg2, var19, var20, Statics.field81[1], var4);
                    }
                }
            }
            int var21 = class90.field1235;
            int[] var22 = class90.field1239;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field753[var22[var23]];
                if (var24 != null && var24.method1108() && !var24.field615 && Statics.field2737 != var24) {
                    int var25 = var24.field986 / 32 - Statics.field2737.field986 / 32;
                    int var26 = var24.field930 / 32 - Statics.field2737.field930 / 32;
                    boolean var27 = false;
                    if (Statics.field2737.field617 != 0 && var24.field617 != 0 && Statics.field2737.field617 == var24.field617) {
                        var27 = true;
                    }
                    if (var24.method1097()) {
                        method3552(arg1, arg2, var25, var26, Statics.field81[3], var4);
                    } else if (var27) {
                        method3552(arg1, arg2, var25, var26, Statics.field81[4], var4);
                    } else if (var24.method1100()) {
                        method3552(arg1, arg2, var25, var26, Statics.field81[5], var4);
                    } else {
                        method3552(arg1, arg2, var25, var26, Statics.field81[2], var4);
                    }
                }
            }
            if (field653 != 0 && field645 % 20 < 10) {
                if (field653 == 1 && field875 >= 0 && field875 < field678.length) {
                    class80 var28 = field678[field875];
                    if (var28 != null) {
                        int var29 = var28.field986 / 32 - Statics.field2737.field986 / 32;
                        int var30 = var28.field930 / 32 - Statics.field2737.field930 / 32;
                        method2575(arg1, arg2, var29, var30, Statics.field1919[1], var4);
                    }
                }
                if (field653 == 2) {
                    int var31 = field656 * 4 - Statics.field2734 * 4 + 2 - Statics.field2737.field986 / 32;
                    int var32 = field657 * 4 - Statics.field3631 * 4 + 2 - Statics.field2737.field930 / 32;
                    method2575(arg1, arg2, var31, var32, Statics.field1919[1], var4);
                }
                if (field653 == 10 && field655 >= 0 && field655 < field753.length) {
                    class67 var33 = field753[field655];
                    if (var33 != null) {
                        int var34 = var33.field986 / 32 - Statics.field2737.field986 / 32;
                        int var35 = var33.field930 / 32 - Statics.field2737.field930 / 32;
                        method2575(arg1, arg2, var34, var35, Statics.field1919[1], var4);
                    }
                }
            }
            if (field865 != 0) {
                int var36 = field865 * 4 + 2 - Statics.field2737.field986 / 32;
                int var37 = field790 * 4 + 2 - Statics.field2737.field930 / 32;
                method3552(arg1, arg2, var36, var37, Statics.field1919[0], var4);
            }
            if (!Statics.field2737.field615) {
                class321.method5497(var4.field2503 / 2 + arg1 - 1, var4.field2504 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field843[arg3] = true;
    }

    @ObfuscatedName("dn.jn(Lho;IIII)V")
    public static final void method2241(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3649(false);
        if (var4 == null) {
            return;
        }
        if (field683 < 3) {
            Statics.field1157.method5651(arg1, arg2, var4.field2503, var4.field2504, 25, 25, field640, 256, var4.field2506, var4.field2505);
        } else {
            class321.method5458(arg1, arg2, 0, var4.field2506, var4.field2505);
        }
    }

    @ObfuscatedName("dj.jl(IIIILlf;Lhz;S)V")
    public static final void method2575(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3552(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field640 & 0x7FF;
        int var8 = class131.field1747[var7];
        int var9 = class131.field1730[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2503 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field925.method5571(arg5.field2503 / 2 + arg0 - var17 / 2 + var15, arg5.field2504 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("hh.ju(IIIILlf;Lhz;I)V")
    public static final void method3552(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field640 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1747[var6];
        int var9 = class131.field1730[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5569(arg5.field2503 / 2 + var10 - arg4.field3876 / 2, arg5.field2504 / 2 - var11 - arg4.field3874 / 2, arg0, arg1, arg5.field2503, arg5.field2504, arg5.field2506, arg5.field2505);
        } else {
            arg4.method5605(arg5.field2503 / 2 + arg0 + var10 - arg4.field3876 / 2, arg5.field2504 / 2 + arg1 - var11 - arg4.field3874 / 2);
        }
    }

    @ObfuscatedName("hb.jm(S)V")
    public static final void method3597() {
        for (int var0 = 0; var0 < class90.field1235; var0++) {
            class67 var1 = field753[class90.field1239[var0]];
            var1.method1098();
        }
        class92.method717();
        if (Statics.field2513 != null) {
            Statics.field2513.method4727();
        }
    }

    @ObfuscatedName("go.jz(I)V")
    public static final void method3321() {
        Iterator var0 = class92.field1261.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1079();
        }
        if (Statics.field2513 != null) {
            Statics.field2513.method4728();
        }
    }

    @ObfuscatedName("ie.jq(I)V")
    public static final void method3878() {
        for (int var0 = 0; var0 < class90.field1235; var0++) {
            class67 var1 = field753[class90.field1239[var0]];
            var1.method1129();
        }
    }

    @ObfuscatedName("gw.jy(S)V")
    public static final void method3270() {
        field831 = field727;
        Statics.field76 = true;
    }

    @ObfuscatedName("io.jk(Ljava/lang/String;B)V")
    public static final void method3895(String arg0) {
        if (Statics.field2513 != null) {
            class188 var1 = class188.method1039(class184.field2216, field668.field1293);
            var1.field2315.method5065(class300.method4526(arg0));
            var1.field2315.method4981(arg0);
            field668.method2040(var1);
        }
    }

    @ObfuscatedName("bo.jj(Ljava/lang/String;I)V")
    public static final void method1632(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method1039(class184.field2238, field668.field1293);
            var1.field2315.method5065(class300.method4526(arg0));
            var1.field2315.method4981(arg0);
            field668.method2040(var1);
        }
    }

    @ObfuscatedName("aw.kq(B)V")
    public static final void method374() {
        class188 var0 = class188.method1039(class184.field2238, field668.field1293);
        var0.field2315.method5065(0);
        field668.method2040(var0);
    }

    @ObfuscatedName("v.kk(Lho;I)I")
    public static int method15(class218 arg0) {
        class180 var1 = (class180) field891.method5393(((long) arg0.field2546 << 32) + (long) arg0.field2674);
        return var1 == null ? arg0.field2536 : var1.field2092;
    }

    @ObfuscatedName("q.ke(Lho;B)Lho;")
    public static class218 method67(class218 arg0) {
        int var1 = class219.method3058(method15(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class218.method728(arg0.field2565);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("s.ks(Lho;B)Z")
    public static boolean method238(class218 arg0) {
        return arg0.field2541;
    }

    @ObfuscatedName("ee.ki(Lho;II)Ljava/lang/String;")
    public static String method2956(class218 arg0, int arg1) {
        int var2 = method15(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2652 == null) {
            return null;
        } else if (arg0.field2626 == null || arg0.field2626.length <= arg1 || arg0.field2626[arg1] == null || arg0.field2626[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2626[arg1];
        }
    }

    @ObfuscatedName("im.ko(Lho;I)Ljava/lang/String;")
    public static String method3917(class218 arg0) {
        if (class219.method21(method15(arg0)) == 0) {
            return null;
        } else if (arg0.field2679 == null || arg0.field2679.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2679;
        }
    }

    @ObfuscatedName("ee.kr(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2957(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field791 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field791 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field791 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field791 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field791 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2391 != null) {
            var3 = "/p=" + Statics.field2391;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field112 + "/a=" + Statics.field219 + var3 + "/";
    }

    @ObfuscatedName("es.ku(Ljava/lang/String;I)V")
    public static void method2962(String arg0) {
        Statics.field2391 = arg0;
        try {
            String var1 = Statics.field1710.getParameter(Integer.toString(18));
            String var2 = Statics.field1710.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class297.method502() + 94608000000L;
                class208.field2484.setTime(new Date(var6));
                int var8 = class208.field2484.get(7);
                int var9 = class208.field2484.get(5);
                int var10 = class208.field2484.get(2);
                int var11 = class208.field2484.get(1);
                int var12 = class208.field2484.get(11);
                int var13 = class208.field2484.get(12);
                int var14 = class208.field2484.get(13);
                String var15 = class208.field2485[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class208.field2486[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class48.method724(Statics.field1710, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("ay.kn(Ljava/lang/String;ZI)V")
    public static void method731(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2030; var5++) {
            class255 var6 = class255.method2964(var5);
            if ((!arg1 || var6.field3415) && var6.field3432 == -1 && var6.field3387.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field393 = -1;
                    Statics.field123 = null;
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
        Statics.field123 = var3;
        Statics.field1311 = 0;
        Statics.field393 = var4;
        String[] var9 = new String[Statics.field393];
        for (int var10 = 0; var10 < Statics.field393; var10++) {
            var9[var10] = class255.method2964(var3[var10]).field3387;
        }
        short[] var11 = Statics.field123;
        class190.method138(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("br.kh([BII)V")
    public static void method1647(byte[] arg0, int arg1) {
        if (field676 == null) {
            field676 = new byte[24];
        }
        class301.method5230(arg0, arg1, field676, 0, 24);
    }

    @ObfuscatedName("kg.kb(Lkl;IB)V")
    public static void method5299(class300 arg0, int arg1) {
        method1647(arg0.field3699, arg1);
        class168.method2242(arg0, arg1);
    }

    @ObfuscatedName("client.kz(S)Ljq;")
    public class283 method1171() {
        return Statics.field2737 == null ? null : Statics.field2737.field599;
    }

    @ObfuscatedName("kk.kf(IIIZI)V")
    public static void method4776(int arg0, int arg1, int arg2, boolean arg3) {
        class188 var4 = class188.method1039(class184.field2192, field668.field1293);
        var4.field2315.method5009(arg2);
        var4.field2315.method5089(arg3 ? field719 : 0);
        var4.field2315.method4975(arg1);
        var4.field2315.method5026(arg0);
        field668.method2040(var4);
    }

    @ObfuscatedName("io.kl(IB)V")
    public static void method3879(int arg0) {
        field712 = arg0;
    }

    @ObfuscatedName("ey.ka(I)V")
    public static void method3049() {
        if (field712 == 1) {
            field880 = true;
        }
    }

    @ObfuscatedName("n.kt(B)V")
    public static void method11() {
        if (!field880 || Statics.field2737 == null) {
            return;
        }
        int var0 = Statics.field2737.field985[0];
        int var1 = Statics.field2737.field960[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1069 = Statics.field2737.field986;
        int var2 = method3522(Statics.field2737.field986, Statics.field2737.field930, Statics.field174) - field867;
        if (var2 < Statics.field1841) {
            Statics.field1841 = var2;
        }
        Statics.field90 = Statics.field2737.field930;
        field880 = false;
    }

    @ObfuscatedName("ie.km(I)V")
    public static void method3853() {
        if (Statics.field3087 == null) {
            return;
        }
        field906 = field645;
        Statics.field3087.method3900();
        for (int var0 = 0; var0 < field753.length; var0++) {
            if (field753[var0] != null) {
                Statics.field3087.method3901((field753[var0].field986 >> 7) + Statics.field2734, (field753[var0].field930 >> 7) + Statics.field3631);
            }
        }
    }
}

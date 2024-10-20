package deob;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class54 implements class280 {

    @ObfuscatedName("client.w")
    public static class173[] field892 = new class173[4];

    @ObfuscatedName("client.ae")
    public static boolean field784 = true;

    @ObfuscatedName("client.bk")
    public static int field872 = 1;

    @ObfuscatedName("client.bw")
    public static int field626 = 0;

    @ObfuscatedName("client.bn")
    public static int field627 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field637 = false;

    @ObfuscatedName("client.bv")
    public static boolean field829 = false;

    @ObfuscatedName("client.bi")
    public static int field671 = -1;

    @ObfuscatedName("client.bf")
    public static boolean field631 = false;

    @ObfuscatedName("client.bd")
    public static int field632 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field665 = true;

    @ObfuscatedName("client.cj")
    public static int field635 = 0;

    @ObfuscatedName("client.cp")
    public static long field768 = 1L;

    @ObfuscatedName("client.cm")
    public static int field839 = -1;

    @ObfuscatedName("client.cb")
    public static int field638 = -1;

    @ObfuscatedName("client.ch")
    public static long field890 = -1L;

    @ObfuscatedName("client.cn")
    public static boolean field640 = true;

    @ObfuscatedName("client.cr")
    public static boolean field641 = false;

    @ObfuscatedName("client.cl")
    public static int field658 = 0;

    @ObfuscatedName("client.cg")
    public static int field643 = 0;

    @ObfuscatedName("client.cy")
    public static int field625 = 0;

    @ObfuscatedName("client.cz")
    public static int field645 = 0;

    @ObfuscatedName("client.cv")
    public static int field646 = 0;

    @ObfuscatedName("client.cq")
    public static int field647 = 0;

    @ObfuscatedName("client.ct")
    public static int field710 = 0;

    @ObfuscatedName("client.cx")
    public static int field649 = 0;

    @ObfuscatedName("client.ca")
    public static int field650 = 0;

    @ObfuscatedName("client.co")
    public static class85 field651 = class85.field1142;

    @ObfuscatedName("client.dr")
    public static class85 field699 = class85.field1142;

    @ObfuscatedName("client.dv")
    public static int field751 = 0;

    @ObfuscatedName("client.dm")
    public static int field655 = 0;

    @ObfuscatedName("client.dj")
    public static int field682 = 0;

    @ObfuscatedName("client.ex")
    public static int field657 = 0;

    @ObfuscatedName("client.em")
    public static int field888 = 0;

    @ObfuscatedName("client.en")
    public static int field659 = 0;

    @ObfuscatedName("client.ey")
    public static int field660 = 0;

    @ObfuscatedName("client.ei")
    public static int field661 = 0;

    @ObfuscatedName("client.ee")
    public static class161 field871 = class161.field1985;

    @ObfuscatedName("client.ek")
    public static boolean field663 = false;

    @ObfuscatedName("client.et")
    public static class89 field664 = new class89();

    @ObfuscatedName("client.ez")
    public static byte[] field864 = null;

    @ObfuscatedName("client.ew")
    public static class80[] field746 = new class80[32768];

    @ObfuscatedName("client.ev")
    public static int field667 = 0;

    @ObfuscatedName("client.fz")
    public static int[] field808 = new int[32768];

    @ObfuscatedName("client.fd")
    public static int field862 = 0;

    @ObfuscatedName("client.fi")
    public static int[] field670 = new int[250];

    @ObfuscatedName("client.fc")
    public static final class96 field828 = new class96();

    @ObfuscatedName("client.fy")
    public static int field672 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field673 = false;

    @ObfuscatedName("client.ft")
    public static boolean field811 = true;

    @ObfuscatedName("client.fu")
    public static class272 field762 = new class272();

    @ObfuscatedName("client.fm")
    public static HashMap field676 = new HashMap();

    @ObfuscatedName("client.fr")
    public static int field677 = 0;

    @ObfuscatedName("client.fb")
    public static int field887 = 1;

    @ObfuscatedName("client.fw")
    public static int field679 = 0;

    @ObfuscatedName("client.gj")
    public static int field719 = 1;

    @ObfuscatedName("client.gv")
    public static int field720 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field683 = false;

    @ObfuscatedName("client.gm")
    public static int[][][] field684 = new int[4][13][13];

    @ObfuscatedName("client.gu")
    public static final int[] field666 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gf")
    public static int field880 = 0;

    @ObfuscatedName("client.hc")
    public static int field703 = 2301979;

    @ObfuscatedName("client.hr")
    public static int field688 = 5063219;

    @ObfuscatedName("client.he")
    public static int field689 = 3353893;

    @ObfuscatedName("client.hg")
    public static int field690 = 7759444;

    @ObfuscatedName("client.hi")
    public static boolean field726 = false;

    @ObfuscatedName("client.hd")
    public static int field692 = 0;

    @ObfuscatedName("client.hx")
    public static int field693 = 128;

    @ObfuscatedName("client.hm")
    public static int field694 = 0;

    @ObfuscatedName("client.hq")
    public static int field881 = 0;

    @ObfuscatedName("client.ht")
    public static int field869 = 0;

    @ObfuscatedName("client.ho")
    public static int field697 = 0;

    @ObfuscatedName("client.hf")
    public static int field696 = 0;

    @ObfuscatedName("client.hu")
    public static int field781 = 0;

    @ObfuscatedName("client.hh")
    public static int field867 = 50;

    @ObfuscatedName("client.hl")
    public static int field701 = 0;

    @ObfuscatedName("client.hz")
    public static int field702 = 0;

    @ObfuscatedName("client.iw")
    public static int field681 = 0;

    @ObfuscatedName("client.iy")
    public static int field840 = 12;

    @ObfuscatedName("client.ic")
    public static int field705 = 6;

    @ObfuscatedName("client.ia")
    public static int field706 = 0;

    @ObfuscatedName("client.in")
    public static boolean field707 = false;

    @ObfuscatedName("client.iq")
    public static int field713 = 0;

    @ObfuscatedName("client.ip")
    public static boolean field709 = false;

    @ObfuscatedName("client.il")
    public static int field636 = 0;

    @ObfuscatedName("client.ie")
    public static int field711 = 0;

    @ObfuscatedName("client.if")
    public static int field757 = 50;

    @ObfuscatedName("client.ig")
    public static int[] field765 = new int[field757];

    @ObfuscatedName("client.it")
    public static String field778 = null;

    @ObfuscatedName("client.im")
    public static int[] field714 = new int[field757];

    @ObfuscatedName("client.is")
    public static int[] field715 = new int[field757];

    @ObfuscatedName("client.ir")
    public static int[] field716 = new int[field757];

    @ObfuscatedName("client.io")
    public static int[] field833 = new int[field757];

    @ObfuscatedName("client.ik")
    public static int[] field718 = new int[field757];

    @ObfuscatedName("client.iu")
    public static int[] field680 = new int[field757];

    @ObfuscatedName("client.ib")
    public static String[] field773 = new String[field757];

    @ObfuscatedName("client.ii")
    public static int[][] field648 = new int[104][104];

    @ObfuscatedName("client.iv")
    public static int field722 = 0;

    @ObfuscatedName("client.ij")
    public static int field723 = -1;

    @ObfuscatedName("client.ih")
    public static int field724 = -1;

    @ObfuscatedName("client.jp")
    public static int field725 = 0;

    @ObfuscatedName("client.jc")
    public static int field847 = 0;

    @ObfuscatedName("client.jf")
    public static int field727 = 0;

    @ObfuscatedName("client.jz")
    public static int field728 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field729 = true;

    @ObfuscatedName("client.jh")
    public static int field730 = 0;

    @ObfuscatedName("client.jq")
    public static int field731 = 0;

    @ObfuscatedName("client.ji")
    public static int field732 = 0;

    @ObfuscatedName("client.jd")
    public static int field733 = 0;

    @ObfuscatedName("client.jr")
    public static int field745 = 0;

    @ObfuscatedName("client.ju")
    public static int field735 = 0;

    @ObfuscatedName("client.je")
    public static boolean field868 = false;

    @ObfuscatedName("client.jk")
    public static int field691 = 0;

    @ObfuscatedName("client.jw")
    public static int field738 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field739 = true;

    @ObfuscatedName("client.jj")
    public static class67[] field740 = new class67[2048];

    @ObfuscatedName("client.jx")
    public static int field741 = -1;

    @ObfuscatedName("client.ja")
    public static int field742 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field743 = true;

    @ObfuscatedName("client.kq")
    public static int field744 = 0;

    @ObfuscatedName("client.kz")
    public static int field900 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field656 = new int[1000];

    @ObfuscatedName("client.kb")
    public static final int[] field747 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kl")
    public static String[] field668 = new String[8];

    @ObfuscatedName("client.kn")
    public static boolean[] field749 = new boolean[8];

    @ObfuscatedName("client.ke")
    public static int[] field750 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kx")
    public static int field674 = -1;

    @ObfuscatedName("client.ky")
    public static class262[][][] field752 = new class262[4][104][104];

    @ObfuscatedName("client.kd")
    public static class262 field879 = new class262();

    @ObfuscatedName("client.km")
    public static class262 field754 = new class262();

    @ObfuscatedName("client.kw")
    public static class262 field755 = new class262();

    @ObfuscatedName("client.ku")
    public static int[] field756 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field785 = new int[25];

    @ObfuscatedName("client.ko")
    public static int[] field717 = new int[25];

    @ObfuscatedName("client.ki")
    public static int field901 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field760 = false;

    @ObfuscatedName("client.lf")
    public static int field761 = 0;

    @ObfuscatedName("client.li")
    public static int[] field842 = new int[500];

    @ObfuscatedName("client.ln")
    public static int[] field763 = new int[500];

    @ObfuscatedName("client.lo")
    public static int[] field764 = new int[500];

    @ObfuscatedName("client.lm")
    public static int[] field845 = new int[500];

    @ObfuscatedName("client.lh")
    public static String[] field766 = new String[500];

    @ObfuscatedName("client.lp")
    public static String[] field767 = new String[500];

    @ObfuscatedName("client.lj")
    public static boolean[] field758 = new boolean[500];

    @ObfuscatedName("client.lg")
    public static boolean field769 = false;

    @ObfuscatedName("client.lq")
    public static boolean field770 = false;

    @ObfuscatedName("client.ls")
    public static boolean field771 = false;

    @ObfuscatedName("client.ld")
    public static boolean field772 = true;

    @ObfuscatedName("client.lt")
    public static int field736 = -1;

    @ObfuscatedName("client.le")
    public static int field786 = -1;

    @ObfuscatedName("client.la")
    public static int field775 = 0;

    @ObfuscatedName("client.lv")
    public static int field849 = 50;

    @ObfuscatedName("client.lc")
    public static int field777 = 0;

    @ObfuscatedName("client.ll")
    public static boolean field779 = false;

    @ObfuscatedName("client.lu")
    public static int field817 = -1;

    @ObfuscatedName("client.mj")
    public static int field737 = -1;

    @ObfuscatedName("client.mv")
    public static String field782 = null;

    @ObfuscatedName("client.mw")
    public static String field783 = null;

    @ObfuscatedName("client.mm")
    public static int field700 = -1;

    @ObfuscatedName("client.mi")
    public static class318 field854 = new class318(8);

    @ObfuscatedName("client.ml")
    public static int field639 = 0;

    @ObfuscatedName("client.mn")
    public static int field787 = -1;

    @ObfuscatedName("client.mr")
    public static int field788 = 0;

    @ObfuscatedName("client.mu")
    public static int field789 = 0;

    @ObfuscatedName("client.mc")
    public static class218 field790 = null;

    @ObfuscatedName("client.mk")
    public static int field791 = 0;

    @ObfuscatedName("client.mb")
    public static int field675 = 0;

    @ObfuscatedName("client.my")
    public static int field793 = 0;

    @ObfuscatedName("client.mg")
    public static int field794 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field795 = false;

    @ObfuscatedName("client.mo")
    public static class218 field721 = null;

    @ObfuscatedName("client.mh")
    public static class218 field797 = null;

    @ObfuscatedName("client.ms")
    public static class218 field798 = null;

    @ObfuscatedName("client.mp")
    public static int field799 = 0;

    @ObfuscatedName("client.mx")
    public static int field800 = 0;

    @ObfuscatedName("client.mt")
    public static class218 field776 = null;

    @ObfuscatedName("client.nc")
    public static boolean field642 = false;

    @ObfuscatedName("client.nm")
    public static int field803 = -1;

    @ObfuscatedName("client.nf")
    public static int field804 = -1;

    @ObfuscatedName("client.nd")
    public static boolean field805 = false;

    @ObfuscatedName("client.nl")
    public static int field806 = -1;

    @ObfuscatedName("client.nr")
    public static int field807 = -1;

    @ObfuscatedName("client.ne")
    public static boolean field687 = false;

    @ObfuscatedName("client.ns")
    public static int field809 = 1;

    @ObfuscatedName("client.np")
    public static int[] field810 = new int[32];

    @ObfuscatedName("client.nt")
    public static int field801 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field812 = new int[32];

    @ObfuscatedName("client.ny")
    public static int field813 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field814 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field815 = 0;

    @ObfuscatedName("client.nb")
    public static int field774 = 0;

    @ObfuscatedName("client.no")
    public static int field630 = 0;

    @ObfuscatedName("client.nv")
    public static int field818 = 0;

    @ObfuscatedName("client.nx")
    public static int field819 = 0;

    @ObfuscatedName("client.na")
    public static int field820 = 0;

    @ObfuscatedName("client.nh")
    public static int field821 = 0;

    @ObfuscatedName("client.om")
    public static int field897 = 0;

    @ObfuscatedName("client.og")
    public static class262 field878 = new class262();

    @ObfuscatedName("client.ok")
    public static class262 field634 = new class262();

    @ObfuscatedName("client.od")
    public static class262 field825 = new class262();

    @ObfuscatedName("client.oj")
    public static class318 field826 = new class318(512);

    @ObfuscatedName("client.ol")
    public static int field827 = 0;

    @ObfuscatedName("client.oo")
    public static int field753 = -2;

    @ObfuscatedName("client.ow")
    public static boolean[] field704 = new boolean[100];

    @ObfuscatedName("client.oy")
    public static boolean[] field830 = new boolean[100];

    @ObfuscatedName("client.oa")
    public static boolean[] field831 = new boolean[100];

    @ObfuscatedName("client.on")
    public static int[] field832 = new int[100];

    @ObfuscatedName("client.ot")
    public static int[] field824 = new int[100];

    @ObfuscatedName("client.ou")
    public static int[] field834 = new int[100];

    @ObfuscatedName("client.ov")
    public static int[] field835 = new int[100];

    @ObfuscatedName("client.ox")
    public static int field836 = 0;

    @ObfuscatedName("client.oq")
    public static long field837 = 0L;

    @ObfuscatedName("client.oc")
    public static boolean field838 = true;

    @ObfuscatedName("client.pj")
    public static int[] field644 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pz")
    public static int field624 = 0;

    @ObfuscatedName("client.pt")
    public static int field841 = 0;

    @ObfuscatedName("client.pd")
    public static String field669 = "";

    @ObfuscatedName("client.pv")
    public static long[] field843 = new long[100];

    @ObfuscatedName("client.pm")
    public static int field844 = 0;

    @ObfuscatedName("client.pg")
    public static int field678 = 0;

    @ObfuscatedName("client.pi")
    public static int[] field846 = new int[128];

    @ObfuscatedName("client.pr")
    public static int[] field816 = new int[128];

    @ObfuscatedName("client.pq")
    public static long field848 = -1L;

    @ObfuscatedName("client.pl")
    public static int field652 = -1;

    @ObfuscatedName("client.pb")
    public static int field850 = 0;

    @ObfuscatedName("client.pu")
    public static int[] field851 = new int[1000];

    @ObfuscatedName("client.px")
    public static int[] field802 = new int[1000];

    @ObfuscatedName("client.pc")
    public static class325[] field853 = new class325[1000];

    @ObfuscatedName("client.py")
    public static int field885 = 0;

    @ObfuscatedName("client.pp")
    public static int field855 = 0;

    @ObfuscatedName("client.qx")
    public static int field856 = 0;

    @ObfuscatedName("client.qa")
    public static int field857 = 255;

    @ObfuscatedName("client.qi")
    public static int field858 = -1;

    @ObfuscatedName("client.qb")
    public static boolean field859 = false;

    @ObfuscatedName("client.qd")
    public static int field860 = 127;

    @ObfuscatedName("client.qj")
    public static int field861 = 127;

    @ObfuscatedName("client.qr")
    public static int field748 = 0;

    @ObfuscatedName("client.qn")
    public static int[] field863 = new int[50];

    @ObfuscatedName("client.qq")
    public static int[] field712 = new int[50];

    @ObfuscatedName("client.qm")
    public static int[] field865 = new int[50];

    @ObfuscatedName("client.qh")
    public static int[] field866 = new int[50];

    @ObfuscatedName("client.qg")
    public static class102[] field629 = new class102[50];

    @ObfuscatedName("client.qu")
    public static boolean field708 = false;

    @ObfuscatedName("client.rl")
    public static boolean[] field898 = new boolean[5];

    @ObfuscatedName("client.rk")
    public static int[] field870 = new int[5];

    @ObfuscatedName("client.rd")
    public static int[] field695 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field759 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field873 = new int[5];

    @ObfuscatedName("client.rf")
    public static short field874 = 256;

    @ObfuscatedName("client.rx")
    public static short field823 = 205;

    @ObfuscatedName("client.rg")
    public static short field876 = 256;

    @ObfuscatedName("client.rn")
    public static short field877 = 320;

    @ObfuscatedName("client.re")
    public static short field796 = 1;

    @ObfuscatedName("client.rz")
    public static short field662 = 32767;

    @ObfuscatedName("client.ru")
    public static short field653 = 1;

    @ObfuscatedName("client.ri")
    public static short field792 = 32767;

    @ObfuscatedName("client.rv")
    public static int field882 = 0;

    @ObfuscatedName("client.rt")
    public static int field883 = 0;

    @ObfuscatedName("client.rw")
    public static int field884 = 0;

    @ObfuscatedName("client.rq")
    public static int field686 = 0;

    @ObfuscatedName("client.ry")
    public static int field886 = 0;

    @ObfuscatedName("client.rs")
    public static class215 field822 = new class215();

    @ObfuscatedName("client.so")
    public static int field734 = -1;

    @ObfuscatedName("client.sv")
    public static int field889 = -1;

    @ObfuscatedName("client.sa")
    public static class330 field628 = new class329();

    @ObfuscatedName("client.sb")
    public static class10[] field891 = new class10[8];

    @ObfuscatedName("client.sh")
    public static class68 field852 = new class68();

    @ObfuscatedName("client.sk")
    public static int field893 = -1;

    @ObfuscatedName("client.si")
    public static ArrayList field894 = new ArrayList(10);

    @ObfuscatedName("client.sp")
    public static int field895 = 0;

    @ObfuscatedName("client.sw")
    public static int field896 = 0;

    @ObfuscatedName("client.tr")
    public static final class66 field685 = new class66();

    @ObfuscatedName("client.tz")
    public static int[] field698 = new int[50];

    @ObfuscatedName("client.tk")
    public static int[] field899 = new int[50];

    @ObfuscatedName("bt.ej(I)Llv;")
    public static class333 method1656() {
        return Statics.field290;
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method745() {
    }

    public final void init() {
        if (!this.method752()) {
            return;
        }
        for (int var1 = 0; var1 <= 19; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field811 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class82.field1125)) {
                            field637 = true;
                        } else {
                            field637 = false;
                        }
                        break;
                    case 4:
                        if (field671 == -1) {
                            field671 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field626 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field523 = class191.method3362(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class230[] var4 = Statics.method4892();
                        int var5 = 0;
                        class230 var7;
                        while (true) {
                            if (var5 >= var4.length) {
                                var7 = null;
                                break;
                            }
                            class230 var6 = var4[var5];
                            if (var6.field3081 == var3) {
                                var7 = var6;
                                break;
                            }
                            var5++;
                        }
                        Statics.field3508 = var7;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class82.field1125)) {
                        }
                        break;
                    case 9:
                        Statics.field2038 = var2;
                        break;
                    case 10:
                        Statics.field167 = (class231) class196.method1723(class231.method344(), Integer.parseInt(var2));
                        if (Statics.field167 == class231.field3088) {
                            Statics.field3649 = class338.field4032;
                        } else {
                            Statics.field3649 = class338.field4033;
                        }
                        break;
                    case 12:
                        field872 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1415 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field627 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field7 = var2;
                }
            }
        }
        class134.field1808 = false;
        field829 = false;
        Statics.field3102 = this.getCodeBase().getHost();
        String var8 = Statics.field3508.field3080;
        byte var9 = 0;
        try {
            Statics.field2032 = 21;
            Statics.field544 = var9;
            try {
                Statics.field1440 = System.getProperty("os.name");
            } catch (Exception var23) {
                Statics.field1440 = "Unknown";
            }
            Statics.field3709 = Statics.field1440.toLowerCase();
            try {
                Statics.field3638 = System.getProperty("user.home");
                if (Statics.field3638 != null) {
                    Statics.field3638 = Statics.field3638 + "/";
                }
            } catch (Exception var22) {
            }
            try {
                if (Statics.field3709.startsWith("win")) {
                    if (Statics.field3638 == null) {
                        Statics.field3638 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field3638 == null) {
                    Statics.field3638 = System.getenv("HOME");
                }
                if (Statics.field3638 != null) {
                    Statics.field3638 = Statics.field3638 + "/";
                }
            } catch (Exception var21) {
            }
            if (Statics.field3638 == null) {
                Statics.field3638 = "~/";
            }
            Statics.field48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3638, "/tmp/", "" };
            Statics.field1182 = new String[] { ".jagex_cache_" + Statics.field544, ".file_store_" + Statics.field544 };
            label131: for (int var13 = 0; var13 < 4; var13++) {
                Statics.field2024 = class168.method48("oldschool", var8, var13);
                if (!Statics.field2024.exists()) {
                    Statics.field2024.mkdirs();
                }
                File[] var14 = Statics.field2024.listFiles();
                if (var14 == null) {
                    break;
                }
                File[] var15 = var14;
                int var16 = 0;
                while (true) {
                    if (var16 >= var15.length) {
                        break label131;
                    }
                    File var17 = var15[var16];
                    if (!class168.method881(var17, false)) {
                        break;
                    }
                    var16++;
                }
            }
            File var18 = Statics.field2024;
            Statics.field2034 = var18;
            if (!Statics.field2034.exists()) {
                throw new RuntimeException("");
            }
            class170.field2035 = true;
            class168.method2267();
            class168.field2030 = new class342(new class343(class170.method625("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2029 = new class342(new class343(class170.method625("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field282 = new class342[Statics.field2032];
            for (int var19 = 0; var19 < Statics.field2032; var19++) {
                Statics.field282[var19] = new class342(new class343(class170.method625("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var24) {
            class341.method40((String) null, var24);
        }
        Statics.field260 = this;
        Statics.field4008 = field671;
        this.method811(765, 503, 182);
    }

    @ObfuscatedName("client.az(I)V")
    public final void method763() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1951 = null;
            Statics.field3714 = null;
            Statics.field1867 = (byte[][][]) null;
        } else {
            Statics.field1951 = var1;
            Statics.field3714 = new int[var1.length];
            Statics.field1867 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1951.length; var3++) {
                Statics.field1867[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field165 = field627 == 0 ? 43594 : field872 + 40000;
        Statics.field1597 = field627 == 0 ? 443 : field872 + 50000;
        Statics.field497 = Statics.field165;
        Statics.field388 = class216.field2530;
        Statics.field3652 = class216.field2532;
        Statics.field2524 = class216.field2529;
        Statics.field1419 = class216.field2528;
        Statics.field558 = new class144();
        this.method753();
        this.method796();
        Statics.field391 = this.method742();
        Statics.field3664 = new class308(255, class168.field2030, class168.field2029, 500000);
        class343 var4 = null;
        class74 var5 = new class74();
        try {
            var4 = class168.method3196("", Statics.field167.field3089, false);
            byte[] var6 = new byte[(int) var4.method6034()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method6038(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class74(new class300(var6));
        } catch (Exception var13) {
        }
        try {
            if (var4 != null) {
                var4.method6036();
            }
        } catch (Exception var12) {
        }
        Statics.field69 = var5;
        this.method743();
        class52.method1100(this, Statics.field33);
        if (field627 != 0) {
            field641 = true;
        }
        method3755(Statics.field69.field1032);
        Statics.field265 = new class75(Statics.field3649);
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method851() {
        field635++;
        this.method1118();
        class235.method485();
        try {
            if (class198.field2379 == 1) {
                int var1 = Statics.field2382.method3399();
                if (var1 > 0 && Statics.field2382.method3405()) {
                    int var2 = var1 - Statics.field99;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2382.method3421(var2);
                } else {
                    Statics.field2382.method3404();
                    Statics.field2382.method3402();
                    if (Statics.field195 == null) {
                        class198.field2379 = 0;
                    } else {
                        class198.field2379 = 2;
                    }
                    Statics.field3643 = null;
                    Statics.field2330 = null;
                }
            }
        } catch (Exception var110) {
            var110.printStackTrace();
            Statics.field2382.method3404();
            class198.field2379 = 0;
            Statics.field3643 = null;
            Statics.field2330 = null;
            Statics.field195 = null;
        }
        method212();
        class46 var4 = class46.field367;
        synchronized (class46.field367) {
            class46.field385++;
            class46.field386 = class46.field384;
            class46.field381 = 0;
            if (class46.field379 >= 0) {
                while (class46.field379 != class46.field376) {
                    int var6 = class46.field375[class46.field376];
                    class46.field376 = class46.field376 + 1 & 0x7F;
                    if (var6 < 0) {
                        class46.field374[~var6] = false;
                    } else {
                        if (!class46.field374[var6] && class46.field381 < class46.field380.length - 1) {
                            class46.field380[++class46.field381 - 1] = var6;
                        }
                        class46.field374[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class46.field374[var5] = false;
                }
                class46.field379 = class46.field376;
            }
            if (class46.field381 > 0) {
                class46.field385 = 0;
            }
            class46.field384 = class46.field383;
        }
        class55.method3372();
        if (Statics.field391 != null) {
            int var8 = Statics.field391.method642();
            field897 = var8;
        }
        if (field632 == 0) {
            method993();
            Statics.field422.method3170();
            for (int var9 = 0; var9 < 32; var9++) {
                field424[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field418[var10] = 0L;
            }
            Statics.field414 = 0;
        } else if (field632 == 5) {
            class86.method268(this);
            method993();
            Statics.field422.method3170();
            for (int var11 = 0; var11 < 32; var11++) {
                field424[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field418[var12] = 0L;
            }
            Statics.field414 = 0;
        } else if (field632 == 10 || field632 == 11) {
            class86.method268(this);
        } else if (field632 == 20) {
            class86.method268(this);
            this.method1275();
        } else if (field632 == 25) {
            method664(false);
            field677 = 0;
            boolean var13 = true;
            for (int var14 = 0; var14 < Statics.field1090.length; var14++) {
                if (Statics.field471[var14] != -1 && Statics.field1090[var14] == null) {
                    Statics.field1090[var14] = Statics.field200.method3790(Statics.field471[var14], 0);
                    if (Statics.field1090[var14] == null) {
                        var13 = false;
                        field677++;
                    }
                }
                if (Statics.field3620[var14] != -1 && Statics.field1250[var14] == null) {
                    Statics.field1250[var14] = Statics.field200.method3766(Statics.field3620[var14], 0, Statics.field1848[var14]);
                    if (Statics.field1250[var14] == null) {
                        var13 = false;
                        field677++;
                    }
                }
            }
            if (var13) {
                field679 = 0;
                boolean var15 = true;
                for (int var16 = 0; var16 < Statics.field1090.length; var16++) {
                    byte[] var17 = Statics.field1250[var16];
                    if (var17 != null) {
                        int var18 = (Statics.field2308[var16] >> 8) * 64 - Statics.field1299;
                        int var19 = (Statics.field2308[var16] & 0xFF) * 64 - Statics.field2085;
                        if (field683) {
                            var18 = 10;
                            var19 = 10;
                        }
                        var15 &= class56.method267(var17, var18, var19);
                    }
                }
                if (var15) {
                    if (field720 != 0) {
                        method3562(class225.field2749 + class82.field1119 + class82.field1120 + 100 + "%" + class82.field1117, true);
                    }
                    method212();
                    Statics.field619.method2939();
                    for (int var20 = 0; var20 < 4; var20++) {
                        field892[var20].method3254();
                    }
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                class56.field473[var21][var22][var23] = 0;
                            }
                        }
                    }
                    method212();
                    class56.field474 = 99;
                    Statics.field486 = new byte[4][104][104];
                    Statics.field4062 = new byte[4][104][104];
                    Statics.field2493 = new byte[4][104][104];
                    Statics.field476 = new byte[4][104][104];
                    Statics.field484 = new int[4][105][105];
                    Statics.field2322 = new byte[4][105][105];
                    Statics.field32 = new int[105][105];
                    Statics.field477 = new int[104];
                    Statics.field27 = new int[104];
                    Statics.field3591 = new int[104];
                    Statics.field395 = new int[104];
                    Statics.field1130 = new int[104];
                    int var24 = Statics.field1090.length;
                    for (class76 var25 = (class76) class76.field1060.method4480(); var25 != null; var25 = (class76) class76.field1060.method4491()) {
                        if (var25.field1062 != null) {
                            Statics.field3576.method2109(var25.field1062);
                            var25.field1062 = null;
                        }
                        if (var25.field1052 != null) {
                            Statics.field3576.method2109(var25.field1052);
                            var25.field1052 = null;
                        }
                    }
                    class76.field1060.method4473();
                    method664(true);
                    if (!field683) {
                        int var26 = 0;
                        label495: while (true) {
                            if (var26 >= var24) {
                                for (int var40 = 0; var40 < var24; var40++) {
                                    int var41 = (Statics.field2308[var40] >> 8) * 64 - Statics.field1299;
                                    int var42 = (Statics.field2308[var40] & 0xFF) * 64 - Statics.field2085;
                                    byte[] var43 = Statics.field1090[var40];
                                    if (var43 == null && Statics.field102 < 800) {
                                        method212();
                                        class56.method3378(var41, var42, 64, 64);
                                    }
                                }
                                method664(true);
                                int var44 = 0;
                                while (true) {
                                    if (var44 >= var24) {
                                        break label495;
                                    }
                                    byte[] var45 = Statics.field1250[var44];
                                    if (var45 != null) {
                                        int var46 = (Statics.field2308[var44] >> 8) * 64 - Statics.field1299;
                                        int var47 = (Statics.field2308[var44] & 0xFF) * 64 - Statics.field2085;
                                        method212();
                                        class56.method180(var45, var46, var47, Statics.field619, field892);
                                    }
                                    var44++;
                                }
                            }
                            int var27 = (Statics.field2308[var26] >> 8) * 64 - Statics.field1299;
                            int var28 = (Statics.field2308[var26] & 0xFF) * 64 - Statics.field2085;
                            byte[] var29 = Statics.field1090[var26];
                            if (var29 != null) {
                                method212();
                                int var30 = Statics.field87 * 8 - 48;
                                int var31 = Statics.field102 * 8 - 48;
                                class173[] var32 = field892;
                                int var33 = 0;
                                label492: while (true) {
                                    if (var33 >= 4) {
                                        class300 var36 = new class300(var29);
                                        int var37 = 0;
                                        while (true) {
                                            if (var37 >= 4) {
                                                break label492;
                                            }
                                            for (int var38 = 0; var38 < 64; var38++) {
                                                for (int var39 = 0; var39 < 64; var39++) {
                                                    class56.method475(var36, var37, var27 + var38, var28 + var39, var30, var31, 0);
                                                }
                                            }
                                            var37++;
                                        }
                                    }
                                    for (int var34 = 0; var34 < 64; var34++) {
                                        for (int var35 = 0; var35 < 64; var35++) {
                                            if (var27 + var34 > 0 && var27 + var34 < 103 && var28 + var35 > 0 && var28 + var35 < 103) {
                                                var32[var33].field2065[var27 + var34][var28 + var35] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var33++;
                                }
                            }
                            var26++;
                        }
                    }
                    if (field683) {
                        int var48 = 0;
                        label441: while (true) {
                            if (var48 >= 4) {
                                for (int var59 = 0; var59 < 13; var59++) {
                                    for (int var60 = 0; var60 < 13; var60++) {
                                        int var61 = field684[0][var59][var60];
                                        if (var61 == -1) {
                                            class56.method3378(var59 * 8, var60 * 8, 8, 8);
                                        }
                                    }
                                }
                                method664(true);
                                int var62 = 0;
                                while (true) {
                                    if (var62 >= 4) {
                                        break label441;
                                    }
                                    method212();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        label398: for (int var64 = 0; var64 < 13; var64++) {
                                            int var65 = field684[var62][var63][var64];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field2308.length; var71++) {
                                                    if (Statics.field2308[var71] == var70 && Statics.field1250[var71] != null) {
                                                        byte[] var72 = Statics.field1250[var71];
                                                        int var73 = var63 * 8;
                                                        int var74 = var64 * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        class134 var77 = Statics.field619;
                                                        class173[] var78 = field892;
                                                        class300 var79 = new class300(var72);
                                                        int var80 = -1;
                                                        while (true) {
                                                            int var81 = var79.method5209();
                                                            if (var81 == 0) {
                                                                continue label398;
                                                            }
                                                            var80 += var81;
                                                            int var82 = 0;
                                                            while (true) {
                                                                int var83 = var79.method5113();
                                                                if (var83 == 0) {
                                                                    break;
                                                                }
                                                                var82 += var83 - 1;
                                                                int var84 = var82 & 0x3F;
                                                                int var85 = var82 >> 6 & 0x3F;
                                                                int var86 = var82 >> 12;
                                                                int var87 = var79.method5179();
                                                                int var88 = var87 >> 2;
                                                                int var89 = var87 & 0x3;
                                                                if (var66 == var86 && var85 >= var75 && var85 < var75 + 8 && var84 >= var76 && var84 < var76 + 8) {
                                                                    class254 var90 = class254.method3676(var80);
                                                                    int var91 = var73 + Statics.method3150(var85 & 0x7, var84 & 0x7, var67, var90.field3372, var90.field3347, var89);
                                                                    int var92 = var74 + class217.method3658(var85 & 0x7, var84 & 0x7, var67, var90.field3372, var90.field3347, var89);
                                                                    if (var91 > 0 && var92 > 0 && var91 < 103 && var92 < 103) {
                                                                        int var93 = var62;
                                                                        if ((class56.field473[1][var91][var92] & 0x2) == 2) {
                                                                            var93 = var62 - 1;
                                                                        }
                                                                        class173 var94 = null;
                                                                        if (var93 >= 0) {
                                                                            var94 = var78[var93];
                                                                        }
                                                                        class56.method486(var62, var91, var92, var80, var67 + var89 & 0x3, var88, var77, var94);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method212();
                            for (int var49 = 0; var49 < 13; var49++) {
                                for (int var50 = 0; var50 < 13; var50++) {
                                    boolean var51 = false;
                                    int var52 = field684[var48][var49][var50];
                                    if (var52 != -1) {
                                        int var53 = var52 >> 24 & 0x3;
                                        int var54 = var52 >> 1 & 0x3;
                                        int var55 = var52 >> 14 & 0x3FF;
                                        int var56 = var52 >> 3 & 0x7FF;
                                        int var57 = (var55 / 8 << 8) + var56 / 8;
                                        for (int var58 = 0; var58 < Statics.field2308.length; var58++) {
                                            if (Statics.field2308[var58] == var57 && Statics.field1090[var58] != null) {
                                                class56.method4577(Statics.field1090[var58], var48, var49 * 8, var50 * 8, var53, (var55 & 0x7) * 8, (var56 & 0x7) * 8, var54, field892);
                                                var51 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var51) {
                                        class56.method5387(var48, var49 * 8, var50 * 8);
                                    }
                                }
                            }
                            var48++;
                        }
                    }
                    method664(true);
                    method212();
                    class56.method75(Statics.field619, field892);
                    method664(true);
                    int var95 = class56.field474;
                    if (var95 > Statics.field519) {
                        var95 = Statics.field519;
                    }
                    if (var95 < Statics.field519 - 1) {
                        int var96 = Statics.field519 - 1;
                    }
                    if (field829) {
                        Statics.field619.method2829(class56.field474);
                    } else {
                        Statics.field619.method2829(0);
                    }
                    for (int var97 = 0; var97 < 104; var97++) {
                        for (int var98 = 0; var98 < 104; var98++) {
                            method3352(var97, var98);
                        }
                    }
                    method212();
                    method2033();
                    class254.field3337.method3068();
                    if (Statics.field260.method772()) {
                        class188 var99 = class188.method1879(class184.field2190, field828.field1300);
                        var99.field2321.method5166(1057001181);
                        field828.method2049(var99);
                    }
                    if (!field683) {
                        int var100 = (Statics.field87 - 6) / 8;
                        int var101 = (Statics.field87 + 6) / 8;
                        int var102 = (Statics.field102 - 6) / 8;
                        int var103 = (Statics.field102 + 6) / 8;
                        for (int var104 = var100 - 1; var104 <= var101 + 1; var104++) {
                            for (int var105 = var102 - 1; var105 <= var103 + 1; var105++) {
                                if (var104 < var100 || var104 > var101 || var105 < var102 || var105 > var103) {
                                    Statics.field200.method3836("m" + var104 + "_" + var105);
                                    Statics.field200.method3836("l" + var104 + "_" + var105);
                                }
                            }
                        }
                    }
                    method2603(30);
                    method212();
                    Statics.field486 = (byte[][][]) null;
                    Statics.field4062 = (byte[][][]) null;
                    Statics.field2493 = (byte[][][]) null;
                    Statics.field476 = (byte[][][]) null;
                    Statics.field484 = (int[][][]) null;
                    Statics.field2322 = (byte[][][]) null;
                    Statics.field32 = (int[][]) null;
                    Statics.field477 = null;
                    Statics.field27 = null;
                    Statics.field3591 = null;
                    Statics.field395 = null;
                    Statics.field1130 = null;
                    class188 var106 = class188.method1879(class184.field2262, field828.field1300);
                    field828.method2049(var106);
                    Statics.field422.method3170();
                    for (int var107 = 0; var107 < 32; var107++) {
                        field424[var107] = 0L;
                    }
                    for (int var108 = 0; var108 < 32; var108++) {
                        field418[var108] = 0L;
                    }
                    Statics.field414 = 0;
                } else {
                    field720 = 2;
                }
            } else {
                field720 = 1;
            }
        }
        if (field632 == 30) {
            this.method1491();
        } else if (field632 == 40 || field632 == 45) {
            this.method1275();
        }
    }

    @ObfuscatedName("client.an(ZI)V")
    public final void method765(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2379 == 2) {
                    if (Statics.field3643 == null) {
                        Statics.field3643 = class204.method3579(Statics.field195, Statics.field2387, Statics.field2384);
                        if (Statics.field3643 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2330 == null) {
                        Statics.field2330 = new class109(Statics.field2381, Statics.field2380);
                    }
                    if (Statics.field2382.method3400(Statics.field3643, Statics.field2389, Statics.field2330, 22050)) {
                        Statics.field2382.method3465();
                        Statics.field2382.method3421(Statics.field223);
                        Statics.field2382.method3403(Statics.field3643, Statics.field1243);
                        class198.field2379 = 0;
                        Statics.field3643 = null;
                        Statics.field2330 = null;
                        Statics.field195 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2382.method3404();
                class198.field2379 = 0;
                Statics.field3643 = null;
                Statics.field2330 = null;
                Statics.field195 = null;
            }
            var2 = false;
        }
        if (var2 && field859 && Statics.field569 != null) {
            Statics.field569.method2238();
        }
        if ((field632 == 10 || field632 == 20 || field632 == 30) && field837 != 0L && class297.method4369() > field837) {
            method3755(method3141());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field704[var5] = true;
            }
        }
        if (field632 == 0) {
            this.method767(class86.field1181, class86.field1158, arg0);
        } else if (field632 == 5) {
            class86.method64(Statics.field357, Statics.field254, Statics.field2186);
        } else if (field632 == 10 || field632 == 11) {
            class86.method64(Statics.field357, Statics.field254, Statics.field2186);
        } else if (field632 == 20) {
            class86.method64(Statics.field357, Statics.field254, Statics.field2186);
        } else if (field632 == 25) {
            if (field720 == 1) {
                if (field677 > field887) {
                    field887 = field677;
                }
                int var6 = (field887 * 50 - field677 * 50) / field887;
                method3562(class225.field2749 + class82.field1119 + class82.field1120 + var6 + "%" + class82.field1117, false);
            } else if (field720 == 2) {
                if (field679 > field719) {
                    field719 = field679;
                }
                int var7 = (field719 * 50 - field679 * 50) / field719 + 50;
                method3562(class225.field2749 + class82.field1119 + class82.field1120 + var7 + "%" + class82.field1117, false);
            } else {
                method3562(class225.field2749, false);
            }
        } else if (field632 == 30) {
            this.method1124();
        } else if (field632 == 40) {
            method3562(class225.field2815 + class82.field1119 + class225.field2810, false);
        } else if (field632 == 45) {
            method3562(class225.field2900, false);
        }
        if (field632 == 30 && field836 == 0 && !arg0 && !field838) {
            for (int var8 = 0; var8 < field827; var8++) {
                if (field830[var8]) {
                    Statics.field3235.method727(field832[var8], field824[var8], field834[var8], field835[var8]);
                    field830[var8] = false;
                }
            }
        } else if (field632 > 0) {
            Statics.field3235.method729(0, 0);
            for (int var9 = 0; var9 < field827; var9++) {
                field830[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.at(I)V")
    public final void method766() {
        if (Statics.field389.method1970()) {
            Statics.field389.method1967();
        }
        if (Statics.field2344 != null) {
            Statics.field2344.field562 = false;
        }
        Statics.field2344 = null;
        field828.method2056();
        if (class46.field367 != null) {
            class46 var1 = class46.field367;
            synchronized (class46.field367) {
                class46.field367 = null;
            }
        }
        if (class55.field453 != null) {
            class55 var3 = class55.field453;
            synchronized (class55.field453) {
                class55.field453 = null;
            }
        }
        Statics.field391 = null;
        if (Statics.field569 != null) {
            Statics.field569.method2211();
        }
        if (Statics.field1427 != null) {
            Statics.field1427.method2211();
        }
        if (Statics.field3150 != null) {
            Statics.field3150.method3223();
        }
        class235.method999();
        if (Statics.field558 != null) {
            Statics.field558.method3053();
            Statics.field558 = null;
        }
        try {
            class168.field2030.method6008();
            for (int var5 = 0; var5 < Statics.field2032; var5++) {
                Statics.field282[var5].method6008();
            }
            class168.field2029.method6008();
            class168.field2026.method6008();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("dy.er(II)V")
    public static void method2603(int arg0) {
        if (field632 == arg0) {
            return;
        }
        if (field632 == 0) {
            Statics.field260.method768();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field888 = 0;
            field659 = 0;
            field660 = 0;
            field762.method4582(arg0);
            if (arg0 != 20) {
                method300(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3846 != null) {
            Statics.field3846.method3223();
            Statics.field3846 = null;
        }
        if (field632 == 25) {
            field720 = 0;
            field677 = 0;
            field887 = 1;
            field679 = 0;
            field719 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method3025(Statics.field1923, Statics.field11, true, 0);
        } else if (arg0 == 20) {
            class86.method3025(Statics.field1923, Statics.field11, true, field632 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method3025(Statics.field1923, Statics.field11, false, 4);
        } else {
            class86.method2028();
        }
        field632 = arg0;
    }

    @ObfuscatedName("client.ep(I)V")
    public void method1118() {
        if (field632 != 1000) {
            boolean var1 = class237.method2825();
            if (!var1) {
                this.method1446();
            }
        }
    }

    @ObfuscatedName("client.ek(I)V")
    public void method1446() {
        if (class237.field3161 >= 4) {
            this.method813("js5crc");
            field632 = 1000;
            return;
        }
        if (class237.field3162 >= 4) {
            if (field632 <= 5) {
                this.method813("js5io");
                field632 = 1000;
                return;
            }
            field682 = 3000;
            class237.field3162 = 3;
        }
        if (--field682 + 1 > 0) {
            return;
        }
        try {
            if (field655 == 0) {
                Statics.field2084 = Statics.field441.method3180(Statics.field3102, Statics.field497);
                field655++;
            }
            if (field655 == 1) {
                if (Statics.field2084.field2010 == 2) {
                    this.method1120(-1);
                    return;
                }
                if (Statics.field2084.field2010 == 1) {
                    field655++;
                }
            }
            if (field655 == 2) {
                if (field811) {
                    Socket var1 = (Socket) Statics.field2084.field2014;
                    class306 var2 = new class306(var1, 40000, 5000);
                    Statics.field654 = var2;
                } else {
                    Statics.field654 = new class172((Socket) Statics.field2084.field2014, Statics.field441, 5000);
                }
                class300 var3 = new class300(5);
                var3.method5083(15);
                var3.method5166(182);
                Statics.field654.method3229(var3.field3701, 0, 5);
                field655++;
                Statics.field2512 = class297.method4369();
            }
            if (field655 == 3) {
                if (Statics.field654.method3244() > 0 || !field811 && field632 <= 5) {
                    int var4 = Statics.field654.method3251();
                    if (var4 != 0) {
                        this.method1120(var4);
                        return;
                    }
                    field655++;
                } else if (class297.method4369() - Statics.field2512 > 30000L) {
                    this.method1120(-2);
                    return;
                }
            }
            if (field655 == 4) {
                class237.method1881(Statics.field654, field632 > 20);
                Statics.field2084 = null;
                Statics.field654 = null;
                field655 = 0;
                field657 = 0;
            }
        } catch (IOException var6) {
            this.method1120(-3);
        }
    }

    @ObfuscatedName("client.et(II)V")
    public void method1120(int arg0) {
        Statics.field2084 = null;
        Statics.field654 = null;
        field655 = 0;
        if (Statics.field497 == Statics.field165) {
            Statics.field497 = Statics.field1597;
        } else {
            Statics.field497 = Statics.field165;
        }
        field657++;
        if (field657 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field632 <= 5) {
                this.method813("js5connect_full");
                field632 = 1000;
            } else {
                field682 = 3000;
            }
        } else if (field657 >= 2 && arg0 == 6) {
            this.method813("js5connect_outofdate");
            field632 = 1000;
        } else if (field657 >= 4) {
            if (field632 <= 5) {
                this.method813("js5connect");
                field632 = 1000;
            } else {
                field682 = 3000;
            }
        }
    }

    @ObfuscatedName("bq.ed(Lid;Ljava/lang/String;I)V")
    public static void method1002(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field894.add(var2);
        field896 += var2.field512;
    }

    @ObfuscatedName("ap.es(I)I")
    public static int method635() {
        if (field894 == null || field895 >= field894.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field895; var1++) {
            var0 += ((class59) field894.get(var1)).field510;
        }
        return var0 * 10000 / field896;
    }

    @ObfuscatedName("ef.ez(III)V")
    public static void method2823(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class131.field1767[var4];
            int var8 = method977(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class134.method2863(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("bv.eb(B)V")
    public static void method993() {
        if (field751 == 0) {
            Statics.field619 = new class134(4, 104, 104, class56.field472);
            for (int var0 = 0; var0 < 4; var0++) {
                field892[var0] = new class173(104, 104);
            }
            Statics.field3289 = new class325(512, 512);
            class86.field1158 = class225.field2752;
            class86.field1181 = 5;
            field751 = 20;
        } else if (field751 == 20) {
            class86.field1158 = class225.field2738;
            class86.field1181 = 10;
            field751 = 30;
        } else if (field751 == 30) {
            Statics.field875 = method3135(0, false, true, true);
            Statics.field3541 = method3135(1, false, true, true);
            Statics.field985 = method3135(2, true, false, true);
            Statics.field1957 = method3135(3, false, true, true);
            Statics.field226 = method3135(4, false, true, true);
            Statics.field200 = method3135(5, true, true, true);
            Statics.field47 = method3135(6, true, true, true);
            Statics.field409 = method3135(7, false, true, true);
            Statics.field11 = method3135(8, false, true, true);
            Statics.field196 = method3135(9, false, true, true);
            Statics.field1923 = method3135(10, false, true, true);
            Statics.field168 = method3135(11, false, true, true);
            Statics.field440 = method3135(12, false, true, true);
            Statics.field263 = method3135(13, true, false, true);
            Statics.field270 = method3135(14, false, true, true);
            Statics.field39 = method3135(15, false, true, true);
            Statics.field179 = method3135(17, true, true, true);
            Statics.field333 = method3135(18, false, true, true);
            Statics.field1424 = method3135(19, false, true, true);
            Statics.field1263 = method3135(20, false, true, true);
            class86.field1158 = class225.field2754;
            class86.field1181 = 20;
            field751 = 40;
        } else if (field751 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field875.method3880() * 4 / 100;
            int var3 = var2 + Statics.field3541.method3880() * 4 / 100;
            int var4 = var3 + Statics.field985.method3880() * 2 / 100;
            int var5 = var4 + Statics.field1957.method3880() * 2 / 100;
            int var6 = var5 + Statics.field226.method3880() * 6 / 100;
            int var7 = var6 + Statics.field200.method3880() * 4 / 100;
            int var8 = var7 + Statics.field47.method3880() * 2 / 100;
            int var9 = var8 + Statics.field409.method3880() * 56 / 100;
            int var10 = var9 + Statics.field11.method3880() * 2 / 100;
            int var11 = var10 + Statics.field196.method3880() * 2 / 100;
            int var12 = var11 + Statics.field1923.method3880() * 2 / 100;
            int var13 = var12 + Statics.field168.method3880() * 2 / 100;
            int var14 = var13 + Statics.field440.method3880() * 2 / 100;
            int var15 = var14 + Statics.field263.method3880() * 2 / 100;
            int var16 = var15 + Statics.field270.method3880() * 2 / 100;
            int var17 = var16 + Statics.field39.method3880() * 2 / 100;
            int var18 = var17 + Statics.field1424.method3880() / 100;
            int var19 = var18 + Statics.field333.method3880() / 100;
            int var20 = var19 + Statics.field1263.method3880() / 100;
            int var21 = var20 + (Statics.field179.method3879() && Statics.field179.method3815() ? 1 : 0);
            if (var21 == 100) {
                method1002(Statics.field875, "Animations");
                method1002(Statics.field3541, "Skeletons");
                method1002(Statics.field226, "Sound FX");
                method1002(Statics.field200, "Maps");
                method1002(Statics.field47, "Music Tracks");
                method1002(Statics.field409, "Models");
                method1002(Statics.field11, "Sprites");
                method1002(Statics.field168, "Music Jingles");
                method1002(Statics.field270, "Music Samples");
                method1002(Statics.field39, "Music Patches");
                method1002(Statics.field1424, "World Map");
                method1002(Statics.field333, "World Map Geography");
                method1002(Statics.field1263, "World Map Ground");
                Statics.field2385 = new class312();
                Statics.field2385.method5383(Statics.field179);
                class86.field1158 = class225.field2950;
                class86.field1181 = 30;
                field751 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1158 = class225.field3035 + var21 + "%";
                }
                class86.field1181 = 30;
            }
        } else if (field751 == 45) {
            class106.method3754(22050, !field829, 2);
            class199 var22 = new class199();
            var22.method3406(9, 128);
            Statics.field569 = class106.method5361(Statics.field441, 0, 22050);
            Statics.field569.method2216(var22);
            class198.method3753(Statics.field39, Statics.field270, Statics.field226, var22);
            Statics.field1427 = class106.method5361(Statics.field441, 1, 2048);
            Statics.field3576 = new class99();
            Statics.field1427.method2216(Statics.field3576);
            Statics.field3274 = new class113(22050, Statics.field1384);
            class86.field1158 = class225.field2757;
            class86.field1181 = 35;
            field751 = 50;
            Statics.field1965 = new class293(Statics.field11, Statics.field263);
        } else if (field751 == 50) {
            class292[] var23 = new class292[] { class292.field3639, class292.field3642, class292.field3646, class292.field3640, class292.field3641, class292.field3647 };
            int var24 = var23.length;
            class293 var25 = Statics.field1965;
            class292[] var26 = new class292[] { class292.field3639, class292.field3642, class292.field3646, class292.field3640, class292.field3641, class292.field3647 };
            field676 = var25.method4891(var26);
            if (field676.size() < var24) {
                class86.field1158 = class225.field2758 + field676.size() * 100 / var24 + "%";
                class86.field1181 = 40;
            } else {
                Statics.field254 = (class295) field676.get(class292.field3646);
                Statics.field2186 = (class295) field676.get(class292.field3647);
                Statics.field357 = (class295) field676.get(class292.field3642);
                Statics.field990 = field628.method5739();
                class86.field1158 = class225.field2759;
                class86.field1181 = 40;
                field751 = 60;
            }
        } else if (field751 == 60) {
            int var27 = class86.method3366(Statics.field1923, Statics.field11);
            int var28 = class86.method1578();
            if (var27 < var28) {
                class86.field1158 = class225.field2760 + var27 * 100 / var28 + "%";
                class86.field1181 = 50;
            } else {
                class86.field1158 = class225.field2761;
                class86.field1181 = 50;
                method2603(5);
                field751 = 70;
            }
        } else if (field751 == 70) {
            if (Statics.field985.method3815()) {
                class236 var29 = Statics.field985;
                Statics.field3489 = var29;
                class245.method3289(Statics.field985);
                class236 var30 = Statics.field985;
                class236 var31 = Statics.field409;
                Statics.field3696 = var30;
                Statics.field3254 = var31;
                Statics.field3248 = Statics.field3696.method3776(3);
                class236 var32 = Statics.field985;
                class236 var33 = Statics.field409;
                boolean var34 = field829;
                Statics.field3331 = var32;
                Statics.field3332 = var33;
                class254.field3375 = var34;
                class257.method336(Statics.field985, Statics.field409);
                class236 var35 = Statics.field985;
                Statics.field3294 = var35;
                class255.method3350(Statics.field985, Statics.field409, field637, Statics.field254);
                Statics.method4886(Statics.field985, Statics.field875, Statics.field3541);
                class236 var36 = Statics.field985;
                class236 var37 = Statics.field409;
                Statics.field3220 = var36;
                Statics.field3225 = var37;
                class249.method3370(Statics.field985);
                class241.method967(Statics.field985);
                class218.method3132(Statics.field1957, Statics.field409, Statics.field11, Statics.field263);
                class240.method649(Statics.field985);
                class236 var38 = Statics.field985;
                Statics.field3299 = var38;
                class236 var39 = Statics.field985;
                Statics.field3216 = var39;
                class236 var40 = Statics.field985;
                Statics.field4042 = var40;
                Statics.field389 = new class91();
                class236 var41 = Statics.field985;
                class236 var42 = Statics.field11;
                class236 var43 = Statics.field263;
                Statics.field3328 = var41;
                Statics.field59 = var42;
                Statics.field354 = var43;
                class236 var44 = Statics.field985;
                class236 var45 = Statics.field11;
                Statics.field3260 = var44;
                Statics.field3258 = var45;
                class236 var46 = Statics.field985;
                class236 var47 = Statics.field11;
                Statics.field3213 = var47;
                if (var46.method3815()) {
                    Statics.field3195 = var46.method3776(35);
                    Statics.field3194 = new class242[Statics.field3195];
                    for (int var48 = 0; var48 < Statics.field3195; var48++) {
                        byte[] var49 = var46.method3790(35, var48);
                        Statics.field3194[var48] = new class242(var48);
                        if (var49 != null) {
                            Statics.field3194[var48].method3986(new class300(var49));
                            Statics.field3194[var48].method3977();
                        }
                    }
                }
                class86.field1158 = class225.field2972;
                class86.field1181 = 60;
                field751 = 80;
            } else {
                class86.field1158 = class225.field2816 + Statics.field985.method3885() + "%";
                class86.field1181 = 60;
            }
        } else if (field751 == 80) {
            int var50 = 0;
            if (Statics.field267 == null) {
                Statics.field267 = class326.method2824(Statics.field11, Statics.field2385.field3804, 0);
            } else {
                var50++;
            }
            if (Statics.field1974 == null) {
                Statics.field1974 = class326.method2824(Statics.field11, Statics.field2385.field3807, 0);
            } else {
                var50++;
            }
            if (Statics.field622 == null) {
                class236 var51 = Statics.field11;
                int var52 = Statics.field2385.field3800;
                class324[] var53;
                if (class326.method1599(var51, var52, 0)) {
                    class324[] var54 = new class324[Statics.field3885];
                    for (int var55 = 0; var55 < Statics.field3885; var55++) {
                        class324 var56 = var54[var55] = new class324();
                        var56.field3871 = Statics.field72;
                        var56.field3872 = Statics.field3888;
                        var56.field3869 = Statics.field3886[var55];
                        var56.field3870 = Statics.field3887[var55];
                        var56.field3867 = Statics.field3889[var55];
                        var56.field3868 = Statics.field3042[var55];
                        var56.field3865 = Statics.field3890;
                        var56.field3866 = Statics.field283[var55];
                    }
                    class326.method3139();
                    var53 = var54;
                } else {
                    var53 = null;
                }
                Statics.field622 = var53;
            } else {
                var50++;
            }
            if (Statics.field1979 == null) {
                Statics.field1979 = class326.method480(Statics.field11, Statics.field2385.field3801, 0);
            } else {
                var50++;
            }
            if (Statics.field4011 == null) {
                Statics.field4011 = class326.method480(Statics.field11, Statics.field2385.field3806, 0);
            } else {
                var50++;
            }
            if (Statics.field324 == null) {
                Statics.field324 = class326.method480(Statics.field11, Statics.field2385.field3803, 0);
            } else {
                var50++;
            }
            if (Statics.field271 == null) {
                Statics.field271 = class326.method480(Statics.field11, Statics.field2385.field3799, 0);
            } else {
                var50++;
            }
            if (Statics.field3797 == null) {
                Statics.field3797 = class326.method480(Statics.field11, Statics.field2385.field3805, 0);
            } else {
                var50++;
            }
            if (Statics.field232 == null) {
                Statics.field232 = class326.method480(Statics.field11, Statics.field2385.field3798, 0);
            } else {
                var50++;
            }
            if (Statics.field1039 == null) {
                class236 var58 = Statics.field11;
                int var59 = Statics.field2385.field3802;
                class324[] var60;
                if (class326.method1599(var58, var59, 0)) {
                    class324[] var61 = new class324[Statics.field3885];
                    for (int var62 = 0; var62 < Statics.field3885; var62++) {
                        class324 var63 = var61[var62] = new class324();
                        var63.field3871 = Statics.field72;
                        var63.field3872 = Statics.field3888;
                        var63.field3869 = Statics.field3886[var62];
                        var63.field3870 = Statics.field3887[var62];
                        var63.field3867 = Statics.field3889[var62];
                        var63.field3868 = Statics.field3042[var62];
                        var63.field3865 = Statics.field3890;
                        var63.field3866 = Statics.field283[var62];
                    }
                    class326.method3139();
                    var60 = var61;
                } else {
                    var60 = null;
                }
                Statics.field1039 = var60;
            } else {
                var50++;
            }
            if (Statics.field1251 == null) {
                class236 var65 = Statics.field11;
                int var66 = Statics.field2385.field3808;
                class324[] var67;
                if (class326.method1599(var65, var66, 0)) {
                    class324[] var68 = new class324[Statics.field3885];
                    for (int var69 = 0; var69 < Statics.field3885; var69++) {
                        class324 var70 = var68[var69] = new class324();
                        var70.field3871 = Statics.field72;
                        var70.field3872 = Statics.field3888;
                        var70.field3869 = Statics.field3886[var69];
                        var70.field3870 = Statics.field3887[var69];
                        var70.field3867 = Statics.field3889[var69];
                        var70.field3868 = Statics.field3042[var69];
                        var70.field3865 = Statics.field3890;
                        var70.field3866 = Statics.field283[var69];
                    }
                    class326.method3139();
                    var67 = var68;
                } else {
                    var67 = null;
                }
                Statics.field1251 = var67;
            } else {
                var50++;
            }
            if (var50 < 11) {
                class86.field1158 = class225.field2764 + var50 * 100 / 12 + "%";
                class86.field1181 = 70;
            } else {
                Statics.field3676 = Statics.field1251;
                Statics.field1974.method5692();
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 41.0D) - 20;
                Statics.field622[0].method5569(var72 + var75, var73 + var75, var74 + var75);
                class86.field1158 = class225.field2765;
                class86.field1181 = 70;
                field751 = 90;
            }
        } else if (field751 == 90) {
            if (Statics.field196.method3815()) {
                Statics.field1134 = new class120(Statics.field196, Statics.field11, 20, 0.8D, field829 ? 64 : 128);
                class131.method2753(Statics.field1134);
                class131.method2816(0.8D);
                field751 = 100;
            } else {
                class86.field1158 = class225.field2766 + "0%";
                class86.field1181 = 90;
            }
        } else if (field751 == 100) {
            int var76 = Statics.field1134.method2492();
            if (var76 < 100) {
                class86.field1158 = class225.field2766 + var76 + "%";
                class86.field1181 = 90;
            } else {
                class86.field1158 = class225.field2767;
                class86.field1181 = 90;
                field751 = 110;
            }
        } else if (field751 == 110) {
            Statics.field2344 = new class64();
            Statics.field441.method3192(Statics.field2344, 10);
            class86.field1158 = class225.field2768;
            class86.field1181 = 92;
            field751 = 120;
        } else if (field751 == 120) {
            if (Statics.field1923.method3781("huffman", "")) {
                class210 var77 = new class210(Statics.field1923.method3785("huffman", ""));
                Statics.field2496 = var77;
                class86.field1158 = class225.field2770;
                class86.field1181 = 94;
                field751 = 130;
            } else {
                class86.field1158 = class225.field3019 + "%";
                class86.field1181 = 94;
            }
        } else if (field751 == 130) {
            if (!Statics.field1957.method3815()) {
                class86.field1158 = class225.field2934 + Statics.field1957.method3885() * 4 / 5 + "%";
                class86.field1181 = 96;
            } else if (!Statics.field440.method3815()) {
                class86.field1158 = class225.field2934 + (80 + Statics.field440.method3885() / 6) + "%";
                class86.field1181 = 96;
            } else if (Statics.field263.method3815()) {
                class86.field1158 = class225.field2772;
                class86.field1181 = 98;
                field751 = 140;
            } else {
                class86.field1158 = class225.field2934 + (96 + Statics.field263.method3885() / 50) + "%";
                class86.field1181 = 96;
            }
        } else if (field751 == 140) {
            class86.field1181 = 100;
            if (Statics.field1424.method3858(class36.field296.field295)) {
                if (Statics.field290 == null) {
                    Statics.field290 = new class333();
                    Statics.field290.method5771(Statics.field1424, Statics.field333, Statics.field1263, Statics.field357, field676, Statics.field622);
                }
                class86.field1158 = class225.field2774;
                field751 = 150;
            } else {
                class86.field1158 = class225.field2825 + Statics.field1424.method3789(class36.field296.field295) / 10 + "%";
            }
        } else if (field751 == 150) {
            method2603(10);
        }
    }

    @ObfuscatedName("ew.eu(IZZZI)Lid;")
    public static class236 method3135(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class308 var4 = null;
        if (class168.field2030 != null) {
            var4 = new class308(arg0, class168.field2030, Statics.field282[arg0], 1000000);
        }
        return new class236(var4, Statics.field3664, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.el(I)V")
    public final void method1275() {
        class305 var1 = field828.method2055();
        class299 var2 = field828.field1293;
        try {
            if (field888 == 0) {
                if (Statics.field12 == null && (field664.method1925() || field659 > 250)) {
                    Statics.field12 = field664.method1924();
                    field664.method1933();
                    field664 = null;
                }
                if (Statics.field12 != null) {
                    if (var1 != null) {
                        var1.method3223();
                        var1 = null;
                    }
                    Statics.field117 = null;
                    field673 = false;
                    field659 = 0;
                    field888 = 1;
                }
            }
            if (field888 == 1) {
                if (Statics.field117 == null) {
                    Statics.field117 = Statics.field441.method3180(Statics.field3102, Statics.field497);
                }
                if (Statics.field117.field2010 == 2) {
                    throw new IOException();
                }
                if (Statics.field117.field2010 == 1) {
                    if (field811) {
                        Socket var3 = (Socket) Statics.field117.field2014;
                        class306 var4 = new class306(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class172((Socket) Statics.field117.field2014, Statics.field441, 5000);
                    }
                    field828.method2052(var1);
                    Statics.field117 = null;
                    field888 = 2;
                }
            }
            if (field888 == 2) {
                field828.method2058();
                class188 var5 = class188.method17();
                var5.field2321.method5083(class185.field2292.field2295);
                field828.method2049(var5);
                field828.method2048();
                var2.field3704 = 0;
                field888 = 3;
            }
            if (field888 == 3) {
                if (Statics.field569 != null) {
                    Statics.field569.method2247();
                }
                if (Statics.field1427 != null) {
                    Statics.field1427.method2247();
                }
                boolean var6 = true;
                if (field811 && !var1.method3226(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3251();
                    if (Statics.field569 != null) {
                        Statics.field569.method2247();
                    }
                    if (Statics.field1427 != null) {
                        Statics.field1427.method2247();
                    }
                    if (var7 != 0) {
                        method1111(var7);
                        return;
                    }
                    var2.field3704 = 0;
                    field888 = 4;
                }
            }
            if (field888 == 4) {
                if (var2.field3704 < 8) {
                    int var8 = var1.method3244();
                    if (var8 > 8 - var2.field3704) {
                        var8 = 8 - var2.field3704;
                    }
                    if (var8 > 0) {
                        var1.method3227(var2.field3701, var2.field3704, var8);
                        var2.field3704 += var8;
                    }
                }
                if (var2.field3704 == 8) {
                    var2.field3704 = 0;
                    Statics.field587 = var2.method5221();
                    field888 = 5;
                }
            }
            if (field888 == 5) {
                field828.field1293.field3704 = 0;
                field828.method2058();
                class299 var9 = new class299(500);
                int[] var10 = new int[] { Statics.field12.nextInt(), Statics.field12.nextInt(), Statics.field12.nextInt(), Statics.field12.nextInt() };
                var9.field3704 = 0;
                var9.method5083(1);
                var9.method5166(var10[0]);
                var9.method5166(var10[1]);
                var9.method5166(var10[2]);
                var9.method5166(var10[3]);
                var9.method5239(Statics.field587);
                if (field632 == 40) {
                    var9.method5166(Statics.field2366[0]);
                    var9.method5166(Statics.field2366[1]);
                    var9.method5166(Statics.field2366[2]);
                    var9.method5166(Statics.field2366[3]);
                } else {
                    var9.method5083(field871.method34());
                    switch(field871.field1987) {
                        case 0:
                        case 1:
                            var9.method5188(Statics.field501);
                            var9.field3704++;
                            break;
                        case 2:
                            LinkedHashMap var12 = Statics.field69.field1031;
                            String var13 = class86.field1168;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5166((Integer) var12.get(var15));
                            break;
                        case 3:
                            var9.field3704 += 4;
                    }
                    var9.method5083(class313.field3811.method34());
                    var9.method5043(class86.field1156);
                }
                var9.method5074(class84.field1139, class84.field1138);
                Statics.field2366 = var10;
                class188 var18 = class188.method17();
                var18.field2321.field3704 = 0;
                if (field632 == 40) {
                    var18.field2321.method5083(class185.field2293.field2295);
                } else {
                    var18.field2321.method5083(class185.field2296.field2295);
                }
                var18.field2321.method5037(0);
                int var19 = var18.field2321.field3704;
                var18.field2321.method5166(182);
                var18.field2321.method5166(1);
                var18.field2321.method5083(field671);
                var18.field2321.method5158(var9.field3701, 0, var9.field3704);
                int var20 = var18.field2321.field3704;
                var18.field2321.method5043(class86.field1168);
                var18.field2321.method5083((field838 ? 1 : 0) << 1 | (field829 ? 1 : 0));
                var18.field2321.method5037(Statics.field3255);
                var18.field2321.method5037(Statics.field256);
                method2605(var18.field2321);
                var18.field2321.method5043(Statics.field2038);
                var18.field2321.method5166(Statics.field1415);
                class300 var21 = new class300(Statics.field990.method5751());
                Statics.field990.method5752(var21);
                var18.field2321.method5158(var21.field3701, 0, var21.field3701.length);
                var18.field2321.method5083(field671);
                var18.field2321.method5166(0);
                var18.field2321.method5166(Statics.field875.field3118);
                var18.field2321.method5166(Statics.field3541.field3118);
                var18.field2321.method5166(Statics.field985.field3118);
                var18.field2321.method5166(Statics.field1957.field3118);
                var18.field2321.method5166(Statics.field226.field3118);
                var18.field2321.method5166(Statics.field200.field3118);
                var18.field2321.method5166(Statics.field47.field3118);
                var18.field2321.method5166(Statics.field409.field3118);
                var18.field2321.method5166(Statics.field11.field3118);
                var18.field2321.method5166(Statics.field196.field3118);
                var18.field2321.method5166(Statics.field1923.field3118);
                var18.field2321.method5166(Statics.field168.field3118);
                var18.field2321.method5166(Statics.field440.field3118);
                var18.field2321.method5166(Statics.field263.field3118);
                var18.field2321.method5166(Statics.field270.field3118);
                var18.field2321.method5166(Statics.field39.field3118);
                var18.field2321.method5166(0);
                var18.field2321.method5166(Statics.field179.field3118);
                var18.field2321.method5166(Statics.field333.field3118);
                var18.field2321.method5166(Statics.field1424.field3118);
                var18.field2321.method5166(Statics.field1263.field3118);
                var18.field2321.method5072(var10, var20, var18.field2321.field3704);
                var18.field2321.method5048(var18.field2321.field3704 - var19);
                field828.method2049(var18);
                field828.method2048();
                field828.field1300 = new class328(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method4993(var22);
                field888 = 6;
            }
            if (field888 == 6 && var1.method3244() > 0) {
                int var24 = var1.method3251();
                if (var24 == 21 && field632 == 20) {
                    field888 = 9;
                } else if (var24 == 2) {
                    field888 = 11;
                } else if (var24 == 15 && field632 == 40) {
                    field828.field1290 = -1;
                    field888 = 16;
                } else if (var24 == 64) {
                    field888 = 7;
                } else if (var24 == 23 && field660 < 1) {
                    field660++;
                    field888 = 0;
                } else if (var24 == 29) {
                    field888 = 14;
                } else {
                    method1111(var24);
                    return;
                }
            }
            if (field888 == 7 && var1.method3244() > 0) {
                Statics.field184 = var1.method3251();
                field888 = 8;
            }
            if (field888 == 8 && var1.method3244() >= Statics.field184) {
                var1.method3227(var2.field3701, 0, Statics.field184);
                var2.field3704 = 0;
                field888 = 6;
            }
            if (field888 == 9 && var1.method3244() > 0) {
                field661 = (var1.method3251() + 3) * 60;
                field888 = 10;
            }
            if (field888 == 10) {
                field659 = 0;
                class86.method1110(class225.field2780, class225.field2781, field661 / 60 + class225.field2782);
                if (--field661 <= 0) {
                    field888 = 0;
                }
            } else {
                if (field888 == 11 && var1.method3244() >= 1) {
                    Statics.field426 = var1.method3251();
                    field888 = 12;
                }
                if (field888 == 12 && var1.method3244() >= Statics.field426) {
                    boolean var25 = var1.method3251() == 1;
                    var1.method3227(var2.field3701, 0, 4);
                    var2.field3704 = 0;
                    boolean var26 = false;
                    if (var25) {
                        int var27 = var2.method5024() << 24;
                        int var28 = var27 | var2.method5024() << 16;
                        int var29 = var28 | var2.method5024() << 8;
                        int var30 = var29 | var2.method5024();
                        String var31 = class86.field1168;
                        int var32 = var31.length();
                        int var33 = 0;
                        int var34 = 0;
                        while (true) {
                            if (var34 >= var32) {
                                if (Statics.field69.field1031.size() >= 10 && !Statics.field69.field1031.containsKey(var33)) {
                                    Iterator var37 = Statics.field69.field1031.entrySet().iterator();
                                    var37.next();
                                    var37.remove();
                                }
                                Statics.field69.field1031.put(var33, var30);
                                break;
                            }
                            var33 = (var33 << 5) - var33 + var31.charAt(var34);
                            var34++;
                        }
                    }
                    if (field663) {
                        Statics.field69.field1033 = class86.field1168;
                    } else {
                        Statics.field69.field1033 = null;
                    }
                    class74.method135();
                    field793 = var1.method3251();
                    field795 = var1.method3251() == 1;
                    field741 = var1.method3251();
                    field741 <<= 0x8;
                    field741 += var1.method3251();
                    field742 = var1.method3251();
                    var1.method3227(var2.field3701, 0, 1);
                    var2.field3704 = 0;
                    class183[] var38 = class183.method1017();
                    int var39 = var2.method4998();
                    if (var39 < 0 || var39 >= var38.length) {
                        throw new IOException(var39 + " " + var2.field3704);
                    }
                    field828.field1291 = var38[var39];
                    field828.field1290 = field828.field1291.field2110;
                    var1.method3227(var2.field3701, 0, 2);
                    var2.field3704 = 0;
                    field828.field1290 = var2.method5054();
                    try {
                        client var40 = Statics.field260;
                        JSObject.getWindow(var40).call("zap", (Object[]) null);
                    } catch (Throwable var58) {
                    }
                    field888 = 13;
                }
                if (field888 != 13) {
                    if (field888 == 14 && var1.method3244() >= 2) {
                        var2.field3704 = 0;
                        var1.method3227(var2.field3701, 0, 2);
                        var2.field3704 = 0;
                        Statics.field60 = var2.method5054();
                        field888 = 15;
                    }
                    if (field888 == 15 && var1.method3244() >= Statics.field60) {
                        var2.field3704 = 0;
                        var1.method3227(var2.field3701, 0, Statics.field60);
                        var2.field3704 = 0;
                        String var53 = var2.method5150();
                        String var54 = var2.method5150();
                        String var55 = var2.method5150();
                        class86.method1110(var53, var54, var55);
                        method2603(10);
                    }
                    if (field888 == 16) {
                        if (field828.field1290 == -1) {
                            if (var1.method3244() < 2) {
                                return;
                            }
                            var1.method3227(var2.field3701, 0, 2);
                            var2.field3704 = 0;
                            field828.field1290 = var2.method5054();
                        }
                        if (var1.method3244() >= field828.field1290) {
                            var1.method3227(var2.field3701, 0, field828.field1290);
                            var2.field3704 = 0;
                            int var56 = field828.field1290;
                            field762.method4584();
                            method551();
                            class90.method970(var2);
                            if (var2.field3704 != var56) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field659++;
                        if (field659 > 2000) {
                            if (field660 < 1) {
                                if (Statics.field497 == Statics.field165) {
                                    Statics.field497 = Statics.field1597;
                                } else {
                                    Statics.field497 = Statics.field165;
                                }
                                field660++;
                                field888 = 0;
                            } else {
                                method1111(-3);
                            }
                        }
                    }
                } else if (var1.method3244() >= field828.field1290) {
                    var2.field3704 = 0;
                    var1.method3227(var2.field3701, 0, field828.field1290);
                    field762.method4583();
                    field768 = 1L;
                    Statics.field2344.field572 = 0;
                    Statics.field22 = true;
                    field640 = true;
                    field848 = -1L;
                    class97.field1303 = new class261();
                    field828.method2058();
                    field828.field1293.field3704 = 0;
                    field828.field1291 = null;
                    field828.field1296 = null;
                    field828.field1297 = null;
                    field828.field1292 = null;
                    field828.field1290 = 0;
                    field828.field1294 = 0;
                    field658 = 0;
                    field672 = 0;
                    field643 = 0;
                    field761 = 0;
                    field760 = false;
                    class55.field454 = 0;
                    class92.method3735();
                    field777 = 0;
                    field779 = false;
                    field748 = 0;
                    field694 = 0;
                    field781 = 0;
                    Statics.field1922 = null;
                    field856 = 0;
                    field652 = -1;
                    field885 = 0;
                    field855 = 0;
                    field651 = class85.field1142;
                    field699 = class85.field1142;
                    field667 = 0;
                    class90.method1878();
                    for (int var42 = 0; var42 < 2048; var42++) {
                        field740[var42] = null;
                    }
                    for (int var43 = 0; var43 < 32768; var43++) {
                        field746[var43] = null;
                    }
                    field674 = -1;
                    field754.method4473();
                    field755.method4473();
                    for (int var44 = 0; var44 < 4; var44++) {
                        for (int var45 = 0; var45 < 104; var45++) {
                            for (int var46 = 0; var46 < 104; var46++) {
                                field752[var44][var45][var46] = null;
                            }
                        }
                    }
                    field879 = new class262();
                    Statics.field265.method1672();
                    for (int var47 = 0; var47 < Statics.field3187; var47++) {
                        class241 var48 = class241.method157(var47);
                        if (var48 != null) {
                            class213.field2507[var47] = 0;
                            class213.field2503[var47] = 0;
                        }
                    }
                    Statics.field389.method1965();
                    field794 = -1;
                    if (field700 != -1) {
                        class218.method3048(field700);
                    }
                    for (class62 var49 = (class62) field854.method5432(); var49 != null; var49 = (class62) field854.method5433()) {
                        method3974(var49, true);
                    }
                    field700 = -1;
                    field854 = new class318(8);
                    field790 = null;
                    field761 = 0;
                    field760 = false;
                    field822.method3665((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var50 = 0; var50 < 8; var50++) {
                        field668[var50] = null;
                        field749[var50] = false;
                    }
                    class60.field521 = new class318(32);
                    field665 = true;
                    for (int var51 = 0; var51 < 100; var51++) {
                        field704[var51] = true;
                    }
                    method507();
                    Statics.field902 = null;
                    for (int var52 = 0; var52 < 8; var52++) {
                        field891[var52] = new class10();
                    }
                    Statics.field10 = null;
                    class90.method970(var2);
                    Statics.field87 = -1;
                    Statics.method1561(false, var2);
                    field828.field1291 = null;
                }
            }
        } catch (IOException var59) {
            if (field660 < 1) {
                if (Statics.field497 == Statics.field165) {
                    Statics.field497 = Statics.field1597;
                } else {
                    Statics.field497 = Statics.field165;
                }
                field660++;
                field888 = 0;
            } else {
                method1111(-2);
            }
        }
    }

    @ObfuscatedName("ar.ew(I)V")
    public static void method551() {
        field828.method2058();
        field828.field1293.field3704 = 0;
        field828.field1291 = null;
        field828.field1296 = null;
        field828.field1297 = null;
        field828.field1292 = null;
        field828.field1290 = 0;
        field828.field1294 = 0;
        field658 = 0;
        field761 = 0;
        field760 = false;
        field856 = 0;
        field885 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field740[var0] = null;
        }
        Statics.field177 = null;
        for (int var1 = 0; var1 < field746.length; var1++) {
            class80 var2 = field746[var1];
            if (var2 != null) {
                var2.field925 = -1;
                var2.field946 = false;
            }
        }
        class60.field521 = new class318(32);
        method2603(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field704[var3] = true;
        }
        method507();
    }

    @ObfuscatedName("br.ev(IB)V")
    public static void method1111(int arg0) {
        if (arg0 == -3) {
            class86.method1110(class225.field2783, class225.field2784, class225.field2785);
        } else if (arg0 == -2) {
            class86.method1110(class225.field3026, class225.field2787, class225.field2788);
        } else if (arg0 == -1) {
            class86.method1110(class225.field2852, class225.field2790, class225.field2834);
        } else if (arg0 == 3) {
            class86.field1163 = 3;
            class86.field1162 = 1;
        } else if (arg0 == 4) {
            class86.field1163 = 12;
            class86.field1161 = 0;
        } else if (arg0 == 5) {
            class86.field1162 = 2;
            class86.method1110(class225.field2795, class225.field2771, class225.field2797);
        } else if (arg0 == 68 || !(field631 || arg0 != 6)) {
            class86.method1110(class225.field2828, class225.field3016, class225.field2800);
        } else if (arg0 == 7) {
            class86.method1110(class225.field2978, class225.field2802, class225.field2803);
        } else if (arg0 == 8) {
            class86.method1110(class225.field2804, class225.field2840, class225.field2999);
        } else if (arg0 == 9) {
            class86.method1110(class225.field2751, class225.field2808, class225.field2809);
        } else if (arg0 == 10) {
            class86.method1110(class225.field2846, class225.field2811, class225.field2812);
        } else if (arg0 == 11) {
            class86.method1110(class225.field2756, class225.field2814, class225.field2841);
        } else if (arg0 == 12) {
            class86.method1110(class225.field2985, class225.field2817, class225.field2818);
        } else if (arg0 == 13) {
            class86.method1110(class225.field2984, class225.field2820, class225.field2821);
        } else if (arg0 == 14) {
            class86.method1110(class225.field2865, class225.field2823, class225.field2824);
        } else if (arg0 == 16) {
            class86.method1110(class225.field2914, class225.field2967, class225.field2827);
        } else if (arg0 == 17) {
            class86.method1110(class225.field2925, class225.field2807, class225.field2891);
        } else if (arg0 == 18) {
            class86.field1163 = 12;
            class86.field1161 = 1;
        } else if (arg0 == 19) {
            class86.method1110(class225.field2899, class225.field2835, class225.field2836);
        } else if (arg0 == 20) {
            class86.method1110(class225.field2837, class225.field2838, class225.field2903);
        } else if (arg0 == 22) {
            class86.method1110(class225.field2966, class225.field2850, class225.field2842);
        } else if (arg0 == 23) {
            class86.method1110(class225.field2843, class225.field2844, class225.field2792);
        } else if (arg0 == 24) {
            class86.method1110(class225.field2869, class225.field2830, class225.field2848);
        } else if (arg0 == 25) {
            class86.method1110(class225.field2849, class225.field2839, class225.field2851);
        } else if (arg0 == 26) {
            class86.method1110(class225.field3013, class225.field2853, class225.field2854);
        } else if (arg0 == 27) {
            class86.method1110(class225.field2855, class225.field2856, class225.field2857);
        } else if (arg0 == 31) {
            class86.method1110(class225.field2864, class225.field2747, class225.field3027);
        } else if (arg0 == 32) {
            class86.method1110(class225.field2867, class225.field2868, class225.field3001);
        } else if (arg0 == 37) {
            class86.method1110(class225.field2819, class225.field2871, class225.field2872);
        } else if (arg0 == 38) {
            class86.method1110(class225.field2873, class225.field2874, class225.field2769);
        } else if (arg0 == 55) {
            class86.field1163 = 8;
        } else if (arg0 == 56) {
            class86.method1110(class225.field2880, class225.field2996, class225.field2910);
            method2603(11);
            return;
        } else if (arg0 == 57) {
            class86.method1110(class225.field2883, class225.field2884, class225.field2885);
            method2603(11);
            return;
        } else if (arg0 == 61) {
            class86.field1163 = 7;
        } else {
            class86.method1110(class225.field2886, class225.field2887, class225.field2888);
        }
        method2603(10);
    }

    @ObfuscatedName("bf.fz(B)V")
    public static final void method1059() {
        field828.method2056();
        method12();
        Statics.field619.method2939();
        for (int var0 = 0; var0 < 4; var0++) {
            field892[var0].method3254();
        }
        System.gc();
        class198.method670(2);
        field858 = -1;
        field859 = false;
        for (class76 var1 = (class76) class76.field1060.method4480(); var1 != null; var1 = (class76) class76.field1060.method4491()) {
            if (var1.field1062 != null) {
                Statics.field3576.method2109(var1.field1062);
                var1.field1062 = null;
            }
            if (var1.field1052 != null) {
                Statics.field3576.method2109(var1.field1052);
                var1.field1052 = null;
            }
        }
        class76.field1060.method4473();
        method2603(10);
    }

    @ObfuscatedName("cf.fd(II)V")
    public static final void method1882(int arg0) {
        method1059();
        switch(arg0) {
            case 1:
                class86.method1560();
                break;
            case 2:
                class86.field1163 = 24;
                class86.method1110(class225.field2997, class225.field2975, class225.field2976);
        }
    }

    @ObfuscatedName("j.fi(B)V")
    public static final void method12() {
        class258.field3481.method3068();
        class245.field3237.method3068();
        class246.field3246.method3068();
        class254.method4885();
        class257.method976();
        class255.method2518();
        class259.field3494.method3068();
        class259.field3495.method3068();
        class244.method1923();
        class249.method107();
        class241.method723();
        class253.method154();
        class247.method3948();
        class251.field3293.method3068();
        Statics.method137();
        Statics.method266();
        class215.field2526.method3068();
        class218.method136();
        ((class120) Statics.field1764).method2497();
        class93.field1255.method3068();
        Statics.field875.method3780();
        Statics.field3541.method3780();
        Statics.field1957.method3780();
        Statics.field226.method3780();
        Statics.field200.method3780();
        Statics.field47.method3780();
        Statics.field409.method3780();
        Statics.field11.method3780();
        Statics.field196.method3780();
        Statics.field1923.method3780();
        Statics.field168.method3780();
        Statics.field440.method3780();
    }

    @ObfuscatedName("i.ff(I)V")
    public static final void method18() {
        if (field672 > 0) {
            method1059();
        } else {
            field762.method4581();
            method2603(40);
            Statics.field3846 = field828.method2055();
            field828.method2070();
        }
    }

    @ObfuscatedName("av.fn(ZI)V")
    public static final void method300(boolean arg0) {
        if (arg0) {
            field871 = class86.field1172 ? class161.field1983 : class161.field1984;
            return;
        }
        LinkedHashMap var1 = Statics.field69.field1031;
        String var2 = class86.field1168;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field871 = var1.containsKey(var4) ? class161.field1989 : class161.field1985;
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1491() {
        if (field658 > 1) {
            field658--;
        }
        if (field672 > 0) {
            field672--;
        }
        if (field673) {
            field673 = false;
            method18();
            return;
        }
        if (!field760) {
            method1655();
        }
        for (int var1 = 0; var1 < 100 && this.method1338(field828); var1++) {
        }
        if (field632 != 30) {
            return;
        }
        while (class97.method1840()) {
            class188 var2 = class188.method1879(class184.field2286, field828.field1300);
            var2.field2321.method5083(0);
            int var3 = var2.field2321.field3704;
            class97.method1005(var2.field2321);
            var2.field2321.method5241(var2.field2321.field3704 - var3);
            field828.method2049(var2);
        }
        if (field762.field3561) {
            class188 var4 = class188.method1879(class184.field2196, field828.field1300);
            var4.field2321.method5083(0);
            int var5 = var4.field2321.field3704;
            field762.method4586(var4.field2321);
            var4.field2321.method5241(var4.field2321.field3704 - var5);
            field828.method2049(var4);
            field762.method4608();
        }
        Object var6 = Statics.field2344.field564;
        synchronized (Statics.field2344.field564) {
            if (!field784) {
                Statics.field2344.field572 = 0;
            } else if (class55.field462 != 0 || Statics.field2344.field572 >= 40) {
                class188 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2344.field572 && (var7 == null || var7.field2321.field3704 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2344.field566[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2344.field565[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field839 != var14 || field638 != var13) {
                        if (var7 == null) {
                            var7 = class188.method1879(class184.field2220, field828.field1300);
                            var7.field2321.method5083(0);
                            var8 = var7.field2321.field3704;
                            var7.field2321.field3704 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field890 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field839;
                            var16 = var13 - field638;
                            var17 = (int) ((Statics.field2344.field567[var12] - field890) / 20L);
                            var10 = (int) ((Statics.field2344.field567[var12] - field890) % 20L + (long) var10);
                        }
                        field839 = var14;
                        field638 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2321.method5037((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2321.method5083(var17 + 128);
                            var7.field2321.method5037((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2321.method5083(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2321.method5166(Integer.MIN_VALUE);
                            } else {
                                var7.field2321.method5166(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2321.method5037((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2321.method5166(Integer.MIN_VALUE);
                            } else {
                                var7.field2321.method5166(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field890 = Statics.field2344.field567[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2321.method5241(var7.field2321.field3704 - var8);
                    int var18 = var7.field2321.field3704;
                    var7.field2321.field3704 = var8;
                    var7.field2321.method5083(var10 / var11);
                    var7.field2321.method5083(var10 % var11);
                    var7.field2321.field3704 = var18;
                    field828.method2049(var7);
                }
                if (var9 >= Statics.field2344.field572) {
                    Statics.field2344.field572 = 0;
                } else {
                    Statics.field2344.field572 -= var9;
                    System.arraycopy(Statics.field2344.field565, var9, Statics.field2344.field565, 0, Statics.field2344.field572);
                    System.arraycopy(Statics.field2344.field566, var9, Statics.field2344.field566, 0, Statics.field2344.field572);
                    System.arraycopy(Statics.field2344.field567, var9, Statics.field2344.field567, 0, Statics.field2344.field572);
                }
            }
        }
        if (class55.field462 == 1 || !Statics.field1048 && class55.field462 == 4 || class55.field462 == 2) {
            long var20 = (class55.field470 - field768 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field768 = class55.field470 * -1L;
            int var22 = class55.field469;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field256) {
                var22 = Statics.field256;
            }
            int var23 = class55.field468;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field3255) {
                var23 = Statics.field3255;
            }
            int var24 = (int) var20;
            class188 var25 = class188.method1879(class184.field2227, field828.field1300);
            var25.field2321.method5037((var24 << 1) + (class55.field462 == 2 ? 1 : 0));
            var25.field2321.method5037(var23);
            var25.field2321.method5037(var22);
            field828.method2049(var25);
        }
        if (class46.field381 > 0) {
            class188 var26 = class188.method1879(class184.field2253, field828.field1300);
            var26.field2321.method5037(0);
            int var27 = var26.field2321.field3704;
            long var28 = class297.method4369();
            for (int var30 = 0; var30 < class46.field381; var30++) {
                long var31 = var28 - field848;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field848 = var28;
                var26.field2321.method5189(class46.field380[var30]);
                var26.field2321.method5188((int) var31);
            }
            var26.field2321.method5048(var26.field2321.field3704 - var27);
            field828.method2049(var26);
        }
        if (field713 > 0) {
            field713--;
        }
        if (class46.field374[96] || class46.field374[97] || class46.field374[98] || class46.field374[99]) {
            field709 = true;
        }
        if (field709 && field713 <= 0) {
            field713 = 20;
            field709 = false;
            class188 var33 = class188.method1879(class184.field2225, field828.field1300);
            var33.field2321.method5076(field693);
            var33.field2321.method5086(field694);
            field828.method2049(var33);
        }
        if (Statics.field22 && !field640) {
            field640 = true;
            class188 var34 = class188.method1879(class184.field2259, field828.field1300);
            var34.field2321.method5083(1);
            field828.method2049(var34);
        }
        if (!Statics.field22 && field640) {
            field640 = false;
            class188 var35 = class188.method1879(class184.field2259, field828.field1300);
            var35.field2321.method5083(0);
            field828.method2049(var35);
        }
        if (Statics.field290 != null) {
            Statics.field290.method5776();
        }
        if (Statics.field85) {
            if (Statics.field902 != null) {
                Statics.field902.method4672();
            }
            for (int var36 = 0; var36 < class90.field1230; var36++) {
                class67 var37 = field740[class90.field1225[var36]];
                var37.method1093();
            }
            Statics.field85 = false;
        }
        method110();
        if (field632 != 30) {
            return;
        }
        method2606();
        int var10002;
        for (int var38 = 0; var38 < field748; var38++) {
            var10002 = field865[var38]--;
            if (field865[var38] >= -10) {
                class102 var40 = field629[var38];
                if (var40 == null) {
                    class102 var10000 = (class102) null;
                    var40 = class102.method2146(Statics.field226, field863[var38], 0);
                    if (var40 == null) {
                        continue;
                    }
                    field865[var38] += var40.method2147();
                    field629[var38] = var40;
                }
                if (field865[var38] < 0) {
                    int var47;
                    if (field866[var38] == 0) {
                        var47 = field860;
                    } else {
                        int var41 = (field866[var38] & 0xFF) * 128;
                        int var42 = field866[var38] >> 16 & 0xFF;
                        int var43 = var42 * 128 + 64 - Statics.field177.field957;
                        if (var43 < 0) {
                            var43 = -var43;
                        }
                        int var44 = field866[var38] >> 8 & 0xFF;
                        int var45 = var44 * 128 + 64 - Statics.field177.field918;
                        if (var45 < 0) {
                            var45 = -var45;
                        }
                        int var46 = var43 + var45 - 128;
                        if (var46 > var41) {
                            field865[var38] = -100;
                            continue;
                        }
                        if (var46 < 0) {
                            var46 = 0;
                        }
                        var47 = field861 * (var41 - var46) / var41;
                    }
                    if (var47 > 0) {
                        class104 var48 = var40.method2137().method2182(Statics.field3274);
                        class114 var49 = class114.method2309(var48, 100, var47);
                        var49.method2312(field712[var38] - 1);
                        Statics.field3576.method2103(var49);
                    }
                    field865[var38] = -100;
                }
            } else {
                field748--;
                for (int var39 = var38; var39 < field748; var39++) {
                    field863[var39] = field863[var39 + 1];
                    field629[var39] = field629[var39 + 1];
                    field712[var39] = field712[var39 + 1];
                    field865[var39] = field865[var39 + 1];
                    field866[var39] = field866[var39 + 1];
                }
                var38--;
            }
        }
        if (field859) {
            boolean var50;
            if (class198.field2379 == 0) {
                var50 = Statics.field2382.method3405();
            } else {
                var50 = true;
            }
            if (!var50) {
                if (field857 != 0 && field858 != -1) {
                    class198.method3335(Statics.field47, field858, 0, field857, false);
                }
                field859 = false;
            }
        }
        field828.field1294++;
        if (field828.field1294 > 750) {
            method18();
            return;
        }
        int var51 = class90.field1230;
        int[] var52 = class90.field1225;
        for (int var53 = 0; var53 < var51; var53++) {
            class67 var54 = field740[var52[var53]];
            if (var54 != null) {
                method10(var54, 1);
            }
        }
        Statics.method250();
        method3153();
        field880++;
        if (field728 != 0) {
            field727 += 20;
            if (field727 >= 400) {
                field728 = 0;
            }
        }
        if (Statics.field979 != null) {
            field730++;
            if (field730 >= 15) {
                method1717(Statics.field979);
                Statics.field979 = null;
            }
        }
        class218 var55 = Statics.field585;
        class218 var56 = Statics.field199;
        Statics.field585 = null;
        Statics.field199 = null;
        field776 = null;
        field805 = false;
        field642 = false;
        field678 = 0;
        while (class46.method4883() && field678 < 128) {
            if (field793 >= 2 && class46.field374[82] && Statics.field1308 == 66) {
                String var57 = "";
                Iterator var58 = class92.field1246.iterator();
                while (var58.hasNext()) {
                    class65 var59 = (class65) var58.next();
                    var57 = var57 + var59.field576 + ':' + var59.field581 + '\n';
                }
                Statics.field260.method876(var57);
            } else if (field781 != 1 || Statics.field2500 <= 0) {
                field816[field678] = Statics.field1308;
                field846[field678] = Statics.field2500;
                field678++;
            }
        }
        boolean var62 = field793 >= 2;
        if (var62 && class46.field374[82] && class46.field374[81] && field897 != 0) {
            int var63 = Statics.field177.field611 - field897;
            if (var63 < 0) {
                var63 = 0;
            } else if (var63 > 3) {
                var63 = 3;
            }
            if (Statics.field177.field611 != var63) {
                method3027(Statics.field1299 + Statics.field177.field975[0], Statics.field2085 + Statics.field177.field945[0], var63, false);
            }
            field897 = 0;
        }
        if (field700 != -1) {
            method1016(field700, 0, 0, Statics.field3255, Statics.field256, 0, 0);
        }
        field809++;
        while (true) {
            class63 var64;
            class218 var65;
            class218 var66;
            do {
                var64 = (class63) field634.method4478();
                if (var64 == null) {
                    while (true) {
                        class63 var67;
                        class218 var68;
                        class218 var69;
                        do {
                            var67 = (class63) field825.method4478();
                            if (var67 == null) {
                                while (true) {
                                    class63 var70;
                                    class218 var71;
                                    class218 var72;
                                    do {
                                        var70 = (class63) field878.method4478();
                                        if (var70 == null) {
                                            this.method1165();
                                            if (Statics.field290 != null) {
                                                Statics.field290.method5782(Statics.field519, (Statics.field177.field957 >> 7) + Statics.field1299, (Statics.field177.field918 >> 7) + Statics.field2085, false);
                                                Statics.field290.method5926();
                                            }
                                            if (field797 != null) {
                                                this.method1489();
                                            }
                                            if (Statics.field2326 != null) {
                                                method1717(Statics.field2326);
                                                field691++;
                                                if (class55.field459 == 0) {
                                                    if (field868) {
                                                        if (Statics.field2731 == Statics.field2326 && field735 != field732) {
                                                            class218 var73 = Statics.field2326;
                                                            byte var74 = 0;
                                                            if (field789 == 1 && var73.field2551 == 206) {
                                                                var74 = 1;
                                                            }
                                                            if (var73.field2649[field735] <= 0) {
                                                                var74 = 0;
                                                            }
                                                            int var75 = method4095(var73);
                                                            boolean var76 = (var75 >> 29 & 0x1) != 0;
                                                            if (var76) {
                                                                int var77 = field732;
                                                                int var78 = field735;
                                                                var73.field2649[var78] = var73.field2649[var77];
                                                                var73.field2672[var78] = var73.field2672[var77];
                                                                var73.field2649[var77] = -1;
                                                                var73.field2672[var77] = 0;
                                                            } else if (var74 == 1) {
                                                                int var79 = field732;
                                                                int var80 = field735;
                                                                while (var79 != var80) {
                                                                    if (var79 > var80) {
                                                                        var73.method3691(var79 - 1, var79);
                                                                        var79--;
                                                                    } else if (var79 < var80) {
                                                                        var73.method3691(var79 + 1, var79);
                                                                        var79++;
                                                                    }
                                                                }
                                                            } else {
                                                                var73.method3691(field735, field732);
                                                            }
                                                            class188 var81 = class188.method1879(class184.field2266, field828.field1300);
                                                            var81.field2321.method5037(field735);
                                                            var81.field2321.method5086(field732);
                                                            var81.field2321.method5166(Statics.field2326.field2658);
                                                            var81.field2321.method5189(var74);
                                                            field828.method2049(var81);
                                                        }
                                                    } else if (this.method1127()) {
                                                        this.method1128(field733, field745);
                                                    } else if (field761 > 0) {
                                                        int var82 = field733;
                                                        int var83 = field745;
                                                        class83 var84 = Statics.field6;
                                                        method1937(var84.field1129, var84.field1128, var84.field1135, var84.field1136, var84.field1131, var84.field1131, var82, var83);
                                                        Statics.field6 = null;
                                                    }
                                                    field730 = 10;
                                                    class55.field462 = 0;
                                                    Statics.field2326 = null;
                                                } else if (field691 >= 5 && (class55.field464 > field733 + 5 || class55.field464 < field733 - 5 || class55.field461 > field745 + 5 || class55.field461 < field745 - 5)) {
                                                    field868 = true;
                                                }
                                            }
                                            if (class134.method2867()) {
                                                int var85 = class134.field1816;
                                                int var86 = class134.field1789;
                                                class188 var87 = class188.method1879(class184.field2282, field828.field1300);
                                                var87.field2321.method5083(5);
                                                var87.field2321.method5087(Statics.field2085 + var86);
                                                var87.field2321.method5087(Statics.field1299 + var85);
                                                var87.field2321.method5077(class46.field374[82] ? (class46.field374[81] ? 2 : 1) : 0);
                                                field828.method2049(var87);
                                                class134.method2868();
                                                field725 = class55.field468;
                                                field847 = class55.field469;
                                                field728 = 1;
                                                field727 = 0;
                                                field885 = var85;
                                                field855 = var86;
                                            }
                                            if (Statics.field585 != var55) {
                                                if (var55 != null) {
                                                    method1717(var55);
                                                }
                                                if (Statics.field585 != null) {
                                                    method1717(Statics.field585);
                                                }
                                            }
                                            if (Statics.field199 != var56 && field849 == field775) {
                                                if (var56 != null) {
                                                    method1717(var56);
                                                }
                                                if (Statics.field199 != null) {
                                                    method1717(Statics.field199);
                                                }
                                            }
                                            if (Statics.field199 == null) {
                                                if (field775 > 0) {
                                                    field775--;
                                                }
                                            } else if (field775 < field849) {
                                                field775++;
                                                if (field849 == field775) {
                                                    method1717(Statics.field199);
                                                }
                                            }
                                            method3177();
                                            if (field708) {
                                                method256();
                                            }
                                            for (int var88 = 0; var88 < 5; var88++) {
                                                var10002 = field873[var88]++;
                                            }
                                            Statics.field389.method1969();
                                            int var89 = Statics.method3155();
                                            int var90 = class46.method2826();
                                            if (var89 > 15000 && var90 > 15000) {
                                                field672 = 250;
                                                class55.field454 = 14500;
                                                class188 var91 = class188.method1879(class184.field2235, field828.field1300);
                                                field828.method2049(var91);
                                            }
                                            Statics.field265.method1671();
                                            field828.field1298++;
                                            if (field828.field1298 > 50) {
                                                class188 var92 = class188.method1879(class184.field2208, field828.field1300);
                                                field828.method2049(var92);
                                            }
                                            try {
                                                field828.method2048();
                                            } catch (IOException var94) {
                                                method18();
                                            }
                                            return;
                                        }
                                        var71 = var70.field548;
                                        if (var71.field2558 < 0) {
                                            break;
                                        }
                                        var72 = class218.method3998(var71.field2575);
                                    } while (var72 == null || var72.field2677 == null || var71.field2558 >= var72.field2677.length || var72.field2677[var71.field2558] != var71);
                                    class77.method1875(var70);
                                }
                            }
                            var68 = var67.field548;
                            if (var68.field2558 < 0) {
                                break;
                            }
                            var69 = class218.method3998(var68.field2575);
                        } while (var69 == null || var69.field2677 == null || var68.field2558 >= var69.field2677.length || var69.field2677[var68.field2558] != var68);
                        class77.method1875(var67);
                    }
                }
                var65 = var64.field548;
                if (var65.field2558 < 0) {
                    break;
                }
                var66 = class218.method3998(var65.field2575);
            } while (var66 == null || var66.field2677 == null || var65.field2558 >= var66.field2677.length || var66.field2677[var65.field2558] != var65);
            class77.method1875(var64);
        }
    }

    @ObfuscatedName("w.fv(B)V")
    public static final void method212() {
        if (Statics.field1427 != null) {
            Statics.field1427.method2208();
        }
        if (Statics.field569 != null) {
            Statics.field569.method2208();
        }
    }

    @ObfuscatedName("ld.fy(Lij;IIII)V")
    public static void method5715(class259 arg0, int arg1, int arg2, int arg3) {
        if (field748 >= 50 || field861 == 0 || arg0.field3499 == null || arg1 >= arg0.field3499.length) {
            return;
        }
        int var4 = arg0.field3499[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field863[field748] = var5;
        field712[field748] = var6;
        field865[field748] = 0;
        field629[field748] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field866[field748] = (var8 << 16) + (var9 << 8) + var7;
        field748++;
    }

    @ObfuscatedName("f.fg(IIII)V")
    public static void method111(int arg0, int arg1, int arg2) {
        if (field860 == 0 || arg1 == 0 || field748 >= 50) {
            return;
        }
        field863[field748] = arg0;
        field712[field748] = arg1;
        field865[field748] = arg2;
        field629[field748] = null;
        field866[field748] = 0;
        field748++;
    }

    @ObfuscatedName("dh.ft(II)V")
    public static void method2277(int arg0) {
        if (arg0 == -1 && !field859) {
            Statics.field2382.method3404();
            class198.field2379 = 1;
            Statics.field195 = null;
        } else if (arg0 != -1 && field858 != arg0 && field857 != 0 && !field859) {
            class198.method1920(2, Statics.field47, arg0, 0, field857, false);
        }
        field858 = arg0;
    }

    @ObfuscatedName("bs.fu(IIB)V")
    public static void method1015(int arg0, int arg1) {
        if (field857 != 0 && arg0 != -1) {
            class198.method3335(Statics.field168, arg0, 0, field857, false);
            field859 = true;
        }
    }

    @ObfuscatedName("f.fh(B)V")
    public static final void method110() {
        if (Statics.field519 != field652) {
            field652 = Statics.field519;
            method235(Statics.field519);
        }
    }

    @ObfuscatedName("gp.fo(Lhp;III)V")
    public static final void method3502(class218 arg0, int arg1, int arg2) {
        if (field856 != 0 && field856 != 3 || field760 || !(class55.field462 == 1 || !Statics.field1048 && class55.field462 == 4)) {
            return;
        }
        class212 var3 = arg0.method3722(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field468 - arg1;
        int var5 = class55.field469 - arg2;
        if (!var3.method3620(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2498 / 2;
        int var7 = var5 - var3.field2501 / 2;
        int var8 = field694 & 0x7FF;
        int var9 = class131.field1767[var8];
        int var10 = class131.field1768[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field177.field957 + var11 >> 7;
        int var14 = Statics.field177.field918 - var12 >> 7;
        class188 var15 = class188.method1879(class184.field2238, field828.field1300);
        var15.field2321.method5083(18);
        var15.field2321.method5087(Statics.field2085 + var14);
        var15.field2321.method5087(Statics.field1299 + var13);
        var15.field2321.method5077(class46.field374[82] ? (class46.field374[81] ? 2 : 1) : 0);
        var15.field2321.method5083(var6);
        var15.field2321.method5083(var7);
        var15.field2321.method5037(field694);
        var15.field2321.method5083(57);
        var15.field2321.method5083(0);
        var15.field2321.method5083(0);
        var15.field2321.method5083(89);
        var15.field2321.method5037(Statics.field177.field957);
        var15.field2321.method5037(Statics.field177.field918);
        var15.field2321.method5083(63);
        field828.method2049(var15);
        field885 = var13;
        field855 = var14;
    }

    @ObfuscatedName("fd.fj(B)V")
    public static final void method3153() {
        int[] var0 = class90.field1225;
        for (int var1 = 0; var1 < class90.field1230; var1++) {
            class67 var2 = field740[var0[var1]];
            if (var2 != null && var2.field938 > 0) {
                var2.field938--;
                if (var2.field938 == 0) {
                    var2.field931 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field667; var3++) {
            int var4 = field808[var3];
            class80 var5 = field746[var4];
            if (var5 != null && var5.field938 > 0) {
                var5.field938--;
                if (var5.field938 == 0) {
                    var5.field931 = null;
                }
            }
        }
    }

    @ObfuscatedName("v.fp(B)V")
    public static final void method256() {
        int var0 = Statics.field1080 * 128 + 64;
        int var1 = Statics.field25 * 128 + 64;
        int var2 = method79(var0, var1, Statics.field519) - Statics.field130;
        if (Statics.field1894 < var0) {
            Statics.field1894 += Statics.field192 * (var0 - Statics.field1894) / 1000 + Statics.field143;
            if (Statics.field1894 > var0) {
                Statics.field1894 = var0;
            }
        }
        if (Statics.field1894 > var0) {
            Statics.field1894 -= Statics.field192 * (Statics.field1894 - var0) / 1000 + Statics.field143;
            if (Statics.field1894 < var0) {
                Statics.field1894 = var0;
            }
        }
        if (Statics.field2514 < var2) {
            Statics.field2514 += Statics.field192 * (var2 - Statics.field2514) / 1000 + Statics.field143;
            if (Statics.field2514 > var2) {
                Statics.field2514 = var2;
            }
        }
        if (Statics.field2514 > var2) {
            Statics.field2514 -= Statics.field192 * (Statics.field2514 - var2) / 1000 + Statics.field143;
            if (Statics.field2514 < var2) {
                Statics.field2514 = var2;
            }
        }
        if (Statics.field1966 < var1) {
            Statics.field1966 += Statics.field192 * (var1 - Statics.field1966) / 1000 + Statics.field143;
            if (Statics.field1966 > var1) {
                Statics.field1966 = var1;
            }
        }
        if (Statics.field1966 > var1) {
            Statics.field1966 -= Statics.field192 * (Statics.field1966 - var1) / 1000 + Statics.field143;
            if (Statics.field1966 < var1) {
                Statics.field1966 = var1;
            }
        }
        int var3 = Statics.field191 * 128 + 64;
        int var4 = Statics.field1933 * 128 + 64;
        int var5 = method79(var3, var4, Statics.field519) - Statics.field447;
        int var6 = var3 - Statics.field1894;
        int var7 = var5 - Statics.field2514;
        int var8 = var4 - Statics.field1966;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field356 < var10) {
            Statics.field356 += Statics.field606 * (var10 - Statics.field356) / 1000 + Statics.field35;
            if (Statics.field356 > var10) {
                Statics.field356 = var10;
            }
        }
        if (Statics.field356 > var10) {
            Statics.field356 -= Statics.field606 * (Statics.field356 - var10) / 1000 + Statics.field35;
            if (Statics.field356 < var10) {
                Statics.field356 = var10;
            }
        }
        int var12 = var11 - Statics.field334;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field334 += Statics.field606 * var12 / 1000 + Statics.field35;
            Statics.field334 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field334 -= Statics.field606 * -var12 / 1000 + Statics.field35;
            Statics.field334 &= 0x7FF;
        }
        int var13 = var11 - Statics.field334;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field334 = var11;
        }
    }

    @ObfuscatedName("fg.fm(I)V")
    public static final void method3177() {
        if (field781 == 0) {
            int var0 = Statics.field177.field957;
            int var1 = Statics.field177.field918;
            if (Statics.field1276 - var0 < -500 || Statics.field1276 - var0 > 500 || Statics.field1047 - var1 < -500 || Statics.field1047 - var1 > 500) {
                Statics.field1276 = var0;
                Statics.field1047 = var1;
            }
            if (Statics.field1276 != var0) {
                Statics.field1276 += (var0 - Statics.field1276) / 16;
            }
            if (Statics.field1047 != var1) {
                Statics.field1047 += (var1 - Statics.field1047) / 16;
            }
            int var2 = Statics.field1276 >> 7;
            int var3 = Statics.field1047 >> 7;
            int var4 = method79(Statics.field1276, Statics.field1047, Statics.field519);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field519;
                        if (var8 < 3 && (class56.field473[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class56.field472[var8][var6][var7];
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
            if (var10 > field636) {
                field636 += (var10 - field636) / 24;
            } else if (var10 < field636) {
                field636 += (var10 - field636) / 80;
            }
            Statics.field560 = method79(Statics.field177.field957, Statics.field177.field918, Statics.field519) - field867;
        } else if (field781 == 1) {
            method99();
            short var11 = -1;
            if (class46.field374[33]) {
                var11 = 0;
            } else if (class46.field374[49]) {
                var11 = 1024;
            }
            if (class46.field374[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class46.field374[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class46.field374[35]) {
                var12 = -1;
            } else if (class46.field374[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class46.field374[81] ? field705 : field840;
                var13 = var14 * 16;
                field702 = var11;
                field681 = var12;
            }
            if (field701 < var13) {
                field701 += var13 / 8;
                if (field701 > var13) {
                    field701 = var13;
                }
            } else if (field701 > var13) {
                field701 = field701 * 9 / 10;
            }
            if (field701 > 0) {
                int var15 = field701 / 16;
                if (field702 >= 0) {
                    int var16 = field702 - Statics.field334 & 0x7FF;
                    int var17 = class131.field1767[var16];
                    int var18 = class131.field1768[var16];
                    Statics.field1276 += var15 * var17 / 65536;
                    Statics.field1047 += var15 * var18 / 65536;
                }
                if (field681 != 0) {
                    Statics.field560 += field681 * var15;
                    if (Statics.field560 > 0) {
                        Statics.field560 = 0;
                    }
                }
            } else {
                field702 = -1;
                field681 = -1;
            }
            if (class46.field374[13]) {
                method198();
            }
        }
        if (class55.field459 == 4 && Statics.field1048) {
            int var19 = class55.field461 - field696;
            field869 = var19 * 2;
            field696 = var19 == -1 || var19 == 1 ? class55.field461 : (field696 + class55.field461) / 2;
            int var20 = field697 - class55.field464;
            field881 = var20 * 2;
            field697 = var20 == -1 || var20 == 1 ? class55.field464 : (field697 + class55.field464) / 2;
        } else {
            if (class46.field374[96]) {
                field881 += (-24 - field881) / 2;
            } else if (class46.field374[97]) {
                field881 += (24 - field881) / 2;
            } else {
                field881 /= 2;
            }
            if (class46.field374[98]) {
                field869 += (12 - field869) / 2;
            } else if (class46.field374[99]) {
                field869 += (-12 - field869) / 2;
            } else {
                field869 /= 2;
            }
            field696 = class55.field461;
            field697 = class55.field464;
        }
        field694 = field881 / 2 + field694 & 0x7FF;
        field693 += field869 / 2;
        if (field693 < 128) {
            field693 = 128;
        }
        if (field693 > 383) {
            field693 = 383;
        }
    }

    @ObfuscatedName("j.fq(Lbu;II)V")
    public static final void method10(class70 arg0, int arg1) {
        if (arg0.field942 > field635) {
            method952(arg0);
        } else if (arg0.field966 >= field635) {
            if (field635 == arg0.field966 || arg0.field924 == -1 || arg0.field954 != 0 || arg0.field953 + 1 > Statics.method3725(arg0.field924).field3498[arg0.field952]) {
                int var2 = arg0.field966 - arg0.field942;
                int var3 = field635 - arg0.field942;
                int var4 = arg0.field961 * 128 + arg0.field921 * 64;
                int var5 = arg0.field955 * 128 + arg0.field921 * 64;
                int var6 = arg0.field962 * 128 + arg0.field921 * 64;
                int var7 = arg0.field964 * 128 + arg0.field921 * 64;
                arg0.field957 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field918 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field977 = 0;
            arg0.field932 = arg0.field967;
            arg0.field919 = arg0.field932;
        } else {
            arg0.field980 = arg0.field917;
            if (arg0.field973 == 0) {
                arg0.field977 = 0;
            } else {
                label225: {
                    if (arg0.field924 != -1 && arg0.field954 == 0) {
                        class259 var8 = Statics.method3725(arg0.field924);
                        if (arg0.field948 > 0 && var8.field3507 == 0) {
                            arg0.field977++;
                            break label225;
                        }
                        if (arg0.field948 <= 0 && var8.field3506 == 0) {
                            arg0.field977++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field957;
                    int var10 = arg0.field918;
                    int var11 = arg0.field975[arg0.field973 - 1] * 128 + arg0.field921 * 64;
                    int var12 = arg0.field945[arg0.field973 - 1] * 128 + arg0.field921 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field932 = 1280;
                        } else if (var10 > var12) {
                            arg0.field932 = 1792;
                        } else {
                            arg0.field932 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field932 = 768;
                        } else if (var10 > var12) {
                            arg0.field932 = 256;
                        } else {
                            arg0.field932 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field932 = 1024;
                    } else if (var10 > var12) {
                        arg0.field932 = 0;
                    }
                    byte var13 = arg0.field976[arg0.field973 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field932 - arg0.field919 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field933;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field929;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field926;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field928;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field929;
                        }
                        arg0.field980 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class80) {
                            var17 = ((class80) arg0).field1104.field3452;
                        }
                        if (var17) {
                            if (arg0.field932 != arg0.field919 && arg0.field925 == -1 && arg0.field972 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field973 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field973 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field977 > 0 && arg0.field973 > 1) {
                                var16 = 8;
                                arg0.field977--;
                            }
                        } else {
                            if (arg0.field973 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field973 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field977 > 0 && arg0.field973 > 1) {
                                var16 = 8;
                                arg0.field977--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field980 == arg0.field929 && arg0.field930 != -1) {
                            arg0.field980 = arg0.field930;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field957 += var16;
                                if (arg0.field957 > var11) {
                                    arg0.field957 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field957 -= var16;
                                if (arg0.field957 < var11) {
                                    arg0.field957 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field918 += var16;
                                if (arg0.field918 > var12) {
                                    arg0.field918 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field918 -= var16;
                                if (arg0.field918 < var12) {
                                    arg0.field918 = var12;
                                }
                            }
                        }
                        if (arg0.field957 == var11 && arg0.field918 == var12) {
                            arg0.field973--;
                            if (arg0.field948 > 0) {
                                arg0.field948--;
                            }
                        }
                    } else {
                        arg0.field957 = var11;
                        arg0.field918 = var12;
                        arg0.field973--;
                        if (arg0.field948 > 0) {
                            arg0.field948--;
                        }
                    }
                }
            }
        }
        if (arg0.field957 < 128 || arg0.field918 < 128 || arg0.field957 >= 13184 || arg0.field918 >= 13184) {
            arg0.field924 = -1;
            arg0.field956 = -1;
            arg0.field942 = 0;
            arg0.field966 = 0;
            arg0.field957 = arg0.field975[0] * 128 + arg0.field921 * 64;
            arg0.field918 = arg0.field945[0] * 128 + arg0.field921 * 64;
            arg0.method1566();
        }
        if (Statics.field177 == arg0 && (arg0.field957 < 1536 || arg0.field918 < 1536 || arg0.field957 >= 11776 || arg0.field918 >= 11776)) {
            arg0.field924 = -1;
            arg0.field956 = -1;
            arg0.field942 = 0;
            arg0.field966 = 0;
            arg0.field957 = arg0.field975[0] * 128 + arg0.field921 * 64;
            arg0.field918 = arg0.field945[0] * 128 + arg0.field921 * 64;
            arg0.method1566();
        }
        method1055(arg0);
        method126(arg0);
    }

    @ObfuscatedName("bn.fe(Lbu;I)V")
    public static final void method952(class70 arg0) {
        int var1 = arg0.field942 - field635;
        int var2 = arg0.field961 * 128 + arg0.field921 * 64;
        int var3 = arg0.field955 * 128 + arg0.field921 * 64;
        arg0.field957 += (var2 - arg0.field957) / var1;
        arg0.field918 += (var3 - arg0.field918) / var1;
        arg0.field977 = 0;
        arg0.field932 = arg0.field967;
    }

    @ObfuscatedName("bf.fa(Lbu;I)V")
    public static final void method1055(class70 arg0) {
        if (arg0.field972 == 0) {
            return;
        }
        if (arg0.field925 != -1) {
            class70 var1 = null;
            if (arg0.field925 < 32768) {
                var1 = field746[arg0.field925];
            } else if (arg0.field925 >= 32768) {
                var1 = field740[arg0.field925 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field957 - var1.field957;
                int var3 = arg0.field918 - var1.field918;
                if (var2 != 0 || var3 != 0) {
                    arg0.field932 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field946) {
                arg0.field925 = -1;
                arg0.field946 = false;
            }
        }
        if (arg0.field947 != -1 && (arg0.field973 == 0 || arg0.field977 > 0)) {
            arg0.field932 = arg0.field947;
            arg0.field947 = -1;
        }
        int var4 = arg0.field932 - arg0.field919 & 0x7FF;
        if (var4 == 0 && arg0.field946) {
            arg0.field925 = -1;
            arg0.field946 = false;
        }
        if (var4 == 0) {
            arg0.field971 = 0;
            return;
        }
        arg0.field971++;
        if (var4 > 1024) {
            arg0.field919 -= arg0.field972;
            boolean var5 = true;
            if (var4 < arg0.field972 || var4 > 2048 - arg0.field972) {
                arg0.field919 = arg0.field932;
                var5 = false;
            }
            if (arg0.field980 == arg0.field917 && (arg0.field971 > 25 || var5)) {
                if (arg0.field970 == -1) {
                    arg0.field980 = arg0.field929;
                } else {
                    arg0.field980 = arg0.field970;
                }
            }
        } else {
            arg0.field919 += arg0.field972;
            boolean var6 = true;
            if (var4 < arg0.field972 || var4 > 2048 - arg0.field972) {
                arg0.field919 = arg0.field932;
                var6 = false;
            }
            if (arg0.field980 == arg0.field917 && (arg0.field971 > 25 || var6)) {
                if (arg0.field978 == -1) {
                    arg0.field980 = arg0.field929;
                } else {
                    arg0.field980 = arg0.field978;
                }
            }
        }
        arg0.field919 &= 0x7FF;
    }

    @ObfuscatedName("c.fl(Lbu;S)V")
    public static final void method126(class70 arg0) {
        arg0.field920 = false;
        if (arg0.field980 != -1) {
            class259 var1 = Statics.method3725(arg0.field980);
            if (var1 == null || var1.field3496 == null) {
                arg0.field980 = -1;
            } else {
                arg0.field950++;
                if (arg0.field949 < var1.field3496.length && arg0.field950 > var1.field3498[arg0.field949]) {
                    arg0.field950 = 1;
                    arg0.field949++;
                    method5715(var1, arg0.field949, arg0.field957, arg0.field918);
                }
                if (arg0.field949 >= var1.field3496.length) {
                    arg0.field950 = 0;
                    arg0.field949 = 0;
                    method5715(var1, arg0.field949, arg0.field957, arg0.field918);
                }
            }
        }
        if (arg0.field956 != -1 && field635 >= arg0.field959) {
            if (arg0.field923 < 0) {
                arg0.field923 = 0;
            }
            int var2 = class244.method1579(arg0.field956).field3229;
            if (var2 == -1) {
                arg0.field956 = -1;
            } else {
                class259 var3 = Statics.method3725(var2);
                if (var3 == null || var3.field3496 == null) {
                    arg0.field956 = -1;
                } else {
                    arg0.field958++;
                    if (arg0.field923 < var3.field3496.length && arg0.field958 > var3.field3498[arg0.field923]) {
                        arg0.field958 = 1;
                        arg0.field923++;
                        method5715(var3, arg0.field923, arg0.field957, arg0.field918);
                    }
                    if (arg0.field923 >= var3.field3496.length && (arg0.field923 < 0 || arg0.field923 >= var3.field3496.length)) {
                        arg0.field956 = -1;
                    }
                }
            }
        }
        if (arg0.field924 != -1 && arg0.field954 <= 1) {
            class259 var4 = Statics.method3725(arg0.field924);
            if (var4.field3507 == 1 && arg0.field948 > 0 && arg0.field942 <= field635 && arg0.field966 < field635) {
                arg0.field954 = 1;
                return;
            }
        }
        if (arg0.field924 != -1 && arg0.field954 == 0) {
            class259 var5 = Statics.method3725(arg0.field924);
            if (var5 == null || var5.field3496 == null) {
                arg0.field924 = -1;
            } else {
                arg0.field953++;
                if (arg0.field952 < var5.field3496.length && arg0.field953 > var5.field3498[arg0.field952]) {
                    arg0.field953 = 1;
                    arg0.field952++;
                    method5715(var5, arg0.field952, arg0.field957, arg0.field918);
                }
                if (arg0.field952 >= var5.field3496.length) {
                    arg0.field952 -= var5.field3500;
                    arg0.field965++;
                    if (arg0.field965 >= var5.field3503) {
                        arg0.field924 = -1;
                    } else if (arg0.field952 >= 0 && arg0.field952 < var5.field3496.length) {
                        method5715(var5, arg0.field952, arg0.field957, arg0.field918);
                    } else {
                        arg0.field924 = -1;
                    }
                }
                arg0.field920 = var5.field3502;
            }
        }
        if (arg0.field954 > 0) {
            arg0.field954--;
        }
    }

    @ObfuscatedName("jo.fk(Lbd;III)V")
    public static void method4758(class67 arg0, int arg1, int arg2) {
        if (arg0.field924 == arg1 && arg1 != -1) {
            int var3 = Statics.method3725(arg1).field3493;
            if (var3 == 1) {
                arg0.field952 = 0;
                arg0.field953 = 0;
                arg0.field954 = arg2;
                arg0.field965 = 0;
            }
            if (var3 == 2) {
                arg0.field965 = 0;
            }
        } else if (arg1 == -1 || arg0.field924 == -1 || Statics.method3725(arg1).field3509 >= Statics.method3725(arg0.field924).field3509) {
            arg0.field924 = arg1;
            arg0.field952 = 0;
            arg0.field953 = 0;
            arg0.field954 = arg2;
            arg0.field965 = 0;
            arg0.field948 = arg0.field973;
        }
    }

    @ObfuscatedName("ev.fr(I)I")
    public static int method3141() {
        return field838 ? 2 : 1;
    }

    @ObfuscatedName("hv.fb(II)V")
    public static void method3755(int arg0) {
        field837 = 0L;
        if (arg0 >= 2) {
            field838 = true;
        } else {
            field838 = false;
        }
        if (method3141() == 1) {
            Statics.field260.method740(765, 503);
        } else {
            Statics.field260.method740(7680, 2160);
        }
        if (field632 >= 25) {
            method507();
        }
    }

    @ObfuscatedName("ak.fw(B)V")
    public static void method507() {
        class188 var0 = class188.method1879(class184.field2221, field828.field1300);
        var0.field2321.method5083(method3141());
        var0.field2321.method5037(Statics.field3255);
        var0.field2321.method5037(Statics.field256);
        field828.method2049(var0);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method747() {
        field837 = class297.method4369() + 500L;
        this.method1521();
        if (field700 != -1) {
            this.method1129(true);
        }
    }

    @ObfuscatedName("client.gj(B)V")
    public void method1521() {
        int var1 = Statics.field3255;
        int var2 = Statics.field256;
        if (this.field449 < var1) {
            int var3 = this.field449;
        }
        if (this.field427 < var2) {
            int var4 = this.field427;
        }
        if (Statics.field69 != null) {
            try {
                class48.method672(Statics.field260, "resize", new Object[] { method3141() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gv(I)V")
    public final void method1124() {
        if (field700 != -1) {
            method3268(field700);
        }
        for (int var1 = 0; var1 < field827; var1++) {
            if (field704[var1]) {
                field830[var1] = true;
            }
            field831[var1] = field704[var1];
            field704[var1] = false;
        }
        field753 = field635;
        field736 = -1;
        field786 = -1;
        Statics.field2731 = null;
        if (field700 != -1) {
            field827 = 0;
            method24(field700, 0, 0, Statics.field3255, Statics.field256, 0, 0, -1);
        }
        class321.method5478();
        if (field729) {
            if (field728 == 1) {
                Statics.field3797[field727 / 100].method5602(field725 - 8, field847 - 8);
            }
            if (field728 == 2) {
                Statics.field3797[field727 / 100 + 4].method5602(field725 - 8, field847 - 8);
            }
        }
        if (field760) {
            method153();
        } else if (field736 != -1) {
            int var2 = field736;
            int var3 = field786;
            if ((field761 >= 2 || field777 != 0 || field779) && field772) {
                int var4 = method1102();
                String var5;
                if (field777 == 1 && field761 < 2) {
                    var5 = class225.field2892 + class225.field2902 + field778 + " " + class82.field1121;
                } else if (field779 && field761 < 2) {
                    var5 = field782 + class225.field2902 + field783 + " " + class82.field1121;
                } else {
                    String var6;
                    if (var4 < 0) {
                        var6 = "";
                    } else if (field767[var4].length() > 0) {
                        var6 = field766[var4] + class225.field2902 + field767[var4];
                    } else {
                        var6 = field766[var4];
                    }
                    var5 = var6;
                }
                if (field761 > 2) {
                    var5 = var5 + class82.method159(16777215) + " " + '/' + " " + (field761 - 2) + class225.field2896;
                }
                Statics.field357.method4922(var5, var2 + 4, var3 + 15, 16777215, 0, field635 / 1000);
            }
        }
        if (field836 == 3) {
            for (int var7 = 0; var7 < field827; var7++) {
                if (field831[var7]) {
                    class321.method5494(field832[var7], field824[var7], field834[var7], field835[var7], 16711935, 128);
                } else if (field830[var7]) {
                    class321.method5494(field832[var7], field824[var7], field834[var7], field835[var7], 16711680, 128);
                }
            }
        }
        class76.method133(Statics.field519, Statics.field177.field957, Statics.field177.field918, field880);
        field880 = 0;
    }

    @ObfuscatedName("gg.ge(Ljava/lang/String;ZB)V")
    public static final void method3562(String arg0, boolean arg1) {
        if (!field739) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2186.method4954(arg0, 250);
        int var6 = Statics.field2186.method4946(arg0, 250) * 13;
        class321.method5485(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class321.method5489(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2186.method4918(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2604(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3235.method729(0, 0);
        } else {
            Statics.method4765(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("iq.gt(IIIII)V")
    public static final void method3997(int arg0, int arg1, int arg2, int arg3) {
        field722++;
        if (Statics.field177.field957 >> 7 == field885 && Statics.field177.field918 >> 7 == field855) {
            field885 = 0;
        }
        if (field743) {
            method1872(Statics.field177, false);
        }
        method3599();
        method665(true);
        method3960();
        method665(false);
        method3018();
        method3316();
        method1654(arg0, arg1, arg2, arg3, true);
        int var4 = field882;
        int var5 = field883;
        int var6 = field884;
        int var7 = field686;
        class321.method5483(var4, var5, var4 + var6, var5 + var7);
        class131.method2744();
        if (!field708) {
            int var8 = field693;
            if (field636 / 256 > var8) {
                var8 = field636 / 256;
            }
            if (field898[4] && field695[4] + 128 > var8) {
                var8 = field695[4] + 128;
            }
            int var9 = field694 & 0x7FF;
            int var10 = Statics.field1276;
            int var11 = Statics.field560;
            int var12 = Statics.field1047;
            int var13 = var8 * 3 + 600;
            int var15 = method977(var13, var7);
            int var16 = 2048 - var8 & 0x7FF;
            int var17 = 2048 - var9 & 0x7FF;
            int var18 = 0;
            int var19 = 0;
            int var20 = var15;
            if (var16 != 0) {
                int var21 = class131.field1767[var16];
                int var22 = class131.field1768[var16];
                int var23 = var19 * var22 - var15 * var21 >> 16;
                var20 = var19 * var21 + var15 * var22 >> 16;
                var19 = var23;
            }
            if (var17 != 0) {
                int var24 = class131.field1767[var17];
                int var25 = class131.field1768[var17];
                int var26 = var18 * var25 + var20 * var24 >> 16;
                var20 = var20 * var25 - var18 * var24 >> 16;
                var18 = var26;
            }
            Statics.field1894 = var10 - var18;
            Statics.field2514 = var11 - var19;
            Statics.field1966 = var12 - var20;
            Statics.field356 = var8;
            Statics.field334 = var9;
            if (field781 == 1 && field793 >= 2 && field635 % 50 == 0 && (Statics.field1276 >> 7 != Statics.field177.field957 >> 7 || Statics.field1047 >> 7 != Statics.field177.field918 >> 7)) {
                int var27 = Statics.field177.field611;
                int var28 = (Statics.field1276 >> 7) + Statics.field1299;
                int var29 = (Statics.field1047 >> 7) + Statics.field2085;
                method3027(var28, var29, var27, true);
            }
        }
        int var42;
        if (field708) {
            var42 = method146();
        } else {
            int var30;
            if (Statics.field69.field1030) {
                var30 = Statics.field519;
            } else {
                label283: {
                    int var31 = 3;
                    if (Statics.field356 < 310) {
                        int var32;
                        int var33;
                        if (field781 == 1) {
                            var32 = Statics.field1276 >> 7;
                            var33 = Statics.field1047 >> 7;
                        } else {
                            var32 = Statics.field177.field957 >> 7;
                            var33 = Statics.field177.field918 >> 7;
                        }
                        int var34 = Statics.field1894 >> 7;
                        int var35 = Statics.field1966 >> 7;
                        if (var34 < 0 || var35 < 0 || var34 >= 104 || var35 >= 104) {
                            var30 = Statics.field519;
                            break label283;
                        }
                        if (var32 < 0 || var33 < 0 || var32 >= 104 || var33 >= 104) {
                            var30 = Statics.field519;
                            break label283;
                        }
                        if ((class56.field473[Statics.field519][var34][var35] & 0x4) != 0) {
                            var31 = Statics.field519;
                        }
                        int var36;
                        if (var32 > var34) {
                            var36 = var32 - var34;
                        } else {
                            var36 = var34 - var32;
                        }
                        int var37;
                        if (var33 > var35) {
                            var37 = var33 - var35;
                        } else {
                            var37 = var35 - var33;
                        }
                        if (var36 > var37) {
                            int var38 = var37 * 65536 / var36;
                            int var39 = 32768;
                            while (var32 != var34) {
                                if (var34 < var32) {
                                    var34++;
                                } else if (var34 > var32) {
                                    var34--;
                                }
                                if ((class56.field473[Statics.field519][var34][var35] & 0x4) != 0) {
                                    var31 = Statics.field519;
                                }
                                var39 += var38;
                                if (var39 >= 65536) {
                                    var39 -= 65536;
                                    if (var35 < var33) {
                                        var35++;
                                    } else if (var35 > var33) {
                                        var35--;
                                    }
                                    if ((class56.field473[Statics.field519][var34][var35] & 0x4) != 0) {
                                        var31 = Statics.field519;
                                    }
                                }
                            }
                        } else if (var37 > 0) {
                            int var40 = var36 * 65536 / var37;
                            int var41 = 32768;
                            while (var33 != var35) {
                                if (var35 < var33) {
                                    var35++;
                                } else if (var35 > var33) {
                                    var35--;
                                }
                                if ((class56.field473[Statics.field519][var34][var35] & 0x4) != 0) {
                                    var31 = Statics.field519;
                                }
                                var41 += var40;
                                if (var41 >= 65536) {
                                    var41 -= 65536;
                                    if (var34 < var32) {
                                        var34++;
                                    } else if (var34 > var32) {
                                        var34--;
                                    }
                                    if ((class56.field473[Statics.field519][var34][var35] & 0x4) != 0) {
                                        var31 = Statics.field519;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field177.field957 >= 0 && Statics.field177.field918 >= 0 && Statics.field177.field957 < 13312 && Statics.field177.field918 < 13312) {
                        if ((class56.field473[Statics.field519][Statics.field177.field957 >> 7][Statics.field177.field918 >> 7] & 0x4) != 0) {
                            var31 = Statics.field519;
                        }
                        var30 = var31;
                    } else {
                        var30 = Statics.field519;
                    }
                }
            }
            var42 = var30;
        }
        int var43 = Statics.field1894;
        int var44 = Statics.field2514;
        int var45 = Statics.field1966;
        int var46 = Statics.field356;
        int var47 = Statics.field334;
        for (int var48 = 0; var48 < 5; var48++) {
            if (field898[var48]) {
                int var49 = (int) (Math.random() * (double) (field870[var48] * 2 + 1) - (double) field870[var48] + Math.sin((double) field759[var48] / 100.0D * (double) field873[var48]) * (double) field695[var48]);
                if (var48 == 0) {
                    Statics.field1894 += var49;
                }
                if (var48 == 1) {
                    Statics.field2514 += var49;
                }
                if (var48 == 2) {
                    Statics.field1966 += var49;
                }
                if (var48 == 3) {
                    Statics.field334 = Statics.field334 + var49 & 0x7FF;
                }
                if (var48 == 4) {
                    Statics.field356 += var49;
                    if (Statics.field356 < 128) {
                        Statics.field356 = 128;
                    }
                    if (Statics.field356 > 383) {
                        Statics.field356 = 383;
                    }
                }
            }
        }
        int var50 = class55.field464;
        int var51 = class55.field461;
        if (class55.field462 != 0) {
            var50 = class55.field468;
            var51 = class55.field469;
        }
        if (var50 >= var4 && var50 < var4 + var6 && var51 >= var5 && var51 < var5 + var7) {
            class129.method4316(var50 - var4, var51 - var5);
        } else {
            class129.field1733 = false;
            class129.field1729 = 0;
        }
        method212();
        class321.method5485(var4, var5, var6, var7, 0);
        method212();
        int var52 = class131.field1753;
        class131.field1753 = field886;
        Statics.field619.method2869(Statics.field1894, Statics.field2514, Statics.field1966, Statics.field356, Statics.field334, var42);
        class131.field1753 = var52;
        method212();
        Statics.field619.method2933();
        method996(var4, var5, var6, var7);
        if (field643 == 2) {
            method554((field646 - Statics.field1299 << 7) + field649, (field647 - Statics.field2085 << 7) + field650, field710 * 2);
            if (field723 > -1 && field635 % 20 < 10) {
                Statics.field324[0].method5602(field723 + var4 - 12, field724 + var5 - 28);
            }
        }
        ((class120) Statics.field1764).method2498(field880);
        method3507(var4, var5, var6, var7);
        Statics.field1894 = var43;
        Statics.field2514 = var44;
        Statics.field1966 = var45;
        Statics.field356 = var46;
        Statics.field334 = var47;
        if (field665 && class237.method3745(true, false) == 0) {
            field665 = false;
        }
        if (field665) {
            class321.method5485(var4, var5, var6, var7, 0);
            method3562(class225.field2749, false);
        }
    }

    @ObfuscatedName("bt.go(IIIIZI)V")
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field874;
        } else if (var5 >= 100) {
            var6 = field823;
        } else {
            var6 = (field823 - field874) * var5 / 100 + field874;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field653) {
            short var8 = field653;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field662) {
                var6 = field662;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class321.method5478();
                    class321.method5485(arg0, arg1, var10, arg3, -16777216);
                    class321.method5485(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field792) {
            short var11 = field792;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field796) {
                var6 = field796;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class321.method5478();
                    class321.method5485(arg0, arg1, arg2, var13, -16777216);
                    class321.method5485(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field886 = arg3 * var6 / 334;
        if (field884 != arg2 || field686 != arg3) {
            method2823(arg2, arg3);
        }
        field882 = arg0;
        field883 = arg1;
        field884 = arg2;
        field686 = arg3;
    }

    @ObfuscatedName("gl.gq(B)V")
    public static void method3599() {
        if (field674 >= 0 && field740[field674] != null) {
            method1872(field740[field674], false);
        }
    }

    @ObfuscatedName("iz.gx(I)V")
    public static void method3960() {
        int var0 = class90.field1230;
        int[] var1 = class90.field1225;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field674 != var1[var2] && field741 != var1[var2]) {
                method1872(field740[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ck.gw(Lbd;ZB)V")
    public static void method1872(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1073() || arg0.field589) {
            return;
        }
        arg0.field608 = false;
        if ((field829 && class90.field1230 > 50 || class90.field1230 > 200) && arg1 && arg0.field980 == arg0.field917) {
            arg0.field608 = true;
        }
        int var2 = arg0.field957 >> 7;
        int var3 = arg0.field918 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method349(0, 0, 0, false, arg0.field612);
        if (arg0.field603 != null && field635 >= arg0.field593 && field635 < arg0.field599) {
            arg0.field608 = false;
            arg0.field596 = method79(arg0.field957, arg0.field918, Statics.field519);
            arg0.field974 = field635;
            Statics.field619.method2840(Statics.field519, arg0.field957, arg0.field918, arg0.field596, 60, arg0, arg0.field919, var4, arg0.field604, arg0.field605, arg0.field617, arg0.field607);
            return;
        }
        if ((arg0.field957 & 0x7F) == 64 && (arg0.field918 & 0x7F) == 64) {
            if (field722 == field648[var2][var3]) {
                return;
            }
            field648[var2][var3] = field722;
        }
        arg0.field596 = method79(arg0.field957, arg0.field918, Statics.field519);
        arg0.field974 = field635;
        Statics.field619.method2839(Statics.field519, arg0.field957, arg0.field918, arg0.field596, 60, arg0, arg0.field919, var4, arg0.field920);
    }

    @ObfuscatedName("ay.gk(ZI)V")
    public static final void method665(boolean arg0) {
        for (int var1 = 0; var1 < field667; var1++) {
            class80 var2 = field746[field808[var1]];
            if (var2 != null && var2.method1073() && var2.field1104.field3466 == arg0 && var2.field1104.method4343()) {
                int var3 = var2.field957 >> 7;
                int var4 = var2.field918 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field921 == 1 && (var2.field957 & 0x7F) == 64 && (var2.field918 & 0x7F) == 64) {
                        if (field722 == field648[var3][var4]) {
                            continue;
                        }
                        field648[var3][var4] = field722;
                    }
                    long var5 = class129.method349(0, 0, 1, !var2.field1104.field3447, field808[var1]);
                    var2.field974 = field635;
                    Statics.field619.method2839(Statics.field519, var2.field957, var2.field918, method79(var2.field957 + (var2.field921 * 64 - 64), var2.field918 + (var2.field921 * 64 - 64), Statics.field519), var2.field921 * 64 - 64 + 60, var2, var2.field919, var5, var2.field920);
                }
            }
        }
    }

    @ObfuscatedName("em.gr(I)V")
    public static final void method3018() {
        for (class87 var0 = (class87) field754.method4480(); var0 != null; var0 = (class87) field754.method4491()) {
            if (Statics.field519 != var0.field1195 || field635 > var0.field1199) {
                var0.method3304();
            } else if (field635 >= var0.field1202) {
                if (var0.field1198 > 0) {
                    class80 var1 = field746[var0.field1198 - 1];
                    if (var1 != null && var1.field957 >= 0 && var1.field957 < 13312 && var1.field918 >= 0 && var1.field918 < 13312) {
                        var0.method1914(var1.field957, var1.field918, method79(var1.field957, var1.field918, var0.field1195) - var0.field1190, field635);
                    }
                }
                if (var0.field1198 < 0) {
                    int var2 = -var0.field1198 - 1;
                    class67 var3;
                    if (field741 == var2) {
                        var3 = Statics.field177;
                    } else {
                        var3 = field740[var2];
                    }
                    if (var3 != null && var3.field957 >= 0 && var3.field957 < 13312 && var3.field918 >= 0 && var3.field918 < 13312) {
                        var0.method1914(var3.field957, var3.field918, method79(var3.field957, var3.field918, var0.field1195) - var0.field1190, field635);
                    }
                }
                var0.method1915(field880);
                Statics.field619.method2839(Statics.field519, (int) var0.field1197, (int) var0.field1189, (int) var0.field1185, 60, var0, var0.field1191, -1L, false);
            }
        }
    }

    @ObfuscatedName("gj.gm(B)V")
    public static final void method3316() {
        for (class78 var0 = (class78) field755.method4480(); var0 != null; var0 = (class78) field755.method4491()) {
            if (Statics.field519 != var0.field1082 || var0.field1089) {
                var0.method3304();
            } else if (field635 >= var0.field1081) {
                var0.method1835(field880);
                if (var0.field1089) {
                    var0.method3304();
                } else {
                    Statics.field619.method2839(var0.field1082, var0.field1083, var0.field1084, var0.field1085, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("b.gu(I)I")
    public static final int method146() {
        if (Statics.field69.field1030) {
            return Statics.field519;
        } else {
            int var0 = method79(Statics.field1894, Statics.field1966, Statics.field519);
            return var0 - Statics.field2514 >= 800 || (class56.field473[Statics.field519][Statics.field1894 >> 7][Statics.field1966 >> 7] & 0x4) == 0 ? 3 : Statics.field519;
        }
    }

    @ObfuscatedName("io.gn(I)Z")
    public static boolean method4184() {
        return (field744 & 0x4) != 0;
    }

    @ObfuscatedName("t.gc(B)Z")
    public static boolean method58() {
        return (field744 & 0x1) != 0;
    }

    @ObfuscatedName("bg.gf(Lbu;IIIIIB)V")
    public static final void method1727(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1073()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1104;
            if (var6.field3471 != null) {
                var6 = var6.method4323();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1230;
        int[] var8 = class90.field1225;
        byte var9 = 0;
        if (arg1 < var7 && field635 == arg0.field974) {
            class67 var10 = (class67) arg0;
            boolean var11;
            if (field744 == 0) {
                var11 = false;
            } else if (Statics.field177 == var10) {
                boolean var14 = (field744 & 0x8) != 0;
                var11 = var14;
            } else {
                boolean var12 = method4184() || method58() && var10.method1062();
                if (!var12) {
                    boolean var13 = (field744 & 0x2) != 0;
                    var12 = var13 && var10.method1080();
                }
                var11 = var12;
            }
            if (var11) {
                class67 var15 = (class67) arg0;
                if (arg1 < var7) {
                    method3021(arg0, arg0.field969 + 15);
                    class296 var16 = (class296) field676.get(class292.field3647);
                    byte var17 = 9;
                    var16.method4965(var15.field591.method4767(), field723 + arg2, field724 + arg3 - var17, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var18 = -2;
        if (!arg0.field944.method4412()) {
            method3021(arg0, arg0.field969 + 15);
            for (class79 var19 = (class79) arg0.field944.method4426(); var19 != null; var19 = (class79) arg0.field944.method4410()) {
                class71 var20 = var19.method1843(field635);
                if (var20 != null) {
                    class247 var21 = var19.field1102;
                    class325 var22 = var21.method4063();
                    class325 var23 = var21.method4061();
                    int var24 = 0;
                    int var25;
                    if (var22 == null || var23 == null) {
                        var25 = var21.field3270;
                    } else {
                        if (var21.field3267 * 2 < var23.field3878) {
                            var24 = var21.field3267;
                        }
                        var25 = var23.field3878 - var24 * 2;
                    }
                    int var26 = 255;
                    boolean var27 = true;
                    int var28 = field635 - var20.field986;
                    int var29 = var20.field983 * var25 / var21.field3270;
                    int var32;
                    if (var20.field984 > var28) {
                        int var30 = var21.field3266 == 0 ? 0 : var28 / var21.field3266 * var21.field3266;
                        int var31 = var20.field982 * var25 / var21.field3270;
                        var32 = (var29 - var31) * var30 / var20.field984 + var31;
                    } else {
                        var32 = var29;
                        int var33 = var20.field984 + var21.field3264 - var28;
                        if (var21.field3262 >= 0) {
                            var26 = (var33 << 8) / (var21.field3264 - var21.field3262);
                        }
                    }
                    if (var20.field983 > 0 && var32 < 1) {
                        var32 = 1;
                    }
                    if (var22 == null || var23 == null) {
                        var18 += 5;
                        if (field723 > -1) {
                            int var39 = field723 + arg2 - (var25 >> 1);
                            int var40 = field724 + arg3 - var18;
                            class321.method5485(var39, var40, var32, 5, 65280);
                            class321.method5485(var32 + var39, var40, var25 - var32, 5, 16711680);
                        }
                        var18 += 2;
                    } else {
                        int var34;
                        if (var25 == var32) {
                            var34 = var24 * 2 + var32;
                        } else {
                            var34 = var24 + var32;
                        }
                        int var35 = var22.field3875;
                        var18 += var35;
                        int var36 = field723 + arg2 - (var25 >> 1);
                        int var37 = field724 + arg3 - var18;
                        int var38 = var36 - var24;
                        if (var26 >= 0 && var26 < 255) {
                            var22.method5603(var38, var37, var26);
                            class321.method5480(var38, var37, var34 + var38, var35 + var37);
                            var23.method5603(var38, var37, var26);
                        } else {
                            var22.method5602(var38, var37);
                            class321.method5480(var38, var37, var34 + var38, var35 + var37);
                            var23.method5602(var38, var37);
                        }
                        class321.method5483(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var18 += 2;
                    }
                } else if (var19.method1844()) {
                    var19.method3304();
                }
            }
        }
        if (var18 == -2) {
            var18 += 7;
        }
        int var41 = var9 + var18;
        if (arg1 < var7) {
            class67 var42 = (class67) arg0;
            if (var42.field589) {
                return;
            }
            if (var42.field610 != -1 || var42.field613 != -1) {
                method3021(arg0, arg0.field969 + 15);
                if (field723 > -1) {
                    if (var42.field610 != -1) {
                        var41 += 25;
                        Statics.field1979[var42.field610].method5602(field723 + arg2 - 12, field724 + arg3 - var41);
                    }
                    if (var42.field613 != -1) {
                        var41 += 25;
                        Statics.field4011[var42.field613].method5602(field723 + arg2 - 12, field724 + arg3 - var41);
                    }
                }
            }
            if (arg1 >= 0 && field643 == 10 && field645 == var8[arg1]) {
                method3021(arg0, arg0.field969 + 15);
                if (field723 > -1) {
                    int var43 = Statics.field324[1].field3875 + var41;
                    Statics.field324[1].method5602(field723 + arg2 - 12, field724 + arg3 - var43);
                }
            }
        } else {
            class257 var44 = ((class80) arg0).field1104;
            if (var44.field3471 != null) {
                var44 = var44.method4323();
            }
            if (var44.field3475 >= 0 && var44.field3475 < Statics.field4011.length) {
                method3021(arg0, arg0.field969 + 15);
                if (field723 > -1) {
                    Statics.field4011[var44.field3475].method5602(field723 + arg2 - 12, field724 + arg3 - 30);
                }
            }
            if (field643 == 1 && field625 == field808[arg1 - var7] && field635 % 20 < 10) {
                method3021(arg0, arg0.field969 + 15);
                if (field723 > -1) {
                    Statics.field324[0].method5602(field723 + arg2 - 12, field724 + arg3 - 28);
                }
            }
        }
        if (arg0.field931 != null && (arg1 >= var7 || !arg0.field927 && (field624 == 4 || !arg0.field934 && (field624 == 0 || field624 == 3 || field624 == 1 && ((class67) arg0).method1062())))) {
            method3021(arg0, arg0.field969);
            if (field723 > -1 && field711 < field757) {
                field716[field711] = Statics.field357.method4909(arg0.field931) / 2;
                field715[field711] = Statics.field357.field3688;
                field765[field711] = field723;
                field714[field711] = field724;
                field833[field711] = arg0.field935;
                field718[field711] = arg0.field936;
                field680[field711] = arg0.field938;
                field773[field711] = arg0.field931;
                field711++;
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field941[var45];
            int var47 = arg0.field939[var45];
            class253 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field635) {
                    continue;
                }
                var48 = class253.method4116(arg0.field939[var45]);
                var49 = var48.field3315;
                if (var48 != null && var48.field3326 != null) {
                    var48 = var48.method4152();
                    if (var48 == null) {
                        arg0.field941[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field922[var45];
            class253 var51 = null;
            if (var50 >= 0) {
                var51 = class253.method4116(var50);
                if (var51 != null && var51.field3326 != null) {
                    var51 = var51.method4152();
                }
            }
            if (var46 - var49 <= field635) {
                if (var48 == null) {
                    arg0.field941[var45] = -1;
                } else {
                    method3021(arg0, arg0.field969 / 2);
                    if (field723 > -1) {
                        if (var45 == 1) {
                            field724 -= 20;
                        }
                        if (var45 == 2) {
                            field723 -= 15;
                            field724 -= 10;
                        }
                        if (var45 == 3) {
                            field723 += 15;
                            field724 -= 10;
                        }
                        Object var52 = null;
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class325 var64 = null;
                        class325 var65 = null;
                        class325 var66 = null;
                        class325 var67 = null;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        class325 var77 = var48.method4181();
                        if (var77 != null) {
                            var56 = var77.field3878;
                            int var78 = var77.field3875;
                            if (var78 > var76) {
                                var76 = var78;
                            }
                            var60 = var77.field3879;
                        }
                        class325 var79 = var48.method4155();
                        if (var79 != null) {
                            var57 = var79.field3878;
                            int var80 = var79.field3875;
                            if (var80 > var76) {
                                var76 = var80;
                            }
                            var61 = var79.field3879;
                        }
                        class325 var81 = var48.method4159();
                        if (var81 != null) {
                            var58 = var81.field3878;
                            int var82 = var81.field3875;
                            if (var82 > var76) {
                                var76 = var82;
                            }
                            var62 = var81.field3879;
                        }
                        class325 var83 = var48.method4157();
                        if (var83 != null) {
                            var59 = var83.field3878;
                            int var84 = var83.field3875;
                            if (var84 > var76) {
                                var76 = var84;
                            }
                            var63 = var83.field3879;
                        }
                        if (var51 != null) {
                            var64 = var51.method4181();
                            if (var64 != null) {
                                var68 = var64.field3878;
                                int var85 = var64.field3875;
                                if (var85 > var76) {
                                    var76 = var85;
                                }
                                var72 = var64.field3879;
                            }
                            var65 = var51.method4155();
                            if (var65 != null) {
                                var69 = var65.field3878;
                                int var86 = var65.field3875;
                                if (var86 > var76) {
                                    var76 = var86;
                                }
                                var73 = var65.field3879;
                            }
                            var66 = var51.method4159();
                            if (var66 != null) {
                                var70 = var66.field3878;
                                int var87 = var66.field3875;
                                if (var87 > var76) {
                                    var76 = var87;
                                }
                                var74 = var66.field3879;
                            }
                            var67 = var51.method4157();
                            if (var67 != null) {
                                var71 = var67.field3878;
                                int var88 = var67.field3875;
                                if (var88 > var76) {
                                    var76 = var88;
                                }
                                var75 = var67.field3879;
                            }
                        }
                        class295 var89 = var48.method4156();
                        if (var89 == null) {
                            var89 = Statics.field254;
                        }
                        class295 var90;
                        if (var51 == null) {
                            var90 = Statics.field254;
                        } else {
                            var90 = var51.method4156();
                            if (var90 == null) {
                                var90 = Statics.field254;
                            }
                        }
                        Object var91 = null;
                        String var92 = null;
                        boolean var93 = false;
                        int var94 = 0;
                        String var95 = var48.method4153(arg0.field940[var45]);
                        int var96 = var89.method4909(var95);
                        if (var51 != null) {
                            var92 = var51.method4153(arg0.field943[var45]);
                            var94 = var90.method4909(var92);
                        }
                        int var97 = 0;
                        int var98 = 0;
                        if (var57 > 0) {
                            if (var81 == null && var83 == null) {
                                var97 = 1;
                            } else {
                                var97 = var96 / var57 + 1;
                            }
                        }
                        if (var51 != null && var69 > 0) {
                            if (var66 == null && var67 == null) {
                                var98 = 1;
                            } else {
                                var98 = var94 / var69 + 1;
                            }
                        }
                        int var99 = 0;
                        int var100 = var99;
                        if (var56 > 0) {
                            var99 += var56;
                        }
                        var99 += 2;
                        int var101 = var99;
                        if (var58 > 0) {
                            var99 += var58;
                        }
                        int var102 = var99;
                        int var103 = var99;
                        int var105;
                        if (var57 > 0) {
                            int var104 = var57 * var97;
                            var105 = var99 + var104;
                            var103 = (var104 - var96) / 2 + var99;
                        } else {
                            var105 = var96 + var99;
                        }
                        int var106 = var105;
                        if (var59 > 0) {
                            var105 += var59;
                        }
                        int var107 = 0;
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        if (var51 != null) {
                            var105 += 2;
                            var107 = var105;
                            if (var68 > 0) {
                                var105 += var68;
                            }
                            var105 += 2;
                            var108 = var105;
                            if (var70 > 0) {
                                var105 += var70;
                            }
                            var109 = var105;
                            var111 = var105;
                            if (var69 > 0) {
                                int var112 = var69 * var98;
                                var105 += var112;
                                var111 += (var112 - var94) / 2;
                            } else {
                                var105 += var94;
                            }
                            var110 = var105;
                            if (var71 > 0) {
                                var105 += var71;
                            }
                        }
                        int var113 = arg0.field941[var45] - field635;
                        int var114 = var48.field3320 - var48.field3320 * var113 / var48.field3315;
                        int var115 = var48.field3308 * var113 / var48.field3315 + -var48.field3308;
                        int var116 = field723 + arg2 - (var105 >> 1) + var114;
                        int var117 = field724 + arg3 - 12 + var115;
                        int var118 = var117;
                        int var119 = var76 + var117;
                        int var120 = var48.field3325 + var117 + 15;
                        int var121 = var120 - var89.field3672;
                        int var122 = var89.field3675 + var120;
                        if (var121 < var117) {
                            var118 = var121;
                        }
                        if (var122 > var119) {
                            var119 = var122;
                        }
                        int var123 = 0;
                        if (var51 != null) {
                            var123 = var51.field3325 + var117 + 15;
                            int var124 = var123 - var90.field3672;
                            int var125 = var90.field3675 + var123;
                            if (var124 < var118) {
                                ;
                            }
                            if (var125 > var119) {
                                ;
                            }
                        }
                        int var128 = 255;
                        if (var48.field3319 >= 0) {
                            var128 = (var113 << 8) / (var48.field3315 - var48.field3319);
                        }
                        if (var128 >= 0 && var128 < 255) {
                            if (var77 != null) {
                                var77.method5603(var100 + var116 - var60, var117, var128);
                            }
                            if (var81 != null) {
                                var81.method5603(var101 + var116 - var62, var117, var128);
                            }
                            if (var79 != null) {
                                for (int var129 = 0; var129 < var97; var129++) {
                                    var79.method5603(var57 * var129 + (var102 + var116 - var61), var117, var128);
                                }
                            }
                            if (var83 != null) {
                                var83.method5603(var106 + var116 - var63, var117, var128);
                            }
                            var89.method4915(var95, var103 + var116, var120, var48.field3314, 0, var128);
                            if (var51 != null) {
                                if (var64 != null) {
                                    var64.method5603(var107 + var116 - var72, var117, var128);
                                }
                                if (var66 != null) {
                                    var66.method5603(var108 + var116 - var74, var117, var128);
                                }
                                if (var65 != null) {
                                    for (int var130 = 0; var130 < var98; var130++) {
                                        var65.method5603(var69 * var130 + (var109 + var116 - var73), var117, var128);
                                    }
                                }
                                if (var67 != null) {
                                    var67.method5603(var110 + var116 - var75, var117, var128);
                                }
                                var90.method4915(var92, var111 + var116, var123, var51.field3314, 0, var128);
                            }
                        } else {
                            if (var77 != null) {
                                var77.method5602(var100 + var116 - var60, var117);
                            }
                            if (var81 != null) {
                                var81.method5602(var101 + var116 - var62, var117);
                            }
                            if (var79 != null) {
                                for (int var131 = 0; var131 < var97; var131++) {
                                    var79.method5602(var57 * var131 + (var102 + var116 - var61), var117);
                                }
                            }
                            if (var83 != null) {
                                var83.method5602(var106 + var116 - var63, var117);
                            }
                            var89.method4982(var95, var103 + var116, var120, var48.field3314 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var64 != null) {
                                    var64.method5602(var107 + var116 - var72, var117);
                                }
                                if (var66 != null) {
                                    var66.method5602(var108 + var116 - var74, var117);
                                }
                                if (var65 != null) {
                                    for (int var132 = 0; var132 < var98; var132++) {
                                        var65.method5602(var69 * var132 + (var109 + var116 - var73), var117);
                                    }
                                }
                                if (var67 != null) {
                                    var67.method5602(var110 + var116 - var75, var117);
                                }
                                var90.method4982(var92, var111 + var116, var123, var51.field3314 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bv.gi(IIIII)V")
    public static final void method996(int arg0, int arg1, int arg2, int arg3) {
        field711 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1230;
        int[] var8 = class90.field1225;
        for (int var9 = 0; var9 < field667 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = field740[var8[var9]];
                if (field674 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field177 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field746[field808[var9 - var7]];
            }
            method1727(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field743 && var6 != -1) {
            method1727(Statics.field177, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1727(field740[field674], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field711; var11++) {
            int var12 = field765[var11];
            int var13 = field714[var11];
            int var14 = field716[var11];
            int var15 = field715[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field714[var17] - field715[var17] && var13 - var15 < field714[var17] + 2 && var12 - var14 < field765[var17] + field716[var17] && var12 + var14 > field765[var17] - field716[var17] && field714[var17] - field715[var17] < var13) {
                        var13 = field714[var17] - field715[var17];
                        var16 = true;
                    }
                }
            }
            field723 = field765[var11];
            field724 = field714[var11] = var13;
            String var18 = field773[var11];
            if (field788 == 0) {
                int var19 = 16776960;
                if (field833[var11] < 6) {
                    var19 = field644[field833[var11]];
                }
                if (field833[var11] == 6) {
                    var19 = field722 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field833[var11] == 7) {
                    var19 = field722 % 20 < 10 ? 255 : 65535;
                }
                if (field833[var11] == 8) {
                    var19 = field722 % 20 < 10 ? 45056 : 8454016;
                }
                if (field833[var11] == 9) {
                    int var20 = 150 - field680[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field833[var11] == 10) {
                    int var21 = 150 - field680[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field833[var11] == 11) {
                    int var22 = 150 - field680[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field718[var11] == 0) {
                    Statics.field357.method4965(var18, field723 + arg0, field724 + arg1, var19, 0);
                }
                if (field718[var11] == 1) {
                    Statics.field357.method4919(var18, field723 + arg0, field724 + arg1, var19, 0, field722);
                }
                if (field718[var11] == 2) {
                    Statics.field357.method4920(var18, field723 + arg0, field724 + arg1, var19, 0, field722);
                }
                if (field718[var11] == 3) {
                    Statics.field357.method4921(var18, field723 + arg0, field724 + arg1, var19, 0, field722, 150 - field680[var11]);
                }
                if (field718[var11] == 4) {
                    int var23 = (150 - field680[var11]) * (Statics.field357.method4909(var18) + 100) / 150;
                    class321.method5480(field723 + arg0 - 50, arg1, field723 + arg0 + 50, arg1 + arg3);
                    Statics.field357.method4982(var18, field723 + arg0 + 50 - var23, field724 + arg1, var19, 0);
                    class321.method5483(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field718[var11] == 5) {
                    int var24 = 150 - field680[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class321.method5480(arg0, field724 + arg1 - Statics.field357.field3688 - 1, arg0 + arg2, field724 + arg1 + 5);
                    Statics.field357.method4965(var18, field723 + arg0, field724 + arg1 + var25, var19, 0);
                    class321.method5483(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field357.method4965(var18, field723 + arg0, field724 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gd.gp(IIIII)V")
    public static final void method3507(int arg0, int arg1, int arg2, int arg3) {
        field738 = 0;
        int var4 = (Statics.field177.field957 >> 7) + Statics.field1299;
        int var5 = (Statics.field177.field918 >> 7) + Statics.field2085;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field738 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field738 = 1;
        }
        if (field738 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field738 = 0;
        }
    }

    @ObfuscatedName("en.gd(Lbu;II)V")
    public static final void method3021(class70 arg0, int arg1) {
        method554(arg0.field957, arg0.field918, arg1);
    }

    @ObfuscatedName("ar.ga(IIIB)V")
    public static final void method554(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field723 = -1;
            field724 = -1;
            return;
        }
        int var3 = method79(arg0, arg1, Statics.field519) - arg2;
        int var4 = arg0 - Statics.field1894;
        int var5 = var3 - Statics.field2514;
        int var6 = arg1 - Statics.field1966;
        int var7 = class131.field1767[Statics.field356];
        int var8 = class131.field1768[Statics.field356];
        int var9 = class131.field1767[Statics.field334];
        int var10 = class131.field1768[Statics.field334];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field723 = field886 * var11 / var15 + field884 / 2;
            field724 = field886 * var14 / var15 + field686 / 2;
        } else {
            field723 = -1;
            field724 = -1;
        }
    }

    @ObfuscatedName("x.gg(IIIB)I")
    public static final int method79(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field473[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field472[var5][var3][var4] + class56.field472[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field472[var5][var3][var4 + 1] + class56.field472[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bh.gh(III)I")
    public static int method977(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field877 - field876) * var2 / 100 + field876;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("em.gs(IIZI)V")
    public static final void method3016(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field87 == arg0 && Statics.field102 == arg1) {
            return;
        }
        Statics.field87 = arg0;
        Statics.field102 = arg1;
        method2603(25);
        method3562(class225.field2749, true);
        int var3 = Statics.field1299;
        int var4 = Statics.field2085;
        Statics.field1299 = (arg0 - 6) * 8;
        Statics.field2085 = (arg1 - 6) * 8;
        int var5 = Statics.field1299 - var3;
        int var6 = Statics.field2085 - var4;
        int var7 = Statics.field1299;
        int var8 = Statics.field2085;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field746[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field975[var11] -= var5;
                    var10.field945[var11] -= var6;
                }
                var10.field957 -= var5 * 128;
                var10.field918 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field740[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field975[var14] -= var5;
                    var13.field945[var14] -= var6;
                }
                var13.field957 -= var5 * 128;
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
                        field752[var25][var21][var22] = field752[var25][var23][var24];
                    } else {
                        field752[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field879.method4480(); var26 != null; var26 = (class69) field879.method4491()) {
            var26.field903 -= var5;
            var26.field909 -= var6;
            if (var26.field903 < 0 || var26.field909 < 0 || var26.field903 >= 104 || var26.field909 >= 104) {
                var26.method3304();
            }
        }
        if (field885 != 0) {
            field885 -= var5;
            field855 -= var6;
        }
        field748 = 0;
        field708 = false;
        Statics.field1894 -= var5 << 7;
        Statics.field1966 -= var6 << 7;
        Statics.field1276 -= var5 << 7;
        Statics.field1047 -= var6 << 7;
        field652 = -1;
        field755.method4473();
        field754.method4473();
        for (int var27 = 0; var27 < 4; var27++) {
            field892[var27].method3254();
        }
    }

    @ObfuscatedName("ay.gl(ZI)V")
    public static final void method664(boolean arg0) {
        method212();
        field828.field1298++;
        if (field828.field1298 < 50 && !arg0) {
            return;
        }
        field828.field1298 = 0;
        if (field673 || field828.method2055() == null) {
            return;
        }
        class188 var1 = class188.method1879(class184.field2208, field828.field1300);
        field828.method2049(var1);
        try {
            field828.method2048();
        } catch (IOException var3) {
            field673 = true;
        }
    }

    @ObfuscatedName("l.gb(II)V")
    public static final void method235(int arg0) {
        int[] var1 = Statics.field3289.field3874;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field473[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field619.method2862(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class56.field473[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field619.method2862(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3289.method5592();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field473[arg0][var10][var9] & 0x18) == 0) {
                    method3127(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class56.field473[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3127(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field850 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field619.method2857(Statics.field519, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method3026(var13);
                    int var16 = class254.method3676(var15).field3359;
                    if (var16 >= 0) {
                        field853[field850] = class242.method156(var16).method3979(false);
                        field851[field850] = var11;
                        field802[field850] = var12;
                        field850++;
                    }
                }
            }
        }
        Statics.field3235.method5561();
    }

    @ObfuscatedName("ew.gz(IIIIII)V")
    public static final void method3127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field619.method2854(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field619.method3004(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class129.method4020(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field3289.field3874;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class129.method3026(var5);
            class254 var14 = class254.method3676(var13);
            if (var14.field3373 == -1) {
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
                class324 var15 = Statics.field622[var14.field3373];
                if (var15 != null) {
                    int var16 = (var14.field3372 * 4 - var15.field3867) / 2;
                    int var17 = (var14.field3347 * 4 - var15.field3868) / 2;
                    var15.method5576(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3347) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field619.method2856(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field619.method3004(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class129.method3026(var18);
            class254 var24 = class254.method3676(var23);
            if (var24.field3373 != -1) {
                class324 var25 = Statics.field622[var24.field3373];
                if (var25 != null) {
                    int var26 = (var24.field3372 * 4 - var25.field3867) / 2;
                    int var27 = (var24.field3347 * 4 - var25.field3868) / 2;
                    var25.method5576(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3347) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class129.method4020(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field3289.field3874;
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
        long var31 = Statics.field619.method2857(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class129.method3026(var31);
        class254 var34 = class254.method3676(var33);
        if (var34.field3373 == -1) {
            return;
        }
        class324 var35 = Statics.field622[var34.field3373];
        if (var35 != null) {
            int var36 = (var34.field3372 * 4 - var35.field3867) / 2;
            int var37 = (var34.field3347 * 4 - var35.field3868) / 2;
            var35.method5576(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3347) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hc(Lcy;B)Z")
    public final boolean method1338(class96 arg0) {
        class305 var2 = arg0.method2055();
        class299 var3 = arg0.field1293;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1291 == null) {
                if (arg0.field1285) {
                    if (!var2.method3226(1)) {
                        return false;
                    }
                    var2.method3227(arg0.field1293.field3701, 0, 1);
                    arg0.field1294 = 0;
                    arg0.field1285 = false;
                }
                var3.field3704 = 0;
                if (var3.method4997()) {
                    if (!var2.method3226(1)) {
                        return false;
                    }
                    var2.method3227(arg0.field1293.field3701, 1, 1);
                    arg0.field1294 = 0;
                }
                arg0.field1285 = true;
                class183[] var4 = class183.method1017();
                int var5 = var3.method4998();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3704);
                }
                arg0.field1291 = var4[var5];
                arg0.field1290 = arg0.field1291.field2110;
            }
            if (arg0.field1290 == -1) {
                if (!var2.method3226(1)) {
                    return false;
                }
                arg0.method2055().method3227(var3.field3701, 0, 1);
                arg0.field1290 = var3.field3701[0] & 0xFF;
            }
            if (arg0.field1290 == -2) {
                if (!var2.method3226(2)) {
                    return false;
                }
                arg0.method2055().method3227(var3.field3701, 0, 2);
                var3.field3704 = 0;
                arg0.field1290 = var3.method5054();
            }
            if (!var2.method3226(arg0.field1290)) {
                return false;
            }
            var3.field3704 = 0;
            var2.method3227(var3.field3701, 0, arg0.field1290);
            arg0.field1294 = 0;
            field762.method4580();
            arg0.field1292 = arg0.field1297;
            arg0.field1297 = arg0.field1296;
            arg0.field1296 = arg0.field1291;
            if (class183.field2151 == arg0.field1291) {
                class97.method2265(var3, arg0.field1290);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1291) {
                method3210(class186.field2299);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1291) {
                Statics.method1561(true, arg0.field1293);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1291) {
                Statics.field265.method1678(var3, arg0.field1290);
                field630 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1291) {
                int var6 = var3.method5080();
                int var7 = var3.method5099();
                int var8 = var3.method5091();
                class62 var9 = (class62) field854.method5434((long) var7);
                if (var9 != null) {
                    method3974(var9, var9.field542 != var8);
                }
                method1855(var7, var8, var6);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2184 == arg0.field1291) {
                int var10 = var3.method5113();
                boolean var11 = var3.method5179() == 1;
                String var12 = "";
                boolean var13 = false;
                if (var11) {
                    var12 = var3.method5150();
                    if (Statics.field265.method1724(new class283(var12, Statics.field3649))) {
                        var13 = true;
                    }
                }
                String var14 = var3.method5150();
                if (!var13) {
                    class92.method3602(var10, var12, var14);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1291) {
                Statics.field112 = class310.method4578(var3.method5179());
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1291) {
                int var15 = var3.method5058();
                int var16 = var3.method5091();
                class218 var17 = class218.method3998(var15);
                if (var17 != null && var17.field2606 == 0) {
                    if (var16 > var17.field2633 - var17.field2563) {
                        var16 = var17.field2633 - var17.field2563;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    if (var17.field2569 != var16) {
                        var17.field2569 = var16;
                        method1717(var17);
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2109 == arg0.field1291) {
                method3210(class186.field2307);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1291) {
                field841 = var3.method5081();
                field624 = var3.method5081();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2099 == arg0.field1291) {
                method1059();
                arg0.field1291 = null;
                return false;
            }
            if (class183.field2165 == arg0.field1291) {
                field885 = var3.method5179();
                if (field885 == 255) {
                    field885 = 0;
                }
                field855 = var3.method5179();
                if (field855 == 255) {
                    field855 = 0;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1291) {
                boolean var18 = var3.method5179() == 1;
                if (var18) {
                    Statics.field1891 = class297.method4369() - var3.method5221();
                    Statics.field10 = new class7(var3, true);
                } else {
                    Statics.field10 = null;
                }
                field820 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1291) {
                int var19 = var3.method5091();
                if (var19 == 65535) {
                    var19 = -1;
                }
                method2277(var19);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1291) {
                int var20 = var3.method5093();
                int var21 = var3.method5090();
                if (var21 == 65535) {
                    var21 = -1;
                }
                method1015(var21, var20);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1291) {
                field643 = var3.method5179();
                if (field643 == 1) {
                    field625 = var3.method5054();
                }
                if (field643 >= 2 && field643 <= 6) {
                    if (field643 == 2) {
                        field649 = 64;
                        field650 = 64;
                    }
                    if (field643 == 3) {
                        field649 = 0;
                        field650 = 64;
                    }
                    if (field643 == 4) {
                        field649 = 128;
                        field650 = 64;
                    }
                    if (field643 == 5) {
                        field649 = 64;
                        field650 = 0;
                    }
                    if (field643 == 6) {
                        field649 = 64;
                        field650 = 128;
                    }
                    field643 = 2;
                    field646 = var3.method5054();
                    field647 = var3.method5054();
                    field710 = var3.method5179();
                }
                if (field643 == 10) {
                    field645 = var3.method5054();
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2180 == arg0.field1291) {
                int var22 = var3.method5056();
                int var23 = var3.method5056();
                int var24 = class54.method3748();
                class188 var25 = class188.method1879(class184.field2204, field828.field1300);
                var25.field2321.method5189(var24);
                var25.field2321.method5083(field421);
                var25.field2321.method5096(var22);
                var25.field2321.method5095(var23);
                field828.method2049(var25);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2127 == arg0.field1291) {
                Statics.field265.method1669();
                field630 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2182 == arg0.field1291) {
                int var26 = var3.method5091();
                field700 = var26;
                this.method1129(false);
                method211(var26);
                class77.method721(field700);
                for (int var27 = 0; var27 < 100; var27++) {
                    field704[var27] = true;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1291) {
                int var28 = var3.method5056();
                boolean var29 = var3.method5179() == 1;
                class218 var30 = class218.method3998(var28);
                if (var30.field2567 != var29) {
                    var30.field2567 = var29;
                    method1717(var30);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1291) {
                method3056(var3.method5150());
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1291) {
                method184();
                field791 = var3.method5179();
                field821 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2114 == arg0.field1291) {
                method98(true, var3);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2185 == arg0.field1291) {
                method3210(class186.field2303);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1291) {
                int var31 = var3.method5089();
                class60.method15(var31);
                field812[++field813 - 1 & 0x1F] = var31 & 0x7FFF;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1291) {
                Statics.field2508 = var3.method5081();
                Statics.field284 = var3.method5179();
                for (int var32 = Statics.field284; var32 < Statics.field284 + 8; var32++) {
                    for (int var33 = Statics.field2508; var33 < Statics.field2508 + 8; var33++) {
                        if (field752[Statics.field519][var32][var33] != null) {
                            field752[Statics.field519][var32][var33] = null;
                            method3352(var32, var33);
                        }
                    }
                }
                for (class69 var34 = (class69) field879.method4480(); var34 != null; var34 = (class69) field879.method4491()) {
                    if (var34.field903 >= Statics.field284 && var34.field903 < Statics.field284 + 8 && var34.field909 >= Statics.field2508 && var34.field909 < Statics.field2508 + 8 && Statics.field519 == var34.field910) {
                        var34.field914 = 0;
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1291) {
                int var35 = var3.method5179();
                method1882(var35);
                arg0.field1291 = null;
                return false;
            }
            if (class183.field2129 == arg0.field1291) {
                int var36 = var3.method5058();
                int var37 = var3.method5091();
                class218 var38 = class218.method3998(var36);
                if (var38.field2590 != 1 || var38.field2591 != var37) {
                    var38.field2590 = 1;
                    var38.field2591 = var37;
                    method1717(var38);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1291) {
                String var39 = var3.method5150();
                String var40 = class296.method4987(class291.method3357(class211.method722(var3)));
                class92.method3602(6, var39, var40);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1291) {
                int var41 = var3.method5056();
                if (field706 != var41) {
                    field706 = var41;
                    Statics.method988();
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1291) {
                int var42 = var3.method5056();
                int var43 = var3.method5054();
                if (var42 < -70000) {
                    var43 += 32768;
                }
                class218 var44;
                if (var42 >= 0) {
                    var44 = class218.method3998(var42);
                } else {
                    var44 = null;
                }
                while (var3.field3704 < arg0.field1290) {
                    int var45 = var3.method5113();
                    int var46 = var3.method5054();
                    int var47 = 0;
                    if (var46 != 0) {
                        var47 = var3.method5179();
                        if (var47 == 255) {
                            var47 = var3.method5056();
                        }
                    }
                    if (var44 != null && var45 >= 0 && var45 < var44.field2649.length) {
                        var44.field2649[var45] = var46;
                        var44.field2672[var45] = var47;
                    }
                    class60.method682(var43, var45, var46 - 1, var47);
                }
                if (var44 != null) {
                    method1717(var44);
                }
                method184();
                field812[++field813 - 1 & 0x1F] = var43 & 0x7FFF;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1291) {
                int var48 = var3.method5179();
                int var49 = var3.method5179();
                int var50 = var3.method5179();
                int var51 = var3.method5179();
                field898[var48] = true;
                field870[var48] = var49;
                field695[var48] = var50;
                field759[var48] = var51;
                field873[var48] = 0;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1291) {
                int var52 = var3.method5179();
                if (var3.method5179() == 0) {
                    field891[var52] = new class10();
                    var3.field3704 += 18;
                } else {
                    var3.field3704--;
                    field891[var52] = new class10(var3, false);
                }
                field819 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1291) {
                for (int var53 = 0; var53 < field740.length; var53++) {
                    if (field740[var53] != null) {
                        field740[var53].field924 = -1;
                    }
                }
                for (int var54 = 0; var54 < field746.length; var54++) {
                    if (field746[var54] != null) {
                        field746[var54].field924 = -1;
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1291) {
                int var55 = var3.method5080();
                int var56 = var3.method5080();
                String var57 = var3.method5150();
                if (var56 >= 1 && var56 <= 8) {
                    if (var57.equalsIgnoreCase(class225.field2929)) {
                        var57 = null;
                    }
                    field668[var56 - 1] = var57;
                    field749[var56 - 1] = var55 == 0;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2107 == arg0.field1291) {
                int var58 = var3.method5056();
                class62 var59 = (class62) field854.method5434((long) var58);
                if (var59 != null) {
                    method3974(var59, true);
                }
                if (field790 != null) {
                    method1717(field790);
                    field790 = null;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2103 == arg0.field1291) {
                Statics.method1561(false, arg0.field1293);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1291) {
                int var60 = var3.method5091();
                int var61 = var3.method5091();
                int var62 = var3.method5091();
                int var63 = var3.method5058();
                class218 var64 = class218.method3998(var63);
                if (var64.field2598 != var60 || var64.field2599 != var62 || var64.field2535 != var61) {
                    var64.field2598 = var60;
                    var64.field2599 = var62;
                    var64.field2535 = var61;
                    method1717(var64);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2115 == arg0.field1291) {
                Statics.field2508 = var3.method5082();
                Statics.field284 = var3.method5081();
                while (var3.field3704 < arg0.field1290) {
                    int var65 = var3.method5179();
                    class186 var66 = class186.method269()[var65];
                    method3210(var66);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2137 == arg0.field1291) {
                int var67 = var3.method5058();
                class218 var68 = class218.method3998(var67);
                var68.field2590 = 3;
                var68.field2591 = Statics.field177.field590.method3650();
                method1717(var68);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2113 == arg0.field1291) {
                method3210(class186.field2302);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2181 == arg0.field1291) {
                field708 = true;
                Statics.field191 = var3.method5179();
                Statics.field1933 = var3.method5179();
                Statics.field447 = var3.method5054();
                Statics.field35 = var3.method5179();
                Statics.field606 = var3.method5179();
                if (Statics.field606 >= 100) {
                    int var69 = Statics.field191 * 128 + 64;
                    int var70 = Statics.field1933 * 128 + 64;
                    int var71 = method79(var69, var70, Statics.field519) - Statics.field447;
                    int var72 = var69 - Statics.field1894;
                    int var73 = var71 - Statics.field2514;
                    int var74 = var70 - Statics.field1966;
                    int var75 = (int) Math.sqrt((double) (var72 * var72 + var74 * var74));
                    Statics.field356 = (int) (Math.atan2((double) var73, (double) var75) * 325.949D) & 0x7FF;
                    Statics.field334 = (int) (Math.atan2((double) var72, (double) var74) * -325.949D) & 0x7FF;
                    if (Statics.field356 < 128) {
                        Statics.field356 = 128;
                    }
                    if (Statics.field356 > 383) {
                        Statics.field356 = 383;
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2122 == arg0.field1291) {
                int var76 = var3.method5099();
                int var77 = var3.method5090();
                int var78 = var77 >> 10 & 0x1F;
                int var79 = var77 >> 5 & 0x1F;
                int var80 = var77 & 0x1F;
                int var81 = (var80 << 3) + (var78 << 19) + (var79 << 11);
                class218 var82 = class218.method3998(var76);
                if (var82.field2572 != var81) {
                    var82.field2572 = var81;
                    method1717(var82);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1291) {
                field856 = var3.method5179();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1291) {
                method3210(class186.field2298);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1291) {
                for (int var83 = 0; var83 < class213.field2503.length; var83++) {
                    if (class213.field2507[var83] != class213.field2503[var83]) {
                        class213.field2503[var83] = class213.field2507[var83];
                        method1732(var83);
                        field810[++field801 - 1 & 0x1F] = var83;
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2111 == arg0.field1291) {
                String var84 = var3.method5150();
                Object[] var85 = new Object[var84.length() + 1];
                for (int var86 = var84.length() - 1; var86 >= 0; var86--) {
                    if (var84.charAt(var86) == 's') {
                        var85[var86 + 1] = var3.method5150();
                    } else {
                        var85[var86 + 1] = Integer.valueOf(var3.method5056());
                    }
                }
                var85[0] = Integer.valueOf(var3.method5056());
                class63 var87 = new class63();
                var87.field551 = var85;
                class77.method1875(var87);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1291) {
                Statics.field265.field1045.method4662(var3, arg0.field1290);
                method1001();
                field630 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1291) {
                int var88 = var3.method5056();
                int var89 = var3.method5054();
                if (var89 == 65535) {
                    var89 = -1;
                }
                int var90 = var3.method5058();
                class218 var91 = class218.method3998(var88);
                if (var91.field2546) {
                    var91.field2675 = var89;
                    var91.field2674 = var90;
                    class255 var93 = class255.method144(var89);
                    var91.field2598 = var93.field3396;
                    var91.field2599 = var93.field3385;
                    var91.field2671 = var93.field3398;
                    var91.field2578 = var93.field3423;
                    var91.field2597 = var93.field3400;
                    var91.field2535 = var93.field3395;
                    if (var93.field3401 == 1) {
                        var91.field2540 = 1;
                    } else {
                        var91.field2540 = 2;
                    }
                    if (var91.field2639 > 0) {
                        var91.field2535 = var91.field2535 * 32 / var91.field2639;
                    } else if (var91.field2614 > 0) {
                        var91.field2535 = var91.field2535 * 32 / var91.field2614;
                    }
                    method1717(var91);
                } else if (var89 == -1) {
                    var91.field2590 = 0;
                    arg0.field1291 = null;
                    return true;
                } else {
                    class255 var92 = class255.method144(var89);
                    var91.field2590 = 4;
                    var91.field2591 = var89;
                    var91.field2598 = var92.field3396;
                    var91.field2599 = var92.field3385;
                    var91.field2535 = var92.field3395 * 100 / var90;
                    method1717(var91);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1291) {
                int var94 = var3.method5055();
                int var95 = var3.method5058();
                class218 var96 = class218.method3998(var95);
                if (var96.field2594 != var94 || var94 == -1) {
                    var96.field2594 = var94;
                    var96.field2685 = 0;
                    var96.field2676 = 0;
                    method1717(var96);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2147 == arg0.field1291) {
                method3210(class186.field2301);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1291) {
                method3210(class186.field2305);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1291) {
                method98(false, var3);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2105 == arg0.field1291) {
                byte[] var97 = new byte[arg0.field1290];
                var3.method5028(var97, 0, var97.length);
                class300 var98 = new class300(var97);
                String var99 = var98.method5150();
                class52.method3044(var99, true, false);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1291) {
                method184();
                field675 = var3.method5055();
                field821 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2098 == arg0.field1291) {
                var3.field3704 += 28;
                if (var3.method5061()) {
                    method1912(var3, var3.field3704 - 28);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1291) {
                field708 = true;
                Statics.field1080 = var3.method5179();
                Statics.field25 = var3.method5179();
                Statics.field130 = var3.method5054();
                Statics.field143 = var3.method5179();
                Statics.field192 = var3.method5179();
                if (Statics.field192 >= 100) {
                    Statics.field1894 = Statics.field1080 * 128 + 64;
                    Statics.field1966 = Statics.field25 * 128 + 64;
                    Statics.field2514 = method79(Statics.field1894, Statics.field1966, Statics.field519) - Statics.field130;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2102 == arg0.field1291) {
                int var100 = var3.method5054();
                int var101 = var3.method5056();
                class213.field2507[var100] = var101;
                if (class213.field2503[var100] != var101) {
                    class213.field2503[var100] = var101;
                }
                method1732(var100);
                field810[++field801 - 1 & 0x1F] = var100;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1291) {
                byte var102 = var3.method5260();
                int var103 = var3.method5090();
                class213.field2507[var103] = var102;
                if (class213.field2503[var103] != var102) {
                    class213.field2503[var103] = var102;
                }
                method1732(var103);
                field810[++field801 - 1 & 0x1F] = var103;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1291) {
                if (Statics.field902 != null) {
                    Statics.field902.method4792(var3);
                }
                method3033();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1291) {
                method3210(class186.field2304);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1291) {
                int var104 = arg0.field1290 + var3.field3704;
                int var105 = var3.method5054();
                int var106 = var3.method5054();
                if (field700 != var105) {
                    field700 = var105;
                    this.method1129(false);
                    method211(field700);
                    class77.method721(field700);
                    for (int var107 = 0; var107 < 100; var107++) {
                        field704[var107] = true;
                    }
                }
                while (var106-- > 0) {
                    int var108 = var3.method5056();
                    int var109 = var3.method5054();
                    int var110 = var3.method5179();
                    class62 var111 = (class62) field854.method5434((long) var108);
                    if (var111 != null && var111.field542 != var109) {
                        method3974(var111, true);
                        var111 = null;
                    }
                    if (var111 == null) {
                        var111 = method1855(var108, var109, var110);
                    }
                    var111.field541 = true;
                }
                for (class62 var112 = (class62) field854.method5432(); var112 != null; var112 = (class62) field854.method5433()) {
                    if (var112.field541) {
                        var112.field541 = false;
                    } else {
                        method3974(var112, true);
                    }
                }
                field826 = new class318(512);
                while (var3.field3704 < var104) {
                    int var113 = var3.method5056();
                    int var114 = var3.method5054();
                    int var115 = var3.method5054();
                    int var116 = var3.method5056();
                    for (int var117 = var114; var117 <= var115; var117++) {
                        long var118 = ((long) var113 << 32) + (long) var117;
                        field826.method5429(new class180(var116), var118);
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1291) {
                int var120 = var3.method5099();
                int var121 = var3.method5078();
                int var122 = var3.method5092();
                class218 var123 = class218.method3998(var120);
                if (var123.field2596 != var122 || var123.field2557 != var121 || var123.field2552 != 0 || var123.field2553 != 0) {
                    var123.field2596 = var122;
                    var123.field2557 = var121;
                    var123.field2552 = 0;
                    var123.field2553 = 0;
                    method1717(var123);
                    this.method1235(var123);
                    if (var123.field2606 == 0) {
                        method546(Statics.field2542[var120 >> 16], var123, false);
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2120 == arg0.field1291) {
                method184();
                int var124 = var3.method5149();
                int var125 = var3.method5081();
                int var126 = var3.method5179();
                field717[var125] = var124;
                field756[var125] = var126;
                field785[var125] = 1;
                for (int var127 = 0; var127 < 98; var127++) {
                    if (var124 >= class222.field2726[var127]) {
                        field785[var125] = var127 + 2;
                    }
                }
                field814[++field815 - 1 & 0x1F] = var125;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1291) {
                class90.method474(var3, arg0.field1290);
                method207();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1291) {
                int var128 = var3.method5179();
                method243(var128);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1291) {
                int var129 = var3.method5149();
                int var130 = var3.method5090();
                if (var130 == 65535) {
                    var130 = -1;
                }
                int var131 = var3.method5058();
                int var132 = var3.method5054();
                if (var132 == 65535) {
                    var132 = -1;
                }
                for (int var133 = var132; var133 <= var130; var133++) {
                    long var134 = ((long) var131 << 32) + (long) var133;
                    class181 var136 = field826.method5434(var134);
                    if (var136 != null) {
                        var136.method3304();
                    }
                    field826.method5429(new class180(var129), var134);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1291) {
                int var137 = var3.method5090();
                int var138 = var3.method5089();
                int var139 = var3.method5099();
                class218 var140 = class218.method3998(var139);
                var140.field2603 = (var138 << 16) + var137;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2158 == arg0.field1291) {
                int var141 = var3.method5056();
                int var142 = var3.method5056();
                class62 var143 = (class62) field854.method5434((long) var142);
                class62 var144 = (class62) field854.method5434((long) var141);
                if (var144 != null) {
                    method3974(var144, var143 == null || var143.field542 != var144.field542);
                }
                if (var143 != null) {
                    var143.method3304();
                    field854.method5429(var143, (long) var141);
                }
                class218 var145 = class218.method3998(var142);
                if (var145 != null) {
                    method1717(var145);
                }
                class218 var146 = class218.method3998(var141);
                if (var146 != null) {
                    method1717(var146);
                    method546(Statics.field2542[var146.field2658 >>> 16], var146, true);
                }
                if (field700 != -1) {
                    method3166(field700, 1);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1291) {
                int var147 = var3.method5056();
                int var148 = var3.method5054();
                if (var147 < -70000) {
                    var148 += 32768;
                }
                class218 var149;
                if (var147 >= 0) {
                    var149 = class218.method3998(var147);
                } else {
                    var149 = null;
                }
                if (var149 != null) {
                    for (int var150 = 0; var150 < var149.field2649.length; var150++) {
                        var149.field2649[var150] = 0;
                        var149.field2672[var150] = 0;
                    }
                }
                class60.method138(var148);
                int var151 = var3.method5054();
                for (int var152 = 0; var152 < var151; var152++) {
                    int var153 = var3.method5054();
                    int var154 = var3.method5179();
                    if (var154 == 255) {
                        var154 = var3.method5058();
                    }
                    if (var149 != null && var152 < var149.field2649.length) {
                        var149.field2649[var152] = var153;
                        var149.field2672[var152] = var154;
                    }
                    class60.method682(var148, var152, var153 - 1, var154);
                }
                if (var149 != null) {
                    method1717(var149);
                }
                method184();
                field812[++field813 - 1 & 0x1F] = var148 & 0x7FFF;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2104 == arg0.field1291) {
                Statics.field284 = var3.method5081();
                Statics.field2508 = var3.method5082();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2108 == arg0.field1291) {
                String var155 = var3.method5150();
                long var156 = (long) var3.method5054();
                long var158 = (long) var3.method5169();
                class229 var160 = (class229) class196.method1723(class229.method3368(), var3.method5179());
                long var161 = (var156 << 32) + var158;
                boolean var163 = false;
                for (int var164 = 0; var164 < 100; var164++) {
                    if (field843[var164] == var161) {
                        var163 = true;
                        break;
                    }
                }
                if (Statics.field265.method1724(new class283(var155, Statics.field3649))) {
                    var163 = true;
                }
                if (!var163 && field738 == 0) {
                    field843[field844] = var161;
                    field844 = (field844 + 1) % 100;
                    String var165 = class296.method4987(class291.method3357(class211.method722(var3)));
                    byte var166;
                    if (var160.field3072) {
                        var166 = 7;
                    } else {
                        var166 = 3;
                    }
                    if (var160.field3070 == -1) {
                        class92.method3602(var166, var155, var165);
                    } else {
                        class92.method3602(var166, class82.method248(var160.field3070) + var155, var165);
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1291) {
                if (field700 != -1) {
                    method3166(field700, 0);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1291) {
                boolean var167 = var3.method5102();
                if (!var167) {
                    Statics.field1922 = null;
                } else if (Statics.field1922 == null) {
                    Statics.field1922 = new class238();
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1291) {
                field658 = var3.method5054() * 30;
                field821 = field809;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1291) {
                int var168 = var3.method5054();
                int var169 = var3.method5179();
                int var170 = var3.method5054();
                method111(var168, var169, var170);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1291) {
                int var171 = var3.method5091();
                int var172 = var3.method5058();
                class218 var173 = class218.method3998(var172);
                if (var173.field2590 != 2 || var173.field2591 != var171) {
                    var173.field2590 = 2;
                    var173.field2591 = var171;
                    method1717(var173);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1291) {
                int var174 = var3.method5099();
                class218 var175 = class218.method3998(var174);
                for (int var176 = 0; var176 < var175.field2649.length; var176++) {
                    var175.field2649[var176] = -1;
                    var175.field2649[var176] = 0;
                }
                method1717(var175);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1291) {
                if (arg0.field1290 == 0) {
                    Statics.field902 = null;
                } else {
                    if (Statics.field902 == null) {
                        Statics.field902 = new class285(Statics.field3649, Statics.field260);
                    }
                    Statics.field902.method4791(var3);
                }
                method3033();
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1291) {
                String var177 = var3.method5150();
                long var178 = var3.method5221();
                long var180 = (long) var3.method5054();
                long var182 = (long) var3.method5169();
                class229 var184 = (class229) class196.method1723(class229.method3368(), var3.method5179());
                long var185 = (var180 << 32) + var182;
                boolean var187 = false;
                for (int var188 = 0; var188 < 100; var188++) {
                    if (field843[var188] == var185) {
                        var187 = true;
                        break;
                    }
                }
                if (var184.field3075 && Statics.field265.method1724(new class283(var177, Statics.field3649))) {
                    var187 = true;
                }
                if (!var187 && field738 == 0) {
                    field843[field844] = var185;
                    field844 = (field844 + 1) % 100;
                    String var189 = class296.method4987(class291.method3357(class211.method722(var3)));
                    if (var184.field3070 == -1) {
                        class92.method3178(9, var177, var189, class289.method4575(var178));
                    } else {
                        class92.method3178(9, class82.method248(var184.field3070) + var177, var189, class289.method4575(var178));
                    }
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2101 == arg0.field1291) {
                method3210(class186.field2306);
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2100 == arg0.field1291) {
                field708 = false;
                for (int var190 = 0; var190 < 5; var190++) {
                    field898[var190] = false;
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1291) {
                for (int var191 = 0; var191 < Statics.field3187; var191++) {
                    class241 var192 = class241.method157(var191);
                    if (var192 != null) {
                        class213.field2507[var191] = 0;
                        class213.field2503[var191] = 0;
                    }
                }
                method184();
                field801 += 32;
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1291) {
                class72 var193 = new class72();
                var193.field1000 = var3.method5150();
                var193.field997 = var3.method5054();
                int var194 = var3.method5056();
                var193.field998 = var194;
                method2603(45);
                var2.method3223();
                Object var195 = null;
                class86.method1052(var193);
                arg0.field1291 = null;
                return false;
            }
            if (class183.field2117 == arg0.field1291) {
                int var196 = var3.method5056();
                String var197 = var3.method5150();
                class218 var198 = class218.method3998(var196);
                if (!var197.equals(var198.field2635)) {
                    var198.field2635 = var197;
                    method1717(var198);
                }
                arg0.field1291 = null;
                return true;
            }
            if (class183.field2106 == arg0.field1291) {
                method3210(class186.field2300);
                arg0.field1291 = null;
                return true;
            }
            class341.method40("" + (arg0.field1291 == null ? -1 : arg0.field1291.field2112) + class82.field1118 + (arg0.field1297 == null ? -1 : arg0.field1297.field2112) + class82.field1118 + (arg0.field1292 == null ? -1 : arg0.field1292.field2112) + class82.field1118 + arg0.field1290, (Throwable) null);
            method1059();
        } catch (IOException var203) {
            method18();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1291 == null ? -1 : arg0.field1291.field2112) + class82.field1118 + (arg0.field1297 == null ? -1 : arg0.field1297.field2112) + class82.field1118 + (arg0.field1292 == null ? -1 : arg0.field1292.field2112) + class82.field1118 + arg0.field1290 + class82.field1118 + (Statics.field1299 + Statics.field177.field975[0]) + class82.field1118 + (Statics.field2085 + Statics.field177.field945[0]) + class82.field1118;
            for (int var202 = 0; var202 < arg0.field1290 && var202 < 50; var202++) {
                var201 = var201 + var3.field3701[var202] + class82.field1118;
            }
            class341.method40(var201, var204);
            method1059();
        }
        return true;
    }

    @ObfuscatedName("fh.hr(Lgt;I)V")
    public static final void method3210(class186 arg0) {
        class299 var1 = field828.field1293;
        if (class186.field2301 == arg0) {
            int var2 = var1.method5082();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field666[var3];
            int var6 = var1.method5081();
            int var7 = (var6 >> 4 & 0x7) + Statics.field284;
            int var8 = (var6 & 0x7) + Statics.field2508;
            int var9 = var1.method5054();
            if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                if (var5 == 0) {
                    class137 var10 = Statics.field619.method2850(Statics.field519, var7, var8);
                    if (var10 != null) {
                        int var11 = class129.method3026(var10.field1854);
                        if (var3 == 2) {
                            var10.field1857 = new class94(var11, 2, var4 + 4, Statics.field519, var7, var8, var9, false, var10.field1857);
                            var10.field1858 = new class94(var11, 2, var4 + 1 & 0x3, Statics.field519, var7, var8, var9, false, var10.field1858);
                        } else {
                            var10.field1857 = new class94(var11, var3, var4, Statics.field519, var7, var8, var9, false, var10.field1857);
                        }
                    }
                }
                if (var5 == 1) {
                    class142 var12 = Statics.field619.method2851(Statics.field519, var7, var8);
                    if (var12 != null) {
                        int var13 = class129.method3026(var12.field1895);
                        if (var3 == 4 || var3 == 5) {
                            var12.field1901 = new class94(var13, 4, var4, Statics.field519, var7, var8, var9, false, var12.field1901);
                        } else if (var3 == 6) {
                            var12.field1901 = new class94(var13, 4, var4 + 4, Statics.field519, var7, var8, var9, false, var12.field1901);
                        } else if (var3 == 7) {
                            var12.field1901 = new class94(var13, 4, (var4 + 2 & 0x3) + 4, Statics.field519, var7, var8, var9, false, var12.field1901);
                        } else if (var3 == 8) {
                            var12.field1901 = new class94(var13, 4, var4 + 4, Statics.field519, var7, var8, var9, false, var12.field1901);
                            var12.field1902 = new class94(var13, 4, (var4 + 2 & 0x3) + 4, Statics.field519, var7, var8, var9, false, var12.field1902);
                        }
                    }
                }
                if (var5 == 2) {
                    class143 var14 = Statics.field619.method2852(Statics.field519, var7, var8);
                    if (var3 == 11) {
                        var3 = 10;
                    }
                    if (var14 != null) {
                        var14.field1911 = new class94(class129.method3026(var14.field1919), var3, var4, Statics.field519, var7, var8, var9, false, var14.field1911);
                    }
                }
                if (var5 == 3) {
                    class124 var15 = Statics.field619.method2853(Statics.field519, var7, var8);
                    if (var15 != null) {
                        var15.field1594 = new class94(class129.method3026(var15.field1591), 22, var4, Statics.field519, var7, var8, var9, false, var15.field1594);
                    }
                }
            }
        } else if (class186.field2302 == arg0) {
            int var16 = var1.method5089();
            int var17 = var1.method5091();
            int var18 = var1.method5089();
            int var19 = var1.method5080();
            int var20 = (var19 >> 4 & 0x7) + Statics.field284;
            int var21 = (var19 & 0x7) + Statics.field2508;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class262 var22 = field752[Statics.field519][var20][var21];
                if (var22 != null) {
                    for (class88 var23 = (class88) var22.method4480(); var23 != null; var23 = (class88) var22.method4491()) {
                        if ((var16 & 0x7FFF) == var23.field1212 && var23.field1211 == var18) {
                            var23.field1211 = var17;
                            break;
                        }
                    }
                    method3352(var20, var21);
                }
            }
        } else if (class186.field2300 == arg0) {
            int var24 = var1.method5054();
            int var25 = var1.method5080();
            int var26 = var1.method5090();
            int var27 = var1.method5179();
            int var28 = (var27 >> 4 & 0x7) + Statics.field284;
            int var29 = (var27 & 0x7) + Statics.field2508;
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                int var30 = var28 * 128 + 64;
                int var31 = var29 * 128 + 64;
                class78 var32 = new class78(var24, Statics.field519, var30, var31, method79(var30, var31, Statics.field519) - var25, var26, field635);
                field755.method4475(var32);
            }
        } else if (class186.field2307 == arg0) {
            int var33 = var1.method5082() * 4;
            int var34 = var1.method5054();
            int var35 = var1.method5090();
            int var36 = var1.method5082() * 4;
            int var37 = var1.method5092();
            int var38 = var1.method5179();
            int var39 = var1.method5082();
            int var40 = var1.method5089();
            int var41 = var1.method5080();
            int var42 = (var41 >> 4 & 0x7) + Statics.field284;
            int var43 = (var41 & 0x7) + Statics.field2508;
            byte var44 = var1.method5260();
            byte var45 = var1.method5065();
            int var46 = var42 + var45;
            int var47 = var43 + var44;
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var35 != 65535) {
                int var48 = var42 * 128 + 64;
                int var49 = var43 * 128 + 64;
                int var50 = var46 * 128 + 64;
                int var51 = var47 * 128 + 64;
                class87 var52 = new class87(var35, Statics.field519, var48, var49, method79(var48, var49, Statics.field519) - var36, field635 + var40, field635 + var34, var38, var39, var37, var33);
                var52.method1914(var50, var51, method79(var50, var51, Statics.field519) - var33, field635 + var40);
                field754.method4475(var52);
            }
        } else if (class186.field2303 == arg0) {
            int var53 = var1.method5082();
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = field666[var54];
            int var57 = var1.method5082();
            int var58 = (var57 >> 4 & 0x7) + Statics.field284;
            int var59 = (var57 & 0x7) + Statics.field2508;
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                Statics.method3760(Statics.field519, var58, var59, var56, -1, var54, var55, 0, -1);
            }
        } else if (class186.field2298 == arg0) {
            int var60 = var1.method5080();
            int var61 = (var60 >> 4 & 0x7) + Statics.field284;
            int var62 = (var60 & 0x7) + Statics.field2508;
            int var63 = var1.method5091();
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                class262 var64 = field752[Statics.field519][var61][var62];
                if (var64 != null) {
                    for (class88 var65 = (class88) var64.method4480(); var65 != null; var65 = (class88) var64.method4491()) {
                        if ((var63 & 0x7FFF) == var65.field1212) {
                            var65.method3304();
                            break;
                        }
                    }
                    if (var64.method4480() == null) {
                        field752[Statics.field519][var61][var62] = null;
                    }
                    method3352(var61, var62);
                }
            }
        } else {
            if (class186.field2305 == arg0) {
                int var66 = var1.method5179();
                int var67 = (var66 >> 4 & 0x7) + Statics.field284;
                int var68 = (var66 & 0x7) + Statics.field2508;
                int var69 = var1.method5082();
                int var70 = var1.method5080();
                int var71 = var70 >> 4 & 0xF;
                int var72 = var70 & 0x7;
                int var73 = var1.method5091();
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    int var74 = var71 + 1;
                    if (Statics.field177.field975[0] >= var67 - var74 && Statics.field177.field975[0] <= var67 + var74 && Statics.field177.field945[0] >= var68 - var74 && Statics.field177.field945[0] <= var68 + var74 && field861 != 0 && var72 > 0 && field748 < 50) {
                        field863[field748] = var73;
                        field712[field748] = var72;
                        field865[field748] = var69;
                        field629[field748] = null;
                        field866[field748] = (var67 << 16) + (var68 << 8) + var71;
                        field748++;
                    }
                }
            }
            if (class186.field2304 == arg0) {
                int var75 = var1.method5090();
                int var76 = var1.method5091();
                int var77 = var1.method5080();
                int var78 = (var77 >> 4 & 0x7) + Statics.field284;
                int var79 = (var77 & 0x7) + Statics.field2508;
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class88 var80 = new class88();
                    var80.field1212 = var76;
                    var80.field1211 = var75;
                    if (field752[Statics.field519][var78][var79] == null) {
                        field752[Statics.field519][var78][var79] = new class262();
                    }
                    field752[Statics.field519][var78][var79].method4475(var80);
                    method3352(var78, var79);
                }
            } else {
                if (class186.field2299 == arg0) {
                    byte var81 = var1.method5065();
                    int var82 = var1.method5091();
                    byte var83 = var1.method5065();
                    int var84 = var1.method5090();
                    int var85 = var1.method5054();
                    int var86 = var1.method5080();
                    int var87 = var86 >> 2;
                    int var88 = var86 & 0x3;
                    int var89 = field666[var87];
                    byte var90 = var1.method5260();
                    int var91 = var1.method5089();
                    byte var92 = var1.method5065();
                    int var93 = var1.method5081();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field284;
                    int var95 = (var93 & 0x7) + Statics.field2508;
                    class67 var96;
                    if (field741 == var91) {
                        var96 = Statics.field177;
                    } else {
                        var96 = field740[var91];
                    }
                    if (var96 != null) {
                        class254 var97 = class254.method3676(var84);
                        int var98;
                        int var99;
                        if (var88 == 1 || var88 == 3) {
                            var98 = var97.field3347;
                            var99 = var97.field3372;
                        } else {
                            var98 = var97.field3372;
                            var99 = var97.field3347;
                        }
                        int var100 = (var98 >> 1) + var94;
                        int var101 = (var98 + 1 >> 1) + var94;
                        int var102 = (var99 >> 1) + var95;
                        int var103 = (var99 + 1 >> 1) + var95;
                        int[][] var104 = class56.field472[Statics.field519];
                        int var105 = var104[var100][var102] + var104[var101][var102] + var104[var100][var103] + var104[var101][var103] >> 2;
                        int var106 = (var94 << 7) + (var98 << 6);
                        int var107 = (var95 << 7) + (var99 << 6);
                        class128 var108 = var97.method4230(var87, var88, var104, var106, var105, var107);
                        if (var108 != null) {
                            Statics.method3760(Statics.field519, var94, var95, var89, -1, 0, 0, var85 + 1, var82 + 1);
                            var96.field593 = field635 + var85;
                            var96.field599 = field635 + var82;
                            var96.field603 = var108;
                            var96.field600 = var94 * 128 + var98 * 64;
                            var96.field602 = var95 * 128 + var99 * 64;
                            var96.field592 = var105;
                            if (var81 > var92) {
                                byte var109 = var81;
                                var81 = var92;
                                var92 = var109;
                            }
                            if (var90 > var83) {
                                byte var110 = var90;
                                var90 = var83;
                                var83 = var110;
                            }
                            var96.field604 = var81 + var94;
                            var96.field617 = var92 + var94;
                            var96.field605 = var90 + var95;
                            var96.field607 = var83 + var95;
                        }
                    }
                }
                if (class186.field2306 == arg0) {
                    int var111 = var1.method5080();
                    int var112 = (var111 >> 4 & 0x7) + Statics.field284;
                    int var113 = (var111 & 0x7) + Statics.field2508;
                    int var114 = var1.method5082();
                    int var115 = var114 >> 2;
                    int var116 = var114 & 0x3;
                    int var117 = field666[var115];
                    int var118 = var1.method5090();
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                        Statics.method3760(Statics.field519, var112, var113, var117, var118, var115, var116, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.hg(I)V")
    public static final void method2033() {
        for (class69 var0 = (class69) field879.method4480(); var0 != null; var0 = (class69) field879.method4491()) {
            if (var0.field914 == -1) {
                var0.field913 = 0;
                method521(var0);
            } else {
                var0.method3304();
            }
        }
    }

    @ObfuscatedName("ao.hi(Lbm;I)V")
    public static final void method521(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field906 == 0) {
            var1 = Statics.field619.method2854(arg0.field910, arg0.field903, arg0.field909);
        }
        if (arg0.field906 == 1) {
            var1 = Statics.field619.method2943(arg0.field910, arg0.field903, arg0.field909);
        }
        if (arg0.field906 == 2) {
            var1 = Statics.field619.method2856(arg0.field910, arg0.field903, arg0.field909);
        }
        if (arg0.field906 == 3) {
            var1 = Statics.field619.method2857(arg0.field910, arg0.field903, arg0.field909);
        }
        if (var1 != 0L) {
            int var6 = Statics.field619.method3004(arg0.field910, arg0.field903, arg0.field909, var1);
            var3 = class129.method3026(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field907 = var3;
        arg0.field904 = var4;
        arg0.field908 = var5;
    }

    @ObfuscatedName("dy.hd(I)V")
    public static final void method2606() {
        for (class69 var0 = (class69) field879.method4480(); var0 != null; var0 = (class69) field879.method4491()) {
            if (var0.field914 > 0) {
                var0.field914--;
            }
            if (var0.field914 != 0) {
                if (var0.field913 > 0) {
                    var0.field913--;
                }
                if (var0.field913 == 0 && var0.field903 >= 1 && var0.field909 >= 1 && var0.field903 <= 102 && var0.field909 <= 102 && (var0.field905 < 0 || class56.method346(var0.field905, var0.field912))) {
                    method2027(var0.field910, var0.field906, var0.field903, var0.field909, var0.field905, var0.field911, var0.field912);
                    var0.field913 = -1;
                    if (var0.field907 == var0.field905 && var0.field907 == -1) {
                        var0.method3304();
                    } else if (var0.field907 == var0.field905 && var0.field911 == var0.field908 && var0.field912 == var0.field904) {
                        var0.method3304();
                    }
                }
            } else if (var0.field907 < 0 || class56.method346(var0.field907, var0.field904)) {
                method2027(var0.field910, var0.field906, var0.field903, var0.field909, var0.field907, var0.field908, var0.field904);
                var0.method3304();
            }
        }
    }

    @ObfuscatedName("cr.hy(IIIIIIIB)V")
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field829 && Statics.field519 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field619.method2854(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field619.method2943(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field619.method2856(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field619.method2857(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field619.method3004(arg0, arg2, arg3, var7);
            int var13 = class129.method3026(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field619.method2845(arg0, arg2, arg3);
                class254 var16 = class254.method3676(var13);
                if (var16.field3348 != 0) {
                    field892[arg0].method3260(arg2, arg3, var14, var15, var16.field3334);
                }
            }
            if (arg1 == 1) {
                Statics.field619.method2846(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field619.method2847(arg0, arg2, arg3);
                class254 var17 = class254.method3676(var13);
                if (var17.field3372 + arg2 > 103 || var17.field3372 + arg3 > 103 || var17.field3347 + arg2 > 103 || var17.field3347 + arg3 > 103) {
                    return;
                }
                if (var17.field3348 != 0) {
                    field892[arg0].method3261(arg2, arg3, var17.field3372, var17.field3347, var15, var17.field3334);
                }
            }
            if (arg1 == 3) {
                Statics.field619.method2975(arg0, arg2, arg3);
                class254 var18 = class254.method3676(var13);
                if (var18.field3348 == 1) {
                    field892[arg0].method3290(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field473[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class56.method1558(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field619, field892[arg0]);
    }

    @ObfuscatedName("gw.hw(III)V")
    public static final void method3352(int arg0, int arg1) {
        class262 var2 = field752[Statics.field519][arg0][arg1];
        if (var2 == null) {
            Statics.field619.method2849(Statics.field519, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4480(); var6 != null; var6 = (class88) var2.method4491()) {
            class255 var7 = class255.method144(var6.field1212);
            long var8 = (long) var7.field3402;
            if (var7.field3401 == 1) {
                var8 = (long) (var6.field1211 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field619.method2849(Statics.field519, arg0, arg1);
            return;
        }
        var2.method4476(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4480(); var12 != null; var12 = (class88) var2.method4491()) {
            if (var5.field1212 != var12.field1212) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1212 != var12.field1212 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method349(arg0, arg1, 3, false, 0);
        Statics.field619.method3015(Statics.field519, arg0, arg1, method79(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field519), var5, var13, var10, var11);
    }

    @ObfuscatedName("d.hs(ZLkx;B)V")
    public static final void method98(boolean arg0, class299 arg1) {
        field900 = 0;
        field862 = 0;
        method114();
        method3028(arg0, arg1);
        method89(arg1);
        for (int var2 = 0; var2 < field900; var2++) {
            int var3 = field656[var2];
            if (field635 != field746[var3].field968) {
                field746[var3].field1104 = null;
                field746[var3] = null;
            }
        }
        if (field828.field1290 != arg1.field3704) {
            throw new RuntimeException(arg1.field3704 + class82.field1118 + field828.field1290);
        }
        for (int var4 = 0; var4 < field667; var4++) {
            if (field746[field808[var4]] == null) {
                throw new RuntimeException(var4 + class82.field1118 + field667);
            }
        }
    }

    @ObfuscatedName("f.hp(B)V")
    public static final void method114() {
        class299 var0 = field828.field1293;
        var0.method5000();
        int var1 = var0.method5001(8);
        if (var1 < field667) {
            for (int var2 = var1; var2 < field667; var2++) {
                field656[++field900 - 1] = field808[var2];
            }
        }
        if (var1 > field667) {
            throw new RuntimeException("");
        }
        field667 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field808[var3];
            class80 var5 = field746[var4];
            int var6 = var0.method5001(1);
            if (var6 == 0) {
                field808[++field667 - 1] = var4;
                var5.field968 = field635;
            } else {
                int var7 = var0.method5001(2);
                if (var7 == 0) {
                    field808[++field667 - 1] = var4;
                    var5.field968 = field635;
                    field670[++field862 - 1] = var4;
                } else if (var7 == 1) {
                    field808[++field667 - 1] = var4;
                    var5.field968 = field635;
                    int var8 = var0.method5001(3);
                    var5.method1852(var8, (byte) 1);
                    int var9 = var0.method5001(1);
                    if (var9 == 1) {
                        field670[++field862 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field808[++field667 - 1] = var4;
                    var5.field968 = field635;
                    int var10 = var0.method5001(3);
                    var5.method1852(var10, (byte) 2);
                    int var11 = var0.method5001(3);
                    var5.method1852(var11, (byte) 2);
                    int var12 = var0.method5001(1);
                    if (var12 == 1) {
                        field670[++field862 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field656[++field900 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ey.hk(ZLkx;B)V")
    public static final void method3028(boolean arg0, class299 arg1) {
        while (true) {
            if (arg1.method5003(field828.field1290) >= 27) {
                int var2 = arg1.method5001(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field746[var2] == null) {
                        field746[var2] = new class80();
                        var3 = true;
                    }
                    class80 var4 = field746[var2];
                    field808[++field667 - 1] = var2;
                    var4.field968 = field635;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method5001(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method5001(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method5001(1);
                    int var7 = field750[arg1.method5001(3)];
                    if (var3) {
                        var4.field932 = var4.field919 = var7;
                    }
                    int var8 = arg1.method5001(1);
                    if (var8 == 1) {
                        field670[++field862 - 1] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5001(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5001(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1104 = class257.method2739(arg1.method5001(14));
                    var4.field921 = var4.field1104.field3451;
                    var4.field972 = var4.field1104.field3474;
                    if (var4.field972 == 0) {
                        var4.field919 = 0;
                    }
                    var4.field929 = var4.field1104.field3443;
                    var4.field933 = var4.field1104.field3454;
                    var4.field928 = var4.field1104.field3455;
                    var4.field926 = var4.field1104.field3456;
                    var4.field917 = var4.field1104.field3450;
                    var4.field970 = var4.field1104.field3462;
                    var4.field978 = var4.field1104.field3441;
                    var4.method1858(Statics.field177.field975[0] + var5, Statics.field177.field945[0] + var9, var6 == 1);
                    continue;
                }
            }
            arg1.method5002();
            return;
        }
    }

    @ObfuscatedName("d.hj(Lkx;I)V")
    public static final void method89(class299 arg0) {
        for (int var1 = 0; var1 < field862; var1++) {
            int var2 = field670[var1];
            class80 var3 = field746[var2];
            int var4 = arg0.method5179();
            if ((var4 & 0x1) != 0) {
                var3.field925 = arg0.method5089();
                if (var3.field925 == 65535) {
                    var3.field925 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = arg0.method5091();
                int var6 = arg0.method5091();
                int var7 = var3.field957 - (var5 - Statics.field1299 - Statics.field1299) * 64;
                int var8 = var3.field918 - (var6 - Statics.field2085 - Statics.field2085) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field947 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var9 = arg0.method5054();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method5082();
                if (var3.field924 == var9 && var9 != -1) {
                    int var11 = Statics.method3725(var9).field3493;
                    if (var11 == 1) {
                        var3.field952 = 0;
                        var3.field953 = 0;
                        var3.field954 = var10;
                        var3.field965 = 0;
                    }
                    if (var11 == 2) {
                        var3.field965 = 0;
                    }
                } else if (var9 == -1 || var3.field924 == -1 || Statics.method3725(var9).field3509 >= Statics.method3725(var3.field924).field3509) {
                    var3.field924 = var9;
                    var3.field952 = 0;
                    var3.field953 = 0;
                    var3.field954 = var10;
                    var3.field965 = 0;
                    var3.field948 = var3.field973;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1104 = class257.method2739(arg0.method5054());
                var3.field921 = var3.field1104.field3451;
                var3.field972 = var3.field1104.field3474;
                var3.field929 = var3.field1104.field3443;
                var3.field933 = var3.field1104.field3454;
                var3.field928 = var3.field1104.field3455;
                var3.field926 = var3.field1104.field3456;
                var3.field917 = var3.field1104.field3450;
                var3.field970 = var3.field1104.field3462;
                var3.field978 = var3.field1104.field3441;
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method5081();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method5113();
                        if (var17 == 32767) {
                            var17 = arg0.method5113();
                            var15 = arg0.method5113();
                            var14 = arg0.method5113();
                            var16 = arg0.method5113();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method5113();
                        }
                        int var18 = arg0.method5113();
                        var3.method1565(var17, var15, var14, var16, field635, var18);
                    }
                }
                int var19 = arg0.method5080();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method5113();
                        int var22 = arg0.method5113();
                        if (var22 == 32767) {
                            var3.method1564(var21);
                        } else {
                            int var23 = arg0.method5113();
                            int var24 = arg0.method5179();
                            int var25 = var22 > 0 ? arg0.method5082() : var24;
                            var3.method1563(var21, field635, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field956 = arg0.method5089();
                int var26 = arg0.method5099();
                var3.field960 = var26 >> 16;
                var3.field959 = (var26 & 0xFFFF) + field635;
                var3.field923 = 0;
                var3.field958 = 0;
                if (var3.field959 > field635) {
                    var3.field923 = -1;
                }
                if (var3.field956 == 65535) {
                    var3.field956 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field931 = arg0.method5150();
                var3.field938 = 100;
            }
        }
    }

    @ObfuscatedName("az.hb(III)Lfq;")
    public static class175 method478(int arg0, int arg1) {
        field685.field2086 = arg0;
        field685.field2082 = arg1;
        field685.field2083 = 1;
        field685.field2081 = 1;
        return field685;
    }

    @ObfuscatedName("bt.hx(B)V")
    public static void method1655() {
        field761 = 0;
        field760 = false;
        field766[0] = class225.field2987;
        field767[0] = "";
        field764[0] = 1006;
        field758[0] = false;
        field761 = 1;
    }

    @ObfuscatedName("b.hm(S)V")
    public static final void method153() {
        int var0 = Statics.field2005;
        int var1 = Statics.field1301;
        int var2 = Statics.field1005;
        int var3 = Statics.field5;
        int var4 = 6116423;
        class321.method5485(var0, var1, var2, var3, var4);
        class321.method5485(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class321.method5489(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field357.method4982(class225.field2895, var0 + 3, var1 + 14, var4, -1);
        int var5 = class55.field464;
        int var6 = class55.field461;
        for (int var7 = 0; var7 < field761; var7++) {
            int var8 = (field761 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class295 var10 = Statics.field357;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field767[var7].length() > 0) {
                var11 = field766[var7] + class225.field2902 + field767[var7];
            } else {
                var11 = field766[var7];
            }
            var10.method4982(var11, var0 + 3, var8, var9, 0);
        }
        Statics.method4765(Statics.field2005, Statics.field1301, Statics.field1005, Statics.field5);
    }

    @ObfuscatedName("dy.hq(IIIII)V")
    public static final void method2604(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field827; var4++) {
            if (field834[var4] + field832[var4] > arg0 && field832[var4] < arg0 + arg2 && field835[var4] + field824[var4] > arg1 && field824[var4] < arg1 + arg3) {
                field704[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ho(B)V")
    public final void method1165() {
        method479();
        if (Statics.field2326 != null || field797 != null) {
            return;
        }
        int var1 = class55.field462;
        if (field760) {
            if (var1 != 1 && (Statics.field1048 || var1 != 4)) {
                int var2 = class55.field464;
                int var3 = class55.field461;
                if (var2 < Statics.field2005 - 10 || var2 > Statics.field2005 + Statics.field1005 + 10 || var3 < Statics.field1301 - 10 || var3 > Statics.field5 + Statics.field1301 + 10) {
                    field760 = false;
                    method2604(Statics.field2005, Statics.field1301, Statics.field1005, Statics.field5);
                }
            }
            if (var1 == 1 || !Statics.field1048 && var1 == 4) {
                int var4 = Statics.field2005;
                int var5 = Statics.field1301;
                int var6 = Statics.field1005;
                int var7 = class55.field468;
                int var8 = class55.field469;
                int var9 = -1;
                for (int var10 = 0; var10 < field761; var10++) {
                    int var11 = (field761 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1 && var9 >= 0) {
                    int var12 = field842[var9];
                    int var13 = field763[var9];
                    int var14 = field764[var9];
                    int var15 = field845[var9];
                    String var16 = field766[var9];
                    String var17 = field767[var9];
                    method1937(var12, var13, var14, var15, var16, var17, class55.field468, class55.field469);
                }
                field760 = false;
                method2604(Statics.field2005, Statics.field1301, Statics.field1005, Statics.field5);
            }
            return;
        }
        int var18 = method1102();
        if ((var1 == 1 || !Statics.field1048 && var1 == 4) && var18 >= 0) {
            int var19 = field764[var18];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                label201: {
                    int var20 = field842[var18];
                    int var21 = field763[var18];
                    class218 var22 = class218.method3998(var21);
                    int var23 = method4095(var22);
                    boolean var24 = (var23 >> 28 & 0x1) != 0;
                    if (!var24) {
                        int var25 = method4095(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (!var26) {
                            break label201;
                        }
                    }
                    if (Statics.field2326 != null && !field868 && field761 > 0 && !this.method1127()) {
                        int var27 = field733;
                        int var28 = field745;
                        class83 var29 = Statics.field6;
                        method1937(var29.field1129, var29.field1128, var29.field1135, var29.field1136, var29.field1131, var29.field1131, var27, var28);
                        Statics.field6 = null;
                    }
                    field868 = false;
                    field691 = 0;
                    if (Statics.field2326 != null) {
                        method1717(Statics.field2326);
                    }
                    Statics.field2326 = class218.method3998(var21);
                    field732 = var20;
                    field733 = class55.field468;
                    field745 = class55.field469;
                    if (var18 >= 0) {
                        Statics.field6 = new class83();
                        Statics.field6.field1129 = field842[var18];
                        Statics.field6.field1128 = field763[var18];
                        Statics.field6.field1135 = field764[var18];
                        Statics.field6.field1136 = field845[var18];
                        Statics.field6.field1131 = field766[var18];
                    }
                    method1717(Statics.field2326);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field1048 && var1 == 4) && this.method1127()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field1048 && var1 == 4) && field761 > 0 && var18 >= 0) {
            int var30 = field842[var18];
            int var31 = field763[var18];
            int var32 = field764[var18];
            int var33 = field845[var18];
            String var34 = field766[var18];
            String var35 = field767[var18];
            method1937(var30, var31, var32, var33, var34, var35, class55.field468, class55.field469);
        }
        if (var1 == 2 && field761 > 0) {
            this.method1128(class55.field468, class55.field469);
        }
    }

    @ObfuscatedName("client.hf(I)Z")
    public final boolean method1127() {
        int var1 = method1102();
        return (field901 == 1 && field761 > 2 || method3317(var1)) && !field758[var1];
    }

    @ObfuscatedName("client.hu(IIB)V")
    public final void method1128(int arg0, int arg1) {
        method577(arg0, arg1);
        Statics.field619.method2865(Statics.field519, arg0, arg1, false);
        field760 = true;
    }

    @ObfuscatedName("c.hh(I)V")
    public static void method123() {
        method577(Statics.field1005 / 2 + Statics.field2005, Statics.field1301);
    }

    @ObfuscatedName("au.ha(III)V")
    public static void method577(int arg0, int arg1) {
        int var2 = Statics.field357.method4909(class225.field2895);
        for (int var3 = 0; var3 < field761; var3++) {
            class295 var4 = Statics.field357;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field767[var3].length() > 0) {
                var5 = field766[var3] + class225.field2902 + field767[var3];
            } else {
                var5 = field766[var3];
            }
            int var6 = var4.method4909(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field761 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field3255) {
            var8 = Statics.field3255 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field256) {
            var9 = Statics.field256 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field2005 = var8;
        Statics.field1301 = var9;
        Statics.field1005 = var2;
        Statics.field5 = field761 * 15 + 22;
    }

    @ObfuscatedName("gv.hv(II)Z")
    public static final boolean method3317(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field764[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cm.hn(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1003) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            class80 var8 = field746[arg3];
            if (var8 != null) {
                class257 var9 = var8.field1104;
                if (var9.field3471 != null) {
                    var9 = var9.method4323();
                }
                if (var9 != null) {
                    class188 var10 = class188.method1879(class184.field2216, field828.field1300);
                    var10.field2321.method5087(var9.field3445);
                    field828.method2049(var10);
                }
            }
        }
        if (arg2 == 45) {
            class67 var11 = field740[arg3];
            if (var11 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var12 = class188.method1879(class184.field2242, field828.field1300);
                var12.field2321.method5077(class46.field374[82] ? 1 : 0);
                var12.field2321.method5087(arg3);
                field828.method2049(var12);
            }
        }
        if (arg2 == 46) {
            class67 var13 = field740[arg3];
            if (var13 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var14 = class188.method1879(class184.field2248, field828.field1300);
                var14.field2321.method5087(arg3);
                var14.field2321.method5083(class46.field374[82] ? 1 : 0);
                field828.method2049(var14);
            }
        }
        if (arg2 == 1002) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            class188 var15 = class188.method1879(class184.field2240, field828.field1300);
            var15.field2321.method5087(arg3);
            field828.method2049(var15);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field290.method5830(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 3) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var16 = class188.method1879(class184.field2213, field828.field1300);
            var16.field2321.method5037(Statics.field2085 + arg1);
            var16.field2321.method5079(class46.field374[82] ? 1 : 0);
            var16.field2321.method5087(arg3);
            var16.field2321.method5076(Statics.field1299 + arg0);
            field828.method2049(var16);
        }
        if (arg2 == 10) {
            class80 var17 = field746[arg3];
            if (var17 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var18 = class188.method1879(class184.field2187, field828.field1300);
                var18.field2321.method5087(arg3);
                var18.field2321.method5083(class46.field374[82] ? 1 : 0);
                field828.method2049(var18);
            }
        }
        if (arg2 == 33) {
            class188 var19 = class188.method1879(class184.field2236, field828.field1300);
            var19.field2321.method5086(arg3);
            var19.field2321.method5096(arg1);
            var19.field2321.method5037(arg0);
            field828.method2049(var19);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 1005) {
            class218 var20 = class218.method3998(arg1);
            if (var20 == null || var20.field2672[arg0] < 100000) {
                class188 var21 = class188.method1879(class184.field2210, field828.field1300);
                var21.field2321.method5086(arg3);
                field828.method2049(var21);
            } else {
                class92.method3602(27, "", var20.field2672[arg0] + " x " + class255.method144(arg3).field3434);
            }
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 2) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var22 = class188.method1879(class184.field2278, field828.field1300);
            var22.field2321.method5083(class46.field374[82] ? 1 : 0);
            var22.field2321.method5037(Statics.field1299 + arg0);
            var22.field2321.method5087(arg3);
            var22.field2321.method5164(Statics.field3163);
            var22.field2321.method5037(field817);
            var22.field2321.method5086(Statics.field2085 + arg1);
            field828.method2049(var22);
        }
        if (arg2 == 30 && field790 == null) {
            method744(arg1, arg0);
            field790 = class218.method3020(arg1, arg0);
            method1717(field790);
        }
        if (arg2 == 28) {
            class188 var23 = class188.method1879(class184.field2255, field828.field1300);
            var23.field2321.method5166(arg1);
            field828.method2049(var23);
            class218 var24 = class218.method3998(arg1);
            if (var24.field2665 != null && var24.field2665[0][0] == 5) {
                int var25 = var24.field2665[0][1];
                class213.field2503[var25] = 1 - class213.field2503[var25];
                method1732(var25);
            }
        }
        if (arg2 == 19) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var26 = class188.method1879(class184.field2260, field828.field1300);
            var26.field2321.method5076(arg3);
            var26.field2321.method5087(Statics.field1299 + arg0);
            var26.field2321.method5037(Statics.field2085 + arg1);
            var26.field2321.method5083(class46.field374[82] ? 1 : 0);
            field828.method2049(var26);
        }
        if (arg2 == 7) {
            class80 var27 = field746[arg3];
            if (var27 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var28 = class188.method1879(class184.field2209, field828.field1300);
                var28.field2321.method5076(Statics.field2);
                var28.field2321.method5037(Statics.field2297);
                var28.field2321.method5076(arg3);
                var28.field2321.method5189(class46.field374[82] ? 1 : 0);
                var28.field2321.method5166(Statics.field3650);
                field828.method2049(var28);
            }
        }
        if (arg2 == 31) {
            class188 var29 = class188.method1879(class184.field2230, field828.field1300);
            var29.field2321.method5096(arg1);
            var29.field2321.method5164(Statics.field3650);
            var29.field2321.method5076(Statics.field2297);
            var29.field2321.method5086(Statics.field2);
            var29.field2321.method5086(arg0);
            var29.field2321.method5076(arg3);
            field828.method2049(var29);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 41) {
            class188 var30 = class188.method1879(class184.field2251, field828.field1300);
            var30.field2321.method5095(arg1);
            var30.field2321.method5087(arg0);
            var30.field2321.method5037(arg3);
            field828.method2049(var30);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 34) {
            class188 var31 = class188.method1879(class184.field2284, field828.field1300);
            var31.field2321.method5087(arg3);
            var31.field2321.method5164(arg1);
            var31.field2321.method5076(arg0);
            field828.method2049(var31);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 40) {
            class188 var32 = class188.method1879(class184.field2212, field828.field1300);
            var32.field2321.method5164(arg1);
            var32.field2321.method5086(arg0);
            var32.field2321.method5087(arg3);
            field828.method2049(var32);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 21) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var33 = class188.method1879(class184.field2215, field828.field1300);
            var33.field2321.method5087(Statics.field2085 + arg1);
            var33.field2321.method5086(arg3);
            var33.field2321.method5037(Statics.field1299 + arg0);
            var33.field2321.method5079(class46.field374[82] ? 1 : 0);
            field828.method2049(var33);
        }
        if (arg2 == 25) {
            class218 var34 = class218.method3020(arg1, arg0);
            if (var34 != null) {
                method470();
                method3746(arg1, arg0, class219.method472(method4095(var34)), var34.field2675);
                field777 = 0;
                field782 = method3292(var34);
                if (field782 == null) {
                    field782 = class225.field2929;
                }
                if (var34.field2546) {
                    field783 = var34.field2626 + class82.method159(16777215);
                } else {
                    field783 = class82.method159(65280) + var34.field2625 + class82.method159(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var35 = class188.method1879(class184.field2191, field828.field1300);
            var35.field2321.method5076(Statics.field2085 + arg1);
            var35.field2321.method5086(arg3);
            var35.field2321.method5086(Statics.field1299 + arg0);
            var35.field2321.method5083(class46.field374[82] ? 1 : 0);
            field828.method2049(var35);
        }
        if (arg2 == 24) {
            class218 var36 = class218.method3998(arg1);
            boolean var37 = true;
            if (var36.field2551 > 0) {
                var37 = method488(var36);
            }
            if (var37) {
                class188 var38 = class188.method1879(class184.field2255, field828.field1300);
                var38.field2321.method5166(arg1);
                field828.method2049(var38);
            }
        }
        if (arg2 == 6) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var39 = class188.method1879(class184.field2249, field828.field1300);
            var39.field2321.method5077(class46.field374[82] ? 1 : 0);
            var39.field2321.method5087(Statics.field2085 + arg1);
            var39.field2321.method5087(Statics.field1299 + arg0);
            var39.field2321.method5086(arg3);
            field828.method2049(var39);
        }
        if (arg2 == 5) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var40 = class188.method1879(class184.field2275, field828.field1300);
            var40.field2321.method5076(Statics.field1299 + arg0);
            var40.field2321.method5087(arg3);
            var40.field2321.method5076(Statics.field2085 + arg1);
            var40.field2321.method5077(class46.field374[82] ? 1 : 0);
            field828.method2049(var40);
        }
        if (arg2 == 1) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var41 = class188.method1879(class184.field2271, field828.field1300);
            var41.field2321.method5076(Statics.field2085 + arg1);
            var41.field2321.method5086(Statics.field2297);
            var41.field2321.method5077(class46.field374[82] ? 1 : 0);
            var41.field2321.method5095(Statics.field3650);
            var41.field2321.method5076(Statics.field1299 + arg0);
            var41.field2321.method5037(arg3);
            var41.field2321.method5086(Statics.field2);
            field828.method2049(var41);
        }
        if (arg2 == 50) {
            class67 var42 = field740[arg3];
            if (var42 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var43 = class188.method1879(class184.field2261, field828.field1300);
                var43.field2321.method5079(class46.field374[82] ? 1 : 0);
                var43.field2321.method5086(arg3);
                field828.method2049(var43);
            }
        }
        if (arg2 == 37) {
            class188 var44 = class188.method1879(class184.field2244, field828.field1300);
            var44.field2321.method5166(arg1);
            var44.field2321.method5037(arg0);
            var44.field2321.method5037(arg3);
            field828.method2049(var44);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 44) {
            class67 var45 = field740[arg3];
            if (var45 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var46 = class188.method1879(class184.field2273, field828.field1300);
                var46.field2321.method5037(arg3);
                var46.field2321.method5189(class46.field374[82] ? 1 : 0);
                field828.method2049(var46);
            }
        }
        if (arg2 == 39) {
            class188 var47 = class188.method1879(class184.field2232, field828.field1300);
            var47.field2321.method5076(arg3);
            var47.field2321.method5164(arg1);
            var47.field2321.method5086(arg0);
            field828.method2049(var47);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 49) {
            class67 var48 = field740[arg3];
            if (var48 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var49 = class188.method1879(class184.field2250, field828.field1300);
                var49.field2321.method5087(arg3);
                var49.field2321.method5079(class46.field374[82] ? 1 : 0);
                field828.method2049(var49);
            }
        }
        if (arg2 == 35) {
            class188 var50 = class188.method1879(class184.field2258, field828.field1300);
            var50.field2321.method5095(arg1);
            var50.field2321.method5076(arg0);
            var50.field2321.method5076(arg3);
            field828.method2049(var50);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 58) {
            class218 var51 = class218.method3020(arg1, arg0);
            if (var51 != null) {
                class188 var52 = class188.method1879(class184.field2247, field828.field1300);
                var52.field2321.method5086(field817);
                var52.field2321.method5164(arg1);
                var52.field2321.method5086(field737);
                var52.field2321.method5076(arg0);
                var52.field2321.method5166(Statics.field3163);
                var52.field2321.method5076(var51.field2675);
                field828.method2049(var52);
            }
        }
        if (arg2 == 36) {
            class188 var53 = class188.method1879(class184.field2189, field828.field1300);
            var53.field2321.method5076(arg3);
            var53.field2321.method5166(arg1);
            var53.field2321.method5076(arg0);
            field828.method2049(var53);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 12) {
            class80 var54 = field746[arg3];
            if (var54 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var55 = class188.method1879(class184.field2197, field828.field1300);
                var55.field2321.method5037(arg3);
                var55.field2321.method5077(class46.field374[82] ? 1 : 0);
                field828.method2049(var55);
            }
        }
        if (arg2 == 20) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var56 = class188.method1879(class184.field2192, field828.field1300);
            var56.field2321.method5086(Statics.field2085 + arg1);
            var56.field2321.method5079(class46.field374[82] ? 1 : 0);
            var56.field2321.method5086(Statics.field1299 + arg0);
            var56.field2321.method5086(arg3);
            field828.method2049(var56);
        }
        if (arg2 == 17) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var57 = class188.method1879(class184.field2218, field828.field1300);
            var57.field2321.method5096(Statics.field3163);
            var57.field2321.method5037(field817);
            var57.field2321.method5087(Statics.field2085 + arg1);
            var57.field2321.method5087(Statics.field1299 + arg0);
            var57.field2321.method5077(class46.field374[82] ? 1 : 0);
            var57.field2321.method5086(arg3);
            field828.method2049(var57);
        }
        if (arg2 == 1004) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            class188 var58 = class188.method1879(class184.field2210, field828.field1300);
            var58.field2321.method5086(arg3);
            field828.method2049(var58);
        }
        if (arg2 == 13) {
            class80 var59 = field746[arg3];
            if (var59 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var60 = class188.method1879(class184.field2217, field828.field1300);
                var60.field2321.method5083(class46.field374[82] ? 1 : 0);
                var60.field2321.method5087(arg3);
                field828.method2049(var60);
            }
        }
        if (arg2 == 32) {
            class188 var61 = class188.method1879(class184.field2188, field828.field1300);
            var61.field2321.method5096(Statics.field3163);
            var61.field2321.method5166(arg1);
            var61.field2321.method5037(arg0);
            var61.field2321.method5086(arg3);
            var61.field2321.method5086(field817);
            field828.method2049(var61);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 15) {
            class67 var62 = field740[arg3];
            if (var62 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var63 = class188.method1879(class184.field2241, field828.field1300);
                var63.field2321.method5164(Statics.field3163);
                var63.field2321.method5079(class46.field374[82] ? 1 : 0);
                var63.field2321.method5087(field817);
                var63.field2321.method5037(arg3);
                field828.method2049(var63);
            }
        }
        if (arg2 == 16) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var64 = class188.method1879(class184.field2252, field828.field1300);
            var64.field2321.method5096(Statics.field3650);
            var64.field2321.method5076(Statics.field2);
            var64.field2321.method5077(class46.field374[82] ? 1 : 0);
            var64.field2321.method5086(Statics.field2297);
            var64.field2321.method5076(arg3);
            var64.field2321.method5076(Statics.field1299 + arg0);
            var64.field2321.method5086(Statics.field2085 + arg1);
            field828.method2049(var64);
        }
        if (arg2 == 11) {
            class80 var65 = field746[arg3];
            if (var65 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var66 = class188.method1879(class184.field2219, field828.field1300);
                var66.field2321.method5076(arg3);
                var66.field2321.method5083(class46.field374[82] ? 1 : 0);
                field828.method2049(var66);
            }
        }
        if (arg2 == 8) {
            class80 var67 = field746[arg3];
            if (var67 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var68 = class188.method1879(class184.field2272, field828.field1300);
                var68.field2321.method5076(arg3);
                var68.field2321.method5189(class46.field374[82] ? 1 : 0);
                var68.field2321.method5095(Statics.field3163);
                var68.field2321.method5087(field817);
                field828.method2049(var68);
            }
        }
        if (arg2 == 9) {
            class80 var69 = field746[arg3];
            if (var69 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var70 = class188.method1879(class184.field2257, field828.field1300);
                var70.field2321.method5189(class46.field374[82] ? 1 : 0);
                var70.field2321.method5086(arg3);
                field828.method2049(var70);
            }
        }
        if (arg2 == 51) {
            class67 var71 = field740[arg3];
            if (var71 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var72 = class188.method1879(class184.field2274, field828.field1300);
                var72.field2321.method5189(class46.field374[82] ? 1 : 0);
                var72.field2321.method5076(arg3);
                field828.method2049(var72);
            }
        }
        if (arg2 == 43) {
            class188 var73 = class188.method1879(class184.field2269, field828.field1300);
            var73.field2321.method5037(arg3);
            var73.field2321.method5096(arg1);
            var73.field2321.method5037(arg0);
            field828.method2049(var73);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 4) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var74 = class188.method1879(class184.field2265, field828.field1300);
            var74.field2321.method5077(class46.field374[82] ? 1 : 0);
            var74.field2321.method5037(arg3);
            var74.field2321.method5037(Statics.field2085 + arg1);
            var74.field2321.method5037(Statics.field1299 + arg0);
            field828.method2049(var74);
        }
        if (arg2 == 1001) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var75 = class188.method1879(class184.field2288, field828.field1300);
            var75.field2321.method5037(arg3);
            var75.field2321.method5077(class46.field374[82] ? 1 : 0);
            var75.field2321.method5087(Statics.field1299 + arg0);
            var75.field2321.method5076(Statics.field2085 + arg1);
            field828.method2049(var75);
        }
        if (arg2 == 22) {
            field725 = arg6;
            field847 = arg7;
            field728 = 2;
            field727 = 0;
            field885 = arg0;
            field855 = arg1;
            class188 var76 = class188.method1879(class184.field2237, field828.field1300);
            var76.field2321.method5083(class46.field374[82] ? 1 : 0);
            var76.field2321.method5076(arg3);
            var76.field2321.method5087(Statics.field2085 + arg1);
            var76.field2321.method5037(Statics.field1299 + arg0);
            field828.method2049(var76);
        }
        if (arg2 == 23) {
            if (field760) {
                Statics.field619.method2866();
            } else {
                Statics.field619.method2865(Statics.field519, arg0, arg1, true);
            }
        }
        if (arg2 == 48) {
            class67 var77 = field740[arg3];
            if (var77 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var78 = class188.method1879(class184.field2263, field828.field1300);
                var78.field2321.method5077(class46.field374[82] ? 1 : 0);
                var78.field2321.method5087(arg3);
                field828.method2049(var78);
            }
        }
        if (arg2 == 42) {
            class188 var79 = class188.method1879(class184.field2194, field828.field1300);
            var79.field2321.method5166(arg1);
            var79.field2321.method5087(arg0);
            var79.field2321.method5037(arg3);
            field828.method2049(var79);
            field730 = 0;
            Statics.field979 = class218.method3998(arg1);
            field731 = arg0;
        }
        if (arg2 == 47) {
            class67 var80 = field740[arg3];
            if (var80 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var81 = class188.method1879(class184.field2280, field828.field1300);
                var81.field2321.method5076(arg3);
                var81.field2321.method5189(class46.field374[82] ? 1 : 0);
                field828.method2049(var81);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var82 = class218.method3020(arg1, arg0);
            if (var82 != null) {
                method1004(arg3, arg1, arg0, var82.field2675, arg5);
            }
        }
        if (arg2 == 26) {
            method4111();
        }
        if (arg2 == 38) {
            method470();
            class218 var83 = class218.method3998(arg1);
            field777 = 1;
            Statics.field2297 = arg0;
            Statics.field3650 = arg1;
            Statics.field2 = arg3;
            method1717(var83);
            field778 = class82.method159(16748608) + class255.method144(arg3).field3434 + class82.method159(16777215);
            if (field778 == null) {
                field778 = class225.field2929;
            }
            return;
        }
        if (arg2 == 14) {
            class67 var84 = field740[arg3];
            if (var84 != null) {
                field725 = arg6;
                field847 = arg7;
                field728 = 2;
                field727 = 0;
                field885 = arg0;
                field855 = arg1;
                class188 var85 = class188.method1879(class184.field2243, field828.field1300);
                var85.field2321.method5076(Statics.field2297);
                var85.field2321.method5079(class46.field374[82] ? 1 : 0);
                var85.field2321.method5096(Statics.field3650);
                var85.field2321.method5037(arg3);
                var85.field2321.method5037(Statics.field2);
                field828.method2049(var85);
            }
        }
        if (arg2 == 29) {
            class188 var86 = class188.method1879(class184.field2255, field828.field1300);
            var86.field2321.method5166(arg1);
            field828.method2049(var86);
            class218 var87 = class218.method3998(arg1);
            if (var87.field2665 != null && var87.field2665[0][0] == 5) {
                int var88 = var87.field2665[0][1];
                if (class213.field2503[var88] != var87.field2667[0]) {
                    class213.field2503[var88] = var87.field2667[0];
                    method1732(var88);
                }
            }
        }
        if (field777 != 0) {
            field777 = 0;
            method1717(class218.method3998(Statics.field3650));
        }
        if (field779) {
            method470();
        }
        if (Statics.field979 != null && field730 == 0) {
            method1717(Statics.field979);
        }
    }

    @ObfuscatedName("em.hl(ILjava/lang/String;B)V")
    public static void method3019(int arg0, String arg1) {
        int var2 = class90.field1230;
        int[] var3 = class90.field1225;
        boolean var4 = false;
        class283 var5 = new class283(arg1, Statics.field3649);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field740[var3[var6]];
            if (var7 != null && Statics.field177 != var7 && var7.field591 != null && var7.field591.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method1879(class184.field2273, field828.field1300);
                    var8.field2321.method5037(var3[var6]);
                    var8.field2321.method5189(0);
                    field828.method2049(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method1879(class184.field2280, field828.field1300);
                    var9.field2321.method5076(var3[var6]);
                    var9.field2321.method5189(0);
                    field828.method2049(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method1879(class184.field2250, field828.field1300);
                    var10.field2321.method5087(var3[var6]);
                    var10.field2321.method5079(0);
                    field828.method2049(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method1879(class184.field2261, field828.field1300);
                    var11.field2321.method5079(0);
                    var11.field2321.method5086(var3[var6]);
                    field828.method2049(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method3602(4, "", class225.field2875 + arg1);
        }
    }

    @ObfuscatedName("hq.hz(IIIIB)V")
    public static void method3746(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method3020(arg0, arg1);
        if (var4 != null && var4.field2644 != null) {
            class63 var5 = new class63();
            var5.field548 = var4;
            var5.field551 = var4.field2644;
            class77.method1875(var5);
        }
        field737 = arg3;
        field779 = true;
        Statics.field3163 = arg0;
        field817 = arg1;
        Statics.field138 = arg2;
        method1717(var4);
    }

    @ObfuscatedName("af.iw(I)V")
    public static void method470() {
        if (!field779) {
            return;
        }
        class218 var0 = class218.method3020(Statics.field3163, field817);
        if (var0 != null && var0.field2538 != null) {
            class63 var1 = new class63();
            var1.field548 = var0;
            var1.field551 = var0.field2538;
            class77.method1875(var1);
        }
        field779 = false;
        method1717(var0);
    }

    @ObfuscatedName("bw.id(III)V")
    public static void method744(int arg0, int arg1) {
        class188 var2 = class188.method1879(class184.field2193, field828.field1300);
        var2.field2321.method5164(arg0);
        var2.field2321.method5087(arg1);
        field828.method2049(var2);
    }

    @ObfuscatedName("bq.iy(IIIILjava/lang/String;I)V")
    public static void method1004(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method3020(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2653 != null) {
            class63 var6 = new class63();
            var6.field548 = var5;
            var6.field559 = arg0;
            var6.field554 = arg4;
            var6.field551 = var5.field2653;
            class77.method1875(var6);
        }
        boolean var7 = true;
        if (var5.field2551 > 0) {
            var7 = method488(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method4095(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class188 var11 = class188.method1879(class184.field2254, field828.field1300);
            var11.field2321.method5166(arg1);
            var11.field2321.method5037(arg2);
            var11.field2321.method5037(arg3);
            field828.method2049(var11);
        }
        if (arg0 == 2) {
            class188 var12 = class188.method1879(class184.field2207, field828.field1300);
            var12.field2321.method5166(arg1);
            var12.field2321.method5037(arg2);
            var12.field2321.method5037(arg3);
            field828.method2049(var12);
        }
        if (arg0 == 3) {
            class188 var13 = class188.method1879(class184.field2234, field828.field1300);
            var13.field2321.method5166(arg1);
            var13.field2321.method5037(arg2);
            var13.field2321.method5037(arg3);
            field828.method2049(var13);
        }
        if (arg0 == 4) {
            class188 var14 = class188.method1879(class184.field2205, field828.field1300);
            var14.field2321.method5166(arg1);
            var14.field2321.method5037(arg2);
            var14.field2321.method5037(arg3);
            field828.method2049(var14);
        }
        if (arg0 == 5) {
            class188 var15 = class188.method1879(class184.field2222, field828.field1300);
            var15.field2321.method5166(arg1);
            var15.field2321.method5037(arg2);
            var15.field2321.method5037(arg3);
            field828.method2049(var15);
        }
        if (arg0 == 6) {
            class188 var16 = class188.method1879(class184.field2245, field828.field1300);
            var16.field2321.method5166(arg1);
            var16.field2321.method5037(arg2);
            var16.field2321.method5037(arg3);
            field828.method2049(var16);
        }
        if (arg0 == 7) {
            class188 var17 = class188.method1879(class184.field2277, field828.field1300);
            var17.field2321.method5166(arg1);
            var17.field2321.method5037(arg2);
            var17.field2321.method5037(arg3);
            field828.method2049(var17);
        }
        if (arg0 == 8) {
            class188 var18 = class188.method1879(class184.field2200, field828.field1300);
            var18.field2321.method5166(arg1);
            var18.field2321.method5037(arg2);
            var18.field2321.method5037(arg3);
            field828.method2049(var18);
        }
        if (arg0 == 9) {
            class188 var19 = class188.method1879(class184.field2289, field828.field1300);
            var19.field2321.method5166(arg1);
            var19.field2321.method5037(arg2);
            var19.field2321.method5037(arg3);
            field828.method2049(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var20 = class188.method1879(class184.field2246, field828.field1300);
        var20.field2321.method5166(arg1);
        var20.field2321.method5037(arg2);
        var20.field2321.method5037(arg3);
        field828.method2049(var20);
    }

    @ObfuscatedName("aj.ic(S)V")
    public static final void method479() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field761 - 1; var1++) {
                if (field764[var1] < 1000 && field764[var1 + 1] > 1000) {
                    String var2 = field767[var1];
                    field767[var1] = field767[var1 + 1];
                    field767[var1 + 1] = var2;
                    String var3 = field766[var1];
                    field766[var1] = field766[var1 + 1];
                    field766[var1 + 1] = var3;
                    int var4 = field764[var1];
                    field764[var1] = field764[var1 + 1];
                    field764[var1 + 1] = var4;
                    int var5 = field842[var1];
                    field842[var1] = field842[var1 + 1];
                    field842[var1 + 1] = var5;
                    int var6 = field763[var1];
                    field763[var1] = field763[var1 + 1];
                    field763[var1 + 1] = var6;
                    int var7 = field845[var1];
                    field845[var1] = field845[var1 + 1];
                    field845[var1 + 1] = var7;
                    boolean var8 = field758[var1];
                    field758[var1] = field758[var1 + 1];
                    field758[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("b.ia(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method152(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3924(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("iy.iz(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method3924(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field760 || field761 >= 500) {
            return;
        }
        field766[field761] = arg0;
        field767[field761] = arg1;
        field764[field761] = arg2;
        field845[field761] = arg3;
        field842[field761] = arg4;
        field763[field761] = arg5;
        field758[field761] = arg6;
        field761++;
    }

    @ObfuscatedName("bd.in(B)I")
    public static final int method1102() {
        return field761 - 1;
    }

    @ObfuscatedName("gz.ip(IIIII)V")
    public static final void method3604(int arg0, int arg1, int arg2, int arg3) {
        if (field777 == 0 && !field779) {
            method152(class225.field2882, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1729;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class67 var15 = field740[field674];
                    method708(var15, field674, var11, var13);
                }
                return;
            }
            long var16 = class129.field1722[var8];
            if (var6 != var16) {
                label277: {
                    var6 = var16;
                    int var20 = Statics.method3734(var8);
                    int var21 = class129.method3045(var8);
                    int var22 = class129.method623(class129.field1722[var8]);
                    int var24 = class129.method3026(class129.field1722[var8]);
                    int var25 = var24;
                    if (var22 == 2 && Statics.field619.method3004(Statics.field519, var20, var21, var16) >= 0) {
                        class254 var26 = class254.method3676(var24);
                        if (var26.field3354 != null) {
                            var26 = var26.method4204();
                        }
                        if (var26 == null) {
                            break label277;
                        }
                        if (field777 == 1) {
                            method152(class225.field2892, field778 + " " + class82.field1121 + " " + class82.method159(65535) + var26.field3341, 1, var24, var20, var21);
                        } else if (!field779) {
                            String[] var27 = var26.field3358;
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
                                        method152(var27[var28], class82.method159(65535) + var26.field3341, var29, var25, var20, var21);
                                    }
                                }
                            }
                            method152(class225.field2893, class82.method159(65535) + var26.field3341, 1002, var26.field3338, var20, var21);
                        } else if ((Statics.field138 & 0x4) == 4) {
                            method152(field782, field783 + " " + class82.field1121 + " " + class82.method159(65535) + var26.field3341, 2, var24, var20, var21);
                        }
                    }
                    if (var22 == 1) {
                        class80 var30 = field746[var25];
                        if (var30 == null) {
                            break label277;
                        }
                        if (var30.field1104.field3451 == 1 && (var30.field957 & 0x7F) == 64 && (var30.field918 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field667; var31++) {
                                class80 var32 = field746[field808[var31]];
                                if (var32 != null && var30 != var32 && var32.field1104.field3451 == 1 && var30.field957 == var32.field957 && var30.field918 == var32.field918) {
                                    method1054(var32.field1104, field808[var31], var20, var21);
                                }
                            }
                            int var33 = class90.field1230;
                            int[] var34 = class90.field1225;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class67 var36 = field740[var34[var35]];
                                if (var36 != null && var30.field957 == var36.field957 && var30.field918 == var36.field918) {
                                    method708(var36, var34[var35], var20, var21);
                                }
                            }
                        }
                        method1054(var30.field1104, var25, var20, var21);
                    }
                    if (var22 == 0) {
                        class67 var37 = field740[var25];
                        if (var37 == null) {
                            break label277;
                        }
                        if ((var37.field957 & 0x7F) == 64 && (var37.field918 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field667; var38++) {
                                class80 var39 = field746[field808[var38]];
                                if (var39 != null && var39.field1104.field3451 == 1 && var37.field957 == var39.field957 && var37.field918 == var39.field918) {
                                    method1054(var39.field1104, field808[var38], var20, var21);
                                }
                            }
                            int var40 = class90.field1230;
                            int[] var41 = class90.field1225;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class67 var43 = field740[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field957 == var43.field957 && var37.field918 == var43.field918) {
                                    method708(var43, var41[var42], var20, var21);
                                }
                            }
                        }
                        if (field674 == var25) {
                            var4 = var16;
                        } else {
                            method708(var37, var25, var20, var21);
                        }
                    }
                    if (var22 == 3) {
                        class262 var44 = field752[Statics.field519][var20][var21];
                        if (var44 != null) {
                            for (class88 var45 = (class88) var44.method4481(); var45 != null; var45 = (class88) var44.method4483()) {
                                class255 var46 = class255.method144(var45.field1212);
                                if (field777 == 1) {
                                    method152(class225.field2892, field778 + " " + class82.field1121 + " " + class82.method159(16748608) + var46.field3434, 16, var45.field1212, var20, var21);
                                } else if (!field779) {
                                    String[] var47 = var46.field3397;
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
                                            method152(var47[var48], class82.method159(16748608) + var46.field3434, var49, var45.field1212, var20, var21);
                                        } else if (var48 == 2) {
                                            method152(class225.field2739, class82.method159(16748608) + var46.field3434, 20, var45.field1212, var20, var21);
                                        }
                                    }
                                    method152(class225.field2893, class82.method159(16748608) + var46.field3434, 1004, var45.field1212, var20, var21);
                                } else if ((Statics.field138 & 0x1) == 1) {
                                    method152(field782, field783 + " " + class82.field1121 + " " + class82.method159(16748608) + var46.field3434, 17, var45.field1212, var20, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("bf.il(Lii;IIII)V")
    public static final void method1054(class257 arg0, int arg1, int arg2, int arg3) {
        if (field761 >= 400) {
            return;
        }
        if (arg0.field3471 != null) {
            arg0 = arg0.method4323();
        }
        if (arg0 == null || !arg0.field3447 || arg0.field3476 && field794 != arg1) {
            return;
        }
        String var4 = arg0.field3446;
        if (arg0.field3463 != 0) {
            var4 = var4 + method3747(arg0.field3463, Statics.field177.field595) + " " + class82.field1120 + class225.field2898 + arg0.field3463 + class82.field1117;
        }
        if (arg0.field3476 && field769) {
            method152(class225.field2893, class82.method159(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field777 == 1) {
            method152(class225.field2892, field778 + " " + class82.field1121 + " " + class82.method159(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field779) {
            int var5 = arg0.field3476 && field769 ? 2000 : 0;
            String[] var6 = arg0.field3461;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class225.field2894)) {
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
                        method152(var6[var7], class82.method159(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class225.field2894)) {
                        short var10 = 0;
                        if (field699 != class85.field1142) {
                            if (field699 == class85.field1141 || field699 == class85.field1144 && arg0.field3463 > Statics.field177.field595) {
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
                            method152(var6[var9], class82.method159(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3476 || !field769) {
                method152(class225.field2893, class82.method159(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field138 & 0x2) == 2) {
            method152(field782, field783 + " " + class82.field1121 + " " + class82.method159(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.ie(Lbd;IIII)V")
    public static final void method708(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field177 == arg0 || field761 >= 400) {
            return;
        }
        String var4;
        if (arg0.field618 == 0) {
            var4 = arg0.field601[0] + arg0.field591 + arg0.field601[1] + method3747(arg0.field595, Statics.field177.field595) + " " + class82.field1120 + class225.field2898 + arg0.field595 + class82.field1117 + arg0.field601[2];
        } else {
            var4 = arg0.field601[0] + arg0.field591 + arg0.field601[1] + " " + class82.field1120 + class225.field2801 + arg0.field618 + class82.field1117 + arg0.field601[2];
        }
        if (field777 == 1) {
            method152(class225.field2892, field778 + " " + class82.field1121 + " " + class82.method159(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field779) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field668[var5] != null) {
                    short var6 = 0;
                    if (field668[var5].equalsIgnoreCase(class225.field2894)) {
                        if (field651 == class85.field1142) {
                            continue;
                        }
                        if (field651 == class85.field1141 || field651 == class85.field1144 && arg0.field595 > Statics.field177.field595) {
                            var6 = 2000;
                        }
                        if (Statics.field177.field609 != 0 && arg0.field609 != 0) {
                            if (Statics.field177.field609 == arg0.field609) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field749[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field747[var5] + var6;
                    method152(field668[var5], class82.method159(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field138 & 0x8) == 8) {
            method152(field782, field783 + " " + class82.field1121 + " " + class82.method159(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field761; var9++) {
            if (field764[var9] == 23) {
                field767[var9] = class82.method159(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ho.if(III)Ljava/lang/String;")
    public static final String method3747(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class82.method159(16711680);
        } else if (var2 < -6) {
            return class82.method159(16723968);
        } else if (var2 < -3) {
            return class82.method159(16740352);
        } else if (var2 < 0) {
            return class82.method159(16756736);
        } else if (var2 > 9) {
            return class82.method159(65280);
        } else if (var2 > 6) {
            return class82.method159(4259584);
        } else if (var2 > 3) {
            return class82.method159(8453888);
        } else if (var2 > 0) {
            return class82.method159(12648192);
        } else {
            return class82.method159(16776960);
        }
    }

    @ObfuscatedName("i.ig(IIIIIIIII)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method1922(arg0)) {
            Statics.field175 = null;
            method214(Statics.field2542[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field175 != null) {
                method214(Statics.field175, -1412584499, arg1, arg2, arg3, arg4, Statics.field987, Statics.field1649, arg7);
                Statics.field175 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field704[var8] = true;
            }
        } else {
            field704[arg7] = true;
        }
    }

    @ObfuscatedName("w.it([Lhp;IIIIIIIII)V")
    public static final void method214(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class321.method5483(arg2, arg3, arg4, arg5);
        class131.method2744();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2575 == arg1 || arg1 == -1412584499 && field797 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field832[field827] = var10.field2560 + arg6;
                    field824[field827] = var10.field2561 + arg7;
                    field834[field827] = var10.field2562;
                    field835[field827] = var10.field2563;
                    var11 = ++field827 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2684 = var11;
                var10.field2537 = field635;
                if (!var10.field2546 || !method252(var10)) {
                    if (var10.field2551 > 0) {
                        method3740(var10);
                    }
                    int var12 = var10.field2560 + arg6;
                    int var13 = var10.field2561 + arg7;
                    int var14 = var10.field2634;
                    if (field797 == var10) {
                        if (arg1 != -1412584499 && !var10.field2631) {
                            Statics.field175 = arg0;
                            Statics.field987 = arg6;
                            Statics.field1649 = arg7;
                            continue;
                        }
                        if (field687 && field642) {
                            int var15 = class55.field464;
                            int var16 = class55.field461;
                            int var17 = var15 - field799;
                            int var18 = var16 - field800;
                            if (var17 < field803) {
                                var17 = field803;
                            }
                            if (var10.field2562 + var17 > field803 + field798.field2562) {
                                var17 = field803 + field798.field2562 - var10.field2562;
                            }
                            if (var18 < field804) {
                                var18 = field804;
                            }
                            if (var10.field2563 + var18 > field804 + field798.field2563) {
                                var18 = field804 + field798.field2563 - var10.field2563;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2631) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2606 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2606 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2562 + var12;
                        int var26 = var10.field2563 + var13;
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
                        int var30 = var10.field2563 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2546 || var19 < var21 && var20 < var22) {
                        if (var10.field2551 != 0) {
                            if (var10.field2551 == 1336) {
                                if (field641) {
                                    var13 += 15;
                                    Statics.field2186.method4916("Fps:" + field421, var10.field2562 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field829) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2186.method4916("Mem:" + var32 + "k", var10.field2562 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2551 == 1337) {
                                field736 = var12;
                                field786 = var13;
                                method3997(var12, var13, var10.field2562, var10.field2563);
                                field704[var10.field2684] = true;
                                class321.method5483(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2551 == 1338) {
                                method2517(var10, var12, var13, var11);
                                class321.method5483(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2551 == 1339) {
                                method2284(var10, var12, var13, var11);
                                class321.method5483(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2551 == 1400) {
                                Statics.field290.method5790(var12, var13, var10.field2562, var10.field2563, field635);
                            }
                            if (var10.field2551 == 1401) {
                                Statics.field290.method5891(var12, var13, var10.field2562, var10.field2563);
                            }
                            if (var10.field2551 == 1402) {
                                Statics.field3844.method1627(var12, field635);
                            }
                        }
                        if (var10.field2606 == 0) {
                            if (!var10.field2546 && method252(var10) && Statics.field585 != var10) {
                                continue;
                            }
                            if (!var10.field2546) {
                                if (var10.field2569 > var10.field2633 - var10.field2563) {
                                    var10.field2569 = var10.field2633 - var10.field2563;
                                }
                                if (var10.field2569 < 0) {
                                    var10.field2569 = 0;
                                }
                            }
                            method214(arg0, var10.field2658, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2569, var11);
                            if (var10.field2677 != null) {
                                method214(var10.field2677, var10.field2658, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2569, var11);
                            }
                            class62 var34 = (class62) field854.method5434((long) var10.field2658);
                            if (var34 != null) {
                                method24(var34.field542, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class321.method5483(arg2, arg3, arg4, arg5);
                            class131.method2744();
                        }
                        if (field838 || field831[var11] || field836 > 1) {
                            if (var10.field2606 == 0 && !var10.field2546 && var10.field2633 > var10.field2563) {
                                method4165(var10.field2562 + var12, var13, var10.field2569, var10.field2563, var10.field2633);
                            }
                            if (var10.field2606 != 1) {
                                if (var10.field2606 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2559; var36++) {
                                        for (int var37 = 0; var37 < var10.field2614; var37++) {
                                            int var38 = (var10.field2564 + 32) * var37 + var12;
                                            int var39 = (var10.field2615 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2679[var35];
                                                var39 += var10.field2617[var35];
                                            }
                                            if (var10.field2649[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2649[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2326 == var10 && field732 == var35) {
                                                    class325 var43;
                                                    if (field777 == 1 && Statics.field2297 == var35 && Statics.field3650 == var10.field2658) {
                                                        var43 = class255.method3134(var42, var10.field2672[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method3134(var42, var10.field2672[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1717(var10);
                                                    } else if (Statics.field2326 == var10 && field732 == var35) {
                                                        int var44 = class55.field464 - field733;
                                                        int var45 = class55.field461 - field745;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field691 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5603(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class321.field3851 && var46.field2569 > 0) {
                                                                int var47 = field880 * (class321.field3851 - var39 - var45) / 3;
                                                                if (var47 > field880 * 10) {
                                                                    var47 = field880 * 10;
                                                                }
                                                                if (var47 > var46.field2569) {
                                                                    var47 = var46.field2569;
                                                                }
                                                                var46.field2569 -= var47;
                                                                field745 += var47;
                                                                method1717(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class321.field3850 && var46.field2569 < var46.field2633 - var46.field2563) {
                                                                int var48 = field880 * (var39 + var45 + 32 - class321.field3850) / 3;
                                                                if (var48 > field880 * 10) {
                                                                    var48 = field880 * 10;
                                                                }
                                                                if (var48 > var46.field2633 - var46.field2563 - var46.field2569) {
                                                                    var48 = var46.field2633 - var46.field2563 - var46.field2569;
                                                                }
                                                                var46.field2569 += var48;
                                                                field745 -= var48;
                                                                method1717(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field979 == var10 && field731 == var35) {
                                                        var43.method5603(var38, var39, 128);
                                                    } else {
                                                        var43.method5602(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2618 != null && var35 < 20) {
                                                class325 var49 = var10.method3695(var35);
                                                if (var49 != null) {
                                                    var49.method5602(var38, var39);
                                                } else if (class218.field2580) {
                                                    method1717(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2606 == 3) {
                                    int var50;
                                    if (method3136(var10)) {
                                        var50 = var10.field2573;
                                        if (Statics.field585 == var10 && var10.field2600 != 0) {
                                            var50 = var10.field2600;
                                        }
                                    } else {
                                        var50 = var10.field2572;
                                        if (Statics.field585 == var10 && var10.field2574 != 0) {
                                            var50 = var10.field2574;
                                        }
                                    }
                                    if (var10.field2576) {
                                        switch(var10.field2577.field3860) {
                                            case 1:
                                                class321.method5486(var12, var13, var10.field2562, var10.field2563, var10.field2572, var10.field2573);
                                                break;
                                            case 2:
                                                class321.method5532(var12, var13, var10.field2562, var10.field2563, var10.field2572, var10.field2573, 255 - (var10.field2634 & 0xFF), 255 - (var10.field2579 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class321.method5485(var12, var13, var10.field2562, var10.field2563, var50);
                                                } else {
                                                    class321.method5494(var12, var13, var10.field2562, var10.field2563, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class321.method5489(var12, var13, var10.field2562, var10.field2563, var50);
                                    } else {
                                        class321.method5490(var12, var13, var10.field2562, var10.field2563, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2606 == 4) {
                                    class295 var51 = var10.method3687();
                                    if (var51 != null) {
                                        String var52 = var10.field2635;
                                        int var53;
                                        if (method3136(var10)) {
                                            var53 = var10.field2573;
                                            if (Statics.field585 == var10 && var10.field2600 != 0) {
                                                var53 = var10.field2600;
                                            }
                                            if (var10.field2609.length() > 0) {
                                                var52 = var10.field2609;
                                            }
                                        } else {
                                            var53 = var10.field2572;
                                            if (Statics.field585 == var10 && var10.field2574 != 0) {
                                                var53 = var10.field2574;
                                            }
                                        }
                                        if (var10.field2546 && var10.field2675 != -1) {
                                            class255 var54 = class255.method144(var10.field2675);
                                            var52 = var54.field3434;
                                            if (var52 == null) {
                                                var52 = class225.field2929;
                                            }
                                            if ((var54.field3401 == 1 || var10.field2674 != 1) && var10.field2674 != -1) {
                                                var52 = class82.method159(16748608) + var52 + class82.field1124 + " " + 'x' + method3038(var10.field2674);
                                            }
                                        }
                                        if (field790 == var10) {
                                            var52 = class225.field2900;
                                            var53 = var10.field2572;
                                        }
                                        if (!var10.field2546) {
                                            var52 = method3358(var52, var10);
                                        }
                                        var51.method4918(var52, var12, var13, var10.field2562, var10.field2563, var53, var10.field2645 ? 0 : -1, var10.field2688, var10.field2541, var10.field2610);
                                    } else if (class218.field2580) {
                                        method1717(var10);
                                    }
                                } else if (var10.field2606 == 5) {
                                    if (var10.field2546) {
                                        class325 var56;
                                        if (var10.field2675 == -1) {
                                            var56 = var10.method3686(false);
                                        } else {
                                            var56 = class255.method3134(var10.field2675, var10.field2674, var10.field2586, var10.field2587, var10.field2540, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3876;
                                            int var58 = var56.field3873;
                                            if (var10.field2585) {
                                                class321.method5480(var12, var13, var10.field2562 + var12, var10.field2563 + var13);
                                                int var59 = (var10.field2562 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2563 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2584 != 0) {
                                                            var56.method5616(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2584, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5602(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5603(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class321.method5483(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2562 * 4096 / var57;
                                                if (var10.field2584 != 0) {
                                                    var56.method5616(var10.field2562 / 2 + var12, var10.field2563 / 2 + var13, var10.field2584, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5611(var12, var13, var10.field2562, var10.field2563, 256 - (var14 & 0xFF));
                                                } else if (var10.field2562 == var57 && var10.field2563 == var58) {
                                                    var56.method5602(var12, var13);
                                                } else {
                                                    var56.method5659(var12, var13, var10.field2562, var10.field2563);
                                                }
                                            }
                                        } else if (class218.field2580) {
                                            method1717(var10);
                                        }
                                    } else {
                                        class325 var55 = var10.method3686(method3136(var10));
                                        if (var55 != null) {
                                            var55.method5602(var12, var13);
                                        } else if (class218.field2580) {
                                            method1717(var10);
                                        }
                                    }
                                } else if (var10.field2606 == 6) {
                                    boolean var64 = method3136(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2595;
                                    } else {
                                        var65 = var10.field2594;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2675 != -1) {
                                        class255 var68 = class255.method144(var10.field2675);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4242(var10.field2674);
                                            var66 = var69.method4241(1);
                                            if (var66 == null) {
                                                method1717(var10);
                                            } else {
                                                var66.method2627();
                                                var67 = var66.field1851 / 2;
                                            }
                                        }
                                    } else if (var10.field2590 == 5) {
                                        if (var10.field2591 == 0) {
                                            var66 = field822.method3661((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field177.method1064();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3689((class259) null, -1, var64, Statics.field177.field590);
                                        if (var66 == null && class218.field2580) {
                                            method1717(var10);
                                        }
                                    } else {
                                        class259 var70 = Statics.method3725(var65);
                                        var66 = var10.method3689(var70, var10.field2685, var64, Statics.field177.field590);
                                        if (var66 == null && class218.field2580) {
                                            method1717(var10);
                                        }
                                    }
                                    class131.method2747(var10.field2562 / 2 + var12, var10.field2563 / 2 + var13);
                                    int var71 = var10.field2535 * class131.field1767[var10.field2598] >> 16;
                                    int var72 = var10.field2535 * class131.field1768[var10.field2598] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2546) {
                                            var66.method2627();
                                            if (var10.field2604) {
                                                var66.method2628(0, var10.field2599, var10.field2671, var10.field2598, var10.field2578, var10.field2597 + var67 + var71, var10.field2597 + var72, var10.field2535);
                                            } else {
                                                var66.method2692(0, var10.field2599, var10.field2671, var10.field2598, var10.field2578, var10.field2597 + var67 + var71, var10.field2597 + var72);
                                            }
                                        } else {
                                            var66.method2692(0, var10.field2599, 0, var10.field2598, 0, var71, var72);
                                        }
                                    }
                                    class131.method2814();
                                } else {
                                    if (var10.field2606 == 7) {
                                        class295 var73 = var10.method3687();
                                        if (var73 == null) {
                                            if (class218.field2580) {
                                                method1717(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2559; var75++) {
                                            for (int var76 = 0; var76 < var10.field2614; var76++) {
                                                if (var10.field2649[var74] > 0) {
                                                    class255 var77 = class255.method144(var10.field2649[var74] - 1);
                                                    String var78;
                                                    if (var77.field3401 != 1 && var10.field2672[var74] == 1) {
                                                        var78 = class82.method159(16748608) + var77.field3434 + class82.field1124;
                                                    } else {
                                                        var78 = class82.method159(16748608) + var77.field3434 + class82.field1124 + " " + 'x' + method3038(var10.field2672[var74]);
                                                    }
                                                    int var79 = (var10.field2564 + 115) * var76 + var12;
                                                    int var80 = (var10.field2615 + 12) * var75 + var13;
                                                    if (var10.field2688 == 0) {
                                                        var73.method4982(var78, var79, var80, var10.field2572, var10.field2645 ? 0 : -1);
                                                    } else if (var10.field2688 == 1) {
                                                        var73.method4965(var78, var10.field2562 / 2 + var79, var80, var10.field2572, var10.field2645 ? 0 : -1);
                                                    } else {
                                                        var73.method4916(var78, var10.field2562 + var79 - 1, var80, var10.field2572, var10.field2645 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2606 == 8 && Statics.field199 == var10 && field849 == field775) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class295 var83 = Statics.field2186;
                                        String var84 = var10.field2635;
                                        String var85 = method3358(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1119);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4909(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3688 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2562 + var12 - 5 - var81;
                                        int var90 = var10.field2563 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class321.method5485(var89, var90, var81, var82, 16777120);
                                        class321.method5489(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2635;
                                        int var92 = var83.field3688 + var90 + 2;
                                        String var93 = method3358(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1119);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4982(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3688 + 1;
                                        }
                                    }
                                    if (var10.field2606 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2602) {
                                            var96 = var12;
                                            var97 = var10.field2563 + var13;
                                            var98 = var10.field2562 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2562 + var12;
                                            var99 = var10.field2563 + var13;
                                        }
                                        if (var10.field2670 == 1) {
                                            class321.method5495(var96, var97, var98, var99, var10.field2572);
                                        } else {
                                            method3379(var96, var97, var98, var99, var10.field2572, var10.field2670);
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

    @ObfuscatedName("gc.im(IIIIIII)V")
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class321.field3853;
        int var18 = arg1 - class321.field3851;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2751(var19, var20, var21);
        class131.method2754(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2751(var19, var21, var22);
        class131.method2754(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("gw.is(Ljava/lang/String;Lhp;B)Ljava/lang/String;")
    public static String method3358(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method104(method3589(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ee.ix(II)Ljava/lang/String;")
    public static final String method3038(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1118 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method159(65408) + var1.substring(0, var1.length() - 8) + class225.field2990 + " " + class82.field1120 + var1 + class82.field1117 + class82.field1124;
        } else if (var1.length() > 6) {
            return " " + class82.method159(16777215) + var1.substring(0, var1.length() - 4) + class225.field2905 + " " + class82.field1120 + var1 + class82.field1117 + class82.field1124;
        } else {
            return " " + class82.method159(16776960) + var1 + class82.field1124;
        }
    }

    @ObfuscatedName("client.ir(ZI)V")
    public final void method1129(boolean arg0) {
        method124(field700, Statics.field3255, Statics.field256, arg0);
    }

    @ObfuscatedName("client.io(Lhp;B)V")
    public void method1235(class218 arg0) {
        class218 var2 = arg0.field2575 == -1 ? null : class218.method3998(arg0.field2575);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3255;
            var4 = Statics.field256;
        } else {
            var3 = var2.field2562;
            var4 = var2.field2563;
        }
        method3234(arg0, var3, var4, false);
        method1048(arg0, var3, var4);
    }

    @ObfuscatedName("ar.ik([Lhp;Lhp;ZB)V")
    public static void method546(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2637 == 0 ? arg1.field2562 : arg1.field2637;
        int var4 = arg1.field2633 == 0 ? arg1.field2563 : arg1.field2633;
        method994(arg0, arg1.field2658, var3, var4, arg2);
        if (arg1.field2677 != null) {
            method994(arg1.field2677, arg1.field2658, var3, var4, arg2);
        }
        class62 var5 = (class62) field854.method5434((long) arg1.field2658);
        if (var5 != null) {
            method124(var5.field542, var3, var4, arg2);
        }
        if (arg1.field2551 == 1337) {
        }
    }

    @ObfuscatedName("c.iu(IIIZI)V")
    public static final void method124(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method1922(arg0)) {
            method994(Statics.field2542[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bv.ib([Lhp;IIIZB)V")
    public static void method994(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2575 == arg1) {
                method3234(var6, arg2, arg3, arg4);
                method1048(var6, arg2, arg3);
                if (var6.field2608 > var6.field2637 - var6.field2562) {
                    var6.field2608 = var6.field2637 - var6.field2562;
                }
                if (var6.field2608 < 0) {
                    var6.field2608 = 0;
                }
                if (var6.field2569 > var6.field2633 - var6.field2563) {
                    var6.field2569 = var6.field2633 - var6.field2563;
                }
                if (var6.field2569 < 0) {
                    var6.field2569 = 0;
                }
                if (var6.field2606 == 0) {
                    method546(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fp.ii(Lhp;IIZB)V")
    public static void method3234(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2562;
        int var5 = arg0.field2563;
        if (arg0.field2544 == 0) {
            arg0.field2562 = arg0.field2614;
        } else if (arg0.field2544 == 1) {
            arg0.field2562 = arg1 - arg0.field2614;
        } else if (arg0.field2544 == 2) {
            arg0.field2562 = arg0.field2614 * arg1 >> 14;
        }
        if (arg0.field2555 == 0) {
            arg0.field2563 = arg0.field2559;
        } else if (arg0.field2555 == 1) {
            arg0.field2563 = arg2 - arg0.field2559;
        } else if (arg0.field2555 == 2) {
            arg0.field2563 = arg0.field2559 * arg2 >> 14;
        }
        if (arg0.field2544 == 4) {
            arg0.field2562 = arg0.field2563 * arg0.field2539 / arg0.field2613;
        }
        if (arg0.field2555 == 4) {
            arg0.field2563 = arg0.field2613 * arg0.field2562 / arg0.field2539;
        }
        if (arg0.field2551 == 1337) {
            field721 = arg0;
        }
        if (arg3 && arg0.field2662 != null && (arg0.field2562 != var4 || arg0.field2563 != var5)) {
            class63 var6 = new class63();
            var6.field548 = arg0;
            var6.field551 = arg0.field2662;
            field878.method4475(var6);
        }
    }

    @ObfuscatedName("bi.iv(Lhp;III)V")
    public static void method1048(class218 arg0, int arg1, int arg2) {
        if (arg0.field2552 == 0) {
            arg0.field2560 = arg0.field2596;
        } else if (arg0.field2552 == 1) {
            arg0.field2560 = (arg1 - arg0.field2562) / 2 + arg0.field2596;
        } else if (arg0.field2552 == 2) {
            arg0.field2560 = arg1 - arg0.field2562 - arg0.field2596;
        } else if (arg0.field2552 == 3) {
            arg0.field2560 = arg0.field2596 * arg1 >> 14;
        } else if (arg0.field2552 == 4) {
            arg0.field2560 = (arg0.field2596 * arg1 >> 14) + (arg1 - arg0.field2562) / 2;
        } else {
            arg0.field2560 = arg1 - arg0.field2562 - (arg0.field2596 * arg1 >> 14);
        }
        if (arg0.field2553 == 0) {
            arg0.field2561 = arg0.field2557;
        } else if (arg0.field2553 == 1) {
            arg0.field2561 = (arg2 - arg0.field2563) / 2 + arg0.field2557;
        } else if (arg0.field2553 == 2) {
            arg0.field2561 = arg2 - arg0.field2563 - arg0.field2557;
        } else if (arg0.field2553 == 3) {
            arg0.field2561 = arg0.field2557 * arg2 >> 14;
        } else if (arg0.field2553 == 4) {
            arg0.field2561 = (arg0.field2557 * arg2 >> 14) + (arg2 - arg0.field2563) / 2;
        } else {
            arg0.field2561 = arg2 - arg0.field2563 - (arg0.field2557 * arg2 >> 14);
        }
    }

    @ObfuscatedName("au.ij(Lhp;IIIIIII)V")
    public static final void method576(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field726) {
            field692 = 32;
        } else {
            field692 = 0;
        }
        field726 = false;
        if (class55.field459 == 1 || !Statics.field1048 && class55.field459 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2569 -= 4;
                method1717(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2569 += 4;
                method1717(arg0);
            } else if (arg5 >= arg1 - field692 && arg5 < field692 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2569 = (arg4 - arg3) * var8 / var9;
                method1717(arg0);
                field726 = true;
            }
        }
        if (field897 == 0) {
            return;
        }
        int var10 = arg0.field2562;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2569 += field897 * 45;
            method1717(arg0);
        }
    }

    @ObfuscatedName("io.ih(IIIIII)V")
    public static final void method4165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1039[0].method5576(arg0, arg1);
        Statics.field1039[1].method5576(arg0, arg1 + arg3 - 16);
        class321.method5485(arg0, arg1 + 16, 16, arg3 - 32, field703);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class321.method5485(arg0, arg1 + 16 + var6, 16, var5, field688);
        class321.method5493(arg0, arg1 + 16 + var6, var5, field690);
        class321.method5493(arg0 + 1, arg1 + 16 + var6, var5, field690);
        class321.method5491(arg0, arg1 + 16 + var6, 16, field690);
        class321.method5491(arg0, arg1 + 17 + var6, 16, field690);
        class321.method5493(arg0 + 15, arg1 + 16 + var6, var5, field689);
        class321.method5493(arg0 + 14, arg1 + 17 + var6, var5 - 1, field689);
        class321.method5491(arg0, arg1 + 15 + var6 + var5, 16, field689);
        class321.method5491(arg0 + 1, arg1 + 14 + var6 + var5, 15, field689);
    }

    @ObfuscatedName("f.jp(II)Ljava/lang/String;")
    public static final String method104(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ew.jc(Lhp;I)Z")
    public static final boolean method3136(class218 arg0) {
        if (arg0.field2666 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2666.length; var1++) {
            int var2 = method3589(arg0, var1);
            int var3 = arg0.field2667[var1];
            if (arg0.field2666[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2666[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2666[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.jf(Lhp;II)I")
    public static final int method3589(class218 arg0, int arg1) {
        if (arg0.field2665 == null || arg1 >= arg0.field2665.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2665[arg1];
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
                    var7 = field756[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field785[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field717[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method3998(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method144(var12).field3403 || field637)) {
                        for (int var13 = 0; var13 < var11.field2649.length; var13++) {
                            if (var12 + 1 == var11.field2649[var13]) {
                                var7 += var11.field2672[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2503[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2726[field785[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2503[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field177.field595;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2725[var14]) {
                            var7 += field785[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method3998(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method144(var18).field3403 || field637)) {
                        for (int var19 = 0; var19 < var17.field2649.length; var19++) {
                            if (var18 + 1 == var17.field2649[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field791;
                }
                if (var6 == 12) {
                    var7 = field675;
                }
                if (var6 == 13) {
                    int var20 = class213.field2503[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method3606(var22);
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
                    var7 = (Statics.field177.field957 >> 7) + Statics.field1299;
                }
                if (var6 == 19) {
                    var7 = (Statics.field177.field918 >> 7) + Statics.field2085;
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

    @ObfuscatedName("cl.jz(Lhp;Liu;IIZB)V")
    public static final void method2029(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3405;
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
            var7 = class225.field2740;
        }
        if (var6 != -1 && var7 != null) {
            method3924(var7, class82.method159(16748608) + arg1.field3434, var6, arg1.field3389, arg2, arg0.field2658, arg4);
        }
    }

    @ObfuscatedName("gv.jn(Lhp;III)V")
    public static final void method3319(class218 arg0, int arg1, int arg2) {
        if (arg0.field2550 == 1) {
            method152(arg0.field2568, "", 24, 0, 0, arg0.field2658);
        }
        if (arg0.field2550 == 2 && !field779) {
            String var3 = method3292(arg0);
            if (var3 != null) {
                method152(var3, class82.method159(65280) + arg0.field2625, 25, 0, -1, arg0.field2658);
            }
        }
        if (arg0.field2550 == 3) {
            method152(class225.field2907, "", 26, 0, 0, arg0.field2658);
        }
        if (arg0.field2550 == 4) {
            method152(arg0.field2568, "", 28, 0, 0, arg0.field2658);
        }
        if (arg0.field2550 == 5) {
            method152(arg0.field2568, "", 29, 0, 0, arg0.field2658);
        }
        if (arg0.field2550 == 6 && field790 == null) {
            method152(arg0.field2568, "", 30, 0, -1, arg0.field2658);
        }
        if (arg0.field2606 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2563; var5++) {
                for (int var6 = 0; var6 < arg0.field2562; var6++) {
                    int var7 = (arg0.field2564 + 32) * var6;
                    int var8 = (arg0.field2615 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2679[var4];
                        var8 += arg0.field2617[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field735 = var4;
                        Statics.field2731 = arg0;
                        if (arg0.field2649[var4] > 0) {
                            class255 var9 = class255.method144(arg0.field2649[var4] - 1);
                            if (field777 == 1 && class219.method3613(method4095(arg0))) {
                                if (Statics.field3650 != arg0.field2658 || Statics.field2297 != var4) {
                                    method152(class225.field2892, field778 + " " + class82.field1121 + " " + class82.method159(16748608) + var9.field3434, 31, var9.field3389, var4, arg0.field2658);
                                }
                            } else if (!field779 || !class219.method3613(method4095(arg0))) {
                                String[] var10 = var9.field3405;
                                int var11 = -1;
                                if (field770) {
                                    boolean var12 = field771 || class46.field374[81];
                                    if (var12) {
                                        var11 = var9.method4293();
                                    }
                                }
                                if (class219.method3613(method4095(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method2029(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = method4095(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method152(class225.field2892, class82.method159(16748608) + var9.field3434, 38, var9.field3389, var4, arg0.field2658);
                                }
                                class219 var10000 = (class219) null;
                                if (class219.method3613(method4095(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11 != var16) {
                                            method2029(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method2029(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var17 = arg0.field2619;
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
                                            method152(var17[var18], class82.method159(16748608) + var9.field3434, var19, var9.field3389, var4, arg0.field2658);
                                        }
                                    }
                                }
                                method152(class225.field2893, class82.method159(16748608) + var9.field3434, 1005, var9.field3389, var4, arg0.field2658);
                            } else if ((Statics.field138 & 0x10) == 16) {
                                method152(field782, field783 + " " + class82.field1121 + " " + class82.method159(16748608) + var9.field3434, 32, var9.field3389, var4, arg0.field2658);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2546) {
            return;
        }
        if (!field779) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21 = method102(arg0, var20);
                if (var21 != null) {
                    method152(var21, arg0.field2626, 1007, var20 + 1, arg0.field2558, arg0.field2658);
                }
            }
            String var22 = method3292(arg0);
            if (var22 != null) {
                method152(var22, arg0.field2626, 25, 0, arg0.field2558, arg0.field2658);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = method102(arg0, var23);
                if (var24 != null) {
                    method3924(var24, arg0.field2626, 57, var23 + 1, arg0.field2558, arg0.field2658, arg0.field2689);
                }
            }
            int var25 = method4095(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method152(class225.field2744, "", 30, 0, arg0.field2558, arg0.field2658);
            }
        } else if (class219.method2246(method4095(arg0)) && (Statics.field138 & 0x20) == 32) {
            method152(field782, field783 + " " + class82.field1121 + " " + arg0.field2626, 58, 0, arg0.field2558, arg0.field2658);
        }
    }

    @ObfuscatedName("hg.jm(ZB)V")
    public static void method3624(boolean arg0) {
        field771 = arg0;
    }

    @ObfuscatedName("bo.jh(B)Z")
    public static boolean method916() {
        return field771;
    }

    @ObfuscatedName("bs.jq(IIIIIIIB)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method1922(arg0)) {
            method3039(Statics.field2542[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eq.jy([Lhp;IIIIIIII)V")
    public static final void method3039(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2575 == arg1 && (!var9.field2546 || var9.field2606 == 0 || var9.field2566 || method4095(var9) != 0 || field798 == var9 || var9.field2551 == 1338)) {
                if (var9.field2546) {
                    if (method252(var9)) {
                        continue;
                    }
                } else if (var9.field2606 == 0 && Statics.field585 != var9 && method252(var9)) {
                    continue;
                }
                int var10 = var9.field2560 + arg6;
                int var11 = var9.field2561 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2606 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2606 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2562 + var10;
                    int var19 = var9.field2563 + var11;
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
                    int var23 = var9.field2563 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field797 == var9) {
                    field805 = true;
                    field806 = var10;
                    field807 = var11;
                }
                boolean var24 = false;
                if (var9.field2621) {
                    switch(field639) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2658 >>> 16 == field787) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field787 == var9.field2658) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2546 || var12 < var14 && var13 < var15) {
                    if (var9.field2546) {
                        if (var9.field2687) {
                            if (class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15) {
                                for (class63 var25 = (class63) field878.method4480(); var25 != null; var25 = (class63) field878.method4491()) {
                                    if (var25.field547) {
                                        var25.method3304();
                                        var25.field548.field2547 = false;
                                    }
                                }
                                if (Statics.field532 == 0) {
                                    field797 = null;
                                    field798 = null;
                                }
                                if (!field760) {
                                    method1655();
                                }
                            }
                        } else if (var9.field2654 && class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15) {
                            for (class63 var26 = (class63) field878.method4480(); var26 != null; var26 = (class63) field878.method4491()) {
                                if (var26.field547 && var26.field548.field2641 == var26.field551) {
                                    var26.method3304();
                                }
                            }
                        }
                    }
                    int var27 = class55.field464;
                    int var28 = class55.field461;
                    if (class55.field462 != 0) {
                        var27 = class55.field468;
                        var28 = class55.field469;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2551 == 1337) {
                        if (!field665 && !field760 && var29) {
                            method3604(var27, var28, var12, var13);
                        }
                    } else if (var9.field2551 == 1338) {
                        method3502(var9, var10, var11);
                    } else {
                        if (var9.field2551 == 1400) {
                            Statics.field290.method5972(class55.field464, class55.field461, var29, var10, var11, var9.field2562, var9.field2563);
                        }
                        if (!field760 && var29) {
                            if (var9.field2551 == 1400) {
                                Statics.field290.method5825(var10, var11, var9.field2562, var9.field2563, var27, var28);
                            } else {
                                method3319(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2632.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2632[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2632[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2686 != null) {
                                            var34 = class46.field374[var9.field2632[var30][var33]];
                                        }
                                        if (method25(var9.field2632[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2686 != null && var9.field2686[var30] > field635) {
                                                break;
                                            }
                                            byte var35 = var9.field2623[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field374[86] && !class46.field374[82] && !class46.field374[81]) && ((var35 & 0x2) == 0 || class46.field374[86]) && ((var35 & 0x1) == 0 || class46.field374[82]) && ((var35 & 0x4) == 0 || class46.field374[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1004(var30 + 1, var9.field2658, var9.field2558, var9.field2675, "");
                                    } else if (var30 == 10) {
                                        method470();
                                        method3746(var9.field2658, var9.field2558, class219.method472(method4095(var9)), var9.field2675);
                                        field782 = method3292(var9);
                                        if (field782 == null) {
                                            field782 = class225.field2929;
                                        }
                                        field783 = var9.field2626 + class82.method159(16777215);
                                    }
                                    int var36 = var9.field2624[var30];
                                    if (var9.field2686 == null) {
                                        var9.field2686 = new int[var9.field2632.length];
                                    }
                                    if (var9.field2582 == null) {
                                        var9.field2582 = new int[var9.field2632.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2686[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2686[var30] == 0) {
                                        var9.field2686[var30] = field635 + var36 + var9.field2582[var30];
                                    } else {
                                        var9.field2686[var30] = field635 + var36;
                                    }
                                }
                                if (!var31 && var9.field2686 != null) {
                                    var9.field2686[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2546) {
                            boolean var37;
                            if (class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field459 == 1 || !Statics.field1048 && class55.field459 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field462 == 1 || !Statics.field1048 && class55.field462 == 4) && class55.field468 >= var12 && class55.field469 >= var13 && class55.field468 < var14 && class55.field469 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method421(var9, class55.field468 - var10, class55.field469 - var11);
                            }
                            if (var9.field2551 == 1400) {
                                Statics.field290.method5774(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field797 != null && field797 != var9 && var37 && class219.method1050(method4095(var9))) {
                                field776 = var9;
                            }
                            if (field798 == var9) {
                                field642 = true;
                                field803 = var10;
                                field804 = var11;
                            }
                            if (var9.field2566) {
                                if (var37 && field897 != 0 && var9.field2641 != null) {
                                    class63 var40 = new class63();
                                    var40.field547 = true;
                                    var40.field548 = var9;
                                    var40.field550 = field897;
                                    var40.field551 = var9.field2641;
                                    field878.method4475(var40);
                                }
                                if (field797 != null || Statics.field2326 != null || field760) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2611 && var39) {
                                    var9.field2611 = true;
                                    if (var9.field2565 != null) {
                                        class63 var41 = new class63();
                                        var41.field547 = true;
                                        var41.field548 = var9;
                                        var41.field549 = class55.field468 - var10;
                                        var41.field550 = class55.field469 - var11;
                                        var41.field551 = var9.field2565;
                                        field878.method4475(var41);
                                    }
                                }
                                if (var9.field2611 && var38 && var9.field2636 != null) {
                                    class63 var42 = new class63();
                                    var42.field547 = true;
                                    var42.field548 = var9;
                                    var42.field549 = class55.field464 - var10;
                                    var42.field550 = class55.field461 - var11;
                                    var42.field551 = var9.field2636;
                                    field878.method4475(var42);
                                }
                                if (var9.field2611 && !var38) {
                                    var9.field2611 = false;
                                    if (var9.field2545 != null) {
                                        class63 var43 = new class63();
                                        var43.field547 = true;
                                        var43.field548 = var9;
                                        var43.field549 = class55.field464 - var10;
                                        var43.field550 = class55.field461 - var11;
                                        var43.field551 = var9.field2545;
                                        field825.method4475(var43);
                                    }
                                }
                                if (var38 && var9.field2570 != null) {
                                    class63 var44 = new class63();
                                    var44.field547 = true;
                                    var44.field548 = var9;
                                    var44.field549 = class55.field464 - var10;
                                    var44.field550 = class55.field461 - var11;
                                    var44.field551 = var9.field2570;
                                    field878.method4475(var44);
                                }
                                if (!var9.field2547 && var37) {
                                    var9.field2547 = true;
                                    if (var9.field2548 != null) {
                                        class63 var45 = new class63();
                                        var45.field547 = true;
                                        var45.field548 = var9;
                                        var45.field549 = class55.field464 - var10;
                                        var45.field550 = class55.field461 - var11;
                                        var45.field551 = var9.field2548;
                                        field878.method4475(var45);
                                    }
                                }
                                if (var9.field2547 && var37 && var9.field2640 != null) {
                                    class63 var46 = new class63();
                                    var46.field547 = true;
                                    var46.field548 = var9;
                                    var46.field549 = class55.field464 - var10;
                                    var46.field550 = class55.field461 - var11;
                                    var46.field551 = var9.field2640;
                                    field878.method4475(var46);
                                }
                                if (var9.field2547 && !var37) {
                                    var9.field2547 = false;
                                    if (var9.field2669 != null) {
                                        class63 var47 = new class63();
                                        var47.field547 = true;
                                        var47.field548 = var9;
                                        var47.field549 = class55.field464 - var10;
                                        var47.field550 = class55.field461 - var11;
                                        var47.field551 = var9.field2669;
                                        field825.method4475(var47);
                                    }
                                }
                                if (var9.field2652 != null) {
                                    class63 var48 = new class63();
                                    var48.field548 = var9;
                                    var48.field551 = var9.field2652;
                                    field634.method4475(var48);
                                }
                                if (var9.field2646 != null && field801 > var9.field2681) {
                                    if (var9.field2647 == null || field801 - var9.field2681 > 32) {
                                        class63 var53 = new class63();
                                        var53.field548 = var9;
                                        var53.field551 = var9.field2646;
                                        field878.method4475(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2681; var49 < field801; var49++) {
                                            int var50 = field810[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2647.length; var51++) {
                                                if (var9.field2647[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field548 = var9;
                                                    var52.field551 = var9.field2646;
                                                    field878.method4475(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2681 = field801;
                                }
                                if (var9.field2648 != null && field813 > var9.field2682) {
                                    if (var9.field2638 == null || field813 - var9.field2682 > 32) {
                                        class63 var58 = new class63();
                                        var58.field548 = var9;
                                        var58.field551 = var9.field2648;
                                        field878.method4475(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2682; var54 < field813; var54++) {
                                            int var55 = field812[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2638.length; var56++) {
                                                if (var9.field2638[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field548 = var9;
                                                    var57.field551 = var9.field2648;
                                                    field878.method4475(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2682 = field813;
                                }
                                if (var9.field2650 != null && field815 > var9.field2592) {
                                    if (var9.field2651 == null || field815 - var9.field2592 > 32) {
                                        class63 var63 = new class63();
                                        var63.field548 = var9;
                                        var63.field551 = var9.field2650;
                                        field878.method4475(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2592; var59 < field815; var59++) {
                                            int var60 = field814[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2651.length; var61++) {
                                                if (var9.field2651[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field548 = var9;
                                                    var62.field551 = var9.field2650;
                                                    field878.method4475(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2592 = field815;
                                }
                                if (field774 > var9.field2680 && var9.field2655 != null) {
                                    class63 var64 = new class63();
                                    var64.field548 = var9;
                                    var64.field551 = var9.field2655;
                                    field878.method4475(var64);
                                }
                                if (field630 > var9.field2680 && var9.field2657 != null) {
                                    class63 var65 = new class63();
                                    var65.field548 = var9;
                                    var65.field551 = var9.field2657;
                                    field878.method4475(var65);
                                }
                                if (field818 > var9.field2680 && var9.field2630 != null) {
                                    class63 var66 = new class63();
                                    var66.field548 = var9;
                                    var66.field551 = var9.field2630;
                                    field878.method4475(var66);
                                }
                                if (field819 > var9.field2680 && var9.field2663 != null) {
                                    class63 var67 = new class63();
                                    var67.field548 = var9;
                                    var67.field551 = var9.field2663;
                                    field878.method4475(var67);
                                }
                                if (field820 > var9.field2680 && var9.field2664 != null) {
                                    class63 var68 = new class63();
                                    var68.field548 = var9;
                                    var68.field551 = var9.field2664;
                                    field878.method4475(var68);
                                }
                                if (field821 > var9.field2680 && var9.field2659 != null) {
                                    class63 var69 = new class63();
                                    var69.field548 = var9;
                                    var69.field551 = var9.field2659;
                                    field878.method4475(var69);
                                }
                                var9.field2680 = field809;
                                if (var9.field2556 != null) {
                                    for (int var70 = 0; var70 < field678; var70++) {
                                        class63 var71 = new class63();
                                        var71.field548 = var9;
                                        var71.field553 = field816[var70];
                                        var71.field561 = field846[var70];
                                        var71.field551 = var9.field2556;
                                        field878.method4475(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2546) {
                            if (field797 != null || Statics.field2326 != null || field760) {
                                continue;
                            }
                            if ((var9.field2668 >= 0 || var9.field2574 != 0) && class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15) {
                                if (var9.field2668 >= 0) {
                                    Statics.field585 = arg0[var9.field2668];
                                } else {
                                    Statics.field585 = var9;
                                }
                            }
                            if (var9.field2606 == 8 && class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15) {
                                Statics.field199 = var9;
                            }
                            if (var9.field2633 > var9.field2563) {
                                method576(var9, var9.field2562 + var10, var11, var9.field2563, var9.field2633, class55.field464, class55.field461);
                            }
                        }
                        if (var9.field2606 == 0) {
                            method3039(arg0, var9.field2658, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2569);
                            if (var9.field2677 != null) {
                                method3039(var9.field2677, var9.field2658, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2569);
                            }
                            class62 var72 = (class62) field854.method5434((long) var9.field2658);
                            if (var72 != null) {
                                if (var72.field539 == 0 && class55.field464 >= var12 && class55.field461 >= var13 && class55.field464 < var14 && class55.field461 < var15 && !field760) {
                                    for (class63 var73 = (class63) field878.method4480(); var73 != null; var73 = (class63) field878.method4491()) {
                                        if (var73.field547) {
                                            var73.method3304();
                                            var73.field548.field2547 = false;
                                        }
                                    }
                                    if (Statics.field532 == 0) {
                                        field797 = null;
                                        field798 = null;
                                    }
                                    if (!field760) {
                                        method1655();
                                    }
                                }
                                method1016(var72.field542, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.jg(II)Z")
    public static boolean method25(int arg0) {
        for (int var1 = 0; var1 < field678; var1++) {
            if (field816[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ff.ji(III)V")
    public static final void method3166(int arg0, int arg1) {
        if (class218.method1922(arg0)) {
            method3356(Statics.field2542[arg0], arg1);
        }
    }

    @ObfuscatedName("gw.jd([Lhp;II)V")
    public static final void method3356(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2606 == 0) {
                    if (var3.field2677 != null) {
                        method3356(var3.field2677, arg1);
                    }
                    class62 var4 = (class62) field854.method5434((long) var3.field2658);
                    if (var4 != null) {
                        method3166(var4.field542, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2622 != null) {
                    class63 var5 = new class63();
                    var5.field548 = var3;
                    var5.field551 = var3.field2622;
                    class77.method1875(var5);
                }
                if (arg1 == 1 && var3.field2661 != null) {
                    if (var3.field2558 >= 0) {
                        class218 var6 = class218.method3998(var3.field2658);
                        if (var6 == null || var6.field2677 == null || var3.field2558 >= var6.field2677.length || var6.field2677[var3.field2558] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field548 = var3;
                    var7.field551 = var3.field2661;
                    class77.method1875(var7);
                }
            }
        }
    }

    @ObfuscatedName("af.jr(Lhp;III)V")
    public static final void method421(class218 arg0, int arg1, int arg2) {
        if (field797 != null || field760 || arg0 == null || method3313(arg0) == null) {
            return;
        }
        field797 = arg0;
        field798 = method3313(arg0);
        field799 = arg1;
        field800 = arg2;
        Statics.field532 = 0;
        field687 = false;
        int var3 = field761 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field6 = new class83();
        Statics.field6.field1129 = field842[var3];
        Statics.field6.field1128 = field763[var3];
        Statics.field6.field1135 = field764[var3];
        Statics.field6.field1136 = field845[var3];
        Statics.field6.field1131 = field766[var3];
    }

    @ObfuscatedName("client.ju(I)V")
    public final void method1489() {
        method1717(field797);
        Statics.field532++;
        if (field805 && field642) {
            int var1 = class55.field464;
            int var2 = class55.field461;
            int var3 = var1 - field799;
            int var4 = var2 - field800;
            if (var3 < field803) {
                var3 = field803;
            }
            if (field797.field2562 + var3 > field803 + field798.field2562) {
                var3 = field803 + field798.field2562 - field797.field2562;
            }
            if (var4 < field804) {
                var4 = field804;
            }
            if (field797.field2563 + var4 > field804 + field798.field2563) {
                var4 = field804 + field798.field2563 - field797.field2563;
            }
            int var5 = var3 - field806;
            int var6 = var4 - field807;
            int var7 = field797.field2629;
            if (Statics.field532 > field797.field2683 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field687 = true;
            }
            int var8 = field798.field2608 + (var3 - field803);
            int var9 = field798.field2569 + (var4 - field804);
            if (field797.field2642 != null && field687) {
                class63 var10 = new class63();
                var10.field548 = field797;
                var10.field549 = var8;
                var10.field550 = var9;
                var10.field551 = field797.field2642;
                class77.method1875(var10);
            }
            if (class55.field459 == 0) {
                if (field687) {
                    if (field797.field2643 != null) {
                        class63 var11 = new class63();
                        var11.field548 = field797;
                        var11.field549 = var8;
                        var11.field550 = var9;
                        var11.field552 = field776;
                        var11.field551 = field797.field2643;
                        class77.method1875(var11);
                    }
                    if (field776 != null && method3592(field797) != null) {
                        class188 var12 = class188.method1879(class184.field2214, field828.field1300);
                        var12.field2321.method5087(field797.field2558);
                        var12.field2321.method5087(field776.field2675);
                        var12.field2321.method5037(field776.field2558);
                        var12.field2321.method5095(field797.field2658);
                        var12.field2321.method5096(field776.field2658);
                        var12.field2321.method5037(field797.field2675);
                        field828.method2049(var12);
                    }
                } else if (this.method1127()) {
                    this.method1128(field806 + field799, field807 + field800);
                } else if (field761 > 0) {
                    method969(field806 + field799, field807 + field800);
                }
                field797 = null;
            }
        } else if (Statics.field532 > 1) {
            field797 = null;
        }
    }

    @ObfuscatedName("bp.je(IIB)V")
    public static void method969(int arg0, int arg1) {
        class83 var2 = Statics.field6;
        method1937(var2.field1129, var2.field1128, var2.field1135, var2.field1136, var2.field1131, var2.field1131, arg0, arg1);
        Statics.field6 = null;
    }

    @ObfuscatedName("ba.jk(Lhp;I)V")
    public static void method1717(class218 arg0) {
        if (field753 == arg0.field2537) {
            field704[arg0.field2684] = true;
        }
    }

    @ObfuscatedName("z.jw(I)V")
    public static void method184() {
        for (class62 var0 = (class62) field854.method5432(); var0 != null; var0 = (class62) field854.method5433()) {
            int var1 = var0.field542;
            if (class218.method1922(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field2542[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2546;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2096;
                    class218 var6 = class218.method3998(var5);
                    if (var6 != null) {
                        method1717(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gj.jb(Lhp;B)Lhp;")
    public static class218 method3313(class218 arg0) {
        class218 var1 = method3592(arg0);
        if (var1 == null) {
            var1 = arg0.field2628;
        }
        return var1;
    }

    @ObfuscatedName("w.jt(II)V")
    public static final void method211(int arg0) {
        if (!class218.method1922(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2542[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2685 = 0;
                var3.field2676 = 0;
            }
        }
    }

    @ObfuscatedName("fm.js(IS)V")
    public static final void method3268(int arg0) {
        if (class218.method1922(arg0)) {
            method2618(Statics.field2542[arg0], -1);
        }
    }

    @ObfuscatedName("de.jj([Lhp;II)V")
    public static final void method2618(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2575 == arg1 && (!var3.field2546 || !method252(var3))) {
                if (var3.field2606 == 0) {
                    if (!var3.field2546 && method252(var3) && Statics.field585 != var3) {
                        continue;
                    }
                    method2618(arg0, var3.field2658);
                    if (var3.field2677 != null) {
                        method2618(var3.field2677, var3.field2658);
                    }
                    class62 var4 = (class62) field854.method5434((long) var3.field2658);
                    if (var4 != null) {
                        method3268(var4.field542);
                    }
                }
                if (var3.field2606 == 6) {
                    if (var3.field2594 != -1 || var3.field2595 != -1) {
                        boolean var5 = method3136(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2595;
                        } else {
                            var6 = var3.field2594;
                        }
                        if (var6 != -1) {
                            class259 var7 = Statics.method3725(var6);
                            var3.field2676 += field880;
                            while (var3.field2676 > var7.field3498[var3.field2685]) {
                                var3.field2676 -= var7.field3498[var3.field2685];
                                var3.field2685++;
                                if (var3.field2685 >= var7.field3496.length) {
                                    var3.field2685 -= var7.field3500;
                                    if (var3.field2685 < 0 || var3.field2685 >= var7.field3496.length) {
                                        var3.field2685 = 0;
                                    }
                                }
                                method1717(var3);
                            }
                        }
                    }
                    if (var3.field2603 != 0 && !var3.field2546) {
                        int var8 = var3.field2603 >> 16;
                        int var9 = var3.field2603 << 16 >> 16;
                        int var10 = field880 * var8;
                        int var11 = field880 * var9;
                        var3.field2598 = var3.field2598 + var10 & 0x7FF;
                        var3.field2599 = var3.field2599 + var11 & 0x7FF;
                        method1717(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.jo(IB)V")
    public static final void method1732(int arg0) {
        method184();
        class76.method687();
        int var1 = class241.method157(arg0).field3189;
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field2503[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class131.method2816(0.9D);
                ((class120) Statics.field1764).method2493(0.9D);
            }
            if (var2 == 2) {
                class131.method2816(0.8D);
                ((class120) Statics.field1764).method2493(0.8D);
            }
            if (var2 == 3) {
                class131.method2816(0.7D);
                ((class120) Statics.field1764).method2493(0.7D);
            }
            if (var2 == 4) {
                class131.method2816(0.6D);
                ((class120) Statics.field1764).method2493(0.6D);
            }
            class255.method630();
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
            if (field857 != var3) {
                if (field857 == 0 && field858 != -1) {
                    class198.method3335(Statics.field47, field858, 0, var3, false);
                    field859 = false;
                } else if (var3 == 0) {
                    Statics.field2382.method3404();
                    class198.field2379 = 1;
                    Statics.field195 = null;
                    field859 = false;
                } else {
                    class198.method2035(var3);
                }
                field857 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field860 = 127;
            }
            if (var2 == 1) {
                field860 = 96;
            }
            if (var2 == 2) {
                field860 = 64;
            }
            if (var2 == 3) {
                field860 = 32;
            }
            if (var2 == 4) {
                field860 = 0;
            }
        }
        if (var1 == 5) {
            field901 = var2;
        }
        if (var1 == 6) {
            field788 = var2;
        }
        if (var1 == 9) {
            field789 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field861 = 127;
            }
            if (var2 == 1) {
                field861 = 96;
            }
            if (var2 == 2) {
                field861 = 64;
            }
            if (var2 == 3) {
                field861 = 32;
            }
            if (var2 == 4) {
                field861 = 0;
            }
        }
        if (var1 == 17) {
            field794 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class85[] var4 = new class85[] { class85.field1141, class85.field1144, class85.field1142, class85.field1143 };
            field651 = (class85) class196.method1723(var4, var2);
            if (field651 == null) {
                field651 = class85.field1144;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field674 = -1;
            } else {
                field674 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class85[] var5 = new class85[] { class85.field1141, class85.field1144, class85.field1142, class85.field1143 };
        field699 = (class85) class196.method1723(var5, var2);
        if (field699 == null) {
            field699 = class85.field1144;
        }
    }

    @ObfuscatedName("hb.jx(Lhp;B)V")
    public static final void method3740(class218 arg0) {
        int var1 = arg0.field2551;
        if (var1 == 324) {
            if (field734 == -1) {
                field734 = arg0.field2549;
                field889 = arg0.field2583;
            }
            if (field822.field2522) {
                arg0.field2549 = field734;
            } else {
                arg0.field2549 = field889;
            }
        } else if (var1 == 325) {
            if (field734 == -1) {
                field734 = arg0.field2549;
                field889 = arg0.field2583;
            }
            if (field822.field2522) {
                arg0.field2549 = field889;
            } else {
                arg0.field2549 = field734;
            }
        } else if (var1 == 327) {
            arg0.field2598 = 150;
            arg0.field2599 = (int) (Math.sin((double) field635 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2590 = 5;
            arg0.field2591 = 0;
        } else if (var1 == 328) {
            arg0.field2598 = 150;
            arg0.field2599 = (int) (Math.sin((double) field635 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2590 = 5;
            arg0.field2591 = 1;
        }
    }

    @ObfuscatedName("is.ja(I)V")
    public static final void method4111() {
        class188 var0 = class188.method1879(class184.field2206, field828.field1300);
        field828.method2049(var0);
        for (class62 var1 = (class62) field854.method5432(); var1 != null; var1 = (class62) field854.method5433()) {
            if (var1.field539 == 0 || var1.field539 == 3) {
                method3974(var1, true);
            }
        }
        if (field790 != null) {
            method1717(field790);
            field790 = null;
        }
    }

    @ObfuscatedName("ci.jl(IIII)Lbq;")
    public static final class62 method1855(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field542 = arg1;
        var3.field539 = arg2;
        field854.method5429(var3, (long) arg0);
        method211(arg1);
        class218 var4 = class218.method3998(arg0);
        method1717(var4);
        if (field790 != null) {
            method1717(field790);
            field790 = null;
        }
        for (int var5 = 0; var5 < field761; var5++) {
            if (Statics.method1562(field764[var5])) {
                if (var5 < field761 - 1) {
                    for (int var6 = var5; var6 < field761 - 1; var6++) {
                        field766[var6] = field766[var6 + 1];
                        field767[var6] = field767[var6 + 1];
                        field764[var6] = field764[var6 + 1];
                        field845[var6] = field845[var6 + 1];
                        field842[var6] = field842[var6 + 1];
                        field763[var6] = field763[var6 + 1];
                        field758[var6] = field758[var6 + 1];
                    }
                }
                var5--;
                field761--;
            }
        }
        method123();
        method546(Statics.field2542[arg0 >> 16], var4, false);
        class77.method721(arg1);
        if (field700 != -1) {
            method3166(field700, 1);
        }
        return var3;
    }

    @ObfuscatedName("in.jv(Lbq;ZI)V")
    public static final void method3974(class62 arg0, boolean arg1) {
        int var2 = arg0.field542;
        int var3 = (int) arg0.field2096;
        arg0.method3304();
        if (arg1) {
            class218.method3048(var2);
        }
        for (class180 var4 = (class180) field826.method5432(); var4 != null; var4 = (class180) field826.method5433()) {
            if ((long) var2 == (var4.field2096 >> 48 & 0xFFFFL)) {
                var4.method3304();
            }
        }
        class218 var5 = class218.method3998(var3);
        if (var5 != null) {
            method1717(var5);
        }
        for (int var6 = 0; var6 < field761; var6++) {
            if (Statics.method1562(field764[var6])) {
                if (var6 < field761 - 1) {
                    for (int var7 = var6; var7 < field761 - 1; var7++) {
                        field766[var7] = field766[var7 + 1];
                        field767[var7] = field767[var7 + 1];
                        field764[var7] = field764[var7 + 1];
                        field845[var7] = field845[var7 + 1];
                        field842[var7] = field842[var7 + 1];
                        field763[var7] = field763[var7 + 1];
                        field758[var7] = field758[var7 + 1];
                    }
                }
                var6--;
                field761--;
            }
        }
        method123();
        if (field700 != -1) {
            method3166(field700, 1);
        }
    }

    @ObfuscatedName("at.ks(Lhp;B)Z")
    public static final boolean method488(class218 arg0) {
        int var1 = arg0.field2551;
        if (var1 == 205) {
            field672 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field822.method3643(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field822.method3644(var4, var5 == 1);
        }
        if (var1 == 324) {
            field822.method3651(false);
        }
        if (var1 == 325) {
            field822.method3651(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method1879(class184.field2198, field828.field1300);
            field822.method3662(var6.field2321);
            field828.method2049(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("du.kj(Lhp;IIII)V")
    public static final void method2517(class218 arg0, int arg1, int arg2, int arg3) {
        method212();
        class212 var4 = arg0.method3722(false);
        if (var4 == null) {
            return;
        }
        class321.method5483(arg1, arg2, var4.field2498 + arg1, var4.field2501 + arg2);
        if (field856 == 2 || field856 == 5) {
            class321.method5497(arg1, arg2, 0, var4.field2497, var4.field2499);
        } else {
            int var5 = field694 & 0x7FF;
            int var6 = Statics.field177.field957 / 32 + 48;
            int var7 = 464 - Statics.field177.field918 / 32;
            Statics.field3289.method5614(arg1, arg2, var4.field2498, var4.field2501, var6, var7, var5, 256, var4.field2497, var4.field2499);
            for (int var8 = 0; var8 < field850; var8++) {
                int var9 = field851[var8] * 4 + 2 - Statics.field177.field957 / 32;
                int var10 = field802[var8] * 4 + 2 - Statics.field177.field918 / 32;
                method3369(arg1, arg2, var9, var10, field853[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field752[Statics.field519][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field177.field957 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field177.field918 / 32;
                        method3369(arg1, arg2, var14, var15, Statics.field232[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field667; var16++) {
                class80 var17 = field746[field808[var16]];
                if (var17 != null && var17.method1073()) {
                    class257 var18 = var17.field1104;
                    if (var18 != null && var18.field3471 != null) {
                        var18 = var18.method4323();
                    }
                    if (var18 != null && var18.field3469 && var18.field3447) {
                        int var19 = var17.field957 / 32 - Statics.field177.field957 / 32;
                        int var20 = var17.field918 / 32 - Statics.field177.field918 / 32;
                        method3369(arg1, arg2, var19, var20, Statics.field232[1], var4);
                    }
                }
            }
            int var21 = class90.field1230;
            int[] var22 = class90.field1225;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field740[var22[var23]];
                if (var24 != null && var24.method1073() && !var24.field589 && Statics.field177 != var24) {
                    int var25 = var24.field957 / 32 - Statics.field177.field957 / 32;
                    int var26 = var24.field918 / 32 - Statics.field177.field918 / 32;
                    boolean var27 = false;
                    if (Statics.field177.field609 != 0 && var24.field609 != 0 && Statics.field177.field609 == var24.field609) {
                        var27 = true;
                    }
                    if (var24.method1062()) {
                        method3369(arg1, arg2, var25, var26, Statics.field232[3], var4);
                    } else if (var27) {
                        method3369(arg1, arg2, var25, var26, Statics.field232[4], var4);
                    } else if (var24.method1080()) {
                        method3369(arg1, arg2, var25, var26, Statics.field232[5], var4);
                    } else {
                        method3369(arg1, arg2, var25, var26, Statics.field232[2], var4);
                    }
                }
            }
            if (field643 != 0 && field635 % 20 < 10) {
                if (field643 == 1 && field625 >= 0 && field625 < field746.length) {
                    class80 var28 = field746[field625];
                    if (var28 != null) {
                        int var29 = var28.field957 / 32 - Statics.field177.field957 / 32;
                        int var30 = var28.field918 / 32 - Statics.field177.field918 / 32;
                        method125(arg1, arg2, var29, var30, Statics.field271[1], var4);
                    }
                }
                if (field643 == 2) {
                    int var31 = field646 * 4 - Statics.field1299 * 4 + 2 - Statics.field177.field957 / 32;
                    int var32 = field647 * 4 - Statics.field2085 * 4 + 2 - Statics.field177.field918 / 32;
                    method125(arg1, arg2, var31, var32, Statics.field271[1], var4);
                }
                if (field643 == 10 && field645 >= 0 && field645 < field740.length) {
                    class67 var33 = field740[field645];
                    if (var33 != null) {
                        int var34 = var33.field957 / 32 - Statics.field177.field957 / 32;
                        int var35 = var33.field918 / 32 - Statics.field177.field918 / 32;
                        method125(arg1, arg2, var34, var35, Statics.field271[1], var4);
                    }
                }
            }
            if (field885 != 0) {
                int var36 = field885 * 4 + 2 - Statics.field177.field957 / 32;
                int var37 = field855 * 4 + 2 - Statics.field177.field918 / 32;
                method3369(arg1, arg2, var36, var37, Statics.field271[0], var4);
            }
            if (!Statics.field177.field589) {
                class321.method5485(var4.field2498 / 2 + arg1 - 1, var4.field2501 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field830[arg3] = true;
    }

    @ObfuscatedName("dh.kt(Lhp;IIII)V")
    public static final void method2284(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3722(false);
        if (var4 == null) {
            return;
        }
        if (field856 < 3) {
            Statics.field267.method5614(arg1, arg2, var4.field2498, var4.field2501, 25, 25, field694, 256, var4.field2497, var4.field2499);
        } else {
            class321.method5497(arg1, arg2, 0, var4.field2497, var4.field2499);
        }
    }

    @ObfuscatedName("c.kc(IIIILls;Lhg;I)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3369(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field694 & 0x7FF;
        int var8 = class131.field1767[var7];
        int var9 = class131.field1768[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2498 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1974.method5615(arg5.field2498 / 2 + arg0 - var17 / 2 + var15, arg5.field2501 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("gr.kq(IIIILls;Lhg;B)V")
    public static final void method3369(int arg0, int arg1, int arg2, int arg3, class325 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field694 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1767[var6];
        int var9 = class131.field1768[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5613(arg5.field2498 / 2 + var10 - arg4.field3876 / 2, arg5.field2501 / 2 - var11 - arg4.field3873 / 2, arg0, arg1, arg5.field2498, arg5.field2501, arg5.field2497, arg5.field2499);
        } else {
            arg4.method5602(arg5.field2498 / 2 + arg0 + var10 - arg4.field3876 / 2, arg5.field2501 / 2 + arg1 - var11 - arg4.field3873 / 2);
        }
    }

    @ObfuscatedName("k.kz(I)V")
    public static final void method39() {
        for (int var0 = 0; var0 < class90.field1230; var0++) {
            class67 var1 = field740[class90.field1225[var0]];
            var1.method1063();
        }
        class92.method1653();
        if (Statics.field902 != null) {
            Statics.field902.method4793();
        }
    }

    @ObfuscatedName("bq.kr(I)V")
    public static final void method1001() {
        Iterator var0 = class92.field1246.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1038();
        }
        if (Statics.field902 != null) {
            Statics.field902.method4794();
        }
    }

    @ObfuscatedName("ap.kf(B)V")
    public static final void method636() {
        field630 = field809;
    }

    @ObfuscatedName("ei.kb(I)V")
    public static final void method3033() {
        field818 = field809;
        Statics.field85 = true;
    }

    @ObfuscatedName("ak.kl(Ljava/lang/String;I)V")
    public static final void method506(String arg0) {
        if (Statics.field902 != null) {
            class188 var1 = class188.method1879(class184.field2199, field828.field1300);
            var1.field2321.method5083(class300.method4752(arg0));
            var1.field2321.method5043(arg0);
            field828.method2049(var1);
        }
    }

    @ObfuscatedName("hu.kn(Ljava/lang/String;I)V")
    public static final void method3750(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method1879(class184.field2264, field828.field1300);
            var1.field2321.method5083(class300.method4752(arg0));
            var1.field2321.method5043(arg0);
            field828.method2049(var1);
        }
    }

    @ObfuscatedName("bn.ke(B)V")
    public static final void method951() {
        class188 var0 = class188.method1879(class184.field2264, field828.field1300);
        var0.field2321.method5083(0);
        field828.method2049(var0);
    }

    @ObfuscatedName("is.kx(Lhp;B)I")
    public static int method4095(class218 arg0) {
        class180 var1 = (class180) field826.method5434(((long) arg0.field2658 << 32) + (long) arg0.field2558);
        return var1 == null ? arg0.field2620 : var1.field2094;
    }

    @ObfuscatedName("gl.ky(Lhp;I)Lhp;")
    public static class218 method3592(class218 arg0) {
        int var1 = method4095(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class218.method3998(arg0.field2575);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("h.kd(Lhp;B)Z")
    public static boolean method252(class218 arg0) {
        return arg0.field2567;
    }

    @ObfuscatedName("f.km(Lhp;IB)Ljava/lang/String;")
    public static String method102(class218 arg0, int arg1) {
        int var2 = method4095(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2653 == null) {
            return null;
        } else if (arg0.field2627 == null || arg0.field2627.length <= arg1 || arg0.field2627[arg1] == null || arg0.field2627[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2627[arg1];
        }
    }

    @ObfuscatedName("fx.kw(Lhp;I)Ljava/lang/String;")
    public static String method3292(class218 arg0) {
        if (class219.method472(method4095(arg0)) == 0) {
            return null;
        } else if (arg0.field2656 == null || arg0.field2656.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2656;
        }
    }

    @ObfuscatedName("fq.ku(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3295(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field627 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field627 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field627 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field627 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field627 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2038 != null) {
            var3 = "/p=" + Statics.field2038;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field523 + "/a=" + Statics.field1415 + var3 + "/";
    }

    @ObfuscatedName("er.kg(Ljava/lang/String;I)V")
    public static void method3056(String arg0) {
        Statics.field2038 = arg0;
        try {
            String var1 = Statics.field260.getParameter(Integer.toString(18));
            String var2 = Statics.field260.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class208.method3567(class297.method4369() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class48.method673(Statics.field260, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("ge.ko(Ljava/lang/String;ZI)V")
    public static void method3322(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field563; var5++) {
            class255 var6 = class255.method144(var5);
            if ((!arg1 || var6.field3430) && var6.field3428 == -1 && var6.field3434.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2339 = -1;
                    Statics.field500 = null;
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
        Statics.field500 = var3;
        Statics.field71 = 0;
        Statics.field2339 = var4;
        String[] var9 = new String[Statics.field2339];
        for (int var10 = 0; var10 < Statics.field2339; var10++) {
            var9[var10] = class255.method144(var3[var10]).field3434;
        }
        short[] var11 = Statics.field500;
        class190.method3017(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("bn.ki([BII)V")
    public static void method965(byte[] arg0, int arg1) {
        if (field864 == null) {
            field864 = new byte[24];
        }
        class301.method5274(arg0, arg1, field864, 0, 24);
    }

    @ObfuscatedName("cj.kv(Lky;II)V")
    public static void method1912(class300 arg0, int arg1) {
        method965(arg0.field3701, arg1);
        class168.method257(arg0, arg1);
    }

    @ObfuscatedName("dy.kh(Lky;I)V")
    public static void method2605(class300 arg0) {
        if (field864 != null) {
            arg0.method5158(field864, 0, field864.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class168.field2026.method6005(0L);
            class168.field2026.method6015(var1);
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
        arg0.method5158(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kk(I)Ljx;")
    public class283 method1169() {
        return Statics.field177 == null ? null : Statics.field177.field591;
    }

    @ObfuscatedName("ey.ka(IIIZI)V")
    public static void method3027(int arg0, int arg1, int arg2, boolean arg3) {
        class188 var4 = class188.method1879(class184.field2256, field828.field1300);
        var4.field2321.method5096(arg3 ? field706 : 0);
        var4.field2321.method5086(arg1);
        var4.field2321.method5189(arg2);
        var4.field2321.method5037(arg0);
        field828.method2049(var4);
    }

    @ObfuscatedName("l.kp(IB)V")
    public static void method243(int arg0) {
        field781 = arg0;
    }

    @ObfuscatedName("a.lz(I)V")
    public static void method198() {
        field828.method2049(class188.method1879(class184.field2223, field828.field1300));
        field781 = 0;
    }

    @ObfuscatedName("d.li(I)V")
    public static void method99() {
        if (!field707 || Statics.field177 == null) {
            return;
        }
        int var0 = Statics.field177.field975[0];
        int var1 = Statics.field177.field945[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1276 = Statics.field177.field957;
        int var2 = method79(Statics.field177.field957, Statics.field177.field918, Statics.field519) - field867;
        if (var2 < Statics.field560) {
            Statics.field560 = var2;
        }
        Statics.field1047 = Statics.field177.field918;
        field707 = false;
    }

    @ObfuscatedName("fp.ln(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3252(String arg0) {
        class229[] var1 = class229.method3368();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3070 != -1 && arg0.startsWith(class82.method248(var3.field3070))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3070).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.lo(B)V")
    public static void method207() {
        if (Statics.field1922 == null) {
            return;
        }
        field893 = field635;
        Statics.field1922.method3932();
        for (int var0 = 0; var0 < field740.length; var0++) {
            if (field740[var0] != null) {
                Statics.field1922.method3928((field740[var0].field957 >> 7) + Statics.field1299, (field740[var0].field918 >> 7) + Statics.field2085);
            }
        }
    }
}

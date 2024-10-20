package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class48 implements class291 {

    @ObfuscatedName("client.w")
    public static class167[] field702 = new class167[4];

    @ObfuscatedName("client.aq")
    public static boolean field857 = true;

    @ObfuscatedName("client.bs")
    public static int field692 = 1;

    @ObfuscatedName("client.bz")
    public static int field661 = 0;

    @ObfuscatedName("client.bi")
    public static int field646 = 0;

    @ObfuscatedName("client.bq")
    public static boolean field648 = false;

    @ObfuscatedName("client.bw")
    public static boolean field649 = false;

    @ObfuscatedName("client.bf")
    public static int field786 = 0;

    @ObfuscatedName("client.bc")
    public static int field652 = -1;

    @ObfuscatedName("client.bg")
    public static boolean field771 = false;

    @ObfuscatedName("client.be")
    public static int field721 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field655 = true;

    @ObfuscatedName("client.cc")
    public static int field656 = 0;

    @ObfuscatedName("client.cx")
    public static long field657 = 1L;

    @ObfuscatedName("client.ca")
    public static int field736 = -1;

    @ObfuscatedName("client.cf")
    public static int field644 = -1;

    @ObfuscatedName("client.cn")
    public static long field815 = -1L;

    @ObfuscatedName("client.co")
    public static boolean field920 = true;

    @ObfuscatedName("client.ck")
    public static boolean field887 = false;

    @ObfuscatedName("client.cp")
    public static int field663 = 0;

    @ObfuscatedName("client.ch")
    public static int field664 = 0;

    @ObfuscatedName("client.ct")
    public static int field665 = 0;

    @ObfuscatedName("client.cs")
    public static int field666 = 0;

    @ObfuscatedName("client.cq")
    public static int field667 = 0;

    @ObfuscatedName("client.cj")
    public static int field668 = 0;

    @ObfuscatedName("client.cu")
    public static int field669 = 0;

    @ObfuscatedName("client.ci")
    public static int field670 = 0;

    @ObfuscatedName("client.cv")
    public static int field756 = 0;

    @ObfuscatedName("client.cz")
    public static class79 field672 = class79.field1135;

    @ObfuscatedName("client.dm")
    public static class79 field673 = class79.field1135;

    @ObfuscatedName("client.dc")
    public static int field903 = 0;

    @ObfuscatedName("client.dh")
    public static int field675 = 0;

    @ObfuscatedName("client.dj")
    public static int field683 = 0;

    @ObfuscatedName("client.eb")
    public static int field788 = 0;

    @ObfuscatedName("client.el")
    public static int field678 = 0;

    @ObfuscatedName("client.ex")
    public static int field679 = 0;

    @ObfuscatedName("client.ey")
    public static int field680 = 0;

    @ObfuscatedName("client.eu")
    public static int field761 = 0;

    @ObfuscatedName("client.em")
    public static class149 field682 = class149.field1965;

    @ObfuscatedName("client.ed")
    public static boolean field747 = false;

    @ObfuscatedName("client.ew")
    public static class83 field684 = new class83();

    @ObfuscatedName("client.ea")
    public static byte[] field709 = null;

    @ObfuscatedName("client.eo")
    public static class74[] field807 = new class74[32768];

    @ObfuscatedName("client.ep")
    public static int field687 = 0;

    @ObfuscatedName("client.ef")
    public static int[] field688 = new int[32768];

    @ObfuscatedName("client.et")
    public static int field780 = 0;

    @ObfuscatedName("client.ff")
    public static int[] field690 = new int[250];

    @ObfuscatedName("client.fh")
    public static final class90 field691 = new class90();

    @ObfuscatedName("client.fi")
    public static int field726 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field693 = false;

    @ObfuscatedName("client.fr")
    public static boolean field823 = true;

    @ObfuscatedName("client.fp")
    public static class283 field905 = new class283();

    @ObfuscatedName("client.fz")
    public static HashMap field696 = new HashMap();

    @ObfuscatedName("client.fo")
    public static int field697 = 0;

    @ObfuscatedName("client.fk")
    public static int field698 = 1;

    @ObfuscatedName("client.fu")
    public static int field754 = 0;

    @ObfuscatedName("client.fj")
    public static int field910 = 1;

    @ObfuscatedName("client.fl")
    public static int field701 = 0;

    @ObfuscatedName("client.go")
    public static boolean field703 = false;

    @ObfuscatedName("client.gp")
    public static int[][][] field704 = new int[4][13][13];

    @ObfuscatedName("client.ge")
    public static final int[] field705 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gh")
    public static int field706 = 0;

    @ObfuscatedName("client.gy")
    public static int field918 = 2301979;

    @ObfuscatedName("client.gi")
    public static int field779 = 5063219;

    @ObfuscatedName("client.hy")
    public static int field884 = 3353893;

    @ObfuscatedName("client.hc")
    public static int field710 = 7759444;

    @ObfuscatedName("client.hk")
    public static boolean field695 = false;

    @ObfuscatedName("client.hm")
    public static int field803 = 0;

    @ObfuscatedName("client.hl")
    public static int field713 = 128;

    @ObfuscatedName("client.hg")
    public static int field659 = 0;

    @ObfuscatedName("client.ho")
    public static int field715 = 0;

    @ObfuscatedName("client.ht")
    public static int field716 = 0;

    @ObfuscatedName("client.hv")
    public static int field870 = 0;

    @ObfuscatedName("client.hp")
    public static int field718 = 0;

    @ObfuscatedName("client.hh")
    public static int field719 = 0;

    @ObfuscatedName("client.hx")
    public static int field720 = 50;

    @ObfuscatedName("client.hj")
    public static int field708 = 0;

    @ObfuscatedName("client.hu")
    public static int field722 = 0;

    @ObfuscatedName("client.hn")
    public static int field858 = 0;

    @ObfuscatedName("client.ir")
    public static int field724 = 12;

    @ObfuscatedName("client.iv")
    public static int field725 = 6;

    @ObfuscatedName("client.iw")
    public static int field660 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field727 = false;

    @ObfuscatedName("client.ig")
    public static int field728 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field729 = false;

    @ObfuscatedName("client.io")
    public static int field730 = 0;

    @ObfuscatedName("client.il")
    public static int field913 = 0;

    @ObfuscatedName("client.iy")
    public static int field732 = 50;

    @ObfuscatedName("client.ij")
    public static int[] field733 = new int[field732];

    @ObfuscatedName("client.if")
    public static int[] field734 = new int[field732];

    @ObfuscatedName("client.in")
    public static int[] field739 = new int[field732];

    @ObfuscatedName("client.ib")
    public static int[] field758 = new int[field732];

    @ObfuscatedName("client.it")
    public static String field767 = null;

    @ObfuscatedName("client.iu")
    public static int[] field737 = new int[field732];

    @ObfuscatedName("client.ip")
    public static int[] field738 = new int[field732];

    @ObfuscatedName("client.ih")
    public static int[] field819 = new int[field732];

    @ObfuscatedName("client.id")
    public static String[] field740 = new String[field732];

    @ObfuscatedName("client.is")
    public static int[][] field741 = new int[104][104];

    @ObfuscatedName("client.ic")
    public static int field742 = 0;

    @ObfuscatedName("client.im")
    public static int field653 = -1;

    @ObfuscatedName("client.ii")
    public static int field904 = -1;

    @ObfuscatedName("client.ia")
    public static int field745 = 0;

    @ObfuscatedName("client.ik")
    public static int field746 = 0;

    @ObfuscatedName("client.jx")
    public static int field810 = 0;

    @ObfuscatedName("client.ju")
    public static int field760 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field749 = true;

    @ObfuscatedName("client.jh")
    public static int field750 = 0;

    @ObfuscatedName("client.jk")
    public static int field751 = 0;

    @ObfuscatedName("client.jj")
    public static int field752 = 0;

    @ObfuscatedName("client.jb")
    public static int field753 = 0;

    @ObfuscatedName("client.jd")
    public static int field846 = 0;

    @ObfuscatedName("client.jw")
    public static int field798 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field674 = false;

    @ObfuscatedName("client.jv")
    public static int field757 = 0;

    @ObfuscatedName("client.jy")
    public static int field681 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field759 = true;

    @ObfuscatedName("client.jn")
    public static class62[] field699 = new class62[2048];

    @ObfuscatedName("client.jc")
    public static int field748 = -1;

    @ObfuscatedName("client.js")
    public static int field762 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field763 = true;

    @ObfuscatedName("client.ka")
    public static int field677 = 0;

    @ObfuscatedName("client.kv")
    public static int field851 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field744 = new int[1000];

    @ObfuscatedName("client.kl")
    public static final int[] field743 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kg")
    public static String[] field768 = new String[8];

    @ObfuscatedName("client.ky")
    public static boolean[] field769 = new boolean[8];

    @ObfuscatedName("client.ko")
    public static int[] field700 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ks")
    public static int field770 = -1;

    @ObfuscatedName("client.km")
    public static class208[][][] field830 = new class208[4][104][104];

    @ObfuscatedName("client.kc")
    public static class208 field689 = new class208();

    @ObfuscatedName("client.kw")
    public static class208 field774 = new class208();

    @ObfuscatedName("client.kz")
    public static class208 field712 = new class208();

    @ObfuscatedName("client.kx")
    public static int[] field776 = new int[25];

    @ObfuscatedName("client.kr")
    public static int[] field777 = new int[25];

    @ObfuscatedName("client.kp")
    public static int[] field778 = new int[25];

    @ObfuscatedName("client.ku")
    public static int field867 = 0;

    @ObfuscatedName("client.kk")
    public static boolean field834 = false;

    @ObfuscatedName("client.kt")
    public static int field781 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field782 = new int[500];

    @ObfuscatedName("client.lb")
    public static int[] field783 = new int[500];

    @ObfuscatedName("client.lw")
    public static int[] field784 = new int[500];

    @ObfuscatedName("client.lc")
    public static int[] field785 = new int[500];

    @ObfuscatedName("client.ll")
    public static String[] field917 = new String[500];

    @ObfuscatedName("client.lo")
    public static String[] field787 = new String[500];

    @ObfuscatedName("client.lk")
    public static boolean[] field773 = new boolean[500];

    @ObfuscatedName("client.lh")
    public static boolean field789 = false;

    @ObfuscatedName("client.lx")
    public static boolean field790 = false;

    @ObfuscatedName("client.li")
    public static boolean field791 = false;

    @ObfuscatedName("client.ls")
    public static boolean field792 = true;

    @ObfuscatedName("client.lu")
    public static int field793 = -1;

    @ObfuscatedName("client.ld")
    public static int field861 = -1;

    @ObfuscatedName("client.lg")
    public static int field795 = 0;

    @ObfuscatedName("client.lq")
    public static int field796 = 50;

    @ObfuscatedName("client.lf")
    public static int field797 = 0;

    @ObfuscatedName("client.lt")
    public static boolean field799 = false;

    @ObfuscatedName("client.le")
    public static int field800 = -1;

    @ObfuscatedName("client.lm")
    public static int field735 = -1;

    @ObfuscatedName("client.mw")
    public static String field802 = null;

    @ObfuscatedName("client.mg")
    public static String field717 = null;

    @ObfuscatedName("client.mj")
    public static int field804 = -1;

    @ObfuscatedName("client.mn")
    public static class205 field805 = new class205(8);

    @ObfuscatedName("client.mp")
    public static int field806 = 0;

    @ObfuscatedName("client.me")
    public static int field643 = -1;

    @ObfuscatedName("client.ma")
    public static int field808 = 0;

    @ObfuscatedName("client.mb")
    public static int field809 = 0;

    @ObfuscatedName("client.mv")
    public static class233 field881 = null;

    @ObfuscatedName("client.md")
    public static int field811 = 0;

    @ObfuscatedName("client.mh")
    public static int field852 = 0;

    @ObfuscatedName("client.mu")
    public static int field813 = 0;

    @ObfuscatedName("client.mk")
    public static int field814 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field864 = false;

    @ObfuscatedName("client.mc")
    public static class233 field816 = null;

    @ObfuscatedName("client.mq")
    public static class233 field817 = null;

    @ObfuscatedName("client.mi")
    public static class233 field818 = null;

    @ObfuscatedName("client.mt")
    public static int field907 = 0;

    @ObfuscatedName("client.ml")
    public static int field839 = 0;

    @ObfuscatedName("client.mo")
    public static class233 field812 = null;

    @ObfuscatedName("client.mz")
    public static boolean field822 = false;

    @ObfuscatedName("client.mr")
    public static int field714 = -1;

    @ObfuscatedName("client.nd")
    public static int field824 = -1;

    @ObfuscatedName("client.nm")
    public static boolean field825 = false;

    @ObfuscatedName("client.nb")
    public static int field826 = -1;

    @ObfuscatedName("client.ne")
    public static int field827 = -1;

    @ObfuscatedName("client.nq")
    public static boolean field828 = false;

    @ObfuscatedName("client.np")
    public static int field829 = 1;

    @ObfuscatedName("client.nw")
    public static int[] field654 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field831 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field832 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field833 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field775 = new int[32];

    @ObfuscatedName("client.nz")
    public static int field835 = 0;

    @ObfuscatedName("client.nf")
    public static int field836 = 0;

    @ObfuscatedName("client.nh")
    public static int field837 = 0;

    @ObfuscatedName("client.nk")
    public static int field838 = 0;

    @ObfuscatedName("client.ns")
    public static int field859 = 0;

    @ObfuscatedName("client.nt")
    public static int field840 = 0;

    @ObfuscatedName("client.nr")
    public static int field686 = 0;

    @ObfuscatedName("client.og")
    public static int field842 = 0;

    @ObfuscatedName("client.op")
    public static class208 field843 = new class208();

    @ObfuscatedName("client.of")
    public static class208 field844 = new class208();

    @ObfuscatedName("client.ot")
    public static class208 field845 = new class208();

    @ObfuscatedName("client.oe")
    public static class205 field801 = new class205(512);

    @ObfuscatedName("client.oa")
    public static int field854 = 0;

    @ObfuscatedName("client.ok")
    public static int field848 = -2;

    @ObfuscatedName("client.oy")
    public static boolean[] field849 = new boolean[100];

    @ObfuscatedName("client.oc")
    public static boolean[] field850 = new boolean[100];

    @ObfuscatedName("client.oo")
    public static boolean[] field707 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static int[] field764 = new int[100];

    @ObfuscatedName("client.oh")
    public static int[] field853 = new int[100];

    @ObfuscatedName("client.oz")
    public static int[] field820 = new int[100];

    @ObfuscatedName("client.oi")
    public static int[] field855 = new int[100];

    @ObfuscatedName("client.or")
    public static int field856 = 0;

    @ObfuscatedName("client.on")
    public static long field871 = 0L;

    @ObfuscatedName("client.ob")
    public static boolean field676 = true;

    @ObfuscatedName("client.os")
    public static int[] field860 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ol")
    public static int field731 = 0;

    @ObfuscatedName("client.pd")
    public static int field862 = 0;

    @ObfuscatedName("client.pi")
    public static String field863 = "";

    @ObfuscatedName("client.ps")
    public static long[] field841 = new long[100];

    @ObfuscatedName("client.pt")
    public static int field865 = 0;

    @ObfuscatedName("client.pb")
    public static int field866 = 0;

    @ObfuscatedName("client.pe")
    public static int[] field847 = new int[128];

    @ObfuscatedName("client.pr")
    public static int[] field868 = new int[128];

    @ObfuscatedName("client.pw")
    public static long field869 = -1L;

    @ObfuscatedName("client.pp")
    public static int field662 = -1;

    @ObfuscatedName("client.pn")
    public static int field821 = 0;

    @ObfuscatedName("client.po")
    public static int[] field872 = new int[1000];

    @ObfuscatedName("client.py")
    public static int[] field873 = new int[1000];

    @ObfuscatedName("client.pq")
    public static class324[] field874 = new class324[1000];

    @ObfuscatedName("client.pa")
    public static int field723 = 0;

    @ObfuscatedName("client.pm")
    public static int field876 = 0;

    @ObfuscatedName("client.qp")
    public static int field877 = 0;

    @ObfuscatedName("client.qw")
    public static int field878 = 255;

    @ObfuscatedName("client.qj")
    public static int field879 = -1;

    @ObfuscatedName("client.qo")
    public static boolean field880 = false;

    @ObfuscatedName("client.qq")
    public static int field889 = 127;

    @ObfuscatedName("client.qv")
    public static int field882 = 127;

    @ObfuscatedName("client.qa")
    public static int field906 = 0;

    @ObfuscatedName("client.qk")
    public static int[] field885 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field886 = new int[50];

    @ObfuscatedName("client.qu")
    public static int[] field794 = new int[50];

    @ObfuscatedName("client.qt")
    public static int[] field888 = new int[50];

    @ObfuscatedName("client.qm")
    public static class94[] field711 = new class94[50];

    @ObfuscatedName("client.ql")
    public static boolean field890 = false;

    @ObfuscatedName("client.rs")
    public static boolean[] field891 = new boolean[5];

    @ObfuscatedName("client.rg")
    public static int[] field892 = new int[5];

    @ObfuscatedName("client.ro")
    public static int[] field893 = new int[5];

    @ObfuscatedName("client.rd")
    public static int[] field894 = new int[5];

    @ObfuscatedName("client.rf")
    public static int[] field895 = new int[5];

    @ObfuscatedName("client.rq")
    public static short field650 = 256;

    @ObfuscatedName("client.rz")
    public static short field897 = 205;

    @ObfuscatedName("client.ra")
    public static short field898 = 256;

    @ObfuscatedName("client.rr")
    public static short field899 = 320;

    @ObfuscatedName("client.rm")
    public static short field900 = 1;

    @ObfuscatedName("client.rt")
    public static short field685 = 32767;

    @ObfuscatedName("client.ry")
    public static short field902 = 1;

    @ObfuscatedName("client.rn")
    public static short field755 = 32767;

    @ObfuscatedName("client.rp")
    public static int field658 = 0;

    @ObfuscatedName("client.rx")
    public static int field694 = 0;

    @ObfuscatedName("client.rl")
    public static int field645 = 0;

    @ObfuscatedName("client.re")
    public static int field765 = 0;

    @ObfuscatedName("client.rw")
    public static int field908 = 0;

    @ObfuscatedName("client.rb")
    public static class230 field909 = new class230();

    @ObfuscatedName("client.rv")
    public static int field875 = -1;

    @ObfuscatedName("client.rk")
    public static int field911 = -1;

    @ObfuscatedName("client.sw")
    public static class327 field912 = new class326();

    @ObfuscatedName("client.sf")
    public static class5[] field896 = new class5[8];

    @ObfuscatedName("client.sq")
    public static class63 field914 = new class63();

    @ObfuscatedName("client.sv")
    public static int field915 = -1;

    @ObfuscatedName("client.sy")
    public static ArrayList field916 = new ArrayList(10);

    @ObfuscatedName("client.se")
    public static int field766 = 0;

    @ObfuscatedName("client.sx")
    public static final class61 field671 = new class61();

    @ObfuscatedName("client.sn")
    public static int[] field919 = new int[50];

    @ObfuscatedName("client.tp")
    public static int[] field901 = new int[50];

    @ObfuscatedName("w.ea(I)Llg;")
    public static class330 method89() {
        return Statics.field419;
    }

    @ObfuscatedName("client.am(S)V")
    public final void method770() {
    }

    public final void init() {
        if (!this.method778()) {
            return;
        }
        class282[] var1 = class282.method2852();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class282 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3678);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3678)) {
                    case 1:
                        field823 = Integer.parseInt(var4) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class76.field1121)) {
                            field648 = true;
                        } else {
                            field648 = false;
                        }
                        break;
                    case 4:
                        if (field652 == -1) {
                            field652 = Integer.parseInt(var4);
                        }
                        break;
                    case 5:
                        field661 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field786 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field2442 = Statics.method1883(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class76.field1121)) {
                        }
                        break;
                    case 9:
                        Statics.field49 = var4;
                        break;
                    case 10:
                        Statics.field647 = (class247) class180.method712(class247.method4427(), Integer.parseInt(var4));
                        if (Statics.field647 == class247.field3208) {
                            Statics.field921 = class331.field4003;
                        } else {
                            Statics.field921 = class331.field4010;
                        }
                        break;
                    case 12:
                        field692 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field651 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field646 = Integer.parseInt(var4);
                        break;
                    case 17:
                        Statics.field1497 = var4;
                }
            }
        }
        method3350();
        Statics.field80 = this.getCodeBase().getHost();
        String var5 = Statics.field2442.field3197;
        byte var6 = 0;
        try {
            class158.method1027("oldschool", var5, var6, 18);
        } catch (Exception var8) {
            class155.method1917((String) null, var8);
        }
        Statics.field2038 = this;
        Statics.field257 = field652;
        this.method776(765, 503, 177);
    }

    @ObfuscatedName("fq.eh(I)V")
    public static final void method3350() {
        class128.field1778 = false;
        field649 = false;
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method789() {
        class186.method4426(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1929 = field646 == 0 ? 43594 : field692 + 40000;
        Statics.field24 = field646 == 0 ? 443 : field692 + 50000;
        Statics.field1948 = Statics.field1929;
        Statics.field386 = class231.field2651;
        Statics.field3307 = class231.field2650;
        Statics.field2643 = class231.field2652;
        Statics.field2639 = class231.field2653;
        Statics.field353 = new class138();
        this.method765();
        this.method771();
        Statics.field2077 = this.method769();
        Statics.field541 = new class165(255, class158.field2029, class158.field2030, 500000);
        class113 var1 = null;
        class68 var2 = new class68();
        try {
            var1 = class158.method86("", Statics.field647.field3203, false);
            byte[] var3 = new byte[(int) var1.method2517()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2518(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class68(new class185(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method2515();
            }
        } catch (Exception var11) {
        }
        Statics.field436 = var2;
        this.method839();
        String var10 = Statics.field223;
        class46.field420 = this;
        if (var10 != null) {
            class46.field421 = var10;
        }
        if (field646 != 0) {
            field887 = true;
        }
        method475(Statics.field436.field1032);
        Statics.field2151 = new class69(Statics.field921);
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method790() {
        field656++;
        this.method1158();
        Statics.method940();
        try {
            if (class220.field2530 == 1) {
                int var1 = Statics.field2462.method4073();
                if (var1 > 0 && Statics.field2462.method4146()) {
                    int var2 = var1 - Statics.field1;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2462.method4094(var2);
                } else {
                    Statics.field2462.method4172();
                    Statics.field2462.method4130();
                    if (Statics.field1912 == null) {
                        class220.field2530 = 0;
                    } else {
                        class220.field2530 = 2;
                    }
                    Statics.field40 = null;
                    Statics.field1219 = null;
                }
            }
        } catch (Exception var241) {
            var241.printStackTrace();
            Statics.field2462.method4172();
            class220.field2530 = 0;
            Statics.field40 = null;
            Statics.field1219 = null;
            Statics.field1912 = null;
        }
        method3257();
        class40 var4 = class40.field387;
        synchronized (class40.field387) {
            class40.field392++;
            class40.field389 = class40.field391;
            class40.field388 = 0;
            if (class40.field384 >= 0) {
                while (class40.field384 != class40.field375) {
                    int var6 = class40.field382[class40.field375];
                    class40.field375 = class40.field375 + 1 & 0x7F;
                    if (var6 < 0) {
                        class40.field381[~var6] = false;
                    } else {
                        if (!class40.field381[var6] && class40.field388 < class40.field378.length - 1) {
                            class40.field378[++class40.field388 - 1] = var6;
                        }
                        class40.field381[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class40.field381[var5] = false;
                }
                class40.field384 = class40.field375;
            }
            if (class40.field388 > 0) {
                class40.field392 = 0;
            }
            class40.field391 = class40.field390;
        }
        class49 var8 = class49.field471;
        synchronized (class49.field471) {
            class49.field470 = class49.field482;
            class49.field474 = class49.field467;
            class49.field465 = class49.field464 * -1727565463;
            class49.field473 = class49.field469;
            class49.field478 = class49.field472;
            class49.field479 = class49.field475;
            class49.field468 = class49.field476;
            class49.field466 = class49.field477;
            class49.field472 = 0;
        }
        if (Statics.field2077 != null) {
            int var10 = Statics.field2077.method645();
            field842 = var10;
        }
        if (field721 == 0) {
            method1938();
            Statics.field434.method3147();
            for (int var11 = 0; var11 < 32; var11++) {
                field430[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field445[var12] = 0L;
            }
            Statics.field2364 = 0;
        } else if (field721 == 5) {
            class80.method1638(this);
            method1938();
            Statics.field434.method3147();
            for (int var13 = 0; var13 < 32; var13++) {
                field430[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field445[var14] = 0L;
            }
            Statics.field2364 = 0;
        } else if (field721 == 10 || field721 == 11) {
            class80.method1638(this);
        } else if (field721 == 20) {
            class80.method1638(this);
            this.method1161();
        } else if (field721 == 25) {
            method1865(false);
            field697 = 0;
            boolean var15 = true;
            for (int var16 = 0; var16 < Statics.field2459.length; var16++) {
                if (Statics.field2533[var16] != -1 && Statics.field2459[var16] == null) {
                    Statics.field2459[var16] = Statics.field4018.method4438(Statics.field2533[var16], 0);
                    if (Statics.field2459[var16] == null) {
                        var15 = false;
                        field697++;
                    }
                }
                if (Statics.field296[var16] != -1 && Statics.field1488[var16] == null) {
                    Statics.field1488[var16] = Statics.field4018.method4476(Statics.field296[var16], 0, Statics.field3248[var16]);
                    if (Statics.field1488[var16] == null) {
                        var15 = false;
                        field697++;
                    }
                }
            }
            if (var15) {
                field754 = 0;
                boolean var17 = true;
                for (int var18 = 0; var18 < Statics.field2459.length; var18++) {
                    byte[] var19 = Statics.field1488[var18];
                    if (var19 != null) {
                        int var20 = (Statics.field368[var18] >> 8) * 64 - Statics.field491;
                        int var21 = (Statics.field368[var18] & 0xFF) * 64 - Statics.field92;
                        if (field703) {
                            var20 = 10;
                            var21 = 10;
                        }
                        var17 &= class51.method3780(var19, var20, var21);
                    }
                }
                if (var17) {
                    if (field701 != 0) {
                        method1053(class240.field3029 + class76.field1122 + class76.field1119 + 100 + "%" + class76.field1120, true);
                    }
                    method3257();
                    Statics.field3174.method2855();
                    for (int var22 = 0; var22 < 4; var22++) {
                        field702[var22].method3312();
                    }
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                class51.field493[var23][var24][var25] = 0;
                            }
                        }
                    }
                    method3257();
                    class51.field494 = 99;
                    Statics.field189 = new byte[4][104][104];
                    Statics.field1933 = new byte[4][104][104];
                    Statics.field495 = new byte[4][104][104];
                    Statics.field65 = new byte[4][104][104];
                    Statics.field554 = new int[4][105][105];
                    Statics.field504 = new byte[4][105][105];
                    Statics.field497 = new int[105][105];
                    Statics.field3211 = new int[104];
                    Statics.field511 = new int[104];
                    Statics.field2409 = new int[104];
                    Statics.field3740 = new int[104];
                    Statics.field3708 = new int[104];
                    int var26 = Statics.field2459.length;
                    class70.method3139();
                    method1865(true);
                    if (!field703) {
                        int var27 = 0;
                        label1163: while (true) {
                            if (var27 >= var26) {
                                for (int var41 = 0; var41 < var26; var41++) {
                                    int var42 = (Statics.field368[var41] >> 8) * 64 - Statics.field491;
                                    int var43 = (Statics.field368[var41] & 0xFF) * 64 - Statics.field92;
                                    byte[] var44 = Statics.field2459[var41];
                                    if (var44 == null && Statics.field2076 < 800) {
                                        method3257();
                                        class51.method3427(var42, var43, 64, 64);
                                    }
                                }
                                method1865(true);
                                int var45 = 0;
                                while (true) {
                                    if (var45 >= var26) {
                                        break label1163;
                                    }
                                    byte[] var46 = Statics.field1488[var45];
                                    if (var46 != null) {
                                        int var47 = (Statics.field368[var45] >> 8) * 64 - Statics.field491;
                                        int var48 = (Statics.field368[var45] & 0xFF) * 64 - Statics.field92;
                                        method3257();
                                        class128 var49 = Statics.field3174;
                                        class167[] var50 = field702;
                                        class185 var51 = new class185(var46);
                                        int var52 = -1;
                                        while (true) {
                                            int var53 = var51.method3480();
                                            if (var53 == 0) {
                                                break;
                                            }
                                            var52 += var53;
                                            int var54 = 0;
                                            while (true) {
                                                int var55 = var51.method3479();
                                                if (var55 == 0) {
                                                    break;
                                                }
                                                var54 += var55 - 1;
                                                int var56 = var54 & 0x3F;
                                                int var57 = var54 >> 6 & 0x3F;
                                                int var58 = var54 >> 12;
                                                int var59 = var51.method3679();
                                                int var60 = var59 >> 2;
                                                int var61 = var59 & 0x3;
                                                int var62 = var47 + var57;
                                                int var63 = var48 + var56;
                                                if (var62 > 0 && var63 > 0 && var62 < 103 && var63 < 103) {
                                                    int var64 = var58;
                                                    if ((class51.field493[1][var62][var63] & 0x2) == 2) {
                                                        var64 = var58 - 1;
                                                    }
                                                    class167 var65 = null;
                                                    if (var64 >= 0) {
                                                        var65 = var50[var64];
                                                    }
                                                    class51.method362(var58, var62, var63, var52, var61, var60, var49, var65);
                                                }
                                            }
                                        }
                                    }
                                    var45++;
                                }
                            }
                            int var28 = (Statics.field368[var27] >> 8) * 64 - Statics.field491;
                            int var29 = (Statics.field368[var27] & 0xFF) * 64 - Statics.field92;
                            byte[] var30 = Statics.field2459[var27];
                            if (var30 != null) {
                                method3257();
                                int var31 = Statics.field1728 * 8 - 48;
                                int var32 = Statics.field2076 * 8 - 48;
                                class167[] var33 = field702;
                                int var34 = 0;
                                label1160: while (true) {
                                    if (var34 >= 4) {
                                        class185 var37 = new class185(var30);
                                        int var38 = 0;
                                        while (true) {
                                            if (var38 >= 4) {
                                                break label1160;
                                            }
                                            for (int var39 = 0; var39 < 64; var39++) {
                                                for (int var40 = 0; var40 < 64; var40++) {
                                                    class51.method2851(var37, var38, var28 + var39, var29 + var40, var31, var32, 0);
                                                }
                                            }
                                            var38++;
                                        }
                                    }
                                    for (int var35 = 0; var35 < 64; var35++) {
                                        for (int var36 = 0; var36 < 64; var36++) {
                                            if (var28 + var35 > 0 && var28 + var35 < 103 && var29 + var36 > 0 && var29 + var36 < 103) {
                                                var33[var34].field2102[var28 + var35][var29 + var36] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var34++;
                                }
                            }
                            var27++;
                        }
                    }
                    if (field703) {
                        int var66 = 0;
                        label1096: while (true) {
                            if (var66 >= 4) {
                                for (int var84 = 0; var84 < 13; var84++) {
                                    for (int var85 = 0; var85 < 13; var85++) {
                                        int var86 = field704[0][var84][var85];
                                        if (var86 == -1) {
                                            class51.method3427(var84 * 8, var85 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1865(true);
                                int var87 = 0;
                                while (true) {
                                    if (var87 >= 4) {
                                        break label1096;
                                    }
                                    method3257();
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        for (int var89 = 0; var89 < 13; var89++) {
                                            int var90 = field704[var87][var88][var89];
                                            if (var90 != -1) {
                                                int var91 = var90 >> 24 & 0x3;
                                                int var92 = var90 >> 1 & 0x3;
                                                int var93 = var90 >> 14 & 0x3FF;
                                                int var94 = var90 >> 3 & 0x7FF;
                                                int var95 = (var93 / 8 << 8) + var94 / 8;
                                                for (int var96 = 0; var96 < Statics.field368.length; var96++) {
                                                    if (Statics.field368[var96] == var95 && Statics.field1488[var96] != null) {
                                                        class51.method4609(Statics.field1488[var96], var87, var88 * 8, var89 * 8, var91, (var93 & 0x7) * 8, (var94 & 0x7) * 8, var92, Statics.field3174, field702);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var87++;
                                }
                            }
                            method3257();
                            for (int var67 = 0; var67 < 13; var67++) {
                                for (int var68 = 0; var68 < 13; var68++) {
                                    boolean var69 = false;
                                    int var70 = field704[var66][var67][var68];
                                    if (var70 != -1) {
                                        int var71 = var70 >> 24 & 0x3;
                                        int var72 = var70 >> 1 & 0x3;
                                        int var73 = var70 >> 14 & 0x3FF;
                                        int var74 = var70 >> 3 & 0x7FF;
                                        int var75 = (var73 / 8 << 8) + var74 / 8;
                                        for (int var76 = 0; var76 < Statics.field368.length; var76++) {
                                            if (Statics.field368[var76] == var75 && Statics.field2459[var76] != null) {
                                                class51.method4737(Statics.field2459[var76], var66, var67 * 8, var68 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, field702);
                                                var69 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var69) {
                                        int var77 = var66;
                                        int var78 = var67 * 8;
                                        int var79 = var68 * 8;
                                        for (int var80 = 0; var80 < 8; var80++) {
                                            for (int var81 = 0; var81 < 8; var81++) {
                                                class51.field507[var77][var78 + var80][var79 + var81] = 0;
                                            }
                                        }
                                        if (var78 > 0) {
                                            for (int var82 = 1; var82 < 8; var82++) {
                                                class51.field507[var77][var78][var79 + var82] = class51.field507[var77][var78 - 1][var79 + var82];
                                            }
                                        }
                                        if (var79 > 0) {
                                            for (int var83 = 1; var83 < 8; var83++) {
                                                class51.field507[var77][var78 + var83][var79] = class51.field507[var77][var78 + var83][var79 - 1];
                                            }
                                        }
                                        if (var78 > 0 && class51.field507[var77][var78 - 1][var79] != 0) {
                                            class51.field507[var77][var78][var79] = class51.field507[var77][var78 - 1][var79];
                                        } else if (var79 > 0 && class51.field507[var77][var78][var79 - 1] != 0) {
                                            class51.field507[var77][var78][var79] = class51.field507[var77][var78][var79 - 1];
                                        } else if (var78 > 0 && var79 > 0 && class51.field507[var77][var78 - 1][var79 - 1] != 0) {
                                            class51.field507[var77][var78][var79] = class51.field507[var77][var78 - 1][var79 - 1];
                                        }
                                    }
                                }
                            }
                            var66++;
                        }
                    }
                    method1865(true);
                    method3257();
                    class128 var97 = Statics.field3174;
                    class167[] var98 = field702;
                    for (int var99 = 0; var99 < 4; var99++) {
                        for (int var100 = 0; var100 < 104; var100++) {
                            for (int var101 = 0; var101 < 104; var101++) {
                                if ((class51.field493[var99][var100][var101] & 0x1) == 1) {
                                    int var102 = var99;
                                    if ((class51.field493[1][var100][var101] & 0x2) == 2) {
                                        var102 = var99 - 1;
                                    }
                                    if (var102 >= 0) {
                                        var98[var102].method3315(var100, var101);
                                    }
                                }
                            }
                        }
                    }
                    class51.field505 += (int) (Math.random() * 5.0D) - 2;
                    if (class51.field505 < -8) {
                        class51.field505 = -8;
                    }
                    if (class51.field505 > 8) {
                        class51.field505 = 8;
                    }
                    class51.field499 += (int) (Math.random() * 5.0D) - 2;
                    if (class51.field499 < -16) {
                        class51.field499 = -16;
                    }
                    if (class51.field499 > 16) {
                        class51.field499 = 16;
                    }
                    for (int var103 = 0; var103 < 4; var103++) {
                        byte[][] var104 = Statics.field504[var103];
                        int var105 = (int) Math.sqrt(5100.0D);
                        int var106 = var105 * 768 >> 8;
                        for (int var107 = 1; var107 < 103; var107++) {
                            for (int var108 = 1; var108 < 103; var108++) {
                                int var109 = class51.field507[var103][var108 + 1][var107] - class51.field507[var103][var108 - 1][var107];
                                int var110 = class51.field507[var103][var108][var107 + 1] - class51.field507[var103][var108][var107 - 1];
                                int var111 = (int) Math.sqrt((double) (var110 * var110 + var109 * var109 + 65536));
                                int var112 = (var109 << 8) / var111;
                                int var113 = 65536 / var111;
                                int var114 = (var110 << 8) / var111;
                                int var115 = (var114 * -50 + var112 * -50 + var113 * -10) / var106 + 96;
                                int var116 = (var104[var108][var107] >> 1) + (var104[var108][var107 + 1] >> 3) + (var104[var108][var107 - 1] >> 2) + (var104[var108 - 1][var107] >> 2) + (var104[var108 + 1][var107] >> 3);
                                Statics.field497[var108][var107] = var115 - var116;
                            }
                        }
                        for (int var117 = 0; var117 < 104; var117++) {
                            Statics.field3211[var117] = 0;
                            Statics.field511[var117] = 0;
                            Statics.field2409[var117] = 0;
                            Statics.field3740[var117] = 0;
                            Statics.field3708[var117] = 0;
                        }
                        for (int var118 = -5; var118 < 109; var118++) {
                            for (int var119 = 0; var119 < 104; var119++) {
                                int var120 = var118 + 5;
                                int var10002;
                                if (var120 >= 0 && var120 < 104) {
                                    int var121 = Statics.field189[var103][var120][var119] & 0xFF;
                                    if (var121 > 0) {
                                        class262 var122 = class262.method455(var121 - 1);
                                        Statics.field3211[var119] += var122.field3362;
                                        Statics.field511[var119] += var122.field3365;
                                        Statics.field2409[var119] += var122.field3364;
                                        Statics.field3740[var119] += var122.field3361;
                                        var10002 = Statics.field3708[var119]++;
                                    }
                                }
                                int var123 = var118 - 5;
                                if (var123 >= 0 && var123 < 104) {
                                    int var124 = Statics.field189[var103][var123][var119] & 0xFF;
                                    if (var124 > 0) {
                                        class262 var125 = class262.method455(var124 - 1);
                                        Statics.field3211[var119] -= var125.field3362;
                                        Statics.field511[var119] -= var125.field3365;
                                        Statics.field2409[var119] -= var125.field3364;
                                        Statics.field3740[var119] -= var125.field3361;
                                        var10002 = Statics.field3708[var119]--;
                                    }
                                }
                            }
                            if (var118 >= 1 && var118 < 103) {
                                int var126 = 0;
                                int var127 = 0;
                                int var128 = 0;
                                int var129 = 0;
                                int var130 = 0;
                                for (int var131 = -5; var131 < 109; var131++) {
                                    int var132 = var131 + 5;
                                    if (var132 >= 0 && var132 < 104) {
                                        var126 += Statics.field3211[var132];
                                        var127 += Statics.field511[var132];
                                        var128 += Statics.field2409[var132];
                                        var129 += Statics.field3740[var132];
                                        var130 += Statics.field3708[var132];
                                    }
                                    int var133 = var131 - 5;
                                    if (var133 >= 0 && var133 < 104) {
                                        var126 -= Statics.field3211[var133];
                                        var127 -= Statics.field511[var133];
                                        var128 -= Statics.field2409[var133];
                                        var129 -= Statics.field3740[var133];
                                        var130 -= Statics.field3708[var133];
                                    }
                                    if (var131 >= 1 && var131 < 103 && (!field649 || (class51.field493[0][var118][var131] & 0x2) != 0 || (class51.field493[var103][var118][var131] & 0x10) == 0)) {
                                        if (var103 < class51.field494) {
                                            class51.field494 = var103;
                                        }
                                        int var134 = Statics.field189[var103][var118][var131] & 0xFF;
                                        int var135 = Statics.field1933[var103][var118][var131] & 0xFF;
                                        if (var134 > 0 || var135 > 0) {
                                            int var136 = class51.field507[var103][var118][var131];
                                            int var137 = class51.field507[var103][var118 + 1][var131];
                                            int var138 = class51.field507[var103][var118 + 1][var131 + 1];
                                            int var139 = class51.field507[var103][var118][var131 + 1];
                                            int var140 = Statics.field497[var118][var131];
                                            int var141 = Statics.field497[var118 + 1][var131];
                                            int var142 = Statics.field497[var118 + 1][var131 + 1];
                                            int var143 = Statics.field497[var118][var131 + 1];
                                            int var144 = -1;
                                            int var145 = -1;
                                            if (var134 > 0) {
                                                int var146 = var126 * 256 / var129;
                                                int var147 = var127 / var130;
                                                int var148 = var128 / var130;
                                                var144 = class51.method4830(var146, var147, var148);
                                                int var149 = class51.field505 + var146 & 0xFF;
                                                int var150 = class51.field499 + var148;
                                                if (var150 < 0) {
                                                    var150 = 0;
                                                } else if (var150 > 255) {
                                                    var150 = 255;
                                                }
                                                var145 = class51.method4830(var149, var147, var150);
                                            }
                                            if (var103 > 0) {
                                                boolean var151 = true;
                                                if (var134 == 0 && Statics.field495[var103][var118][var131] != 0) {
                                                    var151 = false;
                                                }
                                                if (var135 > 0) {
                                                    int var152 = var135 - 1;
                                                    class275 var153 = (class275) class275.field3602.method3879((long) var152);
                                                    class275 var154;
                                                    if (var153 == null) {
                                                        byte[] var155 = Statics.field3612.method4438(4, var152);
                                                        class275 var156 = new class275();
                                                        if (var155 != null) {
                                                            var156.method5038(new class185(var155), var152);
                                                        }
                                                        var156.method5018();
                                                        class275.field3602.method3885(var156, (long) var152);
                                                        var154 = var156;
                                                    } else {
                                                        var154 = var153;
                                                    }
                                                    if (!var154.field3603) {
                                                        var151 = false;
                                                    }
                                                }
                                                if (var151 && var136 == var137 && var136 == var138 && var136 == var139) {
                                                    Statics.field554[var103][var118][var131] |= 0x924;
                                                }
                                            }
                                            int var157 = 0;
                                            if (var145 != -1) {
                                                var157 = class125.field1750[class51.method4408(var145, 96)];
                                            }
                                            if (var135 == 0) {
                                                var97.method2860(var103, var118, var131, 0, 0, -1, var136, var137, var138, var139, class51.method4408(var144, var140), class51.method4408(var144, var141), class51.method4408(var144, var142), class51.method4408(var144, var143), 0, 0, 0, 0, var157, 0);
                                            } else {
                                                int var158 = Statics.field495[var103][var118][var131] + 1;
                                                byte var159 = Statics.field65[var103][var118][var131];
                                                int var160 = var135 - 1;
                                                class275 var161 = (class275) class275.field3602.method3879((long) var160);
                                                class275 var162;
                                                if (var161 == null) {
                                                    byte[] var163 = Statics.field3612.method4438(4, var160);
                                                    class275 var164 = new class275();
                                                    if (var163 != null) {
                                                        var164.method5038(new class185(var163), var160);
                                                    }
                                                    var164.method5018();
                                                    class275.field3602.method3885(var164, (long) var160);
                                                    var162 = var164;
                                                } else {
                                                    var162 = var161;
                                                }
                                                int var166 = var162.field3605;
                                                int var167;
                                                int var168;
                                                if (var166 >= 0) {
                                                    var167 = Statics.field1753.method2548(var166);
                                                    var168 = -1;
                                                } else if (var162.field3604 == 16711935) {
                                                    var168 = -2;
                                                    var166 = -1;
                                                    var167 = -2;
                                                } else {
                                                    var168 = class51.method4830(var162.field3608, var162.field3609, var162.field3611);
                                                    int var169 = class51.field505 + var162.field3608 & 0xFF;
                                                    int var170 = class51.field499 + var162.field3611;
                                                    if (var170 < 0) {
                                                        var170 = 0;
                                                    } else if (var170 > 255) {
                                                        var170 = 255;
                                                    }
                                                    var167 = class51.method4830(var169, var162.field3609, var170);
                                                }
                                                int var171 = 0;
                                                if (var167 != -2) {
                                                    var171 = class125.field1750[class51.method706(var167, 96)];
                                                }
                                                if (var162.field3607 != -1) {
                                                    int var172 = class51.field505 + var162.field3606 & 0xFF;
                                                    int var173 = class51.field499 + var162.field3613;
                                                    if (var173 < 0) {
                                                        var173 = 0;
                                                    } else if (var173 > 255) {
                                                        var173 = 255;
                                                    }
                                                    int var174 = class51.method4830(var172, var162.field3610, var173);
                                                    var171 = class125.field1750[class51.method706(var174, 96)];
                                                }
                                                var97.method2860(var103, var118, var131, var158, var159, var166, var136, var137, var138, var139, class51.method4408(var144, var140), class51.method4408(var144, var141), class51.method4408(var144, var142), class51.method4408(var144, var143), class51.method706(var168, var140), class51.method706(var168, var141), class51.method706(var168, var142), class51.method706(var168, var143), var157, var171);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var175 = 1; var175 < 103; var175++) {
                            for (int var176 = 1; var176 < 103; var176++) {
                                int var181;
                                if ((class51.field493[var103][var176][var175] & 0x8) != 0) {
                                    var181 = 0;
                                } else if (var103 <= 0 || (class51.field493[1][var176][var175] & 0x2) == 0) {
                                    var181 = var103;
                                } else {
                                    var181 = var103 - 1;
                                }
                                var97.method2859(var103, var176, var175, var181);
                            }
                        }
                        Statics.field189[var103] = (byte[][]) null;
                        Statics.field1933[var103] = (byte[][]) null;
                        Statics.field495[var103] = (byte[][]) null;
                        Statics.field65[var103] = (byte[][]) null;
                        Statics.field504[var103] = (byte[][]) null;
                    }
                    var97.method2955(-50, -10, -50);
                    for (int var182 = 0; var182 < 104; var182++) {
                        for (int var183 = 0; var183 < 104; var183++) {
                            if ((class51.field493[1][var182][var183] & 0x2) == 2) {
                                var97.method2857(var182, var183);
                            }
                        }
                    }
                    int var184 = 1;
                    int var185 = 2;
                    int var186 = 4;
                    for (int var187 = 0; var187 < 4; var187++) {
                        if (var187 > 0) {
                            var184 <<= 0x3;
                            var185 <<= 0x3;
                            var186 <<= 0x3;
                        }
                        for (int var188 = 0; var188 <= var187; var188++) {
                            for (int var189 = 0; var189 <= 104; var189++) {
                                for (int var190 = 0; var190 <= 104; var190++) {
                                    if ((Statics.field554[var188][var190][var189] & var184) != 0) {
                                        int var191 = var189;
                                        int var192 = var189;
                                        int var193 = var188;
                                        int var194 = var188;
                                        while (var191 > 0 && (Statics.field554[var188][var190][var191 - 1] & var184) != 0) {
                                            var191--;
                                        }
                                        while (var192 < 104 && (Statics.field554[var188][var190][var192 + 1] & var184) != 0) {
                                            var192++;
                                        }
                                        label747: while (var193 > 0) {
                                            for (int var195 = var191; var195 <= var192; var195++) {
                                                if ((Statics.field554[var193 - 1][var190][var195] & var184) == 0) {
                                                    break label747;
                                                }
                                            }
                                            var193--;
                                        }
                                        label736: while (var194 < var187) {
                                            for (int var196 = var191; var196 <= var192; var196++) {
                                                if ((Statics.field554[var194 + 1][var190][var196] & var184) == 0) {
                                                    break label736;
                                                }
                                            }
                                            var194++;
                                        }
                                        int var197 = (var194 + 1 - var193) * (var192 - var191 + 1);
                                        if (var197 >= 8) {
                                            short var198 = 240;
                                            int var199 = class51.field507[var194][var190][var191] - var198;
                                            int var200 = class51.field507[var193][var190][var191];
                                            class128.method2858(var187, 1, var190 * 128, var190 * 128, var191 * 128, var192 * 128 + 128, var199, var200);
                                            for (int var201 = var193; var201 <= var194; var201++) {
                                                for (int var202 = var191; var202 <= var192; var202++) {
                                                    Statics.field554[var201][var190][var202] &= ~var184;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field554[var188][var190][var189] & var185) != 0) {
                                        int var203 = var190;
                                        int var204 = var190;
                                        int var205 = var188;
                                        int var206 = var188;
                                        while (var203 > 0 && (Statics.field554[var188][var203 - 1][var189] & var185) != 0) {
                                            var203--;
                                        }
                                        while (var204 < 104 && (Statics.field554[var188][var204 + 1][var189] & var185) != 0) {
                                            var204++;
                                        }
                                        label800: while (var205 > 0) {
                                            for (int var207 = var203; var207 <= var204; var207++) {
                                                if ((Statics.field554[var205 - 1][var207][var189] & var185) == 0) {
                                                    break label800;
                                                }
                                            }
                                            var205--;
                                        }
                                        label789: while (var206 < var187) {
                                            for (int var208 = var203; var208 <= var204; var208++) {
                                                if ((Statics.field554[var206 + 1][var208][var189] & var185) == 0) {
                                                    break label789;
                                                }
                                            }
                                            var206++;
                                        }
                                        int var209 = (var206 + 1 - var205) * (var204 - var203 + 1);
                                        if (var209 >= 8) {
                                            short var210 = 240;
                                            int var211 = class51.field507[var206][var203][var189] - var210;
                                            int var212 = class51.field507[var205][var203][var189];
                                            class128.method2858(var187, 2, var203 * 128, var204 * 128 + 128, var189 * 128, var189 * 128, var211, var212);
                                            for (int var213 = var205; var213 <= var206; var213++) {
                                                for (int var214 = var203; var214 <= var204; var214++) {
                                                    Statics.field554[var213][var214][var189] &= ~var185;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field554[var188][var190][var189] & var186) != 0) {
                                        int var215 = var190;
                                        int var216 = var190;
                                        int var217 = var189;
                                        int var218 = var189;
                                        while (var217 > 0 && (Statics.field554[var188][var190][var217 - 1] & var186) != 0) {
                                            var217--;
                                        }
                                        while (var218 < 104 && (Statics.field554[var188][var190][var218 + 1] & var186) != 0) {
                                            var218++;
                                        }
                                        label853: while (var215 > 0) {
                                            for (int var219 = var217; var219 <= var218; var219++) {
                                                if ((Statics.field554[var188][var215 - 1][var219] & var186) == 0) {
                                                    break label853;
                                                }
                                            }
                                            var215--;
                                        }
                                        label842: while (var216 < 104) {
                                            for (int var220 = var217; var220 <= var218; var220++) {
                                                if ((Statics.field554[var188][var216 + 1][var220] & var186) == 0) {
                                                    break label842;
                                                }
                                            }
                                            var216++;
                                        }
                                        if ((var216 - var215 + 1) * (var218 - var217 + 1) >= 4) {
                                            int var221 = class51.field507[var188][var215][var217];
                                            class128.method2858(var187, 4, var215 * 128, var216 * 128 + 128, var217 * 128, var218 * 128 + 128, var221, var221);
                                            for (int var222 = var215; var222 <= var216; var222++) {
                                                for (int var223 = var217; var223 <= var218; var223++) {
                                                    Statics.field554[var188][var222][var223] &= ~var186;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method1865(true);
                    int var224 = class51.field494;
                    if (var224 > Statics.field600) {
                        var224 = Statics.field600;
                    }
                    if (var224 < Statics.field600 - 1) {
                        int var225 = Statics.field600 - 1;
                    }
                    if (field649) {
                        Statics.field3174.method2854(class51.field494);
                    } else {
                        Statics.field3174.method2854(0);
                    }
                    for (int var226 = 0; var226 < 104; var226++) {
                        for (int var227 = 0; var227 < 104; var227++) {
                            method4409(var226, var227);
                        }
                    }
                    method3257();
                    for (class64 var228 = (class64) field689.method3979(); var228 != null; var228 = (class64) field689.method3964()) {
                        if (var228.field934 == -1) {
                            var228.field933 = 0;
                            method711(var228);
                        } else {
                            var228.method3952();
                        }
                    }
                    class271.field3458.method3880();
                    if (Statics.field2038.method798()) {
                        class175 var229 = class175.method3035(class172.field2235, field691.field1283);
                        var229.field2333.method3617(1057001181);
                        field691.method2060(var229);
                    }
                    if (!field703) {
                        int var230 = (Statics.field1728 - 6) / 8;
                        int var231 = (Statics.field1728 + 6) / 8;
                        int var232 = (Statics.field2076 - 6) / 8;
                        int var233 = (Statics.field2076 + 6) / 8;
                        for (int var234 = var230 - 1; var234 <= var231 + 1; var234++) {
                            for (int var235 = var232 - 1; var235 <= var233 + 1; var235++) {
                                if (var234 < var230 || var234 > var231 || var235 < var232 || var235 > var233) {
                                    Statics.field4018.method4435("m" + var234 + "_" + var235);
                                    Statics.field4018.method4435("l" + var234 + "_" + var235);
                                }
                            }
                        }
                    }
                    method203(30);
                    method3257();
                    Statics.field189 = (byte[][][]) null;
                    Statics.field1933 = (byte[][][]) null;
                    Statics.field495 = (byte[][][]) null;
                    Statics.field65 = (byte[][][]) null;
                    Statics.field554 = (int[][][]) null;
                    Statics.field504 = (byte[][][]) null;
                    Statics.field497 = (int[][]) null;
                    Statics.field3211 = null;
                    Statics.field511 = null;
                    Statics.field2409 = null;
                    Statics.field3740 = null;
                    Statics.field3708 = null;
                    class175 var236 = class175.method3035(class172.field2284, field691.field1283);
                    field691.method2060(var236);
                    Statics.field434.method3147();
                    for (int var237 = 0; var237 < 32; var237++) {
                        field430[var237] = 0L;
                    }
                    for (int var238 = 0; var238 < 32; var238++) {
                        field445[var238] = 0L;
                    }
                    Statics.field2364 = 0;
                } else {
                    field701 = 2;
                }
            } else {
                field701 = 1;
            }
        }
        if (field721 == 30) {
            this.method1162();
        } else if (field721 == 40 || field721 == 45) {
            this.method1161();
        }
    }

    @ObfuscatedName("client.ar(ZI)V")
    public final void method791(boolean arg0) {
        boolean var2 = class220.method3429();
        if (var2 && field880 && Statics.field883 != null) {
            Statics.field883.method2211();
        }
        if ((field721 == 10 || field721 == 20 || field721 == 30) && field871 != 0L && class187.method2664() > field871) {
            method475(method212());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field849[var3] = true;
            }
        }
        if (field721 == 0) {
            this.method793(class80.field1159, class80.field1160, arg0);
        } else if (field721 == 5) {
            class80.method3043(Statics.field2067, Statics.field176, Statics.field26, arg0);
        } else if (field721 == 10 || field721 == 11) {
            class80.method3043(Statics.field2067, Statics.field176, Statics.field26, arg0);
        } else if (field721 == 20) {
            class80.method3043(Statics.field2067, Statics.field176, Statics.field26, arg0);
        } else if (field721 == 25) {
            if (field701 == 1) {
                if (field697 > field698) {
                    field698 = field697;
                }
                int var4 = (field698 * 50 - field697 * 50) / field698;
                method1053(class240.field3029 + class76.field1122 + class76.field1119 + var4 + "%" + class76.field1120, false);
            } else if (field701 == 2) {
                if (field754 > field910) {
                    field910 = field754;
                }
                int var5 = (field910 * 50 - field754 * 50) / field910 + 50;
                method1053(class240.field3029 + class76.field1122 + class76.field1119 + var5 + "%" + class76.field1120, false);
            } else {
                method1053(class240.field3029, false);
            }
        } else if (field721 == 30) {
            this.method1339();
        } else if (field721 == 40) {
            method1053(class240.field3002 + class76.field1122 + class240.field2868, false);
        } else if (field721 == 45) {
            method1053(class240.field3017, false);
        }
        if (field721 == 30 && field856 == 0 && !arg0 && !field676) {
            for (int var6 = 0; var6 < field854; var6++) {
                if (field850[var6]) {
                    Statics.field314.method753(field764[var6], field853[var6], field820[var6], field855[var6]);
                    field850[var6] = false;
                }
            }
        } else if (field721 > 0) {
            Statics.field314.method758(0, 0);
            for (int var7 = 0; var7 < field854; var7++) {
                field850[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.at(I)V")
    public final void method792() {
        if (Statics.field349.method1969()) {
            Statics.field349.method1966();
        }
        if (Statics.field348 != null) {
            Statics.field348.field587 = false;
        }
        Statics.field348 = null;
        field691.method2057();
        class40.method4410();
        if (class49.field471 != null) {
            class49 var1 = class49.field471;
            synchronized (class49.field471) {
                class49.field471 = null;
            }
        }
        Statics.field2077 = null;
        if (Statics.field883 != null) {
            Statics.field883.method2244();
        }
        if (Statics.field47 != null) {
            Statics.field47.method2244();
        }
        if (Statics.field3264 != null) {
            Statics.field3264.method3230();
        }
        Object var3 = class251.field3242;
        synchronized (class251.field3242) {
            if (class251.field3244 != 0) {
                class251.field3244 = 1;
                try {
                    class251.field3242.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field353 != null) {
            Statics.field353.method3050();
            Statics.field353 = null;
        }
        class158.method2521();
    }

    @ObfuscatedName("h.ek(II)V")
    public static void method203(int arg0) {
        if (field721 == arg0) {
            return;
        }
        if (field721 == 0) {
            Statics.field2038.method794();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field678 = 0;
            field679 = 0;
            field680 = 0;
            field905.method5089(arg0);
            if (arg0 != 20) {
                method538(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field525 != null) {
            Statics.field525.method3230();
            Statics.field525 = null;
        }
        if (field721 == 25) {
            field701 = 0;
            field697 = 0;
            field698 = 1;
            field754 = 0;
            field910 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class80.method298(Statics.field100, Statics.field2003, true, 0);
        } else if (arg0 == 20) {
            class80.method298(Statics.field100, Statics.field2003, true, field721 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class80.method298(Statics.field100, Statics.field2003, false, 4);
        } else if (Statics.field1175) {
            Statics.field1150 = null;
            Statics.field3802 = null;
            Statics.field45 = null;
            Statics.field1146 = null;
            Statics.field1147 = null;
            Statics.field3402 = null;
            Statics.field1148 = null;
            Statics.field2418 = null;
            Statics.field1862 = null;
            Statics.field1138 = null;
            Statics.field1491 = null;
            Statics.field82 = null;
            Statics.field514 = null;
            Statics.field78 = null;
            Statics.field1152 = null;
            Statics.field584 = null;
            Statics.field2049 = null;
            Statics.field1048 = null;
            Statics.field641 = null;
            Statics.field323 = null;
            Statics.field183 = null;
            Statics.field184 = null;
            class220.method3428(2);
            class253.method4273(true);
            Statics.field1175 = false;
        }
        field721 = arg0;
    }

    @ObfuscatedName("client.eo(B)V")
    public void method1158() {
        if (field721 != 1000) {
            boolean var1 = class253.method3033();
            if (!var1) {
                this.method1159();
            }
        }
    }

    @ObfuscatedName("client.ep(I)V")
    public void method1159() {
        if (class253.field3278 >= 4) {
            this.method795("js5crc");
            field721 = 1000;
            return;
        }
        if (class253.field3279 >= 4) {
            if (field721 <= 5) {
                this.method795("js5io");
                field721 = 1000;
                return;
            }
            field683 = 3000;
            class253.field3279 = 3;
        }
        if (--field683 + 1 > 0) {
            return;
        }
        try {
            if (field675 == 0) {
                Statics.field107 = Statics.field427.method3187(Statics.field80, Statics.field1948);
                field675++;
            }
            if (field675 == 1) {
                if (Statics.field107.field2008 == 2) {
                    this.method1160(-1);
                    return;
                }
                if (Statics.field107.field2008 == 1) {
                    field675++;
                }
            }
            if (field675 == 2) {
                if (field823) {
                    Statics.field1490 = class160.method1555((Socket) Statics.field107.field2012, 40000, 5000);
                } else {
                    Statics.field1490 = new class164((Socket) Statics.field107.field2012, Statics.field427, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3501(15);
                var1.method3617(177);
                Statics.field1490.method3234(var1.field2405, 0, 5);
                field675++;
                Statics.field412 = class187.method2664();
            }
            if (field675 == 3) {
                if (Statics.field1490.method3227() > 0 || !field823 && field721 <= 5) {
                    int var2 = Statics.field1490.method3233();
                    if (var2 != 0) {
                        this.method1160(var2);
                        return;
                    }
                    field675++;
                } else if (class187.method2664() - Statics.field412 > 30000L) {
                    this.method1160(-2);
                    return;
                }
            }
            if (field675 == 4) {
                class253.method208(Statics.field1490, field721 > 20);
                Statics.field107 = null;
                Statics.field1490 = null;
                field675 = 0;
                field788 = 0;
            }
        } catch (IOException var4) {
            this.method1160(-3);
        }
    }

    @ObfuscatedName("client.ef(II)V")
    public void method1160(int arg0) {
        Statics.field107 = null;
        Statics.field1490 = null;
        field675 = 0;
        if (Statics.field1948 == Statics.field1929) {
            Statics.field1948 = Statics.field24;
        } else {
            Statics.field1948 = Statics.field1929;
        }
        field788++;
        if (field788 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field721 <= 5) {
                this.method795("js5connect_full");
                field721 = 1000;
            } else {
                field683 = 3000;
            }
        } else if (field788 >= 2 && arg0 == 6) {
            this.method795("js5connect_outofdate");
            field721 = 1000;
        } else if (field788 >= 4) {
            if (field721 <= 5) {
                this.method795("js5connect");
                field721 = 1000;
            } else {
                field683 = 3000;
            }
        }
    }

    @ObfuscatedName("hd.et(Lih;Ljava/lang/String;I)V")
    public static void method4385(class252 arg0, String arg1) {
        class54 var2 = new class54(arg0, arg1);
        field916.add(var2);
    }

    @ObfuscatedName("bv.ff(III)V")
    public static void method1043(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class125.field1748[var4];
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (field899 - field898) * var8 / 100 + field898;
            int var10 = var5 * var9 / 256;
            var2[var3] = var7 * var10 >> 16;
        }
        class128.method2966(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("cl.fw(B)V")
    public static void method1938() {
        if (field903 == 0) {
            Statics.field3174 = new class128(4, 104, 104, class51.field507);
            for (int var0 = 0; var0 < 4; var0++) {
                field702[var0] = new class167(104, 104);
            }
            Statics.field30 = new class324(512, 512);
            class80.field1160 = class240.field2869;
            class80.field1159 = 5;
            field903 = 20;
        } else if (field903 == 20) {
            class80.field1160 = class240.field3120;
            class80.field1159 = 10;
            field903 = 30;
        } else if (field903 == 30) {
            Statics.field186 = method3037(0, false, true, true);
            Statics.field402 = method3037(1, false, true, true);
            Statics.field506 = method3037(2, true, false, true);
            Statics.field2021 = method3037(3, false, true, true);
            Statics.field73 = method3037(4, false, true, true);
            Statics.field4018 = method3037(5, true, true, true);
            Statics.field2118 = method3037(6, true, true, true);
            Statics.field81 = method3037(7, false, true, true);
            Statics.field2003 = method3037(8, false, true, true);
            Statics.field163 = method3037(9, false, true, true);
            Statics.field100 = method3037(10, false, true, true);
            Statics.field2457 = method3037(11, false, true, true);
            Statics.field1915 = method3037(12, false, true, true);
            Statics.field1092 = method3037(13, true, false, true);
            Statics.field274 = method3037(14, false, true, true);
            Statics.field3457 = method3037(15, false, true, true);
            Statics.field2040 = method3037(16, true, true, true);
            Statics.field1953 = method3037(17, true, true, true);
            class80.field1160 = class240.field2891;
            class80.field1159 = 20;
            field903 = 40;
        } else if (field903 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field186.method4529() * 4 / 100;
            int var3 = var2 + Statics.field402.method4529() * 4 / 100;
            int var4 = var3 + Statics.field506.method4529() * 2 / 100;
            int var5 = var4 + Statics.field2021.method4529() * 2 / 100;
            int var6 = var5 + Statics.field73.method4529() * 6 / 100;
            int var7 = var6 + Statics.field4018.method4529() * 4 / 100;
            int var8 = var7 + Statics.field2118.method4529() * 2 / 100;
            int var9 = var8 + Statics.field81.method4529() * 57 / 100;
            int var10 = var9 + Statics.field2003.method4529() * 2 / 100;
            int var11 = var10 + Statics.field163.method4529() * 2 / 100;
            int var12 = var11 + Statics.field100.method4529() * 2 / 100;
            int var13 = var12 + Statics.field2457.method4529() * 2 / 100;
            int var14 = var13 + Statics.field1915.method4529() * 2 / 100;
            int var15 = var14 + Statics.field1092.method4529() * 2 / 100;
            int var16 = var15 + Statics.field274.method4529() * 2 / 100;
            int var17 = var16 + Statics.field3457.method4529() * 2 / 100;
            int var18 = var17 + Statics.field2040.method4529() * 2 / 100;
            int var19 = var18 + (Statics.field1953.method4528() && Statics.field1953.method4511() ? 1 : 0);
            if (var19 == 100) {
                method4385(Statics.field186, "Animations");
                method4385(Statics.field402, "Skeletons");
                method4385(Statics.field73, "Sound FX");
                method4385(Statics.field4018, "Maps");
                method4385(Statics.field2118, "Music Tracks");
                method4385(Statics.field81, "Models");
                method4385(Statics.field2003, "Sprites");
                method4385(Statics.field2457, "Music Jingles");
                method4385(Statics.field274, "Music Samples");
                method4385(Statics.field3457, "Music Patches");
                method4385(Statics.field2040, "World Map");
                Statics.field9 = new class312();
                Statics.field9.method5496(Statics.field1953);
                class80.field1160 = class240.field2873;
                class80.field1159 = 30;
                field903 = 45;
            } else {
                if (var19 != 0) {
                    class80.field1160 = class240.field2872 + var19 + "%";
                }
                class80.field1159 = 30;
            }
        } else if (field903 == 45) {
            class98.method1575(22050, !field649, 2);
            class221 var20 = new class221();
            var20.method4074(9, 128);
            Statics.field883 = class98.method1733(Statics.field427, 0, 22050);
            Statics.field883.method2239(var20);
            class220.method3056(Statics.field3457, Statics.field274, Statics.field73, var20);
            Statics.field47 = class98.method1733(Statics.field427, 1, 2048);
            Statics.field414 = new class91();
            Statics.field47.method2239(Statics.field414);
            Statics.field3698 = new class105(22050, Statics.field1378);
            class80.field1160 = class240.field2874;
            class80.field1159 = 35;
            field903 = 50;
            Statics.field3748 = new class299(Statics.field2003, Statics.field1092);
        } else if (field903 == 50) {
            class298[] var21 = new class298[] { class298.field3739, class298.field3747, class298.field3742, class298.field3744, class298.field3743, class298.field3745 };
            int var22 = var21.length;
            class299 var23 = Statics.field3748;
            class298[] var24 = new class298[] { class298.field3739, class298.field3747, class298.field3742, class298.field3744, class298.field3743, class298.field3745 };
            field696 = var23.method5321(var24);
            if (field696.size() < var22) {
                class80.field1160 = class240.field2875 + field696.size() * 100 / var22 + "%";
                class80.field1159 = 40;
            } else {
                Statics.field176 = (class301) field696.get(class298.field3745);
                Statics.field26 = (class301) field696.get(class298.field3739);
                Statics.field2067 = (class301) field696.get(class298.field3747);
                Statics.field635 = field912.method5814();
                class80.field1160 = class240.field2876;
                class80.field1159 = 40;
                field903 = 60;
            }
        } else if (field903 == 60) {
            class252 var25 = Statics.field100;
            class252 var26 = Statics.field2003;
            int var27 = 0;
            if (var25.method4460("title.jpg", "")) {
                var27++;
            }
            if (var26.method4460("logo", "")) {
                var27++;
            }
            if (var26.method4460("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method4460("titlebox", "")) {
                var27++;
            }
            if (var26.method4460("titlebutton", "")) {
                var27++;
            }
            if (var26.method4460("runes", "")) {
                var27++;
            }
            if (var26.method4460("title_mute", "")) {
                var27++;
            }
            if (var26.method4460("options_radio_buttons,0", "")) {
                var27++;
            }
            if (var26.method4460("options_radio_buttons,2", "")) {
                var27++;
            }
            if (var26.method4460("options_radio_buttons,4", "")) {
                var27++;
            }
            if (var26.method4460("options_radio_buttons,6", "")) {
                var27++;
            }
            var26.method4460("sl_back", "");
            var26.method4460("sl_flags", "");
            var26.method4460("sl_arrows", "");
            var26.method4460("sl_stars", "");
            var26.method4460("sl_button", "");
            int var30 = class80.method1887();
            if (var27 < var30) {
                class80.field1160 = class240.field2965 + var27 * 100 / var30 + "%";
                class80.field1159 = 50;
            } else {
                class80.field1160 = class240.field2878;
                class80.field1159 = 50;
                method203(5);
                field903 = 70;
            }
        } else if (field903 == 70) {
            if (Statics.field506.method4511()) {
                class252 var31 = Statics.field506;
                Statics.field3612 = var31;
                class252 var32 = Statics.field506;
                Statics.field3366 = var32;
                class252 var33 = Statics.field506;
                class252 var34 = Statics.field81;
                Statics.field3379 = var33;
                Statics.field3368 = var34;
                Statics.field3369 = Statics.field3379.method4496(3);
                class271.method4658(Statics.field506, Statics.field81, field649);
                class274.method3375(Statics.field506, Statics.field81);
                class268.method3044(Statics.field506);
                class272.method478(Statics.field506, Statics.field81, field648, Statics.field176);
                class276.method1052(Statics.field506, Statics.field186, Statics.field402);
                class261.method2016(Statics.field506, Statics.field81);
                class266.method3346(Statics.field506);
                class257.method3223(Statics.field506);
                class233.method4043(Statics.field2021, Statics.field81, Statics.field2003, Statics.field1092);
                class252 var35 = Statics.field506;
                Statics.field3302 = var35;
                Statics.method1994(Statics.field506);
                class252 var36 = Statics.field506;
                Statics.field3337 = var36;
                class260.method4422(Statics.field506);
                class252 var37 = Statics.field506;
                Statics.field50 = var37;
                Statics.field349 = new class85();
                class252 var38 = Statics.field506;
                class252 var39 = Statics.field2003;
                class252 var40 = Statics.field1092;
                Statics.field2356 = var38;
                Statics.field3448 = var39;
                Statics.field3440 = var40;
                class252 var41 = Statics.field506;
                class252 var42 = Statics.field2003;
                Statics.field3390 = var41;
                Statics.field3381 = var42;
                class252 var43 = Statics.field506;
                class252 var44 = Statics.field2003;
                Statics.field3310 = var44;
                if (var43.method4511()) {
                    Statics.field3332 = var43.method4496(35);
                    Statics.field3311 = new class258[Statics.field3332];
                    for (int var45 = 0; var45 < Statics.field3332; var45++) {
                        byte[] var46 = var43.method4438(35, var45);
                        Statics.field3311[var45] = new class258(var45);
                        if (var46 != null) {
                            Statics.field3311[var45].method4645(new class185(var46));
                            Statics.field3311[var45].method4635();
                        }
                    }
                }
                class80.field1160 = class240.field2880;
                class80.field1159 = 60;
                field903 = 80;
            } else {
                class80.field1160 = class240.field2866 + Statics.field506.method4536() + "%";
                class80.field1159 = 60;
            }
        } else if (field903 == 80) {
            int var47 = 0;
            if (Statics.field552 == null) {
                Statics.field552 = class325.method3125(Statics.field2003, Statics.field9.field3817, 0);
            } else {
                var47++;
            }
            if (Statics.field99 == null) {
                Statics.field99 = class325.method3125(Statics.field2003, Statics.field9.field3818, 0);
            } else {
                var47++;
            }
            if (Statics.field3643 == null) {
                class252 var48 = Statics.field2003;
                int var49 = Statics.field9.field3816;
                class323[] var50;
                if (class325.method213(var48, var49, 0)) {
                    var50 = class325.method5499();
                } else {
                    var50 = null;
                }
                Statics.field3643 = var50;
            } else {
                var47++;
            }
            if (Statics.field636 == null) {
                class252 var51 = Statics.field2003;
                int var52 = Statics.field9.field3819;
                byte[] var53 = var51.method4438(var52, 0);
                boolean var54;
                if (var53 == null) {
                    var54 = false;
                } else {
                    class325.method2849(var53);
                    var54 = true;
                }
                class324[] var55;
                if (var54) {
                    class324[] var56 = new class324[Statics.field3894];
                    int var57 = 0;
                    while (true) {
                        if (var57 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var55 = var56;
                            break;
                        }
                        class324 var58 = var56[var57] = new class324();
                        var58.field3884 = Statics.field3892;
                        var58.field3885 = Statics.field3897;
                        var58.field3882 = Statics.field3891[var57];
                        var58.field3883 = Statics.field3893[var57];
                        var58.field3880 = Statics.field3896[var57];
                        var58.field3888 = Statics.field3335[var57];
                        int var59 = var58.field3888 * var58.field3880;
                        byte[] var60 = Statics.field3898[var57];
                        var58.field3890 = new int[var59];
                        for (int var61 = 0; var61 < var59; var61++) {
                            var58.field3890[var61] = Statics.field3895[var60[var61] & 0xFF];
                        }
                        var57++;
                    }
                } else {
                    var55 = null;
                }
                Statics.field636 = var55;
            } else {
                var47++;
            }
            if (Statics.field1914 == null) {
                class252 var63 = Statics.field2003;
                int var64 = Statics.field9.field3814;
                byte[] var65 = var63.method4438(var64, 0);
                boolean var66;
                if (var65 == null) {
                    var66 = false;
                } else {
                    class325.method2849(var65);
                    var66 = true;
                }
                class324[] var67;
                if (var66) {
                    class324[] var68 = new class324[Statics.field3894];
                    int var69 = 0;
                    while (true) {
                        if (var69 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var67 = var68;
                            break;
                        }
                        class324 var70 = var68[var69] = new class324();
                        var70.field3884 = Statics.field3892;
                        var70.field3885 = Statics.field3897;
                        var70.field3882 = Statics.field3891[var69];
                        var70.field3883 = Statics.field3893[var69];
                        var70.field3880 = Statics.field3896[var69];
                        var70.field3888 = Statics.field3335[var69];
                        int var71 = var70.field3888 * var70.field3880;
                        byte[] var72 = Statics.field3898[var69];
                        var70.field3890 = new int[var71];
                        for (int var73 = 0; var73 < var71; var73++) {
                            var70.field3890[var73] = Statics.field3895[var72[var73] & 0xFF];
                        }
                        var69++;
                    }
                } else {
                    var67 = null;
                }
                Statics.field1914 = var67;
            } else {
                var47++;
            }
            if (Statics.field490 == null) {
                class252 var75 = Statics.field2003;
                int var76 = Statics.field9.field3815;
                byte[] var77 = var75.method4438(var76, 0);
                boolean var78;
                if (var77 == null) {
                    var78 = false;
                } else {
                    class325.method2849(var77);
                    var78 = true;
                }
                class324[] var79;
                if (var78) {
                    class324[] var80 = new class324[Statics.field3894];
                    int var81 = 0;
                    while (true) {
                        if (var81 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var79 = var80;
                            break;
                        }
                        class324 var82 = var80[var81] = new class324();
                        var82.field3884 = Statics.field3892;
                        var82.field3885 = Statics.field3897;
                        var82.field3882 = Statics.field3891[var81];
                        var82.field3883 = Statics.field3893[var81];
                        var82.field3880 = Statics.field3896[var81];
                        var82.field3888 = Statics.field3335[var81];
                        int var83 = var82.field3888 * var82.field3880;
                        byte[] var84 = Statics.field3898[var81];
                        var82.field3890 = new int[var83];
                        for (int var85 = 0; var85 < var83; var85++) {
                            var82.field3890[var85] = Statics.field3895[var84[var85] & 0xFF];
                        }
                        var81++;
                    }
                } else {
                    var79 = null;
                }
                Statics.field490 = var79;
            } else {
                var47++;
            }
            if (Statics.field2422 == null) {
                class252 var87 = Statics.field2003;
                int var88 = Statics.field9.field3820;
                byte[] var89 = var87.method4438(var88, 0);
                boolean var90;
                if (var89 == null) {
                    var90 = false;
                } else {
                    class325.method2849(var89);
                    var90 = true;
                }
                class324[] var91;
                if (var90) {
                    class324[] var92 = new class324[Statics.field3894];
                    int var93 = 0;
                    while (true) {
                        if (var93 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var91 = var92;
                            break;
                        }
                        class324 var94 = var92[var93] = new class324();
                        var94.field3884 = Statics.field3892;
                        var94.field3885 = Statics.field3897;
                        var94.field3882 = Statics.field3891[var93];
                        var94.field3883 = Statics.field3893[var93];
                        var94.field3880 = Statics.field3896[var93];
                        var94.field3888 = Statics.field3335[var93];
                        int var95 = var94.field3888 * var94.field3880;
                        byte[] var96 = Statics.field3898[var93];
                        var94.field3890 = new int[var95];
                        for (int var97 = 0; var97 < var95; var97++) {
                            var94.field3890[var97] = Statics.field3895[var96[var97] & 0xFF];
                        }
                        var93++;
                    }
                } else {
                    var91 = null;
                }
                Statics.field2422 = var91;
            } else {
                var47++;
            }
            if (Statics.field1946 == null) {
                class252 var99 = Statics.field2003;
                int var100 = Statics.field9.field3821;
                byte[] var101 = var99.method4438(var100, 0);
                boolean var102;
                if (var101 == null) {
                    var102 = false;
                } else {
                    class325.method2849(var101);
                    var102 = true;
                }
                class324[] var103;
                if (var102) {
                    class324[] var104 = new class324[Statics.field3894];
                    int var105 = 0;
                    while (true) {
                        if (var105 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var103 = var104;
                            break;
                        }
                        class324 var106 = var104[var105] = new class324();
                        var106.field3884 = Statics.field3892;
                        var106.field3885 = Statics.field3897;
                        var106.field3882 = Statics.field3891[var105];
                        var106.field3883 = Statics.field3893[var105];
                        var106.field3880 = Statics.field3896[var105];
                        var106.field3888 = Statics.field3335[var105];
                        int var107 = var106.field3888 * var106.field3880;
                        byte[] var108 = Statics.field3898[var105];
                        var106.field3890 = new int[var107];
                        for (int var109 = 0; var109 < var107; var109++) {
                            var106.field3890[var109] = Statics.field3895[var108[var109] & 0xFF];
                        }
                        var105++;
                    }
                } else {
                    var103 = null;
                }
                Statics.field1946 = var103;
            } else {
                var47++;
            }
            if (Statics.field462 == null) {
                class252 var111 = Statics.field2003;
                int var112 = Statics.field9.field3822;
                byte[] var113 = var111.method4438(var112, 0);
                boolean var114;
                if (var113 == null) {
                    var114 = false;
                } else {
                    class325.method2849(var113);
                    var114 = true;
                }
                class324[] var115;
                if (var114) {
                    class324[] var116 = new class324[Statics.field3894];
                    int var117 = 0;
                    while (true) {
                        if (var117 >= Statics.field3894) {
                            Statics.field3891 = null;
                            Statics.field3893 = null;
                            Statics.field3896 = null;
                            Statics.field3335 = null;
                            Statics.field3895 = null;
                            Statics.field3898 = (byte[][]) null;
                            var115 = var116;
                            break;
                        }
                        class324 var118 = var116[var117] = new class324();
                        var118.field3884 = Statics.field3892;
                        var118.field3885 = Statics.field3897;
                        var118.field3882 = Statics.field3891[var117];
                        var118.field3883 = Statics.field3893[var117];
                        var118.field3880 = Statics.field3896[var117];
                        var118.field3888 = Statics.field3335[var117];
                        int var119 = var118.field3888 * var118.field3880;
                        byte[] var120 = Statics.field3898[var117];
                        var118.field3890 = new int[var119];
                        for (int var121 = 0; var121 < var119; var121++) {
                            var118.field3890[var121] = Statics.field3895[var120[var121] & 0xFF];
                        }
                        var117++;
                    }
                } else {
                    var115 = null;
                }
                Statics.field462 = var115;
            } else {
                var47++;
            }
            if (Statics.field2466 == null) {
                class252 var123 = Statics.field2003;
                int var124 = Statics.field9.field3823;
                byte[] var125 = var123.method4438(var124, 0);
                boolean var126;
                if (var125 == null) {
                    var126 = false;
                } else {
                    class325.method2849(var125);
                    var126 = true;
                }
                class323[] var127;
                if (var126) {
                    var127 = class325.method5499();
                } else {
                    var127 = null;
                }
                Statics.field2466 = var127;
            } else {
                var47++;
            }
            if (Statics.field351 == null) {
                class252 var128 = Statics.field2003;
                int var129 = Statics.field9.field3824;
                byte[] var130 = var128.method4438(var129, 0);
                boolean var131;
                if (var130 == null) {
                    var131 = false;
                } else {
                    class325.method2849(var130);
                    var131 = true;
                }
                class323[] var132;
                if (var131) {
                    var132 = class325.method5499();
                } else {
                    var132 = null;
                }
                Statics.field351 = var132;
            } else {
                var47++;
            }
            if (var47 < 11) {
                class80.field1160 = class240.field2881 + var47 * 100 / 12 + "%";
                class80.field1159 = 70;
            } else {
                Statics.field3761 = Statics.field351;
                Statics.field99.method5747();
                int var133 = (int) (Math.random() * 21.0D) - 10;
                int var134 = (int) (Math.random() * 21.0D) - 10;
                int var135 = (int) (Math.random() * 21.0D) - 10;
                int var136 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3643[0].method5672(var133 + var136, var134 + var136, var135 + var136);
                class80.field1160 = class240.field2882;
                class80.field1159 = 70;
                field903 = 90;
            }
        } else if (field903 == 90) {
            if (Statics.field163.method4511()) {
                Statics.field3689 = new class114(Statics.field163, Statics.field2003, 20, 0.8D, field649 ? 64 : 128);
                class125.method2778(Statics.field3689);
                class125.method2779(0.8D);
                field903 = 100;
            } else {
                class80.field1160 = class240.field2883 + "0%";
                class80.field1159 = 90;
            }
        } else if (field903 == 100) {
            int var137 = Statics.field3689.method2540();
            if (var137 < 100) {
                class80.field1160 = class240.field2883 + var137 + "%";
                class80.field1159 = 90;
            } else {
                class80.field1160 = class240.field2884;
                class80.field1159 = 90;
                field903 = 110;
            }
        } else if (field903 == 110) {
            Statics.field348 = new class59();
            Statics.field427.method3200(Statics.field348, 10);
            class80.field1160 = class240.field2922;
            class80.field1159 = 92;
            field903 = 120;
        } else if (field903 == 120) {
            if (Statics.field100.method4460("huffman", "")) {
                class177 var138 = new class177(Statics.field100.method4456("huffman", ""));
                class303.method4631(var138);
                class80.field1160 = class240.field2887;
                class80.field1159 = 94;
                field903 = 130;
            } else {
                class80.field1160 = class240.field2886 + "%";
                class80.field1159 = 94;
            }
        } else if (field903 == 130) {
            if (!Statics.field2021.method4511()) {
                class80.field1160 = class240.field2888 + Statics.field2021.method4536() * 4 / 5 + "%";
                class80.field1159 = 96;
            } else if (!Statics.field1915.method4511()) {
                class80.field1160 = class240.field2888 + (80 + Statics.field1915.method4536() / 6) + "%";
                class80.field1159 = 96;
            } else if (Statics.field1092.method4511()) {
                class80.field1160 = class240.field2889;
                class80.field1159 = 98;
                field903 = 140;
            } else {
                class80.field1160 = class240.field2888 + (96 + Statics.field1092.method4536() / 50) + "%";
                class80.field1159 = 96;
            }
        } else if (field903 == 140) {
            class80.field1159 = 100;
            if (Statics.field2040.method4458(class30.field292.field299)) {
                if (Statics.field419 == null) {
                    Statics.field419 = new class330();
                    Statics.field419.method5838(Statics.field2040, Statics.field2067, field696, Statics.field3643);
                }
                int var139 = Statics.field419.method5842();
                if (var139 < 100) {
                    class80.field1160 = class240.field2890 + (var139 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1160 = class240.field3059;
                    field903 = 150;
                }
            } else {
                class80.field1160 = class240.field2890 + Statics.field2040.method4452(class30.field292.field299) / 10 + "%";
            }
        } else if (field903 == 150) {
            method203(10);
        }
    }

    @ObfuscatedName("ey.ft(IZZZB)Lih;")
    public static class252 method3037(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2029 != null) {
            var4 = new class165(arg0, class158.field2029, Statics.field2031[arg0], 1000000);
        }
        return new class252(var4, Statics.field541, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fh(B)V")
    public final void method1161() {
        class160 var1 = field691.method2059();
        class192 var2 = field691.field1284;
        try {
            if (field678 == 0) {
                if (Statics.field101 == null && (field684.method1928() || field679 > 250)) {
                    Statics.field101 = field684.method1929();
                    field684.method1927();
                    field684 = null;
                }
                if (Statics.field101 != null) {
                    if (var1 != null) {
                        var1.method3230();
                        var1 = null;
                    }
                    Statics.field1925 = null;
                    field693 = false;
                    field679 = 0;
                    field678 = 1;
                }
            }
            if (field678 == 1) {
                if (Statics.field1925 == null) {
                    Statics.field1925 = Statics.field427.method3187(Statics.field80, Statics.field1948);
                }
                if (Statics.field1925.field2008 == 2) {
                    throw new IOException();
                }
                if (Statics.field1925.field2008 == 1) {
                    if (field823) {
                        Socket var3 = (Socket) Statics.field1925.field2012;
                        class162 var4 = new class162(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class164((Socket) Statics.field1925.field2012, Statics.field427, 5000);
                    }
                    field691.method2056(var1);
                    Statics.field1925 = null;
                    field678 = 2;
                }
            }
            if (field678 == 2) {
                field691.method2061();
                class175 var5 = class175.method3145();
                var5.field2333.method3501(class173.field2314.field2315);
                field691.method2060(var5);
                field691.method2054();
                var2.field2406 = 0;
                field678 = 3;
            }
            if (field678 == 3) {
                if (Statics.field883 != null) {
                    Statics.field883.method2210();
                }
                if (Statics.field47 != null) {
                    Statics.field47.method2210();
                }
                boolean var6 = true;
                if (field823 && !var1.method3237(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3233();
                    if (Statics.field883 != null) {
                        Statics.field883.method2210();
                    }
                    if (Statics.field47 != null) {
                        Statics.field47.method2210();
                    }
                    if (var7 != 0) {
                        method2511(var7);
                        return;
                    }
                    var2.field2406 = 0;
                    field678 = 4;
                }
            }
            if (field678 == 4) {
                if (var2.field2406 < 8) {
                    int var8 = var1.method3227();
                    if (var8 > 8 - var2.field2406) {
                        var8 = 8 - var2.field2406;
                    }
                    if (var8 > 0) {
                        var1.method3228(var2.field2405, var2.field2406, var8);
                        var2.field2406 += var8;
                    }
                }
                if (var2.field2406 == 8) {
                    var2.field2406 = 0;
                    Statics.field7 = var2.method3471();
                    field678 = 5;
                }
            }
            if (field678 == 5) {
                field691.field1284.field2406 = 0;
                field691.method2061();
                class192 var9 = new class192(500);
                int[] var10 = new int[] { Statics.field101.nextInt(), Statics.field101.nextInt(), Statics.field101.nextInt(), Statics.field101.nextInt() };
                var9.field2406 = 0;
                var9.method3501(1);
                var9.method3617(var10[0]);
                var9.method3617(var10[1]);
                var9.method3617(var10[2]);
                var9.method3617(var10[3]);
                var9.method3454(Statics.field7);
                if (field721 == 40) {
                    var9.method3617(Statics.field1252[0]);
                    var9.method3617(Statics.field1252[1]);
                    var9.method3617(Statics.field1252[2]);
                    var9.method3617(Statics.field1252[3]);
                } else {
                    var9.method3501(field682.method172());
                    switch(field682.field1969) {
                        case 0:
                        case 3:
                            var9.method3451(Statics.field605);
                            var9.field2406++;
                            break;
                        case 1:
                            var9.field2406 += 4;
                            break;
                        case 2:
                            LinkedHashMap var12 = Statics.field436.field1029;
                            String var13 = class80.field1181;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method3617((Integer) var12.get(var15));
                    }
                    var9.method3501(class313.field3829.method172());
                    var9.method3585(class80.field1170);
                }
                var9.method3557(class78.field1134, class78.field1130);
                Statics.field1252 = var10;
                class175 var18 = class175.method3145();
                var18.field2333.field2406 = 0;
                if (field721 == 40) {
                    var18.field2333.method3501(class173.field2313.field2315);
                } else {
                    var18.field2333.method3501(class173.field2312.field2315);
                }
                var18.field2333.method3450(0);
                int var19 = var18.field2333.field2406;
                var18.field2333.method3617(177);
                var18.field2333.method3617(1);
                var18.field2333.method3501(field652);
                var18.field2333.method3459(var9.field2405, 0, var9.field2406);
                int var20 = var18.field2333.field2406;
                var18.field2333.method3585(class80.field1181);
                var18.field2333.method3501((field676 ? 1 : 0) << 1 | (field649 ? 1 : 0));
                var18.field2333.method3450(Statics.field1039);
                var18.field2333.method3450(Statics.field1938);
                method4615(var18.field2333);
                var18.field2333.method3585(Statics.field49);
                var18.field2333.method3617(Statics.field651);
                class185 var21 = new class185(Statics.field635.method5818());
                Statics.field635.method5823(var21);
                var18.field2333.method3459(var21.field2405, 0, var21.field2405.length);
                var18.field2333.method3501(field652);
                var18.field2333.method3617(0);
                var18.field2333.method3617(Statics.field186.field3238);
                var18.field2333.method3617(Statics.field402.field3238);
                var18.field2333.method3617(Statics.field506.field3238);
                var18.field2333.method3617(Statics.field2021.field3238);
                var18.field2333.method3617(Statics.field73.field3238);
                var18.field2333.method3617(Statics.field4018.field3238);
                var18.field2333.method3617(Statics.field2118.field3238);
                var18.field2333.method3617(Statics.field81.field3238);
                var18.field2333.method3617(Statics.field2003.field3238);
                var18.field2333.method3617(Statics.field163.field3238);
                var18.field2333.method3617(Statics.field100.field3238);
                var18.field2333.method3617(Statics.field2457.field3238);
                var18.field2333.method3617(Statics.field1915.field3238);
                var18.field2333.method3617(Statics.field1092.field3238);
                var18.field2333.method3617(Statics.field274.field3238);
                var18.field2333.method3617(Statics.field3457.field3238);
                var18.field2333.method3617(Statics.field2040.field3238);
                var18.field2333.method3617(Statics.field1953.field3238);
                var18.field2333.method3486(var10, var20, var18.field2333.field2406);
                var18.field2333.method3461(var18.field2333.field2406 - var19);
                field691.method2060(var18);
                field691.method2054();
                field691.field1283 = new class193(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method3731(var22);
                field678 = 6;
            }
            if (field678 == 6 && var1.method3227() > 0) {
                int var24 = var1.method3233();
                if (var24 == 21 && field721 == 20) {
                    field678 = 9;
                } else if (var24 == 2) {
                    field678 = 11;
                } else if (var24 == 15 && field721 == 40) {
                    field691.field1286 = -1;
                    field678 = 16;
                } else if (var24 == 64) {
                    field678 = 7;
                } else if (var24 == 23 && field680 < 1) {
                    field680++;
                    field678 = 0;
                } else if (var24 == 29) {
                    field678 = 14;
                } else {
                    method2511(var24);
                    return;
                }
            }
            if (field678 == 7 && var1.method3227() > 0) {
                Statics.field2439 = var1.method3233();
                field678 = 8;
            }
            if (field678 == 8 && var1.method3227() >= Statics.field2439) {
                var1.method3228(var2.field2405, 0, Statics.field2439);
                var2.field2406 = 0;
                field678 = 6;
            }
            if (field678 == 9 && var1.method3227() > 0) {
                field761 = (var1.method3233() + 3) * 60;
                field678 = 10;
            }
            if (field678 == 10) {
                field679 = 0;
                class80.method3702(class240.field2897, class240.field2898, field761 / 60 + class240.field2899);
                if (--field761 <= 0) {
                    field678 = 0;
                }
            } else {
                if (field678 == 11 && var1.method3227() >= 1) {
                    Statics.field3544 = var1.method3233();
                    field678 = 12;
                }
                if (field678 == 12 && var1.method3227() >= Statics.field3544) {
                    boolean var25 = var1.method3233() == 1;
                    var1.method3228(var2.field2405, 0, 4);
                    var2.field2406 = 0;
                    boolean var26 = false;
                    if (var25) {
                        int var27 = var2.method3725() << 24;
                        int var28 = var27 | var2.method3725() << 16;
                        int var29 = var28 | var2.method3725() << 8;
                        int var30 = var29 | var2.method3725();
                        String var31 = class80.field1181;
                        int var32 = var31.length();
                        int var33 = 0;
                        int var34 = 0;
                        while (true) {
                            if (var34 >= var32) {
                                if (Statics.field436.field1029.size() >= 10 && !Statics.field436.field1029.containsKey(var33)) {
                                    Iterator var37 = Statics.field436.field1029.entrySet().iterator();
                                    var37.next();
                                    var37.remove();
                                }
                                Statics.field436.field1029.put(var33, var30);
                                break;
                            }
                            var33 = (var33 << 5) - var33 + var31.charAt(var34);
                            var34++;
                        }
                    }
                    if (field747) {
                        Statics.field436.field1035 = class80.field1181;
                    } else {
                        Statics.field436.field1035 = null;
                    }
                    class68.method1123();
                    field813 = var1.method3233();
                    field864 = var1.method3233() == 1;
                    field748 = var1.method3233();
                    field748 <<= 0x8;
                    field748 += var1.method3233();
                    field762 = var1.method3233();
                    var1.method3228(var2.field2405, 0, 1);
                    var2.field2406 = 0;
                    class171[] var38 = class171.method1554();
                    int var39 = var2.method3730();
                    if (var39 < 0 || var39 >= var38.length) {
                        throw new IOException(var39 + " " + var2.field2406);
                    }
                    field691.field1281 = var38[var39];
                    field691.field1286 = field691.field1281.field2152;
                    var1.method3228(var2.field2405, 0, 2);
                    var2.field2406 = 0;
                    field691.field1286 = var2.method3467();
                    try {
                        class42.method690(Statics.field2038, "zap");
                    } catch (Throwable var60) {
                    }
                    field678 = 13;
                }
                if (field678 != 13) {
                    if (field678 == 14 && var1.method3227() >= 2) {
                        var2.field2406 = 0;
                        var1.method3228(var2.field2405, 0, 2);
                        var2.field2406 = 0;
                        Statics.field6 = var2.method3467();
                        field678 = 15;
                    }
                    if (field678 == 15 && var1.method3227() >= Statics.field6) {
                        var2.field2406 = 0;
                        var1.method3228(var2.field2405, 0, Statics.field6);
                        var2.field2406 = 0;
                        String var55 = var2.method3474();
                        String var56 = var2.method3474();
                        String var57 = var2.method3474();
                        class80.method3702(var55, var56, var57);
                        method203(10);
                    }
                    if (field678 == 16) {
                        if (field691.field1286 == -1) {
                            if (var1.method3227() < 2) {
                                return;
                            }
                            var1.method3228(var2.field2405, 0, 2);
                            var2.field2406 = 0;
                            field691.field1286 = var2.method3467();
                        }
                        if (var1.method3227() >= field691.field1286) {
                            var1.method3228(var2.field2405, 0, field691.field1286);
                            var2.field2406 = 0;
                            int var58 = field691.field1286;
                            field905.method5087();
                            method25();
                            class84.method4701(var2);
                            if (var2.field2406 != var58) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field679++;
                        if (field679 > 2000) {
                            if (field680 < 1) {
                                if (Statics.field1948 == Statics.field1929) {
                                    Statics.field1948 = Statics.field24;
                                } else {
                                    Statics.field1948 = Statics.field1929;
                                }
                                field680++;
                                field678 = 0;
                            } else {
                                method2511(-3);
                            }
                        }
                    }
                } else if (var1.method3227() >= field691.field1286) {
                    var2.field2406 = 0;
                    var1.method3228(var2.field2405, 0, field691.field1286);
                    field905.method5090();
                    field657 = 1L;
                    Statics.field348.field581 = 0;
                    Statics.field2112 = true;
                    field920 = true;
                    field869 = -1L;
                    Statics.method4428();
                    field691.method2061();
                    field691.field1284.field2406 = 0;
                    field691.field1281 = null;
                    field691.field1296 = null;
                    field691.field1285 = null;
                    field691.field1279 = null;
                    field691.field1286 = 0;
                    field691.field1288 = 0;
                    field663 = 0;
                    field726 = 0;
                    field664 = 0;
                    field781 = 0;
                    field834 = false;
                    class49.method2035(0);
                    class86.field1249.clear();
                    class86.field1250.method3859();
                    class86.field1248.method4021();
                    class86.field1247 = 0;
                    field797 = 0;
                    field799 = false;
                    field906 = 0;
                    field659 = 0;
                    field719 = 0;
                    Statics.field1934 = null;
                    field877 = 0;
                    field662 = -1;
                    field723 = 0;
                    field876 = 0;
                    field672 = class79.field1135;
                    field673 = class79.field1135;
                    field687 = 0;
                    class84.method1154();
                    for (int var41 = 0; var41 < 2048; var41++) {
                        field699[var41] = null;
                    }
                    for (int var42 = 0; var42 < 32768; var42++) {
                        field807[var42] = null;
                    }
                    field770 = -1;
                    field774.method3956();
                    field712.method3956();
                    for (int var43 = 0; var43 < 4; var43++) {
                        for (int var44 = 0; var44 < 104; var44++) {
                            for (int var45 = 0; var45 < 104; var45++) {
                                field830[var43][var44][var45] = null;
                            }
                        }
                    }
                    field689 = new class208();
                    Statics.field2151.method1648();
                    for (int var46 = 0; var46 < Statics.field3303; var46++) {
                        class257 var47 = class257.method3104(var46);
                        if (var47 != null) {
                            class228.field2631[var46] = 0;
                            class228.field2630[var46] = 0;
                        }
                    }
                    Statics.field349.method1978();
                    field814 = -1;
                    if (field804 != -1) {
                        int var48 = field804;
                        if (var48 != -1 && Statics.field1971[var48]) {
                            Statics.field2758.method4450(var48);
                            if (Statics.field1952[var48] != null) {
                                boolean var49 = true;
                                for (int var50 = 0; var50 < Statics.field1952[var48].length; var50++) {
                                    if (Statics.field1952[var48][var50] != null) {
                                        if (Statics.field1952[var48][var50].field2809 == 2) {
                                            var49 = false;
                                        } else {
                                            Statics.field1952[var48][var50] = null;
                                        }
                                    }
                                }
                                if (var49) {
                                    Statics.field1952[var48] = null;
                                }
                                Statics.field1971[var48] = false;
                            }
                        }
                    }
                    for (class57 var51 = (class57) field805.method3916(); var51 != null; var51 = (class57) field805.method3910()) {
                        method68(var51, true);
                    }
                    field804 = -1;
                    field805 = new class205(8);
                    field881 = null;
                    field781 = 0;
                    field834 = false;
                    field909.method4295((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var52 = 0; var52 < 8; var52++) {
                        field768[var52] = null;
                        field769[var52] = false;
                    }
                    class55.method126();
                    field655 = true;
                    for (int var53 = 0; var53 < 100; var53++) {
                        field849[var53] = true;
                    }
                    method1841();
                    Statics.field27 = null;
                    for (int var54 = 0; var54 < 8; var54++) {
                        field896[var54] = new class5();
                    }
                    Statics.field591 = null;
                    class84.method4701(var2);
                    Statics.field1728 = -1;
                    method121(false, var2);
                    field691.field1281 = null;
                }
            }
        } catch (IOException var61) {
            if (field680 < 1) {
                if (Statics.field1948 == Statics.field1929) {
                    Statics.field1948 = Statics.field24;
                } else {
                    Statics.field1948 = Statics.field1929;
                }
                field680++;
                field678 = 0;
            } else {
                method2511(-2);
            }
        }
    }

    @ObfuscatedName("e.fg(I)V")
    public static void method25() {
        field691.method2061();
        field691.field1284.field2406 = 0;
        field691.field1281 = null;
        field691.field1296 = null;
        field691.field1285 = null;
        field691.field1279 = null;
        field691.field1286 = 0;
        field691.field1288 = 0;
        field663 = 0;
        field781 = 0;
        field834 = false;
        field877 = 0;
        field723 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field699[var0] = null;
        }
        Statics.field1064 = null;
        for (int var1 = 0; var1 < field807.length; var1++) {
            class74 var2 = field807[var1];
            if (var2 != null) {
                var2.field966 = -1;
                var2.field967 = false;
            }
        }
        class55.method126();
        method203(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field849[var3] = true;
        }
        method1841();
    }

    @ObfuscatedName("dr.fi(II)V")
    public static void method2511(int arg0) {
        if (arg0 == -3) {
            class80.method3702(class240.field2900, class240.field2857, class240.field2902);
        } else if (arg0 == -2) {
            class80.method3702(class240.field2903, class240.field2904, class240.field2905);
        } else if (arg0 == -1) {
            class80.method3702(class240.field2906, class240.field2907, class240.field3028);
        } else if (arg0 == 3) {
            class80.field1164 = 3;
            class80.field1162 = 1;
        } else if (arg0 == 4) {
            class80.field1164 = 12;
            class80.field1143 = 0;
        } else if (arg0 == 5) {
            class80.field1162 = 2;
            class80.method3702(class240.field3063, class240.field2913, class240.field3026);
        } else if (arg0 == 6 || !(field771 || arg0 != 68)) {
            class80.method3702(class240.field2915, class240.field2916, class240.field2917);
        } else if (arg0 == 7) {
            class80.method3702(class240.field2918, class240.field2919, class240.field2920);
        } else if (arg0 == 8) {
            class80.method3702(class240.field3074, class240.field2973, class240.field3094);
        } else if (arg0 == 9) {
            class80.method3702(class240.field2924, class240.field2971, class240.field2926);
        } else if (arg0 == 10) {
            class80.method3702(class240.field3125, class240.field3084, class240.field2929);
        } else if (arg0 == 11) {
            class80.method3702(class240.field2985, class240.field2931, class240.field3088);
        } else if (arg0 == 12) {
            class80.method3702(class240.field3145, class240.field2934, class240.field2935);
        } else if (arg0 == 13) {
            class80.method3702(class240.field2936, class240.field2937, class240.field2938);
        } else if (arg0 == 14) {
            class80.method3702(class240.field2928, class240.field2940, class240.field2941);
        } else if (arg0 == 16) {
            class80.method3702(class240.field2942, class240.field2943, class240.field3098);
        } else if (arg0 == 17) {
            class80.method3702(class240.field2948, class240.field2993, class240.field2947);
        } else if (arg0 == 18) {
            class80.field1164 = 12;
            class80.field1143 = 1;
        } else if (arg0 == 19) {
            class80.method3702(class240.field2951, class240.field2952, class240.field2953);
        } else if (arg0 == 20) {
            class80.method3702(class240.field2954, class240.field3038, class240.field2956);
        } else if (arg0 == 22) {
            class80.method3702(class240.field2957, class240.field2958, class240.field3085);
        } else if (arg0 == 23) {
            class80.method3702(class240.field2860, class240.field2961, class240.field2962);
        } else if (arg0 == 24) {
            class80.method3702(class240.field2963, class240.field2959, class240.field2946);
        } else if (arg0 == 25) {
            class80.method3702(class240.field2960, class240.field2867, class240.field2968);
        } else if (arg0 == 26) {
            class80.method3702(class240.field2945, class240.field2970, class240.field3034);
        } else if (arg0 == 27) {
            class80.method3702(class240.field2972, class240.field3067, class240.field2974);
        } else if (arg0 == 31) {
            class80.method3702(class240.field2981, class240.field2982, class240.field2983);
        } else if (arg0 == 32) {
            class80.method3702(class240.field3064, class240.field2976, class240.field3140);
        } else if (arg0 == 37) {
            class80.method3702(class240.field2987, class240.field2988, class240.field2989);
        } else if (arg0 == 38) {
            class80.method3702(class240.field2990, class240.field2991, class240.field2955);
        } else if (arg0 == 55) {
            class80.field1164 = 8;
        } else if (arg0 == 56) {
            class80.method3702(class240.field3023, class240.field2998, class240.field2999);
            method203(11);
            return;
        } else if (arg0 == 57) {
            class80.method3702(class240.field3000, class240.field2977, class240.field3137);
            method203(11);
            return;
        } else if (arg0 == 61) {
            class80.field1164 = 7;
        } else {
            class80.method3702(class240.field2964, class240.field3004, class240.field2992);
        }
        method203(10);
    }

    @ObfuscatedName("bn.fa(I)V")
    public static final void method1869() {
        field691.method2057();
        method2850();
        Statics.field3174.method2855();
        for (int var0 = 0; var0 < 4; var0++) {
            field702[var0].method3312();
        }
        System.gc();
        class220.method3428(2);
        field879 = -1;
        field880 = false;
        class70.method3139();
        method203(10);
    }

    @ObfuscatedName("di.fr(I)V")
    public static final void method2850() {
        class275.method942();
        class262.field3360.method3880();
        class263.method211();
        class271.field3454.method3880();
        class271.field3458.method3880();
        class271.field3456.method3880();
        class271.field3474.method3880();
        class274.field3567.method3880();
        class274.field3568.method3880();
        class272.method2067();
        class276.method983();
        class261.method3704();
        class266.field3397.method3880();
        class257.method1090();
        class270.field3430.method3880();
        class270.field3431.method3880();
        class270.field3435.method3880();
        class264.field3386.method3880();
        class264.field3383.method3880();
        class268.method994();
        class267.method4414();
        class258.field3315.method3880();
        class230.method1033();
        class233.field2662.method3880();
        class233.field2663.method3880();
        class233.field2664.method3880();
        class233.field2665.method3880();
        ((class114) Statics.field1753).method2561();
        class87.field1262.method3880();
        Statics.field186.method4451();
        Statics.field402.method4451();
        Statics.field2021.method4451();
        Statics.field73.method4451();
        Statics.field4018.method4451();
        Statics.field2118.method4451();
        Statics.field81.method4451();
        Statics.field2003.method4451();
        Statics.field163.method4451();
        Statics.field100.method4451();
        Statics.field2457.method4451();
        Statics.field1915.method4451();
    }

    @ObfuscatedName("t.fp(I)V")
    public static final void method222() {
        if (field726 > 0) {
            method1869();
        } else {
            field905.method5088();
            method203(40);
            Statics.field525 = field691.method2059();
            field691.method2058();
        }
    }

    @ObfuscatedName("ae.fe(ZI)V")
    public static final void method538(boolean arg0) {
        if (arg0) {
            field682 = class80.field1173 ? class149.field1966 : class149.field1967;
            return;
        }
        LinkedHashMap var1 = Statics.field436.field1029;
        String var2 = class80.field1181;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field682 = var1.containsKey(var4) ? class149.field1968 : class149.field1965;
    }

    @ObfuscatedName("client.fn(I)V")
    public final void method1162() {
        if (field663 > 1) {
            field663--;
        }
        if (field726 > 0) {
            field726--;
        }
        if (field693) {
            field693 = false;
            method222();
            return;
        }
        if (!field834) {
            method164();
        }
        for (int var1 = 0; var1 < 100 && this.method1165(field691); var1++) {
        }
        if (field721 != 30) {
            return;
        }
        while (class319.method1642()) {
            class175 var2 = class175.method3035(class172.field2299, field691.field1283);
            var2.field2333.method3501(0);
            int var3 = var2.field2333.field2406;
            class319.method4041(var2.field2333);
            var2.field2333.method3462(var2.field2333.field2406 - var3);
            field691.method2060(var2);
        }
        if (field905.field3681) {
            class175 var4 = class175.method3035(class172.field2258, field691.field1283);
            var4.field2333.method3501(0);
            int var5 = var4.field2333.field2406;
            field905.method5093(var4.field2333);
            var4.field2333.method3462(var4.field2333.field2406 - var5);
            field691.method2060(var4);
            field905.method5091();
        }
        Object var6 = Statics.field348.field582;
        synchronized (Statics.field348.field582) {
            if (!field857) {
                Statics.field348.field581 = 0;
            } else if (class49.field478 != 0 || Statics.field348.field581 >= 40) {
                class175 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field348.field581 && (var7 == null || var7.field2333.field2406 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field348.field585[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field348.field586[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field736 != var14 || field644 != var13) {
                        if (var7 == null) {
                            var7 = class175.method3035(class172.field2273, field691.field1283);
                            var7.field2333.method3501(0);
                            var8 = var7.field2333.field2406;
                            var7.field2333.field2406 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field815 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field736;
                            var16 = var13 - field644;
                            var17 = (int) ((Statics.field348.field583[var12] - field815) / 20L);
                            var10 = (int) ((Statics.field348.field583[var12] - field815) % 20L + (long) var10);
                        }
                        field736 = var14;
                        field644 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2333.method3450((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2333.method3501(var17 + 128);
                            var7.field2333.method3450((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2333.method3501(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2333.method3617(Integer.MIN_VALUE);
                            } else {
                                var7.field2333.method3617(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2333.method3450((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2333.method3617(Integer.MIN_VALUE);
                            } else {
                                var7.field2333.method3617(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field815 = Statics.field348.field583[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2333.method3462(var7.field2333.field2406 - var8);
                    int var18 = var7.field2333.field2406;
                    var7.field2333.field2406 = var8;
                    var7.field2333.method3501(var10 / var11);
                    var7.field2333.method3501(var10 % var11);
                    var7.field2333.field2406 = var18;
                    field691.method2060(var7);
                }
                if (var9 >= Statics.field348.field581) {
                    Statics.field348.field581 = 0;
                } else {
                    Statics.field348.field581 -= var9;
                    System.arraycopy(Statics.field348.field586, var9, Statics.field348.field586, 0, Statics.field348.field581);
                    System.arraycopy(Statics.field348.field585, var9, Statics.field348.field585, 0, Statics.field348.field581);
                    System.arraycopy(Statics.field348.field583, var9, Statics.field348.field583, 0, Statics.field348.field581);
                }
            }
        }
        if (class49.field478 == 1 || !Statics.field133 && class49.field478 == 4 || class49.field478 == 2) {
            long var20 = (class49.field466 - field657 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field657 = class49.field466 * -1L;
            int var22 = class49.field468;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1938) {
                var22 = Statics.field1938;
            }
            int var23 = class49.field479;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1039) {
                var23 = Statics.field1039;
            }
            int var24 = (int) var20;
            class175 var25 = class175.method3035(class172.field2304, field691.field1283);
            var25.field2333.method3450((class49.field478 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2333.method3450(var23);
            var25.field2333.method3450(var22);
            field691.method2060(var25);
        }
        if (class40.field388 > 0) {
            class175 var26 = class175.method3035(class172.field2275, field691.field1283);
            var26.field2333.method3450(0);
            int var27 = var26.field2333.field2406;
            long var28 = class187.method2664();
            for (int var30 = 0; var30 < class40.field388; var30++) {
                long var31 = var28 - field869;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field869 = var28;
                var26.field2333.method3492(class40.field378[var30]);
                var26.field2333.method3451((int) var31);
            }
            var26.field2333.method3461(var26.field2333.field2406 - var27);
            field691.method2060(var26);
        }
        if (field728 > 0) {
            field728--;
        }
        if (class40.field381[96] || class40.field381[97] || class40.field381[98] || class40.field381[99]) {
            field729 = true;
        }
        if (field729 && field728 <= 0) {
            field728 = 20;
            field729 = false;
            class175 var33 = class175.method3035(class172.field2270, field691.field1283);
            var33.field2333.method3502(field713);
            var33.field2333.method3565(field659);
            field691.method2060(var33);
        }
        if (Statics.field2112 && !field920) {
            field920 = true;
            class175 var34 = class175.method3035(class172.field2242, field691.field1283);
            var34.field2333.method3501(1);
            field691.method2060(var34);
        }
        if (!Statics.field2112 && field920) {
            field920 = false;
            class175 var35 = class175.method3035(class172.field2242, field691.field1283);
            var35.field2333.method3501(0);
            field691.method2060(var35);
        }
        if (Statics.field419 != null) {
            Statics.field419.method5873();
        }
        if (Statics.field222) {
            if (Statics.field27 != null) {
                Statics.field27.method5187();
            }
            for (int var36 = 0; var36 < class84.field1227; var36++) {
                class62 var37 = field699[class84.field1223[var36]];
                var37.method1107();
            }
            Statics.field222 = false;
        }
        method144();
        if (field721 != 30) {
            return;
        }
        method457();
        int var10002;
        for (int var38 = 0; var38 < field906; var38++) {
            var10002 = field794[var38]--;
            if (field794[var38] >= -10) {
                class94 var40 = field711[var38];
                if (var40 == null) {
                    class94 var10000 = (class94) null;
                    var40 = class94.method2138(Statics.field73, field885[var38], 0);
                    if (var40 == null) {
                        continue;
                    }
                    field794[var38] += var40.method2137();
                    field711[var38] = var40;
                }
                if (field794[var38] < 0) {
                    int var47;
                    if (field888[var38] == 0) {
                        var47 = field889;
                    } else {
                        int var41 = (field888[var38] & 0xFF) * 128;
                        int var42 = field888[var38] >> 16 & 0xFF;
                        int var43 = var42 * 128 + 64 - Statics.field1064.field954;
                        if (var43 < 0) {
                            var43 = -var43;
                        }
                        int var44 = field888[var38] >> 8 & 0xFF;
                        int var45 = var44 * 128 + 64 - Statics.field1064.field1000;
                        if (var45 < 0) {
                            var45 = -var45;
                        }
                        int var46 = var43 + var45 - 128;
                        if (var46 > var41) {
                            field794[var38] = -100;
                            continue;
                        }
                        if (var46 < 0) {
                            var46 = 0;
                        }
                        var47 = field882 * (var41 - var46) / var41;
                    }
                    if (var47 > 0) {
                        class96 var48 = var40.method2144().method2185(Statics.field3698);
                        class106 var49 = class106.method2320(var48, 100, var47);
                        var49.method2312(field886[var38] - 1);
                        Statics.field414.method2082(var49);
                    }
                    field794[var38] = -100;
                }
            } else {
                field906--;
                for (int var39 = var38; var39 < field906; var39++) {
                    field885[var39] = field885[var39 + 1];
                    field711[var39] = field711[var39 + 1];
                    field886[var39] = field886[var39 + 1];
                    field794[var39] = field794[var39 + 1];
                    field888[var39] = field888[var39 + 1];
                }
                var38--;
            }
        }
        if (field880 && !class220.method118()) {
            if (field878 != 0 && field879 != -1) {
                class220.method3262(Statics.field2118, field879, 0, field878, false);
            }
            field880 = false;
        }
        field691.field1288++;
        if (field691.field1288 > 750) {
            method222();
            return;
        }
        method1589();
        method1926();
        int[] var50 = class84.field1223;
        for (int var51 = 0; var51 < class84.field1227; var51++) {
            class62 var52 = field699[var50[var51]];
            if (var52 != null && var52.field982 > 0) {
                var52.field982--;
                if (var52.field982 == 0) {
                    var52.field969 = null;
                }
            }
        }
        for (int var53 = 0; var53 < field687; var53++) {
            int var54 = field688[var53];
            class74 var55 = field807[var54];
            if (var55 != null && var55.field982 > 0) {
                var55.field982--;
                if (var55.field982 == 0) {
                    var55.field969 = null;
                }
            }
        }
        field706++;
        if (field760 != 0) {
            field810 += 20;
            if (field810 >= 400) {
                field760 = 0;
            }
        }
        if (Statics.field2358 != null) {
            field750++;
            if (field750 >= 15) {
                method642(Statics.field2358);
                Statics.field2358 = null;
            }
        }
        class233 var56 = Statics.field1994;
        class233 var57 = Statics.field496;
        Statics.field1994 = null;
        Statics.field496 = null;
        field812 = null;
        field825 = false;
        field822 = false;
        field866 = 0;
        while (class40.method5126() && field866 < 128) {
            if (field813 >= 2 && class40.field381[82] && Statics.field599 == 66) {
                String var58 = "";
                Iterator var59 = class86.field1250.iterator();
                while (var59.hasNext()) {
                    class60 var60 = (class60) var59.next();
                    var58 = var58 + var60.field592 + ':' + var60.field589 + '\n';
                }
                Statics.field2038.method784(var58);
            } else if (field719 != 1 || Statics.field1857 <= 0) {
                field868[field866] = Statics.field599;
                field847[field866] = Statics.field1857;
                field866++;
            }
        }
        if (method993() && class40.field381[82] && class40.field381[81] && field842 != 0) {
            int var63 = Statics.field1064.field621 - field842;
            if (var63 < 0) {
                var63 = 0;
            } else if (var63 > 3) {
                var63 = 3;
            }
            if (Statics.field1064.field621 != var63) {
                method944(Statics.field491 + Statics.field1064.field995[0], Statics.field92 + Statics.field1064.field953[0], var63, false);
            }
            field842 = 0;
        }
        if (field804 != -1) {
            method83(field804, 0, 0, Statics.field1039, Statics.field1938, 0, 0);
        }
        field829++;
        while (true) {
            class58 var64;
            class233 var65;
            class233 var66;
            do {
                var64 = (class58) field844.method3960();
                if (var64 == null) {
                    while (true) {
                        class58 var67;
                        class233 var68;
                        class233 var69;
                        do {
                            var67 = (class58) field845.method3960();
                            if (var67 == null) {
                                while (true) {
                                    class58 var70;
                                    class233 var71;
                                    class233 var72;
                                    do {
                                        var70 = (class58) field843.method3960();
                                        if (var70 == null) {
                                            this.method1240();
                                            Statics.method3345();
                                            if (field817 != null) {
                                                this.method1256();
                                            }
                                            if (Statics.field1026 != null) {
                                                method642(Statics.field1026);
                                                field757++;
                                                if (class49.field470 == 0) {
                                                    if (field674) {
                                                        if (Statics.field105 == Statics.field1026 && field798 != field752) {
                                                            class233 var73 = Statics.field1026;
                                                            byte var74 = 0;
                                                            if (field809 == 1 && var73.field2742 == 206) {
                                                                var74 = 1;
                                                            }
                                                            if (var73.field2763[field798] <= 0) {
                                                                var74 = 0;
                                                            }
                                                            if (class234.method3349(method4593(var73))) {
                                                                int var75 = field752;
                                                                int var76 = field798;
                                                                var73.field2763[var76] = var73.field2763[var75];
                                                                var73.field2793[var76] = var73.field2793[var75];
                                                                var73.field2763[var75] = -1;
                                                                var73.field2793[var75] = 0;
                                                            } else if (var74 == 1) {
                                                                int var77 = field752;
                                                                int var78 = field798;
                                                                while (var77 != var78) {
                                                                    if (var77 > var78) {
                                                                        var73.method4337(var77 - 1, var77);
                                                                        var77--;
                                                                    } else if (var77 < var78) {
                                                                        var73.method4337(var77 + 1, var77);
                                                                        var77++;
                                                                    }
                                                                }
                                                            } else {
                                                                var73.method4337(field798, field752);
                                                            }
                                                            class175 var79 = class175.method3035(class172.field2288, field691.field1283);
                                                            var79.field2333.method3450(field798);
                                                            var79.field2333.method3565(field752);
                                                            var79.field2333.method3617(Statics.field1026.field2771);
                                                            var79.field2333.method3492(var74);
                                                            field691.method2060(var79);
                                                        }
                                                    } else if (this.method1167()) {
                                                        this.method1520(field753, field846);
                                                    } else if (field781 > 0) {
                                                        method747(field753, field846);
                                                    }
                                                    field750 = 10;
                                                    class49.field478 = 0;
                                                    Statics.field1026 = null;
                                                } else if (field757 >= 5 && (class49.field474 > field753 + 5 || class49.field474 < field753 - 5 || class49.field465 * -976212263 > field846 + 5 || class49.field465 * -976212263 < field846 - 5)) {
                                                    field674 = true;
                                                }
                                            }
                                            if (class128.method2907()) {
                                                int var80 = class128.field1786;
                                                int var81 = class128.field1806;
                                                class175 var82 = class175.method3035(class172.field2223, field691.field1283);
                                                var82.field2333.method3501(5);
                                                var82.field2333.method3583(Statics.field92 + var81);
                                                var82.field2333.method3583(Statics.field491 + var80);
                                                var82.field2333.method3491(class40.field381[82] ? (class40.field381[81] ? 2 : 1) : 0);
                                                field691.method2060(var82);
                                                class128.method2895();
                                                field745 = class49.field479;
                                                field746 = class49.field468;
                                                field760 = 1;
                                                field810 = 0;
                                                field723 = var80;
                                                field876 = var81;
                                            }
                                            if (Statics.field1994 != var56) {
                                                if (var56 != null) {
                                                    method642(var56);
                                                }
                                                if (Statics.field1994 != null) {
                                                    method642(Statics.field1994);
                                                }
                                            }
                                            if (Statics.field496 != var57 && field796 == field795) {
                                                if (var57 != null) {
                                                    method642(var57);
                                                }
                                                if (Statics.field496 != null) {
                                                    method642(Statics.field496);
                                                }
                                            }
                                            if (Statics.field496 == null) {
                                                if (field795 > 0) {
                                                    field795--;
                                                }
                                            } else if (field795 < field796) {
                                                field795++;
                                                if (field796 == field795) {
                                                    method642(Statics.field496);
                                                }
                                            }
                                            if (field719 == 0) {
                                                int var83 = Statics.field1064.field954;
                                                int var84 = Statics.field1064.field1000;
                                                if (Statics.field69 - var83 < -500 || Statics.field69 - var83 > 500 || Statics.field71 - var84 < -500 || Statics.field71 - var84 > 500) {
                                                    Statics.field69 = var83;
                                                    Statics.field71 = var84;
                                                }
                                                if (Statics.field69 != var83) {
                                                    Statics.field69 += (var83 - Statics.field69) / 16;
                                                }
                                                if (Statics.field71 != var84) {
                                                    Statics.field71 += (var84 - Statics.field71) / 16;
                                                }
                                                int var85 = Statics.field69 >> 7;
                                                int var86 = Statics.field71 >> 7;
                                                int var87 = method3155(Statics.field69, Statics.field71, Statics.field600);
                                                int var88 = 0;
                                                if (var85 > 3 && var86 > 3 && var85 < 100 && var86 < 100) {
                                                    for (int var89 = var85 - 4; var89 <= var85 + 4; var89++) {
                                                        for (int var90 = var86 - 4; var90 <= var86 + 4; var90++) {
                                                            int var91 = Statics.field600;
                                                            if (var91 < 3 && (class51.field493[1][var89][var90] & 0x2) == 2) {
                                                                var91++;
                                                            }
                                                            int var92 = var87 - class51.field507[var91][var89][var90];
                                                            if (var92 > var88) {
                                                                var88 = var92;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var93 = var88 * 192;
                                                if (var93 > 98048) {
                                                    var93 = 98048;
                                                }
                                                if (var93 < 32768) {
                                                    var93 = 32768;
                                                }
                                                if (var93 > field730) {
                                                    field730 += (var93 - field730) / 24;
                                                } else if (var93 < field730) {
                                                    field730 += (var93 - field730) / 80;
                                                }
                                                Statics.field1718 = method3155(Statics.field1064.field954, Statics.field1064.field1000, Statics.field600) - field720;
                                            } else if (field719 == 1) {
                                                if (field727 && Statics.field1064 != null) {
                                                    int var94 = Statics.field1064.field995[0];
                                                    int var95 = Statics.field1064.field953[0];
                                                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                                                        Statics.field69 = Statics.field1064.field954;
                                                        int var96 = method3155(Statics.field1064.field954, Statics.field1064.field1000, Statics.field600) - field720;
                                                        if (var96 < Statics.field1718) {
                                                            Statics.field1718 = var96;
                                                        }
                                                        Statics.field71 = Statics.field1064.field1000;
                                                        field727 = false;
                                                    }
                                                }
                                                short var97 = -1;
                                                if (class40.field381[33]) {
                                                    var97 = 0;
                                                } else if (class40.field381[49]) {
                                                    var97 = 1024;
                                                }
                                                if (class40.field381[48]) {
                                                    if (var97 == 0) {
                                                        var97 = 1792;
                                                    } else if (var97 == 1024) {
                                                        var97 = 1280;
                                                    } else {
                                                        var97 = 1536;
                                                    }
                                                } else if (class40.field381[50]) {
                                                    if (var97 == 0) {
                                                        var97 = 256;
                                                    } else if (var97 == 1024) {
                                                        var97 = 768;
                                                    } else {
                                                        var97 = 512;
                                                    }
                                                }
                                                byte var98 = 0;
                                                if (class40.field381[35]) {
                                                    var98 = -1;
                                                } else if (class40.field381[51]) {
                                                    var98 = 1;
                                                }
                                                int var99 = 0;
                                                if (var97 >= 0 || var98 != 0) {
                                                    int var100 = class40.field381[81] ? field725 : field724;
                                                    var99 = var100 * 16;
                                                    field722 = var97;
                                                    field858 = var98;
                                                }
                                                if (field708 < var99) {
                                                    field708 += var99 / 8;
                                                    if (field708 > var99) {
                                                        field708 = var99;
                                                    }
                                                } else if (field708 > var99) {
                                                    field708 = field708 * 9 / 10;
                                                }
                                                if (field708 > 0) {
                                                    int var101 = field708 / 16;
                                                    if (field722 >= 0) {
                                                        int var102 = field722 - Statics.field144 & 0x7FF;
                                                        int var103 = class125.field1748[var102];
                                                        int var104 = class125.field1755[var102];
                                                        Statics.field69 += var101 * var103 / 65536;
                                                        Statics.field71 += var101 * var104 / 65536;
                                                    }
                                                    if (field858 != 0) {
                                                        Statics.field1718 += field858 * var101;
                                                        if (Statics.field1718 > 0) {
                                                            Statics.field1718 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field722 = -1;
                                                    field858 = -1;
                                                }
                                                if (class40.field381[13]) {
                                                    field691.method2060(class175.method3035(class172.field2286, field691.field1283));
                                                    field719 = 0;
                                                }
                                            }
                                            if (class49.field470 == 4 && Statics.field133) {
                                                int var105 = class49.field465 * -976212263 - field718;
                                                field716 = var105 * 2;
                                                field718 = var105 == -1 || var105 == 1 ? class49.field465 * -976212263 : (field718 + class49.field465 * -976212263) / 2;
                                                int var106 = field870 - class49.field474;
                                                field715 = var106 * 2;
                                                field870 = var106 == -1 || var106 == 1 ? class49.field474 : (field870 + class49.field474) / 2;
                                            } else {
                                                if (class40.field381[96]) {
                                                    field715 += (-24 - field715) / 2;
                                                } else if (class40.field381[97]) {
                                                    field715 += (24 - field715) / 2;
                                                } else {
                                                    field715 /= 2;
                                                }
                                                if (class40.field381[98]) {
                                                    field716 += (12 - field716) / 2;
                                                } else if (class40.field381[99]) {
                                                    field716 += (-12 - field716) / 2;
                                                } else {
                                                    field716 /= 2;
                                                }
                                                field718 = class49.field465 * -976212263;
                                                field870 = class49.field474;
                                            }
                                            field659 = field715 / 2 + field659 & 0x7FF;
                                            field713 += field716 / 2;
                                            if (field713 < 128) {
                                                field713 = 128;
                                            }
                                            if (field713 > 383) {
                                                field713 = 383;
                                            }
                                            if (field890) {
                                                method137();
                                            }
                                            for (int var107 = 0; var107 < 5; var107++) {
                                                var10002 = field895[var107]++;
                                            }
                                            Statics.field349.method1960();
                                            int var108 = ++class49.field485 - 1;
                                            int var110 = class40.field392;
                                            if (var108 > 15000 && var110 > 15000) {
                                                field726 = 250;
                                                class49.method2035(14500);
                                                class175 var112 = class175.method3035(class172.field2257, field691.field1283);
                                                field691.method2060(var112);
                                            }
                                            Statics.field2151.method1716();
                                            field691.field1289++;
                                            if (field691.field1289 > 50) {
                                                class175 var113 = class175.method3035(class172.field2225, field691.field1283);
                                                field691.method2060(var113);
                                            }
                                            try {
                                                field691.method2054();
                                            } catch (IOException var115) {
                                                method222();
                                            }
                                            return;
                                        }
                                        var71 = var70.field571;
                                        if (var71.field2788 < 0) {
                                            break;
                                        }
                                        var72 = class233.method214(var71.field2701);
                                    } while (var72 == null || var72.field2792 == null || var71.field2788 >= var72.field2792.length || var72.field2792[var71.field2788] != var71);
                                    class71.method997(var70);
                                }
                            }
                            var68 = var67.field571;
                            if (var68.field2788 < 0) {
                                break;
                            }
                            var69 = class233.method214(var68.field2701);
                        } while (var69 == null || var69.field2792 == null || var68.field2788 >= var69.field2792.length || var69.field2792[var68.field2788] != var68);
                        class71.method997(var67);
                    }
                }
                var65 = var64.field571;
                if (var65.field2788 < 0) {
                    break;
                }
                var66 = class233.method214(var65.field2701);
            } while (var66 == null || var66.field2792 == null || var65.field2788 >= var66.field2792.length || var66.field2792[var65.field2788] != var65);
            class71.method997(var64);
        }
    }

    @ObfuscatedName("fg.fy(B)V")
    public static final void method3257() {
        if (Statics.field47 != null) {
            Statics.field47.method2209();
        }
        if (Statics.field883 != null) {
            Statics.field883.method2209();
        }
    }

    @ObfuscatedName("fd.fv(Ljg;IIII)V")
    public static void method3388(class276 arg0, int arg1, int arg2, int arg3) {
        if (field906 >= 50 || field882 == 0 || arg0.field3621 == null || arg1 >= arg0.field3621.length) {
            return;
        }
        int var4 = arg0.field3621[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field885[field906] = var5;
        field886[field906] = var6;
        field794[field906] = 0;
        field711[field906] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field888[field906] = (var8 << 16) + (var9 << 8) + var7;
        field906++;
    }

    @ObfuscatedName("ar.fx(IIII)V")
    public static void method634(int arg0, int arg1, int arg2) {
        if (field889 == 0 || arg1 == 0 || field906 >= 50) {
            return;
        }
        field885[field906] = arg0;
        field886[field906] = arg1;
        field794[field906] = arg2;
        field711[field906] = null;
        field888[field906] = 0;
        field906++;
    }

    @ObfuscatedName("by.fz(IB)V")
    public static void method1734(int arg0) {
        if (arg0 == -1 && !field880) {
            class220.method323();
        } else if (arg0 != -1 && field879 != arg0 && field878 != 0 && !field880) {
            class220.method459(2, Statics.field2118, arg0, 0, field878, false);
        }
        field879 = arg0;
    }

    @ObfuscatedName("ix.fq(III)V")
    public static void method4592(int arg0, int arg1) {
        if (field878 != 0 && arg0 != -1) {
            class220.method3262(Statics.field2457, arg0, 0, field878, false);
            field880 = true;
        }
    }

    @ObfuscatedName("j.fs(I)V")
    public static final void method144() {
        if (Statics.field600 == field662) {
            return;
        }
        field662 = Statics.field600;
        int var0 = Statics.field600;
        int[] var1 = Statics.field30.field3890;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class51.field493[var0][var6][var4] & 0x18) == 0) {
                    Statics.field3174.method2889(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class51.field493[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3174.method2889(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field30.method5680();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class51.field493[var0][var10][var9] & 0x18) == 0) {
                    method3045(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class51.field493[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3045(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field821 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3174.method2980(Statics.field600, var11, var12);
                if (var13 != 0L) {
                    int var15 = class123.method1031(var13);
                    int var16 = class271.method4591(var15).field3480;
                    if (var16 >= 0) {
                        field874[field821] = class258.method3265(var16).method4656(false);
                        field872[field821] = var11;
                        field873[field821] = var12;
                        field821++;
                    }
                }
            }
        }
        Statics.field314.method5655();
    }

    @ObfuscatedName("hb.fc(Lhn;III)V")
    public static final void method4039(class233 arg0, int arg1, int arg2) {
        if (field877 != 0 && field877 != 3 || field834 || !(class49.field478 == 1 || !Statics.field133 && class49.field478 == 4)) {
            return;
        }
        class227 var3 = arg0.method4376(true);
        if (var3 == null) {
            return;
        }
        int var4 = class49.field479 - arg1;
        int var5 = class49.field468 - arg2;
        if (!var3.method4266(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2627 / 2;
        int var7 = var5 - var3.field2622 / 2;
        int var8 = field659 & 0x7FF;
        int var9 = class125.field1748[var8];
        int var10 = class125.field1755[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1064.field954 + var11 >> 7;
        int var14 = Statics.field1064.field1000 - var12 >> 7;
        class175 var15 = class175.method3035(class172.field2239, field691.field1283);
        var15.field2333.method3501(18);
        var15.field2333.method3583(Statics.field92 + var14);
        var15.field2333.method3583(Statics.field491 + var13);
        var15.field2333.method3491(class40.field381[82] ? (class40.field381[81] ? 2 : 1) : 0);
        var15.field2333.method3501(var6);
        var15.field2333.method3501(var7);
        var15.field2333.method3450(field659);
        var15.field2333.method3501(57);
        var15.field2333.method3501(0);
        var15.field2333.method3501(0);
        var15.field2333.method3501(89);
        var15.field2333.method3450(Statics.field1064.field954);
        var15.field2333.method3450(Statics.field1064.field1000);
        var15.field2333.method3501(63);
        field691.method2060(var15);
        field723 = var13;
        field876 = var14;
    }

    @ObfuscatedName("ai.fm(Ljava/lang/String;S)V")
    public static final void method682(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field436.field1030 = !Statics.field436.field1030;
            class68.method1123();
            if (Statics.field436.field1030) {
                class86.method1084(99, "", "Roofs are now all hidden");
            } else {
                class86.method1084(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field887 = !field887;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field763 = !field763;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field792 = !field792;
        }
        if (field813 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field419.field3995 = !Statics.field419.field3995;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field887 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field887 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method222();
            }
        }
        class175 var1 = class175.method3035(class172.field2268, field691.field1283);
        var1.field2333.method3501(arg0.length() + 1);
        var1.field2333.method3585(arg0);
        field691.method2060(var1);
    }

    @ObfuscatedName("d.fb(I)V")
    public static final void method137() {
        int var0 = Statics.field267 * 128 + 64;
        int var1 = Statics.field2362 * 128 + 64;
        int var2 = method3155(var0, var1, Statics.field600) - Statics.field1927;
        if (Statics.field2037 < var0) {
            Statics.field2037 += Statics.field315 * (var0 - Statics.field2037) / 1000 + Statics.field2207;
            if (Statics.field2037 > var0) {
                Statics.field2037 = var0;
            }
        }
        if (Statics.field2037 > var0) {
            Statics.field2037 -= Statics.field315 * (Statics.field2037 - var0) / 1000 + Statics.field2207;
            if (Statics.field2037 < var0) {
                Statics.field2037 = var0;
            }
        }
        if (Statics.field2410 < var2) {
            Statics.field2410 += Statics.field315 * (var2 - Statics.field2410) / 1000 + Statics.field2207;
            if (Statics.field2410 > var2) {
                Statics.field2410 = var2;
            }
        }
        if (Statics.field2410 > var2) {
            Statics.field2410 -= Statics.field315 * (Statics.field2410 - var2) / 1000 + Statics.field2207;
            if (Statics.field2410 < var2) {
                Statics.field2410 = var2;
            }
        }
        if (Statics.field509 < var1) {
            Statics.field509 += Statics.field315 * (var1 - Statics.field509) / 1000 + Statics.field2207;
            if (Statics.field509 > var1) {
                Statics.field509 = var1;
            }
        }
        if (Statics.field509 > var1) {
            Statics.field509 -= Statics.field315 * (Statics.field509 - var1) / 1000 + Statics.field2207;
            if (Statics.field509 < var1) {
                Statics.field509 = var1;
            }
        }
        int var3 = Statics.field1028 * 128 + 64;
        int var4 = Statics.field1940 * 128 + 64;
        int var5 = method3155(var3, var4, Statics.field600) - Statics.field209;
        int var6 = var3 - Statics.field2037;
        int var7 = var5 - Statics.field2410;
        int var8 = var4 - Statics.field509;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field577 < var10) {
            Statics.field577 += Statics.field3290 * (var10 - Statics.field577) / 1000 + Statics.field1027;
            if (Statics.field577 > var10) {
                Statics.field577 = var10;
            }
        }
        if (Statics.field577 > var10) {
            Statics.field577 -= Statics.field3290 * (Statics.field577 - var10) / 1000 + Statics.field1027;
            if (Statics.field577 < var10) {
                Statics.field577 = var10;
            }
        }
        int var12 = var11 - Statics.field144;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field144 += Statics.field3290 * var12 / 1000 + Statics.field1027;
            Statics.field144 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field144 -= Statics.field3290 * -var12 / 1000 + Statics.field1027;
            Statics.field144 &= 0x7FF;
        }
        int var13 = var11 - Statics.field144;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field144 = var11;
        }
    }

    @ObfuscatedName("be.fd(I)V")
    public static final void method1589() {
        int var0 = class84.field1227;
        int[] var1 = class84.field1223;
        for (int var2 = 0; var2 < var0; var2++) {
            class62 var3 = field699[var1[var2]];
            if (var3 != null) {
                method3141(var3, 1);
            }
        }
    }

    @ObfuscatedName("cg.fo(I)V")
    public static final void method1926() {
        for (int var0 = 0; var0 < field687; var0++) {
            int var1 = field688[var0];
            class74 var2 = field807[var1];
            if (var2 != null) {
                method3141(var2, var2.field1103.field3601);
            }
        }
    }

    @ObfuscatedName("ea.fk(Lbc;IB)V")
    public static final void method3141(class65 arg0, int arg1) {
        if (arg0.field986 > field656) {
            int var2 = arg0.field986 - field656;
            int var3 = arg0.field984 * 128 + arg0.field965 * 64;
            int var4 = arg0.field996 * 128 + arg0.field965 * 64;
            arg0.field954 += (var3 - arg0.field954) / var2;
            arg0.field1000 += (var4 - arg0.field1000) / var2;
            arg0.field956 = 0;
            arg0.field991 = arg0.field998;
        } else if (arg0.field978 >= field656) {
            if (field656 == arg0.field978 || arg0.field972 == -1 || arg0.field999 != 0 || arg0.field990 + 1 > class276.method493(arg0.field972).field3631[arg0.field987]) {
                int var5 = arg0.field978 - arg0.field986;
                int var6 = field656 - arg0.field986;
                int var7 = arg0.field984 * 128 + arg0.field965 * 64;
                int var8 = arg0.field996 * 128 + arg0.field965 * 64;
                int var9 = arg0.field983 * 128 + arg0.field965 * 64;
                int var10 = arg0.field985 * 128 + arg0.field965 * 64;
                arg0.field954 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1000 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field956 = 0;
            arg0.field991 = arg0.field998;
            arg0.field941 = arg0.field991;
        } else {
            method4710(arg0);
        }
        if (arg0.field954 < 128 || arg0.field1000 < 128 || arg0.field954 >= 13184 || arg0.field1000 >= 13184) {
            arg0.field972 = -1;
            arg0.field977 = -1;
            arg0.field986 = 0;
            arg0.field978 = 0;
            arg0.field954 = arg0.field995[0] * 128 + arg0.field965 * 64;
            arg0.field1000 = arg0.field953[0] * 128 + arg0.field965 * 64;
            arg0.method1558();
        }
        if (Statics.field1064 == arg0 && (arg0.field954 < 1536 || arg0.field1000 < 1536 || arg0.field954 >= 11776 || arg0.field1000 >= 11776)) {
            arg0.field972 = -1;
            arg0.field977 = -1;
            arg0.field986 = 0;
            arg0.field978 = 0;
            arg0.field954 = arg0.field995[0] * 128 + arg0.field965 * 64;
            arg0.field1000 = arg0.field953[0] * 128 + arg0.field965 * 64;
            arg0.method1558();
        }
        method680(arg0);
        arg0.field942 = false;
        if (arg0.field973 != -1) {
            class276 var11 = class276.method493(arg0.field973);
            if (var11 == null || var11.field3624 == null) {
                arg0.field973 = -1;
            } else {
                arg0.field971++;
                if (arg0.field970 < var11.field3624.length && arg0.field971 > var11.field3631[arg0.field970]) {
                    arg0.field971 = 1;
                    arg0.field970++;
                    method3388(var11, arg0.field970, arg0.field954, arg0.field1000);
                }
                if (arg0.field970 >= var11.field3624.length) {
                    arg0.field971 = 0;
                    arg0.field970 = 0;
                    method3388(var11, arg0.field970, arg0.field954, arg0.field1000);
                }
            }
        }
        if (arg0.field977 != -1 && field656 >= arg0.field980) {
            if (arg0.field994 < 0) {
                arg0.field994 = 0;
            }
            int var12 = class261.method4525(arg0.field977).field3349;
            if (var12 == -1) {
                arg0.field977 = -1;
            } else {
                class276 var13 = class276.method493(var12);
                if (var13 == null || var13.field3624 == null) {
                    arg0.field977 = -1;
                } else {
                    arg0.field979++;
                    if (arg0.field994 < var13.field3624.length && arg0.field979 > var13.field3631[arg0.field994]) {
                        arg0.field979 = 1;
                        arg0.field994++;
                        method3388(var13, arg0.field994, arg0.field954, arg0.field1000);
                    }
                    if (arg0.field994 >= var13.field3624.length && (arg0.field994 < 0 || arg0.field994 >= var13.field3624.length)) {
                        arg0.field977 = -1;
                    }
                }
            }
        }
        if (arg0.field972 != -1 && arg0.field999 <= 1) {
            class276 var14 = class276.method493(arg0.field972);
            if (var14.field3623 == 1 && arg0.field960 > 0 && arg0.field986 <= field656 && arg0.field978 < field656) {
                arg0.field999 = 1;
                return;
            }
        }
        if (arg0.field972 != -1 && arg0.field999 == 0) {
            class276 var15 = class276.method493(arg0.field972);
            if (var15 == null || var15.field3624 == null) {
                arg0.field972 = -1;
            } else {
                arg0.field990++;
                if (arg0.field987 < var15.field3624.length && arg0.field990 > var15.field3631[arg0.field987]) {
                    arg0.field990 = 1;
                    arg0.field987++;
                    method3388(var15, arg0.field987, arg0.field954, arg0.field1000);
                }
                if (arg0.field987 >= var15.field3624.length) {
                    arg0.field987 -= var15.field3625;
                    arg0.field976++;
                    if (arg0.field976 >= var15.field3634) {
                        arg0.field972 = -1;
                    } else if (arg0.field987 >= 0 && arg0.field987 < var15.field3624.length) {
                        method3388(var15, arg0.field987, arg0.field954, arg0.field1000);
                    } else {
                        arg0.field972 = -1;
                    }
                }
                arg0.field942 = var15.field3627;
            }
        }
        if (arg0.field999 > 0) {
            arg0.field999--;
        }
    }

    @ObfuscatedName("ju.fu(Lbc;I)V")
    public static final void method4710(class65 arg0) {
        arg0.field973 = arg0.field945;
        if (arg0.field940 == 0) {
            arg0.field956 = 0;
            return;
        }
        if (arg0.field972 != -1 && arg0.field999 == 0) {
            class276 var1 = class276.method493(arg0.field972);
            if (arg0.field960 > 0 && var1.field3623 == 0) {
                arg0.field956++;
                return;
            }
            if (arg0.field960 <= 0 && var1.field3633 == 0) {
                arg0.field956++;
                return;
            }
        }
        int var2 = arg0.field954;
        int var3 = arg0.field1000;
        int var4 = arg0.field995[arg0.field940 - 1] * 128 + arg0.field965 * 64;
        int var5 = arg0.field953[arg0.field940 - 1] * 128 + arg0.field965 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field991 = 1280;
            } else if (var3 > var5) {
                arg0.field991 = 1792;
            } else {
                arg0.field991 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field991 = 768;
            } else if (var3 > var5) {
                arg0.field991 = 256;
            } else {
                arg0.field991 = 512;
            }
        } else if (var3 < var5) {
            arg0.field991 = 1024;
        } else if (var3 > var5) {
            arg0.field991 = 0;
        }
        byte var6 = arg0.field997[arg0.field940 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field954 = var4;
            arg0.field1000 = var5;
            arg0.field940--;
            if (arg0.field960 > 0) {
                arg0.field960--;
            }
            return;
        }
        int var7 = arg0.field991 - arg0.field941 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field949;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field943;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field951;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field950;
        }
        if (var8 == -1) {
            var8 = arg0.field943;
        }
        arg0.field973 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class74) {
            var10 = ((class74) arg0).field1103.field3599;
        }
        if (var10) {
            if (arg0.field991 != arg0.field941 && arg0.field966 == -1 && arg0.field948 != 0) {
                var9 = 2;
            }
            if (arg0.field940 > 2) {
                var9 = 6;
            }
            if (arg0.field940 > 3) {
                var9 = 8;
            }
            if (arg0.field956 > 0 && arg0.field940 > 1) {
                var9 = 8;
                arg0.field956--;
            }
        } else {
            if (arg0.field940 > 1) {
                var9 = 6;
            }
            if (arg0.field940 > 2) {
                var9 = 8;
            }
            if (arg0.field956 > 0 && arg0.field940 > 1) {
                var9 = 8;
                arg0.field956--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field973 == arg0.field943 && arg0.field952 != -1) {
            arg0.field973 = arg0.field952;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field954 += var9;
                if (arg0.field954 > var4) {
                    arg0.field954 = var4;
                }
            } else if (var2 > var4) {
                arg0.field954 -= var9;
                if (arg0.field954 < var4) {
                    arg0.field954 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1000 += var9;
                if (arg0.field1000 > var5) {
                    arg0.field1000 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1000 -= var9;
                if (arg0.field1000 < var5) {
                    arg0.field1000 = var5;
                }
            }
        }
        if (arg0.field954 == var4 && arg0.field1000 == var5) {
            arg0.field940--;
            if (arg0.field960 > 0) {
                arg0.field960--;
            }
        }
    }

    @ObfuscatedName("aa.fj(Lbc;S)V")
    public static final void method680(class65 arg0) {
        if (arg0.field948 == 0) {
            return;
        }
        if (arg0.field966 != -1) {
            class65 var1 = null;
            if (arg0.field966 < 32768) {
                var1 = field807[arg0.field966];
            } else if (arg0.field966 >= 32768) {
                var1 = field699[arg0.field966 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field954 - var1.field954;
                int var3 = arg0.field1000 - var1.field1000;
                if (var2 != 0 || var3 != 0) {
                    arg0.field991 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field967) {
                arg0.field966 = -1;
                arg0.field967 = false;
            }
        }
        if (arg0.field968 != -1 && (arg0.field940 == 0 || arg0.field956 > 0)) {
            arg0.field991 = arg0.field968;
            arg0.field968 = -1;
        }
        int var4 = arg0.field991 - arg0.field941 & 0x7FF;
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
            arg0.field941 -= arg0.field948;
            boolean var5 = true;
            if (var4 < arg0.field948 || var4 > 2048 - arg0.field948) {
                arg0.field941 = arg0.field991;
                var5 = false;
            }
            if (arg0.field973 == arg0.field945 && (arg0.field992 > 25 || var5)) {
                if (arg0.field946 == -1) {
                    arg0.field973 = arg0.field943;
                } else {
                    arg0.field973 = arg0.field946;
                }
            }
        } else {
            arg0.field941 += arg0.field948;
            boolean var6 = true;
            if (var4 < arg0.field948 || var4 > 2048 - arg0.field948) {
                arg0.field941 = arg0.field991;
                var6 = false;
            }
            if (arg0.field973 == arg0.field945 && (arg0.field992 > 25 || var6)) {
                if (arg0.field958 == -1) {
                    arg0.field973 = arg0.field943;
                } else {
                    arg0.field973 = arg0.field958;
                }
            }
        }
        arg0.field941 &= 0x7FF;
    }

    @ObfuscatedName("ag.gc(Lbk;III)V")
    public static void method558(class62 arg0, int arg1, int arg2) {
        if (arg0.field972 == arg1 && arg1 != -1) {
            int var3 = class276.method493(arg1).field3616;
            if (var3 == 1) {
                arg0.field987 = 0;
                arg0.field990 = 0;
                arg0.field999 = arg2;
                arg0.field976 = 0;
            }
            if (var3 == 2) {
                arg0.field976 = 0;
            }
        } else if (arg1 == -1 || arg0.field972 == -1 || class276.method493(arg1).field3628 >= class276.method493(arg0.field972).field3628) {
            arg0.field972 = arg1;
            arg0.field987 = 0;
            arg0.field990 = 0;
            arg0.field999 = arg2;
            arg0.field976 = 0;
            arg0.field960 = arg0.field940;
        }
    }

    @ObfuscatedName("f.gj(I)I")
    public static int method212() {
        return field676 ? 2 : 1;
    }

    @ObfuscatedName("an.gl(IB)V")
    public static void method475(int arg0) {
        field871 = 0L;
        if (arg0 >= 2) {
            field676 = true;
        } else {
            field676 = false;
        }
        if (method212() == 1) {
            Statics.field2038.method871(765, 503);
        } else {
            Statics.field2038.method871(7680, 2160);
        }
        if (field721 >= 25) {
            method1841();
        }
    }

    @ObfuscatedName("bm.gs(I)V")
    public static void method1841() {
        class175 var0 = class175.method3035(class172.field2243, field691.field1283);
        var0.field2333.method3501(method212());
        var0.field2333.method3450(Statics.field1039);
        var0.field2333.method3450(Statics.field1938);
        field691.method2060(var0);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method834() {
        field871 = class187.method2664() + 500L;
        this.method1265();
        if (field804 != -1) {
            this.method1169(true);
        }
    }

    @ObfuscatedName("client.gk(I)V")
    public void method1265() {
        int var1 = Statics.field1039;
        int var2 = Statics.field1938;
        if (this.field440 < var1) {
            int var3 = this.field440;
        }
        if (this.field441 < var2) {
            int var4 = this.field441;
        }
        if (Statics.field436 != null) {
            try {
                class42.method693(Statics.field2038, "resize", new Object[] { method212() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gd(I)V")
    public final void method1339() {
        if (field804 != -1) {
            int var1 = field804;
            if (class233.method3715(var1)) {
                method998(Statics.field1952[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field854; var2++) {
            if (field849[var2]) {
                field850[var2] = true;
            }
            field707[var2] = field849[var2];
            field849[var2] = false;
        }
        field848 = field656;
        field793 = -1;
        field861 = -1;
        Statics.field105 = null;
        if (field804 != -1) {
            field854 = 0;
            method749(field804, 0, 0, Statics.field1039, Statics.field1938, 0, 0, -1);
        }
        class320.method5573();
        if (field749) {
            if (field760 == 1) {
                Statics.field1946[field810 / 100].method5689(field745 - 8, field746 - 8);
            }
            if (field760 == 2) {
                Statics.field1946[field810 / 100 + 4].method5689(field745 - 8, field746 - 8);
            }
        }
        if (field834) {
            int var8 = Statics.field2068;
            int var9 = Statics.field1261;
            int var10 = Statics.field1114;
            int var11 = Statics.field1839;
            int var12 = 6116423;
            class320.method5583(var8, var9, var10, var11, var12);
            class320.method5583(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class320.method5652(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field2067.method5390(class240.field3012, var8 + 3, var9 + 14, var12, -1);
            int var13 = class49.field474;
            int var14 = class49.field465 * -976212263;
            for (int var15 = 0; var15 < field781; var15++) {
                int var16 = (field781 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                Statics.field2067.method5390(method585(var15), var8 + 3, var16, var17, 0);
            }
            method4272(Statics.field2068, Statics.field1261, Statics.field1114, Statics.field1839);
        } else if (field793 != -1) {
            int var3 = field793;
            int var4 = field861;
            if ((field781 >= 2 || field797 != 0 || field799) && field792) {
                int var5 = field781 - 1;
                String var7;
                if (field797 == 1 && field781 < 2) {
                    var7 = class240.field3078 + class240.field3019 + field767 + " " + class76.field1116;
                } else if (field799 && field781 < 2) {
                    var7 = field802 + class240.field3019 + field717 + " " + class76.field1116;
                } else {
                    var7 = method585(var5);
                }
                if (field781 > 2) {
                    var7 = var7 + class76.method3031(16777215) + " " + '/' + " " + (field781 - 2) + class240.field3005;
                }
                Statics.field2067.method5372(var7, var3 + 4, var4 + 15, 16777215, 0, field656 / 1000);
            }
        }
        if (field856 == 3) {
            for (int var18 = 0; var18 < field854; var18++) {
                if (field707[var18]) {
                    class320.method5582(field764[var18], field853[var18], field820[var18], field855[var18], 16711935, 128);
                } else if (field850[var18]) {
                    class320.method5582(field764[var18], field853[var18], field820[var18], field855[var18], 16711680, 128);
                }
            }
        }
        class70.method303(Statics.field600, Statics.field1064.field954, Statics.field1064.field1000, field706);
        field706 = 0;
    }

    @ObfuscatedName("bq.ga(Ljava/lang/String;ZI)V")
    public static final void method1053(String arg0, boolean arg1) {
        if (!field759) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field26.method5345(arg0, 250);
        int var6 = Statics.field26.method5346(arg0, 250) * 13;
        class320.method5583(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class320.method5652(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field26.method5342(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field854; var11++) {
            if (field820[var11] + field764[var11] > var7 && field764[var11] < var7 + var9 && field855[var11] + field853[var11] > var8 && field853[var11] < var8 + var10) {
                field849[var11] = true;
            }
        }
        if (arg1) {
            Statics.field314.method758(0, 0);
        } else {
            method4272(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ag.go(IIIIB)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3) {
        field742++;
        method4820();
        method1628();
        if (field770 >= 0 && field699[field770] != null) {
            method1128(field699[field770], false);
        }
        method2649(true);
        int var4 = class84.field1227;
        int[] var5 = class84.field1223;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field770 != var5[var6] && field748 != var5[var6]) {
                method1128(field699[var5[var6]], true);
            }
        }
        method2649(false);
        for (class81 var7 = (class81) field774.method3979(); var7 != null; var7 = (class81) field774.method3964()) {
            if (Statics.field600 != var7.field1184 || field656 > var7.field1190) {
                var7.method3952();
            } else if (field656 >= var7.field1189) {
                if (var7.field1193 > 0) {
                    class74 var8 = field807[var7.field1193 - 1];
                    if (var8 != null && var8.field954 >= 0 && var8.field954 < 13312 && var8.field1000 >= 0 && var8.field1000 < 13312) {
                        var7.method1918(var8.field954, var8.field1000, method3155(var8.field954, var8.field1000, var7.field1184) - var7.field1188, field656);
                    }
                }
                if (var7.field1193 < 0) {
                    int var9 = -var7.field1193 - 1;
                    class62 var10;
                    if (field748 == var9) {
                        var10 = Statics.field1064;
                    } else {
                        var10 = field699[var9];
                    }
                    if (var10 != null && var10.field954 >= 0 && var10.field954 < 13312 && var10.field1000 >= 0 && var10.field1000 < 13312) {
                        var7.method1918(var10.field954, var10.field1000, method3155(var10.field954, var10.field1000, var7.field1184) - var7.field1188, field656);
                    }
                }
                var7.method1921(field706);
                Statics.field3174.method2890(Statics.field600, (int) var7.field1186, (int) var7.field1192, (int) var7.field1185, 60, var7, var7.field1195, -1L, false);
            }
        }
        for (class72 var11 = (class72) field712.method3979(); var11 != null; var11 = (class72) field712.method3964()) {
            if (Statics.field600 != var11.field1087 || var11.field1094) {
                var11.method3952();
            } else if (field656 >= var11.field1086) {
                var11.method1845(field706);
                if (var11.field1094) {
                    var11.method3952();
                } else {
                    Statics.field3174.method2890(var11.field1087, var11.field1088, var11.field1089, var11.field1090, 60, var11, 0, -1L, false);
                }
            }
        }
        method37(arg0, arg1, arg2, arg3, true);
        int var12 = field658;
        int var13 = field694;
        int var14 = field645;
        int var15 = field765;
        class320.method5603(var12, var13, var12 + var14, var13 + var15);
        class125.method2798();
        if (!field890) {
            int var16 = field713;
            if (field730 / 256 > var16) {
                var16 = field730 / 256;
            }
            if (field891[4] && field893[4] + 128 > var16) {
                var16 = field893[4] + 128;
            }
            int var17 = field659 & 0x7FF;
            int var18 = Statics.field69;
            int var19 = Statics.field1718;
            int var20 = Statics.field71;
            int var21 = var16 * 3 + 600;
            int var23 = var15 - 334;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > 100) {
                var23 = 100;
            }
            int var24 = (field899 - field898) * var23 / 100 + field898;
            int var25 = var21 * var24 / 256;
            int var27 = 2048 - var16 & 0x7FF;
            int var28 = 2048 - var17 & 0x7FF;
            int var29 = 0;
            int var30 = 0;
            int var31 = var25;
            if (var27 != 0) {
                int var32 = class125.field1748[var27];
                int var33 = class125.field1755[var27];
                int var34 = var30 * var33 - var25 * var32 >> 16;
                var31 = var30 * var32 + var25 * var33 >> 16;
                var30 = var34;
            }
            if (var28 != 0) {
                int var35 = class125.field1748[var28];
                int var36 = class125.field1755[var28];
                int var37 = var29 * var36 + var31 * var35 >> 16;
                var31 = var31 * var36 - var29 * var35 >> 16;
                var29 = var37;
            }
            Statics.field2037 = var18 - var29;
            Statics.field2410 = var19 - var30;
            Statics.field509 = var20 - var31;
            Statics.field577 = var16;
            Statics.field144 = var17;
            if (field719 == 1 && field813 >= 2 && field656 % 50 == 0 && (Statics.field69 >> 7 != Statics.field1064.field954 >> 7 || Statics.field71 >> 7 != Statics.field1064.field1000 >> 7)) {
                int var38 = Statics.field1064.field621;
                int var39 = (Statics.field69 >> 7) + Statics.field491;
                int var40 = (Statics.field71 >> 7) + Statics.field92;
                method944(var39, var40, var38, true);
            }
        }
        int var53;
        if (field890) {
            int var54;
            if (Statics.field436.field1030) {
                var54 = Statics.field600;
            } else {
                int var55 = method3155(Statics.field2037, Statics.field509, Statics.field600);
                if (var55 - Statics.field2410 >= 800 || (class51.field493[Statics.field600][Statics.field2037 >> 7][Statics.field509 >> 7] & 0x4) == 0) {
                    var54 = 3;
                } else {
                    var54 = Statics.field600;
                }
            }
            var53 = var54;
        } else {
            int var41;
            if (Statics.field436.field1030) {
                var41 = Statics.field600;
            } else {
                label568: {
                    int var42 = 3;
                    if (Statics.field577 < 310) {
                        label559: {
                            int var43;
                            int var44;
                            if (field719 == 1) {
                                var43 = Statics.field69 >> 7;
                                var44 = Statics.field71 >> 7;
                            } else {
                                var43 = Statics.field1064.field954 >> 7;
                                var44 = Statics.field1064.field1000 >> 7;
                            }
                            int var45 = Statics.field2037 >> 7;
                            int var46 = Statics.field509 >> 7;
                            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                                    if ((class51.field493[Statics.field600][var45][var46] & 0x4) != 0) {
                                        var42 = Statics.field600;
                                    }
                                    int var47;
                                    if (var43 > var45) {
                                        var47 = var43 - var45;
                                    } else {
                                        var47 = var45 - var43;
                                    }
                                    int var48;
                                    if (var44 > var46) {
                                        var48 = var44 - var46;
                                    } else {
                                        var48 = var46 - var44;
                                    }
                                    if (var47 > var48) {
                                        int var49 = var48 * 65536 / var47;
                                        int var50 = 32768;
                                        while (true) {
                                            if (var43 == var45) {
                                                break label559;
                                            }
                                            if (var45 < var43) {
                                                var45++;
                                            } else if (var45 > var43) {
                                                var45--;
                                            }
                                            if ((class51.field493[Statics.field600][var45][var46] & 0x4) != 0) {
                                                var42 = Statics.field600;
                                            }
                                            var50 += var49;
                                            if (var50 >= 65536) {
                                                var50 -= 65536;
                                                if (var46 < var44) {
                                                    var46++;
                                                } else if (var46 > var44) {
                                                    var46--;
                                                }
                                                if ((class51.field493[Statics.field600][var45][var46] & 0x4) != 0) {
                                                    var42 = Statics.field600;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var48 > 0) {
                                            int var51 = var47 * 65536 / var48;
                                            int var52 = 32768;
                                            while (var44 != var46) {
                                                if (var46 < var44) {
                                                    var46++;
                                                } else if (var46 > var44) {
                                                    var46--;
                                                }
                                                if ((class51.field493[Statics.field600][var45][var46] & 0x4) != 0) {
                                                    var42 = Statics.field600;
                                                }
                                                var52 += var51;
                                                if (var52 >= 65536) {
                                                    var52 -= 65536;
                                                    if (var45 < var43) {
                                                        var45++;
                                                    } else if (var45 > var43) {
                                                        var45--;
                                                    }
                                                    if ((class51.field493[Statics.field600][var45][var46] & 0x4) != 0) {
                                                        var42 = Statics.field600;
                                                    }
                                                }
                                            }
                                        }
                                        break label559;
                                    }
                                }
                                var41 = Statics.field600;
                                break label568;
                            }
                            var41 = Statics.field600;
                            break label568;
                        }
                    }
                    if (Statics.field1064.field954 >= 0 && Statics.field1064.field1000 >= 0 && Statics.field1064.field954 < 13312 && Statics.field1064.field1000 < 13312) {
                        if ((class51.field493[Statics.field600][Statics.field1064.field954 >> 7][Statics.field1064.field1000 >> 7] & 0x4) != 0) {
                            var42 = Statics.field600;
                        }
                        var41 = var42;
                    } else {
                        var41 = Statics.field600;
                    }
                }
            }
            var53 = var41;
        }
        int var56 = Statics.field2037;
        int var57 = Statics.field2410;
        int var58 = Statics.field509;
        int var59 = Statics.field577;
        int var60 = Statics.field144;
        for (int var61 = 0; var61 < 5; var61++) {
            if (field891[var61]) {
                int var62 = (int) (Math.random() * (double) (field892[var61] * 2 + 1) - (double) field892[var61] + Math.sin((double) field894[var61] / 100.0D * (double) field895[var61]) * (double) field893[var61]);
                if (var61 == 0) {
                    Statics.field2037 += var62;
                }
                if (var61 == 1) {
                    Statics.field2410 += var62;
                }
                if (var61 == 2) {
                    Statics.field509 += var62;
                }
                if (var61 == 3) {
                    Statics.field144 = Statics.field144 + var62 & 0x7FF;
                }
                if (var61 == 4) {
                    Statics.field577 += var62;
                    if (Statics.field577 < 128) {
                        Statics.field577 = 128;
                    }
                    if (Statics.field577 > 383) {
                        Statics.field577 = 383;
                    }
                }
            }
        }
        int var63 = class49.field474;
        int var64 = class49.field465 * -976212263;
        if (class49.field478 != 0) {
            var63 = class49.field479;
            var64 = class49.field468;
        }
        if (var63 >= var12 && var63 < var12 + var14 && var64 >= var13 && var64 < var13 + var15) {
            int var65 = var63 - var12;
            int var66 = var64 - var13;
            class123.field1713 = var65;
            class123.field1716 = var66;
            class123.field1712 = true;
            class123.field1714 = 0;
            class123.field1709 = false;
        } else {
            class123.method685();
        }
        method3257();
        class320.method5583(var12, var13, var14, var15, 0);
        method3257();
        int var67 = class125.field1742;
        class125.field1742 = field908;
        Statics.field3174.method2896(Statics.field2037, Statics.field2410, Statics.field509, Statics.field577, Statics.field144, var53);
        class125.field1742 = var67;
        method3257();
        Statics.field3174.method2869();
        field913 = 0;
        boolean var68 = false;
        int var69 = -1;
        int var70 = -1;
        int var71 = class84.field1227;
        int[] var72 = class84.field1223;
        for (int var73 = 0; var73 < field687 + var71; var73++) {
            class65 var74;
            if (var73 < var71) {
                var74 = field699[var72[var73]];
                if (field770 == var72[var73]) {
                    var68 = true;
                    var69 = var73;
                    continue;
                }
                if (Statics.field1064 == var74) {
                    var70 = var73;
                    continue;
                }
            } else {
                var74 = field807[field688[var73 - var71]];
            }
            method1721(var74, var73, var12, var13, var14, var15);
        }
        if (field763 && var70 != -1) {
            method1721(Statics.field1064, var70, var12, var13, var14, var15);
        }
        if (var68) {
            method1721(field699[field770], var69, var12, var13, var14, var15);
        }
        for (int var75 = 0; var75 < field913; var75++) {
            int var76 = field733[var75];
            int var77 = field734[var75];
            int var78 = field758[var75];
            int var79 = field739[var75];
            boolean var80 = true;
            while (var80) {
                var80 = false;
                for (int var81 = 0; var81 < var75; var81++) {
                    if (var77 + 2 > field734[var81] - field739[var81] && var77 - var79 < field734[var81] + 2 && var76 - var78 < field758[var81] + field733[var81] && var76 + var78 > field733[var81] - field758[var81] && field734[var81] - field739[var81] < var77) {
                        var77 = field734[var81] - field739[var81];
                        var80 = true;
                    }
                }
            }
            field653 = field733[var75];
            field904 = field734[var75] = var77;
            String var82 = field740[var75];
            if (field808 == 0) {
                int var83 = 16776960;
                if (field737[var75] < 6) {
                    var83 = field860[field737[var75]];
                }
                if (field737[var75] == 6) {
                    var83 = field742 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field737[var75] == 7) {
                    var83 = field742 % 20 < 10 ? 255 : 65535;
                }
                if (field737[var75] == 8) {
                    var83 = field742 % 20 < 10 ? 45056 : 8454016;
                }
                if (field737[var75] == 9) {
                    int var84 = 150 - field819[var75];
                    if (var84 < 50) {
                        var83 = var84 * 1280 + 16711680;
                    } else if (var84 < 100) {
                        var83 = 16776960 - (var84 - 50) * 327680;
                    } else if (var84 < 150) {
                        var83 = (var84 - 100) * 5 + 65280;
                    }
                }
                if (field737[var75] == 10) {
                    int var85 = 150 - field819[var75];
                    if (var85 < 50) {
                        var83 = var85 * 5 + 16711680;
                    } else if (var85 < 100) {
                        var83 = 16711935 - (var85 - 50) * 327680;
                    } else if (var85 < 150) {
                        var83 = (var85 - 100) * 327680 + 255 - (var85 - 100) * 5;
                    }
                }
                if (field737[var75] == 11) {
                    int var86 = 150 - field819[var75];
                    if (var86 < 50) {
                        var83 = 16777215 - var86 * 327685;
                    } else if (var86 < 100) {
                        var83 = (var86 - 50) * 327685 + 65280;
                    } else if (var86 < 150) {
                        var83 = 16777215 - (var86 - 100) * 327680;
                    }
                }
                if (field738[var75] == 0) {
                    Statics.field2067.method5422(var82, field653 + var12, field904 + var13, var83, 0);
                }
                if (field738[var75] == 1) {
                    Statics.field2067.method5352(var82, field653 + var12, field904 + var13, var83, 0, field742);
                }
                if (field738[var75] == 2) {
                    Statics.field2067.method5353(var82, field653 + var12, field904 + var13, var83, 0, field742);
                }
                if (field738[var75] == 3) {
                    Statics.field2067.method5365(var82, field653 + var12, field904 + var13, var83, 0, field742, 150 - field819[var75]);
                }
                if (field738[var75] == 4) {
                    int var87 = (150 - field819[var75]) * (Statics.field2067.method5343(var82) + 100) / 150;
                    class320.method5577(field653 + var12 - 50, var13, field653 + var12 + 50, var13 + var15);
                    Statics.field2067.method5390(var82, field653 + var12 + 50 - var87, field904 + var13, var83, 0);
                    class320.method5603(var12, var13, var12 + var14, var13 + var15);
                }
                if (field738[var75] == 5) {
                    int var88 = 150 - field819[var75];
                    int var89 = 0;
                    if (var88 < 25) {
                        var89 = var88 - 25;
                    } else if (var88 > 125) {
                        var89 = var88 - 125;
                    }
                    class320.method5577(var12, field904 + var13 - Statics.field2067.field3766 - 1, var12 + var14, field904 + var13 + 5);
                    Statics.field2067.method5422(var82, field653 + var12, field904 + var13 + var89, var83, 0);
                    class320.method5603(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field2067.method5422(var82, field653 + var12, field904 + var13, 16776960, 0);
            }
        }
        if (field664 == 2) {
            method3224((field667 - Statics.field491 << 7) + field670, (field668 - Statics.field92 << 7) + field756, field669 * 2);
            if (field653 > -1 && field656 % 20 < 10) {
                Statics.field490[0].method5689(field653 + var12 - 12, field904 + var13 - 28);
            }
        }
        ((class114) Statics.field1753).method2546(field706);
        method145(var12, var13, var14, var15);
        Statics.field2037 = var56;
        Statics.field2410 = var57;
        Statics.field509 = var58;
        Statics.field577 = var59;
        Statics.field144 = var60;
        if (field655 && class253.method979(true, false) == 0) {
            field655 = false;
        }
        if (field655) {
            class320.method5583(var12, var13, var14, var15, 0);
            method1053(class240.field3029, false);
        }
    }

    @ObfuscatedName("q.gp(IIIIZI)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field650;
        } else if (var5 >= 100) {
            var6 = field897;
        } else {
            var6 = (field897 - field650) * var5 / 100 + field650;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field902) {
            short var8 = field902;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field685) {
                var6 = field685;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class320.method5573();
                    class320.method5583(arg0, arg1, var10, arg3, -16777216);
                    class320.method5583(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field755) {
            short var11 = field755;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field900) {
                var6 = field900;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class320.method5573();
                    class320.method5583(arg0, arg1, arg2, var13, -16777216);
                    class320.method5583(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field908 = arg3 * var6 / 334;
        if (field645 != arg2 || field765 != arg3) {
            method1043(arg2, arg3);
        }
        field658 = arg0;
        field694 = arg1;
        field645 = arg2;
        field765 = arg3;
    }

    @ObfuscatedName("jj.ge(B)V")
    public static void method4820() {
        if (Statics.field1064.field954 >> 7 == field723 && Statics.field1064.field1000 >> 7 == field876) {
            field723 = 0;
        }
    }

    @ObfuscatedName("be.gt(B)V")
    public static void method1628() {
        if (field763) {
            method1128(Statics.field1064, false);
        }
    }

    @ObfuscatedName("bk.gx(Lbk;ZB)V")
    public static void method1128(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1104() || arg0.field627) {
            return;
        }
        arg0.field625 = false;
        if ((field649 && class84.field1227 > 50 || class84.field1227 > 200) && arg1 && arg0.field973 == arg0.field945) {
            arg0.field625 = true;
        }
        int var2 = arg0.field954 >> 7;
        int var3 = arg0.field1000 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method13(0, 0, 0, false, arg0.field629);
        if (arg0.field620 != null && field656 >= arg0.field615 && field656 < arg0.field616) {
            arg0.field625 = false;
            arg0.field614 = method3155(arg0.field954, arg0.field1000, Statics.field600);
            arg0.field944 = field656;
            Statics.field3174.method2867(Statics.field600, arg0.field954, arg0.field1000, arg0.field614, 60, arg0, arg0.field941, var4, arg0.field609, arg0.field607, arg0.field622, arg0.field624);
            return;
        }
        if ((arg0.field954 & 0x7F) == 64 && (arg0.field1000 & 0x7F) == 64) {
            if (field742 == field741[var2][var3]) {
                return;
            }
            field741[var2][var3] = field742;
        }
        arg0.field614 = method3155(arg0.field954, arg0.field1000, Statics.field600);
        arg0.field944 = field656;
        Statics.field3174.method2890(Statics.field600, arg0.field954, arg0.field1000, arg0.field614, 60, arg0, arg0.field941, var4, arg0.field942);
    }

    @ObfuscatedName("dq.gh(ZI)V")
    public static final void method2649(boolean arg0) {
        for (int var1 = 0; var1 < field687; var1++) {
            class74 var2 = field807[field688[var1]];
            if (var2 != null && var2.method1104() && var2.field1103.field3573 == arg0 && var2.field1103.method4984()) {
                int var3 = var2.field954 >> 7;
                int var4 = var2.field1000 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field965 == 1 && (var2.field954 & 0x7F) == 64 && (var2.field1000 & 0x7F) == 64) {
                        if (field742 == field741[var3][var4]) {
                            continue;
                        }
                        field741[var3][var4] = field742;
                    }
                    long var5 = class123.method13(0, 0, 1, !var2.field1103.field3590, field688[var1]);
                    var2.field944 = field656;
                    Statics.field3174.method2890(Statics.field600, var2.field954, var2.field1000, method3155(var2.field954 + (var2.field965 * 64 - 64), var2.field1000 + (var2.field965 * 64 - 64), Statics.field600), var2.field965 * 64 - 64 + 60, var2, var2.field941, var5, var2.field942);
                }
            }
        }
    }

    @ObfuscatedName("be.gn(B)Z")
    public static boolean method1620() {
        return (field677 & 0x4) != 0;
    }

    @ObfuscatedName("d.gf(I)Z")
    public static boolean method138() {
        return (field677 & 0x1) != 0;
    }

    @ObfuscatedName("fl.gg(I)Z")
    public static boolean method3434() {
        return (field677 & 0x2) != 0;
    }

    @ObfuscatedName("ir.gu(I)Z")
    public static boolean method4399() {
        return (field677 & 0x8) != 0;
    }

    @ObfuscatedName("fw.gr(Lbk;B)Z")
    public static boolean method3217(class62 arg0) {
        if (field677 == 0) {
            return false;
        } else if (Statics.field1064 == arg0) {
            return method4399();
        } else {
            return method1620() || method138() && arg0.method1094() || method3434() && arg0.method1097();
        }
    }

    @ObfuscatedName("bh.gw(Lbc;IIIIII)V")
    public static final void method1721(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1104()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1103;
            if (var6.field3596 != null) {
                var6 = var6.method4983();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1227;
        int[] var8 = class84.field1223;
        byte var9 = 0;
        if (arg1 < var7 && field656 == arg0.field944 && method3217((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                method553(arg0, arg0.field947 + 15);
                class302 var11 = (class302) field696.get(class298.field3739);
                byte var12 = 9;
                var11.method5422(var10.field626.method5269(), field653 + arg2, field904 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field988.method3930()) {
            method553(arg0, arg0.field947 + 15);
            for (class73 var14 = (class73) arg0.field988.method3931(); var14 != null; var14 = (class73) arg0.field988.method3929()) {
                class66 var15 = var14.method1850(field656);
                if (var15 != null) {
                    class264 var16 = var14.field1098;
                    class324 var17 = var16.method4742();
                    class324 var18 = var16.method4741();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3393;
                    } else {
                        if (var16.field3394 * 2 < var18.field3880) {
                            var19 = var16.field3394;
                        }
                        var20 = var18.field3880 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field656 - var15.field1007;
                    int var24 = var15.field1003 * var20 / var16.field3393;
                    int var27;
                    if (var15.field1004 > var23) {
                        int var25 = var16.field3382 == 0 ? 0 : var23 / var16.field3382 * var16.field3382;
                        int var26 = var15.field1005 * var20 / var16.field3393;
                        var27 = (var24 - var26) * var25 / var15.field1004 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1004 + var16.field3388 - var23;
                        if (var16.field3395 >= 0) {
                            var21 = (var28 << 8) / (var16.field3388 - var16.field3395);
                        }
                    }
                    if (var15.field1003 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field653 > -1) {
                            int var34 = field653 + arg2 - (var20 >> 1);
                            int var35 = field904 + arg3 - var13;
                            class320.method5583(var34, var35, var27, 5, 65280);
                            class320.method5583(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3888;
                        var13 += var30;
                        int var31 = field653 + arg2 - (var20 >> 1);
                        int var32 = field904 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5695(var33, var32, var21);
                            class320.method5577(var33, var32, var29 + var33, var30 + var32);
                            var18.method5695(var33, var32, var21);
                        } else {
                            var17.method5689(var33, var32);
                            class320.method5577(var33, var32, var29 + var33, var30 + var32);
                            var18.method5689(var33, var32);
                        }
                        class320.method5603(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1855()) {
                    var14.method3952();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field627) {
                return;
            }
            if (var37.field630 != -1 || var37.field610 != -1) {
                method553(arg0, arg0.field947 + 15);
                if (field653 > -1) {
                    if (var37.field630 != -1) {
                        var36 += 25;
                        Statics.field636[var37.field630].method5689(field653 + arg2 - 12, field904 + arg3 - var36);
                    }
                    if (var37.field610 != -1) {
                        var36 += 25;
                        Statics.field1914[var37.field610].method5689(field653 + arg2 - 12, field904 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field664 == 10 && field666 == var8[arg1]) {
                method553(arg0, arg0.field947 + 15);
                if (field653 > -1) {
                    int var38 = Statics.field490[1].field3888 + var36;
                    Statics.field490[1].method5689(field653 + arg2 - 12, field904 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1103;
            if (var39.field3596 != null) {
                var39 = var39.method4983();
            }
            if (var39.field3593 >= 0 && var39.field3593 < Statics.field1914.length) {
                method553(arg0, arg0.field947 + 15);
                if (field653 > -1) {
                    Statics.field1914[var39.field3593].method5689(field653 + arg2 - 12, field904 + arg3 - 30);
                }
            }
            if (field664 == 1 && field665 == field688[arg1 - var7] && field656 % 20 < 10) {
                method553(arg0, arg0.field947 + 15);
                if (field653 > -1) {
                    Statics.field490[0].method5689(field653 + arg2 - 12, field904 + arg3 - 28);
                }
            }
        }
        if (arg0.field969 != null && (arg1 >= var7 || !arg0.field955 && (field731 == 4 || !arg0.field959 && (field731 == 0 || field731 == 3 || field731 == 1 && ((class62) arg0).method1094())))) {
            method553(arg0, arg0.field947);
            if (field653 > -1 && field913 < field732) {
                field758[field913] = Statics.field2067.method5343(arg0.field969) / 2;
                field739[field913] = Statics.field2067.field3766;
                field733[field913] = field653;
                field734[field913] = field904;
                field737[field913] = arg0.field957;
                field738[field913] = arg0.field975;
                field819[field913] = arg0.field982;
                field740[field913] = arg0.field969;
                field913++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field962[var40];
            int var42 = arg0.field993[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field656) {
                    continue;
                }
                var43 = class270.method4179(arg0.field993[var40]);
                var44 = var43.field3429;
                if (var43 != null && var43.field3444 != null) {
                    var43 = var43.method4860();
                    if (var43 == null) {
                        arg0.field962[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field963[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method4179(var45);
                if (var46 != null && var46.field3444 != null) {
                    var46 = var46.method4860();
                }
            }
            if (var41 - var44 <= field656) {
                if (var43 == null) {
                    arg0.field962[var40] = -1;
                } else {
                    method553(arg0, arg0.field947 / 2);
                    if (field653 > -1) {
                        if (var40 == 1) {
                            field904 -= 20;
                        }
                        if (var40 == 2) {
                            field653 -= 15;
                            field904 -= 10;
                        }
                        if (var40 == 3) {
                            field653 += 15;
                            field904 -= 10;
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
                        class324 var72 = var43.method4858();
                        if (var72 != null) {
                            var51 = var72.field3880;
                            int var73 = var72.field3888;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3882;
                        }
                        class324 var74 = var43.method4828();
                        if (var74 != null) {
                            var52 = var74.field3880;
                            int var75 = var74.field3888;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3882;
                        }
                        class324 var76 = var43.method4835();
                        if (var76 != null) {
                            var53 = var76.field3880;
                            int var77 = var76.field3888;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3882;
                        }
                        class324 var78 = var43.method4833();
                        if (var78 != null) {
                            var54 = var78.field3880;
                            int var79 = var78.field3888;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3882;
                        }
                        if (var46 != null) {
                            var59 = var46.method4858();
                            if (var59 != null) {
                                var63 = var59.field3880;
                                int var80 = var59.field3888;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3882;
                            }
                            var60 = var46.method4828();
                            if (var60 != null) {
                                var64 = var60.field3880;
                                int var81 = var60.field3888;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3882;
                            }
                            var61 = var46.method4835();
                            if (var61 != null) {
                                var65 = var61.field3880;
                                int var82 = var61.field3888;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3882;
                            }
                            var62 = var46.method4833();
                            if (var62 != null) {
                                var66 = var62.field3880;
                                int var83 = var62.field3888;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3882;
                            }
                        }
                        class301 var84 = var43.method4849();
                        if (var84 == null) {
                            var84 = Statics.field176;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field176;
                        } else {
                            var85 = var46.method4849();
                            if (var85 == null) {
                                var85 = Statics.field176;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4844(arg0.field961[var40]);
                        int var91 = var84.method5343(var90);
                        if (var46 != null) {
                            var87 = var46.method4844(arg0.field964[var40]);
                            var89 = var85.method5343(var87);
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
                        int var108 = arg0.field962[var40] - field656;
                        int var109 = var43.field3442 - var43.field3442 * var108 / var43.field3429;
                        int var110 = var43.field3432 * var108 / var43.field3429 + -var43.field3432;
                        int var111 = field653 + arg2 - (var100 >> 1) + var109;
                        int var112 = field904 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3447 + var112 + 15;
                        int var116 = var115 - var84.field3767;
                        int var117 = var84.field3768 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3447 + var112 + 15;
                            int var119 = var118 - var85.field3767;
                            int var120 = var85.field3768 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3443 >= 0) {
                            var123 = (var108 << 8) / (var43.field3429 - var43.field3443);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5695(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5695(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5695(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5695(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5407(var90, var98 + var111, var115, var43.field3436, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5695(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5695(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5695(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5695(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5407(var87, var106 + var111, var118, var46.field3436, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5689(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5689(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5689(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5689(var101 + var111 - var58, var112);
                            }
                            var84.method5390(var90, var98 + var111, var115, var43.field3436 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5689(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5689(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5689(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5689(var105 + var111 - var70, var112);
                                }
                                var85.method5390(var87, var106 + var111, var118, var46.field3436 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.gm(IIIII)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3) {
        field681 = 0;
        int var4 = (Statics.field1064.field954 >> 7) + Statics.field491;
        int var5 = (Statics.field1064.field1000 >> 7) + Statics.field92;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field681 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field681 = 1;
        }
        if (field681 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field681 = 0;
        }
    }

    @ObfuscatedName("aj.gv(Lbc;II)V")
    public static final void method553(class65 arg0, int arg1) {
        method3224(arg0.field954, arg0.field1000, arg1);
    }

    @ObfuscatedName("fw.gz(IIII)V")
    public static final void method3224(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field653 = -1;
            field904 = -1;
            return;
        }
        int var3 = method3155(arg0, arg1, Statics.field600) - arg2;
        int var4 = arg0 - Statics.field2037;
        int var5 = var3 - Statics.field2410;
        int var6 = arg1 - Statics.field509;
        int var7 = class125.field1748[Statics.field577];
        int var8 = class125.field1755[Statics.field577];
        int var9 = class125.field1748[Statics.field144];
        int var10 = class125.field1755[Statics.field144];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field653 = field908 * var11 / var15 + field645 / 2;
            field904 = field908 * var14 / var15 + field765 / 2;
        } else {
            field653 = -1;
            field904 = -1;
        }
    }

    @ObfuscatedName("eo.gq(IIIB)I")
    public static final int method3155(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field493[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field507[var5][var3][var4] + class51.field507[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field507[var5][var3][var4 + 1] + class51.field507[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("m.gb(ZLge;I)V")
    public static final void method121(boolean arg0, class192 arg1) {
        field703 = arg0;
        if (!field703) {
            int var2 = arg1.method3488();
            int var3 = arg1.method3504();
            int var4 = arg1.method3467();
            Statics.field3248 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3248[var5][var6] = arg1.method3588();
                }
            }
            Statics.field368 = new int[var4];
            Statics.field2533 = new int[var4];
            Statics.field296 = new int[var4];
            Statics.field2459 = new byte[var4][];
            Statics.field1488 = new byte[var4][];
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
                        Statics.field368[var8] = var11;
                        Statics.field2533[var8] = Statics.field4018.method4432("m" + var9 + "_" + var10);
                        Statics.field296[var8] = Statics.field4018.method4432("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3203(var3, var2, true);
            return;
        }
        int var12 = arg1.method3504();
        int var13 = arg1.method3488();
        boolean var14 = arg1.method3679() == 1;
        int var15 = arg1.method3467();
        arg1.method3737();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3733(1);
                    if (var19 == 1) {
                        field704[var16][var17][var18] = arg1.method3733(26);
                    } else {
                        field704[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3734();
        Statics.field3248 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field3248[var20][var21] = arg1.method3588();
            }
        }
        Statics.field368 = new int[var15];
        Statics.field2533 = new int[var15];
        Statics.field296 = new int[var15];
        Statics.field2459 = new byte[var15][];
        Statics.field1488 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field704[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field368[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field368[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2533[var22] = Statics.field4018.method4432("m" + var31 + "_" + var32);
                            Statics.field296[var22] = Statics.field4018.method4432("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3203(var13, var12, !var14);
    }

    @ObfuscatedName("ff.gy(IIZB)V")
    public static final void method3203(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1728 == arg0 && Statics.field2076 == arg1) {
            return;
        }
        Statics.field1728 = arg0;
        Statics.field2076 = arg1;
        method203(25);
        method1053(class240.field3029, true);
        int var3 = Statics.field491;
        int var4 = Statics.field92;
        Statics.field491 = (arg0 - 6) * 8;
        Statics.field92 = (arg1 - 6) * 8;
        int var5 = Statics.field491 - var3;
        int var6 = Statics.field92 - var4;
        int var7 = Statics.field491;
        int var8 = Statics.field92;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field807[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field995[var11] -= var5;
                    var10.field953[var11] -= var6;
                }
                var10.field954 -= var5 * 128;
                var10.field1000 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field699[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field995[var14] -= var5;
                    var13.field953[var14] -= var6;
                }
                var13.field954 -= var5 * 128;
                var13.field1000 -= var6 * 128;
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
                        field830[var25][var21][var22] = field830[var25][var23][var24];
                    } else {
                        field830[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field689.method3979(); var26 != null; var26 = (class64) field689.method3964()) {
            var26.field923 -= var5;
            var26.field926 -= var6;
            if (var26.field923 < 0 || var26.field926 < 0 || var26.field923 >= 104 || var26.field926 >= 104) {
                var26.method3952();
            }
        }
        if (field723 != 0) {
            field723 -= var5;
            field876 -= var6;
        }
        field906 = 0;
        field890 = false;
        Statics.field2037 -= var5 << 7;
        Statics.field509 -= var6 << 7;
        Statics.field69 -= var5 << 7;
        Statics.field71 -= var6 << 7;
        field662 = -1;
        field712.method3956();
        field774.method3956();
        for (int var27 = 0; var27 < 4; var27++) {
            field702[var27].method3312();
        }
    }

    @ObfuscatedName("bo.gi(ZI)V")
    public static final void method1865(boolean arg0) {
        method3257();
        field691.field1289++;
        if (field691.field1289 < 50 && !arg0) {
            return;
        }
        field691.field1289 = 0;
        if (field693 || field691.method2059() == null) {
            return;
        }
        class175 var1 = class175.method3035(class172.field2225, field691.field1283);
        field691.method2060(var1);
        try {
            field691.method2054();
        } catch (IOException var3) {
            field693 = true;
        }
    }

    @ObfuscatedName("em.hy(IIIIII)V")
    public static final void method3045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3174.method2881(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3174.method2885(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class123.method225(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field30.field3890;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class123.method1031(var5);
            class271 var14 = class271.method4591(var13);
            if (var14.field3467 == -1) {
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
                class323 var15 = Statics.field3643[var14.field3467];
                if (var15 != null) {
                    int var16 = (var14.field3502 * 4 - var15.field3873) / 2;
                    int var17 = (var14.field3476 * 4 - var15.field3874) / 2;
                    var15.method5668(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3476) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3174.method2883(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3174.method2885(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class123.method1031(var18);
            class271 var24 = class271.method4591(var23);
            if (var24.field3467 != -1) {
                class323 var25 = Statics.field3643[var24.field3467];
                if (var25 != null) {
                    int var26 = (var24.field3502 * 4 - var25.field3873) / 2;
                    int var27 = (var24.field3476 * 4 - var25.field3874) / 2;
                    var25.method5668(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3476) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class123.method225(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field30.field3890;
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
        long var31 = Statics.field3174.method2980(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class123.method1031(var31);
        class271 var34 = class271.method4591(var33);
        if (var34.field3467 == -1) {
            return;
        }
        class323 var35 = Statics.field3643[var34.field3467];
        if (var35 != null) {
            int var36 = (var34.field3502 * 4 - var35.field3873) / 2;
            int var37 = (var34.field3476 * 4 - var35.field3874) / 2;
            var35.method5668(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3476) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hc(Lcf;I)Z")
    public final boolean method1165(class90 arg0) {
        class160 var2 = arg0.method2059();
        class192 var3 = arg0.field1284;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1281 == null) {
                if (arg0.field1287) {
                    if (!var2.method3237(1)) {
                        return false;
                    }
                    var2.method3228(arg0.field1284.field2405, 0, 1);
                    arg0.field1288 = 0;
                    arg0.field1287 = false;
                }
                var3.field2406 = 0;
                if (var3.method3729()) {
                    if (!var2.method3237(1)) {
                        return false;
                    }
                    var2.method3228(arg0.field1284.field2405, 1, 1);
                    arg0.field1288 = 0;
                }
                arg0.field1287 = true;
                class171[] var4 = class171.method1554();
                int var5 = var3.method3730();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2406);
                }
                arg0.field1281 = var4[var5];
                arg0.field1286 = arg0.field1281.field2152;
            }
            if (arg0.field1286 == -1) {
                if (!var2.method3237(1)) {
                    return false;
                }
                arg0.method2059().method3228(var3.field2405, 0, 1);
                arg0.field1286 = var3.field2405[0] & 0xFF;
            }
            if (arg0.field1286 == -2) {
                if (!var2.method3237(2)) {
                    return false;
                }
                arg0.method2059().method3228(var3.field2405, 0, 2);
                var3.field2406 = 0;
                arg0.field1286 = var3.method3467();
            }
            if (!var2.method3237(arg0.field1286)) {
                return false;
            }
            var3.field2406 = 0;
            var2.method3228(var3.field2405, 0, arg0.field1286);
            arg0.field1288 = 0;
            field905.method5103();
            arg0.field1279 = arg0.field1285;
            arg0.field1285 = arg0.field1296;
            arg0.field1296 = arg0.field1281;
            if (class171.field2179 == arg0.field1281) {
                method121(false, arg0.field1284);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1281) {
                method1869();
                arg0.field1281 = null;
                return false;
            }
            if (class171.field2178 == arg0.field1281) {
                method12();
                field811 = var3.method3679();
                field686 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2189 == arg0.field1281) {
                method12();
                field852 = var3.method3510();
                field686 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2197 == arg0.field1281) {
                int var6 = var3.method3588();
                int var7 = var3.method3467();
                if (var6 < -70000) {
                    var7 += 32768;
                }
                class233 var8;
                if (var6 >= 0) {
                    var8 = class233.method214(var6);
                } else {
                    var8 = null;
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < var8.field2763.length; var9++) {
                        var8.field2763[var9] = 0;
                        var8.field2793[var9] = 0;
                    }
                }
                class55.method1847(var7);
                int var10 = var3.method3467();
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = var3.method3467();
                    int var13 = var3.method3679();
                    if (var13 == 255) {
                        var13 = var3.method3468();
                    }
                    if (var8 != null && var11 < var8.field2763.length) {
                        var8.field2763[var11] = var12;
                        var8.field2793[var11] = var13;
                    }
                    class55.method473(var7, var11, var12 - 1, var13);
                }
                if (var8 != null) {
                    method642(var8);
                }
                method12();
                field832[++field833 - 1 & 0x1F] = var7 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1281) {
                int var14 = var3.method3468();
                int var15 = var3.method3488();
                class233 var16 = class233.method214(var14);
                if (var16.field2741 != 1 || var16.field2756 != var15) {
                    var16.field2741 = 1;
                    var16.field2756 = var15;
                    method642(var16);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1281) {
                int var17 = var3.method3588();
                String var18 = var3.method3474();
                class233 var19 = class233.method214(var17);
                if (!var18.equals(var19.field2729)) {
                    var19.field2729 = var18;
                    method642(var19);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1281) {
                for (int var20 = 0; var20 < field699.length; var20++) {
                    if (field699[var20] != null) {
                        field699[var20].field972 = -1;
                    }
                }
                for (int var21 = 0; var21 < field807.length; var21++) {
                    if (field807[var21] != null) {
                        field807[var21].field972 = -1;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2183 == arg0.field1281) {
                int var22 = var3.method3467();
                int var23 = var3.method3679();
                int var24 = var3.method3467();
                method634(var22, var23, var24);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1281) {
                method3255(class174.field2322);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2126 == arg0.field1281) {
                method3255(class174.field2320);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2202 == arg0.field1281) {
                Statics.method1641(var3, arg0.field1286);
                method183();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2165 == arg0.field1281) {
                class67 var25 = new class67();
                var25.field1020 = var3.method3474();
                var25.field1016 = var3.method3467();
                int var26 = var3.method3588();
                var25.field1009 = var26;
                method203(45);
                var2.method3230();
                Object var27 = null;
                class80.method3068(var25);
                arg0.field1281 = null;
                return false;
            }
            if (class171.field2162 == arg0.field1281) {
                int var28 = var3.method3588();
                int var29 = var3.method3467();
                if (var28 < -70000) {
                    var29 += 32768;
                }
                class233 var30;
                if (var28 >= 0) {
                    var30 = class233.method214(var28);
                } else {
                    var30 = null;
                }
                while (var3.field2406 < arg0.field1286) {
                    int var31 = var3.method3479();
                    int var32 = var3.method3467();
                    int var33 = 0;
                    if (var32 != 0) {
                        var33 = var3.method3679();
                        if (var33 == 255) {
                            var33 = var3.method3588();
                        }
                    }
                    if (var30 != null && var31 >= 0 && var31 < var30.field2763.length) {
                        var30.field2763[var31] = var32;
                        var30.field2793[var31] = var33;
                    }
                    class55.method473(var29, var31, var32 - 1, var33);
                }
                if (var30 != null) {
                    method642(var30);
                }
                method12();
                field832[++field833 - 1 & 0x1F] = var29 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2173 == arg0.field1281) {
                Statics.field2434 = var3.method3495();
                Statics.field1101 = var3.method3587();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1281) {
                int var34 = var3.method3503();
                class55.method536(var34);
                field832[++field833 - 1 & 0x1F] = var34 & 0x7FFF;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1281) {
                var3.field2406 += 28;
                if (var3.method3482()) {
                    method2033(var3, var3.field2406 - 28);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1281) {
                int var35 = var3.method3488();
                if (var35 == 65535) {
                    var35 = -1;
                }
                method1734(var35);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1281) {
                int var36 = var3.method3508();
                int var37 = var3.method3504();
                if (var37 == 65535) {
                    var37 = -1;
                }
                method4592(var37, var36);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2177 == arg0.field1281) {
                int var38 = var3.method3660();
                int var39 = var3.method3507();
                int var40 = var3.method3506();
                class233 var41 = class233.method214(var38);
                if (var41.field2677 != var40 || var41.field2752 != var39 || var41.field2673 != 0 || var41.field2674 != 0) {
                    var41.field2677 = var40;
                    var41.field2752 = var39;
                    var41.field2673 = 0;
                    var41.field2674 = 0;
                    method642(var41);
                    this.method1478(var41);
                    if (var41.field2809 == 0) {
                        method4245(Statics.field1952[var38 >> 16], var41, false);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1281) {
                for (int var42 = 0; var42 < Statics.field3303; var42++) {
                    class257 var43 = class257.method3104(var42);
                    if (var43 != null) {
                        class228.field2631[var42] = 0;
                        class228.field2630[var42] = 0;
                    }
                }
                method12();
                field831 += 32;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1281) {
                Statics.field2151.field1042.method5160(var3, arg0.field1286);
                method21();
                field837 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1281) {
                Statics.field1101 = var3.method3587();
                Statics.field2434 = var3.method3495();
                while (var3.field2406 < arg0.field1286) {
                    int var44 = var3.method3679();
                    class174 var45 = class174.method1626()[var44];
                    method3255(var45);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2191 == arg0.field1281) {
                if (field804 != -1) {
                    method548(field804, 0);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1281) {
                class319.method142(var3, arg0.field1286);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1281) {
                int var46 = var3.method3510();
                int var47 = var3.method3468();
                class233 var48 = class233.method214(var47);
                if (var48.field2715 != var46 || var46 == -1) {
                    var48.field2715 = var46;
                    var48.field2796 = 0;
                    var48.field2751 = 0;
                    method642(var48);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2182 == arg0.field1281) {
                boolean var49 = var3.method3679() == 1;
                if (var49) {
                    Statics.field1512 = class187.method2664() - var3.method3471();
                    Statics.field591 = new class2(var3, true);
                } else {
                    Statics.field591 = null;
                }
                field840 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2193 == arg0.field1281) {
                field890 = true;
                Statics.field267 = var3.method3679();
                Statics.field2362 = var3.method3679();
                Statics.field1927 = var3.method3467();
                Statics.field2207 = var3.method3679();
                Statics.field315 = var3.method3679();
                if (Statics.field315 >= 100) {
                    Statics.field2037 = Statics.field267 * 128 + 64;
                    Statics.field509 = Statics.field2362 * 128 + 64;
                    Statics.field2410 = method3155(Statics.field2037, Statics.field509, Statics.field600) - Statics.field1927;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2195 == arg0.field1281) {
                method3255(class174.field2321);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2176 == arg0.field1281) {
                method1003(false, var3);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2204 == arg0.field1281) {
                method3255(class174.field2319);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1281) {
                int var50 = var3.method3588();
                int var51 = var3.method3588();
                class57 var52 = (class57) field805.method3905((long) var51);
                class57 var53 = (class57) field805.method3905((long) var50);
                if (var53 != null) {
                    method68(var53, var52 == null || var52.field557 != var53.field557);
                }
                if (var52 != null) {
                    var52.method3952();
                    field805.method3907(var52, (long) var50);
                }
                class233 var54 = class233.method214(var51);
                if (var54 != null) {
                    method642(var54);
                }
                class233 var55 = class233.method214(var50);
                if (var55 != null) {
                    method642(var55);
                    method4245(Statics.field1952[var55.field2771 >>> 16], var55, true);
                }
                if (field804 != -1) {
                    method548(field804, 1);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1281) {
                int var56 = var3.method3679();
                method453(var56);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1281) {
                field664 = var3.method3679();
                if (field664 == 1) {
                    field665 = var3.method3467();
                }
                if (field664 >= 2 && field664 <= 6) {
                    if (field664 == 2) {
                        field670 = 64;
                        field756 = 64;
                    }
                    if (field664 == 3) {
                        field670 = 0;
                        field756 = 64;
                    }
                    if (field664 == 4) {
                        field670 = 128;
                        field756 = 64;
                    }
                    if (field664 == 5) {
                        field670 = 64;
                        field756 = 0;
                    }
                    if (field664 == 6) {
                        field670 = 64;
                        field756 = 128;
                    }
                    field664 = 2;
                    field667 = var3.method3467();
                    field668 = var3.method3467();
                    field669 = var3.method3679();
                }
                if (field664 == 10) {
                    field666 = var3.method3467();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2185 == arg0.field1281) {
                field723 = var3.method3679();
                if (field723 == 255) {
                    field723 = 0;
                }
                field876 = var3.method3679();
                if (field876 == 255) {
                    field876 = 0;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1281) {
                int var57 = var3.method3588();
                class57 var58 = (class57) field805.method3905((long) var57);
                if (var58 != null) {
                    method68(var58, true);
                }
                if (field881 != null) {
                    method642(field881);
                    field881 = null;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1281) {
                int var59 = var3.method3468();
                class233 var60 = class233.method214(var59);
                var60.field2741 = 3;
                var60.field2756 = Statics.field1064.field631.method4303();
                method642(var60);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1281) {
                int var61 = var3.method3467();
                int var62 = var3.method3588();
                class228.field2631[var61] = var62;
                if (class228.field2630[var61] != var62) {
                    class228.field2630[var61] = var62;
                }
                method4246(var61);
                field654[++field831 - 1 & 0x1F] = var61;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1281) {
                int var63 = var3.method3504();
                int var64 = var3.method3503();
                int var65 = var3.method3660();
                class233 var66 = class233.method214(var65);
                var66.field2724 = (var64 << 16) + var63;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1281) {
                method3255(class174.field2317);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1281) {
                int var67 = var3.method3488();
                int var68 = var3.method3468();
                class233 var69 = class233.method214(var68);
                if (var69.field2741 != 2 || var69.field2756 != var67) {
                    var69.field2741 = 2;
                    var69.field2756 = var67;
                    method642(var69);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1281) {
                int var70 = var3.method3588();
                int var71 = var3.method3467();
                if (var71 == 65535) {
                    var71 = -1;
                }
                int var72 = var3.method3468();
                class233 var73 = class233.method214(var70);
                if (var73.field2686) {
                    var73.field2794 = var71;
                    var73.field2795 = var72;
                    class272 var75 = class272.method1995(var71);
                    var73.field2733 = var75.field3525;
                    var73.field2720 = var75.field3520;
                    var73.field2721 = var75.field3521;
                    var73.field2719 = var75.field3522;
                    var73.field2718 = var75.field3523;
                    var73.field2722 = var75.field3518;
                    if (var75.field3524 == 1) {
                        var73.field2798 = 1;
                    } else {
                        var73.field2798 = 2;
                    }
                    if (var73.field2723 > 0) {
                        var73.field2722 = var73.field2722 * 32 / var73.field2723;
                    } else if (var73.field2679 > 0) {
                        var73.field2722 = var73.field2722 * 32 / var73.field2679;
                    }
                    method642(var73);
                } else if (var71 == -1) {
                    var73.field2741 = 0;
                    arg0.field1281 = null;
                    return true;
                } else {
                    class272 var74 = class272.method1995(var71);
                    var73.field2741 = 4;
                    var73.field2756 = var71;
                    var73.field2733 = var74.field3525;
                    var73.field2720 = var74.field3520;
                    var73.field2722 = var74.field3518 * 100 / var72;
                    method642(var73);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2188 == arg0.field1281) {
                int var76 = var3.method3479();
                boolean var77 = var3.method3679() == 1;
                String var78 = "";
                boolean var79 = false;
                if (var77) {
                    var78 = var3.method3474();
                    if (Statics.field2151.method1696(new class294(var78, Statics.field921))) {
                        var79 = true;
                    }
                }
                String var80 = var3.method3474();
                if (!var79) {
                    class86.method1084(var76, var78, var80);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1281) {
                field890 = true;
                Statics.field1028 = var3.method3679();
                Statics.field1940 = var3.method3679();
                Statics.field209 = var3.method3467();
                Statics.field1027 = var3.method3679();
                Statics.field3290 = var3.method3679();
                if (Statics.field3290 >= 100) {
                    int var81 = Statics.field1028 * 128 + 64;
                    int var82 = Statics.field1940 * 128 + 64;
                    int var83 = method3155(var81, var82, Statics.field600) - Statics.field209;
                    int var84 = var81 - Statics.field2037;
                    int var85 = var83 - Statics.field2410;
                    int var86 = var82 - Statics.field509;
                    int var87 = (int) Math.sqrt((double) (var84 * var84 + var86 * var86));
                    Statics.field577 = (int) (Math.atan2((double) var85, (double) var87) * 325.949D) & 0x7FF;
                    Statics.field144 = (int) (Math.atan2((double) var84, (double) var86) * -325.949D) & 0x7FF;
                    if (Statics.field577 < 128) {
                        Statics.field577 = 128;
                    }
                    if (Statics.field577 > 383) {
                        Statics.field577 = 383;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1281) {
                int var88 = var3.method3468();
                int var89 = var3.method3488();
                class233 var90 = class233.method214(var88);
                if (var90 != null && var90.field2809 == 0) {
                    if (var89 > var90.field2692 - var90.field2684) {
                        var89 = var90.field2692 - var90.field2684;
                    }
                    if (var89 < 0) {
                        var89 = 0;
                    }
                    if (var90.field2690 != var89) {
                        var90.field2690 = var89;
                        method642(var90);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2180 == arg0.field1281) {
                String var91 = var3.method3474();
                Object[] var92 = new Object[var91.length() + 1];
                for (int var93 = var91.length() - 1; var93 >= 0; var93--) {
                    if (var91.charAt(var93) == 's') {
                        var92[var93 + 1] = var3.method3474();
                    } else {
                        var92[var93 + 1] = Integer.valueOf(var3.method3588());
                    }
                }
                var92[0] = Integer.valueOf(var3.method3588());
                class58 var94 = new class58();
                var94.field576 = var92;
                class71.method997(var94);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2200 == arg0.field1281) {
                int var95 = var3.method3660();
                class233 var96 = class233.method214(var95);
                for (int var97 = 0; var97 < var96.field2763.length; var97++) {
                    var96.field2763[var97] = -1;
                    var96.field2763[var97] = 0;
                }
                method642(var96);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2198 == arg0.field1281) {
                field862 = var3.method3495();
                field731 = var3.method3495();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1281) {
                int var98 = var3.method3488();
                int var99 = var3.method3488();
                int var100 = var3.method3488();
                int var101 = var3.method3468();
                class233 var102 = class233.method214(var101);
                if (var102.field2733 != var98 || var102.field2720 != var100 || var102.field2722 != var99) {
                    var102.field2733 = var98;
                    var102.field2720 = var100;
                    var102.field2722 = var99;
                    method642(var102);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1281) {
                method3255(class174.field2326);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2192 == arg0.field1281) {
                field877 = var3.method3679();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1281) {
                int var103 = var3.method3660();
                int var104 = var3.method3504();
                int var105 = var104 >> 10 & 0x1F;
                int var106 = var104 >> 5 & 0x1F;
                int var107 = var104 & 0x1F;
                int var108 = (var107 << 3) + (var105 << 19) + (var106 << 11);
                class233 var109 = class233.method214(var103);
                if (var109.field2687 != var108) {
                    var109.field2687 = var108;
                    method642(var109);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1281) {
                int var110 = arg0.field1286 + var3.field2406;
                int var111 = var3.method3467();
                int var112 = var3.method3467();
                if (field804 != var111) {
                    field804 = var111;
                    this.method1169(false);
                    method3259(field804);
                    class71.method461(field804);
                    for (int var113 = 0; var113 < 100; var113++) {
                        field849[var113] = true;
                    }
                }
                while (var112-- > 0) {
                    int var114 = var3.method3588();
                    int var115 = var3.method3467();
                    int var116 = var3.method3679();
                    class57 var117 = (class57) field805.method3905((long) var114);
                    if (var117 != null && var117.field557 != var115) {
                        method68(var117, true);
                        var117 = null;
                    }
                    if (var117 == null) {
                        var117 = Statics.method210(var114, var115, var116);
                    }
                    var117.field556 = true;
                }
                for (class57 var118 = (class57) field805.method3916(); var118 != null; var118 = (class57) field805.method3910()) {
                    if (var118.field556) {
                        var118.field556 = false;
                    } else {
                        method68(var118, true);
                    }
                }
                field801 = new class205(512);
                while (var3.field2406 < var110) {
                    int var119 = var3.method3588();
                    int var120 = var3.method3467();
                    int var121 = var3.method3467();
                    int var122 = var3.method3588();
                    for (int var123 = var120; var123 <= var121; var123++) {
                        long var124 = ((long) var119 << 32) + (long) var123;
                        field801.method3907(new class214(var122), var124);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2120 == arg0.field1281) {
                field890 = false;
                for (int var126 = 0; var126 < 5; var126++) {
                    field891[var126] = false;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2119 == arg0.field1281) {
                method3255(class174.field2318);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2205 == arg0.field1281) {
                int var127 = var3.method3488();
                field804 = var127;
                this.method1169(false);
                method3259(var127);
                class71.method461(field804);
                for (int var128 = 0; var128 < 100; var128++) {
                    field849[var128] = true;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2163 == arg0.field1281) {
                if (Statics.field27 != null) {
                    Statics.field27.method5299(var3);
                }
                method681();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1281) {
                method12();
                int var129 = var3.method3512();
                int var130 = var3.method3495();
                int var131 = var3.method3679();
                field778[var130] = var129;
                field776[var130] = var131;
                field777[var130] = 1;
                for (int var132 = 0; var132 < 98; var132++) {
                    if (var129 >= class237.field2845[var132]) {
                        field777[var130] = var132 + 2;
                    }
                }
                field775[++field835 - 1 & 0x1F] = var130;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2201 == arg0.field1281) {
                method5079(var3.method3474());
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1281) {
                if (arg0.field1286 == 0) {
                    Statics.field27 = null;
                } else {
                    if (Statics.field27 == null) {
                        Statics.field27 = new class296(Statics.field921, Statics.field2038);
                    }
                    Statics.field27.method5298(var3);
                }
                method681();
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1281) {
                byte[] var133 = new byte[arg0.field1286];
                var3.method3739(var133, 0, var133.length);
                class185 var134 = new class185(var133);
                String var135 = var134.method3474();
                class46.method3067(var135, true, false);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2161 == arg0.field1281) {
                int var136 = var3.method3679();
                if (var3.method3679() == 0) {
                    field896[var136] = new class5();
                    var3.field2406 += 18;
                } else {
                    var3.field2406--;
                    field896[var136] = new class5(var3, false);
                }
                field859 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2147 == arg0.field1281) {
                Statics.field2151.method1697();
                field837 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2128 == arg0.field1281) {
                String var137 = var3.method3474();
                long var138 = (long) var3.method3467();
                long var140 = (long) var3.method3469();
                class245 var142 = (class245) class180.method712(class245.method81(), var3.method3679());
                long var143 = (var138 << 32) + var140;
                boolean var145 = false;
                for (int var146 = 0; var146 < 100; var146++) {
                    if (field841[var146] == var143) {
                        var145 = true;
                        break;
                    }
                }
                if (Statics.field2151.method1696(new class294(var137, Statics.field921))) {
                    var145 = true;
                }
                if (!var145 && field681 == 0) {
                    field841[field865] = var143;
                    field865 = (field865 + 1) % 100;
                    String var147 = class302.method5347(class308.method4407(class303.method313(var3)));
                    byte var148;
                    if (var142.field3189) {
                        var148 = 7;
                    } else {
                        var148 = 3;
                    }
                    if (var142.field3186 == -1) {
                        class86.method1084(var148, var137, var147);
                    } else {
                        class86.method1084(var148, class76.method224(var142.field3186) + var137, var147);
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1281) {
                String var149 = var3.method3474();
                long var150 = var3.method3471();
                long var152 = (long) var3.method3467();
                long var154 = (long) var3.method3469();
                class245 var156 = (class245) class180.method712(class245.method81(), var3.method3679());
                long var157 = (var152 << 32) + var154;
                boolean var159 = false;
                for (int var160 = 0; var160 < 100; var160++) {
                    if (field841[var160] == var157) {
                        var159 = true;
                        break;
                    }
                }
                if (var156.field3191 && Statics.field2151.method1696(new class294(var149, Statics.field921))) {
                    var159 = true;
                }
                if (!var159 && field681 == 0) {
                    field841[field865] = var157;
                    field865 = (field865 + 1) % 100;
                    String var161 = class302.method5347(class308.method4407(class303.method313(var3)));
                    if (var156.field3186 == -1) {
                        class86.method105(9, var149, var161, class306.method4630(var150));
                    } else {
                        class86.method105(9, class76.method224(var156.field3186) + var149, var161, class306.method4630(var150));
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1281) {
                String var162 = var3.method3474();
                String var163 = class302.method5347(class308.method4407(class303.method313(var3)));
                class86.method1084(6, var162, var163);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1281) {
                for (int var164 = 0; var164 < class228.field2630.length; var164++) {
                    if (class228.field2631[var164] != class228.field2630[var164]) {
                        class228.field2630[var164] = class228.field2631[var164];
                        method4246(var164);
                        field654[++field831 - 1 & 0x1F] = var164;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1281) {
                int var165 = var3.method3588();
                if (field660 != var165) {
                    field660 = var165;
                    method140();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1281) {
                boolean var166 = var3.method3472();
                if (!var166) {
                    Statics.field1934 = null;
                } else if (Statics.field1934 == null) {
                    Statics.field1934 = new class254();
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2187 == arg0.field1281) {
                int var167 = var3.method3588();
                int var168 = var3.method3588();
                int var169 = class48.method3391();
                class175 var170 = class175.method3035(class172.field2219, field691.field1283);
                var170.field2333.method3492(var169);
                var170.field2333.method3501(field435);
                var170.field2333.method3589(var167);
                var170.field2333.method3509(var168);
                field691.method2060(var170);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2184 == arg0.field1281) {
                int var171 = var3.method3579();
                int var172 = var3.method3579();
                String var173 = var3.method3474();
                if (var172 >= 1 && var172 <= 8) {
                    if (var173.equalsIgnoreCase(class240.field2863)) {
                        var173 = null;
                    }
                    field768[var172 - 1] = var173;
                    field769[var172 - 1] = var171 == 0;
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2181 == arg0.field1281) {
                byte var174 = var3.method3664();
                int var175 = var3.method3504();
                class228.field2631[var175] = var174;
                if (class228.field2630[var175] != var174) {
                    class228.field2630[var175] = var174;
                }
                method4246(var175);
                field654[++field831 - 1 & 0x1F] = var175;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2194 == arg0.field1281) {
                Statics.field2151.method1646(var3, arg0.field1286);
                field837 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1281) {
                method3255(class174.field2324);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1281) {
                method3255(class174.field2323);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1281) {
                int var176 = var3.method3588();
                boolean var177 = var3.method3679() == 1;
                class233 var178 = class233.method214(var176);
                if (var178.field2705 != var177) {
                    var178.field2705 = var177;
                    method642(var178);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1281) {
                int var179 = var3.method3579();
                int var180 = var3.method3660();
                int var181 = var3.method3488();
                class57 var182 = (class57) field805.method3905((long) var180);
                if (var182 != null) {
                    method68(var182, var182.field557 != var181);
                }
                Statics.method210(var180, var181, var179);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1281) {
                method3255(class174.field2330);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1281) {
                method121(true, arg0.field1284);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2190 == arg0.field1281) {
                field663 = var3.method3467() * 30;
                field686 = field829;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2206 == arg0.field1281) {
                int var183 = var3.method3679();
                int var184 = var3.method3679();
                int var185 = var3.method3679();
                int var186 = var3.method3679();
                field891[var183] = true;
                field892[var183] = var184;
                field893[var183] = var185;
                field894[var183] = var186;
                field895[var183] = 0;
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1281) {
                method1003(true, var3);
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2186 == arg0.field1281) {
                Statics.field3614 = class310.method981(var3.method3679());
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2196 == arg0.field1281) {
                int var187 = var3.method3512();
                int var188 = var3.method3504();
                if (var188 == 65535) {
                    var188 = -1;
                }
                int var189 = var3.method3468();
                int var190 = var3.method3467();
                if (var190 == 65535) {
                    var190 = -1;
                }
                for (int var191 = var190; var191 <= var188; var191++) {
                    long var192 = ((long) var189 << 32) + (long) var191;
                    class207 var194 = field801.method3905(var192);
                    if (var194 != null) {
                        var194.method3952();
                    }
                    field801.method3907(new class214(var187), var192);
                }
                arg0.field1281 = null;
                return true;
            }
            if (class171.field2199 == arg0.field1281) {
                Statics.field1101 = var3.method3495();
                Statics.field2434 = var3.method3679();
                for (int var195 = Statics.field2434; var195 < Statics.field2434 + 8; var195++) {
                    for (int var196 = Statics.field1101; var196 < Statics.field1101 + 8; var196++) {
                        if (field830[Statics.field600][var195][var196] != null) {
                            field830[Statics.field600][var195][var196] = null;
                            method4409(var195, var196);
                        }
                    }
                }
                for (class64 var197 = (class64) field689.method3979(); var197 != null; var197 = (class64) field689.method3964()) {
                    if (var197.field923 >= Statics.field2434 && var197.field923 < Statics.field2434 + 8 && var197.field926 >= Statics.field1101 && var197.field926 < Statics.field1101 + 8 && Statics.field600 == var197.field935) {
                        var197.field934 = 0;
                    }
                }
                arg0.field1281 = null;
                return true;
            }
            class155.method1917("" + (arg0.field1281 == null ? -1 : arg0.field1281.field2203) + class76.field1117 + (arg0.field1285 == null ? -1 : arg0.field1285.field2203) + class76.field1117 + (arg0.field1279 == null ? -1 : arg0.field1279.field2203) + class76.field1117 + arg0.field1286, (Throwable) null);
            method1869();
        } catch (IOException var202) {
            method222();
        } catch (Exception var203) {
            String var200 = "" + (arg0.field1281 == null ? -1 : arg0.field1281.field2203) + class76.field1117 + (arg0.field1285 == null ? -1 : arg0.field1285.field2203) + class76.field1117 + (arg0.field1279 == null ? -1 : arg0.field1279.field2203) + class76.field1117 + arg0.field1286 + class76.field1117 + (Statics.field491 + Statics.field1064.field995[0]) + class76.field1117 + (Statics.field92 + Statics.field1064.field953[0]) + class76.field1117;
            for (int var201 = 0; var201 < arg0.field1286 && var201 < 50; var201++) {
                var200 = var200 + var3.field2405[var201] + class76.field1117;
            }
            class155.method1917(var200, var203);
            method1869();
        }
        return true;
    }

    @ObfuscatedName("fg.hk(Lfc;B)V")
    public static final void method3255(class174 arg0) {
        class192 var1 = field691.field1284;
        if (class174.field2320 == arg0) {
            int var2 = var1.method3467();
            int var3 = var1.method3579();
            int var4 = var1.method3504();
            int var5 = var1.method3679();
            int var6 = (var5 >> 4 & 0x7) + Statics.field2434;
            int var7 = (var5 & 0x7) + Statics.field1101;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                int var8 = var6 * 128 + 64;
                int var9 = var7 * 128 + 64;
                class72 var10 = new class72(var2, Statics.field600, var8, var9, method3155(var8, var9, Statics.field600) - var3, var4, field656);
                field712.method3957(var10);
            }
        } else if (class174.field2323 == arg0) {
            int var11 = var1.method3587();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field705[var12];
            int var15 = var1.method3587();
            int var16 = (var15 >> 4 & 0x7) + Statics.field2434;
            int var17 = (var15 & 0x7) + Statics.field1101;
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                method4401(Statics.field600, var16, var17, var14, -1, var12, var13, 0, -1);
            }
        } else if (class174.field2324 == arg0) {
            int var18 = var1.method3503();
            int var19 = var1.method3488();
            int var20 = var1.method3503();
            int var21 = var1.method3579();
            int var22 = (var21 >> 4 & 0x7) + Statics.field2434;
            int var23 = (var21 & 0x7) + Statics.field1101;
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class208 var24 = field830[Statics.field600][var22][var23];
                if (var24 != null) {
                    for (class82 var25 = (class82) var24.method3979(); var25 != null; var25 = (class82) var24.method3964()) {
                        if ((var18 & 0x7FFF) == var25.field1214 && var25.field1215 == var20) {
                            var25.field1215 = var19;
                            break;
                        }
                    }
                    method4409(var22, var23);
                }
            }
        } else if (class174.field2326 == arg0) {
            int var26 = var1.method3579();
            int var27 = (var26 >> 4 & 0x7) + Statics.field2434;
            int var28 = (var26 & 0x7) + Statics.field1101;
            int var29 = var1.method3587();
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = field705[var30];
            int var33 = var1.method3504();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                method4401(Statics.field600, var27, var28, var32, var33, var30, var31, 0, -1);
            }
        } else {
            if (class174.field2322 == arg0) {
                int var34 = var1.method3679();
                int var35 = (var34 >> 4 & 0x7) + Statics.field2434;
                int var36 = (var34 & 0x7) + Statics.field1101;
                int var37 = var1.method3587();
                int var38 = var1.method3579();
                int var39 = var38 >> 4 & 0xF;
                int var40 = var38 & 0x7;
                int var41 = var1.method3488();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                    int var42 = var39 + 1;
                    if (Statics.field1064.field995[0] >= var35 - var42 && Statics.field1064.field995[0] <= var35 + var42 && Statics.field1064.field953[0] >= var36 - var42 && Statics.field1064.field953[0] <= var36 + var42 && field882 != 0 && var40 > 0 && field906 < 50) {
                        field885[field906] = var41;
                        field886[field906] = var40;
                        field794[field906] = var37;
                        field711[field906] = null;
                        field888[field906] = (var35 << 16) + (var36 << 8) + var39;
                        field906++;
                    }
                }
            }
            if (class174.field2321 == arg0) {
                int var43 = var1.method3587();
                int var44 = var43 >> 2;
                int var45 = var43 & 0x3;
                int var46 = field705[var44];
                int var47 = var1.method3495();
                int var48 = (var47 >> 4 & 0x7) + Statics.field2434;
                int var49 = (var47 & 0x7) + Statics.field1101;
                int var50 = var1.method3467();
                if (var48 >= 0 && var49 >= 0 && var48 < 103 && var49 < 103) {
                    if (var46 == 0) {
                        class131 var51 = Statics.field3174.method2905(Statics.field600, var48, var49);
                        if (var51 != null) {
                            int var52 = class123.method1031(var51.field1849);
                            if (var44 == 2) {
                                var51.field1847 = new class88(var52, 2, var45 + 4, Statics.field600, var48, var49, var50, false, var51.field1847);
                                var51.field1848 = new class88(var52, 2, var45 + 1 & 0x3, Statics.field600, var48, var49, var50, false, var51.field1848);
                            } else {
                                var51.field1847 = new class88(var52, var44, var45, Statics.field600, var48, var49, var50, false, var51.field1847);
                            }
                        }
                    }
                    if (var46 == 1) {
                        class136 var53 = Statics.field3174.method3028(Statics.field600, var48, var49);
                        if (var53 != null) {
                            int var54 = class123.method1031(var53.field1881);
                            if (var44 == 4 || var44 == 5) {
                                var53.field1888 = new class88(var54, 4, var45, Statics.field600, var48, var49, var50, false, var53.field1888);
                            } else if (var44 == 6) {
                                var53.field1888 = new class88(var54, 4, var45 + 4, Statics.field600, var48, var49, var50, false, var53.field1888);
                            } else if (var44 == 7) {
                                var53.field1888 = new class88(var54, 4, (var45 + 2 & 0x3) + 4, Statics.field600, var48, var49, var50, false, var53.field1888);
                            } else if (var44 == 8) {
                                var53.field1888 = new class88(var54, 4, var45 + 4, Statics.field600, var48, var49, var50, false, var53.field1888);
                                var53.field1889 = new class88(var54, 4, (var45 + 2 & 0x3) + 4, Statics.field600, var48, var49, var50, false, var53.field1889);
                            }
                        }
                    }
                    if (var46 == 2) {
                        class137 var55 = Statics.field3174.method2879(Statics.field600, var48, var49);
                        if (var44 == 11) {
                            var44 = 10;
                        }
                        if (var55 != null) {
                            var55.field1897 = new class88(class123.method1031(var55.field1905), var44, var45, Statics.field600, var48, var49, var50, false, var55.field1897);
                        }
                    }
                    if (var46 == 3) {
                        class118 var56 = Statics.field3174.method2915(Statics.field600, var48, var49);
                        if (var56 != null) {
                            var56.field1587 = new class88(class123.method1031(var56.field1588), 22, var45, Statics.field600, var48, var49, var50, false, var56.field1587);
                        }
                    }
                }
            } else if (class174.field2317 == arg0) {
                int var57 = var1.method3587() * 4;
                int var58 = var1.method3467();
                int var59 = var1.method3504();
                int var60 = var1.method3587() * 4;
                int var61 = var1.method3506();
                int var62 = var1.method3679();
                int var63 = var1.method3587();
                int var64 = var1.method3503();
                int var65 = var1.method3579();
                int var66 = (var65 >> 4 & 0x7) + Statics.field2434;
                int var67 = (var65 & 0x7) + Statics.field1101;
                byte var68 = var1.method3664();
                byte var69 = var1.method3498();
                int var70 = var66 + var69;
                int var71 = var67 + var68;
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var59 != 65535) {
                    int var72 = var66 * 128 + 64;
                    int var73 = var67 * 128 + 64;
                    int var74 = var70 * 128 + 64;
                    int var75 = var71 * 128 + 64;
                    class81 var76 = new class81(var59, Statics.field600, var72, var73, method3155(var72, var73, Statics.field600) - var60, field656 + var64, field656 + var58, var62, var63, var61, var57);
                    var76.method1918(var74, var75, method3155(var74, var75, Statics.field600) - var57, field656 + var64);
                    field774.method3957(var76);
                }
            } else if (class174.field2318 == arg0) {
                int var77 = var1.method3579();
                int var78 = (var77 >> 4 & 0x7) + Statics.field2434;
                int var79 = (var77 & 0x7) + Statics.field1101;
                int var80 = var1.method3488();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class208 var81 = field830[Statics.field600][var78][var79];
                    if (var81 != null) {
                        for (class82 var82 = (class82) var81.method3979(); var82 != null; var82 = (class82) var81.method3964()) {
                            if ((var80 & 0x7FFF) == var82.field1214) {
                                var82.method3952();
                                break;
                            }
                        }
                        if (var81.method3979() == null) {
                            field830[Statics.field600][var78][var79] = null;
                        }
                        method4409(var78, var79);
                    }
                }
            } else {
                if (class174.field2319 == arg0) {
                    byte var83 = var1.method3498();
                    int var84 = var1.method3488();
                    byte var85 = var1.method3498();
                    int var86 = var1.method3504();
                    int var87 = var1.method3467();
                    int var88 = var1.method3579();
                    int var89 = var88 >> 2;
                    int var90 = var88 & 0x3;
                    int var91 = field705[var89];
                    byte var92 = var1.method3664();
                    int var93 = var1.method3503();
                    byte var94 = var1.method3498();
                    int var95 = var1.method3495();
                    int var96 = (var95 >> 4 & 0x7) + Statics.field2434;
                    int var97 = (var95 & 0x7) + Statics.field1101;
                    class62 var98;
                    if (field748 == var93) {
                        var98 = Statics.field1064;
                    } else {
                        var98 = field699[var93];
                    }
                    if (var98 != null) {
                        class271 var99 = class271.method4591(var86);
                        int var100;
                        int var101;
                        if (var90 == 1 || var90 == 3) {
                            var100 = var99.field3476;
                            var101 = var99.field3502;
                        } else {
                            var100 = var99.field3502;
                            var101 = var99.field3476;
                        }
                        int var102 = (var100 >> 1) + var96;
                        int var103 = (var100 + 1 >> 1) + var96;
                        int var104 = (var101 >> 1) + var97;
                        int var105 = (var101 + 1 >> 1) + var97;
                        int[][] var106 = class51.field507[Statics.field600];
                        int var107 = var106[var102][var104] + var106[var103][var104] + var106[var102][var105] + var106[var103][var105] >> 2;
                        int var108 = (var96 << 7) + (var100 << 6);
                        int var109 = (var97 << 7) + (var101 << 6);
                        class122 var110 = var99.method4868(var89, var90, var106, var108, var107, var109);
                        if (var110 != null) {
                            method4401(Statics.field600, var96, var97, var91, -1, 0, 0, var87 + 1, var84 + 1);
                            var98.field615 = field656 + var87;
                            var98.field616 = field656 + var84;
                            var98.field620 = var110;
                            var98.field617 = var96 * 128 + var100 * 64;
                            var98.field613 = var97 * 128 + var101 * 64;
                            var98.field611 = var107;
                            if (var83 > var94) {
                                byte var111 = var83;
                                var83 = var94;
                                var94 = var111;
                            }
                            if (var92 > var85) {
                                byte var112 = var92;
                                var92 = var85;
                                var85 = var112;
                            }
                            var98.field609 = var83 + var96;
                            var98.field622 = var94 + var96;
                            var98.field607 = var92 + var97;
                            var98.field624 = var85 + var97;
                        }
                    }
                }
                if (class174.field2330 == arg0) {
                    int var113 = var1.method3504();
                    int var114 = var1.method3488();
                    int var115 = var1.method3579();
                    int var116 = (var115 >> 4 & 0x7) + Statics.field2434;
                    int var117 = (var115 & 0x7) + Statics.field1101;
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                        class82 var118 = new class82();
                        var118.field1214 = var114;
                        var118.field1215 = var113;
                        if (field830[Statics.field600][var116][var117] == null) {
                            field830[Statics.field600][var116][var117] = new class208();
                        }
                        field830[Statics.field600][var116][var117].method3957(var118);
                        method4409(var116, var117);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ir.hm(IIIIIIIIII)V")
    public static final void method4401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field689.method3979(); var10 != null; var10 = (class64) field689.method3964()) {
            if (var10.field935 == arg0 && var10.field923 == arg1 && var10.field926 == arg2 && var10.field927 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field935 = arg0;
            var9.field927 = arg3;
            var9.field923 = arg1;
            var9.field926 = arg2;
            method711(var9);
            field689.method3957(var9);
        }
        var9.field930 = arg4;
        var9.field932 = arg5;
        var9.field931 = arg6;
        var9.field933 = arg7;
        var9.field934 = arg8;
    }

    @ObfuscatedName("ak.ha(Lbl;S)V")
    public static final void method711(class64 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field927 == 0) {
            var1 = Statics.field3174.method2881(arg0.field935, arg0.field923, arg0.field926);
        }
        if (arg0.field927 == 1) {
            var1 = Statics.field3174.method2882(arg0.field935, arg0.field923, arg0.field926);
        }
        if (arg0.field927 == 2) {
            var1 = Statics.field3174.method2883(arg0.field935, arg0.field923, arg0.field926);
        }
        if (arg0.field927 == 3) {
            var1 = Statics.field3174.method2980(arg0.field935, arg0.field923, arg0.field926);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3174.method2885(arg0.field935, arg0.field923, arg0.field926, var1);
            var3 = class123.method1031(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field924 = var3;
        arg0.field925 = var4;
        arg0.field936 = var5;
    }

    @ObfuscatedName("o.hq(I)V")
    public static final void method457() {
        for (class64 var0 = (class64) field689.method3979(); var0 != null; var0 = (class64) field689.method3964()) {
            if (var0.field934 > 0) {
                var0.field934--;
            }
            if (var0.field934 != 0) {
                if (var0.field933 > 0) {
                    var0.field933--;
                }
                if (var0.field933 == 0 && var0.field923 >= 1 && var0.field926 >= 1 && var0.field923 <= 102 && var0.field926 <= 102 && (var0.field930 < 0 || class51.method2567(var0.field930, var0.field932))) {
                    method1724(var0.field935, var0.field927, var0.field923, var0.field926, var0.field930, var0.field931, var0.field932);
                    var0.field933 = -1;
                    if (var0.field930 == var0.field924 && var0.field924 == -1) {
                        var0.method3952();
                    } else if (var0.field930 == var0.field924 && var0.field936 == var0.field931 && var0.field932 == var0.field925) {
                        var0.method3952();
                    }
                }
            } else if (var0.field924 < 0 || class51.method2567(var0.field924, var0.field925)) {
                method1724(var0.field935, var0.field927, var0.field923, var0.field926, var0.field924, var0.field936, var0.field925);
                var0.method3952();
            }
        }
    }

    @ObfuscatedName("by.hr(IIIIIIII)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field649 && Statics.field600 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3174.method2881(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3174.method2882(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3174.method2883(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3174.method2980(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3174.method2885(arg0, arg2, arg3, var7);
            int var13 = class123.method1031(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3174.method2872(arg0, arg2, arg3);
                class271 var16 = class271.method4591(var13);
                if (var16.field3496 != 0) {
                    field702[arg0].method3317(arg2, arg3, var14, var15, var16.field3469);
                }
            }
            if (arg1 == 1) {
                Statics.field3174.method2873(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3174.method2874(arg0, arg2, arg3);
                class271 var17 = class271.method4591(var13);
                if (var17.field3502 + arg2 > 103 || var17.field3502 + arg3 > 103 || var17.field3476 + arg2 > 103 || var17.field3476 + arg3 > 103) {
                    return;
                }
                if (var17.field3496 != 0) {
                    field702[arg0].method3318(arg2, arg3, var17.field3502, var17.field3476, var15, var17.field3469);
                }
            }
            if (arg1 == 3) {
                Statics.field3174.method2875(arg0, arg2, arg3);
                class271 var18 = class271.method4591(var13);
                if (var18.field3496 == 1) {
                    field702[arg0].method3320(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field493[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class51.method18(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3174, field702[arg0]);
    }

    @ObfuscatedName("ig.he(III)V")
    public static final void method4409(int arg0, int arg1) {
        class208 var2 = field830[Statics.field600][arg0][arg1];
        if (var2 == null) {
            Statics.field3174.method2876(Statics.field600, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method3979(); var6 != null; var6 = (class82) var2.method3964()) {
            class272 var7 = class272.method1995(var6.field1214);
            long var8 = (long) var7.field3545;
            if (var7.field3524 == 1) {
                var8 = (long) (var6.field1215 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3174.method2876(Statics.field600, arg0, arg1);
            return;
        }
        var2.method3958(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method3979(); var12 != null; var12 = (class82) var2.method3964()) {
            if (var5.field1214 != var12.field1214) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1214 != var12.field1214 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class123.method13(arg0, arg1, 3, false, 0);
        Statics.field3174.method2862(Statics.field600, arg0, arg1, method3155(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field600), var5, var13, var10, var11);
    }

    @ObfuscatedName("bz.hw(ZLge;B)V")
    public static final void method1003(boolean arg0, class192 arg1) {
        field851 = 0;
        field780 = 0;
        class192 var2 = field691.field1284;
        var2.method3737();
        int var3 = var2.method3733(8);
        if (var3 < field687) {
            for (int var4 = var3; var4 < field687; var4++) {
                field744[++field851 - 1] = field688[var4];
            }
        }
        if (var3 > field687) {
            throw new RuntimeException("");
        }
        field687 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field688[var5];
            class74 var7 = field807[var6];
            int var8 = var2.method3733(1);
            if (var8 == 0) {
                field688[++field687 - 1] = var6;
                var7.field989 = field656;
            } else {
                int var9 = var2.method3733(2);
                if (var9 == 0) {
                    field688[++field687 - 1] = var6;
                    var7.field989 = field656;
                    field690[++field780 - 1] = var6;
                } else if (var9 == 1) {
                    field688[++field687 - 1] = var6;
                    var7.field989 = field656;
                    int var10 = var2.method3733(3);
                    var7.method1860(var10, (byte) 1);
                    int var11 = var2.method3733(1);
                    if (var11 == 1) {
                        field690[++field780 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field688[++field687 - 1] = var6;
                    var7.field989 = field656;
                    int var12 = var2.method3733(3);
                    var7.method1860(var12, (byte) 2);
                    int var13 = var2.method3733(3);
                    var7.method1860(var13, (byte) 2);
                    int var14 = var2.method3733(1);
                    if (var14 == 1) {
                        field690[++field780 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field744[++field851 - 1] = var6;
                }
            }
        }
        while (arg1.method3735(field691.field1286) >= 27) {
            int var15 = arg1.method3733(15);
            if (var15 == 32767) {
                break;
            }
            boolean var45 = false;
            if (field807[var15] == null) {
                field807[var15] = new class74();
                var45 = true;
            }
            class74 var46 = field807[var15];
            field688[++field687 - 1] = var15;
            var46.field989 = field656;
            int var47;
            if (arg0) {
                var47 = arg1.method3733(8);
                if (var47 > 127) {
                    var47 -= 256;
                }
            } else {
                var47 = arg1.method3733(5);
                if (var47 > 15) {
                    var47 -= 32;
                }
            }
            int var48 = arg1.method3733(1);
            int var49 = field700[arg1.method3733(3)];
            if (var45) {
                var46.field991 = var46.field941 = var49;
            }
            int var50 = arg1.method3733(1);
            if (var50 == 1) {
                field690[++field780 - 1] = var15;
            }
            int var51;
            if (arg0) {
                var51 = arg1.method3733(8);
                if (var51 > 127) {
                    var51 -= 256;
                }
            } else {
                var51 = arg1.method3733(5);
                if (var51 > 15) {
                    var51 -= 32;
                }
            }
            var46.field1103 = class274.method4430(arg1.method3733(14));
            var46.field965 = var46.field1103.field3601;
            var46.field948 = var46.field1103.field3600;
            if (var46.field948 == 0) {
                var46.field941 = 0;
            }
            var46.field943 = var46.field1103.field3594;
            var46.field949 = var46.field1103.field3578;
            var46.field950 = var46.field1103.field3579;
            var46.field951 = var46.field1103.field3580;
            var46.field945 = var46.field1103.field3574;
            var46.field946 = var46.field1103.field3581;
            var46.field958 = var46.field1103.field3576;
            var46.method1864(Statics.field1064.field995[0] + var47, Statics.field1064.field953[0] + var51, var48 == 1);
        }
        arg1.method3734();
        for (int var16 = 0; var16 < field780; var16++) {
            int var17 = field690[var16];
            class74 var18 = field807[var17];
            int var19 = arg1.method3679();
            if ((var19 & 0x1) != 0) {
                var18.field966 = arg1.method3503();
                if (var18.field966 == 65535) {
                    var18.field966 = -1;
                }
            }
            if ((var19 & 0x40) != 0) {
                int var20 = arg1.method3488();
                int var21 = arg1.method3488();
                int var22 = var18.field954 - (var20 - Statics.field491 - Statics.field491) * 64;
                int var23 = var18.field1000 - (var21 - Statics.field92 - Statics.field92) * 64;
                if (var22 != 0 || var23 != 0) {
                    var18.field968 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var19 & 0x20) != 0) {
                int var24 = arg1.method3467();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg1.method3587();
                if (var18.field972 == var24 && var24 != -1) {
                    int var26 = class276.method493(var24).field3616;
                    if (var26 == 1) {
                        var18.field987 = 0;
                        var18.field990 = 0;
                        var18.field999 = var25;
                        var18.field976 = 0;
                    }
                    if (var26 == 2) {
                        var18.field976 = 0;
                    }
                } else if (var24 == -1 || var18.field972 == -1 || class276.method493(var24).field3628 >= class276.method493(var18.field972).field3628) {
                    var18.field972 = var24;
                    var18.field987 = 0;
                    var18.field990 = 0;
                    var18.field999 = var25;
                    var18.field976 = 0;
                    var18.field960 = var18.field940;
                }
            }
            if ((var19 & 0x4) != 0) {
                var18.field1103 = class274.method4430(arg1.method3467());
                var18.field965 = var18.field1103.field3601;
                var18.field948 = var18.field1103.field3600;
                var18.field943 = var18.field1103.field3594;
                var18.field949 = var18.field1103.field3578;
                var18.field950 = var18.field1103.field3579;
                var18.field951 = var18.field1103.field3580;
                var18.field945 = var18.field1103.field3574;
                var18.field946 = var18.field1103.field3581;
                var18.field958 = var18.field1103.field3576;
            }
            if ((var19 & 0x10) != 0) {
                int var27 = arg1.method3495();
                if (var27 > 0) {
                    for (int var28 = 0; var28 < var27; var28++) {
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = -1;
                        int var32 = arg1.method3479();
                        if (var32 == 32767) {
                            var32 = arg1.method3479();
                            var30 = arg1.method3479();
                            var29 = arg1.method3479();
                            var31 = arg1.method3479();
                        } else if (var32 == 32766) {
                            var32 = -1;
                        } else {
                            var30 = arg1.method3479();
                        }
                        int var33 = arg1.method3479();
                        var18.method1568(var32, var30, var29, var31, field656, var33);
                    }
                }
                int var34 = arg1.method3579();
                if (var34 > 0) {
                    for (int var35 = 0; var35 < var34; var35++) {
                        int var36 = arg1.method3479();
                        int var37 = arg1.method3479();
                        if (var37 == 32767) {
                            var18.method1561(var36);
                        } else {
                            int var38 = arg1.method3479();
                            int var39 = arg1.method3679();
                            int var40 = var37 > 0 ? arg1.method3587() : var39;
                            var18.method1570(var36, field656, var37, var38, var39, var40);
                        }
                    }
                }
            }
            if ((var19 & 0x8) != 0) {
                var18.field977 = arg1.method3503();
                int var41 = arg1.method3660();
                var18.field981 = var41 >> 16;
                var18.field980 = (var41 & 0xFFFF) + field656;
                var18.field994 = 0;
                var18.field979 = 0;
                if (var18.field980 > field656) {
                    var18.field994 = -1;
                }
                if (var18.field977 == 65535) {
                    var18.field977 = -1;
                }
            }
            if ((var19 & 0x2) != 0) {
                var18.field969 = arg1.method3474();
                var18.field982 = 100;
            }
        }
        for (int var42 = 0; var42 < field851; var42++) {
            int var43 = field744[var42];
            if (field656 != field807[var43].field989) {
                field807[var43].field1103 = null;
                field807[var43] = null;
            }
        }
        if (field691.field1286 != arg1.field2406) {
            throw new RuntimeException(arg1.field2406 + class76.field1117 + field691.field1286);
        }
        for (int var44 = 0; var44 < field687; var44++) {
            if (field807[field688[var44]] == null) {
                throw new RuntimeException(var44 + class76.field1117 + field687);
            }
        }
    }

    @ObfuscatedName("ji.hf(Lbk;IIBI)V")
    public static final void method4813(class62 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field995[0];
        int var5 = arg0.field953[0];
        int var6 = arg0.method1099();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1099();
        field671.field2117 = arg1;
        field671.field2113 = arg2;
        field671.field2115 = 1;
        field671.field2116 = 1;
        class61 var8 = field671;
        class61 var9 = var8;
        class167 var10 = field702[arg0.field621];
        int[] var11 = field919;
        int[] var12 = field901;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class168.field2106[var13][var14] = 0;
                class168.field2104[var13][var14] = 99999999;
            }
        }
        boolean var30;
        if (var7 == 1) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class168.field2106[var17][var18] = 99;
            class168.field2104[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class168.field2107[var21] = var4;
            int var79 = var21 + 1;
            class168.field2111[var21] = var5;
            int[][] var23 = var10.field2102;
            boolean var28;
            while (true) {
                if (var79 == var22) {
                    Statics.field2810 = var15;
                    Statics.field2108 = var16;
                    var28 = false;
                    break;
                }
                var15 = class168.field2107[var22];
                var16 = class168.field2111[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field2098;
                int var27 = var16 - var10.field2087;
                if (var9.method1088(1, var15, var16, var10)) {
                    Statics.field2810 = var15;
                    Statics.field2108 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class168.field2104[var24][var25] + 1;
                if (var24 > 0 && class168.field2106[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class168.field2107[var79] = var15 - 1;
                    class168.field2111[var79] = var16;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 - 1][var25] = 2;
                    class168.field2104[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class168.field2106[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class168.field2107[var79] = var15 + 1;
                    class168.field2111[var79] = var16;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 + 1][var25] = 8;
                    class168.field2104[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class168.field2106[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2107[var79] = var15;
                    class168.field2111[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24][var25 - 1] = 1;
                    class168.field2104[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class168.field2106[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2107[var79] = var15;
                    class168.field2111[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24][var25 + 1] = 4;
                    class168.field2104[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class168.field2106[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2107[var79] = var15 - 1;
                    class168.field2111[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 - 1][var25 - 1] = 3;
                    class168.field2104[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class168.field2106[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2107[var79] = var15 + 1;
                    class168.field2111[var79] = var16 - 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 + 1][var25 - 1] = 9;
                    class168.field2104[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class168.field2106[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2107[var79] = var15 - 1;
                    class168.field2111[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 - 1][var25 + 1] = 6;
                    class168.field2104[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class168.field2106[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2107[var79] = var15 + 1;
                    class168.field2111[var79] = var16 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2106[var24 + 1][var25 + 1] = 12;
                    class168.field2104[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            var30 = class168.method3118(var4, var5, var8, var10);
        } else {
            int var31 = var4;
            int var32 = var5;
            byte var33 = 64;
            byte var34 = 64;
            int var35 = var4 - var33;
            int var36 = var5 - var34;
            class168.field2106[var33][var34] = 99;
            class168.field2104[var33][var34] = 0;
            byte var37 = 0;
            int var38 = 0;
            class168.field2107[var37] = var4;
            int var80 = var37 + 1;
            class168.field2111[var37] = var5;
            int[][] var39 = var10.field2102;
            boolean var44;
            label514: while (true) {
                label512: while (true) {
                    int var40;
                    int var41;
                    int var42;
                    int var43;
                    int var45;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var80 == var38) {
                                        Statics.field2810 = var31;
                                        Statics.field2108 = var32;
                                        var44 = false;
                                        break label514;
                                    }
                                    var31 = class168.field2107[var38];
                                    var32 = class168.field2111[var38];
                                    var38 = var38 + 1 & 0xFFF;
                                    var40 = var31 - var35;
                                    var41 = var32 - var36;
                                    var42 = var31 - var10.field2098;
                                    var43 = var32 - var10.field2087;
                                    if (var9.method1088(var7, var31, var32, var10)) {
                                        Statics.field2810 = var31;
                                        Statics.field2108 = var32;
                                        var44 = true;
                                        break label514;
                                    }
                                    var45 = class168.field2104[var40][var41] + 1;
                                    if (var40 > 0 && class168.field2106[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var7 + var43 - 1] & 0x1240138) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class168.field2107[var80] = var31 - 1;
                                                class168.field2111[var80] = var32;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40 - 1][var41] = 2;
                                                class168.field2104[var40 - 1][var41] = var45;
                                                break;
                                            }
                                            if ((var39[var42 - 1][var43 + var46] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class168.field2106[var40 + 1][var41] == 0 && (var39[var7 + var42][var43] & 0x1240183) == 0 && (var39[var7 + var42][var7 + var43 - 1] & 0x12401E0) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class168.field2107[var80] = var31 + 1;
                                                class168.field2111[var80] = var32;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40 + 1][var41] = 8;
                                                class168.field2104[var40 + 1][var41] = var45;
                                                break;
                                            }
                                            if ((var39[var7 + var42][var43 + var47] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var41 > 0 && class168.field2106[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var7 + var42 - 1][var43 - 1] & 0x1240183) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class168.field2107[var80] = var31;
                                                class168.field2111[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40][var41 - 1] = 1;
                                                class168.field2104[var40][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 + var48][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var41 < 128 - var7 && class168.field2106[var40][var41 + 1] == 0 && (var39[var42][var7 + var43] & 0x1240138) == 0 && (var39[var7 + var42 - 1][var7 + var43] & 0x12401E0) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7 - 1) {
                                                class168.field2107[var80] = var31;
                                                class168.field2111[var80] = var32 + 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40][var41 + 1] = 4;
                                                class168.field2104[var40][var41 + 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 + var49][var7 + var43] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var40 > 0 && var41 > 0 && class168.field2106[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class168.field2107[var80] = var31 - 1;
                                                class168.field2111[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40 - 1][var41 - 1] = 3;
                                                class168.field2104[var40 - 1][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var42 - 1][var43 - 1 + var50] & 0x124013E) != 0 || (var39[var42 - 1 + var50][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && var41 > 0 && class168.field2106[var40 + 1][var41 - 1] == 0 && (var39[var7 + var42][var43 - 1] & 0x1240183) == 0) {
                                        int var51 = 1;
                                        while (true) {
                                            if (var51 >= var7) {
                                                class168.field2107[var80] = var31 + 1;
                                                class168.field2111[var80] = var32 - 1;
                                                var80 = var80 + 1 & 0xFFF;
                                                class168.field2106[var40 + 1][var41 - 1] = 9;
                                                class168.field2104[var40 + 1][var41 - 1] = var45;
                                                break;
                                            }
                                            if ((var39[var7 + var42][var43 - 1 + var51] & 0x12401E3) != 0 || (var39[var42 + var51][var43 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var51++;
                                        }
                                    }
                                    if (var40 > 0 && var41 < 128 - var7 && class168.field2106[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var7 + var43] & 0x1240138) == 0) {
                                        for (int var52 = 1; var52 < var7; var52++) {
                                            if ((var39[var42 - 1][var43 + var52] & 0x124013E) != 0 || (var39[var42 - 1 + var52][var7 + var43] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class168.field2107[var80] = var31 - 1;
                                        class168.field2111[var80] = var32 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class168.field2106[var40 - 1][var41 + 1] = 6;
                                        class168.field2104[var40 - 1][var41 + 1] = var45;
                                    }
                                } while (var40 >= 128 - var7);
                            } while (var41 >= 128 - var7);
                        } while (class168.field2106[var40 + 1][var41 + 1] != 0);
                    } while ((var39[var7 + var42][var7 + var43] & 0x12401E0) != 0);
                    for (int var53 = 1; var53 < var7; var53++) {
                        if ((var39[var42 + var53][var7 + var43] & 0x12401F8) != 0 || (var39[var7 + var42][var43 + var53] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class168.field2107[var80] = var31 + 1;
                    class168.field2111[var80] = var32 + 1;
                    var80 = var80 + 1 & 0xFFF;
                    class168.field2106[var40 + 1][var41 + 1] = 12;
                    class168.field2104[var40 + 1][var41 + 1] = var45;
                }
            }
            var30 = var44;
        }
        int var72;
        label570: {
            int var54 = var4 - 64;
            int var55 = var5 - 64;
            int var56 = Statics.field2810;
            int var57 = Statics.field2108;
            if (!var30) {
                int var58 = Integer.MAX_VALUE;
                int var59 = Integer.MAX_VALUE;
                byte var60 = 10;
                int var61 = var9.field2117;
                int var62 = var9.field2113;
                int var63 = var9.field2115;
                int var64 = var9.field2116;
                for (int var65 = var61 - var60; var65 <= var60 + var61; var65++) {
                    for (int var66 = var62 - var60; var66 <= var60 + var62; var66++) {
                        int var67 = var65 - var54;
                        int var68 = var66 - var55;
                        if (var67 >= 0 && var68 >= 0 && var67 < 128 && var68 < 128 && class168.field2104[var67][var68] < 100) {
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = 0;
                            if (var66 < var62) {
                                var70 = var62 - var66;
                            } else if (var66 > var62 + var64 - 1) {
                                var70 = var66 - (var62 + var64 - 1);
                            }
                            int var71 = var69 * var69 + var70 * var70;
                            if (var71 < var58 || var58 == var71 && class168.field2104[var67][var68] < var59) {
                                var58 = var71;
                                var59 = class168.field2104[var67][var68];
                                var56 = var65;
                                var57 = var66;
                            }
                        }
                    }
                }
                if (var58 == Integer.MAX_VALUE) {
                    var72 = -1;
                    break label570;
                }
            }
            if (var4 == var56 && var5 == var57) {
                var72 = 0;
            } else {
                byte var73 = 0;
                class168.field2107[var73] = var56;
                int var81 = var73 + 1;
                class168.field2111[var73] = var57;
                int var74;
                int var75 = var74 = class168.field2106[var56 - var54][var57 - var55];
                while (var4 != var56 || var5 != var57) {
                    if (var74 != var75) {
                        var74 = var75;
                        class168.field2107[var81] = var56;
                        class168.field2111[var81++] = var57;
                    }
                    if ((var75 & 0x2) != 0) {
                        var56++;
                    } else if ((var75 & 0x8) != 0) {
                        var56--;
                    }
                    if ((var75 & 0x1) != 0) {
                        var57++;
                    } else if ((var75 & 0x4) != 0) {
                        var57--;
                    }
                    var75 = class168.field2106[var56 - var54][var57 - var55];
                }
                int var76 = 0;
                while (var81-- > 0) {
                    var11[var76] = class168.field2107[var81];
                    var12[var76++] = class168.field2111[var81];
                    if (var76 >= var11.length) {
                        break;
                    }
                }
                var72 = var76;
            }
        }
        int var77 = var72;
        if (var72 >= 1) {
            for (int var78 = 0; var78 < var77 - 1; var78++) {
                arg0.method1116(field919[var78], field901[var78], arg3);
            }
        }
    }

    @ObfuscatedName("x.hb(I)V")
    public static void method164() {
        field781 = 0;
        field834 = false;
        field917[0] = class240.field2995;
        field787[0] = "";
        field784[0] = 1006;
        field773[0] = false;
        field781 = 1;
    }

    @ObfuscatedName("hs.hl(IIIIB)V")
    public static final void method4272(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field854; var4++) {
            if (field820[var4] + field764[var4] > arg0 && field764[var4] < arg0 + arg2 && field855[var4] + field853[var4] > arg1 && field853[var4] < arg1 + arg3) {
                field850[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hg(B)V")
    public final void method1240() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field781 - 1; var2++) {
                if (field784[var2] < 1000 && field784[var2 + 1] > 1000) {
                    String var3 = field787[var2];
                    field787[var2] = field787[var2 + 1];
                    field787[var2 + 1] = var3;
                    String var4 = field917[var2];
                    field917[var2] = field917[var2 + 1];
                    field917[var2 + 1] = var4;
                    int var5 = field784[var2];
                    field784[var2] = field784[var2 + 1];
                    field784[var2 + 1] = var5;
                    int var6 = field782[var2];
                    field782[var2] = field782[var2 + 1];
                    field782[var2 + 1] = var6;
                    int var7 = field783[var2];
                    field783[var2] = field783[var2 + 1];
                    field783[var2 + 1] = var7;
                    int var8 = field785[var2];
                    field785[var2] = field785[var2 + 1];
                    field785[var2 + 1] = var8;
                    boolean var9 = field773[var2];
                    field773[var2] = field773[var2 + 1];
                    field773[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field1026 != null || field817 != null) {
            return;
        }
        int var10 = class49.field478;
        if (field834) {
            if (var10 != 1 && (Statics.field133 || var10 != 4)) {
                int var11 = class49.field474;
                int var12 = class49.field465 * -976212263;
                if (var11 < Statics.field2068 - 10 || var11 > Statics.field2068 + Statics.field1114 + 10 || var12 < Statics.field1261 - 10 || var12 > Statics.field1839 + Statics.field1261 + 10) {
                    field834 = false;
                    int var13 = Statics.field2068;
                    int var14 = Statics.field1261;
                    int var15 = Statics.field1114;
                    int var16 = Statics.field1839;
                    for (int var17 = 0; var17 < field854; var17++) {
                        if (field820[var17] + field764[var17] > var13 && field764[var17] < var13 + var15 && field855[var17] + field853[var17] > var14 && field853[var17] < var14 + var16) {
                            field849[var17] = true;
                        }
                    }
                }
            }
            if (var10 == 1 || !Statics.field133 && var10 == 4) {
                int var18 = Statics.field2068;
                int var19 = Statics.field1261;
                int var20 = Statics.field1114;
                int var21 = class49.field479;
                int var22 = class49.field468;
                int var23 = -1;
                for (int var24 = 0; var24 < field781; var24++) {
                    int var25 = (field781 - 1 - var24) * 15 + var19 + 31;
                    if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                        var23 = var24;
                    }
                }
                if (var23 != -1) {
                    method588(var23);
                }
                field834 = false;
                int var26 = Statics.field2068;
                int var27 = Statics.field1261;
                int var28 = Statics.field1114;
                int var29 = Statics.field1839;
                for (int var30 = 0; var30 < field854; var30++) {
                    if (field820[var30] + field764[var30] > var26 && field764[var30] < var26 + var28 && field855[var30] + field853[var30] > var27 && field853[var30] < var27 + var29) {
                        field849[var30] = true;
                    }
                }
            }
            return;
        }
        int var31 = field781 - 1;
        if ((var10 == 1 || !Statics.field133 && var10 == 4) && var31 >= 0) {
            int var33 = field784[var31];
            if (var33 == 39 || var33 == 40 || var33 == 41 || var33 == 42 || var33 == 43 || var33 == 33 || var33 == 34 || var33 == 35 || var33 == 36 || var33 == 37 || var33 == 38 || var33 == 1005) {
                label244: {
                    int var34 = field782[var31];
                    int var35 = field783[var31];
                    class233 var36 = class233.method214(var35);
                    int var37 = method4593(var36);
                    boolean var38 = (var37 >> 28 & 0x1) != 0;
                    if (!var38) {
                        class234 var10000 = (class234) null;
                        if (!class234.method3349(method4593(var36))) {
                            break label244;
                        }
                    }
                    if (Statics.field1026 != null && !field674 && field781 > 0 && !this.method1167()) {
                        method747(field753, field846);
                    }
                    field674 = false;
                    field757 = 0;
                    if (Statics.field1026 != null) {
                        method642(Statics.field1026);
                    }
                    Statics.field1026 = class233.method214(var35);
                    field752 = var34;
                    field753 = class49.field479;
                    field846 = class49.field468;
                    if (var31 >= 0) {
                        method11(var31);
                    }
                    method642(Statics.field1026);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field133 && var10 == 4) && this.method1167()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field133 && var10 == 4) && field781 > 0) {
            method588(var31);
        }
        if (var10 == 2 && field781 > 0) {
            this.method1520(class49.field479, class49.field468);
        }
    }

    @ObfuscatedName("client.ho(I)Z")
    public final boolean method1167() {
        int var1 = field781 - 1;
        boolean var3 = field867 == 1 && field781 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field784[var1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 1007) {
                    var4 = true;
                } else {
                    var4 = false;
                }
            }
            var3 = var4;
        }
        return var3 && !field773[var1];
    }

    @ObfuscatedName("client.ht(III)V")
    public final void method1520(int arg0, int arg1) {
        method1029(arg0, arg1);
        Statics.field3174.method2878(Statics.field600, arg0, arg1, false);
        field834 = true;
    }

    @ObfuscatedName("bu.hv(B)V")
    public static void method1884() {
        method1029(Statics.field1114 / 2 + Statics.field2068, Statics.field1261);
    }

    @ObfuscatedName("bp.hp(III)V")
    public static void method1029(int arg0, int arg1) {
        int var2 = Statics.field2067.method5343(class240.field3012);
        for (int var3 = 0; var3 < field781; var3++) {
            int var4 = Statics.field2067.method5343(method585(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field781 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1039) {
            var6 = Statics.field1039 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1938) {
            var7 = Statics.field1938 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2068 = var6;
        Statics.field1261 = var7;
        Statics.field1114 = var2;
        Statics.field1839 = field781 * 15 + 22;
    }

    @ObfuscatedName("ag.hh(II)V")
    public static final void method588(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field782[arg0];
        int var2 = field783[arg0];
        int var3 = field784[arg0];
        int var4 = field785[arg0];
        String var5 = field917[arg0];
        String var6 = field787[arg0];
        method179(var1, var2, var3, var4, var5, var6, class49.field479, class49.field468);
    }

    @ObfuscatedName("v.hx(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 42) {
            class175 var8 = class175.method3035(class172.field2272, field691.field1283);
            var8.field2333.method3617(arg1);
            var8.field2333.method3583(arg0);
            var8.field2333.method3450(arg3);
            field691.method2060(var8);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 9) {
            class74 var9 = field807[arg3];
            if (var9 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var10 = class175.method3035(class172.field2213, field691.field1283);
                var10.field2333.method3492(class40.field381[82] ? 1 : 0);
                var10.field2333.method3565(arg3);
                field691.method2060(var10);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field419.method5895(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 12) {
            class74 var11 = field807[arg3];
            if (var11 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var12 = class175.method3035(class172.field2267, field691.field1283);
                var12.field2333.method3450(arg3);
                var12.field2333.method3491(class40.field381[82] ? 1 : 0);
                field691.method2060(var12);
            }
        }
        if (arg2 == 14) {
            class62 var13 = field699[arg3];
            if (var13 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var14 = class175.method3035(class172.field2289, field691.field1283);
                var14.field2333.method3502(Statics.field221);
                var14.field2333.method3493(class40.field381[82] ? 1 : 0);
                var14.field2333.method3589(Statics.field1277);
                var14.field2333.method3450(arg3);
                var14.field2333.method3450(Statics.field52);
                field691.method2060(var14);
            }
        }
        if (arg2 == 24) {
            class233 var15 = class233.method214(arg1);
            boolean var16 = true;
            if (var15.field2742 > 0) {
                var16 = method146(var15);
            }
            if (var16) {
                class175 var17 = class175.method3035(class172.field2277, field691.field1283);
                var17.field2333.method3617(arg1);
                field691.method2060(var17);
            }
        }
        if (arg2 == 19) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var18 = class175.method3035(class172.field2282, field691.field1283);
            var18.field2333.method3502(arg3);
            var18.field2333.method3583(Statics.field491 + arg0);
            var18.field2333.method3450(Statics.field92 + arg1);
            var18.field2333.method3501(class40.field381[82] ? 1 : 0);
            field691.method2060(var18);
        }
        if (arg2 == 17) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var19 = class175.method3035(class172.field2252, field691.field1283);
            var19.field2333.method3589(Statics.field3797);
            var19.field2333.method3450(field800);
            var19.field2333.method3583(Statics.field92 + arg1);
            var19.field2333.method3583(Statics.field491 + arg0);
            var19.field2333.method3491(class40.field381[82] ? 1 : 0);
            var19.field2333.method3565(arg3);
            field691.method2060(var19);
        }
        if (arg2 == 46) {
            class62 var20 = field699[arg3];
            if (var20 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var21 = class175.method3035(class172.field2249, field691.field1283);
                var21.field2333.method3583(arg3);
                var21.field2333.method3501(class40.field381[82] ? 1 : 0);
                field691.method2060(var21);
            }
        }
        if (arg2 == 10) {
            class74 var22 = field807[arg3];
            if (var22 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var23 = class175.method3035(class172.field2209, field691.field1283);
                var23.field2333.method3583(arg3);
                var23.field2333.method3501(class40.field381[82] ? 1 : 0);
                field691.method2060(var23);
            }
        }
        if (arg2 == 45) {
            class62 var24 = field699[arg3];
            if (var24 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var25 = class175.method3035(class172.field2264, field691.field1283);
                var25.field2333.method3491(class40.field381[82] ? 1 : 0);
                var25.field2333.method3583(arg3);
                field691.method2060(var25);
            }
        }
        if (arg2 == 39) {
            class175 var26 = class175.method3035(class172.field2255, field691.field1283);
            var26.field2333.method3502(arg3);
            var26.field2333.method3635(arg1);
            var26.field2333.method3565(arg0);
            field691.method2060(var26);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 6) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var27 = class175.method3035(class172.field2211, field691.field1283);
            var27.field2333.method3491(class40.field381[82] ? 1 : 0);
            var27.field2333.method3583(Statics.field92 + arg1);
            var27.field2333.method3583(Statics.field491 + arg0);
            var27.field2333.method3565(arg3);
            field691.method2060(var27);
        }
        if (arg2 == 22) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var28 = class175.method3035(class172.field2259, field691.field1283);
            var28.field2333.method3501(class40.field381[82] ? 1 : 0);
            var28.field2333.method3502(arg3);
            var28.field2333.method3583(Statics.field92 + arg1);
            var28.field2333.method3450(Statics.field491 + arg0);
            field691.method2060(var28);
        }
        if (arg2 == 43) {
            class175 var29 = class175.method3035(class172.field2240, field691.field1283);
            var29.field2333.method3450(arg3);
            var29.field2333.method3589(arg1);
            var29.field2333.method3450(arg0);
            field691.method2060(var29);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 28) {
            class175 var30 = class175.method3035(class172.field2277, field691.field1283);
            var30.field2333.method3617(arg1);
            field691.method2060(var30);
            class233 var31 = class233.method214(arg1);
            if (var31.field2786 != null && var31.field2786[0][0] == 5) {
                int var32 = var31.field2786[0][1];
                class228.field2630[var32] = 1 - class228.field2630[var32];
                method4246(var32);
            }
        }
        if (arg2 == 26) {
            method704();
        }
        if (arg2 == 1001) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var33 = class175.method3035(class172.field2302, field691.field1283);
            var33.field2333.method3450(arg3);
            var33.field2333.method3491(class40.field381[82] ? 1 : 0);
            var33.field2333.method3583(Statics.field491 + arg0);
            var33.field2333.method3502(Statics.field92 + arg1);
            field691.method2060(var33);
        }
        if (arg2 == 8) {
            class74 var34 = field807[arg3];
            if (var34 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var35 = class175.method3035(class172.field2214, field691.field1283);
                var35.field2333.method3502(arg3);
                var35.field2333.method3492(class40.field381[82] ? 1 : 0);
                var35.field2333.method3509(Statics.field3797);
                var35.field2333.method3583(field800);
                field691.method2060(var35);
            }
        }
        if (arg2 == 7) {
            class74 var36 = field807[arg3];
            if (var36 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var37 = class175.method3035(class172.field2218, field691.field1283);
                var37.field2333.method3502(Statics.field52);
                var37.field2333.method3450(Statics.field221);
                var37.field2333.method3502(arg3);
                var37.field2333.method3492(class40.field381[82] ? 1 : 0);
                var37.field2333.method3617(Statics.field1277);
                field691.method2060(var37);
            }
        }
        if (arg2 == 18) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var38 = class175.method3035(class172.field2217, field691.field1283);
            var38.field2333.method3502(Statics.field92 + arg1);
            var38.field2333.method3565(arg3);
            var38.field2333.method3565(Statics.field491 + arg0);
            var38.field2333.method3501(class40.field381[82] ? 1 : 0);
            field691.method2060(var38);
        }
        if (arg2 == 40) {
            class175 var39 = class175.method3035(class172.field2234, field691.field1283);
            var39.field2333.method3635(arg1);
            var39.field2333.method3565(arg0);
            var39.field2333.method3583(arg3);
            field691.method2060(var39);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 21) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var40 = class175.method3035(class172.field2294, field691.field1283);
            var40.field2333.method3583(Statics.field92 + arg1);
            var40.field2333.method3565(arg3);
            var40.field2333.method3450(Statics.field491 + arg0);
            var40.field2333.method3493(class40.field381[82] ? 1 : 0);
            field691.method2060(var40);
        }
        if (arg2 == 47) {
            class62 var41 = field699[arg3];
            if (var41 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var42 = class175.method3035(class172.field2237, field691.field1283);
                var42.field2333.method3502(arg3);
                var42.field2333.method3492(class40.field381[82] ? 1 : 0);
                field691.method2060(var42);
            }
        }
        if (arg2 == 1004) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            class175 var43 = class175.method3035(class172.field2215, field691.field1283);
            var43.field2333.method3565(arg3);
            field691.method2060(var43);
        }
        if (arg2 == 3) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var44 = class175.method3035(class172.field2305, field691.field1283);
            var44.field2333.method3450(Statics.field92 + arg1);
            var44.field2333.method3493(class40.field381[82] ? 1 : 0);
            var44.field2333.method3583(arg3);
            var44.field2333.method3502(Statics.field491 + arg0);
            field691.method2060(var44);
        }
        if (arg2 == 31) {
            class175 var45 = class175.method3035(class172.field2271, field691.field1283);
            var45.field2333.method3589(arg1);
            var45.field2333.method3635(Statics.field1277);
            var45.field2333.method3502(Statics.field221);
            var45.field2333.method3565(Statics.field52);
            var45.field2333.method3565(arg0);
            var45.field2333.method3502(arg3);
            field691.method2060(var45);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 11) {
            class74 var46 = field807[arg3];
            if (var46 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var47 = class175.method3035(class172.field2278, field691.field1283);
                var47.field2333.method3502(arg3);
                var47.field2333.method3501(class40.field381[82] ? 1 : 0);
                field691.method2060(var47);
            }
        }
        if (arg2 == 30 && field881 == null) {
            method5060(arg1, arg0);
            field881 = class233.method103(arg1, arg0);
            method642(field881);
        }
        if (arg2 == 4) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var48 = class175.method3035(class172.field2287, field691.field1283);
            var48.field2333.method3491(class40.field381[82] ? 1 : 0);
            var48.field2333.method3450(arg3);
            var48.field2333.method3450(Statics.field92 + arg1);
            var48.field2333.method3450(Statics.field491 + arg0);
            field691.method2060(var48);
        }
        if (arg2 == 29) {
            class175 var49 = class175.method3035(class172.field2277, field691.field1283);
            var49.field2333.method3617(arg1);
            field691.method2060(var49);
            class233 var50 = class233.method214(arg1);
            if (var50.field2786 != null && var50.field2786[0][0] == 5) {
                int var51 = var50.field2786[0][1];
                if (class228.field2630[var51] != var50.field2779[0]) {
                    class228.field2630[var51] = var50.field2779[0];
                    method4246(var51);
                }
            }
        }
        if (arg2 == 50) {
            class62 var52 = field699[arg3];
            if (var52 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var53 = class175.method3035(class172.field2283, field691.field1283);
                var53.field2333.method3493(class40.field381[82] ? 1 : 0);
                var53.field2333.method3565(arg3);
                field691.method2060(var53);
            }
        }
        if (arg2 == 58) {
            class233 var54 = class233.method103(arg1, arg0);
            if (var54 != null) {
                class175 var55 = class175.method3035(class172.field2290, field691.field1283);
                var55.field2333.method3565(field800);
                var55.field2333.method3635(arg1);
                var55.field2333.method3565(field735);
                var55.field2333.method3502(arg0);
                var55.field2333.method3617(Statics.field3797);
                var55.field2333.method3502(var54.field2794);
                field691.method2060(var55);
            }
        }
        if (arg2 == 36) {
            class175 var56 = class175.method3035(class172.field2241, field691.field1283);
            var56.field2333.method3502(arg3);
            var56.field2333.method3617(arg1);
            var56.field2333.method3502(arg0);
            field691.method2060(var56);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 33) {
            class175 var57 = class175.method3035(class172.field2295, field691.field1283);
            var57.field2333.method3565(arg3);
            var57.field2333.method3589(arg1);
            var57.field2333.method3450(arg0);
            field691.method2060(var57);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 5) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var58 = class175.method3035(class172.field2260, field691.field1283);
            var58.field2333.method3502(Statics.field491 + arg0);
            var58.field2333.method3583(arg3);
            var58.field2333.method3502(Statics.field92 + arg1);
            var58.field2333.method3491(class40.field381[82] ? 1 : 0);
            field691.method2060(var58);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var59 = class233.method103(arg1, arg0);
            if (var59 != null) {
                method629(arg3, arg1, arg0, var59.field2794, arg5);
            }
        }
        if (arg2 == 1005) {
            class233 var60 = class233.method214(arg1);
            if (var60 == null || var60.field2793[arg0] < 100000) {
                class175 var61 = class175.method3035(class172.field2215, field691.field1283);
                var61.field2333.method3565(arg3);
                field691.method2060(var61);
            } else {
                class86.method1084(27, "", var60.field2793[arg0] + " x " + class272.method1995(arg3).field3516);
            }
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 20) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var62 = class175.method3035(class172.field2280, field691.field1283);
            var62.field2333.method3565(Statics.field92 + arg1);
            var62.field2333.method3493(class40.field381[82] ? 1 : 0);
            var62.field2333.method3565(Statics.field491 + arg0);
            var62.field2333.method3565(arg3);
            field691.method2060(var62);
        }
        if (arg2 == 34) {
            class175 var63 = class175.method3035(class172.field2306, field691.field1283);
            var63.field2333.method3583(arg3);
            var63.field2333.method3635(arg1);
            var63.field2333.method3502(arg0);
            field691.method2060(var63);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 1) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var64 = class175.method3035(class172.field2253, field691.field1283);
            var64.field2333.method3502(Statics.field92 + arg1);
            var64.field2333.method3565(Statics.field221);
            var64.field2333.method3491(class40.field381[82] ? 1 : 0);
            var64.field2333.method3509(Statics.field1277);
            var64.field2333.method3502(Statics.field491 + arg0);
            var64.field2333.method3450(arg3);
            var64.field2333.method3565(Statics.field52);
            field691.method2060(var64);
        }
        if (arg2 == 2) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var65 = class175.method3035(class172.field2300, field691.field1283);
            var65.field2333.method3501(class40.field381[82] ? 1 : 0);
            var65.field2333.method3450(Statics.field491 + arg0);
            var65.field2333.method3583(arg3);
            var65.field2333.method3635(Statics.field3797);
            var65.field2333.method3450(field800);
            var65.field2333.method3565(Statics.field92 + arg1);
            field691.method2060(var65);
        }
        if (arg2 == 51) {
            class62 var66 = field699[arg3];
            if (var66 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var67 = class175.method3035(class172.field2262, field691.field1283);
                var67.field2333.method3492(class40.field381[82] ? 1 : 0);
                var67.field2333.method3502(arg3);
                field691.method2060(var67);
            }
        }
        if (arg2 == 25) {
            class233 var68 = class233.method103(arg1, arg0);
            if (var68 != null) {
                method3040();
                method1153(arg1, arg0, class234.method99(method4593(var68)), var68.field2794);
                field797 = 0;
                field802 = method2037(var68);
                if (field802 == null) {
                    field802 = class240.field2863;
                }
                if (var68.field2686) {
                    field717 = var68.field2698 + class76.method3031(16777215);
                } else {
                    field717 = class76.method3031(65280) + var68.field2678 + class76.method3031(16777215);
                }
            }
            return;
        }
        if (arg2 == 23) {
            if (field834) {
                Statics.field3174.method2893();
            } else {
                Statics.field3174.method2878(Statics.field600, arg0, arg1, true);
            }
        }
        if (arg2 == 16) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            field723 = arg0;
            field876 = arg1;
            class175 var69 = class175.method3035(class172.field2226, field691.field1283);
            var69.field2333.method3589(Statics.field1277);
            var69.field2333.method3502(Statics.field52);
            var69.field2333.method3491(class40.field381[82] ? 1 : 0);
            var69.field2333.method3565(Statics.field221);
            var69.field2333.method3502(arg3);
            var69.field2333.method3502(Statics.field491 + arg0);
            var69.field2333.method3565(Statics.field92 + arg1);
            field691.method2060(var69);
        }
        if (arg2 == 37) {
            class175 var70 = class175.method3035(class172.field2266, field691.field1283);
            var70.field2333.method3617(arg1);
            var70.field2333.method3450(arg0);
            var70.field2333.method3450(arg3);
            field691.method2060(var70);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 32) {
            class175 var71 = class175.method3035(class172.field2210, field691.field1283);
            var71.field2333.method3589(Statics.field3797);
            var71.field2333.method3617(arg1);
            var71.field2333.method3450(arg0);
            var71.field2333.method3565(arg3);
            var71.field2333.method3565(field800);
            field691.method2060(var71);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 35) {
            class175 var72 = class175.method3035(class172.field2297, field691.field1283);
            var72.field2333.method3509(arg1);
            var72.field2333.method3502(arg0);
            var72.field2333.method3502(arg3);
            field691.method2060(var72);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 38) {
            method3040();
            class233 var73 = class233.method214(arg1);
            field797 = 1;
            Statics.field221 = arg0;
            Statics.field1277 = arg1;
            Statics.field52 = arg3;
            method642(var73);
            field767 = class76.method3031(16748608) + class272.method1995(arg3).field3516 + class76.method3031(16777215);
            if (field767 == null) {
                field767 = class240.field2863;
            }
            return;
        }
        if (arg2 == 49) {
            class62 var74 = field699[arg3];
            if (var74 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var75 = class175.method3035(class172.field2301, field691.field1283);
                var75.field2333.method3583(arg3);
                var75.field2333.method3493(class40.field381[82] ? 1 : 0);
                field691.method2060(var75);
            }
        }
        if (arg2 == 41) {
            class175 var76 = class175.method3035(class172.field2269, field691.field1283);
            var76.field2333.method3509(arg1);
            var76.field2333.method3583(arg0);
            var76.field2333.method3450(arg3);
            field691.method2060(var76);
            field750 = 0;
            Statics.field2358 = class233.method214(arg1);
            field751 = arg0;
        }
        if (arg2 == 15) {
            class62 var77 = field699[arg3];
            if (var77 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var78 = class175.method3035(class172.field2245, field691.field1283);
                var78.field2333.method3635(Statics.field3797);
                var78.field2333.method3493(class40.field381[82] ? 1 : 0);
                var78.field2333.method3583(field800);
                var78.field2333.method3450(arg3);
                field691.method2060(var78);
            }
        }
        if (arg2 == 1003) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            class74 var79 = field807[arg3];
            if (var79 != null) {
                class274 var80 = var79.field1103;
                if (var80.field3596 != null) {
                    var80 = var80.method4983();
                }
                if (var80 != null) {
                    class175 var81 = class175.method3035(class172.field2238, field691.field1283);
                    var81.field2333.method3583(var80.field3569);
                    field691.method2060(var81);
                }
            }
        }
        if (arg2 == 1002) {
            field745 = arg6;
            field746 = arg7;
            field760 = 2;
            field810 = 0;
            class175 var82 = class175.method3035(class172.field2244, field691.field1283);
            var82.field2333.method3583(arg3);
            field691.method2060(var82);
        }
        if (arg2 == 44) {
            class62 var83 = field699[arg3];
            if (var83 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var84 = class175.method3035(class172.field2309, field691.field1283);
                var84.field2333.method3450(arg3);
                var84.field2333.method3492(class40.field381[82] ? 1 : 0);
                field691.method2060(var84);
            }
        }
        if (arg2 == 48) {
            class62 var85 = field699[arg3];
            if (var85 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var86 = class175.method3035(class172.field2291, field691.field1283);
                var86.field2333.method3491(class40.field381[82] ? 1 : 0);
                var86.field2333.method3583(arg3);
                field691.method2060(var86);
            }
        }
        if (arg2 == 13) {
            class74 var87 = field807[arg3];
            if (var87 != null) {
                field745 = arg6;
                field746 = arg7;
                field760 = 2;
                field810 = 0;
                field723 = arg0;
                field876 = arg1;
                class175 var88 = class175.method3035(class172.field2263, field691.field1283);
                var88.field2333.method3501(class40.field381[82] ? 1 : 0);
                var88.field2333.method3583(arg3);
                field691.method2060(var88);
            }
        }
        if (field797 != 0) {
            field797 = 0;
            method642(class233.method214(Statics.field1277));
        }
        if (field799) {
            method3040();
        }
        if (Statics.field2358 != null && field750 == 0) {
            method642(Statics.field2358);
        }
    }

    @ObfuscatedName("bb.hz(IIIIB)V")
    public static void method1153(int arg0, int arg1, int arg2, int arg3) {
        class233 var4 = class233.method103(arg0, arg1);
        if (var4 != null && var4.field2765 != null) {
            class58 var5 = new class58();
            var5.field571 = var4;
            var5.field576 = var4.field2765;
            class71.method997(var5);
        }
        field735 = arg3;
        field799 = true;
        Statics.field3797 = arg0;
        field800 = arg1;
        Statics.field3741 = arg2;
        method642(var4);
    }

    @ObfuscatedName("ey.hi(I)V")
    public static void method3040() {
        if (!field799) {
            return;
        }
        class233 var0 = class233.method103(Statics.field3797, field800);
        if (var0 != null && var0.field2743 != null) {
            class58 var1 = new class58();
            var1.field571 = var0;
            var1.field576 = var0.field2743;
            class71.method997(var1);
        }
        field799 = false;
        method642(var0);
    }

    @ObfuscatedName("jg.hj(III)V")
    public static void method5060(int arg0, int arg1) {
        class175 var2 = class175.method3035(class172.field2208, field691.field1283);
        var2.field2333.method3635(arg0);
        var2.field2333.method3583(arg1);
        field691.method2060(var2);
    }

    @ObfuscatedName("ab.hu(IIIILjava/lang/String;S)V")
    public static void method629(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method103(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2774 != null) {
            class58 var6 = new class58();
            var6.field571 = var5;
            var6.field568 = arg0;
            var6.field572 = arg4;
            var6.field576 = var5.field2774;
            class71.method997(var6);
        }
        boolean var7 = true;
        if (var5.field2742 > 0) {
            var7 = method146(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method4593(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class175 var11 = class175.method3035(class172.field2276, field691.field1283);
            var11.field2333.method3617(arg1);
            var11.field2333.method3450(arg2);
            var11.field2333.method3450(arg3);
            field691.method2060(var11);
        }
        if (arg0 == 2) {
            class175 var12 = class175.method3035(class172.field2229, field691.field1283);
            var12.field2333.method3617(arg1);
            var12.field2333.method3450(arg2);
            var12.field2333.method3450(arg3);
            field691.method2060(var12);
        }
        if (arg0 == 3) {
            class175 var13 = class175.method3035(class172.field2256, field691.field1283);
            var13.field2333.method3617(arg1);
            var13.field2333.method3450(arg2);
            var13.field2333.method3450(arg3);
            field691.method2060(var13);
        }
        if (arg0 == 4) {
            class175 var14 = class175.method3035(class172.field2227, field691.field1283);
            var14.field2333.method3617(arg1);
            var14.field2333.method3450(arg2);
            var14.field2333.method3450(arg3);
            field691.method2060(var14);
        }
        if (arg0 == 5) {
            class175 var15 = class175.method3035(class172.field2248, field691.field1283);
            var15.field2333.method3617(arg1);
            var15.field2333.method3450(arg2);
            var15.field2333.method3450(arg3);
            field691.method2060(var15);
        }
        if (arg0 == 6) {
            class175 var16 = class175.method3035(class172.field2274, field691.field1283);
            var16.field2333.method3617(arg1);
            var16.field2333.method3450(arg2);
            var16.field2333.method3450(arg3);
            field691.method2060(var16);
        }
        if (arg0 == 7) {
            class175 var17 = class175.method3035(class172.field2293, field691.field1283);
            var17.field2333.method3617(arg1);
            var17.field2333.method3450(arg2);
            var17.field2333.method3450(arg3);
            field691.method2060(var17);
        }
        if (arg0 == 8) {
            class175 var18 = class175.method3035(class172.field2222, field691.field1283);
            var18.field2333.method3617(arg1);
            var18.field2333.method3450(arg2);
            var18.field2333.method3450(arg3);
            field691.method2060(var18);
        }
        if (arg0 == 9) {
            class175 var19 = class175.method3035(class172.field2296, field691.field1283);
            var19.field2333.method3617(arg1);
            var19.field2333.method3450(arg2);
            var19.field2333.method3450(arg3);
            field691.method2060(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var20 = class175.method3035(class172.field2247, field691.field1283);
        var20.field2333.method3617(arg1);
        var20.field2333.method3450(arg2);
        var20.field2333.method3450(arg3);
        field691.method2060(var20);
    }

    @ObfuscatedName("ce.hn(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1915(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3445(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("gj.hd(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method3445(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field834 || field781 >= 500) {
            return;
        }
        field917[field781] = arg0;
        field787[field781] = arg1;
        field784[field781] = arg2;
        field785[field781] = arg3;
        field782[field781] = arg4;
        field783[field781] = arg5;
        field773[field781] = arg6;
        field781++;
    }

    @ObfuscatedName("ik.ir(II)Z")
    public static boolean method4679(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ag.iv(IB)Ljava/lang/String;")
    public static String method585(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field787[arg0].length() > 0) {
            return field917[arg0] + class240.field3019 + field787[arg0];
        } else {
            return field917[arg0];
        }
    }

    @ObfuscatedName("be.iw(IIIII)V")
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        if (field797 == 0 && !field799) {
            method1915(class240.field3013, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class123.field1714;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class123.method315(var4);
                    int var12 = Statics.method1996(var4);
                    class62 var13 = field699[field770];
                    method3090(var13, field770, var11, var12);
                }
                return;
            }
            long var14 = class123.field1715[var8];
            if (var6 != var14) {
                label277: {
                    var6 = var14;
                    int var18 = class123.method5290(var8);
                    int var19 = Statics.method1996(class123.field1715[var8]);
                    int var20 = var19;
                    int var21 = class123.method595(var8);
                    int var22 = class123.method180(var8);
                    if (var21 == 2 && Statics.field3174.method2885(Statics.field600, var18, var19, var14) >= 0) {
                        class271 var23 = class271.method4591(var22);
                        if (var23.field3481 != null) {
                            var23 = var23.method4871();
                        }
                        if (var23 == null) {
                            break label277;
                        }
                        if (field797 == 1) {
                            method1915(class240.field3078, field767 + " " + class76.field1116 + " " + class76.method3031(65535) + var23.field3462, 1, var22, var18, var19);
                        } else if (!field799) {
                            String[] var24 = var23.field3479;
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
                                        method1915(var24[var25], class76.method3031(65535) + var23.field3462, var26, var22, var18, var20);
                                    }
                                }
                            }
                            method1915(class240.field2967, class76.method3031(65535) + var23.field3462, 1002, var23.field3470, var18, var20);
                        } else if ((Statics.field3741 & 0x4) == 4) {
                            method1915(field802, field717 + " " + class76.field1116 + " " + class76.method3031(65535) + var23.field3462, 2, var22, var18, var19);
                        }
                    }
                    if (var21 == 1) {
                        class74 var27 = field807[var22];
                        if (var27 == null) {
                            break label277;
                        }
                        if (var27.field1103.field3601 == 1 && (var27.field954 & 0x7F) == 64 && (var27.field1000 & 0x7F) == 64) {
                            for (int var28 = 0; var28 < field687; var28++) {
                                class74 var29 = field807[field688[var28]];
                                if (var29 != null && var27 != var29 && var29.field1103.field3601 == 1 && var27.field954 == var29.field954 && var27.field1000 == var29.field1000) {
                                    method1634(var29.field1103, field688[var28], var18, var20);
                                }
                            }
                            int var30 = class84.field1227;
                            int[] var31 = class84.field1223;
                            for (int var32 = 0; var32 < var30; var32++) {
                                class62 var33 = field699[var31[var32]];
                                if (var33 != null && var27.field954 == var33.field954 && var27.field1000 == var33.field1000) {
                                    method3090(var33, var31[var32], var18, var20);
                                }
                            }
                        }
                        method1634(var27.field1103, var22, var18, var20);
                    }
                    if (var21 == 0) {
                        class62 var34 = field699[var22];
                        if (var34 == null) {
                            break label277;
                        }
                        if ((var34.field954 & 0x7F) == 64 && (var34.field1000 & 0x7F) == 64) {
                            for (int var35 = 0; var35 < field687; var35++) {
                                class74 var36 = field807[field688[var35]];
                                if (var36 != null && var36.field1103.field3601 == 1 && var34.field954 == var36.field954 && var34.field1000 == var36.field1000) {
                                    method1634(var36.field1103, field688[var35], var18, var20);
                                }
                            }
                            int var37 = class84.field1227;
                            int[] var38 = class84.field1223;
                            for (int var39 = 0; var39 < var37; var39++) {
                                class62 var40 = field699[var38[var39]];
                                if (var40 != null && var34 != var40 && var34.field954 == var40.field954 && var34.field1000 == var40.field1000) {
                                    method3090(var40, var38[var39], var18, var20);
                                }
                            }
                        }
                        if (field770 == var22) {
                            var4 = var14;
                        } else {
                            method3090(var34, var22, var18, var20);
                        }
                    }
                    if (var21 == 3) {
                        class208 var41 = field830[Statics.field600][var18][var20];
                        if (var41 != null) {
                            for (class82 var42 = (class82) var41.method3955(); var42 != null; var42 = (class82) var41.method3976()) {
                                class272 var43 = class272.method1995(var42.field1214);
                                if (field797 == 1) {
                                    method1915(class240.field3078, field767 + " " + class76.field1116 + " " + class76.method3031(16748608) + var43.field3516, 16, var42.field1214, var18, var20);
                                } else if (!field799) {
                                    String[] var44 = var43.field3527;
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
                                            method1915(var44[var45], class76.method3031(16748608) + var43.field3516, var46, var42.field1214, var18, var20);
                                        } else if (var45 == 2) {
                                            method1915(class240.field2856, class76.method3031(16748608) + var43.field3516, 20, var42.field1214, var18, var20);
                                        }
                                    }
                                    method1915(class240.field2967, class76.method3031(16748608) + var43.field3516, 1004, var42.field1214, var18, var20);
                                } else if ((Statics.field3741 & 0x1) == 1) {
                                    method1915(field802, field717 + " " + class76.field1116 + " " + class76.method3031(16748608) + var43.field3516, 17, var42.field1214, var18, var20);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("bj.ie(Ljv;IIII)V")
    public static final void method1634(class274 arg0, int arg1, int arg2, int arg3) {
        if (field781 >= 400) {
            return;
        }
        if (arg0.field3596 != null) {
            arg0 = arg0.method4983();
        }
        if (arg0 == null || !arg0.field3590 || arg0.field3587 && field814 != arg1) {
            return;
        }
        String var4 = arg0.field3570;
        if (arg0.field3577 != 0) {
            int var6 = arg0.field3577;
            int var7 = Statics.field1064.field612;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class76.method3031(16711680);
            } else if (var8 < -6) {
                var9 = class76.method3031(16723968);
            } else if (var8 < -3) {
                var9 = class76.method3031(16740352);
            } else if (var8 < 0) {
                var9 = class76.method3031(16756736);
            } else if (var8 > 9) {
                var9 = class76.method3031(65280);
            } else if (var8 > 6) {
                var9 = class76.method3031(4259584);
            } else if (var8 > 3) {
                var9 = class76.method3031(8453888);
            } else if (var8 > 0) {
                var9 = class76.method3031(12648192);
            } else {
                var9 = class76.method3031(16776960);
            }
            var4 = var4 + var9 + " " + class76.field1119 + class240.field3015 + arg0.field3577 + class76.field1120;
        }
        if (arg0.field3587 && field789) {
            method1915(class240.field2967, class76.method3031(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field797 == 1) {
            method1915(class240.field3078, field767 + " " + class76.field1116 + " " + class76.method3031(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field799) {
            int var10 = arg0.field3587 && field789 ? 2000 : 0;
            String[] var11 = arg0.field3566;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class240.field2932)) {
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
                        method1915(var11[var12], class76.method3031(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class240.field2932)) {
                        short var15 = 0;
                        if (field673 != class79.field1135) {
                            if (field673 == class79.field1140 || field673 == class79.field1142 && arg0.field3577 > Statics.field1064.field612) {
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
                            method1915(var11[var14], class76.method3031(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3587 || !field789) {
                method1915(class240.field2967, class76.method3031(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field3741 & 0x2) == 2) {
            method1915(field802, field717 + " " + class76.field1116 + " " + class76.method3031(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("es.ig(Lbk;IIIB)V")
    public static final void method3090(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1064 == arg0 || field781 >= 400) {
            return;
        }
        String var9;
        if (arg0.field618 == 0) {
            String var4 = arg0.field628[0] + arg0.field626 + arg0.field628[1];
            int var5 = arg0.field612;
            int var6 = Statics.field1064.field612;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class76.method3031(16711680);
            } else if (var7 < -6) {
                var8 = class76.method3031(16723968);
            } else if (var7 < -3) {
                var8 = class76.method3031(16740352);
            } else if (var7 < 0) {
                var8 = class76.method3031(16756736);
            } else if (var7 > 9) {
                var8 = class76.method3031(65280);
            } else if (var7 > 6) {
                var8 = class76.method3031(4259584);
            } else if (var7 > 3) {
                var8 = class76.method3031(8453888);
            } else if (var7 > 0) {
                var8 = class76.method3031(12648192);
            } else {
                var8 = class76.method3031(16776960);
            }
            var9 = var4 + var8 + " " + class76.field1119 + class240.field3015 + arg0.field612 + class76.field1120 + arg0.field628[2];
        } else {
            var9 = arg0.field628[0] + arg0.field626 + arg0.field628[1] + " " + class76.field1119 + class240.field3062 + arg0.field618 + class76.field1120 + arg0.field628[2];
        }
        if (field797 == 1) {
            method1915(class240.field3078, field767 + " " + class76.field1116 + " " + class76.method3031(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field799) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field768[var10] != null) {
                    short var11 = 0;
                    if (field768[var10].equalsIgnoreCase(class240.field2932)) {
                        if (field672 == class79.field1135) {
                            continue;
                        }
                        if (field672 == class79.field1140 || field672 == class79.field1142 && arg0.field612 > Statics.field1064.field612) {
                            var11 = 2000;
                        }
                        if (Statics.field1064.field623 != 0 && arg0.field623 != 0) {
                            if (Statics.field1064.field623 == arg0.field623) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field769[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field743[var10] + var11;
                    method1915(field768[var10], class76.method3031(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3741 & 0x8) == 8) {
            method1915(field802, field717 + " " + class76.field1116 + " " + class76.method3031(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field781; var14++) {
            if (field784[var14] == 23) {
                field787[var14] = class76.method3031(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("am.iq(IIIIIIIIB)V")
    public static final void method749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method3715(arg0)) {
            Statics.field166 = null;
            method2217(Statics.field1952[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field166 != null) {
                method2217(Statics.field166, -1412584499, arg1, arg2, arg3, arg4, Statics.field13, Statics.field2052, arg7);
                Statics.field166 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field849[var8] = true;
            }
        } else {
            field849[arg7] = true;
        }
    }

    @ObfuscatedName("cq.io([Lhn;IIIIIIIII)V")
    public static final void method2217(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class320.method5603(arg2, arg3, arg4, arg5);
        class125.method2798();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2701 == arg1 || arg1 == -1412584499 && field817 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field764[field854] = var10.field2681 + arg6;
                    field853[field854] = var10.field2773 + arg7;
                    field820[field854] = var10.field2683;
                    field855[field854] = var10.field2684;
                    var11 = ++field854 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2805 = var11;
                var10.field2806 = field656;
                if (!var10.field2686 || !method705(var10)) {
                    if (var10.field2742 > 0) {
                        method641(var10);
                    }
                    int var12 = var10.field2681 + arg6;
                    int var13 = var10.field2773 + arg7;
                    int var14 = var10.field2699;
                    if (field817 == var10) {
                        if (arg1 != -1412584499 && !var10.field2785) {
                            Statics.field166 = arg0;
                            Statics.field13 = arg6;
                            Statics.field2052 = arg7;
                            continue;
                        }
                        if (field828 && field822) {
                            int var15 = class49.field474;
                            int var16 = class49.field465 * -976212263;
                            int var17 = var15 - field907;
                            int var18 = var16 - field839;
                            if (var17 < field714) {
                                var17 = field714;
                            }
                            if (var10.field2683 + var17 > field714 + field818.field2683) {
                                var17 = field714 + field818.field2683 - var10.field2683;
                            }
                            if (var18 < field824) {
                                var18 = field824;
                            }
                            if (var10.field2684 + var18 > field824 + field818.field2684) {
                                var18 = field824 + field818.field2684 - var10.field2684;
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
                    if (var10.field2809 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2809 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2683 + var12;
                        int var26 = var10.field2684 + var13;
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
                        int var29 = var10.field2683 + var12;
                        int var30 = var10.field2684 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2686 || var19 < var21 && var20 < var22) {
                        if (var10.field2742 != 0) {
                            if (var10.field2742 == 1336) {
                                if (field887) {
                                    var13 += 15;
                                    Statics.field26.method5349("Fps:" + field435, var10.field2683 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field649) {
                                        var33 = 16711680;
                                    }
                                    Statics.field26.method5349("Mem:" + var32 + "k", var10.field2683 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2742 == 1337) {
                                field793 = var12;
                                field861 = var13;
                                method565(var12, var13, var10.field2683, var10.field2684);
                                field849[var10.field2805] = true;
                                class320.method5603(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2742 == 1338) {
                                method2052(var10, var12, var13, var11);
                                class320.method5603(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2742 == 1339) {
                                method2039(var10, var12, var13, var11);
                                class320.method5603(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2742 == 1400) {
                                Statics.field419.method5858(var12, var13, var10.field2683, var10.field2684, field656);
                            }
                            if (var10.field2742 == 1401) {
                                Statics.field419.method6011(var12, var13, var10.field2683, var10.field2684);
                            }
                        }
                        if (var10.field2809 == 0) {
                            if (!var10.field2686 && method705(var10) && Statics.field1994 != var10) {
                                continue;
                            }
                            if (!var10.field2686) {
                                if (var10.field2690 > var10.field2692 - var10.field2684) {
                                    var10.field2690 = var10.field2692 - var10.field2684;
                                }
                                if (var10.field2690 < 0) {
                                    var10.field2690 = 0;
                                }
                            }
                            method2217(arg0, var10.field2771, var19, var20, var21, var22, var12 - var10.field2712, var13 - var10.field2690, var11);
                            if (var10.field2792 != null) {
                                method2217(var10.field2792, var10.field2771, var19, var20, var21, var22, var12 - var10.field2712, var13 - var10.field2690, var11);
                            }
                            class57 var34 = (class57) field805.method3905((long) var10.field2771);
                            if (var34 != null) {
                                method749(var34.field557, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class320.method5603(arg2, arg3, arg4, arg5);
                            class125.method2798();
                        }
                        if (field676 || field707[var11] || field856 > 1) {
                            if (var10.field2809 == 0 && !var10.field2686 && var10.field2692 > var10.field2684) {
                                method204(var10.field2683 + var12, var13, var10.field2690, var10.field2684, var10.field2692);
                            }
                            if (var10.field2809 != 1) {
                                if (var10.field2809 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2680; var36++) {
                                        for (int var37 = 0; var37 < var10.field2679; var37++) {
                                            int var38 = (var10.field2735 + 32) * var37 + var12;
                                            int var39 = (var10.field2709 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2727[var35];
                                                var39 += var10.field2738[var35];
                                            }
                                            if (var10.field2763[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2763[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1026 == var10 && field752 == var35) {
                                                    class324 var43;
                                                    if (field797 == 1 && Statics.field221 == var35 && Statics.field1277 == var10.field2771) {
                                                        var43 = class272.method492(var42, var10.field2793[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class272.method492(var42, var10.field2793[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method642(var10);
                                                    } else if (Statics.field1026 == var10 && field752 == var35) {
                                                        int var44 = class49.field474 - field753;
                                                        int var45 = class49.field465 * -976212263 - field846;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field757 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5695(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class233 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class320.field3859 && var46.field2690 > 0) {
                                                                int var47 = field706 * (class320.field3859 - var39 - var45) / 3;
                                                                if (var47 > field706 * 10) {
                                                                    var47 = field706 * 10;
                                                                }
                                                                if (var47 > var46.field2690) {
                                                                    var47 = var46.field2690;
                                                                }
                                                                var46.field2690 -= var47;
                                                                field846 += var47;
                                                                method642(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class320.field3858 && var46.field2690 < var46.field2692 - var46.field2684) {
                                                                int var48 = field706 * (var39 + var45 + 32 - class320.field3858) / 3;
                                                                if (var48 > field706 * 10) {
                                                                    var48 = field706 * 10;
                                                                }
                                                                if (var48 > var46.field2692 - var46.field2684 - var46.field2690) {
                                                                    var48 = var46.field2692 - var46.field2684 - var46.field2690;
                                                                }
                                                                var46.field2690 += var48;
                                                                field846 -= var48;
                                                                method642(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2358 == var10 && field751 == var35) {
                                                        var43.method5695(var38, var39, 128);
                                                    } else {
                                                        var43.method5689(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2739 != null && var35 < 20) {
                                                class324 var49 = var10.method4340(var35);
                                                if (var49 != null) {
                                                    var49.method5689(var38, var39);
                                                } else if (class233.field2666) {
                                                    method642(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2809 == 3) {
                                    int var50;
                                    if (method221(var10)) {
                                        var50 = var10.field2694;
                                        if (Statics.field1994 == var10 && var10.field2696 != 0) {
                                            var50 = var10.field2696;
                                        }
                                    } else {
                                        var50 = var10.field2687;
                                        if (Statics.field1994 == var10 && var10.field2695 != 0) {
                                            var50 = var10.field2695;
                                        }
                                    }
                                    if (var10.field2697) {
                                        switch(var10.field2745.field3869) {
                                            case 1:
                                                class320.method5588(var12, var13, var10.field2683, var10.field2684, var10.field2687, var10.field2694);
                                                break;
                                            case 2:
                                                class320.method5575(var12, var13, var10.field2683, var10.field2684, var10.field2687, var10.field2694, 255 - (var10.field2699 & 0xFF), 255 - (var10.field2700 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class320.method5583(var12, var13, var10.field2683, var10.field2684, var50);
                                                } else {
                                                    class320.method5582(var12, var13, var10.field2683, var10.field2684, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class320.method5652(var12, var13, var10.field2683, var10.field2684, var50);
                                    } else {
                                        class320.method5587(var12, var13, var10.field2683, var10.field2684, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2809 == 4) {
                                    class301 var51 = var10.method4339();
                                    if (var51 != null) {
                                        String var52 = var10.field2729;
                                        int var53;
                                        if (method221(var10)) {
                                            var53 = var10.field2694;
                                            if (Statics.field1994 == var10 && var10.field2696 != 0) {
                                                var53 = var10.field2696;
                                            }
                                            if (var10.field2730.length() > 0) {
                                                var52 = var10.field2730;
                                            }
                                        } else {
                                            var53 = var10.field2687;
                                            if (Statics.field1994 == var10 && var10.field2695 != 0) {
                                                var53 = var10.field2695;
                                            }
                                        }
                                        if (var10.field2686 && var10.field2794 != -1) {
                                            class272 var54 = class272.method1995(var10.field2794);
                                            var52 = var54.field3516;
                                            if (var52 == null) {
                                                var52 = class240.field2863;
                                            }
                                            if ((var54.field3524 == 1 || var10.field2795 != 1) && var10.field2795 != -1) {
                                                var52 = class76.method3031(16748608) + var52 + class76.field1123 + " " + 'x' + method97(var10.field2795);
                                            }
                                        }
                                        if (field881 == var10) {
                                            var52 = class240.field3017;
                                            var53 = var10.field2687;
                                        }
                                        if (!var10.field2686) {
                                            var52 = Statics.method633(var52, var10);
                                        }
                                        var51.method5342(var52, var12, var13, var10.field2683, var10.field2684, var53, var10.field2717 ? 0 : -1, var10.field2682, var10.field2777, var10.field2731);
                                    } else if (class233.field2666) {
                                        method642(var10);
                                    }
                                } else if (var10.field2809 == 5) {
                                    if (var10.field2686) {
                                        class324 var56;
                                        if (var10.field2794 == -1) {
                                            var56 = var10.method4372(false);
                                        } else {
                                            var56 = class272.method492(var10.field2794, var10.field2795, var10.field2707, var10.field2708, var10.field2798, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3884;
                                            int var58 = var56.field3885;
                                            if (var10.field2706) {
                                                class320.method5577(var12, var13, var10.field2683 + var12, var10.field2684 + var13);
                                                int var59 = (var10.field2683 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2684 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2781 != 0) {
                                                            var56.method5707(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2781, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5689(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5695(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class320.method5603(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2683 * 4096 / var57;
                                                if (var10.field2781 != 0) {
                                                    var56.method5707(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13, var10.field2781, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5697(var12, var13, var10.field2683, var10.field2684, 256 - (var14 & 0xFF));
                                                } else if (var10.field2683 == var57 && var10.field2684 == var58) {
                                                    var56.method5689(var12, var13);
                                                } else {
                                                    var56.method5691(var12, var13, var10.field2683, var10.field2684);
                                                }
                                            }
                                        } else if (class233.field2666) {
                                            method642(var10);
                                        }
                                    } else {
                                        class324 var55 = var10.method4372(method221(var10));
                                        if (var55 != null) {
                                            var55.method5689(var12, var13);
                                        } else if (class233.field2666) {
                                            method642(var10);
                                        }
                                    }
                                } else if (var10.field2809 == 6) {
                                    boolean var64 = method221(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2716;
                                    } else {
                                        var65 = var10.field2715;
                                    }
                                    class122 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2794 != -1) {
                                        class272 var68 = class272.method1995(var10.field2794);
                                        if (var68 != null) {
                                            class272 var69 = var68.method4965(var10.field2795);
                                            var66 = var69.method4942(1);
                                            if (var66 == null) {
                                                method642(var10);
                                            } else {
                                                var66.method2671();
                                                var67 = var66.field1841 / 2;
                                            }
                                        }
                                    } else if (var10.field2741 == 5) {
                                        if (var10.field2756 == 0) {
                                            var66 = field909.method4301((class276) null, -1, (class276) null, -1);
                                        } else {
                                            var66 = Statics.field1064.method1130();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4341((class276) null, -1, var64, Statics.field1064.field631);
                                        if (var66 == null && class233.field2666) {
                                            method642(var10);
                                        }
                                    } else {
                                        class276 var70 = class276.method493(var65);
                                        var66 = var10.method4341(var70, var10.field2796, var64, Statics.field1064.field631);
                                        if (var66 == null && class233.field2666) {
                                            method642(var10);
                                        }
                                    }
                                    class125.method2784(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13);
                                    int var71 = var10.field2722 * class125.field1748[var10.field2733] >> 16;
                                    int var72 = var10.field2722 * class125.field1755[var10.field2733] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2686) {
                                            var66.method2671();
                                            if (var10.field2689) {
                                                var66.method2685(0, var10.field2720, var10.field2721, var10.field2733, var10.field2719, var10.field2718 + var67 + var71, var10.field2718 + var72, var10.field2722);
                                            } else {
                                                var66.method2723(0, var10.field2720, var10.field2721, var10.field2733, var10.field2719, var10.field2718 + var67 + var71, var10.field2718 + var72);
                                            }
                                        } else {
                                            var66.method2723(0, var10.field2720, 0, var10.field2733, 0, var71, var72);
                                        }
                                    }
                                    class125.method2812();
                                } else {
                                    if (var10.field2809 == 7) {
                                        class301 var73 = var10.method4339();
                                        if (var73 == null) {
                                            if (class233.field2666) {
                                                method642(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2680; var75++) {
                                            for (int var76 = 0; var76 < var10.field2679; var76++) {
                                                if (var10.field2763[var74] > 0) {
                                                    class272 var77 = class272.method1995(var10.field2763[var74] - 1);
                                                    String var78;
                                                    if (var77.field3524 != 1 && var10.field2793[var74] == 1) {
                                                        var78 = class76.method3031(16748608) + var77.field3516 + class76.field1123;
                                                    } else {
                                                        var78 = class76.method3031(16748608) + var77.field3516 + class76.field1123 + " " + 'x' + method97(var10.field2793[var74]);
                                                    }
                                                    int var79 = (var10.field2735 + 115) * var76 + var12;
                                                    int var80 = (var10.field2709 + 12) * var75 + var13;
                                                    if (var10.field2682 == 0) {
                                                        var73.method5390(var78, var79, var80, var10.field2687, var10.field2717 ? 0 : -1);
                                                    } else if (var10.field2682 == 1) {
                                                        var73.method5422(var78, var10.field2683 / 2 + var79, var80, var10.field2687, var10.field2717 ? 0 : -1);
                                                    } else {
                                                        var73.method5349(var78, var10.field2683 + var79 - 1, var80, var10.field2687, var10.field2717 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2809 == 8 && Statics.field496 == var10 && field796 == field795) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class301 var83 = Statics.field26;
                                        String var84 = var10.field2729;
                                        String var85 = Statics.method633(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class76.field1122);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5343(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3766 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2683 + var12 - 5 - var81;
                                        int var90 = var10.field2684 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class320.method5583(var89, var90, var81, var82, 16777120);
                                        class320.method5652(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2729;
                                        int var92 = var83.field3766 + var90 + 2;
                                        String var93 = Statics.method633(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class76.field1122);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5390(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3766 + 1;
                                        }
                                    }
                                    if (var10.field2809 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2702) {
                                            var96 = var12;
                                            var97 = var10.field2684 + var13;
                                            var98 = var10.field2683 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2683 + var12;
                                            var99 = var10.field2684 + var13;
                                        }
                                        if (var10.field2769 == 1) {
                                            class320.method5591(var96, var97, var98, var99, var10.field2687);
                                        } else {
                                            method3353(var96, var97, var98, var99, var10.field2687, var10.field2769);
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

    @ObfuscatedName("fq.il(IIIIIII)V")
    public static final void method3353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class320.field3854;
        int var18 = arg1 - class320.field3859;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class125.method2782(var19, var20, var21);
        class125.method2785(var23, var24, var25, var19, var20, var21, arg4);
        class125.method2782(var19, var21, var22);
        class125.method2785(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("n.ij(II)Ljava/lang/String;")
    public static final String method97(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field1117 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method3031(65408) + var1.substring(0, var1.length() - 8) + class240.field3020 + " " + class76.field1119 + var1 + class76.field1120 + class76.field1123;
        } else if (var1.length() > 6) {
            return " " + class76.method3031(16777215) + var1.substring(0, var1.length() - 4) + class240.field3022 + " " + class76.field1119 + var1 + class76.field1120 + class76.field1123;
        } else {
            return " " + class76.method3031(16776960) + var1 + class76.field1123;
        }
    }

    @ObfuscatedName("client.if(ZI)V")
    public final void method1169(boolean arg0) {
        method497(field804, Statics.field1039, Statics.field1938, arg0);
    }

    @ObfuscatedName("client.in(Lhn;I)V")
    public void method1478(class233 arg0) {
        class233 var2 = arg0.field2701 == -1 ? null : class233.method214(arg0.field2701);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1039;
            var4 = Statics.field1938;
        } else {
            var3 = var2.field2683;
            var4 = var2.field2684;
        }
        method3046(arg0, var3, var4, false);
        method2650(arg0, var3, var4);
    }

    @ObfuscatedName("hv.iz([Lhn;Lhn;ZI)V")
    public static void method4245(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2691 == 0 ? arg1.field2683 : arg1.field2691;
        int var4 = arg1.field2692 == 0 ? arg1.field2684 : arg1.field2692;
        method3270(arg0, arg1.field2771, var3, var4, arg2);
        if (arg1.field2792 != null) {
            method3270(arg1.field2792, arg1.field2771, var3, var4, arg2);
        }
        class57 var5 = (class57) field805.method3905((long) arg1.field2771);
        if (var5 != null) {
            method497(var5.field557, var3, var4, arg2);
        }
        if (arg1.field2742 == 1337) {
        }
    }

    @ObfuscatedName("ae.ib(IIIZI)V")
    public static final void method497(int arg0, int arg1, int arg2, boolean arg3) {
        if (class233.method3715(arg0)) {
            method3270(Statics.field1952[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fa.it([Lhn;IIIZB)V")
    public static void method3270(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2701 == arg1) {
                method3046(var6, arg2, arg3, arg4);
                method2650(var6, arg2, arg3);
                if (var6.field2712 > var6.field2691 - var6.field2683) {
                    var6.field2712 = var6.field2691 - var6.field2683;
                }
                if (var6.field2712 < 0) {
                    var6.field2712 = 0;
                }
                if (var6.field2690 > var6.field2692 - var6.field2684) {
                    var6.field2690 = var6.field2692 - var6.field2684;
                }
                if (var6.field2690 < 0) {
                    var6.field2690 = 0;
                }
                if (var6.field2809 == 0) {
                    method4245(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("em.iu(Lhn;IIZB)V")
    public static void method3046(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2683;
        int var5 = arg0.field2684;
        if (arg0.field2737 == 0) {
            arg0.field2683 = arg0.field2679;
        } else if (arg0.field2737 == 1) {
            arg0.field2683 = arg1 - arg0.field2679;
        } else if (arg0.field2737 == 2) {
            arg0.field2683 = arg0.field2679 * arg1 >> 14;
        }
        if (arg0.field2676 == 0) {
            arg0.field2684 = arg0.field2680;
        } else if (arg0.field2676 == 1) {
            arg0.field2684 = arg2 - arg0.field2680;
        } else if (arg0.field2676 == 2) {
            arg0.field2684 = arg0.field2680 * arg2 >> 14;
        }
        if (arg0.field2737 == 4) {
            arg0.field2683 = arg0.field2685 * arg0.field2684 / arg0.field2669;
        }
        if (arg0.field2676 == 4) {
            arg0.field2684 = arg0.field2683 * arg0.field2669 / arg0.field2685;
        }
        if (arg0.field2742 == 1337) {
            field816 = arg0;
        }
        if (arg3 && arg0.field2783 != null && (arg0.field2683 != var4 || arg0.field2684 != var5)) {
            class58 var6 = new class58();
            var6.field571 = arg0;
            var6.field576 = arg0.field2783;
            field843.method3957(var6);
        }
    }

    @ObfuscatedName("dq.ip(Lhn;III)V")
    public static void method2650(class233 arg0, int arg1, int arg2) {
        if (arg0.field2673 == 0) {
            arg0.field2681 = arg0.field2677;
        } else if (arg0.field2673 == 1) {
            arg0.field2681 = (arg1 - arg0.field2683) / 2 + arg0.field2677;
        } else if (arg0.field2673 == 2) {
            arg0.field2681 = arg1 - arg0.field2683 - arg0.field2677;
        } else if (arg0.field2673 == 3) {
            arg0.field2681 = arg0.field2677 * arg1 >> 14;
        } else if (arg0.field2673 == 4) {
            arg0.field2681 = (arg0.field2677 * arg1 >> 14) + (arg1 - arg0.field2683) / 2;
        } else {
            arg0.field2681 = arg1 - arg0.field2683 - (arg0.field2677 * arg1 >> 14);
        }
        if (arg0.field2674 == 0) {
            arg0.field2773 = arg0.field2752;
        } else if (arg0.field2674 == 1) {
            arg0.field2773 = (arg2 - arg0.field2684) / 2 + arg0.field2752;
        } else if (arg0.field2674 == 2) {
            arg0.field2773 = arg2 - arg0.field2684 - arg0.field2752;
        } else if (arg0.field2674 == 3) {
            arg0.field2773 = arg0.field2752 * arg2 >> 14;
        } else if (arg0.field2674 == 4) {
            arg0.field2773 = (arg0.field2752 * arg2 >> 14) + (arg2 - arg0.field2684) / 2;
        } else {
            arg0.field2773 = arg2 - arg0.field2684 - (arg0.field2752 * arg2 >> 14);
        }
    }

    @ObfuscatedName("bz.ih(Lhn;IIIIIII)V")
    public static final void method1001(class233 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field695) {
            field803 = 32;
        } else {
            field803 = 0;
        }
        field695 = false;
        if (class49.field470 == 1 || !Statics.field133 && class49.field470 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2690 -= 4;
                method642(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2690 += 4;
                method642(arg0);
            } else if (arg5 >= arg1 - field803 && arg5 < field803 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2690 = (arg4 - arg3) * var8 / var9;
                method642(arg0);
                field695 = true;
            }
        }
        if (field842 == 0) {
            return;
        }
        int var10 = arg0.field2683;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2690 += field842 * 45;
            method642(arg0);
        }
    }

    @ObfuscatedName("h.id(IIIIII)V")
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2466[0].method5668(arg0, arg1);
        Statics.field2466[1].method5668(arg0, arg1 + arg3 - 16);
        class320.method5583(arg0, arg1 + 16, 16, arg3 - 32, field918);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class320.method5583(arg0, arg1 + 16 + var6, 16, var5, field779);
        class320.method5590(arg0, arg1 + 16 + var6, var5, field710);
        class320.method5590(arg0 + 1, arg1 + 16 + var6, var5, field710);
        class320.method5634(arg0, arg1 + 16 + var6, 16, field710);
        class320.method5634(arg0, arg1 + 17 + var6, 16, field710);
        class320.method5590(arg0 + 15, arg1 + 16 + var6, var5, field884);
        class320.method5590(arg0 + 14, arg1 + 17 + var6, var5 - 1, field884);
        class320.method5634(arg0, arg1 + 15 + var6 + var5, 16, field884);
        class320.method5634(arg0 + 1, arg1 + 14 + var6 + var5, 15, field884);
    }

    @ObfuscatedName("gl.is(II)Ljava/lang/String;")
    public static final String method3690(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("a.ix(Lhn;I)Z")
    public static final boolean method221(class233 arg0) {
        if (arg0.field2787 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2787.length; var1++) {
            int var2 = method1866(arg0, var1);
            int var3 = arg0.field2779[var1];
            if (arg0.field2787[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bn.ic(Lhn;II)I")
    public static final int method1866(class233 arg0, int arg1) {
        if (arg0.field2786 == null || arg1 >= arg0.field2786.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2786[arg1];
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
                    var7 = field776[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field777[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field778[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class233 var11 = class233.method214(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class272.method1995(var12).field3513 || field648)) {
                        for (int var13 = 0; var13 < var11.field2763.length; var13++) {
                            if (var12 + 1 == var11.field2763[var13]) {
                                var7 += var11.field2793[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class228.field2630[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class237.field2845[field777[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class228.field2630[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1064.field612;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class237.field2843[var14]) {
                            var7 += field777[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class233 var17 = class233.method214(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class272.method1995(var18).field3513 || field648)) {
                        for (int var19 = 0; var19 < var17.field2763.length; var19++) {
                            if (var18 + 1 == var17.field2763[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field811;
                }
                if (var6 == 12) {
                    var7 = field852;
                }
                if (var6 == 13) {
                    int var20 = class228.field2630[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class228.method2246(var22);
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
                    var7 = (Statics.field1064.field954 >> 7) + Statics.field491;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1064.field1000 >> 7) + Statics.field92;
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

    @ObfuscatedName("j.im(Lhn;Ljw;IIZI)V")
    public static final void method143(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3542;
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
            var7 = class240.field3106;
        }
        if (var6 != -1 && var7 != null) {
            method3445(var7, class76.method3031(16748608) + arg1.field3516, var6, arg1.field3558, arg2, arg0.field2771, arg4);
        }
    }

    @ObfuscatedName("bx.ii(Lhn;III)V")
    public static final void method1843(class233 arg0, int arg1, int arg2) {
        if (arg0.field2671 == 1) {
            method1915(arg0.field2791, "", 24, 0, 0, arg0.field2771);
        }
        if (arg0.field2671 == 2 && !field799) {
            String var3 = method2037(arg0);
            if (var3 != null) {
                method1915(var3, class76.method3031(65280) + arg0.field2678, 25, 0, -1, arg0.field2771);
            }
        }
        if (arg0.field2671 == 3) {
            method1915(class240.field3018, "", 26, 0, 0, arg0.field2771);
        }
        if (arg0.field2671 == 4) {
            method1915(arg0.field2791, "", 28, 0, 0, arg0.field2771);
        }
        if (arg0.field2671 == 5) {
            method1915(arg0.field2791, "", 29, 0, 0, arg0.field2771);
        }
        if (arg0.field2671 == 6 && field881 == null) {
            method1915(arg0.field2791, "", 30, 0, -1, arg0.field2771);
        }
        if (arg0.field2809 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2684; var5++) {
                for (int var6 = 0; var6 < arg0.field2683; var6++) {
                    int var7 = (arg0.field2735 + 32) * var6;
                    int var8 = (arg0.field2709 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2727[var4];
                        var8 += arg0.field2738[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field798 = var4;
                        Statics.field105 = arg0;
                        if (arg0.field2763[var4] > 0) {
                            class272 var9 = class272.method1995(arg0.field2763[var4] - 1);
                            if (field797 == 1 && class234.method3358(method4593(arg0))) {
                                if (Statics.field1277 != arg0.field2771 || Statics.field221 != var4) {
                                    method1915(class240.field3078, field767 + " " + class76.field1116 + " " + class76.method3031(16748608) + var9.field3516, 31, var9.field3558, var4, arg0.field2771);
                                }
                            } else if (!field799 || !class234.method3358(method4593(arg0))) {
                                String[] var10 = var9.field3542;
                                int var11 = -1;
                                if (field790) {
                                    boolean var12 = field791 || class40.field381[81];
                                    if (var12) {
                                        var11 = var9.method4928();
                                    }
                                }
                                if (class234.method3358(method4593(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method143(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = method4593(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method1915(class240.field3078, class76.method3031(16748608) + var9.field3516, 38, var9.field3558, var4, arg0.field2771);
                                }
                                class234 var10000 = (class234) null;
                                if (class234.method3358(method4593(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11 != var16) {
                                            method143(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method143(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var17 = arg0.field2740;
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
                                            method1915(var17[var18], class76.method3031(16748608) + var9.field3516, var19, var9.field3558, var4, arg0.field2771);
                                        }
                                    }
                                }
                                method1915(class240.field2967, class76.method3031(16748608) + var9.field3516, 1005, var9.field3558, var4, arg0.field2771);
                            } else if ((Statics.field3741 & 0x10) == 16) {
                                method1915(field802, field717 + " " + class76.field1116 + " " + class76.method3031(16748608) + var9.field3516, 32, var9.field3558, var4, arg0.field2771);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2686) {
            return;
        }
        if (field799) {
            int var20 = method4593(arg0);
            boolean var21 = (var20 >> 21 & 0x1) != 0;
            if (var21 && (Statics.field3741 & 0x20) == 32) {
                method1915(field802, field717 + " " + class76.field1116 + " " + arg0.field2698, 58, 0, arg0.field2788, arg0.field2771);
            }
            return;
        }
        for (int var22 = 9; var22 >= 5; var22--) {
            int var23 = method4593(arg0);
            boolean var24 = (var23 >> var22 + 1 & 0x1) != 0;
            String var25;
            if (!var24 && arg0.field2774 == null) {
                var25 = null;
            } else if (arg0.field2732 == null || arg0.field2732.length <= var22 || arg0.field2732[var22] == null || arg0.field2732[var22].trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field2732[var22];
            }
            if (var25 != null) {
                method1915(var25, arg0.field2698, 1007, var22 + 1, arg0.field2788, arg0.field2771);
            }
        }
        String var27 = method2037(arg0);
        if (var27 != null) {
            method1915(var27, arg0.field2698, 25, 0, arg0.field2788, arg0.field2771);
        }
        for (int var28 = 4; var28 >= 0; var28--) {
            int var29 = method4593(arg0);
            boolean var30 = (var29 >> var28 + 1 & 0x1) != 0;
            String var31;
            if (!var30 && arg0.field2774 == null) {
                var31 = null;
            } else if (arg0.field2732 == null || arg0.field2732.length <= var28 || arg0.field2732[var28] == null || arg0.field2732[var28].trim().length() == 0) {
                var31 = null;
            } else {
                var31 = arg0.field2732[var28];
            }
            if (var31 != null) {
                method1915(var31, arg0.field2698, 57, var28 + 1, arg0.field2788, arg0.field2771);
            }
        }
        int var33 = method4593(arg0);
        boolean var34 = (var33 & 0x1) != 0;
        if (var34) {
            method1915(class240.field2861, "", 30, 0, arg0.field2788, arg0.field2771);
        }
    }

    @ObfuscatedName("bn.ia(ZI)V")
    public static void method1875(boolean arg0) {
        field791 = arg0;
    }

    @ObfuscatedName("bw.ik(I)Z")
    public static boolean method1085() {
        return field791;
    }

    @ObfuscatedName("b.jx(IIIIIIII)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class233.method3715(arg0)) {
            method748(Statics.field1952[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("am.ju([Lhn;IIIIIIII)V")
    public static final void method748(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && var9.field2701 == arg1 && (!var9.field2686 || var9.field2809 == 0 || var9.field2754 || method4593(var9) != 0 || field818 == var9 || var9.field2742 == 1338)) {
                if (var9.field2686) {
                    if (method705(var9)) {
                        continue;
                    }
                } else if (var9.field2809 == 0 && Statics.field1994 != var9 && method705(var9)) {
                    continue;
                }
                int var10 = var9.field2681 + arg6;
                int var11 = var9.field2773 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2809 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2809 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2683 + var10;
                    int var19 = var9.field2684 + var11;
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
                    int var22 = var9.field2683 + var10;
                    int var23 = var9.field2684 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field817 == var9) {
                    field825 = true;
                    field826 = var10;
                    field827 = var11;
                }
                boolean var24 = false;
                if (var9.field2725) {
                    switch(field806) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2771 >>> 16 == field643) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field643 == var9.field2771) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2686 || var12 < var14 && var13 < var15) {
                    if (var9.field2686) {
                        if (var9.field2808) {
                            if (class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15) {
                                for (class58 var25 = (class58) field843.method3979(); var25 != null; var25 = (class58) field843.method3964()) {
                                    if (var25.field564) {
                                        var25.method3952();
                                        var25.field571.field2799 = false;
                                    }
                                }
                                if (Statics.field2818 == 0) {
                                    field817 = null;
                                    field818 = null;
                                }
                                if (!field834) {
                                    method164();
                                }
                            }
                        } else if (var9.field2747 && class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15) {
                            for (class58 var26 = (class58) field843.method3979(); var26 != null; var26 = (class58) field843.method3964()) {
                                if (var26.field564 && var26.field571.field2775 == var26.field576) {
                                    var26.method3952();
                                }
                            }
                        }
                    }
                    int var27 = class49.field474;
                    int var28 = class49.field465 * -976212263;
                    if (class49.field478 != 0) {
                        var27 = class49.field479;
                        var28 = class49.field468;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2742 == 1337) {
                        if (!field655 && !field834 && var29) {
                            method1600(var27, var28, var12, var13);
                        }
                    } else if (var9.field2742 == 1338) {
                        method4039(var9, var10, var11);
                    } else {
                        if (var9.field2742 == 1400) {
                            Statics.field419.method5840(class49.field474, class49.field465 * -976212263, var29, var10, var11, var9.field2683, var9.field2684);
                        }
                        if (!field834 && var29) {
                            if (var9.field2742 == 1400) {
                                Statics.field419.method5939(var10, var11, var9.field2683, var9.field2684, var27, var28);
                            } else {
                                method1843(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2711.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2711[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2711[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2807 != null) {
                                            var34 = class40.field381[var9.field2711[var30][var33]];
                                        }
                                        if (method223(var9.field2711[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2807 != null && var9.field2807[var30] > field656) {
                                                break;
                                            }
                                            byte var35 = var9.field2744[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class40.field381[86] && !class40.field381[82] && !class40.field381[81]) && ((var35 & 0x2) == 0 || class40.field381[86]) && ((var35 & 0x1) == 0 || class40.field381[82]) && ((var35 & 0x4) == 0 || class40.field381[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method629(var30 + 1, var9.field2771, var9.field2788, var9.field2794, "");
                                    } else if (var30 == 10) {
                                        method3040();
                                        method1153(var9.field2771, var9.field2788, class234.method99(method4593(var9)), var9.field2794);
                                        field802 = method2037(var9);
                                        if (field802 == null) {
                                            field802 = class240.field2863;
                                        }
                                        field717 = var9.field2698 + class76.method3031(16777215);
                                    }
                                    int var36 = var9.field2766[var30];
                                    if (var9.field2807 == null) {
                                        var9.field2807 = new int[var9.field2711.length];
                                    }
                                    if (var9.field2746 == null) {
                                        var9.field2746 = new int[var9.field2711.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2807[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2807[var30] == 0) {
                                        var9.field2807[var30] = field656 + var36 + var9.field2746[var30];
                                    } else {
                                        var9.field2807[var30] = field656 + var36;
                                    }
                                }
                                if (!var31 && var9.field2807 != null) {
                                    var9.field2807[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2686) {
                            boolean var37;
                            if (class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class49.field470 == 1 || !Statics.field133 && class49.field470 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class49.field478 == 1 || !Statics.field133 && class49.field478 == 4) && class49.field479 >= var12 && class49.field468 >= var13 && class49.field479 < var14 && class49.field468 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method3038(var9, class49.field479 - var10, class49.field468 - var11);
                            }
                            if (var9.field2742 == 1400) {
                                Statics.field419.method6000(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field817 != null && field817 != var9 && var37 && class234.method3706(method4593(var9))) {
                                field812 = var9;
                            }
                            if (field818 == var9) {
                                field822 = true;
                                field714 = var10;
                                field824 = var11;
                            }
                            if (var9.field2754) {
                                if (var37 && field842 != 0 && var9.field2775 != null) {
                                    class58 var40 = new class58();
                                    var40.field564 = true;
                                    var40.field571 = var9;
                                    var40.field567 = field842;
                                    var40.field576 = var9.field2775;
                                    field843.method3957(var40);
                                }
                                if (field817 != null || Statics.field1026 != null || field834) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2670 && var39) {
                                    var9.field2670 = true;
                                    if (var9.field2657 != null) {
                                        class58 var41 = new class58();
                                        var41.field564 = true;
                                        var41.field571 = var9;
                                        var41.field566 = class49.field479 - var10;
                                        var41.field567 = class49.field468 - var11;
                                        var41.field576 = var9.field2657;
                                        field843.method3957(var41);
                                    }
                                }
                                if (var9.field2670 && var38 && var9.field2804 != null) {
                                    class58 var42 = new class58();
                                    var42.field564 = true;
                                    var42.field571 = var9;
                                    var42.field566 = class49.field474 - var10;
                                    var42.field567 = class49.field465 * -976212263 - var11;
                                    var42.field576 = var9.field2804;
                                    field843.method3957(var42);
                                }
                                if (var9.field2670 && !var38) {
                                    var9.field2670 = false;
                                    if (var9.field2757 != null) {
                                        class58 var43 = new class58();
                                        var43.field564 = true;
                                        var43.field571 = var9;
                                        var43.field566 = class49.field474 - var10;
                                        var43.field567 = class49.field465 * -976212263 - var11;
                                        var43.field576 = var9.field2757;
                                        field845.method3957(var43);
                                    }
                                }
                                if (var38 && var9.field2759 != null) {
                                    class58 var44 = new class58();
                                    var44.field564 = true;
                                    var44.field571 = var9;
                                    var44.field566 = class49.field474 - var10;
                                    var44.field567 = class49.field465 * -976212263 - var11;
                                    var44.field576 = var9.field2759;
                                    field843.method3957(var44);
                                }
                                if (!var9.field2799 && var37) {
                                    var9.field2799 = true;
                                    if (var9.field2760 != null) {
                                        class58 var45 = new class58();
                                        var45.field564 = true;
                                        var45.field571 = var9;
                                        var45.field566 = class49.field474 - var10;
                                        var45.field567 = class49.field465 * -976212263 - var11;
                                        var45.field576 = var9.field2760;
                                        field843.method3957(var45);
                                    }
                                }
                                if (var9.field2799 && var37 && var9.field2761 != null) {
                                    class58 var46 = new class58();
                                    var46.field564 = true;
                                    var46.field571 = var9;
                                    var46.field566 = class49.field474 - var10;
                                    var46.field567 = class49.field465 * -976212263 - var11;
                                    var46.field576 = var9.field2761;
                                    field843.method3957(var46);
                                }
                                if (var9.field2799 && !var37) {
                                    var9.field2799 = false;
                                    if (var9.field2762 != null) {
                                        class58 var47 = new class58();
                                        var47.field564 = true;
                                        var47.field571 = var9;
                                        var47.field566 = class49.field474 - var10;
                                        var47.field567 = class49.field465 * -976212263 - var11;
                                        var47.field576 = var9.field2762;
                                        field845.method3957(var47);
                                    }
                                }
                                if (var9.field2659 != null) {
                                    class58 var48 = new class58();
                                    var48.field571 = var9;
                                    var48.field576 = var9.field2659;
                                    field844.method3957(var48);
                                }
                                if (var9.field2767 != null && field831 > var9.field2802) {
                                    if (var9.field2768 == null || field831 - var9.field2802 > 32) {
                                        class58 var53 = new class58();
                                        var53.field571 = var9;
                                        var53.field576 = var9.field2767;
                                        field843.method3957(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2802; var49 < field831; var49++) {
                                            int var50 = field654[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2768.length; var51++) {
                                                if (var9.field2768[var51] == var50) {
                                                    class58 var52 = new class58();
                                                    var52.field571 = var9;
                                                    var52.field576 = var9.field2767;
                                                    field843.method3957(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2802 = field831;
                                }
                                if (var9.field2661 != null && field833 > var9.field2803) {
                                    if (var9.field2770 == null || field833 - var9.field2803 > 32) {
                                        class58 var58 = new class58();
                                        var58.field571 = var9;
                                        var58.field576 = var9.field2661;
                                        field843.method3957(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2803; var54 < field833; var54++) {
                                            int var55 = field832[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2770.length; var56++) {
                                                if (var9.field2770[var56] == var55) {
                                                    class58 var57 = new class58();
                                                    var57.field571 = var9;
                                                    var57.field576 = var9.field2661;
                                                    field843.method3957(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2803 = field833;
                                }
                                if (var9.field2668 != null && field835 > var9.field2736) {
                                    if (var9.field2772 == null || field835 - var9.field2736 > 32) {
                                        class58 var63 = new class58();
                                        var63.field571 = var9;
                                        var63.field576 = var9.field2668;
                                        field843.method3957(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2736; var59 < field835; var59++) {
                                            int var60 = field775[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2772.length; var61++) {
                                                if (var9.field2772[var61] == var60) {
                                                    class58 var62 = new class58();
                                                    var62.field571 = var9;
                                                    var62.field576 = var9.field2668;
                                                    field843.method3957(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2736 = field835;
                                }
                                if (field836 > var9.field2801 && var9.field2776 != null) {
                                    class58 var64 = new class58();
                                    var64.field571 = var9;
                                    var64.field576 = var9.field2776;
                                    field843.method3957(var64);
                                }
                                if (field837 > var9.field2801 && var9.field2778 != null) {
                                    class58 var65 = new class58();
                                    var65.field571 = var9;
                                    var65.field576 = var9.field2778;
                                    field843.method3957(var65);
                                }
                                if (field838 > var9.field2801 && var9.field2748 != null) {
                                    class58 var66 = new class58();
                                    var66.field571 = var9;
                                    var66.field576 = var9.field2748;
                                    field843.method3957(var66);
                                }
                                if (field859 > var9.field2801 && var9.field2784 != null) {
                                    class58 var67 = new class58();
                                    var67.field571 = var9;
                                    var67.field576 = var9.field2784;
                                    field843.method3957(var67);
                                }
                                if (field840 > var9.field2801 && var9.field2797 != null) {
                                    class58 var68 = new class58();
                                    var68.field571 = var9;
                                    var68.field576 = var9.field2797;
                                    field843.method3957(var68);
                                }
                                if (field686 > var9.field2801 && var9.field2780 != null) {
                                    class58 var69 = new class58();
                                    var69.field571 = var9;
                                    var69.field576 = var9.field2780;
                                    field843.method3957(var69);
                                }
                                var9.field2801 = field829;
                                if (var9.field2667 != null) {
                                    for (int var70 = 0; var70 < field866; var70++) {
                                        class58 var71 = new class58();
                                        var71.field571 = var9;
                                        var71.field570 = field868[var70];
                                        var71.field563 = field847[var70];
                                        var71.field576 = var9.field2667;
                                        field843.method3957(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2686) {
                            if (field817 != null || Statics.field1026 != null || field834) {
                                continue;
                            }
                            if ((var9.field2789 >= 0 || var9.field2695 != 0) && class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15) {
                                if (var9.field2789 >= 0) {
                                    Statics.field1994 = arg0[var9.field2789];
                                } else {
                                    Statics.field1994 = var9;
                                }
                            }
                            if (var9.field2809 == 8 && class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15) {
                                Statics.field496 = var9;
                            }
                            if (var9.field2692 > var9.field2684) {
                                method1001(var9, var9.field2683 + var10, var11, var9.field2684, var9.field2692, class49.field474, class49.field465 * -976212263);
                            }
                        }
                        if (var9.field2809 == 0) {
                            method748(arg0, var9.field2771, var12, var13, var14, var15, var10 - var9.field2712, var11 - var9.field2690);
                            if (var9.field2792 != null) {
                                method748(var9.field2792, var9.field2771, var12, var13, var14, var15, var10 - var9.field2712, var11 - var9.field2690);
                            }
                            class57 var72 = (class57) field805.method3905((long) var9.field2771);
                            if (var72 != null) {
                                if (var72.field561 == 0 && class49.field474 >= var12 && class49.field465 * -976212263 >= var13 && class49.field474 < var14 && class49.field465 * -976212263 < var15 && !field834) {
                                    for (class58 var73 = (class58) field843.method3979(); var73 != null; var73 = (class58) field843.method3964()) {
                                        if (var73.field564) {
                                            var73.method3952();
                                            var73.field571.field2799 = false;
                                        }
                                    }
                                    if (Statics.field2818 == 0) {
                                        field817 = null;
                                        field818 = null;
                                    }
                                    if (!field834) {
                                        method164();
                                    }
                                }
                                method83(var72.field557, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ja(II)Z")
    public static boolean method223(int arg0) {
        for (int var1 = 0; var1 < field866; var1++) {
            if (field868[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("aj.jf(III)V")
    public static final void method548(int arg0, int arg1) {
        if (class233.method3715(arg0)) {
            method316(Statics.field1952[arg0], arg1);
        }
    }

    @ObfuscatedName("y.jh([Lhn;II)V")
    public static final void method316(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2809 == 0) {
                    if (var3.field2792 != null) {
                        method316(var3.field2792, arg1);
                    }
                    class57 var4 = (class57) field805.method3905((long) var3.field2771);
                    if (var4 != null) {
                        method548(var4.field557, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2790 != null) {
                    class58 var5 = new class58();
                    var5.field571 = var3;
                    var5.field576 = var3.field2790;
                    class71.method997(var5);
                }
                if (arg1 == 1 && var3.field2782 != null) {
                    if (var3.field2788 >= 0) {
                        class233 var6 = class233.method214(var3.field2771);
                        if (var6 == null || var6.field2792 == null || var3.field2788 >= var6.field2792.length || var6.field2792[var3.field2788] != var3) {
                            continue;
                        }
                    }
                    class58 var7 = new class58();
                    var7.field571 = var3;
                    var7.field576 = var3.field2782;
                    class71.method997(var7);
                }
            }
        }
    }

    @ObfuscatedName("ey.jk(Lhn;III)V")
    public static final void method3038(class233 arg0, int arg1, int arg2) {
        if (field817 != null || field834 || arg0 == null) {
            return;
        }
        class233 var3 = method4418(arg0);
        if (var3 == null) {
            var3 = arg0.field2749;
        }
        if (var3 == null) {
            return;
        }
        field817 = arg0;
        class233 var5 = method4418(arg0);
        if (var5 == null) {
            var5 = arg0.field2749;
        }
        field818 = var5;
        field907 = arg1;
        field839 = arg2;
        Statics.field2818 = 0;
        field828 = false;
        int var7 = field781 - 1;
        if (var7 != -1) {
            method11(var7);
        }
        return;
    }

    @ObfuscatedName("client.je(I)V")
    public final void method1256() {
        method642(field817);
        Statics.field2818++;
        if (field825 && field822) {
            int var1 = class49.field474;
            int var2 = class49.field465 * -976212263;
            int var3 = var1 - field907;
            int var4 = var2 - field839;
            if (var3 < field714) {
                var3 = field714;
            }
            if (field817.field2683 + var3 > field714 + field818.field2683) {
                var3 = field714 + field818.field2683 - field817.field2683;
            }
            if (var4 < field824) {
                var4 = field824;
            }
            if (field817.field2684 + var4 > field824 + field818.field2684) {
                var4 = field824 + field818.field2684 - field817.field2684;
            }
            int var5 = var3 - field826;
            int var6 = var4 - field827;
            int var7 = field817.field2750;
            if (Statics.field2818 > field817.field2800 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field828 = true;
            }
            int var8 = field818.field2712 + (var3 - field714);
            int var9 = field818.field2690 + (var4 - field824);
            if (field817.field2713 != null && field828) {
                class58 var10 = new class58();
                var10.field571 = field817;
                var10.field566 = var8;
                var10.field567 = var9;
                var10.field576 = field817.field2713;
                class71.method997(var10);
            }
            if (class49.field470 == 0) {
                if (field828) {
                    if (field817.field2764 != null) {
                        class58 var11 = new class58();
                        var11.field571 = field817;
                        var11.field566 = var8;
                        var11.field567 = var9;
                        var11.field569 = field812;
                        var11.field576 = field817.field2764;
                        class71.method997(var11);
                    }
                    if (field812 != null && method4418(field817) != null) {
                        class175 var12 = class175.method3035(class172.field2265, field691.field1283);
                        var12.field2333.method3583(field817.field2788);
                        var12.field2333.method3583(field812.field2794);
                        var12.field2333.method3450(field812.field2788);
                        var12.field2333.method3509(field817.field2771);
                        var12.field2333.method3589(field812.field2771);
                        var12.field2333.method3450(field817.field2794);
                        field691.method2060(var12);
                    }
                } else if (this.method1167()) {
                    this.method1520(field907 + field826, field839 + field827);
                } else if (field781 > 0) {
                    method747(field907 + field826, field839 + field827);
                }
                field817 = null;
            }
        } else if (Statics.field2818 > 1) {
            field817 = null;
        }
    }

    @ObfuscatedName("g.ji(II)V")
    public static void method11(int arg0) {
        Statics.field521 = new class77();
        Statics.field521.field1126 = field782[arg0];
        Statics.field521.field1125 = field783[arg0];
        Statics.field521.field1124 = field784[arg0];
        Statics.field521.field1127 = field785[arg0];
        Statics.field521.field1128 = field917[arg0];
    }

    @ObfuscatedName("am.jj(III)V")
    public static void method747(int arg0, int arg1) {
        class77 var2 = Statics.field521;
        method179(var2.field1126, var2.field1125, var2.field1124, var2.field1127, var2.field1128, var2.field1128, arg0, arg1);
        Statics.field521 = null;
    }

    @ObfuscatedName("at.jb(Lhn;I)V")
    public static void method642(class233 arg0) {
        if (field848 == arg0.field2806) {
            field849[arg0.field2805] = true;
        }
    }

    @ObfuscatedName("g.jd(I)V")
    public static void method12() {
        for (class57 var0 = (class57) field805.method3916(); var0 != null; var0 = (class57) field805.method3910()) {
            int var1 = var0.field557;
            if (class233.method3715(var1)) {
                boolean var2 = true;
                class233[] var3 = Statics.field1952[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2686;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2497;
                    class233 var6 = class233.method214(var5);
                    if (var6 != null) {
                        method642(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fg.jw(II)V")
    public static final void method3259(int arg0) {
        if (!class233.method3715(arg0)) {
            return;
        }
        class233[] var1 = Statics.field1952[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2796 = 0;
                var3.field2751 = 0;
            }
        }
    }

    @ObfuscatedName("bz.jq([Lhn;IB)V")
    public static final void method998(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2701 == arg1 && (!var3.field2686 || !method705(var3))) {
                if (var3.field2809 == 0) {
                    if (!var3.field2686 && method705(var3) && Statics.field1994 != var3) {
                        continue;
                    }
                    method998(arg0, var3.field2771);
                    if (var3.field2792 != null) {
                        method998(var3.field2792, var3.field2771);
                    }
                    class57 var4 = (class57) field805.method3905((long) var3.field2771);
                    if (var4 != null) {
                        int var5 = var4.field557;
                        if (class233.method3715(var5)) {
                            method998(Statics.field1952[var5], -1);
                        }
                    }
                }
                if (var3.field2809 == 6) {
                    if (var3.field2715 != -1 || var3.field2716 != -1) {
                        boolean var6 = method221(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2716;
                        } else {
                            var7 = var3.field2715;
                        }
                        if (var7 != -1) {
                            class276 var8 = class276.method493(var7);
                            var3.field2751 += field706;
                            while (var3.field2751 > var8.field3631[var3.field2796]) {
                                var3.field2751 -= var8.field3631[var3.field2796];
                                var3.field2796++;
                                if (var3.field2796 >= var8.field3624.length) {
                                    var3.field2796 -= var8.field3625;
                                    if (var3.field2796 < 0 || var3.field2796 >= var8.field3624.length) {
                                        var3.field2796 = 0;
                                    }
                                }
                                method642(var3);
                            }
                        }
                    }
                    if (var3.field2724 != 0 && !var3.field2686) {
                        int var9 = var3.field2724 >> 16;
                        int var10 = var3.field2724 << 16 >> 16;
                        int var11 = field706 * var9;
                        int var12 = field706 * var10;
                        var3.field2733 = var3.field2733 + var11 & 0x7FF;
                        var3.field2720 = var3.field2720 + var12 & 0x7FF;
                        method642(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hv.jv(II)V")
    public static final void method4246(int arg0) {
        method12();
        Statics.method4173();
        int var1 = class257.method3104(arg0).field3306;
        if (var1 == 0) {
            return;
        }
        int var2 = class228.field2630[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class125.method2779(0.9D);
                ((class114) Statics.field1753).method2541(0.9D);
            }
            if (var2 == 2) {
                class125.method2779(0.8D);
                ((class114) Statics.field1753).method2541(0.8D);
            }
            if (var2 == 3) {
                class125.method2779(0.7D);
                ((class114) Statics.field1753).method2541(0.7D);
            }
            if (var2 == 4) {
                class125.method2779(0.6D);
                ((class114) Statics.field1753).method2541(0.6D);
            }
            class272.field3547.method3880();
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
            if (field878 != var3) {
                if (field878 == 0 && field879 != -1) {
                    class220.method3262(Statics.field2118, field879, 0, var3, false);
                    field880 = false;
                } else if (var3 == 0) {
                    class220.method323();
                    field880 = false;
                } else {
                    class220.method3042(var3);
                }
                field878 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field889 = 127;
            }
            if (var2 == 1) {
                field889 = 96;
            }
            if (var2 == 2) {
                field889 = 64;
            }
            if (var2 == 3) {
                field889 = 32;
            }
            if (var2 == 4) {
                field889 = 0;
            }
        }
        if (var1 == 5) {
            field867 = var2;
        }
        if (var1 == 6) {
            field808 = var2;
        }
        if (var1 == 9) {
            field809 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field882 = 127;
            }
            if (var2 == 1) {
                field882 = 96;
            }
            if (var2 == 2) {
                field882 = 64;
            }
            if (var2 == 3) {
                field882 = 32;
            }
            if (var2 == 4) {
                field882 = 0;
            }
        }
        if (var1 == 17) {
            field814 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field672 = (class79) class180.method712(class79.method708(), var2);
            if (field672 == null) {
                field672 = class79.field1142;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field770 = -1;
            } else {
                field770 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field673 = (class79) class180.method712(class79.method708(), var2);
            if (field673 == null) {
                field673 = class79.field1142;
            }
        }
    }

    @ObfuscatedName("at.jy(Lhn;I)V")
    public static final void method641(class233 arg0) {
        int var1 = arg0.field2742;
        if (var1 == 324) {
            if (field875 == -1) {
                field875 = arg0.field2703;
                field911 = arg0.field2704;
            }
            if (field909.field2638) {
                arg0.field2703 = field875;
            } else {
                arg0.field2703 = field911;
            }
        } else if (var1 == 325) {
            if (field875 == -1) {
                field875 = arg0.field2703;
                field911 = arg0.field2704;
            }
            if (field909.field2638) {
                arg0.field2703 = field911;
            } else {
                arg0.field2703 = field875;
            }
        } else if (var1 == 327) {
            arg0.field2733 = 150;
            arg0.field2720 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2741 = 5;
            arg0.field2756 = 0;
        } else if (var1 == 328) {
            arg0.field2733 = 150;
            arg0.field2720 = (int) (Math.sin((double) field656 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2741 = 5;
            arg0.field2756 = 1;
        }
    }

    @ObfuscatedName("al.jg(I)V")
    public static final void method704() {
        class175 var0 = class175.method3035(class172.field2228, field691.field1283);
        field691.method2060(var0);
        for (class57 var1 = (class57) field805.method3916(); var1 != null; var1 = (class57) field805.method3910()) {
            if (var1.field561 == 0 || var1.field561 == 3) {
                method68(var1, true);
            }
        }
        if (field881 != null) {
            method642(field881);
            field881 = null;
        }
    }

    @ObfuscatedName("b.jz(Lbp;ZS)V")
    public static final void method68(class57 arg0, boolean arg1) {
        int var2 = arg0.field557;
        int var3 = (int) arg0.field2497;
        arg0.method3952();
        if (arg1) {
            class233.method1912(var2);
        }
        method4331(var2);
        class233 var4 = class233.method214(var3);
        if (var4 != null) {
            method642(var4);
        }
        for (int var5 = 0; var5 < field781; var5++) {
            if (method4679(field784[var5])) {
                if (var5 < field781 - 1) {
                    for (int var6 = var5; var6 < field781 - 1; var6++) {
                        field917[var6] = field917[var6 + 1];
                        field787[var6] = field787[var6 + 1];
                        field784[var6] = field784[var6 + 1];
                        field785[var6] = field785[var6 + 1];
                        field782[var6] = field782[var6 + 1];
                        field783[var6] = field783[var6 + 1];
                        field773[var6] = field773[var6 + 1];
                    }
                }
                var5--;
                field781--;
            }
        }
        method1884();
        if (field804 != -1) {
            method548(field804, 1);
        }
    }

    @ObfuscatedName("x.jn(Lhn;I)Z")
    public static final boolean method146(class233 arg0) {
        int var1 = arg0.field2742;
        if (var1 == 205) {
            field726 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field909.method4296(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field909.method4297(var4, var5 == 1);
        }
        if (var1 == 324) {
            field909.method4298(false);
        }
        if (var1 == 325) {
            field909.method4298(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method3035(class172.field2220, field691.field1283);
            field909.method4299(var6.field2333);
            field691.method2060(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ca.jt(Lhn;IIIB)V")
    public static final void method2052(class233 arg0, int arg1, int arg2, int arg3) {
        method3257();
        class227 var4 = arg0.method4376(false);
        if (var4 == null) {
            return;
        }
        class320.method5603(arg1, arg2, var4.field2627 + arg1, var4.field2622 + arg2);
        if (field877 == 2 || field877 == 5) {
            class320.method5594(arg1, arg2, 0, var4.field2624, var4.field2623);
        } else {
            int var5 = field659 & 0x7FF;
            int var6 = Statics.field1064.field954 / 32 + 48;
            int var7 = 464 - Statics.field1064.field1000 / 32;
            Statics.field30.method5705(arg1, arg2, var4.field2627, var4.field2622, var6, var7, var5, 256, var4.field2624, var4.field2623);
            for (int var8 = 0; var8 < field821; var8++) {
                int var9 = field872[var8] * 4 + 2 - Statics.field1064.field954 / 32;
                int var10 = field873[var8] * 4 + 2 - Statics.field1064.field1000 / 32;
                method1032(arg1, arg2, var9, var10, field874[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class208 var13 = field830[Statics.field600][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1064.field954 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1064.field1000 / 32;
                        method1032(arg1, arg2, var14, var15, Statics.field462[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field687; var16++) {
                class74 var17 = field807[field688[var16]];
                if (var17 != null && var17.method1104()) {
                    class274 var18 = var17.field1103;
                    if (var18 != null && var18.field3596 != null) {
                        var18 = var18.method4983();
                    }
                    if (var18 != null && var18.field3586 && var18.field3590) {
                        int var19 = var17.field954 / 32 - Statics.field1064.field954 / 32;
                        int var20 = var17.field1000 / 32 - Statics.field1064.field1000 / 32;
                        method1032(arg1, arg2, var19, var20, Statics.field462[1], var4);
                    }
                }
            }
            int var21 = class84.field1227;
            int[] var22 = class84.field1223;
            for (int var23 = 0; var23 < var21; var23++) {
                class62 var24 = field699[var22[var23]];
                if (var24 != null && var24.method1104() && !var24.field627 && Statics.field1064 != var24) {
                    int var25 = var24.field954 / 32 - Statics.field1064.field954 / 32;
                    int var26 = var24.field1000 / 32 - Statics.field1064.field1000 / 32;
                    boolean var27 = false;
                    if (Statics.field1064.field623 != 0 && var24.field623 != 0 && Statics.field1064.field623 == var24.field623) {
                        var27 = true;
                    }
                    if (var24.method1094()) {
                        method1032(arg1, arg2, var25, var26, Statics.field462[3], var4);
                    } else if (var27) {
                        method1032(arg1, arg2, var25, var26, Statics.field462[4], var4);
                    } else if (var24.method1097()) {
                        method1032(arg1, arg2, var25, var26, Statics.field462[5], var4);
                    } else {
                        method1032(arg1, arg2, var25, var26, Statics.field462[2], var4);
                    }
                }
            }
            if (field664 != 0 && field656 % 20 < 10) {
                if (field664 == 1 && field665 >= 0 && field665 < field807.length) {
                    class74 var28 = field807[field665];
                    if (var28 != null) {
                        int var29 = var28.field954 / 32 - Statics.field1064.field954 / 32;
                        int var30 = var28.field1000 / 32 - Statics.field1064.field1000 / 32;
                        method4657(arg1, arg2, var29, var30, Statics.field2422[1], var4);
                    }
                }
                if (field664 == 2) {
                    int var31 = field667 * 4 - Statics.field491 * 4 + 2 - Statics.field1064.field954 / 32;
                    int var32 = field668 * 4 - Statics.field92 * 4 + 2 - Statics.field1064.field1000 / 32;
                    method4657(arg1, arg2, var31, var32, Statics.field2422[1], var4);
                }
                if (field664 == 10 && field666 >= 0 && field666 < field699.length) {
                    class62 var33 = field699[field666];
                    if (var33 != null) {
                        int var34 = var33.field954 / 32 - Statics.field1064.field954 / 32;
                        int var35 = var33.field1000 / 32 - Statics.field1064.field1000 / 32;
                        method4657(arg1, arg2, var34, var35, Statics.field2422[1], var4);
                    }
                }
            }
            if (field723 != 0) {
                int var36 = field723 * 4 + 2 - Statics.field1064.field954 / 32;
                int var37 = field876 * 4 + 2 - Statics.field1064.field1000 / 32;
                method1032(arg1, arg2, var36, var37, Statics.field2422[0], var4);
            }
            if (!Statics.field1064.field627) {
                class320.method5583(var4.field2627 / 2 + arg1 - 1, var4.field2622 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field850[arg3] = true;
    }

    @ObfuscatedName("cy.jc(Lhn;IIIB)V")
    public static final void method2039(class233 arg0, int arg1, int arg2, int arg3) {
        class227 var4 = arg0.method4376(false);
        if (var4 == null) {
            return;
        }
        if (field877 < 3) {
            Statics.field552.method5705(arg1, arg2, var4.field2627, var4.field2622, 25, 25, field659, 256, var4.field2624, var4.field2623);
        } else {
            class320.method5594(arg1, arg2, 0, var4.field2624, var4.field2623);
        }
    }

    @ObfuscatedName("ii.js(IIIILls;Lhx;B)V")
    public static final void method4657(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1032(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field659 & 0x7FF;
        int var8 = class125.field1748[var7];
        int var9 = class125.field1755[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2627 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field99.method5692(arg5.field2627 / 2 + arg0 - var17 / 2 + var15, arg5.field2622 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bp.jp(IIIILls;Lhx;I)V")
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field659 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1748[var6];
        int var9 = class125.field1755[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5704(arg5.field2627 / 2 + var10 - arg4.field3884 / 2, arg5.field2622 / 2 - var11 - arg4.field3885 / 2, arg0, arg1, arg5.field2627, arg5.field2622, arg5.field2624, arg5.field2623);
        } else {
            arg4.method5689(arg5.field2627 / 2 + arg0 + var10 - arg4.field3884 / 2, arg5.field2622 / 2 + arg1 - var11 - arg4.field3885 / 2);
        }
    }

    @ObfuscatedName("ip.jm(I)V")
    public static final void method4527() {
        for (int var0 = 0; var0 < class84.field1227; var0++) {
            class62 var1 = field699[class84.field1223[var0]];
            var1.method1095();
        }
        Iterator var2 = class86.field1250.iterator();
        while (var2.hasNext()) {
            class60 var3 = (class60) var2.next();
            var3.method1064();
        }
        if (Statics.field27 != null) {
            Statics.field27.method5294();
        }
    }

    @ObfuscatedName("e.jr(B)V")
    public static final void method21() {
        class86.method3221();
        if (Statics.field27 != null) {
            Statics.field27.method5300();
        }
    }

    @ObfuscatedName("ai.jo(B)V")
    public static final void method681() {
        field838 = field829;
        Statics.field222 = true;
    }

    @ObfuscatedName("c.kb(Ljava/lang/String;I)V")
    public static final void method44(String arg0) {
        if (Statics.field27 != null) {
            class175 var1 = class175.method3035(class172.field2221, field691.field1283);
            var1.field2333.method3501(class185.method2245(arg0));
            var1.field2333.method3585(arg0);
            field691.method2060(var1);
        }
    }

    @ObfuscatedName("jb.kd(Ljava/lang/String;B)V")
    public static final void method4847(String arg0) {
        if (!arg0.equals("")) {
            class175 var1 = class175.method3035(class172.field2292, field691.field1283);
            var1.field2333.method3501(class185.method2245(arg0));
            var1.field2333.method3585(arg0);
            field691.method2060(var1);
        }
    }

    @ObfuscatedName("bs.ka(I)V")
    public static final void method985() {
        class175 var0 = class175.method3035(class172.field2292, field691.field1283);
        var0.field2333.method3501(0);
        field691.method2060(var0);
    }

    @ObfuscatedName("hj.kv(II)V")
    public static void method4331(int arg0) {
        for (class214 var1 = (class214) field801.method3916(); var1 != null; var1 = (class214) field801.method3910()) {
            if ((var1.field2497 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3952();
            }
        }
    }

    @ObfuscatedName("ix.kh(Lhn;I)I")
    public static int method4593(class233 arg0) {
        class214 var1 = (class214) field801.method3905(((long) arg0.field2771 << 32) + (long) arg0.field2788);
        return var1 == null ? arg0.field2714 : var1.field2513;
    }

    @ObfuscatedName("if.kj(Lhn;I)Lhn;")
    public static class233 method4418(class233 arg0) {
        int var1 = class234.method111(method4593(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method214(arg0.field2701);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("al.kl(Lhn;I)Z")
    public static boolean method705(class233 arg0) {
        return arg0.field2705;
    }

    @ObfuscatedName("cx.kg(Lhn;I)Ljava/lang/String;")
    public static String method2037(class233 arg0) {
        if (class234.method99(method4593(arg0)) == 0) {
            return null;
        } else if (arg0.field2753 == null || arg0.field2753.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2753;
        }
    }

    @ObfuscatedName("jz.ko(Ljava/lang/String;B)V")
    public static void method5079(String arg0) {
        Statics.field49 = arg0;
        try {
            String var1 = Statics.field2038.getParameter(class282.field3672.field3678);
            String var2 = Statics.field2038.getParameter(class282.field3675.field3678);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class187.method2664() + 94608000000L;
                class195.field2464.setTime(new Date(var6));
                int var8 = class195.field2464.get(7);
                int var9 = class195.field2464.get(5);
                int var10 = class195.field2464.get(2);
                int var11 = class195.field2464.get(1);
                int var12 = class195.field2464.get(11);
                int var13 = class195.field2464.get(12);
                int var14 = class195.field2464.get(13);
                String var15 = class195.field2467[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class195.field2465[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field2038;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("ap.ks(Ljava/lang/String;ZB)V")
    public static void method938(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3841; var5++) {
            class272 var6 = class272.method1995(var5);
            if ((!arg1 || var6.field3510) && var6.field3553 == -1 && var6.field3516.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1984 = -1;
                    Statics.field326 = null;
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
        Statics.field326 = var3;
        Statics.field70 = 0;
        Statics.field1984 = var4;
        String[] var9 = new String[Statics.field1984];
        for (int var10 = 0; var10 < Statics.field1984; var10++) {
            var9[var10] = class272.method1995(var3[var10]).field3516;
        }
        short[] var11 = Statics.field326;
        class182.method3392(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("cx.km(Lgl;II)V")
    public static void method2033(class185 arg0, int arg1) {
        byte[] var2 = arg0.field2405;
        if (field709 == null) {
            field709 = new byte[24];
        }
        class196.method3783(var2, arg1, field709, 0, 24);
        if (class158.field2039 == null) {
            return;
        }
        try {
            class158.field2039.method2481(0L);
            class158.field2039.method2490(arg0.field2405, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("im.kc(Lgl;I)V")
    public static void method4615(class185 arg0) {
        if (field709 != null) {
            arg0.method3459(field709, 0, field709.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class158.field2039.method2481(0L);
            class158.field2039.method2483(var1);
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
        arg0.method3459(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kw(I)Lkg;")
    public class294 method1172() {
        return Statics.field1064 == null ? null : Statics.field1064.field626;
    }

    @ObfuscatedName("av.kz(IIIZI)V")
    public static void method944(int arg0, int arg1, int arg2, boolean arg3) {
        class175 var4 = class175.method3035(class172.field2212, field691.field1283);
        var4.field2333.method3589(arg3 ? field660 : 0);
        var4.field2333.method3565(arg1);
        var4.field2333.method3492(arg2);
        var4.field2333.method3450(arg0);
        field691.method2060(var4);
    }

    @ObfuscatedName("bs.kx(B)Z")
    public static boolean method993() {
        return field813 >= 2;
    }

    @ObfuscatedName("u.kr(II)V")
    public static void method453(int arg0) {
        field719 = arg0;
    }

    @ObfuscatedName("d.kp(I)V")
    public static void method140() {
        if (field719 == 1) {
            field727 = true;
        }
    }

    @ObfuscatedName("cc.ku(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2015(String arg0) {
        class245[] var1 = class245.method81();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class245 var3 = var1[var2];
            if (var3.field3186 != -1 && arg0.startsWith(class76.method224(var3.field3186))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3186).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("h.kk(I)V")
    public static void method183() {
        if (Statics.field1934 == null) {
            return;
        }
        field915 = field656;
        Statics.field1934.method4581();
        for (int var0 = 0; var0 < field699.length; var0++) {
            if (field699[var0] != null) {
                Statics.field1934.method4580((field699[var0].field954 >> 7) + Statics.field491, (field699[var0].field1000 >> 7) + Statics.field92);
            }
        }
    }
}

package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class291 {

    @ObfuscatedName("client.w")
    public static class167[] field683 = new class167[4];

    @ObfuscatedName("client.as")
    public static boolean field741 = true;

    @ObfuscatedName("client.br")
    public static int field627 = 1;

    @ObfuscatedName("client.bd")
    public static int field628 = 0;

    @ObfuscatedName("client.bk")
    public static int field710 = 0;

    @ObfuscatedName("client.bi")
    public static boolean field871 = false;

    @ObfuscatedName("client.bo")
    public static boolean field631 = false;

    @ObfuscatedName("client.bh")
    public static int field856 = 0;

    @ObfuscatedName("client.bu")
    public static int field633 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field760 = false;

    @ObfuscatedName("client.bl")
    public static int field825 = 0;

    @ObfuscatedName("client.ci")
    public static boolean field632 = true;

    @ObfuscatedName("client.cr")
    public static int field637 = 0;

    @ObfuscatedName("client.cu")
    public static long field784 = 1L;

    @ObfuscatedName("client.cl")
    public static int field639 = -1;

    @ObfuscatedName("client.cw")
    public static int field640 = -1;

    @ObfuscatedName("client.ct")
    public static long field641 = -1L;

    @ObfuscatedName("client.cp")
    public static boolean field781 = true;

    @ObfuscatedName("client.cs")
    public static boolean field643 = false;

    @ObfuscatedName("client.cf")
    public static int field770 = 0;

    @ObfuscatedName("client.cj")
    public static int field645 = 0;

    @ObfuscatedName("client.cz")
    public static int field646 = 0;

    @ObfuscatedName("client.ch")
    public static int field755 = 0;

    @ObfuscatedName("client.cy")
    public static int field648 = 0;

    @ObfuscatedName("client.cx")
    public static int field807 = 0;

    @ObfuscatedName("client.cc")
    public static int field650 = 0;

    @ObfuscatedName("client.ck")
    public static int field651 = 0;

    @ObfuscatedName("client.cn")
    public static int field652 = 0;

    @ObfuscatedName("client.cd")
    public static class79 field653 = class79.field1123;

    @ObfuscatedName("client.du")
    public static class79 field654 = class79.field1123;

    @ObfuscatedName("client.dg")
    public static int field809 = 0;

    @ObfuscatedName("client.dw")
    public static int field656 = 0;

    @ObfuscatedName("client.dh")
    public static int field733 = 0;

    @ObfuscatedName("client.eq")
    public static int field658 = 0;

    @ObfuscatedName("client.es")
    public static int field659 = 0;

    @ObfuscatedName("client.ec")
    public static int field660 = 0;

    @ObfuscatedName("client.ea")
    public static int field680 = 0;

    @ObfuscatedName("client.ef")
    public static int field662 = 0;

    @ObfuscatedName("client.ej")
    public static class149 field663 = class149.field1953;

    @ObfuscatedName("client.ei")
    public static boolean field664 = false;

    @ObfuscatedName("client.er")
    public static class83 field665 = new class83();

    @ObfuscatedName("client.ep")
    public static byte[] field891 = null;

    @ObfuscatedName("client.ev")
    public static class74[] field801 = new class74[32768];

    @ObfuscatedName("client.ed")
    public static int field667 = 0;

    @ObfuscatedName("client.ex")
    public static int[] field669 = new int[32768];

    @ObfuscatedName("client.ez")
    public static int field725 = 0;

    @ObfuscatedName("client.ft")
    public static int[] field854 = new int[250];

    @ObfuscatedName("client.fv")
    public static final class90 field672 = new class90();

    @ObfuscatedName("client.fc")
    public static int field724 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field674 = false;

    @ObfuscatedName("client.fn")
    public static boolean field675 = true;

    @ObfuscatedName("client.fa")
    public static class283 field812 = new class283();

    @ObfuscatedName("client.fq")
    public static HashMap field677 = new HashMap();

    @ObfuscatedName("client.ff")
    public static int field878 = 0;

    @ObfuscatedName("client.fy")
    public static int field679 = 1;

    @ObfuscatedName("client.fd")
    public static int field806 = 0;

    @ObfuscatedName("client.fu")
    public static int field850 = 1;

    @ObfuscatedName("client.fg")
    public static int field666 = 0;

    @ObfuscatedName("client.gx")
    public static boolean field754 = false;

    @ObfuscatedName("client.gk")
    public static int[][][] field685 = new int[4][13][13];

    @ObfuscatedName("client.gt")
    public static final int[] field686 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gu")
    public static int field687 = 0;

    @ObfuscatedName("client.gp")
    public static int field688 = 2301979;

    @ObfuscatedName("client.gn")
    public static int field766 = 5063219;

    @ObfuscatedName("client.hn")
    public static int field684 = 3353893;

    @ObfuscatedName("client.hd")
    public static int field691 = 7759444;

    @ObfuscatedName("client.hy")
    public static boolean field791 = false;

    @ObfuscatedName("client.hq")
    public static int field722 = 0;

    @ObfuscatedName("client.hc")
    public static int field694 = 128;

    @ObfuscatedName("client.hz")
    public static int field695 = 0;

    @ObfuscatedName("client.hu")
    public static int field696 = 0;

    @ObfuscatedName("client.hr")
    public static int field697 = 0;

    @ObfuscatedName("client.he")
    public static int field698 = 0;

    @ObfuscatedName("client.hs")
    public static int field711 = 0;

    @ObfuscatedName("client.ha")
    public static int field700 = 0;

    @ObfuscatedName("client.hh")
    public static int field875 = 50;

    @ObfuscatedName("client.hg")
    public static int field860 = 0;

    @ObfuscatedName("client.hb")
    public static int field726 = 0;

    @ObfuscatedName("client.hv")
    public static int field704 = 0;

    @ObfuscatedName("client.iq")
    public static int field705 = 12;

    @ObfuscatedName("client.if")
    public static int field661 = 6;

    @ObfuscatedName("client.im")
    public static int field707 = 0;

    @ObfuscatedName("client.iw")
    public static boolean field708 = false;

    @ObfuscatedName("client.ih")
    public static int field709 = 0;

    @ObfuscatedName("client.iy")
    public static boolean field699 = false;

    @ObfuscatedName("client.il")
    public static int field832 = 0;

    @ObfuscatedName("client.in")
    public static int field712 = 0;

    @ObfuscatedName("client.id")
    public static int field826 = 50;

    @ObfuscatedName("client.ic")
    public static int[] field818 = new int[field826];

    @ObfuscatedName("client.ij")
    public static int[] field715 = new int[field826];

    @ObfuscatedName("client.ib")
    public static int[] field815 = new int[field826];

    @ObfuscatedName("client.is")
    public static int[] field717 = new int[field826];

    @ObfuscatedName("client.iu")
    public static int[] field718 = new int[field826];

    @ObfuscatedName("client.it")
    public static String field779 = null;

    @ObfuscatedName("client.iv")
    public static int[] field719 = new int[field826];

    @ObfuscatedName("client.ig")
    public static int[] field720 = new int[field826];

    @ObfuscatedName("client.ia")
    public static String[] field897 = new String[field826];

    @ObfuscatedName("client.ie")
    public static int[][] field678 = new int[104][104];

    @ObfuscatedName("client.ir")
    public static int field723 = 0;

    @ObfuscatedName("client.ip")
    public static int field778 = -1;

    @ObfuscatedName("client.ik")
    public static int field844 = -1;

    @ObfuscatedName("client.io")
    public static int field681 = 0;

    @ObfuscatedName("client.ii")
    public static int field772 = 0;

    @ObfuscatedName("client.jm")
    public static int field728 = 0;

    @ObfuscatedName("client.jg")
    public static int field727 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field676 = true;

    @ObfuscatedName("client.jp")
    public static int field731 = 0;

    @ObfuscatedName("client.ji")
    public static int field670 = 0;

    @ObfuscatedName("client.jk")
    public static int field703 = 0;

    @ObfuscatedName("client.jl")
    public static int field734 = 0;

    @ObfuscatedName("client.jc")
    public static int field735 = 0;

    @ObfuscatedName("client.ja")
    public static int field736 = 0;

    @ObfuscatedName("client.jy")
    public static boolean field737 = false;

    @ObfuscatedName("client.js")
    public static int field738 = 0;

    @ObfuscatedName("client.jf")
    public static int field739 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field740 = true;

    @ObfuscatedName("client.jh")
    public static class62[] field888 = new class62[2048];

    @ObfuscatedName("client.jq")
    public static int field742 = -1;

    @ObfuscatedName("client.jt")
    public static int field743 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field744 = true;

    @ObfuscatedName("client.kh")
    public static int field745 = 0;

    @ObfuscatedName("client.kk")
    public static int field746 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field747 = new int[1000];

    @ObfuscatedName("client.kf")
    public static final int[] field748 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kx")
    public static String[] field749 = new String[8];

    @ObfuscatedName("client.kv")
    public static boolean[] field750 = new boolean[8];

    @ObfuscatedName("client.ka")
    public static int[] field751 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kp")
    public static int field635 = -1;

    @ObfuscatedName("client.kw")
    public static class208[][][] field730 = new class208[4][104][104];

    @ObfuscatedName("client.ks")
    public static class208 field647 = new class208();

    @ObfuscatedName("client.ku")
    public static class208 field894 = new class208();

    @ObfuscatedName("client.kt")
    public static class208 field756 = new class208();

    @ObfuscatedName("client.kc")
    public static int[] field757 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field758 = new int[25];

    @ObfuscatedName("client.kd")
    public static int[] field759 = new int[25];

    @ObfuscatedName("client.ko")
    public static int field870 = 0;

    @ObfuscatedName("client.kn")
    public static boolean field706 = false;

    @ObfuscatedName("client.km")
    public static int field762 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field763 = new int[500];

    @ObfuscatedName("client.lc")
    public static int[] field764 = new int[500];

    @ObfuscatedName("client.lv")
    public static int[] field765 = new int[500];

    @ObfuscatedName("client.lj")
    public static int[] field841 = new int[500];

    @ObfuscatedName("client.lw")
    public static String[] field767 = new String[500];

    @ObfuscatedName("client.ll")
    public static String[] field768 = new String[500];

    @ObfuscatedName("client.lm")
    public static boolean[] field769 = new boolean[500];

    @ObfuscatedName("client.lo")
    public static boolean field701 = false;

    @ObfuscatedName("client.ly")
    public static boolean field771 = false;

    @ObfuscatedName("client.lb")
    public static boolean field721 = false;

    @ObfuscatedName("client.lu")
    public static boolean field773 = true;

    @ObfuscatedName("client.li")
    public static int field774 = -1;

    @ObfuscatedName("client.ln")
    public static int field775 = -1;

    @ObfuscatedName("client.lf")
    public static int field776 = 0;

    @ObfuscatedName("client.lt")
    public static int field777 = 50;

    @ObfuscatedName("client.lx")
    public static int field644 = 0;

    @ObfuscatedName("client.le")
    public static boolean field780 = false;

    @ObfuscatedName("client.lz")
    public static int field729 = -1;

    @ObfuscatedName("client.la")
    public static int field782 = -1;

    @ObfuscatedName("client.mc")
    public static String field873 = null;

    @ObfuscatedName("client.md")
    public static String field785 = null;

    @ObfuscatedName("client.mg")
    public static int field668 = -1;

    @ObfuscatedName("client.my")
    public static class205 field786 = new class205(8);

    @ObfuscatedName("client.mv")
    public static int field787 = 0;

    @ObfuscatedName("client.mk")
    public static int field788 = 0;

    @ObfuscatedName("client.ma")
    public static class233 field789 = null;

    @ObfuscatedName("client.mi")
    public static int field790 = 0;

    @ObfuscatedName("client.mb")
    public static int field896 = 0;

    @ObfuscatedName("client.mw")
    public static int field761 = 0;

    @ObfuscatedName("client.mo")
    public static int field793 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field794 = false;

    @ObfuscatedName("client.mr")
    public static class233 field795 = null;

    @ObfuscatedName("client.me")
    public static class233 field796 = null;

    @ObfuscatedName("client.mt")
    public static class233 field797 = null;

    @ObfuscatedName("client.mm")
    public static int field798 = 0;

    @ObfuscatedName("client.mj")
    public static int field732 = 0;

    @ObfuscatedName("client.ms")
    public static class233 field800 = null;

    @ObfuscatedName("client.ml")
    public static boolean field874 = false;

    @ObfuscatedName("client.mp")
    public static int field802 = -1;

    @ObfuscatedName("client.mz")
    public static int field803 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field804 = false;

    @ObfuscatedName("client.mu")
    public static int field805 = -1;

    @ObfuscatedName("client.mq")
    public static int field689 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field783 = false;

    @ObfuscatedName("client.nv")
    public static int field808 = 1;

    @ObfuscatedName("client.nk")
    public static int[] field752 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field810 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field811 = new int[32];

    @ObfuscatedName("client.nr")
    public static int field792 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field813 = new int[32];

    @ObfuscatedName("client.ne")
    public static int field671 = 0;

    @ObfuscatedName("client.nx")
    public static int field682 = 0;

    @ObfuscatedName("client.nj")
    public static int field816 = 0;

    @ObfuscatedName("client.nc")
    public static int field817 = 0;

    @ObfuscatedName("client.nt")
    public static int field657 = 0;

    @ObfuscatedName("client.nq")
    public static int field819 = 0;

    @ObfuscatedName("client.na")
    public static int field799 = 0;

    @ObfuscatedName("client.nd")
    public static int field821 = 0;

    @ObfuscatedName("client.ni")
    public static class208 field822 = new class208();

    @ObfuscatedName("client.nh")
    public static class208 field823 = new class208();

    @ObfuscatedName("client.nw")
    public static class208 field824 = new class208();

    @ObfuscatedName("client.nu")
    public static class205 field636 = new class205(512);

    @ObfuscatedName("client.ox")
    public static int field630 = 0;

    @ObfuscatedName("client.oj")
    public static int field827 = -2;

    @ObfuscatedName("client.oi")
    public static boolean[] field842 = new boolean[100];

    @ObfuscatedName("client.or")
    public static boolean[] field829 = new boolean[100];

    @ObfuscatedName("client.ou")
    public static boolean[] field830 = new boolean[100];

    @ObfuscatedName("client.ok")
    public static int[] field831 = new int[100];

    @ObfuscatedName("client.of")
    public static int[] field843 = new int[100];

    @ObfuscatedName("client.oa")
    public static int[] field833 = new int[100];

    @ObfuscatedName("client.oz")
    public static int[] field834 = new int[100];

    @ObfuscatedName("client.on")
    public static int field835 = 0;

    @ObfuscatedName("client.oq")
    public static long field836 = 0L;

    @ObfuscatedName("client.og")
    public static boolean field837 = true;

    @ObfuscatedName("client.ol")
    public static int[] field838 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ov")
    public static int field839 = 0;

    @ObfuscatedName("client.oc")
    public static int field840 = 0;

    @ObfuscatedName("client.ow")
    public static String field820 = "";

    @ObfuscatedName("client.od")
    public static long[] field828 = new long[100];

    @ObfuscatedName("client.ot")
    public static int field642 = 0;

    @ObfuscatedName("client.ph")
    public static int field713 = 0;

    @ObfuscatedName("client.pt")
    public static int[] field845 = new int[128];

    @ObfuscatedName("client.pu")
    public static int[] field846 = new int[128];

    @ObfuscatedName("client.pj")
    public static long field847 = -1L;

    @ObfuscatedName("client.pe")
    public static int field848 = -1;

    @ObfuscatedName("client.pk")
    public static int field849 = 0;

    @ObfuscatedName("client.pg")
    public static int[] field693 = new int[1000];

    @ObfuscatedName("client.pp")
    public static int[] field851 = new int[1000];

    @ObfuscatedName("client.pb")
    public static class324[] field852 = new class324[1000];

    @ObfuscatedName("client.pr")
    public static int field853 = 0;

    @ObfuscatedName("client.pc")
    public static int field638 = 0;

    @ObfuscatedName("client.pf")
    public static int field855 = 0;

    @ObfuscatedName("client.pm")
    public static int field714 = 255;

    @ObfuscatedName("client.pz")
    public static int field857 = -1;

    @ObfuscatedName("client.po")
    public static boolean field858 = false;

    @ObfuscatedName("client.pw")
    public static int field859 = 127;

    @ObfuscatedName("client.qc")
    public static int field649 = 127;

    @ObfuscatedName("client.qg")
    public static int field861 = 0;

    @ObfuscatedName("client.qh")
    public static int[] field862 = new int[50];

    @ObfuscatedName("client.qb")
    public static int[] field863 = new int[50];

    @ObfuscatedName("client.qk")
    public static int[] field864 = new int[50];

    @ObfuscatedName("client.qm")
    public static int[] field753 = new int[50];

    @ObfuscatedName("client.qv")
    public static class94[] field866 = new class94[50];

    @ObfuscatedName("client.qp")
    public static boolean field867 = false;

    @ObfuscatedName("client.qu")
    public static boolean[] field876 = new boolean[5];

    @ObfuscatedName("client.qa")
    public static int[] field869 = new int[5];

    @ObfuscatedName("client.ri")
    public static int[] field702 = new int[5];

    @ObfuscatedName("client.rm")
    public static int[] field634 = new int[5];

    @ObfuscatedName("client.rd")
    public static int[] field872 = new int[5];

    @ObfuscatedName("client.rk")
    public static short field716 = 256;

    @ObfuscatedName("client.ra")
    public static short field690 = 205;

    @ObfuscatedName("client.rc")
    public static short field673 = 256;

    @ObfuscatedName("client.rb")
    public static short field626 = 320;

    @ObfuscatedName("client.rv")
    public static short field877 = 1;

    @ObfuscatedName("client.rf")
    public static short field868 = 32767;

    @ObfuscatedName("client.rs")
    public static short field879 = 1;

    @ObfuscatedName("client.rw")
    public static short field880 = 32767;

    @ObfuscatedName("client.rq")
    public static int field881 = 0;

    @ObfuscatedName("client.rr")
    public static int field882 = 0;

    @ObfuscatedName("client.rl")
    public static int field883 = 0;

    @ObfuscatedName("client.ry")
    public static int field814 = 0;

    @ObfuscatedName("client.ro")
    public static int field885 = 0;

    @ObfuscatedName("client.re")
    public static class230 field886 = new class230();

    @ObfuscatedName("client.rp")
    public static int field887 = -1;

    @ObfuscatedName("client.rn")
    public static int field895 = -1;

    @ObfuscatedName("client.rh")
    public static class327 field889 = new class326();

    @ObfuscatedName("client.rg")
    public static class5[] field890 = new class5[8];

    @ObfuscatedName("client.sw")
    public static class63 field865 = new class63();

    @ObfuscatedName("client.sb")
    public static int field892 = -1;

    @ObfuscatedName("client.sk")
    public static ArrayList field893 = new ArrayList(10);

    @ObfuscatedName("client.sl")
    public static int field884 = 0;

    @ObfuscatedName("client.st")
    public static final class61 field629 = new class61();

    @ObfuscatedName("client.sp")
    public static int[] field655 = new int[50];

    @ObfuscatedName("client.sm")
    public static int[] field692 = new int[50];

    @ObfuscatedName("client.ar(B)V")
    public final void method760() {
    }

    public final void init() {
        if (!this.method828()) {
            return;
        }
        class282[] var1 = class282.method5826();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class282 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3638);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3638)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class76.field1106)) {
                            field871 = true;
                        } else {
                            field871 = false;
                        }
                        break;
                    case 2:
                        field710 = Integer.parseInt(var4);
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 16:
                    default:
                        break;
                    case 6:
                        field627 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field628 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field3664 = (class247) class180.method3179(class247.method1451(), Integer.parseInt(var4));
                        if (Statics.field3664 == class247.field3193) {
                            Statics.field2425 = class331.field3974;
                        } else {
                            Statics.field2425 = class331.field3978;
                        }
                        break;
                    case 10:
                        Statics.field311 = var4;
                        break;
                    case 11:
                        Statics.field386 = Integer.parseInt(var4);
                        break;
                    case 12:
                        Statics.field1383 = class246.method1094(Integer.parseInt(var4));
                        break;
                    case 13:
                        Statics.field2505 = var4;
                        break;
                    case 14:
                        if (var4.equalsIgnoreCase(class76.field1106)) {
                        }
                        break;
                    case 15:
                        field856 = Integer.parseInt(var4);
                        break;
                    case 17:
                        field675 = Integer.parseInt(var4) != 0;
                        break;
                    case 18:
                        if (field633 == -1) {
                            field633 = Integer.parseInt(var4);
                        }
                }
            }
        }
        method985();
        Statics.field1912 = this.getCodeBase().getHost();
        String var5 = Statics.field1383.field3184;
        byte var6 = 0;
        try {
            Statics.field2011 = 18;
            Statics.field3201 = var6;
            try {
                Statics.field3720 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field3720 = "Unknown";
            }
            Statics.field1508 = Statics.field3720.toLowerCase();
            try {
                Statics.field1901 = System.getProperty("user.home");
                if (Statics.field1901 != null) {
                    Statics.field1901 = Statics.field1901 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field1508.startsWith("win")) {
                    if (Statics.field1901 == null) {
                        Statics.field1901 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1901 == null) {
                    Statics.field1901 = System.getenv("HOME");
                }
                if (Statics.field1901 != null) {
                    Statics.field1901 = Statics.field1901 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field1901 == null) {
                Statics.field1901 = "~/";
            }
            Statics.field2015 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1901, "/tmp/", "" };
            Statics.field1100 = new String[] { ".jagex_cache_" + Statics.field3201, ".file_store_" + Statics.field3201 };
            label162: for (int var10 = 0; var10 < 4; var10++) {
                Statics.field2006 = class158.method1043("oldschool", var5, var10);
                if (!Statics.field2006.exists()) {
                    Statics.field2006.mkdirs();
                }
                File[] var11 = Statics.field2006.listFiles();
                if (var11 == null) {
                    break;
                }
                File[] var12 = var11;
                int var13 = 0;
                while (true) {
                    if (var13 >= var12.length) {
                        break label162;
                    }
                    File var14 = var12[var13];
                    if (!class158.method4214(var14, false)) {
                        break;
                    }
                    var13++;
                }
            }
            class161.method2374(Statics.field2006);
            try {
                File var15 = new File(Statics.field1901, "random.dat");
                if (var15.exists()) {
                    class158.field2012 = new class112(new class113(var15, "rw", 25L), 24, 0);
                } else {
                    label142: for (int var16 = 0; var16 < Statics.field1100.length; var16++) {
                        for (int var17 = 0; var17 < Statics.field2015.length; var17++) {
                            File var18 = new File(Statics.field2015[var17] + Statics.field1100[var16] + File.separatorChar + "random.dat");
                            if (var18.exists()) {
                                class158.field2012 = new class112(new class113(var18, "rw", 25L), 24, 0);
                                break label142;
                            }
                        }
                    }
                }
                if (class158.field2012 == null) {
                    RandomAccessFile var19 = new RandomAccessFile(var15, "rw");
                    int var20 = var19.read();
                    var19.seek(0L);
                    var19.write(var20);
                    var19.seek(0L);
                    var19.close();
                    class158.field2012 = new class112(new class113(var15, "rw", 25L), 24, 0);
                }
            } catch (IOException var27) {
            }
            class158.field2009 = new class112(new class113(class161.method3230("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class158.field2014 = new class112(new class113(class161.method3230("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2437 = new class112[Statics.field2011];
            for (int var22 = 0; var22 < Statics.field2011; var22++) {
                Statics.field2437[var22] = new class112(new class113(class161.method3230("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var28) {
            class155.method917((String) null, var28);
        }
        Statics.field3162 = this;
        Statics.field623 = field633;
        this.method737(765, 503, 173);
    }

    @ObfuscatedName("bp.ez(I)V")
    public static final void method985() {
        class128.field1785 = false;
        field631 = false;
    }

    @ObfuscatedName("client.ai(B)V")
    public final void method867() {
        class186.method2582(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field914 = field710 == 0 ? 43594 : field627 + 40000;
        Statics.field2308 = field710 == 0 ? 443 : field627 + 50000;
        Statics.field900 = Statics.field914;
        Statics.field2617 = class231.field2627;
        Statics.field989 = class231.field2622;
        Statics.field1075 = class231.field2623;
        Statics.field2003 = class231.field2621;
        Statics.field478 = new class138();
        this.method732();
        this.method727();
        Statics.field1968 = this.method734();
        Statics.field340 = new class165(255, class158.field2009, class158.field2014, 500000);
        Statics.field257 = class68.method1769();
        this.method758();
        class46.method1706(this, Statics.field58);
        if (field710 != 0) {
            field643 = true;
        }
        int var1 = Statics.field257.field1010;
        field836 = 0L;
        if (var1 >= 2) {
            field837 = true;
        } else {
            field837 = false;
        }
        int var2 = field837 ? 2 : 1;
        if (var2 == 1) {
            Statics.field3162.method728(765, 503);
        } else {
            Statics.field3162.method728(7680, 2160);
        }
        if (field825 >= 25) {
            method1508();
        }
        Statics.field391 = new class69(Statics.field2425);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method751() {
        field637++;
        this.method1110();
        while (true) {
            class208 var1 = class251.field3221;
            class248 var2;
            synchronized (class251.field3221) {
                var2 = (class248) class251.field3222.method3792();
            }
            if (var2 == null) {
                Statics.method990();
                method3055();
                class40 var4 = class40.field383;
                synchronized (class40.field383) {
                    class40.field379++;
                    class40.field376 = class40.field378;
                    class40.field361 = 0;
                    if (class40.field371 >= 0) {
                        while (class40.field371 != class40.field370) {
                            int var6 = class40.field368[class40.field370];
                            class40.field370 = class40.field370 + 1 & 0x7F;
                            if (var6 < 0) {
                                class40.field377[~var6] = false;
                            } else {
                                if (!class40.field377[var6] && class40.field361 < class40.field374.length - 1) {
                                    class40.field374[++class40.field361 - 1] = var6;
                                }
                                class40.field377[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class40.field377[var5] = false;
                        }
                        class40.field371 = class40.field370;
                    }
                    if (class40.field361 > 0) {
                        class40.field379 = 0;
                    }
                    class40.field378 = class40.field356;
                }
                class49.method3515();
                if (Statics.field1968 != null) {
                    int var8 = Statics.field1968.method608();
                    field821 = var8;
                }
                if (field825 == 0) {
                    method4245();
                    class48.method3072();
                } else if (field825 == 5) {
                    class80.method1840(this);
                    method4245();
                    class48.method3072();
                } else if (field825 == 10 || field825 == 11) {
                    class80.method1840(this);
                } else if (field825 == 20) {
                    class80.method1840(this);
                    this.method1114();
                } else if (field825 == 25) {
                    method1044();
                }
                if (field825 == 30) {
                    this.method1115();
                } else if (field825 == 40 || field825 == 45) {
                    this.method1114();
                }
                return;
            }
            var2.field3197.method4358(var2.field3196, (int) var2.field2470, var2.field3195, false);
        }
    }

    @ObfuscatedName("client.aw(ZI)V")
    public final void method752(boolean arg0) {
        boolean var2 = class220.method3162();
        if (var2 && field858 && Statics.field37 != null) {
            Statics.field37.method2043();
        }
        if ((field825 == 10 || field825 == 20 || field825 == 30) && field836 != 0L && class187.method1700() > field836) {
            int var3 = field837 ? 2 : 1;
            field836 = 0L;
            if (var3 >= 2) {
                field837 = true;
            } else {
                field837 = false;
            }
            int var4 = field837 ? 2 : 1;
            if (var4 == 1) {
                Statics.field3162.method728(765, 503);
            } else {
                Statics.field3162.method728(7680, 2160);
            }
            if (field825 >= 25) {
                method1508();
            }
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field842[var5] = true;
            }
        }
        if (field825 == 0) {
            this.method754(class80.field1148, class80.field1154, arg0);
        } else if (field825 == 5) {
            class80.method1469(Statics.field3758, Statics.field512, Statics.field1935, arg0);
        } else if (field825 == 10 || field825 == 11) {
            class80.method1469(Statics.field3758, Statics.field512, Statics.field1935, arg0);
        } else if (field825 == 20) {
            class80.method1469(Statics.field3758, Statics.field512, Statics.field1935, arg0);
        } else if (field825 == 25) {
            if (field666 == 1) {
                if (field878 > field679) {
                    field679 = field878;
                }
                int var6 = (field679 * 50 - field878 * 50) / field679;
                method2349(class240.field3054 + class76.field1111 + class76.field1112 + var6 + "%" + class76.field1107, false);
            } else if (field666 == 2) {
                if (field806 > field850) {
                    field850 = field806;
                }
                int var7 = (field850 * 50 - field806 * 50) / field850 + 50;
                method2349(class240.field3054 + class76.field1111 + class76.field1112 + var7 + "%" + class76.field1107, false);
            } else {
                method2349(class240.field3054, false);
            }
        } else if (field825 == 30) {
            this.method1429();
        } else if (field825 == 40) {
            method2349(class240.field2844 + class76.field1111 + class240.field2845, false);
        } else if (field825 == 45) {
            method2349(class240.field3016, false);
        }
        if (field825 == 30 && field835 == 0 && !arg0 && !field837) {
            for (int var8 = 0; var8 < field630; var8++) {
                if (field829[var8]) {
                    Statics.field448.method713(field831[var8], field843[var8], field833[var8], field834[var8]);
                    field829[var8] = false;
                }
            }
        } else if (field825 > 0) {
            Statics.field448.method712(0, 0);
            for (int var9 = 0; var9 < field630; var9++) {
                field829[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method753() {
        if (Statics.field1928.method1814()) {
            Statics.field1928.method1811();
        }
        if (Statics.field2563 != null) {
            Statics.field2563.field567 = false;
        }
        Statics.field2563 = null;
        field672.method1903();
        class40.method3512();
        class49.method967();
        Statics.field1968 = null;
        if (Statics.field37 != null) {
            Statics.field37.method2044();
        }
        if (Statics.field44 != null) {
            Statics.field44.method2044();
        }
        class253.method431();
        Object var1 = class251.field3223;
        synchronized (class251.field3223) {
            if (class251.field3224 != 0) {
                class251.field3224 = 1;
                try {
                    class251.field3223.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        if (Statics.field478 != null) {
            Statics.field478.method2868();
            Statics.field478 = null;
        }
        class158.method636();
    }

    @ObfuscatedName("x.ft(II)V")
    public static void method181(int arg0) {
        if (field825 == arg0) {
            return;
        }
        if (field825 == 0) {
            Statics.field3162.method755();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field659 = 0;
            field660 = 0;
            field680 = 0;
            field812.method4936(arg0);
            if (arg0 != 20) {
                method988(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1486 != null) {
            Statics.field1486.method3035();
            Statics.field1486 = null;
        }
        if (field825 == 25) {
            field666 = 0;
            field878 = 0;
            field679 = 1;
            field806 = 0;
            field850 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class80.method667(Statics.field1916, Statics.field1260, true, 0);
        } else if (arg0 == 20) {
            class80.method667(Statics.field1916, Statics.field1260, true, field825 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class80.method667(Statics.field1916, Statics.field1260, false, 4);
        } else if (Statics.field1139) {
            Statics.field1135 = null;
            Statics.field1149 = null;
            Statics.field621 = null;
            Statics.field3755 = null;
            Statics.field2629 = null;
            Statics.field1137 = null;
            Statics.field414 = null;
            Statics.field1168 = null;
            Statics.field2333 = null;
            Statics.field1716 = null;
            Statics.field176 = null;
            Statics.field2789 = null;
            Statics.field2630 = null;
            Statics.field1972 = null;
            Statics.field549 = null;
            Statics.field63 = null;
            Statics.field625 = null;
            Statics.field43 = null;
            Statics.field3629 = null;
            Statics.field254 = null;
            Statics.field40 = null;
            Statics.field1145 = null;
            class220.method3165(2);
            class253.method1452(true);
            Statics.field1139 = false;
        }
        field825 = arg0;
    }

    @ObfuscatedName("client.fh(I)V")
    public void method1110() {
        if (field825 != 1000) {
            boolean var1 = class253.method2846();
            if (!var1) {
                this.method1112();
            }
        }
    }

    @ObfuscatedName("client.fs(B)V")
    public void method1112() {
        if (class253.field3246 >= 4) {
            this.method756("js5crc");
            field825 = 1000;
            return;
        }
        if (class253.field3257 >= 4) {
            if (field825 <= 5) {
                this.method756("js5io");
                field825 = 1000;
                return;
            }
            field733 = 3000;
            class253.field3257 = 3;
        }
        if (--field733 + 1 > 0) {
            return;
        }
        try {
            if (field656 == 0) {
                Statics.field3684 = Statics.field447.method2994(Statics.field1912, Statics.field900);
                field656++;
            }
            if (field656 == 1) {
                if (Statics.field3684.field1987 == 2) {
                    this.method1113(-1);
                    return;
                }
                if (Statics.field3684.field1987 == 1) {
                    field656++;
                }
            }
            if (field656 == 2) {
                if (field675) {
                    Socket var1 = (Socket) Statics.field3684.field1992;
                    class162 var2 = new class162(var1, 40000, 5000);
                    Statics.field191 = var2;
                } else {
                    Statics.field191 = new class164((Socket) Statics.field3684.field1992, Statics.field447, 5000);
                }
                class185 var3 = new class185(5);
                var3.method3253(15);
                var3.method3256(173);
                Statics.field191.method3031(var3.field2373, 0, 5);
                field656++;
                Statics.field2305 = class187.method1700();
            }
            if (field656 == 3) {
                if (Statics.field191.method3041() > 0 || !field675 && field825 <= 5) {
                    int var4 = Statics.field191.method3029();
                    if (var4 != 0) {
                        this.method1113(var4);
                        return;
                    }
                    field656++;
                } else if (class187.method1700() - Statics.field2305 > 30000L) {
                    this.method1113(-2);
                    return;
                }
            }
            if (field656 == 4) {
                class160 var5 = Statics.field191;
                boolean var6 = field825 > 20;
                if (Statics.field3251 != null) {
                    try {
                        Statics.field3251.method3035();
                    } catch (Exception var16) {
                    }
                    Statics.field3251 = null;
                }
                Statics.field3251 = var5;
                class253.method1452(var6);
                class253.field3248.field2374 = 0;
                Statics.field511 = null;
                Statics.field3771 = null;
                class253.field3245 = 0;
                while (true) {
                    class249 var8 = (class249) class253.field3243.method3720();
                    if (var8 == null) {
                        while (true) {
                            class249 var9 = (class249) class253.field3252.method3720();
                            if (var9 == null) {
                                if (class253.field3255 != 0) {
                                    try {
                                        class185 var10 = new class185(4);
                                        var10.method3253(4);
                                        var10.method3253(class253.field3255);
                                        var10.method3254(0);
                                        Statics.field3251.method3031(var10.field2373, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3251.method3035();
                                        } catch (Exception var14) {
                                        }
                                        class253.field3257++;
                                        Statics.field3251 = null;
                                    }
                                }
                                class253.field3244 = 0;
                                Statics.field3240 = class187.method1700();
                                Statics.field3684 = null;
                                Statics.field191 = null;
                                field656 = 0;
                                field658 = 0;
                                return;
                            }
                            class253.field3238.method3634(var9);
                            class253.field3239.method3718(var9, var9.field2470);
                            class253.field3247++;
                            class253.field3249--;
                        }
                    }
                    class253.field3241.method3718(var8, var8.field2470);
                    class253.field3242++;
                    class253.field3256--;
                }
            }
        } catch (IOException var17) {
            this.method1113(-3);
        }
    }

    @ObfuscatedName("client.fv(IB)V")
    public void method1113(int arg0) {
        Statics.field3684 = null;
        Statics.field191 = null;
        field656 = 0;
        if (Statics.field914 == Statics.field900) {
            Statics.field900 = Statics.field2308;
        } else {
            Statics.field900 = Statics.field914;
        }
        field658++;
        if (field658 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field825 <= 5) {
                this.method756("js5connect_full");
                field825 = 1000;
            } else {
                field733 = 3000;
            }
        } else if (field658 >= 2 && arg0 == 6) {
            this.method756("js5connect_outofdate");
            field825 = 1000;
        } else if (field658 >= 4) {
            if (field825 <= 5) {
                this.method756("js5connect");
                field825 = 1000;
            } else {
                field733 = 3000;
            }
        }
    }

    @ObfuscatedName("bi.fk(Liv;Ljava/lang/String;I)V")
    public static void method1013(class252 arg0, String arg1) {
        class54 var2 = new class54(arg0, arg1);
        field893.add(var2);
    }

    @ObfuscatedName("ic.fc(I)V")
    public static void method4245() {
        if (field809 == 0) {
            Statics.field52 = new class128(4, 104, 104, class51.field501);
            for (int var0 = 0; var0 < 4; var0++) {
                field683[var0] = new class167(104, 104);
            }
            Statics.field3610 = new class324(512, 512);
            class80.field1154 = class240.field2931;
            class80.field1148 = 5;
            field809 = 20;
        } else if (field809 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class125.field1747[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class128.method2709(var1, 500, 800, 512, 334);
            class80.field1154 = class240.field2960;
            class80.field1148 = 10;
            field809 = 30;
        } else if (field809 == 30) {
            Statics.field584 = method964(0, false, true, true);
            Statics.field241 = method964(1, false, true, true);
            Statics.field1759 = method964(2, true, false, true);
            Statics.field516 = method964(3, false, true, true);
            Statics.field2779 = method964(4, false, true, true);
            Statics.field1629 = method964(5, true, true, true);
            Statics.field397 = method964(6, true, true, true);
            Statics.field250 = method964(7, false, true, true);
            Statics.field1260 = method964(8, false, true, true);
            Statics.field395 = method964(9, false, true, true);
            Statics.field1916 = method964(10, false, true, true);
            Statics.field618 = method964(11, false, true, true);
            Statics.field234 = method964(12, false, true, true);
            Statics.field582 = method964(13, true, false, true);
            Statics.field2380 = method964(14, false, true, true);
            Statics.field81 = method964(15, false, true, true);
            Statics.field332 = method964(16, true, true, true);
            Statics.field481 = method964(17, true, true, true);
            class80.field1154 = class240.field3071;
            class80.field1148 = 20;
            field809 = 40;
        } else if (field809 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field584.method4354() * 4 / 100;
            int var8 = var7 + Statics.field241.method4354() * 4 / 100;
            int var9 = var8 + Statics.field1759.method4354() * 2 / 100;
            int var10 = var9 + Statics.field516.method4354() * 2 / 100;
            int var11 = var10 + Statics.field2779.method4354() * 6 / 100;
            int var12 = var11 + Statics.field1629.method4354() * 4 / 100;
            int var13 = var12 + Statics.field397.method4354() * 2 / 100;
            int var14 = var13 + Statics.field250.method4354() * 57 / 100;
            int var15 = var14 + Statics.field1260.method4354() * 2 / 100;
            int var16 = var15 + Statics.field395.method4354() * 2 / 100;
            int var17 = var16 + Statics.field1916.method4354() * 2 / 100;
            int var18 = var17 + Statics.field618.method4354() * 2 / 100;
            int var19 = var18 + Statics.field234.method4354() * 2 / 100;
            int var20 = var19 + Statics.field582.method4354() * 2 / 100;
            int var21 = var20 + Statics.field2380.method4354() * 2 / 100;
            int var22 = var21 + Statics.field81.method4354() * 2 / 100;
            int var23 = var22 + Statics.field332.method4354() * 2 / 100;
            int var24 = var23 + (Statics.field481.method4353() && Statics.field481.method4285() ? 1 : 0);
            if (var24 == 100) {
                method1013(Statics.field584, "Animations");
                method1013(Statics.field241, "Skeletons");
                method1013(Statics.field2779, "Sound FX");
                method1013(Statics.field1629, "Maps");
                method1013(Statics.field397, "Music Tracks");
                method1013(Statics.field250, "Models");
                method1013(Statics.field1260, "Sprites");
                method1013(Statics.field618, "Music Jingles");
                method1013(Statics.field2380, "Music Samples");
                method1013(Statics.field81, "Music Patches");
                method1013(Statics.field332, "World Map");
                Statics.field145 = new class312();
                Statics.field145.method5302(Statics.field481);
                class80.field1154 = class240.field2936;
                class80.field1148 = 30;
                field809 = 45;
            } else {
                if (var24 != 0) {
                    class80.field1154 = class240.field2849 + var24 + "%";
                }
                class80.field1148 = 30;
            }
        } else if (field809 == 45) {
            class98.method1673(22050, !field631, 2);
            class221 var25 = new class221();
            var25.method3907(9, 128);
            Statics.field37 = class98.method2914(Statics.field447, 0, 22050);
            Statics.field37.method2057(var25);
            class252 var26 = Statics.field81;
            class252 var27 = Statics.field2380;
            class252 var28 = Statics.field2779;
            Statics.field2506 = var26;
            Statics.field2508 = var27;
            Statics.field2512 = var28;
            Statics.field2509 = var25;
            Statics.field44 = class98.method2914(Statics.field447, 1, 2048);
            Statics.field392 = new class91();
            Statics.field44.method2057(Statics.field392);
            Statics.field2394 = new class105(22050, Statics.field56);
            class80.field1154 = class240.field2851;
            class80.field1148 = 35;
            field809 = 50;
            Statics.field980 = new class299(Statics.field1260, Statics.field582);
        } else if (field809 == 50) {
            class298[] var29 = new class298[] { class298.field3717, class298.field3715, class298.field3713, class298.field3712, class298.field3714, class298.field3716 };
            int var30 = var29.length;
            class299 var31 = Statics.field980;
            class298[] var32 = new class298[] { class298.field3717, class298.field3715, class298.field3713, class298.field3712, class298.field3714, class298.field3716 };
            field677 = var31.method5127(var32);
            if (field677.size() < var30) {
                class80.field1154 = class240.field2961 + field677.size() * 100 / var30 + "%";
                class80.field1148 = 40;
            } else {
                Statics.field512 = (class301) field677.get(class298.field3717);
                Statics.field1935 = (class301) field677.get(class298.field3713);
                Statics.field3758 = (class301) field677.get(class298.field3714);
                Statics.field583 = field889.method5609();
                class80.field1154 = class240.field2853;
                class80.field1148 = 40;
                field809 = 60;
            }
        } else if (field809 == 60) {
            int var33 = class80.method4858(Statics.field1916, Statics.field1260);
            int var34 = class80.method1015();
            if (var33 < var34) {
                class80.field1154 = class240.field2854 + var33 * 100 / var34 + "%";
                class80.field1148 = 50;
            } else {
                class80.field1154 = class240.field2855;
                class80.field1148 = 50;
                method181(5);
                field809 = 70;
            }
        } else if (field809 == 70) {
            if (Statics.field1759.method4285()) {
                class252 var35 = Statics.field1759;
                Statics.field3577 = var35;
                class262.method1657(Statics.field1759);
                class263.method2862(Statics.field1759, Statics.field250);
                class271.method2581(Statics.field1759, Statics.field250, field631);
                class252 var36 = Statics.field1759;
                class252 var37 = Statics.field250;
                Statics.field3543 = var36;
                Statics.field3536 = var37;
                class252 var38 = Statics.field1759;
                Statics.field3382 = var38;
                class252 var39 = Statics.field1759;
                class252 var40 = Statics.field250;
                boolean var41 = field871;
                class301 var42 = Statics.field512;
                Statics.field3495 = var39;
                Statics.field3476 = var40;
                Statics.field3523 = var41;
                Statics.field1085 = Statics.field3495.method4287(10);
                Statics.field1712 = var42;
                class276.method4584(Statics.field1759, Statics.field584, Statics.field241);
                class252 var43 = Statics.field1759;
                class252 var44 = Statics.field250;
                Statics.field3328 = var43;
                Statics.field3326 = var44;
                class252 var45 = Statics.field1759;
                Statics.field3370 = var45;
                class257.method1501(Statics.field1759);
                class233.method3113(Statics.field516, Statics.field250, Statics.field1260, Statics.field582);
                class252 var46 = Statics.field1759;
                Statics.field1 = var46;
                class252 var47 = Statics.field1759;
                Statics.field3391 = var47;
                class252 var48 = Statics.field1759;
                Statics.field3308 = var48;
                class252 var49 = Statics.field1759;
                Statics.field3316 = var49;
                class267.method2376(Statics.field1759);
                Statics.field1928 = new class85();
                class252 var50 = Statics.field1759;
                class252 var51 = Statics.field1260;
                class252 var52 = Statics.field582;
                Statics.field3985 = var50;
                Statics.field2409 = var51;
                Statics.field3403 = var52;
                class252 var53 = Statics.field1759;
                class252 var54 = Statics.field1260;
                Statics.field3363 = var53;
                Statics.field3353 = var54;
                class252 var55 = Statics.field1759;
                class252 var56 = Statics.field1260;
                Statics.field3296 = var56;
                if (var55.method4285()) {
                    Statics.field3287 = var55.method4287(35);
                    Statics.field3298 = new class258[Statics.field3287];
                    for (int var57 = 0; var57 < Statics.field3287; var57++) {
                        byte[] var58 = var55.method4263(35, var57);
                        Statics.field3298[var57] = new class258(var57);
                        if (var58 != null) {
                            Statics.field3298[var57].method4453(new class185(var58));
                            Statics.field3298[var57].method4455();
                        }
                    }
                }
                class80.field1154 = class240.field2841;
                class80.field1148 = 60;
                field809 = 80;
            } else {
                class80.field1154 = class240.field2856 + Statics.field1759.method4355() + "%";
                class80.field1148 = 60;
            }
        } else if (field809 == 80) {
            int var59 = 0;
            if (Statics.field2418 == null) {
                Statics.field2418 = class325.method4906(Statics.field1260, Statics.field145.field3784, 0);
            } else {
                var59++;
            }
            if (Statics.field302 == null) {
                Statics.field302 = class325.method4906(Statics.field1260, Statics.field145.field3783, 0);
            } else {
                var59++;
            }
            if (Statics.field2412 == null) {
                Statics.field2412 = class325.method77(Statics.field1260, Statics.field145.field3782, 0);
            } else {
                var59++;
            }
            if (Statics.field3359 == null) {
                Statics.field3359 = class325.method5226(Statics.field1260, Statics.field145.field3785, 0);
            } else {
                var59++;
            }
            if (Statics.field78 == null) {
                Statics.field78 = class325.method5226(Statics.field1260, Statics.field145.field3786, 0);
            } else {
                var59++;
            }
            if (Statics.field249 == null) {
                Statics.field249 = class325.method5226(Statics.field1260, Statics.field145.field3787, 0);
            } else {
                var59++;
            }
            if (Statics.field330 == null) {
                Statics.field330 = class325.method5226(Statics.field1260, Statics.field145.field3788, 0);
            } else {
                var59++;
            }
            if (Statics.field236 == null) {
                Statics.field236 = class325.method5226(Statics.field1260, Statics.field145.field3789, 0);
            } else {
                var59++;
            }
            if (Statics.field1090 == null) {
                Statics.field1090 = class325.method5226(Statics.field1260, Statics.field145.field3790, 0);
            } else {
                var59++;
            }
            if (Statics.field21 == null) {
                Statics.field21 = class325.method77(Statics.field1260, Statics.field145.field3791, 0);
            } else {
                var59++;
            }
            if (Statics.field282 == null) {
                Statics.field282 = class325.method77(Statics.field1260, Statics.field145.field3792, 0);
            } else {
                var59++;
            }
            if (var59 < 11) {
                class80.field1154 = class240.field2868 + var59 * 100 / 12 + "%";
                class80.field1148 = 70;
            } else {
                Statics.field3740 = Statics.field282;
                Statics.field302.method5476();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2412[0].method5451(var60 + var63, var61 + var63, var62 + var63);
                class80.field1154 = class240.field3103;
                class80.field1148 = 70;
                field809 = 90;
            }
        } else if (field809 == 90) {
            if (Statics.field395.method4285()) {
                Statics.field170 = new class114(Statics.field395, Statics.field1260, 20, 0.8D, field631 ? 64 : 128);
                class125.method2592(Statics.field170);
                class125.method2593(0.8D);
                field809 = 100;
            } else {
                class80.field1154 = class240.field2860 + "0%";
                class80.field1148 = 90;
            }
        } else if (field809 == 100) {
            int var64 = Statics.field170.method2352();
            if (var64 < 100) {
                class80.field1154 = class240.field2860 + var64 + "%";
                class80.field1148 = 90;
            } else {
                class80.field1154 = class240.field2861;
                class80.field1148 = 90;
                field809 = 110;
            }
        } else if (field809 == 110) {
            Statics.field2563 = new class59();
            Statics.field447.method2995(Statics.field2563, 10);
            class80.field1154 = class240.field3022;
            class80.field1148 = 92;
            field809 = 120;
        } else if (field809 == 120) {
            if (Statics.field1916.method4337("huffman", "")) {
                class177 var65 = new class177(Statics.field1916.method4314("huffman", ""));
                class303.method3189(var65);
                class80.field1154 = class240.field2864;
                class80.field1148 = 94;
                field809 = 130;
            } else {
                class80.field1154 = class240.field2953 + "%";
                class80.field1148 = 94;
            }
        } else if (field809 == 130) {
            if (!Statics.field516.method4285()) {
                class80.field1154 = class240.field2865 + Statics.field516.method4355() * 4 / 5 + "%";
                class80.field1148 = 96;
            } else if (!Statics.field234.method4285()) {
                class80.field1154 = class240.field2865 + (80 + Statics.field234.method4355() / 6) + "%";
                class80.field1148 = 96;
            } else if (Statics.field582.method4285()) {
                class80.field1154 = class240.field2866;
                class80.field1148 = 98;
                field809 = 140;
            } else {
                class80.field1154 = class240.field2865 + (96 + Statics.field582.method4355() / 50) + "%";
                class80.field1148 = 96;
            }
        } else if (field809 == 140) {
            class80.field1148 = 100;
            if (Statics.field332.method4268(class30.field285.field277)) {
                if (Statics.field1979 == null) {
                    Statics.field1979 = new class330();
                    Statics.field1979.method5754(Statics.field332, Statics.field3758, field677, Statics.field2412);
                }
                int var66 = Statics.field1979.method5759();
                if (var66 < 100) {
                    class80.field1154 = class240.field2867 + (var66 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1154 = class240.field3100;
                    field809 = 150;
                }
            } else {
                class80.field1154 = class240.field2867 + Statics.field332.method4281(class30.field285.field277) / 10 + "%";
            }
        } else if (field809 == 150) {
            method181(10);
        }
    }

    @ObfuscatedName("as.fj(IZZZI)Liv;")
    public static class252 method964(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2009 != null) {
            var4 = new class165(arg0, class158.field2009, Statics.field2437[arg0], 1000000);
        }
        return new class252(var4, Statics.field340, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fn(I)V")
    public final void method1114() {
        class160 var1 = field672.method1900();
        class192 var2 = field672.field1274;
        try {
            if (field659 == 0) {
                if (Statics.field72 == null && (field665.method1781() || field660 > 250)) {
                    Statics.field72 = field665.method1775();
                    field665.method1773();
                    field665 = null;
                }
                if (Statics.field72 != null) {
                    if (var1 != null) {
                        var1.method3035();
                        var1 = null;
                    }
                    Statics.field1130 = null;
                    field674 = false;
                    field660 = 0;
                    field659 = 1;
                }
            }
            if (field659 == 1) {
                if (Statics.field1130 == null) {
                    Statics.field1130 = Statics.field447.method2994(Statics.field1912, Statics.field900);
                }
                if (Statics.field1130.field1987 == 2) {
                    throw new IOException();
                }
                if (Statics.field1130.field1987 == 1) {
                    if (field675) {
                        Socket var3 = (Socket) Statics.field1130.field1992;
                        class162 var4 = new class162(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class164((Socket) Statics.field1130.field1992, Statics.field447, 5000);
                    }
                    field672.method1909(var1);
                    Statics.field1130 = null;
                    field659 = 2;
                }
            }
            if (field659 == 2) {
                field672.method1899();
                class175 var5 = class175.method3873();
                var5.field2299.method3253(class173.field2286.field2278);
                field672.method1901(var5);
                field672.method1915();
                var2.field2374 = 0;
                field659 = 3;
            }
            if (field659 == 3) {
                if (Statics.field37 != null) {
                    Statics.field37.method2050();
                }
                if (Statics.field44 != null) {
                    Statics.field44.method2050();
                }
                boolean var6 = true;
                if (field675 && !var1.method3030(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3029();
                    if (Statics.field37 != null) {
                        Statics.field37.method2050();
                    }
                    if (Statics.field44 != null) {
                        Statics.field44.method2050();
                    }
                    if (var7 != 0) {
                        method114(var7);
                        return;
                    }
                    var2.field2374 = 0;
                    field659 = 4;
                }
            }
            if (field659 == 4) {
                if (var2.field2374 < 8) {
                    int var8 = var1.method3041();
                    if (var8 > 8 - var2.field2374) {
                        var8 = 8 - var2.field2374;
                    }
                    if (var8 > 0) {
                        var1.method3050(var2.field2373, var2.field2374, var8);
                        var2.field2374 += var8;
                    }
                }
                if (var2.field2374 == 8) {
                    var2.field2374 = 0;
                    Statics.field1941 = var2.method3488();
                    field659 = 5;
                }
            }
            if (field659 == 5) {
                field672.field1274.field2374 = 0;
                field672.method1899();
                class192 var9 = new class192(500);
                int[] var10 = new int[] { Statics.field72.nextInt(), Statics.field72.nextInt(), Statics.field72.nextInt(), Statics.field72.nextInt() };
                var9.field2374 = 0;
                var9.method3253(1);
                var9.method3256(var10[0]);
                var9.method3256(var10[1]);
                var9.method3256(var10[2]);
                var9.method3256(var10[3]);
                var9.method3258(Statics.field1941);
                if (field825 == 40) {
                    var9.method3256(Statics.field154[0]);
                    var9.method3256(Statics.field154[1]);
                    var9.method3256(Statics.field154[2]);
                    var9.method3256(Statics.field154[3]);
                } else {
                    var9.method3253(field663.method144());
                    switch(field663.field1956) {
                        case 0:
                            var9.field2374 += 4;
                            break;
                        case 1:
                        case 3:
                            var9.method3255(Statics.field1627);
                            var9.field2374++;
                            break;
                        case 2:
                            var9.method3256((Integer) Statics.field257.field1014.get(class308.method2586(class80.field1159)));
                    }
                    var9.method3253(class313.field3794.method144());
                    var9.method3260(class80.field1157);
                }
                var9.method3290(class78.field1120, class78.field1121);
                Statics.field154 = var10;
                class175 var11;
                if (class175.field2302 == 0) {
                    var11 = new class175();
                } else {
                    var11 = class175.field2301[--class175.field2302];
                }
                var11.field2303 = null;
                var11.field2297 = 0;
                var11.field2299 = new class192(5000);
                var11.field2299.field2374 = 0;
                if (field825 == 40) {
                    var11.field2299.method3253(class173.field2281.field2278);
                } else {
                    var11.field2299.method3253(class173.field2280.field2278);
                }
                var11.field2299.method3254(0);
                int var15 = var11.field2299.field2374;
                var11.field2299.method3256(173);
                var11.field2299.method3263(var9.field2373, 0, var9.field2374);
                int var16 = var11.field2299.field2374;
                var11.field2299.method3260(class80.field1159);
                var11.field2299.method3253((field837 ? 1 : 0) << 1 | (field631 ? 1 : 0));
                var11.field2299.method3254(Statics.field226);
                var11.field2299.method3254(Statics.field387);
                method439(var11.field2299);
                var11.field2299.method3260(Statics.field311);
                var11.field2299.method3256(Statics.field386);
                class185 var17 = new class185(Statics.field583.method5616());
                Statics.field583.method5617(var17);
                var11.field2299.method3263(var17.field2373, 0, var17.field2373.length);
                var11.field2299.method3253(field633);
                var11.field2299.method3256(0);
                var11.field2299.method3256(Statics.field584.field3216);
                var11.field2299.method3256(Statics.field241.field3216);
                var11.field2299.method3256(Statics.field1759.field3216);
                var11.field2299.method3256(Statics.field516.field3216);
                var11.field2299.method3256(Statics.field2779.field3216);
                var11.field2299.method3256(Statics.field1629.field3216);
                var11.field2299.method3256(Statics.field397.field3216);
                var11.field2299.method3256(Statics.field250.field3216);
                var11.field2299.method3256(Statics.field1260.field3216);
                var11.field2299.method3256(Statics.field395.field3216);
                var11.field2299.method3256(Statics.field1916.field3216);
                var11.field2299.method3256(Statics.field618.field3216);
                var11.field2299.method3256(Statics.field234.field3216);
                var11.field2299.method3256(Statics.field582.field3216);
                var11.field2299.method3256(Statics.field2380.field3216);
                var11.field2299.method3256(Statics.field81.field3216);
                var11.field2299.method3256(Statics.field332.field3216);
                var11.field2299.method3256(Statics.field481.field3216);
                var11.field2299.method3288(var10, var16, var11.field2299.field2374);
                var11.field2299.method3265(var11.field2299.field2374 - var15);
                field672.method1901(var11);
                field672.method1915();
                field672.field1273 = new class193(var10);
                int[] var18 = new int[4];
                for (int var19 = 0; var19 < 4; var19++) {
                    var18[var19] = var10[var19] + 50;
                }
                var2.method3535(var18);
                field659 = 6;
            }
            if (field659 == 6 && var1.method3041() > 0) {
                int var20 = var1.method3029();
                if (var20 == 21 && field825 == 20) {
                    field659 = 9;
                } else if (var20 == 2) {
                    field659 = 11;
                } else if (var20 == 15 && field825 == 40) {
                    field672.field1278 = -1;
                    field659 = 16;
                } else if (var20 == 64) {
                    field659 = 7;
                } else if (var20 == 23 && field680 < 1) {
                    field680++;
                    field659 = 0;
                } else if (var20 == 29) {
                    field659 = 14;
                } else {
                    method114(var20);
                    return;
                }
            }
            if (field659 == 7 && var1.method3041() > 0) {
                Statics.field3398 = var1.method3029();
                field659 = 8;
            }
            if (field659 == 8 && var1.method3041() >= Statics.field3398) {
                var1.method3050(var2.field2373, 0, Statics.field3398);
                var2.field2374 = 0;
                field659 = 6;
            }
            if (field659 == 9 && var1.method3041() > 0) {
                field662 = (var1.method3029() + 3) * 60;
                field659 = 10;
            }
            if (field659 == 10) {
                field660 = 0;
                class80.method94(class240.field2874, class240.field2843, field662 / 60 + class240.field3010);
                if (--field662 <= 0) {
                    field659 = 0;
                }
            } else {
                if (field659 == 11 && var1.method3041() >= 1) {
                    Statics.field1173 = var1.method3029();
                    field659 = 12;
                }
                if (field659 == 12 && var1.method3041() >= Statics.field1173) {
                    boolean var21 = var1.method3029() == 1;
                    var1.method3050(var2.field2373, 0, 4);
                    var2.field2374 = 0;
                    boolean var22 = false;
                    if (var21) {
                        int var23 = var2.method3538() << 24;
                        int var24 = var23 | var2.method3538() << 16;
                        int var25 = var24 | var2.method3538() << 8;
                        int var26 = var25 | var2.method3538();
                        int var27 = class308.method2586(class80.field1159);
                        if (Statics.field257.field1014.size() >= 10 && !Statics.field257.field1014.containsKey(var27)) {
                            Iterator var28 = Statics.field257.field1014.entrySet().iterator();
                            var28.next();
                            var28.remove();
                        }
                        Statics.field257.field1014.put(var27, var26);
                    }
                    if (field664) {
                        Statics.field257.field1015 = class80.field1159;
                    } else {
                        Statics.field257.field1015 = null;
                    }
                    class68.method3057();
                    field761 = var1.method3029();
                    field794 = var1.method3029() == 1;
                    field742 = var1.method3029();
                    field742 <<= 0x8;
                    field742 += var1.method3029();
                    field743 = var1.method3029();
                    var1.method3050(var2.field2373, 0, 1);
                    var2.field2374 = 0;
                    class171[] var29 = new class171[] { class171.field2108, class171.field2091, class171.field2139, class171.field2093, class171.field2094, class171.field2174, class171.field2096, class171.field2119, class171.field2098, class171.field2099, class171.field2100, class171.field2101, class171.field2159, class171.field2103, class171.field2131, class171.field2105, class171.field2106, class171.field2107, class171.field2109, class171.field2150, class171.field2110, class171.field2111, class171.field2158, class171.field2113, class171.field2142, class171.field2115, class171.field2116, class171.field2162, class171.field2118, class171.field2136, class171.field2120, class171.field2121, class171.field2122, class171.field2123, class171.field2124, class171.field2125, class171.field2126, class171.field2097, class171.field2130, class171.field2166, class171.field2135, class171.field2143, class171.field2132, class171.field2133, class171.field2134, class171.field2137, class171.field2112, class171.field2104, class171.field2138, class171.field2173, class171.field2140, class171.field2129, class171.field2095, class171.field2128, class171.field2144, class171.field2102, class171.field2146, class171.field2147, class171.field2148, class171.field2114, class171.field2117, class171.field2151, class171.field2152, class171.field2141, class171.field2154, class171.field2155, class171.field2156, class171.field2157, class171.field2127, class171.field2092, class171.field2160, class171.field2161, class171.field2175, class171.field2163, class171.field2164, class171.field2153, class171.field2145, class171.field2167, class171.field2168, class171.field2169, class171.field2170, class171.field2171, class171.field2172, class171.field2149 };
                    int var31 = var2.method3546();
                    if (var31 < 0 || var31 >= var29.length) {
                        throw new IOException(var31 + " " + var2.field2374);
                    }
                    field672.field1275 = var29[var31];
                    field672.field1278 = field672.field1275.field2165;
                    var1.method3050(var2.field2373, 0, 2);
                    var2.field2374 = 0;
                    field672.field1278 = var2.method3280();
                    try {
                        client var32 = Statics.field3162;
                        JSObject.getWindow(var32).call("zap", (Object[]) null);
                    } catch (Throwable var39) {
                    }
                    field659 = 13;
                }
                if (field659 != 13) {
                    if (field659 == 14 && var1.method3041() >= 2) {
                        var2.field2374 = 0;
                        var1.method3050(var2.field2373, 0, 2);
                        var2.field2374 = 0;
                        Statics.field1016 = var2.method3280();
                        field659 = 15;
                    }
                    if (field659 == 15 && var1.method3041() >= Statics.field1016) {
                        var2.field2374 = 0;
                        var1.method3050(var2.field2373, 0, Statics.field1016);
                        var2.field2374 = 0;
                        String var34 = var2.method3277();
                        String var35 = var2.method3277();
                        String var36 = var2.method3277();
                        class80.method94(var34, var35, var36);
                        method181(10);
                    }
                    if (field659 == 16) {
                        if (field672.field1278 == -1) {
                            if (var1.method3041() < 2) {
                                return;
                            }
                            var1.method3050(var2.field2373, 0, 2);
                            var2.field2374 = 0;
                            field672.field1278 = var2.method3280();
                        }
                        if (var1.method3041() >= field672.field1278) {
                            var1.method3050(var2.field2373, 0, field672.field1278);
                            var2.field2374 = 0;
                            int var37 = field672.field1278;
                            field812.method4917();
                            method426();
                            class84.method599(var2);
                            if (var2.field2374 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field660++;
                        if (field660 > 2000) {
                            if (field680 < 1) {
                                if (Statics.field914 == Statics.field900) {
                                    Statics.field900 = Statics.field2308;
                                } else {
                                    Statics.field900 = Statics.field914;
                                }
                                field680++;
                                field659 = 0;
                            } else {
                                method114(-3);
                            }
                        }
                    }
                } else if (var1.method3041() >= field672.field1278) {
                    var2.field2374 = 0;
                    var1.method3050(var2.field2373, 0, field672.field1278);
                    field812.method4927();
                    method2083();
                    class84.method599(var2);
                    Statics.field319 = -1;
                    method2908(false, var2);
                    field672.field1275 = null;
                }
            }
        } catch (IOException var40) {
            if (field680 < 1) {
                if (Statics.field914 == Statics.field900) {
                    Statics.field900 = Statics.field2308;
                } else {
                    Statics.field900 = Statics.field914;
                }
                field680++;
                field659 = 0;
            } else {
                method114(-2);
            }
        }
    }

    @ObfuscatedName("cc.fa(I)V")
    public static void method2083() {
        field784 = 1L;
        Statics.field2563.field566 = 0;
        Statics.field27 = true;
        field781 = true;
        field847 = -1L;
        class319.field3819 = new class206();
        field672.method1899();
        field672.field1274.field2374 = 0;
        field672.field1275 = null;
        field672.field1280 = null;
        field672.field1269 = null;
        field672.field1283 = null;
        field672.field1278 = 0;
        field672.field1281 = 0;
        field770 = 0;
        field724 = 0;
        field645 = 0;
        field762 = 0;
        field706 = false;
        class49.field459 = 0;
        class86.field1235.clear();
        class86.field1236.method3652();
        class86.field1238.method3854();
        class86.field1237 = 0;
        field644 = 0;
        field780 = false;
        field861 = 0;
        field695 = 0;
        field700 = 0;
        Statics.field2325 = null;
        field855 = 0;
        field848 = -1;
        field853 = 0;
        field638 = 0;
        field653 = class79.field1123;
        field654 = class79.field1123;
        field667 = 0;
        class84.method986();
        for (int var0 = 0; var0 < 2048; var0++) {
            field888[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field801[var1] = null;
        }
        field635 = -1;
        field894.method3779();
        field756.method3779();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field730[var2][var3][var4] = null;
                }
            }
        }
        field647 = new class208();
        Statics.field391.method1527();
        for (int var5 = 0; var5 < Statics.field3279; var5++) {
            class257 var6 = Statics.method1600(var5);
            if (var6 != null) {
                class228.field2602[var5] = 0;
                class228.field2601[var5] = 0;
            }
        }
        Statics.field1928.method1810();
        field793 = -1;
        if (field668 != -1) {
            class233.method2457(field668);
        }
        for (class57 var7 = (class57) field786.method3720(); var7 != null; var7 = (class57) field786.method3717()) {
            method4130(var7, true);
        }
        field668 = -1;
        field786 = new class205(8);
        field789 = null;
        field762 = 0;
        field706 = false;
        field886.method4090((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field749[var8] = null;
            field750[var8] = false;
        }
        class55.field526 = new class205(32);
        field632 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field842[var9] = true;
        }
        method1508();
        Statics.field51 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field890[var10] = new class5();
        }
        Statics.field911 = null;
    }

    @ObfuscatedName("t.fb(I)V")
    public static void method426() {
        field672.method1899();
        field672.field1274.field2374 = 0;
        field672.field1275 = null;
        field672.field1280 = null;
        field672.field1269 = null;
        field672.field1283 = null;
        field672.field1278 = 0;
        field672.field1281 = 0;
        field770 = 0;
        field762 = 0;
        field706 = false;
        field855 = 0;
        field853 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field888[var0] = null;
        }
        Statics.field476 = null;
        for (int var1 = 0; var1 < field801.length; var1++) {
            class74 var2 = field801[var1];
            if (var2 != null) {
                var2.field944 = -1;
                var2.field962 = false;
            }
        }
        class55.field526 = new class205(32);
        method181(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field842[var3] = true;
        }
        class175 var4 = class175.method3207(class172.field2274, field672.field1273);
        class192 var5 = var4.field2299;
        int var6 = field837 ? 2 : 1;
        var5.method3253(var6);
        var4.field2299.method3254(Statics.field226);
        var4.field2299.method3254(Statics.field387);
        field672.method1901(var4);
    }

    @ObfuscatedName("q.fw(II)V")
    public static void method114(int arg0) {
        if (arg0 == -3) {
            class80.method94(class240.field2877, class240.field2878, class240.field3017);
        } else if (arg0 == -2) {
            class80.method94(class240.field3115, class240.field2859, class240.field2882);
        } else if (arg0 == -1) {
            class80.method94(class240.field3060, class240.field2884, class240.field3106);
        } else if (arg0 == 3) {
            class80.field1133 = 3;
            class80.field1153 = 1;
        } else if (arg0 == 4) {
            class80.method2375(0);
        } else if (arg0 == 5) {
            class80.field1153 = 2;
            class80.method94(class240.field2889, class240.field2890, class240.field2869);
        } else if (arg0 == 6) {
            class80.method94(class240.field2892, class240.field3073, class240.field2980);
        } else if (arg0 == 7) {
            class80.method94(class240.field3043, class240.field3076, class240.field2897);
        } else if (arg0 == 8) {
            class80.method94(class240.field2898, class240.field2903, class240.field2900);
        } else if (arg0 == 9) {
            class80.method94(class240.field2901, class240.field2991, class240.field2979);
        } else if (arg0 == 10) {
            class80.method94(class240.field2904, class240.field2966, class240.field2906);
        } else if (arg0 == 11) {
            class80.method94(class240.field2858, class240.field2883, class240.field2909);
        } else if (arg0 == 12) {
            class80.method94(class240.field2910, class240.field2911, class240.field2943);
        } else if (arg0 == 13) {
            class80.method94(class240.field3006, class240.field2914, class240.field3012);
        } else if (arg0 == 14) {
            class80.method94(class240.field2916, class240.field2917, class240.field2876);
        } else if (arg0 == 16) {
            class80.method94(class240.field2919, class240.field2920, class240.field2862);
        } else if (arg0 == 17) {
            class80.method94(class240.field2922, class240.field2852, class240.field3089);
        } else if (arg0 == 18) {
            class80.method2375(1);
        } else if (arg0 == 19) {
            class80.method94(class240.field2896, class240.field2929, class240.field2930);
        } else if (arg0 == 20) {
            class80.method94(class240.field2847, class240.field2932, class240.field2933);
        } else if (arg0 == 22) {
            class80.method94(class240.field2934, class240.field2935, class240.field2880);
        } else if (arg0 == 23) {
            class80.method94(class240.field2937, class240.field2938, class240.field2939);
        } else if (arg0 == 24) {
            class80.method94(class240.field2915, class240.field2941, class240.field2942);
        } else if (arg0 == 25) {
            class80.method94(class240.field2881, class240.field2944, class240.field2945);
        } else if (arg0 == 26) {
            class80.method94(class240.field2946, class240.field2947, class240.field2952);
        } else if (arg0 == 27) {
            class80.method94(class240.field2833, class240.field2950, class240.field2951);
        } else if (arg0 == 31) {
            class80.method94(class240.field2958, class240.field2959, class240.field2921);
        } else if (arg0 == 32) {
            class80.method94(class240.field2848, class240.field2962, class240.field2832);
        } else if (arg0 == 37) {
            class80.method94(class240.field2918, class240.field2965, class240.field3031);
        } else if (arg0 == 38) {
            class80.method94(class240.field2967, class240.field3061, class240.field2969);
        } else if (arg0 == 55) {
            class80.field1133 = 8;
        } else if (arg0 == 56) {
            class80.method94(class240.field2974, class240.field2975, class240.field2976);
            method181(11);
            return;
        } else if (arg0 == 57) {
            class80.method94(class240.field3082, class240.field2895, class240.field2963);
            method181(11);
            return;
        } else if (arg0 == 61) {
            class80.field1133 = 7;
        } else {
            class80.method94(class240.field2902, class240.field2981, class240.field2949);
        }
        method181(10);
    }

    @ObfuscatedName("bb.fl(B)V")
    public static final void method1590() {
        field672.method1903();
        method4591();
        Statics.field52.method2682();
        for (int var0 = 0; var0 < 4; var0++) {
            field683[var0].method3119();
        }
        System.gc();
        class220.method3165(2);
        field857 = -1;
        field858 = false;
        for (class70 var1 = (class70) class70.field1044.method3799(); var1 != null; var1 = (class70) class70.field1044.method3780()) {
            if (var1.field1037 != null) {
                Statics.field392.method1924(var1.field1037);
                var1.field1037 = null;
            }
            if (var1.field1042 != null) {
                Statics.field392.method1924(var1.field1042);
                var1.field1042 = null;
            }
        }
        class70.field1044.method3779();
        method181(10);
    }

    @ObfuscatedName("jn.fo(I)V")
    public static final void method4591() {
        class275.method64();
        class262.field3333.method3695();
        class263.method2960();
        class271.method4352();
        class274.field3537.method3695();
        class274.field3538.method3695();
        class272.method3530();
        class276.method2934();
        class261.field3319.method3695();
        class261.field3324.method3695();
        class266.field3369.method3695();
        class257.method1772();
        class270.field3413.method3695();
        class270.field3402.method3695();
        class270.field3401.method3695();
        class264.field3365.method3695();
        class264.field3355.method3695();
        Statics.method4550();
        class267.method1839();
        class258.field3288.method3695();
        class230.field2619.method3695();
        class233.field2637.method3695();
        class233.field2638.method3695();
        class233.field2634.method3695();
        class233.field2640.method3695();
        ((class114) Statics.field1744).method2358();
        class87.field1242.method3695();
        Statics.field584.method4329();
        Statics.field241.method4329();
        Statics.field516.method4329();
        Statics.field2779.method4329();
        Statics.field1629.method4329();
        Statics.field397.method4329();
        Statics.field250.method4329();
        Statics.field1260.method4329();
        Statics.field395.method4329();
        Statics.field1916.method4329();
        Statics.field618.method4329();
        Statics.field234.method4329();
    }

    @ObfuscatedName("bc.fr(I)V")
    public static final void method1009() {
        if (field724 > 0) {
            method1590();
        } else {
            field812.method4913();
            method181(40);
            Statics.field1486 = field672.method1900();
            field672.method1904();
        }
    }

    @ObfuscatedName("bk.fq(ZI)V")
    public static final void method988(boolean arg0) {
        if (arg0) {
            field663 = class80.field1164 ? class149.field1952 : class149.field1954;
        } else {
            field663 = Statics.field257.field1014.containsKey(class308.method2586(class80.field1159)) ? class149.field1955 : class149.field1953;
        }
    }

    @ObfuscatedName("client.fp(I)V")
    public final void method1115() {
        if (field770 > 1) {
            field770--;
        }
        if (field724 > 0) {
            field724--;
        }
        if (field674) {
            field674 = false;
            method1009();
            return;
        }
        if (!field706) {
            method1897();
        }
        for (int var1 = 0; var1 < 100 && this.method1118(field672); var1++) {
        }
        if (field825 != 30) {
            return;
        }
        while (true) {
            class318 var2 = (class318) class319.field3819.method3740();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field812.field3653) {
                    class175 var6 = class175.method3207(class172.field2225, field672.field1273);
                    var6.field2299.method3253(0);
                    int var7 = var6.field2299.field2374;
                    field812.method4918(var6.field2299);
                    var6.field2299.method3266(var6.field2299.field2374 - var7);
                    field672.method1901(var6);
                    field812.method4916();
                }
                Object var8 = Statics.field2563.field565;
                synchronized (Statics.field2563.field565) {
                    if (!field741) {
                        Statics.field2563.field566 = 0;
                    } else if (class49.field472 != 0 || Statics.field2563.field566 >= 40) {
                        class175 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field2563.field566 && (var9 == null || var9.field2299.field2374 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field2563.field564[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field2563.field568[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field639 != var16 || field640 != var15) {
                                if (var9 == null) {
                                    var9 = class175.method3207(class172.field2180, field672.field1273);
                                    var9.field2299.method3253(0);
                                    var10 = var9.field2299.field2374;
                                    var9.field2299.field2374 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field641 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field639;
                                    var18 = var15 - field640;
                                    var19 = (int) ((Statics.field2563.field569[var14] - field641) / 20L);
                                    var12 = (int) ((Statics.field2563.field569[var14] - field641) % 20L + (long) var12);
                                }
                                field639 = var16;
                                field640 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2299.method3254((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2299.method3253(var19 + 128);
                                    var9.field2299.method3254((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2299.method3253(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2299.method3256(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2299.method3256(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2299.method3254((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2299.method3256(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2299.method3256(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field641 = Statics.field2563.field569[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2299.method3266(var9.field2299.field2374 - var10);
                            int var20 = var9.field2299.field2374;
                            var9.field2299.field2374 = var10;
                            var9.field2299.method3253(var12 / var13);
                            var9.field2299.method3253(var12 % var13);
                            var9.field2299.field2374 = var20;
                            field672.method1901(var9);
                        }
                        if (var11 >= Statics.field2563.field566) {
                            Statics.field2563.field566 = 0;
                        } else {
                            Statics.field2563.field566 -= var11;
                            System.arraycopy(Statics.field2563.field568, var11, Statics.field2563.field568, 0, Statics.field2563.field566);
                            System.arraycopy(Statics.field2563.field564, var11, Statics.field2563.field564, 0, Statics.field2563.field566);
                            System.arraycopy(Statics.field2563.field569, var11, Statics.field2563.field569, 0, Statics.field2563.field566);
                        }
                    }
                }
                if (class49.field472 == 1 || !Statics.field246 && class49.field472 == 4 || class49.field472 == 2) {
                    long var22 = (class49.field475 - field784 * -1L) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field784 = class49.field475 * -1L;
                    int var24 = class49.field468;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field387) {
                        var24 = Statics.field387;
                    }
                    int var25 = class49.field457;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field226) {
                        var25 = Statics.field226;
                    }
                    int var26 = (int) var22;
                    class175 var27 = class175.method3207(class172.field2194, field672.field1273);
                    var27.field2299.method3254((var26 << 1) + (class49.field472 == 2 ? 1 : 0));
                    var27.field2299.method3254(var25);
                    var27.field2299.method3254(var24);
                    field672.method1901(var27);
                }
                if (class40.field361 > 0) {
                    class175 var28 = class175.method3207(class172.field2177, field672.field1273);
                    var28.field2299.method3254(0);
                    int var29 = var28.field2299.field2374;
                    long var30 = class187.method1700();
                    for (int var32 = 0; var32 < class40.field361; var32++) {
                        long var33 = var30 - field847;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field847 = var30;
                        var28.field2299.method3399(class40.field374[var32]);
                        var28.field2299.method3324((int) var33);
                    }
                    var28.field2299.method3265(var28.field2299.field2374 - var29);
                    field672.method1901(var28);
                }
                if (field709 > 0) {
                    field709--;
                }
                if (class40.field377[96] || class40.field377[97] || class40.field377[98] || class40.field377[99]) {
                    field699 = true;
                }
                if (field699 && field709 <= 0) {
                    field709 = 20;
                    field699 = false;
                    class175 var35 = class175.method3207(class172.field2223, field672.field1273);
                    var35.field2299.method3303(field695);
                    var35.field2299.method3302(field694);
                    field672.method1901(var35);
                }
                if (Statics.field27 && !field781) {
                    field781 = true;
                    class175 var36 = class175.method3207(class172.field2263, field672.field1273);
                    var36.field2299.method3253(1);
                    field672.method1901(var36);
                }
                if (!Statics.field27 && field781) {
                    field781 = false;
                    class175 var37 = class175.method3207(class172.field2263, field672.field1273);
                    var37.field2299.method3253(0);
                    field672.method1901(var37);
                }
                if (Statics.field1979 != null) {
                    Statics.field1979.method5639();
                }
                if (Statics.field1921) {
                    if (Statics.field51 != null) {
                        Statics.field51.method5045();
                    }
                    method2879();
                    Statics.field1921 = false;
                }
                if (Statics.field585 != field848) {
                    field848 = Statics.field585;
                    int var38 = Statics.field585;
                    int[] var39 = Statics.field3610.field3851;
                    int var40 = var39.length;
                    for (int var41 = 0; var41 < var40; var41++) {
                        var39[var41] = 0;
                    }
                    for (int var42 = 1; var42 < 103; var42++) {
                        int var43 = (103 - var42) * 2048 + 24628;
                        for (int var44 = 1; var44 < 103; var44++) {
                            if ((class51.field488[var38][var44][var42] & 0x18) == 0) {
                                Statics.field52.method2705(var39, var43, 512, var38, var44, var42);
                            }
                            if (var38 < 3 && (class51.field488[var38 + 1][var44][var42] & 0x8) != 0) {
                                Statics.field52.method2705(var39, var43, 512, var38 + 1, var44, var42);
                            }
                            var43 += 4;
                        }
                    }
                    int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field3610.method5475();
                    for (int var47 = 1; var47 < 103; var47++) {
                        for (int var48 = 1; var48 < 103; var48++) {
                            if ((class51.field488[var38][var48][var47] & 0x18) == 0) {
                                method2860(var38, var48, var47, var45, var46);
                            }
                            if (var38 < 3 && (class51.field488[var38 + 1][var48][var47] & 0x8) != 0) {
                                method2860(var38 + 1, var48, var47, var45, var46);
                            }
                        }
                    }
                    field849 = 0;
                    for (int var49 = 0; var49 < 104; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            long var51 = Statics.field52.method2781(Statics.field585, var49, var50);
                            if (var51 != 0L) {
                                int var53 = class123.method4726(var51);
                                int var54 = class271.method3187(var53).field3454;
                                if (var54 >= 0) {
                                    field852[field849] = class258.method4467(var54).method4464(false);
                                    field693[field849] = var49;
                                    field851[field849] = var50;
                                    field849++;
                                }
                            }
                        }
                    }
                    Statics.field448.method5446();
                }
                if (field825 != 30) {
                    return;
                }
                for (class64 var55 = (class64) field647.method3799(); var55 != null; var55 = (class64) field647.method3780()) {
                    if (var55.field908 > 0) {
                        var55.field908--;
                    }
                    if (var55.field908 != 0) {
                        if (var55.field898 > 0) {
                            var55.field898--;
                        }
                        if (var55.field898 == 0 && var55.field901 >= 1 && var55.field909 >= 1 && var55.field901 <= 102 && var55.field909 <= 102 && (var55.field910 < 0 || class51.method664(var55.field910, var55.field907))) {
                            method1480(var55.field916, var55.field899, var55.field901, var55.field909, var55.field910, var55.field905, var55.field907);
                            var55.field898 = -1;
                            if (var55.field910 == var55.field906 && var55.field906 == -1) {
                                var55.method3766();
                            } else if (var55.field910 == var55.field906 && var55.field905 == var55.field903 && var55.field907 == var55.field904) {
                                var55.method3766();
                            }
                        }
                    } else if (var55.field906 < 0 || class51.method664(var55.field906, var55.field904)) {
                        method1480(var55.field916, var55.field899, var55.field901, var55.field909, var55.field906, var55.field903, var55.field904);
                        var55.method3766();
                    }
                }
                int var10002;
                for (int var56 = 0; var56 < field861; var56++) {
                    var10002 = field864[var56]--;
                    if (field864[var56] >= -10) {
                        class94 var58 = field866[var56];
                        if (var58 == null) {
                            class94 var10000 = (class94) null;
                            var58 = class94.method1974(Statics.field2779, field862[var56], 0);
                            if (var58 == null) {
                                continue;
                            }
                            field864[var56] += var58.method1972();
                            field866[var56] = var58;
                        }
                        if (field864[var56] < 0) {
                            int var65;
                            if (field753[var56] == 0) {
                                var65 = field859;
                            } else {
                                int var59 = (field753[var56] & 0xFF) * 128;
                                int var60 = field753[var56] >> 16 & 0xFF;
                                int var61 = var60 * 128 + 64 - Statics.field476.field951;
                                if (var61 < 0) {
                                    var61 = -var61;
                                }
                                int var62 = field753[var56] >> 8 & 0xFF;
                                int var63 = var62 * 128 + 64 - Statics.field476.field956;
                                if (var63 < 0) {
                                    var63 = -var63;
                                }
                                int var64 = var61 + var63 - 128;
                                if (var64 > var59) {
                                    field864[var56] = -100;
                                    continue;
                                }
                                if (var64 < 0) {
                                    var64 = 0;
                                }
                                var65 = field649 * (var59 - var64) / var59;
                            }
                            if (var65 > 0) {
                                class96 var66 = var58.method1970().method2018(Statics.field2394);
                                class106 var67 = class106.method2126(var66, 100, var65);
                                var67.method2129(field863[var56] - 1);
                                Statics.field392.method1923(var67);
                            }
                            field864[var56] = -100;
                        }
                    } else {
                        field861--;
                        for (int var57 = var56; var57 < field861; var57++) {
                            field862[var57] = field862[var57 + 1];
                            field866[var57] = field866[var57 + 1];
                            field863[var57] = field863[var57 + 1];
                            field864[var57] = field864[var57 + 1];
                            field753[var57] = field753[var57 + 1];
                        }
                        var56--;
                    }
                }
                if (field858) {
                    boolean var68;
                    if (class220.field2510 == 0) {
                        var68 = Statics.field2509.method3889();
                    } else {
                        var68 = true;
                    }
                    if (!var68) {
                        if (field714 != 0 && field857 != -1) {
                            class220.method447(Statics.field397, field857, 0, field714, false);
                        }
                        field858 = false;
                    }
                }
                field672.field1281++;
                if (field672.field1281 > 750) {
                    method1009();
                    return;
                }
                method2322();
                for (int var69 = 0; var69 < field667; var69++) {
                    int var70 = field669[var69];
                    class74 var71 = field801[var70];
                    if (var71 != null) {
                        method4805(var71, var71.field1088.field3553);
                    }
                }
                int[] var72 = class84.field1217;
                for (int var73 = 0; var73 < class84.field1216; var73++) {
                    class62 var74 = field888[var72[var73]];
                    if (var74 != null && var74.field968 > 0) {
                        var74.field968--;
                        if (var74.field968 == 0) {
                            var74.field931 = null;
                        }
                    }
                }
                for (int var75 = 0; var75 < field667; var75++) {
                    int var76 = field669[var75];
                    class74 var77 = field801[var76];
                    if (var77 != null && var77.field968 > 0) {
                        var77.field968--;
                        if (var77.field968 == 0) {
                            var77.field931 = null;
                        }
                    }
                }
                field687++;
                if (field727 != 0) {
                    field728 += 20;
                    if (field728 >= 400) {
                        field727 = 0;
                    }
                }
                if (Statics.field1268 != null) {
                    field731++;
                    if (field731 >= 15) {
                        method266(Statics.field1268);
                        Statics.field1268 = null;
                    }
                }
                class233 var78 = Statics.field363;
                class233 var79 = Statics.field144;
                Statics.field363 = null;
                Statics.field144 = null;
                field800 = null;
                field804 = false;
                field874 = false;
                field713 = 0;
                while (class40.method25() && field713 < 128) {
                    if (field761 >= 2 && class40.field377[82] && Statics.field180 == 66) {
                        String var80 = class86.method1518();
                        Statics.field3162.method863(var80);
                    } else if (field700 != 1 || Statics.field200 <= 0) {
                        field846[field713] = Statics.field180;
                        field845[field713] = Statics.field200;
                        field713++;
                    }
                }
                if (method911() && class40.field377[82] && class40.field377[81] && field821 != 0) {
                    int var81 = Statics.field476.field611 - field821;
                    if (var81 < 0) {
                        var81 = 0;
                    } else if (var81 > 3) {
                        var81 = 3;
                    }
                    if (Statics.field476.field611 != var81) {
                        method1660(Statics.field2788 + Statics.field476.field933[0], Statics.field599 + Statics.field476.field974[0], var81, false);
                    }
                    field821 = 0;
                }
                if (field668 != -1) {
                    int var82 = field668;
                    int var83 = Statics.field226;
                    int var84 = Statics.field387;
                    if (class233.method3013(var82)) {
                        method1886(Statics.field2639[var82], -1, 0, 0, var83, var84, 0, 0);
                    }
                }
                field808++;
                while (true) {
                    class58 var85;
                    class233 var86;
                    class233 var87;
                    do {
                        var85 = (class58) field823.method3792();
                        if (var85 == null) {
                            while (true) {
                                class58 var88;
                                class233 var89;
                                class233 var90;
                                do {
                                    var88 = (class58) field824.method3792();
                                    if (var88 == null) {
                                        while (true) {
                                            class58 var91;
                                            class233 var92;
                                            class233 var93;
                                            do {
                                                var91 = (class58) field822.method3792();
                                                if (var91 == null) {
                                                    this.method1384();
                                                    method3514();
                                                    if (field796 != null) {
                                                        this.method1355();
                                                    }
                                                    if (Statics.field192 != null) {
                                                        method266(Statics.field192);
                                                        field738++;
                                                        if (class49.field464 == 0) {
                                                            if (field737) {
                                                                if (Statics.field3142 == Statics.field192 && field736 != field703) {
                                                                    class233 var94 = Statics.field192;
                                                                    byte var95 = 0;
                                                                    if (field788 == 1 && var94.field2647 == 206) {
                                                                        var95 = 1;
                                                                    }
                                                                    if (var94.field2762[field736] <= 0) {
                                                                        var95 = 0;
                                                                    }
                                                                    if (class234.method1780(method50(var94))) {
                                                                        int var96 = field703;
                                                                        int var97 = field736;
                                                                        var94.field2762[var97] = var94.field2762[var96];
                                                                        var94.field2763[var97] = var94.field2763[var96];
                                                                        var94.field2762[var96] = -1;
                                                                        var94.field2763[var96] = 0;
                                                                    } else if (var95 == 1) {
                                                                        int var98 = field703;
                                                                        int var99 = field736;
                                                                        while (var98 != var99) {
                                                                            if (var98 > var99) {
                                                                                var94.method4159(var98 - 1, var98);
                                                                                var98--;
                                                                            } else if (var98 < var99) {
                                                                                var94.method4159(var98 + 1, var98);
                                                                                var98++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var94.method4159(field736, field703);
                                                                    }
                                                                    class175 var100 = class175.method3207(class172.field2189, field672.field1273);
                                                                    var100.field2299.method3254(field703);
                                                                    var100.field2299.method3313(Statics.field192.field2677);
                                                                    var100.field2299.method3294(var95);
                                                                    var100.field2299.method3302(field736);
                                                                    field672.method1901(var100);
                                                                }
                                                            } else if (this.method1120()) {
                                                                this.method1266(field734, field735);
                                                            } else if (field762 > 0) {
                                                                int var101 = field734;
                                                                int var102 = field735;
                                                                method3171(Statics.field1902, var101, var102);
                                                                Statics.field1902 = null;
                                                            }
                                                            field731 = 10;
                                                            class49.field472 = 0;
                                                            Statics.field192 = null;
                                                        } else if (field738 >= 5 && (class49.field465 > field734 + 5 || class49.field465 < field734 - 5 || class49.field458 > field735 + 5 || class49.field458 < field735 - 5)) {
                                                            field737 = true;
                                                        }
                                                    }
                                                    if (class128.method2710()) {
                                                        int var103 = class128.field1799;
                                                        int var104 = class128.field1817;
                                                        class175 var105 = class175.method3207(class172.field2192, field672.field1273);
                                                        var105.field2299.method3253(5);
                                                        var105.field2299.method3294(class40.field377[82] ? (class40.field377[81] ? 2 : 1) : 0);
                                                        var105.field2299.method3254(Statics.field2788 + var103);
                                                        var105.field2299.method3304(Statics.field599 + var104);
                                                        field672.method1901(var105);
                                                        class128.method2711();
                                                        field681 = class49.field457;
                                                        field772 = class49.field468;
                                                        field727 = 1;
                                                        field728 = 0;
                                                        field853 = var103;
                                                        field638 = var104;
                                                    }
                                                    if (Statics.field363 != var78) {
                                                        if (var78 != null) {
                                                            method266(var78);
                                                        }
                                                        if (Statics.field363 != null) {
                                                            method266(Statics.field363);
                                                        }
                                                    }
                                                    if (Statics.field144 != var79 && field777 == field776) {
                                                        if (var79 != null) {
                                                            method266(var79);
                                                        }
                                                        if (Statics.field144 != null) {
                                                            method266(Statics.field144);
                                                        }
                                                    }
                                                    if (Statics.field144 == null) {
                                                        if (field776 > 0) {
                                                            field776--;
                                                        }
                                                    } else if (field776 < field777) {
                                                        field776++;
                                                        if (field777 == field776) {
                                                            method266(Statics.field144);
                                                        }
                                                    }
                                                    method1019();
                                                    if (field867) {
                                                        method2863();
                                                    }
                                                    for (int var106 = 0; var106 < 5; var106++) {
                                                        var10002 = field872[var106]++;
                                                    }
                                                    Statics.field1928.method1813();
                                                    int var107 = class49.method108();
                                                    int var108 = class40.field379;
                                                    if (var107 > 15000 && var108 > 15000) {
                                                        field724 = 250;
                                                        class49.field459 = 14500;
                                                        class175 var110 = class175.method3207(class172.field2183, field672.field1273);
                                                        field672.method1901(var110);
                                                    }
                                                    Statics.field391.method1526();
                                                    field672.field1279++;
                                                    if (field672.field1279 > 50) {
                                                        class175 var111 = class175.method3207(class172.field2212, field672.field1273);
                                                        field672.method1901(var111);
                                                    }
                                                    try {
                                                        field672.method1915();
                                                    } catch (IOException var113) {
                                                        method1009();
                                                    }
                                                    return;
                                                }
                                                var92 = var91.field555;
                                                if (var92.field2644 < 0) {
                                                    break;
                                                }
                                                var93 = class233.method457(var92.field2662);
                                            } while (var93 == null || var93.field2691 == null || var92.field2644 >= var93.field2691.length || var93.field2691[var92.field2644] != var92);
                                            class71.method109(var91);
                                        }
                                    }
                                    var89 = var88.field555;
                                    if (var89.field2644 < 0) {
                                        break;
                                    }
                                    var90 = class233.method457(var89.field2662);
                                } while (var90 == null || var90.field2691 == null || var89.field2644 >= var90.field2691.length || var90.field2691[var89.field2644] != var89);
                                class71.method109(var88);
                            }
                        }
                        var86 = var85.field555;
                        if (var86.field2644 < 0) {
                            break;
                        }
                        var87 = class233.method457(var86.field2662);
                    } while (var87 == null || var87.field2691 == null || var86.field2644 >= var87.field2691.length || var87.field2691[var86.field2644] != var86);
                    class71.method109(var85);
                }
            }
            class175 var4 = class175.method3207(class172.field2176, field672.field1273);
            var4.field2299.method3253(0);
            int var5 = var4.field2299.field2374;
            class319.method2901(var4.field2299);
            var4.field2299.method3266(var4.field2299.field2374 - var5);
            field672.method1901(var4);
        }
    }

    @ObfuscatedName("fv.fx(I)V")
    public static final void method3055() {
        if (Statics.field44 != null) {
            Statics.field44.method2041();
        }
        if (Statics.field37 != null) {
            Statics.field37.method2041();
        }
    }

    @ObfuscatedName("cm.fe(Ljo;IIII)V")
    public static void method1885(class276 arg0, int arg1, int arg2, int arg3) {
        if (field861 >= 50 || field649 == 0 || arg0.field3591 == null || arg1 >= arg0.field3591.length) {
            return;
        }
        int var4 = arg0.field3591[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field862[field861] = var5;
        field863[field861] = var6;
        field864[field861] = 0;
        field866[field861] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field753[field861] = (var8 << 16) + (var9 << 8) + var7;
        field861++;
    }

    @ObfuscatedName("jd.fi(IIIB)V")
    public static void method4976(int arg0, int arg1, int arg2) {
        if (field859 == 0 || arg1 == 0 || field861 >= 50) {
            return;
        }
        field862[field861] = arg0;
        field863[field861] = arg1;
        field864[field861] = arg2;
        field866[field861] = null;
        field753[field861] = 0;
        field861++;
    }

    @ObfuscatedName("as.fz(III)V")
    public static void method962(int arg0, int arg1) {
        if (field714 != 0 && arg0 != -1) {
            class220.method447(Statics.field618, arg0, 0, field714, false);
            field858 = true;
        }
    }

    @ObfuscatedName("ea.fm(I)V")
    public static final void method2863() {
        int var0 = Statics.field1091 * 128 + 64;
        int var1 = Statics.field23 * 128 + 64;
        int var2 = method2350(var0, var1, Statics.field585) - Statics.field496;
        if (Statics.field327 < var0) {
            Statics.field327 += Statics.field320 * (var0 - Statics.field327) / 1000 + Statics.field3421;
            if (Statics.field327 > var0) {
                Statics.field327 = var0;
            }
        }
        if (Statics.field327 > var0) {
            Statics.field327 -= Statics.field320 * (Statics.field327 - var0) / 1000 + Statics.field3421;
            if (Statics.field327 < var0) {
                Statics.field327 = var0;
            }
        }
        if (Statics.field1496 < var2) {
            Statics.field1496 += Statics.field320 * (var2 - Statics.field1496) / 1000 + Statics.field3421;
            if (Statics.field1496 > var2) {
                Statics.field1496 = var2;
            }
        }
        if (Statics.field1496 > var2) {
            Statics.field1496 -= Statics.field320 * (Statics.field1496 - var2) / 1000 + Statics.field3421;
            if (Statics.field1496 < var2) {
                Statics.field1496 = var2;
            }
        }
        if (Statics.field209 < var1) {
            Statics.field209 += Statics.field320 * (var1 - Statics.field209) / 1000 + Statics.field3421;
            if (Statics.field209 > var1) {
                Statics.field209 = var1;
            }
        }
        if (Statics.field209 > var1) {
            Statics.field209 -= Statics.field320 * (Statics.field209 - var1) / 1000 + Statics.field3421;
            if (Statics.field209 < var1) {
                Statics.field209 = var1;
            }
        }
        int var3 = Statics.field3708 * 128 + 64;
        int var4 = Statics.field1939 * 128 + 64;
        int var5 = method2350(var3, var4, Statics.field585) - Statics.field586;
        int var6 = var3 - Statics.field327;
        int var7 = var5 - Statics.field1496;
        int var8 = var4 - Statics.field209;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field3174 < var10) {
            Statics.field3174 += Statics.field88 * (var10 - Statics.field3174) / 1000 + Statics.field2597;
            if (Statics.field3174 > var10) {
                Statics.field3174 = var10;
            }
        }
        if (Statics.field3174 > var10) {
            Statics.field3174 -= Statics.field88 * (Statics.field3174 - var10) / 1000 + Statics.field2597;
            if (Statics.field3174 < var10) {
                Statics.field3174 = var10;
            }
        }
        int var12 = var11 - Statics.field2028;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2028 += Statics.field88 * var12 / 1000 + Statics.field2597;
            Statics.field2028 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2028 -= Statics.field88 * -var12 / 1000 + Statics.field2597;
            Statics.field2028 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2028;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2028 = var11;
        }
    }

    @ObfuscatedName("bo.ff(B)V")
    public static final void method1019() {
        if (field700 == 0) {
            int var0 = Statics.field476.field951;
            int var1 = Statics.field476.field956;
            if (Statics.field533 - var0 < -500 || Statics.field533 - var0 > 500 || Statics.field3472 - var1 < -500 || Statics.field3472 - var1 > 500) {
                Statics.field533 = var0;
                Statics.field3472 = var1;
            }
            if (Statics.field533 != var0) {
                Statics.field533 += (var0 - Statics.field533) / 16;
            }
            if (Statics.field3472 != var1) {
                Statics.field3472 += (var1 - Statics.field3472) / 16;
            }
            int var2 = Statics.field533 >> 7;
            int var3 = Statics.field3472 >> 7;
            int var4 = method2350(Statics.field533, Statics.field3472, Statics.field585);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field585;
                        if (var8 < 3 && (class51.field488[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class51.field501[var8][var6][var7];
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
            if (var10 > field832) {
                field832 += (var10 - field832) / 24;
            } else if (var10 < field832) {
                field832 += (var10 - field832) / 80;
            }
            Statics.field3265 = method2350(Statics.field476.field951, Statics.field476.field956, Statics.field585) - field875;
        } else if (field700 == 1) {
            method2950();
            short var11 = -1;
            if (class40.field377[33]) {
                var11 = 0;
            } else if (class40.field377[49]) {
                var11 = 1024;
            }
            if (class40.field377[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class40.field377[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class40.field377[35]) {
                var12 = -1;
            } else if (class40.field377[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class40.field377[81] ? field661 : field705;
                var13 = var14 * 16;
                field726 = var11;
                field704 = var12;
            }
            if (field860 < var13) {
                field860 += var13 / 8;
                if (field860 > var13) {
                    field860 = var13;
                }
            } else if (field860 > var13) {
                field860 = field860 * 9 / 10;
            }
            if (field860 > 0) {
                int var15 = field860 / 16;
                if (field726 >= 0) {
                    int var16 = field726 - Statics.field2028 & 0x7FF;
                    int var17 = class125.field1747[var16];
                    int var18 = class125.field1748[var16];
                    Statics.field533 += var15 * var17 / 65536;
                    Statics.field3472 += var15 * var18 / 65536;
                }
                if (field704 != 0) {
                    Statics.field3265 += field704 * var15;
                    if (Statics.field3265 > 0) {
                        Statics.field3265 = 0;
                    }
                }
            } else {
                field726 = -1;
                field704 = -1;
            }
            if (class40.field377[13]) {
                field672.method1901(class175.method3207(class172.field2256, field672.field1273));
                field700 = 0;
            }
        }
        if (class49.field464 == 4 && Statics.field246) {
            int var19 = class49.field458 - field711;
            field697 = var19 * 2;
            field711 = var19 == -1 || var19 == 1 ? class49.field458 : (field711 + class49.field458) / 2;
            int var20 = field698 - class49.field465;
            field696 = var20 * 2;
            field698 = var20 == -1 || var20 == 1 ? class49.field465 : (field698 + class49.field465) / 2;
        } else {
            if (class40.field377[96]) {
                field696 += (-24 - field696) / 2;
            } else if (class40.field377[97]) {
                field696 += (24 - field696) / 2;
            } else {
                field696 /= 2;
            }
            if (class40.field377[98]) {
                field697 += (12 - field697) / 2;
            } else if (class40.field377[99]) {
                field697 += (-12 - field697) / 2;
            } else {
                field697 /= 2;
            }
            field711 = class49.field458;
            field698 = class49.field465;
        }
        field695 = field696 / 2 + field695 & 0x7FF;
        field694 += field697 / 2;
        if (field694 < 128) {
            field694 = 128;
        }
        if (field694 > 383) {
            field694 = 383;
        }
    }

    @ObfuscatedName("dd.fy(I)V")
    public static final void method2322() {
        int var0 = class84.field1216;
        int[] var1 = class84.field1217;
        for (int var2 = 0; var2 < var0; var2++) {
            class62 var3 = field888[var1[var2]];
            if (var3 != null) {
                method4805(var3, 1);
            }
        }
    }

    @ObfuscatedName("js.fd(Lbu;II)V")
    public static final void method4805(class65 arg0, int arg1) {
        if (arg0.field919 > field637) {
            int var2 = arg0.field919 - field637;
            int var3 = arg0.field960 * 128 + arg0.field921 * 64;
            int var4 = arg0.field937 * 128 + arg0.field921 * 64;
            arg0.field951 += (var3 - arg0.field951) / var2;
            arg0.field956 += (var4 - arg0.field956) / var2;
            arg0.field976 = 0;
            arg0.field945 = arg0.field929;
        } else if (arg0.field965 >= field637) {
            if (field637 == arg0.field965 || arg0.field950 == -1 || arg0.field953 != 0 || arg0.field952 + 1 > class276.method3241(arg0.field950).field3586[arg0.field955]) {
                int var5 = arg0.field965 - arg0.field919;
                int var6 = field637 - arg0.field919;
                int var7 = arg0.field960 * 128 + arg0.field921 * 64;
                int var8 = arg0.field937 * 128 + arg0.field921 * 64;
                int var9 = arg0.field961 * 128 + arg0.field921 * 64;
                int var10 = arg0.field963 * 128 + arg0.field921 * 64;
                arg0.field951 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field956 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field976 = 0;
            arg0.field945 = arg0.field929;
            arg0.field925 = arg0.field945;
        } else {
            arg0.field947 = arg0.field923;
            if (arg0.field972 == 0) {
                arg0.field976 = 0;
            } else {
                label334: {
                    if (arg0.field950 != -1 && arg0.field953 == 0) {
                        class276 var11 = class276.method3241(arg0.field950);
                        if (arg0.field977 > 0 && var11.field3599 == 0) {
                            arg0.field976++;
                            break label334;
                        }
                        if (arg0.field977 <= 0 && var11.field3600 == 0) {
                            arg0.field976++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field951;
                    int var13 = arg0.field956;
                    int var14 = arg0.field933[arg0.field972 - 1] * 128 + arg0.field921 * 64;
                    int var15 = arg0.field974[arg0.field972 - 1] * 128 + arg0.field921 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field945 = 1280;
                        } else if (var13 > var15) {
                            arg0.field945 = 1792;
                        } else {
                            arg0.field945 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field945 = 768;
                        } else if (var13 > var15) {
                            arg0.field945 = 256;
                        } else {
                            arg0.field945 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field945 = 1024;
                    } else if (var13 > var15) {
                        arg0.field945 = 0;
                    }
                    byte var16 = arg0.field918[arg0.field972 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field945 - arg0.field925 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field927;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field926;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field917;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field928;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field926;
                        }
                        arg0.field947 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class74) {
                            var20 = ((class74) arg0).field1088.field3569;
                        }
                        if (var20) {
                            if (arg0.field945 != arg0.field925 && arg0.field944 == -1 && arg0.field957 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field972 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field972 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field976 > 0 && arg0.field972 > 1) {
                                var19 = 8;
                                arg0.field976--;
                            }
                        } else {
                            if (arg0.field972 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field972 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field976 > 0 && arg0.field972 > 1) {
                                var19 = 8;
                                arg0.field976--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field947 == arg0.field926 && arg0.field930 != -1) {
                            arg0.field947 = arg0.field930;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field951 += var19;
                                if (arg0.field951 > var14) {
                                    arg0.field951 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field951 -= var19;
                                if (arg0.field951 < var14) {
                                    arg0.field951 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field956 += var19;
                                if (arg0.field956 > var15) {
                                    arg0.field956 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field956 -= var19;
                                if (arg0.field956 < var15) {
                                    arg0.field956 = var15;
                                }
                            }
                        }
                        if (arg0.field951 == var14 && arg0.field956 == var15) {
                            arg0.field972--;
                            if (arg0.field977 > 0) {
                                arg0.field977--;
                            }
                        }
                    } else {
                        arg0.field951 = var14;
                        arg0.field956 = var15;
                        arg0.field972--;
                        if (arg0.field977 > 0) {
                            arg0.field977--;
                        }
                    }
                }
            }
        }
        if (arg0.field951 < 128 || arg0.field956 < 128 || arg0.field951 >= 13184 || arg0.field956 >= 13184) {
            arg0.field950 = -1;
            arg0.field975 = -1;
            arg0.field919 = 0;
            arg0.field965 = 0;
            arg0.field951 = arg0.field933[0] * 128 + arg0.field921 * 64;
            arg0.field956 = arg0.field974[0] * 128 + arg0.field921 * 64;
            arg0.method1456();
        }
        if (Statics.field476 == arg0 && (arg0.field951 < 1536 || arg0.field956 < 1536 || arg0.field951 >= 11776 || arg0.field956 >= 11776)) {
            arg0.field950 = -1;
            arg0.field975 = -1;
            arg0.field919 = 0;
            arg0.field965 = 0;
            arg0.field951 = arg0.field933[0] * 128 + arg0.field921 * 64;
            arg0.field956 = arg0.field974[0] * 128 + arg0.field921 * 64;
            arg0.method1456();
        }
        method1589(arg0);
        arg0.field920 = false;
        if (arg0.field947 != -1) {
            class276 var21 = class276.method3241(arg0.field947);
            if (var21 == null || var21.field3594 == null) {
                arg0.field947 = -1;
            } else {
                arg0.field949++;
                if (arg0.field922 < var21.field3594.length && arg0.field949 > var21.field3586[arg0.field922]) {
                    arg0.field949 = 1;
                    arg0.field922++;
                    method1885(var21, arg0.field922, arg0.field951, arg0.field956);
                }
                if (arg0.field922 >= var21.field3594.length) {
                    arg0.field949 = 0;
                    arg0.field922 = 0;
                    method1885(var21, arg0.field922, arg0.field951, arg0.field956);
                }
            }
        }
        if (arg0.field975 != -1 && field637 >= arg0.field958) {
            if (arg0.field934 < 0) {
                arg0.field934 = 0;
            }
            int var22 = class261.method1754(arg0.field975).field3323;
            if (var22 == -1) {
                arg0.field975 = -1;
            } else {
                class276 var23 = class276.method3241(var22);
                if (var23 == null || var23.field3594 == null) {
                    arg0.field975 = -1;
                } else {
                    arg0.field954++;
                    if (arg0.field934 < var23.field3594.length && arg0.field954 > var23.field3586[arg0.field934]) {
                        arg0.field954 = 1;
                        arg0.field934++;
                        method1885(var23, arg0.field934, arg0.field951, arg0.field956);
                    }
                    if (arg0.field934 >= var23.field3594.length && (arg0.field934 < 0 || arg0.field934 >= var23.field3594.length)) {
                        arg0.field975 = -1;
                    }
                }
            }
        }
        if (arg0.field950 != -1 && arg0.field953 <= 1) {
            class276 var24 = class276.method3241(arg0.field950);
            if (var24.field3599 == 1 && arg0.field977 > 0 && arg0.field919 <= field637 && arg0.field965 < field637) {
                arg0.field953 = 1;
                return;
            }
        }
        if (arg0.field950 != -1 && arg0.field953 == 0) {
            class276 var25 = class276.method3241(arg0.field950);
            if (var25 == null || var25.field3594 == null) {
                arg0.field950 = -1;
            } else {
                arg0.field952++;
                if (arg0.field955 < var25.field3594.length && arg0.field952 > var25.field3586[arg0.field955]) {
                    arg0.field952 = 1;
                    arg0.field955++;
                    method1885(var25, arg0.field955, arg0.field951, arg0.field956);
                }
                if (arg0.field955 >= var25.field3594.length) {
                    arg0.field955 -= var25.field3592;
                    arg0.field924++;
                    if (arg0.field924 >= var25.field3598) {
                        arg0.field950 = -1;
                    } else if (arg0.field955 >= 0 && arg0.field955 < var25.field3594.length) {
                        method1885(var25, arg0.field955, arg0.field951, arg0.field956);
                    } else {
                        arg0.field950 = -1;
                    }
                }
                arg0.field920 = var25.field3588;
            }
        }
        if (arg0.field953 > 0) {
            arg0.field953--;
        }
    }

    @ObfuscatedName("bz.fu(Lbu;I)V")
    public static final void method1589(class65 arg0) {
        if (arg0.field957 == 0) {
            return;
        }
        if (arg0.field944 != -1) {
            class65 var1 = null;
            if (arg0.field944 < 32768) {
                var1 = field801[arg0.field944];
            } else if (arg0.field944 >= 32768) {
                var1 = field888[arg0.field944 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field951 - var1.field951;
                int var3 = arg0.field956 - var1.field956;
                if (var2 != 0 || var3 != 0) {
                    arg0.field945 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field962) {
                arg0.field944 = -1;
                arg0.field962 = false;
            }
        }
        if (arg0.field946 != -1 && (arg0.field972 == 0 || arg0.field976 > 0)) {
            arg0.field945 = arg0.field946;
            arg0.field946 = -1;
        }
        int var4 = arg0.field945 - arg0.field925 & 0x7FF;
        if (var4 == 0 && arg0.field962) {
            arg0.field944 = -1;
            arg0.field962 = false;
        }
        if (var4 == 0) {
            arg0.field971 = 0;
            return;
        }
        arg0.field971++;
        if (var4 > 1024) {
            arg0.field925 -= arg0.field957;
            boolean var5 = true;
            if (var4 < arg0.field957 || var4 > 2048 - arg0.field957) {
                arg0.field925 = arg0.field945;
                var5 = false;
            }
            if (arg0.field947 == arg0.field923 && (arg0.field971 > 25 || var5)) {
                if (arg0.field932 == -1) {
                    arg0.field947 = arg0.field926;
                } else {
                    arg0.field947 = arg0.field932;
                }
            }
        } else {
            arg0.field925 += arg0.field957;
            boolean var6 = true;
            if (var4 < arg0.field957 || var4 > 2048 - arg0.field957) {
                arg0.field925 = arg0.field945;
                var6 = false;
            }
            if (arg0.field947 == arg0.field923 && (arg0.field971 > 25 || var6)) {
                if (arg0.field970 == -1) {
                    arg0.field947 = arg0.field926;
                } else {
                    arg0.field947 = arg0.field970;
                }
            }
        }
        arg0.field925 &= 0x7FF;
    }

    @ObfuscatedName("gb.fg(I)V")
    public static void method3514() {
        if (Statics.field1979 != null) {
            Statics.field1979.method5648(Statics.field585, (Statics.field476.field951 >> 7) + Statics.field2788, (Statics.field476.field956 >> 7) + Statics.field599, false);
            Statics.field1979.method5779();
        }
    }

    @ObfuscatedName("iz.gd(Lbg;III)V")
    public static void method4221(class62 arg0, int arg1, int arg2) {
        if (arg0.field950 == arg1 && arg1 != -1) {
            int var3 = class276.method3241(arg1).field3601;
            if (var3 == 1) {
                arg0.field955 = 0;
                arg0.field952 = 0;
                arg0.field953 = arg2;
                arg0.field924 = 0;
            }
            if (var3 == 2) {
                arg0.field924 = 0;
            }
        } else if (arg1 == -1 || arg0.field950 == -1 || class276.method3241(arg1).field3584 >= class276.method3241(arg0.field950).field3584) {
            arg0.field950 = arg1;
            arg0.field955 = 0;
            arg0.field952 = 0;
            arg0.field953 = arg2;
            arg0.field924 = 0;
            arg0.field977 = arg0.field972;
        }
    }

    @ObfuscatedName("bm.gh(IB)V")
    public static void method991(int arg0) {
        field836 = 0L;
        if (arg0 >= 2) {
            field837 = true;
        } else {
            field837 = false;
        }
        int var1 = field837 ? 2 : 1;
        if (var1 == 1) {
            Statics.field3162.method728(765, 503);
        } else {
            Statics.field3162.method728(7680, 2160);
        }
        if (field825 >= 25) {
            method1508();
        }
    }

    @ObfuscatedName("bv.ge(I)V")
    public static void method1508() {
        class175 var0 = class175.method3207(class172.field2274, field672.field1273);
        class192 var1 = var0.field2299;
        int var2 = field837 ? 2 : 1;
        var1.method3253(var2);
        var0.field2299.method3254(Statics.field226);
        var0.field2299.method3254(Statics.field387);
        field672.method1901(var0);
    }

    @ObfuscatedName("client.x(B)V")
    public final void method735() {
        field836 = class187.method1700() + 500L;
        this.method1116();
        if (field668 != -1) {
            this.method1122(true);
        }
    }

    @ObfuscatedName("client.gj(I)V")
    public void method1116() {
        int var1 = Statics.field226;
        int var2 = Statics.field387;
        if (this.field433 < var1) {
            int var3 = this.field433;
        }
        if (this.field434 < var2) {
            int var4 = this.field434;
        }
        if (Statics.field257 == null) {
            return;
        }
        try {
            client var5 = Statics.field3162;
            int var6 = field837 ? 2 : 1;
            class42.method650(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public final void method1429() {
        if (field668 != -1) {
            method189(field668);
        }
        for (int var1 = 0; var1 < field630; var1++) {
            if (field842[var1]) {
                field829[var1] = true;
            }
            field830[var1] = field842[var1];
            field842[var1] = false;
        }
        field827 = field637;
        field774 = -1;
        field775 = -1;
        Statics.field3142 = null;
        if (field668 != -1) {
            field630 = 0;
            method1517(field668, 0, 0, Statics.field226, Statics.field387, 0, 0, -1);
        }
        class320.method5363();
        if (field676) {
            if (field727 == 1) {
                Statics.field236[field728 / 100].method5569(field681 - 8, field772 - 8);
            }
            if (field727 == 2) {
                Statics.field236[field728 / 100 + 4].method5569(field681 - 8, field772 - 8);
            }
        }
        if (field706) {
            int var2 = Statics.field1947;
            int var3 = Statics.field624;
            int var4 = Statics.field139;
            int var5 = Statics.field390;
            int var6 = 6116423;
            class320.method5372(var2, var3, var4, var5, var6);
            class320.method5372(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class320.method5428(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field3758.method5144(class240.field2989, var2 + 3, var3 + 14, var6, -1);
            int var7 = class49.field465;
            int var8 = class49.field458;
            for (int var9 = 0; var9 < field762; var9++) {
                int var10 = (field762 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field3758.method5144(method4625(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field1947;
            int var13 = Statics.field624;
            int var14 = Statics.field139;
            int var15 = Statics.field390;
            for (int var16 = 0; var16 < field630; var16++) {
                if (field833[var16] + field831[var16] > var12 && field831[var16] < var12 + var14 && field843[var16] + field834[var16] > var13 && field843[var16] < var13 + var15) {
                    field829[var16] = true;
                }
            }
        } else if (field774 != -1) {
            method3056(field774, field775);
        }
        if (field835 == 3) {
            for (int var17 = 0; var17 < field630; var17++) {
                if (field830[var17]) {
                    class320.method5412(field831[var17], field843[var17], field833[var17], field834[var17], 16711935, 128);
                } else if (field829[var17]) {
                    class320.method5412(field831[var17], field843[var17], field833[var17], field834[var17], 16711680, 128);
                }
            }
        }
        int var18 = Statics.field585;
        int var19 = Statics.field476.field951;
        int var20 = Statics.field476.field956;
        int var21 = field687;
        for (class70 var22 = (class70) class70.field1044.method3799(); var22 != null; var22 = (class70) class70.field1044.method3780()) {
            if (var22.field1043 != -1 || var22.field1040 != null) {
                int var23 = 0;
                if (var19 > var22.field1029) {
                    var23 += var19 - var22.field1029;
                } else if (var19 < var22.field1045) {
                    var23 += var22.field1045 - var19;
                }
                if (var20 > var22.field1034) {
                    var23 += var20 - var22.field1034;
                } else if (var20 < var22.field1032) {
                    var23 += var22.field1032 - var20;
                }
                if (var23 - 64 > var22.field1035 || field649 == 0 || var22.field1030 != var18) {
                    if (var22.field1037 != null) {
                        Statics.field392.method1924(var22.field1037);
                        var22.field1037 = null;
                    }
                    if (var22.field1042 != null) {
                        Statics.field392.method1924(var22.field1042);
                        var22.field1042 = null;
                    }
                } else {
                    var23 -= 64;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var24 = field649 * (var22.field1035 - var23) / var22.field1035;
                    class94 var10000;
                    if (var22.field1037 != null) {
                        var22.field1037.method2130(var24);
                    } else if (var22.field1043 >= 0) {
                        var10000 = (class94) null;
                        class94 var25 = class94.method1974(Statics.field2779, var22.field1043, 0);
                        if (var25 != null) {
                            class96 var26 = var25.method1970().method2018(Statics.field2394);
                            class106 var27 = class106.method2126(var26, 100, var24);
                            var27.method2129(-1);
                            Statics.field392.method1923(var27);
                            var22.field1037 = var27;
                        }
                    }
                    if (var22.field1042 != null) {
                        var22.field1042.method2130(var24);
                        if (!var22.field1042.method3768()) {
                            var22.field1042 = null;
                        }
                    } else if (var22.field1040 != null && (var22.field1041 -= var21) <= 0) {
                        int var28 = (int) (Math.random() * (double) var22.field1040.length);
                        var10000 = (class94) null;
                        class94 var29 = class94.method1974(Statics.field2779, var22.field1040[var28], 0);
                        if (var29 != null) {
                            class96 var30 = var29.method1970().method2018(Statics.field2394);
                            class106 var31 = class106.method2126(var30, 100, var24);
                            var31.method2129(0);
                            Statics.field392.method1923(var31);
                            var22.field1042 = var31;
                            var22.field1041 = var22.field1038 + (int) (Math.random() * (double) (var22.field1039 - var22.field1038));
                        }
                    }
                }
            }
        }
        field687 = 0;
    }

    @ObfuscatedName("dd.gb(Ljava/lang/String;ZI)V")
    public static final void method2349(String arg0, boolean arg1) {
        if (!field740) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1935.method5162(arg0, 250);
        int var6 = Statics.field1935.method5207(arg0, 250) * 13;
        class320.method5372(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class320.method5428(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1935.method5196(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3117(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field448.method712(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field630; var11++) {
            if (field833[var11] + field831[var11] > var7 && field831[var11] < var7 + var9 && field843[var11] + field834[var11] > var8 && field843[var11] < var8 + var10) {
                field829[var11] = true;
            }
        }
    }

    @ObfuscatedName("bx.gi(IIIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3) {
        field723++;
        method670();
        if (field744) {
            method4435(Statics.field476, false);
        }
        method1576();
        method8(true);
        method89();
        method8(false);
        method74();
        for (class72 var4 = (class72) field756.method3799(); var4 != null; var4 = (class72) field756.method3780()) {
            if (Statics.field585 != var4.field1068 || var4.field1072) {
                var4.method3766();
            } else if (field637 >= var4.field1064) {
                var4.method1659(field687);
                if (var4.field1072) {
                    var4.method3766();
                } else {
                    Statics.field52.method2683(var4.field1068, var4.field1071, var4.field1067, var4.field1063, 60, var4, 0, -1L, false);
                }
            }
        }
        method2847(arg0, arg1, arg2, arg3, true);
        int var5 = field881;
        int var6 = field882;
        int var7 = field883;
        int var8 = field814;
        class320.method5364(var5, var6, var5 + var7, var6 + var8);
        class125.method2618();
        if (!field867) {
            int var9 = field694;
            if (field832 / 256 > var9) {
                var9 = field832 / 256;
            }
            if (field876[4] && field702[4] + 128 > var9) {
                var9 = field702[4] + 128;
            }
            int var10 = field695 & 0x7FF;
            int var11 = Statics.field533;
            int var12 = Statics.field3265;
            int var13 = Statics.field3472;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class125.field1747[var15];
                int var21 = class125.field1748[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class125.field1747[var16];
                int var24 = class125.field1748[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field327 = var11 - var17;
            Statics.field1496 = var12 - var18;
            Statics.field209 = var13 - var19;
            Statics.field3174 = var9;
            Statics.field2028 = var10;
            if (field700 == 1 && field761 >= 2 && field637 % 50 == 0 && (Statics.field533 >> 7 != Statics.field476.field951 >> 7 || Statics.field3472 >> 7 != Statics.field476.field956 >> 7)) {
                int var26 = Statics.field476.field611;
                int var27 = (Statics.field533 >> 7) + Statics.field2788;
                int var28 = (Statics.field3472 >> 7) + Statics.field599;
                method1660(var27, var28, var26, true);
            }
        }
        int var29;
        if (field867) {
            var29 = method2113();
        } else {
            var29 = method177();
        }
        int var30 = Statics.field327;
        int var31 = Statics.field1496;
        int var32 = Statics.field209;
        int var33 = Statics.field3174;
        int var34 = Statics.field2028;
        for (int var35 = 0; var35 < 5; var35++) {
            if (field876[var35]) {
                int var36 = (int) (Math.random() * (double) (field869[var35] * 2 + 1) - (double) field869[var35] + Math.sin((double) field634[var35] / 100.0D * (double) field872[var35]) * (double) field702[var35]);
                if (var35 == 0) {
                    Statics.field327 += var36;
                }
                if (var35 == 1) {
                    Statics.field1496 += var36;
                }
                if (var35 == 2) {
                    Statics.field209 += var36;
                }
                if (var35 == 3) {
                    Statics.field2028 = Statics.field2028 + var36 & 0x7FF;
                }
                if (var35 == 4) {
                    Statics.field3174 += var36;
                    if (Statics.field3174 < 128) {
                        Statics.field3174 = 128;
                    }
                    if (Statics.field3174 > 383) {
                        Statics.field3174 = 383;
                    }
                }
            }
        }
        int var37 = class49.field465;
        int var38 = class49.field458;
        if (class49.field472 != 0) {
            var37 = class49.field457;
            var38 = class49.field468;
        }
        if (var37 >= var5 && var37 < var5 + var7 && var38 >= var6 && var38 < var6 + var8) {
            int var39 = var37 - var5;
            int var40 = var38 - var6;
            class123.field1701 = var39;
            class123.field1702 = var40;
            class123.field1706 = true;
            class123.field1708 = 0;
            class123.field1703 = false;
        } else {
            class123.field1706 = false;
            class123.field1708 = 0;
        }
        method3055();
        class320.method5372(var5, var6, var7, var8, 0);
        method3055();
        int var41 = class125.field1733;
        class125.field1733 = field885;
        Statics.field52.method2784(Statics.field327, Statics.field1496, Statics.field209, Statics.field3174, Statics.field2028, var29);
        class125.field1733 = var41;
        method3055();
        Statics.field52.method2671();
        field712 = 0;
        boolean var42 = false;
        int var43 = -1;
        int var44 = -1;
        int var45 = class84.field1216;
        int[] var46 = class84.field1217;
        for (int var47 = 0; var47 < field667 + var45; var47++) {
            class65 var48;
            if (var47 < var45) {
                var48 = field888[var46[var47]];
                if (field635 == var46[var47]) {
                    var42 = true;
                    var43 = var47;
                    continue;
                }
                if (Statics.field476 == var48) {
                    var44 = var47;
                    continue;
                }
            } else {
                var48 = field801[field669[var47 - var45]];
            }
            method551(var48, var47, var5, var6, var7, var8);
        }
        if (field744 && var44 != -1) {
            method551(Statics.field476, var44, var5, var6, var7, var8);
        }
        if (var42) {
            method551(field888[field635], var43, var5, var6, var7, var8);
        }
        for (int var49 = 0; var49 < field712; var49++) {
            int var50 = field818[var49];
            int var51 = field715[var49];
            int var52 = field717[var49];
            int var53 = field815[var49];
            boolean var54 = true;
            while (var54) {
                var54 = false;
                for (int var55 = 0; var55 < var49; var55++) {
                    if (var51 + 2 > field715[var55] - field815[var55] && var51 - var53 < field715[var55] + 2 && var50 - var52 < field818[var55] + field717[var55] && var50 + var52 > field818[var55] - field717[var55] && field715[var55] - field815[var55] < var51) {
                        var51 = field715[var55] - field815[var55];
                        var54 = true;
                    }
                }
            }
            field778 = field818[var49];
            field844 = field715[var49] = var51;
            String var56 = field897[var49];
            if (field787 == 0) {
                int var57 = 16776960;
                if (field718[var49] < 6) {
                    var57 = field838[field718[var49]];
                }
                if (field718[var49] == 6) {
                    var57 = field723 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field718[var49] == 7) {
                    var57 = field723 % 20 < 10 ? 255 : 65535;
                }
                if (field718[var49] == 8) {
                    var57 = field723 % 20 < 10 ? 45056 : 8454016;
                }
                if (field718[var49] == 9) {
                    int var58 = 150 - field720[var49];
                    if (var58 < 50) {
                        var57 = var58 * 1280 + 16711680;
                    } else if (var58 < 100) {
                        var57 = 16776960 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var57 = (var58 - 100) * 5 + 65280;
                    }
                }
                if (field718[var49] == 10) {
                    int var59 = 150 - field720[var49];
                    if (var59 < 50) {
                        var57 = var59 * 5 + 16711680;
                    } else if (var59 < 100) {
                        var57 = 16711935 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var57 = (var59 - 100) * 327680 + 255 - (var59 - 100) * 5;
                    }
                }
                if (field718[var49] == 11) {
                    int var60 = 150 - field720[var49];
                    if (var60 < 50) {
                        var57 = 16777215 - var60 * 327685;
                    } else if (var60 < 100) {
                        var57 = (var60 - 50) * 327685 + 65280;
                    } else if (var60 < 150) {
                        var57 = 16777215 - (var60 - 100) * 327680;
                    }
                }
                if (field719[var49] == 0) {
                    Statics.field3758.method5147(var56, field778 + var5, field844 + var6, var57, 0);
                }
                if (field719[var49] == 1) {
                    Statics.field3758.method5201(var56, field778 + var5, field844 + var6, var57, 0, field723);
                }
                if (field719[var49] == 2) {
                    Statics.field3758.method5141(var56, field778 + var5, field844 + var6, var57, 0, field723);
                }
                if (field719[var49] == 3) {
                    Statics.field3758.method5191(var56, field778 + var5, field844 + var6, var57, 0, field723, 150 - field720[var49]);
                }
                if (field719[var49] == 4) {
                    int var61 = (150 - field720[var49]) * (Statics.field3758.method5139(var56) + 100) / 150;
                    class320.method5371(field778 + var5 - 50, var6, field778 + var5 + 50, var6 + var8);
                    Statics.field3758.method5144(var56, field778 + var5 + 50 - var61, field844 + var6, var57, 0);
                    class320.method5364(var5, var6, var5 + var7, var6 + var8);
                }
                if (field719[var49] == 5) {
                    int var62 = 150 - field720[var49];
                    int var63 = 0;
                    if (var62 < 25) {
                        var63 = var62 - 25;
                    } else if (var62 > 125) {
                        var63 = var62 - 125;
                    }
                    class320.method5371(var5, field844 + var6 - Statics.field3758.field3737 - 1, var5 + var7, field844 + var6 + 5);
                    Statics.field3758.method5147(var56, field778 + var5, field844 + var6 + var63, var57, 0);
                    class320.method5364(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                Statics.field3758.method5147(var56, field778 + var5, field844 + var6, 16776960, 0);
            }
        }
        if (field645 == 2) {
            method3109((field648 - Statics.field2788 << 7) + field651, (field807 - Statics.field599 << 7) + field652, field650 * 2);
            if (field778 > -1 && field637 % 20 < 10) {
                Statics.field249[0].method5569(field778 + var5 - 12, field844 + var6 - 28);
            }
        }
        ((class114) Statics.field1744).method2359(field687);
        method2360();
        Statics.field327 = var30;
        Statics.field1496 = var31;
        Statics.field209 = var32;
        Statics.field3174 = var33;
        Statics.field2028 = var34;
        if (field632 && Statics.method2913(true, false) == 0) {
            field632 = false;
        }
        if (field632) {
            class320.method5372(var5, var6, var7, var8, 0);
            method2349(class240.field3054, false);
        }
    }

    @ObfuscatedName("dc.gx(IIIIZB)V")
    public static final void method2847(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field690 - field716) * var5 / 100 + field716;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field879) {
            short var8 = field879;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field868) {
                var6 = field868;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class320.method5363();
                    class320.method5372(arg0, arg1, var10, arg3, -16777216);
                    class320.method5372(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field880) {
            short var11 = field880;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field877) {
                var6 = field877;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class320.method5363();
                    class320.method5372(arg0, arg1, arg2, var13, -16777216);
                    class320.method5372(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field626 - field673) * var5 / 100 + field673;
        field885 = arg3 * var6 * var14 / 85504 << 1;
        if (field883 != arg2 || field814 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class125.field1747[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class128.method2709(var15, 500, 800, arg2, arg3);
        }
        field881 = arg0;
        field882 = arg1;
        field883 = arg2;
        field814 = arg3;
    }

    @ObfuscatedName("ay.gk(B)V")
    public static void method670() {
        if (Statics.field476.field951 >> 7 == field853 && Statics.field476.field956 >> 7 == field638) {
            field853 = 0;
        }
    }

    @ObfuscatedName("bz.gt(I)V")
    public static void method1576() {
        if (field635 >= 0 && field888[field635] != null) {
            method4435(field888[field635], false);
        }
    }

    @ObfuscatedName("p.gl(I)V")
    public static void method89() {
        int var0 = class84.field1216;
        int[] var1 = class84.field1217;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field635 != var1[var2] && field742 != var1[var2]) {
                method4435(field888[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ir.gm(Lbg;ZI)V")
    public static void method4435(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1083() || arg0.field601) {
            return;
        }
        arg0.field608 = false;
        if ((field631 && class84.field1216 > 50 || class84.field1216 > 200) && arg1 && arg0.field947 == arg0.field923) {
            arg0.field608 = true;
        }
        int var2 = arg0.field951 >> 7;
        int var3 = arg0.field956 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method4240(0, 0, 0, false, arg0.field612);
        if (arg0.field605 != null && field637 >= arg0.field598 && field637 < arg0.field604) {
            arg0.field608 = false;
            arg0.field597 = method2350(arg0.field951, arg0.field956, Statics.field585);
            arg0.field948 = field637;
            Statics.field52.method2684(Statics.field585, arg0.field951, arg0.field956, arg0.field597, 60, arg0, arg0.field925, var4, arg0.field592, arg0.field603, arg0.field606, arg0.field607);
            return;
        }
        if ((arg0.field951 & 0x7F) == 64 && (arg0.field956 & 0x7F) == 64) {
            if (field723 == field678[var2][var3]) {
                return;
            }
            field678[var2][var3] = field723;
        }
        arg0.field597 = method2350(arg0.field951, arg0.field956, Statics.field585);
        arg0.field948 = field637;
        Statics.field52.method2683(Statics.field585, arg0.field951, arg0.field956, arg0.field597, 60, arg0, arg0.field925, var4, arg0.field920);
    }

    @ObfuscatedName("y.gu(ZI)V")
    public static final void method8(boolean arg0) {
        for (int var1 = 0; var1 < field667; var1++) {
            class74 var2 = field801[field669[var1]];
            if (var2 != null && var2.method1083() && var2.field1088.field3560 == arg0 && var2.field1088.method4814()) {
                int var3 = var2.field951 >> 7;
                int var4 = var2.field956 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field921 == 1 && (var2.field951 & 0x7F) == 64 && (var2.field956 & 0x7F) == 64) {
                        if (field723 == field678[var3][var4]) {
                            continue;
                        }
                        field678[var3][var4] = field723;
                    }
                    long var5 = class123.method4240(0, 0, 1, !var2.field1088.field3558, field669[var1]);
                    var2.field948 = field637;
                    Statics.field52.method2683(Statics.field585, var2.field951, var2.field956, method2350(var2.field951 + (var2.field921 * 64 - 64), var2.field956 + (var2.field921 * 64 - 64), Statics.field585), var2.field921 * 64 - 64 + 60, var2, var2.field925, var5, var2.field920);
                }
            }
        }
    }

    @ObfuscatedName("j.gg(I)V")
    public static final void method74() {
        for (class81 var0 = (class81) field894.method3799(); var0 != null; var0 = (class81) field894.method3780()) {
            if (Statics.field585 != var0.field1202 || field637 > var0.field1186) {
                var0.method3766();
            } else if (field637 >= var0.field1181) {
                if (var0.field1185 > 0) {
                    class74 var1 = field801[var0.field1185 - 1];
                    if (var1 != null && var1.field951 >= 0 && var1.field951 < 13312 && var1.field956 >= 0 && var1.field956 < 13312) {
                        var0.method1759(var1.field951, var1.field956, method2350(var1.field951, var1.field956, var0.field1202) - var0.field1180, field637);
                    }
                }
                if (var0.field1185 < 0) {
                    int var2 = -var0.field1185 - 1;
                    class62 var3;
                    if (field742 == var2) {
                        var3 = Statics.field476;
                    } else {
                        var3 = field888[var2];
                    }
                    if (var3 != null && var3.field951 >= 0 && var3.field951 < 13312 && var3.field956 >= 0 && var3.field956 < 13312) {
                        var0.method1759(var3.field951, var3.field956, method2350(var3.field951, var3.field956, var0.field1202) - var0.field1180, field637);
                    }
                }
                var0.method1757(field687);
                Statics.field52.method2683(Statics.field585, (int) var0.field1187, (int) var0.field1175, (int) var0.field1189, 60, var0, var0.field1195, -1L, false);
            }
        }
    }

    @ObfuscatedName("z.gc(I)I")
    public static final int method177() {
        if (Statics.field257.field1011) {
            return Statics.field585;
        }
        int var0 = 3;
        if (Statics.field3174 < 310) {
            int var1;
            int var2;
            if (field700 == 1) {
                var1 = Statics.field533 >> 7;
                var2 = Statics.field3472 >> 7;
            } else {
                var1 = Statics.field476.field951 >> 7;
                var2 = Statics.field476.field956 >> 7;
            }
            int var3 = Statics.field327 >> 7;
            int var4 = Statics.field209 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field585;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field585;
            }
            if ((class51.field488[Statics.field585][var3][var4] & 0x4) != 0) {
                var0 = Statics.field585;
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
                    if ((class51.field488[Statics.field585][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field585;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class51.field488[Statics.field585][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field585;
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
                    if ((class51.field488[Statics.field585][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field585;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class51.field488[Statics.field585][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field585;
                        }
                    }
                }
            }
        }
        if (Statics.field476.field951 >= 0 && Statics.field476.field956 >= 0 && Statics.field476.field951 < 13312 && Statics.field476.field956 < 13312) {
            if ((class51.field488[Statics.field585][Statics.field476.field951 >> 7][Statics.field476.field956 >> 7] & 0x4) != 0) {
                var0 = Statics.field585;
            }
            return var0;
        } else {
            return Statics.field585;
        }
    }

    @ObfuscatedName("du.gs(I)I")
    public static final int method2113() {
        if (Statics.field257.field1011) {
            return Statics.field585;
        } else {
            int var0 = method2350(Statics.field327, Statics.field209, Statics.field585);
            return var0 - Statics.field1496 >= 800 || (class51.field488[Statics.field585][Statics.field327 >> 7][Statics.field209 >> 7] & 0x4) == 0 ? 3 : Statics.field585;
        }
    }

    @ObfuscatedName("bm.gv(I)Z")
    public static boolean method992() {
        return (field745 & 0x4) != 0;
    }

    @ObfuscatedName("gb.go(I)Z")
    public static boolean method3513() {
        return (field745 & 0x1) != 0;
    }

    @ObfuscatedName("hx.gy(I)Z")
    public static boolean method4122() {
        return (field745 & 0x2) != 0;
    }

    @ObfuscatedName("bb.gw(Lbg;I)Z")
    public static boolean method1601(class62 arg0) {
        if (field745 == 0) {
            return false;
        } else if (Statics.field476 == arg0) {
            return (field745 & 0x8) != 0;
        } else {
            return method992() || method3513() && arg0.method1052() || method4122() && arg0.method1062();
        }
    }

    @ObfuscatedName("ap.gq(Lbu;IIIIII)V")
    public static final void method551(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1083()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1088;
            if (var6.field3565 != null) {
                var6 = var6.method4815();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1216;
        int[] var8 = class84.field1217;
        byte var9 = 0;
        if (arg1 < var7 && field637 == arg0.field948 && method1601((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                method571(arg0, arg0.field964 + 15);
                class302 var11 = (class302) field677.get(class298.field3713);
                byte var12 = 9;
                var11.method5147(var10.field593.method5079(), field778 + arg2, field844 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field943.method3743()) {
            method571(arg0, arg0.field964 + 15);
            for (class73 var14 = (class73) arg0.field943.method3740(); var14 != null; var14 = (class73) arg0.field943.method3759()) {
                class66 var15 = var14.method1669(field637);
                if (var15 != null) {
                    class264 var16 = var14.field1077;
                    class324 var17 = var16.method4557();
                    class324 var18 = var16.method4556();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3368;
                    } else {
                        if (var16.field3367 * 2 < var18.field3845) {
                            var19 = var16.field3367;
                        }
                        var20 = var18.field3845 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field637 - var15.field982;
                    int var24 = var15.field985 * var20 / var16.field3368;
                    int var27;
                    if (var15.field983 > var23) {
                        int var25 = var16.field3362 == 0 ? 0 : var23 / var16.field3362 * var16.field3362;
                        int var26 = var15.field981 * var20 / var16.field3368;
                        var27 = (var24 - var26) * var25 / var15.field983 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field983 + var16.field3358 - var23;
                        if (var16.field3361 >= 0) {
                            var21 = (var28 << 8) / (var16.field3358 - var16.field3361);
                        }
                    }
                    if (var15.field985 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field778 > -1) {
                            int var34 = field778 + arg2 - (var20 >> 1);
                            int var35 = field844 + arg3 - var13;
                            class320.method5372(var34, var35, var27, 5, 65280);
                            class320.method5372(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3847;
                        var13 += var30;
                        int var31 = field778 + arg2 - (var20 >> 1);
                        int var32 = field844 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5490(var33, var32, var21);
                            class320.method5371(var33, var32, var29 + var33, var30 + var32);
                            var18.method5490(var33, var32, var21);
                        } else {
                            var17.method5569(var33, var32);
                            class320.method5371(var33, var32, var29 + var33, var30 + var32);
                            var18.method5569(var33, var32);
                        }
                        class320.method5364(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1666()) {
                    var14.method3766();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field601) {
                return;
            }
            if (var37.field614 != -1 || var37.field610 != -1) {
                method571(arg0, arg0.field964 + 15);
                if (field778 > -1) {
                    if (var37.field614 != -1) {
                        var36 += 25;
                        Statics.field3359[var37.field614].method5569(field778 + arg2 - 12, field844 + arg3 - var36);
                    }
                    if (var37.field610 != -1) {
                        var36 += 25;
                        Statics.field78[var37.field610].method5569(field778 + arg2 - 12, field844 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field645 == 10 && field755 == var8[arg1]) {
                method571(arg0, arg0.field964 + 15);
                if (field778 > -1) {
                    int var38 = Statics.field249[1].field3847 + var36;
                    Statics.field249[1].method5569(field778 + arg2 - 12, field844 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1088;
            if (var39.field3565 != null) {
                var39 = var39.method4815();
            }
            if (var39.field3563 >= 0 && var39.field3563 < Statics.field78.length) {
                method571(arg0, arg0.field964 + 15);
                if (field778 > -1) {
                    Statics.field78[var39.field3563].method5569(field778 + arg2 - 12, field844 + arg3 - 30);
                }
            }
            if (field645 == 1 && field646 == field669[arg1 - var7] && field637 % 20 < 10) {
                method571(arg0, arg0.field964 + 15);
                if (field778 > -1) {
                    Statics.field249[0].method5569(field778 + arg2 - 12, field844 + arg3 - 28);
                }
            }
        }
        if (arg0.field931 != null && (arg1 >= var7 || !arg0.field969 && (field839 == 4 || !arg0.field966 && (field839 == 0 || field839 == 3 || field839 == 1 && ((class62) arg0).method1052())))) {
            method571(arg0, arg0.field964);
            if (field778 > -1 && field712 < field826) {
                field717[field712] = Statics.field3758.method5139(arg0.field931) / 2;
                field815[field712] = Statics.field3758.field3737;
                field818[field712] = field778;
                field715[field712] = field844;
                field718[field712] = arg0.field935;
                field719[field712] = arg0.field936;
                field720[field712] = arg0.field968;
                field897[field712] = arg0.field931;
                field712++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field940[var40];
            int var42 = arg0.field938[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field637) {
                    continue;
                }
                var43 = class270.method4250(arg0.field938[var40]);
                var44 = var43.field3414;
                if (var43 != null && var43.field3418 != null) {
                    var43 = var43.method4671();
                    if (var43 == null) {
                        arg0.field940[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field941[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method4250(var45);
                if (var46 != null && var46.field3418 != null) {
                    var46 = var46.method4671();
                }
            }
            if (var41 - var44 <= field637) {
                if (var43 == null) {
                    arg0.field940[var40] = -1;
                } else {
                    method571(arg0, arg0.field964 / 2);
                    if (field778 > -1) {
                        if (var40 == 1) {
                            field844 -= 20;
                        }
                        if (var40 == 2) {
                            field778 -= 15;
                            field844 -= 10;
                        }
                        if (var40 == 3) {
                            field778 += 15;
                            field844 -= 10;
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
                        class324 var72 = var43.method4657();
                        if (var72 != null) {
                            var51 = var72.field3845;
                            int var73 = var72.field3847;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3848;
                        }
                        class324 var74 = var43.method4649();
                        if (var74 != null) {
                            var52 = var74.field3845;
                            int var75 = var74.field3847;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3848;
                        }
                        class324 var76 = var43.method4648();
                        if (var76 != null) {
                            var53 = var76.field3845;
                            int var77 = var76.field3847;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3848;
                        }
                        class324 var78 = var43.method4651();
                        if (var78 != null) {
                            var54 = var78.field3845;
                            int var79 = var78.field3847;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3848;
                        }
                        if (var46 != null) {
                            var59 = var46.method4657();
                            if (var59 != null) {
                                var63 = var59.field3845;
                                int var80 = var59.field3847;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3848;
                            }
                            var60 = var46.method4649();
                            if (var60 != null) {
                                var64 = var60.field3845;
                                int var81 = var60.field3847;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3848;
                            }
                            var61 = var46.method4648();
                            if (var61 != null) {
                                var65 = var61.field3845;
                                int var82 = var61.field3847;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3848;
                            }
                            var62 = var46.method4651();
                            if (var62 != null) {
                                var66 = var62.field3845;
                                int var83 = var62.field3847;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3848;
                            }
                        }
                        class301 var84 = var43.method4666();
                        if (var84 == null) {
                            var84 = Statics.field512;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field512;
                        } else {
                            var85 = var46.method4666();
                            if (var85 == null) {
                                var85 = Statics.field512;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4647(arg0.field939[var40]);
                        int var91 = var84.method5139(var90);
                        if (var46 != null) {
                            var87 = var46.method4647(arg0.field942[var40]);
                            var89 = var85.method5139(var87);
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
                        int var108 = arg0.field940[var40] - field637;
                        int var109 = var43.field3400 - var43.field3400 * var108 / var43.field3414;
                        int var110 = var43.field3409 * var108 / var43.field3414 + -var43.field3409;
                        int var111 = field778 + arg2 - (var100 >> 1) + var109;
                        int var112 = field844 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3417 + var112 + 15;
                        int var116 = var115 - var84.field3735;
                        int var117 = var84.field3732 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3417 + var112 + 15;
                            int var119 = var118 - var85.field3735;
                            int var120 = var85.field3732 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3412 >= 0) {
                            var123 = (var108 << 8) / (var43.field3414 - var43.field3412);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5490(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5490(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5490(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5490(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5145(var90, var98 + var111, var115, var43.field3406, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5490(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5490(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5490(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5490(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5145(var87, var106 + var111, var118, var46.field3406, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5569(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5569(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5569(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5569(var101 + var111 - var58, var112);
                            }
                            var84.method5144(var90, var98 + var111, var115, var43.field3406 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5569(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5569(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5569(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5569(var105 + var111 - var70, var112);
                                }
                                var85.method5144(var87, var106 + var111, var118, var46.field3406 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dv.gz(I)V")
    public static final void method2360() {
        field739 = 0;
        int var0 = (Statics.field476.field951 >> 7) + Statics.field2788;
        int var1 = (Statics.field476.field956 >> 7) + Statics.field599;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field739 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field739 = 1;
        }
        if (field739 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field739 = 0;
        }
    }

    @ObfuscatedName("au.gf(Lbu;IB)V")
    public static final void method571(class65 arg0, int arg1) {
        method3109(arg0.field951, arg0.field956, arg1);
    }

    @ObfuscatedName("fb.gr(IIII)V")
    public static final void method3109(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field778 = -1;
            field844 = -1;
            return;
        }
        int var3 = method2350(arg0, arg1, Statics.field585) - arg2;
        int var4 = arg0 - Statics.field327;
        int var5 = var3 - Statics.field1496;
        int var6 = arg1 - Statics.field209;
        int var7 = class125.field1747[Statics.field3174];
        int var8 = class125.field1748[Statics.field3174];
        int var9 = class125.field1747[Statics.field2028];
        int var10 = class125.field1748[Statics.field2028];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field778 = field885 * var11 / var15 + field883 / 2;
            field844 = field885 * var14 / var15 + field814 / 2;
        } else {
            field778 = -1;
            field844 = -1;
        }
    }

    @ObfuscatedName("dd.gp(IIII)I")
    public static final int method2350(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field488[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field501[var5][var3][var4] + class51.field501[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field501[var5][var3][var4 + 1] + class51.field501[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("eg.gn(ZLgt;S)V")
    public static final void method2908(boolean arg0, class192 arg1) {
        field754 = arg0;
        if (!field754) {
            int var2 = arg1.method3280();
            int var3 = arg1.method3307();
            int var4 = arg1.method3280();
            Statics.field1472 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1472[var5][var6] = arg1.method3374();
                }
            }
            Statics.field140 = new int[var4];
            Statics.field3719 = new int[var4];
            Statics.field1926 = new int[var4];
            Statics.field2410 = new byte[var4][];
            Statics.field385 = new byte[var4][];
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
                        Statics.field140[var8] = var11;
                        Statics.field3719[var8] = Statics.field1629.method4274("m" + var9 + "_" + var10);
                        Statics.field1926[var8] = Statics.field1629.method4274("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method1761(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3299() == 1;
        int var13 = arg1.method3280();
        int var14 = arg1.method3307();
        int var15 = arg1.method3280();
        arg1.method3539();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3542(1);
                    if (var19 == 1) {
                        field685[var16][var17][var18] = arg1.method3542(26);
                    } else {
                        field685[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3543();
        Statics.field1472 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1472[var20][var21] = arg1.method3374();
            }
        }
        Statics.field140 = new int[var15];
        Statics.field3719 = new int[var15];
        Statics.field1926 = new int[var15];
        Statics.field2410 = new byte[var15][];
        Statics.field385 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field685[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field140[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field140[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3719[var22] = Statics.field1629.method4274("m" + var31 + "_" + var32);
                            Statics.field1926[var22] = Statics.field1629.method4274("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method1761(var13, var14, !var12);
    }

    @ObfuscatedName("cg.hn(IIZI)V")
    public static final void method1761(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field319 == arg0 && Statics.field66 == arg1) {
            return;
        }
        Statics.field319 = arg0;
        Statics.field66 = arg1;
        method181(25);
        method2349(class240.field3054, true);
        int var3 = Statics.field2788;
        int var4 = Statics.field599;
        Statics.field2788 = (arg0 - 6) * 8;
        Statics.field599 = (arg1 - 6) * 8;
        int var5 = Statics.field2788 - var3;
        int var6 = Statics.field599 - var4;
        int var7 = Statics.field2788;
        int var8 = Statics.field599;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field801[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field933[var11] -= var5;
                    var10.field974[var11] -= var6;
                }
                var10.field951 -= var5 * 128;
                var10.field956 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field888[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field933[var14] -= var5;
                    var13.field974[var14] -= var6;
                }
                var13.field951 -= var5 * 128;
                var13.field956 -= var6 * 128;
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
                        field730[var25][var21][var22] = field730[var25][var23][var24];
                    } else {
                        field730[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field647.method3799(); var26 != null; var26 = (class64) field647.method3780()) {
            var26.field901 -= var5;
            var26.field909 -= var6;
            if (var26.field901 < 0 || var26.field909 < 0 || var26.field901 >= 104 || var26.field909 >= 104) {
                var26.method3766();
            }
        }
        if (field853 != 0) {
            field853 -= var5;
            field638 -= var6;
        }
        field861 = 0;
        field867 = false;
        Statics.field327 -= var5 << 7;
        Statics.field209 -= var6 << 7;
        Statics.field533 -= var5 << 7;
        Statics.field3472 -= var6 << 7;
        field848 = -1;
        field756.method3779();
        field894.method3779();
        for (int var27 = 0; var27 < 4; var27++) {
            field683[var27].method3119();
        }
    }

    @ObfuscatedName("ea.hd(ZB)V")
    public static final void method2861(boolean arg0) {
        method3055();
        field672.field1279++;
        if (field672.field1279 < 50 && !arg0) {
            return;
        }
        field672.field1279 = 0;
        if (field674 || field672.method1900() == null) {
            return;
        }
        class175 var1 = class175.method3207(class172.field2212, field672.field1273);
        field672.method1901(var1);
        try {
            field672.method1915();
        } catch (IOException var3) {
            field674 = true;
        }
    }

    @ObfuscatedName("bo.hy(I)V")
    public static final void method1044() {
        method2861(false);
        field878 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2410.length; var1++) {
            if (Statics.field3719[var1] != -1 && Statics.field2410[var1] == null) {
                Statics.field2410[var1] = Statics.field1629.method4263(Statics.field3719[var1], 0);
                if (Statics.field2410[var1] == null) {
                    var0 = false;
                    field878++;
                }
            }
            if (Statics.field1926[var1] != -1 && Statics.field385[var1] == null) {
                Statics.field385[var1] = Statics.field1629.method4257(Statics.field1926[var1], 0, Statics.field1472[var1]);
                if (Statics.field385[var1] == null) {
                    var0 = false;
                    field878++;
                }
            }
        }
        if (!var0) {
            field666 = 1;
            return;
        }
        field806 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2410.length; var3++) {
            byte[] var4 = Statics.field385[var3];
            if (var4 != null) {
                int var5 = (Statics.field140[var3] >> 8) * 64 - Statics.field2788;
                int var6 = (Statics.field140[var3] & 0xFF) * 64 - Statics.field599;
                if (field754) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class185 var9 = new class185(var4);
                int var10 = -1;
                label1129: while (true) {
                    int var11 = var9.method3282();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3356();
                            if (var16 == 0) {
                                continue label1129;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3299() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class271 var22 = class271.method3187(var10);
                                if (var19 != 22 || !field631 || var22.field3468 != 0 || var22.field3433 == 1 || var22.field3460) {
                                    if (!var22.method4676()) {
                                        field806++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3356();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3299();
                    }
                }
            }
        }
        if (!var2) {
            field666 = 2;
            return;
        }
        if (field666 != 0) {
            method2349(class240.field3054 + class76.field1111 + class76.field1112 + 100 + "%" + class76.field1107, true);
        }
        method3055();
        Statics.field52.method2682();
        for (int var23 = 0; var23 < 4; var23++) {
            field683[var23].method3119();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class51.field488[var24][var25][var26] = 0;
                }
            }
        }
        method3055();
        class51.method4121();
        int var27 = Statics.field2410.length;
        for (class70 var28 = (class70) class70.field1044.method3799(); var28 != null; var28 = (class70) class70.field1044.method3780()) {
            if (var28.field1037 != null) {
                Statics.field392.method1924(var28.field1037);
                var28.field1037 = null;
            }
            if (var28.field1042 != null) {
                Statics.field392.method1924(var28.field1042);
                var28.field1042 = null;
            }
        }
        class70.field1044.method3779();
        method2861(true);
        if (!field754) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field140[var29] >> 8) * 64 - Statics.field2788;
                int var31 = (Statics.field140[var29] & 0xFF) * 64 - Statics.field599;
                byte[] var32 = Statics.field2410[var29];
                if (var32 != null) {
                    method3055();
                    int var33 = Statics.field319 * 8 - 48;
                    int var34 = Statics.field66 * 8 - 48;
                    class167[] var35 = field683;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field2071[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class185 var39 = new class185(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class51.method76(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field140[var43] >> 8) * 64 - Statics.field2788;
                int var45 = (Statics.field140[var43] & 0xFF) * 64 - Statics.field599;
                byte[] var46 = Statics.field2410[var43];
                if (var46 == null && Statics.field66 < 800) {
                    method3055();
                    class51.method5124(var44, var45, 64, 64);
                }
            }
            method2861(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field385[var47];
                if (var48 != null) {
                    int var49 = (Statics.field140[var47] >> 8) * 64 - Statics.field2788;
                    int var50 = (Statics.field140[var47] & 0xFF) * 64 - Statics.field599;
                    method3055();
                    class128 var51 = Statics.field52;
                    class167[] var52 = field683;
                    class185 var53 = new class185(var48);
                    int var54 = -1;
                    while (true) {
                        int var55 = var53.method3282();
                        if (var55 == 0) {
                            break;
                        }
                        var54 += var55;
                        int var56 = 0;
                        while (true) {
                            int var57 = var53.method3356();
                            if (var57 == 0) {
                                break;
                            }
                            var56 += var57 - 1;
                            int var58 = var56 & 0x3F;
                            int var59 = var56 >> 6 & 0x3F;
                            int var60 = var56 >> 12;
                            int var61 = var53.method3299();
                            int var62 = var61 >> 2;
                            int var63 = var61 & 0x3;
                            int var64 = var49 + var59;
                            int var65 = var50 + var58;
                            if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                int var66 = var60;
                                if ((class51.field488[1][var64][var65] & 0x2) == 2) {
                                    var66 = var60 - 1;
                                }
                                class167 var67 = null;
                                if (var66 >= 0) {
                                    var67 = var52[var66];
                                }
                                class51.method436(var60, var64, var65, var54, var63, var62, var51, var67);
                            }
                        }
                    }
                }
            }
        }
        if (field754) {
            for (int var68 = 0; var68 < 4; var68++) {
                method3055();
                for (int var69 = 0; var69 < 13; var69++) {
                    for (int var70 = 0; var70 < 13; var70++) {
                        boolean var71 = false;
                        int var72 = field685[var68][var69][var70];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field140.length; var78++) {
                                if (Statics.field140[var78] == var77 && Statics.field2410[var78] != null) {
                                    class51.method429(Statics.field2410[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field683);
                                    var71 = true;
                                    break;
                                }
                            }
                        }
                        if (!var71) {
                            int var79 = var68;
                            int var80 = var69 * 8;
                            int var81 = var70 * 8;
                            for (int var82 = 0; var82 < 8; var82++) {
                                for (int var83 = 0; var83 < 8; var83++) {
                                    class51.field501[var79][var80 + var82][var81 + var83] = 0;
                                }
                            }
                            if (var80 > 0) {
                                for (int var84 = 1; var84 < 8; var84++) {
                                    class51.field501[var79][var80][var81 + var84] = class51.field501[var79][var80 - 1][var81 + var84];
                                }
                            }
                            if (var81 > 0) {
                                for (int var85 = 1; var85 < 8; var85++) {
                                    class51.field501[var79][var80 + var85][var81] = class51.field501[var79][var80 + var85][var81 - 1];
                                }
                            }
                            if (var80 > 0 && class51.field501[var79][var80 - 1][var81] != 0) {
                                class51.field501[var79][var80][var81] = class51.field501[var79][var80 - 1][var81];
                            } else if (var81 > 0 && class51.field501[var79][var80][var81 - 1] != 0) {
                                class51.field501[var79][var80][var81] = class51.field501[var79][var80][var81 - 1];
                            } else if (var80 > 0 && var81 > 0 && class51.field501[var79][var80 - 1][var81 - 1] != 0) {
                                class51.field501[var79][var80][var81] = class51.field501[var79][var80 - 1][var81 - 1];
                            }
                        }
                    }
                }
            }
            for (int var86 = 0; var86 < 13; var86++) {
                for (int var87 = 0; var87 < 13; var87++) {
                    int var88 = field685[0][var86][var87];
                    if (var88 == -1) {
                        class51.method5124(var86 * 8, var87 * 8, 8, 8);
                    }
                }
            }
            method2861(true);
            for (int var89 = 0; var89 < 4; var89++) {
                method3055();
                for (int var90 = 0; var90 < 13; var90++) {
                    for (int var91 = 0; var91 < 13; var91++) {
                        int var92 = field685[var89][var90][var91];
                        if (var92 != -1) {
                            int var93 = var92 >> 24 & 0x3;
                            int var94 = var92 >> 1 & 0x3;
                            int var95 = var92 >> 14 & 0x3FF;
                            int var96 = var92 >> 3 & 0x7FF;
                            int var97 = (var95 / 8 << 8) + var96 / 8;
                            for (int var98 = 0; var98 < Statics.field140.length; var98++) {
                                if (Statics.field140[var98] == var97 && Statics.field385[var98] != null) {
                                    class51.method1693(Statics.field385[var98], var89, var90 * 8, var91 * 8, var93, (var95 & 0x7) * 8, (var96 & 0x7) * 8, var94, Statics.field52, field683);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2861(true);
        method3055();
        class128 var99 = Statics.field52;
        class167[] var100 = field683;
        for (int var101 = 0; var101 < 4; var101++) {
            for (int var102 = 0; var102 < 104; var102++) {
                for (int var103 = 0; var103 < 104; var103++) {
                    if ((class51.field488[var101][var102][var103] & 0x1) == 1) {
                        int var104 = var101;
                        if ((class51.field488[1][var102][var103] & 0x2) == 2) {
                            var104 = var101 - 1;
                        }
                        if (var104 >= 0) {
                            var100[var104].method3122(var102, var103);
                        }
                    }
                }
            }
        }
        class51.field504 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field504 < -8) {
            class51.field504 = -8;
        }
        if (class51.field504 > 8) {
            class51.field504 = 8;
        }
        class51.field491 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field491 < -16) {
            class51.field491 = -16;
        }
        if (class51.field491 > 16) {
            class51.field491 = 16;
        }
        for (int var105 = 0; var105 < 4; var105++) {
            byte[][] var106 = Statics.field492[var105];
            int var107 = (int) Math.sqrt(5100.0D);
            int var108 = var107 * 768 >> 8;
            for (int var109 = 1; var109 < 103; var109++) {
                for (int var110 = 1; var110 < 103; var110++) {
                    int var111 = class51.field501[var105][var110 + 1][var109] - class51.field501[var105][var110 - 1][var109];
                    int var112 = class51.field501[var105][var110][var109 + 1] - class51.field501[var105][var110][var109 - 1];
                    int var113 = (int) Math.sqrt((double) (var112 * var112 + var111 * var111 + 65536));
                    int var114 = (var111 << 8) / var113;
                    int var115 = 65536 / var113;
                    int var116 = (var112 << 8) / var113;
                    int var117 = (var116 * -50 + var114 * -50 + var115 * -10) / var108 + 96;
                    int var118 = (var106[var110][var109] >> 1) + (var106[var110][var109 + 1] >> 3) + (var106[var110][var109 - 1] >> 2) + (var106[var110 - 1][var109] >> 2) + (var106[var110 + 1][var109] >> 3);
                    Statics.field493[var110][var109] = var117 - var118;
                }
            }
            for (int var119 = 0; var119 < 104; var119++) {
                Statics.field487[var119] = 0;
                Statics.field334[var119] = 0;
                Statics.field1103[var119] = 0;
                Statics.field2081[var119] = 0;
                Statics.field2001[var119] = 0;
            }
            for (int var120 = -5; var120 < 109; var120++) {
                for (int var121 = 0; var121 < 104; var121++) {
                    int var122 = var120 + 5;
                    int var10002;
                    if (var122 >= 0 && var122 < 104) {
                        int var123 = Statics.field485[var105][var122][var121] & 0xFF;
                        if (var123 > 0) {
                            class262 var124 = class262.method4427(var123 - 1);
                            Statics.field487[var121] += var124.field3340;
                            Statics.field334[var121] += var124.field3337;
                            Statics.field1103[var121] += var124.field3338;
                            Statics.field2081[var121] += var124.field3334;
                            var10002 = Statics.field2001[var121]++;
                        }
                    }
                    int var125 = var120 - 5;
                    if (var125 >= 0 && var125 < 104) {
                        int var126 = Statics.field485[var105][var125][var121] & 0xFF;
                        if (var126 > 0) {
                            class262 var127 = class262.method4427(var126 - 1);
                            Statics.field487[var121] -= var127.field3340;
                            Statics.field334[var121] -= var127.field3337;
                            Statics.field1103[var121] -= var127.field3338;
                            Statics.field2081[var121] -= var127.field3334;
                            var10002 = Statics.field2001[var121]--;
                        }
                    }
                }
                if (var120 >= 1 && var120 < 103) {
                    int var128 = 0;
                    int var129 = 0;
                    int var130 = 0;
                    int var131 = 0;
                    int var132 = 0;
                    for (int var133 = -5; var133 < 109; var133++) {
                        int var134 = var133 + 5;
                        if (var134 >= 0 && var134 < 104) {
                            var128 += Statics.field487[var134];
                            var129 += Statics.field334[var134];
                            var130 += Statics.field1103[var134];
                            var131 += Statics.field2081[var134];
                            var132 += Statics.field2001[var134];
                        }
                        int var135 = var133 - 5;
                        if (var135 >= 0 && var135 < 104) {
                            var128 -= Statics.field487[var135];
                            var129 -= Statics.field334[var135];
                            var130 -= Statics.field1103[var135];
                            var131 -= Statics.field2081[var135];
                            var132 -= Statics.field2001[var135];
                        }
                        if (var133 >= 1 && var133 < 103 && (!field631 || (class51.field488[0][var120][var133] & 0x2) != 0 || (class51.field488[var105][var120][var133] & 0x10) == 0)) {
                            if (var105 < class51.field489) {
                                class51.field489 = var105;
                            }
                            int var136 = Statics.field485[var105][var120][var133] & 0xFF;
                            int var137 = Statics.field490[var105][var120][var133] & 0xFF;
                            if (var136 > 0 || var137 > 0) {
                                int var138 = class51.field501[var105][var120][var133];
                                int var139 = class51.field501[var105][var120 + 1][var133];
                                int var140 = class51.field501[var105][var120 + 1][var133 + 1];
                                int var141 = class51.field501[var105][var120][var133 + 1];
                                int var142 = Statics.field493[var120][var133];
                                int var143 = Statics.field493[var120 + 1][var133];
                                int var144 = Statics.field493[var120 + 1][var133 + 1];
                                int var145 = Statics.field493[var120][var133 + 1];
                                int var146 = -1;
                                int var147 = -1;
                                if (var136 > 0) {
                                    int var148 = var128 * 256 / var131;
                                    int var149 = var129 / var132;
                                    int var150 = var130 / var132;
                                    var146 = class51.method278(var148, var149, var150);
                                    int var151 = class51.field504 + var148 & 0xFF;
                                    int var152 = class51.field491 + var150;
                                    if (var152 < 0) {
                                        var152 = 0;
                                    } else if (var152 > 255) {
                                        var152 = 255;
                                    }
                                    var147 = class51.method278(var151, var149, var152);
                                }
                                if (var105 > 0) {
                                    boolean var153 = true;
                                    if (var136 == 0 && Statics.field1848[var105][var120][var133] != 0) {
                                        var153 = false;
                                    }
                                    if (var137 > 0 && !class275.method3059(var137 - 1).field3576) {
                                        var153 = false;
                                    }
                                    if (var153 && var138 == var139 && var138 == var140 && var138 == var141) {
                                        Statics.field3865[var105][var120][var133] |= 0x924;
                                    }
                                }
                                int var154 = 0;
                                if (var147 != -1) {
                                    var154 = class125.field1736[class51.method646(var147, 96)];
                                }
                                if (var137 == 0) {
                                    var99.method2677(var105, var120, var133, 0, 0, -1, var138, var139, var140, var141, class51.method646(var146, var142), class51.method646(var146, var143), class51.method646(var146, var144), class51.method646(var146, var145), 0, 0, 0, 0, var154, 0);
                                } else {
                                    int var155 = Statics.field1848[var105][var120][var133] + 1;
                                    byte var156 = Statics.field502[var105][var120][var133];
                                    class275 var157 = class275.method3059(var137 - 1);
                                    int var158 = var157.field3578;
                                    int var159;
                                    int var160;
                                    if (var158 >= 0) {
                                        var159 = Statics.field1744.method2370(var158);
                                        var160 = -1;
                                    } else if (var157.field3575 == 16711935) {
                                        var160 = -2;
                                        var158 = -1;
                                        var159 = -2;
                                    } else {
                                        var160 = class51.method278(var157.field3580, var157.field3579, var157.field3583);
                                        int var161 = class51.field504 + var157.field3580 & 0xFF;
                                        int var162 = class51.field491 + var157.field3583;
                                        if (var162 < 0) {
                                            var162 = 0;
                                        } else if (var162 > 255) {
                                            var162 = 255;
                                        }
                                        var159 = class51.method278(var161, var157.field3579, var162);
                                    }
                                    int var163 = 0;
                                    if (var159 != -2) {
                                        var163 = class125.field1736[class51.method628(var159, 96)];
                                    }
                                    if (var157.field3582 != -1) {
                                        int var164 = class51.field504 + var157.field3581 & 0xFF;
                                        int var165 = class51.field491 + var157.field3572;
                                        if (var165 < 0) {
                                            var165 = 0;
                                        } else if (var165 > 255) {
                                            var165 = 255;
                                        }
                                        int var166 = class51.method278(var164, var157.field3574, var165);
                                        var163 = class125.field1736[class51.method628(var166, 96)];
                                    }
                                    var99.method2677(var105, var120, var133, var155, var156, var158, var138, var139, var140, var141, class51.method646(var146, var142), class51.method646(var146, var143), class51.method646(var146, var144), class51.method646(var146, var145), class51.method628(var160, var142), class51.method628(var160, var143), class51.method628(var160, var144), class51.method628(var160, var145), var154, var163);
                                }
                            }
                        }
                    }
                }
            }
            for (int var167 = 1; var167 < 103; var167++) {
                for (int var168 = 1; var168 < 103; var168++) {
                    int var173;
                    if ((class51.field488[var105][var168][var167] & 0x8) != 0) {
                        var173 = 0;
                    } else if (var105 <= 0 || (class51.field488[1][var168][var167] & 0x2) == 0) {
                        var173 = var105;
                    } else {
                        var173 = var105 - 1;
                    }
                    var99.method2676(var105, var168, var167, var173);
                }
            }
            Statics.field485[var105] = (byte[][]) null;
            Statics.field490[var105] = (byte[][]) null;
            Statics.field1848[var105] = (byte[][]) null;
            Statics.field502[var105] = (byte[][]) null;
            Statics.field492[var105] = (byte[][]) null;
        }
        var99.method2725(-50, -10, -50);
        for (int var174 = 0; var174 < 104; var174++) {
            for (int var175 = 0; var175 < 104; var175++) {
                if ((class51.field488[1][var174][var175] & 0x2) == 2) {
                    var99.method2674(var174, var175);
                }
            }
        }
        int var176 = 1;
        int var177 = 2;
        int var178 = 4;
        for (int var179 = 0; var179 < 4; var179++) {
            if (var179 > 0) {
                var176 <<= 0x3;
                var177 <<= 0x3;
                var178 <<= 0x3;
            }
            for (int var180 = 0; var180 <= var179; var180++) {
                for (int var181 = 0; var181 <= 104; var181++) {
                    for (int var182 = 0; var182 <= 104; var182++) {
                        if ((Statics.field3865[var180][var182][var181] & var176) != 0) {
                            int var183 = var181;
                            int var184 = var181;
                            int var185 = var180;
                            int var186 = var180;
                            while (var183 > 0 && (Statics.field3865[var180][var182][var183 - 1] & var176) != 0) {
                                var183--;
                            }
                            while (var184 < 104 && (Statics.field3865[var180][var182][var184 + 1] & var176) != 0) {
                                var184++;
                            }
                            label652: while (var185 > 0) {
                                for (int var187 = var183; var187 <= var184; var187++) {
                                    if ((Statics.field3865[var185 - 1][var182][var187] & var176) == 0) {
                                        break label652;
                                    }
                                }
                                var185--;
                            }
                            label641: while (var186 < var179) {
                                for (int var188 = var183; var188 <= var184; var188++) {
                                    if ((Statics.field3865[var186 + 1][var182][var188] & var176) == 0) {
                                        break label641;
                                    }
                                }
                                var186++;
                            }
                            int var189 = (var186 + 1 - var185) * (var184 - var183 + 1);
                            if (var189 >= 8) {
                                short var190 = 240;
                                int var191 = class51.field501[var186][var182][var183] - var190;
                                int var192 = class51.field501[var185][var182][var183];
                                class128.method2675(var179, 1, var182 * 128, var182 * 128, var183 * 128, var184 * 128 + 128, var191, var192);
                                for (int var193 = var185; var193 <= var186; var193++) {
                                    for (int var194 = var183; var194 <= var184; var194++) {
                                        Statics.field3865[var193][var182][var194] &= ~var176;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3865[var180][var182][var181] & var177) != 0) {
                            int var195 = var182;
                            int var196 = var182;
                            int var197 = var180;
                            int var198 = var180;
                            while (var195 > 0 && (Statics.field3865[var180][var195 - 1][var181] & var177) != 0) {
                                var195--;
                            }
                            while (var196 < 104 && (Statics.field3865[var180][var196 + 1][var181] & var177) != 0) {
                                var196++;
                            }
                            label705: while (var197 > 0) {
                                for (int var199 = var195; var199 <= var196; var199++) {
                                    if ((Statics.field3865[var197 - 1][var199][var181] & var177) == 0) {
                                        break label705;
                                    }
                                }
                                var197--;
                            }
                            label694: while (var198 < var179) {
                                for (int var200 = var195; var200 <= var196; var200++) {
                                    if ((Statics.field3865[var198 + 1][var200][var181] & var177) == 0) {
                                        break label694;
                                    }
                                }
                                var198++;
                            }
                            int var201 = (var198 + 1 - var197) * (var196 - var195 + 1);
                            if (var201 >= 8) {
                                short var202 = 240;
                                int var203 = class51.field501[var198][var195][var181] - var202;
                                int var204 = class51.field501[var197][var195][var181];
                                class128.method2675(var179, 2, var195 * 128, var196 * 128 + 128, var181 * 128, var181 * 128, var203, var204);
                                for (int var205 = var197; var205 <= var198; var205++) {
                                    for (int var206 = var195; var206 <= var196; var206++) {
                                        Statics.field3865[var205][var206][var181] &= ~var177;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3865[var180][var182][var181] & var178) != 0) {
                            int var207 = var182;
                            int var208 = var182;
                            int var209 = var181;
                            int var210 = var181;
                            while (var209 > 0 && (Statics.field3865[var180][var182][var209 - 1] & var178) != 0) {
                                var209--;
                            }
                            while (var210 < 104 && (Statics.field3865[var180][var182][var210 + 1] & var178) != 0) {
                                var210++;
                            }
                            label758: while (var207 > 0) {
                                for (int var211 = var209; var211 <= var210; var211++) {
                                    if ((Statics.field3865[var180][var207 - 1][var211] & var178) == 0) {
                                        break label758;
                                    }
                                }
                                var207--;
                            }
                            label747: while (var208 < 104) {
                                for (int var212 = var209; var212 <= var210; var212++) {
                                    if ((Statics.field3865[var180][var208 + 1][var212] & var178) == 0) {
                                        break label747;
                                    }
                                }
                                var208++;
                            }
                            if ((var208 - var207 + 1) * (var210 - var209 + 1) >= 4) {
                                int var213 = class51.field501[var180][var207][var209];
                                class128.method2675(var179, 4, var207 * 128, var208 * 128 + 128, var209 * 128, var210 * 128 + 128, var213, var213);
                                for (int var214 = var207; var214 <= var208; var214++) {
                                    for (int var215 = var209; var215 <= var210; var215++) {
                                        Statics.field3865[var180][var214][var215] &= ~var178;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2861(true);
        int var216 = class51.field489;
        if (var216 > Statics.field585) {
            var216 = Statics.field585;
        }
        if (var216 < Statics.field585 - 1) {
            int var217 = Statics.field585 - 1;
        }
        if (field631) {
            Statics.field52.method2712(class51.field489);
        } else {
            Statics.field52.method2712(0);
        }
        for (int var218 = 0; var218 < 104; var218++) {
            for (int var219 = 0; var219 < 104; var219++) {
                Statics.method1782(var218, var219);
            }
        }
        method3055();
        for (class64 var220 = (class64) field647.method3799(); var220 != null; var220 = (class64) field647.method3780()) {
            if (var220.field908 == -1) {
                var220.field898 = 0;
                Statics.method441(var220);
            } else {
                var220.method3766();
            }
        }
        class271.field3425.method3695();
        if (Statics.field3162.method745()) {
            class175 var221 = class175.method3207(class172.field2188, field672.field1273);
            var221.field2299.method3256(1057001181);
            field672.method1901(var221);
        }
        if (!field754) {
            int var222 = (Statics.field319 - 6) / 8;
            int var223 = (Statics.field319 + 6) / 8;
            int var224 = (Statics.field66 - 6) / 8;
            int var225 = (Statics.field66 + 6) / 8;
            for (int var226 = var222 - 1; var226 <= var223 + 1; var226++) {
                for (int var227 = var224 - 1; var227 <= var225 + 1; var227++) {
                    if (var226 < var222 || var226 > var223 || var227 < var224 || var227 > var225) {
                        Statics.field1629.method4319("m" + var226 + "_" + var227);
                        Statics.field1629.method4319("l" + var226 + "_" + var227);
                    }
                }
            }
        }
        method181(30);
        method3055();
        class51.method92();
        class175 var228 = class175.method3207(class172.field2182, field672.field1273);
        field672.method1901(var228);
        class48.method3072();
    }

    @ObfuscatedName("es.hq(IIIIIB)V")
    public static final void method2860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field52.method2698(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field52.method2702(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field3610.field3851;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class123.method4726(var5);
            class271 var17 = class271.method3187(var16);
            if (var17.field3443 == -1) {
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
                class323 var18 = Statics.field2412[var17.field3443];
                if (var18 != null) {
                    int var19 = (var17.field3437 * 4 - var18.field3838) / 2;
                    int var20 = (var17.field3438 * 4 - var18.field3840) / 2;
                    var18.method5452(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3438) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field52.method2720(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field52.method2702(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class123.method4726(var21);
            class271 var27 = class271.method3187(var26);
            if (var27.field3443 != -1) {
                class323 var28 = Statics.field2412[var27.field3443];
                if (var28 != null) {
                    int var29 = (var27.field3437 * 4 - var28.field3838) / 2;
                    int var30 = (var27.field3438 * 4 - var28.field3840) / 2;
                    var28.method5452(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3438) * 4 + 48 + var30);
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
                int[] var35 = Statics.field3610.field3851;
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
        long var37 = Statics.field52.method2781(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class123.method4726(var37);
        class271 var40 = class271.method3187(var39);
        if (var40.field3443 == -1) {
            return;
        }
        class323 var41 = Statics.field2412[var40.field3443];
        if (var41 != null) {
            int var42 = (var40.field3437 * 4 - var41.field3838) / 2;
            int var43 = (var40.field3438 * 4 - var41.field3840) / 2;
            var41.method5452(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3438) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hl(Lcw;I)Z")
    public final boolean method1118(class90 arg0) {
        class160 var2 = arg0.method1900();
        class192 var3 = arg0.field1274;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1275 == null) {
                if (arg0.field1282) {
                    if (!var2.method3030(1)) {
                        return false;
                    }
                    var2.method3050(arg0.field1274.field2373, 0, 1);
                    arg0.field1281 = 0;
                    arg0.field1282 = false;
                }
                var3.field2374 = 0;
                if (var3.method3536()) {
                    if (!var2.method3030(1)) {
                        return false;
                    }
                    var2.method3050(arg0.field1274.field2373, 1, 1);
                    arg0.field1281 = 0;
                }
                arg0.field1282 = true;
                class171[] var4 = new class171[] { class171.field2108, class171.field2091, class171.field2139, class171.field2093, class171.field2094, class171.field2174, class171.field2096, class171.field2119, class171.field2098, class171.field2099, class171.field2100, class171.field2101, class171.field2159, class171.field2103, class171.field2131, class171.field2105, class171.field2106, class171.field2107, class171.field2109, class171.field2150, class171.field2110, class171.field2111, class171.field2158, class171.field2113, class171.field2142, class171.field2115, class171.field2116, class171.field2162, class171.field2118, class171.field2136, class171.field2120, class171.field2121, class171.field2122, class171.field2123, class171.field2124, class171.field2125, class171.field2126, class171.field2097, class171.field2130, class171.field2166, class171.field2135, class171.field2143, class171.field2132, class171.field2133, class171.field2134, class171.field2137, class171.field2112, class171.field2104, class171.field2138, class171.field2173, class171.field2140, class171.field2129, class171.field2095, class171.field2128, class171.field2144, class171.field2102, class171.field2146, class171.field2147, class171.field2148, class171.field2114, class171.field2117, class171.field2151, class171.field2152, class171.field2141, class171.field2154, class171.field2155, class171.field2156, class171.field2157, class171.field2127, class171.field2092, class171.field2160, class171.field2161, class171.field2175, class171.field2163, class171.field2164, class171.field2153, class171.field2145, class171.field2167, class171.field2168, class171.field2169, class171.field2170, class171.field2171, class171.field2172, class171.field2149 };
                int var6 = var3.method3546();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2374);
                }
                arg0.field1275 = var4[var6];
                arg0.field1278 = arg0.field1275.field2165;
            }
            if (arg0.field1278 == -1) {
                if (!var2.method3030(1)) {
                    return false;
                }
                arg0.method1900().method3050(var3.field2373, 0, 1);
                arg0.field1278 = var3.field2373[0] & 0xFF;
            }
            if (arg0.field1278 == -2) {
                if (!var2.method3030(2)) {
                    return false;
                }
                arg0.method1900().method3050(var3.field2373, 0, 2);
                var3.field2374 = 0;
                arg0.field1278 = var3.method3280();
            }
            if (!var2.method3030(arg0.field1278)) {
                return false;
            }
            var3.field2374 = 0;
            var2.method3050(var3.field2373, 0, arg0.field1278);
            arg0.field1281 = 0;
            field812.method4911();
            arg0.field1283 = arg0.field1269;
            arg0.field1269 = arg0.field1280;
            arg0.field1280 = arg0.field1275;
            if (class171.field2106 == arg0.field1275) {
                method4231(class174.field2287);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2120 == arg0.field1275) {
                int var7 = var3.method3307();
                int var8 = var3.method3363();
                int var9 = var3.method3374();
                class233 var10 = class233.method457(var9);
                var10.field2699 = (var7 << 16) + var8;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1275) {
                int var11 = var3.method3315();
                class233 var12 = class233.method457(var11);
                for (int var13 = 0; var13 < var12.field2762.length; var13++) {
                    var12.field2762[var13] = -1;
                    var12.field2762[var13] = 0;
                }
                method266(var12);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1275) {
                Statics.field391.method1524();
                field816 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2147 == arg0.field1275) {
                int var14 = var3.method3314();
                class233 var15 = class233.method457(var14);
                var15.field2686 = 3;
                var15.field2687 = Statics.field476.field591.method4098();
                method266(var15);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2102 == arg0.field1275) {
                String var16 = var3.method3277();
                String var17 = class302.method5143(class308.method267(class303.method4508(var3)));
                class86.method876(6, var16, var17);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1275) {
                method3199(false, var3);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1275) {
                int var18 = arg0.field1278 + var3.field2374;
                int var19 = var3.method3280();
                int var20 = var3.method3280();
                if (field668 != var19) {
                    field668 = var19;
                    this.method1122(false);
                    method1093(field668);
                    class71.method4548(field668);
                    for (int var21 = 0; var21 < 100; var21++) {
                        field842[var21] = true;
                    }
                }
                while (var20-- > 0) {
                    int var22 = var3.method3374();
                    int var23 = var3.method3280();
                    int var24 = var3.method3299();
                    class57 var25 = (class57) field786.method3734((long) var22);
                    if (var25 != null && var25.field550 != var23) {
                        method4130(var25, true);
                        var25 = null;
                    }
                    if (var25 == null) {
                        class57 var26 = new class57();
                        var26.field550 = var23;
                        var26.field545 = var24;
                        field786.method3718(var26, (long) var22);
                        method1093(var23);
                        class233 var27 = class233.method457(var22);
                        method266(var27);
                        if (field789 != null) {
                            method266(field789);
                            field789 = null;
                        }
                        method151();
                        method709(Statics.field2639[var22 >> 16], var27, false);
                        class71.method4548(var23);
                        if (field668 != -1) {
                            int var28 = field668;
                            if (class233.method3013(var28)) {
                                method1698(Statics.field2639[var28], 1);
                            }
                        }
                        var25 = var26;
                    }
                    var25.field546 = true;
                }
                for (class57 var30 = (class57) field786.method3720(); var30 != null; var30 = (class57) field786.method3717()) {
                    if (var30.field546) {
                        var30.field546 = false;
                    } else {
                        method4130(var30, true);
                    }
                }
                field636 = new class205(512);
                while (var3.field2374 < var18) {
                    int var31 = var3.method3374();
                    int var32 = var3.method3280();
                    int var33 = var3.method3280();
                    int var34 = var3.method3374();
                    for (int var35 = var32; var35 <= var33; var35++) {
                        long var36 = ((long) var31 << 32) + (long) var35;
                        field636.method3718(new class214(var34), var36);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2099 == arg0.field1275) {
                field645 = var3.method3299();
                if (field645 == 1) {
                    field646 = var3.method3280();
                }
                if (field645 >= 2 && field645 <= 6) {
                    if (field645 == 2) {
                        field651 = 64;
                        field652 = 64;
                    }
                    if (field645 == 3) {
                        field651 = 0;
                        field652 = 64;
                    }
                    if (field645 == 4) {
                        field651 = 128;
                        field652 = 64;
                    }
                    if (field645 == 5) {
                        field651 = 64;
                        field652 = 0;
                    }
                    if (field645 == 6) {
                        field651 = 64;
                        field652 = 128;
                    }
                    field645 = 2;
                    field648 = var3.method3280();
                    field807 = var3.method3280();
                    field650 = var3.method3299();
                }
                if (field645 == 10) {
                    field755 = var3.method3280();
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1275) {
                int var38 = var3.method3280();
                int var39 = var3.method3299();
                int var40 = var3.method3280();
                method4976(var38, var39, var40);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2107 == arg0.field1275) {
                Statics.field978 = var3.method3403();
                Statics.field1959 = var3.method3297();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2094 == arg0.field1275) {
                int var41 = var3.method3363();
                int var42 = var3.method3314();
                class228.field2602[var41] = var42;
                if (class228.field2601[var41] != var42) {
                    class228.field2601[var41] = var42;
                }
                method918(var41);
                field752[++field810 - 1 & 0x1F] = var41;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2116 == arg0.field1275) {
                Statics.field978 = var3.method3299();
                Statics.field1959 = var3.method3297();
                while (var3.field2374 < arg0.field1278) {
                    int var43 = var3.method3299();
                    class174 var44 = class174.method2318()[var43];
                    method4231(var44);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2103 == arg0.field1275) {
                field867 = true;
                Statics.field1091 = var3.method3299();
                Statics.field23 = var3.method3299();
                Statics.field496 = var3.method3280();
                Statics.field3421 = var3.method3299();
                Statics.field320 = var3.method3299();
                if (Statics.field320 >= 100) {
                    Statics.field327 = Statics.field1091 * 128 + 64;
                    Statics.field209 = Statics.field23 * 128 + 64;
                    Statics.field1496 = method2350(Statics.field327, Statics.field209, Statics.field585) - Statics.field496;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1275) {
                method145();
                int var45 = var3.method3297();
                int var46 = var3.method3445();
                int var47 = var3.method3299();
                field759[var45] = var46;
                field757[var45] = var47;
                field758[var45] = 1;
                for (int var48 = 0; var48 < 98; var48++) {
                    if (var46 >= class237.field2816[var48]) {
                        field758[var45] = var48 + 2;
                    }
                }
                field813[++field671 - 1 & 0x1F] = var45;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1275) {
                if (field668 != -1) {
                    int var49 = field668;
                    if (class233.method3013(var49)) {
                        method1698(Statics.field2639[var49], 0);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1275) {
                class319.method3233(var3, arg0.field1278);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1275) {
                field855 = var3.method3299();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1275) {
                int var50 = var3.method3374();
                int var51 = var3.method3280();
                class233 var52 = class233.method457(var50);
                if (var52.field2686 != 1 || var52.field2687 != var51) {
                    var52.field2686 = 1;
                    var52.field2687 = var51;
                    method266(var52);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2161 == arg0.field1275) {
                method3141(var3.method3277());
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2091 == arg0.field1275) {
                int var53 = var3.method3314();
                int var54 = var3.method3445();
                class57 var55 = (class57) field786.method3734((long) var54);
                class57 var56 = (class57) field786.method3734((long) var53);
                if (var56 != null) {
                    method4130(var56, var55 == null || var55.field550 != var56.field550);
                }
                if (var55 != null) {
                    var55.method3766();
                    field786.method3718(var55, (long) var53);
                }
                class233 var57 = class233.method457(var54);
                if (var57 != null) {
                    method266(var57);
                }
                class233 var58 = class233.method457(var53);
                if (var58 != null) {
                    method266(var58);
                    method709(Statics.field2639[var58.field2677 >>> 16], var58, true);
                }
                if (field668 != -1) {
                    int var59 = field668;
                    if (class233.method3013(var59)) {
                        method1698(Statics.field2639[var59], 1);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1275) {
                for (int var60 = 0; var60 < class228.field2601.length; var60++) {
                    if (class228.field2602[var60] != class228.field2601[var60]) {
                        class228.field2601[var60] = class228.field2602[var60];
                        method918(var60);
                        field752[++field810 - 1 & 0x1F] = var60;
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1275) {
                method4231(class174.field2292);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1275) {
                method4231(class174.field2296);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2100 == arg0.field1275) {
                int var61 = var3.method3315();
                int var62 = var3.method3306();
                if (var62 == 65535) {
                    var62 = -1;
                }
                int var63 = var3.method3374();
                class233 var64 = class233.method457(var63);
                if (var64.field2642) {
                    var64.field2764 = var62;
                    var64.field2765 = var61;
                    class272 var66 = class272.method4572(var62);
                    var64.field2694 = var66.field3475;
                    var64.field2695 = var66.field3490;
                    var64.field2696 = var66.field3491;
                    var64.field2743 = var66.field3522;
                    var64.field2663 = var66.field3493;
                    var64.field2697 = var66.field3524;
                    if (var66.field3494 == 1) {
                        var64.field2750 = 1;
                    } else {
                        var64.field2750 = 2;
                    }
                    if (var64.field2698 > 0) {
                        var64.field2697 = var64.field2697 * 32 / var64.field2698;
                    } else if (var64.field2772 > 0) {
                        var64.field2697 = var64.field2697 * 32 / var64.field2772;
                    }
                    method266(var64);
                } else if (var62 == -1) {
                    var64.field2686 = 0;
                    arg0.field1275 = null;
                    return true;
                } else {
                    class272 var65 = class272.method4572(var62);
                    var64.field2686 = 4;
                    var64.field2687 = var62;
                    var64.field2694 = var65.field3475;
                    var64.field2695 = var65.field3490;
                    var64.field2697 = var65.field3524 * 100 / var61;
                    method266(var64);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1275) {
                int var67 = var3.method3299();
                class310[] var68 = class310.method1674();
                int var69 = 0;
                class310 var71;
                while (true) {
                    if (var69 >= var68.length) {
                        var71 = null;
                        break;
                    }
                    class310 var70 = var68[var69];
                    if (var70.field3778 == var67) {
                        var71 = var70;
                        break;
                    }
                    var69++;
                }
                Statics.field3311 = var71;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1275) {
                method4231(class174.field2294);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1275) {
                byte var72 = var3.method3319();
                int var73 = var3.method3280();
                class228.field2602[var73] = var72;
                if (class228.field2601[var73] != var72) {
                    class228.field2601[var73] = var72;
                }
                method918(var73);
                field752[++field810 - 1 & 0x1F] = var73;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2097 == arg0.field1275) {
                boolean var74 = var3.method3299() == 1;
                if (var74) {
                    Statics.field50 = class187.method1700() - var3.method3488();
                    Statics.field911 = new class2(var3, true);
                } else {
                    Statics.field911 = null;
                }
                field819 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2108 == arg0.field1275) {
                int var75 = var3.method3363();
                class55 var76 = (class55) class55.field526.method3734((long) var75);
                if (var76 != null) {
                    var76.method3766();
                }
                field811[++field792 - 1 & 0x1F] = var75 & 0x7FFF;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1275) {
                method4231(class174.field2288);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2114 == arg0.field1275) {
                String var77 = var3.method3277();
                int var78 = var3.method3445();
                class233 var79 = class233.method457(var78);
                if (!var77.equals(var79.field2704)) {
                    var79.field2704 = var77;
                    method266(var79);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1275) {
                String var80 = var3.method3277();
                long var81 = var3.method3488();
                long var83 = (long) var3.method3280();
                long var85 = (long) var3.method3272();
                class245 var87 = (class245) class180.method3179(class245.method4213(), var3.method3299());
                long var88 = (var83 << 32) + var85;
                boolean var90 = false;
                for (int var91 = 0; var91 < 100; var91++) {
                    if (field828[var91] == var88) {
                        var90 = true;
                        break;
                    }
                }
                if (var87.field3173 && Statics.field391.method1523(new class294(var80, Statics.field2425))) {
                    var90 = true;
                }
                if (!var90 && field739 == 0) {
                    field828[field642] = var88;
                    field642 = (field642 + 1) % 100;
                    String var92 = class302.method5143(class308.method267(class303.method4508(var3)));
                    if (var87.field3166 == -1) {
                        class86.method993(9, var80, var92, class306.method1106(var81));
                    } else {
                        class86.method993(9, class76.method93(var87.field3166) + var80, var92, class306.method1106(var81));
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2126 == arg0.field1275) {
                field867 = true;
                Statics.field3708 = var3.method3299();
                Statics.field1939 = var3.method3299();
                Statics.field586 = var3.method3280();
                Statics.field2597 = var3.method3299();
                Statics.field88 = var3.method3299();
                if (Statics.field88 >= 100) {
                    int var93 = Statics.field3708 * 128 + 64;
                    int var94 = Statics.field1939 * 128 + 64;
                    int var95 = method2350(var93, var94, Statics.field585) - Statics.field586;
                    int var96 = var93 - Statics.field327;
                    int var97 = var95 - Statics.field1496;
                    int var98 = var94 - Statics.field209;
                    int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                    Statics.field3174 = (int) (Math.atan2((double) var97, (double) var99) * 325.949D) & 0x7FF;
                    Statics.field2028 = (int) (Math.atan2((double) var96, (double) var98) * -325.949D) & 0x7FF;
                    if (Statics.field3174 < 128) {
                        Statics.field3174 = 128;
                    }
                    if (Statics.field3174 > 383) {
                        Statics.field3174 = 383;
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2113 == arg0.field1275) {
                for (int var100 = 0; var100 < Statics.field3279; var100++) {
                    class257 var101 = Statics.method1600(var100);
                    if (var101 != null) {
                        class228.field2602[var100] = 0;
                        class228.field2601[var100] = 0;
                    }
                }
                method145();
                field810 += 32;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1275) {
                int var102 = var3.method3374();
                if (field707 != var102) {
                    field707 = var102;
                    method460();
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2101 == arg0.field1275) {
                field853 = var3.method3299();
                if (field853 == 255) {
                    field853 = 0;
                }
                field638 = var3.method3299();
                if (field638 == 255) {
                    field638 = 0;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2119 == arg0.field1275) {
                class67 var103 = new class67();
                var103.field992 = var3.method3277();
                var103.field998 = var3.method3280();
                int var104 = var3.method3374();
                var103.field999 = var104;
                method181(45);
                var2.method3035();
                Object var105 = null;
                class80.method1898(var103);
                arg0.field1275 = null;
                return false;
            }
            if (class171.field2096 == arg0.field1275) {
                method4231(class174.field2290);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2095 == arg0.field1275) {
                method4231(class174.field2293);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2112 == arg0.field1275) {
                String var106 = var3.method3277();
                Object[] var107 = new Object[var106.length() + 1];
                for (int var108 = var106.length() - 1; var108 >= 0; var108--) {
                    if (var106.charAt(var108) == 's') {
                        var107[var108 + 1] = var3.method3277();
                    } else {
                        var107[var108 + 1] = Integer.valueOf(var3.method3374());
                    }
                }
                var107[0] = Integer.valueOf(var3.method3374());
                class58 var109 = new class58();
                var109.field556 = var107;
                class71.method109(var109);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1275) {
                Statics.field391.method1568(var3, arg0.field1278);
                field816 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1275) {
                int var110 = var3.method3374();
                int var111 = var3.method3280();
                if (var110 < -70000) {
                    var111 += 32768;
                }
                class233 var112;
                if (var110 >= 0) {
                    var112 = class233.method457(var110);
                } else {
                    var112 = null;
                }
                if (var112 != null) {
                    for (int var113 = 0; var113 < var112.field2762.length; var113++) {
                        var112.field2762[var113] = 0;
                        var112.field2763[var113] = 0;
                    }
                }
                class55.method4232(var111);
                int var114 = var3.method3280();
                for (int var115 = 0; var115 < var114; var115++) {
                    int var116 = var3.method3403();
                    if (var116 == 255) {
                        var116 = var3.method3315();
                    }
                    int var117 = var3.method3306();
                    if (var112 != null && var115 < var112.field2762.length) {
                        var112.field2762[var115] = var117;
                        var112.field2763[var115] = var116;
                    }
                    class55.method176(var111, var115, var117 - 1, var116);
                }
                if (var112 != null) {
                    method266(var112);
                }
                method145();
                field811[++field792 - 1 & 0x1F] = var111 & 0x7FFF;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2110 == arg0.field1275) {
                int var118 = var3.method3374();
                int var119 = var3.method3337();
                class233 var120 = class233.method457(var118);
                if (var120.field2690 != var119 || var119 == -1) {
                    var120.field2690 = var119;
                    var120.field2766 = 0;
                    var120.field2767 = 0;
                    method266(var120);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2105 == arg0.field1275) {
                int var121 = var3.method3307();
                int var122 = var3.method3363();
                int var123 = var3.method3314();
                int var124 = var3.method3306();
                class233 var125 = class233.method457(var123);
                if (var125.field2694 != var121 || var125.field2695 != var124 || var125.field2697 != var122) {
                    var125.field2694 = var121;
                    var125.field2695 = var124;
                    var125.field2697 = var122;
                    method266(var125);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1275) {
                method145();
                field896 = var3.method3337();
                field799 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2098 == arg0.field1275) {
                String var126 = var3.method3277();
                long var127 = (long) var3.method3280();
                long var129 = (long) var3.method3272();
                class245 var131 = (class245) class180.method3179(class245.method4213(), var3.method3299());
                long var132 = (var127 << 32) + var129;
                boolean var134 = false;
                for (int var135 = 0; var135 < 100; var135++) {
                    if (field828[var135] == var132) {
                        var134 = true;
                        break;
                    }
                }
                if (Statics.field391.method1523(new class294(var126, Statics.field2425))) {
                    var134 = true;
                }
                if (!var134 && field739 == 0) {
                    field828[field642] = var132;
                    field642 = (field642 + 1) % 100;
                    String var136 = class302.method5143(class308.method267(class303.method4508(var3)));
                    byte var137;
                    if (var131.field3172) {
                        var137 = 7;
                    } else {
                        var137 = 3;
                    }
                    if (var131.field3166 == -1) {
                        class86.method876(var137, var126, var136);
                    } else {
                        class86.method876(var137, class76.method93(var131.field3166) + var126, var136);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1275) {
                int var138 = var3.method3299();
                if (var3.method3299() == 0) {
                    field890[var138] = new class5();
                    var3.field2374 += 18;
                } else {
                    var3.field2374--;
                    field890[var138] = new class5(var3, false);
                }
                field657 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2151 == arg0.field1275) {
                int var139 = var3.method3315();
                int var140 = var3.method3363();
                class233 var141 = class233.method457(var139);
                if (var141.field2686 != 2 || var141.field2687 != var140) {
                    var141.field2686 = 2;
                    var141.field2687 = var140;
                    method266(var141);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2115 == arg0.field1275) {
                method2908(false, arg0.field1274);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1275) {
                int var142 = var3.method3374();
                int var143 = var3.method3374();
                int var144 = class48.method175();
                class175 var145 = class175.method3207(class172.field2195, field672.field1273);
                var145.field2299.method3294(var144);
                var145.field2299.method3250(var142);
                var145.field2299.method3250(var143);
                var145.field2299.method3427(field428);
                field672.method1901(var145);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1275) {
                method4231(class174.field2289);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2092 == arg0.field1275) {
                method4231(class174.field2291);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2163 == arg0.field1275) {
                int var146 = var3.method3299();
                String var147 = var3.method3277();
                int var148 = var3.method3297();
                if (var148 >= 1 && var148 <= 8) {
                    if (var147.equalsIgnoreCase(class240.field2840)) {
                        var147 = null;
                    }
                    field749[var148 - 1] = var147;
                    field750[var148 - 1] = var146 == 0;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1275) {
                if (Statics.field51 != null) {
                    Statics.field51.method5111(var3);
                }
                method2989();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1275) {
                int var149 = var3.method3308();
                int var150 = var3.method3445();
                int var151 = var3.method3308();
                class233 var152 = class233.method457(var150);
                if (var152.field2652 != var151 || var152.field2653 != var149 || var152.field2693 != 0 || var152.field2753 != 0) {
                    var152.field2652 = var151;
                    var152.field2653 = var149;
                    var152.field2693 = 0;
                    var152.field2753 = 0;
                    method266(var152);
                    this.method1154(var152);
                    if (var152.field2645 == 0) {
                        method709(Statics.field2639[var150 >> 16], var152, false);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1275) {
                field867 = false;
                for (int var153 = 0; var153 < 5; var153++) {
                    field876[var153] = false;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2093 == arg0.field1275) {
                method1590();
                arg0.field1275 = null;
                return false;
            }
            if (class171.field2128 == arg0.field1275) {
                class84.method5245(var3, arg0.field1278);
                method178();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1275) {
                int var154 = var3.method3306();
                field668 = var154;
                this.method1122(false);
                method1093(var154);
                class71.method4548(field668);
                for (int var155 = 0; var155 < 100; var155++) {
                    field842[var155] = true;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2162 == arg0.field1275) {
                method2908(true, arg0.field1274);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1275) {
                int var156 = var3.method3299();
                int var157 = var3.method3299();
                int var158 = var3.method3299();
                int var159 = var3.method3299();
                field876[var156] = true;
                field869[var156] = var157;
                field702[var156] = var158;
                field634[var156] = var159;
                field872[var156] = 0;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2117 == arg0.field1275) {
                int var160 = var3.method3307();
                int var161 = var3.method3445();
                class233 var162 = class233.method457(var161);
                if (var162 != null && var162.field2645 == 0) {
                    if (var160 > var162.field2667 - var162.field2768) {
                        var160 = var162.field2667 - var162.field2768;
                    }
                    if (var160 < 0) {
                        var160 = 0;
                    }
                    if (var162.field2749 != var160) {
                        var162.field2749 = var160;
                        method266(var162);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2118 == arg0.field1275) {
                Statics.field391.field1025.method4990(var3, arg0.field1278);
                method104();
                field816 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1275) {
                int var163 = var3.method3280();
                int var164 = var3.method3315();
                int var165 = var163 >> 10 & 0x1F;
                int var166 = var163 >> 5 & 0x1F;
                int var167 = var163 & 0x1F;
                int var168 = (var167 << 3) + (var165 << 19) + (var166 << 11);
                class233 var169 = class233.method457(var164);
                if (var169.field2741 != var168) {
                    var169.field2741 = var168;
                    method266(var169);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1275) {
                var3.field2374 += 28;
                if (var3.method3269()) {
                    method994(var3, var3.field2374 - 28);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1275) {
                field770 = var3.method3363() * 30;
                field799 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1275) {
                int var170 = var3.method3445();
                int var171 = var3.method3280();
                int var172 = var3.method3298();
                class57 var173 = (class57) field786.method3734((long) var170);
                if (var173 != null) {
                    method4130(var173, var173.field550 != var171);
                }
                class57 var174 = new class57();
                var174.field550 = var171;
                var174.field545 = var172;
                field786.method3718(var174, (long) var170);
                method1093(var171);
                class233 var175 = class233.method457(var170);
                method266(var175);
                if (field789 != null) {
                    method266(field789);
                    field789 = null;
                }
                method151();
                method709(Statics.field2639[var170 >> 16], var175, false);
                class71.method4548(var171);
                if (field668 != -1) {
                    int var176 = field668;
                    if (class233.method3013(var176)) {
                        method1698(Statics.field2639[var176], 1);
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2111 == arg0.field1275) {
                if (arg0.field1278 == 0) {
                    Statics.field51 = null;
                } else {
                    if (Statics.field51 == null) {
                        Statics.field51 = new class296(Statics.field2425, Statics.field3162);
                    }
                    Statics.field51.method5106(var3);
                }
                method2989();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1275) {
                int var177 = var3.method3356();
                boolean var178 = var3.method3299() == 1;
                String var179 = "";
                boolean var180 = false;
                if (var178) {
                    var179 = var3.method3277();
                    if (Statics.field391.method1523(new class294(var179, Statics.field2425))) {
                        var180 = true;
                    }
                }
                String var181 = var3.method3277();
                if (!var180) {
                    class86.method876(var177, var179, var181);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1275) {
                int var182 = var3.method3299();
                field700 = var182;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1275) {
                boolean var183 = var3.method3299() == 1;
                int var184 = var3.method3314();
                class233 var185 = class233.method457(var184);
                if (var185.field2655 != var183) {
                    var185.field2655 = var183;
                    method266(var185);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2152 == arg0.field1275) {
                int var186 = var3.method3307();
                if (var186 == 65535) {
                    var186 = -1;
                }
                int var187 = var3.method3445();
                int var188 = var3.method3306();
                if (var188 == 65535) {
                    var188 = -1;
                }
                int var189 = var3.method3445();
                for (int var190 = var188; var190 <= var186; var190++) {
                    long var191 = ((long) var189 << 32) + (long) var190;
                    class207 var193 = field636.method3734(var191);
                    if (var193 != null) {
                        var193.method3766();
                    }
                    field636.method3718(new class214(var187), var191);
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1275) {
                field839 = var3.method3299();
                field840 = var3.method3403();
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2173 == arg0.field1275) {
                method4231(class174.field2295);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2109 == arg0.field1275) {
                for (int var194 = 0; var194 < field888.length; var194++) {
                    if (field888[var194] != null) {
                        field888[var194].field950 = -1;
                    }
                }
                for (int var195 = 0; var195 < field801.length; var195++) {
                    if (field801[var195] != null) {
                        field801[var195].field950 = -1;
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1275) {
                boolean var196 = var3.method3275();
                if (!var196) {
                    Statics.field2325 = null;
                } else if (Statics.field2325 == null) {
                    Statics.field2325 = new class254();
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1275) {
                int var197 = var3.method3374();
                int var198 = var3.method3280();
                if (var197 < -70000) {
                    var198 += 32768;
                }
                class233 var199;
                if (var197 >= 0) {
                    var199 = class233.method457(var197);
                } else {
                    var199 = null;
                }
                while (var3.field2374 < arg0.field1278) {
                    int var200 = var3.method3356();
                    int var201 = var3.method3280();
                    int var202 = 0;
                    if (var201 != 0) {
                        var202 = var3.method3299();
                        if (var202 == 255) {
                            var202 = var3.method3374();
                        }
                    }
                    if (var199 != null && var200 >= 0 && var200 < var199.field2762.length) {
                        var199.field2762[var200] = var201;
                        var199.field2763[var200] = var202;
                    }
                    class55.method176(var198, var200, var201 - 1, var202);
                }
                if (var199 != null) {
                    method266(var199);
                }
                method145();
                field811[++field792 - 1 & 0x1F] = var198 & 0x7FFF;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1275) {
                method145();
                field790 = var3.method3299();
                field799 = field808;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2104 == arg0.field1275) {
                method3199(true, var3);
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1275) {
                int var203 = var3.method3374();
                class57 var204 = (class57) field786.method3734((long) var203);
                if (var204 != null) {
                    method4130(var204, true);
                }
                if (field789 != null) {
                    method266(field789);
                    field789 = null;
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1275) {
                Statics.field978 = var3.method3299();
                Statics.field1959 = var3.method3297();
                for (int var205 = Statics.field1959; var205 < Statics.field1959 + 8; var205++) {
                    for (int var206 = Statics.field978; var206 < Statics.field978 + 8; var206++) {
                        if (field730[Statics.field585][var205][var206] != null) {
                            field730[Statics.field585][var205][var206] = null;
                            Statics.method1782(var205, var206);
                        }
                    }
                }
                for (class64 var207 = (class64) field647.method3799(); var207 != null; var207 = (class64) field647.method3780()) {
                    if (var207.field901 >= Statics.field1959 && var207.field901 < Statics.field1959 + 8 && var207.field909 >= Statics.field978 && var207.field909 < Statics.field978 + 8 && Statics.field585 == var207.field916) {
                        var207.field908 = 0;
                    }
                }
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1275) {
                int var208 = var3.method3280();
                if (var208 == 65535) {
                    var208 = -1;
                }
                if (var208 == -1 && !field858) {
                    Statics.field2509.method3901();
                    class220.field2510 = 1;
                    Statics.field2507 = null;
                } else if (var208 != -1 && field857 != var208 && field714 != 0 && !field858) {
                    class252 var209 = Statics.field397;
                    int var210 = field714;
                    class220.field2510 = 1;
                    Statics.field2507 = var209;
                    Statics.field2433 = var208;
                    Statics.field407 = 0;
                    Statics.field1756 = var210;
                    Statics.field2511 = false;
                    Statics.field2327 = 2;
                }
                field857 = var208;
                arg0.field1275 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1275) {
                int var211 = var3.method3363();
                if (var211 == 65535) {
                    var211 = -1;
                }
                int var212 = var3.method3310();
                method962(var211, var212);
                arg0.field1275 = null;
                return true;
            }
            class155.method917("" + (arg0.field1275 == null ? -1 : arg0.field1275.field2090) + class76.field1104 + (arg0.field1269 == null ? -1 : arg0.field1269.field2090) + class76.field1104 + (arg0.field1283 == null ? -1 : arg0.field1283.field2090) + class76.field1104 + arg0.field1278, (Throwable) null);
            method1590();
        } catch (IOException var217) {
            method1009();
        } catch (Exception var218) {
            String var215 = "" + (arg0.field1275 == null ? -1 : arg0.field1275.field2090) + class76.field1104 + (arg0.field1269 == null ? -1 : arg0.field1269.field2090) + class76.field1104 + (arg0.field1283 == null ? -1 : arg0.field1283.field2090) + class76.field1104 + arg0.field1278 + class76.field1104 + (Statics.field2788 + Statics.field476.field933[0]) + class76.field1104 + (Statics.field599 + Statics.field476.field974[0]) + class76.field1104;
            for (int var216 = 0; var216 < arg0.field1278 && var216 < 50; var216++) {
                var215 = var215 + var3.field2373[var216] + class76.field1104;
            }
            class155.method917(var215, var218);
            method1590();
        }
        return true;
    }

    @ObfuscatedName("iy.ho(Lfe;B)V")
    public static final void method4231(class174 arg0) {
        class192 var1 = field672.field1274;
        if (class174.field2287 == arg0) {
            int var2 = var1.method3280();
            int var3 = var1.method3280();
            int var4 = var1.method3298();
            int var5 = (var4 >> 4 & 0x7) + Statics.field1959;
            int var6 = (var4 & 0x7) + Statics.field978;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class82 var7 = new class82();
                var7.field1203 = var2;
                var7.field1204 = var3;
                if (field730[Statics.field585][var5][var6] == null) {
                    field730[Statics.field585][var5][var6] = new class208();
                }
                field730[Statics.field585][var5][var6].method3773(var7);
                Statics.method1782(var5, var6);
            }
        } else if (class174.field2288 == arg0) {
            int var8 = var1.method3298();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field686[var9];
            int var12 = var1.method3403();
            int var13 = (var12 >> 4 & 0x7) + Statics.field1959;
            int var14 = (var12 & 0x7) + Statics.field978;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                method427(Statics.field585, var13, var14, var11, -1, var9, var10, 0, -1);
            }
        } else {
            if (class174.field2289 == arg0) {
                int var15 = var1.method3298();
                int var16 = (var15 >> 4 & 0x7) + Statics.field1959;
                int var17 = (var15 & 0x7) + Statics.field978;
                int var18 = var1.method3298();
                int var19 = var18 >> 4 & 0xF;
                int var20 = var18 & 0x7;
                int var21 = var1.method3299();
                int var22 = var1.method3363();
                if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                    int var23 = var19 + 1;
                    if (Statics.field476.field933[0] >= var16 - var23 && Statics.field476.field933[0] <= var16 + var23 && Statics.field476.field974[0] >= var17 - var23 && Statics.field476.field974[0] <= var17 + var23 && field649 != 0 && var20 > 0 && field861 < 50) {
                        field862[field861] = var22;
                        field863[field861] = var20;
                        field864[field861] = var21;
                        field866[field861] = null;
                        field753[field861] = (var16 << 16) + (var17 << 8) + var19;
                        field861++;
                    }
                }
            }
            if (class174.field2294 == arg0) {
                int var24 = var1.method3306();
                int var25 = var1.method3299();
                int var26 = var25 >> 2;
                int var27 = var25 & 0x3;
                int var28 = field686[var26];
                int var29 = var1.method3403();
                int var30 = (var29 >> 4 & 0x7) + Statics.field1959;
                int var31 = (var29 & 0x7) + Statics.field978;
                if (var30 >= 0 && var31 >= 0 && var30 < 103 && var31 < 103) {
                    if (var28 == 0) {
                        class131 var32 = Statics.field52.method2794(Statics.field585, var30, var31);
                        if (var32 != null) {
                            int var33 = class123.method4726(var32.field1840);
                            if (var26 == 2) {
                                var32.field1834 = new class88(var33, 2, var27 + 4, Statics.field585, var30, var31, var24, false, var32.field1834);
                                var32.field1835 = new class88(var33, 2, var27 + 1 & 0x3, Statics.field585, var30, var31, var24, false, var32.field1835);
                            } else {
                                var32.field1834 = new class88(var33, var26, var27, Statics.field585, var30, var31, var24, false, var32.field1834);
                            }
                        }
                    }
                    if (var28 == 1) {
                        class136 var34 = Statics.field52.method2695(Statics.field585, var30, var31);
                        if (var34 != null) {
                            int var35 = class123.method4726(var34.field1878);
                            if (var26 == 4 || var26 == 5) {
                                var34.field1876 = new class88(var35, 4, var27, Statics.field585, var30, var31, var24, false, var34.field1876);
                            } else if (var26 == 6) {
                                var34.field1876 = new class88(var35, 4, var27 + 4, Statics.field585, var30, var31, var24, false, var34.field1876);
                            } else if (var26 == 7) {
                                var34.field1876 = new class88(var35, 4, (var27 + 2 & 0x3) + 4, Statics.field585, var30, var31, var24, false, var34.field1876);
                            } else if (var26 == 8) {
                                var34.field1876 = new class88(var35, 4, var27 + 4, Statics.field585, var30, var31, var24, false, var34.field1876);
                                var34.field1877 = new class88(var35, 4, (var27 + 2 & 0x3) + 4, Statics.field585, var30, var31, var24, false, var34.field1877);
                            }
                        }
                    }
                    if (var28 == 2) {
                        class137 var36 = Statics.field52.method2835(Statics.field585, var30, var31);
                        if (var26 == 11) {
                            var26 = 10;
                        }
                        if (var36 != null) {
                            var36.field1886 = new class88(class123.method4726(var36.field1889), var26, var27, Statics.field585, var30, var31, var24, false, var36.field1886);
                        }
                    }
                    if (var28 == 3) {
                        class118 var37 = Statics.field52.method2697(Statics.field585, var30, var31);
                        if (var37 != null) {
                            var37.field1574 = new class88(class123.method4726(var37.field1575), 22, var27, Statics.field585, var30, var31, var24, false, var37.field1574);
                        }
                    }
                }
            } else if (class174.field2292 == arg0) {
                int var38 = var1.method3306();
                int var39 = var1.method3298();
                int var40 = (var39 >> 4 & 0x7) + Statics.field1959;
                int var41 = (var39 & 0x7) + Statics.field978;
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    class208 var42 = field730[Statics.field585][var40][var41];
                    if (var42 != null) {
                        for (class82 var43 = (class82) var42.method3799(); var43 != null; var43 = (class82) var42.method3780()) {
                            if ((var38 & 0x7FFF) == var43.field1203) {
                                var43.method3766();
                                break;
                            }
                        }
                        if (var42.method3799() == null) {
                            field730[Statics.field585][var40][var41] = null;
                        }
                        Statics.method1782(var40, var41);
                    }
                }
            } else if (class174.field2293 == arg0) {
                int var44 = var1.method3297();
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                int var47 = field686[var45];
                int var48 = var1.method3306();
                int var49 = var1.method3299();
                int var50 = (var49 >> 4 & 0x7) + Statics.field1959;
                int var51 = (var49 & 0x7) + Statics.field978;
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    method427(Statics.field585, var50, var51, var47, var48, var45, var46, 0, -1);
                }
            } else if (class174.field2290 == arg0) {
                int var52 = var1.method3307();
                int var53 = var1.method3363();
                int var54 = var1.method3363();
                int var55 = var1.method3298();
                int var56 = (var55 >> 4 & 0x7) + Statics.field1959;
                int var57 = (var55 & 0x7) + Statics.field978;
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class208 var58 = field730[Statics.field585][var56][var57];
                    if (var58 != null) {
                        for (class82 var59 = (class82) var58.method3799(); var59 != null; var59 = (class82) var58.method3780()) {
                            if ((var54 & 0x7FFF) == var59.field1203 && var59.field1204 == var52) {
                                var59.field1204 = var53;
                                break;
                            }
                        }
                        Statics.method1782(var56, var57);
                    }
                }
            } else {
                if (class174.field2296 == arg0) {
                    byte var60 = var1.method3301();
                    byte var61 = var1.method3300();
                    byte var62 = var1.method3455();
                    byte var63 = var1.method3319();
                    int var64 = var1.method3299();
                    int var65 = var64 >> 2;
                    int var66 = var64 & 0x3;
                    int var67 = field686[var65];
                    int var68 = var1.method3307();
                    int var69 = var1.method3298();
                    int var70 = (var69 >> 4 & 0x7) + Statics.field1959;
                    int var71 = (var69 & 0x7) + Statics.field978;
                    int var72 = var1.method3306();
                    int var73 = var1.method3363();
                    int var74 = var1.method3280();
                    class62 var75;
                    if (field742 == var72) {
                        var75 = Statics.field476;
                    } else {
                        var75 = field888[var72];
                    }
                    if (var75 != null) {
                        class271 var76 = class271.method3187(var74);
                        int var77;
                        int var78;
                        if (var66 == 1 || var66 == 3) {
                            var77 = var76.field3438;
                            var78 = var76.field3437;
                        } else {
                            var77 = var76.field3437;
                            var78 = var76.field3438;
                        }
                        int var79 = (var77 >> 1) + var70;
                        int var80 = (var77 + 1 >> 1) + var70;
                        int var81 = (var78 >> 1) + var71;
                        int var82 = (var78 + 1 >> 1) + var71;
                        int[][] var83 = class51.field501[Statics.field585];
                        int var84 = var83[var79][var81] + var83[var80][var81] + var83[var79][var82] + var83[var80][var82] >> 2;
                        int var85 = (var70 << 7) + (var77 << 6);
                        int var86 = (var71 << 7) + (var78 << 6);
                        class122 var87 = var76.method4708(var65, var66, var83, var85, var84, var86);
                        if (var87 != null) {
                            method427(Statics.field585, var70, var71, var67, -1, 0, 0, var73 + 1, var68 + 1);
                            var75.field598 = field637 + var73;
                            var75.field604 = field637 + var68;
                            var75.field605 = var87;
                            var75.field600 = var70 * 128 + var77 * 64;
                            var75.field602 = var71 * 128 + var78 * 64;
                            var75.field594 = var84;
                            if (var60 > var61) {
                                byte var88 = var60;
                                var60 = var61;
                                var61 = var88;
                            }
                            if (var63 > var62) {
                                byte var89 = var63;
                                var63 = var62;
                                var62 = var89;
                            }
                            var75.field592 = var60 + var70;
                            var75.field606 = var61 + var70;
                            var75.field603 = var63 + var71;
                            var75.field607 = var62 + var71;
                        }
                    }
                }
                if (class174.field2291 == arg0) {
                    int var90 = var1.method3297();
                    int var91 = var1.method3298();
                    int var92 = (var91 >> 4 & 0x7) + Statics.field1959;
                    int var93 = (var91 & 0x7) + Statics.field978;
                    int var94 = var1.method3363();
                    byte var95 = var1.method3300();
                    int var96 = var1.method3306();
                    byte var97 = var1.method3319();
                    int var98 = var1.method3298() * 4;
                    int var99 = var1.method3297() * 4;
                    int var100 = var1.method3306();
                    int var101 = var1.method3297();
                    int var102 = var1.method3308();
                    int var103 = var92 + var95;
                    int var104 = var93 + var97;
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var96 != 65535) {
                        int var105 = var92 * 128 + 64;
                        int var106 = var93 * 128 + 64;
                        int var107 = var103 * 128 + 64;
                        int var108 = var104 * 128 + 64;
                        class81 var109 = new class81(var96, Statics.field585, var105, var106, method2350(var105, var106, Statics.field585) - var98, field637 + var94, field637 + var100, var90, var101, var102, var99);
                        var109.method1759(var107, var108, method2350(var107, var108, Statics.field585) - var99, field637 + var94);
                        field894.method3773(var109);
                    }
                } else if (class174.field2295 == arg0) {
                    int var110 = var1.method3298();
                    int var111 = (var110 >> 4 & 0x7) + Statics.field1959;
                    int var112 = (var110 & 0x7) + Statics.field978;
                    int var113 = var1.method3298();
                    int var114 = var1.method3307();
                    int var115 = var1.method3306();
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        int var116 = var111 * 128 + 64;
                        int var117 = var112 * 128 + 64;
                        class72 var118 = new class72(var114, Statics.field585, var116, var117, method2350(var116, var117, Statics.field585) - var113, var115, field637);
                        field756.method3773(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.hf(IIIIIIIIII)V")
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field647.method3799(); var10 != null; var10 = (class64) field647.method3780()) {
            if (var10.field916 == arg0 && var10.field901 == arg1 && var10.field909 == arg2 && var10.field899 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field916 = arg0;
            var9.field899 = arg3;
            var9.field901 = arg1;
            var9.field909 = arg2;
            Statics.method441(var9);
            field647.method3773(var9);
        }
        var9.field910 = arg4;
        var9.field907 = arg5;
        var9.field905 = arg6;
        var9.field898 = arg7;
        var9.field908 = arg8;
    }

    @ObfuscatedName("bl.hk(IIIIIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field631 && Statics.field585 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field52.method2698(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field52.method2807(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field52.method2720(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field52.method2781(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field52.method2702(arg0, arg2, arg3, var7);
            int var13 = class123.method4726(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field52.method2815(arg0, arg2, arg3);
                class271 var16 = class271.method3187(var13);
                if (var16.field3433 != 0) {
                    field683[arg0].method3125(arg2, arg3, var14, var15, var16.field3440);
                }
            }
            if (arg1 == 1) {
                Statics.field52.method2690(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field52.method2691(arg0, arg2, arg3);
                class271 var17 = class271.method3187(var13);
                if (var17.field3437 + arg2 > 103 || var17.field3437 + arg3 > 103 || var17.field3438 + arg2 > 103 || var17.field3438 + arg3 > 103) {
                    return;
                }
                if (var17.field3433 != 0) {
                    field683[arg0].method3126(arg2, arg3, var17.field3437, var17.field3438, var15, var17.field3440);
                }
            }
            if (arg1 == 3) {
                Statics.field52.method2692(arg0, arg2, arg3);
                class271 var18 = class271.method3187(var13);
                if (var18.field3433 == 1) {
                    field683[arg0].method3128(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field488[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class51.method27(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field52, field683[arg0]);
    }

    @ObfuscatedName("fm.hj(ZLgt;I)V")
    public static final void method3199(boolean arg0, class192 arg1) {
        field746 = 0;
        field725 = 0;
        class192 var2 = field672.field1274;
        var2.method3539();
        int var3 = var2.method3542(8);
        if (var3 < field667) {
            for (int var4 = var3; var4 < field667; var4++) {
                field747[++field746 - 1] = field669[var4];
            }
        }
        if (var3 > field667) {
            throw new RuntimeException("");
        }
        field667 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field669[var5];
            class74 var7 = field801[var6];
            int var8 = var2.method3542(1);
            if (var8 == 0) {
                field669[++field667 - 1] = var6;
                var7.field967 = field637;
            } else {
                int var9 = var2.method3542(2);
                if (var9 == 0) {
                    field669[++field667 - 1] = var6;
                    var7.field967 = field637;
                    field854[++field725 - 1] = var6;
                } else if (var9 == 1) {
                    field669[++field667 - 1] = var6;
                    var7.field967 = field637;
                    int var10 = var2.method3542(3);
                    var7.method1675(var10, (byte) 1);
                    int var11 = var2.method3542(1);
                    if (var11 == 1) {
                        field854[++field725 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field669[++field667 - 1] = var6;
                    var7.field967 = field637;
                    int var12 = var2.method3542(3);
                    var7.method1675(var12, (byte) 2);
                    int var13 = var2.method3542(3);
                    var7.method1675(var13, (byte) 2);
                    int var14 = var2.method3542(1);
                    if (var14 == 1) {
                        field854[++field725 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field747[++field746 - 1] = var6;
                }
            }
        }
        while (arg1.method3544(field672.field1278) >= 27) {
            int var15 = arg1.method3542(15);
            if (var15 == 32767) {
                break;
            }
            boolean var19 = false;
            if (field801[var15] == null) {
                field801[var15] = new class74();
                var19 = true;
            }
            class74 var20 = field801[var15];
            field669[++field667 - 1] = var15;
            var20.field967 = field637;
            int var21 = field751[arg1.method3542(3)];
            if (var19) {
                var20.field945 = var20.field925 = var21;
            }
            int var22;
            if (arg0) {
                var22 = arg1.method3542(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = arg1.method3542(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            var20.field1088 = Statics.method4448(arg1.method3542(14));
            int var23 = arg1.method3542(1);
            int var24;
            if (arg0) {
                var24 = arg1.method3542(8);
                if (var24 > 127) {
                    var24 -= 256;
                }
            } else {
                var24 = arg1.method3542(5);
                if (var24 > 15) {
                    var24 -= 32;
                }
            }
            int var25 = arg1.method3542(1);
            if (var25 == 1) {
                field854[++field725 - 1] = var15;
            }
            var20.field921 = var20.field1088.field3553;
            var20.field957 = var20.field1088.field3564;
            if (var20.field957 == 0) {
                var20.field925 = 0;
            }
            var20.field926 = var20.field1088.field3547;
            var20.field927 = var20.field1088.field3548;
            var20.field928 = var20.field1088.field3549;
            var20.field917 = var20.field1088.field3550;
            var20.field923 = var20.field1088.field3544;
            var20.field932 = var20.field1088.field3545;
            var20.field970 = var20.field1088.field3546;
            var20.method1677(Statics.field476.field933[0] + var24, Statics.field476.field974[0] + var22, var23 == 1);
        }
        arg1.method3543();
        method2849(arg1);
        for (int var16 = 0; var16 < field746; var16++) {
            int var17 = field747[var16];
            if (field637 != field801[var17].field967) {
                field801[var17].field1088 = null;
                field801[var17] = null;
            }
        }
        if (field672.field1278 != arg1.field2374) {
            throw new RuntimeException(arg1.field2374 + class76.field1104 + field672.field1278);
        }
        for (int var18 = 0; var18 < field667; var18++) {
            if (field801[field669[var18]] == null) {
                throw new RuntimeException(var18 + class76.field1104 + field667);
            }
        }
    }

    @ObfuscatedName("dc.hc(Lgt;I)V")
    public static final void method2849(class192 arg0) {
        for (int var1 = 0; var1 < field725; var1++) {
            int var2 = field854[var1];
            class74 var3 = field801[var2];
            int var4 = arg0.method3299();
            if ((var4 & 0x8) != 0) {
                var3.field931 = arg0.method3277();
                var3.field968 = 100;
            }
            if ((var4 & 0x10) != 0) {
                var3.field975 = arg0.method3307();
                int var5 = arg0.method3315();
                var3.field959 = var5 >> 16;
                var3.field958 = (var5 & 0xFFFF) + field637;
                var3.field934 = 0;
                var3.field954 = 0;
                if (var3.field958 > field637) {
                    var3.field934 = -1;
                }
                if (var3.field975 == 65535) {
                    var3.field975 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field944 = arg0.method3306();
                if (var3.field944 == 65535) {
                    var3.field944 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var6 = arg0.method3280();
                int var7 = arg0.method3307();
                int var8 = var3.field951 - (var6 - Statics.field2788 - Statics.field2788) * 64;
                int var9 = var3.field956 - (var7 - Statics.field599 - Statics.field599) * 64;
                if (var8 != 0 || var9 != 0) {
                    var3.field946 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var10 = arg0.method3299();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg0.method3356();
                        if (var15 == 32767) {
                            var15 = arg0.method3356();
                            var13 = arg0.method3356();
                            var12 = arg0.method3356();
                            var14 = arg0.method3356();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg0.method3356();
                        }
                        int var16 = arg0.method3356();
                        var3.method1458(var15, var13, var12, var14, field637, var16);
                    }
                }
                int var17 = arg0.method3403();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg0.method3356();
                        int var20 = arg0.method3356();
                        if (var20 == 32767) {
                            var3.method1462(var19);
                        } else {
                            int var21 = arg0.method3356();
                            int var22 = arg0.method3403();
                            int var23 = var20 > 0 ? arg0.method3403() : var22;
                            var3.method1459(var19, field637, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var24 = arg0.method3307();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg0.method3297();
                if (var3.field950 == var24 && var24 != -1) {
                    int var26 = class276.method3241(var24).field3601;
                    if (var26 == 1) {
                        var3.field955 = 0;
                        var3.field952 = 0;
                        var3.field953 = var25;
                        var3.field924 = 0;
                    }
                    if (var26 == 2) {
                        var3.field924 = 0;
                    }
                } else if (var24 == -1 || var3.field950 == -1 || class276.method3241(var24).field3584 >= class276.method3241(var3.field950).field3584) {
                    var3.field950 = var24;
                    var3.field955 = 0;
                    var3.field952 = 0;
                    var3.field953 = var25;
                    var3.field924 = 0;
                    var3.field977 = var3.field972;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1088 = Statics.method4448(arg0.method3307());
                var3.field921 = var3.field1088.field3553;
                var3.field957 = var3.field1088.field3564;
                var3.field926 = var3.field1088.field3547;
                var3.field927 = var3.field1088.field3548;
                var3.field928 = var3.field1088.field3549;
                var3.field917 = var3.field1088.field3550;
                var3.field923 = var3.field1088.field3544;
                var3.field932 = var3.field1088.field3545;
                var3.field970 = var3.field1088.field3546;
            }
        }
    }

    @ObfuscatedName("cy.hz(Lbg;IIBI)V")
    public static final void method2056(class62 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field933[0];
        int var5 = arg0.field974[0];
        int var6 = arg0.method1058();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class168.method2583(var4, var5, arg0.method1058(), method3190(arg1, arg2), field683[arg0.field611], true, field655, field692);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1064(field655[var8], field692[var8], arg3);
            }
        }
    }

    @ObfuscatedName("fz.hu(III)Lfo;")
    public static class169 method3190(int arg0, int arg1) {
        field629.field2089 = arg0;
        field629.field2085 = arg1;
        field629.field2086 = 1;
        field629.field2087 = 1;
        return field629;
    }

    @ObfuscatedName("cl.hr(B)V")
    public static void method1897() {
        field762 = 0;
        field706 = false;
        field767[0] = class240.field3075;
        field768[0] = "";
        field765[0] = 1006;
        field769[0] = false;
        field762 = 1;
    }

    @ObfuscatedName("fv.he(III)V")
    public static final void method3056(int arg0, int arg1) {
        if (field762 < 2 && field644 == 0 && !field780 || !field773) {
            return;
        }
        int var2 = field762 - 1;
        String var4;
        if (field644 == 1 && field762 < 2) {
            var4 = class240.field2986 + class240.field3095 + field779 + " " + class76.field1108;
        } else if (field780 && field762 < 2) {
            var4 = field873 + class240.field3095 + field785 + " " + class76.field1108;
        } else {
            var4 = method4625(var2);
        }
        if (field762 > 2) {
            var4 = var4 + class76.method3066(16777215) + " " + '/' + " " + (field762 - 2) + class240.field2968;
        }
        Statics.field3758.method5160(var4, arg0 + 4, arg1 + 15, 16777215, 0, field637 / 1000);
    }

    @ObfuscatedName("fb.hs(IIIII)V")
    public static final void method3117(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field630; var4++) {
            if (field833[var4] + field831[var4] > arg0 && field831[var4] < arg0 + arg2 && field843[var4] + field834[var4] > arg1 && field843[var4] < arg1 + arg3) {
                field842[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ha(I)V")
    public final void method1384() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field762 - 1; var2++) {
                if (field765[var2] < 1000 && field765[var2 + 1] > 1000) {
                    String var3 = field768[var2];
                    field768[var2] = field768[var2 + 1];
                    field768[var2 + 1] = var3;
                    String var4 = field767[var2];
                    field767[var2] = field767[var2 + 1];
                    field767[var2 + 1] = var4;
                    int var5 = field765[var2];
                    field765[var2] = field765[var2 + 1];
                    field765[var2 + 1] = var5;
                    int var6 = field763[var2];
                    field763[var2] = field763[var2 + 1];
                    field763[var2 + 1] = var6;
                    int var7 = field764[var2];
                    field764[var2] = field764[var2 + 1];
                    field764[var2 + 1] = var7;
                    int var8 = field841[var2];
                    field841[var2] = field841[var2 + 1];
                    field841[var2 + 1] = var8;
                    boolean var9 = field769[var2];
                    field769[var2] = field769[var2 + 1];
                    field769[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field192 != null || field796 != null) {
            return;
        }
        int var27;
        int var30;
        int var31;
        label212: {
            int var10 = class49.field472;
            if (field706) {
                if (var10 != 1 && (Statics.field246 || var10 != 4)) {
                    int var11 = class49.field465;
                    int var12 = class49.field458;
                    if (var11 < Statics.field1947 - 10 || var11 > Statics.field1947 + Statics.field139 + 10 || var12 < Statics.field624 - 10 || var12 > Statics.field624 + Statics.field390 + 10) {
                        field706 = false;
                        method3117(Statics.field1947, Statics.field624, Statics.field139, Statics.field390);
                    }
                }
                if (var10 == 1 || !Statics.field246 && var10 == 4) {
                    int var13 = Statics.field1947;
                    int var14 = Statics.field624;
                    int var15 = Statics.field139;
                    int var16 = class49.field457;
                    int var17 = class49.field468;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field762; var19++) {
                        int var20 = (field762 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field763[var18];
                        int var22 = field764[var18];
                        int var23 = field765[var18];
                        int var24 = field841[var18];
                        String var25 = field767[var18];
                        String var26 = field768[var18];
                        method2670(var21, var22, var23, var24, var25, var26, class49.field457, class49.field468);
                    }
                    field706 = false;
                    method3117(Statics.field1947, Statics.field624, Statics.field139, Statics.field390);
                }
            } else {
                var27 = field762 - 1;
                if ((var10 == 1 || !Statics.field246 && var10 == 4) && var27 >= 0) {
                    int var29 = field765[var27];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field763[var27];
                        var31 = field764[var27];
                        class233 var32 = class233.method457(var31);
                        int var33 = method50(var32);
                        boolean var34 = (var33 >> 28 & 0x1) != 0;
                        if (var34) {
                            break label212;
                        }
                        class234 var10000 = (class234) null;
                        if (class234.method1780(method50(var32))) {
                            break label212;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field246 && var10 == 4) && this.method1120()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field246 && var10 == 4) && field762 > 0 && var27 >= 0) {
                    int var37 = field763[var27];
                    int var38 = field764[var27];
                    int var39 = field765[var27];
                    int var40 = field841[var27];
                    String var41 = field767[var27];
                    String var42 = field768[var27];
                    method2670(var37, var38, var39, var40, var41, var42, class49.field457, class49.field468);
                }
                if (var10 == 2 && field762 > 0) {
                    this.method1266(class49.field457, class49.field468);
                }
            }
            return;
        }
        if (Statics.field192 != null && !field737 && field762 > 0 && !this.method1120()) {
            int var35 = field734;
            int var36 = field735;
            method3171(Statics.field1902, var35, var36);
            Statics.field1902 = null;
        }
        field737 = false;
        field738 = 0;
        if (Statics.field192 != null) {
            method266(Statics.field192);
        }
        Statics.field192 = class233.method457(var31);
        field703 = var30;
        field734 = class49.field457;
        field735 = class49.field468;
        if (var27 >= 0) {
            method603(var27);
        }
        method266(Statics.field192);
    }

    @ObfuscatedName("client.hh(B)Z")
    public final boolean method1120() {
        int var1 = field762 - 1;
        return (field870 == 1 && field762 > 2 || method965(var1)) && !field769[var1];
    }

    @ObfuscatedName("client.hp(III)V")
    public final void method1266(int arg0, int arg1) {
        method142(arg0, arg1);
        Statics.field52.method2789(Statics.field585, arg0, arg1, false);
        field706 = true;
    }

    @ObfuscatedName("l.hm(III)V")
    public static void method142(int arg0, int arg1) {
        int var2 = Statics.field3758.method5139(class240.field2989);
        for (int var3 = 0; var3 < field762; var3++) {
            int var4 = Statics.field3758.method5139(method4625(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field762 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field226) {
            var6 = Statics.field226 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field387) {
            var7 = Statics.field387 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1947 = var6;
        Statics.field624 = var7;
        Statics.field139 = var2;
        Statics.field390 = field762 * 15 + 22;
    }

    @ObfuscatedName("as.hx(II)Z")
    public static final boolean method965(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field765[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fe.hg(Lbt;IIB)V")
    public static final void method3171(class77 arg0, int arg1, int arg2) {
        method2670(arg0.field1117, arg0.field1116, arg0.field1115, arg0.field1114, arg0.field1113, arg0.field1113, arg1, arg2);
    }

    @ObfuscatedName("da.hb(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 58) {
            class233 var8 = class233.method1454(arg1, arg0);
            if (var8 != null) {
                class175 var9 = class175.method3207(class172.field2191, field672.field1273);
                var9.field2299.method3302(arg0);
                var9.field2299.method3302(var8.field2764);
                var9.field2299.method3312(Statics.field1201);
                var9.field2299.method3254(field729);
                var9.field2299.method3304(field782);
                var9.field2299.method3256(arg1);
                field672.method1901(var9);
            }
        }
        if (arg2 == 3) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var10 = class175.method3207(class172.field2214, field672.field1273);
            var10.field2299.method3253(class40.field377[82] ? 1 : 0);
            var10.field2299.method3254(Statics.field2788 + arg0);
            var10.field2299.method3304(arg3);
            var10.field2299.method3254(Statics.field599 + arg1);
            field672.method1901(var10);
        }
        if (arg2 == 20) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var11 = class175.method3207(class172.field2209, field672.field1273);
            var11.field2299.method3304(arg3);
            var11.field2299.method3304(Statics.field599 + arg1);
            var11.field2299.method3294(class40.field377[82] ? 1 : 0);
            var11.field2299.method3254(Statics.field2788 + arg0);
            field672.method1901(var11);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1979.method5786(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 15) {
            class62 var12 = field888[arg3];
            if (var12 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var13 = class175.method3207(class172.field2213, field672.field1273);
                var13.field2299.method3253(class40.field377[82] ? 1 : 0);
                var13.field2299.method3254(field729);
                var13.field2299.method3254(arg3);
                var13.field2299.method3250(Statics.field1201);
                field672.method1901(var13);
            }
        }
        if (arg2 == 10) {
            class74 var14 = field801[arg3];
            if (var14 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var15 = class175.method3207(class172.field2210, field672.field1273);
                var15.field2299.method3304(arg3);
                var15.field2299.method3427(class40.field377[82] ? 1 : 0);
                field672.method1901(var15);
            }
        }
        if (arg2 == 22) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var16 = class175.method3207(class172.field2190, field672.field1273);
            var16.field2299.method3254(arg3);
            var16.field2299.method3304(Statics.field2788 + arg0);
            var16.field2299.method3294(class40.field377[82] ? 1 : 0);
            var16.field2299.method3303(Statics.field599 + arg1);
            field672.method1901(var16);
        }
        if (arg2 == 41) {
            class175 var17 = class175.method3207(class172.field2266, field672.field1273);
            var17.field2299.method3254(arg3);
            var17.field2299.method3302(arg0);
            var17.field2299.method3256(arg1);
            field672.method1901(var17);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 36) {
            class175 var18 = class175.method3207(class172.field2236, field672.field1273);
            var18.field2299.method3303(arg3);
            var18.field2299.method3254(arg0);
            var18.field2299.method3256(arg1);
            field672.method1901(var18);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 26) {
            class175 var19 = class175.method3207(class172.field2205, field672.field1273);
            field672.method1901(var19);
            for (class57 var20 = (class57) field786.method3720(); var20 != null; var20 = (class57) field786.method3717()) {
                if (var20.field545 == 0 || var20.field545 == 3) {
                    method4130(var20, true);
                }
            }
            if (field789 != null) {
                method266(field789);
                field789 = null;
            }
        }
        if (arg2 == 46) {
            class62 var21 = field888[arg3];
            if (var21 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var22 = class175.method3207(class172.field2245, field672.field1273);
                var22.field2299.method3427(class40.field377[82] ? 1 : 0);
                var22.field2299.method3254(arg3);
                field672.method1901(var22);
            }
        }
        if (arg2 == 17) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var23 = class175.method3207(class172.field2187, field672.field1273);
            var23.field2299.method3302(arg3);
            var23.field2299.method3313(Statics.field1201);
            var23.field2299.method3254(Statics.field2788 + arg0);
            var23.field2299.method3427(class40.field377[82] ? 1 : 0);
            var23.field2299.method3254(Statics.field599 + arg1);
            var23.field2299.method3303(field729);
            field672.method1901(var23);
        }
        if (arg2 == 40) {
            class175 var24 = class175.method3207(class172.field2220, field672.field1273);
            var24.field2299.method3254(arg0);
            var24.field2299.method3303(arg3);
            var24.field2299.method3312(arg1);
            field672.method1901(var24);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 19) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var25 = class175.method3207(class172.field2277, field672.field1273);
            var25.field2299.method3303(arg3);
            var25.field2299.method3294(class40.field377[82] ? 1 : 0);
            var25.field2299.method3304(Statics.field599 + arg1);
            var25.field2299.method3254(Statics.field2788 + arg0);
            field672.method1901(var25);
        }
        if (arg2 == 37) {
            class175 var26 = class175.method3207(class172.field2181, field672.field1273);
            var26.field2299.method3303(arg3);
            var26.field2299.method3250(arg1);
            var26.field2299.method3254(arg0);
            field672.method1901(var26);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 48) {
            class62 var27 = field888[arg3];
            if (var27 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var28 = class175.method3207(class172.field2178, field672.field1273);
                var28.field2299.method3254(arg3);
                var28.field2299.method3427(class40.field377[82] ? 1 : 0);
                field672.method1901(var28);
            }
        }
        if (arg2 == 1001) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var29 = class175.method3207(class172.field2261, field672.field1273);
            var29.field2299.method3303(arg3);
            var29.field2299.method3303(Statics.field599 + arg1);
            var29.field2299.method3399(class40.field377[82] ? 1 : 0);
            var29.field2299.method3254(Statics.field2788 + arg0);
            field672.method1901(var29);
        }
        if (arg2 == 1005) {
            class233 var30 = class233.method457(arg1);
            if (var30 == null || var30.field2763[arg0] < 100000) {
                class175 var31 = class175.method3207(class172.field2255, field672.field1273);
                var31.field2299.method3304(arg3);
                field672.method1901(var31);
            } else {
                class86.method876(27, "", var30.field2763[arg0] + " x " + class272.method4572(arg3).field3473);
            }
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 34) {
            class175 var32 = class175.method3207(class172.field2250, field672.field1273);
            var32.field2299.method3303(arg3);
            var32.field2299.method3312(arg1);
            var32.field2299.method3304(arg0);
            field672.method1901(var32);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 1004) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            class175 var33 = class175.method3207(class172.field2255, field672.field1273);
            var33.field2299.method3304(arg3);
            field672.method1901(var33);
        }
        if (arg2 == 35) {
            class175 var34 = class175.method3207(class172.field2270, field672.field1273);
            var34.field2299.method3312(arg1);
            var34.field2299.method3304(arg3);
            var34.field2299.method3254(arg0);
            field672.method1901(var34);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 29) {
            class175 var35 = class175.method3207(class172.field2208, field672.field1273);
            var35.field2299.method3256(arg1);
            field672.method1901(var35);
            class233 var36 = class233.method457(arg1);
            if (var36.field2705 != null && var36.field2705[0][0] == 5) {
                int var37 = var36.field2705[0][1];
                if (class228.field2601[var37] != var36.field2758[0]) {
                    class228.field2601[var37] = var36.field2758[0];
                    method918(var37);
                }
            }
        }
        if (arg2 == 28) {
            class175 var38 = class175.method3207(class172.field2208, field672.field1273);
            var38.field2299.method3256(arg1);
            field672.method1901(var38);
            class233 var39 = class233.method457(arg1);
            if (var39.field2705 != null && var39.field2705[0][0] == 5) {
                int var40 = var39.field2705[0][1];
                class228.field2601[var40] = 1 - class228.field2601[var40];
                method918(var40);
            }
        }
        if (arg2 == 11) {
            class74 var41 = field801[arg3];
            if (var41 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var42 = class175.method3207(class172.field2179, field672.field1273);
                var42.field2299.method3427(class40.field377[82] ? 1 : 0);
                var42.field2299.method3302(arg3);
                field672.method1901(var42);
            }
        }
        if (arg2 == 30 && field789 == null) {
            class175 var43 = class175.method3207(class172.field2202, field672.field1273);
            var43.field2299.method3256(arg1);
            var43.field2299.method3303(arg0);
            field672.method1901(var43);
            field789 = class233.method1454(arg1, arg0);
            method266(field789);
        }
        if (arg2 == 18) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var44 = class175.method3207(class172.field2232, field672.field1273);
            var44.field2299.method3303(Statics.field2788 + arg0);
            var44.field2299.method3254(arg3);
            var44.field2299.method3253(class40.field377[82] ? 1 : 0);
            var44.field2299.method3254(Statics.field599 + arg1);
            field672.method1901(var44);
        }
        if (arg2 == 24) {
            class233 var45 = class233.method457(arg1);
            boolean var46 = true;
            if (var45.field2647 > 0) {
                var46 = method808(var45);
            }
            if (var46) {
                class175 var47 = class175.method3207(class172.field2208, field672.field1273);
                var47.field2299.method3256(arg1);
                field672.method1901(var47);
            }
        }
        if (arg2 == 5) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var48 = class175.method3207(class172.field2237, field672.field1273);
            var48.field2299.method3302(arg3);
            var48.field2299.method3304(Statics.field2788 + arg0);
            var48.field2299.method3427(class40.field377[82] ? 1 : 0);
            var48.field2299.method3254(Statics.field599 + arg1);
            field672.method1901(var48);
        }
        if (arg2 == 13) {
            class74 var49 = field801[arg3];
            if (var49 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var50 = class175.method3207(class172.field2251, field672.field1273);
                var50.field2299.method3302(arg3);
                var50.field2299.method3399(class40.field377[82] ? 1 : 0);
                field672.method1901(var50);
            }
        }
        if (arg2 == 44) {
            class62 var51 = field888[arg3];
            if (var51 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var52 = class175.method3207(class172.field2216, field672.field1273);
                var52.field2299.method3294(class40.field377[82] ? 1 : 0);
                var52.field2299.method3304(arg3);
                field672.method1901(var52);
            }
        }
        if (arg2 == 39) {
            class175 var53 = class175.method3207(class172.field2272, field672.field1273);
            var53.field2299.method3256(arg1);
            var53.field2299.method3302(arg3);
            var53.field2299.method3303(arg0);
            field672.method1901(var53);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 42) {
            class175 var54 = class175.method3207(class172.field2224, field672.field1273);
            var54.field2299.method3250(arg1);
            var54.field2299.method3302(arg0);
            var54.field2299.method3302(arg3);
            field672.method1901(var54);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 51) {
            class62 var55 = field888[arg3];
            if (var55 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var56 = class175.method3207(class172.field2247, field672.field1273);
                var56.field2299.method3302(arg3);
                var56.field2299.method3427(class40.field377[82] ? 1 : 0);
                field672.method1901(var56);
            }
        }
        if (arg2 == 45) {
            class62 var57 = field888[arg3];
            if (var57 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var58 = class175.method3207(class172.field2249, field672.field1273);
                var58.field2299.method3399(class40.field377[82] ? 1 : 0);
                var58.field2299.method3304(arg3);
                field672.method1901(var58);
            }
        }
        if (arg2 == 1002) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            class175 var59 = class175.method3207(class172.field2197, field672.field1273);
            var59.field2299.method3303(arg3);
            field672.method1901(var59);
        }
        if (arg2 == 14) {
            class62 var60 = field888[arg3];
            if (var60 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var61 = class175.method3207(class172.field2203, field672.field1273);
                var61.field2299.method3303(Statics.field477);
                var61.field2299.method3302(Statics.field1205);
                var61.field2299.method3302(arg3);
                var61.field2299.method3294(class40.field377[82] ? 1 : 0);
                var61.field2299.method3312(Statics.field132);
                field672.method1901(var61);
            }
        }
        if (arg2 == 12) {
            class74 var62 = field801[arg3];
            if (var62 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var63 = class175.method3207(class172.field2240, field672.field1273);
                var63.field2299.method3253(class40.field377[82] ? 1 : 0);
                var63.field2299.method3254(arg3);
                field672.method1901(var63);
            }
        }
        if (arg2 == 21) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var64 = class175.method3207(class172.field2211, field672.field1273);
            var64.field2299.method3253(class40.field377[82] ? 1 : 0);
            var64.field2299.method3254(Statics.field599 + arg1);
            var64.field2299.method3304(Statics.field2788 + arg0);
            var64.field2299.method3303(arg3);
            field672.method1901(var64);
        }
        if (arg2 == 43) {
            class175 var65 = class175.method3207(class172.field2207, field672.field1273);
            var65.field2299.method3313(arg1);
            var65.field2299.method3304(arg0);
            var65.field2299.method3303(arg3);
            field672.method1901(var65);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 23) {
            if (field706) {
                Statics.field52.method2716();
            } else {
                Statics.field52.method2789(Statics.field585, arg0, arg1, true);
            }
        }
        if (arg2 == 25) {
            class233 var66 = class233.method1454(arg1, arg0);
            if (var66 != null) {
                method3180();
                method4626(arg1, arg0, class234.method527(method50(var66)), var66.field2764);
                field644 = 0;
                field873 = method3989(var66);
                if (field873 == null) {
                    field873 = "Null";
                }
                if (var66.field2642) {
                    field785 = var66.field2755 + class76.method3066(16777215);
                } else {
                    field785 = class76.method3066(65280) + var66.field2706 + class76.method3066(16777215);
                }
            }
            return;
        }
        if (arg2 == 9) {
            class74 var67 = field801[arg3];
            if (var67 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var68 = class175.method3207(class172.field2200, field672.field1273);
                var68.field2299.method3427(class40.field377[82] ? 1 : 0);
                var68.field2299.method3254(arg3);
                field672.method1901(var68);
            }
        }
        if (arg2 == 32) {
            class175 var69 = class175.method3207(class172.field2227, field672.field1273);
            var69.field2299.method3254(field729);
            var69.field2299.method3256(arg1);
            var69.field2299.method3254(arg0);
            var69.field2299.method3304(arg3);
            var69.field2299.method3250(Statics.field1201);
            field672.method1901(var69);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 50) {
            class62 var70 = field888[arg3];
            if (var70 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var71 = class175.method3207(class172.field2185, field672.field1273);
                var71.field2299.method3253(class40.field377[82] ? 1 : 0);
                var71.field2299.method3304(arg3);
                field672.method1901(var71);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var72 = class233.method1454(arg1, arg0);
            if (var72 != null) {
                method4238(arg3, arg1, arg0, var72.field2764, arg5);
            }
        }
        if (arg2 == 16) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var73 = class175.method3207(class172.field2238, field672.field1273);
            var73.field2299.method3254(Statics.field1205);
            var73.field2299.method3302(Statics.field599 + arg1);
            var73.field2299.method3294(class40.field377[82] ? 1 : 0);
            var73.field2299.method3302(Statics.field477);
            var73.field2299.method3303(arg3);
            var73.field2299.method3303(Statics.field2788 + arg0);
            var73.field2299.method3250(Statics.field132);
            field672.method1901(var73);
        }
        if (arg2 == 6) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var74 = class175.method3207(class172.field2239, field672.field1273);
            var74.field2299.method3254(Statics.field2788 + arg0);
            var74.field2299.method3304(arg3);
            var74.field2299.method3294(class40.field377[82] ? 1 : 0);
            var74.field2299.method3304(Statics.field599 + arg1);
            field672.method1901(var74);
        }
        if (arg2 == 1) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var75 = class175.method3207(class172.field2246, field672.field1273);
            var75.field2299.method3304(Statics.field1205);
            var75.field2299.method3312(Statics.field132);
            var75.field2299.method3302(Statics.field599 + arg1);
            var75.field2299.method3302(arg3);
            var75.field2299.method3427(class40.field377[82] ? 1 : 0);
            var75.field2299.method3302(Statics.field477);
            var75.field2299.method3302(Statics.field2788 + arg0);
            field672.method1901(var75);
        }
        if (arg2 == 1003) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            class74 var76 = field801[arg3];
            if (var76 != null) {
                class274 var77 = var76.field1088;
                if (var77.field3565 != null) {
                    var77 = var77.method4815();
                }
                if (var77 != null) {
                    class175 var78 = class175.method3207(class172.field2267, field672.field1273);
                    var78.field2299.method3302(var77.field3539);
                    field672.method1901(var78);
                }
            }
        }
        if (arg2 == 4) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var79 = class175.method3207(class172.field2229, field672.field1273);
            var79.field2299.method3254(Statics.field599 + arg1);
            var79.field2299.method3302(arg3);
            var79.field2299.method3303(Statics.field2788 + arg0);
            var79.field2299.method3294(class40.field377[82] ? 1 : 0);
            field672.method1901(var79);
        }
        if (arg2 == 38) {
            method3180();
            class233 var80 = class233.method457(arg1);
            field644 = 1;
            Statics.field477 = arg0;
            Statics.field132 = arg1;
            Statics.field1205 = arg3;
            method266(var80);
            field779 = class76.method3066(16748608) + class272.method4572(arg3).field3473 + class76.method3066(16777215);
            if (field779 == null) {
                field779 = class240.field2840;
            }
            return;
        }
        if (arg2 == 31) {
            class175 var81 = class175.method3207(class172.field2186, field672.field1273);
            var81.field2299.method3312(Statics.field132);
            var81.field2299.method3304(Statics.field477);
            var81.field2299.method3312(arg1);
            var81.field2299.method3304(arg0);
            var81.field2299.method3304(Statics.field1205);
            var81.field2299.method3254(arg3);
            field672.method1901(var81);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 2) {
            field681 = arg6;
            field772 = arg7;
            field727 = 2;
            field728 = 0;
            field853 = arg0;
            field638 = arg1;
            class175 var82 = class175.method3207(class172.field2265, field672.field1273);
            var82.field2299.method3304(arg3);
            var82.field2299.method3303(field729);
            var82.field2299.method3399(class40.field377[82] ? 1 : 0);
            var82.field2299.method3254(Statics.field599 + arg1);
            var82.field2299.method3304(Statics.field2788 + arg0);
            var82.field2299.method3313(Statics.field1201);
            field672.method1901(var82);
        }
        if (arg2 == 33) {
            class175 var83 = class175.method3207(class172.field2233, field672.field1273);
            var83.field2299.method3304(arg3);
            var83.field2299.method3313(arg1);
            var83.field2299.method3303(arg0);
            field672.method1901(var83);
            field731 = 0;
            Statics.field1268 = class233.method457(arg1);
            field670 = arg0;
        }
        if (arg2 == 49) {
            class62 var84 = field888[arg3];
            if (var84 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var85 = class175.method3207(class172.field2228, field672.field1273);
                var85.field2299.method3303(arg3);
                var85.field2299.method3399(class40.field377[82] ? 1 : 0);
                field672.method1901(var85);
            }
        }
        if (arg2 == 8) {
            class74 var86 = field801[arg3];
            if (var86 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var87 = class175.method3207(class172.field2235, field672.field1273);
                var87.field2299.method3304(field729);
                var87.field2299.method3312(Statics.field1201);
                var87.field2299.method3294(class40.field377[82] ? 1 : 0);
                var87.field2299.method3254(arg3);
                field672.method1901(var87);
            }
        }
        if (arg2 == 7) {
            class74 var88 = field801[arg3];
            if (var88 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var89 = class175.method3207(class172.field2204, field672.field1273);
                var89.field2299.method3254(arg3);
                var89.field2299.method3253(class40.field377[82] ? 1 : 0);
                var89.field2299.method3312(Statics.field132);
                var89.field2299.method3302(Statics.field1205);
                var89.field2299.method3303(Statics.field477);
                field672.method1901(var89);
            }
        }
        if (arg2 == 47) {
            class62 var90 = field888[arg3];
            if (var90 != null) {
                field681 = arg6;
                field772 = arg7;
                field727 = 2;
                field728 = 0;
                field853 = arg0;
                field638 = arg1;
                class175 var91 = class175.method3207(class172.field2254, field672.field1273);
                var91.field2299.method3294(class40.field377[82] ? 1 : 0);
                var91.field2299.method3254(arg3);
                field672.method1901(var91);
            }
        }
        if (field644 != 0) {
            field644 = 0;
            method266(class233.method457(Statics.field132));
        }
        if (field780) {
            method3180();
        }
        if (Statics.field1268 != null && field731 == 0) {
            method266(Statics.field1268);
        }
    }

    @ObfuscatedName("bg.hv(ILjava/lang/String;B)V")
    public static void method1095(int arg0, String arg1) {
        int var2 = class84.field1216;
        int[] var3 = class84.field1217;
        boolean var4 = false;
        class294 var5 = new class294(arg1, Statics.field2425);
        for (int var6 = 0; var6 < var2; var6++) {
            class62 var7 = field888[var3[var6]];
            if (var7 != null && Statics.field476 != var7 && var7.field593 != null && var7.field593.equals(var5)) {
                if (arg0 == 1) {
                    class175 var8 = class175.method3207(class172.field2216, field672.field1273);
                    var8.field2299.method3294(0);
                    var8.field2299.method3304(var3[var6]);
                    field672.method1901(var8);
                } else if (arg0 == 4) {
                    class175 var9 = class175.method3207(class172.field2254, field672.field1273);
                    var9.field2299.method3294(0);
                    var9.field2299.method3254(var3[var6]);
                    field672.method1901(var9);
                } else if (arg0 == 6) {
                    class175 var10 = class175.method3207(class172.field2228, field672.field1273);
                    var10.field2299.method3303(var3[var6]);
                    var10.field2299.method3399(0);
                    field672.method1901(var10);
                } else if (arg0 == 7) {
                    class175 var11 = class175.method3207(class172.field2185, field672.field1273);
                    var11.field2299.method3253(0);
                    var11.field2299.method3304(var3[var6]);
                    field672.method1901(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class86.method876(4, "", class240.field2985 + arg1);
        }
    }

    @ObfuscatedName("jr.ht(IIIII)V")
    public static void method4626(int arg0, int arg1, int arg2, int arg3) {
        class233 var4 = class233.method1454(arg0, arg1);
        if (var4 != null && var4.field2735 != null) {
            class58 var5 = new class58();
            var5.field555 = var4;
            var5.field556 = var4.field2735;
            class71.method109(var5);
        }
        field782 = arg3;
        field780 = true;
        Statics.field1201 = arg0;
        field729 = arg1;
        Statics.field1017 = arg2;
        method266(var4);
    }

    @ObfuscatedName("fi.iq(B)V")
    public static void method3180() {
        if (!field780) {
            return;
        }
        class233 var0 = class233.method1454(Statics.field1201, field729);
        if (var0 != null && var0.field2736 != null) {
            class58 var1 = new class58();
            var1.field555 = var0;
            var1.field556 = var0.field2736;
            class71.method109(var1);
        }
        field780 = false;
        method266(var0);
    }

    @ObfuscatedName("in.if(IIIILjava/lang/String;I)V")
    public static void method4238(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method1454(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2744 != null) {
            class58 var6 = new class58();
            var6.field555 = var5;
            var6.field563 = arg0;
            var6.field551 = arg4;
            var6.field556 = var5.field2744;
            class71.method109(var6);
        }
        boolean var7 = true;
        if (var5.field2647 > 0) {
            var7 = method808(var5);
        }
        if (!var7 || !class234.method3572(method50(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class175 var8 = class175.method3207(class172.field2231, field672.field1273);
            var8.field2299.method3256(arg1);
            var8.field2299.method3254(arg2);
            var8.field2299.method3254(arg3);
            field672.method1901(var8);
        }
        if (arg0 == 2) {
            class175 var9 = class175.method3207(class172.field2206, field672.field1273);
            var9.field2299.method3256(arg1);
            var9.field2299.method3254(arg2);
            var9.field2299.method3254(arg3);
            field672.method1901(var9);
        }
        if (arg0 == 3) {
            class175 var10 = class175.method3207(class172.field2196, field672.field1273);
            var10.field2299.method3256(arg1);
            var10.field2299.method3254(arg2);
            var10.field2299.method3254(arg3);
            field672.method1901(var10);
        }
        if (arg0 == 4) {
            class175 var11 = class175.method3207(class172.field2241, field672.field1273);
            var11.field2299.method3256(arg1);
            var11.field2299.method3254(arg2);
            var11.field2299.method3254(arg3);
            field672.method1901(var11);
        }
        if (arg0 == 5) {
            class175 var12 = class175.method3207(class172.field2244, field672.field1273);
            var12.field2299.method3256(arg1);
            var12.field2299.method3254(arg2);
            var12.field2299.method3254(arg3);
            field672.method1901(var12);
        }
        if (arg0 == 6) {
            class175 var13 = class175.method3207(class172.field2215, field672.field1273);
            var13.field2299.method3256(arg1);
            var13.field2299.method3254(arg2);
            var13.field2299.method3254(arg3);
            field672.method1901(var13);
        }
        if (arg0 == 7) {
            class175 var14 = class175.method3207(class172.field2275, field672.field1273);
            var14.field2299.method3256(arg1);
            var14.field2299.method3254(arg2);
            var14.field2299.method3254(arg3);
            field672.method1901(var14);
        }
        if (arg0 == 8) {
            class175 var15 = class175.method3207(class172.field2184, field672.field1273);
            var15.field2299.method3256(arg1);
            var15.field2299.method3254(arg2);
            var15.field2299.method3254(arg3);
            field672.method1901(var15);
        }
        if (arg0 == 9) {
            class175 var16 = class175.method3207(class172.field2273, field672.field1273);
            var16.field2299.method3256(arg1);
            var16.field2299.method3254(arg2);
            var16.field2299.method3254(arg3);
            field672.method1901(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var17 = class175.method3207(class172.field2243, field672.field1273);
        var17.field2299.method3256(arg1);
        var17.field2299.method3254(arg2);
        var17.field2299.method3254(arg3);
        field672.method1901(var17);
    }

    @ObfuscatedName("gm.iz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3594(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field706 || field762 >= 500) {
            return;
        }
        field767[field762] = arg0;
        field768[field762] = arg1;
        field765[field762] = arg2;
        field841[field762] = arg3;
        field763[field762] = arg4;
        field764[field762] = arg5;
        field769[field762] = var12;
        field762++;
    }

    @ObfuscatedName("f.im(I)V")
    public static void method151() {
        for (int var0 = 0; var0 < field762; var0++) {
            int var1 = field765[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field762 - 1) {
                    for (int var3 = var0; var3 < field762 - 1; var3++) {
                        field767[var3] = field767[var3 + 1];
                        field768[var3] = field768[var3 + 1];
                        field765[var3] = field765[var3 + 1];
                        field841[var3] = field841[var3 + 1];
                        field763[var3] = field763[var3 + 1];
                        field764[var3] = field764[var3 + 1];
                        field769[var3] = field769[var3 + 1];
                    }
                }
                var0--;
                field762--;
            }
        }
        method142(Statics.field139 / 2 + Statics.field1947, Statics.field624);
    }

    @ObfuscatedName("jr.iw(II)Ljava/lang/String;")
    public static String method4625(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field768[arg0].length() > 0) {
            return field767[arg0] + class240.field3095 + field768[arg0];
        } else {
            return field767[arg0];
        }
    }

    @ObfuscatedName("br.ih(IIIII)V")
    public static final void method969(int arg0, int arg1, int arg2, int arg3) {
        if (field644 == 0 && !field780) {
            method3594(class240.field3085, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class123.method1405(); var8++) {
            long var9 = class123.field1709[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class123.method3163(var8);
                long var14 = class123.field1709[var8];
                int var16 = (int) (var14 >>> 7 & 0x7FL);
                int var18 = var16;
                long var19 = class123.field1709[var8];
                int var21 = (int) (var19 >>> 14 & 0x3L);
                int var24 = class123.method4726(class123.field1709[var8]);
                int var25 = var24;
                if (var21 == 2 && Statics.field52.method2702(Statics.field585, var13, var16, var9) >= 0) {
                    class271 var26 = class271.method3187(var24);
                    if (var26.field3439 != null) {
                        var26 = var26.method4677();
                    }
                    if (var26 == null) {
                        continue;
                    }
                    if (field644 == 1) {
                        method3594(class240.field2986, field779 + " " + class76.field1108 + " " + class76.method3066(65535) + var26.field3432, 1, var24, var13, var16);
                    } else if (!field780) {
                        String[] var27 = var26.field3430;
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
                                    method3594(var27[var28], class76.method3066(65535) + var26.field3432, var29, var25, var13, var18);
                                }
                            }
                        }
                        method3594(class240.field2987, class76.method3066(65535) + var26.field3432, 1002, var26.field3429, var13, var18);
                    } else if ((Statics.field1017 & 0x4) == 4) {
                        method3594(field873, field785 + " " + class76.field1108 + " " + class76.method3066(65535) + var26.field3432, 2, var24, var13, var16);
                    }
                }
                if (var21 == 1) {
                    class74 var30 = field801[var25];
                    if (var30 == null) {
                        continue;
                    }
                    if (var30.field1088.field3553 == 1 && (var30.field951 & 0x7F) == 64 && (var30.field956 & 0x7F) == 64) {
                        for (int var31 = 0; var31 < field667; var31++) {
                            class74 var32 = field801[field669[var31]];
                            if (var32 != null && var30 != var32 && var32.field1088.field3553 == 1 && var30.field951 == var32.field951 && var30.field956 == var32.field956) {
                                method898(var32.field1088, field669[var31], var13, var18);
                            }
                        }
                        int var33 = class84.field1216;
                        int[] var34 = class84.field1217;
                        for (int var35 = 0; var35 < var33; var35++) {
                            class62 var36 = field888[var34[var35]];
                            if (var36 != null && var30.field951 == var36.field951 && var30.field956 == var36.field956) {
                                method3200(var36, var34[var35], var13, var18);
                            }
                        }
                    }
                    method898(var30.field1088, var25, var13, var18);
                }
                if (var21 == 0) {
                    class62 var37 = field888[var25];
                    if (var37 == null) {
                        continue;
                    }
                    if ((var37.field951 & 0x7F) == 64 && (var37.field956 & 0x7F) == 64) {
                        for (int var38 = 0; var38 < field667; var38++) {
                            class74 var39 = field801[field669[var38]];
                            if (var39 != null && var39.field1088.field3553 == 1 && var37.field951 == var39.field951 && var37.field956 == var39.field956) {
                                method898(var39.field1088, field669[var38], var13, var18);
                            }
                        }
                        int var40 = class84.field1216;
                        int[] var41 = class84.field1217;
                        for (int var42 = 0; var42 < var40; var42++) {
                            class62 var43 = field888[var41[var42]];
                            if (var43 != null && var37 != var43 && var37.field951 == var43.field951 && var37.field956 == var43.field956) {
                                method3200(var43, var41[var42], var13, var18);
                            }
                        }
                    }
                    if (field635 == var25) {
                        var4 = var9;
                    } else {
                        method3200(var37, var25, var13, var18);
                    }
                }
                if (var21 == 3) {
                    class208 var44 = field730[Statics.field585][var13][var18];
                    if (var44 != null) {
                        for (class82 var45 = (class82) var44.method3788(); var45 != null; var45 = (class82) var44.method3781()) {
                            class272 var46 = class272.method4572(var45.field1203);
                            if (field644 == 1) {
                                method3594(class240.field2986, field779 + " " + class76.field1108 + " " + class76.method3066(16748608) + var46.field3473, 16, var45.field1203, var13, var18);
                            } else if (!field780) {
                                String[] var47 = var46.field3497;
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
                                        method3594(var47[var48], class76.method3066(16748608) + var46.field3473, var49, var45.field1203, var13, var18);
                                    } else if (var48 == 2) {
                                        method3594(class240.field2872, class76.method3066(16748608) + var46.field3473, 20, var45.field1203, var13, var18);
                                    }
                                }
                                method3594(class240.field2987, class76.method3066(16748608) + var46.field3473, 1004, var45.field1203, var13, var18);
                            } else if ((Statics.field1017 & 0x1) == 1) {
                                method3594(field873, field785 + " " + class76.field1108 + " " + class76.method3066(16748608) + var46.field3473, 17, var45.field1203, var13, var18);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var50 = class123.method4534(var4);
            int var51 = (int) (var4 >>> 7 & 0x7FL);
            class62 var53 = field888[field635];
            method3200(var53, field635, var50, var51);
        }
    }

    @ObfuscatedName("ar.iy(Ljs;IIII)V")
    public static final void method898(class274 arg0, int arg1, int arg2, int arg3) {
        if (field762 >= 400) {
            return;
        }
        if (arg0.field3565 != null) {
            arg0 = arg0.method4815();
        }
        if (arg0 == null || !arg0.field3558 || arg0.field3551 && field793 != arg1) {
            return;
        }
        String var4 = arg0.field3540;
        if (arg0.field3557 != 0) {
            var4 = var4 + method511(arg0.field3557, Statics.field476.field595) + " " + class76.field1112 + class240.field2992 + arg0.field3557 + class76.field1107;
        }
        if (arg0.field3551 && field701) {
            method3594(class240.field2987, class76.method3066(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field644 == 1) {
            method3594(class240.field2986, field779 + " " + class76.field1108 + " " + class76.method3066(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field780) {
            int var5 = arg0.field3551 && field701 ? 2000 : 0;
            String[] var6 = arg0.field3555;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class240.field2988)) {
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
                        method3594(var6[var7], class76.method3066(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class240.field2988)) {
                        short var10 = 0;
                        if (field654 != class79.field1123) {
                            if (field654 == class79.field1124 || field654 == class79.field1126 && arg0.field3557 > Statics.field476.field595) {
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
                            method3594(var6[var9], class76.method3066(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3551 || !field701) {
                method3594(class240.field2987, class76.method3066(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1017 & 0x2) == 2) {
            method3594(field873, field785 + " " + class76.field1108 + " " + class76.method3066(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fm.il(Lbg;IIII)V")
    public static final void method3200(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field476 == arg0 || field762 >= 400) {
            return;
        }
        String var4;
        if (arg0.field596 == 0) {
            var4 = arg0.field590[0] + arg0.field593 + arg0.field590[1] + method511(arg0.field595, Statics.field476.field595) + " " + class76.field1112 + class240.field2992 + arg0.field595 + class76.field1107 + arg0.field590[2];
        } else {
            var4 = arg0.field590[0] + arg0.field593 + arg0.field590[1] + " " + class76.field1112 + class240.field2993 + arg0.field596 + class76.field1107 + arg0.field590[2];
        }
        if (field644 == 1) {
            method3594(class240.field2986, field779 + " " + class76.field1108 + " " + class76.method3066(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field780) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field749[var5] != null) {
                    short var6 = 0;
                    if (field749[var5].equalsIgnoreCase(class240.field2988)) {
                        if (field653 == class79.field1123) {
                            continue;
                        }
                        if (field653 == class79.field1124 || field653 == class79.field1126 && arg0.field595 > Statics.field476.field595) {
                            var6 = 2000;
                        }
                        if (Statics.field476.field609 != 0 && arg0.field609 != 0) {
                            if (Statics.field476.field609 == arg0.field609) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field750[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field748[var5] + var6;
                    method3594(field749[var5], class76.method3066(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1017 & 0x8) == 8) {
            method3594(field873, field785 + " " + class76.field1108 + " " + class76.method3066(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field762; var9++) {
            if (field765[var9] == 23) {
                field768[var9] = class76.method3066(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("av.in(III)Ljava/lang/String;")
    public static final String method511(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class76.method3066(16711680);
        } else if (var2 < -6) {
            return class76.method3066(16723968);
        } else if (var2 < -3) {
            return class76.method3066(16740352);
        } else if (var2 < 0) {
            return class76.method3066(16756736);
        } else if (var2 > 9) {
            return class76.method3066(65280);
        } else if (var2 > 6) {
            return class76.method3066(4259584);
        } else if (var2 > 3) {
            return class76.method3066(8453888);
        } else if (var2 > 0) {
            return class76.method3066(12648192);
        } else {
            return class76.method3066(16776960);
        }
    }

    @ObfuscatedName("bv.id(IIIIIIIII)V")
    public static final void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method3013(arg0)) {
            Statics.field2419 = null;
            method3872(Statics.field2639[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2419 != null) {
                method3872(Statics.field2419, -1412584499, arg1, arg2, arg3, arg4, Statics.field2077, Statics.field237, arg7);
                Statics.field2419 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field842[var8] = true;
            }
        } else {
            field842[arg7] = true;
        }
    }

    @ObfuscatedName("hj.ix([Lhv;IIIIIIIII)V")
    public static final void method3872(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class320.method5364(arg2, arg3, arg4, arg5);
        class125.method2618();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2662 == arg1 || arg1 == -1412584499 && field796 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field831[field630] = var10.field2761 + arg6;
                    field843[field630] = var10.field2657 + arg7;
                    field833[field630] = var10.field2654;
                    field834[field630] = var10.field2768;
                    var11 = ++field630 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2775 = var11;
                var10.field2776 = field637;
                if (var10.field2642) {
                    boolean var12 = var10.field2655;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2647 > 0) {
                    int var13 = var10.field2647;
                    if (var13 == 324) {
                        if (field887 == -1) {
                            field887 = var10.field2692;
                            field895 = var10.field2679;
                        }
                        if (field886.field2613) {
                            var10.field2692 = field887;
                        } else {
                            var10.field2692 = field895;
                        }
                    } else if (var13 == 325) {
                        if (field887 == -1) {
                            field887 = var10.field2692;
                            field895 = var10.field2679;
                        }
                        if (field886.field2613) {
                            var10.field2692 = field895;
                        } else {
                            var10.field2692 = field887;
                        }
                    } else if (var13 == 327) {
                        var10.field2694 = 150;
                        var10.field2695 = (int) (Math.sin((double) field637 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2686 = 5;
                        var10.field2687 = 0;
                    } else if (var13 == 328) {
                        var10.field2694 = 150;
                        var10.field2695 = (int) (Math.sin((double) field637 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2686 = 5;
                        var10.field2687 = 1;
                    }
                }
                int var14 = var10.field2761 + arg6;
                int var15 = var10.field2657 + arg7;
                int var16 = var10.field2720;
                if (field796 == var10) {
                    if (arg1 != -1412584499 && !var10.field2722) {
                        Statics.field2419 = arg0;
                        Statics.field2077 = arg6;
                        Statics.field237 = arg7;
                        continue;
                    }
                    if (field783 && field874) {
                        int var17 = class49.field465;
                        int var18 = class49.field458;
                        int var19 = var17 - field798;
                        int var20 = var18 - field732;
                        if (var19 < field802) {
                            var19 = field802;
                        }
                        if (var10.field2654 + var19 > field802 + field797.field2654) {
                            var19 = field802 + field797.field2654 - var10.field2654;
                        }
                        if (var20 < field803) {
                            var20 = field803;
                        }
                        if (var10.field2768 + var20 > field803 + field797.field2768) {
                            var20 = field803 + field797.field2768 - var10.field2768;
                        }
                        var14 = var19;
                        var15 = var20;
                    }
                    if (!var10.field2722) {
                        var16 = 128;
                    }
                }
                int var21;
                int var22;
                int var23;
                int var24;
                if (var10.field2645 == 2) {
                    var21 = arg2;
                    var22 = arg3;
                    var23 = arg4;
                    var24 = arg5;
                } else if (var10.field2645 == 9) {
                    int var25 = var14;
                    int var26 = var15;
                    int var27 = var10.field2654 + var14;
                    int var28 = var10.field2768 + var15;
                    if (var27 < var14) {
                        var25 = var27;
                        var27 = var14;
                    }
                    if (var28 < var15) {
                        var26 = var28;
                        var28 = var15;
                    }
                    var27++;
                    var28++;
                    var21 = var25 > arg2 ? var25 : arg2;
                    var22 = var26 > arg3 ? var26 : arg3;
                    var23 = var27 < arg4 ? var27 : arg4;
                    var24 = var28 < arg5 ? var28 : arg5;
                } else {
                    int var31 = var10.field2654 + var14;
                    int var32 = var10.field2768 + var15;
                    var21 = var14 > arg2 ? var14 : arg2;
                    var22 = var15 > arg3 ? var15 : arg3;
                    var23 = var31 < arg4 ? var31 : arg4;
                    var24 = var32 < arg5 ? var32 : arg5;
                }
                if (!var10.field2642 || var21 < var23 && var22 < var24) {
                    if (var10.field2647 != 0) {
                        if (var10.field2647 == 1336) {
                            if (field643) {
                                var15 += 15;
                                Statics.field1935.method5146("Fps:" + field428, var10.field2654 + var14, var15, 16776960, -1);
                                var15 += 15;
                                Runtime var33 = Runtime.getRuntime();
                                int var34 = (int) ((var33.totalMemory() - var33.freeMemory()) / 1024L);
                                int var35 = 16776960;
                                if (var34 > 327680 && !field631) {
                                    var35 = 16711680;
                                }
                                Statics.field1935.method5146("Mem:" + var34 + "k", var10.field2654 + var14, var15, var35, -1);
                                var15 += 15;
                            }
                            continue;
                        }
                        if (var10.field2647 == 1337) {
                            field774 = var14;
                            field775 = var15;
                            method1104(var14, var15, var10.field2654, var10.field2768);
                            field842[var10.field2775] = true;
                            class320.method5364(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2647 == 1338) {
                            method3055();
                            class227 var36 = var10.method4141(false);
                            if (var36 != null) {
                                class320.method5364(var14, var15, var36.field2600 + var14, var36.field2594 + var15);
                                if (field855 == 2 || field855 == 5) {
                                    class320.method5445(var14, var15, 0, var36.field2596, var36.field2595);
                                } else {
                                    int var37 = field695 & 0x7FF;
                                    int var38 = Statics.field476.field951 / 32 + 48;
                                    int var39 = 464 - Statics.field476.field956 / 32;
                                    Statics.field3610.method5543(var14, var15, var36.field2600, var36.field2594, var38, var39, var37, 256, var36.field2596, var36.field2595);
                                    for (int var40 = 0; var40 < field849; var40++) {
                                        int var41 = field693[var40] * 4 + 2 - Statics.field476.field951 / 32;
                                        int var42 = field851[var40] * 4 + 2 - Statics.field476.field956 / 32;
                                        method4223(var14, var15, var41, var42, field852[var40], var36);
                                    }
                                    int var43 = 0;
                                    while (true) {
                                        if (var43 >= 104) {
                                            for (int var48 = 0; var48 < field667; var48++) {
                                                class74 var49 = field801[field669[var48]];
                                                if (var49 != null && var49.method1083()) {
                                                    class274 var50 = var49.field1088;
                                                    if (var50 != null && var50.field3565 != null) {
                                                        var50 = var50.method4815();
                                                    }
                                                    if (var50 != null && var50.field3556 && var50.field3558) {
                                                        int var51 = var49.field951 / 32 - Statics.field476.field951 / 32;
                                                        int var52 = var49.field956 / 32 - Statics.field476.field956 / 32;
                                                        method4223(var14, var15, var51, var52, Statics.field1090[1], var36);
                                                    }
                                                }
                                            }
                                            int var53 = class84.field1216;
                                            int[] var54 = class84.field1217;
                                            for (int var55 = 0; var55 < var53; var55++) {
                                                class62 var56 = field888[var54[var55]];
                                                if (var56 != null && var56.method1083() && !var56.field601 && Statics.field476 != var56) {
                                                    int var57 = var56.field951 / 32 - Statics.field476.field951 / 32;
                                                    int var58 = var56.field956 / 32 - Statics.field476.field956 / 32;
                                                    boolean var59 = false;
                                                    if (Statics.field476.field609 != 0 && var56.field609 != 0 && Statics.field476.field609 == var56.field609) {
                                                        var59 = true;
                                                    }
                                                    if (var56.method1052()) {
                                                        method4223(var14, var15, var57, var58, Statics.field1090[3], var36);
                                                    } else if (var59) {
                                                        method4223(var14, var15, var57, var58, Statics.field1090[4], var36);
                                                    } else if (var56.method1062()) {
                                                        method4223(var14, var15, var57, var58, Statics.field1090[5], var36);
                                                    } else {
                                                        method4223(var14, var15, var57, var58, Statics.field1090[2], var36);
                                                    }
                                                }
                                            }
                                            if (field645 != 0 && field637 % 20 < 10) {
                                                if (field645 == 1 && field646 >= 0 && field646 < field801.length) {
                                                    class74 var60 = field801[field646];
                                                    if (var60 != null) {
                                                        int var61 = var60.field951 / 32 - Statics.field476.field951 / 32;
                                                        int var62 = var60.field956 / 32 - Statics.field476.field956 / 32;
                                                        method1003(var14, var15, var61, var62, Statics.field330[1], var36);
                                                    }
                                                }
                                                if (field645 == 2) {
                                                    int var63 = field648 * 4 - Statics.field2788 * 4 + 2 - Statics.field476.field951 / 32;
                                                    int var64 = field807 * 4 - Statics.field599 * 4 + 2 - Statics.field476.field956 / 32;
                                                    method1003(var14, var15, var63, var64, Statics.field330[1], var36);
                                                }
                                                if (field645 == 10 && field755 >= 0 && field755 < field888.length) {
                                                    class62 var65 = field888[field755];
                                                    if (var65 != null) {
                                                        int var66 = var65.field951 / 32 - Statics.field476.field951 / 32;
                                                        int var67 = var65.field956 / 32 - Statics.field476.field956 / 32;
                                                        method1003(var14, var15, var66, var67, Statics.field330[1], var36);
                                                    }
                                                }
                                            }
                                            if (field853 != 0) {
                                                int var68 = field853 * 4 + 2 - Statics.field476.field951 / 32;
                                                int var69 = field638 * 4 + 2 - Statics.field476.field956 / 32;
                                                method4223(var14, var15, var68, var69, Statics.field330[0], var36);
                                            }
                                            if (!Statics.field476.field601) {
                                                class320.method5372(var36.field2600 / 2 + var14 - 1, var36.field2594 / 2 + var15 - 1, 3, 3, 16777215);
                                            }
                                            break;
                                        }
                                        for (int var44 = 0; var44 < 104; var44++) {
                                            class208 var45 = field730[Statics.field585][var43][var44];
                                            if (var45 != null) {
                                                int var46 = var43 * 4 + 2 - Statics.field476.field951 / 32;
                                                int var47 = var44 * 4 + 2 - Statics.field476.field956 / 32;
                                                method4223(var14, var15, var46, var47, Statics.field1090[0], var36);
                                            }
                                        }
                                        var43++;
                                    }
                                }
                                field829[var11] = true;
                            }
                            class320.method5364(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2647 == 1339) {
                            class227 var70 = var10.method4141(false);
                            if (var70 != null) {
                                if (field855 < 3) {
                                    Statics.field2418.method5543(var14, var15, var70.field2600, var70.field2594, 25, 25, field695, 256, var70.field2596, var70.field2595);
                                } else {
                                    class320.method5445(var14, var15, 0, var70.field2596, var70.field2595);
                                }
                            }
                            class320.method5364(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2647 == 1400) {
                            Statics.field1979.method5743(var14, var15, var10.field2654, var10.field2768, field637);
                        }
                        if (var10.field2647 == 1401) {
                            Statics.field1979.method5664(var14, var15, var10.field2654, var10.field2768);
                        }
                    }
                    if (var10.field2645 == 0) {
                        if (!var10.field2642) {
                            boolean var71 = var10.field2655;
                            if (var71 && Statics.field363 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2642) {
                            if (var10.field2749 > var10.field2667 - var10.field2768) {
                                var10.field2749 = var10.field2667 - var10.field2768;
                            }
                            if (var10.field2749 < 0) {
                                var10.field2749 = 0;
                            }
                        }
                        method3872(arg0, var10.field2677, var21, var22, var23, var24, var14 - var10.field2664, var15 - var10.field2749, var11);
                        if (var10.field2691 != null) {
                            method3872(var10.field2691, var10.field2677, var21, var22, var23, var24, var14 - var10.field2664, var15 - var10.field2749, var11);
                        }
                        class57 var72 = (class57) field786.method3734((long) var10.field2677);
                        if (var72 != null) {
                            method1517(var72.field550, var21, var22, var23, var24, var14, var15, var11);
                        }
                        class320.method5364(arg2, arg3, arg4, arg5);
                        class125.method2618();
                    }
                    if (field837 || field830[var11] || field835 > 1) {
                        if (var10.field2645 == 0 && !var10.field2642 && var10.field2667 > var10.field2768) {
                            int var73 = var10.field2654 + var14;
                            int var74 = var10.field2749;
                            int var75 = var10.field2768;
                            int var76 = var10.field2667;
                            Statics.field21[0].method5452(var73, var15);
                            Statics.field21[1].method5452(var73, var15 + var75 - 16);
                            class320.method5372(var73, var15 + 16, 16, var75 - 32, field688);
                            int var77 = (var75 - 32) * var75 / var76;
                            if (var77 < 8) {
                                var77 = 8;
                            }
                            int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                            class320.method5372(var73, var15 + 16 + var78, 16, var77, field766);
                            class320.method5380(var73, var15 + 16 + var78, var77, field691);
                            class320.method5380(var73 + 1, var15 + 16 + var78, var77, field691);
                            class320.method5378(var73, var15 + 16 + var78, 16, field691);
                            class320.method5378(var73, var15 + 17 + var78, 16, field691);
                            class320.method5380(var73 + 15, var15 + 16 + var78, var77, field684);
                            class320.method5380(var73 + 14, var15 + 17 + var78, var77 - 1, field684);
                            class320.method5378(var73, var15 + 15 + var78 + var77, 16, field684);
                            class320.method5378(var73 + 1, var15 + 14 + var78 + var77, 15, field684);
                        }
                        if (var10.field2645 != 1) {
                            if (var10.field2645 == 2) {
                                int var79 = 0;
                                for (int var80 = 0; var80 < var10.field2682; var80++) {
                                    for (int var81 = 0; var81 < var10.field2772; var81++) {
                                        int var82 = (var10.field2710 + 32) * var81 + var14;
                                        int var83 = (var10.field2711 + 32) * var80 + var15;
                                        if (var79 < 20) {
                                            var82 += var10.field2712[var79];
                                            var83 += var10.field2665[var79];
                                        }
                                        if (var10.field2762[var79] > 0) {
                                            boolean var84 = false;
                                            boolean var85 = false;
                                            int var86 = var10.field2762[var79] - 1;
                                            if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field192 == var10 && field703 == var79) {
                                                class324 var87;
                                                if (field644 == 1 && Statics.field477 == var79 && Statics.field132 == var10.field2677) {
                                                    var87 = class272.method2865(var86, var10.field2763[var79], 2, 0, 2, false);
                                                } else {
                                                    var87 = class272.method2865(var86, var10.field2763[var79], 1, 3153952, 2, false);
                                                }
                                                if (var87 == null) {
                                                    method266(var10);
                                                } else if (Statics.field192 == var10 && field703 == var79) {
                                                    int var88 = class49.field465 - field734;
                                                    int var89 = class49.field458 - field735;
                                                    if (var88 < 5 && var88 > -5) {
                                                        var88 = 0;
                                                    }
                                                    if (var89 < 5 && var89 > -5) {
                                                        var89 = 0;
                                                    }
                                                    if (field738 < 5) {
                                                        var88 = 0;
                                                        var89 = 0;
                                                    }
                                                    var87.method5490(var82 + var88, var83 + var89, 128);
                                                    if (arg1 != -1) {
                                                        class233 var90 = arg0[arg1 & 0xFFFF];
                                                        if (var83 + var89 < class320.field3823 && var90.field2749 > 0) {
                                                            int var91 = field687 * (class320.field3823 - var83 - var89) / 3;
                                                            if (var91 > field687 * 10) {
                                                                var91 = field687 * 10;
                                                            }
                                                            if (var91 > var90.field2749) {
                                                                var91 = var90.field2749;
                                                            }
                                                            var90.field2749 -= var91;
                                                            field735 += var91;
                                                            method266(var90);
                                                        }
                                                        if (var83 + var89 + 32 > class320.field3822 && var90.field2749 < var90.field2667 - var90.field2768) {
                                                            int var92 = field687 * (var83 + var89 + 32 - class320.field3822) / 3;
                                                            if (var92 > field687 * 10) {
                                                                var92 = field687 * 10;
                                                            }
                                                            if (var92 > var90.field2667 - var90.field2768 - var90.field2749) {
                                                                var92 = var90.field2667 - var90.field2768 - var90.field2749;
                                                            }
                                                            var90.field2749 += var92;
                                                            field735 -= var92;
                                                            method266(var90);
                                                        }
                                                    }
                                                } else if (Statics.field1268 == var10 && field670 == var79) {
                                                    var87.method5490(var82, var83, 128);
                                                } else {
                                                    var87.method5569(var82, var83);
                                                }
                                            }
                                        } else if (var10.field2752 != null && var79 < 20) {
                                            class324 var93 = var10.method4174(var79);
                                            if (var93 != null) {
                                                var93.method5569(var82, var83);
                                            } else if (class233.field2641) {
                                                method266(var10);
                                            }
                                        }
                                        var79++;
                                    }
                                }
                            } else if (var10.field2645 == 3) {
                                int var94;
                                if (method910(var10)) {
                                    var94 = var10.field2635;
                                    if (Statics.field363 == var10 && var10.field2671 != 0) {
                                        var94 = var10.field2671;
                                    }
                                } else {
                                    var94 = var10.field2741;
                                    if (Statics.field363 == var10 && var10.field2670 != 0) {
                                        var94 = var10.field2670;
                                    }
                                }
                                if (var10.field2672) {
                                    switch(var10.field2760.field3834) {
                                        case 1:
                                            class320.method5390(var14, var15, var10.field2654, var10.field2768, var10.field2741, var10.field2635);
                                            break;
                                        case 2:
                                            class320.method5427(var14, var15, var10.field2654, var10.field2768, var10.field2741, var10.field2635, 255 - (var10.field2720 & 0xFF), 255 - (var10.field2675 & 0xFF));
                                            break;
                                        default:
                                            if (var16 == 0) {
                                                class320.method5372(var14, var15, var10.field2654, var10.field2768, var94);
                                            } else {
                                                class320.method5412(var14, var15, var10.field2654, var10.field2768, var94, 256 - (var16 & 0xFF));
                                            }
                                    }
                                } else if (var16 == 0) {
                                    class320.method5428(var14, var15, var10.field2654, var10.field2768, var94);
                                } else {
                                    class320.method5404(var14, var15, var10.field2654, var10.field2768, var94, 256 - (var16 & 0xFF));
                                }
                            } else if (var10.field2645 == 4) {
                                class301 var95 = var10.method4139();
                                if (var95 != null) {
                                    String var96 = var10.field2704;
                                    int var97;
                                    if (method910(var10)) {
                                        var97 = var10.field2635;
                                        if (Statics.field363 == var10 && var10.field2671 != 0) {
                                            var97 = var10.field2671;
                                        }
                                        if (var10.field2688.length() > 0) {
                                            var96 = var10.field2688;
                                        }
                                    } else {
                                        var97 = var10.field2741;
                                        if (Statics.field363 == var10 && var10.field2670 != 0) {
                                            var97 = var10.field2670;
                                        }
                                    }
                                    if (var10.field2642 && var10.field2764 != -1) {
                                        class272 var98 = class272.method4572(var10.field2764);
                                        var96 = var98.field3473;
                                        if (var96 == null) {
                                            var96 = class240.field2840;
                                        }
                                        if ((var98.field3494 == 1 || var10.field2765 != 1) && var10.field2765 != -1) {
                                            var96 = class76.method3066(16748608) + var96 + class76.field1110 + " " + 'x' + method877(var10.field2765);
                                        }
                                    }
                                    if (field789 == var10) {
                                        var96 = class240.field3016;
                                        var97 = var10.field2741;
                                    }
                                    if (!var10.field2642) {
                                        var96 = method1042(var96, var10);
                                    }
                                    var95.method5196(var96, var14, var15, var10.field2654, var10.field2768, var97, var10.field2709 ? 0 : -1, var10.field2707, var10.field2708, var10.field2754);
                                } else if (class233.field2641) {
                                    method266(var10);
                                }
                            } else if (var10.field2645 == 5) {
                                if (var10.field2642) {
                                    class324 var100;
                                    if (var10.field2764 == -1) {
                                        var100 = var10.method4153(false);
                                    } else {
                                        var100 = class272.method2865(var10.field2764, var10.field2765, var10.field2771, var10.field2683, var10.field2750, false);
                                    }
                                    if (var100 != null) {
                                        int var101 = var100.field3850;
                                        int var102 = var100.field3854;
                                        if (var10.field2746) {
                                            class320.method5371(var14, var15, var10.field2654 + var14, var10.field2768 + var15);
                                            int var103 = (var10.field2654 + (var101 - 1)) / var101;
                                            int var104 = (var10.field2768 + (var102 - 1)) / var102;
                                            for (int var105 = 0; var105 < var103; var105++) {
                                                for (int var106 = 0; var106 < var104; var106++) {
                                                    if (var10.field2680 != 0) {
                                                        var100.method5502(var101 / 2 + var101 * var105 + var14, var102 / 2 + var102 * var106 + var15, var10.field2680, 4096);
                                                    } else if (var16 == 0) {
                                                        var100.method5569(var101 * var105 + var14, var102 * var106 + var15);
                                                    } else {
                                                        var100.method5490(var101 * var105 + var14, var102 * var106 + var15, 256 - (var16 & 0xFF));
                                                    }
                                                }
                                            }
                                            class320.method5364(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var107 = var10.field2654 * 4096 / var101;
                                            if (var10.field2680 != 0) {
                                                var100.method5502(var10.field2654 / 2 + var14, var10.field2768 / 2 + var15, var10.field2680, var107);
                                            } else if (var16 != 0) {
                                                var100.method5492(var14, var15, var10.field2654, var10.field2768, 256 - (var16 & 0xFF));
                                            } else if (var10.field2654 == var101 && var10.field2768 == var102) {
                                                var100.method5569(var14, var15);
                                            } else {
                                                var100.method5486(var14, var15, var10.field2654, var10.field2768);
                                            }
                                        }
                                    } else if (class233.field2641) {
                                        method266(var10);
                                    }
                                } else {
                                    class324 var99 = var10.method4153(method910(var10));
                                    if (var99 != null) {
                                        var99.method5569(var14, var15);
                                    } else if (class233.field2641) {
                                        method266(var10);
                                    }
                                }
                            } else if (var10.field2645 == 6) {
                                boolean var108 = method910(var10);
                                int var109;
                                if (var108) {
                                    var109 = var10.field2673;
                                } else {
                                    var109 = var10.field2690;
                                }
                                class122 var110 = null;
                                int var111 = 0;
                                if (var10.field2764 != -1) {
                                    class272 var112 = class272.method4572(var10.field2764);
                                    if (var112 != null) {
                                        class272 var113 = var112.method4734(var10.field2765);
                                        var110 = var113.method4733(1);
                                        if (var110 == null) {
                                            method266(var10);
                                        } else {
                                            var110.method2473();
                                            var111 = var110.field1828 / 2;
                                        }
                                    }
                                } else if (var10.field2686 == 5) {
                                    if (var10.field2687 == 0) {
                                        var110 = field886.method4096((class276) null, -1, (class276) null, -1);
                                    } else {
                                        var110 = Statics.field476.method1059();
                                    }
                                } else if (var109 == -1) {
                                    var110 = var10.method4138((class276) null, -1, var108, Statics.field476.field591);
                                    if (var110 == null && class233.field2641) {
                                        method266(var10);
                                    }
                                } else {
                                    class276 var114 = class276.method3241(var109);
                                    var110 = var10.method4138(var114, var10.field2766, var108, Statics.field476.field591);
                                    if (var110 == null && class233.field2641) {
                                        method266(var10);
                                    }
                                }
                                class125.method2608(var10.field2654 / 2 + var14, var10.field2768 / 2 + var15);
                                int var115 = var10.field2697 * class125.field1747[var10.field2694] >> 16;
                                int var116 = var10.field2697 * class125.field1748[var10.field2694] >> 16;
                                if (var110 != null) {
                                    if (var10.field2642) {
                                        var110.method2473();
                                        if (var10.field2700) {
                                            var110.method2483(0, var10.field2695, var10.field2696, var10.field2694, var10.field2743, var10.field2663 + var111 + var115, var10.field2663 + var116, var10.field2697);
                                        } else {
                                            var110.method2490(0, var10.field2695, var10.field2696, var10.field2694, var10.field2743, var10.field2663 + var111 + var115, var10.field2663 + var116);
                                        }
                                    } else {
                                        var110.method2490(0, var10.field2695, 0, var10.field2694, 0, var115, var116);
                                    }
                                }
                                class125.method2590();
                            } else {
                                if (var10.field2645 == 7) {
                                    class301 var117 = var10.method4139();
                                    if (var117 == null) {
                                        if (class233.field2641) {
                                            method266(var10);
                                        }
                                        continue;
                                    }
                                    int var118 = 0;
                                    for (int var119 = 0; var119 < var10.field2682; var119++) {
                                        for (int var120 = 0; var120 < var10.field2772; var120++) {
                                            if (var10.field2762[var118] > 0) {
                                                class272 var121 = class272.method4572(var10.field2762[var118] - 1);
                                                String var122;
                                                if (var121.field3494 != 1 && var10.field2763[var118] == 1) {
                                                    var122 = class76.method3066(16748608) + var121.field3473 + class76.field1110;
                                                } else {
                                                    var122 = class76.method3066(16748608) + var121.field3473 + class76.field1110 + " " + 'x' + method877(var10.field2763[var118]);
                                                }
                                                int var123 = (var10.field2710 + 115) * var120 + var14;
                                                int var124 = (var10.field2711 + 12) * var119 + var15;
                                                if (var10.field2707 == 0) {
                                                    var117.method5144(var122, var123, var124, var10.field2741, var10.field2709 ? 0 : -1);
                                                } else if (var10.field2707 == 1) {
                                                    var117.method5147(var122, var10.field2654 / 2 + var123, var124, var10.field2741, var10.field2709 ? 0 : -1);
                                                } else {
                                                    var117.method5146(var122, var10.field2654 + var123 - 1, var124, var10.field2741, var10.field2709 ? 0 : -1);
                                                }
                                            }
                                            var118++;
                                        }
                                    }
                                }
                                if (var10.field2645 == 8 && Statics.field144 == var10 && field777 == field776) {
                                    int var125 = 0;
                                    int var126 = 0;
                                    class301 var127 = Statics.field1935;
                                    String var128 = var10.field2704;
                                    String var129 = method1042(var128, var10);
                                    while (var129.length() > 0) {
                                        int var130 = var129.indexOf(class76.field1111);
                                        String var131;
                                        if (var130 == -1) {
                                            var131 = var129;
                                            var129 = "";
                                        } else {
                                            var131 = var129.substring(0, var130);
                                            var129 = var129.substring(var130 + 4);
                                        }
                                        int var132 = var127.method5139(var131);
                                        if (var132 > var125) {
                                            var125 = var132;
                                        }
                                        var126 += var127.field3737 + 1;
                                    }
                                    var125 += 6;
                                    var126 += 7;
                                    int var133 = var10.field2654 + var14 - 5 - var125;
                                    int var134 = var10.field2768 + var15 + 5;
                                    if (var133 < var14 + 5) {
                                        var133 = var14 + 5;
                                    }
                                    if (var125 + var133 > arg4) {
                                        var133 = arg4 - var125;
                                    }
                                    if (var126 + var134 > arg5) {
                                        var134 = arg5 - var126;
                                    }
                                    class320.method5372(var133, var134, var125, var126, 16777120);
                                    class320.method5428(var133, var134, var125, var126, 0);
                                    String var135 = var10.field2704;
                                    int var136 = var127.field3737 + var134 + 2;
                                    String var137 = method1042(var135, var10);
                                    while (var137.length() > 0) {
                                        int var138 = var137.indexOf(class76.field1111);
                                        String var139;
                                        if (var138 == -1) {
                                            var139 = var137;
                                            var137 = "";
                                        } else {
                                            var139 = var137.substring(0, var138);
                                            var137 = var137.substring(var138 + 4);
                                        }
                                        var127.method5144(var139, var133 + 3, var136, 0, -1);
                                        var136 += var127.field3737 + 1;
                                    }
                                }
                                if (var10.field2645 == 9) {
                                    int var140;
                                    int var141;
                                    int var142;
                                    int var143;
                                    if (var10.field2756) {
                                        var140 = var14;
                                        var141 = var10.field2768 + var15;
                                        var142 = var10.field2654 + var14;
                                        var143 = var15;
                                    } else {
                                        var140 = var14;
                                        var141 = var15;
                                        var142 = var10.field2654 + var14;
                                        var143 = var10.field2768 + var15;
                                    }
                                    if (var10.field2676 == 1) {
                                        class320.method5419(var140, var141, var142, var143, var10.field2741);
                                    } else {
                                        method3164(var140, var141, var142, var143, var10.field2741, var10.field2676);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.ic(IIIIIII)V")
    public static final void method3164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class320.field3825;
        int var18 = arg1 - class320.field3823;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class125.method2596(var19, var20, var21);
        class125.method2599(var23, var24, var25, var19, var20, var21, arg4);
        class125.method2596(var19, var21, var22);
        class125.method2599(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bo.ij(Ljava/lang/String;Lhv;I)Ljava/lang/String;")
    public static String method1042(String arg0, class233 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method584(arg1, var2 - 1);
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

    @ObfuscatedName("ax.ib(IB)Ljava/lang/String;")
    public static final String method877(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field1104 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method3066(65408) + var1.substring(0, var1.length() - 8) + class240.field3007 + " " + class76.field1112 + var1 + class76.field1107 + class76.field1110;
        } else if (var1.length() > 6) {
            return " " + class76.method3066(16777215) + var1.substring(0, var1.length() - 4) + class240.field2999 + " " + class76.field1112 + var1 + class76.field1107 + class76.field1110;
        } else {
            return " " + class76.method3066(16776960) + var1 + class76.field1110;
        }
    }

    @ObfuscatedName("client.is(ZI)V")
    public final void method1122(boolean arg0) {
        int var2 = field668;
        int var3 = Statics.field226;
        int var4 = Statics.field387;
        if (class233.method3013(var2)) {
            method2993(Statics.field2639[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.iu(Lhv;I)V")
    public void method1154(class233 arg0) {
        class233 var2 = arg0.field2662 == -1 ? null : class233.method457(arg0.field2662);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field226;
            var4 = Statics.field387;
        } else {
            var3 = var2.field2654;
            var4 = var2.field2768;
        }
        method4695(arg0, var3, var4, false);
        method437(arg0, var3, var4);
    }

    @ObfuscatedName("ak.it([Lhv;Lhv;ZI)V")
    public static void method709(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2666 == 0 ? arg1.field2654 : arg1.field2666;
        int var4 = arg1.field2667 == 0 ? arg1.field2768 : arg1.field2667;
        method2993(arg0, arg1.field2677, var3, var4, arg2);
        if (arg1.field2691 != null) {
            method2993(arg1.field2691, arg1.field2677, var3, var4, arg2);
        }
        class57 var5 = (class57) field786.method3734((long) arg1.field2677);
        if (var5 != null) {
            int var6 = var5.field550;
            if (class233.method3013(var6)) {
                method2993(Statics.field2639[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2647 == 1337) {
        }
    }

    @ObfuscatedName("ft.iv([Lhv;IIIZI)V")
    public static void method2993(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2662 == arg1) {
                method4695(var6, arg2, arg3, arg4);
                method437(var6, arg2, arg3);
                if (var6.field2664 > var6.field2666 - var6.field2654) {
                    var6.field2664 = var6.field2666 - var6.field2654;
                }
                if (var6.field2664 < 0) {
                    var6.field2664 = 0;
                }
                if (var6.field2749 > var6.field2667 - var6.field2768) {
                    var6.field2749 = var6.field2667 - var6.field2768;
                }
                if (var6.field2749 < 0) {
                    var6.field2749 = 0;
                }
                if (var6.field2645 == 0) {
                    method709(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("jc.ig(Lhv;IIZI)V")
    public static void method4695(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2654;
        int var5 = arg0.field2768;
        if (arg0.field2650 == 0) {
            arg0.field2654 = arg0.field2772;
        } else if (arg0.field2650 == 1) {
            arg0.field2654 = arg1 - arg0.field2772;
        } else if (arg0.field2650 == 2) {
            arg0.field2654 = arg0.field2772 * arg1 >> 14;
        }
        if (arg0.field2651 == 0) {
            arg0.field2768 = arg0.field2682;
        } else if (arg0.field2651 == 1) {
            arg0.field2768 = arg2 - arg0.field2682;
        } else if (arg0.field2651 == 2) {
            arg0.field2768 = arg0.field2682 * arg2 >> 14;
        }
        if (arg0.field2650 == 4) {
            arg0.field2654 = arg0.field2768 * arg0.field2660 / arg0.field2661;
        }
        if (arg0.field2651 == 4) {
            arg0.field2768 = arg0.field2661 * arg0.field2654 / arg0.field2660;
        }
        if (arg0.field2647 == 1337) {
            field795 = arg0;
        }
        if (arg3 && arg0.field2631 != null && (arg0.field2654 != var4 || arg0.field2768 != var5)) {
            class58 var6 = new class58();
            var6.field555 = arg0;
            var6.field556 = arg0.field2631;
            field822.method3773(var6);
        }
    }

    @ObfuscatedName("an.ia(Lhv;III)V")
    public static void method437(class233 arg0, int arg1, int arg2) {
        if (arg0.field2693 == 0) {
            arg0.field2761 = arg0.field2652;
        } else if (arg0.field2693 == 1) {
            arg0.field2761 = (arg1 - arg0.field2654) / 2 + arg0.field2652;
        } else if (arg0.field2693 == 2) {
            arg0.field2761 = arg1 - arg0.field2654 - arg0.field2652;
        } else if (arg0.field2693 == 3) {
            arg0.field2761 = arg0.field2652 * arg1 >> 14;
        } else if (arg0.field2693 == 4) {
            arg0.field2761 = (arg0.field2652 * arg1 >> 14) + (arg1 - arg0.field2654) / 2;
        } else {
            arg0.field2761 = arg1 - arg0.field2654 - (arg0.field2652 * arg1 >> 14);
        }
        if (arg0.field2753 == 0) {
            arg0.field2657 = arg0.field2653;
        } else if (arg0.field2753 == 1) {
            arg0.field2657 = (arg2 - arg0.field2768) / 2 + arg0.field2653;
        } else if (arg0.field2753 == 2) {
            arg0.field2657 = arg2 - arg0.field2768 - arg0.field2653;
        } else if (arg0.field2753 == 3) {
            arg0.field2657 = arg0.field2653 * arg2 >> 14;
        } else if (arg0.field2753 == 4) {
            arg0.field2657 = (arg0.field2653 * arg2 >> 14) + (arg2 - arg0.field2768) / 2;
        } else {
            arg0.field2657 = arg2 - arg0.field2768 - (arg0.field2653 * arg2 >> 14);
        }
    }

    @ObfuscatedName("hg.ie(Lhv;IIIIIII)V")
    public static final void method4124(class233 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field791) {
            field722 = 32;
        } else {
            field722 = 0;
        }
        field791 = false;
        if (class49.field464 == 1 || !Statics.field246 && class49.field464 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2749 -= 4;
                method266(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2749 += 4;
                method266(arg0);
            } else if (arg5 >= arg1 - field722 && arg5 < field722 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2749 = (arg4 - arg3) * var8 / var9;
                method266(arg0);
                field791 = true;
            }
        }
        if (field821 == 0) {
            return;
        }
        int var10 = arg0.field2654;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2749 += field821 * 45;
            method266(arg0);
        }
    }

    @ObfuscatedName("ar.ir(Lhv;B)Z")
    public static final boolean method910(class233 arg0) {
        if (arg0.field2757 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2757.length; var1++) {
            int var2 = method584(arg0, var1);
            int var3 = arg0.field2758[var1];
            if (arg0.field2757[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("au.ip(Lhv;IB)I")
    public static final int method584(class233 arg0, int arg1) {
        if (arg0.field2705 == null || arg1 >= arg0.field2705.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2705[arg1];
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
                    var7 = field757[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field758[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field759[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class233 var11 = class233.method457(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class272.method4572(var12).field3484 || field871)) {
                        for (int var13 = 0; var13 < var11.field2762.length; var13++) {
                            if (var12 + 1 == var11.field2762[var13]) {
                                var7 += var11.field2763[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class228.field2601[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class237.field2816[field758[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class228.field2601[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field476.field595;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class237.field2815[var14]) {
                            var7 += field758[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class233 var17 = class233.method457(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class272.method4572(var18).field3484 || field871)) {
                        for (int var19 = 0; var19 < var17.field2762.length; var19++) {
                            if (var18 + 1 == var17.field2762[var19]) {
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
                    var7 = field896;
                }
                if (var6 == 13) {
                    int var20 = class228.field2601[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class228.method3085(var22);
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
                    var7 = (Statics.field476.field951 >> 7) + Statics.field2788;
                }
                if (var6 == 19) {
                    var7 = (Statics.field476.field956 >> 7) + Statics.field599;
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

    @ObfuscatedName("bb.ik(Lhv;Lja;IIZB)V")
    public static final void method1599(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3509;
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
            var7 = class240.field2834;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class76.method3066(16748608) + arg1.field3473;
        int var11 = arg1.field3481;
        int var13 = arg0.field2677;
        if (field706 || field762 >= 500) {
            return;
        }
        field767[field762] = var7;
        field768[field762] = var9;
        field765[field762] = var6;
        field841[field762] = var11;
        field763[field762] = arg2;
        field764[field762] = var13;
        field769[field762] = arg4;
        field762++;
    }

    @ObfuscatedName("ge.io(ZB)V")
    public static void method3496(boolean arg0) {
        field721 = arg0;
    }

    @ObfuscatedName("bf.ii(B)Z")
    public static boolean method1662() {
        return field721 || class40.field377[81];
    }

    @ObfuscatedName("cm.jm([Lhv;IIIIIIII)V")
    public static final void method1886(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && var9.field2662 == arg1 && (!var9.field2642 || var9.field2645 == 0 || var9.field2724 || method50(var9) != 0 || field797 == var9 || var9.field2647 == 1338)) {
                if (var9.field2642) {
                    boolean var10 = var9.field2655;
                    if (var10) {
                        continue;
                    }
                } else if (var9.field2645 == 0 && Statics.field363 != var9) {
                    boolean var11 = var9.field2655;
                    if (var11) {
                        continue;
                    }
                }
                int var12 = var9.field2761 + arg6;
                int var13 = var9.field2657 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var9.field2645 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else if (var9.field2645 == 9) {
                    int var18 = var12;
                    int var19 = var13;
                    int var20 = var9.field2654 + var12;
                    int var21 = var9.field2768 + var13;
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    if (var21 < var13) {
                        var19 = var21;
                        var21 = var13;
                    }
                    var20++;
                    var21++;
                    var14 = var18 > arg2 ? var18 : arg2;
                    var15 = var19 > arg3 ? var19 : arg3;
                    var16 = var20 < arg4 ? var20 : arg4;
                    var17 = var21 < arg5 ? var21 : arg5;
                } else {
                    int var24 = var9.field2654 + var12;
                    int var25 = var9.field2768 + var13;
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var24 < arg4 ? var24 : arg4;
                    var17 = var25 < arg5 ? var25 : arg5;
                }
                if (field796 == var9) {
                    field804 = true;
                    field805 = var12;
                    field689 = var13;
                }
                if (!var9.field2642 || var14 < var16 && var15 < var17) {
                    if (var9.field2642) {
                        if (var9.field2777) {
                            if (class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17) {
                                for (class58 var26 = (class58) field822.method3799(); var26 != null; var26 = (class58) field822.method3780()) {
                                    if (var26.field552) {
                                        var26.method3766();
                                        var26.field555.field2769 = false;
                                    }
                                }
                                if (Statics.field2382 == 0) {
                                    field796 = null;
                                    field797 = null;
                                }
                                if (!field706) {
                                    method1897();
                                }
                            }
                        } else if (var9.field2633 && class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17) {
                            for (class58 var27 = (class58) field822.method3799(); var27 != null; var27 = (class58) field822.method3780()) {
                                if (var27.field552 && var27.field555.field2745 == var27.field556) {
                                    var27.method3766();
                                }
                            }
                        }
                    }
                    int var28 = class49.field465;
                    int var29 = class49.field458;
                    if (class49.field472 != 0) {
                        var28 = class49.field457;
                        var29 = class49.field468;
                    }
                    boolean var30 = var28 >= var14 && var29 >= var15 && var28 < var16 && var29 < var17;
                    if (var9.field2647 == 1337) {
                        if (!field632 && !field706 && var30) {
                            method969(var28, var29, var14, var15);
                        }
                    } else if (var9.field2647 != 1338) {
                        if (var9.field2647 == 1400) {
                            Statics.field1979.method5640(class49.field465, class49.field458, var30, var12, var13, var9.field2654, var9.field2768);
                        }
                        if (!field706 && var30) {
                            if (var9.field2647 == 1400) {
                                Statics.field1979.method5816(var12, var13, var9.field2654, var9.field2768, var28, var29);
                            } else {
                                int var44 = var28 - var12;
                                int var45 = var29 - var13;
                                if (var9.field2646 == 1) {
                                    method3594(var9.field2713, "", 24, 0, 0, var9.field2677);
                                }
                                if (var9.field2646 == 2 && !field780) {
                                    String var46 = method3989(var9);
                                    if (var46 != null) {
                                        method3594(var46, class76.method3066(65280) + var9.field2706, 25, 0, -1, var9.field2677);
                                    }
                                }
                                if (var9.field2646 == 3) {
                                    method3594(class240.field2995, "", 26, 0, 0, var9.field2677);
                                }
                                if (var9.field2646 == 4) {
                                    method3594(var9.field2713, "", 28, 0, 0, var9.field2677);
                                }
                                if (var9.field2646 == 5) {
                                    method3594(var9.field2713, "", 29, 0, 0, var9.field2677);
                                }
                                if (var9.field2646 == 6 && field789 == null) {
                                    method3594(var9.field2713, "", 30, 0, -1, var9.field2677);
                                }
                                if (var9.field2645 == 2) {
                                    int var47 = 0;
                                    for (int var48 = 0; var48 < var9.field2768; var48++) {
                                        for (int var49 = 0; var49 < var9.field2654; var49++) {
                                            int var50 = (var9.field2710 + 32) * var49;
                                            int var51 = (var9.field2711 + 32) * var48;
                                            if (var47 < 20) {
                                                var50 += var9.field2712[var47];
                                                var51 += var9.field2665[var47];
                                            }
                                            if (var44 >= var50 && var45 >= var51 && var44 < var50 + 32 && var45 < var51 + 32) {
                                                field736 = var47;
                                                Statics.field3142 = var9;
                                                if (var9.field2762[var47] > 0) {
                                                    class272 var52 = class272.method4572(var9.field2762[var47] - 1);
                                                    if (field644 != 1 || !class234.method2097(method50(var9))) {
                                                        label1005: {
                                                            if (field780) {
                                                                int var53 = method50(var9);
                                                                boolean var54 = (var53 >> 30 & 0x1) != 0;
                                                                if (var54) {
                                                                    if ((Statics.field1017 & 0x10) == 16) {
                                                                        method3594(field873, field785 + " " + class76.field1108 + " " + class76.method3066(16748608) + var52.field3473, 32, var52.field3481, var47, var9.field2677);
                                                                    }
                                                                    break label1005;
                                                                }
                                                            }
                                                            String[] var55 = var52.field3509;
                                                            int var56 = -1;
                                                            if (field771 && method1662()) {
                                                                var56 = var52.method4763();
                                                            }
                                                            if (class234.method2097(method50(var9))) {
                                                                for (int var57 = 4; var57 >= 3; var57--) {
                                                                    if (var56 != var57) {
                                                                        method1599(var9, var52, var47, var57, false);
                                                                    }
                                                                }
                                                            }
                                                            if (class234.method4636(method50(var9))) {
                                                                method3594(class240.field2986, class76.method3066(16748608) + var52.field3473, 38, var52.field3481, var47, var9.field2677);
                                                            }
                                                            if (class234.method2097(method50(var9))) {
                                                                for (int var58 = 2; var58 >= 0; var58--) {
                                                                    if (var56 != var58) {
                                                                        method1599(var9, var52, var47, var58, false);
                                                                    }
                                                                }
                                                                if (var56 >= 0) {
                                                                    method1599(var9, var52, var47, var56, true);
                                                                }
                                                            }
                                                            String[] var59 = var9.field2715;
                                                            if (var59 != null) {
                                                                for (int var60 = 4; var60 >= 0; var60--) {
                                                                    if (var59[var60] != null) {
                                                                        byte var61 = 0;
                                                                        if (var60 == 0) {
                                                                            var61 = 39;
                                                                        }
                                                                        if (var60 == 1) {
                                                                            var61 = 40;
                                                                        }
                                                                        if (var60 == 2) {
                                                                            var61 = 41;
                                                                        }
                                                                        if (var60 == 3) {
                                                                            var61 = 42;
                                                                        }
                                                                        if (var60 == 4) {
                                                                            var61 = 43;
                                                                        }
                                                                        method3594(var59[var60], class76.method3066(16748608) + var52.field3473, var61, var52.field3481, var47, var9.field2677);
                                                                    }
                                                                }
                                                            }
                                                            method3594(class240.field2987, class76.method3066(16748608) + var52.field3473, 1005, var52.field3481, var47, var9.field2677);
                                                        }
                                                    } else if (Statics.field132 != var9.field2677 || Statics.field477 != var47) {
                                                        method3594(class240.field2986, field779 + " " + class76.field1108 + " " + class76.method3066(16748608) + var52.field3473, 31, var52.field3481, var47, var9.field2677);
                                                    }
                                                }
                                            }
                                            var47++;
                                        }
                                    }
                                }
                                if (var9.field2642) {
                                    if (!field780) {
                                        for (int var62 = 9; var62 >= 5; var62--) {
                                            String var63;
                                            if (!class234.method3572(method50(var9), var62) && var9.field2744 == null) {
                                                var63 = null;
                                            } else if (var9.field2718 == null || var9.field2718.length <= var62 || var9.field2718[var62] == null || var9.field2718[var62].trim().length() == 0) {
                                                var63 = null;
                                            } else {
                                                var63 = var9.field2718[var62];
                                            }
                                            if (var63 != null) {
                                                method3594(var63, var9.field2755, 1007, var62 + 1, var9.field2644, var9.field2677);
                                            }
                                        }
                                        String var65 = method3989(var9);
                                        if (var65 != null) {
                                            method3594(var65, var9.field2755, 25, 0, var9.field2644, var9.field2677);
                                        }
                                        for (int var66 = 4; var66 >= 0; var66--) {
                                            String var67;
                                            if (!class234.method3572(method50(var9), var66) && var9.field2744 == null) {
                                                var67 = null;
                                            } else if (var9.field2718 == null || var9.field2718.length <= var66 || var9.field2718[var66] == null || var9.field2718[var66].trim().length() == 0) {
                                                var67 = null;
                                            } else {
                                                var67 = var9.field2718[var66];
                                            }
                                            if (var67 != null) {
                                                method3594(var67, var9.field2755, 57, var66 + 1, var9.field2644, var9.field2677);
                                            }
                                        }
                                        if (class234.method4910(method50(var9))) {
                                            method3594(class240.field2838, "", 30, 0, var9.field2644, var9.field2677);
                                        }
                                    } else if (class234.method3014(method50(var9)) && (Statics.field1017 & 0x20) == 32) {
                                        method3594(field873, field785 + " " + class76.field1108 + " " + var9.field2755, 58, 0, var9.field2644, var9.field2677);
                                    }
                                }
                            }
                        }
                        if (var9.field2642) {
                            boolean var69;
                            if (class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17) {
                                var69 = true;
                            } else {
                                var69 = false;
                            }
                            boolean var70 = false;
                            if ((class49.field464 == 1 || !Statics.field246 && class49.field464 == 4) && var69) {
                                var70 = true;
                            }
                            boolean var71 = false;
                            if ((class49.field472 == 1 || !Statics.field246 && class49.field472 == 4) && class49.field457 >= var14 && class49.field468 >= var15 && class49.field457 < var16 && class49.field468 < var17) {
                                var71 = true;
                            }
                            if (var71) {
                                method1041(var9, class49.field457 - var12, class49.field468 - var13);
                            }
                            if (var9.field2647 == 1400) {
                                Statics.field1979.method5641(var28, var29, var69 & var70, var69 & var71);
                            }
                            if (field796 != null && field796 != var9 && var69) {
                                int var72 = method50(var9);
                                boolean var73 = (var72 >> 20 & 0x1) != 0;
                                if (var73) {
                                    field800 = var9;
                                }
                            }
                            if (field797 == var9) {
                                field874 = true;
                                field802 = var12;
                                field803 = var13;
                            }
                            if (var9.field2724) {
                                if (var69 && field821 != 0 && var9.field2745 != null) {
                                    class58 var74 = new class58();
                                    var74.field552 = true;
                                    var74.field555 = var9;
                                    var74.field560 = field821;
                                    var74.field556 = var9.field2745;
                                    field822.method3773(var74);
                                }
                                if (field796 != null || Statics.field192 != null || field706) {
                                    var71 = false;
                                    var70 = false;
                                    var69 = false;
                                }
                                if (!var9.field2770 && var71) {
                                    var9.field2770 = true;
                                    if (var9.field2726 != null) {
                                        class58 var75 = new class58();
                                        var75.field552 = true;
                                        var75.field555 = var9;
                                        var75.field554 = class49.field457 - var12;
                                        var75.field560 = class49.field468 - var13;
                                        var75.field556 = var9.field2726;
                                        field822.method3773(var75);
                                    }
                                }
                                if (var9.field2770 && var70 && var9.field2702 != null) {
                                    class58 var76 = new class58();
                                    var76.field552 = true;
                                    var76.field555 = var9;
                                    var76.field554 = class49.field465 - var12;
                                    var76.field560 = class49.field458 - var13;
                                    var76.field556 = var9.field2702;
                                    field822.method3773(var76);
                                }
                                if (var9.field2770 && !var70) {
                                    var9.field2770 = false;
                                    if (var9.field2728 != null) {
                                        class58 var77 = new class58();
                                        var77.field552 = true;
                                        var77.field555 = var9;
                                        var77.field554 = class49.field465 - var12;
                                        var77.field560 = class49.field458 - var13;
                                        var77.field556 = var9.field2728;
                                        field824.method3773(var77);
                                    }
                                }
                                if (var70 && var9.field2729 != null) {
                                    class58 var78 = new class58();
                                    var78.field552 = true;
                                    var78.field555 = var9;
                                    var78.field554 = class49.field465 - var12;
                                    var78.field560 = class49.field458 - var13;
                                    var78.field556 = var9.field2729;
                                    field822.method3773(var78);
                                }
                                if (!var9.field2769 && var69) {
                                    var9.field2769 = true;
                                    if (var9.field2730 != null) {
                                        class58 var79 = new class58();
                                        var79.field552 = true;
                                        var79.field555 = var9;
                                        var79.field554 = class49.field465 - var12;
                                        var79.field560 = class49.field458 - var13;
                                        var79.field556 = var9.field2730;
                                        field822.method3773(var79);
                                    }
                                }
                                if (var9.field2769 && var69 && var9.field2731 != null) {
                                    class58 var80 = new class58();
                                    var80.field552 = true;
                                    var80.field555 = var9;
                                    var80.field554 = class49.field465 - var12;
                                    var80.field560 = class49.field458 - var13;
                                    var80.field556 = var9.field2731;
                                    field822.method3773(var80);
                                }
                                if (var9.field2769 && !var69) {
                                    var9.field2769 = false;
                                    if (var9.field2732 != null) {
                                        class58 var81 = new class58();
                                        var81.field552 = true;
                                        var81.field555 = var9;
                                        var81.field554 = class49.field465 - var12;
                                        var81.field560 = class49.field458 - var13;
                                        var81.field556 = var9.field2732;
                                        field824.method3773(var81);
                                    }
                                }
                                if (var9.field2727 != null) {
                                    class58 var82 = new class58();
                                    var82.field555 = var9;
                                    var82.field556 = var9.field2727;
                                    field823.method3773(var82);
                                }
                                if (var9.field2737 != null && field810 > var9.field2669) {
                                    if (var9.field2714 == null || field810 - var9.field2669 > 32) {
                                        class58 var87 = new class58();
                                        var87.field555 = var9;
                                        var87.field556 = var9.field2737;
                                        field822.method3773(var87);
                                    } else {
                                        label712: for (int var83 = var9.field2669; var83 < field810; var83++) {
                                            int var84 = field752[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2714.length; var85++) {
                                                if (var9.field2714[var85] == var84) {
                                                    class58 var86 = new class58();
                                                    var86.field555 = var9;
                                                    var86.field556 = var9.field2737;
                                                    field822.method3773(var86);
                                                    break label712;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2669 = field810;
                                }
                                if (var9.field2739 != null && field792 > var9.field2773) {
                                    if (var9.field2740 == null || field792 - var9.field2773 > 32) {
                                        class58 var92 = new class58();
                                        var92.field555 = var9;
                                        var92.field556 = var9.field2739;
                                        field822.method3773(var92);
                                    } else {
                                        label688: for (int var88 = var9.field2773; var88 < field792; var88++) {
                                            int var89 = field811[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2740.length; var90++) {
                                                if (var9.field2740[var90] == var89) {
                                                    class58 var91 = new class58();
                                                    var91.field555 = var9;
                                                    var91.field556 = var9.field2739;
                                                    field822.method3773(var91);
                                                    break label688;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2773 = field792;
                                }
                                if (var9.field2723 != null && field671 > var9.field2774) {
                                    if (var9.field2742 == null || field671 - var9.field2774 > 32) {
                                        class58 var97 = new class58();
                                        var97.field555 = var9;
                                        var97.field556 = var9.field2723;
                                        field822.method3773(var97);
                                    } else {
                                        label664: for (int var93 = var9.field2774; var93 < field671; var93++) {
                                            int var94 = field813[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2742.length; var95++) {
                                                if (var9.field2742[var95] == var94) {
                                                    class58 var96 = new class58();
                                                    var96.field555 = var9;
                                                    var96.field556 = var9.field2723;
                                                    field822.method3773(var96);
                                                    break label664;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2774 = field671;
                                }
                                if (field682 > var9.field2656 && var9.field2659 != null) {
                                    class58 var98 = new class58();
                                    var98.field555 = var9;
                                    var98.field556 = var9.field2659;
                                    field822.method3773(var98);
                                }
                                if (field816 > var9.field2656 && var9.field2748 != null) {
                                    class58 var99 = new class58();
                                    var99.field555 = var9;
                                    var99.field556 = var9.field2748;
                                    field822.method3773(var99);
                                }
                                if (field817 > var9.field2656 && var9.field2643 != null) {
                                    class58 var100 = new class58();
                                    var100.field555 = var9;
                                    var100.field556 = var9.field2643;
                                    field822.method3773(var100);
                                }
                                if (field657 > var9.field2656 && var9.field2678 != null) {
                                    class58 var101 = new class58();
                                    var101.field555 = var9;
                                    var101.field556 = var9.field2678;
                                    field822.method3773(var101);
                                }
                                if (field819 > var9.field2656 && var9.field2778 != null) {
                                    class58 var102 = new class58();
                                    var102.field555 = var9;
                                    var102.field556 = var9.field2778;
                                    field822.method3773(var102);
                                }
                                if (field799 > var9.field2656 && var9.field2681 != null) {
                                    class58 var103 = new class58();
                                    var103.field555 = var9;
                                    var103.field556 = var9.field2681;
                                    field822.method3773(var103);
                                }
                                var9.field2656 = field808;
                                if (var9.field2747 != null) {
                                    for (int var104 = 0; var104 < field713; var104++) {
                                        class58 var105 = new class58();
                                        var105.field555 = var9;
                                        var105.field558 = field846[var104];
                                        var105.field559 = field845[var104];
                                        var105.field556 = var9.field2747;
                                        field822.method3773(var105);
                                    }
                                }
                            }
                        }
                        if (!var9.field2642) {
                            if (field796 != null || Statics.field192 != null || field706) {
                                continue;
                            }
                            if ((var9.field2759 >= 0 || var9.field2670 != 0) && class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17) {
                                if (var9.field2759 >= 0) {
                                    Statics.field363 = arg0[var9.field2759];
                                } else {
                                    Statics.field363 = var9;
                                }
                            }
                            if (var9.field2645 == 8 && class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17) {
                                Statics.field144 = var9;
                            }
                            if (var9.field2667 > var9.field2768) {
                                method4124(var9, var9.field2654 + var12, var13, var9.field2768, var9.field2667, class49.field465, class49.field458);
                            }
                        }
                        if (var9.field2645 == 0) {
                            method1886(arg0, var9.field2677, var14, var15, var16, var17, var12 - var9.field2664, var13 - var9.field2749);
                            if (var9.field2691 != null) {
                                method1886(var9.field2691, var9.field2677, var14, var15, var16, var17, var12 - var9.field2664, var13 - var9.field2749);
                            }
                            class57 var106 = (class57) field786.method3734((long) var9.field2677);
                            if (var106 != null) {
                                if (var106.field545 == 0 && class49.field465 >= var14 && class49.field458 >= var15 && class49.field465 < var16 && class49.field458 < var17 && !field706) {
                                    for (class58 var107 = (class58) field822.method3799(); var107 != null; var107 = (class58) field822.method3780()) {
                                        if (var107.field552) {
                                            var107.method3766();
                                            var107.field555.field2769 = false;
                                        }
                                    }
                                    if (Statics.field2382 == 0) {
                                        field796 = null;
                                        field797 = null;
                                    }
                                    if (!field706) {
                                        method1897();
                                    }
                                }
                                int var108 = var106.field550;
                                if (class233.method3013(var108)) {
                                    method1886(Statics.field2639[var108], -1, var14, var15, var16, var17, var12, var13);
                                }
                            }
                        }
                    } else if ((field855 == 0 || field855 == 3) && !field706 && (class49.field472 == 1 || !Statics.field246 && class49.field472 == 4)) {
                        class227 var31 = var9.method4141(true);
                        if (var31 != null) {
                            int var32 = class49.field457 - var12;
                            int var33 = class49.field468 - var13;
                            if (var31.method4062(var32, var33)) {
                                int var34 = var32 - var31.field2600 / 2;
                                int var35 = var33 - var31.field2594 / 2;
                                int var36 = field695 & 0x7FF;
                                int var37 = class125.field1747[var36];
                                int var38 = class125.field1748[var36];
                                int var39 = var34 * var38 + var35 * var37 >> 11;
                                int var40 = var35 * var38 - var34 * var37 >> 11;
                                int var41 = Statics.field476.field951 + var39 >> 7;
                                int var42 = Statics.field476.field956 - var40 >> 7;
                                class175 var43 = class175.method3207(class172.field2222, field672.field1273);
                                var43.field2299.method3253(18);
                                var43.field2299.method3294(class40.field377[82] ? (class40.field377[81] ? 2 : 1) : 0);
                                var43.field2299.method3254(Statics.field2788 + var41);
                                var43.field2299.method3304(Statics.field599 + var42);
                                var43.field2299.method3253(var34);
                                var43.field2299.method3253(var35);
                                var43.field2299.method3254(field695);
                                var43.field2299.method3253(57);
                                var43.field2299.method3253(0);
                                var43.field2299.method3253(0);
                                var43.field2299.method3253(89);
                                var43.field2299.method3254(Statics.field476.field951);
                                var43.field2299.method3254(Statics.field476.field956);
                                var43.field2299.method3253(63);
                                field672.method1901(var43);
                                field853 = var41;
                                field638 = var42;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.jg([Lhv;II)V")
    public static final void method1698(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2645 == 0) {
                    if (var3.field2691 != null) {
                        method1698(var3.field2691, arg1);
                    }
                    class57 var4 = (class57) field786.method3734((long) var3.field2677);
                    if (var4 != null) {
                        int var5 = var4.field550;
                        if (class233.method3013(var5)) {
                            method1698(Statics.field2639[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2751 != null) {
                    class58 var6 = new class58();
                    var6.field555 = var3;
                    var6.field556 = var3.field2751;
                    class71.method109(var6);
                }
                if (arg1 == 1 && var3.field2648 != null) {
                    if (var3.field2644 >= 0) {
                        class233 var7 = class233.method457(var3.field2677);
                        if (var7 == null || var7.field2691 == null || var3.field2644 >= var7.field2691.length || var7.field2691[var3.field2644] != var3) {
                            continue;
                        }
                    }
                    class58 var8 = new class58();
                    var8.field555 = var3;
                    var8.field556 = var3.field2648;
                    class71.method109(var8);
                }
            }
        }
    }

    @ObfuscatedName("bo.jw(Lhv;III)V")
    public static final void method1041(class233 arg0, int arg1, int arg2) {
        if (field796 != null || field706 || arg0 == null) {
            return;
        }
        class233 var3 = method115(arg0);
        if (var3 == null) {
            var3 = arg0.field2719;
        }
        if (var3 == null) {
            return;
        }
        field796 = arg0;
        class233 var5 = method115(arg0);
        if (var5 == null) {
            var5 = arg0.field2719;
        }
        field797 = var5;
        field798 = arg1;
        field732 = arg2;
        Statics.field2382 = 0;
        field783 = false;
        int var7 = field762 - 1;
        if (var7 != -1) {
            Statics.field1902 = new class77();
            Statics.field1902.field1117 = field763[var7];
            Statics.field1902.field1116 = field764[var7];
            Statics.field1902.field1115 = field765[var7];
            Statics.field1902.field1114 = field841[var7];
            Statics.field1902.field1113 = field767[var7];
        }
        return;
    }

    @ObfuscatedName("client.jj(I)V")
    public final void method1355() {
        method266(field796);
        Statics.field2382++;
        if (field804 && field874) {
            int var1 = class49.field465;
            int var2 = class49.field458;
            int var3 = var1 - field798;
            int var4 = var2 - field732;
            if (var3 < field802) {
                var3 = field802;
            }
            if (field796.field2654 + var3 > field802 + field797.field2654) {
                var3 = field802 + field797.field2654 - field796.field2654;
            }
            if (var4 < field803) {
                var4 = field803;
            }
            if (field796.field2768 + var4 > field803 + field797.field2768) {
                var4 = field803 + field797.field2768 - field796.field2768;
            }
            int var5 = var3 - field805;
            int var6 = var4 - field689;
            int var7 = field796.field2721;
            if (Statics.field2382 > field796.field2717 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field783 = true;
            }
            int var8 = field797.field2664 + (var3 - field802);
            int var9 = field797.field2749 + (var4 - field803);
            if (field796.field2733 != null && field783) {
                class58 var10 = new class58();
                var10.field555 = field796;
                var10.field554 = var8;
                var10.field560 = var9;
                var10.field556 = field796.field2733;
                class71.method109(var10);
            }
            if (class49.field464 == 0) {
                if (field783) {
                    if (field796.field2734 != null) {
                        class58 var11 = new class58();
                        var11.field555 = field796;
                        var11.field554 = var8;
                        var11.field560 = var9;
                        var11.field557 = field800;
                        var11.field556 = field796.field2734;
                        class71.method109(var11);
                    }
                    if (field800 != null && method115(field796) != null) {
                        class175 var12 = class175.method3207(class172.field2193, field672.field1273);
                        var12.field2299.method3250(field800.field2677);
                        var12.field2299.method3304(field800.field2644);
                        var12.field2299.method3302(field800.field2764);
                        var12.field2299.method3304(field796.field2644);
                        var12.field2299.method3313(field796.field2677);
                        var12.field2299.method3304(field796.field2764);
                        field672.method1901(var12);
                    }
                } else if (this.method1120()) {
                    this.method1266(field805 + field798, field732 + field689);
                } else if (field762 > 0) {
                    int var13 = field805 + field798;
                    int var14 = field732 + field689;
                    method3171(Statics.field1902, var13, var14);
                    Statics.field1902 = null;
                }
                field796 = null;
            }
        } else if (Statics.field2382 > 1) {
            field796 = null;
        }
    }

    @ObfuscatedName("ai.jp(IB)V")
    public static void method603(int arg0) {
        Statics.field1902 = new class77();
        Statics.field1902.field1117 = field763[arg0];
        Statics.field1902.field1116 = field764[arg0];
        Statics.field1902.field1115 = field765[arg0];
        Statics.field1902.field1114 = field841[arg0];
        Statics.field1902.field1113 = field767[arg0];
    }

    @ObfuscatedName("w.ji(Lhv;I)V")
    public static void method266(class233 arg0) {
        if (field827 == arg0.field2776) {
            field842[arg0.field2775] = true;
        }
    }

    @ObfuscatedName("f.jn(I)V")
    public static void method145() {
        for (class57 var0 = (class57) field786.method3720(); var0 != null; var0 = (class57) field786.method3717()) {
            int var1 = var0.field550;
            if (class233.method3013(var1)) {
                boolean var2 = true;
                class233[] var3 = Statics.field2639[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2642;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2470;
                    class233 var6 = class233.method457(var5);
                    if (var6 != null) {
                        method266(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.jr(II)V")
    public static final void method1093(int arg0) {
        if (!class233.method3013(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2639[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2766 = 0;
                var3.field2767 = 0;
            }
        }
    }

    @ObfuscatedName("b.jk(II)V")
    public static final void method189(int arg0) {
        if (class233.method3013(arg0)) {
            method2579(Statics.field2639[arg0], -1);
        }
    }

    @ObfuscatedName("dl.jl([Lhv;II)V")
    public static final void method2579(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2662 == arg1) {
                if (var3.field2642) {
                    boolean var4 = var3.field2655;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2645 == 0) {
                    if (!var3.field2642) {
                        boolean var5 = var3.field2655;
                        if (var5 && Statics.field363 != var3) {
                            continue;
                        }
                    }
                    method2579(arg0, var3.field2677);
                    if (var3.field2691 != null) {
                        method2579(var3.field2691, var3.field2677);
                    }
                    class57 var6 = (class57) field786.method3734((long) var3.field2677);
                    if (var6 != null) {
                        method189(var6.field550);
                    }
                }
                if (var3.field2645 == 6) {
                    if (var3.field2690 != -1 || var3.field2673 != -1) {
                        boolean var7 = method910(var3);
                        int var8;
                        if (var7) {
                            var8 = var3.field2673;
                        } else {
                            var8 = var3.field2690;
                        }
                        if (var8 != -1) {
                            class276 var9 = class276.method3241(var8);
                            var3.field2767 += field687;
                            while (var3.field2767 > var9.field3586[var3.field2766]) {
                                var3.field2767 -= var9.field3586[var3.field2766];
                                var3.field2766++;
                                if (var3.field2766 >= var9.field3594.length) {
                                    var3.field2766 -= var9.field3592;
                                    if (var3.field2766 < 0 || var3.field2766 >= var9.field3594.length) {
                                        var3.field2766 = 0;
                                    }
                                }
                                method266(var3);
                            }
                        }
                    }
                    if (var3.field2699 != 0 && !var3.field2642) {
                        int var10 = var3.field2699 >> 16;
                        int var11 = var3.field2699 << 16 >> 16;
                        int var12 = field687 * var10;
                        int var13 = field687 * var11;
                        var3.field2694 = var3.field2694 + var12 & 0x7FF;
                        var3.field2695 = var3.field2695 + var13 & 0x7FF;
                        method266(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.jc(II)V")
    public static final void method918(int arg0) {
        method145();
        class70.method395();
        int var1 = Statics.method1600(arg0).field3280;
        if (var1 == 0) {
            return;
        }
        int var2 = class228.field2601[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class125.method2593(0.9D);
                ((class114) Statics.field1744).method2354(0.9D);
            }
            if (var2 == 2) {
                class125.method2593(0.8D);
                ((class114) Statics.field1744).method2354(0.8D);
            }
            if (var2 == 3) {
                class125.method2593(0.7D);
                ((class114) Statics.field1744).method2354(0.7D);
            }
            if (var2 == 4) {
                class125.method2593(0.6D);
                ((class114) Statics.field1744).method2354(0.6D);
            }
            Statics.method507();
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
            if (field714 != var3) {
                if (field714 == 0 && field857 != -1) {
                    class220.method447(Statics.field397, field857, 0, var3, false);
                    field858 = false;
                } else if (var3 == 0) {
                    Statics.field2509.method3901();
                    class220.field2510 = 1;
                    Statics.field2507 = null;
                    field858 = false;
                } else if (class220.field2510 == 0) {
                    Statics.field2509.method3976(var3);
                } else {
                    Statics.field1756 = var3;
                }
                field714 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field859 = 127;
            }
            if (var2 == 1) {
                field859 = 96;
            }
            if (var2 == 2) {
                field859 = 64;
            }
            if (var2 == 3) {
                field859 = 32;
            }
            if (var2 == 4) {
                field859 = 0;
            }
        }
        if (var1 == 5) {
            field870 = var2;
        }
        if (var1 == 6) {
            field787 = var2;
        }
        if (var1 == 9) {
            field788 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field649 = 127;
            }
            if (var2 == 1) {
                field649 = 96;
            }
            if (var2 == 2) {
                field649 = 64;
            }
            if (var2 == 3) {
                field649 = 32;
            }
            if (var2 == 4) {
                field649 = 0;
            }
        }
        if (var1 == 17) {
            field793 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class79[] var4 = new class79[] { class79.field1126, class79.field1125, class79.field1124, class79.field1123 };
            field653 = (class79) class180.method3179(var4, var2);
            if (field653 == null) {
                field653 = class79.field1126;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field635 = -1;
            } else {
                field635 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class79[] var5 = new class79[] { class79.field1126, class79.field1125, class79.field1124, class79.field1123 };
        field654 = (class79) class180.method3179(var5, var2);
        if (field654 == null) {
            field654 = class79.field1126;
        }
    }

    @ObfuscatedName("hb.ja(Lbm;ZB)V")
    public static final void method4130(class57 arg0, boolean arg1) {
        int var2 = arg0.field550;
        int var3 = (int) arg0.field2470;
        arg0.method3766();
        if (arg1) {
            class233.method2457(var2);
        }
        for (class214 var4 = (class214) field636.method3720(); var4 != null; var4 = (class214) field636.method3717()) {
            if ((long) var2 == (var4.field2470 >> 48 & 0xFFFFL)) {
                var4.method3766();
            }
        }
        class233 var5 = class233.method457(var3);
        if (var5 != null) {
            method266(var5);
        }
        method151();
        if (field668 != -1) {
            int var6 = field668;
            if (class233.method3013(var6)) {
                method1698(Statics.field2639[var6], 1);
            }
        }
    }

    @ObfuscatedName("ax.jy(Lhv;I)Z")
    public static final boolean method808(class233 arg0) {
        int var1 = arg0.field2647;
        if (var1 == 205) {
            field724 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field886.method4091(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field886.method4092(var4, var5 == 1);
        }
        if (var1 == 324) {
            field886.method4093(false);
        }
        if (var1 == 325) {
            field886.method4093(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method3207(class172.field2259, field672.field1273);
            field886.method4094(var6.field2299);
            field672.method1901(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bc.js(IIIILlu;Lhh;I)V")
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4223(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field695 & 0x7FF;
        int var8 = class125.field1747[var7];
        int var9 = class125.field1748[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2600 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field302.method5501(arg5.field2600 / 2 + arg0 - var17 / 2 + var15, arg5.field2594 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("im.jf(IIIILlu;Lhh;I)V")
    public static final void method4223(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field695 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1747[var6];
        int var9 = class125.field1748[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5483(arg5.field2600 / 2 + var10 - arg4.field3850 / 2, arg5.field2594 / 2 - var11 - arg4.field3854 / 2, arg0, arg1, arg5.field2600, arg5.field2594, arg5.field2596, arg5.field2595);
        } else {
            arg4.method5569(arg5.field2600 / 2 + arg0 + var10 - arg4.field3850 / 2, arg5.field2594 / 2 + arg1 - var11 - arg4.field3854 / 2);
        }
    }

    @ObfuscatedName("c.jo(I)V")
    public static final void method14() {
        for (int var0 = 0; var0 < class84.field1216; var0++) {
            class62 var1 = field888[class84.field1217[var0]];
            var1.method1053();
        }
        class86.method1672();
        if (Statics.field51 != null) {
            Statics.field51.method5120();
        }
    }

    @ObfuscatedName("v.jx(I)V")
    public static final void method104() {
        class86.method116();
        if (Statics.field51 != null) {
            Statics.field51.method5107();
        }
    }

    @ObfuscatedName("en.ju(B)V")
    public static final void method2879() {
        for (int var0 = 0; var0 < class84.field1216; var0++) {
            class62 var1 = field888[class84.field1217[var0]];
            var1.method1056();
        }
    }

    @ObfuscatedName("ex.jh(I)V")
    public static final void method2989() {
        field817 = field808;
        Statics.field1921 = true;
    }

    @ObfuscatedName("dj.jb(I)V")
    public static final void method2308() {
        class175 var0 = class175.method3207(class172.field2262, field672.field1273);
        var0.field2299.method3253(0);
        field672.method1901(var0);
    }

    @ObfuscatedName("i.jq(Lhv;I)I")
    public static int method50(class233 arg0) {
        class214 var1 = (class214) field636.method3734(((long) arg0.field2677 << 32) + (long) arg0.field2644);
        return var1 == null ? arg0.field2649 : var1.field2487;
    }

    @ObfuscatedName("q.jt(Lhv;I)Lhv;")
    public static class233 method115(class233 arg0) {
        int var1 = class234.method1639(method50(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method457(arg0.field2662);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("hu.je(Lhv;B)Ljava/lang/String;")
    public static String method3989(class233 arg0) {
        if (class234.method527(method50(arg0)) == 0) {
            return null;
        } else if (arg0.field2674 == null || arg0.field2674.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2674;
        }
    }

    @ObfuscatedName("fw.jd(Ljava/lang/String;B)V")
    public static void method3141(String arg0) {
        Statics.field311 = arg0;
        try {
            String var1 = Statics.field3162.getParameter(class282.field3632.field3638);
            String var2 = Statics.field3162.getParameter(class282.field3645.field3638);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class195.method848(class187.method1700() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class42.method649(Statics.field3162, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("cb.jz([BII)V")
    public static void method1768(byte[] arg0, int arg1) {
        if (field891 == null) {
            field891 = new byte[24];
        }
        class196.method3598(arg0, arg1, field891, 0, 24);
    }

    @ObfuscatedName("bm.kr(Lge;II)V")
    public static void method994(class185 arg0, int arg1) {
        method1768(arg0.field2373, arg1);
        if (class158.field2012 == null) {
            return;
        }
        try {
            class158.field2012.method2286(0L);
            class158.field2012.method2288(arg0.field2373, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("an.ky(Lge;B)V")
    public static void method439(class185 arg0) {
        if (field891 == null) {
            byte[] var1 = class158.method3161();
            arg0.method3263(var1, 0, var1.length);
        } else {
            arg0.method3263(field891, 0, field891.length);
        }
    }

    @ObfuscatedName("client.kh(I)Lkx;")
    public class294 method1125() {
        return Statics.field476 == null ? null : Statics.field476.field593;
    }

    @ObfuscatedName("bf.kk(IIIZI)V")
    public static void method1660(int arg0, int arg1, int arg2, boolean arg3) {
        class175 var4 = class175.method3207(class172.field2252, field672.field1273);
        var4.field2299.method3253(arg2);
        var4.field2299.method3313(arg3 ? field707 : 0);
        var4.field2299.method3254(arg0);
        var4.field2299.method3302(arg1);
        field672.method1901(var4);
    }

    @ObfuscatedName("ar.kz(I)Z")
    public static boolean method911() {
        return field761 >= 2;
    }

    @ObfuscatedName("ad.kj(B)V")
    public static void method460() {
        if (field700 == 1) {
            field708 = true;
        }
    }

    @ObfuscatedName("ew.kf(I)V")
    public static void method2950() {
        if (!field708 || Statics.field476 == null) {
            return;
        }
        int var0 = Statics.field476.field933[0];
        int var1 = Statics.field476.field974[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field533 = Statics.field476.field951;
        int var2 = method2350(Statics.field476.field951, Statics.field476.field956, Statics.field585) - field875;
        if (var2 < Statics.field3265) {
            Statics.field3265 = var2;
        }
        Statics.field3472 = Statics.field476.field956;
        field708 = false;
    }

    @ObfuscatedName("z.kv(I)V")
    public static void method178() {
        if (Statics.field2325 == null) {
            return;
        }
        field892 = field637;
        Statics.field2325.method4410();
        for (int var0 = 0; var0 < field888.length; var0++) {
            if (field888[var0] != null) {
                Statics.field2325.method4418((field888[var0].field951 >> 7) + Statics.field2788, (field888[var0].field956 >> 7) + Statics.field599);
            }
        }
    }
}
